import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class521 extends class37 {

    @OriginalMember(owner = "client!tv", name = "t", descriptor = "Lor;")
    private class594 field7528 = new class594();

    @OriginalMember(owner = "client!tv", name = "I", descriptor = "I")
    private int field7543 = this.field515 + -2;

    @OriginalMember(owner = "client!tv", name = "H", descriptor = "Ler;")
    public class92 field7542;

    @OriginalMember(owner = "client!tv", name = "U", descriptor = "[[[I")
    public int[][][] field7554;

    @OriginalMember(owner = "client!tv", name = "O", descriptor = "[[[I")
    public int[][][] field7548;

    @OriginalMember(owner = "client!tv", name = "cb", descriptor = "[[F")
    private float[][] field7562;

    @OriginalMember(owner = "client!tv", name = "E", descriptor = "[[[I")
    public int[][][] field7539;

    @OriginalMember(owner = "client!tv", name = "L", descriptor = "I")
    public int field7545;

    @OriginalMember(owner = "client!tv", name = "fb", descriptor = "[[F")
    private float[][] field7565;

    @OriginalMember(owner = "client!tv", name = "m", descriptor = "[[[I")
    private int[][][] field7521;

    @OriginalMember(owner = "client!tv", name = "F", descriptor = "[[[I")
    private int[][][] field7540;

    @OriginalMember(owner = "client!tv", name = "G", descriptor = "[[S")
    public short[][] field7541;

    @OriginalMember(owner = "client!tv", name = "M", descriptor = "[[[Lpf;")
    private class540[][][] field7546;

    @OriginalMember(owner = "client!tv", name = "ab", descriptor = "[[F")
    private float[][] field7560;

    @OriginalMember(owner = "client!tv", name = "p", descriptor = "[[B")
    private byte[][] field7524;

    @OriginalMember(owner = "client!tv", name = "bb", descriptor = "[[B")
    private byte[][] field7561;

    @OriginalMember(owner = "client!tv", name = "y", descriptor = "I")
    private int field7533;

    @OriginalMember(owner = "client!tv", name = "X", descriptor = "Lsba;")
    private class200 field7557;

    @OriginalMember(owner = "client!tv", name = "u", descriptor = "Lmi;")
    private class460 field7529;

    @OriginalMember(owner = "client!tv", name = "n", descriptor = "[J")
    public static long[] field7522 = new long[10];

    @OriginalMember(owner = "client!tv", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field7550 = "";

    @OriginalMember(owner = "client!tv", name = "P", descriptor = "[C")
    private static char[] field7549 = new char[64];

    @OriginalMember(owner = "client!tv", name = "gb", descriptor = "Z")
    public static boolean field7566;

    @OriginalMember(owner = "client!tv", name = "ib", descriptor = "Lhga;")
    public static class158 field7568;

    @OriginalMember(owner = "client!tv", name = "l", descriptor = "I")
    public static int field7520;

    @OriginalMember(owner = "client!tv", name = "o", descriptor = "I")
    public static int field7523;

    @OriginalMember(owner = "client!tv", name = "q", descriptor = "I")
    public static int field7525;

    @OriginalMember(owner = "client!tv", name = "r", descriptor = "I")
    public static int field7526;

    @OriginalMember(owner = "client!tv", name = "v", descriptor = "I")
    public static int field7530;

    @OriginalMember(owner = "client!tv", name = "w", descriptor = "I")
    public static int field7531;

    @OriginalMember(owner = "client!tv", name = "x", descriptor = "I")
    public static int field7532;

    @OriginalMember(owner = "client!tv", name = "z", descriptor = "I")
    public static int field7534;

    @OriginalMember(owner = "client!tv", name = "A", descriptor = "I")
    private int field7535;

    @OriginalMember(owner = "client!tv", name = "B", descriptor = "I")
    public static int field7536;

    @OriginalMember(owner = "client!tv", name = "C", descriptor = "I")
    public static int field7537;

    @OriginalMember(owner = "client!tv", name = "D", descriptor = "I")
    private int field7538;

    @OriginalMember(owner = "client!tv", name = "J", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!tv", name = "N", descriptor = "I")
    public static int field7547;

    @OriginalMember(owner = "client!tv", name = "R", descriptor = "I")
    public static int field7551;

    @OriginalMember(owner = "client!tv", name = "S", descriptor = "I")
    public static int field7552;

    @OriginalMember(owner = "client!tv", name = "T", descriptor = "I")
    public static int field7553;

    @OriginalMember(owner = "client!tv", name = "Y", descriptor = "I")
    private int field7558;

    @OriginalMember(owner = "client!tv", name = "hb", descriptor = "I")
    private int field7567;

    @OriginalMember(owner = "client!tv", name = "Z", descriptor = "Lvd;")
    private class36 field7559;

    @OriginalMember(owner = "client!tv", name = "V", descriptor = "Lmk;")
    private class51 field7555;

    @OriginalMember(owner = "client!tv", name = "W", descriptor = "Lmk;")
    public class51 field7556;

    @OriginalMember(owner = "client!tv", name = "eb", descriptor = "Lmk;")
    public class51 field7564;

    @OriginalMember(owner = "client!tv", name = "jb", descriptor = "Lmk;")
    public class51 field7569;

    @OriginalMember(owner = "client!tv", name = "db", descriptor = "[Lpf;")
    private class540[] field7563;

    @OriginalMember(owner = "client!tv", name = "s", descriptor = "[[[I")
    private int[][][] field7527;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(III[[ZZI)V")
    public final void method490(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field7532;
        this.method3141(arg4, (byte) 2, arg1, arg3, arg5, arg0, arg2);
    }

    @OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Ler;IIII[[I[[II)V")
    public class521(class92 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field7542 = arg0;
        this.field7554 = new int[arg3][arg4][];
        this.field7548 = new int[arg3][arg4][];
        this.field7562 = new float[super.field510 - -1][super.field513 + 1];
        this.field7539 = new int[arg3][arg4][];
        this.field7545 = arg2;
        this.field7565 = new float[super.field510 + 1][super.field513 + 1];
        this.field7521 = new int[arg3][arg4][];
        this.field7540 = new int[arg3][arg4][];
        this.field7541 = new short[arg3 * arg4][];
        this.field7546 = new class540[arg3][arg4][];
        this.field7560 = new float[super.field510 + 1][super.field513 + 1];
        this.field7524 = new byte[arg3][arg4];
        this.field7561 = new byte[arg3 + 1][arg4 - -1];
        this.field7533 = 1 << this.field7543;
        for (int var9 = 1; super.field513 > var9; ++var9) {
            for (int var10 = 1; ~super.field510 < ~var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 - -1] + -arg6[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + arg7 * 4 * arg7 + var12 * var12)));
                this.field7560[var10][var9] = (float) var11 * var13;
                this.field7562[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field7565[var10][var9] = (float) var12 * var13;
            }
        }
        this.field7557 = new class200(128);
        if (~(this.field7545 & 16) != -1) {
            this.field7529 = new class460(this.field7542, this);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(II)V")
    public final void method489(int arg0, int arg1) {
        ++field7537;
    }

    @OriginalMember(owner = "client!tv", name = "DA", descriptor = "(Lha;IIIIZ)V")
    public final void method475(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7531;
        if (this.field7529 != null && arg0 != null) {
            int var7 = -(this.field7542.field1382 * arg2 >> 8) + arg1 >> this.field7542.field1328;
            int var8 = arg3 - (this.field7542.field1392 * arg2 >> 8) >> this.field7542.field1328;
            this.field7529.method2881(false, var8, var7, arg0);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lha;IIIIZ)Z")
    public final boolean method481(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7547;
        if (this.field7529 != null && arg0 != null) {
            int var7 = -(this.field7542.field1382 * arg2 >> 8) + arg1 >> this.field7542.field1328;
            int var8 = -(this.field7542.field1392 * arg2 >> 8) + arg3 >> this.field7542.field1328;
            return this.field7529.method2885(var8, 1, arg0, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILcda;II)V")
    private final void method3139(int arg0, class156 arg1, int arg2, int arg3) {
        ++field7523;
        int[] var5 = this.field7554[arg3][arg0];
        if (arg2 != 12) {
            this.field7564 = null;
        }
        int[] var6 = this.field7548[arg3][arg0];
        int var7 = var5.length;
        if (var7 > this.field7542.field1478.length) {
            this.field7542.field1478 = new int[var7];
            this.field7542.field1479 = new int[var7];
        }
        int[] var8 = this.field7542.field1478;
        int[] var9 = this.field7542.field1479;
        for (int var10 = 0; ~var7 < ~var10; ++var10) {
            var8[var10] = var5[var10] >> this.field7542.field1328;
            var9[var10] = var6[var10] >> this.field7542.field1328;
        }
        int var11 = 0;
        while (~var11 > ~var7) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if ((var12 - var14) * (-var17 + var15) + -((-var13 + var15) * (-var14 + var16)) > 0) {
                arg1.method1291(var14, (byte) 65, var15, var16, var17, var12, var13);
            }
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)V")
    public static void method3140(byte arg0) {
        field7568 = null;
        int var1 = 124 / ((arg0 - -84) / 42);
        field7549 = null;
        field7550 = null;
        field7522 = null;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field7525;
        if (~this.field7558 < -1) {
            this.field7542.method868((byte) -111);
            this.field7542.method882((byte) -57, false);
            this.field7542.method866(false, -8);
            this.field7542.method869(false, 2929);
            this.field7542.method877(false, -32);
            this.field7542.method889(118, 0);
            this.field7542.method887(2, -2);
            this.field7542.method856(false, (class386) null);
            class289.field4583[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field7542.field1273;
            class289.field4583[11] = 0.0F;
            class289.field4583[3] = 0.0F;
            class289.field4583[7] = 0.0F;
            class289.field4583[10] = 0.0F;
            class289.field4583[8] = 0.0F;
            class289.field4583[15] = 1.0F;
            class289.field4583[14] = 0.0F;
            class289.field4583[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field7542.field1242) + 1.0F;
            class289.field4583[6] = 0.0F;
            class289.field4583[5] = (float) arg2 / ((float) super.field516 * 128.0F * (float) this.field7542.field1242);
            class289.field4583[9] = 0.0F;
            class289.field4583[2] = 0.0F;
            class289.field4583[0] = (float) arg2 / ((float) super.field516 * 128.0F * (float) this.field7542.field1273);
            class289.field4583[4] = 0.0F;
            class289.field4583[1] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class289.field4583, 0);
            class289.field4583[1] = 0.0F;
            class289.field4583[6] = 1.0F;
            class289.field4583[12] = 0.0F;
            class289.field4583[14] = 0.0F;
            class289.field4583[8] = 0.0F;
            class289.field4583[5] = 0.0F;
            class289.field4583[10] = 0.0F;
            class289.field4583[3] = 0.0F;
            class289.field4583[4] = 0.0F;
            class289.field4583[9] = 1.0F;
            class289.field4583[15] = 1.0F;
            class289.field4583[2] = 0.0F;
            class289.field4583[7] = 0.0F;
            class289.field4583[13] = 0.0F;
            class289.field4583[0] = 1.0F;
            class289.field4583[11] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class289.field4583, 0);
            if (~(7 & this.field7545) != -1) {
                this.field7542.method866(true, -8);
                this.field7542.method895(128);
            } else {
                this.field7542.method866(false, -8);
            }
            this.field7542.method858(this.field7569, this.field7555, (byte) 115, this.field7564, this.field7556);
            if (~this.field7542.field1468.field96.length <= ~(this.field7538 * 2)) {
                this.field7542.field1468.field57 = 0;
            } else {
                this.field7542.field1468 = new class148(this.field7538 * 2);
            }
            int var9 = 0;
            class148 var10 = this.field7542.field1468;
            if (!this.field7542.field1410) {
                for (int var11 = arg4; ~arg6 < ~var11; ++var11) {
                    int var12 = super.field510 * var11 + arg3;
                    for (int var13 = arg3; ~arg5 < ~var13; ++var13) {
                        if (arg7[var13 - arg3][-arg4 + var11]) {
                            short[] var14 = this.field7541[var12];
                            if (var14 != null) {
                                for (int var15 = 0; ~var14.length < ~var15; ++var15) {
                                    ++var9;
                                    var10.method49(-1060492440, 65535 & var14[var15]);
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; ~arg6 < ~var16; ++var16) {
                    int var18 = super.field510 * var16 - -arg3;
                    for (int var19 = arg3; ~var19 > ~arg5; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field7541[var18];
                            if (var20 != null) {
                                for (int var21 = 0; ~var21 > ~var20.length; ++var21) {
                                    var10.method25(true, var20[var21] & 65535);
                                    ++var9;
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class450 var17 = new class450(this.field7542, 5123, var10.field96, var10.field57);
                this.field7542.method819(var9, 126, 0, 4, var17);
            }
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(III)V")
    public final void method476(int arg0, int arg1, int arg2) {
        ++field7553;
        if (~arg2 < ~(this.field7561[arg0][arg1] & 255)) {
            this.field7561[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!tv", name = "E", descriptor = "(Lha;IIIIZ)V")
    public final void method480(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7520;
        if (this.field7529 != null && arg0 != null) {
            int var7 = -(this.field7542.field1382 * arg2 >> 8) + arg1 >> this.field7542.field1328;
            int var8 = arg3 - (this.field7542.field1392 * arg2 >> 8) >> this.field7542.field1328;
            this.field7529.method2884(arg0, var8, (byte) 22, var7);
        }
    }

    @OriginalMember(owner = "client!tv", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method484(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field7536;
        if (arg5 != null && this.field7527 == null) {
            this.field7527 = new int[super.field510][super.field513][];
        }
        if (arg3 != null && this.field7521 == null) {
            this.field7521 = new int[super.field510][super.field513][];
        }
        this.field7554[arg0][arg1] = arg2;
        this.field7548[arg0][arg1] = arg4;
        this.field7539[arg0][arg1] = arg6;
        this.field7540[arg0][arg1] = arg7;
        if (this.field7527 != null) {
            this.field7527[arg0][arg1] = arg5;
        }
        if (this.field7521 != null) {
            this.field7521[arg0][arg1] = arg3;
        }
        class540[] var15 = this.field7546[arg0][arg1] = new class540[arg6.length];
        for (int var16 = 0; arg6.length > var16; ++var16) {
            long var17 = (long) (arg9[var16] << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg8[var16];
            class66 var19;
            for (var19 = this.field7557.method1558(var17, (byte) -93); var19 != null; var19 = this.field7557.method1565((byte) 44)) {
                class540 var20 = (class540) var19;
                if (~arg8[var16] == ~var20.field7876 && (float) arg9[var16] == var20.field7875 && var20.field7878 == arg10 && ~var20.field7880 == ~arg11 && var20.field7883 == arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class540) var19;
            } else {
                var15[var16] = new class540(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field7557.method1564(var17, var15[var16], (byte) 111);
            }
        }
        if (arg13) {
            this.field7524[arg0][arg1] = (byte) class81.method769(this.field7524[arg0][arg1], 1);
        }
        if (this.field7567 < arg6.length) {
            this.field7567 = arg6.length;
        }
        this.field7558 += arg6.length;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(III[[ZZ)V")
    public final void method485(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method3141(arg4, (byte) 2, arg1, arg3, -1, arg0, arg2);
        ++field7544;
    }

    @OriginalMember(owner = "client!tv", name = "v", descriptor = "(IILha;)Lha;")
    public final class54 method482(int arg0, int arg1, class54 arg2) {
        ++field7534;
        if ((this.field7524[arg0][arg1] & 1) == 0) {
            return null;
        } else {
            int var4 = super.field516 >> this.field7542.field1328;
            class156 var5 = (class156) arg2;
            class156 var6;
            if (var5 != null && var5.method1295(var4, (byte) -38, var4)) {
                var6 = var5;
                var5.method1297(-89);
            } else {
                var6 = new class156(this.field7542, var4, var4);
            }
            var6.method1294(0, -19123, 0, var4, var4);
            this.method3139(arg1, var6, 12, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lcp;[I)V")
    public final void method487(class674 arg0, int[] arg1) {
        ++field7551;
        this.field7528.method3463((byte) -87, new class427(this.field7542, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!tv", name = "BA", descriptor = "()V")
    public final void method483() {
        ++field7530;
        if (this.field7558 > 0) {
            byte[][] var1 = new byte[super.field510 - -1][super.field513 + 1];
            for (int var2 = 1; ~super.field510 < ~var2; ++var2) {
                for (int var103 = 1; super.field513 > var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field7561[var2][var103] >> 1) + (this.field7561[var2][var103 - 1] >> 2) + (this.field7561[var2][var103 + 1] >> 3) + (this.field7561[var2 + -1][var103] >> 2) + (this.field7561[var2 + 1][var103] >> 3));
                }
            }
            this.field7563 = new class540[this.field7557.method1555(0)];
            this.field7557.method1563(this.field7563, 1);
            for (int var3 = 0; ~var3 > ~this.field7563.length; ++var3) {
                this.field7563[var3].method3275(this.field7558, 255);
            }
            int var4 = 24;
            if (this.field7527 != null) {
                var4 += 4;
            }
            if ((this.field7545 & 7) != 0) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field7542.field1325.method3617(this.field7558 * var4, false);
            Stream var6 = new Stream(var5);
            class540[] var7 = new class540[this.field7558];
            int var8 = class638.method3708(false, this.field7558 / 4);
            if (~var8 > -2) {
                var8 = 1;
            }
            class200 var9 = new class200(var8);
            class540[] var10 = new class540[this.field7567];
            for (int var11 = 0; ~super.field510 < ~var11; ++var11) {
                for (int var30 = 0; super.field513 > var30; ++var30) {
                    if (this.field7539[var11][var30] != null) {
                        class540[] var31 = this.field7546[var11][var30];
                        int[] var32 = this.field7554[var11][var30];
                        int[] var33 = this.field7548[var11][var30];
                        int[] var34 = this.field7540[var11][var30];
                        int[] var35 = this.field7539[var11][var30];
                        int[] var36 = this.field7521 != null ? this.field7521[var11][var30] : null;
                        int[] var37 = this.field7527 == null ? null : this.field7527[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        float var38 = this.field7560[var11][var30];
                        float var39 = this.field7562[var11][var30];
                        float var40 = this.field7565[var11][var30];
                        float var41 = this.field7560[var11][var30 + 1];
                        float var42 = this.field7562[var11][var30 + 1];
                        float var43 = this.field7565[var11][var30 + 1];
                        float var44 = this.field7560[var11 + 1][var30 + 1];
                        float var45 = this.field7562[var11 + 1][var30 + 1];
                        float var46 = this.field7565[var11 + 1][var30 - -1];
                        float var47 = this.field7560[var11 + 1][var30];
                        float var48 = this.field7562[var11 + 1][var30];
                        float var49 = this.field7565[var11 - -1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = 255 & var1[var11][var30 + 1];
                        int var52 = 255 & var1[var11 - -1][var30 + 1];
                        int var53 = var1[var11 + 1][var30] & 255;
                        int var54 = 0;
                        label337: for (int var55 = 0; ~var35.length < ~var55; ++var55) {
                            class540 var101 = var31[var55];
                            for (int var102 = 0; ~var102 > ~var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label337;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field7541[super.field510 * var30 - -var11] = new short[var35.length];
                        for (int var57 = 0; ~var35.length < ~var57; ++var57) {
                            int var58 = (var11 << super.field515) + var32[var57];
                            int var59 = (var30 << super.field515) + var33[var57];
                            int var60 = var58 >> this.field7543;
                            int var61 = var59 >> this.field7543;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 == null ? 0 : var36[var57];
                            long var65 = (long) var61 | (long) (var60 << 16) | (long) var62 << 32 | (long) var63 << 48;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            float var72;
                            float var73;
                            float var74;
                            int var75;
                            if (var67 == 0 && ~var68 == -1) {
                                var72 = var38;
                                var73 = var40;
                                var74 = var39;
                                var75 = var69 - var50;
                            } else if (~var67 == -1 && ~super.field516 == ~var68) {
                                var73 = var43;
                                var72 = var41;
                                var75 = var69 - var51;
                                var74 = var42;
                            } else if (super.field516 == var67 && ~super.field516 == ~var68) {
                                var72 = var44;
                                var75 = var69 - var52;
                                var74 = var45;
                                var73 = var46;
                            } else if (super.field516 == var67 && var68 == 0) {
                                var73 = var49;
                                var74 = var48;
                                var72 = var47;
                                var75 = var69 - var53;
                            } else {
                                float var76 = (float) var67 / (float) super.field516;
                                float var77 = (float) var68 / (float) super.field516;
                                float var78 = (-var38 + var47) * var76 + var38;
                                float var79 = (-var39 + var48) * var76 + var39;
                                float var80 = (var49 - var40) * var76 + var40;
                                float var81 = (-var41 + var44) * var76 + var41;
                                float var82 = (var45 - var42) * var76 + var42;
                                var72 = (var81 - var78) * var77 + var78;
                                var74 = (-var79 + var82) * var77 + var79;
                                float var83 = (var46 - var43) * var76 + var43;
                                var73 = (var83 - var80) * var77 + var80;
                                int var84 = ((-var50 + var53) * var67 >> super.field515) + var50;
                                int var85 = ((-var51 + var52) * var67 >> super.field515) + var51;
                                var75 = var69 - (((var85 - var84) * var68 >> super.field515) + var84);
                            }
                            if (~var62 != 0) {
                                int var86 = (127 & var62) * var75 >> 7;
                                if (var86 < 2) {
                                    var86 = 2;
                                } else if (var86 > 126) {
                                    var86 = 126;
                                }
                                var70 = class63.field819[var86 | 65408 & var62];
                                if ((this.field7545 & 7) == 0) {
                                    float var87 = this.field7542.field1381[2] * var73 + this.field7542.field1381[0] * var72 + this.field7542.field1381[1] * var74;
                                    var71 = this.field7542.field1451 + (!(var87 > 0.0F) ? this.field7542.field1473 : this.field7542.field1444) * var87;
                                }
                            }
                            class66 var88 = null;
                            if (~(this.field7533 + -1 & var58) == -1 && ~(var59 & this.field7533 + -1) == -1) {
                                var88 = var9.method1558(var65, (byte) -93);
                            }
                            int var89;
                            if (var88 != null) {
                                var56[var57] = ((class426) var88).field6472;
                                var89 = 65535 & var56[var57];
                                if (var62 != -1 && var31[var57].field844 < var7[var89].field844) {
                                    var7[var89] = var31[var57];
                                }
                            } else {
                                int var90;
                                if (var62 == var63) {
                                    var90 = var70;
                                } else {
                                    int var91 = (127 & var63) * var75 >> 7;
                                    if (var91 >= 2) {
                                        if (~var91 < -127) {
                                            var91 = 126;
                                        }
                                    } else {
                                        var91 = 2;
                                    }
                                    var90 = class63.field819[var91 | var63 & 65408];
                                    if (~(this.field7545 & 7) == -1) {
                                        float var92 = this.field7542.field1381[2] * var73 + this.field7542.field1381[1] * var74 + this.field7542.field1381[0] * var72;
                                        float var93 = var71 * (var71 > 0.0F ? this.field7542.field1444 : this.field7542.field1473) + this.field7542.field1451;
                                        int var94 = var90 >> 16 & 255;
                                        int var95 = var90 >> 8 & 255;
                                        int var96 = var90 & 255;
                                        int var97 = (int) ((float) var94 * var93);
                                        if (var97 < 0) {
                                            var97 = 0;
                                        } else if (~var97 < -256) {
                                            var97 = 255;
                                        }
                                        int var98 = (int) ((float) var95 * var93);
                                        if (~var98 <= -1) {
                                            if (var98 > 255) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        int var99 = (int) ((float) var96 * var93);
                                        if (var99 >= 0) {
                                            if (var99 > 255) {
                                                var99 = 255;
                                            }
                                        } else {
                                            var99 = 0;
                                        }
                                        var90 = var98 << 8 | var97 << 16 | var99;
                                    }
                                }
                                if (!this.field7542.field1410) {
                                    var6.method3630((float) var58);
                                    var6.method3630((float) (this.method477(-1, var59, var58) - -var64));
                                    var6.method3630((float) var59);
                                    var6.method3631((byte) (var90 >> 16));
                                    var6.method3631((byte) (var90 >> 8));
                                    var6.method3631((byte) var90);
                                    var6.method3631(-1);
                                    var6.method3630((float) var58);
                                    var6.method3630((float) var59);
                                    if (this.field7527 != null) {
                                        var6.method3630((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if (~(this.field7545 & 7) != -1) {
                                        var6.method3630(var72);
                                        var6.method3630(var74);
                                        var6.method3630(var73);
                                    }
                                } else {
                                    var6.method3621((float) var58);
                                    var6.method3621((float) (var64 + this.method477(-1, var59, var58)));
                                    var6.method3621((float) var59);
                                    var6.method3631((byte) (var90 >> 16));
                                    var6.method3631((byte) (var90 >> 8));
                                    var6.method3631((byte) var90);
                                    var6.method3631(-1);
                                    var6.method3621((float) var58);
                                    var6.method3621((float) var59);
                                    if (this.field7527 != null) {
                                        var6.method3621((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if ((this.field7545 & 7) != 0) {
                                        var6.method3621(var72);
                                        var6.method3621(var74);
                                        var6.method3621(var73);
                                    }
                                }
                                var89 = this.field7535++;
                                var56[var57] = (short) var89;
                                if (var62 != -1) {
                                    var7[var89] = var31[var57];
                                }
                                var9.method1564(var65, new class426(var56[var57]), (byte) 127);
                            }
                            for (int var100 = 0; var100 < var54; ++var100) {
                                var10[var100].method3273(var89, var71, var70, var75, (byte) 76);
                            }
                            ++this.field7538;
                        }
                    }
                }
            }
            for (int var12 = 0; this.field7535 > var12; ++var12) {
                class540 var29 = var7[var12];
                if (var29 != null) {
                    var29.method3278(var12, false);
                }
            }
            for (int var13 = 0; ~super.field510 < ~var13; ++var13) {
                for (int var18 = 0; super.field513 > var18; ++var18) {
                    short[] var19 = this.field7541[super.field510 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var21 > ~var19.length) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = var19[var21++] & 65535;
                            int var24 = var19[var21++] & 65535;
                            class540 var25 = var7[var22];
                            class540 var26 = var7[var23];
                            class540 var27 = var7[var24];
                            class540 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method3274(var20, var13, (byte) -59, var18);
                            }
                            if (var26 != null) {
                                var26.method3274(var20, var13, (byte) -59, var18);
                                if (var28 == null || var28.field844 > var26.field844) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method3274(var20, var13, (byte) -59, var18);
                                if (var28 == null || ~var28.field844 < ~var27.field844) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method3278(var22, false);
                                }
                                if (var26 != null) {
                                    var28.method3278(var23, false);
                                }
                                if (var27 != null) {
                                    var28.method3278(var24, false);
                                }
                                var28.method3274(var20, var13, (byte) -59, var18);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3626();
            this.field7559 = this.field7542.method896(var5, 768, var4, var6.method3622(), false);
            this.field7564 = new class51(this.field7559, 5126, 3, 0);
            this.field7555 = new class51(this.field7559, 5121, 4, 12);
            byte var14;
            if (this.field7527 != null) {
                this.field7569 = new class51(this.field7559, 5126, 3, 16);
                var14 = 28;
            } else {
                this.field7569 = new class51(this.field7559, 5126, 2, 16);
                var14 = 24;
            }
            if ((7 & this.field7545) != 0) {
                this.field7556 = new class51(this.field7559, 5126, 3, var14);
            }
            long[] var15 = new long[this.field7563.length];
            for (int var16 = 0; ~this.field7563.length < ~var16; ++var16) {
                class540 var17 = this.field7563[var16];
                var15[var16] = var17.field844;
                var17.method3272((byte) -7, this.field7535);
            }
            class316.method2155(this.field7563, (byte) 110, var15);
            if (this.field7529 != null) {
                this.field7529.method2882(128);
            }
        } else {
            this.field7529 = null;
        }
        this.field7557 = null;
        this.field7527 = null;
        this.field7560 = this.field7562 = this.field7565 = null;
        this.field7554 = this.field7548 = null;
        this.field7521 = null;
        this.field7546 = null;
        this.field7539 = null;
        this.field7561 = null;
        this.field7540 = null;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZBI[[ZIII)V")
    private final void method3141(boolean arg0, byte arg1, int arg2, boolean[][] arg3, int arg4, int arg5, int arg6) {
        if (this.field7563 != null) {
            int var8 = arg6 - -arg6 + 1;
            int var9 = var8 * var8;
            if (~this.field7542.field1477.length > ~var9) {
                this.field7542.field1477 = new int[var9];
            }
            if (~(this.field7538 * 2) < ~this.field7542.field1468.field96.length) {
                this.field7542.field1468 = new class148(this.field7538 * 2);
            }
            int var10 = -arg6 + arg5;
            int var11 = var10;
            if (var10 < 0) {
                var10 = 0;
            }
            int var12 = arg2 - arg6;
            int var13 = var12;
            if (var12 < 0) {
                var12 = 0;
            }
            int var14 = arg5 + arg6;
            if (~var14 < ~(super.field510 - 1)) {
                var14 = super.field510 - 1;
            }
            int var15 = arg2 + arg6;
            if (~var15 < ~(super.field513 - 1)) {
                var15 = super.field513 - 1;
            }
            int var16 = 0;
            int[] var17 = this.field7542.field1477;
            for (int var18 = var10; var14 >= var18; ++var18) {
                boolean[] var24 = arg3[-var11 + var18];
                for (int var25 = var12; var25 <= var15; ++var25) {
                    if (var24[var25 - var13]) {
                        var17[var16++] = super.field510 * var25 + var18;
                    }
                }
            }
            if (arg4 == -1) {
                this.field7542.method843((byte) -22);
            } else {
                this.field7542.method821(117, (float) arg4);
                this.field7542.method855(arg1 ^ 99);
            }
            this.field7542.method866((this.field7545 & 7) != 0, -8);
            for (int var19 = 0; var19 < this.field7563.length; ++var19) {
                this.field7563[var19].method3276(var17, var16, -30390);
            }
            if (!this.field7528.method3464(0)) {
                int var20 = this.field7542.field1411;
                int var21 = this.field7542.field1422;
                this.field7542.method313(0, var21, this.field7542.field1433);
                this.field7542.method866(false, -8);
                this.field7542.method877(false, -32);
                this.field7542.method889(88, 128);
                this.field7542.method887(2, -2);
                this.field7542.method856(false, this.field7542.field1393);
                this.field7542.method857(8960, 7681, 8448);
                this.field7542.method844(770, 34166, 0, (byte) -102);
                this.field7542.method820(34167, 770, 0, arg1 + 119);
                for (class66 var22 = this.field7528.method3465((byte) 125); var22 != null; var22 = this.field7528.method3469(0)) {
                    class427 var23 = (class427) var22;
                    var23.method2706(arg6, arg3, -19715, arg5, arg2);
                }
                this.field7542.method844(768, 5890, 0, (byte) -102);
                this.field7542.method820(5890, 770, 0, 121);
                this.field7542.method856(false, (class386) null);
                this.field7542.method313(var20, var21, this.field7542.field1433);
            }
            if (this.field7529 != null) {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                this.field7542.method858(this.field7569, (class51) null, (byte) 45, this.field7564, (class51) null);
                this.field7529.method2883(arg5, arg0, arg2, (byte) -114, arg3, arg6);
                OpenGL.glPopMatrix();
            }
        }
        ++field7552;
        if (arg1 != 2) {
            this.field7546 = null;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method473(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field7526;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 != null ? new int[var18 * 3] : null;
        int[] var26 = arg5 != null ? new int[var18 * 3] : null;
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
        this.method484(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    static {
        for (int var0 = 0; var0 < 26; ++var0) {
            field7549[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; ++var1) {
            field7549[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; ~var2 > -63; ++var2) {
            field7549[var2] = (char) (var2 + 48 + -52);
        }
        field7549[62] = '+';
        field7549[63] = '/';
        field7566 = true;
        field7568 = new class158(12, 2);
    }
}
