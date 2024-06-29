import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class134 {

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "[I")
    private int[] field2967;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "Lic;")
    public static class59 field2968 = class59.method433(0, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "Llf;")
    public static class82 field2964 = new class82(64);

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "Lm;")
    public static class83 field2972 = new class83();

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public static int field2978 = 0;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "Lic;")
    private static class59 field2979 = class59.method433(0, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "Lic;")
    private static class59 field2980 = class59.method433(0, "Please try again)3");

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "Lic;")
    public static class59 field2983 = class59.method433(0, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "Lic;")
    public static class59 field2982 = field2979;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "Lic;")
    public static class59 field2984 = class59.method433(0, "Wordpack geladen)3");

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "Lic;")
    public static class59 field2987 = class59.method433(0, ")2");

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field2977 = 0;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "Lic;")
    public static class59 field2976 = field2980;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "Lic;")
    public static class59 field2990 = class59.method433(0, "auf einer freien Welt zu spielen)3");

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "B")
    public static byte field2973;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "[[[B")
    public static byte[][][] field2986;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIIII[Lwf;)V")
    public static final void method1031(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class159[] arg9) {
        class129.method980(arg4, arg6, arg5, arg0);
        class11.method59();
        for (int var10 = 0; var10 < arg9.length; var10++) {
            class159 var11 = arg9[var10];
            if (var11 != null && (var11.field3660 == arg2 || arg2 == -1412584499 && class102.field2492 == var11)) {
                int var12;
                if (arg7 == -1) {
                    class149.field3254[class158.field3502] = var11.field3524 + arg1;
                    class40.field1014[class158.field3502] = var11.field3544 + arg8;
                    class2.field49[class158.field3502] = var11.field3629;
                    class6.field125[class158.field3502] = var11.field3549;
                    var12 = class158.field3502++;
                } else {
                    var12 = arg7;
                }
                var11.field3635 = var12;
                var11.field3666 = class23.field561;
                if (!var11.field3596 || !class5.method28(-1, var11)) {
                    if (var11.field3610 > 0) {
                        class29.method234(var11, -93772504);
                    }
                    int var13 = var11.field3524 + arg1;
                    int var14 = var11.field3544 + arg8;
                    int var15 = var11.field3541;
                    if (class102.field2492 == var11) {
                        if (arg2 != -1412584499 && !var11.field3603) {
                            class102.field2496 = arg8;
                            class121.field2789 = arg1;
                            class85.field2137 = arg9;
                            continue;
                        }
                        if (class22.field523 && class26.field668) {
                            int var16 = class16.field325;
                            int var17 = var16 - class107.field2551;
                            if (class128.field2894 > var17) {
                                var17 = class128.field2894;
                            }
                            int var18 = class145.field3166;
                            if (var11.field3629 + var17 > class128.field2894 + class17.field329.field3629) {
                                var17 = class128.field2894 + class17.field329.field3629 - var11.field3629;
                            }
                            int var19 = var18 - class75.field1853;
                            var13 = var17;
                            if (class55.field1346 > var19) {
                                var19 = class55.field1346;
                            }
                            if (var11.field3549 + var19 > class55.field1346 + class17.field329.field3549) {
                                var19 = class55.field1346 + class17.field329.field3549 - var11.field3549;
                            }
                            var14 = var19;
                        }
                        if (!var11.field3603) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var24;
                    int var25;
                    if (var11.field3612 == 2) {
                        var24 = arg0;
                        var20 = arg4;
                        var21 = arg6;
                        var25 = arg5;
                    } else if (var11.field3612 == 9) {
                        int var26 = var13;
                        int var27 = var14;
                        int var28 = var11.field3629 + var13;
                        int var29 = var14 + var11.field3549;
                        if (var28 < var13) {
                            var26 = var28;
                            var28 = var13;
                        }
                        var20 = var26 > arg4 ? var26 : arg4;
                        if (var29 < var14) {
                            var27 = var29;
                            var29 = var14;
                        }
                        var29++;
                        var24 = arg0 > var29 ? var29 : arg0;
                        var21 = var27 <= arg6 ? arg6 : var27;
                        var28++;
                        var25 = var28 >= arg5 ? arg5 : var28;
                    } else {
                        var20 = arg4 < var13 ? var13 : arg4;
                        var21 = arg6 >= var14 ? arg6 : var14;
                        int var22 = var11.field3549 + var14;
                        int var23 = var11.field3629 + var13;
                        var24 = arg0 > var22 ? var22 : arg0;
                        var25 = arg5 <= var23 ? arg5 : var23;
                    }
                    if (!var11.field3596 || var20 < var25 && var21 < var24) {
                        if (var11.field3610 != 0) {
                            if (var11.field3610 == 1337) {
                                class23.field535 = var14;
                                class32.field863 = var13;
                                class108.method851(var11.field3549, var14, var13, var11.field3629, 4);
                                class129.method980(arg4, arg6, arg5, arg0);
                                continue;
                            }
                            if (var11.field3610 == 1338) {
                                class57.method416(var12, var14, var13, (byte) 112);
                                class129.method980(arg4, arg6, arg5, arg0);
                                continue;
                            }
                        }
                        int var32 = class16.field325;
                        int var33 = class145.field3166;
                        if (!class98.field2440 && var32 >= var20 && var21 <= var33 && var25 > var32 && var24 > var33) {
                            class60.method497(18889, var33 - var14, -var13 + var32, var11);
                        }
                        if (var11.field3612 == 0) {
                            if (!var11.field3596 && class5.method28(-1, var11) && class17.field343 != var11) {
                                continue;
                            }
                            if (!var11.field3596) {
                                if (var11.field3623 - var11.field3549 < var11.field3538) {
                                    var11.field3538 = var11.field3623 - var11.field3549;
                                }
                                if (var11.field3538 < 0) {
                                    var11.field3538 = 0;
                                }
                            }
                            method1031(var24, var13 - var11.field3555, var11.field3573, 25, var20, var25, var21, var12, var14 - var11.field3538, arg9);
                            if (var11.field3598 != null) {
                                method1031(var24, var13 - var11.field3555, var11.field3573, 50, var20, var25, var21, var12, var14 - var11.field3538, var11.field3598);
                            }
                            class41 var34 = (class41) class33.field889.method35((long) var11.field3573, 105);
                            if (var34 != null) {
                                if (var34.field1043 == 0 && var20 <= class16.field325 && var21 <= class145.field3166 && var25 > class16.field325 && class145.field3166 < var24 && !class98.field2440 && !class35.field925) {
                                    class107.field2557 = 1;
                                    class53.field1324[0] = 1006;
                                    class64.field1632[0] = class65.field1639;
                                    class6.field120[0] = class38.field1000;
                                }
                                class35.method270(var21, var14, var12, var13, var20, var25, var34.field1044, (byte) -27, var24);
                            }
                            class129.method980(arg4, arg6, arg5, arg0);
                            class11.method59();
                        }
                        if (class49.field1215[var12] || class89.field2247 > 1) {
                            if (var11.field3612 == 0 && !var11.field3596 && var11.field3549 < var11.field3623) {
                                class148.method1101(var14, var11.field3623, var11.field3538, var11.field3629 + var13, var11.field3549, 0);
                            }
                            if (var11.field3612 != 1) {
                                if (var11.field3612 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var11.field3549; var36++) {
                                        for (int var37 = 0; var37 < var11.field3629; var37++) {
                                            int var38 = (var11.field3584 + 32) * var37 + var13;
                                            int var39 = (var11.field3642 + 32) * var36 + var14;
                                            if (var35 < 20) {
                                                var38 += var11.field3552[var35];
                                                var39 += var11.field3659[var35];
                                            }
                                            if (var11.field3613[var35] > 0) {
                                                boolean var41 = false;
                                                boolean var42 = false;
                                                int var43 = var11.field3613[var35] - 1;
                                                if (arg4 < var38 + 32 && var38 < arg5 && arg6 < var39 + 32 && arg0 > var39 || class136.field3039 == var11 && class94.field2409 == var35) {
                                                    class132 var44;
                                                    if (class96.field2426 == 1 && class25.field624 == var35 && class143.field3132 == var11.field3573) {
                                                        var44 = class42.method318(0, false, -1, 2, var11.field3559[var35], var43);
                                                    } else {
                                                        var44 = class42.method318(3153952, false, -1, 1, var11.field3559[var35], var43);
                                                    }
                                                    if (var44 == null) {
                                                        class42.method320(false, var11);
                                                    } else if (class136.field3039 == var11 && class94.field2409 == var35) {
                                                        int var45 = class16.field325 - class94.field2408;
                                                        int var46 = class145.field3166 - class63.field1609;
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (var46 < 5 && var46 > -5) {
                                                            var46 = 0;
                                                        }
                                                        if (class29.field767 < 5) {
                                                            var45 = 0;
                                                            var46 = 0;
                                                        }
                                                        var44.method1011(var38 + var45, var39 + var46, 128);
                                                        if (arg2 != -1) {
                                                            class159 var47 = arg9[arg2 & 0xFFFF];
                                                            int var48 = class129.field2912;
                                                            int var49 = class129.field2909;
                                                            if (var48 > var39 + var46 && var47.field3538 > 0) {
                                                                int var50 = (var48 - var39 - var46) * class76.field1872 / 3;
                                                                if (var50 > class76.field1872 * 10) {
                                                                    var50 = class76.field1872 * 10;
                                                                }
                                                                if (var47.field3538 < var50) {
                                                                    var50 = var47.field3538;
                                                                }
                                                                var47.field3538 -= var50;
                                                                class63.field1609 += var50;
                                                                class42.method320(false, var47);
                                                            }
                                                            if (var46 + var39 + 32 > var49 && var47.field3623 - var47.field3549 > var47.field3538) {
                                                                int var51 = (var46 + var39 + 32 - var49) * class76.field1872 / 3;
                                                                if (var51 > class76.field1872 * 10) {
                                                                    var51 = class76.field1872 * 10;
                                                                }
                                                                if (var47.field3623 - var47.field3538 - var47.field3549 < var51) {
                                                                    var51 = var47.field3623 - var47.field3549 - var47.field3538;
                                                                }
                                                                var47.field3538 += var51;
                                                                class63.field1609 -= var51;
                                                                class42.method320(false, var47);
                                                            }
                                                        }
                                                    } else if (class147.field3199 == var11 && class82.field2043 == var35) {
                                                        var44.method1011(var38, var39, 128);
                                                    } else {
                                                        var44.method1023(var38, var39);
                                                    }
                                                }
                                            } else if (var11.field3583 != null && var35 < 20) {
                                                class132 var40 = var11.method1226(var35, -102);
                                                if (var40 != null) {
                                                    var40.method1023(var38, var39);
                                                } else if (class151.field3292) {
                                                    class42.method320(false, var11);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var11.field3612 == 3) {
                                    int var52;
                                    if (class19.method99(var11, (byte) -110)) {
                                        var52 = var11.field3597;
                                        if (class17.field343 == var11 && var11.field3563 != 0) {
                                            var52 = var11.field3563;
                                        }
                                    } else {
                                        var52 = var11.field3548;
                                        if (class17.field343 == var11 && var11.field3669 != 0) {
                                            var52 = var11.field3669;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field3638) {
                                            class129.method988(var13, var14, var11.field3629, var11.field3549, var52);
                                        } else {
                                            class129.method997(var13, var14, var11.field3629, var11.field3549, var52);
                                        }
                                    } else if (var11.field3638) {
                                        class129.method994(var13, var14, var11.field3629, var11.field3549, var52, 256 - (var15 & 0xFF));
                                    } else {
                                        class129.method984(var13, var14, var11.field3629, var11.field3549, var52, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field3612 == 4) {
                                    class141 var53 = var11.method1233(false);
                                    if (var53 != null) {
                                        class59 var54 = var11.field3624;
                                        int var55;
                                        if (class19.method99(var11, (byte) -88)) {
                                            var55 = var11.field3597;
                                            if (class17.field343 == var11 && var11.field3563 != 0) {
                                                var55 = var11.field3563;
                                            }
                                            if (var11.field3606.method437((byte) 52) > 0) {
                                                var54 = var11.field3606;
                                            }
                                        } else {
                                            var55 = var11.field3548;
                                            if (class17.field343 == var11 && var11.field3669 != 0) {
                                                var55 = var11.field3669;
                                            }
                                        }
                                        if (var11.field3596 && var11.field3590 != -1) {
                                            class79 var56 = class7.method39(30996, var11.field3590);
                                            var54 = var56.field1936;
                                            if (var54 == null) {
                                                var54 = class108.field2604;
                                            }
                                            if ((var56.field1951 == 1 || var11.field3614 != 1) && var11.field3614 != -1) {
                                                var54 = class46.method358(new class59[] { class130.field2924, var54, class125.field2840, class62.method516(41, var11.field3614) }, (byte) -75);
                                            }
                                        }
                                        if (class151.field3287 == var11) {
                                            var55 = var11.field3548;
                                            var54 = class77.field1893;
                                        }
                                        if (!var11.field3596) {
                                            var54 = class32.method254(var11, (byte) 124, var54);
                                        }
                                        var53.method1155(var54, var13, var14, var11.field3629, var11.field3549, var55, var11.field3577 ? 0 : -1, var11.field3592, var11.field3565, var11.field3620);
                                    } else if (class151.field3292) {
                                        class42.method320(false, var11);
                                    }
                                } else if (var11.field3612 == 5) {
                                    if (var11.field3596) {
                                        class132 var58;
                                        if (var11.field3590 == -1) {
                                            var58 = var11.method1223(false, -1);
                                        } else {
                                            var58 = class42.method318(var11.field3621, false, -1, var11.field3608, var11.field3614, var11.field3590);
                                        }
                                        if (var58 != null) {
                                            int var59 = var58.field2954;
                                            int var60 = var58.field2956;
                                            if (var11.field3634) {
                                                class129.method992(var13, var14, var11.field3629 + var13, var11.field3549 + var14);
                                                int var61 = (var59 + var11.field3629 - 1) / var59;
                                                int var62 = (var60 + var11.field3549 - 1) / var60;
                                                for (int var63 = 0; var63 < var61; var63++) {
                                                    for (int var64 = 0; var64 < var62; var64++) {
                                                        if (var11.field3626 != 0) {
                                                            var58.method1028(var59 * var63 + var13 + var59 / 2, var60 * var64 + (var14 - -(var60 / 2)), var11.field3626, 4096);
                                                        } else if (var15 == 0) {
                                                            var58.method1023(var59 * var63 + var13, var60 * var64 + var14);
                                                        } else {
                                                            var58.method1011(var59 * var63 + var13, var60 * var64 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class129.method980(arg4, arg6, arg5, arg0);
                                            } else {
                                                int var65 = var11.field3629 * 4096 / var59;
                                                if (var11.field3626 != 0) {
                                                    var58.method1028(var11.field3629 / 2 + var13, var11.field3549 / 2 + var14, var11.field3626, var65);
                                                } else if (var15 != 0) {
                                                    var58.method1013(var13, var14, var11.field3629, var11.field3549, 256 - (var15 & 0xFF));
                                                } else if (var11.field3629 == var59 && var11.field3549 == var60) {
                                                    var58.method1023(var13, var14);
                                                } else {
                                                    var58.method1014(var13, var14, var11.field3629, var11.field3549);
                                                }
                                            }
                                        } else if (class151.field3292) {
                                            class42.method320(false, var11);
                                        }
                                    } else {
                                        class132 var57 = var11.method1223(class19.method99(var11, (byte) -103), -1);
                                        if (var57 != null) {
                                            var57.method1023(var13, var14);
                                        } else if (class151.field3292) {
                                            class42.method320(false, var11);
                                        }
                                    }
                                } else if (var11.field3612 == 6) {
                                    class92 var66 = null;
                                    boolean var67 = class19.method99(var11, (byte) -100);
                                    int var68 = 0;
                                    int var69;
                                    if (var67) {
                                        var69 = var11.field3540;
                                    } else {
                                        var69 = var11.field3611;
                                    }
                                    if (var11.field3590 != -1) {
                                        class79 var71 = class7.method39(30996, var11.field3590);
                                        if (var71 != null) {
                                            class79 var72 = var71.method654(var11.field3614, (byte) -107);
                                            var66 = var72.method647(1, -1);
                                            if (var66 == null) {
                                                class42.method320(false, var11);
                                            } else {
                                                var66.method756();
                                                var68 = var66.field1775 / 2;
                                            }
                                        }
                                    } else if (var11.field3557 == 5) {
                                        if (var11.field3593 == 0) {
                                            var66 = class159.field3618.method739(-1, -1, (byte) -116, null, null);
                                        } else {
                                            var66 = class159.field3650.method43((byte) 91);
                                        }
                                    } else if (var69 == -1) {
                                        var66 = var11.method1229(-1, var67, null, class159.field3650.field1247, -10);
                                        if (var66 == null && class151.field3292) {
                                            class42.method320(false, var11);
                                        }
                                    } else {
                                        class25 var70 = class49.method381(var69, (byte) 116);
                                        var66 = var11.method1229(var11.field3615, var67, var70, class159.field3650.field1247, -10);
                                        if (var66 == null && class151.field3292) {
                                            class42.method320(false, var11);
                                        }
                                    }
                                    class11.method62(var11.field3629 / 2 + var13 + var11.field3537, var11.field3549 / 2 + var14 + var11.field3663);
                                    int var73 = class11.field244[var11.field3536] * var11.field3528 >> 16;
                                    int var74 = class11.field249[var11.field3536] * var11.field3528 >> 16;
                                    if (var66 != null) {
                                        if (var11.field3596) {
                                            var66.method756();
                                            if (var11.field3627) {
                                                var66.method767(0, var11.field3641, var11.field3532, var11.field3536, var11.field3616, var68 + var73 + var11.field3587, var11.field3587 + var74, var11.field3528);
                                            } else {
                                                var66.method766(0, var11.field3641, var11.field3532, var11.field3536, var11.field3616, var11.field3587 + var68 + var73, var11.field3587 + var74);
                                            }
                                        } else {
                                            var66.method766(0, var11.field3641, 0, var11.field3536, 0, var73, var74);
                                        }
                                    }
                                    class11.method54();
                                } else {
                                    if (var11.field3612 == 7) {
                                        class141 var75 = var11.method1233(false);
                                        if (var75 == null) {
                                            if (class151.field3292) {
                                                class42.method320(false, var11);
                                            }
                                            continue;
                                        }
                                        int var76 = 0;
                                        for (int var77 = 0; var77 < var11.field3549; var77++) {
                                            for (int var78 = 0; var78 < var11.field3629; var78++) {
                                                if (var11.field3613[var76] > 0) {
                                                    class79 var79 = class7.method39(30996, var11.field3613[var76] - 1);
                                                    class59 var80;
                                                    if (var79.field1951 != 1 && var11.field3559[var76] == 1) {
                                                        var80 = class46.method358(new class59[] { class130.field2924, var79.field1936, class157.field3433 }, (byte) -75);
                                                    } else {
                                                        var80 = class46.method358(new class59[] { class130.field2924, var79.field1936, class125.field2840, class62.method516(111, var11.field3559[var76]) }, (byte) -75);
                                                    }
                                                    int var81 = (var11.field3642 + 12) * var77 + var14;
                                                    int var82 = (var11.field3584 + 115) * var78 + var13;
                                                    if (var11.field3592 == 0) {
                                                        var75.method1134(var80, var82, var81, var11.field3548, var11.field3577 ? 0 : -1);
                                                    } else if (var11.field3592 == 1) {
                                                        var75.method1146(var80, var11.field3629 / 2 + var82, var81, var11.field3548, var11.field3577 ? 0 : -1);
                                                    } else {
                                                        var75.method1135(var80, var11.field3629 + var82 - 1, var81, var11.field3548, var11.field3577 ? 0 : -1);
                                                    }
                                                }
                                                var76++;
                                            }
                                        }
                                    }
                                    if (var11.field3612 == 8 && class147.field3191 == var11 && class85.field2140 == class3.field66) {
                                        int var83 = 0;
                                        class141 var84 = class88.field2222;
                                        int var85 = 0;
                                        class59 var86 = var11.field3624;
                                        class59 var87 = class32.method254(var11, (byte) 123, var86);
                                        while (var87.method437((byte) 52) > 0) {
                                            int var95 = var87.method435(class22.field514, -15730);
                                            class59 var96;
                                            if (var95 == -1) {
                                                var96 = var87;
                                                var87 = class38.field1000;
                                            } else {
                                                var96 = var87.method427((byte) 41, var95, 0);
                                                var87 = var87.method452(-805469788, var95 + 4);
                                            }
                                            int var97 = var84.method1157(var96);
                                            var85 += var84.field3392 + 1;
                                            if (var83 < var97) {
                                                var83 = var97;
                                            }
                                        }
                                        var83 += 6;
                                        var85 += 7;
                                        int var88 = var11.field3629 + var13 - var83 - 5;
                                        if (var13 + 5 > var88) {
                                            var88 = var13 + 5;
                                        }
                                        if (arg5 < var88 + var83) {
                                            var88 = arg5 - var83;
                                        }
                                        int var89 = var14 + var11.field3549 + 5;
                                        if (var85 + var89 > arg0) {
                                            var89 = arg0 - var85;
                                        }
                                        class129.method988(var88, var89, var83, var85, 16777120);
                                        class129.method997(var88, var89, var83, var85, 0);
                                        int var90 = var84.field3392 + var89 + 2;
                                        class59 var91 = var11.field3624;
                                        class59 var92 = class32.method254(var11, (byte) -70, var91);
                                        while (var92.method437((byte) 52) > 0) {
                                            int var93 = var92.method435(class22.field514, -15730);
                                            class59 var94;
                                            if (var93 == -1) {
                                                var94 = var92;
                                                var92 = class38.field1000;
                                            } else {
                                                var94 = var92.method427((byte) 41, var93, 0);
                                                var92 = var92.method452(-805469788, var93 + 4);
                                            }
                                            var84.method1134(var94, var88 + 3, var90, 0, -1);
                                            var90 += var84.field3392 + 1;
                                        }
                                    }
                                    if (var11.field3612 == 9) {
                                        if (var11.field3644 == 1) {
                                            class129.method983(var13, var14, var11.field3629 + var13, var11.field3549 + var14, var11.field3548);
                                        } else {
                                            int var98 = var11.field3629 < 0 ? -var11.field3629 : var11.field3629;
                                            int var99 = var11.field3549 < 0 ? -var11.field3549 : var11.field3549;
                                            int var100 = var98;
                                            if (var98 < var99) {
                                                var100 = var99;
                                            }
                                            if (var100 != 0) {
                                                int var101 = (var11.field3549 << 16) / var100;
                                                int var102 = (var11.field3629 << 16) / var100;
                                                if (var102 >= var101) {
                                                    var102 = -var102;
                                                } else {
                                                    var101 = -var101;
                                                }
                                                int var103 = var11.field3644 * var102 >> 17;
                                                int var104 = var11.field3644 * var102 + 1 >> 17;
                                                int var105 = var11.field3644 * var101 + 1 >> 17;
                                                int var106 = var11.field3644 * var101 >> 17;
                                                int var107 = var13 - arg4;
                                                int var108 = var14 - arg6;
                                                int var109 = var107 - var105;
                                                int var110 = var106 + var107;
                                                int var111 = var107 + var11.field3629 - var105;
                                                int var112 = var11.field3629 + var106 + var107;
                                                int var113 = var108 + var103;
                                                int var114 = var108 - var104;
                                                int var115 = var11.field3549 + var108 - var104;
                                                int var116 = var11.field3549 + var108 + var103;
                                                class11.method58(var110, var109, var111);
                                                class11.method63(var113, var114, var115, var110, var109, var111, var11.field3548);
                                                class11.method58(var110, var111, var112);
                                                class11.method63(var113, var115, var116, var110, var111, var112, var11.field3548);
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
        if (arg3 <= 20) {
            method1033(false);
        }
        field2970++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)Lwf;")
    public static final class159 method1032(int arg0, int arg1) {
        if (arg1 != 499749840) {
            method1033(true);
        }
        field2988++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class46.field1173[var2] == null || class46.field1173[var2][var3] == null) {
            boolean var4 = class114.method923(var2, (byte) -128);
            if (!var4) {
                return null;
            }
        }
        return class46.field1173[var2][var3];
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
    public static void method1033(boolean arg0) {
        field2980 = null;
        if (arg0) {
            return;
        }
        field2987 = null;
        field2986 = null;
        field2990 = null;
        field2972 = null;
        field2982 = null;
        field2976 = null;
        field2964 = null;
        field2983 = null;
        field2968 = null;
        field2979 = null;
        field2984 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljf;I)V")
    public static final void method1034(class68 arg0, int arg1) {
        field2974++;
        arg0.field1686 = arg0.field1757;
        if (arg0.field1715 == 0) {
            arg0.field1698 = 0;
            return;
        }
        if (arg0.field1685 != -1 && arg0.field1709 == 0) {
            class25 var2 = class49.method381(arg0.field1685, (byte) 106);
            if (arg0.field1681 > 0 && var2.field633 == 0) {
                arg0.field1698++;
                return;
            }
            if (arg0.field1681 <= 0 && var2.field616 == 0) {
                arg0.field1698++;
                return;
            }
        }
        int var3 = arg0.field1730;
        if (arg1 != 1792) {
            field2990 = null;
        }
        int var4 = arg0.field1751;
        int var5 = arg0.field1704[arg0.field1715 - 1] * 128 + arg0.field1712 * 64;
        int var6 = arg0.field1719[arg0.field1715 - 1] * 128 + arg0.field1712 * 64;
        if (var6 - var3 > 256 || var6 - var3 < -256 || var5 - var4 > 256 || var5 - var4 < -256) {
            arg0.field1730 = var6;
            arg0.field1751 = var5;
            return;
        }
        if (var6 <= var3) {
            if (var6 < var3) {
                if (var5 > var4) {
                    arg0.field1702 = 768;
                } else if (var4 <= var5) {
                    arg0.field1702 = 512;
                } else {
                    arg0.field1702 = 256;
                }
            } else if (var4 < var5) {
                arg0.field1702 = 1024;
            } else if (var5 < var4) {
                arg0.field1702 = 0;
            }
        } else if (var4 < var5) {
            arg0.field1702 = 1280;
        } else if (var5 >= var4) {
            arg0.field1702 = 1536;
        } else {
            arg0.field1702 = 1792;
        }
        int var7 = arg0.field1702 - arg0.field1724 & 0x7FF;
        int var8 = arg0.field1713;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1745;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1693;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1748;
        }
        int var9 = 4;
        if (var8 == -1) {
            var8 = arg0.field1745;
        }
        arg0.field1686 = var8;
        boolean var10 = true;
        if (arg0 instanceof class90) {
            var10 = ((class90) arg0).field2276.field2843;
        }
        if (var10) {
            if (arg0.field1724 != arg0.field1702 && arg0.field1711 == -1 && arg0.field1710 != 0) {
                var9 = 2;
            }
            if (arg0.field1715 > 2) {
                var9 = 6;
            }
            if (arg0.field1715 > 3) {
                var9 = 8;
            }
            if (arg0.field1698 > 0 && arg0.field1715 > 1) {
                var9 = 8;
                arg0.field1698--;
            }
        } else {
            if (arg0.field1715 > 1) {
                var9 = 6;
            }
            if (arg0.field1715 > 2) {
                var9 = 8;
            }
            if (arg0.field1698 > 0 && arg0.field1715 > 1) {
                var9 = 8;
                arg0.field1698--;
            }
        }
        if (arg0.field1735[arg0.field1715 - 1]) {
            var9 <<= 0x1;
        }
        if (var6 > var3) {
            arg0.field1730 += var9;
            if (var6 < arg0.field1730) {
                arg0.field1730 = var6;
            }
        } else if (var6 < var3) {
            arg0.field1730 -= var9;
            if (arg0.field1730 < var6) {
                arg0.field1730 = var6;
            }
        }
        if (var4 < var5) {
            arg0.field1751 += var9;
            if (var5 < arg0.field1751) {
                arg0.field1751 = var5;
            }
        } else if (var4 > var5) {
            arg0.field1751 -= var9;
            if (var5 > arg0.field1751) {
                arg0.field1751 = var5;
            }
        }
        if (var9 >= 8 && arg0.field1745 == arg0.field1686 && arg0.field1718 != -1) {
            arg0.field1686 = arg0.field1718;
        }
        if (arg0.field1730 == var6 && arg0.field1751 == var5) {
            if (arg0.field1681 > 0) {
                arg0.field1681--;
            }
            arg0.field1715--;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)Lic;")
    public static final class59 method1035(int arg0, byte arg1) {
        field2969++;
        if (arg1 > -51) {
            return null;
        } else if (arg0 < 999999999) {
            return class46.method361(arg0, -75);
        } else {
            return class49.field1221;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)I")
    public final int method1036(int arg0, int arg1) {
        int var3 = (this.field2967.length >> 1) - 1;
        field2971++;
        if (arg0 != -22145) {
            field2968 = null;
        }
        int var4 = arg1 & var3;
        while (true) {
            int var5 = this.field2967[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field2967[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILdd;II)Lce;")
    public static final class20 method1037(int arg0, class26 arg1, int arg2, int arg3) {
        if (arg3 <= 55) {
            field2990 = null;
        }
        field2966++;
        return class159.method1234(arg2, -65536, arg0, arg1) ? class82.method669(0) : null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([Lic;Z)[Lic;")
    public static final class59[] method1038(class59[] arg0, boolean arg1) {
        class59[] var2 = new class59[5];
        field2981++;
        int var3 = 0;
        if (arg1) {
            return null;
        }
        while (var3 < 5) {
            var2[var3] = class46.method358(new class59[] { class46.method361(var3, 72), class24.field567 }, (byte) -75);
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class46.method358(new class59[] { var2[var3], arg0[var3] }, (byte) -75);
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "([I)V")
    public class134(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field2967 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2967[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field2967[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field2967[var5 + var5] = arg0[var4];
            this.field2967[var5 + var5 + 1] = var4++;
        }
    }
}
