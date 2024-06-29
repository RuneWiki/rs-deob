import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class208 {

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "Z")
    public static boolean field3997 = false;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "Ltg;")
    private static class184 field3998 = class135.method812("Enter your username (V password)3", 3);

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field3996 = -1;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "Ltg;")
    public static class184 field4000 = field3998;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "Ltg;")
    public static class184 field3994 = class135.method812("scrollbar", 3);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILrh;)V")
    private static final void method1322(int arg0, class167 arg1) {
        field4001++;
        if (arg0 <= 60) {
            field3995 = -17;
        }
        int var2 = arg1.field3101;
        if (var2 == 324) {
            if (class174.field3295 == -1) {
                class195.field3791 = arg1.field2994;
                class174.field3295 = arg1.field3006;
            }
            if (class36.field674.field3989) {
                arg1.field3006 = class174.field3295;
            } else {
                arg1.field3006 = class195.field3791;
            }
        } else if (var2 == 325) {
            if (class174.field3295 == -1) {
                class174.field3295 = arg1.field3006;
                class195.field3791 = arg1.field2994;
            }
            if (class36.field674.field3989) {
                arg1.field3006 = class195.field3791;
            } else {
                arg1.field3006 = class174.field3295;
            }
        } else if (var2 == 327) {
            arg1.field3039 = 150;
            arg1.field3033 = (int) (Math.sin((double) class161.field2903 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field2991 = 5;
            arg1.field3054 = -1;
        } else if (var2 == 328) {
            if (class46.field872.field1299 == null) {
                arg1.field3054 = 0;
            } else {
                arg1.field3039 = 150;
                arg1.field3033 = (int) (Math.sin((double) class161.field2903 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field2991 = 5;
                arg1.field3054 = ((int) class46.field872.field1299.method1160(0) << 11) + 2047;
                arg1.field3035 = class46.field872.field655;
                arg1.field3043 = class46.field872.field643;
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I[Lrh;IIIIIIII)V")
    public static final void method1323(int arg0, class167[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4003++;
        if (arg0 < 75) {
            return;
        }
        class4.method31(arg2, arg4, arg3, arg9);
        class23.method157();
        for (int var10 = 0; var10 < arg1.length; var10++) {
            class167 var11 = arg1[var10];
            if (var11 != null && (var11.field3001 == arg7 || arg7 == -1412584499 && class34.field591 == var11)) {
                int var12;
                if (arg5 == -1) {
                    class198.field3859[class11.field199] = var11.field3117 + arg6;
                    class194.field3767[class11.field199] = var11.field3067 + arg8;
                    class55.field984[class11.field199] = var11.field3045;
                    class133.field2411[class11.field199] = var11.field3089;
                    var12 = class11.field199++;
                } else {
                    var12 = arg5;
                }
                var11.field3075 = class161.field2903;
                var11.field3122 = var12;
                if (!var11.field3106 || !class173.method1071(0, var11)) {
                    if (var11.field3101 > 0) {
                        method1322(76, var11);
                    }
                    int var13 = var11.field3067 + arg8;
                    int var14 = var11.field3117 + arg6;
                    int var15 = var11.field3026;
                    if (class34.field591 == var11) {
                        if (arg7 != -1412584499 && !var11.field3111) {
                            class11.field196 = arg6;
                            class191.field3714 = arg1;
                            class117.field2118 = arg8;
                            continue;
                        }
                        if (!var11.field3111) {
                            var15 = 128;
                        }
                        if (class74.field1384 && class18.field328) {
                            int var16 = class195.field3793;
                            int var17 = var16 - class173.field3282;
                            if (var17 < class145.field2620) {
                                var17 = class145.field2620;
                            }
                            if (var11.field3089 + var17 > class145.field2620 + class6.field115.field3089) {
                                var17 = class6.field115.field3089 + class145.field2620 - var11.field3089;
                            }
                            int var18 = class39.field736;
                            var13 = var17;
                            int var19 = var18 - class10.field182;
                            if (class24.field438 > var19) {
                                var19 = class24.field438;
                            }
                            if (class24.field438 + class6.field115.field3045 < var19 - -var11.field3045) {
                                var19 = class24.field438 + class6.field115.field3045 - var11.field3045;
                            }
                            var14 = var19;
                        }
                    }
                    int var20;
                    int var21;
                    int var24;
                    int var25;
                    if (var11.field3061 == 2) {
                        var21 = arg4;
                        var20 = arg2;
                        var24 = arg3;
                        var25 = arg9;
                    } else if (var11.field3061 == 9) {
                        int var26 = var13;
                        int var27 = var14;
                        int var28 = var11.field3045 + var14;
                        if (var14 > var28) {
                            var27 = var28;
                            var28 = var14;
                        }
                        var20 = arg2 >= var27 ? arg2 : var27;
                        int var30 = var11.field3089 + var13;
                        if (var13 > var30) {
                            var26 = var30;
                            var30 = var13;
                        }
                        var21 = var26 <= arg4 ? arg4 : var26;
                        var28++;
                        var24 = var28 >= arg3 ? arg3 : var28;
                        var30++;
                        var25 = arg9 <= var30 ? arg9 : var30;
                    } else {
                        var20 = arg2 < var14 ? var14 : arg2;
                        var21 = arg4 >= var13 ? arg4 : var13;
                        int var22 = var11.field3089 + var13;
                        int var23 = var11.field3045 + var14;
                        var24 = arg3 <= var23 ? arg3 : var23;
                        var25 = arg9 <= var22 ? arg9 : var22;
                    }
                    if (!var11.field3106 || var20 < var24 && var25 > var21) {
                        if (var11.field3101 != 0) {
                            if (var11.field3101 == 1337) {
                                class25.field453 = var13;
                                class73.field1371 = var14;
                                class114.method700(var11.field3045, (byte) -108, var13, var11.field3089, var14);
                                class4.method31(arg2, arg4, arg3, arg9);
                                continue;
                            }
                            if (var11.field3101 == 1338) {
                                if (var11.method1041(-26202)) {
                                    class16.method103(var11, var14, var13, (byte) -86, var12);
                                    class4.method31(arg2, arg4, arg3, arg9);
                                }
                                continue;
                            }
                            if (var11.field3101 == 1339) {
                                if (var11.method1041(-26202)) {
                                    class17.method110(var11, var13, true, var12, var14);
                                    class4.method31(arg2, arg4, arg3, arg9);
                                }
                                continue;
                            }
                        }
                        int var32 = class39.field736;
                        int var33 = class195.field3793;
                        if (!class170.field3244 && var32 >= var20 && var21 <= var33 && var32 < var24 && var25 > var33) {
                            class69.method401(441, var33 - var13, var11, var32 - var14);
                        }
                        if (var11.field3061 == 0) {
                            if (!var11.field3106 && class173.method1071(0, var11) && class68.field1305 != var11) {
                                continue;
                            }
                            if (!var11.field3106) {
                                if (var11.field3073 > var11.field3096 - var11.field3089) {
                                    var11.field3073 = var11.field3096 - var11.field3089;
                                }
                                if (var11.field3073 < 0) {
                                    var11.field3073 = 0;
                                }
                            }
                            method1323(105, arg1, var20, var24, var21, var12, var14 - var11.field3109, var11.field3069, var13 - var11.field3073, var25);
                            if (var11.field3097 != null) {
                                method1323(111, var11.field3097, var20, var24, var21, var12, var14 - var11.field3109, var11.field3069, var13 - var11.field3073, var25);
                            }
                            class7 var34 = (class7) class134.field2436.method51((long) var11.field3069, 101);
                            if (var34 != null) {
                                if (var34.field130 == 0 && class39.field736 >= var20 && var21 <= class195.field3793 && class39.field736 < var24 && var25 > class195.field3793 && !class170.field3244 && !class84.field1530) {
                                    class54.field960[0] = 1007;
                                    class38.field719[0] = class16.field305;
                                    class174.field3298[0] = class170.field3242;
                                    class133.field2404 = 1;
                                }
                                class62.method350(0, var20, var12, var14, var34.field119, var13, var25, var24, var21);
                            }
                            class4.method31(arg2, arg4, arg3, arg9);
                            class23.method157();
                        }
                        if (class175.field3329[var12] || class184.field3524 > 1) {
                            if (var11.field3061 == 0 && !var11.field3106 && var11.field3089 < var11.field3096) {
                                class185.method1170(var11.field3045 + var14, var11.field3073, var11.field3089, var13, 28597, var11.field3096);
                            }
                            if (var11.field3061 != 1) {
                                if (var11.field3061 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var11.field3089; var36++) {
                                        for (int var37 = 0; var37 < var11.field3045; var37++) {
                                            int var38 = var14 + (var11.field3020 + 32) * var37;
                                            int var39 = var13 + (var11.field3115 + 32) * var36;
                                            if (var35 < 20) {
                                                var38 += var11.field3085[var35];
                                                var39 += var11.field3012[var35];
                                            }
                                            if (var11.field3130[var35] > 0) {
                                                int var41 = var11.field3130[var35] - 1;
                                                boolean var42 = false;
                                                boolean var43 = false;
                                                if (arg2 < var38 + 32 && arg3 > var38 && arg4 < var39 + 32 && arg9 > var39 || class31.field535 == var11 && class185.field3580 == var35) {
                                                    class137 var44;
                                                    if (class187.field3610 == 1 && class12.field219 == var35 && class7.field133 == var11.field3069) {
                                                        var44 = class123.method749(0, 32, 2, var41, var11.field3056[var35], false);
                                                    } else {
                                                        var44 = class123.method749(3153952, 32, 1, var41, var11.field3056[var35], false);
                                                    }
                                                    if (var44 == null) {
                                                        class57.method305(-124, var11);
                                                    } else if (class31.field535 == var11 && class185.field3580 == var35) {
                                                        int var45 = class39.field736 - class143.field2574;
                                                        int var46 = class195.field3793 - class182.field3514;
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (var46 < 5 && var46 > -5) {
                                                            var46 = 0;
                                                        }
                                                        if (class184.field3542 < 5) {
                                                            var45 = 0;
                                                            var46 = 0;
                                                        }
                                                        var44.method849(var38 + var45, var39 - -var46, 128);
                                                        if (arg7 != -1) {
                                                            class167 var47 = arg1[arg7 & 0xFFFF];
                                                            int var48 = class4.field69;
                                                            int var49 = class4.field70;
                                                            if (var49 > var39 + var46 && var47.field3073 > 0) {
                                                                int var50 = (var49 - var46 - var39) * class170.field3231 / 3;
                                                                if (var50 > class170.field3231 * 10) {
                                                                    var50 = class170.field3231 * 10;
                                                                }
                                                                if (var47.field3073 < var50) {
                                                                    var50 = var47.field3073;
                                                                }
                                                                var47.field3073 -= var50;
                                                                class182.field3514 += var50;
                                                                class57.method305(-123, var47);
                                                            }
                                                            if (var48 < var39 + var46 + 32 && var47.field3096 - var47.field3089 > var47.field3073) {
                                                                int var51 = (var39 + var46 + 32 - var48) * class170.field3231 / 3;
                                                                if (var51 > class170.field3231 * 10) {
                                                                    var51 = class170.field3231 * 10;
                                                                }
                                                                if (var47.field3096 - var47.field3089 - var47.field3073 < var51) {
                                                                    var51 = var47.field3096 - var47.field3089 - var47.field3073;
                                                                }
                                                                var47.field3073 += var51;
                                                                class182.field3514 -= var51;
                                                                class57.method305(-119, var47);
                                                            }
                                                        }
                                                    } else if (class204.field3934 == var11 && class58.field1031 == var35) {
                                                        var44.method849(var38, var39, 128);
                                                    } else {
                                                        var44.method835(var38, var39);
                                                    }
                                                }
                                            } else if (var11.field3003 != null && var35 < 20) {
                                                class137 var40 = var11.method1037((byte) -84, var35);
                                                if (var40 != null) {
                                                    var40.method835(var38, var39);
                                                } else if (class1.field3) {
                                                    class57.method305(-112, var11);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var11.field3061 == 3) {
                                    int var52;
                                    if (class51.method281(var11, -102)) {
                                        var52 = var11.field3088;
                                        if (class68.field1305 == var11 && var11.field3009 != 0) {
                                            var52 = var11.field3009;
                                        }
                                    } else {
                                        var52 = var11.field3057;
                                        if (class68.field1305 == var11 && var11.field2988 != 0) {
                                            var52 = var11.field2988;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field3080) {
                                            class4.method27(var14, var13, var11.field3045, var11.field3089, var52);
                                        } else {
                                            class4.method18(var14, var13, var11.field3045, var11.field3089, var52);
                                        }
                                    } else if (var11.field3080) {
                                        class4.method19(var14, var13, var11.field3045, var11.field3089, var52, 256 - (var15 & 0xFF));
                                    } else {
                                        class4.method28(var14, var13, var11.field3045, var11.field3089, var52, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field3061 == 4) {
                                    class124 var53 = var11.method1035(false, class125.field2250);
                                    if (var53 != null) {
                                        class184 var54 = var11.field3051;
                                        int var55;
                                        if (class51.method281(var11, -115)) {
                                            var55 = var11.field3088;
                                            if (class68.field1305 == var11 && var11.field3009 != 0) {
                                                var55 = var11.field3009;
                                            }
                                            if (var11.field3005.method1159(false) > 0) {
                                                var54 = var11.field3005;
                                            }
                                        } else {
                                            var55 = var11.field3057;
                                            if (class68.field1305 == var11 && var11.field2988 != 0) {
                                                var55 = var11.field2988;
                                            }
                                        }
                                        if (var11.field3106 && var11.field3034 != -1) {
                                            class122 var56 = class60.method336(var11.field3034, 10);
                                            var54 = var56.field2233;
                                            if (var54 == null) {
                                                var54 = class212.field4106;
                                            }
                                            if ((var56.field2223 == 1 || var11.field3050 != 1) && var11.field3050 != -1) {
                                                var54 = class144.method884(0, new class184[] { class26.field476, var54, class1.field26, class168.method1048(0, var11.field3050) });
                                            }
                                        }
                                        if (class50.field925 == var11) {
                                            var54 = class169.field3190;
                                            var55 = var11.field3057;
                                        }
                                        if (!var11.field3106) {
                                            var54 = class82.method461(var54, -4, var11);
                                        }
                                        var53.method1355(var54, var14, var13, var11.field3045, var11.field3089, var55, var11.field3000 ? 0 : -1, var11.field3110, var11.field3078, var11.field3113);
                                    } else if (class1.field3) {
                                        class57.method305(-128, var11);
                                    }
                                } else if (var11.field3061 == 5) {
                                    if (var11.field3106) {
                                        class137 var57;
                                        if (var11.field3034 == -1) {
                                            var57 = var11.method1034(true, false);
                                        } else {
                                            var57 = class123.method749(var11.field3077, 32, var11.field2995, var11.field3034, var11.field3050, false);
                                        }
                                        if (var57 != null) {
                                            int var58 = var57.field2495;
                                            int var59 = var57.field2496;
                                            if (var11.field2998) {
                                                class4.method22(var14, var13, var11.field3045 + var14, var13 - -var11.field3089);
                                                int var60 = (var58 + var11.field3045 - 1) / var58;
                                                int var61 = (var11.field3089 + var59 - 1) / var59;
                                                for (int var62 = 0; var62 < var60; var62++) {
                                                    for (int var63 = 0; var63 < var61; var63++) {
                                                        if (var11.field3065 != 0) {
                                                            var57.method848(var58 / 2 + var14 + var58 * var62, var59 * var63 + var13 - -(var59 / 2), var11.field3065, 4096);
                                                        } else if (var15 == 0) {
                                                            var57.method835(var58 * var62 + var14, var59 * var63 + var13);
                                                        } else {
                                                            var57.method849(var58 * var62 + var14, var13 - -(var59 * var63), 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class4.method31(arg2, arg4, arg3, arg9);
                                            } else {
                                                int var64 = var11.field3045 * 4096 / var58;
                                                if (var11.field3065 != 0) {
                                                    var57.method848(var11.field3045 / 2 + var14, var11.field3089 / 2 + var13, var11.field3065, var64);
                                                } else if (var15 != 0) {
                                                    var57.method831(var14, var13, var11.field3045, var11.field3089, 256 - (var15 & 0xFF));
                                                } else if (var11.field3045 == var58 && var11.field3089 == var59) {
                                                    var57.method835(var14, var13);
                                                } else {
                                                    var57.method838(var14, var13, var11.field3045, var11.field3089);
                                                }
                                            }
                                        } else if (class1.field3) {
                                            class57.method305(-122, var11);
                                        }
                                    } else {
                                        class137 var65 = var11.method1034(true, class51.method281(var11, -128));
                                        if (var65 != null) {
                                            var65.method835(var14, var13);
                                        } else if (class1.field3) {
                                            class57.method305(-121, var11);
                                        }
                                    }
                                } else if (var11.field3061 == 6) {
                                    class140 var66 = null;
                                    int var67 = 0;
                                    boolean var68 = class51.method281(var11, -98);
                                    int var69;
                                    if (var68) {
                                        var69 = var11.field3041;
                                    } else {
                                        var69 = var11.field3035;
                                    }
                                    if (var11.field3034 != -1) {
                                        class122 var70 = class60.method336(var11.field3034, 10);
                                        if (var70 != null) {
                                            class122 var71 = var70.method736(0, var11.field3050);
                                            var66 = var71.method744(-56, 1, 0, null);
                                            if (var66 == null) {
                                                class57.method305(-128, var11);
                                            } else {
                                                var66.method870();
                                                var67 = -var66.field949 / 2;
                                            }
                                        }
                                    } else if (var11.field2991 == 5) {
                                        if (var11.field3054 == -1) {
                                            var66 = class36.field674.method1314(5, null, -1, -1, null);
                                        } else {
                                            int var72 = var11.field3054 & 0x7FF;
                                            if (class125.field2260 == var72) {
                                                var72 = 2047;
                                            }
                                            class67 var73 = class57.field1024[var72];
                                            class188 var74 = var69 == -1 ? null : class83.method465(var69, -1);
                                            if (var73 != null && (int) var73.field1299.method1160(0) << 11 == (var11.field3054 & 0xFFFFF800)) {
                                                var66 = var73.field1275.method1314(5, var74, 0, var11.field3043, null);
                                            }
                                        }
                                    } else if (var69 == -1) {
                                        var66 = var11.method1036((byte) 111, null, var68, class46.field872.field1275, -1);
                                        if (var66 == null && class1.field3) {
                                            class57.method305(-120, var11);
                                        }
                                    } else {
                                        class188 var75 = class83.method465(var69, -1);
                                        var66 = var11.method1036((byte) 92, var75, var68, class46.field872.field1275, var11.field3043);
                                        if (var66 == null && class1.field3) {
                                            class57.method305(-123, var11);
                                        }
                                    }
                                    if (var66 != null) {
                                        class23.method158(var11.field3045 / 2 + var14 + var11.field3007, var11.field3089 / 2 + var13 + var11.field3066);
                                        int var76 = class23.field422[var11.field3039] * var11.field3118 >> 16;
                                        int var77 = class23.field434[var11.field3039] * var11.field3118 >> 16;
                                        if (!var11.field3106) {
                                            var66.method552(0, var11.field3033, 0, var11.field3039, 0, var76, var77);
                                        } else if (var11.field3105) {
                                            var66.method557(0, var11.field3033, var11.field3123, var11.field3039, var11.field2996, var11.field3052 + var76 + var67, var77 - -var11.field3052, var11.field3118);
                                        } else {
                                            var66.method552(0, var11.field3033, var11.field3123, var11.field3039, var11.field2996, var67 + var76 + var11.field3052, var11.field3052 + var77);
                                        }
                                        class23.method159();
                                    }
                                } else {
                                    if (var11.field3061 == 7) {
                                        class124 var78 = var11.method1035(false, class125.field2250);
                                        if (var78 == null) {
                                            if (class1.field3) {
                                                class57.method305(-125, var11);
                                            }
                                            continue;
                                        }
                                        int var79 = 0;
                                        for (int var80 = 0; var80 < var11.field3089; var80++) {
                                            for (int var81 = 0; var81 < var11.field3045; var81++) {
                                                if (var11.field3130[var79] > 0) {
                                                    class122 var82 = class60.method336(var11.field3130[var79] - 1, 10);
                                                    class184 var83;
                                                    if (var82.field2223 != 1 && var11.field3056[var79] == 1) {
                                                        var83 = class144.method884(0, new class184[] { class26.field476, var82.field2233, class151.field2714 });
                                                    } else {
                                                        var83 = class144.method884(0, new class184[] { class26.field476, var82.field2233, class1.field26, class168.method1048(0, var11.field3056[var79]) });
                                                    }
                                                    int var84 = (var11.field3020 + 115) * var81 + var14;
                                                    int var85 = var13 + (var11.field3115 + 12) * var80;
                                                    if (var11.field3110 == 0) {
                                                        var78.method1366(var83, var84, var85, var11.field3057, var11.field3000 ? 0 : -1);
                                                    } else if (var11.field3110 == 1) {
                                                        var78.method1365(var83, var11.field3045 / 2 + var84, var85, var11.field3057, var11.field3000 ? 0 : -1);
                                                    } else {
                                                        var78.method1364(var83, var84 + var11.field3045 - 1, var85, var11.field3057, var11.field3000 ? 0 : -1);
                                                    }
                                                }
                                                var79++;
                                            }
                                        }
                                    }
                                    if (var11.field3061 == 8 && class59.field1102 == var11 && class85.field1577 == class117.field2110) {
                                        int var86 = 0;
                                        class184 var87 = var11.field3051;
                                        int var88 = 0;
                                        class124 var89 = class182.field3517;
                                        class184 var90 = class82.method461(var87, -4, var11);
                                        while (var90.method1159(false) > 0) {
                                            int var98 = var90.method1142(class169.field3205, (byte) 110);
                                            class184 var99;
                                            if (var98 == -1) {
                                                var99 = var90;
                                                var90 = class170.field3242;
                                            } else {
                                                var99 = var90.method1162(0, -711833726, var98);
                                                var90 = var90.method1140(1, var98 + 4);
                                            }
                                            int var100 = var89.method1353(var99);
                                            if (var100 > var86) {
                                                var86 = var100;
                                            }
                                            var88 += var89.field4067 + 1;
                                        }
                                        var86 += 6;
                                        var88 += 7;
                                        int var91 = var14 + var11.field3045 - var86 - 5;
                                        if (var91 < var14 + 5) {
                                            var91 = var14 + 5;
                                        }
                                        int var92 = var13 + var11.field3089 + 5;
                                        if (var86 + var91 > arg3) {
                                            var91 = arg3 - var86;
                                        }
                                        if (var88 + var92 > arg9) {
                                            var92 = arg9 - var88;
                                        }
                                        class4.method27(var91, var92, var86, var88, 16777120);
                                        class4.method18(var91, var92, var86, var88, 0);
                                        class184 var93 = var11.field3051;
                                        int var94 = var89.field4067 + var92 + 2;
                                        class184 var95 = class82.method461(var93, -4, var11);
                                        while (var95.method1159(false) > 0) {
                                            int var96 = var95.method1142(class169.field3205, (byte) 110);
                                            class184 var97;
                                            if (var96 == -1) {
                                                var97 = var95;
                                                var95 = class170.field3242;
                                            } else {
                                                var97 = var95.method1162(0, -711833726, var96);
                                                var95 = var95.method1140(1, var96 + 4);
                                            }
                                            var89.method1366(var97, var91 + 3, var94, 0, -1);
                                            var94 += var89.field4067 + 1;
                                        }
                                    }
                                    if (var11.field3061 == 9) {
                                        if (var11.field3121 == 1) {
                                            class4.method35(var14, var13, var11.field3045 + var14, var13 - -var11.field3089, var11.field3057);
                                        } else {
                                            int var101 = var11.field3089 >= 0 ? var11.field3089 : -var11.field3089;
                                            int var102 = var11.field3045 < 0 ? -var11.field3045 : var11.field3045;
                                            int var103 = var102;
                                            if (var102 < var101) {
                                                var103 = var101;
                                            }
                                            if (var103 != 0) {
                                                int var104 = (var11.field3045 << 16) / var103;
                                                int var105 = (var11.field3089 << 16) / var103;
                                                int var106 = var14 - arg2;
                                                if (var105 <= var104) {
                                                    var104 = -var104;
                                                } else {
                                                    var105 = -var105;
                                                }
                                                int var107 = var11.field3121 * var104 + 1 >> 17;
                                                int var108 = var11.field3121 * var105 + 1 >> 17;
                                                int var109 = var13 - arg4;
                                                int var110 = var11.field3121 * var104 >> 17;
                                                int var111 = var11.field3121 * var105 >> 17;
                                                int var112 = var106 + var111;
                                                int var113 = var11.field3045 + var106 - var108;
                                                int var114 = var106 + var111 + var11.field3045;
                                                int var115 = var109 + var110;
                                                int var116 = var106 - var108;
                                                int var117 = var11.field3089 + var109 - var107;
                                                int var118 = var109 - var107;
                                                int var119 = var11.field3089 + var109 + var110;
                                                class23.method153(var112, var116, var113);
                                                class23.method146(var115, var118, var117, var112, var116, var113, var11.field3057);
                                                class23.method153(var112, var113, var114);
                                                class23.method146(var115, var117, var119, var112, var113, var114, var11.field3057);
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

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public static void method1324(byte arg0) {
        field3994 = null;
        field4000 = null;
        int var1 = 92 / ((arg0 + 61) / 43);
        field3998 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IBI)I")
    public static final int method1325(int arg0, byte arg1, int arg2) {
        class36 var3 = (class36) class179.field3417.method51((long) arg0, -116);
        field3993++;
        if (arg1 != -75) {
            return -113;
        } else if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field680.length; var5++) {
                if (var3.field681[var5] == arg2) {
                    var4 += var3.field680[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/awt/Component;ILpf;I)Lwf;")
    public static final class210 method1326(int arg0, Component arg1, int arg2, class147 arg3, int arg4) {
        field4002++;
        if (class210.field4018 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            if (arg0 > -93) {
                method1325(-106, (byte) -25, 77);
            }
            try {
                class210 var5 = (class210) Class.forName("ha").getDeclaredConstructor().newInstance();
                var5.field4048 = arg4;
                var5.field4041 = new int[(class120.field2167 ? 2 : 1) * 256];
                var5.method418(arg1);
                var5.field4047 = (arg4 & -1024) + 1024;
                if (var5.field4047 > 16384) {
                    var5.field4047 = 16384;
                }
                var5.method420(var5.field4047);
                if (class115.field2083 > 0 && class174.field3302 == null) {
                    class174.field3302 = new class168();
                    class174.field3302.field3163 = arg3;
                    arg3.method903(class115.field2083, 103, class174.field3302);
                }
                if (class174.field3302 != null) {
                    if (class174.field3302.field3168[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class174.field3302.field3168[arg2] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class192 var6 = new class192(arg3, arg2);
                    var6.field4041 = new int[(class120.field2167 ? 2 : 1) * 256];
                    var6.field4048 = arg4;
                    var6.method418(arg1);
                    var6.field4047 = 16384;
                    var6.method420(var6.field4047);
                    if (class115.field2083 > 0 && class174.field3302 == null) {
                        class174.field3302 = new class168();
                        class174.field3302.field3163 = arg3;
                        arg3.method903(class115.field2083, -111, class174.field3302);
                    }
                    if (class174.field3302 != null) {
                        if (class174.field3302.field3168[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class174.field3302.field3168[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class210();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
