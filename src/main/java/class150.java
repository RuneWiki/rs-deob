import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class150 extends class175 {

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "Ljh;")
    private class241 field2409;

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "[Lse;")
    public static class10[] field2401 = new class10[14];

    @OriginalMember(owner = "client!eh", name = "G", descriptor = "I")
    public static int field2407 = -1;

    @OriginalMember(owner = "client!eh", name = "I", descriptor = "[J")
    public static long[] field2408 = new long[256];

    @OriginalMember(owner = "client!eh", name = "y", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!eh", name = "A", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!eh", name = "B", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!eh", name = "C", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!eh", name = "D", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!eh", name = "E", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!eh", name = "K", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!eh", name = "L", descriptor = "[I")
    public static int[] field2411;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "(I)V")
    public static final void method1015(int arg0) {
        class150 var1 = (class150) class228.field3626.method365(3);
        field2405++;
        while (var1 != null) {
            class241 var2 = var1.field2409;
            if (class28.field336 != var2.field3876 || var2.field3867) {
                var1.method544(-97);
            } else if (var2.field3874 <= class9.field141) {
                var2.method1590(-50, class221.field3524);
                if (var2.field3867) {
                    var1.method544(102);
                } else {
                    class147.method1004(var2.field3876, var2.field3861, var2.field3868, var2.field3871, 60, var2, 0, -1L, false);
                }
            }
            var1 = (class150) class228.field3626.method372((byte) 7);
        }
        if (arg0 != 0) {
            method1019((byte) 8);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IZ)Lam;")
    public static final class229 method1016(int arg0, boolean arg1) {
        field2400++;
        class229 var2 = (class229) class12.field166.method1839((byte) 112, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (!arg1) {
            field2407 = 100;
        }
        byte[] var3 = class173.field2803.method940((byte) 81, arg0, 29);
        class229 var4 = new class229();
        if (var3 != null) {
            var4.method1519(new class264(var3), arg0, (byte) -108);
        }
        class12.field166.method1830((long) arg0, -121, var4);
        return var4;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)Lf;")
    public static final class221 method1017(int arg0, int arg1) {
        field2404++;
        class221 var2 = (class221) class202.field3239.method1839((byte) 94, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class30.field367.method940((byte) 91, arg0, 16);
        class221 var4 = new class221();
        if (var3 != null) {
            var4.method1466(new class264(var3), 0);
        }
        class202.field3239.method1830((long) arg0, arg1 - 105, var4);
        if (arg1 != 0) {
            method1021(false, -57, -9, 115, false, -37, -32, 25, 104, 81, (class281) null);
        }
        return var4;
    }

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "(I)V")
    public static void method1018(int arg0) {
        if (arg0 != 0) {
            field2407 = -75;
        }
        field2408 = null;
        field2401 = null;
        field2411 = null;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)V")
    public static final void method1019(byte arg0) {
        field2410++;
        if (arg0 <= 126) {
            field2401 = null;
        }
        class168.field2730.method1831(-120);
        class263.field4165.method1831(-121);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lok;I)V")
    public static final void method1020(class135 arg0, int arg1) {
        if (arg0.field2254 != null) {
            arg0.field2254.field375 = 0;
        }
        field2402++;
        arg0.field2257 = false;
        int var2 = -33 % ((60 - arg1) / 33);
        for (class135 var3 = arg0.method262(); var3 != null; var3 = arg0.method245()) {
            method1020(var3, 116);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZIIIZIIIIILpi;)V")
    public static final void method1021(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class281 arg10) {
        field2406++;
        if (arg4 && !class200.method1349(false) && (class134.field2251[0][arg5][arg3] & 0x2) == 0) {
            if ((class134.field2251[arg1][arg5][arg3] & 0x10) != 0) {
                return;
            }
            if (class140.method958(0, arg1, arg5, arg3) != class109.field1891) {
                return;
            }
        }
        if (arg6 <= 63) {
            field2401 = null;
        }
        if (arg1 < class184.field2945) {
            class184.field2945 = arg1;
        }
        class94 var11 = class119.method842(-42, arg8);
        int var12;
        int var13;
        if (arg2 == 1 || arg2 == 3) {
            var12 = var11.field1334;
            var13 = var11.field1340;
        } else {
            var12 = var11.field1340;
            var13 = var11.field1334;
        }
        int var14;
        int var15;
        if (arg5 + var13 <= 104) {
            var14 = (var13 + 1 >> 1) + arg5;
            var15 = (var13 >> 1) + arg5;
        } else {
            var15 = arg5;
            var14 = arg5 + 1;
        }
        int[][] var16 = class229.field3641[arg7];
        int var17;
        int var18;
        if ((arg3 + var12) > 104) {
            var17 = arg3;
            var18 = arg3 + 1;
        } else {
            var18 = (var12 + 1 >> 1) + arg3;
            var17 = (var12 >> 1) + arg3;
        }
        int var19 = var16[var15][var17] + var16[var14][var17] - (-var16[var15][var18] - var16[var14][var18]) >> 2;
        int var20 = (arg5 << 7) + (var13 << 6);
        int var21 = (arg3 << 7) + (var12 << 6);
        int[][] var22 = null;
        long var23 = (long) (arg3 | 0x800000 << 7 | arg5 | arg9 << 14 | arg2 << 20);
        if (var11.field1360 == 0 || arg0) {
            var23 |= Long.MIN_VALUE;
        }
        if (arg0) {
            var22 = class34.field423[0];
        } else if (arg7 < 3) {
            var22 = class229.field3641[arg7 + 1];
        }
        if (var11.field1414 == 1) {
            var23 |= 0x400000L;
        }
        if (var11.field1332) {
            var23 |= 0x80000000L;
        }
        long var25 = var23 | (long) arg8 << 32;
        if (var11.method668((byte) -112)) {
            class142.method963(arg5, arg3, var11, arg2, arg1, (class275) null, 128, (class235) null);
        }
        boolean var27 = var11.field1361 & !arg0;
        if (arg9 == 22) {
            if (class205.field3279 || var11.field1360 != 0 || var11.field1355 == 1 || var11.field1342) {
                class197 var29;
                if (var11.field1394 == -1 && var11.field1378 == null && var11.field1345 == null && !var11.field1413) {
                    class6 var28 = var11.method664(var27, 22, arg4, var20, 0, var22, arg2, var21, var19, var16, (class68) null);
                    var29 = var28.field71;
                } else {
                    var29 = new class287(arg8, 22, arg2, arg7, arg5, arg3, -1, var11.field1335, (class197) null);
                }
                class83.method605(arg1, arg5, arg3, var19, var29, var25, var11.field1363);
                if (var11.field1355 == 1 && arg10 != null) {
                    arg10.method1888(arg3, -110, arg5);
                }
            }
        } else if (arg9 == 10 || arg9 == 11) {
            class197 var69;
            if (var11.field1394 == -1 && var11.field1378 == null && var11.field1345 == null && !var11.field1413) {
                class6 var68 = var11.method664(var27, 10, arg4, var20, 0, var22, arg9 == 11 ? arg2 + 4 : arg2, var21, var19, var16, (class68) null);
                var69 = var68.field71;
            } else {
                var69 = new class287(arg8, 10, arg9 == 11 ? arg2 + 4 : arg2, arg7, arg5, arg3, -1, var11.field1335, (class197) null);
            }
            if (var69 != null) {
                boolean var70 = class256.method1684(arg1, arg5, arg3, var19, var13, var12, var69, 0, var25);
                if (var11.field1384 && var70 && arg4) {
                    int var71 = 15;
                    if (var69 instanceof class13) {
                        var71 = ((class13) var69).method94() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var13; var72++) {
                        for (int var73 = 0; var73 <= var12; var73++) {
                            if (var71 > class109.field1896[arg1][arg5 + var72][arg3 + var73]) {
                                class109.field1896[arg1][arg5 + var72][arg3 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var11.field1355 != 0 && arg10 != null) {
                arg10.method1875(arg5, var11.field1390, !var11.field1375, var13, (byte) 83, arg3, var12);
            }
        } else if (arg9 >= 12) {
            class197 var31;
            if (var11.field1394 == -1 && var11.field1378 == null && var11.field1345 == null && !var11.field1413) {
                class6 var30 = var11.method664(var27, arg9, arg4, var20, 0, var22, arg2, var21, var19, var16, (class68) null);
                var31 = var30.field71;
            } else {
                var31 = new class287(arg8, arg9, arg2, arg7, arg5, arg3, -1, var11.field1335, (class197) null);
            }
            class256.method1684(arg1, arg5, arg3, var19, 1, 1, var31, 0, var25);
            if (arg4 && arg9 >= 12 && arg9 <= 17 && arg9 != 13 && arg1 > 0 && var11.field1410 != 0) {
                class116.field1983[arg1][arg5][arg3] = class45.method348(class116.field1983[arg1][arg5][arg3], 4);
            }
            if (var11.field1355 != 0 && arg10 != null) {
                arg10.method1875(arg5, var11.field1390, !var11.field1375, var13, (byte) 83, arg3, var12);
            }
        } else if (arg9 == 0) {
            class197 var33;
            if (var11.field1394 == -1 && var11.field1378 == null && var11.field1345 == null && !var11.field1413) {
                class6 var32 = var11.method664(var27, 0, arg4, var20, 0, var22, arg2, var21, var19, var16, (class68) null);
                var33 = var32.field71;
            } else {
                var33 = new class287(arg8, 0, arg2, arg7, arg5, arg3, -1, var11.field1335, (class197) null);
            }
            class280.method1869(arg1, arg5, arg3, var19, var33, (class197) null, class242.field3887[arg2], 0, var25);
            if (arg4) {
                if (arg2 == 0) {
                    if (var11.field1384) {
                        class109.field1896[arg1][arg5][arg3] = 50;
                        class109.field1896[arg1][arg5][arg3 + 1] = 50;
                    }
                    if (var11.field1410 == 1) {
                        class116.field1983[arg1][arg5][arg3] = class45.method348(class116.field1983[arg1][arg5][arg3], 1);
                    }
                } else if (arg2 == 1) {
                    if (var11.field1384) {
                        class109.field1896[arg1][arg5][arg3 + 1] = 50;
                        class109.field1896[arg1][arg5 + 1][arg3 + 1] = 50;
                    }
                    if (var11.field1410 == 1) {
                        class116.field1983[arg1][arg5][arg3 + 1] = class45.method348(class116.field1983[arg1][arg5][arg3 + 1], 2);
                    }
                } else if (arg2 == 2) {
                    if (var11.field1384) {
                        class109.field1896[arg1][arg5 + 1][arg3] = 50;
                        class109.field1896[arg1][arg5 + 1][arg3 + 1] = 50;
                    }
                    if (var11.field1410 == 1) {
                        class116.field1983[arg1][arg5 + 1][arg3] = class45.method348(class116.field1983[arg1][arg5 + 1][arg3], 1);
                    }
                } else if (arg2 == 3) {
                    if (var11.field1384) {
                        class109.field1896[arg1][arg5][arg3] = 50;
                        class109.field1896[arg1][arg5 + 1][arg3] = 50;
                    }
                    if (var11.field1410 == 1) {
                        class116.field1983[arg1][arg5][arg3] = class45.method348(class116.field1983[arg1][arg5][arg3], 2);
                    }
                }
            }
            if (var11.field1355 != 0 && arg10 != null) {
                arg10.method1878(arg3, arg5, (byte) 72, !var11.field1375, var11.field1390, arg2, arg9);
            }
            if (var11.field1354 != 16) {
                class261.method1714(arg1, arg5, arg3, var11.field1354);
            }
        } else if (arg9 == 1) {
            class197 var35;
            if (var11.field1394 == -1 && var11.field1378 == null && var11.field1345 == null && !var11.field1413) {
                class6 var34 = var11.method664(var27, 1, arg4, var20, 0, var22, arg2, var21, var19, var16, (class68) null);
                var35 = var34.field71;
            } else {
                var35 = new class287(arg8, 1, arg2, arg7, arg5, arg3, -1, var11.field1335, (class197) null);
            }
            class280.method1869(arg1, arg5, arg3, var19, var35, (class197) null, class115.field1965[arg2], 0, var25);
            if (var11.field1384 && arg4) {
                if (arg2 == 0) {
                    class109.field1896[arg1][arg5][arg3 + 1] = 50;
                } else if (arg2 == 1) {
                    class109.field1896[arg1][arg5 + 1][arg3 + 1] = 50;
                } else if (arg2 == 2) {
                    class109.field1896[arg1][arg5 + 1][arg3] = 50;
                } else if (arg2 == 3) {
                    class109.field1896[arg1][arg5][arg3] = 50;
                }
            }
            if (var11.field1355 != 0 && arg10 != null) {
                arg10.method1878(arg3, arg5, (byte) 78, !var11.field1375, var11.field1390, arg2, arg9);
            }
        } else if (arg9 == 2) {
            int var36 = arg2 + 1 & 0x3;
            class197 var38;
            class197 var40;
            if (var11.field1394 == -1 && var11.field1378 == null && var11.field1345 == null && !var11.field1413) {
                class6 var37 = var11.method664(var27, 2, arg4, var20, 0, var22, arg2 + 4, var21, var19, var16, (class68) null);
                var38 = var37.field71;
                class6 var39 = var11.method664(var27, 2, arg4, var20, 0, var22, var36, var21, var19, var16, (class68) null);
                var40 = var39.field71;
            } else {
                var38 = new class287(arg8, 2, arg2 + 4, arg7, arg5, arg3, -1, var11.field1335, (class197) null);
                var40 = new class287(arg8, 2, var36, arg7, arg5, arg3, -1, var11.field1335, (class197) null);
            }
            class280.method1869(arg1, arg5, arg3, var19, var38, var40, class242.field3887[arg2], class242.field3887[var36], var25);
            if (var11.field1410 == 1 && arg4) {
                if (arg2 == 0) {
                    class116.field1983[arg1][arg5][arg3] = class45.method348(class116.field1983[arg1][arg5][arg3], 1);
                    class116.field1983[arg1][arg5][arg3 + 1] = class45.method348(class116.field1983[arg1][arg5][arg3 + 1], 2);
                } else if (arg2 == 1) {
                    class116.field1983[arg1][arg5][arg3 + 1] = class45.method348(class116.field1983[arg1][arg5][arg3 + 1], 2);
                    class116.field1983[arg1][arg5 + 1][arg3] = class45.method348(class116.field1983[arg1][arg5 + 1][arg3], 1);
                } else if (arg2 == 2) {
                    class116.field1983[arg1][arg5 + 1][arg3] = class45.method348(class116.field1983[arg1][arg5 + 1][arg3], 1);
                    class116.field1983[arg1][arg5][arg3] = class45.method348(class116.field1983[arg1][arg5][arg3], 2);
                } else if (arg2 == 3) {
                    class116.field1983[arg1][arg5][arg3] = class45.method348(class116.field1983[arg1][arg5][arg3], 2);
                    class116.field1983[arg1][arg5][arg3] = class45.method348(class116.field1983[arg1][arg5][arg3], 1);
                }
            }
            if (var11.field1355 != 0 && arg10 != null) {
                arg10.method1878(arg3, arg5, (byte) 64, !var11.field1375, var11.field1390, arg2, arg9);
            }
            if (var11.field1354 != 16) {
                class261.method1714(arg1, arg5, arg3, var11.field1354);
            }
        } else if (arg9 == 3) {
            class197 var42;
            if (var11.field1394 == -1 && var11.field1378 == null && var11.field1345 == null && !var11.field1413) {
                class6 var41 = var11.method664(var27, 3, arg4, var20, 0, var22, arg2, var21, var19, var16, (class68) null);
                var42 = var41.field71;
            } else {
                var42 = new class287(arg8, 3, arg2, arg7, arg5, arg3, -1, var11.field1335, (class197) null);
            }
            class280.method1869(arg1, arg5, arg3, var19, var42, (class197) null, class115.field1965[arg2], 0, var25);
            if (var11.field1384 && arg4) {
                if (arg2 == 0) {
                    class109.field1896[arg1][arg5][arg3 + 1] = 50;
                } else if (arg2 == 1) {
                    class109.field1896[arg1][arg5 + 1][arg3 + 1] = 50;
                } else if (arg2 == 2) {
                    class109.field1896[arg1][arg5 + 1][arg3] = 50;
                } else if (arg2 == 3) {
                    class109.field1896[arg1][arg5][arg3] = 50;
                }
            }
            if (var11.field1355 != 0 && arg10 != null) {
                arg10.method1878(arg3, arg5, (byte) 58, !var11.field1375, var11.field1390, arg2, arg9);
            }
        } else if (arg9 == 9) {
            class197 var44;
            if (var11.field1394 == -1 && var11.field1378 == null && var11.field1345 == null && !var11.field1413) {
                class6 var43 = var11.method664(var27, arg9, arg4, var20, 0, var22, arg2, var21, var19, var16, (class68) null);
                var44 = var43.field71;
            } else {
                var44 = new class287(arg8, arg9, arg2, arg7, arg5, arg3, -1, var11.field1335, (class197) null);
            }
            class256.method1684(arg1, arg5, arg3, var19, 1, 1, var44, 0, var25);
            if (var11.field1355 != 0 && arg10 != null) {
                arg10.method1875(arg5, var11.field1390, !var11.field1375, var13, (byte) 83, arg3, var12);
            }
            if (var11.field1354 != 16) {
                class261.method1714(arg1, arg5, arg3, var11.field1354);
            }
        } else if (arg9 == 4) {
            class197 var46;
            if (var11.field1394 == -1 && var11.field1378 == null && var11.field1345 == null && !var11.field1413) {
                class6 var45 = var11.method664(var27, 4, arg4, var20, 0, var22, arg2, var21, var19, var16, (class68) null);
                var46 = var45.field71;
            } else {
                var46 = new class287(arg8, 4, arg2, arg7, arg5, arg3, -1, var11.field1335, (class197) null);
            }
            class66.method525(arg1, arg5, arg3, var19, var46, (class197) null, class242.field3887[arg2], 0, 0, 0, var25);
        } else if (arg9 == 5) {
            int var47 = 16;
            long var48 = class177.method1222(arg1, arg5, arg3);
            if (var48 != 0L) {
                var47 = class119.method842(122, Integer.MAX_VALUE & (int) (var48 >>> 32)).field1354;
            }
            class197 var51;
            if (var11.field1394 == -1 && var11.field1378 == null && var11.field1345 == null && !var11.field1413) {
                class6 var50 = var11.method664(var27, 4, arg4, var20, 0, var22, arg2, var21, var19, var16, (class68) null);
                var51 = var50.field71;
            } else {
                var51 = new class287(arg8, 4, arg2, arg7, arg5, arg3, -1, var11.field1335, (class197) null);
            }
            class66.method525(arg1, arg5, arg3, var19, var51, (class197) null, class242.field3887[arg2], 0, class69.field954[arg2] * var47, class103.field1696[arg2] * var47, var25);
        } else if (arg9 == 6) {
            int var52 = 8;
            long var53 = class177.method1222(arg1, arg5, arg3);
            if (var53 != 0L) {
                var52 = class119.method842(-42, (int) (var53 >>> 32) & Integer.MAX_VALUE).field1354 / 2;
            }
            class197 var56;
            if (var11.field1394 == -1 && var11.field1378 == null && var11.field1345 == null && !var11.field1413) {
                class6 var55 = var11.method664(var27, 4, arg4, var20, 0, var22, arg2 + 4, var21, var19, var16, (class68) null);
                var56 = var55.field71;
            } else {
                var56 = new class287(arg8, 4, arg2 + 4, arg7, arg5, arg3, -1, var11.field1335, (class197) null);
            }
            class66.method525(arg1, arg5, arg3, var19, var56, (class197) null, 256, arg2, class87.field1180[arg2] * var52, class51.field718[arg2] * var52, var25);
        } else if (arg9 == 7) {
            int var57 = arg2 + 2 & 0x3;
            class197 var59;
            if (var11.field1394 == -1 && var11.field1378 == null && var11.field1345 == null && !var11.field1413) {
                class6 var58 = var11.method664(var27, 4, arg4, var20, 0, var22, var57 + 4, var21, var19, var16, (class68) null);
                var59 = var58.field71;
            } else {
                var59 = new class287(arg8, 4, var57 + 4, arg7, arg5, arg3, -1, var11.field1335, (class197) null);
            }
            class66.method525(arg1, arg5, arg3, var19, var59, (class197) null, 256, var57, 0, 0, var25);
        } else if (arg9 == 8) {
            int var60 = 8;
            long var61 = class177.method1222(arg1, arg5, arg3);
            if (var61 != 0L) {
                var60 = class119.method842(120, (int) (var61 >>> 32) & Integer.MAX_VALUE).field1354 / 2;
            }
            int var63 = arg2 + 2 & 0x3;
            class197 var65;
            class197 var67;
            if (var11.field1394 == -1 && var11.field1378 == null && var11.field1345 == null && !var11.field1413) {
                class6 var64 = var11.method664(var27, 4, arg4, var20, 0, var22, arg2 + 4, var21, var19, var16, (class68) null);
                var65 = var64.field71;
                class6 var66 = var11.method664(var27, 4, arg4, var20, 0, var22, var63 + 4, var21, var19, var16, (class68) null);
                var67 = var66.field71;
            } else {
                var65 = new class287(arg8, 4, arg2 + 4, arg7, arg5, arg3, -1, var11.field1335, (class197) null);
                var67 = new class287(arg8, 4, var63 + 4, arg7, arg5, arg3, -1, var11.field1335, (class197) null);
            }
            class66.method525(arg1, arg5, arg3, var19, var65, var67, 256, arg2, class87.field1180[arg2] * var60, class51.field718[arg2] * var60, var25);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lni;BIIZI)V")
    public static final void method1022(class21 arg0, byte arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field2403++;
        if (class104.field1750 >= 50 || arg0 == null || arg0.field242 == null || arg2 >= arg0.field242.length || arg0.field242[arg2] == null) {
            return;
        }
        int var6 = arg0.field242[arg2][0];
        int var7 = var6 >> 8;
        if (arg0.field242[arg2].length > 1) {
            int var8 = (int) (Math.random() * (double) arg0.field242[arg2].length);
            if (var8 > 0) {
                var7 = arg0.field242[arg2][var8];
            }
        }
        int var9 = var6 & 0x1F;
        int var10 = var6 >> 5 & 0x7;
        if (var9 != 0) {
            int var11 = 37 % ((arg1 - 75) / 51);
            if (class45.field548 != 0) {
                int var12 = (arg5 - 64) / 128;
                class97.field1467[class104.field1750] = var7;
                class54.field772[class104.field1750] = var10;
                class116.field1982[class104.field1750] = 0;
                int var13 = (arg3 - 64) / 128;
                class275.field4435[class104.field1750] = null;
                class197.field3181[class104.field1750] = 255;
                class164.field2665[class104.field1750] = (var12 << 16) + (var13 << 8) + var9;
                class104.field1750++;
            }
        } else if (arg4) {
            class222.method1473(0, 0, var10, 255, var7);
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Ljh;)V")
    public class150(class241 arg0) {
        this.field2409 = arg0;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2408[var0] = var1;
        }
    }
}
