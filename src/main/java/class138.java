import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class138 extends class337 {

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "Lfr;")
    private class497 field2075 = new class497();

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
    private int field2090 = this.field5197 - 2;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "Lvd;")
    public class258 field2084;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "[[I")
    private int[][] field2077;

    @OriginalMember(owner = "client!ne", name = "cb", descriptor = "[[F")
    private float[][] field2100;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    public int field2068;

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "[[F")
    private float[][] field2096;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "[[[Lic;")
    private class273[][][] field2089;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "[[B")
    private byte[][] field2092;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "[[[I")
    public int[][][] field2060;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
    private int field2069;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "[[S")
    public short[][] field2088;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "[[[I")
    private int[][][] field2087;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "[[[I")
    private int[][][] field2067;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "[[[I")
    private int[][][] field2061;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "[[B")
    private byte[][] field2057;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "[[[I")
    public int[][][] field2055;

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "[[F")
    private float[][] field2099;

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "Lmt;")
    private class517 field2094;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "Lcn;")
    private class14 field2059;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "Luv;")
    public static class2 field2071 = new class2(99, -2);

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "I")
    private int field2072;

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
    private int field2078;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!ne", name = "db", descriptor = "I")
    private int field2101;

    @OriginalMember(owner = "client!ne", name = "fb", descriptor = "I")
    private int field2103;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "Llm;")
    private class246 field2091;

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "Lft;")
    public class426 field2093;

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "Lft;")
    public class426 field2095;

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "Lft;")
    private class426 field2097;

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "Lft;")
    public class426 field2098;

    @OriginalMember(owner = "client!ne", name = "eb", descriptor = "[Lic;")
    private class273[] field2102;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "[[[I")
    private int[][][] field2073;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(Lba;IIIIZ)V", line = 3)
    public final void method703(class502 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2076;
        if (this.field2059 != null && arg0 != null) {
            int var7 = arg1 - (this.field2084.field3742 * arg2 >> 8) >> this.field2084.field3701;
            int var8 = -(this.field2084.field3803 * arg2 >> 8) + arg3 >> this.field2084.field3701;
            this.field2059.method190(1, var7, arg0, var8);
        }
    }

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "(III)V", line = 21)
    public final void method719(int arg0, int arg1, int arg2) {
        ++field2080;
        if (~(this.field2092[arg0][arg1] & 255) > ~arg2) {
            this.field2092[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lba;IIIIZ)Z", line = 32)
    public final boolean method710(class502 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2079;
        if (this.field2059 != null && arg0 != null) {
            int var7 = -(this.field2084.field3742 * arg2 >> 8) + arg1 >> this.field2084.field3701;
            int var8 = arg3 - (this.field2084.field3803 * arg2 >> 8) >> this.field2084.field3701;
            return this.field2059.method182(var8, arg0, var7, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I[[[BZLya;IIIIIIIII)V", line = 51)
    public static final void method1015(int arg0, byte[][][] arg1, boolean arg2, class11 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field2066;
        if (arg10 != 0 && arg12 != 0) {
            if (arg10 == 9) {
                arg5 = arg5 + 1 & 3;
                arg10 = 1;
            }
            if (~arg10 == -11) {
                arg5 = 3 & arg5 + 3;
                arg10 = 1;
            }
            if (arg10 == 11) {
                arg10 = 8;
                arg5 = arg5 + 3 & 3;
            }
            if (!arg2) {
                arg3.method68(arg4, arg0, arg6, arg9, arg11, arg7, arg1[arg10 + -1][arg5], arg12, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lvd;IIII[[I[[II)V", line = 87)
    public class138(class258 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field2084 = arg0;
        this.field2077 = arg5;
        this.field2100 = new float[super.field5198 - -1][super.field5200 + 1];
        this.field2068 = arg2;
        this.field2096 = new float[super.field5198 + 1][super.field5200 + 1];
        this.field2089 = new class273[arg3][arg4][];
        this.field2092 = new byte[arg3 + 1][arg4 + 1];
        this.field2060 = new int[arg3][arg4][];
        this.field2069 = 1 << this.field2090;
        this.field2088 = new short[arg3 * arg4][];
        this.field2087 = new int[arg3][arg4][];
        this.field2067 = new int[arg3][arg4][];
        this.field2061 = new int[arg3][arg4][];
        this.field2057 = new byte[arg3][arg4];
        this.field2055 = new int[arg3][arg4][];
        this.field2099 = new float[super.field5198 + 1][super.field5200 + 1];
        for (int var9 = 1; ~super.field5200 < ~var9; ++var9) {
            for (int var10 = 1; ~var10 > ~super.field5198; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + var11 * var11 + var12 * var12)));
                this.field2100[var10][var9] = (float) var11 * var13;
                this.field2099[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field2096[var10][var9] = (float) var12 * var13;
            }
        }
        this.field2094 = new class517(128);
        if (~(16 & this.field2068) != -1) {
            this.field2059 = new class14(this.field2084, this);
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)V", line = 147)
    public final void method704(int arg0, int arg1) {
        ++field2064;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lwr;[I)V", line = 155)
    public final void method715(class531 arg0, int[] arg1) {
        ++field2086;
        this.field2075.method2958(new class181(this.field2084, this, arg0, arg1), (byte) 35);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)I", line = 174)
    public final int method718(int arg0, int arg1) {
        ++field2063;
        int var3 = arg0 >> super.field5197;
        int var4 = arg1 >> super.field5197;
        if (~var3 <= -1 && ~var4 <= -1 && ~(super.field5198 + -1) <= ~var3 && ~var4 >= ~(super.field5200 + -1)) {
            int var5 = arg0 & super.field5193 - 1;
            int var6 = super.field5193 + -1 & arg1;
            int var7 = (super.field5193 - var5) * this.field2077[var3][var4] - -(this.field2077[var3 + 1][var4] * var5) >> super.field5197;
            int var8 = (super.field5193 - var5) * this.field2077[var3][var4 - -1] + this.field2077[var3 - -1][var4 + 1] * var5 >> super.field5197;
            return (super.field5193 - var6) * var7 + var6 * var8 >> super.field5197;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "(IILba;)Lba;", line = 199)
    public final class502 method712(int arg0, int arg1, class502 arg2) {
        ++field2062;
        if ((1 & this.field2057[arg0][arg1]) == 0) {
            return null;
        } else {
            int var4 = super.field5193 >> this.field2084.field3701;
            class276 var5 = (class276) arg2;
            class276 var6;
            if (var5 != null && var5.method1720(var4, var4, -67)) {
                var6 = var5;
                var5.method1719(-115);
            } else {
                var6 = new class276(this.field2084, var4, var4);
            }
            var6.method1723((byte) 88, 0, var4, 0, var4);
            this.method1016((byte) 121, arg1, var6, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BILds;I)V", line = 238)
    private final void method1016(byte arg0, int arg1, class276 arg2, int arg3) {
        ++field2070;
        int[] var5 = this.field2055[arg3][arg1];
        int[] var6 = this.field2060[arg3][arg1];
        int var7 = var5.length;
        if (~var7 < ~this.field2084.field3852.length) {
            this.field2084.field3847 = new int[var7];
            this.field2084.field3852 = new int[var7];
        }
        int[] var8 = this.field2084.field3852;
        int[] var9 = this.field2084.field3847;
        for (int var10 = 0; var7 > var10; ++var10) {
            var8[var10] = class140.method1023(var5[var10], 255) >> this.field2084.field3701;
            var9[var10] = class140.method1023(255, var6[var10]) >> this.field2084.field3701;
        }
        int var11 = 0;
        while (var7 > var11) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if ((-var14 + var12) * (-var17 + var15) + -((var15 - var13) * (var16 - var14)) > 0) {
                arg2.method1722(var17, var15, var14, var12, var13, var16, true);
            }
        }
        if (arg0 <= 75) {
            this.method706((class502) null, 107, -56, 1, -106, true);
        }
    }

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 300)
    public final void method717(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field2065;
        if (arg3 != null && this.field2067 == null) {
            this.field2067 = new int[super.field5198][super.field5200][];
        }
        if (arg5 != null && this.field2073 == null) {
            this.field2073 = new int[super.field5198][super.field5200][];
        }
        this.field2055[arg0][arg1] = arg2;
        this.field2060[arg0][arg1] = arg4;
        this.field2061[arg0][arg1] = arg6;
        this.field2087[arg0][arg1] = arg7;
        if (this.field2073 != null) {
            this.field2073[arg0][arg1] = arg5;
        }
        if (this.field2067 != null) {
            this.field2067[arg0][arg1] = arg3;
        }
        class273[] var15 = this.field2089[arg0][arg1] = new class273[arg6.length];
        for (int var16 = 0; ~var16 > ~arg6.length; ++var16) {
            long var17 = (long) arg8[var16] | (long) (arg9[var16] << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28;
            class115 var19;
            for (var19 = this.field2094.method3059(108, var17); var19 != null; var19 = this.field2094.method3057(0)) {
                class273 var20 = (class273) var19;
                if (~arg8[var16] == ~var20.field4071 && (float) arg9[var16] == var20.field4067 && ~var20.field4069 == ~arg10 && var20.field4070 == arg11 && var20.field4064 == arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class273(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field2094.method3055(0, var17, var15[var16]);
            } else {
                var15[var16] = (class273) var19;
            }
        }
        if (arg13) {
            this.field2057[arg0][arg1] = (byte) class390.method2340(this.field2057[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field2101) {
            this.field2101 = arg6.length;
        }
        this.field2103 += arg6.length;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III[[ZZ)V", line = 369)
    public final void method711(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method1017(arg1, -1, arg0, 0, arg4, arg3, arg2);
        ++field2082;
    }

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "(Lba;IIIIZ)V", line = 377)
    public final void method706(class502 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2083;
        if (this.field2059 != null && arg0 != null) {
            int var7 = arg1 - (this.field2084.field3742 * arg2 >> 8) >> this.field2084.field3701;
            int var8 = -(this.field2084.field3803 * arg2 >> 8) + arg3 >> this.field2084.field3701;
            this.field2059.method186(0, arg0, var7, var8);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 396)
    public final void method714(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field2056;
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
        this.method717(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "(II)I", line = 486)
    public final int method707(int arg0, int arg1) {
        ++field2058;
        return this.field2077[arg0][arg1];
    }

    @OriginalMember(owner = "client!ne", name = "ca", descriptor = "()V", line = 500)
    public final void method705() {
        ++field2081;
        if (this.field2103 <= 0) {
            this.field2059 = null;
        } else {
            byte[][] var1 = new byte[super.field5198 - -1][super.field5200 + 1];
            for (int var2 = 1; super.field5198 > var2; ++var2) {
                for (int var103 = 1; ~var103 > ~super.field5200; ++var103) {
                    var1[var2][var103] = (byte) ((this.field2092[var2][var103 - -1] >> 3) + (this.field2092[var2][var103] >> 1) + (this.field2092[var2 + -1][var103] >> 2) + (this.field2092[var2][var103 + -1] >> 2) + (this.field2092[var2 + 1][var103] >> 3));
                }
            }
            this.field2102 = new class273[this.field2094.method3062(0)];
            this.field2094.method3060(-31, this.field2102);
            for (int var3 = 0; this.field2102.length > var3; ++var3) {
                this.field2102[var3].method1699(this.field2103, true);
            }
            int var4 = 24;
            if (this.field2073 != null) {
                var4 += 4;
            }
            if ((7 & this.field2068) != 0) {
                var4 += 12;
            }
            NativeBuffer var5 = this.field2084.field3700.method2850(this.field2103 * var4);
            NativeStream var6 = new NativeStream(var5);
            class273[] var7 = new class273[this.field2103];
            int var8 = class45.method352((byte) -118, this.field2103 / 4);
            if (var8 < 1) {
                var8 = 1;
            }
            class517 var9 = new class517(var8);
            class273[] var10 = new class273[this.field2101];
            for (int var11 = 0; super.field5198 > var11; ++var11) {
                for (int var30 = 0; var30 < super.field5200; ++var30) {
                    if (this.field2061[var11][var30] != null) {
                        class273[] var31 = this.field2089[var11][var30];
                        int[] var32 = this.field2055[var11][var30];
                        int[] var33 = this.field2060[var11][var30];
                        int[] var34 = this.field2087[var11][var30];
                        int[] var35 = this.field2061[var11][var30];
                        int[] var36 = this.field2067 != null ? this.field2067[var11][var30] : null;
                        int[] var37 = this.field2073 != null ? this.field2073[var11][var30] : null;
                        if (var34 == null) {
                            var34 = var35;
                        }
                        float var38 = this.field2100[var11][var30];
                        float var39 = this.field2099[var11][var30];
                        float var40 = this.field2096[var11][var30];
                        float var41 = this.field2100[var11][var30 + 1];
                        float var42 = this.field2099[var11][var30 - -1];
                        float var43 = this.field2096[var11][var30 - -1];
                        float var44 = this.field2100[var11 - -1][var30 + 1];
                        float var45 = this.field2099[var11 + 1][var30 + 1];
                        float var46 = this.field2096[var11 + 1][var30 - -1];
                        float var47 = this.field2100[var11 + 1][var30];
                        float var48 = this.field2099[var11 + 1][var30];
                        float var49 = this.field2096[var11 - -1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = 255 & var1[var11][var30 + 1];
                        int var52 = 255 & var1[var11 + 1][var30 + 1];
                        int var53 = var1[var11 + 1][var30] & 255;
                        int var54 = 0;
                        label339: for (int var55 = 0; ~var55 > ~var35.length; ++var55) {
                            class273 var101 = var31[var55];
                            for (int var102 = 0; var102 < var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label339;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field2088[super.field5198 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; var35.length > var57; ++var57) {
                            int var58 = (var11 << super.field5197) + var32[var57];
                            int var59 = (var30 << super.field5197) + var33[var57];
                            int var60 = var58 >> this.field2090;
                            int var61 = var59 >> this.field2090;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 != null ? var36[var57] : 0;
                            long var65 = (long) var61 | (long) var62 << 32 | (long) var63 << 48 | (long) (var60 << 16);
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71;
                            float var72;
                            float var73;
                            int var74;
                            if (~var67 == -1 && var68 == 0) {
                                var71 = var40;
                                var72 = var39;
                                var73 = var38;
                                var74 = var69 - var50;
                            } else if (var67 == 0 && ~super.field5193 == ~var68) {
                                var72 = var42;
                                var74 = var69 - var51;
                                var71 = var43;
                                var73 = var41;
                            } else if (super.field5193 == var67 && super.field5193 == var68) {
                                var74 = var69 - var52;
                                var71 = var46;
                                var73 = var44;
                                var72 = var45;
                            } else if (~super.field5193 == ~var67 && ~var68 == -1) {
                                var72 = var48;
                                var73 = var47;
                                var71 = var49;
                                var74 = var69 - var53;
                            } else {
                                float var75 = (float) var67 / (float) super.field5193;
                                float var76 = (float) var68 / (float) super.field5193;
                                float var77 = (var47 - var38) * var75 + var38;
                                float var78 = (-var39 + var48) * var75 + var39;
                                float var79 = (-var40 + var49) * var75 + var40;
                                float var80 = (var44 - var41) * var75 + var41;
                                float var81 = (-var42 + var45) * var75 + var42;
                                float var82 = (-var43 + var46) * var75 + var43;
                                var72 = (-var78 + var81) * var76 + var78;
                                var73 = (var80 - var77) * var76 + var77;
                                var71 = (-var79 + var82) * var76 + var79;
                                int var83 = ((-var50 + var53) * var67 >> super.field5197) + var50;
                                int var84 = ((-var51 + var52) * var67 >> super.field5197) + var51;
                                var74 = var69 - (var83 - -((-var83 + var84) * var68 >> super.field5197));
                            }
                            float var85 = 1.0F;
                            if (~var62 != 0) {
                                int var86 = (var62 & 127) * var74 >> 7;
                                if (var86 < 2) {
                                    var86 = 2;
                                } else if (var86 > 126) {
                                    var86 = 126;
                                }
                                var70 = class461.field6721[var86 | 65408 & var62];
                                if ((this.field2068 & 7) == 0) {
                                    float var87 = this.field2084.field3804[2] * var71 + this.field2084.field3804[0] * var73 + this.field2084.field3804[1] * var72;
                                    var85 = this.field2084.field3771 + (!(var87 > 0.0F) ? this.field2084.field3827 : this.field2084.field3811) * var87;
                                }
                            }
                            class115 var88 = null;
                            if ((this.field2069 + -1 & var58) == 0 && (this.field2069 - 1 & var59) == 0) {
                                var88 = var9.method3059(127, var65);
                            }
                            int var89;
                            if (var88 != null) {
                                var56[var57] = ((class489) var88).field7287;
                                var89 = var56[var57] & 65535;
                                if (~var62 != 0 && ~var7[var89].field1739 < ~var31[var57].field1739) {
                                    var7[var89] = var31[var57];
                                }
                            } else {
                                int var91;
                                if (var62 != var63) {
                                    int var90 = (127 & var63) * var74 >> 7;
                                    if (~var90 <= -3) {
                                        if (~var90 < -127) {
                                            var90 = 126;
                                        }
                                    } else {
                                        var90 = 2;
                                    }
                                    var91 = class461.field6721[65408 & var63 | var90];
                                    if (~(7 & this.field2068) == -1) {
                                        float var92 = this.field2084.field3804[2] * var71 + this.field2084.field3804[0] * var73 + this.field2084.field3804[1] * var72;
                                        float var93 = (!(var85 > 0.0F) ? this.field2084.field3827 : this.field2084.field3811) * var85 + this.field2084.field3771;
                                        int var94 = (var91 & 16757504) >> 16;
                                        int var95 = (var91 & 65506) >> 8;
                                        int var96 = 255 & var91;
                                        int var97 = (int) ((float) var94 * var93);
                                        int var98 = (int) ((float) var95 * var93);
                                        if (~var97 <= -1) {
                                            if (var97 > 255) {
                                                var97 = 255;
                                            }
                                        } else {
                                            var97 = 0;
                                        }
                                        if (var98 >= 0) {
                                            if (var98 > 255) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        int var99 = (int) ((float) var96 * var93);
                                        if (var99 >= 0) {
                                            if (~var99 < -256) {
                                                var99 = 255;
                                            }
                                        } else {
                                            var99 = 0;
                                        }
                                        var91 = var99 | var97 << 16 | var98 << 8;
                                    }
                                } else {
                                    var91 = var70;
                                }
                                if (this.field2084.field3821) {
                                    var6.method2857((float) var58);
                                    var6.method2857((float) (var64 + this.method718(var58, var59)));
                                    var6.method2857((float) var59);
                                    var6.method2852((byte) (var91 >> 16));
                                    var6.method2852((byte) (var91 >> 8));
                                    var6.method2852((byte) var91);
                                    var6.method2852(-1);
                                    var6.method2857((float) var58);
                                    var6.method2857((float) var59);
                                    if (this.field2073 != null) {
                                        var6.method2857((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if ((7 & this.field2068) != 0) {
                                        var6.method2857(var73);
                                        var6.method2857(var72);
                                        var6.method2857(var71);
                                    }
                                } else {
                                    var6.method2858((float) var58);
                                    var6.method2858((float) (var64 + this.method718(var58, var59)));
                                    var6.method2858((float) var59);
                                    var6.method2852((byte) (var91 >> 16));
                                    var6.method2852((byte) (var91 >> 8));
                                    var6.method2852((byte) var91);
                                    var6.method2852(-1);
                                    var6.method2858((float) var58);
                                    var6.method2858((float) var59);
                                    if (this.field2073 != null) {
                                        var6.method2858((float) (var37 == null ? 0 : var37[var57] - 1));
                                    }
                                    if (~(7 & this.field2068) != -1) {
                                        var6.method2858(var73);
                                        var6.method2858(var72);
                                        var6.method2858(var71);
                                    }
                                }
                                var89 = this.field2072++;
                                var56[var57] = (short) var89;
                                if (var62 != -1) {
                                    var7[var89] = var31[var57];
                                }
                                var9.method3055(0, var65, new class489(var56[var57]));
                            }
                            for (int var100 = 0; var54 > var100; ++var100) {
                                var10[var100].method1700(-256, var70, var74, var85, var89);
                            }
                            ++this.field2078;
                        }
                    }
                }
            }
            for (int var12 = 0; ~var12 > ~this.field2072; ++var12) {
                class273 var29 = var7[var12];
                if (var29 != null) {
                    var29.method1704(30626, var12);
                }
            }
            for (int var13 = 0; var13 < super.field5198; ++var13) {
                for (int var18 = 0; ~super.field5200 < ~var18; ++var18) {
                    short[] var19 = this.field2088[super.field5198 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (var21 < var19.length) {
                            int var22 = var19[var21++] & 65535;
                            int var23 = 65535 & var19[var21++];
                            int var24 = 65535 & var19[var21++];
                            class273 var25 = var7[var22];
                            class273 var26 = var7[var23];
                            class273 var27 = var7[var24];
                            class273 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method1705(-11255, var20, var13, var18);
                            }
                            if (var26 != null) {
                                var26.method1705(-11255, var20, var13, var18);
                                if (var28 == null || var28.field1739 > var26.field1739) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method1705(-11255, var20, var13, var18);
                                if (var28 == null || var27.field1739 < var28.field1739) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method1704(30626, var22);
                                }
                                if (var26 != null) {
                                    var28.method1704(30626, var23);
                                }
                                if (var27 != null) {
                                    var28.method1704(30626, var24);
                                }
                                var28.method1705(-11255, var20, var13, var18);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method2855();
            this.field2091 = this.field2084.method1558(var5, false, var6.method2854(), var4, 8960);
            this.field2093 = new class426(this.field2091, 5126, 3, 0);
            this.field2097 = new class426(this.field2091, 5121, 4, 12);
            byte var14;
            if (this.field2073 == null) {
                this.field2095 = new class426(this.field2091, 5126, 2, 16);
                var14 = 24;
            } else {
                this.field2095 = new class426(this.field2091, 5126, 3, 16);
                var14 = 28;
            }
            if (~(this.field2068 & 7) != -1) {
                this.field2098 = new class426(this.field2091, 5126, 3, var14);
            }
            long[] var15 = new long[this.field2102.length];
            for (int var16 = 0; ~var16 > ~this.field2102.length; ++var16) {
                class273 var17 = this.field2102[var16];
                var15[var16] = var17.field1739;
                var17.method1701(this.field2072, false);
            }
            class129.method949(var15, this.field2102, false);
            if (this.field2059 != null) {
                this.field2059.method184(true);
            }
        }
        this.field2100 = this.field2099 = this.field2096 = null;
        this.field2092 = null;
        this.field2089 = null;
        this.field2067 = null;
        this.field2055 = this.field2060 = null;
        this.field2087 = null;
        this.field2061 = null;
        this.field2073 = null;
        this.field2094 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIZ[[ZI)V", line = 1080)
    private final void method1017(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean[][] arg5, int arg6) {
        if (arg3 != 0) {
            this.field2084 = null;
        }
        if (this.field2102 != null) {
            float var8 = this.field2084.field3806;
            float var9 = this.field2084.field3729;
            int var10 = arg6 + arg6 + 1;
            int var11 = var10 * var10;
            if (this.field2084.field3850.length < var11) {
                this.field2084.field3850 = new int[var11];
            }
            if (this.field2084.field3733.field6868.length < this.field2078 * 2) {
                this.field2084.field3733 = new class299(this.field2078 * 2);
            }
            int var12 = -arg6 + arg2;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = -arg6 + arg0;
            int var15 = var14;
            if (var14 < 0) {
                var14 = 0;
            }
            int var16 = arg2 + arg6;
            if (~var16 < ~(super.field5198 - 1)) {
                var16 = super.field5198 + -1;
            }
            int var17 = arg0 - -arg6;
            if (~var17 < ~(super.field5200 + -1)) {
                var17 = super.field5200 + -1;
            }
            int var18 = 0;
            int[] var19 = this.field2084.field3850;
            for (int var20 = var12; ~var16 <= ~var20; ++var20) {
                boolean[] var26 = arg5[-var13 + var20];
                for (int var27 = var14; ~var17 <= ~var27; ++var27) {
                    if (var26[var27 - var15]) {
                        var19[var18++] = super.field5198 * var27 + var20;
                    }
                }
            }
            if (arg1 != -1) {
                this.field2084.method1555(122, (float) arg1);
                this.field2084.method1572(12770);
            } else {
                this.field2084.method1566((byte) 127);
            }
            this.field2084.method1574((this.field2068 & 7) != 0, -100);
            for (int var21 = 0; ~var21 > ~this.field2102.length; ++var21) {
                this.field2102[var21].method1703(var18, 983793672, var19);
            }
            if (!this.field2075.method2954((byte) -65)) {
                int var22 = this.field2084.field3840;
                int var23 = this.field2084.field3831;
                this.field2084.method141(0, var23, this.field2084.field3815);
                this.field2084.method154(var9, var8 - 4.0F);
                this.field2084.method1574(false, -63);
                this.field2084.method1557(18546, false);
                this.field2084.method1594(128, 256);
                this.field2084.method1613(-2, -1);
                this.field2084.method1546(arg3 + -2, this.field2084.field3788);
                this.field2084.method1576(8448, 7681, (byte) 41);
                this.field2084.method1590(770, 34166, true, 0);
                this.field2084.method1556(770, 34167, 0, 34184);
                for (class115 var24 = this.field2075.method2957(arg3 ^ -74); var24 != null; var24 = this.field2075.method2947(arg3 ^ 25)) {
                    class181 var25 = (class181) var24;
                    var25.method1237(arg5, arg6, true, arg2, arg0);
                }
                this.field2084.method1590(768, 5890, true, 0);
                this.field2084.method1556(770, 5890, 0, 34184);
                this.field2084.method1546(arg3 ^ -2, (class271) null);
                this.field2084.method141(var22, var23, this.field2084.field3815);
            }
            if (this.field2059 != null) {
                this.field2084.method154(var9, var8 + -8.0F);
                this.field2084.method1566((byte) 127);
                this.field2084.method1597(this.field2093, (class426) null, arg3 + -1, (class426) null, this.field2095);
                this.field2059.method187((byte) 124, arg4, arg5, arg2, arg0, arg6);
            }
            this.field2084.method154(var9, var8);
        }
        ++field2085;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIII[[Z)V", line = 1233)
    public final void method713(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field2074;
        if (~this.field2103 < -1) {
            this.field2084.method1544(1097841176);
            this.field2084.method1596(false, false);
            this.field2084.method1574(false, -90);
            this.field2084.method1571(true, false);
            this.field2084.method1557(18546, false);
            this.field2084.method1594(0, 256);
            this.field2084.method1613(-2, -1);
            this.field2084.method1546(-2, (class271) null);
            class16.field240[7] = 0.0F;
            class16.field240[0] = (float) arg2 / ((float) super.field5193 * 128.0F * (float) this.field2084.field3595);
            class16.field240[2] = 0.0F;
            class16.field240[8] = 0.0F;
            class16.field240[11] = 0.0F;
            class16.field240[4] = 0.0F;
            class16.field240[10] = 0.0F;
            class16.field240[15] = 1.0F;
            class16.field240[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field2084.field3595) + -1.0F;
            class16.field240[5] = (float) arg2 / ((float) super.field5193 * 128.0F * (float) this.field2084.field3610);
            class16.field240[14] = 0.0F;
            class16.field240[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field2084.field3610;
            class16.field240[3] = 0.0F;
            class16.field240[9] = 0.0F;
            class16.field240[1] = 0.0F;
            class16.field240[6] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class16.field240, 0);
            class16.field240[6] = 1.0F;
            class16.field240[4] = 0.0F;
            class16.field240[3] = 0.0F;
            class16.field240[12] = 0.0F;
            class16.field240[2] = 0.0F;
            class16.field240[7] = 0.0F;
            class16.field240[13] = 0.0F;
            class16.field240[0] = 1.0F;
            class16.field240[14] = 0.0F;
            class16.field240[5] = 0.0F;
            class16.field240[11] = 0.0F;
            class16.field240[1] = 0.0F;
            class16.field240[10] = 0.0F;
            class16.field240[8] = 0.0F;
            class16.field240[9] = 1.0F;
            class16.field240[15] = 1.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class16.field240, 0);
            if (~(this.field2068 & 7) == -1) {
                this.field2084.method1574(false, -117);
            } else {
                this.field2084.method1574(true, -88);
                this.field2084.method1538((byte) -10);
            }
            this.field2084.method1597(this.field2093, this.field2097, -1, this.field2098, this.field2095);
            if (~(this.field2078 * 2) < ~this.field2084.field3733.field6868.length) {
                this.field2084.field3733 = new class299(this.field2078 * 2);
            } else {
                this.field2084.field3733.field6830 = 0;
            }
            int var9 = 0;
            class299 var10 = this.field2084.field3733;
            if (!this.field2084.field3821) {
                for (int var11 = arg4; ~var11 > ~arg6; ++var11) {
                    int var12 = super.field5198 * var11 + arg3;
                    for (int var13 = arg3; var13 < arg5; ++var13) {
                        if (arg7[-arg3 + var13][var11 - arg4]) {
                            short[] var14 = this.field2088[var12];
                            if (var14 != null) {
                                for (int var15 = 0; var14.length > var15; ++var15) {
                                    var10.method2760(true, var14[var15] & 65535);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; var16 < arg6; ++var16) {
                    int var18 = super.field5198 * var16 + arg3;
                    for (int var19 = arg3; ~var19 > ~arg5; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field2088[var18];
                            if (var20 != null) {
                                for (int var21 = 0; ~var20.length < ~var21; ++var21) {
                                    var10.method2777((byte) 74, 65535 & var20[var21]);
                                    ++var9;
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (var9 > 0) {
                class448 var17 = new class448(this.field2084, 5123, var10.field6868, var10.field6830);
                this.field2084.method1547(23988, 4, var17, 0, var9);
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V", line = 1402)
    public static void method1018(byte arg0) {
        field2071 = null;
        int var1 = 102 / ((arg0 - -29) / 34);
    }
}
