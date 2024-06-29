import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class17 extends class40 {

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "[I")
    public static int[] field327 = new int[1000];

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "Lec;")
    public static class28 field326 = class28.method210(-46, "K");

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "Lec;")
    public static class28 field322 = class28.method210(-46, "May");

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
    public static int field333 = 0;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
    public static int field331 = -1;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "Lvb;")
    public static class122 field321;

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "Lec;")
    public class28 field332;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)I")
    public static final int method94(int arg0, int arg1, int arg2) {
        field329++;
        if (~arg2 == arg1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg0 / 128;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLec;)V")
    public static final void method95(byte arg0, class28 arg1) {
        field330++;
        if (arg1 == null || arg1.method214(-16) == 0) {
            class21.field455 = 0;
            return;
        }
        class28 var2 = arg1;
        class28[] var3 = new class28[100];
        int var4 = 0;
        while (true) {
            int var5 = var2.method205(32, (byte) -124);
            if (var5 == -1) {
                class28 var7 = var2.method213(97);
                if (var7.method214(-17) > 0) {
                    var3[var4++] = var7.method234((byte) -99);
                }
                if (arg0 != -48) {
                    return;
                }
                class21.field455 = 0;
                label51: for (int var8 = 0; var8 < class125.field2717; var8++) {
                    class129 var9 = class129.method992(var8, -18);
                    if (var9.field2794 == -1 && var9.field2765 != null) {
                        class28 var10 = var9.field2765.method234((byte) 62);
                        for (int var11 = 0; var11 < var4; var11++) {
                            if (var10.method203(var3[var11], (byte) -71) == -1) {
                                continue label51;
                            }
                        }
                        class105.field2221[class21.field455] = var10;
                        class76.field1698[class21.field455] = var8;
                        class21.field455++;
                        if (class105.field2221.length <= class21.field455) {
                            return;
                        }
                    }
                }
                return;
            }
            class28 var6 = var2.method228(var5, true, 0).method213(arg0 ^ 0xFFFFFFB1);
            if (var6.method214(-105) > 0) {
                var3[var4++] = var6.method234((byte) -126);
            }
            var2 = var2.method218(var5 + 1, false);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZLud;)Lec;")
    public static final class28 method96(int arg0, boolean arg1, class119 arg2) {
        field328++;
        try {
            if (arg1) {
                field322 = null;
            }
            class28 var3 = new class28();
            var3.field606 = arg2.method899(-4);
            if (var3.field606 > arg0) {
                var3.field606 = arg0;
            }
            var3.field628 = new byte[var3.field606];
            arg2.field2554 += class34.field780.method169(var3.field606, var3.field628, arg2.field2531, arg2.field2554, (byte) 113, 0);
            return var3;
        } catch (Exception var4) {
            return class119.field2549;
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)V")
    public static final void method97(byte arg0) {
        field325++;
        class92.field2041 = 0;
        class45.field999.field211 = 0;
        class18.field345 = true;
        class87.field1943 = 0;
        class51.field1191 = 0;
        field328 = 0;
        class62.field1391 = 0;
        class55.field1261 = 0;
        class122.field2638 = 0;
        class7.field103 = 0;
        class76.field1700 = 0;
        class23.field520 = 0;
        class14.field261 = 0;
        class55.field1262 = 0;
        class86.field1920 = 0;
        class65.field1454 = 0;
        class77.field1738 = 0;
        class21.field462 = 0;
        class56.field1277 = 0;
        class49.field1128 = 0;
        class112.field2400 = 0;
        class50.field1167 = 0;
        class129.field2797 = 0;
        class8.field135 = 0;
        class112.field2412 = 0;
        class117.field2477 = 0;
        class42.field906 = 0;
        class69.field1555 = 0;
        class5.field76 = 0;
        class3.field32 = 0;
        class27.field574 = 0;
        class119.field2571 = 0;
        class20.field433 = 0;
        class5.field84 = 0;
        class91.field2001 = 0;
        class49.field1122 = 0;
        class109.field2292 = 0;
        class69.field1544 = 0;
        class28.field630 = 0;
        class5.field79 = 0;
        class36.field827 = 0;
        class28.field598 = 0;
        client.field395 = 0;
        class61.field1356 = 0;
        class110.field2316 = 0;
        class20.field443 = 0;
        class103.field2192 = 0;
        class45.field965 = 0;
        class32.field677 = 0;
        class47.field1056 = 0;
        class13.field217 = 0;
        class28.field601 = 0;
        class91.field2013 = 0;
        class28.field627 = 0;
        class92.field2033 = 0;
        class119.field2533 = 0;
        class112.field2399 = 0;
        class25.field543 = 0;
        class92.field2017 = 0;
        class53.field1210 = 0;
        class78.field1798 = 0;
        class18.field351 = 0;
        class27.field576 = 0;
        class45.field959 = 0;
        class42.field897 = 0;
        class129.field2796 = 0;
        class2.field15 = 0;
        class28.field607 = 0;
        class22.field500 = 0;
        class122.field2637 = 0;
        class47.field1086 = 0;
        class129.field2814 = 0;
        class105.field2209 = 0;
        class119.field2572 = 0;
        class118.field2521 = 0;
        class94.field2064 = 0;
        class123.field2672 = 0;
        class49.field1129 = 0;
        class117.field2501 = 0;
        class22.field493 = 0;
        class46.field1050 = 0;
        class112.field2411 = 0;
        class119.field2538 = 0;
        class51.field1182 = 0;
        client.field388 = 0;
        class51.field1180 = 0;
        class72.field1592 = 0;
        class28.field633 = 0;
        class30.field640 = 0;
        class72.field1602 = 0;
        class94.field2061 = 0;
        class124.field2701 = 0;
        class112.field2391 = 0;
        class20.field431 = 0;
        class13.field218 = 0;
        class122.field2633 = 0;
        class88.field1949 = 0;
        class50.field1166 = 0;
        class65.field1472 = 0;
        class14.field254 = 0;
        class129.field2818 = 0;
        class119.field2550 = 0;
        class74.field1635 = 0;
        class117.field2490 = 0;
        class76.field1689 = 0;
        class65.field1441 = 0;
        class28.field632 = 0;
        class42.field894 = 0;
        class95.field2091 = 0;
        class18.field349 = 0;
        class94.field2072 = 0;
        class122.field2639 = 0;
        class119.field2578 = 0;
        class14.field265 = 0;
        class86.field1928 = 0;
        class47.field1092 = 0;
        class5.field80 = 0;
        class93.field2047 = 0;
        class106.field2256 = 0;
        class18.field340 = 0;
        class110.field2317 = 0;
        class51.field1188 = 0;
        class77.field1728 = 0;
        class87.field1945 = 0;
        client.field375 = 0;
        class76.field1697 = 0;
        class112.field2404 = 0;
        class68.field1537 = 0;
        class22.field496 = 0;
        class96.field2131 = 0;
        class20.field447 = 0;
        class63.field1395 = 0;
        class45.field1014 = 0;
        class122.field2650 = 0;
        class14.field260 = 0;
        class45.field1013 = 0;
        class127.field2741 = 0;
        class76.field1702 = 0;
        class45.field956 = 0;
        client.field389 = 0;
        class1.field3 = 0;
        class83.field1902 = 0;
        class3.field29 = 0;
        class118.field2510 = 0;
        class122.field2648 = 0;
        class62.field1378 = 0;
        class112.field2394 = 0;
        class78.field1770 = 0;
        class63.field1408 = 0;
        class7.field98 = 0;
        class66.field1518 = 0;
        class66.field1520 = 0;
        class11.field188 = 0;
        class74.field1642 = 0;
        class127.field2751 = 0;
        class28.field591 = 0;
        class117.field2486 = 0;
        class119.field2547 = 0;
        class119.field2556 = 0;
        class21.field479 = 0;
        class64.field1432 = 0;
        class117.field2473 = 0;
        class114.field2431 = 0;
        class117.field2495 = 0;
        class63.field1414 = 0;
        class49.field1123 = 0;
        class112.field2403 = 0;
        class25.field533 = 0;
        class28.field623 = 0;
        class123.field2683 = 0;
        class118.field2522 = 0;
        class28.field596 = 0;
        class117.field2480 = 0;
        class106.field2240 = 0;
        class12.field202 = 0;
        class49.field1140 = 0;
        class76.field1703 = 0;
        class103.field2207 = 0;
        class42.field899 = 0;
        class48.field1103 = 0;
        class129.field2769 = 0;
        class112.field2398 = 0;
        class83.field1893 = 0;
        class119.field2536 = 0;
        class40.field864 = 0;
        class11.field181 = 0;
        class13.field219 = 0;
        class3.field55 = 0;
        class106.field2255 = 0;
        class49.field1132 = 0;
        class18.field337 = 0;
        class13.field220 = 0;
        class63.field1402 = 0;
        class119.field2568 = 0;
        class27.field580 = 0;
        class74.field1632 = 0;
        class119.field2539 = 0;
        class95.field2117 = 0;
        class49.field1131 = 0;
        class69.field1548 = 0;
        class95.field2118 = 0;
        class61.field1352 = 0;
        class72.field1603 = 0;
        class43.field940 = 0;
        class112.field2410 = 0;
        class119.field2560 = 0;
        class25.field544 = 0;
        class23.field516 = 0;
        class5.field87 = 0;
        class86.field1911 = 0;
        class45.field987 = 0;
        class76.field1712 = 0;
        class125.field2712 = 0;
        class98.field2174 = 0;
        class25.field549 = 0;
        class11.field177 = 0;
        class36.field789 = 0;
        class28.field635 = 0;
        class96.field2136 = 0;
        client.field378 = 0;
        class22.field507 = 0;
        class37.field846 = 0;
        class87.field1942 = 0;
        class48.field1101 = 0;
        client.field390 = 0;
        class8.field128 = 0;
        class94.field2062 = 0;
        class88.field1964 = 0;
        class46.field1021 = 0;
        class7.field105 = 0;
        class68.field1533 = 0;
        class87.field1940 = 0;
        class78.field1800 = 0;
        class63.field1397 = 0;
        class117.field2488 = 0;
        class47.field1063 = 0;
        class3.field39 = 0;
        class106.field2267 = 0;
        class93.field2043 = 0;
        class87.field1936 = 0;
        class119.field2563 = 0;
        class76.field1706 = 0;
        class122.field2649 = 0;
        class119.field2527 = 0;
        class119.field2557 = 0;
        class9.field165 = 0;
        class18.field354 = 0;
        class46.field1037 = 0;
        class14.field258 = 0;
        class18.field358 = 0;
        class7.field102 = 0;
        class124.field2690 = 0;
        class15.field283 = 0;
        class50.field1168 = 0;
        class13.field238 = 0;
        class51.field1184 = 0;
        class112.field2396 = 0;
        class119.field2565 = 0;
        class98.field2167 = 0;
        class61.field1366 = 0;
        class126.field2731 = 0;
        class18.field346 = 0;
        class66.field1525 = 0;
        class30.field648 = 0;
        class18.field344 = 0;
        class23.field518 = 0;
        class28.field620 = 0;
        class37.field839 = 0;
        field330 = 0;
        class72.field1600 = 0;
        class105.field2223 = 0;
        class117.field2478 = 0;
        class55.field1260 = 0;
        class78.field1760 = 0;
        class96.field2121 = 0;
        class129.field2772 = 0;
        class96.field2123 = 0;
        class5.field86 = 0;
        class9.field154 = 0;
        class47.field1078 = 0;
        class53.field1224 = 0;
        class77.field1731 = 0;
        class65.field1453 = 0;
        class30.field643 = 0;
        class34.field770 = 0;
        class119.field2586 = 0;
        class9.field164 = 0;
        class42.field891 = 0;
        class8.field130 = 0;
        class47.field1068 = 0;
        class12.field192 = 0;
        class45.field1011 = 0;
        class95.field2100 = 0;
        class22.field495 = 0;
        class90.field1982 = 0;
        class16.field310 = 0;
        class122.field2642 = 0;
        class27.field571 = 0;
        class119.field2566 = 0;
        class86.field1925 = 0;
        class110.field2318 = 0;
        class106.field2263 = 0;
        class16.field313 = 0;
        class88.field1950 = 0;
        class119.field2528 = 0;
        class122.field2632 = 0;
        class57.field1303 = 0;
        class36.field814 = 0;
        class124.field2692 = 0;
        class122.field2609 = 0;
        class42.field889 = 0;
        class95.field2095 = 0;
        class46.field1041 = 0;
        class119.field2575 = 0;
        class122.field2611 = 0;
        class56.field1281 = 0;
        class61.field1369 = 0;
        class119.field2552 = 0;
        class78.field1778 = 0;
        class96.field2124 = 0;
        class103.field2194 = 0;
        class46.field1025 = 0;
        class45.field984 = 0;
        class2.field16 = 0;
        class77.field1736 = 0;
        class16.field304 = 0;
        class92.field2034 = 0;
        class119.field2588 = 0;
        class12.field200 = 0;
        class92.field2035 = 0;
        class106.field2243 = 0;
        class31.field657 = 0;
        class119.field2583 = 0;
        class110.field2315 = 0;
        class88.field1955 = 0;
        class21.field458 = 0;
        class43.field925 = 0;
        class69.field1547 = 0;
        class56.field1291 = 0;
        client.field387 = 0;
        class27.field588 = 0;
        class28.field615 = 0;
        class66.field1511 = 0;
        class13.field232 = 0;
        class78.field1743 = 0;
        class129.field2777 = 0;
        class64.field1421 = 0;
        class66.field1522 = 0;
        class70.field1567 = 0;
        class32.field676 = 0;
        class119.field2551 = 0;
        class95.field2119 = 0;
        class15.field279 = 0;
        class94.field2070 = 0;
        class25.field561 = 0;
        class63.field1405 = 0;
        class46.field1020 = 0;
        class40.field874 = 0;
        class49.field1139 = 0;
        class46.field1023 = 0;
        class21.field472 = 0;
        class94.field2067 = 0;
        class64.field1420 = 0;
        class28.field610 = 0;
        class65.field1461 = 0;
        class31.field656 = 0;
        class114.field2429 = 0;
        class14.field266 = 0;
        class46.field1026 = 0;
        class55.field1270 = 0;
        class79.field1827 = 0;
        class23.field524 = 0;
        class91.field2006 = 0;
        class114.field2427 = 0;
        class61.field1371 = 0;
        class110.field2328 = 0;
        class119.field2546 = 0;
        class117.field2475 = 0;
        class105.field2214 = 0;
        class28.field600 = 0;
        class49.field1124 = 0;
        class76.field1704 = 0;
        class119.field2589 = 0;
        class46.field1046 = 0;
        class91.field2002 = 0;
        class96.field2140 = 0;
        class74.field1628 = 0;
        class124.field2695 = 0;
        class14.field270 = 0;
        class98.field2161 = 0;
        class76.field1696 = 0;
        class122.field2636 = 0;
        class18.field353 = 0;
        class28.field631 = 0;
        class88.field1968 = 0;
        client.field385 = 0;
        class119.field2580 = 0;
        class122.field2652 = 0;
        class63.field1399 = 0;
        class125.field2706 = 0;
        class122.field2628 = 0;
        class93.field2052 = 0;
        class2.field14 = 0;
        class110.field2326 = 0;
        class68.field1531 = 0;
        class37.field835 = 0;
        class96.field2145 = 0;
        class127.field2752 = 0;
        class21.field474 = 0;
        class129.field2802 = 0;
        class91.field2008 = 0;
        class124.field2694 = 0;
        class22.field490 = 0;
        class22.field502 = 0;
        class28.field608 = 0;
        class46.field1035 = 0;
        class42.field893 = 0;
        class7.field107 = 0;
        class43.field930 = 0;
        class122.field2608 = 0;
        class110.field2322 = 0;
        class21.field467 = 0;
        class119.field2545 = 0;
        class48.field1112 = 0;
        class110.field2311 = 0;
        class119.field2543 = 0;
        class3.field53 = 0;
        class118.field2517 = 0;
        class36.field817 = 0;
        class118.field2507 = 0;
        class118.field2518 = 0;
        class28.field597 = 0;
        class49.field1137 = 0;
        class61.field1361 = 0;
        class20.field448 = 0;
        class83.field1894 = 0;
        class106.field2266 = 0;
        class83.field1900 = 0;
        class18.field348 = 0;
        class119.field2555 = 0;
        class48.field1119 = 0;
        class70.field1575 = 0;
        class94.field2068 = 0;
        class119.field2581 = 0;
        class122.field2626 = 0;
        class22.field492 = 0;
        class15.field273 = 0;
        class91.field1997 = 0;
        class119.field2542 = 0;
        class18.field355 = 0;
        class79.field1822 = 0;
        class119.field2585 = 0;
        class122.field2613 = 0;
        class7.field108 = 0;
        class22.field505 = 0;
        class72.field1595 = 0;
        class15.field290 = 0;
        class63.field1413 = 0;
        class94.field2069 = 0;
        class63.field1409 = 0;
        class45.field962 = 0;
        class28.field603 = 0;
        client.field383 = 0;
        class83.field1884 = 0;
        class64.field1417 = 0;
        class109.field2277 = 0;
        class95.field2101 = 0;
        class92.field2024 = 0;
        class119.field2582 = 0;
        class122.field2630 = 0;
        class14.field272 = 0;
        class79.field1841 = 0;
        class51.field1179 = 0;
        class114.field2434 = 0;
        class3.field37 = 0;
        class79.field1829 = 0;
        class119.field2564 = 0;
        class51.field1195 = 0;
        class91.field2004 = 0;
        class57.field1305 = 0;
        class12.field209 = 0;
        class31.field663 = 0;
        class9.field174 = 0;
        class124.field2689 = 0;
        class129.field2812 = 0;
        class46.field1048 = 0;
        class3.field42 = 0;
        class28.field616 = 0;
        class16.field308 = 0;
        class28.field617 = 0;
        class47.field1097 = 0;
        class76.field1715 = 0;
        class15.field277 = 0;
        class30.field645 = 0;
        class70.field1560 = 0;
        class94.field2065 = 0;
        class124.field2693 = 0;
        class66.field1516 = 0;
        if (arg0 != 16) {
            field322 = null;
        }
        class76.field1699 = 0;
        class80.field1846 = 0;
        class117.field2503 = 0;
        class122.field2625 = 0;
        class37.field833 = 0;
        class129.field2821 = 0;
        class72.field1607 = 0;
        class31.field672 = 0;
        class37.field832 = 0;
        class4.field60 = 0;
        class25.field554 = 0;
        class45.field994 = 0;
        class21.field468 = 0;
        client.field376 = 0;
        class28.field621 = 0;
        class72.field1594 = 0;
        class92.field2030 = 0;
        class122.field2654 = 0;
        class13.field233 = 0;
        class66.field1515 = 0;
        class21.field466 = 0;
        client.field384 = 0;
        class90.field1993 = 0;
        class98.field2175 = 0;
        class3.field54 = 0;
        class47.field1093 = 0;
        class129.field2768 = 0;
        class34.field776 = 0;
        class27.field586 = 0;
        class56.field1279 = 0;
        class36.field798 = 0;
        class65.field1495 = 0;
        class122.field2655 = 0;
        class119.field2526 = 0;
        class28.field619 = 0;
        class83.field1901 = 0;
        class112.field2393 = 0;
        class122.field2612 = 0;
        class83.field1899 = 0;
        class5.field78 = 0;
        class127.field2745 = 0;
        class69.field1552 = 0;
        class129.field2803 = 0;
        class123.field2664 = 0;
        class42.field887 = 0;
        class53.field1212 = 0;
        class45.field1001 = 0;
        class46.field1036 = 0;
        class28.field614 = 0;
        class9.field160 = 0;
        class110.field2319 = 0;
        class63.field1396 = 0;
        class126.field2723 = 0;
        class46.field1047 = 0;
        class48.field1117 = 0;
        class46.field1045 = 0;
        class122.field2635 = 0;
        class34.field763 = 0;
        class110.field2327 = 0;
        class103.field2198 = 0;
        class21.field460 = 0;
        class7.field112 = 0;
        class122.field2610 = 0;
        class86.field1927 = 0;
        class69.field1553 = 0;
        class45.field970 = 0;
        class31.field668 = 0;
        class50.field1172 = 0;
        class47.field1077 = 0;
        class117.field2471 = 0;
        class119.field2567 = 0;
        client.field391 = 0;
        class53.field1207 = 0;
        client.field374 = 0;
        class31.field654 = 0;
        class20.field450 = 0;
        class76.field1709 = 0;
        class117.field2487 = 0;
        class28.field602 = 0;
        class5.field91 = 0;
        class42.field896 = 0;
        class119.field2530 = 0;
        class78.field1781 = 0;
        class40.field867 = 0;
        class28.field599 = 0;
        class9.field166 = 0;
        class66.field1513 = 0;
        class8.field129 = 0;
        class72.field1612 = 0;
        class122.field2622 = 0;
        class12.field206 = 0;
        class18.field334 = 0;
        client.field377 = 0;
        class119.field2537 = 0;
        class34.field773 = 0;
        class23.field525 = 0;
        class74.field1631 = 0;
        class18.field343 = 0;
        field325 = 0;
        class90.field1988 = 0;
        class88.field1953 = 0;
        class37.field838 = 0;
        class28.field629 = 0;
        class96.field2132 = 0;
        class77.field1723 = 0;
        class118.field2506 = 0;
        field329 = 0;
        class69.field1542 = 0;
        class46.field1052 = 0;
        class20.field441 = 0;
        class46.field1042 = 0;
        class88.field1951 = 0;
        class12.field198 = 0;
        class13.field224 = 0;
        class2.field23 = 0;
        class123.field2685 = 0;
        class3.field45 = 0;
        class21.field461 = 0;
        class51.field1194 = 0;
        class20.field452 = 0;
        class77.field1740 = 0;
        class64.field1424 = 0;
        class18.field339 = 0;
        class119.field2529 = 0;
        class72.field1608 = 0;
        class119.field2548 = 0;
        class42.field900 = 0;
        class79.field1836 = 0;
        class20.field437 = 0;
        class126.field2724 = 0;
        class42.field898 = 0;
        class25.field556 = 0;
        class14.field271 = 0;
        class28.field611 = 0;
        class22.field488 = 0;
        class112.field2415 = 0;
        class48.field1111 = 0;
        field323 = 0;
        class28.field592 = 0;
        class119.field2576 = 0;
        class51.field1185 = 0;
        class27.field578 = 0;
        class129.field2788 = 0;
        class42.field895 = 0;
        class45.field1009 = 0;
        class13.field237 = 0;
        class22.field487 = 0;
        class48.field1109 = 0;
        class119.field2553 = 0;
        class9.field155 = 0;
        class28.field604 = 0;
        class49.field1136 = 0;
        class3.field28 = 0;
        class25.field555 = 0;
        class8.field132 = 0;
        class88.field1962 = 0;
        class53.field1218 = 0;
        class51.field1187 = 0;
        class70.field1573 = 0;
        class122.field2651 = 0;
        class119.field2579 = 0;
        class28.field626 = 0;
        class21.field478 = 0;
        class23.field529 = 0;
        class21.field470 = 0;
        class9.field159 = 0;
        class45.field1012 = 0;
        class5.field81 = 0;
        class3.field36 = 0;
        class117.field2481 = 0;
        class119.field2559 = 0;
        class43.field939 = 0;
        class12.field195 = 0;
        class65.field1485 = 0;
        class119.field2574 = 0;
        class45.field983 = 0;
        class46.field1022 = 0;
        class14.field263 = 0;
        class46.field1043 = 0;
        class1.field1 = 0;
        class20.field442 = 0;
        class5.field88 = 0;
        class70.field1558 = 0;
        class28.field622 = 0;
        class76.field1710 = 0;
        class117.field2499 = 0;
        class96.field2120 = 0;
        class122.field2640 = 0;
        class46.field1024 = 0;
        class3.field59 = 0;
        class46.field1019 = 0;
        class53.field1217 = 0;
        class15.field300 = 0;
        class119.field2541 = 0;
        class117.field2502 = 0;
        class37.field837 = 0;
        class112.field2397 = 0;
        class119.field2561 = 0;
        class119.field2569 = 0;
        class28.field609 = 0;
        class50.field1170 = 0;
        class96.field2150 = 0;
        class70.field1559 = 0;
        class25.field546 = 0;
        class66.field1524 = 0;
        class77.field1722 = 0;
        client.field382 = 0;
        class34.field777 = 0;
        class18.field341 = 0;
        class12.field191 = 0;
        class5.field77 = 0;
        class25.field551 = 0;
        class88.field1948 = 0;
        class46.field1028 = 0;
        class42.field890 = 0;
        class18.field350 = 0;
        client.field379 = 0;
        class46.field1029 = 0;
        class45.field967 = 0;
        class49.field1125 = 0;
        class119.field2577 = 0;
        class127.field2742 = 0;
        class74.field1627 = 0;
        class13.field222 = 0;
        class76.field1705 = 0;
        class25.field538 = 0;
        class48.field1107 = 0;
        class31.field667 = 0;
        class92.field2016 = 0;
        class65.field1436 = 0;
        class27.field582 = 0;
        class122.field2615 = 0;
        class27.field587 = 0;
        class32.field678 = 0;
        class14.field267 = 0;
        class92.field2025 = 0;
        class28.field613 = 0;
        class46.field1030 = 0;
        class28.field605 = 0;
        class105.field2212 = 0;
        class45.field966 = 0;
        class37.field840 = 0;
        class65.field1440 = 0;
        class5.field83 = 0;
        class79.field1823 = 0;
        class53.field1205 = 0;
        class110.field2313 = 0;
        class129.field2791 = 0;
        class91.field2010 = 0;
        class14.field259 = 0;
        class3.field48 = 0;
        class46.field1040 = 0;
        class46.field1018 = 0;
        class43.field931 = 0;
        class14.field252 = 0;
        class7.field99 = 0;
        class109.field2297 = 0;
        class119.field2534 = 0;
        class2.field21 = 0;
        class28.field624 = 0;
        class119.field2535 = 0;
        class28.field593 = 0;
        class98.field2171 = 0;
        class28.field618 = 0;
        class42.field903 = 0;
        class119.field2558 = 0;
        class28.field612 = 0;
        class112.field2416 = 0;
        class106.field2241 = 0;
        class9.field158 = 0;
        class46.field1016 = 0;
        class65.field1503 = 0;
        class119.field2532 = 0;
        class3.field38 = 0;
        class127.field2753 = 0;
        class66.field1523 = 0;
        class42.field904 = 0;
        class7.field106 = 0;
        class127.field2740 = 0;
        class64.field1431 = 0;
        class16.field303 = 0;
        field324 = 0;
        class123.field2675 = 0;
        class13.field240 = 0;
        class37.field831 = 0;
        class78.field1763 = 0;
        class119.field2540 = 0;
        class88.field1954 = 0;
        class3.field27 = 0;
        class96.field2144 = 0;
        class83.field1889 = 0;
        class22.field503 = 0;
        class86.field1924 = true;
        class2.field18 = 0L;
        class22.method162(true);
        class5.field85.field2554 = 0;
        class56.field1282.field2554 = 0;
        class110.field2314 = 0;
        class25.field545 = -1;
        client.field381 = 0;
        class48.field1118 = 0;
        class13.field243 = false;
        class122.field2660 = -1;
        class12.field203 = -1;
        class114.field2435 = 0;
        class34.field778 = -1;
        class21.field482 = 0;
        class15.method86(0, 0);
        for (int var1 = 0; var1 < 100; var1++) {
            class117.field2500[var1] = null;
        }
        class68.field1541 = (int) (Math.random() * 100.0D) - 50;
        class48.field1105 = (int) (Math.random() * 120.0D) - 60;
        class27.field585 = 0;
        class122.field2663 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        class9.field169 = -1;
        class76.field1691 = 0;
        class95.field2097 = 0;
        class57.field1306 = (int) (Math.random() * 80.0D) - 40;
        class8.field148 = (int) (Math.random() * 110.0D) - 55;
        class127.field2750 = 0;
        class74.field1641 = 0;
        class76.field1701 = 0;
        class74.field1637 = (int) (Math.random() * 30.0D) - 20;
        class11.field185 = 0;
        class64.field1430 = 0;
        for (int var2 = 0; var2 < 2048; var2++) {
            class129.field2779[var2] = null;
            class78.field1807[var2] = null;
        }
        for (int var3 = 0; var3 < 16384; var3++) {
            class88.field1956[var3] = null;
        }
        class37.field848 = class129.field2779[2047] = new class43();
        class93.field2044.method329((byte) -57);
        class76.field1694.method329((byte) -57);
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class127.field2746[var4][var6][var7] = null;
                }
            }
        }
        class37.field842 = new class42();
        class36.field829 = 0;
        class25.field560 = 0;
        class14.method79(156, class1.field13);
        class1.field13 = -1;
        class14.method79(arg0 + 140, class110.field2325);
        class110.field2325 = -1;
        class14.method79(156, class40.field860);
        class40.field860 = -1;
        class14.method79(156, class37.field854);
        class37.field854 = -1;
        class14.method79(arg0 + 140, class2.field19);
        class2.field19 = -1;
        class14.method79(arg0 + 140, class57.field1307);
        class57.field1307 = -1;
        class14.method79(156, class61.field1354);
        class13.field243 = false;
        class36.field794 = false;
        class114.field2439 = false;
        class51.field1181 = -1;
        class7.field120 = 3;
        class23.field515 = 0;
        class55.field1274 = 0;
        class61.field1354 = -1;
        class64.field1416 = null;
        class49.field1144.method815(null, -1, false, arg0 ^ 0xFFFF893F, new int[5]);
        for (int var5 = 0; var5 < 5; var5++) {
            class31.field665[var5] = null;
            class83.field1896[var5] = false;
        }
        class88.field1947 = true;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public static void method98(int arg0) {
        field322 = null;
        field321 = null;
        if (arg0 != 15293) {
            field326 = null;
        }
        field326 = null;
        field327 = null;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
    public static final void method99(int arg0) {
        if (arg0 <= 40) {
            return;
        }
        for (int var1 = 0; var1 < class16.field306; var1++) {
            int var2 = class25.field557[var1];
            class90 var3 = class88.field1956[var2];
            int var4 = class56.field1282.method879((byte) 45);
            if ((var4 & 0x20) != 0) {
                var3.field1463 = class56.field1282.method903(2);
                if (var3.field1463 == 65535) {
                    var3.field1463 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                int var5 = class56.field1282.method862(-31050);
                int var6 = class56.field1282.method900((byte) 127);
                var3.method525(class83.field1888, var6, var5, (byte) -8);
                var3.field1455 = class83.field1888 + 300;
                var3.field1448 = class56.field1282.method878((byte) -121);
                var3.field1437 = class56.field1282.method862(-31050);
            }
            if ((var4 & 0x8) != 0) {
                int var7 = class56.field1282.method893((byte) 64);
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = class56.field1282.method879((byte) 45);
                if (var3.field1505 == var7 && var7 != -1) {
                    int var9 = class23.method166(0, var7).field225;
                    if (var9 == 1) {
                        var3.field1467 = 0;
                        var3.field1482 = var8;
                        var3.field1434 = 0;
                        var3.field1498 = 0;
                    }
                    if (var9 == 2) {
                        var3.field1434 = 0;
                    }
                } else if (var7 == -1 || var3.field1505 == -1 || class23.method166(0, var7).field229 >= class23.method166(0, var3.field1505).field229) {
                    var3.field1498 = 0;
                    var3.field1505 = var7;
                    var3.field1444 = var3.field1484;
                    var3.field1482 = var8;
                    var3.field1467 = 0;
                    var3.field1434 = 0;
                }
            }
            if ((var4 & 0x1) != 0) {
                int var10 = class56.field1282.method862(-31050);
                int var11 = class56.field1282.method900((byte) 127);
                var3.method525(class83.field1888, var11, var10, (byte) -8);
                var3.field1455 = class83.field1888 + 300;
                var3.field1448 = class56.field1282.method879((byte) 45);
                var3.field1437 = class56.field1282.method862(-31050);
            }
            if ((var4 & 0x80) != 0) {
                var3.field1489 = class56.field1282.method874(true);
                int var12 = class56.field1282.method877(true);
                var3.field1476 = 0;
                var3.field1473 = var12 >> 16;
                if (var3.field1489 == 65535) {
                    var3.field1489 = -1;
                }
                var3.field1491 = 0;
                var3.field1442 = (var12 & 0xFFFF) + class83.field1888;
                if (var3.field1442 > class83.field1888) {
                    var3.field1491 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field1435 = class56.field1282.method885((byte) -92);
                var3.field1479 = 100;
            }
            if ((var4 & 0x4) != 0) {
                var3.field1996 = class8.method42(class56.field1282.method903(2), 102);
                var3.field1500 = var3.field1996.field2235;
                var3.field1445 = var3.field1996.field2259;
                var3.field1469 = var3.field1996.field2264;
                var3.field1486 = var3.field1996.field2268;
                var3.field1449 = var3.field1996.field2249;
                var3.field1451 = var3.field1996.field2236;
                var3.field1433 = var3.field1996.field2252;
            }
            if ((var4 & 0x10) != 0) {
                var3.field1443 = class56.field1282.method903(2);
                var3.field1477 = class56.field1282.method859(7482);
            }
        }
        field323++;
    }
}
