import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class744 {

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "Ldu;")
    private static class360 field10332 = new class360(16);

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field10347 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "[S")
    private static short[] field10341 = new short[1];

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field10342 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "[B")
    private static byte[] field10343 = new byte[1];

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "Lro;")
    public static class2 field10345 = new class2();

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "F")
    public static float field10349;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "F")
    public static float field10350;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public static int field10348;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    public static int field10351;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    public static int field10356;

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
    public static int field10358;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "I")
    public static int field10359;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "I")
    public static int field10362;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "I")
    public static int field10363;

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "I")
    public static int field10366;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
    public static int field10367;

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
    public static int field10368;

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "I")
    public static int field10370;

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "I")
    public static int field10371;

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "I")
    public static int field10372;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "Lbj;")
    public static class245 field10340;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "Lcl;")
    public static class269 field10337;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "Lwb;")
    public static class334 field10339;

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "Ldu;")
    private static class360 field10364;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "Lws;")
    public static class362 field10346;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "Lwu;")
    public static class376 field10333;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "Ljb;")
    private static class496 field10335;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "Llh;")
    private static class528 field10334;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "Lpm;")
    public static class585 field10338;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "Lav;")
    public static class640 field10336;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "[B")
    private static byte[] field10353;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "[B")
    private static byte[] field10354;

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "[B")
    private static byte[] field10361;

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "[B")
    private static byte[] field10365;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "[B")
    private static byte[] field10369;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "[I")
    private static int[] field10360;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "[S")
    private static short[] field10352;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "[S")
    private static short[] field10357;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "[[[B")
    public static byte[][][] field10344;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "[[[Lvm;")
    private static class687[][][] field10355;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "()V")
    public static final void method4152() {
        field10361 = null;
        field10354 = null;
        field10357 = null;
        field10353 = null;
        field10365 = null;
        field10352 = null;
        field10369 = null;
        field10364 = null;
        field10355 = null;
        field10360 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lha;IIII[S[B)V")
    private static final void method4153(class59 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class100 var8 = field10339.method2008((byte) -12, arg5[var7] & 0xFFFF);
            int var9 = var8.field1294;
            if (var9 != -1) {
                class513 var10 = field10337.method1623(var9, 125);
                class133 var11 = var10.method2862(var8.field1319 ? var8.field1322 : false, 681903699, arg0, var8.field1313 ? arg6[var7] >> 6 & 0x3 : 0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method1036() >> 2;
                    int var13 = arg4 * var11.method1048() >> 2;
                    if (var10.field6804) {
                        int var14 = var8.field1355;
                        int var15 = var8.field1323;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field6807 == 0) {
                            var11.method1052(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method1033(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field6807 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "()V")
    public static void method4154() {
        field10335 = null;
        field10334 = null;
        field10339 = null;
        field10338 = null;
        field10337 = null;
        field10340 = null;
        field10336 = null;
        field10333 = null;
        field10332 = null;
        field10344 = null;
        field10341 = null;
        field10343 = null;
        field10346 = null;
        field10345 = null;
        field10360 = null;
        field10361 = null;
        field10354 = null;
        field10357 = null;
        field10353 = null;
        field10365 = null;
        field10352 = null;
        field10369 = null;
        field10364 = null;
        field10355 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)Lav;")
    public static final class640 method4155(int arg0, int arg1) {
        for (class640 var2 = (class640) field10332.method2144(true); var2 != null; var2 = (class640) field10332.method2146(false)) {
            if (var2.field8498 && var2.method3503(arg0, arg1, 105)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "()V")
    private static final void method4156() {
        for (int var0 = 0; var0 < field10367; var0++) {
            for (int var11 = 0; var11 < field10359; var11++) {
                int var12 = field10352[field10367 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class219 var13 = (class219) field10364.method2135((long) (var0 << 16 | var11), (byte) 31);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field3148.length; var14++) {
                                class100 var15 = field10339.method2008((byte) -76, var13.field3148[var14] & 0xFFFF);
                                int var16 = var15.field1291;
                                if (var15.field1307 != null) {
                                    class100 var17 = var15.method748(field10340, 120);
                                    if (var17 != null) {
                                        var16 = var17.field1291;
                                    }
                                }
                                if (var16 != -1) {
                                    class630 var18 = new class630(var16);
                                    var18.field8396 = var0;
                                    var18.field8390 = var11;
                                    field10345.method11(var18, -123);
                                }
                            }
                        }
                    } else {
                        class100 var19 = field10339.method2008((byte) -23, var12 - 1);
                        int var20 = var19.field1291;
                        if (var19.field1307 != null) {
                            class100 var21 = var19.method748(field10340, 123);
                            if (var21 != null) {
                                var20 = var21.field1291;
                            }
                        }
                        if (var20 != -1) {
                            class630 var22 = new class630(var20);
                            var22.field8396 = var0;
                            var22.field8390 = var11;
                            field10345.method11(var22, -113);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field10355[0].length; var2++) {
                for (int var3 = 0; var3 < field10355[0][0].length; var3++) {
                    class687 var4 = field10355[var1][var2][var3];
                    if (var4 != null) {
                        for (class693 var5 = (class693) var4.method3874((byte) 51); var5 != null; var5 = (class693) var4.method3868(-24951)) {
                            if (var5.field9646 != null) {
                                for (int var6 = 0; var6 < var5.field9646.length; var6++) {
                                    class100 var7 = field10339.method2008((byte) -80, var5.field9646[var6] & 0xFFFF);
                                    int var8 = var7.field1291;
                                    if (var7.field1307 != null) {
                                        class100 var9 = var7.method748(field10340, 125);
                                        if (var9 != null) {
                                            var8 = var9.field1291;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class630 var10 = new class630(var8);
                                        var10.field8396 = ((field10370 >> 6) + var2) * 64 + var5.field9648 - field10370;
                                        var10.field8390 = ((field10371 >> 6) + var3) * 64 + var5.field9644 - field10371;
                                        field10345.method11(var10, -88);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lha;Lee;IIII[I[I)V")
    private static final void method4157(class59 arg0, class677 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method3821((byte) -15);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method3821((byte) -40);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field10361[field10367 * arg5 + arg4] = (byte) var11;
                    field10353[field10367 * arg5 + arg4] = 0;
                } else {
                    field10353[field10367 * arg5 + arg4] = (byte) var11;
                    field10365[field10367 * arg5 + arg4] = 0;
                    field10361[field10367 * arg5 + arg4] = arg1.method3811(37);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method3821((byte) 87);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method3821((byte) 109);
                var18 = arg1.method3821((byte) -42);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method3821((byte) 120);
            }
            if (var15 == 0) {
                field10361[field10367 * arg5 + arg4] = (byte) var16;
                field10353[field10367 * arg5 + arg4] = (byte) var17;
                field10365[field10367 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field10352[field10367 * arg5 + arg4] = (short) (arg1.method3807(-1) + 1);
                    field10369[field10367 * arg5 + arg4] = arg1.method3811(85);
                } else if (var19 > 1) {
                    field10352[field10367 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method3807(-1);
                        var21[var22] = arg1.method3811(82);
                    }
                    field10364.method2143(-1, new class219(var20, var21), (long) (arg4 << 16 | arg5));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method3807(-1);
                        var24[var25] = arg1.method3811(123);
                    }
                }
                if (field10355[var15 - 1][arg2 - (field10370 >> 6)][arg3 - (field10371 >> 6)] == null) {
                    field10355[var15 - 1][arg2 - (field10370 >> 6)][arg3 - (field10371 >> 6)] = new class687();
                }
                class693 var26 = new class693(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field10355[var15 - 1][arg2 - (field10370 >> 6)][arg3 - (field10371 >> 6)].method3870(var26, 0);
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lwu;Ljb;Llh;Lwb;Lpm;Lcl;Lbj;)V")
    public static final void method4158(class376 arg0, class496 arg1, class528 arg2, class334 arg3, class585 arg4, class269 arg5, class245 arg6) {
        field10333 = arg0;
        field10335 = arg1;
        field10334 = arg2;
        field10339 = arg3;
        field10338 = arg4;
        field10337 = arg5;
        field10340 = arg6;
        field10332.method2138(-1);
        int var7 = field10333.method2223((byte) 77, "details");
        int[] var8 = field10333.method2214(var7, 114);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class640 var10 = class272.method1635(field10333, false, var8[var9], var7);
                field10332.method2143(-1, var10, (long) var10.field8490);
            }
        }
        class60.method519(true, false, true);
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "()V")
    public static final void method4159() {
        field10361 = new byte[field10367 * field10359];
        field10353 = new byte[field10367 * field10359];
        field10365 = new byte[field10367 * field10359];
        field10352 = new short[field10367 * field10359];
        field10369 = new byte[field10367 * field10359];
        field10364 = new class360(1024);
        field10355 = new class687[3][field10367 >> 6][field10359 >> 6];
        field10360 = new int[field10335.field6686 + 1];
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)Ldr;")
    public static final class721 method4160(int arg0, int arg1) {
        class721 var2 = new class721();
        for (class640 var3 = (class640) field10332.method2144(true); var3 != null; var3 = (class640) field10332.method2146(false)) {
            if (var3.field8498 && var3.method3503(arg0, arg1, 120)) {
                var2.method4050(var3, -109);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lha;IIII)Lro;")
    private static final class2 method4161(class59 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class630 var5 = (class630) field10345.method21(2); var5 != null; var5 = (class630) field10345.method9(-128)) {
            method4166(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field10345;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lha;Lpda;Ldh;)V")
    public static final void method4162(class59 arg0, class630 arg1, class325 arg2) {
        if (arg2.field4625 == null) {
            return;
        }
        int[] var3 = new int[arg2.field4625.length];
        for (int var4 = 0; var4 < var3.length / 2; var4++) {
            int var21 = arg2.field4625[var4 * 2] + arg1.field8396;
            int var22 = arg2.field4625[var4 * 2 + 1] + arg1.field8390;
            var3[var4 * 2] = (field10368 - field10366) * (var21 - field10362) / (field10363 - field10362) + field10366;
            var3[var4 * 2 + 1] = field10358 - (field10358 - field10372) * (var22 - field10351) / (field10356 - field10351);
        }
        class699.method3936(arg0, var3, arg2.field4619);
        if (arg2.field4654 > 0) {
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
                arg0.method499(var13, var14, var15, var16, arg2.field4621[arg2.field4632[var5] & 0xFF], 1, arg2.field4654, arg2.field4644, arg2.field4637);
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
            arg0.method499(var6, var7, var8, var9, arg2.field4621[arg2.field4632[arg2.field4632.length - 1] & 0xFF], 1, arg2.field4654, arg2.field4644, arg2.field4637);
            return;
        }
        for (int var20 = 0; var20 < var3.length / 2 - 1; var20++) {
            arg0.method427(var3[(var20 + 1) * 2], var3[(var20 + 1) * 2 + 1], var3[var20 * 2 + 1], arg2.field4621[arg2.field4632[var20] & 0xFF], (byte) 49, var3[var20 * 2]);
        }
        arg0.method427(var3[0], var3[1], var3[var3.length - 1], arg2.field4621[arg2.field4632[arg2.field4632.length - 1] & 0xFF], (byte) 49, var3[var3.length - 2]);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(Lha;IIII)V")
    private static final void method4163(class59 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field10363 - field10362;
        int var6 = field10356 - field10351;
        if (field10363 < field10367) {
            var5++;
        }
        if (field10356 < field10359) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field10366;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field10366;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field10362 + var7;
                if (var52 >= 0 && var52 < field10367) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field10358 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field10358 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field10351 + var53;
                            int var58 = field10367 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field10359) {
                                var59 = (field10354[var58] & 0xFF) << 16 | field10357[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field10353[var58] & 0xFF;
                                var61 = field10352[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field10336.field8501 != -1) {
                                    var62 = field10336.field8501 | 0xFF000000;
                                } else if ((field10362 + var7 & 0x4) == (field10356 + var53 & 0x4)) {
                                    var62 = field10360[field10335.field6693 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method504(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method4174(arg0, var49, var54, var51, var56, var59, var60, field10365[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class219 var63 = (class219) field10364.method2135((long) (var52 << 16 | var57), (byte) 31);
                                if (var63 != null) {
                                    method4174(arg0, var49, var54, var51, var56, var59, var60, field10365[var58], var63.field3148, var63.field3149, true);
                                }
                            } else {
                                field10341[0] = (short) (var61 - 1);
                                field10343[0] = field10369[var58];
                                method4174(arg0, var49, var54, var51, var56, var59, var60, field10365[var58], field10341, field10343, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field10358 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field10358 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field10336.field8501 != -1) {
                            var68 = field10336.field8501 | 0xFF000000;
                        } else if ((field10362 + var7 & 0x4) == (field10356 + var64 & 0x4)) {
                            var68 = field10360[field10335.field6693 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method504(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field10366;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field10366;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field10362 + var8;
                if (var41 >= 0 && var41 < field10367) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field10358 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field10358 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field10351 + var42;
                            if (var46 >= 0 && var46 < field10359) {
                                int var47 = field10352[field10367 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method4153(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class219 var48 = (class219) field10364.method2135((long) (var41 << 16 | var46), (byte) 31);
                                    if (var48 != null) {
                                        method4153(arg0, var38, var43, var40, var45, var48.field3148, var48.field3149);
                                    }
                                } else {
                                    field10341[0] = (short) (var47 - 1);
                                    field10343[0] = field10369[field10367 * var46 + var41];
                                    method4153(arg0, var38, var43, var40, var45, field10341, field10343);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field10362 >> 6;
        int var10 = field10351 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field10363 >> 6;
        int var12 = field10356 >> 6;
        if (var11 >= field10355[0].length) {
            var11 = field10355[0].length - 1;
        }
        if (var12 >= field10355[0][0].length) {
            var12 = field10355[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class687 var28 = field10355[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field10370 >> 6) + var14) * 64;
                        int var30 = ((field10371 >> 6) + var27) * 64;
                        for (class693 var31 = (class693) var28.method3874((byte) 126); var31 != null; var31 = (class693) var28.method3868(-24951)) {
                            int var32 = var31.field9648 + var29 - field10370 - field10362;
                            int var33 = var31.field9644 + var30 - field10371 - field10351;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field10366;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field10366;
                            int var36 = field10358 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field10358 - (arg2 * var33 + arg4 >> 16);
                            method4174(arg0, var34, var36, var35 - var34, var37 - var36, var31.field9645, var31.field9650 & 0xFF, var31.field9647, var31.field9646, var31.field9649, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class687 var17 = field10355[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field10370 >> 6) + var15) * 64;
                        int var19 = ((field10371 >> 6) + var16) * 64;
                        for (class693 var20 = (class693) var17.method3874((byte) 52); var20 != null; var20 = (class693) var17.method3868(-24951)) {
                            int var21 = var20.field9648 + var18 - field10370 - field10362;
                            int var22 = var20.field9644 + var19 - field10371 - field10351;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field10366;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field10366;
                            int var25 = field10358 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field10358 - (arg2 * var22 + arg4 >> 16);
                            method4153(arg0, var23, var25, var24 - var23, var26 - var25, var20.field9646, var20.field9649);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ld;III)I")
    private static final int method4164(class152 arg0, int arg1, int arg2, int arg3) {
        class403 var4 = field10335.method2798(arg1, -52);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field5618;
        if (var5 >= 0 && arg0.method91(var5, (byte) 125).field10534) {
            var5 = -1;
        }
        int var9;
        if (var4.field5616 >= 0) {
            int var6 = var4.field5616;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class656.field8679[class550.method3075((byte) -104, class750.method4209(96, (byte) -56, var8)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class656.field8679[class550.method3075((byte) -122, class750.method4209(96, (byte) -56, arg0.method91(var5, (byte) 126).field10546)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field5624 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field5624;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class656.field8679[class550.method3075((byte) -107, class750.method4209(96, (byte) -56, var12)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lha;)V")
    public static final void method4165(class59 arg0) {
        int var1 = field10363 - field10362;
        int var2 = field10356 - field10351;
        int var3 = (field10368 - field10366 << 16) / var1;
        int var4 = (field10358 - field10372 << 16) / var2;
        method4163(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lha;Lpda;IIII)V")
    private static final void method4166(class59 arg0, class630 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field8389 = ((arg1.field8396 - field10362) * arg2 + arg4 >> 16) + field10366;
        arg1.field8393 = field10358 - ((arg1.field8390 - field10351) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method4167(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field10362 = arg0 - field10370;
        field10356 = arg1 - field10371;
        field10363 = arg2 - field10370;
        field10351 = arg3 - field10371;
        field10366 = arg4;
        field10372 = arg5;
        field10368 = arg6;
        field10358 = arg7;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)Lav;")
    public static final class640 method4168(int arg0) {
        return (class640) field10332.method2135((long) arg0, (byte) 31);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([B[B[SII)V")
    private static final void method4169(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field10359];
        int[] var6 = new int[field10359];
        int[] var7 = new int[field10359];
        int[] var8 = new int[field10359];
        int[] var9 = new int[field10359];
        for (int var10 = -5; var10 < field10367; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field10359; var13++) {
                int var10002;
                if (var11 < field10367) {
                    int var28 = arg0[field10367 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class155 var29 = field10334.method2953(var28 - 1, false);
                        var5[var13] += var29.field2364;
                        var6[var13] += var29.field2360;
                        var7[var13] += var29.field2373;
                        var8[var13] += var29.field2369;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field10367 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class155 var31 = field10334.method2953(var30 - 1, false);
                        var5[var13] -= var31.field2364;
                        var6[var13] -= var31.field2360;
                        var7[var13] -= var31.field2373;
                        var8[var13] -= var31.field2369;
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
                for (int var19 = -5; var19 < field10359; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field10359) {
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
                        if ((arg0[field10367 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field10367 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class94.method698(var16 / var18, false, var14 * 256 / var17, var15 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field10367 * var19 + var10;
                            int var27 = class656.field8679[class550.method3075((byte) -109, class586.method3198(-3, var25, 96)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(Lha;)Lro;")
    public static final class2 method4170(class59 arg0) {
        int var1 = field10363 - field10362;
        int var2 = field10356 - field10351;
        int var3 = (field10368 - field10366 << 16) / var1;
        int var4 = (field10358 - field10372 << 16) / var2;
        return method4161(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ld;II)V")
    public static final void method4171(class152 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field10335.field6686; var3++) {
            field10360[var3 + 1] = method4164(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lha;II)V")
    public static final void method4172(class59 arg0, int arg1, int arg2) {
        class677 var3 = new class677(field10333.method2204("area", field10336.field8500, (byte) 127));
        int var4 = var3.method3821((byte) -111);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method3821((byte) -80);
        }
        int var7 = var3.method3821((byte) 100);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method3821((byte) -73);
        }
        while (true) {
            while (var3.field9419 < var3.field9399.length) {
                if (var3.method3821((byte) -60) == 0) {
                    int var22 = var3.method3821((byte) 104);
                    int var23 = var3.method3821((byte) 81);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field10370;
                            int var27 = var23 * 64 + var25 - field10371;
                            method4157(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method3821((byte) 89);
                    int var29 = var3.method3821((byte) 110);
                    int var30 = var3.method3821((byte) -84);
                    int var31 = var3.method3821((byte) 70);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field10370;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field10371;
                            method4157(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field10354 = new byte[field10367 * field10359];
            field10357 = new short[field10367 * field10359];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field10367 * field10359];
                for (int var13 = 0; var13 < field10355[var11].length; var13++) {
                    for (int var19 = 0; var19 < field10355[var11][0].length; var19++) {
                        class687 var20 = field10355[var11][var13][var19];
                        if (var20 != null) {
                            for (class693 var21 = (class693) var20.method3874((byte) 58); var21 != null; var21 = (class693) var20.method3868(-24951)) {
                                var12[(var19 * 64 + var21.field9644) * field10367 + var13 * 64 + var21.field9648] = (byte) var21.field9645;
                            }
                        }
                    }
                }
                method4169(var12, field10354, field10357, arg1, arg2);
                for (int var14 = 0; var14 < field10355[var11].length; var14++) {
                    for (int var15 = 0; var15 < field10355[var11][0].length; var15++) {
                        class687 var16 = field10355[var11][var14][var15];
                        if (var16 != null) {
                            for (class693 var17 = (class693) var16.method3874((byte) 117); var17 != null; var17 = (class693) var16.method3868(-24951)) {
                                int var18 = (var15 * 64 + var17.field9644) * field10367 + var14 * 64 + var17.field9648;
                                var17.field9645 = (field10354[var18] & 0xFF) << 16 | field10357[var18] & 0xFFFF;
                                if (var17.field9645 != 0) {
                                    var17.field9645 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method4169(field10361, field10354, field10357, arg1, arg2);
            field10361 = null;
            method4156();
            return;
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
    public static final void method4173(int arg0) {
        field10336 = (class640) field10332.method2135((long) arg0, (byte) 31);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lha;IIIIIII[S[BZ)V")
    private static final void method4174(class59 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method504(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field10360[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method504(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class658.method3572(var12, field10360[arg6], arg0, var11, field10344, arg7 >> 6 & 0x3, -18954, arg2, arg3, arg4, arg1, field10348, arg5);
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
                class100 var18 = field10339.method2008((byte) -125, arg8[var16] & 0xFFFF);
                if (var18.field1294 == -1) {
                    int var19 = -3355444;
                    if (var18.field1363 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method428(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method480(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method428(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method480(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method428(arg1, arg2, arg4, -1, 0);
                            arg0.method480(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method428(var14, arg2, arg4, -1, 0);
                            arg0.method480(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method428(var14, arg2, arg4, -1, 0);
                            arg0.method480(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method428(arg1, arg2, arg4, -1, 0);
                            arg0.method480(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method480(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method480(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method480(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method480(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method480(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method480(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "()V")
    public static final void method4175() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field10346.field5095; var1++) {
            boolean var2 = field10336.method3505(var0, field10346.field5096[var1] >> 14 & 0x3FFF, field10346.field5096[var1] & 0x3FFF, field10346.field5096[var1] >> 28 & 0x3, 0);
            if (var2) {
                class630 var3 = new class630(field10346.field5098[var1]);
                var3.field8396 = var0[1] - field10370;
                var3.field8390 = var0[2] - field10371;
                field10345.method11(var3, -127);
            }
        }
    }
}
