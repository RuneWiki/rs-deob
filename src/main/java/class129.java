import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class129 {

    @OriginalMember(owner = "client!v", name = "o", descriptor = "[B")
    private byte[] field3091;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "[I")
    private int[] field3083;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "[I")
    private int[] field3085;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field3079 = 0;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "B")
    public static byte field3082 = 0;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "Lgd;")
    public static class40 field3089 = class14.method90(false, " weitere Optionen");

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public static int field3090 = -1;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "Lgd;")
    private static class40 field3078 = class14.method90(false, " from your friend list first");

    @OriginalMember(owner = "client!v", name = "p", descriptor = "Lgd;")
    public static class40 field3092 = class14.method90(false, "rot:");

    @OriginalMember(owner = "client!v", name = "k", descriptor = "Lgd;")
    public static class40 field3087 = field3078;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "Lob;")
    public static class85 field3080;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "[[B")
    public static byte[][] field3086;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "[[Lee;")
    public static class30[][] field3093;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)[Lmb;", line = 6)
    public static final class73[] method1017(byte arg0) {
        field3088++;
        class73[] var1 = new class73[class29.field629];
        if (arg0 != 40) {
            field3092 = null;
        }
        for (int var2 = 0; var2 < class29.field629; var2++) {
            class73 var3 = var1[var2] = new class73();
            var3.field1708 = class99.field2355;
            var3.field1710 = class16.field424;
            var3.field1707 = class122.field2860[var2];
            var3.field1709 = class120.field2842[var2];
            var3.field1706 = class134.field3271[var2];
            var3.field1712 = class30.field754[var2];
            var3.field1705 = class96.field2229;
            var3.field1711 = field3086[var2];
        }
        class107.method825(-13254);
        return var1;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V", line = 46)
    public static void method1018(int arg0) {
        field3087 = null;
        field3092 = null;
        field3080 = null;
        field3093 = null;
        field3078 = null;
        if (arg0 != 0) {
            method1021(-60);
        }
        field3089 = null;
        field3086 = null;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V", line = 63)
    public static final void method1019(byte arg0) {
        field3077++;
        try {
            Graphics var1 = class30.field761.getGraphics();
            int var2 = -103 / ((arg0 + 36) / 61);
            class99.field2365.method465(-55, 4, var1, 550);
        } catch (Exception var3) {
            class30.field761.repaint();
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BI[BII[B)I", line = 85)
    public final int method1020(byte arg0, int arg1, byte[] arg2, int arg3, int arg4, byte[] arg5) {
        if (arg0 != 125) {
            return -94;
        }
        field3084++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg3 + arg4;
        int var9 = arg1;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 < 0) {
                var7 = this.field3085[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field3085[var7]) < 0) {
                arg2[arg3++] = (byte) ~var11;
                if (var8 <= arg3) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field3085[var7];
            }
            int var12;
            if ((var12 = this.field3085[var7]) < 0) {
                arg2[arg3++] = (byte) ~var12;
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field3085[var7];
            }
            int var13;
            if ((var13 = this.field3085[var7]) < 0) {
                arg2[arg3++] = (byte) ~var13;
                if (var8 <= arg3) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field3085[var7];
            }
            int var14;
            if ((var14 = this.field3085[var7]) < 0) {
                arg2[arg3++] = (byte) ~var14;
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field3085[var7];
            }
            int var15;
            if ((var15 = this.field3085[var7]) < 0) {
                arg2[arg3++] = (byte) ~var15;
                if (var8 <= arg3) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field3085[var7];
            }
            int var16;
            if ((var16 = this.field3085[var7]) < 0) {
                arg2[arg3++] = (byte) ~var16;
                if (var8 <= arg3) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field3085[var7];
            }
            int var17;
            if ((var17 = this.field3085[var7]) < 0) {
                arg2[arg3++] = (byte) ~var17;
                if (var8 <= arg3) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field3085[var7];
            }
            int var18;
            if ((var18 = this.field3085[var7]) < 0) {
                arg2[arg3++] = (byte) ~var18;
                if (var8 <= arg3) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg1;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V", line = 274)
    public static final void method1021(int arg0) {
        field3094++;
        class66.field1608.field1823 = 0;
        class18.field441 = 0;
        class49.field1240 = 0;
        class50.field1261 = 0;
        class113.field2737 = 0;
        class103.field2490 = 0;
        class104.field2508 = 0;
        class103.field2465 = 0;
        class52.field1314 = 0;
        class103.field2480 = 0;
        class103.field2463 = 0;
        class70.field1677 = 0;
        class8.field206 = 0;
        class18.field444 = 0;
        class99.field2351 = 0;
        class76.field1738 = 0;
        class135.field3283 = 0;
        class87.field1944 = 0;
        class135.field3289 = 0;
        class91.field2051 = 0;
        class45.field1146 = 0;
        class134.field3263 = 0;
        class4.field94 = 0;
        class31.field787 = 0;
        class14.field364 = 0;
        class41.field1004 = 0;
        class24.field560 = 0;
        class13.field328 = 0;
        class51.field1288 = 0;
        class137.field3349 = 0;
        class96.field2218 = 0;
        class23.field530 = 0;
        class74.field1730 = 0;
        class86.field1909 = 0;
        class93.field2136 = 0;
        class74.field1726 = 0;
        client.field454 = 0;
        class66.field1607 = 0;
        class135.field3297 = 0;
        class63.field1539 = 0;
        class128.field3053 = 0;
        class92.field2085 = 0;
        class1.field5 = 0;
        class118.field2806 = 0;
        class14.field375 = 0;
        class112.field2694 = 0;
        class112.field2689 = 0;
        class22.field513 = 0;
        class1.field16 = 0;
        class40.field967 = 0;
        class70.field1680 = 0;
        class137.field3359 = 0;
        class40.field946 = 0;
        class54.field1365 = 0;
        class87.field1943 = 0;
        class10.field264 = 0;
        class52.field1333 = 0;
        class79.field1818 = 0;
        class12.field312 = 0;
        class87.field1962 = 0;
        class104.field2547 = 0;
        class1.field6 = 0;
        class82.field1850 = 0;
        class98.field2331 = 0;
        class92.field2122 = 0;
        class104.field2543 = 0;
        class130.field3110 = 0;
        class65.field1587 = 0;
        class104.field2532 = 0;
        class34.field853 = 0;
        class99.field2356 = 0;
        class31.field780 = 0;
        field3094 = 0;
        class104.field2553 = 0;
        class13.field321 = 0;
        class2.field36 = 0;
        class99.field2353 = 0;
        class104.field2564 = 0;
        class94.field2181 = 0;
        class55.field1432 = 0;
        class82.field1859 = 0;
        class130.field3095 = 0;
        class60.field1510 = 0;
        class86.field1912 = 0;
        class14.field372 = 0;
        class104.field2528 = 0;
        class4.field77 = 0;
        class59.field1492 = 0;
        class22.field524 = 0;
        class107.field2605 = 0;
        class11.field277 = 0;
        class51.field1287 = 0;
        class91.field2055 = 0;
        class101.field2396 = 0;
        class49.field1235 = 0;
        class23.field535 = 0;
        class14.field358 = 0;
        class98.field2321 = 0;
        class104.field2520 = 0;
        class118.field2794 = 0;
        class66.field1625 = 0;
        class40.field981 = 0;
        class87.field1965 = 0;
        class31.field788 = 0;
        class91.field2060 = 0;
        class104.field2541 = 0;
        class65.field1585 = 0;
        class22.field493 = 0;
        class76.field1742 = 0;
        class70.field1690 = 0;
        class83.field1865 = 0;
        class128.field3042 = 0;
        class42.field1047 = 0;
        class133.field3239 = 0;
        class50.field1273 = 0;
        class43.field1078 = 0;
        class41.field1010 = 0;
        class66.field1621 = 0;
        class82.field1861 = 0;
        class40.field983 = 0;
        class94.field2158 = 0;
        class9.field225 = 0;
        class58.field1476 = 0;
        class103.field2458 = 0;
        class7.field184 = 0;
        class94.field2160 = 0;
        class92.field2108 = 0;
        class24.field557 = 0;
        class92.field2091 = 0;
        class96.field2224 = 0;
        class101.field2393 = 0;
        class40.field957 = 0;
        class136.field3326 = 0;
        class44.field1112 = 0;
        class122.field2870 = 0;
        class135.field3291 = 0;
        class99.field2343 = 0;
        class126.field3003 = 0;
        class114.field2747 = 0;
        class40.field974 = 0;
        client.field448 = 0;
        class2.field31 = 0;
        class65.field1606 = 0;
        class60.field1506 = 0;
        class30.field673 = 0;
        class93.field2154 = 0;
        class103.field2444 = 0;
        class29.field623 = 0;
        class55.field1420 = 0;
        class135.field3311 = 0;
        class8.field208 = 0;
        class79.field1800 = 0;
        class40.field978 = 0;
        class82.field1857 = 0;
        class29.field619 = 0;
        class94.field2179 = 0;
        class90.field2032 = 0;
        class112.field2709 = 0;
        class103.field2449 = 0;
        class103.field2484 = 0;
        class134.field3256 = 0;
        class104.field2550 = 0;
        class79.field1819 = 0;
        class63.field1542 = 0;
        class137.field3347 = 0;
        class96.field2211 = 0;
        class120.field2821 = 0;
        class59.field1490 = 0;
        class87.field1937 = 0;
        class24.field551 = 0;
        class65.field1604 = 0;
        class18.field439 = 0;
        class99.field2359 = 0;
        class63.field1549 = 0;
        class98.field2332 = 0;
        class38.field928 = 0;
        class104.field2567 = 0;
        class99.field2344 = 0;
        class4.field121 = 0;
        class14.field354 = 0;
        class110.field2675 = 0;
        class125.field2975 = 0;
        class45.field1154 = 0;
        class42.field1049 = 0;
        class49.field1258 = 0;
        class104.field2534 = 0;
        class104.field2552 = 0;
        class120.field2835 = 0;
        class136.field3320 = 0;
        class74.field1719 = 0;
        class101.field2390 = 0;
        class67.field1644 = 0;
        class7.field173 = 0;
        class1.field8 = 0;
        class130.field3111 = 0;
        client.field452 = 0;
        class4.field112 = 0;
        class103.field2491 = 0;
        class44.field1116 = 0;
        class93.field2145 = 0;
        class14.field380 = 0;
        class7.field175 = 0;
        class29.field613 = 0;
        class11.field279 = 0;
        class4.field123 = 0;
        class40.field959 = 0;
        class31.field772 = 0;
        class104.field2535 = 0;
        class99.field2347 = 0;
        class104.field2569 = 0;
        class104.field2505 = 0;
        class103.field2448 = 0;
        class96.field2230 = 0;
        class34.field870 = 0;
        class12.field310 = 0;
        class42.field1059 = 0;
        class50.field1266 = 0;
        class118.field2789 = 0;
        class8.field217 = 0;
        class55.field1424 = 0;
        class66.field1614 = 0;
        class130.field3113 = 0;
        class45.field1131 = 0;
        class106.field2584 = 0;
        class7.field187 = 0;
        class40.field982 = 0;
        class130.field3105 = 0;
        class40.field956 = 0;
        class130.field3112 = 0;
        class98.field2329 = 0;
        class108.field2640 = 0;
        class89.field2024 = 0;
        class85.field1907 = 0;
        class4.field142 = 0;
        class86.field1921 = 0;
        class40.field987 = 0;
        class79.field1814 = 0;
        class66.field1611 = 0;
        class54.field1385 = 0;
        class89.field2005 = 0;
        class45.field1162 = 0;
        class45.field1144 = 0;
        class66.field1612 = 0;
        class40.field960 = 0;
        class65.field1593 = 0;
        class99.field2340 = 0;
        class93.field2143 = 0;
        class4.field143 = 0;
        class87.field1951 = 0;
        class104.field2538 = 0;
        class30.field706 = 0;
        class40.field989 = 0;
        client.field450 = 0;
        class115.field2781 = 0;
        class45.field1132 = 0;
        class114.field2749 = 0;
        class51.field1289 = 0;
        class50.field1275 = 0;
        class63.field1547 = 0;
        class41.field1006 = 0;
        class45.field1160 = 0;
        class55.field1409 = 0;
        class126.field3011 = 0;
        client.field458 = 0;
        class58.field1472 = 0;
        class125.field2979 = 0;
        class76.field1759 = 0;
        class108.field2637 = 0;
        class42.field1056 = 0;
        class135.field3298 = 0;
        class18.field433 = 0;
        class13.field325 = 0;
        class94.field2175 = 0;
        class103.field2467 = 0;
        class122.field2878 = 0;
        class18.field437 = 0;
        class45.field1156 = 0;
        class5.field152 = 0;
        class104.field2521 = 0;
        class77.field1780 = 0;
        class14.field369 = 0;
        class82.field1863 = 0;
        class1.field12 = 0;
        class43.field1085 = 0;
        class43.field1089 = 0;
        class14.field385 = 0;
        class94.field2177 = 0;
        class64.field1568 = 0;
        class43.field1071 = 0;
        class31.field789 = 0;
        class51.field1294 = 0;
        class77.field1782 = 0;
        class118.field2797 = 0;
        class7.field172 = 0;
        class96.field2226 = 0;
        class40.field997 = 0;
        class34.field878 = 0;
        class9.field238 = 0;
        class67.field1651 = 0;
        class18.field443 = 0;
        class29.field625 = 0;
        class92.field2127 = 0;
        class126.field3002 = 0;
        class104.field2555 = 0;
        class11.field285 = 0;
        class44.field1119 = 0;
        class87.field1946 = 0;
        class44.field1109 = 0;
        class89.field2003 = 0;
        class104.field2527 = 0;
        class40.field984 = 0;
        class91.field2069 = 0;
        class30.field633 = 0;
        class1.field14 = 0;
        class64.field1560 = 0;
        class104.field2500 = 0;
        class104.field2517 = 0;
        class137.field3354 = 0;
        field3084 = 0;
        class43.field1087 = 0;
        class79.field1805 = 0;
        class21.field482 = 0;
        class14.field408 = 0;
        class135.field3280 = 0;
        class115.field2766 = 0;
        class56.field1454 = 0;
        class87.field1963 = 0;
        class92.field2090 = 0;
        class40.field951 = 0;
        class93.field2140 = 0;
        class51.field1291 = 0;
        class4.field92 = 0;
        class50.field1267 = 0;
        class80.field1830 = 0;
        class104.field2515 = 0;
        class76.field1741 = 0;
        class51.field1298 = 0;
        class40.field953 = 0;
        class77.field1791 = 0;
        class132.field3233 = 0;
        class24.field559 = 0;
        class104.field2540 = 0;
        class4.field104 = 0;
        class135.field3279 = 0;
        class98.field2316 = 0;
        class118.field2803 = 0;
        class22.field497 = 0;
        class40.field958 = 0;
        class122.field2869 = 0;
        class85.field1903 = 0;
        class89.field2006 = 0;
        class135.field3294 = 0;
        class91.field2068 = 0;
        class92.field2089 = 0;
        class118.field2800 = 0;
        class12.field303 = 0;
        class115.field2773 = 0;
        class112.field2711 = 0;
        class113.field2734 = 0;
        class135.field3304 = 0;
        class104.field2504 = 0;
        class106.field2591 = 0;
        class103.field2489 = 0;
        class70.field1685 = 0;
        class118.field2799 = 0;
        class128.field3038 = 0;
        class70.field1686 = 0;
        class40.field975 = 0;
        class87.field1975 = 0;
        class67.field1641 = 0;
        class23.field534 = 0;
        class66.field1631 = 0;
        class88.field1994 = 0;
        class24.field563 = 0;
        class49.field1245 = 0;
        class104.field2497 = 0;
        class44.field1113 = 0;
        class133.field3236 = 0;
        class118.field2801 = 0;
        class128.field3025 = 0;
        class104.field2526 = 0;
        class134.field3264 = 0;
        class48.field1229 = 0;
        class137.field3351 = 0;
        class11.field294 = 0;
        class106.field2594 = 0;
        class128.field3021 = 0;
        class22.field496 = 0;
        class126.field2998 = 0;
        class103.field2459 = 0;
        class40.field952 = 0;
        class87.field1938 = 0;
        class40.field969 = 0;
        class50.field1274 = 0;
        class104.field2513 = 0;
        class87.field1942 = 0;
        class112.field2708 = 0;
        class122.field2866 = 0;
        class64.field1567 = 0;
        class34.field876 = 0;
        class11.field276 = 0;
        class108.field2635 = 0;
        client.field455 = 0;
        class113.field2727 = 0;
        class77.field1774 = 0;
        class91.field2066 = 0;
        class134.field3261 = 0;
        class48.field1203 = 0;
        class91.field2074 = 0;
        class55.field1437 = 0;
        class112.field2699 = 0;
        class90.field2033 = 0;
        class104.field2531 = 0;
        class63.field1546 = 0;
        class64.field1570 = 0;
        class86.field1932 = 0;
        class104.field2545 = 0;
        class48.field1211 = 0;
        class87.field1980 = 0;
        class131.field3172 = 0;
        class99.field2345 = 0;
        class30.field757 = 0;
        class110.field2674 = 0;
        class4.field84 = 0;
        class133.field3248 = 0;
        class104.field2544 = 0;
        class96.field2223 = 0;
        class99.field2348 = 0;
        class43.field1081 = 0;
        class104.field2557 = 0;
        class58.field1480 = 0;
        class40.field966 = 0;
        class135.field3295 = 0;
        class92.field2115 = 0;
        class42.field1063 = 0;
        class92.field2092 = 0;
        class135.field3303 = 0;
        class83.field1869 = 0;
        class12.field314 = 0;
        class35.field882 = 0;
        class40.field979 = 0;
        class136.field3313 = 0;
        client.field449 = 0;
        class40.field990 = 0;
        class43.field1072 = 0;
        class104.field2499 = 0;
        class130.field3114 = 0;
        class130.field3101 = 0;
        class99.field2366 = 0;
        class118.field2805 = 0;
        class99.field2341 = 0;
        class92.field2088 = 0;
        class23.field527 = 0;
        class103.field2456 = 0;
        class24.field561 = 0;
        class65.field1605 = 0;
        class77.field1770 = 0;
        class7.field192 = 0;
        class104.field2511 = 0;
        class113.field2741 = 0;
        class94.field2167 = 0;
        class77.field1777 = 0;
        class92.field2093 = 0;
        class91.field2064 = 0;
        class92.field2086 = 0;
        class53.field1337 = 0;
        class9.field236 = 0;
        class94.field2176 = 0;
        class125.field2953 = 0;
        class58.field1470 = 0;
        class118.field2796 = 0;
        class65.field1594 = 0;
        class134.field3255 = 0;
        class48.field1201 = 0;
        class137.field3352 = 0;
        class35.field884 = 0;
        class87.field1958 = 0;
        class122.field2868 = 0;
        class59.field1487 = 0;
        class96.field2209 = 0;
        class104.field2498 = 0;
        class76.field1753 = 0;
        class103.field2451 = 0;
        class44.field1117 = 0;
        class83.field1887 = 0;
        class55.field1403 = 0;
        class110.field2679 = 0;
        class112.field2714 = 0;
        class79.field1796 = 0;
        client.field460 = 0;
        class107.field2619 = 0;
        class80.field1833 = 0;
        class87.field1960 = 0;
        class77.field1773 = 0;
        class40.field973 = 0;
        class87.field1967 = 0;
        class89.field2016 = 0;
        class31.field802 = 0;
        class135.field3305 = 0;
        class58.field1483 = 0;
        class125.field2964 = 0;
        class87.field1971 = 0;
        class89.field2025 = 0;
        class13.field335 = 0;
        class24.field580 = 0;
        class13.field334 = 0;
        class118.field2795 = 0;
        class132.field3194 = 0;
        class82.field1845 = 0;
        class126.field3013 = 0;
        class104.field2558 = 0;
        class136.field3328 = 0;
        class23.field529 = 0;
        class106.field2595 = 0;
        class64.field1565 = 0;
        class38.field922 = 0;
        class112.field2721 = 0;
        class76.field1740 = 0;
        class22.field518 = 0;
        class70.field1688 = 0;
        class40.field955 = 0;
        field3077 = 0;
        class128.field3031 = 0;
        class38.field931 = 0;
        class126.field3009 = 0;
        class21.field481 = 0;
        class35.field881 = 0;
        class56.field1445 = 0;
        class94.field2170 = 0;
        class4.field85 = 0;
        class108.field2632 = 0;
        class99.field2338 = 0;
        class58.field1481 = 0;
        if (arg0 <= 31) {
            field3079 = -20;
        }
        class104.field2561 = 0;
        class22.field515 = 0;
        class58.field1471 = 0;
        class40.field970 = 0;
        class30.field651 = 0;
        client.field462 = 0;
        class45.field1147 = 0;
        class87.field1961 = 0;
        class40.field977 = 0;
        class48.field1208 = 0;
        class137.field3356 = 0;
        class48.field1202 = 0;
        class40.field992 = 0;
        class42.field1042 = 0;
        class80.field1827 = 0;
        class103.field2488 = 0;
        class87.field1968 = 0;
        class65.field1603 = 0;
        class42.field1032 = 0;
        class113.field2723 = 0;
        class12.field305 = 0;
        class104.field2516 = 0;
        class51.field1292 = 0;
        client.field461 = 0;
        class114.field2757 = 0;
        class104.field2537 = 0;
        class88.field1990 = 0;
        class59.field1495 = 0;
        class74.field1716 = 0;
        class104.field2560 = 0;
        class40.field993 = 0;
        class135.field3302 = 0;
        class134.field3258 = 0;
        class103.field2483 = 0;
        class104.field2514 = 0;
        class131.field3170 = 0;
        class8.field207 = 0;
        class82.field1849 = 0;
        class24.field568 = 0;
        class113.field2738 = 0;
        class12.field315 = 0;
        class101.field2386 = 0;
        class114.field2754 = 0;
        class40.field996 = 0;
        class131.field3182 = 0;
        field3088 = 0;
        class48.field1200 = 0;
        class58.field1474 = 0;
        class65.field1596 = 0;
        class31.field782 = 0;
        class104.field2525 = 0;
        class104.field2509 = 0;
        class92.field2118 = 0;
        class96.field2221 = 0;
        class104.field2566 = 0;
        class133.field3252 = 0;
        class4.field81 = 0;
        class87.field1979 = 0;
        class23.field537 = 0;
        class131.field3176 = 0;
        class34.field877 = 0;
        class1.field4 = 0;
        class87.field1955 = 0;
        class104.field2542 = 0;
        class14.field404 = 0;
        class43.field1073 = 0;
        class90.field2034 = 0;
        class89.field2023 = 0;
        class48.field1214 = 0;
        class40.field986 = 0;
        class10.field244 = 0;
        class100.field2379 = 0;
        class136.field3317 = 0;
        class104.field2502 = 0;
        class44.field1099 = 0;
        class87.field1964 = 0;
        class40.field954 = 0;
        class44.field1102 = 0;
        class94.field2156 = 0;
        class108.field2629 = 0;
        class61.field1528 = 0;
        class30.field729 = 0;
        class40.field991 = 0;
        class45.field1153 = 0;
        class49.field1246 = 0;
        class24.field556 = 0;
        class29.field631 = 0;
        class51.field1296 = 0;
        class99.field2352 = 0;
        class89.field2010 = 0;
        class125.field2981 = 0;
        class135.field3310 = 0;
        class92.field2087 = 0;
        class118.field2804 = 0;
        class132.field3193 = 0;
        class104.field2518 = 0;
        class130.field3099 = 0;
        class50.field1271 = 0;
        class22.field512 = 0;
        class1.field15 = 0;
        class112.field2718 = 0;
        class107.field2599 = 0;
        class87.field1953 = 0;
        class94.field2172 = 0;
        class82.field1864 = 0;
        class60.field1514 = 0;
        class112.field2712 = 0;
        class40.field994 = 0;
        class76.field1743 = 0;
        class103.field2455 = 0;
        class113.field2729 = 0;
        class76.field1739 = 0;
        class43.field1093 = 0;
        class40.field947 = 0;
        class48.field1213 = 0;
        client.field463 = 0;
        class61.field1522 = 0;
        class9.field230 = 0;
        class1.field2 = 0;
        class76.field1737 = 0;
        class104.field2501 = 0;
        class96.field2228 = 0;
        class104.field2510 = 0;
        class104.field2556 = 0;
        class112.field2692 = 0;
        class128.field3041 = 0;
        class104.field2533 = 0;
        class122.field2882 = 0;
        class118.field2793 = 0;
        class103.field2475 = 0;
        class91.field2061 = 0;
        class66.field1609 = 0;
        class94.field2164 = 0;
        class42.field1066 = 0;
        class35.field890 = 0;
        client.field451 = 0;
        class40.field988 = 0;
        class50.field1265 = 0;
        class107.field2614 = 0;
        class52.field1318 = 0;
        class103.field2482 = 0;
        class120.field2837 = 0;
        class107.field2598 = 0;
        class8.field211 = 0;
        class89.field2012 = 0;
        class80.field1829 = 0;
        class134.field3259 = 0;
        class30.field712 = 0;
        class40.field961 = 0;
        class136.field3315 = 0;
        class103.field2452 = 0;
        class4.field125 = 0;
        class45.field1149 = 0;
        class91.field2050 = 0;
        class53.field1345 = 0;
        class135.field3287 = 0;
        class64.field1556 = 0;
        class52.field1317 = 0;
        class14.field389 = 0;
        class21.field480 = 0;
        class41.field1007 = 0;
        class45.field1157 = 0;
        class87.field1945 = 0;
        class48.field1206 = 0;
        class103.field2466 = 0;
        class83.field1868 = 0;
        class64.field1554 = 0;
        class86.field1916 = 0;
        class12.field308 = 0;
        class101.field2397 = 0;
        class65.field1577 = 0;
        class104.field2523 = 0;
        class58.field1482 = 0;
        class74.field1732 = 0;
        class14.field382 = 0;
        class66.field1630 = 0;
        class79.field1795 = 0;
        class122.field2873 = 0;
        class96.field2207 = 0;
        class41.field1011 = 0;
        class7.field168 = 0;
        class13.field329 = 0;
        class125.field2971 = 0;
        client.field457 = 0;
        class50.field1276 = 0;
        class2.field41 = 0;
        class40.field964 = 0;
        class103.field2443 = 0;
        class82.field1847 = 0;
        class106.field2571 = 0;
        class112.field2702 = 0;
        class107.field2611 = 0;
        class104.field2536 = 0;
        class132.field3208 = 0;
        class7.field180 = 0;
        class87.field1959 = 0;
        class69.field1661 = 0;
        class34.field879 = 0;
        class45.field1135 = 0;
        class91.field2062 = 0;
        class136.field3324 = 0;
        class14.field390 = 0;
        class87.field1974 = 0;
        class89.field2017 = 0;
        class103.field2468 = 0;
        class48.field1204 = 0;
        class130.field3108 = 0;
        class128.field3067 = 0;
        class21.field483 = 0;
        class43.field1076 = 0;
        class115.field2759 = 0;
        class136.field3321 = 0;
        class87.field1941 = 0;
        class90.field2045 = 0;
        class120.field2814 = 0;
        class24.field558 = 0;
        class23.field528 = 0;
        class74.field1718 = 0;
        class14.field378 = 0;
        class40.field980 = 0;
        class133.field3253 = 0;
        class40.field965 = 0;
        class55.field1442 = 0;
        class86.field1924 = 0;
        class110.field2670 = 0;
        class88.field1986 = 0;
        class87.field1940 = 0;
        class87.field1973 = 0;
        class128.field3055 = 0;
        class94.field2180 = 0;
        class34.field860 = 0;
        class65.field1586 = 0;
        class12.field304 = 0;
        class24.field574 = 0;
        class110.field2672 = 0;
        class4.field124 = 0;
        class9.field231 = 0;
        class31.field773 = 0;
        class43.field1094 = 0;
        field3081 = 0;
        class101.field2402 = 0;
        class54.field1393 = 0;
        class31.field801 = 0;
        class31.field769 = 0;
        class44.field1106 = 0;
        class30.field714 = 0;
        class137.field3361 = 0;
        class49.field1251 = 0;
        class50.field1269 = 0;
        class100.field2380 = 0;
        client.field456 = 0;
        class89.field2013 = 0;
        class137.field3346 = 0;
        class135.field3276 = 0;
        class58.field1478 = 0;
        class104.field2559 = 0;
        class8.field199 = 0;
        class87.field1978 = 0;
        class48.field1210 = 0;
        class126.field2988 = 0;
        class22.field495 = 0;
        class112.field2715 = 0;
        class61.field1515 = 0;
        class87.field1949 = 0;
        class87.field1970 = 0;
        class8.field204 = 0;
        class23.field539 = 0;
        client.field453 = 0;
        class91.field2063 = 0;
        class18.field442 = 0;
        class128.field3064 = 0;
        class99.field2342 = 0;
        class134.field3266 = 0;
        class87.field1936 = 0;
        class4.field98 = 0;
        class134.field3265 = 0;
        class118.field2791 = 0;
        class13.field326 = 0;
        class104.field2530 = 0;
        class126.field3019 = 0;
        class136.field3323 = 0;
        class13.field340 = 0;
        class40.field949 = 0;
        class42.field1035 = 0;
        class42.field1036 = 0;
        class74.field1731 = 0;
        class69.field1662 = 0;
        class89.field2027 = 0;
        class40.field985 = 0;
        class103.field2445 = 0;
        class29.field627 = 0;
        class50.field1262 = 0;
        class52.field1330 = 0;
        class104.field2507 = 0;
        class134.field3257 = 0;
        class99.field2339 = 0;
        class115.field2777 = 0;
        class134.field3268 = 0;
        class94.field2159 = 0;
        class90.field2031 = 0;
        class112.field2691 = 0;
        class131.field3175 = 0;
        class89.field2015 = 0;
        class130.field3107 = 0;
        class103.field2472 = 0;
        class65.field1600 = 0;
        class98.field2328 = 0;
        class113.field2722 = 0;
        class29.field626 = 0;
        class38.field932 = 0;
        class126.field3006 = 0;
        class83.field1867 = 0;
        class67.field1652 = 0;
        class103.field2486 = 0;
        class104.field2549 = 0;
        class89.field2028 = 0;
        class115.field2765 = 0;
        class87.field1966 = 0;
        class55.field1423 = 0;
        class77.field1792 = 0;
        class128.field3056 = 0;
        class58.field1473 = 0;
        class135.field3277 = 0;
        class104.field2503 = 0;
        class112.field2697 = 0;
        class58.field1479 = 0;
        class92.field2103 = 0;
        class51.field1297 = 0;
        class99.field2368 = 0;
        class91.field2071 = 0;
        class104.field2522 = 0;
        class66.field1620 = 0;
        class49.field1234 = 0;
        class104.field2565 = 0;
        class54.field1366 = 0L;
        class89.field2014 = true;
        class50.field1268 = true;
        class118.method903(2);
        class48.field1231 = 0;
        class92.field2094.field2563 = 0;
        class82.field1856 = 0;
        class53.field1348 = -1;
        class44.field1115 = -1;
        class96.field2205 = 0;
        class99.field2358 = -1;
        class113.field2736 = -1;
        class100.field2376.field2563 = 0;
        class70.field1675 = 0;
        class30.field661 = 0;
        class90.field2040 = false;
        class134.method1047(0, 8);
        for (int var1 = 0; var1 < 100; var1++) {
            class30.field664[var1] = null;
        }
        class1.field18 = 0;
        class125.field2967 = 0;
        class137.field3344 = 0;
        class87.field1948 = (int) (Math.random() * 80.0D) - 40;
        class31.field771 = 0;
        class48.field1221 = 0;
        class2.field43 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        class42.field1041 = (int) (Math.random() * 120.0D) - 60;
        field3090 = -1;
        class110.field2682 = 0;
        class23.field548 = 0;
        class132.field3210 = 0;
        class63.field1541 = (int) (Math.random() * 30.0D) - 20;
        class70.field1695 = (int) (Math.random() * 100.0D) - 50;
        class34.field868 = (int) (Math.random() * 110.0D) - 55;
        for (int var2 = 0; var2 < 2048; var2++) {
            class90.field2044[var2] = null;
            class35.field897[var2] = null;
        }
        for (int var3 = 0; var3 < 32768; var3++) {
            class130.field3142[var3] = null;
        }
        class13.field332 = class90.field2044[2047] = new class96();
        class23.field540.method585((byte) 124);
        class88.field1991.method585((byte) 63);
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var9 = 0; var9 < 104; var9++) {
                    class59.field1494[var4][var8][var9] = null;
                }
            }
        }
        class131.field3179 = new class89();
        class137.field3337 = 0;
        class7.field181 = 0;
        for (int var5 = 0; var5 < class87.field1956; var5++) {
            class114 var7 = class103.method746(16, var5);
            if (var7 != null && var7.field2753 == 0) {
                class86.field1931[var5] = 0;
                class48.field1209[var5] = 0;
            }
        }
        class130.method1030(class69.field1671, (byte) -98);
        class69.field1671 = -1;
        class130.method1030(class108.field2624, (byte) -72);
        class108.field2624 = -1;
        class130.method1030(class131.field3169, (byte) -123);
        class131.field3169 = -1;
        class130.method1030(class94.field2161, (byte) -45);
        class94.field2161 = -1;
        class130.method1030(class103.field2493, (byte) -32);
        class103.field2493 = -1;
        class130.method1030(class18.field440, (byte) -30);
        class18.field440 = -1;
        class130.method1030(class86.field1935, (byte) -115);
        class53.field1347 = 0;
        class86.field1935 = -1;
        class135.field3285 = null;
        class87.field1957 = false;
        class90.field2040 = false;
        class92.field2099 = 0;
        class126.field3014 = 3;
        class112.field2705 = -1;
        class56.field1447 = -1;
        class30.field634.method862(-1, null, 256, false, new int[5]);
        for (int var6 = 0; var6 < 5; var6++) {
            class13.field337[var6] = null;
            class30.field719[var6] = false;
        }
        class8.method43(119);
        class83.field1879 = true;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I[BI[BIZ)I", line = 1292)
    public final int method1022(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, boolean arg5) {
        if (!arg5) {
            return 95;
        }
        field3081++;
        int var7 = arg0 + arg2;
        int var8 = 0;
        int var9 = arg4 << 3;
        while (arg2 < var7) {
            int var10 = arg1[arg2] & 0xFF;
            int var11 = this.field3083[var10];
            byte var12 = this.field3091[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            var9 += var12;
            int var15 = var8 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg3[var13] = (byte) (var8 = class43.method294(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg3[var13] = (byte) (var8 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg3[var13] = (byte) (var8 = var11 >>> var14);
                    if (var16 > var13) {
                        var14 -= 8;
                        var13++;
                        arg3[var13] = (byte) (var8 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg3[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg2++;
        }
        return (var9 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "([B)V", line = 1360)
    public class129(byte[] arg0) {
        int[] var2 = new int[33];
        int var3 = 0;
        int var4 = arg0.length;
        this.field3091 = arg0;
        this.field3083 = new int[var4];
        this.field3085 = new int[8];
        for (int var5 = 0; var5 < var4; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var2[var6];
                this.field3083[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var2[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var2[var10] = var2[var10 - 1];
                            break;
                        }
                        var2[var10] = class43.method294(var11, var12);
                    }
                } else {
                    var9 = var2[var6 - 1];
                }
                var2[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var2[var13] == var8) {
                        var2[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field3085[var14] == 0) {
                            this.field3085[var14] = var3;
                        }
                        var14 = this.field3085[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field3085.length) {
                        int[] var18 = new int[this.field3085.length * 2];
                        for (int var19 = 0; var19 < this.field3085.length; var19++) {
                            var18[var19] = this.field3085[var19];
                        }
                        this.field3085 = var18;
                    }
                }
                this.field3085[var14] = ~var5;
                if (var14 >= var3) {
                    var3 = var14 + 1;
                }
            }
        }
    }
}
