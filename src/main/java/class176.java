import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class176 {

    @OriginalMember(owner = "client!db", name = "b", descriptor = "Ldj;")
    private static class191 field2462 = new class191(16);

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field2470 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field2467 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "[B")
    private static byte[] field2469 = new byte[1];

    @OriginalMember(owner = "client!db", name = "m", descriptor = "[S")
    private static short[] field2473 = new short[1];

    @OriginalMember(owner = "client!db", name = "l", descriptor = "Lkn;")
    public static class442 field2472 = new class442();

    @OriginalMember(owner = "client!db", name = "h", descriptor = "F")
    public static float field2468;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "F")
    public static float field2471;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "Ltj;")
    public static class108 field2461;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "Lne;")
    public static class173 field2463;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "Ldj;")
    private static class191 field2488;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Lna;")
    public static class30 field2465;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "[B")
    private static byte[] field2476;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "[B")
    private static byte[] field2477;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "[B")
    private static byte[] field2487;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "[B")
    private static byte[] field2490;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "[B")
    private static byte[] field2491;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "[I")
    private static int[] field2485;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "[S")
    private static short[] field2483;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "[S")
    private static short[] field2495;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "[[[B")
    public static byte[][][] field2464;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "[[[Lcl;")
    private static class145[][][] field2478;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIII)V", line = 3)
    public static final void method1241(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2484 = arg0 - field2486;
        field2480 = arg1 - field2493;
        field2489 = arg2 - field2486;
        field2475 = arg3 - field2493;
        field2482 = arg4;
        field2474 = arg5;
        field2479 = arg6;
        field2481 = arg7;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lvq;IIIIIII[S[BZ)V", line = 14)
    private static final void method1242(class269 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method1012(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field2485[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method1012(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class335.method2198(arg7 >> 6 & 0x3, var12, var11, arg1, field2464, arg5, field2466, field2485[arg6], arg4, (byte) 57, arg2, arg0, arg3);
                }
            }
        }
        if (arg8 == null) {
            return;
        }
        int var14;
        if (arg3 == 1) {
            var14 = arg1;
        } else {
            var14 = arg1 + arg3 - 1;
        }
        int var15;
        if (arg4 == 1) {
            var15 = arg2;
        } else {
            var15 = arg2 + arg4 - 1;
        }
        for (int var16 = 0; var16 < arg8.length; var16++) {
            int var17 = arg9[var16] & 0x3F;
            if (var17 == 0 || var17 == 2 || var17 == 3 || var17 == 9) {
                class282 var18 = class398.method2496(-128, arg8[var16] & 0xFFFF);
                if (var18.field4077 == -1) {
                    int var19 = -3355444;
                    if (var18.field4036 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method946(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method990(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method946(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method990(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method946(arg1, arg2, arg4, -1, 0);
                            arg0.method990(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method946(var14, arg2, arg4, -1, 0);
                            arg0.method990(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method946(var14, arg2, arg4, -1, 0);
                            arg0.method990(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method946(arg1, arg2, arg4, -1, 0);
                            arg0.method990(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method990(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method990(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method990(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method990(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method990(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method990(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "()V", line = 177)
    public static final void method1243() {
        field2477 = null;
        field2491 = null;
        field2495 = null;
        field2490 = null;
        field2476 = null;
        field2483 = null;
        field2487 = null;
        field2488 = null;
        field2478 = null;
        field2485 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lvq;Llf;IIII[I[I)V", line = 190)
    private static final void method1244(class269 arg0, class130 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method837(true);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method837(true);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field2477[field2494 * arg5 + arg4] = (byte) var11;
                    field2490[field2494 * arg5 + arg4] = 0;
                } else {
                    field2490[field2494 * arg5 + arg4] = (byte) var11;
                    field2476[field2494 * arg5 + arg4] = 0;
                    field2477[field2494 * arg5 + arg4] = arg1.method823((byte) 115);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method837(true);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method837(true);
                var18 = arg1.method837(true);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method837(true);
            }
            if (var15 == 0) {
                field2477[field2494 * arg5 + arg4] = (byte) var16;
                field2490[field2494 * arg5 + arg4] = (byte) var17;
                field2476[field2494 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field2483[field2494 * arg5 + arg4] = (short) (arg1.method798(false) + 1);
                    field2487[field2494 * arg5 + arg4] = arg1.method823((byte) -81);
                } else if (var19 > 1) {
                    field2483[field2494 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method798(false);
                        var21[var22] = arg1.method823((byte) -26);
                    }
                    field2488.method1376(new class217(var20, var21), (long) (arg4 << 16 | arg5), 82);
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method798(false);
                        var24[var25] = arg1.method823((byte) -95);
                    }
                }
                if (field2478[var15 - 1][arg2 - (field2486 >> 6)][arg3 - (field2493 >> 6)] == null) {
                    field2478[var15 - 1][arg2 - (field2486 >> 6)][arg3 - (field2493 >> 6)] = new class145();
                }
                class201 var26 = new class201(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field2478[var15 - 1][arg2 - (field2486 >> 6)][arg3 - (field2493 >> 6)].method1076(123, var26);
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lvq;IIII[S[B)V", line = 324)
    private static final void method1245(class269 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class282 var8 = class398.method2496(-125, arg5[var7] & 0xFFFF);
            int var9 = var8.field4077;
            if (var9 != -1) {
                class320 var10 = class41.method281(var9, true);
                class256 var11 = var10.method2125(var8.field4117 ? arg6[var7] >> 6 & 0x3 : 0, arg0, var8.field4096 ? var8.field4056 : false, (byte) -128);
                if (var11 != null) {
                    int var12 = arg3 * var11.method83() >> 2;
                    int var13 = arg4 * var11.method75() >> 2;
                    if (var10.field4682) {
                        int var14 = var8.field4090;
                        int var15 = var8.field4085;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field4679 == 0) {
                            var11.method1774(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method74(arg1, arg2 + arg4 - var13, var12, var13, 1, var10.field4679 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lvq;IIII)Lkn;", line = 384)
    private static final class442 method1246(class269 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class194 var5 = (class194) field2472.method2752(-100); var5 != null; var5 = (class194) field2472.method2754(-1)) {
            method1258(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field2472;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "()V", line = 395)
    public static final void method1247() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field2465.field369; var1++) {
            boolean var2 = field2463.method1229((byte) 45, var0, field2465.field366[var1] >> 14 & 0x3FFF, field2465.field366[var1] >> 28 & 0x3, field2465.field366[var1] & 0x3FFF);
            if (var2) {
                class194 var3 = new class194(field2465.field370[var1]);
                var3.field2793 = var0[1] - field2486;
                var3.field2797 = var0[2] - field2493;
                field2472.method2756(-61, var3);
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(Lvq;IIII)V", line = 417)
    private static final void method1248(class269 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field2489 - field2484;
        int var6 = field2480 - field2475;
        if (field2489 < field2494) {
            var5++;
        }
        if (field2480 < field2492) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field2482;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field2482;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field2484 + var7;
                if (var52 >= 0 && var52 < field2494) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field2481 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field2481 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field2475 + var53;
                            int var58 = field2494 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field2492) {
                                var59 = (field2491[var58] & 0xFF) << 16 | field2495[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field2490[var58] & 0xFF;
                                var61 = field2483[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field2463.field2434 != -1) {
                                    var62 = field2463.field2434 | 0xFF000000;
                                } else if ((field2484 + var7 & 0x4) == (field2480 + var53 & 0x4)) {
                                    var62 = field2485[class417.field6000 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method1012(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method1242(arg0, var49, var54, var51, var56, var59, var60, field2476[var58], (short[]) null, (byte[]) null, true);
                            } else if (var61 == 65535) {
                                class217 var63 = (class217) field2488.method1373((long) (var52 << 16 | var57), -14);
                                if (var63 != null) {
                                    method1242(arg0, var49, var54, var51, var56, var59, var60, field2476[var58], var63.field3123, var63.field3124, true);
                                }
                            } else {
                                field2473[0] = (short) (var61 - 1);
                                field2469[0] = field2487[var58];
                                method1242(arg0, var49, var54, var51, var56, var59, var60, field2476[var58], field2473, field2469, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field2481 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field2481 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field2463.field2434 != -1) {
                            var68 = field2463.field2434 | 0xFF000000;
                        } else if ((field2484 + var7 & 0x4) == (field2480 + var64 & 0x4)) {
                            var68 = field2485[class417.field6000 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method1012(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field2482;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field2482;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field2484 + var8;
                if (var41 >= 0 && var41 < field2494) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field2481 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field2481 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field2475 + var42;
                            if (var46 >= 0 && var46 < field2492) {
                                int var47 = field2483[field2494 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method1245(arg0, var38, var43, var40, var45, (short[]) null, (byte[]) null);
                                } else if (var47 == 65535) {
                                    class217 var48 = (class217) field2488.method1373((long) (var41 << 16 | var46), 123);
                                    if (var48 != null) {
                                        method1245(arg0, var38, var43, var40, var45, var48.field3123, var48.field3124);
                                    }
                                } else {
                                    field2473[0] = (short) (var47 - 1);
                                    field2469[0] = field2487[field2494 * var46 + var41];
                                    method1245(arg0, var38, var43, var40, var45, field2473, field2469);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field2484 >> 6;
        int var10 = field2475 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field2489 >> 6;
        int var12 = field2480 >> 6;
        if (var11 >= field2478[0].length) {
            var11 = field2478[0].length - 1;
        }
        if (var12 >= field2478[0][0].length) {
            var12 = field2478[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class145 var28 = field2478[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field2486 >> 6) + var14) * 64;
                        int var30 = ((field2493 >> 6) + var27) * 64;
                        for (class201 var31 = (class201) var28.method1082(127); var31 != null; var31 = (class201) var28.method1078(false)) {
                            int var32 = var31.field2860 + var29 - field2486 - field2484;
                            int var33 = var31.field2857 + var30 - field2493 - field2475;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field2482;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field2482;
                            int var36 = field2481 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field2481 - (arg2 * var33 + arg4 >> 16);
                            method1242(arg0, var34, var36, var35 - var34, var37 - var36, var31.field2861, var31.field2859 & 0xFF, var31.field2862, var31.field2856, var31.field2858, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class145 var17 = field2478[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field2486 >> 6) + var15) * 64;
                        int var19 = ((field2493 >> 6) + var16) * 64;
                        for (class201 var20 = (class201) var17.method1082(117); var20 != null; var20 = (class201) var17.method1078(false)) {
                            int var21 = var20.field2860 + var18 - field2486 - field2484;
                            int var22 = var20.field2857 + var19 - field2493 - field2475;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field2482;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field2482;
                            int var25 = field2481 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field2481 - (arg2 * var22 + arg4 >> 16);
                            method1245(arg0, var23, var25, var24 - var23, var26 - var25, var20.field2856, var20.field2858);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lvq;)Lkn;", line = 760)
    public static final class442 method1249(class269 arg0) {
        int var1 = field2489 - field2484;
        int var2 = field2480 - field2475;
        int var3 = (field2479 - field2482 << 16) / var1;
        int var4 = (field2481 - field2474 << 16) / var2;
        return method1246(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "()V", line = 770)
    public static final void method1250() {
        field2477 = new byte[field2494 * field2492];
        field2490 = new byte[field2494 * field2492];
        field2476 = new byte[field2494 * field2492];
        field2483 = new short[field2494 * field2492];
        field2487 = new byte[field2494 * field2492];
        field2488 = new class191(1024);
        field2478 = new class145[3][field2494 >> 6][field2492 >> 6];
        field2485 = new int[class117.field1585 + 1];
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 780)
    public static final void method1251(int arg0) {
        field2463 = (class173) field2462.method1373((long) arg0, 119);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)Lse;", line = 785)
    public static final class139 method1252(int arg0, int arg1) {
        class139 var2 = new class139();
        for (class173 var3 = (class173) field2462.method1383(119); var3 != null; var3 = (class173) field2462.method1378((byte) 98)) {
            if (var3.field2433 && var3.method1231(arg1, arg0, (byte) -127)) {
                var2.method1055(var3, -101);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "()V", line = 800)
    public static void method1253() {
        field2463 = null;
        field2461 = null;
        field2462 = null;
        field2464 = null;
        field2473 = null;
        field2469 = null;
        field2465 = null;
        field2472 = null;
        field2485 = null;
        field2477 = null;
        field2491 = null;
        field2495 = null;
        field2490 = null;
        field2476 = null;
        field2483 = null;
        field2487 = null;
        field2488 = null;
        field2478 = null;
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "()V", line = 823)
    private static final void method1254() {
        for (int var0 = 0; var0 < field2494; var0++) {
            for (int var11 = 0; var11 < field2492; var11++) {
                int var12 = field2483[field2494 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class217 var13 = (class217) field2488.method1373((long) (var0 << 16 | var11), 121);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field3123.length; var14++) {
                                class282 var15 = class398.method2496(-122, var13.field3123[var14] & 0xFFFF);
                                int var16 = var15.field4075;
                                if (var15.field4115 != null) {
                                    class282 var17 = var15.method1942(4096);
                                    if (var17 != null) {
                                        var16 = var17.field4075;
                                    }
                                }
                                if (var16 != -1) {
                                    class194 var18 = new class194(var16);
                                    var18.field2793 = var0;
                                    var18.field2797 = var11;
                                    field2472.method2756(81, var18);
                                }
                            }
                        }
                    } else {
                        class282 var19 = class398.method2496(-128, var12 - 1);
                        int var20 = var19.field4075;
                        if (var19.field4115 != null) {
                            class282 var21 = var19.method1942(4096);
                            if (var21 != null) {
                                var20 = var21.field4075;
                            }
                        }
                        if (var20 != -1) {
                            class194 var22 = new class194(var20);
                            var22.field2793 = var0;
                            var22.field2797 = var11;
                            field2472.method2756(41, var22);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field2478[0].length; var2++) {
                for (int var3 = 0; var3 < field2478[0][0].length; var3++) {
                    class145 var4 = field2478[var1][var2][var3];
                    if (var4 != null) {
                        for (class201 var5 = (class201) var4.method1082(112); var5 != null; var5 = (class201) var4.method1078(false)) {
                            if (var5.field2856 != null) {
                                for (int var6 = 0; var6 < var5.field2856.length; var6++) {
                                    class282 var7 = class398.method2496(-120, var5.field2856[var6] & 0xFFFF);
                                    int var8 = var7.field4075;
                                    if (var7.field4115 != null) {
                                        class282 var9 = var7.method1942(4096);
                                        if (var9 != null) {
                                            var8 = var9.field4075;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class194 var10 = new class194(var8);
                                        var10.field2793 = ((field2486 >> 6) + var2) * 64 + var5.field2860 - field2486;
                                        var10.field2797 = ((field2493 >> 6) + var3) * 64 + var5.field2857 - field2493;
                                        field2472.method2756(63, var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(Lvq;)V", line = 980)
    public static final void method1255(class269 arg0) {
        int var1 = field2489 - field2484;
        int var2 = field2480 - field2475;
        int var3 = (field2479 - field2482 << 16) / var1;
        int var4 = (field2481 - field2474 << 16) / var2;
        method1248(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)Lne;", line = 990)
    public static final class173 method1256(int arg0) {
        return (class173) field2462.method1373((long) arg0, 120);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([B[B[SII)V", line = 994)
    private static final void method1257(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field2492];
        int[] var6 = new int[field2492];
        int[] var7 = new int[field2492];
        int[] var8 = new int[field2492];
        int[] var9 = new int[field2492];
        for (int var10 = -5; var10 < field2494; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field2492; var13++) {
                int var10002;
                if (var11 < field2494) {
                    int var28 = arg0[field2494 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class386 var29 = class204.method1422(1, var28 - 1);
                        var5[var13] += var29.field5458;
                        var6[var13] += var29.field5467;
                        var7[var13] += var29.field5465;
                        var8[var13] += var29.field5459;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field2494 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class386 var31 = class204.method1422(1, var30 - 1);
                        var5[var13] -= var31.field5458;
                        var6[var13] -= var31.field5467;
                        var7[var13] -= var31.field5465;
                        var8[var13] -= var31.field5459;
                        var10002 = var9[var13]--;
                    }
                }
            }
            if (var10 >= 0) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                for (int var19 = -5; var19 < field2492; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field2492) {
                        var14 += var5[var20];
                        var15 += var6[var20];
                        var16 += var7[var20];
                        var17 += var8[var20];
                        var18 += var9[var20];
                    }
                    int var21 = var19 - 5;
                    if (var21 >= 0) {
                        var14 -= var5[var21];
                        var15 -= var6[var21];
                        var16 -= var7[var21];
                        var17 -= var8[var21];
                        var18 -= var9[var21];
                    }
                    if (var19 >= 0 && var18 > 0) {
                        if ((arg0[field2494 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field2494 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class295.method1997(var14 * 256 / var17, var15 / var18, var16 / var18, (byte) -95);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field2494 * var19 + var10;
                            int var27 = class106.field1365[class148.method1095(class187.method1344(true, 96, var25), (byte) -114) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lvq;Lak;IIII)V", line = 1137)
    private static final void method1258(class269 arg0, class194 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field2791 = ((arg1.field2793 - field2484) * arg2 + arg4 >> 16) + field2482;
        arg1.field2792 = field2481 - ((arg1.field2797 - field2475) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lbk;II)V", line = 1143)
    public static final void method1259(class211 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class117.field1585; var3++) {
            field2485[var3 + 1] = method1261(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(II)Lne;", line = 1154)
    public static final class173 method1260(int arg0, int arg1) {
        for (class173 var2 = (class173) field2462.method1383(104); var2 != null; var2 = (class173) field2462.method1378((byte) 98)) {
            if (var2.field2433 && var2.method1231(arg1, arg0, (byte) -128)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lbk;III)I", line = 1167)
    private static final int method1261(class211 arg0, int arg1, int arg2, int arg3) {
        class247 var4 = class377.method2408((byte) 67, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field3682;
        if (var5 >= 0 && arg0.method1475(var5, 17673).field4184) {
            var5 = -1;
        }
        int var9;
        if (var4.field3685 >= 0) {
            int var6 = var4.field3685;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class106.field1365[class148.method1095(class371.method2381(-31, 96, var8), (byte) -114) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class106.field1365[class148.method1095(class371.method2381(-21, 96, arg0.method1475(var5, 17673).field4175), (byte) -120) & 0xFFFF] | 0xFF000000;
        } else if (var4.field3688 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field3688;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class106.field1365[class148.method1095(class371.method2381(99, 96, var12), (byte) -126) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ltj;)V", line = 1223)
    public static final void method1262(class108 arg0) {
        field2461 = arg0;
        field2462.method1382((byte) 47);
        int var1 = field2461.method662(5899, "details");
        int[] var2 = field2461.method634(var1, (byte) 80);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class173 var4 = class74.method445(field2461, var2[var3], 256, var1);
            field2462.method1376(var4, (long) var4.field2435, 74);
        }
        class34.method190(true, false, false);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lvq;II)V", line = 1253)
    public static final void method1263(class269 arg0, int arg1, int arg2) {
        class130 var3 = new class130(field2461.method630((byte) 111, field2463.field2432, "area"));
        int var4 = var3.method837(true);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method837(true);
        }
        int var7 = var3.method837(true);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method837(true);
        }
        while (true) {
            while (var3.field1880 < var3.field1851.length) {
                if (var3.method837(true) == 0) {
                    int var22 = var3.method837(true);
                    int var23 = var3.method837(true);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field2486;
                            int var27 = var23 * 64 + var25 - field2493;
                            method1244(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method837(true);
                    int var29 = var3.method837(true);
                    int var30 = var3.method837(true);
                    int var31 = var3.method837(true);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field2486;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field2493;
                            method1244(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field2491 = new byte[field2494 * field2492];
            field2495 = new short[field2494 * field2492];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field2494 * field2492];
                for (int var13 = 0; var13 < field2478[var11].length; var13++) {
                    for (int var19 = 0; var19 < field2478[var11][0].length; var19++) {
                        class145 var20 = field2478[var11][var13][var19];
                        if (var20 != null) {
                            for (class201 var21 = (class201) var20.method1082(126); var21 != null; var21 = (class201) var20.method1078(false)) {
                                var12[(var19 * 64 + var21.field2857) * field2494 + var13 * 64 + var21.field2860] = (byte) var21.field2861;
                            }
                        }
                    }
                }
                method1257(var12, field2491, field2495, arg1, arg2);
                for (int var14 = 0; var14 < field2478[var11].length; var14++) {
                    for (int var15 = 0; var15 < field2478[var11][0].length; var15++) {
                        class145 var16 = field2478[var11][var14][var15];
                        if (var16 != null) {
                            for (class201 var17 = (class201) var16.method1082(121); var17 != null; var17 = (class201) var16.method1078(false)) {
                                int var18 = (var15 * 64 + var17.field2857) * field2494 + var14 * 64 + var17.field2860;
                                var17.field2861 = (field2491[var18] & 0xFF) << 16 | field2495[var18] & 0xFFFF;
                                if (var17.field2861 != 0) {
                                    var17.field2861 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method1257(field2477, field2491, field2495, arg1, arg2);
            field2477 = null;
            method1254();
            return;
        }
    }
}
