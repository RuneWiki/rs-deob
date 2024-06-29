import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class535 extends class296 {

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "F")
    private float field7249 = -3.4028235E38F;

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "F")
    private float field7260 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "Ljia;")
    private class645 field7261 = new class645();

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "Lsf;")
    public class551 field7241;

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "I")
    private int field7265;

    @OriginalMember(owner = "client!ek", name = "Q", descriptor = "[[B")
    private byte[][] field7272;

    @OriginalMember(owner = "client!ek", name = "S", descriptor = "[[[Lfk;")
    private class680[][][] field7274;

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "I")
    private int field7257;

    @OriginalMember(owner = "client!ek", name = "U", descriptor = "[[F")
    private float[][] field7276;

    @OriginalMember(owner = "client!ek", name = "Z", descriptor = "[[F")
    private float[][] field7281;

    @OriginalMember(owner = "client!ek", name = "N", descriptor = "[[S")
    public short[][] field7269;

    @OriginalMember(owner = "client!ek", name = "P", descriptor = "[[[I")
    private int[][][] field7271;

    @OriginalMember(owner = "client!ek", name = "eb", descriptor = "[[F")
    private float[][] field7286;

    @OriginalMember(owner = "client!ek", name = "R", descriptor = "[[[I")
    public int[][][] field7273;

    @OriginalMember(owner = "client!ek", name = "M", descriptor = "[[[I")
    public int[][][] field7268;

    @OriginalMember(owner = "client!ek", name = "Y", descriptor = "[[B")
    private byte[][] field7280;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "[[[I")
    private int[][][] field7253;

    @OriginalMember(owner = "client!ek", name = "K", descriptor = "[[[I")
    public int[][][] field7266;

    @OriginalMember(owner = "client!ek", name = "O", descriptor = "I")
    public int field7270;

    @OriginalMember(owner = "client!ek", name = "W", descriptor = "Lcja;")
    private class46 field7278;

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "Lcm;")
    private class760 field7258;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    public static int field7248 = 0;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "Z")
    public static boolean field7251 = false;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field7239;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field7242;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field7243;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    private int field7244;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
    public static int field7246;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    private int field7247;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
    public static int field7250;

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
    public static int field7252;

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "I")
    public static int field7254;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "I")
    public static int field7255;

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "I")
    public static int field7256;

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "I")
    public static int field7262;

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "I")
    public static int field7263;

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "I")
    public static int field7264;

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "I")
    public static int field7267;

    @OriginalMember(owner = "client!ek", name = "T", descriptor = "I")
    public static int field7275;

    @OriginalMember(owner = "client!ek", name = "V", descriptor = "I")
    private int field7277;

    @OriginalMember(owner = "client!ek", name = "X", descriptor = "I")
    private int field7279;

    @OriginalMember(owner = "client!ek", name = "cb", descriptor = "Lwp;")
    public class193 field7284;

    @OriginalMember(owner = "client!ek", name = "bb", descriptor = "Lmha;")
    private class438 field7283;

    @OriginalMember(owner = "client!ek", name = "db", descriptor = "Lmha;")
    private class438 field7285;

    @OriginalMember(owner = "client!ek", name = "ab", descriptor = "[Lfk;")
    private class680[] field7282;

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "[[[I")
    private int[][][] field7259;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 5)
    public final void method1898(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field7240;
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
        for (int var28 = 0; ~var18 < ~var28; ++var28) {
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
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method1896(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BIZIIII[[Z)V", line = 88)
    private final void method3033(byte arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field7242;
        if (this.field7282 != null) {
            int var9 = arg4 + arg4 + 1;
            int var10 = var9 * var9;
            if (~class497.field6806.length > ~var10) {
                class497.field6806 = new int[var10];
            }
            int var11 = arg1 - arg4;
            int var12 = var11;
            if (var11 < 0) {
                var11 = 0;
            }
            int var13 = -arg4 + arg5;
            int var14 = var13;
            if (var13 < 0) {
                var13 = 0;
            }
            int var15 = arg1 + arg4;
            if (~var15 < ~(super.field4037 + -1)) {
                var15 = super.field4037 + -1;
            }
            int var16 = arg4 + arg5;
            if (~(super.field4034 + -1) > ~var16) {
                var16 = super.field4034 + -1;
            }
            class397.field5479 = 0;
            for (int var17 = var11; ~var15 <= ~var17; ++var17) {
                boolean[] var24 = arg7[-var12 + var17];
                for (int var25 = var13; var16 >= var25; ++var25) {
                    if (var24[-var14 + var25]) {
                        class497.field6806[class397.field5479++] = super.field4037 * var25 + var17;
                    }
                }
            }
            if (arg6 != -1) {
                this.field7241.method3144((float) arg6, -4902);
                this.field7241.method3147(-29742);
            } else {
                this.field7241.method3134((byte) 120);
            }
            this.field7241.method3140(arg0 ^ -25668);
            this.field7241.method3128((byte) 122, ~(this.field7270 & 7) != -1);
            this.field7241.method3131(-1, 0, false, false);
            this.field7241.method863(0, (byte) 105, this.field7285);
            for (int var18 = 0; this.field7282.length > var18; ++var18) {
                this.field7282[var18].method3836(class497.field6806, false, class397.field5479);
            }
            class421 var19 = this.field7241.method3096(false);
            var19.method1868(0, -1, 0);
            this.field7241.method3126(arg0 ^ -15);
            if (!this.field7261.method3586(0)) {
                int var20 = this.field7241.field7716;
                int var21 = this.field7241.field7740;
                this.field7241.method499(0, var21, this.field7241.field7735);
                this.field7241.method3128((byte) 99, false);
                this.field7241.method3112(false, (byte) 91);
                this.field7241.method3117(128, true);
                this.field7241.method3131(-2, 0, false, false);
                this.field7241.method3090(this.field7241.field7686, (byte) 71);
                this.field7241.method3118(class371.field5051, class671.field9318, 0);
                this.field7241.method3143(class633.field8767, true, 0);
                this.field7241.method3168((byte) 55, 0, class620.field8626);
                for (class154 var22 = this.field7261.method3589((byte) -128); var22 != null; var22 = this.field7261.method3591(0)) {
                    class572 var23 = (class572) var22;
                    var23.method3314(arg7, (byte) -71, arg5, arg1, arg4);
                }
                this.field7241.method3143(class327.field4459, true, 0);
                this.field7241.method3168((byte) 40, 0, class327.field4459);
                this.field7241.method3090((class416) null, (byte) -102);
                this.field7241.method499(var20, var21, this.field7241.field7735);
            }
            if (this.field7258 != null) {
                this.field7241.method863(0, (byte) 47, this.field7285);
                this.field7241.method863(1, (byte) 59, this.field7283);
                this.field7241.method846((byte) -101, this.field7284);
                this.field7258.method4201(arg7, arg5, arg4, arg2, (byte) 13, arg1);
            }
        }
        if (arg0 != -57) {
            this.field7258 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(III[[ZZII)V", line = 231)
    public final void method1906(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        ++field7262;
        this.method3033((byte) -57, arg0, arg4, arg6, arg2, arg1, arg5, arg3);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIIII[[Z)V", line = 250)
    public final void method1899(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field7275;
        if (this.field7279 > 0) {
            class226 var9 = this.field7241.method3136((byte) -108, this.field7247);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; var13 < 4; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method1545(true, -4450);
                if (var14 != null) {
                    Stream var15 = this.field7241.method3170((byte) 5, var14);
                    if (Stream.method3910()) {
                        for (int var16 = arg4; ~var16 > ~arg6; ++var16) {
                            int var17 = super.field4037 * var16 - -arg3;
                            for (int var18 = arg3; ~arg5 < ~var18; ++var18) {
                                if (arg7[-arg3 + var18][-arg4 + var16]) {
                                    short[] var19 = this.field7269[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; ~var20 > ~var19.length; ++var20) {
                                            int var21 = var19[var20] & 65535;
                                            ++var10;
                                            if (~var21 > ~var11) {
                                                var11 = var21;
                                            }
                                            var15.method3912(var21);
                                            if (var21 > var12) {
                                                var12 = var21;
                                            }
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; arg6 > var22; ++var22) {
                            int var25 = super.field4037 * var22 + arg3;
                            for (int var26 = arg3; var26 < arg5; ++var26) {
                                if (arg7[-arg3 + var26][var22 - arg4]) {
                                    short[] var27 = this.field7269[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; ~var27.length < ~var28; ++var28) {
                                            int var29 = 65535 & var27[var28];
                                            if (~var29 > ~var11) {
                                                var11 = var29;
                                            }
                                            ++var10;
                                            if (~var29 < ~var12) {
                                                var12 = var29;
                                            }
                                            var15.method3903(var29);
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method3901();
                    if (var9.method1544(127)) {
                        break;
                    }
                }
            }
            if (var10 > 0) {
                this.field7241.method3156((byte) 105);
                this.field7241.method3159(false, -32);
                this.field7241.method3128((byte) 94, false);
                this.field7241.method3092((byte) -105, false);
                this.field7241.method3112(false, (byte) 91);
                this.field7241.method3117(0, true);
                this.field7241.method3131(-2, 0, false, false);
                this.field7241.method3090((class416) null, (byte) -79);
                class421 var23 = this.field7241.method3096(false);
                float[] var24 = this.field7241.method3150(14);
                var24[9] = 0.0F;
                var24[10] = 1.0F / (-this.field7260 + this.field7249);
                var24[7] = 0.0F;
                var24[11] = 0.0F;
                var24[1] = 0.0F;
                var24[4] = 0.0F;
                var24[6] = 0.0F;
                var24[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field7241.field7662;
                var24[2] = 0.0F;
                var24[3] = 0.0F;
                var24[5] = (float) arg2 / ((float) super.field4035 * 128.0F * (float) this.field7241.field7661);
                var24[14] = -this.field7260 / (this.field7249 - this.field7260);
                var24[0] = (float) arg2 / ((float) super.field4035 * 128.0F * (float) this.field7241.field7662);
                var24[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field7241.field7661;
                var24[15] = 1.0F;
                var24[8] = 0.0F;
                var23.method2472(0.0F, 1.0F, 0.0F, (byte) -120, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
                this.field7241.method3093(-32);
                this.field7241.method3126(74);
                if ((7 & this.field7270) != 0) {
                    this.field7241.method3128((byte) 9, true);
                    this.field7241.method866((byte) -106);
                } else {
                    this.field7241.method3128((byte) 99, false);
                }
                this.field7241.method819(false, (byte) 1);
                this.field7241.method863(0, (byte) 82, this.field7285);
                this.field7241.method863(1, (byte) 127, this.field7283);
                this.field7241.method846((byte) -119, this.field7284);
                this.field7241.method830(-var11 + 1 + var12, var9, class501.field6860, (byte) -5, var10 / 3, var11, 0);
                this.field7241.method819(true, (byte) 1);
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "YA", descriptor = "()V", line = 445)
    public final void method1905() {
        ++field7245;
        if (this.field7279 <= 0) {
            this.field7258 = null;
        } else {
            byte[][] var1 = new byte[super.field4037 + 1][super.field4034 + 1];
            for (int var2 = 1; var2 < super.field4037; ++var2) {
                for (int var107 = 1; super.field4034 > var107; ++var107) {
                    var1[var2][var107] = (byte) ((this.field7280[var2][var107] >> 1) + (this.field7280[var2 + -1][var107] >> 2) + (this.field7280[var2][var107 + 1] >> 3) + (this.field7280[var2][var107 + -1] >> 2) + (this.field7280[var2 + 1][var107] >> 3));
                }
            }
            class680[] var3 = new class680[this.field7278.method343(-87)];
            this.field7278.method342(var3, -20773);
            for (int var4 = 0; var4 < var3.length; ++var4) {
                var3[var4].method3831((byte) 124, this.field7279);
            }
            int var5 = 20;
            if (this.field7259 != null) {
                var5 += 4;
            }
            if (~(this.field7270 & 7) != -1) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field7241.field7641.method3898(this.field7279 * 4, false);
            NativeHeapBuffer var7 = this.field7241.field7641.method3898(this.field7279 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class680[] var10 = new class680[this.field7279];
            int var11 = class484.method2765(this.field7279 / 4, 70);
            if (~var11 > -2) {
                var11 = 1;
            }
            class46 var12 = new class46(var11);
            class680[] var13 = new class680[this.field7277];
            for (int var14 = 0; ~super.field4037 < ~var14; ++var14) {
                for (int var34 = 0; ~super.field4034 < ~var34; ++var34) {
                    if (this.field7266[var14][var34] != null) {
                        class680[] var35 = this.field7274[var14][var34];
                        int[] var36 = this.field7273[var14][var34];
                        int[] var37 = this.field7268[var14][var34];
                        int[] var38 = this.field7253[var14][var34];
                        int[] var39 = this.field7266[var14][var34];
                        int[] var40 = this.field7271 != null ? this.field7271[var14][var34] : null;
                        if (var38 == null) {
                            var38 = var39;
                        }
                        int[] var41 = this.field7259 != null ? this.field7259[var14][var34] : null;
                        float var42 = this.field7286[var14][var34];
                        float var43 = this.field7281[var14][var34];
                        float var44 = this.field7276[var14][var34];
                        float var45 = this.field7286[var14][var34 + 1];
                        float var46 = this.field7281[var14][var34 - -1];
                        float var47 = this.field7276[var14][var34 + 1];
                        float var48 = this.field7286[var14 + 1][var34 + 1];
                        float var49 = this.field7281[var14 + 1][var34 + 1];
                        float var50 = this.field7276[var14 + 1][var34 + 1];
                        float var51 = this.field7286[var14 - -1][var34];
                        float var52 = this.field7281[var14 + 1][var34];
                        float var53 = this.field7276[var14 - -1][var34];
                        int var54 = 255 & var1[var14][var34];
                        int var55 = 255 & var1[var14][var34 + 1];
                        int var56 = 255 & var1[var14 + 1][var34 - -1];
                        int var57 = 255 & var1[var14 + 1][var34];
                        int var58 = 0;
                        label360: for (int var59 = 0; ~var59 > ~var39.length; ++var59) {
                            class680 var105 = var35[var59];
                            for (int var106 = 0; ~var58 < ~var106; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label360;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field7269[super.field4037 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; var39.length > var61; ++var61) {
                            int var62 = (var14 << super.field4036) + var36[var61];
                            int var63 = (var34 << super.field4036) - -var37[var61];
                            int var64 = var62 >> this.field7265;
                            int var65 = var63 >> this.field7265;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 == null ? 0 : var40[var61];
                            long var69 = (long) var65 | (long) (var64 << 16) | (long) var67 << 48 | (long) var66 << 32;
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75;
                            float var76;
                            float var77;
                            int var78;
                            if (~var71 == -1 && var72 == 0) {
                                var75 = var43;
                                var76 = var44;
                                var77 = var42;
                                var78 = var73 - var54;
                            } else if (~var71 == -1 && super.field4035 == var72) {
                                var77 = var45;
                                var76 = var47;
                                var78 = var73 - var55;
                                var75 = var46;
                            } else if (super.field4035 == var71 && super.field4035 == var72) {
                                var78 = var73 - var56;
                                var76 = var50;
                                var75 = var49;
                                var77 = var48;
                            } else if (super.field4035 == var71 && var72 == 0) {
                                var76 = var53;
                                var77 = var51;
                                var75 = var52;
                                var78 = var73 - var57;
                            } else {
                                float var79 = (float) var71 / (float) super.field4035;
                                float var80 = (float) var72 / (float) super.field4035;
                                float var81 = (-var42 + var51) * var79 + var42;
                                float var82 = (var52 - var43) * var79 + var43;
                                float var83 = (var53 - var44) * var79 + var44;
                                float var84 = (var48 - var45) * var79 + var45;
                                float var85 = (var49 - var46) * var79 + var46;
                                var75 = (-var82 + var85) * var80 + var82;
                                var77 = (-var81 + var84) * var80 + var81;
                                float var86 = (var50 - var47) * var79 + var47;
                                var76 = (-var83 + var86) * var80 + var83;
                                int var87 = ((var57 - var54) * var71 >> super.field4036) + var54;
                                int var88 = ((var56 - var55) * var71 >> super.field4036) + var55;
                                var78 = var73 - (((var88 - var87) * var72 >> super.field4036) + var87);
                            }
                            float var89 = 1.0F;
                            if (var66 != -1) {
                                int var90 = (127 & var66) * var78 >> 7;
                                if (var90 < 2) {
                                    var90 = 2;
                                } else if (~var90 < -127) {
                                    var90 = 126;
                                }
                                if (~(this.field7270 & 7) == -1) {
                                    float var91 = this.field7241.field7726[2] * var76 + this.field7241.field7726[1] * var75 + this.field7241.field7726[0] * var77;
                                    var89 = this.field7241.field7685 + var91 * (var91 > 0.0F ? this.field7241.field7721 : this.field7241.field7725);
                                }
                                var74 = class424.field5802[var90 | 65408 & var66];
                            }
                            class154 var92 = null;
                            if ((this.field7257 + -1 & var62) == 0 && ~(var63 & this.field7257 - 1) == -1) {
                                var92 = var12.method337(var69, 1);
                            }
                            int var93;
                            if (var92 != null) {
                                var60[var61] = ((class33) var92).field560;
                                var93 = var60[var61] & 65535;
                                if (~var66 != 0 && var35[var61].field2528 < var10[var93].field2528) {
                                    var10[var93] = var35[var61];
                                }
                            } else {
                                int var94;
                                if (var66 == var67) {
                                    var94 = var74;
                                } else {
                                    int var95 = (var67 & 127) * var78 >> 7;
                                    if (~var95 <= -3) {
                                        if (~var95 < -127) {
                                            var95 = 126;
                                        }
                                    } else {
                                        var95 = 2;
                                    }
                                    var94 = class424.field5802[var67 & 65408 | var95];
                                    if ((this.field7270 & 7) == 0) {
                                        float var96 = this.field7241.field7726[2] * var76 + this.field7241.field7726[0] * var77 + this.field7241.field7726[1] * var75;
                                        float var97 = this.field7241.field7685 + var89 * (var89 > 0.0F ? this.field7241.field7721 : this.field7241.field7725);
                                        int var98 = (var94 & 16761754) >> 16;
                                        int var99 = (var94 & 65446) >> 8;
                                        int var100 = 255 & var94;
                                        int var101 = (int) ((float) var98 * var97);
                                        if (~var101 > -1) {
                                            var101 = 0;
                                        } else if (~var101 < -256) {
                                            var101 = 255;
                                        }
                                        int var102 = (int) ((float) var99 * var97);
                                        if (var102 < 0) {
                                            var102 = 0;
                                        } else if (var102 > 255) {
                                            var102 = 255;
                                        }
                                        int var103 = (int) ((float) var100 * var97);
                                        if (var103 < 0) {
                                            var103 = 0;
                                        } else if (var103 > 255) {
                                            var103 = 255;
                                        }
                                        var94 = var103 | var101 << 16 | var102 << 8;
                                    }
                                }
                                if (!Stream.method3910()) {
                                    var8.method3909((float) var62);
                                    var8.method3909((float) (var68 + this.method1907(var62, (byte) 97, var63)));
                                    var8.method3909((float) var63);
                                    var8.method3909((float) var62);
                                    var8.method3909((float) var63);
                                    if (this.field7259 != null) {
                                        var8.method3909((float) (var41 == null ? 0 : var41[var61] + -1));
                                    }
                                    if ((this.field7270 & 7) != 0) {
                                        var8.method3909(var77);
                                        var8.method3909(var75);
                                        var8.method3909(var76);
                                    }
                                } else {
                                    var8.method3914((float) var62);
                                    var8.method3914((float) (this.method1907(var62, (byte) -35, var63) - -var68));
                                    var8.method3914((float) var63);
                                    var8.method3914((float) var62);
                                    var8.method3914((float) var63);
                                    if (this.field7259 != null) {
                                        var8.method3914((float) (var41 == null ? 0 : var41[var61] - 1));
                                    }
                                    if (~(this.field7270 & 7) != -1) {
                                        var8.method3914(var77);
                                        var8.method3914(var75);
                                        var8.method3914(var76);
                                    }
                                }
                                if (~this.field7241.field7694 != -1) {
                                    var9.method3905(-16777216 | var94);
                                } else {
                                    var9.method3913(var94 | -16777216);
                                }
                                var93 = this.field7244++;
                                var60[var61] = (short) var93;
                                if (~var66 != 0) {
                                    var10[var93] = var35[var61];
                                }
                                var12.method341(var69, new class33(var60[var61]), (byte) 56);
                            }
                            for (int var104 = 0; ~var58 < ~var104; ++var104) {
                                var13[var104].method3835((byte) -10, var74, var89, var93, var78);
                            }
                            ++this.field7247;
                        }
                    }
                }
            }
            for (int var15 = 0; var15 < this.field7244; ++var15) {
                class680 var33 = var10[var15];
                if (var33 != null) {
                    var33.method3829(var15, 131586);
                }
            }
            for (int var16 = 0; super.field4037 > var16; ++var16) {
                for (int var22 = 0; var22 < super.field4034; ++var22) {
                    short[] var23 = this.field7269[super.field4037 * var22 + var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (var23.length > var25) {
                            int var26 = var23[var25++] & 65535;
                            int var27 = 65535 & var23[var25++];
                            int var28 = var23[var25++] & 65535;
                            class680 var29 = var10[var26];
                            class680 var30 = var10[var27];
                            class680 var31 = var10[var28];
                            class680 var32 = null;
                            if (var29 != null) {
                                var29.method3834(var16, var24, (byte) -118, var22);
                                var32 = var29;
                            }
                            if (var30 != null) {
                                var30.method3834(var16, var24, (byte) -126, var22);
                                if (var32 == null || ~var32.field2528 < ~var30.field2528) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method3834(var16, var24, (byte) 0, var22);
                                if (var32 == null || var31.field2528 < var32.field2528) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method3829(var26, 131586);
                                }
                                if (var30 != null) {
                                    var32.method3829(var27, 131586);
                                }
                                if (var31 != null) {
                                    var32.method3829(var28, 131586);
                                }
                                var32.method3834(var16, var24, (byte) -123, var22);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method3901();
            var9.method3901();
            this.field7283 = this.field7241.method818(0, false);
            this.field7283.method1738(21990, var6, 4, this.field7244 * 4);
            this.field7285 = this.field7241.method818(0, false);
            this.field7285.method1738(21990, var7, var5, this.field7244 * var5);
            if ((7 & this.field7270) != 0) {
                if (this.field7259 != null) {
                    this.field7284 = this.field7241.method844(97, new class588[] { new class588(new class601[] { class601.field8400, class601.field8405, class601.field8404, class601.field8402 }), new class588(class601.field8403) });
                } else {
                    this.field7284 = this.field7241.method844(7, new class588[] { new class588(new class601[] { class601.field8400, class601.field8405, class601.field8402 }), new class588(class601.field8403) });
                }
            } else if (this.field7259 != null) {
                this.field7284 = this.field7241.method844(83, new class588[] { new class588(new class601[] { class601.field8400, class601.field8405, class601.field8404 }), new class588(class601.field8403) });
            } else {
                this.field7284 = this.field7241.method844(127, new class588[] { new class588(new class601[] { class601.field8400, class601.field8405 }), new class588(class601.field8403) });
            }
            int var17 = 0;
            for (int var18 = 0; var18 < var3.length; ++var18) {
                if (~var3[var18].field9478 < -1) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field7282 = new class680[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; ~var20 > ~var17; ++var20) {
                class680 var21 = var3[var20];
                var19[var20] = var21.field2528;
                this.field7282[var20] = var21;
                var21.method3832(this.field7244, -83);
            }
            class352.method2157(var19, (byte) -105, this.field7282);
            if (this.field7258 != null) {
                this.field7258.method4206(126);
            }
        }
        this.field7286 = this.field7281 = this.field7276 = null;
        this.field7274 = null;
        this.field7273 = this.field7268 = null;
        this.field7266 = null;
        this.field7259 = null;
        this.field7280 = null;
        this.field7253 = null;
        this.field7271 = null;
        this.field7278 = null;
    }

    @OriginalMember(owner = "client!ek", name = "fa", descriptor = "(IILr;)Lr;", line = 1049)
    public final class196 method1908(int arg0, int arg1, class196 arg2) {
        ++field7264;
        if ((1 & this.field7272[arg0][arg1]) == 0) {
            return null;
        } else {
            int var4 = super.field4035 >> this.field7241.field7706;
            class736 var5 = (class736) arg2;
            class736 var6;
            if (var5 != null && var5.method4086(var4, var4, (byte) 23)) {
                var6 = var5;
                var5.method4084((byte) -67);
            } else {
                var6 = new class736(this.field7241, var4, var4);
            }
            var6.method4087(var4, -34, var4, 0, 0);
            this.method3034(arg0, -29964, arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ek", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 1076)
    public final void method1904(class196 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7255;
        if (this.field7258 != null && arg0 != null) {
            int var7 = -(this.field7241.field7688 * arg2 >> 8) + arg1 >> this.field7241.field7706;
            int var8 = -(this.field7241.field7749 * arg2 >> 8) + arg3 >> this.field7241.field7706;
            this.field7258.method4209(var7, arg0, 1, var8);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIILip;)V", line = 1091)
    private final void method3034(int arg0, int arg1, int arg2, class736 arg3) {
        ++field7250;
        int[] var5 = this.field7273[arg0][arg2];
        int[] var6 = this.field7268[arg0][arg2];
        int var7 = var5.length;
        if (var7 > class445.field6122.length) {
            class445.field6122 = new int[var7];
            class789.field10822 = new int[var7];
        }
        for (int var8 = 0; var7 > var8; ++var8) {
            class445.field6122[var8] = var5[var8] >> this.field7241.field7706;
            class789.field10822[var8] = var6[var8] >> this.field7241.field7706;
        }
        if (arg1 != -29964) {
            this.field7260 = 0.22736003F;
        }
        int var9 = 0;
        while (var9 < var7) {
            int var10 = class445.field6122[var9];
            int var11 = class789.field10822[var9++];
            int var12 = class445.field6122[var9];
            int var13 = class789.field10822[var9++];
            int var14 = class445.field6122[var9];
            int var15 = class789.field10822[var9++];
            if (~((-var12 + var10) * (-var15 + var13) + -((var13 - var11) * (var14 - var12))) < -1) {
                arg3.method4082(var14, (byte) 121, var10, var15, var11, var13, var12);
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lsf;IIII[[I[[II)V", line = 1151)
    public class535(class551 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field7241 = arg0;
        this.field7265 = super.field4036 + -2;
        this.field7272 = new byte[arg3][arg4];
        this.field7274 = new class680[arg3][arg4][];
        this.field7257 = 1 << this.field7265;
        this.field7276 = new float[super.field4037 - -1][super.field4034 + 1];
        this.field7281 = new float[super.field4037 + 1][super.field4034 + 1];
        this.field7269 = new short[arg3 * arg4][];
        this.field7271 = new int[arg3][arg4][];
        this.field7286 = new float[super.field4037 - -1][super.field4034 + 1];
        this.field7273 = new int[arg3][arg4][];
        this.field7268 = new int[arg3][arg4][];
        this.field7280 = new byte[arg3 + 1][arg4 - -1];
        this.field7253 = new int[arg3][arg4][];
        this.field7266 = new int[arg3][arg4][];
        this.field7270 = arg2;
        for (int var9 = 0; var9 <= super.field4034; ++var9) {
            for (int var10 = 0; ~var10 >= ~super.field4037; ++var10) {
                int var11 = super.field4041[var10][var9];
                if ((float) var11 > this.field7249) {
                    this.field7249 = (float) var11;
                }
                if (this.field7260 > (float) var11) {
                    this.field7260 = (float) var11;
                }
                if (var10 > 0 && var9 > 0 && super.field4037 > var10 && ~var9 > ~super.field4034) {
                    int var12 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 - -1] - arg6[var10][var9 - 1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 - (-(arg7 * arg7 * 4) - var13 * var13))));
                    this.field7286[var10][var9] = (float) var12 * var14;
                    this.field7281[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field7276[var10][var9] = (float) var13 * var14;
                }
            }
        }
        ++this.field7249;
        --this.field7260;
        this.field7278 = new class46(128);
        if (~(this.field7270 & 16) != -1) {
            this.field7258 = new class760(this.field7241, this);
        }
    }

    @OriginalMember(owner = "client!ek", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 1225)
    public final void method1902(class196 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7243;
        if (this.field7258 != null && arg0 != null) {
            int var7 = -(this.field7241.field7688 * arg2 >> 8) + arg1 >> this.field7241.field7706;
            int var8 = -(this.field7241.field7749 * arg2 >> 8) + arg3 >> this.field7241.field7706;
            this.field7258.method4205((byte) -76, arg0, var7, var8);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V", line = 1247)
    public final void method1903(int arg0, int arg1) {
        ++field7267;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(III[[ZZI)V", line = 1256)
    public final void method1895(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field7263;
        this.method3033((byte) -57, arg0, arg4, arg5, arg2, arg1, -1, arg3);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lbq;[I)V", line = 1268)
    public final void method1900(class307 arg0, int[] arg1) {
        this.field7261.method3594((byte) -115, new class572(this.field7241, this, arg0, arg1));
        ++field7239;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 1282)
    public final boolean method1901(class196 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7254;
        if (this.field7258 != null && arg0 != null) {
            int var7 = -(this.field7241.field7688 * arg2 >> 8) + arg1 >> this.field7241.field7706;
            int var8 = -(this.field7241.field7749 * arg2 >> 8) + arg3 >> this.field7241.field7706;
            return this.field7258.method4202(var7, (byte) 126, var8, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ek", name = "ka", descriptor = "(III)V", line = 1298)
    public final void method1894(int arg0, int arg1, int arg2) {
        ++field7256;
        if (~arg2 < ~(this.field7280[arg0][arg1] & 255)) {
            this.field7280[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!ek", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1310)
    public final void method1896(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field7252;
        if (arg5 != null && this.field7259 == null) {
            this.field7259 = new int[super.field4037][super.field4034][];
        }
        if (arg3 != null && this.field7271 == null) {
            this.field7271 = new int[super.field4037][super.field4034][];
        }
        class162 var15 = this.field7241.field970;
        this.field7273[arg0][arg1] = arg2;
        this.field7268[arg0][arg1] = arg4;
        this.field7266[arg0][arg1] = arg6;
        this.field7253[arg0][arg1] = arg7;
        if (this.field7259 != null) {
            this.field7259[arg0][arg1] = arg5;
        }
        if (this.field7271 != null) {
            this.field7271[arg0][arg1] = arg3;
        }
        class680[] var16 = this.field7274[arg0][arg1] = new class680[arg6.length];
        for (int var17 = 0; ~var17 > ~arg6.length; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if (~(this.field7270 & 32) != -1 && var18 != -1 && var15.method1270(var18, true).field4244) {
                var19 = 128;
                var18 = -1;
            }
            long var20 = (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (var19 << 14) | (long) var18;
            class154 var22;
            for (var22 = this.field7278.method337(var20, 1); var22 != null; var22 = this.field7278.method344((byte) 90)) {
                class680 var23 = (class680) var22;
                if (~var23.field9462 == ~var18 && (float) var19 == var23.field9468 && ~var23.field9471 == ~arg10 && ~var23.field9477 == ~arg11 && var23.field9470 == arg12) {
                    break;
                }
            }
            if (var22 == null) {
                var16[var17] = new class680(this, var18, var19, arg10, arg11, arg12);
                this.field7278.method341(var20, var16[var17], (byte) 110);
            } else {
                var16[var17] = (class680) var22;
            }
        }
        if (arg13) {
            this.field7272[arg0][arg1] = (byte) class530.method3011(this.field7272[arg0][arg1], 1);
        }
        if (arg6.length > this.field7277) {
            this.field7277 = arg6.length;
        }
        this.field7279 += arg6.length;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BI)V", line = 1402)
    public static final void method3035(byte arg0, int arg1) {
        ++field7246;
        if (class586.field8285 != arg1) {
            class483.field6515 = class65.field926 = class703.field9673[arg1];
            class741.method4102(false);
            if (arg0 >= 38) {
                class74.field1069 = new int[class483.field6515][class65.field926];
                class220.field3229 = new int[4][class483.field6515 >> 3][class65.field926 >> 3];
                class78.field1107 = new int[class483.field6515][class65.field926];
                for (int var2 = 0; ~var2 > -5; ++var2) {
                    class711.field9798[var2] = class257.method1680(class483.field6515, class65.field926, -57);
                }
                class101.field1628 = new byte[4][class483.field6515][class65.field926];
                class245.method1637(class483.field6515, 4, class65.field926, -100);
                class7.method49(class65.field926 >> 3, class95.field1472, class483.field6515 >> 3, 118);
                class586.field8285 = arg1;
            }
        }
    }
}
