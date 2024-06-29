import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class770 {

    @OriginalMember(owner = "client!ql", name = "O", descriptor = "[Ljava/lang/String;")
    private static final String[] field11291 = new String[] { method5563(method5562("Z.\"\u0012\u0014R8")), method5563(method5562("_93\u0012")) };

    @OriginalMember(owner = "client!ql", name = "P", descriptor = "Lqr;")
    private static class69 field11251 = new class69(16);

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "I")
    public static int field11261 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "[S")
    private static short[] field11266 = new short[1];

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "[B")
    private static byte[] field11262 = new byte[1];

    @OriginalMember(owner = "client!ql", name = "M", descriptor = "I")
    public static int field11263 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "Lat;")
    public static class398 field11260 = new class398();

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "F")
    public static float field11259;

    @OriginalMember(owner = "client!ql", name = "L", descriptor = "F")
    public static float field11265;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public static int field11268;

    @OriginalMember(owner = "client!ql", name = "J", descriptor = "I")
    public static int field11270;

    @OriginalMember(owner = "client!ql", name = "E", descriptor = "I")
    public static int field11271;

    @OriginalMember(owner = "client!ql", name = "I", descriptor = "I")
    public static int field11272;

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "I")
    public static int field11273;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "I")
    public static int field11274;

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "I")
    public static int field11276;

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "I")
    public static int field11283;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public static int field11284;

    @OriginalMember(owner = "client!ql", name = "y", descriptor = "I")
    public static int field11285;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public static int field11286;

    @OriginalMember(owner = "client!ql", name = "B", descriptor = "I")
    public static int field11287;

    @OriginalMember(owner = "client!ql", name = "C", descriptor = "I")
    public static int field11288;

    @OriginalMember(owner = "client!ql", name = "G", descriptor = "Lada;")
    public static class171 field11252;

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "Lsda;")
    public static class269 field11257;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "Lpja;")
    public static class40 field11258;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "Leka;")
    public static class492 field11254;

    @OriginalMember(owner = "client!ql", name = "H", descriptor = "Lmq;")
    public static class536 field11255;

    @OriginalMember(owner = "client!ql", name = "N", descriptor = "Lgda;")
    public static class58 field11256;

    @OriginalMember(owner = "client!ql", name = "A", descriptor = "Lwm;")
    public static class591 field11267;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "Lqr;")
    private static class69 field11278;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "Lhg;")
    private static class722 field11250;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "Lgv;")
    private static class87 field11253;

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "[B")
    private static byte[] field11269;

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "[B")
    private static byte[] field11275;

    @OriginalMember(owner = "client!ql", name = "K", descriptor = "[B")
    private static byte[] field11279;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "[B")
    private static byte[] field11282;

    @OriginalMember(owner = "client!ql", name = "D", descriptor = "[B")
    private static byte[] field11289;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "[I")
    private static int[] field11280;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "[S")
    private static short[] field11277;

    @OriginalMember(owner = "client!ql", name = "F", descriptor = "[S")
    private static short[] field11281;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "[[[B")
    public static byte[][][] field11264;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "[[[Lwc;")
    private static class71[][][] field11290;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "()V")
    public static final void method5538() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field11267.field8571; var1++) {
            boolean var2 = field11258.method381(-1, field11267.field8570[var1] >> 14 & 0x3FFF, field11267.field8570[var1] >> 28 & 0x3, field11267.field8570[var1] & 0x3FFF, var0);
            if (var2) {
                class420 var3 = new class420(field11267.field8568[var1]);
                var3.field6631 = var0[1] - field11276;
                var3.field6630 = var0[2] - field11270;
                field11260.method3220(var3, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(Lha;IIII)Lat;")
    private static final class398 method5539(class63 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class420 var5 = (class420) field11260.method3228(11); var5 != null; var5 = (class420) field11260.method3216(true)) {
            method5558(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field11260;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)Lwca;")
    public static final class708 method5540(int arg0, int arg1) {
        class708 var2 = new class708();
        for (class40 var3 = (class40) field11251.method735(0); var3 != null; var3 = (class40) field11251.method734((byte) -50)) {
            if (var3.field459 && var3.method379(arg1, arg0, -104)) {
                var2.method5142(var3, (byte) -63);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "([B[B[SII)V")
    private static final void method5541(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field11272];
        int[] var6 = new int[field11272];
        int[] var7 = new int[field11272];
        int[] var8 = new int[field11272];
        int[] var9 = new int[field11272];
        for (int var10 = -5; var10 < field11284; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field11272; var13++) {
                int var10002;
                if (var11 < field11284) {
                    int var28 = arg0[field11284 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class447 var29 = field11250.method5246((byte) 119, var28 - 1);
                        var5[var13] += var29.field6947;
                        var6[var13] += var29.field6939;
                        var7[var13] += var29.field6949;
                        var8[var13] += var29.field6936;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field11284 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class447 var31 = field11250.method5246((byte) 108, var30 - 1);
                        var5[var13] -= var31.field6947;
                        var6[var13] -= var31.field6939;
                        var7[var13] -= var31.field6949;
                        var8[var13] -= var31.field6936;
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
                for (int var19 = -5; var19 < field11272; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field11272) {
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
                        if ((arg0[field11284 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field11284 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class559.method4119(var14 * 256 / var17, var15 / var18, 1, var16 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field11284 * var19 + var10;
                            int var27 = class200.field3161[class545.method4049(class347.method2904(96, var25, (byte) 101), 83) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lha;)V")
    public static final void method5542(class63 arg0) {
        int var1 = field11286 - field11271;
        int var2 = field11285 - field11283;
        int var3 = (field11274 - field11273 << 16) / var1;
        int var4 = (field11288 - field11287 << 16) / var2;
        method5553(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "()V")
    public static void method5543() {
        field11253 = null;
        field11250 = null;
        field11255 = null;
        field11257 = null;
        field11254 = null;
        field11252 = null;
        field11258 = null;
        field11256 = null;
        field11251 = null;
        field11264 = null;
        field11266 = null;
        field11262 = null;
        field11267 = null;
        field11260 = null;
        field11280 = null;
        field11275 = null;
        field11282 = null;
        field11281 = null;
        field11269 = null;
        field11289 = null;
        field11277 = null;
        field11279 = null;
        field11278 = null;
        field11290 = null;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(Lha;)Lat;")
    public static final class398 method5544(class63 arg0) {
        int var1 = field11286 - field11271;
        int var2 = field11285 - field11283;
        int var3 = (field11274 - field11273 << 16) / var1;
        int var4 = (field11288 - field11287 << 16) / var2;
        return method5539(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ld;II)V")
    public static final void method5545(class158 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field11253.field1290; var3++) {
            field11280[var3 + 1] = method5547(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "()V")
    public static final void method5546() {
        field11275 = new byte[field11284 * field11272];
        field11269 = new byte[field11284 * field11272];
        field11289 = new byte[field11284 * field11272];
        field11277 = new short[field11284 * field11272];
        field11279 = new byte[field11284 * field11272];
        field11278 = new class69(1024);
        field11290 = new class71[3][field11284 >> 6][field11272 >> 6];
        field11280 = new int[field11253.field1290 + 1];
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ld;III)I")
    private static final int method5547(class158 arg0, int arg1, int arg2, int arg3) {
        class466 var4 = field11253.method865(arg1, true);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field7160;
        if (var5 >= 0 && arg0.method1419(var5, -87).field4890) {
            var5 = -1;
        }
        int var9;
        if (var4.field7161 >= 0) {
            int var6 = var4.field7161;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class200.field3161[class545.method4049(class525.method3923(96, var8, (byte) -124), 84) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class200.field3161[class545.method4049(class525.method3923(96, arg0.method1419(var5, -97).field4894, (byte) -124), 122) & 0xFFFF] | 0xFF000000;
        } else if (var4.field7143 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field7143;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class200.field3161[class545.method4049(class525.method3923(96, var12, (byte) -125), 102) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "()V")
    private static final void method5548() {
        for (int var0 = 0; var0 < field11284; var0++) {
            for (int var11 = 0; var11 < field11272; var11++) {
                int var12 = field11277[field11284 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class364 var13 = (class364) field11278.method737((byte) -39, (long) (var0 << 16 | var11));
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field5942.length; var14++) {
                                class362 var15 = field11255.method4002(125, var13.field5942[var14] & 0xFFFF);
                                int var16 = var15.field5864;
                                if (var15.field5873 != null) {
                                    class362 var17 = var15.method2997(-90, field11252);
                                    if (var17 != null) {
                                        var16 = var17.field5864;
                                    }
                                }
                                if (var16 != -1) {
                                    class420 var18 = new class420(var16);
                                    var18.field6631 = var0;
                                    var18.field6630 = var11;
                                    field11260.method3220(var18, 0);
                                }
                            }
                        }
                    } else {
                        class362 var19 = field11255.method4002(-17, var12 - 1);
                        int var20 = var19.field5864;
                        if (var19.field5873 != null) {
                            class362 var21 = var19.method2997(-59, field11252);
                            if (var21 != null) {
                                var20 = var21.field5864;
                            }
                        }
                        if (var20 != -1) {
                            class420 var22 = new class420(var20);
                            var22.field6631 = var0;
                            var22.field6630 = var11;
                            field11260.method3220(var22, 0);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field11290[0].length; var2++) {
                for (int var3 = 0; var3 < field11290[0][0].length; var3++) {
                    class71 var4 = field11290[var1][var2][var3];
                    if (var4 != null) {
                        for (class474 var5 = (class474) var4.method749(0); var5 != null; var5 = (class474) var4.method747((byte) 21)) {
                            if (var5.field7231 != null) {
                                for (int var6 = 0; var6 < var5.field7231.length; var6++) {
                                    class362 var7 = field11255.method4002(126, var5.field7231[var6] & 0xFFFF);
                                    int var8 = var7.field5864;
                                    if (var7.field5873 != null) {
                                        class362 var9 = var7.method2997(-104, field11252);
                                        if (var9 != null) {
                                            var8 = var9.field5864;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class420 var10 = new class420(var8);
                                        var10.field6631 = ((field11276 >> 6) + var2) * 64 + var5.field7229 - field11276;
                                        var10.field6630 = ((field11270 >> 6) + var3) * 64 + var5.field7232 - field11270;
                                        field11260.method3220(var10, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V")
    public static final void method5549(int arg0) {
        field11258 = (class40) field11251.method737((byte) -39, (long) arg0);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lha;Lsg;Lrfa;)V")
    public static final void method5550(class63 arg0, class420 arg1, class209 arg2) {
        if (arg2.field3276 == null) {
            return;
        }
        int[] var3 = new int[arg2.field3276.length];
        for (int var4 = 0; var4 < var3.length / 2; var4++) {
            int var21 = arg2.field3276[var4 * 2] + arg1.field6631;
            int var22 = arg2.field3276[var4 * 2 + 1] + arg1.field6630;
            var3[var4 * 2] = (field11274 - field11273) * (var21 - field11271) / (field11286 - field11271) + field11273;
            var3[var4 * 2 + 1] = field11288 - (field11288 - field11287) * (var22 - field11283) / (field11285 - field11283);
        }
        class733.method5323(arg0, var3, arg2.field3298);
        if (arg2.field3291 > 0) {
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
                arg0.method197(var13, var14, var15, var16, arg2.field3283[arg2.field3294[var5] & 0xFF], 1, arg2.field3291, arg2.field3287, arg2.field3281);
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
            arg0.method197(var6, var7, var8, var9, arg2.field3283[arg2.field3294[arg2.field3294.length - 1] & 0xFF], 1, arg2.field3291, arg2.field3287, arg2.field3281);
            return;
        }
        for (int var20 = 0; var20 < var3.length / 2 - 1; var20++) {
            arg0.method657(var3[var20 * 2], var3[(var20 + 1) * 2], var3[(var20 + 1) * 2 + 1], arg2.field3283[arg2.field3294[var20] & 0xFF], 1, var3[var20 * 2 + 1]);
        }
        arg0.method657(var3[var3.length - 2], var3[0], var3[1], arg2.field3283[arg2.field3294[arg2.field3294.length - 1] & 0xFF], 1, var3[var3.length - 1]);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lha;IIII[S[B)V")
    private static final void method5551(class63 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class362 var8 = field11255.method4002(113, arg5[var7] & 0xFFFF);
            int var9 = var8.field5907;
            if (var9 != -1) {
                class57 var10 = field11254.method3724(var9, (byte) -75);
                class107 var11 = var10.method569(var8.field5892 ? arg6[var7] >> 6 & 0x3 : 0, var8.field5887 ? var8.field5859 : false, arg0, -123);
                if (var11 != null) {
                    int var12 = arg3 * var11.method26() >> 2;
                    int var13 = arg4 * var11.method12() >> 2;
                    if (var10.field709) {
                        int var14 = var8.field5842;
                        int var15 = var8.field5894;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field702 == 0) {
                            var11.method994(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method999(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field702 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)Lpja;")
    public static final class40 method5552(int arg0) {
        return (class40) field11251.method737((byte) -39, (long) arg0);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lha;IIII)V")
    private static final void method5553(class63 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field11286 - field11271;
        int var6 = field11285 - field11283;
        if (field11286 < field11284) {
            var5++;
        }
        if (field11285 < field11272) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field11273;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field11273;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field11271 + var7;
                if (var52 >= 0 && var52 < field11284) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field11288 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field11288 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field11283 + var53;
                            int var58 = field11284 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field11272) {
                                var59 = (field11282[var58] & 0xFF) << 16 | field11281[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field11269[var58] & 0xFF;
                                var61 = field11277[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field11258.field462 != -1) {
                                    var62 = field11258.field462 | 0xFF000000;
                                } else if ((field11285 + var53 & 0x4) == (field11271 + var7 & 0x4)) {
                                    var62 = field11280[field11253.field1301 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method242(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method5554(arg0, var49, var54, var51, var56, var59, var60, field11289[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class364 var63 = (class364) field11278.method737((byte) -39, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method5554(arg0, var49, var54, var51, var56, var59, var60, field11289[var58], var63.field5942, var63.field5943, true);
                                }
                            } else {
                                field11266[0] = (short) (var61 - 1);
                                field11262[0] = field11279[var58];
                                method5554(arg0, var49, var54, var51, var56, var59, var60, field11289[var58], field11266, field11262, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field11288 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field11288 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field11258.field462 != -1) {
                            var68 = field11258.field462 | 0xFF000000;
                        } else if ((field11285 + var64 & 0x4) == (field11271 + var7 & 0x4)) {
                            var68 = field11280[field11253.field1301 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method242(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field11273;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field11273;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field11271 + var8;
                if (var41 >= 0 && var41 < field11284) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field11288 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field11288 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field11283 + var42;
                            if (var46 >= 0 && var46 < field11272) {
                                int var47 = field11277[field11284 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method5551(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class364 var48 = (class364) field11278.method737((byte) -39, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method5551(arg0, var38, var43, var40, var45, var48.field5942, var48.field5943);
                                    }
                                } else {
                                    field11266[0] = (short) (var47 - 1);
                                    field11262[0] = field11279[field11284 * var46 + var41];
                                    method5551(arg0, var38, var43, var40, var45, field11266, field11262);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field11271 >> 6;
        int var10 = field11283 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field11286 >> 6;
        int var12 = field11285 >> 6;
        if (var11 >= field11290[0].length) {
            var11 = field11290[0].length - 1;
        }
        if (var12 >= field11290[0][0].length) {
            var12 = field11290[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class71 var28 = field11290[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field11276 >> 6) + var14) * 64;
                        int var30 = ((field11270 >> 6) + var27) * 64;
                        for (class474 var31 = (class474) var28.method749(0); var31 != null; var31 = (class474) var28.method747((byte) 21)) {
                            int var32 = var31.field7229 + var29 - field11276 - field11271;
                            int var33 = var31.field7232 + var30 - field11270 - field11283;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field11273;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field11273;
                            int var36 = field11288 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field11288 - (arg2 * var33 + arg4 >> 16);
                            method5554(arg0, var34, var36, var35 - var34, var37 - var36, var31.field7235, var31.field7233 & 0xFF, var31.field7234, var31.field7231, var31.field7230, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class71 var17 = field11290[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field11276 >> 6) + var15) * 64;
                        int var19 = ((field11270 >> 6) + var16) * 64;
                        for (class474 var20 = (class474) var17.method749(0); var20 != null; var20 = (class474) var17.method747((byte) 21)) {
                            int var21 = var20.field7229 + var18 - field11276 - field11271;
                            int var22 = var20.field7232 + var19 - field11270 - field11283;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field11273;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field11273;
                            int var25 = field11288 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field11288 - (arg2 * var22 + arg4 >> 16);
                            method5551(arg0, var23, var25, var24 - var23, var26 - var25, var20.field7231, var20.field7230);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lha;IIIIIII[S[BZ)V")
    private static final void method5554(class63 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method242(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field11280[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method242(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class541.method4027((byte) -108, arg3, arg4, field11268, arg1, arg2, arg7 >> 6 & 0x3, field11264, var12, arg0, var11, field11280[arg6], arg5);
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
                class362 var18 = field11255.method4002(116, arg8[var16] & 0xFFFF);
                if (var18.field5907 == -1) {
                    int var19 = -3355444;
                    if (var18.field5843 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method262(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method250(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method262(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method250(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method262(arg1, arg2, arg4, -1, 0);
                            arg0.method250(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method262(var14, arg2, arg4, -1, 0);
                            arg0.method250(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method262(var14, arg2, arg4, -1, 0);
                            arg0.method250(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method262(arg1, arg2, arg4, -1, 0);
                            arg0.method250(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method250(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method250(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method250(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method250(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method250(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method250(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lha;II)V")
    public static final void method5555(class63 arg0, int arg1, int arg2) {
        class176 var3 = new class176(field11256.method591(true, field11291[1], field11258.field451));
        int var4 = var3.method1645((byte) -81);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method1645((byte) -111);
        }
        int var7 = var3.method1645((byte) -77);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1645((byte) -81);
        }
        while (true) {
            while (var3.field2799 < var3.field2805.length) {
                if (var3.method1645((byte) -103) == 0) {
                    int var22 = var3.method1645((byte) -120);
                    int var23 = var3.method1645((byte) -119);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field11276;
                            int var27 = var23 * 64 + var25 - field11270;
                            method5557(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method1645((byte) -112);
                    int var29 = var3.method1645((byte) -103);
                    int var30 = var3.method1645((byte) -98);
                    int var31 = var3.method1645((byte) -122);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field11276;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field11270;
                            method5557(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field11282 = new byte[field11284 * field11272];
            field11281 = new short[field11284 * field11272];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field11284 * field11272];
                for (int var13 = 0; var13 < field11290[var11].length; var13++) {
                    for (int var19 = 0; var19 < field11290[var11][0].length; var19++) {
                        class71 var20 = field11290[var11][var13][var19];
                        if (var20 != null) {
                            for (class474 var21 = (class474) var20.method749(0); var21 != null; var21 = (class474) var20.method747((byte) 21)) {
                                var12[(var19 * 64 + var21.field7232) * field11284 + var13 * 64 + var21.field7229] = (byte) var21.field7235;
                            }
                        }
                    }
                }
                method5541(var12, field11282, field11281, arg1, arg2);
                for (int var14 = 0; var14 < field11290[var11].length; var14++) {
                    for (int var15 = 0; var15 < field11290[var11][0].length; var15++) {
                        class71 var16 = field11290[var11][var14][var15];
                        if (var16 != null) {
                            for (class474 var17 = (class474) var16.method749(0); var17 != null; var17 = (class474) var16.method747((byte) 21)) {
                                int var18 = (var15 * 64 + var17.field7232) * field11284 + var14 * 64 + var17.field7229;
                                var17.field7235 = (field11282[var18] & 0xFF) << 16 | field11281[var18] & 0xFFFF;
                                if (var17.field7235 != 0) {
                                    var17.field7235 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method5541(field11275, field11282, field11281, arg1, arg2);
            field11275 = null;
            method5548();
            return;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lgda;Lgv;Lhg;Lmq;Lsda;Leka;Lada;)V")
    public static final void method5556(class58 arg0, class87 arg1, class722 arg2, class536 arg3, class269 arg4, class492 arg5, class171 arg6) {
        field11256 = arg0;
        field11253 = arg1;
        field11250 = arg2;
        field11255 = arg3;
        field11257 = arg4;
        field11254 = arg5;
        field11252 = arg6;
        field11251.method730(true);
        int var7 = field11256.method585(-1, field11291[0]);
        int[] var8 = field11256.method601(var7, -127);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class40 var10 = class347.method2903(var8[var9], (byte) -91, var7, field11256);
                field11251.method738(var10, (long) var10.field455, -12002);
            }
        }
        class517.method3877(false, true, 1);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lha;Lwq;IIII[I[I)V")
    private static final void method5557(class63 arg0, class176 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method1645((byte) -115);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method1645((byte) -73);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field11275[field11284 * arg5 + arg4] = (byte) var11;
                    field11269[field11284 * arg5 + arg4] = 0;
                } else {
                    field11269[field11284 * arg5 + arg4] = (byte) var11;
                    field11289[field11284 * arg5 + arg4] = 0;
                    field11275[field11284 * arg5 + arg4] = arg1.method1672(-40);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method1645((byte) -95);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method1645((byte) -90);
                var18 = arg1.method1645((byte) -121);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method1645((byte) -71);
            }
            if (var15 == 0) {
                field11275[field11284 * arg5 + arg4] = (byte) var16;
                field11269[field11284 * arg5 + arg4] = (byte) var17;
                field11289[field11284 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field11277[field11284 * arg5 + arg4] = (short) (arg1.method1687((byte) -51) + 1);
                    field11279[field11284 * arg5 + arg4] = arg1.method1672(-116);
                } else if (var19 > 1) {
                    field11277[field11284 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method1687((byte) -128);
                        var21[var22] = arg1.method1672(0);
                    }
                    field11278.method738(new class364(var20, var21), (long) (arg4 << 16 | arg5), -12002);
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method1687((byte) -59);
                        var24[var25] = arg1.method1672(-84);
                    }
                }
                if (field11290[var15 - 1][arg2 - (field11276 >> 6)][arg3 - (field11270 >> 6)] == null) {
                    field11290[var15 - 1][arg2 - (field11276 >> 6)][arg3 - (field11270 >> 6)] = new class71();
                }
                class474 var26 = new class474(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field11290[var15 - 1][arg2 - (field11276 >> 6)][arg3 - (field11270 >> 6)].method748(-62, var26);
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lha;Lsg;IIII)V")
    private static final void method5558(class63 arg0, class420 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field6633 = ((arg1.field6631 - field11271) * arg2 + arg4 >> 16) + field11273;
        arg1.field6634 = field11288 - ((arg1.field6630 - field11283) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method5559(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field11271 = arg0 - field11276;
        field11285 = arg1 - field11270;
        field11286 = arg2 - field11276;
        field11283 = arg3 - field11270;
        field11273 = arg4;
        field11287 = arg5;
        field11274 = arg6;
        field11288 = arg7;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "()V")
    public static final void method5560() {
        field11275 = null;
        field11282 = null;
        field11281 = null;
        field11269 = null;
        field11289 = null;
        field11277 = null;
        field11279 = null;
        field11278 = null;
        field11290 = null;
        field11280 = null;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(II)Lpja;")
    public static final class40 method5561(int arg0, int arg1) {
        for (class40 var2 = (class40) field11251.method735(0); var2 != null; var2 = (class40) field11251.method734((byte) -50)) {
            if (var2.field459 && var2.method379(arg1, arg0, -92)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5562(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5563(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 62;
                    break;
                case 1:
                    var10005 = 75;
                    break;
                case 2:
                    var10005 = 86;
                    break;
                case 3:
                    var10005 = 115;
                    break;
                default:
                    var10005 = 125;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
