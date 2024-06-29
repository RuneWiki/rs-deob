import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class210 {

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "Lbu;")
    private static class407 field3322 = new class407(16);

    @OriginalMember(owner = "client!ss", name = "n", descriptor = "I")
    public static int field3334 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "[S")
    private static short[] field3330 = new short[1];

    @OriginalMember(owner = "client!ss", name = "r", descriptor = "[B")
    private static byte[] field3338 = new byte[1];

    @OriginalMember(owner = "client!ss", name = "q", descriptor = "I")
    public static int field3337 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!ss", name = "l", descriptor = "Lpu;")
    public static class411 field3332 = new class411();

    @OriginalMember(owner = "client!ss", name = "o", descriptor = "F")
    public static float field3335;

    @OriginalMember(owner = "client!ss", name = "s", descriptor = "F")
    public static float field3339;

    @OriginalMember(owner = "client!ss", name = "p", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!ss", name = "t", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!ss", name = "v", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!ss", name = "w", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!ss", name = "x", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!ss", name = "z", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!ss", name = "C", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!ss", name = "D", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!ss", name = "I", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!ss", name = "J", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!ss", name = "K", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!ss", name = "L", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!ss", name = "P", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "Lls;")
    public static class110 field3323;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "Lim;")
    public static class294 field3326;

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "Lfd;")
    public static class316 field3328;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "Luq;")
    public static class346 field3321;

    @OriginalMember(owner = "client!ss", name = "H", descriptor = "Lbu;")
    private static class407 field3353;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "Luo;")
    private static class468 field3324;

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "Lqs;")
    public static class496 field3325;

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "Lot;")
    private static class500 field3327;

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "Lmj;")
    public static class70 field3329;

    @OriginalMember(owner = "client!ss", name = "m", descriptor = "Lis;")
    public static class73 field3333;

    @OriginalMember(owner = "client!ss", name = "u", descriptor = "[B")
    private static byte[] field3341;

    @OriginalMember(owner = "client!ss", name = "E", descriptor = "[B")
    private static byte[] field3350;

    @OriginalMember(owner = "client!ss", name = "M", descriptor = "[B")
    private static byte[] field3358;

    @OriginalMember(owner = "client!ss", name = "N", descriptor = "[B")
    private static byte[] field3359;

    @OriginalMember(owner = "client!ss", name = "O", descriptor = "[B")
    private static byte[] field3360;

    @OriginalMember(owner = "client!ss", name = "y", descriptor = "[I")
    private static int[] field3345;

    @OriginalMember(owner = "client!ss", name = "F", descriptor = "[S")
    private static short[] field3351;

    @OriginalMember(owner = "client!ss", name = "G", descriptor = "[S")
    private static short[] field3352;

    @OriginalMember(owner = "client!ss", name = "k", descriptor = "[[[B")
    public static byte[][][] field3331;

    @OriginalMember(owner = "client!ss", name = "B", descriptor = "[[[Lik;")
    private static class78[][][] field3347;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V")
    public static final void method1373(int arg0) {
        field3321 = (class346) field3322.method2516((long) arg0, -1);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lza;IIII[S[B)V")
    private static final void method1374(class491 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class39 var8 = field3323.method791(arg5[var7] & 0xFFFF, true);
            int var9 = var8.field651;
            if (var9 != -1) {
                class517 var10 = field3328.method2005(var9, 34);
                class138 var11 = var10.method3066((byte) -49, arg0, var8.field620 ? var8.field586 : false, var8.field661 ? arg6[var7] >> 6 & 0x3 : 0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method200() >> 2;
                    int var13 = arg4 * var11.method198() >> 2;
                    if (var10.field7655) {
                        int var14 = var8.field611;
                        int var15 = var8.field647;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field7651 == 0) {
                            var11.method1033(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method202(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field7651 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)Luq;")
    public static final class346 method1375(int arg0) {
        return (class346) field3322.method2516((long) arg0, -1);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "()V")
    public static final void method1376() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field3333.field1257; var1++) {
            boolean var2 = field3321.method2232(field3333.field1252[var1] >> 28 & 0x3, (byte) 58, var0, field3333.field1252[var1] >> 14 & 0x3FFF, field3333.field1252[var1] & 0x3FFF);
            if (var2) {
                class366 var3 = new class366(field3333.field1254[var1]);
                var3.field5692 = var0[1] - field3357;
                var3.field5690 = var0[2] - field3340;
                field3332.method2541(0, var3);
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)Luq;")
    public static final class346 method1377(int arg0, int arg1) {
        for (class346 var2 = (class346) field3322.method2518(44); var2 != null; var2 = (class346) field3322.method2524(0)) {
            if (var2.field5431 && var2.method2234(-11, arg0, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lza;Lia;IIII[I[I)V")
    private static final void method1378(class491 arg0, class23 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method126((byte) -120);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method126((byte) -83);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field3360[field3343 * arg5 + arg4] = (byte) var11;
                    field3350[field3343 * arg5 + arg4] = 0;
                } else {
                    field3350[field3343 * arg5 + arg4] = (byte) var11;
                    field3341[field3343 * arg5 + arg4] = 0;
                    field3360[field3343 * arg5 + arg4] = arg1.method167(-2);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method126((byte) -114);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method126((byte) -90);
                var18 = arg1.method126((byte) -91);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method126((byte) -113);
            }
            if (var15 == 0) {
                field3360[field3343 * arg5 + arg4] = (byte) var16;
                field3350[field3343 * arg5 + arg4] = (byte) var17;
                field3341[field3343 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field3352[field3343 * arg5 + arg4] = (short) (arg1.method132(79) + 1);
                    field3359[field3343 * arg5 + arg4] = arg1.method167(-2);
                } else if (var19 > 1) {
                    field3352[field3343 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method132(26);
                        var21[var22] = arg1.method167(-2);
                    }
                    field3353.method2517(new class143(var20, var21), (long) (arg4 << 16 | arg5), (byte) -110);
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method132(79);
                        var24[var25] = arg1.method167(-2);
                    }
                }
                if (field3347[var15 - 1][arg2 - (field3357 >> 6)][arg3 - (field3340 >> 6)] == null) {
                    field3347[var15 - 1][arg2 - (field3357 >> 6)][arg3 - (field3340 >> 6)] = new class78();
                }
                class401 var26 = new class401(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field3347[var15 - 1][arg2 - (field3357 >> 6)][arg3 - (field3340 >> 6)].method567(var26, 255);
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "([B[B[SII)V")
    private static final void method1379(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field3342];
        int[] var6 = new int[field3342];
        int[] var7 = new int[field3342];
        int[] var8 = new int[field3342];
        int[] var9 = new int[field3342];
        for (int var10 = -5; var10 < field3343; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field3342; var13++) {
                int var10002;
                if (var11 < field3343) {
                    int var28 = arg0[field3343 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class479 var29 = field3327.method2957((byte) 89, var28 - 1);
                        var5[var13] += var29.field7065;
                        var6[var13] += var29.field7063;
                        var7[var13] += var29.field7070;
                        var8[var13] += var29.field7069;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field3343 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class479 var31 = field3327.method2957((byte) 118, var30 - 1);
                        var5[var13] -= var31.field7065;
                        var6[var13] -= var31.field7063;
                        var7[var13] -= var31.field7070;
                        var8[var13] -= var31.field7069;
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
                for (int var19 = -5; var19 < field3342; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field3342) {
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
                        if ((arg0[field3343 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field3343 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class231.method1597(var14 * 256 / var17, var15 / var18, var16 / var18, -27818);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field3343 * var19 + var10;
                            int var27 = class226.field3894[class507.method2982(false, class7.method46(96, (byte) 72, var25)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lza;IIII)V")
    private static final void method1380(class491 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field3348 - field3354;
        int var6 = field3355 - field3349;
        if (field3348 < field3343) {
            var5++;
        }
        if (field3355 < field3342) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field3344;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field3344;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field3354 + var7;
                if (var52 >= 0 && var52 < field3343) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field3346 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field3346 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field3349 + var53;
                            int var58 = field3343 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field3342) {
                                var59 = (field3358[var58] & 0xFF) << 16 | field3351[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field3350[var58] & 0xFF;
                                var61 = field3352[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field3321.field5436 != -1) {
                                    var62 = field3321.field5436 | 0xFF000000;
                                } else if ((field3355 + var53 & 0x4) == (field3354 + var7 & 0x4)) {
                                    var62 = field3345[field3324.field6956 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method914(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method1391(arg0, var49, var54, var51, var56, var59, var60, field3341[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class143 var63 = (class143) field3353.method2516((long) (var52 << 16 | var57), -1);
                                if (var63 != null) {
                                    method1391(arg0, var49, var54, var51, var56, var59, var60, field3341[var58], var63.field2347, var63.field2348, true);
                                }
                            } else {
                                field3330[0] = (short) (var61 - 1);
                                field3338[0] = field3359[var58];
                                method1391(arg0, var49, var54, var51, var56, var59, var60, field3341[var58], field3330, field3338, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field3346 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field3346 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field3321.field5436 != -1) {
                            var68 = field3321.field5436 | 0xFF000000;
                        } else if ((field3355 + var64 & 0x4) == (field3354 + var7 & 0x4)) {
                            var68 = field3345[field3324.field6956 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method914(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field3344;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field3344;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field3354 + var8;
                if (var41 >= 0 && var41 < field3343) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field3346 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field3346 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field3349 + var42;
                            if (var46 >= 0 && var46 < field3342) {
                                int var47 = field3352[field3343 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method1374(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class143 var48 = (class143) field3353.method2516((long) (var41 << 16 | var46), -1);
                                    if (var48 != null) {
                                        method1374(arg0, var38, var43, var40, var45, var48.field2347, var48.field2348);
                                    }
                                } else {
                                    field3330[0] = (short) (var47 - 1);
                                    field3338[0] = field3359[field3343 * var46 + var41];
                                    method1374(arg0, var38, var43, var40, var45, field3330, field3338);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field3354 >> 6;
        int var10 = field3349 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field3348 >> 6;
        int var12 = field3355 >> 6;
        if (var11 >= field3347[0].length) {
            var11 = field3347[0].length - 1;
        }
        if (var12 >= field3347[0][0].length) {
            var12 = field3347[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class78 var28 = field3347[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field3357 >> 6) + var14) * 64;
                        int var30 = ((field3340 >> 6) + var27) * 64;
                        for (class401 var31 = (class401) var28.method573(24037); var31 != null; var31 = (class401) var28.method576(14)) {
                            int var32 = var31.field6108 + var29 - field3357 - field3354;
                            int var33 = var31.field6109 + var30 - field3340 - field3349;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field3344;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field3344;
                            int var36 = field3346 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field3346 - (arg2 * var33 + arg4 >> 16);
                            method1391(arg0, var34, var36, var35 - var34, var37 - var36, var31.field6107, var31.field6112 & 0xFF, var31.field6106, var31.field6110, var31.field6111, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class78 var17 = field3347[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field3357 >> 6) + var15) * 64;
                        int var19 = ((field3340 >> 6) + var16) * 64;
                        for (class401 var20 = (class401) var17.method573(24037); var20 != null; var20 = (class401) var17.method576(14)) {
                            int var21 = var20.field6108 + var18 - field3357 - field3354;
                            int var22 = var20.field6109 + var19 - field3340 - field3349;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field3344;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field3344;
                            int var25 = field3346 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field3346 - (arg2 * var22 + arg4 >> 16);
                            method1374(arg0, var23, var25, var24 - var23, var26 - var25, var20.field6110, var20.field6111);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "()V")
    private static final void method1381() {
        for (int var0 = 0; var0 < field3343; var0++) {
            for (int var11 = 0; var11 < field3342; var11++) {
                int var12 = field3352[field3343 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class143 var13 = (class143) field3353.method2516((long) (var0 << 16 | var11), -1);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field2347.length; var14++) {
                                class39 var15 = field3323.method791(var13.field2347[var14] & 0xFFFF, true);
                                int var16 = var15.field656;
                                if (var15.field575 != null) {
                                    class39 var17 = var15.method296(-1008, field3326);
                                    if (var17 != null) {
                                        var16 = var17.field656;
                                    }
                                }
                                if (var16 != -1) {
                                    class366 var18 = new class366(var16);
                                    var18.field5692 = var0;
                                    var18.field5690 = var11;
                                    field3332.method2541(0, var18);
                                }
                            }
                        }
                    } else {
                        class39 var19 = field3323.method791(var12 - 1, true);
                        int var20 = var19.field656;
                        if (var19.field575 != null) {
                            class39 var21 = var19.method296(-1008, field3326);
                            if (var21 != null) {
                                var20 = var21.field656;
                            }
                        }
                        if (var20 != -1) {
                            class366 var22 = new class366(var20);
                            var22.field5692 = var0;
                            var22.field5690 = var11;
                            field3332.method2541(0, var22);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field3347[0].length; var2++) {
                for (int var3 = 0; var3 < field3347[0][0].length; var3++) {
                    class78 var4 = field3347[var1][var2][var3];
                    if (var4 != null) {
                        for (class401 var5 = (class401) var4.method573(24037); var5 != null; var5 = (class401) var4.method576(14)) {
                            if (var5.field6110 != null) {
                                for (int var6 = 0; var6 < var5.field6110.length; var6++) {
                                    class39 var7 = field3323.method791(var5.field6110[var6] & 0xFFFF, true);
                                    int var8 = var7.field656;
                                    if (var7.field575 != null) {
                                        class39 var9 = var7.method296(-1008, field3326);
                                        if (var9 != null) {
                                            var8 = var9.field656;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class366 var10 = new class366(var8);
                                        var10.field5692 = ((field3357 >> 6) + var2) * 64 + var5.field6108 - field3357;
                                        var10.field5690 = ((field3340 >> 6) + var3) * 64 + var5.field6109 - field3340;
                                        field3332.method2541(0, var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "()V")
    public static void method1382() {
        field3324 = null;
        field3327 = null;
        field3323 = null;
        field3329 = null;
        field3328 = null;
        field3326 = null;
        field3321 = null;
        field3325 = null;
        field3322 = null;
        field3331 = null;
        field3330 = null;
        field3338 = null;
        field3333 = null;
        field3332 = null;
        field3345 = null;
        field3360 = null;
        field3358 = null;
        field3351 = null;
        field3350 = null;
        field3341 = null;
        field3352 = null;
        field3359 = null;
        field3353 = null;
        field3347 = null;
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(Lza;IIII)Lpu;")
    private static final class411 method1383(class491 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class366 var5 = (class366) field3332.method2538(-3); var5 != null; var5 = (class366) field3332.method2535((byte) -65)) {
            method1392(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field3332;
    }

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "()V")
    public static final void method1384() {
        field3360 = null;
        field3358 = null;
        field3351 = null;
        field3350 = null;
        field3341 = null;
        field3352 = null;
        field3359 = null;
        field3353 = null;
        field3347 = null;
        field3345 = null;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lza;)Lpu;")
    public static final class411 method1385(class491 arg0) {
        int var1 = field3348 - field3354;
        int var2 = field3355 - field3349;
        int var3 = (field3361 - field3344 << 16) / var1;
        int var4 = (field3346 - field3356 << 16) / var2;
        return method1383(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(II)Lvt;")
    public static final class516 method1386(int arg0, int arg1) {
        class516 var2 = new class516();
        for (class346 var3 = (class346) field3322.method2518(42); var3 != null; var3 = (class346) field3322.method2524(0)) {
            if (var3.field5431 && var3.method2234(124, arg0, arg1)) {
                var2.method3050(var3, 2);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "()V")
    public static final void method1387() {
        field3360 = new byte[field3343 * field3342];
        field3350 = new byte[field3343 * field3342];
        field3341 = new byte[field3343 * field3342];
        field3352 = new short[field3343 * field3342];
        field3359 = new byte[field3343 * field3342];
        field3353 = new class407(1024);
        field3347 = new class78[3][field3343 >> 6][field3342 >> 6];
        field3345 = new int[field3324.field6945 + 1];
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lqs;Luo;Lot;Lls;Lmj;Lfd;Lim;)V")
    public static final void method1388(class496 arg0, class468 arg1, class500 arg2, class110 arg3, class70 arg4, class316 arg5, class294 arg6) {
        field3325 = arg0;
        field3324 = arg1;
        field3327 = arg2;
        field3323 = arg3;
        field3329 = arg4;
        field3328 = arg5;
        field3326 = arg6;
        field3322.method2525(0);
        int var7 = field3325.method2927("details", -67);
        int[] var8 = field3325.method2923(var7, -106);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class346 var10 = class295.method1890(field3325, 0, var8[var9], var7);
                field3322.method2517(var10, (long) var10.field5444, (byte) -116);
            }
        }
        class213.method1402(false, 640, true);
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(Lza;)V")
    public static final void method1389(class491 arg0) {
        int var1 = field3348 - field3354;
        int var2 = field3355 - field3349;
        int var3 = (field3361 - field3344 << 16) / var1;
        int var4 = (field3346 - field3356 << 16) / var2;
        method1380(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1390(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3354 = arg0 - field3357;
        field3355 = arg1 - field3340;
        field3348 = arg2 - field3357;
        field3349 = arg3 - field3340;
        field3344 = arg4;
        field3356 = arg5;
        field3361 = arg6;
        field3346 = arg7;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lza;IIIIIII[S[BZ)V")
    private static final void method1391(class491 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method914(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field3345[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method914(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class363.method2317((byte) -19, field3345[arg6], arg1, arg5, arg0, var12, arg7 >> 6 & 0x3, arg2, arg4, field3331, var11, field3336, arg3);
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
                class39 var18 = field3323.method791(arg8[var16] & 0xFFFF, true);
                if (var18.field651 == -1) {
                    int var19 = -3355444;
                    if (var18.field618 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method876(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method854(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method876(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method854(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method876(arg1, arg2, arg4, -1, 0);
                            arg0.method854(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method876(var14, arg2, arg4, -1, 0);
                            arg0.method854(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method876(var14, arg2, arg4, -1, 0);
                            arg0.method854(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method876(arg1, arg2, arg4, -1, 0);
                            arg0.method854(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method854(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method854(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method854(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method854(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method854(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method854(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lza;Lmo;IIII)V")
    private static final void method1392(class491 arg0, class366 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field5695 = ((arg1.field5692 - field3354) * arg2 + arg4 >> 16) + field3344;
        arg1.field5687 = field3346 - ((arg1.field5690 - field3349) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lza;II)V")
    public static final void method1393(class491 arg0, int arg1, int arg2) {
        class23 var3 = new class23(field3325.method2917(-18656, "area", field3321.field5442));
        int var4 = var3.method126((byte) -125);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method126((byte) -126);
        }
        int var7 = var3.method126((byte) -115);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method126((byte) -82);
        }
        while (true) {
            while (var3.field301 < var3.field302.length) {
                if (var3.method126((byte) -109) == 0) {
                    int var22 = var3.method126((byte) -105);
                    int var23 = var3.method126((byte) -95);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field3357;
                            int var27 = var23 * 64 + var25 - field3340;
                            method1378(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method126((byte) -87);
                    int var29 = var3.method126((byte) -123);
                    int var30 = var3.method126((byte) -123);
                    int var31 = var3.method126((byte) -87);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field3357;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field3340;
                            method1378(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field3358 = new byte[field3343 * field3342];
            field3351 = new short[field3343 * field3342];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field3343 * field3342];
                for (int var13 = 0; var13 < field3347[var11].length; var13++) {
                    for (int var19 = 0; var19 < field3347[var11][0].length; var19++) {
                        class78 var20 = field3347[var11][var13][var19];
                        if (var20 != null) {
                            for (class401 var21 = (class401) var20.method573(24037); var21 != null; var21 = (class401) var20.method576(14)) {
                                var12[(var19 * 64 + var21.field6109) * field3343 + var13 * 64 + var21.field6108] = (byte) var21.field6107;
                            }
                        }
                    }
                }
                method1379(var12, field3358, field3351, arg1, arg2);
                for (int var14 = 0; var14 < field3347[var11].length; var14++) {
                    for (int var15 = 0; var15 < field3347[var11][0].length; var15++) {
                        class78 var16 = field3347[var11][var14][var15];
                        if (var16 != null) {
                            for (class401 var17 = (class401) var16.method573(24037); var17 != null; var17 = (class401) var16.method576(14)) {
                                int var18 = (var15 * 64 + var17.field6109) * field3343 + var14 * 64 + var17.field6108;
                                var17.field6107 = (field3358[var18] & 0xFF) << 16 | field3351[var18] & 0xFFFF;
                                if (var17.field6107 != 0) {
                                    var17.field6107 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method1379(field3360, field3358, field3351, arg1, arg2);
            field3360 = null;
            method1381();
            return;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Ll;III)I")
    private static final int method1394(class196 arg0, int arg1, int arg2, int arg3) {
        class471 var4 = field3324.method2780(arg1, (byte) -48);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field6986;
        if (var5 >= 0 && arg0.method195(var5, (byte) -105).field5023) {
            var5 = -1;
        }
        int var9;
        if (var4.field6975 >= 0) {
            int var6 = var4.field6975;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class226.field3894[class507.method2982(false, class128.method994(96, (byte) 108, var8)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class226.field3894[class507.method2982(false, class128.method994(96, (byte) 87, arg0.method195(var5, (byte) -105).field5033)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field6972 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field6972;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class226.field3894[class507.method2982(false, class128.method994(96, (byte) 81, var12)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Ll;II)V")
    public static final void method1395(class196 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field3324.field6945; var3++) {
            field3345[var3 + 1] = method1394(arg0, var3, arg1, arg2);
        }
    }
}
