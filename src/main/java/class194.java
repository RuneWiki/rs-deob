import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class194 extends class682 {

    @OriginalMember(owner = "client!sq", name = "A", descriptor = "F")
    private float field3012 = -3.4028235E38F;

    @OriginalMember(owner = "client!sq", name = "x", descriptor = "F")
    private float field3009 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!sq", name = "N", descriptor = "Lau;")
    private class692 field3025 = new class692();

    @OriginalMember(owner = "client!sq", name = "r", descriptor = "Lnh;")
    public class495 field3003;

    @OriginalMember(owner = "client!sq", name = "M", descriptor = "I")
    private int field3024;

    @OriginalMember(owner = "client!sq", name = "s", descriptor = "[[[I")
    public int[][][] field3004;

    @OriginalMember(owner = "client!sq", name = "D", descriptor = "[[S")
    public short[][] field3015;

    @OriginalMember(owner = "client!sq", name = "ib", descriptor = "[[F")
    private float[][] field3046;

    @OriginalMember(owner = "client!sq", name = "ab", descriptor = "[[F")
    private float[][] field3038;

    @OriginalMember(owner = "client!sq", name = "q", descriptor = "[[B")
    private byte[][] field3002;

    @OriginalMember(owner = "client!sq", name = "S", descriptor = "[[[Lsv;")
    private class510[][][] field3030;

    @OriginalMember(owner = "client!sq", name = "u", descriptor = "[[[I")
    public int[][][] field3006;

    @OriginalMember(owner = "client!sq", name = "E", descriptor = "[[[I")
    private int[][][] field3016;

    @OriginalMember(owner = "client!sq", name = "gb", descriptor = "[[F")
    private float[][] field3044;

    @OriginalMember(owner = "client!sq", name = "P", descriptor = "I")
    private int field3027;

    @OriginalMember(owner = "client!sq", name = "v", descriptor = "I")
    public int field3007;

    @OriginalMember(owner = "client!sq", name = "o", descriptor = "[[[I")
    public int[][][] field3000;

    @OriginalMember(owner = "client!sq", name = "Q", descriptor = "[[[I")
    private int[][][] field3028;

    @OriginalMember(owner = "client!sq", name = "db", descriptor = "[[B")
    private byte[][] field3041;

    @OriginalMember(owner = "client!sq", name = "Y", descriptor = "Lmo;")
    private class482 field3036;

    @OriginalMember(owner = "client!sq", name = "V", descriptor = "Lvg;")
    private class622 field3033;

    @OriginalMember(owner = "client!sq", name = "B", descriptor = "Lvh;")
    public static class125 field3013 = new class125(31, 7);

    @OriginalMember(owner = "client!sq", name = "cb", descriptor = "Leda;")
    public static class116 field3040 = new class116(84, 8);

    @OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
    private int field2999;

    @OriginalMember(owner = "client!sq", name = "p", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!sq", name = "t", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!sq", name = "w", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!sq", name = "y", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!sq", name = "z", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!sq", name = "C", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!sq", name = "F", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!sq", name = "G", descriptor = "I")
    private int field3018;

    @OriginalMember(owner = "client!sq", name = "H", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!sq", name = "I", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!sq", name = "J", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!sq", name = "K", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!sq", name = "O", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!sq", name = "R", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!sq", name = "T", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!sq", name = "U", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!sq", name = "W", descriptor = "I")
    private int field3034;

    @OriginalMember(owner = "client!sq", name = "Z", descriptor = "I")
    private int field3037;

    @OriginalMember(owner = "client!sq", name = "fb", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!sq", name = "X", descriptor = "Lwf;")
    private class483 field3035;

    @OriginalMember(owner = "client!sq", name = "eb", descriptor = "Lwf;")
    private class483 field3042;

    @OriginalMember(owner = "client!sq", name = "hb", descriptor = "Ldt;")
    public class573 field3045;

    @OriginalMember(owner = "client!sq", name = "bb", descriptor = "[Lsv;")
    private class510[] field3039;

    @OriginalMember(owner = "client!sq", name = "L", descriptor = "[[[I")
    private int[][][] field3023;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lr;BZLll;Lla;Ljava/lang/String;)V")
    public static final void method1361(class98 arg0, byte arg1, boolean arg2, class490 arg3, class395 arg4, String arg5) {
        ++field3005;
        if (arg1 != -12) {
            method1375(false);
        }
        boolean var6 = !class542.field7956 || class218.method1468(26851);
        if (var6) {
            if (class542.field7956 && var6) {
                class490 var12 = class115.field1830;
                class395 var13 = arg0.method804(var12, class590.field8597, true);
                int var14 = var12.method2862(250, (class257[]) null, -92, arg5);
                int var15 = var12.method2872(250, var12.field7039, 108, arg5, (class257[]) null);
                int var16 = class648.field9186.field8936;
                int var17 = var16 - -4;
                int var18 = var17 * 2 + var15;
                int var19 = var17 * 2 + var14;
                if (~class654.field9237 < ~var18) {
                    var18 = class654.field9237;
                }
                if (~var19 > ~class325.field4526) {
                    var19 = class325.field4526;
                }
                int var20 = class673.field9557.method1329(class570.field8333, var19, false) - -class263.field3788;
                int var21 = class642.field9126.method2447(-1464849236, class140.field2349, var18) + class363.field5049;
                arg0.method772(class180.field2853, false).method15(class606.field8722.field8936 + var20, class606.field8722.field8940 + var21, var19 - class606.field8722.field8936 * 2, -(class606.field8722.field8940 * 2) + var18, 1, 0, 0);
                arg0.method772(class606.field8722, true).method1638(var20, var21);
                class606.field8722.method3542();
                arg0.method772(class606.field8722, true).method1638(var20 - -var19 + -var16, var21);
                class606.field8722.method3545();
                arg0.method772(class606.field8722, true).method1638(var19 + var20 + -var16, var18 + var21 - var16);
                class606.field8722.method3542();
                arg0.method772(class606.field8722, true).method1638(var20, var18 + var21 - var16);
                class606.field8722.method3545();
                arg0.method772(class648.field9186, true).method1632(var20, class606.field8722.field8940 + var21, var16, -(class606.field8722.field8940 * 2) + var18);
                class648.field9186.method3541();
                arg0.method772(class648.field9186, true).method1632(class606.field8722.field8936 + var20, var21, -(class606.field8722.field8936 * 2) + var19, var16);
                class648.field9186.method3541();
                arg0.method772(class648.field9186, true).method1632(var20 - (-var19 + var16), class606.field8722.field8940 + var21, var16, var18 - class606.field8722.field8940 * 2);
                class648.field9186.method3541();
                arg0.method772(class648.field9186, true).method1632(class606.field8722.field8936 + var20, var18 + var21 - var16, -(class606.field8722.field8936 * 2) + var19, var16);
                class648.field9186.method3541();
                var13.method2402(1, (int[]) null, (class591) null, var18 - var17 * 2, 0, (byte) -126, 0, 0, -1, var21 - -var17, -(var17 * 2) + var19, -16777216 | class438.field6306, arg5, 1, (class257[]) null, var20 - -var17);
                class41.method336(0, var20, var19, var21, var18);
            } else {
                int var7 = arg3.method2862(250, (class257[]) null, -53, arg5);
                int var8 = arg3.method2867(arg5, 250, 173, (class257[]) null) * 13;
                byte var9 = 4;
                int var10 = 6 - -var9;
                int var11 = var9 + 6;
                arg0.method824(-var9 + var10, var11 - var9, var9 + var9 + var7, var8 - -var9 + var9, -16777216, 0);
                arg0.method791(var10 - var9, -var9 + var11, var9 - -var9 + var7, var8 + var9 + var9, -1, 0);
                arg4.method2402(1, (int[]) null, (class591) null, var8, 0, (byte) 102, 0, 0, -1, var11, var7, -1, arg5, 1, (class257[]) null, var10);
                class41.method336(0, -var9 + var10, var7 - -var9 + var9, var11 - var9, var8 + var9 + var9);
            }
            if (arg2) {
                try {
                    arg0.method87();
                } catch (class300 var22) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lnh;IIII[[I[[II)V")
    public class194(class495 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field3003 = arg0;
        this.field3024 = super.field9707 + -2;
        this.field3004 = new int[arg3][arg4][];
        this.field3015 = new short[arg3 * arg4][];
        this.field3046 = new float[super.field9706 + 1][super.field9703 - -1];
        this.field3038 = new float[super.field9706 + 1][super.field9703 + 1];
        this.field3002 = new byte[arg3][arg4];
        this.field3030 = new class510[arg3][arg4][];
        this.field3006 = new int[arg3][arg4][];
        this.field3016 = new int[arg3][arg4][];
        this.field3044 = new float[super.field9706 - -1][super.field9703 + 1];
        this.field3027 = 1 << this.field3024;
        this.field3007 = arg2;
        this.field3000 = new int[arg3][arg4][];
        this.field3028 = new int[arg3][arg4][];
        this.field3041 = new byte[arg3 - -1][arg4 + 1];
        for (int var9 = 0; ~var9 >= ~super.field9703; ++var9) {
            for (int var10 = 0; ~super.field9706 <= ~var10; ++var10) {
                int var11 = super.field9713[var10][var9];
                if (this.field3009 > (float) var11) {
                    this.field3009 = (float) var11;
                }
                if ((float) var11 > this.field3012) {
                    this.field3012 = (float) var11;
                }
                if (var10 > 0 && ~var9 < -1 && var10 < super.field9706 && var9 < super.field9703) {
                    int var12 = arg6[var10 + 1][var9] + -arg6[var10 - 1][var9];
                    int var13 = arg6[var10][var9 + 1] - arg6[var10][var9 + -1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + (var12 * var12 - -(arg7 * 4 * arg7)))));
                    this.field3044[var10][var9] = (float) var12 * var14;
                    this.field3046[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field3038[var10][var9] = (float) var13 * var14;
                }
            }
        }
        --this.field3009;
        ++this.field3012;
        this.field3036 = new class482(128);
        if (~(this.field3007 & 16) != -1) {
            this.field3033 = new class622(this.field3003, this);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(III[[ZZI)V")
    public final void method1362(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.method1373(arg3, arg2, arg4, arg0, arg1, arg5, (byte) -110);
        ++field3010;
    }

    @OriginalMember(owner = "client!sq", name = "E", descriptor = "(Lha;IIIIZ)V")
    public final void method1363(class427 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3019;
        if (this.field3033 != null && arg0 != null) {
            int var7 = arg1 - (this.field3003.field7314 * arg2 >> 8) >> this.field3003.field7335;
            int var8 = -(this.field3003.field7333 * arg2 >> 8) + arg3 >> this.field3003.field7335;
            this.field3033.method3507(var8, arg0, var7, 1);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1364(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field3014;
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
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method1365(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!sq", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1365(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg5 != null && this.field3023 == null) {
            this.field3023 = new int[super.field9706][super.field9703][];
        }
        ++field3008;
        if (arg3 != null && this.field3028 == null) {
            this.field3028 = new int[super.field9706][super.field9703][];
        }
        this.field3006[arg0][arg1] = arg2;
        this.field3004[arg0][arg1] = arg4;
        this.field3000[arg0][arg1] = arg6;
        this.field3016[arg0][arg1] = arg7;
        if (this.field3023 != null) {
            this.field3023[arg0][arg1] = arg5;
        }
        if (this.field3028 != null) {
            this.field3028[arg0][arg1] = arg3;
        }
        class510[] var15 = this.field3030[arg0][arg1] = new class510[arg6.length];
        for (int var16 = 0; ~var16 > ~arg6.length; ++var16) {
            long var17 = (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (arg9[var16] << 14) | (long) arg8[var16];
            class435 var19;
            for (var19 = this.field3036.method2818(-22803, var17); var19 != null; var19 = this.field3036.method2810((byte) -45)) {
                class510 var20 = (class510) var19;
                if (arg8[var16] == var20.field7589 && (float) arg9[var16] == var20.field7586 && ~var20.field7597 == ~arg10 && var20.field7577 == arg11 && ~var20.field7583 == ~arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class510(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field3036.method2816(var15[var16], var17, false);
            } else {
                var15[var16] = (class510) var19;
            }
        }
        if (arg13) {
            this.field3002[arg0][arg1] = (byte) class460.method2676(this.field3002[arg0][arg1], 1);
        }
        if (this.field3037 < arg6.length) {
            this.field3037 = arg6.length;
        }
        this.field3034 += arg6.length;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field3043;
        if (~this.field3034 < -1) {
            class175 var9 = this.field3003.method2966(0, this.field2999);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; ~var13 > -5; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method1283((byte) 0, true);
                if (var14 != null) {
                    Stream var15 = this.field3003.method2912(104, var14);
                    if (Stream.method2042()) {
                        for (int var16 = arg4; ~arg6 < ~var16; ++var16) {
                            int var17 = super.field9706 * var16 - -arg3;
                            for (int var18 = arg3; ~arg5 < ~var18; ++var18) {
                                if (arg7[-arg3 + var18][var16 - arg4]) {
                                    short[] var19 = this.field3015[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; var19.length > var20; ++var20) {
                                            int var21 = 65535 & var19[var20];
                                            var15.method2036(var21);
                                            if (~var21 > ~var11) {
                                                var11 = var21;
                                            }
                                            if (var21 > var12) {
                                                var12 = var21;
                                            }
                                            ++var10;
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; ~var22 > ~arg6; ++var22) {
                            int var25 = super.field9706 * var22 + arg3;
                            for (int var26 = arg3; ~var26 > ~arg5; ++var26) {
                                if (arg7[-arg3 + var26][-arg4 + var22]) {
                                    short[] var27 = this.field3015[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; var28 < var27.length; ++var28) {
                                            int var29 = 65535 & var27[var28];
                                            if (var12 < var29) {
                                                var12 = var29;
                                            }
                                            if (var29 < var11) {
                                                var11 = var29;
                                            }
                                            ++var10;
                                            var15.method2038(var29);
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method2034();
                    if (var9.method1284(-28439)) {
                        break;
                    }
                }
            }
            if (~var10 < -1) {
                this.field3003.method2970((byte) -128);
                this.field3003.method2930(2, false);
                this.field3003.method2939(false, (byte) -121);
                this.field3003.method2900(-114, false);
                this.field3003.method2931(-8193, false);
                this.field3003.method2938(0, (byte) -112);
                this.field3003.method2922(-2, -27382, false, false);
                this.field3003.method2924(13528, (class402) null);
                class14 var23 = this.field3003.method2925(0);
                float[] var24 = this.field3003.method2897((byte) 60);
                var24[0] = (float) arg2 / ((float) super.field9709 * 128.0F * (float) this.field3003.field7098);
                var24[15] = 1.0F;
                var24[10] = 1.0F / (-this.field3009 + this.field3012);
                var24[6] = 0.0F;
                var24[2] = 0.0F;
                var24[1] = 0.0F;
                var24[3] = 0.0F;
                var24[7] = 0.0F;
                var24[4] = 0.0F;
                var24[12] = -(((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field3003.field7098) + -1.0F;
                var24[14] = -this.field3009 / (-this.field3009 + this.field3012);
                var24[5] = (float) arg2 / ((float) super.field9709 * 128.0F * (float) this.field3003.field7165);
                var24[8] = 0.0F;
                var24[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field3003.field7165;
                var24[9] = 0.0F;
                var24[11] = 0.0F;
                var23.method186(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, (byte) -82, 0.0F, 0.0F);
                this.field3003.method2933(100);
                this.field3003.method2973(true);
                if ((7 & this.field3007) != 0) {
                    this.field3003.method2939(true, (byte) -121);
                    this.field3003.method129(-110);
                } else {
                    this.field3003.method2939(false, (byte) -121);
                }
                this.field3003.method122(true, false);
                this.field3003.method131(3438, this.field3035, 0);
                this.field3003.method131(3438, this.field3042, 1);
                this.field3003.method98((byte) -105, this.field3045);
                this.field3003.method116(var10 / 3, 0, -var11 - -1 + var12, var9, class334.field4660, (byte) -50, var11);
                this.field3003.method122(true, true);
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lam;[I)V")
    public final void method1367(class289 arg0, int[] arg1) {
        this.field3025.method3904(new class642(this.field3003, this, arg0, arg1), 0);
        ++field3001;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)V")
    public final void method1368(int arg0, int arg1, int arg2) {
        ++field3020;
        if ((255 & this.field3041[arg0][arg1]) < arg2) {
            this.field3041[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!sq", name = "v", descriptor = "(IILha;)Lha;")
    public final class427 method1369(int arg0, int arg1, class427 arg2) {
        ++field3029;
        if ((1 & this.field3002[arg0][arg1]) == 0) {
            return null;
        } else {
            int var4 = super.field9709 >> this.field3003.field7335;
            class45 var5 = (class45) arg2;
            class45 var6;
            if (var5 != null && var5.method365(var4, var4, -90)) {
                var6 = var5;
                var5.method361(30932);
            } else {
                var6 = new class45(this.field3003, var4, var4);
            }
            var6.method359((byte) 0, 0, var4, 0, var4);
            this.method1372(var6, true, arg1, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lha;IIIIZ)Z")
    public final boolean method1370(class427 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3011;
        if (this.field3033 != null && arg0 != null) {
            int var7 = arg1 - (this.field3003.field7314 * arg2 >> 8) >> this.field3003.field7335;
            int var8 = -(this.field3003.field7333 * arg2 >> 8) + arg3 >> this.field3003.field7335;
            return this.field3033.method3511(var7, arg0, var8, (byte) -127);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sq", name = "BA", descriptor = "()V")
    public final void method1371() {
        ++field3031;
        if (this.field3034 <= 0) {
            this.field3033 = null;
        } else {
            byte[][] var1 = new byte[super.field9706 + 1][super.field9703 + 1];
            for (int var2 = 1; super.field9706 > var2; ++var2) {
                for (int var107 = 1; var107 < super.field9703; ++var107) {
                    var1[var2][var107] = (byte) ((this.field3041[var2][var107] >> 1) + (this.field3041[var2][var107 + -1] >> 2) + (this.field3041[var2 + 1][var107] >> 3) + (this.field3041[var2][var107 + 1] >> 3) + (this.field3041[var2 + -1][var107] >> 2));
                }
            }
            class510[] var3 = new class510[this.field3036.method2813((byte) -27)];
            this.field3036.method2817((byte) 118, var3);
            for (int var4 = 0; var4 < var3.length; ++var4) {
                var3[var4].method3039(this.field3034, -99);
            }
            int var5 = 20;
            if (this.field3023 != null) {
                var5 += 4;
            }
            if (~(this.field3007 & 7) != -1) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field3003.field7252.method2026(this.field3034 * 4, false);
            NativeHeapBuffer var7 = this.field3003.field7252.method2026(this.field3034 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class510[] var10 = new class510[this.field3034];
            int var11 = class270.method1702(this.field3034 / 4, (byte) -128);
            if (~var11 > -2) {
                var11 = 1;
            }
            class482 var12 = new class482(var11);
            class510[] var13 = new class510[this.field3037];
            for (int var14 = 0; ~super.field9706 < ~var14; ++var14) {
                for (int var34 = 0; ~var34 > ~super.field9703; ++var34) {
                    if (this.field3000[var14][var34] != null) {
                        class510[] var35 = this.field3030[var14][var34];
                        int[] var36 = this.field3006[var14][var34];
                        int[] var37 = this.field3004[var14][var34];
                        int[] var38 = this.field3016[var14][var34];
                        int[] var39 = this.field3000[var14][var34];
                        int[] var40 = this.field3028 != null ? this.field3028[var14][var34] : null;
                        int[] var41 = this.field3023 == null ? null : this.field3023[var14][var34];
                        if (var38 == null) {
                            var38 = var39;
                        }
                        float var42 = this.field3044[var14][var34];
                        float var43 = this.field3046[var14][var34];
                        float var44 = this.field3038[var14][var34];
                        float var45 = this.field3044[var14][var34 - -1];
                        float var46 = this.field3046[var14][var34 + 1];
                        float var47 = this.field3038[var14][var34 + 1];
                        float var48 = this.field3044[var14 + 1][var34 - -1];
                        float var49 = this.field3046[var14 + 1][var34 + 1];
                        float var50 = this.field3038[var14 + 1][var34 + 1];
                        float var51 = this.field3044[var14 + 1][var34];
                        float var52 = this.field3046[var14 + 1][var34];
                        float var53 = this.field3038[var14 + 1][var34];
                        int var54 = var1[var14][var34] & 255;
                        int var55 = var1[var14][var34 + 1] & 255;
                        int var56 = var1[var14 - -1][var34 + 1] & 255;
                        int var57 = 255 & var1[var14 - -1][var34];
                        int var58 = 0;
                        label357: for (int var59 = 0; var59 < var39.length; ++var59) {
                            class510 var105 = var35[var59];
                            for (int var106 = 0; var58 > var106; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label357;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field3015[super.field9706 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; ~var61 > ~var39.length; ++var61) {
                            int var62 = (var14 << super.field9707) - -var36[var61];
                            int var63 = (var34 << super.field9707) - -var37[var61];
                            int var64 = var62 >> this.field3024;
                            int var65 = var63 >> this.field3024;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 == null ? 0 : var40[var61];
                            long var69 = (long) var66 << 32 | (long) var67 << 48 | (long) (var64 << 16) | (long) var65;
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75 = 1.0F;
                            float var76;
                            float var77;
                            int var78;
                            float var79;
                            if (var71 == 0 && var72 == 0) {
                                var76 = var42;
                                var77 = var43;
                                var78 = var73 - var54;
                                var79 = var44;
                            } else if (~var71 == -1 && super.field9709 == var72) {
                                var76 = var45;
                                var79 = var47;
                                var78 = var73 - var55;
                                var77 = var46;
                            } else if (~super.field9709 == ~var71 && ~super.field9709 == ~var72) {
                                var76 = var48;
                                var78 = var73 - var56;
                                var79 = var50;
                                var77 = var49;
                            } else if (~super.field9709 == ~var71 && var72 == 0) {
                                var78 = var73 - var57;
                                var77 = var52;
                                var79 = var53;
                                var76 = var51;
                            } else {
                                float var80 = (float) var71 / (float) super.field9709;
                                float var81 = (float) var72 / (float) super.field9709;
                                float var82 = (var51 - var42) * var80 + var42;
                                float var83 = (-var43 + var52) * var80 + var43;
                                float var84 = (var53 - var44) * var80 + var44;
                                float var85 = (-var45 + var48) * var80 + var45;
                                float var86 = (-var46 + var49) * var80 + var46;
                                float var87 = (-var47 + var50) * var80 + var47;
                                var77 = (var86 - var83) * var81 + var83;
                                var76 = (var85 - var82) * var81 + var82;
                                var79 = (var87 - var84) * var81 + var84;
                                int var88 = ((-var54 + var57) * var71 >> super.field9707) + var54;
                                int var89 = var55 - -((-var55 + var56) * var71 >> super.field9707);
                                var78 = var73 - (((var89 - var88) * var72 >> super.field9707) + var88);
                            }
                            if (var66 != -1) {
                                int var90 = (var66 & 127) * var78 >> 7;
                                if (var90 < 2) {
                                    var90 = 2;
                                } else if (~var90 < -127) {
                                    var90 = 126;
                                }
                                var74 = class531.field7839[var66 & 65408 | var90];
                                if ((this.field3007 & 7) == 0) {
                                    float var91 = this.field3003.field7360[2] * var79 + this.field3003.field7360[1] * var77 + this.field3003.field7360[0] * var76;
                                    var75 = (var91 > 0.0F ? this.field3003.field7363 : this.field3003.field7294) * var91 + this.field3003.field7301;
                                }
                            }
                            class435 var92 = null;
                            if (~(this.field3027 + -1 & var62) == -1 && ~(this.field3027 - 1 & var63) == -1) {
                                var92 = var12.method2818(-22803, var69);
                            }
                            int var93;
                            if (var92 != null) {
                                var60[var61] = ((class497) var92).field7404;
                                var93 = var60[var61] & 65535;
                                if (~var66 != 0 && var10[var93].field6265 > var35[var61].field6265) {
                                    var10[var93] = var35[var61];
                                }
                            } else {
                                int var94;
                                if (var66 == var67) {
                                    var94 = var74;
                                } else {
                                    int var95 = (var67 & 127) * var78 >> 7;
                                    if (~var95 <= -3) {
                                        if (var95 > 126) {
                                            var95 = 126;
                                        }
                                    } else {
                                        var95 = 2;
                                    }
                                    var94 = class531.field7839[var95 | var67 & 65408];
                                    if ((7 & this.field3007) == 0) {
                                        float var96 = this.field3003.field7360[2] * var79 + this.field3003.field7360[0] * var76 + this.field3003.field7360[1] * var77;
                                        float var97 = (var75 > 0.0F ? this.field3003.field7363 : this.field3003.field7294) * var75 + this.field3003.field7301;
                                        int var98 = (16722210 & var94) >> 16;
                                        int var99 = 255 & var94 >> 8;
                                        int var100 = (int) ((float) var98 * var97);
                                        int var101 = 255 & var94;
                                        if (~var100 <= -1) {
                                            if (~var100 < -256) {
                                                var100 = 255;
                                            }
                                        } else {
                                            var100 = 0;
                                        }
                                        int var102 = (int) ((float) var99 * var97);
                                        if (~var102 <= -1) {
                                            if (~var102 < -256) {
                                                var102 = 255;
                                            }
                                        } else {
                                            var102 = 0;
                                        }
                                        int var103 = (int) ((float) var101 * var97);
                                        if (var103 < 0) {
                                            var103 = 0;
                                        } else if (var103 > 255) {
                                            var103 = 255;
                                        }
                                        var94 = var100 << 16 | var102 << 8 | var103;
                                    }
                                }
                                if (!Stream.method2042()) {
                                    var8.method2035((float) var62);
                                    var8.method2035((float) (var68 + this.method3861((byte) 99, var62, var63)));
                                    var8.method2035((float) var63);
                                    var8.method2035((float) var62);
                                    var8.method2035((float) var63);
                                    if (this.field3023 != null) {
                                        var8.method2035((float) (var41 == null ? 0 : var41[var61] + -1));
                                    }
                                    if (~(this.field3007 & 7) != -1) {
                                        var8.method2035(var76);
                                        var8.method2035(var77);
                                        var8.method2035(var79);
                                    }
                                } else {
                                    var8.method2037((float) var62);
                                    var8.method2037((float) (var68 + this.method3861((byte) 77, var62, var63)));
                                    var8.method2037((float) var63);
                                    var8.method2037((float) var62);
                                    var8.method2037((float) var63);
                                    if (this.field3023 != null) {
                                        var8.method2037((float) (var41 == null ? 0 : var41[var61] - 1));
                                    }
                                    if ((this.field3007 & 7) != 0) {
                                        var8.method2037(var76);
                                        var8.method2037(var77);
                                        var8.method2037(var79);
                                    }
                                }
                                if (~this.field3003.field7304 == -1) {
                                    var9.method2041(-16777216 | var94);
                                } else {
                                    var9.method2032(var94 | -16777216);
                                }
                                var93 = this.field3018++;
                                var60[var61] = (short) var93;
                                if (var66 != -1) {
                                    var10[var93] = var35[var61];
                                }
                                var12.method2816(new class497(var60[var61]), var69, false);
                            }
                            for (int var104 = 0; ~var58 < ~var104; ++var104) {
                                var13[var104].method3034(var78, var75, (byte) -122, var74, var93);
                            }
                            ++this.field2999;
                        }
                    }
                }
            }
            for (int var15 = 0; ~var15 > ~this.field3018; ++var15) {
                class510 var33 = var10[var15];
                if (var33 != null) {
                    var33.method3038(var15, (byte) 40);
                }
            }
            for (int var16 = 0; var16 < super.field9706; ++var16) {
                for (int var22 = 0; super.field9703 > var22; ++var22) {
                    short[] var23 = this.field3015[super.field9706 * var22 + var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (var25 < var23.length) {
                            int var26 = 65535 & var23[var25++];
                            int var27 = 65535 & var23[var25++];
                            int var28 = 65535 & var23[var25++];
                            class510 var29 = var10[var26];
                            class510 var30 = var10[var27];
                            class510 var31 = var10[var28];
                            class510 var32 = null;
                            if (var29 != null) {
                                var29.method3032(var16, var22, var24, (byte) -98);
                                var32 = var29;
                            }
                            if (var30 != null) {
                                var30.method3032(var16, var22, var24, (byte) -103);
                                if (var32 == null || var32.field6265 > var30.field6265) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method3032(var16, var22, var24, (byte) -125);
                                if (var32 == null || var31.field6265 < var32.field6265) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method3038(var26, (byte) 40);
                                }
                                if (var30 != null) {
                                    var32.method3038(var27, (byte) 40);
                                }
                                if (var31 != null) {
                                    var32.method3038(var28, (byte) 40);
                                }
                                var32.method3032(var16, var22, var24, (byte) 62);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method2034();
            var9.method2034();
            this.field3042 = this.field3003.method119(false, 0);
            this.field3042.method534(4, var6, this.field3018 * 4, (byte) -60);
            this.field3035 = this.field3003.method119(false, 0);
            this.field3035.method534(var5, var7, this.field3018 * var5, (byte) -14);
            if (~(this.field3007 & 7) == -1) {
                if (this.field3023 == null) {
                    this.field3045 = this.field3003.method141(new class148[] { new class148(new class324[] { class324.field4509, class324.field4514 }), new class148(class324.field4512) }, false);
                } else {
                    this.field3045 = this.field3003.method141(new class148[] { new class148(new class324[] { class324.field4509, class324.field4514, class324.field4513 }), new class148(class324.field4512) }, false);
                }
            } else if (this.field3023 == null) {
                this.field3045 = this.field3003.method141(new class148[] { new class148(new class324[] { class324.field4509, class324.field4514, class324.field4510 }), new class148(class324.field4512) }, false);
            } else {
                this.field3045 = this.field3003.method141(new class148[] { new class148(new class324[] { class324.field4509, class324.field4514, class324.field4513, class324.field4510 }), new class148(class324.field4512) }, false);
            }
            int var17 = 0;
            for (int var18 = 0; var3.length > var18; ++var18) {
                if (~var3[var18].field7593 < -1) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field3039 = new class510[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; ~var17 < ~var20; ++var20) {
                class510 var21 = var3[var20];
                var19[var20] = var21.field6265;
                this.field3039[var20] = var21;
                var21.method3037(false, this.field3018);
            }
            class89.method667(this.field3039, 115, var19);
            if (this.field3033 != null) {
                this.field3033.method3509((byte) -82);
            }
        }
        this.field3036 = null;
        this.field3006 = this.field3004 = null;
        this.field3044 = this.field3046 = this.field3038 = null;
        this.field3041 = null;
        this.field3016 = null;
        this.field3028 = null;
        this.field3030 = null;
        this.field3000 = null;
        this.field3023 = null;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Luda;ZII)V")
    private final void method1372(class45 arg0, boolean arg1, int arg2, int arg3) {
        ++field3017;
        int[] var5 = this.field3006[arg3][arg2];
        int[] var6 = this.field3004[arg3][arg2];
        int var7 = var5.length;
        if (~class126.field2065.length > ~var7) {
            class407.field5842 = new int[var7];
            class126.field2065 = new int[var7];
        }
        for (int var8 = 0; ~var8 > ~var7; ++var8) {
            class126.field2065[var8] = var5[var8] >> this.field3003.field7335;
            class407.field5842[var8] = var6[var8] >> this.field3003.field7335;
        }
        int var9 = 0;
        if (arg1) {
            while (var9 < var7) {
                int var10 = class126.field2065[var9];
                int var11 = class407.field5842[var9++];
                int var12 = class126.field2065[var9];
                int var13 = class407.field5842[var9++];
                int var14 = class126.field2065[var9];
                int var15 = class407.field5842[var9++];
                if ((-var12 + var10) * (-var15 + var13) + -((-var11 + var13) * (-var12 + var14)) > 0) {
                    arg0.method360(var13, var15, var11, var12, var10, -51, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "([[ZIZIIIB)V")
    private final void method1373(boolean[][] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (this.field3039 != null) {
            int var8 = arg1 - -1 + arg1;
            int var9 = var8 * var8;
            if (~var9 < ~class314.field4362.length) {
                class314.field4362 = new int[var9];
            }
            int var10 = -arg1 + arg3;
            int var11 = var10;
            if (~var10 > -1) {
                var10 = 0;
            }
            int var12 = -arg1 + arg4;
            int var13 = var12;
            if (var12 < 0) {
                var12 = 0;
            }
            int var14 = arg1 + arg3;
            if (super.field9706 - 1 < var14) {
                var14 = super.field9706 + -1;
            }
            int var15 = arg1 + arg4;
            if (~(super.field9703 + -1) > ~var15) {
                var15 = super.field9703 + -1;
            }
            class410.field5861 = 0;
            for (int var16 = var10; var14 >= var16; ++var16) {
                boolean[] var23 = arg0[var16 - var11];
                for (int var24 = var12; var24 <= var15; ++var24) {
                    if (var23[var24 - var13]) {
                        class314.field4362[class410.field5861++] = super.field9706 * var24 - -var16;
                    }
                }
            }
            if (arg5 != -1) {
                this.field3003.method2935((float) arg5, false);
                this.field3003.method2904((byte) 38);
            } else {
                this.field3003.method2942(arg6 ^ 113);
            }
            this.field3003.method2962((byte) 112);
            this.field3003.method2939((7 & this.field3007) != 0, (byte) -121);
            this.field3003.method2922(-1, -27382, false, false);
            this.field3003.method131(arg6 + 3548, this.field3035, 0);
            for (int var17 = 0; ~var17 > ~this.field3039.length; ++var17) {
                this.field3039[var17].method3033(0, class410.field5861, class314.field4362);
            }
            class14 var18 = this.field3003.method2925(arg6 ^ -110);
            var18.method166(0, -1, 0);
            this.field3003.method2973(true);
            if (!this.field3025.method3903(2)) {
                int var19 = this.field3003.field7332;
                int var20 = this.field3003.field7317;
                this.field3003.method763(0, var20, this.field3003.field7300);
                this.field3003.method2939(false, (byte) -121);
                this.field3003.method2931(arg6 ^ 8301, false);
                this.field3003.method2938(128, (byte) 120);
                this.field3003.method2922(-2, -27382, false, false);
                this.field3003.method2924(13528, this.field3003.field7336);
                this.field3003.method2959(class55.field715, class345.field4866, (byte) -128);
                this.field3003.method2914(92, 0, class450.field6484);
                this.field3003.method2937(8, class521.field7683, 0);
                for (class435 var21 = this.field3025.method3905(-128); var21 != null; var21 = this.field3025.method3899(arg6 ^ -110)) {
                    class642 var22 = (class642) var21;
                    var22.method3610(arg4, (byte) -26, arg3, arg1, arg0);
                }
                this.field3003.method2914(81, 0, class171.field2763);
                this.field3003.method2937(8, class171.field2763, 0);
                this.field3003.method2924(13528, (class402) null);
                this.field3003.method763(var19, var20, this.field3003.field7300);
            }
            if (this.field3033 != null) {
                this.field3003.method131(arg6 ^ -3332, this.field3035, 0);
                this.field3003.method131(arg6 ^ -3332, this.field3042, 1);
                this.field3003.method98((byte) -87, this.field3045);
                this.field3033.method3512(arg2, (byte) 68, arg1, arg0, arg4, arg3);
            }
        }
        if (arg6 != -110) {
            this.field3000 = null;
        }
        ++field3022;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)V")
    public final void method1374(int arg0, int arg1) {
        ++field3021;
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(Z)V")
    public static void method1375(boolean arg0) {
        field3040 = null;
        field3013 = null;
        if (arg0) {
            field3040 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "DA", descriptor = "(Lha;IIIIZ)V")
    public final void method1376(class427 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3026;
        if (this.field3033 != null && arg0 != null) {
            int var7 = -(this.field3003.field7314 * arg2 >> 8) + arg1 >> this.field3003.field7335;
            int var8 = -(this.field3003.field7333 * arg2 >> 8) + arg3 >> this.field3003.field7335;
            this.field3033.method3513(var8, var7, arg0, false);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(III[[ZZ)V")
    public final void method1377(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        ++field3032;
        this.method1373(arg3, arg2, arg4, arg0, arg1, -1, (byte) -110);
    }
}
