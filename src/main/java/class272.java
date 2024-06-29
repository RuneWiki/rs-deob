import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class272 {

    @OriginalMember(owner = "client!to", name = "c", descriptor = "Ljj;")
    private static class156 field4072 = new class156(16);

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    public static int field4073 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!to", name = "j", descriptor = "I")
    public static int field4079 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!to", name = "l", descriptor = "[S")
    private static short[] field4081 = new short[1];

    @OriginalMember(owner = "client!to", name = "g", descriptor = "[B")
    private static byte[] field4076 = new byte[1];

    @OriginalMember(owner = "client!to", name = "f", descriptor = "Lvq;")
    public static class22 field4075 = new class22();

    @OriginalMember(owner = "client!to", name = "i", descriptor = "F")
    public static float field4078;

    @OriginalMember(owner = "client!to", name = "m", descriptor = "F")
    public static float field4082;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!to", name = "q", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!to", name = "r", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!to", name = "s", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!to", name = "u", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!to", name = "v", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!to", name = "x", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!to", name = "z", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!to", name = "A", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!to", name = "C", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!to", name = "D", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!to", name = "F", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!to", name = "I", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!to", name = "o", descriptor = "Ljj;")
    private static class156 field4084;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "Ldp;")
    public static class174 field4071;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "Ltg;")
    public static class294 field4070;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "Ld;")
    public static class378 field4074;

    @OriginalMember(owner = "client!to", name = "p", descriptor = "[B")
    private static byte[] field4085;

    @OriginalMember(owner = "client!to", name = "t", descriptor = "[B")
    private static byte[] field4089;

    @OriginalMember(owner = "client!to", name = "B", descriptor = "[B")
    private static byte[] field4097;

    @OriginalMember(owner = "client!to", name = "G", descriptor = "[B")
    private static byte[] field4102;

    @OriginalMember(owner = "client!to", name = "H", descriptor = "[B")
    private static byte[] field4103;

    @OriginalMember(owner = "client!to", name = "y", descriptor = "[I")
    private static int[] field4094;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "[S")
    private static short[] field4083;

    @OriginalMember(owner = "client!to", name = "E", descriptor = "[S")
    private static short[] field4100;

    @OriginalMember(owner = "client!to", name = "k", descriptor = "[[[B")
    public static byte[][][] field4080;

    @OriginalMember(owner = "client!to", name = "w", descriptor = "[[[Ljl;")
    private static class391[][][] field4092;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(II)Lnk;")
    public static final class206 method1931(int arg0, int arg1) {
        class206 var2 = new class206();
        for (class294 var3 = (class294) field4072.method1222(5656); var3 != null; var3 = (class294) field4072.method1224((byte) -97)) {
            if (var3.field4366 && var3.method2059(arg1, arg0, false)) {
                var2.method1564((byte) 106, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lja;Lrr;IIII)V")
    private static final void method1932(class90 arg0, class198 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field2898 = ((arg1.field2896 - field4098) * arg2 + arg4 >> 16) + field4090;
        arg1.field2899 = field4101 - ((arg1.field2900 - field4104) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lja;II)V")
    public static final void method1933(class90 arg0, int arg1, int arg2) {
        class37 var3 = new class37(field4071.method1328("area", (byte) -121, field4070.field4360));
        int var4 = var3.method271((byte) 101);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method271((byte) 121);
        }
        int var7 = var3.method271((byte) 105);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method271((byte) 126);
        }
        while (true) {
            while (var3.field565 < var3.field578.length) {
                if (var3.method271((byte) 116) == 0) {
                    int var22 = var3.method271((byte) 108);
                    int var23 = var3.method271((byte) 103);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field4096;
                            int var27 = var23 * 64 + var25 - field4088;
                            method1938(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method271((byte) 123);
                    int var29 = var3.method271((byte) 124);
                    int var30 = var3.method271((byte) 122);
                    int var31 = var3.method271((byte) 120);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field4096;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field4088;
                            method1938(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field4097 = new byte[field4099 * field4093];
            field4083 = new short[field4099 * field4093];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field4099 * field4093];
                for (int var13 = 0; var13 < field4092[var11].length; var13++) {
                    for (int var19 = 0; var19 < field4092[var11][0].length; var19++) {
                        class391 var20 = field4092[var11][var13][var19];
                        if (var20 != null) {
                            for (class222 var21 = (class222) var20.method2496(109); var21 != null; var21 = (class222) var20.method2487(0)) {
                                var12[(var19 * 64 + var21.field3307) * field4099 + var13 * 64 + var21.field3304] = (byte) var21.field3305;
                            }
                        }
                    }
                }
                method1950(var12, field4097, field4083, arg1, arg2);
                for (int var14 = 0; var14 < field4092[var11].length; var14++) {
                    for (int var15 = 0; var15 < field4092[var11][0].length; var15++) {
                        class391 var16 = field4092[var11][var14][var15];
                        if (var16 != null) {
                            for (class222 var17 = (class222) var16.method2496(92); var17 != null; var17 = (class222) var16.method2487(0)) {
                                int var18 = (var15 * 64 + var17.field3307) * field4099 + var14 * 64 + var17.field3304;
                                var17.field3305 = (field4097[var18] & 0xFF) << 16 | field4083[var18] & 0xFFFF;
                                if (var17.field3305 != 0) {
                                    var17.field3305 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method1950(field4089, field4097, field4083, arg1, arg2);
            field4089 = null;
            method1953();
            return;
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(II)Ltg;")
    public static final class294 method1934(int arg0, int arg1) {
        for (class294 var2 = (class294) field4072.method1222(5656); var2 != null; var2 = (class294) field4072.method1224((byte) -116)) {
            if (var2.field4366 && var2.method2059(arg1, arg0, false)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lja;IIII)V")
    private static final void method1935(class90 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field4086 - field4098;
        int var6 = field4091 - field4104;
        if (field4086 < field4099) {
            var5++;
        }
        if (field4091 < field4093) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field4090;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field4090;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field4098 + var7;
                if (var52 >= 0 && var52 < field4099) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field4101 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field4101 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field4104 + var53;
                            int var58 = field4099 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field4093) {
                                var59 = (field4097[var58] & 0xFF) << 16 | field4083[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field4102[var58] & 0xFF;
                                var61 = field4100[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field4070.field4377 != -1) {
                                    var62 = field4070.field4377 | 0xFF000000;
                                } else if ((field4098 + var7 & 0x4) == (field4091 + var53 & 0x4)) {
                                    var62 = field4094[class250.field3617 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method681(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method1948(arg0, var49, var54, var51, var56, var59, var60, field4085[var58], (short[]) null, (byte[]) null, true);
                            } else if (var61 == 65535) {
                                class405 var63 = (class405) field4084.method1219((long) (var52 << 16 | var57), -121);
                                if (var63 != null) {
                                    method1948(arg0, var49, var54, var51, var56, var59, var60, field4085[var58], var63.field5899, var63.field5898, true);
                                }
                            } else {
                                field4081[0] = (short) (var61 - 1);
                                field4076[0] = field4103[var58];
                                method1948(arg0, var49, var54, var51, var56, var59, var60, field4085[var58], field4081, field4076, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field4101 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field4101 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field4070.field4377 != -1) {
                            var68 = field4070.field4377 | 0xFF000000;
                        } else if ((field4098 + var7 & 0x4) == (field4091 + var64 & 0x4)) {
                            var68 = field4094[class250.field3617 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method681(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field4090;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field4090;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field4098 + var8;
                if (var41 >= 0 && var41 < field4099) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field4101 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field4101 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field4104 + var42;
                            if (var46 >= 0 && var46 < field4093) {
                                int var47 = field4100[field4099 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method1942(arg0, var38, var43, var40, var45, (short[]) null, (byte[]) null);
                                } else if (var47 == 65535) {
                                    class405 var48 = (class405) field4084.method1219((long) (var41 << 16 | var46), -115);
                                    if (var48 != null) {
                                        method1942(arg0, var38, var43, var40, var45, var48.field5899, var48.field5898);
                                    }
                                } else {
                                    field4081[0] = (short) (var47 - 1);
                                    field4076[0] = field4103[field4099 * var46 + var41];
                                    method1942(arg0, var38, var43, var40, var45, field4081, field4076);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field4098 >> 6;
        int var10 = field4104 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field4086 >> 6;
        int var12 = field4091 >> 6;
        if (var11 >= field4092[0].length) {
            var11 = field4092[0].length - 1;
        }
        if (var12 >= field4092[0][0].length) {
            var12 = field4092[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class391 var28 = field4092[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field4096 >> 6) + var14) * 64;
                        int var30 = ((field4088 >> 6) + var27) * 64;
                        for (class222 var31 = (class222) var28.method2496(69); var31 != null; var31 = (class222) var28.method2487(0)) {
                            int var32 = var31.field3304 + var29 - field4096 - field4098;
                            int var33 = var31.field3307 + var30 - field4088 - field4104;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field4090;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field4090;
                            int var36 = field4101 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field4101 - (arg2 * var33 + arg4 >> 16);
                            method1948(arg0, var34, var36, var35 - var34, var37 - var36, var31.field3305, var31.field3309 & 0xFF, var31.field3308, var31.field3310, var31.field3306, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class391 var17 = field4092[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field4096 >> 6) + var15) * 64;
                        int var19 = ((field4088 >> 6) + var16) * 64;
                        for (class222 var20 = (class222) var17.method2496(59); var20 != null; var20 = (class222) var17.method2487(0)) {
                            int var21 = var20.field3304 + var18 - field4096 - field4098;
                            int var22 = var20.field3307 + var19 - field4088 - field4104;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field4090;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field4090;
                            int var25 = field4101 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field4101 - (arg2 * var22 + arg4 >> 16);
                            method1942(arg0, var23, var25, var24 - var23, var26 - var25, var20.field3310, var20.field3306);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
    public static final void method1936(int arg0) {
        field4070 = (class294) field4072.method1219((long) arg0, -128);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1937(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4098 = arg0 - field4096;
        field4091 = arg1 - field4088;
        field4086 = arg2 - field4096;
        field4104 = arg3 - field4088;
        field4090 = arg4;
        field4087 = arg5;
        field4095 = arg6;
        field4101 = arg7;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lja;Lec;IIII[I[I)V")
    private static final void method1938(class90 arg0, class37 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method271((byte) 104);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method271((byte) 125);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field4089[field4099 * arg5 + arg4] = (byte) var11;
                    field4102[field4099 * arg5 + arg4] = 0;
                } else {
                    field4102[field4099 * arg5 + arg4] = (byte) var11;
                    field4085[field4099 * arg5 + arg4] = 0;
                    field4089[field4099 * arg5 + arg4] = arg1.method291(0);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method271((byte) 113);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method271((byte) 119);
                var18 = arg1.method271((byte) 113);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method271((byte) 107);
            }
            if (var15 == 0) {
                field4089[field4099 * arg5 + arg4] = (byte) var16;
                field4102[field4099 * arg5 + arg4] = (byte) var17;
                field4085[field4099 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field4100[field4099 * arg5 + arg4] = (short) (arg1.method320((byte) -87) + 1);
                    field4103[field4099 * arg5 + arg4] = arg1.method291(0);
                } else if (var19 > 1) {
                    field4100[field4099 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method320((byte) -87);
                        var21[var22] = arg1.method291(0);
                    }
                    field4084.method1217(1, (long) (arg4 << 16 | arg5), new class405(var20, var21));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method320((byte) -87);
                        var24[var25] = arg1.method291(0);
                    }
                }
                if (field4092[var15 - 1][arg2 - (field4096 >> 6)][arg3 - (field4088 >> 6)] == null) {
                    field4092[var15 - 1][arg2 - (field4096 >> 6)][arg3 - (field4088 >> 6)] = new class391();
                }
                class222 var26 = new class222(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field4092[var15 - 1][arg2 - (field4096 >> 6)][arg3 - (field4088 >> 6)].method2483(125, var26);
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lja;)V")
    public static final void method1939(class90 arg0) {
        int var1 = field4086 - field4098;
        int var2 = field4091 - field4104;
        int var3 = (field4095 - field4090 << 16) / var1;
        int var4 = (field4101 - field4087 << 16) / var2;
        method1935(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Ldp;)V")
    public static final void method1940(class174 arg0) {
        field4071 = arg0;
        field4072.method1228(-30653);
        int var1 = field4071.method1359(96, "details");
        int[] var2 = field4071.method1349(var1, (byte) 103);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class294 var4 = class365.method2333(var1, 0, var2[var3], field4071);
            field4072.method1217(1, (long) var4.field4365, var4);
        }
        class369.method2350((byte) -117, true, false);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "()V")
    public static final void method1941() {
        field4089 = null;
        field4097 = null;
        field4083 = null;
        field4102 = null;
        field4085 = null;
        field4100 = null;
        field4103 = null;
        field4084 = null;
        field4092 = null;
        field4094 = null;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lja;IIII[S[B)V")
    private static final void method1942(class90 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class45 var8 = class451.method2812(53, arg5[var7] & 0xFFFF);
            int var9 = var8.field699;
            if (var9 != -1) {
                class239 var10 = class402.method2549(var9, 128);
                class421 var11 = var10.method1743(var8.field729 ? var8.field705 : false, var8.field679 ? arg6[var7] >> 6 & 0x3 : 0, arg0, -82);
                if (var11 != null) {
                    int var12 = arg3 * var11.method1461() >> 2;
                    int var13 = arg4 * var11.method1463() >> 2;
                    if (var10.field3454) {
                        int var14 = var8.field717;
                        int var15 = var8.field724;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field3455 == 0) {
                            var11.method2644(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method494(arg1, arg2 + arg4 - var13, var12, var13, 1, var10.field3455 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)Ltg;")
    public static final class294 method1943(int arg0) {
        return (class294) field4072.method1219((long) arg0, -89);
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(Lja;IIII)Lvq;")
    private static final class22 method1944(class90 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class198 var5 = (class198) field4075.method157((byte) -125); var5 != null; var5 = (class198) field4075.method145(5)) {
            method1932(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field4075;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "()V")
    public static final void method1945() {
        field4089 = new byte[field4099 * field4093];
        field4102 = new byte[field4099 * field4093];
        field4085 = new byte[field4099 * field4093];
        field4100 = new short[field4099 * field4093];
        field4103 = new byte[field4099 * field4093];
        field4084 = new class156(1024);
        field4092 = new class391[3][field4099 >> 6][field4093 >> 6];
        field4094 = new int[class257.field3723 + 1];
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(Lja;)Lvq;")
    public static final class22 method1946(class90 arg0) {
        int var1 = field4086 - field4098;
        int var2 = field4091 - field4104;
        int var3 = (field4095 - field4090 << 16) / var1;
        int var4 = (field4101 - field4087 << 16) / var2;
        return method1944(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "()V")
    public static void method1947() {
        field4070 = null;
        field4071 = null;
        field4072 = null;
        field4080 = null;
        field4081 = null;
        field4076 = null;
        field4074 = null;
        field4075 = null;
        field4094 = null;
        field4089 = null;
        field4097 = null;
        field4083 = null;
        field4102 = null;
        field4085 = null;
        field4100 = null;
        field4103 = null;
        field4084 = null;
        field4092 = null;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lja;IIIIIII[S[BZ)V")
    private static final void method1948(class90 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method681(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field4094[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method681(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class324.method2148(var12, arg7 >> 6 & 0x3, arg0, (byte) -98, field4077, field4094[arg6], arg1, arg2, var11, arg3, field4080, arg5, arg4);
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
                class45 var18 = class451.method2812(96, arg8[var16] & 0xFFFF);
                if (var18.field699 == -1) {
                    int var19 = -3355444;
                    if (var18.field697 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method675(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method729(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method675(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method729(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method675(arg1, arg2, arg4, -1, 0);
                            arg0.method729(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method675(var14, arg2, arg4, -1, 0);
                            arg0.method729(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method675(var14, arg2, arg4, -1, 0);
                            arg0.method729(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method675(arg1, arg2, arg4, -1, 0);
                            arg0.method729(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method729(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method729(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method729(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method729(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method729(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method729(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "d", descriptor = "()V")
    public static final void method1949() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field4074.field5374; var1++) {
            boolean var2 = field4070.method2061(field4074.field5373[var1] >> 14 & 0x3FFF, (byte) 55, field4074.field5373[var1] >> 28 & 0x3, field4074.field5373[var1] & 0x3FFF, var0);
            if (var2) {
                class198 var3 = new class198(field4074.field5372[var1]);
                var3.field2896 = var0[1] - field4096;
                var3.field2900 = var0[2] - field4088;
                field4075.method148((byte) 95, var3);
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "([B[B[SII)V")
    private static final void method1950(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field4093];
        int[] var6 = new int[field4093];
        int[] var7 = new int[field4093];
        int[] var8 = new int[field4093];
        int[] var9 = new int[field4093];
        for (int var10 = -5; var10 < field4099; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field4093; var13++) {
                int var10002;
                if (var11 < field4099) {
                    int var28 = arg0[field4099 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class361 var29 = class199.method1514(var28 - 1, (byte) -42);
                        var5[var13] += var29.field5144;
                        var6[var13] += var29.field5155;
                        var7[var13] += var29.field5146;
                        var8[var13] += var29.field5142;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field4099 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class361 var31 = class199.method1514(var30 - 1, (byte) -42);
                        var5[var13] -= var31.field5144;
                        var6[var13] -= var31.field5155;
                        var7[var13] -= var31.field5146;
                        var8[var13] -= var31.field5142;
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
                for (int var19 = -5; var19 < field4093; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field4093) {
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
                        if ((arg0[field4099 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field4099 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class180.method1410(var14 * 256 / var17, var15 / var18, var16 / var18, 13371);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field4099 * var19 + var10;
                            int var27 = class435.field6350[class231.method1719(-24927, class418.method2620(var25, 96, (byte) -112)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lcj;III)I")
    private static final int method1951(class181 arg0, int arg1, int arg2, int arg3) {
        class451 var4 = class206.method1555(arg1, 4);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field6561;
        if (var5 >= 0 && arg0.method1412(var5, (byte) -99).field2922) {
            var5 = -1;
        }
        int var9;
        if (var4.field6540 >= 0) {
            int var6 = var4.field6540;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class435.field6350[class231.method1719(-24927, class174.method1332(96, false, var8)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class435.field6350[class231.method1719(-24927, class174.method1332(96, false, arg0.method1412(var5, (byte) -116).field2918)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field6548 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field6548;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class435.field6350[class231.method1719(-24927, class174.method1332(96, false, var12)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lcj;II)V")
    public static final void method1952(class181 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class257.field3723; var3++) {
            field4094[var3 + 1] = method1951(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!to", name = "e", descriptor = "()V")
    private static final void method1953() {
        for (int var0 = 0; var0 < field4099; var0++) {
            for (int var9 = 0; var9 < field4093; var9++) {
                int var10 = field4100[field4099 * var9 + var0] & 0xFFFF;
                if (var10 != 0) {
                    if (var10 == 65535) {
                        class405 var11 = (class405) field4084.method1219((long) (var0 << 16 | var9), -115);
                        if (var11 != null) {
                            for (int var12 = 0; var12 < var11.field5899.length; var12++) {
                                class45 var13 = class451.method2812(52, var11.field5899[var12] & 0xFFFF);
                                if (var13.field668 != -1) {
                                    class198 var14 = new class198(var13.field668);
                                    var14.field2896 = var0;
                                    var14.field2900 = var9;
                                    field4075.method148((byte) 76, var14);
                                }
                            }
                        }
                    } else {
                        class45 var15 = class451.method2812(62, var10 - 1);
                        if (var15.field668 != -1) {
                            class198 var16 = new class198(var15.field668);
                            var16.field2896 = var0;
                            var16.field2900 = var9;
                            field4075.method148((byte) 113, var16);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field4092[0].length; var2++) {
                for (int var3 = 0; var3 < field4092[0][0].length; var3++) {
                    class391 var4 = field4092[var1][var2][var3];
                    if (var4 != null) {
                        for (class222 var5 = (class222) var4.method2496(108); var5 != null; var5 = (class222) var4.method2487(0)) {
                            if (var5.field3310 != null) {
                                for (int var6 = 0; var6 < var5.field3310.length; var6++) {
                                    class45 var7 = class451.method2812(60, var5.field3310[var6] & 0xFFFF);
                                    if (var7.field668 != -1) {
                                        class198 var8 = new class198(var7.field668);
                                        var8.field2896 = ((field4096 >> 6) + var2) * 64 + var5.field3304 - field4096;
                                        var8.field2900 = ((field4088 >> 6) + var3) * 64 + var5.field3307 - field4088;
                                        field4075.method148((byte) 108, var8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
