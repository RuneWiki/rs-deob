import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public abstract class class142 {

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "Lwd;")
    private static class150 field3432 = class2.method9(true, "Please use a different world)3");

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Lwd;")
    public static class150 field3427 = field3432;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Lwd;")
    public static class150 field3421 = field3432;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "Li;")
    public static class56 field3424 = new class56(200);

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "Lwd;")
    public static class150 field3436 = class2.method9(true, "60 Sekunden noch einmal)3)3)3");

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "Lwd;")
    public static class150 field3435 = class2.method9(true, " )2>");

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "Lwb;")
    public static class148 field3438 = new class148(8);

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "Lwd;")
    public static class150 field3444 = class2.method9(true, "@gr1@");

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public static int field3442 = 0;

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "Lwd;")
    public static class150 field3448 = class2.method9(true, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "Lwd;")
    private static class150 field3449 = class2.method9(true, "green:");

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "Lwd;")
    public static class150 field3446 = field3449;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "Lwd;")
    public static class150 field3445 = field3449;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "Lqd;")
    public static class114 field3434;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "Lva;")
    public static class141 field3447;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "Lff;")
    public static class42 field3437;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "Lhb;")
    public static class51 field3440;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3439;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "[Lqd;")
    public static class114[] field3443;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLva;)Z")
    public static final boolean method1070(byte arg0, class141 arg1) {
        field3428++;
        int var2 = arg1.field3338;
        if (arg0 <= 73) {
            method1076(46, -29, 88);
        }
        if (var2 >= 1 && var2 <= 200 || !(var2 < 701 || var2 > 900)) {
            class88.field2045++;
            if (var2 >= 801) {
                var2 -= 701;
            } else if (var2 >= 701) {
                var2 -= 601;
            } else if (var2 < 101) {
                var2--;
            } else {
                var2 -= 101;
            }
            class68.method521(0, 53, class28.field865, false, 0, class111.method786((byte) 24, new class150[] { class3.field59, class146.field3537[var2] }), 0);
            class143.field3450++;
            class68.method521(0, 33, client.field619, false, 0, class111.method786((byte) -126, new class150[] { class3.field59, class146.field3537[var2] }), 0);
            return true;
        } else if (var2 >= 401 && var2 <= 500) {
            class68.method521(0, 32, class28.field865, false, 0, class111.method786((byte) -110, new class150[] { class3.field59, arg1.field3366 }), 0);
            class113.field2644++;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BII)I")
    public static final int method1071(byte arg0, int arg1, int arg2) {
        if (arg1 > arg2) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        while (arg1 != 0) {
            int var5 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var5;
        }
        int var4 = -113 / ((86 - arg0) / 37);
        field3433++;
        return arg2;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([BI)V")
    public abstract void method505(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)V")
    public static final void method1072(int arg0, byte arg1) {
        if (arg1 != 42) {
            return;
        }
        field3431++;
        class130 var2 = (class130) class126.field2920.method534((byte) -92, (long) arg0);
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field3071.length; var3++) {
                var2.field3071[var3] = -1;
                var2.field3064[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static final void method1073(int arg0) {
        field3426++;
        if (class101.field2292 != 2) {
            return;
        }
        if (arg0 < 114) {
            field3435 = null;
        }
        class92.method652((byte) -11, (class112.field2595 - class66.field1686 << 7) + class32.field943, class105.field2384 * 2, (class131.field3093 - class77.field1905 << 7) + class144.field3483);
        if (class127.field2937 > -1 && class11.field280 % 20 < 10) {
            class66.field1671[0].method398(class127.field2937 - 12, class68.field1725 + -28);
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)[B")
    public abstract byte[] method506(int arg0);

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
    public static final void method1074(int arg0) {
        class95.field2208.field3238 = 0;
        class88.field2054 = 0L;
        class124.field2870 = true;
        class9.field225 = true;
        field3425++;
        class149.field3642 = 0;
        class103.field2340 = 0;
        class49.field1289 = 0;
        class91.field2114 = 0;
        class4.field79 = 0;
        class108.field2447 = 0;
        class61.field1543 = 0;
        class9.field202 = 0;
        class108.field2446 = 0;
        class148.field3594 = 0;
        class135.field3185 = 0;
        field3433 = 0;
        class35.field974 = 0;
        class21.field553 = 0;
        class121.field2778 = 0;
        class119.field2753 = 0;
        class133.field3124 = 0;
        class42.field1134 = 0;
        class11.field254 = 0;
        class119.field2740 = 0;
        class150.field3668 = 0;
        class10.field245 = 0;
        class41.field1075 = 0;
        class94.field2183 = 0;
        class146.field3525 = 0;
        class127.field2973 = 0;
        class141.field3327 = 0;
        class101.field2296 = 0;
        class61.field1597 = 0;
        class43.field1161 = 0;
        class118.field2723 = 0;
        class4.field85 = 0;
        class148.field3635 = 0;
        class128.field3037 = 0;
        class11.field278 = 0;
        class113.field2639 = 0;
        class133.field3137 = 0;
        class2.field39 = 0;
        class150.field3706 = 0;
        class49.field1313 = 0;
        class80.field1947 = 0;
        class38.field1040 = 0;
        class112.field2586 = 0;
        class61.field1557 = 0;
        class18.field486 = 0;
        class125.field2884 = 0;
        class148.field3624 = 0;
        class8.field171 = 0;
        class107.field2431 = 0;
        class136.field3199 = 0;
        class40.field1051 = 0;
        class37.field1012 = 0;
        class148.field3604 = 0;
        class18.field470 = 0;
        class150.field3703 = 0;
        class148.field3579 = 0;
        class103.field2322 = 0;
        class5.field105 = 0;
        class103.field2334 = 0;
        class109.field2518 = 0;
        class106.field2396 = 0;
        class68.field1715 = 0;
        class80.field1949 = 0;
        class128.field3046 = 0;
        class3.field65 = 0;
        class124.field2860 = 0;
        class42.field1109 = 0;
        class150.field3699 = 0;
        class8.field200 = 0;
        class99.field2258 = 0;
        class150.field3670 = 0;
        class124.field2875 = 0;
        class148.field3576 = 0;
        class73.field1826 = 0;
        class128.field3051 = 0;
        class69.field1742 = 0;
        class88.field2066 = 0;
        class113.field2618 = 0;
        class17.field455 = 0;
        class134.field3154 = 0;
        class148.field3615 = 0;
        class24.field696 = 0;
        client.field635 = 0;
        class136.field3200 = 0;
        class144.field3469 = 0;
        class143.field3455 = 0;
        class68.field1707 = 0;
        class88.field2068 = 0;
        class2.field22 = 0;
        class24.field682 = 0;
        class80.field1950 = 0;
        class128.field3020 = 0;
        class69.field1736 = 0;
        class3.field56 = 0;
        class119.field2759 = 0;
        class17.field432 = 0;
        class148.field3633 = 0;
        class107.field2415 = 0;
        class104.field2349 = 0;
        class112.field2580 = 0;
        class73.field1816 = 0;
        class80.field1941 = 0;
        class146.field3534 = 0;
        class34.field950 = 0;
        class16.field431 = 0;
        class9.field211 = 0;
        class24.field691 = 0;
        class108.field2444 = 0;
        class1.field7 = 0;
        class150.field3714 = 0;
        class49.field1282 = 0;
        class24.field704 = 0;
        class17.field447 = 0;
        class24.field698 = 0;
        class4.field75 = 0;
        class22.field637 = 0;
        class42.field1099 = 0;
        client.field613 = 0;
        class111.field2546 = 0;
        class83.field1998 = 0;
        class148.field3584 = 0;
        class121.field2787 = 0;
        class20.field518 = 0;
        class40.field1058 = 0;
        class131.field3083 = 0;
        class56.field1467 = 0;
        class136.field3189 = 0;
        class144.field3473 = 0;
        class21.field568 = 0;
        class6.field156 = 0;
        class18.field474 = 0;
        class88.field2052 = 0;
        class77.field1899 = 0;
        class35.field965 = 0;
        class82.field1981 = 0;
        class4.field84 = 0;
        class47.field1268 = 0;
        class148.field3625 = 0;
        class150.field3667 = 0;
        class56.field1455 = 0;
        class108.field2463 = 0;
        class17.field448 = 0;
        class91.field2134 = 0;
        class88.field2046 = 0;
        class108.field2506 = 0;
        class107.field2426 = 0;
        class148.field3583 = 0;
        class50.field1328 = 0;
        class124.field2862 = 0;
        field3423 = 0;
        class149.field3653 = 0;
        class131.field3085 = 0;
        class26.field782 = 0;
        class20.field519 = 0;
        class18.field492 = 0;
        class42.field1107 = 0;
        class150.field3707 = 0;
        class108.field2462 = 0;
        class41.field1072 = 0;
        class32.field936 = 0;
        class108.field2440 = 0;
        class105.field2372 = 0;
        class80.field1946 = 0;
        class24.field679 = 0;
        class56.field1468 = 0;
        class141.field3335 = 0;
        class80.field1940 = 0;
        class144.field3471 = 0;
        class26.field779 = 0;
        class70.field1768 = 0;
        class103.field2335 = 0;
        class150.field3691 = 0;
        class58.field1486 = 0;
        class118.field2691 = 0;
        class24.field683 = 0;
        class83.field2002 = 0;
        class105.field2370 = 0;
        class88.field2049 = 0;
        field3430 = 0;
        class127.field2999 = 0;
        class101.field2302 = 0;
        class42.field1113 = 0;
        class103.field2324 = 0;
        class35.field972 = 0;
        class80.field1932 = 0;
        class103.field2318 = 0;
        class17.field437 = 0;
        class54.field1417 = 0;
        class128.field3052 = 0;
        class150.field3689 = 0;
        class42.field1121 = 0;
        class14.field369 = 0;
        class95.field2204 = 0;
        class147.field3547 = 0;
        field3425 = 0;
        class11.field274 = 0;
        class127.field3012 = 0;
        class146.field3528 = 0;
        class130.field3076 = 0;
        class73.field1825 = 0;
        class49.field1283 = 0;
        class61.field1586 = 0;
        class148.field3628 = 0;
        class30.field911 = 0;
        class150.field3687 = 0;
        class135.field3168 = 0;
        class24.field703 = 0;
        class35.field967 = 0;
        class29.field881 = 0;
        class108.field2471 = 0;
        class1.field5 = 0;
        class22.field649 = 0;
        class16.field424 = 0;
        class42.field1130 = 0;
        class141.field3300 = 0;
        class35.field962 = 0;
        class99.field2269 = 0;
        class148.field3611 = 0;
        class4.field77 = 0;
        class9.field216 = 0;
        class104.field2366 = 0;
        class148.field3609 = 0;
        class82.field1985 = 0;
        class74.field1854 = 0;
        class150.field3682 = 0;
        class108.field2499 = 0;
        class43.field1166 = 0;
        class77.field1911 = 0;
        class61.field1559 = 0;
        class134.field3155 = 0;
        class46.field1236 = 0;
        class98.field2245 = 0;
        class21.field556 = 0;
        class46.field1237 = 0;
        class11.field272 = 0;
        class150.field3690 = 0;
        class38.field1041 = 0;
        class148.field3621 = 0;
        class29.field877 = 0;
        class72.field1793 = 0;
        class61.field1562 = 0;
        class63.field1630 = 0;
        class103.field2333 = 0;
        class4.field72 = 0;
        class31.field915 = 0;
        class111.field2537 = 0;
        class148.field3617 = 0;
        class135.field3180 = 0;
        class24.field706 = 0;
        class20.field531 = 0;
        class42.field1120 = 0;
        class21.field565 = 0;
        class55.field1448 = 0;
        class134.field3152 = 0;
        class21.field588 = 0;
        class141.field3387 = 0;
        class42.field1129 = 0;
        class148.field3597 = 0;
        client.field620 = 0;
        class31.field921 = 0;
        class148.field3578 = 0;
        class150.field3677 = 0;
        class20.field512 = 0;
        class83.field2001 = 0;
        class80.field1930 = 0;
        class70.field1758 = 0;
        class24.field717 = 0;
        class108.field2464 = 0;
        class86.field2032 = 0;
        class12.field304 = 0;
        class24.field710 = 0;
        class42.field1100 = 0;
        class105.field2376 = 0;
        class101.field2303 = 0;
        class86.field2040 = 0;
        class150.field3671 = 0;
        class24.field713 = 0;
        class134.field3145 = 0;
        field3426 = 0;
        class125.field2880 = 0;
        class150.field3705 = 0;
        class2.field27 = 0;
        class128.field3027 = 0;
        class63.field1615 = 0;
        class106.field2388 = 0;
        class43.field1169 = 0;
        class42.field1149 = 0;
        class73.field1833 = 0;
        class46.field1238 = 0;
        class32.field940 = 0;
        class149.field3657 = 0;
        class69.field1733 = 0;
        class150.field3693 = 0;
        class9.field217 = 0;
        class77.field1896 = 0;
        class5.field127 = 0;
        class135.field3170 = 0;
        client.field631 = 0;
        class124.field2868 = 0;
        class118.field2708 = 0;
        class73.field1836 = 0;
        class141.field3383 = 0;
        class49.field1284 = 0;
        class66.field1679 = 0;
        class63.field1632 = 0;
        class49.field1309 = 0;
        class73.field1817 = 0;
        class138.field3234 = 0;
        class76.field1866 = 0;
        class101.field2301 = 0;
        class149.field3643 = 0;
        class20.field503 = 0;
        class11.field264 = 0;
        class111.field2554 = 0;
        class61.field1542 = 0;
        class97.field2235 = 0;
        class55.field1438 = 0;
        class21.field580 = 0;
        class127.field2980 = 0;
        class49.field1319 = 0;
        class150.field3672 = 0;
        class148.field3607 = 0;
        class148.field3596 = 0;
        class18.field496 = 0;
        class17.field439 = 0;
        class35.field968 = 0;
        class108.field2474 = 0;
        class88.field2065 = 0;
        class146.field3536 = 0;
        class16.field417 = 0;
        class99.field2254 = 0;
        class128.field3019 = 0;
        class2.field18 = 0;
        class148.field3591 = 0;
        client.field632 = 0;
        class108.field2472 = 0;
        class20.field515 = 0;
        class137.field3212 = 0;
        class42.field1118 = 0;
        class17.field446 = 0;
        class131.field3088 = 0;
        class83.field1993 = 0;
        class70.field1752 = 0;
        class47.field1271 = 0;
        class17.field452 = 0;
        class37.field1018 = 0;
        class150.field3720 = 0;
        client.field610 = 0;
        class11.field273 = 0;
        class8.field187 = 0;
        class11.field269 = 0;
        class103.field2321 = 0;
        class108.field2502 = 0;
        class133.field3141 = 0;
        class8.field191 = 0;
        class9.field207 = 0;
        class10.field241 = 0;
        class28.field857 = 0;
        class28.field848 = 0;
        class47.field1277 = 0;
        class25.field723 = 0;
        class108.field2478 = 0;
        class150.field3673 = 0;
        class9.field204 = 0;
        class148.field3623 = 0;
        class127.field2968 = 0;
        class145.field3518 = 0;
        class21.field549 = 0;
        class30.field887 = 0;
        class113.field2640 = 0;
        class119.field2761 = 0;
        class24.field697 = 0;
        class74.field1856 = 0;
        class8.field188 = 0;
        class111.field2539 = 0;
        class150.field3708 = 0;
        class97.field2223 = 0;
        class24.field711 = 0;
        class20.field529 = 0;
        class77.field1908 = 0;
        class150.field3683 = 0;
        class18.field483 = 0;
        class138.field3242 = 0;
        class125.field2879 = 0;
        class22.field644 = 0;
        class8.field178 = 0;
        class10.field249 = 0;
        class149.field3649 = 0;
        class28.field850 = 0;
        class99.field2279 = 0;
        class108.field2504 = 0;
        class76.field1884 = 0;
        class9.field227 = 0;
        class42.field1117 = 0;
        class1.field11 = 0;
        class35.field970 = 0;
        class148.field3593 = 0;
        class143.field3458 = 0;
        class106.field2393 = 0;
        class4.field74 = 0;
        class4.field80 = 0;
        class127.field2984 = 0;
        class32.field930 = 0;
        class148.field3632 = 0;
        class83.field1997 = 0;
        class74.field1860 = 0;
        class91.field2132 = 0;
        class125.field2882 = 0;
        class108.field2458 = 0;
        class50.field1342 = 0;
        class73.field1834 = 0;
        class61.field1579 = 0;
        class50.field1336 = 0;
        class95.field2200 = 0;
        class49.field1291 = 0;
        class69.field1738 = 0;
        class56.field1454 = 0;
        class34.field959 = 0;
        class104.field2358 = 0;
        class109.field2516 = 0;
        class138.field3227 = 0;
        class35.field963 = 0;
        class149.field3661 = 0;
        class92.field2164 = 0;
        class50.field1352 = 0;
        class43.field1176 = 0;
        class108.field2459 = 0;
        class1.field17 = 0;
        class21.field557 = 0;
        class143.field3454 = 0;
        class70.field1749 = 0;
        class24.field689 = 0;
        class6.field153 = 0;
        class37.field1032 = 0;
        class108.field2457 = 0;
        class91.field2126 = 0;
        class150.field3722 = 0;
        class24.field690 = 0;
        class14.field373 = 0;
        class148.field3626 = 0;
        class18.field489 = 0;
        class20.field513 = 0;
        class91.field2128 = 0;
        class21.field594 = 0;
        class55.field1441 = 0;
        class37.field1029 = 0;
        class148.field3575 = 0;
        class127.field3008 = 0;
        class106.field2402 = 0;
        class61.field1595 = 0;
        class127.field2935 = 0;
        class135.field3166 = 0;
        class11.field255 = 0;
        class149.field3652 = 0;
        class21.field589 = 0;
        class41.field1083 = 0;
        class69.field1737 = 0;
        class24.field718 = 0;
        class47.field1256 = 0;
        class82.field1977 = 0;
        class118.field2710 = 0;
        class29.field875 = 0;
        class74.field1850 = 0;
        class26.field786 = 0;
        class43.field1196 = 0;
        class92.field2148 = 0;
        class101.field2287 = 0;
        class32.field935 = 0;
        class149.field3651 = 0;
        class127.field2970 = 0;
        class108.field2492 = 0;
        class40.field1056 = 0;
        class150.field3719 = 0;
        class5.field129 = 0;
        class22.field642 = 0;
        class149.field3650 = 0;
        class63.field1629 = 0;
        class145.field3519 = 0;
        class108.field2461 = 0;
        class136.field3194 = 0;
        class50.field1348 = 0;
        class70.field1751 = 0;
        class141.field3359 = 0;
        class88.field2055 = 0;
        class134.field3142 = 0;
        class42.field1112 = 0;
        class42.field1098 = 0;
        class109.field2523 = 0;
        class70.field1756 = 0;
        class130.field3063 = 0;
        class63.field1623 = 0;
        class12.field301 = 0;
        class148.field3631 = 0;
        class108.field2493 = 0;
        class145.field3515 = 0;
        client.field607 = 0;
        class108.field2455 = 0;
        class12.field288 = 0;
        class127.field2992 = 0;
        class80.field1944 = 0;
        class150.field3692 = 0;
        class56.field1460 = 0;
        class56.field1461 = 0;
        class31.field924 = 0;
        class15.field411 = 0;
        class42.field1133 = 0;
        class1.field1 = 0;
        class4.field82 = 0;
        class150.field3697 = 0;
        class150.field3709 = 0;
        class82.field1982 = 0;
        class47.field1258 = 0;
        class68.field1704 = 0;
        class147.field3554 = 0;
        class95.field2205 = 0;
        class47.field1257 = 0;
        class15.field382 = 0;
        class23.field664 = 0;
        class21.field561 = 0;
        class4.field86 = 0;
        class148.field3636 = 0;
        class6.field152 = 0;
        class150.field3700 = 0;
        class29.field870 = 0;
        class49.field1304 = 0;
        class6.field161 = 0;
        class47.field1265 = 0;
        class150.field3688 = 0;
        class88.field2051 = 0;
        class86.field2033 = 0;
        class94.field2179 = 0;
        class98.field2244 = 0;
        class5.field94 = 0;
        class137.field3214 = 0;
        class80.field1942 = 0;
        class43.field1197 = 0;
        class86.field2027 = 0;
        client.field617 = 0;
        class82.field1968 = 0;
        class148.field3608 = 0;
        class26.field778 = 0;
        class58.field1488 = 0;
        class56.field1470 = 0;
        class141.field3355 = 0;
        class69.field1735 = 0;
        class72.field1812 = 0;
        class14.field374 = 0;
        class103.field2329 = 0;
        class2.field35 = 0;
        class61.field1558 = 0;
        class46.field1235 = 0;
        class42.field1155 = 0;
        class43.field1165 = 0;
        class23.field671 = 0;
        class150.field3675 = 0;
        class34.field953 = 0;
        class17.field442 = 0;
        class32.field945 = 0;
        class82.field1969 = 0;
        class11.field276 = 0;
        class149.field3656 = 0;
        class108.field2451 = 0;
        class121.field2779 = 0;
        class11.field268 = 0;
        class148.field3627 = 0;
        class109.field2522 = 0;
        class135.field3181 = 0;
        class16.field425 = 0;
        class131.field3103 = 0;
        class107.field2411 = 0;
        class105.field2378 = 0;
        class103.field2326 = 0;
        class108.field2486 = 0;
        class113.field2644 = 0;
        class5.field139 = 0;
        class133.field3136 = 0;
        class128.field3043 = 0;
        class22.field641 = 0;
        class108.field2484 = 0;
        class108.field2480 = 0;
        class43.field1170 = 0;
        class148.field3637 = 0;
        class104.field2355 = 0;
        class4.field89 = 0;
        class88.field2047 = 0;
        class108.field2503 = 0;
        class32.field929 = 0;
        class25.field760 = 0;
        class138.field3233 = 0;
        class101.field2290 = 0;
        class4.field88 = 0;
        class42.field1122 = 0;
        class108.field2449 = 0;
        class70.field1757 = 0;
        class130.field3068 = 0;
        class138.field3230 = 0;
        class12.field298 = 0;
        class104.field2362 = 0;
        class3.field68 = 0;
        class20.field508 = 0;
        class88.field2058 = 0;
        class73.field1819 = 0;
        class9.field220 = 0;
        class150.field3717 = 0;
        class150.field3715 = 0;
        class149.field3660 = 0;
        class128.field3044 = 0;
        class148.field3603 = 0;
        class148.field3588 = 0;
        class70.field1759 = 0;
        class9.field208 = 0;
        class149.field3654 = 0;
        class150.field3694 = 0;
        class101.field2307 = 0;
        class135.field3184 = 0;
        class126.field2922 = 0;
        class70.field1745 = 0;
        class4.field70 = 0;
        class127.field2982 = 0;
        class73.field1823 = 0;
        class21.field600 = 0;
        class141.field3379 = 0;
        class104.field2361 = 0;
        client.field630 = 0;
        class83.field1992 = 0;
        class2.field28 = 0;
        class127.field2953 = 0;
        class111.field2568 = 0;
        class92.field2151 = 0;
        class66.field1670 = 0;
        class50.field1335 = 0;
        class91.field2125 = 0;
        class128.field3042 = 0;
        class148.field3577 = 0;
        class29.field874 = 0;
        client.field616 = 0;
        class103.field2323 = 0;
        class127.field2938 = 0;
        class135.field3172 = 0;
        class24.field700 = 0;
        class10.field247 = 0;
        class21.field552 = 0;
        class73.field1830 = 0;
        class37.field1019 = 0;
        class23.field666 = 0;
        class148.field3630 = 0;
        class88.field2050 = 0;
        class128.field3025 = 0;
        class42.field1103 = 0;
        class107.field2428 = 0;
        class20.field498 = 0;
        class18.field494 = 0;
        class58.field1489 = 0;
        class32.field939 = 0;
        class73.field1822 = 0;
        class88.field2070 = 0;
        class54.field1428 = 0;
        class42.field1132 = 0;
        class141.field3297 = 0;
        class56.field1464 = 0;
        class124.field2876 = 0;
        class24.field672 = 0;
        class109.field2519 = 0;
        class50.field1329 = 0;
        class42.field1106 = 0;
        class4.field78 = 0;
        class43.field1158 = 0;
        class150.field3666 = 0;
        class150.field3681 = 0;
        class68.field1701 = 0;
        class144.field3485 = 0;
        class150.field3663 = 0;
        class35.field969 = 0;
        class56.field1458 = 0;
        class101.field2295 = 0;
        class24.field702 = 0;
        class32.field946 = 0;
        class43.field1164 = 0;
        class101.field2288 = 0;
        int var1 = 103 / ((28 - arg0) / 62);
        class148.field3614 = 0;
        class80.field1952 = 0;
        field3429 = 0;
        class8.field176 = 0;
        class24.field701 = 0;
        class24.field714 = 0;
        class37.field1028 = 0;
        class103.field2320 = 0;
        class121.field2782 = 0;
        class50.field1344 = 0;
        class128.field3048 = 0;
        class50.field1326 = 0;
        class108.field2443 = 0;
        class106.field2386 = 0;
        class42.field1096 = 0;
        class112.field2587 = 0;
        class80.field1945 = 0;
        class42.field1108 = 0;
        class128.field3018 = 0;
        class105.field2368 = 0;
        client.field625 = 0;
        class133.field3138 = 0;
        class50.field1331 = 0;
        class148.field3580 = 0;
        class24.field709 = 0;
        class111.field2561 = 0;
        class128.field3049 = 0;
        class21.field587 = 0;
        class24.field694 = 0;
        class121.field2781 = 0;
        class148.field3606 = 0;
        class43.field1159 = 0;
        class86.field2034 = 0;
        class128.field3039 = 0;
        class42.field1150 = 0;
        class20.field527 = 0;
        class46.field1239 = 0;
        class78.field1917 = 0;
        class42.field1131 = 0;
        class128.field3045 = 0;
        class149.field3659 = 0;
        class88.field2043 = 0;
        class25.field738 = 0;
        class107.field2406 = 0;
        class99.field2272 = 0;
        class24.field705 = 0;
        class108.field2500 = 0;
        class92.field2139 = 0;
        class34.field952 = 0;
        class8.field173 = 0;
        class61.field1603 = 0;
        class24.field673 = 0;
        class121.field2784 = 0;
        class15.field386 = 0;
        class42.field1146 = 0;
        class11.field256 = 0;
        class97.field2231 = 0;
        class21.field592 = 0;
        class125.field2883 = 0;
        class70.field1754 = 0;
        class47.field1272 = 0;
        class148.field3618 = 0;
        class126.field2921 = 0;
        class97.field2236 = 0;
        class101.field2305 = 0;
        class108.field2438 = 0;
        client.field615 = 0;
        class144.field3480 = 0;
        class118.field2709 = 0;
        class108.field2491 = 0;
        class9.field206 = 0;
        class108.field2441 = 0;
        class148.field3589 = 0;
        class76.field1873 = 0;
        class111.field2566 = 0;
        class43.field1192 = 0;
        class4.field71 = 0;
        class23.field662 = 0;
        class108.field2454 = 0;
        class49.field1294 = 0;
        class77.field1914 = 0;
        class109.field2530 = 0;
        class150.field3711 = 0;
        class1.field14 = 0;
        class106.field2389 = 0;
        class135.field3173 = 0;
        class150.field3695 = 0;
        class133.field3127 = 0;
        class65.field1660 = 0;
        class50.field1333 = 0;
        class6.field150 = 0;
        class137.field3219 = 0;
        class88.field2063 = 0;
        class41.field1087 = 0;
        class46.field1231 = 0;
        class150.field3665 = 0;
        class6.field154 = 0;
        class135.field3178 = 0;
        class24.field708 = 0;
        class83.field1996 = 0;
        class42.field1152 = 0;
        class29.field878 = 0;
        class73.field1818 = 0;
        class78.field1918 = 0;
        class70.field1760 = 0;
        class68.field1702 = 0;
        class121.field2780 = 0;
        class49.field1321 = 0;
        class148.field3622 = 0;
        class141.field3408 = 0;
        client.field612 = 0;
        class15.field406 = 0;
        class118.field2696 = 0;
        class148.field3585 = 0;
        class70.field1767 = 0;
        class104.field2364 = 0;
        class116.field2670 = 0;
        class28.field855 = 0;
        class119.field2748 = 0;
        class70.field1753 = 0;
        class105.field2371 = 0;
        class80.field1936 = 0;
        class69.field1739 = 0;
        class50.field1341 = 0;
        class50.field1337 = 0;
        class24.field680 = 0;
        client.field623 = 0;
        class61.field1572 = 0;
        class74.field1861 = 0;
        class108.field2470 = 0;
        class138.field3237 = 0;
        class131.field3077 = 0;
        class148.field3600 = 0;
        class11.field275 = 0;
        class146.field3535 = 0;
        class112.field2584 = 0;
        class24.field716 = 0;
        class99.field2256 = 0;
        class42.field1143 = 0;
        class56.field1449 = 0;
        class146.field3539 = 0;
        class94.field2175 = 0;
        class37.field1025 = 0;
        class148.field3613 = 0;
        class42.field1135 = 0;
        class26.field783 = 0;
        class111.field2542 = 0;
        class105.field2380 = 0;
        class103.field2332 = 0;
        class108.field2498 = 0;
        class96.field2211 = 0;
        class6.field158 = 0;
        class41.field1093 = 0;
        class97.field2224 = 0;
        class112.field2581 = 0;
        class107.field2420 = 0;
        class113.field2607 = 0;
        class31.field918 = 0;
        class68.field1697 = 0;
        class101.field2299 = 0;
        class88.field2069 = 0;
        class78.field1919 = 0;
        class150.field3696 = 0;
        class126.field2919 = 0;
        class124.field2863 = 0;
        class28.field842 = 0;
        client.field609 = 0;
        class42.field1110 = 0;
        class111.field2549 = 0;
        class73.field1831 = 0;
        class148.field3582 = 0;
        class49.field1324 = 0;
        class29.field872 = 0;
        class30.field886 = 0;
        class127.field2988 = 0;
        class61.field1561 = 0;
        class24.field687 = 0;
        class80.field1939 = 0;
        class148.field3616 = 0;
        class21.field563 = 0;
        class8.field195 = 0;
        class107.field2429 = 0;
        class144.field3481 = 0;
        class80.field1935 = 0;
        class148.field3612 = 0;
        class130.field3062 = 0;
        class32.field928 = 0;
        class127.field3011 = 0;
        class17.field435 = 0;
        class134.field3153 = 0;
        class141.field3295 = 0;
        class137.field3213 = 0;
        class61.field1566 = 0;
        class38.field1036 = 0;
        class46.field1232 = 0;
        class150.field3686 = 0;
        class26.field793 = 0;
        class8.field190 = 0;
        class43.field1172 = 0;
        class146.field3538 = 0;
        field3422 = 0;
        class118.field2701 = 0;
        class143.field3450 = 0;
        class150.field3676 = 0;
        class42.field1094 = 0;
        class15.field378 = 0;
        class76.field1868 = 0;
        class131.field3090 = 0;
        class130.field3065 = 0;
        class108.field2483 = 0;
        class101.field2304 = 0;
        class32.field947 = 0;
        class49.field1315 = 0;
        class88.field2041 = 0;
        class105.field2381 = 0;
        class72.field1811 = 0;
        class40.field1050 = 0;
        class150.field3679 = 0;
        class141.field3349 = 0;
        class107.field2405 = 0;
        class65.field1644 = 0;
        class101.field2306 = 0;
        class41.field1076 = 0;
        class24.field677 = 0;
        class112.field2582 = 0;
        class35.field960 = 0;
        class73.field1814 = 0;
        class148.field3620 = 0;
        class61.field1539 = 0;
        class20.field526 = 0;
        class40.field1057 = 0;
        class21.field560 = 0;
        class21.field585 = 0;
        class116.field2661 = 0;
        class43.field1184 = 0;
        class42.field1147 = 0;
        class42.field1101 = 0;
        class24.field692 = 0;
        class118.field2727 = 0;
        class148.field3638 = 0;
        class8.field169 = 0;
        class20.field524 = 0;
        class20.field502 = 0;
        class148.field3598 = 0;
        class118.field2711 = 0;
        class38.field1043 = 0;
        class83.field1994 = 0;
        class148.field3590 = 0;
        class148.field3599 = 0;
        class23.field669 = 0;
        class26.field784 = 0;
        field3428 = 0;
        class95.field2206 = 0;
        class92.field2142 = 0;
        class24.field693 = 0;
        class148.field3619 = 0;
        client.field628 = 0;
        field3431 = 0;
        class24.field676 = 0;
        class124.field2865 = 0;
        class88.field2045 = 0;
        class50.field1346 = 0;
        class148.field3581 = 0;
        class148.field3586 = 0;
        class5.field140 = 0;
        class91.field2129 = 0;
        class113.field2616 = 0;
        class101.field2293 = 0;
        class103.field2325 = 0;
        class2.field26 = 0;
        class50.field1327 = 0;
        class43.field1160 = 0;
        class61.field1537 = 0;
        class10.field246 = 0;
        class141.method1061((byte) -2);
        class105.field2369 = -1;
        class143.field3451.field3601 = 0;
        class125.field2900 = 0;
        class73.field1839 = 0;
        class101.field2292 = 0;
        class121.field2783.field3601 = 0;
        class145.field3517 = false;
        class94.field2193 = -1;
        class63.field1617 = 0;
        class11.field277 = -1;
        class65.field1647 = 0;
        class10.field234 = -1;
        class30.method245((byte) 8, 0);
        for (int var2 = 0; var2 < 100; var2++) {
            class38.field1042[var2] = null;
        }
        class109.field2532 = (int) (Math.random() * 120.0D) - 60;
        class147.field3568 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        class40.field1060 = (int) (Math.random() * 110.0D) - 55;
        class2.field47 = 0;
        class90.field2095 = false;
        field3442 = 0;
        class42.field1105 = 0;
        class109.field2533 = 0;
        class88.field2061 = (int) (Math.random() * 80.0D) - 40;
        class9.field229 = (int) (Math.random() * 100.0D) - 50;
        class133.field3128 = 0;
        class131.field3094 = (int) (Math.random() * 30.0D) - 20;
        class17.field464 = 0;
        class130.field3060 = 0;
        class113.field2600 = -1;
        for (int var3 = 0; var3 < 2048; var3++) {
            class137.field3217[var3] = null;
            class107.field2419[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class37.field1013[var4] = null;
        }
        class46.field1244 = class137.field3217[2047] = new class111();
        class111.field2570.method709(-15667);
        class35.field961.method709(-15667);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class50.field1339[var5][var11][var12] = null;
                }
            }
        }
        class107.field2432 = new class103();
        class50.field1347 = 0;
        class106.field2387 = 0;
        for (int var6 = 0; var6 < class141.field3356; var6++) {
            class105 var10 = class15.method110(var6, 16);
            if (var10 != null && var10.field2377 == 0) {
                class121.field2795[var6] = 0;
                class16.field423[var6] = 0;
            }
        }
        for (int var7 = 0; var7 < class104.field2350.length; var7++) {
            class104.field2350[var7] = -1;
        }
        for (int var8 = 0; var8 < class42.field1111.length; var8++) {
            if (class42.field1111[var8] != -1) {
                class68.method520(class42.field1111[var8], 2);
                class42.field1111[var8] = -1;
            }
        }
        class68.method520(class29.field882, 2);
        class29.field882 = -1;
        class68.method520(class66.field1688, 2);
        class66.field1688 = -1;
        class68.method520(class107.field2436, 2);
        class107.field2436 = -1;
        class68.method520(class108.field2450, 2);
        class108.field2450 = -1;
        class68.method520(class144.field3476, 2);
        class144.field3476 = -1;
        class68.method520(class118.field2702, 2);
        class118.field2702 = -1;
        class68.method520(class78.field1916, 2);
        class145.field3517 = false;
        class135.field3175 = 0;
        class133.field3122 = -1;
        class78.field1916 = -1;
        class46.field1251 = 0;
        class147.field3559 = -1;
        class61.field1551 = false;
        class113.field2634 = null;
        class24.field695 = 3;
        class35.field975.method1163(false, null, false, new int[5], -1);
        for (int var9 = 0; var9 < 5; var9++) {
            class76.field1865[var9] = null;
            class1.field3[var9] = false;
        }
        class16.method118(0);
        class3.field55 = true;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)I")
    public static final int method1075(int arg0, int arg1, int arg2) {
        field3423++;
        int var3 = class1.method1(arg0 - 1, arg2 - 1, (byte) 50) + class1.method1(arg0 - 1, arg2 + 1, (byte) 50) + class1.method1(arg0 + 1, arg1 + arg2, (byte) 50) + class1.method1(arg0 + 1, arg2 + 1, (byte) 50);
        int var4 = class1.method1(arg0, arg2 - 1, (byte) 50) + class1.method1(arg0, arg2 + 1, (byte) 50) + class1.method1(arg0 - 1, arg2, (byte) 50) + class1.method1(arg0 + 1, arg2, (byte) 50);
        int var5 = class1.method1(arg0, arg2, (byte) 50);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(III)I")
    public static final int method1076(int arg0, int arg1, int arg2) {
        field3422++;
        long var3 = (long) ((arg1 << 16) + arg2);
        if (class83.field2015 != null && class83.field2015.field2228 == var3) {
            return arg0 < 123 ? -53 : class98.field2240.field3601 * 99 / (class98.field2240.field3592.length - class83.field2015.field2907) + 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)V")
    public static void method1077(int arg0) {
        field3435 = null;
        field3432 = null;
        field3449 = null;
        field3427 = null;
        field3439 = null;
        field3445 = null;
        field3448 = null;
        field3447 = null;
        field3443 = null;
        field3436 = null;
        field3444 = null;
        field3434 = null;
        field3446 = null;
        field3424 = null;
        field3437 = null;
        if (arg0 != -901) {
            field3440 = null;
        }
        field3440 = null;
        field3438 = null;
        field3421 = null;
    }

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)V")
    public static final void method1078(int arg0) {
        if (class21.field571 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (class21.field571 > 768) {
                    class4.field76[var1] = class63.method499(1024 - class21.field571, 15, class82.field1979[var1], class118.field2717[var1]);
                } else if (class21.field571 <= 256) {
                    class4.field76[var1] = class63.method499(256 - class21.field571, 76, class118.field2717[var1], class82.field1979[var1]);
                } else {
                    class4.field76[var1] = class118.field2717[var1];
                }
            }
        } else if (class77.field1902 <= 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                class4.field76[var2] = class82.field1979[var2];
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                if (class77.field1902 > 768) {
                    class4.field76[var3] = class63.method499(1024 - class77.field1902, 98, class82.field1979[var3], class136.field3205[var3]);
                } else if (class77.field1902 > 256) {
                    class4.field76[var3] = class136.field3205[var3];
                } else {
                    class4.field76[var3] = class63.method499(256 - class77.field1902, arg0 + 40, class136.field3205[var3], class82.field1979[var3]);
                }
            }
        }
        short var4 = 256;
        class120.method874(arg0, 9, 128, var4 + 7);
        int var5 = 0;
        int var6 = 6885;
        field3429++;
        class50.field1330.method410(0, 0);
        class120.method871();
        for (int var7 = 1; var7 < var4 - 1; var7++) {
            int var20 = (var4 - var7) * class76.field1889[var7] / var4;
            int var21 = var20 + 22;
            if (var21 < 0) {
                var21 = 0;
            }
            var5 += var21;
            for (int var22 = var21; var22 < 128; var22++) {
                int var23 = class82.field1976[var5++];
                if (var23 == 0) {
                    var6++;
                } else {
                    int var25 = 256 - var23;
                    int var26 = class21.field583.field1794[var6];
                    int var27 = class4.field76[var23];
                    class21.field583.field1794[var6++] = class94.method667(var25 * class94.method667(var26, 65280) + class94.method667(var27, 65280) * var23, 16711680) + class94.method667(-16711936, class94.method667(var27, 16711935) * var23 + var25 * class94.method667(var26, 16711935)) >> 8;
                }
            }
            var6 += var21 + 765 - 128;
        }
        class120.method874(637, 9, 765, var4 + 7);
        class150.field3698.method410(382, 0);
        class120.method871();
        int var8 = 7546;
        int var9 = 0;
        for (int var10 = 1; var10 < var4 - 1; var10++) {
            int var11 = (var4 - var10) * class76.field1889[var10] / var4;
            int var12 = 103 - var11;
            int var13 = var8 + var11;
            for (int var14 = 0; var14 < var12; var14++) {
                int var15 = class82.field1976[var9++];
                if (var15 == 0) {
                    var13++;
                } else {
                    int var17 = 256 - var15;
                    int var18 = class21.field583.field1794[var13];
                    int var19 = class4.field76[var15];
                    class21.field583.field1794[var13++] = class94.method667(-16711936, class94.method667(16711935, var19) * var15 + class94.method667(var18, 16711935) * var17) + class94.method667(var17 * class94.method667(65280, var18) + class94.method667(65280, var19) * var15, 16711680) >> 8;
                }
            }
            var8 = var13 + 765 - var11 - var12;
            var9 += 128 - var12;
        }
    }
}
