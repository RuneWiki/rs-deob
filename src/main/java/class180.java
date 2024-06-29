import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class180 extends class251 {

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "Ltu;")
    private class7 field2318 = new class7();

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "[[I")
    private int[][] field2310;

    @OriginalMember(owner = "client!eh", name = "Q", descriptor = "I")
    private int field2344;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "Lgk;")
    public class463 field2314;

    @OriginalMember(owner = "client!eh", name = "K", descriptor = "[[[I")
    private int[][][] field2338;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "[[[I")
    public int[][][] field2309;

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "I")
    private int field2337;

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "[[S")
    public short[][] field2321;

    @OriginalMember(owner = "client!eh", name = "O", descriptor = "[[[I")
    private int[][][] field2342;

    @OriginalMember(owner = "client!eh", name = "db", descriptor = "[[F")
    private float[][] field2357;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
    public int field2317;

    @OriginalMember(owner = "client!eh", name = "Z", descriptor = "[[F")
    private float[][] field2353;

    @OriginalMember(owner = "client!eh", name = "gb", descriptor = "[[B")
    private byte[][] field2360;

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "[[B")
    private byte[][] field2327;

    @OriginalMember(owner = "client!eh", name = "V", descriptor = "[[F")
    private float[][] field2349;

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "[[[I")
    public int[][][] field2343;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "[[[I")
    private int[][][] field2315;

    @OriginalMember(owner = "client!eh", name = "S", descriptor = "[[[Luo;")
    private class133[][][] field2346;

    @OriginalMember(owner = "client!eh", name = "fb", descriptor = "Ljr;")
    private class357 field2359;

    @OriginalMember(owner = "client!eh", name = "w", descriptor = "Lhv;")
    private class147 field2324;

    @OriginalMember(owner = "client!eh", name = "N", descriptor = "[I")
    public static int[] field2341 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!eh", name = "F", descriptor = "Lcr;")
    public static class362 field2333 = new class362();

    @OriginalMember(owner = "client!eh", name = "R", descriptor = "[J")
    public static long[] field2345 = new long[256];

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!eh", name = "u", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!eh", name = "v", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!eh", name = "x", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!eh", name = "y", descriptor = "I")
    private int field2326;

    @OriginalMember(owner = "client!eh", name = "A", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!eh", name = "B", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!eh", name = "D", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!eh", name = "E", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!eh", name = "G", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!eh", name = "H", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!eh", name = "I", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!eh", name = "L", descriptor = "I")
    private int field2339;

    @OriginalMember(owner = "client!eh", name = "M", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!eh", name = "U", descriptor = "I")
    private int field2348;

    @OriginalMember(owner = "client!eh", name = "eb", descriptor = "I")
    private int field2358;

    @OriginalMember(owner = "client!eh", name = "W", descriptor = "Ltp;")
    public class139 field2350;

    @OriginalMember(owner = "client!eh", name = "Y", descriptor = "Ltp;")
    public class139 field2352;

    @OriginalMember(owner = "client!eh", name = "bb", descriptor = "Ltp;")
    public class139 field2355;

    @OriginalMember(owner = "client!eh", name = "cb", descriptor = "Ltp;")
    private class139 field2356;

    @OriginalMember(owner = "client!eh", name = "ab", descriptor = "Lhh;")
    private class500 field2354;

    @OriginalMember(owner = "client!eh", name = "X", descriptor = "[Luo;")
    private class133[] field2351;

    @OriginalMember(owner = "client!eh", name = "C", descriptor = "[[[I")
    private int[][][] field2330;

    @OriginalMember(owner = "client!eh", name = "T", descriptor = "[[[I")
    public static int[][][] field2347;

    @OriginalMember(owner = "client!eh", name = "U", descriptor = "(Lj;IIIIZ)V")
    public final void method1170(class254 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2325;
        if (this.field2324 != null && arg0 != null) {
            int var7 = -(this.field2314.field6798 * arg2 >> 8) + arg1 >> this.field2314.field6689;
            int var8 = -(this.field2314.field6811 * arg2 >> 8) + arg3 >> this.field2314.field6689;
            this.field2324.method1019(var8, 1, arg0, var7);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZBILdn;III)V")
    public static final void method1171(boolean arg0, byte arg1, int arg2, class201 arg3, int arg4, int arg5, int arg6) {
        class368.field4742 = arg0;
        class520.field7691 = 1;
        class411.field5487 = arg4;
        class298.field3864 = arg6;
        ++field2316;
        class291.field3719 = arg5;
        class181.field2362 = arg3;
        class264.field3347 = arg2;
        if (arg1 != 46) {
            method1184(37);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lj;IIIIZ)Z")
    public final boolean method1172(class254 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2335;
        if (this.field2324 != null && arg0 != null) {
            int var7 = -(this.field2314.field6798 * arg2 >> 8) + arg1 >> this.field2314.field6689;
            int var8 = -(this.field2314.field6811 * arg2 >> 8) + arg3 >> this.field2314.field6689;
            return this.field2324.method1018(13681, var7, var8, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILcb;II)V")
    private final void method1173(int arg0, class57 arg1, int arg2, int arg3) {
        ++field2322;
        int[] var5 = this.field2309[arg0][arg3];
        int[] var6 = this.field2343[arg0][arg3];
        int var7 = var5.length;
        if (~class415.field5528.length > ~var7) {
            class415.field5528 = new int[var7];
            class242.field3106 = new int[var7];
        }
        for (int var8 = 0; ~var7 < ~var8; ++var8) {
            class415.field5528[var8] = class60.method339(var5[var8], 255) >> this.field2314.field6689;
            class242.field3106[var8] = class60.method339(var6[var8], 255) >> this.field2314.field6689;
        }
        if (arg2 != -8082) {
            this.field2318 = null;
        }
        int var9 = 0;
        while (var9 < var7) {
            int var10 = class415.field5528[var9];
            int var11 = class242.field3106[var9++];
            int var12 = class415.field5528[var9];
            int var13 = class242.field3106[var9++];
            int var14 = class415.field5528[var9];
            int var15 = class242.field3106[var9++];
            if (~((-var12 + var10) * (-var15 + var13) + -((var13 - var11) * (-var12 + var14))) < -1) {
                arg1.method325(var13, var11, var10, var12, var15, var14, arg2 ^ 27147);
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lgk;IIII[[I[[II)V")
    public class180(class463 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field2310 = arg5;
        this.field2344 = super.field3193 - 2;
        this.field2314 = arg0;
        this.field2338 = new int[arg3][arg4][];
        this.field2309 = new int[arg3][arg4][];
        this.field2337 = 1 << this.field2344;
        this.field2321 = new short[arg3 * arg4][];
        this.field2342 = new int[arg3][arg4][];
        this.field2357 = new float[super.field3197 + 1][super.field3194 + 1];
        this.field2317 = arg2;
        this.field2353 = new float[super.field3197 + 1][super.field3194 + 1];
        this.field2360 = new byte[arg3 - -1][arg4 - -1];
        this.field2327 = new byte[arg3][arg4];
        this.field2349 = new float[super.field3197 - -1][super.field3194 + 1];
        this.field2343 = new int[arg3][arg4][];
        this.field2315 = new int[arg3][arg4][];
        this.field2346 = new class133[arg3][arg4][];
        for (int var9 = 1; ~var9 > ~super.field3194; ++var9) {
            for (int var10 = 1; var10 < super.field3197; ++var10) {
                int var11 = arg6[var10 - -1][var9] - arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] - arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + (var11 * var11 - -(arg7 * 4 * arg7)))));
                this.field2349[var10][var9] = (float) var11 * var13;
                this.field2353[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field2357[var10][var9] = (float) var12 * var13;
            }
        }
        this.field2359 = new class357(128);
        if (~(16 & this.field2317) != -1) {
            this.field2324 = new class147(this.field2314, this);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V")
    public final void method1174(int arg0, int arg1) {
        ++field2320;
    }

    @OriginalMember(owner = "client!eh", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1175(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg3 != null && this.field2342 == null) {
            this.field2342 = new int[super.field3197][super.field3194][];
        }
        ++field2319;
        if (arg5 != null && this.field2330 == null) {
            this.field2330 = new int[super.field3197][super.field3194][];
        }
        this.field2309[arg0][arg1] = arg2;
        this.field2343[arg0][arg1] = arg4;
        this.field2315[arg0][arg1] = arg6;
        this.field2338[arg0][arg1] = arg7;
        if (this.field2330 != null) {
            this.field2330[arg0][arg1] = arg5;
        }
        if (this.field2342 != null) {
            this.field2342[arg0][arg1] = arg3;
        }
        class133[] var15 = this.field2346[arg0][arg1] = new class133[arg6.length];
        for (int var16 = 0; var16 < arg6.length; ++var16) {
            long var17 = (long) (arg9[var16] << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg8[var16];
            class508 var19;
            for (var19 = this.field2359.method2085(var17, -5423); var19 != null; var19 = this.field2359.method2093(0)) {
                class133 var20 = (class133) var19;
                if (arg8[var16] == var20.field1812 && (float) arg9[var16] == var20.field1794 && ~var20.field1802 == ~arg10 && ~var20.field1799 == ~arg11 && var20.field1805 == arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class133(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field2359.method2096(var17, var15[var16], (byte) 76);
            } else {
                var15[var16] = (class133) var19;
            }
        }
        if (arg13) {
            this.field2327[arg0][arg1] = (byte) class31.method213(this.field2327[arg0][arg1], 1);
        }
        if (~this.field2358 > ~arg6.length) {
            this.field2358 = arg6.length;
        }
        this.field2348 += arg6.length;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1176(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field2336;
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
        this.method1175(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III[[ZZ)V")
    public final void method1177(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method1179(arg0, -1, arg3, arg1, false, arg2, arg4);
        ++field2331;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field2334;
        if (~this.field2348 < -1) {
            this.field2314.method2776((byte) -99);
            this.field2314.method2766(-32, false);
            this.field2314.method2797(false, (byte) -22);
            this.field2314.method2800(8629, false);
            this.field2314.method2782(-17939, false);
            this.field2314.method2760(0, 117);
            this.field2314.method2755(-2, true);
            this.field2314.method2771((class31) null, -16785);
            class115.field1612[14] = 0.0F;
            class115.field1612[9] = 0.0F;
            class115.field1612[5] = (float) arg2 / ((float) super.field3198 * 128.0F * (float) this.field2314.field6677);
            class115.field1612[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field2314.field6677;
            class115.field1612[8] = 0.0F;
            class115.field1612[6] = 0.0F;
            class115.field1612[12] = -(((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field2314.field6633) + -1.0F;
            class115.field1612[3] = 0.0F;
            class115.field1612[11] = 0.0F;
            class115.field1612[7] = 0.0F;
            class115.field1612[15] = 1.0F;
            class115.field1612[1] = 0.0F;
            class115.field1612[10] = 0.0F;
            class115.field1612[4] = 0.0F;
            class115.field1612[2] = 0.0F;
            class115.field1612[0] = (float) arg2 / ((float) super.field3198 * 128.0F * (float) this.field2314.field6633);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class115.field1612, 0);
            class115.field1612[10] = 0.0F;
            class115.field1612[12] = 0.0F;
            class115.field1612[9] = 1.0F;
            class115.field1612[14] = 0.0F;
            class115.field1612[4] = 0.0F;
            class115.field1612[11] = 0.0F;
            class115.field1612[5] = 0.0F;
            class115.field1612[15] = 1.0F;
            class115.field1612[7] = 0.0F;
            class115.field1612[1] = 0.0F;
            class115.field1612[6] = 1.0F;
            class115.field1612[3] = 0.0F;
            class115.field1612[0] = 1.0F;
            class115.field1612[2] = 0.0F;
            class115.field1612[8] = 0.0F;
            class115.field1612[13] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class115.field1612, 0);
            if (~(this.field2317 & 7) != -1) {
                this.field2314.method2797(true, (byte) -22);
                this.field2314.method2728(-114);
            } else {
                this.field2314.method2797(false, (byte) -22);
            }
            this.field2314.method2788(this.field2355, this.field2352, this.field2356, (byte) -35, this.field2350);
            if (this.field2326 * 2 <= class164.field2129.field1223.length) {
                class164.field2129.field1176 = 0;
            } else {
                class164.field2129 = new class88(this.field2326 * 2);
            }
            int var9 = 0;
            if (!this.field2314.field6759) {
                for (int var10 = arg4; ~arg6 < ~var10; ++var10) {
                    int var11 = super.field3197 * var10 + arg3;
                    for (int var12 = arg3; arg5 > var12; ++var12) {
                        if (arg7[-arg3 + var12][-arg4 + var10]) {
                            short[] var13 = this.field2321[var11];
                            if (var13 != null) {
                                for (int var14 = 0; var13.length > var14; ++var14) {
                                    ++var9;
                                    class164.field2129.method564(65535 & var13[var14], 595249544);
                                }
                            }
                        }
                        ++var11;
                    }
                }
            } else {
                for (int var15 = arg4; ~var15 > ~arg6; ++var15) {
                    int var17 = super.field3197 * var15 - -arg3;
                    for (int var18 = arg3; arg5 > var18; ++var18) {
                        if (arg7[var18 - arg3][-arg4 + var15]) {
                            short[] var19 = this.field2321[var17];
                            if (var19 != null) {
                                for (int var20 = 0; var20 < var19.length; ++var20) {
                                    ++var9;
                                    class164.field2129.method609(65535 & var19[var20], -87);
                                }
                            }
                        }
                        ++var17;
                    }
                }
            }
            if (~var9 < -1) {
                class485 var16 = new class485(this.field2314, 5123, class164.field2129.field1223, class164.field2129.field1176);
                this.field2314.method2769(0, var16, 4, 0, var9);
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II[[ZIZIZ)V")
    private final void method1179(int arg0, int arg1, boolean[][] arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        if (!arg4) {
            ++field2332;
            if (this.field2351 != null) {
                float var8 = this.field2314.field6743;
                float var9 = this.field2314.field6816;
                int var10 = arg5 - -arg5 - -1;
                int var11 = var10 * var10;
                if (~var11 < ~class204.field2672.length) {
                    class204.field2672 = new int[var11];
                }
                if (~(this.field2326 * 2) < ~class164.field2129.field1223.length) {
                    class164.field2129 = new class88(this.field2326 * 2);
                }
                int var12 = -arg5 + arg0;
                int var13 = var12;
                if (~var12 > -1) {
                    var12 = 0;
                }
                int var14 = -arg5 + arg3;
                int var15 = var14;
                if (var14 < 0) {
                    var14 = 0;
                }
                int var16 = arg0 + arg5;
                if (var16 > super.field3197 + -1) {
                    var16 = super.field3197 - 1;
                }
                int var17 = arg3 + arg5;
                class273.field3466 = 0;
                if (~var17 < ~(super.field3194 + -1)) {
                    var17 = super.field3194 + -1;
                }
                for (int var18 = var12; ~var18 >= ~var16; ++var18) {
                    boolean[] var24 = arg2[-var13 + var18];
                    for (int var25 = var14; var17 >= var25; ++var25) {
                        if (var24[-var15 + var25]) {
                            class204.field2672[class273.field3466++] = super.field3197 * var25 + var18;
                        }
                    }
                }
                if (arg1 == -1) {
                    this.field2314.method2793((byte) 55);
                } else {
                    this.field2314.method2748(false, (float) arg1);
                    this.field2314.method2726(16);
                }
                this.field2314.method2797(~(7 & this.field2317) != -1, (byte) -22);
                for (int var19 = 0; ~var19 > ~this.field2351.length; ++var19) {
                    this.field2351[var19].method937(class273.field3466, false, class204.field2672);
                }
                if (!this.field2318.method38((byte) 63)) {
                    int var20 = this.field2314.field6720;
                    int var21 = this.field2314.field6810;
                    this.field2314.method842(0, var21, this.field2314.field6724);
                    this.field2314.method913(var9, var8 - 4.0F);
                    this.field2314.method2797(false, (byte) -22);
                    this.field2314.method2782(-17939, false);
                    this.field2314.method2760(128, 126);
                    this.field2314.method2755(-2, !arg4);
                    this.field2314.method2771(this.field2314.field6746, -16785);
                    this.field2314.method2794(8448, 7681, true);
                    this.field2314.method2781(34166, 0, 2479, 770);
                    this.field2314.method2775(770, 34167, 0, -90);
                    for (class508 var22 = this.field2318.method49(41); var22 != null; var22 = this.field2318.method46((byte) 19)) {
                        class517 var23 = (class517) var22;
                        var23.method3068(arg0, 0, arg3, arg2, arg5);
                    }
                    this.field2314.method2781(5890, 0, 2479, 768);
                    this.field2314.method2775(770, 5890, 0, -112);
                    this.field2314.method2771((class31) null, -16785);
                    this.field2314.method842(var20, var21, this.field2314.field6724);
                }
                if (this.field2324 != null) {
                    this.field2314.method913(var9, var8 + -8.0F);
                    this.field2314.method2793((byte) 58);
                    this.field2314.method2788((class139) null, this.field2352, (class139) null, (byte) -35, this.field2350);
                    this.field2324.method1013(arg5, arg0, 127, arg3, arg6, arg2);
                }
                this.field2314.method913(var9, var8);
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "O", descriptor = "(IILj;)Lj;")
    public final class254 method1180(int arg0, int arg1, class254 arg2) {
        ++field2311;
        if (~(1 & this.field2327[arg0][arg1]) == -1) {
            return null;
        } else {
            int var4 = super.field3198 >> this.field2314.field6689;
            class57 var5 = (class57) arg2;
            class57 var6;
            if (var5 != null && var5.method327(var4, (byte) -106, var4)) {
                var6 = var5;
                var5.method328(false);
            } else {
                var6 = new class57(this.field2314, var4, var4);
            }
            var6.method330(var4, 0, (byte) -127, var4, 0);
            this.method1173(arg0, var6, -8082, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!eh", name = "SA", descriptor = "(Lj;IIIIZ)V")
    public final void method1181(class254 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2312;
        if (this.field2324 != null && arg0 != null) {
            int var7 = -(this.field2314.field6798 * arg2 >> 8) + arg1 >> this.field2314.field6689;
            int var8 = -(this.field2314.field6811 * arg2 >> 8) + arg3 >> this.field2314.field6689;
            this.field2324.method1016(var8, var7, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!eh", name = "QA", descriptor = "(III)V")
    public final void method1182(int arg0, int arg1, int arg2) {
        ++field2340;
        if (arg2 > (255 & this.field2360[arg0][arg1])) {
            this.field2360[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "()V")
    public final void method1183() {
        ++field2328;
        if (~this.field2348 >= -1) {
            this.field2324 = null;
        } else {
            byte[][] var1 = new byte[super.field3197 + 1][super.field3194 + 1];
            for (int var2 = 1; ~super.field3197 < ~var2; ++var2) {
                for (int var102 = 1; super.field3194 > var102; ++var102) {
                    var1[var2][var102] = (byte) ((this.field2360[var2][var102 + -1] >> 2) + (this.field2360[var2][var102 - -1] >> 3) + (this.field2360[var2][var102] >> 1) + (this.field2360[var2 + 1][var102] >> 3) + (this.field2360[var2 + -1][var102] >> 2));
                }
            }
            this.field2351 = new class133[this.field2359.method2095(0)];
            this.field2359.method2097((byte) -78, this.field2351);
            for (int var3 = 0; var3 < this.field2351.length; ++var3) {
                this.field2351[var3].method938((byte) 81, this.field2348);
            }
            int var4 = 24;
            if (this.field2330 != null) {
                var4 += 4;
            }
            if (~(7 & this.field2317) != -1) {
                var4 += 12;
            }
            NativeBuffer var5 = this.field2314.field6694.method2845(this.field2348 * var4);
            NativeStream var6 = new NativeStream(var5);
            class133[] var7 = new class133[this.field2348];
            class357 var8 = new class357(class342.method2014((byte) -29, this.field2348));
            class133[] var9 = new class133[this.field2358];
            for (int var10 = 0; super.field3197 > var10; ++var10) {
                for (int var29 = 0; var29 < super.field3194; ++var29) {
                    if (this.field2315[var10][var29] != null) {
                        class133[] var30 = this.field2346[var10][var29];
                        int[] var31 = this.field2309[var10][var29];
                        int[] var32 = this.field2343[var10][var29];
                        int[] var33 = this.field2338[var10][var29];
                        int[] var34 = this.field2315[var10][var29];
                        int[] var35 = this.field2342 != null ? this.field2342[var10][var29] : null;
                        if (var33 == null) {
                            var33 = var34;
                        }
                        int[] var36 = this.field2330 == null ? null : this.field2330[var10][var29];
                        float var37 = this.field2349[var10][var29];
                        float var38 = this.field2353[var10][var29];
                        float var39 = this.field2357[var10][var29];
                        float var40 = this.field2349[var10][var29 + 1];
                        float var41 = this.field2353[var10][var29 - -1];
                        float var42 = this.field2357[var10][var29 + 1];
                        float var43 = this.field2349[var10 + 1][var29 - -1];
                        float var44 = this.field2353[var10 + 1][var29 - -1];
                        float var45 = this.field2357[var10 - -1][var29 - -1];
                        float var46 = this.field2349[var10 + 1][var29];
                        float var47 = this.field2353[var10 + 1][var29];
                        float var48 = this.field2357[var10 + 1][var29];
                        int var49 = var1[var10][var29] & 255;
                        int var50 = var1[var10][var29 + 1] & 255;
                        int var51 = 255 & var1[var10 + 1][var29 + 1];
                        int var52 = var1[var10 + 1][var29] & 255;
                        int var53 = 0;
                        label335: for (int var54 = 0; ~var54 > ~var34.length; ++var54) {
                            class133 var100 = var30[var54];
                            for (int var101 = 0; var53 > var101; ++var101) {
                                if (var9[var101] == var100) {
                                    continue label335;
                                }
                            }
                            var9[var53++] = var100;
                        }
                        short[] var55 = this.field2321[super.field3197 * var29 + var10] = new short[var34.length];
                        for (int var56 = 0; ~var34.length < ~var56; ++var56) {
                            int var57 = (var10 << super.field3193) + var31[var56];
                            int var58 = (var29 << super.field3193) + var32[var56];
                            int var59 = var57 >> this.field2344;
                            int var60 = var58 >> this.field2344;
                            int var61 = var34[var56];
                            int var62 = var33[var56];
                            int var63 = var35 == null ? 0 : var35[var56];
                            long var64 = (long) var62 << 48 | (long) var61 << 32 | (long) (var59 << 16) | (long) var60;
                            int var66 = var31[var56];
                            int var67 = var32[var56];
                            byte var68 = 74;
                            int var69 = 0;
                            float var70;
                            float var71;
                            float var72;
                            int var73;
                            if (~var66 == -1 && var67 == 0) {
                                var70 = var38;
                                var71 = var37;
                                var72 = var39;
                                var73 = var68 - var49;
                            } else if (~var66 == -1 && ~super.field3198 == ~var67) {
                                var73 = var68 - var50;
                                var72 = var42;
                                var70 = var41;
                                var71 = var40;
                            } else if (super.field3198 == var66 && ~super.field3198 == ~var67) {
                                var73 = var68 - var51;
                                var72 = var45;
                                var70 = var44;
                                var71 = var43;
                            } else if (super.field3198 == var66 && ~var67 == -1) {
                                var73 = var68 - var52;
                                var71 = var46;
                                var72 = var48;
                                var70 = var47;
                            } else {
                                float var74 = (float) var66 / (float) super.field3198;
                                float var75 = (float) var67 / (float) super.field3198;
                                float var76 = (var46 - var37) * var74 + var37;
                                float var77 = (-var38 + var47) * var74 + var38;
                                float var78 = (var48 - var39) * var74 + var39;
                                float var79 = (-var40 + var43) * var74 + var40;
                                float var80 = (var44 - var41) * var74 + var41;
                                var70 = (-var77 + var80) * var75 + var77;
                                float var81 = (var45 - var42) * var74 + var42;
                                var71 = (-var76 + var79) * var75 + var76;
                                var72 = (var81 - var78) * var75 + var78;
                                int var82 = ((-var49 + var52) * var66 >> super.field3193) + var49;
                                int var83 = var50 - -((var51 - var50) * var66 >> super.field3193);
                                var73 = var68 - (var82 - -((var83 - var82) * var67 >> super.field3193));
                            }
                            float var84 = 1.0F;
                            if (var61 != -1) {
                                int var85 = (var61 & 127) * var73 >> 7;
                                if (var85 >= 2) {
                                    if (var85 > 126) {
                                        var85 = 126;
                                    }
                                } else {
                                    var85 = 2;
                                }
                                var69 = class9.field97[var85 | 65408 & var61];
                                if (~(this.field2317 & 7) == -1) {
                                    float var86 = this.field2314.field6750[2] * var72 + this.field2314.field6750[1] * var70 + this.field2314.field6750[0] * var71;
                                    var84 = this.field2314.field6791 + var86 * (!(var86 > 0.0F) ? this.field2314.field6725 : this.field2314.field6766);
                                }
                            }
                            class508 var87 = null;
                            if ((var57 & this.field2337 + -1) == 0 && (var58 & this.field2337 + -1) == 0) {
                                var87 = var8.method2085(var64, -5423);
                            }
                            int var98;
                            if (var87 == null) {
                                int var88;
                                if (var61 == var62) {
                                    var88 = var69;
                                } else {
                                    int var89 = (127 & var62) * var73 >> 7;
                                    if (var89 < 2) {
                                        var89 = 2;
                                    } else if (var89 > 126) {
                                        var89 = 126;
                                    }
                                    var88 = class9.field97[65408 & var62 | var89];
                                    if (~(this.field2317 & 7) == -1) {
                                        float var90 = this.field2314.field6750[2] * var72 + this.field2314.field6750[0] * var71 + this.field2314.field6750[1] * var70;
                                        float var91 = (var84 > 0.0F ? this.field2314.field6766 : this.field2314.field6725) * var84 + this.field2314.field6791;
                                        int var92 = 255 & var88 >> 16;
                                        int var93 = (var88 & 65502) >> 8;
                                        int var94 = (int) ((float) var92 * var91);
                                        int var95 = 255 & var88;
                                        if (var94 < 0) {
                                            var94 = 0;
                                        } else if (var94 > 255) {
                                            var94 = 255;
                                        }
                                        int var96 = (int) ((float) var93 * var91);
                                        int var97 = (int) ((float) var95 * var91);
                                        if (var96 >= 0) {
                                            if (var96 > 255) {
                                                var96 = 255;
                                            }
                                        } else {
                                            var96 = 0;
                                        }
                                        if (~var97 > -1) {
                                            var97 = 0;
                                        } else if (~var97 < -256) {
                                            var97 = 255;
                                        }
                                        var88 = var97 | var96 << 8 | var94 << 16;
                                    }
                                }
                                if (this.field2314.field6759) {
                                    var6.method2852((float) var57);
                                    var6.method2852((float) (var63 + this.method1185(var57, var58)));
                                    var6.method2852((float) var58);
                                    var6.method2849((byte) (var88 >> 16));
                                    var6.method2849((byte) (var88 >> 8));
                                    var6.method2849((byte) var88);
                                    var6.method2849(-1);
                                    var6.method2852((float) var57);
                                    var6.method2852((float) var58);
                                    if (this.field2330 != null) {
                                        var6.method2852((float) (var36 != null ? var36[var56] + -1 : 0));
                                    }
                                    if (~(7 & this.field2317) != -1) {
                                        var6.method2852(var71);
                                        var6.method2852(var70);
                                        var6.method2852(var72);
                                    }
                                } else {
                                    var6.method2847((float) var57);
                                    var6.method2847((float) (this.method1185(var57, var58) + var63));
                                    var6.method2847((float) var58);
                                    var6.method2849((byte) (var88 >> 16));
                                    var6.method2849((byte) (var88 >> 8));
                                    var6.method2849((byte) var88);
                                    var6.method2849(-1);
                                    var6.method2847((float) var57);
                                    var6.method2847((float) var58);
                                    if (this.field2330 != null) {
                                        var6.method2847((float) (var36 != null ? var36[var56] + -1 : 0));
                                    }
                                    if (~(this.field2317 & 7) != -1) {
                                        var6.method2847(var71);
                                        var6.method2847(var70);
                                        var6.method2847(var72);
                                    }
                                }
                                var98 = this.field2339++;
                                var55[var56] = (short) var98;
                                if (~var61 != 0) {
                                    var7[var98] = var30[var56];
                                }
                                var8.method2096(var64, new class437(var55[var56]), (byte) 76);
                            } else {
                                var55[var56] = ((class437) var87).field5990;
                                var98 = var55[var56] & 65535;
                                if (~var61 != 0 && ~var30[var56].field7456 > ~var7[var98].field7456) {
                                    var7[var98] = var30[var56];
                                }
                            }
                            for (int var99 = 0; var99 < var53; ++var99) {
                                var9[var99].method941(var84, var69, var98, var73, -1860377584);
                            }
                            ++this.field2326;
                        }
                    }
                }
            }
            for (int var11 = 0; ~this.field2339 < ~var11; ++var11) {
                class133 var28 = var7[var11];
                if (var28 != null) {
                    var28.method940(var11, (byte) 111);
                }
            }
            for (int var12 = 0; ~var12 > ~super.field3197; ++var12) {
                for (int var17 = 0; var17 < super.field3194; ++var17) {
                    short[] var18 = this.field2321[super.field3197 * var17 + var12];
                    if (var18 != null) {
                        int var19 = 0;
                        int var20 = 0;
                        while (var20 < var18.length) {
                            int var21 = var18[var20++] & 65535;
                            int var22 = var18[var20++] & 65535;
                            int var23 = 65535 & var18[var20++];
                            class133 var24 = var7[var21];
                            class133 var25 = var7[var22];
                            class133 var26 = var7[var23];
                            class133 var27 = null;
                            if (var24 != null) {
                                var24.method935(var17, var19, (byte) -124, var12);
                                var27 = var24;
                            }
                            if (var25 != null) {
                                var25.method935(var17, var19, (byte) -128, var12);
                                if (var27 == null || ~var25.field7456 > ~var27.field7456) {
                                    var27 = var25;
                                }
                            }
                            if (var26 != null) {
                                var26.method935(var17, var19, (byte) -127, var12);
                                if (var27 == null || var27.field7456 > var26.field7456) {
                                    var27 = var26;
                                }
                            }
                            if (var27 != null) {
                                if (var24 != null) {
                                    var27.method940(var21, (byte) 117);
                                }
                                if (var25 != null) {
                                    var27.method940(var22, (byte) 110);
                                }
                                if (var26 != null) {
                                    var27.method940(var23, (byte) 113);
                                }
                                var27.method935(var17, var19, (byte) -124, var12);
                            }
                            ++var19;
                        }
                    }
                }
            }
            var6.method2850();
            this.field2354 = this.field2314.method2753(var4, false, var5, true, var6.method2851());
            this.field2352 = new class139(this.field2314, this.field2354, 5126, 3, 0);
            this.field2356 = new class139(this.field2314, this.field2354, 5121, 4, 12);
            byte var13;
            if (this.field2330 != null) {
                var13 = 28;
                this.field2350 = new class139(this.field2314, this.field2354, 5126, 3, 16);
            } else {
                this.field2350 = new class139(this.field2314, this.field2354, 5126, 2, 16);
                var13 = 24;
            }
            if (~(this.field2317 & 7) != -1) {
                this.field2355 = new class139(this.field2314, this.field2354, 5126, 3, var13);
            }
            long[] var14 = new long[this.field2351.length];
            for (int var15 = 0; var15 < this.field2351.length; ++var15) {
                class133 var16 = this.field2351[var15];
                var14[var15] = var16.field7456;
                var16.method936(this.field2339, 111);
            }
            class340.method2003(var14, (byte) -80, this.field2351);
            if (this.field2324 != null) {
                this.field2324.method1020((byte) 48);
            }
        }
        this.field2346 = null;
        this.field2330 = null;
        this.field2315 = null;
        this.field2349 = this.field2353 = this.field2357 = null;
        this.field2338 = null;
        this.field2309 = this.field2343 = null;
        this.field2360 = null;
        this.field2342 = null;
        this.field2359 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static void method1184(int arg0) {
        if (arg0 != -25629) {
            field2345 = null;
        }
        field2333 = null;
        field2341 = null;
        field2345 = null;
        field2347 = null;
    }

    @OriginalMember(owner = "client!eh", name = "va", descriptor = "(II)I")
    public final int method1185(int arg0, int arg1) {
        ++field2329;
        int var3 = arg0 >> super.field3193;
        int var4 = arg1 >> super.field3193;
        if (var3 >= 0 && ~var4 <= -1 && ~(super.field3197 - 1) <= ~var3 && var4 <= super.field3194 + -1) {
            int var5 = super.field3198 + -1 & arg0;
            int var6 = super.field3198 + -1 & arg1;
            int var7 = (-var5 + super.field3198) * this.field2310[var3][var4] + this.field2310[var3 + 1][var4] * var5 >> super.field3193;
            int var8 = (-var5 + super.field3198) * this.field2310[var3][var4 + 1] - -(this.field2310[var3 + 1][var4 + 1] * var5) >> super.field3193;
            return (-var6 + super.field3198) * var7 + var6 * var8 >> super.field3193;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lve;[I)V")
    public final void method1186(class182 arg0, int[] arg1) {
        this.field2318.method42(new class517(this.field2314, this, arg0, arg1), 0);
        ++field2313;
    }

    @OriginalMember(owner = "client!eh", name = "I", descriptor = "(II)I")
    public final int method1187(int arg0, int arg1) {
        ++field2323;
        return this.field2310[arg0][arg1];
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; ~var3 > -9; ++var3) {
                if (~(1L & var1) == -2L) {
                    var1 = -3932672073523589310L ^ var1 >>> 1;
                } else {
                    var1 >>>= 1;
                }
            }
            field2345[var0] = var1;
        }
    }
}
