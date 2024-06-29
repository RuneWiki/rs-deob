import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class209 {

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "B")
    private byte field3381;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public int field3379;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public int field3370;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public int field3376;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public int field3372;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public int field3368;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field3374 = 0;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public static int field3383 = 0;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "[I")
    public static int[] field3369;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)I", line = 5)
    public static final int method1412(int arg0, int arg1) {
        field3373++;
        if (arg1 != -27369) {
            method1412(71, 87);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V", line = 20)
    public static void method1413(byte arg0) {
        if (arg0 < -66) {
            field3369 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lbm;Lbm;Lfb;IZ)V", line = 36)
    public static final void method1414(class307 arg0, class307 arg1, class237 arg2, int arg3, boolean arg4) {
        field3380++;
        class130.field2205 = arg0;
        class46.field959 = arg4;
        class291.field4468 = arg1;
        int var5 = class130.field2205.method2053((byte) -9) - 1;
        class328.field5038 = class130.field2205.method2056(var5, -115) + var5 * 256;
        class86.field1623 = new String[] { null, null, class212.field3406, null, null };
        class37.field723 = arg2;
        if (arg3 != 0) {
            method1413((byte) 90);
        }
        class171.field2755 = new String[] { null, null, null, null, class18.field332 };
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)I", line = 59)
    public final int method1415(int arg0) {
        if (arg0 != 3) {
            field3383 = 4;
        }
        field3378++;
        return (this.field3381 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)I", line = 72)
    public final int method1416(byte arg0) {
        field3377++;
        if (arg0 > -85) {
            method1413((byte) -30);
        }
        return this.field3381 & 0x7;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILu;IIIZIBZII)V", line = 84)
    public static final void method1417(int arg0, class25 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, byte arg7, boolean arg8, int arg9, int arg10) {
        field3384++;
        if (arg5 && !class19.method127(10) && (class99.field1749[0][arg4][arg2] & 0x2) == 0) {
            if ((class99.field1749[arg9][arg4][arg2] & 0x10) != 0) {
                return;
            }
            if (class72.method555(arg4, arg9, arg2, 0) != class290.field4454) {
                return;
            }
        }
        if (class72.field1499 > arg9) {
            class72.field1499 = arg9;
        }
        class31 var11 = class277.method1864(arg3, arg7 - 4);
        if (class249.field3893 && var11.field609) {
            return;
        }
        int var12;
        int var13;
        if (arg6 == 1 || arg6 == 3) {
            var13 = var11.field616;
            var12 = var11.field589;
        } else {
            var12 = var11.field616;
            var13 = var11.field589;
        }
        int var14;
        int var15;
        if (arg4 + var13 <= 104) {
            var14 = (var13 + 1 >> 1) + arg4;
            var15 = arg4 + (var13 >> 1);
        } else {
            var14 = arg4 + 1;
            var15 = arg4;
        }
        int var16;
        int var17;
        if (arg2 + var12 <= 104) {
            var16 = arg2 + (var12 + 1 >> 1);
            var17 = (var12 >> 1) + arg2;
        } else {
            var17 = arg2;
            var16 = arg2 + 1;
        }
        int[][] var18 = class45.field923[arg0];
        int var19 = var18[var14][var16] + var18[var15][var17] + var18[var14][var17] + var18[var15][var16] >> 2;
        int var20 = (arg4 << 7) + (var13 << 6);
        int var21 = (arg2 << 7) + (var12 << 6);
        int var22 = 0;
        if (class249.field3893 && arg0 != 0) {
            int[][] var23 = class45.field923[0];
            var22 = var19 - (var23[var14][var16] + var23[var15][var16] + var23[var14][var17] + var23[var15][var17] >> 2);
        }
        int[][] var24 = (int[][]) null;
        if (arg8) {
            var24 = class46.field954[0];
        } else if (arg0 < 3) {
            var24 = class45.field923[arg0 + 1];
        }
        if (arg7 != 4) {
            field3382 = -19;
        }
        long var25 = (long) (arg4 | arg2 << 7 | arg10 << 14 | arg6 << 20 | 0x40000000);
        if (var11.field638 == 0 || arg8) {
            var25 |= Long.MIN_VALUE;
        }
        if (var11.field629 == 1) {
            var25 |= 0x400000L;
        }
        if (var11.field592) {
            var25 |= 0x80000000L;
        }
        long var27 = var25 | (long) arg3 << 32;
        if (var11.method255(-32106)) {
            class142.method921(arg4, var11, (class255) null, arg2, (class278) null, arg6, false, arg9);
        }
        boolean var29 = !arg8 & var11.field615;
        int var30 = var11.field604;
        if (arg10 == 22) {
            if (class64.field1227 || var11.field638 != 0 || var11.field624 == 1 || var11.field571) {
                class19 var32;
                if (var30 == -1 && var11.field597 == null && !var11.field627) {
                    class15 var31 = var11.method245(var20, var21, var29, arg6, 22, 0, var24, var18, var19, (class113) null, arg5);
                    if (class249.field3893 && var29) {
                        class60.method464(var31.field282, var20, var22, var21);
                    }
                    var32 = var31.field283;
                } else {
                    var32 = new class331(arg3, 22, arg6, arg0, arg4, arg2, var30, var11.field595, (class19) null);
                }
                class191.method1220(arg9, arg4, arg2, var19, var32, var27, var11.field585);
                if (var11.field624 == 1 && arg1 != null) {
                    arg1.method203(arg4, 262144, arg2);
                }
            }
        } else if (arg10 == 10 || arg10 == 11) {
            class19 var74;
            if (var30 == -1 && var11.field597 == null && !var11.field627) {
                class15 var73 = var11.method245(var20, var21, var29, arg10 == 11 ? arg6 + 4 : arg6, 10, 0, var24, var18, var19, (class113) null, arg5);
                if (class249.field3893 && var29) {
                    class60.method464(var73.field282, var20, var22, var21);
                }
                var74 = var73.field283;
            } else {
                var74 = new class331(arg3, 10, arg10 == 11 ? arg6 + 4 : arg6, arg0, arg4, arg2, var30, var11.field595, (class19) null);
            }
            if (var74 != null) {
                boolean var75 = class159.method1030(arg9, arg4, arg2, var19, var13, var12, var74, 0, var27);
                if (var11.field600 && var75 && arg5) {
                    int var76 = 15;
                    if (var74 instanceof class309) {
                        var76 = ((class309) var74).method147() / 4;
                        if (var76 > 30) {
                            var76 = 30;
                        }
                    }
                    for (int var77 = 0; var77 <= var13; var77++) {
                        for (int var78 = 0; var78 <= var12; var78++) {
                            if (class46.field957[arg9][arg4 + var77][arg2 + var78] < var76) {
                                class46.field957[arg9][arg4 + var77][arg2 + var78] = (byte) var76;
                            }
                        }
                    }
                }
            }
            if (var11.field624 != 0 && arg1 != null) {
                arg1.method211(var11.field639, true, arg4, var12, arg2, var13, !var11.field614);
            }
        } else if (arg10 >= 12) {
            class19 var34;
            if (var30 == -1 && var11.field597 == null && !var11.field627) {
                class15 var33 = var11.method245(var20, var21, var29, arg6, arg10, 0, var24, var18, var19, (class113) null, arg5);
                if (class249.field3893 && var29) {
                    class60.method464(var33.field282, var20, var22, var21);
                }
                var34 = var33.field283;
            } else {
                var34 = new class331(arg3, arg10, arg6, arg0, arg4, arg2, var30, var11.field595, (class19) null);
            }
            class159.method1030(arg9, arg4, arg2, var19, 1, 1, var34, 0, var27);
            if (arg5 && arg10 >= 12 && arg10 <= 17 && arg10 != 13 && arg9 > 0 && var11.field643 != 0) {
                class267.field4121[arg9][arg4][arg2] = class212.method1434(class267.field4121[arg9][arg4][arg2], 4);
            }
            if (var11.field624 != 0 && arg1 != null) {
                arg1.method211(var11.field639, true, arg4, var12, arg2, var13, !var11.field614);
            }
        } else if (arg10 == 0) {
            class19 var72;
            if (var30 == -1 && var11.field597 == null && !var11.field627) {
                class15 var71 = var11.method245(var20, var21, var29, arg6, 0, 0, var24, var18, var19, (class113) null, arg5);
                if (class249.field3893 && var29) {
                    class60.method464(var71.field282, var20, var22, var21);
                }
                var72 = var71.field283;
            } else {
                var72 = new class331(arg3, 0, arg6, arg0, arg4, arg2, var30, var11.field595, (class19) null);
            }
            class263.method1756(arg9, arg4, arg2, var19, var72, (class19) null, class142.field2355[arg6], 0, var27);
            if (arg5) {
                if (arg6 == 0) {
                    if (var11.field600) {
                        class46.field957[arg9][arg4][arg2] = 50;
                        class46.field957[arg9][arg4][arg2 + 1] = 50;
                    }
                    if (var11.field643 == 1) {
                        class267.field4121[arg9][arg4][arg2] = class212.method1434(class267.field4121[arg9][arg4][arg2], 1);
                    }
                } else if (arg6 == 1) {
                    if (var11.field600) {
                        class46.field957[arg9][arg4][arg2 + 1] = 50;
                        class46.field957[arg9][arg4 + 1][arg2 + 1] = 50;
                    }
                    if (var11.field643 == 1) {
                        class267.field4121[arg9][arg4][arg2 + 1] = class212.method1434(class267.field4121[arg9][arg4][arg2 + 1], 2);
                    }
                } else if (arg6 == 2) {
                    if (var11.field600) {
                        class46.field957[arg9][arg4 + 1][arg2] = 50;
                        class46.field957[arg9][arg4 + 1][arg2 + 1] = 50;
                    }
                    if (var11.field643 == 1) {
                        class267.field4121[arg9][arg4 + 1][arg2] = class212.method1434(class267.field4121[arg9][arg4 + 1][arg2], 1);
                    }
                } else if (arg6 == 3) {
                    if (var11.field600) {
                        class46.field957[arg9][arg4][arg2] = 50;
                        class46.field957[arg9][arg4 + 1][arg2] = 50;
                    }
                    if (var11.field643 == 1) {
                        class267.field4121[arg9][arg4][arg2] = class212.method1434(class267.field4121[arg9][arg4][arg2], 2);
                    }
                }
            }
            if (var11.field624 != 0 && arg1 != null) {
                arg1.method207(var11.field639, !var11.field614, arg2, arg6, arg10, arg7 - 72, arg4);
            }
            if (var11.field591 != 16) {
                class14.method100(arg9, arg4, arg2, var11.field591);
            }
        } else if (arg10 == 1) {
            class19 var36;
            if (var30 == -1 && var11.field597 == null && !var11.field627) {
                class15 var35 = var11.method245(var20, var21, var29, arg6, 1, arg7 ^ 0x4, var24, var18, var19, (class113) null, arg5);
                if (class249.field3893 && var29) {
                    class60.method464(var35.field282, var20, var22, var21);
                }
                var36 = var35.field283;
            } else {
                var36 = new class331(arg3, 1, arg6, arg0, arg4, arg2, var30, var11.field595, (class19) null);
            }
            class263.method1756(arg9, arg4, arg2, var19, var36, (class19) null, class234.field3683[arg6], 0, var27);
            if (var11.field600 && arg5) {
                if (arg6 == 0) {
                    class46.field957[arg9][arg4][arg2 + 1] = 50;
                } else if (arg6 == 1) {
                    class46.field957[arg9][arg4 + 1][arg2 + 1] = 50;
                } else if (arg6 == 2) {
                    class46.field957[arg9][arg4 + 1][arg2] = 50;
                } else if (arg6 == 3) {
                    class46.field957[arg9][arg4][arg2] = 50;
                }
            }
            if (var11.field624 != 0 && arg1 != null) {
                arg1.method207(var11.field639, !var11.field614, arg2, arg6, arg10, arg7 ^ 0xFFFFFFB3, arg4);
            }
        } else if (arg10 == 2) {
            int var66 = arg6 + 1 & 0x3;
            class19 var68;
            class19 var70;
            if (var30 == -1 && var11.field597 == null && !var11.field627) {
                class15 var67 = var11.method245(var20, var21, var29, arg6 + 4, 2, arg7 ^ 0x4, var24, var18, var19, (class113) null, arg5);
                if (class249.field3893 && var29) {
                    class60.method464(var67.field282, var20, var22, var21);
                }
                var68 = var67.field283;
                class15 var69 = var11.method245(var20, var21, var29, var66, 2, 0, var24, var18, var19, (class113) null, arg5);
                if (class249.field3893 && var29) {
                    class60.method464(var69.field282, var20, var22, var21);
                }
                var70 = var69.field283;
            } else {
                var68 = new class331(arg3, 2, arg6 + 4, arg0, arg4, arg2, var30, var11.field595, (class19) null);
                var70 = new class331(arg3, 2, var66, arg0, arg4, arg2, var30, var11.field595, (class19) null);
            }
            class263.method1756(arg9, arg4, arg2, var19, var68, var70, class142.field2355[arg6], class142.field2355[var66], var27);
            if (var11.field643 == 1 && arg5) {
                if (arg6 == 0) {
                    class267.field4121[arg9][arg4][arg2] = class212.method1434(class267.field4121[arg9][arg4][arg2], 1);
                    class267.field4121[arg9][arg4][arg2 + 1] = class212.method1434(class267.field4121[arg9][arg4][arg2 + 1], 2);
                } else if (arg6 == 1) {
                    class267.field4121[arg9][arg4][arg2 + 1] = class212.method1434(class267.field4121[arg9][arg4][arg2 + 1], 2);
                    class267.field4121[arg9][arg4 + 1][arg2] = class212.method1434(class267.field4121[arg9][arg4 + 1][arg2], 1);
                } else if (arg6 == 2) {
                    class267.field4121[arg9][arg4 + 1][arg2] = class212.method1434(class267.field4121[arg9][arg4 + 1][arg2], 1);
                    class267.field4121[arg9][arg4][arg2] = class212.method1434(class267.field4121[arg9][arg4][arg2], 2);
                } else if (arg6 == 3) {
                    class267.field4121[arg9][arg4][arg2] = class212.method1434(class267.field4121[arg9][arg4][arg2], 2);
                    class267.field4121[arg9][arg4][arg2] = class212.method1434(class267.field4121[arg9][arg4][arg2], 1);
                }
            }
            if (var11.field624 != 0 && arg1 != null) {
                arg1.method207(var11.field639, !var11.field614, arg2, arg6, arg10, -120, arg4);
            }
            if (var11.field591 != 16) {
                class14.method100(arg9, arg4, arg2, var11.field591);
            }
        } else if (arg10 == 3) {
            class19 var38;
            if (var30 == -1 && var11.field597 == null && !var11.field627) {
                class15 var37 = var11.method245(var20, var21, var29, arg6, 3, 0, var24, var18, var19, (class113) null, arg5);
                if (class249.field3893 && var29) {
                    class60.method464(var37.field282, var20, var22, var21);
                }
                var38 = var37.field283;
            } else {
                var38 = new class331(arg3, 3, arg6, arg0, arg4, arg2, var30, var11.field595, (class19) null);
            }
            class263.method1756(arg9, arg4, arg2, var19, var38, (class19) null, class234.field3683[arg6], 0, var27);
            if (var11.field600 && arg5) {
                if (arg6 == 0) {
                    class46.field957[arg9][arg4][arg2 + 1] = 50;
                } else if (arg6 == 1) {
                    class46.field957[arg9][arg4 + 1][arg2 + 1] = 50;
                } else if (arg6 == 2) {
                    class46.field957[arg9][arg4 + 1][arg2] = 50;
                } else if (arg6 == 3) {
                    class46.field957[arg9][arg4][arg2] = 50;
                }
            }
            if (var11.field624 != 0 && arg1 != null) {
                arg1.method207(var11.field639, !var11.field614, arg2, arg6, arg10, -73, arg4);
            }
        } else if (arg10 == 9) {
            class19 var40;
            if (var30 == -1 && var11.field597 == null && !var11.field627) {
                class15 var39 = var11.method245(var20, var21, var29, arg6, arg10, 0, var24, var18, var19, (class113) null, arg5);
                if (class249.field3893 && var29) {
                    class60.method464(var39.field282, var20, var22, var21);
                }
                var40 = var39.field283;
            } else {
                var40 = new class331(arg3, arg10, arg6, arg0, arg4, arg2, var30, var11.field595, (class19) null);
            }
            class159.method1030(arg9, arg4, arg2, var19, 1, 1, var40, 0, var27);
            if (var11.field624 != 0 && arg1 != null) {
                arg1.method211(var11.field639, true, arg4, var12, arg2, var13, !var11.field614);
            }
            if (var11.field591 != 16) {
                class14.method100(arg9, arg4, arg2, var11.field591);
            }
        } else if (arg10 == 4) {
            class19 var65;
            if (var30 == -1 && var11.field597 == null && !var11.field627) {
                class15 var64 = var11.method245(var20, var21, var29, arg6, 4, 0, var24, var18, var19, (class113) null, arg5);
                if (class249.field3893 && var29) {
                    class60.method464(var64.field282, var20, var22, var21);
                }
                var65 = var64.field283;
            } else {
                var65 = new class331(arg3, 4, arg6, arg0, arg4, arg2, var30, var11.field595, (class19) null);
            }
            class301.method2005(arg9, arg4, arg2, var19, var65, (class19) null, class142.field2355[arg6], 0, 0, 0, var27);
        } else if (arg10 == 5) {
            int var41 = 16;
            long var42 = class14.method104(arg9, arg4, arg2);
            if (var42 != 0L) {
                var41 = class277.method1864((int) (var42 >>> 32) & Integer.MAX_VALUE, 0).field591;
            }
            class19 var45;
            if (var30 == -1 && var11.field597 == null && !var11.field627) {
                class15 var44 = var11.method245(var20, var21, var29, arg6, 4, 0, var24, var18, var19, (class113) null, arg5);
                if (class249.field3893 && var29) {
                    class60.method464(var44.field282, var20 - class24.field483[arg6] * 8, var22, var21 - class62.field1191[arg6] * 8);
                }
                var45 = var44.field283;
            } else {
                var45 = new class331(arg3, 4, arg6, arg0, arg4, arg2, var30, var11.field595, (class19) null);
            }
            class301.method2005(arg9, arg4, arg2, var19, var45, (class19) null, class142.field2355[arg6], 0, class24.field483[arg6] * var41, class62.field1191[arg6] * var41, var27);
        } else if (arg10 == 6) {
            int var46 = 8;
            long var47 = class14.method104(arg9, arg4, arg2);
            if (var47 != 0L) {
                var46 = class277.method1864(Integer.MAX_VALUE & (int) (var47 >>> 32), 0).field591 / 2;
            }
            class19 var50;
            if (var30 == -1 && var11.field597 == null && !var11.field627) {
                class15 var49 = var11.method245(var20, var21, var29, arg6 + 4, 4, arg7 - 4, var24, var18, var19, (class113) null, arg5);
                if (class249.field3893 && var29) {
                    class60.method464(var49.field282, var20 - (class46.field948[arg6] * 8), var22, var21 - class215.field3439[arg6] * 8);
                }
                var50 = var49.field283;
            } else {
                var50 = new class331(arg3, 4, arg6 + 4, arg0, arg4, arg2, var30, var11.field595, (class19) null);
            }
            class301.method2005(arg9, arg4, arg2, var19, var50, (class19) null, 256, arg6, class46.field948[arg6] * var46, class215.field3439[arg6] * var46, var27);
        } else if (arg10 == 7) {
            int var61 = arg6 + 2 & 0x3;
            class19 var63;
            if (var30 == -1 && var11.field597 == null && !var11.field627) {
                class15 var62 = var11.method245(var20, var21, var29, var61 + 4, 4, arg7 - 4, var24, var18, var19, (class113) null, arg5);
                if (class249.field3893 && var29) {
                    class60.method464(var62.field282, var20, var22, var21);
                }
                var63 = var62.field283;
            } else {
                var63 = new class331(arg3, 4, var61 + 4, arg0, arg4, arg2, var30, var11.field595, (class19) null);
            }
            class301.method2005(arg9, arg4, arg2, var19, var63, (class19) null, 256, var61, 0, 0, var27);
        } else if (arg10 == 8) {
            int var51 = 8;
            long var52 = class14.method104(arg9, arg4, arg2);
            if (var52 != 0L) {
                var51 = class277.method1864((int) (var52 >>> 32) & Integer.MAX_VALUE, 0).field591 / 2;
            }
            int var54 = arg6 + 2 & 0x3;
            class19 var58;
            class19 var60;
            if (var30 == -1 && var11.field597 == null && !var11.field627) {
                int var55 = class46.field948[arg6] * 8;
                int var56 = class215.field3439[arg6] * 8;
                class15 var57 = var11.method245(var20, var21, var29, arg6 + 4, 4, 0, var24, var18, var19, (class113) null, arg5);
                if (class249.field3893 && var29) {
                    class60.method464(var57.field282, var20 - var55, var22, var21 - var56);
                }
                var58 = var57.field283;
                class15 var59 = var11.method245(var20, var21, var29, var54 + 4, 4, 0, var24, var18, var19, (class113) null, arg5);
                if (class249.field3893 && var29) {
                    class60.method464(var59.field282, var20 - var55, var22, var21 - var56);
                }
                var60 = var59.field283;
            } else {
                var58 = new class331(arg3, 4, arg6 + 4, arg0, arg4, arg2, var30, var11.field595, (class19) null);
                var60 = new class331(arg3, 4, var54 + 4, arg0, arg4, arg2, var30, var11.field595, (class19) null);
            }
            class301.method2005(arg9, arg4, arg2, var19, var58, var60, 256, arg6, class46.field948[arg6] * var51, class215.field3439[arg6] * var51, var27);
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V", line = 747)
    public static final void method1418(int arg0) {
        if (arg0 != 1) {
            method1413((byte) -74);
        }
        class141.field2333.method1884(-22054);
        class325.field4965.method1884(-22054);
        field3375++;
        class85.field1611.method1884(-22054);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)I", line = 762)
    public static final int method1419(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -1) {
            return 125;
        }
        if (arg3 > 243) {
            arg1 >>= 0x4;
        } else if (arg3 > 217) {
            arg1 >>= 0x3;
        } else if (arg3 > 192) {
            arg1 >>= 0x2;
        } else if (arg3 > 179) {
            arg1 >>= 0x1;
        }
        field3371++;
        return (arg3 >> 1) + (arg1 >> 5 << 7) + (arg2 >> 2 << 10);
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V", line = 786)
    public class209() {
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lag;)V", line = 795)
    public class209(class202 arg0) {
        this.field3381 = arg0.method1333(-126);
        this.field3379 = arg0.method1315(14289);
        this.field3370 = arg0.method1346(-114);
        this.field3376 = arg0.method1346(-128);
        this.field3372 = arg0.method1346(60);
        this.field3368 = arg0.method1346(35);
    }
}
