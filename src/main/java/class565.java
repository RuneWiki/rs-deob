import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class565 extends class55 {

    @OriginalMember(owner = "client!ji", name = "U", descriptor = "I")
    private int field8189 = 0;

    @OriginalMember(owner = "client!ji", name = "E", descriptor = "I")
    private int field8173 = 0;

    @OriginalMember(owner = "client!ji", name = "Ib", descriptor = "I")
    private int field8229 = 0;

    @OriginalMember(owner = "client!ji", name = "mc", descriptor = "I")
    private int field8259 = 0;

    @OriginalMember(owner = "client!ji", name = "ac", descriptor = "Z")
    private boolean field8247 = false;

    @OriginalMember(owner = "client!ji", name = "ec", descriptor = "Z")
    private boolean field8251 = true;

    @OriginalMember(owner = "client!ji", name = "zc", descriptor = "I")
    private int field8272 = 0;

    @OriginalMember(owner = "client!ji", name = "cb", descriptor = "Z")
    private boolean field8197 = false;

    @OriginalMember(owner = "client!ji", name = "C", descriptor = "Lkga;")
    private class506 field8171;

    @OriginalMember(owner = "client!ji", name = "rc", descriptor = "Lrba;")
    private class399 field8264;

    @OriginalMember(owner = "client!ji", name = "lc", descriptor = "Lrba;")
    private class399 field8258;

    @OriginalMember(owner = "client!ji", name = "F", descriptor = "Lrba;")
    private class399 field8174;

    @OriginalMember(owner = "client!ji", name = "mb", descriptor = "Lrba;")
    private class399 field8207;

    @OriginalMember(owner = "client!ji", name = "Xb", descriptor = "Lrk;")
    private class30 field8244;

    @OriginalMember(owner = "client!ji", name = "Tb", descriptor = "I")
    private int field8240;

    @OriginalMember(owner = "client!ji", name = "yc", descriptor = "I")
    private int field8271;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "[I")
    private int[] field8160;

    @OriginalMember(owner = "client!ji", name = "R", descriptor = "[S")
    private short[] field8186;

    @OriginalMember(owner = "client!ji", name = "lb", descriptor = "[I")
    private int[] field8206;

    @OriginalMember(owner = "client!ji", name = "bc", descriptor = "[I")
    private int[] field8248;

    @OriginalMember(owner = "client!ji", name = "kb", descriptor = "[I")
    private int[] field8205;

    @OriginalMember(owner = "client!ji", name = "Ac", descriptor = "[Lnba;")
    private class271[] field8273;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "[Lfk;")
    private class604[] field8158;

    @OriginalMember(owner = "client!ji", name = "bb", descriptor = "I")
    private int field8196;

    @OriginalMember(owner = "client!ji", name = "L", descriptor = "[Luj;")
    private class351[] field8180;

    @OriginalMember(owner = "client!ji", name = "Ec", descriptor = "[Lir;")
    private class25[] field8277;

    @OriginalMember(owner = "client!ji", name = "ob", descriptor = "[S")
    private short[] field8209;

    @OriginalMember(owner = "client!ji", name = "xc", descriptor = "[S")
    private short[] field8270;

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "[S")
    private short[] field8165;

    @OriginalMember(owner = "client!ji", name = "hb", descriptor = "[F")
    private float[] field8202;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "[S")
    private short[] field8159;

    @OriginalMember(owner = "client!ji", name = "Bc", descriptor = "[S")
    private short[] field8274;

    @OriginalMember(owner = "client!ji", name = "wb", descriptor = "[B")
    private byte[] field8217;

    @OriginalMember(owner = "client!ji", name = "ub", descriptor = "[F")
    private float[] field8215;

    @OriginalMember(owner = "client!ji", name = "kc", descriptor = "[S")
    private short[] field8257;

    @OriginalMember(owner = "client!ji", name = "qb", descriptor = "[S")
    private short[] field8211;

    @OriginalMember(owner = "client!ji", name = "rb", descriptor = "S")
    private short field8212;

    @OriginalMember(owner = "client!ji", name = "tb", descriptor = "[S")
    private short[] field8214;

    @OriginalMember(owner = "client!ji", name = "Q", descriptor = "[B")
    private byte[] field8185;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "[S")
    private short[] field8161;

    @OriginalMember(owner = "client!ji", name = "hc", descriptor = "S")
    private short field8254;

    @OriginalMember(owner = "client!ji", name = "eb", descriptor = "[S")
    private short[] field8199;

    @OriginalMember(owner = "client!ji", name = "Z", descriptor = "[I")
    private int[] field8194;

    @OriginalMember(owner = "client!ji", name = "Cb", descriptor = "[[I")
    private int[][] field8223;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "[[I")
    private int[][] field8163;

    @OriginalMember(owner = "client!ji", name = "nb", descriptor = "[[I")
    private int[][] field8208;

    @OriginalMember(owner = "client!ji", name = "Ub", descriptor = "I")
    public static int field8241 = 0;

    @OriginalMember(owner = "client!ji", name = "I", descriptor = "B")
    private byte field8177;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public static int field8157;

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
    public static int field8162;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
    public static int field8164;

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "I")
    public static int field8166;

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "I")
    public static int field8168;

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "I")
    public static int field8169;

    @OriginalMember(owner = "client!ji", name = "B", descriptor = "I")
    public static int field8170;

    @OriginalMember(owner = "client!ji", name = "D", descriptor = "I")
    public static int field8172;

    @OriginalMember(owner = "client!ji", name = "G", descriptor = "I")
    public static int field8175;

    @OriginalMember(owner = "client!ji", name = "H", descriptor = "I")
    public static int field8176;

    @OriginalMember(owner = "client!ji", name = "J", descriptor = "I")
    public static int field8178;

    @OriginalMember(owner = "client!ji", name = "K", descriptor = "I")
    public static int field8179;

    @OriginalMember(owner = "client!ji", name = "M", descriptor = "I")
    public static int field8181;

    @OriginalMember(owner = "client!ji", name = "O", descriptor = "I")
    public static int field8183;

    @OriginalMember(owner = "client!ji", name = "P", descriptor = "I")
    public static int field8184;

    @OriginalMember(owner = "client!ji", name = "S", descriptor = "I")
    public static int field8187;

    @OriginalMember(owner = "client!ji", name = "T", descriptor = "I")
    public static int field8188;

    @OriginalMember(owner = "client!ji", name = "V", descriptor = "I")
    public static int field8190;

    @OriginalMember(owner = "client!ji", name = "X", descriptor = "I")
    public static int field8192;

    @OriginalMember(owner = "client!ji", name = "Y", descriptor = "I")
    public static int field8193;

    @OriginalMember(owner = "client!ji", name = "ab", descriptor = "I")
    public static int field8195;

    @OriginalMember(owner = "client!ji", name = "db", descriptor = "I")
    public static int field8198;

    @OriginalMember(owner = "client!ji", name = "fb", descriptor = "I")
    public static int field8200;

    @OriginalMember(owner = "client!ji", name = "gb", descriptor = "I")
    public static int field8201;

    @OriginalMember(owner = "client!ji", name = "ib", descriptor = "I")
    public static int field8203;

    @OriginalMember(owner = "client!ji", name = "jb", descriptor = "I")
    public static int field8204;

    @OriginalMember(owner = "client!ji", name = "pb", descriptor = "I")
    public static int field8210;

    @OriginalMember(owner = "client!ji", name = "sb", descriptor = "I")
    public static int field8213;

    @OriginalMember(owner = "client!ji", name = "vb", descriptor = "I")
    public static int field8216;

    @OriginalMember(owner = "client!ji", name = "yb", descriptor = "I")
    public static int field8219;

    @OriginalMember(owner = "client!ji", name = "zb", descriptor = "I")
    public static int field8220;

    @OriginalMember(owner = "client!ji", name = "Ab", descriptor = "I")
    public static int field8221;

    @OriginalMember(owner = "client!ji", name = "Bb", descriptor = "I")
    public static int field8222;

    @OriginalMember(owner = "client!ji", name = "Db", descriptor = "I")
    public static int field8224;

    @OriginalMember(owner = "client!ji", name = "Eb", descriptor = "I")
    public static int field8225;

    @OriginalMember(owner = "client!ji", name = "Fb", descriptor = "I")
    public static int field8226;

    @OriginalMember(owner = "client!ji", name = "Gb", descriptor = "I")
    public static int field8227;

    @OriginalMember(owner = "client!ji", name = "Hb", descriptor = "I")
    public static int field8228;

    @OriginalMember(owner = "client!ji", name = "Jb", descriptor = "I")
    public static int field8230;

    @OriginalMember(owner = "client!ji", name = "Kb", descriptor = "I")
    public static int field8231;

    @OriginalMember(owner = "client!ji", name = "Lb", descriptor = "I")
    public static int field8232;

    @OriginalMember(owner = "client!ji", name = "Mb", descriptor = "I")
    public static int field8233;

    @OriginalMember(owner = "client!ji", name = "Nb", descriptor = "I")
    public static int field8234;

    @OriginalMember(owner = "client!ji", name = "Ob", descriptor = "I")
    public static int field8235;

    @OriginalMember(owner = "client!ji", name = "Sb", descriptor = "I")
    public static int field8239;

    @OriginalMember(owner = "client!ji", name = "Vb", descriptor = "I")
    public static int field8242;

    @OriginalMember(owner = "client!ji", name = "Wb", descriptor = "I")
    public static int field8243;

    @OriginalMember(owner = "client!ji", name = "Zb", descriptor = "I")
    public static int field8246;

    @OriginalMember(owner = "client!ji", name = "dc", descriptor = "I")
    public static int field8250;

    @OriginalMember(owner = "client!ji", name = "fc", descriptor = "I")
    public static int field8252;

    @OriginalMember(owner = "client!ji", name = "gc", descriptor = "I")
    public static int field8253;

    @OriginalMember(owner = "client!ji", name = "ic", descriptor = "I")
    public static int field8255;

    @OriginalMember(owner = "client!ji", name = "jc", descriptor = "I")
    public static int field8256;

    @OriginalMember(owner = "client!ji", name = "nc", descriptor = "I")
    public static int field8260;

    @OriginalMember(owner = "client!ji", name = "oc", descriptor = "I")
    public static int field8261;

    @OriginalMember(owner = "client!ji", name = "qc", descriptor = "I")
    public static int field8263;

    @OriginalMember(owner = "client!ji", name = "sc", descriptor = "I")
    public static int field8265;

    @OriginalMember(owner = "client!ji", name = "tc", descriptor = "I")
    public static int field8266;

    @OriginalMember(owner = "client!ji", name = "vc", descriptor = "I")
    public static int field8268;

    @OriginalMember(owner = "client!ji", name = "wc", descriptor = "I")
    public static int field8269;

    @OriginalMember(owner = "client!ji", name = "Cc", descriptor = "I")
    public static int field8275;

    @OriginalMember(owner = "client!ji", name = "Dc", descriptor = "I")
    public static int field8276;

    @OriginalMember(owner = "client!ji", name = "Pb", descriptor = "Luq;")
    private class145 field8236;

    @OriginalMember(owner = "client!ji", name = "xb", descriptor = "Lcfa;")
    private class151 field8218;

    @OriginalMember(owner = "client!ji", name = "cc", descriptor = "Lew;")
    private class458 field8249;

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "S")
    private short field8167;

    @OriginalMember(owner = "client!ji", name = "N", descriptor = "S")
    private short field8182;

    @OriginalMember(owner = "client!ji", name = "W", descriptor = "S")
    private short field8191;

    @OriginalMember(owner = "client!ji", name = "Qb", descriptor = "S")
    private short field8237;

    @OriginalMember(owner = "client!ji", name = "Rb", descriptor = "S")
    private short field8238;

    @OriginalMember(owner = "client!ji", name = "Yb", descriptor = "S")
    private short field8245;

    @OriginalMember(owner = "client!ji", name = "pc", descriptor = "S")
    private short field8262;

    @OriginalMember(owner = "client!ji", name = "uc", descriptor = "S")
    private short field8267;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZIIILq;I)Z")
    private final boolean method3302(boolean arg0, int arg1, int arg2, int arg3, class394 arg4, int arg5) {
        field8157++;
        class510 var7 = (class510) arg4;
        class510 var8 = this.field8171.field7298;
        float var9 = var7.field7455 * var8.field7453 + var7.field7441 * var8.field7432 + var7.field7434 * var8.field7440 + var8.field7441;
        float var10 = var7.field7455 * var8.field7449 + var7.field7441 * var8.field7454 + var7.field7434 * var8.field7424 + var8.field7434;
        class510.field7464 = var7.field7426 * var8.field7442 + var7.field7454 * var8.field7429 + var7.field7432 * var8.field7426;
        class395.field5584 = var7.field7429 * var8.field7449 + var7.field7440 * var8.field7454 + var7.field7424 * var8.field7424;
        class670.field9639 = var7.field7429 * var8.field7453 + var7.field7440 * var8.field7432 + var7.field7424 * var8.field7440;
        class251.field3446 = var7.field7426 * var8.field7449 + var7.field7454 * var8.field7424 + var7.field7432 * var8.field7454;
        float var11 = var7.field7455 * var8.field7442 + var7.field7441 * var8.field7426 + var7.field7434 * var8.field7429 + var8.field7455;
        class692.field9846 = var7.field7442 * var8.field7453 + var7.field7453 * var8.field7432 + var7.field7449 * var8.field7440;
        class661.field9381 = var7.field7426 * var8.field7453 + var7.field7454 * var8.field7440 + var7.field7432 * var8.field7432;
        class658.field9345 = var7.field7429 * var8.field7442 + var7.field7440 * var8.field7426 + var7.field7424 * var8.field7429;
        class475.field6657 = var7.field7442 * var8.field7449 + var7.field7453 * var8.field7454 + var7.field7449 * var8.field7424;
        class627.field8994 = var7.field7442 * var8.field7442 + var7.field7453 * var8.field7426 + var7.field7449 * var8.field7429;
        boolean var12 = false;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        float var15 = Float.MAX_VALUE;
        float var16 = -3.4028235E38F;
        int var17 = this.field8171.field7336;
        int var18 = this.field8171.field7357;
        if (!this.field8197) {
            this.method3316(-10110);
        }
        class306.field4070[0] = this.field8267;
        class504.field7022[0] = this.field8238;
        class306.field4070[1] = this.field8182;
        class485.field6798[0] = this.field8191;
        class504.field7022[1] = this.field8238;
        class485.field6798[1] = this.field8191;
        class306.field4070[2] = this.field8267;
        class504.field7022[2] = this.field8167;
        class485.field6798[2] = this.field8191;
        class306.field4070[3] = this.field8182;
        class504.field7022[3] = this.field8167;
        class485.field6798[3] = this.field8191;
        class306.field4070[4] = this.field8267;
        class504.field7022[4] = this.field8238;
        class485.field6798[4] = this.field8245;
        class306.field4070[5] = this.field8182;
        class504.field7022[5] = this.field8238;
        class485.field6798[5] = this.field8245;
        class306.field4070[6] = this.field8267;
        class504.field7022[6] = this.field8167;
        class485.field6798[6] = this.field8245;
        class306.field4070[7] = this.field8182;
        class504.field7022[7] = this.field8167;
        class485.field6798[7] = this.field8245;
        if (arg1 > -87) {
            method3314((byte) -67, -47);
        }
        for (int var19 = 0; var19 < 8; var19++) {
            float var40 = (float) class504.field7022[var19];
            float var41 = (float) class306.field4070[var19];
            float var42 = (float) class485.field6798[var19];
            float var43 = class475.field6657 * var42 + class395.field5584 * var40 + class251.field3446 * var41 + var10;
            float var44 = class627.field8994 * var42 + class658.field9345 * var40 + class510.field7464 * var41 + var11;
            float var45 = class692.field9846 * var42 + class670.field9639 * var40 + class661.field9381 * var41 + var9;
            if ((float) this.field8171.field7332 <= var44) {
                if (arg5 > 0) {
                    var44 = arg5;
                }
                float var46 = (float) var17 * var45 / var44 + (float) this.field8171.field7337;
                if (var14 < var46) {
                    var14 = var46;
                }
                if (var46 < var13) {
                    var13 = var46;
                }
                float var47 = (float) var18 * var43 / var44 + (float) this.field8171.field7356;
                if (var16 < var47) {
                    var16 = var47;
                }
                if (var47 < var15) {
                    var15 = var47;
                }
                var12 = true;
            }
        }
        if (var12 && var13 < (float) arg2 && (float) arg2 < var14 && var15 < (float) arg3 && (float) arg3 < var16) {
            if (arg0) {
                return true;
            }
            if (this.field8272 > this.field8171.field7416.length) {
                this.field8171.field7416 = new int[this.field8272];
                this.field8171.field7415 = new int[this.field8272];
            }
            int[] var20 = this.field8171.field7416;
            int[] var21 = this.field8171.field7415;
            for (int var22 = 0; var22 < this.field8229; var22++) {
                float var24 = (float) this.field8205[var22];
                float var25 = (float) this.field8206[var22];
                float var26 = (float) this.field8248[var22];
                float var27 = class475.field6657 * var26 + class395.field5584 * var24 + class251.field3446 * var25 + var10;
                float var28 = class627.field8994 * var26 + class658.field9345 * var24 + class510.field7464 * var25 + var11;
                float var29 = class692.field9846 * var26 + class670.field9639 * var24 + class661.field9381 * var25 + var9;
                if ((float) this.field8171.field7332 <= var28) {
                    if (arg5 > 0) {
                        var28 = arg5;
                    }
                    int var30 = (int) ((float) var17 * var29 / var28 + (float) this.field8171.field7337);
                    int var31 = (int) ((float) var18 * var27 / var28 + (float) this.field8171.field7356);
                    int var32 = this.field8160[var22];
                    int var33 = this.field8160[var22 + 1];
                    for (int var34 = var32; var34 < var33; var34++) {
                        int var35 = this.field8211[var34] - 1;
                        if (var35 == -1) {
                            break;
                        }
                        var20[var35] = var30;
                        var21[var35] = var31;
                    }
                } else {
                    int var36 = this.field8160[var22];
                    int var37 = this.field8160[var22 + 1];
                    for (int var38 = var36; var38 < var37; var38++) {
                        int var39 = this.field8211[var38] - 1;
                        if (var39 == -1) {
                            break;
                        }
                        var20[this.field8211[var38] - 1] = -999999;
                    }
                }
            }
            for (int var23 = 0; var23 < this.field8189; var23++) {
                if (var20[this.field8209[var23]] != -999999 && var20[this.field8161[var23]] != -999999 && var20[this.field8214[var23]] != -999999 && this.method3310(var21[this.field8214[var23]], var20[this.field8209[var23]], arg3, var20[this.field8161[var23]], (byte) 91, var21[this.field8161[var23]], arg2, var20[this.field8214[var23]], var21[this.field8209[var23]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lq;)V")
    public final void method104(class394 arg0) {
        field8195++;
        class510 var2 = (class510) arg0;
        if (this.field8273 != null) {
            for (int var3 = 0; var3 < this.field8273.length; var3++) {
                class271 var4 = this.field8273[var3];
                class271 var5 = var4;
                if (var4.field3699 != null) {
                    var5 = var4.field3699;
                }
                var5.field3709 = (int) ((float) this.field8248[var4.field3703] * var2.field7453 + (float) this.field8206[var4.field3703] * var2.field7432 + (float) this.field8205[var4.field3703] * var2.field7440 + var2.field7441);
                var5.field3707 = (int) ((float) this.field8248[var4.field3703] * var2.field7449 + (float) this.field8206[var4.field3703] * var2.field7454 + (float) this.field8205[var4.field3703] * var2.field7424 + var2.field7434);
                var5.field3705 = (int) ((float) this.field8248[var4.field3703] * var2.field7442 + (float) this.field8206[var4.field3703] * var2.field7426 + (float) this.field8205[var4.field3703] * var2.field7429 + var2.field7455);
                var5.field3712 = (int) ((float) this.field8248[var4.field3702] * var2.field7453 + (float) this.field8206[var4.field3702] * var2.field7432 + (float) this.field8205[var4.field3702] * var2.field7440 + var2.field7441);
                var5.field3716 = (int) ((float) this.field8248[var4.field3702] * var2.field7449 + (float) this.field8206[var4.field3702] * var2.field7454 + (float) this.field8205[var4.field3702] * var2.field7424 + var2.field7434);
                var5.field3706 = (int) ((float) this.field8248[var4.field3702] * var2.field7442 + (float) this.field8206[var4.field3702] * var2.field7426 + (float) this.field8205[var4.field3702] * var2.field7429 + var2.field7455);
                var5.field3701 = (int) ((float) this.field8248[var4.field3708] * var2.field7453 + (float) this.field8206[var4.field3708] * var2.field7432 + (float) this.field8205[var4.field3708] * var2.field7440 + var2.field7441);
                var5.field3710 = (int) ((float) this.field8248[var4.field3708] * var2.field7449 + (float) this.field8206[var4.field3708] * var2.field7454 + (float) this.field8205[var4.field3708] * var2.field7424 + var2.field7434);
                var5.field3696 = (int) ((float) this.field8248[var4.field3708] * var2.field7442 + (float) this.field8206[var4.field3708] * var2.field7426 + (float) this.field8205[var4.field3708] * var2.field7429 + var2.field7455);
            }
        }
        if (this.field8158 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field8158.length; var6++) {
            class604 var7 = this.field8158[var6];
            class604 var8 = var7;
            if (var7.field8706 != null) {
                var8 = var7.field8706;
            }
            if (var7.field8709 == null) {
                var7.field8709 = var2.method708();
            } else {
                var7.field8709.method711(var2);
            }
            var8.field8704 = (int) ((float) this.field8248[var7.field8705] * var2.field7453 + (float) this.field8206[var7.field8705] * var2.field7432 + (float) this.field8205[var7.field8705] * var2.field7440 + var2.field7441);
            var8.field8702 = (int) ((float) this.field8248[var7.field8705] * var2.field7449 + (float) this.field8206[var7.field8705] * var2.field7454 + (float) this.field8205[var7.field8705] * var2.field7424 + var2.field7434);
            var8.field8703 = (int) ((float) this.field8248[var7.field8705] * var2.field7442 + (float) this.field8206[var7.field8705] * var2.field7426 + (float) this.field8205[var7.field8705] * var2.field7429 + var2.field7455);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lq;IZ)V")
    public final void method86(class394 arg0, int arg1, boolean arg2) {
        field8275++;
        if (this.field8186 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field8229; var5++) {
            if ((arg1 & this.field8186[var5]) != 0) {
                if (arg2) {
                    arg0.method725(this.field8206[var5], this.field8205[var5], this.field8248[var5], var4);
                } else {
                    arg0.method720(this.field8206[var5], this.field8205[var5], this.field8248[var5], var4);
                }
                this.field8206[var5] = var4[0];
                this.field8205[var5] = var4[1];
                this.field8248[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "L", descriptor = "()V")
    public final void method127() {
        field8187++;
        for (int var1 = 0; var1 < this.field8173; var1++) {
            this.field8206[var1] = this.field8206[var1] + 7 >> 4;
            this.field8205[var1] = this.field8205[var1] + 7 >> 4;
            this.field8248[var1] = this.field8248[var1] + 7 >> 4;
        }
        this.field8197 = false;
        if (this.field8264 != null) {
            this.field8264.field5629 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "S", descriptor = "(Lha;)Lha;")
    public final class54 method133(class54 arg0) {
        field8226++;
        if (this.field8272 == 0) {
            return null;
        }
        if (!this.field8197) {
            this.method3316(-10110);
        }
        int var2;
        int var3;
        if (this.field8171.field7408 <= 0) {
            var2 = this.field8267 - (this.field8171.field7408 * this.field8238 >> 8) >> this.field8171.field7261;
            var3 = this.field8182 - (this.field8171.field7408 * this.field8167 >> 8) >> this.field8171.field7261;
        } else {
            var2 = this.field8267 - (this.field8171.field7408 * this.field8167 >> 8) >> this.field8171.field7261;
            var3 = this.field8182 - (this.field8171.field7408 * this.field8238 >> 8) >> this.field8171.field7261;
        }
        int var4;
        int var5;
        if (this.field8171.field7402 <= 0) {
            var4 = this.field8191 - (this.field8171.field7402 * this.field8238 >> 8) >> this.field8171.field7261;
            var5 = this.field8245 - (this.field8171.field7402 * this.field8167 >> 8) >> this.field8171.field7261;
        } else {
            var4 = this.field8191 - (this.field8171.field7402 * this.field8167 >> 8) >> this.field8171.field7261;
            var5 = this.field8245 - (this.field8171.field7402 * this.field8238 >> 8) >> this.field8171.field7261;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class357 var8 = (class357) arg0;
        class357 var9;
        if (var8 != null && var8.method2011(var7, var6, true)) {
            var9 = var8;
            var8.method2013(0);
        } else {
            var9 = new class357(this.field8171, var6, var7);
        }
        var9.method2015(99, var2, var5, var4, var3);
        this.method3309(var9, true);
        return var9;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lq;Lmj;I)V")
    public final void method67(class394 arg0, class605 arg1, int arg2) {
        field8188++;
        if (this.field8272 == 0) {
            return;
        }
        class510 var4 = this.field8171.field7298;
        class510 var5 = (class510) arg0;
        if (!this.field8197) {
            this.method3316(-10110);
        }
        class33.field672 = var4.field7442 * var5.field7455 + var4.field7429 * var5.field7434 + var4.field7426 * var5.field7441 + var4.field7455;
        class658.field9345 = var4.field7442 * var5.field7429 + var4.field7429 * var5.field7424 + var4.field7426 * var5.field7440;
        float var6 = (float) this.field8238 * class658.field9345 + class33.field672;
        float var7 = (float) this.field8167 * class658.field9345 + class33.field672;
        float var8;
        float var9;
        if (var6 > var7) {
            var8 = (float) this.field8262 + var6;
            var9 = var7 - (float) this.field8262;
        } else {
            var8 = (float) this.field8262 + var7;
            var9 = var6 - (float) this.field8262;
        }
        if ((this.field8171.field7325 <= var9) || ((float) this.field8171.field7332 >= var8)) {
            return;
        }
        class363.field4834 = var4.field7453 * var5.field7455 + var4.field7440 * var5.field7434 + var4.field7432 * var5.field7441 + var4.field7441;
        class670.field9639 = var4.field7453 * var5.field7429 + var4.field7440 * var5.field7424 + var4.field7432 * var5.field7440;
        float var10 = (float) this.field8238 * class670.field9639 + class363.field4834;
        float var11 = (float) this.field8167 * class670.field9639 + class363.field4834;
        float var12;
        float var13;
        if (var11 < var10) {
            var12 = ((float) this.field8262 + var10) * (float) this.field8171.field7336;
            var13 = (var11 - (float) this.field8262) * (float) this.field8171.field7336;
        } else {
            var13 = ((float) (-this.field8262) + var10) * (float) this.field8171.field7336;
            var12 = ((float) this.field8262 + var11) * (float) this.field8171.field7336;
        }
        if ((this.field8171.field7320 <= var13 / var8) || (this.field8171.field7385 >= var12 / var8)) {
            return;
        }
        class363.field4836 = var4.field7449 * var5.field7455 + var4.field7454 * var5.field7441 + var4.field7424 * var5.field7434 + var4.field7434;
        class395.field5584 = var4.field7449 * var5.field7429 + var4.field7454 * var5.field7440 + var4.field7424 * var5.field7424;
        float var14 = (float) this.field8238 * class395.field5584 + class363.field4836;
        float var15 = (float) this.field8167 * class395.field5584 + class363.field4836;
        float var16;
        float var17;
        if (var15 < var14) {
            var16 = (var15 - (float) this.field8262) * (float) this.field8171.field7357;
            var17 = ((float) this.field8262 + var14) * (float) this.field8171.field7357;
        } else {
            var16 = ((float) (-this.field8262) + var14) * (float) this.field8171.field7357;
            var17 = ((float) this.field8262 + var15) * (float) this.field8171.field7357;
        }
        if ((this.field8171.field7393 <= var16 / var8) || (var17 / var8 <= this.field8171.field7305)) {
            return;
        }
        if (arg1 != null || this.field8180 != null) {
            class475.field6657 = var4.field7449 * var5.field7442 + var4.field7454 * var5.field7453 + var4.field7424 * var5.field7449;
            class661.field9381 = var4.field7453 * var5.field7426 + var4.field7440 * var5.field7454 + var4.field7432 * var5.field7432;
            class627.field8994 = var4.field7442 * var5.field7442 + var4.field7429 * var5.field7449 + var4.field7426 * var5.field7453;
            class692.field9846 = var4.field7453 * var5.field7442 + var4.field7440 * var5.field7449 + var4.field7432 * var5.field7453;
            class251.field3446 = var4.field7449 * var5.field7426 + var4.field7454 * var5.field7432 + var4.field7424 * var5.field7454;
            class510.field7464 = var4.field7442 * var5.field7426 + var4.field7429 * var5.field7454 + var4.field7426 * var5.field7432;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field8267 + this.field8182 >> 1;
            int var21 = this.field8191 + this.field8245 >> 1;
            int var22 = (int) ((float) var21 * class692.field9846 + (float) this.field8238 * class670.field9639 + (float) var20 * class661.field9381 + class363.field4834);
            int var23 = (int) ((float) var21 * class475.field6657 + (float) this.field8238 * class395.field5584 + (float) var20 * class251.field3446 + class363.field4836);
            int var24 = (int) ((float) var21 * class627.field8994 + (float) this.field8238 * class658.field9345 + (float) var20 * class510.field7464 + class33.field672);
            if (this.field8171.field7332 <= var24) {
                arg1.field8714 = this.field8171.field7336 * var22 / var24 + this.field8171.field7337;
                arg1.field8716 = this.field8171.field7357 * var23 / var24 + this.field8171.field7356;
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class692.field9846 + (float) this.field8167 * class670.field9639 + (float) var20 * class661.field9381 + class363.field4834);
            int var26 = (int) ((float) var21 * class475.field6657 + (float) this.field8167 * class395.field5584 + (float) var20 * class251.field3446 + class363.field4836);
            int var27 = (int) ((float) var21 * class627.field8994 + (float) this.field8167 * class658.field9345 + (float) var20 * class510.field7464 + class33.field672);
            if (var27 >= this.field8171.field7332) {
                arg1.field8718 = this.field8171.field7357 * var26 / var27 + this.field8171.field7356;
                arg1.field8719 = this.field8171.field7336 * var25 / var27 + this.field8171.field7337;
            } else {
                var18 = true;
            }
            if (var18) {
                if (this.field8171.field7332 > var24 && this.field8171.field7332 > var27) {
                    var19 = false;
                } else if (this.field8171.field7332 > var24) {
                    int var31 = (var27 - this.field8171.field7332 << 16) / (var27 - var24);
                    int var32 = ((var25 - var22) * var31 >> 16) + var25;
                    int var33 = ((var26 - var23) * var31 >> 16) + var26;
                    arg1.field8714 = this.field8171.field7336 * var32 / this.field8171.field7332 + this.field8171.field7337;
                    arg1.field8716 = this.field8171.field7357 * var33 / this.field8171.field7332 + this.field8171.field7356;
                } else if (var27 < this.field8171.field7332) {
                    int var28 = (var24 - this.field8171.field7332 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    int var30 = ((var23 - var26) * var28 >> 16) + var23;
                    arg1.field8714 = this.field8171.field7336 * var29 / this.field8171.field7332 + this.field8171.field7337;
                    arg1.field8716 = this.field8171.field7357 * var30 / this.field8171.field7332 + this.field8171.field7356;
                }
            }
            if (var19) {
                arg1.field8717 = true;
                if (var27 < var24) {
                    arg1.field8715 = (this.field8262 + var22) * this.field8171.field7336 / var24 + this.field8171.field7337 - arg1.field8714;
                } else {
                    arg1.field8715 = (var25 + this.field8262) * this.field8171.field7336 / var27 + this.field8171.field7337 - arg1.field8719;
                }
            }
        }
        this.field8171.method2942(112);
        this.field8171.method2937(false, var5);
        this.method3307(29066);
        this.field8171.method3013(25973);
        this.method3312(7);
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(SS)V")
    public final void method87(short arg0, short arg1) {
        field8219++;
        for (int var3 = 0; var3 < this.field8189; var3++) {
            if (this.field8199[var3] == arg0) {
                this.field8199[var3] = arg1;
            }
        }
        if (this.field8180 != null) {
            for (int var4 = 0; var4 < this.field8196; var4++) {
                class351 var5 = this.field8180[var4];
                class25 var6 = this.field8277[var4];
                var6.field584 = class285.field3868[this.field8199[var5.field4688] & 0xFFFF] & 0xFFFFFF | var6.field584 & 0xFF000000;
            }
        }
        if (this.field8207 != null) {
            this.field8207.field5629 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "()V")
    public final void method80() {
        field8181++;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(JIFLkk;IIFIII)S")
    private final short method3303(long arg0, int arg1, float arg2, class173 arg3, int arg4, int arg5, float arg6, int arg7, int arg8, int arg9) {
        if (arg7 <= 57) {
            this.field8197 = false;
        }
        field8203++;
        int var12 = this.field8160[arg8];
        int var13 = this.field8160[arg8 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field8211[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class628.field9005[var15] == arg0) {
                return (short) (var16 - 1);
            }
        }
        this.field8211[var14] = (short) (this.field8272 + 1);
        class628.field9005[var14] = arg0;
        this.field8270[this.field8272] = (short) arg9;
        this.field8165[this.field8272] = (short) arg4;
        this.field8159[this.field8272] = (short) arg1;
        this.field8217[this.field8272] = (byte) arg5;
        this.field8215[this.field8272] = arg6;
        this.field8202[this.field8272] = arg2;
        return (short) (this.field8272++);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method3304(byte arg0, String arg1) {
        field8261++;
        if (!class99.field1336 || (class251.field3440 & 0x18) == 0) {
            return;
        }
        boolean var2 = false;
        int var3 = class394.field5564;
        int[] var4 = class82.field1176;
        for (int var5 = 0; var5 < var3; var5++) {
            class613 var6 = class184.field2252[var4[var5]];
            if (var6.field8801 != null && var6.field8801.equalsIgnoreCase(arg1) && (class206.field2472 == var6 && (class251.field3440 & 0x10) != 0 || var6 != null && (class251.field3440 & 0x8) != 0)) {
                class417.field5912++;
                class543 var7 = class299.method1780(class84.field1196, class342.field4516, 118);
                var7.field7872.method2268(0, 0);
                var7.field7872.method2256(var4[var5], 2);
                var7.field7872.method2226(class282.field3819, (byte) -58);
                var7.field7872.method2256(class386.field5147, 2);
                var7.field7872.method2233((byte) 86, class391.field5243);
                class511.method3028(7482, var7);
                var2 = true;
                class674.method3833(0, -1, var6.field2689[0], 0, -2, true, var6.method1284((byte) -124), var6.field2686[0], var6.method1284((byte) -124));
                break;
            }
        }
        if (!var2) {
            class175.method1103((byte) 38, 4, class424.field6059.method2561(class370.field4980, 0) + arg1);
        }
        if (class99.field1336) {
            class415.method2491(65);
        }
        if (arg0 <= 15) {
            method3313((byte) 27, -49);
        }
    }

    @OriginalMember(owner = "client!ji", name = "RA", descriptor = "()I")
    public final int method72() {
        if (!this.field8197) {
            this.method3316(-10110);
        }
        field8276++;
        return this.field8237;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IILq;Z)Z")
    public final boolean method129(int arg0, int arg1, class394 arg2, boolean arg3) {
        field8243++;
        return this.method3302(arg3, -104, arg0, arg1, arg2, -1);
    }

    @OriginalMember(owner = "client!ji", name = "K", descriptor = "()I")
    public final int method83() {
        field8221++;
        if (!this.field8197) {
            this.method3316(-10110);
        }
        return this.field8262;
    }

    @OriginalMember(owner = "client!ji", name = "WA", descriptor = "(IIII)V")
    public final void method69(int arg0, int arg1, int arg2, int arg3) {
        field8166++;
        if (arg0 == 0) {
            int var5 = 0;
            class455.field6410 = 0;
            class327.field4364 = 0;
            class672.field9660 = 0;
            for (int var6 = 0; var6 < this.field8229; var6++) {
                class327.field4364 += this.field8206[var6];
                class455.field6410 += this.field8205[var6];
                class672.field9660 += this.field8248[var6];
                var5++;
            }
            if (var5 <= 0) {
                class455.field6410 = arg2;
                class672.field9660 = arg3;
                class327.field4364 = arg1;
            } else {
                class455.field6410 = class455.field6410 / var5 + arg2;
                class672.field9660 = class672.field9660 / var5 + arg3;
                class327.field4364 = class327.field4364 / var5 + arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field8229; var7++) {
                this.field8206[var7] += arg1;
                this.field8205[var7] += arg2;
                this.field8248[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field8229; var8++) {
                this.field8206[var8] -= class327.field4364;
                this.field8205[var8] -= class455.field6410;
                this.field8248[var8] -= class672.field9660;
                if (arg3 != 0) {
                    int var9 = class395.field5579[arg3];
                    int var10 = class395.field5582[arg3];
                    int var11 = this.field8205[var8] * var9 - (-(this.field8206[var8] * var10) - 16383) >> 14;
                    this.field8205[var8] = this.field8205[var8] * var10 + 16383 - (this.field8206[var8] * var9) >> 14;
                    this.field8206[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class395.field5579[arg1];
                    int var13 = class395.field5582[arg1];
                    int var14 = this.field8205[var8] * var13 + (16383 - (this.field8248[var8] * var12)) >> 14;
                    this.field8248[var8] = this.field8248[var8] * var13 + this.field8205[var8] * var12 + 16383 >> 14;
                    this.field8205[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class395.field5579[arg2];
                    int var16 = class395.field5582[arg2];
                    int var17 = this.field8206[var8] * var16 + this.field8248[var8] * var15 + 16383 >> 14;
                    this.field8248[var8] = this.field8248[var8] * var16 + 16383 - (this.field8206[var8] * var15) >> 14;
                    this.field8206[var8] = var17;
                }
                this.field8206[var8] += class327.field4364;
                this.field8205[var8] += class455.field6410;
                this.field8248[var8] += class672.field9660;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field8229; var18++) {
                this.field8206[var18] -= class327.field4364;
                this.field8205[var18] -= class455.field6410;
                this.field8248[var18] -= class672.field9660;
                this.field8206[var18] = this.field8206[var18] * arg1 / 128;
                this.field8205[var18] = this.field8205[var18] * arg2 / 128;
                this.field8248[var18] = this.field8248[var18] * arg3 / 128;
                this.field8206[var18] += class327.field4364;
                this.field8205[var18] += class455.field6410;
                this.field8248[var18] += class672.field9660;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field8189; var19++) {
                int var23 = (this.field8185[var19] & 0xFF) + (arg1 * 8);
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field8185[var19] = (byte) var23;
            }
            if (this.field8207 != null) {
                this.field8207.field5629 = null;
            }
            if (this.field8180 != null) {
                for (int var20 = 0; var20 < this.field8196; var20++) {
                    class351 var21 = this.field8180[var20];
                    class25 var22 = this.field8277[var20];
                    var22.field584 = var22.field584 & 0xFFFFFF | 255 - (this.field8185[var21.field4688] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field8189; var24++) {
                int var28 = this.field8199[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = var28 >> 7 & 0x7;
                int var31 = var28 & 0x7F;
                int var32 = arg1 + var29 & 0x3F;
                int var33 = arg2 / 4 + var30;
                int var34 = arg3 + var31;
                if (var33 < 0) {
                    var33 = 0;
                } else if (var33 > 7) {
                    var33 = 7;
                }
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field8199[var24] = (short) class242.method1474(var34, class242.method1474(var33 << 7, var32 << 10));
            }
            if (this.field8207 != null) {
                this.field8207.field5629 = null;
            }
            if (this.field8180 != null) {
                for (int var25 = 0; var25 < this.field8196; var25++) {
                    class351 var26 = this.field8180[var25];
                    class25 var27 = this.field8277[var25];
                    var27.field584 = class285.field3868[this.field8199[var26.field4688] & 0xFFFF] & 0xFFFFFF | var27.field584 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field8196; var35++) {
                class25 var36 = this.field8277[var35];
                var36.field594 += arg2;
                var36.field586 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field8196; var37++) {
                class25 var38 = this.field8277[var37];
                var38.field592 = var38.field592 * arg1 >> 7;
                var38.field585 = var38.field585 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field8196; var39++) {
                class25 var40 = this.field8277[var39];
                var40.field583 = var40.field583 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZLji;IZLji;I)Lda;")
    private final class55 method3305(boolean arg0, class565 arg1, int arg2, boolean arg3, class565 arg4, int arg5) {
        arg4.field8271 = this.field8271;
        arg4.field8173 = this.field8173;
        arg4.field8240 = arg5;
        arg4.field8272 = this.field8272;
        arg4.field8177 = 0;
        arg4.field8196 = this.field8196;
        arg4.field8259 = this.field8259;
        arg4.field8229 = this.field8229;
        field8172++;
        if ((arg5 & 0x100) == 0) {
            arg4.field8247 = this.field8247;
        } else {
            arg4.field8247 = true;
        }
        arg4.field8189 = this.field8189;
        arg4.field8212 = this.field8212;
        arg4.field8254 = this.field8254;
        boolean var7 = class588.method3412(this.field8271, (byte) -57, arg5);
        boolean var8 = class213.method1281(-1, arg5, this.field8271);
        boolean var9 = class613.method3518(this.field8271, arg5, arg2 - 8191);
        boolean var10 = var8 | var7 | var9;
        if (var10) {
            if (!var7) {
                arg4.field8206 = this.field8206;
            } else if (arg1.field8206 == null || arg1.field8206.length < this.field8173) {
                arg4.field8206 = arg1.field8206 = new int[this.field8173];
            } else {
                arg4.field8206 = arg1.field8206;
            }
            if (!var8) {
                arg4.field8205 = this.field8205;
            } else if (arg1.field8205 == null || arg1.field8205.length < this.field8173) {
                arg4.field8205 = arg1.field8205 = new int[this.field8173];
            } else {
                arg4.field8205 = arg1.field8205;
            }
            if (!var9) {
                arg4.field8248 = this.field8248;
            } else if (arg1.field8248 == null || arg1.field8248.length < this.field8173) {
                arg4.field8248 = arg1.field8248 = new int[this.field8173];
            } else {
                arg4.field8248 = arg1.field8248;
            }
            for (int var11 = 0; var11 < this.field8173; var11++) {
                if (var7) {
                    arg4.field8206[var11] = this.field8206[var11];
                }
                if (var8) {
                    arg4.field8205[var11] = this.field8205[var11];
                }
                if (var9) {
                    arg4.field8248[var11] = this.field8248[var11];
                }
            }
        } else {
            arg4.field8206 = this.field8206;
            arg4.field8248 = this.field8248;
            arg4.field8205 = this.field8205;
        }
        if (class273.method1637(-94, this.field8271, arg5)) {
            arg4.field8264 = arg1.field8264;
            if (arg0) {
                arg4.field8177 = (byte) (arg4.field8177 | 0x1);
            }
            arg4.field8264.field5633 = this.field8264.field5633;
            arg4.field8264.field5629 = this.field8264.field5629;
        } else if (class226.method1378(-905560472, this.field8271, arg5)) {
            arg4.field8264 = this.field8264;
        } else {
            arg4.field8264 = null;
        }
        if (class380.method2201(this.field8271, 0, arg5)) {
            if (arg1.field8199 == null || arg1.field8199.length < this.field8189) {
                arg4.field8199 = arg1.field8199 = new short[this.field8189];
            } else {
                arg4.field8199 = arg1.field8199;
            }
            for (int var12 = 0; var12 < this.field8189; var12++) {
                arg4.field8199[var12] = this.field8199[var12];
            }
        } else {
            arg4.field8199 = this.field8199;
        }
        if (class187.method1163((byte) 64, arg5, this.field8271)) {
            if (arg1.field8185 == null || this.field8189 > arg1.field8185.length) {
                arg4.field8185 = arg1.field8185 = new byte[this.field8189];
            } else {
                arg4.field8185 = arg1.field8185;
            }
            for (int var13 = 0; var13 < this.field8189; var13++) {
                arg4.field8185[var13] = this.field8185[var13];
            }
        } else {
            arg4.field8185 = this.field8185;
        }
        if (class541.method3173(arg5, this.field8271, 55)) {
            arg4.field8207 = arg1.field8207;
            if (arg0) {
                arg4.field8177 = (byte) (arg4.field8177 | 0x2);
            }
            arg4.field8207.field5633 = this.field8207.field5633;
            arg4.field8207.field5629 = this.field8207.field5629;
        } else if (class273.method1635(this.field8271, arg5, -27037)) {
            arg4.field8207 = this.field8207;
        } else {
            arg4.field8207 = null;
        }
        if (class376.method2184(this.field8271, arg5, (byte) -118)) {
            if (arg1.field8270 == null || arg1.field8270.length < this.field8272) {
                int var14 = this.field8272;
                arg4.field8165 = arg1.field8165 = new short[var14];
                arg4.field8159 = arg1.field8159 = new short[var14];
                arg4.field8270 = arg1.field8270 = new short[var14];
            } else {
                arg4.field8159 = arg1.field8159;
                arg4.field8270 = arg1.field8270;
                arg4.field8165 = arg1.field8165;
            }
            if (this.field8218 == null) {
                for (int var18 = 0; var18 < this.field8272; var18++) {
                    arg4.field8270[var18] = this.field8270[var18];
                    arg4.field8165[var18] = this.field8165[var18];
                    arg4.field8159[var18] = this.field8159[var18];
                }
            } else {
                if (arg1.field8218 == null) {
                    arg1.field8218 = new class151();
                }
                class151 var15 = arg4.field8218 = arg1.field8218;
                if (var15.field1864 == null || var15.field1864.length < this.field8272) {
                    int var16 = this.field8272;
                    var15.field1868 = new short[var16];
                    var15.field1864 = new short[var16];
                    var15.field1865 = new short[var16];
                    var15.field1863 = new byte[var16];
                }
                for (int var17 = 0; var17 < this.field8272; var17++) {
                    arg4.field8270[var17] = this.field8270[var17];
                    arg4.field8165[var17] = this.field8165[var17];
                    arg4.field8159[var17] = this.field8159[var17];
                    var15.field1864[var17] = this.field8218.field1864[var17];
                    var15.field1868[var17] = this.field8218.field1868[var17];
                    var15.field1865[var17] = this.field8218.field1865[var17];
                    var15.field1863[var17] = this.field8218.field1863[var17];
                }
            }
            arg4.field8217 = this.field8217;
        } else {
            arg4.field8270 = this.field8270;
            arg4.field8217 = this.field8217;
            arg4.field8159 = this.field8159;
            arg4.field8218 = this.field8218;
            arg4.field8165 = this.field8165;
        }
        if (class193.method1185(arg2 ^ 0x5D46, this.field8271, arg5)) {
            arg4.field8174 = arg1.field8174;
            if (arg0) {
                arg4.field8177 = (byte) (arg4.field8177 | 0x4);
            }
            arg4.field8174.field5629 = this.field8174.field5629;
            arg4.field8174.field5633 = this.field8174.field5633;
        } else if (class287.method1711(arg5, this.field8271, (byte) 12)) {
            arg4.field8174 = this.field8174;
        } else {
            arg4.field8174 = null;
        }
        if (class569.method3339(arg5, this.field8271, true)) {
            if (arg1.field8215 == null || arg1.field8215.length < this.field8189) {
                int var19 = this.field8272;
                arg4.field8202 = arg1.field8202 = new float[var19];
                arg4.field8215 = arg1.field8215 = new float[var19];
            } else {
                arg4.field8202 = arg1.field8202;
                arg4.field8215 = arg1.field8215;
            }
            for (int var20 = 0; var20 < this.field8272; var20++) {
                arg4.field8215[var20] = this.field8215[var20];
                arg4.field8202[var20] = this.field8202[var20];
            }
        } else {
            arg4.field8202 = this.field8202;
            arg4.field8215 = this.field8215;
        }
        if (arg2 != 8192) {
            this.method115();
        }
        if (class637.method3637(this.field8271, 2, arg5)) {
            arg4.field8258 = arg1.field8258;
            if (arg0) {
                arg4.field8177 = (byte) (arg4.field8177 | 0x8);
            }
            arg4.field8258.field5629 = this.field8258.field5629;
            arg4.field8258.field5633 = this.field8258.field5633;
        } else if (class356.method2007(arg5, -92, this.field8271)) {
            arg4.field8258 = this.field8258;
        } else {
            arg4.field8258 = null;
        }
        if (class177.method1108(this.field8271, true, arg5)) {
            if (arg1.field8209 == null || arg1.field8209.length < this.field8189) {
                int var21 = this.field8189;
                arg4.field8161 = arg1.field8161 = new short[var21];
                arg4.field8214 = arg1.field8214 = new short[var21];
                arg4.field8209 = arg1.field8209 = new short[var21];
            } else {
                arg4.field8209 = arg1.field8209;
                arg4.field8161 = arg1.field8161;
                arg4.field8214 = arg1.field8214;
            }
            for (int var22 = 0; var22 < this.field8189; var22++) {
                arg4.field8209[var22] = this.field8209[var22];
                arg4.field8161[var22] = this.field8161[var22];
                arg4.field8214[var22] = this.field8214[var22];
            }
        } else {
            arg4.field8209 = this.field8209;
            arg4.field8161 = this.field8161;
            arg4.field8214 = this.field8214;
        }
        if (class89.method702(arg5, 0, this.field8271)) {
            if (arg0) {
                arg4.field8177 = (byte) (arg4.field8177 | 0x10);
            }
            arg4.field8244 = arg1.field8244;
            arg4.field8244.field628 = this.field8244.field628;
        } else if (class246.method1496((byte) 127, arg5, this.field8271)) {
            arg4.field8244 = this.field8244;
        } else {
            arg4.field8244 = null;
        }
        if (class486.method2839((byte) -104, this.field8271, arg5)) {
            if (arg1.field8257 == null || arg1.field8257.length < this.field8189) {
                int var23 = this.field8189;
                arg4.field8257 = arg1.field8257 = new short[var23];
            } else {
                arg4.field8257 = arg1.field8257;
            }
            for (int var24 = 0; var24 < this.field8189; var24++) {
                arg4.field8257[var24] = this.field8257[var24];
            }
        } else {
            arg4.field8257 = this.field8257;
        }
        if (!class680.method3859(arg5, this.field8271, (byte) -109)) {
            arg4.field8277 = this.field8277;
        } else if (arg1.field8277 == null || this.field8196 > arg1.field8277.length) {
            int var26 = this.field8196;
            arg4.field8277 = arg1.field8277 = new class25[var26];
            for (int var27 = 0; var27 < this.field8196; var27++) {
                arg4.field8277[var27] = this.field8277[var27].method370((byte) -118);
            }
        } else {
            arg4.field8277 = arg1.field8277;
            for (int var25 = 0; var25 < this.field8196; var25++) {
                arg4.field8277[var25].method367(this.field8277[var25], (byte) -71);
            }
        }
        arg4.field8274 = this.field8274;
        arg4.field8158 = this.field8158;
        arg4.field8223 = this.field8223;
        arg4.field8186 = this.field8186;
        arg4.field8180 = this.field8180;
        if (this.field8197) {
            arg4.field8262 = this.field8262;
            arg4.field8191 = this.field8191;
            arg4.field8267 = this.field8267;
            arg4.field8237 = this.field8237;
            arg4.field8182 = this.field8182;
            arg4.field8167 = this.field8167;
            arg4.field8245 = this.field8245;
            arg4.field8238 = this.field8238;
            arg4.field8197 = true;
        } else {
            arg4.field8197 = false;
        }
        arg4.field8211 = this.field8211;
        arg4.field8273 = this.field8273;
        arg4.field8194 = this.field8194;
        arg4.field8208 = this.field8208;
        arg4.field8163 = this.field8163;
        arg4.field8160 = this.field8160;
        return arg4;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZB)V")
    private final void method3306(boolean arg0, byte arg1) {
        field8263++;
        boolean var3 = this.field8207 != null && this.field8207.field5629 == null;
        boolean var4 = this.field8174 != null && this.field8174.field5629 == null;
        boolean var5 = this.field8264 != null && this.field8264.field5629 == null;
        boolean var6 = this.field8258 != null && this.field8258.field5629 == null;
        if (arg0) {
            var4 &= (this.field8177 & 0x4) != 0;
            var5 &= (this.field8177 & 0x1) != 0;
            var6 &= (this.field8177 & 0x8) != 0;
            var3 &= (this.field8177 & 0x2) != 0;
        }
        byte var7 = 0;
        if (arg1 != -48) {
            return;
        }
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
        if (this.field8171.field7352.field5205.length >= this.field8272 * var7) {
            this.field8171.field7352.field5195 = 0;
        } else {
            this.field8171.field7352 = new class226((this.field8272 + 100) * var7);
        }
        class226 var12 = this.field8171.field7352;
        if (var5) {
            if (this.field8171.field7353) {
                for (int var13 = 0; var13 < this.field8229; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field8206[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field8205[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field8248[var13]);
                    int var17 = this.field8160[var13];
                    int var18 = this.field8160[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field8211[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field5195 = var7 * var20;
                        var12.method2233((byte) 64, var14);
                        var12.method2233((byte) 101, var15);
                        var12.method2233((byte) 67, var16);
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field8229; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field8206[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field8205[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field8248[var21]);
                    int var25 = this.field8160[var21];
                    int var26 = this.field8160[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field8211[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field5195 = var7 * var28;
                        var12.method2273(-128, var22);
                        var12.method2273(-97, var23);
                        var12.method2273(arg1 ^ 0x5A, var24);
                    }
                }
            }
        }
        if (var3) {
            if (this.field8174 == null) {
                byte[] var31;
                short[] var32;
                short[] var33;
                short[] var34;
                if (this.field8218 == null) {
                    var31 = this.field8217;
                    var33 = this.field8159;
                    var32 = this.field8270;
                    var34 = this.field8165;
                } else {
                    var31 = this.field8218.field1863;
                    var32 = this.field8218.field1864;
                    var33 = this.field8218.field1865;
                    var34 = this.field8218.field1868;
                }
                float var35 = this.field8171.field7324[0];
                float var36 = this.field8171.field7324[1];
                float var37 = this.field8171.field7324[2];
                float var38 = this.field8171.field7311;
                float var39 = this.field8171.field7404 * 768.0F / (float) this.field8212;
                float var40 = this.field8171.field7321 * 768.0F / (float) this.field8212;
                for (int var41 = 0; var41 < this.field8189; var41++) {
                    int var42 = this.method3315(this.field8257[var41], this.field8254, this.field8199[var41], (byte) -71, this.field8185[var41]);
                    float var43 = (float) (var42 >>> 24) * this.field8171.field7330;
                    float var44 = (float) ((var42 & 0xFFB6) >> 8) * this.field8171.field7307;
                    float var45 = (float) (var42 >> 16 & 0xFF) * this.field8171.field7376;
                    short var46 = this.field8209[var41];
                    short var47 = (short) var31[var46];
                    float var48;
                    if (var47 == 0) {
                        var48 = ((float) var33[var46] * var37 + (float) var32[var46] * var35 + (float) var34[var46] * var36) * 0.0026041667F;
                    } else {
                        var48 = ((float) var33[var46] * var37 + (float) var32[var46] * var35 + (float) var34[var46] * var36) / (float) (var47 * 256);
                    }
                    float var49 = var38 + ((var48 < 0.0F) ? var40 : var39) * var48;
                    int var50 = (int) (var43 * var49);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    int var51 = (int) (var45 * var49);
                    int var52 = (int) (var44 * var49);
                    if (var51 < 0) {
                        var51 = 0;
                    } else if (var51 > 255) {
                        var51 = 255;
                    }
                    var12.field5195 = var7 * var46 + var9;
                    if (var52 < 0) {
                        var52 = 0;
                    } else if (var52 > 255) {
                        var52 = 255;
                    }
                    var12.method2281((byte) 58, var50);
                    var12.method2281((byte) 58, var51);
                    var12.method2281((byte) 58, var52);
                    var12.method2281((byte) 58, 255 - (this.field8185[var41] & 0xFF));
                    short var53 = this.field8161[var41];
                    short var54 = (short) var31[var53];
                    float var55;
                    if (var54 == 0) {
                        var55 = ((float) var33[var53] * var37 + (float) var32[var53] * var35 + (float) var34[var53] * var36) * 0.0026041667F;
                    } else {
                        var55 = ((float) var33[var53] * var37 + (float) var32[var53] * var35 + (float) var34[var53] * var36) / (float) (var54 * 256);
                    }
                    float var56 = (var55 < 0.0F ? var40 : var39) * var55 + var38;
                    int var57 = (int) (var43 * var56);
                    int var58 = (int) (var45 * var56);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    if (var58 < 0) {
                        var58 = 0;
                    } else if (var58 > 255) {
                        var58 = 255;
                    }
                    int var59 = (int) (var44 * var56);
                    if (var59 < 0) {
                        var59 = 0;
                    } else if (var59 > 255) {
                        var59 = 255;
                    }
                    var12.field5195 = var7 * var53 + var9;
                    var12.method2281((byte) 58, var57);
                    var12.method2281((byte) 58, var58);
                    var12.method2281((byte) 58, var59);
                    var12.method2281((byte) 58, 255 - (this.field8185[var41] & 0xFF));
                    short var60 = this.field8214[var41];
                    short var61 = (short) var31[var60];
                    float var62;
                    if (var61 == 0) {
                        var62 = ((float) var33[var60] * var37 + (float) var32[var60] * var35 + (float) var34[var60] * var36) * 0.0026041667F;
                    } else {
                        var62 = ((float) var33[var60] * var37 + (float) var32[var60] * var35 + (float) var34[var60] * var36) / (float) (var61 * 256);
                    }
                    float var63 = var38 + (var62 < 0.0F ? var40 : var39) * var62;
                    int var64 = (int) (var43 * var63);
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    int var65 = (int) (var45 * var63);
                    if (var65 < 0) {
                        var65 = 0;
                    } else if (var65 > 255) {
                        var65 = 255;
                    }
                    int var66 = (int) (var44 * var63);
                    var12.field5195 = var7 * var60 + var9;
                    if (var66 < 0) {
                        var66 = 0;
                    } else if (var66 > 255) {
                        var66 = 255;
                    }
                    var12.method2281((byte) 58, var64);
                    var12.method2281((byte) 58, var65);
                    var12.method2281((byte) 58, var66);
                    var12.method2281((byte) 58, 255 - (this.field8185[var41] & 0xFF));
                }
            } else {
                for (int var29 = 0; var29 < this.field8189; var29++) {
                    int var30 = this.method3315(this.field8257[var29], this.field8254, this.field8199[var29], (byte) -71, this.field8185[var29]);
                    var12.field5195 = this.field8209[var29] * var7 + var9;
                    var12.method2233((byte) -55, var30);
                    var12.field5195 = this.field8161[var29] * var7 + var9;
                    var12.method2233((byte) 95, var30);
                    var12.field5195 = this.field8214[var29] * var7 + var9;
                    var12.method2233((byte) 93, var30);
                }
            }
        }
        if (var4) {
            short[] var67;
            short[] var68;
            byte[] var69;
            short[] var70;
            if (this.field8218 == null) {
                var67 = this.field8270;
                var70 = this.field8165;
                var68 = this.field8159;
                var69 = this.field8217;
            } else {
                var67 = this.field8218.field1864;
                var68 = this.field8218.field1865;
                var69 = this.field8218.field1863;
                var70 = this.field8218.field1868;
            }
            float var71 = 3.0F / (float) this.field8212;
            float var72 = 3.0F / (float) (this.field8212 / 2 + this.field8212);
            var12.field5195 = var10;
            if (this.field8171.field7353) {
                for (int var73 = 0; var73 < this.field8272; var73++) {
                    int var74 = var69[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method1377(134389112, (float) var67[var73] * var72);
                        var12.method1377(134389112, (float) var70[var73] * var72);
                        var12.method1377(arg1 + 134389160, (float) var68[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method1377(arg1 ^ 0xF7FD62A8, (float) var67[var73] * var75);
                        var12.method1377(arg1 ^ 0xF7FD62A8, (float) var70[var73] * var75);
                        var12.method1377(134389112, (float) var68[var73] * var75);
                    }
                    var12.field5195 += var7 - 12;
                }
            } else {
                for (int var76 = 0; var76 < this.field8272; var76++) {
                    int var77 = var69[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method1376((float) var67[var76] * var72, (byte) -66);
                        var12.method1376((float) var70[var76] * var72, (byte) -107);
                        var12.method1376((float) var68[var76] * var72, (byte) -118);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method1376((float) var67[var76] * var78, (byte) -87);
                        var12.method1376((float) var70[var76] * var78, (byte) -73);
                        var12.method1376((float) var68[var76] * var78, (byte) -94);
                    }
                    var12.field5195 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field5195 = var11;
            if (this.field8171.field7353) {
                for (int var79 = 0; var79 < this.field8272; var79++) {
                    var12.method1377(arg1 + 134389160, this.field8215[var79]);
                    var12.method1377(134389112, this.field8202[var79]);
                    var12.field5195 += var7 - 8;
                }
            } else {
                for (int var80 = 0; var80 < this.field8272; var80++) {
                    var12.method1376(this.field8215[var80], (byte) -62);
                    var12.method1376(this.field8202[var80], (byte) -68);
                    var12.field5195 += var7 - 8;
                }
            }
        }
        var12.field5195 = this.field8272 * var7;
        class458 var81;
        if (arg0) {
            if (this.field8249 == null) {
                this.field8249 = this.field8171.method2963(var12.field5205, true, true, var7, var12.field5195);
            } else {
                this.field8249.method672(25735, var12.field5205, var12.field5195, var7);
            }
            var81 = this.field8249;
            this.field8177 = 0;
        } else {
            var81 = this.field8171.method2963(var12.field5205, false, true, var7, var12.field5195);
            this.field8251 = true;
        }
        if (var5) {
            this.field8264.field5629 = var81;
            this.field8264.field5633 = var8;
        }
        if (var6) {
            this.field8258.field5629 = var81;
            this.field8258.field5633 = var11;
        }
        if (var3) {
            this.field8207.field5629 = var81;
            this.field8207.field5633 = var9;
        }
        if (var4) {
            this.field8174.field5633 = var10;
            this.field8174.field5629 = var81;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IILq;ZI)Z")
    public final boolean method124(int arg0, int arg1, class394 arg2, boolean arg3, int arg4) {
        field8231++;
        return this.method3302(arg3, -119, arg0, arg1, arg2, arg4);
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
    private final void method3307(int arg0) {
        field8190++;
        if (this.field8259 == 0) {
            return;
        }
        if (this.field8177 != 0) {
            this.method3306(true, (byte) -48);
        }
        this.method3306(false, (byte) -48);
        if (arg0 != 29066) {
            this.method126(15);
        }
        if (this.field8244 != null) {
            if (this.field8244.field628 == null) {
                this.method3317((this.field8177 & 0x10) != 0, 0);
            }
            if (this.field8244.field628 != null) {
                this.field8171.method2969(this.field8174 != null, (byte) -104);
                this.field8171.method2960(this.field8174, this.field8264, 0, this.field8258, this.field8207);
                int var2 = this.field8194.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field8194[var3];
                    int var5 = this.field8194[var3 + 1];
                    int var6 = this.field8257[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field8171.method2945(var6, this.field8174 != null, true);
                    this.field8171.method2984((var5 - var4) * 3, var4 * 3, 4, this.field8244.field628, 512);
                }
            }
        }
        this.method3311(2048);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIFIFIII[F)V")
    public static final void method3308(int arg0, int arg1, int arg2, int arg3, float arg4, int arg5, float arg6, int arg7, int arg8, int arg9, float[] arg10) {
        int var11 = arg5 - arg1;
        field8256++;
        int var12 = arg7 - arg3;
        int var13 = arg8 - arg2;
        float var14 = arg10[2] * (float) var13 + arg10[0] * (float) var11 + arg10[1] * (float) var12;
        float var15 = arg10[5] * (float) var13 + arg10[3] * (float) var11 + arg10[4] * (float) var12;
        float var16 = arg10[8] * (float) var13 + arg10[7] * (float) var12 + arg10[6] * (float) var11;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg4 != 1.0F) {
            var17 = arg4 * var17;
        }
        float var18 = var15 + arg6 + 0.5F;
        if (arg0 != 31827) {
            field8241 = -119;
        }
        if (arg9 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg9 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg9 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class407.field5769 = var17;
        class598.field8626 = var18;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ltm;Z)V")
    private final void method3309(class357 arg0, boolean arg1) {
        if (this.field8171.field7416.length < this.field8272) {
            this.field8171.field7416 = new int[this.field8272];
            this.field8171.field7415 = new int[this.field8272];
        }
        field8204++;
        int[] var3 = this.field8171.field7416;
        int[] var4 = this.field8171.field7415;
        for (int var5 = 0; var5 < this.field8229; var5++) {
            int var16 = (this.field8206[var5] - (this.field8205[var5] * this.field8171.field7408 >> 8) >> this.field8171.field7261) - arg0.field4760;
            int var17 = (this.field8248[var5] - (this.field8205[var5] * this.field8171.field7402 >> 8) >> this.field8171.field7261) - arg0.field4766;
            int var18 = this.field8160[var5];
            int var19 = this.field8160[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field8211[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        if (!arg1) {
            return;
        }
        for (int var6 = 0; var6 < this.field8259; var6++) {
            if (this.field8185 == null || this.field8185[var6] <= 128) {
                short var7 = this.field8209[var6];
                short var8 = this.field8161[var6];
                short var9 = this.field8214[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if (((var10 - var11) * (var14 - var15) - (var12 - var11) * (var14 - var13)) > 0) {
                    arg0.method2010(var11, var13, var12, var10, var14, (byte) 76, var15);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "()[Lfk;")
    public final class604[] method85() {
        field8222++;
        return this.field8158;
    }

    @OriginalMember(owner = "client!ji", name = "oa", descriptor = "(III)V")
    public final void method64(int arg0, int arg1, int arg2) {
        field8224++;
        for (int var4 = 0; var4 < this.field8229; var4++) {
            if (arg0 != 0) {
                this.field8206[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field8205[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field8248[var4] += arg2;
            }
        }
        this.field8197 = false;
        if (this.field8264 != null) {
            this.field8264.field5629 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "OA", descriptor = "()I")
    public final int method79() {
        if (!this.field8197) {
            this.method3316(-10110);
        }
        field8253++;
        return this.field8191;
    }

    @OriginalMember(owner = "client!ji", name = "J", descriptor = "()I")
    public final int method65() {
        if (!this.field8197) {
            this.method3316(-10110);
        }
        field8192++;
        return this.field8238;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIBIIII)Z")
    private final boolean method3310(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        field8178++;
        if (arg4 <= 19) {
            this.field8159 = null;
        }
        if (arg2 < arg8 && arg5 > arg2 && arg0 > arg2) {
            return false;
        } else if (arg2 > arg8 && arg2 > arg5 && arg2 > arg0) {
            return false;
        } else if (arg1 > arg6 && arg3 > arg6 && arg7 > arg6) {
            return false;
        } else {
            return arg1 >= arg6 || arg3 >= arg6 || arg7 >= arg6;
        }
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "()[Lnba;")
    public final class271[] method95() {
        field8193++;
        return this.field8273;
    }

    @OriginalMember(owner = "client!ji", name = "R", descriptor = "(III)V")
    public final void method70(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field8229; var4++) {
            if (arg0 != 128) {
                this.field8206[var4] = this.field8206[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field8205[var4] = this.field8205[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field8248[var4] = this.field8248[var4] * arg2 >> 7;
            }
        }
        field8250++;
        this.field8197 = false;
        if (this.field8264 != null) {
            this.field8264.field5629 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "FA", descriptor = "()V")
    public final void method88() {
        field8232++;
        for (int var1 = 0; var1 < this.field8229; var1++) {
            this.field8248[var1] = -this.field8248[var1];
        }
        for (int var2 = 0; var2 < this.field8272; var2++) {
            this.field8159[var2] = (short) (-this.field8159[var2]);
        }
        for (int var3 = 0; var3 < this.field8189; var3++) {
            short var4 = this.field8209[var3];
            this.field8209[var3] = this.field8214[var3];
            this.field8214[var3] = var4;
        }
        if (this.field8174 == null && this.field8207 != null) {
            this.field8207.field5629 = null;
        }
        if (this.field8174 != null) {
            this.field8174.field5629 = null;
        }
        if (this.field8264 != null) {
            this.field8264.field5629 = null;
        }
        this.field8197 = false;
        if (this.field8244 != null) {
            this.field8244.field628 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "ga", descriptor = "(I)V")
    public final void method73(int arg0) {
        this.field8212 = (short) arg0;
        if (this.field8207 != null) {
            this.field8207.field5629 = null;
        }
        field8265++;
        if (this.field8174 != null) {
            this.field8174.field5629 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "na", descriptor = "()I")
    public final int method61() {
        field8170++;
        return this.field8212;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIII)V")
    public final void method77(int arg0, int arg1, int arg2, int arg3) {
        field8169++;
        for (int var5 = 0; var5 < this.field8189; var5++) {
            int var9 = this.field8199[var5] & 0xFFFF;
            int var10 = (var9 & 0xFE5E) >> 10;
            int var11 = var9 >> 7 & 0x7;
            if (arg1 != -1) {
                var11 -= -((arg1 - var11) * arg3 >> 7);
            }
            int var12 = var9 & 0x7F;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 -= -((arg2 - var12) * arg3 >> 7);
            }
            this.field8199[var5] = (short) class242.method1474(var12, class242.method1474(var10 << 10, var11 << 7));
        }
        if (this.field8180 != null) {
            for (int var6 = 0; var6 < this.field8196; var6++) {
                class351 var7 = this.field8180[var6];
                class25 var8 = this.field8277[var6];
                var8.field584 = class285.field3868[this.field8199[var7.field4688] & 0xFFFF] & 0xFFFFFF | var8.field584 & 0xFF000000;
            }
        }
        if (this.field8207 != null) {
            this.field8207.field5629 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "T", descriptor = "(I)V")
    public final void method93(int arg0) {
        this.field8254 = (short) arg0;
        if (this.field8207 != null) {
            this.field8207.field5629 = null;
        }
        field8184++;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method109(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field8183++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg3 << 4;
            int var10 = arg2 << 4;
            int var11 = arg4 << 4;
            class455.field6410 = 0;
            int var12 = 0;
            class672.field9660 = 0;
            class327.field4364 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field8223.length > var14) {
                    int[] var15 = this.field8223[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class327.field4364 += this.field8206[var17];
                        class455.field6410 += this.field8205[var17];
                        var12++;
                        class672.field9660 += this.field8248[var17];
                    }
                }
            }
            if (var12 > 0) {
                class672.field9660 = class672.field9660 / var12 + var11;
                class455.field6410 = class455.field6410 / var12 + var9;
                class327.field4364 = class327.field4364 / var12 + var10;
            } else {
                class327.field4364 = var10;
                class672.field9660 = var11;
                class455.field6410 = var9;
            }
        } else if (arg0 == 1) {
            int var18 = arg4 << 4;
            int var19 = arg2 << 4;
            int var20 = arg3 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field8223.length > var22) {
                    int[] var23 = this.field8223[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field8206[var25] += var19;
                        this.field8205[var25] += var20;
                        this.field8248[var25] += var18;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field8223.length) {
                    int[] var46 = this.field8223[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field8206[var48] -= class327.field4364;
                            this.field8205[var48] -= class455.field6410;
                            this.field8248[var48] -= class672.field9660;
                            if (arg4 != 0) {
                                int var49 = class395.field5579[arg4];
                                int var50 = class395.field5582[arg4];
                                int var51 = this.field8205[var48] * var49 + this.field8206[var48] * var50 + 16383 >> 14;
                                this.field8205[var48] = this.field8205[var48] * var50 + 16383 - (this.field8206[var48] * var49) >> 14;
                                this.field8206[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class395.field5579[arg2];
                                int var53 = class395.field5582[arg2];
                                int var54 = this.field8205[var48] * var53 + 16383 - (this.field8248[var48] * var52) >> 14;
                                this.field8248[var48] = this.field8248[var48] * var53 + this.field8205[var48] * var52 + 16383 >> 14;
                                this.field8205[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class395.field5579[arg3];
                                int var56 = class395.field5582[arg3];
                                int var57 = this.field8248[var48] * var55 + (this.field8206[var48] * var56) + 16383 >> 14;
                                this.field8248[var48] = this.field8248[var48] * var56 + 16383 - (this.field8206[var48] * var55) >> 14;
                                this.field8206[var48] = var57;
                            }
                            this.field8206[var48] += class327.field4364;
                            this.field8205[var48] += class455.field6410;
                            this.field8248[var48] += class672.field9660;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field8206[var59] -= class327.field4364;
                            this.field8205[var59] -= class455.field6410;
                            this.field8248[var59] -= class672.field9660;
                            if (arg2 != 0) {
                                int var60 = class395.field5579[arg2];
                                int var61 = class395.field5582[arg2];
                                int var62 = this.field8205[var59] * var61 + 16383 - (this.field8248[var59] * var60) >> 14;
                                this.field8248[var59] = this.field8205[var59] * var60 + (this.field8248[var59] * var61) + 16383 >> 14;
                                this.field8205[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class395.field5579[arg4];
                                int var64 = class395.field5582[arg4];
                                int var65 = this.field8205[var59] * var63 + (this.field8206[var59] * var64) + 16383 >> 14;
                                this.field8205[var59] = this.field8205[var59] * var64 + 16383 - this.field8206[var59] * var63 >> 14;
                                this.field8206[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class395.field5579[arg3];
                                int var67 = class395.field5582[arg3];
                                int var68 = this.field8206[var59] * var67 + (this.field8248[var59] * var66 + 16383) >> 14;
                                this.field8248[var59] = this.field8248[var59] * var67 + 16383 - (this.field8206[var59] * var66) >> 14;
                                this.field8206[var59] = var68;
                            }
                            this.field8206[var59] += class327.field4364;
                            this.field8205[var59] += class455.field6410;
                            this.field8248[var59] += class672.field9660;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field8223.length) {
                        int[] var29 = this.field8223[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field8160[var31];
                            int var33 = this.field8160[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field8211[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class395.field5579[arg4];
                                    int var37 = class395.field5582[arg4];
                                    int var38 = this.field8165[var35] * var36 + (this.field8270[var35] * var37) + 16383 >> 14;
                                    this.field8165[var35] = (short) (this.field8165[var35] * var37 + 16383 - (this.field8270[var35] * var36) >> 14);
                                    this.field8270[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class395.field5579[arg2];
                                    int var40 = class395.field5582[arg2];
                                    int var41 = this.field8165[var35] * var40 + 16383 - (this.field8159[var35] * var39) >> 14;
                                    this.field8159[var35] = (short) (this.field8159[var35] * var40 + this.field8165[var35] * var39 + 16383 >> 14);
                                    this.field8165[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class395.field5579[arg3];
                                    int var43 = class395.field5582[arg3];
                                    int var44 = this.field8159[var35] * var42 + this.field8270[var35] * var43 + 16383 >> 14;
                                    this.field8159[var35] = (short) (this.field8159[var35] * var43 + 16383 - (this.field8270[var35] * var42) >> 14);
                                    this.field8270[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field8174 == null && this.field8207 != null) {
                    this.field8207.field5629 = null;
                }
                if (this.field8174 != null) {
                    this.field8174.field5629 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field8223.length) {
                    int[] var71 = this.field8223[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field8206[var73] -= class327.field4364;
                        this.field8205[var73] -= class455.field6410;
                        this.field8248[var73] -= class672.field9660;
                        this.field8206[var73] = this.field8206[var73] * arg2 >> 7;
                        this.field8205[var73] = this.field8205[var73] * arg3 >> 7;
                        this.field8248[var73] = this.field8248[var73] * arg4 >> 7;
                        this.field8206[var73] += class327.field4364;
                        this.field8205[var73] += class455.field6410;
                        this.field8248[var73] += class672.field9660;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field8208 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field8208.length > var78) {
                        int[] var79 = this.field8208[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field8185[var81] & 0xFF) + (arg2 * 8);
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field8185[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field8207 != null) {
                            this.field8207.field5629 = null;
                        }
                    }
                }
                if (this.field8180 != null) {
                    for (int var75 = 0; var75 < this.field8196; var75++) {
                        class351 var76 = this.field8180[var75];
                        class25 var77 = this.field8277[var75];
                        var77.field584 = var77.field584 & 0xFFFFFF | 255 - (this.field8185[var76.field4688] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field8208 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field8208.length > var87) {
                        int[] var88 = this.field8208[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field8199[var90] & 0xFFFF;
                            int var92 = var91 >> 10 & 0x3F;
                            int var93 = var91 >> 7 & 0x7;
                            int var94 = var91 & 0x7F;
                            int var95 = arg2 + var92 & 0x3F;
                            int var96 = arg3 / 4 + var93;
                            int var97 = arg4 + var94;
                            if (var96 < 0) {
                                var96 = 0;
                            } else if (var96 > 7) {
                                var96 = 7;
                            }
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field8199[var90] = (short) class242.method1474(class242.method1474(var95 << 10, var96 << 7), var97);
                        }
                        if (var88.length > 0 && this.field8207 != null) {
                            this.field8207.field5629 = null;
                        }
                    }
                }
                if (this.field8180 != null) {
                    for (int var84 = 0; var84 < this.field8196; var84++) {
                        class351 var85 = this.field8180[var84];
                        class25 var86 = this.field8277[var84];
                        var86.field584 = class285.field3868[this.field8199[var85.field4688] & 0xFFFF] & 0xFFFFFF | var86.field584 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field8163 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field8163.length > var99) {
                        int[] var100 = this.field8163[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class25 var102 = this.field8277[var100[var101]];
                            var102.field594 += arg3;
                            var102.field586 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field8163 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field8163.length) {
                        int[] var105 = this.field8163[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class25 var107 = this.field8277[var105[var106]];
                            var107.field592 = var107.field592 * arg2 >> 7;
                            var107.field585 = var107.field585 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field8163 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field8163.length > var109) {
                    int[] var110 = this.field8163[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class25 var112 = this.field8277[var110[var111]];
                        var112.field583 = var112.field583 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lda;IIIZ)V")
    public final void method59(class55 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field8242++;
        class565 var6 = (class565) arg0;
        if (this.field8189 == 0 || var6.field8189 == 0) {
            return;
        }
        int var7 = var6.field8229;
        int[] var8 = var6.field8206;
        int[] var9 = var6.field8205;
        int[] var10 = var6.field8248;
        short[] var11 = var6.field8270;
        short[] var12 = var6.field8165;
        short[] var13 = var6.field8159;
        byte[] var14 = var6.field8217;
        short[] var15;
        short[] var16;
        byte[] var17;
        short[] var18;
        if (this.field8218 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var18 = this.field8218.field1868;
            var16 = this.field8218.field1865;
            var17 = this.field8218.field1863;
            var15 = this.field8218.field1864;
        }
        short[] var19;
        byte[] var20;
        short[] var21;
        short[] var22;
        if (var6.field8218 == null) {
            var21 = null;
            var19 = null;
            var22 = null;
            var20 = null;
        } else {
            var19 = var6.field8218.field1868;
            var20 = var6.field8218.field1863;
            var21 = var6.field8218.field1865;
            var22 = var6.field8218.field1864;
        }
        int[] var23 = var6.field8160;
        short[] var24 = var6.field8211;
        if (!var6.field8197) {
            var6.method3316(-10110);
        }
        short var25 = var6.field8238;
        short var26 = var6.field8167;
        short var27 = var6.field8267;
        short var28 = var6.field8182;
        short var29 = var6.field8191;
        short var30 = var6.field8245;
        for (int var31 = 0; var31 < this.field8229; var31++) {
            int var32 = this.field8205[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field8206[var31] - arg1;
                if (var27 <= var33 && var33 <= var28) {
                    int var34 = this.field8248[var31] - arg3;
                    if (var34 >= var29 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field8160[var31];
                        int var37 = this.field8160[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field8211[var38] - 1;
                            if (var35 == -1 || this.field8217[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39];
                                    int var41 = -1;
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var40; var43 < var42; var43++) {
                                        var41 = var24[var43] - 1;
                                        if (var41 == -1 || var14[var41] != 0) {
                                            break;
                                        }
                                    }
                                    if (var41 != -1) {
                                        if (var15 == null) {
                                            this.field8218 = new class151();
                                            var15 = this.field8218.field1864 = class166.method1049((byte) 124, this.field8270);
                                            var18 = this.field8218.field1868 = class166.method1049((byte) -74, this.field8165);
                                            var16 = this.field8218.field1865 = class166.method1049((byte) 116, this.field8159);
                                            var17 = this.field8218.field1863 = class690.method3902(0, this.field8217);
                                        }
                                        if (var22 == null) {
                                            class151 var44 = var6.field8218 = new class151();
                                            var22 = var44.field1864 = class166.method1049((byte) 116, var11);
                                            var19 = var44.field1868 = class166.method1049((byte) 96, var12);
                                            var21 = var44.field1865 = class166.method1049((byte) -87, var13);
                                            var20 = var44.field1863 = class690.method3902(0, var14);
                                        }
                                        short var45 = this.field8270[var35];
                                        short var46 = this.field8165[var35];
                                        short var47 = this.field8159[var35];
                                        byte var48 = this.field8217[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var20[var52] != 0) {
                                                var22[var52] += var45;
                                                var19[var52] += var46;
                                                var21[var52] += var47;
                                                var20[var52] += var48;
                                            }
                                        }
                                        int var53 = this.field8160[var31 + 1];
                                        short var54 = var13[var41];
                                        short var55 = var12[var41];
                                        byte var56 = var14[var41];
                                        int var57 = this.field8160[var31];
                                        short var58 = var11[var41];
                                        for (int var59 = var57; var59 < var53; var59++) {
                                            int var60 = this.field8211[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var17[var60] != 0) {
                                                var15[var60] += var58;
                                                var18[var60] += var55;
                                                var16[var60] += var54;
                                                var17[var60] += var56;
                                            }
                                        }
                                        if (this.field8174 == null && this.field8207 != null) {
                                            this.field8207.field5629 = null;
                                        }
                                        if (this.field8174 != null) {
                                            this.field8174.field5629 = null;
                                        }
                                        if (var6.field8174 == null && var6.field8207 != null) {
                                            var6.field8207.field5629 = null;
                                        }
                                        if (var6.field8174 != null) {
                                            var6.field8174.field5629 = null;
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

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "()V")
    public final void method114() {
        field8230++;
        if (this.field8272 <= 0 || this.field8259 <= 0) {
            return;
        }
        this.method3306(false, (byte) -48);
        if ((this.field8177 & 0x10) == 0 && this.field8244.field628 == null) {
            this.method3317(false, 0);
        }
        this.method3311(2048);
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V")
    private final void method3311(int arg0) {
        field8179++;
        if (!this.field8251) {
            return;
        }
        this.field8251 = false;
        if (this.field8273 == null && this.field8158 == null && this.field8180 == null) {
            if (this.field8206 != null && !class173.method1088(this.field8271, 458752, this.field8240)) {
                if (this.field8264 != null && this.field8264.field5629 == null) {
                    this.field8251 = true;
                } else {
                    if (!this.field8197) {
                        this.method3316(-10110);
                    }
                    this.field8206 = null;
                }
            }
            if (this.field8205 != null && !class664.method3749(458752, this.field8271, this.field8240)) {
                if (this.field8264 != null && this.field8264.field5629 == null) {
                    this.field8251 = true;
                } else {
                    if (!this.field8197) {
                        this.method3316(arg0 ^ 0xFFFFD082);
                    }
                    this.field8205 = null;
                }
            }
            if (this.field8248 != null && !class269.method1624(39, this.field8271, this.field8240)) {
                if (this.field8264 != null && this.field8264.field5629 == null) {
                    this.field8251 = true;
                } else {
                    if (!this.field8197) {
                        this.method3316(arg0 - 12158);
                    }
                    this.field8248 = null;
                }
            }
        }
        if (this.field8211 != null && this.field8206 == null && this.field8205 == null && this.field8248 == null) {
            this.field8160 = null;
            this.field8211 = null;
        }
        if (this.field8217 != null && !class518.method3065(this.field8271, arg0 + 20369, this.field8240)) {
            if (this.field8174 == null) {
                if (this.field8207 != null && this.field8207.field5629 == null) {
                    this.field8251 = true;
                } else {
                    this.field8217 = null;
                    this.field8270 = this.field8165 = this.field8159 = null;
                }
            } else if (this.field8174.field5629 == null) {
                this.field8251 = true;
            } else {
                this.field8217 = null;
                this.field8270 = this.field8165 = this.field8159 = null;
            }
        }
        if (this.field8199 != null && !class160.method1016(this.field8271, this.field8240, -126)) {
            if (this.field8207 != null && this.field8207.field5629 == null) {
                this.field8251 = true;
            } else {
                this.field8199 = null;
            }
        }
        if (this.field8185 != null && !class183.method1135(this.field8271, this.field8240, 116)) {
            if (this.field8207 != null && this.field8207.field5629 == null) {
                this.field8251 = true;
            } else {
                this.field8185 = null;
            }
        }
        if (arg0 != 2048) {
            this.field8160 = null;
        }
        if (this.field8215 != null && !class663.method3748((byte) -41, this.field8240, this.field8271)) {
            if (this.field8258 != null && this.field8258.field5629 == null) {
                this.field8251 = true;
            } else {
                this.field8215 = this.field8202 = null;
            }
        }
        if (this.field8257 != null && !class514.method3050(true, this.field8271, this.field8240)) {
            if (this.field8207 != null && this.field8207.field5629 == null) {
                this.field8251 = true;
            } else {
                this.field8257 = null;
            }
        }
        if (this.field8209 != null && !class435.method2603(this.field8240, true, this.field8271)) {
            if ((this.field8244 == null || this.field8244.field628 != null) && (this.field8207 == null || this.field8207.field5629 != null)) {
                this.field8209 = this.field8161 = this.field8214 = null;
            } else {
                this.field8251 = true;
            }
        }
        if (this.field8208 != null && !class430.method2588(-94, this.field8271, this.field8240)) {
            this.field8274 = null;
            this.field8208 = null;
        }
        if (this.field8223 != null && !class438.method2618(this.field8271, this.field8240, arg0 - 2153)) {
            this.field8186 = null;
            this.field8223 = null;
        }
        if (this.field8163 != null && !class373.method2175(1024, this.field8240, this.field8271)) {
            this.field8163 = null;
        }
        if (this.field8194 != null && (this.field8240 & 0x800) == 0 && (this.field8240 & 0x40000) == 0) {
            this.field8194 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "()Z")
    public final boolean method110() {
        field8246++;
        if (this.field8257 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field8257.length; var1++) {
            if (this.field8257[var1] != -1 && !this.field8171.field2023.method395(this.field8257[var1], 28576)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ji", name = "ba", descriptor = "(IILi;Li;III)V")
    public final void method102(int arg0, int arg1, class37 arg2, class37 arg3, int arg4, int arg5, int arg6) {
        if (!this.field8197) {
            this.method3316(-10110);
        }
        field8210++;
        int var8 = arg4 + this.field8267;
        int var9 = arg4 + this.field8182;
        int var10 = this.field8191 + arg6;
        int var11 = this.field8245 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field702 <= (var9 + arg2.field695 >> arg2.field696) || var10 < 0 || arg2.field706 <= (arg2.field695 + var11 >> arg2.field696)) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field702 <= (var9 + arg3.field695 >> arg3.field696) || var10 < 0 || var11 + arg3.field695 >> arg3.field696 >= arg3.field706) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field696;
            int var13 = var9 + arg2.field695 - 1 >> arg2.field696;
            int var14 = var10 >> arg2.field696;
            int var15 = arg2.field695 + var11 - 1 >> arg2.field696;
            if (arg5 == arg2.method437(107, var14, var12) && arg2.method437(89, var14, var13) == arg5 && arg5 == arg2.method437(98, var15, var12) && arg5 == arg2.method437(89, var15, var13)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field8229; var32++) {
                this.field8205[var32] = this.field8205[var32] + arg2.method428(true, this.field8206[var32] + arg4, this.field8248[var32] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var29 = this.field8238;
            if (var29 == 0) {
                return;
            }
            for (int var30 = 0; var30 < this.field8229; var30++) {
                int var31 = (this.field8205[var30] << 16) / var29;
                if (arg1 > var31) {
                    this.field8205[var30] -= -((arg1 - var31) * (arg2.method428(true, this.field8206[var30] + arg4, this.field8248[var30] + arg6) - arg5) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var16 = (arg1 & 0xFF) * 4;
            int var17 = (arg1 >> 8 & 0xFF) * 4;
            int var18 = arg1 >> 16 & 0xFF << 6;
            int var19 = (arg1 >> 24 & 0xFF) << 6;
            if (arg4 - (var16 >> 1) < 0 || ((var16 >> 1) + arg4 + arg2.field695) >= (arg2.field702 << arg2.field696) || arg6 - (var17 >> 1) < 0 || (arg2.field706 << arg2.field696) <= ((var17 >> 1) + arg6 + arg2.field695)) {
                return;
            }
            this.method574(arg5, var19, 16680, var16, var18, var17, arg4, arg2, arg6);
        } else if (arg0 == 4) {
            int var27 = this.field8167 - this.field8238;
            for (int var28 = 0; var28 < this.field8229; var28++) {
                this.field8205[var28] += arg3.method428(true, this.field8206[var28] + arg4, this.field8248[var28] + arg6) + var27 - arg5;
            }
        } else if (arg0 == 5) {
            int var20 = this.field8167 - this.field8238;
            for (int var21 = 0; var21 < this.field8229; var21++) {
                int var22 = this.field8206[var21] + arg4;
                int var23 = this.field8248[var21] + arg6;
                int var24 = arg2.method428(true, var22, var23);
                int var25 = arg3.method428(true, var22, var23);
                int var26 = var24 - (arg1 + var25);
                this.field8205[var21] = ((this.field8205[var21] << 8) / var20 * var26 >> 8) - (arg5 - var24);
            }
        }
        this.field8197 = false;
        if (this.field8264 != null) {
            this.field8264.field5629 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "PA", descriptor = "()I")
    public final int method118() {
        field8260++;
        return this.field8240;
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)V")
    private final void method3312(int arg0) {
        if (this.field8180 != null) {
            class510 var2 = this.field8171.field7260;
            this.field8171.method3007(34963);
            this.field8171.method309(false);
            this.field8171.method2969(false, (byte) -104);
            this.field8171.method2960(null, this.field8171.field7322, arg0 - 7, this.field8171.field7387, null);
            for (int var3 = 0; var3 < this.field8196; var3++) {
                class351 var4 = this.field8180[var3];
                class25 var5 = this.field8277[var3];
                if (!var4.field4689 || !this.field8171.method237()) {
                    float var6 = (float) (this.field8206[var4.field4683] + this.field8206[var4.field4680] + this.field8206[var4.field4692]) * 0.3333333F;
                    float var7 = (float) (this.field8205[var4.field4692] + this.field8205[var4.field4680] + this.field8205[var4.field4683]) * 0.3333333F;
                    float var8 = (float) (this.field8248[var4.field4692] + this.field8248[var4.field4680] + this.field8248[var4.field4683]) * 0.3333333F;
                    float var9 = class692.field9846 * var8 + class670.field9639 * var7 + class661.field9381 * var6 + class363.field4834;
                    float var10 = class475.field6657 * var8 + class395.field5584 * var7 + class251.field3446 * var6 + class363.field4836;
                    float var11 = class627.field8994 * var8 + class658.field9345 * var7 + class510.field7464 * var6 + class33.field672;
                    var2.method3020(var5.field583, var4.field4684 * var5.field592 >> 7, (float) var4.field4685 - var11, var4.field4687 * var5.field585 >> 7, (float) var5.field594 - var10, (float) var5.field586 + var9, 1);
                    this.field8171.method2987(false, var2);
                    int var12 = var5.field584;
                    OpenGL.glColor4ub((byte) (var12 >> 16), (byte) (var12 >> 8), (byte) var12, (byte) (var12 >> 24));
                    this.field8171.method2988(true, var4.field4686);
                    this.field8171.method2996(var4.field4681, true);
                    this.field8171.method3000(7, -104, 4, 0);
                }
            }
            this.field8171.method309(true);
            this.field8171.method3013(25973);
        }
        field8168++;
        if (arg0 != 7) {
            this.field8229 = -26;
        }
    }

    @OriginalMember(owner = "client!ji", name = "LA", descriptor = "()Z")
    public final boolean method112() {
        field8176++;
        return this.field8247;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BI)Z")
    public static final boolean method3313(byte arg0, int arg1) {
        if (arg0 < 23) {
            field8241 = 92;
        }
        field8162++;
        return arg1 == 0;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(BI)I")
    public static final int method3314(byte arg0, int arg1) {
        field8225++;
        int var2 = 0;
        if (arg0 != 17) {
            return 77;
        }
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!ji", name = "M", descriptor = "(I)V")
    public final void method74(int arg0) {
        field8216++;
        int var2 = class395.field5579[arg0];
        int var3 = class395.field5582[arg0];
        for (int var4 = 0; var4 < this.field8229; var4++) {
            int var5 = this.field8248[var4] * var2 + this.field8206[var4] * var3 >> 14;
            this.field8248[var4] = this.field8248[var4] * var3 - (this.field8206[var4] * var2) >> 14;
            this.field8206[var4] = var5;
        }
        if (this.field8264 != null) {
            this.field8264.field5629 = null;
        }
        this.field8197 = false;
    }

    @OriginalMember(owner = "client!ji", name = "KA", descriptor = "()I")
    public final int method94() {
        if (!this.field8197) {
            this.method3316(-10110);
        }
        field8175++;
        return this.field8267;
    }

    @OriginalMember(owner = "client!ji", name = "B", descriptor = "(I[IIIIZI[I)V")
    public final void method96(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field8239++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            int var12 = arg2 << 4;
            int var13 = 0;
            class327.field4364 = 0;
            class455.field6410 = 0;
            class672.field9660 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field8223.length) {
                    int[] var16 = this.field8223[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field8186 == null || (this.field8186[var18] & arg6) != 0) {
                            class327.field4364 += this.field8206[var18];
                            class455.field6410 += this.field8205[var18];
                            var13++;
                            class672.field9660 += this.field8248[var18];
                        }
                    }
                }
            }
            if (var13 > 0) {
                class672.field9660 = class672.field9660 / var13 + var10;
                class327.field4364 = class327.field4364 / var13 + var12;
                class643.field9185 = true;
                class455.field6410 = class455.field6410 / var13 + var11;
            } else {
                class327.field4364 = var12;
                class455.field6410 = var11;
                class672.field9660 = var10;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[1] * arg3 + arg7[2] * arg4 + arg7[0] * arg2 + 8192 >> 14;
                int var20 = arg7[3] * arg2 + arg7[4] * arg3 + (arg7[5] * arg4) + 8192 >> 14;
                int var21 = arg7[6] * arg2 + arg7[8] * arg4 + arg7[7] * arg3 + 8192 >> 14;
                arg3 = var20;
                arg2 = var19;
                arg4 = var21;
            }
            int var22 = arg4 << 4;
            int var23 = arg2 << 4;
            int var24 = arg3 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field8223.length > var26) {
                    int[] var27 = this.field8223[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field8186 == null || (arg6 & this.field8186[var29]) != 0) {
                            this.field8206[var29] += var23;
                            this.field8205[var29] += var24;
                            this.field8248[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (this.field8223.length > var109) {
                        int[] var110 = this.field8223[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field8186 == null || (this.field8186[var112] & arg6) != 0) {
                                this.field8206[var112] -= class327.field4364;
                                this.field8205[var112] -= class455.field6410;
                                this.field8248[var112] -= class672.field9660;
                                if (arg4 != 0) {
                                    int var113 = class395.field5579[arg4];
                                    int var114 = class395.field5582[arg4];
                                    int var115 = this.field8205[var112] * var113 + this.field8206[var112] * var114 + 16383 >> 14;
                                    this.field8205[var112] = this.field8205[var112] * var114 + 16383 - (this.field8206[var112] * var113) >> 14;
                                    this.field8206[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class395.field5579[arg2];
                                    int var117 = class395.field5582[arg2];
                                    int var118 = this.field8205[var112] * var117 + 16383 - (this.field8248[var112] * var116) >> 14;
                                    this.field8248[var112] = this.field8248[var112] * var117 + this.field8205[var112] * var116 + 16383 >> 14;
                                    this.field8205[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class395.field5579[arg3];
                                    int var120 = class395.field5582[arg3];
                                    int var121 = this.field8248[var112] * var119 + this.field8206[var112] * var120 + 16383 >> 14;
                                    this.field8248[var112] = this.field8248[var112] * var120 + 16383 - (this.field8206[var112] * var119) >> 14;
                                    this.field8206[var112] = var121;
                                }
                                this.field8206[var112] += class327.field4364;
                                this.field8205[var112] += class455.field6410;
                                this.field8248[var112] += class672.field9660;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (var92 < this.field8223.length) {
                            int[] var93 = this.field8223[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field8186 == null || (arg6 & this.field8186[var95]) != 0) {
                                    int var96 = this.field8160[var95];
                                    int var97 = this.field8160[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field8211[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class395.field5579[arg4];
                                            int var101 = class395.field5582[arg4];
                                            int var102 = this.field8165[var99] * var100 + this.field8270[var99] * var101 + 16383 >> 14;
                                            this.field8165[var99] = (short) (this.field8165[var99] * var101 + 16383 - (this.field8270[var99] * var100) >> 14);
                                            this.field8270[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class395.field5579[arg2];
                                            int var104 = class395.field5582[arg2];
                                            int var105 = this.field8165[var99] * var104 + 16383 - (this.field8159[var99] * var103) >> 14;
                                            this.field8159[var99] = (short) (this.field8165[var99] * var103 + this.field8159[var99] * var104 + 16383 >> 14);
                                            this.field8165[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class395.field5579[arg3];
                                            int var107 = class395.field5582[arg3];
                                            int var108 = this.field8159[var99] * var106 + (this.field8270[var99] * var107) + 16383 >> 14;
                                            this.field8159[var99] = (short) (this.field8159[var99] * var107 + 16383 - (this.field8270[var99] * var106) >> 14);
                                            this.field8270[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field8174 == null && this.field8207 != null) {
                        this.field8207.field5629 = null;
                    }
                    if (this.field8174 != null) {
                        this.field8174.field5629 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class643.field9185) {
                    int var36 = arg7[6] * class672.field9660 + arg7[3] * class455.field6410 + arg7[0] * class327.field4364 + 8192 >> 14;
                    int var37 = arg7[4] * class455.field6410 + arg7[1] * class327.field4364 + arg7[7] * class672.field9660 + 8192 >> 14;
                    int var38 = var34 + var37;
                    int var39 = arg7[2] * class327.field4364 + arg7[5] * class455.field6410 + arg7[8] * class672.field9660 + 8192 >> 14;
                    int var40 = var33 + var36;
                    int var41 = var35 + var39;
                    class327.field4364 = var40;
                    class455.field6410 = var38;
                    class643.field9185 = false;
                    class672.field9660 = var41;
                }
                int[] var42 = new int[9];
                int var43 = class395.field5582[arg2];
                int var44 = class395.field5579[arg2];
                int var45 = class395.field5582[arg3];
                int var46 = class395.field5579[arg3];
                int var47 = class395.field5582[arg4];
                int var48 = class395.field5579[arg4];
                int var49 = var44 * var47 + 8192 >> 14;
                int var50 = var44 * var48 + 8192 >> 14;
                var42[6] = -var46 * var47 + (var45 * var50) + 8192 >> 14;
                var42[8] = var43 * var45 + 8192 >> 14;
                var42[4] = var43 * var47 + 8192 >> 14;
                var42[5] = -var44;
                var42[1] = -var45 * var48 + var46 * var49 + 8192 >> 14;
                var42[7] = var46 * var48 + var45 * var49 + 8192 >> 14;
                var42[2] = var43 * var46 + 8192 >> 14;
                var42[3] = var43 * var48 + 8192 >> 14;
                var42[0] = var45 * var47 + var46 * var50 + 8192 >> 14;
                int var51 = var42[2] * -class672.field9660 + var42[1] * -class455.field6410 + var42[0] * -class327.field4364 + 8192 >> 14;
                int var52 = var42[5] * -class672.field9660 + var42[3] * -class327.field4364 + var42[4] * -class455.field6410 + 8192 >> 14;
                int var53 = var42[6] * -class327.field4364 - (-(var42[8] * -class672.field9660) - (var42[7] * -class455.field6410) - 8192) >> 14;
                int var54 = class327.field4364 + var51;
                int var55 = class455.field6410 + var52;
                int var56 = var53 + class672.field9660;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var87 = 0; var87 < 3; var87++) {
                        int var88 = 0;
                        for (int var89 = 0; var89 < 3; var89++) {
                            var88 += var42[var58 * 3 + var89] * arg7[var87 * 3 + var89];
                        }
                        var57[var58 * 3 + var87] = var88 + 8192 >> 14;
                    }
                }
                int var59 = var42[2] * var35 + var42[1] * var34 + var42[0] * var33 + 8192 >> 14;
                int var60 = var42[4] * var34 + var42[3] * var33 + (var42[5] * var35) + 8192 >> 14;
                int var61 = var54 + var59;
                int var62 = var42[6] * var33 + var42[7] * var34 + var42[8] * var35 + 8192 >> 14;
                int var63 = var55 + var60;
                int var64 = var56 + var62;
                int[] var65 = new int[9];
                for (int var66 = 0; var66 < 3; var66++) {
                    for (int var84 = 0; var84 < 3; var84++) {
                        int var85 = 0;
                        for (int var86 = 0; var86 < 3; var86++) {
                            var85 += arg7[var66 * 3 + var86] * var57[var86 * 3 + var84];
                        }
                        var65[var66 * 3 + var84] = var85 + 8192 >> 14;
                    }
                }
                int var67 = arg7[1] * var63 + arg7[0] * var61 + (arg7[2] * var64) + 8192 >> 14;
                int var68 = arg7[3] * var61 + (arg7[5] * var64) + arg7[4] * var63 + 8192 >> 14;
                int var69 = arg7[7] * var63 + arg7[6] * var61 + arg7[8] * var64 + 8192 >> 14;
                int var70 = var31 + var68;
                int var71 = var30 + var67;
                int var72 = var32 + var69;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (var74 < this.field8223.length) {
                        int[] var75 = this.field8223[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field8186 == null || (this.field8186[var77] & arg6) != 0) {
                                int var78 = this.field8206[var77] * var65[0] + this.field8205[var77] * var65[1] + (this.field8248[var77] * var65[2]) + 8192 >> 14;
                                int var79 = this.field8206[var77] * var65[3] - (-(this.field8205[var77] * var65[4]) - (this.field8248[var77] * var65[5] + 8192)) >> 14;
                                int var80 = this.field8248[var77] * var65[8] + this.field8205[var77] * var65[7] + this.field8206[var77] * var65[6] + 8192 >> 14;
                                int var81 = var70 + var79;
                                int var82 = var71 + var78;
                                int var83 = var72 + var80;
                                this.field8206[var77] = var82;
                                this.field8205[var77] = var81;
                                this.field8248[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (this.field8223.length > var123) {
                        int[] var124 = this.field8223[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field8186 == null || (arg6 & this.field8186[var126]) != 0) {
                                this.field8206[var126] -= class327.field4364;
                                this.field8205[var126] -= class455.field6410;
                                this.field8248[var126] -= class672.field9660;
                                this.field8206[var126] = this.field8206[var126] * arg2 >> 7;
                                this.field8205[var126] = this.field8205[var126] * arg3 >> 7;
                                this.field8248[var126] = this.field8248[var126] * arg4 >> 7;
                                this.field8206[var126] += class327.field4364;
                                this.field8205[var126] += class455.field6410;
                                this.field8248[var126] += class672.field9660;
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
                if (class643.field9185) {
                    int var133 = arg7[6] * class672.field9660 + arg7[0] * class327.field4364 - (-(arg7[3] * class455.field6410) - 8192) >> 14;
                    int var134 = arg7[7] * class672.field9660 + arg7[4] * class455.field6410 + arg7[1] * class327.field4364 + 8192 >> 14;
                    int var135 = var130 + var133;
                    int var136 = var131 + var134;
                    int var137 = arg7[8] * class672.field9660 + (arg7[2] * class327.field4364 - (-(arg7[5] * class455.field6410) - 8192)) >> 14;
                    class327.field4364 = var135;
                    class455.field6410 = var136;
                    int var138 = var132 + var137;
                    class643.field9185 = false;
                    class672.field9660 = var138;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class327.field4364 * var139 + 8192 >> 14;
                int var143 = -class455.field6410 * var140 + 8192 >> 14;
                int var144 = -class672.field9660 * var141 + 8192 >> 14;
                int var145 = var142 + class327.field4364;
                int var146 = class455.field6410 + var143;
                int var147 = class672.field9660 + var144;
                int[] var148 = new int[] { arg7[0] * var139 + 8192 >> 14, arg7[3] * var139 + 8192 >> 14, arg7[6] * var139 + 8192 >> 14, arg7[1] * var140 + 8192 >> 14, arg7[4] * var140 + 8192 >> 14, arg7[7] * var140 + 8192 >> 14, arg7[2] * var141 + 8192 >> 14, arg7[5] * var141 + 8192 >> 14, arg7[8] * var141 + 8192 >> 14 };
                int var149 = var130 * var139 + 8192 >> 14;
                int var150 = var131 * var140 + 8192 >> 14;
                int var151 = var145 + var149;
                int var152 = var132 * var141 + 8192 >> 14;
                int var153 = var146 + var150;
                int var154 = var147 + var152;
                int[] var155 = new int[9];
                for (int var156 = 0; var156 < 3; var156++) {
                    for (int var174 = 0; var174 < 3; var174++) {
                        int var175 = 0;
                        for (int var176 = 0; var176 < 3; var176++) {
                            var175 += arg7[var156 * 3 + var176] * var148[var176 * 3 + var174];
                        }
                        var155[var156 * 3 + var174] = var175 + 8192 >> 14;
                    }
                }
                int var157 = arg7[0] * var151 + arg7[1] * var153 + arg7[2] * var154 + 8192 >> 14;
                int var158 = arg7[3] * var151 + 8192 - (-(arg7[4] * var153) - (arg7[5] * var154)) >> 14;
                int var159 = arg7[6] * var151 + arg7[8] * var154 + arg7[7] * var153 + 8192 >> 14;
                int var160 = var127 + var157;
                int var161 = var128 + var158;
                int var162 = var129 + var159;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (this.field8223.length > var164) {
                        int[] var165 = this.field8223[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field8186 == null || (arg6 & this.field8186[var167]) != 0) {
                                int var168 = this.field8206[var167] * var155[0] + (this.field8248[var167] * var155[2]) + this.field8205[var167] * var155[1] + 8192 >> 14;
                                int var169 = this.field8206[var167] * var155[3] + (this.field8248[var167] * var155[5]) + this.field8205[var167] * var155[4] + 8192 >> 14;
                                int var170 = var160 + var168;
                                int var171 = var161 + var169;
                                int var172 = this.field8206[var167] * var155[6] + this.field8248[var167] * var155[8] + this.field8205[var167] * var155[7] + 8192 >> 14;
                                this.field8206[var167] = var170;
                                int var173 = var162 + var172;
                                this.field8205[var167] = var171;
                                this.field8248[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field8208 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field8208.length) {
                        int[] var182 = this.field8208[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field8274 == null || (arg6 & this.field8274[var184]) != 0) {
                                int var185 = (this.field8185[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field8185[var184] = (byte) var185;
                                if (this.field8207 != null) {
                                    this.field8207.field5629 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field8180 != null) {
                    for (int var178 = 0; var178 < this.field8196; var178++) {
                        class351 var179 = this.field8180[var178];
                        class25 var180 = this.field8277[var178];
                        var180.field584 = var180.field584 & 0xFFFFFF | 255 - (this.field8185[var179.field4688] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field8208 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (var190 < this.field8208.length) {
                        int[] var191 = this.field8208[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field8274 == null || (arg6 & this.field8274[var193]) != 0) {
                                int var194 = this.field8199[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFC0F) >> 10;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = var194 & 0x7F;
                                int var198 = arg2 + var195 & 0x3F;
                                int var199 = arg3 / 4 + var196;
                                int var200 = arg4 + var197;
                                if (var199 < 0) {
                                    var199 = 0;
                                } else if (var199 > 7) {
                                    var199 = 7;
                                }
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field8199[var193] = (short) class242.method1474(class242.method1474(var198 << 10, var199 << 7), var200);
                                if (this.field8207 != null) {
                                    this.field8207.field5629 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field8180 != null) {
                    for (int var187 = 0; var187 < this.field8196; var187++) {
                        class351 var188 = this.field8180[var187];
                        class25 var189 = this.field8277[var187];
                        var189.field584 = class285.field3868[this.field8199[var188.field4688] & 0xFFFF] & 0xFFFFFF | var189.field584 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field8163 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (this.field8163.length > var202) {
                        int[] var203 = this.field8163[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class25 var205 = this.field8277[var203[var204]];
                            var205.field586 += arg2;
                            var205.field594 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field8163 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field8163.length > var207) {
                        int[] var208 = this.field8163[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class25 var210 = this.field8277[var208[var209]];
                            var210.field585 = var210.field585 * arg3 >> 7;
                            var210.field592 = var210.field592 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field8163 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field8163.length) {
                    int[] var213 = this.field8163[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class25 var215 = this.field8277[var213[var214]];
                        var215.field583 = var215.field583 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "MA", descriptor = "(I)V")
    public final void method126(int arg0) {
        field8201++;
        int var2 = class395.field5579[arg0];
        int var3 = class395.field5582[arg0];
        for (int var4 = 0; var4 < this.field8229; var4++) {
            int var5 = this.field8205[var4] * var3 - (this.field8248[var4] * var2) >> 14;
            this.field8248[var4] = this.field8248[var4] * var3 + this.field8205[var4] * var2 >> 14;
            this.field8205[var4] = var5;
        }
        this.field8197 = false;
        if (this.field8264 != null) {
            this.field8264.field5629 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "H", descriptor = "()I")
    public final int method119() {
        field8164++;
        if (!this.field8197) {
            this.method3316(-10110);
        }
        return this.field8167;
    }

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "()I")
    public final int method115() {
        field8213++;
        if (!this.field8197) {
            this.method3316(-10110);
        }
        return this.field8182;
    }

    @OriginalMember(owner = "client!ji", name = "fa", descriptor = "(I)V")
    public final void method101(int arg0) {
        field8233++;
        int var2 = class395.field5579[arg0];
        int var3 = class395.field5582[arg0];
        for (int var4 = 0; var4 < this.field8229; var4++) {
            int var7 = this.field8248[var4] * var2 + this.field8206[var4] * var3 >> 14;
            this.field8248[var4] = this.field8248[var4] * var3 - (this.field8206[var4] * var2) >> 14;
            this.field8206[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field8272; var5++) {
            int var6 = this.field8270[var5] * var3 + this.field8159[var5] * var2 >> 14;
            this.field8159[var5] = (short) (this.field8159[var5] * var3 - (this.field8270[var5] * var2) >> 14);
            this.field8270[var5] = (short) var6;
        }
        if (this.field8174 == null && this.field8207 != null) {
            this.field8207.field5629 = null;
        }
        if (this.field8174 != null) {
            this.field8174.field5629 = null;
        }
        if (this.field8264 != null) {
            this.field8264.field5629 = null;
        }
        this.field8197 = false;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lq;Lmj;II)V")
    public final void method122(class394 arg0, class605 arg1, int arg2, int arg3) {
        field8269++;
        if (this.field8272 == 0) {
            return;
        }
        class510 var5 = this.field8171.field7298;
        if (!this.field8197) {
            this.method3316(-10110);
        }
        class510 var6 = (class510) arg0;
        class658.field9345 = var5.field7442 * var6.field7429 + var5.field7429 * var6.field7424 + var5.field7426 * var6.field7440;
        class33.field672 = var5.field7442 * var6.field7455 + var5.field7429 * var6.field7434 + var5.field7426 * var6.field7441 + var5.field7455;
        float var7 = (float) this.field8238 * class658.field9345 + class33.field672;
        float var8 = (float) this.field8167 * class658.field9345 + class33.field672;
        float var9;
        float var10;
        if ((var7 > var8)) {
            var10 = (float) this.field8262 + var7;
            var9 = var8 - (float) this.field8262;
        } else {
            var9 = (float) (-this.field8262) + var7;
            var10 = (float) this.field8262 + var8;
        }
        if ((var9 >= this.field8171.field7389) || ((float) this.field8171.field7332 >= var10)) {
            return;
        }
        class670.field9639 = var5.field7453 * var6.field7429 + var5.field7440 * var6.field7424 + var5.field7432 * var6.field7440;
        class363.field4834 = var5.field7453 * var6.field7455 + var5.field7440 * var6.field7434 + var5.field7432 * var6.field7441 + var5.field7441;
        float var11 = (float) this.field8238 * class670.field9639 + class363.field4834;
        float var12 = (float) this.field8167 * class670.field9639 + class363.field4834;
        float var13;
        float var14;
        if ((var11 > var12)) {
            var14 = (var12 - (float) this.field8262) * (float) this.field8171.field7336;
            var13 = ((float) this.field8262 + var11) * (float) this.field8171.field7336;
        } else {
            var13 = ((float) this.field8262 + var12) * (float) this.field8171.field7336;
            var14 = (var11 - (float) this.field8262) * (float) this.field8171.field7336;
        }
        if ((this.field8171.field7320 <= var14 / (float) arg2) || (this.field8171.field7385 >= var13 / (float) arg2)) {
            return;
        }
        class395.field5584 = var5.field7449 * var6.field7429 + var5.field7454 * var6.field7440 + var5.field7424 * var6.field7424;
        class363.field4836 = var5.field7449 * var6.field7455 + var5.field7454 * var6.field7441 + var5.field7424 * var6.field7434 + var5.field7434;
        float var15 = (float) this.field8238 * class395.field5584 + class363.field4836;
        float var16 = (float) this.field8167 * class395.field5584 + class363.field4836;
        float var17;
        float var18;
        if ((var16 < var15)) {
            var18 = ((float) this.field8262 + var15) * (float) this.field8171.field7357;
            var17 = ((float) (-this.field8262) + var16) * (float) this.field8171.field7357;
        } else {
            var17 = (var15 - (float) this.field8262) * (float) this.field8171.field7357;
            var18 = ((float) this.field8262 + var16) * (float) this.field8171.field7357;
        }
        if ((this.field8171.field7393 <= var17 / (float) arg2) || (var18 / (float) arg2 <= this.field8171.field7305)) {
            return;
        }
        if (arg1 != null || this.field8180 != null) {
            class475.field6657 = var5.field7449 * var6.field7442 + var5.field7454 * var6.field7453 + var5.field7424 * var6.field7449;
            class510.field7464 = var5.field7442 * var6.field7426 + var5.field7429 * var6.field7454 + var5.field7426 * var6.field7432;
            class661.field9381 = var5.field7453 * var6.field7426 + var5.field7440 * var6.field7454 + var5.field7432 * var6.field7432;
            class251.field3446 = var5.field7449 * var6.field7426 + var5.field7454 * var6.field7432 + var5.field7424 * var6.field7454;
            class627.field8994 = var5.field7442 * var6.field7442 + var5.field7429 * var6.field7449 + var5.field7426 * var6.field7453;
            class692.field9846 = var5.field7453 * var6.field7442 + var5.field7440 * var6.field7449 + var5.field7432 * var6.field7453;
        }
        if (arg1 != null) {
            int var19 = this.field8267 + this.field8182 >> 1;
            int var20 = this.field8245 + this.field8191 >> 1;
            int var21 = (int) ((float) var20 * class692.field9846 + (float) this.field8238 * class670.field9639 + (float) var19 * class661.field9381 + class363.field4834);
            int var22 = (int) ((float) var20 * class475.field6657 + (float) this.field8238 * class395.field5584 + (float) var19 * class251.field3446 + class363.field4836);
            int var23 = (int) ((float) var20 * class627.field8994 + (float) this.field8238 * class658.field9345 + (float) var19 * class510.field7464 + class33.field672);
            int var24 = (int) ((float) var20 * class692.field9846 + (float) this.field8167 * class670.field9639 + (float) var19 * class661.field9381 + class363.field4834);
            int var25 = (int) ((float) var20 * class475.field6657 + (float) this.field8167 * class395.field5584 + (float) var19 * class251.field3446 + class363.field4836);
            arg1.field8719 = this.field8171.field7337 + (this.field8171.field7336 * var24 / arg2);
            arg1.field8716 = this.field8171.field7357 * var22 / arg2 + this.field8171.field7356;
            int var26 = (int) ((float) var20 * class627.field8994 + (float) this.field8167 * class658.field9345 + (float) var19 * class510.field7464 + class33.field672);
            arg1.field8714 = this.field8171.field7337 + (this.field8171.field7336 * var21 / arg2);
            arg1.field8718 = this.field8171.field7356 + (this.field8171.field7357 * var25 / arg2);
            if (this.field8171.field7332 <= var23 || this.field8171.field7332 <= var26) {
                arg1.field8715 = (var21 + this.field8262) * this.field8171.field7336 / arg2 + this.field8171.field7337 - arg1.field8714;
                arg1.field8717 = true;
            }
        }
        this.field8171.method2956((float) arg2, (byte) 122);
        this.field8171.method2971((byte) -9);
        this.field8171.method2937(false, var6);
        this.method3307(29066);
        this.field8171.method3013(25973);
        this.method3312(7);
    }

    @OriginalMember(owner = "client!ji", name = "DA", descriptor = "(SS)V")
    public final void method130(short arg0, short arg1) {
        field8234++;
        class212 var3 = this.field8171.field2023;
        for (int var4 = 0; var4 < this.field8189; var4++) {
            if (this.field8257[var4] == arg0) {
                this.field8257[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class352 var7 = var3.method397(arg0 & 0xFFFF, (byte) 107);
            var5 = var7.field4703;
            var6 = var7.field4704;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class352 var10 = var3.method397(arg1 & 0xFFFF, (byte) 52);
            var8 = var10.field4703;
            var9 = var10.field4704;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field8180 != null) {
            for (int var11 = 0; var11 < this.field8196; var11++) {
                class351 var12 = this.field8180[var11];
                class25 var13 = this.field8277[var11];
                var13.field584 = class285.field3868[this.field8199[var12.field4688] & 0xFFFF] & 0xFFFFFF | var13.field584 & 0xFF000000;
            }
        }
        if (this.field8207 != null) {
            this.field8207.field5629 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(SIIBB)I")
    private final int method3315(short arg0, int arg1, int arg2, byte arg3, byte arg4) {
        if (arg3 != -71) {
            this.field8262 = -9;
        }
        field8255++;
        int var6 = class285.field3868[class31.method398(arg2, (byte) -91, arg1)];
        if (arg0 != -1) {
            class352 var7 = this.field8171.field2023.method397(arg0 & 0xFFFF, (byte) 8);
            int var8 = var7.field4703 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg1 < 0) {
                    var9 = 0;
                } else if (arg1 > 127) {
                    var9 = 16777215;
                } else {
                    var9 = arg1 * 131586;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) + ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field4704 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = (var6 >> 16 & 0xFF) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (var6 >> 8 & 0xFF) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (var6 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                var6 = (var15 >> 8) + ((var13 & 0x5400FF00) << 8) + (var14 & 0xFF00);
            }
        }
        return 255 - ((arg4 & 0xFF) - (var6 << 8));
    }

    @OriginalMember(owner = "client!ji", name = "F", descriptor = "()Z")
    public final boolean method116() {
        field8200++;
        if (this.field8223 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field8173; var1++) {
            this.field8206[var1] <<= 0x4;
            this.field8205[var1] <<= 0x4;
            this.field8248[var1] <<= 0x4;
        }
        class672.field9660 = 0;
        class455.field6410 = 0;
        class327.field4364 = 0;
        return true;
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "(I)V")
    private final void method3316(int arg0) {
        field8228++;
        if (arg0 != -10110) {
            this.field8259 = 110;
        }
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field8229; var10++) {
            int var11 = this.field8206[var10];
            int var12 = this.field8205[var10];
            int var13 = this.field8248[var10];
            if (var6 < var12) {
                var6 = var12;
            }
            if (var5 < var11) {
                var5 = var11;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var3 > var12) {
                var3 = var12;
            }
            if (var13 > var7) {
                var7 = var13;
            }
            if (var4 > var13) {
                var4 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var11 * var11 + var12 * var12 + var13 * var13;
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field8267 = (short) var2;
        this.field8245 = (short) var7;
        this.field8182 = (short) var5;
        this.field8238 = (short) var3;
        this.field8167 = (short) var6;
        this.field8191 = (short) var4;
        this.field8262 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        this.field8237 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        this.field8197 = true;
    }

    @OriginalMember(owner = "client!ji", name = "SA", descriptor = "(I)V")
    public final void method98(int arg0) {
        this.field8240 = arg0;
        field8220++;
        if (this.field8218 != null && (this.field8240 & 0x10000) == 0) {
            this.field8270 = this.field8218.field1864;
            this.field8165 = this.field8218.field1868;
            this.field8159 = this.field8218.field1865;
            this.field8217 = this.field8218.field1863;
            this.field8218 = null;
        }
        this.field8251 = true;
        this.method3311(2048);
    }

    @OriginalMember(owner = "client!ji", name = "TA", descriptor = "()I")
    public final int method105() {
        field8266++;
        return this.field8254;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZI)V")
    private final void method3317(boolean arg0, int arg1) {
        field8227++;
        if (this.field8171.field7352.field5205.length < this.field8259 * 6) {
            this.field8171.field7352 = new class226(this.field8259 * 6 + 600);
        } else {
            this.field8171.field7352.field5195 = 0;
        }
        class226 var3 = this.field8171.field7352;
        if (this.field8171.field7353) {
            for (int var4 = 0; var4 < this.field8259; var4++) {
                var3.method2261((byte) 66, this.field8209[var4]);
                var3.method2261((byte) 38, this.field8161[var4]);
                var3.method2261((byte) 87, this.field8214[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field8259; var5++) {
                var3.method2236(this.field8209[var5], arg1 + 123);
                var3.method2236(this.field8161[var5], 123);
                var3.method2236(this.field8214[var5], 36);
            }
        }
        if (var3.field5195 == arg1) {
            return;
        }
        if (arg0) {
            if (this.field8236 == null) {
                this.field8236 = this.field8171.method2980(5123, 1, var3.field5205, true, var3.field5195);
            } else {
                this.field8236.method938(var3.field5205, 5123, 32290, var3.field5195);
            }
            this.field8244.field628 = this.field8236;
        } else {
            this.field8244.field628 = this.field8171.method2980(5123, arg1 + 1, var3.field5205, false, var3.field5195);
        }
        if (!arg0) {
            this.field8251 = true;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BIZ)Lda;")
    public final class55 method97(byte arg0, int arg1, boolean arg2) {
        field8198++;
        class565 var4;
        class565 var5;
        if (arg0 == 1) {
            var4 = this.field8171.field7354;
            var5 = this.field8171.field7338;
        } else if (arg0 == 2) {
            var4 = this.field8171.field7359;
            var5 = this.field8171.field7363;
        } else if (arg0 == 3) {
            var4 = this.field8171.field7304;
            var5 = this.field8171.field7302;
        } else if (arg0 == 4) {
            var4 = this.field8171.field7342;
            var5 = this.field8171.field7373;
        } else if (arg0 == 5) {
            var5 = this.field8171.field7405;
            var4 = this.field8171.field7399;
        } else {
            var5 = var4 = new class565(this.field8171);
        }
        return this.method3305(arg0 != 0, var4, 8192, arg2, var5, arg1);
    }

    @OriginalMember(owner = "client!ji", name = "za", descriptor = "()I")
    public final int method99() {
        if (!this.field8197) {
            this.method3316(-10110);
        }
        field8252++;
        return this.field8245;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "()V")
    public final void method120() {
        field8268++;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lkga;)V")
    public class565(class506 arg0) {
        this.field8171 = arg0;
        this.field8264 = new class399(null, 5126, 3, 0);
        this.field8258 = new class399(null, 5126, 2, 0);
        this.field8174 = new class399(null, 5126, 3, 0);
        this.field8207 = new class399(null, 5121, 4, 0);
        this.field8244 = new class30();
    }

    @OriginalMember(owner = "client!ji", name = "W", descriptor = "(I)V")
    public final void method91(int arg0) {
        field8235++;
        int var2 = class395.field5579[arg0];
        int var3 = class395.field5582[arg0];
        for (int var4 = 0; var4 < this.field8229; var4++) {
            int var5 = this.field8205[var4] * var2 + (this.field8206[var4] * var3) >> 14;
            this.field8205[var4] = this.field8205[var4] * var3 - (this.field8206[var4] * var2) >> 14;
            this.field8206[var4] = var5;
        }
        if (this.field8264 != null) {
            this.field8264.field5629 = null;
        }
        this.field8197 = false;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lkga;Lkk;IIII)V")
    public class565(class506 arg0, class173 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8240 = arg2;
        this.field8271 = arg5;
        this.field8171 = arg0;
        if (class226.method1378(-905560472, arg5, arg2)) {
            this.field8264 = new class399(null, 5126, 3, 0);
        }
        if (class356.method2007(arg2, 67, arg5)) {
            this.field8258 = new class399(null, 5126, 2, 0);
        }
        if (class287.method1711(arg2, arg5, (byte) 12)) {
            this.field8174 = new class399(null, 5126, 3, 0);
        }
        if (class273.method1635(arg5, arg2, -27037)) {
            this.field8207 = new class399(null, 5121, 4, 0);
        }
        if (class246.method1496((byte) 127, arg2, arg5)) {
            this.field8244 = new class30();
        }
        class212 var7 = arg0.field2023;
        int[] var8 = new int[arg1.field2146];
        this.field8160 = new int[arg1.field2100 + 1];
        for (int var9 = 0; var9 < arg1.field2146; var9++) {
            if ((arg1.field2141 == null || arg1.field2141[var9] != 2) && (arg1.field2129 == null || arg1.field2129[var9] == -1 || !var7.method397(arg1.field2129[var9] & 0xFFFF, (byte) -122).field4711)) {
                var8[this.field8189++] = var9;
                this.field8160[arg1.field2107[var9]]++;
                this.field8160[arg1.field2105[var9]]++;
                this.field8160[arg1.field2154[var9]]++;
            }
        }
        this.field8259 = this.field8189;
        long[] var10 = new long[this.field8189];
        boolean var11 = (this.field8240 & 0x100) != 0;
        label499: for (int var12 = 0; var12 < this.field8189; var12++) {
            int var180 = var8[var12];
            class352 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field2126 != null) {
                for (int var186 = 0; var186 < arg1.field2126.length; var186++) {
                    class190 var187 = arg1.field2126[var186];
                    if (var187.field2316 == var180) {
                        class499 var188 = class479.method2812(var187.field2314, 4);
                        if (var188.field6972) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field8259--;
                            continue label499;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field2129 != null) {
                var189 = arg1.field2129[var180];
                if (var189 != -1) {
                    var181 = var7.method397(var189 & 0xFFFF, (byte) 24);
                    var185 = var181.field4696;
                    var184 = var181.field4707;
                }
            }
            boolean var190 = arg1.field2109 != null && arg1.field2109[var180] != 0 || var181 != null && var181.field4712 | !var181.field4705;
            if ((var11 || var190) && arg1.field2112 != null) {
                var182 += arg1.field2112[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = ((var184 & 0xFF) << 8) + var182;
            int var192 = (var185 & 0xFF) + var191;
            int var193 = (var189 & 0xFFFF << 16) + var183;
            int var194 = (var12 & 0xFFFF) + var193;
            var10[var12] = ((long) var192 << 32) + (long) var194;
            this.field8247 |= var190;
        }
        class646.method3660(var10, (byte) -112, var8);
        this.field8186 = arg1.field2115;
        this.field8173 = arg1.field2123;
        this.field8206 = arg1.field2145;
        this.field8248 = arg1.field2153;
        this.field8229 = arg1.field2100;
        this.field8205 = arg1.field2117;
        this.field8273 = arg1.field2140;
        class586[] var13 = new class586[this.field8229];
        this.field8158 = arg1.field2111;
        if (arg1.field2126 != null) {
            this.field8196 = arg1.field2126.length;
            this.field8180 = new class351[this.field8196];
            this.field8277 = new class25[this.field8196];
            for (int var14 = 0; var14 < this.field8196; var14++) {
                class190 var15 = arg1.field2126[var14];
                class499 var16 = class479.method2812(var15.field2314, 4);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field8189; var18++) {
                    if (var8[var18] == var15.field2316) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class285.field3868[arg1.field2132[var15.field2316] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field2109 == null ? 0 : arg1.field2109[var15.field2316]) << 24;
                this.field8180[var14] = new class351(var17, arg1.field2107[var15.field2316], arg1.field2105[var15.field2316], arg1.field2154[var15.field2316], var16.field6977, var16.field6973, var16.field6971, var16.field6982, var16.field6983, var16.field6972, var16.field6984, var15.field2315);
                this.field8277[var14] = new class25(var20);
            }
        }
        int var21 = this.field8189 * 3;
        this.field8209 = new short[this.field8189];
        class628.field9005 = new long[var21];
        this.field8270 = new short[var21];
        this.field8165 = new short[var21];
        this.field8202 = new float[var21];
        this.field8159 = new short[var21];
        if (arg1.field2106 != null) {
            this.field8274 = new short[this.field8189];
        }
        this.field8217 = new byte[var21];
        this.field8215 = new float[var21];
        this.field8257 = new short[this.field8189];
        this.field8211 = new short[var21];
        this.field8212 = (short) arg4;
        this.field8214 = new short[this.field8189];
        this.field8185 = new byte[this.field8189];
        this.field8161 = new short[this.field8189];
        this.field8254 = (short) arg3;
        this.field8199 = new short[this.field8189];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field2100; var23++) {
            int var179 = this.field8160[var23];
            this.field8160[var23] = var22;
            var22 += var179;
            var13[var23] = new class586();
        }
        this.field8160[arg1.field2100] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field2136 != null) {
            int var28 = arg1.field2148;
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
            for (int var36 = 0; var36 < this.field8189; var36++) {
                int var43 = var8[var36];
                if (arg1.field2136[var43] != -1) {
                    int var44 = arg1.field2136[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field2107[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field2105[var43];
                        } else {
                            var46 = arg1.field2154[var43];
                        }
                        int var47 = arg1.field2145[var46];
                        int var48 = arg1.field2117[var46];
                        int var49 = arg1.field2153[var46];
                        if (var29[var44] > var47) {
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
                        if (var49 < var33[var44]) {
                            var33[var44] = var49;
                        }
                        if (var49 > var34[var44]) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var26 = new int[var28];
            var25 = new int[var28];
            var27 = new float[var28][];
            var24 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field2102[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var39;
                    float var40;
                    float var41;
                    if (var38 == 1) {
                        int var42 = arg1.field2135[var37];
                        if (var42 == 0) {
                            var39 = 1.0F;
                            var41 = 1.0F;
                        } else if (var42 > 0) {
                            var39 = 1.0F;
                            var41 = (float) var42 / 1024.0F;
                        } else {
                            var41 = 1.0F;
                            var39 = (float) (-var42) / 1024.0F;
                        }
                        var40 = 64.0F / (float) arg1.field2122[var37];
                    } else if (var38 == 2) {
                        var39 = 64.0F / (float) arg1.field2135[var37];
                        var41 = 64.0F / (float) arg1.field2121[var37];
                        var40 = 64.0F / (float) arg1.field2122[var37];
                    } else {
                        var39 = (float) arg1.field2135[var37] / 1024.0F;
                        var40 = (float) arg1.field2122[var37] / 1024.0F;
                        var41 = (float) arg1.field2121[var37] / 1024.0F;
                    }
                    var27[var37] = class133.method891(var39, var41, class435.method2605(255, arg1.field2131[var37]), arg1.field2108[var37], var40, 19386, arg1.field2139[var37], arg1.field2116[var37]);
                }
            }
        }
        class422[] var50 = new class422[arg1.field2146];
        for (int var51 = 0; var51 < arg1.field2146; var51++) {
            short var158 = arg1.field2107[var51];
            short var159 = arg1.field2105[var51];
            short var160 = arg1.field2154[var51];
            int var161 = this.field8206[var159] - this.field8206[var158];
            int var162 = this.field8205[var159] - this.field8205[var158];
            int var163 = this.field8248[var159] - this.field8248[var158];
            int var164 = this.field8206[var160] - this.field8206[var158];
            int var165 = this.field8205[var160] - this.field8205[var158];
            int var166 = this.field8248[var160] - this.field8248[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - var161 * var166;
            int var169;
            for (var169 = var161 * var165 - var162 * var164; var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192; var169 >>= 0x1) {
                var168 >>= 0x1;
                var167 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var167 * var167 + var168 * var168 + var169 * var169));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var169 * 256 / var170;
            int var172 = var167 * 256 / var170;
            int var173 = var168 * 256 / var170;
            byte var174 = arg1.field2141 == null ? 0 : arg1.field2141[var51];
            if (var174 == 0) {
                class586 var176 = var13[var158];
                var176.field8504 += var172;
                var176.field8505 += var171;
                var176.field8506++;
                var176.field8502 += var173;
                class586 var177 = var13[var159];
                var177.field8506++;
                var177.field8504 += var172;
                var177.field8505 += var171;
                var177.field8502 += var173;
                class586 var178 = var13[var160];
                var178.field8504 += var172;
                var178.field8505 += var171;
                var178.field8506++;
                var178.field8502 += var173;
            } else if (var174 == 1) {
                class422 var175 = var50[var51] = new class422();
                var175.field6002 = var171;
                var175.field6007 = var172;
                var175.field6008 = var173;
            }
        }
        for (int var52 = 0; var52 < this.field8189; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field2132[var68] & 0xFFFF;
            short var70;
            if (arg1.field2129 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field2129[var68];
            }
            int var71;
            if (arg1.field2136 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field2136[var68];
            }
            int var72;
            if (arg1.field2109 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field2109[var68] & 0xFF;
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
                    var77 = 0.0F;
                    var79 = 1;
                    var75 = 1.0F;
                    var76 = 1.0F;
                    var74 = 1.0F;
                    var73 = 0.0F;
                    var80 = 2;
                    var78 = 0.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field2102[var71];
                    if (var82 == 0) {
                        short var111 = arg1.field2107[var68];
                        short var112 = arg1.field2105[var68];
                        short var113 = arg1.field2154[var68];
                        short var114 = arg1.field2139[var71];
                        short var115 = arg1.field2116[var71];
                        short var116 = arg1.field2108[var71];
                        float var117 = (float) arg1.field2145[var114];
                        float var118 = (float) arg1.field2117[var114];
                        float var119 = (float) arg1.field2153[var114];
                        float var120 = (float) arg1.field2145[var115] - var117;
                        float var121 = (float) arg1.field2117[var115] - var118;
                        float var122 = (float) arg1.field2153[var115] - var119;
                        float var123 = (float) arg1.field2145[var116] - var117;
                        float var124 = (float) arg1.field2117[var116] - var118;
                        float var125 = (float) arg1.field2153[var116] - var119;
                        float var126 = (float) arg1.field2145[var111] - var117;
                        float var127 = (float) arg1.field2117[var111] - var118;
                        float var128 = (float) arg1.field2153[var111] - var119;
                        float var129 = (float) arg1.field2145[var112] - var117;
                        float var130 = (float) arg1.field2117[var112] - var118;
                        float var131 = (float) arg1.field2153[var112] - var119;
                        float var132 = (float) arg1.field2145[var113] - var117;
                        float var133 = (float) arg1.field2117[var113] - var118;
                        float var134 = (float) arg1.field2153[var113] - var119;
                        float var135 = var121 * var125 - (var122 * var124);
                        float var136 = var122 * var123 - (var120 * var125);
                        float var137 = var120 * var124 - var121 * var123;
                        float var138 = var124 * var137 - (var125 * var136);
                        float var139 = var125 * var135 - var123 * var137;
                        float var140 = var123 * var136 - var124 * var135;
                        float var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                        var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                        var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                        var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                        float var142 = var120 * var136 - var121 * var135;
                        float var143 = var121 * var137 - var122 * var136;
                        float var144 = var122 * var135 - (var120 * var137);
                        float var145 = 1.0F / (var125 * var142 + var123 * var143 + var124 * var144);
                        var76 = (var131 * var142 + var129 * var143 + var130 * var144) * var145;
                        var78 = (var134 * var142 + var132 * var143 + var133 * var144) * var145;
                        var74 = (var128 * var142 + var126 * var143 + var127 * var144) * var145;
                    } else {
                        short var83 = arg1.field2107[var68];
                        short var84 = arg1.field2105[var68];
                        short var85 = arg1.field2154[var68];
                        int var86 = var24[var71];
                        int var87 = var25[var71];
                        int var88 = var26[var71];
                        float[] var89 = var27[var71];
                        byte var90 = arg1.field2149[var71];
                        float var91 = (float) arg1.field2103[var71] / 256.0F;
                        if (var82 == 1) {
                            float var109 = (float) arg1.field2121[var71] / 1024.0F;
                            class338.method1947(var109, var89, var87, false, var88, arg1.field2145[var83], var86, arg1.field2117[var83], arg1.field2153[var83], var91, var90);
                            var74 = class286.field3870;
                            var73 = class177.field2181;
                            class338.method1947(var109, var89, var87, false, var88, arg1.field2145[var84], var86, arg1.field2117[var84], arg1.field2153[var84], var91, var90);
                            var76 = class286.field3870;
                            var75 = class177.field2181;
                            class338.method1947(var109, var89, var87, false, var88, arg1.field2145[var85], var86, arg1.field2117[var85], arg1.field2153[var85], var91, var90);
                            var77 = class177.field2181;
                            var78 = class286.field3870;
                            float var110 = var109 / 2.0F;
                            if ((var90 & 0x1) == 0) {
                                if (var77 - var73 > var110) {
                                    var77 -= var109;
                                    var80 = 1;
                                } else if (var110 < var73 - var77) {
                                    var80 = 2;
                                    var77 += var109;
                                }
                                if (var110 < var75 - var73) {
                                    var79 = 1;
                                    var75 -= var109;
                                } else if (var110 < var73 - var75) {
                                    var75 += var109;
                                    var79 = 2;
                                }
                            } else {
                                if ((var110 < var78 - var74)) {
                                    var78 -= var109;
                                    var80 = 1;
                                } else if (var74 - var78 > var110) {
                                    var80 = 2;
                                    var78 += var109;
                                }
                                if (var110 < var76 - var74) {
                                    var76 -= var109;
                                    var79 = 1;
                                } else if (var74 - var76 > var110) {
                                    var79 = 2;
                                    var76 += var109;
                                }
                            }
                        } else if (var82 == 2) {
                            float var92 = (float) arg1.field2120[var71] / 256.0F;
                            float var93 = (float) arg1.field2128[var71] / 256.0F;
                            int var94 = arg1.field2145[var84] - arg1.field2145[var83];
                            int var95 = arg1.field2117[var84] - arg1.field2117[var83];
                            int var96 = arg1.field2153[var84] - arg1.field2153[var83];
                            int var97 = arg1.field2145[var85] - arg1.field2145[var83];
                            int var98 = arg1.field2117[var85] - arg1.field2117[var83];
                            int var99 = arg1.field2153[var85] - arg1.field2153[var83];
                            int var100 = var95 * var99 - (var96 * var98);
                            int var101 = var96 * var97 - (var94 * var99);
                            int var102 = var94 * var98 - (var95 * var97);
                            float var103 = 64.0F / (float) arg1.field2135[var71];
                            float var104 = 64.0F / (float) arg1.field2122[var71];
                            float var105 = 64.0F / (float) arg1.field2121[var71];
                            float var106 = (var89[2] * (float) var102 + var89[1] * (float) var101 + var89[0] * (float) var100) / var103;
                            float var107 = (var89[5] * (float) var102 + var89[4] * (float) var101 + var89[3] * (float) var100) / var104;
                            float var108 = (var89[8] * (float) var102 + var89[6] * (float) var100 + var89[7] * (float) var101) / var105;
                            var81 = class328.method1908(var107, var108, (byte) -128, var106);
                            class489.method2852(arg1.field2117[var83], var91, var87, var81, var90, arg1.field2153[var83], 4, arg1.field2145[var83], var89, var88, var86, var92, var93);
                            var74 = class282.field3846;
                            var73 = class510.field7443;
                            class489.method2852(arg1.field2117[var84], var91, var87, var81, var90, arg1.field2153[var84], 4, arg1.field2145[var84], var89, var88, var86, var92, var93);
                            var76 = class282.field3846;
                            var75 = class510.field7443;
                            class489.method2852(arg1.field2117[var85], var91, var87, var81, var90, arg1.field2153[var85], 4, arg1.field2145[var85], var89, var88, var86, var92, var93);
                            var78 = class282.field3846;
                            var77 = class510.field7443;
                        } else if (var82 == 3) {
                            class586.method3398(var91, -14578, arg1.field2145[var83], var89, arg1.field2117[var83], var87, arg1.field2153[var83], var88, var90, var86);
                            var73 = class616.field8850;
                            var74 = class588.field8522;
                            class586.method3398(var91, -14578, arg1.field2145[var84], var89, arg1.field2117[var84], var87, arg1.field2153[var84], var88, var90, var86);
                            var75 = class616.field8850;
                            var76 = class588.field8522;
                            class586.method3398(var91, -14578, arg1.field2145[var85], var89, arg1.field2117[var85], var87, arg1.field2153[var85], var88, var90, var86);
                            var77 = class616.field8850;
                            var78 = class588.field8522;
                            if ((var90 & 0x1) == 0) {
                                if (var75 - var73 > 0.5F) {
                                    var75--;
                                    var79 = 1;
                                } else if (var73 - var75 > 0.5F) {
                                    var75++;
                                    var79 = 2;
                                }
                                if ((var77 - var73 > 0.5F)) {
                                    var80 = 1;
                                    var77--;
                                } else if (var73 - var77 > 0.5F) {
                                    var77++;
                                    var80 = 2;
                                }
                            } else {
                                if (var76 - var74 > 0.5F) {
                                    var76--;
                                    var79 = 1;
                                } else if (var74 - var76 > 0.5F) {
                                    var76++;
                                    var79 = 2;
                                }
                                if (var78 - var74 > 0.5F) {
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
            if (arg1.field2141 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field2141[var68];
            }
            if (var146 == 0) {
                long var147 = (long) (var71 << 2) + ((long) (var81 << 24) + ((long) var72) + (long) (var69 << 8) << 32);
                short var149 = arg1.field2107[var68];
                short var150 = arg1.field2105[var68];
                short var151 = arg1.field2154[var68];
                class586 var152 = var13[var149];
                this.field8209[var52] = this.method3303(var147, var152.field8505, var74, arg1, var152.field8502, var152.field8506, var73, 71, var149, var152.field8504);
                class586 var153 = var13[var150];
                this.field8161[var52] = this.method3303((long) var79 + var147, var153.field8505, var76, arg1, var153.field8502, var153.field8506, var75, 58, var150, var153.field8504);
                class586 var154 = var13[var151];
                this.field8214[var52] = this.method3303((long) var80 + var147, var154.field8505, var78, arg1, var154.field8502, var154.field8506, var77, 102, var151, var154.field8504);
            } else if (var146 == 1) {
                class422 var155 = var50[var68];
                long var156 = (long) ((var155.field6008 + 256 << 12) + (var71 << 2) + (var155.field6007 <= 0 ? 2048 : 1024) + (var155.field6002 + 256 << 22)) + ((long) (var69 << 8) + (long) var72 + (long) (var81 << 24) << 32);
                this.field8209[var52] = this.method3303(var156, var155.field6002, var74, arg1, var155.field6008, 0, var73, 78, arg1.field2107[var68], var155.field6007);
                this.field8161[var52] = this.method3303((long) var79 + var156, var155.field6002, var76, arg1, var155.field6008, 0, var75, 125, arg1.field2105[var68], var155.field6007);
                this.field8214[var52] = this.method3303((long) var80 + var156, var155.field6002, var78, arg1, var155.field6008, 0, var77, 118, arg1.field2154[var68], var155.field6007);
            }
            if (arg1.field2129 == null) {
                this.field8257[var52] = -1;
            } else {
                this.field8257[var52] = arg1.field2129[var68];
            }
            if (arg1.field2109 != null) {
                this.field8185[var52] = arg1.field2109[var68];
            }
            if (arg1.field2106 != null) {
                this.field8274[var52] = arg1.field2106[var68];
            }
            this.field8199[var52] = arg1.field2132[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field8259; var55++) {
            short var67 = this.field8257[var55];
            if (var54 != var67) {
                var53++;
                var54 = var67;
            }
        }
        this.field8194 = new int[var53 + 1];
        int var56 = 0;
        short var57 = -10000;
        for (int var58 = 0; var58 < this.field8259; var58++) {
            short var66 = this.field8257[var58];
            if (var57 != var66) {
                this.field8194[var56++] = var58;
                var57 = var66;
            }
        }
        this.field8194[var56] = this.field8259;
        class628.field9005 = null;
        this.field8270 = class503.method2915(this.field8272, false, this.field8270);
        this.field8165 = class503.method2915(this.field8272, false, this.field8165);
        this.field8159 = class503.method2915(this.field8272, false, this.field8159);
        this.field8217 = class431.method2589(0, this.field8272, this.field8217);
        this.field8215 = class344.method1974(this.field8215, this.field8272, 2364);
        this.field8202 = class344.method1974(this.field8202, this.field8272, 2364);
        if (arg1.field2110 != null && class438.method2618(this.field8271, arg2, -94)) {
            this.field8223 = arg1.method1091(false, (byte) -1);
        }
        if (arg1.field2126 != null && class373.method2175(1024, arg2, this.field8271)) {
            this.field8163 = arg1.method1086(32074);
        }
        if (arg1.field2101 != null && class430.method2588(-114, this.field8271, arg2)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field8189; var61++) {
                int var65 = arg1.field2101[var8[var61]];
                if (var65 >= 0) {
                    int var10002 = var60[var65]++;
                    if (var65 > var59) {
                        var59 = var65;
                    }
                }
            }
            this.field8208 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field8208[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field8189; var63++) {
                int var64 = arg1.field2101[var8[var63]];
                if (var64 >= 0) {
                    this.field8208[var64][var60[var64]++] = var63;
                }
            }
        }
    }
}
