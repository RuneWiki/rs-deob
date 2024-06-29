import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class195 extends class419 {

    @OriginalMember(owner = "client!al", name = "L", descriptor = "Low;")
    private class665 field2934 = new class665();

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    private int field2912 = this.field5807 - 2;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "Llea;")
    public class573 field2909;

    @OriginalMember(owner = "client!al", name = "eb", descriptor = "[[F")
    private float[][] field2953;

    @OriginalMember(owner = "client!al", name = "V", descriptor = "[[[I")
    public int[][][] field2944;

    @OriginalMember(owner = "client!al", name = "ib", descriptor = "[[F")
    private float[][] field2957;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "[[[I")
    public int[][][] field2917;

    @OriginalMember(owner = "client!al", name = "hb", descriptor = "[[F")
    private float[][] field2956;

    @OriginalMember(owner = "client!al", name = "x", descriptor = "I")
    private int field2921;

    @OriginalMember(owner = "client!al", name = "N", descriptor = "[[[I")
    public int[][][] field2936;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "[[S")
    public short[][] field2910;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "[[[I")
    private int[][][] field2913;

    @OriginalMember(owner = "client!al", name = "S", descriptor = "[[B")
    private byte[][] field2941;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "[[[Ldia;")
    private class701[][][] field2914;

    @OriginalMember(owner = "client!al", name = "O", descriptor = "I")
    public int field2937;

    @OriginalMember(owner = "client!al", name = "Q", descriptor = "[[[I")
    private int[][][] field2939;

    @OriginalMember(owner = "client!al", name = "Z", descriptor = "[[B")
    private byte[][] field2948;

    @OriginalMember(owner = "client!al", name = "W", descriptor = "Lsi;")
    private class769 field2945;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "Lpga;")
    private class174 field2916;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!al", name = "w", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!al", name = "y", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!al", name = "z", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!al", name = "A", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!al", name = "B", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!al", name = "C", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!al", name = "D", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!al", name = "F", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!al", name = "G", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!al", name = "H", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!al", name = "I", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!al", name = "J", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!al", name = "K", descriptor = "I")
    private int field2933;

    @OriginalMember(owner = "client!al", name = "R", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!al", name = "T", descriptor = "I")
    private int field2942;

    @OriginalMember(owner = "client!al", name = "U", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!al", name = "bb", descriptor = "I")
    private int field2950;

    @OriginalMember(owner = "client!al", name = "gb", descriptor = "I")
    private int field2955;

    @OriginalMember(owner = "client!al", name = "X", descriptor = "Lpc;")
    public class282 field2946;

    @OriginalMember(owner = "client!al", name = "Y", descriptor = "Lpc;")
    public class282 field2947;

    @OriginalMember(owner = "client!al", name = "db", descriptor = "Lpc;")
    private class282 field2952;

    @OriginalMember(owner = "client!al", name = "fb", descriptor = "Lpc;")
    public class282 field2954;

    @OriginalMember(owner = "client!al", name = "cb", descriptor = "Lcq;")
    private class305 field2951;

    @OriginalMember(owner = "client!al", name = "ab", descriptor = "[Ldia;")
    private class701[] field2949;

    @OriginalMember(owner = "client!al", name = "M", descriptor = "[[I")
    public static int[][] field2935;

    @OriginalMember(owner = "client!al", name = "P", descriptor = "[[[I")
    private int[][][] field2938;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZIIIIII[[Z)V")
    private final void method1382(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field2925;
        int var9 = -113 / ((-20 - arg1) / 58);
        if (this.field2949 != null) {
            int var10 = arg4 + 1 + arg4;
            int var11 = var10 * var10;
            if (~this.field2909.field8286.length > ~var11) {
                this.field2909.field8286 = new int[var11];
            }
            if (this.field2909.field8238.field6002.length < this.field2942 * 2) {
                this.field2909.field8238 = new class501(this.field2942 * 2);
            }
            int var12 = -arg4 + arg2;
            int var13 = var12;
            if (var12 < 0) {
                var12 = 0;
            }
            int var14 = -arg4 + arg3;
            int var15 = var14;
            if (~var14 > -1) {
                var14 = 0;
            }
            int var16 = arg2 - -arg4;
            if (var16 > super.field5808 - 1) {
                var16 = super.field5808 - 1;
            }
            int var17 = arg3 - -arg4;
            if (super.field5809 - 1 < var17) {
                var17 = super.field5809 + -1;
            }
            int var18 = 0;
            int[] var19 = this.field2909.field8286;
            for (int var20 = var12; ~var20 >= ~var16; ++var20) {
                boolean[] var26 = arg7[-var13 + var20];
                for (int var27 = var14; var17 >= var27; ++var27) {
                    if (var26[-var15 + var27]) {
                        var19[var18++] = super.field5808 * var27 + var20;
                    }
                }
            }
            if (arg5 != -1) {
                this.field2909.method3319((float) arg5, true);
                this.field2909.method3360(22131);
            } else {
                this.field2909.method3314(false);
            }
            this.field2909.method3385(~(this.field2937 & 7) != -1, -8);
            for (int var21 = 0; this.field2949.length > var21; ++var21) {
                this.field2949[var21].method3926(var19, var18, false);
            }
            if (!this.field2934.method3723((byte) 88)) {
                int var22 = this.field2909.field8257;
                int var23 = this.field2909.field8251;
                this.field2909.method511(0, var23, this.field2909.field8181);
                this.field2909.method3385(false, -8);
                this.field2909.method3377(-32, false);
                this.field2909.method3308((byte) 76, 128);
                this.field2909.method3364(0, -2);
                this.field2909.method3384(this.field2909.field8223, (byte) 113);
                this.field2909.method3359(8448, 7681, true);
                this.field2909.method3351(770, 0, 34166, (byte) -85);
                this.field2909.method3374(0, 770, 34167, 58);
                for (class766 var24 = this.field2934.method3731((byte) -91); var24 != null; var24 = this.field2934.method3729((byte) -127)) {
                    class785 var25 = (class785) var24;
                    var25.method4300(arg3, arg2, arg4, (byte) -17, arg7);
                }
                this.field2909.method3351(768, 0, 5890, (byte) -85);
                this.field2909.method3374(0, 770, 5890, 44);
                this.field2909.method3384((class377) null, (byte) 93);
                this.field2909.method511(var22, var23, this.field2909.field8181);
            }
            if (this.field2916 != null) {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                this.field2909.method3344((class282) null, this.field2954, (class282) null, this.field2947, (byte) 106);
                this.field2916.method1282(arg2, arg3, (byte) -92, arg7, arg0, arg4);
                OpenGL.glPopMatrix();
                return;
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method823(class115 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2919;
        if (this.field2916 != null && arg0 != null) {
            int var7 = -(this.field2909.field8221 * arg2 >> 8) + arg1 >> this.field2909.field8134;
            int var8 = -(this.field2909.field8205 * arg2 >> 8) + arg3 >> this.field2909.field8134;
            this.field2916.method1281(var8, var7, (byte) -119, arg0);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method826(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field2930;
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
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method828(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lmfa;[I)V")
    public final void method831(class217 arg0, int[] arg1) {
        this.field2934.method3728((byte) 124, new class785(this.field2909, this, arg0, arg1));
        ++field2928;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V")
    public static void method1383(byte arg0) {
        int var1 = -49 / ((arg0 - -18) / 47);
        field2935 = null;
    }

    @OriginalMember(owner = "client!al", name = "fa", descriptor = "(IILr;)Lr;")
    public final class115 method830(int arg0, int arg1, class115 arg2) {
        ++field2915;
        if ((1 & this.field2941[arg0][arg1]) == 0) {
            return null;
        } else {
            int var4 = super.field5805 >> this.field2909.field8134;
            class9 var5 = (class9) arg2;
            class9 var6;
            if (var5 != null && var5.method149(-13, var4, var4)) {
                var6 = var5;
                var5.method147((byte) 0);
            } else {
                var6 = new class9(this.field2909, var4, var4);
            }
            var6.method145(-64, var4, var4, 0, 0);
            this.method1387(arg1, true, arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!al", name = "ka", descriptor = "(III)V")
    public final void method819(int arg0, int arg1, int arg2) {
        if (~(255 & this.field2948[arg0][arg1]) > ~arg2) {
            this.field2948[arg0][arg1] = (byte) arg2;
        }
        ++field2926;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(B)I")
    public static final int method1384(byte arg0) {
        ++field2923;
        if (~class388.field5420 == -2) {
            return class81.field1198;
        } else {
            if (arg0 >= -37) {
                method1384((byte) 16);
            }
            return class183.field2780;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III[[ZZI)V")
    public final void method816(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field2924;
        this.method1382(arg4, 123, arg0, arg1, arg2, -1, arg5, arg3);
    }

    @OriginalMember(owner = "client!al", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method828(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field2918;
        if (arg3 != null && this.field2913 == null) {
            this.field2913 = new int[super.field5808][super.field5809][];
        }
        class103 var15 = this.field2909.field6447;
        if (arg5 != null && this.field2938 == null) {
            this.field2938 = new int[super.field5808][super.field5809][];
        }
        this.field2944[arg0][arg1] = arg2;
        this.field2917[arg0][arg1] = arg4;
        this.field2936[arg0][arg1] = arg6;
        this.field2939[arg0][arg1] = arg7;
        if (this.field2938 != null) {
            this.field2938[arg0][arg1] = arg5;
        }
        if (this.field2913 != null) {
            this.field2913[arg0][arg1] = arg3;
        }
        class701[] var16 = this.field2914[arg0][arg1] = new class701[arg6.length];
        for (int var17 = 0; ~var17 > ~arg6.length; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if (~(32 & this.field2937) != -1 && ~var18 != 0 && var15.method847(var18, -118).field10029) {
                var18 = -1;
                var19 = 128;
            }
            long var20 = (long) var18 | (long) (var19 << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48;
            class766 var22;
            for (var22 = this.field2945.method4253(var20, -1); var22 != null; var22 = this.field2945.method4248(-120)) {
                class701 var23 = (class701) var22;
                if (var23.field9824 == var18 && (float) var19 == var23.field9837 && ~var23.field9830 == ~arg10 && ~var23.field9820 == ~arg11 && var23.field9823 == arg12) {
                    break;
                }
            }
            if (var22 == null) {
                var16[var17] = new class701(this, var18, var19, arg10, arg11, arg12);
                this.field2945.method4252(false, var16[var17], var20);
            } else {
                var16[var17] = (class701) var22;
            }
        }
        if (arg13) {
            this.field2941[arg0][arg1] = (byte) class694.method3895(this.field2941[arg0][arg1], 1);
        }
        if (arg6.length > this.field2955) {
            this.field2955 = arg6.length;
        }
        this.field2950 += arg6.length;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V")
    public final void method821(int arg0, int arg1) {
        ++field2929;
    }

    @OriginalMember(owner = "client!al", name = "YA", descriptor = "()V")
    public final void method818() {
        if (~this.field2950 < -1) {
            byte[][] var1 = new byte[super.field5808 + 1][super.field5809 + 1];
            for (int var2 = 1; var2 < super.field5808; ++var2) {
                for (int var103 = 1; ~var103 > ~super.field5809; ++var103) {
                    var1[var2][var103] = (byte) ((this.field2948[var2][var103 + -1] >> 2) + (this.field2948[var2][var103 + 1] >> 3) + (this.field2948[var2][var103] >> 1) + (this.field2948[var2 + -1][var103] >> 2) + (this.field2948[var2 + 1][var103] >> 3));
                }
            }
            this.field2949 = new class701[this.field2945.method4257(108)];
            this.field2945.method4256(5669, this.field2949);
            for (int var3 = 0; var3 < this.field2949.length; ++var3) {
                this.field2949[var3].method3930(8, this.field2950);
            }
            int var4 = 24;
            if (this.field2938 != null) {
                var4 += 4;
            }
            if ((7 & this.field2937) != 0) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field2909.field8135.method2247(this.field2950 * var4, false);
            Stream var6 = new Stream(var5);
            class701[] var7 = new class701[this.field2950];
            int var8 = class515.method3025(this.field2950 / 4, 592877665);
            if (var8 < 1) {
                var8 = 1;
            }
            class769 var9 = new class769(var8);
            class701[] var10 = new class701[this.field2955];
            for (int var11 = 0; ~super.field5808 < ~var11; ++var11) {
                for (int var30 = 0; ~var30 > ~super.field5809; ++var30) {
                    if (this.field2936[var11][var30] != null) {
                        class701[] var31 = this.field2914[var11][var30];
                        int[] var32 = this.field2944[var11][var30];
                        int[] var33 = this.field2917[var11][var30];
                        int[] var34 = this.field2939[var11][var30];
                        int[] var35 = this.field2936[var11][var30];
                        int[] var36 = this.field2913 == null ? null : this.field2913[var11][var30];
                        int[] var37 = this.field2938 == null ? null : this.field2938[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        float var38 = this.field2957[var11][var30];
                        float var39 = this.field2956[var11][var30];
                        float var40 = this.field2953[var11][var30];
                        float var41 = this.field2957[var11][var30 + 1];
                        float var42 = this.field2956[var11][var30 + 1];
                        float var43 = this.field2953[var11][var30 + 1];
                        float var44 = this.field2957[var11 + 1][var30 - -1];
                        float var45 = this.field2956[var11 + 1][var30 + 1];
                        float var46 = this.field2953[var11 - -1][var30 + 1];
                        float var47 = this.field2957[var11 - -1][var30];
                        float var48 = this.field2956[var11 + 1][var30];
                        float var49 = this.field2953[var11 + 1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = var1[var11][var30 + 1] & 255;
                        int var52 = var1[var11 + 1][var30 - -1] & 255;
                        int var53 = 255 & var1[var11 - -1][var30];
                        int var54 = 0;
                        label340: for (int var55 = 0; var35.length > var55; ++var55) {
                            class701 var101 = var31[var55];
                            for (int var102 = 0; ~var102 > ~var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label340;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field2910[super.field5808 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; ~var35.length < ~var57; ++var57) {
                            int var58 = (var11 << super.field5807) - -var32[var57];
                            int var59 = (var30 << super.field5807) - -var33[var57];
                            int var60 = var58 >> this.field2912;
                            int var61 = var59 >> this.field2912;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 == null ? 0 : var36[var57];
                            long var65 = (long) var61 | (long) var62 << 32 | (long) var63 << 48 | (long) (var60 << 16);
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71;
                            float var72;
                            int var73;
                            float var74;
                            if (var67 == 0 && var68 == 0) {
                                var71 = var39;
                                var72 = var38;
                                var73 = var69 - var50;
                                var74 = var40;
                            } else if (~var67 == -1 && ~super.field5805 == ~var68) {
                                var74 = var43;
                                var72 = var41;
                                var73 = var69 - var51;
                                var71 = var42;
                            } else if (super.field5805 == var67 && ~super.field5805 == ~var68) {
                                var71 = var45;
                                var74 = var46;
                                var72 = var44;
                                var73 = var69 - var52;
                            } else if (super.field5805 == var67 && ~var68 == -1) {
                                var73 = var69 - var53;
                                var72 = var47;
                                var71 = var48;
                                var74 = var49;
                            } else {
                                float var75 = (float) var67 / (float) super.field5805;
                                float var76 = (float) var68 / (float) super.field5805;
                                float var77 = (-var38 + var47) * var75 + var38;
                                float var78 = (var48 - var39) * var75 + var39;
                                float var79 = (var49 - var40) * var75 + var40;
                                float var80 = (-var41 + var44) * var75 + var41;
                                float var81 = (var45 - var42) * var75 + var42;
                                float var82 = (-var43 + var46) * var75 + var43;
                                var72 = (var80 - var77) * var76 + var77;
                                var71 = (-var78 + var81) * var76 + var78;
                                var74 = (var82 - var79) * var76 + var79;
                                int var83 = ((-var50 + var53) * var67 >> super.field5807) + var50;
                                int var84 = ((-var51 + var52) * var67 >> super.field5807) + var51;
                                var73 = var69 - (((-var83 + var84) * var68 >> super.field5807) + var83);
                            }
                            float var85 = 1.0F;
                            if (var62 != -1) {
                                int var86 = (127 & var62) * var73 >> 7;
                                if (var86 < 2) {
                                    var86 = 2;
                                } else if (~var86 < -127) {
                                    var86 = 126;
                                }
                                if (~(7 & this.field2937) == -1) {
                                    float var87 = this.field2909.field8278[2] * var74 + this.field2909.field8278[0] * var72 + this.field2909.field8278[1] * var71;
                                    var85 = this.field2909.field8243 + var87 * (!(var87 > 0.0F) ? this.field2909.field8265 : this.field2909.field8173);
                                }
                                var70 = class789.field10788[var86 | 65408 & var62];
                            }
                            class766 var88 = null;
                            if ((var58 & this.field2921 + -1) == 0 && ~(var59 & this.field2921 + -1) == -1) {
                                var88 = var9.method4253(var65, -1);
                            }
                            int var99;
                            if (var88 == null) {
                                int var90;
                                if (~var62 != ~var63) {
                                    int var89 = (127 & var63) * var73 >> 7;
                                    if (~var89 <= -3) {
                                        if (var89 > 126) {
                                            var89 = 126;
                                        }
                                    } else {
                                        var89 = 2;
                                    }
                                    var90 = class789.field10788[var89 | 65408 & var63];
                                    if ((this.field2937 & 7) == 0) {
                                        float var91 = this.field2909.field8278[2] * var74 + this.field2909.field8278[1] * var71 + this.field2909.field8278[0] * var72;
                                        float var92 = var85 * (!(var85 > 0.0F) ? this.field2909.field8265 : this.field2909.field8173) + this.field2909.field8243;
                                        int var93 = (16713112 & var90) >> 16;
                                        int var94 = (65295 & var90) >> 8;
                                        int var95 = (int) ((float) var93 * var92);
                                        int var96 = 255 & var90;
                                        int var97 = (int) ((float) var94 * var92);
                                        if (var95 >= 0) {
                                            if (~var95 < -256) {
                                                var95 = 255;
                                            }
                                        } else {
                                            var95 = 0;
                                        }
                                        if (~var97 <= -1) {
                                            if (~var97 < -256) {
                                                var97 = 255;
                                            }
                                        } else {
                                            var97 = 0;
                                        }
                                        int var98 = (int) ((float) var96 * var92);
                                        if (var98 >= 0) {
                                            if (var98 > 255) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        var90 = var98 | var97 << 8 | var95 << 16;
                                    }
                                } else {
                                    var90 = var70;
                                }
                                if (this.field2909.field8231) {
                                    var6.method2251((float) var58);
                                    var6.method2251((float) (var64 + this.method2478(true, var59, var58)));
                                    var6.method2251((float) var59);
                                    var6.method2254((byte) (var90 >> 16));
                                    var6.method2254((byte) (var90 >> 8));
                                    var6.method2254((byte) var90);
                                    var6.method2254(-1);
                                    var6.method2251((float) var58);
                                    var6.method2251((float) var59);
                                    if (this.field2938 != null) {
                                        var6.method2251((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if ((7 & this.field2937) != 0) {
                                        var6.method2251(var72);
                                        var6.method2251(var71);
                                        var6.method2251(var74);
                                    }
                                } else {
                                    var6.method2258((float) var58);
                                    var6.method2258((float) (var64 + this.method2478(true, var59, var58)));
                                    var6.method2258((float) var59);
                                    var6.method2254((byte) (var90 >> 16));
                                    var6.method2254((byte) (var90 >> 8));
                                    var6.method2254((byte) var90);
                                    var6.method2254(-1);
                                    var6.method2258((float) var58);
                                    var6.method2258((float) var59);
                                    if (this.field2938 != null) {
                                        var6.method2258((float) (var37 == null ? 0 : var37[var57] - 1));
                                    }
                                    if ((7 & this.field2937) != 0) {
                                        var6.method2258(var72);
                                        var6.method2258(var71);
                                        var6.method2258(var74);
                                    }
                                }
                                var99 = this.field2933++;
                                var56[var57] = (short) var99;
                                if (var62 != -1) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method4252(false, new class654(var56[var57]), var65);
                            } else {
                                var56[var57] = ((class654) var88).field9255;
                                var99 = var56[var57] & 65535;
                                if (~var62 != 0 && ~var31[var57].field10592 > ~var7[var99].field10592) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; var100 < var54; ++var100) {
                                var10[var100].method3923(var73, var70, var85, -7, var99);
                            }
                            ++this.field2942;
                        }
                    }
                }
            }
            for (int var12 = 0; var12 < this.field2933; ++var12) {
                class701 var29 = var7[var12];
                if (var29 != null) {
                    var29.method3927(1, var12);
                }
            }
            for (int var13 = 0; ~super.field5808 < ~var13; ++var13) {
                for (int var18 = 0; var18 < super.field5809; ++var18) {
                    short[] var19 = this.field2910[super.field5808 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var19.length < ~var21) {
                            int var22 = var19[var21++] & 65535;
                            int var23 = var19[var21++] & 65535;
                            int var24 = 65535 & var19[var21++];
                            class701 var25 = var7[var22];
                            class701 var26 = var7[var23];
                            class701 var27 = var7[var24];
                            class701 var28 = null;
                            if (var25 != null) {
                                var25.method3925(var20, 15615, var18, var13);
                                var28 = var25;
                            }
                            if (var26 != null) {
                                var26.method3925(var20, 15615, var18, var13);
                                if (var28 == null || ~var26.field10592 > ~var28.field10592) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method3925(var20, 15615, var18, var13);
                                if (var28 == null || ~var28.field10592 < ~var27.field10592) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method3927(1, var22);
                                }
                                if (var26 != null) {
                                    var28.method3927(1, var23);
                                }
                                if (var27 != null) {
                                    var28.method3927(1, var24);
                                }
                                var28.method3925(var20, 15615, var18, var13);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method2255();
            this.field2951 = this.field2909.method3370(var5, var4, (byte) -77, var6.method2260(), false);
            this.field2954 = new class282(this.field2951, 5126, 3, 0);
            this.field2952 = new class282(this.field2951, 5121, 4, 12);
            byte var14;
            if (this.field2938 == null) {
                this.field2947 = new class282(this.field2951, 5126, 2, 16);
                var14 = 24;
            } else {
                this.field2947 = new class282(this.field2951, 5126, 3, 16);
                var14 = 28;
            }
            if (~(7 & this.field2937) != -1) {
                this.field2946 = new class282(this.field2951, 5126, 3, var14);
            }
            long[] var15 = new long[this.field2949.length];
            for (int var16 = 0; ~var16 > ~this.field2949.length; ++var16) {
                class701 var17 = this.field2949[var16];
                var15[var16] = var17.field10592;
                var17.method3929(this.field2933, 394);
            }
            class185.method1337(this.field2949, -1, var15);
            if (this.field2916 != null) {
                this.field2916.method1279((byte) 120);
            }
        } else {
            this.field2916 = null;
        }
        ++field2943;
        this.field2939 = null;
        this.field2936 = null;
        this.field2913 = null;
        this.field2944 = this.field2917 = null;
        this.field2948 = null;
        this.field2945 = null;
        this.field2957 = this.field2956 = this.field2953 = null;
        this.field2938 = null;
        this.field2914 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)I")
    public static final int method1385(boolean arg0) {
        ++field2920;
        if ((double) class751.field10428 == 3.0D) {
            return 37;
        } else if ((double) class751.field10428 == 4.0D) {
            return 50;
        } else {
            if (arg0) {
                field2935 = null;
            }
            if ((double) class751.field10428 == 6.0D) {
                return 75;
            } else {
                return (double) class751.field10428 == 8.0D ? 100 : 200;
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method825(class115 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2927;
        if (this.field2916 != null && arg0 != null) {
            int var7 = arg1 - (this.field2909.field8221 * arg2 >> 8) >> this.field2909.field8134;
            int var8 = arg3 - (this.field2909.field8205 * arg2 >> 8) >> this.field2909.field8134;
            this.field2916.method1283(var7, var8, 31247, arg0);
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Llea;IIII[[I[[II)V")
    public class195(class573 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field2909 = arg0;
        this.field2953 = new float[super.field5808 - -1][super.field5809 - -1];
        this.field2944 = new int[arg3][arg4][];
        this.field2957 = new float[super.field5808 + 1][super.field5809 - -1];
        this.field2917 = new int[arg3][arg4][];
        this.field2956 = new float[super.field5808 + 1][super.field5809 + 1];
        this.field2921 = 1 << this.field2912;
        this.field2936 = new int[arg3][arg4][];
        this.field2910 = new short[arg3 * arg4][];
        this.field2913 = new int[arg3][arg4][];
        this.field2941 = new byte[arg3][arg4];
        this.field2914 = new class701[arg3][arg4][];
        this.field2937 = arg2;
        this.field2939 = new int[arg3][arg4][];
        this.field2948 = new byte[arg3 + 1][arg4 + 1];
        for (int var9 = 1; var9 < super.field5809; ++var9) {
            for (int var10 = 1; ~super.field5808 < ~var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 - 1][var9];
                int var12 = arg6[var10][var9 + 1] - arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * 4 * arg7 + var11 * var11)));
                this.field2957[var10][var9] = (float) var11 * var13;
                this.field2956[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field2953[var10][var9] = (float) var12 * var13;
            }
        }
        this.field2945 = new class769(128);
        if ((16 & this.field2937) != 0) {
            this.field2916 = new class174(this.field2909, this);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method824(class115 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2911;
        if (this.field2916 != null && arg0 != null) {
            int var7 = -(this.field2909.field8221 * arg2 >> 8) + arg1 >> this.field2909.field8134;
            int var8 = arg3 - (this.field2909.field8205 * arg2 >> 8) >> this.field2909.field8134;
            return this.field2916.method1284(var7, 353, var8, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)Z")
    public static final boolean method1386(int arg0, byte arg1) {
        int var2 = -92 % ((47 - arg1) / 57);
        ++field2940;
        return arg0 == 3 || ~arg0 == -8 || ~arg0 == -11;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IZILkw;)V")
    private final void method1387(int arg0, boolean arg1, int arg2, class9 arg3) {
        ++field2922;
        int[] var5 = this.field2944[arg2][arg0];
        if (arg1) {
            int[] var6 = this.field2917[arg2][arg0];
            int var7 = var5.length;
            if (~this.field2909.field8283.length > ~var7) {
                this.field2909.field8283 = new int[var7];
                this.field2909.field8284 = new int[var7];
            }
            int[] var8 = this.field2909.field8283;
            int[] var9 = this.field2909.field8284;
            for (int var10 = 0; var10 < var7; ++var10) {
                var8[var10] = var5[var10] >> this.field2909.field8134;
                var9[var10] = var6[var10] >> this.field2909.field8134;
            }
            int var11 = 0;
            while (var7 > var11) {
                int var12 = var8[var11];
                int var13 = var9[var11++];
                int var14 = var8[var11];
                int var15 = var9[var11++];
                int var16 = var8[var11];
                int var17 = var9[var11++];
                if ((-var14 + var12) * (-var17 + var15) + -((-var13 + var15) * (-var14 + var16)) > 0) {
                    arg3.method148(var15, var13, var16, var12, 0, var17, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method832(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field2931;
        if (~this.field2950 < -1) {
            this.field2909.method3340((byte) 10);
            this.field2909.method3326((byte) -87, false);
            this.field2909.method3385(false, -8);
            this.field2909.method3387(false, 124);
            this.field2909.method3377(-32, false);
            this.field2909.method3308((byte) 76, 0);
            this.field2909.method3364(0, -2);
            this.field2909.method3384((class377) null, (byte) 52);
            class229.field3355[14] = 0.0F;
            class229.field3355[3] = 0.0F;
            class229.field3355[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field2909.field8015) + 1.0F;
            class229.field3355[9] = 0.0F;
            class229.field3355[11] = 0.0F;
            class229.field3355[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field2909.field7990;
            class229.field3355[6] = 0.0F;
            class229.field3355[7] = 0.0F;
            class229.field3355[2] = 0.0F;
            class229.field3355[8] = 0.0F;
            class229.field3355[5] = (float) arg2 / ((float) super.field5805 * 128.0F * (float) this.field2909.field8015);
            class229.field3355[10] = 0.0F;
            class229.field3355[0] = (float) arg2 / ((float) super.field5805 * 128.0F * (float) this.field2909.field7990);
            class229.field3355[1] = 0.0F;
            class229.field3355[4] = 0.0F;
            class229.field3355[15] = 1.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class229.field3355, 0);
            class229.field3355[7] = 0.0F;
            class229.field3355[1] = 0.0F;
            class229.field3355[8] = 0.0F;
            class229.field3355[9] = 1.0F;
            class229.field3355[3] = 0.0F;
            class229.field3355[2] = 0.0F;
            class229.field3355[6] = 1.0F;
            class229.field3355[12] = 0.0F;
            class229.field3355[11] = 0.0F;
            class229.field3355[13] = 0.0F;
            class229.field3355[4] = 0.0F;
            class229.field3355[15] = 1.0F;
            class229.field3355[5] = 0.0F;
            class229.field3355[10] = 0.0F;
            class229.field3355[14] = 0.0F;
            class229.field3355[0] = 1.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class229.field3355, 0);
            if ((this.field2937 & 7) == 0) {
                this.field2909.method3385(false, -8);
            } else {
                this.field2909.method3385(true, -8);
                this.field2909.method3383(4611);
            }
            this.field2909.method3344(this.field2946, this.field2954, this.field2952, this.field2947, (byte) 127);
            if (this.field2942 * 2 > this.field2909.field8238.field6002.length) {
                this.field2909.field8238 = new class501(this.field2942 * 2);
            } else {
                this.field2909.field8238.field5983 = 0;
            }
            int var9 = 0;
            class501 var10 = this.field2909.field8238;
            if (this.field2909.field8231) {
                for (int var11 = arg4; ~var11 > ~arg6; ++var11) {
                    int var12 = super.field5808 * var11 + arg3;
                    for (int var13 = arg3; ~arg5 < ~var13; ++var13) {
                        if (arg7[var13 - arg3][-arg4 + var11]) {
                            short[] var14 = this.field2910[var12];
                            if (var14 != null) {
                                for (int var15 = 0; var15 < var14.length; ++var15) {
                                    ++var9;
                                    var10.method2546(true, 65535 & var14[var15]);
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; arg6 > var16; ++var16) {
                    int var18 = super.field5808 * var16 + arg3;
                    for (int var19 = arg3; arg5 > var19; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field2910[var18];
                            if (var20 != null) {
                                for (int var21 = 0; ~var20.length < ~var21; ++var21) {
                                    ++var9;
                                    var10.method2582((byte) -55, 65535 & var20[var21]);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (var9 > 0) {
                class700 var17 = new class700(this.field2909, 5123, var10.field6002, var10.field5983);
                this.field2909.method3339(-108, var9, 0, var17, 4);
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III[[ZZII)V")
    public final void method817(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.method1382(arg4, 65, arg0, arg1, arg2, arg5, arg6, arg3);
        ++field2932;
    }
}
