import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class223 {

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "Lcm;")
    private static class382 field3380 = new class382(16);

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field3381 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "[B")
    private static byte[] field3383 = new byte[1];

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "[S")
    private static short[] field3389 = new short[1];

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public static int field3390 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "Lsf;")
    public static class398 field3386 = new class398();

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "F")
    public static float field3385;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "F")
    public static float field3388;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!mj", name = "G", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!mj", name = "I", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "Liq;")
    public static class134 field3378;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "Los;")
    public static class341 field3379;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "Ltn;")
    public static class378 field3382;

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "Lcm;")
    private static class382 field3401;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "[B")
    private static byte[] field3392;

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "[B")
    private static byte[] field3400;

    @OriginalMember(owner = "client!mj", name = "D", descriptor = "[B")
    private static byte[] field3407;

    @OriginalMember(owner = "client!mj", name = "F", descriptor = "[B")
    private static byte[] field3409;

    @OriginalMember(owner = "client!mj", name = "H", descriptor = "[B")
    private static byte[] field3411;

    @OriginalMember(owner = "client!mj", name = "E", descriptor = "[I")
    private static int[] field3408;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "[S")
    private static short[] field3396;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "[S")
    private static short[] field3399;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "[[[B")
    public static byte[][][] field3384;

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "[[[Ltm;")
    private static class354[][][] field3404;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "()V")
    public static void method1345() {
        field3379 = null;
        field3378 = null;
        field3380 = null;
        field3384 = null;
        field3389 = null;
        field3383 = null;
        field3382 = null;
        field3386 = null;
        field3408 = null;
        field3400 = null;
        field3411 = null;
        field3399 = null;
        field3409 = null;
        field3407 = null;
        field3396 = null;
        field3392 = null;
        field3401 = null;
        field3404 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ldr;II)V")
    public static final void method1346(class261 arg0, int arg1, int arg2) {
        class385 var3 = new class385(field3378.method827(field3379.field5106, 0, "area"));
        int var4 = var3.method2343(255);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method2343(255);
        }
        int var7 = var3.method2343(255);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method2343(255);
        }
        while (true) {
            while (var3.field5666 < var3.field5685.length) {
                if (var3.method2343(255) == 0) {
                    int var22 = var3.method2343(255);
                    int var23 = var3.method2343(255);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field3394;
                            int var27 = var23 * 64 + var25 - field3405;
                            method1349(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method2343(255);
                    int var29 = var3.method2343(255);
                    int var30 = var3.method2343(255);
                    int var31 = var3.method2343(255);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field3394;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field3405;
                            method1349(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field3411 = new byte[field3403 * field3402];
            field3399 = new short[field3403 * field3402];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field3403 * field3402];
                for (int var13 = 0; var13 < field3404[var11].length; var13++) {
                    for (int var19 = 0; var19 < field3404[var11][0].length; var19++) {
                        class354 var20 = field3404[var11][var13][var19];
                        if (var20 != null) {
                            for (class248 var21 = (class248) var20.method2127(-1489721243); var21 != null; var21 = (class248) var20.method2126(-78)) {
                                var12[(var19 * 64 + var21.field3706) * field3402 + var13 * 64 + var21.field3707] = (byte) var21.field3709;
                            }
                        }
                    }
                }
                method1354(var12, field3411, field3399, arg1, arg2);
                for (int var14 = 0; var14 < field3404[var11].length; var14++) {
                    for (int var15 = 0; var15 < field3404[var11][0].length; var15++) {
                        class354 var16 = field3404[var11][var14][var15];
                        if (var16 != null) {
                            for (class248 var17 = (class248) var16.method2127(-1489721243); var17 != null; var17 = (class248) var16.method2126(-24)) {
                                int var18 = (var15 * 64 + var17.field3706) * field3402 + var14 * 64 + var17.field3707;
                                var17.field3709 = (field3411[var18] & 0xFF) << 16 | field3399[var18] & 0xFFFF;
                                if (var17.field3709 != 0) {
                                    var17.field3709 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method1354(field3400, field3411, field3399, arg1, arg2);
            field3400 = null;
            method1362();
            return;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ldr;Ldh;IIII)V")
    private static final void method1347(class261 arg0, class227 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field3441 = ((arg1.field3442 - field3391) * arg2 + arg4 >> 16) + field3410;
        arg1.field3439 = field3393 - ((arg1.field3434 - field3406) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lec;III)I")
    private static final int method1348(class96 arg0, int arg1, int arg2, int arg3) {
        class446 var4 = class292.method1815(-120, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field6562;
        if (var5 >= 0 && arg0.method180(var5, -117).field2129) {
            var5 = -1;
        }
        int var9;
        if (var4.field6576 >= 0) {
            int var6 = var4.field6576;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class150.field2070[class103.method652(class94.method618(98, 96, var8), (byte) 125) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class150.field2070[class103.method652(class94.method618(115, 96, arg0.method180(var5, -128).field2134), (byte) 123) & 0xFFFF] | 0xFF000000;
        } else if (var4.field6564 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field6564;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class150.field2070[class103.method652(class94.method618(101, 96, var12), (byte) -70) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ldr;Lef;IIII[I[I)V")
    private static final void method1349(class261 arg0, class385 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method2343(255);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method2343(255);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field3400[field3402 * arg5 + arg4] = (byte) var11;
                    field3409[field3402 * arg5 + arg4] = 0;
                } else {
                    field3409[field3402 * arg5 + arg4] = (byte) var11;
                    field3407[field3402 * arg5 + arg4] = 0;
                    field3400[field3402 * arg5 + arg4] = arg1.method2341((byte) 54);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method2343(255);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method2343(255);
                var18 = arg1.method2343(255);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method2343(255);
            }
            if (var15 == 0) {
                field3400[field3402 * arg5 + arg4] = (byte) var16;
                field3409[field3402 * arg5 + arg4] = (byte) var17;
                field3407[field3402 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field3396[field3402 * arg5 + arg4] = (short) (arg1.method2323(-94) + 1);
                    field3392[field3402 * arg5 + arg4] = arg1.method2341((byte) 54);
                } else if (var19 > 1) {
                    field3396[field3402 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method2323(-113);
                        var21[var22] = arg1.method2341((byte) 54);
                    }
                    field3401.method2301(124, new class122(var20, var21), (long) (arg4 << 16 | arg5));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method2323(-51);
                        var24[var25] = arg1.method2341((byte) 54);
                    }
                }
                if (field3404[var15 - 1][arg2 - (field3394 >> 6)][arg3 - (field3405 >> 6)] == null) {
                    field3404[var15 - 1][arg2 - (field3394 >> 6)][arg3 - (field3405 >> 6)] = new class354();
                }
                class248 var26 = new class248(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field3404[var15 - 1][arg2 - (field3394 >> 6)][arg3 - (field3405 >> 6)].method2125(var26, -29983);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Liq;)V")
    public static final void method1350(class134 arg0) {
        field3378 = arg0;
        field3380.method2307(5142);
        int var1 = field3378.method836(-1, "details");
        int[] var2 = field3378.method830(101, var1);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class341 var4 = class138.method878(var2[var3], field3378, (byte) 92, var1);
            field3380.method2301(83, var4, (long) var4.field5103);
        }
        class15.method86(false, true, 106);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "()V")
    public static final void method1351() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field3382.field5506; var1++) {
            boolean var2 = field3379.method2084(field3382.field5512[var1] >> 28 & 0x3, (byte) -114, field3382.field5512[var1] & 0x3FFF, field3382.field5512[var1] >> 14 & 0x3FFF, var0);
            if (var2) {
                class227 var3 = new class227(field3382.field5509[var1]);
                var3.field3442 = var0[1] - field3394;
                var3.field3434 = var0[2] - field3405;
                field3386.method2504(42, var3);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ldr;)Lsf;")
    public static final class398 method1352(class261 arg0) {
        int var1 = field3397 - field3391;
        int var2 = field3395 - field3406;
        int var3 = (field3412 - field3410 << 16) / var1;
        int var4 = (field3393 - field3398 << 16) / var2;
        return method1361(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)Los;")
    public static final class341 method1353(int arg0) {
        return (class341) field3380.method2302((long) arg0, 23576);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([B[B[SII)V")
    private static final void method1354(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field3403];
        int[] var6 = new int[field3403];
        int[] var7 = new int[field3403];
        int[] var8 = new int[field3403];
        int[] var9 = new int[field3403];
        for (int var10 = -5; var10 < field3402; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field3403; var13++) {
                int var10002;
                if (var11 < field3402) {
                    int var28 = arg0[field3402 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class87 var29 = class90.method590(var28 - 1, 1);
                        var5[var13] += var29.field1216;
                        var6[var13] += var29.field1219;
                        var7[var13] += var29.field1224;
                        var8[var13] += var29.field1218;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field3402 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class87 var31 = class90.method590(var30 - 1, 1);
                        var5[var13] -= var31.field1216;
                        var6[var13] -= var31.field1219;
                        var7[var13] -= var31.field1224;
                        var8[var13] -= var31.field1218;
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
                for (int var19 = -5; var19 < field3403; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field3403) {
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
                        if ((arg0[field3402 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field3402 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class250.method1524(var16 / var18, var14 * 256 / var17, (byte) -117, var15 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field3402 * var19 + var10;
                            int var27 = class150.field2070[class103.method652(client.method2787(12345678, var25, 96), (byte) 117) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ldr;IIII)V")
    private static final void method1355(class261 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field3397 - field3391;
        int var6 = field3395 - field3406;
        if (field3397 < field3402) {
            var5++;
        }
        if (field3395 < field3403) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field3410;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field3410;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field3391 + var7;
                if (var52 >= 0 && var52 < field3402) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field3393 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field3393 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field3406 + var53;
                            int var58 = field3402 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field3403) {
                                var59 = (field3411[var58] & 0xFF) << 16 | field3399[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field3409[var58] & 0xFF;
                                var61 = field3396[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field3379.field5104 != -1) {
                                    var62 = field3379.field5104 | 0xFF000000;
                                } else if ((field3395 + var53 & 0x4) == (field3391 + var7 & 0x4)) {
                                    var62 = field3408[class413.field6138 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method358(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method1359(arg0, var49, var54, var51, var56, var59, var60, field3407[var58], (short[]) null, (byte[]) null, true);
                            } else if (var61 == 65535) {
                                class122 var63 = (class122) field3401.method2302((long) (var52 << 16 | var57), 23576);
                                if (var63 != null) {
                                    method1359(arg0, var49, var54, var51, var56, var59, var60, field3407[var58], var63.field1599, var63.field1600, true);
                                }
                            } else {
                                field3389[0] = (short) (var61 - 1);
                                field3383[0] = field3392[var58];
                                method1359(arg0, var49, var54, var51, var56, var59, var60, field3407[var58], field3389, field3383, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field3393 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field3393 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field3379.field5104 != -1) {
                            var68 = field3379.field5104 | 0xFF000000;
                        } else if ((field3395 + var64 & 0x4) == (field3391 + var7 & 0x4)) {
                            var68 = field3408[class413.field6138 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method358(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field3410;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field3410;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field3391 + var8;
                if (var41 >= 0 && var41 < field3402) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field3393 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field3393 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field3406 + var42;
                            if (var46 >= 0 && var46 < field3403) {
                                int var47 = field3396[field3402 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method1363(arg0, var38, var43, var40, var45, (short[]) null, (byte[]) null);
                                } else if (var47 == 65535) {
                                    class122 var48 = (class122) field3401.method2302((long) (var41 << 16 | var46), 23576);
                                    if (var48 != null) {
                                        method1363(arg0, var38, var43, var40, var45, var48.field1599, var48.field1600);
                                    }
                                } else {
                                    field3389[0] = (short) (var47 - 1);
                                    field3383[0] = field3392[field3402 * var46 + var41];
                                    method1363(arg0, var38, var43, var40, var45, field3389, field3383);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field3391 >> 6;
        int var10 = field3406 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field3397 >> 6;
        int var12 = field3395 >> 6;
        if (var11 >= field3404[0].length) {
            var11 = field3404[0].length - 1;
        }
        if (var12 >= field3404[0][0].length) {
            var12 = field3404[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class354 var28 = field3404[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field3394 >> 6) + var14) * 64;
                        int var30 = ((field3405 >> 6) + var27) * 64;
                        for (class248 var31 = (class248) var28.method2127(-1489721243); var31 != null; var31 = (class248) var28.method2126(-100)) {
                            int var32 = var31.field3707 + var29 - field3394 - field3391;
                            int var33 = var31.field3706 + var30 - field3405 - field3406;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field3410;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field3410;
                            int var36 = field3393 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field3393 - (arg2 * var33 + arg4 >> 16);
                            method1359(arg0, var34, var36, var35 - var34, var37 - var36, var31.field3709, var31.field3711 & 0xFF, var31.field3708, var31.field3705, var31.field3710, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class354 var17 = field3404[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field3394 >> 6) + var15) * 64;
                        int var19 = ((field3405 >> 6) + var16) * 64;
                        for (class248 var20 = (class248) var17.method2127(-1489721243); var20 != null; var20 = (class248) var17.method2126(-34)) {
                            int var21 = var20.field3707 + var18 - field3394 - field3391;
                            int var22 = var20.field3706 + var19 - field3405 - field3406;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field3410;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field3410;
                            int var25 = field3393 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field3393 - (arg2 * var22 + arg4 >> 16);
                            method1363(arg0, var23, var25, var24 - var23, var26 - var25, var20.field3705, var20.field3710);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lec;II)V")
    public static final void method1356(class96 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class308.field4650; var3++) {
            field3408[var3 + 1] = method1348(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "()V")
    public static final void method1357() {
        field3400 = new byte[field3403 * field3402];
        field3409 = new byte[field3403 * field3402];
        field3407 = new byte[field3403 * field3402];
        field3396 = new short[field3403 * field3402];
        field3392 = new byte[field3403 * field3402];
        field3401 = new class382(1024);
        field3404 = new class354[3][field3402 >> 6][field3403 >> 6];
        field3408 = new int[class308.field4650 + 1];
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1358(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3391 = arg0 - field3394;
        field3395 = arg1 - field3405;
        field3397 = arg2 - field3394;
        field3406 = arg3 - field3405;
        field3410 = arg4;
        field3398 = arg5;
        field3412 = arg6;
        field3393 = arg7;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ldr;IIIIIII[S[BZ)V")
    private static final void method1359(class261 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method358(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field3408[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method358(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class454.method2824(arg0, var11, field3408[arg6], arg4, arg3, arg2, field3384, field3387, arg5, 74, var12, arg7 >> 6 & 0x3, arg1);
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
                class85 var18 = class411.method2575(0, arg8[var16] & 0xFFFF);
                if (var18.field1155 == -1) {
                    int var19 = -3355444;
                    if (var18.field1184 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method439(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method418(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method439(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method418(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method439(arg1, arg2, arg4, -1, 0);
                            arg0.method418(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method439(var14, arg2, arg4, -1, 0);
                            arg0.method418(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method439(var14, arg2, arg4, -1, 0);
                            arg0.method418(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method439(arg1, arg2, arg4, -1, 0);
                            arg0.method418(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method418(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method418(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method418(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method418(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method418(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method418(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)Llq;")
    public static final class5 method1360(int arg0, int arg1) {
        class5 var2 = new class5();
        for (class341 var3 = (class341) field3380.method2296(5773); var3 != null; var3 = (class341) field3380.method2304(100)) {
            if (var3.field5098 && var3.method2082(-1, arg0, arg1)) {
                var2.method40(var3, 17478);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(Ldr;IIII)Lsf;")
    private static final class398 method1361(class261 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class227 var5 = (class227) field3386.method2514((byte) 61); var5 != null; var5 = (class227) field3386.method2511(-117)) {
            method1347(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field3386;
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "()V")
    private static final void method1362() {
        for (int var0 = 0; var0 < field3402; var0++) {
            for (int var11 = 0; var11 < field3403; var11++) {
                int var12 = field3396[field3402 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class122 var13 = (class122) field3401.method2302((long) (var0 << 16 | var11), 23576);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field1599.length; var14++) {
                                class85 var15 = class411.method2575(0, var13.field1599[var14] & 0xFFFF);
                                int var16 = var15.field1132;
                                if (var15.field1133 != null) {
                                    class85 var17 = var15.method542(6796);
                                    if (var17 != null) {
                                        var16 = var17.field1132;
                                    }
                                }
                                if (var16 != -1) {
                                    class227 var18 = new class227(var16);
                                    var18.field3442 = var0;
                                    var18.field3434 = var11;
                                    field3386.method2504(42, var18);
                                }
                            }
                        }
                    } else {
                        class85 var19 = class411.method2575(0, var12 - 1);
                        int var20 = var19.field1132;
                        if (var19.field1133 != null) {
                            class85 var21 = var19.method542(6796);
                            if (var21 != null) {
                                var20 = var21.field1132;
                            }
                        }
                        if (var20 != -1) {
                            class227 var22 = new class227(var20);
                            var22.field3442 = var0;
                            var22.field3434 = var11;
                            field3386.method2504(42, var22);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field3404[0].length; var2++) {
                for (int var3 = 0; var3 < field3404[0][0].length; var3++) {
                    class354 var4 = field3404[var1][var2][var3];
                    if (var4 != null) {
                        for (class248 var5 = (class248) var4.method2127(-1489721243); var5 != null; var5 = (class248) var4.method2126(-86)) {
                            if (var5.field3705 != null) {
                                for (int var6 = 0; var6 < var5.field3705.length; var6++) {
                                    class85 var7 = class411.method2575(0, var5.field3705[var6] & 0xFFFF);
                                    int var8 = var7.field1132;
                                    if (var7.field1133 != null) {
                                        class85 var9 = var7.method542(6796);
                                        if (var9 != null) {
                                            var8 = var9.field1132;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class227 var10 = new class227(var8);
                                        var10.field3442 = ((field3394 >> 6) + var2) * 64 + var5.field3707 - field3394;
                                        var10.field3434 = ((field3405 >> 6) + var3) * 64 + var5.field3706 - field3405;
                                        field3386.method2504(42, var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ldr;IIII[S[B)V")
    private static final void method1363(class261 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class85 var8 = class411.method2575(0, arg5[var7] & 0xFFFF);
            int var9 = var8.field1155;
            if (var9 != -1) {
                class66 var10 = class198.method1181(var9, 34);
                class234 var11 = var10.method453(var8.field1199 ? arg6[var7] >> 6 & 0x3 : 0, true, arg0, var8.field1171 ? var8.field1140 : false);
                if (var11 != null) {
                    int var12 = arg3 * var11.method1226() >> 2;
                    int var13 = arg4 * var11.method1219() >> 2;
                    if (var10.field854) {
                        int var14 = var8.field1197;
                        int var15 = var8.field1122;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field848 == 0) {
                            var11.method1409(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method1222(arg1, arg2 + arg4 - var13, var12, var13, 1, var10.field848 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "()V")
    public static final void method1364() {
        field3400 = null;
        field3411 = null;
        field3399 = null;
        field3409 = null;
        field3407 = null;
        field3396 = null;
        field3392 = null;
        field3401 = null;
        field3404 = null;
        field3408 = null;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(II)Los;")
    public static final class341 method1365(int arg0, int arg1) {
        for (class341 var2 = (class341) field3380.method2296(5773); var2 != null; var2 = (class341) field3380.method2304(100)) {
            if (var2.field5098 && var2.method2082(-1, arg0, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
    public static final void method1366(int arg0) {
        field3379 = (class341) field3380.method2302((long) arg0, 23576);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(Ldr;)V")
    public static final void method1367(class261 arg0) {
        int var1 = field3397 - field3391;
        int var2 = field3395 - field3406;
        int var3 = (field3412 - field3410 << 16) / var1;
        int var4 = (field3393 - field3398 << 16) / var2;
        method1355(arg0, var3, var4, 0, 0);
    }
}
