import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class209 extends class174 {

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "Lui;")
    private class193 field2518 = new class193();

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "[[I")
    private int[][] field2530;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "Lmh;")
    public class537 field2527;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
    private int field2537;

    @OriginalMember(owner = "client!ae", name = "V", descriptor = "[[F")
    private float[][] field2544;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public int field2516;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "[[B")
    private byte[][] field2525;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "I")
    private int field2538;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "[[[I")
    public int[][][] field2506;

    @OriginalMember(owner = "client!ae", name = "ab", descriptor = "[[B")
    private byte[][] field2549;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "[[[Lor;")
    private class546[][][] field2509;

    @OriginalMember(owner = "client!ae", name = "eb", descriptor = "[[F")
    private float[][] field2553;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "[[[I")
    public int[][][] field2526;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "[[[I")
    private int[][][] field2531;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "[[[I")
    private int[][][] field2511;

    @OriginalMember(owner = "client!ae", name = "X", descriptor = "[[F")
    private float[][] field2546;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "[[[I")
    private int[][][] field2512;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "[[S")
    public short[][] field2510;

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "Lpt;")
    private class451 field2542;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "Ldc;")
    private class5 field2519;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "Ljs;")
    public static class275 field2505 = new class275(11, 0, 1, 2);

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "Lsw;")
    public static class641 field2523 = new class641(20);

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "Lvj;")
    public static class373 field2540 = new class373(49, 1);

    @OriginalMember(owner = "client!ae", name = "W", descriptor = "Lui;")
    public static class193 field2545 = new class193();

    @OriginalMember(owner = "client!ae", name = "gb", descriptor = "Lcea;")
    public static class180 field2555 = new class180("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    private int field2517;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "I")
    private int field2528;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!ae", name = "U", descriptor = "I")
    private int field2543;

    @OriginalMember(owner = "client!ae", name = "fb", descriptor = "I")
    private int field2554;

    @OriginalMember(owner = "client!ae", name = "ib", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!ae", name = "Z", descriptor = "Lqo;")
    private class21 field2548;

    @OriginalMember(owner = "client!ae", name = "Y", descriptor = "Lro;")
    public class2 field2547;

    @OriginalMember(owner = "client!ae", name = "bb", descriptor = "Lro;")
    public class2 field2550;

    @OriginalMember(owner = "client!ae", name = "cb", descriptor = "Lro;")
    private class2 field2551;

    @OriginalMember(owner = "client!ae", name = "hb", descriptor = "Lro;")
    public class2 field2556;

    @OriginalMember(owner = "client!ae", name = "db", descriptor = "[Lor;")
    private class546[] field2552;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "[[[I")
    private int[][][] field2532;

    @OriginalMember(owner = "client!ae", name = "jb", descriptor = "[[[J")
    public static long[][][] field2558;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 5)
    public final void method846(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field2515;
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
        this.method849(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!ae", name = "ya", descriptor = "(Lk;IIIIZ)V", line = 96)
    public final void method848(class483 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2520;
        if (this.field2519 != null && arg0 != null) {
            int var7 = arg1 - (this.field2527.field7826 * arg2 >> 8) >> this.field2527.field7732;
            int var8 = -(this.field2527.field7800 * arg2 >> 8) + arg3 >> this.field2527.field7732;
            this.field2519.method27((byte) -37, var7, var8, arg0);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILqba;I)V", line = 113)
    private final void method1202(int arg0, int arg1, class343 arg2, int arg3) {
        ++field2533;
        int[] var5 = this.field2526[arg3][arg1];
        if (arg0 != 16849) {
            this.method845((class483) null, -1, 78, -22, 112, true);
        }
        int[] var6 = this.field2506[arg3][arg1];
        int var7 = var5.length;
        if (~this.field2527.field7879.length > ~var7) {
            this.field2527.field7874 = new int[var7];
            this.field2527.field7879 = new int[var7];
        }
        int[] var8 = this.field2527.field7879;
        int[] var9 = this.field2527.field7874;
        for (int var10 = 0; ~var7 < ~var10; ++var10) {
            var8[var10] = var5[var10] >> this.field2527.field7732;
            var9[var10] = var6[var10] >> this.field2527.field7732;
        }
        int var11 = 0;
        while (~var11 > ~var7) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if ((-var14 + var12) * (-var17 + var15) + -((var16 - var14) * (-var13 + var15)) > 0) {
                arg2.method1915(var15, var17, var12, var16, var13, var14, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III[[ZZ)V", line = 174)
    public final void method854(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method1204((byte) -36, arg3, arg2, arg4, arg1, arg0, -1);
        ++field2521;
    }

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "(Lk;IIIIZ)V", line = 182)
    public final void method845(class483 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2514;
        if (this.field2519 != null && arg0 != null) {
            int var7 = -(this.field2527.field7826 * arg2 >> 8) + arg1 >> this.field2527.field7732;
            int var8 = arg3 - (this.field2527.field7800 * arg2 >> 8) >> this.field2527.field7732;
            this.field2519.method35(var7, var8, arg0, 17479);
        }
    }

    @OriginalMember(owner = "client!ae", name = "X", descriptor = "(IILk;)Lk;", line = 204)
    public final class483 method853(int arg0, int arg1, class483 arg2) {
        ++field2507;
        if ((this.field2525[arg0][arg1] & 1) == 0) {
            return null;
        } else {
            int var4 = super.field2115 >> this.field2527.field7732;
            class343 var5 = (class343) arg2;
            class343 var6;
            if (var5 != null && var5.method1914(var4, 17703, var4)) {
                var6 = var5;
                var5.method1912(false);
            } else {
                var6 = new class343(this.field2527, var4, var4);
            }
            var6.method1917(0, 0, 0, var4, var4);
            this.method1202(16849, arg1, var6, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "()V", line = 242)
    public final void method842() {
        if (this.field2554 <= 0) {
            this.field2519 = null;
        } else {
            byte[][] var1 = new byte[super.field2116 + 1][super.field2114 + 1];
            for (int var2 = 1; var2 < super.field2116; ++var2) {
                for (int var103 = 1; ~var103 > ~super.field2114; ++var103) {
                    var1[var2][var103] = (byte) ((this.field2549[var2][var103 + -1] >> 2) + (this.field2549[var2][var103] >> 1) + (this.field2549[var2][var103 + 1] >> 3) + (this.field2549[var2 + 1][var103] >> 3) + (this.field2549[var2 + -1][var103] >> 2));
                }
            }
            this.field2552 = new class546[this.field2542.method2639(127)];
            this.field2542.method2644(this.field2552, 4923);
            for (int var3 = 0; var3 < this.field2552.length; ++var3) {
                this.field2552[var3].method3205(this.field2554, -16);
            }
            int var4 = 24;
            if (this.field2532 != null) {
                var4 += 4;
            }
            if (~(7 & this.field2516) != -1) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field2527.field7733.method3336(this.field2554 * var4, false);
            Stream var6 = new Stream(var5);
            class546[] var7 = new class546[this.field2554];
            int var8 = class308.method1711((byte) -66, this.field2554 / 4);
            if (~var8 > -2) {
                var8 = 1;
            }
            class451 var9 = new class451(var8);
            class546[] var10 = new class546[this.field2543];
            for (int var11 = 0; ~var11 > ~super.field2116; ++var11) {
                for (int var30 = 0; var30 < super.field2114; ++var30) {
                    if (this.field2531[var11][var30] != null) {
                        class546[] var31 = this.field2509[var11][var30];
                        int[] var32 = this.field2526[var11][var30];
                        int[] var33 = this.field2506[var11][var30];
                        int[] var34 = this.field2511[var11][var30];
                        int[] var35 = this.field2531[var11][var30];
                        int[] var36 = this.field2512 != null ? this.field2512[var11][var30] : null;
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field2532 == null ? null : this.field2532[var11][var30];
                        float var38 = this.field2544[var11][var30];
                        float var39 = this.field2553[var11][var30];
                        float var40 = this.field2546[var11][var30];
                        float var41 = this.field2544[var11][var30 + 1];
                        float var42 = this.field2553[var11][var30 + 1];
                        float var43 = this.field2546[var11][var30 + 1];
                        float var44 = this.field2544[var11 + 1][var30 + 1];
                        float var45 = this.field2553[var11 + 1][var30 + 1];
                        float var46 = this.field2546[var11 + 1][var30 + 1];
                        float var47 = this.field2544[var11 + 1][var30];
                        float var48 = this.field2553[var11 + 1][var30];
                        float var49 = this.field2546[var11 + 1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = var1[var11][var30 + 1] & 255;
                        int var52 = 255 & var1[var11 - -1][var30 - -1];
                        int var53 = var1[var11 + 1][var30] & 255;
                        int var54 = 0;
                        label341: for (int var55 = 0; var35.length > var55; ++var55) {
                            class546 var101 = var31[var55];
                            for (int var102 = 0; var102 < var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label341;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field2510[super.field2116 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; ~var57 > ~var35.length; ++var57) {
                            int var58 = (var11 << super.field2111) - -var32[var57];
                            int var59 = (var30 << super.field2111) + var33[var57];
                            int var60 = var58 >> this.field2537;
                            int var61 = var59 >> this.field2537;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 != null ? var36[var57] : 0;
                            long var65 = (long) (var60 << 16) | (long) var63 << 48 | (long) var62 << 32 | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            int var71;
                            float var72;
                            float var73;
                            float var74;
                            if (var67 == 0 && var68 == 0) {
                                var71 = var69 - var50;
                                var72 = var39;
                                var73 = var38;
                                var74 = var40;
                            } else if (var67 == 0 && super.field2115 == var68) {
                                var74 = var43;
                                var72 = var42;
                                var73 = var41;
                                var71 = var69 - var51;
                            } else if (~super.field2115 == ~var67 && ~super.field2115 == ~var68) {
                                var71 = var69 - var52;
                                var73 = var44;
                                var74 = var46;
                                var72 = var45;
                            } else if (~super.field2115 == ~var67 && var68 == 0) {
                                var73 = var47;
                                var71 = var69 - var53;
                                var72 = var48;
                                var74 = var49;
                            } else {
                                float var75 = (float) var67 / (float) super.field2115;
                                float var76 = (float) var68 / (float) super.field2115;
                                float var77 = (var47 - var38) * var75 + var38;
                                float var78 = (-var39 + var48) * var75 + var39;
                                float var79 = (-var40 + var49) * var75 + var40;
                                float var80 = (var44 - var41) * var75 + var41;
                                float var81 = (-var42 + var45) * var75 + var42;
                                var73 = (var80 - var77) * var76 + var77;
                                var72 = (var81 - var78) * var76 + var78;
                                float var82 = (-var43 + var46) * var75 + var43;
                                var74 = (-var79 + var82) * var76 + var79;
                                int var83 = ((var53 - var50) * var67 >> super.field2111) + var50;
                                int var84 = ((-var51 + var52) * var67 >> super.field2111) + var51;
                                var71 = var69 - (((-var83 + var84) * var68 >> super.field2111) + var83);
                            }
                            float var85 = 1.0F;
                            if (~var62 != 0) {
                                int var86 = (var62 & 127) * var71 >> 7;
                                if (var86 < 2) {
                                    var86 = 2;
                                } else if (var86 > 126) {
                                    var86 = 126;
                                }
                                if (~(this.field2516 & 7) == -1) {
                                    float var87 = this.field2527.field7859[2] * var74 + this.field2527.field7859[0] * var73 + this.field2527.field7859[1] * var72;
                                    var85 = this.field2527.field7828 + (!(var87 > 0.0F) ? this.field2527.field7805 : this.field2527.field7788) * var87;
                                }
                                var70 = class103.field1259[var86 | 65408 & var62];
                            }
                            class544 var88 = null;
                            if (~(var58 & this.field2538 + -1) == -1 && (this.field2538 + -1 & var59) == 0) {
                                var88 = var9.method2645(var65, (byte) -102);
                            }
                            int var99;
                            if (var88 == null) {
                                int var90;
                                if (~var62 != ~var63) {
                                    int var89 = (var63 & 127) * var71 >> 7;
                                    if (var89 < 2) {
                                        var89 = 2;
                                    } else if (~var89 < -127) {
                                        var89 = 126;
                                    }
                                    var90 = class103.field1259[var63 & 65408 | var89];
                                    if (~(7 & this.field2516) == -1) {
                                        float var91 = this.field2527.field7859[2] * var74 + this.field2527.field7859[0] * var73 + this.field2527.field7859[1] * var72;
                                        float var92 = this.field2527.field7828 + (var85 > 0.0F ? this.field2527.field7788 : this.field2527.field7805) * var85;
                                        int var93 = var90 >> 16 & 255;
                                        int var94 = (65320 & var90) >> 8;
                                        int var95 = 255 & var90;
                                        int var96 = (int) ((float) var93 * var92);
                                        if (~var96 > -1) {
                                            var96 = 0;
                                        } else if (var96 > 255) {
                                            var96 = 255;
                                        }
                                        int var97 = (int) ((float) var94 * var92);
                                        int var98 = (int) ((float) var95 * var92);
                                        if (var97 >= 0) {
                                            if (var97 > 255) {
                                                var97 = 255;
                                            }
                                        } else {
                                            var97 = 0;
                                        }
                                        if (var98 >= 0) {
                                            if (~var98 < -256) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        var90 = var98 | var96 << 16 | var97 << 8;
                                    }
                                } else {
                                    var90 = var70;
                                }
                                if (this.field2527.field7754) {
                                    var6.method3348((float) var58);
                                    var6.method3348((float) (var64 + this.method847(var58, var59)));
                                    var6.method3348((float) var59);
                                    var6.method3337((byte) (var90 >> 16));
                                    var6.method3337((byte) (var90 >> 8));
                                    var6.method3337((byte) var90);
                                    var6.method3337(-1);
                                    var6.method3348((float) var58);
                                    var6.method3348((float) var59);
                                    if (this.field2532 != null) {
                                        var6.method3348((float) (var37 == null ? 0 : var37[var57] - 1));
                                    }
                                    if (~(7 & this.field2516) != -1) {
                                        var6.method3348(var73);
                                        var6.method3348(var72);
                                        var6.method3348(var74);
                                    }
                                } else {
                                    var6.method3344((float) var58);
                                    var6.method3344((float) (var64 + this.method847(var58, var59)));
                                    var6.method3344((float) var59);
                                    var6.method3337((byte) (var90 >> 16));
                                    var6.method3337((byte) (var90 >> 8));
                                    var6.method3337((byte) var90);
                                    var6.method3337(-1);
                                    var6.method3344((float) var58);
                                    var6.method3344((float) var59);
                                    if (this.field2532 != null) {
                                        var6.method3344((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if ((this.field2516 & 7) != 0) {
                                        var6.method3344(var73);
                                        var6.method3344(var72);
                                        var6.method3344(var74);
                                    }
                                }
                                var99 = this.field2517++;
                                var56[var57] = (short) var99;
                                if (var62 != -1) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method2640(1, var65, new class492(var56[var57]));
                            } else {
                                var56[var57] = ((class492) var88).field6867;
                                var99 = var56[var57] & 65535;
                                if (var62 != -1 && var31[var57].field7967 < var7[var99].field7967) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; var100 < var54; ++var100) {
                                var10[var100].method3208(var85, var99, 0, var70, var71);
                            }
                            ++this.field2528;
                        }
                    }
                }
            }
            for (int var12 = 0; ~var12 > ~this.field2517; ++var12) {
                class546 var29 = var7[var12];
                if (var29 != null) {
                    var29.method3206(3, var12);
                }
            }
            for (int var13 = 0; ~var13 > ~super.field2116; ++var13) {
                for (int var18 = 0; var18 < super.field2114; ++var18) {
                    short[] var19 = this.field2510[super.field2116 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (var19.length > var21) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = 65535 & var19[var21++];
                            int var24 = var19[var21++] & 65535;
                            class546 var25 = var7[var22];
                            class546 var26 = var7[var23];
                            class546 var27 = var7[var24];
                            class546 var28 = null;
                            if (var25 != null) {
                                var25.method3207(var13, var18, false, var20);
                                var28 = var25;
                            }
                            if (var26 != null) {
                                var26.method3207(var13, var18, false, var20);
                                if (var28 == null || ~var28.field7967 < ~var26.field7967) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method3207(var13, var18, false, var20);
                                if (var28 == null || var28.field7967 > var27.field7967) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method3206(3, var22);
                                }
                                if (var26 != null) {
                                    var28.method3206(3, var23);
                                }
                                if (var27 != null) {
                                    var28.method3206(3, var24);
                                }
                                var28.method3207(var13, var18, false, var20);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3342();
            this.field2548 = this.field2527.method3086(var6.method3343(), (byte) -71, false, var5, var4);
            this.field2556 = new class2(this.field2548, 5126, 3, 0);
            this.field2551 = new class2(this.field2548, 5121, 4, 12);
            byte var14;
            if (this.field2532 != null) {
                var14 = 28;
                this.field2547 = new class2(this.field2548, 5126, 3, 16);
            } else {
                var14 = 24;
                this.field2547 = new class2(this.field2548, 5126, 2, 16);
            }
            if ((this.field2516 & 7) != 0) {
                this.field2550 = new class2(this.field2548, 5126, 3, var14);
            }
            long[] var15 = new long[this.field2552.length];
            for (int var16 = 0; this.field2552.length > var16; ++var16) {
                class546 var17 = this.field2552[var16];
                var15[var16] = var17.field7967;
                var17.method3209(this.field2517, 104);
            }
            class639.method3663(this.field2552, var15, true);
            if (this.field2519 != null) {
                this.field2519.method34(31594);
            }
        }
        ++field2529;
        this.field2544 = this.field2553 = this.field2546 = null;
        this.field2549 = null;
        this.field2532 = null;
        this.field2542 = null;
        this.field2512 = null;
        this.field2526 = this.field2506 = null;
        this.field2511 = null;
        this.field2509 = null;
        this.field2531 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lcba;[I)V", line = 821)
    public final void method850(class469 arg0, int[] arg1) {
        this.field2518.method1040(new class226(this.field2527, this, arg0, arg1), -90);
        ++field2524;
    }

    @OriginalMember(owner = "client!ae", name = "aa", descriptor = "(II)I", line = 836)
    public final int method847(int arg0, int arg1) {
        ++field2541;
        int var3 = arg0 >> super.field2111;
        int var4 = arg1 >> super.field2111;
        if (var3 >= 0 && var4 >= 0 && ~var3 >= ~(super.field2116 + -1) && ~(super.field2114 - 1) <= ~var4) {
            int var5 = super.field2115 + -1 & arg0;
            int var6 = arg1 & super.field2115 - 1;
            int var7 = (super.field2115 - var5) * this.field2530[var3][var4] + this.field2530[var3 + 1][var4] * var5 >> super.field2111;
            int var8 = (super.field2115 - var5) * this.field2530[var3][var4 + 1] + this.field2530[var3 + 1][var4 - -1] * var5 >> super.field2111;
            return (-var6 + super.field2115) * var7 + var6 * var8 >> super.field2111;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ae", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 861)
    public final void method849(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg5 != null && this.field2532 == null) {
            this.field2532 = new int[super.field2116][super.field2114][];
        }
        ++field2508;
        if (arg3 != null && this.field2512 == null) {
            this.field2512 = new int[super.field2116][super.field2114][];
        }
        this.field2526[arg0][arg1] = arg2;
        this.field2506[arg0][arg1] = arg4;
        this.field2531[arg0][arg1] = arg6;
        this.field2511[arg0][arg1] = arg7;
        if (this.field2532 != null) {
            this.field2532[arg0][arg1] = arg5;
        }
        if (this.field2512 != null) {
            this.field2512[arg0][arg1] = arg3;
        }
        class546[] var15 = this.field2509[arg0][arg1] = new class546[arg6.length];
        for (int var16 = 0; var16 < arg6.length; ++var16) {
            long var17 = (long) arg8[var16] | (long) (arg9[var16] << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28;
            class544 var19;
            for (var19 = this.field2542.method2645(var17, (byte) -113); var19 != null; var19 = this.field2542.method2646((byte) 49)) {
                class546 var20 = (class546) var19;
                if (~arg8[var16] == ~var20.field8029 && (float) arg9[var16] == var20.field8034 && ~var20.field8036 == ~arg10 && var20.field8039 == arg11 && var20.field8025 == arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class546(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field2542.method2640(1, var17, var15[var16]);
            } else {
                var15[var16] = (class546) var19;
            }
        }
        if (arg13) {
            this.field2525[arg0][arg1] = (byte) class42.method223(this.field2525[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field2543) {
            this.field2543 = arg6.length;
        }
        this.field2554 += arg6.length;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIII)I", line = 931)
    public static final int method1203(int arg0, int arg1, int arg2, int arg3) {
        ++field2522;
        int var4 = arg0 & 3;
        if (arg3 != 0) {
            field2540 = null;
        }
        if (~var4 == -1) {
            return arg1;
        } else if (var4 == 1) {
            return arg2;
        } else {
            return var4 == 2 ? 7 - arg1 : -arg2 + 7;
        }
    }

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "(III)V", line = 956)
    public final void method841(int arg0, int arg1, int arg2) {
        if (~arg2 < ~(255 & this.field2549[arg0][arg1])) {
            this.field2549[arg0][arg1] = (byte) arg2;
        }
        ++field2536;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lmh;IIII[[I[[II)V", line = 973)
    public class209(class537 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field2530 = arg5;
        this.field2527 = arg0;
        this.field2537 = super.field2111 + -2;
        this.field2544 = new float[super.field2116 + 1][super.field2114 + 1];
        this.field2516 = arg2;
        this.field2525 = new byte[arg3][arg4];
        this.field2538 = 1 << this.field2537;
        this.field2506 = new int[arg3][arg4][];
        this.field2549 = new byte[arg3 + 1][arg4 + 1];
        this.field2509 = new class546[arg3][arg4][];
        this.field2553 = new float[super.field2116 - -1][super.field2114 + 1];
        this.field2526 = new int[arg3][arg4][];
        this.field2531 = new int[arg3][arg4][];
        this.field2511 = new int[arg3][arg4][];
        this.field2546 = new float[super.field2116 + 1][super.field2114 + 1];
        this.field2512 = new int[arg3][arg4][];
        this.field2510 = new short[arg3 * arg4][];
        for (int var9 = 1; ~var9 > ~super.field2114; ++var9) {
            for (int var10 = 1; ~var10 > ~super.field2116; ++var10) {
                int var11 = arg6[var10 + 1][var9] - arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + arg7 * 4 * arg7 + var12 * var12)));
                this.field2544[var10][var9] = (float) var11 * var13;
                this.field2553[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field2546[var10][var9] = (float) var12 * var13;
            }
        }
        this.field2542 = new class451(128);
        if (~(16 & this.field2516) != -1) {
            this.field2519 = new class5(this.field2527, this);
        }
    }

    @OriginalMember(owner = "client!ae", name = "ba", descriptor = "(II)I", line = 1032)
    public final int method855(int arg0, int arg1) {
        ++field2513;
        return this.field2530[arg0][arg1];
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B[[ZIZIII)V", line = 1050)
    private final void method1204(byte arg0, boolean[][] arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg0 >= -16) {
            this.method846(-42, 20, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 29, -67, 9, true);
        }
        ++field2534;
        if (this.field2552 != null) {
            float var8 = this.field2527.field7854;
            float var9 = this.field2527.field7839;
            int var10 = arg2 + 1 - -arg2;
            int var11 = var10 * var10;
            if (var11 > this.field2527.field7875.length) {
                this.field2527.field7875 = new int[var11];
            }
            if (~this.field2527.field7852.field4929.length > ~(this.field2528 * 2)) {
                this.field2527.field7852 = new class385(this.field2528 * 2);
            }
            int var12 = -arg2 + arg5;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = arg4 - arg2;
            int var15 = var14;
            if (var14 < 0) {
                var14 = 0;
            }
            int var16 = arg2 + arg5;
            if (var16 > super.field2116 - 1) {
                var16 = super.field2116 + -1;
            }
            int var17 = arg2 + arg4;
            if (var17 > super.field2114 + -1) {
                var17 = super.field2114 + -1;
            }
            int var18 = 0;
            int[] var19 = this.field2527.field7875;
            for (int var20 = var12; var20 <= var16; ++var20) {
                boolean[] var26 = arg1[-var13 + var20];
                for (int var27 = var14; ~var17 <= ~var27; ++var27) {
                    if (var26[-var15 + var27]) {
                        var19[var18++] = super.field2116 * var27 + var20;
                    }
                }
            }
            if (arg6 == -1) {
                this.field2527.method3087(-56);
            } else {
                this.field2527.method3085(true, (float) arg6);
                this.field2527.method3084((byte) 110);
            }
            this.field2527.method3106(true, ~(7 & this.field2516) != -1);
            for (int var21 = 0; this.field2552.length > var21; ++var21) {
                this.field2552[var21].method3201((byte) 26, var19, var18);
            }
            if (!this.field2518.method1043(true)) {
                int var22 = this.field2527.field7822;
                int var23 = this.field2527.field7794;
                this.field2527.method1120(0, var23, this.field2527.field7769);
                this.field2527.method1106(var9, var8 - 4.0F);
                this.field2527.method3106(true, false);
                this.field2527.method3101(false, 8);
                this.field2527.method3058((byte) -125, 128);
                this.field2527.method3071(60, -2);
                this.field2527.method3083((byte) 71, this.field2527.field7802);
                this.field2527.method3099(7681, 8448, 8);
                this.field2527.method3126(false, 0, 770, 34166);
                this.field2527.method3098(770, 0, (byte) 14, 34167);
                for (class544 var24 = this.field2518.method1050((byte) 73); var24 != null; var24 = this.field2518.method1047(-7962)) {
                    class226 var25 = (class226) var24;
                    var25.method1293(arg2, arg4, arg5, arg1, -8170);
                }
                this.field2527.method3126(false, 0, 768, 5890);
                this.field2527.method3098(770, 0, (byte) 14, 5890);
                this.field2527.method3083((byte) 94, (class238) null);
                this.field2527.method1120(var22, var23, this.field2527.field7769);
            }
            if (this.field2519 != null) {
                this.field2527.method1106(var9, var8 + -8.0F);
                this.field2527.method3087(-84);
                this.field2527.method3131(this.field2547, (class2) null, (byte) -118, this.field2556, (class2) null);
                this.field2519.method29(arg1, arg3, arg5, arg2, arg4, 5890);
            }
            this.field2527.method1106(var9, var8);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIII[[Z)V", line = 1199)
    public final void method852(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field2539;
        if (~this.field2554 < -1) {
            this.field2527.method3079((byte) 72);
            this.field2527.method3103((byte) -55, false);
            this.field2527.method3106(true, false);
            this.field2527.method3074((byte) -84, false);
            this.field2527.method3101(false, 8);
            this.field2527.method3058((byte) -123, 0);
            this.field2527.method3071(66, -2);
            this.field2527.method3083((byte) 79, (class238) null);
            class592.field8592[4] = 0.0F;
            class592.field8592[8] = 0.0F;
            class592.field8592[15] = 1.0F;
            class592.field8592[1] = 0.0F;
            class592.field8592[0] = (float) arg2 / ((float) super.field2115 * 128.0F * (float) this.field2527.field7568);
            class592.field8592[7] = 0.0F;
            class592.field8592[6] = 0.0F;
            class592.field8592[2] = 0.0F;
            class592.field8592[9] = 0.0F;
            class592.field8592[11] = 0.0F;
            class592.field8592[10] = 0.0F;
            class592.field8592[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field2527.field7549;
            class592.field8592[5] = (float) arg2 / ((float) super.field2115 * 128.0F * (float) this.field2527.field7549);
            class592.field8592[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field2527.field7568;
            class592.field8592[14] = 0.0F;
            class592.field8592[3] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class592.field8592, 0);
            class592.field8592[14] = 0.0F;
            class592.field8592[1] = 0.0F;
            class592.field8592[13] = 0.0F;
            class592.field8592[3] = 0.0F;
            class592.field8592[12] = 0.0F;
            class592.field8592[5] = 0.0F;
            class592.field8592[15] = 1.0F;
            class592.field8592[8] = 0.0F;
            class592.field8592[4] = 0.0F;
            class592.field8592[6] = 1.0F;
            class592.field8592[7] = 0.0F;
            class592.field8592[10] = 0.0F;
            class592.field8592[11] = 0.0F;
            class592.field8592[9] = 1.0F;
            class592.field8592[2] = 0.0F;
            class592.field8592[0] = 1.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class592.field8592, 0);
            if (~(7 & this.field2516) == -1) {
                this.field2527.method3106(true, false);
            } else {
                this.field2527.method3106(true, true);
                this.field2527.method3116(true);
            }
            this.field2527.method3131(this.field2547, this.field2551, (byte) -126, this.field2556, this.field2550);
            if (~this.field2527.field7852.field4929.length <= ~(this.field2528 * 2)) {
                this.field2527.field7852.field4966 = 0;
            } else {
                this.field2527.field7852 = new class385(this.field2528 * 2);
            }
            int var9 = 0;
            class385 var10 = this.field2527.field7852;
            if (!this.field2527.field7754) {
                for (int var11 = arg4; ~var11 > ~arg6; ++var11) {
                    int var12 = super.field2116 * var11 + arg3;
                    for (int var13 = arg3; var13 < arg5; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field2510[var12];
                            if (var14 != null) {
                                for (int var15 = 0; var14.length > var15; ++var15) {
                                    ++var9;
                                    var10.method2097(-985, 65535 & var14[var15]);
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; var16 < arg6; ++var16) {
                    int var18 = super.field2116 * var16 + arg3;
                    for (int var19 = arg3; var19 < arg5; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field2510[var18];
                            if (var20 != null) {
                                for (int var21 = 0; ~var21 > ~var20.length; ++var21) {
                                    var10.method2115(65535 & var20[var21], 3324);
                                    ++var9;
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (var9 > 0) {
                class482 var17 = new class482(this.field2527, 5123, var10.field4929, var10.field4966);
                this.field2527.method3120(-5727, var9, 4, var17, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B[S)[S", line = 1371)
    public static final short[] method1205(byte arg0, short[] arg1) {
        ++field2557;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class345.method1933(arg1, 0, var2, 0, arg1.length);
            if (arg0 != -11) {
                method1205((byte) -39, (short[]) null);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V", line = 1390)
    public static void method1206(int arg0) {
        field2555 = null;
        if (arg0 != -18596) {
            method1205((byte) 122, (short[]) null);
        }
        field2540 = null;
        field2558 = null;
        field2545 = null;
        field2505 = null;
        field2523 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lk;IIIIZ)Z", line = 1411)
    public final boolean method851(class483 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2504;
        if (this.field2519 != null && arg0 != null) {
            int var7 = -(this.field2527.field7826 * arg2 >> 8) + arg1 >> this.field2527.field7732;
            int var8 = -(this.field2527.field7800 * arg2 >> 8) + arg3 >> this.field2527.field7732;
            return this.field2519.method30(var8, arg0, var7, 21608);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V", line = 1428)
    public final void method844(int arg0, int arg1) {
        ++field2535;
    }
}
