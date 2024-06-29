import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class260 extends class272 {

    @OriginalMember(owner = "client!daa", name = "r", descriptor = "F")
    private float field3178 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!daa", name = "U", descriptor = "F")
    private float field3207 = -3.4028235E38F;

    @OriginalMember(owner = "client!daa", name = "s", descriptor = "Lae;")
    private class40 field3179 = new class40();

    @OriginalMember(owner = "client!daa", name = "D", descriptor = "Len;")
    public class478 field3190;

    @OriginalMember(owner = "client!daa", name = "G", descriptor = "I")
    private int field3193;

    @OriginalMember(owner = "client!daa", name = "q", descriptor = "[[[I")
    public int[][][] field3177;

    @OriginalMember(owner = "client!daa", name = "N", descriptor = "I")
    public int field3200;

    @OriginalMember(owner = "client!daa", name = "V", descriptor = "I")
    private int field3208;

    @OriginalMember(owner = "client!daa", name = "P", descriptor = "[[[Lbl;")
    private class323[][][] field3202;

    @OriginalMember(owner = "client!daa", name = "z", descriptor = "[[B")
    private byte[][] field3186;

    @OriginalMember(owner = "client!daa", name = "ib", descriptor = "[[B")
    private byte[][] field3221;

    @OriginalMember(owner = "client!daa", name = "O", descriptor = "[[S")
    public short[][] field3201;

    @OriginalMember(owner = "client!daa", name = "hb", descriptor = "[[F")
    private float[][] field3220;

    @OriginalMember(owner = "client!daa", name = "y", descriptor = "[[[I")
    private int[][][] field3185;

    @OriginalMember(owner = "client!daa", name = "fb", descriptor = "[[F")
    private float[][] field3218;

    @OriginalMember(owner = "client!daa", name = "mb", descriptor = "[[F")
    private float[][] field3225;

    @OriginalMember(owner = "client!daa", name = "T", descriptor = "[[[I")
    private int[][][] field3206;

    @OriginalMember(owner = "client!daa", name = "R", descriptor = "[[[I")
    public int[][][] field3204;

    @OriginalMember(owner = "client!daa", name = "A", descriptor = "[[[I")
    public int[][][] field3187;

    @OriginalMember(owner = "client!daa", name = "lb", descriptor = "Lil;")
    private class68 field3224;

    @OriginalMember(owner = "client!daa", name = "w", descriptor = "Ltea;")
    private class481 field3183;

    @OriginalMember(owner = "client!daa", name = "I", descriptor = "Lwp;")
    public static class453 field3195 = new class453(25, 7);

    @OriginalMember(owner = "client!daa", name = "Y", descriptor = "Lbaa;")
    public static class593 field3211 = new class593(8, 0, 4, 1);

    @OriginalMember(owner = "client!daa", name = "cb", descriptor = "I")
    public static int field3215 = 0;

    @OriginalMember(owner = "client!daa", name = "m", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!daa", name = "n", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!daa", name = "o", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!daa", name = "p", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!daa", name = "t", descriptor = "I")
    private int field3180;

    @OriginalMember(owner = "client!daa", name = "u", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!daa", name = "v", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!daa", name = "x", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!daa", name = "B", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!daa", name = "C", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!daa", name = "E", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!daa", name = "F", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!daa", name = "H", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!daa", name = "J", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!daa", name = "K", descriptor = "I")
    private int field3197;

    @OriginalMember(owner = "client!daa", name = "L", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!daa", name = "M", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!daa", name = "Q", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!daa", name = "S", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!daa", name = "W", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!daa", name = "Z", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!daa", name = "eb", descriptor = "I")
    private int field3217;

    @OriginalMember(owner = "client!daa", name = "gb", descriptor = "I")
    private int field3219;

    @OriginalMember(owner = "client!daa", name = "ab", descriptor = "Lah;")
    public static class258 field3213;

    @OriginalMember(owner = "client!daa", name = "bb", descriptor = "Lnba;")
    private class401 field3214;

    @OriginalMember(owner = "client!daa", name = "db", descriptor = "Lnba;")
    private class401 field3216;

    @OriginalMember(owner = "client!daa", name = "jb", descriptor = "Lmq;")
    public class81 field3222;

    @OriginalMember(owner = "client!daa", name = "kb", descriptor = "[Lbl;")
    private class323[] field3223;

    @OriginalMember(owner = "client!daa", name = "X", descriptor = "[[[I")
    private int[][][] field3210;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IIZII[[ZI)V")
    private final void method1513(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean[][] arg5, int arg6) {
        ++field3191;
        if (arg0 != 0) {
            this.method1274((class119) null, -99, -24, -115, -67, false);
        }
        if (this.field3223 != null) {
            int var8 = arg6 - -arg6 + 1;
            int var9 = var8 * var8;
            if (~class685.field9624.length > ~var9) {
                class685.field9624 = new int[var9];
            }
            int var10 = -arg6 + arg3;
            int var11 = var10;
            if (~var10 > -1) {
                var10 = 0;
            }
            int var12 = -arg6 + arg1;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = arg3 + arg6;
            if (~var14 < ~(super.field3441 + -1)) {
                var14 = super.field3441 + -1;
            }
            int var15 = arg1 - -arg6;
            class667.field9407 = 0;
            if (~var15 < ~(super.field3440 + -1)) {
                var15 = super.field3440 + -1;
            }
            for (int var16 = var10; ~var14 <= ~var16; ++var16) {
                boolean[] var23 = arg5[-var11 + var16];
                for (int var24 = var12; ~var24 >= ~var15; ++var24) {
                    if (var23[var24 - var13]) {
                        class685.field9624[class667.field9407++] = super.field3441 * var24 - -var16;
                    }
                }
            }
            if (arg4 == -1) {
                this.field3190.method2569(8);
            } else {
                this.field3190.method2580((float) arg4, (byte) -50);
                this.field3190.method2572(128);
            }
            this.field3190.method2551((byte) 54);
            this.field3190.method2535(~(this.field3200 & 7) != -1, 121);
            this.field3190.method2526(0, -1, false, false);
            this.field3190.method1695((byte) -16, this.field3214, 0);
            for (int var17 = 0; this.field3223.length > var17; ++var17) {
                this.field3223[var17].method1853(class685.field9624, 1602853160, class667.field9407);
            }
            class691 var18 = this.field3190.method2598(arg0 + 12083);
            var18.method914(0, -1, 0);
            this.field3190.method2588(-93);
            if (!this.field3179.method246(true)) {
                int var19 = this.field3190.field6303;
                int var20 = this.field3190.field6324;
                this.field3190.method1075(0, var20, this.field3190.field6308);
                this.field3190.method2535(false, arg0 ^ 115);
                this.field3190.method2594(false, (byte) -25);
                this.field3190.method2553((byte) 28, 128);
                this.field3190.method2526(0, -2, false, false);
                this.field3190.method2596(this.field3190.field6246, 0);
                this.field3190.method2550(class112.field1466, true, class538.field7226);
                this.field3190.method2602(0, 1, class700.field9903);
                this.field3190.method2561(0, class563.field7825, -18836);
                for (class329 var21 = this.field3179.method237(87); var21 != null; var21 = this.field3179.method245((byte) 82)) {
                    class667 var22 = (class667) var21;
                    var22.method3746(arg1, arg6, arg5, arg3, -119);
                }
                this.field3190.method2602(0, 1, class5.field119);
                this.field3190.method2561(0, class5.field119, -18836);
                this.field3190.method2596((class466) null, arg0);
                this.field3190.method1075(var19, var20, this.field3190.field6308);
            }
            if (this.field3183 != null) {
                this.field3190.method1695((byte) -16, this.field3214, 0);
                this.field3190.method1695((byte) -16, this.field3216, 1);
                this.field3190.method1709(true, this.field3222);
                this.field3183.method2623(arg2, arg6, arg3, arg1, arg5, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(II)V")
    public final void method1282(int arg0, int arg1) {
        ++field3184;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(III[[ZZI)V")
    public final void method1277(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field3194;
        this.method1513(0, arg1, arg4, arg0, arg5, arg3, arg2);
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Lha;IIIIZ)Z")
    public final boolean method1286(class119 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3209;
        if (this.field3183 != null && arg0 != null) {
            int var7 = -(this.field3190.field6301 * arg2 >> 8) + arg1 >> this.field3190.field6241;
            int var8 = arg3 - (this.field3190.field6282 * arg2 >> 8) >> this.field3190.field6241;
            return this.field3183.method2620(arg0, (byte) -85, var8, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1276(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field3205;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 != null ? new int[var18 * 3] : null;
        int[] var26 = arg5 == null ? null : new int[var18 * 3];
        int var27 = 0;
        for (int var28 = 0; var28 < var18; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
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
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
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
        this.method1275(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(ILok;II)V")
    private final void method1514(int arg0, class100 arg1, int arg2, int arg3) {
        ++field3182;
        int[] var5 = this.field3187[arg2][arg0];
        int[] var6 = this.field3177[arg2][arg0];
        int var7 = 114 / ((arg3 - -88) / 37);
        int var8 = var5.length;
        if (var8 > class559.field7753.length) {
            class559.field7753 = new int[var8];
            class688.field9766 = new int[var8];
        }
        for (int var9 = 0; ~var8 < ~var9; ++var9) {
            class559.field7753[var9] = var5[var9] >> this.field3190.field6241;
            class688.field9766[var9] = var6[var9] >> this.field3190.field6241;
        }
        int var10 = 0;
        while (var8 > var10) {
            int var11 = class559.field7753[var10];
            int var12 = class688.field9766[var10++];
            int var13 = class559.field7753[var10];
            int var14 = class688.field9766[var10++];
            int var15 = class559.field7753[var10];
            int var16 = class688.field9766[var10++];
            if (~((-var13 + var11) * (-var16 + var14) + -((var14 - var12) * (var15 - var13))) < -1) {
                arg1.method572(var15, -3417, var12, var16, var11, var13, var14);
            }
        }
    }

    @OriginalMember(owner = "client!daa", name = "BA", descriptor = "()V")
    public final void method1288() {
        if (~this.field3217 < -1) {
            byte[][] var1 = new byte[super.field3441 + 1][super.field3440 + 1];
            for (int var2 = 1; ~super.field3441 < ~var2; ++var2) {
                for (int var107 = 1; super.field3440 > var107; ++var107) {
                    var1[var2][var107] = (byte) ((this.field3221[var2][var107] >> 1) + (this.field3221[var2][var107 - -1] >> 3) + (this.field3221[var2][var107 + -1] >> 2) + (this.field3221[var2 + -1][var107] >> 2) + (this.field3221[var2 + 1][var107] >> 3));
                }
            }
            class323[] var3 = new class323[this.field3224.method404((byte) -26)];
            this.field3224.method400(var3, (byte) -84);
            for (int var4 = 0; var4 < var3.length; ++var4) {
                var3[var4].method1849(this.field3217, 4);
            }
            int var5 = 20;
            if (this.field3210 != null) {
                var5 += 4;
            }
            if ((7 & this.field3200) != 0) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field3190.field6064.method3414(this.field3217 * 4, false);
            NativeHeapBuffer var7 = this.field3190.field6064.method3414(this.field3217 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class323[] var10 = new class323[this.field3217];
            int var11 = class257.method1497((byte) 114, this.field3217 / 4);
            if (~var11 > -2) {
                var11 = 1;
            }
            class68 var12 = new class68(var11);
            class323[] var13 = new class323[this.field3219];
            for (int var14 = 0; ~super.field3441 < ~var14; ++var14) {
                for (int var34 = 0; var34 < super.field3440; ++var34) {
                    if (this.field3204[var14][var34] != null) {
                        class323[] var35 = this.field3202[var14][var34];
                        int[] var36 = this.field3187[var14][var34];
                        int[] var37 = this.field3177[var14][var34];
                        int[] var38 = this.field3185[var14][var34];
                        int[] var39 = this.field3204[var14][var34];
                        int[] var40 = this.field3206 != null ? this.field3206[var14][var34] : null;
                        if (var38 == null) {
                            var38 = var39;
                        }
                        int[] var41 = this.field3210 == null ? null : this.field3210[var14][var34];
                        float var42 = this.field3225[var14][var34];
                        float var43 = this.field3220[var14][var34];
                        float var44 = this.field3218[var14][var34];
                        float var45 = this.field3225[var14][var34 + 1];
                        float var46 = this.field3220[var14][var34 - -1];
                        float var47 = this.field3218[var14][var34 + 1];
                        float var48 = this.field3225[var14 + 1][var34 + 1];
                        float var49 = this.field3220[var14 + 1][var34 - -1];
                        float var50 = this.field3218[var14 + 1][var34 + 1];
                        float var51 = this.field3225[var14 + 1][var34];
                        float var52 = this.field3220[var14 + 1][var34];
                        float var53 = this.field3218[var14 - -1][var34];
                        int var54 = var1[var14][var34] & 255;
                        int var55 = var1[var14][var34 + 1] & 255;
                        int var56 = 255 & var1[var14 - -1][var34 + 1];
                        int var57 = var1[var14 + 1][var34] & 255;
                        int var58 = 0;
                        label361: for (int var59 = 0; var39.length > var59; ++var59) {
                            class323 var105 = var35[var59];
                            for (int var106 = 0; ~var106 > ~var58; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label361;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field3201[super.field3441 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; ~var61 > ~var39.length; ++var61) {
                            int var62 = (var14 << super.field3437) - -var36[var61];
                            int var63 = (var34 << super.field3437) - -var37[var61];
                            int var64 = var62 >> this.field3193;
                            int var65 = var63 >> this.field3193;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 != null ? var40[var61] : 0;
                            long var69 = (long) var65 | (long) (var64 << 16) | (long) var67 << 48 | (long) var66 << 32;
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75 = 1.0F;
                            float var76;
                            float var77;
                            float var78;
                            int var79;
                            if (var71 == 0 && ~var72 == -1) {
                                var76 = var43;
                                var77 = var44;
                                var78 = var42;
                                var79 = var73 - var54;
                            } else if (~var71 == -1 && ~super.field3432 == ~var72) {
                                var79 = var73 - var55;
                                var76 = var46;
                                var78 = var45;
                                var77 = var47;
                            } else if (~super.field3432 == ~var71 && ~super.field3432 == ~var72) {
                                var78 = var48;
                                var77 = var50;
                                var79 = var73 - var56;
                                var76 = var49;
                            } else if (~super.field3432 == ~var71 && ~var72 == -1) {
                                var78 = var51;
                                var79 = var73 - var57;
                                var77 = var53;
                                var76 = var52;
                            } else {
                                float var80 = (float) var71 / (float) super.field3432;
                                float var81 = (float) var72 / (float) super.field3432;
                                float var82 = (-var42 + var51) * var80 + var42;
                                float var83 = (var52 - var43) * var80 + var43;
                                float var84 = (-var44 + var53) * var80 + var44;
                                float var85 = (-var45 + var48) * var80 + var45;
                                float var86 = (-var46 + var49) * var80 + var46;
                                float var87 = (var50 - var47) * var80 + var47;
                                var76 = (var86 - var83) * var81 + var83;
                                var78 = (var85 - var82) * var81 + var82;
                                var77 = (-var84 + var87) * var81 + var84;
                                int var88 = var54 - -((-var54 + var57) * var71 >> super.field3437);
                                int var89 = var55 - -((-var55 + var56) * var71 >> super.field3437);
                                var79 = var73 - (((-var88 + var89) * var72 >> super.field3437) + var88);
                            }
                            if (var66 != -1) {
                                int var90 = (127 & var66) * var79 >> 7;
                                if (var90 < 2) {
                                    var90 = 2;
                                } else if (var90 > 126) {
                                    var90 = 126;
                                }
                                if ((7 & this.field3200) == 0) {
                                    float var91 = this.field3190.field6332[2] * var77 + this.field3190.field6332[0] * var78 + this.field3190.field6332[1] * var76;
                                    var75 = var91 * (!(var91 > 0.0F) ? this.field3190.field6304 : this.field3190.field6290) + this.field3190.field6331;
                                }
                                var74 = class344.field4422[var66 & 65408 | var90];
                            }
                            class329 var92 = null;
                            if (~(var62 & this.field3208 + -1) == -1 && (var63 & this.field3208 - 1) == 0) {
                                var92 = var12.method399(-32748, var69);
                            }
                            int var93;
                            if (var92 != null) {
                                var60[var61] = ((class423) var92).field5313;
                                var93 = var60[var61] & 65535;
                                if (var66 != -1 && ~var35[var61].field4199 > ~var10[var93].field4199) {
                                    var10[var93] = var35[var61];
                                }
                            } else {
                                int var95;
                                if (var66 != var67) {
                                    int var94 = (127 & var67) * var79 >> 7;
                                    if (~var94 > -3) {
                                        var94 = 2;
                                    } else if (var94 > 126) {
                                        var94 = 126;
                                    }
                                    var95 = class344.field4422[var67 & 65408 | var94];
                                    if (~(7 & this.field3200) == -1) {
                                        float var96 = this.field3190.field6332[2] * var77 + this.field3190.field6332[1] * var76 + this.field3190.field6332[0] * var78;
                                        float var97 = (var75 > 0.0F ? this.field3190.field6290 : this.field3190.field6304) * var75 + this.field3190.field6331;
                                        int var98 = 255 & var95 >> 16;
                                        int var99 = var95 >> 8 & 255;
                                        int var100 = (int) ((float) var98 * var97);
                                        int var101 = 255 & var95;
                                        int var102 = (int) ((float) var99 * var97);
                                        if (~var100 <= -1) {
                                            if (~var100 < -256) {
                                                var100 = 255;
                                            }
                                        } else {
                                            var100 = 0;
                                        }
                                        int var103 = (int) ((float) var101 * var97);
                                        if (var102 >= 0) {
                                            if (~var102 < -256) {
                                                var102 = 255;
                                            }
                                        } else {
                                            var102 = 0;
                                        }
                                        if (var103 < 0) {
                                            var103 = 0;
                                        } else if (~var103 < -256) {
                                            var103 = 255;
                                        }
                                        var95 = var100 << 16 | var102 << 8 | var103;
                                    }
                                } else {
                                    var95 = var74;
                                }
                                if (!Stream.method3420()) {
                                    var8.method3427((float) var62);
                                    var8.method3427((float) (this.method1565(var63, var62, true) + var68));
                                    var8.method3427((float) var63);
                                    var8.method3427((float) var62);
                                    var8.method3427((float) var63);
                                    if (this.field3210 != null) {
                                        var8.method3427((float) (var41 == null ? 0 : var41[var61] + -1));
                                    }
                                    if (~(this.field3200 & 7) != -1) {
                                        var8.method3427(var78);
                                        var8.method3427(var76);
                                        var8.method3427(var77);
                                    }
                                } else {
                                    var8.method3418((float) var62);
                                    var8.method3418((float) (var68 + this.method1565(var63, var62, true)));
                                    var8.method3418((float) var63);
                                    var8.method3418((float) var62);
                                    var8.method3418((float) var63);
                                    if (this.field3210 != null) {
                                        var8.method3418((float) (var41 == null ? 0 : var41[var61] + -1));
                                    }
                                    if ((7 & this.field3200) != 0) {
                                        var8.method3418(var78);
                                        var8.method3418(var76);
                                        var8.method3418(var77);
                                    }
                                }
                                if (~this.field3190.field6326 == -1) {
                                    var9.method3432(var95 | -16777216);
                                } else {
                                    var9.method3419(var95 | -16777216);
                                }
                                var93 = this.field3180++;
                                var60[var61] = (short) var93;
                                if (~var66 != 0) {
                                    var10[var93] = var35[var61];
                                }
                                var12.method402(new class423(var60[var61]), (byte) -82, var69);
                            }
                            for (int var104 = 0; ~var58 < ~var104; ++var104) {
                                var13[var104].method1850(var74, var79, (byte) -110, var75, var93);
                            }
                            ++this.field3197;
                        }
                    }
                }
            }
            for (int var15 = 0; this.field3180 > var15; ++var15) {
                class323 var33 = var10[var15];
                if (var33 != null) {
                    var33.method1847(-118, var15);
                }
            }
            for (int var16 = 0; ~var16 > ~super.field3441; ++var16) {
                for (int var22 = 0; ~super.field3440 < ~var22; ++var22) {
                    short[] var23 = this.field3201[super.field3441 * var22 + var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (var25 < var23.length) {
                            int var26 = 65535 & var23[var25++];
                            int var27 = var23[var25++] & 65535;
                            int var28 = 65535 & var23[var25++];
                            class323 var29 = var10[var26];
                            class323 var30 = var10[var27];
                            class323 var31 = var10[var28];
                            class323 var32 = null;
                            if (var29 != null) {
                                var32 = var29;
                                var29.method1846(var24, var22, var16, true);
                            }
                            if (var30 != null) {
                                var30.method1846(var24, var22, var16, true);
                                if (var32 == null || var30.field4199 < var32.field4199) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method1846(var24, var22, var16, true);
                                if (var32 == null || var32.field4199 > var31.field4199) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method1847(-127, var26);
                                }
                                if (var30 != null) {
                                    var32.method1847(72, var27);
                                }
                                if (var31 != null) {
                                    var32.method1847(-120, var28);
                                }
                                var32.method1846(var24, var22, var16, true);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method3424();
            var9.method3424();
            this.field3216 = this.field3190.method1716(false, false);
            this.field3216.method326(var6, 4, this.field3180 * 4, (byte) 76);
            this.field3214 = this.field3190.method1716(false, false);
            this.field3214.method326(var7, var5, this.field3180 * var5, (byte) 79);
            if ((7 & this.field3200) == 0) {
                if (this.field3210 == null) {
                    this.field3222 = this.field3190.method1730(new class563[] { new class563(new class638[] { class638.field8940, class638.field8949 }), new class563(class638.field8947) }, true);
                } else {
                    this.field3222 = this.field3190.method1730(new class563[] { new class563(new class638[] { class638.field8940, class638.field8949, class638.field8948 }), new class563(class638.field8947) }, true);
                }
            } else if (this.field3210 != null) {
                this.field3222 = this.field3190.method1730(new class563[] { new class563(new class638[] { class638.field8940, class638.field8949, class638.field8948, class638.field8946 }), new class563(class638.field8947) }, true);
            } else {
                this.field3222 = this.field3190.method1730(new class563[] { new class563(new class638[] { class638.field8940, class638.field8949, class638.field8946 }), new class563(class638.field8947) }, true);
            }
            int var17 = 0;
            for (int var18 = 0; var3.length > var18; ++var18) {
                if (~var3[var18].field4148 < -1) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field3223 = new class323[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; var20 < var17; ++var20) {
                class323 var21 = var3[var20];
                var19[var20] = var21.field4199;
                this.field3223[var20] = var21;
                var21.method1852((byte) 22, this.field3180);
            }
            class364.method1998(var19, 0, this.field3223);
            if (this.field3183 != null) {
                this.field3183.method2616(128);
            }
        } else {
            this.field3183 = null;
        }
        ++field3176;
        this.field3224 = null;
        this.field3202 = null;
        this.field3204 = null;
        this.field3210 = null;
        this.field3206 = null;
        this.field3225 = this.field3220 = this.field3218 = null;
        this.field3187 = this.field3177 = null;
        this.field3185 = null;
        this.field3221 = null;
    }

    @OriginalMember(owner = "client!daa", name = "DA", descriptor = "(Lha;IIIIZ)V")
    public final void method1274(class119 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3192;
        if (this.field3183 != null && arg0 != null) {
            int var7 = -(this.field3190.field6301 * arg2 >> 8) + arg1 >> this.field3190.field6241;
            int var8 = -(this.field3190.field6282 * arg2 >> 8) + arg3 >> this.field3190.field6241;
            this.field3183.method2621(arg0, (byte) -123, var8, var7);
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1280(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field3181;
        if (this.field3217 > 0) {
            class666 var9 = this.field3190.method2548(48, this.field3197);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; var13 < 4; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method1486((byte) -88, true);
                if (var14 != null) {
                    Stream var15 = this.field3190.method2573(var14, 116);
                    if (!Stream.method3420()) {
                        for (int var16 = arg4; ~arg6 < ~var16; ++var16) {
                            int var17 = super.field3441 * var16 + arg3;
                            for (int var18 = arg3; arg5 > var18; ++var18) {
                                if (arg7[-arg3 + var18][-arg4 + var16]) {
                                    short[] var19 = this.field3201[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; ~var20 > ~var19.length; ++var20) {
                                            int var21 = var19[var20] & 65535;
                                            if (var11 > var21) {
                                                var11 = var21;
                                            }
                                            if (var12 < var21) {
                                                var12 = var21;
                                            }
                                            ++var10;
                                            var15.method3430(var21);
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; ~var22 > ~arg6; ++var22) {
                            int var25 = super.field3441 * var22 + arg3;
                            for (int var26 = arg3; ~arg5 < ~var26; ++var26) {
                                if (arg7[-arg3 + var26][-arg4 + var22]) {
                                    short[] var27 = this.field3201[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; var27.length > var28; ++var28) {
                                            int var29 = var27[var28] & 65535;
                                            var15.method3422(var29);
                                            ++var10;
                                            if (~var12 > ~var29) {
                                                var12 = var29;
                                            }
                                            if (~var11 < ~var29) {
                                                var11 = var29;
                                            }
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method3424();
                    if (var9.method1485((byte) 37)) {
                        break;
                    }
                }
            }
            if (~var10 < -1) {
                this.field3190.method2527((byte) 84);
                this.field3190.method2587(false, -103);
                this.field3190.method2535(false, 106);
                this.field3190.method2571((byte) 125, false);
                this.field3190.method2594(false, (byte) -25);
                this.field3190.method2553((byte) 28, 0);
                this.field3190.method2526(0, -2, false, false);
                this.field3190.method2596((class466) null, 0);
                class691 var23 = this.field3190.method2598(12083);
                float[] var24 = this.field3190.method2556(0);
                var24[15] = 1.0F;
                var24[0] = (float) arg2 / ((float) super.field3432 * 128.0F * (float) this.field3190.field6076);
                var24[8] = 0.0F;
                var24[1] = 0.0F;
                var24[14] = -this.field3178 / (-this.field3178 + this.field3207);
                var24[7] = 0.0F;
                var24[3] = 0.0F;
                var24[6] = 0.0F;
                var24[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field3190.field6076) + -1.0F;
                var24[9] = 0.0F;
                var24[5] = (float) arg2 / ((float) super.field3432 * 128.0F * (float) this.field3190.field6103);
                var24[2] = 0.0F;
                var24[10] = 1.0F / (this.field3207 - this.field3178);
                var24[11] = 0.0F;
                var24[4] = 0.0F;
                var24[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field3190.field6103) + 1.0F;
                var23.method3892(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, false);
                this.field3190.method2539(0);
                this.field3190.method2588(120);
                if ((7 & this.field3200) != 0) {
                    this.field3190.method2535(true, 89);
                    this.field3190.method1693(false);
                } else {
                    this.field3190.method2535(false, 114);
                }
                this.field3190.method1682(false, (byte) -69);
                this.field3190.method1695((byte) -16, this.field3214, 0);
                this.field3190.method1695((byte) -16, this.field3216, 1);
                this.field3190.method1709(true, this.field3222);
                this.field3190.method1700(var12 + 1 - var11, class365.field4648, 0, 12896, var10 / 3, var11, var9);
                this.field3190.method1682(true, (byte) -66);
            }
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(III[[ZZ)V")
    public final void method1278(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        ++field3198;
        this.method1513(0, arg1, arg4, arg0, -1, arg3, arg2);
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Lgga;[I)V")
    public final void method1289(class332 arg0, int[] arg1) {
        ++field3199;
        this.field3179.method239(new class667(this.field3190, this, arg0, arg1), (byte) 93);
    }

    @OriginalMember(owner = "client!daa", name = "v", descriptor = "(IILha;)Lha;")
    public final class119 method1285(int arg0, int arg1, class119 arg2) {
        ++field3196;
        if ((this.field3186[arg0][arg1] & 1) == 0) {
            return null;
        } else {
            int var4 = super.field3432 >> this.field3190.field6241;
            class100 var5 = (class100) arg2;
            class100 var6;
            if (var5 != null && var5.method570(var4, -52, var4)) {
                var6 = var5;
                var5.method573(75);
            } else {
                var6 = new class100(this.field3190, var4, var4);
            }
            var6.method569(var4, 0, 1831282672, 0, var4);
            this.method1514(arg1, var6, arg0, -125);
            return var6;
        }
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Len;IIII[[I[[II)V")
    public class260(class478 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field3190 = arg0;
        this.field3193 = super.field3437 + -2;
        this.field3177 = new int[arg3][arg4][];
        this.field3200 = arg2;
        this.field3208 = 1 << this.field3193;
        this.field3202 = new class323[arg3][arg4][];
        this.field3186 = new byte[arg3][arg4];
        this.field3221 = new byte[arg3 - -1][arg4 - -1];
        this.field3201 = new short[arg3 * arg4][];
        this.field3220 = new float[super.field3441 - -1][super.field3440 + 1];
        this.field3185 = new int[arg3][arg4][];
        this.field3218 = new float[super.field3441 + 1][super.field3440 + 1];
        this.field3225 = new float[super.field3441 + 1][super.field3440 + 1];
        this.field3206 = new int[arg3][arg4][];
        this.field3204 = new int[arg3][arg4][];
        this.field3187 = new int[arg3][arg4][];
        for (int var9 = 0; var9 <= super.field3440; ++var9) {
            for (int var10 = 0; super.field3441 >= var10; ++var10) {
                int var11 = super.field3436[var10][var9];
                if (this.field3178 > (float) var11) {
                    this.field3178 = (float) var11;
                }
                if (this.field3207 < (float) var11) {
                    this.field3207 = (float) var11;
                }
                if (var10 > 0 && var9 > 0 && var10 < super.field3441 && ~var9 > ~super.field3440) {
                    int var12 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + arg7 * 4 * arg7 + var12 * var12)));
                    this.field3225[var10][var9] = (float) var12 * var14;
                    this.field3220[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field3218[var10][var9] = (float) var13 * var14;
                }
            }
        }
        ++this.field3207;
        --this.field3178;
        this.field3224 = new class68(128);
        if (~(16 & this.field3200) != -1) {
            this.field3183 = new class481(this.field3190, this);
        }
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(I)V")
    public static void method1515(int arg0) {
        if (arg0 != 1) {
            field3211 = null;
        }
        field3213 = null;
        field3195 = null;
        field3211 = null;
    }

    @OriginalMember(owner = "client!daa", name = "E", descriptor = "(Lha;IIIIZ)V")
    public final void method1284(class119 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3188;
        if (this.field3183 != null && arg0 != null) {
            int var7 = -(this.field3190.field6301 * arg2 >> 8) + arg1 >> this.field3190.field6241;
            int var8 = -(this.field3190.field6282 * arg2 >> 8) + arg3 >> this.field3190.field6241;
            this.field3183.method2617(false, var7, arg0, var8);
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Lkp;Lr;III)V")
    public static final void method1516(class507 arg0, class566 arg1, int arg2, int arg3, int arg4) {
        ++field3203;
        class600 var5 = arg0.method2740((byte) 125, arg1);
        if (var5 != null) {
            arg1.method1083(arg3, arg4, arg0.field6793 + arg3, arg0.field6700 + arg4);
            int var6 = 68 % ((77 - arg2) / 47);
            if (class135.field1758 != 2 && class135.field1758 != 5 && class570.field7976 != null) {
                int var7;
                int var8;
                int var9;
                int var10;
                if (class296.field3661 == 4) {
                    var7 = 16383 & (int) (-class331.field4223);
                    var8 = 4096;
                    var9 = class493.field6499;
                    var10 = class214.field2661;
                } else {
                    var8 = -(class354.field4510 * 16) + 4096;
                    var7 = 16383 & (int) (-class331.field4223) + class411.field5135;
                    var9 = class376.field4748.field6461;
                    var10 = class376.field4748.field6464;
                }
                int var11 = var9 / 128 + -((class431.field5395 + -104) * 2) + 48;
                int var12 = class452.field5802 * 4 + -(var10 / 128) + 48 + -(class452.field5802 * 2) + 208;
                class570.field7976.method2903((float) arg0.field6793 / 2.0F + (float) arg3, (float) arg0.field6700 / 2.0F + (float) arg4, (float) var11, (float) var12, var8, var7 << 2, var5, arg3, arg4);
                for (class262 var13 = (class262) class100.field1348.method237(110); var13 != null; var13 = (class262) class100.field1348.method245((byte) 25)) {
                    int var59 = var13.field3229;
                    int var60 = ((268432961 & class61.field827.field4266[var59]) >> 14) - class145.field1879;
                    int var61 = (class61.field827.field4266[var59] & 16383) - class630.field8817;
                    int var62 = var60 * 4 - -2 + -(var9 / 128);
                    int var63 = var61 * 4 + 2 + -(var10 / 128);
                    class83.method478(-95, arg4, var5, var63, arg0, var62, class61.field827.field4262[var59], arg3, arg1);
                }
                for (int var14 = 0; ~class651.field9190 < ~var14; ++var14) {
                    int var56 = class529.field7160[var14] * 4 + 2 + -(var9 / 128);
                    int var57 = class77.field1063[var14] * 4 + 2 - var10 / 128;
                    class441 var58 = class428.field5352.method3138((byte) 50, class530.field7166[var14]);
                    if (var58.field5574 != null) {
                        var58 = var58.method2355(class684.field9606, -1643);
                        if (var58 == null || var58.field5542 == -1) {
                            continue;
                        }
                    }
                    class83.method478(-99, arg4, var5, var57, arg0, var56, var58.field5542, arg3, arg1);
                }
                for (class650 var15 = (class650) class533.field7185.method407((byte) 124); var15 != null; var15 = (class650) class533.field7185.method403(12561)) {
                    int var51 = (int) (3L & var15.field4199 >> 28);
                    if (class20.field314 == var51) {
                        int var52 = (int) (var15.field4199 & 16383L) + -class145.field1879;
                        int var53 = -class630.field8817 + (int) (16383L & var15.field4199 >> 14);
                        int var54 = var52 * 4 + -(var9 / 128) + 2;
                        int var55 = var53 * 4 + -(var10 / 128) - -2;
                        class186.method1146(arg4, var55, var54, arg0, class128.field1606[0], arg3, (byte) -71, var5);
                    }
                }
                for (int var16 = 0; ~class470.field5974 < ~var16; ++var16) {
                    class206 var46 = (class206) class180.field2318.method399(-32748, (long) class153.field1958[var16]);
                    if (var46 != null) {
                        class307 var47 = var46.field2618;
                        if (var47.method1776(109) && ~class376.field4748.field6470 == ~var47.field6470) {
                            class586 var48 = var47.field3902;
                            if (var48 != null && var48.field8205 != null) {
                                var48 = var48.method3220(-4261, class684.field9606);
                            }
                            if (var48 != null && var48.field8234 && var48.field8180) {
                                int var49 = var47.field6461 / 128 - var9 / 128;
                                int var50 = var47.field6464 / 128 + -(var10 / 128);
                                if (var48.field8193 == -1) {
                                    class186.method1146(arg4, var50, var49, arg0, class128.field1606[1], arg3, (byte) 85, var5);
                                } else {
                                    class83.method478(-17, arg4, var5, var50, arg0, var49, var48.field8193, arg3, arg1);
                                }
                            }
                        }
                    }
                }
                int var17 = class596.field8384;
                int[] var18 = class354.field4521;
                for (int var19 = 0; ~var17 < ~var19; ++var19) {
                    class514 var38 = class351.field4490[var18[var19]];
                    if (var38 != null && var38.method2778(97) && class376.field4748 != var38 && ~class376.field4748.field6470 == ~var38.field6470) {
                        int var39 = var38.field6461 / 128 + -(var9 / 128);
                        int var40 = var38.field6464 / 128 + -(var10 / 128);
                        boolean var41 = false;
                        for (int var42 = 0; ~class66.field904 < ~var42; ++var42) {
                            if (var38.field7017.equals(class50.field708[var42]) && ~class223.field2796[var42] != -1) {
                                var41 = true;
                                break;
                            }
                        }
                        boolean var43 = false;
                        for (int var44 = 0; var44 < class313.field4023; ++var44) {
                            if (var38.field7017.equals(class516.field7046[var44].field6965)) {
                                var43 = true;
                                break;
                            }
                        }
                        boolean var45 = false;
                        if (class376.field4748.field7015 != 0 && var38.field7015 != 0 && class376.field4748.field7015 == var38.field7015) {
                            var45 = true;
                        }
                        if (!var38.field6985) {
                            if (!var41) {
                                if (var43) {
                                    class186.method1146(arg4, var40, var39, arg0, class128.field1606[5], arg3, (byte) -95, var5);
                                } else if (var45) {
                                    class186.method1146(arg4, var40, var39, arg0, class128.field1606[4], arg3, (byte) -128, var5);
                                } else {
                                    class186.method1146(arg4, var40, var39, arg0, class128.field1606[2], arg3, (byte) 106, var5);
                                }
                            } else {
                                class186.method1146(arg4, var40, var39, arg0, class128.field1606[3], arg3, (byte) 89, var5);
                            }
                        } else {
                            class186.method1146(arg4, var40, var39, arg0, class128.field1606[6], arg3, (byte) -90, var5);
                        }
                    }
                }
                class651[] var20 = class52.field784;
                for (int var21 = 0; ~var21 > ~var20.length; ++var21) {
                    class651 var24 = var20[var21];
                    if (var24 != null && var24.field9181 != 0 && class133.field1735 % 20 < 10) {
                        if (var24.field9181 == 1) {
                            class206 var25 = (class206) class180.field2318.method399(-32748, (long) var24.field9185);
                            if (var25 != null) {
                                class307 var26 = var25.field2618;
                                int var27 = var26.field6461 / 128 + -(var9 / 128);
                                int var28 = var26.field6464 / 128 + -(var10 / 128);
                                class411.method2177(var27, arg0, var24.field9182, (byte) -113, arg3, var5, var28, 360000L, arg4);
                            }
                        }
                        if (var24.field9181 == 2) {
                            int var29 = var24.field9194 / 128 + -(var9 / 128);
                            int var30 = var24.field9189 / 128 + -(var10 / 128);
                            long var31 = (long) (var24.field9186 << 7);
                            long var33 = var31 * var31;
                            class411.method2177(var29, arg0, var24.field9182, (byte) -113, arg3, var5, var30, var33, arg4);
                        }
                        if (var24.field9181 == 10 && var24.field9185 >= 0 && class351.field4490.length > var24.field9185) {
                            class514 var35 = class351.field4490[var24.field9185];
                            if (var35 != null) {
                                int var36 = var35.field6461 / 128 + -(var9 / 128);
                                int var37 = var35.field6464 / 128 + -(var10 / 128);
                                class411.method2177(var36, arg0, var24.field9182, (byte) -113, arg3, var5, var37, 360000L, arg4);
                            }
                        }
                    }
                }
                if (~class296.field3661 != -5) {
                    if (~class309.field3946 != -1) {
                        int var22 = -(var9 / 128) + 2 + class309.field3946 * 4 + (2 * class376.field4748.method2785(-1) - 2);
                        int var23 = -(var10 / 128) + class436.field5446 * 4 + 2 * class376.field4748.method2785(-1);
                        class186.method1146(arg4, var23, var22, arg0, class372.field4697[class520.field7095 ? 1 : 0], arg3, (byte) 108, var5);
                    }
                    arg1.method3118(-1, arg3 - -(arg0.field6793 / 2) + -1, arg4 - -(arg0.field6700 / 2) + -1, 1, 3, 3);
                }
            } else {
                arg1.method1012(-16777216, var5, arg3, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!daa", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1275(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field3173;
        if (arg5 != null && this.field3210 == null) {
            this.field3210 = new int[super.field3441][super.field3440][];
        }
        if (arg3 != null && this.field3206 == null) {
            this.field3206 = new int[super.field3441][super.field3440][];
        }
        this.field3187[arg0][arg1] = arg2;
        this.field3177[arg0][arg1] = arg4;
        this.field3204[arg0][arg1] = arg6;
        this.field3185[arg0][arg1] = arg7;
        if (this.field3210 != null) {
            this.field3210[arg0][arg1] = arg5;
        }
        if (this.field3206 != null) {
            this.field3206[arg0][arg1] = arg3;
        }
        class323[] var15 = this.field3202[arg0][arg1] = new class323[arg6.length];
        for (int var16 = 0; arg6.length > var16; ++var16) {
            long var17 = (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (arg9[var16] << 14) | (long) arg8[var16];
            class329 var19;
            for (var19 = this.field3224.method399(-32748, var17); var19 != null; var19 = this.field3224.method408((byte) 103)) {
                class323 var20 = (class323) var19;
                if (arg8[var16] == var20.field4136 && (float) arg9[var16] == var20.field4154 && ~var20.field4149 == ~arg10 && ~var20.field4152 == ~arg11 && ~var20.field4142 == ~arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class323) var19;
            } else {
                var15[var16] = new class323(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field3224.method402(var15[var16], (byte) -78, var17);
            }
        }
        if (arg13) {
            this.field3186[arg0][arg1] = (byte) class444.method2376(this.field3186[arg0][arg1], 1);
        }
        if (~this.field3219 > ~arg6.length) {
            this.field3219 = arg6.length;
        }
        this.field3217 += arg6.length;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(III)V")
    public final void method1281(int arg0, int arg1, int arg2) {
        if ((this.field3221[arg0][arg1] & 255) < arg2) {
            this.field3221[arg0][arg1] = (byte) arg2;
        }
        ++field3189;
    }
}
