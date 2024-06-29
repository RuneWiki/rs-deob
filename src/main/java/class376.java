import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class376 extends class544 {

    @OriginalMember(owner = "client!nk", name = "S", descriptor = "Lbv;")
    private class568 field5267 = new class568();

    @OriginalMember(owner = "client!nk", name = "A", descriptor = "Luq;")
    public class313 field5250;

    @OriginalMember(owner = "client!nk", name = "D", descriptor = "[[I")
    private int[][] field5252;

    @OriginalMember(owner = "client!nk", name = "v", descriptor = "I")
    private int field5245;

    @OriginalMember(owner = "client!nk", name = "u", descriptor = "[[[I")
    private int[][][] field5244;

    @OriginalMember(owner = "client!nk", name = "I", descriptor = "[[[I")
    public int[][][] field5257;

    @OriginalMember(owner = "client!nk", name = "W", descriptor = "[[F")
    private float[][] field5271;

    @OriginalMember(owner = "client!nk", name = "N", descriptor = "[[[I")
    private int[][][] field5262;

    @OriginalMember(owner = "client!nk", name = "H", descriptor = "I")
    private int field5256;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "[[[I")
    public int[][][] field5235;

    @OriginalMember(owner = "client!nk", name = "Y", descriptor = "[[B")
    private byte[][] field5273;

    @OriginalMember(owner = "client!nk", name = "V", descriptor = "[[S")
    public short[][] field5270;

    @OriginalMember(owner = "client!nk", name = "db", descriptor = "[[F")
    private float[][] field5278;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "[[[Lms;")
    private class107[][][] field5234;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "[[B")
    private byte[][] field5239;

    @OriginalMember(owner = "client!nk", name = "fb", descriptor = "[[F")
    private float[][] field5280;

    @OriginalMember(owner = "client!nk", name = "Q", descriptor = "I")
    public int field5265;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "[[[I")
    private int[][][] field5237;

    @OriginalMember(owner = "client!nk", name = "cb", descriptor = "Lba;")
    private class607 field5277;

    @OriginalMember(owner = "client!nk", name = "G", descriptor = "Lsq;")
    private class443 field5255;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    private int field5233;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    private int field5236;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!nk", name = "w", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!nk", name = "x", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!nk", name = "y", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!nk", name = "z", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!nk", name = "B", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!nk", name = "E", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!nk", name = "F", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!nk", name = "J", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!nk", name = "K", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!nk", name = "M", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!nk", name = "O", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!nk", name = "R", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!nk", name = "T", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!nk", name = "U", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!nk", name = "X", descriptor = "I")
    private int field5272;

    @OriginalMember(owner = "client!nk", name = "ib", descriptor = "I")
    private int field5283;

    @OriginalMember(owner = "client!nk", name = "eb", descriptor = "Lee;")
    private class159 field5279;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "Lrk;")
    public static class419 field5232;

    @OriginalMember(owner = "client!nk", name = "ab", descriptor = "Lcd;")
    public class86 field5275;

    @OriginalMember(owner = "client!nk", name = "bb", descriptor = "Lcd;")
    private class86 field5276;

    @OriginalMember(owner = "client!nk", name = "gb", descriptor = "Lcd;")
    public class86 field5281;

    @OriginalMember(owner = "client!nk", name = "hb", descriptor = "Lcd;")
    public class86 field5282;

    @OriginalMember(owner = "client!nk", name = "Z", descriptor = "[Lms;")
    private class107[] field5274;

    @OriginalMember(owner = "client!nk", name = "L", descriptor = "[[[I")
    private int[][][] field5260;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)V")
    public final void method883(int arg0, int arg1) {
        ++field5269;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lmda;III)V")
    private final void method2296(class17 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -12811) {
            this.field5260 = null;
        }
        ++field5238;
        int[] var5 = this.field5235[arg1][arg3];
        int[] var6 = this.field5257[arg1][arg3];
        int var7 = var5.length;
        if (var7 > this.field5250.field4343.length) {
            this.field5250.field4346 = new int[var7];
            this.field5250.field4343 = new int[var7];
        }
        int[] var8 = this.field5250.field4343;
        int[] var9 = this.field5250.field4346;
        for (int var10 = 0; var10 < var7; ++var10) {
            var8[var10] = var5[var10] >> this.field5250.field4201;
            var9[var10] = var6[var10] >> this.field5250.field4201;
        }
        int var11 = 0;
        while (var7 > var11) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if (~((var12 - var14) * (-var17 + var15) + -((-var13 + var15) * (-var14 + var16))) < -1) {
                arg0.method80(var16, var15, var17, var12, var14, 27089, var13);
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V")
    public static void method2297(int arg0) {
        field5232 = null;
        if (arg0 > -89) {
            field5248 = -97;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method885(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field5242;
        if (this.field5283 > 0) {
            this.field5250.method1915(-12648);
            this.field5250.method1962(-32, false);
            this.field5250.method1930((byte) -67, false);
            this.field5250.method1950(false, 125);
            this.field5250.method1949(false, (byte) 120);
            this.field5250.method1905(3042, 0);
            this.field5250.method1960(-2, 2);
            this.field5250.method1884((class148) null, -2);
            class488.field6799[7] = 0.0F;
            class488.field6799[14] = 0.0F;
            class488.field6799[4] = 0.0F;
            class488.field6799[8] = 0.0F;
            class488.field6799[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field5250.field4083;
            class488.field6799[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field5250.field4003;
            class488.field6799[3] = 0.0F;
            class488.field6799[11] = 0.0F;
            class488.field6799[9] = 0.0F;
            class488.field6799[2] = 0.0F;
            class488.field6799[0] = (float) arg2 / ((float) super.field7582 * 128.0F * (float) this.field5250.field4083);
            class488.field6799[15] = 1.0F;
            class488.field6799[5] = (float) arg2 / ((float) super.field7582 * 128.0F * (float) this.field5250.field4003);
            class488.field6799[1] = 0.0F;
            class488.field6799[6] = 0.0F;
            class488.field6799[10] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class488.field6799, 0);
            class488.field6799[12] = 0.0F;
            class488.field6799[10] = 0.0F;
            class488.field6799[4] = 0.0F;
            class488.field6799[3] = 0.0F;
            class488.field6799[11] = 0.0F;
            class488.field6799[13] = 0.0F;
            class488.field6799[0] = 1.0F;
            class488.field6799[1] = 0.0F;
            class488.field6799[14] = 0.0F;
            class488.field6799[5] = 0.0F;
            class488.field6799[6] = 1.0F;
            class488.field6799[8] = 0.0F;
            class488.field6799[2] = 0.0F;
            class488.field6799[7] = 0.0F;
            class488.field6799[15] = 1.0F;
            class488.field6799[9] = 1.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class488.field6799, 0);
            if ((7 & this.field5265) == 0) {
                this.field5250.method1930((byte) -82, false);
            } else {
                this.field5250.method1930((byte) -76, true);
                this.field5250.method1893(-26006);
            }
            this.field5250.method1924(this.field5282, 0, this.field5281, this.field5275, this.field5276);
            if (~(this.field5233 * 2) >= ~this.field5250.field4285.field7693.length) {
                this.field5250.field4285.field7707 = 0;
            } else {
                this.field5250.field4285 = new class616(this.field5233 * 2);
            }
            int var9 = 0;
            class616 var10 = this.field5250.field4285;
            if (this.field5250.field4291) {
                for (int var11 = arg4; ~arg6 < ~var11; ++var11) {
                    int var12 = super.field7581 * var11 - -arg3;
                    for (int var13 = arg3; var13 < arg5; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field5270[var12];
                            if (var14 != null) {
                                for (int var15 = 0; var15 < var14.length; ++var15) {
                                    var10.method3042(var14[var15] & 65535, -50);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; var16 < arg6; ++var16) {
                    int var18 = super.field7581 * var16 + arg3;
                    for (int var19 = arg3; ~var19 > ~arg5; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field5270[var18];
                            if (var20 != null) {
                                for (int var21 = 0; ~var20.length < ~var21; ++var21) {
                                    ++var9;
                                    var10.method3094(true, 65535 & var20[var21]);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (var9 > 0) {
                class29 var17 = new class29(this.field5250, 5123, var10.field7693, var10.field7707);
                this.field5250.method1923(var9, 93, 4, var17, 0);
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "X", descriptor = "(IILk;)Lk;")
    public final class88 method1035(int arg0, int arg1, class88 arg2) {
        ++field5241;
        if ((this.field5239[arg0][arg1] & 1) == 0) {
            return null;
        } else {
            int var4 = super.field7582 >> this.field5250.field4201;
            class17 var5 = (class17) arg2;
            class17 var6;
            if (var5 != null && var5.method82((byte) -24, var4, var4)) {
                var6 = var5;
                var5.method79(-17895);
            } else {
                var6 = new class17(this.field5250, var4, var4);
            }
            var6.method76(0, -21, var4, var4, 0);
            this.method2296(var6, arg0, -12811, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!nk", name = "ba", descriptor = "(II)I")
    public final int method1031(int arg0, int arg1) {
        ++field5259;
        return this.field5252[arg0][arg1];
    }

    @OriginalMember(owner = "client!nk", name = "aa", descriptor = "(II)I")
    public final int method1040(int arg0, int arg1) {
        ++field5253;
        int var3 = arg0 >> super.field7583;
        int var4 = arg1 >> super.field7583;
        if (var3 >= 0 && var4 >= 0 && ~(super.field7581 + -1) <= ~var3 && ~(super.field7585 + -1) <= ~var4) {
            int var5 = super.field7582 + -1 & arg0;
            int var6 = arg1 & super.field7582 + -1;
            int var7 = (-var5 + super.field7582) * this.field5252[var3][var4] + this.field5252[var3 + 1][var4] * var5 >> super.field7583;
            int var8 = (-var5 + super.field7582) * this.field5252[var3][var4 + 1] + this.field5252[var3 - -1][var4 + 1] * var5 >> super.field7583;
            return (-var6 + super.field7582) * var7 - -(var6 * var8) >> super.field7583;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nk", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1043(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg3 != null && this.field5244 == null) {
            this.field5244 = new int[super.field7581][super.field7585][];
        }
        ++field5268;
        if (arg5 != null && this.field5260 == null) {
            this.field5260 = new int[super.field7581][super.field7585][];
        }
        this.field5235[arg0][arg1] = arg2;
        this.field5257[arg0][arg1] = arg4;
        this.field5262[arg0][arg1] = arg6;
        this.field5237[arg0][arg1] = arg7;
        if (this.field5260 != null) {
            this.field5260[arg0][arg1] = arg5;
        }
        if (this.field5244 != null) {
            this.field5244[arg0][arg1] = arg3;
        }
        class107[] var15 = this.field5234[arg0][arg1] = new class107[arg6.length];
        for (int var16 = 0; ~arg6.length < ~var16; ++var16) {
            long var17 = (long) arg8[var16] | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) (arg9[var16] << 14);
            class108 var19;
            for (var19 = this.field5277.method3476(var17, (byte) 28); var19 != null; var19 = this.field5277.method3481(94)) {
                class107 var20 = (class107) var19;
                if (arg8[var16] == var20.field1388 && (float) arg9[var16] == var20.field1386 && ~var20.field1398 == ~arg10 && var20.field1387 == arg11 && var20.field1378 == arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class107) var19;
            } else {
                var15[var16] = new class107(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field5277.method3475(-118, var15[var16], var17);
            }
        }
        if (arg13) {
            this.field5239[arg0][arg1] = (byte) class292.method1790(this.field5239[arg0][arg1], 1);
        }
        if (this.field5272 < arg6.length) {
            this.field5272 = arg6.length;
        }
        this.field5283 += arg6.length;
    }

    @OriginalMember(owner = "client!nk", name = "Q", descriptor = "(III)V")
    public final void method1044(int arg0, int arg1, int arg2) {
        if (~arg2 < ~(255 & this.field5273[arg0][arg1])) {
            this.field5273[arg0][arg1] = (byte) arg2;
        }
        ++field5258;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IBIII)V")
    public static final void method2298(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field5240;
        if (arg1 > -5) {
            method2300((String) null, 122, 59, -120, -9, (byte[]) null);
        }
        int var5 = 0;
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = -1;
        class373.method2275((byte) -9, arg2 + arg4, arg3, arg4 - arg2, class256.field3173[arg0]);
        while (~var6 < ~var5) {
            var8 += 2;
            ++var5;
            var7 += var8;
            if (~var7 <= -1) {
                --var6;
                var7 -= var6 << 1;
                int[] var9 = class256.field3173[arg0 + var6];
                int[] var10 = class256.field3173[arg0 - var6];
                int var11 = arg4 + var5;
                int var12 = -var5 + arg4;
                class373.method2275((byte) -9, var11, arg3, var12, var9);
                class373.method2275((byte) -9, var11, arg3, var12, var10);
            }
            int var13 = arg4 + var6;
            int var14 = -var6 + arg4;
            int[] var15 = class256.field3173[arg0 + var5];
            int[] var16 = class256.field3173[-var5 + arg0];
            class373.method2275((byte) -9, var13, arg3, var14, var15);
            class373.method2275((byte) -9, var13, arg3, var14, var16);
        }
    }

    @OriginalMember(owner = "client!nk", name = "ya", descriptor = "(Lk;IIIIZ)V")
    public final void method1037(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5246;
        if (this.field5255 != null && arg0 != null) {
            int var7 = -(this.field5250.field4259 * arg2 >> 8) + arg1 >> this.field5250.field4201;
            int var8 = -(this.field5250.field4321 * arg2 >> 8) + arg3 >> this.field5250.field4201;
            this.field5255.method2579(var7, var8, arg0, (byte) -90);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIII[[ZZI)V")
    private final void method2299(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, boolean arg5, int arg6) {
        ++field5243;
        if (this.field5274 != null) {
            int var8 = arg0 - -arg0 + 1;
            int var9 = var8 * var8;
            if (~this.field5250.field4347.length > ~var9) {
                this.field5250.field4347 = new int[var9];
            }
            if (this.field5233 * 2 > this.field5250.field4285.field7693.length) {
                this.field5250.field4285 = new class616(this.field5233 * 2);
            }
            int var10 = -arg0 + arg3;
            int var11 = var10;
            if (~var10 > -1) {
                var10 = 0;
            }
            int var12 = -arg0 + arg2;
            int var13 = var12;
            if (var12 < 0) {
                var12 = 0;
            }
            int var14 = arg0 + arg3;
            if (super.field7581 + -1 < var14) {
                var14 = super.field7581 + -1;
            }
            int var15 = arg2 - -arg0;
            if (super.field7585 + -1 < var15) {
                var15 = super.field7585 - 1;
            }
            int var16 = 0;
            int[] var17 = this.field5250.field4347;
            for (int var18 = var10; ~var18 >= ~var14; ++var18) {
                boolean[] var24 = arg4[var18 - var11];
                for (int var25 = var12; ~var25 >= ~var15; ++var25) {
                    if (var24[-var13 + var25]) {
                        var17[var16++] = super.field7581 * var25 + var18;
                    }
                }
            }
            if (~arg1 != 0) {
                this.field5250.method1907(-4, (float) arg1);
                this.field5250.method1952((byte) -123);
            } else {
                this.field5250.method1925(false);
            }
            this.field5250.method1930((byte) -80, ~(7 & this.field5265) != -1);
            for (int var19 = 0; ~var19 > ~this.field5274.length; ++var19) {
                this.field5274[var19].method581(var17, arg6 ^ -95, var16);
            }
            if (!this.field5267.method3179(true)) {
                int var20 = this.field5250.field4236;
                int var21 = this.field5250.field4226;
                this.field5250.method923(0, var21, this.field5250.field4275);
                this.field5250.method1930((byte) -86, false);
                this.field5250.method1949(false, (byte) 120);
                this.field5250.method1905(3042, 128);
                this.field5250.method1960(-2, 2);
                this.field5250.method1884(this.field5250.field4328, -2);
                this.field5250.method1887(arg6 + -96, 8448, 7681);
                this.field5250.method1933(-88, 770, 0, 34166);
                this.field5250.method1947(34162, 34167, 0, 770);
                for (class108 var22 = this.field5267.method3188((byte) -100); var22 != null; var22 = this.field5267.method3182((byte) -84)) {
                    class80 var23 = (class80) var22;
                    var23.method453(123, arg3, arg2, arg0, arg4);
                }
                this.field5250.method1933(-82, 768, 0, 5890);
                this.field5250.method1947(34162, 5890, 0, 770);
                this.field5250.method1884((class148) null, -2);
                this.field5250.method923(var20, var21, this.field5250.field4275);
            }
            if (this.field5255 != null) {
                this.field5250.method1924(this.field5282, 0, this.field5281, (class86) null, (class86) null);
                this.field5255.method2570(arg0, arg5, arg4, arg3, arg2, -20225);
            }
        }
        if (arg6 != 0) {
            this.method1032((class592) null, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!nk", name = "F", descriptor = "(Lk;IIIIZ)V")
    public final void method1041(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5263;
        if (this.field5255 != null && arg0 != null) {
            int var7 = -(this.field5250.field4259 * arg2 >> 8) + arg1 >> this.field5250.field4201;
            int var8 = arg3 - (this.field5250.field4321 * arg2 >> 8) >> this.field5250.field4201;
            this.field5255.method2578(-119, arg0, var7, var8);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1047(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field5261;
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
        this.method1043(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(III[[ZZ)V")
    public final void method1045(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method2299(arg2, -1, arg1, arg0, arg3, arg4, 0);
        ++field5264;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;IIII[B)I")
    public static final int method2300(String arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        ++field5249;
        int var6 = arg3 - arg1;
        for (int var7 = 0; var7 < var6; ++var7) {
            char var8 = arg0.charAt(arg1 + var7);
            if (~var8 < -1 && ~var8 > -129 || ~var8 <= -161 && ~var8 >= -256) {
                arg5[arg4 - -var7] = (byte) var8;
            } else if (~var8 != -8365) {
                if (~var8 != -8219) {
                    if (var8 != 402) {
                        if (var8 == 8222) {
                            arg5[arg4 + var7] = -124;
                        } else if (~var8 == -8231) {
                            arg5[arg4 + var7] = -123;
                        } else if (var8 != 8224) {
                            if (var8 == 8225) {
                                arg5[arg4 + var7] = -121;
                            } else if (~var8 == -711) {
                                arg5[arg4 + var7] = -120;
                            } else if (~var8 != -8241) {
                                if (~var8 != -353) {
                                    if (var8 != 8249) {
                                        if (var8 != 338) {
                                            if (~var8 == -382) {
                                                arg5[arg4 + var7] = -114;
                                            } else if (var8 != 8216) {
                                                if (var8 != 8217) {
                                                    if (~var8 != -8221) {
                                                        if (~var8 != -8222) {
                                                            if (~var8 == -8227) {
                                                                arg5[arg4 - -var7] = -107;
                                                            } else if (~var8 != -8212) {
                                                                if (~var8 != -8213) {
                                                                    if (var8 != 732) {
                                                                        if (~var8 == -8483) {
                                                                            arg5[arg4 + var7] = -103;
                                                                        } else if (~var8 != -354) {
                                                                            if (~var8 == -8251) {
                                                                                arg5[arg4 + var7] = -101;
                                                                            } else if (~var8 == -340) {
                                                                                arg5[arg4 - -var7] = -100;
                                                                            } else if (var8 != 382) {
                                                                                if (~var8 != -377) {
                                                                                    arg5[arg4 - -var7] = 63;
                                                                                } else {
                                                                                    arg5[arg4 + var7] = -97;
                                                                                }
                                                                            } else {
                                                                                arg5[arg4 - -var7] = -98;
                                                                            }
                                                                        } else {
                                                                            arg5[arg4 + var7] = -102;
                                                                        }
                                                                    } else {
                                                                        arg5[arg4 + var7] = -104;
                                                                    }
                                                                } else {
                                                                    arg5[arg4 + var7] = -105;
                                                                }
                                                            } else {
                                                                arg5[arg4 + var7] = -106;
                                                            }
                                                        } else {
                                                            arg5[arg4 - -var7] = -108;
                                                        }
                                                    } else {
                                                        arg5[arg4 + var7] = -109;
                                                    }
                                                } else {
                                                    arg5[arg4 - -var7] = -110;
                                                }
                                            } else {
                                                arg5[arg4 + var7] = -111;
                                            }
                                        } else {
                                            arg5[arg4 + var7] = -116;
                                        }
                                    } else {
                                        arg5[arg4 + var7] = -117;
                                    }
                                } else {
                                    arg5[arg4 + var7] = -118;
                                }
                            } else {
                                arg5[arg4 + var7] = -119;
                            }
                        } else {
                            arg5[arg4 + var7] = -122;
                        }
                    } else {
                        arg5[arg4 + var7] = -125;
                    }
                } else {
                    arg5[arg4 + var7] = -126;
                }
            } else {
                arg5[arg4 + var7] = -128;
            }
        }
        if (arg2 != -30627) {
            method2300((String) null, 78, 68, 38, 29, (byte[]) null);
        }
        return var6;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lk;IIIIZ)Z")
    public final boolean method1034(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5254;
        if (this.field5255 != null && arg0 != null) {
            int var7 = -(this.field5250.field4259 * arg2 >> 8) + arg1 >> this.field5250.field4201;
            int var8 = -(this.field5250.field4321 * arg2 >> 8) + arg3 >> this.field5250.field4201;
            return this.field5255.method2576(var8, var7, true, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nk", name = "N", descriptor = "()V")
    public final void method1046() {
        ++field5251;
        if (this.field5283 <= 0) {
            this.field5255 = null;
        } else {
            byte[][] var1 = new byte[super.field7581 + 1][super.field7585 + 1];
            for (int var2 = 1; super.field7581 > var2; ++var2) {
                for (int var103 = 1; super.field7585 > var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field5273[var2][var103 + -1] >> 2) + (this.field5273[var2 + -1][var103] >> 2) + (this.field5273[var2 + 1][var103] >> 3) + (this.field5273[var2][var103 + 1] >> 3) + (this.field5273[var2][var103] >> 1));
                }
            }
            this.field5274 = new class107[this.field5277.method3480(-24064)];
            this.field5277.method3477(this.field5274, (byte) -101);
            for (int var3 = 0; ~this.field5274.length < ~var3; ++var3) {
                this.field5274[var3].method585(this.field5283, 255);
            }
            int var4 = 24;
            if (this.field5260 != null) {
                var4 += 4;
            }
            if ((7 & this.field5265) != 0) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field5250.field4202.method3194(this.field5283 * var4, false);
            Stream var6 = new Stream(var5);
            class107[] var7 = new class107[this.field5283];
            int var8 = class103.method565(32085, this.field5283 / 4);
            if (~var8 > -2) {
                var8 = 1;
            }
            class607 var9 = new class607(var8);
            class107[] var10 = new class107[this.field5272];
            for (int var11 = 0; ~var11 > ~super.field7581; ++var11) {
                for (int var30 = 0; ~var30 > ~super.field7585; ++var30) {
                    if (this.field5262[var11][var30] != null) {
                        class107[] var31 = this.field5234[var11][var30];
                        int[] var32 = this.field5235[var11][var30];
                        int[] var33 = this.field5257[var11][var30];
                        int[] var34 = this.field5237[var11][var30];
                        int[] var35 = this.field5262[var11][var30];
                        int[] var36 = this.field5244 == null ? null : this.field5244[var11][var30];
                        int[] var37 = this.field5260 == null ? null : this.field5260[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        float var38 = this.field5271[var11][var30];
                        float var39 = this.field5280[var11][var30];
                        float var40 = this.field5278[var11][var30];
                        float var41 = this.field5271[var11][var30 - -1];
                        float var42 = this.field5280[var11][var30 - -1];
                        float var43 = this.field5278[var11][var30 + 1];
                        float var44 = this.field5271[var11 + 1][var30 + 1];
                        float var45 = this.field5280[var11 + 1][var30 + 1];
                        float var46 = this.field5278[var11 - -1][var30 + 1];
                        float var47 = this.field5271[var11 + 1][var30];
                        float var48 = this.field5280[var11 + 1][var30];
                        float var49 = this.field5278[var11 - -1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = 255 & var1[var11][var30 + 1];
                        int var52 = 255 & var1[var11 - -1][var30 - -1];
                        int var53 = var1[var11 + 1][var30] & 255;
                        int var54 = 0;
                        label340: for (int var55 = 0; ~var55 > ~var35.length; ++var55) {
                            class107 var101 = var31[var55];
                            for (int var102 = 0; var54 > var102; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label340;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field5270[super.field7581 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; var57 < var35.length; ++var57) {
                            int var58 = (var11 << super.field7583) + var32[var57];
                            int var59 = (var30 << super.field7583) + var33[var57];
                            int var60 = var58 >> this.field5245;
                            int var61 = var59 >> this.field5245;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 != null ? var36[var57] : 0;
                            long var65 = (long) (var60 << 16) | (long) var63 << 48 | (long) var62 << 32 | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71;
                            float var72;
                            float var73;
                            int var74;
                            if (~var67 == -1 && var68 == 0) {
                                var71 = var39;
                                var72 = var40;
                                var73 = var38;
                                var74 = var69 - var50;
                            } else if (var67 == 0 && ~super.field7582 == ~var68) {
                                var71 = var42;
                                var73 = var41;
                                var74 = var69 - var51;
                                var72 = var43;
                            } else if (~super.field7582 == ~var67 && super.field7582 == var68) {
                                var73 = var44;
                                var71 = var45;
                                var72 = var46;
                                var74 = var69 - var52;
                            } else if (~super.field7582 == ~var67 && ~var68 == -1) {
                                var72 = var49;
                                var74 = var69 - var53;
                                var73 = var47;
                                var71 = var48;
                            } else {
                                float var75 = (float) var67 / (float) super.field7582;
                                float var76 = (float) var68 / (float) super.field7582;
                                float var77 = (var47 - var38) * var75 + var38;
                                float var78 = (-var39 + var48) * var75 + var39;
                                float var79 = (var49 - var40) * var75 + var40;
                                float var80 = (-var41 + var44) * var75 + var41;
                                float var81 = (var45 - var42) * var75 + var42;
                                float var82 = (var46 - var43) * var75 + var43;
                                var71 = (-var78 + var81) * var76 + var78;
                                var73 = (var80 - var77) * var76 + var77;
                                var72 = (-var79 + var82) * var76 + var79;
                                int var83 = ((-var50 + var53) * var67 >> super.field7583) + var50;
                                int var84 = ((-var51 + var52) * var67 >> super.field7583) + var51;
                                var74 = var69 - (((var84 - var83) * var68 >> super.field7583) + var83);
                            }
                            float var85 = 1.0F;
                            if (var62 != -1) {
                                int var86 = (127 & var62) * var74 >> 7;
                                if (var86 < 2) {
                                    var86 = 2;
                                } else if (~var86 < -127) {
                                    var86 = 126;
                                }
                                if ((this.field5265 & 7) == 0) {
                                    float var87 = this.field5250.field4284[2] * var72 + this.field5250.field4284[0] * var73 + this.field5250.field4284[1] * var71;
                                    var85 = (!(var87 > 0.0F) ? this.field5250.field4326 : this.field5250.field4337) * var87 + this.field5250.field4264;
                                }
                                var70 = class190.field2453[var86 | var62 & 65408];
                            }
                            class108 var88 = null;
                            if ((this.field5256 + -1 & var58) == 0 && (this.field5256 + -1 & var59) == 0) {
                                var88 = var9.method3476(var65, (byte) 28);
                            }
                            int var89;
                            if (var88 != null) {
                                var56[var57] = ((class149) var88).field1928;
                                var89 = var56[var57] & 65535;
                                if (var62 != -1 && var7[var89].field1401 > var31[var57].field1401) {
                                    var7[var89] = var31[var57];
                                }
                            } else {
                                int var90;
                                if (~var62 == ~var63) {
                                    var90 = var70;
                                } else {
                                    int var91 = (var63 & 127) * var74 >> 7;
                                    if (var91 >= 2) {
                                        if (~var91 < -127) {
                                            var91 = 126;
                                        }
                                    } else {
                                        var91 = 2;
                                    }
                                    var90 = class190.field2453[var91 | 65408 & var63];
                                    if ((7 & this.field5265) == 0) {
                                        float var92 = this.field5250.field4284[2] * var72 + this.field5250.field4284[0] * var73 + this.field5250.field4284[1] * var71;
                                        float var93 = this.field5250.field4264 + (var85 > 0.0F ? this.field5250.field4337 : this.field5250.field4326) * var85;
                                        int var94 = var90 >> 16 & 255;
                                        int var95 = 255 & var90 >> 8;
                                        int var96 = 255 & var90;
                                        int var97 = (int) ((float) var94 * var93);
                                        int var98 = (int) ((float) var95 * var93);
                                        if (~var97 <= -1) {
                                            if (~var97 < -256) {
                                                var97 = 255;
                                            }
                                        } else {
                                            var97 = 0;
                                        }
                                        if (~var98 > -1) {
                                            var98 = 0;
                                        } else if (var98 > 255) {
                                            var98 = 255;
                                        }
                                        int var99 = (int) ((float) var96 * var93);
                                        if (~var99 > -1) {
                                            var99 = 0;
                                        } else if (var99 > 255) {
                                            var99 = 255;
                                        }
                                        var90 = var99 | var97 << 16 | var98 << 8;
                                    }
                                }
                                if (!this.field5250.field4291) {
                                    var6.method3206((float) var58);
                                    var6.method3206((float) (this.method1040(var58, var59) + var64));
                                    var6.method3206((float) var59);
                                    var6.method3205((byte) (var90 >> 16));
                                    var6.method3205((byte) (var90 >> 8));
                                    var6.method3205((byte) var90);
                                    var6.method3205(-1);
                                    var6.method3206((float) var58);
                                    var6.method3206((float) var59);
                                    if (this.field5260 != null) {
                                        var6.method3206((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if (~(7 & this.field5265) != -1) {
                                        var6.method3206(var73);
                                        var6.method3206(var71);
                                        var6.method3206(var72);
                                    }
                                } else {
                                    var6.method3197((float) var58);
                                    var6.method3197((float) (var64 + this.method1040(var58, var59)));
                                    var6.method3197((float) var59);
                                    var6.method3205((byte) (var90 >> 16));
                                    var6.method3205((byte) (var90 >> 8));
                                    var6.method3205((byte) var90);
                                    var6.method3205(-1);
                                    var6.method3197((float) var58);
                                    var6.method3197((float) var59);
                                    if (this.field5260 != null) {
                                        var6.method3197((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if ((this.field5265 & 7) != 0) {
                                        var6.method3197(var73);
                                        var6.method3197(var71);
                                        var6.method3197(var72);
                                    }
                                }
                                var89 = this.field5236++;
                                var56[var57] = (short) var89;
                                if (var62 != -1) {
                                    var7[var89] = var31[var57];
                                }
                                var9.method3475(-97, new class149(var56[var57]), var65);
                            }
                            for (int var100 = 0; ~var54 < ~var100; ++var100) {
                                var10[var100].method584(var89, var74, (byte) 30, var70, var85);
                            }
                            ++this.field5233;
                        }
                    }
                }
            }
            for (int var12 = 0; this.field5236 > var12; ++var12) {
                class107 var29 = var7[var12];
                if (var29 != null) {
                    var29.method587(var12, 0);
                }
            }
            for (int var13 = 0; var13 < super.field7581; ++var13) {
                for (int var18 = 0; super.field7585 > var18; ++var18) {
                    short[] var19 = this.field5270[super.field7581 * var18 - -var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (var21 < var19.length) {
                            int var22 = var19[var21++] & 65535;
                            int var23 = 65535 & var19[var21++];
                            int var24 = var19[var21++] & 65535;
                            class107 var25 = var7[var22];
                            class107 var26 = var7[var23];
                            class107 var27 = var7[var24];
                            class107 var28 = null;
                            if (var25 != null) {
                                var25.method583(var18, var13, var20, (byte) 106);
                                var28 = var25;
                            }
                            if (var26 != null) {
                                var26.method583(var18, var13, var20, (byte) 106);
                                if (var28 == null || var28.field1401 > var26.field1401) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method583(var18, var13, var20, (byte) 106);
                                if (var28 == null || var28.field1401 > var27.field1401) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method587(var22, 0);
                                }
                                if (var26 != null) {
                                    var28.method587(var23, 0);
                                }
                                if (var27 != null) {
                                    var28.method587(var24, 0);
                                }
                                var28.method583(var18, var13, var20, (byte) 106);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3207();
            this.field5279 = this.field5250.method1958(var6.method3202(), false, var4, var5, (byte) -123);
            this.field5281 = new class86(this.field5279, 5126, 3, 0);
            this.field5276 = new class86(this.field5279, 5121, 4, 12);
            byte var14;
            if (this.field5260 != null) {
                this.field5282 = new class86(this.field5279, 5126, 3, 16);
                var14 = 28;
            } else {
                var14 = 24;
                this.field5282 = new class86(this.field5279, 5126, 2, 16);
            }
            if ((this.field5265 & 7) != 0) {
                this.field5275 = new class86(this.field5279, 5126, 3, var14);
            }
            long[] var15 = new long[this.field5274.length];
            for (int var16 = 0; var16 < this.field5274.length; ++var16) {
                class107 var17 = this.field5274[var16];
                var15[var16] = var17.field1401;
                var17.method588(this.field5236, false);
            }
            class432.method2523(this.field5274, -1674857116, var15);
            if (this.field5255 != null) {
                this.field5255.method2575(66);
            }
        }
        this.field5271 = this.field5280 = this.field5278 = null;
        this.field5244 = null;
        this.field5234 = null;
        this.field5235 = this.field5257 = null;
        this.field5277 = null;
        this.field5273 = null;
        this.field5260 = null;
        this.field5262 = null;
        this.field5237 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIII)V")
    public static final void method2301(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5266;
        class632 var5 = class641.method3699(-103, 4, arg3);
        var5.method3656(0);
        var5.field9198 = arg2;
        var5.field9203 = arg1;
        var5.field9197 = arg0;
        if (arg4 != -31631) {
            field5248 = 108;
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Luq;IIII[[I[[II)V")
    public class376(class313 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field5250 = arg0;
        this.field5252 = arg5;
        this.field5245 = super.field7583 + -2;
        this.field5244 = new int[arg3][arg4][];
        this.field5257 = new int[arg3][arg4][];
        this.field5271 = new float[super.field7581 + 1][super.field7585 + 1];
        this.field5262 = new int[arg3][arg4][];
        this.field5256 = 1 << this.field5245;
        this.field5235 = new int[arg3][arg4][];
        this.field5273 = new byte[arg3 + 1][arg4 + 1];
        this.field5270 = new short[arg3 * arg4][];
        this.field5278 = new float[super.field7581 + 1][super.field7585 + 1];
        this.field5234 = new class107[arg3][arg4][];
        this.field5239 = new byte[arg3][arg4];
        this.field5280 = new float[super.field7581 - -1][super.field7585 + 1];
        this.field5265 = arg2;
        this.field5237 = new int[arg3][arg4][];
        for (int var9 = 1; ~super.field7585 < ~var9; ++var9) {
            for (int var10 = 1; ~super.field7581 < ~var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 - 1][var9];
                int var12 = arg6[var10][var9 + 1] - arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + arg7 * arg7 * 4 + var12 * var12)));
                this.field5271[var10][var9] = (float) var11 * var13;
                this.field5280[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field5278[var10][var9] = (float) var12 * var13;
            }
        }
        this.field5277 = new class607(128);
        if (~(this.field5265 & 16) != -1) {
            this.field5255 = new class443(this.field5250, this);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lww;[I)V")
    public final void method1032(class592 arg0, int[] arg1) {
        ++field5247;
        this.field5267.method3181(new class80(this.field5250, this, arg0, arg1), true);
    }
}
