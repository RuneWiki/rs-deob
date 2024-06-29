import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 {

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Ldj;")
    private static class362 field144 = new class362(16);

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "[B")
    private static byte[] field148 = new byte[1];

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public static int field152 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "[S")
    private static short[] field151 = new short[1];

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public static int field155 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "Lifa;")
    public static class450 field156 = new class450();

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "F")
    public static float field149;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "F")
    public static float field154;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!ff", name = "E", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "Lmc;")
    public static class146 field150;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "Lib;")
    private static class165 field145;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "Lbj;")
    public static class257 field140;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "Lgf;")
    public static class293 field141;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "Ldj;")
    private static class362 field158;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "Lbh;")
    public static class40 field146;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "Lbt;")
    public static class48 field142;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "Llk;")
    private static class614 field147;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Ldd;")
    public static class733 field143;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "Ldr;")
    public static class750 field139;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "[B")
    private static byte[] field159;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "[B")
    private static byte[] field160;

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "[B")
    private static byte[] field168;

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "[B")
    private static byte[] field172;

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "[B")
    private static byte[] field174;

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "[I")
    private static int[] field173;

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "[S")
    private static short[] field167;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "[S")
    private static short[] field175;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "[[[B")
    public static byte[][][] field157;

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "[[[Lml;")
    private static class408[][][] field161;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lha;II)V")
    public static final void method146(class66 arg0, int arg1, int arg2) {
        class403 var3 = new class403(field142.method436(field140.field3042, -3637, "area"));
        int var4 = var3.method2396((byte) 39);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method2396((byte) 83);
        }
        int var7 = var3.method2396((byte) 86);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method2396((byte) 97);
        }
        while (true) {
            while (var3.field5262 < var3.field5275.length) {
                if (var3.method2396((byte) -92) == 0) {
                    int var22 = var3.method2396((byte) -121);
                    int var23 = var3.method2396((byte) -79);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field176;
                            int var27 = var23 * 64 + var25 - field178;
                            method149(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method2396((byte) 118);
                    int var29 = var3.method2396((byte) -124);
                    int var30 = var3.method2396((byte) 117);
                    int var31 = var3.method2396((byte) -125);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field176;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field178;
                            method149(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field172 = new byte[field179 * field166];
            field167 = new short[field179 * field166];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field179 * field166];
                for (int var13 = 0; var13 < field161[var11].length; var13++) {
                    for (int var19 = 0; var19 < field161[var11][0].length; var19++) {
                        class408 var20 = field161[var11][var13][var19];
                        if (var20 != null) {
                            for (class474 var21 = (class474) var20.method2447(-114); var21 != null; var21 = (class474) var20.method2439(-123)) {
                                var12[(var19 * 64 + var21.field6604) * field166 + var13 * 64 + var21.field6606] = (byte) var21.field6605;
                            }
                        }
                    }
                }
                method163(var12, field172, field167, arg1, arg2);
                for (int var14 = 0; var14 < field161[var11].length; var14++) {
                    for (int var15 = 0; var15 < field161[var11][0].length; var15++) {
                        class408 var16 = field161[var11][var14][var15];
                        if (var16 != null) {
                            for (class474 var17 = (class474) var16.method2447(-103); var17 != null; var17 = (class474) var16.method2439(-102)) {
                                int var18 = (var15 * 64 + var17.field6604) * field166 + var14 * 64 + var17.field6606;
                                var17.field6605 = (field172[var18] & 0xFF) << 16 | field167[var18] & 0xFFFF;
                                if (var17.field6605 != 0) {
                                    var17.field6605 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method163(field160, field172, field167, arg1, arg2);
            field160 = null;
            method168();
            return;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "()V")
    public static final void method147() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field150.field1827; var1++) {
            boolean var2 = field140.method1545(field150.field1828[var1] >> 14 & 0x3FFF, field150.field1828[var1] & 0x3FFF, -108, field150.field1828[var1] >> 28 & 0x3, var0);
            if (var2) {
                class625 var3 = new class625(field150.field1830[var1]);
                var3.field8574 = var0[1] - field176;
                var3.field8572 = var0[2] - field178;
                field156.method2732(var3, 21939);
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ld;III)I")
    private static final int method148(class162 arg0, int arg1, int arg2, int arg3) {
        class63 var4 = field147.method3479((byte) 81, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field856;
        if (var5 >= 0 && arg0.method1138(var5, 127).field4464) {
            var5 = -1;
        }
        int var9;
        if (var4.field853 >= 0) {
            int var6 = var4.field853;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class12.field211[class319.method1899(class495.method2915(96, 12345678, var8), (byte) 112) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class12.field211[class319.method1899(class495.method2915(96, 12345678, arg0.method1138(var5, 109).field4448), (byte) 115) & 0xFFFF] | 0xFF000000;
        } else if (var4.field857 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field857;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class12.field211[class319.method1899(class495.method2915(96, 12345678, var12), (byte) 94) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lha;Les;IIII[I[I)V")
    private static final void method149(class66 arg0, class403 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method2396((byte) -105);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method2396((byte) 108);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field160[field166 * arg5 + arg4] = (byte) var11;
                    field174[field166 * arg5 + arg4] = 0;
                } else {
                    field174[field166 * arg5 + arg4] = (byte) var11;
                    field159[field166 * arg5 + arg4] = 0;
                    field160[field166 * arg5 + arg4] = arg1.method2392(119);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method2396((byte) 62);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method2396((byte) 58);
                var18 = arg1.method2396((byte) -112);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method2396((byte) -99);
            }
            if (var15 == 0) {
                field160[field166 * arg5 + arg4] = (byte) var16;
                field174[field166 * arg5 + arg4] = (byte) var17;
                field159[field166 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field175[field166 * arg5 + arg4] = (short) (arg1.method2390((byte) -125) + 1);
                    field168[field166 * arg5 + arg4] = arg1.method2392(-67);
                } else if (var19 > 1) {
                    field175[field166 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method2390((byte) 56);
                        var21[var22] = arg1.method2392(118);
                    }
                    field158.method2112(new class791(var20, var21), (byte) 6, (long) (arg4 << 16 | arg5));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method2390((byte) 18);
                        var24[var25] = arg1.method2392(8);
                    }
                }
                if (field161[var15 - 1][arg2 - (field176 >> 6)][arg3 - (field178 >> 6)] == null) {
                    field161[var15 - 1][arg2 - (field176 >> 6)][arg3 - (field178 >> 6)] = new class408();
                }
                class474 var26 = new class474(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field161[var15 - 1][arg2 - (field176 >> 6)][arg3 - (field178 >> 6)].method2444(11586, var26);
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)Lut;")
    public static final class136 method150(int arg0, int arg1) {
        class136 var2 = new class136();
        for (class257 var3 = (class257) field144.method2119(-55); var3 != null; var3 = (class257) field144.method2111((byte) -128)) {
            if (var3.field3041 && var3.method1544(arg1, 0, arg0)) {
                var2.method1005(-53, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field177 = arg0 - field176;
        field169 = arg1 - field178;
        field170 = arg2 - field176;
        field162 = arg3 - field178;
        field163 = arg4;
        field164 = arg5;
        field165 = arg6;
        field171 = arg7;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "()V")
    public static void method152() {
        field147 = null;
        field145 = null;
        field139 = null;
        field143 = null;
        field141 = null;
        field146 = null;
        field140 = null;
        field142 = null;
        field144 = null;
        field157 = null;
        field151 = null;
        field148 = null;
        field150 = null;
        field156 = null;
        field173 = null;
        field160 = null;
        field172 = null;
        field167 = null;
        field174 = null;
        field159 = null;
        field175 = null;
        field168 = null;
        field158 = null;
        field161 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)Lbj;")
    public static final class257 method153(int arg0) {
        return (class257) field144.method2121(62, (long) arg0);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lha;)Lifa;")
    public static final class450 method154(class66 arg0) {
        int var1 = field170 - field177;
        int var2 = field169 - field162;
        int var3 = (field165 - field163 << 16) / var1;
        int var4 = (field171 - field164 << 16) / var2;
        return method161(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "()V")
    public static final void method155() {
        field160 = null;
        field172 = null;
        field167 = null;
        field174 = null;
        field159 = null;
        field175 = null;
        field168 = null;
        field158 = null;
        field161 = null;
        field173 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lha;IIIIIII[S[BZ)V")
    private static final void method156(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method645(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field173[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method645(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class607.method3448(arg0, var12, arg7 >> 6 & 0x3, field173[arg6], field153, (byte) 75, arg3, arg1, field157, var11, arg2, arg4, arg5);
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
                class174 var18 = field139.method4192(27324, arg8[var16] & 0xFFFF);
                if (var18.field2120 == -1) {
                    int var19 = -3355444;
                    if (var18.field2171 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method597(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method593(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method597(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method593(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method597(arg1, arg2, arg4, -1, 0);
                            arg0.method593(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method597(var14, arg2, arg4, -1, 0);
                            arg0.method593(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method597(var14, arg2, arg4, -1, 0);
                            arg0.method593(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method597(arg1, arg2, arg4, -1, 0);
                            arg0.method593(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method593(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method593(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method593(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method593(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method593(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method593(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "()V")
    public static final void method157() {
        field160 = new byte[field179 * field166];
        field174 = new byte[field179 * field166];
        field159 = new byte[field179 * field166];
        field175 = new short[field179 * field166];
        field168 = new byte[field179 * field166];
        field158 = new class362(1024);
        field161 = new class408[3][field166 >> 6][field179 >> 6];
        field173 = new int[field147.field8252 + 1];
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lha;Lke;IIII)V")
    private static final void method158(class66 arg0, class625 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field8576 = ((arg1.field8574 - field177) * arg2 + arg4 >> 16) + field163;
        arg1.field8569 = field171 - ((arg1.field8572 - field162) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lha;Lke;Loaa;)V")
    public static final void method159(class66 arg0, class625 arg1, class305 arg2) {
        if (arg2.field3644 == null) {
            return;
        }
        int[] var3 = new int[arg2.field3644.length];
        for (int var4 = 0; var4 < var3.length / 2; var4++) {
            int var21 = arg2.field3644[var4 * 2] + arg1.field8574;
            int var22 = arg2.field3644[var4 * 2 + 1] + arg1.field8572;
            var3[var4 * 2] = (var21 - field177) * (field165 - field163) / (field170 - field177) + field163;
            var3[var4 * 2 + 1] = field171 - (field171 - field164) * (var22 - field162) / (field169 - field162);
        }
        class160.method1119(arg0, var3, arg2.field3630);
        if (arg2.field3655 > 0) {
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
                arg0.method613(var13, var14, var15, var16, arg2.field3642[arg2.field3670[var5] & 0xFF], 1, arg2.field3655, arg2.field3633, arg2.field3669);
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
            arg0.method613(var6, var7, var8, var9, arg2.field3642[arg2.field3670[arg2.field3670.length - 1] & 0xFF], 1, arg2.field3655, arg2.field3633, arg2.field3669);
            return;
        }
        for (int var20 = 0; var20 < var3.length / 2 - 1; var20++) {
            arg0.method631(var3[var20 * 2 + 1], var3[(var20 + 1) * 2], -9665, var3[(var20 + 1) * 2 + 1], var3[var20 * 2], arg2.field3642[arg2.field3670[var20] & 0xFF]);
        }
        arg0.method631(var3[var3.length - 1], var3[0], -9665, var3[1], var3[var3.length - 2], arg2.field3642[arg2.field3670[arg2.field3670.length - 1] & 0xFF]);
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
    public static final void method160(int arg0) {
        field140 = (class257) field144.method2121(62, (long) arg0);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lha;IIII)Lifa;")
    private static final class450 method161(class66 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class625 var5 = (class625) field156.method2725(37); var5 != null; var5 = (class625) field156.method2726(-117)) {
            method158(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field156;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ld;II)V")
    public static final void method162(class162 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field147.field8252; var3++) {
            field173[var3 + 1] = method148(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([B[B[SII)V")
    private static final void method163(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field179];
        int[] var6 = new int[field179];
        int[] var7 = new int[field179];
        int[] var8 = new int[field179];
        int[] var9 = new int[field179];
        for (int var10 = -5; var10 < field166; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field179; var13++) {
                int var10002;
                if (var11 < field166) {
                    int var28 = arg0[field166 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class333 var29 = field145.method1152(var28 - 1, (byte) 112);
                        var5[var13] += var29.field4114;
                        var6[var13] += var29.field4126;
                        var7[var13] += var29.field4113;
                        var8[var13] += var29.field4123;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field166 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class333 var31 = field145.method1152(var30 - 1, (byte) 71);
                        var5[var13] -= var31.field4114;
                        var6[var13] -= var31.field4126;
                        var7[var13] -= var31.field4113;
                        var8[var13] -= var31.field4123;
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
                for (int var19 = -5; var19 < field179; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field179) {
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
                        if ((arg0[field166 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field166 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class514.method3081(var14 * 256 / var17, var16 / var18, var15 / var18, 8425);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field166 * var19 + var10;
                            int var27 = class12.field211[class319.method1899(class274.method1604(96, var25, 103), (byte) 85) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lbt;Llk;Lib;Ldr;Ldd;Lgf;Lbh;)V")
    public static final void method164(class48 arg0, class614 arg1, class165 arg2, class750 arg3, class733 arg4, class293 arg5, class40 arg6) {
        field142 = arg0;
        field147 = arg1;
        field145 = arg2;
        field139 = arg3;
        field143 = arg4;
        field141 = arg5;
        field146 = arg6;
        field144.method2115(0);
        int var7 = field142.method450((byte) 127, "details");
        int[] var8 = field142.method441(var7, -49);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class257 var10 = class413.method2463(var7, var8[var9], (byte) -7, field142);
                field144.method2112(var10, (byte) 6, (long) var10.field3044);
            }
        }
        class322.method1922(true, (byte) 82, false);
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(Lha;)V")
    public static final void method165(class66 arg0) {
        int var1 = field170 - field177;
        int var2 = field169 - field162;
        int var3 = (field165 - field163 << 16) / var1;
        int var4 = (field171 - field164 << 16) / var2;
        method169(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lha;IIII[S[B)V")
    private static final void method166(class66 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class174 var8 = field139.method4192(27324, arg5[var7] & 0xFFFF);
            int var9 = var8.field2120;
            if (var9 != -1) {
                class752 var10 = field141.method1705(27058, var9);
                class312 var11 = var10.method4204(arg0, var8.field2123 ? var8.field2172 : false, var8.field2111 ? arg6[var7] >> 6 & 0x3 : 0, 0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method1634() >> 2;
                    int var13 = arg4 * var11.method1636() >> 2;
                    if (var10.field10433) {
                        int var14 = var8.field2125;
                        int var15 = var8.field2147;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field10436 == 0) {
                            var11.method1837(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method1843(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field10436 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)Lbj;")
    public static final class257 method167(int arg0, int arg1) {
        for (class257 var2 = (class257) field144.method2119(-81); var2 != null; var2 = (class257) field144.method2111((byte) -113)) {
            if (var2.field3041 && var2.method1544(arg1, 0, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "()V")
    private static final void method168() {
        for (int var0 = 0; var0 < field166; var0++) {
            for (int var11 = 0; var11 < field179; var11++) {
                int var12 = field175[field166 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class791 var13 = (class791) field158.method2121(61, (long) (var0 << 16 | var11));
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field10886.length; var14++) {
                                class174 var15 = field139.method4192(27324, var13.field10886[var14] & 0xFFFF);
                                int var16 = var15.field2118;
                                if (var15.field2157 != null) {
                                    class174 var17 = var15.method1178(false, field146);
                                    if (var17 != null) {
                                        var16 = var17.field2118;
                                    }
                                }
                                if (var16 != -1) {
                                    class625 var18 = new class625(var16);
                                    var18.field8574 = var0;
                                    var18.field8572 = var11;
                                    field156.method2732(var18, 21939);
                                }
                            }
                        }
                    } else {
                        class174 var19 = field139.method4192(27324, var12 - 1);
                        int var20 = var19.field2118;
                        if (var19.field2157 != null) {
                            class174 var21 = var19.method1178(false, field146);
                            if (var21 != null) {
                                var20 = var21.field2118;
                            }
                        }
                        if (var20 != -1) {
                            class625 var22 = new class625(var20);
                            var22.field8574 = var0;
                            var22.field8572 = var11;
                            field156.method2732(var22, 21939);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field161[0].length; var2++) {
                for (int var3 = 0; var3 < field161[0][0].length; var3++) {
                    class408 var4 = field161[var1][var2][var3];
                    if (var4 != null) {
                        for (class474 var5 = (class474) var4.method2447(-93); var5 != null; var5 = (class474) var4.method2439(-108)) {
                            if (var5.field6600 != null) {
                                for (int var6 = 0; var6 < var5.field6600.length; var6++) {
                                    class174 var7 = field139.method4192(27324, var5.field6600[var6] & 0xFFFF);
                                    int var8 = var7.field2118;
                                    if (var7.field2157 != null) {
                                        class174 var9 = var7.method1178(false, field146);
                                        if (var9 != null) {
                                            var8 = var9.field2118;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class625 var10 = new class625(var8);
                                        var10.field8574 = ((field176 >> 6) + var2) * 64 + var5.field6606 - field176;
                                        var10.field8572 = ((field178 >> 6) + var3) * 64 + var5.field6604 - field178;
                                        field156.method2732(var10, 21939);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(Lha;IIII)V")
    private static final void method169(class66 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field170 - field177;
        int var6 = field169 - field162;
        if (field170 < field166) {
            var5++;
        }
        if (field169 < field179) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field163;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field163;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field177 + var7;
                if (var52 >= 0 && var52 < field166) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field171 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field171 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field162 + var53;
                            int var58 = field166 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field179) {
                                var59 = (field172[var58] & 0xFF) << 16 | field167[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field174[var58] & 0xFF;
                                var61 = field175[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field140.field3038 != -1) {
                                    var62 = field140.field3038 | 0xFF000000;
                                } else if ((field177 + var7 & 0x4) == (field169 + var53 & 0x4)) {
                                    var62 = field173[field147.field8256 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method645(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method156(arg0, var49, var54, var51, var56, var59, var60, field159[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class791 var63 = (class791) field158.method2121(92, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method156(arg0, var49, var54, var51, var56, var59, var60, field159[var58], var63.field10886, var63.field10885, true);
                                }
                            } else {
                                field151[0] = (short) (var61 - 1);
                                field148[0] = field168[var58];
                                method156(arg0, var49, var54, var51, var56, var59, var60, field159[var58], field151, field148, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field171 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field171 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field140.field3038 != -1) {
                            var68 = field140.field3038 | 0xFF000000;
                        } else if ((field177 + var7 & 0x4) == (field169 + var64 & 0x4)) {
                            var68 = field173[field147.field8256 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method645(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field163;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field163;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field177 + var8;
                if (var41 >= 0 && var41 < field166) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field171 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field171 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field162 + var42;
                            if (var46 >= 0 && var46 < field179) {
                                int var47 = field175[field166 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method166(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class791 var48 = (class791) field158.method2121(68, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method166(arg0, var38, var43, var40, var45, var48.field10886, var48.field10885);
                                    }
                                } else {
                                    field151[0] = (short) (var47 - 1);
                                    field148[0] = field168[field166 * var46 + var41];
                                    method166(arg0, var38, var43, var40, var45, field151, field148);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field177 >> 6;
        int var10 = field162 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field170 >> 6;
        int var12 = field169 >> 6;
        if (var11 >= field161[0].length) {
            var11 = field161[0].length - 1;
        }
        if (var12 >= field161[0][0].length) {
            var12 = field161[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class408 var28 = field161[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field176 >> 6) + var14) * 64;
                        int var30 = ((field178 >> 6) + var27) * 64;
                        for (class474 var31 = (class474) var28.method2447(-85); var31 != null; var31 = (class474) var28.method2439(-95)) {
                            int var32 = var31.field6606 + var29 - field176 - field177;
                            int var33 = var31.field6604 + var30 - field178 - field162;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field163;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field163;
                            int var36 = field171 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field171 - (arg2 * var33 + arg4 >> 16);
                            method156(arg0, var34, var36, var35 - var34, var37 - var36, var31.field6605, var31.field6603 & 0xFF, var31.field6601, var31.field6600, var31.field6602, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class408 var17 = field161[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field176 >> 6) + var15) * 64;
                        int var19 = ((field178 >> 6) + var16) * 64;
                        for (class474 var20 = (class474) var17.method2447(-100); var20 != null; var20 = (class474) var17.method2439(-92)) {
                            int var21 = var20.field6606 + var18 - field176 - field177;
                            int var22 = var20.field6604 + var19 - field178 - field162;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field163;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field163;
                            int var25 = field171 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field171 - (arg2 * var22 + arg4 >> 16);
                            method166(arg0, var23, var25, var24 - var23, var26 - var25, var20.field6600, var20.field6602);
                        }
                    }
                }
            }
        }
    }
}
