import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import java.awt.Rectangle;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class351 extends class682 {

    @OriginalMember(owner = "client!om", name = "r", descriptor = "F")
    private float field5188 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!om", name = "K", descriptor = "F")
    private float field5207 = -3.4028235E38F;

    @OriginalMember(owner = "client!om", name = "J", descriptor = "Ldc;")
    private class302 field5206 = new class302();

    @OriginalMember(owner = "client!om", name = "P", descriptor = "Lum;")
    public class528 field5212;

    @OriginalMember(owner = "client!om", name = "A", descriptor = "I")
    private int field5197;

    @OriginalMember(owner = "client!om", name = "Y", descriptor = "[[[I")
    public int[][][] field5221;

    @OriginalMember(owner = "client!om", name = "Z", descriptor = "[[F")
    private float[][] field5222;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "[[[I")
    public int[][][] field5183;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "[[[I")
    private int[][][] field5184;

    @OriginalMember(owner = "client!om", name = "O", descriptor = "[[[I")
    public int[][][] field5211;

    @OriginalMember(owner = "client!om", name = "cb", descriptor = "[[F")
    private float[][] field5225;

    @OriginalMember(owner = "client!om", name = "db", descriptor = "[[B")
    private byte[][] field5226;

    @OriginalMember(owner = "client!om", name = "G", descriptor = "[[[Lrp;")
    private class607[][][] field5203;

    @OriginalMember(owner = "client!om", name = "z", descriptor = "I")
    private int field5196;

    @OriginalMember(owner = "client!om", name = "Q", descriptor = "[[S")
    public short[][] field5213;

    @OriginalMember(owner = "client!om", name = "w", descriptor = "[[[I")
    private int[][][] field5193;

    @OriginalMember(owner = "client!om", name = "X", descriptor = "[[B")
    private byte[][] field5220;

    @OriginalMember(owner = "client!om", name = "hb", descriptor = "[[F")
    private float[][] field5230;

    @OriginalMember(owner = "client!om", name = "V", descriptor = "I")
    public int field5218;

    @OriginalMember(owner = "client!om", name = "fb", descriptor = "Lefa;")
    private class322 field5228;

    @OriginalMember(owner = "client!om", name = "W", descriptor = "Lcba;")
    private class81 field5219;

    @OriginalMember(owner = "client!om", name = "q", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5187 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!om", name = "S", descriptor = "I")
    public static int field5215 = 1;

    @OriginalMember(owner = "client!om", name = "M", descriptor = "Lvg;")
    public static class622 field5209 = new class622(13, -1);

    @OriginalMember(owner = "client!om", name = "l", descriptor = "I")
    private int field5182;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!om", name = "s", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!om", name = "t", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!om", name = "u", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!om", name = "v", descriptor = "I")
    private int field5192;

    @OriginalMember(owner = "client!om", name = "x", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!om", name = "y", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!om", name = "B", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!om", name = "C", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!om", name = "D", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!om", name = "E", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!om", name = "I", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!om", name = "L", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!om", name = "N", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!om", name = "R", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!om", name = "T", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!om", name = "U", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!om", name = "ab", descriptor = "I")
    private int field5223;

    @OriginalMember(owner = "client!om", name = "bb", descriptor = "I")
    private int field5224;

    @OriginalMember(owner = "client!om", name = "gb", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!om", name = "ib", descriptor = "Lega;")
    private class184 field5231;

    @OriginalMember(owner = "client!om", name = "jb", descriptor = "Lega;")
    private class184 field5232;

    @OriginalMember(owner = "client!om", name = "kb", descriptor = "Lcl;")
    public class314 field5233;

    @OriginalMember(owner = "client!om", name = "F", descriptor = "[I")
    public static int[] field5202;

    @OriginalMember(owner = "client!om", name = "eb", descriptor = "[Lrp;")
    private class607[] field5227;

    @OriginalMember(owner = "client!om", name = "H", descriptor = "[[[I")
    private int[][][] field5204;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method2167(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field5199;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 == null ? null : new int[var18 * 3];
        int[] var26 = arg5 == null ? null : new int[var18 * 3];
        int var27 = 0;
        for (int var28 = 0; var18 > var28; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var29];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var29];
            }
            ++var27;
            var19[var27] = arg2[var30];
            var20[var27] = arg4[var30];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var30];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var30];
            }
            ++var27;
            var19[var27] = arg2[var31];
            var20[var27] = arg4[var31];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method2184(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(III[[ZZI)V")
    public final void method2168(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.method2177(arg1, -3, arg4, arg3, arg2, arg5, arg0);
        ++field5214;
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(II)Ljava/lang/String;")
    public static final String method2169(int arg0, int arg1) {
        if (arg0 != 6711) {
            return null;
        } else {
            ++field5191;
            return (255 & arg1 >> 24) + "." + (arg1 >> 16 & 255) + "." + (arg1 >> 8 & 255) + "." + (arg1 & 255);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method2170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field5195;
        if (~this.field5224 < -1) {
            class532 var9 = this.field5212.method3007(2, this.field5192);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; var13 < 4; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method985((byte) 108, true);
                if (var14 != null) {
                    Stream var15 = this.field5212.method3038(-10641, var14);
                    if (!Stream.method2077()) {
                        for (int var16 = arg4; arg6 > var16; ++var16) {
                            int var17 = super.field9628 * var16 + arg3;
                            for (int var18 = arg3; arg5 > var18; ++var18) {
                                if (arg7[var18 - arg3][-arg4 + var16]) {
                                    short[] var19 = this.field5213[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; ~var19.length < ~var20; ++var20) {
                                            int var21 = var19[var20] & 65535;
                                            var15.method2080(var21);
                                            ++var10;
                                            if (var11 > var21) {
                                                var11 = var21;
                                            }
                                            if (~var12 > ~var21) {
                                                var12 = var21;
                                            }
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; var22 < arg6; ++var22) {
                            int var25 = super.field9628 * var22 + arg3;
                            for (int var26 = arg3; arg5 > var26; ++var26) {
                                if (arg7[-arg3 + var26][-arg4 + var22]) {
                                    short[] var27 = this.field5213[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; var27.length > var28; ++var28) {
                                            int var29 = 65535 & var27[var28];
                                            if (~var12 > ~var29) {
                                                var12 = var29;
                                            }
                                            ++var10;
                                            if (~var11 < ~var29) {
                                                var11 = var29;
                                            }
                                            var15.method2083(var29);
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method2084();
                    if (var9.method986(true)) {
                        break;
                    }
                }
            }
            if (var10 > 0) {
                this.field5212.method3005(13);
                this.field5212.method3069(5796, false);
                this.field5212.method2994(0, false);
                this.field5212.method2991(false, (byte) 124);
                this.field5212.method3056(false, (byte) 120);
                this.field5212.method3068(125, 0);
                this.field5212.method3058(false, -2, (byte) -115, false);
                this.field5212.method3011(-127, (class689) null);
                class300 var23 = this.field5212.method3014(-11433);
                float[] var24 = this.field5212.method3049(false);
                var24[15] = 1.0F;
                var24[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field5212.field7583;
                var24[8] = 0.0F;
                var24[10] = 1.0F / (this.field5207 - this.field5188);
                var24[5] = (float) arg2 / ((float) super.field9629 * 128.0F * (float) this.field5212.field7570);
                var24[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field5212.field7570) + 1.0F;
                var24[2] = 0.0F;
                var24[11] = 0.0F;
                var24[9] = 0.0F;
                var24[6] = 0.0F;
                var24[1] = 0.0F;
                var24[0] = (float) arg2 / ((float) super.field9629 * 128.0F * (float) this.field5212.field7583);
                var24[4] = 0.0F;
                var24[7] = 0.0F;
                var24[14] = -this.field5188 / (-this.field5188 + this.field5207);
                var24[3] = 0.0F;
                var23.method1873(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 76, 1.0F);
                this.field5212.method3043(0);
                this.field5212.method2989((byte) -18);
                if ((7 & this.field5218) == 0) {
                    this.field5212.method2994(0, false);
                } else {
                    this.field5212.method2994(0, true);
                    this.field5212.method787((byte) 125);
                }
                this.field5212.method767(1, false);
                this.field5212.method754(this.field5232, 0, 27910);
                this.field5212.method754(this.field5231, 1, 27910);
                this.field5212.method811(this.field5233, (byte) 102);
                this.field5212.method756(0, var12 - -1 + -var11, 11897, class433.field6280, var10 / 3, var9, var11);
                this.field5212.method767(1, true);
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "v", descriptor = "(IILha;)Lha;")
    public final class425 method2171(int arg0, int arg1, class425 arg2) {
        ++field5186;
        if (~(1 & this.field5220[arg0][arg1]) == -1) {
            return null;
        } else {
            int var4 = super.field9629 >> this.field5212.field7767;
            class392 var5 = (class392) arg2;
            class392 var6;
            if (var5 != null && var5.method2428(var4, var4, (byte) -17)) {
                var6 = var5;
                var5.method2432((byte) 0);
            } else {
                var6 = new class392(this.field5212, var4, var4);
            }
            var6.method2425(var4, -83, 0, var4, 0);
            this.method2186(arg1, var6, (byte) 46, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
    public static void method2172(int arg0) {
        field5209 = null;
        field5187 = null;
        field5202 = null;
        if (arg0 > -114) {
            method2169(5, 29);
        }
    }

    @OriginalMember(owner = "client!om", name = "E", descriptor = "(Lha;IIIIZ)V")
    public final void method2173(class425 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5200;
        if (this.field5219 != null && arg0 != null) {
            int var7 = -(this.field5212.field7748 * arg2 >> 8) + arg1 >> this.field5212.field7767;
            int var8 = -(this.field5212.field7722 * arg2 >> 8) + arg3 >> this.field5212.field7767;
            this.field5219.method470(arg0, -2, var7, var8);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(III[[ZZ)V")
    public final void method2174(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method2177(arg1, -3, arg4, arg3, arg2, -1, arg0);
        ++field5216;
    }

    @OriginalMember(owner = "client!om", name = "BA", descriptor = "()V")
    public final void method2175() {
        ++field5229;
        if (~this.field5224 < -1) {
            byte[][] var1 = new byte[super.field9628 + 1][super.field9630 + 1];
            for (int var2 = 1; var2 < super.field9628; ++var2) {
                for (int var107 = 1; ~super.field9630 < ~var107; ++var107) {
                    var1[var2][var107] = (byte) ((this.field5226[var2][var107 - 1] >> 2) + (this.field5226[var2][var107 + 1] >> 3) + (this.field5226[var2][var107] >> 1) + (this.field5226[var2 + -1][var107] >> 2) + (this.field5226[var2 + 1][var107] >> 3));
                }
            }
            class607[] var3 = new class607[this.field5228.method1996((byte) -102)];
            this.field5228.method1994(var3, (byte) 115);
            for (int var4 = 0; var4 < var3.length; ++var4) {
                var3[var4].method3469(0, this.field5224);
            }
            int var5 = 20;
            if (this.field5204 != null) {
                var5 += 4;
            }
            if (~(7 & this.field5218) != -1) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field5212.field7564.method2073(this.field5224 * 4, false);
            NativeHeapBuffer var7 = this.field5212.field7564.method2073(this.field5224 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class607[] var10 = new class607[this.field5224];
            int var11 = class334.method2048(this.field5224 / 4, (byte) -62);
            if (var11 < 1) {
                var11 = 1;
            }
            class322 var12 = new class322(var11);
            class607[] var13 = new class607[this.field5223];
            for (int var14 = 0; ~var14 > ~super.field9628; ++var14) {
                for (int var34 = 0; super.field9630 > var34; ++var34) {
                    if (this.field5211[var14][var34] != null) {
                        class607[] var35 = this.field5203[var14][var34];
                        int[] var36 = this.field5183[var14][var34];
                        int[] var37 = this.field5221[var14][var34];
                        int[] var38 = this.field5184[var14][var34];
                        int[] var39 = this.field5211[var14][var34];
                        int[] var40 = this.field5193 == null ? null : this.field5193[var14][var34];
                        if (var38 == null) {
                            var38 = var39;
                        }
                        int[] var41 = this.field5204 != null ? this.field5204[var14][var34] : null;
                        float var42 = this.field5225[var14][var34];
                        float var43 = this.field5230[var14][var34];
                        float var44 = this.field5222[var14][var34];
                        float var45 = this.field5225[var14][var34 + 1];
                        float var46 = this.field5230[var14][var34 + 1];
                        float var47 = this.field5222[var14][var34 + 1];
                        float var48 = this.field5225[var14 + 1][var34 + 1];
                        float var49 = this.field5230[var14 + 1][var34 + 1];
                        float var50 = this.field5222[var14 - -1][var34 + 1];
                        float var51 = this.field5225[var14 + 1][var34];
                        float var52 = this.field5230[var14 + 1][var34];
                        float var53 = this.field5222[var14 + 1][var34];
                        int var54 = var1[var14][var34] & 255;
                        int var55 = var1[var14][var34 + 1] & 255;
                        int var56 = var1[var14 + 1][var34 - -1] & 255;
                        int var57 = 255 & var1[var14 + 1][var34];
                        int var58 = 0;
                        label357: for (int var59 = 0; ~var59 > ~var39.length; ++var59) {
                            class607 var105 = var35[var59];
                            for (int var106 = 0; var58 > var106; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label357;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field5213[super.field9628 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; var61 < var39.length; ++var61) {
                            int var62 = (var14 << super.field9623) + var36[var61];
                            int var63 = (var34 << super.field9623) + var37[var61];
                            int var64 = var62 >> this.field5197;
                            int var65 = var63 >> this.field5197;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 == null ? 0 : var40[var61];
                            long var69 = (long) var65 | (long) (var64 << 16) | (long) var66 << 32 | (long) var67 << 48;
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            int var75;
                            float var76;
                            float var77;
                            float var78;
                            if (var71 == 0 && ~var72 == -1) {
                                var75 = var73 - var54;
                                var76 = var44;
                                var77 = var42;
                                var78 = var43;
                            } else if (~var71 == -1 && super.field9629 == var72) {
                                var77 = var45;
                                var75 = var73 - var55;
                                var76 = var47;
                                var78 = var46;
                            } else if (~super.field9629 == ~var71 && ~super.field9629 == ~var72) {
                                var76 = var50;
                                var77 = var48;
                                var78 = var49;
                                var75 = var73 - var56;
                            } else if (~super.field9629 == ~var71 && var72 == 0) {
                                var77 = var51;
                                var78 = var52;
                                var75 = var73 - var57;
                                var76 = var53;
                            } else {
                                float var79 = (float) var71 / (float) super.field9629;
                                float var80 = (float) var72 / (float) super.field9629;
                                float var81 = (-var42 + var51) * var79 + var42;
                                float var82 = (var52 - var43) * var79 + var43;
                                float var83 = (var53 - var44) * var79 + var44;
                                float var84 = (var48 - var45) * var79 + var45;
                                float var85 = (var49 - var46) * var79 + var46;
                                var78 = (var85 - var82) * var80 + var82;
                                float var86 = (var50 - var47) * var79 + var47;
                                var77 = (var84 - var81) * var80 + var81;
                                var76 = (var86 - var83) * var80 + var83;
                                int var87 = ((var57 - var54) * var71 >> super.field9623) + var54;
                                int var88 = ((var56 - var55) * var71 >> super.field9623) + var55;
                                var75 = var73 - (((-var87 + var88) * var72 >> super.field9623) + var87);
                            }
                            float var89 = 1.0F;
                            if (var66 != -1) {
                                int var90 = (127 & var66) * var75 >> 7;
                                if (~var90 > -3) {
                                    var90 = 2;
                                } else if (var90 > 126) {
                                    var90 = 126;
                                }
                                var74 = class391.field5908[var90 | var66 & 65408];
                                if (~(this.field5218 & 7) == -1) {
                                    float var91 = this.field5212.field7747[2] * var76 + this.field5212.field7747[0] * var77 + this.field5212.field7747[1] * var78;
                                    var89 = this.field5212.field7777 + (!(var91 > 0.0F) ? this.field5212.field7772 : this.field5212.field7741) * var91;
                                }
                            }
                            class381 var92 = null;
                            if ((var62 & this.field5196 + -1) == 0 && ~(var63 & this.field5196 - 1) == -1) {
                                var92 = var12.method2002((byte) -113, var69);
                            }
                            int var93;
                            if (var92 != null) {
                                var60[var61] = ((class263) var92).field3409;
                                var93 = 65535 & var60[var61];
                                if (var66 != -1 && var10[var93].field5740 > var35[var61].field5740) {
                                    var10[var93] = var35[var61];
                                }
                            } else {
                                int var94;
                                if (~var66 == ~var67) {
                                    var94 = var74;
                                } else {
                                    int var95 = (127 & var67) * var75 >> 7;
                                    if (~var95 <= -3) {
                                        if (~var95 < -127) {
                                            var95 = 126;
                                        }
                                    } else {
                                        var95 = 2;
                                    }
                                    var94 = class391.field5908[65408 & var67 | var95];
                                    if (~(this.field5218 & 7) == -1) {
                                        float var96 = this.field5212.field7747[2] * var76 + this.field5212.field7747[1] * var78 + this.field5212.field7747[0] * var77;
                                        float var97 = (var89 > 0.0F ? this.field5212.field7741 : this.field5212.field7772) * var89 + this.field5212.field7777;
                                        int var98 = var94 >> 16 & 255;
                                        int var99 = (var94 & 65285) >> 8;
                                        int var100 = 255 & var94;
                                        int var101 = (int) ((float) var98 * var97);
                                        int var102 = (int) ((float) var99 * var97);
                                        if (var101 < 0) {
                                            var101 = 0;
                                        } else if (var101 > 255) {
                                            var101 = 255;
                                        }
                                        int var103 = (int) ((float) var100 * var97);
                                        if (var102 < 0) {
                                            var102 = 0;
                                        } else if (~var102 < -256) {
                                            var102 = 255;
                                        }
                                        if (~var103 > -1) {
                                            var103 = 0;
                                        } else if (var103 > 255) {
                                            var103 = 255;
                                        }
                                        var94 = var102 << 8 | var101 << 16 | var103;
                                    }
                                }
                                if (Stream.method2077()) {
                                    var8.method2075((float) var62);
                                    var8.method2075((float) (this.method3824(var62, 118, var63) + var68));
                                    var8.method2075((float) var63);
                                    var8.method2075((float) var62);
                                    var8.method2075((float) var63);
                                    if (this.field5204 != null) {
                                        var8.method2075((float) (var41 != null ? var41[var61] + -1 : 0));
                                    }
                                    if ((this.field5218 & 7) != 0) {
                                        var8.method2075(var77);
                                        var8.method2075(var78);
                                        var8.method2075(var76);
                                    }
                                } else {
                                    var8.method2088((float) var62);
                                    var8.method2088((float) (this.method3824(var62, 124, var63) - -var68));
                                    var8.method2088((float) var63);
                                    var8.method2088((float) var62);
                                    var8.method2088((float) var63);
                                    if (this.field5204 != null) {
                                        var8.method2088((float) (var41 == null ? 0 : var41[var61] + -1));
                                    }
                                    if (~(7 & this.field5218) != -1) {
                                        var8.method2088(var77);
                                        var8.method2088(var78);
                                        var8.method2088(var76);
                                    }
                                }
                                if (~this.field5212.field7764 != -1) {
                                    var9.method2081(-16777216 | var94);
                                } else {
                                    var9.method2086(-16777216 | var94);
                                }
                                var93 = this.field5182++;
                                var60[var61] = (short) var93;
                                if (var66 != -1) {
                                    var10[var93] = var35[var61];
                                }
                                var12.method2001(-81, new class263(var60[var61]), var69);
                            }
                            for (int var104 = 0; ~var58 < ~var104; ++var104) {
                                var13[var104].method3473(var89, (byte) -97, var93, var74, var75);
                            }
                            ++this.field5192;
                        }
                    }
                }
            }
            for (int var15 = 0; this.field5182 > var15; ++var15) {
                class607 var33 = var10[var15];
                if (var33 != null) {
                    var33.method3466(-113, var15);
                }
            }
            for (int var16 = 0; ~var16 > ~super.field9628; ++var16) {
                for (int var22 = 0; super.field9630 > var22; ++var22) {
                    short[] var23 = this.field5213[super.field9628 * var22 + var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (~var23.length < ~var25) {
                            int var26 = 65535 & var23[var25++];
                            int var27 = var23[var25++] & 65535;
                            int var28 = 65535 & var23[var25++];
                            class607 var29 = var10[var26];
                            class607 var30 = var10[var27];
                            class607 var31 = var10[var28];
                            class607 var32 = null;
                            if (var29 != null) {
                                var29.method3465(var16, -11800, var24, var22);
                                var32 = var29;
                            }
                            if (var30 != null) {
                                var30.method3465(var16, -11800, var24, var22);
                                if (var32 == null || var30.field5740 < var32.field5740) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method3465(var16, -11800, var24, var22);
                                if (var32 == null || var32.field5740 > var31.field5740) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method3466(-104, var26);
                                }
                                if (var30 != null) {
                                    var32.method3466(-123, var27);
                                }
                                if (var31 != null) {
                                    var32.method3466(-59, var28);
                                }
                                var32.method3465(var16, -11800, var24, var22);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method2084();
            var9.method2084();
            this.field5231 = this.field5212.method806(10, false);
            this.field5231.method1228(-27648, 4, var6, this.field5182 * 4);
            this.field5232 = this.field5212.method806(10, false);
            this.field5232.method1228(-27648, var5, var7, this.field5182 * var5);
            if (~(this.field5218 & 7) != -1) {
                if (this.field5204 != null) {
                    this.field5233 = this.field5212.method781(new class680[] { new class680(new class455[] { class455.field6559, class455.field6569, class455.field6568, class455.field6566 }), new class680(class455.field6567) }, -96);
                } else {
                    this.field5233 = this.field5212.method781(new class680[] { new class680(new class455[] { class455.field6559, class455.field6569, class455.field6566 }), new class680(class455.field6567) }, -98);
                }
            } else if (this.field5204 != null) {
                this.field5233 = this.field5212.method781(new class680[] { new class680(new class455[] { class455.field6559, class455.field6569, class455.field6568 }), new class680(class455.field6567) }, -83);
            } else {
                this.field5233 = this.field5212.method781(new class680[] { new class680(new class455[] { class455.field6559, class455.field6569 }), new class680(class455.field6567) }, -111);
            }
            int var17 = 0;
            for (int var18 = 0; var18 < var3.length; ++var18) {
                if (var3[var18].field8767 > 0) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field5227 = new class607[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; ~var20 > ~var17; ++var20) {
                class607 var21 = var3[var20];
                var19[var20] = var21.field5740;
                this.field5227[var20] = var21;
                var21.method3468(this.field5182, 4);
            }
            class550.method3213(this.field5227, var19, -69);
            if (this.field5219 != null) {
                this.field5219.method467((byte) -69);
            }
        } else {
            this.field5219 = null;
        }
        this.field5203 = null;
        this.field5226 = null;
        this.field5193 = null;
        this.field5211 = null;
        this.field5184 = null;
        this.field5225 = this.field5230 = this.field5222 = null;
        this.field5204 = null;
        this.field5183 = this.field5221 = null;
        this.field5228 = null;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lum;IIII[[I[[II)V")
    public class351(class528 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field5212 = arg0;
        this.field5197 = super.field9623 + -2;
        this.field5221 = new int[arg3][arg4][];
        this.field5222 = new float[super.field9628 + 1][super.field9630 + 1];
        this.field5183 = new int[arg3][arg4][];
        this.field5184 = new int[arg3][arg4][];
        this.field5211 = new int[arg3][arg4][];
        this.field5225 = new float[super.field9628 + 1][super.field9630 - -1];
        this.field5226 = new byte[arg3 + 1][arg4 + 1];
        this.field5203 = new class607[arg3][arg4][];
        this.field5196 = 1 << this.field5197;
        this.field5213 = new short[arg3 * arg4][];
        this.field5193 = new int[arg3][arg4][];
        this.field5220 = new byte[arg3][arg4];
        this.field5230 = new float[super.field9628 - -1][super.field9630 + 1];
        this.field5218 = arg2;
        for (int var9 = 0; super.field9630 >= var9; ++var9) {
            for (int var10 = 0; super.field9628 >= var10; ++var10) {
                int var11 = super.field9624[var10][var9];
                if ((float) var11 > this.field5207) {
                    this.field5207 = (float) var11;
                }
                if (this.field5188 > (float) var11) {
                    this.field5188 = (float) var11;
                }
                if (~var10 < -1 && var9 > 0 && super.field9628 > var10 && var9 < super.field9630) {
                    int var12 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (arg7 * arg7 * 4 + var12 * var12 + var13 * var13)));
                    this.field5225[var10][var9] = (float) var12 * var14;
                    this.field5230[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field5222[var10][var9] = (float) var13 * var14;
                }
            }
        }
        ++this.field5207;
        --this.field5188;
        this.field5228 = new class322(128);
        if (~(16 & this.field5218) != -1) {
            this.field5219 = new class81(this.field5212, this);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lha;IIIIZ)Z")
    public final boolean method2176(class425 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5194;
        if (this.field5219 != null && arg0 != null) {
            int var7 = -(this.field5212.field7748 * arg2 >> 8) + arg1 >> this.field5212.field7767;
            int var8 = -(this.field5212.field7722 * arg2 >> 8) + arg3 >> this.field5212.field7767;
            return this.field5219.method466(var8, -1, var7, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIZ[[ZIII)V")
    private final void method2177(int arg0, int arg1, boolean arg2, boolean[][] arg3, int arg4, int arg5, int arg6) {
        ++field5208;
        if (arg1 == -3) {
            if (this.field5227 != null) {
                int var8 = arg4 - (-arg4 - 1);
                int var9 = var8 * var8;
                if (~class400.field6024.length > ~var9) {
                    class400.field6024 = new int[var9];
                }
                int var10 = -arg4 + arg6;
                int var11 = var10;
                if (var10 < 0) {
                    var10 = 0;
                }
                int var12 = -arg4 + arg0;
                int var13 = var12;
                if (~var12 > -1) {
                    var12 = 0;
                }
                int var14 = arg6 - -arg4;
                if (super.field9628 + -1 < var14) {
                    var14 = super.field9628 + -1;
                }
                int var15 = arg0 + arg4;
                if (super.field9630 + -1 < var15) {
                    var15 = super.field9630 + -1;
                }
                class435.field6302 = 0;
                for (int var16 = var10; var14 >= var16; ++var16) {
                    boolean[] var23 = arg3[-var11 + var16];
                    for (int var24 = var12; ~var24 >= ~var15; ++var24) {
                        if (var23[-var13 + var24]) {
                            class400.field6024[class435.field6302++] = super.field9628 * var24 - -var16;
                        }
                    }
                }
                if (arg5 == -1) {
                    this.field5212.method2993(8);
                } else {
                    this.field5212.method3036((byte) -112, (float) arg5);
                    this.field5212.method3042((byte) -127);
                }
                this.field5212.method3065(arg1 + 3);
                this.field5212.method2994(0, (7 & this.field5218) != 0);
                this.field5212.method3058(false, -1, (byte) -125, false);
                this.field5212.method754(this.field5232, 0, 27910);
                for (int var17 = 0; var17 < this.field5227.length; ++var17) {
                    this.field5227[var17].method3472(class435.field6302, arg1 + -110, class400.field6024);
                }
                class300 var18 = this.field5212.method3014(-11433);
                var18.method883(0, -1, 0);
                this.field5212.method2989((byte) -18);
                if (!this.field5206.method1903(arg1 + -24)) {
                    int var19 = this.field5212.field7782;
                    int var20 = this.field5212.field7733;
                    this.field5212.method718(0, var20, this.field5212.field7746);
                    this.field5212.method2994(0, false);
                    this.field5212.method3056(false, (byte) 106);
                    this.field5212.method3068(126, 128);
                    this.field5212.method3058(false, -2, (byte) -124, false);
                    this.field5212.method3011(-128, this.field5212.field7752);
                    this.field5212.method3013(class492.field6998, 88, class519.field7276);
                    this.field5212.method3025(class475.field6812, -1, 0);
                    this.field5212.method3019(0, 0, class443.field6428);
                    for (class381 var21 = this.field5206.method1904(false); var21 != null; var21 = this.field5206.method1901(arg1 + 124)) {
                        class172 var22 = (class172) var21;
                        var22.method1190(arg4, arg3, 127, arg6, arg0);
                    }
                    this.field5212.method3025(class283.field3777, arg1 + 2, 0);
                    this.field5212.method3019(0, 0, class283.field3777);
                    this.field5212.method3011(arg1 + -124, (class689) null);
                    this.field5212.method718(var19, var20, this.field5212.field7746);
                }
                if (this.field5219 != null) {
                    this.field5212.method754(this.field5232, 0, 27910);
                    this.field5212.method754(this.field5231, 1, 27910);
                    this.field5212.method811(this.field5233, (byte) -101);
                    this.field5219.method471((byte) 123, arg0, arg6, arg4, arg3, arg2);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIII)V")
    public static final void method2178(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5190;
        for (int var5 = arg3; ~var5 > ~class7.field215; ++var5) {
            Rectangle var6 = class696.field9811[var5];
            if (var6.x - -var6.width > arg4 && arg2 + arg4 > var6.x && ~arg0 > ~(var6.y + var6.height) && var6.y < arg0 - -arg1) {
                class27.field475[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lcaa;[Ltg;)V")
    public static final void method2179(class538 arg0, class334[] arg1) {
        if (class356.field5267) {
            int var2 = arg0.method1808(16, arg1);
            class503.field7110.method696(var2, arg1);
        }
        if (class383.field5753 == class178.field2480) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class293) {
                var5 = ((class293) arg0).field4299;
                var6 = ((class293) arg0).field4300;
            } else {
                var5 = arg0.field7895 >> class125.field1831;
                var6 = arg0.field7896 >> class125.field1831;
            }
            class503.field7110.method657(class262.field3404[0].method3824(arg0.field7895, 109, arg0.field7896), class418.method2539(var5, var6), class11.method76(var5, var6), class620.method3568(var5, var6));
        }
        class218 var7 = arg0.method272(class503.field7110, -1);
        if (var7 != null) {
            var7.field2900 = arg0;
            if (class96.field1479) {
                class383 var8 = class604.field8729;
                synchronized (class604.field8729) {
                    boolean var9 = false;
                    for (class218 var10 = (class218) class604.field8729.method2370(-26173); var10 != null; var10 = (class218) class604.field8729.method2369((byte) -97)) {
                        if (arg0.field7901 >= var10.field2900.field7901) {
                            class87.method495(false, var10, var7);
                            var9 = true;
                            break;
                        }
                    }
                    if (!var9) {
                        class604.field8729.method2368(0, var7);
                    }
                    return;
                }
            }
            boolean var11 = false;
            for (class218 var12 = (class218) class604.field8729.method2370(-26173); var12 != null; var12 = (class218) class604.field8729.method2369((byte) 16)) {
                if (arg0.field7901 >= var12.field2900.field7901) {
                    class87.method495(false, var12, var7);
                    var11 = true;
                    break;
                }
            }
            if (!var11) {
                class604.field8729.method2368(0, var7);
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V")
    public static final void method2180(int arg0) {
        if (arg0 == -17040) {
            ++field5210;
            if (!class591.method3368(class264.field3451, arg0 + 43426) && !class261.method1566((byte) 5, class264.field3451)) {
                int var1 = class321.field4681.field7430[0] >> 3;
                int var2 = class321.field4681.field7429[0] >> 3;
                if (~var1 <= -1 && ~var1 > ~(class72.field1144 >> 3) && ~var2 <= -1 && class668.field9444 >> 3 > var2) {
                    class54.method323(var1, var2, (byte) 38, 5000);
                } else {
                    class54.method323(class72.field1144 >> 4, class668.field9444 >> 4, (byte) 24, 0);
                }
            } else {
                class54.method323(class306.field4529 >> 12, class603.field8702 >> 12, (byte) -99, 5000);
            }
            class375.method2319(5);
            class211.method1339(arg0 ^ 2114);
            class298.method1855(92);
            class272.method1624((byte) -122);
        }
    }

    @OriginalMember(owner = "client!om", name = "DA", descriptor = "(Lha;IIIIZ)V")
    public final void method2181(class425 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5185;
        if (this.field5219 != null && arg0 != null) {
            int var7 = -(this.field5212.field7748 * arg2 >> 8) + arg1 >> this.field5212.field7767;
            int var8 = -(this.field5212.field7722 * arg2 >> 8) + arg3 >> this.field5212.field7767;
            this.field5219.method472(var7, arg0, var8, (byte) -109);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)V")
    public final void method2182(int arg0, int arg1) {
        ++field5198;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(III)V")
    public final void method2183(int arg0, int arg1, int arg2) {
        if ((255 & this.field5226[arg0][arg1]) < arg2) {
            this.field5226[arg0][arg1] = (byte) arg2;
        }
        ++field5189;
    }

    @OriginalMember(owner = "client!om", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method2184(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg5 != null && this.field5204 == null) {
            this.field5204 = new int[super.field9628][super.field9630][];
        }
        ++field5217;
        if (arg3 != null && this.field5193 == null) {
            this.field5193 = new int[super.field9628][super.field9630][];
        }
        this.field5183[arg0][arg1] = arg2;
        this.field5221[arg0][arg1] = arg4;
        this.field5211[arg0][arg1] = arg6;
        this.field5184[arg0][arg1] = arg7;
        if (this.field5204 != null) {
            this.field5204[arg0][arg1] = arg5;
        }
        if (this.field5193 != null) {
            this.field5193[arg0][arg1] = arg3;
        }
        class607[] var15 = this.field5203[arg0][arg1] = new class607[arg6.length];
        for (int var16 = 0; arg6.length > var16; ++var16) {
            long var17 = (long) arg8[var16] | (long) (arg9[var16] << 14) | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28;
            class381 var19;
            for (var19 = this.field5228.method2002((byte) -122, var17); var19 != null; var19 = this.field5228.method1999(116)) {
                class607 var20 = (class607) var19;
                if (~arg8[var16] == ~var20.field8785 && (float) arg9[var16] == var20.field8772 && ~var20.field8775 == ~arg10 && var20.field8770 == arg11 && var20.field8781 == arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class607) var19;
            } else {
                var15[var16] = new class607(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field5228.method2001(-127, var15[var16], var17);
            }
        }
        if (arg13) {
            this.field5220[arg0][arg1] = (byte) class151.method1076(this.field5220[arg0][arg1], 1);
        }
        if (arg6.length > this.field5223) {
            this.field5223 = arg6.length;
        }
        this.field5224 += arg6.length;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Ltg;[I)V")
    public final void method2185(class334 arg0, int[] arg1) {
        ++field5205;
        this.field5206.method1909(new class172(this.field5212, this, arg0, arg1), (byte) -81);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILsw;BI)V")
    private final void method2186(int arg0, class392 arg1, byte arg2, int arg3) {
        ++field5201;
        int[] var5 = this.field5183[arg3][arg0];
        int[] var6 = this.field5221[arg3][arg0];
        int var7 = var5.length;
        if (var7 > class229.field3046.length) {
            class229.field3046 = new int[var7];
            class125.field1836 = new int[var7];
        }
        if (arg2 >= 8) {
            for (int var8 = 0; var7 > var8; ++var8) {
                class229.field3046[var8] = var5[var8] >> this.field5212.field7767;
                class125.field1836[var8] = var6[var8] >> this.field5212.field7767;
            }
            int var9 = 0;
            while (var7 > var9) {
                int var10 = class229.field3046[var9];
                int var11 = class125.field1836[var9++];
                int var12 = class229.field3046[var9];
                int var13 = class125.field1836[var9++];
                int var14 = class229.field3046[var9];
                int var15 = class125.field1836[var9++];
                if ((-var12 + var10) * (-var15 + var13) + -((-var11 + var13) * (-var12 + var14)) > 0) {
                    arg1.method2427(var11, var12, var14, -21853, var10, var15, var13);
                }
            }
        }
    }
}
