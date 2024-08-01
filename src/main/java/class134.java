import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("od")
public class class134 extends class85 {

    @OriginalMember(owner = "od", name = "S", descriptor = "I")
    public static int field2566 = -1;

    @OriginalMember(owner = "od", name = "Y", descriptor = "Llf;")
    private static class109 field2572 = class35.method275("Unable to find ", 2);

    @OriginalMember(owner = "od", name = "W", descriptor = "Z")
    public static boolean field2570 = false;

    @OriginalMember(owner = "od", name = "U", descriptor = "Llf;")
    public static class109 field2568 = field2572;

    @OriginalMember(owner = "od", name = "X", descriptor = "Leh;")
    public static class49 field2571 = new class49(32);

    @OriginalMember(owner = "od", name = "Q", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "od", name = "R", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "od", name = "T", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "od", name = "V", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "od", name = "Z", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "od", name = "ab", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "od", name = "bb", descriptor = "Lvg;")
    public static class200 field2575;

    @OriginalMember(owner = "od", name = "<init>", descriptor = "()V")
    public class134() {
        super(0, true);
    }

    @OriginalMember(owner = "od", name = "a", descriptor = "(IIIIB)V")
    public static final void method948(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (~class140.field2725 == -1 && !class123.field2360) {
            class12.method81(arg1 - arg3, arg2 - arg0, class27.field595, (short) 25, 0L, 500, class174.field3306);
            ++class95.field1946;
        }
        ++field2569;
        long var5 = -1L;
        if (arg4 <= 16) {
            field2575 = null;
        }
        for (int var7 = 0; class189.field3623 > var7; ++var7) {
            long var8 = class189.field3639[var7];
            int var10 = (16378 & (int) var8) >> 7;
            int var11 = Integer.MAX_VALUE & (int) (var8 >>> 32);
            int var12 = (int) var8 & 127;
            int var13 = 3 & (int) var8 >> 29;
            if (var5 != var8) {
                var5 = var8;
                if (~var13 == -3 && class34.method269(class72.field1405, var12, var10, var8)) {
                    class78 var14 = class140.method1000(var11, 0);
                    if (var14.field1528 != null) {
                        var14 = var14.method495(118);
                    }
                    if (var14 == null) {
                        continue;
                    }
                    if (class140.field2725 == 1) {
                        ++class86.field1769;
                        class12.method81(var10, var12, class70.field1350, (short) 31, var8, 500, class36.method279(new class109[] { class204.field4001, class202.field3971, var14.field1541 }, 123));
                    } else if (class123.field2360) {
                        if (~(4 & class156.field2939) == -5) {
                            class12.method81(var10, var12, class116.field2296, (short) 50, var8, 500, class36.method279(new class109[] { class170.field3161, class202.field3971, var14.field1541 }, -106));
                            ++class109.field2145;
                        }
                    } else {
                        ++class130.field2522;
                        class109[] var15 = var14.field1506;
                        if (class10.field165) {
                            var15 = class103.method741((byte) -84, var15);
                        }
                        if (var15 != null) {
                            for (int var16 = 4; ~var16 <= -1; --var16) {
                                if (var15[var16] != null) {
                                    ++class4.field59;
                                    short var17 = 0;
                                    if (~var16 == -1) {
                                        var17 = 58;
                                    }
                                    if (var16 == 1) {
                                        var17 = 19;
                                    }
                                    if (var16 == 2) {
                                        var17 = 23;
                                    }
                                    if (var16 == 3) {
                                        var17 = 40;
                                    }
                                    if (var16 == 4) {
                                        var17 = 1007;
                                    }
                                    class12.method81(var10, var12, var15[var16], var17, var8, 500, class36.method279(new class109[] { class80.field1582, var14.field1541 }, 119));
                                }
                            }
                        }
                        class12.method81(var10, var12, class55.field1103, (short) 1006, (long) var14.field1518, 500, class36.method279(new class109[] { class80.field1582, var14.field1541 }, 125));
                    }
                }
                if (~var13 == -2) {
                    class139 var18 = class183.field3444[var11];
                    if (var18.field2691.field3175 == 1 && ~(127 & var18.field3549) == -65 && ~(127 & var18.field3609) == -65) {
                        for (int var19 = 0; class1.field10 > var19; ++var19) {
                            class139 var22 = class183.field3444[class1.field8[var19]];
                            if (var22 != null && var18 != var22 && ~var22.field2691.field3175 == -2 && var18.field3549 == var22.field3549 && var18.field3609 == var22.field3609) {
                                class210.method1366(var12, var22.field2691, var10, 125, class1.field8[var19]);
                            }
                        }
                        for (int var20 = 0; ~var20 > ~class157.field2956; ++var20) {
                            class184 var21 = class202.field3975[class125.field2405[var20]];
                            if (var21 != null && ~var18.field3549 == ~var21.field3549 && ~var18.field3609 == ~var21.field3609) {
                                class143.method1014(class125.field2405[var20], var12, var21, (byte) 32, var10);
                            }
                        }
                    }
                    class210.method1366(var12, var18.field2691, var10, 118, var11);
                }
                if (~var13 == -1) {
                    class184 var23 = class202.field3975[var11];
                    if (~(var23.field3549 & 127) == -65 && (127 & var23.field3609) == 64) {
                        for (int var24 = 0; ~var24 > ~class1.field10; ++var24) {
                            class139 var27 = class183.field3444[class1.field8[var24]];
                            if (var27 != null && ~var27.field2691.field3175 == -2 && var23.field3549 == var27.field3549 && ~var23.field3609 == ~var27.field3609) {
                                class210.method1366(var12, var27.field2691, var10, 101, class1.field8[var24]);
                            }
                        }
                        for (int var25 = 0; ~class157.field2956 < ~var25; ++var25) {
                            class184 var26 = class202.field3975[class125.field2405[var25]];
                            if (var26 != null && var23 != var26 && ~var23.field3549 == ~var26.field3549 && ~var23.field3609 == ~var26.field3609) {
                                class143.method1014(class125.field2405[var25], var12, var26, (byte) 32, var10);
                            }
                        }
                    }
                    class143.method1014(var11, var12, var23, (byte) 32, var10);
                }
                if (var13 == 3) {
                    class181 var28 = class201.field3965[class72.field1405][var12][var10];
                    if (var28 != null) {
                        for (class72 var29 = (class72) var28.method1226(121); var29 != null; var29 = (class72) var28.method1233((byte) -101)) {
                            class83 var30 = class128.method926(var29.field1399, -4);
                            if (~class140.field2725 == -2) {
                                class12.method81(var10, var12, class70.field1350, (short) 8, (long) var29.field1399, 500, class36.method279(new class109[] { class204.field4001, class85.field1743, var30.field1644 }, -52));
                                ++class123.field2373;
                            } else if (class123.field2360) {
                                if ((1 & class156.field2939) == 1) {
                                    ++class72.field1400;
                                    class12.method81(var10, var12, class116.field2296, (short) 43, (long) var29.field1399, 500, class36.method279(new class109[] { class170.field3161, class85.field1743, var30.field1644 }, 127));
                                }
                            } else {
                                ++class128.field2481;
                                class109[] var31 = var30.field1679;
                                if (class10.field165) {
                                    var31 = class103.method741((byte) -89, var31);
                                }
                                for (int var32 = 4; ~var32 <= -1; --var32) {
                                    if (var31 != null && var31[var32] != null) {
                                        ++class8.field110;
                                        byte var33 = 0;
                                        if (~var32 == -1) {
                                            var33 = 30;
                                        }
                                        if (var32 == 1) {
                                            var33 = 2;
                                        }
                                        if (~var32 == -3) {
                                            var33 = 13;
                                        }
                                        if (~var32 == -4) {
                                            var33 = 49;
                                        }
                                        if (var32 == 4) {
                                            var33 = 47;
                                        }
                                        class12.method81(var10, var12, var31[var32], var33, (long) var29.field1399, 500, class36.method279(new class109[] { class79.field1559, var30.field1644 }, 118));
                                    } else if (var32 == 2) {
                                        class12.method81(var10, var12, class127.field2460, (short) 13, (long) var29.field1399, 500, class36.method279(new class109[] { class79.field1559, var30.field1644 }, -81));
                                        ++class14.field221;
                                    }
                                }
                                class12.method81(var10, var12, class55.field1103, (short) 1003, (long) var29.field1399, 500, class36.method279(new class109[] { class79.field1559, var30.field1644 }, 126));
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "od", name = "a", descriptor = "(II)[I")
    public final int[] method87(int arg0, int arg1) {
        if (arg0 >= -49) {
            method950(57, -31, -126, -104, -29, -80);
        }
        int[] var3 = super.field1736.method835(-314, arg1);
        if (super.field1736.field2253) {
            class122.method877(var3, 0, class57.field1152, class54.field1083[arg1]);
        }
        ++field2574;
        return var3;
    }

    @OriginalMember(owner = "od", name = "e", descriptor = "(I)V")
    public static final void method949(int arg0) {
        ++field2573;
        class193.field3685.method1088(-51);
        class194.field3701.method1088(-51);
        if (arg0 < 108) {
            field2575 = null;
        }
    }

    @OriginalMember(owner = "od", name = "a", descriptor = "(IIIIII)V")
    public static final void method950(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2567;
        if (arg0 != 1536) {
            method951((class127) null, -7, -14, -40, -49, 89, -54, -49);
        }
        long var6 = class18.method155(arg1, arg5, arg2);
        if (~var6 != -1L) {
            int var8 = 3 & (int) var6 >> 20;
            int var9 = arg4;
            int[] var10 = class136.field2641.field2007;
            int var11 = (int) var6 >> 14 & 31;
            if (var6 > 0L) {
                var9 = arg3;
            }
            int var12 = arg5 * 4 + (-(arg2 * 512) + 52736) * 4 + 24624;
            int var13 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            class78 var14 = class140.method1000(var13, arg0 ^ 1536);
            if (var14.field1530 != -1) {
                class37 var15 = class47.field982[var14.field1530];
                if (var15 != null) {
                    int var16 = (var14.field1501 * 4 + -var15.field801) / 2;
                    int var17 = (var14.field1498 * 4 - var15.field806) / 2;
                    var15.method280(48 - (-(arg5 * 4) + -var16), (-var14.field1498 + 104 + -arg2) * 4 + var17 + 48);
                }
            } else {
                if (var11 == 0 || ~var11 == -3) {
                    if (var8 != 0) {
                        if (~var8 == -2) {
                            var10[var12] = var9;
                            var10[var12 - -1] = var9;
                            var10[var12 + 2] = var9;
                            var10[var12 + 3] = var9;
                        } else if (~var8 == -3) {
                            var10[var12 + 3] = var9;
                            var10[var12 + 515] = var9;
                            var10[var12 + 1027] = var9;
                            var10[var12 + 1536 + 3] = var9;
                        } else if (~var8 == -4) {
                            var10[var12 + 1536] = var9;
                            var10[var12 - -1 + 1536] = var9;
                            var10[var12 + 2 + 1536] = var9;
                            var10[var12 + 1536 + 3] = var9;
                        }
                    } else {
                        var10[var12] = var9;
                        var10[var12 + 512] = var9;
                        var10[var12 + 1024] = var9;
                        var10[var12 + 1536] = var9;
                    }
                }
                if (~var11 == -4) {
                    if (~var8 == -1) {
                        var10[var12] = var9;
                    } else if (var8 == 1) {
                        var10[var12 - -3] = var9;
                    } else if (~var8 == -3) {
                        var10[var12 + 1539] = var9;
                    } else if (~var8 == -4) {
                        var10[var12 + 1536] = var9;
                    }
                }
                if (var11 == 2) {
                    if (var8 != 3) {
                        if (~var8 == -1) {
                            var10[var12] = var9;
                            var10[var12 + 1] = var9;
                            var10[var12 + 2] = var9;
                            var10[var12 + 3] = var9;
                        } else if (~var8 != -2) {
                            if (var8 == 2) {
                                var10[var12 + 1536] = var9;
                                var10[var12 + 1 + 1536] = var9;
                                var10[var12 + 1538] = var9;
                                var10[var12 + 3 + 1536] = var9;
                            }
                        } else {
                            var10[var12 - -3] = var9;
                            var10[var12 + 515] = var9;
                            var10[var12 + 3 + 1024] = var9;
                            var10[var12 + 1536 - -3] = var9;
                        }
                    } else {
                        var10[var12] = var9;
                        var10[var12 + 512] = var9;
                        var10[var12 - -1024] = var9;
                        var10[var12 + 1536] = var9;
                    }
                }
            }
        }
        long var18 = class178.method1210(arg1, arg5, arg2);
        if (~var18 != -1L) {
            int var20 = ((int) var18 & 513094) >> 14;
            int var21 = 3 & (int) var18 >> 20;
            int var22 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            class78 var23 = class140.method1000(var22, arg0 ^ 1536);
            if (~var23.field1530 != 0) {
                class37 var24 = class47.field982[var23.field1530];
                if (var24 != null) {
                    int var25 = (var23.field1501 * 4 - var24.field801) / 2;
                    int var26 = (var23.field1498 * 4 + -var24.field806) / 2;
                    var24.method280(48 - -(arg5 * 4) + var25, (-var23.field1498 + 104 - arg2) * 4 + var26 + 48);
                }
            } else if (~var20 == -10) {
                int var27 = 15658734;
                int var28 = (-(arg2 * 512) + 52736) * 4 + arg5 * 4 + 24624;
                if (var18 > 0L) {
                    var27 = 15597568;
                }
                int[] var29 = class136.field2641.field2007;
                if (var21 != 0 && ~var21 != -3) {
                    var29[var28] = var27;
                    var29[var28 - -512 + 1] = var27;
                    var29[var28 + 2 - -1024] = var27;
                    var29[var28 + 1536 + 3] = var27;
                } else {
                    var29[var28 + 1536] = var27;
                    var29[var28 + 1 - -1024] = var27;
                    var29[var28 + 2 + 512] = var27;
                    var29[var28 + 3] = var27;
                }
            }
        }
        long var30 = class77.method483(arg1, arg5, arg2);
        if (~var30 != -1L) {
            int var32 = (int) (var30 >>> 32) & Integer.MAX_VALUE;
            class78 var33 = class140.method1000(var32, 0);
            if (~var33.field1530 != 0) {
                class37 var34 = class47.field982[var33.field1530];
                if (var34 != null) {
                    int var35 = (var33.field1501 * 4 + -var34.field801) / 2;
                    int var36 = (var33.field1498 * 4 + -var34.field806) / 2;
                    var34.method280(arg5 * 4 + 48 + var35, (-arg2 + 104 + -var33.field1498) * 4 + var36 + 48);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "od", name = "a", descriptor = "(Lnf;IIIIIII)V")
    public static final void method951(class127 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8;
        int var9 = var8 = (arg6 << 7) - class18.field371;
        int var10;
        int var11 = var10 = (arg7 << 7) - class144.field2782;
        int var12;
        int var13 = var12 = var9 + 128;
        int var14;
        int var15 = var14 = var11 + 128;
        int var16 = class29.field623[arg1][arg6][arg7] - class178.field3369;
        int var17 = class29.field623[arg1][arg6 + 1][arg7] - class178.field3369;
        int var18 = class29.field623[arg1][arg6 + 1][arg7 + 1] - class178.field3369;
        int var19 = class29.field623[arg1][arg6][arg7 + 1] - class178.field3369;
        int var20 = arg4 * var11 + arg5 * var9 >> 16;
        int var21 = arg5 * var11 - arg4 * var9 >> 16;
        int var23 = arg3 * var16 - arg2 * var21 >> 16;
        int var24 = arg2 * var16 + arg3 * var21 >> 16;
        if (var24 >= 50) {
            int var26 = arg4 * var10 + arg5 * var13 >> 16;
            int var27 = arg5 * var10 - arg4 * var13 >> 16;
            int var29 = arg3 * var17 - arg2 * var27 >> 16;
            int var30 = arg2 * var17 + arg3 * var27 >> 16;
            if (var30 >= 50) {
                int var32 = arg4 * var15 + arg5 * var12 >> 16;
                int var33 = arg5 * var15 - arg4 * var12 >> 16;
                int var35 = arg3 * var18 - arg2 * var33 >> 16;
                int var36 = arg2 * var18 + arg3 * var33 >> 16;
                if (var36 >= 50) {
                    int var38 = arg4 * var14 + arg5 * var8 >> 16;
                    int var39 = arg5 * var14 - arg4 * var8 >> 16;
                    int var41 = arg3 * var19 - arg2 * var39 >> 16;
                    int var42 = arg2 * var19 + arg3 * var39 >> 16;
                    if (var42 >= 50) {
                        int var44 = (var20 << 9) / var24 + class124.field2375;
                        int var45 = (var23 << 9) / var24 + class124.field2382;
                        int var46 = (var26 << 9) / var30 + class124.field2375;
                        int var47 = (var29 << 9) / var30 + class124.field2382;
                        int var48 = (var32 << 9) / var36 + class124.field2375;
                        int var49 = (var35 << 9) / var36 + class124.field2382;
                        int var50 = (var38 << 9) / var42 + class124.field2375;
                        int var51 = (var41 << 9) / var42 + class124.field2382;
                        class124.field2374 = 0;
                        if ((var47 - var51) * (var48 - var50) - (var46 - var50) * (var49 - var51) > 0) {
                            if (class128.field2485 && class147.method1029(class34.field776, class177.field3345, var49, var51, var47, var48, var50, var46)) {
                                class9.field142 = arg6;
                                client.field662 = arg7;
                            }
                            class124.field2384 = false;
                            if (var48 < 0 || var50 < 0 || var46 < 0 || var48 > class124.field2392 || var50 > class124.field2392 || var46 > class124.field2392) {
                                class124.field2384 = true;
                            }
                            if (arg0.field2461 == -1) {
                                if (arg0.field2451 != 12345678) {
                                    class124.method890(var49, var51, var47, var48, var50, var46, arg0.field2451, arg0.field2459, arg0.field2447);
                                }
                            } else if (!class194.field3714) {
                                if (arg0.field2454) {
                                    class124.method903(var49, var51, var47, var48, var50, var46, arg0.field2451, arg0.field2459, arg0.field2447, var20, var26, var38, var23, var29, var41, var24, var30, var42, arg0.field2461);
                                } else {
                                    class124.method903(var49, var51, var47, var48, var50, var46, arg0.field2451, arg0.field2459, arg0.field2447, var32, var38, var26, var35, var41, var29, var36, var42, var30, arg0.field2461);
                                }
                            } else {
                                int var52 = class124.field2385.method4(arg0.field2461, false);
                                class124.method890(var49, var51, var47, var48, var50, var46, class139.method994(var52, arg0.field2451), class139.method994(var52, arg0.field2459), class139.method994(var52, arg0.field2447));
                            }
                        }
                        if ((var44 - var46) * (var51 - var47) - (var45 - var47) * (var50 - var46) > 0) {
                            if (class128.field2485 && class147.method1029(class34.field776, class177.field3345, var45, var47, var51, var44, var46, var50)) {
                                class9.field142 = arg6;
                                client.field662 = arg7;
                            }
                            class124.field2384 = false;
                            if (var44 < 0 || var46 < 0 || var50 < 0 || var44 > class124.field2392 || var46 > class124.field2392 || var50 > class124.field2392) {
                                class124.field2384 = true;
                            }
                            if (arg0.field2461 == -1) {
                                if (arg0.field2456 != 12345678) {
                                    class124.method890(var45, var47, var51, var44, var46, var50, arg0.field2456, arg0.field2447, arg0.field2459);
                                    return;
                                }
                            } else {
                                if (!class194.field3714) {
                                    class124.method903(var45, var47, var51, var44, var46, var50, arg0.field2456, arg0.field2447, arg0.field2459, var20, var26, var38, var23, var29, var41, var24, var30, var42, arg0.field2461);
                                    return;
                                }
                                int var53 = class124.field2385.method4(arg0.field2461, false);
                                class124.method890(var45, var47, var51, var44, var46, var50, class139.method994(var53, arg0.field2456), class139.method994(var53, arg0.field2447), class139.method994(var53, arg0.field2459));
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "od", name = "f", descriptor = "(I)V")
    public static void method952(int arg0) {
        field2571 = null;
        if (arg0 != 1536) {
            method950(0, -75, -10, -60, 77, -125);
        }
        field2575 = null;
        field2568 = null;
        field2572 = null;
    }

    @OriginalMember(owner = "od", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method953(byte arg0, byte[] arg1) {
        ++field2565;
        class86 var2 = new class86(arg1);
        int var3 = var2.method598((byte) 103);
        if (arg0 != -53) {
            method952(125);
        }
        int var4 = var2.method582(15);
        if (~var4 <= -1 && (~class63.field1221 == -1 || ~class63.field1221 <= ~var4)) {
            if (~var3 == -1) {
                byte[] var5 = new byte[var4];
                var2.method583(var5, 0, var4, 1174839336);
                return var5;
            } else {
                int var6 = var2.method582(15);
                if (var6 >= 0 && (~class63.field1221 == -1 || var6 <= class63.field1221)) {
                    byte[] var7 = new byte[var6];
                    if (var3 == 1) {
                        class110.method812(var7, var6, arg1, var4, 9);
                    } else {
                        class210.field4079.method299(28501, var2, var7);
                    }
                    return var7;
                } else {
                    throw new RuntimeException();
                }
            }
        } else {
            throw new RuntimeException();
        }
    }
}
