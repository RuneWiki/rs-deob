import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class341 {

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "Lsga;")
    private static class583 field4412 = new class583(16);

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "[B")
    private static byte[] field4418 = new byte[1];

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field4415 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public static int field4419 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "[S")
    private static short[] field4422 = new short[1];

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "Lqia;")
    public static class547 field4421 = new class547();

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "F")
    public static float field4413;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "F")
    public static float field4414;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Lvc;")
    public static class143 field4404;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Lln;")
    public static class237 field4408;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "Lng;")
    public static class377 field4407;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Lgo;")
    public static class470 field4406;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "Lsga;")
    private static class583 field4434;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "Lpe;")
    private static class658 field4411;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "Ldca;")
    public static class660 field4417;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "Ldk;")
    public static class683 field4409;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "Lkha;")
    public static class687 field4410;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Lsl;")
    private static class92 field4405;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "[B")
    private static byte[] field4423;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "[B")
    private static byte[] field4424;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "[B")
    private static byte[] field4426;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "[B")
    private static byte[] field4427;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "[B")
    private static byte[] field4443;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "[I")
    private static int[] field4425;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "[S")
    private static short[] field4431;

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "[S")
    private static short[] field4436;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "[[[B")
    public static byte[][][] field4416;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "[[[Lwo;")
    private static class314[][][] field4440;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lha;IIII[S[B)V", line = 3)
    private static final void method1997(class454 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class290 var8 = field4404.method890(arg5[var7] & 0xFFFF, false);
            int var9 = var8.field3736;
            if (var9 != -1) {
                class128 var10 = field4408.method1483(var9, (byte) -1);
                class712 var11 = var10.method827(var8.field3696 ? var8.field3747 : false, false, var8.field3705 ? arg6[var7] >> 6 & 0x3 : 0, arg0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method1892() >> 2;
                    int var13 = arg4 * var11.method1882() >> 2;
                    if (var10.field1549) {
                        int var14 = var8.field3724;
                        int var15 = var8.field3762;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field1544 == 0) {
                            var11.method3933(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method3937(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field1544 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)Lng;", line = 61)
    public static final class377 method1998(int arg0) {
        return (class377) field4412.method3248((long) arg0, 0);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "()V", line = 65)
    public static final void method1999() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field4417.field9055; var1++) {
            boolean var2 = field4407.method2290(var0, field4417.field9054[var1] >> 28 & 0x3, field4417.field9054[var1] & 0x3FFF, field4417.field9054[var1] >> 14 & 0x3FFF, 28512);
            if (var2) {
                class499 var3 = new class499(field4417.field9056[var1]);
                var3.field7059 = var0[1] - field4441;
                var3.field7047 = var0[2] - field4442;
                field4421.method3110(var3, 1);
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([B[B[SII)V", line = 87)
    private static final void method2000(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field4437];
        int[] var6 = new int[field4437];
        int[] var7 = new int[field4437];
        int[] var8 = new int[field4437];
        int[] var9 = new int[field4437];
        for (int var10 = -5; var10 < field4439; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field4437; var13++) {
                int var10002;
                if (var11 < field4439) {
                    int var28 = arg0[field4439 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class15 var29 = field4405.method634(0, var28 - 1);
                        var5[var13] += var29.field207;
                        var6[var13] += var29.field213;
                        var7[var13] += var29.field204;
                        var8[var13] += var29.field203;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field4439 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class15 var31 = field4405.method634(0, var30 - 1);
                        var5[var13] -= var31.field207;
                        var6[var13] -= var31.field213;
                        var7[var13] -= var31.field204;
                        var8[var13] -= var31.field203;
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
                for (int var19 = -5; var19 < field4437; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field4437) {
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
                        if ((arg0[field4439 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field4439 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class714.method3962(var14 * 256 / var17, 2, var16 / var18, var15 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field4439 * var19 + var10;
                            int var27 = class487.field6932[class179.method1091(class604.method3322((byte) 115, var25, 96), true) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIII)V", line = 230)
    public static final void method2001(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4433 = arg0 - field4441;
        field4432 = arg1 - field4442;
        field4429 = arg2 - field4441;
        field4435 = arg3 - field4442;
        field4428 = arg4;
        field4430 = arg5;
        field4444 = arg6;
        field4438 = arg7;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ld;III)I", line = 242)
    private static final int method2002(class96 arg0, int arg1, int arg2, int arg3) {
        class424 var4 = field4411.method3570(4, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field6047;
        if (var5 >= 0 && arg0.method389(9559, var5).field1167) {
            var5 = -1;
        }
        int var9;
        if (var4.field6036 >= 0) {
            int var6 = var4.field6036;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class487.field6932[class179.method1091(class29.method296(var8, 96, (byte) 107), true) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class487.field6932[class179.method1091(class29.method296(arg0.method389(9559, var5).field1151, 96, (byte) 107), true) & 0xFFFF] | 0xFF000000;
        } else if (var4.field6043 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field6043;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class487.field6932[class179.method1091(class29.method296(var12, 96, (byte) 107), true) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lha;II)V", line = 300)
    public static final void method2003(class454 arg0, int arg1, int arg2) {
        class179 var3 = new class179(field4410.method3813(field4407.field5291, "area", -52));
        int var4 = var3.method1094(255);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method1094(255);
        }
        int var7 = var3.method1094(255);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1094(255);
        }
        while (true) {
            while (var3.field2354 < var3.field2325.length) {
                if (var3.method1094(255) == 0) {
                    int var22 = var3.method1094(255);
                    int var23 = var3.method1094(255);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field4441;
                            int var27 = var23 * 64 + var25 - field4442;
                            method2008(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method1094(255);
                    int var29 = var3.method1094(255);
                    int var30 = var3.method1094(255);
                    int var31 = var3.method1094(255);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field4441;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field4442;
                            method2008(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field4443 = new byte[field4439 * field4437];
            field4436 = new short[field4439 * field4437];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field4439 * field4437];
                for (int var13 = 0; var13 < field4440[var11].length; var13++) {
                    for (int var19 = 0; var19 < field4440[var11][0].length; var19++) {
                        class314 var20 = field4440[var11][var13][var19];
                        if (var20 != null) {
                            for (class230 var21 = (class230) var20.method1839(72); var21 != null; var21 = (class230) var20.method1836((byte) -26)) {
                                var12[(var19 * 64 + var21.field2995) * field4439 + var13 * 64 + var21.field2996] = (byte) var21.field3000;
                            }
                        }
                    }
                }
                method2000(var12, field4443, field4436, arg1, arg2);
                for (int var14 = 0; var14 < field4440[var11].length; var14++) {
                    for (int var15 = 0; var15 < field4440[var11][0].length; var15++) {
                        class314 var16 = field4440[var11][var14][var15];
                        if (var16 != null) {
                            for (class230 var17 = (class230) var16.method1839(-122); var17 != null; var17 = (class230) var16.method1836((byte) -26)) {
                                int var18 = (var15 * 64 + var17.field2995) * field4439 + var14 * 64 + var17.field2996;
                                var17.field3000 = (field4443[var18] & 0xFF) << 16 | field4436[var18] & 0xFFFF;
                                if (var17.field3000 != 0) {
                                    var17.field3000 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method2000(field4427, field4443, field4436, arg1, arg2);
            field4427 = null;
            method2019();
            return;
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V", line = 480)
    public static final void method2004(int arg0) {
        field4407 = (class377) field4412.method3248((long) arg0, 0);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lha;IIII)V", line = 484)
    private static final void method2005(class454 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field4429 - field4433;
        int var6 = field4432 - field4435;
        if (field4429 < field4439) {
            var5++;
        }
        if (field4432 < field4437) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field4428;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field4428;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field4433 + var7;
                if (var52 >= 0 && var52 < field4439) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field4438 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field4438 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field4435 + var53;
                            int var58 = field4439 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field4437) {
                                var59 = (field4443[var58] & 0xFF) << 16 | field4436[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field4423[var58] & 0xFF;
                                var61 = field4431[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field4407.field5281 != -1) {
                                    var62 = field4407.field5281 | 0xFF000000;
                                } else if ((field4433 + var7 & 0x4) == (field4432 + var53 & 0x4)) {
                                    var62 = field4425[field4411.field9046 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method167(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method2010(arg0, var49, var54, var51, var56, var59, var60, field4424[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class180 var63 = (class180) field4434.method3248((long) (var52 << 16 | var57), 0);
                                if (var63 != null) {
                                    method2010(arg0, var49, var54, var51, var56, var59, var60, field4424[var58], var63.field2369, var63.field2370, true);
                                }
                            } else {
                                field4422[0] = (short) (var61 - 1);
                                field4418[0] = field4426[var58];
                                method2010(arg0, var49, var54, var51, var56, var59, var60, field4424[var58], field4422, field4418, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field4438 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field4438 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field4407.field5281 != -1) {
                            var68 = field4407.field5281 | 0xFF000000;
                        } else if ((field4433 + var7 & 0x4) == (field4432 + var64 & 0x4)) {
                            var68 = field4425[field4411.field9046 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method167(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field4428;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field4428;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field4433 + var8;
                if (var41 >= 0 && var41 < field4439) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field4438 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field4438 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field4435 + var42;
                            if (var46 >= 0 && var46 < field4437) {
                                int var47 = field4431[field4439 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method1997(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class180 var48 = (class180) field4434.method3248((long) (var41 << 16 | var46), 0);
                                    if (var48 != null) {
                                        method1997(arg0, var38, var43, var40, var45, var48.field2369, var48.field2370);
                                    }
                                } else {
                                    field4422[0] = (short) (var47 - 1);
                                    field4418[0] = field4426[field4439 * var46 + var41];
                                    method1997(arg0, var38, var43, var40, var45, field4422, field4418);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field4433 >> 6;
        int var10 = field4435 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field4429 >> 6;
        int var12 = field4432 >> 6;
        if (var11 >= field4440[0].length) {
            var11 = field4440[0].length - 1;
        }
        if (var12 >= field4440[0][0].length) {
            var12 = field4440[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class314 var28 = field4440[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field4441 >> 6) + var14) * 64;
                        int var30 = ((field4442 >> 6) + var27) * 64;
                        for (class230 var31 = (class230) var28.method1839(44); var31 != null; var31 = (class230) var28.method1836((byte) -26)) {
                            int var32 = var31.field2996 + var29 - field4441 - field4433;
                            int var33 = var31.field2995 + var30 - field4442 - field4435;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field4428;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field4428;
                            int var36 = field4438 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field4438 - (arg2 * var33 + arg4 >> 16);
                            method2010(arg0, var34, var36, var35 - var34, var37 - var36, var31.field3000, var31.field3001 & 0xFF, var31.field2997, var31.field2998, var31.field2999, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class314 var17 = field4440[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field4441 >> 6) + var15) * 64;
                        int var19 = ((field4442 >> 6) + var16) * 64;
                        for (class230 var20 = (class230) var17.method1839(65); var20 != null; var20 = (class230) var17.method1836((byte) -26)) {
                            int var21 = var20.field2996 + var18 - field4441 - field4433;
                            int var22 = var20.field2995 + var19 - field4442 - field4435;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field4428;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field4428;
                            int var25 = field4438 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field4438 - (arg2 * var22 + arg4 >> 16);
                            method1997(arg0, var23, var25, var24 - var23, var26 - var25, var20.field2998, var20.field2999);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lkha;Lpe;Lsl;Lvc;Lgo;Lln;Ldk;)V", line = 828)
    public static final void method2006(class687 arg0, class658 arg1, class92 arg2, class143 arg3, class470 arg4, class237 arg5, class683 arg6) {
        field4410 = arg0;
        field4411 = arg1;
        field4405 = arg2;
        field4404 = arg3;
        field4406 = arg4;
        field4408 = arg5;
        field4409 = arg6;
        field4412.method3251(false);
        int var7 = field4410.method3820("details", -1);
        int[] var8 = field4410.method3817(var7, 0);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class377 var10 = class634.method3443(var8[var9], field4410, var7, (byte) -111);
                field4412.method3249((long) var10.field5285, var10, (byte) 122);
            }
        }
        class651.method3514(true, true, false);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lha;Lgba;IIII)V", line = 858)
    private static final void method2007(class454 arg0, class499 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field7050 = ((arg1.field7059 - field4433) * arg2 + arg4 >> 16) + field4428;
        arg1.field7046 = field4438 - ((arg1.field7047 - field4435) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lha;Ltn;IIII[I[I)V", line = 865)
    private static final void method2008(class454 arg0, class179 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method1094(255);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method1094(255);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field4427[field4439 * arg5 + arg4] = (byte) var11;
                    field4423[field4439 * arg5 + arg4] = 0;
                } else {
                    field4423[field4439 * arg5 + arg4] = (byte) var11;
                    field4424[field4439 * arg5 + arg4] = 0;
                    field4427[field4439 * arg5 + arg4] = arg1.method1133(8);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method1094(255);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method1094(255);
                var18 = arg1.method1094(255);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method1094(255);
            }
            if (var15 == 0) {
                field4427[field4439 * arg5 + arg4] = (byte) var16;
                field4423[field4439 * arg5 + arg4] = (byte) var17;
                field4424[field4439 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field4431[field4439 * arg5 + arg4] = (short) (arg1.method1107(false) + 1);
                    field4426[field4439 * arg5 + arg4] = arg1.method1133(8);
                } else if (var19 > 1) {
                    field4431[field4439 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method1107(false);
                        var21[var22] = arg1.method1133(8);
                    }
                    field4434.method3249((long) (arg4 << 16 | arg5), new class180(var20, var21), (byte) 67);
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method1107(false);
                        var24[var25] = arg1.method1133(8);
                    }
                }
                if (field4440[var15 - 1][arg2 - (field4441 >> 6)][arg3 - (field4442 >> 6)] == null) {
                    field4440[var15 - 1][arg2 - (field4441 >> 6)][arg3 - (field4442 >> 6)] = new class314();
                }
                class230 var26 = new class230(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field4440[var15 - 1][arg2 - (field4441 >> 6)][arg3 - (field4442 >> 6)].method1840(18, var26);
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Lng;", line = 1006)
    public static final class377 method2009(int arg0, int arg1) {
        for (class377 var2 = (class377) field4412.method3245(false); var2 != null; var2 = (class377) field4412.method3252(12938)) {
            if (var2.field5274 && var2.method2286(arg1, arg0, (byte) 97)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lha;IIIIIII[S[BZ)V", line = 1019)
    private static final void method2010(class454 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method167(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field4425[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method167(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class630.method3431(field4425[arg6], arg7 >> 6 & 0x3, field4416, var12, field4420, arg0, arg4, var11, 3, arg1, arg5, arg3, arg2);
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
                class290 var18 = field4404.method890(arg8[var16] & 0xFFFF, false);
                if (var18.field3736 == -1) {
                    int var19 = -3355444;
                    if (var18.field3738 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method128(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method160(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method128(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method160(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method128(arg1, arg2, arg4, -1, 0);
                            arg0.method160(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method128(var14, arg2, arg4, -1, 0);
                            arg0.method160(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method128(var14, arg2, arg4, -1, 0);
                            arg0.method160(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method128(arg1, arg2, arg4, -1, 0);
                            arg0.method160(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method160(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method160(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method160(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method160(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method160(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method160(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(Lha;IIII)Lqia;", line = 1183)
    private static final class547 method2011(class454 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class499 var5 = (class499) field4421.method3111(104); var5 != null; var5 = (class499) field4421.method3116(-67)) {
            method2007(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field4421;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lha;)Lqia;", line = 1194)
    public static final class547 method2012(class454 arg0) {
        int var1 = field4429 - field4433;
        int var2 = field4432 - field4435;
        int var3 = (field4444 - field4428 << 16) / var1;
        int var4 = (field4438 - field4430 << 16) / var2;
        return method2011(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ld;II)V", line = 1206)
    public static final void method2013(class96 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field4411.field9044; var3++) {
            field4425[var3 + 1] = method2002(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(Lha;)V", line = 1216)
    public static final void method2014(class454 arg0) {
        int var1 = field4429 - field4433;
        int var2 = field4432 - field4435;
        int var3 = (field4444 - field4428 << 16) / var1;
        int var4 = (field4438 - field4430 << 16) / var2;
        method2005(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "()V", line = 1226)
    public static final void method2015() {
        field4427 = new byte[field4439 * field4437];
        field4423 = new byte[field4439 * field4437];
        field4424 = new byte[field4439 * field4437];
        field4431 = new short[field4439 * field4437];
        field4426 = new byte[field4439 * field4437];
        field4434 = new class583(1024);
        field4440 = new class314[3][field4439 >> 6][field4437 >> 6];
        field4425 = new int[field4411.field9044 + 1];
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lha;Lgba;Lqca;)V", line = 1245)
    public static final void method2016(class454 arg0, class499 arg1, class351 arg2) {
        if (arg2.field4614 == null) {
            return;
        }
        int[] var3 = new int[arg2.field4614.length];
        for (int var4 = 0; var4 < var3.length / 2; var4++) {
            int var21 = arg2.field4614[var4 * 2] + arg1.field7059;
            int var22 = arg2.field4614[var4 * 2 + 1] + arg1.field7047;
            var3[var4 * 2] = (field4444 - field4428) * (var21 - field4433) / (field4429 - field4433) + field4428;
            var3[var4 * 2 + 1] = field4438 - (field4438 - field4430) * (var22 - field4435) / (field4432 - field4435);
        }
        class212.method1296(arg0, var3, arg2.field4598);
        if (arg2.field4592 > 0) {
            for (int var5 = 0; var5 < var3.length / 2 - 1; var5++) {
                int var13 = var3[var5 * 2];
                int var14 = var3[var5 * 2 + 1];
                int var15 = var3[(var5 + 1) * 2];
                int var16 = var3[(var5 + 1) * 2 + 1];
                if (var15 < var13) {
                    int var17 = var13;
                    int var18 = var14;
                    var13 = var15;
                    var14 = var16;
                    var15 = var17;
                    var16 = var18;
                } else if (var13 == var15 && var16 < var14) {
                    int var19 = var14;
                    var14 = var16;
                    var16 = var19;
                }
                arg0.method145(var13, var14, var15, var16, arg2.field4628[arg2.field4605[var5] & 0xFF], 1, arg2.field4592, arg2.field4594, arg2.field4591);
            }
            int var6 = var3[var3.length - 2];
            int var7 = var3[var3.length - 1];
            int var8 = var3[0];
            int var9 = var3[1];
            if (var8 < var6) {
                int var10 = var6;
                int var11 = var7;
                var6 = var8;
                var7 = var9;
                var8 = var10;
                var9 = var11;
            } else if (var6 == var8 && var9 < var7) {
                int var12 = var7;
                var7 = var9;
                var9 = var12;
            }
            arg0.method145(var6, var7, var8, var9, arg2.field4628[arg2.field4605[arg2.field4605.length - 1] & 0xFF], 1, arg2.field4592, arg2.field4594, arg2.field4591);
            return;
        }
        for (int var20 = 0; var20 < var3.length / 2 - 1; var20++) {
            arg0.method2671(var3[(var20 + 1) * 2 + 1], var3[(var20 + 1) * 2], var3[var20 * 2 + 1], arg2.field4628[arg2.field4605[var20] & 0xFF], var3[var20 * 2], (byte) -109);
        }
        arg0.method2671(var3[1], var3[0], var3[var3.length - 1], arg2.field4628[arg2.field4605[arg2.field4605.length - 1] & 0xFF], var3[var3.length - 2], (byte) -114);
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "()V", line = 1355)
    public static final void method2017() {
        field4427 = null;
        field4443 = null;
        field4436 = null;
        field4423 = null;
        field4424 = null;
        field4431 = null;
        field4426 = null;
        field4434 = null;
        field4440 = null;
        field4425 = null;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)Lbj;", line = 1368)
    public static final class430 method2018(int arg0, int arg1) {
        class430 var2 = new class430();
        for (class377 var3 = (class377) field4412.method3245(false); var3 != null; var3 = (class377) field4412.method3252(12938)) {
            if (var3.field5274 && var3.method2286(arg1, arg0, (byte) 86)) {
                var2.method2564(var3, (byte) -123);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "()V", line = 1395)
    private static final void method2019() {
        for (int var0 = 0; var0 < field4439; var0++) {
            for (int var11 = 0; var11 < field4437; var11++) {
                int var12 = field4431[field4439 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class180 var13 = (class180) field4434.method3248((long) (var0 << 16 | var11), 0);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field2369.length; var14++) {
                                class290 var15 = field4404.method890(var13.field2369[var14] & 0xFFFF, false);
                                int var16 = var15.field3773;
                                if (var15.field3685 != null) {
                                    class290 var17 = var15.method1739((byte) -120, field4409);
                                    if (var17 != null) {
                                        var16 = var17.field3773;
                                    }
                                }
                                if (var16 != -1) {
                                    class499 var18 = new class499(var16);
                                    var18.field7059 = var0;
                                    var18.field7047 = var11;
                                    field4421.method3110(var18, 1);
                                }
                            }
                        }
                    } else {
                        class290 var19 = field4404.method890(var12 - 1, false);
                        int var20 = var19.field3773;
                        if (var19.field3685 != null) {
                            class290 var21 = var19.method1739((byte) -120, field4409);
                            if (var21 != null) {
                                var20 = var21.field3773;
                            }
                        }
                        if (var20 != -1) {
                            class499 var22 = new class499(var20);
                            var22.field7059 = var0;
                            var22.field7047 = var11;
                            field4421.method3110(var22, 1);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field4440[0].length; var2++) {
                for (int var3 = 0; var3 < field4440[0][0].length; var3++) {
                    class314 var4 = field4440[var1][var2][var3];
                    if (var4 != null) {
                        for (class230 var5 = (class230) var4.method1839(13); var5 != null; var5 = (class230) var4.method1836((byte) -26)) {
                            if (var5.field2998 != null) {
                                for (int var6 = 0; var6 < var5.field2998.length; var6++) {
                                    class290 var7 = field4404.method890(var5.field2998[var6] & 0xFFFF, false);
                                    int var8 = var7.field3773;
                                    if (var7.field3685 != null) {
                                        class290 var9 = var7.method1739((byte) -120, field4409);
                                        if (var9 != null) {
                                            var8 = var9.field3773;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class499 var10 = new class499(var8);
                                        var10.field7059 = ((field4441 >> 6) + var2) * 64 + var5.field2996 - field4441;
                                        var10.field7047 = ((field4442 >> 6) + var3) * 64 + var5.field2995 - field4442;
                                        field4421.method3110(var10, 1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "()V", line = 1551)
    public static void method2020() {
        field4411 = null;
        field4405 = null;
        field4404 = null;
        field4406 = null;
        field4408 = null;
        field4409 = null;
        field4407 = null;
        field4410 = null;
        field4412 = null;
        field4416 = null;
        field4422 = null;
        field4418 = null;
        field4417 = null;
        field4421 = null;
        field4425 = null;
        field4427 = null;
        field4443 = null;
        field4436 = null;
        field4423 = null;
        field4424 = null;
        field4431 = null;
        field4426 = null;
        field4434 = null;
        field4440 = null;
    }
}
