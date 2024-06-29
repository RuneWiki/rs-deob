import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class574 extends class358 {

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "F")
    private float field7266 = -3.4028235E38F;

    @OriginalMember(owner = "client!rd", name = "Q", descriptor = "F")
    private float field7287 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "Lfca;")
    private class661 field7269 = new class661();

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "I")
    private int field7278 = this.field4372 + -2;

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "Lgd;")
    public class696 field7275;

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "[[[Lea;")
    private class500[][][] field7271;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "[[[I")
    public int[][][] field7270;

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "[[[I")
    private int[][][] field7272;

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "[[[I")
    public int[][][] field7279;

    @OriginalMember(owner = "client!rd", name = "R", descriptor = "[[S")
    public short[][] field7288;

    @OriginalMember(owner = "client!rd", name = "cb", descriptor = "[[F")
    private float[][] field7299;

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "I")
    private int field7282;

    @OriginalMember(owner = "client!rd", name = "ab", descriptor = "[[F")
    private float[][] field7297;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "[[B")
    private byte[][] field7268;

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "I")
    public int field7276;

    @OriginalMember(owner = "client!rd", name = "gb", descriptor = "[[B")
    private byte[][] field7303;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "[[[I")
    private int[][][] field7265;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "[[[I")
    public int[][][] field7284;

    @OriginalMember(owner = "client!rd", name = "X", descriptor = "[[F")
    private float[][] field7294;

    @OriginalMember(owner = "client!rd", name = "db", descriptor = "Lrda;")
    private class467 field7300;

    @OriginalMember(owner = "client!rd", name = "O", descriptor = "Lep;")
    private class392 field7285;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    private int field7258;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public static int field7259;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
    public static int field7260;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
    public static int field7261;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    public static int field7262;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
    public static int field7263;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    public static int field7264;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
    public static int field7267;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
    public static int field7273;

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "I")
    public static int field7274;

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "I")
    private int field7277;

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "I")
    public static int field7280;

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "I")
    public static int field7281;

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "I")
    public static int field7283;

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "I")
    public static int field7286;

    @OriginalMember(owner = "client!rd", name = "S", descriptor = "I")
    public static int field7289;

    @OriginalMember(owner = "client!rd", name = "T", descriptor = "I")
    public static int field7290;

    @OriginalMember(owner = "client!rd", name = "U", descriptor = "I")
    public static int field7291;

    @OriginalMember(owner = "client!rd", name = "V", descriptor = "I")
    public static int field7292;

    @OriginalMember(owner = "client!rd", name = "W", descriptor = "I")
    private int field7293;

    @OriginalMember(owner = "client!rd", name = "bb", descriptor = "I")
    private int field7298;

    @OriginalMember(owner = "client!rd", name = "eb", descriptor = "Lcq;")
    private class233 field7301;

    @OriginalMember(owner = "client!rd", name = "fb", descriptor = "Lcq;")
    private class233 field7302;

    @OriginalMember(owner = "client!rd", name = "Z", descriptor = "Lco;")
    public class753 field7296;

    @OriginalMember(owner = "client!rd", name = "Y", descriptor = "[Lea;")
    private class500[] field7295;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "[[[I")
    private int[][][] field7257;

    @OriginalMember(owner = "client!rd", name = "ka", descriptor = "(III)V", line = 5)
    public final void method2058(int arg0, int arg1, int arg2) {
        ++field7286;
        if (arg2 > (255 & this.field7303[arg0][arg1])) {
            this.field7303[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lig;BII)V", line = 18)
    private final void method3090(class703 arg0, byte arg1, int arg2, int arg3) {
        ++field7259;
        int[] var5 = this.field7270[arg2][arg3];
        int[] var6 = this.field7284[arg2][arg3];
        if (arg1 < -55) {
            int var7 = var5.length;
            if (~var7 < ~class491.field6307.length) {
                class617.field7828 = new int[var7];
                class491.field6307 = new int[var7];
            }
            for (int var8 = 0; var7 > var8; ++var8) {
                class491.field6307[var8] = var5[var8] >> this.field7275.field9201;
                class617.field7828[var8] = var6[var8] >> this.field7275.field9201;
            }
            int var9 = 0;
            while (~var7 < ~var9) {
                int var10 = class491.field6307[var9];
                int var11 = class617.field7828[var9++];
                int var12 = class491.field6307[var9];
                int var13 = class617.field7828[var9++];
                int var14 = class491.field6307[var9];
                int var15 = class617.field7828[var9++];
                if ((-var12 + var10) * (-var15 + var13) + -((var14 - var12) * (-var11 + var13)) > 0) {
                    arg0.method3809(var13, 0, var14, var11, var15, var12, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII[[ZIZI)V", line = 75)
    private final void method3091(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int arg5, boolean arg6, int arg7) {
        ++field7261;
        if (arg0 > 89) {
            if (this.field7295 != null) {
                int var9 = arg7 - -1 + arg7;
                int var10 = var9 * var9;
                if (var10 > class686.field8839.length) {
                    class686.field8839 = new int[var10];
                }
                int var11 = -arg7 + arg3;
                int var12 = var11;
                if (~var11 > -1) {
                    var11 = 0;
                }
                int var13 = arg1 - arg7;
                int var14 = var13;
                if (~var13 > -1) {
                    var13 = 0;
                }
                int var15 = arg3 - -arg7;
                if (~var15 < ~(super.field4366 + -1)) {
                    var15 = super.field4366 - 1;
                }
                int var16 = arg1 + arg7;
                class1.field9 = 0;
                if (var16 > super.field4371 - 1) {
                    var16 = super.field4371 + -1;
                }
                for (int var17 = var11; var15 >= var17; ++var17) {
                    boolean[] var24 = arg4[var17 - var12];
                    for (int var25 = var13; ~var16 <= ~var25; ++var25) {
                        if (var24[-var14 + var25]) {
                            class686.field8839[class1.field9++] = super.field4366 * var25 + var17;
                        }
                    }
                }
                if (arg5 != -1) {
                    this.field7275.method3709(1, (float) arg5);
                    this.field7275.method3717(4);
                } else {
                    this.field7275.method3745(-18413);
                }
                this.field7275.method3765((byte) 116);
                this.field7275.method3720(117, (this.field7276 & 7) != 0);
                this.field7275.method3767(false, -1, false, (byte) 86);
                this.field7275.method1200((byte) -98, 0, this.field7302);
                for (int var18 = 0; this.field7295.length > var18; ++var18) {
                    this.field7295[var18].method2772(class686.field8839, false, class1.field9);
                }
                class588 var19 = this.field7275.method3783(32);
                var19.method449(0, -1, 0);
                this.field7275.method3761(0);
                if (!this.field7269.method3596(-45)) {
                    int var20 = this.field7275.field9141;
                    int var21 = this.field7275.field9183;
                    this.field7275.method884(0, var21, this.field7275.field9147);
                    this.field7275.method3720(108, false);
                    this.field7275.method3766((byte) -46, false);
                    this.field7275.method3750(false, 128);
                    this.field7275.method3767(false, -2, false, (byte) 86);
                    this.field7275.method3756(10, this.field7275.field9128);
                    this.field7275.method3759(false, class137.field1820, class174.field2285);
                    this.field7275.method3736(class324.field4001, 0, (byte) -88);
                    this.field7275.method3718(0, class436.field5734, 1);
                    for (class337 var22 = this.field7269.method3591(0); var22 != null; var22 = this.field7269.method3600((byte) 56)) {
                        class718 var23 = (class718) var22;
                        var23.method3851(arg1, arg7, arg4, (byte) -91, arg3);
                    }
                    this.field7275.method3736(class171.field2262, 0, (byte) -88);
                    this.field7275.method3718(0, class171.field2262, 1);
                    this.field7275.method3756(10, (class132) null);
                    this.field7275.method884(var20, var21, this.field7275.field9147);
                }
                if (this.field7285 != null) {
                    this.field7275.method1200((byte) -104, 0, this.field7302);
                    this.field7275.method1200((byte) -119, 1, this.field7301);
                    this.field7275.method1150(this.field7296, 0);
                    this.field7285.method2275(arg4, arg6, arg3, (byte) -64, arg1, arg7);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V", line = 217)
    public final void method2062(int arg0, int arg1) {
        ++field7292;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZLha;I)Lda;", line = 224)
    public static final class420 method3092(int arg0, boolean arg1, class570 arg2, int arg3) {
        ++field7290;
        int var4 = -71 % ((arg3 - -60) / 57);
        class25 var5 = class711.method3839(0, arg2, arg0, arg1);
        return var5 == null ? null : var5.field213;
    }

    @OriginalMember(owner = "client!rd", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 241)
    public final void method2063(class736 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7262;
        if (this.field7285 != null && arg0 != null) {
            int var7 = arg1 - (this.field7275.field9187 * arg2 >> 8) >> this.field7275.field9201;
            int var8 = -(this.field7275.field9126 * arg2 >> 8) + arg3 >> this.field7275.field9201;
            this.field7285.method2276(var7, var8, arg0, -6761);
        }
    }

    @OriginalMember(owner = "client!rd", name = "fa", descriptor = "(IILr;)Lr;", line = 257)
    public final class736 method2065(int arg0, int arg1, class736 arg2) {
        ++field7291;
        if ((this.field7268[arg0][arg1] & 1) == 0) {
            return null;
        } else {
            int var4 = super.field4369 >> this.field7275.field9201;
            class703 var5 = (class703) arg2;
            class703 var6;
            if (var5 != null && var5.method3811(var4, var4, false)) {
                var6 = var5;
                var5.method3805((byte) 0);
            } else {
                var6 = new class703(this.field7275, var4, var4);
            }
            var6.method3808(var4, var4, 0, -1, 0);
            this.method3090(var6, (byte) -72, arg0, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!rd", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 291)
    public final void method2070(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field7264;
        if (arg3 != null && this.field7272 == null) {
            this.field7272 = new int[super.field4366][super.field4371][];
        }
        if (arg5 != null && this.field7257 == null) {
            this.field7257 = new int[super.field4366][super.field4371][];
        }
        class284 var15 = this.field7275.field7199;
        this.field7270[arg0][arg1] = arg2;
        this.field7284[arg0][arg1] = arg4;
        this.field7279[arg0][arg1] = arg6;
        this.field7265[arg0][arg1] = arg7;
        if (this.field7257 != null) {
            this.field7257[arg0][arg1] = arg5;
        }
        if (this.field7272 != null) {
            this.field7272[arg0][arg1] = arg3;
        }
        class500[] var16 = this.field7271[arg0][arg1] = new class500[arg6.length];
        for (int var17 = 0; arg6.length > var17; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if ((this.field7276 & 32) != 0 && ~var18 != 0 && var15.method1732((byte) -9, var18).field2679) {
                var18 = -1;
                var19 = 128;
            }
            long var20 = (long) var18 | (long) (var19 << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28;
            class337 var22;
            for (var22 = this.field7300.method2616(var20, (byte) -119); var22 != null; var22 = this.field7300.method2615(8)) {
                class500 var23 = (class500) var22;
                if (var23.field6417 == var18 && (float) var19 == var23.field6420 && ~var23.field6433 == ~arg10 && var23.field6419 == arg11 && var23.field6409 == arg12) {
                    break;
                }
            }
            if (var22 == null) {
                var16[var17] = new class500(this, var18, var19, arg10, arg11, arg12);
                this.field7300.method2619(var16[var17], var20, -1);
            } else {
                var16[var17] = (class500) var22;
            }
        }
        if (arg13) {
            this.field7268[arg0][arg1] = (byte) class77.method473(this.field7268[arg0][arg1], 1);
        }
        if (arg6.length > this.field7293) {
            this.field7293 = arg6.length;
        }
        this.field7298 += arg6.length;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lgd;IIII[[I[[II)V", line = 438)
    public class574(class696 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field7275 = arg0;
        this.field7271 = new class500[arg3][arg4][];
        this.field7270 = new int[arg3][arg4][];
        this.field7272 = new int[arg3][arg4][];
        this.field7279 = new int[arg3][arg4][];
        this.field7288 = new short[arg3 * arg4][];
        this.field7299 = new float[super.field4366 + 1][super.field4371 + 1];
        this.field7282 = 1 << this.field7278;
        this.field7297 = new float[super.field4366 + 1][super.field4371 + 1];
        this.field7268 = new byte[arg3][arg4];
        this.field7276 = arg2;
        this.field7303 = new byte[arg3 + 1][arg4 + 1];
        this.field7265 = new int[arg3][arg4][];
        this.field7284 = new int[arg3][arg4][];
        this.field7294 = new float[super.field4366 + 1][super.field4371 + 1];
        for (int var9 = 0; super.field4371 >= var9; ++var9) {
            for (int var10 = 0; var10 <= super.field4366; ++var10) {
                int var11 = super.field4367[var10][var9];
                if ((float) var11 > this.field7266) {
                    this.field7266 = (float) var11;
                }
                if ((float) var11 < this.field7287) {
                    this.field7287 = (float) var11;
                }
                if (var10 > 0 && var9 > 0 && var10 < super.field4366 && ~var9 > ~super.field4371) {
                    int var12 = arg6[var10 + 1][var9] - arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 - -1] + -arg6[var10][var9 + -1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + (var12 * var12 - -(arg7 * 4 * arg7)))));
                    this.field7294[var10][var9] = (float) var12 * var14;
                    this.field7299[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field7297[var10][var9] = (float) var13 * var14;
                }
            }
        }
        ++this.field7266;
        --this.field7287;
        this.field7300 = new class467(128);
        if ((16 & this.field7276) != 0) {
            this.field7285 = new class392(this.field7275, this);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III[[ZZI)V", line = 374)
    public final void method2064(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.method3091(127, arg1, arg5, arg0, arg3, -1, arg4, arg2);
        ++field7260;
    }

    @OriginalMember(owner = "client!rd", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 384)
    public final void method2067(class736 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7280;
        if (this.field7285 != null && arg0 != null) {
            int var7 = -(this.field7275.field9187 * arg2 >> 8) + arg1 >> this.field7275.field9201;
            int var8 = -(this.field7275.field9126 * arg2 >> 8) + arg3 >> this.field7275.field9201;
            this.field7285.method2271((byte) 93, var7, var8, arg0);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III[[ZZII)V", line = 410)
    public final void method2071(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        ++field7274;
        this.method3091(94, arg1, arg6, arg0, arg3, arg5, arg4, arg2);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 420)
    public final boolean method2057(class736 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7273;
        if (this.field7285 != null && arg0 != null) {
            int var7 = -(this.field7275.field9187 * arg2 >> 8) + arg1 >> this.field7275.field9201;
            int var8 = arg3 - (this.field7275.field9126 * arg2 >> 8) >> this.field7275.field9201;
            return this.field7285.method2272(var8, arg0, var7, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lgu;[I)V", line = 511)
    public final void method2059(class757 arg0, int[] arg1) {
        this.field7269.method3593(new class718(this.field7275, this, arg0, arg1), 15);
        ++field7283;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 520)
    public final void method2068(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field7263;
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
        this.method2070(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIII[[Z)V", line = 604)
    public final void method2069(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field7281;
        if (~this.field7298 < -1) {
            class688 var9 = this.field7275.method3735((byte) -5, this.field7277);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; ~var13 > -5; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method2014(true, true);
                if (var14 != null) {
                    Stream var15 = this.field7275.method3773(var14, (byte) -82);
                    if (!Stream.method2528()) {
                        for (int var16 = arg4; ~arg6 < ~var16; ++var16) {
                            int var17 = super.field4366 * var16 + arg3;
                            for (int var18 = arg3; var18 < arg5; ++var18) {
                                if (arg7[var18 - arg3][-arg4 + var16]) {
                                    short[] var19 = this.field7288[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; ~var20 > ~var19.length; ++var20) {
                                            int var21 = 65535 & var19[var20];
                                            if (var21 > var12) {
                                                var12 = var21;
                                            }
                                            ++var10;
                                            var15.method2516(var21);
                                            if (var21 < var11) {
                                                var11 = var21;
                                            }
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; ~var22 > ~arg6; ++var22) {
                            int var25 = super.field4366 * var22 + arg3;
                            for (int var26 = arg3; var26 < arg5; ++var26) {
                                if (arg7[-arg3 + var26][var22 - arg4]) {
                                    short[] var27 = this.field7288[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; ~var28 > ~var27.length; ++var28) {
                                            int var29 = var27[var28] & 65535;
                                            if (var11 > var29) {
                                                var11 = var29;
                                            }
                                            if (~var29 < ~var12) {
                                                var12 = var29;
                                            }
                                            ++var10;
                                            var15.method2525(var29);
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method2519();
                    if (var9.method2017(28359)) {
                        break;
                    }
                }
            }
            if (var10 > 0) {
                this.field7275.method3742(false);
                this.field7275.method3716(false, -32);
                this.field7275.method3720(102, false);
                this.field7275.method3760(false, -24009);
                this.field7275.method3766((byte) -61, false);
                this.field7275.method3750(false, 0);
                this.field7275.method3767(false, -2, false, (byte) 86);
                this.field7275.method3756(10, (class132) null);
                class588 var23 = this.field7275.method3783(85);
                float[] var24 = this.field7275.method3724(11766);
                var24[1] = 0.0F;
                var24[6] = 0.0F;
                var24[10] = 1.0F / (-this.field7287 + this.field7266);
                var24[4] = 0.0F;
                var24[9] = 0.0F;
                var24[11] = 0.0F;
                var24[3] = 0.0F;
                var24[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field7275.field8998) + 1.0F;
                var24[7] = 0.0F;
                var24[12] = -(((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field7275.field9097) + -1.0F;
                var24[5] = (float) arg2 / ((float) super.field4369 * 128.0F * (float) this.field7275.field8998);
                var24[2] = 0.0F;
                var24[0] = (float) arg2 / ((float) super.field4369 * 128.0F * (float) this.field7275.field9097);
                var24[8] = 0.0F;
                var24[14] = -this.field7287 / (-this.field7287 + this.field7266);
                var24[15] = 1.0F;
                var23.method3157(125, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F);
                this.field7275.method3748(4);
                this.field7275.method3761(0);
                if ((7 & this.field7276) == 0) {
                    this.field7275.method3720(77, false);
                } else {
                    this.field7275.method3720(92, true);
                    this.field7275.method1204(5);
                }
                this.field7275.method1154(false, 0);
                this.field7275.method1200((byte) -119, 0, this.field7302);
                this.field7275.method1200((byte) -94, 1, this.field7301);
                this.field7275.method1150(this.field7296, 0);
                this.field7275.method1151(0, var12 + 1 + -var11, var11, class279.field3624, false, var9, var10 / 3);
                this.field7275.method1154(true, 0);
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "YA", descriptor = "()V", line = 798)
    public final void method2066() {
        ++field7267;
        if (this.field7298 <= 0) {
            this.field7285 = null;
        } else {
            byte[][] var1 = new byte[super.field4366 + 1][super.field4371 + 1];
            for (int var2 = 1; ~super.field4366 < ~var2; ++var2) {
                for (int var107 = 1; ~super.field4371 < ~var107; ++var107) {
                    var1[var2][var107] = (byte) ((this.field7303[var2][var107 - 1] >> 2) + (this.field7303[var2][var107 - -1] >> 3) + (this.field7303[var2][var107] >> 1) + (this.field7303[var2 - 1][var107] >> 2) + (this.field7303[var2 + 1][var107] >> 3));
                }
            }
            class500[] var3 = new class500[this.field7300.method2618(-1)];
            this.field7300.method2612(var3, -1);
            for (int var4 = 0; var4 < var3.length; ++var4) {
                var3[var4].method2780(this.field7298, (byte) 126);
            }
            int var5 = 20;
            if (this.field7257 != null) {
                var5 += 4;
            }
            if ((this.field7276 & 7) != 0) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field7275.field9022.method2532(this.field7298 * 4, false);
            NativeHeapBuffer var7 = this.field7275.field9022.method2532(this.field7298 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class500[] var10 = new class500[this.field7298];
            int var11 = class681.method3659(-120, this.field7298 / 4);
            if (var11 < 1) {
                var11 = 1;
            }
            class467 var12 = new class467(var11);
            class500[] var13 = new class500[this.field7293];
            for (int var14 = 0; ~super.field4366 < ~var14; ++var14) {
                for (int var34 = 0; ~super.field4371 < ~var34; ++var34) {
                    if (this.field7279[var14][var34] != null) {
                        class500[] var35 = this.field7271[var14][var34];
                        int[] var36 = this.field7270[var14][var34];
                        int[] var37 = this.field7284[var14][var34];
                        int[] var38 = this.field7265[var14][var34];
                        int[] var39 = this.field7279[var14][var34];
                        int[] var40 = this.field7272 != null ? this.field7272[var14][var34] : null;
                        if (var38 == null) {
                            var38 = var39;
                        }
                        int[] var41 = this.field7257 != null ? this.field7257[var14][var34] : null;
                        float var42 = this.field7294[var14][var34];
                        float var43 = this.field7299[var14][var34];
                        float var44 = this.field7297[var14][var34];
                        float var45 = this.field7294[var14][var34 + 1];
                        float var46 = this.field7299[var14][var34 + 1];
                        float var47 = this.field7297[var14][var34 + 1];
                        float var48 = this.field7294[var14 - -1][var34 + 1];
                        float var49 = this.field7299[var14 - -1][var34 + 1];
                        float var50 = this.field7297[var14 + 1][var34 + 1];
                        float var51 = this.field7294[var14 + 1][var34];
                        float var52 = this.field7299[var14 + 1][var34];
                        float var53 = this.field7297[var14 + 1][var34];
                        int var54 = var1[var14][var34] & 255;
                        int var55 = var1[var14][var34 + 1] & 255;
                        int var56 = var1[var14 - -1][var34 - -1] & 255;
                        int var57 = 255 & var1[var14 + 1][var34];
                        int var58 = 0;
                        label359: for (int var59 = 0; ~var39.length < ~var59; ++var59) {
                            class500 var105 = var35[var59];
                            for (int var106 = 0; ~var106 > ~var58; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label359;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field7288[super.field4366 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; var39.length > var61; ++var61) {
                            int var62 = (var14 << super.field4372) + var36[var61];
                            int var63 = (var34 << super.field4372) + var37[var61];
                            int var64 = var62 >> this.field7278;
                            int var65 = var63 >> this.field7278;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 != null ? var40[var61] : 0;
                            long var69 = (long) (var64 << 16) | (long) var66 << 32 | (long) var67 << 48 | (long) var65;
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75 = 1.0F;
                            int var76;
                            float var77;
                            float var78;
                            float var79;
                            if (~var71 == -1 && var72 == 0) {
                                var76 = var73 - var54;
                                var77 = var44;
                                var78 = var42;
                                var79 = var43;
                            } else if (~var71 == -1 && ~super.field4369 == ~var72) {
                                var79 = var46;
                                var76 = var73 - var55;
                                var77 = var47;
                                var78 = var45;
                            } else if (~super.field4369 == ~var71 && super.field4369 == var72) {
                                var78 = var48;
                                var79 = var49;
                                var77 = var50;
                                var76 = var73 - var56;
                            } else if (super.field4369 == var71 && var72 == 0) {
                                var76 = var73 - var57;
                                var78 = var51;
                                var77 = var53;
                                var79 = var52;
                            } else {
                                float var80 = (float) var71 / (float) super.field4369;
                                float var81 = (float) var72 / (float) super.field4369;
                                float var82 = (var51 - var42) * var80 + var42;
                                float var83 = (var52 - var43) * var80 + var43;
                                float var84 = (var53 - var44) * var80 + var44;
                                float var85 = (-var45 + var48) * var80 + var45;
                                float var86 = (-var46 + var49) * var80 + var46;
                                float var87 = (-var47 + var50) * var80 + var47;
                                var79 = (var86 - var83) * var81 + var83;
                                var78 = (-var82 + var85) * var81 + var82;
                                var77 = (-var84 + var87) * var81 + var84;
                                int var88 = var54 - -((-var54 + var57) * var71 >> super.field4372);
                                int var89 = ((-var55 + var56) * var71 >> super.field4372) + var55;
                                var76 = var73 - (((-var88 + var89) * var72 >> super.field4372) + var88);
                            }
                            if (var66 != -1) {
                                int var90 = (127 & var66) * var76 >> 7;
                                if (~var90 <= -3) {
                                    if (var90 > 126) {
                                        var90 = 126;
                                    }
                                } else {
                                    var90 = 2;
                                }
                                if (~(this.field7276 & 7) == -1) {
                                    float var91 = this.field7275.field9203[2] * var77 + this.field7275.field9203[1] * var79 + this.field7275.field9203[0] * var78;
                                    var75 = this.field7275.field9143 + var91 * (var91 > 0.0F ? this.field7275.field9154 : this.field7275.field9173);
                                }
                                var74 = class594.field7542[var66 & 65408 | var90];
                            }
                            class337 var92 = null;
                            if (~(this.field7282 + -1 & var62) == -1 && ~(this.field7282 + -1 & var63) == -1) {
                                var92 = var12.method2616(var69, (byte) 43);
                            }
                            int var93;
                            if (var92 != null) {
                                var60[var61] = ((class97) var92).field1310;
                                var93 = var60[var61] & 65535;
                                if (~var66 != 0 && var10[var93].field4108 > var35[var61].field4108) {
                                    var10[var93] = var35[var61];
                                }
                            } else {
                                int var94;
                                if (~var66 == ~var67) {
                                    var94 = var74;
                                } else {
                                    int var95 = (127 & var67) * var76 >> 7;
                                    if (var95 >= 2) {
                                        if (var95 > 126) {
                                            var95 = 126;
                                        }
                                    } else {
                                        var95 = 2;
                                    }
                                    var94 = class594.field7542[var95 | 65408 & var67];
                                    if (~(this.field7276 & 7) == -1) {
                                        float var96 = this.field7275.field9203[2] * var77 + this.field7275.field9203[1] * var79 + this.field7275.field9203[0] * var78;
                                        float var97 = (!(var75 > 0.0F) ? this.field7275.field9173 : this.field7275.field9154) * var75 + this.field7275.field9143;
                                        int var98 = (16748565 & var94) >> 16;
                                        int var99 = 255 & var94 >> 8;
                                        int var100 = var94 & 255;
                                        int var101 = (int) ((float) var98 * var97);
                                        if (var101 >= 0) {
                                            if (var101 > 255) {
                                                var101 = 255;
                                            }
                                        } else {
                                            var101 = 0;
                                        }
                                        int var102 = (int) ((float) var99 * var97);
                                        int var103 = (int) ((float) var100 * var97);
                                        if (~var102 <= -1) {
                                            if (var102 > 255) {
                                                var102 = 255;
                                            }
                                        } else {
                                            var102 = 0;
                                        }
                                        if (~var103 > -1) {
                                            var103 = 0;
                                        } else if (var103 > 255) {
                                            var103 = 255;
                                        }
                                        var94 = var102 << 8 | var101 << 16 | var103;
                                    }
                                }
                                if (Stream.method2528()) {
                                    var8.method2518((float) var62);
                                    var8.method2518((float) (var68 + this.method2072((byte) 72, var62, var63)));
                                    var8.method2518((float) var63);
                                    var8.method2518((float) var62);
                                    var8.method2518((float) var63);
                                    if (this.field7257 != null) {
                                        var8.method2518((float) (var41 != null ? var41[var61] - 1 : 0));
                                    }
                                    if ((7 & this.field7276) != 0) {
                                        var8.method2518(var78);
                                        var8.method2518(var79);
                                        var8.method2518(var77);
                                    }
                                } else {
                                    var8.method2524((float) var62);
                                    var8.method2524((float) (this.method2072((byte) 64, var62, var63) + var68));
                                    var8.method2524((float) var63);
                                    var8.method2524((float) var62);
                                    var8.method2524((float) var63);
                                    if (this.field7257 != null) {
                                        var8.method2524((float) (var41 == null ? 0 : var41[var61] - 1));
                                    }
                                    if ((7 & this.field7276) != 0) {
                                        var8.method2524(var78);
                                        var8.method2524(var79);
                                        var8.method2524(var77);
                                    }
                                }
                                if (this.field7275.field9155 != 0) {
                                    var9.method2515(-16777216 | var94);
                                } else {
                                    var9.method2517(var94 | -16777216);
                                }
                                var93 = this.field7258++;
                                var60[var61] = (short) var93;
                                if (~var66 != 0) {
                                    var10[var93] = var35[var61];
                                }
                                var12.method2619(new class97(var60[var61]), var69, -1);
                            }
                            for (int var104 = 0; var58 > var104; ++var104) {
                                var13[var104].method2781(23076, var76, var93, var75, var74);
                            }
                            ++this.field7277;
                        }
                    }
                }
            }
            for (int var15 = 0; ~var15 > ~this.field7258; ++var15) {
                class500 var33 = var10[var15];
                if (var33 != null) {
                    var33.method2783(var15, (byte) -112);
                }
            }
            for (int var16 = 0; var16 < super.field4366; ++var16) {
                for (int var22 = 0; super.field4371 > var22; ++var22) {
                    short[] var23 = this.field7288[super.field4366 * var22 + var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (var25 < var23.length) {
                            int var26 = 65535 & var23[var25++];
                            int var27 = var23[var25++] & 65535;
                            int var28 = var23[var25++] & 65535;
                            class500 var29 = var10[var26];
                            class500 var30 = var10[var27];
                            class500 var31 = var10[var28];
                            class500 var32 = null;
                            if (var29 != null) {
                                var29.method2777(var16, var22, var24, 1);
                                var32 = var29;
                            }
                            if (var30 != null) {
                                var30.method2777(var16, var22, var24, 1);
                                if (var32 == null || var30.field4108 < var32.field4108) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method2777(var16, var22, var24, 1);
                                if (var32 == null || var32.field4108 > var31.field4108) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method2783(var26, (byte) -57);
                                }
                                if (var30 != null) {
                                    var32.method2783(var27, (byte) -56);
                                }
                                if (var31 != null) {
                                    var32.method2783(var28, (byte) -60);
                                }
                                var32.method2777(var16, var22, var24, 1);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method2519();
            var9.method2519();
            this.field7301 = this.field7275.method1162((byte) 31, false);
            this.field7301.method285(this.field7258 * 4, (byte) 105, 4, var6);
            this.field7302 = this.field7275.method1162((byte) 31, false);
            this.field7302.method285(this.field7258 * var5, (byte) 105, var5, var7);
            if (~(this.field7276 & 7) != -1) {
                if (this.field7257 != null) {
                    this.field7296 = this.field7275.method1175(-103, new class592[] { new class592(new class604[] { class604.field7665, class604.field7669, class604.field7668, class604.field7666 }), new class592(class604.field7667) });
                } else {
                    this.field7296 = this.field7275.method1175(124, new class592[] { new class592(new class604[] { class604.field7665, class604.field7669, class604.field7666 }), new class592(class604.field7667) });
                }
            } else if (this.field7257 != null) {
                this.field7296 = this.field7275.method1175(97, new class592[] { new class592(new class604[] { class604.field7665, class604.field7669, class604.field7668 }), new class592(class604.field7667) });
            } else {
                this.field7296 = this.field7275.method1175(-116, new class592[] { new class592(new class604[] { class604.field7665, class604.field7669 }), new class592(class604.field7667) });
            }
            int var17 = 0;
            for (int var18 = 0; ~var3.length < ~var18; ++var18) {
                if (~var3[var18].field6421 < -1) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field7295 = new class500[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; var17 > var20; ++var20) {
                class500 var21 = var3[var20];
                var19[var20] = var21.field4108;
                this.field7295[var20] = var21;
                var21.method2782(this.field7258, 4);
            }
            class747.method4058(this.field7295, var19, 11883);
            if (this.field7285 != null) {
                this.field7285.method2273(128);
            }
        }
        this.field7271 = null;
        this.field7270 = this.field7284 = null;
        this.field7294 = this.field7299 = this.field7297 = null;
        this.field7300 = null;
        this.field7272 = null;
        this.field7257 = null;
        this.field7303 = null;
        this.field7279 = null;
        this.field7265 = null;
    }
}
