import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class126 {

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "Lo;")
    public static class84 field2782 = class15.method124("p12_full", 255);

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static volatile int field2784 = 0;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "Lo;")
    public static class84 field2792 = class15.method124(":tradereq:", 255);

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "Lo;")
    public static class84 field2788 = class15.method124("mapdots", 255);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "Lo;")
    public static class84 field2779 = class15.method124("backleft1", 255);

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "Lo;")
    public static class84 field2793 = class15.method124("attack", 255);

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "Lba;")
    public static class8 field2783 = new class8(4096);

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "Ld;")
    public static class19 field2781;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "Lk;")
    public static class60 field2795;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "[[B")
    public static byte[][] field2794;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZZI)I", line = 5)
    public static final int method969(boolean arg0, boolean arg1, int arg2) {
        field2785++;
        int var3 = arg2;
        if (arg1) {
            var3 = class3.field33 + class115.field2495 + arg2;
        }
        if (arg0) {
            var3 += class51.field1091 + class112.field2435;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)Lhb;", line = 22)
    public static final class44 method970(int arg0, int arg1) {
        int var2 = 83 % ((arg0 - 10) / 40);
        field2780++;
        class44 var3 = (class44) class99.field2100.method737((long) arg1, (byte) -101);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class48.field1009.method909((byte) -126, arg1, 10);
        class44 var5 = new class44();
        var5.field924 = arg1;
        if (var4 != null) {
            var5.method389(0, new class27(var4));
        }
        var5.method381(13225);
        if (var5.field895 != -1) {
            var5.method386(127, method970(-122, var5.field927), method970(98, var5.field895));
        }
        if (!class50.field1086 && var5.field884) {
            var5.field889 = null;
            var5.field904 = null;
            var5.field921 = class11.field222;
            var5.field903 = class30.field596;
            var5.field917 = 0;
        }
        class99.field2100.method744(-124, (long) arg1, var5);
        return var5;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V", line = 64)
    public static void method971(int arg0) {
        field2795 = null;
        if (arg0 != 0) {
            return;
        }
        field2782 = null;
        field2783 = null;
        field2792 = null;
        field2779 = null;
        field2788 = null;
        field2793 = null;
        field2794 = null;
        field2781 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V", line = 82)
    public static final void method972(byte arg0) {
        class14.field248 = true;
        class6.field101 = 0L;
        field2787++;
        class75.field1626 = 0;
        class116.field2513 = true;
        class40.field804 = 0;
        class97.field2078 = 0;
        class75.field1635 = 0;
        class61.field1278 = 0;
        class109.field2361 = 0;
        class19.field365 = 0;
        class27.field481 = 0;
        client.field332 = 0;
        class3.field37 = 0;
        class117.field2560 = 0;
        class128.field2818 = 0;
        class57.field1186 = 0;
        class33.field644 = 0;
        class84.field1888 = 0;
        class37.field730 = 0;
        class27.field515 = 0;
        class15.field273 = 0;
        class125.field2769 = 0;
        class24.field402 = 0;
        class123.field2745 = 0;
        class101.field2144 = 0;
        class84.field1894 = 0;
        class42.field858 = 0;
        class31.field629 = 0;
        class118.field2607 = 0;
        class109.field2368 = 0;
        class14.field252 = 0;
        class27.field491 = 0;
        class8.field144 = 0;
        class62.field1288 = 0;
        class128.field2835 = 0;
        class99.field2097 = 0;
        class8.field169 = 0;
        class24.field398 = 0;
        class117.field2563 = 0;
        class89.field2020 = 0;
        class39.field757 = 0;
        class38.field747 = 0;
        class122.field2720 = 0;
        class27.field510 = 0;
        class93.field2032 = 0;
        class84.field1877 = 0;
        class118.field2601 = 0;
        class27.field532 = 0;
        class25.field409 = 0;
        class45.field951 = 0;
        class60.field1246 = 0;
        class27.field475 = 0;
        class14.field250 = 0;
        class1.field7 = 0;
        class60.field1253 = 0;
        class33.field664 = 0;
        class86.field1951 = 0;
        class30.field586 = 0;
        class27.field534 = 0;
        class101.field2154 = 0;
        class104.field2191 = 0;
        class128.field2834 = 0;
        class44.field876 = 0;
        class127.field2796 = 0;
        class37.field725 = 0;
        class71.field1503 = 0;
        class60.field1237 = 0;
        class39.field778 = 0;
        class39.field793 = 0;
        class82.field1759 = 0;
        class127.field2802 = 0;
        class110.field2382 = 0;
        class58.field1205 = 0;
        class88.field1995 = 0;
        class27.field470 = 0;
        class28.field540 = 0;
        class99.field2098 = 0;
        class41.field832 = 0;
        class118.field2598 = 0;
        class17.field307 = 0;
        class60.field1252 = 0;
        class39.field802 = 0;
        class80.field1729 = 0;
        class113.field2452 = 0;
        class80.field1697 = 0;
        class106.field2245 = 0;
        class27.field500 = 0;
        class106.field2238 = 0;
        class11.field210 = 0;
        class65.field1422 = 0;
        class6.field112 = 0;
        class106.field2248 = 0;
        class123.field2741 = 0;
        class79.field1678 = 0;
        class82.field1756 = 0;
        class49.field1015 = 0;
        class19.field357 = 0;
        class100.field2116 = 0;
        client.field328 = 0;
        class85.field1937 = 0;
        class44.field882 = 0;
        class61.field1263 = 0;
        class15.field279 = 0;
        class80.field1727 = 0;
        class128.field2832 = 0;
        class85.field1931 = 0;
        class33.field645 = 0;
        class112.field2421 = 0;
        class31.field630 = 0;
        class116.field2521 = 0;
        class118.field2595 = 0;
        class71.field1496 = 0;
        class88.field1992 = 0;
        class33.field661 = 0;
        class16.field288 = 0;
        class27.field509 = 0;
        class67.field1455 = 0;
        class84.field1909 = 0;
        client.field336 = 0;
        class64.field1343 = 0;
        class48.field1000 = 0;
        class27.field517 = 0;
        class14.field256 = 0;
        class97.field2079 = 0;
        class118.field2603 = 0;
        class127.field2807 = 0;
        field2786 = 0;
        class120.field2690 = 0;
        class75.field1621 = 0;
        class58.field1197 = 0;
        class12.field233 = 0;
        class79.field1685 = 0;
        class111.field2397 = 0;
        class49.field1027 = 0;
        class118.field2623 = 0;
        class49.field1022 = 0;
        class26.field449 = 0;
        class101.field2149 = 0;
        class82.field1762 = 0;
        class84.field1897 = 0;
        class27.field471 = 0;
        class6.field109 = 0;
        class119.field2645 = 0;
        class113.field2447 = 0;
        class119.field2640 = 0;
        class38.field735 = 0;
        class84.field1903 = 0;
        class45.field958 = 0;
        class36.field710 = 0;
        class4.field58 = 0;
        class57.field1174 = 0;
        client.field331 = 0;
        class119.field2639 = 0;
        class17.field314 = 0;
        class27.field518 = 0;
        class84.field1868 = 0;
        class84.field1875 = 0;
        class82.field1757 = 0;
        class114.field2470 = 0;
        class119.field2642 = 0;
        class110.field2384 = 0;
        class35.field701 = 0;
        class125.field2772 = 0;
        class5.field82 = 0;
        class115.field2494 = 0;
        class107.field2264 = 0;
        class104.field2187 = 0;
        class57.field1167 = 0;
        class61.field1264 = 0;
        class27.field508 = 0;
        class8.field166 = 0;
        class6.field114 = 0;
        class103.field2168 = 0;
        class119.field2648 = 0;
        class40.field809 = 0;
        class113.field2442 = 0;
        class110.field2380 = 0;
        class115.field2502 = 0;
        class104.field2192 = 0;
        class44.field892 = 0;
        class97.field2066 = 0;
        class8.field162 = 0;
        class125.field2773 = 0;
        class88.field1985 = 0;
        class75.field1603 = 0;
        class19.field350 = 0;
        class80.field1716 = 0;
        class27.field476 = 0;
        class37.field724 = 0;
        class1.field16 = 0;
        class69.field1478 = 0;
        client.field334 = 0;
        class118.field2580 = 0;
        class118.field2573 = 0;
        class5.field91 = 0;
        field2790 = 0;
        class27.field512 = 0;
        class27.field489 = 0;
        class116.field2516 = 0;
        class106.field2241 = 0;
        class4.field62 = 0;
        class19.field356 = 0;
        class3.field34 = 0;
        class103.field2180 = 0;
        class21.field384 = 0;
        class44.field939 = 0;
        class24.field408 = 0;
        class15.field263 = 0;
        class82.field1771 = 0;
        class84.field1887 = 0;
        class65.field1396 = 0;
        class85.field1946 = 0;
        class44.field911 = 0;
        class100.field2126 = 0;
        class123.field2754 = 0;
        class1.field21 = 0;
        class42.field850 = 0;
        class111.field2399 = 0;
        class104.field2188 = 0;
        class60.field1245 = 0;
        class27.field505 = 0;
        class30.field581 = 0;
        class50.field1074 = 0;
        class85.field1940 = 0;
        class58.field1206 = 0;
        class123.field2751 = 0;
        class79.field1688 = 0;
        class80.field1702 = 0;
        class44.field891 = 0;
        class73.field1537 = 0;
        class39.field789 = 0;
        class111.field2405 = 0;
        class50.field1075 = 0;
        class30.field578 = 0;
        class44.field916 = 0;
        class57.field1185 = 0;
        class15.field269 = 0;
        class105.field2234 = 0;
        class128.field2829 = 0;
        class97.field2069 = 0;
        class33.field646 = 0;
        class109.field2355 = 0;
        class85.field1942 = 0;
        class88.field1986 = 0;
        class27.field519 = 0;
        class44.field930 = 0;
        class28.field563 = 0;
        class75.field1566 = 0;
        class88.field1976 = 0;
        class111.field2396 = 0;
        class33.field651 = 0;
        class71.field1502 = 0;
        class5.field81 = 0;
        class93.field2039 = 0;
        class88.field2002 = 0;
        class127.field2797 = 0;
        class15.field270 = 0;
        class24.field399 = 0;
        class27.field525 = 0;
        class71.field1492 = 0;
        class19.field369 = 0;
        class123.field2749 = 0;
        class119.field2633 = 0;
        class89.field2021 = 0;
        class63.field1323 = 0;
        class14.field253 = 0;
        class123.field2744 = 0;
        client.field329 = 0;
        class71.field1498 = 0;
        class31.field622 = 0;
        class105.field2216 = 0;
        class19.field355 = 0;
        class33.field656 = 0;
        class67.field1460 = 0;
        class27.field511 = 0;
        class69.field1473 = 0;
        class84.field1900 = 0;
        class80.field1704 = 0;
        class65.field1424 = 0;
        class86.field1963 = 0;
        class97.field2082 = 0;
        class84.field1867 = 0;
        class88.field2000 = 0;
        class63.field1297 = 0;
        class1.field10 = 0;
        class45.field967 = 0;
        class67.field1462 = 0;
        class101.field2146 = 0;
        class84.field1883 = 0;
        class8.field146 = 0;
        class123.field2753 = 0;
        class28.field546 = 0;
        class6.field103 = 0;
        class33.field660 = 0;
        class17.field308 = 0;
        class25.field415 = 0;
        class60.field1240 = 0;
        class27.field506 = 0;
        class38.field742 = 0;
        field2785 = 0;
        class33.field659 = 0;
        class85.field1928 = 0;
        class106.field2237 = 0;
        class38.field734 = 0;
        class85.field1945 = 0;
        class84.field1865 = 0;
        class111.field2401 = 0;
        class26.field469 = 0;
        class44.field926 = 0;
        class105.field2227 = 0;
        class8.field149 = 0;
        class106.field2252 = 0;
        class112.field2420 = 0;
        class50.field1082 = 0;
        class21.field382 = 0;
        class111.field2413 = 0;
        class71.field1499 = 0;
        class119.field2635 = 0;
        class84.field1911 = 0;
        class115.field2500 = 0;
        class103.field2172 = 0;
        class27.field501 = 0;
        field2780 = 0;
        class60.field1242 = 0;
        class71.field1497 = 0;
        class127.field2811 = 0;
        class80.field1710 = 0;
        class5.field76 = 0;
        class114.field2479 = 0;
        class27.field474 = 0;
        class75.field1592 = 0;
        class118.field2618 = 0;
        class57.field1177 = 0;
        class89.field2011 = 0;
        class60.field1244 = 0;
        class75.field1577 = 0;
        class27.field480 = 0;
        class80.field1709 = 0;
        class55.field1151 = 0;
        class80.field1723 = 0;
        class127.field2808 = 0;
        class27.field478 = 0;
        class31.field603 = 0;
        class88.field1983 = 0;
        class39.field770 = 0;
        class26.field447 = 0;
        class39.field773 = 0;
        class118.field2596 = 0;
        class88.field1997 = 0;
        class27.field484 = 0;
        class25.field434 = 0;
        class64.field1368 = 0;
        class101.field2138 = 0;
        class107.field2270 = 0;
        class38.field753 = 0;
        class88.field1980 = 0;
        class119.field2641 = 0;
        class8.field150 = 0;
        class65.field1441 = 0;
        class127.field2799 = 0;
        class26.field452 = 0;
        class71.field1489 = 0;
        class28.field545 = 0;
        class118.field2582 = 0;
        class4.field52 = 0;
        class118.field2592 = 0;
        class25.field413 = 0;
        class30.field582 = 0;
        class44.field909 = 0;
        class84.field1882 = 0;
        class80.field1707 = 0;
        class49.field1036 = 0;
        class127.field2800 = 0;
        class113.field2459 = 0;
        class84.field1893 = 0;
        class49.field1047 = 0;
        class117.field2561 = 0;
        class57.field1168 = 0;
        class49.field1058 = 0;
        class27.field531 = 0;
        class48.field999 = 0;
        class27.field520 = 0;
        class58.field1198 = 0;
        class61.field1267 = 0;
        int var1 = 117 / ((arg0 + 41) / 60);
        class44.field897 = 0;
        class118.field2579 = 0;
        class5.field72 = 0;
        class27.field487 = 0;
        class27.field490 = 0;
        class93.field2037 = 0;
        class127.field2809 = 0;
        class25.field430 = 0;
        class120.field2686 = 0;
        class89.field2004 = 0;
        class73.field1531 = 0;
        class113.field2443 = 0;
        class113.field2445 = 0;
        class26.field441 = 0;
        class85.field1939 = 0;
        class118.field2608 = 0;
        class8.field165 = 0;
        class78.field1663 = 0;
        class45.field959 = 0;
        class64.field1342 = 0;
        class80.field1717 = 0;
        class128.field2821 = 0;
        class14.field246 = 0;
        class118.field2624 = 0;
        class84.field1885 = 0;
        class4.field50 = 0;
        class100.field2130 = 0;
        class33.field648 = 0;
        class60.field1233 = 0;
        class11.field214 = 0;
        class61.field1275 = 0;
        class1.field17 = 0;
        class113.field2456 = 0;
        class39.field792 = 0;
        class12.field230 = 0;
        class84.field1910 = 0;
        class28.field566 = 0;
        class69.field1480 = 0;
        class54.field1117 = 0;
        class118.field2617 = 0;
        class79.field1683 = 0;
        class65.field1375 = 0;
        class63.field1298 = 0;
        class109.field2357 = 0;
        class80.field1724 = 0;
        class58.field1196 = 0;
        class84.field1907 = 0;
        class8.field148 = 0;
        class75.field1599 = 0;
        class116.field2528 = 0;
        class107.field2277 = 0;
        class63.field1293 = 0;
        class45.field961 = 0;
        class115.field2493 = 0;
        class15.field272 = 0;
        class51.field1103 = 0;
        class115.field2498 = 0;
        class41.field847 = 0;
        class17.field296 = 0;
        class61.field1262 = 0;
        class50.field1085 = 0;
        class44.field900 = 0;
        class80.field1711 = 0;
        class80.field1713 = 0;
        class128.field2833 = 0;
        class86.field1958 = 0;
        class122.field2724 = 0;
        class63.field1317 = 0;
        class27.field503 = 0;
        class122.field2713 = 0;
        class42.field859 = 0;
        class61.field1272 = 0;
        class100.field2129 = 0;
        class84.field1914 = 0;
        class110.field2381 = 0;
        class26.field466 = 0;
        class31.field607 = 0;
        class122.field2714 = 0;
        class125.field2767 = 0;
        class27.field535 = 0;
        class120.field2664 = 0;
        class12.field240 = 0;
        class36.field715 = 0;
        class106.field2243 = 0;
        class5.field75 = 0;
        class33.field652 = 0;
        class101.field2163 = 0;
        class80.field1701 = 0;
        client.field326 = 0;
        class17.field303 = 0;
        class118.field2575 = 0;
        class57.field1190 = 0;
        class27.field507 = 0;
        client.field324 = 0;
        class27.field486 = 0;
        field2787 = 0;
        class84.field1917 = 0;
        class39.field776 = 0;
        class31.field605 = 0;
        class58.field1201 = 0;
        class75.field1559 = 0;
        class109.field2360 = 0;
        class44.field888 = 0;
        class84.field1912 = 0;
        class79.field1689 = 0;
        client.field327 = 0;
        class114.field2463 = 0;
        class123.field2747 = 0;
        class115.field2499 = 0;
        class45.field940 = 0;
        class60.field1239 = 0;
        class31.field604 = 0;
        class67.field1458 = 0;
        class80.field1708 = 0;
        class75.field1568 = 0;
        class26.field453 = 0;
        class15.field260 = 0;
        class21.field379 = 0;
        class106.field2239 = 0;
        class93.field2041 = 0;
        class79.field1691 = 0;
        class122.field2723 = 0;
        class128.field2823 = 0;
        class99.field2095 = 0;
        class45.field954 = 0;
        class109.field2354 = 0;
        class37.field718 = 0;
        class27.field513 = 0;
        class82.field1766 = 0;
        class60.field1235 = 0;
        class104.field2194 = 0;
        class27.field477 = 0;
        class19.field362 = 0;
        class21.field388 = 0;
        class27.field494 = 0;
        class106.field2240 = 0;
        class78.field1665 = 0;
        class97.field2076 = 0;
        class19.field358 = 0;
        class26.field465 = 0;
        class101.field2158 = 0;
        class111.field2408 = 0;
        class84.field1918 = 0;
        class63.field1313 = 0;
        class84.field1881 = 0;
        class84.field1919 = 0;
        class111.field2389 = 0;
        class88.field1977 = 0;
        class80.field1722 = 0;
        class114.field2484 = 0;
        class58.field1203 = 0;
        class84.field1899 = 0;
        class88.field1979 = 0;
        class120.field2667 = 0;
        class49.field1032 = 0;
        class27.field504 = 0;
        class114.field2467 = 0;
        class27.field493 = 0;
        class27.field524 = 0;
        class113.field2444 = 0;
        class26.field457 = 0;
        field2789 = 0;
        class99.field2099 = 0;
        class65.field1369 = 0;
        client.field330 = 0;
        class3.field41 = 0;
        class8.field163 = 0;
        class123.field2742 = 0;
        class49.field1014 = 0;
        class113.field2460 = 0;
        class6.field108 = 0;
        class123.field2743 = 0;
        class5.field71 = 0;
        class4.field55 = 0;
        class75.field1611 = 0;
        class5.field68 = 0;
        class65.field1394 = 0;
        class11.field207 = 0;
        class6.field110 = 0;
        class101.field2159 = 0;
        class105.field2233 = 0;
        class123.field2738 = 0;
        class65.field1428 = 0;
        class62.field1286 = 0;
        class28.field560 = 0;
        class116.field2536 = 0;
        class55.field1134 = 0;
        class84.field1876 = 0;
        class128.field2815 = 0;
        class39.field788 = 0;
        class25.field425 = 0;
        class111.field2392 = 0;
        class51.field1100 = 0;
        class27.field488 = 0;
        class128.field2825 = 0;
        class88.field1999 = 0;
        class6.field107 = 0;
        class88.field1989 = 0;
        class26.field467 = 0;
        class128.field2831 = 0;
        class80.field1696 = 0;
        class25.field414 = 0;
        class3.field36 = 0;
        class60.field1238 = 0;
        class113.field2454 = 0;
        class75.field1607 = 0;
        class37.field728 = 0;
        class119.field2637 = 0;
        class27.field536 = 0;
        class57.field1182 = 0;
        class86.field1952 = 0;
        class84.field1891 = 0;
        class71.field1488 = 0;
        class80.field1725 = 0;
        class26.field448 = 0;
        class49.field1068 = 0;
        class84.field1884 = 0;
        class118.field2613 = 0;
        class8.field154 = 0;
        class84.field1870 = 0;
        class42.field861 = 0;
        class123.field2739 = 0;
        class84.field1886 = 0;
        class106.field2250 = 0;
        class84.field1890 = 0;
        class63.field1301 = 0;
        class45.field957 = 0;
        class60.field1241 = 0;
        class26.field443 = 0;
        class44.field914 = 0;
        class118.field2620 = 0;
        class100.field2121 = 0;
        class80.field1706 = 0;
        class17.field295 = 0;
        class123.field2750 = 0;
        class115.field2490 = 0;
        class41.field845 = 0;
        class5.field79 = 0;
        class14.field245 = 0;
        class15.field278 = 0;
        class33.field642 = 0;
        class100.field2115 = 0;
        class5.field70 = 0;
        class118.field2622 = 0;
        class84.field1920 = 0;
        class113.field2449 = 0;
        class118.field2602 = 0;
        class101.field2150 = 0;
        class73.field1530 = 0;
        class4.field48 = 0;
        class25.field420 = 0;
        class99.field2101 = 0;
        class111.field2403 = 0;
        class30.field591 = 0;
        class17.field304 = 0;
        class27.field492 = 0;
        class35.field698 = 0;
        class118.field2619 = 0;
        class80.field1700 = 0;
        class115.field2506 = 0;
        class8.field157 = 0;
        class15.field268 = 0;
        class57.field1171 = 0;
        class99.field2096 = 0;
        class5.field92 = 0;
        class65.field1435 = 0;
        class27.field485 = 0;
        class40.field816 = 0;
        class61.field1276 = 0;
        class3.field44 = 0;
        class5.field95 = 0;
        class40.field810 = 0;
        class111.field2390 = 0;
        class97.field2065 = 0;
        class84.field1871 = 0;
        class84.field1873 = 0;
        class64.field1348 = 0;
        class55.field1144 = 0;
        class30.field590 = 0;
        class16.field294 = 0;
        class21.field381 = 0;
        class71.field1507 = 0;
        class33.field657 = 0;
        class50.field1077 = 0;
        class31.field631 = 0;
        class27.field473 = 0;
        class74.field1549 = 0;
        class104.field2186 = 0;
        class5.field85 = 0;
        class113.field2448 = 0;
        class115.field2492 = 0;
        class1.field18 = 0;
        class12.field234 = 0;
        class25.field427 = 0;
        class31.field614 = 0;
        class49.field1045 = 0;
        class19.field345 = 0;
        class118.field2606 = 0;
        class111.field2394 = 0;
        class42.field856 = 0;
        class71.field1501 = 0;
        class39.field779 = 0;
        class115.field2505 = 0;
        class40.field811 = 0;
        class105.field2223 = 0;
        class80.field1726 = 0;
        class45.field968 = 0;
        class19.field364 = 0;
        class27.field472 = 0;
        class114.field2466 = 0;
        class106.field2253 = 0;
        class38.field746 = 0;
        class50.field1083 = 0;
        class8.field153 = 0;
        class39.field782 = 0;
        class58.field1194 = 0;
        class15.field275 = 0;
        class35.field697 = 0;
        class27.field516 = 0;
        class50.field1079 = 0;
        class51.field1092 = 0;
        class80.field1694 = 0;
        class93.field2043 = 0;
        class26.field439 = 0;
        class5.field87 = 0;
        class45.field944 = 0;
        class45.field941 = 0;
        class60.field1234 = 0;
        class48.field1006 = 0;
        class84.field1908 = 0;
        class71.field1487 = 0;
        class84.field1874 = 0;
        class89.field2012 = 0;
        class84.field1905 = 0;
        class103.field2178 = 0;
        class86.field1960 = 0;
        class123.field2740 = 0;
        class75.field1600 = 0;
        class84.field1913 = 0;
        class27.field514 = 0;
        class112.field2428 = 0;
        class42.field849 = 0;
        class118.field2600 = 0;
        class75.field1616 = 0;
        class123.field2746 = 0;
        class27.field483 = 0;
        class54.field1116 = 0;
        class84.field1921 = 0;
        class27.field498 = 0;
        class27.field497 = 0;
        class37.field732 = 0;
        class118.field2611 = 0;
        class8.field168 = 0;
        class11.field204 = 0;
        class5.field88 = 0;
        class3.field29 = 0;
        class103.field2173 = 0;
        class19.field342 = 0;
        class57.field1172 = 0;
        class111.field2415 = 0;
        class112.field2436 = 0;
        class27.field479 = 0;
        class88.field2003 = 0;
        class84.field1878 = 0;
        class88.field1981 = 0;
        class120.field2697 = 0;
        class110.field2386 = 0;
        class82.field1765 = 0;
        class127.field2804 = 0;
        class80.field1705 = 0;
        class78.field1654 = 0;
        class28.field552 = 0;
        class104.field2200 = 0;
        class33.field658 = 0;
        class88.field1988 = 0;
        class69.field1479 = 0;
        class17.field318 = 0;
        class82.field1760 = 0;
        class49.field1046 = 0;
        class84.field1889 = 0;
        class123.field2737 = 0;
        class97.field2081 = 0;
        class12.field236 = 0;
        class64.field1358 = 0;
        class49.field1060 = 0;
        class45.field963 = 0;
        class40.field812 = 0;
        class27.field499 = 0;
        class49.field1053 = 0;
        class105.field2229 = 0;
        class110.field2375 = 0;
        class11.field205 = 0;
        class64.field1331 = 0;
        class101.field2143 = 0;
        class112.field2424 = 0;
        class118.field2593 = 0;
        class45.field966 = 0;
        class118.field2576 = 0;
        client.field337 = 0;
        class111.field2400 = 0;
        class42.field851 = 0;
        class27.field496 = 0;
        class44.field923 = 0;
        class63.field1325 = 0;
        class65.field1407 = 0;
        class69.field1475 = 0;
        client.field325 = 0;
        class127.field2806 = 0;
        class21.field386 = 0;
        class97.field2072 = 0;
        client.field333 = 0;
        class31.field609 = 0;
        class16.field292 = 0;
        class122.field2725 = 0;
        class51.field1095.field2181 = 0;
        class119.method929(-13559);
        class8.field145 = 0;
        class104.field2190 = -1;
        class97.field2070.field482 = 0;
        class107.field2278 = -1;
        class65.field1405.field482 = 0;
        class116.field2529 = false;
        class116.field2517 = -1;
        class103.field2169 = 0;
        class79.field1686 = 0;
        class40.field805 = 0;
        class39.field803 = -1;
        class110.field2378 = 0;
        class44.method387(0, (byte) 80);
        for (int var2 = 0; var2 < 100; var2++) {
            class75.field1597[var2] = null;
        }
        class27.field533 = -1;
        class125.field2777 = (int) (Math.random() * 100.0D) - 50;
        class85.field1933 = 0;
        class115.field2489 = 0;
        class45.field970 = 0;
        class97.field2077 = 0;
        class11.field219 = (int) (Math.random() * 80.0D) - 40;
        class79.field1680 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        class17.field302 = (int) (Math.random() * 30.0D) - 20;
        class93.field2048 = 0;
        class5.field80 = 0;
        class107.field2257 = 0;
        class30.field601 = 0;
        class117.field2568 = (int) (Math.random() * 110.0D) - 55;
        class103.field2176 = (int) (Math.random() * 120.0D) - 60;
        for (int var3 = 0; var3 < 2048; var3++) {
            class119.field2643[var3] = null;
            class69.field1474[var3] = null;
        }
        for (int var4 = 0; var4 < 16384; var4++) {
            class3.field30[var4] = null;
        }
        class107.field2271 = class119.field2643[2047] = new class63();
        class30.field595.method693(-9707);
        class115.field2491.method693(-9707);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var7 = 0; var7 < 104; var7++) {
                for (int var8 = 0; var8 < 104; var8++) {
                    class110.field2379[var5][var7][var8] = null;
                }
            }
        }
        class111.field2404 = new class88();
        class27.field537 = 0;
        class49.field1033 = 0;
        class101.method762(256, class45.field962);
        class45.field962 = -1;
        class101.method762(256, class104.field2202);
        class104.field2202 = -1;
        class101.method762(256, class27.field528);
        class27.field528 = -1;
        class101.method762(256, class103.field2165);
        class103.field2165 = -1;
        class101.method762(256, class112.field2422);
        class112.field2422 = -1;
        class101.method762(256, class78.field1657);
        class78.field1657 = -1;
        class101.method762(256, class4.field60);
        class74.field1546 = 3;
        class120.field2654 = 0;
        class25.field438 = false;
        class123.field2759 = -1;
        class128.field2830 = 0;
        class86.field1961 = false;
        class19.field339 = null;
        class116.field2529 = false;
        class4.field60 = -1;
        class45.field947.method526(false, new int[5], -1, null, (byte) 86);
        for (int var6 = 0; var6 < 5; var6++) {
            class15.field283[var6] = null;
            class55.field1138[var6] = false;
        }
        class88.field1993 = true;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(JI)V", line = 1011)
    public static final void method973(long arg0, int arg1) {
        field2786++;
        try {
            if (arg1 != 0) {
                field2795 = null;
            }
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V", line = 1055)
    public static final void method974(int arg0) {
        field2790++;
        if (class106.field2247 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (class106.field2247 > 768) {
                    class111.field2416[var1] = class58.method472(class44.field925[var1], 1024 - class106.field2247, arg0 + 3223, class82.field1768[var1]);
                } else if (class106.field2247 <= 256) {
                    class111.field2416[var1] = class58.method472(class82.field1768[var1], 256 - class106.field2247, 98, class44.field925[var1]);
                } else {
                    class111.field2416[var1] = class82.field1768[var1];
                }
            }
        } else if (class58.field1193 <= 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                class111.field2416[var2] = class44.field925[var2];
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                if (class58.field1193 > 768) {
                    class111.field2416[var3] = class58.method472(class44.field925[var3], 1024 - class58.field1193, 105, class84.field1895[var3]);
                } else if (class58.field1193 > 256) {
                    class111.field2416[var3] = class84.field1895[var3];
                } else {
                    class111.field2416[var3] = class58.method472(class84.field1895[var3], 256 - class58.field1193, 127, class44.field925[var3]);
                }
            }
        }
        short var4 = 256;
        for (int var5 = 0; var5 < 33920; var5++) {
            class73.field1545.field2015[var5] = class12.field243.field2705[var5];
        }
        int var6 = 0;
        int var7 = 1152;
        for (int var8 = 1; var8 < var4 - 1; var8++) {
            int var22 = (var4 - var8) * class39.field755[var8] / var4;
            int var23 = var22 + 22;
            if (var23 < 0) {
                var23 = 0;
            }
            var6 += var23;
            for (int var24 = var23; var24 < 128; var24++) {
                int var25 = class123.field2761[var6++];
                if (var25 == 0) {
                    var7++;
                } else {
                    int var27 = 256 - var25;
                    int var28 = class111.field2416[var25];
                    int var29 = class73.field1545.field2015[var7];
                    class73.field1545.field2015[var7++] = class61.method486(-16711936, var25 * class61.method486(var28, 16711935) + class61.method486(16711935, var29) * var27) + class61.method486(16711680, class61.method486(65280, var29) * var27 + var25 * class61.method486(var28, 65280)) >> 8;
                }
            }
            var7 += var23;
        }
        if (arg0 != -3112) {
            field2793 = null;
        }
        int var9 = 1176;
        for (int var10 = 0; var10 < 33920; var10++) {
            class117.field2567.field2015[var10] = class115.field2496.field2705[var10];
        }
        int var11 = 0;
        for (int var12 = 1; var12 < var4 - 1; var12++) {
            int var13 = (var4 - var12) * class39.field755[var12] / var4;
            int var14 = var9 + var13;
            int var15 = 103 - var13;
            for (int var16 = 0; var16 < var15; var16++) {
                int var17 = class123.field2761[var11++];
                if (var17 == 0) {
                    var14++;
                } else {
                    int var19 = 256 - var17;
                    int var20 = class111.field2416[var17];
                    int var21 = class117.field2567.field2015[var14];
                    class117.field2567.field2015[var14++] = class61.method486(16711680, var17 * class61.method486(65280, var20) + var19 * class61.method486(var21, 65280)) + class61.method486(-16711936, var17 * class61.method486(var20, 16711935) + class61.method486(16711935, var21) * var19) >> 8;
                }
            }
            var11 += 128 - var15;
            var9 = var14 + 128 - var15 - var13;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIBIII)V", line = 1222)
    public static final void method975(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var6 = class112.field2427.method845(arg0, arg5, arg4);
        if (var6 != 0) {
            int var7 = arg1;
            if (var6 > 0) {
                var7 = arg3;
            }
            int var8 = (103 - arg4) * 4 * 512 + arg5 * 4 + 24624;
            int var9 = class112.field2427.method835(arg0, arg5, arg4, var6);
            int var10 = var9 >> 6 & 0x3;
            int[] var11 = class112.field2432.field2705;
            int var12 = var9 & 0x1F;
            int var13 = var6 >> 14 & 0x7FFF;
            class49 var14 = class110.method856((byte) -116, var13);
            if (var14.field1034 == -1) {
                if (var12 == 0 || var12 == 2) {
                    if (var10 == 0) {
                        var11[var8] = var7;
                        var11[var8 + 512] = var7;
                        var11[var8 + 1024] = var7;
                        var11[var8 + 1536] = var7;
                    } else if (var10 == 1) {
                        var11[var8] = var7;
                        var11[var8 + 1] = var7;
                        var11[var8 + 2] = var7;
                        var11[var8 + 3] = var7;
                    } else if (var10 == 2) {
                        var11[var8 + 3] = var7;
                        var11[var8 + 515] = var7;
                        var11[var8 + 1027] = var7;
                        var11[var8 + 1536 + 3] = var7;
                    } else if (var10 == 3) {
                        var11[var8 + 1536] = var7;
                        var11[var8 + 1 + 1536] = var7;
                        var11[var8 + 1536 + 2] = var7;
                        var11[var8 + 3 + 1536] = var7;
                    }
                }
                if (var12 == 3) {
                    if (var10 == 0) {
                        var11[var8] = var7;
                    } else if (var10 == 1) {
                        var11[var8 + 3] = var7;
                    } else if (var10 == 2) {
                        var11[var8 + 3 + 1536] = var7;
                    } else if (var10 == 3) {
                        var11[var8 + 1536] = var7;
                    }
                }
                if (var12 == 2) {
                    if (var10 == 3) {
                        var11[var8] = var7;
                        var11[var8 + 512] = var7;
                        var11[var8 + 1024] = var7;
                        var11[var8 + 1536] = var7;
                    } else if (var10 == 0) {
                        var11[var8] = var7;
                        var11[var8 + 1] = var7;
                        var11[var8 + 2] = var7;
                        var11[var8 + 3] = var7;
                    } else if (var10 == 1) {
                        var11[var8 + 3] = var7;
                        var11[var8 + 515] = var7;
                        var11[var8 + 3 + 1024] = var7;
                        var11[var8 + 1536 + 3] = var7;
                    } else if (var10 == 2) {
                        var11[var8 + 1536] = var7;
                        var11[var8 + 1536 + 1] = var7;
                        var11[var8 + 1538] = var7;
                        var11[var8 + 1536 + 3] = var7;
                    }
                }
            } else {
                class96 var15 = class65.field1446[var14.field1034];
                if (var15 != null) {
                    int var16 = (var14.field1028 * 4 - var15.field2056) / 2;
                    int var17 = (var14.field1035 * 4 - var15.field2062) / 2;
                    var15.method732(arg5 * 4 + var16 + 48, (-var14.field1035 + -arg4 + 104) * 4 + 48 + var17);
                }
            }
        }
        int var18 = class112.field2427.method815(arg0, arg5, arg4);
        field2789++;
        if (var18 != 0) {
            int var19 = class112.field2427.method835(arg0, arg5, arg4, var18);
            int var20 = var19 & 0x1F;
            int var21 = var19 >> 6 & 0x3;
            int var22 = var18 >> 14 & 0x7FFF;
            class49 var23 = class110.method856((byte) -108, var22);
            if (var23.field1034 != -1) {
                class96 var27 = class65.field1446[var23.field1034];
                if (var27 != null) {
                    int var28 = (var23.field1028 * 4 - var27.field2056) / 2;
                    int var29 = (var23.field1035 * 4 - var27.field2062) / 2;
                    var27.method732(arg5 * 4 + var28 + 48, (104 - arg4 - var23.field1035) * 4 + var29 + 48);
                }
            } else if (var20 == 9) {
                int var24 = 15658734;
                if (var18 > 0) {
                    var24 = 15597568;
                }
                int[] var25 = class112.field2432.field2705;
                int var26 = (103 - arg4) * 4 * 512 + arg5 * 4 + 24624;
                if (var21 == 0 || var21 == 2) {
                    var25[var26 + 1536] = var24;
                    var25[var26 + 1 + 1024] = var24;
                    var25[var26 + 2 + 512] = var24;
                    var25[var26 + 3] = var24;
                } else {
                    var25[var26] = var24;
                    var25[var26 + 513] = var24;
                    var25[var26 + 1024 + 2] = var24;
                    var25[var26 + 3 + 1536] = var24;
                }
            }
        }
        if (arg2 != -82) {
            field2791 = 4;
        }
        int var30 = class112.field2427.method844(arg0, arg5, arg4);
        if (var30 == 0) {
            return;
        }
        int var31 = var30 >> 14 & 0x7FFF;
        class49 var32 = class110.method856((byte) -122, var31);
        if (var32.field1034 == -1) {
            return;
        }
        class96 var33 = class65.field1446[var32.field1034];
        if (var33 != null) {
            int var34 = (var32.field1028 * 4 - var33.field2056) / 2;
            int var35 = (var32.field1035 * 4 - var33.field2062) / 2;
            var33.method732(arg5 * 4 + var34 + 48, (-var32.field1035 + 104 - arg4) * 4 + 48 + var35);
            return;
        }
    }
}
