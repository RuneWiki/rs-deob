import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class293 {

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Lvk;")
    private static class56 field4173 = new class56(16);

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "[S")
    private static short[] field4181 = new short[1];

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "[B")
    private static byte[] field4178 = new byte[1];

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field4182 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field4184 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "Lar;")
    public static class47 field4180 = new class47();

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "F")
    public static float field4176;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "F")
    public static float field4179;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Lln;")
    public static class252 field4174;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "Llm;")
    public static class347 field4175;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "Lvk;")
    private static class56 field4198;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Lle;")
    public static class65 field4177;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "[B")
    private static byte[] field4186;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "[B")
    private static byte[] field4188;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "[B")
    private static byte[] field4191;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "[B")
    private static byte[] field4194;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "[B")
    private static byte[] field4195;

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "[I")
    private static int[] field4207;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "[S")
    private static short[] field4193;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "[S")
    private static short[] field4204;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "[[[B")
    public static byte[][][] field4183;

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "[[[Lke;")
    private static class162[][][] field4203;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lii;IIII[S[B)V")
    private static final void method1984(class405 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class104 var8 = class329.method2190((byte) 63, arg5[var7] & 0xFFFF);
            int var9 = var8.field1496;
            if (var9 != -1) {
                class399 var10 = class59.method414(var9, (byte) 57);
                class67 var11 = var10.method2574(var8.field1446 ? var8.field1440 : false, arg0, var8.field1511 ? arg6[var7] >> 6 & 0x3 : 0, 0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method411() >> 2;
                    int var13 = arg4 * var11.method409() >> 2;
                    if (var10.field5947) {
                        int var14 = var8.field1489;
                        int var15 = var8.field1506;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field5956 == 0) {
                            var11.method453(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method402(arg1, arg2 + arg4 - var13, var12, var13, 1, var10.field5956 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([B[B[SII)V")
    private static final void method1985(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field4192];
        int[] var6 = new int[field4192];
        int[] var7 = new int[field4192];
        int[] var8 = new int[field4192];
        int[] var9 = new int[field4192];
        for (int var10 = -5; var10 < field4199; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field4192; var13++) {
                int var10002;
                if (var11 < field4199) {
                    int var28 = arg0[field4199 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class264 var29 = class72.method530(var28 - 1, 99);
                        var5[var13] += var29.field3825;
                        var6[var13] += var29.field3828;
                        var7[var13] += var29.field3839;
                        var8[var13] += var29.field3833;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field4199 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class264 var31 = class72.method530(var30 - 1, 125);
                        var5[var13] -= var31.field3825;
                        var6[var13] -= var31.field3828;
                        var7[var13] -= var31.field3839;
                        var8[var13] -= var31.field3833;
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
                for (int var19 = -5; var19 < field4192; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field4192) {
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
                        if ((arg0[field4199 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field4199 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class373.method2418(-16044, var14 * 256 / var17, var15 / var18, var16 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field4199 * var19 + var10;
                            int var27 = class349.field5050[class62.method434(class237.method1419(127, var25, 96), 2194) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Llm;)V")
    public static final void method1986(class347 arg0) {
        field4175 = arg0;
        field4173.method391(84);
        int var1 = field4175.method2270("details", (byte) 115);
        int[] var2 = field4175.method2253(var1, -128);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class252 var4 = class416.method2650(var1, field4175, (byte) 125, var2[var3]);
            field4173.method381(true, var4, (long) var4.field3463);
        }
        class226.method1312(127, true, false);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lii;II)V")
    public static final void method1987(class405 arg0, int arg1, int arg2) {
        class228 var3 = new class228(field4175.method2281("area", field4174.field3460, (byte) -68));
        int var4 = var3.method1348(-88);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method1348(-100);
        }
        int var7 = var3.method1348(-117);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1348(-113);
        }
        while (true) {
            while (var3.field3029 < var3.field3040.length) {
                if (var3.method1348(-105) == 0) {
                    int var22 = var3.method1348(-95);
                    int var23 = var3.method1348(-99);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field4205;
                            int var27 = var23 * 64 + var25 - field4197;
                            method2002(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method1348(-112);
                    int var29 = var3.method1348(-118);
                    int var30 = var3.method1348(-102);
                    int var31 = var3.method1348(-115);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field4205;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field4197;
                            method2002(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field4188 = new byte[field4199 * field4192];
            field4204 = new short[field4199 * field4192];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field4199 * field4192];
                for (int var13 = 0; var13 < field4203[var11].length; var13++) {
                    for (int var19 = 0; var19 < field4203[var11][0].length; var19++) {
                        class162 var20 = field4203[var11][var13][var19];
                        if (var20 != null) {
                            for (class239 var21 = (class239) var20.method1005(-99); var21 != null; var21 = (class239) var20.method1009(false)) {
                                var12[(var19 * 64 + var21.field3207) * field4199 + var13 * 64 + var21.field3205] = (byte) var21.field3209;
                            }
                        }
                    }
                }
                method1985(var12, field4188, field4204, arg1, arg2);
                for (int var14 = 0; var14 < field4203[var11].length; var14++) {
                    for (int var15 = 0; var15 < field4203[var11][0].length; var15++) {
                        class162 var16 = field4203[var11][var14][var15];
                        if (var16 != null) {
                            for (class239 var17 = (class239) var16.method1005(-111); var17 != null; var17 = (class239) var16.method1009(false)) {
                                int var18 = (var15 * 64 + var17.field3207) * field4199 + var14 * 64 + var17.field3205;
                                var17.field3209 = (field4188[var18] & 0xFF) << 16 | field4204[var18] & 0xFFFF;
                                if (var17.field3209 != 0) {
                                    var17.field3209 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method1985(field4194, field4188, field4204, arg1, arg2);
            field4194 = null;
            method2001();
            return;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "()V")
    public static final void method1988() {
        field4194 = new byte[field4199 * field4192];
        field4195 = new byte[field4199 * field4192];
        field4186 = new byte[field4199 * field4192];
        field4193 = new short[field4199 * field4192];
        field4191 = new byte[field4199 * field4192];
        field4198 = new class56(1024);
        field4203 = new class162[3][field4199 >> 6][field4192 >> 6];
        field4207 = new int[class448.field6565 + 1];
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static final void method1989(int arg0) {
        field4174 = (class252) field4173.method384((long) arg0, true);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lfh;II)V")
    public static final void method1990(class210 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class448.field6565; var3++) {
            field4207[var3 + 1] = method1997(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "()V")
    public static void method1991() {
        field4174 = null;
        field4175 = null;
        field4173 = null;
        field4183 = null;
        field4181 = null;
        field4178 = null;
        field4177 = null;
        field4180 = null;
        field4207 = null;
        field4194 = null;
        field4188 = null;
        field4204 = null;
        field4195 = null;
        field4186 = null;
        field4193 = null;
        field4191 = null;
        field4198 = null;
        field4203 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lii;Lni;IIII)V")
    private static final void method1992(class405 arg0, class246 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field3321 = ((arg1.field3317 - field4206) * arg2 + arg4 >> 16) + field4202;
        arg1.field3326 = field4201 - ((arg1.field3327 - field4189) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lii;IIII)V")
    private static final void method1993(class405 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field4196 - field4206;
        int var6 = field4187 - field4189;
        if (field4196 < field4199) {
            var5++;
        }
        if (field4187 < field4192) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field4202;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field4202;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field4206 + var7;
                if (var52 >= 0 && var52 < field4199) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field4201 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field4201 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field4189 + var53;
                            int var58 = field4199 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field4192) {
                                var59 = (field4188[var58] & 0xFF) << 16 | field4204[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field4195[var58] & 0xFF;
                                var61 = field4193[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field4174.field3456 != -1) {
                                    var62 = field4174.field3456 | 0xFF000000;
                                } else if ((field4206 + var7 & 0x4) == (field4187 + var53 & 0x4)) {
                                    var62 = field4207[class89.field1250 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method1632(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method1994(arg0, var49, var54, var51, var56, var59, var60, field4186[var58], (short[]) null, (byte[]) null, true);
                            } else if (var61 == 65535) {
                                class297 var63 = (class297) field4198.method384((long) (var52 << 16 | var57), true);
                                if (var63 != null) {
                                    method1994(arg0, var49, var54, var51, var56, var59, var60, field4186[var58], var63.field4265, var63.field4264, true);
                                }
                            } else {
                                field4181[0] = (short) (var61 - 1);
                                field4178[0] = field4191[var58];
                                method1994(arg0, var49, var54, var51, var56, var59, var60, field4186[var58], field4181, field4178, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field4201 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field4201 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field4174.field3456 != -1) {
                            var68 = field4174.field3456 | 0xFF000000;
                        } else if ((field4206 + var7 & 0x4) == (field4187 + var64 & 0x4)) {
                            var68 = field4207[class89.field1250 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method1632(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field4202;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field4202;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field4206 + var8;
                if (var41 >= 0 && var41 < field4199) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field4201 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field4201 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field4189 + var42;
                            if (var46 >= 0 && var46 < field4192) {
                                int var47 = field4193[field4199 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method1984(arg0, var38, var43, var40, var45, (short[]) null, (byte[]) null);
                                } else if (var47 == 65535) {
                                    class297 var48 = (class297) field4198.method384((long) (var41 << 16 | var46), true);
                                    if (var48 != null) {
                                        method1984(arg0, var38, var43, var40, var45, var48.field4265, var48.field4264);
                                    }
                                } else {
                                    field4181[0] = (short) (var47 - 1);
                                    field4178[0] = field4191[field4199 * var46 + var41];
                                    method1984(arg0, var38, var43, var40, var45, field4181, field4178);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field4206 >> 6;
        int var10 = field4189 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field4196 >> 6;
        int var12 = field4187 >> 6;
        if (var11 >= field4203[0].length) {
            var11 = field4203[0].length - 1;
        }
        if (var12 >= field4203[0][0].length) {
            var12 = field4203[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class162 var28 = field4203[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field4205 >> 6) + var14) * 64;
                        int var30 = ((field4197 >> 6) + var27) * 64;
                        for (class239 var31 = (class239) var28.method1005(98); var31 != null; var31 = (class239) var28.method1009(false)) {
                            int var32 = var31.field3205 + var29 - field4205 - field4206;
                            int var33 = var31.field3207 + var30 - field4197 - field4189;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field4202;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field4202;
                            int var36 = field4201 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field4201 - (arg2 * var33 + arg4 >> 16);
                            method1994(arg0, var34, var36, var35 - var34, var37 - var36, var31.field3209, var31.field3208 & 0xFF, var31.field3211, var31.field3210, var31.field3206, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class162 var17 = field4203[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field4205 >> 6) + var15) * 64;
                        int var19 = ((field4197 >> 6) + var16) * 64;
                        for (class239 var20 = (class239) var17.method1005(-111); var20 != null; var20 = (class239) var17.method1009(false)) {
                            int var21 = var20.field3205 + var18 - field4205 - field4206;
                            int var22 = var20.field3207 + var19 - field4197 - field4189;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field4202;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field4202;
                            int var25 = field4201 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field4201 - (arg2 * var22 + arg4 >> 16);
                            method1984(arg0, var23, var25, var24 - var23, var26 - var25, var20.field3210, var20.field3206);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lii;IIIIIII[S[BZ)V")
    private static final void method1994(class405 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method1632(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field4207[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method1632(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class324.method2176(arg7 >> 6 & 0x3, field4185, field4207[arg6], arg1, arg2, arg0, var12, arg5, var11, arg4, arg3, 0, field4183);
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
                class104 var18 = class329.method2190((byte) 63, arg8[var16] & 0xFFFF);
                if (var18.field1496 == -1) {
                    int var19 = -3355444;
                    if (var18.field1455 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method1666(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1739(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1666(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method1739(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method1666(arg1, arg2, arg4, -1, 0);
                            arg0.method1739(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1666(var14, arg2, arg4, -1, 0);
                            arg0.method1739(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1666(var14, arg2, arg4, -1, 0);
                            arg0.method1739(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method1666(arg1, arg2, arg4, -1, 0);
                            arg0.method1739(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method1739(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1739(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1739(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method1739(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method1739(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method1739(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lii;)V")
    public static final void method1995(class405 arg0) {
        int var1 = field4196 - field4206;
        int var2 = field4187 - field4189;
        int var3 = (field4200 - field4202 << 16) / var1;
        int var4 = (field4201 - field4190 << 16) / var2;
        method1993(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "()V")
    public static final void method1996() {
        field4194 = null;
        field4188 = null;
        field4204 = null;
        field4195 = null;
        field4186 = null;
        field4193 = null;
        field4191 = null;
        field4198 = null;
        field4203 = null;
        field4207 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lfh;III)I")
    private static final int method1997(class210 arg0, int arg1, int arg2, int arg3) {
        class100 var4 = class415.method2642(arg1, 11619);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field1410;
        if (var5 >= 0 && arg0.method186(var5, -9590).field6494) {
            var5 = -1;
        }
        int var9;
        if (var4.field1407 >= 0) {
            int var6 = var4.field1407;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class349.field5050[class62.method434(class21.method145(false, 96, var8), 2194) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class349.field5050[class62.method434(class21.method145(false, 96, arg0.method186(var5, -9590).field6504), 2194) & 0xFFFF] | 0xFF000000;
        } else if (var4.field1393 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field1393;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class349.field5050[class62.method434(class21.method145(false, 96, var12), 2194) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(Lii;)Lar;")
    public static final class47 method1998(class405 arg0) {
        int var1 = field4196 - field4206;
        int var2 = field4187 - field4189;
        int var3 = (field4200 - field4202 << 16) / var1;
        int var4 = (field4201 - field4190 << 16) / var2;
        return method2004(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "()V")
    public static final void method1999() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field4177.field860; var1++) {
            boolean var2 = field4174.method1526(field4177.field864[var1] >> 14 & 0x3FFF, field4177.field864[var1] >> 28 & 0x3, false, field4177.field864[var1] & 0x3FFF, var0);
            if (var2) {
                class246 var3 = new class246(field4177.field863[var1]);
                var3.field3317 = var0[1] - field4205;
                var3.field3327 = var0[2] - field4197;
                field4180.method330(var3, -2130841184);
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)Lln;")
    public static final class252 method2000(int arg0, int arg1) {
        for (class252 var2 = (class252) field4173.method389(0); var2 != null; var2 = (class252) field4173.method388(0)) {
            if (var2.field3466 && var2.method1524(arg0, -69, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "()V")
    private static final void method2001() {
        for (int var0 = 0; var0 < field4199; var0++) {
            for (int var11 = 0; var11 < field4192; var11++) {
                int var12 = field4193[field4199 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class297 var13 = (class297) field4198.method384((long) (var0 << 16 | var11), true);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field4265.length; var14++) {
                                class104 var15 = class329.method2190((byte) 63, var13.field4265[var14] & 0xFFFF);
                                int var16 = var15.field1504;
                                if (var15.field1518 != null) {
                                    class104 var17 = var15.method708((byte) 87);
                                    if (var17 != null) {
                                        var16 = var17.field1504;
                                    }
                                }
                                if (var16 != -1) {
                                    class246 var18 = new class246(var16);
                                    var18.field3317 = var0;
                                    var18.field3327 = var11;
                                    field4180.method330(var18, -2130841184);
                                }
                            }
                        }
                    } else {
                        class104 var19 = class329.method2190((byte) 63, var12 - 1);
                        int var20 = var19.field1504;
                        if (var19.field1518 != null) {
                            class104 var21 = var19.method708((byte) 103);
                            if (var21 != null) {
                                var20 = var21.field1504;
                            }
                        }
                        if (var20 != -1) {
                            class246 var22 = new class246(var20);
                            var22.field3317 = var0;
                            var22.field3327 = var11;
                            field4180.method330(var22, -2130841184);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field4203[0].length; var2++) {
                for (int var3 = 0; var3 < field4203[0][0].length; var3++) {
                    class162 var4 = field4203[var1][var2][var3];
                    if (var4 != null) {
                        for (class239 var5 = (class239) var4.method1005(-86); var5 != null; var5 = (class239) var4.method1009(false)) {
                            if (var5.field3210 != null) {
                                for (int var6 = 0; var6 < var5.field3210.length; var6++) {
                                    class104 var7 = class329.method2190((byte) 63, var5.field3210[var6] & 0xFFFF);
                                    int var8 = var7.field1504;
                                    if (var7.field1518 != null) {
                                        class104 var9 = var7.method708((byte) 84);
                                        if (var9 != null) {
                                            var8 = var9.field1504;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class246 var10 = new class246(var8);
                                        var10.field3317 = ((field4205 >> 6) + var2) * 64 + var5.field3205 - field4205;
                                        var10.field3327 = ((field4197 >> 6) + var3) * 64 + var5.field3207 - field4197;
                                        field4180.method330(var10, -2130841184);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lii;Lnj;IIII[I[I)V")
    private static final void method2002(class405 arg0, class228 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method1348(-124);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method1348(-103);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field4194[field4199 * arg5 + arg4] = (byte) var11;
                    field4195[field4199 * arg5 + arg4] = 0;
                } else {
                    field4195[field4199 * arg5 + arg4] = (byte) var11;
                    field4186[field4199 * arg5 + arg4] = 0;
                    field4194[field4199 * arg5 + arg4] = arg1.method1349(3);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method1348(-127);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method1348(-95);
                var18 = arg1.method1348(-89);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method1348(-126);
            }
            if (var15 == 0) {
                field4194[field4199 * arg5 + arg4] = (byte) var16;
                field4195[field4199 * arg5 + arg4] = (byte) var17;
                field4186[field4199 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field4193[field4199 * arg5 + arg4] = (short) (arg1.method1343(255) + 1);
                    field4191[field4199 * arg5 + arg4] = arg1.method1349(3);
                } else if (var19 > 1) {
                    field4193[field4199 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method1343(255);
                        var21[var22] = arg1.method1349(3);
                    }
                    field4198.method381(true, new class297(var20, var21), (long) (arg4 << 16 | arg5));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method1343(255);
                        var24[var25] = arg1.method1349(3);
                    }
                }
                if (field4203[var15 - 1][arg2 - (field4205 >> 6)][arg3 - (field4197 >> 6)] == null) {
                    field4203[var15 - 1][arg2 - (field4205 >> 6)][arg3 - (field4197 >> 6)] = new class162();
                }
                class239 var26 = new class239(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field4203[var15 - 1][arg2 - (field4205 >> 6)][arg3 - (field4197 >> 6)].method1003(2166, var26);
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)Lql;")
    public static final class346 method2003(int arg0, int arg1) {
        class346 var2 = new class346();
        for (class252 var3 = (class252) field4173.method389(0); var3 != null; var3 = (class252) field4173.method388(0)) {
            if (var3.field3466 && var3.method1524(arg0, 114, arg1)) {
                var2.method2245(var3, (byte) -47);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(Lii;IIII)Lar;")
    private static final class47 method2004(class405 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class246 var5 = (class246) field4180.method332(-2130841184); var5 != null; var5 = (class246) field4180.method343((byte) -87)) {
            method1992(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field4180;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2005(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4206 = arg0 - field4205;
        field4187 = arg1 - field4197;
        field4196 = arg2 - field4205;
        field4189 = arg3 - field4197;
        field4202 = arg4;
        field4190 = arg5;
        field4200 = arg6;
        field4201 = arg7;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)Lln;")
    public static final class252 method2006(int arg0) {
        return (class252) field4173.method384((long) arg0, true);
    }
}
