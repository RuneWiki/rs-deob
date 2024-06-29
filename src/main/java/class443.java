import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class443 extends class339 {

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "F")
    private float field6297 = -3.4028235E38F;

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "F")
    private float field6320 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!cj", name = "R", descriptor = "Lmr;")
    private class611 field6326 = new class611();

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "I")
    private int field6329 = this.field4674 + -2;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "Lch;")
    public class38 field6304;

    @OriginalMember(owner = "client!cj", name = "Y", descriptor = "[[[Lmv;")
    private class43[][][] field6333;

    @OriginalMember(owner = "client!cj", name = "kb", descriptor = "[[B")
    private byte[][] field6345;

    @OriginalMember(owner = "client!cj", name = "eb", descriptor = "[[F")
    private float[][] field6339;

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "[[[I")
    private int[][][] field6308;

    @OriginalMember(owner = "client!cj", name = "G", descriptor = "I")
    private int field6315;

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "[[S")
    public short[][] field6306;

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "[[[I")
    private int[][][] field6307;

    @OriginalMember(owner = "client!cj", name = "jb", descriptor = "[[F")
    private float[][] field6344;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "[[[I")
    public int[][][] field6298;

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "[[[I")
    public int[][][] field6314;

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
    public int field6313;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "[[[I")
    public int[][][] field6296;

    @OriginalMember(owner = "client!cj", name = "db", descriptor = "[[F")
    private float[][] field6338;

    @OriginalMember(owner = "client!cj", name = "W", descriptor = "[[B")
    private byte[][] field6331;

    @OriginalMember(owner = "client!cj", name = "hb", descriptor = "Lqp;")
    private class715 field6342;

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "Llba;")
    private class90 field6310;

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "Lgr;")
    public static class530 field6323 = new class530(48, 7);

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
    public static int field6299;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
    private int field6301;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "I")
    public static int field6303;

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "I")
    public static int field6305;

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "I")
    public static int field6309;

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
    public static int field6312;

    @OriginalMember(owner = "client!cj", name = "H", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "I")
    public static int field6317;

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "I")
    public static int field6321;

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "I")
    public static int field6322;

    @OriginalMember(owner = "client!cj", name = "P", descriptor = "I")
    public static int field6324;

    @OriginalMember(owner = "client!cj", name = "Q", descriptor = "I")
    public static int field6325;

    @OriginalMember(owner = "client!cj", name = "S", descriptor = "I")
    public static int field6327;

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "I")
    public static int field6328;

    @OriginalMember(owner = "client!cj", name = "V", descriptor = "I")
    private int field6330;

    @OriginalMember(owner = "client!cj", name = "X", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!cj", name = "fb", descriptor = "I")
    private int field6340;

    @OriginalMember(owner = "client!cj", name = "gb", descriptor = "I")
    private int field6341;

    @OriginalMember(owner = "client!cj", name = "ab", descriptor = "Lfg;")
    private class436 field6335;

    @OriginalMember(owner = "client!cj", name = "ib", descriptor = "Lfg;")
    private class436 field6343;

    @OriginalMember(owner = "client!cj", name = "bb", descriptor = "Leu;")
    public class448 field6336;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cj", name = "lb", descriptor = "Ljava/lang/Class;")
    public static Class field6346;

    @OriginalMember(owner = "client!cj", name = "cb", descriptor = "[Lmv;")
    private class43[] field6337;

    @OriginalMember(owner = "client!cj", name = "Z", descriptor = "[[[I")
    private int[][][] field6334;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method38(class704 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6303;
        if (this.field6310 != null && arg0 != null) {
            int var7 = -(this.field6304.field633 * arg2 >> 8) + arg1 >> this.field6304.field588;
            int var8 = -(this.field6304.field539 * arg2 >> 8) + arg3 >> this.field6304.field588;
            return this.field6310.method705(var7, -128, var8, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cj", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method51(class704 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6332;
        if (this.field6310 != null && arg0 != null) {
            int var7 = arg1 - (this.field6304.field633 * arg2 >> 8) >> this.field6304.field588;
            int var8 = -(this.field6304.field539 * arg2 >> 8) + arg3 >> this.field6304.field588;
            this.field6310.method697((byte) 35, arg0, var8, var7);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)V")
    public final void method33(int arg0, int arg1) {
        ++field6299;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BI)Z")
    public static final boolean method2703(byte arg0, int arg1) {
        ++field6317;
        int var2 = 255 & arg0;
        if (var2 == 0) {
            return false;
        } else if (~var2 <= -129 && ~var2 > -161 && class93.field1328[var2 + -128] == 0) {
            return false;
        } else {
            int var3 = -61 / ((35 - arg1) / 63);
            return true;
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)Luea;")
    public static final class241 method2704(int arg0) {
        ++field6309;
        if (class664.field9495 != null && class372.field5400 != null) {
            if (arg0 != 1) {
                field6323 = null;
            }
            class372.field5400.method3457(3, class664.field9495);
            class241 var1 = (class241) class372.field5400.method3454(125);
            if (var1 == null) {
                return null;
            } else {
                class463 var2 = class664.field9482.method2687(var1.field3562, arg0 + 35);
                return var2 != null && var2.field6588 && var2.method2811(class664.field9484, (byte) 92) ? var1 : class574.method3410(arg0 + -14894);
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III[[ZZII)V")
    public final void method34(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.method2707(arg0, arg1, arg4, arg2, arg3, arg5, 0, arg6);
        ++field6321;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method42(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field6312;
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
        for (int var28 = 0; ~var28 > ~var18; ++var28) {
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
        this.method39(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!cj", name = "ka", descriptor = "(III)V")
    public final void method41(int arg0, int arg1, int arg2) {
        if (arg2 > (this.field6345[arg0][arg1] & 255)) {
            this.field6345[arg0][arg1] = (byte) arg2;
        }
        ++field6324;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIILhm;)V")
    private final void method2705(int arg0, int arg1, int arg2, class416 arg3) {
        ++field6327;
        int[] var5 = this.field6296[arg1][arg2];
        if (arg0 == -22908) {
            int[] var6 = this.field6314[arg1][arg2];
            int var7 = var5.length;
            if (~var7 < ~class312.field4230.length) {
                class569.field8213 = new int[var7];
                class312.field4230 = new int[var7];
            }
            for (int var8 = 0; var8 < var7; ++var8) {
                class312.field4230[var8] = var5[var8] >> this.field6304.field588;
                class569.field8213[var8] = var6[var8] >> this.field6304.field588;
            }
            int var9 = 0;
            while (var7 > var9) {
                int var10 = class312.field4230[var9];
                int var11 = class569.field8213[var9++];
                int var12 = class312.field4230[var9];
                int var13 = class569.field8213[var9++];
                int var14 = class312.field4230[var9];
                int var15 = class569.field8213[var9++];
                if ((var13 - var15) * (-var12 + var10) - (-var11 + var13) * (-var12 + var14) > 0) {
                    arg3.method2512(var10, var12, var11, (byte) 83, var13, var15, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method2706(String arg0, boolean arg1) {
        ++field6328;
        if (!arg1) {
            return -33;
        } else if (arg0 == null) {
            return -1;
        } else {
            for (int var2 = 0; ~var2 > ~class386.field5583; ++var2) {
                if (arg0.equalsIgnoreCase(class196.field2860[var2])) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!cj", name = "fa", descriptor = "(IILr;)Lr;")
    public final class704 method53(int arg0, int arg1, class704 arg2) {
        ++field6316;
        if (~(this.field6331[arg0][arg1] & 1) == -1) {
            return null;
        } else {
            int var4 = super.field4675 >> this.field6304.field588;
            class416 var5 = (class416) arg2;
            class416 var6;
            if (var5 != null && var5.method2510(var4, var4, 0)) {
                var6 = var5;
                var5.method2509((byte) 23);
            } else {
                var6 = new class416(this.field6304, var4, var4);
            }
            var6.method2513(var4, 0, var4, 0, 32428);
            this.method2705(-22908, arg0, arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lch;IIII[[I[[II)V")
    public class443(class38 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field6304 = arg0;
        this.field6333 = new class43[arg3][arg4][];
        this.field6345 = new byte[arg3 + 1][arg4 - -1];
        this.field6339 = new float[super.field4679 + 1][super.field4672 - -1];
        this.field6308 = new int[arg3][arg4][];
        this.field6315 = 1 << this.field6329;
        this.field6306 = new short[arg3 * arg4][];
        this.field6307 = new int[arg3][arg4][];
        this.field6344 = new float[super.field4679 + 1][super.field4672 + 1];
        this.field6298 = new int[arg3][arg4][];
        this.field6314 = new int[arg3][arg4][];
        this.field6313 = arg2;
        this.field6296 = new int[arg3][arg4][];
        this.field6338 = new float[super.field4679 - -1][super.field4672 + 1];
        this.field6331 = new byte[arg3][arg4];
        for (int var9 = 0; ~var9 >= ~super.field4672; ++var9) {
            for (int var10 = 0; var10 <= super.field4679; ++var10) {
                int var11 = super.field4680[var10][var9];
                if ((float) var11 > this.field6297) {
                    this.field6297 = (float) var11;
                }
                if (this.field6320 > (float) var11) {
                    this.field6320 = (float) var11;
                }
                if (var10 > 0 && ~var9 < -1 && ~var10 > ~super.field4679 && super.field4672 > var9) {
                    int var12 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 + 1] + -arg6[var10][var9 - 1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + (var12 * var12 - -(var13 * var13)))));
                    this.field6339[var10][var9] = (float) var12 * var14;
                    this.field6338[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field6344[var10][var9] = (float) var13 * var14;
                }
            }
        }
        --this.field6320;
        ++this.field6297;
        this.field6342 = new class715(128);
        if (~(this.field6313 & 16) != -1) {
            this.field6310 = new class90(this.field6304, this);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIZI[[ZIII)V")
    private final void method2707(int arg0, int arg1, boolean arg2, int arg3, boolean[][] arg4, int arg5, int arg6, int arg7) {
        ++field6319;
        if (arg6 != 0) {
            this.method51((class704) null, -38, 17, -9, 116, false);
        }
        if (this.field6337 != null) {
            int var9 = arg3 + arg3 + 1;
            int var10 = var9 * var9;
            if (class346.field4946.length < var10) {
                class346.field4946 = new int[var10];
            }
            int var11 = -arg3 + arg0;
            int var12 = var11;
            if (var11 < 0) {
                var11 = 0;
            }
            int var13 = -arg3 + arg1;
            int var14 = var13;
            if (~var13 > -1) {
                var13 = 0;
            }
            int var15 = arg0 - -arg3;
            if (super.field4679 + -1 < var15) {
                var15 = super.field4679 + -1;
            }
            int var16 = arg1 + arg3;
            if (super.field4672 - 1 < var16) {
                var16 = super.field4672 - 1;
            }
            class43.field717 = 0;
            for (int var17 = var11; ~var15 <= ~var17; ++var17) {
                boolean[] var24 = arg4[-var12 + var17];
                for (int var25 = var13; ~var25 >= ~var16; ++var25) {
                    if (var24[var25 - var14]) {
                        class346.field4946[class43.field717++] = super.field4679 * var25 + var17;
                    }
                }
            }
            if (~arg5 != 0) {
                this.field6304.method312((byte) 30, (float) arg5);
                this.field6304.method243(106);
            } else {
                this.field6304.method248(arg6 ^ 22301);
            }
            this.field6304.method289(false);
            this.field6304.method299(true, (this.field6313 & 7) != 0);
            this.field6304.method223(false, false, false, -1);
            this.field6304.method405(this.field6343, 0, (byte) 11);
            for (int var18 = 0; ~var18 > ~this.field6337.length; ++var18) {
                this.field6337[var18].method436(class346.field4946, class43.field717, 0);
            }
            class417 var19 = this.field6304.method345(0);
            var19.method845(0, -1, 0);
            this.field6304.method384((byte) 19);
            if (!this.field6326.method3555(127)) {
                int var20 = this.field6304.field575;
                int var21 = this.field6304.field621;
                this.field6304.method388(0, var21, this.field6304.field601);
                this.field6304.method299(true, false);
                this.field6304.method308(0, false);
                this.field6304.method355(128, (byte) -116);
                this.field6304.method223(false, false, false, -2);
                this.field6304.method264(this.field6304.field547, -2);
                this.field6304.method386((byte) -1, class567.field8198, class281.field3934);
                this.field6304.method230(class231.field3462, 0, 45);
                this.field6304.method242((byte) -118, class272.field3857, 0);
                for (class430 var22 = this.field6326.method3565(126); var22 != null; var22 = this.field6326.method3561((byte) 75)) {
                    class5 var23 = (class5) var22;
                    var23.method22(arg0, arg1, 0, arg3, arg4);
                }
                this.field6304.method230(class234.field3509, 0, 87);
                this.field6304.method242((byte) -118, class234.field3509, 0);
                this.field6304.method264((class101) null, -2);
                this.field6304.method388(var20, var21, this.field6304.field601);
            }
            if (this.field6310 != null) {
                this.field6304.method405(this.field6343, 0, (byte) 11);
                this.field6304.method405(this.field6335, 1, (byte) 11);
                this.field6304.method265(this.field6336, (byte) -100);
                this.field6310.method699(arg4, arg0, arg3, (byte) -125, arg1, arg2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V")
    public static final void method2708(int arg0) {
        if (arg0 != -381264440) {
            field6323 = null;
        }
        if (class369.field5392 != 3) {
            if (~class369.field5392 == -8) {
                class79.method649(-19704, 8);
            } else if (~class369.field5392 == -11) {
                class79.method649(arg0 + 381244736, 11);
            }
        } else {
            class79.method649(-19704, 4);
        }
        ++field6325;
    }

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method39(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field6302;
        if (arg3 != null && this.field6308 == null) {
            this.field6308 = new int[super.field4679][super.field4672][];
        }
        if (arg5 != null && this.field6334 == null) {
            this.field6334 = new int[super.field4679][super.field4672][];
        }
        class267 var15 = this.field6304.field7881;
        this.field6296[arg0][arg1] = arg2;
        this.field6314[arg0][arg1] = arg4;
        this.field6298[arg0][arg1] = arg6;
        this.field6307[arg0][arg1] = arg7;
        if (this.field6334 != null) {
            this.field6334[arg0][arg1] = arg5;
        }
        if (this.field6308 != null) {
            this.field6308[arg0][arg1] = arg3;
        }
        class43[] var16 = this.field6333[arg0][arg1] = new class43[arg6.length];
        for (int var17 = 0; ~arg6.length < ~var17; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if (~(this.field6313 & 32) != -1 && ~var18 != 0 && var15.method962(var18, 2904).field9639) {
                var18 = -1;
                var19 = 128;
            }
            long var20 = (long) var18 | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (var19 << 14);
            class430 var22;
            for (var22 = this.field6342.method4020(var20, (byte) -66); var22 != null; var22 = this.field6342.method4018((byte) 105)) {
                class43 var23 = (class43) var22;
                if (~var23.field714 == ~var18 && (float) var19 == var23.field719 && ~var23.field720 == ~arg10 && ~var23.field712 == ~arg11 && ~var23.field731 == ~arg12) {
                    break;
                }
            }
            if (var22 == null) {
                var16[var17] = new class43(this, var18, var19, arg10, arg11, arg12);
                this.field6342.method4022(var16[var17], -100, var20);
            } else {
                var16[var17] = (class43) var22;
            }
        }
        if (arg13) {
            this.field6331[arg0][arg1] = (byte) class430.method2658(this.field6331[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field6340) {
            this.field6340 = arg6.length;
        }
        this.field6341 += arg6.length;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III[[ZZI)V")
    public final void method46(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.method2707(arg0, arg1, arg4, arg2, arg3, -1, 0, arg5);
        ++field6295;
    }

    @OriginalMember(owner = "client!cj", name = "YA", descriptor = "()V")
    public final void method35() {
        ++field6300;
        if (this.field6341 > 0) {
            byte[][] var1 = new byte[super.field4679 + 1][super.field4672 - -1];
            for (int var2 = 1; ~super.field4679 < ~var2; ++var2) {
                for (int var107 = 1; ~var107 > ~super.field4672; ++var107) {
                    var1[var2][var107] = (byte) ((this.field6345[var2][var107 + -1] >> 2) + (this.field6345[var2 + 1][var107] >> 3) + (this.field6345[var2 - 1][var107] >> 2) + (this.field6345[var2][var107 + 1] >> 3) + (this.field6345[var2][var107] >> 1));
                }
            }
            class43[] var3 = new class43[this.field6342.method4019(7)];
            this.field6342.method4017(var3, 76);
            for (int var4 = 0; ~var4 > ~var3.length; ++var4) {
                var3[var4].method438(this.field6341, 0);
            }
            int var5 = 20;
            if (this.field6334 != null) {
                var5 += 4;
            }
            if ((this.field6313 & 7) != 0) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field6304.field438.method2568(this.field6341 * 4, false);
            NativeHeapBuffer var7 = this.field6304.field438.method2568(this.field6341 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class43[] var10 = new class43[this.field6341];
            int var11 = class468.method2829(127, this.field6341 / 4);
            if (var11 < 1) {
                var11 = 1;
            }
            class715 var12 = new class715(var11);
            class43[] var13 = new class43[this.field6340];
            for (int var14 = 0; super.field4679 > var14; ++var14) {
                for (int var34 = 0; var34 < super.field4672; ++var34) {
                    if (this.field6298[var14][var34] != null) {
                        class43[] var35 = this.field6333[var14][var34];
                        int[] var36 = this.field6296[var14][var34];
                        int[] var37 = this.field6314[var14][var34];
                        int[] var38 = this.field6307[var14][var34];
                        int[] var39 = this.field6298[var14][var34];
                        int[] var40 = this.field6308 == null ? null : this.field6308[var14][var34];
                        int[] var41 = this.field6334 != null ? this.field6334[var14][var34] : null;
                        if (var38 == null) {
                            var38 = var39;
                        }
                        float var42 = this.field6339[var14][var34];
                        float var43 = this.field6338[var14][var34];
                        float var44 = this.field6344[var14][var34];
                        float var45 = this.field6339[var14][var34 - -1];
                        float var46 = this.field6338[var14][var34 - -1];
                        float var47 = this.field6344[var14][var34 + 1];
                        float var48 = this.field6339[var14 - -1][var34 + 1];
                        float var49 = this.field6338[var14 - -1][var34 + 1];
                        float var50 = this.field6344[var14 + 1][var34 + 1];
                        float var51 = this.field6339[var14 + 1][var34];
                        float var52 = this.field6338[var14 + 1][var34];
                        float var53 = this.field6344[var14 + 1][var34];
                        int var54 = var1[var14][var34] & 255;
                        int var55 = var1[var14][var34 + 1] & 255;
                        int var56 = 255 & var1[var14 + 1][var34 + 1];
                        int var57 = var1[var14 + 1][var34] & 255;
                        int var58 = 0;
                        label360: for (int var59 = 0; ~var59 > ~var39.length; ++var59) {
                            class43 var105 = var35[var59];
                            for (int var106 = 0; ~var58 < ~var106; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label360;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field6306[super.field4679 * var34 - -var14] = new short[var39.length];
                        for (int var61 = 0; ~var39.length < ~var61; ++var61) {
                            int var62 = (var14 << super.field4674) + var36[var61];
                            int var63 = (var34 << super.field4674) - -var37[var61];
                            int var64 = var62 >> this.field6329;
                            int var65 = var63 >> this.field6329;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 != null ? var40[var61] : 0;
                            long var69 = (long) var65 | (long) (var64 << 16) | (long) var67 << 48 | (long) var66 << 32;
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75 = 1.0F;
                            float var76;
                            float var77;
                            int var78;
                            float var79;
                            if (~var71 == -1 && ~var72 == -1) {
                                var76 = var43;
                                var77 = var44;
                                var78 = var73 - var54;
                                var79 = var42;
                            } else if (var71 == 0 && ~super.field4675 == ~var72) {
                                var78 = var73 - var55;
                                var77 = var47;
                                var79 = var45;
                                var76 = var46;
                            } else if (super.field4675 == var71 && ~super.field4675 == ~var72) {
                                var79 = var48;
                                var77 = var50;
                                var76 = var49;
                                var78 = var73 - var56;
                            } else if (~super.field4675 == ~var71 && var72 == 0) {
                                var76 = var52;
                                var79 = var51;
                                var77 = var53;
                                var78 = var73 - var57;
                            } else {
                                float var80 = (float) var71 / (float) super.field4675;
                                float var81 = (float) var72 / (float) super.field4675;
                                float var82 = (var51 - var42) * var80 + var42;
                                float var83 = (var52 - var43) * var80 + var43;
                                float var84 = (var53 - var44) * var80 + var44;
                                float var85 = (-var45 + var48) * var80 + var45;
                                float var86 = (-var46 + var49) * var80 + var46;
                                var79 = (-var82 + var85) * var81 + var82;
                                var76 = (var86 - var83) * var81 + var83;
                                float var87 = (-var47 + var50) * var80 + var47;
                                var77 = (-var84 + var87) * var81 + var84;
                                int var88 = var54 - -((var57 - var54) * var71 >> super.field4674);
                                int var89 = var55 - -((-var55 + var56) * var71 >> super.field4674);
                                var78 = var73 - (var88 - -((-var88 + var89) * var72 >> super.field4674));
                            }
                            if (var66 != -1) {
                                int var90 = (127 & var66) * var78 >> 7;
                                if (~var90 > -3) {
                                    var90 = 2;
                                } else if (~var90 < -127) {
                                    var90 = 126;
                                }
                                if (~(this.field6313 & 7) == -1) {
                                    float var91 = this.field6304.field609[2] * var77 + this.field6304.field609[0] * var79 + this.field6304.field609[1] * var76;
                                    var75 = var91 * (var91 > 0.0F ? this.field6304.field599 : this.field6304.field594) + this.field6304.field551;
                                }
                                var74 = class519.field7479[var90 | 65408 & var66];
                            }
                            class430 var92 = null;
                            if (~(var62 & this.field6315 - 1) == -1 && (this.field6315 + -1 & var63) == 0) {
                                var92 = var12.method4020(var69, (byte) -112);
                            }
                            int var93;
                            if (var92 != null) {
                                var60[var61] = ((class219) var92).field3265;
                                var93 = 65535 & var60[var61];
                                if (var66 != -1 && var10[var93].field6188 > var35[var61].field6188) {
                                    var10[var93] = var35[var61];
                                }
                            } else {
                                int var94;
                                if (var66 == var67) {
                                    var94 = var74;
                                } else {
                                    int var95 = (127 & var67) * var78 >> 7;
                                    if (var95 >= 2) {
                                        if (~var95 < -127) {
                                            var95 = 126;
                                        }
                                    } else {
                                        var95 = 2;
                                    }
                                    var94 = class519.field7479[var67 & 65408 | var95];
                                    if ((7 & this.field6313) == 0) {
                                        float var96 = this.field6304.field609[2] * var77 + this.field6304.field609[1] * var76 + this.field6304.field609[0] * var79;
                                        float var97 = this.field6304.field551 + var75 * (var75 > 0.0F ? this.field6304.field599 : this.field6304.field594);
                                        int var98 = 255 & var94 >> 16;
                                        int var99 = (65401 & var94) >> 8;
                                        int var100 = (int) ((float) var98 * var97);
                                        int var101 = var94 & 255;
                                        int var102 = (int) ((float) var99 * var97);
                                        if (~var100 <= -1) {
                                            if (~var100 < -256) {
                                                var100 = 255;
                                            }
                                        } else {
                                            var100 = 0;
                                        }
                                        int var103 = (int) ((float) var101 * var97);
                                        if (~var102 <= -1) {
                                            if (var102 > 255) {
                                                var102 = 255;
                                            }
                                        } else {
                                            var102 = 0;
                                        }
                                        if (var103 >= 0) {
                                            if (var103 > 255) {
                                                var103 = 255;
                                            }
                                        } else {
                                            var103 = 0;
                                        }
                                        var94 = var103 | var100 << 16 | var102 << 8;
                                    }
                                }
                                if (Stream.method2551()) {
                                    var8.method2557((float) var62);
                                    var8.method2557((float) (this.method2089(26448, var62, var63) + var68));
                                    var8.method2557((float) var63);
                                    var8.method2557((float) var62);
                                    var8.method2557((float) var63);
                                    if (this.field6334 != null) {
                                        var8.method2557((float) (var41 == null ? 0 : var41[var61] - 1));
                                    }
                                    if ((7 & this.field6313) != 0) {
                                        var8.method2557(var79);
                                        var8.method2557(var76);
                                        var8.method2557(var77);
                                    }
                                } else {
                                    var8.method2564((float) var62);
                                    var8.method2564((float) (var68 + this.method2089(26448, var62, var63)));
                                    var8.method2564((float) var63);
                                    var8.method2564((float) var62);
                                    var8.method2564((float) var63);
                                    if (this.field6334 != null) {
                                        var8.method2564((float) (var41 == null ? 0 : var41[var61] + -1));
                                    }
                                    if (~(7 & this.field6313) != -1) {
                                        var8.method2564(var79);
                                        var8.method2564(var76);
                                        var8.method2564(var77);
                                    }
                                }
                                if (~this.field6304.field605 == -1) {
                                    var9.method2563(-16777216 | var94);
                                } else {
                                    var9.method2552(-16777216 | var94);
                                }
                                var93 = this.field6301++;
                                var60[var61] = (short) var93;
                                if (var66 != -1) {
                                    var10[var93] = var35[var61];
                                }
                                var12.method4022(new class219(var60[var61]), -65, var69);
                            }
                            for (int var104 = 0; ~var58 < ~var104; ++var104) {
                                var13[var104].method442(var78, var74, 59, var93, var75);
                            }
                            ++this.field6330;
                        }
                    }
                }
            }
            for (int var15 = 0; var15 < this.field6301; ++var15) {
                class43 var33 = var10[var15];
                if (var33 != null) {
                    var33.method439(var15, (byte) 80);
                }
            }
            for (int var16 = 0; ~var16 > ~super.field4679; ++var16) {
                for (int var22 = 0; ~var22 > ~super.field4672; ++var22) {
                    short[] var23 = this.field6306[super.field4679 * var22 - -var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (~var25 > ~var23.length) {
                            int var26 = var23[var25++] & 65535;
                            int var27 = var23[var25++] & 65535;
                            int var28 = var23[var25++] & 65535;
                            class43 var29 = var10[var26];
                            class43 var30 = var10[var27];
                            class43 var31 = var10[var28];
                            class43 var32 = null;
                            if (var29 != null) {
                                var32 = var29;
                                var29.method443(var16, var24, var22, 1);
                            }
                            if (var30 != null) {
                                var30.method443(var16, var24, var22, 1);
                                if (var32 == null || ~var32.field6188 < ~var30.field6188) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method443(var16, var24, var22, 1);
                                if (var32 == null || var32.field6188 > var31.field6188) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method439(var26, (byte) 80);
                                }
                                if (var30 != null) {
                                    var32.method439(var27, (byte) 80);
                                }
                                if (var31 != null) {
                                    var32.method439(var28, (byte) 80);
                                }
                                var32.method443(var16, var24, var22, 1);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method2554();
            var9.method2554();
            this.field6335 = this.field6304.method327(false, false);
            this.field6335.method1102(this.field6301 * 4, var6, -51, 4);
            this.field6343 = this.field6304.method327(false, false);
            this.field6343.method1102(this.field6301 * var5, var7, -40, var5);
            if (~(7 & this.field6313) == -1) {
                if (this.field6334 == null) {
                    this.field6336 = this.field6304.method334(21011, new class109[] { new class109(new class697[] { class697.field9848, class697.field9852 }), new class109(class697.field9850) });
                } else {
                    this.field6336 = this.field6304.method334(21011, new class109[] { new class109(new class697[] { class697.field9848, class697.field9852, class697.field9851 }), new class109(class697.field9850) });
                }
            } else if (this.field6334 != null) {
                this.field6336 = this.field6304.method334(21011, new class109[] { new class109(new class697[] { class697.field9848, class697.field9852, class697.field9851, class697.field9849 }), new class109(class697.field9850) });
            } else {
                this.field6336 = this.field6304.method334(21011, new class109[] { new class109(new class697[] { class697.field9848, class697.field9852, class697.field9849 }), new class109(class697.field9850) });
            }
            int var17 = 0;
            for (int var18 = 0; ~var3.length < ~var18; ++var18) {
                if (var3[var18].field728 > 0) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field6337 = new class43[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; var17 > var20; ++var20) {
                class43 var21 = var3[var20];
                var19[var20] = var21.field6188;
                this.field6337[var20] = var21;
                var21.method437(this.field6301, (byte) -74);
            }
            class345.method2115(var19, this.field6337, false);
            if (this.field6310 != null) {
                this.field6310.method700(128);
            }
        } else {
            this.field6310 = null;
        }
        this.field6296 = this.field6314 = null;
        this.field6333 = null;
        this.field6345 = null;
        this.field6334 = null;
        this.field6307 = null;
        this.field6339 = this.field6338 = this.field6344 = null;
        this.field6308 = null;
        this.field6298 = null;
        this.field6342 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field6305;
        if (~this.field6341 < -1) {
            class33 var9 = this.field6304.method361(-63, this.field6330);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; ~var13 > -5; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method177(true, (byte) -123);
                if (var14 != null) {
                    Stream var15 = this.field6304.method325((byte) -120, var14);
                    if (Stream.method2551()) {
                        for (int var16 = arg4; var16 < arg6; ++var16) {
                            int var17 = super.field4679 * var16 + arg3;
                            for (int var18 = arg3; var18 < arg5; ++var18) {
                                if (arg7[-arg3 + var18][var16 - arg4]) {
                                    short[] var19 = this.field6306[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; ~var20 > ~var19.length; ++var20) {
                                            int var21 = 65535 & var19[var20];
                                            var15.method2561(var21);
                                            if (~var21 < ~var12) {
                                                var12 = var21;
                                            }
                                            ++var10;
                                            if (~var21 > ~var11) {
                                                var11 = var21;
                                            }
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; arg6 > var22; ++var22) {
                            int var25 = super.field4679 * var22 + arg3;
                            for (int var26 = arg3; var26 < arg5; ++var26) {
                                if (arg7[-arg3 + var26][-arg4 + var22]) {
                                    short[] var27 = this.field6306[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; var27.length > var28; ++var28) {
                                            int var29 = 65535 & var27[var28];
                                            ++var10;
                                            if (~var29 < ~var12) {
                                                var12 = var29;
                                            }
                                            if (~var11 < ~var29) {
                                                var11 = var29;
                                            }
                                            var15.method2560(var29);
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method2554();
                    if (var9.method178((byte) -122)) {
                        break;
                    }
                }
            }
            if (var10 > 0) {
                this.field6304.method194((byte) -99);
                this.field6304.method252((byte) 53, false);
                this.field6304.method299(true, false);
                this.field6304.method266(31, false);
                this.field6304.method308(0, false);
                this.field6304.method355(0, (byte) -96);
                this.field6304.method223(false, false, false, -2);
                this.field6304.method264((class101) null, -2);
                class417 var23 = this.field6304.method345(0);
                float[] var24 = this.field6304.method257(2);
                var24[8] = 0.0F;
                var24[12] = -(((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field6304.field486) + -1.0F;
                var24[11] = 0.0F;
                var24[9] = 0.0F;
                var24[2] = 0.0F;
                var24[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field6304.field436) + 1.0F;
                var24[3] = 0.0F;
                var24[1] = 0.0F;
                var24[7] = 0.0F;
                var24[4] = 0.0F;
                var24[15] = 1.0F;
                var24[5] = (float) arg2 / ((float) super.field4675 * 128.0F * (float) this.field6304.field436);
                var24[6] = 0.0F;
                var24[14] = -this.field6320 / (-this.field6320 + this.field6297);
                var24[10] = 1.0F / (-this.field6320 + this.field6297);
                var24[0] = (float) arg2 / ((float) super.field4675 * 128.0F * (float) this.field6304.field486);
                var23.method2518(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -119, 0.0F, 1.0F, 1.0F);
                this.field6304.method224(-26906);
                this.field6304.method384((byte) 19);
                if ((this.field6313 & 7) != 0) {
                    this.field6304.method299(true, true);
                    this.field6304.method241(false);
                } else {
                    this.field6304.method299(true, false);
                }
                this.field6304.method240(true, false);
                this.field6304.method405(this.field6343, 0, (byte) 11);
                this.field6304.method405(this.field6335, 1, (byte) 11);
                this.field6304.method265(this.field6336, (byte) -67);
                this.field6304.method354(class262.field3771, var11, 124, -var11 + 1 + var12, var9, var10 / 3, 0);
                this.field6304.method240(true, true);
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
    public static void method2709(byte arg0) {
        int var1 = -14 / ((arg0 - 89) / 34);
        field6323 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lwh;[I)V")
    public final void method37(class40 arg0, int[] arg1) {
        ++field6311;
        this.field6326.method3559(new class5(this.field6304, this, arg0, arg1), (byte) 12);
    }

    @OriginalMember(owner = "client!cj", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method36(class704 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6322;
        if (this.field6310 != null && arg0 != null) {
            int var7 = arg1 - (this.field6304.field633 * arg2 >> 8) >> this.field6304.field588;
            int var8 = -(this.field6304.field539 * arg2 >> 8) + arg3 >> this.field6304.field588;
            this.field6310.method698(var7, 24864, arg0, var8);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2710(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field6294;
        if (~arg2 <= -1 && arg7 >= 0 && ~(class184.field2546 - 1) < ~arg2 && arg7 < class240.field3555 + -1) {
            if (class565.field8185 == null) {
                return;
            }
            if (~arg6 == -1) {
                class324 var8 = (class324) class256.method1707(arg0, arg2, arg7);
                class324 var9 = (class324) class675.method3833(arg0, arg2, arg7);
                if (var8 != null && arg4 != 2) {
                    if (!(var8 instanceof class544)) {
                        class729.method4068(var8.method601((byte) 94), arg4, arg6, -1, arg0, arg3, arg1, arg2, arg7);
                    } else {
                        ((class544) var8).field7916.method1462(121, arg3);
                    }
                }
                if (var9 != null) {
                    if (var9 instanceof class544) {
                        ((class544) var9).field7916.method1462(117, arg3);
                    } else {
                        class729.method4068(var9.method601((byte) 92), arg4, arg6, -1, arg0, arg3, arg1, arg2, arg7);
                    }
                }
            } else if (arg6 != 1) {
                if (~arg6 == -3) {
                    class324 var10 = (class324) class360.method2277(arg0, arg2, arg7, field6346 != null ? field6346 : (field6346 = method2711("as")));
                    if (var10 != null) {
                        if (arg4 == 11) {
                            arg4 = 10;
                        }
                        if (var10 instanceof class223) {
                            ((class223) var10).field3292.method1462(77, arg3);
                        } else {
                            class729.method4068(var10.method601((byte) 94), arg4, arg6, arg5 + 10438, arg0, arg3, arg1, arg2, arg7);
                        }
                    }
                } else if (~arg6 == -4) {
                    class324 var11 = (class324) class388.method2384(arg0, arg2, arg7);
                    if (var11 != null) {
                        if (var11 instanceof class92) {
                            ((class92) var11).field1303.method1462(93, arg3);
                        } else {
                            class729.method4068(var11.method601((byte) 125), arg4, arg6, arg5 + 10438, arg0, arg3, arg1, arg2, arg7);
                        }
                    }
                }
            } else {
                class324 var12 = (class324) class198.method1415(arg0, arg2, arg7);
                if (var12 != null) {
                    if (!(var12 instanceof class68)) {
                        int var13 = var12.method601((byte) 91);
                        if (arg4 != 4 && ~arg4 != -6) {
                            if (~arg4 == -7) {
                                class729.method4068(var13, 4, arg6, -1, arg0, arg3, arg1 + 4, arg2, arg7);
                            } else if (arg4 == 7) {
                                class729.method4068(var13, 4, arg6, -1, arg0, arg3, (3 & arg1 + 2) - -4, arg2, arg7);
                            } else if (~arg4 == -9) {
                                class729.method4068(var13, 4, arg6, -1, arg0, arg3, arg1 + 4, arg2, arg7);
                                class729.method4068(var13, 4, arg6, arg5 + 10438, arg0, arg3, (arg1 + 2 & 3) + 4, arg2, arg7);
                            }
                        } else {
                            class729.method4068(var13, 4, arg6, -1, arg0, arg3, arg1, arg2, arg7);
                        }
                    } else {
                        ((class68) var12).field1056.method1462(56, arg3);
                    }
                }
            }
        }
        if (arg5 != -10439) {
            field6318 = 43;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2711(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
