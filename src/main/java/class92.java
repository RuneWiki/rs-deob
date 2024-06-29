import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class92 extends class30 {

    @OriginalMember(owner = "client!ka", name = "Eb", descriptor = "I")
    public int field2134 = 0;

    @OriginalMember(owner = "client!ka", name = "qc", descriptor = "I")
    public int field2172 = 0;

    @OriginalMember(owner = "client!ka", name = "lc", descriptor = "B")
    public byte field2167 = 0;

    @OriginalMember(owner = "client!ka", name = "zc", descriptor = "Z")
    private boolean field2181 = false;

    @OriginalMember(owner = "client!ka", name = "Fb", descriptor = "I")
    public int field2135;

    @OriginalMember(owner = "client!ka", name = "oc", descriptor = "[I")
    public int[] field2170;

    @OriginalMember(owner = "client!ka", name = "kc", descriptor = "[I")
    public int[] field2166;

    @OriginalMember(owner = "client!ka", name = "nc", descriptor = "[I")
    public int[] field2169;

    @OriginalMember(owner = "client!ka", name = "tc", descriptor = "[I")
    private int[] field2175;

    @OriginalMember(owner = "client!ka", name = "Ob", descriptor = "[I")
    public int[] field2144;

    @OriginalMember(owner = "client!ka", name = "Kb", descriptor = "[I")
    public int[] field2140;

    @OriginalMember(owner = "client!ka", name = "Ib", descriptor = "[I")
    public int[] field2138;

    @OriginalMember(owner = "client!ka", name = "Nb", descriptor = "[B")
    public byte[] field2143;

    @OriginalMember(owner = "client!ka", name = "Wb", descriptor = "[B")
    public byte[] field2152;

    @OriginalMember(owner = "client!ka", name = "Sb", descriptor = "[B")
    public byte[] field2148;

    @OriginalMember(owner = "client!ka", name = "Pb", descriptor = "[I")
    private int[] field2145;

    @OriginalMember(owner = "client!ka", name = "Mb", descriptor = "[S")
    public short[] field2142;

    @OriginalMember(owner = "client!ka", name = "yc", descriptor = "[B")
    public byte[] field2180;

    @OriginalMember(owner = "client!ka", name = "Lb", descriptor = "[S")
    public short[] field2141;

    @OriginalMember(owner = "client!ka", name = "pc", descriptor = "[B")
    public byte[] field2171;

    @OriginalMember(owner = "client!ka", name = "Rb", descriptor = "[S")
    public short[] field2147;

    @OriginalMember(owner = "client!ka", name = "ec", descriptor = "[S")
    public short[] field2160;

    @OriginalMember(owner = "client!ka", name = "xc", descriptor = "[S")
    public short[] field2179;

    @OriginalMember(owner = "client!ka", name = "Hb", descriptor = "[S")
    private short[] field2137;

    @OriginalMember(owner = "client!ka", name = "dc", descriptor = "[S")
    private short[] field2159;

    @OriginalMember(owner = "client!ka", name = "sc", descriptor = "[S")
    private short[] field2174;

    @OriginalMember(owner = "client!ka", name = "jc", descriptor = "[B")
    private byte[] field2165;

    @OriginalMember(owner = "client!ka", name = "Vb", descriptor = "[B")
    private byte[] field2151;

    @OriginalMember(owner = "client!ka", name = "bc", descriptor = "[B")
    private byte[] field2157;

    @OriginalMember(owner = "client!ka", name = "rc", descriptor = "[B")
    private byte[] field2173;

    @OriginalMember(owner = "client!ka", name = "Yb", descriptor = "[B")
    private byte[] field2154;

    @OriginalMember(owner = "client!ka", name = "vc", descriptor = "[[I")
    public int[][] field2177;

    @OriginalMember(owner = "client!ka", name = "fc", descriptor = "[[I")
    public int[][] field2161;

    @OriginalMember(owner = "client!ka", name = "ac", descriptor = "[Led;")
    public class43[] field2156;

    @OriginalMember(owner = "client!ka", name = "uc", descriptor = "[Lhc;")
    public class68[] field2176;

    @OriginalMember(owner = "client!ka", name = "Xb", descriptor = "[Led;")
    public class43[] field2153;

    @OriginalMember(owner = "client!ka", name = "wc", descriptor = "S")
    public short field2178;

    @OriginalMember(owner = "client!ka", name = "ic", descriptor = "S")
    public short field2164;

    @OriginalMember(owner = "client!ka", name = "Gb", descriptor = "I")
    private static int field2136 = 0;

    @OriginalMember(owner = "client!ka", name = "Zb", descriptor = "[I")
    private static int[] field2155 = class25.field576;

    @OriginalMember(owner = "client!ka", name = "gc", descriptor = "[I")
    private static int[] field2162 = class25.field571;

    @OriginalMember(owner = "client!ka", name = "hc", descriptor = "[I")
    private static int[] field2163 = new int[10000];

    @OriginalMember(owner = "client!ka", name = "Jb", descriptor = "[I")
    private static int[] field2139 = new int[10000];

    @OriginalMember(owner = "client!ka", name = "Qb", descriptor = "S")
    private short field2146;

    @OriginalMember(owner = "client!ka", name = "Tb", descriptor = "S")
    private short field2149;

    @OriginalMember(owner = "client!ka", name = "Ub", descriptor = "S")
    private short field2150;

    @OriginalMember(owner = "client!ka", name = "cc", descriptor = "S")
    private short field2158;

    @OriginalMember(owner = "client!ka", name = "mc", descriptor = "S")
    private short field2168;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([[IIIIZI)Lka;")
    public final class92 method780(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method792();
        int var7 = this.field2150 + arg1;
        int var8 = this.field2149 + arg1;
        int var9 = this.field2158 + arg3;
        int var10 = this.field2146 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class92 var15;
                if (arg4) {
                    var15 = new class92();
                    var15.field2134 = this.field2134;
                    var15.field2172 = this.field2172;
                    var15.field2135 = this.field2135;
                    var15.field2170 = this.field2170;
                    var15.field2169 = this.field2169;
                    var15.field2144 = this.field2144;
                    var15.field2140 = this.field2140;
                    var15.field2138 = this.field2138;
                    var15.field2143 = this.field2143;
                    var15.field2152 = this.field2152;
                    var15.field2148 = this.field2148;
                    var15.field2180 = this.field2180;
                    var15.field2141 = this.field2141;
                    var15.field2142 = this.field2142;
                    var15.field2167 = this.field2167;
                    var15.field2171 = this.field2171;
                    var15.field2147 = this.field2147;
                    var15.field2160 = this.field2160;
                    var15.field2179 = this.field2179;
                    var15.field2137 = this.field2137;
                    var15.field2159 = this.field2159;
                    var15.field2174 = this.field2174;
                    var15.field2165 = this.field2165;
                    var15.field2151 = this.field2151;
                    var15.field2157 = this.field2157;
                    var15.field2173 = this.field2173;
                    var15.field2154 = this.field2154;
                    var15.field2175 = this.field2175;
                    var15.field2145 = this.field2145;
                    var15.field2177 = this.field2177;
                    var15.field2161 = this.field2161;
                    var15.field2178 = this.field2178;
                    var15.field2164 = this.field2164;
                    var15.field2166 = new int[var15.field2134];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field2134; ++var16) {
                        int var17 = this.field2170[var16] + arg1;
                        int var18 = this.field2169[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field2166[var16] = this.field2166[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field2134; ++var26) {
                        int var27 = (this.field2166[var26] << 16) / super.field728;
                        if (var27 < arg5) {
                            int var28 = this.field2170[var26] + arg1;
                            int var29 = this.field2169[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field2166[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2166[var26];
                        } else {
                            var15.field2166[var26] = this.field2166[var26];
                        }
                    }
                }
                var15.method783();
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
    public final void method781() {
        for (int var1 = 0; var1 < this.field2134; ++var1) {
            this.field2169[var1] = -this.field2169[var1];
        }
        this.method783();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)V")
    public final void method782(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2134; ++var4) {
            this.field2170[var4] = this.field2170[var4] * arg0 / 128;
            this.field2166[var4] = this.field2166[var4] * arg1 / 128;
            this.field2169[var4] = this.field2169[var4] * arg2 / 128;
        }
        this.method783();
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
    private final void method783() {
        this.field2156 = null;
        this.field2153 = null;
        this.field2176 = null;
        this.field2181 = false;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ljc;II)Lka;")
    public static final class92 method784(class85 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method745(arg1, arg2, 0);
        return var3 == null ? null : new class92(var3);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(SS)V")
    public final void method785(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2172; ++var3) {
            if (this.field2141[var3] == arg0) {
                this.field2141[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([B)V")
    private final void method786(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class3 var4 = new class3(arg0);
        class3 var5 = new class3(arg0);
        class3 var6 = new class3(arg0);
        class3 var7 = new class3(arg0);
        class3 var8 = new class3(arg0);
        var4.field54 = arg0.length - 18;
        int var9 = var4.method46((byte) 65);
        int var10 = var4.method46((byte) 65);
        int var11 = var4.method64(31790);
        int var12 = var4.method64(31790);
        int var13 = var4.method64(31790);
        int var14 = var4.method64(31790);
        int var15 = var4.method64(31790);
        int var16 = var4.method64(31790);
        int var17 = var4.method46((byte) 65);
        int var18 = var4.method46((byte) 65);
        int var19 = var4.method46((byte) 65);
        int var20 = var4.method46((byte) 65);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field2134 = var9;
        this.field2172 = var10;
        this.field2135 = var11;
        this.field2170 = new int[var9];
        this.field2166 = new int[var9];
        this.field2169 = new int[var9];
        this.field2144 = new int[var10];
        this.field2140 = new int[var10];
        this.field2138 = new int[var10];
        if (var11 > 0) {
            this.field2171 = new byte[var11];
            this.field2147 = new short[var11];
            this.field2160 = new short[var11];
            this.field2179 = new short[var11];
        }
        if (var16 == 1) {
            this.field2175 = new int[var9];
        }
        if (var12 == 1) {
            this.field2143 = new byte[var10];
            this.field2180 = new byte[var10];
            this.field2142 = new short[var10];
        }
        if (var13 == 255) {
            this.field2152 = new byte[var10];
        } else {
            this.field2167 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2148 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2145 = new int[var10];
        }
        this.field2141 = new short[var10];
        var4.field54 = var21;
        var5.field54 = var36;
        var6.field54 = var38;
        var7.field54 = var40;
        var8.field54 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var62 = var4.method64(31790);
            int var63 = 0;
            if ((var62 & 1) != 0) {
                var63 = var5.method35(true);
            }
            int var64 = 0;
            if ((var62 & 2) != 0) {
                var64 = var6.method35(true);
            }
            int var65 = 0;
            if ((var62 & 4) != 0) {
                var65 = var7.method35(true);
            }
            this.field2170[var46] = var43 + var63;
            this.field2166[var46] = var44 + var64;
            this.field2169[var46] = var45 + var65;
            var43 = this.field2170[var46];
            var44 = this.field2166[var46];
            var45 = this.field2169[var46];
            if (var16 == 1) {
                this.field2175[var46] = var8.method64(31790);
            }
        }
        var4.field54 = var32;
        var5.field54 = var28;
        var6.field54 = var26;
        var7.field54 = var30;
        var8.field54 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field2141[var47] = (short) var4.method46((byte) 65);
            if (var12 == 1) {
                int var61 = var5.method64(31790);
                if ((var61 & 1) == 1) {
                    this.field2143[var47] = 1;
                    var2 = true;
                } else {
                    this.field2143[var47] = 0;
                }
                if ((var61 & 2) == 2) {
                    this.field2180[var47] = (byte) (var61 >> 2);
                    this.field2142[var47] = this.field2141[var47];
                    this.field2141[var47] = 127;
                    if (this.field2142[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2180[var47] = -1;
                    this.field2142[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field2152[var47] = var6.method73((byte) 29);
            }
            if (var14 == 1) {
                this.field2148[var47] = var7.method73((byte) 29);
            }
            if (var15 == 1) {
                this.field2145[var47] = var8.method64(31790);
            }
        }
        var4.field54 = var25;
        var5.field54 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var57 = var5.method64(31790);
            if (var57 == 1) {
                var48 = var4.method35(true) + var51;
                var49 = var4.method35(true) + var48;
                var50 = var4.method35(true) + var49;
                var51 = var50;
                this.field2144[var52] = var48;
                this.field2140[var52] = var49;
                this.field2138[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method35(true) + var51;
                var51 = var50;
                this.field2144[var52] = var48;
                this.field2140[var52] = var49;
                this.field2138[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method35(true) + var51;
                var51 = var50;
                this.field2144[var52] = var48;
                this.field2140[var52] = var49;
                this.field2138[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method35(true) + var51;
                var51 = var50;
                this.field2144[var52] = var48;
                this.field2140[var52] = var60;
                this.field2138[var52] = var50;
            }
        }
        var4.field54 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field2171[var53] = 0;
            this.field2147[var53] = (short) var4.method46((byte) 65);
            this.field2160[var53] = (short) var4.method46((byte) 65);
            this.field2179[var53] = (short) var4.method46((byte) 65);
        }
        if (this.field2180 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; ++var55) {
                int var56 = this.field2180[var55] & 255;
                if (var56 != 255) {
                    if ((this.field2147[var56] & 65535) == this.field2144[var55] && (this.field2160[var56] & 65535) == this.field2140[var55] && (this.field2179[var56] & 65535) == this.field2138[var55]) {
                        this.field2180[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field2180 = null;
            }
        }
        if (!var3) {
            this.field2142 = null;
        }
        if (!var2) {
            this.field2143 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "([B)V")
    private final void method787(byte[] arg0) {
        class3 var2 = new class3(arg0);
        class3 var3 = new class3(arg0);
        class3 var4 = new class3(arg0);
        class3 var5 = new class3(arg0);
        class3 var6 = new class3(arg0);
        class3 var7 = new class3(arg0);
        class3 var8 = new class3(arg0);
        var2.field54 = arg0.length - 23;
        int var9 = var2.method46((byte) 65);
        int var10 = var2.method46((byte) 65);
        int var11 = var2.method64(31790);
        int var12 = var2.method64(31790);
        int var13 = var2.method64(31790);
        int var14 = var2.method64(31790);
        int var15 = var2.method64(31790);
        int var16 = var2.method64(31790);
        int var17 = var2.method64(31790);
        int var18 = var2.method46((byte) 65);
        int var19 = var2.method46((byte) 65);
        int var20 = var2.method46((byte) 65);
        int var21 = var2.method46((byte) 65);
        int var22 = var2.method46((byte) 65);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2171 = new byte[var11];
            var2.field54 = 0;
            for (int var26 = 0; var26 < var11; ++var26) {
                byte var27 = this.field2171[var26] = var2.method73((byte) 29);
                if (var27 == 0) {
                    ++var23;
                }
                if (var27 >= 1 && var27 <= 3) {
                    ++var24;
                }
                if (var27 == 2) {
                    ++var25;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var25 * 2 + var24 + var60;
        this.field2134 = var9;
        this.field2172 = var10;
        this.field2135 = var11;
        this.field2170 = new int[var9];
        this.field2166 = new int[var9];
        this.field2169 = new int[var9];
        this.field2144 = new int[var10];
        this.field2140 = new int[var10];
        this.field2138 = new int[var10];
        if (var17 == 1) {
            this.field2175 = new int[var9];
        }
        if (var12 == 1) {
            this.field2143 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2152 = new byte[var10];
        } else {
            this.field2167 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2148 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2145 = new int[var10];
        }
        if (var16 == 1) {
            this.field2142 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2180 = new byte[var10];
        }
        this.field2141 = new short[var10];
        if (var11 > 0) {
            this.field2147 = new short[var11];
            this.field2160 = new short[var11];
            this.field2179 = new short[var11];
            if (var24 > 0) {
                this.field2137 = new short[var24];
                this.field2159 = new short[var24];
                this.field2174 = new short[var24];
                this.field2165 = new byte[var24];
                this.field2151 = new byte[var24];
                this.field2157 = new byte[var24];
            }
            if (var25 > 0) {
                this.field2173 = new byte[var25];
                this.field2154 = new byte[var25];
            }
        }
        var2.field54 = var11;
        var3.field54 = var44;
        var4.field54 = var46;
        var5.field54 = var48;
        var6.field54 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; ++var67) {
            int var81 = var2.method64(31790);
            int var82 = 0;
            if ((var81 & 1) != 0) {
                var82 = var3.method35(true);
            }
            int var83 = 0;
            if ((var81 & 2) != 0) {
                var83 = var4.method35(true);
            }
            int var84 = 0;
            if ((var81 & 4) != 0) {
                var84 = var5.method35(true);
            }
            this.field2170[var67] = var64 + var82;
            this.field2166[var67] = var65 + var83;
            this.field2169[var67] = var66 + var84;
            var64 = this.field2170[var67];
            var65 = this.field2166[var67];
            var66 = this.field2169[var67];
            if (var17 == 1) {
                this.field2175[var67] = var6.method64(31790);
            }
        }
        var2.field54 = var42;
        var3.field54 = var31;
        var4.field54 = var34;
        var5.field54 = var37;
        var6.field54 = var35;
        var7.field54 = var40;
        var8.field54 = var39;
        for (int var68 = 0; var68 < var10; ++var68) {
            this.field2141[var68] = (short) var2.method46((byte) 65);
            if (var12 == 1) {
                this.field2143[var68] = var3.method73((byte) 29);
            }
            if (var13 == 255) {
                this.field2152[var68] = var4.method73((byte) 29);
            }
            if (var14 == 1) {
                this.field2148[var68] = var5.method73((byte) 29);
            }
            if (var15 == 1) {
                this.field2145[var68] = var6.method64(31790);
            }
            if (var16 == 1) {
                this.field2142[var68] = (short) (var7.method46((byte) 65) - 1);
            }
            if (this.field2180 != null) {
                if (this.field2142[var68] != -1) {
                    this.field2180[var68] = (byte) (var8.method64(31790) - 1);
                } else {
                    this.field2180[var68] = -1;
                }
            }
        }
        var2.field54 = var33;
        var3.field54 = var30;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        int var72 = 0;
        for (int var73 = 0; var73 < var10; ++var73) {
            int var77 = var3.method64(31790);
            if (var77 == 1) {
                var69 = var2.method35(true) + var72;
                var70 = var2.method35(true) + var69;
                var71 = var2.method35(true) + var70;
                var72 = var71;
                this.field2144[var73] = var69;
                this.field2140[var73] = var70;
                this.field2138[var73] = var71;
            }
            if (var77 == 2) {
                var70 = var71;
                var71 = var2.method35(true) + var72;
                var72 = var71;
                this.field2144[var73] = var69;
                this.field2140[var73] = var70;
                this.field2138[var73] = var71;
            }
            if (var77 == 3) {
                var69 = var71;
                var71 = var2.method35(true) + var72;
                var72 = var71;
                this.field2144[var73] = var69;
                this.field2140[var73] = var70;
                this.field2138[var73] = var71;
            }
            if (var77 == 4) {
                int var80 = var69;
                var69 = var70;
                var70 = var80;
                var71 = var2.method35(true) + var72;
                var72 = var71;
                this.field2144[var73] = var69;
                this.field2140[var73] = var80;
                this.field2138[var73] = var71;
            }
        }
        var2.field54 = var50;
        var3.field54 = var52;
        var4.field54 = var54;
        var5.field54 = var56;
        var6.field54 = var58;
        var7.field54 = var60;
        for (int var74 = 0; var74 < var11; ++var74) {
            int var76 = this.field2171[var74] & 255;
            if (var76 == 0) {
                this.field2147[var74] = (short) var2.method46((byte) 65);
                this.field2160[var74] = (short) var2.method46((byte) 65);
                this.field2179[var74] = (short) var2.method46((byte) 65);
            }
            if (var76 == 1) {
                this.field2147[var74] = (short) var3.method46((byte) 65);
                this.field2160[var74] = (short) var3.method46((byte) 65);
                this.field2179[var74] = (short) var3.method46((byte) 65);
                this.field2137[var74] = (short) var4.method46((byte) 65);
                this.field2159[var74] = (short) var4.method46((byte) 65);
                this.field2174[var74] = (short) var4.method46((byte) 65);
                this.field2165[var74] = var5.method73((byte) 29);
                this.field2151[var74] = var6.method73((byte) 29);
                this.field2157[var74] = var7.method73((byte) 29);
            }
            if (var76 == 2) {
                this.field2147[var74] = (short) var3.method46((byte) 65);
                this.field2160[var74] = (short) var3.method46((byte) 65);
                this.field2179[var74] = (short) var3.method46((byte) 65);
                this.field2137[var74] = (short) var4.method46((byte) 65);
                this.field2159[var74] = (short) var4.method46((byte) 65);
                this.field2174[var74] = (short) var4.method46((byte) 65);
                this.field2165[var74] = var5.method73((byte) 29);
                this.field2151[var74] = var6.method73((byte) 29);
                this.field2157[var74] = var7.method73((byte) 29);
                this.field2173[var74] = var7.method73((byte) 29);
                this.field2154[var74] = var7.method73((byte) 29);
            }
            if (var76 == 3) {
                this.field2147[var74] = (short) var3.method46((byte) 65);
                this.field2160[var74] = (short) var3.method46((byte) 65);
                this.field2179[var74] = (short) var3.method46((byte) 65);
                this.field2137[var74] = (short) var4.method46((byte) 65);
                this.field2159[var74] = (short) var4.method46((byte) 65);
                this.field2174[var74] = (short) var4.method46((byte) 65);
                this.field2165[var74] = var5.method73((byte) 29);
                this.field2151[var74] = var6.method73((byte) 29);
                this.field2157[var74] = var7.method73((byte) 29);
            }
        }
        var2.field54 = var62;
        int var75 = var2.method64(31790);
        if (var75 != 0) {
            new class23();
            var2.method46((byte) 65);
            var2.method46((byte) 65);
            var2.method46((byte) 65);
            var2.method56(-1);
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()V")
    public final void method788() {
        for (int var1 = 0; var1 < this.field2172; ++var1) {
            int var2 = this.field2144[var1];
            this.field2144[var1] = this.field2138[var1];
            this.field2138[var1] = var2;
        }
        this.method783();
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
    public final void method789() {
        if (this.field2156 == null) {
            this.field2156 = new class43[this.field2134];
            for (int var1 = 0; var1 < this.field2134; ++var1) {
                this.field2156[var1] = new class43();
            }
            for (int var2 = 0; var2 < this.field2172; ++var2) {
                int var3 = this.field2144[var2];
                int var4 = this.field2140[var2];
                int var5 = this.field2138[var2];
                int var6 = this.field2170[var4] - this.field2170[var3];
                int var7 = this.field2166[var4] - this.field2166[var3];
                int var8 = this.field2169[var4] - this.field2169[var3];
                int var9 = this.field2170[var5] - this.field2170[var3];
                int var10 = this.field2166[var5] - this.field2166[var3];
                int var11 = this.field2169[var5] - this.field2169[var3];
                int var12 = var7 * var11 - var8 * var10;
                int var13 = var8 * var9 - var6 * var11;
                int var14;
                for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 1) {
                    var12 >>= 1;
                    var13 >>= 1;
                }
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
                if (var15 <= 0) {
                    var15 = 1;
                }
                int var16 = var12 * 256 / var15;
                int var17 = var13 * 256 / var15;
                int var18 = var14 * 256 / var15;
                byte var19;
                if (this.field2143 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field2143[var2];
                }
                if (var19 == 0) {
                    class43 var20 = this.field2156[var3];
                    var20.field1048 += var16;
                    var20.field1037 += var17;
                    var20.field1041 += var18;
                    ++var20.field1047;
                    class43 var21 = this.field2156[var4];
                    var21.field1048 += var16;
                    var21.field1037 += var17;
                    var21.field1041 += var18;
                    ++var21.field1047;
                    class43 var22 = this.field2156[var5];
                    var22.field1048 += var16;
                    var22.field1037 += var17;
                    var22.field1041 += var18;
                    ++var22.field1047;
                } else if (var19 == 1) {
                    if (this.field2176 == null) {
                        this.field2176 = new class68[this.field2172];
                    }
                    class68 var23 = this.field2176[var2] = new class68();
                    var23.field1709 = var16;
                    var23.field1715 = var17;
                    var23.field1712 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
    public final void method790() {
        int var10002;
        if (this.field2175 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2134; ++var3) {
                int var7 = this.field2175[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field2177 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field2177[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field2134) {
                int var6 = this.field2175[var5];
                this.field2177[var6][var1[var6]++] = var5++;
            }
            this.field2175 = null;
        }
        if (this.field2145 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field2172; ++var10) {
                int var14 = this.field2145[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field2161 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field2161[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field2172) {
                int var13 = this.field2145[var12];
                this.field2161[var13][var8[var13]++] = var12++;
            }
            this.field2145 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(SS)V")
    public final void method791(short arg0, short arg1) {
        if (this.field2142 != null) {
            for (int var3 = 0; var3 < this.field2172; ++var3) {
                if (this.field2142[var3] == arg0) {
                    this.field2142[var3] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "()V")
    private final void method792() {
        if (!this.field2181) {
            this.field2181 = true;
            int var1 = 32767;
            int var2 = 32767;
            int var3 = 32767;
            int var4 = -32768;
            int var5 = -32768;
            int var6 = -32768;
            for (int var7 = 0; var7 < this.field2134; ++var7) {
                int var8 = this.field2170[var7];
                int var9 = this.field2166[var7];
                int var10 = this.field2169[var7];
                if (var8 < var1) {
                    var1 = var8;
                }
                if (var8 > var4) {
                    var4 = var8;
                }
                if (var9 < var2) {
                    var2 = var9;
                }
                if (var9 > var5) {
                    var5 = var9;
                }
                if (var10 < var3) {
                    var3 = var10;
                }
                if (var10 > var6) {
                    var6 = var10;
                }
            }
            this.field2150 = (short) var1;
            this.field2149 = (short) var4;
            super.field728 = (short) var2;
            this.field2168 = (short) var5;
            this.field2158 = (short) var3;
            this.field2146 = (short) var6;
        }
    }

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "()V")
    public final void method793() {
        for (int var1 = 0; var1 < this.field2134; ++var1) {
            this.field2170[var1] = -this.field2170[var1];
            this.field2169[var1] = -this.field2169[var1];
        }
        this.method783();
    }

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "()Lka;")
    public final class92 method794() {
        class92 var1 = new class92();
        if (this.field2143 != null) {
            var1.field2143 = new byte[this.field2172];
            for (int var2 = 0; var2 < this.field2172; ++var2) {
                var1.field2143[var2] = this.field2143[var2];
            }
        }
        var1.field2134 = this.field2134;
        var1.field2172 = this.field2172;
        var1.field2135 = this.field2135;
        var1.field2170 = this.field2170;
        var1.field2166 = this.field2166;
        var1.field2169 = this.field2169;
        var1.field2144 = this.field2144;
        var1.field2140 = this.field2140;
        var1.field2138 = this.field2138;
        var1.field2152 = this.field2152;
        var1.field2148 = this.field2148;
        var1.field2180 = this.field2180;
        var1.field2141 = this.field2141;
        var1.field2142 = this.field2142;
        var1.field2167 = this.field2167;
        var1.field2171 = this.field2171;
        var1.field2147 = this.field2147;
        var1.field2160 = this.field2160;
        var1.field2179 = this.field2179;
        var1.field2137 = this.field2137;
        var1.field2159 = this.field2159;
        var1.field2174 = this.field2174;
        var1.field2165 = this.field2165;
        var1.field2151 = this.field2151;
        var1.field2157 = this.field2157;
        var1.field2173 = this.field2173;
        var1.field2154 = this.field2154;
        var1.field2175 = this.field2175;
        var1.field2145 = this.field2145;
        var1.field2177 = this.field2177;
        var1.field2161 = this.field2161;
        var1.field2156 = this.field2156;
        var1.field2176 = this.field2176;
        var1.field2178 = this.field2178;
        var1.field2164 = this.field2164;
        return var1;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lka;I)I")
    private final int method795(class92 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2170[arg1];
        int var5 = arg0.field2166[arg1];
        int var6 = arg0.field2169[arg1];
        for (int var7 = 0; var7 < this.field2134; ++var7) {
            if (this.field2170[var7] == var4 && this.field2166[var7] == var5 && this.field2169[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2170[this.field2134] = var4;
            this.field2166[this.field2134] = var5;
            this.field2169[this.field2134] = var6;
            if (arg0.field2175 != null) {
                this.field2175[this.field2134] = arg0.field2175[arg1];
            }
            var3 = this.field2134++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "()V")
    public final void method796() {
        for (int var1 = 0; var1 < this.field2134; ++var1) {
            int var2 = this.field2169[var1];
            this.field2169[var1] = this.field2170[var1];
            this.field2170[var1] = -var2;
        }
        this.method783();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lka;Lka;IIIZ)V")
    public static final void method797(class92 arg0, class92 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method792();
        arg0.method789();
        arg1.method792();
        arg1.method789();
        ++field2136;
        int var6 = 0;
        int[] var7 = arg1.field2170;
        int var8 = arg1.field2134;
        for (int var9 = 0; var9 < arg0.field2134; ++var9) {
            class43 var12 = arg0.field2156[var9];
            if (var12.field1047 != 0) {
                int var13 = arg0.field2166[var9] - arg3;
                if (var13 >= arg1.field728 && var13 <= arg1.field2168) {
                    int var14 = arg0.field2170[var9] - arg2;
                    if (var14 >= arg1.field2150 && var14 <= arg1.field2149) {
                        int var15 = arg0.field2169[var9] - arg4;
                        if (var15 >= arg1.field2158 && var15 <= arg1.field2146) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class43 var17 = arg1.field2156[var16];
                                if (var7[var16] == var14 && arg1.field2169[var16] == var15 && arg1.field2166[var16] == var13 && var17.field1047 != 0) {
                                    if (arg0.field2153 == null) {
                                        arg0.field2153 = new class43[arg0.field2134];
                                    }
                                    if (arg1.field2153 == null) {
                                        arg1.field2153 = new class43[var8];
                                    }
                                    class43 var18 = arg0.field2153[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field2153[var9] = new class43(var12);
                                    }
                                    class43 var19 = arg1.field2153[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field2153[var16] = new class43(var17);
                                    }
                                    var18.field1048 += var17.field1048;
                                    var18.field1037 += var17.field1037;
                                    var18.field1041 += var17.field1041;
                                    var18.field1047 += var17.field1047;
                                    var19.field1048 += var12.field1048;
                                    var19.field1037 += var12.field1037;
                                    var19.field1041 += var12.field1041;
                                    var19.field1047 += var12.field1047;
                                    ++var6;
                                    field2139[var9] = field2136;
                                    field2163[var16] = field2136;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field2172; ++var10) {
                if (field2139[arg0.field2144[var10]] == field2136 && field2139[arg0.field2140[var10]] == field2136 && field2139[arg0.field2138[var10]] == field2136) {
                    if (arg0.field2143 == null) {
                        arg0.field2143 = new byte[arg0.field2172];
                    }
                    arg0.field2143[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field2172; ++var11) {
                if (field2163[arg1.field2144[var11]] == field2136 && field2163[arg1.field2140[var11]] == field2136 && field2163[arg1.field2138[var11]] == field2136) {
                    if (arg1.field2143 == null) {
                        arg1.field2143 = new byte[arg1.field2172];
                    }
                    arg1.field2143[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIZZ)Ldf;")
    public final class36 method798(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        return new class66(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "()V")
    public static void method799() {
        field2139 = null;
        field2163 = null;
        field2162 = null;
        field2155 = null;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(IIIII)Lha;")
    public final class66 method800(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class66(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)V")
    public final void method801(int arg0) {
        int var2 = field2162[arg0];
        int var3 = field2155[arg0];
        for (int var4 = 0; var4 < this.field2134; ++var4) {
            int var5 = this.field2170[var4] * var3 + this.field2169[var4] * var2 >> 16;
            this.field2169[var4] = this.field2169[var4] * var3 - this.field2170[var4] * var2 >> 16;
            this.field2170[var4] = var5;
        }
        this.method783();
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(III)V")
    public final void method802(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2134; ++var4) {
            this.field2170[var4] += arg0;
            this.field2166[var4] += arg1;
            this.field2169[var4] += arg2;
        }
        this.method783();
    }

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "()V")
    public final void method803() {
        for (int var1 = 0; var1 < this.field2134; ++var1) {
            int var2 = this.field2170[var1];
            this.field2170[var1] = this.field2169[var1];
            this.field2169[var1] = -var2;
        }
        this.method783();
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
    private class92() {
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "([B)V")
    private class92(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method787(arg0);
        } else {
            this.method786(arg0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "([Lka;I)V")
    public class92(class92[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2134 = 0;
        this.field2172 = 0;
        this.field2135 = 0;
        this.field2167 = -1;
        for (int var9 = 0; var9 < arg1; ++var9) {
            class92 var15 = arg0[var9];
            if (var15 != null) {
                this.field2134 += var15.field2134;
                this.field2172 += var15.field2172;
                this.field2135 += var15.field2135;
                if (var15.field2152 != null) {
                    var4 = true;
                } else {
                    if (this.field2167 == -1) {
                        this.field2167 = var15.field2167;
                    }
                    if (this.field2167 != var15.field2167) {
                        var4 = true;
                    }
                }
                var3 |= var15.field2143 != null;
                var5 |= var15.field2148 != null;
                var6 |= var15.field2145 != null;
                var7 |= var15.field2142 != null;
                var8 |= var15.field2180 != null;
            }
        }
        this.field2170 = new int[this.field2134];
        this.field2166 = new int[this.field2134];
        this.field2169 = new int[this.field2134];
        this.field2175 = new int[this.field2134];
        this.field2144 = new int[this.field2172];
        this.field2140 = new int[this.field2172];
        this.field2138 = new int[this.field2172];
        if (var3) {
            this.field2143 = new byte[this.field2172];
        }
        if (var4) {
            this.field2152 = new byte[this.field2172];
        }
        if (var5) {
            this.field2148 = new byte[this.field2172];
        }
        if (var6) {
            this.field2145 = new int[this.field2172];
        }
        if (var7) {
            this.field2142 = new short[this.field2172];
        }
        if (var8) {
            this.field2180 = new byte[this.field2172];
        }
        this.field2141 = new short[this.field2172];
        if (this.field2135 > 0) {
            this.field2171 = new byte[this.field2135];
            this.field2147 = new short[this.field2135];
            this.field2160 = new short[this.field2135];
            this.field2179 = new short[this.field2135];
            this.field2137 = new short[this.field2135];
            this.field2159 = new short[this.field2135];
            this.field2174 = new short[this.field2135];
            this.field2165 = new byte[this.field2135];
            this.field2151 = new byte[this.field2135];
            this.field2157 = new byte[this.field2135];
            this.field2173 = new byte[this.field2135];
            this.field2154 = new byte[this.field2135];
        }
        this.field2134 = 0;
        this.field2172 = 0;
        this.field2135 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class92 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field2172; ++var12) {
                    if (var3 && var11.field2143 != null) {
                        this.field2143[this.field2172] = var11.field2143[var12];
                    }
                    if (var4) {
                        if (var11.field2152 != null) {
                            this.field2152[this.field2172] = var11.field2152[var12];
                        } else {
                            this.field2152[this.field2172] = var11.field2167;
                        }
                    }
                    if (var5 && var11.field2148 != null) {
                        this.field2148[this.field2172] = var11.field2148[var12];
                    }
                    if (var6 && var11.field2145 != null) {
                        this.field2145[this.field2172] = var11.field2145[var12];
                    }
                    if (var7) {
                        if (var11.field2142 != null) {
                            this.field2142[this.field2172] = var11.field2142[var12];
                        } else {
                            this.field2142[this.field2172] = -1;
                        }
                    }
                    if (var8) {
                        if (var11.field2180 != null && var11.field2180[var12] != -1) {
                            this.field2180[this.field2172] = (byte) (var11.field2180[var12] + this.field2135);
                        } else {
                            this.field2180[this.field2172] = -1;
                        }
                    }
                    this.field2141[this.field2172] = var11.field2141[var12];
                    this.field2144[this.field2172] = this.method795(var11, var11.field2144[var12]);
                    this.field2140[this.field2172] = this.method795(var11, var11.field2140[var12]);
                    this.field2138[this.field2172] = this.method795(var11, var11.field2138[var12]);
                    ++this.field2172;
                }
                for (int var13 = 0; var13 < var11.field2135; ++var13) {
                    byte var14 = this.field2171[this.field2135] = var11.field2171[var13];
                    if (var14 == 0) {
                        this.field2147[this.field2135] = (short) this.method795(var11, var11.field2147[var13]);
                        this.field2160[this.field2135] = (short) this.method795(var11, var11.field2160[var13]);
                        this.field2179[this.field2135] = (short) this.method795(var11, var11.field2179[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field2147[this.field2135] = var11.field2147[var13];
                        this.field2160[this.field2135] = var11.field2160[var13];
                        this.field2179[this.field2135] = var11.field2179[var13];
                        this.field2137[this.field2135] = var11.field2137[var13];
                        this.field2159[this.field2135] = var11.field2159[var13];
                        this.field2174[this.field2135] = var11.field2174[var13];
                        this.field2165[this.field2135] = var11.field2165[var13];
                        this.field2151[this.field2135] = var11.field2151[var13];
                        this.field2157[this.field2135] = var11.field2157[var13];
                    }
                    if (var14 == 2) {
                        this.field2173[this.field2135] = var11.field2173[var13];
                        this.field2154[this.field2135] = var11.field2154[var13];
                    }
                    ++this.field2135;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lka;ZZZZ)V")
    public class92(class92 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2134 = arg0.field2134;
        this.field2172 = arg0.field2172;
        this.field2135 = arg0.field2135;
        if (arg1) {
            this.field2170 = arg0.field2170;
            this.field2166 = arg0.field2166;
            this.field2169 = arg0.field2169;
        } else {
            this.field2170 = new int[this.field2134];
            this.field2166 = new int[this.field2134];
            this.field2169 = new int[this.field2134];
            for (int var6 = 0; var6 < this.field2134; ++var6) {
                this.field2170[var6] = arg0.field2170[var6];
                this.field2166[var6] = arg0.field2166[var6];
                this.field2169[var6] = arg0.field2169[var6];
            }
        }
        if (arg2) {
            this.field2141 = arg0.field2141;
        } else {
            this.field2141 = new short[this.field2172];
            for (int var7 = 0; var7 < this.field2172; ++var7) {
                this.field2141[var7] = arg0.field2141[var7];
            }
        }
        if (!arg3 && arg0.field2142 != null) {
            this.field2142 = new short[this.field2172];
            for (int var8 = 0; var8 < this.field2172; ++var8) {
                this.field2142[var8] = arg0.field2142[var8];
            }
        } else {
            this.field2142 = arg0.field2142;
        }
        if (arg4) {
            this.field2148 = arg0.field2148;
        } else {
            this.field2148 = new byte[this.field2172];
            if (arg0.field2148 == null) {
                for (int var9 = 0; var9 < this.field2172; ++var9) {
                    this.field2148[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2172; ++var10) {
                    this.field2148[var10] = arg0.field2148[var10];
                }
            }
        }
        this.field2144 = arg0.field2144;
        this.field2140 = arg0.field2140;
        this.field2138 = arg0.field2138;
        this.field2143 = arg0.field2143;
        this.field2152 = arg0.field2152;
        this.field2180 = arg0.field2180;
        this.field2167 = arg0.field2167;
        this.field2171 = arg0.field2171;
        this.field2147 = arg0.field2147;
        this.field2160 = arg0.field2160;
        this.field2179 = arg0.field2179;
        this.field2137 = arg0.field2137;
        this.field2159 = arg0.field2159;
        this.field2174 = arg0.field2174;
        this.field2165 = arg0.field2165;
        this.field2151 = arg0.field2151;
        this.field2157 = arg0.field2157;
        this.field2173 = arg0.field2173;
        this.field2154 = arg0.field2154;
        this.field2175 = arg0.field2175;
        this.field2145 = arg0.field2145;
        this.field2177 = arg0.field2177;
        this.field2161 = arg0.field2161;
        this.field2156 = arg0.field2156;
        this.field2176 = arg0.field2176;
        this.field2153 = arg0.field2153;
        this.field2178 = arg0.field2178;
        this.field2164 = arg0.field2164;
    }
}
