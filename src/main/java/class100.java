import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class100 {

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
    public static int field1350 = 0;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "[I")
    public static int[] field1346;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Z)V", line = 8)
    public static final void method633(boolean arg0) {
        field1348++;
        if (arg0) {
            class11.method69(-120, 0, 0);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V", line = 22)
    public static void method634(int arg0) {
        if (arg0 != 67758055) {
            field1350 = -106;
        }
        field1346 = null;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZIIII)V", line = 33)
    public static final void method635(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!arg0) {
            return;
        }
        field1349++;
        if ((arg3 - arg1) >= class337.field5389 && (arg1 + arg3) <= class344.field5460 && class244.field3844 <= arg2 - arg1 && arg1 + arg2 <= class2.field22) {
            class64.method392(arg3, (byte) 121, arg1, arg4, arg2);
        } else {
            class67.method420(arg3, arg2, !arg0, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Llf;B)Lq;", line = 51)
    public static final class112 method636(class143 arg0, byte arg1) {
        field1351++;
        return arg1 < 16 ? (class112) null : new class112(arg0.method1021(-1), arg0.method1021(-1), arg0.method1021(-1), arg0.method1021(-1), arg0.method1017((byte) 101), arg0.method1043(true));
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)Z", line = 62)
    public static final boolean method637(int arg0) {
        field1352++;
        int var1 = 81 / ((arg0 - 58) / 49);
        try {
            if (class28.field330 == 2) {
                if (class7.field82 == null) {
                    class7.field82 = class15.method92(class282.field4498, class258.field4083, class19.field231);
                    if (class7.field82 == null) {
                        return false;
                    }
                }
                if (class138.field2065 == null) {
                    class138.field2065 = new class289(class140.field2150, class344.field5444);
                }
                if (class116.field1615.method583(class7.field82, class138.field2065, (byte) 37, class57.field677, 22050)) {
                    class116.field1615.method596((byte) -29);
                    class116.field1615.method615(-112, class2.field23);
                    class116.field1615.method609(64, class203.field3094, class7.field82);
                    class138.field2065 = null;
                    class28.field330 = 0;
                    class7.field82 = null;
                    class282.field4498 = null;
                    return true;
                }
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            class116.field1615.method604(144);
            class138.field2065 = null;
            class7.field82 = null;
            class282.field4498 = null;
            class28.field330 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IZIIILne;IIZII)V", line = 113)
    public static final void method638(int arg0, boolean arg1, int arg2, int arg3, int arg4, class262 arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
        field1347++;
        if (arg8 && !class103.method653(-29308) && (class225.field3398[0][arg10][arg7] & 0x2) == 0) {
            if ((class225.field3398[arg4][arg10][arg7] & 0x10) != 0) {
                return;
            }
            if (class246.method1747((byte) -84, arg4, arg7, arg10) != class207.field3127) {
                return;
            }
        }
        if (class303.field4731 > arg4) {
            class303.field4731 = arg4;
        }
        class234 var11 = class123.method795(0, arg6);
        if (class272.field4317 && var11.field3553) {
            return;
        }
        int var12;
        int var13;
        if (arg9 == 1 || arg9 == 3) {
            var13 = var11.field3590;
            var12 = var11.field3577;
        } else {
            var12 = var11.field3590;
            var13 = var11.field3577;
        }
        int var14;
        int var15;
        if ((arg10 + var13) <= 104) {
            var14 = (var13 + 1 >> 1) + arg10;
            var15 = arg10 + (var13 >> 1);
        } else {
            var14 = arg10 + 1;
            var15 = arg10;
        }
        int var16;
        int var17;
        if (arg7 + var12 > 104) {
            var16 = arg7 + 1;
            var17 = arg7;
        } else {
            var16 = (var12 + 1 >> 1) + arg7;
            var17 = (var12 >> 1) + arg7;
        }
        int[][] var18 = class72.field902[arg0];
        int var19 = var18[var15][var16] + var18[var15][var17] - (-var18[var14][var16] + -var18[var14][var17]) >> 2;
        int var20 = (arg7 << 7) + (var12 << 6);
        int var21 = (arg10 << 7) + (var13 << 6);
        int var22 = 0;
        if (class272.field4317 && arg0 != 0) {
            int[][] var23 = class72.field902[0];
            var22 = var19 - (var23[var14][var16] + var23[var15][var17] + var23[var14][var17] + var23[var15][var16] >> 2);
        }
        long var24 = (long) (arg9 | 0x400 << 20 | arg7 << 7 | arg10 | arg3 << 14);
        if (var11.field3598 == 0 || arg1) {
            var24 |= Long.MIN_VALUE;
        }
        if (var11.field3541 == 1) {
            var24 |= 0x400000L;
        }
        int[][] var26 = (int[][]) null;
        if (arg1) {
            var26 = class214.field3247[0];
        } else if (arg0 < 3) {
            var26 = class72.field902[arg0 + 1];
        }
        if (var11.field3571) {
            var24 |= 0x80000000L;
        }
        if (var11.method1615(-117)) {
            class218.method1517(arg9, (class67) null, (byte) 31, arg10, (class231) null, var11, arg7, arg4);
        }
        boolean var27 = !arg1 & var11.field3601;
        long var28 = var24 | (long) arg6 << 32;
        if (arg3 == 22) {
            if (class353.field5629 || var11.field3598 != 0 || var11.field3602 == 1 || var11.field3604) {
                class294 var31;
                if (var11.field3570 == -1 && var11.field3566 == null && var11.field3588 == null && !var11.field3600) {
                    class19 var30 = var11.method1622((byte) -108, arg8, 22, arg9, (class270) null, var27, var20, var18, var19, var21, var26);
                    if (class272.field4317 && var27) {
                        class358.method2465(var30.field227, var21, var22, var20);
                    }
                    var31 = var30.field230;
                } else {
                    var31 = new class75(arg6, 22, arg9, arg0, arg10, arg7, -1, var11.field3603, (class294) null);
                }
                class250.method1780(arg4, arg10, arg7, var19, var31, var28, var11.field3574);
                if (var11.field3602 == 1 && arg5 != null) {
                    arg5.method1848(arg7, (byte) 97, arg10);
                }
            }
        } else if (arg3 == 10 || arg3 == 11) {
            class294 var73;
            if (var11.field3570 == -1 && var11.field3566 == null && var11.field3588 == null && !var11.field3600) {
                class19 var72 = var11.method1622((byte) -108, arg8, 10, arg3 == 11 ? arg9 + 4 : arg9, (class270) null, var27, var20, var18, var19, var21, var26);
                if (class272.field4317 && var27) {
                    class358.method2465(var72.field227, var21, var22, var20);
                }
                var73 = var72.field230;
            } else {
                var73 = new class75(arg6, 10, arg3 == 11 ? arg9 + 4 : arg9, arg0, arg10, arg7, -1, var11.field3603, (class294) null);
            }
            if (var73 != null) {
                boolean var74 = class342.method2346(arg4, arg10, arg7, var19, var13, var12, var73, 0, var28);
                if (var11.field3607 && var74 && arg8) {
                    int var75 = 15;
                    if (var73 instanceof class362) {
                        var75 = ((class362) var73).method827() / 4;
                        if (var75 > 30) {
                            var75 = 30;
                        }
                    }
                    for (int var76 = 0; var76 <= var13; var76++) {
                        for (int var77 = 0; var77 <= var12; var77++) {
                            if (class300.field4687[arg4][arg10 + var76][arg7 + var77] < var75) {
                                class300.field4687[arg4][arg10 + var76][arg7 + var77] = (byte) var75;
                            }
                        }
                    }
                }
            }
            if (var11.field3602 != 0 && arg5 != null) {
                arg5.method1854(var11.field3606, !var11.field3545, var13, var12, arg7, false, arg10);
            }
        } else {
            if (arg2 > -3) {
                field1346 = (int[]) null;
            }
            if (arg3 >= 12) {
                class294 var71;
                if (var11.field3570 == -1 && var11.field3566 == null && var11.field3588 == null && !var11.field3600) {
                    class19 var70 = var11.method1622((byte) -108, arg8, arg3, arg9, (class270) null, var27, var20, var18, var19, var21, var26);
                    if (class272.field4317 && var27) {
                        class358.method2465(var70.field227, var21, var22, var20);
                    }
                    var71 = var70.field230;
                } else {
                    var71 = new class75(arg6, arg3, arg9, arg0, arg10, arg7, -1, var11.field3603, (class294) null);
                }
                class342.method2346(arg4, arg10, arg7, var19, 1, 1, var71, 0, var28);
                if (arg8 && arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg4 > 0 && var11.field3578 != 0) {
                    class28.field337[arg4][arg10][arg7] = class77.method492(class28.field337[arg4][arg10][arg7], 4);
                }
                if (var11.field3602 != 0 && arg5 != null) {
                    arg5.method1854(var11.field3606, !var11.field3545, var13, var12, arg7, false, arg10);
                }
            } else if (arg3 == 0) {
                class294 var33;
                if (var11.field3570 == -1 && var11.field3566 == null && var11.field3588 == null && !var11.field3600) {
                    class19 var32 = var11.method1622((byte) -108, arg8, 0, arg9, (class270) null, var27, var20, var18, var19, var21, var26);
                    if (class272.field4317 && var27) {
                        class358.method2465(var32.field227, var21, var22, var20);
                    }
                    var33 = var32.field230;
                } else {
                    var33 = new class75(arg6, 0, arg9, arg0, arg10, arg7, -1, var11.field3603, (class294) null);
                }
                class347.method2406(arg4, arg10, arg7, var19, var33, (class294) null, class38.field434[arg9], 0, var28);
                if (arg8) {
                    if (arg9 == 0) {
                        if (var11.field3607) {
                            class300.field4687[arg4][arg10][arg7] = 50;
                            class300.field4687[arg4][arg10][arg7 + 1] = 50;
                        }
                        if (var11.field3578 == 1) {
                            class28.field337[arg4][arg10][arg7] = class77.method492(class28.field337[arg4][arg10][arg7], 1);
                        }
                    } else if (arg9 == 1) {
                        if (var11.field3607) {
                            class300.field4687[arg4][arg10][arg7 + 1] = 50;
                            class300.field4687[arg4][arg10 + 1][arg7 + 1] = 50;
                        }
                        if (var11.field3578 == 1) {
                            class28.field337[arg4][arg10][arg7 + 1] = class77.method492(class28.field337[arg4][arg10][arg7 + 1], 2);
                        }
                    } else if (arg9 == 2) {
                        if (var11.field3607) {
                            class300.field4687[arg4][arg10 + 1][arg7] = 50;
                            class300.field4687[arg4][arg10 + 1][arg7 + 1] = 50;
                        }
                        if (var11.field3578 == 1) {
                            class28.field337[arg4][arg10 + 1][arg7] = class77.method492(class28.field337[arg4][arg10 + 1][arg7], 1);
                        }
                    } else if (arg9 == 3) {
                        if (var11.field3607) {
                            class300.field4687[arg4][arg10][arg7] = 50;
                            class300.field4687[arg4][arg10 + 1][arg7] = 50;
                        }
                        if (var11.field3578 == 1) {
                            class28.field337[arg4][arg10][arg7] = class77.method492(class28.field337[arg4][arg10][arg7], 2);
                        }
                    }
                }
                if (var11.field3602 != 0 && arg5 != null) {
                    arg5.method1845(var11.field3606, arg3, arg10, !var11.field3545, arg9, -18433, arg7);
                }
                if (var11.field3539 != 16) {
                    class57.method346(arg4, arg10, arg7, var11.field3539);
                }
            } else if (arg3 == 1) {
                class294 var69;
                if (var11.field3570 == -1 && var11.field3566 == null && var11.field3588 == null && !var11.field3600) {
                    class19 var68 = var11.method1622((byte) -108, arg8, 1, arg9, (class270) null, var27, var20, var18, var19, var21, var26);
                    if (class272.field4317 && var27) {
                        class358.method2465(var68.field227, var21, var22, var20);
                    }
                    var69 = var68.field230;
                } else {
                    var69 = new class75(arg6, 1, arg9, arg0, arg10, arg7, -1, var11.field3603, (class294) null);
                }
                class347.method2406(arg4, arg10, arg7, var19, var69, (class294) null, class28.field336[arg9], 0, var28);
                if (var11.field3607 && arg8) {
                    if (arg9 == 0) {
                        class300.field4687[arg4][arg10][arg7 + 1] = 50;
                    } else if (arg9 == 1) {
                        class300.field4687[arg4][arg10 + 1][arg7 + 1] = 50;
                    } else if (arg9 == 2) {
                        class300.field4687[arg4][arg10 + 1][arg7] = 50;
                    } else if (arg9 == 3) {
                        class300.field4687[arg4][arg10][arg7] = 50;
                    }
                }
                if (var11.field3602 != 0 && arg5 != null) {
                    arg5.method1845(var11.field3606, arg3, arg10, !var11.field3545, arg9, -18433, arg7);
                }
            } else if (arg3 == 2) {
                int var34 = arg9 + 1 & 0x3;
                class294 var36;
                class294 var38;
                if (var11.field3570 == -1 && var11.field3566 == null && var11.field3588 == null && !var11.field3600) {
                    class19 var35 = var11.method1622((byte) -108, arg8, 2, arg9 + 4, (class270) null, var27, var20, var18, var19, var21, var26);
                    if (class272.field4317 && var27) {
                        class358.method2465(var35.field227, var21, var22, var20);
                    }
                    var36 = var35.field230;
                    class19 var37 = var11.method1622((byte) -108, arg8, 2, var34, (class270) null, var27, var20, var18, var19, var21, var26);
                    if (class272.field4317 && var27) {
                        class358.method2465(var37.field227, var21, var22, var20);
                    }
                    var38 = var37.field230;
                } else {
                    var36 = new class75(arg6, 2, arg9 + 4, arg0, arg10, arg7, -1, var11.field3603, (class294) null);
                    var38 = new class75(arg6, 2, var34, arg0, arg10, arg7, -1, var11.field3603, (class294) null);
                }
                class347.method2406(arg4, arg10, arg7, var19, var36, var38, class38.field434[arg9], class38.field434[var34], var28);
                if (var11.field3578 == 1 && arg8) {
                    if (arg9 == 0) {
                        class28.field337[arg4][arg10][arg7] = class77.method492(class28.field337[arg4][arg10][arg7], 1);
                        class28.field337[arg4][arg10][arg7 + 1] = class77.method492(class28.field337[arg4][arg10][arg7 + 1], 2);
                    } else if (arg9 == 1) {
                        class28.field337[arg4][arg10][arg7 + 1] = class77.method492(class28.field337[arg4][arg10][arg7 + 1], 2);
                        class28.field337[arg4][arg10 + 1][arg7] = class77.method492(class28.field337[arg4][arg10 + 1][arg7], 1);
                    } else if (arg9 == 2) {
                        class28.field337[arg4][arg10 + 1][arg7] = class77.method492(class28.field337[arg4][arg10 + 1][arg7], 1);
                        class28.field337[arg4][arg10][arg7] = class77.method492(class28.field337[arg4][arg10][arg7], 2);
                    } else if (arg9 == 3) {
                        class28.field337[arg4][arg10][arg7] = class77.method492(class28.field337[arg4][arg10][arg7], 2);
                        class28.field337[arg4][arg10][arg7] = class77.method492(class28.field337[arg4][arg10][arg7], 1);
                    }
                }
                if (var11.field3602 != 0 && arg5 != null) {
                    arg5.method1845(var11.field3606, arg3, arg10, !var11.field3545, arg9, -18433, arg7);
                }
                if (var11.field3539 != 16) {
                    class57.method346(arg4, arg10, arg7, var11.field3539);
                }
            } else if (arg3 == 3) {
                class294 var67;
                if (var11.field3570 == -1 && var11.field3566 == null && var11.field3588 == null && !var11.field3600) {
                    class19 var66 = var11.method1622((byte) -108, arg8, 3, arg9, (class270) null, var27, var20, var18, var19, var21, var26);
                    if (class272.field4317 && var27) {
                        class358.method2465(var66.field227, var21, var22, var20);
                    }
                    var67 = var66.field230;
                } else {
                    var67 = new class75(arg6, 3, arg9, arg0, arg10, arg7, -1, var11.field3603, (class294) null);
                }
                class347.method2406(arg4, arg10, arg7, var19, var67, (class294) null, class28.field336[arg9], 0, var28);
                if (var11.field3607 && arg8) {
                    if (arg9 == 0) {
                        class300.field4687[arg4][arg10][arg7 + 1] = 50;
                    } else if (arg9 == 1) {
                        class300.field4687[arg4][arg10 + 1][arg7 + 1] = 50;
                    } else if (arg9 == 2) {
                        class300.field4687[arg4][arg10 + 1][arg7] = 50;
                    } else if (arg9 == 3) {
                        class300.field4687[arg4][arg10][arg7] = 50;
                    }
                }
                if (var11.field3602 != 0 && arg5 != null) {
                    arg5.method1845(var11.field3606, arg3, arg10, !var11.field3545, arg9, -18433, arg7);
                }
            } else if (arg3 == 9) {
                class294 var40;
                if (var11.field3570 == -1 && var11.field3566 == null && var11.field3588 == null && !var11.field3600) {
                    class19 var39 = var11.method1622((byte) -108, arg8, arg3, arg9, (class270) null, var27, var20, var18, var19, var21, var26);
                    if (class272.field4317 && var27) {
                        class358.method2465(var39.field227, var21, var22, var20);
                    }
                    var40 = var39.field230;
                } else {
                    var40 = new class75(arg6, arg3, arg9, arg0, arg10, arg7, -1, var11.field3603, (class294) null);
                }
                class342.method2346(arg4, arg10, arg7, var19, 1, 1, var40, 0, var28);
                if (var11.field3602 != 0 && arg5 != null) {
                    arg5.method1854(var11.field3606, !var11.field3545, var13, var12, arg7, false, arg10);
                }
                if (var11.field3539 != 16) {
                    class57.method346(arg4, arg10, arg7, var11.field3539);
                }
            } else if (arg3 == 4) {
                class294 var65;
                if (var11.field3570 == -1 && var11.field3566 == null && var11.field3588 == null && !var11.field3600) {
                    class19 var64 = var11.method1622((byte) -108, arg8, 4, arg9, (class270) null, var27, var20, var18, var19, var21, var26);
                    if (class272.field4317 && var27) {
                        class358.method2465(var64.field227, var21, var22, var20);
                    }
                    var65 = var64.field230;
                } else {
                    var65 = new class75(arg6, 4, arg9, arg0, arg10, arg7, -1, var11.field3603, (class294) null);
                }
                class260.method1837(arg4, arg10, arg7, var19, var65, (class294) null, class38.field434[arg9], 0, 0, 0, var28);
            } else if (arg3 == 5) {
                long var41 = class113.method730(arg4, arg10, arg7);
                int var43 = 16;
                if (var41 != 0L) {
                    var43 = class123.method795(0, Integer.MAX_VALUE & (int) (var41 >>> 32)).field3539;
                }
                class294 var45;
                if (var11.field3570 == -1 && var11.field3566 == null && var11.field3588 == null && !var11.field3600) {
                    class19 var44 = var11.method1622((byte) -108, arg8, 4, arg9, (class270) null, var27, var20, var18, var19, var21, var26);
                    if (class272.field4317 && var27) {
                        class358.method2465(var44.field227, var21 - (class304.field4740[arg9] * 8), var22, var20 - class185.field2784[arg9] * 8);
                    }
                    var45 = var44.field230;
                } else {
                    var45 = new class75(arg6, 4, arg9, arg0, arg10, arg7, -1, var11.field3603, (class294) null);
                }
                class260.method1837(arg4, arg10, arg7, var19, var45, (class294) null, class38.field434[arg9], 0, class304.field4740[arg9] * var43, class185.field2784[arg9] * var43, var28);
            } else if (arg3 == 6) {
                long var46 = class113.method730(arg4, arg10, arg7);
                int var48 = 8;
                if (var46 != 0L) {
                    var48 = class123.method795(0, (int) (var46 >>> 32) & Integer.MAX_VALUE).field3539 / 2;
                }
                class294 var50;
                if (var11.field3570 == -1 && var11.field3566 == null && var11.field3588 == null && !var11.field3600) {
                    class19 var49 = var11.method1622((byte) -108, arg8, 4, arg9 + 4, (class270) null, var27, var20, var18, var19, var21, var26);
                    if (class272.field4317 && var27) {
                        class358.method2465(var49.field227, var21 - (class54.field633[arg9] * 8), var22, var20 - (class54.field629[arg9] * 8));
                    }
                    var50 = var49.field230;
                } else {
                    var50 = new class75(arg6, 4, arg9 + 4, arg0, arg10, arg7, -1, var11.field3603, (class294) null);
                }
                class260.method1837(arg4, arg10, arg7, var19, var50, (class294) null, 256, arg9, class54.field633[arg9] * var48, class54.field629[arg9] * var48, var28);
            } else if (arg3 == 7) {
                int var51 = arg9 + 2 & 0x3;
                class294 var53;
                if (var11.field3570 == -1 && var11.field3566 == null && var11.field3588 == null && !var11.field3600) {
                    class19 var52 = var11.method1622((byte) -108, arg8, 4, var51 + 4, (class270) null, var27, var20, var18, var19, var21, var26);
                    if (class272.field4317 && var27) {
                        class358.method2465(var52.field227, var21, var22, var20);
                    }
                    var53 = var52.field230;
                } else {
                    var53 = new class75(arg6, 4, var51 + 4, arg0, arg10, arg7, -1, var11.field3603, (class294) null);
                }
                class260.method1837(arg4, arg10, arg7, var19, var53, (class294) null, 256, var51, 0, 0, var28);
            } else if (arg3 == 8) {
                int var54 = 8;
                long var55 = class113.method730(arg4, arg10, arg7);
                if (var55 != 0L) {
                    var54 = class123.method795(0, (int) (var55 >>> 32) & Integer.MAX_VALUE).field3539 / 2;
                }
                int var57 = arg9 + 2 & 0x3;
                class294 var61;
                class294 var63;
                if (var11.field3570 == -1 && var11.field3566 == null && var11.field3588 == null && !var11.field3600) {
                    int var58 = class54.field633[arg9] * 8;
                    int var59 = class54.field629[arg9] * 8;
                    class19 var60 = var11.method1622((byte) -108, arg8, 4, arg9 + 4, (class270) null, var27, var20, var18, var19, var21, var26);
                    if (class272.field4317 && var27) {
                        class358.method2465(var60.field227, var21 - var58, var22, var20 - var59);
                    }
                    var61 = var60.field230;
                    class19 var62 = var11.method1622((byte) -108, arg8, 4, var57 + 4, (class270) null, var27, var20, var18, var19, var21, var26);
                    if (class272.field4317 && var27) {
                        class358.method2465(var62.field227, var21 - var58, var22, var20 - var59);
                    }
                    var63 = var62.field230;
                } else {
                    var61 = new class75(arg6, 4, arg9 + 4, arg0, arg10, arg7, -1, var11.field3603, (class294) null);
                    var63 = new class75(arg6, 4, var57 + 4, arg0, arg10, arg7, -1, var11.field3603, (class294) null);
                }
                class260.method1837(arg4, arg10, arg7, var19, var61, var63, 256, arg9, class54.field633[arg9] * var54, class54.field629[arg9] * var54, var28);
            }
        }
    }
}
