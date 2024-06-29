import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class161 extends class536 {

    @OriginalMember(owner = "client!to", name = "L", descriptor = "I")
    private int field2222 = 0;

    @OriginalMember(owner = "client!to", name = "K", descriptor = "I")
    private int field2221 = 0;

    @OriginalMember(owner = "client!to", name = "vb", descriptor = "Z")
    private boolean field2258 = false;

    @OriginalMember(owner = "client!to", name = "qb", descriptor = "I")
    private int field2253 = 0;

    @OriginalMember(owner = "client!to", name = "W", descriptor = "I")
    private int field2233 = 0;

    @OriginalMember(owner = "client!to", name = "sb", descriptor = "Z")
    private boolean field2255 = true;

    @OriginalMember(owner = "client!to", name = "Qb", descriptor = "I")
    private int field2279 = 0;

    @OriginalMember(owner = "client!to", name = "x", descriptor = "Lna;")
    private class211 field2208;

    @OriginalMember(owner = "client!to", name = "Rb", descriptor = "Ldb;")
    private class67 field2280;

    @OriginalMember(owner = "client!to", name = "ib", descriptor = "Ldb;")
    private class67 field2245;

    @OriginalMember(owner = "client!to", name = "db", descriptor = "Ldb;")
    private class67 field2240;

    @OriginalMember(owner = "client!to", name = "ob", descriptor = "Ldb;")
    private class67 field2251;

    @OriginalMember(owner = "client!to", name = "F", descriptor = "Lkh;")
    private class256 field2216;

    @OriginalMember(owner = "client!to", name = "Bb", descriptor = "I")
    private int field2264;

    @OriginalMember(owner = "client!to", name = "U", descriptor = "I")
    private int field2231;

    @OriginalMember(owner = "client!to", name = "u", descriptor = "[I")
    private int[] field2205;

    @OriginalMember(owner = "client!to", name = "S", descriptor = "[S")
    private short[] field2229;

    @OriginalMember(owner = "client!to", name = "Ub", descriptor = "[I")
    private int[] field2283;

    @OriginalMember(owner = "client!to", name = "G", descriptor = "[I")
    private int[] field2217;

    @OriginalMember(owner = "client!to", name = "mb", descriptor = "[I")
    private int[] field2249;

    @OriginalMember(owner = "client!to", name = "Fb", descriptor = "[Lol;")
    private class293[] field2268;

    @OriginalMember(owner = "client!to", name = "nc", descriptor = "[Lvc;")
    private class100[] field2302;

    @OriginalMember(owner = "client!to", name = "tb", descriptor = "I")
    private int field2256;

    @OriginalMember(owner = "client!to", name = "Hb", descriptor = "[Ltl;")
    private class92[] field2270;

    @OriginalMember(owner = "client!to", name = "zb", descriptor = "[Lvh;")
    private class94[] field2262;

    @OriginalMember(owner = "client!to", name = "Tb", descriptor = "S")
    private short field2282;

    @OriginalMember(owner = "client!to", name = "T", descriptor = "[S")
    private short[] field2230;

    @OriginalMember(owner = "client!to", name = "lb", descriptor = "[S")
    private short[] field2248;

    @OriginalMember(owner = "client!to", name = "R", descriptor = "[B")
    private byte[] field2228;

    @OriginalMember(owner = "client!to", name = "rc", descriptor = "[F")
    private float[] field2306;

    @OriginalMember(owner = "client!to", name = "Z", descriptor = "[F")
    private float[] field2236;

    @OriginalMember(owner = "client!to", name = "Sb", descriptor = "[S")
    private short[] field2281;

    @OriginalMember(owner = "client!to", name = "C", descriptor = "[S")
    private short[] field2213;

    @OriginalMember(owner = "client!to", name = "ec", descriptor = "[S")
    private short[] field2293;

    @OriginalMember(owner = "client!to", name = "B", descriptor = "[S")
    private short[] field2212;

    @OriginalMember(owner = "client!to", name = "Pb", descriptor = "[S")
    private short[] field2278;

    @OriginalMember(owner = "client!to", name = "xb", descriptor = "[S")
    private short[] field2260;

    @OriginalMember(owner = "client!to", name = "wb", descriptor = "[B")
    private byte[] field2259;

    @OriginalMember(owner = "client!to", name = "ac", descriptor = "[S")
    private short[] field2289;

    @OriginalMember(owner = "client!to", name = "pc", descriptor = "S")
    private short field2304;

    @OriginalMember(owner = "client!to", name = "Nb", descriptor = "[S")
    private short[] field2276;

    @OriginalMember(owner = "client!to", name = "Yb", descriptor = "[I")
    private int[] field2287;

    @OriginalMember(owner = "client!to", name = "p", descriptor = "[[I")
    private int[][] field2200;

    @OriginalMember(owner = "client!to", name = "fb", descriptor = "[[I")
    private int[][] field2242;

    @OriginalMember(owner = "client!to", name = "X", descriptor = "[[I")
    private int[][] field2234;

    @OriginalMember(owner = "client!to", name = "oc", descriptor = "[Ljava/lang/String;")
    public static String[] field2303 = new String[100];

    @OriginalMember(owner = "client!to", name = "cc", descriptor = "B")
    private byte field2291;

    @OriginalMember(owner = "client!to", name = "nb", descriptor = "F")
    public static float field2250;

    @OriginalMember(owner = "client!to", name = "l", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!to", name = "m", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!to", name = "o", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!to", name = "r", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!to", name = "t", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!to", name = "w", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!to", name = "z", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!to", name = "A", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!to", name = "D", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!to", name = "E", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!to", name = "H", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!to", name = "I", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!to", name = "M", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!to", name = "N", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!to", name = "O", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!to", name = "Q", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!to", name = "V", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!to", name = "Y", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!to", name = "ab", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!to", name = "bb", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!to", name = "cb", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!to", name = "eb", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!to", name = "gb", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!to", name = "hb", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!to", name = "jb", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!to", name = "kb", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!to", name = "pb", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!to", name = "rb", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!to", name = "yb", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!to", name = "Ab", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!to", name = "Cb", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!to", name = "Db", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!to", name = "Eb", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!to", name = "Ib", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!to", name = "Jb", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!to", name = "Kb", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!to", name = "Lb", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!to", name = "Mb", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!to", name = "Ob", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!to", name = "Vb", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!to", name = "Wb", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!to", name = "Xb", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!to", name = "Zb", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!to", name = "dc", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!to", name = "gc", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!to", name = "hc", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!to", name = "ic", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!to", name = "jc", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!to", name = "kc", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!to", name = "mc", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!to", name = "qc", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!to", name = "sc", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!to", name = "tc", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!to", name = "v", descriptor = "Ll;")
    public static class199 field2206;

    @OriginalMember(owner = "client!to", name = "P", descriptor = "Lfr;")
    private class234 field2226;

    @OriginalMember(owner = "client!to", name = "bc", descriptor = "Ltb;")
    private class347 field2290;

    @OriginalMember(owner = "client!to", name = "fc", descriptor = "Lui;")
    private class383 field2294;

    @OriginalMember(owner = "client!to", name = "q", descriptor = "S")
    private short field2201;

    @OriginalMember(owner = "client!to", name = "s", descriptor = "S")
    private short field2203;

    @OriginalMember(owner = "client!to", name = "y", descriptor = "S")
    private short field2209;

    @OriginalMember(owner = "client!to", name = "J", descriptor = "S")
    private short field2220;

    @OriginalMember(owner = "client!to", name = "ub", descriptor = "S")
    private short field2257;

    @OriginalMember(owner = "client!to", name = "Gb", descriptor = "S")
    private short field2269;

    @OriginalMember(owner = "client!to", name = "lc", descriptor = "S")
    private short field2300;

    @OriginalMember(owner = "client!to", name = "l", descriptor = "()I")
    public final int method318() {
        field2273++;
        if (!this.field2258) {
            this.method981((byte) -100);
        }
        return this.field2203;
    }

    @OriginalMember(owner = "client!to", name = "MA", descriptor = "()I")
    public final int method270() {
        if (!this.field2258) {
            this.method981((byte) -117);
        }
        field2296++;
        return this.field2209;
    }

    @OriginalMember(owner = "client!to", name = "Z", descriptor = "()I")
    public final int method314() {
        if (!this.field2258) {
            this.method981((byte) -85);
        }
        field2235++;
        return this.field2269;
    }

    @OriginalMember(owner = "client!to", name = "h", descriptor = "()Z")
    public final boolean method271() {
        field2265++;
        if (this.field2200 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field2233; var1++) {
            this.field2283[var1] <<= 0x4;
            this.field2249[var1] <<= 0x4;
            this.field2217[var1] <<= 0x4;
        }
        class491.field7437 = 0;
        class184.field2681 = 0;
        class136.field1876 = 0;
        return true;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIBIIIII)Z")
    private final boolean method975(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2243++;
        if (arg2 > arg8 && arg0 > arg8 && arg1 > arg8) {
            return false;
        }
        if (arg3 != -28) {
            method985(23, null, -94, null, -7);
        }
        if (arg2 < arg8 && arg0 < arg8 && arg1 < arg8) {
            return false;
        } else if (arg5 < arg6 && arg5 < arg7 && arg5 < arg4) {
            return false;
        } else {
            return arg5 <= arg6 || arg5 <= arg7 || arg5 <= arg4;
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "()[Lol;")
    public final class293[] method292() {
        field2232++;
        return this.field2268;
    }

    @OriginalMember(owner = "client!to", name = "EA", descriptor = "(Li;)Li;")
    public final class521 method330(class521 arg0) {
        field2285++;
        if (this.field2279 == 0) {
            return null;
        }
        if (!this.field2258) {
            this.method981((byte) -118);
        }
        int var2;
        int var3;
        if (this.field2208.field3535 <= 0) {
            var2 = this.field2257 - (this.field2208.field3535 * this.field2220 >> 8) >> this.field2208.field3483;
            var3 = this.field2209 - (this.field2208.field3535 * this.field2203 >> 8) >> this.field2208.field3483;
        } else {
            var2 = this.field2257 - (this.field2208.field3535 * this.field2203 >> 8) >> this.field2208.field3483;
            var3 = this.field2209 - (this.field2208.field3535 * this.field2220 >> 8) >> this.field2208.field3483;
        }
        int var4;
        int var5;
        if (this.field2208.field3578 > 0) {
            var4 = this.field2269 - (this.field2208.field3578 * this.field2203 >> 8) >> this.field2208.field3483;
            var5 = this.field2300 - (this.field2208.field3578 * this.field2220 >> 8) >> this.field2208.field3483;
        } else {
            var4 = this.field2269 - (this.field2208.field3578 * this.field2220 >> 8) >> this.field2208.field3483;
            var5 = this.field2300 - (this.field2208.field3578 * this.field2203 >> 8) >> this.field2208.field3483;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class283 var8 = (class283) arg0;
        class283 var9;
        if (var8 != null && var8.method1901(var7, 298126800, var6)) {
            var9 = var8;
            var8.method1902((byte) 0);
        } else {
            var9 = new class283(this.field2208, var6, var7);
        }
        var9.method1903(var4, var5, var3, -2048629008, var2);
        this.method986(-1202700985, var9);
        return var9;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lto;IZIZLto;)Le;")
    private final class536 method976(class161 arg0, int arg1, boolean arg2, int arg3, boolean arg4, class161 arg5) {
        arg0.field2233 = this.field2233;
        arg0.field2256 = this.field2256;
        arg0.field2282 = this.field2282;
        field2298++;
        if (arg3 < 67) {
            this.method323();
        }
        arg0.field2221 = this.field2221;
        arg0.field2279 = this.field2279;
        arg0.field2304 = this.field2304;
        arg0.field2291 = 0;
        arg0.field2253 = this.field2253;
        arg0.field2222 = this.field2222;
        arg0.field2264 = this.field2264;
        arg0.field2231 = arg1;
        boolean var7 = class46.method337(arg1, true, this.field2264);
        boolean var8 = class486.method2982(-1, arg1, this.field2264);
        boolean var9 = class416.method2663(arg1, this.field2264, 120);
        boolean var10 = var9 | var7 | var8;
        if (var10) {
            if (!var7) {
                arg0.field2283 = this.field2283;
            } else if (arg5.field2283 == null || this.field2233 > arg5.field2283.length) {
                arg0.field2283 = arg5.field2283 = new int[this.field2233];
            } else {
                arg0.field2283 = arg5.field2283;
            }
            if (!var8) {
                arg0.field2249 = this.field2249;
            } else if (arg5.field2249 == null || arg5.field2249.length < this.field2233) {
                arg0.field2249 = arg5.field2249 = new int[this.field2233];
            } else {
                arg0.field2249 = arg5.field2249;
            }
            if (!var9) {
                arg0.field2217 = this.field2217;
            } else if (arg5.field2217 == null || this.field2233 > arg5.field2217.length) {
                arg0.field2217 = arg5.field2217 = new int[this.field2233];
            } else {
                arg0.field2217 = arg5.field2217;
            }
            for (int var11 = 0; var11 < this.field2233; var11++) {
                if (var7) {
                    arg0.field2283[var11] = this.field2283[var11];
                }
                if (var8) {
                    arg0.field2249[var11] = this.field2249[var11];
                }
                if (var9) {
                    arg0.field2217[var11] = this.field2217[var11];
                }
            }
        } else {
            arg0.field2283 = this.field2283;
            arg0.field2249 = this.field2249;
            arg0.field2217 = this.field2217;
        }
        if (class439.method2789(52, arg1, this.field2264)) {
            arg0.field2280 = arg5.field2280;
            if (arg4) {
                arg0.field2291 = (byte) (arg0.field2291 | 0x1);
            }
            arg0.field2280.field1022 = this.field2280.field1022;
            arg0.field2280.field1023 = this.field2280.field1023;
        } else if (class205.method1405(arg1, this.field2264, (byte) -128)) {
            arg0.field2280 = this.field2280;
        } else {
            arg0.field2280 = null;
        }
        if (class271.method1834(this.field2264, arg1, true)) {
            if (arg5.field2289 == null || arg5.field2289.length < this.field2221) {
                arg0.field2289 = arg5.field2289 = new short[this.field2221];
            } else {
                arg0.field2289 = arg5.field2289;
            }
            for (int var12 = 0; var12 < this.field2221; var12++) {
                arg0.field2289[var12] = this.field2289[var12];
            }
        } else {
            arg0.field2289 = this.field2289;
        }
        if (class220.method1607(-71, arg1, this.field2264)) {
            if (arg5.field2259 == null || this.field2221 > arg5.field2259.length) {
                arg0.field2259 = arg5.field2259 = new byte[this.field2221];
            } else {
                arg0.field2259 = arg5.field2259;
            }
            for (int var13 = 0; var13 < this.field2221; var13++) {
                arg0.field2259[var13] = this.field2259[var13];
            }
        } else {
            arg0.field2259 = this.field2259;
        }
        if (class449.method2830(-1, this.field2264, arg1)) {
            if (arg4) {
                arg0.field2291 = (byte) (arg0.field2291 | 0x2);
            }
            arg0.field2251 = arg5.field2251;
            arg0.field2251.field1023 = this.field2251.field1023;
            arg0.field2251.field1022 = this.field2251.field1022;
        } else if (class136.method834((byte) -54, arg1, this.field2264)) {
            arg0.field2251 = this.field2251;
        } else {
            arg0.field2251 = null;
        }
        if (class542.method3196(this.field2264, -15252, arg1)) {
            if (arg5.field2230 == null || this.field2279 > arg5.field2230.length) {
                int var14 = this.field2279;
                arg0.field2213 = arg5.field2213 = new short[var14];
                arg0.field2276 = arg5.field2276 = new short[var14];
                arg0.field2230 = arg5.field2230 = new short[var14];
            } else {
                arg0.field2213 = arg5.field2213;
                arg0.field2230 = arg5.field2230;
                arg0.field2276 = arg5.field2276;
            }
            if (this.field2226 == null) {
                for (int var15 = 0; var15 < this.field2279; var15++) {
                    arg0.field2230[var15] = this.field2230[var15];
                    arg0.field2276[var15] = this.field2276[var15];
                    arg0.field2213[var15] = this.field2213[var15];
                }
            } else {
                if (arg5.field2226 == null) {
                    arg5.field2226 = new class234();
                }
                class234 var16 = arg0.field2226 = arg5.field2226;
                if (var16.field3862 == null || var16.field3862.length < this.field2279) {
                    int var17 = this.field2279;
                    var16.field3857 = new byte[var17];
                    var16.field3862 = new short[var17];
                    var16.field3856 = new short[var17];
                    var16.field3855 = new short[var17];
                }
                for (int var18 = 0; var18 < this.field2279; var18++) {
                    arg0.field2230[var18] = this.field2230[var18];
                    arg0.field2276[var18] = this.field2276[var18];
                    arg0.field2213[var18] = this.field2213[var18];
                    var16.field3862[var18] = this.field2226.field3862[var18];
                    var16.field3856[var18] = this.field2226.field3856[var18];
                    var16.field3855[var18] = this.field2226.field3855[var18];
                    var16.field3857[var18] = this.field2226.field3857[var18];
                }
            }
            arg0.field2228 = this.field2228;
        } else {
            arg0.field2226 = this.field2226;
            arg0.field2230 = this.field2230;
            arg0.field2228 = this.field2228;
            arg0.field2276 = this.field2276;
            arg0.field2213 = this.field2213;
        }
        if (class190.method1187(this.field2264, 0, arg1)) {
            if (arg4) {
                arg0.field2291 = (byte) (arg0.field2291 | 0x4);
            }
            arg0.field2240 = arg5.field2240;
            arg0.field2240.field1022 = this.field2240.field1022;
            arg0.field2240.field1023 = this.field2240.field1023;
        } else if (class147.method897(arg1, this.field2264, 55)) {
            arg0.field2240 = this.field2240;
        } else {
            arg0.field2240 = null;
        }
        if (class319.method2141(this.field2264, arg1, (byte) -99)) {
            if (arg5.field2236 == null || arg5.field2236.length < this.field2221) {
                int var19 = this.field2279;
                arg0.field2236 = arg5.field2236 = new float[var19];
                arg0.field2306 = arg5.field2306 = new float[var19];
            } else {
                arg0.field2306 = arg5.field2306;
                arg0.field2236 = arg5.field2236;
            }
            for (int var20 = 0; var20 < this.field2279; var20++) {
                arg0.field2236[var20] = this.field2236[var20];
                arg0.field2306[var20] = this.field2306[var20];
            }
        } else {
            arg0.field2236 = this.field2236;
            arg0.field2306 = this.field2306;
        }
        if (class262.method1798(arg1, this.field2264, (byte) -71)) {
            arg0.field2245 = arg5.field2245;
            if (arg4) {
                arg0.field2291 = (byte) (arg0.field2291 | 0x8);
            }
            arg0.field2245.field1023 = this.field2245.field1023;
            arg0.field2245.field1022 = this.field2245.field1022;
        } else if (class252.method1736(arg1, (byte) -114, this.field2264)) {
            arg0.field2245 = this.field2245;
        } else {
            arg0.field2245 = null;
        }
        if (class60.method451(arg1, this.field2264, (byte) 90)) {
            if (arg5.field2281 == null || this.field2221 > arg5.field2281.length) {
                int var21 = this.field2221;
                arg0.field2212 = arg5.field2212 = new short[var21];
                arg0.field2293 = arg5.field2293 = new short[var21];
                arg0.field2281 = arg5.field2281 = new short[var21];
            } else {
                arg0.field2293 = arg5.field2293;
                arg0.field2212 = arg5.field2212;
                arg0.field2281 = arg5.field2281;
            }
            for (int var22 = 0; var22 < this.field2221; var22++) {
                arg0.field2281[var22] = this.field2281[var22];
                arg0.field2212[var22] = this.field2212[var22];
                arg0.field2293[var22] = this.field2293[var22];
            }
        } else {
            arg0.field2293 = this.field2293;
            arg0.field2212 = this.field2212;
            arg0.field2281 = this.field2281;
        }
        if (class266.method1818(this.field2264, arg1, -120)) {
            arg0.field2216 = arg5.field2216;
            if (arg4) {
                arg0.field2291 = (byte) (arg0.field2291 | 0x10);
            }
            arg0.field2216.field4146 = this.field2216.field4146;
        } else if (class202.method1373(arg1, -21682, this.field2264)) {
            arg0.field2216 = this.field2216;
        } else {
            arg0.field2216 = null;
        }
        if (class434.method2728(arg1, this.field2264, 102)) {
            if (arg5.field2248 == null || this.field2221 > arg5.field2248.length) {
                int var23 = this.field2221;
                arg0.field2248 = arg5.field2248 = new short[var23];
            } else {
                arg0.field2248 = arg5.field2248;
            }
            for (int var24 = 0; var24 < this.field2221; var24++) {
                arg0.field2248[var24] = this.field2248[var24];
            }
        } else {
            arg0.field2248 = this.field2248;
        }
        if (!class220.method1610(arg1, (byte) -108, this.field2264)) {
            arg0.field2270 = this.field2270;
        } else if (arg5.field2270 == null || arg5.field2270.length < this.field2256) {
            int var26 = this.field2256;
            arg0.field2270 = arg5.field2270 = new class92[var26];
            for (int var27 = 0; var27 < this.field2256; var27++) {
                arg0.field2270[var27] = this.field2270[var27].method637(false);
            }
        } else {
            arg0.field2270 = arg5.field2270;
            for (int var25 = 0; var25 < this.field2256; var25++) {
                arg0.field2270[var25].method638((byte) -60, this.field2270[var25]);
            }
        }
        arg0.field2302 = this.field2302;
        arg0.field2205 = this.field2205;
        arg0.field2287 = this.field2287;
        arg0.field2242 = this.field2242;
        arg0.field2268 = this.field2268;
        arg0.field2278 = this.field2278;
        if (this.field2258) {
            arg0.field2300 = this.field2300;
            arg0.field2209 = this.field2209;
            arg0.field2269 = this.field2269;
            arg0.field2220 = this.field2220;
            arg0.field2203 = this.field2203;
            arg0.field2201 = this.field2201;
            arg0.field2258 = true;
            arg0.field2257 = this.field2257;
        } else {
            arg0.field2258 = false;
        }
        arg0.field2234 = this.field2234;
        arg0.field2262 = this.field2262;
        arg0.field2200 = this.field2200;
        arg0.field2260 = this.field2260;
        arg0.field2229 = this.field2229;
        return arg0;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIII)V")
    public final void method324(int arg0, int arg1, int arg2, int arg3) {
        field2308++;
        for (int var5 = 0; var5 < this.field2221; var5++) {
            int var9 = this.field2289[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = (var9 & 0x386) >> 7;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field2289[var5] = (short) class410.method2621(class410.method2621(var10 << 10, var11 << 7), var12);
        }
        if (this.field2262 != null) {
            for (int var6 = 0; var6 < this.field2256; var6++) {
                class94 var7 = this.field2262[var6];
                class92 var8 = this.field2270[var6];
                var8.field1339 = class301.field4730[this.field2289[var7.field1368] & 0xFFFF] & 0xFFFFFF | var8.field1339 & 0xFF000000;
            }
        }
        if (this.field2251 != null) {
            this.field2251.field1022 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "S", descriptor = "()I")
    public final int method310() {
        if (!this.field2258) {
            this.method981((byte) -69);
        }
        field2238++;
        return this.field2300;
    }

    @OriginalMember(owner = "client!to", name = "K", descriptor = "(I)V")
    public final void method319(int arg0) {
        field2299++;
        int var2 = class147.field1988[arg0];
        int var3 = class147.field1986[arg0];
        for (int var4 = 0; var4 < this.field2222; var4++) {
            int var5 = this.field2249[var4] * var2 + (this.field2283[var4] * var3) >> 15;
            this.field2249[var4] = this.field2249[var4] * var3 - (this.field2283[var4] * var2) >> 15;
            this.field2283[var4] = var5;
        }
        this.field2258 = false;
        if (this.field2280 != null) {
            this.field2280.field1022 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)Z")
    public static final boolean method977(int arg0) {
        field2252++;
        if (arg0 != -3552) {
            field2206 = null;
        }
        return class209.field3228 != class181.field2626 || class439.field6815 >= 2;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(B)V")
    private final void method978(byte arg0) {
        int var2 = -117 / ((arg0 + 21) / 54);
        if (this.field2262 != null) {
            class89 var3 = this.field2208.field3477;
            float var4 = this.field2208.method1328();
            float var5 = this.field2208.method1268();
            this.field2208.method1570(16711680);
            this.field2208.method1240(false);
            this.field2208.method1504(false, -2414);
            this.field2208.method1548(null, this.field2208.field3548, this.field2208.field3605, 32886, null);
            for (int var6 = 0; var6 < this.field2256; var6++) {
                class94 var7 = this.field2262[var6];
                class92 var8 = this.field2270[var6];
                if (!var7.field1362 || !this.field2208.method1239()) {
                    float var9 = (float) (this.field2283[var7.field1369] + this.field2283[var7.field1367] + this.field2283[var7.field1374]) * 0.3333333F;
                    float var10 = (float) (this.field2249[var7.field1369] + this.field2249[var7.field1374] + this.field2249[var7.field1367]) * 0.3333333F;
                    float var11 = (float) (this.field2217[var7.field1374] + this.field2217[var7.field1369] + this.field2217[var7.field1367]) * 0.3333333F;
                    float var12 = class330.field5184 * var11 + class392.field5949 * var9 + class189.field2746 * var10 + class31.field326;
                    float var13 = class119.field1630 * var11 + class471.field7199 * var9 + class301.field4726 * var10 + class95.field1388;
                    float var14 = class227.field3790 * var11 + class236.field3875 * var10 + class166.field2421 * var9 + class268.field4299;
                    var3.method615(-var14, var8.field1343, var7.field1372 * var8.field1340 >> 7, (float) var8.field1349 - var13, var7.field1380 * var8.field1341 >> 7, (float) var8.field1344 + var12, (byte) 106);
                    this.field2208.method1533(0, var3);
                    this.field2208.method1309(var5, var4 - (float) var7.field1375 * 1.5F);
                    int var15 = var8.field1339;
                    OpenGL.glColor4ub((byte) (var15 >> 16), (byte) (var15 >> 8), (byte) var15, (byte) (var15 >> 24));
                    this.field2208.method1553(var7.field1364, true);
                    this.field2208.method1566((byte) 95, var7.field1379);
                    this.field2208.method1494(var7.field1376, -25951);
                    this.field2208.method1567(0, -100663297, 4, 7);
                }
            }
            this.field2208.method1309(var5, var4);
            this.field2208.method1240(true);
            this.field2208.method1541(-124);
        }
        field2288++;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V")
    private final void method979(int arg0) {
        field2202++;
        if (this.field2253 == 0) {
            return;
        }
        if (this.field2291 != arg0) {
            this.method984(true, (byte) 113);
        }
        this.method984(false, (byte) 113);
        if (this.field2216 != null) {
            if (this.field2216.field4146 == null) {
                this.method983((byte) 60, (this.field2291 & 0x10) != 0);
            }
            if (this.field2216.field4146 != null) {
                this.field2208.method1504(this.field2240 != null, arg0 - 2414);
                this.field2208.method1548(this.field2251, this.field2280, this.field2245, 32886, this.field2240);
                int var2 = this.field2287.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field2287[var3];
                    int var5 = this.field2287[var3 + 1];
                    int var6 = this.field2248[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field2208.method1497(22387, this.field2240 != null, var6);
                    this.field2208.method1537(this.field2216.field4146, var4 * 3, 0, (var5 - var4) * 3, 4);
                }
            }
        }
        this.method990(107);
    }

    @OriginalMember(owner = "client!to", name = "W", descriptor = "(I)V")
    public final void method278(int arg0) {
        field2225++;
        int var2 = class147.field1988[arg0];
        int var3 = class147.field1986[arg0];
        for (int var4 = 0; var4 < this.field2222; var4++) {
            int var5 = this.field2249[var4] * var3 - (this.field2217[var4] * var2) >> 15;
            this.field2217[var4] = this.field2249[var4] * var2 + this.field2217[var4] * var3 >> 15;
            this.field2249[var4] = var5;
        }
        if (this.field2280 != null) {
            this.field2280.field1022 = null;
        }
        this.field2258 = false;
    }

    @OriginalMember(owner = "client!to", name = "ta", descriptor = "()I")
    public final int method279() {
        if (!this.field2258) {
            this.method981((byte) -109);
        }
        field2224++;
        return this.field2257;
    }

    @OriginalMember(owner = "client!to", name = "va", descriptor = "(I[IIIIIZ)V")
    public final void method288(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field2292++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg3 << 4;
            int var11 = arg4 << 4;
            int var12 = 0;
            class491.field7437 = 0;
            class136.field1876 = 0;
            class184.field2681 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field2200.length > var14) {
                    int[] var15 = this.field2200[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class184.field2681 += this.field2283[var17];
                        class491.field7437 += this.field2249[var17];
                        var12++;
                        class136.field1876 += this.field2217[var17];
                    }
                }
            }
            if (var12 > 0) {
                class184.field2681 = class184.field2681 / var12 + var9;
                class491.field7437 = class491.field7437 / var12 + var10;
                class136.field1876 = class136.field1876 / var12 + var11;
            } else {
                class136.field1876 = var11;
                class491.field7437 = var10;
                class184.field2681 = var9;
            }
        } else if (arg0 == 1) {
            int var18 = arg2 << 4;
            int var19 = arg3 << 4;
            int var20 = arg4 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field2200.length) {
                    int[] var23 = this.field2200[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field2283[var25] += var18;
                        this.field2249[var25] += var19;
                        this.field2217[var25] += var20;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field2200.length) {
                    int[] var46 = this.field2200[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field2283[var48] -= class184.field2681;
                            this.field2249[var48] -= class491.field7437;
                            this.field2217[var48] -= class136.field1876;
                            if (arg4 != 0) {
                                int var49 = class147.field1988[arg4];
                                int var50 = class147.field1986[arg4];
                                int var51 = this.field2249[var48] * var49 + (this.field2283[var48] * var50) + 32767 >> 15;
                                this.field2249[var48] = this.field2249[var48] * var50 + 32767 - (this.field2283[var48] * var49) >> 15;
                                this.field2283[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class147.field1988[arg2];
                                int var53 = class147.field1986[arg2];
                                int var54 = this.field2249[var48] * var53 + 32767 - (this.field2217[var48] * var52) >> 15;
                                this.field2217[var48] = this.field2249[var48] * var52 + this.field2217[var48] * var53 + 32767 >> 15;
                                this.field2249[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class147.field1988[arg3];
                                int var56 = class147.field1986[arg3];
                                int var57 = this.field2283[var48] * var56 + this.field2217[var48] * var55 + 32767 >> 15;
                                this.field2217[var48] = this.field2217[var48] * var56 + (32767 - (this.field2283[var48] * var55)) >> 15;
                                this.field2283[var48] = var57;
                            }
                            this.field2283[var48] += class184.field2681;
                            this.field2249[var48] += class491.field7437;
                            this.field2217[var48] += class136.field1876;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field2283[var59] -= class184.field2681;
                            this.field2249[var59] -= class491.field7437;
                            this.field2217[var59] -= class136.field1876;
                            if (arg2 != 0) {
                                int var60 = class147.field1988[arg2];
                                int var61 = class147.field1986[arg2];
                                int var62 = this.field2249[var59] * var61 + 32767 - this.field2217[var59] * var60 >> 15;
                                this.field2217[var59] = this.field2249[var59] * var60 + this.field2217[var59] * var61 + 32767 >> 15;
                                this.field2249[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class147.field1988[arg4];
                                int var64 = class147.field1986[arg4];
                                int var65 = this.field2249[var59] * var63 + (this.field2283[var59] * var64) + 32767 >> 15;
                                this.field2249[var59] = this.field2249[var59] * var64 + 32767 - (this.field2283[var59] * var63) >> 15;
                                this.field2283[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class147.field1988[arg3];
                                int var67 = class147.field1986[arg3];
                                int var68 = this.field2283[var59] * var67 + this.field2217[var59] * var66 + 32767 >> 15;
                                this.field2217[var59] = this.field2217[var59] * var67 + 32767 - (this.field2283[var59] * var66) >> 15;
                                this.field2283[var59] = var68;
                            }
                            this.field2283[var59] += class184.field2681;
                            this.field2249[var59] += class491.field7437;
                            this.field2217[var59] += class136.field1876;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field2200.length > var28) {
                        int[] var29 = this.field2200[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field2205[var31];
                            int var33 = this.field2205[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field2260[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class147.field1988[arg4];
                                    int var37 = class147.field1986[arg4];
                                    int var38 = this.field2276[var35] * var36 + (this.field2230[var35] * var37) + 32767 >> 15;
                                    this.field2276[var35] = (short) (this.field2276[var35] * var37 + 32767 - (this.field2230[var35] * var36) >> 15);
                                    this.field2230[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class147.field1988[arg2];
                                    int var40 = class147.field1986[arg2];
                                    int var41 = this.field2276[var35] * var40 - (this.field2213[var35] * var39 - 32767) >> 15;
                                    this.field2213[var35] = (short) (this.field2213[var35] * var40 + this.field2276[var35] * var39 + 32767 >> 15);
                                    this.field2276[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class147.field1988[arg3];
                                    int var43 = class147.field1986[arg3];
                                    int var44 = this.field2213[var35] * var42 + (this.field2230[var35] * var43 + 32767) >> 15;
                                    this.field2213[var35] = (short) (this.field2213[var35] * var43 + 32767 - (this.field2230[var35] * var42) >> 15);
                                    this.field2230[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field2240 == null && this.field2251 != null) {
                    this.field2251.field1022 = null;
                }
                if (this.field2240 != null) {
                    this.field2240.field1022 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field2200.length) {
                    int[] var71 = this.field2200[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field2283[var73] -= class184.field2681;
                        this.field2249[var73] -= class491.field7437;
                        this.field2217[var73] -= class136.field1876;
                        this.field2283[var73] = this.field2283[var73] * arg2 >> 7;
                        this.field2249[var73] = this.field2249[var73] * arg3 >> 7;
                        this.field2217[var73] = this.field2217[var73] * arg4 >> 7;
                        this.field2283[var73] += class184.field2681;
                        this.field2249[var73] += class491.field7437;
                        this.field2217[var73] += class136.field1876;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field2234 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field2234.length > var78) {
                        int[] var79 = this.field2234[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field2259[var81] & 0xFF) + (arg2 * 8);
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field2259[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field2251 != null) {
                            this.field2251.field1022 = null;
                        }
                    }
                }
                if (this.field2262 != null) {
                    for (int var75 = 0; var75 < this.field2256; var75++) {
                        class94 var76 = this.field2262[var75];
                        class92 var77 = this.field2270[var75];
                        var77.field1339 = var77.field1339 & 0xFFFFFF | 255 - (this.field2259[var76.field1368] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field2234 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (var87 < this.field2234.length) {
                        int[] var88 = this.field2234[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field2289[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFE9A) >> 10;
                            int var93 = var91 >> 7 & 0x7;
                            int var94 = arg2 + var92 & 0x3F;
                            int var95 = arg3 / 4 + var93;
                            int var96 = var91 & 0x7F;
                            int var97 = arg4 + var96;
                            if (var95 < 0) {
                                var95 = 0;
                            } else if (var95 > 7) {
                                var95 = 7;
                            }
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field2289[var90] = (short) class410.method2621(class410.method2621(var94 << 10, var95 << 7), var97);
                        }
                        if (var88.length > 0 && this.field2251 != null) {
                            this.field2251.field1022 = null;
                        }
                    }
                }
                if (this.field2262 != null) {
                    for (int var84 = 0; var84 < this.field2256; var84++) {
                        class94 var85 = this.field2262[var84];
                        class92 var86 = this.field2270[var84];
                        var86.field1339 = class301.field4730[this.field2289[var85.field1368] & 0xFFFF] & 0xFFFFFF | var86.field1339 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field2242 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field2242.length > var99) {
                        int[] var100 = this.field2242[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class92 var102 = this.field2270[var100[var101]];
                            var102.field1349 += arg3;
                            var102.field1344 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field2242 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field2242.length) {
                        int[] var105 = this.field2242[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class92 var107 = this.field2270[var105[var106]];
                            var107.field1340 = var107.field1340 * arg2 >> 7;
                            var107.field1341 = var107.field1341 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field2242 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field2242.length) {
                    int[] var110 = this.field2242[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class92 var112 = this.field2270[var110[var111]];
                        var112.field1343 = var112.field1343 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "()Z")
    public final boolean method306() {
        field2199++;
        if (this.field2248 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field2248.length; var1++) {
            if (this.field2248[var1] != -1 && !this.field2208.field7480.method1364((byte) 53, this.field2248[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!to", name = "RA", descriptor = "()I")
    public final int method308() {
        field2227++;
        return this.field2231;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IFLfc;IIJIFII)S")
    private final short method980(int arg0, float arg1, class438 arg2, int arg3, int arg4, long arg5, int arg6, float arg7, int arg8, int arg9) {
        field2266++;
        int var12 = this.field2205[arg6];
        int var13 = this.field2205[arg6 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field2260[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class285.field4500[var15] == arg5) {
                return (short) (var16 - 1);
            }
        }
        this.field2260[var14] = (short) (this.field2279 + 1);
        class285.field4500[var14] = arg5;
        this.field2230[this.field2279] = (short) arg9;
        this.field2276[this.field2279] = (short) arg4;
        int var17 = 7 / ((-arg0 - 29) / 54);
        this.field2213[this.field2279] = (short) arg3;
        this.field2228[this.field2279] = (byte) arg8;
        this.field2236[this.field2279] = arg1;
        this.field2306[this.field2279] = arg7;
        return (short) (this.field2279++);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(III)V")
    public final void method325(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2222; var4++) {
            if (arg0 != 0) {
                this.field2283[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field2249[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field2217[var4] += arg2;
            }
        }
        field2307++;
        this.field2258 = false;
        if (this.field2280 != null) {
            this.field2280.field1022 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "()[Lvc;")
    public final class100[] method326() {
        field2254++;
        return this.field2302;
    }

    @OriginalMember(owner = "client!to", name = "pa", descriptor = "()I")
    public final int method287() {
        field2271++;
        return this.field2282;
    }

    @OriginalMember(owner = "client!to", name = "A", descriptor = "(I)V")
    public final void method317(int arg0) {
        this.field2282 = (short) arg0;
        field2239++;
        if (this.field2251 != null) {
            this.field2251.field1022 = null;
        }
        if (this.field2240 != null) {
            this.field2240.field1022 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "n", descriptor = "(III)V")
    public final void method269(int arg0, int arg1, int arg2) {
        field2295++;
        for (int var4 = 0; var4 < this.field2222; var4++) {
            if (arg0 != 128) {
                this.field2283[var4] = this.field2283[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field2249[var4] = this.field2249[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field2217[var4] = this.field2217[var4] * arg2 >> 7;
            }
        }
        this.field2258 = false;
        if (this.field2280 != null) {
            this.field2280.field1022 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "u", descriptor = "(SS)V")
    public final void method273(short arg0, short arg1) {
        field2241++;
        class199 var3 = this.field2208.field7480;
        for (int var4 = 0; var4 < this.field2221; var4++) {
            if (this.field2248[var4] == arg0) {
                this.field2248[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class476 var7 = var3.method1366(arg0 & 0xFFFF, (byte) 45);
            var5 = var7.field7284;
            var6 = var7.field7273;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class476 var10 = var3.method1366(arg1 & 0xFFFF, (byte) -6);
            var9 = var10.field7273;
            var8 = var10.field7284;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field2262 != null) {
            for (int var11 = 0; var11 < this.field2256; var11++) {
                class94 var12 = this.field2262[var11];
                class92 var13 = this.field2270[var11];
                var13.field1339 = class301.field4730[this.field2289[var12.field1368] & 0xFFFF] & 0xFFFFFF | var13.field1339 & 0xFF000000;
            }
        }
        if (this.field2251 != null) {
            this.field2251.field1022 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(B)V")
    private final void method981(byte arg0) {
        field2204++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        if (arg0 > -63) {
            return;
        }
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2222; var10++) {
            int var11 = this.field2283[var10];
            int var12 = this.field2249[var10];
            if (var12 < var3) {
                var3 = var12;
            }
            if (var6 < var12) {
                var6 = var12;
            }
            if (var2 > var11) {
                var2 = var11;
            }
            int var13 = this.field2217[var10];
            if (var5 < var11) {
                var5 = var11;
            }
            if (var7 < var13) {
                var7 = var13;
            }
            if (var4 > var13) {
                var4 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var8 < var14) {
                var8 = var14;
            }
            int var15 = var11 * var11 + var13 * var13 + (var12 * var12);
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field2269 = (short) var4;
        this.field2220 = (short) var3;
        this.field2209 = (short) var5;
        this.field2300 = (short) var7;
        this.field2203 = (short) var6;
        this.field2257 = (short) var2;
        this.field2201 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        Math.sqrt((double) var9);
        this.field2258 = true;
    }

    @OriginalMember(owner = "client!to", name = "Y", descriptor = "()I")
    public final int method323() {
        field2198++;
        return this.field2304;
    }

    @OriginalMember(owner = "client!to", name = "B", descriptor = "()I")
    public final int method305() {
        field2275++;
        if (!this.field2258) {
            this.method981((byte) -117);
        }
        return this.field2220;
    }

    @OriginalMember(owner = "client!to", name = "za", descriptor = "(IIII)V")
    public final void method302(int arg0, int arg1, int arg2, int arg3) {
        field2263++;
        if (arg0 == 0) {
            int var5 = 0;
            class491.field7437 = 0;
            class136.field1876 = 0;
            class184.field2681 = 0;
            for (int var6 = 0; var6 < this.field2222; var6++) {
                class184.field2681 += this.field2283[var6];
                class491.field7437 += this.field2249[var6];
                class136.field1876 += this.field2217[var6];
                var5++;
            }
            if (var5 > 0) {
                class184.field2681 = class184.field2681 / var5 + arg1;
                class491.field7437 = class491.field7437 / var5 + arg2;
                class136.field1876 = class136.field1876 / var5 + arg3;
            } else {
                class491.field7437 = arg2;
                class184.field2681 = arg1;
                class136.field1876 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field2222; var7++) {
                this.field2283[var7] += arg1;
                this.field2249[var7] += arg2;
                this.field2217[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field2222; var8++) {
                this.field2283[var8] -= class184.field2681;
                this.field2249[var8] -= class491.field7437;
                this.field2217[var8] -= class136.field1876;
                if (arg3 != 0) {
                    int var9 = class147.field1988[arg3];
                    int var10 = class147.field1986[arg3];
                    int var11 = this.field2249[var8] * var9 + (this.field2283[var8] * var10) + 32767 >> 15;
                    this.field2249[var8] = this.field2249[var8] * var10 + 32767 - (this.field2283[var8] * var9) >> 15;
                    this.field2283[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class147.field1988[arg1];
                    int var13 = class147.field1986[arg1];
                    int var14 = this.field2249[var8] * var13 + 32767 - this.field2217[var8] * var12 >> 15;
                    this.field2217[var8] = this.field2249[var8] * var12 - (-(this.field2217[var8] * var13) - 32767) >> 15;
                    this.field2249[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class147.field1988[arg2];
                    int var16 = class147.field1986[arg2];
                    int var17 = this.field2217[var8] * var15 + (this.field2283[var8] * var16) + 32767 >> 15;
                    this.field2217[var8] = this.field2217[var8] * var16 + 32767 - (this.field2283[var8] * var15) >> 15;
                    this.field2283[var8] = var17;
                }
                this.field2283[var8] += class184.field2681;
                this.field2249[var8] += class491.field7437;
                this.field2217[var8] += class136.field1876;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field2222; var18++) {
                this.field2283[var18] -= class184.field2681;
                this.field2249[var18] -= class491.field7437;
                this.field2217[var18] -= class136.field1876;
                this.field2283[var18] = this.field2283[var18] * arg1 / 128;
                this.field2249[var18] = this.field2249[var18] * arg2 / 128;
                this.field2217[var18] = this.field2217[var18] * arg3 / 128;
                this.field2283[var18] += class184.field2681;
                this.field2249[var18] += class491.field7437;
                this.field2217[var18] += class136.field1876;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field2221; var19++) {
                int var23 = (this.field2259[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field2259[var19] = (byte) var23;
            }
            if (this.field2251 != null) {
                this.field2251.field1022 = null;
            }
            if (this.field2262 != null) {
                for (int var20 = 0; var20 < this.field2256; var20++) {
                    class94 var21 = this.field2262[var20];
                    class92 var22 = this.field2270[var20];
                    var22.field1339 = 255 - (this.field2259[var21.field1368] & 0xFF) << 24 | var22.field1339 & 0xFFFFFF;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field2221; var24++) {
                int var28 = this.field2289[var24] & 0xFFFF;
                int var29 = (var28 & 0xFE41) >> 10;
                int var30 = var28 >> 7 & 0x7;
                int var31 = var28 & 0x7F;
                int var32 = arg2 / 4 + var30;
                int var33 = arg1 + var29 & 0x3F;
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 7) {
                    var32 = 7;
                }
                int var34 = arg3 + var31;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field2289[var24] = (short) class410.method2621(class410.method2621(var33 << 10, var32 << 7), var34);
            }
            if (this.field2251 != null) {
                this.field2251.field1022 = null;
            }
            if (this.field2262 != null) {
                for (int var25 = 0; var25 < this.field2256; var25++) {
                    class94 var26 = this.field2262[var25];
                    class92 var27 = this.field2270[var25];
                    var27.field1339 = class301.field4730[this.field2289[var26.field1368] & 0xFFFF] & 0xFFFFFF | var27.field1339 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field2256; var35++) {
                class92 var36 = this.field2270[var35];
                var36.field1344 += arg1;
                var36.field1349 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field2256; var37++) {
                class92 var38 = this.field2270[var37];
                var38.field1341 = var38.field1341 * arg2 >> 7;
                var38.field1340 = var38.field1340 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field2256; var39++) {
                class92 var40 = this.field2270[var39];
                var40.field1343 = var40.field1343 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I[IIIII[IIZIILsj;III)I")
    public static final int method982(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, boolean arg8, int arg9, int arg10, class284 arg11, int arg12, int arg13, int arg14) {
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class258.field4160[var15][var35] = 0;
                class418.field6347[var15][var35] = 99999999;
            }
        }
        field2214++;
        boolean var16;
        if (arg7 == 1) {
            var16 = class343.method2274(arg4, arg11, arg10, arg5, (byte) 123, arg0, arg14, arg2, arg12, arg3, arg9);
        } else if (arg7 == 2) {
            var16 = class146.method876(arg9, arg2, arg4, arg5, arg0, (byte) -112, arg10, arg3, arg11, arg12, arg14);
        } else {
            var16 = class162.method1024(arg11, arg7, arg5, arg9, -16491, arg12, arg0, arg2, arg3, arg10, arg14, arg4);
        }
        int var17 = arg9 - 64;
        int var18 = arg5 - 64;
        int var19 = class300.field4716;
        int var20 = class525.field7746;
        if (!var16) {
            if (!arg8) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg2 - var23; var24 <= (arg2 + var23); var24++) {
                for (int var25 = arg12 - var23; var25 <= arg12 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class418.field6347[var26][var27] < 100) {
                        int var28 = 0;
                        if (var24 < arg2) {
                            var28 = arg2 - var24;
                        } else if ((arg2 + arg10 - 1) < var24) {
                            var28 = 1 - (arg2 + arg10 - var24);
                        }
                        int var29 = 0;
                        if (arg12 > var25) {
                            var29 = arg12 - var25;
                        } else if (var25 > (arg3 + arg12 - 1)) {
                            var29 = var25 + 1 - arg12 - arg3;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var21 || var21 == var30 && class418.field6347[var26][var27] < var22) {
                            var22 = class418.field6347[var26][var27];
                            var21 = var30;
                            var19 = var24;
                            var20 = var25;
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg9 == var19 && arg5 == var20) {
            return 0;
        }
        byte var31 = 0;
        class21.field248[var31] = var19;
        int var37 = var31 + 1;
        class299.field4713[var31] = var20;
        if (arg13 >= -109) {
            field2250 = 0.8245693F;
        }
        int var32;
        int var33 = var32 = class258.field4160[var19 - var17][var20 - var18];
        while (arg9 != var19 || arg5 != var20) {
            if (var32 != var33) {
                class21.field248[var37] = var19;
                var32 = var33;
                class299.field4713[var37++] = var20;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            var33 = class258.field4160[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while (var37-- > 0) {
            arg6[var34] = class21.field248[var37];
            arg1[var34++] = class299.field4713[var37];
            if (arg6.length <= var34) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!to", name = "C", descriptor = "(I)V")
    public final void method275(int arg0) {
        field2267++;
        int var2 = class147.field1988[arg0];
        int var3 = class147.field1986[arg0];
        for (int var4 = 0; var4 < this.field2222; var4++) {
            int var7 = this.field2217[var4] * var2 + (this.field2283[var4] * var3) >> 15;
            this.field2217[var4] = this.field2217[var4] * var3 - (this.field2283[var4] * var2) >> 15;
            this.field2283[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field2279; var5++) {
            int var6 = this.field2230[var5] * var3 + this.field2213[var5] * var2 >> 15;
            this.field2213[var5] = (short) (this.field2213[var5] * var3 - (this.field2230[var5] * var2) >> 15);
            this.field2230[var5] = (short) var6;
        }
        if (this.field2240 == null && this.field2251 != null) {
            this.field2251.field1022 = null;
        }
        if (this.field2240 != null) {
            this.field2240.field1022 = null;
        }
        this.field2258 = false;
        if (this.field2280 != null) {
            this.field2280.field1022 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BZ)V")
    private final void method983(byte arg0, boolean arg1) {
        field2211++;
        if (this.field2208.field3617.field3193.length >= this.field2253 * 6) {
            this.field2208.field3617.field3162 = 0;
        } else {
            this.field2208.field3617 = new class302((this.field2253 + 100) * 6);
        }
        class302 var3 = this.field2208.field3617;
        if (this.field2208.field3560) {
            for (int var5 = 0; var5 < this.field2253; var5++) {
                var3.method1437(this.field2281[var5], 0);
                var3.method1437(this.field2212[var5], 0);
                var3.method1437(this.field2293[var5], 0);
            }
        } else {
            for (int var4 = 0; var4 < this.field2253; var4++) {
                var3.method1467((byte) 23, this.field2281[var4]);
                var3.method1467((byte) 23, this.field2212[var4]);
                var3.method1467((byte) 23, this.field2293[var4]);
            }
        }
        if (var3.field3162 == 0) {
            return;
        }
        if (arg0 <= 50) {
            this.method273((short) -80, (short) 121);
        }
        if (arg1) {
            if (this.field2290 == null) {
                this.field2290 = this.field2208.method1514(var3.field3162, 16711680, 5123, true, var3.field3193);
            } else {
                this.field2290.method747(24519, var3.field3162, var3.field3193, 5123);
            }
            this.field2216.field4146 = this.field2290;
        } else {
            this.field2216.field4146 = this.field2208.method1514(var3.field3162, 16711680, 5123, false, var3.field3193);
        }
        if (!arg1) {
            this.field2255 = true;
        }
    }

    @OriginalMember(owner = "client!to", name = "KA", descriptor = "()V")
    public final void method328() {
        field2305++;
        for (int var1 = 0; var1 < this.field2233; var1++) {
            this.field2283[var1] = this.field2283[var1] + 7 >> 4;
            this.field2249[var1] = this.field2249[var1] + 7 >> 4;
            this.field2217[var1] = this.field2217[var1] + 7 >> 4;
        }
        this.field2258 = false;
        if (this.field2280 != null) {
            this.field2280.field1022 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lc;Lkk;II)V")
    public final void method313(class205 arg0, class182 arg1, int arg2, int arg3) {
        field2215++;
        if (this.field2279 == 0) {
            return;
        }
        class89 var5 = this.field2208.field3585;
        if (!this.field2258) {
            this.method981((byte) -70);
        }
        class89 var6 = (class89) arg0;
        class268.field4299 = var5.field1299 * var6.field1287 + var5.field1310 * var6.field1307 + var5.field1297 * var6.field1288 + var5.field1287;
        class236.field3875 = var5.field1299 * var6.field1310 + var5.field1310 * var6.field1305 + var5.field1297 * var6.field1289;
        float var7 = (float) this.field2220 * class236.field3875 + class268.field4299;
        float var8 = (float) this.field2203 * class236.field3875 + class268.field4299;
        float var9;
        float var10;
        if ((var8 < var7)) {
            var10 = (float) this.field2201 + var7;
            var9 = var8 - (float) this.field2201;
        } else {
            var9 = var7 - (float) this.field2201;
            var10 = (float) this.field2201 + var8;
        }
        if ((this.field2208.field3615 <= var9) || ((float) this.field2208.field3550 >= var10)) {
            return;
        }
        class31.field326 = var5.field1292 * var6.field1287 + var5.field1296 * var6.field1288 + var5.field1289 * var6.field1307 + var5.field1288;
        class189.field2746 = var5.field1292 * var6.field1310 + var5.field1296 * var6.field1289 + var5.field1289 * var6.field1305;
        float var11 = (float) this.field2220 * class189.field2746 + class31.field326;
        float var12 = (float) this.field2203 * class189.field2746 + class31.field326;
        float var13;
        float var14;
        if (var12 < var11) {
            var13 = (var12 - (float) this.field2201) * (float) this.field2208.field3579;
            var14 = ((float) this.field2201 + var11) * (float) this.field2208.field3579;
        } else {
            var14 = ((float) this.field2201 + var12) * (float) this.field2208.field3579;
            var13 = (var11 - (float) this.field2201) * (float) this.field2208.field3579;
        }
        if ((var13 / (float) arg2 >= this.field2208.field3567) || (this.field2208.field3514 >= var14 / (float) arg2)) {
            return;
        }
        class301.field4726 = var5.field1312 * var6.field1310 + var5.field1305 * var6.field1305 + var5.field1301 * var6.field1289;
        class95.field1388 = var5.field1312 * var6.field1287 + var5.field1305 * var6.field1307 + var5.field1301 * var6.field1288 + var5.field1307;
        float var15 = (float) this.field2220 * class301.field4726 + class95.field1388;
        float var16 = (float) this.field2203 * class301.field4726 + class95.field1388;
        float var17;
        float var18;
        if ((var15 > var16)) {
            var18 = ((float) (-this.field2201) + var16) * (float) this.field2208.field3591;
            var17 = ((float) this.field2201 + var15) * (float) this.field2208.field3591;
        } else {
            var17 = ((float) this.field2201 + var16) * (float) this.field2208.field3591;
            var18 = ((float) (-this.field2201) + var15) * (float) this.field2208.field3591;
        }
        if ((this.field2208.field3540 <= var18 / (float) arg2) || (var17 / (float) arg2 <= this.field2208.field3519)) {
            return;
        }
        if (arg1 != null || this.field2262 != null) {
            class392.field5949 = var5.field1292 * var6.field1297 + var5.field1296 * var6.field1296 + var5.field1289 * var6.field1301;
            class227.field3790 = var5.field1299 * var6.field1299 + var5.field1310 * var6.field1312 + var5.field1297 * var6.field1292;
            class119.field1630 = var5.field1312 * var6.field1299 + var5.field1305 * var6.field1312 + var5.field1301 * var6.field1292;
            class330.field5184 = var5.field1292 * var6.field1299 + var5.field1296 * var6.field1292 + var5.field1289 * var6.field1312;
            class471.field7199 = var5.field1312 * var6.field1297 + var5.field1305 * var6.field1301 + var5.field1301 * var6.field1296;
            class166.field2421 = var5.field1299 * var6.field1297 + var5.field1310 * var6.field1301 + var5.field1297 * var6.field1296;
        }
        if (arg1 != null) {
            int var19 = this.field2257 + this.field2209 >> 1;
            int var20 = this.field2269 + this.field2300 >> 1;
            int var21 = (int) ((float) var20 * class330.field5184 + (float) this.field2220 * class189.field2746 + (float) var19 * class392.field5949 + class31.field326);
            int var22 = (int) ((float) var20 * class119.field1630 + (float) this.field2220 * class301.field4726 + (float) var19 * class471.field7199 + class95.field1388);
            int var23 = (int) ((float) var20 * class227.field3790 + (float) this.field2220 * class236.field3875 + (float) var19 * class166.field2421 + class268.field4299);
            int var24 = (int) ((float) var20 * class330.field5184 + (float) this.field2203 * class189.field2746 + (float) var19 * class392.field5949 + class31.field326);
            int var25 = (int) ((float) var20 * class119.field1630 + (float) this.field2203 * class301.field4726 + (float) var19 * class471.field7199 + class95.field1388);
            int var26 = (int) ((float) var20 * class227.field3790 + (float) this.field2203 * class236.field3875 + (float) var19 * class166.field2421 + class268.field4299);
            arg1.field2645 = this.field2208.field3591 * var25 / arg2 + this.field2208.field3538;
            arg1.field2642 = this.field2208.field3520 + (this.field2208.field3579 * var24 / arg2);
            arg1.field2644 = this.field2208.field3579 * var21 / arg2 + this.field2208.field3520;
            arg1.field2640 = this.field2208.field3591 * var22 / arg2 + this.field2208.field3538;
            if (var23 < this.field2208.field3550 && this.field2208.field3550 > var26) {
                arg1.field2641 = this.field2208.field3520 + ((this.field2201 + var21) * this.field2208.field3579 / arg2) - arg1.field2644;
                arg1.field2643 = true;
            }
        }
        this.field2208.method1557((float) arg2, -23);
        this.field2208.method1542(16);
        this.field2208.method1501(var6, -21399);
        this.method979(0);
        this.field2208.method1541(-123);
        this.method978((byte) 42);
    }

    @OriginalMember(owner = "client!to", name = "da", descriptor = "(IILya;Lya;III)V")
    public final void method307(int arg0, int arg1, class223 arg2, class223 arg3, int arg4, int arg5, int arg6) {
        if (!this.field2258) {
            this.method981((byte) -81);
        }
        field2244++;
        int var8 = this.field2257 + arg4;
        int var9 = this.field2209 + arg4;
        int var10 = this.field2269 + arg6;
        int var11 = this.field2300 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field3754 + var9 >> arg2.field3753 >= arg2.field3755 || var10 < 0 || arg2.field3754 + var11 >> arg2.field3753 >= arg2.field3752) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field3755 <= var9 + arg3.field3754 >> arg3.field3753 || var10 < 0 || (arg3.field3754 + var11 >> arg3.field3753) >= arg3.field3752) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field3753;
            int var13 = -(-arg2.field3754 - var9) - 1 >> arg2.field3753;
            int var14 = var10 >> arg2.field3753;
            int var15 = var11 - (1 - arg2.field3754) >> arg2.field3753;
            if (arg2.method688(var12, var14) == arg5 && arg2.method688(var13, var14) == arg5 && arg5 == arg2.method688(var12, var15) && arg2.method688(var13, var15) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field2222; var16++) {
                this.field2249[var16] = (this.field2249[var16] + arg2.method692(this.field2283[var16] + arg4, this.field2217[var16] + arg6)) - arg5;
            }
        } else if (arg0 == 2) {
            short var30 = this.field2220;
            if (var30 == 0) {
                return;
            }
            for (int var31 = 0; var31 < this.field2222; var31++) {
                int var32 = (this.field2249[var31] << 16) / var30;
                if (arg1 > var32) {
                    this.field2249[var31] += (arg2.method692(this.field2283[var31] + arg4, this.field2217[var31] + arg6) - arg5) * (arg1 - var32) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var17 = (arg1 & 0xFF) * 4;
            int var18 = ((arg1 & 0xFF7F) >> 8) * 4;
            int var19 = arg1 >> 16 & 0xFF << 6;
            int var20 = arg1 >> 24 & 0xFF << 6;
            if ((arg4 - (var17 >> 1)) < 0 || (arg2.field3755 << arg2.field3753) <= ((var17 >> 1) + (arg4 + arg2.field3754)) || arg6 - (var18 >> 1) < 0 || arg2.field3752 << arg2.field3753 <= (var18 >> 1) + arg6 + arg2.field3754) {
                return;
            }
            this.method3175(var19, var20, 2196, arg6, arg4, arg5, var18, arg2, var17);
        } else if (arg0 == 4) {
            int var21 = this.field2203 - this.field2220;
            for (int var22 = 0; var22 < this.field2222; var22++) {
                this.field2249[var22] = var21 + (this.field2249[var22] - (arg5 - arg3.method692(this.field2283[var22] + arg4, this.field2217[var22] + arg6)));
            }
        } else if (arg0 == 5) {
            int var23 = this.field2203 - this.field2220;
            for (int var24 = 0; var24 < this.field2222; var24++) {
                int var25 = this.field2283[var24] + arg4;
                int var26 = this.field2217[var24] + arg6;
                int var27 = arg2.method692(var25, var26);
                int var28 = arg3.method692(var25, var26);
                int var29 = var27 - var28;
                this.field2249[var24] = ((this.field2249[var24] << 8) / var23 * var29 >> 8) + var27 - arg5;
            }
        }
        this.field2258 = false;
        if (this.field2280 != null) {
            this.field2280.field1022 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "q", descriptor = "(SS)V")
    public final void method309(short arg0, short arg1) {
        field2297++;
        for (int var3 = 0; var3 < this.field2221; var3++) {
            if (this.field2289[var3] == arg0) {
                this.field2289[var3] = arg1;
            }
        }
        if (this.field2262 != null) {
            for (int var4 = 0; var4 < this.field2256; var4++) {
                class94 var5 = this.field2262[var4];
                class92 var6 = this.field2270[var4];
                var6.field1339 = var6.field1339 & 0xFF000000 | class301.field4730[this.field2289[var5.field1368] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field2251 != null) {
            this.field2251.field1022 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "k", descriptor = "()I")
    public final int method289() {
        if (!this.field2258) {
            this.method981((byte) -120);
        }
        field2286++;
        return this.field2201;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lc;Lkk;I)V")
    public final void method295(class205 arg0, class182 arg1, int arg2) {
        field2246++;
        if (this.field2279 == 0) {
            return;
        }
        class89 var4 = this.field2208.field3585;
        class89 var5 = (class89) arg0;
        if (!this.field2258) {
            this.method981((byte) -81);
        }
        this.method987(1894387656, var5);
        class236.field3875 = var4.field1299 * var5.field1310 + var4.field1310 * var5.field1305 + var4.field1297 * var5.field1289;
        class268.field4299 = var4.field1299 * var5.field1287 + var4.field1310 * var5.field1307 + var4.field1297 * var5.field1288 + var4.field1287;
        float var6 = (float) this.field2220 * class236.field3875 + class268.field4299;
        float var7 = (float) this.field2203 * class236.field3875 + class268.field4299;
        float var8;
        float var9;
        if ((var6 > var7)) {
            var8 = (float) (-this.field2201) + var7;
            var9 = (float) this.field2201 + var6;
        } else {
            var8 = (float) (-this.field2201) + var6;
            var9 = (float) this.field2201 + var7;
        }
        if ((this.field2208.field3597 <= var8) || (var9 <= (float) this.field2208.field3550)) {
            return;
        }
        class189.field2746 = var4.field1292 * var5.field1310 + var4.field1296 * var5.field1289 + var4.field1289 * var5.field1305;
        class31.field326 = var4.field1292 * var5.field1287 + var4.field1296 * var5.field1288 + var4.field1289 * var5.field1307 + var4.field1288;
        float var10 = (float) this.field2220 * class189.field2746 + class31.field326;
        float var11 = (float) this.field2203 * class189.field2746 + class31.field326;
        float var12;
        float var13;
        if (var10 > var11) {
            var12 = ((float) this.field2201 + var10) * (float) this.field2208.field3579;
            var13 = (var11 - (float) this.field2201) * (float) this.field2208.field3579;
        } else {
            var13 = (var10 - (float) this.field2201) * (float) this.field2208.field3579;
            var12 = ((float) this.field2201 + var11) * (float) this.field2208.field3579;
        }
        if ((this.field2208.field3567 <= var13 / var9) || (var12 / var9 <= this.field2208.field3514)) {
            return;
        }
        class301.field4726 = var4.field1312 * var5.field1310 + var4.field1305 * var5.field1305 + var4.field1301 * var5.field1289;
        class95.field1388 = var4.field1312 * var5.field1287 + var4.field1305 * var5.field1307 + var4.field1301 * var5.field1288 + var4.field1307;
        float var14 = (float) this.field2220 * class301.field4726 + class95.field1388;
        float var15 = (float) this.field2203 * class301.field4726 + class95.field1388;
        float var16;
        float var17;
        if ((var14 > var15)) {
            var16 = ((float) this.field2201 + var14) * (float) this.field2208.field3591;
            var17 = ((float) (-this.field2201) + var15) * (float) this.field2208.field3591;
        } else {
            var16 = ((float) this.field2201 + var15) * (float) this.field2208.field3591;
            var17 = (var14 - (float) this.field2201) * (float) this.field2208.field3591;
        }
        if ((var17 / var9 >= this.field2208.field3540) || (this.field2208.field3519 >= var16 / var9)) {
            return;
        }
        if (arg1 != null || this.field2262 != null) {
            class471.field7199 = var4.field1312 * var5.field1297 + var4.field1305 * var5.field1301 + var4.field1301 * var5.field1296;
            class330.field5184 = var4.field1292 * var5.field1299 + var4.field1296 * var5.field1292 + var4.field1289 * var5.field1312;
            class166.field2421 = var4.field1299 * var5.field1297 + var4.field1310 * var5.field1301 + var4.field1297 * var5.field1296;
            class392.field5949 = var4.field1292 * var5.field1297 + var4.field1296 * var5.field1296 + var4.field1289 * var5.field1301;
            class227.field3790 = var4.field1299 * var5.field1299 + var4.field1310 * var5.field1312 + var4.field1297 * var5.field1292;
            class119.field1630 = var4.field1312 * var5.field1299 + var4.field1305 * var5.field1312 + var4.field1301 * var5.field1292;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field2257 + this.field2209 >> 1;
            int var21 = this.field2300 + this.field2269 >> 1;
            int var22 = (int) ((float) var21 * class330.field5184 + (float) this.field2220 * class189.field2746 + (float) var20 * class392.field5949 + class31.field326);
            int var23 = (int) ((float) var21 * class119.field1630 + (float) this.field2220 * class301.field4726 + (float) var20 * class471.field7199 + class95.field1388);
            int var24 = (int) ((float) var21 * class227.field3790 + (float) this.field2220 * class236.field3875 + (float) var20 * class166.field2421 + class268.field4299);
            if (var24 < this.field2208.field3550) {
                var18 = true;
            } else {
                arg1.field2644 = this.field2208.field3520 + (this.field2208.field3579 * var22 / var24);
                arg1.field2640 = this.field2208.field3591 * var23 / var24 + this.field2208.field3538;
            }
            int var25 = (int) ((float) var21 * class330.field5184 + (float) this.field2203 * class189.field2746 + (float) var20 * class392.field5949 + class31.field326);
            int var26 = (int) ((float) var21 * class119.field1630 + (float) this.field2203 * class301.field4726 + (float) var20 * class471.field7199 + class95.field1388);
            int var27 = (int) ((float) var21 * class227.field3790 + (float) this.field2203 * class236.field3875 + (float) var20 * class166.field2421 + class268.field4299);
            if (this.field2208.field3550 <= var27) {
                arg1.field2645 = this.field2208.field3591 * var26 / var27 + this.field2208.field3538;
                arg1.field2642 = this.field2208.field3520 + (this.field2208.field3579 * var25 / var27);
            } else {
                var18 = true;
            }
            if (var18) {
                if (var24 < this.field2208.field3550 && var27 < this.field2208.field3550) {
                    var19 = false;
                } else if (this.field2208.field3550 > var24) {
                    int var31 = (var27 - this.field2208.field3550 << 16) / (var27 - var24);
                    int var32 = ((var25 - var22) * var31 >> 16) + var25;
                    int var33 = var26 + ((var26 - var23) * var31 >> 16);
                    arg1.field2644 = this.field2208.field3579 * var32 / this.field2208.field3550 + this.field2208.field3520;
                    arg1.field2640 = this.field2208.field3538 + (this.field2208.field3591 * var33 / this.field2208.field3550);
                } else if (var27 < this.field2208.field3550) {
                    int var28 = (var24 - this.field2208.field3550 << 16) / (var24 - var27);
                    int var29 = var22 + ((var22 - var25) * var28 >> 16);
                    arg1.field2644 = this.field2208.field3579 * var29 / this.field2208.field3550 + this.field2208.field3520;
                    int var30 = var23 + ((var23 - var26) * var28 >> 16);
                    arg1.field2640 = this.field2208.field3591 * var30 / this.field2208.field3550 + this.field2208.field3538;
                }
            }
            if (var19) {
                if (var27 < var24) {
                    arg1.field2641 = (this.field2201 + var22) * this.field2208.field3579 / var24 + this.field2208.field3520 - arg1.field2644;
                } else {
                    arg1.field2641 = this.field2208.field3520 - (arg1.field2642 - ((this.field2201 + var25) * this.field2208.field3579 / var27));
                }
                arg1.field2643 = true;
            }
        }
        this.field2208.method1559(-15631);
        this.field2208.method1501(var5, -21399);
        this.method979(0);
        this.field2208.method1541(-125);
        this.method978((byte) -126);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ZB)V")
    private final void method984(boolean arg0, byte arg1) {
        field2223++;
        boolean var3 = this.field2251 != null && this.field2251.field1022 == null;
        boolean var4 = this.field2240 != null && this.field2240.field1022 == null;
        boolean var5 = this.field2280 != null && this.field2280.field1022 == null;
        boolean var6 = this.field2245 != null && this.field2245.field1022 == null;
        if (arg0) {
            var6 &= (this.field2291 & 0x8) != 0;
            var4 &= (this.field2291 & 0x4) != 0;
            var5 &= (this.field2291 & 0x1) != 0;
            var3 &= (this.field2291 & 0x2) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        byte var10 = 0;
        byte var11 = 0;
        if (var5) {
            var8 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var3) {
            var9 = var7;
            var7 = (byte) (var7 + 4);
        }
        if (var4) {
            var10 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var6) {
            var11 = var7;
            var7 = (byte) (var7 + 8);
        }
        if (var7 == 0) {
            return;
        }
        if (this.field2208.field3617.field3193.length >= this.field2279 * var7) {
            this.field2208.field3617.field3162 = 0;
        } else {
            this.field2208.field3617 = new class302((this.field2279 + 100) * var7);
        }
        class302 var12 = this.field2208.field3617;
        if (var5) {
            if (this.field2208.field3560) {
                for (int var13 = 0; var13 < this.field2222; var13++) {
                    int var14 = NativeStream.floatToRawIntBits((float) this.field2283[var13]);
                    int var15 = NativeStream.floatToRawIntBits((float) this.field2249[var13]);
                    int var16 = NativeStream.floatToRawIntBits((float) this.field2217[var13]);
                    int var17 = this.field2205[var13];
                    int var18 = this.field2205[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field2260[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field3162 = var7 * var20;
                        var12.method1477(65280, var14);
                        var12.method1477(65280, var15);
                        var12.method1477(65280, var16);
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field2222; var21++) {
                    int var22 = NativeStream.floatToRawIntBits((float) this.field2283[var21]);
                    int var23 = NativeStream.floatToRawIntBits((float) this.field2249[var21]);
                    int var24 = NativeStream.floatToRawIntBits((float) this.field2217[var21]);
                    int var25 = this.field2205[var21];
                    int var26 = this.field2205[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field2260[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field3162 = var7 * var28;
                        var12.method1462(var22, (byte) -103);
                        var12.method1462(var23, (byte) -50);
                        var12.method1462(var24, (byte) -114);
                    }
                }
            }
        }
        if (var3) {
            if (this.field2240 == null) {
                short[] var29;
                byte[] var30;
                short[] var31;
                short[] var32;
                if (this.field2226 == null) {
                    var29 = this.field2276;
                    var30 = this.field2228;
                    var31 = this.field2213;
                    var32 = this.field2230;
                } else {
                    var30 = this.field2226.field3857;
                    var32 = this.field2226.field3862;
                    var31 = this.field2226.field3855;
                    var29 = this.field2226.field3856;
                }
                float var33 = this.field2208.field3572[0];
                float var34 = this.field2208.field3572[1];
                float var35 = this.field2208.field3572[2];
                float var36 = this.field2208.field3613;
                float var37 = this.field2208.field3598 * 768.0F / (float) this.field2282;
                float var38 = this.field2208.field3558 * 768.0F / (float) this.field2282;
                for (int var39 = 0; var39 < this.field2221; var39++) {
                    int var40 = this.method989(this.field2248[var39], this.field2304, (byte) -110, this.field2259[var39], this.field2289[var39]);
                    float var41 = (float) (var40 >> 16 & 0xFF) * this.field2208.field3512;
                    short var42 = this.field2281[var39];
                    float var43 = (float) (var40 >>> 24) * this.field2208.field3611;
                    float var44 = (float) (var40 >> 8 & 0xFF) * this.field2208.field3539;
                    short var45 = (short) var30[var42];
                    float var46;
                    if (var45 == 0) {
                        var46 = ((float) var31[var42] * var35 + (float) var29[var42] * var34 + (float) var32[var42] * var33) * 0.0026041667F;
                    } else {
                        var46 = ((float) var31[var42] * var35 + (float) var29[var42] * var34 + (float) var32[var42] * var33) / (float) (var45 * 256);
                    }
                    float var47 = var46 * ((var46 < 0.0F) ? var38 : var37) + var36;
                    int var48 = (int) (var43 * var47);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    int var49 = (int) (var41 * var47);
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    int var50 = (int) (var44 * var47);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    var12.field3162 = var7 * var42 + var9;
                    var12.method1479((byte) -112, var48);
                    var12.method1479((byte) -122, var49);
                    var12.method1479((byte) -110, var50);
                    var12.method1479((byte) -124, 255 - (this.field2259[var39] & 0xFF));
                    short var51 = this.field2212[var39];
                    short var52 = (short) var30[var51];
                    float var53;
                    if (var52 == 0) {
                        var53 = ((float) var31[var51] * var35 + (float) var29[var51] * var34 + (float) var32[var51] * var33) * 0.0026041667F;
                    } else {
                        var53 = ((float) var31[var51] * var35 + (float) var29[var51] * var34 + (float) var32[var51] * var33) / (float) (var52 * 256);
                    }
                    float var54 = var36 + var53 * (var53 < 0.0F ? var38 : var37);
                    int var55 = (int) (var43 * var54);
                    int var56 = (int) (var41 * var54);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    int var57 = (int) (var44 * var54);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    var12.field3162 = var7 * var51 + var9;
                    var12.method1479((byte) -107, var55);
                    var12.method1479((byte) -119, var56);
                    var12.method1479((byte) -109, var57);
                    var12.method1479((byte) -111, 255 - (this.field2259[var39] & 0xFF));
                    short var58 = this.field2293[var39];
                    short var59 = (short) var30[var58];
                    float var60;
                    if (var59 == 0) {
                        var60 = ((float) var31[var58] * var35 + (float) var29[var58] * var34 + (float) var32[var58] * var33) * 0.0026041667F;
                    } else {
                        var60 = ((float) var31[var58] * var35 + (float) var29[var58] * var34 + (float) var32[var58] * var33) / (float) (var59 * 256);
                    }
                    float var61 = var60 * (var60 < 0.0F ? var38 : var37) + var36;
                    int var62 = (int) (var43 * var61);
                    int var63 = (int) (var41 * var61);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    int var64 = (int) (var44 * var61);
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    var12.field3162 = var7 * var58 + var9;
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    var12.method1479((byte) -121, var62);
                    var12.method1479((byte) -106, var63);
                    var12.method1479((byte) -118, var64);
                    var12.method1479((byte) -106, 255 - (this.field2259[var39] & 0xFF));
                }
            } else {
                for (int var65 = 0; var65 < this.field2221; var65++) {
                    int var66 = this.method989(this.field2248[var65], this.field2304, (byte) -110, this.field2259[var65], this.field2289[var65]);
                    var12.field3162 = this.field2281[var65] * var7 + var9;
                    var12.method1477(arg1 ^ 0xFF71, var66);
                    var12.field3162 = this.field2212[var65] * var7 + var9;
                    var12.method1477(65280, var66);
                    var12.field3162 = this.field2293[var65] * var7 + var9;
                    var12.method1477(65280, var66);
                }
            }
        }
        if (var4) {
            byte[] var67;
            short[] var68;
            short[] var69;
            short[] var70;
            if (this.field2226 == null) {
                var70 = this.field2213;
                var68 = this.field2230;
                var67 = this.field2228;
                var69 = this.field2276;
            } else {
                var67 = this.field2226.field3857;
                var68 = this.field2226.field3862;
                var69 = this.field2226.field3856;
                var70 = this.field2226.field3855;
            }
            float var71 = 3.0F / (float) this.field2282;
            float var72 = 3.0F / (float) (this.field2282 / 2 + this.field2282);
            var12.field3162 = var10;
            if (this.field2208.field3560) {
                for (int var73 = 0; var73 < this.field2279; var73++) {
                    int var74 = var67[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method2030((float) var68[var73] * var72, 9);
                        var12.method2030((float) var69[var73] * var72, 9);
                        var12.method2030((float) var70[var73] * var72, 9);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method2030((float) var68[var73] * var75, 9);
                        var12.method2030((float) var69[var73] * var75, arg1 - 104);
                        var12.method2030((float) var70[var73] * var75, arg1 ^ 0x78);
                    }
                    var12.field3162 += var7 - 12;
                }
            } else {
                for (int var76 = 0; var76 < this.field2279; var76++) {
                    int var77 = var67[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method2034((float) var68[var76] * var72, false);
                        var12.method2034((float) var69[var76] * var72, false);
                        var12.method2034((float) var70[var76] * var72, false);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method2034((float) var68[var76] * var78, false);
                        var12.method2034((float) var69[var76] * var78, false);
                        var12.method2034((float) var70[var76] * var78, false);
                    }
                    var12.field3162 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field3162 = var11;
            if (this.field2208.field3560) {
                for (int var79 = 0; var79 < this.field2279; var79++) {
                    var12.method2030(this.field2236[var79], 9);
                    var12.method2030(this.field2306[var79], arg1 ^ 0x78);
                    var12.field3162 += var7 - 8;
                }
            } else {
                for (int var80 = 0; var80 < this.field2279; var80++) {
                    var12.method2034(this.field2236[var80], false);
                    var12.method2034(this.field2306[var80], false);
                    var12.field3162 += var7 - 8;
                }
            }
        }
        if (arg1 != 113) {
            this.field2236 = null;
        }
        var12.field3162 = this.field2279 * var7;
        class383 var81;
        if (arg0) {
            if (this.field2294 == null) {
                this.field2294 = this.field2208.method1544(false, var7, var12.field3162, var12.field3193, true);
            } else {
                this.field2294.method134(var12.field3162, var7, (byte) 118, var12.field3193);
            }
            this.field2291 = 0;
            var81 = this.field2294;
        } else {
            var81 = this.field2208.method1544(false, var7, var12.field3162, var12.field3193, false);
            this.field2255 = true;
        }
        if (var5) {
            this.field2280.field1022 = var81;
            this.field2280.field1023 = var8;
        }
        if (var6) {
            this.field2245.field1023 = var11;
            this.field2245.field1022 = var81;
        }
        if (var3) {
            this.field2251.field1023 = var9;
            this.field2251.field1022 = var81;
        }
        if (var4) {
            this.field2240.field1023 = var10;
            this.field2240.field1022 = var81;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IILc;Z)Z")
    public final boolean method298(int arg0, int arg1, class205 arg2, boolean arg3) {
        field2237++;
        class89 var5 = (class89) arg2;
        class89 var6 = this.field2208.field3585;
        float var7 = var5.field1287 * var6.field1292 + var5.field1307 * var6.field1289 + var5.field1288 * var6.field1296 + var6.field1288;
        float var8 = var5.field1287 * var6.field1312 + var5.field1307 * var6.field1305 + var5.field1288 * var6.field1301 + var6.field1307;
        class392.field5949 = var5.field1297 * var6.field1292 + var5.field1301 * var6.field1289 + var5.field1296 * var6.field1296;
        class119.field1630 = var5.field1299 * var6.field1312 + var5.field1312 * var6.field1305 + var5.field1292 * var6.field1301;
        class227.field3790 = var5.field1299 * var6.field1299 + var5.field1312 * var6.field1310 + var5.field1292 * var6.field1297;
        float var9 = var5.field1287 * var6.field1299 + var5.field1307 * var6.field1310 + var5.field1288 * var6.field1297 + var6.field1287;
        class236.field3875 = var5.field1310 * var6.field1299 + var5.field1305 * var6.field1310 + var5.field1289 * var6.field1297;
        class330.field5184 = var5.field1299 * var6.field1292 + var5.field1312 * var6.field1289 + var5.field1292 * var6.field1296;
        class301.field4726 = var5.field1310 * var6.field1312 + var5.field1305 * var6.field1305 + var5.field1289 * var6.field1301;
        class189.field2746 = var5.field1310 * var6.field1292 + var5.field1305 * var6.field1289 + var5.field1289 * var6.field1296;
        class471.field7199 = var5.field1297 * var6.field1312 + var5.field1301 * var6.field1305 + var5.field1296 * var6.field1301;
        class166.field2421 = var5.field1297 * var6.field1299 + var5.field1301 * var6.field1310 + var5.field1296 * var6.field1297;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field2208.field3579;
        int var16 = this.field2208.field3591;
        if (!this.field2258) {
            this.method981((byte) -126);
        }
        class228.field3796[0] = this.field2257;
        class513.field7620[0] = this.field2220;
        class542.field7927[0] = this.field2269;
        class228.field3796[1] = this.field2209;
        class513.field7620[1] = this.field2220;
        class542.field7927[1] = this.field2269;
        class228.field3796[2] = this.field2257;
        class513.field7620[2] = this.field2203;
        class228.field3796[3] = this.field2209;
        class542.field7927[2] = this.field2269;
        class513.field7620[3] = this.field2203;
        class542.field7927[3] = this.field2269;
        class228.field3796[4] = this.field2257;
        class513.field7620[4] = this.field2220;
        class542.field7927[4] = this.field2300;
        class228.field3796[5] = this.field2209;
        class513.field7620[5] = this.field2220;
        class542.field7927[5] = this.field2300;
        class228.field3796[6] = this.field2257;
        class513.field7620[6] = this.field2203;
        class542.field7927[6] = this.field2300;
        class228.field3796[7] = this.field2209;
        class513.field7620[7] = this.field2203;
        class542.field7927[7] = this.field2300;
        for (int var17 = 0; var17 < 8; var17++) {
            float var38 = (float) class228.field3796[var17];
            float var39 = (float) class513.field7620[var17];
            float var40 = (float) class542.field7927[var17];
            float var41 = class330.field5184 * var40 + class392.field5949 * var38 + class189.field2746 * var39 + var7;
            float var42 = class119.field1630 * var40 + class471.field7199 * var38 + class301.field4726 * var39 + var8;
            float var43 = class227.field3790 * var40 + class236.field3875 * var39 + class166.field2421 * var38 + var9;
            if (var43 >= (float) this.field2208.field3550) {
                float var44 = (float) var15 * var41 / var43 + (float) this.field2208.field3520;
                if (var12 < var44) {
                    var12 = var44;
                }
                if (var44 < var11) {
                    var11 = var44;
                }
                float var45 = (float) var16 * var42 / var43 + (float) this.field2208.field3538;
                var10 = true;
                if (var14 < var45) {
                    var14 = var45;
                }
                if (var13 > var45) {
                    var13 = var45;
                }
            }
        }
        if (var10 && var11 < (float) arg0 && var12 > (float) arg0 && (float) arg1 > var13 && (float) arg1 < var14) {
            if (arg3) {
                return true;
            }
            if (this.field2279 > this.field2208.field3625.length) {
                this.field2208.field3625 = new int[this.field2279];
                this.field2208.field3623 = new int[this.field2279];
            }
            int[] var18 = this.field2208.field3625;
            int[] var19 = this.field2208.field3623;
            for (int var20 = 0; var20 < this.field2222; var20++) {
                float var22 = (float) this.field2249[var20];
                float var23 = (float) this.field2217[var20];
                float var24 = (float) this.field2283[var20];
                float var25 = class227.field3790 * var23 + class236.field3875 * var22 + class166.field2421 * var24 + var9;
                float var26 = class119.field1630 * var23 + class471.field7199 * var24 + class301.field4726 * var22 + var8;
                float var27 = class330.field5184 * var23 + class392.field5949 * var24 + class189.field2746 * var22 + var7;
                if (var25 >= (float) this.field2208.field3550) {
                    int var28 = (int) ((float) var15 * var27 / var25 + (float) this.field2208.field3520);
                    int var29 = (int) ((float) var16 * var26 / var25 + (float) this.field2208.field3538);
                    int var30 = this.field2205[var20];
                    int var31 = this.field2205[var20 + 1];
                    for (int var32 = var30; var32 < var31; var32++) {
                        int var33 = this.field2260[var32] - 1;
                        if (var33 == -1) {
                            break;
                        }
                        var18[var33] = var28;
                        var19[var33] = var29;
                    }
                } else {
                    int var34 = this.field2205[var20];
                    int var35 = this.field2205[var20 + 1];
                    for (int var36 = var34; var36 < var35; var36++) {
                        int var37 = this.field2260[var36] - 1;
                        if (var37 == -1) {
                            break;
                        }
                        var18[this.field2260[var36] - 1] = -999999;
                    }
                }
            }
            for (int var21 = 0; var21 < this.field2221; var21++) {
                if (var18[this.field2281[var21]] != -999999 && var18[this.field2212[var21]] != -999999 && var18[this.field2293[var21]] != -999999 && this.method975(var19[this.field2212[var21]], var19[this.field2293[var21]], var19[this.field2281[var21]], (byte) -28, var18[this.field2293[var21]], arg0, var18[this.field2281[var21]], var18[this.field2212[var21]], arg1)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I[Ljava/lang/Object;I[II)V")
    public static final void method985(int arg0, Object[] arg1, int arg2, int[] arg3, int arg4) {
        if (arg2 < arg0) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg2;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            Object var8 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var8;
            int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
            for (int var10 = arg2; var10 < arg0; var10++) {
                if ((var9 & var10) + var7 > arg3[var10]) {
                    int var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    Object var12 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var12;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg0] = arg1[var6];
            arg1[var6] = var8;
            method985(var6 - 1, arg1, arg2, arg3, -87);
            method985(arg0, arg1, var6 + 1, arg3, -102);
        }
        int var13 = -28 % ((-arg4 - 40) / 44);
        field2210++;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILrr;)V")
    private final void method986(int arg0, class283 arg1) {
        if (this.field2208.field3625.length < this.field2279) {
            this.field2208.field3625 = new int[this.field2279];
            this.field2208.field3623 = new int[this.field2279];
        }
        field2207++;
        int[] var3 = this.field2208.field3625;
        int[] var4 = this.field2208.field3623;
        for (int var5 = 0; var5 < this.field2222; var5++) {
            int var16 = (this.field2283[var5] - (this.field2249[var5] * this.field2208.field3535 >> 8) >> this.field2208.field3483) - arg1.field4461;
            int var17 = (this.field2217[var5] - (this.field2249[var5] * this.field2208.field3578 >> 8) >> this.field2208.field3483) - arg1.field4466;
            int var18 = this.field2205[var5];
            int var19 = this.field2205[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field2260[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field2253; var6++) {
            if (this.field2259 == null || this.field2259[var6] <= 128) {
                short var7 = this.field2281[var6];
                short var8 = this.field2212[var6];
                short var9 = this.field2293[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var10 - var11) * (var14 - var15) - ((var12 - var11) * (var14 - var13)) > 0) {
                    arg1.method1904(var13, var12, var15, var11, -113, var10, var14);
                }
            }
        }
        if (arg0 != -1202700985) {
            this.field2245 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILnf;)V")
    private final void method987(int arg0, class89 arg1) {
        if (arg0 != 1894387656) {
            method985(-50, null, 52, null, 51);
        }
        if (this.field2268 != null) {
            for (int var3 = 0; var3 < this.field2268.length; var3++) {
                class293 var4 = this.field2268[var3];
                class293 var5 = var4;
                if (var4.field4608 != null) {
                    var5 = var4.field4608;
                }
                var5.field4612 = (int) ((float) this.field2217[var4.field4607] * arg1.field1292 + (float) this.field2283[var4.field4607] * arg1.field1296 + (float) this.field2249[var4.field4607] * arg1.field1289 + arg1.field1288);
                var5.field4611 = (int) ((float) this.field2217[var4.field4607] * arg1.field1312 + (float) this.field2283[var4.field4607] * arg1.field1301 + (float) this.field2249[var4.field4607] * arg1.field1305 + arg1.field1307);
                var5.field4609 = (int) ((float) this.field2217[var4.field4607] * arg1.field1299 + (float) this.field2283[var4.field4607] * arg1.field1297 + (float) this.field2249[var4.field4607] * arg1.field1310 + arg1.field1287);
                var5.field4629 = (int) ((float) this.field2217[var4.field4627] * arg1.field1292 + (float) this.field2283[var4.field4627] * arg1.field1296 + (float) this.field2249[var4.field4627] * arg1.field1289 + arg1.field1288);
                var5.field4620 = (int) ((float) this.field2217[var4.field4627] * arg1.field1312 + (float) this.field2283[var4.field4627] * arg1.field1301 + (float) this.field2249[var4.field4627] * arg1.field1305 + arg1.field1307);
                var5.field4615 = (int) ((float) this.field2217[var4.field4627] * arg1.field1299 + (float) this.field2283[var4.field4627] * arg1.field1297 + (float) this.field2249[var4.field4627] * arg1.field1310 + arg1.field1287);
                var5.field4617 = (int) ((float) this.field2217[var4.field4623] * arg1.field1292 + (float) this.field2283[var4.field4623] * arg1.field1296 + (float) this.field2249[var4.field4623] * arg1.field1289 + arg1.field1288);
                var5.field4618 = (int) ((float) this.field2217[var4.field4623] * arg1.field1312 + (float) this.field2283[var4.field4623] * arg1.field1301 + (float) this.field2249[var4.field4623] * arg1.field1305 + arg1.field1307);
                var5.field4616 = (int) ((float) this.field2217[var4.field4623] * arg1.field1299 + (float) this.field2283[var4.field4623] * arg1.field1297 + (float) this.field2249[var4.field4623] * arg1.field1310 + arg1.field1287);
            }
        }
        field2196++;
        if (this.field2302 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field2302.length; var6++) {
            class100 var7 = this.field2302[var6];
            class100 var8 = var7;
            if (var7.field1438 != null) {
                var8 = var7.field1438;
            }
            if (var7.field1441 == null) {
                var7.field1441 = arg1.method156();
            } else {
                var7.field1441.method157(arg1);
            }
            var8.field1428 = (int) ((float) this.field2217[var7.field1439] * arg1.field1292 + (float) this.field2283[var7.field1439] * arg1.field1296 + (float) this.field2249[var7.field1439] * arg1.field1289 + arg1.field1288);
            var8.field1430 = (int) ((float) this.field2217[var7.field1439] * arg1.field1312 + (float) this.field2283[var7.field1439] * arg1.field1301 + (float) this.field2249[var7.field1439] * arg1.field1305 + arg1.field1307);
            var8.field1442 = (int) ((float) this.field2217[var7.field1439] * arg1.field1299 + (float) this.field2283[var7.field1439] * arg1.field1297 + (float) this.field2249[var7.field1439] * arg1.field1310 + arg1.field1287);
        }
    }

    @OriginalMember(owner = "client!to", name = "d", descriptor = "(B)V")
    public static void method988(byte arg0) {
        if (arg0 != 77) {
            field2250 = -0.04553205F;
        }
        field2303 = null;
        field2206 = null;
    }

    @OriginalMember(owner = "client!to", name = "X", descriptor = "(I)V")
    public final void method291(int arg0) {
        this.field2304 = (short) arg0;
        if (this.field2251 != null) {
            this.field2251.field1022 = null;
        }
        field2274++;
    }

    @OriginalMember(owner = "client!to", name = "D", descriptor = "(I)V")
    public final void method290(int arg0) {
        this.field2231 = arg0;
        field2261++;
        this.field2255 = true;
        if (this.field2226 != null && (this.field2231 & 0x10000) == 0) {
            this.field2228 = this.field2226.field3857;
            this.field2213 = this.field2226.field3855;
            this.field2276 = this.field2226.field3856;
            this.field2230 = this.field2226.field3862;
            this.field2226 = null;
        }
        this.method990(111);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(SIBBI)I")
    private final int method989(short arg0, int arg1, byte arg2, byte arg3, int arg4) {
        if (arg2 != -110) {
            this.field2212 = null;
        }
        field2284++;
        int var6 = class301.field4730[class159.method971(arg1, arg4, 0)];
        if (arg0 != -1) {
            class476 var7 = this.field2208.field7480.method1366(arg0 & 0xFFFF, (byte) 105);
            int var8 = var7.field7284 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg1 < 0) {
                    var9 = 0;
                } else if (arg1 > 127) {
                    var9 = 16777215;
                } else {
                    var9 = arg1 * 131586;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) + ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field7273 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = (var6 >> 16 & 0xFF) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = ((var6 & 0xFF00) >> 8) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (var6 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                var6 = ((var13 & 0x4200FF00) << 8) + (var15 >> 8) + (var14 & 0xFF00);
            }
        }
        return (var6 << 8) + 255 - (arg3 & 0xFF);
    }

    @OriginalMember(owner = "client!to", name = "aa", descriptor = "(I[IIIIZI[I)V")
    public final void method293(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field2197++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg3 << 4;
            int var11 = arg4 << 4;
            int var12 = arg2 << 4;
            int var13 = 0;
            class136.field1876 = 0;
            class491.field7437 = 0;
            class184.field2681 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field2200.length) {
                    int[] var16 = this.field2200[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field2229 == null || (this.field2229[var18] & arg6) != 0) {
                            class184.field2681 += this.field2283[var18];
                            class491.field7437 += this.field2249[var18];
                            class136.field1876 += this.field2217[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                class184.field2681 = class184.field2681 / var13 + var12;
                class491.field7437 = class491.field7437 / var13 + var10;
                class12.field124 = true;
                class136.field1876 = class136.field1876 / var13 + var11;
            } else {
                class136.field1876 = var11;
                class491.field7437 = var10;
                class184.field2681 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[0] * arg2 + arg7[2] * arg4 + arg7[1] * arg3 + 16384 >> 15;
                int var20 = arg7[5] * arg4 + arg7[3] * arg2 + arg7[4] * arg3 + 16384 >> 15;
                int var21 = arg7[6] * arg2 + arg7[8] * arg4 + arg7[7] * arg3 + 16384 >> 15;
                arg3 = var20;
                arg4 = var21;
                arg2 = var19;
            }
            int var22 = arg2 << 4;
            int var23 = arg4 << 4;
            int var24 = arg3 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field2200.length) {
                    int[] var27 = this.field2200[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field2229 == null || (arg6 & this.field2229[var29]) != 0) {
                            this.field2283[var29] += var22;
                            this.field2249[var29] += var24;
                            this.field2217[var29] += var23;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (var109 < this.field2200.length) {
                        int[] var110 = this.field2200[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field2229 == null || (arg6 & this.field2229[var112]) != 0) {
                                this.field2283[var112] -= class184.field2681;
                                this.field2249[var112] -= class491.field7437;
                                this.field2217[var112] -= class136.field1876;
                                if (arg4 != 0) {
                                    int var113 = class147.field1988[arg4];
                                    int var114 = class147.field1986[arg4];
                                    int var115 = this.field2249[var112] * var113 + (this.field2283[var112] * var114) + 32767 >> 15;
                                    this.field2249[var112] = this.field2249[var112] * var114 + 32767 - (this.field2283[var112] * var113) >> 15;
                                    this.field2283[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class147.field1988[arg2];
                                    int var117 = class147.field1986[arg2];
                                    int var118 = this.field2249[var112] * var117 - (this.field2217[var112] * var116 - 32767) >> 15;
                                    this.field2217[var112] = this.field2249[var112] * var116 + this.field2217[var112] * var117 + 32767 >> 15;
                                    this.field2249[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class147.field1988[arg3];
                                    int var120 = class147.field1986[arg3];
                                    int var121 = this.field2283[var112] * var120 + this.field2217[var112] * var119 + 32767 >> 15;
                                    this.field2217[var112] = this.field2217[var112] * var120 - (this.field2283[var112] * var119 - 32767) >> 15;
                                    this.field2283[var112] = var121;
                                }
                                this.field2283[var112] += class184.field2681;
                                this.field2249[var112] += class491.field7437;
                                this.field2217[var112] += class136.field1876;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (var92 < this.field2200.length) {
                            int[] var93 = this.field2200[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field2229 == null || (this.field2229[var95] & arg6) != 0) {
                                    int var96 = this.field2205[var95];
                                    int var97 = this.field2205[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field2260[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class147.field1988[arg4];
                                            int var101 = class147.field1986[arg4];
                                            int var102 = this.field2276[var99] * var100 + this.field2230[var99] * var101 + 32767 >> 15;
                                            this.field2276[var99] = (short) (this.field2276[var99] * var101 + 32767 - (this.field2230[var99] * var100) >> 15);
                                            this.field2230[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class147.field1988[arg2];
                                            int var104 = class147.field1986[arg2];
                                            int var105 = this.field2276[var99] * var104 + 32767 - (this.field2213[var99] * var103) >> 15;
                                            this.field2213[var99] = (short) (this.field2276[var99] * var103 + this.field2213[var99] * var104 + 32767 >> 15);
                                            this.field2276[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class147.field1988[arg3];
                                            int var107 = class147.field1986[arg3];
                                            int var108 = this.field2230[var99] * var107 + this.field2213[var99] * var106 + 32767 >> 15;
                                            this.field2213[var99] = (short) (this.field2213[var99] * var107 + 32767 - (this.field2230[var99] * var106) >> 15);
                                            this.field2230[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field2240 == null && this.field2251 != null) {
                        this.field2251.field1022 = null;
                    }
                    if (this.field2240 != null) {
                        this.field2240.field1022 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class12.field124) {
                    int var36 = arg7[6] * class136.field1876 + arg7[0] * class184.field2681 + arg7[3] * class491.field7437 + 16384 >> 15;
                    int var37 = arg7[1] * class184.field2681 + (arg7[4] * class491.field7437) + arg7[7] * class136.field1876 + 16384 >> 15;
                    int var38 = var33 + var36;
                    int var39 = arg7[8] * class136.field1876 + (arg7[2] * class184.field2681 + (arg7[5] * class491.field7437)) + 16384 >> 15;
                    int var40 = var34 + var37;
                    class491.field7437 = var40;
                    class184.field2681 = var38;
                    int var41 = var35 + var39;
                    class136.field1876 = var41;
                    class12.field124 = false;
                }
                int[] var42 = new int[9];
                int var43 = class147.field1986[arg2];
                int var44 = class147.field1988[arg2];
                int var45 = class147.field1986[arg3];
                int var46 = class147.field1988[arg3];
                int var47 = class147.field1986[arg4];
                int var48 = class147.field1988[arg4];
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[2] = var43 * var46 + 16384 >> 15;
                var42[6] = -var46 * var47 + var45 * var50 + 16384 >> 15;
                var42[7] = var45 * var49 + var46 * var48 + 16384 >> 15;
                var42[8] = var43 * var45 + 16384 >> 15;
                var42[0] = var45 * var47 + var46 * var50 + 16384 >> 15;
                var42[1] = var46 * var49 + (-var45 * var48 + 16384) >> 15;
                var42[4] = var43 * var47 + 16384 >> 15;
                var42[5] = -var44;
                var42[3] = var43 * var48 + 16384 >> 15;
                int var51 = var42[0] * -class184.field2681 + 16384 - (-(var42[1] * -class491.field7437) - var42[2] * -class136.field1876) >> 15;
                int var52 = var42[3] * -class184.field2681 + var42[5] * -class136.field1876 + var42[4] * -class491.field7437 + 16384 >> 15;
                int var53 = var42[6] * -class184.field2681 + (var42[7] * -class491.field7437) + var42[8] * -class136.field1876 + 16384 >> 15;
                int var54 = class184.field2681 + var51;
                int var55 = class491.field7437 + var52;
                int var56 = class136.field1876 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var87 = 0; var87 < 3; var87++) {
                        int var88 = 0;
                        for (int var89 = 0; var89 < 3; var89++) {
                            var88 += var42[var58 * 3 + var89] * arg7[var87 * 3 + var89];
                        }
                        var57[var58 * 3 + var87] = var88 + 16384 >> 15;
                    }
                }
                int var59 = var42[0] * var33 + var42[2] * var35 + var42[1] * var34 + 16384 >> 15;
                int var60 = var42[3] * var33 + var42[5] * var35 + (var42[4] * var34) + 16384 >> 15;
                int var61 = var54 + var59;
                int var62 = var55 + var60;
                int var63 = var42[8] * var35 + (var42[7] * var34 + var42[6] * var33 + 16384) >> 15;
                int var64 = var56 + var63;
                int[] var65 = new int[9];
                for (int var66 = 0; var66 < 3; var66++) {
                    for (int var84 = 0; var84 < 3; var84++) {
                        int var85 = 0;
                        for (int var86 = 0; var86 < 3; var86++) {
                            var85 += arg7[var66 * 3 + var86] * var57[var86 * 3 + var84];
                        }
                        var65[var66 * 3 + var84] = var85 + 16384 >> 15;
                    }
                }
                int var67 = arg7[2] * var64 + arg7[0] * var61 + arg7[1] * var62 + 16384 >> 15;
                int var68 = arg7[3] * var61 + (arg7[4] * var62) + arg7[5] * var64 + 16384 >> 15;
                int var69 = var30 + var67;
                int var70 = arg7[8] * var64 + arg7[6] * var61 + arg7[7] * var62 + 16384 >> 15;
                int var71 = var31 + var68;
                int var72 = var32 + var70;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (this.field2200.length > var74) {
                        int[] var75 = this.field2200[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field2229 == null || (arg6 & this.field2229[var77]) != 0) {
                                int var78 = this.field2283[var77] * var65[0] + (this.field2249[var77] * var65[1]) + (this.field2217[var77] * var65[2]) + 16384 >> 15;
                                int var79 = this.field2217[var77] * var65[5] + this.field2283[var77] * var65[3] + this.field2249[var77] * var65[4] + 16384 >> 15;
                                int var80 = var69 + var78;
                                int var81 = this.field2249[var77] * var65[7] + this.field2283[var77] * var65[6] + this.field2217[var77] * var65[8] + 16384 >> 15;
                                int var82 = var71 + var79;
                                int var83 = var72 + var81;
                                this.field2283[var77] = var80;
                                this.field2249[var77] = var82;
                                this.field2217[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (this.field2200.length > var123) {
                        int[] var124 = this.field2200[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field2229 == null || (this.field2229[var126] & arg6) != 0) {
                                this.field2283[var126] -= class184.field2681;
                                this.field2249[var126] -= class491.field7437;
                                this.field2217[var126] -= class136.field1876;
                                this.field2283[var126] = this.field2283[var126] * arg2 >> 7;
                                this.field2249[var126] = this.field2249[var126] * arg3 >> 7;
                                this.field2217[var126] = this.field2217[var126] * arg4 >> 7;
                                this.field2283[var126] += class184.field2681;
                                this.field2249[var126] += class491.field7437;
                                this.field2217[var126] += class136.field1876;
                            }
                        }
                    }
                }
            } else {
                int var127 = arg7[9] << 4;
                int var128 = arg7[10] << 4;
                int var129 = arg7[11] << 4;
                int var130 = arg7[12] << 4;
                int var131 = arg7[13] << 4;
                int var132 = arg7[14] << 4;
                if (class12.field124) {
                    int var133 = arg7[6] * class136.field1876 + arg7[0] * class184.field2681 + arg7[3] * class491.field7437 + 16384 >> 15;
                    int var134 = arg7[1] * class184.field2681 + arg7[7] * class136.field1876 + arg7[4] * class491.field7437 + 16384 >> 15;
                    int var135 = var131 + var134;
                    int var136 = arg7[8] * class136.field1876 + arg7[5] * class491.field7437 + arg7[2] * class184.field2681 + 16384 >> 15;
                    int var137 = var130 + var133;
                    int var138 = var132 + var136;
                    class491.field7437 = var135;
                    class184.field2681 = var137;
                    class12.field124 = false;
                    class136.field1876 = var138;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class184.field2681 * var139 + 16384 >> 15;
                int var143 = -class491.field7437 * var140 + 16384 >> 15;
                int var144 = -class136.field1876 * var141 + 16384 >> 15;
                int var145 = class184.field2681 + var142;
                int var146 = class491.field7437 + var143;
                int var147 = var144 + class136.field1876;
                int[] var148 = new int[] { arg7[0] * var139 + 16384 >> 15, arg7[3] * var139 + 16384 >> 15, arg7[6] * var139 + 16384 >> 15, arg7[1] * var140 + 16384 >> 15, arg7[4] * var140 + 16384 >> 15, arg7[7] * var140 + 16384 >> 15, arg7[2] * var141 + 16384 >> 15, arg7[5] * var141 + 16384 >> 15, arg7[8] * var141 + 16384 >> 15 };
                int var149 = var130 * var139 + 16384 >> 15;
                int var150 = var131 * var140 + 16384 >> 15;
                int var151 = var145 + var149;
                int var152 = var146 + var150;
                int var153 = var132 * var141 + 16384 >> 15;
                int var154 = var147 + var153;
                int[] var155 = new int[9];
                for (int var156 = 0; var156 < 3; var156++) {
                    for (int var174 = 0; var174 < 3; var174++) {
                        int var175 = 0;
                        for (int var176 = 0; var176 < 3; var176++) {
                            var175 += arg7[var156 * 3 + var176] * var148[var176 * 3 + var174];
                        }
                        var155[var156 * 3 + var174] = var175 + 16384 >> 15;
                    }
                }
                int var157 = arg7[0] * var151 + arg7[1] * var152 + arg7[2] * var154 + 16384 >> 15;
                int var158 = arg7[4] * var152 + arg7[3] * var151 + (arg7[5] * var154 - -16384) >> 15;
                int var159 = var128 + var158;
                int var160 = arg7[6] * var151 + arg7[7] * var152 + (arg7[8] * var154) + 16384 >> 15;
                int var161 = var127 + var157;
                int var162 = var129 + var160;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (var164 < this.field2200.length) {
                        int[] var165 = this.field2200[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field2229 == null || (this.field2229[var167] & arg6) != 0) {
                                int var168 = this.field2283[var167] * var155[0] + (this.field2249[var167] * var155[1] + (this.field2217[var167] * var155[2])) + 16384 >> 15;
                                int var169 = this.field2283[var167] * var155[3] + this.field2249[var167] * var155[4] - (-(this.field2217[var167] * var155[5]) - 16384) >> 15;
                                int var170 = var161 + var168;
                                int var171 = var159 + var169;
                                int var172 = this.field2283[var167] * var155[6] + this.field2249[var167] * var155[7] + this.field2217[var167] * var155[8] + 16384 >> 15;
                                int var173 = var162 + var172;
                                this.field2283[var167] = var170;
                                this.field2249[var167] = var171;
                                this.field2217[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field2234 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field2234.length) {
                        int[] var182 = this.field2234[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field2278 == null || (arg6 & this.field2278[var184]) != 0) {
                                int var185 = (this.field2259[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field2259[var184] = (byte) var185;
                                if (this.field2251 != null) {
                                    this.field2251.field1022 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field2262 != null) {
                    for (int var178 = 0; var178 < this.field2256; var178++) {
                        class94 var179 = this.field2262[var178];
                        class92 var180 = this.field2270[var178];
                        var180.field1339 = var180.field1339 & 0xFFFFFF | 255 - (this.field2259[var179.field1368] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field2234 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field2234.length > var190) {
                        int[] var191 = this.field2234[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field2278 == null || (arg6 & this.field2278[var193]) != 0) {
                                int var194 = this.field2289[var193] & 0xFFFF;
                                int var195 = var194 >> 10 & 0x3F;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = var194 & 0x7F;
                                int var198 = arg3 / 4 + var196;
                                int var199 = var195 + arg2 & 0x3F;
                                int var200 = arg4 + var197;
                                if (var198 < 0) {
                                    var198 = 0;
                                } else if (var198 > 7) {
                                    var198 = 7;
                                }
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field2289[var193] = (short) class410.method2621(var200, class410.method2621(var199 << 10, var198 << 7));
                                if (this.field2251 != null) {
                                    this.field2251.field1022 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field2262 != null) {
                    for (int var187 = 0; var187 < this.field2256; var187++) {
                        class94 var188 = this.field2262[var187];
                        class92 var189 = this.field2270[var187];
                        var189.field1339 = class301.field4730[this.field2289[var188.field1368] & 0xFFFF] & 0xFFFFFF | var189.field1339 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field2242 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (this.field2242.length > var202) {
                        int[] var203 = this.field2242[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class92 var205 = this.field2270[var203[var204]];
                            var205.field1344 += arg2;
                            var205.field1349 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field2242 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field2242.length > var207) {
                        int[] var208 = this.field2242[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class92 var210 = this.field2270[var208[var209]];
                            var210.field1341 = var210.field1341 * arg3 >> 7;
                            var210.field1340 = var210.field1340 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field2242 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field2242.length > var212) {
                    int[] var213 = this.field2242[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class92 var215 = this.field2270[var213[var214]];
                        var215.field1343 = var215.field1343 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "L", descriptor = "()V")
    public final void method272() {
        for (int var1 = 0; var1 < this.field2222; var1++) {
            this.field2217[var1] = -this.field2217[var1];
        }
        field2272++;
        for (int var2 = 0; var2 < this.field2279; var2++) {
            this.field2213[var2] = (short) (-this.field2213[var2]);
        }
        for (int var3 = 0; var3 < this.field2221; var3++) {
            short var4 = this.field2281[var3];
            this.field2281[var3] = this.field2293[var3];
            this.field2293[var3] = var4;
        }
        if (this.field2240 == null && this.field2251 != null) {
            this.field2251.field1022 = null;
        }
        if (this.field2240 != null) {
            this.field2240.field1022 = null;
        }
        if (this.field2280 != null) {
            this.field2280.field1022 = null;
        }
        this.field2258 = false;
        if (this.field2216 != null) {
            this.field2216.field4146 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BIZ)Le;")
    public final class536 method329(byte arg0, int arg1, boolean arg2) {
        field2218++;
        class161 var4;
        class161 var5;
        if (arg0 == 1) {
            var4 = this.field2208.field3546;
            var5 = this.field2208.field3580;
        } else if (arg0 == 2) {
            var4 = this.field2208.field3620;
            var5 = this.field2208.field3607;
        } else if (arg0 == 3) {
            var4 = this.field2208.field3523;
            var5 = this.field2208.field3528;
        } else if (arg0 == 4) {
            var4 = this.field2208.field3571;
            var5 = this.field2208.field3505;
        } else if (arg0 == 5) {
            var4 = this.field2208.field3561;
            var5 = this.field2208.field3583;
        } else {
            var5 = var4 = new class161(this.field2208);
        }
        return this.method976(var5, arg1, arg2, 70, arg0 != 0, var4);
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(I)V")
    private final void method990(int arg0) {
        field2247++;
        if (!this.field2255) {
            return;
        }
        if (arg0 <= 96) {
            this.method318();
        }
        this.field2255 = false;
        if (this.field2268 == null && this.field2302 == null && this.field2262 == null) {
            if (this.field2283 != null && !class479.method2965(this.field2264, (byte) -109, this.field2231)) {
                if (this.field2280 != null && this.field2280.field1022 == null) {
                    this.field2255 = true;
                } else {
                    if (!this.field2258) {
                        this.method981((byte) -68);
                    }
                    this.field2283 = null;
                }
            }
            if (this.field2249 != null && !class432.method2723(this.field2231, 458752, this.field2264)) {
                if (this.field2280 != null && this.field2280.field1022 == null) {
                    this.field2255 = true;
                } else {
                    if (!this.field2258) {
                        this.method981((byte) -108);
                    }
                    this.field2249 = null;
                }
            }
            if (this.field2217 != null && !class358.method2375(this.field2264, 30, this.field2231)) {
                if (this.field2280 != null && this.field2280.field1022 == null) {
                    this.field2255 = true;
                } else {
                    if (!this.field2258) {
                        this.method981((byte) -72);
                    }
                    this.field2217 = null;
                }
            }
        }
        if (this.field2260 != null && this.field2283 == null && this.field2249 == null && this.field2217 == null) {
            this.field2260 = null;
            this.field2205 = null;
        }
        if (this.field2228 != null && !class268.method1819(this.field2264, (byte) 15, this.field2231)) {
            if (this.field2240 == null) {
                if (this.field2251 != null && this.field2251.field1022 == null) {
                    this.field2255 = true;
                } else {
                    this.field2230 = this.field2276 = this.field2213 = null;
                    this.field2228 = null;
                }
            } else if (this.field2240.field1022 == null) {
                this.field2255 = true;
            } else {
                this.field2230 = this.field2276 = this.field2213 = null;
                this.field2228 = null;
            }
        }
        if (this.field2289 != null && !class399.method2575(this.field2264, this.field2231, 67)) {
            if (this.field2251 != null && this.field2251.field1022 == null) {
                this.field2255 = true;
            } else {
                this.field2289 = null;
            }
        }
        if (this.field2259 != null && !class55.method424(this.field2264, false, this.field2231)) {
            if (this.field2251 != null && this.field2251.field1022 == null) {
                this.field2255 = true;
            } else {
                this.field2259 = null;
            }
        }
        if (this.field2236 != null && !class244.method1700(this.field2231, this.field2264, 115)) {
            if (this.field2245 != null && this.field2245.field1022 == null) {
                this.field2255 = true;
            } else {
                this.field2236 = this.field2306 = null;
            }
        }
        if (this.field2248 != null && !class291.method1960(this.field2231, this.field2264, 81)) {
            if (this.field2251 != null && this.field2251.field1022 == null) {
                this.field2255 = true;
            } else {
                this.field2248 = null;
            }
        }
        if (this.field2281 != null && !class213.method1582(this.field2231, this.field2264, (byte) -54)) {
            if ((this.field2216 == null || this.field2216.field4146 != null) && (this.field2251 == null || this.field2251.field1022 != null)) {
                this.field2281 = this.field2212 = this.field2293 = null;
            } else {
                this.field2255 = true;
            }
        }
        if (this.field2234 != null && !class249.method1725(-16698, this.field2264, this.field2231)) {
            this.field2234 = null;
            this.field2278 = null;
        }
        if (this.field2200 != null && !class132.method817(this.field2231, this.field2264, -1)) {
            this.field2200 = null;
            this.field2229 = null;
        }
        if (this.field2242 != null && !class206.method1410(this.field2264, -10454, this.field2231)) {
            this.field2242 = null;
        }
        if (this.field2287 != null && (this.field2231 & 0x800) == 0 && (this.field2231 & 0x40000) == 0) {
            this.field2287 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "ma", descriptor = "(I)V")
    public final void method280(int arg0) {
        field2277++;
        int var2 = class147.field1988[arg0];
        int var3 = class147.field1986[arg0];
        for (int var4 = 0; var4 < this.field2222; var4++) {
            int var5 = this.field2217[var4] * var2 + (this.field2283[var4] * var3) >> 15;
            this.field2217[var4] = this.field2217[var4] * var3 - (this.field2283[var4] * var2) >> 15;
            this.field2283[var4] = var5;
        }
        this.field2258 = false;
        if (this.field2280 != null) {
            this.field2280.field1022 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Le;IIIZ)V")
    public final void method268(class536 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2301++;
        class161 var6 = (class161) arg0;
        if (this.field2221 == 0 || var6.field2221 == 0) {
            return;
        }
        int var7 = var6.field2222;
        int[] var8 = var6.field2283;
        int[] var9 = var6.field2249;
        int[] var10 = var6.field2217;
        short[] var11 = var6.field2230;
        short[] var12 = var6.field2276;
        short[] var13 = var6.field2213;
        byte[] var14 = var6.field2228;
        byte[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field2226 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var16 = this.field2226.field3862;
            var17 = this.field2226.field3856;
            var18 = this.field2226.field3855;
            var15 = this.field2226.field3857;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        byte[] var22;
        if (var6.field2226 == null) {
            var19 = null;
            var21 = null;
            var22 = null;
            var20 = null;
        } else {
            var19 = var6.field2226.field3856;
            var20 = var6.field2226.field3855;
            var21 = var6.field2226.field3862;
            var22 = var6.field2226.field3857;
        }
        int[] var23 = var6.field2205;
        short[] var24 = var6.field2260;
        if (!var6.field2258) {
            var6.method981((byte) -67);
        }
        short var25 = var6.field2220;
        short var26 = var6.field2203;
        short var27 = var6.field2257;
        short var28 = var6.field2209;
        short var29 = var6.field2269;
        short var30 = var6.field2300;
        for (int var31 = 0; var31 < this.field2222; var31++) {
            int var32 = this.field2249[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field2283[var31] - arg1;
                if (var33 >= var27 && var28 >= var33) {
                    int var34 = this.field2217[var31] - arg3;
                    if (var29 <= var34 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field2205[var31];
                        int var37 = this.field2205[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field2260[var38] - 1;
                            if (var35 == -1 || this.field2228[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39 + 1];
                                    int var41 = -1;
                                    int var42 = var23[var39];
                                    for (int var43 = var42; var43 < var40; var43++) {
                                        var41 = var24[var43] - 1;
                                        if (var41 == -1 || var14[var41] != 0) {
                                            break;
                                        }
                                    }
                                    if (var41 != -1) {
                                        if (var16 == null) {
                                            this.field2226 = new class234();
                                            var16 = this.field2226.field3862 = class282.method1900(this.field2230, 76);
                                            var17 = this.field2226.field3856 = class282.method1900(this.field2276, -71);
                                            var18 = this.field2226.field3855 = class282.method1900(this.field2213, -113);
                                            var15 = this.field2226.field3857 = class416.method2657(-68, this.field2228);
                                        }
                                        if (var21 == null) {
                                            class234 var44 = var6.field2226 = new class234();
                                            var21 = var44.field3862 = class282.method1900(var11, 94);
                                            var19 = var44.field3856 = class282.method1900(var12, -64);
                                            var20 = var44.field3855 = class282.method1900(var13, -44);
                                            var22 = var44.field3857 = class416.method2657(-119, var14);
                                        }
                                        short var45 = this.field2230[var35];
                                        short var46 = this.field2276[var35];
                                        short var47 = this.field2213[var35];
                                        byte var48 = this.field2228[var35];
                                        int var49 = var23[var39 + 1];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var49; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var21[var52] += var45;
                                                var19[var52] += var46;
                                                var20[var52] += var47;
                                                var22[var52] += var48;
                                            }
                                        }
                                        int var53 = this.field2205[var31 + 1];
                                        int var54 = this.field2205[var31];
                                        short var55 = var12[var41];
                                        short var56 = var13[var41];
                                        byte var57 = var14[var41];
                                        short var58 = var11[var41];
                                        for (int var59 = var54; var59 < var53; var59++) {
                                            int var60 = this.field2260[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var15[var60] != 0) {
                                                var16[var60] += var58;
                                                var17[var60] += var55;
                                                var18[var60] += var56;
                                                var15[var60] += var57;
                                            }
                                        }
                                        if (this.field2240 == null && this.field2251 != null) {
                                            this.field2251.field1022 = null;
                                        }
                                        if (this.field2240 != null) {
                                            this.field2240.field1022 = null;
                                        }
                                        if (var6.field2240 == null && var6.field2251 != null) {
                                            var6.field2251.field1022 = null;
                                        }
                                        if (var6.field2240 != null) {
                                            var6.field2240.field1022 = null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "d", descriptor = "()V")
    public final void method303() {
        field2219++;
        if (this.field2279 <= 0 || this.field2253 <= 0) {
            return;
        }
        this.method984(false, (byte) 113);
        if ((this.field2291 & 0x10) == 0 && this.field2216.field4146 == null) {
            this.method983((byte) 73, false);
        }
        this.method990(123);
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lna;)V")
    public class161(class211 arg0) {
        this.field2208 = arg0;
        this.field2280 = new class67(null, 5126, 3, 0);
        this.field2245 = new class67(null, 5126, 2, 0);
        this.field2240 = new class67(null, 5126, 3, 0);
        this.field2251 = new class67(null, 5121, 4, 0);
        this.field2216 = new class256();
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lna;Lfc;IIII)V")
    public class161(class211 arg0, class438 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2264 = arg5;
        this.field2231 = arg2;
        this.field2208 = arg0;
        if (class205.method1405(arg2, arg5, (byte) -128)) {
            this.field2280 = new class67(null, 5126, 3, 0);
        }
        if (class252.method1736(arg2, (byte) -101, arg5)) {
            this.field2245 = new class67(null, 5126, 2, 0);
        }
        if (class147.method897(arg2, arg5, 55)) {
            this.field2240 = new class67(null, 5126, 3, 0);
        }
        if (class136.method834((byte) -54, arg2, arg5)) {
            this.field2251 = new class67(null, 5121, 4, 0);
        }
        if (class202.method1373(arg2, -21682, arg5)) {
            this.field2216 = new class256();
        }
        class199 var7 = arg0.field7480;
        this.field2205 = new int[arg1.field6794 + 1];
        int[] var8 = new int[arg1.field6783];
        for (int var9 = 0; var9 < arg1.field6783; var9++) {
            if ((arg1.field6809 == null || arg1.field6809[var9] != 2) && (arg1.field6784 == null || arg1.field6784[var9] == -1 || !var7.method1366(arg1.field6784[var9] & 0xFFFF, (byte) -122).field7280)) {
                var8[this.field2221++] = var9;
                this.field2205[arg1.field6759[var9]]++;
                this.field2205[arg1.field6808[var9]]++;
                this.field2205[arg1.field6787[var9]]++;
            }
        }
        this.field2253 = this.field2221;
        long[] var10 = new long[this.field2221];
        boolean var11 = (this.field2231 & 0x100) != 0;
        label497: for (int var12 = 0; var12 < this.field2221; var12++) {
            int var180 = var8[var12];
            class476 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field6760 != null) {
                for (int var186 = 0; var186 < arg1.field6760.length; var186++) {
                    class168 var187 = arg1.field6760[var186];
                    if (var187.field2447 == var180) {
                        class371 var188 = class389.method2493(true, var187.field2450);
                        if (var188.field5697) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field2253--;
                            continue label497;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field6784 != null) {
                var189 = arg1.field6784[var180];
                if (var189 != -1) {
                    var181 = var7.method1366(var189 & 0xFFFF, (byte) 1);
                    var185 = var181.field7274;
                    var184 = var181.field7282;
                }
            }
            boolean var190 = arg1.field6798 != null && arg1.field6798[var180] != 0 || var181 != null && var181.field7277 | !var181.field7289;
            if ((var11 || var190) && arg1.field6773 != null) {
                var182 += arg1.field6773[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = (var184 & 0xFF << 8) + var182;
            int var192 = (var185 & 0xFF) + var191;
            int var193 = ((var189 & 0xFFFF) << 16) + var183;
            int var194 = (var12 & 0xFFFF) + var193;
            var10[var12] = ((long) var192 << 32) + (long) var194;
        }
        class315.method2107(var8, var10, false);
        this.field2233 = arg1.field6765;
        this.field2222 = arg1.field6794;
        this.field2229 = arg1.field6810;
        this.field2283 = arg1.field6771;
        this.field2217 = arg1.field6772;
        this.field2249 = arg1.field6777;
        this.field2268 = arg1.field6790;
        class56[] var13 = new class56[this.field2222];
        this.field2302 = arg1.field6788;
        if (arg1.field6760 != null) {
            this.field2256 = arg1.field6760.length;
            this.field2270 = new class92[this.field2256];
            this.field2262 = new class94[this.field2256];
            for (int var14 = 0; var14 < this.field2256; var14++) {
                class168 var15 = arg1.field6760[var14];
                class371 var16 = class389.method2493(true, var15.field2450);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field2221; var18++) {
                    if (var8[var18] == var15.field2447) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class301.field4730[arg1.field6802[var15.field2447] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field6798 == null ? 0 : arg1.field6798[var15.field2447]) << 24;
                this.field2262[var14] = new class94(var17, arg1.field6759[var15.field2447], arg1.field6808[var15.field2447], arg1.field6787[var15.field2447], var16.field5695, var16.field5701, var16.field5696, var16.field5698, var16.field5694, var16.field5697, var16.field5700, var15.field2452);
                this.field2270[var14] = new class92(var20);
            }
        }
        int var21 = this.field2221 * 3;
        this.field2282 = (short) arg4;
        this.field2230 = new short[var21];
        this.field2248 = new short[this.field2221];
        this.field2228 = new byte[var21];
        this.field2306 = new float[var21];
        class285.field4500 = new long[var21];
        this.field2236 = new float[var21];
        this.field2281 = new short[this.field2221];
        this.field2213 = new short[var21];
        this.field2293 = new short[this.field2221];
        this.field2212 = new short[this.field2221];
        if (arg1.field6778 != null) {
            this.field2278 = new short[this.field2221];
        }
        this.field2260 = new short[var21];
        this.field2259 = new byte[this.field2221];
        this.field2289 = new short[this.field2221];
        this.field2304 = (short) arg3;
        this.field2276 = new short[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field6794; var23++) {
            int var179 = this.field2205[var23];
            this.field2205[var23] = var22;
            var22 += var179;
            var13[var23] = new class56();
        }
        this.field2205[arg1.field6794] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field6789 != null) {
            int var28 = arg1.field6786;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            for (int var36 = 0; var36 < this.field2221; var36++) {
                int var43 = var8[var36];
                if (arg1.field6789[var43] != -1) {
                    int var44 = arg1.field6789[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field6759[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field6808[var43];
                        } else {
                            var46 = arg1.field6787[var43];
                        }
                        int var47 = arg1.field6771[var46];
                        int var48 = arg1.field6777[var46];
                        int var49 = arg1.field6772[var46];
                        if (var47 < var29[var44]) {
                            var29[var44] = var47;
                        }
                        if (var30[var44] < var47) {
                            var30[var44] = var47;
                        }
                        if (var48 < var31[var44]) {
                            var31[var44] = var48;
                        }
                        if (var48 > var32[var44]) {
                            var32[var44] = var48;
                        }
                        if (var33[var44] > var49) {
                            var33[var44] = var49;
                        }
                        if (var34[var44] < var49) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var25 = new int[var28];
            var26 = new int[var28];
            var27 = new float[var28][];
            var24 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field6775[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var40;
                    float var41;
                    float var42;
                    if (var38 == 1) {
                        int var39 = arg1.field6782[var37];
                        var40 = 64.0F / (float) arg1.field6806[var37];
                        if (var39 == 0) {
                            var41 = 1.0F;
                            var42 = 1.0F;
                        } else if (var39 <= 0) {
                            var42 = 1.0F;
                            var41 = (float) (-var39) / 1024.0F;
                        } else {
                            var42 = (float) var39 / 1024.0F;
                            var41 = 1.0F;
                        }
                    } else if (var38 == 2) {
                        var42 = 64.0F / (float) arg1.field6768[var37];
                        var40 = 64.0F / (float) arg1.field6806[var37];
                        var41 = 64.0F / (float) arg1.field6782[var37];
                    } else {
                        var40 = (float) arg1.field6806[var37] / 1024.0F;
                        var41 = (float) arg1.field6782[var37] / 1024.0F;
                        var42 = (float) arg1.field6768[var37] / 1024.0F;
                    }
                    var27[var37] = class411.method2626(var42, var40, arg1.field6801[var37], class272.method1842(arg1.field6764[var37], 255), var41, arg1.field6795[var37], arg1.field6796[var37], true);
                }
            }
        }
        class530[] var50 = new class530[arg1.field6783];
        for (int var51 = 0; var51 < arg1.field6783; var51++) {
            short var158 = arg1.field6759[var51];
            short var159 = arg1.field6808[var51];
            short var160 = arg1.field6787[var51];
            int var161 = this.field2283[var159] - this.field2283[var158];
            int var162 = this.field2249[var159] - this.field2249[var158];
            int var163 = this.field2217[var159] - this.field2217[var158];
            int var164 = this.field2283[var160] - this.field2283[var158];
            int var165 = this.field2249[var160] - this.field2249[var158];
            int var166 = this.field2217[var160] - this.field2217[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - var161 * var166;
            int var169 = var161 * var165 - (var162 * var164);
            while (var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192) {
                var167 >>= 0x1;
                var169 >>= 0x1;
                var168 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var167 * var167 + var168 * var168 + var169 * var169));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var168 * 256 / var170;
            int var172 = var169 * 256 / var170;
            int var173 = var167 * 256 / var170;
            byte var174 = arg1.field6809 == null ? 0 : arg1.field6809[var51];
            if (var174 == 0) {
                class56 var175 = var13[var158];
                var175.field907 += var171;
                var175.field910++;
                var175.field909 += var173;
                var175.field902 += var172;
                class56 var176 = var13[var159];
                var176.field907 += var171;
                var176.field910++;
                var176.field909 += var173;
                var176.field902 += var172;
                class56 var177 = var13[var160];
                var177.field910++;
                var177.field907 += var171;
                var177.field909 += var173;
                var177.field902 += var172;
            } else if (var174 == 1) {
                class530 var178 = var50[var51] = new class530();
                var178.field7789 = var173;
                var178.field7788 = var172;
                var178.field7790 = var171;
            }
        }
        for (int var52 = 0; var52 < this.field2221; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field6802[var68] & 0xFFFF;
            short var70;
            if (arg1.field6784 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field6784[var68];
            }
            int var71;
            if (arg1.field6789 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field6789[var68];
            }
            int var72;
            if (arg1.field6798 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field6798[var68] & 0xFF;
            }
            float var73 = 0.0F;
            float var74 = 0.0F;
            float var75 = 0.0F;
            float var76 = 0.0F;
            float var77 = 0.0F;
            float var78 = 0.0F;
            byte var79 = 0;
            byte var80 = 0;
            int var81 = 0;
            if (var70 != -1) {
                if (var71 == -1) {
                    var78 = 0.0F;
                    var73 = 0.0F;
                    var75 = 1.0F;
                    var79 = 1;
                    var77 = 0.0F;
                    var76 = 1.0F;
                    var80 = 2;
                    var74 = 1.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field6775[var71];
                    if (var82 == 0) {
                        short var83 = arg1.field6759[var68];
                        short var84 = arg1.field6808[var68];
                        short var85 = arg1.field6787[var68];
                        short var86 = arg1.field6795[var71];
                        short var87 = arg1.field6801[var71];
                        short var88 = arg1.field6796[var71];
                        float var89 = (float) arg1.field6771[var86];
                        float var90 = (float) arg1.field6777[var86];
                        float var91 = (float) arg1.field6772[var86];
                        float var92 = (float) arg1.field6771[var87] - var89;
                        float var93 = (float) arg1.field6777[var87] - var90;
                        float var94 = (float) arg1.field6772[var87] - var91;
                        float var95 = (float) arg1.field6771[var88] - var89;
                        float var96 = (float) arg1.field6777[var88] - var90;
                        float var97 = (float) arg1.field6772[var88] - var91;
                        float var98 = (float) arg1.field6771[var83] - var89;
                        float var99 = (float) arg1.field6777[var83] - var90;
                        float var100 = (float) arg1.field6772[var83] - var91;
                        float var101 = (float) arg1.field6771[var84] - var89;
                        float var102 = (float) arg1.field6777[var84] - var90;
                        float var103 = (float) arg1.field6772[var84] - var91;
                        float var104 = (float) arg1.field6771[var85] - var89;
                        float var105 = (float) arg1.field6777[var85] - var90;
                        float var106 = (float) arg1.field6772[var85] - var91;
                        float var107 = var93 * var97 - (var94 * var96);
                        float var108 = var94 * var95 - var92 * var97;
                        float var109 = var92 * var96 - (var93 * var95);
                        float var110 = var96 * var109 - var97 * var108;
                        float var111 = var97 * var107 - var95 * var109;
                        float var112 = var95 * var108 - (var96 * var107);
                        float var113 = 1.0F / (var94 * var112 + var92 * var110 + var93 * var111);
                        var77 = (var106 * var112 + var104 * var110 + var105 * var111) * var113;
                        var73 = (var100 * var112 + var98 * var110 + var99 * var111) * var113;
                        var75 = (var103 * var112 + var101 * var110 + var102 * var111) * var113;
                        float var114 = var93 * var109 - var94 * var108;
                        float var115 = var92 * var108 - (var93 * var107);
                        float var116 = var94 * var107 - (var92 * var109);
                        float var117 = 1.0F / (var97 * var115 + var95 * var114 + var96 * var116);
                        var76 = (var103 * var115 + var101 * var114 + var102 * var116) * var117;
                        var78 = (var106 * var115 + var104 * var114 + var105 * var116) * var117;
                        var74 = (var100 * var115 + var98 * var114 + var99 * var116) * var117;
                    } else {
                        short var118 = arg1.field6759[var68];
                        short var119 = arg1.field6808[var68];
                        short var120 = arg1.field6787[var68];
                        int var121 = var24[var71];
                        int var122 = var25[var71];
                        int var123 = var26[var71];
                        float[] var124 = var27[var71];
                        byte var125 = arg1.field6767[var71];
                        float var126 = (float) arg1.field6770[var71] / 256.0F;
                        if (var82 == 1) {
                            float var127 = (float) arg1.field6768[var71] / 1024.0F;
                            class187.method1170(var123, var125, var121, arg1.field6772[var118], var126, var124, var122, arg1.field6777[var118], arg1.field6771[var118], (byte) -117, var127);
                            var74 = class464.field7127;
                            var73 = class193.field2860;
                            class187.method1170(var123, var125, var121, arg1.field6772[var119], var126, var124, var122, arg1.field6777[var119], arg1.field6771[var119], (byte) 107, var127);
                            var75 = class193.field2860;
                            var76 = class464.field7127;
                            class187.method1170(var123, var125, var121, arg1.field6772[var120], var126, var124, var122, arg1.field6777[var120], arg1.field6771[var120], (byte) -102, var127);
                            var78 = class464.field7127;
                            var77 = class193.field2860;
                            float var128 = var127 / 2.0F;
                            if ((var125 & 0x1) == 0) {
                                if (var128 < var77 - var73) {
                                    var77 -= var127;
                                    var80 = 1;
                                } else if (var128 < var73 - var77) {
                                    var77 += var127;
                                    var80 = 2;
                                }
                                if (var128 < var75 - var73) {
                                    var75 -= var127;
                                    var79 = 1;
                                } else if (var128 < var73 - var75) {
                                    var79 = 2;
                                    var75 += var127;
                                }
                            } else {
                                if ((var78 - var74 > var128)) {
                                    var80 = 1;
                                    var78 -= var127;
                                } else if (var74 - var78 > var128) {
                                    var78 += var127;
                                    var80 = 2;
                                }
                                if ((var128 < var76 - var74)) {
                                    var76 -= var127;
                                    var79 = 1;
                                } else if (var74 - var76 > var128) {
                                    var79 = 2;
                                    var76 += var127;
                                }
                            }
                        } else if (var82 == 2) {
                            float var129 = (float) arg1.field6785[var71] / 256.0F;
                            float var130 = (float) arg1.field6779[var71] / 256.0F;
                            int var131 = arg1.field6771[var119] - arg1.field6771[var118];
                            int var132 = arg1.field6777[var119] - arg1.field6777[var118];
                            int var133 = arg1.field6772[var119] - arg1.field6772[var118];
                            int var134 = arg1.field6771[var120] - arg1.field6771[var118];
                            int var135 = arg1.field6777[var120] - arg1.field6777[var118];
                            int var136 = arg1.field6772[var120] - arg1.field6772[var118];
                            int var137 = var132 * var136 - var133 * var135;
                            int var138 = var133 * var134 - (var131 * var136);
                            int var139 = var131 * var135 - var132 * var134;
                            float var140 = 64.0F / (float) arg1.field6782[var71];
                            float var141 = 64.0F / (float) arg1.field6806[var71];
                            float var142 = 64.0F / (float) arg1.field6768[var71];
                            float var143 = (var124[2] * (float) var139 + var124[0] * (float) var137 + var124[1] * (float) var138) / var140;
                            float var144 = (var124[5] * (float) var139 + var124[3] * (float) var137 + var124[4] * (float) var138) / var141;
                            float var145 = (var124[8] * (float) var139 + var124[7] * (float) var138 + var124[6] * (float) var137) / var142;
                            var81 = class413.method2635((byte) -127, var144, var145, var143);
                            class501.method3053(var122, arg1.field6772[var118], var126, var124, var123, var125, var130, var81, var121, var129, arg1.field6777[var118], arg1.field6771[var118], (byte) 105);
                            var74 = class436.field6586;
                            var73 = class220.field3726;
                            class501.method3053(var122, arg1.field6772[var119], var126, var124, var123, var125, var130, var81, var121, var129, arg1.field6777[var119], arg1.field6771[var119], (byte) 114);
                            var76 = class436.field6586;
                            var75 = class220.field3726;
                            class501.method3053(var122, arg1.field6772[var120], var126, var124, var123, var125, var130, var81, var121, var129, arg1.field6777[var120], arg1.field6771[var120], (byte) 102);
                            var77 = class220.field3726;
                            var78 = class436.field6586;
                        } else if (var82 == 3) {
                            class399.method2574((byte) 4, var122, var121, var125, arg1.field6772[var118], var126, var123, arg1.field6771[var118], var124, arg1.field6777[var118]);
                            var73 = class220.field3718;
                            var74 = field2250;
                            class399.method2574((byte) 4, var122, var121, var125, arg1.field6772[var119], var126, var123, arg1.field6771[var119], var124, arg1.field6777[var119]);
                            var76 = field2250;
                            var75 = class220.field3718;
                            class399.method2574((byte) 4, var122, var121, var125, arg1.field6772[var120], var126, var123, arg1.field6771[var120], var124, arg1.field6777[var120]);
                            var77 = class220.field3718;
                            var78 = field2250;
                            if ((var125 & 0x1) == 0) {
                                if (var77 - var73 > 0.5F) {
                                    var77--;
                                    var80 = 1;
                                } else if (var73 - var77 > 0.5F) {
                                    var77++;
                                    var80 = 2;
                                }
                                if (var75 - var73 > 0.5F) {
                                    var79 = 1;
                                    var75--;
                                } else if (var73 - var75 > 0.5F) {
                                    var75++;
                                    var79 = 2;
                                }
                            } else {
                                if ((var76 - var74 > 0.5F)) {
                                    var76--;
                                    var79 = 1;
                                } else if (var74 - var76 > 0.5F) {
                                    var76++;
                                    var79 = 2;
                                }
                                if ((var78 - var74 > 0.5F)) {
                                    var78--;
                                    var80 = 1;
                                } else if (var74 - var78 > 0.5F) {
                                    var80 = 2;
                                    var78++;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field6809 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field6809[var68];
            }
            if (var146 == 0) {
                long var150 = ((long) (var81 << 24) + (long) var72 + ((long) (var69 << 8)) << 32) + (long) (var71 << 2);
                short var152 = arg1.field6759[var68];
                short var153 = arg1.field6808[var68];
                short var154 = arg1.field6787[var68];
                class56 var155 = var13[var152];
                this.field2281[var52] = this.method980(-123, var73, arg1, var155.field902, var155.field907, var150, var152, var74, var155.field910, var155.field909);
                class56 var156 = var13[var153];
                this.field2212[var52] = this.method980(67, var75, arg1, var156.field902, var156.field907, (long) var79 + var150, var153, var76, var156.field910, var156.field909);
                class56 var157 = var13[var154];
                this.field2293[var52] = this.method980(-115, var77, arg1, var157.field902, var157.field907, (long) var80 + var150, var154, var78, var157.field910, var157.field909);
            } else if (var146 == 1) {
                class530 var147 = var50[var68];
                long var148 = ((long) (var69 << 8) + (long) var72 + (long) (var81 << 24) << 32) + (long) ((var147.field7788 + 256 << 22) + (var147.field7789 <= 0 ? 2048 : 1024) + (var71 << 2) + (var147.field7790 + 256 << 12));
                this.field2281[var52] = this.method980(-117, var73, arg1, var147.field7788, var147.field7790, var148, arg1.field6759[var68], var74, 0, var147.field7789);
                this.field2212[var52] = this.method980(-105, var75, arg1, var147.field7788, var147.field7790, (long) var79 + var148, arg1.field6808[var68], var76, 0, var147.field7789);
                this.field2293[var52] = this.method980(121, var77, arg1, var147.field7788, var147.field7790, (long) var80 + var148, arg1.field6787[var68], var78, 0, var147.field7789);
            }
            if (arg1.field6784 == null) {
                this.field2248[var52] = -1;
            } else {
                this.field2248[var52] = arg1.field6784[var68];
            }
            if (arg1.field6798 != null) {
                this.field2259[var52] = arg1.field6798[var68];
            }
            if (arg1.field6778 != null) {
                this.field2278[var52] = arg1.field6778[var68];
            }
            this.field2289[var52] = arg1.field6802[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field2253; var55++) {
            short var67 = this.field2248[var55];
            if (var54 != var67) {
                var53++;
                var54 = var67;
            }
        }
        this.field2287 = new int[var53 + 1];
        short var56 = -10000;
        int var57 = 0;
        for (int var58 = 0; var58 < this.field2253; var58++) {
            short var66 = this.field2248[var58];
            if (var56 != var66) {
                this.field2287[var57++] = var58;
                var56 = var66;
            }
        }
        this.field2287[var57] = this.field2253;
        class285.field4500 = null;
        this.field2230 = class3.method36(this.field2279, 256, this.field2230);
        this.field2276 = class3.method36(this.field2279, 256, this.field2276);
        this.field2213 = class3.method36(this.field2279, 256, this.field2213);
        this.field2228 = class46.method339(this.field2228, 115, this.field2279);
        this.field2236 = class377.method2438(this.field2236, 1581, this.field2279);
        this.field2306 = class377.method2438(this.field2306, 1581, this.field2279);
        if (arg1.field6792 != null && class132.method817(arg2, this.field2264, -1)) {
            this.field2200 = arg1.method2782(0);
        }
        if (arg1.field6760 != null && class206.method1410(this.field2264, -10454, arg2)) {
            this.field2242 = arg1.method2781(0);
        }
        if (arg1.field6781 != null && class249.method1725(-16698, this.field2264, arg2)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field2221; var61++) {
                int var65 = arg1.field6781[var8[var61]];
                if (var65 >= 0) {
                    int var10002 = var60[var65]++;
                    if (var65 > var59) {
                        var59 = var65;
                    }
                }
            }
            this.field2234 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field2234[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field2221; var63++) {
                int var64 = arg1.field6781[var8[var63]];
                if (var64 >= 0) {
                    this.field2234[var64][var60[var64]++] = var63;
                }
            }
        }
    }
}
