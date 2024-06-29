import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class220 extends class35 {

    @OriginalMember(owner = "client!on", name = "t", descriptor = "Lvp;")
    private class123 field3239 = new class123();

    @OriginalMember(owner = "client!on", name = "J", descriptor = "[[I")
    private int[][] field3255;

    @OriginalMember(owner = "client!on", name = "r", descriptor = "I")
    private int field3237;

    @OriginalMember(owner = "client!on", name = "D", descriptor = "Lod;")
    public class349 field3249;

    @OriginalMember(owner = "client!on", name = "Y", descriptor = "[[F")
    private float[][] field3270;

    @OriginalMember(owner = "client!on", name = "Q", descriptor = "[[B")
    private byte[][] field3262;

    @OriginalMember(owner = "client!on", name = "F", descriptor = "[[S")
    public short[][] field3251;

    @OriginalMember(owner = "client!on", name = "R", descriptor = "[[[I")
    private int[][][] field3263;

    @OriginalMember(owner = "client!on", name = "E", descriptor = "[[[I")
    public int[][][] field3250;

    @OriginalMember(owner = "client!on", name = "V", descriptor = "[[B")
    private byte[][] field3267;

    @OriginalMember(owner = "client!on", name = "C", descriptor = "[[[I")
    private int[][][] field3248;

    @OriginalMember(owner = "client!on", name = "j", descriptor = "I")
    private int field3229;

    @OriginalMember(owner = "client!on", name = "Z", descriptor = "[[F")
    private float[][] field3271;

    @OriginalMember(owner = "client!on", name = "U", descriptor = "[[F")
    private float[][] field3266;

    @OriginalMember(owner = "client!on", name = "x", descriptor = "[[[I")
    private int[][][] field3243;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "[[[I")
    public int[][][] field3235;

    @OriginalMember(owner = "client!on", name = "I", descriptor = "[[[Lkq;")
    private class418[][][] field3254;

    @OriginalMember(owner = "client!on", name = "z", descriptor = "I")
    public int field3245;

    @OriginalMember(owner = "client!on", name = "bb", descriptor = "Lwa;")
    private class433 field3273;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "Lgf;")
    private class180 field3231;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!on", name = "v", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!on", name = "w", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!on", name = "y", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!on", name = "A", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!on", name = "B", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!on", name = "G", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!on", name = "H", descriptor = "I")
    private int field3253;

    @OriginalMember(owner = "client!on", name = "K", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!on", name = "L", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!on", name = "N", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!on", name = "O", descriptor = "I")
    private int field3260;

    @OriginalMember(owner = "client!on", name = "P", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!on", name = "S", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!on", name = "T", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!on", name = "W", descriptor = "I")
    private int field3268;

    @OriginalMember(owner = "client!on", name = "gb", descriptor = "I")
    private int field3278;

    @OriginalMember(owner = "client!on", name = "db", descriptor = "Lnc;")
    private class21 field3275;

    @OriginalMember(owner = "client!on", name = "X", descriptor = "Lbg;")
    public class323 field3269;

    @OriginalMember(owner = "client!on", name = "ab", descriptor = "Lbg;")
    public class323 field3272;

    @OriginalMember(owner = "client!on", name = "cb", descriptor = "Lbg;")
    public class323 field3274;

    @OriginalMember(owner = "client!on", name = "eb", descriptor = "Lbg;")
    private class323 field3276;

    @OriginalMember(owner = "client!on", name = "u", descriptor = "Loa;")
    public static class489 field3240;

    @OriginalMember(owner = "client!on", name = "s", descriptor = "[I")
    public static int[] field3238;

    @OriginalMember(owner = "client!on", name = "fb", descriptor = "[Lkq;")
    private class418[] field3277;

    @OriginalMember(owner = "client!on", name = "M", descriptor = "[[[I")
    private int[][][] field3258;

    static {
        new class475((String) null, "Dieses System darf nicht missbraucht werden!", (String) null, (String) null);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(III[[ZZ)V", line = 14)
    public final void method207(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method1521(-1, arg0, arg3, arg4, arg2, arg1, -32559);
        ++field3264;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIIII[[Z)V", line = 26)
    public final void method203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field3236;
        if (this.field3278 > 0) {
            this.field3249.method2152(111);
            this.field3249.method2165(-67, false);
            this.field3249.method2130(44, false);
            this.field3249.method2168(123, false);
            this.field3249.method2177(3678, false);
            this.field3249.method2162(0, 1);
            this.field3249.method2161(122, -2);
            this.field3249.method2200((class446) null, (byte) 117);
            class70.field1062[3] = 0.0F;
            class70.field1062[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field3249.field5175) + 1.0F;
            class70.field1062[15] = 1.0F;
            class70.field1062[8] = 0.0F;
            class70.field1062[1] = 0.0F;
            class70.field1062[5] = (float) arg2 / ((float) super.field365 * 128.0F * (float) this.field3249.field5175);
            class70.field1062[11] = 0.0F;
            class70.field1062[6] = 0.0F;
            class70.field1062[9] = 0.0F;
            class70.field1062[2] = 0.0F;
            class70.field1062[10] = 0.0F;
            class70.field1062[4] = 0.0F;
            class70.field1062[7] = 0.0F;
            class70.field1062[14] = 0.0F;
            class70.field1062[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field3249.field5057) + -1.0F;
            class70.field1062[0] = (float) arg2 / ((float) super.field365 * 128.0F * (float) this.field3249.field5057);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class70.field1062, 0);
            class70.field1062[14] = 0.0F;
            class70.field1062[15] = 1.0F;
            class70.field1062[5] = 0.0F;
            class70.field1062[11] = 0.0F;
            class70.field1062[10] = 0.0F;
            class70.field1062[6] = 1.0F;
            class70.field1062[1] = 0.0F;
            class70.field1062[7] = 0.0F;
            class70.field1062[13] = 0.0F;
            class70.field1062[4] = 0.0F;
            class70.field1062[8] = 0.0F;
            class70.field1062[0] = 1.0F;
            class70.field1062[12] = 0.0F;
            class70.field1062[9] = 1.0F;
            class70.field1062[3] = 0.0F;
            class70.field1062[2] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class70.field1062, 0);
            if (~(this.field3245 & 7) != -1) {
                this.field3249.method2130(46, true);
                this.field3249.method2187(-9463);
            } else {
                this.field3249.method2130(108, false);
            }
            this.field3249.method2173((byte) 126, this.field3274, this.field3276, this.field3269, this.field3272);
            if (class415.field6228.field3036.length < this.field3253 * 2) {
                class415.field6228 = new class209(this.field3253 * 2);
            } else {
                class415.field6228.field3037 = 0;
            }
            int var9 = 0;
            if (!this.field3249.field5313) {
                for (int var10 = arg4; var10 < arg6; ++var10) {
                    int var11 = super.field370 * var10 + arg3;
                    for (int var12 = arg3; var12 < arg5; ++var12) {
                        if (arg7[-arg3 + var12][var10 - arg4]) {
                            short[] var13 = this.field3251[var11];
                            if (var13 != null) {
                                for (int var14 = 0; var14 < var13.length; ++var14) {
                                    class415.field6228.method1453((byte) -106, var13[var14] & 65535);
                                    ++var9;
                                }
                            }
                        }
                        ++var11;
                    }
                }
            } else {
                for (int var15 = arg4; var15 < arg6; ++var15) {
                    int var17 = super.field370 * var15 - -arg3;
                    for (int var18 = arg3; ~arg5 < ~var18; ++var18) {
                        if (arg7[-arg3 + var18][-arg4 + var15]) {
                            short[] var19 = this.field3251[var17];
                            if (var19 != null) {
                                for (int var20 = 0; ~var19.length < ~var20; ++var20) {
                                    ++var9;
                                    class415.field6228.method1413(-128, 65535 & var19[var20]);
                                }
                            }
                        }
                        ++var17;
                    }
                }
            }
            if (~var9 < -1) {
                class131 var16 = new class131(this.field3249, 5123, class415.field6228.field3036, class415.field6228.field3037);
                this.field3249.method2136(var9, 4, 0, var16, (byte) -56);
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "U", descriptor = "(Lj;IIIIZ)V", line = 193)
    public final void method205(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3265;
        if (this.field3231 != null && arg0 != null) {
            int var7 = arg1 - (this.field3249.field5300 * arg2 >> 8) >> this.field3249.field5231;
            int var8 = -(this.field3249.field5322 * arg2 >> 8) + arg3 >> this.field3249.field5231;
            this.field3231.method1224(arg0, var8, var7, 1);
        }
    }

    @OriginalMember(owner = "client!on", name = "QA", descriptor = "(III)V", line = 210)
    public final void method198(int arg0, int arg1, int arg2) {
        if (arg2 > (255 & this.field3267[arg0][arg1])) {
            this.field3267[arg0][arg1] = (byte) arg2;
        }
        ++field3246;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IZII)I", line = 222)
    public static final int method1520(int arg0, boolean arg1, int arg2, int arg3) {
        ++field3232;
        class138 var4 = class307.method1936((byte) -60, arg1, arg2);
        if (var4 == null) {
            return 0;
        } else {
            int var5 = -91 / ((arg0 - -35) / 42);
            return ~arg3 <= -1 && ~var4.field2081.length < ~arg3 ? var4.field2081[arg3] : 0;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(II[[ZZIII)V", line = 244)
    private final void method1521(int arg0, int arg1, boolean[][] arg2, boolean arg3, int arg4, int arg5, int arg6) {
        ++field3241;
        if (this.field3277 != null) {
            float var8 = this.field3249.field5333;
            float var9 = this.field3249.field5368;
            int var10 = arg4 + arg4 + 1;
            int var11 = var10 * var10;
            if (var11 > class454.field6736.length) {
                class454.field6736 = new int[var11];
            }
            if (this.field3253 * 2 > class415.field6228.field3036.length) {
                class415.field6228 = new class209(this.field3253 * 2);
            }
            int var12 = -arg4 + arg1;
            int var13 = var12;
            if (var12 < 0) {
                var12 = 0;
            }
            int var14 = -arg4 + arg5;
            int var15 = var14;
            if (var14 < 0) {
                var14 = 0;
            }
            int var16 = arg1 + arg4;
            if (super.field370 + -1 < var16) {
                var16 = super.field370 + -1;
            }
            int var17 = arg4 + arg5;
            if (super.field369 - 1 < var17) {
                var17 = super.field369 + -1;
            }
            class349.field5143 = 0;
            for (int var18 = var12; var16 >= var18; ++var18) {
                boolean[] var24 = arg2[-var13 + var18];
                for (int var25 = var14; var25 <= var17; ++var25) {
                    if (var24[-var15 + var25]) {
                        class454.field6736[class349.field5143++] = super.field370 * var25 + var18;
                    }
                }
            }
            if (arg0 == -1) {
                this.field3249.method2142(-2);
            } else {
                this.field3249.method2175((float) arg0, (byte) -103);
                this.field3249.method2178(arg6 ^ -31180);
            }
            this.field3249.method2130(21, ~(this.field3245 & 7) != -1);
            for (int var19 = 0; var19 < this.field3277.length; ++var19) {
                this.field3277[var19].method2512(-31424, class454.field6736, class349.field5143);
            }
            if (!this.field3239.method823((byte) 93)) {
                int var20 = this.field3249.field5350;
                int var21 = this.field3249.field5323;
                this.field3249.method1052(0, var21, this.field3249.field5367);
                this.field3249.method1039(var9, var8 - 4.0F);
                this.field3249.method2130(21, false);
                this.field3249.method2177(3678, false);
                this.field3249.method2162(128, 1);
                this.field3249.method2161(arg6 + 32673, -2);
                this.field3249.method2200(this.field3249.field5296, (byte) 125);
                this.field3249.method2131(34162, 7681, 8448);
                this.field3249.method2156(34166, 770, 2969, 0);
                this.field3249.method2135(0, 34167, arg6 ^ 32531, 770);
                for (class337 var22 = this.field3239.method816(123); var22 != null; var22 = this.field3239.method812(87)) {
                    class41 var23 = (class41) var22;
                    var23.method248(arg1, arg2, arg5, (byte) -116, arg4);
                }
                this.field3249.method2156(5890, 768, arg6 + 35528, 0);
                this.field3249.method2135(0, 5890, -111, 770);
                this.field3249.method2200((class446) null, (byte) 114);
                this.field3249.method1052(var20, var21, this.field3249.field5367);
            }
            if (this.field3231 != null) {
                this.field3249.method1039(var9, var8 - 8.0F);
                this.field3249.method2142(-2);
                this.field3249.method2173((byte) 108, this.field3274, (class323) null, (class323) null, this.field3272);
                this.field3231.method1226(arg3, arg1, arg2, -19762, arg4, arg5);
            }
            this.field3249.method1039(var9, var8);
        }
        if (arg6 != -32559) {
            this.field3278 = 72;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(II)V", line = 390)
    public final void method204(int arg0, int arg1) {
        ++field3259;
    }

    @OriginalMember(owner = "client!on", name = "SA", descriptor = "(Lj;IIIIZ)V", line = 397)
    public final void method208(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3257;
        if (this.field3231 != null && arg0 != null) {
            int var7 = -(this.field3249.field5300 * arg2 >> 8) + arg1 >> this.field3249.field5231;
            int var8 = arg3 - (this.field3249.field5322 * arg2 >> 8) >> this.field3249.field5231;
            this.field3231.method1228(var7, var8, 28246, arg0);
        }
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lod;IIII[[I[[II)V", line = 415)
    public class220(class349 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field3255 = arg5;
        this.field3237 = super.field372 + -2;
        this.field3249 = arg0;
        this.field3270 = new float[super.field370 + 1][super.field369 - -1];
        this.field3262 = new byte[arg3][arg4];
        this.field3251 = new short[arg3 * arg4][];
        this.field3263 = new int[arg3][arg4][];
        this.field3250 = new int[arg3][arg4][];
        this.field3267 = new byte[arg3 + 1][arg4 + 1];
        this.field3248 = new int[arg3][arg4][];
        this.field3229 = 1 << this.field3237;
        this.field3271 = new float[super.field370 + 1][super.field369 + 1];
        this.field3266 = new float[super.field370 + 1][super.field369 + 1];
        this.field3243 = new int[arg3][arg4][];
        this.field3235 = new int[arg3][arg4][];
        this.field3254 = new class418[arg3][arg4][];
        this.field3245 = arg2;
        for (int var9 = 1; ~super.field369 < ~var9; ++var9) {
            for (int var10 = 1; super.field370 > var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] - arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] - arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var11 * var11 - -(arg7 * 4 * arg7) - -(var12 * var12))));
                this.field3266[var10][var9] = (float) var11 * var13;
                this.field3270[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field3271[var10][var9] = (float) var12 * var13;
            }
        }
        this.field3273 = new class433(128);
        if (~(this.field3245 & 16) != -1) {
            this.field3231 = new class180(this.field3249, this);
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V", line = 473)
    public static void method1522(int arg0) {
        if (arg0 > -29) {
            method1520(5, true, 4, -123);
        }
        field3238 = null;
        field3240 = null;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lkt;[I)V", line = 486)
    public final void method200(class107 arg0, int[] arg1) {
        this.field3239.method809(new class41(this.field3249, this, arg0, arg1), false);
        ++field3233;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 504)
    public final void method195(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field3247;
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
        for (int var28 = 0; var28 < var18; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
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
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
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
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method206(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!on", name = "va", descriptor = "(II)I", line = 597)
    public final int method202(int arg0, int arg1) {
        ++field3252;
        int var3 = arg0 >> super.field372;
        int var4 = arg1 >> super.field372;
        if (~var3 <= -1 && ~var4 <= -1 && ~(super.field370 + -1) <= ~var3 && ~(super.field369 - 1) <= ~var4) {
            int var5 = super.field365 + -1 & arg0;
            int var6 = arg1 & super.field365 + -1;
            int var7 = (super.field365 - var5) * this.field3255[var3][var4] + this.field3255[var3 + 1][var4] * var5 >> super.field372;
            int var8 = (super.field365 - var5) * this.field3255[var3][var4 + 1] + this.field3255[var3 + 1][var4 + 1] * var5 >> super.field372;
            return (super.field365 - var6) * var7 + var6 * var8 >> super.field372;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!on", name = "O", descriptor = "(IILj;)Lj;", line = 626)
    public final class377 method197(int arg0, int arg1, class377 arg2) {
        ++field3230;
        if (~(this.field3262[arg0][arg1] & 1) == -1) {
            return null;
        } else {
            int var4 = super.field365 >> this.field3249.field5231;
            class478 var5 = (class478) arg2;
            class478 var6;
            if (var5 != null && var5.method2851(var4, true, var4)) {
                var6 = var5;
                var5.method2847((byte) -17);
            } else {
                var6 = new class478(this.field3249, var4, var4);
            }
            var6.method2852(0, -11470, 0, var4, var4);
            this.method1523(var6, arg1, true, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lqf;IZI)V", line = 661)
    private final void method1523(class478 arg0, int arg1, boolean arg2, int arg3) {
        ++field3242;
        int[] var5 = this.field3250[arg3][arg1];
        int[] var6 = this.field3235[arg3][arg1];
        if (!arg2) {
            this.field3262 = null;
        }
        int var7 = var5.length;
        if (var7 > class77.field1148.length) {
            class76.field1132 = new int[var7];
            class77.field1148 = new int[var7];
        }
        for (int var8 = 0; var7 > var8; ++var8) {
            class77.field1148[var8] = class286.method1847(255, var5[var8]) >> this.field3249.field5231;
            class76.field1132[var8] = class286.method1847(var6[var8], 255) >> this.field3249.field5231;
        }
        int var9 = 0;
        while (var9 < var7) {
            int var10 = class77.field1148[var9];
            int var11 = class76.field1132[var9++];
            int var12 = class77.field1148[var9];
            int var13 = class76.field1132[var9++];
            int var14 = class77.field1148[var9];
            int var15 = class76.field1132[var9++];
            if (~((var10 - var12) * (-var15 + var13) + -((-var11 + var13) * (-var12 + var14))) < -1) {
                arg0.method2846(var14, (byte) -57, var13, var10, var11, var15, var12);
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "f", descriptor = "()V", line = 718)
    public final void method199() {
        ++field3234;
        if (~this.field3278 >= -1) {
            this.field3231 = null;
        } else {
            byte[][] var1 = new byte[super.field370 + 1][super.field369 + 1];
            for (int var2 = 1; ~var2 > ~super.field370; ++var2) {
                for (int var103 = 1; ~super.field369 < ~var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field3267[var2][var103 + 1] >> 3) + (this.field3267[var2][var103] >> 1) + (this.field3267[var2 + 1][var103] >> 3) + (this.field3267[var2][var103 + -1] >> 2) + (this.field3267[var2 + -1][var103] >> 2));
                }
            }
            this.field3277 = new class418[this.field3273.method2602(0)];
            this.field3273.method2599((byte) -72, this.field3277);
            for (int var3 = 0; ~this.field3277.length < ~var3; ++var3) {
                this.field3277[var3].method2504((byte) -118, this.field3278);
            }
            int var4 = 24;
            if (this.field3258 != null) {
                var4 += 4;
            }
            if (~(7 & this.field3245) != -1) {
                var4 += 12;
            }
            NativeBuffer var5 = this.field3249.field5230.method2646(this.field3278 * var4);
            NativeStream var6 = new NativeStream(var5);
            class418[] var7 = new class418[this.field3278];
            int var8 = class293.method1867(this.field3278 / 4, -210300991);
            if (var8 < 1) {
                var8 = 1;
            }
            class433 var9 = new class433(var8);
            class418[] var10 = new class418[this.field3268];
            for (int var11 = 0; super.field370 > var11; ++var11) {
                for (int var30 = 0; var30 < super.field369; ++var30) {
                    if (this.field3248[var11][var30] != null) {
                        class418[] var31 = this.field3254[var11][var30];
                        int[] var32 = this.field3250[var11][var30];
                        int[] var33 = this.field3235[var11][var30];
                        int[] var34 = this.field3263[var11][var30];
                        int[] var35 = this.field3248[var11][var30];
                        int[] var36 = this.field3243 == null ? null : this.field3243[var11][var30];
                        int[] var37 = this.field3258 != null ? this.field3258[var11][var30] : null;
                        if (var34 == null) {
                            var34 = var35;
                        }
                        float var38 = this.field3266[var11][var30];
                        float var39 = this.field3270[var11][var30];
                        float var40 = this.field3271[var11][var30];
                        float var41 = this.field3266[var11][var30 + 1];
                        float var42 = this.field3270[var11][var30 - -1];
                        float var43 = this.field3271[var11][var30 + 1];
                        float var44 = this.field3266[var11 + 1][var30 + 1];
                        float var45 = this.field3270[var11 + 1][var30 - -1];
                        float var46 = this.field3271[var11 + 1][var30 - -1];
                        float var47 = this.field3266[var11 - -1][var30];
                        float var48 = this.field3270[var11 - -1][var30];
                        float var49 = this.field3271[var11 + 1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = 255 & var1[var11][var30 - -1];
                        int var52 = 255 & var1[var11 - -1][var30 + 1];
                        int var53 = 255 & var1[var11 - -1][var30];
                        int var54 = 0;
                        label340: for (int var55 = 0; ~var55 > ~var35.length; ++var55) {
                            class418 var101 = var31[var55];
                            for (int var102 = 0; var54 > var102; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label340;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field3251[super.field370 * var30 - -var11] = new short[var35.length];
                        for (int var57 = 0; var35.length > var57; ++var57) {
                            int var58 = (var11 << super.field372) + var32[var57];
                            int var59 = (var30 << super.field372) + var33[var57];
                            int var60 = var58 >> this.field3237;
                            int var61 = var59 >> this.field3237;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 == null ? 0 : var36[var57];
                            long var65 = (long) (var60 << 16) | (long) var62 << 32 | (long) var63 << 48 | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71;
                            int var72;
                            float var73;
                            float var74;
                            if (var67 == 0 && ~var68 == -1) {
                                var71 = var38;
                                var72 = var69 - var50;
                                var73 = var40;
                                var74 = var39;
                            } else if (var67 == 0 && ~super.field365 == ~var68) {
                                var72 = var69 - var51;
                                var71 = var41;
                                var74 = var42;
                                var73 = var43;
                            } else if (~super.field365 == ~var67 && ~super.field365 == ~var68) {
                                var73 = var46;
                                var71 = var44;
                                var74 = var45;
                                var72 = var69 - var52;
                            } else if (super.field365 == var67 && ~var68 == -1) {
                                var71 = var47;
                                var73 = var49;
                                var74 = var48;
                                var72 = var69 - var53;
                            } else {
                                float var75 = (float) var67 / (float) super.field365;
                                float var76 = (float) var68 / (float) super.field365;
                                float var77 = (var47 - var38) * var75 + var38;
                                float var78 = (var48 - var39) * var75 + var39;
                                float var79 = (-var40 + var49) * var75 + var40;
                                float var80 = (-var41 + var44) * var75 + var41;
                                float var81 = (-var42 + var45) * var75 + var42;
                                float var82 = (-var43 + var46) * var75 + var43;
                                var71 = (var80 - var77) * var76 + var77;
                                var74 = (var81 - var78) * var76 + var78;
                                var73 = (var82 - var79) * var76 + var79;
                                int var83 = ((var53 - var50) * var67 >> super.field372) + var50;
                                int var84 = var51 - -((-var51 + var52) * var67 >> super.field372);
                                var72 = var69 - (((-var83 + var84) * var68 >> super.field372) + var83);
                            }
                            float var85 = 1.0F;
                            if (~var62 != 0) {
                                int var86 = (127 & var62) * var72 >> 7;
                                if (~var86 <= -3) {
                                    if (var86 > 126) {
                                        var86 = 126;
                                    }
                                } else {
                                    var86 = 2;
                                }
                                if (~(this.field3245 & 7) == -1) {
                                    float var87 = this.field3249.field5341[2] * var73 + this.field3249.field5341[1] * var74 + this.field3249.field5341[0] * var71;
                                    var85 = this.field3249.field5307 + (!(var87 > 0.0F) ? this.field3249.field5276 : this.field3249.field5266) * var87;
                                }
                                var70 = class508.field7410[var62 & 65408 | var86];
                            }
                            class337 var88 = null;
                            if (~(this.field3229 + -1 & var58) == -1 && ~(this.field3229 + -1 & var59) == -1) {
                                var88 = var9.method2605(false, var65);
                            }
                            int var89;
                            if (var88 != null) {
                                var56[var57] = ((class139) var88).field2085;
                                var89 = 65535 & var56[var57];
                                if (~var62 != 0 && var31[var57].field4736 < var7[var89].field4736) {
                                    var7[var89] = var31[var57];
                                }
                            } else {
                                int var91;
                                if (var62 != var63) {
                                    int var90 = (var63 & 127) * var72 >> 7;
                                    if (var90 < 2) {
                                        var90 = 2;
                                    } else if (~var90 < -127) {
                                        var90 = 126;
                                    }
                                    var91 = class508.field7410[var90 | 65408 & var63];
                                    if ((7 & this.field3245) == 0) {
                                        float var92 = this.field3249.field5341[2] * var73 + this.field3249.field5341[1] * var74 + this.field3249.field5341[0] * var71;
                                        float var93 = (var85 > 0.0F ? this.field3249.field5266 : this.field3249.field5276) * var85 + this.field3249.field5307;
                                        int var94 = 255 & var91 >> 16;
                                        int var95 = (65405 & var91) >> 8;
                                        int var96 = (int) ((float) var94 * var93);
                                        int var97 = var91 & 255;
                                        if (~var96 > -1) {
                                            var96 = 0;
                                        } else if (~var96 < -256) {
                                            var96 = 255;
                                        }
                                        int var98 = (int) ((float) var95 * var93);
                                        int var99 = (int) ((float) var97 * var93);
                                        if (~var98 > -1) {
                                            var98 = 0;
                                        } else if (~var98 < -256) {
                                            var98 = 255;
                                        }
                                        if (~var99 <= -1) {
                                            if (~var99 < -256) {
                                                var99 = 255;
                                            }
                                        } else {
                                            var99 = 0;
                                        }
                                        var91 = var99 | var96 << 16 | var98 << 8;
                                    }
                                } else {
                                    var91 = var70;
                                }
                                if (this.field3249.field5313) {
                                    var6.method2638((float) var58);
                                    var6.method2638((float) (this.method202(var58, var59) - -var64));
                                    var6.method2638((float) var59);
                                    var6.method2639((byte) (var91 >> 16));
                                    var6.method2639((byte) (var91 >> 8));
                                    var6.method2639((byte) var91);
                                    var6.method2639(-1);
                                    var6.method2638((float) var58);
                                    var6.method2638((float) var59);
                                    if (this.field3258 != null) {
                                        var6.method2638((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if (~(7 & this.field3245) != -1) {
                                        var6.method2638(var71);
                                        var6.method2638(var74);
                                        var6.method2638(var73);
                                    }
                                } else {
                                    var6.method2641((float) var58);
                                    var6.method2641((float) (var64 + this.method202(var58, var59)));
                                    var6.method2641((float) var59);
                                    var6.method2639((byte) (var91 >> 16));
                                    var6.method2639((byte) (var91 >> 8));
                                    var6.method2639((byte) var91);
                                    var6.method2639(-1);
                                    var6.method2641((float) var58);
                                    var6.method2641((float) var59);
                                    if (this.field3258 != null) {
                                        var6.method2641((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if (~(this.field3245 & 7) != -1) {
                                        var6.method2641(var71);
                                        var6.method2641(var74);
                                        var6.method2641(var73);
                                    }
                                }
                                var89 = this.field3260++;
                                var56[var57] = (short) var89;
                                if (var62 != -1) {
                                    var7[var89] = var31[var57];
                                }
                                var9.method2606(new class139(var56[var57]), var65, 0);
                            }
                            for (int var100 = 0; ~var54 < ~var100; ++var100) {
                                var10[var100].method2507(var72, var89, var85, var70, 255);
                            }
                            ++this.field3253;
                        }
                    }
                }
            }
            for (int var12 = 0; this.field3260 > var12; ++var12) {
                class418 var29 = var7[var12];
                if (var29 != null) {
                    var29.method2511(var12, (byte) 32);
                }
            }
            for (int var13 = 0; ~var13 > ~super.field370; ++var13) {
                for (int var18 = 0; var18 < super.field369; ++var18) {
                    short[] var19 = this.field3251[super.field370 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var21 > ~var19.length) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = var19[var21++] & 65535;
                            int var24 = 65535 & var19[var21++];
                            class418 var25 = var7[var22];
                            class418 var26 = var7[var23];
                            class418 var27 = var7[var24];
                            class418 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method2508(1, var20, var18, var13);
                            }
                            if (var26 != null) {
                                var26.method2508(1, var20, var18, var13);
                                if (var28 == null || ~var26.field4736 > ~var28.field4736) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method2508(1, var20, var18, var13);
                                if (var28 == null || var27.field4736 < var28.field4736) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method2511(var22, (byte) 32);
                                }
                                if (var26 != null) {
                                    var28.method2511(var23, (byte) 32);
                                }
                                if (var27 != null) {
                                    var28.method2511(var24, (byte) 32);
                                }
                                var28.method2508(1, var20, var18, var13);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method2637();
            this.field3275 = this.field3249.method2132(var6.method2642(), false, var5, 0, var4);
            this.field3272 = new class323(this.field3275, 5126, 3, 0);
            this.field3276 = new class323(this.field3275, 5121, 4, 12);
            byte var14;
            if (this.field3258 != null) {
                this.field3274 = new class323(this.field3275, 5126, 3, 16);
                var14 = 28;
            } else {
                this.field3274 = new class323(this.field3275, 5126, 2, 16);
                var14 = 24;
            }
            if (~(this.field3245 & 7) != -1) {
                this.field3269 = new class323(this.field3275, 5126, 3, var14);
            }
            long[] var15 = new long[this.field3277.length];
            for (int var16 = 0; ~this.field3277.length < ~var16; ++var16) {
                class418 var17 = this.field3277[var16];
                var15[var16] = var17.field4736;
                var17.method2506(this.field3260, 18600);
            }
            class450.method2715(true, var15, this.field3277);
            if (this.field3231 != null) {
                this.field3231.method1221(-89);
            }
        }
        this.field3248 = null;
        this.field3250 = this.field3235 = null;
        this.field3267 = null;
        this.field3258 = null;
        this.field3273 = null;
        this.field3243 = null;
        this.field3266 = this.field3270 = this.field3271 = null;
        this.field3263 = null;
        this.field3254 = null;
    }

    @OriginalMember(owner = "client!on", name = "I", descriptor = "(II)I", line = 1293)
    public final int method201(int arg0, int arg1) {
        ++field3256;
        return this.field3255[arg0][arg1];
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lj;IIIIZ)Z", line = 1302)
    public final boolean method196(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3244;
        if (this.field3231 != null && arg0 != null) {
            int var7 = -(this.field3249.field5300 * arg2 >> 8) + arg1 >> this.field3249.field5231;
            int var8 = -(this.field3249.field5322 * arg2 >> 8) + arg3 >> this.field3249.field5231;
            return this.field3231.method1225(var8, arg0, var7, (byte) 17);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!on", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1322)
    public final void method206(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg5 != null && this.field3258 == null) {
            this.field3258 = new int[super.field370][super.field369][];
        }
        ++field3261;
        if (arg3 != null && this.field3243 == null) {
            this.field3243 = new int[super.field370][super.field369][];
        }
        this.field3250[arg0][arg1] = arg2;
        this.field3235[arg0][arg1] = arg4;
        this.field3248[arg0][arg1] = arg6;
        this.field3263[arg0][arg1] = arg7;
        if (this.field3258 != null) {
            this.field3258[arg0][arg1] = arg5;
        }
        if (this.field3243 != null) {
            this.field3243[arg0][arg1] = arg3;
        }
        class418[] var15 = this.field3254[arg0][arg1] = new class418[arg6.length];
        for (int var16 = 0; var16 < arg6.length; ++var16) {
            long var17 = (long) arg8[var16] | (long) (arg9[var16] << 14) | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42;
            class337 var19;
            for (var19 = this.field3273.method2605(false, var17); var19 != null; var19 = this.field3273.method2609(-107)) {
                class418 var20 = (class418) var19;
                if (~arg8[var16] == ~var20.field6284 && (float) arg9[var16] == var20.field6281 && ~var20.field6272 == ~arg10 && var20.field6269 == arg11 && ~var20.field6286 == ~arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class418(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field3273.method2606(var15[var16], var17, 0);
            } else {
                var15[var16] = (class418) var19;
            }
        }
        if (arg13) {
            this.field3262[arg0][arg1] = (byte) class18.method119(this.field3262[arg0][arg1], 1);
        }
        if (~this.field3268 > ~arg6.length) {
            this.field3268 = arg6.length;
        }
        this.field3278 += arg6.length;
    }
}
