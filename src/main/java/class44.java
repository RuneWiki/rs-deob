import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class44 {

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
    public static int field682 = 0;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "[Lve;")
    public static class255[] field684 = new class255[500];

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "[Ltl;")
    public static class197[] field687;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "[Lvi;")
    public static class5[] field681;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZI)V", line = 14)
    public static final void method266(boolean arg0, int arg1) {
        field689++;
        class262 var2 = (class262) class68.field1008.method280((long) arg1, 29153);
        if (var2 != null) {
            var2.method1502((byte) -82);
            if (!arg0) {
                field683 = 114;
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V", line = 51)
    public static void method267(int arg0) {
        field687 = null;
        field684 = null;
        field681 = null;
        int var1 = 120 / ((arg0 - 38) / 62);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZILhc;IIIIIIIZ)V", line = 84)
    public static final void method268(boolean arg0, int arg1, class163 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        field686++;
        if (arg10 && !class96.method761(true) && (class166.field2800[0][arg8][arg9] & 0x2) == 0) {
            if ((class166.field2800[arg1][arg8][arg9] & 0x10) != 0) {
                return;
            }
            if (class67.method409(arg9, arg1, false, arg8) != class87.field1415) {
                return;
            }
        }
        if (class265.field4484 > arg1) {
            class265.field4484 = arg1;
        }
        class145 var11 = class289.method2046(-12453, arg6);
        if (class281.field4827 && var11.field2481) {
            return;
        }
        int var12;
        int var13;
        if (arg3 == 1 || arg3 == 3) {
            var12 = var11.field2444;
            var13 = var11.field2442;
        } else {
            var12 = var11.field2442;
            var13 = var11.field2444;
        }
        int var14;
        int var15;
        if ((arg8 + var12) <= 104) {
            var14 = (var12 + 1 >> 1) + arg8;
            var15 = arg8 + (var12 >> 1);
        } else {
            var14 = arg8 + 1;
            var15 = arg8;
        }
        int var16;
        int var17;
        if (arg9 + var13 > 104) {
            var16 = arg9 + 1;
            var17 = arg9;
        } else {
            var17 = (var13 >> 1) + arg9;
            var16 = (var13 + 1 >> 1) + arg9;
        }
        int[][] var18 = class106.field1783[arg5];
        int var19 = var18[var14][var17] + var18[var15][var17] + var18[var15][var16] + var18[var14][var16] >> 2;
        int var20 = (arg8 << 7) + (var12 << 6);
        int var21 = 0;
        if (class281.field4827 && arg5 != 0) {
            int[][] var22 = class106.field1783[0];
            var21 = var19 - (var22[var15][var16] + var22[var15][var17] - (-var22[var14][var16] + -var22[var14][var17]) >> 2);
        }
        int var23 = (arg9 << 7) + (var13 << 6);
        long var24 = (long) (arg4 << 14 | arg9 << 7 | arg8 | arg3 << 20 | 0x40000000);
        int[][] var26 = (int[][]) null;
        if (var11.field2463 == 0 || arg0) {
            var24 |= Long.MIN_VALUE;
        }
        if (arg0) {
            var26 = class43.field677[0];
        } else if (arg5 < 3) {
            var26 = class106.field1783[arg5 + 1];
        }
        if (var11.field2417 == 1) {
            var24 |= 0x400000L;
        }
        if (var11.field2476) {
            var24 |= 0x80000000L;
        }
        if (var11.method1075(true)) {
            class196.method1405(arg8, (byte) 9, var11, arg1, (class242) null, arg3, arg9, (class186) null);
        }
        long var27 = var24 | (long) arg6 << 32;
        boolean var29 = !arg0 & var11.field2480;
        if (arg4 == 22) {
            if (class229.field3788 || var11.field2463 != 0 || var11.field2446 == 1 || var11.field2449) {
                class177 var31;
                if (var11.field2416 == -1 && var11.field2454 == null) {
                    class209 var30 = var11.method1077(22, var26, var19, arg3, var18, var20, arg10, -82, var29, var23, (class273) null);
                    if (class281.field4827 && var29) {
                        class35.method210(var30.field3572, var20, var21, var23);
                    }
                    var31 = var30.field3573;
                } else {
                    var31 = new class72(arg6, 22, arg3, arg5, arg8, arg9, var11.field2416, var11.field2457, (class177) null);
                }
                class160.method1162(arg1, arg8, arg9, var19, var31, var27, var11.field2483);
                if (var11.field2446 == 1 && arg2 != null) {
                    arg2.method1190(arg8, arg9, 262144);
                }
            }
        } else if (arg4 == 10 || arg4 == 11) {
            class177 var73;
            if (var11.field2416 == -1 && var11.field2454 == null) {
                class209 var72 = var11.method1077(10, var26, var19, arg4 == 11 ? arg3 + 4 : arg3, var18, var20, arg10, -90, var29, var23, (class273) null);
                if (class281.field4827 && var29) {
                    class35.method210(var72.field3572, var20, var21, var23);
                }
                var73 = var72.field3573;
            } else {
                var73 = new class72(arg6, 10, arg4 == 11 ? arg3 + 4 : arg3, arg5, arg8, arg9, var11.field2416, var11.field2457, (class177) null);
            }
            if (var73 != null) {
                boolean var74 = class184.method1284(arg1, arg8, arg9, var19, var12, var13, var73, 0, var27);
                if (var11.field2412 && var74 && arg10) {
                    int var75 = 15;
                    if (var73 instanceof class227) {
                        var75 = ((class227) var73).method1350() / 4;
                        if (var75 > 30) {
                            var75 = 30;
                        }
                    }
                    for (int var76 = 0; var76 <= var12; var76++) {
                        for (int var77 = 0; var77 <= var13; var77++) {
                            if (class122.field2037[arg1][arg8 + var76][arg9 + var77] < var75) {
                                class122.field2037[arg1][arg8 + var76][arg9 + var77] = (byte) var75;
                            }
                        }
                    }
                }
            }
            if (var11.field2446 != 0 && arg2 != null) {
                arg2.method1174(arg7 ^ 0xE, var13, var11.field2472, arg9, var12, arg8);
            }
        } else if (arg4 >= 12) {
            class177 var71;
            if (var11.field2416 == -1 && var11.field2454 == null) {
                class209 var70 = var11.method1077(arg4, var26, var19, arg3, var18, var20, arg10, -69, var29, var23, (class273) null);
                if (class281.field4827 && var29) {
                    class35.method210(var70.field3572, var20, var21, var23);
                }
                var71 = var70.field3573;
            } else {
                var71 = new class72(arg6, arg4, arg3, arg5, arg8, arg9, var11.field2416, var11.field2457, (class177) null);
            }
            class184.method1284(arg1, arg8, arg9, var19, 1, 1, var71, 0, var27);
            if (arg10 && arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg1 > 0) {
                class291.field5003[arg1][arg8][arg9] = class264.method1836(class291.field5003[arg1][arg8][arg9], 4);
            }
            if (var11.field2446 != 0 && arg2 != null) {
                arg2.method1174(126, var13, var11.field2472, arg9, var12, arg8);
            }
        } else if (arg4 == 0) {
            class177 var69;
            if (var11.field2416 == -1 && var11.field2454 == null) {
                class209 var68 = var11.method1077(0, var26, var19, arg3, var18, var20, arg10, arg7 ^ 0xFFFFFF9E, var29, var23, (class273) null);
                if (class281.field4827 && var29) {
                    class35.method210(var68.field3572, var20, var21, var23);
                }
                var69 = var68.field3573;
            } else {
                var69 = new class72(arg6, 0, arg3, arg5, arg8, arg9, var11.field2416, var11.field2457, (class177) null);
            }
            class265.method1844(arg1, arg8, arg9, var19, var69, (class177) null, class198.field3419[arg3], 0, var27);
            if (arg10) {
                if (arg3 == 0) {
                    if (var11.field2412) {
                        class122.field2037[arg1][arg8][arg9] = 50;
                        class122.field2037[arg1][arg8][arg9 + 1] = 50;
                    }
                    if (var11.field2440) {
                        class291.field5003[arg1][arg8][arg9] = class264.method1836(class291.field5003[arg1][arg8][arg9], 1);
                    }
                } else if (arg3 == 1) {
                    if (var11.field2412) {
                        class122.field2037[arg1][arg8][arg9 + 1] = 50;
                        class122.field2037[arg1][arg8 + 1][arg9 + 1] = 50;
                    }
                    if (var11.field2440) {
                        class291.field5003[arg1][arg8][arg9 + 1] = class264.method1836(class291.field5003[arg1][arg8][arg9 + 1], 2);
                    }
                } else if (arg3 == 2) {
                    if (var11.field2412) {
                        class122.field2037[arg1][arg8 + 1][arg9] = 50;
                        class122.field2037[arg1][arg8 + 1][arg9 + 1] = 50;
                    }
                    if (var11.field2440) {
                        class291.field5003[arg1][arg8 + 1][arg9] = class264.method1836(class291.field5003[arg1][arg8 + 1][arg9], 1);
                    }
                } else if (arg3 == 3) {
                    if (var11.field2412) {
                        class122.field2037[arg1][arg8][arg9] = 50;
                        class122.field2037[arg1][arg8 + 1][arg9] = 50;
                    }
                    if (var11.field2440) {
                        class291.field5003[arg1][arg8][arg9] = class264.method1836(class291.field5003[arg1][arg8][arg9], 2);
                    }
                }
            }
            if (var11.field2446 != 0 && arg2 != null) {
                arg2.method1192(arg3, arg9, arg8, arg4, (byte) -127, var11.field2472);
            }
            if (var11.field2479 != 16) {
                class181.method1276(arg1, arg8, arg9, var11.field2479);
            }
        } else if (arg4 == arg7) {
            class177 var67;
            if (var11.field2416 == -1 && var11.field2454 == null) {
                class209 var66 = var11.method1077(1, var26, var19, arg3, var18, var20, arg10, -71, var29, var23, (class273) null);
                if (class281.field4827 && var29) {
                    class35.method210(var66.field3572, var20, var21, var23);
                }
                var67 = var66.field3573;
            } else {
                var67 = new class72(arg6, 1, arg3, arg5, arg8, arg9, var11.field2416, var11.field2457, (class177) null);
            }
            class265.method1844(arg1, arg8, arg9, var19, var67, (class177) null, class265.field4495[arg3], 0, var27);
            if (var11.field2412 && arg10) {
                if (arg3 == 0) {
                    class122.field2037[arg1][arg8][arg9 + 1] = 50;
                } else if (arg3 == 1) {
                    class122.field2037[arg1][arg8 + 1][arg9 + 1] = 50;
                } else if (arg3 == 2) {
                    class122.field2037[arg1][arg8 + 1][arg9] = 50;
                } else if (arg3 == 3) {
                    class122.field2037[arg1][arg8][arg9] = 50;
                }
            }
            if (var11.field2446 != 0 && arg2 != null) {
                arg2.method1192(arg3, arg9, arg8, arg4, (byte) -111, var11.field2472);
            }
        } else if (arg4 == 2) {
            int var32 = arg3 + 1 & 0x3;
            class177 var34;
            class177 var36;
            if (var11.field2416 == -1 && var11.field2454 == null) {
                class209 var33 = var11.method1077(2, var26, var19, arg3 + 4, var18, var20, arg10, -110, var29, var23, (class273) null);
                if (class281.field4827 && var29) {
                    class35.method210(var33.field3572, var20, var21, var23);
                }
                var34 = var33.field3573;
                class209 var35 = var11.method1077(2, var26, var19, var32, var18, var20, arg10, -52, var29, var23, (class273) null);
                if (class281.field4827 && var29) {
                    class35.method210(var35.field3572, var20, var21, var23);
                }
                var36 = var35.field3573;
            } else {
                var34 = new class72(arg6, 2, arg3 + 4, arg5, arg8, arg9, var11.field2416, var11.field2457, (class177) null);
                var36 = new class72(arg6, 2, var32, arg5, arg8, arg9, var11.field2416, var11.field2457, (class177) null);
            }
            class265.method1844(arg1, arg8, arg9, var19, var34, var36, class198.field3419[arg3], class198.field3419[var32], var27);
            if (var11.field2440 && arg10) {
                if (arg3 == 0) {
                    class291.field5003[arg1][arg8][arg9] = class264.method1836(class291.field5003[arg1][arg8][arg9], 1);
                    class291.field5003[arg1][arg8][arg9 + 1] = class264.method1836(class291.field5003[arg1][arg8][arg9 + 1], 2);
                } else if (arg3 == 1) {
                    class291.field5003[arg1][arg8][arg9 + 1] = class264.method1836(class291.field5003[arg1][arg8][arg9 + 1], 2);
                    class291.field5003[arg1][arg8 + 1][arg9] = class264.method1836(class291.field5003[arg1][arg8 + 1][arg9], 1);
                } else if (arg3 == 2) {
                    class291.field5003[arg1][arg8 + 1][arg9] = class264.method1836(class291.field5003[arg1][arg8 + 1][arg9], 1);
                    class291.field5003[arg1][arg8][arg9] = class264.method1836(class291.field5003[arg1][arg8][arg9], 2);
                } else if (arg3 == 3) {
                    class291.field5003[arg1][arg8][arg9] = class264.method1836(class291.field5003[arg1][arg8][arg9], 2);
                    class291.field5003[arg1][arg8][arg9] = class264.method1836(class291.field5003[arg1][arg8][arg9], 1);
                }
            }
            if (var11.field2446 != 0 && arg2 != null) {
                arg2.method1192(arg3, arg9, arg8, arg4, (byte) -114, var11.field2472);
            }
            if (var11.field2479 != 16) {
                class181.method1276(arg1, arg8, arg9, var11.field2479);
            }
        } else if (arg4 == 3) {
            class177 var65;
            if (var11.field2416 == -1 && var11.field2454 == null) {
                class209 var64 = var11.method1077(3, var26, var19, arg3, var18, var20, arg10, arg7 - 125, var29, var23, (class273) null);
                if (class281.field4827 && var29) {
                    class35.method210(var64.field3572, var20, var21, var23);
                }
                var65 = var64.field3573;
            } else {
                var65 = new class72(arg6, 3, arg3, arg5, arg8, arg9, var11.field2416, var11.field2457, (class177) null);
            }
            class265.method1844(arg1, arg8, arg9, var19, var65, (class177) null, class265.field4495[arg3], 0, var27);
            if (var11.field2412 && arg10) {
                if (arg3 == 0) {
                    class122.field2037[arg1][arg8][arg9 + 1] = 50;
                } else if (arg3 == 1) {
                    class122.field2037[arg1][arg8 + 1][arg9 + 1] = 50;
                } else if (arg3 == 2) {
                    class122.field2037[arg1][arg8 + 1][arg9] = 50;
                } else if (arg3 == 3) {
                    class122.field2037[arg1][arg8][arg9] = 50;
                }
            }
            if (var11.field2446 != 0 && arg2 != null) {
                arg2.method1192(arg3, arg9, arg8, arg4, (byte) -109, var11.field2472);
            }
        } else if (arg4 == 9) {
            class177 var63;
            if (var11.field2416 == -1 && var11.field2454 == null) {
                class209 var62 = var11.method1077(arg4, var26, var19, arg3, var18, var20, arg10, arg7 - 80, var29, var23, (class273) null);
                if (class281.field4827 && var29) {
                    class35.method210(var62.field3572, var20, var21, var23);
                }
                var63 = var62.field3573;
            } else {
                var63 = new class72(arg6, arg4, arg3, arg5, arg8, arg9, var11.field2416, var11.field2457, (class177) null);
            }
            class184.method1284(arg1, arg8, arg9, var19, 1, 1, var63, 0, var27);
            if (var11.field2446 != 0 && arg2 != null) {
                arg2.method1174(127, var13, var11.field2472, arg9, var12, arg8);
            }
            if (var11.field2479 != 16) {
                class181.method1276(arg1, arg8, arg9, var11.field2479);
            }
        } else if (arg4 == 4) {
            class177 var38;
            if (var11.field2416 == -1 && var11.field2454 == null) {
                class209 var37 = var11.method1077(4, var26, var19, arg3, var18, var20, arg10, -106, var29, var23, (class273) null);
                if (class281.field4827 && var29) {
                    class35.method210(var37.field3572, var20, var21, var23);
                }
                var38 = var37.field3573;
            } else {
                var38 = new class72(arg6, 4, arg3, arg5, arg8, arg9, var11.field2416, var11.field2457, (class177) null);
            }
            class206.method1493(arg1, arg8, arg9, var19, var38, (class177) null, class198.field3419[arg3], 0, 0, 0, var27);
        } else if (arg4 == 5) {
            int var57 = 16;
            long var58 = class252.method1727(arg1, arg8, arg9);
            if (var58 != 0L) {
                var57 = class289.method2046(-12453, (int) (var58 >>> 32) & Integer.MAX_VALUE).field2479;
            }
            class177 var61;
            if (var11.field2416 == -1 && var11.field2454 == null) {
                class209 var60 = var11.method1077(4, var26, var19, arg3, var18, var20, arg10, -117, var29, var23, (class273) null);
                if (class281.field4827 && var29) {
                    class35.method210(var60.field3572, var20 - (class264.field4475[arg3] * 8), var21, var23 - class253.field4260[arg3] * 8);
                }
                var61 = var60.field3573;
            } else {
                var61 = new class72(arg6, 4, arg3, arg5, arg8, arg9, var11.field2416, var11.field2457, (class177) null);
            }
            class206.method1493(arg1, arg8, arg9, var19, var61, (class177) null, class198.field3419[arg3], 0, class264.field4475[arg3] * var57, class253.field4260[arg3] * var57, var27);
        } else if (arg4 == 6) {
            int var52 = 8;
            long var53 = class252.method1727(arg1, arg8, arg9);
            if (var53 != 0L) {
                var52 = class289.method2046(-12453, (int) (var53 >>> 32) & Integer.MAX_VALUE).field2479 / 2;
            }
            class177 var56;
            if (var11.field2416 == -1 && var11.field2454 == null) {
                class209 var55 = var11.method1077(4, var26, var19, arg3 + 4, var18, var20, arg10, arg7 ^ 0xFFFFFFAB, var29, var23, (class273) null);
                if (class281.field4827 && var29) {
                    class35.method210(var55.field3572, var20 - (class14.field197[arg3] * 8), var21, var23 - (class24.field374[arg3] * 8));
                }
                var56 = var55.field3573;
            } else {
                var56 = new class72(arg6, 4, arg3 + 4, arg5, arg8, arg9, var11.field2416, var11.field2457, (class177) null);
            }
            class206.method1493(arg1, arg8, arg9, var19, var56, (class177) null, 256, arg3, class14.field197[arg3] * var52, class24.field374[arg3] * var52, var27);
        } else if (arg4 == 7) {
            int var39 = arg3 + 2 & 0x3;
            class177 var41;
            if (var11.field2416 == -1 && var11.field2454 == null) {
                class209 var40 = var11.method1077(4, var26, var19, var39 + 4, var18, var20, arg10, -112, var29, var23, (class273) null);
                if (class281.field4827 && var29) {
                    class35.method210(var40.field3572, var20, var21, var23);
                }
                var41 = var40.field3573;
            } else {
                var41 = new class72(arg6, 4, var39 + 4, arg5, arg8, arg9, var11.field2416, var11.field2457, (class177) null);
            }
            class206.method1493(arg1, arg8, arg9, var19, var41, (class177) null, 256, var39, 0, 0, var27);
        } else if (arg4 == 8) {
            int var42 = 8;
            long var43 = class252.method1727(arg1, arg8, arg9);
            if (var43 != 0L) {
                var42 = class289.method2046(-12453, (int) (var43 >>> 32) & Integer.MAX_VALUE).field2479 / 2;
            }
            int var45 = arg3 + 2 & 0x3;
            class177 var49;
            class177 var51;
            if (var11.field2416 == -1 && var11.field2454 == null) {
                int var46 = class24.field374[arg3] * 8;
                int var47 = class14.field197[arg3] * 8;
                class209 var48 = var11.method1077(4, var26, var19, arg3 + 4, var18, var20, arg10, -95, var29, var23, (class273) null);
                if (class281.field4827 && var29) {
                    class35.method210(var48.field3572, var20 - var47, var21, var23 - var46);
                }
                var49 = var48.field3573;
                class209 var50 = var11.method1077(4, var26, var19, var45 + 4, var18, var20, arg10, arg7 - 56, var29, var23, (class273) null);
                if (class281.field4827 && var29) {
                    class35.method210(var50.field3572, var20 - var47, var21, var23 - var46);
                }
                var51 = var50.field3573;
            } else {
                var49 = new class72(arg6, 4, arg3 + 4, arg5, arg8, arg9, var11.field2416, var11.field2457, (class177) null);
                var51 = new class72(arg6, 4, var45 + 4, arg5, arg8, arg9, var11.field2416, var11.field2457, (class177) null);
            }
            class206.method1493(arg1, arg8, arg9, var19, var49, var51, 256, arg3, class14.field197[arg3] * var42, class24.field374[arg3] * var42, var27);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIILtl;II)V", line = 737)
    public static final void method269(int arg0, int arg1, int arg2, int arg3, class197 arg4, int arg5, int arg6) {
        if (arg0 < 31) {
            return;
        }
        int var7 = arg1 * arg1 + (arg5 * arg5);
        field685++;
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg4.field3294 / 2, arg4.field3253 / 2);
        if ((var8 * var8) >= var7) {
            class79.method547(arg4, arg1, arg5, arg6, -1, arg2, class187.field3007[arg3]);
            return;
        }
        var8 -= 10;
        int var9 = class76.field1253 + class206.field3541 & 0x7FF;
        int var10 = class283.field4870[var9];
        int var11 = var10 * 256 / (class304.field5198 + 256);
        int var12 = class283.field4877[var9];
        int var13 = var12 * 256 / (class304.field5198 + 256);
        int var14 = arg1 * var11 + arg5 * var13 >> 16;
        int var15 = arg5 * var11 - (arg1 * var13) >> 16;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) (Math.sin(var16) * (double) var8);
        int var19 = (int) (Math.cos(var16) * (double) var8);
        if (class281.field4827) {
            ((class98) class275.field4733[arg3]).method775(240, 240, (arg2 + var18 + (arg4.field3294 / 2)) * 16, (arg4.field3253 / 2 + arg6 - var19) * 16, (int) (var16 * 10430.378D), 4096);
        } else {
            ((class83) class275.field4733[arg3]).method394(arg4.field3294 / 2 + arg2 + var18 - 10, arg4.field3253 / 2 + -var19 + arg6 + -10, 20, 20, 15, 15, var16, 256);
        }
    }
}
