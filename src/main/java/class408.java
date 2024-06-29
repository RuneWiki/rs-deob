import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class408 extends class107 {

    @OriginalMember(owner = "client!mf", name = "ab", descriptor = "Z")
    private boolean field5225 = true;

    @OriginalMember(owner = "client!mf", name = "X", descriptor = "I")
    private int field5222 = 0;

    @OriginalMember(owner = "client!mf", name = "Rb", descriptor = "Z")
    private boolean field5268 = false;

    @OriginalMember(owner = "client!mf", name = "Vb", descriptor = "I")
    private int field5272 = 0;

    @OriginalMember(owner = "client!mf", name = "hb", descriptor = "I")
    private int field5232 = 0;

    @OriginalMember(owner = "client!mf", name = "Gb", descriptor = "I")
    private int field5257 = 0;

    @OriginalMember(owner = "client!mf", name = "kc", descriptor = "I")
    private int field5287 = 0;

    @OriginalMember(owner = "client!mf", name = "xb", descriptor = "Lji;")
    private class622 field5248;

    @OriginalMember(owner = "client!mf", name = "qb", descriptor = "Lvv;")
    private class414 field5241;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "Lvv;")
    private class414 field5191;

    @OriginalMember(owner = "client!mf", name = "hc", descriptor = "Lvv;")
    private class414 field5284;

    @OriginalMember(owner = "client!mf", name = "mc", descriptor = "Lvv;")
    private class414 field5289;

    @OriginalMember(owner = "client!mf", name = "Ab", descriptor = "Lnca;")
    private class557 field5251;

    @OriginalMember(owner = "client!mf", name = "gc", descriptor = "I")
    private int field5283;

    @OriginalMember(owner = "client!mf", name = "Fb", descriptor = "I")
    private int field5256;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "[I")
    private int[] field5192;

    @OriginalMember(owner = "client!mf", name = "kb", descriptor = "[I")
    private int[] field5235;

    @OriginalMember(owner = "client!mf", name = "K", descriptor = "[I")
    private int[] field5209;

    @OriginalMember(owner = "client!mf", name = "A", descriptor = "[S")
    private short[] field5199;

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "[I")
    private int[] field5198;

    @OriginalMember(owner = "client!mf", name = "uc", descriptor = "[Lrea;")
    private class32[] field5297;

    @OriginalMember(owner = "client!mf", name = "Z", descriptor = "[Lgi;")
    private class574[] field5224;

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "I")
    private int field5195;

    @OriginalMember(owner = "client!mf", name = "S", descriptor = "[Lo;")
    private class183[] field5217;

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "[Lqda;")
    private class693[] field5204;

    @OriginalMember(owner = "client!mf", name = "Pb", descriptor = "S")
    private short field5266;

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "[F")
    private float[] field5203;

    @OriginalMember(owner = "client!mf", name = "vc", descriptor = "[S")
    private short[] field5298;

    @OriginalMember(owner = "client!mf", name = "V", descriptor = "[S")
    private short[] field5220;

    @OriginalMember(owner = "client!mf", name = "R", descriptor = "[S")
    private short[] field5216;

    @OriginalMember(owner = "client!mf", name = "B", descriptor = "[S")
    private short[] field5200;

    @OriginalMember(owner = "client!mf", name = "Yb", descriptor = "[B")
    private byte[] field5275;

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "[B")
    private byte[] field5194;

    @OriginalMember(owner = "client!mf", name = "mb", descriptor = "S")
    private short field5237;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "[S")
    private short[] field5189;

    @OriginalMember(owner = "client!mf", name = "tc", descriptor = "[S")
    private short[] field5296;

    @OriginalMember(owner = "client!mf", name = "Xb", descriptor = "[S")
    private short[] field5274;

    @OriginalMember(owner = "client!mf", name = "ec", descriptor = "[S")
    private short[] field5281;

    @OriginalMember(owner = "client!mf", name = "wb", descriptor = "[F")
    private float[] field5247;

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "[S")
    private short[] field5207;

    @OriginalMember(owner = "client!mf", name = "eb", descriptor = "[S")
    private short[] field5229;

    @OriginalMember(owner = "client!mf", name = "C", descriptor = "[I")
    private int[] field5201;

    @OriginalMember(owner = "client!mf", name = "Cb", descriptor = "[[I")
    private int[][] field5253;

    @OriginalMember(owner = "client!mf", name = "cb", descriptor = "[[I")
    private int[][] field5227;

    @OriginalMember(owner = "client!mf", name = "tb", descriptor = "[[I")
    private int[][] field5244;

    @OriginalMember(owner = "client!mf", name = "lb", descriptor = "[Ljava/lang/String;")
    public static String[] field5236 = new String[100];

    @OriginalMember(owner = "client!mf", name = "D", descriptor = "B")
    private byte field5202;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public static int field5188;

    @OriginalMember(owner = "client!mf", name = "x", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!mf", name = "y", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!mf", name = "J", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!mf", name = "L", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!mf", name = "M", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!mf", name = "O", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!mf", name = "Q", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!mf", name = "T", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!mf", name = "W", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!mf", name = "Y", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!mf", name = "bb", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!mf", name = "db", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!mf", name = "gb", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!mf", name = "ib", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!mf", name = "jb", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!mf", name = "nb", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!mf", name = "ob", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!mf", name = "pb", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!mf", name = "rb", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!mf", name = "sb", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!mf", name = "ub", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!mf", name = "zb", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!mf", name = "Bb", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!mf", name = "Db", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!mf", name = "Eb", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!mf", name = "Ib", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!mf", name = "Kb", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!mf", name = "Lb", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!mf", name = "Mb", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!mf", name = "Nb", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!mf", name = "Ob", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!mf", name = "Qb", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!mf", name = "Sb", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!mf", name = "Tb", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!mf", name = "Ub", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!mf", name = "Wb", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!mf", name = "Zb", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!mf", name = "ac", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!mf", name = "bc", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!mf", name = "cc", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!mf", name = "dc", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!mf", name = "fc", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!mf", name = "ic", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!mf", name = "lc", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!mf", name = "nc", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!mf", name = "oc", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!mf", name = "pc", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!mf", name = "qc", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!mf", name = "rc", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!mf", name = "sc", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!mf", name = "wc", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!mf", name = "Jb", descriptor = "Lro;")
    private class258 field5260;

    @OriginalMember(owner = "client!mf", name = "P", descriptor = "Lsj;")
    private class373 field5214;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "Lul;")
    private class439 field5193;

    @OriginalMember(owner = "client!mf", name = "jc", descriptor = "Loa;")
    public static class43 field5286;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "S")
    private short field5190;

    @OriginalMember(owner = "client!mf", name = "N", descriptor = "S")
    private short field5212;

    @OriginalMember(owner = "client!mf", name = "U", descriptor = "S")
    private short field5219;

    @OriginalMember(owner = "client!mf", name = "fb", descriptor = "S")
    private short field5230;

    @OriginalMember(owner = "client!mf", name = "vb", descriptor = "S")
    private short field5246;

    @OriginalMember(owner = "client!mf", name = "yb", descriptor = "S")
    private short field5249;

    @OriginalMember(owner = "client!mf", name = "Hb", descriptor = "S")
    private short field5258;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "()Z", line = 6)
    public final boolean method794() {
        field5221++;
        if (this.field5189 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field5189.length; var1++) {
            if (this.field5189[var1] != -1 && !this.field5248.field598.method3164((byte) -31, this.field5189[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V", line = 30)
    public static final void method2310(int arg0, int arg1) {
        field5238++;
        class710.field9930 = arg0;
        if (arg1 > 113) {
            class152.field1941.method3656((byte) 0);
        }
    }

    @OriginalMember(owner = "client!mf", name = "ia", descriptor = "(I)V", line = 49)
    public final void method825(int arg0) {
        field5299++;
        this.field5283 = arg0;
        if (this.field5260 != null && (this.field5283 & 0x10000) == 0) {
            this.field5281 = this.field5260.field3479;
            this.field5274 = this.field5260.field3478;
            this.field5194 = this.field5260.field3477;
            this.field5296 = this.field5260.field3481;
            this.field5260 = null;
        }
        this.field5225 = true;
        this.method2317(-1);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILbf;)V", line = 75)
    private final void method2311(int arg0, class680 arg1) {
        field5292++;
        if (this.field5287 > this.field5248.field8718.length) {
            this.field5248.field8718 = new int[this.field5287];
            this.field5248.field8717 = new int[this.field5287];
        }
        int[] var3 = this.field5248.field8718;
        int[] var4 = this.field5248.field8717;
        for (int var5 = 0; var5 < this.field5232; var5++) {
            int var16 = (this.field5198[var5] - (this.field5209[var5] * this.field5248.field8596 >> 8) >> this.field5248.field8571) - arg1.field9374;
            int var17 = (this.field5235[var5] - (this.field5209[var5] * this.field5248.field8648 >> 8) >> this.field5248.field8571) - arg1.field9370;
            int var18 = this.field5192[var5];
            int var19 = this.field5192[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field5207[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        if (arg0 < 56) {
            this.field5194 = null;
        }
        for (int var6 = 0; var6 < this.field5257; var6++) {
            if (this.field5275 == null || this.field5275[var6] <= 128) {
                short var7 = this.field5298[var6];
                short var8 = this.field5200[var6];
                short var9 = this.field5216[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var10 - var11) * (var14 - var15) - ((var12 - var11) * (var14 - var13)) > 0) {
                    arg1.method3740(var13, 781914992, var12, var11, var14, var15, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "(I[IIIIIZ)V", line = 161)
    public final void method828(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field5259++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            int var12 = 0;
            class150.field1928 = 0;
            class562.field7335 = 0;
            class39.field552 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field5253.length) {
                    int[] var15 = this.field5253[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class150.field1928 += this.field5198[var17];
                        class39.field552 += this.field5209[var17];
                        var12++;
                        class562.field7335 += this.field5235[var17];
                    }
                }
            }
            if (var12 > 0) {
                class150.field1928 = class150.field1928 / var12 + var9;
                class39.field552 = class39.field552 / var12 + var11;
                class562.field7335 = class562.field7335 / var12 + var10;
            } else {
                class562.field7335 = var10;
                class39.field552 = var11;
                class150.field1928 = var9;
            }
        } else if (arg0 == 1) {
            int var18 = arg4 << 4;
            int var19 = arg3 << 4;
            int var20 = arg2 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field5253.length > var22) {
                    int[] var23 = this.field5253[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field5198[var25] += var20;
                        this.field5209[var25] += var19;
                        this.field5235[var25] += var18;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field5253.length > var45) {
                    int[] var46 = this.field5253[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field5198[var59] -= class150.field1928;
                            this.field5209[var59] -= class39.field552;
                            this.field5235[var59] -= class562.field7335;
                            if (arg4 != 0) {
                                int var60 = class237.field3193[arg4];
                                int var61 = class237.field3196[arg4];
                                int var62 = this.field5198[var59] * var61 + (this.field5209[var59] * var60 + 16383) >> 14;
                                this.field5209[var59] = this.field5209[var59] * var61 + 16383 - (this.field5198[var59] * var60) >> 14;
                                this.field5198[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class237.field3193[arg2];
                                int var64 = class237.field3196[arg2];
                                int var65 = this.field5209[var59] * var64 + 16383 - (this.field5235[var59] * var63) >> 14;
                                this.field5235[var59] = this.field5235[var59] * var64 + this.field5209[var59] * var63 + 16383 >> 14;
                                this.field5209[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class237.field3193[arg3];
                                int var67 = class237.field3196[arg3];
                                int var68 = this.field5235[var59] * var66 + (this.field5198[var59] * var67) + 16383 >> 14;
                                this.field5235[var59] = this.field5235[var59] * var67 + 16383 - (this.field5198[var59] * var66) >> 14;
                                this.field5198[var59] = var68;
                            }
                            this.field5198[var59] += class150.field1928;
                            this.field5209[var59] += class39.field552;
                            this.field5235[var59] += class562.field7335;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field5198[var48] -= class150.field1928;
                            this.field5209[var48] -= class39.field552;
                            this.field5235[var48] -= class562.field7335;
                            if (arg2 != 0) {
                                int var49 = class237.field3193[arg2];
                                int var50 = class237.field3196[arg2];
                                int var51 = this.field5209[var48] * var50 + 16383 - (this.field5235[var48] * var49) >> 14;
                                this.field5235[var48] = this.field5235[var48] * var50 + this.field5209[var48] * var49 + 16383 >> 14;
                                this.field5209[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class237.field3193[arg4];
                                int var53 = class237.field3196[arg4];
                                int var54 = this.field5209[var48] * var52 + this.field5198[var48] * var53 + 16383 >> 14;
                                this.field5209[var48] = this.field5209[var48] * var53 + 16383 - (this.field5198[var48] * var52) >> 14;
                                this.field5198[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class237.field3193[arg3];
                                int var56 = class237.field3196[arg3];
                                int var57 = this.field5235[var48] * var55 + (this.field5198[var48] * var56) + 16383 >> 14;
                                this.field5235[var48] = this.field5235[var48] * var56 + 16383 - (this.field5198[var48] * var55) >> 14;
                                this.field5198[var48] = var57;
                            }
                            this.field5198[var48] += class150.field1928;
                            this.field5209[var48] += class39.field552;
                            this.field5235[var48] += class562.field7335;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field5253.length) {
                        int[] var29 = this.field5253[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field5192[var31];
                            int var33 = this.field5192[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field5207[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class237.field3193[arg4];
                                    int var37 = class237.field3196[arg4];
                                    int var38 = this.field5296[var35] * var36 + this.field5274[var35] * var37 + 16383 >> 14;
                                    this.field5296[var35] = (short) (this.field5296[var35] * var37 + 16383 - (this.field5274[var35] * var36) >> 14);
                                    this.field5274[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class237.field3193[arg2];
                                    int var40 = class237.field3196[arg2];
                                    int var41 = this.field5296[var35] * var40 + 16383 - (this.field5281[var35] * var39) >> 14;
                                    this.field5281[var35] = (short) (this.field5281[var35] * var40 + (this.field5296[var35] * var39 + 16383) >> 14);
                                    this.field5296[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class237.field3193[arg3];
                                    int var43 = class237.field3196[arg3];
                                    int var44 = this.field5274[var35] * var43 + this.field5281[var35] * var42 + 16383 >> 14;
                                    this.field5281[var35] = (short) (this.field5281[var35] * var43 + 16383 - (this.field5274[var35] * var42) >> 14);
                                    this.field5274[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field5284 == null && this.field5289 != null) {
                    this.field5289.field5324 = null;
                }
                if (this.field5284 != null) {
                    this.field5284.field5324 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field5253.length) {
                    int[] var71 = this.field5253[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field5198[var73] -= class150.field1928;
                        this.field5209[var73] -= class39.field552;
                        this.field5235[var73] -= class562.field7335;
                        this.field5198[var73] = this.field5198[var73] * arg2 >> 7;
                        this.field5209[var73] = this.field5209[var73] * arg3 >> 7;
                        this.field5235[var73] = this.field5235[var73] * arg4 >> 7;
                        this.field5198[var73] += class150.field1928;
                        this.field5209[var73] += class39.field552;
                        this.field5235[var73] += class562.field7335;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field5244 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (var78 < this.field5244.length) {
                        int[] var79 = this.field5244[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field5275[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field5275[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field5289 != null) {
                            this.field5289.field5324 = null;
                        }
                    }
                }
                if (this.field5204 != null) {
                    for (int var75 = 0; var75 < this.field5195; var75++) {
                        class693 var76 = this.field5204[var75];
                        class183 var77 = this.field5217[var75];
                        var77.field2351 = 255 - (this.field5275[var76.field9477] & 0xFF) << 24 | var77.field2351 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field5244 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field5244.length > var87) {
                        int[] var88 = this.field5244[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field5220[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFC13) >> 10;
                            int var93 = (var91 & 0x3BD) >> 7;
                            int var94 = var92 + arg2 & 0x3F;
                            int var95 = var91 & 0x7F;
                            int var96 = arg3 / 4 + var93;
                            int var97 = arg4 + var95;
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
                            this.field5220[var90] = (short) class131.method954(var97, class131.method954(var96 << 7, var94 << 10));
                        }
                        if (var88.length > 0 && this.field5289 != null) {
                            this.field5289.field5324 = null;
                        }
                    }
                }
                if (this.field5204 != null) {
                    for (int var84 = 0; var84 < this.field5195; var84++) {
                        class693 var85 = this.field5204[var84];
                        class183 var86 = this.field5217[var84];
                        var86.field2351 = class505.field6642[this.field5220[var85.field9477] & 0xFFFF] & 0xFFFFFF | var86.field2351 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field5227 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field5227.length > var99) {
                        int[] var100 = this.field5227[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class183 var102 = this.field5217[var100[var101]];
                            var102.field2349 += arg2;
                            var102.field2348 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field5227 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field5227.length) {
                        int[] var105 = this.field5227[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class183 var107 = this.field5217[var105[var106]];
                            var107.field2356 = var107.field2356 * arg3 >> 7;
                            var107.field2344 = var107.field2344 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field5227 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field5227.length) {
                    int[] var110 = this.field5227[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class183 var112 = this.field5217[var110[var111]];
                        var112.field2343 = var112.field2343 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIII)V", line = 818)
    public final void method835(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field5222; var5++) {
            int var9 = this.field5220[var5] & 0xFFFF;
            int var10 = (var9 & 0xFFC6) >> 10;
            int var11 = (var9 & 0x3CE) >> 7;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field5220[var5] = (short) class131.method954(class131.method954(var11 << 7, var10 << 10), var12);
        }
        field5223++;
        if (this.field5204 != null) {
            for (int var6 = 0; var6 < this.field5195; var6++) {
                class693 var7 = this.field5204[var6];
                class183 var8 = this.field5217[var6];
                var8.field2351 = var8.field2351 & 0xFF000000 | class505.field6642[this.field5220[var7.field9477] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field5289 != null) {
            this.field5289.field5324 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V", line = 874)
    private final void method2312(byte arg0) {
        if (arg0 != 24) {
            return;
        }
        if (this.field5204 != null) {
            class25 var2 = this.field5248.field8565;
            float var3 = this.field5248.method3406();
            float var4 = this.field5248.method3467();
            this.field5248.method3448(arg0 + 40);
            this.field5248.method391(false);
            this.field5248.method3425(false, 120);
            this.field5248.method3420(null, this.field5248.field8621, true, null, this.field5248.field8677);
            for (int var5 = 0; var5 < this.field5195; var5++) {
                class693 var6 = this.field5204[var5];
                class183 var7 = this.field5217[var5];
                if (!var6.field9480 || !this.field5248.method211()) {
                    float var8 = (float) (this.field5198[var6.field9482] + this.field5198[var6.field9472] + this.field5198[var6.field9481]) * 0.3333333F;
                    float var9 = (float) (this.field5209[var6.field9482] + this.field5209[var6.field9472] + this.field5209[var6.field9481]) * 0.3333333F;
                    float var10 = (float) (this.field5235[var6.field9482] - (-this.field5235[var6.field9472] - this.field5235[var6.field9481])) * 0.3333333F;
                    float var11 = class190.field2434 * var10 + class631.field8801 * var9 + class353.field4537 * var8 + class646.field9007;
                    float var12 = class15.field177 * var10 + class44.field617 * var8 + class40.field573 * var9 + class289.field3731;
                    float var13 = class296.field3884 * var10 + class559.field7298 * var8 + class30.field450 * var9 + class166.field2086;
                    var2.method141(-var13, var7.field2343, (byte) 59, var6.field9476 * var7.field2356 >> 7, (float) var7.field2348 - var12, (float) var7.field2349 + var11, var6.field9479 * var7.field2344 >> 7);
                    this.field5248.method3432(0, var2);
                    this.field5248.method371(var4, var3 - ((float) var6.field9474 * 1.5F));
                    int var14 = var7.field2351;
                    OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                    this.field5248.method3459((byte) -119, var6.field9468);
                    this.field5248.method3403(var6.field9469, -3);
                    this.field5248.method3461(4, 7, (byte) 110, 0);
                }
            }
            this.field5248.method371(var4, var3);
            this.field5248.method391(true);
            this.field5248.method3391(true);
        }
        field5263++;
    }

    @OriginalMember(owner = "client!mf", name = "ZA", descriptor = "()I", line = 939)
    public final int method813() {
        if (!this.field5268) {
            this.method2320(32076);
        }
        field5213++;
        return this.field5190;
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "()[Lgi;", line = 952)
    public final class574[] method808() {
        field5264++;
        return this.field5224;
    }

    @OriginalMember(owner = "client!mf", name = "EA", descriptor = "()I", line = 961)
    public final int method793() {
        field5208++;
        if (!this.field5268) {
            this.method2320(32076);
        }
        return this.field5230;
    }

    @OriginalMember(owner = "client!mf", name = "OA", descriptor = "(IILd;Ld;III)V", line = 972)
    public final void method833(int arg0, int arg1, class88 arg2, class88 arg3, int arg4, int arg5, int arg6) {
        if (!this.field5268) {
            this.method2320(32076);
        }
        field5270++;
        int var8 = this.field5249 + arg4;
        int var9 = this.field5219 + arg4;
        int var10 = this.field5246 + arg6;
        int var11 = this.field5212 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || (arg2.field1163 + var9 >> arg2.field1168) >= arg2.field1166 || var10 < 0 || arg2.field1163 + var11 >> arg2.field1168 >= arg2.field1164) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field1166 <= arg3.field1163 + var9 >> arg3.field1168 || var10 < 0 || (arg3.field1163 + var11 >> arg3.field1168) >= arg3.field1164) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field1168;
            int var13 = var9 + arg2.field1163 - 1 >> arg2.field1168;
            int var14 = var10 >> arg2.field1168;
            int var15 = -(-arg2.field1163 - var11) - 1 >> arg2.field1168;
            if (arg2.method668(var12, var14) == arg5 && arg2.method668(var13, var14) == arg5 && arg2.method668(var12, var15) == arg5 && arg5 == arg2.method668(var13, var15)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field5232; var16++) {
                this.field5209[var16] += arg2.method669(this.field5198[var16] + arg4, this.field5235[var16] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var30 = this.field5258;
            if (var30 == 0) {
                return;
            }
            for (int var31 = 0; var31 < this.field5232; var31++) {
                int var32 = (this.field5209[var31] << 16) / var30;
                if (var32 < arg1) {
                    this.field5209[var31] += (arg1 - var32) * (arg2.method669(this.field5198[var31] + arg4, this.field5235[var31] + arg6) - arg5) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var26 = (arg1 & 0xFF) * 4;
            int var27 = ((arg1 & 0xFFC8) >> 8) * 4;
            int var28 = arg1 >> 16 & 0xFF << 6;
            int var29 = arg1 >> 24 & 0xFF << 6;
            if ((arg4 - (var26 >> 1)) < 0 || (arg2.field1166 << arg2.field1168) <= (arg4 + (var26 >> 1) + arg2.field1163) || arg6 - (var27 >> 1) < 0 || arg6 + (var27 >> 1) + arg2.field1163 >= arg2.field1164 << arg2.field1168) {
                return;
            }
            this.method811(-19948, arg4, var28, var29, var26, var27, arg6, arg2, arg5);
        } else if (arg0 == 4) {
            int var24 = this.field5230 - this.field5258;
            for (int var25 = 0; var25 < this.field5232; var25++) {
                this.field5209[var25] = this.field5209[var25] + arg3.method669(this.field5198[var25] + arg4, this.field5235[var25] - -arg6) + var24 - arg5;
            }
        } else if (arg0 == 5) {
            int var17 = this.field5230 - this.field5258;
            for (int var18 = 0; var18 < this.field5232; var18++) {
                int var19 = this.field5198[var18] + arg4;
                int var20 = this.field5235[var18] + arg6;
                int var21 = arg2.method669(var19, var20);
                int var22 = arg3.method669(var19, var20);
                int var23 = var21 - var22 - arg1;
                this.field5209[var18] = ((this.field5209[var18] << 8) / var17 * var23 >> 8) + var21 - arg5;
            }
        }
        this.field5268 = false;
        if (this.field5241 != null) {
            this.field5241.field5324 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "P", descriptor = "()V", line = 1127)
    public final void method797() {
        field5240++;
        for (int var1 = 0; var1 < this.field5232; var1++) {
            this.field5235[var1] = -this.field5235[var1];
        }
        for (int var2 = 0; var2 < this.field5287; var2++) {
            this.field5281[var2] = (short) (-this.field5281[var2]);
        }
        for (int var3 = 0; var3 < this.field5222; var3++) {
            short var4 = this.field5298[var3];
            this.field5298[var3] = this.field5216[var3];
            this.field5216[var3] = var4;
        }
        if (this.field5284 == null && this.field5289 != null) {
            this.field5289.field5324 = null;
        }
        if (this.field5284 != null) {
            this.field5284.field5324 = null;
        }
        if (this.field5241 != null) {
            this.field5241.field5324 = null;
        }
        if (this.field5251 != null) {
            this.field5251.field7281 = null;
        }
        this.field5268 = false;
    }

    @OriginalMember(owner = "client!mf", name = "ha", descriptor = "()I", line = 1189)
    public final int method820() {
        if (!this.field5268) {
            this.method2320(32076);
        }
        field5218++;
        return this.field5249;
    }

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "(III)V", line = 1203)
    public final void method804(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field5232; var4++) {
            if (arg0 != 0) {
                this.field5198[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field5209[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field5235[var4] += arg2;
            }
        }
        field5261++;
        this.field5268 = false;
        if (this.field5241 != null) {
            this.field5241.field5324 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "LA", descriptor = "()I", line = 1236)
    public final int method805() {
        field5196++;
        if (!this.field5268) {
            this.method2320(32076);
        }
        return this.field5246;
    }

    @OriginalMember(owner = "client!mf", name = "M", descriptor = "()I", line = 1247)
    public final int method799() {
        if (!this.field5268) {
            this.method2320(32076);
        }
        field5205++;
        return this.field5219;
    }

    @OriginalMember(owner = "client!mf", name = "Y", descriptor = "()V", line = 1258)
    public final void method788() {
        for (int var1 = 0; var1 < this.field5272; var1++) {
            this.field5198[var1] = this.field5198[var1] + 7 >> 4;
            this.field5209[var1] = this.field5209[var1] + 7 >> 4;
            this.field5235[var1] = this.field5235[var1] + 7 >> 4;
        }
        field5267++;
        if (this.field5241 != null) {
            this.field5241.field5324 = null;
        }
        this.field5268 = false;
    }

    @OriginalMember(owner = "client!mf", name = "Z", descriptor = "(Lw;)Lw;", line = 1281)
    public final class605 method821(class605 arg0) {
        field5269++;
        if (this.field5287 == 0) {
            return null;
        }
        if (!this.field5268) {
            this.method2320(32076);
        }
        int var2;
        int var3;
        if (this.field5248.field8596 > 0) {
            var2 = this.field5249 - (this.field5248.field8596 * this.field5230 >> 8) >> this.field5248.field8571;
            var3 = this.field5219 - (this.field5248.field8596 * this.field5258 >> 8) >> this.field5248.field8571;
        } else {
            var2 = this.field5249 - (this.field5248.field8596 * this.field5258 >> 8) >> this.field5248.field8571;
            var3 = this.field5219 - (this.field5248.field8596 * this.field5230 >> 8) >> this.field5248.field8571;
        }
        int var4;
        int var5;
        if (this.field5248.field8648 > 0) {
            var4 = this.field5246 - (this.field5248.field8648 * this.field5230 >> 8) >> this.field5248.field8571;
            var5 = this.field5212 - (this.field5248.field8648 * this.field5258 >> 8) >> this.field5248.field8571;
        } else {
            var4 = this.field5246 - (this.field5248.field8648 * this.field5258 >> 8) >> this.field5248.field8571;
            var5 = this.field5212 - (this.field5248.field8648 * this.field5230 >> 8) >> this.field5248.field8571;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class680 var8 = (class680) arg0;
        class680 var9;
        if (var8 != null && var8.method3737(var7, var6, (byte) -111)) {
            var9 = var8;
            var8.method3741((byte) -70);
        } else {
            var9 = new class680(this.field5248, var6, var7);
        }
        var9.method3738(var2, 0, var4, var3, var5);
        this.method2311(101, var9);
        return var9;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(SIIBI)I", line = 1346)
    private final int method2313(short arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg2 >= -14) {
            return 52;
        }
        field5273++;
        int var6 = class505.field6642[class333.method1920(arg1, 24618, arg4)];
        if (arg0 != -1) {
            class59 var7 = this.field5248.field598.method3162((byte) -104, arg0 & 0xFFFF);
            int var8 = var7.field798 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg4 < 0) {
                    var9 = 0;
                } else if (arg4 <= 127) {
                    var9 = arg4 * 131586;
                } else {
                    var9 = 16777215;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var9 & 0xFF00) * var8 + ((var6 & 0xFF00) * var11) & 0xFF0000) + ((var9 & 0xFF00FF) * var8 + ((var6 & 0xFF00FF) * var11) & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field811 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = ((var6 & 0xFF0000) >> 16) * var12;
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
                var6 = (var15 >> 8) + (var13 << 8 & 0xFF0004) + (var14 & 0xFF00);
            }
        }
        return (var6 << 8) + (255 - (arg3 & 0xFF));
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(FIBIIIIJLfca;F)S", line = 1423)
    private final short method2314(float arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, long arg7, class645 arg8, float arg9) {
        field5271++;
        int var12 = this.field5192[arg3];
        int var13 = this.field5192[arg3 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field5207[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class310.field4027[var15] == arg7) {
                return (short) (var16 - 1);
            }
        }
        this.field5207[var14] = (short) (this.field5287 + 1);
        class310.field4027[var14] = arg7;
        int var17 = -73 / ((-arg2 - 32) / 38);
        this.field5274[this.field5287] = (short) arg5;
        this.field5296[this.field5287] = (short) arg6;
        this.field5281[this.field5287] = (short) arg4;
        this.field5194[this.field5287] = (byte) arg1;
        this.field5247[this.field5287] = arg0;
        this.field5203[this.field5287] = arg9;
        return (short) (this.field5287++);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZII)B", line = 1467)
    public static final byte method2315(boolean arg0, int arg1, int arg2) {
        field5294++;
        if (arg2 != 9) {
            return 0;
        } else if (arg0) {
            return -26;
        } else {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        }
    }

    @OriginalMember(owner = "client!mf", name = "AA", descriptor = "(I)V", line = 1486)
    public final void method800(int arg0) {
        field5211++;
        int var2 = class237.field3193[arg0];
        int var3 = class237.field3196[arg0];
        for (int var4 = 0; var4 < this.field5232; var4++) {
            int var5 = this.field5209[var4] * var3 - (this.field5235[var4] * var2) >> 14;
            this.field5235[var4] = this.field5235[var4] * var3 + this.field5209[var4] * var2 >> 14;
            this.field5209[var4] = var5;
        }
        if (this.field5241 != null) {
            this.field5241.field5324 = null;
        }
        this.field5268 = false;
    }

    @OriginalMember(owner = "client!mf", name = "K", descriptor = "()I", line = 1516)
    public final int method810() {
        if (!this.field5268) {
            this.method2320(32076);
        }
        field5242++;
        return this.field5212;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZB)V", line = 1528)
    private final void method2316(boolean arg0, byte arg1) {
        field5197++;
        boolean var3 = this.field5289 != null && this.field5289.field5324 == null;
        boolean var4 = this.field5284 != null && this.field5284.field5324 == null;
        boolean var5 = this.field5241 != null && this.field5241.field5324 == null;
        boolean var6 = this.field5191 != null && this.field5191.field5324 == null;
        if (arg0) {
            var3 &= (this.field5202 & 0x2) != 0;
            var5 &= (this.field5202 & 0x1) != 0;
            var4 &= (this.field5202 & 0x4) != 0;
            var6 &= (this.field5202 & 0x8) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        byte var10 = 0;
        byte var11 = 0;
        if (var5) {
            var8 = var7;
            var7 = (byte) (var7 + 12);
        }
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
        if (this.field5287 * var7 > this.field5248.field8654.field5393.length) {
            this.field5248.field8654 = new class703((this.field5287 + 100) * var7);
        } else {
            this.field5248.field8654.field5367 = 0;
        }
        if (arg1 != 51) {
            this.method2312((byte) 59);
        }
        class703 var12 = this.field5248.field8654;
        if (var5) {
            if (this.field5248.field8631) {
                for (int var13 = 0; var13 < this.field5232; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field5198[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field5209[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field5235[var13]);
                    int var17 = this.field5192[var13];
                    int var18 = this.field5192[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field5207[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field5367 = var7 * var20;
                        var12.method2353(var14, (byte) -26);
                        var12.method2353(var15, (byte) -97);
                        var12.method2353(var16, (byte) -60);
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field5232; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field5198[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field5209[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field5235[var21]);
                    int var25 = this.field5192[var21];
                    int var26 = this.field5192[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field5207[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field5367 = var7 * var28;
                        var12.method2351((byte) 124, var22);
                        var12.method2351((byte) 124, var23);
                        var12.method2351((byte) 124, var24);
                    }
                }
            }
        }
        if (var3) {
            if (this.field5284 == null) {
                short[] var29;
                short[] var30;
                byte[] var31;
                short[] var32;
                if (this.field5260 == null) {
                    var31 = this.field5194;
                    var32 = this.field5274;
                    var30 = this.field5296;
                    var29 = this.field5281;
                } else {
                    var29 = this.field5260.field3479;
                    var30 = this.field5260.field3481;
                    var31 = this.field5260.field3477;
                    var32 = this.field5260.field3478;
                }
                float var33 = this.field5248.field8645[0];
                float var34 = this.field5248.field8645[1];
                float var35 = this.field5248.field8645[2];
                float var36 = this.field5248.field8712;
                float var37 = this.field5248.field8641 * 768.0F / (float) this.field5237;
                float var38 = this.field5248.field8684 * 768.0F / (float) this.field5237;
                for (int var39 = 0; var39 < this.field5222; var39++) {
                    int var40 = this.method2313(this.field5189[var39], this.field5220[var39], arg1 ^ 0xFFFFFFDB, this.field5275[var39], this.field5266);
                    float var41 = (float) (var40 >> 8 & 0xFF) * this.field5248.field8661;
                    float var42 = (float) (var40 >> 16 & 0xFF) * this.field5248.field8646;
                    short var43 = this.field5298[var39];
                    float var44 = (float) (var40 >>> 24) * this.field5248.field8616;
                    short var45 = (short) var31[var43];
                    float var46;
                    if (var45 == 0) {
                        var46 = ((float) var29[var43] * var35 + (float) var30[var43] * var34 + (float) var32[var43] * var33) * 0.0026041667F;
                    } else {
                        var46 = ((float) var29[var43] * var35 + (float) var30[var43] * var34 + (float) var32[var43] * var33) / (float) (var45 * 256);
                    }
                    float var47 = var36 + (var46 < 0.0F ? var38 : var37) * var46;
                    int var48 = (int) (var44 * var47);
                    int var49 = (int) (var42 * var47);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    int var50 = (int) (var41 * var47);
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    var12.field5367 = var7 * var43 + var9;
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    var12.method2352(true, var48);
                    var12.method2352(true, var49);
                    var12.method2352(true, var50);
                    var12.method2352(true, 255 - (this.field5275[var39] & 0xFF));
                    short var51 = this.field5200[var39];
                    short var52 = (short) var31[var51];
                    float var53;
                    if (var52 == 0) {
                        var53 = ((float) var29[var51] * var35 + (float) var30[var51] * var34 + (float) var32[var51] * var33) * 0.0026041667F;
                    } else {
                        var53 = ((float) var29[var51] * var35 + (float) var30[var51] * var34 + (float) var32[var51] * var33) / (float) (var52 * 256);
                    }
                    float var54 = var53 * ((var53 < 0.0F) ? var38 : var37) + var36;
                    int var55 = (int) (var44 * var54);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    int var56 = (int) (var42 * var54);
                    int var57 = (int) (var41 * var54);
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    var12.field5367 = var7 * var51 + var9;
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    var12.method2352(true, var55);
                    var12.method2352(true, var56);
                    var12.method2352(true, var57);
                    var12.method2352(true, 255 - (this.field5275[var39] & 0xFF));
                    short var58 = this.field5216[var39];
                    short var59 = (short) var31[var58];
                    float var60;
                    if (var59 == 0) {
                        var60 = ((float) var29[var58] * var35 + (float) var30[var58] * var34 + (float) var32[var58] * var33) * 0.0026041667F;
                    } else {
                        var60 = ((float) var29[var58] * var35 + (float) var30[var58] * var34 + (float) var32[var58] * var33) / (float) (var59 * 256);
                    }
                    float var61 = var36 + var60 * ((var60 < 0.0F) ? var38 : var37);
                    int var62 = (int) (var44 * var61);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    int var63 = (int) (var42 * var61);
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    int var64 = (int) (var41 * var61);
                    var12.field5367 = var7 * var58 + var9;
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    var12.method2352(true, var62);
                    var12.method2352(true, var63);
                    var12.method2352(true, var64);
                    var12.method2352(true, 255 - (this.field5275[var39] & 0xFF));
                }
            } else {
                for (int var65 = 0; var65 < this.field5222; var65++) {
                    int var66 = this.method2313(this.field5189[var65], this.field5220[var65], arg1 - 79, this.field5275[var65], this.field5266);
                    var12.field5367 = this.field5298[var65] * var7 + var9;
                    var12.method2353(var66, (byte) -60);
                    var12.field5367 = this.field5200[var65] * var7 + var9;
                    var12.method2353(var66, (byte) -81);
                    var12.field5367 = this.field5216[var65] * var7 + var9;
                    var12.method2353(var66, (byte) -51);
                }
            }
        }
        if (var4) {
            byte[] var67;
            short[] var68;
            short[] var69;
            short[] var70;
            if (this.field5260 == null) {
                var67 = this.field5194;
                var68 = this.field5281;
                var69 = this.field5274;
                var70 = this.field5296;
            } else {
                var67 = this.field5260.field3477;
                var70 = this.field5260.field3481;
                var69 = this.field5260.field3478;
                var68 = this.field5260.field3479;
            }
            float var71 = 3.0F / (float) this.field5237;
            float var72 = 3.0F / (float) (this.field5237 / 2 + this.field5237);
            var12.field5367 = var10;
            if (this.field5248.field8631) {
                for (int var73 = 0; var73 < this.field5287; var73++) {
                    int var74 = var67[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method3847((float) var69[var73] * var72, -23);
                        var12.method3847((float) var70[var73] * var72, -90);
                        var12.method3847((float) var68[var73] * var72, -83);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method3847((float) var69[var73] * var75, -37);
                        var12.method3847((float) var70[var73] * var75, arg1 + 66);
                        var12.method3847((float) var68[var73] * var75, 99);
                    }
                    var12.field5367 += var7 - 12;
                }
            } else {
                for (int var76 = 0; var76 < this.field5287; var76++) {
                    int var77 = var67[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method3846((float) var69[var76] * var72, -116);
                        var12.method3846((float) var70[var76] * var72, -92);
                        var12.method3846((float) var68[var76] * var72, -92);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method3846((float) var69[var76] * var78, -127);
                        var12.method3846((float) var70[var76] * var78, -123);
                        var12.method3846((float) var68[var76] * var78, -28);
                    }
                    var12.field5367 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field5367 = var11;
            if (this.field5248.field8631) {
                for (int var80 = 0; var80 < this.field5287; var80++) {
                    var12.method3847(this.field5247[var80], arg1 + 62);
                    var12.method3847(this.field5203[var80], arg1 - 158);
                    var12.field5367 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field5287; var79++) {
                    var12.method3846(this.field5247[var79], -109);
                    var12.method3846(this.field5203[var79], arg1 - 118);
                    var12.field5367 += var7 - 8;
                }
            }
        }
        var12.field5367 = this.field5287 * var7;
        class373 var81;
        if (arg0) {
            if (this.field5214 == null) {
                this.field5214 = this.field5248.method3433(var12.field5367, false, true, var12.field5393, var7);
            } else {
                this.field5214.method2141(var12.field5367, -73, var12.field5393, var7);
            }
            this.field5202 = 0;
            var81 = this.field5214;
        } else {
            var81 = this.field5248.method3433(var12.field5367, false, false, var12.field5393, var7);
            this.field5225 = true;
        }
        if (var5) {
            this.field5241.field5324 = var81;
            this.field5241.field5325 = var8;
        }
        if (var6) {
            this.field5191.field5324 = var81;
            this.field5191.field5325 = var11;
        }
        if (var3) {
            this.field5289.field5325 = var9;
            this.field5289.field5324 = var81;
        }
        if (var4) {
            this.field5284.field5324 = var81;
            this.field5284.field5325 = var10;
        }
    }

    @OriginalMember(owner = "client!mf", name = "da", descriptor = "(I[IIIIZI[I)V", line = 2045)
    public final void method806(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field5228++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            int var12 = arg2 << 4;
            int var13 = 0;
            class562.field7335 = 0;
            class150.field1928 = 0;
            class39.field552 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field5253.length) {
                    int[] var16 = this.field5253[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field5199 == null || (arg6 & this.field5199[var18]) != 0) {
                            class150.field1928 += this.field5198[var18];
                            class39.field552 += this.field5209[var18];
                            var13++;
                            class562.field7335 += this.field5235[var18];
                        }
                    }
                }
            }
            if (var13 > 0) {
                class562.field7335 = class562.field7335 / var13 + var10;
                class165.field2063 = true;
                class150.field1928 = class150.field1928 / var13 + var12;
                class39.field552 = class39.field552 / var13 + var11;
            } else {
                class150.field1928 = var12;
                class39.field552 = var11;
                class562.field7335 = var10;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[0] * arg2 + (arg7[1] * arg3) + (arg7[2] * arg4) + 8192 >> 14;
                int var20 = arg7[5] * arg4 + arg7[3] * arg2 - (-(arg7[4] * arg3) + -8192) >> 14;
                int var21 = arg7[6] * arg2 + arg7[8] * arg4 + arg7[7] * arg3 + 8192 >> 14;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg4 << 4;
            int var23 = arg3 << 4;
            int var24 = arg2 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field5253.length) {
                    int[] var27 = this.field5253[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field5199 == null || (arg6 & this.field5199[var29]) != 0) {
                            this.field5198[var29] += var24;
                            this.field5209[var29] += var23;
                            this.field5235[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (var49 < this.field5253.length) {
                        int[] var50 = this.field5253[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field5199 == null || (arg6 & this.field5199[var52]) != 0) {
                                this.field5198[var52] -= class150.field1928;
                                this.field5209[var52] -= class39.field552;
                                this.field5235[var52] -= class562.field7335;
                                if (arg4 != 0) {
                                    int var53 = class237.field3193[arg4];
                                    int var54 = class237.field3196[arg4];
                                    int var55 = this.field5198[var52] * var54 + this.field5209[var52] * var53 + 16383 >> 14;
                                    this.field5209[var52] = this.field5209[var52] * var54 + 16383 - (this.field5198[var52] * var53) >> 14;
                                    this.field5198[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class237.field3193[arg2];
                                    int var57 = class237.field3196[arg2];
                                    int var58 = this.field5209[var52] * var57 + 16383 - (this.field5235[var52] * var56) >> 14;
                                    this.field5235[var52] = this.field5209[var52] * var56 + this.field5235[var52] * var57 + 16383 >> 14;
                                    this.field5209[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class237.field3193[arg3];
                                    int var60 = class237.field3196[arg3];
                                    int var61 = this.field5235[var52] * var59 + (this.field5198[var52] * var60) + 16383 >> 14;
                                    this.field5235[var52] = this.field5235[var52] * var60 + 16383 - (this.field5198[var52] * var59) >> 14;
                                    this.field5198[var52] = var61;
                                }
                                this.field5198[var52] += class150.field1928;
                                this.field5209[var52] += class39.field552;
                                this.field5235[var52] += class562.field7335;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (this.field5253.length > var32) {
                            int[] var33 = this.field5253[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field5199 == null || (this.field5199[var35] & arg6) != 0) {
                                    int var36 = this.field5192[var35];
                                    int var37 = this.field5192[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field5207[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class237.field3193[arg4];
                                            int var41 = class237.field3196[arg4];
                                            int var42 = this.field5296[var39] * var40 + (this.field5274[var39] * var41) + 16383 >> 14;
                                            this.field5296[var39] = (short) (this.field5296[var39] * var41 + 16383 - (this.field5274[var39] * var40) >> 14);
                                            this.field5274[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class237.field3193[arg2];
                                            int var44 = class237.field3196[arg2];
                                            int var45 = this.field5296[var39] * var44 - (this.field5281[var39] * var43 - 16383) >> 14;
                                            this.field5281[var39] = (short) (this.field5281[var39] * var44 + this.field5296[var39] * var43 + 16383 >> 14);
                                            this.field5296[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class237.field3193[arg3];
                                            int var47 = class237.field3196[arg3];
                                            int var48 = this.field5281[var39] * var46 + this.field5274[var39] * var47 + 16383 >> 14;
                                            this.field5281[var39] = (short) (this.field5281[var39] * var47 + 16383 - (this.field5274[var39] * var46) >> 14);
                                            this.field5274[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field5284 == null && this.field5289 != null) {
                        this.field5289.field5324 = null;
                    }
                    if (this.field5284 != null) {
                        this.field5284.field5324 = null;
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
                if (class165.field2063) {
                    int var68 = arg7[0] * class150.field1928 + (arg7[3] * class39.field552) + arg7[6] * class562.field7335 + 8192 >> 14;
                    int var69 = arg7[7] * class562.field7335 + arg7[1] * class150.field1928 - (-(arg7[4] * class39.field552) - 8192) >> 14;
                    int var70 = var65 + var68;
                    int var71 = arg7[5] * class39.field552 + (arg7[2] * class150.field1928 + arg7[8] * class562.field7335 + 8192) >> 14;
                    int var72 = var66 + var69;
                    class39.field552 = var72;
                    int var73 = var67 + var71;
                    class150.field1928 = var70;
                    class165.field2063 = false;
                    class562.field7335 = var73;
                }
                int[] var74 = new int[9];
                int var75 = class237.field3196[arg2];
                int var76 = class237.field3193[arg2];
                int var77 = class237.field3196[arg3];
                int var78 = class237.field3193[arg3];
                int var79 = class237.field3196[arg4];
                int var80 = class237.field3193[arg4];
                int var81 = var76 * var79 + 8192 >> 14;
                int var82 = var76 * var80 + 8192 >> 14;
                var74[2] = var75 * var78 + 8192 >> 14;
                var74[5] = -var76;
                var74[4] = var75 * var79 + 8192 >> 14;
                var74[1] = -var77 * var80 + (var78 * var81 + 8192) >> 14;
                var74[6] = -var78 * var79 + var77 * var82 + 8192 >> 14;
                var74[8] = var75 * var77 + 8192 >> 14;
                var74[3] = var75 * var80 + 8192 >> 14;
                var74[7] = var78 * var80 + var77 * var81 + 8192 >> 14;
                var74[0] = var77 * var79 + (var78 * var82) + 8192 >> 14;
                int var83 = var74[2] * -class562.field7335 + var74[0] * -class150.field1928 - (-(var74[1] * -class39.field552) + -8192) >> 14;
                int var84 = var74[5] * -class562.field7335 + var74[4] * -class39.field552 + var74[3] * -class150.field1928 + 8192 >> 14;
                int var85 = var74[6] * -class150.field1928 + var74[7] * -class39.field552 + (var74[8] * -class562.field7335) + 8192 >> 14;
                int var86 = class150.field1928 + var83;
                int var87 = class39.field552 + var84;
                int var88 = var85 + class562.field7335;
                int[] var89 = new int[9];
                for (int var90 = 0; var90 < 3; var90++) {
                    for (int var119 = 0; var119 < 3; var119++) {
                        int var120 = 0;
                        for (int var121 = 0; var121 < 3; var121++) {
                            var120 += var74[var90 * 3 + var121] * arg7[var119 * 3 + var121];
                        }
                        var89[var90 * 3 + var119] = var120 + 8192 >> 14;
                    }
                }
                int var91 = var74[0] * var65 + var74[1] * var66 + var74[2] * var67 + 8192 >> 14;
                int var92 = var74[3] * var65 + var74[4] * var66 + var74[5] * var67 + 8192 >> 14;
                int var93 = var86 + var91;
                int var94 = var87 + var92;
                int var95 = var74[6] * var65 + (var74[7] * var66) + (var74[8] * var67) + 8192 >> 14;
                int var96 = var88 + var95;
                int[] var97 = new int[9];
                for (int var98 = 0; var98 < 3; var98++) {
                    for (int var116 = 0; var116 < 3; var116++) {
                        int var117 = 0;
                        for (int var118 = 0; var118 < 3; var118++) {
                            var117 += arg7[var98 * 3 + var118] * var89[var118 * 3 + var116];
                        }
                        var97[var98 * 3 + var116] = var117 + 8192 >> 14;
                    }
                }
                int var99 = arg7[0] * var93 + (arg7[1] * var94) + arg7[2] * var96 + 8192 >> 14;
                int var100 = arg7[5] * var96 + arg7[3] * var93 - (-(arg7[4] * var94) + -8192) >> 14;
                int var101 = var63 + var100;
                int var102 = arg7[8] * var96 + arg7[7] * var94 + arg7[6] * var93 + 8192 >> 14;
                int var103 = var62 + var99;
                int var104 = var64 + var102;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (this.field5253.length > var106) {
                        int[] var107 = this.field5253[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field5199 == null || (this.field5199[var109] & arg6) != 0) {
                                int var110 = this.field5235[var109] * var97[2] + this.field5209[var109] * var97[1] + this.field5198[var109] * var97[0] + 8192 >> 14;
                                int var111 = this.field5235[var109] * var97[5] + this.field5209[var109] * var97[4] + this.field5198[var109] * var97[3] + 8192 >> 14;
                                int var112 = var103 + var110;
                                int var113 = var101 + var111;
                                int var114 = this.field5198[var109] * var97[6] + this.field5209[var109] * var97[7] + this.field5235[var109] * var97[8] + 8192 >> 14;
                                int var115 = var104 + var114;
                                this.field5198[var109] = var112;
                                this.field5209[var109] = var113;
                                this.field5235[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (this.field5253.length > var173) {
                        int[] var174 = this.field5253[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field5199 == null || (this.field5199[var176] & arg6) != 0) {
                                this.field5198[var176] -= class150.field1928;
                                this.field5209[var176] -= class39.field552;
                                this.field5235[var176] -= class562.field7335;
                                this.field5198[var176] = this.field5198[var176] * arg2 >> 7;
                                this.field5209[var176] = this.field5209[var176] * arg3 >> 7;
                                this.field5235[var176] = this.field5235[var176] * arg4 >> 7;
                                this.field5198[var176] += class150.field1928;
                                this.field5209[var176] += class39.field552;
                                this.field5235[var176] += class562.field7335;
                            }
                        }
                    }
                }
            } else {
                int var122 = arg7[9] << 4;
                int var123 = arg7[10] << 4;
                int var124 = arg7[11] << 4;
                int var125 = arg7[12] << 4;
                int var126 = arg7[13] << 4;
                int var127 = arg7[14] << 4;
                if (class165.field2063) {
                    int var128 = arg7[0] * class150.field1928 + arg7[3] * class39.field552 + arg7[6] * class562.field7335 + 8192 >> 14;
                    int var129 = arg7[1] * class150.field1928 + arg7[7] * class562.field7335 + arg7[4] * class39.field552 + 8192 >> 14;
                    int var130 = var126 + var129;
                    int var131 = var125 + var128;
                    int var132 = arg7[8] * class562.field7335 + arg7[5] * class39.field552 + arg7[2] * class150.field1928 + 8192 >> 14;
                    int var133 = var127 + var132;
                    class150.field1928 = var131;
                    class39.field552 = var130;
                    class165.field2063 = false;
                    class562.field7335 = var133;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class150.field1928 * var134 + 8192 >> 14;
                int var138 = -class39.field552 * var135 + 8192 >> 14;
                int var139 = -class562.field7335 * var136 + 8192 >> 14;
                int var140 = class150.field1928 + var137;
                int var141 = class39.field552 + var138;
                int var142 = class562.field7335 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 8192 >> 14, arg7[3] * var134 + 8192 >> 14, arg7[6] * var134 + 8192 >> 14, arg7[1] * var135 + 8192 >> 14, arg7[4] * var135 + 8192 >> 14, arg7[7] * var135 + 8192 >> 14, arg7[2] * var136 + 8192 >> 14, arg7[5] * var136 + 8192 >> 14, arg7[8] * var136 + 8192 >> 14 };
                int var144 = var125 * var134 + 8192 >> 14;
                int var145 = var126 * var135 + 8192 >> 14;
                int var146 = var127 * var136 + 8192 >> 14;
                int var147 = var140 + var144;
                int var148 = var141 + var145;
                int var149 = var142 + var146;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var169 = 0; var169 < 3; var169++) {
                        int var170 = 0;
                        for (int var171 = 0; var171 < 3; var171++) {
                            var170 += arg7[var151 * 3 + var171] * var143[var171 * 3 + var169];
                        }
                        var150[var151 * 3 + var169] = var170 + 8192 >> 14;
                    }
                }
                int var152 = arg7[2] * var149 + arg7[1] * var148 + arg7[0] * var147 + 8192 >> 14;
                int var153 = arg7[5] * var149 + arg7[3] * var147 + (arg7[4] * var148) + 8192 >> 14;
                int var154 = arg7[7] * var148 + arg7[6] * var147 + arg7[8] * var149 + 8192 >> 14;
                int var155 = var123 + var153;
                int var156 = var122 + var152;
                int var157 = var124 + var154;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (this.field5253.length > var159) {
                        int[] var160 = this.field5253[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field5199 == null || (this.field5199[var162] & arg6) != 0) {
                                int var163 = this.field5235[var162] * var150[2] + (this.field5198[var162] * var150[0] + (this.field5209[var162] * var150[1])) + 8192 >> 14;
                                int var164 = this.field5209[var162] * var150[4] + this.field5235[var162] * var150[5] + this.field5198[var162] * var150[3] + 8192 >> 14;
                                int var165 = this.field5235[var162] * var150[8] + this.field5198[var162] * var150[6] + this.field5209[var162] * var150[7] + 8192 >> 14;
                                int var166 = var156 + var163;
                                int var167 = var155 + var164;
                                this.field5198[var162] = var166;
                                int var168 = var157 + var165;
                                this.field5209[var162] = var167;
                                this.field5235[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field5244 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field5244.length) {
                        int[] var182 = this.field5244[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field5229 == null || (this.field5229[var184] & arg6) != 0) {
                                int var185 = (this.field5275[var184] & 0xFF) + (arg2 * 8);
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field5275[var184] = (byte) var185;
                                if (this.field5289 != null) {
                                    this.field5289.field5324 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field5204 != null) {
                    for (int var178 = 0; var178 < this.field5195; var178++) {
                        class693 var179 = this.field5204[var178];
                        class183 var180 = this.field5217[var178];
                        var180.field2351 = var180.field2351 & 0xFFFFFF | 255 - (this.field5275[var179.field9477] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field5244 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (var190 < this.field5244.length) {
                        int[] var191 = this.field5244[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field5229 == null || (arg6 & this.field5229[var193]) != 0) {
                                int var194 = this.field5220[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFF09) >> 10;
                                int var196 = (var194 & 0x3DA) >> 7;
                                int var197 = var194 & 0x7F;
                                int var198 = arg3 / 4 + var196;
                                int var199 = arg2 + var195 & 0x3F;
                                if (var198 < 0) {
                                    var198 = 0;
                                } else if (var198 > 7) {
                                    var198 = 7;
                                }
                                int var200 = arg4 + var197;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field5220[var193] = (short) class131.method954(class131.method954(var199 << 10, var198 << 7), var200);
                                if (this.field5289 != null) {
                                    this.field5289.field5324 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field5204 != null) {
                    for (int var187 = 0; var187 < this.field5195; var187++) {
                        class693 var188 = this.field5204[var187];
                        class183 var189 = this.field5217[var187];
                        var189.field2351 = var189.field2351 & 0xFF000000 | class505.field6642[this.field5220[var188.field9477] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field5227 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (this.field5227.length > var202) {
                        int[] var203 = this.field5227[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class183 var205 = this.field5217[var203[var204]];
                            var205.field2349 += arg2;
                            var205.field2348 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field5227 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field5227.length) {
                        int[] var208 = this.field5227[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class183 var210 = this.field5217[var208[var209]];
                            var210.field2344 = var210.field2344 * arg2 >> 7;
                            var210.field2356 = var210.field2356 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field5227 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field5227.length) {
                    int[] var213 = this.field5227[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class183 var215 = this.field5217[var213[var214]];
                        var215.field2343 = var215.field2343 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "(I)V", line = 3031)
    public final void method803(int arg0) {
        field5239++;
        int var2 = class237.field3193[arg0];
        int var3 = class237.field3196[arg0];
        for (int var4 = 0; var4 < this.field5232; var4++) {
            int var5 = this.field5209[var4] * var2 + this.field5198[var4] * var3 >> 14;
            this.field5209[var4] = this.field5209[var4] * var3 - this.field5198[var4] * var2 >> 14;
            this.field5198[var4] = var5;
        }
        this.field5268 = false;
        if (this.field5241 != null) {
            this.field5241.field5324 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "()[Lrea;", line = 3063)
    public final class32[] method795() {
        field5282++;
        return this.field5297;
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)V", line = 3072)
    private final void method2317(int arg0) {
        field5233++;
        if (!this.field5225) {
            return;
        }
        this.field5225 = false;
        if (this.field5224 == null && this.field5297 == null && this.field5204 == null) {
            if (this.field5198 != null && !class514.method2771(this.field5283, this.field5256, (byte) -109)) {
                if (this.field5241 != null && this.field5241.field5324 == null) {
                    this.field5225 = true;
                } else {
                    if (!this.field5268) {
                        this.method2320(32076);
                    }
                    this.field5198 = null;
                }
            }
            if (this.field5209 != null && !class586.method3197(this.field5283, false, this.field5256)) {
                if (this.field5241 != null && this.field5241.field5324 == null) {
                    this.field5225 = true;
                } else {
                    if (!this.field5268) {
                        this.method2320(arg0 + 32077);
                    }
                    this.field5209 = null;
                }
            }
            if (this.field5235 != null && !class478.method2653(this.field5256, this.field5283, 0)) {
                if (this.field5241 != null && this.field5241.field5324 == null) {
                    this.field5225 = true;
                } else {
                    if (!this.field5268) {
                        this.method2320(32076);
                    }
                    this.field5235 = null;
                }
            }
        }
        if (arg0 != -1) {
            this.method2318(30, 72, 85, -36, 116, -37, 52, 61, -38);
        }
        if (this.field5207 != null && this.field5198 == null && this.field5209 == null && this.field5235 == null) {
            this.field5207 = null;
            this.field5192 = null;
        }
        if (this.field5194 != null && !class77.method624(55, this.field5283, this.field5256)) {
            if (this.field5284 == null) {
                if (this.field5289 != null && this.field5289.field5324 == null) {
                    this.field5225 = true;
                } else {
                    this.field5194 = null;
                    this.field5274 = this.field5296 = this.field5281 = null;
                }
            } else if (this.field5284.field5324 == null) {
                this.field5225 = true;
            } else {
                this.field5274 = this.field5296 = this.field5281 = null;
                this.field5194 = null;
            }
        }
        if (this.field5220 != null && !class395.method2249(this.field5283, this.field5256, arg0 + 121)) {
            if (this.field5289 != null && this.field5289.field5324 == null) {
                this.field5225 = true;
            } else {
                this.field5220 = null;
            }
        }
        if (this.field5275 != null && !class304.method1791(this.field5256, arg0 + 262145, this.field5283)) {
            if (this.field5289 != null && this.field5289.field5324 == null) {
                this.field5225 = true;
            } else {
                this.field5275 = null;
            }
        }
        if (this.field5247 != null && !class376.method2154(this.field5256, this.field5283, 0)) {
            if (this.field5191 != null && this.field5191.field5324 == null) {
                this.field5225 = true;
            } else {
                this.field5247 = this.field5203 = null;
            }
        }
        if (this.field5189 != null && !class356.method2049(-68, this.field5256, this.field5283)) {
            if (this.field5289 != null && this.field5289.field5324 == null) {
                this.field5225 = true;
            } else {
                this.field5189 = null;
            }
        }
        if (this.field5298 != null && !class59.method507((byte) -44, this.field5283, this.field5256)) {
            if ((this.field5251 == null || this.field5251.field7281 != null) && (this.field5289 == null || this.field5289.field5324 != null)) {
                this.field5298 = this.field5200 = this.field5216 = null;
            } else {
                this.field5225 = true;
            }
        }
        if (this.field5244 != null && !class455.method2569((byte) 110, this.field5256, this.field5283)) {
            this.field5244 = null;
            this.field5229 = null;
        }
        if (this.field5253 != null && !class554.method2972((byte) 75, this.field5283, this.field5256)) {
            this.field5199 = null;
            this.field5253 = null;
        }
        if (this.field5227 != null && !class481.method2658((byte) -6, this.field5283, this.field5256)) {
            this.field5227 = null;
        }
        if (this.field5201 != null && (this.field5283 & 0x800) == 0 && (this.field5283 & 0x40000) == 0) {
            this.field5201 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "(III)V", line = 3247)
    public final void method789(int arg0, int arg1, int arg2) {
        field5280++;
        for (int var4 = 0; var4 < this.field5232; var4++) {
            if (arg0 != 128) {
                this.field5198[var4] = this.field5198[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field5209[var4] = this.field5209[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field5235[var4] = this.field5235[var4] * arg2 >> 7;
            }
        }
        if (this.field5241 != null) {
            this.field5241.field5324 = null;
        }
        this.field5268 = false;
    }

    @OriginalMember(owner = "client!mf", name = "V", descriptor = "(I)V", line = 3281)
    public final void method809(int arg0) {
        field5243++;
        int var2 = class237.field3193[arg0];
        int var3 = class237.field3196[arg0];
        for (int var4 = 0; var4 < this.field5232; var4++) {
            int var7 = this.field5235[var4] * var2 + this.field5198[var4] * var3 >> 14;
            this.field5235[var4] = this.field5235[var4] * var3 - this.field5198[var4] * var2 >> 14;
            this.field5198[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field5287; var5++) {
            int var6 = this.field5281[var5] * var2 + this.field5274[var5] * var3 >> 14;
            this.field5281[var5] = (short) (this.field5281[var5] * var3 - (this.field5274[var5] * var2) >> 14);
            this.field5274[var5] = (short) var6;
        }
        if (this.field5284 == null && this.field5289 != null) {
            this.field5289.field5324 = null;
        }
        if (this.field5284 != null) {
            this.field5284.field5324 = null;
        }
        if (this.field5241 != null) {
            this.field5241.field5324 = null;
        }
        this.field5268 = false;
    }

    @OriginalMember(owner = "client!mf", name = "DA", descriptor = "()I", line = 3332)
    public final int method816() {
        field5250++;
        if (!this.field5268) {
            this.method2320(32076);
        }
        return this.field5258;
    }

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "()I", line = 3343)
    public final int method824() {
        field5291++;
        return this.field5237;
    }

    @OriginalMember(owner = "client!mf", name = "D", descriptor = "(I)V", line = 3354)
    public final void method826(int arg0) {
        field5285++;
        if (this.field5289 != null) {
            this.field5289.field5324 = null;
        }
        this.field5266 = (short) arg0;
    }

    @OriginalMember(owner = "client!mf", name = "ka", descriptor = "(SS)V", line = 3368)
    public final void method790(short arg0, short arg1) {
        field5279++;
        class702 var3 = this.field5248.field598;
        for (int var4 = 0; var4 < this.field5222; var4++) {
            if (this.field5189[var4] == arg0) {
                this.field5189[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class59 var7 = var3.method3162((byte) -104, arg0 & 0xFFFF);
            var5 = var7.field798;
            var6 = var7.field811;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class59 var10 = var3.method3162((byte) -104, arg1 & 0xFFFF);
            var9 = var10.field811;
            var8 = var10.field798;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field5204 != null) {
            for (int var11 = 0; var11 < this.field5195; var11++) {
                class693 var12 = this.field5204[var11];
                class183 var13 = this.field5217[var11];
                var13.field2351 = class505.field6642[this.field5220[var12.field9477] & 0xFFFF] & 0xFFFFFF | var13.field2351 & 0xFF000000;
            }
        }
        if (this.field5289 != null) {
            this.field5289.field5324 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lji;)V", line = 5696)
    public class408(class622 arg0) {
        this.field5248 = arg0;
        this.field5241 = new class414(null, 5126, 3, 0);
        this.field5191 = new class414(null, 5126, 2, 0);
        this.field5284 = new class414(null, 5126, 3, 0);
        this.field5289 = new class414(null, 5121, 4, 0);
        this.field5251 = new class557();
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lji;Lfca;IIII)V", line = 5708)
    public class408(class622 arg0, class645 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5283 = arg2;
        this.field5248 = arg0;
        this.field5256 = arg5;
        if (class427.method2454((byte) 40, arg2, arg5)) {
            this.field5241 = new class414(null, 5126, 3, 0);
        }
        if (class247.method1553(arg2, arg5, -9105)) {
            this.field5191 = new class414(null, 5126, 2, 0);
        }
        if (class447.method2541(2048, arg5, arg2)) {
            this.field5284 = new class414(null, 5126, 3, 0);
        }
        if (class427.method2453(2048, arg2, arg5)) {
            this.field5289 = new class414(null, 5121, 4, 0);
        }
        if (class26.method152(arg5, 124, arg2)) {
            this.field5251 = new class557();
        }
        class702 var7 = arg0.field598;
        this.field5192 = new int[arg1.field8941 + 1];
        int[] var8 = new int[arg1.field8952];
        for (int var9 = 0; var9 < arg1.field8952; var9++) {
            if ((arg1.field8985 == null || arg1.field8985[var9] != 2) && (arg1.field8961 == null || arg1.field8961[var9] == -1 || !var7.method3162((byte) -104, arg1.field8961[var9] & 0xFFFF).field810)) {
                var8[this.field5222++] = var9;
                this.field5192[arg1.field8939[var9]]++;
                this.field5192[arg1.field8965[var9]]++;
                this.field5192[arg1.field8955[var9]]++;
            }
        }
        this.field5257 = this.field5222;
        long[] var10 = new long[this.field5222];
        boolean var11 = (this.field5283 & 0x100) != 0;
        label497: for (int var12 = 0; var12 < this.field5222; var12++) {
            int var180 = var8[var12];
            class59 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field8960 != null) {
                for (int var186 = 0; var186 < arg1.field8960.length; var186++) {
                    class65 var187 = arg1.field8960[var186];
                    if (var187.field888 == var180) {
                        class313 var188 = class156.method1120((byte) -54, var187.field889);
                        if (var188.field4062) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field5257--;
                            continue label497;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field8961 != null) {
                var189 = arg1.field8961[var180];
                if (var189 != -1) {
                    var181 = var7.method3162((byte) -104, var189 & 0xFFFF);
                    var185 = var181.field813;
                    var184 = var181.field805;
                }
            }
            boolean var190 = arg1.field8974 != null && arg1.field8974[var180] != 0 || var181 != null && !var181.field800 | var181.field812;
            if ((var11 || var190) && arg1.field8949 != null) {
                var182 += arg1.field8949[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = ((var184 & 0xFF) << 8) + var182;
            int var192 = (var185 & 0xFF) + var191;
            int var193 = ((var189 & 0xFFFF) << 16) + var183;
            int var194 = (var12 & 0xFFFF) + var193;
            var10[var12] = ((long) var192 << 32) + (long) var194;
        }
        class524.method2807(var10, 1, var8);
        this.field5235 = arg1.field8972;
        this.field5209 = arg1.field8968;
        this.field5272 = arg1.field8938;
        this.field5199 = arg1.field8958;
        this.field5198 = arg1.field8983;
        this.field5232 = arg1.field8941;
        this.field5297 = arg1.field8982;
        this.field5224 = arg1.field8943;
        class666[] var13 = new class666[this.field5232];
        if (arg1.field8960 != null) {
            this.field5195 = arg1.field8960.length;
            this.field5217 = new class183[this.field5195];
            this.field5204 = new class693[this.field5195];
            for (int var14 = 0; var14 < this.field5195; var14++) {
                class65 var15 = arg1.field8960[var14];
                class313 var16 = class156.method1120((byte) -106, var15.field889);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field5222; var18++) {
                    if (var8[var18] == var15.field888) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class505.field6642[arg1.field8978[var15.field888] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field8974 == null ? 0 : arg1.field8974[var15.field888]) << 24;
                this.field5204[var14] = new class693(var17, arg1.field8939[var15.field888], arg1.field8965[var15.field888], arg1.field8955[var15.field888], var16.field4057, var16.field4065, var16.field4059, var16.field4060, var16.field4063, var16.field4062, var16.field4058, var15.field885);
                this.field5217[var14] = new class183(var20);
            }
        }
        int var21 = this.field5222 * 3;
        this.field5266 = (short) arg3;
        this.field5203 = new float[var21];
        this.field5298 = new short[this.field5222];
        this.field5220 = new short[this.field5222];
        this.field5216 = new short[this.field5222];
        class310.field4027 = new long[var21];
        this.field5200 = new short[this.field5222];
        this.field5275 = new byte[this.field5222];
        this.field5194 = new byte[var21];
        this.field5237 = (short) arg4;
        this.field5189 = new short[this.field5222];
        this.field5296 = new short[var21];
        this.field5274 = new short[var21];
        this.field5281 = new short[var21];
        this.field5247 = new float[var21];
        this.field5207 = new short[var21];
        if (arg1.field8976 != null) {
            this.field5229 = new short[this.field5222];
        }
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field8941; var23++) {
            int var179 = this.field5192[var23];
            this.field5192[var23] = var22;
            var22 += var179;
            var13[var23] = new class666();
        }
        this.field5192[arg1.field8941] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field8970 != null) {
            int var28 = arg1.field8966;
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
            var25 = new int[var28];
            for (int var36 = 0; var36 < this.field5222; var36++) {
                int var43 = var8[var36];
                if (arg1.field8970[var43] != -1) {
                    int var44 = arg1.field8970[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field8939[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field8965[var43];
                        } else {
                            var46 = arg1.field8955[var43];
                        }
                        int var47 = arg1.field8983[var46];
                        int var48 = arg1.field8968[var46];
                        int var49 = arg1.field8972[var46];
                        if (var47 < var29[var44]) {
                            var29[var44] = var47;
                        }
                        if (var30[var44] < var47) {
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
                        if (var34[var44] < var49) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var27 = new float[var28][];
            var24 = new int[var28];
            var26 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field8977[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var40;
                    float var41;
                    float var42;
                    if (var38 == 1) {
                        int var39 = arg1.field8963[var37];
                        var40 = 64.0F / (float) arg1.field8948[var37];
                        if (var39 == 0) {
                            var41 = 1.0F;
                            var42 = 1.0F;
                        } else if (var39 > 0) {
                            var42 = (float) var39 / 1024.0F;
                            var41 = 1.0F;
                        } else {
                            var41 = (float) (-var39) / 1024.0F;
                            var42 = 1.0F;
                        }
                    } else if (var38 == 2) {
                        var40 = 64.0F / (float) arg1.field8948[var37];
                        var41 = 64.0F / (float) arg1.field8963[var37];
                        var42 = 64.0F / (float) arg1.field8979[var37];
                    } else {
                        var41 = (float) arg1.field8963[var37] / 1024.0F;
                        var40 = (float) arg1.field8948[var37] / 1024.0F;
                        var42 = (float) arg1.field8979[var37] / 1024.0F;
                    }
                    var27[var37] = class564.method3012(class597.method3238(255, arg1.field8984[var37]), var42, arg1.field8992[var37], var40, arg1.field8971[var37], var41, (byte) -5, arg1.field8957[var37]);
                }
            }
        }
        class22[] var50 = new class22[arg1.field8952];
        for (int var51 = 0; var51 < arg1.field8952; var51++) {
            short var158 = arg1.field8939[var51];
            short var159 = arg1.field8965[var51];
            short var160 = arg1.field8955[var51];
            int var161 = this.field5198[var159] - this.field5198[var158];
            int var162 = this.field5209[var159] - this.field5209[var158];
            int var163 = this.field5235[var159] - this.field5235[var158];
            int var164 = this.field5198[var160] - this.field5198[var158];
            int var165 = this.field5209[var160] - this.field5209[var158];
            int var166 = this.field5235[var160] - this.field5235[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - (var161 * var166);
            int var169 = var161 * var165 - (var162 * var164);
            while (var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192) {
                var169 >>= 0x1;
                var167 >>= 0x1;
                var168 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var169 * var169 + var167 * var167 + var168 * var168));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var169 * 256 / var170;
            int var172 = var168 * 256 / var170;
            int var173 = var167 * 256 / var170;
            byte var174 = arg1.field8985 == null ? 0 : arg1.field8985[var51];
            if (var174 == 0) {
                class666 var176 = var13[var158];
                var176.field9239 += var172;
                var176.field9242++;
                var176.field9237 += var173;
                var176.field9244 += var171;
                class666 var177 = var13[var159];
                var177.field9237 += var173;
                var177.field9244 += var171;
                var177.field9239 += var172;
                var177.field9242++;
                class666 var178 = var13[var160];
                var178.field9239 += var172;
                var178.field9237 += var173;
                var178.field9244 += var171;
                var178.field9242++;
            } else if (var174 == 1) {
                class22 var175 = var50[var51] = new class22();
                var175.field240 = var172;
                var175.field236 = var173;
                var175.field238 = var171;
            }
        }
        for (int var52 = 0; var52 < this.field5222; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field8978[var68] & 0xFFFF;
            short var70;
            if (arg1.field8961 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field8961[var68];
            }
            int var71;
            if (arg1.field8970 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field8970[var68];
            }
            int var72;
            if (arg1.field8974 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field8974[var68] & 0xFF;
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
                    var73 = 0.0F;
                    var75 = 1.0F;
                    var78 = 0.0F;
                    var74 = 1.0F;
                    var76 = 1.0F;
                    var79 = 1;
                    var77 = 0.0F;
                    var80 = 2;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field8977[var71];
                    if (var82 == 0) {
                        short var111 = arg1.field8939[var68];
                        short var112 = arg1.field8965[var68];
                        short var113 = arg1.field8955[var68];
                        short var114 = arg1.field8957[var71];
                        short var115 = arg1.field8992[var71];
                        short var116 = arg1.field8971[var71];
                        float var117 = (float) arg1.field8983[var114];
                        float var118 = (float) arg1.field8968[var114];
                        float var119 = (float) arg1.field8972[var114];
                        float var120 = (float) arg1.field8983[var115] - var117;
                        float var121 = (float) arg1.field8968[var115] - var118;
                        float var122 = (float) arg1.field8972[var115] - var119;
                        float var123 = (float) arg1.field8983[var116] - var117;
                        float var124 = (float) arg1.field8968[var116] - var118;
                        float var125 = (float) arg1.field8972[var116] - var119;
                        float var126 = (float) arg1.field8983[var111] - var117;
                        float var127 = (float) arg1.field8968[var111] - var118;
                        float var128 = (float) arg1.field8972[var111] - var119;
                        float var129 = (float) arg1.field8983[var112] - var117;
                        float var130 = (float) arg1.field8968[var112] - var118;
                        float var131 = (float) arg1.field8972[var112] - var119;
                        float var132 = (float) arg1.field8983[var113] - var117;
                        float var133 = (float) arg1.field8968[var113] - var118;
                        float var134 = (float) arg1.field8972[var113] - var119;
                        float var135 = var121 * var125 - var122 * var124;
                        float var136 = var122 * var123 - var120 * var125;
                        float var137 = var120 * var124 - var121 * var123;
                        float var138 = var124 * var137 - var125 * var136;
                        float var139 = var125 * var135 - (var123 * var137);
                        float var140 = var123 * var136 - (var124 * var135);
                        float var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                        var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                        var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                        var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                        float var142 = var122 * var135 - (var120 * var137);
                        float var143 = var120 * var136 - (var121 * var135);
                        float var144 = var121 * var137 - (var122 * var136);
                        float var145 = 1.0F / (var125 * var143 + var123 * var144 + var124 * var142);
                        var78 = (var134 * var143 + var132 * var144 + var133 * var142) * var145;
                        var76 = (var131 * var143 + var129 * var144 + var130 * var142) * var145;
                        var74 = (var128 * var143 + var126 * var144 + var127 * var142) * var145;
                    } else {
                        short var83 = arg1.field8939[var68];
                        short var84 = arg1.field8965[var68];
                        short var85 = arg1.field8955[var68];
                        int var86 = var24[var71];
                        int var87 = var25[var71];
                        int var88 = var26[var71];
                        float[] var89 = var27[var71];
                        byte var90 = arg1.field8980[var71];
                        float var91 = (float) arg1.field8969[var71] / 256.0F;
                        if (var82 == 1) {
                            float var109 = (float) arg1.field8979[var71] / 1024.0F;
                            class109.method838(var88, var90, var89, arg1.field8983[var83], arg1.field8972[var83], var91, 2, var87, var86, arg1.field8968[var83], var109);
                            var74 = class512.field6708;
                            var73 = class385.field4918;
                            class109.method838(var88, var90, var89, arg1.field8983[var84], arg1.field8972[var84], var91, 2, var87, var86, arg1.field8968[var84], var109);
                            var75 = class385.field4918;
                            var76 = class512.field6708;
                            class109.method838(var88, var90, var89, arg1.field8983[var85], arg1.field8972[var85], var91, 2, var87, var86, arg1.field8968[var85], var109);
                            var77 = class385.field4918;
                            var78 = class512.field6708;
                            float var110 = var109 / 2.0F;
                            if ((var90 & 0x1) == 0) {
                                if (var110 < var75 - var73) {
                                    var75 -= var109;
                                    var79 = 1;
                                } else if (var73 - var75 > var110) {
                                    var75 += var109;
                                    var79 = 2;
                                }
                                if (var77 - var73 > var110) {
                                    var77 -= var109;
                                    var80 = 1;
                                } else if (var110 < var73 - var77) {
                                    var77 += var109;
                                    var80 = 2;
                                }
                            } else {
                                if ((var110 < var78 - var74)) {
                                    var80 = 1;
                                    var78 -= var109;
                                } else if (var74 - var78 > var110) {
                                    var80 = 2;
                                    var78 += var109;
                                }
                                if ((var76 - var74 > var110)) {
                                    var76 -= var109;
                                    var79 = 1;
                                } else if (var110 < var74 - var76) {
                                    var79 = 2;
                                    var76 += var109;
                                }
                            }
                        } else if (var82 == 2) {
                            float var92 = (float) arg1.field8953[var71] / 256.0F;
                            float var93 = (float) arg1.field8951[var71] / 256.0F;
                            int var94 = arg1.field8983[var84] - arg1.field8983[var83];
                            int var95 = arg1.field8968[var84] - arg1.field8968[var83];
                            int var96 = arg1.field8972[var84] - arg1.field8972[var83];
                            int var97 = arg1.field8983[var85] - arg1.field8983[var83];
                            int var98 = arg1.field8968[var85] - arg1.field8968[var83];
                            int var99 = arg1.field8972[var85] - arg1.field8972[var83];
                            int var100 = var95 * var99 - (var96 * var98);
                            int var101 = var96 * var97 - (var94 * var99);
                            int var102 = var94 * var98 - (var95 * var97);
                            float var103 = 64.0F / (float) arg1.field8963[var71];
                            float var104 = 64.0F / (float) arg1.field8948[var71];
                            float var105 = 64.0F / (float) arg1.field8979[var71];
                            float var106 = (var89[2] * (float) var102 + var89[1] * (float) var101 + var89[0] * (float) var100) / var103;
                            float var107 = (var89[5] * (float) var102 + var89[4] * (float) var101 + var89[3] * (float) var100) / var104;
                            float var108 = (var89[8] * (float) var102 + var89[6] * (float) var100 + var89[7] * (float) var101) / var105;
                            var81 = class509.method2745(var107, var106, var108, false);
                            class275.method1666(arg1.field8983[var83], var89, var91, var88, (byte) 44, var86, var92, var81, var90, arg1.field8968[var83], arg1.field8972[var83], var87, var93);
                            var74 = class260.field3507;
                            var73 = class303.field3964;
                            class275.method1666(arg1.field8983[var84], var89, var91, var88, (byte) 44, var86, var92, var81, var90, arg1.field8968[var84], arg1.field8972[var84], var87, var93);
                            var75 = class303.field3964;
                            var76 = class260.field3507;
                            class275.method1666(arg1.field8983[var85], var89, var91, var88, (byte) 44, var86, var92, var81, var90, arg1.field8968[var85], arg1.field8972[var85], var87, var93);
                            var77 = class303.field3964;
                            var78 = class260.field3507;
                        } else if (var82 == 3) {
                            class154.method1114(var86, var87, var88, arg1.field8968[var83], arg1.field8972[var83], var90, (byte) 77, var91, var89, arg1.field8983[var83]);
                            var73 = class5.field37;
                            var74 = class549.field7129;
                            class154.method1114(var86, var87, var88, arg1.field8968[var84], arg1.field8972[var84], var90, (byte) 109, var91, var89, arg1.field8983[var84]);
                            var75 = class5.field37;
                            var76 = class549.field7129;
                            class154.method1114(var86, var87, var88, arg1.field8968[var85], arg1.field8972[var85], var90, (byte) 98, var91, var89, arg1.field8983[var85]);
                            var78 = class549.field7129;
                            var77 = class5.field37;
                            if ((var90 & 0x1) == 0) {
                                if (var75 - var73 > 0.5F) {
                                    var75--;
                                    var79 = 1;
                                } else if (var73 - var75 > 0.5F) {
                                    var79 = 2;
                                    var75++;
                                }
                                if ((var77 - var73 > 0.5F)) {
                                    var77--;
                                    var80 = 1;
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
                                    var78--;
                                    var80 = 1;
                                } else if (var74 - var78 > 0.5F) {
                                    var78++;
                                    var80 = 2;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field8985 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field8985[var68];
            }
            if (var146 == 0) {
                long var147 = ((long) (var69 << 8) + (long) (var81 << 24) + ((long) var72) << 32) + (long) (var71 << 2);
                short var149 = arg1.field8939[var68];
                short var150 = arg1.field8965[var68];
                short var151 = arg1.field8955[var68];
                class666 var152 = var13[var149];
                this.field5298[var52] = this.method2314(var73, var152.field9242, (byte) 81, var149, var152.field9244, var152.field9237, var152.field9239, var147, arg1, var74);
                class666 var153 = var13[var150];
                this.field5200[var52] = this.method2314(var75, var153.field9242, (byte) -117, var150, var153.field9244, var153.field9237, var153.field9239, (long) var79 + var147, arg1, var76);
                class666 var154 = var13[var151];
                this.field5216[var52] = this.method2314(var77, var154.field9242, (byte) -92, var151, var154.field9244, var154.field9237, var154.field9239, (long) var80 + var147, arg1, var78);
            } else if (var146 == 1) {
                class22 var155 = var50[var68];
                long var156 = ((long) (var81 << 24) + (long) var72 + (long) (var69 << 8) << 32) + (long) ((var71 << 2) - (-(var155.field236 > 0 ? 1024 : 2048) - (var155.field240 + 256 << 12) - (var155.field238 + 256 << 22)));
                this.field5298[var52] = this.method2314(var73, 0, (byte) -81, arg1.field8939[var68], var155.field238, var155.field236, var155.field240, var156, arg1, var74);
                this.field5200[var52] = this.method2314(var75, 0, (byte) -95, arg1.field8965[var68], var155.field238, var155.field236, var155.field240, (long) var79 + var156, arg1, var76);
                this.field5216[var52] = this.method2314(var77, 0, (byte) -103, arg1.field8955[var68], var155.field238, var155.field236, var155.field240, (long) var80 + var156, arg1, var78);
            }
            if (arg1.field8961 == null) {
                this.field5189[var52] = -1;
            } else {
                this.field5189[var52] = arg1.field8961[var68];
            }
            if (arg1.field8974 != null) {
                this.field5275[var52] = arg1.field8974[var68];
            }
            if (arg1.field8976 != null) {
                this.field5229[var52] = arg1.field8976[var68];
            }
            this.field5220[var52] = arg1.field8978[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field5257; var55++) {
            short var67 = this.field5189[var55];
            if (var54 != var67) {
                var54 = var67;
                var53++;
            }
        }
        this.field5201 = new int[var53 + 1];
        short var56 = -10000;
        int var57 = 0;
        for (int var58 = 0; var58 < this.field5257; var58++) {
            short var66 = this.field5189[var58];
            if (var56 != var66) {
                this.field5201[var57++] = var58;
                var56 = var66;
            }
        }
        this.field5201[var57] = this.field5257;
        class310.field4027 = null;
        this.field5274 = class636.method3517(this.field5274, (byte) 114, this.field5287);
        this.field5296 = class636.method3517(this.field5296, (byte) 116, this.field5287);
        this.field5281 = class636.method3517(this.field5281, (byte) 125, this.field5287);
        this.field5194 = class388.method2222(this.field5194, this.field5287, 88);
        this.field5247 = class27.method178((byte) -121, this.field5247, this.field5287);
        this.field5203 = class27.method178((byte) 113, this.field5203, this.field5287);
        if (arg1.field8944 != null && class554.method2972((byte) 111, arg2, this.field5256)) {
            this.field5253 = arg1.method3548(-1, false);
        }
        if (arg1.field8960 != null && class481.method2658((byte) -6, arg2, this.field5256)) {
            this.field5227 = arg1.method3544((byte) 113);
        }
        if (arg1.field8993 != null && class455.method2569((byte) 67, this.field5256, arg2)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field5222; var61++) {
                int var65 = arg1.field8993[var8[var61]];
                if (var65 >= 0) {
                    int var10002 = var60[var65]++;
                    if (var59 < var65) {
                        var59 = var65;
                    }
                }
            }
            this.field5244 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field5244[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field5222; var63++) {
                int var64 = arg1.field8993[var8[var63]];
                if (var64 >= 0) {
                    this.field5244[var64][var60[var64]++] = var63;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIIII)Z", line = 3453)
    private final boolean method2318(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5231++;
        if (arg7 < arg1 && arg4 > arg7 && arg5 > arg7) {
            return false;
        } else if (arg7 > arg1 && arg7 > arg4 && arg7 > arg5) {
            return false;
        } else if (arg3 != 7) {
            return true;
        } else if (arg2 < arg8 && arg6 > arg2 && arg0 > arg2) {
            return false;
        } else {
            return arg2 <= arg8 || arg2 <= arg6 || arg2 <= arg0;
        }
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "()V", line = 3482)
    public final void method818() {
        field5276++;
        if (this.field5287 <= 0 || this.field5257 <= 0) {
            return;
        }
        this.method2316(false, (byte) 51);
        if ((this.field5202 & 0x10) == 0 && this.field5251.field7281 == null) {
            this.method2322(-118, false);
        }
        this.method2317(-1);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lq;Lht;I)V", line = 3497)
    public final void method827(class151 arg0, class108 arg1, int arg2) {
        field5295++;
        if (this.field5287 == 0) {
            return;
        }
        class25 var4 = this.field5248.field8697;
        class25 var5 = (class25) arg0;
        if (!this.field5268) {
            this.method2320(32076);
        }
        class30.field450 = var4.field298 * var5.field313 + var4.field313 * var5.field309 + var4.field291 * var5.field289;
        class166.field2086 = var4.field298 * var5.field293 + var4.field313 * var5.field288 + var4.field291 * var5.field306 + var4.field293;
        float var6 = (float) this.field5258 * class30.field450 + class166.field2086;
        float var7 = (float) this.field5230 * class30.field450 + class166.field2086;
        float var8;
        float var9;
        if ((var7 < var6)) {
            var9 = (float) this.field5190 + var6;
            var8 = (float) (-this.field5190) + var7;
        } else {
            var8 = (float) (-this.field5190) + var6;
            var9 = (float) this.field5190 + var7;
        }
        if ((this.field5248.field8705 <= var8) || (var9 <= (float) this.field5248.field8709)) {
            return;
        }
        class646.field9007 = var4.field296 * var5.field293 + var4.field290 * var5.field306 + var4.field289 * var5.field288 + var4.field306;
        class631.field8801 = var4.field296 * var5.field313 + var4.field290 * var5.field289 + var4.field289 * var5.field309;
        float var10 = (float) this.field5258 * class631.field8801 + class646.field9007;
        float var11 = (float) this.field5230 * class631.field8801 + class646.field9007;
        float var12;
        float var13;
        if ((var10 > var11)) {
            var12 = ((float) this.field5190 + var10) * (float) this.field5248.field8637;
            var13 = ((float) (-this.field5190) + var11) * (float) this.field5248.field8637;
        } else {
            var12 = ((float) this.field5190 + var11) * (float) this.field5248.field8637;
            var13 = ((float) (-this.field5190) + var10) * (float) this.field5248.field8637;
        }
        if ((this.field5248.field8669 <= var13 / var9) || (var12 / var9 <= this.field5248.field8711)) {
            return;
        }
        class289.field3731 = var4.field297 * var5.field293 + var4.field309 * var5.field288 + var4.field302 * var5.field306 + var4.field288;
        class40.field573 = var4.field297 * var5.field313 + var4.field309 * var5.field309 + var4.field302 * var5.field289;
        float var14 = (float) this.field5258 * class40.field573 + class289.field3731;
        float var15 = (float) this.field5230 * class40.field573 + class289.field3731;
        float var16;
        float var17;
        if (var15 < var14) {
            var16 = ((float) this.field5190 + var14) * (float) this.field5248.field8680;
            var17 = ((float) (-this.field5190) + var15) * (float) this.field5248.field8680;
        } else {
            var17 = (var14 - (float) this.field5190) * (float) this.field5248.field8680;
            var16 = ((float) this.field5190 + var15) * (float) this.field5248.field8680;
        }
        if ((var17 / var9 >= this.field5248.field8599) || (this.field5248.field8608 >= var16 / var9)) {
            return;
        }
        if (arg1 != null || this.field5204 != null) {
            class44.field617 = var4.field297 * var5.field291 + var4.field309 * var5.field302 + var4.field302 * var5.field290;
            class190.field2434 = var4.field296 * var5.field298 + var4.field290 * var5.field296 + var4.field289 * var5.field297;
            class353.field4537 = var4.field296 * var5.field291 + var4.field290 * var5.field290 + var4.field289 * var5.field302;
            class559.field7298 = var4.field298 * var5.field291 + var4.field313 * var5.field302 + var4.field291 * var5.field290;
            class296.field3884 = var4.field298 * var5.field298 + var4.field313 * var5.field297 + var4.field291 * var5.field296;
            class15.field177 = var4.field297 * var5.field298 + var4.field309 * var5.field297 + var4.field302 * var5.field296;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field5249 + this.field5219 >> 1;
            int var21 = this.field5246 + this.field5212 >> 1;
            int var22 = (int) ((float) var21 * class190.field2434 + (float) this.field5258 * class631.field8801 + (float) var20 * class353.field4537 + class646.field9007);
            int var23 = (int) ((float) var21 * class15.field177 + (float) this.field5258 * class40.field573 + (float) var20 * class44.field617 + class289.field3731);
            int var24 = (int) ((float) var21 * class296.field3884 + (float) this.field5258 * class30.field450 + (float) var20 * class559.field7298 + class166.field2086);
            if (var24 < this.field5248.field8709) {
                var18 = true;
            } else {
                arg1.field1405 = this.field5248.field8637 * var22 / var24 + this.field5248.field8639;
                arg1.field1406 = this.field5248.field8649 + (this.field5248.field8680 * var23 / var24);
            }
            int var25 = (int) ((float) var21 * class190.field2434 + (float) this.field5230 * class631.field8801 + (float) var20 * class353.field4537 + class646.field9007);
            int var26 = (int) ((float) var21 * class15.field177 + (float) this.field5230 * class40.field573 + (float) var20 * class44.field617 + class289.field3731);
            int var27 = (int) ((float) var21 * class296.field3884 + (float) this.field5230 * class30.field450 + (float) var20 * class559.field7298 + class166.field2086);
            if (var27 < this.field5248.field8709) {
                var18 = true;
            } else {
                arg1.field1407 = this.field5248.field8637 * var25 / var27 + this.field5248.field8639;
                arg1.field1403 = this.field5248.field8649 + (this.field5248.field8680 * var26 / var27);
            }
            if (var18) {
                if (var24 < this.field5248.field8709 && this.field5248.field8709 > var27) {
                    var19 = false;
                } else if (this.field5248.field8709 > var24) {
                    int var28 = (var27 - this.field5248.field8709 << 16) / (var27 - var24);
                    int var29 = var25 + ((var25 - var22) * var28 >> 16);
                    int var30 = ((var26 - var23) * var28 >> 16) + var26;
                    arg1.field1405 = this.field5248.field8637 * var29 / this.field5248.field8709 + this.field5248.field8639;
                    arg1.field1406 = this.field5248.field8649 + (this.field5248.field8680 * var30 / this.field5248.field8709);
                } else if (var27 < this.field5248.field8709) {
                    int var31 = (var24 - this.field5248.field8709 << 16) / (var24 - var27);
                    int var32 = var22 + ((var22 - var25) * var31 >> 16);
                    int var33 = var23 + ((var23 - var26) * var31 >> 16);
                    arg1.field1405 = this.field5248.field8637 * var32 / this.field5248.field8709 + this.field5248.field8639;
                    arg1.field1406 = this.field5248.field8680 * var33 / this.field5248.field8709 + this.field5248.field8649;
                }
            }
            if (var19) {
                arg1.field1404 = true;
                if (var27 < var24) {
                    arg1.field1402 = (this.field5190 + var22) * this.field5248.field8637 / var24 + this.field5248.field8639 - arg1.field1405;
                } else {
                    arg1.field1402 = (this.field5190 + var25) * this.field5248.field8637 / var27 + this.field5248.field8639 - arg1.field1407;
                }
            }
        }
        this.field5248.method3434((byte) 116);
        this.field5248.method3430(var5, -23857);
        this.method2321(-1);
        this.field5248.method3391(true);
        this.method2312((byte) 24);
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)V", line = 3700)
    public static void method2319(int arg0) {
        int var1 = -12 / ((arg0 - 36) / 34);
        field5236 = null;
        field5286 = null;
    }

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "(I)V", line = 3721)
    private final void method2320(int arg0) {
        field5278++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field5232; var10++) {
            int var11 = this.field5198[var10];
            int var12 = this.field5209[var10];
            int var13 = this.field5235[var10];
            if (var11 < var2) {
                var2 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var13 > var7) {
                var7 = var13;
            }
            if (var4 > var13) {
                var4 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var8 < var14) {
                var8 = var14;
            }
            int var15 = var12 * var12 + (var11 * var11 + (var13 * var13));
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field5246 = (short) var4;
        this.field5212 = (short) var7;
        this.field5249 = (short) var2;
        this.field5258 = (short) var3;
        if (arg0 != 32076) {
            return;
        }
        this.field5219 = (short) var5;
        this.field5230 = (short) var6;
        this.field5190 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        Math.sqrt((double) var9);
        this.field5268 = true;
    }

    @OriginalMember(owner = "client!mf", name = "va", descriptor = "(I)V", line = 3802)
    public final void method815(int arg0) {
        field5290++;
        if (this.field5289 != null) {
            this.field5289.field5324 = null;
        }
        this.field5237 = (short) arg0;
        if (this.field5284 != null) {
            this.field5284.field5324 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "()I", line = 3820)
    public final int method796() {
        field5252++;
        return this.field5283;
    }

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "(I)V", line = 3829)
    private final void method2321(int arg0) {
        if (arg0 != -1) {
            this.field5246 = -66;
        }
        field5206++;
        if (this.field5257 == 0) {
            return;
        }
        if (this.field5202 != 0) {
            this.method2316(true, (byte) 51);
        }
        this.method2316(false, (byte) 51);
        if (this.field5251 != null) {
            if (this.field5251.field7281 == null) {
                this.method2322(-104, ~(this.field5202 & 0x10) != -1);
            }
            if (this.field5251.field7281 != null) {
                this.field5248.method3425(this.field5284 != null, 99);
                this.field5248.method3420(this.field5289, this.field5191, true, this.field5284, this.field5241);
                int var2 = this.field5201.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field5201[var3];
                    int var5 = this.field5201[var3 + 1];
                    int var6 = this.field5189[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field5248.method3414(var6, (byte) 101, this.field5284 != null);
                    this.field5248.method3464((var5 - var4) * 3, 4, this.field5251.field7281, -103, var4 * 3);
                }
            }
        }
        this.method2317(arg0);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lq;)V", line = 3890)
    public final void method819(class151 arg0) {
        field5234++;
        class25 var2 = (class25) arg0;
        if (this.field5224 != null) {
            for (int var3 = 0; var3 < this.field5224.length; var3++) {
                class574 var4 = this.field5224[var3];
                class574 var5 = var4;
                if (var4.field7465 != null) {
                    var5 = var4.field7465;
                }
                var5.field7470 = (int) ((float) this.field5235[var4.field7464] * var2.field296 + (float) this.field5209[var4.field7464] * var2.field289 + (float) this.field5198[var4.field7464] * var2.field290 + var2.field306);
                var5.field7472 = (int) ((float) this.field5235[var4.field7464] * var2.field297 + (float) this.field5209[var4.field7464] * var2.field309 + (float) this.field5198[var4.field7464] * var2.field302 + var2.field288);
                var5.field7466 = (int) ((float) this.field5235[var4.field7464] * var2.field298 + (float) this.field5209[var4.field7464] * var2.field313 + (float) this.field5198[var4.field7464] * var2.field291 + var2.field293);
                var5.field7483 = (int) ((float) this.field5235[var4.field7474] * var2.field296 + (float) this.field5209[var4.field7474] * var2.field289 + (float) this.field5198[var4.field7474] * var2.field290 + var2.field306);
                var5.field7480 = (int) ((float) this.field5235[var4.field7474] * var2.field297 + (float) this.field5209[var4.field7474] * var2.field309 + (float) this.field5198[var4.field7474] * var2.field302 + var2.field288);
                var5.field7475 = (int) ((float) this.field5235[var4.field7474] * var2.field298 + (float) this.field5209[var4.field7474] * var2.field313 + (float) this.field5198[var4.field7474] * var2.field291 + var2.field293);
                var5.field7467 = (int) ((float) this.field5235[var4.field7479] * var2.field296 + (float) this.field5209[var4.field7479] * var2.field289 + (float) this.field5198[var4.field7479] * var2.field290 + var2.field306);
                var5.field7471 = (int) ((float) this.field5235[var4.field7479] * var2.field297 + (float) this.field5209[var4.field7479] * var2.field309 + (float) this.field5198[var4.field7479] * var2.field302 + var2.field288);
                var5.field7468 = (int) ((float) this.field5235[var4.field7479] * var2.field298 + (float) this.field5209[var4.field7479] * var2.field313 + (float) this.field5198[var4.field7479] * var2.field291 + var2.field293);
            }
        }
        if (this.field5297 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field5297.length; var6++) {
            class32 var7 = this.field5297[var6];
            class32 var8 = var7;
            if (var7.field478 != null) {
                var8 = var7.field478;
            }
            if (var7.field472 == null) {
                var7.field472 = var2.method131();
            } else {
                var7.field472.method133(var2);
            }
            var8.field470 = (int) ((float) this.field5235[var7.field482] * var2.field296 + (float) this.field5209[var7.field482] * var2.field289 + (float) this.field5198[var7.field482] * var2.field290 + var2.field306);
            var8.field475 = (int) ((float) this.field5235[var7.field482] * var2.field297 + (float) this.field5209[var7.field482] * var2.field309 + (float) this.field5198[var7.field482] * var2.field302 + var2.field288);
            var8.field479 = (int) ((float) this.field5235[var7.field482] * var2.field298 + (float) this.field5209[var7.field482] * var2.field313 + (float) this.field5198[var7.field482] * var2.field291 + var2.field293);
        }
    }

    @OriginalMember(owner = "client!mf", name = "UA", descriptor = "(SS)V", line = 3956)
    public final void method829(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field5222; var3++) {
            if (this.field5220[var3] == arg0) {
                this.field5220[var3] = arg1;
            }
        }
        field5188++;
        if (this.field5204 != null) {
            for (int var4 = 0; var4 < this.field5195; var4++) {
                class693 var5 = this.field5204[var4];
                class183 var6 = this.field5217[var4];
                var6.field2351 = class505.field6642[this.field5220[var5.field9477] & 0xFFFF] & 0xFFFFFF | var6.field2351 & 0xFF000000;
            }
        }
        if (this.field5289 != null) {
            this.field5289.field5324 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "ua", descriptor = "(IIII)V", line = 4006)
    public final void method798(int arg0, int arg1, int arg2, int arg3) {
        field5254++;
        if (arg0 == 0) {
            class39.field552 = 0;
            class562.field7335 = 0;
            class150.field1928 = 0;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field5232; var6++) {
                class150.field1928 += this.field5198[var6];
                class39.field552 += this.field5209[var6];
                var5++;
                class562.field7335 += this.field5235[var6];
            }
            if (var5 <= 0) {
                class150.field1928 = arg1;
                class562.field7335 = arg3;
                class39.field552 = arg2;
            } else {
                class39.field552 = class39.field552 / var5 + arg2;
                class150.field1928 = class150.field1928 / var5 + arg1;
                class562.field7335 = class562.field7335 / var5 + arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field5232; var7++) {
                this.field5198[var7] += arg1;
                this.field5209[var7] += arg2;
                this.field5235[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field5232; var8++) {
                this.field5198[var8] -= class150.field1928;
                this.field5209[var8] -= class39.field552;
                this.field5235[var8] -= class562.field7335;
                if (arg3 != 0) {
                    int var9 = class237.field3193[arg3];
                    int var10 = class237.field3196[arg3];
                    int var11 = this.field5198[var8] * var10 + (this.field5209[var8] * var9 + 16383) >> 14;
                    this.field5209[var8] = this.field5209[var8] * var10 + 16383 - (this.field5198[var8] * var9) >> 14;
                    this.field5198[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class237.field3193[arg1];
                    int var13 = class237.field3196[arg1];
                    int var14 = this.field5209[var8] * var13 + (16383 - (this.field5235[var8] * var12)) >> 14;
                    this.field5235[var8] = this.field5209[var8] * var12 + this.field5235[var8] * var13 + 16383 >> 14;
                    this.field5209[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class237.field3193[arg2];
                    int var16 = class237.field3196[arg2];
                    int var17 = this.field5235[var8] * var15 + this.field5198[var8] * var16 + 16383 >> 14;
                    this.field5235[var8] = this.field5235[var8] * var16 + 16383 - (this.field5198[var8] * var15) >> 14;
                    this.field5198[var8] = var17;
                }
                this.field5198[var8] += class150.field1928;
                this.field5209[var8] += class39.field552;
                this.field5235[var8] += class562.field7335;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field5232; var18++) {
                this.field5198[var18] -= class150.field1928;
                this.field5209[var18] -= class39.field552;
                this.field5235[var18] -= class562.field7335;
                this.field5198[var18] = this.field5198[var18] * arg1 / 128;
                this.field5209[var18] = this.field5209[var18] * arg2 / 128;
                this.field5235[var18] = this.field5235[var18] * arg3 / 128;
                this.field5198[var18] += class150.field1928;
                this.field5209[var18] += class39.field552;
                this.field5235[var18] += class562.field7335;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field5222; var19++) {
                int var23 = (this.field5275[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field5275[var19] = (byte) var23;
            }
            if (this.field5289 != null) {
                this.field5289.field5324 = null;
            }
            if (this.field5204 != null) {
                for (int var20 = 0; var20 < this.field5195; var20++) {
                    class693 var21 = this.field5204[var20];
                    class183 var22 = this.field5217[var20];
                    var22.field2351 = 255 - (this.field5275[var21.field9477] & 0xFF) << 24 | var22.field2351 & 0xFFFFFF;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field5222; var24++) {
                int var28 = this.field5220[var24] & 0xFFFF;
                int var29 = (var28 & 0xFF71) >> 10;
                int var30 = (var28 & 0x383) >> 7;
                int var31 = arg2 / 4 + var30;
                int var32 = var29 + arg1 & 0x3F;
                int var33 = var28 & 0x7F;
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 7) {
                    var31 = 7;
                }
                int var34 = arg3 + var33;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field5220[var24] = (short) class131.method954(class131.method954(var31 << 7, var32 << 10), var34);
            }
            if (this.field5289 != null) {
                this.field5289.field5324 = null;
            }
            if (this.field5204 != null) {
                for (int var25 = 0; var25 < this.field5195; var25++) {
                    class693 var26 = this.field5204[var25];
                    class183 var27 = this.field5217[var25];
                    var27.field2351 = class505.field6642[this.field5220[var26.field9477] & 0xFFFF] & 0xFFFFFF | var27.field2351 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field5195; var35++) {
                class183 var36 = this.field5217[var35];
                var36.field2349 += arg1;
                var36.field2348 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field5195; var37++) {
                class183 var38 = this.field5217[var37];
                var38.field2344 = var38.field2344 * arg1 >> 7;
                var38.field2356 = var38.field2356 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field5195; var39++) {
                class183 var40 = this.field5217[var39];
                var40.field2343 = var40.field2343 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BIZ)Lba;", line = 4315)
    public final class107 method479(byte arg0, int arg1, boolean arg2) {
        field5255++;
        class408 var4;
        class408 var5;
        if (arg0 == 1) {
            var4 = this.field5248.field8605;
            var5 = this.field5248.field8666;
        } else if (arg0 == 2) {
            var5 = this.field5248.field8651;
            var4 = this.field5248.field8623;
        } else if (arg0 == 3) {
            var4 = this.field5248.field8627;
            var5 = this.field5248.field8674;
        } else if (arg0 == 4) {
            var5 = this.field5248.field8620;
            var4 = this.field5248.field8695;
        } else if (arg0 == 5) {
            var5 = this.field5248.field8628;
            var4 = this.field5248.field8703;
        } else {
            var4 = var5 = new class408(this.field5248);
        }
        return this.method2324(arg1, var5, arg0 != 0, (byte) -121, var4, arg2);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILq;Z)Z", line = 4364)
    public final boolean method832(int arg0, int arg1, class151 arg2, boolean arg3) {
        field5293++;
        class25 var5 = (class25) arg2;
        class25 var6 = this.field5248.field8697;
        float var7 = var5.field293 * var6.field296 + var5.field306 * var6.field290 + var5.field288 * var6.field289 + var6.field306;
        float var8 = var5.field293 * var6.field297 + var5.field306 * var6.field302 + var5.field288 * var6.field309 + var6.field288;
        class559.field7298 = var5.field291 * var6.field298 + var5.field302 * var6.field313 + var5.field290 * var6.field291;
        class40.field573 = var5.field313 * var6.field297 + var5.field309 * var6.field309 + var5.field289 * var6.field302;
        class190.field2434 = var5.field298 * var6.field296 + var5.field297 * var6.field289 + var5.field296 * var6.field290;
        class15.field177 = var5.field298 * var6.field297 + var5.field297 * var6.field309 + var5.field296 * var6.field302;
        class631.field8801 = var5.field313 * var6.field296 + var5.field309 * var6.field289 + var5.field289 * var6.field290;
        class353.field4537 = var5.field291 * var6.field296 + var5.field302 * var6.field289 + var5.field290 * var6.field290;
        class44.field617 = var5.field291 * var6.field297 + var5.field302 * var6.field309 + var5.field290 * var6.field302;
        float var9 = var5.field293 * var6.field298 + var5.field306 * var6.field291 + var5.field288 * var6.field313 + var6.field293;
        class30.field450 = var5.field313 * var6.field298 + var5.field309 * var6.field313 + var5.field289 * var6.field291;
        class296.field3884 = var5.field298 * var6.field298 + var5.field297 * var6.field313 + var5.field296 * var6.field291;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field5248.field8637;
        int var16 = this.field5248.field8680;
        if (!this.field5268) {
            this.method2320(32076);
        }
        class497.field6552[0] = this.field5249;
        class581.field7912[0] = this.field5258;
        class181.field2233[0] = this.field5246;
        class497.field6552[1] = this.field5219;
        class581.field7912[1] = this.field5258;
        class181.field2233[1] = this.field5246;
        class497.field6552[2] = this.field5249;
        class581.field7912[2] = this.field5230;
        class497.field6552[3] = this.field5219;
        class181.field2233[2] = this.field5246;
        class581.field7912[3] = this.field5230;
        class181.field2233[3] = this.field5246;
        class497.field6552[4] = this.field5249;
        class581.field7912[4] = this.field5258;
        class181.field2233[4] = this.field5212;
        class497.field6552[5] = this.field5219;
        class581.field7912[5] = this.field5258;
        class497.field6552[6] = this.field5249;
        class181.field2233[5] = this.field5212;
        class581.field7912[6] = this.field5230;
        class181.field2233[6] = this.field5212;
        class497.field6552[7] = this.field5219;
        class581.field7912[7] = this.field5230;
        class181.field2233[7] = this.field5212;
        for (int var17 = 0; var17 < 8; var17++) {
            float var38 = (float) class497.field6552[var17];
            float var39 = (float) class181.field2233[var17];
            float var40 = (float) class581.field7912[var17];
            float var41 = class296.field3884 * var39 + class559.field7298 * var38 + class30.field450 * var40 + var9;
            float var42 = class190.field2434 * var39 + class631.field8801 * var40 + class353.field4537 * var38 + var7;
            float var43 = class15.field177 * var39 + class44.field617 * var38 + class40.field573 * var40 + var8;
            if (var41 >= (float) this.field5248.field8709) {
                float var44 = (float) var15 * var42 / var41 + (float) this.field5248.field8639;
                if (var44 > var12) {
                    var12 = var44;
                }
                if (var11 > var44) {
                    var11 = var44;
                }
                float var45 = (float) var16 * var43 / var41 + (float) this.field5248.field8649;
                if (var13 > var45) {
                    var13 = var45;
                }
                var10 = true;
                if (var45 > var14) {
                    var14 = var45;
                }
            }
        }
        if (var10 && var11 < (float) arg0 && (float) arg0 < var12 && var13 < (float) arg1 && var14 > (float) arg1) {
            if (arg3) {
                return true;
            }
            if (this.field5287 > this.field5248.field8718.length) {
                this.field5248.field8718 = new int[this.field5287];
                this.field5248.field8717 = new int[this.field5287];
            }
            int[] var18 = this.field5248.field8718;
            int[] var19 = this.field5248.field8717;
            for (int var20 = 0; var20 < this.field5232; var20++) {
                float var22 = (float) this.field5198[var20];
                float var23 = (float) this.field5235[var20];
                float var24 = (float) this.field5209[var20];
                float var25 = class15.field177 * var23 + class44.field617 * var22 + class40.field573 * var24 + var8;
                float var26 = class296.field3884 * var23 + class559.field7298 * var22 + class30.field450 * var24 + var9;
                float var27 = class190.field2434 * var23 + class631.field8801 * var24 + class353.field4537 * var22 + var7;
                if (((float) this.field5248.field8709 <= var26)) {
                    int var32 = (int) ((float) var15 * var27 / var26 + (float) this.field5248.field8639);
                    int var33 = (int) ((float) var16 * var25 / var26 + (float) this.field5248.field8649);
                    int var34 = this.field5192[var20];
                    int var35 = this.field5192[var20 + 1];
                    for (int var36 = var34; var36 < var35; var36++) {
                        int var37 = this.field5207[var36] - 1;
                        if (var37 == -1) {
                            break;
                        }
                        var18[var37] = var32;
                        var19[var37] = var33;
                    }
                } else {
                    int var28 = this.field5192[var20];
                    int var29 = this.field5192[var20 + 1];
                    for (int var30 = var28; var30 < var29; var30++) {
                        int var31 = this.field5207[var30] - 1;
                        if (var31 == -1) {
                            break;
                        }
                        var18[this.field5207[var30] - 1] = -999999;
                    }
                }
            }
            for (int var21 = 0; var21 < this.field5222; var21++) {
                if (var18[this.field5298[var21]] != -999999 && var18[this.field5200[var21]] != -999999 && var18[this.field5216[var21]] != -999999 && this.method2318(var18[this.field5216[var21]], var19[this.field5298[var21]], arg0, 7, var19[this.field5200[var21]], var19[this.field5216[var21]], var18[this.field5200[var21]], arg1, var18[this.field5298[var21]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mf", name = "Q", descriptor = "()Z", line = 4573)
    public final boolean method802() {
        field5265++;
        if (this.field5253 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field5272; var1++) {
            this.field5198[var1] <<= 0x4;
            this.field5209[var1] <<= 0x4;
            this.field5235[var1] <<= 0x4;
        }
        class39.field552 = 0;
        class150.field1928 = 0;
        class562.field7335 = 0;
        return true;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lba;IIIZ)V", line = 4605)
    public final void method831(class107 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field5215++;
        class408 var6 = (class408) arg0;
        if (this.field5222 == 0 || var6.field5222 == 0) {
            return;
        }
        int var7 = var6.field5232;
        int[] var8 = var6.field5198;
        int[] var9 = var6.field5209;
        int[] var10 = var6.field5235;
        short[] var11 = var6.field5274;
        short[] var12 = var6.field5296;
        short[] var13 = var6.field5281;
        byte[] var14 = var6.field5194;
        byte[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field5260 == null) {
            var15 = null;
            var17 = null;
            var16 = null;
            var18 = null;
        } else {
            var15 = this.field5260.field3477;
            var16 = this.field5260.field3481;
            var17 = this.field5260.field3478;
            var18 = this.field5260.field3479;
        }
        short[] var19;
        short[] var20;
        byte[] var21;
        short[] var22;
        if (var6.field5260 == null) {
            var22 = null;
            var21 = null;
            var20 = null;
            var19 = null;
        } else {
            var19 = var6.field5260.field3478;
            var20 = var6.field5260.field3479;
            var21 = var6.field5260.field3477;
            var22 = var6.field5260.field3481;
        }
        int[] var23 = var6.field5192;
        short[] var24 = var6.field5207;
        if (!var6.field5268) {
            var6.method2320(32076);
        }
        short var25 = var6.field5258;
        short var26 = var6.field5230;
        short var27 = var6.field5249;
        short var28 = var6.field5219;
        short var29 = var6.field5246;
        short var30 = var6.field5212;
        for (int var31 = 0; var31 < this.field5232; var31++) {
            int var32 = this.field5209[var31] - arg2;
            if (var25 <= var32 && var32 <= var26) {
                int var33 = this.field5198[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field5235[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field5192[var31];
                        int var37 = this.field5192[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field5207[var38] - 1;
                            if (var35 == -1 || this.field5194[var35] != 0) {
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
                                        if (var17 == null) {
                                            this.field5260 = new class258();
                                            var17 = this.field5260.field3478 = class693.method3773(-27689, this.field5274);
                                            var16 = this.field5260.field3481 = class693.method3773(-27689, this.field5296);
                                            var18 = this.field5260.field3479 = class693.method3773(-27689, this.field5281);
                                            var15 = this.field5260.field3477 = class646.method3556(this.field5194, true);
                                        }
                                        if (var19 == null) {
                                            class258 var44 = var6.field5260 = new class258();
                                            var19 = var44.field3478 = class693.method3773(-27689, var11);
                                            var22 = var44.field3481 = class693.method3773(-27689, var12);
                                            var20 = var44.field3479 = class693.method3773(-27689, var13);
                                            var21 = var44.field3477 = class646.method3556(var14, true);
                                        }
                                        short var45 = this.field5274[var35];
                                        short var46 = this.field5296[var35];
                                        short var47 = this.field5281[var35];
                                        byte var48 = this.field5194[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var21[var52] != 0) {
                                                var19[var52] += var45;
                                                var22[var52] += var46;
                                                var20[var52] += var47;
                                                var21[var52] += var48;
                                            }
                                        }
                                        short var53 = var12[var41];
                                        short var54 = var11[var41];
                                        int var55 = this.field5192[var31];
                                        int var56 = this.field5192[var31 + 1];
                                        short var57 = var13[var41];
                                        byte var58 = var14[var41];
                                        for (int var59 = var55; var59 < var56; var59++) {
                                            int var60 = this.field5207[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var15[var60] != 0) {
                                                var17[var60] += var54;
                                                var16[var60] += var53;
                                                var18[var60] += var57;
                                                var15[var60] += var58;
                                            }
                                        }
                                        if (this.field5284 == null && this.field5289 != null) {
                                            this.field5289.field5324 = null;
                                        }
                                        if (this.field5284 != null) {
                                            this.field5284.field5324 = null;
                                        }
                                        if (var6.field5284 == null && var6.field5289 != null) {
                                            var6.field5289.field5324 = null;
                                        }
                                        if (var6.field5284 != null) {
                                            var6.field5284.field5324 = null;
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

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lq;Lht;II)V", line = 4877)
    public final void method792(class151 arg0, class108 arg1, int arg2, int arg3) {
        field5262++;
        if (this.field5287 == 0) {
            return;
        }
        class25 var5 = this.field5248.field8697;
        class25 var6 = (class25) arg0;
        if (!this.field5268) {
            this.method2320(32076);
        }
        class30.field450 = var5.field298 * var6.field313 + var5.field313 * var6.field309 + var5.field291 * var6.field289;
        class166.field2086 = var5.field298 * var6.field293 + var5.field313 * var6.field288 + var5.field291 * var6.field306 + var5.field293;
        float var7 = (float) this.field5258 * class30.field450 + class166.field2086;
        float var8 = (float) this.field5230 * class30.field450 + class166.field2086;
        float var9;
        float var10;
        if (var7 > var8) {
            var9 = (float) (-this.field5190) + var8;
            var10 = (float) this.field5190 + var7;
        } else {
            var9 = (float) (-this.field5190) + var7;
            var10 = (float) this.field5190 + var8;
        }
        if ((this.field5248.field8663 <= var9) || (var10 <= (float) this.field5248.field8709)) {
            return;
        }
        class631.field8801 = var5.field296 * var6.field313 + var5.field290 * var6.field289 + var5.field289 * var6.field309;
        class646.field9007 = var5.field296 * var6.field293 + var5.field290 * var6.field306 + var5.field289 * var6.field288 + var5.field306;
        float var11 = (float) this.field5258 * class631.field8801 + class646.field9007;
        float var12 = (float) this.field5230 * class631.field8801 + class646.field9007;
        float var13;
        float var14;
        if (var11 > var12) {
            var13 = ((float) this.field5190 + var11) * (float) this.field5248.field8637;
            var14 = ((float) (-this.field5190) + var12) * (float) this.field5248.field8637;
        } else {
            var13 = ((float) this.field5190 + var12) * (float) this.field5248.field8637;
            var14 = ((float) (-this.field5190) + var11) * (float) this.field5248.field8637;
        }
        if ((var14 / (float) arg2 >= this.field5248.field8669) || (var13 / (float) arg2 <= this.field5248.field8711)) {
            return;
        }
        class40.field573 = var5.field297 * var6.field313 + var5.field309 * var6.field309 + var5.field302 * var6.field289;
        class289.field3731 = var5.field297 * var6.field293 + var5.field309 * var6.field288 + var5.field302 * var6.field306 + var5.field288;
        float var15 = (float) this.field5258 * class40.field573 + class289.field3731;
        float var16 = (float) this.field5230 * class40.field573 + class289.field3731;
        float var17;
        float var18;
        if (var16 < var15) {
            var17 = ((float) (-this.field5190) + var16) * (float) this.field5248.field8680;
            var18 = ((float) this.field5190 + var15) * (float) this.field5248.field8680;
        } else {
            var17 = ((float) (-this.field5190) + var15) * (float) this.field5248.field8680;
            var18 = ((float) this.field5190 + var16) * (float) this.field5248.field8680;
        }
        if ((var17 / (float) arg2 >= this.field5248.field8599) || (var18 / (float) arg2 <= this.field5248.field8608)) {
            return;
        }
        if (arg1 != null || this.field5204 != null) {
            class296.field3884 = var5.field298 * var6.field298 + var5.field313 * var6.field297 + var5.field291 * var6.field296;
            class190.field2434 = var5.field296 * var6.field298 + var5.field290 * var6.field296 + var5.field289 * var6.field297;
            class44.field617 = var5.field297 * var6.field291 + var5.field309 * var6.field302 + var5.field302 * var6.field290;
            class15.field177 = var5.field297 * var6.field298 + var5.field309 * var6.field297 + var5.field302 * var6.field296;
            class559.field7298 = var5.field298 * var6.field291 + var5.field313 * var6.field302 + var5.field291 * var6.field290;
            class353.field4537 = var5.field296 * var6.field291 + var5.field290 * var6.field290 + var5.field289 * var6.field302;
        }
        if (arg1 != null) {
            int var19 = this.field5249 + this.field5219 >> 1;
            int var20 = this.field5246 + this.field5212 >> 1;
            int var21 = (int) ((float) var20 * class190.field2434 + (float) this.field5258 * class631.field8801 + (float) var19 * class353.field4537 + class646.field9007);
            int var22 = (int) ((float) var20 * class15.field177 + (float) this.field5258 * class40.field573 + (float) var19 * class44.field617 + class289.field3731);
            int var23 = (int) ((float) var20 * class296.field3884 + (float) this.field5258 * class30.field450 + (float) var19 * class559.field7298 + class166.field2086);
            int var24 = (int) ((float) var20 * class190.field2434 + (float) this.field5230 * class631.field8801 + (float) var19 * class353.field4537 + class646.field9007);
            int var25 = (int) ((float) var20 * class15.field177 + (float) this.field5230 * class40.field573 + (float) var19 * class44.field617 + class289.field3731);
            arg1.field1405 = this.field5248.field8637 * var21 / arg2 + this.field5248.field8639;
            int var26 = (int) ((float) var20 * class296.field3884 + (float) this.field5230 * class30.field450 + (float) var19 * class559.field7298 + class166.field2086);
            arg1.field1407 = this.field5248.field8637 * var24 / arg2 + this.field5248.field8639;
            arg1.field1406 = this.field5248.field8680 * var22 / arg2 + this.field5248.field8649;
            arg1.field1403 = this.field5248.field8680 * var25 / arg2 + this.field5248.field8649;
            if (var23 < this.field5248.field8709 && var26 < this.field5248.field8709) {
                arg1.field1404 = true;
                arg1.field1402 = (this.field5190 + var21) * this.field5248.field8637 / arg2 + this.field5248.field8639 - arg1.field1405;
            }
        }
        this.field5248.method3413((byte) -9, (float) arg2);
        this.field5248.method3458(-69);
        this.field5248.method3430(var6, -23857);
        this.method2321(-1);
        this.field5248.method3391(true);
        this.method2312((byte) 24);
    }

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "(I)V", line = 5031)
    public final void method822(int arg0) {
        field5210++;
        int var2 = class237.field3193[arg0];
        int var3 = class237.field3196[arg0];
        for (int var4 = 0; var4 < this.field5232; var4++) {
            int var5 = this.field5235[var4] * var2 + this.field5198[var4] * var3 >> 14;
            this.field5235[var4] = this.field5235[var4] * var3 - (this.field5198[var4] * var2) >> 14;
            this.field5198[var4] = var5;
        }
        if (this.field5241 != null) {
            this.field5241.field5324 = null;
        }
        this.field5268 = false;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZ)V", line = 5061)
    private final void method2322(int arg0, boolean arg1) {
        if (this.field5257 * 6 > this.field5248.field8654.field5393.length) {
            this.field5248.field8654 = new class703((this.field5257 + 100) * 6);
        } else {
            this.field5248.field8654.field5367 = 0;
        }
        field5245++;
        class703 var3 = this.field5248.field8654;
        if (this.field5248.field8631) {
            for (int var4 = 0; var4 < this.field5257; var4++) {
                var3.method2386(this.field5298[var4], 1103587288);
                var3.method2386(this.field5200[var4], 1103587288);
                var3.method2386(this.field5216[var4], 1103587288);
            }
        } else {
            for (int var5 = 0; var5 < this.field5257; var5++) {
                var3.method2356(this.field5298[var5], -18174);
                var3.method2356(this.field5200[var5], -18174);
                var3.method2356(this.field5216[var5], -18174);
            }
        }
        if (var3.field5367 == 0) {
            return;
        }
        int var6 = -84 / ((arg0 + 39) / 37);
        if (arg1) {
            if (this.field5193 == null) {
                this.field5193 = this.field5248.method3470(5123, (byte) 73, true, var3.field5393, var3.field5367);
            } else {
                this.field5193.method574(5123, -18622, var3.field5393, var3.field5367);
            }
            this.field5251.field7281 = this.field5193;
        } else {
            this.field5251.field7281 = this.field5248.method3470(5123, (byte) 41, false, var3.field5393, var3.field5367);
        }
        if (!arg1) {
            this.field5225 = true;
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V", line = 5127)
    public static final void method2323(byte arg0) {
        int var1 = -82 / ((-arg0 - 52) / 48);
        field5226++;
        if (class520.field6799 == null) {
            return;
        }
        class509.field6675.method2100((byte) -123);
        class459.method2584();
        class107.method830(116);
        class418.method2408(-93);
        class35.method275(18989);
        class107.method812(2904);
        if (class625.field8743 != null) {
            class625.field8743.method2621(0);
        }
        class479.method2654(false);
        class705.method3852(0);
        class287.method1705((byte) 20);
        class122.method904((byte) -7);
        class495.method2697((byte) -60, false);
        for (int var2 = 0; var2 < 2048; var2++) {
            class193 var6 = class592.field8019[var2];
            if (var6 != null) {
                var6.field3033 = null;
                for (int var7 = 0; var7 < var6.field3035.length; var7++) {
                    var6.field3035[var7] = null;
                }
            }
        }
        for (int var3 = 0; var3 < class480.field6406; var3++) {
            class532 var4 = class93.field1230[var3].field3131;
            if (var4 != null) {
                for (int var5 = 0; var5 < var4.field3035.length; var5++) {
                    var4.field3035[var5] = null;
                }
            }
        }
        class355.field4580 = null;
        class125.field1623 = null;
        class520.field6799.method392((byte) -39);
        class520.field6799 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILmf;ZBLmf;Z)Lba;", line = 5203)
    private final class107 method2324(int arg0, class408 arg1, boolean arg2, byte arg3, class408 arg4, boolean arg5) {
        arg4.field5195 = this.field5195;
        arg4.field5222 = this.field5222;
        arg4.field5257 = this.field5257;
        arg4.field5232 = this.field5232;
        arg4.field5256 = this.field5256;
        arg4.field5266 = this.field5266;
        arg4.field5287 = this.field5287;
        arg4.field5202 = 0;
        field5288++;
        arg4.field5272 = this.field5272;
        arg4.field5283 = arg0;
        arg4.field5237 = this.field5237;
        boolean var7 = class376.method2153(-83, this.field5256, arg0);
        boolean var8 = class493.method2692(this.field5256, true, arg0);
        boolean var9 = class607.method3300(arg0, this.field5256, 52);
        boolean var10 = var9 | var7 | var8;
        if (var10) {
            if (!var7) {
                arg4.field5198 = this.field5198;
            } else if (arg1.field5198 == null || this.field5272 > arg1.field5198.length) {
                arg4.field5198 = arg1.field5198 = new int[this.field5272];
            } else {
                arg4.field5198 = arg1.field5198;
            }
            if (!var8) {
                arg4.field5209 = this.field5209;
            } else if (arg1.field5209 == null || arg1.field5209.length < this.field5272) {
                arg4.field5209 = arg1.field5209 = new int[this.field5272];
            } else {
                arg4.field5209 = arg1.field5209;
            }
            if (!var9) {
                arg4.field5235 = this.field5235;
            } else if (arg1.field5235 == null || arg1.field5235.length < this.field5272) {
                arg4.field5235 = arg1.field5235 = new int[this.field5272];
            } else {
                arg4.field5235 = arg1.field5235;
            }
            for (int var11 = 0; var11 < this.field5272; var11++) {
                if (var7) {
                    arg4.field5198[var11] = this.field5198[var11];
                }
                if (var8) {
                    arg4.field5209[var11] = this.field5209[var11];
                }
                if (var9) {
                    arg4.field5235[var11] = this.field5235[var11];
                }
            }
        } else {
            arg4.field5198 = this.field5198;
            arg4.field5235 = this.field5235;
            arg4.field5209 = this.field5209;
        }
        if (class559.method2992((byte) -84, arg0, this.field5256)) {
            if (arg2) {
                arg4.field5202 = (byte) (arg4.field5202 | 0x1);
            }
            arg4.field5241 = arg1.field5241;
            arg4.field5241.field5324 = this.field5241.field5324;
            arg4.field5241.field5325 = this.field5241.field5325;
        } else if (class427.method2454((byte) 61, arg0, this.field5256)) {
            arg4.field5241 = this.field5241;
        } else {
            arg4.field5241 = null;
        }
        if (class353.method2027(arg0, this.field5256, (byte) 88)) {
            if (arg1.field5220 == null || this.field5222 > arg1.field5220.length) {
                arg4.field5220 = arg1.field5220 = new short[this.field5222];
            } else {
                arg4.field5220 = arg1.field5220;
            }
            for (int var12 = 0; var12 < this.field5222; var12++) {
                arg4.field5220[var12] = this.field5220[var12];
            }
        } else {
            arg4.field5220 = this.field5220;
        }
        if (class484.method2667(arg0, -13967, this.field5256)) {
            if (arg1.field5275 == null || arg1.field5275.length < this.field5222) {
                arg4.field5275 = arg1.field5275 = new byte[this.field5222];
            } else {
                arg4.field5275 = arg1.field5275;
            }
            for (int var13 = 0; var13 < this.field5222; var13++) {
                arg4.field5275[var13] = this.field5275[var13];
            }
        } else {
            arg4.field5275 = this.field5275;
        }
        if (class337.method1932(-1, arg0, this.field5256)) {
            if (arg2) {
                arg4.field5202 = (byte) (arg4.field5202 | 0x2);
            }
            arg4.field5289 = arg1.field5289;
            arg4.field5289.field5324 = this.field5289.field5324;
            arg4.field5289.field5325 = this.field5289.field5325;
        } else if (class427.method2453(2048, arg0, this.field5256)) {
            arg4.field5289 = this.field5289;
        } else {
            arg4.field5289 = null;
        }
        if (class247.method1555(this.field5256, arg0, (byte) 104)) {
            if (arg1.field5274 == null || this.field5287 > arg1.field5274.length) {
                int var14 = this.field5287;
                arg4.field5296 = arg1.field5296 = new short[var14];
                arg4.field5274 = arg1.field5274 = new short[var14];
                arg4.field5281 = arg1.field5281 = new short[var14];
            } else {
                arg4.field5296 = arg1.field5296;
                arg4.field5274 = arg1.field5274;
                arg4.field5281 = arg1.field5281;
            }
            if (this.field5260 == null) {
                for (int var18 = 0; var18 < this.field5287; var18++) {
                    arg4.field5274[var18] = this.field5274[var18];
                    arg4.field5296[var18] = this.field5296[var18];
                    arg4.field5281[var18] = this.field5281[var18];
                }
            } else {
                if (arg1.field5260 == null) {
                    arg1.field5260 = new class258();
                }
                class258 var15 = arg4.field5260 = arg1.field5260;
                if (var15.field3478 == null || var15.field3478.length < this.field5287) {
                    int var16 = this.field5287;
                    var15.field3478 = new short[var16];
                    var15.field3477 = new byte[var16];
                    var15.field3481 = new short[var16];
                    var15.field3479 = new short[var16];
                }
                for (int var17 = 0; var17 < this.field5287; var17++) {
                    arg4.field5274[var17] = this.field5274[var17];
                    arg4.field5296[var17] = this.field5296[var17];
                    arg4.field5281[var17] = this.field5281[var17];
                    var15.field3478[var17] = this.field5260.field3478[var17];
                    var15.field3481[var17] = this.field5260.field3481[var17];
                    var15.field3479[var17] = this.field5260.field3479[var17];
                    var15.field3477[var17] = this.field5260.field3477[var17];
                }
            }
            arg4.field5194 = this.field5194;
        } else {
            arg4.field5260 = this.field5260;
            arg4.field5194 = this.field5194;
            arg4.field5281 = this.field5281;
            arg4.field5274 = this.field5274;
            arg4.field5296 = this.field5296;
        }
        if (class701.method3834(-99, arg0, this.field5256)) {
            if (arg2) {
                arg4.field5202 = (byte) (arg4.field5202 | 0x4);
            }
            arg4.field5284 = arg1.field5284;
            arg4.field5284.field5324 = this.field5284.field5324;
            arg4.field5284.field5325 = this.field5284.field5325;
        } else if (class447.method2541(2048, this.field5256, arg0)) {
            arg4.field5284 = this.field5284;
        } else {
            arg4.field5284 = null;
        }
        if (class57.method502((byte) 126, arg0, this.field5256)) {
            if (arg1.field5247 == null || this.field5222 > arg1.field5247.length) {
                int var19 = this.field5287;
                arg4.field5203 = arg1.field5203 = new float[var19];
                arg4.field5247 = arg1.field5247 = new float[var19];
            } else {
                arg4.field5203 = arg1.field5203;
                arg4.field5247 = arg1.field5247;
            }
            for (int var20 = 0; var20 < this.field5287; var20++) {
                arg4.field5247[var20] = this.field5247[var20];
                arg4.field5203[var20] = this.field5203[var20];
            }
        } else {
            arg4.field5247 = this.field5247;
            arg4.field5203 = this.field5203;
        }
        if (class355.method2045(1, arg0, this.field5256)) {
            if (arg2) {
                arg4.field5202 = (byte) (arg4.field5202 | 0x8);
            }
            arg4.field5191 = arg1.field5191;
            arg4.field5191.field5324 = this.field5191.field5324;
            arg4.field5191.field5325 = this.field5191.field5325;
        } else if (class247.method1553(arg0, this.field5256, -9105)) {
            arg4.field5191 = this.field5191;
        } else {
            arg4.field5191 = null;
        }
        if (class50.method447(this.field5256, 5978, arg0)) {
            if (arg1.field5298 == null || this.field5222 > arg1.field5298.length) {
                int var21 = this.field5222;
                arg4.field5298 = arg1.field5298 = new short[var21];
                arg4.field5216 = arg1.field5216 = new short[var21];
                arg4.field5200 = arg1.field5200 = new short[var21];
            } else {
                arg4.field5200 = arg1.field5200;
                arg4.field5216 = arg1.field5216;
                arg4.field5298 = arg1.field5298;
            }
            for (int var22 = 0; var22 < this.field5222; var22++) {
                arg4.field5298[var22] = this.field5298[var22];
                arg4.field5200[var22] = this.field5200[var22];
                arg4.field5216[var22] = this.field5216[var22];
            }
        } else {
            arg4.field5200 = this.field5200;
            arg4.field5216 = this.field5216;
            arg4.field5298 = this.field5298;
        }
        int var23 = 50 % ((-arg3 - 87) / 34);
        if (class596.method3231(arg0, -32310, this.field5256)) {
            if (arg2) {
                arg4.field5202 = (byte) (arg4.field5202 | 0x10);
            }
            arg4.field5251 = arg1.field5251;
            arg4.field5251.field7281 = this.field5251.field7281;
        } else if (class26.method152(this.field5256, 126, arg0)) {
            arg4.field5251 = this.field5251;
        } else {
            arg4.field5251 = null;
        }
        if (class421.method2424(arg0, (byte) 120, this.field5256)) {
            if (arg1.field5189 == null || this.field5222 > arg1.field5189.length) {
                int var24 = this.field5222;
                arg4.field5189 = arg1.field5189 = new short[var24];
            } else {
                arg4.field5189 = arg1.field5189;
            }
            for (int var25 = 0; var25 < this.field5222; var25++) {
                arg4.field5189[var25] = this.field5189[var25];
            }
        } else {
            arg4.field5189 = this.field5189;
        }
        if (!class211.method1354(-118, arg0, this.field5256)) {
            arg4.field5217 = this.field5217;
        } else if (arg1.field5217 == null || this.field5195 > arg1.field5217.length) {
            int var27 = this.field5195;
            arg4.field5217 = arg1.field5217 = new class183[var27];
            for (int var28 = 0; var28 < this.field5195; var28++) {
                arg4.field5217[var28] = this.field5217[var28].method1231(0);
            }
        } else {
            arg4.field5217 = arg1.field5217;
            for (int var26 = 0; var26 < this.field5195; var26++) {
                arg4.field5217[var26].method1226(0, this.field5217[var26]);
            }
        }
        arg4.field5297 = this.field5297;
        if (this.field5268) {
            arg4.field5219 = this.field5219;
            arg4.field5268 = true;
            arg4.field5212 = this.field5212;
            arg4.field5190 = this.field5190;
            arg4.field5246 = this.field5246;
            arg4.field5258 = this.field5258;
            arg4.field5230 = this.field5230;
            arg4.field5249 = this.field5249;
        } else {
            arg4.field5268 = false;
        }
        arg4.field5204 = this.field5204;
        arg4.field5224 = this.field5224;
        arg4.field5201 = this.field5201;
        arg4.field5229 = this.field5229;
        arg4.field5244 = this.field5244;
        arg4.field5227 = this.field5227;
        arg4.field5207 = this.field5207;
        arg4.field5199 = this.field5199;
        arg4.field5253 = this.field5253;
        arg4.field5192 = this.field5192;
        return arg4;
    }

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "()I", line = 5686)
    public final int method817() {
        field5277++;
        return this.field5266;
    }
}
