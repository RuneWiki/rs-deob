import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class151 extends class35 {

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "Lwl;")
    private class280 field2160 = new class280();

    @OriginalMember(owner = "client!ui", name = "U", descriptor = "Lbo;")
    public class511 field2176;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "[[I")
    private int[][] field2146;

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
    private int field2157;

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
    private int field2154;

    @OriginalMember(owner = "client!ui", name = "R", descriptor = "I")
    public int field2173;

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "[[B")
    private byte[][] field2158;

    @OriginalMember(owner = "client!ui", name = "cb", descriptor = "[[F")
    private float[][] field2184;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "[[[Lum;")
    private class362[][][] field2145;

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "[[S")
    public short[][] field2152;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "[[[I")
    private int[][][] field2148;

    @OriginalMember(owner = "client!ui", name = "P", descriptor = "[[[I")
    public int[][][] field2171;

    @OriginalMember(owner = "client!ui", name = "X", descriptor = "[[F")
    private float[][] field2179;

    @OriginalMember(owner = "client!ui", name = "V", descriptor = "[[F")
    private float[][] field2177;

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "[[[I")
    private int[][][] field2162;

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "[[[I")
    public int[][][] field2159;

    @OriginalMember(owner = "client!ui", name = "Q", descriptor = "[[[I")
    private int[][][] field2172;

    @OriginalMember(owner = "client!ui", name = "fb", descriptor = "[[B")
    private byte[][] field2187;

    @OriginalMember(owner = "client!ui", name = "eb", descriptor = "Lub;")
    private class18 field2186;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "Lts;")
    private class371 field2161;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
    public static int field2147 = 0;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    private int field2141;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!ui", name = "H", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!ui", name = "K", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!ui", name = "L", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!ui", name = "M", descriptor = "I")
    private int field2168;

    @OriginalMember(owner = "client!ui", name = "N", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!ui", name = "O", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!ui", name = "S", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!ui", name = "T", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!ui", name = "db", descriptor = "I")
    private int field2185;

    @OriginalMember(owner = "client!ui", name = "gb", descriptor = "I")
    private int field2188;

    @OriginalMember(owner = "client!ui", name = "W", descriptor = "Lgs;")
    public class34 field2178;

    @OriginalMember(owner = "client!ui", name = "Y", descriptor = "Lgs;")
    public class34 field2180;

    @OriginalMember(owner = "client!ui", name = "Z", descriptor = "Lgs;")
    private class34 field2181;

    @OriginalMember(owner = "client!ui", name = "hb", descriptor = "Lgs;")
    public class34 field2189;

    @OriginalMember(owner = "client!ui", name = "ab", descriptor = "Lrg;")
    private class453 field2182;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "Lpc;")
    public static class473 field2138;

    @OriginalMember(owner = "client!ui", name = "bb", descriptor = "[Lum;")
    private class362[] field2183;

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "[[[I")
    private int[][][] field2165;

    @OriginalMember(owner = "client!ui", name = "va", descriptor = "(II)I", line = 9)
    public final int method276(int arg0, int arg1) {
        ++field2174;
        int var3 = arg0 >> super.field558;
        int var4 = arg1 >> super.field558;
        if (var3 >= 0 && var4 >= 0 && super.field557 + -1 >= var3 && ~(super.field559 + -1) <= ~var4) {
            int var5 = arg0 & super.field555 + -1;
            int var6 = super.field555 + -1 & arg1;
            int var7 = (super.field555 - var5) * this.field2146[var3][var4] + this.field2146[var3 - -1][var4] * var5 >> super.field558;
            int var8 = (super.field555 - var5) * this.field2146[var3][var4 + 1] + this.field2146[var3 + 1][var4 + 1] * var5 >> super.field558;
            return (-var6 + super.field555) * var7 + var6 * var8 >> super.field558;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ui", name = "QA", descriptor = "(III)V", line = 35)
    public final void method277(int arg0, int arg1, int arg2) {
        if (~(this.field2187[arg0][arg1] & 255) > ~arg2) {
            this.field2187[arg0][arg1] = (byte) arg2;
        }
        ++field2139;
    }

    @OriginalMember(owner = "client!ui", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 47)
    public final void method280(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg5 != null && this.field2165 == null) {
            this.field2165 = new int[super.field557][super.field559][];
        }
        ++field2175;
        if (arg3 != null && this.field2148 == null) {
            this.field2148 = new int[super.field557][super.field559][];
        }
        this.field2171[arg0][arg1] = arg2;
        this.field2159[arg0][arg1] = arg4;
        this.field2162[arg0][arg1] = arg6;
        this.field2172[arg0][arg1] = arg7;
        if (this.field2165 != null) {
            this.field2165[arg0][arg1] = arg5;
        }
        if (this.field2148 != null) {
            this.field2148[arg0][arg1] = arg3;
        }
        class362[] var15 = this.field2145[arg0][arg1] = new class362[arg6.length];
        for (int var16 = 0; arg6.length > var16; ++var16) {
            long var17 = (long) (arg9[var16] << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) arg8[var16];
            class42 var19;
            for (var19 = this.field2186.method182(var17, (byte) 124); var19 != null; var19 = this.field2186.method177(false)) {
                class362 var20 = (class362) var19;
                if (arg8[var16] == var20.field4885 && (float) arg9[var16] == var20.field4895 && var20.field4881 == arg10 && var20.field4891 == arg11 && var20.field4901 == arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class362) var19;
            } else {
                var15[var16] = new class362(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field2186.method173(var17, var15[var16], (byte) 121);
            }
        }
        if (arg13) {
            this.field2158[arg0][arg1] = (byte) class191.method1230(this.field2158[arg0][arg1], 1);
        }
        if (this.field2188 < arg6.length) {
            this.field2188 = arg6.length;
        }
        this.field2185 += arg6.length;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lor;[I)V", line = 114)
    public final void method271(class451 arg0, int[] arg1) {
        this.field2160.method1666((byte) -105, new class323(this.field2176, this, arg0, arg1));
        ++field2140;
    }

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "()V", line = 130)
    public final void method268() {
        ++field2167;
        if (~this.field2185 >= -1) {
            this.field2161 = null;
        } else {
            byte[][] var1 = new byte[super.field557 + 1][super.field559 + 1];
            for (int var2 = 1; super.field557 > var2; ++var2) {
                for (int var102 = 1; ~super.field559 < ~var102; ++var102) {
                    var1[var2][var102] = (byte) ((this.field2187[var2][var102 + -1] >> 2) + (this.field2187[var2][var102 + 1] >> 3) + (this.field2187[var2][var102] >> 1) + (this.field2187[var2 - -1][var102] >> 3) + (this.field2187[var2 + -1][var102] >> 2));
                }
            }
            this.field2183 = new class362[this.field2186.method174(-56)];
            this.field2186.method175(0, this.field2183);
            for (int var3 = 0; this.field2183.length > var3; ++var3) {
                this.field2183[var3].method2110(this.field2185, 65535);
            }
            int var4 = 24;
            if (this.field2165 != null) {
                var4 += 4;
            }
            if (~(7 & this.field2173) != -1) {
                var4 += 12;
            }
            NativeBuffer var5 = this.field2176.field7402.method2531(this.field2185 * var4);
            NativeStream var6 = new NativeStream(var5);
            class362[] var7 = new class362[this.field2185];
            class18 var8 = new class18(class415.method2408(this.field2185, (byte) -62));
            class362[] var9 = new class362[this.field2188];
            for (int var10 = 0; super.field557 > var10; ++var10) {
                for (int var29 = 0; var29 < super.field559; ++var29) {
                    if (this.field2162[var10][var29] != null) {
                        class362[] var30 = this.field2145[var10][var29];
                        int[] var31 = this.field2171[var10][var29];
                        int[] var32 = this.field2159[var10][var29];
                        int[] var33 = this.field2172[var10][var29];
                        int[] var34 = this.field2162[var10][var29];
                        int[] var35 = this.field2148 == null ? null : this.field2148[var10][var29];
                        int[] var36 = this.field2165 != null ? this.field2165[var10][var29] : null;
                        if (var33 == null) {
                            var33 = var34;
                        }
                        float var37 = this.field2179[var10][var29];
                        float var38 = this.field2184[var10][var29];
                        float var39 = this.field2177[var10][var29];
                        float var40 = this.field2179[var10][var29 - -1];
                        float var41 = this.field2184[var10][var29 + 1];
                        float var42 = this.field2177[var10][var29 + 1];
                        float var43 = this.field2179[var10 + 1][var29 - -1];
                        float var44 = this.field2184[var10 + 1][var29 + 1];
                        float var45 = this.field2177[var10 + 1][var29 + 1];
                        float var46 = this.field2179[var10 - -1][var29];
                        float var47 = this.field2184[var10 - -1][var29];
                        float var48 = this.field2177[var10 + 1][var29];
                        int var49 = var1[var10][var29] & 255;
                        int var50 = 255 & var1[var10][var29 + 1];
                        int var51 = var1[var10 + 1][var29 + 1] & 255;
                        int var52 = var1[var10 + 1][var29] & 255;
                        int var53 = 0;
                        label334: for (int var54 = 0; var34.length > var54; ++var54) {
                            class362 var100 = var30[var54];
                            for (int var101 = 0; var101 < var53; ++var101) {
                                if (var9[var101] == var100) {
                                    continue label334;
                                }
                            }
                            var9[var53++] = var100;
                        }
                        short[] var55 = this.field2152[super.field557 * var29 + var10] = new short[var34.length];
                        for (int var56 = 0; ~var56 > ~var34.length; ++var56) {
                            int var57 = (var10 << super.field558) - -var31[var56];
                            int var58 = (var29 << super.field558) + var32[var56];
                            int var59 = var57 >> this.field2157;
                            int var60 = var58 >> this.field2157;
                            int var61 = var34[var56];
                            int var62 = var33[var56];
                            int var63 = var35 == null ? 0 : var35[var56];
                            long var64 = (long) var62 << 48 | (long) var61 << 32 | (long) (var59 << 16) | (long) var60;
                            int var66 = var31[var56];
                            int var67 = var32[var56];
                            byte var68 = 74;
                            int var69 = 0;
                            float var70 = 1.0F;
                            float var71;
                            int var72;
                            float var73;
                            float var74;
                            if (~var66 == -1 && ~var67 == -1) {
                                var71 = var38;
                                var72 = var68 - var49;
                                var73 = var39;
                                var74 = var37;
                            } else if (~var66 == -1 && super.field555 == var67) {
                                var73 = var42;
                                var72 = var68 - var50;
                                var74 = var40;
                                var71 = var41;
                            } else if (super.field555 == var66 && ~super.field555 == ~var67) {
                                var74 = var43;
                                var73 = var45;
                                var71 = var44;
                                var72 = var68 - var51;
                            } else if (~super.field555 == ~var66 && var67 == 0) {
                                var72 = var68 - var52;
                                var74 = var46;
                                var73 = var48;
                                var71 = var47;
                            } else {
                                float var75 = (float) var66 / (float) super.field555;
                                float var76 = (float) var67 / (float) super.field555;
                                float var77 = (var46 - var37) * var75 + var37;
                                float var78 = (var47 - var38) * var75 + var38;
                                float var79 = (-var39 + var48) * var75 + var39;
                                float var80 = (var43 - var40) * var75 + var40;
                                float var81 = (-var41 + var44) * var75 + var41;
                                var71 = (var81 - var78) * var76 + var78;
                                var74 = (var80 - var77) * var76 + var77;
                                float var82 = (-var42 + var45) * var75 + var42;
                                var73 = (var82 - var79) * var76 + var79;
                                int var83 = ((-var49 + var52) * var66 >> super.field558) + var49;
                                int var84 = ((-var50 + var51) * var66 >> super.field558) + var50;
                                var72 = var68 - (((-var83 + var84) * var67 >> super.field558) + var83);
                            }
                            if (var61 != -1) {
                                int var85 = (var61 & 127) * var72 >> 7;
                                if (var85 >= 2) {
                                    if (~var85 < -127) {
                                        var85 = 126;
                                    }
                                } else {
                                    var85 = 2;
                                }
                                var69 = class180.field2600[var61 & 65408 | var85];
                                if (~(this.field2173 & 7) == -1) {
                                    float var86 = this.field2176.field7463[2] * var73 + this.field2176.field7463[1] * var71 + this.field2176.field7463[0] * var74;
                                    var70 = (var86 > 0.0F ? this.field2176.field7464 : this.field2176.field7454) * var86 + this.field2176.field7524;
                                }
                            }
                            class42 var87 = null;
                            if (~(var57 & this.field2154 + -1) == -1 && (var58 & this.field2154 + -1) == 0) {
                                var87 = var8.method182(var64, (byte) 102);
                            }
                            int var98;
                            if (var87 == null) {
                                int var89;
                                if (var61 != var62) {
                                    int var88 = (var62 & 127) * var72 >> 7;
                                    if (var88 < 2) {
                                        var88 = 2;
                                    } else if (var88 > 126) {
                                        var88 = 126;
                                    }
                                    var89 = class180.field2600[var62 & 65408 | var88];
                                    if (~(this.field2173 & 7) == -1) {
                                        float var90 = this.field2176.field7463[2] * var73 + this.field2176.field7463[0] * var74 + this.field2176.field7463[1] * var71;
                                        float var91 = this.field2176.field7524 + (var70 > 0.0F ? this.field2176.field7464 : this.field2176.field7454) * var70;
                                        int var92 = var89 >> 16 & 255;
                                        int var93 = 255 & var89 >> 8;
                                        int var94 = var89 & 255;
                                        int var95 = (int) ((float) var92 * var91);
                                        if (var95 < 0) {
                                            var95 = 0;
                                        } else if (var95 > 255) {
                                            var95 = 255;
                                        }
                                        int var96 = (int) ((float) var93 * var91);
                                        int var97 = (int) ((float) var94 * var91);
                                        if (var96 < 0) {
                                            var96 = 0;
                                        } else if (~var96 < -256) {
                                            var96 = 255;
                                        }
                                        if (var97 < 0) {
                                            var97 = 0;
                                        } else if (var97 > 255) {
                                            var97 = 255;
                                        }
                                        var89 = var96 << 8 | var95 << 16 | var97;
                                    }
                                } else {
                                    var89 = var69;
                                }
                                if (this.field2176.field7493) {
                                    var6.method2529((float) var57);
                                    var6.method2529((float) (this.method276(var57, var58) - -var63));
                                    var6.method2529((float) var58);
                                    var6.method2528((byte) (var89 >> 16));
                                    var6.method2528((byte) (var89 >> 8));
                                    var6.method2528((byte) var89);
                                    var6.method2528(-1);
                                    var6.method2529((float) var57);
                                    var6.method2529((float) var58);
                                    if (this.field2165 != null) {
                                        var6.method2529((float) (var36 == null ? 0 : var36[var56] + -1));
                                    }
                                    if (~(this.field2173 & 7) != -1) {
                                        var6.method2529(var74);
                                        var6.method2529(var71);
                                        var6.method2529(var73);
                                    }
                                } else {
                                    var6.method2523((float) var57);
                                    var6.method2523((float) (this.method276(var57, var58) + var63));
                                    var6.method2523((float) var58);
                                    var6.method2528((byte) (var89 >> 16));
                                    var6.method2528((byte) (var89 >> 8));
                                    var6.method2528((byte) var89);
                                    var6.method2528(-1);
                                    var6.method2523((float) var57);
                                    var6.method2523((float) var58);
                                    if (this.field2165 != null) {
                                        var6.method2523((float) (var36 != null ? var36[var56] + -1 : 0));
                                    }
                                    if ((this.field2173 & 7) != 0) {
                                        var6.method2523(var74);
                                        var6.method2523(var71);
                                        var6.method2523(var73);
                                    }
                                }
                                var98 = this.field2141++;
                                var55[var56] = (short) var98;
                                if (var61 != -1) {
                                    var7[var98] = var30[var56];
                                }
                                var8.method173(var64, new class367(var55[var56]), (byte) 85);
                            } else {
                                var55[var56] = ((class367) var87).field4960;
                                var98 = var55[var56] & 65535;
                                if (~var61 != 0 && ~var7[var98].field622 < ~var30[var56].field622) {
                                    var7[var98] = var30[var56];
                                }
                            }
                            for (int var99 = 0; ~var99 > ~var53; ++var99) {
                                var9[var99].method2108(var72, var98, var69, 65280, var70);
                            }
                            ++this.field2168;
                        }
                    }
                }
            }
            for (int var11 = 0; var11 < this.field2141; ++var11) {
                class362 var28 = var7[var11];
                if (var28 != null) {
                    var28.method2106(var11, -56);
                }
            }
            for (int var12 = 0; super.field557 > var12; ++var12) {
                for (int var17 = 0; super.field559 > var17; ++var17) {
                    short[] var18 = this.field2152[super.field557 * var17 + var12];
                    if (var18 != null) {
                        int var19 = 0;
                        int var20 = 0;
                        while (~var18.length < ~var20) {
                            int var21 = var18[var20++] & 65535;
                            int var22 = 65535 & var18[var20++];
                            int var23 = 65535 & var18[var20++];
                            class362 var24 = var7[var21];
                            class362 var25 = var7[var22];
                            class362 var26 = var7[var23];
                            class362 var27 = null;
                            if (var24 != null) {
                                var27 = var24;
                                var24.method2111(var12, var17, var19, (byte) 127);
                            }
                            if (var25 != null) {
                                var25.method2111(var12, var17, var19, (byte) 123);
                                if (var27 == null || var25.field622 < var27.field622) {
                                    var27 = var25;
                                }
                            }
                            if (var26 != null) {
                                var26.method2111(var12, var17, var19, (byte) -92);
                                if (var27 == null || var27.field622 > var26.field622) {
                                    var27 = var26;
                                }
                            }
                            if (var27 != null) {
                                if (var24 != null) {
                                    var27.method2106(var21, -97);
                                }
                                if (var25 != null) {
                                    var27.method2106(var22, -125);
                                }
                                if (var26 != null) {
                                    var27.method2106(var23, -68);
                                }
                                var27.method2111(var12, var17, var19, (byte) -64);
                            }
                            ++var19;
                        }
                    }
                }
            }
            var6.method2525();
            this.field2182 = this.field2176.method2955(34165, var6.method2526(), false, var4, var5);
            this.field2189 = new class34(this.field2176, this.field2182, 5126, 3, 0);
            this.field2181 = new class34(this.field2176, this.field2182, 5121, 4, 12);
            byte var13;
            if (this.field2165 == null) {
                this.field2178 = new class34(this.field2176, this.field2182, 5126, 2, 16);
                var13 = 24;
            } else {
                this.field2178 = new class34(this.field2176, this.field2182, 5126, 3, 16);
                var13 = 28;
            }
            if (~(this.field2173 & 7) != -1) {
                this.field2180 = new class34(this.field2176, this.field2182, 5126, 3, var13);
            }
            long[] var14 = new long[this.field2183.length];
            for (int var15 = 0; ~this.field2183.length < ~var15; ++var15) {
                class362 var16 = this.field2183[var15];
                var14[var15] = var16.field622;
                var16.method2112(this.field2141, 4);
            }
            class124.method905(this.field2183, (byte) -114, var14);
            if (this.field2161 != null) {
                this.field2161.method2151(true);
            }
        }
        this.field2165 = null;
        this.field2145 = null;
        this.field2148 = null;
        this.field2172 = null;
        this.field2186 = null;
        this.field2179 = this.field2184 = this.field2177 = null;
        this.field2171 = this.field2159 = null;
        this.field2187 = null;
        this.field2162 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZLgm;)V", line = 702)
    public static final void method1032(boolean arg0, class79 arg1) {
        arg1.field1177 = arg0;
        if (arg1.field1180 != null) {
            arg1.field1180.field588 = 0;
        }
        ++field2156;
        for (class79 var2 = arg1.method89(); var2 != null; var2 = arg1.method92()) {
            method1032(false, var2);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "([[ZIZIIII)V", line = 720)
    private final void method1033(boolean[][] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 0) {
            this.field2154 = -21;
        }
        if (this.field2183 != null) {
            float var8 = this.field2176.field7534;
            float var9 = this.field2176.field7494;
            int var10 = arg3 + 1 + arg3;
            int var11 = var10 * var10;
            if (class124.field1825.length < var11) {
                class124.field1825 = new int[var11];
            }
            if (~class109.field1579.field5152.length > ~(this.field2168 * 2)) {
                class109.field1579 = new class379(this.field2168 * 2);
            }
            int var12 = -arg3 + arg6;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = -arg3 + arg5;
            int var15 = var14;
            if (~var14 > -1) {
                var14 = 0;
            }
            int var16 = arg3 + arg6;
            if (var16 > super.field557 + -1) {
                var16 = super.field557 + -1;
            }
            int var17 = arg5 - -arg3;
            class96.field1446 = 0;
            if (super.field559 - 1 < var17) {
                var17 = super.field559 + -1;
            }
            for (int var18 = var12; ~var18 >= ~var16; ++var18) {
                boolean[] var24 = arg0[var18 - var13];
                for (int var25 = var14; ~var17 <= ~var25; ++var25) {
                    if (var24[var25 - var15]) {
                        class124.field1825[class96.field1446++] = super.field557 * var25 + var18;
                    }
                }
            }
            if (~arg1 != 0) {
                this.field2176.method2987((float) arg1, (byte) 112);
                this.field2176.method2952(arg4 + 1);
            } else {
                this.field2176.method2973((byte) 75);
            }
            this.field2176.method2969(~(7 & this.field2173) != -1, arg4 ^ 4940);
            for (int var19 = 0; var19 < this.field2183.length; ++var19) {
                this.field2183[var19].method2104(class124.field1825, -128, class96.field1446);
            }
            if (!this.field2160.method1664((byte) -53)) {
                int var20 = this.field2176.field7484;
                int var21 = this.field2176.field7526;
                this.field2176.method606(0, var21, this.field2176.field7439);
                this.field2176.method568(var9, var8 + -4.0F);
                this.field2176.method2969(false, 4940);
                this.field2176.method2951(false, 34018);
                this.field2176.method2978(128, (byte) -109);
                this.field2176.method2935(47, -2);
                this.field2176.method2980(this.field2176.field7438, 111);
                this.field2176.method3002((byte) -84, 8448, 7681);
                this.field2176.method2953(0, (byte) 70, 770, 34166);
                this.field2176.method2950((byte) -34, 770, 0, 34167);
                for (class42 var22 = this.field2160.method1672((byte) -107); var22 != null; var22 = this.field2160.method1668(-1)) {
                    class323 var23 = (class323) var22;
                    var23.method1865(arg3, arg6, arg0, (byte) -120, arg5);
                }
                this.field2176.method2953(0, (byte) 89, 768, 5890);
                this.field2176.method2950((byte) -34, 770, 0, 5890);
                this.field2176.method2980((class501) null, arg4 ^ 109);
                this.field2176.method606(var20, var21, this.field2176.field7439);
            }
            if (this.field2161 != null) {
                this.field2176.method568(var9, var8 + -8.0F);
                this.field2176.method2973((byte) 81);
                this.field2176.method2975(this.field2178, this.field2189, (class34) null, (class34) null, 86);
                this.field2161.method2150(arg6, (byte) -118, arg2, arg5, arg0, arg3);
            }
            this.field2176.method568(var9, var8);
        }
        ++field2153;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIII[[Z)V", line = 867)
    public final void method278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field2163;
        if (~this.field2185 < -1) {
            this.field2176.method2995((byte) 36);
            this.field2176.method2945(false, (byte) -70);
            this.field2176.method2969(false, 4940);
            this.field2176.method2982(false, 2929);
            this.field2176.method2951(false, 34018);
            this.field2176.method2978(0, (byte) -64);
            this.field2176.method2935(47, -2);
            this.field2176.method2980((class501) null, 111);
            class54.field838[1] = 0.0F;
            class54.field838[8] = 0.0F;
            class54.field838[6] = 0.0F;
            class54.field838[10] = 0.0F;
            class54.field838[3] = 0.0F;
            class54.field838[9] = 0.0F;
            class54.field838[11] = 0.0F;
            class54.field838[2] = 0.0F;
            class54.field838[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field2176.field7250;
            class54.field838[5] = (float) arg2 / ((float) super.field555 * 128.0F * (float) this.field2176.field7250);
            class54.field838[0] = (float) arg2 / ((float) super.field555 * 128.0F * (float) this.field2176.field7226);
            class54.field838[7] = 0.0F;
            class54.field838[4] = 0.0F;
            class54.field838[14] = 0.0F;
            class54.field838[15] = 1.0F;
            class54.field838[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field2176.field7226) + -1.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class54.field838, 0);
            class54.field838[15] = 1.0F;
            class54.field838[8] = 0.0F;
            class54.field838[11] = 0.0F;
            class54.field838[0] = 1.0F;
            class54.field838[10] = 0.0F;
            class54.field838[1] = 0.0F;
            class54.field838[7] = 0.0F;
            class54.field838[2] = 0.0F;
            class54.field838[13] = 0.0F;
            class54.field838[14] = 0.0F;
            class54.field838[6] = 1.0F;
            class54.field838[5] = 0.0F;
            class54.field838[9] = 1.0F;
            class54.field838[3] = 0.0F;
            class54.field838[12] = 0.0F;
            class54.field838[4] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class54.field838, 0);
            if ((this.field2173 & 7) != 0) {
                this.field2176.method2969(true, 4940);
                this.field2176.method2968((byte) -109);
            } else {
                this.field2176.method2969(false, 4940);
            }
            this.field2176.method2975(this.field2178, this.field2189, this.field2180, this.field2181, 90);
            if (~class109.field1579.field5152.length > ~(this.field2168 * 2)) {
                class109.field1579 = new class379(this.field2168 * 2);
            } else {
                class109.field1579.field5173 = 0;
            }
            int var9 = 0;
            if (!this.field2176.field7493) {
                for (int var10 = arg4; ~var10 > ~arg6; ++var10) {
                    int var11 = super.field557 * var10 + arg3;
                    for (int var12 = arg3; arg5 > var12; ++var12) {
                        if (arg7[-arg3 + var12][-arg4 + var10]) {
                            short[] var13 = this.field2152[var11];
                            if (var13 != null) {
                                for (int var14 = 0; ~var13.length < ~var14; ++var14) {
                                    ++var9;
                                    class109.field1579.method2215(65535 & var13[var14], (byte) 76);
                                }
                            }
                        }
                        ++var11;
                    }
                }
            } else {
                for (int var15 = arg4; ~arg6 < ~var15; ++var15) {
                    int var17 = super.field557 * var15 + arg3;
                    for (int var18 = arg3; ~var18 > ~arg5; ++var18) {
                        if (arg7[-arg3 + var18][-arg4 + var15]) {
                            short[] var19 = this.field2152[var17];
                            if (var19 != null) {
                                for (int var20 = 0; ~var20 > ~var19.length; ++var20) {
                                    ++var9;
                                    class109.field1579.method2246(var19[var20] & 65535, (byte) -75);
                                }
                            }
                        }
                        ++var17;
                    }
                }
            }
            if (var9 > 0) {
                class366 var16 = new class366(this.field2176, 5123, class109.field1579.field5152, class109.field1579.field5173);
                this.field2176.method2971(0, var9, var16, 7629, 4);
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IBILwg;)V", line = 1035)
    private final void method1034(int arg0, byte arg1, int arg2, class292 arg3) {
        ++field2164;
        int[] var5 = this.field2171[arg2][arg0];
        if (arg1 != -62) {
            this.field2178 = null;
        }
        int[] var6 = this.field2159[arg2][arg0];
        int var7 = var5.length;
        if (~var7 < ~class146.field2071.length) {
            class146.field2071 = new int[var7];
            class435.field5977 = new int[var7];
        }
        for (int var8 = 0; ~var8 > ~var7; ++var8) {
            class146.field2071[var8] = class494.method2839(255, var5[var8]) >> this.field2176.field7403;
            class435.field5977[var8] = class494.method2839(var6[var8], 255) >> this.field2176.field7403;
        }
        int var9 = 0;
        while (~var9 > ~var7) {
            int var10 = class146.field2071[var9];
            int var11 = class435.field5977[var9++];
            int var12 = class146.field2071[var9];
            int var13 = class435.field5977[var9++];
            int var14 = class146.field2071[var9];
            int var15 = class435.field5977[var9++];
            if ((var10 - var12) * (-var15 + var13) - (var13 - var11) * (var14 - var12) > 0) {
                arg3.method1714(var13, var14, var11, var10, 181458608, var15, var12);
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 1094)
    public final void method275(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field2143;
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
        for (int var28 = 0; ~var18 < ~var28; ++var28) {
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
        this.method280(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V", line = 1187)
    public final void method274(int arg0, int arg1) {
        ++field2155;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lbo;IIII[[I[[II)V", line = 1194)
    public class151(class511 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field2176 = arg0;
        this.field2146 = arg5;
        this.field2157 = super.field558 + -2;
        this.field2154 = 1 << this.field2157;
        this.field2173 = arg2;
        this.field2158 = new byte[arg3][arg4];
        this.field2184 = new float[super.field557 + 1][super.field559 + 1];
        this.field2145 = new class362[arg3][arg4][];
        this.field2152 = new short[arg3 * arg4][];
        this.field2148 = new int[arg3][arg4][];
        this.field2171 = new int[arg3][arg4][];
        this.field2179 = new float[super.field557 + 1][super.field559 + 1];
        this.field2177 = new float[super.field557 + 1][super.field559 + 1];
        this.field2162 = new int[arg3][arg4][];
        this.field2159 = new int[arg3][arg4][];
        this.field2172 = new int[arg3][arg4][];
        this.field2187 = new byte[arg3 + 1][arg4 + 1];
        for (int var9 = 1; ~super.field559 < ~var9; ++var9) {
            for (int var10 = 1; super.field557 > var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var11 * var11 - (-(arg7 * arg7 * 4) - var12 * var12))));
                this.field2179[var10][var9] = (float) var11 * var13;
                this.field2184[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field2177[var10][var9] = (float) var12 * var13;
            }
        }
        this.field2186 = new class18(128);
        if (~(this.field2173 & 16) != -1) {
            this.field2161 = new class371(this.field2176, this);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III[[ZZ)V", line = 1252)
    public final void method270(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method1033(arg3, -1, arg4, arg2, 0, arg1, arg0);
        ++field2170;
    }

    @OriginalMember(owner = "client!ui", name = "U", descriptor = "(Lj;IIIIZ)V", line = 1260)
    public final void method281(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2144;
        if (this.field2161 != null && arg0 != null) {
            int var7 = arg1 - (this.field2176.field7435 * arg2 >> 8) >> this.field2176.field7403;
            int var8 = -(this.field2176.field7537 * arg2 >> 8) + arg3 >> this.field2176.field7403;
            this.field2161.method2144(var7, (byte) -127, var8, arg0);
        }
    }

    @OriginalMember(owner = "client!ui", name = "SA", descriptor = "(Lj;IIIIZ)V", line = 1282)
    public final void method266(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2150;
        if (this.field2161 != null && arg0 != null) {
            int var7 = -(this.field2176.field7435 * arg2 >> 8) + arg1 >> this.field2176.field7403;
            int var8 = -(this.field2176.field7537 * arg2 >> 8) + arg3 >> this.field2176.field7403;
            this.field2161.method2145(var8, arg0, var7, (byte) -85);
        }
    }

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "(II)I", line = 1303)
    public final int method272(int arg0, int arg1) {
        ++field2151;
        return this.field2146[arg0][arg1];
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)V", line = 1311)
    public static void method1035(boolean arg0) {
        field2138 = null;
        if (!arg0) {
            field2138 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lj;IIIIZ)Z", line = 1321)
    public final boolean method269(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2149;
        if (this.field2161 != null && arg0 != null) {
            int var7 = -(this.field2176.field7435 * arg2 >> 8) + arg1 >> this.field2176.field7403;
            int var8 = arg3 - (this.field2176.field7537 * arg2 >> 8) >> this.field2176.field7403;
            return this.field2161.method2146(arg0, var7, var8, -37);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(FFILv;IIFFIFI)[B", line = 1343)
    public static final byte[] method1036(float arg0, float arg1, int arg2, class407 arg3, int arg4, int arg5, float arg6, float arg7, int arg8, float arg9, int arg10) {
        ++field2142;
        byte[] var11 = new byte[arg5 * arg10 * arg8];
        class291.method1710(arg7, arg10, arg4, arg9, var11, arg6, arg3, arg0, 0, true, arg5, arg8, arg1);
        return arg2 != 30938 ? null : var11;
    }

    @OriginalMember(owner = "client!ui", name = "O", descriptor = "(IILj;)Lj;", line = 1359)
    public final class377 method279(int arg0, int arg1, class377 arg2) {
        ++field2169;
        if ((this.field2158[arg0][arg1] & 1) == 0) {
            return null;
        } else {
            int var4 = super.field555 >> this.field2176.field7403;
            class292 var5 = (class292) arg2;
            class292 var6;
            if (var5 != null && var5.method1715(-114, var4, var4)) {
                var6 = var5;
                var5.method1717(-125);
            } else {
                var6 = new class292(this.field2176, var4, var4);
            }
            var6.method1712(0, var4, var4, 0, (byte) 101);
            this.method1034(arg1, (byte) -62, arg0, var6);
            return var6;
        }
    }
}
