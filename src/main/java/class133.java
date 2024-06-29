import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class133 {

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "[Z")
    public static boolean[] field2813 = new boolean[8];

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "Lea;")
    public static class38 field2816 = class9.method46((byte) 106, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "Lob;")
    public static class127 field2815;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V")
    public static void method976(boolean arg0) {
        field2813 = null;
        if (arg0) {
            field2815 = null;
        }
        field2815 = null;
        field2816 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II[Lef;IIIIIII)V")
    public static final void method977(int arg0, int arg1, class43[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2818++;
        class71.method569(arg5, arg3, arg8, arg4);
        class93.method788();
        int var10 = 0;
        if (arg6 != -26787) {
            method977(-23, -37, null, 16, -5, 35, -94, 118, -100, -101);
        }
        while (arg2.length > var10) {
            class43 var11 = arg2[var10];
            if (var11 != null && (var11.field1005 == arg9 || arg9 == -1412584499 && class45.field1094 == var11)) {
                int var12;
                if (arg1 == -1) {
                    class166.field3434[class205.field4035] = var11.field940 + arg0;
                    class113.field2526[class205.field4035] = var11.field1026 + arg7;
                    class28.field552[class205.field4035] = var11.field1052;
                    class176.field3559[class205.field4035] = var11.field964;
                    var12 = class205.field4035++;
                } else {
                    var12 = arg1;
                }
                var11.field954 = class45.field1098;
                var11.field1069 = var12;
                if (!var11.field985 || !class156.method1085(0, var11)) {
                    label759: {
                        if (var11.field987 > 0) {
                            class117.method902(var11, arg6 ^ 0xFFFF9757);
                        }
                        int var13 = var11.field940 + arg0;
                        int var14 = var11.field931;
                        int var15 = var11.field1026 + arg7;
                        if (class45.field1094 == var11) {
                            if (arg9 != -1412584499 && !var11.field983) {
                                class86.field2007 = arg7;
                                class183.field3656 = arg2;
                                class12.field276 = arg0;
                                break label759;
                            }
                            if (!var11.field983) {
                                var14 = 128;
                            }
                            if (class205.field4029 && class86.field2011) {
                                int var16 = class176.field3568;
                                int var17 = var16 - class102.field2300;
                                if (class144.field3006 > var17) {
                                    var17 = class144.field3006;
                                }
                                int var18 = class10.field222;
                                if (var11.field1052 + var17 > class144.field3006 + class179.field3625.field1052) {
                                    var17 = class144.field3006 + class179.field3625.field1052 - var11.field1052;
                                }
                                var13 = var17;
                                int var19 = var18 - class99.field2217;
                                if (class145.field3032 > var19) {
                                    var19 = class145.field3032;
                                }
                                if (var11.field964 + var19 > class145.field3032 + class179.field3625.field964) {
                                    var19 = class145.field3032 + class179.field3625.field964 - var11.field964;
                                }
                                var15 = var19;
                            }
                        }
                        int var24;
                        int var25;
                        int var28;
                        int var29;
                        if (var11.field965 == 2) {
                            var25 = arg8;
                            var24 = arg5;
                            var29 = arg3;
                            var28 = arg4;
                        } else if (var11.field965 == 9) {
                            int var20 = var13;
                            int var21 = var15;
                            int var22 = var11.field1052 + var13;
                            if (var13 > var22) {
                                var20 = var22;
                                var22 = var13;
                            }
                            var24 = var20 <= arg5 ? arg5 : var20;
                            var22++;
                            var25 = var22 >= arg8 ? arg8 : var22;
                            int var26 = var11.field964 + var15;
                            if (var26 < var15) {
                                var21 = var26;
                                var26 = var15;
                            }
                            var26++;
                            var28 = arg4 > var26 ? var26 : arg4;
                            var29 = var21 > arg3 ? var21 : arg3;
                        } else {
                            var24 = var13 <= arg5 ? arg5 : var13;
                            var29 = var15 > arg3 ? var15 : arg3;
                            int var30 = var13 + var11.field1052;
                            var25 = arg8 > var30 ? var30 : arg8;
                            int var31 = var11.field964 + var15;
                            var28 = arg4 <= var31 ? arg4 : var31;
                        }
                        if (!var11.field985 || var25 > var24 && var29 < var28) {
                            label766: {
                                if (var11.field987 != 0) {
                                    if (var11.field987 == 1337) {
                                        class196.field3857 = var13;
                                        class146.field3052 = var15;
                                        class119.method915(var11.field964, arg6 ^ 0xFFFF8607, var11.field1052, var15, var13);
                                        class71.method569(arg5, arg3, arg8, arg4);
                                        break label766;
                                    }
                                    if (var11.field987 == 1338) {
                                        class179.method1230(var12, var15, var13, 6853);
                                        class71.method569(arg5, arg3, arg8, arg4);
                                        break label766;
                                    }
                                }
                                int var32 = class176.field3568;
                                int var33 = class10.field222;
                                if (!class169.field3482 && var24 <= var32 && var33 >= var29 && var32 < var25 && var28 > var33) {
                                    class103.method843(var11, false, var32 - var13, var33 - var15);
                                }
                                if (var11.field965 == 0) {
                                    if (!var11.field985 && class156.method1085(0, var11) && class111.field2489 != var11) {
                                        break label766;
                                    }
                                    if (!var11.field985) {
                                        if (var11.field1043 > var11.field959 - var11.field964) {
                                            var11.field1043 = var11.field959 - var11.field964;
                                        }
                                        if (var11.field1043 < 0) {
                                            var11.field1043 = 0;
                                        }
                                    }
                                    method977(var13 - var11.field982, var12, arg2, var29, var28, var24, -26787, var15 - var11.field1043, var25, var11.field1013);
                                    if (var11.field1061 != null) {
                                        method977(var13 - var11.field982, var12, var11.field1061, var29, var28, var24, -26787, var15 - var11.field1043, var25, var11.field1013);
                                    }
                                    class42 var34 = (class42) class177.field3580.method183((byte) 28, (long) var11.field1013);
                                    if (var34 != null) {
                                        if (var34.field919 == 0 && class176.field3568 >= var24 && class10.field222 >= var29 && class176.field3568 < var25 && class10.field222 < var28 && !class169.field3482 && !class37.field783) {
                                            class94.field2121 = 1;
                                            class98.field2186[0] = class148.field3070;
                                            class132.field2810[0] = 1004;
                                            class205.field4031[0] = class70.field1731;
                                        }
                                        class195.method1293(var13, var34.field921, var25, var29, (byte) 111, var15, var12, var28, var24);
                                    }
                                    class71.method569(arg5, arg3, arg8, arg4);
                                    class93.method788();
                                }
                                if (class194.field3830[var12] || class143.field2980 > 1) {
                                    if (var11.field965 == 0 && !var11.field985 && var11.field959 > var11.field964) {
                                        class34.method229(var11.field1043, var11.field1052 + var13, var11.field959, var15, var11.field964, true);
                                    }
                                    if (var11.field965 != 1) {
                                        if (var11.field965 == 2) {
                                            int var35 = 0;
                                            for (int var36 = 0; var36 < var11.field964; var36++) {
                                                for (int var37 = 0; var37 < var11.field1052; var37++) {
                                                    int var38 = (var11.field1034 + 32) * var37 + var13;
                                                    int var39 = var15 + (var11.field1037 + 32) * var36;
                                                    if (var35 < 20) {
                                                        var39 += var11.field1035[var35];
                                                        var38 += var11.field1059[var35];
                                                    }
                                                    if (var11.field967[var35] > 0) {
                                                        boolean var41 = false;
                                                        int var42 = var11.field967[var35] - 1;
                                                        boolean var43 = false;
                                                        if (arg5 < var38 + 32 && arg8 > var38 && arg3 < var39 + 32 && arg4 > var39 || class203.field4007 == var11 && class51.field1325 == var35) {
                                                            class89 var44;
                                                            if (class114.field2529 == 1 && class22.field469 == var35 && class136.field2861 == var11.field1013) {
                                                                var44 = class144.method1036(var42, 2, false, false, var11.field1033[var35], 0);
                                                            } else {
                                                                var44 = class144.method1036(var42, 1, false, false, var11.field1033[var35], 3153952);
                                                            }
                                                            if (var44 == null) {
                                                                class172.method1209(var11, arg6 ^ 0x68A2);
                                                            } else if (class203.field4007 == var11 && class51.field1325 == var35) {
                                                                int var45 = class176.field3568 - class66.field1574;
                                                                if (var45 < 5 && var45 > -5) {
                                                                    var45 = 0;
                                                                }
                                                                int var46 = class10.field222 - class140.field2942;
                                                                if (var46 < 5 && var46 > -5) {
                                                                    var46 = 0;
                                                                }
                                                                if (class185.field3695 < 5) {
                                                                    var46 = 0;
                                                                    var45 = 0;
                                                                }
                                                                var44.method736(var38 + var45, var39 + var46, 128);
                                                                if (arg9 != -1) {
                                                                    class43 var47 = arg2[arg9 & 0xFFFF];
                                                                    int var48 = class71.field1757;
                                                                    int var49 = class71.field1756;
                                                                    if (var39 + var46 < var49 && var47.field1043 > 0) {
                                                                        int var50 = (var49 - var39 - var46) * class205.field4027 / 3;
                                                                        if (class205.field4027 * 10 < var50) {
                                                                            var50 = class205.field4027 * 10;
                                                                        }
                                                                        if (var47.field1043 < var50) {
                                                                            var50 = var47.field1043;
                                                                        }
                                                                        class140.field2942 += var50;
                                                                        var47.field1043 -= var50;
                                                                        class172.method1209(var47, -1);
                                                                    }
                                                                    if (var39 + var46 + 32 > var48 && var47.field1043 < var47.field959 - var47.field964) {
                                                                        int var51 = (var39 + var46 + 32 - var48) * class205.field4027 / 3;
                                                                        if (class205.field4027 * 10 < var51) {
                                                                            var51 = class205.field4027 * 10;
                                                                        }
                                                                        if (var47.field959 - var47.field964 - var47.field1043 < var51) {
                                                                            var51 = var47.field959 - var47.field964 - var47.field1043;
                                                                        }
                                                                        var47.field1043 += var51;
                                                                        class140.field2942 -= var51;
                                                                        class172.method1209(var47, -1);
                                                                    }
                                                                }
                                                            } else if (class143.field2984 == var11 && class6.field154 == var35) {
                                                                var44.method736(var38, var39, 128);
                                                            } else {
                                                                var44.method755(var38, var39);
                                                            }
                                                        }
                                                    } else if (var11.field953 != null && var35 < 20) {
                                                        class89 var40 = var11.method320(var35, (byte) -107);
                                                        if (var40 != null) {
                                                            var40.method755(var38, var39);
                                                        } else if (class68.field1715) {
                                                            class172.method1209(var11, -1);
                                                        }
                                                    }
                                                    var35++;
                                                }
                                            }
                                        } else if (var11.field965 == 3) {
                                            int var52;
                                            if (class7.method40(var11, 4)) {
                                                var52 = var11.field1015;
                                                if (class111.field2489 == var11 && var11.field1028 != 0) {
                                                    var52 = var11.field1028;
                                                }
                                            } else {
                                                var52 = var11.field1053;
                                                if (class111.field2489 == var11 && var11.field1007 != 0) {
                                                    var52 = var11.field1007;
                                                }
                                            }
                                            if (var14 == 0) {
                                                if (var11.field932) {
                                                    class71.method558(var13, var15, var11.field1052, var11.field964, var52);
                                                } else {
                                                    class71.method575(var13, var15, var11.field1052, var11.field964, var52);
                                                }
                                            } else if (var11.field932) {
                                                class71.method566(var13, var15, var11.field1052, var11.field964, var52, 256 - (var14 & 0xFF));
                                            } else {
                                                class71.method568(var13, var15, var11.field1052, var11.field964, var52, 256 - (var14 & 0xFF));
                                            }
                                        } else if (var11.field965 == 4) {
                                            class107 var53 = var11.method322(arg6 ^ 0x68DF);
                                            if (var53 != null) {
                                                class38 var54 = var11.field1022;
                                                int var55;
                                                if (class7.method40(var11, 4)) {
                                                    var55 = var11.field1015;
                                                    if (class111.field2489 == var11 && var11.field1028 != 0) {
                                                        var55 = var11.field1028;
                                                    }
                                                    if (var11.field988.method276((byte) 38) > 0) {
                                                        var54 = var11.field988;
                                                    }
                                                } else {
                                                    var55 = var11.field1053;
                                                    if (class111.field2489 == var11 && var11.field1007 != 0) {
                                                        var55 = var11.field1007;
                                                    }
                                                }
                                                if (var11.field985 && var11.field978 != -1) {
                                                    class2 var56 = class117.method908(var11.field978, (byte) 100);
                                                    var54 = var56.field38;
                                                    if (var54 == null) {
                                                        var54 = class109.field2457;
                                                    }
                                                    if ((var56.field73 == 1 || var11.field979 != 1) && var11.field979 != -1) {
                                                        var54 = class163.method1168(125, new class38[] { class4.field133, var54, class148.field3073, class28.method174(var11.field979, 3) });
                                                    }
                                                }
                                                if (class185.field3689 == var11) {
                                                    var55 = var11.field1053;
                                                    var54 = class30.field589;
                                                }
                                                if (!var11.field985) {
                                                    var54 = class158.method1142((byte) -88, var11, var54);
                                                }
                                                var53.method658(var54, var13, var15, var11.field1052, var11.field964, var55, var11.field1014 ? 0 : -1, var11.field1017, var11.field990, var11.field1031);
                                            } else if (class68.field1715) {
                                                class172.method1209(var11, -1);
                                            }
                                        } else if (var11.field965 == 5) {
                                            if (var11.field985) {
                                                class89 var57;
                                                if (var11.field978 == -1) {
                                                    var57 = var11.method316(false, 6021);
                                                } else {
                                                    var57 = class144.method1036(var11.field978, var11.field1060, false, false, var11.field979, var11.field946);
                                                }
                                                if (var57 != null) {
                                                    int var58 = var57.field2047;
                                                    int var59 = var57.field2046;
                                                    if (var11.field947) {
                                                        class71.method572(var13, var15, var11.field1052 + var13, var11.field964 + var15);
                                                        int var60 = (var11.field964 + var59 - 1) / var59;
                                                        int var61 = (var58 + var11.field1052 - 1) / var58;
                                                        int var62 = 0;
                                                        while (true) {
                                                            if (var61 <= var62) {
                                                                class71.method569(arg5, arg3, arg8, arg4);
                                                                break;
                                                            }
                                                            for (int var63 = 0; var63 < var60; var63++) {
                                                                if (var11.field1009 != 0) {
                                                                    var57.method748(var58 / 2 + var58 * var62 + var13, var59 / 2 + var59 * var63 + var15, var11.field1009, 4096);
                                                                } else if (var14 == 0) {
                                                                    var57.method755(var58 * var62 + var13, var59 * var63 + var15);
                                                                } else {
                                                                    var57.method736(var13 + var58 * var62, var15 - -(var59 * var63), 256 - (var14 & 0xFF));
                                                                }
                                                            }
                                                            var62++;
                                                        }
                                                    } else {
                                                        int var64 = var11.field1052 * 4096 / var58;
                                                        if (var11.field1009 != 0) {
                                                            var57.method748(var13 + var11.field1052 / 2, var11.field964 / 2 + var15, var11.field1009, var64);
                                                        } else if (var14 != 0) {
                                                            var57.method738(var13, var15, var11.field1052, var11.field964, 256 - (var14 & 0xFF));
                                                        } else if (var11.field1052 == var58 && var11.field964 == var59) {
                                                            var57.method755(var13, var15);
                                                        } else {
                                                            var57.method740(var13, var15, var11.field1052, var11.field964);
                                                        }
                                                    }
                                                } else if (class68.field1715) {
                                                    class172.method1209(var11, -1);
                                                }
                                            } else {
                                                class89 var65 = var11.method316(class7.method40(var11, 4), 6021);
                                                if (var65 != null) {
                                                    var65.method755(var13, var15);
                                                } else if (class68.field1715) {
                                                    class172.method1209(var11, arg6 ^ 0x68A2);
                                                }
                                            }
                                        } else if (var11.field965 == 6) {
                                            int var66 = 0;
                                            boolean var67 = class7.method40(var11, 4);
                                            class159 var68 = null;
                                            int var69;
                                            if (var67) {
                                                var69 = var11.field1030;
                                            } else {
                                                var69 = var11.field1001;
                                            }
                                            if (var11.field978 != -1) {
                                                class2 var70 = class117.method908(var11.field978, (byte) 84);
                                                if (var70 != null) {
                                                    class2 var71 = var70.method13(var11.field979, -78);
                                                    var68 = var71.method11((byte) -114, 1);
                                                    if (var68 == null) {
                                                        class172.method1209(var11, -1);
                                                    } else {
                                                        var68.method1151();
                                                        var66 = var68.field1328 / 2;
                                                    }
                                                }
                                            } else if (var11.field1019 == 5) {
                                                if (var11.field980 == 0) {
                                                    var68 = class138.field2883.method587(null, -1, -256, -1, null);
                                                } else {
                                                    var68 = class195.field3842.method220(true);
                                                }
                                            } else if (var69 == -1) {
                                                var68 = var11.method312(arg6 + 26908, -1, null, var67, class195.field3842.field3014);
                                                if (var68 == null && class68.field1715) {
                                                    class172.method1209(var11, -1);
                                                }
                                            } else {
                                                class140 var72 = class139.method997(arg6 + 26910, var69);
                                                var68 = var11.method312(124, var11.field1054, var72, var67, class195.field3842.field3014);
                                                if (var68 == null && class68.field1715) {
                                                    class172.method1209(var11, -1);
                                                }
                                            }
                                            if (var68 != null) {
                                                class93.method782(var11.field1052 / 2 + var11.field991 + var13, var11.field964 / 2 + var11.field1042 + var15);
                                                int var73 = class93.field2091[var11.field930] * var11.field998 >> 16;
                                                int var74 = class93.field2110[var11.field930] * var11.field998 >> 16;
                                                if (!var11.field985) {
                                                    var68.method353(0, var11.field1016, 0, var11.field930, 0, var73, var74);
                                                } else if (var11.field975) {
                                                    var68.method343(0, var11.field1016, var11.field970, var11.field930, var11.field1006, var73 + var66 + var11.field1021, var11.field1021 + var74, var11.field998);
                                                } else {
                                                    var68.method353(0, var11.field1016, var11.field970, var11.field930, var11.field1006, var66 + var73 + var11.field1021, var74 - -var11.field1021);
                                                }
                                                class93.method773();
                                            }
                                        } else {
                                            label748: {
                                                if (var11.field965 == 7) {
                                                    class107 var75 = var11.method322(arg6 ^ 0x68EC);
                                                    if (var75 == null) {
                                                        if (class68.field1715) {
                                                            class172.method1209(var11, -1);
                                                        }
                                                        break label748;
                                                    }
                                                    int var76 = 0;
                                                    for (int var77 = 0; var77 < var11.field964; var77++) {
                                                        for (int var78 = 0; var78 < var11.field1052; var78++) {
                                                            if (var11.field967[var76] > 0) {
                                                                class2 var79 = class117.method908(var11.field967[var76] - 1, (byte) 108);
                                                                class38 var80;
                                                                if (var79.field73 != 1 && var11.field1033[var76] == 1) {
                                                                    var80 = class163.method1168(4, new class38[] { class4.field133, var79.field38, class139.field2897 });
                                                                } else {
                                                                    var80 = class163.method1168(110, new class38[] { class4.field133, var79.field38, class148.field3073, class28.method174(var11.field1033[var76], 3) });
                                                                }
                                                                int var81 = (var11.field1034 + 115) * var78 + var13;
                                                                int var82 = (var11.field1037 + 12) * var77 + var15;
                                                                if (var11.field1017 == 0) {
                                                                    var75.method646(var80, var81, var82, var11.field1053, var11.field1014 ? 0 : -1);
                                                                } else if (var11.field1017 == 1) {
                                                                    var75.method645(var80, var11.field1052 / 2 + var81, var82, var11.field1053, var11.field1014 ? 0 : -1);
                                                                } else {
                                                                    var75.method642(var80, var11.field1052 + var81 - 1, var82, var11.field1053, var11.field1014 ? 0 : -1);
                                                                }
                                                            }
                                                            var76++;
                                                        }
                                                    }
                                                }
                                                if (var11.field965 == 8 && class50.field1251 == var11 && class16.field339 == class155.field3233) {
                                                    int var83 = 0;
                                                    class107 var84 = class41.field914;
                                                    class38 var85 = var11.field1022;
                                                    class38 var86 = class158.method1142((byte) -80, var11, var85);
                                                    int var87 = 0;
                                                    while (var86.method276((byte) 38) > 0) {
                                                        int var95 = var86.method260(-122, class90.field2065);
                                                        class38 var96;
                                                        if (var95 == -1) {
                                                            var96 = var86;
                                                            var86 = class70.field1731;
                                                        } else {
                                                            var96 = var86.method273(0, 0, var95);
                                                            var86 = var86.method262(var95 + 4, arg6 + 26786);
                                                        }
                                                        int var97 = var84.method656(var96);
                                                        if (var97 > var83) {
                                                            var83 = var97;
                                                        }
                                                        var87 += var84.field1870 + 1;
                                                    }
                                                    int var88 = var15 + var11.field964 + 5;
                                                    var87 += 7;
                                                    if (var87 + var88 > arg4) {
                                                        var88 = arg4 - var87;
                                                    }
                                                    var83 += 6;
                                                    int var89 = var11.field1052 + var13 - var83 - 5;
                                                    if (var13 + 5 > var89) {
                                                        var89 = var13 + 5;
                                                    }
                                                    if (var83 + var89 > arg8) {
                                                        var89 = arg8 - var83;
                                                    }
                                                    class71.method558(var89, var88, var83, var87, 16777120);
                                                    class71.method575(var89, var88, var83, var87, 0);
                                                    class38 var90 = var11.field1022;
                                                    int var91 = var84.field1870 + var88 + 2;
                                                    class38 var92 = class158.method1142((byte) -46, var11, var90);
                                                    while (var92.method276((byte) 38) > 0) {
                                                        int var93 = var92.method260(106, class90.field2065);
                                                        class38 var94;
                                                        if (var93 == -1) {
                                                            var94 = var92;
                                                            var92 = class70.field1731;
                                                        } else {
                                                            var94 = var92.method273(0, 0, var93);
                                                            var92 = var92.method262(var93 + 4, arg6 ^ 0x68A2);
                                                        }
                                                        var84.method646(var94, var89 + 3, var91, 0, -1);
                                                        var91 += var84.field1870 + 1;
                                                    }
                                                }
                                                if (var11.field965 == 9) {
                                                    if (var11.field948 == 1) {
                                                        class71.method557(var13, var15, var11.field1052 + var13, var15 - -var11.field964, var11.field1053);
                                                    } else {
                                                        int var98 = var11.field1052 < 0 ? -var11.field1052 : var11.field1052;
                                                        int var99 = var98;
                                                        int var100 = var11.field964 >= 0 ? var11.field964 : -var11.field964;
                                                        if (var98 < var100) {
                                                            var99 = var100;
                                                        }
                                                        if (var99 != 0) {
                                                            int var101 = (var11.field964 << 16) / var99;
                                                            int var102 = var15 - arg3;
                                                            int var103 = (var11.field1052 << 16) / var99;
                                                            if (var103 >= var101) {
                                                                var103 = -var103;
                                                            } else {
                                                                var101 = -var101;
                                                            }
                                                            int var104 = var11.field948 * var103 + 1 >> 17;
                                                            int var105 = var13 - arg5;
                                                            int var106 = var11.field948 * var101 >> 17;
                                                            int var107 = var11.field948 * var103 >> 17;
                                                            int var108 = var105 + var106 + var11.field1052;
                                                            int var109 = var105 + var106;
                                                            int var110 = var11.field948 * var101 + 1 >> 17;
                                                            int var111 = var105 - var110;
                                                            int var112 = var102 + var107;
                                                            int var113 = var105 + var11.field1052 - var110;
                                                            int var114 = var102 - var104;
                                                            int var115 = var102 + var11.field964 - var104;
                                                            int var116 = var11.field964 + var107 + var102;
                                                            class93.method779(var109, var111, var113);
                                                            class93.method784(var112, var114, var115, var109, var111, var113, var11.field1053);
                                                            class93.method779(var109, var113, var108);
                                                            class93.method784(var112, var115, var116, var109, var113, var108, var11.field1053);
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
            }
            var10++;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public static final void method978(int arg0) {
        class163.field3397.field2834 = 0;
        class100.field2227 = 0;
        class125.field2677 = 0L;
        class169.field3479 = true;
        class183.field3664 = true;
        field2814++;
        class195.method1291(-101);
        class94.field2121 = 0;
        class120.field2594 = -1;
        class171.field3512 = 0;
        class109.field2456 = -1;
        class169.field3482 = false;
        class43.field1049 = 0;
        class140.field2925 = 0;
        class67.field1692 = 0;
        class202.field3990 = 0;
        class29.field579 = 0;
        client.field540 = 0;
        class10.field221 = 0;
        class45.field1099 = 0;
        class186.field3702 = 0;
        class111.field2494 = 0;
        class103.field2319 = 0;
        class66.field1634 = 0;
        class195.field3844 = 0;
        class16.field340 = 0;
        class152.field3154 = 0;
        class181.field3645 = 0;
        class152.field3155 = 0;
        class132.field2790 = 0;
        class58.field1460 = 0;
        class155.field3215 = 0;
        class125.field2686 = 0;
        class112.field2507 = 0;
        class2.field93 = 0;
        class166.field3436 = 0;
        class38.field830 = 0;
        class56.field1425 = 0;
        class188.field3739 = 0;
        class186.field3706 = 0;
        class200.field3943 = 0;
        class111.field2465 = 0;
        class22.field480 = 0;
        class177.field3582 = 0;
        class127.field2719 = 0;
        class30.field604 = 0;
        class180.field3640 = 0;
        class180.field3632 = 0;
        class37.field785 = 0;
        class83.field1953 = 0;
        class70.field1736 = 0;
        class38.field799 = 0;
        class187.field3712 = 0;
        class38.field823 = 0;
        class8.field185 = 0;
        class127.field2714 = 0;
        class16.field329 = 0;
        class96.field2160 = 0;
        class111.field2462 = 0;
        class202.field3992 = 0;
        class117.field2558 = 0;
        class51.field1299 = 0;
        class30.field606 = 0;
        class95.field2148 = 0;
        class67.field1682 = 0;
        class99.field2201 = 0;
        class35.field741 = 0;
        class127.field2718 = 0;
        class67.field1666 = 0;
        class137.field2876 = 0;
        class100.field2235 = 0;
        class65.field1553 = 0;
        class106.field2365 = 0;
        class39.field867 = 0;
        class38.field820 = 0;
        class141.field2960 = 0;
        class160.field3341 = 0;
        class38.field825 = 0;
        class39.field861 = 0;
        class32.field664 = 0;
        class12.field277 = 0;
        class140.field2922 = 0;
        class74.field1810 = 0;
        class39.field880 = 0;
        class165.field3407 = 0;
        class191.field3783 = 0;
        class45.field1115 = 0;
        class62.field1516 = 0;
        class22.field484 = 0;
        class38.field819 = 0;
        class156.field3240 = 0;
        class203.field3998 = 0;
        client.field547 = 0;
        class32.field658 = 0;
        class43.field995 = 0;
        class66.field1625 = 0;
        class34.field703 = 0;
        class32.field627 = 0;
        class70.field1735 = 0;
        client.field543 = 0;
        class155.field3231 = 0;
        class123.field2632 = 0;
        class67.field1660 = 0;
        class32.field637 = 0;
        class67.field1653 = 0;
        class2.field36 = 0;
        class111.field2484 = 0;
        class163.field3392 = 0;
        class38.field810 = 0;
        class66.field1619 = 0;
        class34.field702 = 0;
        class106.field2378 = 0;
        class67.field1688 = 0;
        class63.field1534 = 0;
        class188.field3742 = 0;
        class22.field483 = 0;
        class39.field870 = 0;
        class48.field1162 = 0;
        class18.field364 = 0;
        class162.field3374 = 0;
        class7.field165 = 0;
        class200.field3936 = 0;
        class122.field2608 = 0;
        class191.field3775 = 0;
        class37.field768 = 0;
        class150.field3096 = 0;
        class100.field2229 = 0;
        class139.field2900 = 0;
        class197.field3866 = 0;
        class146.field3037 = 0;
        class171.field3506 = 0;
        class92.field2090 = 0;
        class30.field591 = 0;
        class70.field1733 = 0;
        class10.field230 = 0;
        class66.field1623 = 0;
        class86.field1996 = 0;
        class106.field2357 = 0;
        class2.field66 = 0;
        class32.field650 = 0;
        class66.field1599 = 0;
        class4.field114 = 0;
        class14.field301 = 0;
        client.field538 = 0;
        class94.field2125 = 0;
        class84.field1981 = 0;
        class205.field4039 = 0;
        class178.field3599 = 0;
        class16.field330 = 0;
        class187.field3714 = 0;
        class87.field2012 = 0;
        class66.field1614 = 0;
        class38.field828 = 0;
        class67.field1679 = 0;
        class67.field1671 = 0;
        class2.field43 = 0;
        class165.field3410 = 0;
        class205.field4033 = 0;
        class167.field3443 = 0;
        class150.field3097 = 0;
        class127.field2733 = 0;
        class50.field1237 = 0;
        class162.field3373 = 0;
        class188.field3733 = 0;
        class73.field1777 = 0;
        class128.field2751 = 0;
        class170.field3486 = 0;
        class63.field1538 = 0;
        class51.field1322 = 0;
        class111.field2461 = 0;
        class67.field1641 = 0;
        class29.field572 = 0;
        class67.field1669 = 0;
        class98.field2190 = 0;
        class67.field1658 = 0;
        class70.field1746 = 0;
        class51.field1308 = 0;
        class54.field1368 = 0;
        class67.field1642 = 0;
        class196.field3859 = 0;
        class139.field2887 = 0;
        class204.field4024 = 0;
        class8.field190 = 0;
        class111.field2493 = 0;
        class51.field1323 = 0;
        class39.field865 = 0;
        class66.field1610 = 0;
        class32.field661 = 0;
        class21.field462 = 0;
        class17.field349 = 0;
        class200.field3941 = 0;
        class17.field352 = 0;
        class51.field1304 = 0;
        class33.field669 = 0;
        class38.field796 = 0;
        class178.field3602 = 0;
        class39.field858 = 0;
        class54.field1372 = 0;
        class103.field2320 = 0;
        class33.field681 = 0;
        class38.field818 = 0;
        class7.field167 = 0;
        class66.field1615 = 0;
        class51.field1290 = 0;
        class39.field855 = 0;
        class14.field284 = 0;
        class144.field3026 = 0;
        class95.field2132 = 0;
        class54.field1381 = 0;
        class6.field153 = 0;
        class51.field1320 = 0;
        class14.field302 = 0;
        class14.field296 = 0;
        class66.field1602 = 0;
        class39.field844 = 0;
        class41.field904 = 0;
        class41.field901 = 0;
        class97.field2170 = 0;
        class57.field1439 = 0;
        class59.field1469 = 0;
        class67.field1661 = 0;
        class141.field2971 = 0;
        class34.field710 = 0;
        class56.field1422 = 0;
        class152.field3158 = 0;
        class16.field341 = 0;
        class35.field729 = 0;
        class188.field3747 = 0;
        class14.field295 = 0;
        class194.field3818 = 0;
        class38.field814 = 0;
        class50.field1242 = 0;
        class2.field12 = 0;
        class168.field3453 = 0;
        class35.field739 = 0;
        class108.field2416 = 0;
        class43.field956 = 0;
        class74.field1805 = 0;
        class8.field184 = 0;
        class132.field2787 = 0;
        class124.field2672 = 0;
        class90.field2054 = 0;
        class66.field1612 = 0;
        class38.field833 = 0;
        class139.field2896 = 0;
        class14.field291 = 0;
        class56.field1420 = 0;
        class38.field808 = 0;
        class161.field3355 = 0;
        class103.field2303 = 0;
        class167.field3444 = 0;
        class125.field2697 = 0;
        class197.field3900 = 0;
        class101.field2247 = 0;
        class39.field866 = 0;
        class136.field2860 = 0;
        class100.field2219 = 0;
        class74.field1791 = 0;
        class14.field287 = 0;
        class39.field845 = 0;
        class161.field3352 = 0;
        class80.field1898 = 0;
        class32.field644 = 0;
        class66.field1607 = 0;
        class22.field474 = 0;
        class185.field3685 = 0;
        class127.field2730 = 0;
        class97.field2177 = 0;
        class43.field972 = 0;
        class97.field2165 = 0;
        class70.field1732 = 0;
        class38.field789 = 0;
        class134.field2830 = 0;
        class5.field141 = 0;
        class87.field2025 = 0;
        class54.field1376 = 0;
        class67.field1701 = 0;
        class134.field2823 = 0;
        class192.field3798 = 0;
        class66.field1584 = 0;
        class101.field2250 = 0;
        class113.field2517 = 0;
        class67.field1672 = 0;
        class32.field649 = 0;
        class34.field698 = 0;
        class14.field288 = 0;
        class83.field1955 = 0;
        class67.field1667 = 0;
        class12.field255 = 0;
        class146.field3056 = 0;
        client.field534 = 0;
        class37.field769 = 0;
        client.field539 = 0;
        class100.field2240 = 0;
        class132.field2798 = 0;
        class66.field1570 = 0;
        class106.field2384 = 0;
        class39.field852 = 0;
        class67.field1649 = 0;
        class57.field1442 = 0;
        class103.field2310 = 0;
        class179.field3614 = 0;
        class194.field3813 = 0;
        class67.field1665 = 0;
        class32.field657 = 0;
        class55.field1404 = 0;
        class48.field1158 = 0;
        class66.field1622 = 0;
        class54.field1384 = 0;
        class132.field2800 = 0;
        class32.field633 = 0;
        class52.field1331 = 0;
        class183.field3661 = 0;
        class176.field3558 = 0;
        class66.field1617 = 0;
        class181.field3642 = 0;
        class143.field2982 = 0;
        class99.field2215 = 0;
        class32.field636 = 0;
        class67.field1664 = 0;
        client.field531 = 0;
        class66.field1568 = 0;
        class67.field1697 = 0;
        class188.field3731 = 0;
        class92.field2086 = 0;
        class168.field3448 = 0;
        class99.field2211 = 0;
        class99.field2212 = 0;
        class140.field2929 = 0;
        class111.field2469 = 0;
        class44.field1079 = 0;
        class166.field3427 = 0;
        class143.field2983 = 0;
        class83.field1954 = 0;
        class67.field1657 = 0;
        class143.field2976 = 0;
        class197.field3872 = 0;
        class165.field3408 = 0;
        class36.field756 = 0;
        class112.field2501 = 0;
        class166.field3438 = 0;
        class125.field2683 = 0;
        class58.field1453 = 0;
        class176.field3562 = 0;
        class161.field3363 = 0;
        class109.field2441 = 0;
        class117.field2553 = 0;
        class94.field2114 = 0;
        class59.field1482 = 0;
        class179.field3624 = 0;
        class172.field3522 = 0;
        field2818 = 0;
        class66.field1639 = 0;
        class7.field172 = 0;
        class84.field1986 = arg0;
        class52.field1335 = 0;
        class14.field299 = 0;
        class148.field3072 = 0;
        class66.field1592 = 0;
        class32.field654 = 0;
        class101.field2269 = 0;
        class38.field822 = 0;
        class163.field3378 = 0;
        class50.field1221 = 0;
        class19.field396 = 0;
        class39.field840 = 0;
        class38.field827 = 0;
        class139.field2888 = 0;
        class194.field3829 = 0;
        class28.field570 = 0;
        class17.field354 = 0;
        class202.field3983 = 0;
        class116.field2550 = 0;
        class57.field1441 = 0;
        class66.field1567 = 0;
        class57.field1438 = 0;
        class198.field3911 = 0;
        class141.field2962 = 0;
        class35.field734 = 0;
        class90.field2055 = 0;
        class200.field3945 = 0;
        class39.field839 = 0;
        class66.field1630 = 0;
        class25.field505 = 0;
        class48.field1163 = 0;
        class139.field2908 = 0;
        class126.field2706 = 0;
        class2.field61 = 0;
        class35.field726 = 0;
        class98.field2187 = 0;
        class160.field3343 = 0;
        class53.field1356 = 0;
        class66.field1585 = 0;
        class56.field1432 = 0;
        class162.field3372 = 0;
        class120.field2596 = 0;
        class171.field3503 = 0;
        class160.field3336 = 0;
        class36.field757 = 0;
        class38.field793 = 0;
        class151.field3111 = 0;
        class2.field28 = 0;
        class101.field2254 = 0;
        class46.field1137 = 0;
        class66.field1608 = 0;
        class185.field3668 = 0;
        class62.field1509 = 0;
        class192.field3793 = 0;
        class191.field3784 = 0;
        class70.field1751 = 0;
        class106.field2386 = 0;
        class132.field2801 = 0;
        class34.field699 = 0;
        class194.field3817 = 0;
        class34.field704 = 0;
        class163.field3388 = 0;
        class36.field751 = 0;
        class168.field3452 = 0;
        class100.field2244 = 0;
        class88.field2039 = 0;
        class38.field788 = 0;
        class155.field3226 = 0;
        class191.field3782 = 0;
        class123.field2628 = 0;
        class66.field1604 = 0;
        class103.field2306 = 0;
        class191.field3780 = 0;
        class178.field3597 = 0;
        class177.field3581 = 0;
        class50.field1225 = 0;
        class154.field3207 = 0;
        field2817 = 0;
        class29.field578 = 0;
        class127.field2729 = 0;
        class187.field3716 = 0;
        class53.field1352 = 0;
        class66.field1633 = 0;
        class192.field3797 = 0;
        class94.field2112 = 0;
        class170.field3485 = 0;
        class185.field3677 = 0;
        class151.field3114 = 0;
        class62.field1494 = 0;
        class87.field2015 = 0;
        class67.field1673 = 0;
        class205.field4045 = 0;
        class33.field671 = 0;
        class100.field2238 = 0;
        class140.field2926 = 0;
        class62.field1514 = 0;
        class194.field3814 = 0;
        class62.field1503 = 0;
        class195.field3839 = 0;
        class193.field3812 = 0;
        class38.field832 = 0;
        class141.field2966 = 0;
        class3.field101 = 0;
        class100.field2231 = 0;
        class187.field3709 = 0;
        class134.field2829 = 0;
        class37.field778 = 0;
        class39.field856 = 0;
        class66.field1605 = 0;
        class74.field1817 = 0;
        class188.field3741 = 0;
        class99.field2209 = 0;
        class203.field4003 = 0;
        class111.field2477 = 0;
        class80.field1897 = 0;
        class161.field3349 = 0;
        class140.field2923 = 0;
        class38.field801 = 0;
        class88.field2037 = 0;
        class4.field118 = 0;
        class59.field1479 = 0;
        class132.field2799 = 0;
        class136.field2862 = 0;
        class38.field806 = 0;
        class152.field3132 = 0;
        class2.field72 = 0;
        class53.field1358 = 0;
        class145.field3035 = 0;
        class87.field2022 = 0;
        class39.field864 = 0;
        class163.field3399 = 0;
        class21.field454 = 0;
        class103.field2304 = 0;
        class101.field2273 = 0;
        class37.field774 = 0;
        class45.field1093 = 0;
        class19.field384 = 0;
        class150.field3095 = 0;
        class130.field2779 = 0;
        class86.field2004 = 0;
        class192.field3795 = 0;
        class17.field351 = 0;
        class66.field1613 = 0;
        class38.field794 = 0;
        class66.field1637 = 0;
        class44.field1075 = 0;
        class191.field3788 = 0;
        class39.field863 = 0;
        class140.field2930 = 0;
        class109.field2451 = 0;
        class38.field824 = 0;
        class156.field3249 = 0;
        class155.field3219 = 0;
        class50.field1224 = 0;
        class38.field792 = 0;
        class75.field1826 = 0;
        class65.field1552 = 0;
        class67.field1656 = 0;
        class98.field2182 = 0;
        class177.field3591 = 0;
        class172.field3518 = 0;
        class62.field1502 = 0;
        class7.field171 = 0;
        class117.field2556 = 0;
        class154.field3203 = 0;
        class132.field2786 = 0;
        class62.field1496 = 0;
        class51.field1311 = 0;
        class17.field357 = 0;
        class50.field1227 = 0;
        class23.field494 = 0;
        class32.field648 = 0;
        class32.field660 = 0;
        class158.field3318 = 0;
        class87.field2028 = 0;
        class195.field3834 = 0;
        class119.field2574 = 0;
        class132.field2804 = 0;
        class188.field3735 = 0;
        class2.field80 = 0;
        class38.field835 = 0;
        class101.field2246 = 0;
        class127.field2722 = 0;
        class40.field890 = 0;
        class40.field891 = 0;
        class11.field248 = 0;
        class34.field708 = 0;
        class205.field4038 = 0;
        class37.field773 = 0;
        class38.field787 = 0;
        class22.field479 = 0;
        class124.field2665 = 0;
        class67.field1652 = 0;
        client.field537 = 0;
        class141.field2967 = 0;
        class34.field700 = 0;
        class66.field1591 = 0;
        class141.field2956 = 0;
        class43.field1048 = 0;
        class43.field984 = 0;
        class114.field2531 = 0;
        class194.field3824 = 0;
        class103.field2312 = 0;
        class120.field2592 = 0;
        class98.field2181 = 0;
        class136.field2851 = 0;
        class30.field594 = 0;
        class200.field3937 = 0;
        class42.field920 = 0;
        class67.field1648 = 0;
        class2.field7 = 0;
        class6.field152 = 0;
        class28.field557 = 0;
        class172.field3516 = 0;
        class17.field342 = 0;
        class196.field3855 = 0;
        class43.field1057 = 0;
        class163.field3389 = 0;
        class9.field193 = 0;
        class45.field1111 = 0;
        class96.field2155 = 0;
        class67.field1663 = 0;
        class116.field2545 = 0;
        class55.field1398 = 0;
        class111.field2471 = 0;
        class125.field2695 = 0;
        class62.field1517 = 0;
        class2.field52 = 0;
        class111.field2463 = 0;
        class198.field3905 = 0;
        class10.field229 = 0;
        class130.field2776 = 0;
        class119.field2585 = 0;
        class32.field656 = 0;
        class62.field1505 = 0;
        class43.field1003 = 0;
        class141.field2951 = 0;
        class12.field268 = 0;
        class22.field470 = 0;
        class102.field2301 = 0;
        class66.field1616 = 0;
        class22.field465 = 0;
        class191.field3771 = 0;
        class144.field2997 = 0;
        class198.field3915 = 0;
        class162.field3366 = 0;
        class66.field1601 = 0;
        class41.field895 = 0;
        class12.field251 = 0;
        class99.field2202 = 0;
        class181.field3644 = 0;
        class51.field1321 = 0;
        class38.field803 = 0;
        class29.field573 = 0;
        class167.field3442 = 0;
        class141.field2949 = 0;
        class66.field1621 = 0;
        class181.field3646 = 0;
        class38.field804 = 0;
        class66.field1594 = 0;
        class172.field3525 = 0;
        class33.field678 = 0;
        class148.field3076 = 0;
        class168.field3458 = 0;
        class4.field125 = 0;
        class67.field1685 = 0;
        class48.field1152 = 0;
        class59.field1471 = 0;
        class136.field2848 = 0;
        class167.field3440 = 0;
        class92.field2080 = 0;
        class158.field3319 = 0;
        class19.field412 = 0;
        class18.field369 = 0;
        class73.field1780 = 0;
        class144.field3015 = 0;
        class102.field2289 = 0;
        class96.field2158 = 0;
        class44.field1076 = 0;
        class39.field871 = 0;
        class55.field1406 = 0;
        class92.field2088 = 0;
        class203.field4011 = 0;
        class166.field3431 = 0;
        class99.field2206 = 0;
        class66.field1578 = 0;
        class66.field1575 = 0;
        class101.field2255 = 0;
        class55.field1397 = 0;
        class54.field1371 = 0;
        class165.field3416 = 0;
        class9.field205 = 0;
        class75.field1827 = 0;
        class28.field553 = 0;
        class57.field1437 = 0;
        class141.field2964 = 0;
        class38.field809 = 0;
        class39.field877 = 0;
        class30.field599 = 0;
        class144.field2992 = 0;
        class137.field2870 = 0;
        class101.field2260 = 0;
        class80.field1895 = 0;
        class109.field2452 = 0;
        class73.field1772 = 0;
        class163.field3393 = 0;
        class32.field634 = 0;
        class116.field2549 = 0;
        class3.field99 = 0;
        class66.field1618 = 0;
        class9.field216 = 0;
        class35.field725 = 0;
        class22.field482 = 0;
        class146.field3041 = 0;
        class43.field962 = 0;
        class155.field3212 = 0;
        class28.field558 = 0;
        class29.field577 = 0;
        class90.field2062 = 0;
        class73.field1789 = 0;
        class166.field3425 = 0;
        class75.field1822 = 0;
        class152.field3141 = 0;
        class155.field3214 = 0;
        class38.field805 = 0;
        class62.field1493 = 0;
        class165.field3405 = 0;
        class32.field643 = 0;
        class38.field817 = 0;
        class51.field1296 = 0;
        class191.field3773 = 0;
        class56.field1421 = 0;
        class23.field487 = 0;
        class196.field3861 = 0;
        class44.field1078 = 0;
        class67.field1662 = 0;
        class168.field3465 = 0;
        class155.field3216 = 0;
        class199.field3932 = 0;
        class32.field651 = 0;
        class53.field1354 = 0;
        class29.field574 = 0;
        class102.field2282 = 0;
        class45.field1097 = 0;
        class8.field188 = 0;
        class54.field1382 = 0;
        class124.field2660 = 0;
        class29.field583 = 0;
        class96.field2152 = 0;
        class125.field2694 = 0;
        class39.field872 = 0;
        class34.field714 = 0;
        class67.field1690 = 0;
        class97.field2166 = 0;
        class165.field3413 = 0;
        class51.field1307 = 0;
        class12.field254 = 0;
        class96.field2156 = 0;
        class40.field889 = 0;
        class140.field2911 = 0;
        class125.field2678 = 0;
        class66.field1629 = 0;
        class179.field3616 = 0;
        class148.field3075 = 0;
        class56.field1413 = 0;
        class39.field869 = 0;
        class50.field1238 = 0;
        class66.field1589 = 0;
        class5.field147 = 0;
        class88.field2035 = 0;
        class125.field2693 = 0;
        class97.field2176 = 0;
        class66.field1572 = 0;
        class32.field630 = 0;
        class53.field1355 = 0;
        class39.field860 = 0;
        class29.field582 = 0;
        class94.field2119 = 0;
        class4.field128 = 0;
        class122.field2618 = 0;
        class171.field3510 = 0;
        class118.field2564 = 0;
        class73.field1768 = 0;
        class191.field3787 = 0;
        class51.field1306 = 0;
        class23.field486 = 0;
        class38.field837 = 0;
        class37.field770 = 0;
        class57.field1440 = 0;
        class67.field1651 = 0;
        class30.field601 = 0;
        class90.field2063 = 0;
        class59.field1463 = 0;
        class169.field3470 = 0;
        class191.field3792 = 0;
        class156.field3245 = 0;
        class11.field241 = 0;
        class67.field1696 = 0;
        class58.field1455 = 0;
        class171.field3501 = 0;
        class11.field237 = 0;
        class127.field2713 = 0;
        class168.field3463 = 0;
        class140.field2937 = 0;
        class45.field1100 = 0;
        class198.field3909 = 0;
        class4.field126 = 0;
        class37.field780 = 0;
        class56.field1414 = 0;
        class32.field626 = 0;
        class17.field355 = 0;
        class101.field2266 = 0;
        class32.field662 = 0;
        class70.field1748 = 0;
        class38.field826 = 0;
        class51.field1309 = 0;
        class188.field3749 = 0;
        class106.field2391 = 0;
        class70.field1753 = 0;
        class54.field1367 = 0;
        class9.field201 = 0;
        class12.field257 = 0;
        class46.field1126 = 0;
        class39.field879 = 0;
        class140.field2939 = 0;
        class40.field883 = 0;
        class39.field853 = 0;
        class12.field265 = 0;
        class111.field2482 = 0;
        class95.field2146 = 0;
        class132.field2785 = 0;
        class32.field641 = 0;
        class5.field142 = 0;
        class94.field2123 = 0;
        class50.field1236 = 0;
        class144.field3005 = 0;
        class191.field3785 = 0;
        class195.field3831 = 0;
        class73.field1778 = 0;
        class55.field1399 = 0;
        class205.field4041 = 0;
        class150.field3092 = 0;
        class75.field1829 = 0;
        class22.field481 = 0;
        class37.field777 = 0;
        class39.field847 = 0;
        class36.field752 = 0;
        class172.field3529 = 0;
        class149.field3084 = 0;
        class54.field1379 = 0;
        class152.field3153 = 0;
        class2.field54 = 0;
        class62.field1497 = 0;
        class149.field3088 = 0;
        class106.field2372 = 0;
        class45.field1119 = 0;
        class87.field2023 = 0;
        class35.field728 = 0;
        class38.field807 = 0;
        class97.field2173 = 0;
        class125.field2691 = 0;
        class3.field105 = 0;
        class163.field3383 = 0;
        class105.field2339 = 0;
        class7.field180 = 0;
        class126.field2708 = 0;
        class66.field1631 = 0;
        class66.field1587 = 0;
        class117.field2557 = 0;
        class109.field2445 = 0;
        class106.field2404 = 0;
        class188.field3730 = 0;
        class43.field1023 = 0;
        class152.field3165 = 0;
        class6.field155 = 0;
        class144.field3001 = 0;
        class191.field3781 = 0;
        class44.field1071 = 0;
        class39.field849 = 0;
        class28.field563 = 0;
        class66.field1628 = 0;
        class139.field2903 = 0;
        class94.field2120 = 0;
        class53.field1350 = 0;
        class111.field2495 = 0;
        class141.field2947 = 0;
        class111.field2480 = 0;
        class122.field2609 = 0;
        class126.field2703 = 0;
        class38.field829 = 0;
        class95.field2147 = 0;
        class132.field2803 = 0;
        class200.field3938 = 0;
        class122.field2606 = 0;
        class73.field1790 = 0;
        class99.field2198 = 0;
        class125.field2676 = 0;
        class188.field3728 = 0;
        class39.field843 = 0;
        class163.field3385 = 0;
        class38.field836 = 0;
        class63.field1530 = 0;
        class28.field560 = 0;
        class46.field1127 = 0;
        class176.field3569 = 0;
        class28.field565 = 0;
        class139.field2904 = 0;
        class141.field2963 = 0;
        class66.field1611 = 0;
        class197.field3869 = 0;
        class170.field3487 = 0;
        class203.field4010 = 0;
        class195.field3837 = 0;
        class40.field888 = 0;
        class136.field2855 = 0;
        class87.field2020 = 0;
        class54.field1385 = 0;
        class2.field3 = 0;
        class126.field2709 = 0;
        class16.field333 = 0;
        class139.field2893 = 0;
        class66.field1635 = 0;
        class113.field2520 = 0;
        class127.field2710 = 0;
        class9.field195 = 0;
        class30.field598 = 0;
        class46.field1128 = 0;
        class155.field3225 = 0;
        class14.field286 = 0;
        class109.field2444 = 0;
        class113.field2519 = 0;
        class84.field1985 = 0;
        class34.field711 = 0;
        class191.field3770 = 0;
        class34.field715 = 0;
        class54.field1387 = 0;
        class179.field3626 = 0;
        class28.field556 = 0;
        class177.field3579 = 0;
        class88.field2034 = 0;
        class58.field1456 = 0;
        class38.field813 = 0;
        class54.field1369 = 0;
        class25.field507 = 0;
        class172.field3517 = 0;
        class66.field1573 = 0;
        class32.field655 = 0;
        class54.field1373 = 0;
        class7.field168 = 0;
        class65.field1549 = 0;
        class119.field2586 = 0;
        class66.field1581 = 0;
        class152.field3160 = 0;
        class83.field1971 = 0;
        class40.field882 = 0;
        class180.field3637 = 0;
        class169.field3473 = 0;
        class118.field2566 = 0;
        class151.field3110 = 0;
        class151.field3123 = 0;
        class58.field1461 = 0;
        class158.field3313 = 0;
        class67.field1650 = 0;
        class66.field1576 = 0;
        class150.field3093 = 0;
        class141.field2968 = 0;
        class97.field2171 = 0;
        class156.field3236 = 0;
        class39.field848 = 0;
        class21.field459 = 0;
        class106.field2383 = 0;
        class84.field1982 = 0;
        class183.field3660 = 0;
        class171.field3505 = 0;
        class2.field5 = 0;
        class177.field3583 = 0;
        class62.field1507 = 0;
        class45.field1116 = 0;
        class140.field2921 = 0;
        class7.field164 = 0;
        class166.field3437 = 0;
        class139.field2906 = 0;
        class168.field3455 = 0;
        class67.field1646 = 0;
        class37.field767 = 0;
        class48.field1170 = 0;
        class54.field1375 = 0;
        class7.field169 = 0;
        class132.field2794 = 0;
        class134.field2820 = 0;
        class187.field3713 = 0;
        class90.field2067 = 0;
        class135.field2840 = 0;
        class54.field1366 = 0;
        class66.field1577 = 0;
        client.field546 = 0;
        class151.field3121 = 0;
        class18.field363 = 0;
        class34.field705 = 0;
        class83.field1969 = 0;
        class90.field2060 = 0;
        class51.field1324 = 0;
        class84.field1977 = 0;
        class187.field3710 = 0;
        class51.field1318 = 0;
        class171.field3499 = 0;
        class99.field2208 = 0;
        class50.field1229 = 0;
        class51.field1298 = 0;
        class67.field1703 = 0;
        class98.field2188 = 0;
        class28.field562 = 0;
        class12.field275 = 0;
        class52.field1330 = 0;
        class25.field510 = 0;
        class122.field2623 = 0;
        class62.field1506 = 0;
        class162.field3375 = 0;
        class84.field1980 = 0;
        class94.field2115 = 0;
        class191.field3779 = 0;
        class5.field143 = 0;
        class66.field1598 = 0;
        class84.field1978 = 0;
        class179.field3621 = 0;
        class122.field2619 = 0;
        class179.field3619 = 0;
        class7.field174 = 0;
        class41.field902 = 0;
        class56.field1427 = 0;
        class62.field1515 = 0;
        class135.field2844 = 0;
        class160.field3340 = 0;
        class181.field3641 = 0;
        class39.field878 = 0;
        class32.field635 = 0;
        class194.field3821 = 0;
        class96.field2159 = 0;
        class128.field2746 = 0;
        class80.field1894 = 0;
        class55.field1395 = 0;
        class22.field477 = 0;
        class199.field3934 = 0;
        class58.field1452 = 0;
        class66.field1600 = 0;
        class41.field905 = 0;
        class50.field1233 = 0;
        class88.field2036 = 0;
        class152.field3127 = 0;
        class181.field3643 = 0;
        class34.field701 = 0;
        class73.field1782 = 0;
        class156.field3256 = 0;
        class144.field2999 = 0;
        class116.field2547 = 0;
        class62.field1495 = 0;
        client.field544 = 0;
        class187.field3715 = 0;
        class152.field3156 = 0;
        class197.field3897 = 0;
        class102.field2292 = 0;
        class67.field1702 = 0;
        class117.field2560 = 0;
        class52.field1332 = 0;
        client.field532 = 0;
        class12.field262 = 0;
        class108.field2429 = 0;
        class19.field435 = 0;
        class102.field2284 = 0;
        class191.field3776 = 0;
        class119.field2583 = 0;
        class22.field476 = 0;
        class66.field1632 = 0;
        field2814 = 0;
        class66.field1595 = 0;
        class124.field2658 = 0;
        class32.field631 = 0;
        class32.field638 = 0;
        class188.field3752 = 0;
        class106.field2382 = 0;
        class136.field2847 = 0;
        class113.field2516 = 0;
        class66.field1626 = 0;
        class43.field999 = 0;
        class16.field338 = 0;
        class66.field1580 = 0;
        class10.field223 = 0;
        class22.field478 = 0;
        class162.field3368 = 0;
        class17.field356 = 0;
        class44.field1073 = 0;
        class188.field3734 = 0;
        class7.field163 = 0;
        class151.field3116 = 0;
        class203.field4009 = 0;
        class66.field1638 = 0;
        class39.field857 = 0;
        class66.field1582 = 0;
        class28.field564 = 0;
        client.field545 = 0;
        class21.field458 = 0;
        class171.field3495 = 0;
        class38.field815 = 0;
        class119.field2576 = 0;
        class19.field411 = 0;
        class156.field3238 = 0;
        class38.field800 = 0;
        class73.field1786 = 0;
        class11.field242 = 0;
        class83.field1963 = 0;
        class34.field718 = 0;
        class155.field3222 = 0;
        class43.field1070 = 0;
        class38.field795 = 0;
        class73.field1775 = 0;
        class96.field2149 = 0;
        class205.field4043 = 0;
        class151.field3120 = 0;
        class67.field1640 = 0;
        class185.field3690 = 0;
        class141.field2952 = 0;
        class141.field2957 = 0;
        class127.field2723 = 0;
        class113.field2525 = 0;
        class136.field2854 = 0;
        class67.field1678 = 0;
        class94.field2124 = 0;
        class138.field2885 = 0;
        class66.field1593 = 0;
        class119.field2580 = 0;
        class152.field3163 = 0;
        class41.field898 = 0;
        class141.field2965 = 0;
        class19.field425 = 0;
        class127.field2726 = 0;
        class25.field515 = 0;
        class140.field2936 = 0;
        class4.field134 = 0;
        class39.field875 = 0;
        class58.field1445 = 0;
        class54.field1365 = 0;
        class97.field2164 = 0;
        class56.field1417 = 0;
        class158.field3314 = 0;
        class88.field2040 = 0;
        class66.field1636 = 0;
        class41.field903 = 0;
        class2.field14 = 0;
        class23.field485 = 0;
        class117.field2555 = 0;
        class100.field2218 = 0;
        class195.field3838 = 0;
        class146.field3055 = 0;
        class52.field1333 = 0;
        class11.field243 = 0;
        class67.field1645 = 0;
        class39.field854 = 0;
        class92.field2084 = 0;
        class193.field3808 = 0;
        class161.field3359 = 0;
        class106.field2410 = 0;
        class163.field3398 = -1;
        class106.field2396 = 0;
        class100.field2236 = 0;
        class116.field2551 = -1;
        class136.field2865 = 0;
        class111.field2483.field1620 = 0;
        class192.field3794.field1620 = 0;
        class141.method1021(8, 0);
        for (int var1 = 0; var1 < 100; var1++) {
            class66.field1606[var1] = null;
        }
        class50.field1247 = 0;
        class194.field3827 = 0;
        class37.field784 = 0;
        class114.field2529 = 0;
        class185.field3674 = 0;
        class84.field1984 = (int) (Math.random() * 100.0D) - 50;
        class23.field489 = false;
        class148.field3081 = (int) (Math.random() * 110.0D) - 55;
        class114.field2534 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        class21.field463 = 0;
        class205.field4028 = (int) (Math.random() * 120.0D) - 60;
        class183.field3658 = (int) (Math.random() * 30.0D) - 20;
        class177.field3593 = 0;
        class193.field3807 = -1;
        class192.field3799 = (int) (Math.random() * 80.0D) - 40;
        class191.field3763 = 0;
        for (int var2 = 0; var2 < 2048; var2++) {
            class175.field3550[var2] = null;
            class99.field2210[var2] = null;
        }
        for (int var3 = 0; var3 < 32768; var3++) {
            class105.field2343[var3] = null;
        }
        class195.field3842 = class175.field3550[2047] = new class144();
        class44.field1080.method1019(64);
        class50.field1241.method1019(64);
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var12 = 0; var12 < 104; var12++) {
                for (int var13 = 0; var13 < 104; var13++) {
                    class122.field2615[var4][var12][var13] = null;
                }
            }
        }
        class165.field3411 = new class141();
        class140.field2941 = 0;
        class22.field468 = 0;
        for (int var5 = 0; var5 < class3.field106; var5++) {
            class149 var11 = class198.method1303(-9094, var5);
            if (var11 != null && var11.field3089 == 0) {
                class186.field3703[var5] = 0;
                class195.field3845[var5] = 0;
            }
        }
        for (int var6 = 0; var6 < class48.field1167.length; var6++) {
            class48.field1167[var6] = -1;
        }
        if (class86.field1998 != -1) {
            class151.method1060(class86.field1998, false);
        }
        for (class42 var7 = (class42) class177.field3580.method177(-106); var7 != null; var7 = (class42) class177.field3580.method185((byte) 25)) {
            class28.method172(-1494101117, var7, true);
        }
        class86.field1998 = -1;
        class177.field3580 = new class29(8);
        class94.field2121 = 0;
        class185.field3689 = null;
        class169.field3482 = false;
        class138.field2883.method585(null, false, (byte) -96, new int[5], -1);
        for (int var8 = 0; var8 < 8; var8++) {
            class175.field3549[var8] = null;
            field2813[var8] = false;
        }
        class200.method1312(true);
        class25.field512 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            class102.field2291[var9] = true;
        }
        class30.field595 = null;
        class95.field2137 = 0;
        class30.field607 = null;
        for (int var10 = 0; var10 < 6; var10++) {
            class55.field1394[var10] = new class150();
        }
    }
}
