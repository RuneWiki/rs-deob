import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class257 extends class206 {

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "Lvr;")
    private class306 field3549 = new class306();

    @OriginalMember(owner = "client!lh", name = "S", descriptor = "[[I")
    private int[][] field3581;

    @OriginalMember(owner = "client!lh", name = "F", descriptor = "I")
    private int field3569;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "Lbv;")
    public class282 field3552;

    @OriginalMember(owner = "client!lh", name = "fb", descriptor = "[[F")
    private float[][] field3594;

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "[[[Lio;")
    private class516[][][] field3564;

    @OriginalMember(owner = "client!lh", name = "K", descriptor = "I")
    public int field3574;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "[[S")
    public short[][] field3556;

    @OriginalMember(owner = "client!lh", name = "B", descriptor = "[[[I")
    private int[][][] field3565;

    @OriginalMember(owner = "client!lh", name = "lb", descriptor = "[[B")
    private byte[][] field3600;

    @OriginalMember(owner = "client!lh", name = "gb", descriptor = "[[F")
    private float[][] field3595;

    @OriginalMember(owner = "client!lh", name = "U", descriptor = "[[B")
    private byte[][] field3583;

    @OriginalMember(owner = "client!lh", name = "R", descriptor = "I")
    private int field3580;

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "[[[I")
    public int[][][] field3562;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "[[[I")
    private int[][][] field3554;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "[[[I")
    public int[][][] field3558;

    @OriginalMember(owner = "client!lh", name = "W", descriptor = "[[[I")
    private int[][][] field3585;

    @OriginalMember(owner = "client!lh", name = "db", descriptor = "[[F")
    private float[][] field3592;

    @OriginalMember(owner = "client!lh", name = "kb", descriptor = "Lqo;")
    private class141 field3599;

    @OriginalMember(owner = "client!lh", name = "X", descriptor = "Ltn;")
    private class123 field3586;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    private int field3553;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!lh", name = "C", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!lh", name = "G", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!lh", name = "H", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!lh", name = "J", descriptor = "I")
    private int field3573;

    @OriginalMember(owner = "client!lh", name = "L", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!lh", name = "M", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!lh", name = "N", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!lh", name = "O", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!lh", name = "Q", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!lh", name = "T", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!lh", name = "V", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!lh", name = "bb", descriptor = "I")
    private int field3590;

    @OriginalMember(owner = "client!lh", name = "cb", descriptor = "I")
    private int field3591;

    @OriginalMember(owner = "client!lh", name = "hb", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "Lns;")
    public static class438 field3559;

    @OriginalMember(owner = "client!lh", name = "ab", descriptor = "Lgf;")
    private class46 field3589;

    @OriginalMember(owner = "client!lh", name = "Y", descriptor = "Lit;")
    public class509 field3587;

    @OriginalMember(owner = "client!lh", name = "eb", descriptor = "Lit;")
    private class509 field3593;

    @OriginalMember(owner = "client!lh", name = "ib", descriptor = "Lit;")
    public class509 field3597;

    @OriginalMember(owner = "client!lh", name = "jb", descriptor = "Lit;")
    public class509 field3598;

    @OriginalMember(owner = "client!lh", name = "Z", descriptor = "[Lio;")
    private class516[] field3588;

    @OriginalMember(owner = "client!lh", name = "I", descriptor = "[[[I")
    private int[][][] field3572;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ldd;[I)V", line = 9)
    public final void method854(class471 arg0, int[] arg1) {
        ++field3550;
        this.field3549.method1958(new class265(this.field3552, this, arg0, arg1), 0);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIZI[[ZII)V", line = 19)
    private final void method1667(int arg0, int arg1, boolean arg2, int arg3, boolean[][] arg4, int arg5, int arg6) {
        ++field3557;
        if (arg3 != 1) {
            this.method857(-40, -61, (class229) null);
        }
        if (this.field3588 != null) {
            float var8 = this.field3552.field4175;
            float var9 = this.field3552.field4163;
            int var10 = arg6 - -1 + arg6;
            int var11 = var10 * var10;
            if (class314.field4803.length < var11) {
                class314.field4803 = new int[var11];
            }
            if (~class128.field1807.field1277.length > ~(this.field3553 * 2)) {
                class128.field1807 = new class91(this.field3553 * 2);
            }
            int var12 = -arg6 + arg0;
            int var13 = var12;
            if (var12 < 0) {
                var12 = 0;
            }
            int var14 = -arg6 + arg5;
            int var15 = var14;
            if (var14 < 0) {
                var14 = 0;
            }
            int var16 = arg0 + arg6;
            if (super.field2912 + -1 < var16) {
                var16 = super.field2912 + -1;
            }
            int var17 = arg5 + arg6;
            class6.field89 = 0;
            if (super.field2914 + -1 < var17) {
                var17 = super.field2914 - 1;
            }
            for (int var18 = var12; ~var18 >= ~var16; ++var18) {
                boolean[] var24 = arg4[-var13 + var18];
                for (int var25 = var14; ~var25 >= ~var17; ++var25) {
                    if (var24[-var15 + var25]) {
                        class314.field4803[class6.field89++] = super.field2912 * var25 - -var18;
                    }
                }
            }
            if (arg1 == -1) {
                this.field3552.method1782((byte) -108);
            } else {
                this.field3552.method1834((float) arg1, (byte) 53);
                this.field3552.method1845((byte) 113);
            }
            this.field3552.method1823(-23419, ~(this.field3574 & 7) != -1);
            for (int var19 = 0; ~this.field3588.length < ~var19; ++var19) {
                this.field3588[var19].method3068(class6.field89, class314.field4803, (byte) -123);
            }
            if (!this.field3549.method1965(64)) {
                int var20 = this.field3552.field4135;
                int var21 = this.field3552.field4179;
                this.field3552.method1118(0, var21, this.field3552.field4171);
                this.field3552.method1087(var9, var8 - 4.0F);
                this.field3552.method1823(-23419, false);
                this.field3552.method1827(false, -45);
                this.field3552.method1802(128, (byte) 57);
                this.field3552.method1811(-2, (byte) -87);
                this.field3552.method1787(this.field3552.field4119, (byte) 121);
                this.field3552.method1776(-30, 7681, 8448);
                this.field3552.method1828(34166, 770, 0, (byte) -94);
                this.field3552.method1825((byte) 98, 0, 770, 34167);
                for (class467 var22 = this.field3549.method1970(arg3 ^ 65); var22 != null; var22 = this.field3549.method1960(24)) {
                    class265 var23 = (class265) var22;
                    var23.method1701(arg0, 94, arg6, arg5, arg4);
                }
                this.field3552.method1828(5890, 768, 0, (byte) -108);
                this.field3552.method1825((byte) 97, 0, 770, 5890);
                this.field3552.method1787((class14) null, (byte) 121);
                this.field3552.method1118(var20, var21, this.field3552.field4171);
            }
            if (this.field3586 != null) {
                this.field3552.method1087(var9, var8 - 8.0F);
                this.field3552.method1782((byte) -82);
                this.field3552.method1790(this.field3587, (byte) 43, this.field3598, (class509) null, (class509) null);
                this.field3586.method793(arg2, arg5, arg4, arg6, (byte) -83, arg0);
            }
            this.field3552.method1087(var9, var8);
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lbv;IIII[[I[[II)V", line = 166)
    public class257(class282 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field3581 = arg5;
        this.field3569 = super.field2916 + -2;
        this.field3552 = arg0;
        this.field3594 = new float[super.field2912 + 1][super.field2914 + 1];
        this.field3564 = new class516[arg3][arg4][];
        this.field3574 = arg2;
        this.field3556 = new short[arg3 * arg4][];
        this.field3565 = new int[arg3][arg4][];
        this.field3600 = new byte[arg3 + 1][arg4 + 1];
        this.field3595 = new float[super.field2912 + 1][super.field2914 + 1];
        this.field3583 = new byte[arg3][arg4];
        this.field3580 = 1 << this.field3569;
        this.field3562 = new int[arg3][arg4][];
        this.field3554 = new int[arg3][arg4][];
        this.field3558 = new int[arg3][arg4][];
        this.field3585 = new int[arg3][arg4][];
        this.field3592 = new float[super.field2912 + 1][super.field2914 + 1];
        for (int var9 = 1; var9 < super.field2914; ++var9) {
            for (int var10 = 1; super.field2912 > var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (arg7 * arg7 * 4 + var11 * var11 + var12 * var12)));
                this.field3594[var10][var9] = (float) var11 * var13;
                this.field3595[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field3592[var10][var9] = (float) var12 * var13;
            }
        }
        this.field3599 = new class141(128);
        if ((16 & this.field3574) != 0) {
            this.field3586 = new class123(this.field3552, this);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIII[[Z)V", line = 223)
    public final void method843(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field3576;
        if (~this.field3590 < -1) {
            this.field3552.method1813((byte) 77);
            this.field3552.method1831(false, true);
            this.field3552.method1823(-23419, false);
            this.field3552.method1801((byte) -104, false);
            this.field3552.method1827(false, -20);
            this.field3552.method1802(0, (byte) 57);
            this.field3552.method1811(-2, (byte) -87);
            this.field3552.method1787((class14) null, (byte) 121);
            class279.field3851[6] = 0.0F;
            class279.field3851[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field3552.field3964;
            class279.field3851[10] = 0.0F;
            class279.field3851[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field3552.field3987;
            class279.field3851[9] = 0.0F;
            class279.field3851[15] = 1.0F;
            class279.field3851[5] = (float) arg2 / ((float) super.field2915 * 128.0F * (float) this.field3552.field3964);
            class279.field3851[2] = 0.0F;
            class279.field3851[11] = 0.0F;
            class279.field3851[8] = 0.0F;
            class279.field3851[4] = 0.0F;
            class279.field3851[1] = 0.0F;
            class279.field3851[3] = 0.0F;
            class279.field3851[0] = (float) arg2 / ((float) super.field2915 * 128.0F * (float) this.field3552.field3987);
            class279.field3851[14] = 0.0F;
            class279.field3851[7] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class279.field3851, 0);
            class279.field3851[3] = 0.0F;
            class279.field3851[10] = 0.0F;
            class279.field3851[1] = 0.0F;
            class279.field3851[14] = 0.0F;
            class279.field3851[5] = 0.0F;
            class279.field3851[6] = 1.0F;
            class279.field3851[15] = 1.0F;
            class279.field3851[11] = 0.0F;
            class279.field3851[12] = 0.0F;
            class279.field3851[0] = 1.0F;
            class279.field3851[8] = 0.0F;
            class279.field3851[7] = 0.0F;
            class279.field3851[9] = 1.0F;
            class279.field3851[2] = 0.0F;
            class279.field3851[13] = 0.0F;
            class279.field3851[4] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class279.field3851, 0);
            if (~(this.field3574 & 7) != -1) {
                this.field3552.method1823(-23419, true);
                this.field3552.method1789(-12479);
            } else {
                this.field3552.method1823(-23419, false);
            }
            this.field3552.method1790(this.field3587, (byte) 43, this.field3598, this.field3597, this.field3593);
            if (this.field3553 * 2 <= class128.field1807.field1277.length) {
                class128.field1807.field1292 = 0;
            } else {
                class128.field1807 = new class91(this.field3553 * 2);
            }
            int var9 = 0;
            if (!this.field3552.field4197) {
                for (int var10 = arg4; ~arg6 < ~var10; ++var10) {
                    int var11 = super.field2912 * var10 + arg3;
                    for (int var12 = arg3; ~arg5 < ~var12; ++var12) {
                        if (arg7[-arg3 + var12][-arg4 + var10]) {
                            short[] var13 = this.field3556[var11];
                            if (var13 != null) {
                                for (int var14 = 0; var13.length > var14; ++var14) {
                                    ++var9;
                                    class128.field1807.method628(1, 65535 & var13[var14]);
                                }
                            }
                        }
                        ++var11;
                    }
                }
            } else {
                for (int var15 = arg4; ~arg6 < ~var15; ++var15) {
                    int var17 = super.field2912 * var15 + arg3;
                    for (int var18 = arg3; ~var18 > ~arg5; ++var18) {
                        if (arg7[-arg3 + var18][-arg4 + var15]) {
                            short[] var19 = this.field3556[var17];
                            if (var19 != null) {
                                for (int var20 = 0; var19.length > var20; ++var20) {
                                    class128.field1807.method600(65535 & var19[var20], -12891);
                                    ++var9;
                                }
                            }
                        }
                        ++var17;
                    }
                }
            }
            if (var9 > 0) {
                class227 var16 = new class227(this.field3552, 5123, class128.field1807.field1277, class128.field1807.field1292);
                this.field3552.method1829(1, 0, var9, var16, 4);
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 390)
    public final void method845(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field3582;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 == null ? null : new int[var18 * 3];
        int[] var26 = arg5 != null ? new int[var18 * 3] : null;
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
        this.method850(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!lh", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 481)
    public final void method850(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field3566;
        if (arg3 != null && this.field3554 == null) {
            this.field3554 = new int[super.field2912][super.field2914][];
        }
        if (arg5 != null && this.field3572 == null) {
            this.field3572 = new int[super.field2912][super.field2914][];
        }
        this.field3562[arg0][arg1] = arg2;
        this.field3558[arg0][arg1] = arg4;
        this.field3565[arg0][arg1] = arg6;
        this.field3585[arg0][arg1] = arg7;
        if (this.field3572 != null) {
            this.field3572[arg0][arg1] = arg5;
        }
        if (this.field3554 != null) {
            this.field3554[arg0][arg1] = arg3;
        }
        class516[] var15 = this.field3564[arg0][arg1] = new class516[arg6.length];
        for (int var16 = 0; ~arg6.length < ~var16; ++var16) {
            long var17 = (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (arg9[var16] << 14) | (long) arg8[var16];
            class467 var19;
            for (var19 = this.field3599.method943(var17, -1); var19 != null; var19 = this.field3599.method945((byte) -124)) {
                class516 var20 = (class516) var19;
                if (~arg8[var16] == ~var20.field7647 && (float) arg9[var16] == var20.field7654 && ~var20.field7657 == ~arg10 && var20.field7644 == arg11 && ~var20.field7643 == ~arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class516(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field3599.method940(var17, -95, var15[var16]);
            } else {
                var15[var16] = (class516) var19;
            }
        }
        if (arg13) {
            this.field3583[arg0][arg1] = (byte) class286.method1860(this.field3583[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field3591) {
            this.field3591 = arg6.length;
        }
        this.field3590 += arg6.length;
    }

    @OriginalMember(owner = "client!lh", name = "I", descriptor = "(II)I", line = 547)
    public final int method849(int arg0, int arg1) {
        ++field3571;
        return this.field3581[arg0][arg1];
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILjava/lang/String;)V", line = 557)
    public static final void method1668(int arg0, String arg1) {
        ++field3577;
        if (arg1 != null) {
            if ((~class189.field2653 > -101 || class329.field5103) && ~class189.field2653 > -201) {
                String var2 = class414.method2512(arg1, (byte) -17);
                if (var2 != null) {
                    for (int var3 = 0; var3 < class189.field2653; ++var3) {
                        String var7 = class414.method2512(class397.field6033[var3], (byte) 101);
                        if (var7 != null && var7.equals(var2)) {
                            class219.method1485((byte) 90, arg1 + class415.field6223.method2335((byte) -100, class288.field4292));
                            return;
                        }
                        if (class442.field6573[var3] != null) {
                            String var8 = class414.method2512(class442.field6573[var3], (byte) 79);
                            if (var8 != null && var8.equals(var2)) {
                                class219.method1485((byte) 84, arg1 + class415.field6223.method2335((byte) -100, class288.field4292));
                                return;
                            }
                        }
                    }
                    for (int var4 = 0; var4 < class204.field2873; ++var4) {
                        String var5 = class414.method2512(class279.field3853[var4], (byte) -84);
                        if (var5 != null && var5.equals(var2)) {
                            class219.method1485((byte) 65, class91.field1334.method2335((byte) -100, class288.field4292) + arg1 + class162.field2344.method2335((byte) -100, class288.field4292));
                            return;
                        }
                        if (class296.field4382[var4] != null) {
                            String var6 = class414.method2512(class296.field4382[var4], (byte) 77);
                            if (var6 != null && var6.equals(var2)) {
                                class219.method1485((byte) -53, class91.field1334.method2335((byte) -100, class288.field4292) + arg1 + class162.field2344.method2335((byte) -100, class288.field4292));
                                return;
                            }
                        }
                    }
                    if (class414.method2512(class339.field5365.field4947, (byte) -76).equals(var2)) {
                        class219.method1485((byte) 84, class59.field789.method2335((byte) -100, class288.field4292));
                    } else {
                        ++class250.field3469;
                        class179.method1287(false, class527.field7785);
                        class75.field1006.method625(class142.method951(-54, arg1), false);
                        if (arg0 != 4) {
                            field3570 = 91;
                        }
                        class75.field1006.method603(-124, arg1);
                    }
                }
            } else {
                class219.method1485((byte) 59, class57.field771.method2335((byte) -100, class288.field4292));
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIILfi;)V", line = 653)
    private final void method1669(int arg0, int arg1, int arg2, class178 arg3) {
        ++field3561;
        int var5 = -54 / ((47 - arg2) / 32);
        int[] var6 = this.field3562[arg0][arg1];
        int[] var7 = this.field3558[arg0][arg1];
        int var8 = var6.length;
        if (~var8 < ~class86.field1174.length) {
            class86.field1174 = new int[var8];
            class319.field4894 = new int[var8];
        }
        for (int var9 = 0; var8 > var9; ++var9) {
            class86.field1174[var9] = class494.method2942(var6[var9], 255) >> this.field3552.field4080;
            class319.field4894[var9] = class494.method2942(var7[var9], 255) >> this.field3552.field4080;
        }
        int var10 = 0;
        while (var10 < var8) {
            int var11 = class86.field1174[var10];
            int var12 = class319.field4894[var10++];
            int var13 = class86.field1174[var10];
            int var14 = class319.field4894[var10++];
            int var15 = class86.field1174[var10];
            int var16 = class319.field4894[var10++];
            if (~((-var13 + var11) * (-var16 + var14) + -((var14 - var12) * (-var13 + var15))) < -1) {
                arg3.method1284(var15, -1204862768, var12, var14, var13, var11, var16);
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "U", descriptor = "(Lj;IIIIZ)V", line = 711)
    public final void method855(class229 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3551;
        if (this.field3586 != null && arg0 != null) {
            int var7 = arg1 - (this.field3552.field4191 * arg2 >> 8) >> this.field3552.field4080;
            int var8 = arg3 - (this.field3552.field4130 * arg2 >> 8) >> this.field3552.field4080;
            this.field3586.method789(var8, arg0, var7, 8211);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(III[[ZZ)V", line = 730)
    public final void method858(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        ++field3568;
        this.method1667(arg0, -1, arg4, 1, arg3, arg1, arg2);
    }

    @OriginalMember(owner = "client!lh", name = "O", descriptor = "(IILj;)Lj;", line = 738)
    public final class229 method857(int arg0, int arg1, class229 arg2) {
        ++field3563;
        if ((this.field3583[arg0][arg1] & 1) == 0) {
            return null;
        } else {
            int var4 = super.field2915 >> this.field3552.field4080;
            class178 var5 = (class178) arg2;
            class178 var6;
            if (var5 != null && var5.method1283(var4, var4, (byte) 115)) {
                var6 = var5;
                var5.method1280(115);
            } else {
                var6 = new class178(this.field3552, var4, var4);
            }
            var6.method1279(-1038867248, 0, var4, 0, var4);
            this.method1669(arg0, arg1, 104, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!lh", name = "SA", descriptor = "(Lj;IIIIZ)V", line = 772)
    public final void method844(class229 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3579;
        if (this.field3586 != null && arg0 != null) {
            int var7 = -(this.field3552.field4191 * arg2 >> 8) + arg1 >> this.field3552.field4080;
            int var8 = -(this.field3552.field4130 * arg2 >> 8) + arg3 >> this.field3552.field4080;
            this.field3586.method787(var7, arg0, var8, -29905);
        }
    }

    @OriginalMember(owner = "client!lh", name = "va", descriptor = "(II)I", line = 796)
    public final int method853(int arg0, int arg1) {
        ++field3584;
        int var3 = arg0 >> super.field2916;
        int var4 = arg1 >> super.field2916;
        if (~var3 <= -1 && ~var4 <= -1 && super.field2912 - 1 >= var3 && var4 <= super.field2914 - 1) {
            int var5 = arg0 & super.field2915 + -1;
            int var6 = super.field2915 + -1 & arg1;
            int var7 = (-var5 + super.field2915) * this.field3581[var3][var4] + this.field3581[var3 + 1][var4] * var5 >> super.field2916;
            int var8 = (-var5 + super.field2915) * this.field3581[var3][var4 + 1] + this.field3581[var3 + 1][var4 + 1] * var5 >> super.field2916;
            return (-var6 + super.field2915) * var7 + var6 * var8 >> super.field2916;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V", line = 822)
    public static void method1670(byte arg0) {
        field3559 = null;
        if (arg0 <= 52) {
            field3596 = -128;
        }
    }

    @OriginalMember(owner = "client!lh", name = "QA", descriptor = "(III)V", line = 835)
    public final void method848(int arg0, int arg1, int arg2) {
        if ((this.field3600[arg0][arg1] & 255) < arg2) {
            this.field3600[arg0][arg1] = (byte) arg2;
        }
        ++field3555;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lj;IIIIZ)Z", line = 846)
    public final boolean method847(class229 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3560;
        if (this.field3586 != null && arg0 != null) {
            int var7 = -(this.field3552.field4191 * arg2 >> 8) + arg1 >> this.field3552.field4080;
            int var8 = -(this.field3552.field4130 * arg2 >> 8) + arg3 >> this.field3552.field4080;
            return this.field3586.method790(var7, var8, arg0, -648);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V", line = 871)
    public final void method842(int arg0, int arg1) {
        ++field3578;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I[II[II)V", line = 893)
    public static final void method1671(int arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        if (arg4 != Integer.MAX_VALUE) {
            field3570 = 107;
        }
        ++field3575;
        if (~arg2 > ~arg0) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg2;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            int var8 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var8;
            int var9 = var7 != Integer.MAX_VALUE ? 1 : 0;
            for (int var10 = arg2; arg0 > var10; ++var10) {
                if (~((var9 & var10) + var7) < ~arg3[var10]) {
                    int var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    int var12 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var12;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg0] = arg1[var6];
            arg1[var6] = var8;
            method1671(var6 + -1, arg1, arg2, arg3, Integer.MAX_VALUE);
            method1671(arg0, arg1, var6 - -1, arg3, Integer.MAX_VALUE);
        }
    }

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "()V", line = 949)
    public final void method851() {
        ++field3567;
        if (~this.field3590 < -1) {
            byte[][] var1 = new byte[super.field2912 + 1][super.field2914 + 1];
            for (int var2 = 1; var2 < super.field2912; ++var2) {
                for (int var102 = 1; super.field2914 > var102; ++var102) {
                    var1[var2][var102] = (byte) ((this.field3600[var2][var102 - -1] >> 3) + (this.field3600[var2][var102 + -1] >> 2) + (this.field3600[var2][var102] >> 1) + (this.field3600[var2 + 1][var102] >> 3) + (this.field3600[var2 + -1][var102] >> 2));
                }
            }
            this.field3588 = new class516[this.field3599.method939((byte) 103)];
            this.field3599.method944((byte) 50, this.field3588);
            for (int var3 = 0; ~var3 > ~this.field3588.length; ++var3) {
                this.field3588[var3].method3066(this.field3590, true);
            }
            int var4 = 24;
            if (this.field3572 != null) {
                var4 += 4;
            }
            if ((this.field3574 & 7) != 0) {
                var4 += 12;
            }
            NativeBuffer var5 = this.field3552.field4084.method159(this.field3590 * var4);
            NativeStream var6 = new NativeStream(var5);
            class516[] var7 = new class516[this.field3590];
            class141 var8 = new class141(class412.method2505(17202, this.field3590 / 4));
            class516[] var9 = new class516[this.field3591];
            for (int var10 = 0; var10 < super.field2912; ++var10) {
                for (int var29 = 0; var29 < super.field2914; ++var29) {
                    if (this.field3565[var10][var29] != null) {
                        class516[] var30 = this.field3564[var10][var29];
                        int[] var31 = this.field3562[var10][var29];
                        int[] var32 = this.field3558[var10][var29];
                        int[] var33 = this.field3585[var10][var29];
                        int[] var34 = this.field3565[var10][var29];
                        int[] var35 = this.field3554 != null ? this.field3554[var10][var29] : null;
                        if (var33 == null) {
                            var33 = var34;
                        }
                        int[] var36 = this.field3572 != null ? this.field3572[var10][var29] : null;
                        float var37 = this.field3594[var10][var29];
                        float var38 = this.field3595[var10][var29];
                        float var39 = this.field3592[var10][var29];
                        float var40 = this.field3594[var10][var29 + 1];
                        float var41 = this.field3595[var10][var29 + 1];
                        float var42 = this.field3592[var10][var29 + 1];
                        float var43 = this.field3594[var10 + 1][var29 + 1];
                        float var44 = this.field3595[var10 + 1][var29 + 1];
                        float var45 = this.field3592[var10 + 1][var29 + 1];
                        float var46 = this.field3594[var10 + 1][var29];
                        float var47 = this.field3595[var10 + 1][var29];
                        float var48 = this.field3592[var10 - -1][var29];
                        int var49 = var1[var10][var29] & 255;
                        int var50 = 255 & var1[var10][var29 + 1];
                        int var51 = 255 & var1[var10 + 1][var29 + 1];
                        int var52 = 255 & var1[var10 + 1][var29];
                        int var53 = 0;
                        label333: for (int var54 = 0; var54 < var34.length; ++var54) {
                            class516 var100 = var30[var54];
                            for (int var101 = 0; var101 < var53; ++var101) {
                                if (var9[var101] == var100) {
                                    continue label333;
                                }
                            }
                            var9[var53++] = var100;
                        }
                        short[] var55 = this.field3556[super.field2912 * var29 - -var10] = new short[var34.length];
                        for (int var56 = 0; ~var34.length < ~var56; ++var56) {
                            int var57 = (var10 << super.field2916) + var31[var56];
                            int var58 = (var29 << super.field2916) - -var32[var56];
                            int var59 = var57 >> this.field3569;
                            int var60 = var58 >> this.field3569;
                            int var61 = var34[var56];
                            int var62 = var33[var56];
                            int var63 = var35 != null ? var35[var56] : 0;
                            long var64 = (long) (var59 << 16) | (long) var61 << 32 | (long) var62 << 48 | (long) var60;
                            int var66 = var31[var56];
                            int var67 = var32[var56];
                            byte var68 = 74;
                            int var69 = 0;
                            float var70 = 1.0F;
                            float var71;
                            float var72;
                            int var73;
                            float var74;
                            if (var66 == 0 && ~var67 == -1) {
                                var71 = var37;
                                var72 = var39;
                                var73 = var68 - var49;
                                var74 = var38;
                            } else if (var66 == 0 && ~super.field2915 == ~var67) {
                                var73 = var68 - var50;
                                var74 = var41;
                                var72 = var42;
                                var71 = var40;
                            } else if (super.field2915 == var66 && super.field2915 == var67) {
                                var73 = var68 - var51;
                                var74 = var44;
                                var72 = var45;
                                var71 = var43;
                            } else if (super.field2915 == var66 && var67 == 0) {
                                var72 = var48;
                                var71 = var46;
                                var74 = var47;
                                var73 = var68 - var52;
                            } else {
                                float var75 = (float) var66 / (float) super.field2915;
                                float var76 = (float) var67 / (float) super.field2915;
                                float var77 = (-var37 + var46) * var75 + var37;
                                float var78 = (-var38 + var47) * var75 + var38;
                                float var79 = (-var39 + var48) * var75 + var39;
                                float var80 = (-var40 + var43) * var75 + var40;
                                float var81 = (var44 - var41) * var75 + var41;
                                var71 = (-var77 + var80) * var76 + var77;
                                float var82 = (-var42 + var45) * var75 + var42;
                                var74 = (var81 - var78) * var76 + var78;
                                var72 = (-var79 + var82) * var76 + var79;
                                int var83 = var49 - -((var52 - var49) * var66 >> super.field2916);
                                int var84 = ((-var50 + var51) * var66 >> super.field2916) + var50;
                                var73 = var68 - (((-var83 + var84) * var67 >> super.field2916) + var83);
                            }
                            if (var61 != -1) {
                                int var85 = (var61 & 127) * var73 >> 7;
                                if (~var85 > -3) {
                                    var85 = 2;
                                } else if (~var85 < -127) {
                                    var85 = 126;
                                }
                                var69 = class249.field3466[65408 & var61 | var85];
                                if (~(7 & this.field3574) == -1) {
                                    float var86 = this.field3552.field4110[2] * var72 + this.field3552.field4110[1] * var74 + this.field3552.field4110[0] * var71;
                                    var70 = (!(var86 > 0.0F) ? this.field3552.field4177 : this.field3552.field4169) * var86 + this.field3552.field4188;
                                }
                            }
                            class467 var87 = null;
                            if ((var57 & this.field3580 + -1) == 0 && (this.field3580 - 1 & var58) == 0) {
                                var87 = var8.method943(var64, -1);
                            }
                            int var88;
                            if (var87 != null) {
                                var55[var56] = ((class198) var87).field2795;
                                var88 = var55[var56] & 65535;
                                if (~var61 != 0 && var7[var88].field6799 > var30[var56].field6799) {
                                    var7[var88] = var30[var56];
                                }
                            } else {
                                int var89;
                                if (~var61 == ~var62) {
                                    var89 = var69;
                                } else {
                                    int var90 = (var62 & 127) * var73 >> 7;
                                    if (var90 < 2) {
                                        var90 = 2;
                                    } else if (~var90 < -127) {
                                        var90 = 126;
                                    }
                                    var89 = class249.field3466[65408 & var62 | var90];
                                    if (~(7 & this.field3574) == -1) {
                                        float var91 = this.field3552.field4110[2] * var72 + this.field3552.field4110[1] * var74 + this.field3552.field4110[0] * var71;
                                        float var92 = var70 * (var70 > 0.0F ? this.field3552.field4169 : this.field3552.field4177) + this.field3552.field4188;
                                        int var93 = 255 & var89 >> 16;
                                        int var94 = (65436 & var89) >> 8;
                                        int var95 = (int) ((float) var93 * var92);
                                        int var96 = var89 & 255;
                                        int var97 = (int) ((float) var94 * var92);
                                        if (var95 < 0) {
                                            var95 = 0;
                                        } else if (var95 > 255) {
                                            var95 = 255;
                                        }
                                        int var98 = (int) ((float) var96 * var92);
                                        if (var97 < 0) {
                                            var97 = 0;
                                        } else if (~var97 < -256) {
                                            var97 = 255;
                                        }
                                        if (~var98 > -1) {
                                            var98 = 0;
                                        } else if (var98 > 255) {
                                            var98 = 255;
                                        }
                                        var89 = var98 | var97 << 8 | var95 << 16;
                                    }
                                }
                                if (!this.field3552.field4197) {
                                    var6.method152((float) var57);
                                    var6.method152((float) (var63 + this.method853(var57, var58)));
                                    var6.method152((float) var58);
                                    var6.method154((byte) (var89 >> 16));
                                    var6.method154((byte) (var89 >> 8));
                                    var6.method154((byte) var89);
                                    var6.method154(-1);
                                    var6.method152((float) var57);
                                    var6.method152((float) var58);
                                    if (this.field3572 != null) {
                                        var6.method152((float) (var36 == null ? 0 : var36[var56] + -1));
                                    }
                                    if (~(this.field3574 & 7) != -1) {
                                        var6.method152(var71);
                                        var6.method152(var74);
                                        var6.method152(var72);
                                    }
                                } else {
                                    var6.method155((float) var57);
                                    var6.method155((float) (var63 + this.method853(var57, var58)));
                                    var6.method155((float) var58);
                                    var6.method154((byte) (var89 >> 16));
                                    var6.method154((byte) (var89 >> 8));
                                    var6.method154((byte) var89);
                                    var6.method154(-1);
                                    var6.method155((float) var57);
                                    var6.method155((float) var58);
                                    if (this.field3572 != null) {
                                        var6.method155((float) (var36 != null ? var36[var56] - 1 : 0));
                                    }
                                    if (~(this.field3574 & 7) != -1) {
                                        var6.method155(var71);
                                        var6.method155(var74);
                                        var6.method155(var72);
                                    }
                                }
                                var88 = this.field3573++;
                                var55[var56] = (short) var88;
                                if (var61 != -1) {
                                    var7[var88] = var30[var56];
                                }
                                var8.method940(var64, -42, new class198(var55[var56]));
                            }
                            for (int var99 = 0; ~var99 > ~var53; ++var99) {
                                var9[var99].method3072(var73, var70, var69, var88, (byte) 85);
                            }
                            ++this.field3553;
                        }
                    }
                }
            }
            for (int var11 = 0; this.field3573 > var11; ++var11) {
                class516 var28 = var7[var11];
                if (var28 != null) {
                    var28.method3067(var11, 69);
                }
            }
            for (int var12 = 0; super.field2912 > var12; ++var12) {
                for (int var17 = 0; ~var17 > ~super.field2914; ++var17) {
                    short[] var18 = this.field3556[super.field2912 * var17 + var12];
                    if (var18 != null) {
                        int var19 = 0;
                        int var20 = 0;
                        while (~var20 > ~var18.length) {
                            int var21 = 65535 & var18[var20++];
                            int var22 = 65535 & var18[var20++];
                            int var23 = 65535 & var18[var20++];
                            class516 var24 = var7[var21];
                            class516 var25 = var7[var22];
                            class516 var26 = var7[var23];
                            class516 var27 = null;
                            if (var24 != null) {
                                var24.method3071(var12, var19, var17, -21235);
                                var27 = var24;
                            }
                            if (var25 != null) {
                                var25.method3071(var12, var19, var17, -21235);
                                if (var27 == null || ~var27.field6799 < ~var25.field6799) {
                                    var27 = var25;
                                }
                            }
                            if (var26 != null) {
                                var26.method3071(var12, var19, var17, -21235);
                                if (var27 == null || ~var26.field6799 > ~var27.field6799) {
                                    var27 = var26;
                                }
                            }
                            if (var27 != null) {
                                if (var24 != null) {
                                    var27.method3067(var21, 57);
                                }
                                if (var25 != null) {
                                    var27.method3067(var22, 109);
                                }
                                if (var26 != null) {
                                    var27.method3067(var23, 58);
                                }
                                var27.method3071(var12, var19, var17, -21235);
                            }
                            ++var19;
                        }
                    }
                }
            }
            var6.method157();
            this.field3589 = this.field3552.method1773(var4, var6.method158(), true, var5, false);
            this.field3598 = new class509(this.field3589, 5126, 3, 0);
            this.field3593 = new class509(this.field3589, 5121, 4, 12);
            byte var13;
            if (this.field3572 == null) {
                this.field3587 = new class509(this.field3589, 5126, 2, 16);
                var13 = 24;
            } else {
                this.field3587 = new class509(this.field3589, 5126, 3, 16);
                var13 = 28;
            }
            if (~(this.field3574 & 7) != -1) {
                this.field3597 = new class509(this.field3589, 5126, 3, var13);
            }
            long[] var14 = new long[this.field3588.length];
            for (int var15 = 0; ~this.field3588.length < ~var15; ++var15) {
                class516 var16 = this.field3588[var15];
                var14[var15] = var16.field6799;
                var16.method3070(0, this.field3573);
            }
            class217.method1475(var14, true, this.field3588);
            if (this.field3586 != null) {
                this.field3586.method792(-16569);
            }
        } else {
            this.field3586 = null;
        }
        this.field3565 = null;
        this.field3594 = this.field3595 = this.field3592 = null;
        this.field3585 = null;
        this.field3572 = null;
        this.field3599 = null;
        this.field3562 = this.field3558 = null;
        this.field3600 = null;
        this.field3564 = null;
        this.field3554 = null;
    }
}
