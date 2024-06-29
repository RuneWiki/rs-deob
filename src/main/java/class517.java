import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class517 extends class373 {

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "I")
    private int field7529 = 0;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "Z")
    private boolean field7523 = true;

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "I")
    private int field7534 = 0;

    @OriginalMember(owner = "client!pg", name = "Fb", descriptor = "I")
    private int field7584 = 0;

    @OriginalMember(owner = "client!pg", name = "Mb", descriptor = "I")
    private int field7591 = 0;

    @OriginalMember(owner = "client!pg", name = "Nb", descriptor = "Z")
    private boolean field7592 = false;

    @OriginalMember(owner = "client!pg", name = "qc", descriptor = "I")
    private int field7621 = 0;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "Lur;")
    private class377 field7521;

    @OriginalMember(owner = "client!pg", name = "Xb", descriptor = "Ltp;")
    private class374 field7602;

    @OriginalMember(owner = "client!pg", name = "fc", descriptor = "Ltp;")
    private class374 field7610;

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "Ltp;")
    private class374 field7526;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "Ltp;")
    private class374 field7518;

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "Loc;")
    private class138 field7525;

    @OriginalMember(owner = "client!pg", name = "ic", descriptor = "I")
    private int field7613;

    @OriginalMember(owner = "client!pg", name = "kc", descriptor = "I")
    private int field7615;

    @OriginalMember(owner = "client!pg", name = "zb", descriptor = "[I")
    private int[] field7578;

    @OriginalMember(owner = "client!pg", name = "nb", descriptor = "[I")
    private int[] field7566;

    @OriginalMember(owner = "client!pg", name = "Q", descriptor = "[I")
    private int[] field7543;

    @OriginalMember(owner = "client!pg", name = "rc", descriptor = "[I")
    private int[] field7622;

    @OriginalMember(owner = "client!pg", name = "cb", descriptor = "[S")
    private short[] field7555;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "[Lop;")
    private class127[] field7519;

    @OriginalMember(owner = "client!pg", name = "wb", descriptor = "[Lsu;")
    private class142[] field7575;

    @OriginalMember(owner = "client!pg", name = "Db", descriptor = "I")
    private int field7582;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "[Lce;")
    private class204[] field7524;

    @OriginalMember(owner = "client!pg", name = "oc", descriptor = "[Lgn;")
    private class497[] field7619;

    @OriginalMember(owner = "client!pg", name = "Hb", descriptor = "S")
    private short field7586;

    @OriginalMember(owner = "client!pg", name = "hc", descriptor = "[S")
    private short[] field7612;

    @OriginalMember(owner = "client!pg", name = "vb", descriptor = "[S")
    private short[] field7574;

    @OriginalMember(owner = "client!pg", name = "jc", descriptor = "[S")
    private short[] field7614;

    @OriginalMember(owner = "client!pg", name = "Qb", descriptor = "[S")
    private short[] field7595;

    @OriginalMember(owner = "client!pg", name = "Sb", descriptor = "[S")
    private short[] field7597;

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "[F")
    private float[] field7528;

    @OriginalMember(owner = "client!pg", name = "ib", descriptor = "S")
    private short field7561;

    @OriginalMember(owner = "client!pg", name = "tb", descriptor = "[S")
    private short[] field7572;

    @OriginalMember(owner = "client!pg", name = "db", descriptor = "[B")
    private byte[] field7556;

    @OriginalMember(owner = "client!pg", name = "bb", descriptor = "[B")
    private byte[] field7554;

    @OriginalMember(owner = "client!pg", name = "pc", descriptor = "[S")
    private short[] field7620;

    @OriginalMember(owner = "client!pg", name = "Eb", descriptor = "[S")
    private short[] field7583;

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "[S")
    private short[] field7532;

    @OriginalMember(owner = "client!pg", name = "S", descriptor = "[S")
    private short[] field7545;

    @OriginalMember(owner = "client!pg", name = "L", descriptor = "[F")
    private float[] field7538;

    @OriginalMember(owner = "client!pg", name = "hb", descriptor = "[I")
    private int[] field7560;

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "[[I")
    private int[][] field7530;

    @OriginalMember(owner = "client!pg", name = "ab", descriptor = "[[I")
    private int[][] field7553;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "[[I")
    private int[][] field7520;

    @OriginalMember(owner = "client!pg", name = "Cb", descriptor = "Ljc;")
    public static class305 field7581 = new class305("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!pg", name = "uc", descriptor = "Lwq;")
    public static class115 field7625 = new class115(4, 3);

    @OriginalMember(owner = "client!pg", name = "vc", descriptor = "Lwq;")
    public static class115 field7626 = new class115(1, 5);

    @OriginalMember(owner = "client!pg", name = "xc", descriptor = "[B")
    public static byte[] field7628;

    @OriginalMember(owner = "client!pg", name = "ob", descriptor = "B")
    private byte field7567;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public static int field7514;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public static int field7515;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public static int field7516;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public static int field7517;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public static int field7522;

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
    public static int field7527;

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "I")
    public static int field7531;

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "I")
    public static int field7537;

    @OriginalMember(owner = "client!pg", name = "M", descriptor = "I")
    public static int field7539;

    @OriginalMember(owner = "client!pg", name = "N", descriptor = "I")
    public static int field7540;

    @OriginalMember(owner = "client!pg", name = "O", descriptor = "I")
    public static int field7541;

    @OriginalMember(owner = "client!pg", name = "P", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!pg", name = "R", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!pg", name = "T", descriptor = "I")
    public static int field7546;

    @OriginalMember(owner = "client!pg", name = "U", descriptor = "I")
    public static int field7547;

    @OriginalMember(owner = "client!pg", name = "V", descriptor = "I")
    public static int field7548;

    @OriginalMember(owner = "client!pg", name = "W", descriptor = "I")
    public static int field7549;

    @OriginalMember(owner = "client!pg", name = "X", descriptor = "I")
    public static int field7550;

    @OriginalMember(owner = "client!pg", name = "Z", descriptor = "I")
    public static int field7552;

    @OriginalMember(owner = "client!pg", name = "eb", descriptor = "I")
    public static int field7557;

    @OriginalMember(owner = "client!pg", name = "fb", descriptor = "I")
    public static int field7558;

    @OriginalMember(owner = "client!pg", name = "gb", descriptor = "I")
    public static int field7559;

    @OriginalMember(owner = "client!pg", name = "jb", descriptor = "I")
    public static int field7562;

    @OriginalMember(owner = "client!pg", name = "kb", descriptor = "I")
    public static int field7563;

    @OriginalMember(owner = "client!pg", name = "lb", descriptor = "I")
    public static int field7564;

    @OriginalMember(owner = "client!pg", name = "mb", descriptor = "I")
    public static int field7565;

    @OriginalMember(owner = "client!pg", name = "pb", descriptor = "I")
    public static int field7568;

    @OriginalMember(owner = "client!pg", name = "qb", descriptor = "I")
    public static int field7569;

    @OriginalMember(owner = "client!pg", name = "rb", descriptor = "I")
    public static int field7570;

    @OriginalMember(owner = "client!pg", name = "sb", descriptor = "I")
    public static int field7571;

    @OriginalMember(owner = "client!pg", name = "ub", descriptor = "I")
    public static int field7573;

    @OriginalMember(owner = "client!pg", name = "xb", descriptor = "I")
    public static int field7576;

    @OriginalMember(owner = "client!pg", name = "yb", descriptor = "I")
    public static int field7577;

    @OriginalMember(owner = "client!pg", name = "Ab", descriptor = "I")
    public static int field7579;

    @OriginalMember(owner = "client!pg", name = "Gb", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!pg", name = "Ib", descriptor = "I")
    public static int field7587;

    @OriginalMember(owner = "client!pg", name = "Jb", descriptor = "I")
    public static int field7588;

    @OriginalMember(owner = "client!pg", name = "Kb", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!pg", name = "Ob", descriptor = "I")
    public static int field7593;

    @OriginalMember(owner = "client!pg", name = "Pb", descriptor = "I")
    public static int field7594;

    @OriginalMember(owner = "client!pg", name = "Tb", descriptor = "I")
    public static int field7598;

    @OriginalMember(owner = "client!pg", name = "Ub", descriptor = "I")
    public static int field7599;

    @OriginalMember(owner = "client!pg", name = "Vb", descriptor = "I")
    public static int field7600;

    @OriginalMember(owner = "client!pg", name = "Wb", descriptor = "I")
    public static int field7601;

    @OriginalMember(owner = "client!pg", name = "Zb", descriptor = "I")
    public static int field7604;

    @OriginalMember(owner = "client!pg", name = "ac", descriptor = "I")
    public static int field7605;

    @OriginalMember(owner = "client!pg", name = "bc", descriptor = "I")
    public static int field7606;

    @OriginalMember(owner = "client!pg", name = "cc", descriptor = "I")
    public static int field7607;

    @OriginalMember(owner = "client!pg", name = "dc", descriptor = "I")
    public static int field7608;

    @OriginalMember(owner = "client!pg", name = "gc", descriptor = "I")
    public static int field7611;

    @OriginalMember(owner = "client!pg", name = "lc", descriptor = "I")
    public static int field7616;

    @OriginalMember(owner = "client!pg", name = "mc", descriptor = "I")
    public static int field7617;

    @OriginalMember(owner = "client!pg", name = "nc", descriptor = "I")
    public static int field7618;

    @OriginalMember(owner = "client!pg", name = "sc", descriptor = "I")
    public static int field7623;

    @OriginalMember(owner = "client!pg", name = "Lb", descriptor = "Lse;")
    private class170 field7590;

    @OriginalMember(owner = "client!pg", name = "Rb", descriptor = "Lwr;")
    private class319 field7596;

    @OriginalMember(owner = "client!pg", name = "wc", descriptor = "Lfo;")
    public static class361 field7627;

    @OriginalMember(owner = "client!pg", name = "tc", descriptor = "Lfe;")
    private class404 field7624;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pg", name = "yc", descriptor = "Ljava/lang/Class;")
    public static Class field7629;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "S")
    private short field7533;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "S")
    private short field7535;

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "S")
    private short field7536;

    @OriginalMember(owner = "client!pg", name = "Y", descriptor = "S")
    private short field7551;

    @OriginalMember(owner = "client!pg", name = "Bb", descriptor = "S")
    private short field7580;

    @OriginalMember(owner = "client!pg", name = "Yb", descriptor = "S")
    private short field7603;

    @OriginalMember(owner = "client!pg", name = "ec", descriptor = "S")
    private short field7609;

    @OriginalMember(owner = "client!pg", name = "Y", descriptor = "()I")
    public final int method2045() {
        field7542++;
        return this.field7561;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    private final void method3079(int arg0) {
        field7587++;
        if (this.field7621 == 0) {
            return;
        }
        if (this.field7567 != 0) {
            this.method3088(126, true);
        }
        this.method3088(126, false);
        if (this.field7525 != null) {
            if (this.field7525.field1848 == null) {
                this.method3087((this.field7567 & 0x10) != 0, (byte) -124);
            }
            if (this.field7525.field1848 != null) {
                this.field7521.method2230(arg0 - 679124826, this.field7526 != null);
                this.field7521.method2293(this.field7602, this.field7610, this.field7518, 32884, this.field7526);
                int var2 = this.field7560.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field7560[var3];
                    int var5 = this.field7560[var3 + 1];
                    int var6 = this.field7572[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field7521.method2266(var6, this.field7526 != null, false);
                    this.field7521.method2247((var5 - var4) * 3, (byte) -114, var4 * 3, 4, this.field7525.field1848);
                }
            }
        }
        this.method3090(false);
        if (arg0 != 679111105) {
            this.field7534 = 121;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lre;Z)V")
    private final void method3080(class429 arg0, boolean arg1) {
        field7541++;
        if (this.field7529 > this.field7521.field5454.length) {
            this.field7521.field5454 = new int[this.field7529];
            this.field7521.field5455 = new int[this.field7529];
        }
        int[] var3 = this.field7521.field5454;
        int[] var4 = this.field7521.field5455;
        for (int var5 = 0; var5 < this.field7591; var5++) {
            int var16 = (this.field7566[var5] - (this.field7543[var5] * this.field7521.field5431 >> 8) >> this.field7521.field5308) - arg0.field6234;
            int var17 = (this.field7622[var5] - (this.field7543[var5] * this.field7521.field5343 >> 8) >> this.field7521.field5308) - arg0.field6230;
            int var18 = this.field7578[var5];
            int var19 = this.field7578[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field7612[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        if (!arg1) {
            this.field7622 = null;
        }
        for (int var6 = 0; var6 < this.field7621; var6++) {
            if (this.field7554 == null || this.field7554[var6] <= 128) {
                short var7 = this.field7614[var6];
                short var8 = this.field7597[var6];
                short var9 = this.field7620[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var14 - var15) * (var10 - var11) - (var14 - var13) * (var12 - var11) > 0) {
                    arg0.method2638(1061320208, var15, var10, var14, var13, var12, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "pa", descriptor = "()I")
    public final int method2036() {
        field7531++;
        return this.field7586;
    }

    @OriginalMember(owner = "client!pg", name = "ta", descriptor = "()I")
    public final int method2043() {
        field7559++;
        if (!this.field7592) {
            this.method3081(0);
        }
        return this.field7533;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
    private final void method3081(int arg0) {
        field7527++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = arg0;
        for (int var10 = 0; var10 < this.field7591; var10++) {
            int var11 = this.field7566[var10];
            int var12 = this.field7543[var10];
            if (var12 < var3) {
                var3 = var12;
            }
            if (var2 > var11) {
                var2 = var11;
            }
            if (var6 < var12) {
                var6 = var12;
            }
            if (var5 < var11) {
                var5 = var11;
            }
            int var13 = this.field7622[var10];
            if (var13 > var7) {
                var7 = var13;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var11 * var11 - (-(var13 * var13) - var12 * var12);
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field7580 = (short) var6;
        this.field7535 = (short) var3;
        this.field7551 = (short) var5;
        this.field7609 = (short) var7;
        this.field7533 = (short) var2;
        this.field7603 = (short) var4;
        this.field7536 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        Math.sqrt((double) var9);
        this.field7592 = true;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IILc;Z)Z")
    public final boolean method2026(int arg0, int arg1, class124 arg2, boolean arg3) {
        field7611++;
        class257 var5 = (class257) arg2;
        class257 var6 = this.field7521.field5425;
        float var7 = var5.field3426 * var6.field3424 + var5.field3432 * var6.field3427 + var5.field3412 * var6.field3431 + var6.field3412;
        float var8 = var5.field3426 * var6.field3414 + var5.field3432 * var6.field3429 + var5.field3412 * var6.field3405 + var6.field3432;
        class68.field785 = var5.field3411 * var6.field3424 + var5.field3424 * var6.field3431 + var5.field3414 * var6.field3427;
        class495.field7228 = var5.field3411 * var6.field3414 + var5.field3424 * var6.field3405 + var5.field3414 * var6.field3429;
        class115.field1507 = var5.field3411 * var6.field3411 + var5.field3424 * var6.field3437 + var5.field3414 * var6.field3410;
        class471.field6986 = var5.field3437 * var6.field3414 + var5.field3431 * var6.field3405 + var5.field3405 * var6.field3429;
        float var9 = var5.field3426 * var6.field3411 + var5.field3432 * var6.field3410 + var5.field3412 * var6.field3437 + var6.field3426;
        class294.field3893 = var5.field3410 * var6.field3424 + var5.field3429 * var6.field3427 + var5.field3427 * var6.field3431;
        class75.field953 = var5.field3437 * var6.field3411 + var5.field3431 * var6.field3437 + var5.field3405 * var6.field3410;
        class519.field7649 = var5.field3437 * var6.field3424 + var5.field3431 * var6.field3431 + var5.field3405 * var6.field3427;
        class457.field6822 = var5.field3410 * var6.field3414 + var5.field3429 * var6.field3429 + var5.field3427 * var6.field3405;
        class81.field989 = var5.field3410 * var6.field3411 + var5.field3429 * var6.field3410 + var5.field3427 * var6.field3437;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field7521.field5411;
        int var16 = this.field7521.field5393;
        if (!this.field7592) {
            this.method3081(0);
        }
        class223.field3002[0] = this.field7533;
        class223.field3010[0] = this.field7535;
        class392.field5667[0] = this.field7603;
        class223.field3002[1] = this.field7551;
        class223.field3010[1] = this.field7535;
        class392.field5667[1] = this.field7603;
        class223.field3002[2] = this.field7533;
        class223.field3010[2] = this.field7580;
        class223.field3002[3] = this.field7551;
        class392.field5667[2] = this.field7603;
        class223.field3010[3] = this.field7580;
        class223.field3002[4] = this.field7533;
        class392.field5667[3] = this.field7603;
        class223.field3010[4] = this.field7535;
        class392.field5667[4] = this.field7609;
        class223.field3002[5] = this.field7551;
        class223.field3010[5] = this.field7535;
        class223.field3002[6] = this.field7533;
        class392.field5667[5] = this.field7609;
        class223.field3010[6] = this.field7580;
        class392.field5667[6] = this.field7609;
        class223.field3002[7] = this.field7551;
        class223.field3010[7] = this.field7580;
        class392.field5667[7] = this.field7609;
        for (int var17 = 0; var17 < 8; var17++) {
            float var38 = (float) class223.field3002[var17];
            float var39 = (float) class392.field5667[var17];
            float var40 = (float) class223.field3010[var17];
            float var41 = class115.field1507 * var39 + class81.field989 * var40 + class75.field953 * var38 + var9;
            float var42 = class495.field7228 * var39 + class471.field6986 * var38 + class457.field6822 * var40 + var8;
            float var43 = class68.field785 * var39 + class519.field7649 * var38 + class294.field3893 * var40 + var7;
            if (var41 >= (float) this.field7521.field5400) {
                float var44 = (float) var15 * var43 / var41 + (float) this.field7521.field5435;
                float var45 = (float) var16 * var42 / var41 + (float) this.field7521.field5371;
                if (var12 < var44) {
                    var12 = var44;
                }
                if (var11 > var44) {
                    var11 = var44;
                }
                var10 = true;
                if (var45 < var13) {
                    var13 = var45;
                }
                if (var45 > var14) {
                    var14 = var45;
                }
            }
        }
        if (var10 && var11 < (float) arg0 && (float) arg0 < var12 && (float) arg1 > var13 && var14 > (float) arg1) {
            if (arg3) {
                return true;
            }
            if (this.field7521.field5454.length < this.field7529) {
                this.field7521.field5454 = new int[this.field7529];
                this.field7521.field5455 = new int[this.field7529];
            }
            int[] var18 = this.field7521.field5454;
            int[] var19 = this.field7521.field5455;
            for (int var20 = 0; var20 < this.field7591; var20++) {
                float var22 = (float) this.field7543[var20];
                float var23 = (float) this.field7622[var20];
                float var24 = (float) this.field7566[var20];
                float var25 = class115.field1507 * var23 + class81.field989 * var22 + class75.field953 * var24 + var9;
                float var26 = class68.field785 * var23 + class519.field7649 * var24 + class294.field3893 * var22 + var7;
                float var27 = class495.field7228 * var23 + class471.field6986 * var24 + class457.field6822 * var22 + var8;
                if ((float) this.field7521.field5400 <= var25) {
                    int var28 = (int) ((float) var15 * var26 / var25 + (float) this.field7521.field5435);
                    int var29 = (int) ((float) var16 * var27 / var25 + (float) this.field7521.field5371);
                    int var30 = this.field7578[var20];
                    int var31 = this.field7578[var20 + 1];
                    for (int var32 = var30; var32 < var31; var32++) {
                        int var33 = this.field7612[var32] - 1;
                        if (var33 == -1) {
                            break;
                        }
                        var18[var33] = var28;
                        var19[var33] = var29;
                    }
                } else {
                    int var34 = this.field7578[var20];
                    int var35 = this.field7578[var20 + 1];
                    for (int var36 = var34; var36 < var35; var36++) {
                        int var37 = this.field7612[var36] - 1;
                        if (var37 == -1) {
                            break;
                        }
                        var18[this.field7612[var36] - 1] = -999999;
                    }
                }
            }
            for (int var21 = 0; var21 < this.field7584; var21++) {
                if (var18[this.field7614[var21]] != -999999 && var18[this.field7597[var21]] != -999999 && var18[this.field7620[var21]] != -999999 && this.method3092(false, var19[this.field7597[var21]], var18[this.field7597[var21]], var18[this.field7620[var21]], var19[this.field7614[var21]], arg0, var19[this.field7620[var21]], arg1, var18[this.field7614[var21]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pg", name = "va", descriptor = "(I[IIIIIZ)V")
    public final void method2047(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field7539++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            class116.field1518 = 0;
            class425.field6173 = 0;
            class27.field264 = 0;
            int var12 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field7530.length) {
                    int[] var15 = this.field7530[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class425.field6173 += this.field7566[var17];
                        class116.field1518 += this.field7543[var17];
                        var12++;
                        class27.field264 += this.field7622[var17];
                    }
                }
            }
            if (var12 <= 0) {
                class425.field6173 = var9;
                class27.field264 = var10;
                class116.field1518 = var11;
            } else {
                class27.field264 = class27.field264 / var12 + var10;
                class425.field6173 = class425.field6173 / var12 + var9;
                class116.field1518 = class116.field1518 / var12 + var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg4 << 4;
            int var19 = arg3 << 4;
            int var20 = arg2 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field7530.length) {
                    int[] var23 = this.field7530[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field7566[var25] += var20;
                        this.field7543[var25] += var19;
                        this.field7622[var25] += var18;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field7530.length) {
                    int[] var46 = this.field7530[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field7566[var59] -= class425.field6173;
                            this.field7543[var59] -= class116.field1518;
                            this.field7622[var59] -= class27.field264;
                            if (arg4 != 0) {
                                int var60 = class456.field6812[arg4];
                                int var61 = class456.field6811[arg4];
                                int var62 = this.field7543[var59] * var60 - (-(this.field7566[var59] * var61) - 32767) >> 15;
                                this.field7543[var59] = this.field7543[var59] * var61 + 32767 - (this.field7566[var59] * var60) >> 15;
                                this.field7566[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class456.field6812[arg2];
                                int var64 = class456.field6811[arg2];
                                int var65 = this.field7543[var59] * var64 - (this.field7622[var59] * var63 - 32767) >> 15;
                                this.field7622[var59] = this.field7622[var59] * var64 + this.field7543[var59] * var63 + 32767 >> 15;
                                this.field7543[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class456.field6812[arg3];
                                int var67 = class456.field6811[arg3];
                                int var68 = this.field7622[var59] * var66 + (this.field7566[var59] * var67) + 32767 >> 15;
                                this.field7622[var59] = this.field7622[var59] * var67 + 32767 - (this.field7566[var59] * var66) >> 15;
                                this.field7566[var59] = var68;
                            }
                            this.field7566[var59] += class425.field6173;
                            this.field7543[var59] += class116.field1518;
                            this.field7622[var59] += class27.field264;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field7566[var48] -= class425.field6173;
                            this.field7543[var48] -= class116.field1518;
                            this.field7622[var48] -= class27.field264;
                            if (arg2 != 0) {
                                int var49 = class456.field6812[arg2];
                                int var50 = class456.field6811[arg2];
                                int var51 = this.field7543[var48] * var50 + 32767 - this.field7622[var48] * var49 >> 15;
                                this.field7622[var48] = this.field7543[var48] * var49 + (this.field7622[var48] * var50 + 32767) >> 15;
                                this.field7543[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class456.field6812[arg4];
                                int var53 = class456.field6811[arg4];
                                int var54 = this.field7566[var48] * var53 + this.field7543[var48] * var52 + 32767 >> 15;
                                this.field7543[var48] = this.field7543[var48] * var53 + 32767 - (this.field7566[var48] * var52) >> 15;
                                this.field7566[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class456.field6812[arg3];
                                int var56 = class456.field6811[arg3];
                                int var57 = this.field7622[var48] * var55 + this.field7566[var48] * var56 + 32767 >> 15;
                                this.field7622[var48] = this.field7622[var48] * var56 + 32767 - (this.field7566[var48] * var55) >> 15;
                                this.field7566[var48] = var57;
                            }
                            this.field7566[var48] += class425.field6173;
                            this.field7543[var48] += class116.field1518;
                            this.field7622[var48] += class27.field264;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field7530.length > var28) {
                        int[] var29 = this.field7530[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field7578[var31];
                            int var33 = this.field7578[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field7612[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class456.field6812[arg4];
                                    int var37 = class456.field6811[arg4];
                                    int var38 = this.field7595[var35] * var36 + this.field7545[var35] * var37 + 32767 >> 15;
                                    this.field7595[var35] = (short) (this.field7595[var35] * var37 + 32767 - (this.field7545[var35] * var36) >> 15);
                                    this.field7545[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class456.field6812[arg2];
                                    int var40 = class456.field6811[arg2];
                                    int var41 = this.field7595[var35] * var40 + 32767 - (this.field7532[var35] * var39) >> 15;
                                    this.field7532[var35] = (short) (this.field7595[var35] * var39 + this.field7532[var35] * var40 + 32767 >> 15);
                                    this.field7595[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class456.field6812[arg3];
                                    int var43 = class456.field6811[arg3];
                                    int var44 = this.field7545[var35] * var43 + this.field7532[var35] * var42 + 32767 >> 15;
                                    this.field7532[var35] = (short) (this.field7532[var35] * var43 + 32767 - (this.field7545[var35] * var42) >> 15);
                                    this.field7545[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field7526 == null && this.field7518 != null) {
                    this.field7518.field5070 = null;
                }
                if (this.field7526 != null) {
                    this.field7526.field5070 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field7530.length > var70) {
                    int[] var71 = this.field7530[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field7566[var73] -= class425.field6173;
                        this.field7543[var73] -= class116.field1518;
                        this.field7622[var73] -= class27.field264;
                        this.field7566[var73] = this.field7566[var73] * arg2 >> 7;
                        this.field7543[var73] = this.field7543[var73] * arg3 >> 7;
                        this.field7622[var73] = this.field7622[var73] * arg4 >> 7;
                        this.field7566[var73] += class425.field6173;
                        this.field7543[var73] += class116.field1518;
                        this.field7622[var73] += class27.field264;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field7520 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (var78 < this.field7520.length) {
                        int[] var79 = this.field7520[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field7554[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field7554[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field7518 != null) {
                            this.field7518.field5070 = null;
                        }
                    }
                }
                if (this.field7524 != null) {
                    for (int var75 = 0; var75 < this.field7582; var75++) {
                        class204 var76 = this.field7524[var75];
                        class497 var77 = this.field7619[var75];
                        var77.field7249 = 255 - (this.field7554[var76.field2702] & 0xFF) << 24 | var77.field7249 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field7520 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (var87 < this.field7520.length) {
                        int[] var88 = this.field7520[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field7583[var90] & 0xFFFF;
                            int var92 = var91 >> 10 & 0x3F;
                            int var93 = (var91 & 0x3A0) >> 7;
                            int var94 = arg2 + var92 & 0x3F;
                            int var95 = arg3 / 4 + var93;
                            int var96 = var91 & 0x7F;
                            int var97 = arg4 + var96;
                            if (var95 < 0) {
                                var95 = 0;
                            } else if (var95 > 7) {
                                var95 = 7;
                            }
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field7583[var90] = (short) class219.method1381(class219.method1381(var94 << 10, var95 << 7), var97);
                        }
                        if (var88.length > 0 && this.field7518 != null) {
                            this.field7518.field5070 = null;
                        }
                    }
                }
                if (this.field7524 != null) {
                    for (int var84 = 0; var84 < this.field7582; var84++) {
                        class204 var85 = this.field7524[var84];
                        class497 var86 = this.field7619[var84];
                        var86.field7249 = var86.field7249 & 0xFF000000 | class413.field5903[this.field7583[var85.field2702] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field7553 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (var99 < this.field7553.length) {
                        int[] var100 = this.field7553[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class497 var102 = this.field7619[var100[var101]];
                            var102.field7248 += arg2;
                            var102.field7238 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field7553 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field7553.length > var104) {
                        int[] var105 = this.field7553[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class497 var107 = this.field7619[var105[var106]];
                            var107.field7246 = var107.field7246 * arg3 >> 7;
                            var107.field7247 = var107.field7247 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field7553 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field7553.length) {
                    int[] var110 = this.field7553[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class497 var112 = this.field7619[var110[var111]];
                        var112.field7251 = var112.field7251 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "W", descriptor = "(I)V")
    public final void method2022(int arg0) {
        field7618++;
        int var2 = class456.field6812[arg0];
        int var3 = class456.field6811[arg0];
        for (int var4 = 0; var4 < this.field7591; var4++) {
            int var5 = this.field7543[var4] * var3 - this.field7622[var4] * var2 >> 15;
            this.field7622[var4] = this.field7543[var4] * var2 + (this.field7622[var4] * var3) >> 15;
            this.field7543[var4] = var5;
        }
        this.field7592 = false;
        if (this.field7602 != null) {
            this.field7602.field5070 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "ma", descriptor = "(I)V")
    public final void method2014(int arg0) {
        field7569++;
        int var2 = class456.field6812[arg0];
        int var3 = class456.field6811[arg0];
        for (int var4 = 0; var4 < this.field7591; var4++) {
            int var5 = this.field7622[var4] * var2 + (this.field7566[var4] * var3) >> 15;
            this.field7622[var4] = this.field7622[var4] * var3 - (this.field7566[var4] * var2) >> 15;
            this.field7566[var4] = var5;
        }
        this.field7592 = false;
        if (this.field7602 != null) {
            this.field7602.field5070 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "()I")
    public final int method2023() {
        if (!this.field7592) {
            this.method3081(0);
        }
        field7623++;
        return this.field7580;
    }

    @OriginalMember(owner = "client!pg", name = "MA", descriptor = "()I")
    public final int method2019() {
        if (!this.field7592) {
            this.method3081(0);
        }
        field7570++;
        return this.field7551;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V")
    public static void method3082(byte arg0) {
        field7625 = null;
        field7627 = null;
        field7628 = null;
        if (arg0 >= -109) {
            field7627 = null;
        }
        field7581 = null;
        field7626 = null;
    }

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "(I)V")
    public final void method2040(int arg0) {
        this.field7586 = (short) arg0;
        if (this.field7518 != null) {
            this.field7518.field5070 = null;
        }
        field7585++;
        if (this.field7526 != null) {
            this.field7526.field5070 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "()Z")
    public final boolean method2020() {
        field7604++;
        if (this.field7572 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field7572.length; var1++) {
            if (this.field7572[var1] != -1 && !this.field7521.field3772.method91(this.field7572[var1], -1221)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Le;IIIZ)V")
    public final void method2049(class373 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field7557++;
        class517 var6 = (class517) arg0;
        if (this.field7584 == 0 || var6.field7584 == 0) {
            return;
        }
        int var7 = var6.field7591;
        int[] var8 = var6.field7566;
        int[] var9 = var6.field7543;
        int[] var10 = var6.field7622;
        short[] var11 = var6.field7545;
        short[] var12 = var6.field7595;
        short[] var13 = var6.field7532;
        byte[] var14 = var6.field7556;
        short[] var15;
        short[] var16;
        byte[] var17;
        short[] var18;
        if (this.field7596 == null) {
            var17 = null;
            var15 = null;
            var18 = null;
            var16 = null;
        } else {
            var15 = this.field7596.field4249;
            var16 = this.field7596.field4254;
            var17 = this.field7596.field4251;
            var18 = this.field7596.field4255;
        }
        short[] var19;
        short[] var20;
        byte[] var21;
        short[] var22;
        if (var6.field7596 == null) {
            var20 = null;
            var22 = null;
            var21 = null;
            var19 = null;
        } else {
            var19 = var6.field7596.field4249;
            var20 = var6.field7596.field4255;
            var21 = var6.field7596.field4251;
            var22 = var6.field7596.field4254;
        }
        int[] var23 = var6.field7578;
        short[] var24 = var6.field7612;
        if (!var6.field7592) {
            var6.method3081(0);
        }
        short var25 = var6.field7535;
        short var26 = var6.field7580;
        short var27 = var6.field7533;
        short var28 = var6.field7551;
        short var29 = var6.field7603;
        short var30 = var6.field7609;
        for (int var31 = 0; var31 < this.field7591; var31++) {
            int var32 = this.field7543[var31] - arg2;
            if (var25 <= var32 && var26 >= var32) {
                int var33 = this.field7566[var31] - arg1;
                if (var33 >= var27 && var28 >= var33) {
                    int var34 = this.field7622[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field7578[var31];
                        int var37 = this.field7578[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field7612[var38] - 1;
                            if (var35 == -1 || this.field7556[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39];
                                    int var41 = var23[var39 + 1];
                                    int var42 = -1;
                                    for (int var43 = var40; var43 < var41; var43++) {
                                        var42 = var24[var43] - 1;
                                        if (var42 == -1 || var14[var42] != 0) {
                                            break;
                                        }
                                    }
                                    if (var42 != -1) {
                                        if (var18 == null) {
                                            this.field7596 = new class319();
                                            var18 = this.field7596.field4255 = class266.method1632((byte) 59, this.field7545);
                                            var15 = this.field7596.field4249 = class266.method1632((byte) 59, this.field7595);
                                            var16 = this.field7596.field4254 = class266.method1632((byte) 59, this.field7532);
                                            var17 = this.field7596.field4251 = class85.method464((byte) -81, this.field7556);
                                        }
                                        if (var20 == null) {
                                            class319 var44 = var6.field7596 = new class319();
                                            var20 = var44.field4255 = class266.method1632((byte) 59, var11);
                                            var19 = var44.field4249 = class266.method1632((byte) 59, var12);
                                            var22 = var44.field4254 = class266.method1632((byte) 59, var13);
                                            var21 = var44.field4251 = class85.method464((byte) -95, var14);
                                        }
                                        short var45 = this.field7545[var35];
                                        short var46 = this.field7595[var35];
                                        short var47 = this.field7532[var35];
                                        int var48 = var23[var39];
                                        byte var49 = this.field7556[var35];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var48; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var21[var52] != 0) {
                                                var20[var52] += var45;
                                                var19[var52] += var46;
                                                var22[var52] += var47;
                                                var21[var52] += var49;
                                            }
                                        }
                                        short var53 = var12[var42];
                                        int var54 = this.field7578[var31];
                                        int var55 = this.field7578[var31 + 1];
                                        short var56 = var11[var42];
                                        byte var57 = var14[var42];
                                        short var58 = var13[var42];
                                        for (int var59 = var54; var59 < var55; var59++) {
                                            int var60 = this.field7612[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var17[var60] != 0) {
                                                var18[var60] += var56;
                                                var15[var60] += var53;
                                                var16[var60] += var58;
                                                var17[var60] += var57;
                                            }
                                        }
                                        if (this.field7526 == null && this.field7518 != null) {
                                            this.field7518.field5070 = null;
                                        }
                                        if (this.field7526 != null) {
                                            this.field7526.field5070 = null;
                                        }
                                        if (var6.field7526 == null && var6.field7518 != null) {
                                            var6.field7518.field5070 = null;
                                        }
                                        if (var6.field7526 != null) {
                                            var6.field7526.field5070 = null;
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

    @OriginalMember(owner = "client!pg", name = "L", descriptor = "()V")
    public final void method2010() {
        for (int var1 = 0; var1 < this.field7591; var1++) {
            this.field7622[var1] = -this.field7622[var1];
        }
        field7537++;
        for (int var2 = 0; var2 < this.field7529; var2++) {
            this.field7532[var2] = (short) (-this.field7532[var2]);
        }
        for (int var3 = 0; var3 < this.field7584; var3++) {
            short var4 = this.field7614[var3];
            this.field7614[var3] = this.field7620[var3];
            this.field7620[var3] = var4;
        }
        if (this.field7526 == null && this.field7518 != null) {
            this.field7518.field5070 = null;
        }
        if (this.field7526 != null) {
            this.field7526.field5070 = null;
        }
        this.field7592 = false;
        if (this.field7525 != null) {
            this.field7525.field1848 = null;
        }
        if (this.field7602 != null) {
            this.field7602.field5070 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "()I")
    public final int method2041() {
        field7576++;
        if (!this.field7592) {
            this.method3081(0);
        }
        return this.field7535;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(SIBII)I")
    private final int method3083(short arg0, int arg1, byte arg2, int arg3, int arg4) {
        field7594++;
        int var6 = class413.field5903[class453.method2807(arg1, arg3, 65408)];
        if (arg4 != 255) {
            this.method3088(-102, false);
        }
        if (arg0 != -1) {
            class433 var7 = this.field7521.field3772.method94(arg0 & 0xFFFF, (byte) -72);
            int var8 = var7.field6317 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg3 < 0) {
                    var9 = 0;
                } else if (arg3 <= 127) {
                    var9 = arg3 * 131586;
                } else {
                    var9 = 16777215;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) + ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field6303 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = (var6 >> 16 & 0xFF) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = ((var6 & 0xFF00) >> 8) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (var6 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                var6 = ((var13 & 0x5800FF00) << 8) + (var14 & 0xFF00) + (var15 >> 8);
            }
        }
        return (var6 << 8) + 255 - (arg2 & 0xFF);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V")
    public final void method2044(int arg0, int arg1, int arg2) {
        field7565++;
        for (int var4 = 0; var4 < this.field7591; var4++) {
            if (arg0 != 0) {
                this.field7566[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field7543[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field7622[var4] += arg2;
            }
        }
        if (this.field7602 != null) {
            this.field7602.field5070 = null;
        }
        this.field7592 = false;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
    private final void method3084(int arg0) {
        if (arg0 != -618691769) {
            this.method2049(null, -2, -64, -94, false);
        }
        if (this.field7524 != null) {
            class257 var2 = this.field7521.field5307;
            float var3 = this.field7521.method1155();
            float var4 = this.field7521.method1223();
            this.field7521.method2237(arg0 ^ 0x24E07CE6);
            this.field7521.method1175(false);
            this.field7521.method2230(-13721, false);
            this.field7521.method2293(this.field7521.field5418, this.field7521.field5442, null, 32884, null);
            for (int var5 = 0; var5 < this.field7582; var5++) {
                class204 var6 = this.field7524[var5];
                class497 var7 = this.field7619[var5];
                if (!var6.field2700 || !this.field7521.method1142()) {
                    float var8 = (float) (this.field7566[var6.field2697] + this.field7566[var6.field2696] + this.field7566[var6.field2694]) * 0.3333333F;
                    float var9 = (float) (this.field7543[var6.field2696] + this.field7543[var6.field2694] + this.field7543[var6.field2697]) * 0.3333333F;
                    float var10 = (float) (this.field7622[var6.field2697] + this.field7622[var6.field2696] + this.field7622[var6.field2694]) * 0.3333333F;
                    float var11 = class68.field785 * var10 + class519.field7649 * var8 + class294.field3893 * var9 + class99.field1361;
                    float var12 = class495.field7228 * var10 + class471.field6986 * var8 + class457.field6822 * var9 + class233.field3119;
                    float var13 = class115.field1507 * var10 + class81.field989 * var9 + class75.field953 * var8 + class414.field5917;
                    var2.method1586(-var13, 87, var6.field2693 * var7.field7246 >> 7, (float) var7.field7238 - var12, (float) var7.field7248 + var11, var7.field7251, var6.field2699 * var7.field7247 >> 7);
                    this.field7521.method2243(var2, 12711);
                    this.field7521.method1140(var4, var3 - ((float) var6.field2695 * 1.5F));
                    int var14 = var7.field7249;
                    OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                    this.field7521.method2299(var6.field2701, (byte) 71);
                    this.field7521.method2279(var6.field2692, (byte) 101);
                    this.field7521.method2260(16640, var6.field2690);
                    this.field7521.method2295(7, 0, 4, (byte) 66);
                }
            }
            this.field7521.method1140(var4, var3);
            this.field7521.method1175(true);
            this.field7521.method2301(-12885);
        }
        field7558++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lc;Lut;II)V")
    public final void method2016(class124 arg0, class82 arg1, int arg2, int arg3) {
        field7600++;
        if (this.field7529 == 0) {
            return;
        }
        class257 var5 = this.field7521.field5425;
        class257 var6 = (class257) arg0;
        if (!this.field7592) {
            this.method3081(0);
        }
        class81.field989 = var5.field3411 * var6.field3410 + var5.field3437 * var6.field3427 + var5.field3410 * var6.field3429;
        class414.field5917 = var5.field3411 * var6.field3426 + var5.field3437 * var6.field3412 + var5.field3410 * var6.field3432 + var5.field3426;
        float var7 = (float) this.field7535 * class81.field989 + class414.field5917;
        float var8 = (float) this.field7580 * class81.field989 + class414.field5917;
        float var9;
        float var10;
        if ((var7 > var8)) {
            var9 = (float) this.field7536 + var7;
            var10 = var8 - (float) this.field7536;
        } else {
            var9 = (float) this.field7536 + var8;
            var10 = (float) (-this.field7536) + var7;
        }
        if ((this.field7521.field5392 <= var10) || ((float) this.field7521.field5400 >= var9)) {
            return;
        }
        class99.field1361 = var5.field3424 * var6.field3426 + var5.field3431 * var6.field3412 + var5.field3427 * var6.field3432 + var5.field3412;
        class294.field3893 = var5.field3424 * var6.field3410 + var5.field3431 * var6.field3427 + var5.field3427 * var6.field3429;
        float var11 = (float) this.field7535 * class294.field3893 + class99.field1361;
        float var12 = (float) this.field7580 * class294.field3893 + class99.field1361;
        float var13;
        float var14;
        if (var11 > var12) {
            var13 = (var12 - (float) this.field7536) * (float) this.field7521.field5411;
            var14 = ((float) this.field7536 + var11) * (float) this.field7521.field5411;
        } else {
            var14 = ((float) this.field7536 + var12) * (float) this.field7521.field5411;
            var13 = ((float) (-this.field7536) + var11) * (float) this.field7521.field5411;
        }
        if ((var13 / (float) arg2 >= this.field7521.field5443) || (var14 / (float) arg2 <= this.field7521.field5441)) {
            return;
        }
        class457.field6822 = var5.field3414 * var6.field3410 + var5.field3429 * var6.field3429 + var5.field3405 * var6.field3427;
        class233.field3119 = var5.field3414 * var6.field3426 + var5.field3429 * var6.field3432 + var5.field3405 * var6.field3412 + var5.field3432;
        float var15 = (float) this.field7535 * class457.field6822 + class233.field3119;
        float var16 = (float) this.field7580 * class457.field6822 + class233.field3119;
        float var17;
        float var18;
        if (var16 < var15) {
            var17 = (var16 - (float) this.field7536) * (float) this.field7521.field5393;
            var18 = ((float) this.field7536 + var15) * (float) this.field7521.field5393;
        } else {
            var17 = (var15 - (float) this.field7536) * (float) this.field7521.field5393;
            var18 = ((float) this.field7536 + var16) * (float) this.field7521.field5393;
        }
        if ((var17 / (float) arg2 >= this.field7521.field5446) || (var18 / (float) arg2 <= this.field7521.field5362)) {
            return;
        }
        if (arg1 != null || this.field7524 != null) {
            class471.field6986 = var5.field3414 * var6.field3437 + var5.field3429 * var6.field3405 + var5.field3405 * var6.field3431;
            class495.field7228 = var5.field3414 * var6.field3411 + var5.field3429 * var6.field3414 + var5.field3405 * var6.field3424;
            class75.field953 = var5.field3411 * var6.field3437 + var5.field3437 * var6.field3431 + var5.field3410 * var6.field3405;
            class519.field7649 = var5.field3424 * var6.field3437 + var5.field3431 * var6.field3431 + var5.field3427 * var6.field3405;
            class115.field1507 = var5.field3411 * var6.field3411 + var5.field3437 * var6.field3424 + var5.field3410 * var6.field3414;
            class68.field785 = var5.field3424 * var6.field3411 + var5.field3431 * var6.field3424 + var5.field3427 * var6.field3414;
        }
        if (arg1 != null) {
            int var19 = this.field7551 + this.field7533 >> 1;
            int var20 = this.field7609 + this.field7603 >> 1;
            int var21 = (int) ((float) var20 * class68.field785 + (float) this.field7535 * class294.field3893 + (float) var19 * class519.field7649 + class99.field1361);
            int var22 = (int) ((float) var20 * class495.field7228 + (float) this.field7535 * class457.field6822 + (float) var19 * class471.field6986 + class233.field3119);
            int var23 = (int) ((float) var20 * class115.field1507 + (float) this.field7535 * class81.field989 + (float) var19 * class75.field953 + class414.field5917);
            int var24 = (int) ((float) var20 * class68.field785 + (float) this.field7580 * class294.field3893 + (float) var19 * class519.field7649 + class99.field1361);
            int var25 = (int) ((float) var20 * class495.field7228 + (float) this.field7580 * class457.field6822 + (float) var19 * class471.field6986 + class233.field3119);
            arg1.field992 = this.field7521.field5411 * var24 / arg2 + this.field7521.field5435;
            arg1.field996 = this.field7521.field5411 * var21 / arg2 + this.field7521.field5435;
            int var26 = (int) ((float) var20 * class115.field1507 + (float) this.field7580 * class81.field989 + (float) var19 * class75.field953 + class414.field5917);
            arg1.field997 = this.field7521.field5393 * var25 / arg2 + this.field7521.field5371;
            arg1.field995 = this.field7521.field5393 * var22 / arg2 + this.field7521.field5371;
            if (this.field7521.field5400 > var23 && var26 < this.field7521.field5400) {
                arg1.field994 = true;
                arg1.field993 = (var21 + this.field7536) * this.field7521.field5411 / arg2 + this.field7521.field5435 - arg1.field996;
            }
        }
        this.field7521.method2294(3405, (float) arg2);
        this.field7521.method2248(16);
        this.field7521.method2227(-2097153, var6);
        this.method3079(679111105);
        this.field7521.method2301(-12885);
        this.method3084(-618691769);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BIZ)Le;")
    public final class373 method2027(byte arg0, int arg1, boolean arg2) {
        field7599++;
        class517 var4;
        class517 var5;
        if (arg0 == 1) {
            var4 = this.field7521.field5382;
            var5 = this.field7521.field5444;
        } else if (arg0 == 2) {
            var5 = this.field7521.field5333;
            var4 = this.field7521.field5352;
        } else if (arg0 == 3) {
            var4 = this.field7521.field5399;
            var5 = this.field7521.field5341;
        } else if (arg0 == 4) {
            var5 = this.field7521.field5391;
            var4 = this.field7521.field5356;
        } else if (arg0 == 5) {
            var4 = this.field7521.field5369;
            var5 = this.field7521.field5419;
        } else {
            var5 = var4 = new class517(this.field7521);
        }
        return this.method3085(arg1, arg0 != 0, arg2, var5, -106, var4);
    }

    @OriginalMember(owner = "client!pg", name = "S", descriptor = "()I")
    public final int method2024() {
        if (!this.field7592) {
            this.method3081(0);
        }
        field7616++;
        return this.field7609;
    }

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "(I)V")
    public final void method2011(int arg0) {
        field7546++;
        int var2 = class456.field6812[arg0];
        int var3 = class456.field6811[arg0];
        for (int var4 = 0; var4 < this.field7591; var4++) {
            int var7 = this.field7622[var4] * var2 + this.field7566[var4] * var3 >> 15;
            this.field7622[var4] = this.field7622[var4] * var3 - (this.field7566[var4] * var2) >> 15;
            this.field7566[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field7529; var5++) {
            int var6 = this.field7532[var5] * var2 + (this.field7545[var5] * var3) >> 15;
            this.field7532[var5] = (short) (this.field7532[var5] * var3 - (this.field7545[var5] * var2) >> 15);
            this.field7545[var5] = (short) var6;
        }
        if (this.field7526 == null && this.field7518 != null) {
            this.field7518.field5070 = null;
        }
        if (this.field7526 != null) {
            this.field7526.field5070 = null;
        }
        if (this.field7602 != null) {
            this.field7602.field5070 = null;
        }
        this.field7592 = false;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZZLpg;ILpg;)Le;")
    private final class373 method3085(int arg0, boolean arg1, boolean arg2, class517 arg3, int arg4, class517 arg5) {
        field7549++;
        arg3.field7561 = this.field7561;
        arg3.field7591 = this.field7591;
        arg3.field7615 = arg0;
        arg3.field7529 = this.field7529;
        arg3.field7567 = 0;
        arg3.field7582 = this.field7582;
        if (arg4 > -23) {
            this.field7551 = -24;
        }
        arg3.field7586 = this.field7586;
        arg3.field7613 = this.field7613;
        arg3.field7584 = this.field7584;
        arg3.field7621 = this.field7621;
        arg3.field7534 = this.field7534;
        boolean var7 = class93.method520(-117, this.field7613, arg0);
        boolean var8 = class207.method1311((byte) -56, arg0, this.field7613);
        boolean var9 = class335.method1954(arg0, this.field7613, 83);
        boolean var10 = var9 | var7 | var8;
        if (var10) {
            if (!var7) {
                arg3.field7566 = this.field7566;
            } else if (arg5.field7566 == null || this.field7534 > arg5.field7566.length) {
                arg3.field7566 = arg5.field7566 = new int[this.field7534];
            } else {
                arg3.field7566 = arg5.field7566;
            }
            if (!var8) {
                arg3.field7543 = this.field7543;
            } else if (arg5.field7543 == null || arg5.field7543.length < this.field7534) {
                arg3.field7543 = arg5.field7543 = new int[this.field7534];
            } else {
                arg3.field7543 = arg5.field7543;
            }
            if (!var9) {
                arg3.field7622 = this.field7622;
            } else if (arg5.field7622 == null || arg5.field7622.length < this.field7534) {
                arg3.field7622 = arg5.field7622 = new int[this.field7534];
            } else {
                arg3.field7622 = arg5.field7622;
            }
            for (int var11 = 0; var11 < this.field7534; var11++) {
                if (var7) {
                    arg3.field7566[var11] = this.field7566[var11];
                }
                if (var8) {
                    arg3.field7543[var11] = this.field7543[var11];
                }
                if (var9) {
                    arg3.field7622[var11] = this.field7622[var11];
                }
            }
        } else {
            arg3.field7543 = this.field7543;
            arg3.field7566 = this.field7566;
            arg3.field7622 = this.field7622;
        }
        if (class317.method1891(arg0, (byte) 68, this.field7613)) {
            arg3.field7602 = arg5.field7602;
            if (arg1) {
                arg3.field7567 = (byte) (arg3.field7567 | 0x1);
            }
            arg3.field7602.field5070 = this.field7602.field5070;
            arg3.field7602.field5068 = this.field7602.field5068;
        } else if (class302.method1801((byte) 22, this.field7613, arg0)) {
            arg3.field7602 = this.field7602;
        } else {
            arg3.field7602 = null;
        }
        if (class216.method1375(arg0, 2, this.field7613)) {
            if (arg5.field7583 == null || arg5.field7583.length < this.field7584) {
                arg3.field7583 = arg5.field7583 = new short[this.field7584];
            } else {
                arg3.field7583 = arg5.field7583;
            }
            for (int var12 = 0; var12 < this.field7584; var12++) {
                arg3.field7583[var12] = this.field7583[var12];
            }
        } else {
            arg3.field7583 = this.field7583;
        }
        if (class481.method2938(-2639, this.field7613, arg0)) {
            if (arg5.field7554 == null || this.field7584 > arg5.field7554.length) {
                arg3.field7554 = arg5.field7554 = new byte[this.field7584];
            } else {
                arg3.field7554 = arg5.field7554;
            }
            for (int var13 = 0; var13 < this.field7584; var13++) {
                arg3.field7554[var13] = this.field7554[var13];
            }
        } else {
            arg3.field7554 = this.field7554;
        }
        if (class371.method2198(arg0, this.field7613, 45056)) {
            if (arg1) {
                arg3.field7567 = (byte) (arg3.field7567 | 0x2);
            }
            arg3.field7518 = arg5.field7518;
            arg3.field7518.field5068 = this.field7518.field5068;
            arg3.field7518.field5070 = this.field7518.field5070;
        } else if (class242.method1511(arg0, this.field7613, 3)) {
            arg3.field7518 = this.field7518;
        } else {
            arg3.field7518 = null;
        }
        if (class151.method905(this.field7613, arg0, 32210)) {
            if (arg5.field7545 == null || arg5.field7545.length < this.field7529) {
                int var14 = this.field7529;
                arg3.field7595 = arg5.field7595 = new short[var14];
                arg3.field7545 = arg5.field7545 = new short[var14];
                arg3.field7532 = arg5.field7532 = new short[var14];
            } else {
                arg3.field7595 = arg5.field7595;
                arg3.field7545 = arg5.field7545;
                arg3.field7532 = arg5.field7532;
            }
            if (this.field7596 == null) {
                for (int var18 = 0; var18 < this.field7529; var18++) {
                    arg3.field7545[var18] = this.field7545[var18];
                    arg3.field7595[var18] = this.field7595[var18];
                    arg3.field7532[var18] = this.field7532[var18];
                }
            } else {
                if (arg5.field7596 == null) {
                    arg5.field7596 = new class319();
                }
                class319 var15 = arg3.field7596 = arg5.field7596;
                if (var15.field4255 == null || this.field7529 > var15.field4255.length) {
                    int var16 = this.field7529;
                    var15.field4251 = new byte[var16];
                    var15.field4255 = new short[var16];
                    var15.field4249 = new short[var16];
                    var15.field4254 = new short[var16];
                }
                for (int var17 = 0; var17 < this.field7529; var17++) {
                    arg3.field7545[var17] = this.field7545[var17];
                    arg3.field7595[var17] = this.field7595[var17];
                    arg3.field7532[var17] = this.field7532[var17];
                    var15.field4255[var17] = this.field7596.field4255[var17];
                    var15.field4249[var17] = this.field7596.field4249[var17];
                    var15.field4254[var17] = this.field7596.field4254[var17];
                    var15.field4251[var17] = this.field7596.field4251[var17];
                }
            }
            arg3.field7556 = this.field7556;
        } else {
            arg3.field7532 = this.field7532;
            arg3.field7556 = this.field7556;
            arg3.field7545 = this.field7545;
            arg3.field7595 = this.field7595;
            arg3.field7596 = this.field7596;
        }
        if (class493.method2980(30, this.field7613, arg0)) {
            arg3.field7526 = arg5.field7526;
            if (arg1) {
                arg3.field7567 = (byte) (arg3.field7567 | 0x4);
            }
            arg3.field7526.field5068 = this.field7526.field5068;
            arg3.field7526.field5070 = this.field7526.field5070;
        } else if (class299.method1787(this.field7613, 106, arg0)) {
            arg3.field7526 = this.field7526;
        } else {
            arg3.field7526 = null;
        }
        if (class268.method1635(this.field7613, -1596595220, arg0)) {
            if (arg5.field7538 == null || arg5.field7538.length < this.field7584) {
                int var19 = this.field7529;
                arg3.field7538 = arg5.field7538 = new float[var19];
                arg3.field7528 = arg5.field7528 = new float[var19];
            } else {
                arg3.field7538 = arg5.field7538;
                arg3.field7528 = arg5.field7528;
            }
            for (int var20 = 0; var20 < this.field7529; var20++) {
                arg3.field7538[var20] = this.field7538[var20];
                arg3.field7528[var20] = this.field7528[var20];
            }
        } else {
            arg3.field7528 = this.field7528;
            arg3.field7538 = this.field7538;
        }
        if (class452.method2802(this.field7613, 0, arg0)) {
            arg3.field7610 = arg5.field7610;
            if (arg1) {
                arg3.field7567 = (byte) (arg3.field7567 | 0x8);
            }
            arg3.field7610.field5068 = this.field7610.field5068;
            arg3.field7610.field5070 = this.field7610.field5070;
        } else if (class92.method511(arg0, this.field7613, 123)) {
            arg3.field7610 = this.field7610;
        } else {
            arg3.field7610 = null;
        }
        if (class445.method2749(this.field7613, (byte) 9, arg0)) {
            if (arg5.field7614 == null || arg5.field7614.length < this.field7584) {
                int var21 = this.field7584;
                arg3.field7597 = arg5.field7597 = new short[var21];
                arg3.field7620 = arg5.field7620 = new short[var21];
                arg3.field7614 = arg5.field7614 = new short[var21];
            } else {
                arg3.field7597 = arg5.field7597;
                arg3.field7614 = arg5.field7614;
                arg3.field7620 = arg5.field7620;
            }
            for (int var22 = 0; var22 < this.field7584; var22++) {
                arg3.field7614[var22] = this.field7614[var22];
                arg3.field7597[var22] = this.field7597[var22];
                arg3.field7620[var22] = this.field7620[var22];
            }
        } else {
            arg3.field7597 = this.field7597;
            arg3.field7614 = this.field7614;
            arg3.field7620 = this.field7620;
        }
        if (class23.method135(1, this.field7613, arg0)) {
            if (arg1) {
                arg3.field7567 = (byte) (arg3.field7567 | 0x10);
            }
            arg3.field7525 = arg5.field7525;
            arg3.field7525.field1848 = this.field7525.field1848;
        } else if (class401.method2477(arg0, (byte) -22, this.field7613)) {
            arg3.field7525 = this.field7525;
        } else {
            arg3.field7525 = null;
        }
        if (class106.method643(arg0, this.field7613, 0)) {
            if (arg5.field7572 == null || this.field7584 > arg5.field7572.length) {
                int var23 = this.field7584;
                arg3.field7572 = arg5.field7572 = new short[var23];
            } else {
                arg3.field7572 = arg5.field7572;
            }
            for (int var24 = 0; var24 < this.field7584; var24++) {
                arg3.field7572[var24] = this.field7572[var24];
            }
        } else {
            arg3.field7572 = this.field7572;
        }
        if (!class401.method2478(0, arg0, this.field7613)) {
            arg3.field7619 = this.field7619;
        } else if (arg5.field7619 == null || arg5.field7619.length < this.field7582) {
            int var26 = this.field7582;
            arg3.field7619 = arg5.field7619 = new class497[var26];
            for (int var27 = 0; var27 < this.field7582; var27++) {
                arg3.field7619[var27] = this.field7619[var27].method2989((byte) -124);
            }
        } else {
            arg3.field7619 = arg5.field7619;
            for (int var25 = 0; var25 < this.field7582; var25++) {
                arg3.field7619[var25].method2994(this.field7619[var25], (byte) -124);
            }
        }
        arg3.field7612 = this.field7612;
        arg3.field7530 = this.field7530;
        arg3.field7555 = this.field7555;
        arg3.field7575 = this.field7575;
        arg3.field7578 = this.field7578;
        arg3.field7519 = this.field7519;
        arg3.field7560 = this.field7560;
        arg3.field7520 = this.field7520;
        arg3.field7574 = this.field7574;
        arg3.field7524 = this.field7524;
        arg3.field7553 = this.field7553;
        if (this.field7592) {
            arg3.field7536 = this.field7536;
            arg3.field7603 = this.field7603;
            arg3.field7533 = this.field7533;
            arg3.field7580 = this.field7580;
            arg3.field7535 = this.field7535;
            arg3.field7551 = this.field7551;
            arg3.field7609 = this.field7609;
            arg3.field7592 = true;
        } else {
            arg3.field7592 = false;
        }
        return arg3;
    }

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "()Z")
    public final boolean method2021() {
        field7550++;
        if (this.field7530 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field7534; var1++) {
            this.field7566[var1] <<= 0x4;
            this.field7543[var1] <<= 0x4;
            this.field7622[var1] <<= 0x4;
        }
        class425.field6173 = 0;
        class27.field264 = 0;
        class116.field1518 = 0;
        return true;
    }

    @OriginalMember(owner = "client!pg", name = "aa", descriptor = "(I[IIIIZI[I)V")
    public final void method2042(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field7588++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            class425.field6173 = 0;
            class27.field264 = 0;
            int var13 = 0;
            class116.field1518 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field7530.length) {
                    int[] var16 = this.field7530[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field7555 == null || (arg6 & this.field7555[var18]) != 0) {
                            class425.field6173 += this.field7566[var18];
                            class116.field1518 += this.field7543[var18];
                            var13++;
                            class27.field264 += this.field7622[var18];
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class425.field6173 = var10;
                class27.field264 = var12;
                class116.field1518 = var11;
            } else {
                class425.field6173 = class425.field6173 / var13 + var10;
                class95.field1150 = true;
                class116.field1518 = class116.field1518 / var13 + var11;
                class27.field264 = class27.field264 / var13 + var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[0] * arg2 + (arg7[2] * arg4) + arg7[1] * arg3 + 16384 >> 15;
                int var20 = arg7[3] * arg2 + 16384 - (-(arg7[4] * arg3) - arg7[5] * arg4) >> 15;
                int var21 = arg7[7] * arg3 + arg7[6] * arg2 + arg7[8] * arg4 + 16384 >> 15;
                arg3 = var20;
                arg4 = var21;
                arg2 = var19;
            }
            int var22 = arg3 << 4;
            int var23 = arg2 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field7530.length) {
                    int[] var27 = this.field7530[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field7555 == null || (arg6 & this.field7555[var29]) != 0) {
                            this.field7566[var29] += var23;
                            this.field7543[var29] += var22;
                            this.field7622[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (this.field7530.length > var49) {
                        int[] var50 = this.field7530[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field7555 == null || (arg6 & this.field7555[var52]) != 0) {
                                this.field7566[var52] -= class425.field6173;
                                this.field7543[var52] -= class116.field1518;
                                this.field7622[var52] -= class27.field264;
                                if (arg4 != 0) {
                                    int var53 = class456.field6812[arg4];
                                    int var54 = class456.field6811[arg4];
                                    int var55 = this.field7566[var52] * var54 + this.field7543[var52] * var53 + 32767 >> 15;
                                    this.field7543[var52] = this.field7543[var52] * var54 + 32767 - (this.field7566[var52] * var53) >> 15;
                                    this.field7566[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class456.field6812[arg2];
                                    int var57 = class456.field6811[arg2];
                                    int var58 = this.field7543[var52] * var57 + 32767 - (this.field7622[var52] * var56) >> 15;
                                    this.field7622[var52] = this.field7622[var52] * var57 + this.field7543[var52] * var56 + 32767 >> 15;
                                    this.field7543[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class456.field6812[arg3];
                                    int var60 = class456.field6811[arg3];
                                    int var61 = this.field7622[var52] * var59 + (this.field7566[var52] * var60) + 32767 >> 15;
                                    this.field7622[var52] = this.field7622[var52] * var60 + 32767 - (this.field7566[var52] * var59) >> 15;
                                    this.field7566[var52] = var61;
                                }
                                this.field7566[var52] += class425.field6173;
                                this.field7543[var52] += class116.field1518;
                                this.field7622[var52] += class27.field264;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (var32 < this.field7530.length) {
                            int[] var33 = this.field7530[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field7555 == null || (this.field7555[var35] & arg6) != 0) {
                                    int var36 = this.field7578[var35];
                                    int var37 = this.field7578[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field7612[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class456.field6812[arg4];
                                            int var41 = class456.field6811[arg4];
                                            int var42 = this.field7545[var39] * var41 + (this.field7595[var39] * var40 + 32767) >> 15;
                                            this.field7595[var39] = (short) (this.field7595[var39] * var41 + 32767 - (this.field7545[var39] * var40) >> 15);
                                            this.field7545[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class456.field6812[arg2];
                                            int var44 = class456.field6811[arg2];
                                            int var45 = this.field7595[var39] * var44 + (32767 - (this.field7532[var39] * var43)) >> 15;
                                            this.field7532[var39] = (short) (this.field7595[var39] * var43 + this.field7532[var39] * var44 + 32767 >> 15);
                                            this.field7595[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class456.field6812[arg3];
                                            int var47 = class456.field6811[arg3];
                                            int var48 = this.field7532[var39] * var46 + (this.field7545[var39] * var47) + 32767 >> 15;
                                            this.field7532[var39] = (short) (this.field7532[var39] * var47 + 32767 - (this.field7545[var39] * var46) >> 15);
                                            this.field7545[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field7526 == null && this.field7518 != null) {
                        this.field7518.field5070 = null;
                    }
                    if (this.field7526 != null) {
                        this.field7526.field5070 = null;
                        return;
                    }
                }
            } else {
                int var62 = arg7[9] << 4;
                int var63 = arg7[10] << 4;
                int var64 = arg7[11] << 4;
                int var65 = arg7[12] << 4;
                int var66 = arg7[13] << 4;
                int var67 = arg7[14] << 4;
                if (class95.field1150) {
                    int var68 = arg7[0] * class425.field6173 + 16384 - (-(arg7[3] * class116.field1518) - arg7[6] * class27.field264) >> 15;
                    int var69 = arg7[7] * class27.field264 + arg7[4] * class116.field1518 + arg7[1] * class425.field6173 + 16384 >> 15;
                    int var70 = var66 + var69;
                    int var71 = var65 + var68;
                    int var72 = arg7[2] * class425.field6173 + arg7[8] * class27.field264 + arg7[5] * class116.field1518 + 16384 >> 15;
                    class425.field6173 = var71;
                    int var73 = var67 + var72;
                    class116.field1518 = var70;
                    class27.field264 = var73;
                    class95.field1150 = false;
                }
                int[] var74 = new int[9];
                int var75 = class456.field6811[arg2];
                int var76 = class456.field6812[arg2];
                int var77 = class456.field6811[arg3];
                int var78 = class456.field6812[arg3];
                int var79 = class456.field6811[arg4];
                int var80 = class456.field6812[arg4];
                int var81 = var76 * var79 + 16384 >> 15;
                int var82 = var76 * var80 + 16384 >> 15;
                var74[3] = var75 * var80 + 16384 >> 15;
                var74[0] = var77 * var79 + var78 * var82 + 16384 >> 15;
                var74[8] = var75 * var77 + 16384 >> 15;
                var74[2] = var75 * var78 + 16384 >> 15;
                var74[5] = -var76;
                var74[7] = var77 * var81 + var78 * var80 + 16384 >> 15;
                var74[1] = var78 * var81 + -var77 * var80 + 16384 >> 15;
                var74[4] = var75 * var79 + 16384 >> 15;
                var74[6] = -var78 * var79 + (var77 * var82) + 16384 >> 15;
                int var83 = var74[1] * -class116.field1518 + var74[0] * -class425.field6173 + var74[2] * -class27.field264 + 16384 >> 15;
                int var84 = var74[3] * -class425.field6173 + (var74[4] * -class116.field1518 + (var74[5] * -class27.field264)) + 16384 >> 15;
                int var85 = var74[7] * -class116.field1518 + (var74[8] * -class27.field264) + var74[6] * -class425.field6173 + 16384 >> 15;
                int var86 = class425.field6173 + var83;
                int var87 = class116.field1518 + var84;
                int var88 = class27.field264 + var85;
                int[] var89 = new int[9];
                for (int var90 = 0; var90 < 3; var90++) {
                    for (int var119 = 0; var119 < 3; var119++) {
                        int var120 = 0;
                        for (int var121 = 0; var121 < 3; var121++) {
                            var120 += var74[var90 * 3 + var121] * arg7[var119 * 3 + var121];
                        }
                        var89[var90 * 3 + var119] = var120 + 16384 >> 15;
                    }
                }
                int var91 = var74[1] * var66 + var74[0] * var65 + var74[2] * var67 + 16384 >> 15;
                int var92 = var74[3] * var65 + var74[4] * var66 + (var74[5] * var67) + 16384 >> 15;
                int var93 = var87 + var92;
                int var94 = var86 + var91;
                int var95 = var74[6] * var65 + var74[8] * var67 + var74[7] * var66 + 16384 >> 15;
                int var96 = var88 + var95;
                int[] var97 = new int[9];
                for (int var98 = 0; var98 < 3; var98++) {
                    for (int var116 = 0; var116 < 3; var116++) {
                        int var117 = 0;
                        for (int var118 = 0; var118 < 3; var118++) {
                            var117 += arg7[var98 * 3 + var118] * var89[var118 * 3 + var116];
                        }
                        var97[var98 * 3 + var116] = var117 + 16384 >> 15;
                    }
                }
                int var99 = arg7[2] * var96 + arg7[1] * var93 + arg7[0] * var94 + 16384 >> 15;
                int var100 = arg7[3] * var94 - (-(arg7[5] * var96) - (arg7[4] * var93) - 16384) >> 15;
                int var101 = var63 + var100;
                int var102 = arg7[7] * var93 + arg7[6] * var94 + (arg7[8] * var96) + 16384 >> 15;
                int var103 = var62 + var99;
                int var104 = var64 + var102;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (var106 < this.field7530.length) {
                        int[] var107 = this.field7530[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field7555 == null || (arg6 & this.field7555[var109]) != 0) {
                                int var110 = this.field7566[var109] * var97[0] + this.field7543[var109] * var97[1] + (this.field7622[var109] * var97[2]) + 16384 >> 15;
                                int var111 = this.field7622[var109] * var97[5] + this.field7566[var109] * var97[3] - (-(this.field7543[var109] * var97[4]) + -16384) >> 15;
                                int var112 = this.field7622[var109] * var97[8] + (this.field7566[var109] * var97[6] + this.field7543[var109] * var97[7] + 16384) >> 15;
                                int var113 = var103 + var110;
                                int var114 = var101 + var111;
                                this.field7566[var109] = var113;
                                int var115 = var104 + var112;
                                this.field7543[var109] = var114;
                                this.field7622[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (this.field7530.length > var123) {
                        int[] var124 = this.field7530[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field7555 == null || (this.field7555[var126] & arg6) != 0) {
                                this.field7566[var126] -= class425.field6173;
                                this.field7543[var126] -= class116.field1518;
                                this.field7622[var126] -= class27.field264;
                                this.field7566[var126] = this.field7566[var126] * arg2 >> 7;
                                this.field7543[var126] = this.field7543[var126] * arg3 >> 7;
                                this.field7622[var126] = this.field7622[var126] * arg4 >> 7;
                                this.field7566[var126] += class425.field6173;
                                this.field7543[var126] += class116.field1518;
                                this.field7622[var126] += class27.field264;
                            }
                        }
                    }
                }
            } else {
                int var127 = arg7[9] << 4;
                int var128 = arg7[10] << 4;
                int var129 = arg7[11] << 4;
                int var130 = arg7[12] << 4;
                int var131 = arg7[13] << 4;
                int var132 = arg7[14] << 4;
                if (class95.field1150) {
                    int var133 = arg7[6] * class27.field264 + arg7[3] * class116.field1518 + arg7[0] * class425.field6173 + 16384 >> 15;
                    int var134 = arg7[4] * class116.field1518 + arg7[1] * class425.field6173 + arg7[7] * class27.field264 + 16384 >> 15;
                    int var135 = var131 + var134;
                    int var136 = arg7[8] * class27.field264 + (arg7[2] * class425.field6173 + (arg7[5] * class116.field1518)) + 16384 >> 15;
                    int var137 = var130 + var133;
                    int var138 = var132 + var136;
                    class116.field1518 = var135;
                    class425.field6173 = var137;
                    class27.field264 = var138;
                    class95.field1150 = false;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class425.field6173 * var139 + 16384 >> 15;
                int var143 = -class116.field1518 * var140 + 16384 >> 15;
                int var144 = -class27.field264 * var141 + 16384 >> 15;
                int var145 = class425.field6173 + var142;
                int var146 = class116.field1518 + var143;
                int var147 = var144 + class27.field264;
                int[] var148 = new int[] { arg7[0] * var139 + 16384 >> 15, arg7[3] * var139 + 16384 >> 15, arg7[6] * var139 + 16384 >> 15, arg7[1] * var140 + 16384 >> 15, arg7[4] * var140 + 16384 >> 15, arg7[7] * var140 + 16384 >> 15, arg7[2] * var141 + 16384 >> 15, arg7[5] * var141 + 16384 >> 15, arg7[8] * var141 + 16384 >> 15 };
                int var149 = var130 * var139 + 16384 >> 15;
                int var150 = var131 * var140 + 16384 >> 15;
                int var151 = var145 + var149;
                int var152 = var146 + var150;
                int var153 = var132 * var141 + 16384 >> 15;
                int var154 = var147 + var153;
                int[] var155 = new int[9];
                for (int var156 = 0; var156 < 3; var156++) {
                    for (int var174 = 0; var174 < 3; var174++) {
                        int var175 = 0;
                        for (int var176 = 0; var176 < 3; var176++) {
                            var175 += var148[var174 + (var176 * 3)] * arg7[var156 * 3 + var176];
                        }
                        var155[var156 * 3 + var174] = var175 + 16384 >> 15;
                    }
                }
                int var157 = arg7[1] * var152 + arg7[2] * var154 + arg7[0] * var151 + 16384 >> 15;
                int var158 = arg7[4] * var152 + arg7[3] * var151 + arg7[5] * var154 + 16384 >> 15;
                int var159 = arg7[8] * var154 + arg7[6] * var151 + arg7[7] * var152 + 16384 >> 15;
                int var160 = var127 + var157;
                int var161 = var128 + var158;
                int var162 = var129 + var159;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (var164 < this.field7530.length) {
                        int[] var165 = this.field7530[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field7555 == null || (arg6 & this.field7555[var167]) != 0) {
                                int var168 = this.field7566[var167] * var155[0] + (this.field7622[var167] * var155[2]) + this.field7543[var167] * var155[1] + 16384 >> 15;
                                int var169 = this.field7622[var167] * var155[5] + (this.field7566[var167] * var155[3] - (-(this.field7543[var167] * var155[4]) - 16384)) >> 15;
                                int var170 = var161 + var169;
                                int var171 = this.field7622[var167] * var155[8] + this.field7566[var167] * var155[6] + this.field7543[var167] * var155[7] + 16384 >> 15;
                                int var172 = var160 + var168;
                                int var173 = var162 + var171;
                                this.field7566[var167] = var172;
                                this.field7543[var167] = var170;
                                this.field7622[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field7520 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field7520.length) {
                        int[] var182 = this.field7520[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field7574 == null || (arg6 & this.field7574[var184]) != 0) {
                                int var185 = (this.field7554[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field7554[var184] = (byte) var185;
                                if (this.field7518 != null) {
                                    this.field7518.field5070 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field7524 != null) {
                    for (int var178 = 0; var178 < this.field7582; var178++) {
                        class204 var179 = this.field7524[var178];
                        class497 var180 = this.field7619[var178];
                        var180.field7249 = var180.field7249 & 0xFFFFFF | 255 - (this.field7554[var179.field2702] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field7520 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (var190 < this.field7520.length) {
                        int[] var191 = this.field7520[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field7574 == null || (arg6 & this.field7574[var193]) != 0) {
                                int var194 = this.field7583[var193] & 0xFFFF;
                                int var195 = var194 >> 10 & 0x3F;
                                int var196 = (var194 & 0x3DA) >> 7;
                                int var197 = arg2 + var195 & 0x3F;
                                int var198 = arg3 / 4 + var196;
                                int var199 = var194 & 0x7F;
                                int var200 = arg4 + var199;
                                if (var198 < 0) {
                                    var198 = 0;
                                } else if (var198 > 7) {
                                    var198 = 7;
                                }
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field7583[var193] = (short) class219.method1381(class219.method1381(var197 << 10, var198 << 7), var200);
                                if (this.field7518 != null) {
                                    this.field7518.field5070 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field7524 != null) {
                    for (int var187 = 0; var187 < this.field7582; var187++) {
                        class204 var188 = this.field7524[var187];
                        class497 var189 = this.field7619[var187];
                        var189.field7249 = class413.field5903[this.field7583[var188.field2702] & 0xFFFF] & 0xFFFFFF | var189.field7249 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field7553 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field7553.length) {
                        int[] var203 = this.field7553[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class497 var205 = this.field7619[var203[var204]];
                            var205.field7238 += arg3;
                            var205.field7248 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field7553 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field7553.length) {
                        int[] var208 = this.field7553[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class497 var210 = this.field7619[var208[var209]];
                            var210.field7246 = var210.field7246 * arg3 >> 7;
                            var210.field7247 = var210.field7247 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field7553 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field7553.length > var212) {
                    int[] var213 = this.field7553[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class497 var215 = this.field7619[var213[var214]];
                        var215.field7251 = var215.field7251 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIFFBIJILpq;)S")
    private final short method3086(int arg0, int arg1, int arg2, float arg3, float arg4, byte arg5, int arg6, long arg7, int arg8, class131 arg9) {
        field7598++;
        int var12 = this.field7578[arg2];
        int var13 = this.field7578[arg2 + 1];
        int var14 = 0;
        int var15 = 102 % ((59 - arg5) / 39);
        for (int var16 = var12; var16 < var13; var16++) {
            short var17 = this.field7612[var16];
            if (var17 == 0) {
                var14 = var16;
                break;
            }
            if (class420.field6095[var16] == arg7) {
                return (short) (var17 - 1);
            }
        }
        this.field7612[var14] = (short) (this.field7529 + 1);
        class420.field6095[var14] = arg7;
        this.field7545[this.field7529] = (short) arg8;
        this.field7595[this.field7529] = (short) arg1;
        this.field7532[this.field7529] = (short) arg0;
        this.field7556[this.field7529] = (byte) arg6;
        this.field7538[this.field7529] = arg4;
        this.field7528[this.field7529] = arg3;
        return (short) (this.field7529++);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZB)V")
    private final void method3087(boolean arg0, byte arg1) {
        if (arg1 >= -116) {
            this.method2015();
        }
        field7514++;
        if (this.field7521.field5372.field5761.length >= this.field7621 * 6) {
            this.field7521.field5372.field5729 = 0;
        } else {
            this.field7521.field5372 = new class408((this.field7621 + 100) * 6);
        }
        class408 var3 = this.field7521.field5372;
        if (this.field7521.field5334) {
            for (int var4 = 0; var4 < this.field7621; var4++) {
                var3.method2444((byte) 65, this.field7614[var4]);
                var3.method2444((byte) 65, this.field7597[var4]);
                var3.method2444((byte) 65, this.field7620[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field7621; var5++) {
                var3.method2434(-12659, this.field7614[var5]);
                var3.method2434(-12659, this.field7597[var5]);
                var3.method2434(-12659, this.field7620[var5]);
            }
        }
        if (var3.field5729 == 0) {
            return;
        }
        if (arg0) {
            if (this.field7624 == null) {
                this.field7624 = this.field7521.method2308(true, 5123, var3.field5729, var3.field5761, 12905);
            } else {
                this.field7624.method1466(false, var3.field5729, var3.field5761, 5123);
            }
            this.field7525.field1848 = this.field7624;
        } else {
            this.field7525.field1848 = this.field7521.method2308(false, 5123, var3.field5729, var3.field5761, 12905);
        }
        if (!arg0) {
            this.field7523 = true;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZ)V")
    private final void method3088(int arg0, boolean arg1) {
        field7601++;
        boolean var3 = this.field7518 != null && this.field7518.field5070 == null;
        boolean var4 = this.field7526 != null && this.field7526.field5070 == null;
        boolean var5 = this.field7602 != null && this.field7602.field5070 == null;
        boolean var6 = this.field7610 != null && this.field7610.field5070 == null;
        if (arg1) {
            var5 &= (this.field7567 & 0x1) != 0;
            var6 &= (this.field7567 & 0x8) != 0;
            var4 &= (this.field7567 & 0x4) != 0;
            var3 &= (this.field7567 & 0x2) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        byte var10 = 0;
        if (var5) {
            var8 = var7;
            var7 = (byte) (var7 + 12);
        }
        byte var11 = 0;
        if (var3) {
            var9 = var7;
            var7 = (byte) (var7 + 4);
        }
        if (var4) {
            var10 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var6) {
            var11 = var7;
            var7 = (byte) (var7 + 8);
        }
        if (var7 == 0) {
            return;
        }
        if (this.field7521.field5372.field5761.length >= (this.field7529 * var7)) {
            this.field7521.field5372.field5729 = 0;
        } else {
            this.field7521.field5372 = new class408((this.field7529 + 100) * var7);
        }
        class408 var12 = this.field7521.field5372;
        if (var5) {
            if (this.field7521.field5334) {
                for (int var21 = 0; var21 < this.field7591; var21++) {
                    int var22 = NativeStream.floatToRawIntBits((float) this.field7566[var21]);
                    int var23 = NativeStream.floatToRawIntBits((float) this.field7543[var21]);
                    int var24 = NativeStream.floatToRawIntBits((float) this.field7622[var21]);
                    int var25 = this.field7578[var21];
                    int var26 = this.field7578[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field7612[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field5729 = var7 * var28;
                        var12.method2398(-32, var22);
                        var12.method2398(127, var23);
                        var12.method2398(-50, var24);
                    }
                }
            } else {
                for (int var13 = 0; var13 < this.field7591; var13++) {
                    int var14 = NativeStream.floatToRawIntBits((float) this.field7566[var13]);
                    int var15 = NativeStream.floatToRawIntBits((float) this.field7543[var13]);
                    int var16 = NativeStream.floatToRawIntBits((float) this.field7622[var13]);
                    int var17 = this.field7578[var13];
                    int var18 = this.field7578[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field7612[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field5729 = var7 * var20;
                        var12.method2408(var14, (byte) 107);
                        var12.method2408(var15, (byte) 107);
                        var12.method2408(var16, (byte) 107);
                    }
                }
            }
        }
        if (var3) {
            if (this.field7526 == null) {
                short[] var29;
                short[] var30;
                short[] var31;
                byte[] var32;
                if (this.field7596 == null) {
                    var32 = this.field7556;
                    var30 = this.field7595;
                    var31 = this.field7532;
                    var29 = this.field7545;
                } else {
                    var29 = this.field7596.field4255;
                    var30 = this.field7596.field4249;
                    var31 = this.field7596.field4254;
                    var32 = this.field7596.field4251;
                }
                float var33 = this.field7521.field5345[0];
                float var34 = this.field7521.field5345[1];
                float var35 = this.field7521.field5345[2];
                float var36 = this.field7521.field5337;
                float var37 = this.field7521.field5436 * 768.0F / (float) this.field7586;
                float var38 = this.field7521.field5434 * 768.0F / (float) this.field7586;
                for (int var39 = 0; var39 < this.field7584; var39++) {
                    int var40 = this.method3083(this.field7572[var39], this.field7583[var39], this.field7554[var39], this.field7561, 255);
                    float var41 = (float) (var40 >>> 24) * this.field7521.field5448;
                    float var42 = (float) (var40 >> 8 & 0xFF) * this.field7521.field5438;
                    float var43 = (float) (var40 >> 16 & 0xFF) * this.field7521.field5353;
                    short var44 = this.field7614[var39];
                    short var45 = (short) var32[var44];
                    float var46;
                    if (var45 == 0) {
                        var46 = ((float) var31[var44] * var35 + (float) var29[var44] * var33 + (float) var30[var44] * var34) * 0.0026041667F;
                    } else {
                        var46 = ((float) var31[var44] * var35 + (float) var29[var44] * var33 + (float) var30[var44] * var34) / (float) (var45 * 256);
                    }
                    float var47 = var36 + (var46 < 0.0F ? var38 : var37) * var46;
                    int var48 = (int) (var41 * var47);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    int var49 = (int) (var43 * var47);
                    int var50 = (int) (var42 * var47);
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    var12.field5729 = var7 * var44 + var9;
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    var12.method2449((byte) 119, var48);
                    var12.method2449((byte) 119, var49);
                    var12.method2449((byte) 123, var50);
                    var12.method2449((byte) 124, 255 - (this.field7554[var39] & 0xFF));
                    short var51 = this.field7597[var39];
                    short var52 = (short) var32[var51];
                    float var53;
                    if (var52 == 0) {
                        var53 = ((float) var31[var51] * var35 + (float) var29[var51] * var33 + (float) var30[var51] * var34) * 0.0026041667F;
                    } else {
                        var53 = ((float) var31[var51] * var35 + (float) var29[var51] * var33 + (float) var30[var51] * var34) / (float) (var52 * 256);
                    }
                    float var54 = var53 * ((var53 < 0.0F) ? var38 : var37) + var36;
                    int var55 = (int) (var41 * var54);
                    int var56 = (int) (var43 * var54);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    int var57 = (int) (var42 * var54);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    var12.field5729 = var7 * var51 + var9;
                    var12.method2449((byte) 116, var55);
                    var12.method2449((byte) 126, var56);
                    var12.method2449((byte) 119, var57);
                    var12.method2449((byte) 126, 255 - (this.field7554[var39] & 0xFF));
                    short var58 = this.field7620[var39];
                    short var59 = (short) var32[var58];
                    float var60;
                    if (var59 == 0) {
                        var60 = ((float) var31[var58] * var35 + (float) var29[var58] * var33 + (float) var30[var58] * var34) * 0.0026041667F;
                    } else {
                        var60 = ((float) var31[var58] * var35 + (float) var29[var58] * var33 + (float) var30[var58] * var34) / (float) (var59 * 256);
                    }
                    float var61 = var36 + var60 * ((var60 < 0.0F) ? var38 : var37);
                    int var62 = (int) (var41 * var61);
                    int var63 = (int) (var43 * var61);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    int var64 = (int) (var42 * var61);
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    var12.field5729 = var7 * var58 + var9;
                    var12.method2449((byte) 127, var62);
                    var12.method2449((byte) 127, var63);
                    var12.method2449((byte) 116, var64);
                    var12.method2449((byte) 119, 255 - (this.field7554[var39] & 0xFF));
                }
            } else {
                for (int var65 = 0; var65 < this.field7584; var65++) {
                    int var66 = this.method3083(this.field7572[var65], this.field7583[var65], this.field7554[var65], this.field7561, 255);
                    var12.field5729 = this.field7614[var65] * var7 + var9;
                    var12.method2398(-64, var66);
                    var12.field5729 = this.field7597[var65] * var7 + var9;
                    var12.method2398(115, var66);
                    var12.field5729 = this.field7620[var65] * var7 + var9;
                    var12.method2398(-14, var66);
                }
            }
        }
        if (var4) {
            byte[] var67;
            short[] var68;
            short[] var69;
            short[] var70;
            if (this.field7596 == null) {
                var67 = this.field7556;
                var68 = this.field7532;
                var69 = this.field7545;
                var70 = this.field7595;
            } else {
                var68 = this.field7596.field4254;
                var70 = this.field7596.field4249;
                var69 = this.field7596.field4255;
                var67 = this.field7596.field4251;
            }
            float var71 = 3.0F / (float) this.field7586;
            var12.field5729 = var10;
            float var72 = 3.0F / (float) (this.field7586 / 2 + this.field7586);
            if (this.field7521.field5334) {
                for (int var76 = 0; var76 < this.field7529; var76++) {
                    int var77 = var67[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method2498(-123, (float) var69[var76] * var72);
                        var12.method2498(-123, (float) var70[var76] * var72);
                        var12.method2498(-123, (float) var68[var76] * var72);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method2498(-123, (float) var69[var76] * var78);
                        var12.method2498(-123, (float) var70[var76] * var78);
                        var12.method2498(-123, (float) var68[var76] * var78);
                    }
                    var12.field5729 += var7 - 12;
                }
            } else {
                for (int var73 = 0; var73 < this.field7529; var73++) {
                    int var74 = var67[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method2497((byte) 116, (float) var69[var73] * var72);
                        var12.method2497((byte) -74, (float) var70[var73] * var72);
                        var12.method2497((byte) 118, (float) var68[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method2497((byte) 126, (float) var69[var73] * var75);
                        var12.method2497((byte) 120, (float) var70[var73] * var75);
                        var12.method2497((byte) -128, (float) var68[var73] * var75);
                    }
                    var12.field5729 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field5729 = var11;
            if (this.field7521.field5334) {
                for (int var80 = 0; var80 < this.field7529; var80++) {
                    var12.method2498(-123, this.field7538[var80]);
                    var12.method2498(-123, this.field7528[var80]);
                    var12.field5729 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field7529; var79++) {
                    var12.method2497((byte) 117, this.field7538[var79]);
                    var12.method2497((byte) 127, this.field7528[var79]);
                    var12.field5729 += var7 - 8;
                }
            }
        }
        var12.field5729 = this.field7529 * var7;
        class170 var81;
        if (arg1) {
            if (this.field7590 == null) {
                this.field7590 = this.field7521.method2307(var12.field5761, 7938, var12.field5729, true, var7);
            } else {
                this.field7590.method167(-2115, var12.field5761, var7, var12.field5729);
            }
            this.field7567 = 0;
            var81 = this.field7590;
        } else {
            var81 = this.field7521.method2307(var12.field5761, 7938, var12.field5729, false, var7);
            this.field7523 = true;
        }
        if (var5) {
            this.field7602.field5070 = var81;
            this.field7602.field5068 = var8;
        }
        if (var6) {
            this.field7610.field5070 = var81;
            this.field7610.field5068 = var11;
        }
        if (var3) {
            this.field7518.field5070 = var81;
            this.field7518.field5068 = var9;
        }
        if (var4) {
            this.field7526.field5068 = var10;
            this.field7526.field5070 = var81;
        }
        if (arg0 <= 124) {
            this.field7603 = -72;
        }
    }

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "(SS)V")
    public final void method2032(short arg0, short arg1) {
        field7571++;
        for (int var3 = 0; var3 < this.field7584; var3++) {
            if (this.field7583[var3] == arg0) {
                this.field7583[var3] = arg1;
            }
        }
        if (this.field7524 != null) {
            for (int var4 = 0; var4 < this.field7582; var4++) {
                class204 var5 = this.field7524[var4];
                class497 var6 = this.field7619[var4];
                var6.field7249 = class413.field5903[this.field7583[var5.field2702] & 0xFFFF] & 0xFFFFFF | var6.field7249 & 0xFF000000;
            }
        }
        if (this.field7518 != null) {
            this.field7518.field5070 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIII)V")
    public final void method2030(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field7584; var5++) {
            int var9 = this.field7583[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = (var9 & 0x3E9) >> 7;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg1 != -1) {
                var11 -= -((arg1 - var11) * arg3 >> 7);
            }
            if (arg2 != -1) {
                var12 -= -((arg2 - var12) * arg3 >> 7);
            }
            this.field7583[var5] = (short) class219.method1381(var12, class219.method1381(var11 << 7, var10 << 10));
        }
        field7606++;
        if (this.field7524 != null) {
            for (int var6 = 0; var6 < this.field7582; var6++) {
                class204 var7 = this.field7524[var6];
                class497 var8 = this.field7619[var6];
                var8.field7249 = class413.field5903[this.field7583[var7.field2702] & 0xFFFF] & 0xFFFFFF | var8.field7249 & 0xFF000000;
            }
        }
        if (this.field7518 != null) {
            this.field7518.field5070 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLku;)V")
    private final void method3089(byte arg0, class257 arg1) {
        field7522++;
        if (arg0 != 119) {
            this.method2017(null);
        }
        if (this.field7575 != null) {
            for (int var3 = 0; var3 < this.field7575.length; var3++) {
                class142 var4 = this.field7575[var3];
                class142 var5 = var4;
                if (var4.field1875 != null) {
                    var5 = var4.field1875;
                }
                var5.field1878 = (int) ((float) this.field7622[var4.field1889] * arg1.field3424 + (float) this.field7566[var4.field1889] * arg1.field3431 + (float) this.field7543[var4.field1889] * arg1.field3427 + arg1.field3412);
                var5.field1886 = (int) ((float) this.field7622[var4.field1889] * arg1.field3414 + (float) this.field7566[var4.field1889] * arg1.field3405 + (float) this.field7543[var4.field1889] * arg1.field3429 + arg1.field3432);
                var5.field1874 = (int) ((float) this.field7622[var4.field1889] * arg1.field3411 + (float) this.field7566[var4.field1889] * arg1.field3437 + (float) this.field7543[var4.field1889] * arg1.field3410 + arg1.field3426);
                var5.field1876 = (int) ((float) this.field7622[var4.field1888] * arg1.field3424 + (float) this.field7566[var4.field1888] * arg1.field3431 + (float) this.field7543[var4.field1888] * arg1.field3427 + arg1.field3412);
                var5.field1891 = (int) ((float) this.field7622[var4.field1888] * arg1.field3414 + (float) this.field7566[var4.field1888] * arg1.field3405 + (float) this.field7543[var4.field1888] * arg1.field3429 + arg1.field3432);
                var5.field1877 = (int) ((float) this.field7622[var4.field1888] * arg1.field3411 + (float) this.field7566[var4.field1888] * arg1.field3437 + (float) this.field7543[var4.field1888] * arg1.field3410 + arg1.field3426);
                var5.field1894 = (int) ((float) this.field7622[var4.field1883] * arg1.field3424 + (float) this.field7566[var4.field1883] * arg1.field3431 + (float) this.field7543[var4.field1883] * arg1.field3427 + arg1.field3412);
                var5.field1881 = (int) ((float) this.field7622[var4.field1883] * arg1.field3414 + (float) this.field7566[var4.field1883] * arg1.field3405 + (float) this.field7543[var4.field1883] * arg1.field3429 + arg1.field3432);
                var5.field1884 = (int) ((float) this.field7622[var4.field1883] * arg1.field3411 + (float) this.field7566[var4.field1883] * arg1.field3437 + (float) this.field7543[var4.field1883] * arg1.field3410 + arg1.field3426);
            }
        }
        if (this.field7519 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field7519.length; var6++) {
            class127 var7 = this.field7519[var6];
            class127 var8 = var7;
            if (var7.field1643 != null) {
                var8 = var7.field1643;
            }
            if (var7.field1645 == null) {
                var7.field1645 = arg1.method750();
            } else {
                var7.field1645.method753(arg1);
            }
            var8.field1653 = (int) ((float) this.field7622[var7.field1644] * arg1.field3424 + (float) this.field7566[var7.field1644] * arg1.field3431 + (float) this.field7543[var7.field1644] * arg1.field3427 + arg1.field3412);
            var8.field1648 = (int) ((float) this.field7622[var7.field1644] * arg1.field3414 + (float) this.field7566[var7.field1644] * arg1.field3405 + (float) this.field7543[var7.field1644] * arg1.field3429 + arg1.field3432);
            var8.field1640 = (int) ((float) this.field7622[var7.field1644] * arg1.field3411 + (float) this.field7566[var7.field1644] * arg1.field3437 + (float) this.field7543[var7.field1644] * arg1.field3410 + arg1.field3426);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
    private final void method3090(boolean arg0) {
        field7593++;
        if (!this.field7523) {
            return;
        }
        this.field7523 = arg0;
        if (this.field7575 == null && this.field7519 == null && this.field7524 == null) {
            if (this.field7566 != null && !class381.method2329(this.field7613, this.field7615, -114)) {
                if (this.field7602 != null && this.field7602.field5070 == null) {
                    this.field7523 = true;
                } else {
                    if (!this.field7592) {
                        this.method3081(0);
                    }
                    this.field7566 = null;
                }
            }
            if (this.field7543 != null && !class521.method3108(this.field7615, -56, this.field7613)) {
                if (this.field7602 != null && this.field7602.field5070 == null) {
                    this.field7523 = true;
                } else {
                    if (!this.field7592) {
                        this.method3081(0);
                    }
                    this.field7543 = null;
                }
            }
            if (this.field7622 != null && !class134.method809(this.field7615, this.field7613, -85)) {
                if (this.field7602 != null && this.field7602.field5070 == null) {
                    this.field7523 = true;
                } else {
                    if (!this.field7592) {
                        this.method3081(0);
                    }
                    this.field7622 = null;
                }
            }
        }
        if (this.field7612 != null && this.field7566 == null && this.field7543 == null && this.field7622 == null) {
            this.field7612 = null;
            this.field7578 = null;
        }
        if (this.field7556 != null && !class467.method2851(this.field7615, 55, this.field7613)) {
            if (this.field7526 == null) {
                if (this.field7518 != null && this.field7518.field5070 == null) {
                    this.field7523 = true;
                } else {
                    this.field7556 = null;
                    this.field7545 = this.field7595 = this.field7532 = null;
                }
            } else if (this.field7526.field5070 == null) {
                this.field7523 = true;
            } else {
                this.field7556 = null;
                this.field7545 = this.field7595 = this.field7532 = null;
            }
        }
        if (this.field7583 != null && !class124.method744(this.field7615, arg0, this.field7613)) {
            if (this.field7518 != null && this.field7518.field5070 == null) {
                this.field7523 = true;
            } else {
                this.field7583 = null;
            }
        }
        if (this.field7554 != null && !class302.method1802(this.field7613, -68, this.field7615)) {
            if (this.field7518 != null && this.field7518.field5070 == null) {
                this.field7523 = true;
            } else {
                this.field7554 = null;
            }
        }
        if (this.field7538 != null && !class436.method2678(this.field7615, (byte) -98, this.field7613)) {
            if (this.field7610 != null && this.field7610.field5070 == null) {
                this.field7523 = true;
            } else {
                this.field7538 = this.field7528 = null;
            }
        }
        if (this.field7572 != null && !class281.method1701(this.field7615, (byte) -118, this.field7613)) {
            if (this.field7518 != null && this.field7518.field5070 == null) {
                this.field7523 = true;
            } else {
                this.field7572 = null;
            }
        }
        if (this.field7614 != null && !class124.method739(this.field7613, true, this.field7615)) {
            if ((this.field7525 == null || this.field7525.field1848 != null) && (this.field7518 == null || this.field7518.field5070 != null)) {
                this.field7614 = this.field7597 = this.field7620 = null;
            } else {
                this.field7523 = true;
            }
        }
        if (this.field7520 != null && !class475.method2901(this.field7615, this.field7613, (byte) -63)) {
            this.field7574 = null;
            this.field7520 = null;
        }
        if (this.field7530 != null && !class342.method1987((byte) -51, this.field7615, this.field7613)) {
            this.field7555 = null;
            this.field7530 = null;
        }
        if (this.field7553 != null && !class531.method3155((byte) -63, this.field7615, this.field7613)) {
            this.field7553 = null;
        }
        if (this.field7560 != null && (this.field7615 & 0x800) == 0 && (this.field7615 & 0x40000) == 0) {
            this.field7560 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "X", descriptor = "(I)V")
    public final void method2037(int arg0) {
        field7548++;
        if (this.field7518 != null) {
            this.field7518.field5070 = null;
        }
        this.field7561 = (short) arg0;
    }

    @OriginalMember(owner = "client!pg", name = "za", descriptor = "(IIII)V")
    public final void method2050(int arg0, int arg1, int arg2, int arg3) {
        field7552++;
        if (arg0 == 0) {
            class425.field6173 = 0;
            class116.field1518 = 0;
            int var5 = 0;
            class27.field264 = 0;
            for (int var6 = 0; var6 < this.field7591; var6++) {
                class425.field6173 += this.field7566[var6];
                class116.field1518 += this.field7543[var6];
                var5++;
                class27.field264 += this.field7622[var6];
            }
            if (var5 <= 0) {
                class425.field6173 = arg1;
                class27.field264 = arg3;
                class116.field1518 = arg2;
            } else {
                class27.field264 = class27.field264 / var5 + arg3;
                class116.field1518 = class116.field1518 / var5 + arg2;
                class425.field6173 = class425.field6173 / var5 + arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field7591; var7++) {
                this.field7566[var7] += arg1;
                this.field7543[var7] += arg2;
                this.field7622[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field7591; var8++) {
                this.field7566[var8] -= class425.field6173;
                this.field7543[var8] -= class116.field1518;
                this.field7622[var8] -= class27.field264;
                if (arg3 != 0) {
                    int var9 = class456.field6812[arg3];
                    int var10 = class456.field6811[arg3];
                    int var11 = this.field7543[var8] * var9 + this.field7566[var8] * var10 + 32767 >> 15;
                    this.field7543[var8] = this.field7543[var8] * var10 + 32767 - (this.field7566[var8] * var9) >> 15;
                    this.field7566[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class456.field6812[arg1];
                    int var13 = class456.field6811[arg1];
                    int var14 = this.field7543[var8] * var13 + 32767 - (this.field7622[var8] * var12) >> 15;
                    this.field7622[var8] = this.field7622[var8] * var13 + this.field7543[var8] * var12 + 32767 >> 15;
                    this.field7543[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class456.field6812[arg2];
                    int var16 = class456.field6811[arg2];
                    int var17 = this.field7622[var8] * var15 + this.field7566[var8] * var16 + 32767 >> 15;
                    this.field7622[var8] = this.field7622[var8] * var16 + 32767 - (this.field7566[var8] * var15) >> 15;
                    this.field7566[var8] = var17;
                }
                this.field7566[var8] += class425.field6173;
                this.field7543[var8] += class116.field1518;
                this.field7622[var8] += class27.field264;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field7591; var18++) {
                this.field7566[var18] -= class425.field6173;
                this.field7543[var18] -= class116.field1518;
                this.field7622[var18] -= class27.field264;
                this.field7566[var18] = this.field7566[var18] * arg1 / 128;
                this.field7543[var18] = this.field7543[var18] * arg2 / 128;
                this.field7622[var18] = this.field7622[var18] * arg3 / 128;
                this.field7566[var18] += class425.field6173;
                this.field7543[var18] += class116.field1518;
                this.field7622[var18] += class27.field264;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field7584; var19++) {
                int var23 = (this.field7554[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field7554[var19] = (byte) var23;
            }
            if (this.field7518 != null) {
                this.field7518.field5070 = null;
            }
            if (this.field7524 != null) {
                for (int var20 = 0; var20 < this.field7582; var20++) {
                    class204 var21 = this.field7524[var20];
                    class497 var22 = this.field7619[var20];
                    var22.field7249 = var22.field7249 & 0xFFFFFF | 255 - (this.field7554[var21.field2702] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field7584; var24++) {
                int var28 = this.field7583[var24] & 0xFFFF;
                int var29 = (var28 & 0xFC01) >> 10;
                int var30 = var28 >> 7 & 0x7;
                int var31 = var28 & 0x7F;
                int var32 = arg2 / 4 + var30;
                int var33 = var29 + arg1 & 0x3F;
                int var34 = arg3 + var31;
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 7) {
                    var32 = 7;
                }
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field7583[var24] = (short) class219.method1381(class219.method1381(var32 << 7, var33 << 10), var34);
            }
            if (this.field7518 != null) {
                this.field7518.field5070 = null;
            }
            if (this.field7524 != null) {
                for (int var25 = 0; var25 < this.field7582; var25++) {
                    class204 var26 = this.field7524[var25];
                    class497 var27 = this.field7619[var25];
                    var27.field7249 = class413.field5903[this.field7583[var26.field2702] & 0xFFFF] & 0xFFFFFF | var27.field7249 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field7582; var35++) {
                class497 var36 = this.field7619[var35];
                var36.field7238 += arg2;
                var36.field7248 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field7582; var37++) {
                class497 var38 = this.field7619[var37];
                var38.field7246 = var38.field7246 * arg2 >> 7;
                var38.field7247 = var38.field7247 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field7582; var39++) {
                class497 var40 = this.field7619[var39];
                var40.field7251 = var40.field7251 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "()[Lsu;")
    public final class142[] method2009() {
        field7577++;
        return this.field7575;
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
    public static final void method3091(int arg0) {
        class275.field3667.method1139(((float) class319.field4256.field4667 * 0.1F + 0.7F) * 1.1523438F);
        field7562++;
        class275.field3667.method1181(class378.field5477, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
        class275.field3667.method1167(class485.field7142, -1, arg0);
        class275.field3667.method1159(class525.field7728);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZIIIIIIII)Z")
    private final boolean method3092(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field7547++;
        if (arg4 > arg7 && arg1 > arg7 && arg7 < arg6) {
            return false;
        }
        if (arg0) {
            this.field7619 = null;
        }
        if (arg4 < arg7 && arg1 < arg7 && arg6 < arg7) {
            return false;
        } else if (arg8 > arg5 && arg5 < arg2 && arg3 > arg5) {
            return false;
        } else {
            return arg8 >= arg5 || arg2 >= arg5 || arg5 <= arg3;
        }
    }

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "(I)V")
    public final void method2039(int arg0) {
        field7573++;
        int var2 = class456.field6812[arg0];
        int var3 = class456.field6811[arg0];
        for (int var4 = 0; var4 < this.field7591; var4++) {
            int var5 = this.field7566[var4] * var3 + this.field7543[var4] * var2 >> 15;
            this.field7543[var4] = this.field7543[var4] * var3 - (this.field7566[var4] * var2) >> 15;
            this.field7566[var4] = var5;
        }
        if (this.field7602 != null) {
            this.field7602.field5070 = null;
        }
        this.field7592 = false;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "()[Lop;")
    public final class127[] method2015() {
        field7563++;
        return this.field7519;
    }

    @OriginalMember(owner = "client!pg", name = "EA", descriptor = "(Li;)Li;")
    public final class31 method2017(class31 arg0) {
        field7608++;
        if (this.field7529 == 0) {
            return null;
        }
        if (!this.field7592) {
            this.method3081(0);
        }
        int var2;
        int var3;
        if (this.field7521.field5431 <= 0) {
            var2 = this.field7533 - (this.field7521.field5431 * this.field7535 >> 8) >> this.field7521.field5308;
            var3 = this.field7551 - (this.field7521.field5431 * this.field7580 >> 8) >> this.field7521.field5308;
        } else {
            var2 = this.field7533 - (this.field7521.field5431 * this.field7580 >> 8) >> this.field7521.field5308;
            var3 = this.field7551 - (this.field7521.field5431 * this.field7535 >> 8) >> this.field7521.field5308;
        }
        int var4;
        int var5;
        if (this.field7521.field5343 <= 0) {
            var4 = this.field7603 - (this.field7521.field5343 * this.field7535 >> 8) >> this.field7521.field5308;
            var5 = this.field7609 - (this.field7521.field5343 * this.field7580 >> 8) >> this.field7521.field5308;
        } else {
            var4 = this.field7603 - (this.field7521.field5343 * this.field7580 >> 8) >> this.field7521.field5308;
            var5 = this.field7609 - (this.field7521.field5343 * this.field7535 >> 8) >> this.field7521.field5308;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class429 var8 = (class429) arg0;
        class429 var9;
        if (var8 != null && var8.method2640(var7, var6, 1633034480)) {
            var9 = var8;
            var8.method2636((byte) 57);
        } else {
            var9 = new class429(this.field7521, var6, var7);
        }
        var9.method2637(var4, var5, 106, var3, var2);
        this.method3080(var9, true);
        return var9;
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "()V")
    public final void method2013() {
        field7607++;
        if (this.field7529 <= 0 || this.field7621 <= 0) {
            return;
        }
        this.method3088(125, false);
        if ((this.field7567 & 0x10) == 0 && this.field7525.field1848 == null) {
            this.method3087(false, (byte) -126);
        }
        this.method3090(false);
    }

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "()I")
    public final int method2028() {
        field7568++;
        if (!this.field7592) {
            this.method3081(0);
        }
        return this.field7536;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)[[[B")
    public static final byte[][][] method3093(int arg0, int arg1) {
        field7617++;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg1;
        int var4 = arg1;
        byte[] var5 = new byte[arg1 * arg1];
        int var6 = 0;
        for (int var7 = 0; var7 < var4; var7++) {
            for (int var132 = 0; var132 < var3; var132++) {
                if (var132 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        var2[0][0] = var5;
        byte[] var8 = new byte[var3 * var4];
        int var9 = 0;
        for (int var10 = var4 - 1; var10 >= 0; var10--) {
            for (int var131 = 0; var131 < var4; var131++) {
                if (var10 >= var131) {
                    var8[var9] = -1;
                }
                var9++;
            }
        }
        var2[0][1] = var8;
        byte[] var11 = new byte[var3 * var4];
        int var12 = 0;
        for (int var13 = 0; var13 < var4; var13++) {
            for (int var130 = 0; var130 < var3; var130++) {
                if (var13 <= var130) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        var2[0][2] = var11;
        int var14 = 0;
        byte[] var15 = new byte[var3 * var4];
        for (int var16 = var4 - 1; var16 >= 0; var16--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if (var16 <= var129) {
                    var15[var14] = -1;
                }
                var14++;
            }
        }
        var2[0][3] = var15;
        int var17 = 0;
        byte[] var18 = new byte[var3 * var4];
        for (int var19 = var4 - 1; var19 >= 0; var19--) {
            for (int var128 = 0; var128 < var3; var128++) {
                if (var19 >> 1 >= var128) {
                    var18[var17] = -1;
                }
                var17++;
            }
        }
        var2[1][0] = var18;
        int var20 = 0;
        byte[] var21 = new byte[var3 * var4];
        for (int var22 = 0; var22 < var4; var22++) {
            for (int var127 = 0; var127 < var3; var127++) {
                if (var20 >= 0 && var21.length > var20) {
                    if ((var22 << 1) <= var127) {
                        var21[var20] = -1;
                    }
                    var20++;
                } else {
                    var20++;
                }
            }
        }
        var2[1][1] = var21;
        int var23 = 0;
        byte[] var24 = new byte[var3 * var4];
        for (int var25 = 0; var25 < var4; var25++) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if (var126 <= (var25 >> 1)) {
                    var24[var23] = -1;
                }
                var23++;
            }
        }
        var2[1][2] = var24;
        byte[] var26 = new byte[var3 * var4];
        int var27 = 0;
        for (int var28 = var4 - 1; var28 >= 0; var28--) {
            for (int var125 = var3 - 1; var125 >= 0; var125--) {
                if ((var28 << 1) <= var125) {
                    var26[var27] = -1;
                }
                var27++;
            }
        }
        var2[1][3] = var26;
        int var29 = 0;
        byte[] var30 = new byte[var3 * var4];
        for (int var31 = var4 - 1; var31 >= 0; var31--) {
            for (int var124 = var3 - 1; var124 >= 0; var124--) {
                if (var31 >> 1 >= var124) {
                    var30[var29] = -1;
                }
                var29++;
            }
        }
        var2[2][0] = var30;
        int var32 = 0;
        byte[] var33 = new byte[var3 * var4];
        for (int var34 = var4 - 1; var34 >= 0; var34--) {
            for (int var123 = 0; var123 < var3; var123++) {
                if (var34 << 1 <= var123) {
                    var33[var32] = -1;
                }
                var32++;
            }
        }
        var2[2][1] = var33;
        byte[] var35 = new byte[var3 * var4];
        int var36 = 0;
        for (int var37 = 0; var37 < var4; var37++) {
            for (int var122 = 0; var122 < var3; var122++) {
                if ((var37 >> 1) >= var122) {
                    var35[var36] = -1;
                }
                var36++;
            }
        }
        var2[2][2] = var35;
        int var38 = 0;
        byte[] var39 = new byte[var3 * var4];
        for (int var40 = 0; var40 < var4; var40++) {
            for (int var121 = var3 - 1; var121 >= 0; var121--) {
                if (var121 >= var40 << 1) {
                    var39[var38] = -1;
                }
                var38++;
            }
        }
        var2[2][3] = var39;
        byte[] var41 = new byte[var3 * var4];
        int var42 = 0;
        for (int var43 = var4 - 1; var43 >= 0; var43--) {
            for (int var120 = 0; var120 < var3; var120++) {
                if (var43 >> 1 <= var120) {
                    var41[var42] = -1;
                }
                var42++;
            }
        }
        var2[3][0] = var41;
        byte[] var44 = new byte[var3 * var4];
        int var45 = 0;
        for (int var46 = 0; var46 < var4; var46++) {
            for (int var119 = 0; var119 < var3; var119++) {
                if (var119 <= (var46 << 1)) {
                    var44[var45] = -1;
                }
                var45++;
            }
        }
        var2[3][1] = var44;
        byte[] var47 = new byte[var3 * var4];
        int var48 = 0;
        if (arg0 != -16384) {
            field7628 = null;
        }
        for (int var49 = 0; var49 < var4; var49++) {
            for (int var118 = var3 - 1; var118 >= 0; var118--) {
                if (var118 >= var49 >> 1) {
                    var47[var48] = -1;
                }
                var48++;
            }
        }
        var2[3][2] = var47;
        byte[] var50 = new byte[var3 * var4];
        int var51 = 0;
        for (int var52 = var4 - 1; var52 >= 0; var52--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if (var52 << 1 >= var117) {
                    var50[var51] = -1;
                }
                var51++;
            }
        }
        var2[3][3] = var50;
        int var53 = 0;
        byte[] var54 = new byte[var3 * var4];
        for (int var55 = var4 - 1; var55 >= 0; var55--) {
            for (int var116 = var3 - 1; var116 >= 0; var116--) {
                if ((var55 >> 1) <= var116) {
                    var54[var53] = -1;
                }
                var53++;
            }
        }
        var2[4][0] = var54;
        int var56 = 0;
        byte[] var57 = new byte[var3 * var4];
        for (int var58 = var4 - 1; var58 >= 0; var58--) {
            for (int var115 = 0; var115 < var3; var115++) {
                if (var115 <= (var58 << 1)) {
                    var57[var56] = -1;
                }
                var56++;
            }
        }
        var2[4][1] = var57;
        int var59 = 0;
        byte[] var60 = new byte[var3 * var4];
        for (int var61 = 0; var61 < var4; var61++) {
            for (int var114 = 0; var114 < var3; var114++) {
                if (var114 >= (var61 >> 1)) {
                    var60[var59] = -1;
                }
                var59++;
            }
        }
        var2[4][2] = var60;
        int var62 = 0;
        byte[] var63 = new byte[var3 * var4];
        for (int var64 = 0; var64 < var4; var64++) {
            for (int var113 = var3 - 1; var113 >= 0; var113--) {
                if (var113 <= (var64 << 1)) {
                    var63[var62] = -1;
                }
                var62++;
            }
        }
        var2[4][3] = var63;
        int var65 = 0;
        byte[] var66 = new byte[var3 * var4];
        for (int var67 = 0; var67 < var4; var67++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if ((var3 / 2) >= var112) {
                    var66[var65] = -1;
                }
                var65++;
            }
        }
        var2[5][0] = var66;
        int var68 = 0;
        byte[] var69 = new byte[var3 * var4];
        for (int var70 = 0; var70 < var4; var70++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if (var70 <= (var4 / 2)) {
                    var69[var68] = -1;
                }
                var68++;
            }
        }
        var2[5][1] = var69;
        int var71 = 0;
        byte[] var72 = new byte[var3 * var4];
        for (int var73 = 0; var73 < var4; var73++) {
            for (int var110 = 0; var110 < var3; var110++) {
                if (var3 / 2 <= var110) {
                    var72[var71] = -1;
                }
                var71++;
            }
        }
        var2[5][2] = var72;
        byte[] var74 = new byte[var3 * var4];
        int var75 = 0;
        for (int var76 = 0; var76 < var4; var76++) {
            for (int var109 = 0; var109 < var3; var109++) {
                if (var76 >= var4 / 2) {
                    var74[var75] = -1;
                }
                var75++;
            }
        }
        var2[5][3] = var74;
        int var77 = 0;
        byte[] var78 = new byte[var3 * var4];
        for (int var79 = 0; var79 < var4; var79++) {
            for (int var108 = 0; var108 < var3; var108++) {
                if (var108 <= var79 - (var4 / 2)) {
                    var78[var77] = -1;
                }
                var77++;
            }
        }
        var2[6][0] = var78;
        byte[] var80 = new byte[var3 * var4];
        int var81 = 0;
        for (int var82 = var4 - 1; var82 >= 0; var82--) {
            for (int var107 = 0; var107 < var3; var107++) {
                if ((var82 - (var4 / 2)) >= var107) {
                    var80[var81] = -1;
                }
                var81++;
            }
        }
        var2[6][1] = var80;
        int var83 = 0;
        byte[] var84 = new byte[var3 * var4];
        for (int var85 = var4 - 1; var85 >= 0; var85--) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if (var106 <= var85 - (var4 / 2)) {
                    var84[var83] = -1;
                }
                var83++;
            }
        }
        var2[6][2] = var84;
        int var86 = 0;
        byte[] var87 = new byte[var3 * var4];
        for (int var88 = 0; var88 < var4; var88++) {
            for (int var105 = var3 - 1; var105 >= 0; var105--) {
                if ((var88 - (var4 / 2)) >= var105) {
                    var87[var86] = -1;
                }
                var86++;
            }
        }
        var2[6][3] = var87;
        int var89 = 0;
        byte[] var90 = new byte[var3 * var4];
        for (int var91 = 0; var91 < var4; var91++) {
            for (int var104 = 0; var104 < var3; var104++) {
                if (var104 >= var91 - (var4 / 2)) {
                    var90[var89] = -1;
                }
                var89++;
            }
        }
        var2[7][0] = var90;
        int var92 = 0;
        byte[] var93 = new byte[var3 * var4];
        for (int var94 = var4 - 1; var94 >= 0; var94--) {
            for (int var103 = 0; var103 < var3; var103++) {
                if (var103 >= (var94 - (var4 / 2))) {
                    var93[var92] = -1;
                }
                var92++;
            }
        }
        var2[7][1] = var93;
        byte[] var95 = new byte[var3 * var4];
        int var96 = 0;
        for (int var97 = var4 - 1; var97 >= 0; var97--) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if ((var97 - (var4 / 2)) <= var102) {
                    var95[var96] = -1;
                }
                var96++;
            }
        }
        var2[7][2] = var95;
        byte[] var98 = new byte[var3 * var4];
        int var99 = 0;
        for (int var100 = 0; var100 < var4; var100++) {
            for (int var101 = var3 - 1; var101 >= 0; var101--) {
                if (var101 >= (var100 - (var4 / 2))) {
                    var98[var99] = -1;
                }
                var99++;
            }
        }
        var2[7][3] = var98;
        return var2;
    }

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "(I)V")
    public final void method2034(int arg0) {
        this.field7615 = arg0;
        field7579++;
        this.field7523 = true;
        if (this.field7596 != null && (this.field7615 & 0x10000) == 0) {
            this.field7595 = this.field7596.field4249;
            this.field7545 = this.field7596.field4255;
            this.field7556 = this.field7596.field4251;
            this.field7532 = this.field7596.field4254;
            this.field7596 = null;
        }
        this.method3090(false);
    }

    @OriginalMember(owner = "client!pg", name = "Z", descriptor = "()I")
    public final int method2048() {
        if (!this.field7592) {
            this.method3081(0);
        }
        field7589++;
        return this.field7603;
    }

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "(III)V")
    public final void method2035(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field7591; var4++) {
            if (arg0 != 128) {
                this.field7566[var4] = this.field7566[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field7543[var4] = this.field7543[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field7622[var4] = this.field7622[var4] * arg2 >> 7;
            }
        }
        field7544++;
        if (this.field7602 != null) {
            this.field7602.field5070 = null;
        }
        this.field7592 = false;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(IIII)Z")
    public static final boolean method3094(int arg0, int arg1, int arg2, int arg3) {
        field7517++;
        class448 var4 = (class448) class48.method279(arg0, arg3, arg1);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class406.method2489(17223, var4);
        }
        class448 var6 = (class448) class365.method2172(arg0, arg3, arg1, field7629 == null ? (field7629 = method3095("mh")) : field7629);
        if (var6 != null) {
            var5 &= class406.method2489(17223, var6);
        }
        if (arg2 != 1) {
            return false;
        }
        class448 var7 = (class448) class434.method2671(arg0, arg3, arg1);
        if (var7 != null) {
            var5 &= class406.method2489(17223, var7);
        }
        return var5;
    }

    @OriginalMember(owner = "client!pg", name = "RA", descriptor = "()I")
    public final int method2025() {
        field7516++;
        return this.field7615;
    }

    @OriginalMember(owner = "client!pg", name = "KA", descriptor = "()V")
    public final void method2029() {
        field7605++;
        for (int var1 = 0; var1 < this.field7534; var1++) {
            this.field7566[var1] = this.field7566[var1] + 7 >> 4;
            this.field7543[var1] = this.field7543[var1] + 7 >> 4;
            this.field7622[var1] = this.field7622[var1] + 7 >> 4;
        }
        this.field7592 = false;
        if (this.field7602 != null) {
            this.field7602.field5070 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "(SS)V")
    public final void method2018(short arg0, short arg1) {
        field7515++;
        class16 var3 = this.field7521.field3772;
        for (int var4 = 0; var4 < this.field7584; var4++) {
            if (this.field7572[var4] == arg0) {
                this.field7572[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class433 var7 = var3.method94(arg0 & 0xFFFF, (byte) -72);
            var6 = var7.field6303;
            var5 = var7.field6317;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class433 var10 = var3.method94(arg1 & 0xFFFF, (byte) -72);
            var8 = var10.field6317;
            var9 = var10.field6303;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field7524 != null) {
            for (int var11 = 0; var11 < this.field7582; var11++) {
                class204 var12 = this.field7524[var11];
                class497 var13 = this.field7619[var11];
                var13.field7249 = var13.field7249 & 0xFF000000 | class413.field5903[this.field7583[var12.field2702] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field7518 != null) {
            this.field7518.field5070 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lc;Lut;I)V")
    public final void method2051(class124 arg0, class82 arg1, int arg2) {
        field7540++;
        if (this.field7529 == 0) {
            return;
        }
        class257 var4 = this.field7521.field5425;
        class257 var5 = (class257) arg0;
        if (!this.field7592) {
            this.method3081(0);
        }
        this.method3089((byte) 119, var5);
        class414.field5917 = var4.field3411 * var5.field3426 + var4.field3437 * var5.field3412 + var4.field3410 * var5.field3432 + var4.field3426;
        class81.field989 = var4.field3411 * var5.field3410 + var4.field3437 * var5.field3427 + var4.field3410 * var5.field3429;
        float var6 = (float) this.field7535 * class81.field989 + class414.field5917;
        float var7 = (float) this.field7580 * class81.field989 + class414.field5917;
        float var8;
        float var9;
        if (var6 > var7) {
            var8 = (float) (-this.field7536) + var7;
            var9 = (float) this.field7536 + var6;
        } else {
            var9 = (float) this.field7536 + var7;
            var8 = var6 - (float) this.field7536;
        }
        if ((this.field7521.field5357 <= var8) || ((float) this.field7521.field5400 >= var9)) {
            return;
        }
        class294.field3893 = var4.field3424 * var5.field3410 + var4.field3431 * var5.field3427 + var4.field3427 * var5.field3429;
        class99.field1361 = var4.field3424 * var5.field3426 + var4.field3431 * var5.field3412 + var4.field3427 * var5.field3432 + var4.field3412;
        float var10 = (float) this.field7535 * class294.field3893 + class99.field1361;
        float var11 = (float) this.field7580 * class294.field3893 + class99.field1361;
        float var12;
        float var13;
        if ((var10 > var11)) {
            var12 = ((float) (-this.field7536) + var11) * (float) this.field7521.field5411;
            var13 = ((float) this.field7536 + var10) * (float) this.field7521.field5411;
        } else {
            var12 = ((float) (-this.field7536) + var10) * (float) this.field7521.field5411;
            var13 = ((float) this.field7536 + var11) * (float) this.field7521.field5411;
        }
        if ((this.field7521.field5443 <= var12 / var9) || (this.field7521.field5441 >= var13 / var9)) {
            return;
        }
        class233.field3119 = var4.field3414 * var5.field3426 + var4.field3429 * var5.field3432 + var4.field3405 * var5.field3412 + var4.field3432;
        class457.field6822 = var4.field3414 * var5.field3410 + var4.field3429 * var5.field3429 + var4.field3405 * var5.field3427;
        float var14 = (float) this.field7535 * class457.field6822 + class233.field3119;
        float var15 = (float) this.field7580 * class457.field6822 + class233.field3119;
        float var16;
        float var17;
        if ((var14 > var15)) {
            var17 = (var15 - (float) this.field7536) * (float) this.field7521.field5393;
            var16 = ((float) this.field7536 + var14) * (float) this.field7521.field5393;
        } else {
            var16 = ((float) this.field7536 + var15) * (float) this.field7521.field5393;
            var17 = ((float) (-this.field7536) + var14) * (float) this.field7521.field5393;
        }
        if ((var17 / var9 >= this.field7521.field5446) || (var16 / var9 <= this.field7521.field5362)) {
            return;
        }
        if (arg1 != null || this.field7524 != null) {
            class471.field6986 = var4.field3414 * var5.field3437 + var4.field3429 * var5.field3405 + var4.field3405 * var5.field3431;
            class115.field1507 = var4.field3411 * var5.field3411 + var4.field3437 * var5.field3424 + var4.field3410 * var5.field3414;
            class495.field7228 = var4.field3414 * var5.field3411 + var4.field3429 * var5.field3414 + var4.field3405 * var5.field3424;
            class68.field785 = var4.field3424 * var5.field3411 + var4.field3431 * var5.field3424 + var4.field3427 * var5.field3414;
            class519.field7649 = var4.field3424 * var5.field3437 + var4.field3431 * var5.field3431 + var4.field3427 * var5.field3405;
            class75.field953 = var4.field3411 * var5.field3437 + var4.field3437 * var5.field3431 + var4.field3410 * var5.field3405;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field7551 + this.field7533 >> 1;
            int var21 = this.field7609 + this.field7603 >> 1;
            int var22 = (int) ((float) var21 * class68.field785 + (float) this.field7535 * class294.field3893 + (float) var20 * class519.field7649 + class99.field1361);
            int var23 = (int) ((float) var21 * class495.field7228 + (float) this.field7535 * class457.field6822 + (float) var20 * class471.field6986 + class233.field3119);
            int var24 = (int) ((float) var21 * class115.field1507 + (float) this.field7535 * class81.field989 + (float) var20 * class75.field953 + class414.field5917);
            if (this.field7521.field5400 > var24) {
                var18 = true;
            } else {
                arg1.field996 = this.field7521.field5435 + (this.field7521.field5411 * var22 / var24);
                arg1.field995 = this.field7521.field5393 * var23 / var24 + this.field7521.field5371;
            }
            int var25 = (int) ((float) var21 * class68.field785 + (float) this.field7580 * class294.field3893 + (float) var20 * class519.field7649 + class99.field1361);
            int var26 = (int) ((float) var21 * class495.field7228 + (float) this.field7580 * class457.field6822 + (float) var20 * class471.field6986 + class233.field3119);
            int var27 = (int) ((float) var21 * class115.field1507 + (float) this.field7580 * class81.field989 + (float) var20 * class75.field953 + class414.field5917);
            if (this.field7521.field5400 > var27) {
                var18 = true;
            } else {
                arg1.field992 = this.field7521.field5435 + (this.field7521.field5411 * var25 / var27);
                arg1.field997 = this.field7521.field5393 * var26 / var27 + this.field7521.field5371;
            }
            if (var18) {
                if (this.field7521.field5400 > var24 && var27 < this.field7521.field5400) {
                    var19 = false;
                } else if (var24 < this.field7521.field5400) {
                    int var28 = (var27 - this.field7521.field5400 << 16) / (var27 - var24);
                    int var29 = var25 + ((var25 - var22) * var28 >> 16);
                    int var30 = ((var26 - var23) * var28 >> 16) + var26;
                    arg1.field996 = this.field7521.field5411 * var29 / this.field7521.field5400 + this.field7521.field5435;
                    arg1.field995 = this.field7521.field5371 + (this.field7521.field5393 * var30 / this.field7521.field5400);
                } else if (var27 < this.field7521.field5400) {
                    int var31 = (var24 - this.field7521.field5400 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    int var33 = ((var23 - var26) * var31 >> 16) + var23;
                    arg1.field996 = this.field7521.field5411 * var32 / this.field7521.field5400 + this.field7521.field5435;
                    arg1.field995 = this.field7521.field5371 + (this.field7521.field5393 * var33 / this.field7521.field5400);
                }
            }
            if (var19) {
                arg1.field994 = true;
                if (var27 >= var24) {
                    arg1.field993 = this.field7521.field5435 + ((this.field7536 + var25) * this.field7521.field5411 / var27) - arg1.field992;
                } else {
                    arg1.field993 = (var22 + this.field7536) * this.field7521.field5411 / var24 + this.field7521.field5435 - arg1.field996;
                }
            }
        }
        this.field7521.method2282((byte) 79);
        this.field7521.method2227(-2097153, var5);
        this.method3079(679111105);
        this.field7521.method2301(-12885);
        this.method3084(-618691769);
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lur;)V")
    public class517(class377 arg0) {
        this.field7521 = arg0;
        this.field7602 = new class374(null, 5126, 3, 0);
        this.field7610 = new class374(null, 5126, 2, 0);
        this.field7526 = new class374(null, 5126, 3, 0);
        this.field7518 = new class374(null, 5121, 4, 0);
        this.field7525 = new class138();
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lur;Lpq;IIII)V")
    public class517(class377 arg0, class131 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7521 = arg0;
        this.field7613 = arg5;
        this.field7615 = arg2;
        if (class302.method1801((byte) 22, arg5, arg2)) {
            this.field7602 = new class374(null, 5126, 3, 0);
        }
        if (class92.method511(arg2, arg5, 104)) {
            this.field7610 = new class374(null, 5126, 2, 0);
        }
        if (class299.method1787(arg5, 98, arg2)) {
            this.field7526 = new class374(null, 5126, 3, 0);
        }
        if (class242.method1511(arg2, arg5, 3)) {
            this.field7518 = new class374(null, 5121, 4, 0);
        }
        if (class401.method2477(arg2, (byte) -84, arg5)) {
            this.field7525 = new class138();
        }
        class16 var7 = arg0.field3772;
        int[] var8 = new int[arg1.field1705];
        this.field7578 = new int[arg1.field1701 + 1];
        for (int var9 = 0; var9 < arg1.field1705; var9++) {
            if ((arg1.field1718 == null || arg1.field1718[var9] != 2) && (arg1.field1691 == null || arg1.field1691[var9] == -1 || !var7.method94(arg1.field1691[var9] & 0xFFFF, (byte) -72).field6310)) {
                var8[this.field7584++] = var9;
                this.field7578[arg1.field1724[var9]]++;
                this.field7578[arg1.field1734[var9]]++;
                this.field7578[arg1.field1725[var9]]++;
            }
        }
        this.field7621 = this.field7584;
        long[] var10 = new long[this.field7584];
        boolean var11 = (this.field7615 & 0x100) != 0;
        label494: for (int var12 = 0; var12 < this.field7584; var12++) {
            int var180 = var8[var12];
            class433 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field1738 != null) {
                for (int var186 = 0; var186 < arg1.field1738.length; var186++) {
                    class388 var187 = arg1.field1738[var186];
                    if (var187.field5628 == var180) {
                        class65 var188 = class478.method2915(true, var187.field5630);
                        if (var188.field747) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field7621--;
                            continue label494;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field1691 != null) {
                var189 = arg1.field1691[var180];
                if (var189 != -1) {
                    var181 = var7.method94(var189 & 0xFFFF, (byte) -72);
                    var185 = var181.field6312;
                    var184 = var181.field6320;
                }
            }
            boolean var190 = arg1.field1737 != null && arg1.field1737[var180] != 0 || var181 != null && !var181.field6311;
            if ((var11 || var190) && arg1.field1720 != null) {
                var182 += arg1.field1720[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = (var184 & 0xFF << 8) + var182;
            int var192 = (var185 & 0xFF) + var191;
            int var193 = (var189 & 0xFFFF << 16) + var183;
            int var194 = (var12 & 0xFFFF) + var193;
            var10[var12] = ((long) var192 << 32) + (long) var194;
        }
        class459.method2824((byte) -115, var8, var10);
        this.field7534 = arg1.field1727;
        this.field7591 = arg1.field1701;
        this.field7566 = arg1.field1735;
        this.field7543 = arg1.field1717;
        this.field7622 = arg1.field1710;
        this.field7555 = arg1.field1695;
        this.field7519 = arg1.field1733;
        this.field7575 = arg1.field1699;
        class71[] var13 = new class71[this.field7591];
        if (arg1.field1738 != null) {
            this.field7582 = arg1.field1738.length;
            this.field7524 = new class204[this.field7582];
            this.field7619 = new class497[this.field7582];
            for (int var14 = 0; var14 < this.field7582; var14++) {
                class388 var15 = arg1.field1738[var14];
                class65 var16 = class478.method2915(true, var15.field5630);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field7584; var18++) {
                    if (var8[var18] == var15.field5628) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class413.field5903[arg1.field1708[var15.field5628] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field1737 == null ? 0 : arg1.field1737[var15.field5628]) << 24;
                this.field7524[var14] = new class204(var17, arg1.field1724[var15.field5628], arg1.field1734[var15.field5628], arg1.field1725[var15.field5628], var16.field752, var16.field748, var16.field744, var16.field743, var16.field746, var16.field747, var16.field741, var15.field5629);
                this.field7619[var14] = new class497(var20);
            }
        }
        int var21 = this.field7584 * 3;
        this.field7586 = (short) arg4;
        this.field7612 = new short[var21];
        if (arg1.field1728 != null) {
            this.field7574 = new short[this.field7584];
        }
        this.field7614 = new short[this.field7584];
        this.field7595 = new short[var21];
        this.field7597 = new short[this.field7584];
        this.field7528 = new float[var21];
        this.field7561 = (short) arg3;
        this.field7572 = new short[this.field7584];
        this.field7556 = new byte[var21];
        this.field7554 = new byte[this.field7584];
        this.field7620 = new short[this.field7584];
        this.field7583 = new short[this.field7584];
        class420.field6095 = new long[var21];
        this.field7532 = new short[var21];
        this.field7545 = new short[var21];
        this.field7538 = new float[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field1701; var23++) {
            int var179 = this.field7578[var23];
            this.field7578[var23] = var22;
            var13[var23] = new class71();
            var22 += var179;
        }
        this.field7578[arg1.field1701] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field1730 != null) {
            int var28 = arg1.field1736;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            var26 = new int[var28];
            var27 = new float[var28][];
            var25 = new int[var28];
            for (int var36 = 0; var36 < this.field7584; var36++) {
                int var43 = var8[var36];
                if (arg1.field1730[var43] != -1) {
                    int var44 = arg1.field1730[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field1724[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field1734[var43];
                        } else {
                            var46 = arg1.field1725[var43];
                        }
                        int var47 = arg1.field1735[var46];
                        int var48 = arg1.field1717[var46];
                        int var49 = arg1.field1710[var46];
                        if (var47 < var29[var44]) {
                            var29[var44] = var47;
                        }
                        if (var47 > var30[var44]) {
                            var30[var44] = var47;
                        }
                        if (var48 < var31[var44]) {
                            var31[var44] = var48;
                        }
                        if (var48 > var32[var44]) {
                            var32[var44] = var48;
                        }
                        if (var33[var44] > var49) {
                            var33[var44] = var49;
                        }
                        if (var34[var44] < var49) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var24 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field1729[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var40;
                    float var41;
                    float var42;
                    if (var38 == 1) {
                        int var39 = arg1.field1712[var37];
                        var40 = 64.0F / (float) arg1.field1741[var37];
                        if (var39 == 0) {
                            var41 = 1.0F;
                            var42 = 1.0F;
                        } else if (var39 <= 0) {
                            var41 = 1.0F;
                            var42 = (float) (-var39) / 1024.0F;
                        } else {
                            var41 = (float) var39 / 1024.0F;
                            var42 = 1.0F;
                        }
                    } else if (var38 == 2) {
                        var42 = 64.0F / (float) arg1.field1712[var37];
                        var41 = 64.0F / (float) arg1.field1731[var37];
                        var40 = 64.0F / (float) arg1.field1741[var37];
                    } else {
                        var41 = (float) arg1.field1731[var37] / 1024.0F;
                        var40 = (float) arg1.field1741[var37] / 1024.0F;
                        var42 = (float) arg1.field1712[var37] / 1024.0F;
                    }
                    var27[var37] = class289.method1735((byte) -106, class95.method534(255, arg1.field1692[var37]), var42, arg1.field1690[var37], arg1.field1689[var37], var40, arg1.field1713[var37], var41);
                }
            }
        }
        class154[] var50 = new class154[arg1.field1705];
        for (int var51 = 0; var51 < arg1.field1705; var51++) {
            short var158 = arg1.field1724[var51];
            short var159 = arg1.field1734[var51];
            short var160 = arg1.field1725[var51];
            int var161 = this.field7566[var159] - this.field7566[var158];
            int var162 = this.field7543[var159] - this.field7543[var158];
            int var163 = this.field7622[var159] - this.field7622[var158];
            int var164 = this.field7566[var160] - this.field7566[var158];
            int var165 = this.field7543[var160] - this.field7543[var158];
            int var166 = this.field7622[var160] - this.field7622[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - (var161 * var166);
            int var169 = var161 * var165 - (var162 * var164);
            while (var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192) {
                var167 >>= 0x1;
                var169 >>= 0x1;
                var168 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var169 * var169 + var167 * var167 + var168 * var168));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var169 * 256 / var170;
            int var172 = var168 * 256 / var170;
            int var173 = var167 * 256 / var170;
            byte var174 = arg1.field1718 == null ? 0 : arg1.field1718[var51];
            if (var174 == 0) {
                class71 var175 = var13[var158];
                var175.field909 += var172;
                var175.field910 += var171;
                var175.field906 += var173;
                var175.field907++;
                class71 var176 = var13[var159];
                var176.field910 += var171;
                var176.field909 += var172;
                var176.field906 += var173;
                var176.field907++;
                class71 var177 = var13[var160];
                var177.field909 += var172;
                var177.field910 += var171;
                var177.field907++;
                var177.field906 += var173;
            } else if (var174 == 1) {
                class154 var178 = var50[var51] = new class154();
                var178.field2015 = var172;
                var178.field2018 = var173;
                var178.field2014 = var171;
            }
        }
        for (int var52 = 0; var52 < this.field7584; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field1708[var68] & 0xFFFF;
            short var70;
            if (arg1.field1691 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field1691[var68];
            }
            int var71;
            if (arg1.field1730 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field1730[var68];
            }
            int var72;
            if (arg1.field1737 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field1737[var68] & 0xFF;
            }
            float var73 = 0.0F;
            float var74 = 0.0F;
            float var75 = 0.0F;
            float var76 = 0.0F;
            float var77 = 0.0F;
            float var78 = 0.0F;
            byte var79 = 0;
            byte var80 = 0;
            int var81 = 0;
            if (var70 != -1) {
                if (var71 == -1) {
                    var78 = 0.0F;
                    var76 = 1.0F;
                    var77 = 0.0F;
                    var79 = 1;
                    var75 = 1.0F;
                    var80 = 2;
                    var74 = 1.0F;
                    var73 = 0.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field1729[var71];
                    if (var82 == 0) {
                        short var83 = arg1.field1724[var68];
                        short var84 = arg1.field1734[var68];
                        short var85 = arg1.field1725[var68];
                        short var86 = arg1.field1690[var71];
                        short var87 = arg1.field1713[var71];
                        short var88 = arg1.field1689[var71];
                        float var89 = (float) arg1.field1735[var86];
                        float var90 = (float) arg1.field1717[var86];
                        float var91 = (float) arg1.field1710[var86];
                        float var92 = (float) arg1.field1735[var87] - var89;
                        float var93 = (float) arg1.field1717[var87] - var90;
                        float var94 = (float) arg1.field1710[var87] - var91;
                        float var95 = (float) arg1.field1735[var88] - var89;
                        float var96 = (float) arg1.field1717[var88] - var90;
                        float var97 = (float) arg1.field1710[var88] - var91;
                        float var98 = (float) arg1.field1735[var83] - var89;
                        float var99 = (float) arg1.field1717[var83] - var90;
                        float var100 = (float) arg1.field1710[var83] - var91;
                        float var101 = (float) arg1.field1735[var84] - var89;
                        float var102 = (float) arg1.field1717[var84] - var90;
                        float var103 = (float) arg1.field1710[var84] - var91;
                        float var104 = (float) arg1.field1735[var85] - var89;
                        float var105 = (float) arg1.field1717[var85] - var90;
                        float var106 = (float) arg1.field1710[var85] - var91;
                        float var107 = var93 * var97 - (var94 * var96);
                        float var108 = var94 * var95 - var92 * var97;
                        float var109 = var92 * var96 - var93 * var95;
                        float var110 = var96 * var109 - var97 * var108;
                        float var111 = var97 * var107 - (var95 * var109);
                        float var112 = var95 * var108 - var96 * var107;
                        float var113 = 1.0F / (var94 * var112 + var92 * var110 + var93 * var111);
                        var77 = (var106 * var112 + var104 * var110 + var105 * var111) * var113;
                        var73 = (var100 * var112 + var98 * var110 + var99 * var111) * var113;
                        var75 = (var103 * var112 + var101 * var110 + var102 * var111) * var113;
                        float var114 = var93 * var109 - var94 * var108;
                        float var115 = var92 * var108 - (var93 * var107);
                        float var116 = var94 * var107 - (var92 * var109);
                        float var117 = 1.0F / (var97 * var115 + var95 * var114 + var96 * var116);
                        var78 = (var106 * var115 + var104 * var114 + var105 * var116) * var117;
                        var76 = (var103 * var115 + var101 * var114 + var102 * var116) * var117;
                        var74 = (var100 * var115 + var98 * var114 + var99 * var116) * var117;
                    } else {
                        short var118 = arg1.field1724[var68];
                        short var119 = arg1.field1734[var68];
                        short var120 = arg1.field1725[var68];
                        int var121 = var24[var71];
                        int var122 = var25[var71];
                        int var123 = var26[var71];
                        float[] var124 = var27[var71];
                        byte var125 = arg1.field1707[var71];
                        float var126 = (float) arg1.field1694[var71] / 256.0F;
                        if (var82 == 1) {
                            float var127 = (float) arg1.field1731[var71] / 1024.0F;
                            class249.method1544(var121, var123, arg1.field1717[var118], var125, var124, var126, arg1.field1710[var118], var127, arg1.field1735[var118], 7257, var122);
                            var74 = class198.field2556;
                            var73 = class107.field1451;
                            class249.method1544(var121, var123, arg1.field1717[var119], var125, var124, var126, arg1.field1710[var119], var127, arg1.field1735[var119], 7257, var122);
                            var76 = class198.field2556;
                            var75 = class107.field1451;
                            class249.method1544(var121, var123, arg1.field1717[var120], var125, var124, var126, arg1.field1710[var120], var127, arg1.field1735[var120], 7257, var122);
                            var77 = class107.field1451;
                            var78 = class198.field2556;
                            float var128 = var127 / 2.0F;
                            if ((var125 & 0x1) == 0) {
                                if (var75 - var73 > var128) {
                                    var79 = 1;
                                    var75 -= var127;
                                } else if (var128 < var73 - var75) {
                                    var75 += var127;
                                    var79 = 2;
                                }
                                if (var77 - var73 > var128) {
                                    var80 = 1;
                                    var77 -= var127;
                                } else if (var128 < var73 - var77) {
                                    var80 = 2;
                                    var77 += var127;
                                }
                            } else {
                                if ((var128 < var78 - var74)) {
                                    var78 -= var127;
                                    var80 = 1;
                                } else if (var128 < var74 - var78) {
                                    var80 = 2;
                                    var78 += var127;
                                }
                                if (var128 < var76 - var74) {
                                    var76 -= var127;
                                    var79 = 1;
                                } else if (var128 < var74 - var76) {
                                    var79 = 2;
                                    var76 += var127;
                                }
                            }
                        } else if (var82 == 2) {
                            float var129 = (float) arg1.field1706[var71] / 256.0F;
                            float var130 = (float) arg1.field1697[var71] / 256.0F;
                            int var131 = arg1.field1735[var119] - arg1.field1735[var118];
                            int var132 = arg1.field1717[var119] - arg1.field1717[var118];
                            int var133 = arg1.field1710[var119] - arg1.field1710[var118];
                            int var134 = arg1.field1735[var120] - arg1.field1735[var118];
                            int var135 = arg1.field1717[var120] - arg1.field1717[var118];
                            int var136 = arg1.field1710[var120] - arg1.field1710[var118];
                            int var137 = var132 * var136 - var133 * var135;
                            int var138 = var133 * var134 - (var131 * var136);
                            int var139 = var131 * var135 - (var132 * var134);
                            float var140 = 64.0F / (float) arg1.field1712[var71];
                            float var141 = 64.0F / (float) arg1.field1741[var71];
                            float var142 = 64.0F / (float) arg1.field1731[var71];
                            float var143 = (var124[2] * (float) var139 + var124[0] * (float) var137 + var124[1] * (float) var138) / var140;
                            float var144 = (var124[5] * (float) var139 + var124[4] * (float) var138 + var124[3] * (float) var137) / var141;
                            float var145 = (var124[8] * (float) var139 + var124[7] * (float) var138 + var124[6] * (float) var137) / var142;
                            var81 = class253.method1568(var145, var143, 2, var144);
                            class476.method2906(true, var129, arg1.field1735[var118], var122, var126, var130, arg1.field1717[var118], var125, var121, var123, var124, var81, arg1.field1710[var118]);
                            var74 = class234.field3130;
                            var73 = class179.field2322;
                            class476.method2906(true, var129, arg1.field1735[var119], var122, var126, var130, arg1.field1717[var119], var125, var121, var123, var124, var81, arg1.field1710[var119]);
                            var75 = class179.field2322;
                            var76 = class234.field3130;
                            class476.method2906(true, var129, arg1.field1735[var120], var122, var126, var130, arg1.field1717[var120], var125, var121, var123, var124, var81, arg1.field1710[var120]);
                            var78 = class234.field3130;
                            var77 = class179.field2322;
                        } else if (var82 == 3) {
                            class456.method2811(arg1.field1710[var118], (byte) 26, var121, arg1.field1735[var118], var122, var123, var125, var124, arg1.field1717[var118], var126);
                            var74 = class212.field2855;
                            var73 = class361.field4905;
                            class456.method2811(arg1.field1710[var119], (byte) 25, var121, arg1.field1735[var119], var122, var123, var125, var124, arg1.field1717[var119], var126);
                            var75 = class361.field4905;
                            var76 = class212.field2855;
                            class456.method2811(arg1.field1710[var120], (byte) 9, var121, arg1.field1735[var120], var122, var123, var125, var124, arg1.field1717[var120], var126);
                            var78 = class212.field2855;
                            var77 = class361.field4905;
                            if ((var125 & 0x1) == 0) {
                                if (var75 - var73 > 0.5F) {
                                    var79 = 1;
                                    var75--;
                                } else if (var73 - var75 > 0.5F) {
                                    var75++;
                                    var79 = 2;
                                }
                                if (var77 - var73 > 0.5F) {
                                    var80 = 1;
                                    var77--;
                                } else if (var73 - var77 > 0.5F) {
                                    var80 = 2;
                                    var77++;
                                }
                            } else {
                                if ((var76 - var74 > 0.5F)) {
                                    var79 = 1;
                                    var76--;
                                } else if (var74 - var76 > 0.5F) {
                                    var76++;
                                    var79 = 2;
                                }
                                if ((var78 - var74 > 0.5F)) {
                                    var80 = 1;
                                    var78--;
                                } else if (var74 - var78 > 0.5F) {
                                    var80 = 2;
                                    var78++;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field1718 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field1718[var68];
            }
            if (var146 == 0) {
                long var150 = ((long) (var81 << 24) - (-((long) (var69 << 8)) - (long) var72) << 32) + (long) (var71 << 2);
                short var152 = arg1.field1724[var68];
                short var153 = arg1.field1734[var68];
                short var154 = arg1.field1725[var68];
                class71 var155 = var13[var152];
                this.field7614[var52] = this.method3086(var155.field910, var155.field909, var152, var74, var73, (byte) -113, var155.field907, var150, var155.field906, arg1);
                class71 var156 = var13[var153];
                this.field7597[var52] = this.method3086(var156.field910, var156.field909, var153, var76, var75, (byte) -112, var156.field907, (long) var79 + var150, var156.field906, arg1);
                class71 var157 = var13[var154];
                this.field7620[var52] = this.method3086(var157.field910, var157.field909, var154, var78, var77, (byte) -98, var157.field907, (long) var80 + var150, var157.field906, arg1);
            } else if (var146 == 1) {
                class154 var147 = var50[var68];
                long var148 = ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32) + (long) ((var147.field2014 + 256 << 22) + (var147.field2018 > 0 ? 1024 : 2048) + (var71 << 2) + (var147.field2015 + 256 << 12));
                this.field7614[var52] = this.method3086(var147.field2014, var147.field2015, arg1.field1724[var68], var74, var73, (byte) 99, 0, var148, var147.field2018, arg1);
                this.field7597[var52] = this.method3086(var147.field2014, var147.field2015, arg1.field1734[var68], var76, var75, (byte) -6, 0, (long) var79 + var148, var147.field2018, arg1);
                this.field7620[var52] = this.method3086(var147.field2014, var147.field2015, arg1.field1725[var68], var78, var77, (byte) 100, 0, (long) var80 + var148, var147.field2018, arg1);
            }
            if (arg1.field1691 == null) {
                this.field7572[var52] = -1;
            } else {
                this.field7572[var52] = arg1.field1691[var68];
            }
            if (arg1.field1737 != null) {
                this.field7554[var52] = arg1.field1737[var68];
            }
            if (arg1.field1728 != null) {
                this.field7574[var52] = arg1.field1728[var68];
            }
            this.field7583[var52] = arg1.field1708[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field7621; var55++) {
            short var67 = this.field7572[var55];
            if (var54 != var67) {
                var53++;
                var54 = var67;
            }
        }
        this.field7560 = new int[var53 + 1];
        int var56 = 0;
        short var57 = -10000;
        for (int var58 = 0; var58 < this.field7621; var58++) {
            short var66 = this.field7572[var58];
            if (var57 != var66) {
                this.field7560[var56++] = var58;
                var57 = var66;
            }
        }
        this.field7560[var56] = this.field7621;
        class420.field6095 = null;
        this.field7545 = class257.method1589(this.field7529, this.field7545, -18);
        this.field7595 = class257.method1589(this.field7529, this.field7595, -5);
        this.field7532 = class257.method1589(this.field7529, this.field7532, -127);
        this.field7556 = class233.method1476(this.field7529, this.field7556, -103);
        this.field7538 = class262.method1612(this.field7529, -85, this.field7538);
        this.field7528 = class262.method1612(this.field7529, -121, this.field7528);
        if (arg1.field1740 != null && class342.method1987((byte) -51, arg2, this.field7613)) {
            this.field7530 = arg1.method797((byte) 125);
        }
        if (arg1.field1738 != null && class531.method3155((byte) -75, arg2, this.field7613)) {
            this.field7553 = arg1.method794(73);
        }
        if (arg1.field1703 != null && class475.method2901(arg2, this.field7613, (byte) -63)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field7584; var61++) {
                int var65 = arg1.field1703[var8[var61]];
                if (var65 >= 0) {
                    if (var59 < var65) {
                        var59 = var65;
                    }
                    int var10002 = var60[var65]++;
                }
            }
            this.field7520 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field7520[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field7584; var63++) {
                int var64 = arg1.field1703[var8[var63]];
                if (var64 >= 0) {
                    this.field7520[var64][var60[var64]++] = var63;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "da", descriptor = "(IILya;Lya;III)V")
    public final void method2038(int arg0, int arg1, class38 arg2, class38 arg3, int arg4, int arg5, int arg6) {
        if (!this.field7592) {
            this.method3081(0);
        }
        field7564++;
        int var8 = this.field7533 + arg4;
        int var9 = arg4 + this.field7551;
        int var10 = this.field7603 + arg6;
        int var11 = this.field7609 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field391 <= arg2.field392 + var9 >> arg2.field387 || var10 < 0 || arg2.field394 <= arg2.field392 + var11 >> arg2.field387) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field392 + var9 >> arg3.field387 >= arg3.field391 || var10 < 0 || arg3.field394 <= var11 + arg3.field392 >> arg3.field387) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field387;
            int var13 = var9 + arg2.field392 - 1 >> arg2.field387;
            int var14 = var10 >> arg2.field387;
            int var15 = arg2.field392 + var11 - 1 >> arg2.field387;
            if (arg5 == arg2.method217(var12, var14) && arg5 == arg2.method217(var13, var14) && arg5 == arg2.method217(var12, var15) && arg5 == arg2.method217(var13, var15)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field7591; var16++) {
                this.field7543[var16] -= arg5 - arg2.method216(this.field7566[var16] + arg4, this.field7622[var16] - -arg6);
            }
        } else if (arg0 == 2) {
            short var17 = this.field7535;
            if (var17 == 0) {
                return;
            }
            for (int var18 = 0; var18 < this.field7591; var18++) {
                int var19 = (this.field7543[var18] << 16) / var17;
                if (var19 < arg1) {
                    this.field7543[var18] += (arg2.method216(this.field7566[var18] + arg4, this.field7622[var18] + arg6) - arg5) * (arg1 - var19) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var29 = (arg1 & 0xFF) * 4;
            int var30 = (arg1 >> 8 & 0xFF) * 4;
            int var31 = arg1 >> 16 & 0xFF << 6;
            int var32 = (arg1 >> 24 & 0xFF) << 6;
            if (arg4 - (var29 >> 1) < 0 || arg2.field391 << arg2.field387 <= (var29 >> 1) + arg4 + arg2.field392 || arg6 - (var30 >> 1) < 0 || arg6 + (var30 >> 1) + arg2.field392 >= arg2.field394 << arg2.field387) {
                return;
            }
            this.method2204(arg6, arg5, arg4, arg2, var32, var29, var30, 11628, var31);
        } else if (arg0 == 4) {
            int var20 = this.field7580 - this.field7535;
            for (int var21 = 0; var21 < this.field7591; var21++) {
                this.field7543[var21] = var20 + (this.field7543[var21] - (arg5 - arg3.method216(this.field7566[var21] + arg4, this.field7622[var21] + arg6)));
            }
        } else if (arg0 == 5) {
            int var22 = this.field7580 - this.field7535;
            for (int var23 = 0; var23 < this.field7591; var23++) {
                int var24 = this.field7566[var23] + arg4;
                int var25 = this.field7622[var23] + arg6;
                int var26 = arg2.method216(var24, var25);
                int var27 = arg3.method216(var24, var25);
                int var28 = var26 - var27;
                this.field7543[var23] = -arg5 - (-var26 - ((this.field7543[var23] << 8) / var22 * var28 >> 8));
            }
        }
        if (this.field7602 != null) {
            this.field7602.field5070 = null;
        }
        this.field7592 = false;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3095(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        int var0 = 0;
        field7628 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field7628[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }
}
