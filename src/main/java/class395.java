import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class395 extends class282 {

    @OriginalMember(owner = "client!lp", name = "B", descriptor = "F")
    private float field5013 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!lp", name = "G", descriptor = "F")
    private float field5018 = -3.4028235E38F;

    @OriginalMember(owner = "client!lp", name = "P", descriptor = "Lfh;")
    private class653 field5027 = new class653();

    @OriginalMember(owner = "client!lp", name = "w", descriptor = "Lij;")
    public class424 field5008;

    @OriginalMember(owner = "client!lp", name = "W", descriptor = "I")
    private int field5034;

    @OriginalMember(owner = "client!lp", name = "V", descriptor = "I")
    private int field5033;

    @OriginalMember(owner = "client!lp", name = "hb", descriptor = "[[F")
    private float[][] field5045;

    @OriginalMember(owner = "client!lp", name = "N", descriptor = "[[B")
    private byte[][] field5025;

    @OriginalMember(owner = "client!lp", name = "r", descriptor = "[[[I")
    private int[][][] field5003;

    @OriginalMember(owner = "client!lp", name = "bb", descriptor = "[[B")
    private byte[][] field5039;

    @OriginalMember(owner = "client!lp", name = "y", descriptor = "[[[I")
    public int[][][] field5010;

    @OriginalMember(owner = "client!lp", name = "J", descriptor = "I")
    public int field5021;

    @OriginalMember(owner = "client!lp", name = "u", descriptor = "[[[I")
    public int[][][] field5006;

    @OriginalMember(owner = "client!lp", name = "gb", descriptor = "[[F")
    private float[][] field5044;

    @OriginalMember(owner = "client!lp", name = "C", descriptor = "[[[I")
    private int[][][] field5014;

    @OriginalMember(owner = "client!lp", name = "H", descriptor = "[[S")
    public short[][] field5019;

    @OriginalMember(owner = "client!lp", name = "cb", descriptor = "[[F")
    private float[][] field5040;

    @OriginalMember(owner = "client!lp", name = "Q", descriptor = "[[[I")
    public int[][][] field5028;

    @OriginalMember(owner = "client!lp", name = "O", descriptor = "[[[Lio;")
    private class440[][][] field5026;

    @OriginalMember(owner = "client!lp", name = "fb", descriptor = "Ltba;")
    private class165 field5043;

    @OriginalMember(owner = "client!lp", name = "I", descriptor = "Loo;")
    private class628 field5020;

    @OriginalMember(owner = "client!lp", name = "s", descriptor = "[S")
    public static short[] field5004 = new short[256];

    @OriginalMember(owner = "client!lp", name = "q", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!lp", name = "t", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!lp", name = "v", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!lp", name = "z", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!lp", name = "D", descriptor = "I")
    private int field5015;

    @OriginalMember(owner = "client!lp", name = "E", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!lp", name = "F", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!lp", name = "K", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!lp", name = "L", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!lp", name = "M", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!lp", name = "R", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!lp", name = "S", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!lp", name = "U", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!lp", name = "X", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!lp", name = "Y", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!lp", name = "Z", descriptor = "I")
    private int field5037;

    @OriginalMember(owner = "client!lp", name = "db", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!lp", name = "ib", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!lp", name = "kb", descriptor = "I")
    private int field5048;

    @OriginalMember(owner = "client!lp", name = "mb", descriptor = "I")
    private int field5050;

    @OriginalMember(owner = "client!lp", name = "ab", descriptor = "Lri;")
    public class114 field5038;

    @OriginalMember(owner = "client!lp", name = "T", descriptor = "Lnd;")
    public static class547 field5031;

    @OriginalMember(owner = "client!lp", name = "eb", descriptor = "Lia;")
    private class591 field5042;

    @OriginalMember(owner = "client!lp", name = "jb", descriptor = "Lia;")
    private class591 field5047;

    @OriginalMember(owner = "client!lp", name = "x", descriptor = "[Ls;")
    public static class282[] field5009;

    @OriginalMember(owner = "client!lp", name = "lb", descriptor = "[Lio;")
    private class440[] field5049;

    @OriginalMember(owner = "client!lp", name = "A", descriptor = "[[[I")
    private int[][][] field5012;

    @OriginalMember(owner = "client!lp", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 3)
    public final void method1684(class185 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5024;
        if (this.field5020 != null && arg0 != null) {
            int var7 = -(this.field5008.field5670 * arg2 >> 8) + arg1 >> this.field5008.field5637;
            int var8 = -(this.field5008.field5642 * arg2 >> 8) + arg3 >> this.field5008.field5637;
            this.field5020.method3520((byte) -97, arg0, var7, var8);
        }
    }

    @OriginalMember(owner = "client!lp", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 28)
    public final void method1685(class185 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5007;
        if (this.field5020 != null && arg0 != null) {
            int var7 = -(this.field5008.field5670 * arg2 >> 8) + arg1 >> this.field5008.field5637;
            int var8 = arg3 - (this.field5008.field5642 * arg2 >> 8) >> this.field5008.field5637;
            this.field5020.method3523(var8, arg0, -1, var7);
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)V", line = 48)
    public final void method1678(int arg0, int arg1) {
        ++field5023;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lvca;IBI)V", line = 56)
    private final void method2222(class283 arg0, int arg1, byte arg2, int arg3) {
        ++field5005;
        int[] var5 = this.field5028[arg3][arg1];
        int[] var6 = this.field5006[arg3][arg1];
        if (arg2 != -87) {
            this.method2224(-79, 22, (boolean[][]) null, 95, 34, 28, false, 15);
        }
        int var7 = var5.length;
        if (var7 > class344.field4346.length) {
            class489.field6952 = new int[var7];
            class344.field4346 = new int[var7];
        }
        for (int var8 = 0; ~var7 < ~var8; ++var8) {
            class344.field4346[var8] = var5[var8] >> this.field5008.field5637;
            class489.field6952[var8] = var6[var8] >> this.field5008.field5637;
        }
        int var9 = 0;
        while (~var7 < ~var9) {
            int var10 = class344.field4346[var9];
            int var11 = class489.field6952[var9++];
            int var12 = class344.field4346[var9];
            int var13 = class489.field6952[var9++];
            int var14 = class344.field4346[var9];
            int var15 = class489.field6952[var9++];
            if ((-var12 + var10) * (-var15 + var13) + -((var14 - var12) * (-var11 + var13)) > 0) {
                arg0.method1694(var11, var14, var10, var12, var13, (byte) 97, var15);
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "fa", descriptor = "(IILr;)Lr;", line = 117)
    public final class185 method1672(int arg0, int arg1, class185 arg2) {
        ++field5030;
        if (~(1 & this.field5025[arg0][arg1]) == -1) {
            return null;
        } else {
            int var4 = super.field3557 >> this.field5008.field5637;
            class283 var5 = (class283) arg2;
            class283 var6;
            if (var5 != null && var5.method1689(var4, var4, false)) {
                var6 = var5;
                var5.method1693(12440);
            } else {
                var6 = new class283(this.field5008, var4, var4);
            }
            var6.method1690(var4, var4, 0, (byte) -125, 0);
            this.method2222(var6, arg1, (byte) -87, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!lp", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 144)
    public final void method1674(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field5017;
        class153 var15 = this.field5008.field830;
        if (arg3 != null && this.field5014 == null) {
            this.field5014 = new int[super.field3561][super.field3555][];
        }
        if (arg5 != null && this.field5012 == null) {
            this.field5012 = new int[super.field3561][super.field3555][];
        }
        this.field5028[arg0][arg1] = arg2;
        this.field5006[arg0][arg1] = arg4;
        this.field5010[arg0][arg1] = arg6;
        this.field5003[arg0][arg1] = arg7;
        if (this.field5012 != null) {
            this.field5012[arg0][arg1] = arg5;
        }
        if (this.field5014 != null) {
            this.field5014[arg0][arg1] = arg3;
        }
        class440[] var16 = this.field5026[arg0][arg1] = new class440[arg6.length];
        for (int var17 = 0; arg6.length > var17; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if (~(32 & this.field5021) != -1 && var18 != -1 && var15.method1072(var18, true).field7456) {
                var18 = -1;
                var19 = 128;
            }
            long var20 = (long) (var19 << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) var18;
            class168 var22;
            for (var22 = this.field5043.method1160(var20, 123); var22 != null; var22 = this.field5043.method1162(119)) {
                class440 var23 = (class440) var22;
                if (var23.field5852 == var18 && (float) var19 == var23.field5848 && ~var23.field5857 == ~arg10 && var23.field5843 == arg11 && ~var23.field5844 == ~arg12) {
                    break;
                }
            }
            if (var22 != null) {
                var16[var17] = (class440) var22;
            } else {
                var16[var17] = new class440(this, var18, var19, arg10, arg11, arg12);
                this.field5043.method1153(var16[var17], var20, -1);
            }
        }
        if (arg13) {
            this.field5025[arg0][arg1] = (byte) class683.method3840(this.field5025[arg0][arg1], 1);
        }
        if (arg6.length > this.field5048) {
            this.field5048 = arg6.length;
        }
        this.field5050 += arg6.length;
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lij;IIII[[I[[II)V", line = 226)
    public class395(class424 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field5008 = arg0;
        this.field5034 = super.field3550 + -2;
        this.field5033 = 1 << this.field5034;
        this.field5045 = new float[super.field3561 + 1][super.field3555 + 1];
        this.field5025 = new byte[arg3][arg4];
        this.field5003 = new int[arg3][arg4][];
        this.field5039 = new byte[arg3 - -1][arg4 + 1];
        this.field5010 = new int[arg3][arg4][];
        this.field5021 = arg2;
        this.field5006 = new int[arg3][arg4][];
        this.field5044 = new float[super.field3561 + 1][super.field3555 + 1];
        this.field5014 = new int[arg3][arg4][];
        this.field5019 = new short[arg3 * arg4][];
        this.field5040 = new float[super.field3561 + 1][super.field3555 + 1];
        this.field5028 = new int[arg3][arg4][];
        this.field5026 = new class440[arg3][arg4][];
        for (int var9 = 0; super.field3555 >= var9; ++var9) {
            for (int var10 = 0; var10 <= super.field3561; ++var10) {
                int var11 = super.field3559[var10][var9];
                if (this.field5018 < (float) var11) {
                    this.field5018 = (float) var11;
                }
                if ((float) var11 < this.field5013) {
                    this.field5013 = (float) var11;
                }
                if (var10 > 0 && var9 > 0 && super.field3561 > var10 && ~var9 > ~super.field3555) {
                    int var12 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 - -1] - arg6[var10][var9 + -1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + (var12 * var12 - -(var13 * var13)))));
                    this.field5044[var10][var9] = (float) var12 * var14;
                    this.field5045[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field5040[var10][var9] = (float) var13 * var14;
                }
            }
        }
        ++this.field5018;
        --this.field5013;
        this.field5043 = new class165(128);
        if (~(16 & this.field5021) != -1) {
            this.field5020 = new class628(this.field5008, this);
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 297)
    public final void method1671(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field5035;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 != null ? new int[var18 * 3] : null;
        int[] var26 = arg5 == null ? null : new int[var18 * 3];
        int var27 = 0;
        for (int var28 = 0; ~var28 > ~var18; ++var28) {
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
        this.method1674(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(III[[ZZII)V", line = 384)
    public final void method1680(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        ++field5036;
        this.method2224(arg1, arg5, arg3, 26583, arg6, arg2, arg4, arg0);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 392)
    public final boolean method1675(class185 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5011;
        if (this.field5020 != null && arg0 != null) {
            int var7 = -(this.field5008.field5670 * arg2 >> 8) + arg1 >> this.field5008.field5637;
            int var8 = arg3 - (this.field5008.field5642 * arg2 >> 8) >> this.field5008.field5637;
            return this.field5020.method3524(arg0, 8, var7, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIIIII[[Z)V", line = 410)
    public final void method1688(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field5041;
        if (~this.field5050 < -1) {
            class497 var9 = this.field5008.method2428(2, this.field5037);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; var13 < 4; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method1369(-25053, true);
                if (var14 != null) {
                    Stream var15 = this.field5008.method2409((byte) 89, var14);
                    if (Stream.method3798()) {
                        for (int var16 = arg4; arg6 > var16; ++var16) {
                            int var17 = super.field3561 * var16 - -arg3;
                            for (int var18 = arg3; ~arg5 < ~var18; ++var18) {
                                if (arg7[var18 - arg3][-arg4 + var16]) {
                                    short[] var19 = this.field5019[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; var20 < var19.length; ++var20) {
                                            int var21 = var19[var20] & 65535;
                                            var15.method3785(var21);
                                            ++var10;
                                            if (var11 > var21) {
                                                var11 = var21;
                                            }
                                            if (var21 > var12) {
                                                var12 = var21;
                                            }
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; ~var22 > ~arg6; ++var22) {
                            int var25 = super.field3561 * var22 + arg3;
                            for (int var26 = arg3; ~arg5 < ~var26; ++var26) {
                                if (arg7[var26 - arg3][-arg4 + var22]) {
                                    short[] var27 = this.field5019[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; var28 < var27.length; ++var28) {
                                            int var29 = 65535 & var27[var28];
                                            if (~var29 < ~var12) {
                                                var12 = var29;
                                            }
                                            ++var10;
                                            if (var29 < var11) {
                                                var11 = var29;
                                            }
                                            var15.method3795(var29);
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method3793();
                    if (var9.method1368(true)) {
                        break;
                    }
                }
            }
            if (~var10 < -1) {
                this.field5008.method2441((byte) 75);
                this.field5008.method2367(false, -32);
                this.field5008.method2438(true, false);
                this.field5008.method2373(14, false);
                this.field5008.method2385(114, false);
                this.field5008.method2440(0, (byte) -128);
                this.field5008.method2410(false, false, (byte) 87, -2);
                this.field5008.method2396(22357, (class572) null);
                class477 var23 = this.field5008.method2372(true);
                float[] var24 = this.field5008.method2369(false);
                var24[0] = (float) arg2 / ((float) super.field3557 * 128.0F * (float) this.field5008.field5445);
                var24[6] = 0.0F;
                var24[11] = 0.0F;
                var24[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field5008.field5494;
                var24[15] = 1.0F;
                var24[7] = 0.0F;
                var24[1] = 0.0F;
                var24[8] = 0.0F;
                var24[3] = 0.0F;
                var24[5] = (float) arg2 / ((float) super.field3557 * 128.0F * (float) this.field5008.field5494);
                var24[4] = 0.0F;
                var24[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field5008.field5445) + -1.0F;
                var24[9] = 0.0F;
                var24[2] = 0.0F;
                var24[14] = -this.field5013 / (-this.field5013 + this.field5018);
                var24[10] = 1.0F / (this.field5018 - this.field5013);
                var23.method2733(0.0F, 0.0F, 0.0F, 0.0F, 29945, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F);
                this.field5008.method2426(2);
                this.field5008.method2430(1);
                if ((this.field5021 & 7) != 0) {
                    this.field5008.method2438(true, true);
                    this.field5008.method2002(1);
                } else {
                    this.field5008.method2438(true, false);
                }
                this.field5008.method1982(false, -114);
                this.field5008.method2041(0, this.field5047, (byte) 73);
                this.field5008.method2041(1, this.field5042, (byte) 73);
                this.field5008.method2033(17069, this.field5038);
                this.field5008.method2030(var11, var12 + 1 + -var11, class662.field9281, var9, false, var10 / 3, 0);
                this.field5008.method1982(true, -86);
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V", line = 609)
    public static void method2223(byte arg0) {
        field5004 = null;
        field5009 = null;
        field5031 = null;
        if (arg0 <= 73) {
            field5031 = null;
        }
    }

    @OriginalMember(owner = "client!lp", name = "YA", descriptor = "()V", line = 628)
    public final void method1673() {
        ++field5002;
        if (~this.field5050 >= -1) {
            this.field5020 = null;
        } else {
            byte[][] var1 = new byte[super.field3561 - -1][super.field3555 + 1];
            for (int var2 = 1; super.field3561 > var2; ++var2) {
                for (int var107 = 1; ~super.field3555 < ~var107; ++var107) {
                    var1[var2][var107] = (byte) ((this.field5039[var2][var107 + -1] >> 2) + (this.field5039[var2 + 1][var107] >> 3) + (this.field5039[var2 + -1][var107] >> 2) + (this.field5039[var2][var107 + 1] >> 3) + (this.field5039[var2][var107] >> 1));
                }
            }
            class440[] var3 = new class440[this.field5043.method1159((byte) -106)];
            this.field5043.method1152(var3, 32260);
            for (int var4 = 0; var4 < var3.length; ++var4) {
                var3[var4].method2501(this.field5050, (byte) -5);
            }
            int var5 = 20;
            if (this.field5012 != null) {
                var5 += 4;
            }
            if (~(this.field5021 & 7) != -1) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field5008.field5554.method3781(this.field5050 * 4, false);
            NativeHeapBuffer var7 = this.field5008.field5554.method3781(this.field5050 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class440[] var10 = new class440[this.field5050];
            int var11 = class113.method890(this.field5050 / 4, 2094889633);
            if (~var11 > -2) {
                var11 = 1;
            }
            class165 var12 = new class165(var11);
            class440[] var13 = new class440[this.field5048];
            for (int var14 = 0; ~super.field3561 < ~var14; ++var14) {
                for (int var34 = 0; var34 < super.field3555; ++var34) {
                    if (this.field5010[var14][var34] != null) {
                        class440[] var35 = this.field5026[var14][var34];
                        int[] var36 = this.field5028[var14][var34];
                        int[] var37 = this.field5006[var14][var34];
                        int[] var38 = this.field5003[var14][var34];
                        int[] var39 = this.field5010[var14][var34];
                        int[] var40 = this.field5014 != null ? this.field5014[var14][var34] : null;
                        if (var38 == null) {
                            var38 = var39;
                        }
                        int[] var41 = this.field5012 == null ? null : this.field5012[var14][var34];
                        float var42 = this.field5044[var14][var34];
                        float var43 = this.field5045[var14][var34];
                        float var44 = this.field5040[var14][var34];
                        float var45 = this.field5044[var14][var34 + 1];
                        float var46 = this.field5045[var14][var34 + 1];
                        float var47 = this.field5040[var14][var34 + 1];
                        float var48 = this.field5044[var14 + 1][var34 + 1];
                        float var49 = this.field5045[var14 + 1][var34 + 1];
                        float var50 = this.field5040[var14 + 1][var34 - -1];
                        float var51 = this.field5044[var14 - -1][var34];
                        float var52 = this.field5045[var14 + 1][var34];
                        float var53 = this.field5040[var14 + 1][var34];
                        int var54 = 255 & var1[var14][var34];
                        int var55 = 255 & var1[var14][var34 + 1];
                        int var56 = 255 & var1[var14 + 1][var34 + 1];
                        int var57 = var1[var14 + 1][var34] & 255;
                        int var58 = 0;
                        label358: for (int var59 = 0; ~var39.length < ~var59; ++var59) {
                            class440 var105 = var35[var59];
                            for (int var106 = 0; var58 > var106; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label358;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field5019[super.field3561 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; ~var39.length < ~var61; ++var61) {
                            int var62 = (var14 << super.field3550) - -var36[var61];
                            int var63 = (var34 << super.field3550) - -var37[var61];
                            int var64 = var62 >> this.field5034;
                            int var65 = var63 >> this.field5034;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 == null ? 0 : var40[var61];
                            long var69 = (long) var65 | (long) (var64 << 16) | (long) var67 << 48 | (long) var66 << 32;
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75 = 1.0F;
                            int var76;
                            float var77;
                            float var78;
                            float var79;
                            if (~var71 == -1 && ~var72 == -1) {
                                var76 = var73 - var54;
                                var77 = var42;
                                var78 = var44;
                                var79 = var43;
                            } else if (var71 == 0 && ~super.field3557 == ~var72) {
                                var76 = var73 - var55;
                                var77 = var45;
                                var79 = var46;
                                var78 = var47;
                            } else if (~super.field3557 == ~var71 && ~super.field3557 == ~var72) {
                                var79 = var49;
                                var77 = var48;
                                var76 = var73 - var56;
                                var78 = var50;
                            } else if (~super.field3557 == ~var71 && ~var72 == -1) {
                                var77 = var51;
                                var79 = var52;
                                var78 = var53;
                                var76 = var73 - var57;
                            } else {
                                float var80 = (float) var71 / (float) super.field3557;
                                float var81 = (float) var72 / (float) super.field3557;
                                float var82 = (-var42 + var51) * var80 + var42;
                                float var83 = (-var43 + var52) * var80 + var43;
                                float var84 = (-var44 + var53) * var80 + var44;
                                float var85 = (var48 - var45) * var80 + var45;
                                float var86 = (var49 - var46) * var80 + var46;
                                var79 = (var86 - var83) * var81 + var83;
                                float var87 = (-var47 + var50) * var80 + var47;
                                var77 = (-var82 + var85) * var81 + var82;
                                var78 = (-var84 + var87) * var81 + var84;
                                int var88 = var54 - -((-var54 + var57) * var71 >> super.field3550);
                                int var89 = ((-var55 + var56) * var71 >> super.field3550) + var55;
                                var76 = var73 - (((var89 - var88) * var72 >> super.field3550) + var88);
                            }
                            if (~var66 != 0) {
                                int var90 = (var66 & 127) * var76 >> 7;
                                if (var90 < 2) {
                                    var90 = 2;
                                } else if (~var90 < -127) {
                                    var90 = 126;
                                }
                                var74 = class267.field3365[65408 & var66 | var90];
                                if (~(this.field5021 & 7) == -1) {
                                    float var91 = this.field5008.field5596[2] * var78 + this.field5008.field5596[1] * var79 + this.field5008.field5596[0] * var77;
                                    var75 = var91 * (var91 > 0.0F ? this.field5008.field5610 : this.field5008.field5669) + this.field5008.field5650;
                                }
                            }
                            class168 var92 = null;
                            if (~(this.field5033 + -1 & var62) == -1 && (this.field5033 + -1 & var63) == 0) {
                                var92 = var12.method1160(var69, 127);
                            }
                            int var103;
                            if (var92 == null) {
                                int var94;
                                if (~var66 != ~var67) {
                                    int var93 = (127 & var67) * var76 >> 7;
                                    if (var93 >= 2) {
                                        if (~var93 < -127) {
                                            var93 = 126;
                                        }
                                    } else {
                                        var93 = 2;
                                    }
                                    var94 = class267.field3365[var67 & 65408 | var93];
                                    if ((7 & this.field5021) == 0) {
                                        float var95 = this.field5008.field5596[2] * var78 + this.field5008.field5596[1] * var79 + this.field5008.field5596[0] * var77;
                                        float var96 = (!(var75 > 0.0F) ? this.field5008.field5669 : this.field5008.field5610) * var75 + this.field5008.field5650;
                                        int var97 = (16770364 & var94) >> 16;
                                        int var98 = var94 >> 8 & 255;
                                        int var99 = 255 & var94;
                                        int var100 = (int) ((float) var97 * var96);
                                        int var101 = (int) ((float) var98 * var96);
                                        if (~var100 <= -1) {
                                            if (~var100 < -256) {
                                                var100 = 255;
                                            }
                                        } else {
                                            var100 = 0;
                                        }
                                        if (var101 < 0) {
                                            var101 = 0;
                                        } else if (~var101 < -256) {
                                            var101 = 255;
                                        }
                                        int var102 = (int) ((float) var99 * var96);
                                        if (var102 >= 0) {
                                            if (var102 > 255) {
                                                var102 = 255;
                                            }
                                        } else {
                                            var102 = 0;
                                        }
                                        var94 = var101 << 8 | var100 << 16 | var102;
                                    }
                                } else {
                                    var94 = var74;
                                }
                                if (!Stream.method3798()) {
                                    var8.method3794((float) var62);
                                    var8.method3794((float) (var68 + this.method1676(var62, true, var63)));
                                    var8.method3794((float) var63);
                                    var8.method3794((float) var62);
                                    var8.method3794((float) var63);
                                    if (this.field5012 != null) {
                                        var8.method3794((float) (var41 == null ? 0 : var41[var61] + -1));
                                    }
                                    if (~(this.field5021 & 7) != -1) {
                                        var8.method3794(var77);
                                        var8.method3794(var79);
                                        var8.method3794(var78);
                                    }
                                } else {
                                    var8.method3796((float) var62);
                                    var8.method3796((float) (this.method1676(var62, true, var63) + var68));
                                    var8.method3796((float) var63);
                                    var8.method3796((float) var62);
                                    var8.method3796((float) var63);
                                    if (this.field5012 != null) {
                                        var8.method3796((float) (var41 == null ? 0 : var41[var61] + -1));
                                    }
                                    if ((7 & this.field5021) != 0) {
                                        var8.method3796(var77);
                                        var8.method3796(var79);
                                        var8.method3796(var78);
                                    }
                                }
                                if (~this.field5008.field5682 == -1) {
                                    var9.method3789(-16777216 | var94);
                                } else {
                                    var9.method3784(-16777216 | var94);
                                }
                                var103 = this.field5015++;
                                var60[var61] = (short) var103;
                                if (~var66 != 0) {
                                    var10[var103] = var35[var61];
                                }
                                var12.method1153(new class273(var60[var61]), var69, -1);
                            } else {
                                var60[var61] = ((class273) var92).field3422;
                                var103 = 65535 & var60[var61];
                                if (var66 != -1 && ~var35[var61].field2333 > ~var10[var103].field2333) {
                                    var10[var103] = var35[var61];
                                }
                            }
                            for (int var104 = 0; var58 > var104; ++var104) {
                                var13[var104].method2495(var76, var74, var75, var103, -46);
                            }
                            ++this.field5037;
                        }
                    }
                }
            }
            for (int var15 = 0; this.field5015 > var15; ++var15) {
                class440 var33 = var10[var15];
                if (var33 != null) {
                    var33.method2503(var15, 4);
                }
            }
            for (int var16 = 0; ~var16 > ~super.field3561; ++var16) {
                for (int var22 = 0; super.field3555 > var22; ++var22) {
                    short[] var23 = this.field5019[super.field3561 * var22 + var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (var23.length > var25) {
                            int var26 = 65535 & var23[var25++];
                            int var27 = 65535 & var23[var25++];
                            int var28 = 65535 & var23[var25++];
                            class440 var29 = var10[var26];
                            class440 var30 = var10[var27];
                            class440 var31 = var10[var28];
                            class440 var32 = null;
                            if (var29 != null) {
                                var29.method2500(var16, (byte) -106, var22, var24);
                                var32 = var29;
                            }
                            if (var30 != null) {
                                var30.method2500(var16, (byte) -83, var22, var24);
                                if (var32 == null || ~var30.field2333 > ~var32.field2333) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method2500(var16, (byte) -110, var22, var24);
                                if (var32 == null || ~var31.field2333 > ~var32.field2333) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method2503(var26, 4);
                                }
                                if (var30 != null) {
                                    var32.method2503(var27, 4);
                                }
                                if (var31 != null) {
                                    var32.method2503(var28, 4);
                                }
                                var32.method2500(var16, (byte) -128, var22, var24);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method3793();
            var9.method3793();
            this.field5042 = this.field5008.method2042(false, false);
            this.field5042.method298(4, 124, this.field5015 * 4, var6);
            this.field5047 = this.field5008.method2042(false, false);
            this.field5047.method298(var5, -119, this.field5015 * var5, var7);
            if ((this.field5021 & 7) != 0) {
                if (this.field5012 == null) {
                    this.field5038 = this.field5008.method2001(16018, new class655[] { new class655(new class307[] { class307.field4043, class307.field4051, class307.field4048 }), new class655(class307.field4049) });
                } else {
                    this.field5038 = this.field5008.method2001(16018, new class655[] { new class655(new class307[] { class307.field4043, class307.field4051, class307.field4050, class307.field4048 }), new class655(class307.field4049) });
                }
            } else if (this.field5012 != null) {
                this.field5038 = this.field5008.method2001(16018, new class655[] { new class655(new class307[] { class307.field4043, class307.field4051, class307.field4050 }), new class655(class307.field4049) });
            } else {
                this.field5038 = this.field5008.method2001(16018, new class655[] { new class655(new class307[] { class307.field4043, class307.field4051 }), new class655(class307.field4049) });
            }
            int var17 = 0;
            for (int var18 = 0; var18 < var3.length; ++var18) {
                if (~var3[var18].field5845 < -1) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field5049 = new class440[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; ~var17 < ~var20; ++var20) {
                class440 var21 = var3[var20];
                var19[var20] = var21.field2333;
                this.field5049[var20] = var21;
                var21.method2499(4, this.field5015);
            }
            class179.method1222(var19, (byte) -15, this.field5049);
            if (this.field5020 != null) {
                this.field5020.method3522(128);
            }
        }
        this.field5043 = null;
        this.field5044 = this.field5045 = this.field5040 = null;
        this.field5039 = null;
        this.field5026 = null;
        this.field5003 = null;
        this.field5028 = this.field5006 = null;
        this.field5014 = null;
        this.field5010 = null;
        this.field5012 = null;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(III[[ZZI)V", line = 1235)
    public final void method1681(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field5022;
        this.method2224(arg1, -1, arg3, 26583, arg5, arg2, arg4, arg0);
    }

    @OriginalMember(owner = "client!lp", name = "ka", descriptor = "(III)V", line = 1246)
    public final void method1670(int arg0, int arg1, int arg2) {
        if (arg2 > (this.field5039[arg0][arg1] & 255)) {
            this.field5039[arg0][arg1] = (byte) arg2;
        }
        ++field5032;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Llaa;[I)V", line = 1260)
    public final void method1687(class123 arg0, int[] arg1) {
        ++field5016;
        this.field5027.method3671(new class506(this.field5008, this, arg0, arg1), false);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(II[[ZIIIZI)V", line = 1269)
    private final void method2224(int arg0, int arg1, boolean[][] arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        ++field5046;
        if (arg3 != 26583) {
            this.field5010 = null;
        }
        if (this.field5049 != null) {
            int var9 = arg5 + 1 + arg5;
            int var10 = var9 * var9;
            if (~class270.field3403.length > ~var10) {
                class270.field3403 = new int[var10];
            }
            int var11 = -arg5 + arg7;
            int var12 = var11;
            if (var11 < 0) {
                var11 = 0;
            }
            int var13 = -arg5 + arg0;
            int var14 = var13;
            if (var13 < 0) {
                var13 = 0;
            }
            int var15 = arg5 + arg7;
            if (~(super.field3561 + -1) > ~var15) {
                var15 = super.field3561 + -1;
            }
            int var16 = arg0 - -arg5;
            class133.field1925 = 0;
            if (var16 > super.field3555 + -1) {
                var16 = super.field3555 + -1;
            }
            for (int var17 = var11; ~var17 >= ~var15; ++var17) {
                boolean[] var24 = arg2[-var12 + var17];
                for (int var25 = var13; ~var16 <= ~var25; ++var25) {
                    if (var24[-var14 + var25]) {
                        class270.field3403[class133.field1925++] = super.field3561 * var25 - -var17;
                    }
                }
            }
            if (arg1 == -1) {
                this.field5008.method2390(9406);
            } else {
                this.field5008.method2412((float) arg1, (byte) 82);
                this.field5008.method2433(arg3 + -38801);
            }
            this.field5008.method2400(0);
            this.field5008.method2438(true, ~(this.field5021 & 7) != -1);
            this.field5008.method2410(false, false, (byte) 87, -1);
            this.field5008.method2041(0, this.field5047, (byte) 73);
            for (int var18 = 0; this.field5049.length > var18; ++var18) {
                this.field5049[var18].method2496((byte) -119, class133.field1925, class270.field3403);
            }
            class477 var19 = this.field5008.method2372(true);
            var19.method596(0, -1, 0);
            this.field5008.method2430(1);
            if (!this.field5027.method3667((byte) -45)) {
                int var20 = this.field5008.field5644;
                int var21 = this.field5008.field5599;
                this.field5008.method457(0, var21, this.field5008.field5659);
                this.field5008.method2438(true, false);
                this.field5008.method2385(-122, false);
                this.field5008.method2440(128, (byte) -71);
                this.field5008.method2410(false, false, (byte) 87, -2);
                this.field5008.method2396(22357, this.field5008.field5648);
                this.field5008.method2397(class405.field5120, class476.field6418, (byte) -125);
                this.field5008.method2394(class21.field383, (byte) 84, 0);
                this.field5008.method2422(class479.field6523, 0, (byte) -10);
                for (class168 var22 = this.field5027.method3672(-1); var22 != null; var22 = this.field5027.method3662(-1)) {
                    class506 var23 = (class506) var22;
                    var23.method2954(arg7, arg0, 12212, arg5, arg2);
                }
                this.field5008.method2394(class447.field5937, (byte) 76, 0);
                this.field5008.method2422(class447.field5937, 0, (byte) -10);
                this.field5008.method2396(22357, (class572) null);
                this.field5008.method457(var20, var21, this.field5008.field5659);
            }
            if (this.field5020 != null) {
                this.field5008.method2041(0, this.field5047, (byte) 73);
                this.field5008.method2041(1, this.field5042, (byte) 73);
                this.field5008.method2033(17069, this.field5038);
                this.field5020.method3519(arg6, arg7, arg5, arg2, -54, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IB)V", line = 1418)
    public static final void method2225(int arg0, byte arg1) {
        ++field5029;
        class37 var2 = class636.method3571(3, arg0, -32);
        if (arg1 >= 12) {
            var2.method230(126);
        }
    }
}
