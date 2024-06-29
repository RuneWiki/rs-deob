import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class542 {

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "Lmp;")
    private static class758 field7612 = new class758(16);

    @OriginalMember(owner = "client!kga", name = "j", descriptor = "I")
    public static int field7620 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!kga", name = "o", descriptor = "[S")
    private static short[] field7625 = new short[1];

    @OriginalMember(owner = "client!kga", name = "s", descriptor = "[B")
    private static byte[] field7629 = new byte[1];

    @OriginalMember(owner = "client!kga", name = "q", descriptor = "I")
    public static int field7627 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!kga", name = "p", descriptor = "Lnt;")
    public static class220 field7626 = new class220();

    @OriginalMember(owner = "client!kga", name = "m", descriptor = "F")
    public static float field7623;

    @OriginalMember(owner = "client!kga", name = "r", descriptor = "F")
    public static float field7628;

    @OriginalMember(owner = "client!kga", name = "k", descriptor = "I")
    public static int field7621;

    @OriginalMember(owner = "client!kga", name = "v", descriptor = "I")
    public static int field7632;

    @OriginalMember(owner = "client!kga", name = "x", descriptor = "I")
    public static int field7634;

    @OriginalMember(owner = "client!kga", name = "y", descriptor = "I")
    public static int field7635;

    @OriginalMember(owner = "client!kga", name = "z", descriptor = "I")
    public static int field7636;

    @OriginalMember(owner = "client!kga", name = "B", descriptor = "I")
    public static int field7638;

    @OriginalMember(owner = "client!kga", name = "C", descriptor = "I")
    public static int field7639;

    @OriginalMember(owner = "client!kga", name = "E", descriptor = "I")
    public static int field7641;

    @OriginalMember(owner = "client!kga", name = "H", descriptor = "I")
    public static int field7644;

    @OriginalMember(owner = "client!kga", name = "J", descriptor = "I")
    public static int field7646;

    @OriginalMember(owner = "client!kga", name = "K", descriptor = "I")
    public static int field7647;

    @OriginalMember(owner = "client!kga", name = "L", descriptor = "I")
    public static int field7648;

    @OriginalMember(owner = "client!kga", name = "O", descriptor = "I")
    public static int field7651;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "Leq;")
    public static class209 field7611;

    @OriginalMember(owner = "client!kga", name = "e", descriptor = "Lqo;")
    public static class22 field7615;

    @OriginalMember(owner = "client!kga", name = "g", descriptor = "Lah;")
    private static class382 field7617;

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "Los;")
    public static class440 field7614;

    @OriginalMember(owner = "client!kga", name = "h", descriptor = "Ldl;")
    private static class62 field7618;

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "Lcp;")
    public static class721 field7613;

    @OriginalMember(owner = "client!kga", name = "i", descriptor = "Lsha;")
    public static class725 field7619;

    @OriginalMember(owner = "client!kga", name = "n", descriptor = "Lsw;")
    public static class752 field7624;

    @OriginalMember(owner = "client!kga", name = "G", descriptor = "Lmp;")
    private static class758 field7643;

    @OriginalMember(owner = "client!kga", name = "f", descriptor = "Lgv;")
    public static class81 field7616;

    @OriginalMember(owner = "client!kga", name = "w", descriptor = "[B")
    private static byte[] field7633;

    @OriginalMember(owner = "client!kga", name = "A", descriptor = "[B")
    private static byte[] field7637;

    @OriginalMember(owner = "client!kga", name = "D", descriptor = "[B")
    private static byte[] field7640;

    @OriginalMember(owner = "client!kga", name = "I", descriptor = "[B")
    private static byte[] field7645;

    @OriginalMember(owner = "client!kga", name = "N", descriptor = "[B")
    private static byte[] field7650;

    @OriginalMember(owner = "client!kga", name = "F", descriptor = "[I")
    private static int[] field7642;

    @OriginalMember(owner = "client!kga", name = "t", descriptor = "[S")
    private static short[] field7630;

    @OriginalMember(owner = "client!kga", name = "M", descriptor = "[S")
    private static short[] field7649;

    @OriginalMember(owner = "client!kga", name = "l", descriptor = "[[[B")
    public static byte[][][] field7622;

    @OriginalMember(owner = "client!kga", name = "u", descriptor = "[[[Lhda;")
    private static class747[][][] field7631;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(II)Ljh;", line = 4)
    public static final class158 method3187(int arg0, int arg1) {
        class158 var2 = new class158();
        for (class725 var3 = (class725) field7612.method4209(false); var3 != null; var3 = (class725) field7612.method4207(9356)) {
            if (var3.field10153 && var3.method4032(arg0, (byte) 97, arg1)) {
                var2.method1203(var3, -101);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "()V", line = 22)
    private static final void method3188() {
        for (int var0 = 0; var0 < field7639; var0++) {
            for (int var11 = 0; var11 < field7636; var11++) {
                int var12 = field7649[field7639 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class614 var13 = (class614) field7643.method4203(true, (long) (var0 << 16 | var11));
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field8877.length; var14++) {
                                class414 var15 = field7615.method131(2, var13.field8877[var14] & 0xFFFF);
                                int var16 = var15.field5712;
                                if (var15.field5720 != null) {
                                    class414 var17 = var15.method2513(field7613, true);
                                    if (var17 != null) {
                                        var16 = var17.field5712;
                                    }
                                }
                                if (var16 != -1) {
                                    class541 var18 = new class541(var16);
                                    var18.field7597 = var0;
                                    var18.field7601 = var11;
                                    field7626.method1526(var18, 122);
                                }
                            }
                        }
                    } else {
                        class414 var19 = field7615.method131(2, var12 - 1);
                        int var20 = var19.field5712;
                        if (var19.field5720 != null) {
                            class414 var21 = var19.method2513(field7613, true);
                            if (var21 != null) {
                                var20 = var21.field5712;
                            }
                        }
                        if (var20 != -1) {
                            class541 var22 = new class541(var20);
                            var22.field7597 = var0;
                            var22.field7601 = var11;
                            field7626.method1526(var22, -109);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field7631[0].length; var2++) {
                for (int var3 = 0; var3 < field7631[0][0].length; var3++) {
                    class747 var4 = field7631[var1][var2][var3];
                    if (var4 != null) {
                        for (class161 var5 = (class161) var4.method4159(0); var5 != null; var5 = (class161) var4.method4151(7)) {
                            if (var5.field2395 != null) {
                                for (int var6 = 0; var6 < var5.field2395.length; var6++) {
                                    class414 var7 = field7615.method131(2, var5.field2395[var6] & 0xFFFF);
                                    int var8 = var7.field5712;
                                    if (var7.field5720 != null) {
                                        class414 var9 = var7.method2513(field7613, true);
                                        if (var9 != null) {
                                            var8 = var9.field5712;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class541 var10 = new class541(var8);
                                        var10.field7597 = ((field7632 >> 6) + var2) * 64 + var5.field2391 - field7632;
                                        var10.field7601 = ((field7644 >> 6) + var3) * 64 + var5.field2396 - field7644;
                                        field7626.method1526(var10, 127);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lha;)V", line = 180)
    public static final void method3189(class58 arg0) {
        int var1 = field7638 - field7648;
        int var2 = field7635 - field7634;
        int var3 = (field7646 - field7651 << 16) / var1;
        int var4 = (field7641 - field7647 << 16) / var2;
        method3207(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lha;Lnd;Lfd;)V", line = 190)
    public static final void method3190(class58 arg0, class541 arg1, class524 arg2) {
        if (arg2.field7440 == null) {
            return;
        }
        int[] var3 = new int[arg2.field7440.length];
        for (int var4 = 0; var4 < var3.length / 2; var4++) {
            int var21 = arg2.field7440[var4 * 2] + arg1.field7597;
            int var22 = arg2.field7440[var4 * 2 + 1] + arg1.field7601;
            var3[var4 * 2] = (field7646 - field7651) * (var21 - field7648) / (field7638 - field7648) + field7651;
            var3[var4 * 2 + 1] = field7641 - (field7641 - field7647) * (var22 - field7634) / (field7635 - field7634);
        }
        class207.method1439(arg0, var3, arg2.field7430);
        if (arg2.field7417 > 0) {
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
                arg0.method647(var13, var14, var15, var16, arg2.field7421[arg2.field7438[var5] & 0xFF], 1, arg2.field7417, arg2.field7450, arg2.field7416);
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
            arg0.method647(var6, var7, var8, var9, arg2.field7421[arg2.field7438[arg2.field7438.length - 1] & 0xFF], 1, arg2.field7417, arg2.field7450, arg2.field7416);
            return;
        }
        for (int var20 = 0; var20 < var3.length / 2 - 1; var20++) {
            arg0.method629(var3[(var20 + 1) * 2 + 1], false, var3[(var20 + 1) * 2], var3[var20 * 2], arg2.field7421[arg2.field7438[var20] & 0xFF], var3[var20 * 2 + 1]);
        }
        arg0.method629(var3[1], false, var3[0], var3[var3.length - 2], arg2.field7421[arg2.field7438[arg2.field7438.length - 1] & 0xFF], var3[var3.length - 1]);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)Lsha;", line = 298)
    public static final class725 method3191(int arg0) {
        return (class725) field7612.method4203(true, (long) arg0);
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(Lha;)Lnt;", line = 303)
    public static final class220 method3192(class58 arg0) {
        int var1 = field7638 - field7648;
        int var2 = field7635 - field7634;
        int var3 = (field7646 - field7651 << 16) / var1;
        int var4 = (field7641 - field7647 << 16) / var2;
        return method3205(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(I)V", line = 313)
    public static final void method3193(int arg0) {
        field7619 = (class725) field7612.method4203(true, (long) arg0);
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "()V", line = 317)
    public static final void method3194() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field7624.field10481; var1++) {
            boolean var2 = field7619.method4037(field7624.field10479[var1] >> 14 & 0x3FFF, field7624.field10479[var1] >> 28 & 0x3, 12800, var0, field7624.field10479[var1] & 0x3FFF);
            if (var2) {
                class541 var3 = new class541(field7624.field10480[var1]);
                var3.field7597 = var0[1] - field7632;
                var3.field7601 = var0[2] - field7644;
                field7626.method1526(var3, 103);
            }
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Ld;III)I", line = 339)
    private static final int method3195(class149 arg0, int arg1, int arg2, int arg3) {
        class569 var4 = field7618.method675(arg1, 4);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field8099;
        if (var5 >= 0 && arg0.method1154(-126, var5).field7705) {
            var5 = -1;
        }
        int var9;
        if (var4.field8105 >= 0) {
            int var6 = var4.field8105;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class428.field5989[class440.method2643((byte) -101, class283.method1850((byte) 107, var8, 96)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class428.field5989[class440.method2643((byte) -101, class283.method1850((byte) -32, arg0.method1154(-119, var5).field7703, 96)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field8093 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field8093;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class428.field5989[class440.method2643((byte) -101, class283.method1850((byte) 89, var12, 96)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lha;IIII[S[B)V", line = 396)
    private static final void method3196(class58 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class414 var8 = field7615.method131(2, arg5[var7] & 0xFFFF);
            int var9 = var8.field5755;
            if (var9 != -1) {
                class720 var10 = field7616.method797(var9, false);
                class743 var11 = var10.method4014(var8.field5787 ? arg6[var7] >> 6 & 0x3 : 0, 82, arg0, var8.field5780 ? var8.field5733 : false);
                if (var11 != null) {
                    int var12 = arg3 * var11.method82() >> 2;
                    int var13 = arg4 * var11.method83() >> 2;
                    if (var10.field10078) {
                        int var14 = var8.field5800;
                        int var15 = var8.field5732;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field10081 == 0) {
                            var11.method4136(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method4143(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field10081 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lha;Lud;IIII[I[I)V", line = 458)
    private static final void method3197(class58 arg0, class35 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method273(255);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method273(255);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field7633[field7639 * arg5 + arg4] = (byte) var11;
                    field7637[field7639 * arg5 + arg4] = 0;
                } else {
                    field7637[field7639 * arg5 + arg4] = (byte) var11;
                    field7650[field7639 * arg5 + arg4] = 0;
                    field7633[field7639 * arg5 + arg4] = arg1.method277((byte) 87);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method273(255);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method273(255);
                var18 = arg1.method273(255);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method273(255);
            }
            if (var15 == 0) {
                field7633[field7639 * arg5 + arg4] = (byte) var16;
                field7637[field7639 * arg5 + arg4] = (byte) var17;
                field7650[field7639 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field7649[field7639 * arg5 + arg4] = (short) (arg1.method253(-13900) + 1);
                    field7645[field7639 * arg5 + arg4] = arg1.method277((byte) -118);
                } else if (var19 > 1) {
                    field7649[field7639 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method253(-13900);
                        var21[var22] = arg1.method277((byte) 78);
                    }
                    field7643.method4211(new class614(var20, var21), (byte) 126, (long) (arg4 << 16 | arg5));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method253(-13900);
                        var24[var25] = arg1.method277((byte) -125);
                    }
                }
                if (field7631[var15 - 1][arg2 - (field7632 >> 6)][arg3 - (field7644 >> 6)] == null) {
                    field7631[var15 - 1][arg2 - (field7632 >> 6)][arg3 - (field7644 >> 6)] = new class747();
                }
                class161 var26 = new class161(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field7631[var15 - 1][arg2 - (field7632 >> 6)][arg3 - (field7644 >> 6)].method4152(var26, 0);
            }
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIIIIII)V", line = 593)
    public static final void method3198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7648 = arg0 - field7632;
        field7635 = arg1 - field7644;
        field7638 = arg2 - field7632;
        field7634 = arg3 - field7644;
        field7651 = arg4;
        field7647 = arg5;
        field7646 = arg6;
        field7641 = arg7;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "([B[B[SII)V", line = 604)
    private static final void method3199(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field7636];
        int[] var6 = new int[field7636];
        int[] var7 = new int[field7636];
        int[] var8 = new int[field7636];
        int[] var9 = new int[field7636];
        for (int var10 = -5; var10 < field7639; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field7636; var13++) {
                int var10002;
                if (var11 < field7639) {
                    int var28 = arg0[field7639 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class406 var29 = field7617.method2400(false, var28 - 1);
                        var5[var13] += var29.field5658;
                        var6[var13] += var29.field5659;
                        var7[var13] += var29.field5662;
                        var8[var13] += var29.field5664;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field7639 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class406 var31 = field7617.method2400(false, var30 - 1);
                        var5[var13] -= var31.field5658;
                        var6[var13] -= var31.field5659;
                        var7[var13] -= var31.field5662;
                        var8[var13] -= var31.field5664;
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
                for (int var19 = -5; var19 < field7636; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field7636) {
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
                        if ((arg0[field7639 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field7639 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class339.method2155(-126, var16 / var18, var14 * 256 / var17, var15 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field7639 * var19 + var10;
                            int var27 = class428.field5989[class440.method2643((byte) -101, class417.method2546(96, var25, 0)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "()V", line = 747)
    public static final void method3200() {
        field7633 = new byte[field7639 * field7636];
        field7637 = new byte[field7639 * field7636];
        field7650 = new byte[field7639 * field7636];
        field7649 = new short[field7639 * field7636];
        field7645 = new byte[field7639 * field7636];
        field7643 = new class758(1024);
        field7631 = new class747[3][field7639 >> 6][field7636 >> 6];
        field7642 = new int[field7618.field1124 + 1];
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Ld;II)V", line = 759)
    public static final void method3201(class149 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field7618.field1124; var3++) {
            field7642[var3 + 1] = method3195(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "()V", line = 769)
    public static void method3202() {
        field7618 = null;
        field7617 = null;
        field7615 = null;
        field7614 = null;
        field7616 = null;
        field7613 = null;
        field7619 = null;
        field7611 = null;
        field7612 = null;
        field7622 = null;
        field7625 = null;
        field7629 = null;
        field7624 = null;
        field7626 = null;
        field7642 = null;
        field7633 = null;
        field7640 = null;
        field7630 = null;
        field7637 = null;
        field7650 = null;
        field7649 = null;
        field7645 = null;
        field7643 = null;
        field7631 = null;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lha;Lnd;IIII)V", line = 796)
    private static final void method3203(class58 arg0, class541 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field7606 = ((arg1.field7597 - field7648) * arg2 + arg4 >> 16) + field7651;
        arg1.field7602 = field7641 - ((arg1.field7601 - field7634) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Leq;Ldl;Lah;Lqo;Los;Lgv;Lcp;)V", line = 800)
    public static final void method3204(class209 arg0, class62 arg1, class382 arg2, class22 arg3, class440 arg4, class81 arg5, class721 arg6) {
        field7611 = arg0;
        field7618 = arg1;
        field7617 = arg2;
        field7615 = arg3;
        field7614 = arg4;
        field7616 = arg5;
        field7613 = arg6;
        field7612.method4204((byte) -61);
        int var7 = field7611.method1482(-1, "details");
        int[] var8 = field7611.method1479(var7, -102);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class725 var10 = class693.method3896(field7611, var7, var8[var9], 591);
                field7612.method4211(var10, (byte) 78, (long) var10.field10143);
            }
        }
        class419.method2564(true, -63, false);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lha;IIII)Lnt;", line = 835)
    private static final class220 method3205(class58 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class541 var5 = (class541) field7626.method1522(true); var5 != null; var5 = (class541) field7626.method1527((byte) 88)) {
            method3203(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field7626;
    }

    @OriginalMember(owner = "client!kga", name = "e", descriptor = "()V", line = 846)
    public static final void method3206() {
        field7633 = null;
        field7640 = null;
        field7630 = null;
        field7637 = null;
        field7650 = null;
        field7649 = null;
        field7645 = null;
        field7643 = null;
        field7631 = null;
        field7642 = null;
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(Lha;IIII)V", line = 861)
    private static final void method3207(class58 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field7638 - field7648;
        int var6 = field7635 - field7634;
        if (field7638 < field7639) {
            var5++;
        }
        if (field7635 < field7636) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field7651;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field7651;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field7648 + var7;
                if (var52 >= 0 && var52 < field7639) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field7641 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field7641 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field7634 + var53;
                            int var58 = field7639 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field7636) {
                                var59 = (field7640[var58] & 0xFF) << 16 | field7630[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field7637[var58] & 0xFF;
                                var61 = field7649[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field7619.field10141 != -1) {
                                    var62 = field7619.field10141 | 0xFF000000;
                                } else if ((field7648 + var7 & 0x4) == (field7635 + var53 & 0x4)) {
                                    var62 = field7642[field7618.field1137 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method630(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method3208(arg0, var49, var54, var51, var56, var59, var60, field7650[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class614 var63 = (class614) field7643.method4203(true, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method3208(arg0, var49, var54, var51, var56, var59, var60, field7650[var58], var63.field8877, var63.field8876, true);
                                }
                            } else {
                                field7625[0] = (short) (var61 - 1);
                                field7629[0] = field7645[var58];
                                method3208(arg0, var49, var54, var51, var56, var59, var60, field7650[var58], field7625, field7629, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field7641 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field7641 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field7619.field10141 != -1) {
                            var68 = field7619.field10141 | 0xFF000000;
                        } else if ((field7648 + var7 & 0x4) == (field7635 + var64 & 0x4)) {
                            var68 = field7642[field7618.field1137 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method630(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field7651;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field7651;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field7648 + var8;
                if (var41 >= 0 && var41 < field7639) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field7641 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field7641 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field7634 + var42;
                            if (var46 >= 0 && var46 < field7636) {
                                int var47 = field7649[field7639 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method3196(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class614 var48 = (class614) field7643.method4203(true, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method3196(arg0, var38, var43, var40, var45, var48.field8877, var48.field8876);
                                    }
                                } else {
                                    field7625[0] = (short) (var47 - 1);
                                    field7629[0] = field7645[field7639 * var46 + var41];
                                    method3196(arg0, var38, var43, var40, var45, field7625, field7629);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field7648 >> 6;
        int var10 = field7634 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field7638 >> 6;
        int var12 = field7635 >> 6;
        if (var11 >= field7631[0].length) {
            var11 = field7631[0].length - 1;
        }
        if (var12 >= field7631[0][0].length) {
            var12 = field7631[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class747 var28 = field7631[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field7632 >> 6) + var14) * 64;
                        int var30 = ((field7644 >> 6) + var27) * 64;
                        for (class161 var31 = (class161) var28.method4159(0); var31 != null; var31 = (class161) var28.method4151(7)) {
                            int var32 = var31.field2391 + var29 - field7632 - field7648;
                            int var33 = var31.field2396 + var30 - field7644 - field7634;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field7651;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field7651;
                            int var36 = field7641 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field7641 - (arg2 * var33 + arg4 >> 16);
                            method3208(arg0, var34, var36, var35 - var34, var37 - var36, var31.field2397, var31.field2392 & 0xFF, var31.field2394, var31.field2395, var31.field2393, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class747 var17 = field7631[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field7632 >> 6) + var15) * 64;
                        int var19 = ((field7644 >> 6) + var16) * 64;
                        for (class161 var20 = (class161) var17.method4159(0); var20 != null; var20 = (class161) var17.method4151(7)) {
                            int var21 = var20.field2391 + var18 - field7632 - field7648;
                            int var22 = var20.field2396 + var19 - field7644 - field7634;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field7651;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field7651;
                            int var25 = field7641 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field7641 - (arg2 * var22 + arg4 >> 16);
                            method3196(arg0, var23, var25, var24 - var23, var26 - var25, var20.field2395, var20.field2393);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lha;IIIIIII[S[BZ)V", line = 1203)
    private static final void method3208(class58 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method630(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field7642[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method630(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class377.method2363(arg2, arg7 >> 6 & 0x3, arg3, arg5, 1, arg4, arg0, field7642[arg6], field7621, var11, var12, arg1, field7622);
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
                class414 var18 = field7615.method131(2, arg8[var16] & 0xFFFF);
                if (var18.field5755 == -1) {
                    int var19 = -3355444;
                    if (var18.field5737 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method541(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method528(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method541(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method528(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method541(arg1, arg2, arg4, -1, 0);
                            arg0.method528(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method541(var14, arg2, arg4, -1, 0);
                            arg0.method528(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method541(var14, arg2, arg4, -1, 0);
                            arg0.method528(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method541(arg1, arg2, arg4, -1, 0);
                            arg0.method528(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method528(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method528(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method528(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method528(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method528(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method528(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(II)Lsha;", line = 1366)
    public static final class725 method3209(int arg0, int arg1) {
        for (class725 var2 = (class725) field7612.method4209(false); var2 != null; var2 = (class725) field7612.method4207(9356)) {
            if (var2.field10153 && var2.method4032(arg0, (byte) 40, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lha;II)V", line = 1393)
    public static final void method3210(class58 arg0, int arg1, int arg2) {
        class35 var3 = new class35(field7611.method1475("area", (byte) 116, field7619.field10148));
        int var4 = var3.method273(255);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method273(255);
        }
        int var7 = var3.method273(255);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method273(255);
        }
        while (true) {
            while (var3.field469 < var3.field483.length) {
                if (var3.method273(255) == 0) {
                    int var22 = var3.method273(255);
                    int var23 = var3.method273(255);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field7632;
                            int var27 = var23 * 64 + var25 - field7644;
                            method3197(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method273(255);
                    int var29 = var3.method273(255);
                    int var30 = var3.method273(255);
                    int var31 = var3.method273(255);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field7632;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field7644;
                            method3197(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field7640 = new byte[field7639 * field7636];
            field7630 = new short[field7639 * field7636];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field7639 * field7636];
                for (int var13 = 0; var13 < field7631[var11].length; var13++) {
                    for (int var19 = 0; var19 < field7631[var11][0].length; var19++) {
                        class747 var20 = field7631[var11][var13][var19];
                        if (var20 != null) {
                            for (class161 var21 = (class161) var20.method4159(0); var21 != null; var21 = (class161) var20.method4151(7)) {
                                var12[(var19 * 64 + var21.field2396) * field7639 + var13 * 64 + var21.field2391] = (byte) var21.field2397;
                            }
                        }
                    }
                }
                method3199(var12, field7640, field7630, arg1, arg2);
                for (int var14 = 0; var14 < field7631[var11].length; var14++) {
                    for (int var15 = 0; var15 < field7631[var11][0].length; var15++) {
                        class747 var16 = field7631[var11][var14][var15];
                        if (var16 != null) {
                            for (class161 var17 = (class161) var16.method4159(0); var17 != null; var17 = (class161) var16.method4151(7)) {
                                int var18 = (var15 * 64 + var17.field2396) * field7639 + var14 * 64 + var17.field2391;
                                var17.field2397 = (field7640[var18] & 0xFF) << 16 | field7630[var18] & 0xFFFF;
                                if (var17.field2397 != 0) {
                                    var17.field2397 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method3199(field7633, field7640, field7630, arg1, arg2);
            field7633 = null;
            method3188();
            return;
        }
    }
}
