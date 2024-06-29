import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class642 {

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "Lwr;")
    private static class459 field8933 = new class459(16);

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    public static int field8935 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    public static int field8943 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "[S")
    private static short[] field8942 = new short[1];

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "[B")
    private static byte[] field8939 = new byte[1];

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "Lkba;")
    public static class108 field8937 = new class108();

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "F")
    public static float field8936;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "F")
    public static float field8940;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field8941;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
    public static int field8946;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public static int field8947;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
    public static int field8949;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    public static int field8950;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    public static int field8955;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public static int field8956;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public static int field8958;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
    public static int field8961;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
    public static int field8962;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
    public static int field8963;

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "I")
    public static int field8965;

    @OriginalMember(owner = "client!rg", name = "O", descriptor = "I")
    public static int field8966;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "Lwf;")
    public static class137 field8938;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "Lcfa;")
    private static class170 field8930;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "Lui;")
    public static class231 field8931;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "Lkf;")
    private static class256 field8927;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "Lup;")
    public static class277 field8929;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "Lgga;")
    public static class294 field8928;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "Lwr;")
    private static class459 field8960;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "Lni;")
    public static class522 field8926;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "Lcj;")
    public static class693 field8932;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "Lsia;")
    public static class735 field8934;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "[B")
    private static byte[] field8945;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "[B")
    private static byte[] field8952;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "[B")
    private static byte[] field8953;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "[B")
    private static byte[] field8959;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "[B")
    private static byte[] field8964;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "[I")
    private static int[] field8951;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "[S")
    private static short[] field8948;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "[S")
    private static short[] field8957;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "[[[B")
    public static byte[][][] field8944;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "[[[Lo;")
    private static class29[][][] field8954;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "()V", line = 5)
    private static final void method3609() {
        for (int var0 = 0; var0 < field8961; var0++) {
            for (int var11 = 0; var11 < field8956; var11++) {
                int var12 = field8948[field8961 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class644 var13 = (class644) field8960.method2552((long) (var0 << 16 | var11), -1);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field8980.length; var14++) {
                                class685 var15 = field8934.method4109(var13.field8980[var14] & 0xFFFF, (byte) 119);
                                int var16 = var15.field9566;
                                if (var15.field9528 != null) {
                                    class685 var17 = var15.method3875(field8932, (byte) -72);
                                    if (var17 != null) {
                                        var16 = var17.field9566;
                                    }
                                }
                                if (var16 != -1) {
                                    class513 var18 = new class513(var16);
                                    var18.field6945 = var0;
                                    var18.field6939 = var11;
                                    field8937.method725(var18, -20911);
                                }
                            }
                        }
                    } else {
                        class685 var19 = field8934.method4109(var12 - 1, (byte) 119);
                        int var20 = var19.field9566;
                        if (var19.field9528 != null) {
                            class685 var21 = var19.method3875(field8932, (byte) -123);
                            if (var21 != null) {
                                var20 = var21.field9566;
                            }
                        }
                        if (var20 != -1) {
                            class513 var22 = new class513(var20);
                            var22.field6945 = var0;
                            var22.field6939 = var11;
                            field8937.method725(var22, -20911);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field8954[0].length; var2++) {
                for (int var3 = 0; var3 < field8954[0][0].length; var3++) {
                    class29 var4 = field8954[var1][var2][var3];
                    if (var4 != null) {
                        for (class145 var5 = (class145) var4.method113((byte) 15); var5 != null; var5 = (class145) var4.method119(false)) {
                            if (var5.field1875 != null) {
                                for (int var6 = 0; var6 < var5.field1875.length; var6++) {
                                    class685 var7 = field8934.method4109(var5.field1875[var6] & 0xFFFF, (byte) 119);
                                    int var8 = var7.field9566;
                                    if (var7.field9528 != null) {
                                        class685 var9 = var7.method3875(field8932, (byte) -107);
                                        if (var9 != null) {
                                            var8 = var9.field9566;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class513 var10 = new class513(var8);
                                        var10.field6945 = ((field8947 >> 6) + var2) * 64 + var5.field1874 - field8947;
                                        var10.field6939 = ((field8950 >> 6) + var3) * 64 + var5.field1871 - field8950;
                                        field8937.method725(var10, -20911);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)Lns;", line = 162)
    public static final class406 method3610(int arg0, int arg1) {
        class406 var2 = new class406();
        for (class294 var3 = (class294) field8933.method2560(107); var3 != null; var3 = (class294) field8933.method2557(-1)) {
            if (var3.field3957 && var3.method1753(6, arg0, arg1)) {
                var2.method2341(var3, -76);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "()V", line = 181)
    public static final void method3611() {
        field8953 = new byte[field8961 * field8956];
        field8959 = new byte[field8961 * field8956];
        field8945 = new byte[field8961 * field8956];
        field8948 = new short[field8961 * field8956];
        field8964 = new byte[field8961 * field8956];
        field8960 = new class459(1024);
        field8954 = new class29[3][field8961 >> 6][field8956 >> 6];
        field8951 = new int[field8930.field2124 + 1];
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lni;Lcfa;Lkf;Lsia;Lup;Lui;Lcj;)V", line = 191)
    public static final void method3612(class522 arg0, class170 arg1, class256 arg2, class735 arg3, class277 arg4, class231 arg5, class693 arg6) {
        field8926 = arg0;
        field8930 = arg1;
        field8927 = arg2;
        field8934 = arg3;
        field8929 = arg4;
        field8931 = arg5;
        field8932 = arg6;
        field8933.method2556(-107);
        int var7 = field8926.method2890((byte) -76, "details");
        int[] var8 = field8926.method2883(var7, 6341);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class294 var10 = class627.method3542(var8[var9], var7, 10443, field8926);
                field8933.method2558(var10, (long) var10.field3946, -1);
            }
        }
        class278.method1660(8, true, false);
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "()V", line = 222)
    public static final void method3613() {
        field8953 = null;
        field8952 = null;
        field8957 = null;
        field8959 = null;
        field8945 = null;
        field8948 = null;
        field8964 = null;
        field8960 = null;
        field8954 = null;
        field8951 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lha;Lji;IIII[I[I)V", line = 236)
    private static final void method3614(class60 arg0, class611 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method3428((byte) 95);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method3428((byte) 124);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field8953[field8961 * arg5 + arg4] = (byte) var11;
                    field8959[field8961 * arg5 + arg4] = 0;
                } else {
                    field8959[field8961 * arg5 + arg4] = (byte) var11;
                    field8945[field8961 * arg5 + arg4] = 0;
                    field8953[field8961 * arg5 + arg4] = arg1.method3390((byte) -19);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method3428((byte) -110);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method3428((byte) -123);
                var18 = arg1.method3428((byte) -127);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method3428((byte) 15);
            }
            if (var15 == 0) {
                field8953[field8961 * arg5 + arg4] = (byte) var16;
                field8959[field8961 * arg5 + arg4] = (byte) var17;
                field8945[field8961 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field8948[field8961 * arg5 + arg4] = (short) (arg1.method3402((byte) 127) + 1);
                    field8964[field8961 * arg5 + arg4] = arg1.method3390((byte) -19);
                } else if (var19 > 1) {
                    field8948[field8961 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method3402((byte) 127);
                        var21[var22] = arg1.method3390((byte) -19);
                    }
                    field8960.method2558(new class644(var20, var21), (long) (arg4 << 16 | arg5), -1);
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method3402((byte) 127);
                        var24[var25] = arg1.method3390((byte) -19);
                    }
                }
                if (field8954[var15 - 1][arg2 - (field8947 >> 6)][arg3 - (field8950 >> 6)] == null) {
                    field8954[var15 - 1][arg2 - (field8947 >> 6)][arg3 - (field8950 >> 6)] = new class29();
                }
                class145 var26 = new class145(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field8954[var15 - 1][arg2 - (field8947 >> 6)][arg3 - (field8950 >> 6)].method118(true, var26);
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lha;IIII)V", line = 371)
    private static final void method3615(class60 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field8946 - field8963;
        int var6 = field8955 - field8962;
        if (field8946 < field8961) {
            var5++;
        }
        if (field8955 < field8956) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field8958;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field8958;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field8963 + var7;
                if (var52 >= 0 && var52 < field8961) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field8966 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field8966 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field8962 + var53;
                            int var58 = field8961 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field8956) {
                                var59 = (field8952[var58] & 0xFF) << 16 | field8957[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field8959[var58] & 0xFF;
                                var61 = field8948[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field8928.field3945 != -1) {
                                    var62 = field8928.field3945 | 0xFF000000;
                                } else if ((field8963 + var7 & 0x4) == (field8955 + var53 & 0x4)) {
                                    var62 = field8951[field8930.field2129 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method447(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method3632(arg0, var49, var54, var51, var56, var59, var60, field8945[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class644 var63 = (class644) field8960.method2552((long) (var52 << 16 | var57), -1);
                                if (var63 != null) {
                                    method3632(arg0, var49, var54, var51, var56, var59, var60, field8945[var58], var63.field8980, var63.field8981, true);
                                }
                            } else {
                                field8942[0] = (short) (var61 - 1);
                                field8939[0] = field8964[var58];
                                method3632(arg0, var49, var54, var51, var56, var59, var60, field8945[var58], field8942, field8939, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field8966 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field8966 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field8928.field3945 != -1) {
                            var68 = field8928.field3945 | 0xFF000000;
                        } else if ((field8963 + var7 & 0x4) == (field8955 + var64 & 0x4)) {
                            var68 = field8951[field8930.field2129 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method447(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field8958;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field8958;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field8963 + var8;
                if (var41 >= 0 && var41 < field8961) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field8966 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field8966 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field8962 + var42;
                            if (var46 >= 0 && var46 < field8956) {
                                int var47 = field8948[field8961 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method3631(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class644 var48 = (class644) field8960.method2552((long) (var41 << 16 | var46), -1);
                                    if (var48 != null) {
                                        method3631(arg0, var38, var43, var40, var45, var48.field8980, var48.field8981);
                                    }
                                } else {
                                    field8942[0] = (short) (var47 - 1);
                                    field8939[0] = field8964[field8961 * var46 + var41];
                                    method3631(arg0, var38, var43, var40, var45, field8942, field8939);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field8963 >> 6;
        int var10 = field8962 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field8946 >> 6;
        int var12 = field8955 >> 6;
        if (var11 >= field8954[0].length) {
            var11 = field8954[0].length - 1;
        }
        if (var12 >= field8954[0][0].length) {
            var12 = field8954[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class29 var28 = field8954[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field8947 >> 6) + var14) * 64;
                        int var30 = ((field8950 >> 6) + var27) * 64;
                        for (class145 var31 = (class145) var28.method113((byte) 15); var31 != null; var31 = (class145) var28.method119(false)) {
                            int var32 = var31.field1874 + var29 - field8947 - field8963;
                            int var33 = var31.field1871 + var30 - field8950 - field8962;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field8958;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field8958;
                            int var36 = field8966 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field8966 - (arg2 * var33 + arg4 >> 16);
                            method3632(arg0, var34, var36, var35 - var34, var37 - var36, var31.field1870, var31.field1873 & 0xFF, var31.field1872, var31.field1875, var31.field1876, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class29 var17 = field8954[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field8947 >> 6) + var15) * 64;
                        int var19 = ((field8950 >> 6) + var16) * 64;
                        for (class145 var20 = (class145) var17.method113((byte) 15); var20 != null; var20 = (class145) var17.method119(false)) {
                            int var21 = var20.field1874 + var18 - field8947 - field8963;
                            int var22 = var20.field1871 + var19 - field8950 - field8962;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field8958;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field8958;
                            int var25 = field8966 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field8966 - (arg2 * var22 + arg4 >> 16);
                            method3631(arg0, var23, var25, var24 - var23, var26 - var25, var20.field1875, var20.field1876);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "()V", line = 715)
    public static final void method3616() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field8938.field1744; var1++) {
            boolean var2 = field8928.method1762(field8938.field1740[var1] >> 28 & 0x3, var0, -122, field8938.field1740[var1] & 0x3FFF, field8938.field1740[var1] >> 14 & 0x3FFF);
            if (var2) {
                class513 var3 = new class513(field8938.field1745[var1]);
                var3.field6945 = var0[1] - field8947;
                var3.field6939 = var0[2] - field8950;
                field8937.method725(var3, -20911);
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)Lgga;", line = 742)
    public static final class294 method3617(int arg0, int arg1) {
        for (class294 var2 = (class294) field8933.method2560(101); var2 != null; var2 = (class294) field8933.method2557(-1)) {
            if (var2.field3957 && var2.method1753(6, arg0, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ld;II)V", line = 757)
    public static final void method3618(class152 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field8930.field2124; var3++) {
            field8951[var3 + 1] = method3625(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lha;II)V", line = 767)
    public static final void method3619(class60 arg0, int arg1, int arg2) {
        class611 var3 = new class611(field8926.method2879(field8928.field3951, "area", -32734));
        int var4 = var3.method3428((byte) -109);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method3428((byte) 92);
        }
        int var7 = var3.method3428((byte) -113);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method3428((byte) -8);
        }
        while (true) {
            while (var3.field8520 < var3.field8529.length) {
                if (var3.method3428((byte) -111) == 0) {
                    int var22 = var3.method3428((byte) -115);
                    int var23 = var3.method3428((byte) 56);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field8947;
                            int var27 = var23 * 64 + var25 - field8950;
                            method3614(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method3428((byte) 126);
                    int var29 = var3.method3428((byte) -108);
                    int var30 = var3.method3428((byte) -4);
                    int var31 = var3.method3428((byte) -113);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field8947;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field8950;
                            method3614(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field8952 = new byte[field8961 * field8956];
            field8957 = new short[field8961 * field8956];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field8961 * field8956];
                for (int var13 = 0; var13 < field8954[var11].length; var13++) {
                    for (int var19 = 0; var19 < field8954[var11][0].length; var19++) {
                        class29 var20 = field8954[var11][var13][var19];
                        if (var20 != null) {
                            for (class145 var21 = (class145) var20.method113((byte) 15); var21 != null; var21 = (class145) var20.method119(false)) {
                                var12[(var19 * 64 + var21.field1871) * field8961 + var13 * 64 + var21.field1874] = (byte) var21.field1870;
                            }
                        }
                    }
                }
                method3624(var12, field8952, field8957, arg1, arg2);
                for (int var14 = 0; var14 < field8954[var11].length; var14++) {
                    for (int var15 = 0; var15 < field8954[var11][0].length; var15++) {
                        class29 var16 = field8954[var11][var14][var15];
                        if (var16 != null) {
                            for (class145 var17 = (class145) var16.method113((byte) 15); var17 != null; var17 = (class145) var16.method119(false)) {
                                int var18 = (var15 * 64 + var17.field1871) * field8961 + var14 * 64 + var17.field1874;
                                var17.field1870 = (field8952[var18] & 0xFF) << 16 | field8957[var18] & 0xFFFF;
                                if (var17.field1870 != 0) {
                                    var17.field1870 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method3624(field8953, field8952, field8957, arg1, arg2);
            field8953 = null;
            method3609();
            return;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)Lgga;", line = 945)
    public static final class294 method3620(int arg0) {
        return (class294) field8933.method2552((long) arg0, -1);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lha;Luca;IIII)V", line = 948)
    private static final void method3621(class60 arg0, class513 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field6938 = ((arg1.field6945 - field8963) * arg2 + arg4 >> 16) + field8958;
        arg1.field6943 = field8966 - ((arg1.field6939 - field8962) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIIII)V", line = 953)
    public static final void method3622(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8963 = arg0 - field8947;
        field8955 = arg1 - field8950;
        field8946 = arg2 - field8947;
        field8962 = arg3 - field8950;
        field8958 = arg4;
        field8949 = arg5;
        field8965 = arg6;
        field8966 = arg7;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lha;)V", line = 964)
    public static final void method3623(class60 arg0) {
        int var1 = field8946 - field8963;
        int var2 = field8955 - field8962;
        int var3 = (field8965 - field8958 << 16) / var1;
        int var4 = (field8966 - field8949 << 16) / var2;
        method3615(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([B[B[SII)V", line = 975)
    private static final void method3624(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field8956];
        int[] var6 = new int[field8956];
        int[] var7 = new int[field8956];
        int[] var8 = new int[field8956];
        int[] var9 = new int[field8956];
        for (int var10 = -5; var10 < field8961; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field8956; var13++) {
                int var10002;
                if (var11 < field8961) {
                    int var28 = arg0[field8961 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class548 var29 = field8927.method1520(var28 - 1, 125);
                        var5[var13] += var29.field7728;
                        var6[var13] += var29.field7733;
                        var7[var13] += var29.field7734;
                        var8[var13] += var29.field7731;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field8961 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class548 var31 = field8927.method1520(var30 - 1, 120);
                        var5[var13] -= var31.field7728;
                        var6[var13] -= var31.field7733;
                        var7[var13] -= var31.field7734;
                        var8[var13] -= var31.field7731;
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
                for (int var19 = -5; var19 < field8956; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field8956) {
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
                        if ((arg0[field8961 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field8961 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class262.method1570((byte) -11, var15 / var18, var14 * 256 / var17, var16 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field8961 * var19 + var10;
                            int var27 = class120.field1575[class151.method921(class124.method798(96, var25, -126), -118) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ld;III)I", line = 1120)
    private static final int method3625(class152 arg0, int arg1, int arg2, int arg3) {
        class301 var4 = field8930.method987(4, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field4081;
        if (var5 >= 0 && arg0.method925(var5, -28755).field4527) {
            var5 = -1;
        }
        int var9;
        if (var4.field4077 >= 0) {
            int var6 = var4.field4077;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class120.field1575[class151.method921(class580.method3244(96, var8, (byte) -21), 51) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class120.field1575[class151.method921(class580.method3244(96, arg0.method925(var5, -28755).field4535, (byte) -21), 92) & 0xFFFF] | 0xFF000000;
        } else if (var4.field4074 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field4074;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class120.field1575[class151.method921(class580.method3244(96, var12, (byte) -21), -41) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(Lha;IIII)Lkba;", line = 1180)
    private static final class108 method3626(class60 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class513 var5 = (class513) field8937.method724(32); var5 != null; var5 = (class513) field8937.method723(88)) {
            method3621(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field8937;
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "()V", line = 1190)
    public static void method3627() {
        field8930 = null;
        field8927 = null;
        field8934 = null;
        field8929 = null;
        field8931 = null;
        field8932 = null;
        field8928 = null;
        field8926 = null;
        field8933 = null;
        field8944 = null;
        field8942 = null;
        field8939 = null;
        field8938 = null;
        field8937 = null;
        field8951 = null;
        field8953 = null;
        field8952 = null;
        field8957 = null;
        field8959 = null;
        field8945 = null;
        field8948 = null;
        field8964 = null;
        field8960 = null;
        field8954 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lha;Luca;Lbq;)V", line = 1216)
    public static final void method3628(class60 arg0, class513 arg1, class292 arg2) {
        if (arg2.field3903 == null) {
            return;
        }
        int[] var3 = new int[arg2.field3903.length];
        for (int var4 = 0; var4 < var3.length / 2; var4++) {
            int var21 = arg2.field3903[var4 * 2] + arg1.field6945;
            int var22 = arg2.field3903[var4 * 2 + 1] + arg1.field6939;
            var3[var4 * 2] = (field8965 - field8958) * (var21 - field8963) / (field8946 - field8963) + field8958;
            var3[var4 * 2 + 1] = field8966 - (field8966 - field8949) * (var22 - field8962) / (field8955 - field8962);
        }
        class228.method1356(arg0, var3, arg2.field3884);
        if (arg2.field3885 > 0) {
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
                arg0.method437(var13, var14, var15, var16, arg2.field3867[arg2.field3862[var5] & 0xFF], 1, arg2.field3885, arg2.field3889, arg2.field3857);
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
            arg0.method437(var6, var7, var8, var9, arg2.field3867[arg2.field3862[arg2.field3862.length - 1] & 0xFF], 1, arg2.field3885, arg2.field3889, arg2.field3857);
            return;
        }
        for (int var20 = 0; var20 < var3.length / 2 - 1; var20++) {
            arg0.method405(var3[var20 * 2 + 1], arg2.field3867[arg2.field3862[var20] & 0xFF], var3[(var20 + 1) * 2 + 1], var3[(var20 + 1) * 2], -10550, var3[var20 * 2]);
        }
        arg0.method405(var3[var3.length - 1], arg2.field3867[arg2.field3862[arg2.field3862.length - 1] & 0xFF], var3[1], var3[0], -10550, var3[var3.length - 2]);
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(Lha;)Lkba;", line = 1325)
    public static final class108 method3629(class60 arg0) {
        int var1 = field8946 - field8963;
        int var2 = field8955 - field8962;
        int var3 = (field8965 - field8958 << 16) / var1;
        int var4 = (field8966 - field8949 << 16) / var2;
        return method3626(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V", line = 1335)
    public static final void method3630(int arg0) {
        field8928 = (class294) field8933.method2552((long) arg0, -1);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lha;IIII[S[B)V", line = 1338)
    private static final void method3631(class60 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class685 var8 = field8934.method4109(arg5[var7] & 0xFFFF, (byte) 119);
            int var9 = var8.field9602;
            if (var9 != -1) {
                class23 var10 = field8931.method1365(var9, (byte) -28);
                class680 var11 = var10.method89(var8.field9586 ? var8.field9569 : false, 0, var8.field9617 ? arg6[var7] >> 6 & 0x3 : 0, arg0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method666() >> 2;
                    int var13 = arg4 * var11.method663() >> 2;
                    if (var10.field174) {
                        int var14 = var8.field9603;
                        int var15 = var8.field9588;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field173 == 0) {
                            var11.method3855(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method3856(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field173 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lha;IIIIIII[S[BZ)V", line = 1397)
    private static final void method3632(class60 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method447(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field8951[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method447(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class662.method3747(arg7 >> 6 & 0x3, arg5, field8941, arg1, arg4, var11, field8951[arg6], arg0, arg2, arg3, field8944, var12, 10);
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
                class685 var18 = field8934.method4109(arg8[var16] & 0xFFFF, (byte) 119);
                if (var18.field9602 == -1) {
                    int var19 = -3355444;
                    if (var18.field9610 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method386(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method347(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method386(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method347(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method386(arg1, arg2, arg4, -1, 0);
                            arg0.method347(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method386(var14, arg2, arg4, -1, 0);
                            arg0.method347(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method386(var14, arg2, arg4, -1, 0);
                            arg0.method347(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method386(arg1, arg2, arg4, -1, 0);
                            arg0.method347(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method347(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method347(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method347(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method347(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method347(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method347(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }
}
