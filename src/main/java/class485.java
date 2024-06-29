import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class485 extends class341 {

    @OriginalMember(owner = "client!rq", name = "w", descriptor = "Lmba;")
    private class646 field6758 = new class646();

    @OriginalMember(owner = "client!rq", name = "p", descriptor = "I")
    private int field6751 = this.field4822 - 2;

    @OriginalMember(owner = "client!rq", name = "r", descriptor = "Ldw;")
    public class664 field6753;

    @OriginalMember(owner = "client!rq", name = "V", descriptor = "[[F")
    private float[][] field6782;

    @OriginalMember(owner = "client!rq", name = "S", descriptor = "[[[I")
    private int[][][] field6779;

    @OriginalMember(owner = "client!rq", name = "m", descriptor = "I")
    public int field6748;

    @OriginalMember(owner = "client!rq", name = "hb", descriptor = "[[F")
    private float[][] field6794;

    @OriginalMember(owner = "client!rq", name = "C", descriptor = "I")
    private int field6764;

    @OriginalMember(owner = "client!rq", name = "eb", descriptor = "[[F")
    private float[][] field6791;

    @OriginalMember(owner = "client!rq", name = "B", descriptor = "[[[I")
    public int[][][] field6763;

    @OriginalMember(owner = "client!rq", name = "n", descriptor = "[[[I")
    public int[][][] field6749;

    @OriginalMember(owner = "client!rq", name = "o", descriptor = "[[B")
    private byte[][] field6750;

    @OriginalMember(owner = "client!rq", name = "Y", descriptor = "[[B")
    private byte[][] field6785;

    @OriginalMember(owner = "client!rq", name = "P", descriptor = "[[[I")
    public int[][][] field6776;

    @OriginalMember(owner = "client!rq", name = "q", descriptor = "[[S")
    public short[][] field6752;

    @OriginalMember(owner = "client!rq", name = "H", descriptor = "[[[Ldr;")
    private class24[][][] field6769;

    @OriginalMember(owner = "client!rq", name = "x", descriptor = "[[[I")
    private int[][][] field6759;

    @OriginalMember(owner = "client!rq", name = "ab", descriptor = "Lbaa;")
    private class130 field6787;

    @OriginalMember(owner = "client!rq", name = "N", descriptor = "Leq;")
    private class141 field6774;

    @OriginalMember(owner = "client!rq", name = "D", descriptor = "Z")
    public static boolean field6765 = false;

    @OriginalMember(owner = "client!rq", name = "F", descriptor = "I")
    public static int field6767 = 0;

    @OriginalMember(owner = "client!rq", name = "l", descriptor = "I")
    public static int field6747;

    @OriginalMember(owner = "client!rq", name = "s", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!rq", name = "t", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!rq", name = "u", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!rq", name = "v", descriptor = "I")
    private int field6757;

    @OriginalMember(owner = "client!rq", name = "y", descriptor = "I")
    public static int field6760;

    @OriginalMember(owner = "client!rq", name = "z", descriptor = "I")
    public static int field6761;

    @OriginalMember(owner = "client!rq", name = "A", descriptor = "I")
    public static int field6762;

    @OriginalMember(owner = "client!rq", name = "E", descriptor = "I")
    public static int field6766;

    @OriginalMember(owner = "client!rq", name = "G", descriptor = "I")
    public static int field6768;

    @OriginalMember(owner = "client!rq", name = "I", descriptor = "I")
    public static int field6770;

    @OriginalMember(owner = "client!rq", name = "J", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!rq", name = "L", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!rq", name = "M", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!rq", name = "O", descriptor = "I")
    private int field6775;

    @OriginalMember(owner = "client!rq", name = "R", descriptor = "I")
    public static int field6778;

    @OriginalMember(owner = "client!rq", name = "T", descriptor = "I")
    public static int field6780;

    @OriginalMember(owner = "client!rq", name = "U", descriptor = "I")
    private int field6781;

    @OriginalMember(owner = "client!rq", name = "Z", descriptor = "I")
    private int field6786;

    @OriginalMember(owner = "client!rq", name = "db", descriptor = "I")
    public static int field6790;

    @OriginalMember(owner = "client!rq", name = "cb", descriptor = "Lbia;")
    private class411 field6789;

    @OriginalMember(owner = "client!rq", name = "W", descriptor = "Lss;")
    public class509 field6783;

    @OriginalMember(owner = "client!rq", name = "X", descriptor = "Lss;")
    public class509 field6784;

    @OriginalMember(owner = "client!rq", name = "bb", descriptor = "Lss;")
    public class509 field6788;

    @OriginalMember(owner = "client!rq", name = "fb", descriptor = "Lss;")
    private class509 field6792;

    @OriginalMember(owner = "client!rq", name = "gb", descriptor = "[Ldr;")
    private class24[] field6793;

    @OriginalMember(owner = "client!rq", name = "Q", descriptor = "[[[I")
    private int[][][] field6777;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1044(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field6771;
        if (~this.field6781 < -1) {
            this.field6753.method3714(-32);
            this.field6753.method3703(true, false);
            this.field6753.method3680((byte) 106, false);
            this.field6753.method3707((byte) -112, false);
            this.field6753.method3684(false, -32);
            this.field6753.method3737(0, 0);
            this.field6753.method3709((byte) -63, -2);
            this.field6753.method3681((class559) null, 0);
            class287.field4121[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field6753.field8986) + 1.0F;
            class287.field4121[11] = 0.0F;
            class287.field4121[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field6753.field8828) + -1.0F;
            class287.field4121[2] = 0.0F;
            class287.field4121[5] = (float) arg2 / ((float) super.field4818 * 128.0F * (float) this.field6753.field8986);
            class287.field4121[4] = 0.0F;
            class287.field4121[3] = 0.0F;
            class287.field4121[10] = 0.0F;
            class287.field4121[14] = 0.0F;
            class287.field4121[9] = 0.0F;
            class287.field4121[1] = 0.0F;
            class287.field4121[0] = (float) arg2 / ((float) super.field4818 * 128.0F * (float) this.field6753.field8828);
            class287.field4121[7] = 0.0F;
            class287.field4121[6] = 0.0F;
            class287.field4121[15] = 1.0F;
            class287.field4121[8] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class287.field4121, 0);
            class287.field4121[10] = 0.0F;
            class287.field4121[5] = 0.0F;
            class287.field4121[7] = 0.0F;
            class287.field4121[14] = 0.0F;
            class287.field4121[1] = 0.0F;
            class287.field4121[6] = 1.0F;
            class287.field4121[2] = 0.0F;
            class287.field4121[8] = 0.0F;
            class287.field4121[3] = 0.0F;
            class287.field4121[12] = 0.0F;
            class287.field4121[11] = 0.0F;
            class287.field4121[4] = 0.0F;
            class287.field4121[15] = 1.0F;
            class287.field4121[9] = 1.0F;
            class287.field4121[0] = 1.0F;
            class287.field4121[13] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class287.field4121, 0);
            if (~(this.field6748 & 7) != -1) {
                this.field6753.method3680((byte) 106, true);
                this.field6753.method3744((byte) -84);
            } else {
                this.field6753.method3680((byte) 106, false);
            }
            this.field6753.method3725(this.field6792, (byte) 9, this.field6783, this.field6784, this.field6788);
            if (this.field6753.field9117.field954.length < this.field6757 * 2) {
                this.field6753.field9117 = new class172(this.field6757 * 2);
            } else {
                this.field6753.field9117.field956 = 0;
            }
            int var9 = 0;
            class172 var10 = this.field6753.field9117;
            if (!this.field6753.field9051) {
                for (int var11 = arg4; ~arg6 < ~var11; ++var11) {
                    int var12 = super.field4814 * var11 + arg3;
                    for (int var13 = arg3; ~var13 > ~arg5; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field6752[var12];
                            if (var14 != null) {
                                for (int var15 = 0; ~var14.length < ~var15; ++var15) {
                                    var10.method499(-25094, var14[var15] & 65535);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; var16 < arg6; ++var16) {
                    int var18 = super.field4814 * var16 + arg3;
                    for (int var19 = arg3; arg5 > var19; ++var19) {
                        if (arg7[var19 - arg3][var16 - arg4]) {
                            short[] var20 = this.field6752[var18];
                            if (var20 != null) {
                                for (int var21 = 0; ~var20.length < ~var21; ++var21) {
                                    ++var9;
                                    var10.method492(-2, 65535 & var20[var21]);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class633 var17 = new class633(this.field6753, 5123, var10.field954, var10.field956);
                this.field6753.method3688(0, var9, 4, var17, 0);
            }
        }
    }

    @OriginalMember(owner = "client!rq", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method1042(class709 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6747;
        if (this.field6774 != null && arg0 != null) {
            int var7 = arg1 - (this.field6753.field9090 * arg2 >> 8) >> this.field6753.field9011;
            int var8 = -(this.field6753.field9118 * arg2 >> 8) + arg3 >> this.field6753.field9011;
            this.field6774.method927(arg0, (byte) -125, var8, var7);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1034(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field6761;
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
        for (int var28 = 0; ~var18 < ~var28; ++var28) {
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
        this.method1040(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!rq", name = "fa", descriptor = "(IILr;)Lr;")
    public final class709 method1032(int arg0, int arg1, class709 arg2) {
        ++field6760;
        if (~(1 & this.field6750[arg0][arg1]) == -1) {
            return null;
        } else {
            int var4 = super.field4818 >> this.field6753.field9011;
            class231 var5 = (class231) arg2;
            class231 var6;
            if (var5 != null && var5.method1378(var4, var4, true)) {
                var6 = var5;
                var5.method1381(110);
            } else {
                var6 = new class231(this.field6753, var4, var4);
            }
            var6.method1383(var4, var4, 0, 0, 0);
            this.method2949(arg1, arg0, 255, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Ldw;IIII[[I[[II)V")
    public class485(class664 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field6753 = arg0;
        this.field6782 = new float[super.field4814 + 1][super.field4817 - -1];
        this.field6779 = new int[arg3][arg4][];
        this.field6748 = arg2;
        this.field6794 = new float[super.field4814 + 1][super.field4817 - -1];
        this.field6764 = 1 << this.field6751;
        this.field6791 = new float[super.field4814 + 1][super.field4817 + 1];
        this.field6763 = new int[arg3][arg4][];
        this.field6749 = new int[arg3][arg4][];
        this.field6750 = new byte[arg3][arg4];
        this.field6785 = new byte[arg3 - -1][arg4 - -1];
        this.field6776 = new int[arg3][arg4][];
        this.field6752 = new short[arg3 * arg4][];
        this.field6769 = new class24[arg3][arg4][];
        this.field6759 = new int[arg3][arg4][];
        for (int var9 = 1; var9 < super.field4817; ++var9) {
            for (int var10 = 1; var10 < super.field4814; ++var10) {
                int var11 = arg6[var10 - -1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] - arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * 4 * arg7 + var11 * var11)));
                this.field6794[var10][var9] = (float) var11 * var13;
                this.field6782[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field6791[var10][var9] = (float) var12 * var13;
            }
        }
        this.field6787 = new class130(128);
        if ((this.field6748 & 16) != 0) {
            this.field6774 = new class141(this.field6753, this);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)V")
    public final void method1026(int arg0, int arg1) {
        ++field6755;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIILpfa;)V")
    private final void method2949(int arg0, int arg1, int arg2, class231 arg3) {
        ++field6756;
        int[] var5 = this.field6749[arg1][arg0];
        int[] var6 = this.field6776[arg1][arg0];
        if (arg2 == 255) {
            int var7 = var5.length;
            if (var7 > this.field6753.field9159.length) {
                this.field6753.field9159 = new int[var7];
                this.field6753.field9160 = new int[var7];
            }
            int[] var8 = this.field6753.field9159;
            int[] var9 = this.field6753.field9160;
            for (int var10 = 0; var10 < var7; ++var10) {
                var8[var10] = var5[var10] >> this.field6753.field9011;
                var9[var10] = var6[var10] >> this.field6753.field9011;
            }
            int var11 = 0;
            while (~var7 < ~var11) {
                int var12 = var8[var11];
                int var13 = var9[var11++];
                int var14 = var8[var11];
                int var15 = var9[var11++];
                int var16 = var8[var11];
                int var17 = var9[var11++];
                if (~((var12 - var14) * (-var17 + var15) - (-var13 + var15) * (-var14 + var16)) < -1) {
                    arg3.method1379(var17, var16, var13, var14, var12, var15, 13258);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rq", name = "ka", descriptor = "(III)V")
    public final void method1037(int arg0, int arg1, int arg2) {
        if (~arg2 < ~(this.field6785[arg0][arg1] & 255)) {
            this.field6785[arg0][arg1] = (byte) arg2;
        }
        ++field6790;
    }

    @OriginalMember(owner = "client!rq", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method1025(class709 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6766;
        if (this.field6774 != null && arg0 != null) {
            int var7 = -(this.field6753.field9090 * arg2 >> 8) + arg1 >> this.field6753.field9011;
            int var8 = -(this.field6753.field9118 * arg2 >> 8) + arg3 >> this.field6753.field9011;
            this.field6774.method929(var8, arg0, (byte) -19, var7);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method1041(class709 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6762;
        if (this.field6774 != null && arg0 != null) {
            int var7 = arg1 - (this.field6753.field9090 * arg2 >> 8) >> this.field6753.field9011;
            int var8 = arg3 - (this.field6753.field9118 * arg2 >> 8) >> this.field6753.field9011;
            return this.field6774.method933(var8, arg0, var7, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(III[[ZZI)V")
    public final void method1027(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field6772;
        this.method2951(arg5, arg1, 770, arg2, arg3, -1, arg0, arg4);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(III[[ZZII)V")
    public final void method1043(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.method2951(arg6, arg1, 770, arg2, arg3, arg5, arg0, arg4);
        ++field6780;
    }

    @OriginalMember(owner = "client!rq", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1040(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field6778;
        if (arg5 != null && this.field6777 == null) {
            this.field6777 = new int[super.field4814][super.field4817][];
        }
        class270 var15 = this.field6753.field7623;
        if (arg3 != null && this.field6779 == null) {
            this.field6779 = new int[super.field4814][super.field4817][];
        }
        this.field6749[arg0][arg1] = arg2;
        this.field6776[arg0][arg1] = arg4;
        this.field6763[arg0][arg1] = arg6;
        this.field6759[arg0][arg1] = arg7;
        if (this.field6777 != null) {
            this.field6777[arg0][arg1] = arg5;
        }
        if (this.field6779 != null) {
            this.field6779[arg0][arg1] = arg3;
        }
        class24[] var16 = this.field6769[arg0][arg1] = new class24[arg6.length];
        for (int var17 = 0; ~var17 > ~arg6.length; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if ((32 & this.field6748) != 0 && var18 != -1 && var15.method521(var18, 105).field3562) {
                var18 = -1;
                var19 = 128;
            }
            long var20 = (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (var19 << 14) | (long) var18;
            class71 var22;
            for (var22 = this.field6787.method812(118, var20); var22 != null; var22 = this.field6787.method815((byte) 88)) {
                class24 var23 = (class24) var22;
                if (var23.field287 == var18 && (float) var19 == var23.field288 && var23.field292 == arg10 && ~var23.field299 == ~arg11 && var23.field306 == arg12) {
                    break;
                }
            }
            if (var22 != null) {
                var16[var17] = (class24) var22;
            } else {
                var16[var17] = new class24(this, var18, var19, arg10, arg11, arg12);
                this.field6787.method820(var20, (byte) -42, var16[var17]);
            }
        }
        if (arg13) {
            this.field6750[arg0][arg1] = (byte) class678.method3817(this.field6750[arg0][arg1], 1);
        }
        if (~this.field6786 > ~arg6.length) {
            this.field6786 = arg6.length;
        }
        this.field6781 += arg6.length;
    }

    @OriginalMember(owner = "client!rq", name = "YA", descriptor = "()V")
    public final void method1028() {
        if (this.field6781 > 0) {
            byte[][] var1 = new byte[super.field4814 + 1][super.field4817 + 1];
            for (int var2 = 1; ~super.field4814 < ~var2; ++var2) {
                for (int var103 = 1; var103 < super.field4817; ++var103) {
                    var1[var2][var103] = (byte) ((this.field6785[var2][var103 - 1] >> 2) + (this.field6785[var2][var103] >> 1) + (this.field6785[var2 - -1][var103] >> 3) + (this.field6785[var2][var103 + 1] >> 3) + (this.field6785[var2 - 1][var103] >> 2));
                }
            }
            this.field6793 = new class24[this.field6787.method816((byte) -36)];
            this.field6787.method817((byte) -79, this.field6793);
            for (int var3 = 0; ~var3 > ~this.field6793.length; ++var3) {
                this.field6793[var3].method132(this.field6781, (byte) -107);
            }
            int var4 = 24;
            if (this.field6777 != null) {
                var4 += 4;
            }
            if (~(7 & this.field6748) != -1) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field6753.field9010.method2623(this.field6781 * var4, false);
            Stream var6 = new Stream(var5);
            class24[] var7 = new class24[this.field6781];
            int var8 = class375.method2354(this.field6781 / 4, (byte) -4);
            if (~var8 > -2) {
                var8 = 1;
            }
            class130 var9 = new class130(var8);
            class24[] var10 = new class24[this.field6786];
            for (int var11 = 0; ~var11 > ~super.field4814; ++var11) {
                for (int var30 = 0; ~var30 > ~super.field4817; ++var30) {
                    if (this.field6763[var11][var30] != null) {
                        class24[] var31 = this.field6769[var11][var30];
                        int[] var32 = this.field6749[var11][var30];
                        int[] var33 = this.field6776[var11][var30];
                        int[] var34 = this.field6759[var11][var30];
                        int[] var35 = this.field6763[var11][var30];
                        int[] var36 = this.field6779 == null ? null : this.field6779[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field6777 == null ? null : this.field6777[var11][var30];
                        float var38 = this.field6794[var11][var30];
                        float var39 = this.field6782[var11][var30];
                        float var40 = this.field6791[var11][var30];
                        float var41 = this.field6794[var11][var30 + 1];
                        float var42 = this.field6782[var11][var30 + 1];
                        float var43 = this.field6791[var11][var30 + 1];
                        float var44 = this.field6794[var11 + 1][var30 + 1];
                        float var45 = this.field6782[var11 - -1][var30 + 1];
                        float var46 = this.field6791[var11 - -1][var30 - -1];
                        float var47 = this.field6794[var11 + 1][var30];
                        float var48 = this.field6782[var11 - -1][var30];
                        float var49 = this.field6791[var11 - -1][var30];
                        int var50 = var1[var11][var30] & 255;
                        int var51 = 255 & var1[var11][var30 + 1];
                        int var52 = var1[var11 + 1][var30 - -1] & 255;
                        int var53 = 255 & var1[var11 + 1][var30];
                        int var54 = 0;
                        label338: for (int var55 = 0; ~var55 > ~var35.length; ++var55) {
                            class24 var101 = var31[var55];
                            for (int var102 = 0; ~var54 < ~var102; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label338;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field6752[super.field4814 * var30 - -var11] = new short[var35.length];
                        for (int var57 = 0; ~var35.length < ~var57; ++var57) {
                            int var58 = (var11 << super.field4822) + var32[var57];
                            int var59 = (var30 << super.field4822) - -var33[var57];
                            int var60 = var58 >> this.field6751;
                            int var61 = var59 >> this.field6751;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 != null ? var36[var57] : 0;
                            long var65 = (long) var61 | (long) (var60 << 16) | (long) var62 << 32 | (long) var63 << 48;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            float var72;
                            int var73;
                            float var74;
                            float var75;
                            if (var67 == 0 && var68 == 0) {
                                var72 = var40;
                                var73 = var69 - var50;
                                var74 = var38;
                                var75 = var39;
                            } else if (~var67 == -1 && ~super.field4818 == ~var68) {
                                var74 = var41;
                                var72 = var43;
                                var73 = var69 - var51;
                                var75 = var42;
                            } else if (super.field4818 == var67 && super.field4818 == var68) {
                                var74 = var44;
                                var75 = var45;
                                var73 = var69 - var52;
                                var72 = var46;
                            } else if (~super.field4818 == ~var67 && ~var68 == -1) {
                                var73 = var69 - var53;
                                var75 = var48;
                                var72 = var49;
                                var74 = var47;
                            } else {
                                float var76 = (float) var67 / (float) super.field4818;
                                float var77 = (float) var68 / (float) super.field4818;
                                float var78 = (-var38 + var47) * var76 + var38;
                                float var79 = (var48 - var39) * var76 + var39;
                                float var80 = (-var40 + var49) * var76 + var40;
                                float var81 = (-var41 + var44) * var76 + var41;
                                float var82 = (-var42 + var45) * var76 + var42;
                                float var83 = (var46 - var43) * var76 + var43;
                                var75 = (-var79 + var82) * var77 + var79;
                                var74 = (var81 - var78) * var77 + var78;
                                var72 = (-var80 + var83) * var77 + var80;
                                int var84 = ((-var50 + var53) * var67 >> super.field4822) + var50;
                                int var85 = ((var52 - var51) * var67 >> super.field4822) + var51;
                                var73 = var69 - (var84 - -((var85 - var84) * var68 >> super.field4822));
                            }
                            if (var62 != -1) {
                                int var86 = (var62 & 127) * var73 >> 7;
                                if (var86 < 2) {
                                    var86 = 2;
                                } else if (~var86 < -127) {
                                    var86 = 126;
                                }
                                var70 = class577.field7932[var62 & 65408 | var86];
                                if ((7 & this.field6748) == 0) {
                                    float var87 = this.field6753.field9104[2] * var72 + this.field6753.field9104[0] * var74 + this.field6753.field9104[1] * var75;
                                    var71 = var87 * (var87 > 0.0F ? this.field6753.field9064 : this.field6753.field9145) + this.field6753.field9091;
                                }
                            }
                            class71 var88 = null;
                            if ((var58 & this.field6764 - 1) == 0 && ~(this.field6764 + -1 & var59) == -1) {
                                var88 = var9.method812(123, var65);
                            }
                            int var99;
                            if (var88 == null) {
                                int var90;
                                if (~var62 != ~var63) {
                                    int var89 = (127 & var63) * var73 >> 7;
                                    if (var89 >= 2) {
                                        if (~var89 < -127) {
                                            var89 = 126;
                                        }
                                    } else {
                                        var89 = 2;
                                    }
                                    var90 = class577.field7932[var89 | var63 & 65408];
                                    if ((7 & this.field6748) == 0) {
                                        float var91 = this.field6753.field9104[2] * var72 + this.field6753.field9104[1] * var75 + this.field6753.field9104[0] * var74;
                                        float var92 = this.field6753.field9091 + var71 * (!(var71 > 0.0F) ? this.field6753.field9145 : this.field6753.field9064);
                                        int var93 = (16773761 & var90) >> 16;
                                        int var94 = 255 & var90 >> 8;
                                        int var95 = (int) ((float) var93 * var92);
                                        int var96 = var90 & 255;
                                        if (var95 < 0) {
                                            var95 = 0;
                                        } else if (~var95 < -256) {
                                            var95 = 255;
                                        }
                                        int var97 = (int) ((float) var94 * var92);
                                        if (~var97 > -1) {
                                            var97 = 0;
                                        } else if (var97 > 255) {
                                            var97 = 255;
                                        }
                                        int var98 = (int) ((float) var96 * var92);
                                        if (var98 >= 0) {
                                            if (var98 > 255) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        var90 = var97 << 8 | var95 << 16 | var98;
                                    }
                                } else {
                                    var90 = var70;
                                }
                                if (!this.field6753.field9051) {
                                    var6.method2617((float) var58);
                                    var6.method2617((float) (var64 + this.method2172(var58, -1, var59)));
                                    var6.method2617((float) var59);
                                    var6.method2606((byte) (var90 >> 16));
                                    var6.method2606((byte) (var90 >> 8));
                                    var6.method2606((byte) var90);
                                    var6.method2606(-1);
                                    var6.method2617((float) var58);
                                    var6.method2617((float) var59);
                                    if (this.field6777 != null) {
                                        var6.method2617((float) (var37 == null ? 0 : var37[var57] - 1));
                                    }
                                    if ((this.field6748 & 7) != 0) {
                                        var6.method2617(var74);
                                        var6.method2617(var75);
                                        var6.method2617(var72);
                                    }
                                } else {
                                    var6.method2608((float) var58);
                                    var6.method2608((float) (var64 + this.method2172(var58, -1, var59)));
                                    var6.method2608((float) var59);
                                    var6.method2606((byte) (var90 >> 16));
                                    var6.method2606((byte) (var90 >> 8));
                                    var6.method2606((byte) var90);
                                    var6.method2606(-1);
                                    var6.method2608((float) var58);
                                    var6.method2608((float) var59);
                                    if (this.field6777 != null) {
                                        var6.method2608((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if (~(7 & this.field6748) != -1) {
                                        var6.method2608(var74);
                                        var6.method2608(var75);
                                        var6.method2608(var72);
                                    }
                                }
                                var99 = this.field6775++;
                                var56[var57] = (short) var99;
                                if (~var62 != 0) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method820(var65, (byte) -42, new class248(var56[var57]));
                            } else {
                                var56[var57] = ((class248) var88).field3646;
                                var99 = 65535 & var56[var57];
                                if (~var62 != 0 && ~var7[var99].field1079 < ~var31[var57].field1079) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; ~var100 > ~var54; ++var100) {
                                var10[var100].method138(var73, var99, -890846872, var71, var70);
                            }
                            ++this.field6757;
                        }
                    }
                }
            }
            for (int var12 = 0; var12 < this.field6775; ++var12) {
                class24 var29 = var7[var12];
                if (var29 != null) {
                    var29.method135(var12, 1);
                }
            }
            for (int var13 = 0; super.field4814 > var13; ++var13) {
                for (int var18 = 0; var18 < super.field4817; ++var18) {
                    short[] var19 = this.field6752[super.field4814 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var21 > ~var19.length) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = 65535 & var19[var21++];
                            int var24 = 65535 & var19[var21++];
                            class24 var25 = var7[var22];
                            class24 var26 = var7[var23];
                            class24 var27 = var7[var24];
                            class24 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method136(var13, var20, (byte) -22, var18);
                            }
                            if (var26 != null) {
                                var26.method136(var13, var20, (byte) -22, var18);
                                if (var28 == null || ~var26.field1079 > ~var28.field1079) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method136(var13, var20, (byte) -22, var18);
                                if (var28 == null || ~var28.field1079 < ~var27.field1079) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method135(var22, 1);
                                }
                                if (var26 != null) {
                                    var28.method135(var23, 1);
                                }
                                if (var27 != null) {
                                    var28.method135(var24, 1);
                                }
                                var28.method136(var13, var20, (byte) -22, var18);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method2613();
            this.field6789 = this.field6753.method3671(var4, var5, false, 1, var6.method2609());
            this.field6788 = new class509(this.field6789, 5126, 3, 0);
            this.field6792 = new class509(this.field6789, 5121, 4, 12);
            byte var14;
            if (this.field6777 != null) {
                this.field6783 = new class509(this.field6789, 5126, 3, 16);
                var14 = 28;
            } else {
                var14 = 24;
                this.field6783 = new class509(this.field6789, 5126, 2, 16);
            }
            if ((this.field6748 & 7) != 0) {
                this.field6784 = new class509(this.field6789, 5126, 3, var14);
            }
            long[] var15 = new long[this.field6793.length];
            for (int var16 = 0; this.field6793.length > var16; ++var16) {
                class24 var17 = this.field6793[var16];
                var15[var16] = var17.field1079;
                var17.method137(this.field6775, 5121);
            }
            class561.method3298(var15, -106, this.field6793);
            if (this.field6774 != null) {
                this.field6774.method931((byte) 123);
            }
        } else {
            this.field6774 = null;
        }
        ++field6770;
        this.field6787 = null;
        this.field6749 = this.field6776 = null;
        this.field6759 = null;
        this.field6794 = this.field6782 = this.field6791 = null;
        this.field6763 = null;
        this.field6785 = null;
        this.field6777 = null;
        this.field6769 = null;
        this.field6779 = null;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method2950(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field6754;
        if (class424.method2641(arg4, -11664)) {
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = arg8;
            if (class222.field3009) {
                var12 = class134.field1908;
                var11 = class758.field10573;
                var10 = class360.field5162;
                var14 = class617.field8294;
                var13 = class439.field6127;
                class617.field8294 = 1;
            }
            if (class39.field483[arg4] == null) {
                class217.method1276(arg5, arg0, arg1, arg2, arg7, arg6, ~arg1 > -1, -1412584499, -1, class266.field3900[arg4], arg3);
            } else {
                class217.method1276(arg5, arg0, arg1, arg2, arg7, arg6, ~arg1 > -1, -1412584499, -1, class39.field483[arg4], arg3);
            }
            if (class222.field3009) {
                if (arg1 >= 0 && class617.field8294 == 2) {
                    class483.method2944(class134.field1908, class439.field6127, class360.field5162, class758.field10573, -1);
                }
                class617.field8294 = var14;
                class439.field6127 = var13;
                class360.field5162 = var10;
                class134.field1908 = var12;
                class758.field10573 = var11;
            }
        } else if (arg1 != -1) {
            class669.field9236[arg1] = true;
        } else {
            for (int var9 = 0; ~var9 > -101; ++var9) {
                class669.field9236[var9] = true;
            }
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Ltj;[I)V")
    public final void method1036(class687 arg0, int[] arg1) {
        ++field6773;
        this.field6758.method3610(9289, new class686(this.field6753, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIII[[ZIIZ)V")
    private final void method2951(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int arg5, int arg6, boolean arg7) {
        if (this.field6793 != null) {
            int var9 = arg3 + 1 - -arg3;
            int var10 = var9 * var9;
            if (~var10 < ~this.field6753.field9157.length) {
                this.field6753.field9157 = new int[var10];
            }
            if (this.field6753.field9117.field954.length < this.field6757 * 2) {
                this.field6753.field9117 = new class172(this.field6757 * 2);
            }
            int var11 = -arg3 + arg6;
            int var12 = var11;
            if (~var11 > -1) {
                var11 = 0;
            }
            int var13 = -arg3 + arg1;
            int var14 = var13;
            if (var13 < 0) {
                var13 = 0;
            }
            int var15 = arg6 - -arg3;
            if (~var15 < ~(super.field4814 + -1)) {
                var15 = super.field4814 + -1;
            }
            int var16 = arg1 - -arg3;
            if (~(super.field4817 + -1) > ~var16) {
                var16 = super.field4817 + -1;
            }
            int var17 = 0;
            int[] var18 = this.field6753.field9157;
            for (int var19 = var11; var19 <= var15; ++var19) {
                boolean[] var25 = arg4[var19 - var12];
                for (int var26 = var13; var26 <= var16; ++var26) {
                    if (var25[-var14 + var26]) {
                        var18[var17++] = super.field4814 * var26 - -var19;
                    }
                }
            }
            if (arg5 != -1) {
                this.field6753.method3706(arg2 + -767, (float) arg5);
                this.field6753.method3740((byte) 48);
            } else {
                this.field6753.method3700(-9);
            }
            this.field6753.method3680((byte) 106, (7 & this.field6748) != 0);
            for (int var20 = 0; ~this.field6793.length < ~var20; ++var20) {
                this.field6793[var20].method131((byte) 122, var17, var18);
            }
            if (!this.field6758.method3616((byte) 127)) {
                int var21 = this.field6753.field9045;
                int var22 = this.field6753.field9136;
                this.field6753.method1474(0, var22, this.field6753.field9099);
                this.field6753.method3680((byte) 106, false);
                this.field6753.method3684(false, arg2 ^ -798);
                this.field6753.method3737(0, 128);
                this.field6753.method3709((byte) -102, -2);
                this.field6753.method3681(this.field6753.field9082, 0);
                this.field6753.method3729((byte) 95, 8448, 7681);
                this.field6753.method3718(34166, 95, 770, 0);
                this.field6753.method3715(34167, 770, 0, (byte) -64);
                for (class71 var23 = this.field6758.method3618(71); var23 != null; var23 = this.field6758.method3619(0)) {
                    class686 var24 = (class686) var23;
                    var24.method3862((byte) 10, arg1, arg4, arg6, arg3);
                }
                this.field6753.method3718(5890, 107, 768, 0);
                this.field6753.method3715(5890, 770, 0, (byte) -93);
                this.field6753.method3681((class559) null, 0);
                this.field6753.method1474(var21, var22, this.field6753.field9099);
            }
            if (this.field6774 != null) {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                this.field6753.method3725((class509) null, (byte) 99, this.field6783, (class509) null, this.field6788);
                this.field6774.method926(arg6, false, arg7, arg3, arg4, arg1);
                OpenGL.glPopMatrix();
            }
        }
        if (arg2 != 770) {
            this.field6782 = null;
        }
        ++field6768;
    }
}
