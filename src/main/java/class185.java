import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class185 implements Runnable {

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "Leh;")
    public static class47 field3539 = class195.method1282((byte) -4, "Freie Welt");

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field3541 = 1;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "Leh;")
    public static class47 field3542 = class195.method1282((byte) -4, "Nehmen");

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "Z")
    public static boolean field3534 = false;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "Z")
    public static boolean field3544 = false;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public static int field3546 = 0;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field3537 = 0;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "Leh;")
    private static class47 field3543 = class195.method1282((byte) -4, "Connection timed out)3");

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "Leh;")
    public static class47 field3547 = field3543;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "[S")
    public static short[] field3536;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZLah;Lah;)V")
    public static final void method1226(boolean arg0, class9 arg1, class9 arg2) {
        class199.field3881 = arg2;
        if (arg0) {
            field3538++;
            class154.field3026 = arg1;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public static final void method1227(byte arg0) {
        field3545++;
        if (arg0 != -75 || class192.field3717 != null && class72.field1551 != null) {
            return;
        }
        class192.field3717 = new int[256];
        class72.field1551 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class192.field3717[var1] = (int) (Math.sin(var2) * 4096.0D);
            class72.field1551[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static void method1228(int arg0) {
        field3536 = null;
        if (arg0 != 0) {
            method1233(112, -83);
        }
        field3547 = null;
        field3542 = null;
        field3543 = null;
        field3539 = null;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V")
    public static final void method1229(byte arg0) {
        class22.field435 = true;
        class153.field3012 = 0;
        class16.field324.field819 = 0;
        class117.field2385 = 0L;
        class61.field1278 = true;
        field3530++;
        class68.field1489 = 0;
        class117.field2369 = 0;
        class68.field1466 = 0;
        field3533 = 0;
        class137.field2693 = 0;
        class194.field3789 = 0;
        class114.field2315 = 0;
        class105.field2199 = 0;
        class68.field1461 = 0;
        class133.field2620 = 0;
        class73.field1616 = 0;
        class153.field3004 = 0;
        class41.field818 = 0;
        class80.field1729 = 0;
        class126.field2518 = 0;
        class69.field1515 = 0;
        class96.field1992 = 0;
        class96.field1974 = 0;
        class18.field365 = 0;
        class6.field96 = 0;
        class203.field3992 = 0;
        class18.field364 = 0;
        class193.field3742 = 0;
        class182.field3482 = 0;
        class96.field2011 = 0;
        class37.field728 = 0;
        class106.field2217 = 0;
        class182.field3487 = 0;
        class47.field947 = 0;
        class126.field2528 = 0;
        class32.field626 = 0;
        class9.field207 = 0;
        class167.field3251 = 0;
        class9.field195 = 0;
        class206.field4047 = 0;
        class47.field954 = 0;
        class40.field782 = 0;
        class68.field1492 = 0;
        class64.field1402 = 0;
        class114.field2321 = 0;
        class51.field991 = 0;
        class135.field2652 = 0;
        class105.field2190 = 0;
        class41.field815 = 0;
        class105.field2204 = 0;
        class98.field2083 = 0;
        class92.field1922 = 0;
        class97.field2062 = 0;
        class56.field1104 = 0;
        class140.field2741 = 0;
        class183.field3509 = 0;
        class41.field816 = 0;
        class68.field1508 = 0;
        client.field549 = 0;
        class26.field494 = 0;
        class2.field12 = 0;
        class53.field1028 = 0;
        class9.field192 = 0;
        class198.field3869 = 0;
        class2.field7 = 0;
        class124.field2494 = 0;
        class75.field1634 = 0;
        class194.field3786 = 0;
        class36.field712 = 0;
        class108.field2248 = 0;
        class96.field2021 = 0;
        class181.field3477 = 0;
        class9.field173 = 0;
        class182.field3501 = 0;
        class97.field2069 = 0;
        class180.field3460 = 0;
        class79.field1700 = 0;
        class198.field3868 = 0;
        class204.field4023 = 0;
        client.field545 = 0;
        class135.field2657 = 0;
        class96.field1990 = 0;
        class176.field3373 = 0;
        class140.field2739 = 0;
        class47.field971 = 0;
        class178.field3409 = 0;
        class73.field1562 = 0;
        class177.field3382 = 0;
        class173.field3346 = 0;
        class136.field2671 = 0;
        class189.field3671 = 0;
        class133.field2633 = 0;
        class151.field2953 = 0;
        class27.field519 = 0;
        field3535 = 0;
        class131.field2591 = 0;
        class116.field2363 = 0;
        class5.field73 = 0;
        class125.field2510 = 0;
        class40.field784 = 0;
        class21.field394 = 0;
        class96.field2004 = 0;
        class47.field965 = 0;
        class31.field585 = 0;
        class40.field789 = 0;
        class79.field1697 = 0;
        class69.field1523 = 0;
        class40.field781 = 0;
        class76.field1650 = 0;
        class56.field1105 = 0;
        class167.field3256 = 0;
        class105.field2189 = 0;
        class14.field293 = 0;
        class192.field3731 = 0;
        class3.field35 = 0;
        class160.field3115 = 0;
        class84.field1783 = 0;
        class177.field3383 = 0;
        class52.field1000 = 0;
        class37.field736 = 0;
        class9.field194 = 0;
        class18.field361 = 0;
        class176.field3379 = 0;
        class47.field927 = 0;
        class202.field3961 = 0;
        class177.field3396 = 0;
        class202.field3959 = 0;
        class74.field1619 = 0;
        class5.field82 = 0;
        class14.field300 = 0;
        class98.field2080 = 0;
        class166.field3216 = 0;
        class92.field1926 = 0;
        class56.field1076 = 0;
        class54.field1040 = 0;
        class119.field2407 = 0;
        class159.field3092 = 0;
        class62.field1337 = 0;
        class68.field1451 = 0;
        class99.field2100 = 0;
        class68.field1501 = 0;
        class96.field1976 = 0;
        class132.field2602 = 0;
        class116.field2354 = 0;
        class160.field3103 = 0;
        class122.field2466 = 0;
        class91.field1913 = 0;
        class34.field660 = 0;
        class191.field3698 = 0;
        class61.field1282 = 0;
        class64.field1398 = 0;
        class155.field3041 = 0;
        class173.field3342 = 0;
        class9.field181 = 0;
        class204.field4021 = 0;
        class114.field2340 = 0;
        class83.field1771 = 0;
        class103.field2159 = 0;
        class142.field2780 = 0;
        class154.field3018 = 0;
        class18.field357 = 0;
        class154.field3023 = 0;
        class68.field1482 = 0;
        class61.field1305 = 0;
        class2.field15 = 0;
        class61.field1304 = 0;
        class114.field2325 = 0;
        class96.field1996 = 0;
        class130.field2581 = 0;
        class199.field3893 = 0;
        class62.field1330 = 0;
        class151.field2954 = 0;
        class16.field321 = 0;
        class154.field3013 = 0;
        class135.field2654 = 0;
        class26.field509 = 0;
        class52.field1021 = 0;
        class131.field2590 = 0;
        class204.field4007 = 0;
        class167.field3247 = 0;
        class137.field2689 = 0;
        class41.field810 = 0;
        class77.field1682 = 0;
        class55.field1062 = 0;
        class12.field234 = 0;
        class60.field1149 = 0;
        class194.field3776 = 0;
        class160.field3102 = 0;
        class61.field1295 = 0;
        class35.field673 = 0;
        class179.field3423 = 0;
        class68.field1472 = 0;
        class121.field2443 = 0;
        class177.field3381 = 0;
        class87.field1865 = 0;
        class27.field526 = 0;
        class127.field2540 = 0;
        class148.field2910 = 0;
        class14.field297 = 0;
        class199.field3877 = 0;
        class194.field3769 = 0;
        class121.field2445 = 0;
        class23.field460 = 0;
        class37.field726 = 0;
        class9.field185 = 0;
        class39.field761 = 0;
        class73.field1566 = 0;
        class202.field3968 = 0;
        class105.field2193 = 0;
        class70.field1536 = 0;
        class170.field3309 = 0;
        class96.field1984 = 0;
        class2.field17 = 0;
        class194.field3763 = 0;
        class53.field1029 = 0;
        class9.field178 = 0;
        class133.field2610 = 0;
        class68.field1459 = 0;
        class40.field793 = 0;
        class56.field1086 = 0;
        class47.field929 = 0;
        class138.field2700 = 0;
        class40.field783 = 0;
        class154.field3020 = 0;
        class110.field2285 = 0;
        class182.field3500 = 0;
        class92.field1921 = 0;
        class110.field2281 = 0;
        class54.field1050 = 0;
        class103.field2158 = 0;
        class187.field3603 = 0;
        class97.field2051 = 0;
        class194.field3774 = 0;
        class56.field1089 = 0;
        class68.field1491 = 0;
        class159.field3086 = 0;
        class68.field1462 = 0;
        class167.field3246 = 0;
        field3538 = 0;
        class33.field646 = 0;
        class107.field2233 = 0;
        class179.field3437 = 0;
        class138.field2707 = 0;
        class187.field3606 = 0;
        class91.field1903 = 0;
        class5.field77 = 0;
        class47.field925 = 0;
        class47.field966 = 0;
        class77.field1673 = 0;
        client.field543 = 0;
        class194.field3785 = 0;
        class76.field1658 = 0;
        class109.field2261 = 0;
        class22.field431 = 0;
        class124.field2496 = 0;
        class47.field939 = 0;
        class23.field454 = 0;
        class20.field388 = 0;
        class182.field3488 = 0;
        class69.field1526 = 0;
        class177.field3384 = 0;
        class9.field209 = 0;
        class156.field3056 = 0;
        class60.field1156 = 0;
        class187.field3604 = 0;
        class138.field2701 = 0;
        class114.field2333 = 0;
        class14.field294 = 0;
        class121.field2451 = 0;
        class3.field34 = 0;
        class148.field2895 = 0;
        class96.field1982 = 0;
        class82.field1764 = 0;
        class167.field3234 = 0;
        class68.field1485 = 0;
        class96.field2018 = 0;
        class174.field3365 = 0;
        class16.field323 = 0;
        class159.field3097 = 0;
        class68.field1471 = 0;
        class68.field1467 = 0;
        class197.field3842 = 0;
        class132.field2603 = 0;
        class47.field943 = 0;
        class69.field1529 = 0;
        class194.field3784 = 0;
        class167.field3248 = 0;
        class167.field3232 = 0;
        client.field536 = 0;
        class37.field730 = 0;
        class22.field427 = 0;
        class199.field3886 = 0;
        class96.field1981 = 0;
        class75.field1637 = 0;
        class9.field180 = 0;
        class159.field3084 = 0;
        class194.field3758 = 0;
        class122.field2456 = 0;
        class122.field2473 = 0;
        class16.field322 = 0;
        class158.field3076 = 0;
        class68.field1469 = 0;
        class77.field1674 = 0;
        class167.field3257 = 0;
        class2.field16 = 0;
        class68.field1475 = 0;
        class114.field2323 = 0;
        class191.field3700 = 0;
        class56.field1087 = 0;
        class153.field3009 = 0;
        class117.field2377 = 0;
        class54.field1048 = 0;
        class161.field3131 = 0;
        class96.field2026 = 0;
        class166.field3230 = 0;
        class61.field1260 = 0;
        class90.field1886 = 0;
        class202.field3922 = 0;
        class80.field1728 = 0;
        class179.field3428 = 0;
        class96.field2033 = 0;
        class82.field1757 = 0;
        class192.field3728 = 0;
        class75.field1631 = 0;
        class68.field1481 = 0;
        class194.field3762 = 0;
        class161.field3132 = 0;
        class122.field2469 = 0;
        class158.field3069 = 0;
        class202.field3976 = 0;
        class165.field3211 = 0;
        class64.field1403 = 0;
        class120.field2423 = 0;
        class68.field1453 = 0;
        class159.field3081 = 0;
        class130.field2564 = 0;
        class165.field3197 = 0;
        class115.field2352 = 0;
        class61.field1181 = 0;
        class47.field963 = 0;
        class95.field1956 = 0;
        class82.field1765 = 0;
        class174.field3360 = 0;
        class68.field1457 = 0;
        class144.field2830 = 0;
        class183.field3514 = 0;
        class178.field3401 = 0;
        class133.field2641 = 0;
        class155.field3035 = 0;
        class148.field2903 = 0;
        class205.field4030 = 0;
        class187.field3610 = 0;
        class81.field1744 = 0;
        class37.field717 = 0;
        class191.field3693 = 0;
        class84.field1779 = 0;
        class116.field2360 = 0;
        class52.field1017 = 0;
        field3531 = 0;
        class26.field515 = 0;
        class140.field2734 = 0;
        class35.field681 = 0;
        class69.field1513 = 0;
        class190.field3681 = 0;
        class165.field3209 = 0;
        class103.field2172 = 0;
        class119.field2405 = 0;
        class205.field4036 = 0;
        class79.field1717 = 0;
        class181.field3470 = 0;
        class144.field2832 = 0;
        class9.field187 = 0;
        class96.field2020 = 0;
        class124.field2502 = 0;
        class161.field3138 = 0;
        class35.field675 = 0;
        class68.field1498 = 0;
        class170.field3288 = 0;
        class2.field18 = 0;
        class136.field2674 = 0;
        class170.field3297 = 0;
        class90.field1897 = 0;
        class198.field3857 = 0;
        class95.field1970 = 0;
        class159.field3082 = 0;
        class137.field2691 = 0;
        class105.field2201 = 0;
        class196.field3807 = 0;
        class47.field955 = 0;
        class146.field2852 = 0;
        class173.field3356 = 0;
        class83.field1773 = 0;
        class18.field356 = 0;
        class188.field3646 = 0;
        class36.field702 = 0;
        class91.field1901 = 0;
        class188.field3621 = 0;
        class180.field3441 = 0;
        class47.field942 = 0;
        class96.field2001 = 0;
        client.field535 = 0;
        class68.field1480 = 0;
        class173.field3357 = 0;
        class23.field444 = 0;
        class40.field801 = 0;
        class96.field2003 = 0;
        class91.field1900 = 0;
        class116.field2359 = 0;
        class136.field2665 = 0;
        class105.field2200 = 0;
        class180.field3449 = 0;
        class194.field3768 = 0;
        class148.field2905 = 0;
        class23.field456 = 0;
        class47.field941 = 0;
        class203.field3989 = 0;
        class114.field2312 = 0;
        field3530 = 0;
        class198.field3855 = 0;
        class118.field2399 = 0;
        class39.field754 = 0;
        class140.field2731 = 0;
        class86.field1850 = 0;
        class73.field1556 = 0;
        class114.field2322 = 0;
        class6.field93 = 0;
        class194.field3783 = 0;
        class67.field1444 = 0;
        class32.field603 = 0;
        class136.field2669 = 0;
        class96.field2015 = 0;
        class174.field3364 = 0;
        class122.field2470 = 0;
        class115.field2351 = 0;
        class35.field678 = 0;
        class109.field2255 = 0;
        class72.field1555 = 0;
        class197.field3840 = 0;
        class40.field799 = 0;
        class68.field1499 = 0;
        class193.field3751 = 0;
        class121.field2446 = 0;
        class96.field2002 = 0;
        class162.field3157 = 0;
        class68.field1468 = 0;
        class68.field1458 = 0;
        class9.field182 = 0;
        class74.field1621 = 0;
        class79.field1712 = 0;
        class194.field3771 = 0;
        class194.field3773 = 0;
        class47.field962 = 0;
        class81.field1753 = 0;
        class155.field3033 = 0;
        class198.field3862 = 0;
        class116.field2355 = 0;
        class73.field1606 = 0;
        class126.field2527 = 0;
        class57.field1132 = 0;
        class114.field2326 = 0;
        class96.field1986 = 0;
        class96.field2029 = 0;
        class57.field1123 = 0;
        class195.field3800 = 0;
        class96.field2006 = 0;
        class152.field2965 = 0;
        class22.field439 = 0;
        class9.field184 = 0;
        class135.field2659 = 0;
        class105.field2187 = 0;
        class74.field1625 = 0;
        class143.field2814 = 0;
        class197.field3835 = 0;
        class181.field3476 = 0;
        class37.field737 = 0;
        class122.field2455 = 0;
        class94.field1939 = 0;
        class96.field2012 = 0;
        class180.field3445 = 0;
        class194.field3761 = 0;
        class47.field970 = 0;
        class68.field1509 = 0;
        class192.field3725 = 0;
        class200.field3902 = 0;
        class205.field4043 = 0;
        class105.field2208 = 0;
        class203.field3988 = 0;
        class47.field952 = 0;
        class187.field3611 = 0;
        class119.field2403 = 0;
        class130.field2574 = 0;
        class76.field1643 = 0;
        class106.field2212 = 0;
        class179.field3429 = 0;
        class87.field1869 = 0;
        class190.field3676 = 0;
        class47.field957 = 0;
        class88.field1882 = 0;
        class167.field3243 = 0;
        class98.field2077 = 0;
        class98.field2076 = 0;
        class99.field2095 = 0;
        class118.field2392 = 0;
        class155.field3030 = 0;
        class163.field3177 = 0;
        class165.field3207 = 0;
        class152.field3002 = 0;
        class136.field2662 = 0;
        class124.field2499 = 0;
        class165.field3213 = 0;
        class180.field3444 = 0;
        class83.field1777 = 0;
        class121.field2454 = 0;
        client.field546 = 0;
        class206.field4052 = 0;
        class146.field2843 = 0;
        class91.field1917 = 0;
        class96.field1977 = 0;
        class106.field2221 = 0;
        class109.field2259 = 0;
        class5.field79 = 0;
        class68.field1473 = 0;
        class118.field2397 = 0;
        class94.field1943 = 0;
        class139.field2730 = 0;
        class68.field1488 = 0;
        class37.field724 = 0;
        class115.field2348 = 0;
        class47.field945 = 0;
        class194.field3781 = 0;
        class148.field2904 = 0;
        class193.field3748 = 0;
        class76.field1653 = 0;
        class91.field1902 = 0;
        class27.field517 = 0;
        class138.field2712 = 0;
        class9.field191 = 0;
        class204.field4027 = 0;
        class126.field2516 = 0;
        class161.field3125 = 0;
        class87.field1861 = 0;
        class34.field659 = 0;
        class37.field715 = 0;
        class18.field363 = 0;
        class151.field2951 = 0;
        class63.field1343 = 0;
        class68.field1505 = 0;
        client.field541 = 0;
        class204.field4009 = 0;
        class5.field90 = 0;
        class68.field1465 = 0;
        class191.field3708 = 0;
        class76.field1646 = 0;
        class163.field3169 = 0;
        class52.field998 = 0;
        class85.field1810 = 0;
        class162.field3151 = 0;
        class73.field1614 = 0;
        class146.field2873 = 0;
        class9.field172 = 0;
        class148.field2891 = 0;
        class195.field3799 = 0;
        class192.field3723 = 0;
        class76.field1647 = 0;
        class141.field2767 = 0;
        class108.field2239 = 0;
        class98.field2071 = 0;
        class47.field933 = 0;
        class94.field1944 = 0;
        class144.field2829 = 0;
        class55.field1059 = 0;
        class53.field1030 = 0;
        class34.field650 = 0;
        class73.field1594 = 0;
        class79.field1709 = 0;
        class148.field2912 = 0;
        class103.field2170 = 0;
        class117.field2373 = 0;
        class12.field236 = 0;
        class34.field666 = 0;
        class9.field189 = 0;
        class9.field198 = 0;
        class47.field934 = 0;
        class110.field2282 = 0;
        class78.field1686 = 0;
        class68.field1455 = 0;
        class86.field1825 = 0;
        class36.field694 = 0;
        class87.field1867 = 0;
        class75.field1639 = 0;
        class198.field3867 = 0;
        class194.field3778 = 0;
        class149.field2926 = 0;
        class192.field3727 = 0;
        class54.field1042 = 0;
        class202.field3929 = 0;
        class79.field1722 = 0;
        class204.field4019 = 0;
        class162.field3168 = 0;
        class114.field2330 = 0;
        class159.field3098 = 0;
        class103.field2168 = 0;
        class75.field1635 = 0;
        class90.field1895 = 0;
        class87.field1863 = 0;
        class155.field3029 = 0;
        class141.field2770 = 0;
        class20.field386 = 0;
        class130.field2555 = 0;
        class47.field924 = 0;
        client.field540 = 0;
        class160.field3106 = 0;
        class59.field1146 = 0;
        class165.field3204 = 0;
        class131.field2593 = 0;
        class75.field1638 = 0;
        class178.field3412 = 0;
        class179.field3440 = 0;
        class96.field2028 = 0;
        class194.field3754 = 0;
        class22.field422 = 0;
        class96.field2008 = 0;
        class68.field1477 = 0;
        class56.field1079 = 0;
        class154.field3016 = 0;
        class178.field3414 = 0;
        class133.field2636 = 0;
        class67.field1429 = 0;
        class34.field672 = 0;
        class105.field2206 = 0;
        class9.field212 = 0;
        class131.field2595 = 0;
        class205.field4032 = 0;
        class40.field788 = 0;
        class40.field802 = 0;
        class92.field1927 = 0;
        class40.field779 = 0;
        class195.field3791 = 0;
        class197.field3838 = 0;
        class33.field647 = 0;
        class99.field2093 = 0;
        client.field534 = 0;
        class191.field3699 = 0;
        class68.field1504 = 0;
        class37.field744 = 0;
        class35.field684 = 0;
        class131.field2596 = 0;
        class6.field105 = 0;
        class68.field1464 = 0;
        class186.field3578 = 0;
        class124.field2500 = 0;
        class119.field2404 = 0;
        class114.field2327 = 0;
        class167.field3252 = 0;
        class206.field4045 = 0;
        class154.field3022 = 0;
        class92.field1920 = 0;
        class165.field3208 = 0;
        class68.field1486 = 0;
        class61.field1222 = 0;
        class87.field1864 = 0;
        class124.field2497 = 0;
        class67.field1448 = 0;
        class40.field792 = 0;
        class61.field1243 = 0;
        class12.field239 = 0;
        class61.field1306 = 0;
        class61.field1319 = 0;
        class73.field1585 = 0;
        if (arg0 != -12) {
            method1227((byte) -6);
        }
        class68.field1494 = 0;
        class195.field3801 = 0;
        class140.field2749 = 0;
        class85.field1803 = 0;
        class105.field2185 = 0;
        class79.field1711 = 0;
        class57.field1126 = 0;
        class108.field2244 = 0;
        class34.field669 = 0;
        class27.field528 = 0;
        class146.field2850 = 0;
        class87.field1855 = 0;
        class184.field3519 = 0;
        class22.field428 = 0;
        class130.field2552 = 0;
        class137.field2681 = 0;
        class198.field3860 = 0;
        class148.field2914 = 0;
        class47.field931 = 0;
        class114.field2324 = 0;
        class103.field2169 = 0;
        class100.field2104 = 0;
        class47.field930 = 0;
        class47.field972 = 0;
        class133.field2627 = 0;
        class70.field1540 = 0;
        class68.field1456 = 0;
        class140.field2737 = 0;
        class144.field2837 = 0;
        class32.field615 = 0;
        class56.field1097 = 0;
        class68.field1502 = 0;
        class182.field3494 = 0;
        class120.field2427 = 0;
        class23.field452 = 0;
        class143.field2812 = 0;
        class68.field1510 = 0;
        class40.field777 = 0;
        class39.field759 = 0;
        class204.field4026 = 0;
        class84.field1780 = 0;
        class37.field722 = 0;
        class96.field2030 = 0;
        class72.field1546 = 0;
        class91.field1919 = 0;
        class96.field2013 = 0;
        class14.field295 = 0;
        class96.field1999 = 0;
        class99.field2092 = 0;
        class179.field3433 = 0;
        class57.field1120 = 0;
        class56.field1102 = 0;
        class167.field3261 = 0;
        class201.field3915 = 0;
        class159.field3100 = 0;
        class8.field158 = 0;
        class73.field1560 = 0;
        class173.field3344 = 0;
        class167.field3254 = 0;
        class23.field459 = 0;
        class25.field479 = 0;
        class21.field400 = 0;
        class137.field2690 = 0;
        class86.field1837 = 0;
        class40.field797 = 0;
        class47.field969 = 0;
        class103.field2160 = 0;
        class39.field766 = 0;
        class109.field2264 = 0;
        class67.field1434 = 0;
        class170.field3277 = 0;
        class204.field4002 = 0;
        class52.field1019 = 0;
        class156.field3055 = 0;
        class52.field1022 = 0;
        class95.field1966 = 0;
        class68.field1487 = 0;
        class136.field2670 = 0;
        class47.field932 = 0;
        class91.field1904 = 0;
        class61.field1309 = 0;
        class91.field1911 = 0;
        class131.field2599 = 0;
        class52.field1025 = 0;
        class81.field1738 = 0;
        class87.field1858 = 0;
        class96.field1995 = 0;
        class100.field2101 = 0;
        class8.field159 = 0;
        class204.field4020 = 0;
        class143.field2811 = 0;
        class198.field3859 = 0;
        class120.field2425 = 0;
        class166.field3227 = 0;
        class96.field2009 = 0;
        class194.field3770 = 0;
        class25.field475 = 0;
        class138.field2696 = 0;
        class151.field2957 = 0;
        class184.field3517 = 0;
        class140.field2753 = 0;
        class114.field2317 = 0;
        class142.field2795 = 0;
        class141.field2769 = 0;
        class202.field3938 = 0;
        class155.field3045 = 0;
        class105.field2202 = 0;
        class52.field1003 = 0;
        class55.field1060 = 0;
        class161.field3122 = 0;
        class26.field498 = 0;
        class39.field757 = 0;
        class162.field3166 = 0;
        class203.field3994 = 0;
        class133.field2643 = 0;
        class96.field2027 = 0;
        class194.field3767 = 0;
        class103.field2165 = 0;
        class32.field622 = 0;
        class138.field2704 = 0;
        class47.field928 = 0;
        class77.field1677 = 0;
        class95.field1962 = 0;
        class34.field658 = 0;
        class55.field1061 = 0;
        class177.field3387 = 0;
        class149.field2920 = 0;
        class121.field2450 = 0;
        class97.field2055 = 0;
        class92.field1929 = 0;
        class47.field961 = 0;
        class68.field1484 = 0;
        class180.field3458 = 0;
        class9.field186 = 0;
        class148.field2894 = 0;
        class194.field3757 = 0;
        class190.field3679 = 0;
        class6.field101 = 0;
        class121.field2452 = 0;
        class47.field937 = 0;
        class144.field2831 = 0;
        class170.field3334 = 0;
        class182.field3486 = 0;
        class114.field2313 = 0;
        class35.field677 = 0;
        class56.field1080 = 0;
        class69.field1512 = 0;
        class198.field3865 = 0;
        class137.field2687 = 0;
        class5.field80 = 0;
        class24.field472 = 0;
        class97.field2063 = 0;
        class167.field3236 = 0;
        class161.field3120 = 0;
        class148.field2902 = 0;
        class196.field3821 = 0;
        class47.field959 = 0;
        class177.field3394 = 0;
        class109.field2253 = 0;
        class108.field2242 = 0;
        class196.field3825 = 0;
        class136.field2661 = 0;
        class34.field665 = 0;
        class177.field3385 = 0;
        class139.field2729 = 0;
        class130.field2560 = 0;
        class106.field2214 = 0;
        class68.field1470 = 0;
        class81.field1739 = 0;
        class52.field1024 = 0;
        class194.field3788 = 0;
        class22.field429 = 0;
        class23.field451 = 0;
        class61.field1244 = 0;
        class47.field974 = 0;
        class56.field1082 = 0;
        class154.field3017 = 0;
        class44.field890 = 0;
        class77.field1664 = 0;
        client.field539 = 0;
        class146.field2857 = 0;
        class148.field2898 = 0;
        class22.field437 = 0;
        class126.field2523 = 0;
        class198.field3854 = 0;
        class22.field438 = 0;
        class177.field3389 = 0;
        class9.field197 = 0;
        class33.field641 = 0;
        class26.field505 = 0;
        class9.field168 = 0;
        class68.field1450 = 0;
        class56.field1093 = 0;
        class84.field1785 = 0;
        class26.field503 = 0;
        class155.field3036 = 0;
        class178.field3398 = 0;
        class68.field1474 = 0;
        class27.field522 = 0;
        class108.field2238 = 0;
        class123.field2482 = 0;
        class138.field2705 = 0;
        class51.field990 = 0;
        class109.field2263 = 0;
        class26.field502 = 0;
        class39.field769 = 0;
        class163.field3179 = 0;
        class182.field3498 = 0;
        class77.field1667 = 0;
        class3.field42 = 0;
        class27.field527 = 0;
        class133.field2624 = 0;
        class63.field1350 = 0;
        class14.field296 = 0;
        class179.field3439 = 0;
        class52.field1015 = 0;
        class144.field2823 = 0;
        class186.field3577 = 0;
        class84.field1789 = 0;
        class114.field2318 = 0;
        class95.field1963 = 0;
        class151.field2956 = 0;
        class194.field3772 = 0;
        class54.field1045 = 0;
        class125.field2511 = 0;
        class34.field653 = 0;
        class36.field705 = 0;
        class5.field74 = 0;
        class180.field3457 = 0;
        class20.field389 = 0;
        class120.field2424 = 0;
        class47.field944 = 0;
        class162.field3152 = 0;
        class144.field2839 = 0;
        class56.field1083 = 0;
        class87.field1870 = 0;
        class76.field1645 = 0;
        class81.field1746 = 0;
        class202.field3933 = 0;
        class47.field956 = 0;
        class35.field683 = 0;
        class55.field1053 = 0;
        class12.field247 = 0;
        class3.field43 = 0;
        class37.field723 = 0;
        class194.field3765 = 0;
        client.field538 = 0;
        class191.field3702 = 0;
        class73.field1603 = 0;
        class182.field3505 = 0;
        class47.field953 = 0;
        class96.field1975 = 0;
        class103.field2157 = 0;
        class73.field1612 = 0;
        class87.field1860 = 0;
        class37.field738 = 0;
        class87.field1854 = 0;
        class97.field2058 = 0;
        class109.field2262 = 0;
        class138.field2709 = 0;
        class191.field3688 = 0;
        class2.field8 = 0;
        class96.field1978 = 0;
        class105.field2180 = 0;
        class47.field968 = 0;
        class99.field2091 = 0;
        class182.field3507 = 0;
        class138.field2706 = 0;
        class47.field948 = 0;
        class68.field1476 = 0;
        class155.field3043 = 0;
        client.field547 = 0;
        class9.field203 = 0;
        class139.field2727 = 0;
        class105.field2203 = 0;
        class110.field2279 = 0;
        class191.field3714 = 0;
        class170.field3302 = 0;
        class97.field2053 = 0;
        class96.field1985 = 0;
        class167.field3240 = 0;
        class186.field3553 = 0;
        class90.field1889 = 0;
        class110.field2277 = 0;
        class198.field3861 = 0;
        class31.field594 = 0;
        class117.field2381 = 0;
        class153.field3005 = 0;
        class197.field3836 = 0;
        class6.field99 = 0;
        class194.field3775 = 0;
        class122.field2474 = 0;
        class75.field1640 = 0;
        class79.field1705 = 0;
        class68.field1497 = 0;
        class131.field2587 = 0;
        class202.field3953 = 0;
        class51.field994 = 0;
        class105.field2195 = 0;
        class52.field1004 = 0;
        class62.field1339 = 0;
        class202.field3940 = 0;
        class2.field22 = 0;
        field3545 = 0;
        class103.field2167 = 0;
        class196.field3818 = 0;
        class21.field395 = 0;
        class139.field2719 = 0;
        class191.field3710 = 0;
        class37.field739 = 0;
        class23.field449 = 0;
        class25.field485 = 0;
        class204.field4015 = 0;
        class32.field620 = 0;
        class173.field3349 = 0;
        class73.field1583 = 0;
        class182.field3502 = 0;
        class25.field490 = 0;
        class202.field3975 = 0;
        class69.field1521 = 0;
        class40.field785 = 0;
        class161.field3139 = 0;
        class137.field2684 = 0;
        class146.field2844 = 0;
        class205.field4033 = 0;
        class12.field235 = 0;
        class167.field3245 = 0;
        class73.field1578 = 0;
        class12.field231 = 0;
        class79.field1718 = 0;
        class9.field193 = 0;
        class97.field2050 = 0;
        class67.field1430 = 0;
        class131.field2598 = 0;
        class99.field2098 = 0;
        class194.field3779 = 0;
        class61.field1196 = 0;
        class62.field1336 = 0;
        class119.field2402 = 0;
        class37.field720 = 0;
        class205.field4037 = 0;
        class73.field1573 = 0;
        class194.field3755 = 0;
        class85.field1808 = 0;
        class170.field3318 = 0;
        class27.field523 = 0;
        class27.field525 = 0;
        class19.field374 = 0;
        class194.field3756 = 0;
        class137.field2692 = 0;
        class205.field4034 = 0;
        class87.field1859 = 0;
        class22.field417 = 0;
        class77.field1671 = 0;
        class174.field3362 = 0;
        class126.field2529 = 0;
        class86.field1818 = 0;
        class170.field3278 = 0;
        class69.field1532 = 0;
        class91.field1910 = 0;
        class47.field938 = 0;
        class202.field3957 = 0;
        class204.field4005 = 0;
        class114.field2332 = 0;
        class47.field951 = 0;
        class32.field629 = 0;
        class91.field1907 = 0;
        class51.field989 = 0;
        class61.field1322 = 0;
        field3540 = 0;
        class69.field1522 = 0;
        class62.field1332 = 0;
        class68.field1452 = 0;
        class56.field1116 = 0;
        class156.field3053 = 0;
        class198.field3864 = 0;
        class96.field1987 = 0;
        class183.field3510 = 0;
        class14.field301 = 0;
        client.field548 = 0;
        class123.field2483 = 0;
        class143.field2815 = 0;
        class114.field2314 = 0;
        class116.field2356 = 0;
        class2.field19 = 0;
        class68.field1507 = 0;
        class47.field967 = 0;
        class167.field3233 = 0;
        class34.field654 = 0;
        class8.field162 = 0;
        class75.field1630 = 0;
        class52.field1016 = 0;
        class186.field3596 = 0;
        class141.field2763 = 0;
        class68.field1503 = 0;
        class180.field3442 = 0;
        class69.field1517 = 0;
        class193.field3749 = 0;
        class159.field3083 = 0;
        class74.field1624 = 0;
        class68.field1479 = 0;
        class99.field2097 = 0;
        class12.field227 = 0;
        class82.field1760 = 0;
        class94.field1941 = 0;
        class87.field1856 = 0;
        class182.field3504 = 0;
        class61.field1321 = 0;
        class51.field987 = 0;
        class47.field950 = 0;
        class194.field3780 = 0;
        class194.field3764 = 0;
        class72.field1549 = 0;
        class105.field2194 = 0;
        field3532 = 0;
        class22.field426 = 0;
        class103.field2173 = 0;
        class85.field1806 = 0;
        class137.field2680 = 0;
        class5.field75 = 0;
        class135.field2658 = 0;
        class73.field1589 = 0;
        class68.field1463 = 0;
        class204.field4017 = 0;
        class57.field1131 = 0;
        class155.field3039 = 0;
        class158.field3075 = 0;
        class68.field1483 = 0;
        class60.field1154 = 0;
        class182.field3484 = 0;
        class62.field1329 = 0;
        class195.field3806 = 0;
        class123.field2490 = 0;
        class193.field3745 = 0;
        class26.field504 = 0;
        class64.field1400 = 0;
        class180.field3450 = 0;
        class25.field483 = 0;
        class198.field3856 = 0;
        class182.field3478 = 0;
        class204.field4003 = 0;
        class96.field2031 = 0;
        class96.field2025 = 0;
        class68.field1493 = 0;
        class96.field2022 = 0;
        class182.field3506 = 0;
        class189.field3666 = 0;
        class122.field2462 = 0;
        class167.field3253 = 0;
        class79.method676(65);
        class95.field1971 = 0;
        class80.field1726 = false;
        class60.field1174.field1454 = 0;
        class76.field1659 = -1;
        class22.field418.field1454 = 0;
        class160.field3109 = -1;
        class155.field3027 = 0;
        class95.field1958 = 0;
        class41.field811 = 0;
        class184.field3529 = -1;
        class19.field378 = -1;
        class107.field2234 = 0;
        class54.method475(105, 0);
        for (int var1 = 0; var1 < 100; var1++) {
            class200.field3901[var1] = null;
        }
        class35.field687 = (int) (Math.random() * 110.0D) - 55;
        class80.field1727 = 0;
        class130.field2575 = 0;
        class99.field2090 = -1;
        class160.field3116 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        class195.field3793 = (int) (Math.random() * 120.0D) - 60;
        class25.field488 = 0;
        class78.field1688 = false;
        class60.field1167 = (int) (Math.random() * 30.0D) - 20;
        class196.field3826 = (int) (Math.random() * 80.0D) - 40;
        class90.field1885 = 0;
        class44.field891 = (int) (Math.random() * 100.0D) - 50;
        class20.field385 = 0;
        class47.field926 = 0;
        class109.field2268 = 0;
        class35.field688 = 0;
        for (int var2 = 0; var2 < 2048; var2++) {
            class40.field795[var2] = null;
            class158.field3070[var2] = null;
        }
        for (int var3 = 0; var3 < 32768; var3++) {
            class133.field2626[var3] = null;
        }
        class123.field2489 = class40.field795[2047] = new class32();
        class191.field3692.method350(71);
        class39.field773.method350(arg0 + 110);
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var12 = 0; var12 < 104; var12++) {
                for (int var13 = 0; var13 < 104; var13++) {
                    class31.field597[var4][var12][var13] = null;
                }
            }
        }
        client.field551 = new class40();
        class77.field1679 = 0;
        class202.field3944 = 0;
        for (int var5 = 0; var5 < class203.field3991; var5++) {
            class99 var11 = class139.method1011(var5, 16);
            if (var11 != null && var11.field2094 == 0) {
                class76.field1660[var5] = 0;
                class83.field1778[var5] = 0;
            }
        }
        for (int var6 = 0; var6 < class121.field2448.length; var6++) {
            class121.field2448[var6] = -1;
        }
        if (class202.field3924 != -1) {
            class80.method683((byte) 74, class202.field3924);
        }
        for (class63 var7 = (class63) class138.field2710.method1344(false); var7 != null; var7 = (class63) class138.field2710.method1340(false)) {
            method1230(true, true, var7);
        }
        class202.field3924 = -1;
        class138.field2710 = new class204(8);
        class95.field1971 = 0;
        class80.field1726 = false;
        class200.field3905 = null;
        class205.field4038.method1205(false, new int[5], false, -1, null);
        for (int var8 = 0; var8 < 8; var8++) {
            class161.field3136[var8] = null;
            class114.field2329[var8] = false;
        }
        class180.method1198(arg0 ^ 0x5C9D);
        class182.field3497 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            class158.field3077[var9] = true;
        }
        class41.field809 = 0;
        class122.field2478 = null;
        class40.field807 = null;
        for (int var10 = 0; var10 < 6; var10++) {
            class149.field2930[var10] = new class36();
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZZLgh;)V")
    public static final void method1230(boolean arg0, boolean arg1, class63 arg2) {
        field3540++;
        int var3 = arg2.field1349;
        int var4 = (int) arg2.field2283;
        arg2.method885(3);
        if (!arg1) {
            field3541 = 21;
        }
        if (arg0) {
            class80.method683((byte) 64, var3);
        }
        class81.method688(var3, (byte) -98);
        class61 var5 = class23.method224(var4, 484111152);
        if (var5 != null) {
            class20.method204(var5, (byte) -5);
        }
        class95.field1971 = 0;
        class80.field1726 = false;
        class27.method249(class76.field1648, -23343, class152.field2967, class79.field1694, class105.field2182);
        if (class202.field3924 != -1) {
            class76.method662((byte) -35, class202.field3924, 1);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)I")
    public static final int method1231(int arg0, byte arg1) {
        field3535++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        if (arg1 <= 2) {
            return 24;
        } else {
            int var3 = arg0 * 6 - 61440;
            int var4 = (arg0 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        }
    }

    @OriginalMember(owner = "client!ue", name = "run", descriptor = "()V")
    public final void run() {
        field3532++;
        try {
            while (true) {
                class40 var1 = class80.field1725;
                class181 var2;
                synchronized (class80.field1725) {
                    var2 = (class181) class80.field1725.method345(-101);
                }
                if (var2 == null) {
                    class76.method666(100L, 1);
                    Object var6 = class40.field803;
                    synchronized (class40.field803) {
                        if (class51.field988 <= 1) {
                            class51.field988 = 0;
                            class40.field803.notifyAll();
                            return;
                        }
                        class51.field988--;
                    }
                } else {
                    if (var2.field3463 == 0) {
                        var2.field3475.method525(var2.field3467, (int) var2.field2283, (byte) -36, var2.field3467.length);
                        class40 var3 = class80.field1725;
                        synchronized (class80.field1725) {
                            var2.method885(3);
                        }
                    } else if (var2.field3463 == 1) {
                        var2.field3467 = var2.field3475.method528(7308, (int) var2.field2283);
                        class40 var4 = class80.field1725;
                        synchronized (class80.field1725) {
                            class120.field2430.method337(var2, (byte) -22);
                        }
                    }
                    Object var5 = class40.field803;
                    synchronized (class40.field803) {
                        if (class51.field988 <= 1) {
                            class51.field988 = 0;
                            class40.field803.notifyAll();
                            return;
                        }
                        class51.field988 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class167.method1131((byte) -82, var17, null);
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(IB)Leh;")
    public static final class47 method1232(int arg0, byte arg1) {
        if (arg1 != 107) {
            method1230(false, false, null);
        }
        field3533++;
        if (arg0 < 100000) {
            return class5.method24(new class47[] { class60.field1176, class167.method1133(arg0, (byte) -118), class204.field4025 }, (byte) 76);
        } else if (arg0 < 10000000) {
            return class5.method24(new class47[] { class117.field2389, class167.method1133(arg0 / 1000, (byte) 125), class37.field725, class204.field4025 }, (byte) 77);
        } else {
            return class5.method24(new class47[] { class161.field3140, class167.method1133(arg0 / 1000000, (byte) 106), class86.field1836, class204.field4025 }, (byte) 80);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)Z")
    public static final boolean method1233(int arg0, int arg1) {
        field3531++;
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        } else if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else if (arg0 >= 48 && arg0 <= 57) {
            return true;
        } else {
            int var2 = 74 % ((arg1 + 19) / 46);
            return false;
        }
    }
}
