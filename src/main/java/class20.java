import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class20 {

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "Lud;")
    public static class279 field567 = class130.method1024("::serverjs5drop", 255);

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "Lud;")
    public static class279 field569 = class130.method1024("<col=00ff00>", 255);

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "Ldd;")
    public static class247 field574 = new class247(128);

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "[[I")
    public static int[][] field577 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "Lud;")
    public static class279 field578 = class130.method1024("Lade)3)3)3", 255);

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "Lj;")
    public static class282 field576;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 5)
    public static void method190(int arg0) {
        field569 = null;
        field574 = null;
        field576 = null;
        field567 = null;
        if (arg0 != 1) {
            field576 = (class282) null;
        }
        field577 = (int[][]) null;
        field578 = null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Llg;IIIIZBZIII)V", line = 23)
    public static final void method191(class123 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte arg6, boolean arg7, int arg8, int arg9, int arg10) {
        field573++;
        if (arg5 && !class221.method1617((byte) 29) && (class257.field4573[0][arg1][arg10] & 0x2) == 0) {
            if ((class257.field4573[arg8][arg1][arg10] & 0x10) != 0) {
                return;
            }
            if (class286.method2043(arg1, -1, arg8, arg10) != class179.field3245) {
                return;
            }
        }
        if (class301.field5358 > arg8) {
            class301.field5358 = arg8;
        }
        class264 var11 = class252.method1808(arg9, (byte) 4);
        if (class97.field1824 && var11.field4737) {
            return;
        }
        int var12;
        int var13;
        if (arg3 == 1 || arg3 == 3) {
            var12 = var11.field4733;
            var13 = var11.field4766;
        } else {
            var12 = var11.field4766;
            var13 = var11.field4733;
        }
        int var14;
        int var15;
        if ((arg1 + var12) > 104) {
            var14 = arg1 + 1;
            var15 = arg1;
        } else {
            var15 = arg1 + (var12 >> 1);
            var14 = arg1 + (var12 + 1 >> 1);
        }
        int var16;
        int var17;
        if ((arg10 + var13) > 104) {
            var16 = arg10 + 1;
            var17 = arg10;
        } else {
            var17 = (var13 >> 1) + arg10;
            var16 = (var13 + 1 >> 1) + arg10;
        }
        int[][] var18 = class165.field2970[arg2];
        int var19 = (arg1 << 7) + (var12 << 6);
        int var20 = (arg10 << 7) + (var13 << 6);
        int var21 = 0;
        int var22 = var18[var14][var16] + var18[var15][var16] + var18[var14][var17] + var18[var15][var17] >> 2;
        if (class97.field1824 && arg2 != 0) {
            int[][] var23 = class165.field2970[0];
            var21 = var22 - (var23[var15][var17] + var23[var15][var16] + var23[var14][var17] + var23[var14][var16] >> 2);
        }
        int[][] var24 = (int[][]) null;
        if (arg7) {
            var24 = class255.field4550[0];
        } else if (arg2 < 3) {
            var24 = class165.field2970[arg2 + 1];
        }
        long var25 = (long) (arg3 << 20 | arg4 << 14 | arg1 | arg10 << 7 | 0x40000000);
        if (var11.field4744 == 0 || arg7) {
            var25 |= Long.MIN_VALUE;
        }
        if (var11.field4732 == 1) {
            var25 |= 0x400000L;
        }
        if (arg6 != -104) {
            method195((String) null, true);
        }
        if (var11.field4762) {
            var25 |= 0x80000000L;
        }
        long var27 = var25 | (long) arg9 << 32;
        if (var11.method1888(arg6 + 104)) {
            class311.method2212(arg1, (byte) -82, (class239) null, arg8, arg3, arg10, (class102) null, var11);
        }
        boolean var29 = !arg7 & var11.field4715;
        if (arg4 == 22) {
            if (class202.field3608 || var11.field4744 != 0 || var11.field4704 == 1 || var11.field4696) {
                class108 var77;
                if (var11.field4698 == -1 && var11.field4760 == null && !var11.field4734) {
                    class192 var76 = var11.method1886(var29, arg3, -13359, var18, var19, arg5, 22, (class158) null, var22, var20, var24);
                    if (class97.field1824 && var29) {
                        class160.method1263(var76.field3465, var19, var21, var20);
                    }
                    var77 = var76.field3474;
                } else {
                    var77 = new class216(arg9, 22, arg3, arg2, arg1, arg10, var11.field4698, var11.field4701, (class108) null);
                }
                class112.method911(arg8, arg1, arg10, var22, var77, var27, var11.field4757);
                if (var11.field4704 == 1 && arg0 != null) {
                    arg0.method971(arg10, -123, arg1);
                }
            }
        } else if (arg4 == 10 || arg4 == 11) {
            class108 var71;
            if (var11.field4698 == -1 && var11.field4760 == null && !var11.field4734) {
                class192 var70 = var11.method1886(var29, arg4 == 11 ? arg3 + 4 : arg3, -13359, var18, var19, arg5, 10, (class158) null, var22, var20, var24);
                if (class97.field1824 && var29) {
                    class160.method1263(var70.field3465, var19, var21, var20);
                }
                var71 = var70.field3474;
            } else {
                var71 = new class216(arg9, 10, arg4 == 11 ? arg3 + 4 : arg3, arg2, arg1, arg10, var11.field4698, var11.field4701, (class108) null);
            }
            if (var71 != null) {
                boolean var72 = class250.method1788(arg8, arg1, arg10, var22, var12, var13, var71, 0, var27);
                if (var11.field4731 && var72 && arg5) {
                    int var73 = 15;
                    if (var71 instanceof class19) {
                        var73 = ((class19) var71).method162() / 4;
                        if (var73 > 30) {
                            var73 = 30;
                        }
                    }
                    for (int var74 = 0; var74 <= var12; var74++) {
                        for (int var75 = 0; var75 <= var13; var75++) {
                            if (var73 > class223.field3955[arg8][arg1 + var74][arg10 + var75]) {
                                class223.field3955[arg8][arg1 + var74][arg10 + var75] = (byte) var73;
                            }
                        }
                    }
                }
            }
            if (var11.field4704 != 0 && arg0 != null) {
                arg0.method976(var12, arg6 ^ 0x1B, var13, var11.field4751, arg10, arg1);
            }
        } else if (arg4 >= 12) {
            class108 var31;
            if (var11.field4698 == -1 && var11.field4760 == null && !var11.field4734) {
                class192 var30 = var11.method1886(var29, arg3, -13359, var18, var19, arg5, arg4, (class158) null, var22, var20, var24);
                if (class97.field1824 && var29) {
                    class160.method1263(var30.field3465, var19, var21, var20);
                }
                var31 = var30.field3474;
            } else {
                var31 = new class216(arg9, arg4, arg3, arg2, arg1, arg10, var11.field4698, var11.field4701, (class108) null);
            }
            class250.method1788(arg8, arg1, arg10, var22, 1, 1, var31, 0, var27);
            if (arg5 && arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg8 > 0) {
                class184.field3369[arg8][arg1][arg10] = class301.method2139(class184.field3369[arg8][arg1][arg10], 4);
            }
            if (var11.field4704 != 0 && arg0 != null) {
                arg0.method976(var12, arg6 ^ 0x18, var13, var11.field4751, arg10, arg1);
            }
        } else if (arg4 == 0) {
            class108 var33;
            if (var11.field4698 == -1 && var11.field4760 == null && !var11.field4734) {
                class192 var32 = var11.method1886(var29, arg3, -13359, var18, var19, arg5, 0, (class158) null, var22, var20, var24);
                if (class97.field1824 && var29) {
                    class160.method1263(var32.field3465, var19, var21, var20);
                }
                var33 = var32.field3474;
            } else {
                var33 = new class216(arg9, 0, arg3, arg2, arg1, arg10, var11.field4698, var11.field4701, (class108) null);
            }
            class121.method958(arg8, arg1, arg10, var22, var33, (class108) null, class279.field4926[arg3], 0, var27);
            if (arg5) {
                if (arg3 == 0) {
                    if (var11.field4731) {
                        class223.field3955[arg8][arg1][arg10] = 50;
                        class223.field3955[arg8][arg1][arg10 + 1] = 50;
                    }
                    if (var11.field4736) {
                        class184.field3369[arg8][arg1][arg10] = class301.method2139(class184.field3369[arg8][arg1][arg10], 1);
                    }
                } else if (arg3 == 1) {
                    if (var11.field4731) {
                        class223.field3955[arg8][arg1][arg10 + 1] = 50;
                        class223.field3955[arg8][arg1 + 1][arg10 + 1] = 50;
                    }
                    if (var11.field4736) {
                        class184.field3369[arg8][arg1][arg10 + 1] = class301.method2139(class184.field3369[arg8][arg1][arg10 + 1], 2);
                    }
                } else if (arg3 == 2) {
                    if (var11.field4731) {
                        class223.field3955[arg8][arg1 + 1][arg10] = 50;
                        class223.field3955[arg8][arg1 + 1][arg10 + 1] = 50;
                    }
                    if (var11.field4736) {
                        class184.field3369[arg8][arg1 + 1][arg10] = class301.method2139(class184.field3369[arg8][arg1 + 1][arg10], 1);
                    }
                } else if (arg3 == 3) {
                    if (var11.field4731) {
                        class223.field3955[arg8][arg1][arg10] = 50;
                        class223.field3955[arg8][arg1 + 1][arg10] = 50;
                    }
                    if (var11.field4736) {
                        class184.field3369[arg8][arg1][arg10] = class301.method2139(class184.field3369[arg8][arg1][arg10], 2);
                    }
                }
            }
            if (var11.field4704 != 0 && arg0 != null) {
                arg0.method982(arg1, arg6 ^ 0xFFFFFF18, var11.field4751, arg10, arg4, arg3);
            }
            if (var11.field4693 != 16) {
                class37.method330(arg8, arg1, arg10, var11.field4693);
            }
        } else if (arg4 == 1) {
            class108 var35;
            if (var11.field4698 == -1 && var11.field4760 == null && !var11.field4734) {
                class192 var34 = var11.method1886(var29, arg3, arg6 - 13255, var18, var19, arg5, 1, (class158) null, var22, var20, var24);
                if (class97.field1824 && var29) {
                    class160.method1263(var34.field3465, var19, var21, var20);
                }
                var35 = var34.field3474;
            } else {
                var35 = new class216(arg9, 1, arg3, arg2, arg1, arg10, var11.field4698, var11.field4701, (class108) null);
            }
            class121.method958(arg8, arg1, arg10, var22, var35, (class108) null, class275.field4881[arg3], 0, var27);
            if (var11.field4731 && arg5) {
                if (arg3 == 0) {
                    class223.field3955[arg8][arg1][arg10 + 1] = 50;
                } else if (arg3 == 1) {
                    class223.field3955[arg8][arg1 + 1][arg10 + 1] = 50;
                } else if (arg3 == 2) {
                    class223.field3955[arg8][arg1 + 1][arg10] = 50;
                } else if (arg3 == 3) {
                    class223.field3955[arg8][arg1][arg10] = 50;
                }
            }
            if (var11.field4704 != 0 && arg0 != null) {
                arg0.method982(arg1, arg6 ^ 0xFFFFFF18, var11.field4751, arg10, arg4, arg3);
            }
        } else if (arg4 == 2) {
            int var65 = arg3 + 1 & 0x3;
            class108 var67;
            class108 var69;
            if (var11.field4698 == -1 && var11.field4760 == null && !var11.field4734) {
                class192 var66 = var11.method1886(var29, arg3 + 4, -13359, var18, var19, arg5, 2, (class158) null, var22, var20, var24);
                if (class97.field1824 && var29) {
                    class160.method1263(var66.field3465, var19, var21, var20);
                }
                var67 = var66.field3474;
                class192 var68 = var11.method1886(var29, var65, -13359, var18, var19, arg5, 2, (class158) null, var22, var20, var24);
                if (class97.field1824 && var29) {
                    class160.method1263(var68.field3465, var19, var21, var20);
                }
                var69 = var68.field3474;
            } else {
                var67 = new class216(arg9, 2, arg3 + 4, arg2, arg1, arg10, var11.field4698, var11.field4701, (class108) null);
                var69 = new class216(arg9, 2, var65, arg2, arg1, arg10, var11.field4698, var11.field4701, (class108) null);
            }
            class121.method958(arg8, arg1, arg10, var22, var67, var69, class279.field4926[arg3], class279.field4926[var65], var27);
            if (var11.field4736 && arg5) {
                if (arg3 == 0) {
                    class184.field3369[arg8][arg1][arg10] = class301.method2139(class184.field3369[arg8][arg1][arg10], 1);
                    class184.field3369[arg8][arg1][arg10 + 1] = class301.method2139(class184.field3369[arg8][arg1][arg10 + 1], 2);
                } else if (arg3 == 1) {
                    class184.field3369[arg8][arg1][arg10 + 1] = class301.method2139(class184.field3369[arg8][arg1][arg10 + 1], 2);
                    class184.field3369[arg8][arg1 + 1][arg10] = class301.method2139(class184.field3369[arg8][arg1 + 1][arg10], 1);
                } else if (arg3 == 2) {
                    class184.field3369[arg8][arg1 + 1][arg10] = class301.method2139(class184.field3369[arg8][arg1 + 1][arg10], 1);
                    class184.field3369[arg8][arg1][arg10] = class301.method2139(class184.field3369[arg8][arg1][arg10], 2);
                } else if (arg3 == 3) {
                    class184.field3369[arg8][arg1][arg10] = class301.method2139(class184.field3369[arg8][arg1][arg10], 2);
                    class184.field3369[arg8][arg1][arg10] = class301.method2139(class184.field3369[arg8][arg1][arg10], 1);
                }
            }
            if (var11.field4704 != 0 && arg0 != null) {
                arg0.method982(arg1, 128, var11.field4751, arg10, arg4, arg3);
            }
            if (var11.field4693 != 16) {
                class37.method330(arg8, arg1, arg10, var11.field4693);
            }
        } else if (arg4 == 3) {
            class108 var37;
            if (var11.field4698 == -1 && var11.field4760 == null && !var11.field4734) {
                class192 var36 = var11.method1886(var29, arg3, -13359, var18, var19, arg5, 3, (class158) null, var22, var20, var24);
                if (class97.field1824 && var29) {
                    class160.method1263(var36.field3465, var19, var21, var20);
                }
                var37 = var36.field3474;
            } else {
                var37 = new class216(arg9, 3, arg3, arg2, arg1, arg10, var11.field4698, var11.field4701, (class108) null);
            }
            class121.method958(arg8, arg1, arg10, var22, var37, (class108) null, class275.field4881[arg3], 0, var27);
            if (var11.field4731 && arg5) {
                if (arg3 == 0) {
                    class223.field3955[arg8][arg1][arg10 + 1] = 50;
                } else if (arg3 == 1) {
                    class223.field3955[arg8][arg1 + 1][arg10 + 1] = 50;
                } else if (arg3 == 2) {
                    class223.field3955[arg8][arg1 + 1][arg10] = 50;
                } else if (arg3 == 3) {
                    class223.field3955[arg8][arg1][arg10] = 50;
                }
            }
            if (var11.field4704 != 0 && arg0 != null) {
                arg0.method982(arg1, arg6 + 232, var11.field4751, arg10, arg4, arg3);
            }
        } else if (arg4 == 9) {
            class108 var39;
            if (var11.field4698 == -1 && var11.field4760 == null && !var11.field4734) {
                class192 var38 = var11.method1886(var29, arg3, -13359, var18, var19, arg5, arg4, (class158) null, var22, var20, var24);
                if (class97.field1824 && var29) {
                    class160.method1263(var38.field3465, var19, var21, var20);
                }
                var39 = var38.field3474;
            } else {
                var39 = new class216(arg9, arg4, arg3, arg2, arg1, arg10, var11.field4698, var11.field4701, (class108) null);
            }
            class250.method1788(arg8, arg1, arg10, var22, 1, 1, var39, 0, var27);
            if (var11.field4704 != 0 && arg0 != null) {
                arg0.method976(var12, -127, var13, var11.field4751, arg10, arg1);
            }
            if (var11.field4693 != 16) {
                class37.method330(arg8, arg1, arg10, var11.field4693);
            }
        } else if (arg4 == 4) {
            class108 var41;
            if (var11.field4698 == -1 && var11.field4760 == null && !var11.field4734) {
                class192 var40 = var11.method1886(var29, arg3, -13359, var18, var19, arg5, 4, (class158) null, var22, var20, var24);
                if (class97.field1824 && var29) {
                    class160.method1263(var40.field3465, var19, var21, var20);
                }
                var41 = var40.field3474;
            } else {
                var41 = new class216(arg9, 4, arg3, arg2, arg1, arg10, var11.field4698, var11.field4701, (class108) null);
            }
            class126.method1012(arg8, arg1, arg10, var22, var41, (class108) null, class279.field4926[arg3], 0, 0, 0, var27);
        } else if (arg4 == 5) {
            int var60 = 16;
            long var61 = class102.method861(arg8, arg1, arg10);
            if (var61 != 0L) {
                var60 = class252.method1808((int) (var61 >>> 32) & Integer.MAX_VALUE, (byte) 4).field4693;
            }
            class108 var64;
            if (var11.field4698 == -1 && var11.field4760 == null && !var11.field4734) {
                class192 var63 = var11.method1886(var29, arg3, -13359, var18, var19, arg5, 4, (class158) null, var22, var20, var24);
                if (class97.field1824 && var29) {
                    class160.method1263(var63.field3465, var19 - (class125.field2276[arg3] * 8), var21, var20 - (class81.field1560[arg3] * 8));
                }
                var64 = var63.field3474;
            } else {
                var64 = new class216(arg9, 4, arg3, arg2, arg1, arg10, var11.field4698, var11.field4701, (class108) null);
            }
            class126.method1012(arg8, arg1, arg10, var22, var64, (class108) null, class279.field4926[arg3], 0, class125.field2276[arg3] * var60, class81.field1560[arg3] * var60, var27);
        } else if (arg4 == 6) {
            int var55 = 8;
            long var56 = class102.method861(arg8, arg1, arg10);
            if (var56 != 0L) {
                var55 = class252.method1808((int) (var56 >>> 32) & Integer.MAX_VALUE, (byte) 4).field4693 / 2;
            }
            class108 var59;
            if (var11.field4698 == -1 && var11.field4760 == null && !var11.field4734) {
                class192 var58 = var11.method1886(var29, arg3 + 4, arg6 + -13255, var18, var19, arg5, 4, (class158) null, var22, var20, var24);
                if (class97.field1824 && var29) {
                    class160.method1263(var58.field3465, var19 - (class24.field611[arg3] * 8), var21, var20 - (class54.field1188[arg3] * 8));
                }
                var59 = var58.field3474;
            } else {
                var59 = new class216(arg9, 4, arg3 + 4, arg2, arg1, arg10, var11.field4698, var11.field4701, (class108) null);
            }
            class126.method1012(arg8, arg1, arg10, var22, var59, (class108) null, 256, arg3, class24.field611[arg3] * var55, class54.field1188[arg3] * var55, var27);
        } else if (arg4 == 7) {
            int var42 = arg3 + 2 & 0x3;
            class108 var44;
            if (var11.field4698 == -1 && var11.field4760 == null && !var11.field4734) {
                class192 var43 = var11.method1886(var29, var42 + 4, -13359, var18, var19, arg5, 4, (class158) null, var22, var20, var24);
                if (class97.field1824 && var29) {
                    class160.method1263(var43.field3465, var19, var21, var20);
                }
                var44 = var43.field3474;
            } else {
                var44 = new class216(arg9, 4, var42 + 4, arg2, arg1, arg10, var11.field4698, var11.field4701, (class108) null);
            }
            class126.method1012(arg8, arg1, arg10, var22, var44, (class108) null, 256, var42, 0, 0, var27);
        } else if (arg4 == 8) {
            int var45 = 8;
            long var46 = class102.method861(arg8, arg1, arg10);
            if (var46 != 0L) {
                var45 = class252.method1808((int) (var46 >>> 32) & Integer.MAX_VALUE, (byte) 4).field4693 / 2;
            }
            int var48 = arg3 + 2 & 0x3;
            class108 var52;
            class108 var54;
            if (var11.field4698 == -1 && var11.field4760 == null && !var11.field4734) {
                int var49 = class54.field1188[arg3] * 8;
                int var50 = class24.field611[arg3] * 8;
                class192 var51 = var11.method1886(var29, arg3 + 4, -13359, var18, var19, arg5, 4, (class158) null, var22, var20, var24);
                if (class97.field1824 && var29) {
                    class160.method1263(var51.field3465, var19 - var50, var21, var20 - var49);
                }
                var52 = var51.field3474;
                class192 var53 = var11.method1886(var29, var48 + 4, -13359, var18, var19, arg5, 4, (class158) null, var22, var20, var24);
                if (class97.field1824 && var29) {
                    class160.method1263(var53.field3465, var19 - var50, var21, var20 - var49);
                }
                var54 = var53.field3474;
            } else {
                var52 = new class216(arg9, 4, arg3 + 4, arg2, arg1, arg10, var11.field4698, var11.field4701, (class108) null);
                var54 = new class216(arg9, 4, var48 + 4, arg2, arg1, arg10, var11.field4698, var11.field4701, (class108) null);
            }
            class126.method1012(arg8, arg1, arg10, var22, var52, var54, 256, arg3, class24.field611[arg3] * var45, class54.field1188[arg3] * var45, var27);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z)Lom;", line = 673)
    public static final class70 method192(boolean arg0) {
        field572++;
        int var1 = class115.field2097[0] * class1.field92[0];
        byte[] var2 = class113.field2080[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class217.field3839[class52.method442(255, var2[var4])];
        }
        class70 var5;
        if (class97.field1824) {
            var5 = new class203(class86.field1646, class111.field2045, class44.field915[0], class216.field3811[0], class1.field92[0], class115.field2097[0], var3);
        } else {
            var5 = new class66(class86.field1646, class111.field2045, class44.field915[0], class216.field3811[0], class1.field92[0], class115.field2097[0], var3);
        }
        class162.method1278(arg0);
        return var5;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILud;)I", line = 707)
    public static final int method193(int arg0, class279 arg1) {
        if (arg0 >= -26) {
            method196(-24);
        }
        field568++;
        return arg1.method1984(8) + 1;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ZIIIIIIIIII)V", line = 719)
    public static final void method194(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field575++;
        int var11 = arg6 - arg1;
        int var12 = arg9 - arg5;
        if (class121.field2180 > arg9) {
            var12++;
        }
        if (arg6 < class166.field3007) {
            var11++;
        }
        int var10000;
        for (int var13 = 0; var13 < var12; var13++) {
            int var14 = arg7 * var13 + arg4 >> 16;
            int var15 = (var13 + 1) * arg7 + arg4 >> 16;
            int var16 = var15 - var14;
            if (var16 > 0) {
                int var17 = arg5 + var13 >> 6;
                if (var17 >= 0 && class232.field4067.length - 1 >= var17) {
                    int var18 = arg10 + var14;
                    int var19 = arg10 + var15;
                    byte[][] var20 = class62.field1280[var17];
                    int[][] var21 = class232.field4067[var17];
                    byte[][] var22 = class7.field141[var17];
                    byte[][] var23 = class318.field5580[var17];
                    byte[][] var24 = class247.field4397[var17];
                    byte[][] var25 = class231.field4048[var17];
                    for (int var26 = 0; var26 < var11; var26++) {
                        int var27 = (var26 + 1) * arg3 + arg8 >> 16;
                        int var28 = arg3 * var26 + arg8 >> 16;
                        int var29 = var27 - var28;
                        if (var29 > 0) {
                            int var30 = arg2 + var28;
                            int var31 = arg2 + var27;
                            int var32 = arg1 + var26 & 0x3F;
                            int var33 = var26 + arg1 >> 6;
                            int var34 = var13 + arg5 & 0x3F;
                            int var35 = (var32 << 6) + var34;
                            int var36;
                            if (var33 < 0 || (var21.length - 1) < var33 || var21[var33] == null) {
                                if (class85.field1609.field892 != -1) {
                                    var36 = class85.field1609.field892;
                                } else if ((arg1 + var26 & 0x4) == (arg5 + var13 & 0x4)) {
                                    var36 = class102.field1923[class185.field3395 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var33 < 0 || (var21.length - 1) < var33) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class146.method1110(var18, var30, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var21[var33][var35];
                            }
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            int var37 = var22[var33] == null ? 0 : class102.field1923[var22[var33][var35] & 0xFF];
                            int var38 = var23[var33] == null ? 0 : class102.field1923[var23[var33][var35] & 0xFF];
                            if (var37 == 0 && var38 == 0) {
                                class146.method1110(var18, var30, var16, var29, var36);
                            } else {
                                if (var37 != 0) {
                                    if (var37 == -1) {
                                        var37 = 1;
                                    }
                                    byte var39 = var20[var33] == null ? 0 : var20[var33][var35];
                                    int var40 = var39 & 0xFC;
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class146.method1110(var18, var30, var16, var29, var37);
                                    } else {
                                        class73.method638(!arg0, class146.field2637, var18, var37, var40 >> 2, true, var39 & 0x3, var30, var36, var29, var16);
                                    }
                                }
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = var36;
                                    }
                                    byte var41 = var24[var33][var35];
                                    int var42 = var41 & 0xFC;
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class146.method1110(var18, var30, var16, var29, var38);
                                    }
                                    class73.method638(true, class146.field2637, var18, var38, var42 >> 2, var37 == 0, var41 & 0x3, var30, 0, var29, var16);
                                }
                            }
                            if (var25[var33] != null) {
                                int var43 = var25[var33][var35] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var16 == 1) {
                                        var44 = var18;
                                    } else {
                                        var44 = var19 - 1;
                                    }
                                    int var45;
                                    if (var29 == 1) {
                                        var45 = var30;
                                    } else {
                                        var45 = var31 - 1;
                                    }
                                    int var46 = 13421772;
                                    if (var43 >= 5 && var43 <= 8 || var43 >= 13 && var43 <= 16 || var43 >= 21 && var43 <= 24 || var43 == 27 || var43 == 28) {
                                        var43 -= 4;
                                        var46 = 13369344;
                                    }
                                    if (var43 == 1) {
                                        class146.method1115(var18, var30, var29, var46);
                                    } else if (var43 == 2) {
                                        class146.method1121(var18, var30, var16, var46);
                                    } else if (var43 == 3) {
                                        class146.method1115(var44, var30, var29, var46);
                                    } else if (var43 == 4) {
                                        class146.method1121(var18, var45, var16, var46);
                                    } else if (var43 == 9) {
                                        class146.method1115(var18, var30, var29, 16777215);
                                        class146.method1121(var18, var30, var16, var46);
                                    } else if (var43 == 10) {
                                        class146.method1115(var44, var30, var29, 16777215);
                                        class146.method1121(var18, var30, var16, var46);
                                    } else if (var43 == 11) {
                                        class146.method1115(var44, var30, var29, 16777215);
                                        class146.method1121(var18, var45, var16, var46);
                                    } else if (var43 == 12) {
                                        class146.method1115(var18, var30, var29, 16777215);
                                        class146.method1121(var18, var45, var16, var46);
                                    } else if (var43 == 17) {
                                        class146.method1121(var18, var30, 1, var46);
                                    } else if (var43 == 18) {
                                        class146.method1121(var44, var30, 1, var46);
                                    } else if (var43 == 19) {
                                        class146.method1121(var44, var45, 1, var46);
                                    } else if (var43 == 20) {
                                        class146.method1121(var18, var45, 1, var46);
                                    } else if (var43 == 25) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class146.method1121(var18 + var47, -var47 + var45, 1, var46);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class146.method1121(var18 + var48, var30 + var48, 1, var46);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var49 = arg10 + var14;
                    for (int var50 = 0; var50 < var11; var50++) {
                        int var51;
                        if (class85.field1609.field892 != -1) {
                            var51 = class85.field1609.field892;
                        } else if ((var50 + arg1 & 0x4) == (arg5 + var13 & 0x4)) {
                            var51 = class102.field1923[class185.field3395 + 1];
                        } else {
                            var51 = 4936552;
                        }
                        int var52 = (arg3 * var50 + arg8 >> 16) + arg2;
                        int var53 = ((var50 + 1) * arg3 + arg8 >> 16) + arg2;
                        int var54 = var53 - var52;
                        if (var51 == 0) {
                            var51 = 1;
                        }
                        class146.method1110(var49, var52, var16, var54, var51);
                    }
                    var10000 = arg10 + var15;
                }
            }
        }
        if (arg0) {
            method195((String) null, false);
        }
        for (int var56 = -2; var56 < var12 + 2; var56++) {
            int var57 = arg7 * var56 + arg4 >> 16;
            int var58 = (var56 + 1) * arg7 + arg4 >> 16;
            int var59 = var58 - var57;
            if (var59 > 0) {
                int var60 = arg5 + var56 >> 6;
                var10000 = arg10 + var58;
                int var62 = arg10 + var57;
                if (var60 >= 0 && var60 <= class306.field5440.length - 1) {
                    int[][] var63 = class306.field5440[var60];
                    for (int var64 = -2; var64 < var11 + 2; var64++) {
                        int var65 = arg8 + (arg3 * var64) >> 16;
                        int var66 = (var64 + 1) * arg3 + arg8 >> 16;
                        int var67 = var66 - var65;
                        if (var67 > 0) {
                            var10000 = arg2 + var66;
                            int var69 = arg2 + var65;
                            int var70 = arg1 + var64 >> 6;
                            if (var70 >= 0 && var63.length - 1 >= var70) {
                                int var71 = ((arg1 + var64 & 0x3F) << 6) + (var56 + arg5 & 0x3F);
                                if (var63[var70] != null) {
                                    int var72 = var63[var70][var71];
                                    int var73 = var72 & 0x3FFF;
                                    if (var73 != 0) {
                                        int var74 = (var72 & 0xF5BE) >> 14;
                                        class142 var75 = class85.method735((byte) -83, var73 - 1);
                                        class158 var76 = var75.method1089(95, var74);
                                        if (var76 != null) {
                                            int var77 = var76.field1041 * var59 / 4;
                                            int var78 = var76.field1027 * var67 / 4;
                                            if (var75.field2574) {
                                                int var79 = var72 >> 16 & 0xF;
                                                int var80 = var72 >> 20 & 0xF;
                                                if ((var74 & 0x1) == 1) {
                                                    int var81 = var79;
                                                    var79 = var80;
                                                    var80 = var81;
                                                }
                                                var77 = var59 * var79;
                                                var78 = var67 * var80;
                                            }
                                            if (var77 != 0 && var78 != 0) {
                                                if (var75.field2581 == 0) {
                                                    var76.method1247(var62, var69 + var67 - var78, var77, var78);
                                                } else {
                                                    var76.method1241(var62, var69 - (var78 - var67), var77, var78, var75.field2581);
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

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 1141)
    public static final void method195(String arg0, boolean arg1) {
        field570++;
        if (!arg1) {
            field576 = (class282) null;
        }
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)I", line = 1178)
    public static final int method196(int arg0) {
        field571++;
        if (class120.field2159 != null) {
            return 3;
        } else if (class97.field1824 && class290.field5162) {
            return 2;
        } else if (class97.field1824 && !class290.field5162) {
            return 1;
        } else {
            if (arg0 != 3) {
                method192(true);
            }
            return 0;
        }
    }
}
