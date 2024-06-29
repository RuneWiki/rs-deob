import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class729 {

    @OriginalMember(owner = "client!wca", name = "d", descriptor = "Lpl;")
    private static class616 field10203 = new class616(16);

    @OriginalMember(owner = "client!wca", name = "o", descriptor = "I")
    public static int field10214 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!wca", name = "p", descriptor = "[S")
    private static short[] field10215 = new short[1];

    @OriginalMember(owner = "client!wca", name = "m", descriptor = "I")
    public static int field10212 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!wca", name = "q", descriptor = "[B")
    private static byte[] field10216 = new byte[1];

    @OriginalMember(owner = "client!wca", name = "k", descriptor = "Ltg;")
    public static class605 field10210 = new class605();

    @OriginalMember(owner = "client!wca", name = "r", descriptor = "F")
    public static float field10217;

    @OriginalMember(owner = "client!wca", name = "s", descriptor = "F")
    public static float field10218;

    @OriginalMember(owner = "client!wca", name = "n", descriptor = "I")
    public static int field10213;

    @OriginalMember(owner = "client!wca", name = "t", descriptor = "I")
    public static int field10219;

    @OriginalMember(owner = "client!wca", name = "v", descriptor = "I")
    public static int field10221;

    @OriginalMember(owner = "client!wca", name = "w", descriptor = "I")
    public static int field10222;

    @OriginalMember(owner = "client!wca", name = "z", descriptor = "I")
    public static int field10225;

    @OriginalMember(owner = "client!wca", name = "A", descriptor = "I")
    public static int field10226;

    @OriginalMember(owner = "client!wca", name = "B", descriptor = "I")
    public static int field10227;

    @OriginalMember(owner = "client!wca", name = "C", descriptor = "I")
    public static int field10228;

    @OriginalMember(owner = "client!wca", name = "E", descriptor = "I")
    public static int field10230;

    @OriginalMember(owner = "client!wca", name = "H", descriptor = "I")
    public static int field10233;

    @OriginalMember(owner = "client!wca", name = "L", descriptor = "I")
    public static int field10237;

    @OriginalMember(owner = "client!wca", name = "N", descriptor = "I")
    public static int field10239;

    @OriginalMember(owner = "client!wca", name = "O", descriptor = "I")
    public static int field10240;

    @OriginalMember(owner = "client!wca", name = "h", descriptor = "Lqha;")
    private static class231 field10207;

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "Lau;")
    private static class245 field10202;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "Lko;")
    public static class318 field10200;

    @OriginalMember(owner = "client!wca", name = "g", descriptor = "Lbt;")
    public static class416 field10206;

    @OriginalMember(owner = "client!wca", name = "f", descriptor = "Lla;")
    public static class422 field10205;

    @OriginalMember(owner = "client!wca", name = "e", descriptor = "Lni;")
    public static class511 field10204;

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "Lpha;")
    public static class553 field10201;

    @OriginalMember(owner = "client!wca", name = "y", descriptor = "Lpl;")
    private static class616 field10224;

    @OriginalMember(owner = "client!wca", name = "j", descriptor = "Lwq;")
    public static class676 field10209;

    @OriginalMember(owner = "client!wca", name = "i", descriptor = "Lti;")
    public static class689 field10208;

    @OriginalMember(owner = "client!wca", name = "u", descriptor = "[B")
    private static byte[] field10220;

    @OriginalMember(owner = "client!wca", name = "D", descriptor = "[B")
    private static byte[] field10229;

    @OriginalMember(owner = "client!wca", name = "F", descriptor = "[B")
    private static byte[] field10231;

    @OriginalMember(owner = "client!wca", name = "I", descriptor = "[B")
    private static byte[] field10234;

    @OriginalMember(owner = "client!wca", name = "J", descriptor = "[B")
    private static byte[] field10235;

    @OriginalMember(owner = "client!wca", name = "G", descriptor = "[I")
    private static int[] field10232;

    @OriginalMember(owner = "client!wca", name = "K", descriptor = "[S")
    private static short[] field10236;

    @OriginalMember(owner = "client!wca", name = "M", descriptor = "[S")
    private static short[] field10238;

    @OriginalMember(owner = "client!wca", name = "l", descriptor = "[[[B")
    public static byte[][][] field10211;

    @OriginalMember(owner = "client!wca", name = "x", descriptor = "[[[Lfa;")
    private static class564[][][] field10223;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(II)Lpha;", line = 7)
    public static final class553 method4027(int arg0, int arg1) {
        for (class553 var2 = (class553) field10203.method3508((byte) -105); var2 != null; var2 = (class553) field10203.method3520(-1)) {
            if (var2.field7871 && var2.method3226(false, arg0, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "()V", line = 21)
    private static final void method4028() {
        for (int var0 = 0; var0 < field10221; var0++) {
            for (int var11 = 0; var11 < field10226; var11++) {
                int var12 = field10238[field10221 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class375 var13 = (class375) field10224.method3512(true, (long) (var0 << 16 | var11));
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field5659.length; var14++) {
                                class595 var15 = field10204.method3074(0, var13.field5659[var14] & 0xFFFF);
                                int var16 = var15.field8405;
                                if (var15.field8351 != null) {
                                    class595 var17 = var15.method3413(-1, field10200);
                                    if (var17 != null) {
                                        var16 = var17.field8405;
                                    }
                                }
                                if (var16 != -1) {
                                    class302 var18 = new class302(var16);
                                    var18.field4604 = var0;
                                    var18.field4605 = var11;
                                    field10210.method3472(123, var18);
                                }
                            }
                        }
                    } else {
                        class595 var19 = field10204.method3074(0, var12 - 1);
                        int var20 = var19.field8405;
                        if (var19.field8351 != null) {
                            class595 var21 = var19.method3413(-1, field10200);
                            if (var21 != null) {
                                var20 = var21.field8405;
                            }
                        }
                        if (var20 != -1) {
                            class302 var22 = new class302(var20);
                            var22.field4604 = var0;
                            var22.field4605 = var11;
                            field10210.method3472(125, var22);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field10223[0].length; var2++) {
                for (int var3 = 0; var3 < field10223[0][0].length; var3++) {
                    class564 var4 = field10223[var1][var2][var3];
                    if (var4 != null) {
                        for (class337 var5 = (class337) var4.method3272(-126); var5 != null; var5 = (class337) var4.method3274(false)) {
                            if (var5.field4926 != null) {
                                for (int var6 = 0; var6 < var5.field4926.length; var6++) {
                                    class595 var7 = field10204.method3074(0, var5.field4926[var6] & 0xFFFF);
                                    int var8 = var7.field8405;
                                    if (var7.field8351 != null) {
                                        class595 var9 = var7.method3413(-1, field10200);
                                        if (var9 != null) {
                                            var8 = var9.field8405;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class302 var10 = new class302(var8);
                                        var10.field4604 = ((field10228 >> 6) + var2) * 64 + var5.field4929 - field10228;
                                        var10.field4605 = ((field10239 >> 6) + var3) * 64 + var5.field4924 - field10239;
                                        field10210.method3472(85, var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lha;Liba;Lre;)V", line = 177)
    public static final void method4029(class544 arg0, class302 arg1, class277 arg2) {
        if (arg2.field4209 == null) {
            return;
        }
        int[] var3 = new int[arg2.field4209.length];
        for (int var4 = 0; var4 < var3.length / 2; var4++) {
            int var21 = arg2.field4209[var4 * 2] + arg1.field4604;
            int var22 = arg2.field4209[var4 * 2 + 1] + arg1.field4605;
            var3[var4 * 2] = (field10225 - field10240) * (var21 - field10227) / (field10233 - field10227) + field10240;
            var3[var4 * 2 + 1] = field10219 - (var22 - field10237) * (field10219 - field10222) / (field10230 - field10237);
        }
        class646.method3648(arg0, var3, arg2.field4219);
        if (arg2.field4250 > 0) {
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
                arg0.method354(var13, var14, var15, var16, arg2.field4243[arg2.field4232[var5] & 0xFF], 1, arg2.field4250, arg2.field4244, arg2.field4227);
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
            arg0.method354(var6, var7, var8, var9, arg2.field4243[arg2.field4232[arg2.field4232.length - 1] & 0xFF], 1, arg2.field4250, arg2.field4244, arg2.field4227);
            return;
        }
        for (int var20 = 0; var20 < var3.length / 2 - 1; var20++) {
            arg0.method3187(var3[var20 * 2 + 1], var3[(var20 + 1) * 2], var3[var20 * 2], arg2.field4243[arg2.field4232[var20] & 0xFF], 93, var3[(var20 + 1) * 2 + 1]);
        }
        arg0.method3187(var3[var3.length - 1], var3[0], var3[var3.length - 2], arg2.field4243[arg2.field4232[arg2.field4232.length - 1] & 0xFF], 100, var3[1]);
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "()V", line = 286)
    public static final void method4030() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field10209.field9540; var1++) {
            boolean var2 = field10201.method3223(var0, (byte) -109, field10209.field9538[var1] & 0x3FFF, field10209.field9538[var1] >> 28 & 0x3, field10209.field9538[var1] >> 14 & 0x3FFF);
            if (var2) {
                class302 var3 = new class302(field10209.field9537[var1]);
                var3.field4604 = var0[1] - field10228;
                var3.field4605 = var0[2] - field10239;
                field10210.method3472(100, var3);
            }
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)Lpha;", line = 309)
    public static final class553 method4031(int arg0) {
        return (class553) field10203.method3512(true, (long) arg0);
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(I)V", line = 312)
    public static final void method4032(int arg0) {
        field10201 = (class553) field10203.method3512(true, (long) arg0);
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lha;IIII)Ltg;", line = 317)
    private static final class605 method4033(class544 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class302 var5 = (class302) field10210.method3463((byte) -50); var5 != null; var5 = (class302) field10210.method3469((byte) 107)) {
            method4037(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field10210;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lha;IIII[S[B)V", line = 328)
    private static final void method4034(class544 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class595 var8 = field10204.method3074(0, arg5[var7] & 0xFFFF);
            int var9 = var8.field8444;
            if (var9 != -1) {
                class308 var10 = field10208.method3852(var9, true);
                class34 var11 = var10.method2038(var8.field8412 ? arg6[var7] >> 6 & 0x3 : 0, var8.field8410 ? var8.field8443 : false, (byte) 79, arg0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method177() >> 2;
                    int var13 = arg4 * var11.method184() >> 2;
                    if (var10.field4662) {
                        int var14 = var8.field8384;
                        int var15 = var8.field8429;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field4655 == 0) {
                            var11.method187(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method191(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field4655 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Ld;II)V", line = 391)
    public static final void method4035(class267 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field10207.field3711; var3++) {
            field10232[var3 + 1] = method4040(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(II)Lvu;", line = 404)
    public static final class677 method4036(int arg0, int arg1) {
        class677 var2 = new class677();
        for (class553 var3 = (class553) field10203.method3508((byte) -51); var3 != null; var3 = (class553) field10203.method3520(-1)) {
            if (var3.field7871 && var3.method3226(false, arg0, arg1)) {
                var2.method3779(-14068, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lha;Liba;IIII)V", line = 419)
    private static final void method4037(class544 arg0, class302 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field4600 = ((arg1.field4604 - field10227) * arg2 + arg4 >> 16) + field10240;
        arg1.field4603 = field10219 - ((arg1.field4605 - field10237) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "()V", line = 423)
    public static final void method4038() {
        field10231 = null;
        field10220 = null;
        field10236 = null;
        field10235 = null;
        field10229 = null;
        field10238 = null;
        field10234 = null;
        field10224 = null;
        field10223 = null;
        field10232 = null;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "([B[B[SII)V", line = 436)
    private static final void method4039(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field10226];
        int[] var6 = new int[field10226];
        int[] var7 = new int[field10226];
        int[] var8 = new int[field10226];
        int[] var9 = new int[field10226];
        for (int var10 = -5; var10 < field10221; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field10226; var13++) {
                int var10002;
                if (var11 < field10221) {
                    int var28 = arg0[field10221 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class52 var29 = field10202.method1697((byte) -116, var28 - 1);
                        var5[var13] += var29.field841;
                        var6[var13] += var29.field831;
                        var7[var13] += var29.field828;
                        var8[var13] += var29.field839;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field10221 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class52 var31 = field10202.method1697((byte) -78, var30 - 1);
                        var5[var13] -= var31.field841;
                        var6[var13] -= var31.field831;
                        var7[var13] -= var31.field828;
                        var8[var13] -= var31.field839;
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
                for (int var19 = -5; var19 < field10226; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field10226) {
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
                        if ((arg0[field10221 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field10221 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class476.method2889(var14 * 256 / var17, 197891498, var15 / var18, var16 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field10221 * var19 + var10;
                            int var27 = class395.field5895[class718.method3964(896, class245.method1699(false, var25, 96)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Ld;III)I", line = 580)
    private static final int method4040(class267 arg0, int arg1, int arg2, int arg3) {
        class658 var4 = field10207.method1607(76, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field9374;
        if (var5 >= 0 && arg0.method1774(85, var5).field8062) {
            var5 = -1;
        }
        int var9;
        if (var4.field9359 >= 0) {
            int var6 = var4.field9359;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class395.field5895[class718.method3964(896, class150.method1143(var8, 96, (byte) 124)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class395.field5895[class718.method3964(896, class150.method1143(arg0.method1774(104, var5).field8071, 96, (byte) 124)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field9372 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field9372;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class395.field5895[class718.method3964(896, class150.method1143(var12, 96, (byte) 112)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lla;Lqha;Lau;Lni;Lbt;Lti;Lko;)V", line = 637)
    public static final void method4041(class422 arg0, class231 arg1, class245 arg2, class511 arg3, class416 arg4, class689 arg5, class318 arg6) {
        field10205 = arg0;
        field10207 = arg1;
        field10202 = arg2;
        field10204 = arg3;
        field10206 = arg4;
        field10208 = arg5;
        field10200 = arg6;
        field10203.method3517(-65);
        int var7 = field10205.method2629("details", 10912);
        int[] var8 = field10205.method2619(var7, true);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class553 var10 = class423.method2644(field10205, var7, var8[var9], 14852);
                field10203.method3516(255, (long) var10.field7884, var10);
            }
        }
        class614.method3506(false, (byte) 80, true);
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lha;)V", line = 668)
    public static final void method4042(class544 arg0) {
        int var1 = field10233 - field10227;
        int var2 = field10230 - field10237;
        int var3 = (field10225 - field10240 << 16) / var1;
        int var4 = (field10219 - field10222 << 16) / var2;
        method4048(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!wca", name = "d", descriptor = "()V", line = 678)
    public static final void method4043() {
        field10231 = new byte[field10226 * field10221];
        field10235 = new byte[field10226 * field10221];
        field10229 = new byte[field10226 * field10221];
        field10238 = new short[field10226 * field10221];
        field10234 = new byte[field10226 * field10221];
        field10224 = new class616(1024);
        field10223 = new class564[3][field10221 >> 6][field10226 >> 6];
        field10232 = new int[field10207.field3711 + 1];
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(Lha;)Ltg;", line = 689)
    public static final class605 method4044(class544 arg0) {
        int var1 = field10233 - field10227;
        int var2 = field10230 - field10237;
        int var3 = (field10225 - field10240 << 16) / var1;
        int var4 = (field10219 - field10222 << 16) / var2;
        return method4033(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!wca", name = "e", descriptor = "()V", line = 699)
    public static void method4045() {
        field10207 = null;
        field10202 = null;
        field10204 = null;
        field10206 = null;
        field10208 = null;
        field10200 = null;
        field10201 = null;
        field10205 = null;
        field10203 = null;
        field10211 = null;
        field10215 = null;
        field10216 = null;
        field10209 = null;
        field10210 = null;
        field10232 = null;
        field10231 = null;
        field10220 = null;
        field10236 = null;
        field10235 = null;
        field10229 = null;
        field10238 = null;
        field10234 = null;
        field10224 = null;
        field10223 = null;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lha;II)V", line = 727)
    public static final void method4046(class544 arg0, int arg1, int arg2) {
        class301 var3 = new class301(field10205.method2638("area", 100, field10201.field7882));
        int var4 = var3.method1987(-18);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method1987(-16);
        }
        int var7 = var3.method1987(-21);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1987(-89);
        }
        while (true) {
            while (var3.field4534 < var3.field4543.length) {
                if (var3.method1987(-72) == 0) {
                    int var22 = var3.method1987(-127);
                    int var23 = var3.method1987(-105);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field10228;
                            int var27 = var23 * 64 + var25 - field10239;
                            method4049(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method1987(-128);
                    int var29 = var3.method1987(-104);
                    int var30 = var3.method1987(-95);
                    int var31 = var3.method1987(-118);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field10228;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field10239;
                            method4049(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field10220 = new byte[field10226 * field10221];
            field10236 = new short[field10226 * field10221];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field10226 * field10221];
                for (int var13 = 0; var13 < field10223[var11].length; var13++) {
                    for (int var19 = 0; var19 < field10223[var11][0].length; var19++) {
                        class564 var20 = field10223[var11][var13][var19];
                        if (var20 != null) {
                            for (class337 var21 = (class337) var20.method3272(-123); var21 != null; var21 = (class337) var20.method3274(false)) {
                                var12[(var19 * 64 + var21.field4924) * field10221 + var13 * 64 + var21.field4929] = (byte) var21.field4925;
                            }
                        }
                    }
                }
                method4039(var12, field10220, field10236, arg1, arg2);
                for (int var14 = 0; var14 < field10223[var11].length; var14++) {
                    for (int var15 = 0; var15 < field10223[var11][0].length; var15++) {
                        class564 var16 = field10223[var11][var14][var15];
                        if (var16 != null) {
                            for (class337 var17 = (class337) var16.method3272(-127); var17 != null; var17 = (class337) var16.method3274(false)) {
                                int var18 = (var15 * 64 + var17.field4924) * field10221 + var14 * 64 + var17.field4929;
                                var17.field4925 = (field10220[var18] & 0xFF) << 16 | field10236[var18] & 0xFFFF;
                                if (var17.field4925 != 0) {
                                    var17.field4925 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method4039(field10231, field10220, field10236, arg1, arg2);
            field10231 = null;
            method4028();
            return;
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lha;IIIIIII[S[BZ)V", line = 906)
    private static final void method4047(class544 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method410(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field10232[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method410(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class692.method3864(var11, arg4, arg7 >> 6 & 0x3, arg2, var12, field10213, (byte) 122, arg3, arg5, arg0, field10232[arg6], arg1, field10211);
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
                class595 var18 = field10204.method3074(0, arg8[var16] & 0xFFFF);
                if (var18.field8444 == -1) {
                    int var19 = -3355444;
                    if (var18.field8426 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method292(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method264(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method292(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method264(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method292(arg1, arg2, arg4, -1, 0);
                            arg0.method264(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method292(var14, arg2, arg4, -1, 0);
                            arg0.method264(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method292(var14, arg2, arg4, -1, 0);
                            arg0.method264(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method292(arg1, arg2, arg4, -1, 0);
                            arg0.method264(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method264(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method264(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method264(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method264(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method264(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method264(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(Lha;IIII)V", line = 1070)
    private static final void method4048(class544 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field10233 - field10227;
        int var6 = field10230 - field10237;
        if (field10233 < field10221) {
            var5++;
        }
        if (field10230 < field10226) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field10240;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field10240;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field10227 + var7;
                if (var52 >= 0 && var52 < field10221) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field10219 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field10219 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field10237 + var53;
                            int var58 = field10221 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field10226) {
                                var59 = (field10220[var58] & 0xFF) << 16 | field10236[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field10235[var58] & 0xFF;
                                var61 = field10238[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field10201.field7874 != -1) {
                                    var62 = field10201.field7874 | 0xFF000000;
                                } else if ((field10230 + var53 & 0x4) == (field10227 + var7 & 0x4)) {
                                    var62 = field10232[field10207.field3721 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method410(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method4047(arg0, var49, var54, var51, var56, var59, var60, field10229[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class375 var63 = (class375) field10224.method3512(true, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method4047(arg0, var49, var54, var51, var56, var59, var60, field10229[var58], var63.field5659, var63.field5658, true);
                                }
                            } else {
                                field10215[0] = (short) (var61 - 1);
                                field10216[0] = field10234[var58];
                                method4047(arg0, var49, var54, var51, var56, var59, var60, field10229[var58], field10215, field10216, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field10219 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field10219 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field10201.field7874 != -1) {
                            var68 = field10201.field7874 | 0xFF000000;
                        } else if ((field10230 + var64 & 0x4) == (field10227 + var7 & 0x4)) {
                            var68 = field10232[field10207.field3721 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method410(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field10240;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field10240;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field10227 + var8;
                if (var41 >= 0 && var41 < field10221) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field10219 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field10219 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field10237 + var42;
                            if (var46 >= 0 && var46 < field10226) {
                                int var47 = field10238[field10221 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method4034(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class375 var48 = (class375) field10224.method3512(true, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method4034(arg0, var38, var43, var40, var45, var48.field5659, var48.field5658);
                                    }
                                } else {
                                    field10215[0] = (short) (var47 - 1);
                                    field10216[0] = field10234[field10221 * var46 + var41];
                                    method4034(arg0, var38, var43, var40, var45, field10215, field10216);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field10227 >> 6;
        int var10 = field10237 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field10233 >> 6;
        int var12 = field10230 >> 6;
        if (var11 >= field10223[0].length) {
            var11 = field10223[0].length - 1;
        }
        if (var12 >= field10223[0][0].length) {
            var12 = field10223[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class564 var28 = field10223[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field10228 >> 6) + var14) * 64;
                        int var30 = ((field10239 >> 6) + var27) * 64;
                        for (class337 var31 = (class337) var28.method3272(-120); var31 != null; var31 = (class337) var28.method3274(false)) {
                            int var32 = var31.field4929 + var29 - field10228 - field10227;
                            int var33 = var31.field4924 + var30 - field10239 - field10237;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field10240;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field10240;
                            int var36 = field10219 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field10219 - (arg2 * var33 + arg4 >> 16);
                            method4047(arg0, var34, var36, var35 - var34, var37 - var36, var31.field4925, var31.field4927 & 0xFF, var31.field4928, var31.field4926, var31.field4930, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class564 var17 = field10223[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field10228 >> 6) + var15) * 64;
                        int var19 = ((field10239 >> 6) + var16) * 64;
                        for (class337 var20 = (class337) var17.method3272(-120); var20 != null; var20 = (class337) var17.method3274(false)) {
                            int var21 = var20.field4929 + var18 - field10228 - field10227;
                            int var22 = var20.field4924 + var19 - field10239 - field10237;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field10240;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field10240;
                            int var25 = field10219 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field10219 - (arg2 * var22 + arg4 >> 16);
                            method4034(arg0, var23, var25, var24 - var23, var26 - var25, var20.field4926, var20.field4930);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lha;Lofa;IIII[I[I)V", line = 1413)
    private static final void method4049(class544 arg0, class301 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method1987(-34);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method1987(-28);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field10231[field10221 * arg5 + arg4] = (byte) var11;
                    field10235[field10221 * arg5 + arg4] = 0;
                } else {
                    field10235[field10221 * arg5 + arg4] = (byte) var11;
                    field10229[field10221 * arg5 + arg4] = 0;
                    field10231[field10221 * arg5 + arg4] = arg1.method1984(4);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method1987(-106);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method1987(-59);
                var18 = arg1.method1987(-88);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method1987(-60);
            }
            if (var15 == 0) {
                field10231[field10221 * arg5 + arg4] = (byte) var16;
                field10235[field10221 * arg5 + arg4] = (byte) var17;
                field10229[field10221 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field10238[field10221 * arg5 + arg4] = (short) (arg1.method1989((byte) -77) + 1);
                    field10234[field10221 * arg5 + arg4] = arg1.method1984(4);
                } else if (var19 > 1) {
                    field10238[field10221 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method1989((byte) -92);
                        var21[var22] = arg1.method1984(4);
                    }
                    field10224.method3516(255, (long) (arg4 << 16 | arg5), new class375(var20, var21));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method1989((byte) -83);
                        var24[var25] = arg1.method1984(4);
                    }
                }
                if (field10223[var15 - 1][arg2 - (field10228 >> 6)][arg3 - (field10239 >> 6)] == null) {
                    field10223[var15 - 1][arg2 - (field10228 >> 6)][arg3 - (field10239 >> 6)] = new class564();
                }
                class337 var26 = new class337(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field10223[var15 - 1][arg2 - (field10228 >> 6)][arg3 - (field10239 >> 6)].method3266(var26, true);
            }
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIIIIIII)V", line = 1547)
    public static final void method4050(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field10227 = arg0 - field10228;
        field10230 = arg1 - field10239;
        field10233 = arg2 - field10228;
        field10237 = arg3 - field10239;
        field10240 = arg4;
        field10222 = arg5;
        field10225 = arg6;
        field10219 = arg7;
    }
}
