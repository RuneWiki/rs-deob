import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class385 extends class296 {

    @OriginalMember(owner = "client!ll", name = "H", descriptor = "F")
    private float field4932 = -3.4028235E38F;

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "F")
    private float field4912 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!ll", name = "V", descriptor = "Lifa;")
    private class450 field4946 = new class450();

    @OriginalMember(owner = "client!ll", name = "B", descriptor = "Lwg;")
    public class449 field4926;

    @OriginalMember(owner = "client!ll", name = "Y", descriptor = "I")
    private int field4949;

    @OriginalMember(owner = "client!ll", name = "F", descriptor = "I")
    private int field4930;

    @OriginalMember(owner = "client!ll", name = "q", descriptor = "[[[I")
    public int[][][] field4915;

    @OriginalMember(owner = "client!ll", name = "bb", descriptor = "[[F")
    private float[][] field4952;

    @OriginalMember(owner = "client!ll", name = "v", descriptor = "[[[I")
    private int[][][] field4920;

    @OriginalMember(owner = "client!ll", name = "Z", descriptor = "[[F")
    private float[][] field4950;

    @OriginalMember(owner = "client!ll", name = "hb", descriptor = "[[F")
    private float[][] field4958;

    @OriginalMember(owner = "client!ll", name = "S", descriptor = "[[S")
    public short[][] field4943;

    @OriginalMember(owner = "client!ll", name = "y", descriptor = "[[[I")
    private int[][][] field4923;

    @OriginalMember(owner = "client!ll", name = "M", descriptor = "[[B")
    private byte[][] field4937;

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "[[[I")
    public int[][][] field4911;

    @OriginalMember(owner = "client!ll", name = "G", descriptor = "[[[Loha;")
    private class772[][][] field4931;

    @OriginalMember(owner = "client!ll", name = "w", descriptor = "[[[I")
    public int[][][] field4921;

    @OriginalMember(owner = "client!ll", name = "jb", descriptor = "[[B")
    private byte[][] field4960;

    @OriginalMember(owner = "client!ll", name = "N", descriptor = "I")
    public int field4938;

    @OriginalMember(owner = "client!ll", name = "kb", descriptor = "Ldj;")
    private class362 field4961;

    @OriginalMember(owner = "client!ll", name = "P", descriptor = "Lvo;")
    private class47 field4940;

    @OriginalMember(owner = "client!ll", name = "z", descriptor = "Llja;")
    public static class744 field4924 = new class744(76, -1);

    @OriginalMember(owner = "client!ll", name = "L", descriptor = "[[Ljava/lang/String;")
    public static String[][] field4936 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!ll", name = "r", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!ll", name = "s", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!ll", name = "t", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!ll", name = "u", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!ll", name = "x", descriptor = "I")
    private int field4922;

    @OriginalMember(owner = "client!ll", name = "A", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!ll", name = "C", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!ll", name = "D", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!ll", name = "E", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!ll", name = "J", descriptor = "I")
    private int field4934;

    @OriginalMember(owner = "client!ll", name = "K", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!ll", name = "Q", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!ll", name = "R", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!ll", name = "T", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!ll", name = "U", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!ll", name = "X", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!ll", name = "db", descriptor = "I")
    private int field4954;

    @OriginalMember(owner = "client!ll", name = "gb", descriptor = "I")
    private int field4957;

    @OriginalMember(owner = "client!ll", name = "ib", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!ll", name = "W", descriptor = "J")
    public static long field4947;

    @OriginalMember(owner = "client!ll", name = "cb", descriptor = "Loda;")
    private class129 field4953;

    @OriginalMember(owner = "client!ll", name = "eb", descriptor = "Loda;")
    private class129 field4955;

    @OriginalMember(owner = "client!ll", name = "O", descriptor = "Lbt;")
    public static class48 field4939;

    @OriginalMember(owner = "client!ll", name = "fb", descriptor = "Lnca;")
    public class785 field4956;

    @OriginalMember(owner = "client!ll", name = "ab", descriptor = "[Loha;")
    private class772[] field4951;

    @OriginalMember(owner = "client!ll", name = "I", descriptor = "[[[I")
    private int[][][] field4933;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)V")
    public static final void method2258(int arg0) {
        if (arg0 == 7) {
            ++field4929;
            class390.field5065.method626((0.1F * (float) class118.field1503.field10655.method3783(0) + 0.7F) * class349.field4351);
            class390.field5065.method578(class93.field1226, class591.field8034, class112.field1415, (float) (class615.field8272 << 2), (float) (class476.field6613 << 2), (float) (class677.field9288 << 2));
            class390.field5065.method558(class731.field10241);
        }
    }

    @OriginalMember(owner = "client!ll", name = "fa", descriptor = "(IILr;)Lr;")
    public final class196 method1399(int arg0, int arg1, class196 arg2) {
        ++field4959;
        if (~(this.field4937[arg0][arg1] & 1) == -1) {
            return null;
        } else {
            int var4 = super.field3525 >> this.field4926.field6267;
            class111 var5 = (class111) arg2;
            class111 var6;
            if (var5 != null && var5.method889(-22539, var4, var4)) {
                var6 = var5;
                var5.method890(-1);
            } else {
                var6 = new class111(this.field4926, var4, var4);
            }
            var6.method888(0, var4, var4, (byte) -73, 0);
            this.method2261(var6, 16671, arg1, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ll", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method1402(class196 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4925;
        if (this.field4940 != null && arg0 != null) {
            int var7 = -(this.field4926.field6248 * arg2 >> 8) + arg1 >> this.field4926.field6267;
            int var8 = arg3 - (this.field4926.field6327 * arg2 >> 8) >> this.field4926.field6267;
            this.field4940.method417(var8, -17249, arg0, var7);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method1403(class196 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4927;
        if (this.field4940 != null && arg0 != null) {
            int var7 = -(this.field4926.field6248 * arg2 >> 8) + arg1 >> this.field4926.field6267;
            int var8 = -(this.field4926.field6327 * arg2 >> 8) + arg3 >> this.field4926.field6267;
            return this.field4940.method423(var7, 101, var8, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ll", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method1397(class196 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4944;
        if (this.field4940 != null && arg0 != null) {
            int var7 = -(this.field4926.field6248 * arg2 >> 8) + arg1 >> this.field4926.field6267;
            int var8 = -(this.field4926.field6327 * arg2 >> 8) + arg3 >> this.field4926.field6267;
            this.field4940.method416(var8, true, var7, arg0);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(III[[ZZI)V")
    public final void method1388(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.method2259(arg4, -1, arg1, arg2, arg0, arg5, arg3, (byte) -125);
        ++field4942;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZIIIII[[ZB)V")
    private final void method2259(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean[][] arg6, byte arg7) {
        if (this.field4951 != null) {
            int var9 = arg3 + arg3 + 1;
            int var10 = var9 * var9;
            if (var10 > class779.field10749.length) {
                class779.field10749 = new int[var10];
            }
            int var11 = -arg3 + arg4;
            int var12 = var11;
            if (~var11 > -1) {
                var11 = 0;
            }
            int var13 = -arg3 + arg2;
            int var14 = var13;
            if (var13 < 0) {
                var13 = 0;
            }
            int var15 = arg4 - -arg3;
            if (~var15 < ~(super.field3533 + -1)) {
                var15 = super.field3533 + -1;
            }
            int var16 = arg2 + arg3;
            class464.field6506 = 0;
            if (~var16 < ~(super.field3524 + -1)) {
                var16 = super.field3524 + -1;
            }
            for (int var17 = var11; ~var17 >= ~var15; ++var17) {
                boolean[] var24 = arg6[-var12 + var17];
                for (int var25 = var13; var25 <= var16; ++var25) {
                    if (var24[-var14 + var25]) {
                        class779.field10749[class464.field6506++] = super.field3533 * var25 + var17;
                    }
                }
            }
            if (arg1 == -1) {
                this.field4926.method2696(false);
            } else {
                this.field4926.method2647((float) arg1, 120);
                this.field4926.method2662((byte) 99);
            }
            this.field4926.method2706(125);
            this.field4926.method2675(~(7 & this.field4938) != -1, -8);
            this.field4926.method2711(-1, false, -1, false);
            this.field4926.method64(0, this.field4955, 0);
            for (int var18 = 0; this.field4951.length > var18; ++var18) {
                this.field4951[var18].method4282(class464.field6506, class779.field10749, (byte) 88);
            }
            class256 var19 = this.field4926.method2652(-17);
            var19.method130(0, -1, 0);
            this.field4926.method2688(0);
            if (!this.field4946.method2724((byte) -99)) {
                int var20 = this.field4926.field6307;
                int var21 = this.field4926.field6231;
                this.field4926.method650(0, var21, this.field4926.field6234);
                this.field4926.method2675(false, -8);
                this.field4926.method2666(8, false);
                this.field4926.method2699((byte) 14, 128);
                this.field4926.method2711(-1, false, -2, false);
                this.field4926.method2643(-2, this.field4926.field6257);
                this.field4926.method2716(class75.field1039, 96, class269.field3180);
                this.field4926.method2694((byte) -49, 0, class555.field7718);
                this.field4926.method2703(class606.field8160, (byte) 5, 0);
                for (class379 var22 = this.field4946.method2725(37); var22 != null; var22 = this.field4946.method2726(-115)) {
                    class361 var23 = (class361) var22;
                    var23.method2107(arg2, arg3, arg4, 0, arg6);
                }
                this.field4926.method2694((byte) -49, 0, class507.field7214);
                this.field4926.method2703(class507.field7214, (byte) 19, 0);
                this.field4926.method2643(-2, (class315) null);
                this.field4926.method650(var20, var21, this.field4926.field6234);
            }
            if (this.field4940 != null) {
                this.field4926.method64(0, this.field4955, 0);
                this.field4926.method64(0, this.field4953, 1);
                this.field4926.method85((byte) 96, this.field4956);
                this.field4940.method415(1, arg6, arg2, arg3, arg0, arg4);
            }
        }
        ++field4928;
        int var26 = -112 % (arg7 / 40);
    }

    @OriginalMember(owner = "client!ll", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1405(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field4916;
        if (arg3 != null && this.field4920 == null) {
            this.field4920 = new int[super.field3533][super.field3524][];
        }
        if (arg5 != null && this.field4933 == null) {
            this.field4933 = new int[super.field3533][super.field3524][];
        }
        class162 var15 = this.field4926.field890;
        this.field4921[arg0][arg1] = arg2;
        this.field4911[arg0][arg1] = arg4;
        this.field4915[arg0][arg1] = arg6;
        this.field4923[arg0][arg1] = arg7;
        if (this.field4933 != null) {
            this.field4933[arg0][arg1] = arg5;
        }
        if (this.field4920 != null) {
            this.field4920[arg0][arg1] = arg3;
        }
        class772[] var16 = this.field4931[arg0][arg1] = new class772[arg6.length];
        for (int var17 = 0; ~var17 > ~arg6.length; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if ((this.field4938 & 32) != 0 && var18 != -1 && var15.method1138(var18, 93).field4464) {
                var19 = 128;
                var18 = -1;
            }
            long var20 = (long) (var19 << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) var18;
            class379 var22;
            for (var22 = this.field4961.method2121(92, var20); var22 != null; var22 = this.field4961.method2118(0)) {
                class772 var23 = (class772) var22;
                if (var23.field10626 == var18 && (float) var19 == var23.field10609 && var23.field10616 == arg10 && ~var23.field10615 == ~arg11 && ~var23.field10608 == ~arg12) {
                    break;
                }
            }
            if (var22 != null) {
                var16[var17] = (class772) var22;
            } else {
                var16[var17] = new class772(this, var18, var19, arg10, arg11, arg12);
                this.field4961.method2112(var16[var17], (byte) 6, var20);
            }
        }
        if (arg13) {
            this.field4937[arg0][arg1] = (byte) class5.method105(this.field4937[arg0][arg1], 1);
        }
        if (~this.field4954 > ~arg6.length) {
            this.field4954 = arg6.length;
        }
        this.field4957 += arg6.length;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lwg;IIII[[I[[II)V")
    public class385(class449 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field4926 = arg0;
        this.field4949 = super.field3530 + -2;
        this.field4930 = 1 << this.field4949;
        this.field4915 = new int[arg3][arg4][];
        this.field4952 = new float[super.field3533 + 1][super.field3524 - -1];
        this.field4920 = new int[arg3][arg4][];
        this.field4950 = new float[super.field3533 + 1][super.field3524 + 1];
        this.field4958 = new float[super.field3533 + 1][super.field3524 + 1];
        this.field4943 = new short[arg3 * arg4][];
        this.field4923 = new int[arg3][arg4][];
        this.field4937 = new byte[arg3][arg4];
        this.field4911 = new int[arg3][arg4][];
        this.field4931 = new class772[arg3][arg4][];
        this.field4921 = new int[arg3][arg4][];
        this.field4960 = new byte[arg3 + 1][arg4 + 1];
        this.field4938 = arg2;
        for (int var9 = 0; super.field3524 >= var9; ++var9) {
            for (int var10 = 0; ~var10 >= ~super.field3533; ++var10) {
                int var11 = super.field3526[var10][var9];
                if ((float) var11 < this.field4912) {
                    this.field4912 = (float) var11;
                }
                if (this.field4932 < (float) var11) {
                    this.field4932 = (float) var11;
                }
                if (~var10 < -1 && ~var9 < -1 && ~var10 > ~super.field3533 && ~super.field3524 < ~var9) {
                    int var12 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + (var12 * var12 - -(var13 * var13)))));
                    this.field4958[var10][var9] = (float) var12 * var14;
                    this.field4952[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field4950[var10][var9] = (float) var13 * var14;
                }
            }
        }
        ++this.field4932;
        --this.field4912;
        this.field4961 = new class362(128);
        if ((this.field4938 & 16) != 0) {
            this.field4940 = new class47(this.field4926, this);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)V")
    public final void method1392(int arg0, int arg1) {
        ++field4935;
    }

    @OriginalMember(owner = "client!ll", name = "YA", descriptor = "()V")
    public final void method1389() {
        if (~this.field4957 >= -1) {
            this.field4940 = null;
        } else {
            byte[][] var1 = new byte[super.field3533 + 1][super.field3524 + 1];
            for (int var2 = 1; super.field3533 > var2; ++var2) {
                for (int var107 = 1; var107 < super.field3524; ++var107) {
                    var1[var2][var107] = (byte) ((this.field4960[var2][var107 + -1] >> 2) + (this.field4960[var2 - -1][var107] >> 3) + (this.field4960[var2 + -1][var107] >> 2) + (this.field4960[var2][var107 + 1] >> 3) + (this.field4960[var2][var107] >> 1));
                }
            }
            class772[] var3 = new class772[this.field4961.method2117(true)];
            this.field4961.method2113(var3, -72);
            for (int var4 = 0; var3.length > var4; ++var4) {
                var3[var4].method4280(true, this.field4957);
            }
            int var5 = 20;
            if (this.field4933 != null) {
                var5 += 4;
            }
            if ((7 & this.field4938) != 0) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field4926.field6039.method3977(this.field4957 * 4, false);
            NativeHeapBuffer var7 = this.field4926.field6039.method3977(this.field4957 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class772[] var10 = new class772[this.field4957];
            int var11 = class381.method2234(-124, this.field4957 / 4);
            if (var11 < 1) {
                var11 = 1;
            }
            class362 var12 = new class362(var11);
            class772[] var13 = new class772[this.field4954];
            for (int var14 = 0; var14 < super.field3533; ++var14) {
                for (int var34 = 0; ~var34 > ~super.field3524; ++var34) {
                    if (this.field4915[var14][var34] != null) {
                        class772[] var35 = this.field4931[var14][var34];
                        int[] var36 = this.field4921[var14][var34];
                        int[] var37 = this.field4911[var14][var34];
                        int[] var38 = this.field4923[var14][var34];
                        int[] var39 = this.field4915[var14][var34];
                        int[] var40 = this.field4920 != null ? this.field4920[var14][var34] : null;
                        if (var38 == null) {
                            var38 = var39;
                        }
                        int[] var41 = this.field4933 == null ? null : this.field4933[var14][var34];
                        float var42 = this.field4958[var14][var34];
                        float var43 = this.field4952[var14][var34];
                        float var44 = this.field4950[var14][var34];
                        float var45 = this.field4958[var14][var34 + 1];
                        float var46 = this.field4952[var14][var34 + 1];
                        float var47 = this.field4950[var14][var34 + 1];
                        float var48 = this.field4958[var14 + 1][var34 - -1];
                        float var49 = this.field4952[var14 + 1][var34 + 1];
                        float var50 = this.field4950[var14 + 1][var34 + 1];
                        float var51 = this.field4958[var14 + 1][var34];
                        float var52 = this.field4952[var14 + 1][var34];
                        float var53 = this.field4950[var14 + 1][var34];
                        int var54 = var1[var14][var34] & 255;
                        int var55 = var1[var14][var34 + 1] & 255;
                        int var56 = var1[var14 + 1][var34 + 1] & 255;
                        int var57 = 255 & var1[var14 - -1][var34];
                        int var58 = 0;
                        label359: for (int var59 = 0; var39.length > var59; ++var59) {
                            class772 var105 = var35[var59];
                            for (int var106 = 0; var58 > var106; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label359;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field4943[super.field3533 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; var61 < var39.length; ++var61) {
                            int var62 = (var14 << super.field3530) - -var36[var61];
                            int var63 = (var34 << super.field3530) + var37[var61];
                            int var64 = var62 >> this.field4949;
                            int var65 = var63 >> this.field4949;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 != null ? var40[var61] : 0;
                            long var69 = (long) var66 << 32 | (long) var67 << 48 | (long) (var64 << 16) | (long) var65;
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75 = 1.0F;
                            float var76;
                            int var77;
                            float var78;
                            float var79;
                            if (~var71 == -1 && var72 == 0) {
                                var76 = var42;
                                var77 = var73 - var54;
                                var78 = var43;
                                var79 = var44;
                            } else if (~var71 == -1 && ~super.field3525 == ~var72) {
                                var79 = var47;
                                var78 = var46;
                                var76 = var45;
                                var77 = var73 - var55;
                            } else if (super.field3525 == var71 && super.field3525 == var72) {
                                var78 = var49;
                                var77 = var73 - var56;
                                var76 = var48;
                                var79 = var50;
                            } else if (super.field3525 == var71 && ~var72 == -1) {
                                var77 = var73 - var57;
                                var78 = var52;
                                var79 = var53;
                                var76 = var51;
                            } else {
                                float var80 = (float) var71 / (float) super.field3525;
                                float var81 = (float) var72 / (float) super.field3525;
                                float var82 = (-var42 + var51) * var80 + var42;
                                float var83 = (-var43 + var52) * var80 + var43;
                                float var84 = (-var44 + var53) * var80 + var44;
                                float var85 = (var48 - var45) * var80 + var45;
                                float var86 = (-var46 + var49) * var80 + var46;
                                float var87 = (var50 - var47) * var80 + var47;
                                var78 = (-var83 + var86) * var81 + var83;
                                var76 = (-var82 + var85) * var81 + var82;
                                var79 = (var87 - var84) * var81 + var84;
                                int var88 = var54 - -((var57 - var54) * var71 >> super.field3530);
                                int var89 = ((-var55 + var56) * var71 >> super.field3530) + var55;
                                var77 = var73 - (var88 - -((var89 - var88) * var72 >> super.field3530));
                            }
                            if (var66 != -1) {
                                int var90 = (127 & var66) * var77 >> 7;
                                if (var90 < 2) {
                                    var90 = 2;
                                } else if (~var90 < -127) {
                                    var90 = 126;
                                }
                                if ((7 & this.field4938) == 0) {
                                    float var91 = this.field4926.field6283[2] * var79 + this.field4926.field6283[1] * var78 + this.field4926.field6283[0] * var76;
                                    var75 = this.field4926.field6255 + var91 * (!(var91 > 0.0F) ? this.field4926.field6241 : this.field4926.field6280);
                                }
                                var74 = class437.field5749[var90 | 65408 & var66];
                            }
                            class379 var92 = null;
                            if ((var62 & this.field4930 + -1) == 0 && ~(var63 & this.field4930 + -1) == -1) {
                                var92 = var12.method2121(124, var69);
                            }
                            int var93;
                            if (var92 != null) {
                                var60[var61] = ((class731) var92).field10239;
                                var93 = var60[var61] & 65535;
                                if (~var66 != 0 && var35[var61].field4809 < var10[var93].field4809) {
                                    var10[var93] = var35[var61];
                                }
                            } else {
                                int var94;
                                if (var66 == var67) {
                                    var94 = var74;
                                } else {
                                    int var95 = (var67 & 127) * var77 >> 7;
                                    if (var95 < 2) {
                                        var95 = 2;
                                    } else if (~var95 < -127) {
                                        var95 = 126;
                                    }
                                    var94 = class437.field5749[var67 & 65408 | var95];
                                    if (~(7 & this.field4938) == -1) {
                                        float var96 = this.field4926.field6283[2] * var79 + this.field4926.field6283[1] * var78 + this.field4926.field6283[0] * var76;
                                        float var97 = this.field4926.field6255 + (var75 > 0.0F ? this.field4926.field6280 : this.field4926.field6241) * var75;
                                        int var98 = (16736329 & var94) >> 16;
                                        int var99 = (var94 & 65347) >> 8;
                                        int var100 = var94 & 255;
                                        int var101 = (int) ((float) var98 * var97);
                                        if (~var101 > -1) {
                                            var101 = 0;
                                        } else if (~var101 < -256) {
                                            var101 = 255;
                                        }
                                        int var102 = (int) ((float) var99 * var97);
                                        int var103 = (int) ((float) var100 * var97);
                                        if (var102 >= 0) {
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
                                if (Stream.method3985()) {
                                    var8.method3979((float) var62);
                                    var8.method3979((float) (this.method1730(var62, var63, -1) - -var68));
                                    var8.method3979((float) var63);
                                    var8.method3979((float) var62);
                                    var8.method3979((float) var63);
                                    if (this.field4933 != null) {
                                        var8.method3979((float) (var41 != null ? var41[var61] + -1 : 0));
                                    }
                                    if (~(this.field4938 & 7) != -1) {
                                        var8.method3979(var76);
                                        var8.method3979(var78);
                                        var8.method3979(var79);
                                    }
                                } else {
                                    var8.method3981((float) var62);
                                    var8.method3981((float) (var68 + this.method1730(var62, var63, -1)));
                                    var8.method3981((float) var63);
                                    var8.method3981((float) var62);
                                    var8.method3981((float) var63);
                                    if (this.field4933 != null) {
                                        var8.method3981((float) (var41 == null ? 0 : var41[var61] + -1));
                                    }
                                    if ((7 & this.field4938) != 0) {
                                        var8.method3981(var76);
                                        var8.method3981(var78);
                                        var8.method3981(var79);
                                    }
                                }
                                if (this.field4926.field6245 != 0) {
                                    var9.method3987(-16777216 | var94);
                                } else {
                                    var9.method3989(-16777216 | var94);
                                }
                                var93 = this.field4922++;
                                var60[var61] = (short) var93;
                                if (var66 != -1) {
                                    var10[var93] = var35[var61];
                                }
                                var12.method2112(new class731(var60[var61]), (byte) 6, var69);
                            }
                            for (int var104 = 0; var104 < var58; ++var104) {
                                var13[var104].method4285(var75, var74, var93, var77, 0);
                            }
                            ++this.field4934;
                        }
                    }
                }
            }
            for (int var15 = 0; this.field4922 > var15; ++var15) {
                class772 var33 = var10[var15];
                if (var33 != null) {
                    var33.method4283(4, var15);
                }
            }
            for (int var16 = 0; ~var16 > ~super.field3533; ++var16) {
                for (int var22 = 0; ~var22 > ~super.field3524; ++var22) {
                    short[] var23 = this.field4943[super.field3533 * var22 - -var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (~var25 > ~var23.length) {
                            int var26 = var23[var25++] & 65535;
                            int var27 = var23[var25++] & 65535;
                            int var28 = 65535 & var23[var25++];
                            class772 var29 = var10[var26];
                            class772 var30 = var10[var27];
                            class772 var31 = var10[var28];
                            class772 var32 = null;
                            if (var29 != null) {
                                var32 = var29;
                                var29.method4277(-56, var16, var22, var24);
                            }
                            if (var30 != null) {
                                var30.method4277(-57, var16, var22, var24);
                                if (var32 == null || ~var32.field4809 < ~var30.field4809) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method4277(-74, var16, var22, var24);
                                if (var32 == null || ~var31.field4809 > ~var32.field4809) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method4283(4, var26);
                                }
                                if (var30 != null) {
                                    var32.method4283(4, var27);
                                }
                                if (var31 != null) {
                                    var32.method4283(4, var28);
                                }
                                var32.method4277(125, var16, var22, var24);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method3992();
            var9.method3992();
            this.field4953 = this.field4926.method57(14, false);
            this.field4953.method272(var6, this.field4922 * 4, (byte) 34, 4);
            this.field4955 = this.field4926.method57(14, false);
            this.field4955.method272(var7, this.field4922 * var5, (byte) 34, var5);
            if (~(7 & this.field4938) == -1) {
                if (this.field4933 == null) {
                    this.field4956 = this.field4926.method68(126, new class585[] { new class585(new class504[] { class504.field7122, class504.field7134 }), new class585(class504.field7129) });
                } else {
                    this.field4956 = this.field4926.method68(91, new class585[] { new class585(new class504[] { class504.field7122, class504.field7134, class504.field7133 }), new class585(class504.field7129) });
                }
            } else if (this.field4933 == null) {
                this.field4956 = this.field4926.method68(91, new class585[] { new class585(new class504[] { class504.field7122, class504.field7134, class504.field7125 }), new class585(class504.field7129) });
            } else {
                this.field4956 = this.field4926.method68(80, new class585[] { new class585(new class504[] { class504.field7122, class504.field7134, class504.field7133, class504.field7125 }), new class585(class504.field7129) });
            }
            int var17 = 0;
            for (int var18 = 0; ~var3.length < ~var18; ++var18) {
                if (var3[var18].field10613 > 0) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field4951 = new class772[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; ~var17 < ~var20; ++var20) {
                class772 var21 = var3[var20];
                var19[var20] = var21.field4809;
                this.field4951[var20] = var21;
                var21.method4279(10805, this.field4922);
            }
            class5.method107(var19, this.field4951, (byte) -102);
            if (this.field4940 != null) {
                this.field4940.method421(-95);
            }
        }
        ++field4941;
        this.field4933 = null;
        this.field4960 = null;
        this.field4931 = null;
        this.field4921 = this.field4911 = null;
        this.field4958 = this.field4952 = this.field4950 = null;
        this.field4920 = null;
        this.field4923 = null;
        this.field4961 = null;
        this.field4915 = null;
    }

    @OriginalMember(owner = "client!ll", name = "ka", descriptor = "(III)V")
    public final void method1406(int arg0, int arg1, int arg2) {
        ++field4945;
        if ((255 & this.field4960[arg0][arg1]) < arg2) {
            this.field4960[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V")
    public static void method2260(byte arg0) {
        field4936 = null;
        field4939 = null;
        if (arg0 < 44) {
            method2258(127);
        }
        field4924 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(III[[ZZII)V")
    public final void method1390(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        ++field4914;
        this.method2259(arg4, arg5, arg1, arg2, arg0, arg6, arg3, (byte) -116);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lkp;[I)V")
    public final void method1400(class515 arg0, int[] arg1) {
        this.field4946.method2732(new class361(this.field4926, this, arg0, arg1), 21939);
        ++field4948;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1394(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field4917;
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
        this.method1405(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1407(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field4919;
        if (this.field4957 > 0) {
            class422 var9 = this.field4926.method2698((byte) -96, this.field4934);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; ~var13 > -5; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method2527((byte) -77, true);
                if (var14 != null) {
                    Stream var15 = this.field4926.method2650((byte) 118, var14);
                    if (!Stream.method3985()) {
                        for (int var16 = arg4; ~var16 > ~arg6; ++var16) {
                            int var17 = super.field3533 * var16 + arg3;
                            for (int var18 = arg3; ~arg5 < ~var18; ++var18) {
                                if (arg7[-arg3 + var18][-arg4 + var16]) {
                                    short[] var19 = this.field4943[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; ~var19.length < ~var20; ++var20) {
                                            int var21 = var19[var20] & 65535;
                                            if (var12 < var21) {
                                                var12 = var21;
                                            }
                                            if (~var11 < ~var21) {
                                                var11 = var21;
                                            }
                                            var15.method3988(var21);
                                            ++var10;
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; arg6 > var22; ++var22) {
                            int var25 = super.field3533 * var22 + arg3;
                            for (int var26 = arg3; var26 < arg5; ++var26) {
                                if (arg7[-arg3 + var26][-arg4 + var22]) {
                                    short[] var27 = this.field4943[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; var28 < var27.length; ++var28) {
                                            int var29 = var27[var28] & 65535;
                                            ++var10;
                                            if (~var11 < ~var29) {
                                                var11 = var29;
                                            }
                                            if (var29 > var12) {
                                                var12 = var29;
                                            }
                                            var15.method3991(var29);
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method3992();
                    if (var9.method2526(1234)) {
                        break;
                    }
                }
            }
            if (~var10 < -1) {
                this.field4926.method2695(true);
                this.field4926.method2669((byte) 109, false);
                this.field4926.method2675(false, -8);
                this.field4926.method2672(62, false);
                this.field4926.method2666(8, false);
                this.field4926.method2699((byte) 14, 0);
                this.field4926.method2711(-1, false, -2, false);
                this.field4926.method2643(-2, (class315) null);
                class256 var23 = this.field4926.method2652(-17);
                float[] var24 = this.field4926.method2683((byte) -125);
                var24[0] = (float) arg2 / ((float) super.field3525 * 128.0F * (float) this.field4926.field6148);
                var24[6] = 0.0F;
                var24[10] = 1.0F / (this.field4932 - this.field4912);
                var24[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field4926.field6148;
                var24[7] = 0.0F;
                var24[3] = 0.0F;
                var24[9] = 0.0F;
                var24[4] = 0.0F;
                var24[15] = 1.0F;
                var24[11] = 0.0F;
                var24[2] = 0.0F;
                var24[8] = 0.0F;
                var24[1] = 0.0F;
                var24[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field4926.field6096) + 1.0F;
                var24[5] = (float) arg2 / ((float) super.field3525 * 128.0F * (float) this.field4926.field6096);
                var24[14] = -this.field4912 / (-this.field4912 + this.field4932);
                var23.method1533(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -29923, 0.0F, 1.0F);
                this.field4926.method2663((byte) 71);
                this.field4926.method2688(0);
                if (~(this.field4938 & 7) == -1) {
                    this.field4926.method2675(false, -8);
                } else {
                    this.field4926.method2675(true, -8);
                    this.field4926.method86(true);
                }
                this.field4926.method41(0, false);
                this.field4926.method64(0, this.field4955, 0);
                this.field4926.method64(0, this.field4953, 1);
                this.field4926.method85((byte) 96, this.field4956);
                this.field4926.method1(var9, (byte) 10, var12 - var11 - -1, class67.field920, 0, var10 / 3, var11);
                this.field4926.method41(0, true);
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lhk;III)V")
    private final void method2261(class111 arg0, int arg1, int arg2, int arg3) {
        ++field4913;
        int[] var5 = this.field4921[arg3][arg2];
        int[] var6 = this.field4911[arg3][arg2];
        int var7 = var5.length;
        if (~var7 < ~class672.field9225.length) {
            class672.field9225 = new int[var7];
            class460.field6474 = new int[var7];
        }
        for (int var8 = 0; ~var8 > ~var7; ++var8) {
            class672.field9225[var8] = var5[var8] >> this.field4926.field6267;
            class460.field6474[var8] = var6[var8] >> this.field4926.field6267;
        }
        if (arg1 == 16671) {
            int var9 = 0;
            while (~var7 < ~var9) {
                int var10 = class672.field9225[var9];
                int var11 = class460.field6474[var9++];
                int var12 = class672.field9225[var9];
                int var13 = class460.field6474[var9++];
                int var14 = class672.field9225[var9];
                int var15 = class460.field6474[var9++];
                if (~((var10 - var12) * (-var15 + var13) + -((var14 - var12) * (-var11 + var13))) < -1) {
                    arg0.method887(var12, var14, var11, var10, var15, (byte) 113, var13);
                }
            }
        }
    }
}
