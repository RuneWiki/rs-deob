import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class47 {

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "[I")
    public static int[] field947 = new int[1000];

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "Led;")
    public static class43 field950 = class191.method1219("Mem:", false);

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "Led;")
    private static class43 field954 = class191.method1219("Close", false);

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "Led;")
    public static class43 field956 = class191.method1219("null", false);

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "Z")
    public static boolean field949 = false;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "Led;")
    public static class43 field959 = field954;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "Lig;")
    public static class80 field948;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "[Ltg;")
    public static class179[] field953;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lob;I)Lob;")
    public static final class129 method292(class129 arg0, int arg1) {
        if (arg1 != 5) {
            field954 = null;
        }
        field958++;
        class129 var2 = class71.method435((byte) 124, arg0);
        if (var2 == null) {
            var2 = arg0.field2704;
        }
        return var2;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILig;)V")
    public static final void method293(int arg0, int arg1, class80 arg2) {
        if (arg1 != 26027) {
            field950 = null;
        }
        field952++;
        if (class104.field1979 == null) {
            class52.method320(null, 255, 255, (byte) 124, (byte) 0, 0, true);
            class150.field3035[arg0] = arg2;
        } else {
            class104.field1979.field1727 = arg0 * 8 + 5;
            int var3 = class104.field1979.method545(-7436);
            int var4 = class104.field1979.method545(arg1 - 33463);
            arg2.method494(var4, var3, false);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III[Lob;IIIIII)V")
    public static final void method294(int arg0, int arg1, int arg2, class129[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field951++;
        class168.method1044(arg1, arg6, arg7, arg9);
        class135.method866();
        if (arg2 != -290) {
            method295(93);
        }
        for (int var10 = 0; var10 < arg3.length; var10++) {
            class129 var11 = arg3[var10];
            if (var11 != null && (var11.field2576 == arg8 || arg8 == -1412584499 && class148.field3021 == var11)) {
                int var12;
                if (arg0 == -1) {
                    class96.field1872[class125.field2476] = var11.field2633 + arg4;
                    class114.field2214[class125.field2476] = var11.field2607 + arg5;
                    class27.field480[class125.field2476] = var11.field2656;
                    class21.field364[class125.field2476] = var11.field2662;
                    var12 = class125.field2476++;
                } else {
                    var12 = arg0;
                }
                var11.field2582 = var12;
                var11.field2643 = client.field559;
                if (!var11.field2707 || !class163.method1020(var11, -1)) {
                    if (var11.field2646 > 0) {
                        class74.method458((byte) 18, var11);
                    }
                    int var13 = var11.field2607 + arg5;
                    int var14 = var11.field2633 + arg4;
                    int var15 = var11.field2631;
                    if (class148.field3021 == var11) {
                        if (arg8 != -1412584499 && !var11.field2708) {
                            class74.field1471 = arg5;
                            class137.field2847 = arg3;
                            class95.field1860 = arg4;
                            continue;
                        }
                        if (class95.field1850 && class55.field1106) {
                            int var16 = class185.field3654;
                            int var17 = var16 - class191.field3727;
                            int var18 = class105.field1998;
                            if (var17 < class203.field3965) {
                                var17 = class203.field3965;
                            }
                            int var19 = var18 - class108.field2084;
                            if (var11.field2656 + var17 > class203.field3965 + class159.field3211.field2656) {
                                var17 = class203.field3965 + class159.field3211.field2656 - var11.field2656;
                            }
                            var14 = var17;
                            if (var19 < class41.field797) {
                                var19 = class41.field797;
                            }
                            if (var19 + var11.field2662 > class41.field797 - -class159.field3211.field2662) {
                                var19 = class41.field797 + class159.field3211.field2662 - var11.field2662;
                            }
                            var13 = var19;
                        }
                        if (!var11.field2708) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var23;
                    int var25;
                    if (var11.field2690 == 2) {
                        var23 = arg7;
                        var20 = arg1;
                        var21 = arg6;
                        var25 = arg9;
                    } else if (var11.field2690 == 9) {
                        int var26 = var13;
                        int var27 = var14;
                        int var28 = var11.field2656 + var14;
                        if (var14 > var28) {
                            var27 = var28;
                            var28 = var14;
                        }
                        var28++;
                        var23 = arg7 > var28 ? var28 : arg7;
                        int var30 = var13 + var11.field2662;
                        if (var30 < var13) {
                            var26 = var30;
                            var30 = var13;
                        }
                        var30++;
                        var21 = arg6 >= var26 ? arg6 : var26;
                        var20 = arg1 >= var27 ? arg1 : var27;
                        var25 = arg9 <= var30 ? arg9 : var30;
                    } else {
                        var20 = var14 <= arg1 ? arg1 : var14;
                        var21 = var13 > arg6 ? var13 : arg6;
                        int var22 = var11.field2656 + var14;
                        var23 = arg7 <= var22 ? arg7 : var22;
                        int var24 = var13 + var11.field2662;
                        var25 = var24 < arg9 ? var24 : arg9;
                    }
                    if (!var11.field2707 || var23 > var20 && var25 > var21) {
                        if (var11.field2646 != 0) {
                            if (var11.field2646 == 1337) {
                                class188.field3687 = var14;
                                class87.field1705 = var13;
                                class67.method420(var14, var13, var11.field2656, var11.field2662, -89);
                                class168.method1044(arg1, arg6, arg7, arg9);
                                continue;
                            }
                            if (var11.field2646 == 1338) {
                                class203.method1313(arg2 ^ 0xFFFFF921, var13, var14, var12);
                                class168.method1044(arg1, arg6, arg7, arg9);
                                continue;
                            }
                        }
                        int var32 = class105.field1998;
                        int var33 = class185.field3654;
                        if (!class186.field3665 && var33 >= var20 && var32 >= var21 && var33 < var23 && var32 < var25) {
                            class122.method799(var11, var33 - var14, var32 - var13, (byte) -126);
                        }
                        if (var11.field2690 == 0) {
                            if (!var11.field2707 && class163.method1020(var11, -1) && class118.field2299 != var11) {
                                continue;
                            }
                            if (!var11.field2707) {
                                if (var11.field2590 - var11.field2662 < var11.field2680) {
                                    var11.field2680 = var11.field2590 - var11.field2662;
                                }
                                if (var11.field2680 < 0) {
                                    var11.field2680 = 0;
                                }
                            }
                            method294(var12, var20, arg2, arg3, var14 - var11.field2572, var13 - var11.field2680, var21, var23, var11.field2664, var25);
                            if (var11.field2626 != null) {
                                method294(var12, var20, -290, var11.field2626, var14 - var11.field2572, -var11.field2680 + var13, var21, var23, var11.field2664, var25);
                            }
                            class137 var34 = (class137) class15.field227.method75((long) var11.field2664, -117);
                            if (var34 != null) {
                                if (var34.field2835 == 0 && class185.field3654 >= var20 && class105.field1998 >= var21 && var23 > class185.field3654 && var25 > class105.field1998 && !class186.field3665 && !class121.field2415) {
                                    class40.field756[0] = 1003;
                                    class112.field2141[0] = class156.field3144;
                                    class41.field799 = 1;
                                    class115.field2237[0] = class110.field2127;
                                }
                                class52.method316(var14, var13, var20, -76, var23, var25, var21, var34.field2850, var12);
                            }
                            class168.method1044(arg1, arg6, arg7, arg9);
                            class135.method866();
                        }
                        if (class9.field165[var12] || class23.field448 > 1) {
                            if (var11.field2690 == 0 && !var11.field2707 && var11.field2590 > var11.field2662) {
                                class136.method880(var11.field2662, var13, var11.field2590, var11.field2680, var11.field2656 + var14, (byte) -56);
                            }
                            if (var11.field2690 != 1) {
                                if (var11.field2690 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var11.field2662; var36++) {
                                        for (int var37 = 0; var37 < var11.field2656; var37++) {
                                            int var38 = (var11.field2648 + 32) * var37 + var14;
                                            int var39 = (var11.field2639 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var11.field2689[var35];
                                                var39 += var11.field2705[var35];
                                            }
                                            if (var11.field2597[var35] > 0) {
                                                boolean var41 = false;
                                                boolean var42 = false;
                                                int var43 = var11.field2597[var35] - 1;
                                                if (arg1 < var38 + 32 && var38 < arg7 && arg6 < var39 + 32 && arg9 > var39 || class121.field2417 == var11 && class161.field3254 == var35) {
                                                    class120 var44;
                                                    if (class161.field3259 == 1 && class74.field1462 == var35 && class19.field323 == var11.field2664) {
                                                        var44 = class79.method483((byte) -14, 0, var43, 2, false, var11.field2609[var35]);
                                                    } else {
                                                        var44 = class79.method483((byte) -14, 3153952, var43, 1, false, var11.field2609[var35]);
                                                    }
                                                    if (var44 == null) {
                                                        class43.method265(false, var11);
                                                    } else if (class121.field2417 == var11 && class161.field3254 == var35) {
                                                        int var45 = class185.field3654 - class194.field3807;
                                                        int var46 = class105.field1998 - class167.field3316;
                                                        if (var46 < 5 && var46 > -5) {
                                                            var46 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (class88.field1714 < 5) {
                                                            var45 = 0;
                                                            var46 = 0;
                                                        }
                                                        var44.method776(var38 + var45, var39 + var46, 128);
                                                        if (arg8 != -1) {
                                                            class129 var47 = arg3[arg8 & 0xFFFF];
                                                            int var48 = class168.field3336;
                                                            int var49 = class168.field3339;
                                                            if (var48 > var39 + var46 && var47.field2680 > 0) {
                                                                int var50 = (var48 - var39 - var46) * class65.field1325 / 3;
                                                                if (var50 > class65.field1325 * 10) {
                                                                    var50 = class65.field1325 * 10;
                                                                }
                                                                if (var47.field2680 < var50) {
                                                                    var50 = var47.field2680;
                                                                }
                                                                class167.field3316 += var50;
                                                                var47.field2680 -= var50;
                                                                class43.method265(false, var47);
                                                            }
                                                            if (var49 < var39 + var46 + 32 && var47.field2590 - var47.field2662 > var47.field2680) {
                                                                int var51 = (var39 + var46 + 32 - var49) * class65.field1325 / 3;
                                                                if (class65.field1325 * 10 < var51) {
                                                                    var51 = class65.field1325 * 10;
                                                                }
                                                                if (var47.field2590 - var47.field2680 - var47.field2662 < var51) {
                                                                    var51 = var47.field2590 - var47.field2680 - var47.field2662;
                                                                }
                                                                class167.field3316 -= var51;
                                                                var47.field2680 += var51;
                                                                class43.method265(false, var47);
                                                            }
                                                        }
                                                    } else if (class75.field1482 == var11 && class174.field3463 == var35) {
                                                        var44.method776(var38, var39, 128);
                                                    } else {
                                                        var44.method788(var38, var39);
                                                    }
                                                }
                                            } else if (var11.field2579 != null && var35 < 20) {
                                                class120 var40 = var11.method829(var35, (byte) 34);
                                                if (var40 != null) {
                                                    var40.method788(var38, var39);
                                                } else if (class101.field1930) {
                                                    class43.method265(false, var11);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var11.field2690 == 3) {
                                    int var52;
                                    if (class34.method195(false, var11)) {
                                        var52 = var11.field2692;
                                        if (class118.field2299 == var11 && var11.field2619 != 0) {
                                            var52 = var11.field2619;
                                        }
                                    } else {
                                        var52 = var11.field2655;
                                        if (class118.field2299 == var11 && var11.field2653 != 0) {
                                            var52 = var11.field2653;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field2637) {
                                            class168.method1046(var14, var13, var11.field2656, var11.field2662, var52);
                                        } else {
                                            class168.method1041(var14, var13, var11.field2656, var11.field2662, var52);
                                        }
                                    } else if (var11.field2637) {
                                        class168.method1042(var14, var13, var11.field2656, var11.field2662, var52, 256 - (var15 & 0xFF));
                                    } else {
                                        class168.method1051(var14, var13, var11.field2656, var11.field2662, var52, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field2690 == 4) {
                                    class202 var53 = var11.method837(arg2 ^ 0x164);
                                    if (var53 != null) {
                                        class43 var54 = var11.field2596;
                                        int var55;
                                        if (class34.method195(false, var11)) {
                                            var55 = var11.field2692;
                                            if (class118.field2299 == var11 && var11.field2619 != 0) {
                                                var55 = var11.field2619;
                                            }
                                            if (var11.field2608.method248((byte) 60) > 0) {
                                                var54 = var11.field2608;
                                            }
                                        } else {
                                            var55 = var11.field2655;
                                            if (class118.field2299 == var11 && var11.field2653 != 0) {
                                                var55 = var11.field2653;
                                            }
                                        }
                                        if (var11.field2707 && var11.field2666 != -1) {
                                            class46 var56 = class2.method18(var11.field2666, 0);
                                            var54 = var56.field905;
                                            if (var54 == null) {
                                                var54 = field956;
                                            }
                                            if ((var56.field924 == 1 || var11.field2577 != 1) && var11.field2577 != -1) {
                                                var54 = class167.method1036(new class43[] { class50.field1002, var54, class91.field1810, class39.method214(var11.field2577, (byte) 108) }, true);
                                            }
                                        }
                                        if (class107.field2052 == var11) {
                                            var55 = var11.field2655;
                                            var54 = class88.field1710;
                                        }
                                        if (!var11.field2707) {
                                            var54 = class193.method1229(var11, var54, 1000);
                                        }
                                        var53.method948(var54, var14, var13, var11.field2656, var11.field2662, var55, var11.field2622 ? 0 : -1, var11.field2624, var11.field2606, var11.field2672);
                                    } else if (class101.field1930) {
                                        class43.method265(false, var11);
                                    }
                                } else if (var11.field2690 == 5) {
                                    if (var11.field2707) {
                                        class120 var57;
                                        if (var11.field2666 == -1) {
                                            var57 = var11.method833(-125, false);
                                        } else {
                                            var57 = class79.method483((byte) -14, var11.field2698, var11.field2666, var11.field2641, false, var11.field2577);
                                        }
                                        if (var57 != null) {
                                            int var58 = var57.field2386;
                                            int var59 = var57.field2390;
                                            if (var11.field2594) {
                                                class168.method1039(var14, var13, var11.field2656 + var14, var13 - -var11.field2662);
                                                int var61 = (var11.field2656 + var58 - 1) / var58;
                                                int var62 = (var11.field2662 + var59 - 1) / var59;
                                                for (int var63 = 0; var63 < var61; var63++) {
                                                    for (int var64 = 0; var64 < var62; var64++) {
                                                        if (var11.field2688 != 0) {
                                                            var57.method775(var58 / 2 + var58 * var63 + var14, var59 * var64 + var59 / 2 + var13, var11.field2688, 4096);
                                                        } else if (var15 == 0) {
                                                            var57.method788(var14 + var58 * var63, var13 - -(var59 * var64));
                                                        } else {
                                                            var57.method776(var58 * var63 + var14, var59 * var64 + var13, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class168.method1044(arg1, arg6, arg7, arg9);
                                            } else {
                                                int var60 = var11.field2656 * 4096 / var58;
                                                if (var11.field2688 != 0) {
                                                    var57.method775(var11.field2656 / 2 + var14, var11.field2662 / 2 + var13, var11.field2688, var60);
                                                } else if (var15 != 0) {
                                                    var57.method766(var14, var13, var11.field2656, var11.field2662, 256 - (var15 & 0xFF));
                                                } else if (var11.field2656 == var58 && var11.field2662 == var59) {
                                                    var57.method788(var14, var13);
                                                } else {
                                                    var57.method786(var14, var13, var11.field2656, var11.field2662);
                                                }
                                            }
                                        } else if (class101.field1930) {
                                            class43.method265(false, var11);
                                        }
                                    } else {
                                        class120 var65 = var11.method833(-114, class34.method195(false, var11));
                                        if (var65 != null) {
                                            var65.method788(var14, var13);
                                        } else if (class101.field1930) {
                                            class43.method265(false, var11);
                                        }
                                    }
                                } else if (var11.field2690 == 6) {
                                    class199 var66 = null;
                                    boolean var67 = class34.method195(false, var11);
                                    int var68 = 0;
                                    int var69;
                                    if (var67) {
                                        var69 = var11.field2642;
                                    } else {
                                        var69 = var11.field2586;
                                    }
                                    if (var11.field2666 != -1) {
                                        class46 var70 = class2.method18(var11.field2666, 0);
                                        if (var70 != null) {
                                            class46 var71 = var70.method290(0, var11.field2577);
                                            var66 = var71.method286(arg2 + 162, 0, 1, null);
                                            if (var66 == null) {
                                                class43.method265(false, var11);
                                            } else {
                                                var66.method1304();
                                                var68 = -var66.field1819 / 2;
                                            }
                                        }
                                    } else if (var11.field2635 == 5) {
                                        if (var11.field2604 == -1) {
                                            var66 = class5.field103.method471(-1, null, arg2 ^ 0x124, -1, null);
                                        } else {
                                            int var73 = var11.field2604 & 0x7FF;
                                            if (class80.field1593 == var73) {
                                                var73 = 2047;
                                            }
                                            class1 var74 = class12.field183[var73];
                                            class205 var75 = var69 == -1 ? null : class175.method1101(var69, true);
                                            if (var74 != null && (int) var74.field23.method249(-48) << 11 == (var11.field2604 & 0xFFFFF800)) {
                                                var66 = var74.field24.method471(var11.field2589, null, arg2 ^ 0x124, 0, var75);
                                            }
                                        }
                                    } else if (var69 == -1) {
                                        var66 = var11.method832(class67.field1348.field24, arg2 - 20107, null, -1, var67);
                                        if (var66 == null && class101.field1930) {
                                            class43.method265(false, var11);
                                        }
                                    } else {
                                        class205 var72 = class175.method1101(var69, true);
                                        var66 = var11.method832(class67.field1348.field24, arg2 - 20107, var72, var11.field2589, var67);
                                        if (var66 == null && class101.field1930) {
                                            class43.method265(false, var11);
                                        }
                                    }
                                    if (var66 != null) {
                                        class135.method867(var11.field2702 + var14 + var11.field2656 / 2, var11.field2662 / 2 + var13 - -var11.field2574);
                                        int var76 = class135.field2797[var11.field2592] * var11.field2682 >> 16;
                                        int var77 = class135.field2798[var11.field2592] * var11.field2682 >> 16;
                                        if (!var11.field2707) {
                                            var66.method399(0, var11.field2591, 0, var11.field2592, 0, var76, var77);
                                        } else if (var11.field2614) {
                                            var66.method392(0, var11.field2591, var11.field2605, var11.field2592, var11.field2616, var11.field2695 + var76 + var68, var11.field2695 + var77, var11.field2682);
                                        } else {
                                            var66.method399(0, var11.field2591, var11.field2605, var11.field2592, var11.field2616, var68 + var76 + var11.field2695, var11.field2695 + var77);
                                        }
                                        class135.method864();
                                    }
                                } else {
                                    if (var11.field2690 == 7) {
                                        class202 var78 = var11.method837(-41);
                                        if (var78 == null) {
                                            if (class101.field1930) {
                                                class43.method265(false, var11);
                                            }
                                            continue;
                                        }
                                        int var79 = 0;
                                        for (int var80 = 0; var80 < var11.field2662; var80++) {
                                            for (int var81 = 0; var81 < var11.field2656; var81++) {
                                                if (var11.field2597[var79] > 0) {
                                                    class46 var82 = class2.method18(var11.field2597[var79] - 1, 0);
                                                    class43 var83;
                                                    if (var82.field924 != 1 && var11.field2609[var79] == 1) {
                                                        var83 = class167.method1036(new class43[] { class50.field1002, var82.field905, class75.field1498 }, true);
                                                    } else {
                                                        var83 = class167.method1036(new class43[] { class50.field1002, var82.field905, class91.field1810, class39.method214(var11.field2609[var79], (byte) 108) }, true);
                                                    }
                                                    int var84 = var14 + (var11.field2648 + 115) * var81;
                                                    int var85 = (var11.field2639 + 12) * var80 + var13;
                                                    if (var11.field2624 == 0) {
                                                        var78.method954(var83, var84, var85, var11.field2655, var11.field2622 ? 0 : -1);
                                                    } else if (var11.field2624 == 1) {
                                                        var78.method935(var83, var84 + var11.field2656 / 2, var85, var11.field2655, var11.field2622 ? 0 : -1);
                                                    } else {
                                                        var78.method949(var83, var84 + var11.field2656 - 1, var85, var11.field2655, var11.field2622 ? 0 : -1);
                                                    }
                                                }
                                                var79++;
                                            }
                                        }
                                    }
                                    if (var11.field2690 == 8 && class82.field1625 == var11 && class97.field1884 == class36.field670) {
                                        int var86 = 0;
                                        class43 var87 = var11.field2596;
                                        class202 var88 = class23.field451;
                                        int var89 = 0;
                                        class43 var90 = class193.method1229(var11, var87, 1000);
                                        while (var90.method248((byte) 60) > 0) {
                                            int var98 = var90.method261((byte) -128, client.field552);
                                            class43 var99;
                                            if (var98 == -1) {
                                                var99 = var90;
                                                var90 = class110.field2127;
                                            } else {
                                                var99 = var90.method241((byte) -42, 0, var98);
                                                var90 = var90.method238(arg2 + 371, var98 - -4);
                                            }
                                            int var100 = var88.method952(var99);
                                            var89 += var88.field3071 + 1;
                                            if (var86 < var100) {
                                                var86 = var100;
                                            }
                                        }
                                        var89 += 7;
                                        var86 += 6;
                                        int var91 = var11.field2656 + var14 - var86 - 5;
                                        int var92 = var11.field2662 + var13 + 5;
                                        if (arg9 < var89 + var92) {
                                            var92 = arg9 - var89;
                                        }
                                        if (var14 + 5 > var91) {
                                            var91 = var14 + 5;
                                        }
                                        if (arg7 < var86 + var91) {
                                            var91 = arg7 - var86;
                                        }
                                        class168.method1046(var91, var92, var86, var89, 16777120);
                                        class168.method1041(var91, var92, var86, var89, 0);
                                        int var93 = var92 + var88.field3071 + 2;
                                        class43 var94 = var11.field2596;
                                        class43 var95 = class193.method1229(var11, var94, 1000);
                                        while (var95.method248((byte) 60) > 0) {
                                            int var96 = var95.method261((byte) -127, client.field552);
                                            class43 var97;
                                            if (var96 == -1) {
                                                var97 = var95;
                                                var95 = class110.field2127;
                                            } else {
                                                var97 = var95.method241((byte) 75, 0, var96);
                                                var95 = var95.method238(24, var96 + 4);
                                            }
                                            var88.method954(var97, var91 + 3, var93, 0, -1);
                                            var93 += var88.field3071 + 1;
                                        }
                                    }
                                    if (var11.field2690 == 9) {
                                        if (var11.field2677 == 1) {
                                            class168.method1045(var14, var13, var11.field2656 + var14, var11.field2662 + var13, var11.field2655);
                                        } else {
                                            int var101 = var11.field2656 < 0 ? -var11.field2656 : var11.field2656;
                                            int var102 = var11.field2662 >= 0 ? var11.field2662 : -var11.field2662;
                                            int var103 = var101;
                                            if (var101 < var102) {
                                                var103 = var102;
                                            }
                                            if (var103 != 0) {
                                                int var104 = (var11.field2662 << 16) / var103;
                                                int var105 = (var11.field2656 << 16) / var103;
                                                if (var105 < var104) {
                                                    var104 = -var104;
                                                } else {
                                                    var105 = -var105;
                                                }
                                                int var106 = var11.field2677 * var105 + 1 >> 17;
                                                int var107 = var11.field2677 * var104 >> 17;
                                                int var108 = var11.field2677 * var104 + 1 >> 17;
                                                int var109 = var11.field2677 * var105 >> 17;
                                                int var110 = var14 - arg1;
                                                int var111 = var110 - var108;
                                                int var112 = var11.field2656 + var110 + var107;
                                                int var113 = var107 + var110;
                                                int var114 = var13 - arg6;
                                                int var115 = var109 + var114;
                                                int var116 = var11.field2656 + var110 - var108;
                                                int var117 = var11.field2662 + var114 - var106;
                                                int var118 = var11.field2662 + var114 + var109;
                                                class135.method875(var113, var111, var116);
                                                int var119 = var114 - var106;
                                                class135.method874(var115, var119, var117, var113, var111, var116, var11.field2655);
                                                class135.method875(var113, var116, var112);
                                                class135.method874(var115, var117, var118, var113, var116, var112, var11.field2655);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static final void method295(int arg0) {
        if (arg0 != -5) {
            field950 = null;
        }
        field957++;
        while (true) {
            class118 var1 = class112.field2145;
            class201 var2;
            synchronized (class112.field2145) {
                var2 = (class201) class52.field1060.method757(false);
            }
            if (var2 == null) {
                return;
            }
            var2.field3946.method493(var2.field3949, (int) var2.field1353, var2.field3953, false, (byte) 89);
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V")
    public static void method296(int arg0) {
        field954 = null;
        field959 = null;
        field948 = null;
        field956 = null;
        if (arg0 == 255) {
            field953 = null;
            field947 = null;
            field950 = null;
        }
    }
}
