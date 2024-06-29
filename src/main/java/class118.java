import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class118 extends class4 {

    @OriginalMember(owner = "client!rb", name = "eb", descriptor = "Loa;")
    public static class98 field2631 = class38.method349(255, ":duelreq:");

    @OriginalMember(owner = "client!rb", name = "nb", descriptor = "I")
    public static int field2640 = 0;

    @OriginalMember(owner = "client!rb", name = "jb", descriptor = "I")
    public static int field2636 = 0;

    @OriginalMember(owner = "client!rb", name = "qb", descriptor = "Loa;")
    public static class98 field2643 = class38.method349(255, "redstone1");

    @OriginalMember(owner = "client!rb", name = "ob", descriptor = "Loa;")
    private static class98 field2641 = class38.method349(255, "go back to the main RuneScape webpage");

    @OriginalMember(owner = "client!rb", name = "Y", descriptor = "Loa;")
    public static class98 field2625 = field2641;

    @OriginalMember(owner = "client!rb", name = "pb", descriptor = "Loa;")
    private static class98 field2642 = class38.method349(255, "Please try using a different world)3");

    @OriginalMember(owner = "client!rb", name = "rb", descriptor = "Loa;")
    public static class98 field2644 = field2642;

    @OriginalMember(owner = "client!rb", name = "ib", descriptor = "Loa;")
    public static class98 field2635 = field2642;

    @OriginalMember(owner = "client!rb", name = "bb", descriptor = "Loa;")
    public static class98 field2628 = field2642;

    @OriginalMember(owner = "client!rb", name = "xb", descriptor = "Loa;")
    public static class98 field2650 = field2642;

    @OriginalMember(owner = "client!rb", name = "yb", descriptor = "Loa;")
    public static class98 field2651 = field2642;

    @OriginalMember(owner = "client!rb", name = "wb", descriptor = "Loa;")
    public static class98 field2649 = field2642;

    @OriginalMember(owner = "client!rb", name = "fb", descriptor = "B")
    public byte field2632;

    @OriginalMember(owner = "client!rb", name = "X", descriptor = "I")
    public int field2624;

    @OriginalMember(owner = "client!rb", name = "Z", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!rb", name = "ab", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!rb", name = "cb", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!rb", name = "db", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!rb", name = "hb", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!rb", name = "lb", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!rb", name = "mb", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!rb", name = "sb", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!rb", name = "tb", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!rb", name = "ub", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!rb", name = "vb", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!rb", name = "zb", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!rb", name = "Ab", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!rb", name = "kb", descriptor = "Lid;")
    public static class60 field2637;

    @OriginalMember(owner = "client!rb", name = "gb", descriptor = "Lkd;")
    public class73 field2633;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V")
    public static void method934(int arg0) {
        field2642 = null;
        field2628 = null;
        field2625 = null;
        field2631 = null;
        field2644 = null;
        field2649 = null;
        field2650 = null;
        field2635 = null;
        field2641 = null;
        field2643 = null;
        if (arg0 != 0) {
            method941(2, 120, -30, -69, -62, null, 80, -63, 9, -126, -56);
        }
        field2651 = null;
        field2637 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILoa;IIILoa;I)V")
    public static final void method935(int arg0, class98 arg1, int arg2, int arg3, int arg4, class98 arg5, int arg6) {
        field2646++;
        if (arg3 != -23060) {
            method935(67, null, -47, -29, 84, null, 12);
        }
        if (class80.field1780 >= 500) {
            return;
        }
        if (arg5.method790(101) <= 0) {
            class32.field781[class80.field1780] = arg1;
        } else {
            class32.field781[class80.field1780] = class102.method840(new class98[] { arg1, class64.field1376, arg5 }, 10);
        }
        class11.field227[class80.field1780] = arg2;
        class25.field608[class80.field1780] = arg6;
        class139.field3406[class80.field1780] = arg4;
        class113.field2534[class80.field1780] = arg0;
        class80.field1780++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIII)V")
    public static final void method936(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class82.field1857[0].method830(arg5, arg1);
        field2634++;
        class82.field1857[1].method830(arg5, arg0 + arg1 - 16);
        if (arg2 != 26882) {
            method941(7, -73, 94, -113, -47, null, -122, -83, -56, -114, -49);
        }
        class7.method41(arg5, arg1 + 16, 16, arg0 - 32, class78.field1703);
        int var6 = (arg0 - 32) * arg0 / arg3;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg0 - var6 - 32) * arg4 / (arg3 - arg0);
        class7.method41(arg5, arg1 + var7 + 16, 16, var6, class87.field1999);
        class7.method38(arg5, arg1 + var7 + 16, var6, class138.field3365);
        class7.method38(arg5 + 1, arg1 + 16 + var7, var6, class138.field3365);
        class7.method43(arg5, arg1 + var7 + 16, 16, class138.field3365);
        class7.method43(arg5, var7 + arg1 + 17, 16, class138.field3365);
        class7.method38(arg5 + 15, var7 + 16 + arg1, var6, class33.field844);
        class7.method38(arg5 + 14, arg1 - -var7 + 17, var6 - 1, class33.field844);
        class7.method43(arg5, arg1 + var7 + var6 + 15, 16, class33.field844);
        class7.method43(arg5 + 1, arg1 + var7 + var6 - -14, 15, class33.field844);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
    public static final void method937(boolean arg0) {
        class123.field2741 = class124.field2775;
        class25.field607 = class16.field329;
        field2651 = class88.field2034;
        class146.field3535 = class87.field1993;
        client.field501 = class14.field294;
        class1.field2 = class41.field960;
        class78.field1721 = class129.field2930;
        class33.field829 = class125.field2782;
        field2644 = class88.field2034;
        client.field493 = class14.field289;
        class94.field2150 = class36.field895;
        class134.field3268 = class10.field197;
        class33.field806 = class3.field35;
        class11.field232 = class132.field3180;
        class26.field629 = class74.field1557;
        class42.field994 = class115.field2594;
        class113.field2527 = class73.field1526;
        class120.field2703 = class67.field1435;
        class137.field3326 = class16.field332;
        class131.field3067 = class27.field662;
        class150.field3716 = class134.field3254;
        class46.field1057 = class97.field2228;
        class105.field2407 = class96.field2213;
        class33.field798 = class8.field144;
        class10.field208 = class53.field1186;
        class80.field1799 = class49.field1102;
        class55.field1205 = class126.field2821;
        class33.field856 = class124.field2775;
        class79.field1725 = class82.field1856;
        class140.field3427 = class41.field961;
        class80.field1773 = class62.field1330;
        class120.field2689 = class119.field2685;
        class146.field3542 = class135.field3294;
        class145.field3527 = class32.field756;
        class33.field808 = class124.field2775;
        class87.field1986 = class102.field2361;
        class121.field2708 = class8.field195;
        class5.field73 = class11.field234;
        class129.field2987 = class99.field2317;
        class134.field3255 = class145.field3520;
        class57.field1271 = class65.field1382;
        class26.field624 = class37.field905;
        class52.field1154 = class5.field80;
        class147.field3593 = class111.field2495;
        class29.field683 = class91.field2113;
        class58.field1298 = class129.field2943;
        class33.field797 = class124.field2775;
        class33.field848 = class124.field2775;
        class33.field838 = class124.field2775;
        class30.field696 = class65.field1396;
        class146.field3555 = class25.field620;
        class101.field2331 = class114.field2571;
        class20.field446 = class145.field3526;
        class73.field1510 = class4.field61;
        class113.field2533 = class108.field2447;
        class17.field359 = class41.field969;
        class75.field1610 = class17.field373;
        class33.field846 = class125.field2781;
        class73.field1533 = class62.field1329;
        class81.field1806 = class90.field2056;
        field2649 = class97.field2238;
        class4.field62 = class130.field3055;
        class139.field3403 = class8.field135;
        class138.field3378 = class84.field1966;
        class130.field3005 = class114.field2575;
        class25.field614 = class5.field82;
        class76.field1660 = class57.field1273;
        class77.field1690 = class113.field2528;
        class1.field8 = class150.field3723;
        class33.field786 = class124.field2775;
        class112.field2512 = class127.field2849;
        class33.field788 = class124.field2775;
        class96.field2200 = class10.field223;
        class135.field3299 = class3.field46;
        class145.field3513 = class38.field932;
        class96.field2210 = class132.field3100;
        class94.field2141 = class113.field2543;
        class18.field399 = class11.field230;
        class105.field2406 = class33.field809;
        class64.field1371 = class29.field684;
        class105.field2420 = class87.field1992;
        class91.field2089 = class90.field2057;
        class46.field1055 = class97.field2228;
        class37.field921 = class112.field2519;
        class106.field2432 = class126.field2797;
        class87.field1995 = class140.field3424;
        class21.field473 = class98.field2298;
        class52.field1136 = class21.field465;
        class80.field1774 = class17.field372;
        class33.field849 = class31.field715;
        class98.field2267 = class145.field3495;
        class88.field2021 = class14.field299;
        class105.field2409 = class137.field3338;
        class33.field827 = class124.field2775;
        class75.field1630 = class138.field3375;
        class150.field3718 = class26.field628;
        field2625 = class146.field3539;
        class75.field1640 = class30.field698;
        class63.field1356 = class30.field704;
        class129.field2955 = class36.field892;
        class58.field1293 = class119.field2687;
        class3.field28 = class46.field1078;
        class18.field379 = class105.field2419;
        field2629++;
        field2628 = class88.field2034;
        class21.field476 = class82.field1864;
        class97.field2242 = class25.field601;
        class84.field1944 = class150.field3724;
        class74.field1598 = class77.field1688;
        class33.field816 = class31.field715;
        class3.field37 = class75.field1641;
        class44.field1002 = class67.field1421;
        client.field512 = class113.field2541;
        class33.field851 = class46.field1066;
        class27.field658 = class11.field241;
        class130.field3043 = class90.field2059;
        class138.field3368 = class15.field316;
        class78.field1711 = class46.field1056;
        class17.field362 = class108.field2450;
        class25.field598 = class11.field233;
        class33.field819 = class88.field2034;
        class33.field789 = class81.field1831;
        class75.field1657 = class8.field183;
        class145.field3509 = class115.field2593;
        class29.field679 = class86.field1970;
        class48.field1082 = class64.field1362;
        class96.field2214 = class119.field2663;
        class76.field1672 = class126.field2795;
        class138.field3376 = class11.field230;
        field2635 = class97.field2238;
        class123.field2737 = class124.field2764;
        class42.field993 = class57.field1263;
        class57.field1259 = class150.field3702;
        class33.field821 = class127.field2838;
        class33.field845 = class124.field2775;
        class33.field803 = class124.field2775;
        class77.field1689 = class1.field7;
        class1.field5 = class90.field2074;
        class29.field674 = class126.field2807;
        class137.field3310 = class80.field1791;
        class84.field1963 = class98.field2282;
        class64.field1376 = class36.field897;
        class71.field1448 = class125.field2786;
        class130.field3052 = class1.field21;
        class79.field1737 = class35.field869;
        class126.field2799 = class98.field2275;
        class56.field1251 = class25.field602;
        class146.field3560 = class37.field922;
        class25.field606 = class84.field1941;
        class33.field831 = class124.field2775;
        class30.field695 = class79.field1740;
        class41.field959 = class141.field3445;
        class57.field1266 = class123.field2732;
        class56.field1245 = class137.field3352;
        class119.field2681 = class24.field591;
        class33.field811 = class130.field3056;
        class117.field2607 = class99.field2316;
        class139.field3386 = class29.field680;
        class33.field792 = class124.field2775;
        class44.field998 = class108.field2454;
        class29.field678 = class147.field3601;
        class18.field392 = class78.field1698;
        class88.field2023 = class117.field2613;
        class49.field1103 = class147.field3583;
        class79.field1727 = class84.field1947;
        class33.field843 = class124.field2775;
        class149.field3697 = class97.field2239;
        class126.field2791 = class90.field2083;
        class106.field2438 = class114.field2584;
        class73.field1519 = class62.field1329;
        field2650 = class87.field1996;
        class114.field2574 = class24.field595;
        class32.field757 = class76.field1677;
        class33.field790 = class125.field2782;
        class33.field828 = class86.field1976;
        class84.field1957 = class108.field2452;
        class37.field906 = class81.field1831;
        class115.field2596 = class41.field968;
        class37.field910 = class53.field1183;
        class35.field863 = class134.field3259;
        class91.field2117 = class126.field2822;
        class87.field1991 = class29.field685;
        class90.field2072 = class74.field1573;
        class123.field2753 = class65.field1398;
        class91.field2095 = class115.field2589;
        class91.field2108 = class84.field1960;
        class86.field1968 = class96.field2208;
        class131.field3083 = class27.field662;
        class8.field187 = class65.field1395;
        class41.field958 = class147.field3579;
        class18.field397 = class42.field981;
        class91.field2112 = class75.field1637;
        class57.field1272 = class65.field1382;
        class54.field1194 = class99.field2320;
        class18.field383 = class124.field2760;
        class88.field2035 = class48.field1083;
        class1.field4 = class16.field325;
        class121.field2707 = class35.field873;
        class131.field3068 = class117.field2618;
        if (!arg0) {
            method941(-58, 47, 115, -87, 61, null, 70, -6, 4, -72, 18);
        }
        class119.field2679 = class35.field874;
        class127.field2850 = client.field482;
        class56.field1238 = class26.field633;
        class88.field2010 = class101.field2334;
        class113.field2526 = class81.field1839;
        class131.field3063 = class108.field2452;
        class140.field3428 = class10.field209;
        class127.field2835 = class130.field3057;
        class33.field787 = class111.field2478;
        class33.field825 = class124.field2775;
        class33.field820 = class124.field2775;
        class24.field590 = class99.field2319;
        class33.field812 = class149.field3688;
        class33.field804 = class46.field1066;
        class123.field2734 = class49.field1107;
        class33.field841 = class91.field2115;
        class130.field2998 = class108.field2441;
        class3.field32 = class126.field2827;
        class105.field2412 = class106.field2435;
        class33.field833 = class124.field2775;
        class134.field3260 = class134.field3261;
        class123.field2742 = class97.field2248;
        class147.field3589 = class78.field1709;
        class98.field2278 = class38.field933;
        class33.field801 = class5.field85;
        class90.field2079 = class33.field818;
        class112.field2517 = class64.field1373;
        class33.field842 = class124.field2775;
        class15.field304 = class131.field3093;
        class73.field1540 = class82.field1869;
        if (class80.field1800) {
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)Z")
    public static final boolean method938(int arg0, byte arg1) {
        if (arg1 == -90) {
            field2647++;
            return (arg0 >> 29 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V")
    public static final void method939(int arg0) {
        field2652++;
        if (arg0 < class75.field1650) {
            class54.method442(-25477);
        } else {
            class96.method768((byte) 98, 40);
            class56.field1254 = class139.field3394;
            class139.field3394 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IJ)V")
    public static final void method940(int arg0, long arg1) {
        field2648++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0 != 32007) {
            field2643 = null;
        }
        for (int var3 = 0; var3 < class49.field1112; var3++) {
            if (class4.field67[var3] == arg1) {
                class150.field3722++;
                class137.field3332 = true;
                class49.field1112--;
                for (int var4 = var3; var4 < class49.field1112; var4++) {
                    class134.field3287[var4] = class134.field3287[var4 + 1];
                    class105.field2404[var4] = class105.field2404[var4 + 1];
                    class4.field67[var4] = class4.field67[var4 + 1];
                    class73.field1521[var4] = class73.field1521[var4 + 1];
                }
                class6.field99 = class119.field2680 + 1;
                class132.field3116.method177(arg0 - 25383, 115);
                class132.field3116.method92(true, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIII[Ltd;IIIII)V")
    public static final void method941(int arg0, int arg1, int arg2, int arg3, int arg4, class132[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for (int var11 = 0; var11 < arg5.length; var11++) {
            class132 var12 = arg5[var11];
            if (var12 != null && (var12.field3219 == 0 || var12.field3109) && var12 != null && var12.field3195 == arg10 && !class130.method1068(true, var12)) {
                int var13 = var12.field3216 + arg6 - arg8;
                int var14 = var12.field3102 + arg1 - arg0;
                int var15 = var12.field3215 + var13;
                int var16 = var13 > arg6 ? var13 : arg6;
                int var17 = var12.field3165 + var14;
                int var18 = arg1 < var14 ? var14 : arg1;
                int var19 = arg7 > var15 ? var15 : arg7;
                int var20 = var17 < arg4 ? var17 : arg4;
                if (var12.field3219 == 0) {
                    method941(var18 + var12.field3114 - var14, var18, arg2, 1, var20, arg5, var16, var19, var16 + var12.field3189 - var13, arg9, var12.field3135);
                    if (var12.field3113 != null) {
                        method941(var12.field3114 + var18 - var14, var18, arg2, 1, var20, var12.field3113, var16, var19, var16 + var12.field3189 - var13, arg9, var12.field3135);
                    }
                }
                if (var12.field3109) {
                    boolean var21;
                    if (class42.field990 >= var16 && var18 <= class123.field2749 && var19 > class42.field990 && var20 > class123.field2749) {
                        var21 = true;
                    } else {
                        var21 = false;
                    }
                    boolean var22 = false;
                    if (class36.field899 == 1 && var21) {
                        var22 = true;
                    }
                    boolean var23 = false;
                    if (class42.field976 == 1 && var16 <= class150.field3717 && class86.field1980 >= var18 && class150.field3717 < var19 && class86.field1980 < var20) {
                        var23 = true;
                    }
                    if (var23 && class16.field334 == null && (arg9 & 0x200) != 0 && !class145.field3529 && class58.method468((byte) -101, var12) != null) {
                        class29.field691 = false;
                        class31.field729 = class150.field3717 - var16;
                        class19.field424 = 0;
                        class16.field334 = var12;
                        class51.field1135 = arg2;
                        class63.field1346 = class86.field1980 - var18;
                    }
                    if (class16.field334 != null || class145.field3529) {
                        var22 = false;
                        var23 = false;
                        var21 = false;
                    }
                    if (!var12.field3139 && var23 && (arg9 & 0x1) != 0) {
                        var12.field3139 = true;
                        if (var12.field3158 != null) {
                            class67.method555(var12, 0, null, var12.field3158, -2401, class86.field1980 - var14, -var13 + class150.field3717);
                        }
                    }
                    if (var12.field3139 && var22 && (arg9 & 0x4) != 0 && var12.field3123 != null) {
                        class67.method555(var12, 0, null, var12.field3123, -2401, class123.field2749 - var14, -var13 + class42.field990);
                    }
                    if (var12.field3139 && !var22 && (arg9 & 0x2) != 0) {
                        var12.field3139 = false;
                        if (var12.field3205 != null) {
                            class67.method555(var12, 0, null, var12.field3205, -2401, class123.field2749 - var14, -var13 + class42.field990);
                        }
                    }
                    if (var22 && (arg9 & 0x8) != 0 && var12.field3099 != null) {
                        class67.method555(var12, 0, null, var12.field3099, -2401, class123.field2749 - var14, class42.field990 - var13);
                    }
                    if (!var12.field3119 && var21 && (arg9 & 0x10) != 0) {
                        var12.field3119 = true;
                        if (var12.field3212 != null) {
                            class67.method555(var12, 0, null, var12.field3212, -2401, class123.field2749 - var14, -var13 + class42.field990);
                        }
                    }
                    if (var12.field3119 && var21 && (arg9 & 0x40) != 0 && var12.field3156 != null) {
                        class67.method555(var12, 0, null, var12.field3156, -2401, class123.field2749 - var14, -var13 + class42.field990);
                    }
                    if (var12.field3119 && !var21 && (arg9 & 0x20) != 0) {
                        var12.field3119 = false;
                        if (var12.field3153 != null) {
                            class67.method555(var12, 0, null, var12.field3153, -2401, class123.field2749 - var14, class42.field990 - var13);
                        }
                    }
                    if (var12.field3136 != null && (arg9 & 0x80) != 0) {
                        class67.method555(var12, 0, null, var12.field3136, arg3 - 2402, 0, 0);
                    }
                    if (var21 && class86.field1977 != 0 && var12.field3192 != null && (arg9 & 0x400) != 0) {
                        class67.method555(var12, 0, null, var12.field3192, -2401, class86.field1977, 0);
                    }
                    if ((arg9 & 0x100) != 0) {
                        if (class6.field99 > var12.field3157 && var12.field3143 != null) {
                            class67.method555(var12, 0, null, var12.field3143, -2401, 0, 0);
                        }
                        if (class97.field2247 > var12.field3157 && var12.field3155 != null) {
                            class67.method555(var12, 0, null, var12.field3155, -2401, 0, 0);
                        }
                        if (var12.field3157 < class113.field2522 && var12.field3198 != null) {
                            class67.method555(var12, 0, null, var12.field3198, arg3 - 2402, 0, 0);
                        }
                        var12.field3157 = class119.field2680;
                    }
                }
            }
        }
        field2626++;
        if (arg3 != 1) {
            method935(-108, null, 15, -28, -96, null, -34);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIII)V")
    public static final void method942(int arg0, int arg1, int arg2, int arg3) {
        class132 var4 = class49.method416(true, arg2, arg1);
        if (arg0 != 10790) {
            field2651 = null;
        }
        field2638++;
        if (var4 != null && var4.field3199 != null) {
            class67.method555(var4, 0, null, var4.field3199, -2401, 0, 0);
        }
        class21.field471 = arg2;
        class113.field2555 = true;
        class39.field949 = arg1;
        class77.field1696 = arg3;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)V")
    public static final void method943(byte arg0, int arg1) {
        if (class71.field1483 == 0) {
            class56.field1252.method658((byte) 83, arg1);
        } else {
            class71.field1481 = arg1;
        }
        field2630++;
        if (arg0 != 75) {
            field2650 = null;
        }
    }
}
