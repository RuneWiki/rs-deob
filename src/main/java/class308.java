import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class308 {

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "Lva;")
    private static class288 field4343 = new class288(16);

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "[B")
    private static byte[] field4349 = new byte[1];

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "I")
    public static int field4350 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "I")
    public static int field4347 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "[S")
    private static short[] field4352 = new short[1];

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "Lwq;")
    public static class92 field4346 = new class92();

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "F")
    public static float field4351;

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "F")
    public static float field4355;

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!hr", name = "o", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!hr", name = "p", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!hr", name = "q", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!hr", name = "u", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!hr", name = "v", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!hr", name = "y", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!hr", name = "z", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!hr", name = "C", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!hr", name = "E", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!hr", name = "F", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!hr", name = "G", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!hr", name = "H", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "Lns;")
    public static class230 field4353;

    @OriginalMember(owner = "client!hr", name = "n", descriptor = "Lva;")
    private static class288 field4356;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "Lgq;")
    public static class300 field4345;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "Ltq;")
    public static class376 field4344;

    @OriginalMember(owner = "client!hr", name = "r", descriptor = "[B")
    private static byte[] field4360;

    @OriginalMember(owner = "client!hr", name = "s", descriptor = "[B")
    private static byte[] field4361;

    @OriginalMember(owner = "client!hr", name = "w", descriptor = "[B")
    private static byte[] field4365;

    @OriginalMember(owner = "client!hr", name = "x", descriptor = "[B")
    private static byte[] field4366;

    @OriginalMember(owner = "client!hr", name = "I", descriptor = "[B")
    private static byte[] field4377;

    @OriginalMember(owner = "client!hr", name = "t", descriptor = "[I")
    private static int[] field4362;

    @OriginalMember(owner = "client!hr", name = "B", descriptor = "[S")
    private static short[] field4370;

    @OriginalMember(owner = "client!hr", name = "D", descriptor = "[S")
    private static short[] field4372;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "[[[B")
    public static byte[][][] field4348;

    @OriginalMember(owner = "client!hr", name = "A", descriptor = "[[[Lfk;")
    private static class393[][][] field4369;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lae;)V", line = 4)
    public static final void method2021(class134 arg0) {
        int var1 = field4357 - field4376;
        int var2 = field4363 - field4371;
        int var3 = (field4374 - field4358 << 16) / var1;
        int var4 = (field4373 - field4375 << 16) / var2;
        method2035(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ltq;)V", line = 15)
    public static final void method2022(class376 arg0) {
        field4344 = arg0;
        field4343.method1887(-124);
        int var1 = field4344.method2418("details", (byte) -23);
        int[] var2 = field4344.method2419((byte) 95, var1);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class300 var4 = class389.method2493(-20, var2[var3], var1, field4344);
            field4343.method1886(var4, (long) var4.field4210, 1);
        }
        class69.method395(1089195052, true, false);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lae;II)V", line = 37)
    public static final void method2023(class134 arg0, int arg1, int arg2) {
        class236 var3 = new class236(field4344.method2408(field4345.field4208, "area", -102));
        int var4 = var3.method1574(-77);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method1574(-123);
        }
        int var7 = var3.method1574(-19);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1574(-89);
        }
        while (true) {
            while (var3.field3320 < var3.field3364.length) {
                if (var3.method1574(-54) == 0) {
                    int var22 = var3.method1574(-69);
                    int var23 = var3.method1574(-45);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field4368;
                            int var27 = var23 * 64 + var25 - field4367;
                            method2024(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method1574(-119);
                    int var29 = var3.method1574(-49);
                    int var30 = var3.method1574(-62);
                    int var31 = var3.method1574(-66);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field4368;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field4367;
                            method2024(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field4366 = new byte[field4364 * field4359];
            field4370 = new short[field4364 * field4359];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field4364 * field4359];
                for (int var13 = 0; var13 < field4369[var11].length; var13++) {
                    for (int var19 = 0; var19 < field4369[var11][0].length; var19++) {
                        class393 var20 = field4369[var11][var13][var19];
                        if (var20 != null) {
                            for (class326 var21 = (class326) var20.method2509((byte) 51); var21 != null; var21 = (class326) var20.method2515(0)) {
                                var12[(var19 * 64 + var21.field4632) * field4359 + var13 * 64 + var21.field4634] = (byte) var21.field4629;
                            }
                        }
                    }
                }
                method2028(var12, field4366, field4370, arg1, arg2);
                for (int var14 = 0; var14 < field4369[var11].length; var14++) {
                    for (int var15 = 0; var15 < field4369[var11][0].length; var15++) {
                        class393 var16 = field4369[var11][var14][var15];
                        if (var16 != null) {
                            for (class326 var17 = (class326) var16.method2509((byte) 51); var17 != null; var17 = (class326) var16.method2515(0)) {
                                int var18 = (var15 * 64 + var17.field4632) * field4359 + var14 * 64 + var17.field4634;
                                var17.field4629 = (field4366[var18] & 0xFF) << 16 | field4370[var18] & 0xFFFF;
                                if (var17.field4629 != 0) {
                                    var17.field4629 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method2028(field4360, field4366, field4370, arg1, arg2);
            field4360 = null;
            method2029();
            return;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lae;Ldg;IIII[I[I)V", line = 216)
    private static final void method2024(class134 arg0, class236 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method1574(-80);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method1574(-27);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field4360[field4359 * arg5 + arg4] = (byte) var11;
                    field4365[field4359 * arg5 + arg4] = 0;
                } else {
                    field4365[field4359 * arg5 + arg4] = (byte) var11;
                    field4377[field4359 * arg5 + arg4] = 0;
                    field4360[field4359 * arg5 + arg4] = arg1.method1589(false);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method1574(-109);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method1574(-13);
                var18 = arg1.method1574(-15);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method1574(-88);
            }
            if (var15 == 0) {
                field4360[field4359 * arg5 + arg4] = (byte) var16;
                field4365[field4359 * arg5 + arg4] = (byte) var17;
                field4377[field4359 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field4372[field4359 * arg5 + arg4] = (short) (arg1.method1617((byte) 48) + 1);
                    field4361[field4359 * arg5 + arg4] = arg1.method1589(false);
                } else if (var19 > 1) {
                    field4372[field4359 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method1617((byte) 48);
                        var21[var22] = arg1.method1589(false);
                    }
                    field4356.method1886(new class124(var20, var21), (long) (arg4 << 16 | arg5), 1);
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method1617((byte) 48);
                        var24[var25] = arg1.method1589(false);
                    }
                }
                if (field4369[var15 - 1][arg2 - (field4368 >> 6)][arg3 - (field4367 >> 6)] == null) {
                    field4369[var15 - 1][arg2 - (field4368 >> 6)][arg3 - (field4367 >> 6)] = new class393();
                }
                class326 var26 = new class326(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field4369[var15 - 1][arg2 - (field4368 >> 6)][arg3 - (field4367 >> 6)].method2511(-123, var26);
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(Lae;)Lwq;", line = 351)
    public static final class92 method2025(class134 arg0) {
        int var1 = field4357 - field4376;
        int var2 = field4363 - field4371;
        int var3 = (field4374 - field4358 << 16) / var1;
        int var4 = (field4373 - field4375 << 16) / var2;
        return method2032(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "()V", line = 361)
    public static void method2026() {
        field4345 = null;
        field4344 = null;
        field4343 = null;
        field4348 = null;
        field4352 = null;
        field4349 = null;
        field4353 = null;
        field4346 = null;
        field4362 = null;
        field4360 = null;
        field4366 = null;
        field4370 = null;
        field4365 = null;
        field4377 = null;
        field4372 = null;
        field4361 = null;
        field4356 = null;
        field4369 = null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lul;III)I", line = 384)
    private static final int method2027(class343 arg0, int arg1, int arg2, int arg3) {
        class383 var4 = class181.method1222(arg1, 15610);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field5412;
        if (var5 >= 0 && arg0.method1329((byte) -22, var5).field4766) {
            var5 = -1;
        }
        int var9;
        if (var4.field5404 >= 0) {
            int var6 = var4.field5404;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class113.field1391[class261.method1747(class331.method2132(96, var8, false), (byte) 105) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class113.field1391[class261.method1747(class331.method2132(96, arg0.method1329((byte) -111, var5).field4778, false), (byte) 109) & 0xFFFF] | 0xFF000000;
        } else if (var4.field5400 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field5400;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class113.field1391[class261.method1747(class331.method2132(96, var12, false), (byte) 94) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "([B[B[SII)V", line = 441)
    private static final void method2028(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field4364];
        int[] var6 = new int[field4364];
        int[] var7 = new int[field4364];
        int[] var8 = new int[field4364];
        int[] var9 = new int[field4364];
        for (int var10 = -5; var10 < field4359; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field4364; var13++) {
                int var10002;
                if (var11 < field4359) {
                    int var28 = arg0[field4359 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class36 var29 = class258.method1729(-96, var28 - 1);
                        var5[var13] += var29.field417;
                        var6[var13] += var29.field412;
                        var7[var13] += var29.field414;
                        var8[var13] += var29.field416;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field4359 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class36 var31 = class258.method1729(-63, var30 - 1);
                        var5[var13] -= var31.field417;
                        var6[var13] -= var31.field412;
                        var7[var13] -= var31.field414;
                        var8[var13] -= var31.field416;
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
                for (int var19 = -5; var19 < field4364; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field4364) {
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
                        if ((arg0[field4359 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field4359 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class114.method711(98, var14 * 256 / var17, var15 / var18, var16 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field4359 * var19 + var10;
                            int var27 = class113.field1391[class261.method1747(class219.method1467(21589, var25, 96), (byte) 87) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "()V", line = 586)
    private static final void method2029() {
        for (int var0 = 0; var0 < field4359; var0++) {
            for (int var11 = 0; var11 < field4364; var11++) {
                int var12 = field4372[field4359 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class124 var13 = (class124) field4356.method1888((long) (var0 << 16 | var11), (byte) -30);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field1520.length; var14++) {
                                class88 var15 = class374.method2382(var13.field1520[var14] & 0xFFFF, false);
                                int var16 = var15.field1018;
                                if (var15.field1068 != null) {
                                    class88 var17 = var15.method480(121);
                                    if (var17 != null) {
                                        var16 = var17.field1018;
                                    }
                                }
                                if (var16 != -1) {
                                    class324 var18 = new class324(var16);
                                    var18.field4615 = var0;
                                    var18.field4609 = var11;
                                    field4346.method509((byte) 114, var18);
                                }
                            }
                        }
                    } else {
                        class88 var19 = class374.method2382(var12 - 1, false);
                        int var20 = var19.field1018;
                        if (var19.field1068 != null) {
                            class88 var21 = var19.method480(122);
                            if (var21 != null) {
                                var20 = var21.field1018;
                            }
                        }
                        if (var20 != -1) {
                            class324 var22 = new class324(var20);
                            var22.field4615 = var0;
                            var22.field4609 = var11;
                            field4346.method509((byte) 104, var22);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field4369[0].length; var2++) {
                for (int var3 = 0; var3 < field4369[0][0].length; var3++) {
                    class393 var4 = field4369[var1][var2][var3];
                    if (var4 != null) {
                        for (class326 var5 = (class326) var4.method2509((byte) 51); var5 != null; var5 = (class326) var4.method2515(0)) {
                            if (var5.field4630 != null) {
                                for (int var6 = 0; var6 < var5.field4630.length; var6++) {
                                    class88 var7 = class374.method2382(var5.field4630[var6] & 0xFFFF, false);
                                    int var8 = var7.field1018;
                                    if (var7.field1068 != null) {
                                        class88 var9 = var7.method480(127);
                                        if (var9 != null) {
                                            var8 = var9.field1018;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class324 var10 = new class324(var8);
                                        var10.field4615 = ((field4368 >> 6) + var2) * 64 + var5.field4634 - field4368;
                                        var10.field4609 = ((field4367 >> 6) + var3) * 64 + var5.field4632 - field4367;
                                        field4346.method509((byte) 117, var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V", line = 743)
    public static final void method2030(int arg0) {
        field4345 = (class300) field4343.method1888((long) arg0, (byte) -30);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lae;IIII[S[B)V", line = 747)
    private static final void method2031(class134 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class88 var8 = class374.method2382(arg5[var7] & 0xFFFF, false);
            int var9 = var8.field1075;
            if (var9 != -1) {
                class334 var10 = class162.method1066(var9, 24418);
                class381 var11 = var10.method2163(var8.field1035 ? var8.field1049 : false, arg0, 121, var8.field1025 ? arg6[var7] >> 6 & 0x3 : 0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method762() >> 2;
                    int var13 = arg4 * var11.method761() >> 2;
                    if (var10.field4717) {
                        int var14 = var8.field1008;
                        int var15 = var8.field1029;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field4720 == 0) {
                            var11.method2452(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method752(arg1, arg2 + arg4 - var13, var12, var13, 1, var10.field4720 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lae;IIII)Lwq;", line = 807)
    private static final class92 method2032(class134 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class324 var5 = (class324) field4346.method506((byte) -128); var5 != null; var5 = (class324) field4346.method514(true)) {
            method2033(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field4346;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lae;Lnd;IIII)V", line = 818)
    private static final void method2033(class134 arg0, class324 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field4611 = ((arg1.field4615 - field4376) * arg2 + arg4 >> 16) + field4358;
        arg1.field4616 = field4373 - ((arg1.field4609 - field4371) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lul;II)V", line = 824)
    public static final void method2034(class343 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class50.field593; var3++) {
            field4362[var3 + 1] = method2027(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(Lae;IIII)V", line = 834)
    private static final void method2035(class134 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field4357 - field4376;
        int var6 = field4363 - field4371;
        if (field4357 < field4359) {
            var5++;
        }
        if (field4363 < field4364) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field4358;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field4358;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field4376 + var7;
                if (var52 >= 0 && var52 < field4359) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field4373 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field4373 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field4371 + var53;
                            int var58 = field4359 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field4364) {
                                var59 = (field4366[var58] & 0xFF) << 16 | field4370[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field4365[var58] & 0xFF;
                                var61 = field4372[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field4345.field4193 != -1) {
                                    var62 = field4345.field4193 | 0xFF000000;
                                } else if ((field4376 + var7 & 0x4) == (field4363 + var53 & 0x4)) {
                                    var62 = field4362[class89.field1086 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method653(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method2042(arg0, var49, var54, var51, var56, var59, var60, field4377[var58], (short[]) null, (byte[]) null, true);
                            } else if (var61 == 65535) {
                                class124 var63 = (class124) field4356.method1888((long) (var52 << 16 | var57), (byte) -30);
                                if (var63 != null) {
                                    method2042(arg0, var49, var54, var51, var56, var59, var60, field4377[var58], var63.field1520, var63.field1521, true);
                                }
                            } else {
                                field4352[0] = (short) (var61 - 1);
                                field4349[0] = field4361[var58];
                                method2042(arg0, var49, var54, var51, var56, var59, var60, field4377[var58], field4352, field4349, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field4373 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field4373 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field4345.field4193 != -1) {
                            var68 = field4345.field4193 | 0xFF000000;
                        } else if ((field4376 + var7 & 0x4) == (field4363 + var64 & 0x4)) {
                            var68 = field4362[class89.field1086 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method653(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field4358;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field4358;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field4376 + var8;
                if (var41 >= 0 && var41 < field4359) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field4373 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field4373 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field4371 + var42;
                            if (var46 >= 0 && var46 < field4364) {
                                int var47 = field4372[field4359 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method2031(arg0, var38, var43, var40, var45, (short[]) null, (byte[]) null);
                                } else if (var47 == 65535) {
                                    class124 var48 = (class124) field4356.method1888((long) (var41 << 16 | var46), (byte) -30);
                                    if (var48 != null) {
                                        method2031(arg0, var38, var43, var40, var45, var48.field1520, var48.field1521);
                                    }
                                } else {
                                    field4352[0] = (short) (var47 - 1);
                                    field4349[0] = field4361[field4359 * var46 + var41];
                                    method2031(arg0, var38, var43, var40, var45, field4352, field4349);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field4376 >> 6;
        int var10 = field4371 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field4357 >> 6;
        int var12 = field4363 >> 6;
        if (var11 >= field4369[0].length) {
            var11 = field4369[0].length - 1;
        }
        if (var12 >= field4369[0][0].length) {
            var12 = field4369[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class393 var28 = field4369[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field4368 >> 6) + var14) * 64;
                        int var30 = ((field4367 >> 6) + var27) * 64;
                        for (class326 var31 = (class326) var28.method2509((byte) 51); var31 != null; var31 = (class326) var28.method2515(0)) {
                            int var32 = var31.field4634 + var29 - field4368 - field4376;
                            int var33 = var31.field4632 + var30 - field4367 - field4371;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field4358;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field4358;
                            int var36 = field4373 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field4373 - (arg2 * var33 + arg4 >> 16);
                            method2042(arg0, var34, var36, var35 - var34, var37 - var36, var31.field4629, var31.field4633 & 0xFF, var31.field4628, var31.field4630, var31.field4631, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class393 var17 = field4369[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field4368 >> 6) + var15) * 64;
                        int var19 = ((field4367 >> 6) + var16) * 64;
                        for (class326 var20 = (class326) var17.method2509((byte) 51); var20 != null; var20 = (class326) var17.method2515(0)) {
                            int var21 = var20.field4634 + var18 - field4368 - field4376;
                            int var22 = var20.field4632 + var19 - field4367 - field4371;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field4358;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field4358;
                            int var25 = field4373 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field4373 - (arg2 * var22 + arg4 >> 16);
                            method2031(arg0, var23, var25, var24 - var23, var26 - var25, var20.field4630, var20.field4631);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIIIII)V", line = 1176)
    public static final void method2036(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4376 = arg0 - field4368;
        field4363 = arg1 - field4367;
        field4357 = arg2 - field4368;
        field4371 = arg3 - field4367;
        field4358 = arg4;
        field4375 = arg5;
        field4374 = arg6;
        field4373 = arg7;
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "()V", line = 1186)
    public static final void method2037() {
        field4360 = new byte[field4364 * field4359];
        field4365 = new byte[field4364 * field4359];
        field4377 = new byte[field4364 * field4359];
        field4372 = new short[field4364 * field4359];
        field4361 = new byte[field4364 * field4359];
        field4356 = new class288(1024);
        field4369 = new class393[3][field4359 >> 6][field4364 >> 6];
        field4362 = new int[class50.field593 + 1];
    }

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "()V", line = 1197)
    public static final void method2038() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field4353.field3253; var1++) {
            boolean var2 = field4345.method1980(0, field4353.field3248[var1] & 0x3FFF, field4353.field3248[var1] >> 14 & 0x3FFF, field4353.field3248[var1] >> 28 & 0x3, var0);
            if (var2) {
                class324 var3 = new class324(field4353.field3250[var1]);
                var3.field4615 = var0[1] - field4368;
                var3.field4609 = var0[2] - field4367;
                field4346.method509((byte) 115, var3);
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "()V", line = 1219)
    public static final void method2039() {
        field4360 = null;
        field4366 = null;
        field4370 = null;
        field4365 = null;
        field4377 = null;
        field4372 = null;
        field4361 = null;
        field4356 = null;
        field4369 = null;
        field4362 = null;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)Lgq;", line = 1231)
    public static final class300 method2040(int arg0) {
        return (class300) field4343.method1888((long) arg0, (byte) -30);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)Lek;", line = 1236)
    public static final class295 method2041(int arg0, int arg1) {
        class295 var2 = new class295();
        for (class300 var3 = (class300) field4343.method1884(0); var3 != null; var3 = (class300) field4343.method1890(-1)) {
            if (var3.field4194 && var3.method1977(arg0, 12800, arg1)) {
                var2.method1950(108, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lae;IIIIIII[S[BZ)V", line = 1256)
    private static final void method2042(class134 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method653(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field4362[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method653(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class20.method154(arg5, field4354, var12, arg1, arg4, field4362[arg6], var11, arg0, field4348, (byte) 119, arg7 >> 6 & 0x3, arg2, arg3);
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
                class88 var18 = class374.method2382(arg8[var16] & 0xFFFF, false);
                if (var18.field1075 == -1) {
                    int var19 = -3355444;
                    if (var18.field998 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method643(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method658(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method643(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method658(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method643(arg1, arg2, arg4, -1, 0);
                            arg0.method658(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method643(var14, arg2, arg4, -1, 0);
                            arg0.method658(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method643(var14, arg2, arg4, -1, 0);
                            arg0.method658(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method643(arg1, arg2, arg4, -1, 0);
                            arg0.method658(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method658(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method658(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method658(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method658(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method658(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method658(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(II)Lgq;", line = 1455)
    public static final class300 method2043(int arg0, int arg1) {
        for (class300 var2 = (class300) field4343.method1884(0); var2 != null; var2 = (class300) field4343.method1890(-1)) {
            if (var2.field4194 && var2.method1977(arg0, 12800, arg1)) {
                return var2;
            }
        }
        return null;
    }
}
