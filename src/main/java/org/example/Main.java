package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main
{
    public static void main(String[] args) {
        /*int counter = 0;
        System.out.print("For 1: ");
        for (int i = 0; i < 10; i ++) {
            System.out.print(i + ", ");
        }

        System.out.println();

        System.out.print("For 2: ");
        int i = 1;
        for(;i <= 10;) {
            System.out.print(i + ", ");
            i ++;
        }
        System.out.println();

        System.out.print("While: ");
        int j = 0;
        while (j < 10) {
            System.out.print(j + ", ");
            j ++;
        }
        System.out.println();

        int m = 0;
        do {
            System.out.println(m + " Do while execution");
            m ++;
        } while (m > 10);

        // Foreach
        System.out.println("Foreach");
        List<String> list = Arrays.asList("Test 1", "Test 2" , "Test 3");
        int k = 1;
        for (String item : list) {
            System.out.println("Item " + k + ": " + item);
            k ++;
        }

        System.out.println("Foreach from list");

        list.forEach(item -> printArr(item));

       list.forEach(System.out::println);

        String testString = "ABCDEFG";
        char[] charsArr = testString.toCharArray();
        for (int f = 0; f < charsArr.length; f ++) { // <------ CONTINUE
            if (charsArr[f] == 'B' || charsArr[f] == 'D')
                continue; // ---> Next iteration
            System.out.println(charsArr[f]);
            if (charsArr[f] == 'E')
                break;
        }
        // <------ BREAK
        printArr(testString);
        String testString2 = "ABCDFGHL";
        printArr(testString2);
        System.out.println(counter);*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lines (Type `Quit` to quit enter mode):");
        int maxLines = 5;
        int linesCounter = 0;
        String[] lines = new String[maxLines];

        while (sc.hasNext()) {
            String line = sc.nextLine();
            if ("quit".equalsIgnoreCase(line))
                break;
            if ("skip".equalsIgnoreCase(line))
                continue;
            lines[linesCounter] = line;
            linesCounter ++;
            if (linesCounter == maxLines)
                break;
        }

        System.out.println(Arrays.asList(lines));
    }

    static private boolean printArr(String value) {
        char[] charsArr = value.toCharArray();
        for (int f = 0; f < charsArr.length; f ++) {
            if (charsArr[f] == 'B' || charsArr[f] == 'D')
                continue;
            System.out.println(charsArr[f]);
            if (charsArr[f] == 'E')
                break;
            if (charsArr[f] == 'G')
                return true;
        }
        // < --
        System.out.println("Exit of function");
        return false;
    } // < ---
}