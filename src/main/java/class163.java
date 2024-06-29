import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class163 extends class11 {

    @OriginalMember(owner = "client!mr", name = "B", descriptor = "Lmg;")
    private class530 field2458 = new class530();

    @OriginalMember(owner = "client!mr", name = "N", descriptor = "[[I")
    private int[][] field2469;

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "Lpg;")
    public class333 field2441;

    @OriginalMember(owner = "client!mr", name = "I", descriptor = "I")
    private int field2464;

    @OriginalMember(owner = "client!mr", name = "t", descriptor = "[[B")
    private byte[][] field2450;

    @OriginalMember(owner = "client!mr", name = "V", descriptor = "[[[I")
    private int[][][] field2476;

    @OriginalMember(owner = "client!mr", name = "gb", descriptor = "[[F")
    private float[][] field2487;

    @OriginalMember(owner = "client!mr", name = "y", descriptor = "I")
    private int field2455;

    @OriginalMember(owner = "client!mr", name = "K", descriptor = "I")
    public int field2466;

    @OriginalMember(owner = "client!mr", name = "o", descriptor = "[[S")
    public short[][] field2445;

    @OriginalMember(owner = "client!mr", name = "P", descriptor = "[[[I")
    private int[][][] field2470;

    @OriginalMember(owner = "client!mr", name = "E", descriptor = "[[[I")
    public int[][][] field2460;

    @OriginalMember(owner = "client!mr", name = "T", descriptor = "[[[Lwf;")
    private class33[][][] field2474;

    @OriginalMember(owner = "client!mr", name = "db", descriptor = "[[F")
    private float[][] field2484;

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "[[[I")
    private int[][][] field2439;

    @OriginalMember(owner = "client!mr", name = "Y", descriptor = "[[F")
    private float[][] field2479;

    @OriginalMember(owner = "client!mr", name = "ib", descriptor = "[[B")
    private byte[][] field2489;

    @OriginalMember(owner = "client!mr", name = "L", descriptor = "[[[I")
    public int[][][] field2467;

    @OriginalMember(owner = "client!mr", name = "eb", descriptor = "Lew;")
    private class270 field2485;

    @OriginalMember(owner = "client!mr", name = "x", descriptor = "Lpn;")
    private class49 field2454;

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "Lrb;")
    public static class283 field2440 = new class283(28, 8);

    @OriginalMember(owner = "client!mr", name = "W", descriptor = "Lrb;")
    public static class283 field2477 = new class283(96, 8);

    @OriginalMember(owner = "client!mr", name = "cb", descriptor = "Z")
    public static boolean field2483 = true;

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!mr", name = "n", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!mr", name = "p", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!mr", name = "q", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!mr", name = "r", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!mr", name = "s", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!mr", name = "u", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!mr", name = "w", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!mr", name = "z", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!mr", name = "A", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!mr", name = "C", descriptor = "I")
    private int field2459;

    @OriginalMember(owner = "client!mr", name = "F", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!mr", name = "G", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!mr", name = "H", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!mr", name = "J", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!mr", name = "M", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!mr", name = "Q", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!mr", name = "S", descriptor = "I")
    private int field2473;

    @OriginalMember(owner = "client!mr", name = "U", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!mr", name = "X", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!mr", name = "hb", descriptor = "I")
    private int field2488;

    @OriginalMember(owner = "client!mr", name = "jb", descriptor = "I")
    private int field2490;

    @OriginalMember(owner = "client!mr", name = "Z", descriptor = "Lnn;")
    private class171 field2480;

    @OriginalMember(owner = "client!mr", name = "ab", descriptor = "Lhf;")
    private class475 field2481;

    @OriginalMember(owner = "client!mr", name = "bb", descriptor = "Lhf;")
    public class475 field2482;

    @OriginalMember(owner = "client!mr", name = "kb", descriptor = "Lhf;")
    public class475 field2491;

    @OriginalMember(owner = "client!mr", name = "lb", descriptor = "Lhf;")
    public class475 field2492;

    @OriginalMember(owner = "client!mr", name = "R", descriptor = "Z")
    public static boolean field2472;

    @OriginalMember(owner = "client!mr", name = "fb", descriptor = "[Lwf;")
    private class33[] field2486;

    @OriginalMember(owner = "client!mr", name = "v", descriptor = "[[[I")
    private int[][][] field2452;

    @OriginalMember(owner = "client!mr", name = "H", descriptor = "(Li;IIIIZ)V")
    public final void method84(class197 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2449;
        if (this.field2454 != null && arg0 != null) {
            int var7 = -(this.field2441.field4840 * arg2 >> 8) + arg1 >> this.field2441.field4728;
            int var8 = -(this.field2441.field4861 * arg2 >> 8) + arg3 >> this.field2441.field4728;
            this.field2454.method326(var8, arg0, false, var7);
        }
    }

    @OriginalMember(owner = "client!mr", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method78(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg5 != null && this.field2452 == null) {
            this.field2452 = new int[super.field125][super.field124][];
        }
        ++field2453;
        if (arg3 != null && this.field2470 == null) {
            this.field2470 = new int[super.field125][super.field124][];
        }
        this.field2467[arg0][arg1] = arg2;
        this.field2460[arg0][arg1] = arg4;
        this.field2476[arg0][arg1] = arg6;
        this.field2439[arg0][arg1] = arg7;
        if (this.field2452 != null) {
            this.field2452[arg0][arg1] = arg5;
        }
        if (this.field2470 != null) {
            this.field2470[arg0][arg1] = arg3;
        }
        class33[] var15 = this.field2474[arg0][arg1] = new class33[arg6.length];
        for (int var16 = 0; arg6.length > var16; ++var16) {
            long var17 = (long) arg8[var16] | (long) (arg9[var16] << 14) | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28;
            class476 var19;
            for (var19 = this.field2485.method1592((byte) -25, var17); var19 != null; var19 = this.field2485.method1590((byte) 118)) {
                class33 var20 = (class33) var19;
                if (~arg8[var16] == ~var20.field510 && (float) arg9[var16] == var20.field501 && var20.field503 == arg10 && ~var20.field513 == ~arg11 && var20.field505 == arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class33) var19;
            } else {
                var15[var16] = new class33(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field2485.method1586(var15[var16], var17, 1);
            }
        }
        if (arg13) {
            this.field2450[arg0][arg1] = (byte) class219.method1367(this.field2450[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field2488) {
            this.field2488 = arg6.length;
        }
        this.field2490 += arg6.length;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(III[[ZZ)V")
    public final void method82(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method1139(-38, arg3, arg1, arg0, arg2, arg4, -1);
        ++field2457;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(BZ)V")
    public static final void method1138(byte arg0, boolean arg1) {
        ++field2461;
        ++class527.field7691;
        class274.method1602(14, class449.field6582);
        for (class91 var2 = (class91) class425.field6168.method1588(81); var2 != null; var2 = (class91) class425.field6168.method1582(-110)) {
            if (!var2.method2790(-77)) {
                var2 = (class91) class425.field6168.method1588(105);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field1461 == 0) {
                class147.method1052(var2, arg1, true, -4);
            }
        }
        if (arg0 != 92) {
            method1138((byte) 86, true);
        }
        if (class389.field5616 != null) {
            class151.method1093(class389.field5616, 118);
            class389.field5616 = null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lpg;IIII[[I[[II)V")
    public class163(class333 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field2469 = arg5;
        this.field2441 = arg0;
        this.field2464 = super.field126 - 2;
        this.field2450 = new byte[arg3][arg4];
        this.field2476 = new int[arg3][arg4][];
        this.field2487 = new float[super.field125 + 1][super.field124 + 1];
        this.field2455 = 1 << this.field2464;
        this.field2466 = arg2;
        this.field2445 = new short[arg3 * arg4][];
        this.field2470 = new int[arg3][arg4][];
        this.field2460 = new int[arg3][arg4][];
        this.field2474 = new class33[arg3][arg4][];
        this.field2484 = new float[super.field125 + 1][super.field124 + 1];
        this.field2439 = new int[arg3][arg4][];
        this.field2479 = new float[super.field125 + 1][super.field124 + 1];
        this.field2489 = new byte[arg3 - -1][arg4 + 1];
        this.field2467 = new int[arg3][arg4][];
        for (int var9 = 1; super.field124 > var9; ++var9) {
            for (int var10 = 1; ~var10 > ~super.field125; ++var10) {
                int var11 = arg6[var10 + 1][var9] - arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * 4 * arg7 + var11 * var11)));
                this.field2484[var10][var9] = (float) var11 * var13;
                this.field2479[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field2487[var10][var9] = (float) var12 * var13;
            }
        }
        this.field2485 = new class270(128);
        if (~(16 & this.field2466) != -1) {
            this.field2454 = new class49(this.field2441, this);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lsa;[I)V")
    public final void method75(class447 arg0, int[] arg1) {
        ++field2451;
        this.field2458.method3139(0, new class250(this.field2441, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I[[ZIIIZI)V")
    private final void method1139(int arg0, boolean[][] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg0 > -6) {
            this.field2450 = null;
        }
        if (this.field2486 != null) {
            float var8 = this.field2441.field4841;
            float var9 = this.field2441.field4856;
            int var10 = arg4 + arg4 + 1;
            int var11 = var10 * var10;
            if (var11 > this.field2441.field4867.length) {
                this.field2441.field4867 = new int[var11];
            }
            if (~(this.field2473 * 2) < ~this.field2441.field4789.field4336.length) {
                this.field2441.field4789 = new class504(this.field2473 * 2);
            }
            int var12 = -arg4 + arg3;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = -arg4 + arg2;
            int var15 = var14;
            if (~var14 > -1) {
                var14 = 0;
            }
            int var16 = arg3 + arg4;
            if (~var16 < ~(super.field125 + -1)) {
                var16 = super.field125 + -1;
            }
            int var17 = arg2 + arg4;
            if (super.field124 + -1 < var17) {
                var17 = super.field124 + -1;
            }
            int var18 = 0;
            int[] var19 = this.field2441.field4867;
            for (int var20 = var12; ~var16 <= ~var20; ++var20) {
                boolean[] var26 = arg1[-var13 + var20];
                for (int var27 = var14; ~var17 <= ~var27; ++var27) {
                    if (var26[var27 - var15]) {
                        var19[var18++] = super.field125 * var27 + var20;
                    }
                }
            }
            if (arg6 == -1) {
                this.field2441.method2030((byte) 61);
            } else {
                this.field2441.method2013((byte) -42, (float) arg6);
                this.field2441.method2015(-117);
            }
            this.field2441.method2036(30919, (7 & this.field2466) != 0);
            for (int var21 = 0; ~this.field2486.length < ~var21; ++var21) {
                this.field2486[var21].method240((byte) -70, var18, var19);
            }
            if (!this.field2458.method3135(-19033)) {
                int var22 = this.field2441.field4835;
                int var23 = this.field2441.field4795;
                this.field2441.method558(0, var23, this.field2441.field4814);
                this.field2441.method462(var9, var8 + -4.0F);
                this.field2441.method2036(30919, false);
                this.field2441.method2025(-32, false);
                this.field2441.method2033(128, -1743);
                this.field2441.method1998(-2, (byte) -53);
                this.field2441.method1977(this.field2441.field4855, true);
                this.field2441.method2023(8448, 7681, 2929);
                this.field2441.method2040(false, 0, 770, 34166);
                this.field2441.method1994(0, 770, 34167, 8960);
                for (class476 var24 = this.field2458.method3137(0); var24 != null; var24 = this.field2458.method3132(0)) {
                    class250 var25 = (class250) var24;
                    var25.method1491(arg1, arg4, 4, arg2, arg3);
                }
                this.field2441.method2040(false, 0, 768, 5890);
                this.field2441.method1994(0, 770, 5890, 8960);
                this.field2441.method1977((class128) null, true);
                this.field2441.method558(var22, var23, this.field2441.field4814);
            }
            if (this.field2454 != null) {
                this.field2441.method462(var9, var8 + -8.0F);
                this.field2441.method2030((byte) 69);
                this.field2441.method1973(this.field2492, (class475) null, (class475) null, this.field2482, 32888);
                this.field2454.method325(arg1, 116, arg2, arg3, arg4, arg5);
            }
            this.field2441.method462(var9, var8);
        }
        ++field2443;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method76(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field2471;
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
        this.method78(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!mr", name = "qa", descriptor = "(III)V")
    public final void method77(int arg0, int arg1, int arg2) {
        ++field2448;
        if (~(255 & this.field2489[arg0][arg1]) > ~arg2) {
            this.field2489[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lok;III)V")
    private final void method1140(class74 arg0, int arg1, int arg2, int arg3) {
        ++field2468;
        int[] var5 = this.field2467[arg1][arg3];
        int[] var6 = this.field2460[arg1][arg3];
        int var7 = var5.length;
        if (this.field2441.field4872.length < var7) {
            this.field2441.field4872 = new int[var7];
            this.field2441.field4870 = new int[var7];
        }
        int[] var8 = this.field2441.field4872;
        int[] var9 = this.field2441.field4870;
        for (int var10 = 0; ~var7 < ~var10; ++var10) {
            var8[var10] = class375.method2245(var5[var10], 255) >> this.field2441.field4728;
            var9[var10] = class375.method2245(var6[var10], 255) >> this.field2441.field4728;
        }
        int var11 = 0;
        if (arg2 == 11) {
            while (~var7 < ~var11) {
                int var12 = var8[var11];
                int var13 = var9[var11++];
                int var14 = var8[var11];
                int var15 = var9[var11++];
                int var16 = var8[var11];
                int var17 = var9[var11++];
                if ((-var14 + var12) * (-var17 + var15) - (-var13 + var15) * (-var14 + var16) > 0) {
                    arg0.method583(var13, (byte) -127, var17, var12, var14, var15, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mr", name = "aa", descriptor = "()V")
    public final void method81() {
        ++field2478;
        if (this.field2490 <= 0) {
            this.field2454 = null;
        } else {
            byte[][] var1 = new byte[super.field125 + 1][super.field124 + 1];
            for (int var2 = 1; ~var2 > ~super.field125; ++var2) {
                for (int var103 = 1; super.field124 > var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field2489[var2][var103] >> 1) + (this.field2489[var2][var103 + 1] >> 3) + (this.field2489[var2 + -1][var103] >> 2) + (this.field2489[var2][var103 - 1] >> 2) + (this.field2489[var2 - -1][var103] >> 3));
                }
            }
            this.field2486 = new class33[this.field2485.method1585((byte) 89)];
            this.field2485.method1589(this.field2486, (byte) 117);
            for (int var3 = 0; ~var3 > ~this.field2486.length; ++var3) {
                this.field2486[var3].method242(4, this.field2490);
            }
            int var4 = 24;
            if (this.field2452 != null) {
                var4 += 4;
            }
            if ((7 & this.field2466) != 0) {
                var4 += 12;
            }
            NativeBuffer var5 = this.field2441.field4730.method2846(this.field2490 * var4);
            NativeStream var6 = new NativeStream(var5);
            class33[] var7 = new class33[this.field2490];
            int var8 = class166.method1158(true, this.field2490 / 4);
            if (var8 < 1) {
                var8 = 1;
            }
            class270 var9 = new class270(var8);
            class33[] var10 = new class33[this.field2488];
            for (int var11 = 0; var11 < super.field125; ++var11) {
                for (int var30 = 0; ~var30 > ~super.field124; ++var30) {
                    if (this.field2476[var11][var30] != null) {
                        class33[] var31 = this.field2474[var11][var30];
                        int[] var32 = this.field2467[var11][var30];
                        int[] var33 = this.field2460[var11][var30];
                        int[] var34 = this.field2439[var11][var30];
                        int[] var35 = this.field2476[var11][var30];
                        int[] var36 = this.field2470 == null ? null : this.field2470[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field2452 == null ? null : this.field2452[var11][var30];
                        float var38 = this.field2484[var11][var30];
                        float var39 = this.field2479[var11][var30];
                        float var40 = this.field2487[var11][var30];
                        float var41 = this.field2484[var11][var30 + 1];
                        float var42 = this.field2479[var11][var30 - -1];
                        float var43 = this.field2487[var11][var30 + 1];
                        float var44 = this.field2484[var11 + 1][var30 + 1];
                        float var45 = this.field2479[var11 - -1][var30 + 1];
                        float var46 = this.field2487[var11 - -1][var30 - -1];
                        float var47 = this.field2484[var11 + 1][var30];
                        float var48 = this.field2479[var11 + 1][var30];
                        float var49 = this.field2487[var11 + 1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = var1[var11][var30 + 1] & 255;
                        int var52 = var1[var11 + 1][var30 + 1] & 255;
                        int var53 = 255 & var1[var11 + 1][var30];
                        int var54 = 0;
                        label338: for (int var55 = 0; ~var35.length < ~var55; ++var55) {
                            class33 var101 = var31[var55];
                            for (int var102 = 0; ~var102 > ~var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label338;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field2445[super.field125 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; ~var35.length < ~var57; ++var57) {
                            int var58 = (var11 << super.field126) + var32[var57];
                            int var59 = (var30 << super.field126) - -var33[var57];
                            int var60 = var58 >> this.field2464;
                            int var61 = var59 >> this.field2464;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 == null ? 0 : var36[var57];
                            long var65 = (long) var61 | (long) (var60 << 16) | (long) var63 << 48 | (long) var62 << 32;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71;
                            float var72;
                            int var73;
                            float var74;
                            if (var67 == 0 && ~var68 == -1) {
                                var71 = var40;
                                var72 = var38;
                                var73 = var69 - var50;
                                var74 = var39;
                            } else if (~var67 == -1 && super.field121 == var68) {
                                var73 = var69 - var51;
                                var72 = var41;
                                var71 = var43;
                                var74 = var42;
                            } else if (super.field121 == var67 && super.field121 == var68) {
                                var72 = var44;
                                var74 = var45;
                                var73 = var69 - var52;
                                var71 = var46;
                            } else if (super.field121 == var67 && var68 == 0) {
                                var72 = var47;
                                var73 = var69 - var53;
                                var74 = var48;
                                var71 = var49;
                            } else {
                                float var75 = (float) var67 / (float) super.field121;
                                float var76 = (float) var68 / (float) super.field121;
                                float var77 = (var47 - var38) * var75 + var38;
                                float var78 = (-var39 + var48) * var75 + var39;
                                float var79 = (-var40 + var49) * var75 + var40;
                                float var80 = (var44 - var41) * var75 + var41;
                                float var81 = (-var42 + var45) * var75 + var42;
                                var74 = (var81 - var78) * var76 + var78;
                                float var82 = (var46 - var43) * var75 + var43;
                                var72 = (var80 - var77) * var76 + var77;
                                var71 = (var82 - var79) * var76 + var79;
                                int var83 = ((-var50 + var53) * var67 >> super.field126) + var50;
                                int var84 = ((-var51 + var52) * var67 >> super.field126) + var51;
                                var73 = var69 - (var83 - -((-var83 + var84) * var68 >> super.field126));
                            }
                            float var85 = 1.0F;
                            if (~var62 != 0) {
                                int var86 = (var62 & 127) * var73 >> 7;
                                if (~var86 <= -3) {
                                    if (~var86 < -127) {
                                        var86 = 126;
                                    }
                                } else {
                                    var86 = 2;
                                }
                                var70 = class203.field2946[65408 & var62 | var86];
                                if ((7 & this.field2466) == 0) {
                                    float var87 = this.field2441.field4768[2] * var71 + this.field2441.field4768[1] * var74 + this.field2441.field4768[0] * var72;
                                    var85 = (var87 > 0.0F ? this.field2441.field4764 : this.field2441.field4763) * var87 + this.field2441.field4778;
                                }
                            }
                            class476 var88 = null;
                            if ((this.field2455 + -1 & var58) == 0 && (var59 & this.field2455 + -1) == 0) {
                                var88 = var9.method1592((byte) -25, var65);
                            }
                            int var99;
                            if (var88 == null) {
                                int var90;
                                if (var62 != var63) {
                                    int var89 = (127 & var63) * var73 >> 7;
                                    if (~var89 <= -3) {
                                        if (var89 > 126) {
                                            var89 = 126;
                                        }
                                    } else {
                                        var89 = 2;
                                    }
                                    var90 = class203.field2946[var89 | 65408 & var63];
                                    if (~(this.field2466 & 7) == -1) {
                                        float var91 = this.field2441.field4768[2] * var71 + this.field2441.field4768[0] * var72 + this.field2441.field4768[1] * var74;
                                        float var92 = this.field2441.field4778 + (var85 > 0.0F ? this.field2441.field4764 : this.field2441.field4763) * var85;
                                        int var93 = (var90 & 16725484) >> 16;
                                        int var94 = (var90 & 65511) >> 8;
                                        int var95 = 255 & var90;
                                        int var96 = (int) ((float) var93 * var92);
                                        if (var96 < 0) {
                                            var96 = 0;
                                        } else if (~var96 < -256) {
                                            var96 = 255;
                                        }
                                        int var97 = (int) ((float) var94 * var92);
                                        int var98 = (int) ((float) var95 * var92);
                                        if (~var97 > -1) {
                                            var97 = 0;
                                        } else if (~var97 < -256) {
                                            var97 = 255;
                                        }
                                        if (var98 >= 0) {
                                            if (var98 > 255) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        var90 = var97 << 8 | var96 << 16 | var98;
                                    }
                                } else {
                                    var90 = var70;
                                }
                                if (this.field2441.field4796) {
                                    var6.method2849((float) var58);
                                    var6.method2849((float) (this.method79(var58, var59) - -var64));
                                    var6.method2849((float) var59);
                                    var6.method2851((byte) (var90 >> 16));
                                    var6.method2851((byte) (var90 >> 8));
                                    var6.method2851((byte) var90);
                                    var6.method2851(-1);
                                    var6.method2849((float) var58);
                                    var6.method2849((float) var59);
                                    if (this.field2452 != null) {
                                        var6.method2849((float) (var37 == null ? 0 : var37[var57] - 1));
                                    }
                                    if (~(this.field2466 & 7) != -1) {
                                        var6.method2849(var72);
                                        var6.method2849(var74);
                                        var6.method2849(var71);
                                    }
                                } else {
                                    var6.method2850((float) var58);
                                    var6.method2850((float) (var64 + this.method79(var58, var59)));
                                    var6.method2850((float) var59);
                                    var6.method2851((byte) (var90 >> 16));
                                    var6.method2851((byte) (var90 >> 8));
                                    var6.method2851((byte) var90);
                                    var6.method2851(-1);
                                    var6.method2850((float) var58);
                                    var6.method2850((float) var59);
                                    if (this.field2452 != null) {
                                        var6.method2850((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if ((this.field2466 & 7) != 0) {
                                        var6.method2850(var72);
                                        var6.method2850(var74);
                                        var6.method2850(var71);
                                    }
                                }
                                var99 = this.field2459++;
                                var56[var57] = (short) var99;
                                if (~var62 != 0) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method1586(new class300(var56[var57]), var65, 1);
                            } else {
                                var56[var57] = ((class300) var88).field4105;
                                var99 = 65535 & var56[var57];
                                if (~var62 != 0 && ~var7[var99].field6883 < ~var31[var57].field6883) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; ~var54 < ~var100; ++var100) {
                                var10[var100].method245(var73, -106, var99, var70, var85);
                            }
                            ++this.field2473;
                        }
                    }
                }
            }
            for (int var12 = 0; var12 < this.field2459; ++var12) {
                class33 var29 = var7[var12];
                if (var29 != null) {
                    var29.method246((byte) -41, var12);
                }
            }
            for (int var13 = 0; super.field125 > var13; ++var13) {
                for (int var18 = 0; super.field124 > var18; ++var18) {
                    short[] var19 = this.field2445[super.field125 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var19.length < ~var21) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = 65535 & var19[var21++];
                            int var24 = var19[var21++] & 65535;
                            class33 var25 = var7[var22];
                            class33 var26 = var7[var23];
                            class33 var27 = var7[var24];
                            class33 var28 = null;
                            if (var25 != null) {
                                var25.method243(var13, var18, (byte) -78, var20);
                                var28 = var25;
                            }
                            if (var26 != null) {
                                var26.method243(var13, var18, (byte) 99, var20);
                                if (var28 == null || var28.field6883 > var26.field6883) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method243(var13, var18, (byte) 114, var20);
                                if (var28 == null || var28.field6883 > var27.field6883) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method246((byte) -41, var22);
                                }
                                if (var26 != null) {
                                    var28.method246((byte) -41, var23);
                                }
                                if (var27 != null) {
                                    var28.method246((byte) -41, var24);
                                }
                                var28.method243(var13, var18, (byte) 98, var20);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method2854();
            this.field2480 = this.field2441.method2021((byte) -60, var6.method2848(), var4, false, var5);
            this.field2482 = new class475(this.field2480, 5126, 3, 0);
            this.field2481 = new class475(this.field2480, 5121, 4, 12);
            byte var14;
            if (this.field2452 != null) {
                var14 = 28;
                this.field2492 = new class475(this.field2480, 5126, 3, 16);
            } else {
                var14 = 24;
                this.field2492 = new class475(this.field2480, 5126, 2, 16);
            }
            if (~(7 & this.field2466) != -1) {
                this.field2491 = new class475(this.field2480, 5126, 3, var14);
            }
            long[] var15 = new long[this.field2486.length];
            for (int var16 = 0; ~this.field2486.length < ~var16; ++var16) {
                class33 var17 = this.field2486[var16];
                var15[var16] = var17.field6883;
                var17.method241(this.field2459, (byte) 123);
            }
            class514.method3041(65523, this.field2486, var15);
            if (this.field2454 != null) {
                this.field2454.method327(30971);
            }
        }
        this.field2452 = null;
        this.field2476 = null;
        this.field2485 = null;
        this.field2467 = this.field2460 = null;
        this.field2484 = this.field2479 = this.field2487 = null;
        this.field2470 = null;
        this.field2439 = null;
        this.field2489 = null;
        this.field2474 = null;
    }

    @OriginalMember(owner = "client!mr", name = "ba", descriptor = "(Li;IIIIZ)V")
    public final void method73(class197 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2463;
        if (this.field2454 != null && arg0 != null) {
            int var7 = -(this.field2441.field4840 * arg2 >> 8) + arg1 >> this.field2441.field4728;
            int var8 = arg3 - (this.field2441.field4861 * arg2 >> 8) >> this.field2441.field4728;
            this.field2454.method328(var8, var7, arg0, (byte) 124);
        }
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(I)V")
    public static void method1141(int arg0) {
        field2477 = null;
        int var1 = -1 / ((arg0 - 25) / 41);
        field2440 = null;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Li;IIIIZ)Z")
    public final boolean method74(class197 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2442;
        if (this.field2454 != null && arg0 != null) {
            int var7 = arg1 - (this.field2441.field4840 * arg2 >> 8) >> this.field2441.field4728;
            int var8 = arg3 - (this.field2441.field4861 * arg2 >> 8) >> this.field2441.field4728;
            return this.field2454.method331(var8, var7, arg0, (byte) -75);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "(I)V")
    public static final void method1142(int arg0) {
        ++field2462;
        int var1 = class210.field3001;
        int[] var2 = class169.field2570;
        for (int var3 = arg0; var3 < var1; ++var3) {
            class487 var9 = class45.field642[var2[var3]];
            if (var9 != null && ~var9.field234 < -1) {
                --var9.field234;
                if (~var9.field234 == -1) {
                    var9.field218 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class273.field3692; ++var4) {
            long var5 = (long) class159.field2416[var4];
            class326 var7 = (class326) class281.field3826.method1592((byte) -25, var5);
            if (var7 != null) {
                class209 var8 = var7.field4455;
                if (var8.field234 > 0) {
                    --var8.field234;
                    if (var8.field234 == 0) {
                        var8.field218 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)V")
    public final void method71(int arg0, int arg1) {
        ++field2446;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method83(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field2456;
        if (this.field2490 > 0) {
            this.field2441.method2038(-385881688);
            this.field2441.method2020(-51, false);
            this.field2441.method2036(30919, false);
            this.field2441.method2016(false, -59);
            this.field2441.method2025(-32, false);
            this.field2441.method2033(0, -1743);
            this.field2441.method1998(-2, (byte) -53);
            this.field2441.method1977((class128) null, true);
            class192.field2810[9] = 0.0F;
            class192.field2810[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field2441.field4700) + -1.0F;
            class192.field2810[14] = 0.0F;
            class192.field2810[5] = (float) arg2 / ((float) super.field121 * 128.0F * (float) this.field2441.field4613);
            class192.field2810[7] = 0.0F;
            class192.field2810[1] = 0.0F;
            class192.field2810[8] = 0.0F;
            class192.field2810[10] = 0.0F;
            class192.field2810[11] = 0.0F;
            class192.field2810[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field2441.field4613) + 1.0F;
            class192.field2810[6] = 0.0F;
            class192.field2810[15] = 1.0F;
            class192.field2810[3] = 0.0F;
            class192.field2810[4] = 0.0F;
            class192.field2810[0] = (float) arg2 / ((float) super.field121 * 128.0F * (float) this.field2441.field4700);
            class192.field2810[2] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class192.field2810, 0);
            class192.field2810[9] = 1.0F;
            class192.field2810[3] = 0.0F;
            class192.field2810[4] = 0.0F;
            class192.field2810[13] = 0.0F;
            class192.field2810[7] = 0.0F;
            class192.field2810[8] = 0.0F;
            class192.field2810[12] = 0.0F;
            class192.field2810[2] = 0.0F;
            class192.field2810[10] = 0.0F;
            class192.field2810[14] = 0.0F;
            class192.field2810[11] = 0.0F;
            class192.field2810[1] = 0.0F;
            class192.field2810[15] = 1.0F;
            class192.field2810[0] = 1.0F;
            class192.field2810[6] = 1.0F;
            class192.field2810[5] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class192.field2810, 0);
            if (~(7 & this.field2466) != -1) {
                this.field2441.method2036(30919, true);
                this.field2441.method2029((byte) 85);
            } else {
                this.field2441.method2036(30919, false);
            }
            this.field2441.method1973(this.field2492, this.field2491, this.field2481, this.field2482, 32888);
            if (~(this.field2473 * 2) >= ~this.field2441.field4789.field4336.length) {
                this.field2441.field4789.field4360 = 0;
            } else {
                this.field2441.field4789 = new class504(this.field2473 * 2);
            }
            int var9 = 0;
            class504 var10 = this.field2441.field4789;
            if (!this.field2441.field4796) {
                for (int var11 = arg4; ~arg6 < ~var11; ++var11) {
                    int var12 = super.field125 * var11 - -arg3;
                    for (int var13 = arg3; arg5 > var13; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field2445[var12];
                            if (var14 != null) {
                                for (int var15 = 0; ~var14.length < ~var15; ++var15) {
                                    var10.method1829(0, 65535 & var14[var15]);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; ~arg6 < ~var16; ++var16) {
                    int var18 = super.field125 * var16 - -arg3;
                    for (int var19 = arg3; ~arg5 < ~var19; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field2445[var18];
                            if (var20 != null) {
                                for (int var21 = 0; var20.length > var21; ++var21) {
                                    ++var9;
                                    var10.method1857(561746448, 65535 & var20[var21]);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class379 var17 = new class379(this.field2441, 5123, var10.field4336, var10.field4360);
                this.field2441.method1964(0, (byte) -54, var17, 4, var9);
            }
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "([BII)I")
    public static final int method1143(byte[] arg0, int arg1, int arg2) {
        ++field2465;
        return arg2 != 0 ? -127 : class384.method2278(arg0, (byte) 18, 0, arg1);
    }

    @OriginalMember(owner = "client!mr", name = "OA", descriptor = "(IILi;)Li;")
    public final class197 method86(int arg0, int arg1, class197 arg2) {
        ++field2475;
        if (~(1 & this.field2450[arg0][arg1]) == -1) {
            return null;
        } else {
            int var4 = super.field121 >> this.field2441.field4728;
            class74 var5 = (class74) arg2;
            class74 var6;
            if (var5 != null && var5.method582(var4, (byte) 21, var4)) {
                var6 = var5;
                var5.method580((byte) -119);
            } else {
                var6 = new class74(this.field2441, var4, var4);
            }
            var6.method578(0, var4, 0, -71, var4);
            this.method1140(var6, arg0, 11, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!mr", name = "ca", descriptor = "(II)I")
    public final int method79(int arg0, int arg1) {
        ++field2444;
        int var3 = arg0 >> super.field126;
        int var4 = arg1 >> super.field126;
        if (var3 >= 0 && ~var4 <= -1 && var3 <= super.field125 + -1 && ~var4 >= ~(super.field124 + -1)) {
            int var5 = arg0 & super.field121 + -1;
            int var6 = arg1 & super.field121 + -1;
            int var7 = (super.field121 - var5) * this.field2469[var3][var4] + this.field2469[var3 - -1][var4] * var5 >> super.field126;
            int var8 = (-var5 + super.field121) * this.field2469[var3][var4 + 1] + this.field2469[var3 + 1][var4 + 1] * var5 >> super.field126;
            return (-var6 + super.field121) * var7 + var6 * var8 >> super.field126;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mr", name = "ua", descriptor = "(II)I")
    public final int method85(int arg0, int arg1) {
        ++field2447;
        return this.field2469[arg0][arg1];
    }
}
