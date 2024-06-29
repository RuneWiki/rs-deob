import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class464 {

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "[[B")
    public static byte[][] field6837 = new byte[250][];

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "Ljn;")
    public static class409 field6836 = new class409("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "[I")
    public static int[] field6840 = new int[4096];

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "Lal;")
    public static class382 field6843 = class382.method2422(-90);

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field6838;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field6841;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public static int field6842;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "[Z")
    public static boolean[] field6839;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public static void method2864(int arg0) {
        if (arg0 != 28956) {
            method2864(-61);
        }
        field6840 = null;
        field6843 = null;
        field6837 = null;
        field6836 = null;
        field6839 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIILth;ZIILfp;ZIIB)V")
    public static final void method2865(int arg0, int arg1, int arg2, int arg3, class175 arg4, boolean arg5, int arg6, int arg7, class9 arg8, boolean arg9, int arg10, int arg11, byte arg12) {
        field6842++;
        if (!class163.method1082((byte) 95) && !class136.method907(arg0, arg3, arg6, false, class276.field4085)) {
            return;
        }
        if (class253.field3722 > arg6) {
            class253.field3722 = arg6;
        }
        if (arg12 >= -86) {
            method2865(-58, -113, -127, -18, (class175) null, true, -12, 86, (class9) null, true, -90, 18, (byte) 113);
        }
        class178 var13 = class450.method2785(arg2, (byte) 97);
        if (class118.field1594 == 1 && var13.field2527) {
            return;
        }
        int var14;
        int var15;
        if (arg10 == 1 || arg10 == 3) {
            var14 = var13.field2533;
            var15 = var13.field2476;
        } else {
            var14 = var13.field2476;
            var15 = var13.field2533;
        }
        int var16;
        int var17;
        if (class195.field2745 < arg0 + var15) {
            var16 = arg0;
            var17 = arg0 + 1;
        } else {
            var16 = (var15 >> 1) + arg0;
            var17 = (var15 + 1 >> 1) + arg0;
        }
        int var18;
        int var19;
        if ((arg3 + var14) <= class78.field984) {
            var18 = (var14 >> 1) + arg3;
            var19 = (var14 + 1 >> 1) + arg3;
        } else {
            var19 = arg3 + 1;
            var18 = arg3;
        }
        class378 var20 = class215.field3069[arg1];
        int var21 = var20.method1429(var16, var18) + var20.method1429(var17, var18) - (-var20.method1429(var16, var19) - var20.method1429(var17, var19)) >> 2;
        int var22 = (arg0 << 7) + (var15 << 6);
        int var23 = (arg3 << 7) + (var14 << 6);
        boolean var24 = arg5 && !arg9 && var13.field2502;
        if (var13.method1235((byte) 122)) {
            class71.method518(arg10, (class380) null, (byte) -105, (class26) null, arg3, arg6, var13, arg0);
        }
        boolean var25 = arg7 == -1 && var13.field2494 == -1 && var13.field2469 == null && var13.field2489 == null && !var13.field2488;
        if (class215.field3067 && var13.field2536 != 1) {
            return;
        }
        if (arg11 == 22) {
            if (class367.field5307 || var13.field2479 != 0 || var13.field2510 == 1 || var13.field2516) {
                class323 var27;
                if (var25) {
                    class430 var26 = new class430(arg8, var13, arg1, var22, var21, var23, arg9, arg10, var24);
                    var27 = var26;
                    if (var26.method15(true)) {
                        var26.method7(arg8, 112);
                    }
                } else {
                    var27 = new class267(arg8, var13, arg10, arg6, arg1, var22, var21, var23, arg9, arg7);
                }
                class455.method2822(arg6, arg0, arg3, var27);
                if (var13.field2510 == 1 && arg4 != null) {
                    arg4.method1202(arg0, arg3, 109);
                }
            }
        } else if (arg11 == 10 || arg11 == 11) {
            class286 var65 = null;
            int var67;
            class336 var68;
            if (var25) {
                class286 var66 = new class286(arg8, var13, arg6, arg1, var22, var21, var23, arg9, arg0, arg0 + var15 - 1, arg3, arg3 - (1 - var14), arg11, arg10, var24);
                var67 = var66.method1922(1);
                var65 = var66;
                var68 = var66;
            } else {
                var67 = 15;
                var68 = new class455(arg8, var13, arg11, arg10, arg6, arg1, var22, var21, var23, arg9, arg0, arg0 + var15 - 1, arg3, var14 + arg3 - 1, arg7);
            }
            if (class404.method2525(var68, false)) {
                if (var65 != null && var65.method15(true)) {
                    var65.method7(arg8, 121);
                }
                if (var13.field2482 && arg5) {
                    if (var67 > 30) {
                        var67 = 30;
                    }
                    for (int var69 = 0; var69 <= var15; var69++) {
                        for (int var70 = 0; var70 <= var14; var70++) {
                            var20.method1424(arg0 + var69, arg3 + var70, var67);
                        }
                    }
                }
            }
            if (var13.field2510 != 0 && arg4 != null) {
                arg4.method1217(var13.field2514, var14, (byte) -45, var15, !var13.field2534, arg3, arg0);
            }
        } else if (!(arg11 < 12 || arg11 > 17) || !(arg11 < 18 || arg11 > 21)) {
            class336 var29;
            if (var25) {
                class286 var28 = new class286(arg8, var13, arg6, arg1, var22, var21, var23, arg9, arg0, var15 + arg0 - 1, arg3, arg3 + var14 - 1, arg11, arg10, var24);
                if (var28.method15(true)) {
                    var28.method7(arg8, 107);
                }
                var29 = var28;
            } else {
                var29 = new class455(arg8, var13, arg11, arg10, arg6, arg1, var22, var21, var23, arg9, arg0, arg0 + var15 - 1, arg3, arg3 + var14 - 1, arg7);
            }
            class404.method2525(var29, false);
            if (arg5 && !arg9 && arg11 >= 12 && arg11 <= 17 && arg11 != 13 && arg6 > 0 && var13.field2536 != 0) {
                class282.field4150[arg6][arg0][arg3] = (byte) class259.method1785(class282.field4150[arg6][arg0][arg3], 4);
            }
            if (var13.field2510 != 0 && arg4 != null) {
                arg4.method1217(var13.field2514, var14, (byte) -107, var15, !var13.field2534, arg3, arg0);
            }
        } else if (arg11 == 0) {
            class422 var31;
            if (var25) {
                class358 var30 = new class358(arg8, var13, arg1, var22, var21, var23, arg9, arg11, arg10, var24);
                if (var30.method15(true)) {
                    var30.method7(arg8, 113);
                }
                var31 = var30;
            } else {
                var31 = new class4(arg8, var13, 0, arg10, arg6, arg1, var22, var21, var23, arg9, arg7);
            }
            class234.method1590(arg6, arg0, arg3, var31, (class422) null);
            if (arg5) {
                if (arg10 == 0) {
                    if (var13.field2482) {
                        var20.method1424(arg0, arg3, 50);
                        var20.method1424(arg0, arg3 + 1, 50);
                    }
                    if (var13.field2536 == 1 && !arg9) {
                        class282.field4150[arg6][arg0][arg3] = (byte) class259.method1785(class282.field4150[arg6][arg0][arg3], 1);
                    }
                } else if (arg10 == 1) {
                    if (var13.field2482) {
                        var20.method1424(arg0, arg3 + 1, 50);
                        var20.method1424(arg0 + 1, arg3 + 1, 50);
                    }
                    if (var13.field2536 == 1 && !arg9) {
                        class282.field4150[arg6][arg0][arg3 + 1] = (byte) class259.method1785(class282.field4150[arg6][arg0][arg3 + 1], 2);
                    }
                } else if (arg10 == 2) {
                    if (var13.field2482) {
                        var20.method1424(arg0 + 1, arg3, 50);
                        var20.method1424(arg0 + 1, arg3 + 1, 50);
                    }
                    if (var13.field2536 == 1 && !arg9) {
                        class282.field4150[arg6][arg0 + 1][arg3] = (byte) class259.method1785(class282.field4150[arg6][arg0 + 1][arg3], 1);
                    }
                } else if (arg10 == 3) {
                    if (var13.field2482) {
                        var20.method1424(arg0, arg3, 50);
                        var20.method1424(arg0 + 1, arg3, 50);
                    }
                    if (var13.field2536 == 1 && !arg9) {
                        class282.field4150[arg6][arg0][arg3] = (byte) class259.method1785(class282.field4150[arg6][arg0][arg3], 2);
                    }
                }
            }
            if (var13.field2510 != 0 && arg4 != null) {
                arg4.method1209(var13.field2514, arg11, arg0, (byte) -40, arg3, arg10, !var13.field2534);
            }
            if (var13.field2537 != 16) {
                class132.method887(arg6, arg0, arg3, var13.field2537);
            }
        } else if (arg11 == 1) {
            class422 var32;
            if (var25) {
                class358 var33 = new class358(arg8, var13, arg1, var22, var21, var23, arg9, arg11, arg10, var24);
                if (var33.method15(true)) {
                    var33.method7(arg8, 111);
                }
                var32 = var33;
            } else {
                var32 = new class4(arg8, var13, 1, arg10, arg6, arg1, var22, var21, var23, arg9, arg7);
            }
            class234.method1590(arg6, arg0, arg3, var32, (class422) null);
            if (var13.field2482 && arg5) {
                if (arg10 == 0) {
                    var20.method1424(arg0, arg3 + 1, 50);
                } else if (arg10 == 1) {
                    var20.method1424(arg0 + 1, arg3 + 1, 50);
                } else if (arg10 == 2) {
                    var20.method1424(arg0 + 1, arg3, 50);
                } else if (arg10 == 3) {
                    var20.method1424(arg0, arg3, 50);
                }
            }
            if (var13.field2510 != 0 && arg4 != null) {
                arg4.method1209(var13.field2514, arg11, arg0, (byte) -40, arg3, arg10, !var13.field2534);
            }
        } else if (arg11 == 2) {
            int var34 = arg10 + 1 & 0x3;
            class422 var37;
            class422 var38;
            if (var25) {
                class358 var35 = new class358(arg8, var13, arg1, var22, var21, var23, arg9, arg11, arg10 + 4, var24);
                class358 var36 = new class358(arg8, var13, arg1, var22, var21, var23, arg9, arg11, var34, var24);
                if (var35.method15(true)) {
                    var35.method7(arg8, 122);
                }
                var37 = var35;
                var38 = var36;
                if (var36.method15(true)) {
                    var36.method7(arg8, 106);
                }
            } else {
                var37 = new class4(arg8, var13, 2, arg10 + 4, arg6, arg1, var22, var21, var23, arg9, arg7);
                var38 = new class4(arg8, var13, 2, var34, arg6, arg1, var22, var21, var23, arg9, arg7);
            }
            class234.method1590(arg6, arg0, arg3, var37, var38);
            if (var13.field2536 == 1 && arg5 && !arg9) {
                if (arg10 == 0) {
                    class282.field4150[arg6][arg0][arg3] = (byte) class259.method1785(class282.field4150[arg6][arg0][arg3], 1);
                    class282.field4150[arg6][arg0][arg3 + 1] = (byte) class259.method1785(class282.field4150[arg6][arg0][arg3 + 1], 2);
                } else if (arg10 == 1) {
                    class282.field4150[arg6][arg0][arg3 + 1] = (byte) class259.method1785(class282.field4150[arg6][arg0][arg3 + 1], 2);
                    class282.field4150[arg6][arg0 + 1][arg3] = (byte) class259.method1785(class282.field4150[arg6][arg0 + 1][arg3], 1);
                } else if (arg10 == 2) {
                    class282.field4150[arg6][arg0 + 1][arg3] = (byte) class259.method1785(class282.field4150[arg6][arg0 + 1][arg3], 1);
                    class282.field4150[arg6][arg0][arg3] = (byte) class259.method1785(class282.field4150[arg6][arg0][arg3], 2);
                } else if (arg10 == 3) {
                    class282.field4150[arg6][arg0][arg3] = (byte) class259.method1785(class282.field4150[arg6][arg0][arg3], 2);
                    class282.field4150[arg6][arg0][arg3] = (byte) class259.method1785(class282.field4150[arg6][arg0][arg3], 1);
                }
            }
            if (var13.field2510 != 0 && arg4 != null) {
                arg4.method1209(var13.field2514, arg11, arg0, (byte) -40, arg3, arg10, !var13.field2534);
            }
            if (var13.field2537 != 16) {
                class132.method887(arg6, arg0, arg3, var13.field2537);
            }
        } else if (arg11 == 3) {
            class422 var40;
            if (var25) {
                class358 var39 = new class358(arg8, var13, arg1, var22, var21, var23, arg9, arg11, arg10, var24);
                if (var39.method15(true)) {
                    var39.method7(arg8, 127);
                }
                var40 = var39;
            } else {
                var40 = new class4(arg8, var13, 3, arg10, arg6, arg1, var22, var21, var23, arg9, arg7);
            }
            class234.method1590(arg6, arg0, arg3, var40, (class422) null);
            if (var13.field2482 && arg5) {
                if (arg10 == 0) {
                    var20.method1424(arg0, arg3 + 1, 50);
                } else if (arg10 == 1) {
                    var20.method1424(arg0 + 1, arg3 - -1, 50);
                } else if (arg10 == 2) {
                    var20.method1424(arg0 + 1, arg3, 50);
                } else if (arg10 == 3) {
                    var20.method1424(arg0, arg3, 50);
                }
            }
            if (var13.field2510 != 0 && arg4 != null) {
                arg4.method1209(var13.field2514, arg11, arg0, (byte) -40, arg3, arg10, !var13.field2534);
            }
        } else if (arg11 == 9) {
            class336 var42;
            if (var25) {
                class286 var41 = new class286(arg8, var13, arg6, arg1, var22, var21, var23, arg9, arg0, arg0, arg3, arg3, arg11, arg10, var24);
                if (var41.method15(true)) {
                    var41.method7(arg8, 112);
                }
                var42 = var41;
            } else {
                var42 = new class455(arg8, var13, arg11, arg10, arg6, arg1, var22, var21, var23, arg9, arg0, arg0 + var15 - 1, arg3, arg3 + var14 - 1, arg7);
            }
            class404.method2525(var42, false);
            if (var13.field2510 != 0 && arg4 != null) {
                arg4.method1217(var13.field2514, var14, (byte) -68, var15, !var13.field2534, arg3, arg0);
            }
            if (var13.field2537 != 16) {
                class132.method887(arg6, arg0, arg3, var13.field2537);
            }
        } else if (arg11 == 4) {
            class233 var44;
            if (var25) {
                class317 var43 = new class317(arg8, var13, arg1, var22, var21, var23, arg9, 0, 0, 0, arg11, arg10);
                var44 = var43;
                if (var43.method15(true)) {
                    var43.method7(arg8, 119);
                }
            } else {
                var44 = new class1(arg8, var13, arg11, arg10, arg6, arg1, var22, var21, var23, arg9, 0, 0, 0, arg7);
            }
            class139.method921(arg6, arg0, arg3, var44, (class233) null);
        } else if (arg11 == 5) {
            int var45 = 16;
            class438 var46 = (class438) class319.method2098(arg6, arg0, arg3);
            if (var46 != null) {
                var45 = class450.method2785(var46.method9((byte) 119), (byte) 100).field2537;
            }
            class233 var47;
            if (var25) {
                class317 var48 = new class317(arg8, var13, arg1, var22, var21, var23, arg9, 0, class46.field607[arg10] * var45, class455.field6714[arg10] * var45, arg11, arg10);
                var47 = var48;
                if (var48.method15(true)) {
                    var48.method7(arg8, 100);
                }
            } else {
                var47 = new class1(arg8, var13, arg11, arg10, arg6, arg1, var22, var21, var23, arg9, 0, class46.field607[arg10] * var45, class455.field6714[arg10] * var45, arg7);
            }
            class139.method921(arg6, arg0, arg3, var47, (class233) null);
        } else if (arg11 == 6) {
            int var49 = 8;
            class438 var50 = (class438) class319.method2098(arg6, arg0, arg3);
            if (var50 != null) {
                var49 = class450.method2785(var50.method9((byte) 117), (byte) 114).field2537 / 2;
            }
            class233 var52;
            if (var25) {
                class317 var51 = new class317(arg8, var13, arg1, var22, var21, var23, arg9, arg10, class46.field607[arg10] * var49, class455.field6714[arg10] * var49, arg11, arg10 + 4);
                var52 = var51;
                if (var51.method15(true)) {
                    var51.method7(arg8, 125);
                }
            } else {
                var52 = new class1(arg8, var13, arg11, arg10 + 4, arg6, arg1, var22, var21, var23, arg9, arg10, class52.field648[arg10] * var49, class151.field2053[arg10] * var49, arg7);
            }
            class139.method921(arg6, arg0, arg3, var52, (class233) null);
        } else if (arg11 == 7) {
            int var53 = arg10 + 2 & 0x3;
            class233 var54;
            if (var25) {
                class317 var55 = new class317(arg8, var13, arg1, var22, var21, var23, arg9, var53, 0, 0, arg11, var53 + 4);
                var54 = var55;
                if (var55.method15(true)) {
                    var55.method7(arg8, 125);
                }
            } else {
                var54 = new class1(arg8, var13, arg11, var53 + 4, arg6, arg1, var22, var21, var23, arg9, var53, 0, 0, arg7);
            }
            class139.method921(arg6, arg0, arg3, var54, (class233) null);
        } else if (arg11 == 8) {
            int var56 = arg10 + 2 & 0x3;
            int var57 = 8;
            class438 var58 = (class438) class319.method2098(arg6, arg0, arg3);
            if (var58 != null) {
                var57 = class450.method2785(var58.method9((byte) 109), (byte) 88).field2537 / 2;
            }
            class233 var61;
            class233 var62;
            if (var25) {
                class317 var63 = new class317(arg8, var13, arg1, var22, var21, var23, arg9, arg10, class52.field648[arg10] * var57, class151.field2053[arg10] * var57, arg11, arg10 + 4);
                class317 var64 = new class317(arg8, var13, arg1, var22, var21, var23, arg9, arg10, 0, 0, arg11, var56 + 4);
                if (var63.method15(true)) {
                    var63.method7(arg8, 125);
                }
                var61 = var63;
                var62 = var64;
                if (var64.method15(true)) {
                    var64.method7(arg8, 108);
                }
            } else {
                class1 var59 = new class1(arg8, var13, arg11, arg10 + 4, arg6, arg1, var22, var21, var23, arg9, arg10, class52.field648[arg10] * var57, class151.field2053[arg10] * var57, arg7);
                class1 var60 = new class1(arg8, var13, arg11, var56 + 4, arg6, arg1, var22, var21, var23, arg9, arg10, 0, 0, arg7);
                var61 = var59;
                var62 = var60;
            }
            class139.method921(arg6, arg0, arg3, var61, var62);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)V")
    public static final void method2866(byte arg0, int arg1) {
        int var2 = 35 / ((-arg0 - 22) / 34);
        field6838++;
        if (arg1 != -1 && class22.field318[arg1]) {
            class199.field2820.method737((byte) 104, arg1);
            class444.field6470[arg1] = null;
            class22.field318[arg1] = false;
        }
    }
}
