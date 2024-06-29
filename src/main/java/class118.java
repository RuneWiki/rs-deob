import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class118 extends class20 {

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    public int field2202 = 0;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "I")
    public int field2232 = 0;

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "Z")
    private boolean field2239 = false;

    @OriginalMember(owner = "client!ne", name = "ib", descriptor = "B")
    public byte field2246 = 0;

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "[I")
    public int[] field2234;

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "[I")
    public int[] field2230;

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "[I")
    public int[] field2223;

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "[I")
    private int[] field2238;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "[I")
    public int[] field2203;

    @OriginalMember(owner = "client!ne", name = "fb", descriptor = "[I")
    public int[] field2243;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "[I")
    public int[] field2220;

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "[B")
    public byte[] field2233;

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "[B")
    public byte[] field2237;

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "[B")
    public byte[] field2236;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "[S")
    public short[] field2219;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "[S")
    public short[] field2222;

    @OriginalMember(owner = "client!ne", name = "lb", descriptor = "[B")
    public byte[] field2249;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "[I")
    private int[] field2228;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "[B")
    public byte[] field2218;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "[S")
    public short[] field2211;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "[S")
    public short[] field2209;

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "[S")
    public short[] field2214;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "[S")
    private short[] field2229;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "[S")
    private short[] field2213;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "[S")
    private short[] field2224;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "[B")
    private byte[] field2204;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "[B")
    private byte[] field2212;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "[B")
    private byte[] field2217;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "[B")
    private byte[] field2221;

    @OriginalMember(owner = "client!ne", name = "eb", descriptor = "[B")
    private byte[] field2242;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
    public int field2216;

    @OriginalMember(owner = "client!ne", name = "gb", descriptor = "[[I")
    public int[][] field2244;

    @OriginalMember(owner = "client!ne", name = "db", descriptor = "[[I")
    public int[][] field2241;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "[Lsh;")
    public class225[] field2208;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "[Lsc;")
    public class263[] field2205;

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "[Lsh;")
    public class225[] field2235;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "S")
    public short field2225;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "S")
    public short field2231;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "[I")
    private static int[] field2201 = class123.field2326;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "[I")
    private static int[] field2210 = new int[10000];

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
    private static int field2215 = 0;

    @OriginalMember(owner = "client!ne", name = "hb", descriptor = "[I")
    private static int[] field2245 = new int[10000];

    @OriginalMember(owner = "client!ne", name = "kb", descriptor = "[I")
    private static int[] field2248 = class123.field2314;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "S")
    private short field2206;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "S")
    private short field2207;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "S")
    private short field2226;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "S")
    private short field2227;

    @OriginalMember(owner = "client!ne", name = "cb", descriptor = "S")
    private short field2240;

    @OriginalMember(owner = "client!ne", name = "jb", descriptor = "S")
    private short field2247;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V")
    public final void method781(int arg0) {
        int var2 = field2248[arg0];
        int var3 = field2201[arg0];
        for (int var4 = 0; var4 < this.field2202; var4++) {
            int var5 = this.field2234[var4] * var3 + this.field2223[var4] * var2 >> 16;
            this.field2223[var4] = this.field2223[var4] * var3 - this.field2234[var4] * var2 >> 16;
            this.field2234[var4] = var5;
        }
        this.method796();
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([B)V")
    private final void method782(byte[] arg0) {
        class249 var2 = new class249(arg0);
        class249 var3 = new class249(arg0);
        class249 var4 = new class249(arg0);
        class249 var5 = new class249(arg0);
        class249 var6 = new class249(arg0);
        class249 var7 = new class249(arg0);
        class249 var8 = new class249(arg0);
        var2.field4335 = arg0.length - 23;
        int var9 = var2.method1674(1355769544);
        int var10 = var2.method1674(1355769544);
        int var11 = var2.method1677(-6677);
        int var12 = var2.method1677(-6677);
        int var13 = var2.method1677(-6677);
        int var14 = var2.method1677(-6677);
        int var15 = var2.method1677(-6677);
        int var16 = var2.method1677(-6677);
        int var17 = var2.method1677(-6677);
        int var18 = var2.method1674(1355769544);
        int var19 = var2.method1674(1355769544);
        int var20 = var2.method1674(1355769544);
        int var21 = var2.method1674(1355769544);
        int var22 = var2.method1674(1355769544);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2218 = new byte[var11];
            var2.field4335 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2218[var26] = var2.method1682(3390);
                if (var27 == 0) {
                    var23++;
                }
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
                if (var27 == 2) {
                    var25++;
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
        this.field2202 = var9;
        this.field2232 = var10;
        this.field2216 = var11;
        this.field2234 = new int[var9];
        this.field2230 = new int[var9];
        this.field2223 = new int[var9];
        this.field2203 = new int[var10];
        this.field2243 = new int[var10];
        this.field2220 = new int[var10];
        if (var17 == 1) {
            this.field2238 = new int[var9];
        }
        if (var12 == 1) {
            this.field2233 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2237 = new byte[var10];
        } else {
            this.field2246 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2236 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2228 = new int[var10];
        }
        if (var16 == 1) {
            this.field2222 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2249 = new byte[var10];
        }
        this.field2219 = new short[var10];
        if (var11 > 0) {
            this.field2211 = new short[var11];
            this.field2209 = new short[var11];
            this.field2214 = new short[var11];
            if (var24 > 0) {
                this.field2229 = new short[var24];
                this.field2213 = new short[var24];
                this.field2224 = new short[var24];
                this.field2204 = new byte[var24];
                this.field2212 = new byte[var24];
                this.field2217 = new byte[var24];
            }
            if (var25 > 0) {
                this.field2221 = new byte[var25];
                this.field2242 = new byte[var25];
            }
        }
        var2.field4335 = var11;
        var3.field4335 = var44;
        var4.field4335 = var46;
        var5.field4335 = var48;
        var6.field4335 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var79 = var2.method1677(-6677);
            int var80 = 0;
            if ((var79 & 0x1) != 0) {
                var80 = var3.method1687(32767);
            }
            int var81 = 0;
            if ((var79 & 0x2) != 0) {
                var81 = var4.method1687(32767);
            }
            int var82 = 0;
            if ((var79 & 0x4) != 0) {
                var82 = var5.method1687(32767);
            }
            this.field2234[var66] = var63 + var80;
            this.field2230[var66] = var64 + var81;
            this.field2223[var66] = var65 + var82;
            var63 = this.field2234[var66];
            var64 = this.field2230[var66];
            var65 = this.field2223[var66];
            if (var17 == 1) {
                this.field2238[var66] = var6.method1677(-6677);
            }
        }
        var2.field4335 = var42;
        var3.field4335 = var31;
        var4.field4335 = var34;
        var5.field4335 = var37;
        var6.field4335 = var35;
        var7.field4335 = var40;
        var8.field4335 = var39;
        for (int var67 = 0; var67 < var10; var67++) {
            this.field2219[var67] = (short) var2.method1674(1355769544);
            if (var12 == 1) {
                this.field2233[var67] = var3.method1682(3390);
            }
            if (var13 == 255) {
                this.field2237[var67] = var4.method1682(3390);
            }
            if (var14 == 1) {
                this.field2236[var67] = var5.method1682(3390);
            }
            if (var15 == 1) {
                this.field2228[var67] = var6.method1677(-6677);
            }
            if (var16 == 1) {
                this.field2222[var67] = (short) (var7.method1674(1355769544) - 1);
            }
            if (this.field2249 != null) {
                if (this.field2222[var67] == -1) {
                    this.field2249[var67] = -1;
                } else {
                    this.field2249[var67] = (byte) (var8.method1677(-6677) - 1);
                }
            }
        }
        var2.field4335 = var33;
        var3.field4335 = var30;
        int var68 = 0;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        for (int var72 = 0; var72 < var10; var72++) {
            int var75 = var3.method1677(-6677);
            if (var75 == 1) {
                var68 = var2.method1687(32767) + var71;
                var69 = var2.method1687(32767) + var68;
                var70 = var2.method1687(32767) + var69;
                var71 = var70;
                this.field2203[var72] = var68;
                this.field2243[var72] = var69;
                this.field2220[var72] = var70;
            }
            if (var75 == 2) {
                var69 = var70;
                var70 = var2.method1687(32767) + var71;
                var71 = var70;
                this.field2203[var72] = var68;
                this.field2243[var72] = var69;
                this.field2220[var72] = var70;
            }
            if (var75 == 3) {
                var68 = var70;
                var70 = var2.method1687(32767) + var71;
                var71 = var70;
                this.field2203[var72] = var68;
                this.field2243[var72] = var69;
                this.field2220[var72] = var70;
            }
            if (var75 == 4) {
                int var78 = var68;
                var68 = var69;
                var69 = var78;
                var70 = var2.method1687(32767) + var71;
                var71 = var70;
                this.field2203[var72] = var68;
                this.field2243[var72] = var78;
                this.field2220[var72] = var70;
            }
        }
        var2.field4335 = var50;
        var3.field4335 = var52;
        var4.field4335 = var54;
        var5.field4335 = var56;
        var6.field4335 = var58;
        var7.field4335 = var60;
        for (int var73 = 0; var73 < var11; var73++) {
            int var74 = this.field2218[var73] & 0xFF;
            if (var74 == 0) {
                this.field2211[var73] = (short) var2.method1674(1355769544);
                this.field2209[var73] = (short) var2.method1674(1355769544);
                this.field2214[var73] = (short) var2.method1674(1355769544);
            }
            if (var74 == 1) {
                this.field2211[var73] = (short) var3.method1674(1355769544);
                this.field2209[var73] = (short) var3.method1674(1355769544);
                this.field2214[var73] = (short) var3.method1674(1355769544);
                this.field2229[var73] = (short) var4.method1674(1355769544);
                this.field2213[var73] = (short) var4.method1674(1355769544);
                this.field2224[var73] = (short) var4.method1674(1355769544);
                this.field2204[var73] = var5.method1682(3390);
                this.field2212[var73] = var6.method1682(3390);
                this.field2217[var73] = var7.method1682(3390);
            }
            if (var74 == 2) {
                this.field2211[var73] = (short) var3.method1674(1355769544);
                this.field2209[var73] = (short) var3.method1674(1355769544);
                this.field2214[var73] = (short) var3.method1674(1355769544);
                this.field2229[var73] = (short) var4.method1674(1355769544);
                this.field2213[var73] = (short) var4.method1674(1355769544);
                this.field2224[var73] = (short) var4.method1674(1355769544);
                this.field2204[var73] = var5.method1682(3390);
                this.field2212[var73] = var6.method1682(3390);
                this.field2217[var73] = var7.method1682(3390);
                this.field2221[var73] = var7.method1682(3390);
                this.field2242[var73] = var7.method1682(3390);
            }
            if (var74 == 3) {
                this.field2211[var73] = (short) var3.method1674(1355769544);
                this.field2209[var73] = (short) var3.method1674(1355769544);
                this.field2214[var73] = (short) var3.method1674(1355769544);
                this.field2229[var73] = (short) var4.method1674(1355769544);
                this.field2213[var73] = (short) var4.method1674(1355769544);
                this.field2224[var73] = (short) var4.method1674(1355769544);
                this.field2204[var73] = var5.method1682(3390);
                this.field2212[var73] = var6.method1682(3390);
                this.field2217[var73] = var7.method1682(3390);
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "()Lne;")
    public final class118 method783() {
        class118 var1 = new class118();
        if (this.field2233 != null) {
            var1.field2233 = new byte[this.field2232];
            for (int var2 = 0; var2 < this.field2232; var2++) {
                var1.field2233[var2] = this.field2233[var2];
            }
        }
        var1.field2202 = this.field2202;
        var1.field2232 = this.field2232;
        var1.field2216 = this.field2216;
        var1.field2234 = this.field2234;
        var1.field2230 = this.field2230;
        var1.field2223 = this.field2223;
        var1.field2203 = this.field2203;
        var1.field2243 = this.field2243;
        var1.field2220 = this.field2220;
        var1.field2237 = this.field2237;
        var1.field2236 = this.field2236;
        var1.field2249 = this.field2249;
        var1.field2219 = this.field2219;
        var1.field2222 = this.field2222;
        var1.field2246 = this.field2246;
        var1.field2218 = this.field2218;
        var1.field2211 = this.field2211;
        var1.field2209 = this.field2209;
        var1.field2214 = this.field2214;
        var1.field2229 = this.field2229;
        var1.field2213 = this.field2213;
        var1.field2224 = this.field2224;
        var1.field2204 = this.field2204;
        var1.field2212 = this.field2212;
        var1.field2217 = this.field2217;
        var1.field2221 = this.field2221;
        var1.field2242 = this.field2242;
        var1.field2238 = this.field2238;
        var1.field2228 = this.field2228;
        var1.field2244 = this.field2244;
        var1.field2241 = this.field2241;
        var1.field2208 = this.field2208;
        var1.field2205 = this.field2205;
        var1.field2225 = this.field2225;
        var1.field2231 = this.field2231;
        return var1;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(SS)V")
    public final void method784(short arg0, short arg1) {
        if (this.field2222 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2232; var3++) {
            if (this.field2222[var3] == arg0) {
                this.field2222[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II[[I[[IIIIZZ)Lne;")
    public final class118 method785(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method795();
        int var10 = this.field2247 + arg4;
        int var11 = this.field2206 + arg4;
        int var12 = this.field2207 + arg6;
        int var13 = this.field2240 + arg6;
        if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length)) {
            return this;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return this;
            }
            if (var10 < 0 || var11 + 128 >> 7 >= arg3.length || var12 < 0 || var13 + 128 >> 7 >= arg3[0].length) {
                return this;
            }
        } else {
            int var14 = var10 >> 7;
            int var15 = var11 + 127 >> 7;
            int var16 = var12 >> 7;
            int var17 = var13 + 127 >> 7;
            if (arg2[var14][var16] == arg5 && arg2[var15][var16] == arg5 && arg2[var14][var17] == arg5 && arg2[var15][var17] == arg5) {
                return this;
            }
        }
        class118 var18;
        if (arg7) {
            var18 = new class118();
            var18.field2202 = this.field2202;
            var18.field2232 = this.field2232;
            var18.field2216 = this.field2216;
            var18.field2203 = this.field2203;
            var18.field2243 = this.field2243;
            var18.field2220 = this.field2220;
            var18.field2233 = this.field2233;
            var18.field2237 = this.field2237;
            var18.field2236 = this.field2236;
            var18.field2249 = this.field2249;
            var18.field2219 = this.field2219;
            var18.field2222 = this.field2222;
            var18.field2246 = this.field2246;
            var18.field2218 = this.field2218;
            var18.field2211 = this.field2211;
            var18.field2209 = this.field2209;
            var18.field2214 = this.field2214;
            var18.field2229 = this.field2229;
            var18.field2213 = this.field2213;
            var18.field2224 = this.field2224;
            var18.field2204 = this.field2204;
            var18.field2212 = this.field2212;
            var18.field2217 = this.field2217;
            var18.field2221 = this.field2221;
            var18.field2242 = this.field2242;
            var18.field2238 = this.field2238;
            var18.field2228 = this.field2228;
            var18.field2244 = this.field2244;
            var18.field2241 = this.field2241;
            var18.field2225 = this.field2225;
            var18.field2231 = this.field2231;
            var18.field2208 = this.field2208;
            var18.field2205 = this.field2205;
            var18.field2235 = this.field2235;
            if (arg0 == 3) {
                var18.field2234 = class61.method395(this.field2234, -105);
                var18.field2230 = class61.method395(this.field2230, -33);
                var18.field2223 = class61.method395(this.field2223, -98);
            } else {
                var18.field2234 = this.field2234;
                var18.field2230 = new int[var18.field2202];
                var18.field2223 = this.field2223;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field2202; var19++) {
                int var20 = this.field2234[var19] + arg4;
                int var21 = this.field2223[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field2230[var19] = this.field2230[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field2202; var29++) {
                int var30 = (this.field2230[var29] << 16) / this.field2227;
                if (var30 < arg1) {
                    int var31 = this.field2234[var29] + arg4;
                    int var32 = this.field2223[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field2230[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field2230[var29];
                } else {
                    var18.field2230[var29] = this.field2230[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method793(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field2226 - this.field2227;
            for (int var43 = 0; var43 < this.field2202; var43++) {
                int var44 = this.field2234[var43] + arg4;
                int var45 = this.field2223[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field2230[var43] = var52 + this.field2230[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field2226 - this.field2227;
            for (int var54 = 0; var54 < this.field2202; var54++) {
                int var55 = this.field2234[var54] + arg4;
                int var56 = this.field2223[var54] + arg6;
                int var57 = var55 & 0x7F;
                int var58 = var56 & 0x7F;
                int var59 = var55 >> 7;
                int var60 = var56 >> 7;
                int var61 = (128 - var57) * arg2[var59][var60] + arg2[var59 + 1][var60] * var57 >> 7;
                int var62 = (128 - var57) * arg2[var59][var60 + 1] + arg2[var59 + 1][var60 + 1] * var57 >> 7;
                int var63 = (128 - var58) * var61 + var58 * var62 >> 7;
                int var64 = (128 - var57) * arg3[var59][var60] + arg3[var59 + 1][var60] * var57 >> 7;
                int var65 = (128 - var57) * arg3[var59][var60 + 1] + arg3[var59 + 1][var60 + 1] * var57 >> 7;
                int var66 = (128 - var58) * var64 + var58 * var65 >> 7;
                int var67 = var63 - var66;
                var18.field2230[var54] = ((this.field2230[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method796();
        } else {
            this.field2239 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "()V")
    public final void method786() {
        int var10002;
        if (this.field2238 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2202; var3++) {
                int var7 = this.field2238[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field2244 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field2244[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field2202) {
                int var6 = this.field2238[var5];
                this.field2244[var6][var1[var6]++] = var5++;
            }
            this.field2238 = null;
        }
        if (this.field2228 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2232; var10++) {
            int var14 = this.field2228[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field2241 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field2241[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field2232) {
            int var13 = this.field2228[var12];
            this.field2241[var13][var8[var13]++] = var12++;
        }
        this.field2228 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(La;IIIZ)V")
    public final void method82(class20 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class118 var6 = (class118) arg0;
        var6.method795();
        var6.method794();
        field2215++;
        int var7 = 0;
        int[] var8 = var6.field2234;
        int var9 = var6.field2202;
        for (int var10 = 0; var10 < this.field2202; var10++) {
            class225 var13 = this.field2208[var10];
            if (var13.field3852 != 0) {
                int var14 = this.field2230[var10] - arg2;
                if (var14 >= var6.field2227 && var14 <= var6.field2226) {
                    int var15 = this.field2234[var10] - arg1;
                    if (var15 >= var6.field2247 && var15 <= var6.field2206) {
                        int var16 = this.field2223[var10] - arg3;
                        if (var16 >= var6.field2207 && var16 <= var6.field2240) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class225 var18 = var6.field2208[var17];
                                if (var8[var17] == var15 && var6.field2223[var17] == var16 && var6.field2230[var17] == var14 && var18.field3852 != 0) {
                                    if (this.field2235 == null) {
                                        this.field2235 = new class225[this.field2202];
                                    }
                                    if (var6.field2235 == null) {
                                        var6.field2235 = new class225[var9];
                                    }
                                    class225 var19 = this.field2235[var10];
                                    if (var19 == null) {
                                        var19 = this.field2235[var10] = new class225(var13);
                                    }
                                    class225 var20 = var6.field2235[var17];
                                    if (var20 == null) {
                                        var20 = var6.field2235[var17] = new class225(var18);
                                    }
                                    var19.field3858 += var18.field3858;
                                    var19.field3860 += var18.field3860;
                                    var19.field3849 += var18.field3849;
                                    var19.field3852 += var18.field3852;
                                    var20.field3858 += var13.field3858;
                                    var20.field3860 += var13.field3860;
                                    var20.field3849 += var13.field3849;
                                    var20.field3852 += var13.field3852;
                                    var7++;
                                    field2245[var10] = field2215;
                                    field2210[var17] = field2215;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg4) {
            return;
        }
        for (int var11 = 0; var11 < this.field2232; var11++) {
            if (field2245[this.field2203[var11]] == field2215 && field2245[this.field2243[var11]] == field2215 && field2245[this.field2220[var11]] == field2215) {
                if (this.field2233 == null) {
                    this.field2233 = new byte[this.field2232];
                }
                this.field2233[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field2232; var12++) {
            if (field2210[var6.field2203[var12]] == field2215 && field2210[var6.field2243[var12]] == field2215 && field2210[var6.field2220[var12]] == field2215) {
                if (var6.field2233 == null) {
                    var6.field2233 = new byte[var6.field2232];
                }
                var6.field2233[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lne;I)I")
    private final int method787(class118 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2234[arg1];
        int var5 = arg0.field2230[arg1];
        int var6 = arg0.field2223[arg1];
        for (int var7 = 0; var7 < this.field2202; var7++) {
            if (this.field2234[var7] == var4 && this.field2230[var7] == var5 && this.field2223[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2234[this.field2202] = var4;
            this.field2230[this.field2202] = var5;
            this.field2223[this.field2202] = var6;
            if (arg0.field2238 != null) {
                this.field2238[this.field2202] = arg0.field2238[arg1];
            }
            var3 = this.field2202++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "()V")
    public final void method788() {
        for (int var1 = 0; var1 < this.field2202; var1++) {
            this.field2223[var1] = -this.field2223[var1];
        }
        for (int var2 = 0; var2 < this.field2232; var2++) {
            int var3 = this.field2203[var2];
            this.field2203[var2] = this.field2220[var2];
            this.field2220[var2] = var3;
        }
        this.method796();
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lcj;II)Lne;")
    public static final class118 method789(class28 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method135(arg2, 0, arg1);
        return var3 == null ? null : new class118(var3);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "()V")
    public static void method790() {
        field2245 = null;
        field2210 = null;
        field2248 = null;
        field2201 = null;
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V")
    private final void method791(int arg0) {
        int var2 = field2248[arg0];
        int var3 = field2201[arg0];
        for (int var4 = 0; var4 < this.field2202; var4++) {
            int var5 = this.field2234[var4] * var3 + this.field2230[var4] * var2 >> 16;
            this.field2230[var4] = this.field2230[var4] * var3 - this.field2234[var4] * var2 >> 16;
            this.field2234[var4] = var5;
        }
        this.method796();
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(IIIII)Lqa;")
    public final class229 method792(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class229(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([[IIIIII)V")
    private final void method793(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method808(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method808(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method808(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method808(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method798(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method791(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method802(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "()V")
    public final void method794() {
        if (this.field2208 != null) {
            return;
        }
        this.field2208 = new class225[this.field2202];
        for (int var1 = 0; var1 < this.field2202; var1++) {
            this.field2208[var1] = new class225();
        }
        for (int var2 = 0; var2 < this.field2232; var2++) {
            int var3 = this.field2203[var2];
            int var4 = this.field2243[var2];
            int var5 = this.field2220[var2];
            int var6 = this.field2234[var4] - this.field2234[var3];
            int var7 = this.field2230[var4] - this.field2230[var3];
            int var8 = this.field2223[var4] - this.field2223[var3];
            int var9 = this.field2234[var5] - this.field2234[var3];
            int var10 = this.field2230[var5] - this.field2230[var3];
            int var11 = this.field2223[var5] - this.field2223[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field2233 == null) {
                var19 = 0;
            } else {
                var19 = this.field2233[var2];
            }
            if (var19 == 0) {
                class225 var20 = this.field2208[var3];
                var20.field3858 += var16;
                var20.field3860 += var17;
                var20.field3849 += var18;
                var20.field3852++;
                class225 var21 = this.field2208[var4];
                var21.field3858 += var16;
                var21.field3860 += var17;
                var21.field3849 += var18;
                var21.field3852++;
                class225 var22 = this.field2208[var5];
                var22.field3858 += var16;
                var22.field3860 += var17;
                var22.field3849 += var18;
                var22.field3852++;
            } else if (var19 == 1) {
                if (this.field2205 == null) {
                    this.field2205 = new class263[this.field2232];
                }
                class263 var23 = this.field2205[var2] = new class263();
                var23.field4615 = var16;
                var23.field4622 = var17;
                var23.field4616 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "()V")
    private final void method795() {
        if (this.field2239) {
            return;
        }
        this.field2239 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field2202; var7++) {
            int var8 = this.field2234[var7];
            int var9 = this.field2230[var7];
            int var10 = this.field2223[var7];
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
        this.field2247 = (short) var1;
        this.field2206 = (short) var4;
        this.field2227 = (short) var2;
        this.field2226 = (short) var5;
        this.field2207 = (short) var3;
        this.field2240 = (short) var6;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "()I")
    public final int method28() {
        if (!this.field2239) {
            this.method795();
        }
        return this.field2227;
    }

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "()V")
    private final void method796() {
        this.field2208 = null;
        this.field2235 = null;
        this.field2205 = null;
        this.field2239 = false;
    }

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "()V")
    public final void method797() {
        for (int var1 = 0; var1 < this.field2202; var1++) {
            this.field2234[var1] = -this.field2234[var1];
            this.field2223[var1] = -this.field2223[var1];
        }
        this.method796();
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)V")
    private final void method798(int arg0) {
        int var2 = field2248[arg0];
        int var3 = field2201[arg0];
        for (int var4 = 0; var4 < this.field2202; var4++) {
            int var5 = this.field2230[var4] * var3 - this.field2223[var4] * var2 >> 16;
            this.field2223[var4] = this.field2230[var4] * var2 + this.field2223[var4] * var3 >> 16;
            this.field2230[var4] = var5;
        }
        this.method796();
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(III)V")
    public final void method799(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field2248[arg2];
            int var5 = field2201[arg2];
            for (int var6 = 0; var6 < this.field2202; var6++) {
                int var7 = this.field2234[var6] * var5 + this.field2230[var6] * var4 >> 16;
                this.field2230[var6] = this.field2230[var6] * var5 - this.field2234[var6] * var4 >> 16;
                this.field2234[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field2248[arg0];
            int var9 = field2201[arg0];
            for (int var10 = 0; var10 < this.field2202; var10++) {
                int var11 = this.field2230[var10] * var9 - this.field2223[var10] * var8 >> 16;
                this.field2223[var10] = this.field2230[var10] * var8 + this.field2223[var10] * var9 >> 16;
                this.field2230[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field2248[arg1];
        int var13 = field2201[arg1];
        for (int var14 = 0; var14 < this.field2202; var14++) {
            int var15 = this.field2234[var14] * var13 + this.field2223[var14] * var12 >> 16;
            this.field2223[var14] = this.field2223[var14] * var13 - this.field2234[var14] * var12 >> 16;
            this.field2234[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "([B)V")
    private final void method800(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class249 var4 = new class249(arg0);
        class249 var5 = new class249(arg0);
        class249 var6 = new class249(arg0);
        class249 var7 = new class249(arg0);
        class249 var8 = new class249(arg0);
        var4.field4335 = arg0.length - 18;
        int var9 = var4.method1674(1355769544);
        int var10 = var4.method1674(1355769544);
        int var11 = var4.method1677(-6677);
        int var12 = var4.method1677(-6677);
        int var13 = var4.method1677(-6677);
        int var14 = var4.method1677(-6677);
        int var15 = var4.method1677(-6677);
        int var16 = var4.method1677(-6677);
        int var17 = var4.method1674(1355769544);
        int var18 = var4.method1674(1355769544);
        int var19 = var4.method1674(1355769544);
        int var20 = var4.method1674(1355769544);
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
        this.field2202 = var9;
        this.field2232 = var10;
        this.field2216 = var11;
        this.field2234 = new int[var9];
        this.field2230 = new int[var9];
        this.field2223 = new int[var9];
        this.field2203 = new int[var10];
        this.field2243 = new int[var10];
        this.field2220 = new int[var10];
        if (var11 > 0) {
            this.field2218 = new byte[var11];
            this.field2211 = new short[var11];
            this.field2209 = new short[var11];
            this.field2214 = new short[var11];
        }
        if (var16 == 1) {
            this.field2238 = new int[var9];
        }
        if (var12 == 1) {
            this.field2233 = new byte[var10];
            this.field2249 = new byte[var10];
            this.field2222 = new short[var10];
        }
        if (var13 == 255) {
            this.field2237 = new byte[var10];
        } else {
            this.field2246 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2236 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2228 = new int[var10];
        }
        this.field2219 = new short[var10];
        var4.field4335 = var21;
        var5.field4335 = var36;
        var6.field4335 = var38;
        var7.field4335 = var40;
        var8.field4335 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method1677(-6677);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method1687(32767);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method1687(32767);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method1687(32767);
            }
            this.field2234[var46] = var43 + var63;
            this.field2230[var46] = var44 + var64;
            this.field2223[var46] = var45 + var65;
            var43 = this.field2234[var46];
            var44 = this.field2230[var46];
            var45 = this.field2223[var46];
            if (var16 == 1) {
                this.field2238[var46] = var8.method1677(-6677);
            }
        }
        var4.field4335 = var32;
        var5.field4335 = var28;
        var6.field4335 = var26;
        var7.field4335 = var30;
        var8.field4335 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field2219[var47] = (short) var4.method1674(1355769544);
            if (var12 == 1) {
                int var61 = var5.method1677(-6677);
                if ((var61 & 0x1) == 1) {
                    this.field2233[var47] = 1;
                    var2 = true;
                } else {
                    this.field2233[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field2249[var47] = (byte) (var61 >> 2);
                    this.field2222[var47] = this.field2219[var47];
                    this.field2219[var47] = 127;
                    if (this.field2222[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2249[var47] = -1;
                    this.field2222[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field2237[var47] = var6.method1682(3390);
            }
            if (var14 == 1) {
                this.field2236[var47] = var7.method1682(3390);
            }
            if (var15 == 1) {
                this.field2228[var47] = var8.method1677(-6677);
            }
        }
        var4.field4335 = var25;
        var5.field4335 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method1677(-6677);
            if (var57 == 1) {
                var48 = var4.method1687(32767) + var51;
                var49 = var4.method1687(32767) + var48;
                var50 = var4.method1687(32767) + var49;
                var51 = var50;
                this.field2203[var52] = var48;
                this.field2243[var52] = var49;
                this.field2220[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method1687(32767) + var51;
                var51 = var50;
                this.field2203[var52] = var48;
                this.field2243[var52] = var49;
                this.field2220[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method1687(32767) + var51;
                var51 = var50;
                this.field2203[var52] = var48;
                this.field2243[var52] = var49;
                this.field2220[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method1687(32767) + var51;
                var51 = var50;
                this.field2203[var52] = var48;
                this.field2243[var52] = var60;
                this.field2220[var52] = var50;
            }
        }
        var4.field4335 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field2218[var53] = 0;
            this.field2211[var53] = (short) var4.method1674(1355769544);
            this.field2209[var53] = (short) var4.method1674(1355769544);
            this.field2214[var53] = (short) var4.method1674(1355769544);
        }
        if (this.field2249 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field2249[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field2211[var56] & 0xFFFF) == this.field2203[var55] && (this.field2209[var56] & 0xFFFF) == this.field2243[var55] && (this.field2214[var56] & 0xFFFF) == this.field2220[var55]) {
                        this.field2249[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field2249 = null;
            }
        }
        if (!var3) {
            this.field2222 = null;
        }
        if (!var2) {
            this.field2233 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(IIIII)Ljh;")
    public final class262 method801(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class229(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(III)V")
    public final void method802(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2202; var4++) {
            this.field2234[var4] += arg0;
            this.field2230[var4] += arg1;
            this.field2223[var4] += arg2;
        }
        this.method796();
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(SS)V")
    public final void method803(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2232; var3++) {
            if (this.field2219[var3] == arg0) {
                this.field2219[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "()Z")
    public final boolean method87() {
        return true;
    }

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "()V")
    public final void method804() {
        for (int var1 = 0; var1 < this.field2202; var1++) {
            int var2 = this.field2234[var1];
            this.field2234[var1] = this.field2223[var1];
            this.field2223[var1] = -var2;
        }
        this.method796();
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(III)I")
    public final int method805(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2202; var4++) {
            if (this.field2234[var4] == arg0 && this.field2230[var4] == arg1 && this.field2223[var4] == arg2) {
                return var4;
            }
        }
        this.field2234[this.field2202] = arg0;
        this.field2230[this.field2202] = arg1;
        this.field2223[this.field2202] = arg2;
        return this.field2202++;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)La;")
    public final class20 method86(int arg0, int arg1, int arg2) {
        return this.method801(this.field2225, this.field2231, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "()V")
    public final void method806() {
        this.field2238 = null;
        this.field2228 = null;
        this.field2244 = null;
        this.field2241 = null;
    }

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "()V")
    public final void method807() {
        for (int var1 = 0; var1 < this.field2202; var1++) {
            int var2 = this.field2223[var1];
            this.field2223[var1] = this.field2234[var1];
            this.field2234[var1] = -var2;
        }
        this.method796();
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([[III)I")
    private static final int method808(int[][] arg0, int arg1, int arg2) {
        int var3 = arg1 >> 7;
        int var4 = arg2 >> 7;
        if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
            return 0;
        }
        int var5 = arg1 & 0x7F;
        int var6 = arg2 & 0x7F;
        int var7 = (128 - var5) * arg0[var3][var4] + arg0[var3 + 1][var4] * var5 >> 7;
        int var8 = (128 - var5) * arg0[var3][var4 + 1] + arg0[var3 + 1][var4 + 1] * var5 >> 7;
        return (128 - var6) * var7 + var6 * var8 >> 7;
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(III)V")
    public final void method809(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2202; var4++) {
            this.field2234[var4] = this.field2234[var4] * arg0 / 128;
            this.field2230[var4] = this.field2230[var4] * arg1 / 128;
            this.field2223[var4] = this.field2223[var4] * arg2 / 128;
        }
        this.method796();
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    private class118() {
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([B)V")
    private class118(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method782(arg0);
        } else {
            this.method800(arg0);
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(III)V")
    public class118(int arg0, int arg1, int arg2) {
        this.field2234 = new int[arg0];
        this.field2230 = new int[arg0];
        this.field2223 = new int[arg0];
        this.field2238 = new int[arg0];
        this.field2203 = new int[arg1];
        this.field2243 = new int[arg1];
        this.field2220 = new int[arg1];
        this.field2233 = new byte[arg1];
        this.field2237 = new byte[arg1];
        this.field2236 = new byte[arg1];
        this.field2219 = new short[arg1];
        this.field2222 = new short[arg1];
        this.field2249 = new byte[arg1];
        this.field2228 = new int[arg1];
        if (arg2 > 0) {
            this.field2218 = new byte[arg2];
            this.field2211 = new short[arg2];
            this.field2209 = new short[arg2];
            this.field2214 = new short[arg2];
            this.field2229 = new short[arg2];
            this.field2213 = new short[arg2];
            this.field2224 = new short[arg2];
            this.field2204 = new byte[arg2];
            this.field2212 = new byte[arg2];
            this.field2217 = new byte[arg2];
            this.field2221 = new byte[arg2];
            this.field2242 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIBSB)I")
    public final int method810(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field2203[this.field2232] = arg0;
        this.field2243[this.field2232] = arg1;
        this.field2220[this.field2232] = arg2;
        this.field2233[this.field2232] = arg3;
        this.field2249[this.field2232] = -1;
        this.field2219[this.field2232] = arg4;
        this.field2222[this.field2232] = -1;
        this.field2236[this.field2232] = arg5;
        return this.field2232++;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([Lne;I)V")
    public class118(class118[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2202 = 0;
        this.field2232 = 0;
        this.field2216 = 0;
        this.field2246 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class118 var15 = arg0[var9];
            if (var15 != null) {
                this.field2202 += var15.field2202;
                this.field2232 += var15.field2232;
                this.field2216 += var15.field2216;
                if (var15.field2237 == null) {
                    if (this.field2246 == -1) {
                        this.field2246 = var15.field2246;
                    }
                    if (this.field2246 != var15.field2246) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var15.field2233 != null;
                var5 |= var15.field2236 != null;
                var6 |= var15.field2228 != null;
                var7 |= var15.field2222 != null;
                var8 |= var15.field2249 != null;
            }
        }
        this.field2234 = new int[this.field2202];
        this.field2230 = new int[this.field2202];
        this.field2223 = new int[this.field2202];
        this.field2238 = new int[this.field2202];
        this.field2203 = new int[this.field2232];
        this.field2243 = new int[this.field2232];
        this.field2220 = new int[this.field2232];
        if (var3) {
            this.field2233 = new byte[this.field2232];
        }
        if (var4) {
            this.field2237 = new byte[this.field2232];
        }
        if (var5) {
            this.field2236 = new byte[this.field2232];
        }
        if (var6) {
            this.field2228 = new int[this.field2232];
        }
        if (var7) {
            this.field2222 = new short[this.field2232];
        }
        if (var8) {
            this.field2249 = new byte[this.field2232];
        }
        this.field2219 = new short[this.field2232];
        if (this.field2216 > 0) {
            this.field2218 = new byte[this.field2216];
            this.field2211 = new short[this.field2216];
            this.field2209 = new short[this.field2216];
            this.field2214 = new short[this.field2216];
            this.field2229 = new short[this.field2216];
            this.field2213 = new short[this.field2216];
            this.field2224 = new short[this.field2216];
            this.field2204 = new byte[this.field2216];
            this.field2212 = new byte[this.field2216];
            this.field2217 = new byte[this.field2216];
            this.field2221 = new byte[this.field2216];
            this.field2242 = new byte[this.field2216];
        }
        this.field2202 = 0;
        this.field2232 = 0;
        this.field2216 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            class118 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field2232; var12++) {
                    if (var3 && var11.field2233 != null) {
                        this.field2233[this.field2232] = var11.field2233[var12];
                    }
                    if (var4) {
                        if (var11.field2237 == null) {
                            this.field2237[this.field2232] = var11.field2246;
                        } else {
                            this.field2237[this.field2232] = var11.field2237[var12];
                        }
                    }
                    if (var5 && var11.field2236 != null) {
                        this.field2236[this.field2232] = var11.field2236[var12];
                    }
                    if (var6 && var11.field2228 != null) {
                        this.field2228[this.field2232] = var11.field2228[var12];
                    }
                    if (var7) {
                        if (var11.field2222 == null) {
                            this.field2222[this.field2232] = -1;
                        } else {
                            this.field2222[this.field2232] = var11.field2222[var12];
                        }
                    }
                    if (var8) {
                        if (var11.field2249 == null || var11.field2249[var12] == -1) {
                            this.field2249[this.field2232] = -1;
                        } else {
                            this.field2249[this.field2232] = (byte) (var11.field2249[var12] + this.field2216);
                        }
                    }
                    this.field2219[this.field2232] = var11.field2219[var12];
                    this.field2203[this.field2232] = this.method787(var11, var11.field2203[var12]);
                    this.field2243[this.field2232] = this.method787(var11, var11.field2243[var12]);
                    this.field2220[this.field2232] = this.method787(var11, var11.field2220[var12]);
                    this.field2232++;
                }
                for (int var13 = 0; var13 < var11.field2216; var13++) {
                    byte var14 = this.field2218[this.field2216] = var11.field2218[var13];
                    if (var14 == 0) {
                        this.field2211[this.field2216] = (short) this.method787(var11, var11.field2211[var13]);
                        this.field2209[this.field2216] = (short) this.method787(var11, var11.field2209[var13]);
                        this.field2214[this.field2216] = (short) this.method787(var11, var11.field2214[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field2211[this.field2216] = var11.field2211[var13];
                        this.field2209[this.field2216] = var11.field2209[var13];
                        this.field2214[this.field2216] = var11.field2214[var13];
                        this.field2229[this.field2216] = var11.field2229[var13];
                        this.field2213[this.field2216] = var11.field2213[var13];
                        this.field2224[this.field2216] = var11.field2224[var13];
                        this.field2204[this.field2216] = var11.field2204[var13];
                        this.field2212[this.field2216] = var11.field2212[var13];
                        this.field2217[this.field2216] = var11.field2217[var13];
                    }
                    if (var14 == 2) {
                        this.field2221[this.field2216] = var11.field2221[var13];
                        this.field2242[this.field2216] = var11.field2242[var13];
                    }
                    this.field2216++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lne;ZZZZ)V")
    public class118(class118 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2202 = arg0.field2202;
        this.field2232 = arg0.field2232;
        this.field2216 = arg0.field2216;
        if (arg1) {
            this.field2234 = arg0.field2234;
            this.field2230 = arg0.field2230;
            this.field2223 = arg0.field2223;
        } else {
            this.field2234 = new int[this.field2202];
            this.field2230 = new int[this.field2202];
            this.field2223 = new int[this.field2202];
            for (int var6 = 0; var6 < this.field2202; var6++) {
                this.field2234[var6] = arg0.field2234[var6];
                this.field2230[var6] = arg0.field2230[var6];
                this.field2223[var6] = arg0.field2223[var6];
            }
        }
        if (arg2) {
            this.field2219 = arg0.field2219;
        } else {
            this.field2219 = new short[this.field2232];
            for (int var7 = 0; var7 < this.field2232; var7++) {
                this.field2219[var7] = arg0.field2219[var7];
            }
        }
        if (arg3 || arg0.field2222 == null) {
            this.field2222 = arg0.field2222;
        } else {
            this.field2222 = new short[this.field2232];
            for (int var8 = 0; var8 < this.field2232; var8++) {
                this.field2222[var8] = arg0.field2222[var8];
            }
        }
        if (arg4) {
            this.field2236 = arg0.field2236;
        } else {
            this.field2236 = new byte[this.field2232];
            if (arg0.field2236 == null) {
                for (int var9 = 0; var9 < this.field2232; var9++) {
                    this.field2236[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2232; var10++) {
                    this.field2236[var10] = arg0.field2236[var10];
                }
            }
        }
        this.field2203 = arg0.field2203;
        this.field2243 = arg0.field2243;
        this.field2220 = arg0.field2220;
        this.field2233 = arg0.field2233;
        this.field2237 = arg0.field2237;
        this.field2249 = arg0.field2249;
        this.field2246 = arg0.field2246;
        this.field2218 = arg0.field2218;
        this.field2211 = arg0.field2211;
        this.field2209 = arg0.field2209;
        this.field2214 = arg0.field2214;
        this.field2229 = arg0.field2229;
        this.field2213 = arg0.field2213;
        this.field2224 = arg0.field2224;
        this.field2204 = arg0.field2204;
        this.field2212 = arg0.field2212;
        this.field2217 = arg0.field2217;
        this.field2221 = arg0.field2221;
        this.field2242 = arg0.field2242;
        this.field2238 = arg0.field2238;
        this.field2228 = arg0.field2228;
        this.field2244 = arg0.field2244;
        this.field2241 = arg0.field2241;
        this.field2208 = arg0.field2208;
        this.field2205 = arg0.field2205;
        this.field2235 = arg0.field2235;
        this.field2225 = arg0.field2225;
        this.field2231 = arg0.field2231;
    }
}
