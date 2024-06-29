import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class186 extends class278 {

    @OriginalMember(owner = "client!ov", name = "E", descriptor = "F")
    private float field2650 = -3.4028235E38F;

    @OriginalMember(owner = "client!ov", name = "K", descriptor = "F")
    private float field2656 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!ov", name = "p", descriptor = "Lnt;")
    private class220 field2635 = new class220();

    @OriginalMember(owner = "client!ov", name = "J", descriptor = "Lgt;")
    public class453 field2655;

    @OriginalMember(owner = "client!ov", name = "w", descriptor = "I")
    private int field2642;

    @OriginalMember(owner = "client!ov", name = "Z", descriptor = "[[F")
    private float[][] field2670;

    @OriginalMember(owner = "client!ov", name = "ab", descriptor = "[[B")
    private byte[][] field2671;

    @OriginalMember(owner = "client!ov", name = "q", descriptor = "[[B")
    private byte[][] field2636;

    @OriginalMember(owner = "client!ov", name = "T", descriptor = "I")
    private int field2664;

    @OriginalMember(owner = "client!ov", name = "W", descriptor = "[[S")
    public short[][] field2667;

    @OriginalMember(owner = "client!ov", name = "x", descriptor = "[[[Lbe;")
    private class37[][][] field2643;

    @OriginalMember(owner = "client!ov", name = "D", descriptor = "[[[I")
    public int[][][] field2649;

    @OriginalMember(owner = "client!ov", name = "s", descriptor = "I")
    public int field2638;

    @OriginalMember(owner = "client!ov", name = "y", descriptor = "[[[I")
    private int[][][] field2644;

    @OriginalMember(owner = "client!ov", name = "N", descriptor = "[[[I")
    public int[][][] field2658;

    @OriginalMember(owner = "client!ov", name = "kb", descriptor = "[[F")
    private float[][] field2681;

    @OriginalMember(owner = "client!ov", name = "lb", descriptor = "[[F")
    private float[][] field2682;

    @OriginalMember(owner = "client!ov", name = "O", descriptor = "[[[I")
    public int[][][] field2659;

    @OriginalMember(owner = "client!ov", name = "R", descriptor = "[[[I")
    private int[][][] field2662;

    @OriginalMember(owner = "client!ov", name = "db", descriptor = "Lmp;")
    private class758 field2674;

    @OriginalMember(owner = "client!ov", name = "u", descriptor = "Lica;")
    private class660 field2640;

    @OriginalMember(owner = "client!ov", name = "m", descriptor = "Lqe;")
    public static class465 field2632 = new class465(13, -1);

    @OriginalMember(owner = "client!ov", name = "H", descriptor = "Ltw;")
    public static class200 field2653 = new class200(0, 0);

    @OriginalMember(owner = "client!ov", name = "S", descriptor = "[I")
    public static int[] field2663 = new int[1000];

    @OriginalMember(owner = "client!ov", name = "U", descriptor = "Z")
    public static boolean field2665 = true;

    @OriginalMember(owner = "client!ov", name = "cb", descriptor = "[Ljava/lang/String;")
    public static String[] field2673 = new String[100];

    @OriginalMember(owner = "client!ov", name = "ib", descriptor = "Lqe;")
    public static class465 field2679 = new class465(65, -2);

    @OriginalMember(owner = "client!ov", name = "l", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!ov", name = "n", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!ov", name = "r", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!ov", name = "t", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!ov", name = "v", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!ov", name = "z", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!ov", name = "A", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!ov", name = "B", descriptor = "I")
    private int field2647;

    @OriginalMember(owner = "client!ov", name = "C", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!ov", name = "F", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!ov", name = "G", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!ov", name = "I", descriptor = "I")
    private int field2654;

    @OriginalMember(owner = "client!ov", name = "M", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!ov", name = "P", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!ov", name = "Q", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!ov", name = "V", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!ov", name = "X", descriptor = "I")
    private int field2668;

    @OriginalMember(owner = "client!ov", name = "Y", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!ov", name = "eb", descriptor = "I")
    private int field2675;

    @OriginalMember(owner = "client!ov", name = "hb", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!ov", name = "jb", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!ov", name = "nb", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!ov", name = "mb", descriptor = "Lhi;")
    public class203 field2683;

    @OriginalMember(owner = "client!ov", name = "fb", descriptor = "Lcaa;")
    private class302 field2676;

    @OriginalMember(owner = "client!ov", name = "gb", descriptor = "Lcaa;")
    private class302 field2677;

    @OriginalMember(owner = "client!ov", name = "bb", descriptor = "[Lbe;")
    private class37[] field2672;

    @OriginalMember(owner = "client!ov", name = "o", descriptor = "[[[I")
    private int[][][] field2634;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIII[[ZZI)V", line = 19)
    private final void method1318(int arg0, int arg1, int arg2, int arg3, int arg4, boolean[][] arg5, boolean arg6, int arg7) {
        ++field2645;
        if (this.field2672 != null) {
            int var9 = arg4 + arg4 + 1;
            int var10 = var9 * var9;
            if (var10 > class516.field7341.length) {
                class516.field7341 = new int[var10];
            }
            int var11 = -arg4 + arg0;
            int var12 = var11;
            if (var11 < 0) {
                var11 = 0;
            }
            int var13 = -arg4 + arg2;
            int var14 = var13;
            if (var13 < 0) {
                var13 = 0;
            }
            int var15 = arg0 - -arg4;
            if (~(super.field3924 + -1) > ~var15) {
                var15 = super.field3924 + -1;
            }
            int var16 = arg2 + arg4;
            if (super.field3914 + -1 < var16) {
                var16 = super.field3914 + -1;
            }
            class223.field3184 = 0;
            for (int var17 = var11; ~var15 <= ~var17; ++var17) {
                boolean[] var24 = arg5[var17 - var12];
                for (int var25 = var13; var25 <= var16; ++var25) {
                    if (var24[-var14 + var25]) {
                        class516.field7341[class223.field3184++] = super.field3924 * var25 + var17;
                    }
                }
            }
            if (~arg3 == 0) {
                this.field2655.method2760(6);
            } else {
                this.field2655.method2697(90, (float) arg3);
                this.field2655.method2708(0);
            }
            this.field2655.method2711(-67);
            this.field2655.method2747(~(7 & this.field2638) != -1, 124);
            this.field2655.method2728(false, false, (byte) 23, -1);
            this.field2655.method1059(this.field2677, 0, -12);
            for (int var18 = 0; var18 < this.field2672.length; ++var18) {
                this.field2672[var18].method309(class223.field3184, 0, class516.field7341);
            }
            class25 var19 = this.field2655.method2765((byte) -90);
            var19.method157(0, -1, 0);
            this.field2655.method2698(0);
            if (!this.field2635.method1528(65)) {
                int var20 = this.field2655.field6542;
                int var21 = this.field2655.field6477;
                this.field2655.method636(0, var21, this.field2655.field6505);
                this.field2655.method2747(false, 127);
                this.field2655.method2715(false, -115);
                this.field2655.method2738(-73, 128);
                this.field2655.method2728(false, false, (byte) 23, -2);
                this.field2655.method2732(-94, this.field2655.field6529);
                this.field2655.method2769(class140.field2165, class571.field8118, 18721);
                this.field2655.method2767(0, 25103, class142.field2176);
                this.field2655.method2755(false, 0, class165.field2440);
                for (class626 var22 = this.field2635.method1522(true); var22 != null; var22 = this.field2635.method1527((byte) 64)) {
                    class14 var23 = (class14) var22;
                    var23.method73(arg0, arg4, -61, arg2, arg5);
                }
                this.field2655.method2767(0, 25103, class68.field1225);
                this.field2655.method2755(false, 0, class68.field1225);
                this.field2655.method2732(-53, (class355) null);
                this.field2655.method636(var20, var21, this.field2655.field6505);
            }
            if (this.field2640 != null) {
                this.field2655.method1059(this.field2677, 0, -16);
                this.field2655.method1059(this.field2676, 1, -56);
                this.field2655.method1014(this.field2683, false);
                this.field2640.method3715(arg2, arg4, (byte) -20, arg5, arg6, arg0);
            }
        }
        if (arg1 >= -60) {
            this.method1092(-36, -77, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, -113, 67, -69, false);
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 162)
    public final void method1080(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field2633;
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
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method1092(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!ov", name = "fa", descriptor = "(IILr;)Lr;", line = 246)
    public final class181 method1086(int arg0, int arg1, class181 arg2) {
        ++field2657;
        if (~(1 & this.field2636[arg0][arg1]) == -1) {
            return null;
        } else {
            int var4 = super.field3920 >> this.field2655.field6490;
            class104 var5 = (class104) arg2;
            class104 var6;
            if (var5 != null && var5.method903(var4, (byte) -58, var4)) {
                var6 = var5;
                var5.method902(-29011);
            } else {
                var6 = new class104(this.field2655, var4, var4);
            }
            var6.method901(-12724, 0, 0, var4, var4);
            this.method1319(arg1, -10459, arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIILjt;)V", line = 276)
    private final void method1319(int arg0, int arg1, int arg2, class104 arg3) {
        ++field2631;
        int[] var5 = this.field2659[arg2][arg0];
        if (arg1 != -10459) {
            this.method1085();
        }
        int[] var6 = this.field2649[arg2][arg0];
        int var7 = var5.length;
        if (~class433.field6069.length > ~var7) {
            class433.field6069 = new int[var7];
            class320.field4555 = new int[var7];
        }
        for (int var8 = 0; ~var7 < ~var8; ++var8) {
            class433.field6069[var8] = var5[var8] >> this.field2655.field6490;
            class320.field4555[var8] = var6[var8] >> this.field2655.field6490;
        }
        int var9 = 0;
        while (var7 > var9) {
            int var10 = class433.field6069[var9];
            int var11 = class320.field4555[var9++];
            int var12 = class433.field6069[var9];
            int var13 = class320.field4555[var9++];
            int var14 = class433.field6069[var9];
            int var15 = class320.field4555[var9++];
            if (~((-var12 + var10) * (-var15 + var13) + -((var14 - var12) * (-var11 + var13))) < -1) {
                arg3.method904(var12, var10, var14, var11, var15, true, var13);
            }
        }
    }

    @OriginalMember(owner = "client!ov", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 336)
    public final void method1089(class181 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2661;
        if (this.field2640 != null && arg0 != null) {
            int var7 = arg1 - (this.field2655.field6482 * arg2 >> 8) >> this.field2655.field6490;
            int var8 = -(this.field2655.field6464 * arg2 >> 8) + arg3 >> this.field2655.field6490;
            this.field2640.method3720(var7, var8, 1, arg0);
        }
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lgt;IIII[[I[[II)V", line = 352)
    public class186(class453 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field2655 = arg0;
        this.field2642 = super.field3915 + -2;
        this.field2670 = new float[super.field3924 - -1][super.field3914 - -1];
        this.field2671 = new byte[arg3 + 1][arg4 + 1];
        this.field2636 = new byte[arg3][arg4];
        this.field2664 = 1 << this.field2642;
        this.field2667 = new short[arg3 * arg4][];
        this.field2643 = new class37[arg3][arg4][];
        this.field2649 = new int[arg3][arg4][];
        this.field2638 = arg2;
        this.field2644 = new int[arg3][arg4][];
        this.field2658 = new int[arg3][arg4][];
        this.field2681 = new float[super.field3924 + 1][super.field3914 + 1];
        this.field2682 = new float[super.field3924 + 1][super.field3914 + 1];
        this.field2659 = new int[arg3][arg4][];
        this.field2662 = new int[arg3][arg4][];
        for (int var9 = 0; super.field3914 >= var9; ++var9) {
            for (int var10 = 0; ~super.field3924 <= ~var10; ++var10) {
                int var11 = super.field3916[var10][var9];
                if (this.field2656 > (float) var11) {
                    this.field2656 = (float) var11;
                }
                if ((float) var11 > this.field2650) {
                    this.field2650 = (float) var11;
                }
                if (var10 > 0 && ~var9 < -1 && var10 < super.field3924 && ~var9 > ~super.field3914) {
                    int var12 = arg6[var10 - -1][var9] + -arg6[var10 - 1][var9];
                    int var13 = arg6[var10][var9 + 1] + -arg6[var10][var9 - 1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + arg7 * 4 * arg7 + var12 * var12)));
                    this.field2682[var10][var9] = (float) var12 * var14;
                    this.field2670[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field2681[var10][var9] = (float) var13 * var14;
                }
            }
        }
        --this.field2656;
        ++this.field2650;
        this.field2674 = new class758(128);
        if (~(this.field2638 & 16) != -1) {
            this.field2640 = new class660(this.field2655, this);
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)V", line = 425)
    public static void method1320(byte arg0) {
        int var1 = 29 / ((arg0 - 26) / 53);
        field2673 = null;
        field2632 = null;
        field2663 = null;
        field2653 = null;
        field2679 = null;
    }

    @OriginalMember(owner = "client!ov", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 439)
    public final void method1081(class181 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2639;
        if (this.field2640 != null && arg0 != null) {
            int var7 = -(this.field2655.field6482 * arg2 >> 8) + arg1 >> this.field2655.field6490;
            int var8 = arg3 - (this.field2655.field6464 * arg2 >> 8) >> this.field2655.field6490;
            this.field2640.method3718(arg0, (byte) -7, var8, var7);
        }
    }

    @OriginalMember(owner = "client!ov", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 455)
    public final void method1092(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field2646;
        if (arg3 != null && this.field2662 == null) {
            this.field2662 = new int[super.field3924][super.field3914][];
        }
        class149 var15 = this.field2655.field1084;
        if (arg5 != null && this.field2634 == null) {
            this.field2634 = new int[super.field3924][super.field3914][];
        }
        this.field2659[arg0][arg1] = arg2;
        this.field2649[arg0][arg1] = arg4;
        this.field2658[arg0][arg1] = arg6;
        this.field2644[arg0][arg1] = arg7;
        if (this.field2634 != null) {
            this.field2634[arg0][arg1] = arg5;
        }
        if (this.field2662 != null) {
            this.field2662[arg0][arg1] = arg3;
        }
        class37[] var16 = this.field2643[arg0][arg1] = new class37[arg6.length];
        for (int var17 = 0; var17 < arg6.length; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if (~(this.field2638 & 32) != -1 && ~var18 != 0 && var15.method1154(-110, var18).field7705) {
                var18 = -1;
                var19 = 128;
            }
            long var20 = (long) var18 | (long) (var19 << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48;
            class626 var22;
            for (var22 = this.field2674.method4203(true, var20); var22 != null; var22 = this.field2674.method4210(-126)) {
                class37 var23 = (class37) var22;
                if (var23.field570 == var18 && (float) var19 == var23.field555 && var23.field565 == arg10 && ~var23.field572 == ~arg11 && ~var23.field560 == ~arg12) {
                    break;
                }
            }
            if (var22 == null) {
                var16[var17] = new class37(this, var18, var19, arg10, arg11, arg12);
                this.field2674.method4211(var16[var17], (byte) 68, var20);
            } else {
                var16[var17] = (class37) var22;
            }
        }
        if (arg13) {
            this.field2636[arg0][arg1] = (byte) class164.method1221(this.field2636[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field2675) {
            this.field2675 = arg6.length;
        }
        this.field2668 += arg6.length;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(III[[ZZI)V", line = 531)
    public final void method1078(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field2648;
        this.method1318(arg0, -125, arg1, -1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIIII)V", line = 553)
    public static final void method1321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2637;
        int var6 = 0;
        int var7 = arg0;
        if (arg1 == -25399) {
            int var8 = arg5 * arg5;
            int var9 = arg0 * arg0;
            int var10 = var9 << 1;
            int var11 = var8 << 1;
            int var12 = arg0 << 1;
            int var13 = (-var12 + 1) * var8 - -var10;
            int var14 = -((var12 - 1) * var11) + var9;
            int var15 = var8 << 2;
            int var16 = var9 << 2;
            int var17 = ((var6 << 1) + 3) * var10;
            int var18 = ((arg0 << 1) + -3) * var11;
            int var19 = (var6 + 1) * var16;
            int var20 = (arg0 + -1) * var15;
            if (~class558.field7940 >= ~arg3 && arg3 <= class748.field10458) {
                int var21 = class498.method3000(false, class612.field8854, arg4 + arg5, class156.field2337);
                int var22 = class498.method3000(false, class612.field8854, -arg5 + arg4, class156.field2337);
                class399.method2472(27113, var22, var21, arg2, class329.field4651[arg3]);
            }
            while (var7 > 0) {
                if (~var13 > -1) {
                    while (~var13 > -1) {
                        var14 += var19;
                        var13 += var17;
                        var19 += var16;
                        ++var6;
                        var17 += var16;
                    }
                }
                if (~var14 > -1) {
                    var14 += var19;
                    var13 += var17;
                    ++var6;
                    var17 += var16;
                    var19 += var16;
                }
                var14 += -var18;
                var13 += -var20;
                --var7;
                var18 -= var15;
                var20 -= var15;
                int var23 = -var7 + arg3;
                int var24 = arg3 + var7;
                if (~class558.field7940 >= ~var24 && ~class748.field10458 <= ~var23) {
                    int var25 = class498.method3000(false, class612.field8854, arg4 + var6, class156.field2337);
                    int var26 = class498.method3000(false, class612.field8854, -var6 + arg4, class156.field2337);
                    if (~var23 <= ~class558.field7940) {
                        class399.method2472(27113, var26, var25, arg2, class329.field4651[var23]);
                    }
                    if (var24 <= class748.field10458) {
                        class399.method2472(arg1 + 52512, var26, var25, arg2, class329.field4651[var24]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(III[[ZZII)V", line = 657)
    public final void method1096(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.method1318(arg0, -89, arg1, arg5, arg2, arg3, arg4, arg6);
        ++field2660;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(II)V", line = 669)
    public final void method1077(int arg0, int arg1) {
        ++field2651;
    }

    @OriginalMember(owner = "client!ov", name = "ka", descriptor = "(III)V", line = 695)
    public final void method1093(int arg0, int arg1, int arg2) {
        ++field2652;
        if (~arg2 < ~(255 & this.field2671[arg0][arg1])) {
            this.field2671[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)V", line = 710)
    public static final void method1322(int arg0) {
        class284.field4029.method1697(false);
        ++field2641;
        class432.field6038 = null;
        class577.field8167 = null;
        class731.field10231 = 1;
        if (arg0 <= 50) {
            field2684 = 76;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lbh;[I)V", line = 726)
    public final void method1079(class36 arg0, int[] arg1) {
        this.field2635.method1526(new class14(this.field2655, this, arg0, arg1), 113);
        ++field2666;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIIIII[[Z)V", line = 740)
    public final void method1091(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field2669;
        if (~this.field2668 < -1) {
            class234 var9 = this.field2655.method2714(this.field2654, (byte) 19);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; var13 < 4; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method1599(true, (byte) -120);
                if (var14 != null) {
                    Stream var15 = this.field2655.method2764(var14, (byte) -76);
                    if (!Stream.method3762()) {
                        for (int var16 = arg4; arg6 > var16; ++var16) {
                            int var17 = super.field3924 * var16 + arg3;
                            for (int var18 = arg3; var18 < arg5; ++var18) {
                                if (arg7[-arg3 + var18][-arg4 + var16]) {
                                    short[] var19 = this.field2667[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; var20 < var19.length; ++var20) {
                                            int var21 = var19[var20] & 65535;
                                            ++var10;
                                            if (~var11 < ~var21) {
                                                var11 = var21;
                                            }
                                            if (var12 < var21) {
                                                var12 = var21;
                                            }
                                            var15.method3768(var21);
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; var22 < arg6; ++var22) {
                            int var25 = super.field3924 * var22 + arg3;
                            for (int var26 = arg3; var26 < arg5; ++var26) {
                                if (arg7[-arg3 + var26][-arg4 + var22]) {
                                    short[] var27 = this.field2667[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; ~var28 > ~var27.length; ++var28) {
                                            int var29 = var27[var28] & 65535;
                                            var15.method3766(var29);
                                            if (var29 > var12) {
                                                var12 = var29;
                                            }
                                            if (~var11 < ~var29) {
                                                var11 = var29;
                                            }
                                            ++var10;
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method3761();
                    if (var9.method1601(124)) {
                        break;
                    }
                }
            }
            if (~var10 < -1) {
                this.field2655.method2700(9);
                this.field2655.method2749(false, true);
                this.field2655.method2747(false, 111);
                this.field2655.method2736(12485, false);
                this.field2655.method2715(false, -41);
                this.field2655.method2738(-36, 0);
                this.field2655.method2728(false, false, (byte) 23, -2);
                this.field2655.method2732(-119, (class355) null);
                class25 var23 = this.field2655.method2765((byte) -43);
                float[] var24 = this.field2655.method2726((byte) -128);
                var24[11] = 0.0F;
                var24[1] = 0.0F;
                var24[2] = 0.0F;
                var24[8] = 0.0F;
                var24[6] = 0.0F;
                var24[9] = 0.0F;
                var24[7] = 0.0F;
                var24[15] = 1.0F;
                var24[0] = (float) arg2 / ((float) super.field3920 * 128.0F * (float) this.field2655.field6252);
                var24[12] = -(((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field2655.field6252) + -1.0F;
                var24[5] = (float) arg2 / ((float) super.field3920 * 128.0F * (float) this.field2655.field6402);
                var24[10] = 1.0F / (this.field2650 - this.field2656);
                var24[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field2655.field6402;
                var24[14] = -this.field2656 / (this.field2650 - this.field2656);
                var24[4] = 0.0F;
                var24[3] = 0.0F;
                var23.method167(0.0F, 0.0F, (byte) -49, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F);
                this.field2655.method2716((byte) -44);
                this.field2655.method2698(0);
                if ((7 & this.field2638) != 0) {
                    this.field2655.method2747(true, 99);
                    this.field2655.method1053((byte) 125);
                } else {
                    this.field2655.method2747(false, 119);
                }
                this.field2655.method1031(false, false);
                this.field2655.method1059(this.field2677, 0, -117);
                this.field2655.method1059(this.field2676, 1, -89);
                this.field2655.method1014(this.field2683, false);
                this.field2655.method1046(0, -var11 + var12 + 1, var9, (byte) 115, var10 / 3, class428.field5978, var11);
                this.field2655.method1031(false, true);
            }
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 939)
    public final boolean method1095(class181 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2678;
        if (this.field2640 != null && arg0 != null) {
            int var7 = -(this.field2655.field6482 * arg2 >> 8) + arg1 >> this.field2655.field6490;
            int var8 = arg3 - (this.field2655.field6464 * arg2 >> 8) >> this.field2655.field6490;
            return this.field2640.method3714(true, var8, arg0, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ov", name = "YA", descriptor = "()V", line = 962)
    public final void method1085() {
        ++field2680;
        if (~this.field2668 < -1) {
            byte[][] var1 = new byte[super.field3924 - -1][super.field3914 + 1];
            for (int var2 = 1; super.field3924 > var2; ++var2) {
                for (int var107 = 1; ~var107 > ~super.field3914; ++var107) {
                    var1[var2][var107] = (byte) ((this.field2671[var2][var107] >> 1) + (this.field2671[var2][var107 + 1] >> 3) + (this.field2671[var2][var107 + -1] >> 2) + (this.field2671[var2 + -1][var107] >> 2) + (this.field2671[var2 + 1][var107] >> 3));
                }
            }
            class37[] var3 = new class37[this.field2674.method4208(false)];
            this.field2674.method4201(120, var3);
            for (int var4 = 0; ~var4 > ~var3.length; ++var4) {
                var3[var4].method304(-125, this.field2668);
            }
            int var5 = 20;
            if (this.field2634 != null) {
                var5 += 4;
            }
            if ((7 & this.field2638) != 0) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field2655.field6263.method3758(this.field2668 * 4, false);
            NativeHeapBuffer var7 = this.field2655.field6263.method3758(this.field2668 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class37[] var10 = new class37[this.field2668];
            int var11 = class271.method1797(2864, this.field2668 / 4);
            if (var11 < 1) {
                var11 = 1;
            }
            class758 var12 = new class758(var11);
            class37[] var13 = new class37[this.field2675];
            for (int var14 = 0; super.field3924 > var14; ++var14) {
                for (int var34 = 0; super.field3914 > var34; ++var34) {
                    if (this.field2658[var14][var34] != null) {
                        class37[] var35 = this.field2643[var14][var34];
                        int[] var36 = this.field2659[var14][var34];
                        int[] var37 = this.field2649[var14][var34];
                        int[] var38 = this.field2644[var14][var34];
                        int[] var39 = this.field2658[var14][var34];
                        int[] var40 = this.field2662 == null ? null : this.field2662[var14][var34];
                        if (var38 == null) {
                            var38 = var39;
                        }
                        int[] var41 = this.field2634 != null ? this.field2634[var14][var34] : null;
                        float var42 = this.field2682[var14][var34];
                        float var43 = this.field2670[var14][var34];
                        float var44 = this.field2681[var14][var34];
                        float var45 = this.field2682[var14][var34 + 1];
                        float var46 = this.field2670[var14][var34 + 1];
                        float var47 = this.field2681[var14][var34 + 1];
                        float var48 = this.field2682[var14 + 1][var34 + 1];
                        float var49 = this.field2670[var14 - -1][var34 - -1];
                        float var50 = this.field2681[var14 + 1][var34 + 1];
                        float var51 = this.field2682[var14 - -1][var34];
                        float var52 = this.field2670[var14 + 1][var34];
                        float var53 = this.field2681[var14 + 1][var34];
                        int var54 = 255 & var1[var14][var34];
                        int var55 = var1[var14][var34 + 1] & 255;
                        int var56 = var1[var14 - -1][var34 + 1] & 255;
                        int var57 = 255 & var1[var14 + 1][var34];
                        int var58 = 0;
                        label358: for (int var59 = 0; var39.length > var59; ++var59) {
                            class37 var105 = var35[var59];
                            for (int var106 = 0; ~var106 > ~var58; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label358;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field2667[super.field3924 * var34 - -var14] = new short[var39.length];
                        for (int var61 = 0; ~var39.length < ~var61; ++var61) {
                            int var62 = (var14 << super.field3915) + var36[var61];
                            int var63 = (var34 << super.field3915) - -var37[var61];
                            int var64 = var62 >> this.field2642;
                            int var65 = var63 >> this.field2642;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 == null ? 0 : var40[var61];
                            long var69 = (long) var65 | (long) var67 << 48 | (long) var66 << 32 | (long) (var64 << 16);
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            int var75;
                            float var76;
                            float var77;
                            float var78;
                            if (~var71 == -1 && var72 == 0) {
                                var75 = var73 - var54;
                                var76 = var42;
                                var77 = var43;
                                var78 = var44;
                            } else if (~var71 == -1 && ~super.field3920 == ~var72) {
                                var77 = var46;
                                var76 = var45;
                                var78 = var47;
                                var75 = var73 - var55;
                            } else if (~super.field3920 == ~var71 && super.field3920 == var72) {
                                var76 = var48;
                                var75 = var73 - var56;
                                var77 = var49;
                                var78 = var50;
                            } else if (~super.field3920 == ~var71 && ~var72 == -1) {
                                var76 = var51;
                                var75 = var73 - var57;
                                var77 = var52;
                                var78 = var53;
                            } else {
                                float var79 = (float) var71 / (float) super.field3920;
                                float var80 = (float) var72 / (float) super.field3920;
                                float var81 = (-var42 + var51) * var79 + var42;
                                float var82 = (var52 - var43) * var79 + var43;
                                float var83 = (var53 - var44) * var79 + var44;
                                float var84 = (-var45 + var48) * var79 + var45;
                                float var85 = (-var46 + var49) * var79 + var46;
                                var76 = (-var81 + var84) * var80 + var81;
                                float var86 = (-var47 + var50) * var79 + var47;
                                var77 = (-var82 + var85) * var80 + var82;
                                var78 = (-var83 + var86) * var80 + var83;
                                int var87 = ((-var54 + var57) * var71 >> super.field3915) + var54;
                                int var88 = ((var56 - var55) * var71 >> super.field3915) + var55;
                                var75 = var73 - (var87 - -((var88 - var87) * var72 >> super.field3915));
                            }
                            float var89 = 1.0F;
                            if (var66 != -1) {
                                int var90 = (var66 & 127) * var75 >> 7;
                                if (~var90 <= -3) {
                                    if (var90 > 126) {
                                        var90 = 126;
                                    }
                                } else {
                                    var90 = 2;
                                }
                                var74 = class412.field5695[var90 | 65408 & var66];
                                if ((this.field2638 & 7) == 0) {
                                    float var91 = this.field2655.field6540[2] * var78 + this.field2655.field6540[1] * var77 + this.field2655.field6540[0] * var76;
                                    var89 = this.field2655.field6493 + var91 * (var91 > 0.0F ? this.field2655.field6507 : this.field2655.field6455);
                                }
                            }
                            class626 var92 = null;
                            if ((this.field2664 + -1 & var62) == 0 && ~(var63 & this.field2664 + -1) == -1) {
                                var92 = var12.method4203(true, var69);
                            }
                            int var93;
                            if (var92 != null) {
                                var60[var61] = ((class239) var92).field3369;
                                var93 = var60[var61] & 65535;
                                if (~var66 != 0 && ~var35[var61].field8991 > ~var10[var93].field8991) {
                                    var10[var93] = var35[var61];
                                }
                            } else {
                                int var94;
                                if (var66 == var67) {
                                    var94 = var74;
                                } else {
                                    int var95 = (var67 & 127) * var75 >> 7;
                                    if (~var95 <= -3) {
                                        if (~var95 < -127) {
                                            var95 = 126;
                                        }
                                    } else {
                                        var95 = 2;
                                    }
                                    var94 = class412.field5695[var67 & 65408 | var95];
                                    if ((this.field2638 & 7) == 0) {
                                        float var96 = this.field2655.field6540[2] * var78 + this.field2655.field6540[1] * var77 + this.field2655.field6540[0] * var76;
                                        float var97 = this.field2655.field6493 + var89 * (!(var89 > 0.0F) ? this.field2655.field6455 : this.field2655.field6507);
                                        int var98 = (var94 & 16771924) >> 16;
                                        int var99 = (65456 & var94) >> 8;
                                        int var100 = (int) ((float) var98 * var97);
                                        int var101 = 255 & var94;
                                        int var102 = (int) ((float) var99 * var97);
                                        if (~var100 > -1) {
                                            var100 = 0;
                                        } else if (var100 > 255) {
                                            var100 = 255;
                                        }
                                        int var103 = (int) ((float) var101 * var97);
                                        if (var102 < 0) {
                                            var102 = 0;
                                        } else if (~var102 < -256) {
                                            var102 = 255;
                                        }
                                        if (~var103 > -1) {
                                            var103 = 0;
                                        } else if (~var103 < -256) {
                                            var103 = 255;
                                        }
                                        var94 = var103 | var100 << 16 | var102 << 8;
                                    }
                                }
                                if (!Stream.method3762()) {
                                    var8.method3770((float) var62);
                                    var8.method3770((float) (this.method1827(-3458, var62, var63) + var68));
                                    var8.method3770((float) var63);
                                    var8.method3770((float) var62);
                                    var8.method3770((float) var63);
                                    if (this.field2634 != null) {
                                        var8.method3770((float) (var41 == null ? 0 : var41[var61] - 1));
                                    }
                                    if (~(this.field2638 & 7) != -1) {
                                        var8.method3770(var76);
                                        var8.method3770(var77);
                                        var8.method3770(var78);
                                    }
                                } else {
                                    var8.method3774((float) var62);
                                    var8.method3774((float) (var68 + this.method1827(-3458, var62, var63)));
                                    var8.method3774((float) var63);
                                    var8.method3774((float) var62);
                                    var8.method3774((float) var63);
                                    if (this.field2634 != null) {
                                        var8.method3774((float) (var41 == null ? 0 : var41[var61] + -1));
                                    }
                                    if ((7 & this.field2638) != 0) {
                                        var8.method3774(var76);
                                        var8.method3774(var77);
                                        var8.method3774(var78);
                                    }
                                }
                                if (this.field2655.field6498 == 0) {
                                    var9.method3764(-16777216 | var94);
                                } else {
                                    var9.method3763(var94 | -16777216);
                                }
                                var93 = this.field2647++;
                                var60[var61] = (short) var93;
                                if (var66 != -1) {
                                    var10[var93] = var35[var61];
                                }
                                var12.method4211(new class239(var60[var61]), (byte) 59, var69);
                            }
                            for (int var104 = 0; ~var104 > ~var58; ++var104) {
                                var13[var104].method299(var89, 4, var75, var74, var93);
                            }
                            ++this.field2654;
                        }
                    }
                }
            }
            for (int var15 = 0; this.field2647 > var15; ++var15) {
                class37 var33 = var10[var15];
                if (var33 != null) {
                    var33.method308(var15, false);
                }
            }
            for (int var16 = 0; var16 < super.field3924; ++var16) {
                for (int var22 = 0; var22 < super.field3914; ++var22) {
                    short[] var23 = this.field2667[super.field3924 * var22 - -var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (~var23.length < ~var25) {
                            int var26 = 65535 & var23[var25++];
                            int var27 = var23[var25++] & 65535;
                            int var28 = 65535 & var23[var25++];
                            class37 var29 = var10[var26];
                            class37 var30 = var10[var27];
                            class37 var31 = var10[var28];
                            class37 var32 = null;
                            if (var29 != null) {
                                var32 = var29;
                                var29.method300(var16, (byte) 117, var24, var22);
                            }
                            if (var30 != null) {
                                var30.method300(var16, (byte) 104, var24, var22);
                                if (var32 == null || var30.field8991 < var32.field8991) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method300(var16, (byte) 115, var24, var22);
                                if (var32 == null || ~var32.field8991 < ~var31.field8991) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method308(var26, false);
                                }
                                if (var30 != null) {
                                    var32.method308(var27, false);
                                }
                                if (var31 != null) {
                                    var32.method308(var28, false);
                                }
                                var32.method300(var16, (byte) 103, var24, var22);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method3761();
            var9.method3761();
            this.field2676 = this.field2655.method1036((byte) -49, false);
            this.field2676.method1495(var6, 4, this.field2647 * 4, (byte) 119);
            this.field2677 = this.field2655.method1036((byte) -71, false);
            this.field2677.method1495(var7, var5, this.field2647 * var5, (byte) 97);
            if (~(this.field2638 & 7) == -1) {
                if (this.field2634 == null) {
                    this.field2683 = this.field2655.method1006(50, new class328[] { new class328(new class674[] { class674.field9457, class674.field9462 }), new class328(class674.field9460) });
                } else {
                    this.field2683 = this.field2655.method1006(50, new class328[] { new class328(new class674[] { class674.field9457, class674.field9462, class674.field9461 }), new class328(class674.field9460) });
                }
            } else if (this.field2634 != null) {
                this.field2683 = this.field2655.method1006(50, new class328[] { new class328(new class674[] { class674.field9457, class674.field9462, class674.field9461, class674.field9459 }), new class328(class674.field9460) });
            } else {
                this.field2683 = this.field2655.method1006(50, new class328[] { new class328(new class674[] { class674.field9457, class674.field9462, class674.field9459 }), new class328(class674.field9460) });
            }
            int var17 = 0;
            for (int var18 = 0; ~var18 > ~var3.length; ++var18) {
                if (var3[var18].field554 > 0) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field2672 = new class37[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; ~var20 > ~var17; ++var20) {
                class37 var21 = var3[var20];
                var19[var20] = var21.field8991;
                this.field2672[var20] = var21;
                var21.method307(-54, this.field2647);
            }
            class382.method2399((byte) 124, var19, this.field2672);
            if (this.field2640 != null) {
                this.field2640.method3717(0);
            }
        } else {
            this.field2640 = null;
        }
        this.field2671 = null;
        this.field2682 = this.field2670 = this.field2681 = null;
        this.field2659 = this.field2649 = null;
        this.field2643 = null;
        this.field2674 = null;
        this.field2662 = null;
        this.field2634 = null;
        this.field2644 = null;
        this.field2658 = null;
    }
}
