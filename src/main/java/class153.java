import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class153 extends class473 {

    @OriginalMember(owner = "client!as", name = "fb", descriptor = "I")
    private int field2399 = 0;

    @OriginalMember(owner = "client!as", name = "P", descriptor = "I")
    private int field2383 = 0;

    @OriginalMember(owner = "client!as", name = "sb", descriptor = "I")
    private int field2412 = 0;

    @OriginalMember(owner = "client!as", name = "J", descriptor = "Z")
    private boolean field2378 = false;

    @OriginalMember(owner = "client!as", name = "Eb", descriptor = "I")
    private int field2424 = 0;

    @OriginalMember(owner = "client!as", name = "Tb", descriptor = "Z")
    private boolean field2439 = false;

    @OriginalMember(owner = "client!as", name = "F", descriptor = "I")
    private int field2374 = 0;

    @OriginalMember(owner = "client!as", name = "mc", descriptor = "Z")
    private boolean field2458 = true;

    @OriginalMember(owner = "client!as", name = "vc", descriptor = "Z")
    private boolean field2467 = false;

    @OriginalMember(owner = "client!as", name = "Hb", descriptor = "Lwh;")
    private class148 field2427;

    @OriginalMember(owner = "client!as", name = "jb", descriptor = "Lcl;")
    private class268 field2403;

    @OriginalMember(owner = "client!as", name = "Yb", descriptor = "Lcl;")
    private class268 field2444;

    @OriginalMember(owner = "client!as", name = "H", descriptor = "Lcl;")
    private class268 field2376;

    @OriginalMember(owner = "client!as", name = "eb", descriptor = "Lcl;")
    private class268 field2398;

    @OriginalMember(owner = "client!as", name = "x", descriptor = "Lpia;")
    private class96 field2366;

    @OriginalMember(owner = "client!as", name = "Ac", descriptor = "I")
    private int field2472;

    @OriginalMember(owner = "client!as", name = "Sb", descriptor = "I")
    private int field2438;

    @OriginalMember(owner = "client!as", name = "tb", descriptor = "[I")
    private int[] field2413;

    @OriginalMember(owner = "client!as", name = "hb", descriptor = "[S")
    private short[] field2401;

    @OriginalMember(owner = "client!as", name = "Kb", descriptor = "[I")
    private int[] field2430;

    @OriginalMember(owner = "client!as", name = "Rb", descriptor = "[I")
    private int[] field2437;

    @OriginalMember(owner = "client!as", name = "q", descriptor = "[I")
    private int[] field2359;

    @OriginalMember(owner = "client!as", name = "p", descriptor = "[Lol;")
    private class285[] field2358;

    @OriginalMember(owner = "client!as", name = "wc", descriptor = "[Lwr;")
    private class459[] field2468;

    @OriginalMember(owner = "client!as", name = "tc", descriptor = "I")
    private int field2465;

    @OriginalMember(owner = "client!as", name = "O", descriptor = "[Llia;")
    private class479[] field2382;

    @OriginalMember(owner = "client!as", name = "rc", descriptor = "[Lti;")
    private class442[] field2463;

    @OriginalMember(owner = "client!as", name = "Lb", descriptor = "[S")
    private short[] field2431;

    @OriginalMember(owner = "client!as", name = "Ub", descriptor = "[S")
    private short[] field2440;

    @OriginalMember(owner = "client!as", name = "nc", descriptor = "[S")
    private short[] field2459;

    @OriginalMember(owner = "client!as", name = "v", descriptor = "[S")
    private short[] field2364;

    @OriginalMember(owner = "client!as", name = "Q", descriptor = "S")
    private short field2384;

    @OriginalMember(owner = "client!as", name = "W", descriptor = "[F")
    private float[] field2390;

    @OriginalMember(owner = "client!as", name = "uc", descriptor = "[S")
    private short[] field2466;

    @OriginalMember(owner = "client!as", name = "pb", descriptor = "[S")
    private short[] field2409;

    @OriginalMember(owner = "client!as", name = "s", descriptor = "S")
    private short field2361;

    @OriginalMember(owner = "client!as", name = "lb", descriptor = "[S")
    private short[] field2405;

    @OriginalMember(owner = "client!as", name = "A", descriptor = "[B")
    private byte[] field2369;

    @OriginalMember(owner = "client!as", name = "Bc", descriptor = "[B")
    private byte[] field2473;

    @OriginalMember(owner = "client!as", name = "gc", descriptor = "[S")
    private short[] field2452;

    @OriginalMember(owner = "client!as", name = "Fb", descriptor = "[S")
    private short[] field2425;

    @OriginalMember(owner = "client!as", name = "qb", descriptor = "[S")
    private short[] field2410;

    @OriginalMember(owner = "client!as", name = "Jb", descriptor = "[F")
    private float[] field2429;

    @OriginalMember(owner = "client!as", name = "V", descriptor = "[I")
    private int[] field2389;

    @OriginalMember(owner = "client!as", name = "Ab", descriptor = "[[I")
    private int[][] field2420;

    @OriginalMember(owner = "client!as", name = "zc", descriptor = "[[I")
    private int[][] field2471;

    @OriginalMember(owner = "client!as", name = "X", descriptor = "[[I")
    private int[][] field2391;

    @OriginalMember(owner = "client!as", name = "Bb", descriptor = "I")
    public static int field2421 = 0;

    @OriginalMember(owner = "client!as", name = "Zb", descriptor = "Lada;")
    public static class164 field2445 = new class164();

    @OriginalMember(owner = "client!as", name = "vb", descriptor = "B")
    private byte field2415;

    @OriginalMember(owner = "client!as", name = "n", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!as", name = "o", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!as", name = "r", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!as", name = "t", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!as", name = "u", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!as", name = "z", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!as", name = "B", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!as", name = "C", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!as", name = "D", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!as", name = "E", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!as", name = "G", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!as", name = "I", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!as", name = "K", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!as", name = "M", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!as", name = "N", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!as", name = "R", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!as", name = "S", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!as", name = "T", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!as", name = "U", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!as", name = "Y", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!as", name = "Z", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!as", name = "ab", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!as", name = "bb", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!as", name = "cb", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!as", name = "db", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!as", name = "ib", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!as", name = "mb", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!as", name = "nb", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!as", name = "ob", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!as", name = "rb", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!as", name = "ub", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!as", name = "wb", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!as", name = "xb", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!as", name = "yb", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!as", name = "zb", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!as", name = "Cb", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!as", name = "Gb", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!as", name = "Ib", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!as", name = "Mb", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!as", name = "Nb", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!as", name = "Ob", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!as", name = "Pb", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!as", name = "Qb", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!as", name = "Vb", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!as", name = "Wb", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!as", name = "Xb", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!as", name = "ac", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!as", name = "bc", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!as", name = "cc", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!as", name = "dc", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!as", name = "ec", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!as", name = "fc", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!as", name = "ic", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!as", name = "kc", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!as", name = "oc", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!as", name = "pc", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!as", name = "qc", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!as", name = "sc", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!as", name = "xc", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!as", name = "Dc", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!as", name = "Ec", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!as", name = "Fc", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!as", name = "Ic", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!as", name = "Hc", descriptor = "Lkw;")
    public static class251 field2479;

    @OriginalMember(owner = "client!as", name = "gb", descriptor = "Lrd;")
    private class338 field2400;

    @OriginalMember(owner = "client!as", name = "hc", descriptor = "Lgh;")
    private class550 field2453;

    @OriginalMember(owner = "client!as", name = "jc", descriptor = "Lwia;")
    private class761 field2455;

    @OriginalMember(owner = "client!as", name = "w", descriptor = "S")
    private short field2365;

    @OriginalMember(owner = "client!as", name = "y", descriptor = "S")
    private short field2367;

    @OriginalMember(owner = "client!as", name = "kb", descriptor = "S")
    private short field2404;

    @OriginalMember(owner = "client!as", name = "Db", descriptor = "S")
    private short field2423;

    @OriginalMember(owner = "client!as", name = "lc", descriptor = "S")
    private short field2457;

    @OriginalMember(owner = "client!as", name = "yc", descriptor = "S")
    private short field2470;

    @OriginalMember(owner = "client!as", name = "Cc", descriptor = "S")
    private short field2474;

    @OriginalMember(owner = "client!as", name = "Jc", descriptor = "S")
    private short field2481;

    @OriginalMember(owner = "client!as", name = "Gc", descriptor = "[I")
    public static int[] field2478;

    @OriginalMember(owner = "client!as", name = "ia", descriptor = "(SS)V", line = 8)
    public final void method259(short arg0, short arg1) {
        field2411++;
        for (int var3 = 0; var3 < this.field2374; var3++) {
            if (this.field2409[var3] == arg0) {
                this.field2409[var3] = arg1;
            }
        }
        if (this.field2382 != null) {
            for (int var4 = 0; var4 < this.field2465; var4++) {
                class479 var5 = this.field2382[var4];
                class442 var6 = this.field2463[var4];
                var6.field6583 = class324.field4632[this.field2409[var5.field6943] & 0xFFFF] & 0xFFFFFF | var6.field6583 & 0xFF000000;
            }
        }
        if (this.field2398 != null) {
            this.field2398.field3839 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "c", descriptor = "(I)Z", line = 49)
    public static final boolean method1131(int arg0) {
        field2434++;
        if (arg0 != 2) {
            field2475 = 71;
        }
        if (class590.field8364) {
            try {
                if ((Boolean) class121.method877(class466.field6830, "showingVideoAd", -22421)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIII)V", line = 69)
    public final void method267(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field2374; var5++) {
            int var9 = this.field2409[var5] & 0xFFFF;
            int var10 = (var9 & 0xFED9) >> 10;
            int var11 = (var9 & 0x3D8) >> 7;
            if (arg0 != -1) {
                var10 -= -((arg0 - var10) * arg3 >> 7);
            }
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg2 != -1) {
                var12 -= -((arg2 - var12) * arg3 >> 7);
            }
            this.field2409[var5] = (short) class625.method3600(var12, class625.method3600(var11 << 7, var10 << 10));
        }
        field2446++;
        if (this.field2382 != null) {
            for (int var6 = 0; var6 < this.field2465; var6++) {
                class479 var7 = this.field2382[var6];
                class442 var8 = this.field2463[var6];
                var8.field6583 = var8.field6583 & 0xFF000000 | class324.field4632[this.field2409[var7.field6943] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field2398 != null) {
            this.field2398.field3839 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "P", descriptor = "(IIII)V", line = 130)
    public final void method245(int arg0, int arg1, int arg2, int arg3) {
        field2402++;
        if (arg0 == 0) {
            class158.field2517 = 0;
            class184.field2809 = 0;
            class734.field10260 = 0;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field2383; var6++) {
                class734.field10260 += this.field2359[var6];
                class158.field2517 += this.field2437[var6];
                class184.field2809 += this.field2430[var6];
                var5++;
            }
            if (var5 > 0) {
                class158.field2517 = class158.field2517 / var5 + arg2;
                class184.field2809 = class184.field2809 / var5 + arg3;
                class734.field10260 = class734.field10260 / var5 + arg1;
            } else {
                class184.field2809 = arg3;
                class734.field10260 = arg1;
                class158.field2517 = arg2;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field2383; var7++) {
                this.field2359[var7] += arg1;
                this.field2437[var7] += arg2;
                this.field2430[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field2383; var8++) {
                this.field2359[var8] -= class734.field10260;
                this.field2437[var8] -= class158.field2517;
                this.field2430[var8] -= class184.field2809;
                if (arg3 != 0) {
                    int var9 = class373.field5548[arg3];
                    int var10 = class373.field5549[arg3];
                    int var11 = this.field2437[var8] * var9 + this.field2359[var8] * var10 + 16383 >> 14;
                    this.field2437[var8] = this.field2437[var8] * var10 + 16383 - (this.field2359[var8] * var9) >> 14;
                    this.field2359[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class373.field5548[arg1];
                    int var13 = class373.field5549[arg1];
                    int var14 = this.field2437[var8] * var13 + 16383 - this.field2430[var8] * var12 >> 14;
                    this.field2430[var8] = this.field2437[var8] * var12 + (this.field2430[var8] * var13) + 16383 >> 14;
                    this.field2437[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class373.field5548[arg2];
                    int var16 = class373.field5549[arg2];
                    int var17 = this.field2430[var8] * var15 + this.field2359[var8] * var16 + 16383 >> 14;
                    this.field2430[var8] = this.field2430[var8] * var16 + 16383 - (this.field2359[var8] * var15) >> 14;
                    this.field2359[var8] = var17;
                }
                this.field2359[var8] += class734.field10260;
                this.field2437[var8] += class158.field2517;
                this.field2430[var8] += class184.field2809;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field2383; var18++) {
                this.field2359[var18] -= class734.field10260;
                this.field2437[var18] -= class158.field2517;
                this.field2430[var18] -= class184.field2809;
                this.field2359[var18] = this.field2359[var18] * arg1 / 128;
                this.field2437[var18] = this.field2437[var18] * arg2 / 128;
                this.field2430[var18] = this.field2430[var18] * arg3 / 128;
                this.field2359[var18] += class734.field10260;
                this.field2437[var18] += class158.field2517;
                this.field2430[var18] += class184.field2809;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field2374; var19++) {
                int var23 = (this.field2473[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field2473[var19] = (byte) var23;
            }
            if (this.field2398 != null) {
                this.field2398.field3839 = null;
            }
            if (this.field2382 != null) {
                for (int var20 = 0; var20 < this.field2465; var20++) {
                    class479 var21 = this.field2382[var20];
                    class442 var22 = this.field2463[var20];
                    var22.field6583 = var22.field6583 & 0xFFFFFF | 255 - (this.field2473[var21.field6943] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field2374; var24++) {
                int var28 = this.field2409[var24] & 0xFFFF;
                int var29 = (var28 & 0xFE22) >> 10;
                int var30 = var28 >> 7 & 0x7;
                int var31 = var29 + arg1 & 0x3F;
                int var32 = arg2 / 4 + var30;
                int var33 = var28 & 0x7F;
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 7) {
                    var32 = 7;
                }
                int var34 = arg3 + var33;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field2409[var24] = (short) class625.method3600(class625.method3600(var32 << 7, var31 << 10), var34);
            }
            if (this.field2398 != null) {
                this.field2398.field3839 = null;
            }
            if (this.field2382 != null) {
                for (int var25 = 0; var25 < this.field2465; var25++) {
                    class479 var26 = this.field2382[var25];
                    class442 var27 = this.field2463[var25];
                    var27.field6583 = class324.field4632[this.field2409[var26.field6943] & 0xFFFF] & 0xFFFFFF | var27.field6583 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field2465; var35++) {
                class442 var36 = this.field2463[var35];
                var36.field6586 += arg1;
                var36.field6576 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field2465; var37++) {
                class442 var38 = this.field2463[var37];
                var38.field6579 = var38.field6579 * arg1 >> 7;
                var38.field6584 = var38.field6584 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field2465; var39++) {
                class442 var40 = this.field2463[var39];
                var40.field6578 = var40.field6578 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!as", name = "O", descriptor = "(III)V", line = 443)
    public final void method286(int arg0, int arg1, int arg2) {
        field2392++;
        for (int var4 = 0; var4 < this.field2383; var4++) {
            if (arg0 != 128) {
                this.field2359[var4] = this.field2359[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field2437[var4] = this.field2437[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field2430[var4] = this.field2430[var4] * arg2 >> 7;
            }
        }
        if (this.field2403 != null) {
            this.field2403.field3839 = null;
        }
        this.field2439 = false;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(BIZ)Lka;", line = 475)
    public final class473 method251(byte arg0, int arg1, boolean arg2) {
        field2448++;
        class153 var4;
        class153 var5;
        if (arg0 == 1) {
            var4 = this.field2427.field2241;
            var5 = this.field2427.field2303;
        } else if (arg0 == 2) {
            var4 = this.field2427.field2283;
            var5 = this.field2427.field2242;
        } else if (arg0 == 3) {
            var4 = this.field2427.field2293;
            var5 = this.field2427.field2302;
        } else if (arg0 == 4) {
            var4 = this.field2427.field2221;
            var5 = this.field2427.field2220;
        } else if (arg0 == 5) {
            var4 = this.field2427.field2225;
            var5 = this.field2427.field2246;
        } else {
            var4 = var5 = new class153(this.field2427);
        }
        return this.method1143(var4, arg1, var5, 0, arg2, arg0 != 0);
    }

    @OriginalMember(owner = "client!as", name = "na", descriptor = "()I", line = 525)
    public final int method256() {
        if (!this.field2439) {
            this.method1141(32767);
        }
        field2414++;
        return this.field2457;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Loca;Z)V", line = 537)
    private final void method1132(class265 arg0, boolean arg1) {
        field2449++;
        if (this.field2412 > this.field2427.field2316.length) {
            this.field2427.field2319 = new int[this.field2412];
            this.field2427.field2316 = new int[this.field2412];
        }
        int[] var3 = this.field2427.field2316;
        int[] var4 = this.field2427.field2319;
        for (int var5 = 0; var5 < this.field2383; var5++) {
            int var16 = (this.field2359[var5] - (this.field2437[var5] * this.field2427.field2230 >> 8) >> this.field2427.field2171) - arg0.field3792;
            int var17 = (this.field2430[var5] - (this.field2437[var5] * this.field2427.field2252 >> 8) >> this.field2427.field2171) - arg0.field3791;
            int var18 = this.field2413[var5];
            int var19 = this.field2413[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field2410[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        int var6 = 0;
        if (!arg1) {
            this.field2470 = 87;
        }
        while (var6 < this.field2399) {
            if (this.field2473 == null || this.field2473[var6] <= 128) {
                short var7 = this.field2405[var6];
                short var8 = this.field2440[var6];
                short var9 = this.field2431[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var14 - var15) * (var10 - var11) - (var12 - var11) * (var14 - var13) > 0) {
                    arg0.method1708(var15, var12, var14, (byte) -93, var13, var11, var10);
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!as", name = "ua", descriptor = "()I", line = 627)
    public final int method255() {
        field2395++;
        return this.field2472;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "()[Lwr;", line = 637)
    public final class459[] method266() {
        field2371++;
        return this.field2468;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(BSIII)I", line = 645)
    private final int method1133(byte arg0, short arg1, int arg2, int arg3, int arg4) {
        field2363++;
        if (arg2 <= 101) {
            this.field2465 = -36;
        }
        int var6 = class324.field4632[class313.method1979(arg3, arg4, -22372)];
        if (arg1 != -1) {
            class293 var7 = this.field2427.field849.method1124((byte) 25, arg1 & 0xFFFF);
            int var8 = var7.field4179 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg4 < 0) {
                    var9 = 0;
                } else if (arg4 <= 127) {
                    var9 = arg4 * 131586;
                } else {
                    var9 = 16777215;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) + ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field4193 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = (var6 >> 16 & 0xFF) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (var6 >> 8 & 0xFF) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (var6 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                var6 = (var15 >> 8) + ((var13 & 0xAC00FF00) << 8) + (var14 & 0xFF00);
            }
        }
        return (var6 << 8) + 255 - (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IZILql;III)Z", line = 720)
    private final boolean method1134(int arg0, boolean arg1, int arg2, class738 arg3, int arg4, int arg5, int arg6) {
        field2408++;
        class607 var8 = (class607) arg3;
        class607 var9 = this.field2427.field2200;
        float var10 = var8.field8563 * var9.field8591 + var8.field8590 * var9.field8572 + var8.field8575 * var9.field8562 + var9.field8575;
        float var11 = var8.field8563 * var9.field8558 + var8.field8590 * var9.field8564 + var8.field8575 * var9.field8578 + var9.field8590;
        class707.field9959 = var8.field8583 * var9.field8558 + var8.field8578 * var9.field8564 + var8.field8562 * var9.field8578;
        class154.field2506 = var8.field8581 * var9.field8558 + var8.field8591 * var9.field8578 + var8.field8558 * var9.field8564;
        class547.field7805 = var8.field8567 * var9.field8558 + var8.field8572 * var9.field8578 + var8.field8564 * var9.field8564;
        class190.field2884 = var8.field8583 * var9.field8581 + var8.field8578 * var9.field8567 + var8.field8562 * var9.field8583;
        class671.field9365 = var8.field8581 * var9.field8581 + var8.field8591 * var9.field8583 + var8.field8558 * var9.field8567;
        class145.field1935 = var8.field8567 * var9.field8591 + var8.field8572 * var9.field8562 + var8.field8564 * var9.field8572;
        class287.field4079 = var8.field8583 * var9.field8591 + var8.field8578 * var9.field8572 + var8.field8562 * var9.field8562;
        float var12 = var8.field8563 * var9.field8581 + var8.field8590 * var9.field8567 + var8.field8575 * var9.field8583 + var9.field8563;
        class635.field8931 = var8.field8567 * var9.field8581 + var8.field8572 * var9.field8583 + var8.field8564 * var9.field8567;
        class242.field3517 = var8.field8581 * var9.field8591 + var8.field8591 * var9.field8562 + var8.field8558 * var9.field8572;
        boolean var13 = false;
        float var14 = Float.MAX_VALUE;
        float var15 = -3.4028235E38F;
        float var16 = Float.MAX_VALUE;
        float var17 = -3.4028235E38F;
        int var18 = this.field2427.field2247;
        int var19 = this.field2427.field2251;
        if (!this.field2439) {
            this.method1141(32767);
        }
        int var20 = this.field2423 - this.field2404 >> 1;
        int var21 = this.field2474 - this.field2481 >> 1;
        int var22 = this.field2470 - this.field2365 >> 1;
        int var23 = this.field2404 + var20;
        int var24 = this.field2481 + var21;
        int var25 = this.field2365 + var22;
        int var26 = var23 - (var20 << arg0);
        int var27 = var24 - (var21 << arg0);
        int var28 = var25 - (var22 << arg0);
        int var29 = (var20 << arg0) + var23;
        int var30 = (var21 << arg0) + var24;
        class394.field5920[0] = var26;
        int var31 = (var22 << arg0) + var25;
        class760.field10603[0] = var27;
        class282.field4003[0] = var28;
        class394.field5920[1] = var29;
        class760.field10603[1] = var27;
        class282.field4003[arg6] = var28;
        class394.field5920[2] = var26;
        class760.field10603[2] = var30;
        class394.field5920[3] = var29;
        class282.field4003[2] = var28;
        class760.field10603[3] = var30;
        class394.field5920[4] = var26;
        class282.field4003[3] = var28;
        class760.field10603[4] = var27;
        class282.field4003[4] = var31;
        class394.field5920[5] = var29;
        class760.field10603[5] = var27;
        class394.field5920[6] = var26;
        class282.field4003[5] = var31;
        class760.field10603[6] = var30;
        class282.field4003[6] = var31;
        class394.field5920[7] = var29;
        class760.field10603[7] = var30;
        class282.field4003[7] = var31;
        for (int var32 = 0; var32 < 8; var32++) {
            float var53 = (float) class394.field5920[var32];
            float var54 = (float) class760.field10603[var32];
            float var55 = (float) class282.field4003[var32];
            float var56 = class671.field9365 * var55 + class635.field8931 * var54 + class190.field2884 * var53 + var12;
            float var57 = class154.field2506 * var55 + class707.field9959 * var53 + class547.field7805 * var54 + var11;
            float var58 = class242.field3517 * var55 + class287.field4079 * var53 + class145.field1935 * var54 + var10;
            if ((float) this.field2427.field2306 <= var56) {
                if (arg5 > 0) {
                    var56 = arg5;
                }
                float var59 = (float) var18 * var58 / var56 + (float) this.field2427.field2280;
                float var60 = (float) var19 * var57 / var56 + (float) this.field2427.field2232;
                if (var14 > var59) {
                    var14 = var59;
                }
                if (var15 < var59) {
                    var15 = var59;
                }
                var13 = true;
                if (var60 < var16) {
                    var16 = var60;
                }
                if (var17 < var60) {
                    var17 = var60;
                }
            }
        }
        if (var13 && (float) arg4 > var14 && (float) arg4 < var15 && (float) arg2 > var16 && (float) arg2 < var17) {
            if (arg1) {
                return true;
            }
            if (this.field2412 > this.field2427.field2316.length) {
                this.field2427.field2316 = new int[this.field2412];
                this.field2427.field2319 = new int[this.field2412];
            }
            int[] var33 = this.field2427.field2316;
            int[] var34 = this.field2427.field2319;
            for (int var35 = 0; var35 < this.field2383; var35++) {
                float var37 = (float) this.field2359[var35];
                float var38 = (float) this.field2437[var35];
                float var39 = (float) this.field2430[var35];
                float var40 = class154.field2506 * var39 + class707.field9959 * var37 + class547.field7805 * var38 + var11;
                float var41 = class671.field9365 * var39 + class635.field8931 * var38 + class190.field2884 * var37 + var12;
                float var42 = class242.field3517 * var39 + class287.field4079 * var37 + class145.field1935 * var38 + var10;
                if ((var41 >= (float) this.field2427.field2306)) {
                    if (arg5 > 0) {
                        var41 = arg5;
                    }
                    int var47 = (int) ((float) var18 * var42 / var41 + (float) this.field2427.field2280);
                    int var48 = (int) ((float) var19 * var40 / var41 + (float) this.field2427.field2232);
                    int var49 = this.field2413[var35];
                    int var50 = this.field2413[var35 + 1];
                    for (int var51 = var49; var51 < var50; var51++) {
                        int var52 = this.field2410[var51] - 1;
                        if (var52 == -1) {
                            break;
                        }
                        var33[var52] = var47;
                        var34[var52] = var48;
                    }
                } else {
                    int var43 = this.field2413[var35];
                    int var44 = this.field2413[var35 + 1];
                    for (int var45 = var43; var45 < var44; var45++) {
                        int var46 = this.field2410[var45] - 1;
                        if (var46 == -1) {
                            break;
                        }
                        var33[this.field2410[var45] - 1] = -999999;
                    }
                }
            }
            for (int var36 = 0; var36 < this.field2374; var36++) {
                if (var33[this.field2405[var36]] != -999999 && var33[this.field2440[var36]] != -999999 && var33[this.field2431[var36]] != -999999 && this.method1138((byte) 66, var34[this.field2440[var36]], arg2, var34[this.field2431[var36]], arg4, var33[this.field2440[var36]], var33[this.field2431[var36]], var33[this.field2405[var36]], var34[this.field2405[var36]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!as", name = "NA", descriptor = "()Z", line = 961)
    public final boolean method273() {
        field2370++;
        if (this.field2420 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field2424; var1++) {
            this.field2359[var1] <<= 0x4;
            this.field2437[var1] <<= 0x4;
            this.field2430[var1] <<= 0x4;
        }
        class184.field2809 = 0;
        class734.field10260 = 0;
        class158.field2517 = 0;
        return true;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lql;IZ)V", line = 994)
    public final void method276(class738 arg0, int arg1, boolean arg2) {
        field2356++;
        if (this.field2401 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field2383; var5++) {
            if ((arg1 & this.field2401[var5]) != 0) {
                if (arg2) {
                    arg0.method766(this.field2359[var5], this.field2437[var5], this.field2430[var5], var4);
                } else {
                    arg0.method767(this.field2359[var5], this.field2437[var5], this.field2430[var5], var4);
                }
                this.field2359[var5] = var4[0];
                this.field2437[var5] = var4[1];
                this.field2430[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!as", name = "r", descriptor = "()Z", line = 1030)
    public final boolean method262() {
        field2419++;
        return this.field2378;
    }

    @OriginalMember(owner = "client!as", name = "c", descriptor = "()V", line = 1039)
    public final void method272() {
        field2432++;
        if (this.field2412 <= 0 || this.field2399 <= 0) {
            return;
        }
        this.method1136(78, false);
        if ((this.field2415 & 0x10) == 0 && this.field2366.field1359 == null) {
            this.method1142(false, 1600);
        }
        this.method1144(10391);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lql;Leda;II)V", line = 1060)
    public final void method235(class738 arg0, class102 arg1, int arg2, int arg3) {
        field2426++;
        if (this.field2412 == 0) {
            return;
        }
        class607 var5 = this.field2427.field2200;
        if (!this.field2439) {
            this.method1141(32767);
        }
        class607 var6 = (class607) arg0;
        class399.field5959 = var5.field8581 * var6.field8563 + var5.field8583 * var6.field8575 + var5.field8567 * var6.field8590 + var5.field8563;
        class635.field8931 = var5.field8581 * var6.field8567 + var5.field8583 * var6.field8572 + var5.field8567 * var6.field8564;
        float var7 = (float) this.field2481 * class635.field8931 + class399.field5959;
        float var8 = (float) this.field2474 * class635.field8931 + class399.field5959;
        float var9;
        float var10;
        if (var7 > var8) {
            var9 = (float) this.field2457 + var7;
            var10 = var8 - (float) this.field2457;
        } else {
            var9 = (float) this.field2457 + var8;
            var10 = var7 - (float) this.field2457;
        }
        if ((var10 >= this.field2427.field2222) || ((float) this.field2427.field2306 >= var9)) {
            return;
        }
        class269.field3850 = var5.field8591 * var6.field8563 + var5.field8572 * var6.field8590 + var5.field8562 * var6.field8575 + var5.field8575;
        class145.field1935 = var5.field8591 * var6.field8567 + var5.field8572 * var6.field8564 + var5.field8562 * var6.field8572;
        float var11 = (float) this.field2481 * class145.field1935 + class269.field3850;
        float var12 = (float) this.field2474 * class145.field1935 + class269.field3850;
        float var13;
        float var14;
        if (var12 < var11) {
            var13 = ((float) this.field2457 + var11) * (float) this.field2427.field2247;
            var14 = (var12 - (float) this.field2457) * (float) this.field2427.field2247;
        } else {
            var13 = ((float) this.field2457 + var12) * (float) this.field2427.field2247;
            var14 = ((float) (-this.field2457) + var11) * (float) this.field2427.field2247;
        }
        if ((var14 / (float) arg2 >= this.field2427.field2284) || (var13 / (float) arg2 <= this.field2427.field2282)) {
            return;
        }
        class547.field7805 = var5.field8558 * var6.field8567 + var5.field8578 * var6.field8572 + var5.field8564 * var6.field8564;
        class446.field6616 = var5.field8558 * var6.field8563 + var5.field8578 * var6.field8575 + var5.field8564 * var6.field8590 + var5.field8590;
        float var15 = (float) this.field2481 * class547.field7805 + class446.field6616;
        float var16 = (float) this.field2474 * class547.field7805 + class446.field6616;
        float var17;
        float var18;
        if (var16 < var15) {
            var17 = ((float) this.field2457 + var15) * (float) this.field2427.field2251;
            var18 = ((float) (-this.field2457) + var16) * (float) this.field2427.field2251;
        } else {
            var17 = ((float) this.field2457 + var16) * (float) this.field2427.field2251;
            var18 = ((float) (-this.field2457) + var15) * (float) this.field2427.field2251;
        }
        if ((this.field2427.field2250 <= var18 / (float) arg2) || (this.field2427.field2308 >= var17 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field2382 != null) {
            class154.field2506 = var5.field8558 * var6.field8581 + var5.field8578 * var6.field8591 + var5.field8564 * var6.field8558;
            class242.field3517 = var5.field8591 * var6.field8581 + var5.field8572 * var6.field8558 + var5.field8562 * var6.field8591;
            class671.field9365 = var5.field8581 * var6.field8581 + var5.field8583 * var6.field8591 + var5.field8567 * var6.field8558;
            class707.field9959 = var5.field8558 * var6.field8583 + var5.field8578 * var6.field8562 + var5.field8564 * var6.field8578;
            class190.field2884 = var5.field8581 * var6.field8583 + var5.field8583 * var6.field8562 + var5.field8567 * var6.field8578;
            class287.field4079 = var5.field8591 * var6.field8583 + var5.field8572 * var6.field8578 + var5.field8562 * var6.field8562;
        }
        if (arg1 != null) {
            int var19 = this.field2423 + this.field2404 >> 1;
            int var20 = this.field2470 + this.field2365 >> 1;
            int var21 = (int) ((float) var20 * class242.field3517 + (float) this.field2481 * class145.field1935 + (float) var19 * class287.field4079 + class269.field3850);
            int var22 = (int) ((float) var20 * class154.field2506 + (float) this.field2481 * class547.field7805 + (float) var19 * class707.field9959 + class446.field6616);
            int var23 = (int) ((float) var20 * class671.field9365 + (float) this.field2481 * class635.field8931 + (float) var19 * class190.field2884 + class399.field5959);
            int var24 = (int) ((float) var20 * class242.field3517 + (float) this.field2474 * class145.field1935 + (float) var19 * class287.field4079 + class269.field3850);
            int var25 = (int) ((float) var20 * class154.field2506 + (float) this.field2474 * class547.field7805 + (float) var19 * class707.field9959 + class446.field6616);
            arg1.field1434 = this.field2427.field2251 * var25 / arg2 + this.field2427.field2232;
            arg1.field1432 = this.field2427.field2247 * var21 / arg2 + this.field2427.field2280;
            arg1.field1431 = this.field2427.field2232 + (this.field2427.field2251 * var22 / arg2);
            int var26 = (int) ((float) var20 * class671.field9365 + (float) this.field2474 * class635.field8931 + (float) var19 * class190.field2884 + class399.field5959);
            arg1.field1433 = this.field2427.field2247 * var24 / arg2 + this.field2427.field2280;
            if (var23 >= this.field2427.field2306 || var26 >= this.field2427.field2306) {
                arg1.field1429 = this.field2427.field2280 + ((this.field2457 + var21) * this.field2427.field2247 / arg2) - arg1.field1432;
                arg1.field1430 = true;
            }
        }
        this.field2427.method1040(3, (float) arg2);
        this.field2427.method1083(11939);
        this.field2427.method1078(10, var6);
        this.method1145((byte) -63);
        this.field2427.method1081((byte) 15);
        this.method1135(8618);
    }

    @OriginalMember(owner = "client!as", name = "da", descriptor = "()I", line = 1210)
    public final int method268() {
        field2442++;
        return this.field2384;
    }

    @OriginalMember(owner = "client!as", name = "v", descriptor = "()V", line = 1225)
    public final void method240() {
        field2450++;
        for (int var1 = 0; var1 < this.field2383; var1++) {
            this.field2430[var1] = -this.field2430[var1];
        }
        for (int var2 = 0; var2 < this.field2412; var2++) {
            this.field2452[var2] = (short) (-this.field2452[var2]);
        }
        for (int var3 = 0; var3 < this.field2374; var3++) {
            short var4 = this.field2405[var3];
            this.field2405[var3] = this.field2431[var3];
            this.field2431[var3] = var4;
        }
        if (this.field2376 == null && this.field2398 != null) {
            this.field2398.field3839 = null;
        }
        if (this.field2376 != null) {
            this.field2376.field3839 = null;
        }
        if (this.field2366 != null) {
            this.field2366.field1359 = null;
        }
        this.field2439 = false;
        if (this.field2403 != null) {
            this.field2403.field3839 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "d", descriptor = "(I)V", line = 1281)
    private final void method1135(int arg0) {
        if (this.field2382 != null) {
            class607 var2 = this.field2427.field2164;
            this.field2427.method1072(2);
            this.field2427.method463(!this.field2467);
            this.field2427.method1089(false, 120);
            this.field2427.method1048(this.field2427.field2245, arg0 + 7766, null, this.field2427.field2272, null);
            for (int var3 = 0; var3 < this.field2465; var3++) {
                class479 var4 = this.field2382[var3];
                class442 var5 = this.field2463[var3];
                if (!var4.field6945 || !this.field2427.method441()) {
                    float var6 = (float) (this.field2359[var4.field6951] + this.field2359[var4.field6942] + this.field2359[var4.field6949]) * 0.3333333F;
                    float var7 = (float) (this.field2437[var4.field6951] + this.field2437[var4.field6942] + this.field2437[var4.field6949]) * 0.3333333F;
                    float var8 = (float) (this.field2430[var4.field6951] + this.field2430[var4.field6949] + this.field2430[var4.field6942]) * 0.3333333F;
                    float var9 = class242.field3517 * var8 + class287.field4079 * var6 + class145.field1935 * var7 + class269.field3850;
                    float var10 = class154.field2506 * var8 + class707.field9959 * var6 + class547.field7805 * var7 + class446.field6616;
                    float var11 = class671.field9365 * var8 + class635.field8931 * var7 + class190.field2884 * var6 + class399.field5959;
                    float var12 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + var9 * var9 + var10 * var10))) * (float) var4.field6950;
                    var2.method3523(53, var10 * var12 + (float) var5.field6576 - var10, var11 * var12 + -var11, var4.field6952 * var5.field6579 >> 7, (float) var5.field6586 + var9 - var9 * var12, var5.field6578, var4.field6944 * var5.field6584 >> 7);
                    this.field2427.method1099(var2, -25906);
                    int var13 = var5.field6583;
                    OpenGL.glColor4ub((byte) (var13 >> 16), (byte) (var13 >> 8), (byte) var13, (byte) (var13 >> 24));
                    this.field2427.method1058(var4.field6941, -100);
                    this.field2427.method1039(false, var4.field6939);
                    this.field2427.method1075(4, 7, 0, 125);
                }
            }
            this.field2427.method463(true);
            this.field2427.method1081((byte) 15);
        }
        if (arg0 == 8618) {
            field2380++;
        }
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lwh;)V", line = 5791)
    public class153(class148 arg0) {
        this.field2427 = arg0;
        this.field2403 = new class268(null, 5126, 3, 0);
        this.field2444 = new class268(null, 5126, 2, 0);
        this.field2376 = new class268(null, 5126, 3, 0);
        this.field2398 = new class268(null, 5121, 4, 0);
        this.field2366 = new class96();
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lwh;Ldh;IIII)V", line = 5803)
    public class153(class148 arg0, class322 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2472 = arg2;
        this.field2438 = arg5;
        this.field2427 = arg0;
        if (class243.method1620(true, arg2, arg5)) {
            this.field2403 = new class268(null, 5126, 3, 0);
        }
        if (class111.method833(false, arg2, arg5)) {
            this.field2444 = new class268(null, 5126, 2, 0);
        }
        if (class289.method1849(arg5, arg2, (byte) 84)) {
            this.field2376 = new class268(null, 5126, 3, 0);
        }
        if (class510.method3023(arg5, arg2, 31169)) {
            this.field2398 = new class268(null, 5121, 4, 0);
        }
        if (class546.method3196(arg2, (byte) 38, arg5)) {
            this.field2366 = new class96();
        }
        class151 var7 = arg0.field849;
        int[] var8 = new int[arg1.field4593];
        this.field2413 = new int[arg1.field4568 + 1];
        for (int var9 = 0; var9 < arg1.field4593; var9++) {
            if (arg1.field4571 == null || arg1.field4571[var9] != 2) {
                if (arg1.field4592 != null && arg1.field4592[var9] != -1) {
                    class293 var173 = var7.method1124((byte) -123, arg1.field4592[var9] & 0xFFFF);
                    if (((this.field2438 & 0x40) == 0 || !var173.field4184) && var173.field4187) {
                        continue;
                    }
                }
                var8[this.field2374++] = var9;
                this.field2413[arg1.field4567[var9]]++;
                this.field2413[arg1.field4563[var9]]++;
                this.field2413[arg1.field4572[var9]]++;
            }
        }
        this.field2399 = this.field2374;
        long[] var10 = new long[this.field2374];
        boolean var11 = (this.field2472 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field2374; var12++) {
            int var156 = var8[var12];
            class293 var157 = null;
            int var158 = 0;
            byte var159 = 0;
            byte var160 = 0;
            byte var161 = 0;
            if (arg1.field4581 != null) {
                boolean var162 = false;
                for (int var163 = 0; var163 < arg1.field4581.length; var163++) {
                    class542 var164 = arg1.field4581[var163];
                    if (var164.field7728 == var156) {
                        class702 var165 = class495.method2947(var164.field7727, (byte) -79);
                        if (var165.field9790) {
                            var162 = true;
                        }
                        if (var165.field9787 != -1) {
                            class293 var166 = var7.method1124((byte) 85, var165.field9787);
                            if (var166.field4192 == 2) {
                                this.field2467 = true;
                            }
                        }
                    }
                }
                if (var162) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field2399--;
                    continue;
                }
            }
            short var167 = -1;
            if (arg1.field4592 != null) {
                var167 = arg1.field4592[var156];
                if (var167 != -1) {
                    var157 = var7.method1124((byte) 46, var167 & 0xFFFF);
                    if ((this.field2438 & 0x40) != 0 && var157.field4184) {
                        var157 = null;
                        var167 = -1;
                    } else {
                        if (var157.field4188 != 0 || var157.field4171 != 0) {
                            this.field2378 = true;
                        }
                        var161 = var157.field4176;
                        var160 = var157.field4185;
                    }
                }
            }
            boolean var168 = arg1.field4552 != null && arg1.field4552[var156] != 0 || var157 != null && var157.field4192 != 0;
            if ((var11 || var168) && arg1.field4591 != null) {
                var158 += arg1.field4591[var156] << 17;
            }
            if (var168) {
                var158 += 65536;
            }
            int var169 = (var160 & 0xFF << 8) + var158;
            int var170 = (var167 & 0xFFFF << 16) + var159;
            int var171 = (var161 & 0xFF) + var169;
            int var172 = (var12 & 0xFFFF) + var170;
            var10[var12] = ((long) var171 << 32) + (long) var172;
            this.field2467 |= var168;
            this.field2378 |= var157 != null && (var157.field4188 != 0 || var157.field4171 != 0);
        }
        class334.method2109(var8, (byte) -93, var10);
        this.field2401 = arg1.field4587;
        this.field2383 = arg1.field4568;
        this.field2430 = arg1.field4553;
        this.field2437 = arg1.field4564;
        this.field2424 = arg1.field4590;
        this.field2359 = arg1.field4561;
        this.field2358 = arg1.field4589;
        class29[] var13 = new class29[this.field2383];
        this.field2468 = arg1.field4562;
        if (arg1.field4581 != null) {
            this.field2465 = arg1.field4581.length;
            this.field2382 = new class479[this.field2465];
            this.field2463 = new class442[this.field2465];
            for (int var14 = 0; var14 < this.field2465; var14++) {
                class542 var15 = arg1.field4581[var14];
                class702 var16 = class495.method2947(var15.field7727, (byte) -79);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field2374; var18++) {
                    if (var8[var18] == var15.field7728) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class324.field4632[arg1.field4604[var15.field7728] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field4552 == null ? 0 : arg1.field4552[var15.field7728]) << 24;
                this.field2382[var14] = new class479(var17, arg1.field4567[var15.field7728], arg1.field4563[var15.field7728], arg1.field4572[var15.field7728], var16.field9794, var16.field9792, var16.field9787, var16.field9785, var16.field9791, var16.field9790, var16.field9793, var15.field7733);
                this.field2463[var14] = new class442(var20);
            }
        }
        int var21 = this.field2374 * 3;
        this.field2431 = new short[this.field2374];
        this.field2440 = new short[this.field2374];
        class704.field9899 = new long[var21];
        this.field2459 = new short[var21];
        this.field2364 = new short[var21];
        this.field2384 = (short) arg4;
        this.field2390 = new float[var21];
        if (arg1.field4598 != null) {
            this.field2466 = new short[this.field2374];
        }
        this.field2409 = new short[this.field2374];
        this.field2361 = (short) arg3;
        this.field2405 = new short[this.field2374];
        this.field2369 = new byte[var21];
        this.field2473 = new byte[this.field2374];
        this.field2452 = new short[var21];
        this.field2425 = new short[this.field2374];
        this.field2410 = new short[var21];
        this.field2429 = new float[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field4568; var23++) {
            int var155 = this.field2413[var23];
            this.field2413[var23] = var22;
            var13[var23] = new class29();
            var22 += var155;
        }
        this.field2413[arg1.field4568] = var22;
        class445 var24 = class149.method1112(this.field2374, arg1, var8, -3);
        class640[] var25 = new class640[arg1.field4593];
        for (int var26 = 0; var26 < arg1.field4593; var26++) {
            short var134 = arg1.field4567[var26];
            short var135 = arg1.field4563[var26];
            short var136 = arg1.field4572[var26];
            int var137 = this.field2359[var135] - this.field2359[var134];
            int var138 = this.field2437[var135] - this.field2437[var134];
            int var139 = this.field2430[var135] - this.field2430[var134];
            int var140 = this.field2359[var136] - this.field2359[var134];
            int var141 = this.field2437[var136] - this.field2437[var134];
            int var142 = this.field2430[var136] - this.field2430[var134];
            int var143 = var138 * var142 - (var139 * var141);
            int var144 = var139 * var140 - (var137 * var142);
            int var145 = var137 * var141 - (var138 * var140);
            while (var143 > 8192 || var144 > 8192 || var145 > 8192 || var143 < -8192 || var144 < -8192 || var145 < -8192) {
                var143 >>= 0x1;
                var145 >>= 0x1;
                var144 >>= 0x1;
            }
            int var146 = (int) Math.sqrt((double) (var144 * var144 + (var143 * var143 + (var145 * var145))));
            if (var146 <= 0) {
                var146 = 1;
            }
            int var147 = var145 * 256 / var146;
            int var148 = var143 * 256 / var146;
            int var149 = var144 * 256 / var146;
            byte var150 = arg1.field4571 == null ? 0 : arg1.field4571[var26];
            if (var150 == 0) {
                class29 var151 = var13[var134];
                var151.field280++;
                var151.field282 += var147;
                var151.field279 += var149;
                var151.field285 += var148;
                class29 var152 = var13[var135];
                var152.field279 += var149;
                var152.field285 += var148;
                var152.field280++;
                var152.field282 += var147;
                class29 var153 = var13[var136];
                var153.field282 += var147;
                var153.field280++;
                var153.field279 += var149;
                var153.field285 += var148;
            } else if (var150 == 1) {
                class640 var154 = var25[var26] = new class640();
                var154.field8985 = var149;
                var154.field8982 = var147;
                var154.field8983 = var148;
            }
        }
        for (int var27 = 0; var27 < this.field2374; var27++) {
            int var43 = var8[var27];
            int var44 = arg1.field4604[var43] & 0xFFFF;
            int var45;
            if (arg1.field4597 == null) {
                var45 = -1;
            } else {
                var45 = arg1.field4597[var43];
            }
            int var46;
            if (arg1.field4552 == null) {
                var46 = 0;
            } else {
                var46 = arg1.field4552[var43] & 0xFF;
            }
            short var47 = arg1.field4592 == null ? -1 : arg1.field4592[var43];
            if (var47 != -1 && (this.field2438 & 0x40) != 0) {
                class293 var48 = var7.method1124((byte) -120, var47 & 0xFFFF);
                if (var48.field4184) {
                    var47 = -1;
                }
            }
            float var49 = 0.0F;
            float var50 = 0.0F;
            float var51 = 0.0F;
            float var52 = 0.0F;
            float var53 = 0.0F;
            float var54 = 0.0F;
            byte var55 = 0;
            byte var56 = 0;
            int var57 = 0;
            if (var47 != -1) {
                if (var45 == -1) {
                    var56 = 2;
                    var55 = 1;
                    var54 = 0.0F;
                    var53 = 0.0F;
                    var50 = 1.0F;
                    var52 = 1.0F;
                    var49 = 0.0F;
                    var51 = 1.0F;
                } else {
                    var45 &= 0xFF;
                    byte var58 = arg1.field4558[var45];
                    if (var58 == 0) {
                        short var87 = arg1.field4567[var43];
                        short var88 = arg1.field4563[var43];
                        short var89 = arg1.field4572[var43];
                        short var90 = arg1.field4580[var45];
                        short var91 = arg1.field4601[var45];
                        short var92 = arg1.field4594[var45];
                        float var93 = (float) arg1.field4561[var90];
                        float var94 = (float) arg1.field4564[var90];
                        float var95 = (float) arg1.field4553[var90];
                        float var96 = (float) arg1.field4561[var91] - var93;
                        float var97 = (float) arg1.field4564[var91] - var94;
                        float var98 = (float) arg1.field4553[var91] - var95;
                        float var99 = (float) arg1.field4561[var92] - var93;
                        float var100 = (float) arg1.field4564[var92] - var94;
                        float var101 = (float) arg1.field4553[var92] - var95;
                        float var102 = (float) arg1.field4561[var87] - var93;
                        float var103 = (float) arg1.field4564[var87] - var94;
                        float var104 = (float) arg1.field4553[var87] - var95;
                        float var105 = (float) arg1.field4561[var88] - var93;
                        float var106 = (float) arg1.field4564[var88] - var94;
                        float var107 = (float) arg1.field4553[var88] - var95;
                        float var108 = (float) arg1.field4561[var89] - var93;
                        float var109 = (float) arg1.field4564[var89] - var94;
                        float var110 = (float) arg1.field4553[var89] - var95;
                        float var111 = var97 * var101 - var98 * var100;
                        float var112 = var98 * var99 - (var96 * var101);
                        float var113 = var96 * var100 - (var97 * var99);
                        float var114 = var100 * var113 - var101 * var112;
                        float var115 = var101 * var111 - (var99 * var113);
                        float var116 = var99 * var112 - var100 * var111;
                        float var117 = 1.0F / (var98 * var116 + var96 * var114 + var97 * var115);
                        var51 = (var107 * var116 + var105 * var114 + var106 * var115) * var117;
                        var49 = (var104 * var116 + var102 * var114 + var103 * var115) * var117;
                        var53 = (var110 * var116 + var108 * var114 + var109 * var115) * var117;
                        float var118 = var97 * var113 - var98 * var112;
                        float var119 = var98 * var111 - var96 * var113;
                        float var120 = var96 * var112 - var97 * var111;
                        float var121 = 1.0F / (var101 * var120 + var99 * var118 + var100 * var119);
                        var52 = (var107 * var120 + var105 * var118 + var106 * var119) * var121;
                        var54 = (var110 * var120 + var108 * var118 + var109 * var119) * var121;
                        var50 = (var104 * var120 + var102 * var118 + var103 * var119) * var121;
                    } else {
                        short var59 = arg1.field4567[var43];
                        short var60 = arg1.field4563[var43];
                        short var61 = arg1.field4572[var43];
                        int var62 = var24.field6611[var45];
                        int var63 = var24.field6606[var45];
                        int var64 = var24.field6609[var45];
                        float[] var65 = var24.field6608[var45];
                        byte var66 = arg1.field4602[var45];
                        float var67 = (float) arg1.field4600[var45] / 256.0F;
                        if (var58 == 1) {
                            float var85 = (float) arg1.field4588[var45] / 1024.0F;
                            class657.method3797(-74, arg1.field4564[var59], var63, var66, var85, var65, class385.field5816, var64, arg1.field4553[var59], arg1.field4561[var59], var62, var67);
                            var49 = class385.field5816[0];
                            var50 = class385.field5816[1];
                            class657.method3797(-84, arg1.field4564[var60], var63, var66, var85, var65, class385.field5816, var64, arg1.field4553[var60], arg1.field4561[var60], var62, var67);
                            var51 = class385.field5816[0];
                            var52 = class385.field5816[1];
                            class657.method3797(-68, arg1.field4564[var61], var63, var66, var85, var65, class385.field5816, var64, arg1.field4553[var61], arg1.field4561[var61], var62, var67);
                            var53 = class385.field5816[0];
                            var54 = class385.field5816[1];
                            float var86 = var85 / 2.0F;
                            if ((var66 & 0x1) == 0) {
                                if (var86 < var53 - var49) {
                                    var56 = 1;
                                    var53 -= var85;
                                } else if (var86 < var49 - var53) {
                                    var53 += var85;
                                    var56 = 2;
                                }
                                if (var51 - var49 > var86) {
                                    var51 -= var85;
                                    var55 = 1;
                                } else if (var86 < var49 - var51) {
                                    var55 = 2;
                                    var51 += var85;
                                }
                            } else {
                                if ((var86 < var52 - var50)) {
                                    var55 = 1;
                                    var52 -= var85;
                                } else if (var86 < var50 - var52) {
                                    var55 = 2;
                                    var52 += var85;
                                }
                                if ((var54 - var50 > var86)) {
                                    var54 -= var85;
                                    var56 = 1;
                                } else if (var50 - var54 > var86) {
                                    var54 += var85;
                                    var56 = 2;
                                }
                            }
                        } else if (var58 == 2) {
                            float var68 = (float) arg1.field4599[var45] / 256.0F;
                            float var69 = (float) arg1.field4574[var45] / 256.0F;
                            int var70 = arg1.field4561[var60] - arg1.field4561[var59];
                            int var71 = arg1.field4564[var60] - arg1.field4564[var59];
                            int var72 = arg1.field4553[var60] - arg1.field4553[var59];
                            int var73 = arg1.field4561[var61] - arg1.field4561[var59];
                            int var74 = arg1.field4564[var61] - arg1.field4564[var59];
                            int var75 = arg1.field4553[var61] - arg1.field4553[var59];
                            int var76 = var71 * var75 - (var72 * var74);
                            int var77 = var72 * var73 - (var70 * var75);
                            int var78 = var70 * var74 - (var71 * var73);
                            float var79 = 64.0F / (float) arg1.field4560[var45];
                            float var80 = 64.0F / (float) arg1.field4566[var45];
                            float var81 = 64.0F / (float) arg1.field4588[var45];
                            float var82 = (var65[2] * (float) var78 + var65[1] * (float) var77 + var65[0] * (float) var76) / var79;
                            float var83 = (var65[5] * (float) var78 + var65[4] * (float) var77 + var65[3] * (float) var76) / var80;
                            float var84 = (var65[8] * (float) var78 + var65[6] * (float) var76 + var65[7] * (float) var77) / var81;
                            var57 = class192.method1336(10264, var82, var83, var84);
                            class426.method2659(class385.field5816, arg1.field4564[var59], var62, (byte) -84, var63, var64, arg1.field4561[var59], var57, var69, arg1.field4553[var59], var67, var65, var68, var66);
                            var49 = class385.field5816[0];
                            var50 = class385.field5816[1];
                            class426.method2659(class385.field5816, arg1.field4564[var60], var62, (byte) -84, var63, var64, arg1.field4561[var60], var57, var69, arg1.field4553[var60], var67, var65, var68, var66);
                            var52 = class385.field5816[1];
                            var51 = class385.field5816[0];
                            class426.method2659(class385.field5816, arg1.field4564[var61], var62, (byte) -84, var63, var64, arg1.field4561[var61], var57, var69, arg1.field4553[var61], var67, var65, var68, var66);
                            var53 = class385.field5816[0];
                            var54 = class385.field5816[1];
                        } else if (var58 == 3) {
                            class134.method944(var64, var66, -19454, arg1.field4553[var59], arg1.field4561[var59], arg1.field4564[var59], var63, var65, class385.field5816, var67, var62);
                            var50 = class385.field5816[1];
                            var49 = class385.field5816[0];
                            class134.method944(var64, var66, -19454, arg1.field4553[var60], arg1.field4561[var60], arg1.field4564[var60], var63, var65, class385.field5816, var67, var62);
                            var52 = class385.field5816[1];
                            var51 = class385.field5816[0];
                            class134.method944(var64, var66, -19454, arg1.field4553[var61], arg1.field4561[var61], arg1.field4564[var61], var63, var65, class385.field5816, var67, var62);
                            var54 = class385.field5816[1];
                            var53 = class385.field5816[0];
                            if ((var66 & 0x1) == 0) {
                                if (var51 - var49 > 0.5F) {
                                    var55 = 1;
                                    var51--;
                                } else if (var49 - var51 > 0.5F) {
                                    var51++;
                                    var55 = 2;
                                }
                                if ((var53 - var49 > 0.5F)) {
                                    var53--;
                                    var56 = 1;
                                } else if (var49 - var53 > 0.5F) {
                                    var53++;
                                    var56 = 2;
                                }
                            } else {
                                if (var52 - var50 > 0.5F) {
                                    var55 = 1;
                                    var52--;
                                } else if (var50 - var52 > 0.5F) {
                                    var55 = 2;
                                    var52++;
                                }
                                if (var54 - var50 > 0.5F) {
                                    var56 = 1;
                                    var54--;
                                } else if (var50 - var54 > 0.5F) {
                                    var54++;
                                    var56 = 2;
                                }
                            }
                        }
                    }
                }
            }
            byte var122;
            if (arg1.field4571 == null) {
                var122 = 0;
            } else {
                var122 = arg1.field4571[var43];
            }
            if (var122 == 0) {
                long var123 = ((long) (var57 << 24) + ((long) var46) + (long) (var44 << 8) << 32) + (long) (var45 << 2);
                short var125 = arg1.field4567[var43];
                short var126 = arg1.field4563[var43];
                short var127 = arg1.field4572[var43];
                class29 var128 = var13[var125];
                this.field2405[var27] = this.method1139(var125, var49, var128.field280, var128.field285, var128.field279, var128.field282, var50, arg1, 697, var123);
                class29 var129 = var13[var126];
                this.field2440[var27] = this.method1139(var126, var51, var129.field280, var129.field285, var129.field279, var129.field282, var52, arg1, 697, (long) var55 + var123);
                class29 var130 = var13[var127];
                this.field2431[var27] = this.method1139(var127, var53, var130.field280, var130.field285, var130.field279, var130.field282, var54, arg1, 697, (long) var56 + var123);
            } else if (var122 == 1) {
                class640 var131 = var25[var43];
                long var132 = ((long) (var44 << 8) + (long) (var57 << 24) + (long) var46 << 32) + (long) ((var131.field8985 + 256 << 12) + (var131.field8983 > 0 ? 1024 : 2048) + ((var45 << 2) - -(var131.field8982 - -256 << 22)));
                this.field2405[var27] = this.method1139(arg1.field4567[var43], var49, 0, var131.field8983, var131.field8985, var131.field8982, var50, arg1, 697, var132);
                this.field2440[var27] = this.method1139(arg1.field4563[var43], var51, 0, var131.field8983, var131.field8985, var131.field8982, var52, arg1, 697, (long) var55 + var132);
                this.field2431[var27] = this.method1139(arg1.field4572[var43], var53, 0, var131.field8983, var131.field8985, var131.field8982, var54, arg1, 697, (long) var56 + var132);
            }
            if (arg1.field4552 != null) {
                this.field2473[var27] = arg1.field4552[var43];
            }
            if (arg1.field4598 != null) {
                this.field2466[var27] = arg1.field4598[var43];
            }
            this.field2409[var27] = arg1.field4604[var43];
            this.field2425[var27] = var47;
        }
        int var28 = 0;
        short var29 = -10000;
        for (int var30 = 0; var30 < this.field2399; var30++) {
            short var42 = this.field2425[var30];
            if (var29 != var42) {
                var28++;
                var29 = var42;
            }
        }
        this.field2389 = new int[var28 + 1];
        short var31 = -10000;
        int var32 = 0;
        for (int var33 = 0; var33 < this.field2399; var33++) {
            short var41 = this.field2425[var33];
            if (var31 != var41) {
                this.field2389[var32++] = var33;
                var31 = var41;
            }
        }
        this.field2389[var32] = this.field2399;
        class704.field9899 = null;
        this.field2364 = class726.method4095(this.field2364, this.field2412, false);
        this.field2459 = class726.method4095(this.field2459, this.field2412, false);
        this.field2452 = class726.method4095(this.field2452, this.field2412, false);
        this.field2369 = class739.method4141(this.field2369, this.field2412, 14606);
        this.field2429 = class659.method3803(this.field2412, -31948, this.field2429);
        this.field2390 = class659.method3803(this.field2412, -31948, this.field2390);
        if (arg1.field4585 != null && class335.method2111(false, this.field2438, arg2)) {
            this.field2420 = arg1.method2039(false, false);
        }
        if (arg1.field4581 != null && class699.method3966((byte) 23, this.field2438, arg2)) {
            this.field2471 = arg1.method2044(30384);
        }
        if (arg1.field4583 != null && class473.method2850(this.field2438, 0, arg2)) {
            int var34 = 0;
            int[] var35 = new int[256];
            for (int var36 = 0; var36 < this.field2374; var36++) {
                int var40 = arg1.field4583[var8[var36]];
                if (var40 >= 0) {
                    if (var40 > var34) {
                        var34 = var40;
                    }
                    int var10002 = var35[var40]++;
                }
            }
            this.field2391 = new int[var34 + 1][];
            for (int var37 = 0; var37 <= var34; var37++) {
                this.field2391[var37] = new int[var35[var37]];
                var35[var37] = 0;
            }
            for (int var38 = 0; var38 < this.field2374; var38++) {
                int var39 = arg1.field4583[var8[var38]];
                if (var39 >= 0) {
                    this.field2391[var39][var35[var39]++] = var38;
                }
            }
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lka;IIIZ)V", line = 1344)
    public final void method264(class473 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2443++;
        class153 var6 = (class153) arg0;
        if (this.field2374 == 0 || var6.field2374 == 0) {
            return;
        }
        int var7 = var6.field2383;
        int[] var8 = var6.field2359;
        int[] var9 = var6.field2437;
        int[] var10 = var6.field2430;
        short[] var11 = var6.field2364;
        short[] var12 = var6.field2459;
        short[] var13 = var6.field2452;
        byte[] var14 = var6.field2369;
        short[] var15;
        short[] var16;
        short[] var17;
        byte[] var18;
        if (this.field2400 == null) {
            var16 = null;
            var17 = null;
            var15 = null;
            var18 = null;
        } else {
            var15 = this.field2400.field4922;
            var16 = this.field2400.field4920;
            var17 = this.field2400.field4916;
            var18 = this.field2400.field4924;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        byte[] var22;
        if (var6.field2400 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var20 = var6.field2400.field4916;
            var22 = var6.field2400.field4924;
            var19 = var6.field2400.field4920;
            var21 = var6.field2400.field4922;
        }
        int[] var23 = var6.field2413;
        short[] var24 = var6.field2410;
        if (!var6.field2439) {
            var6.method1141(32767);
        }
        short var25 = var6.field2481;
        short var26 = var6.field2474;
        short var27 = var6.field2404;
        short var28 = var6.field2423;
        short var29 = var6.field2365;
        short var30 = var6.field2470;
        for (int var31 = 0; var31 < this.field2383; var31++) {
            int var32 = this.field2437[var31] - arg2;
            if (var25 <= var32 && var32 <= var26) {
                int var33 = this.field2359[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field2430[var31] - arg3;
                    if (var34 >= var29 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field2413[var31];
                        int var37 = this.field2413[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field2410[var38] - 1;
                            if (var35 == -1 || this.field2369[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var17 == null) {
                                            this.field2400 = new class338();
                                            var17 = this.field2400.field4916 = class304.method1918(this.field2364, -980740478);
                                            var15 = this.field2400.field4922 = class304.method1918(this.field2459, -980740478);
                                            var16 = this.field2400.field4920 = class304.method1918(this.field2452, -980740478);
                                            var18 = this.field2400.field4924 = class510.method3021(this.field2369, -113);
                                        }
                                        if (var20 == null) {
                                            class338 var44 = var6.field2400 = new class338();
                                            var20 = var44.field4916 = class304.method1918(var11, -980740478);
                                            var21 = var44.field4922 = class304.method1918(var12, -980740478);
                                            var19 = var44.field4920 = class304.method1918(var13, -980740478);
                                            var22 = var44.field4924 = class510.method3021(var14, -113);
                                        }
                                        short var45 = this.field2364[var35];
                                        short var46 = this.field2459[var35];
                                        short var47 = this.field2452[var35];
                                        int var48 = var23[var39 + 1];
                                        byte var49 = this.field2369[var35];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var48; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var20[var52] += var45;
                                                var21[var52] += var46;
                                                var19[var52] += var47;
                                                var22[var52] += var49;
                                            }
                                        }
                                        short var53 = var11[var40];
                                        short var54 = var12[var40];
                                        byte var55 = var14[var40];
                                        int var56 = this.field2413[var31 + 1];
                                        short var57 = var13[var40];
                                        int var58 = this.field2413[var31];
                                        for (int var59 = var58; var59 < var56; var59++) {
                                            int var60 = this.field2410[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var17[var60] += var53;
                                                var15[var60] += var54;
                                                var16[var60] += var57;
                                                var18[var60] += var55;
                                            }
                                        }
                                        if (this.field2376 == null && this.field2398 != null) {
                                            this.field2398.field3839 = null;
                                        }
                                        if (this.field2376 != null) {
                                            this.field2376.field3839 = null;
                                        }
                                        if (var6.field2376 == null && var6.field2398 != null) {
                                            var6.field2398.field3839 = null;
                                        }
                                        if (var6.field2376 != null) {
                                            var6.field2376.field3839 = null;
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

    @OriginalMember(owner = "client!as", name = "ba", descriptor = "(Lr;)Lr;", line = 1611)
    public final class183 method242(class183 arg0) {
        field2422++;
        if (this.field2412 == 0) {
            return null;
        }
        if (!this.field2439) {
            this.method1141(32767);
        }
        int var2;
        int var3;
        if (this.field2427.field2230 > 0) {
            var2 = this.field2404 - (this.field2427.field2230 * this.field2474 >> 8) >> this.field2427.field2171;
            var3 = this.field2423 - (this.field2427.field2230 * this.field2481 >> 8) >> this.field2427.field2171;
        } else {
            var2 = this.field2404 - (this.field2427.field2230 * this.field2481 >> 8) >> this.field2427.field2171;
            var3 = this.field2423 - (this.field2427.field2230 * this.field2474 >> 8) >> this.field2427.field2171;
        }
        int var4;
        int var5;
        if (this.field2427.field2252 > 0) {
            var4 = this.field2365 - (this.field2427.field2252 * this.field2474 >> 8) >> this.field2427.field2171;
            var5 = this.field2470 - (this.field2427.field2252 * this.field2481 >> 8) >> this.field2427.field2171;
        } else {
            var4 = this.field2365 - (this.field2427.field2252 * this.field2481 >> 8) >> this.field2427.field2171;
            var5 = this.field2470 - (this.field2427.field2252 * this.field2474 >> 8) >> this.field2427.field2171;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class265 var8 = (class265) arg0;
        class265 var9;
        if (var8 != null && var8.method1705(var6, var7, (byte) 48)) {
            var9 = var8;
            var8.method1704(-111);
        } else {
            var9 = new class265(this.field2427, var6, var7);
        }
        var9.method1707(var3, 93, var5, var2, var4);
        this.method1132(var9, true);
        return var9;
    }

    @OriginalMember(owner = "client!as", name = "aa", descriptor = "(SS)V", line = 1686)
    public final void method254(short arg0, short arg1) {
        field2480++;
        class151 var3 = this.field2427.field849;
        for (int var4 = 0; var4 < this.field2374; var4++) {
            if (this.field2425[var4] == arg0) {
                this.field2425[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class293 var7 = var3.method1124((byte) -117, arg0 & 0xFFFF);
            var6 = var7.field4193;
            var5 = var7.field4179;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class293 var10 = var3.method1124((byte) 124, arg1 & 0xFFFF);
            if (var10.field4188 != 0 || var10.field4171 != 0) {
                this.field2378 = true;
            }
            var9 = var10.field4193;
            var8 = var10.field4179;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field2382 != null) {
            for (int var11 = 0; var11 < this.field2465; var11++) {
                class479 var12 = this.field2382[var11];
                class442 var13 = this.field2463[var11];
                var13.field6583 = class324.field4632[this.field2409[var12.field6943] & 0xFFFF] & 0xFFFFFF | var13.field6583 & 0xFF000000;
            }
        }
        if (this.field2398 != null) {
            this.field2398.field3839 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lql;Leda;I)V", line = 1763)
    public final void method265(class738 arg0, class102 arg1, int arg2) {
        field2360++;
        if (this.field2412 == 0) {
            return;
        }
        class607 var4 = this.field2427.field2200;
        class607 var5 = (class607) arg0;
        if (!this.field2439) {
            this.method1141(32767);
        }
        class399.field5959 = var4.field8581 * var5.field8563 + var4.field8583 * var5.field8575 + var4.field8567 * var5.field8590 + var4.field8563;
        class635.field8931 = var4.field8581 * var5.field8567 + var4.field8583 * var5.field8572 + var4.field8567 * var5.field8564;
        float var6 = (float) this.field2481 * class635.field8931 + class399.field5959;
        float var7 = (float) this.field2474 * class635.field8931 + class399.field5959;
        float var8;
        float var9;
        if ((var7 < var6)) {
            var9 = (float) (-this.field2457) + var7;
            var8 = (float) this.field2457 + var6;
        } else {
            var8 = (float) this.field2457 + var7;
            var9 = (float) (-this.field2457) + var6;
        }
        if ((this.field2427.field2217 <= var9) || ((float) this.field2427.field2306 >= var8)) {
            return;
        }
        class269.field3850 = var4.field8591 * var5.field8563 + var4.field8572 * var5.field8590 + var4.field8562 * var5.field8575 + var4.field8575;
        class145.field1935 = var4.field8591 * var5.field8567 + var4.field8572 * var5.field8564 + var4.field8562 * var5.field8572;
        float var10 = (float) this.field2481 * class145.field1935 + class269.field3850;
        float var11 = (float) this.field2474 * class145.field1935 + class269.field3850;
        float var12;
        float var13;
        if ((var10 > var11)) {
            var13 = ((float) this.field2457 + var10) * (float) this.field2427.field2247;
            var12 = ((float) (-this.field2457) + var11) * (float) this.field2427.field2247;
        } else {
            var12 = (var10 - (float) this.field2457) * (float) this.field2427.field2247;
            var13 = ((float) this.field2457 + var11) * (float) this.field2427.field2247;
        }
        if ((var12 / var8 >= this.field2427.field2284) || (this.field2427.field2282 >= var13 / var8)) {
            return;
        }
        class446.field6616 = var4.field8558 * var5.field8563 + var4.field8578 * var5.field8575 + var4.field8564 * var5.field8590 + var4.field8590;
        class547.field7805 = var4.field8558 * var5.field8567 + var4.field8578 * var5.field8572 + var4.field8564 * var5.field8564;
        float var14 = (float) this.field2481 * class547.field7805 + class446.field6616;
        float var15 = (float) this.field2474 * class547.field7805 + class446.field6616;
        float var16;
        float var17;
        if ((var14 > var15)) {
            var17 = (var15 - (float) this.field2457) * (float) this.field2427.field2251;
            var16 = ((float) this.field2457 + var14) * (float) this.field2427.field2251;
        } else {
            var16 = ((float) this.field2457 + var15) * (float) this.field2427.field2251;
            var17 = (var14 - (float) this.field2457) * (float) this.field2427.field2251;
        }
        if ((var17 / var8 >= this.field2427.field2250) || (var16 / var8 <= this.field2427.field2308)) {
            return;
        }
        if (arg1 != null || this.field2382 != null) {
            class707.field9959 = var4.field8558 * var5.field8583 + var4.field8578 * var5.field8562 + var4.field8564 * var5.field8578;
            class671.field9365 = var4.field8581 * var5.field8581 + var4.field8583 * var5.field8591 + var4.field8567 * var5.field8558;
            class287.field4079 = var4.field8591 * var5.field8583 + var4.field8572 * var5.field8578 + var4.field8562 * var5.field8562;
            class154.field2506 = var4.field8558 * var5.field8581 + var4.field8578 * var5.field8591 + var4.field8564 * var5.field8558;
            class190.field2884 = var4.field8581 * var5.field8583 + var4.field8583 * var5.field8562 + var4.field8567 * var5.field8578;
            class242.field3517 = var4.field8591 * var5.field8581 + var4.field8572 * var5.field8558 + var4.field8562 * var5.field8591;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field2404 + this.field2423 >> 1;
            int var21 = this.field2365 + this.field2470 >> 1;
            int var22 = (int) ((float) var21 * class242.field3517 + (float) this.field2481 * class145.field1935 + (float) var20 * class287.field4079 + class269.field3850);
            int var23 = (int) ((float) var21 * class154.field2506 + (float) this.field2481 * class547.field7805 + (float) var20 * class707.field9959 + class446.field6616);
            int var24 = (int) ((float) var21 * class671.field9365 + (float) this.field2481 * class635.field8931 + (float) var20 * class190.field2884 + class399.field5959);
            if (this.field2427.field2306 > var24) {
                var18 = true;
            } else {
                arg1.field1431 = this.field2427.field2232 + (this.field2427.field2251 * var23 / var24);
                arg1.field1432 = this.field2427.field2280 + (this.field2427.field2247 * var22 / var24);
            }
            int var25 = (int) ((float) var21 * class242.field3517 + (float) this.field2474 * class145.field1935 + (float) var20 * class287.field4079 + class269.field3850);
            int var26 = (int) ((float) var21 * class154.field2506 + (float) this.field2474 * class547.field7805 + (float) var20 * class707.field9959 + class446.field6616);
            int var27 = (int) ((float) var21 * class671.field9365 + (float) this.field2474 * class635.field8931 + (float) var20 * class190.field2884 + class399.field5959);
            if (var27 < this.field2427.field2306) {
                var18 = true;
            } else {
                arg1.field1433 = this.field2427.field2280 + (this.field2427.field2247 * var25 / var27);
                arg1.field1434 = this.field2427.field2232 + (this.field2427.field2251 * var26 / var27);
            }
            if (var18) {
                if (var24 < this.field2427.field2306 && var27 < this.field2427.field2306) {
                    var19 = false;
                } else if (this.field2427.field2306 > var24) {
                    int var28 = (var27 - this.field2427.field2306 << 16) / (var27 - var24);
                    int var29 = ((var25 - var22) * var28 >> 16) + var25;
                    arg1.field1432 = this.field2427.field2247 * var29 / this.field2427.field2306 + this.field2427.field2280;
                    int var30 = var26 + ((var26 - var23) * var28 >> 16);
                    arg1.field1431 = this.field2427.field2251 * var30 / this.field2427.field2306 + this.field2427.field2232;
                } else if (var27 < this.field2427.field2306) {
                    int var31 = (var24 - this.field2427.field2306 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    int var33 = var23 + ((var23 - var26) * var31 >> 16);
                    arg1.field1432 = this.field2427.field2247 * var32 / this.field2427.field2306 + this.field2427.field2280;
                    arg1.field1431 = this.field2427.field2232 + (this.field2427.field2251 * var33 / this.field2427.field2306);
                }
            }
            if (var19) {
                if (var24 <= var27) {
                    arg1.field1429 = (this.field2457 + var25) * this.field2427.field2247 / var27 + (this.field2427.field2280 - arg1.field1433);
                } else {
                    arg1.field1429 = (this.field2457 + var22) * this.field2427.field2247 / var24 + (this.field2427.field2280 - arg1.field1432);
                }
                arg1.field1430 = true;
            }
        }
        this.field2427.method1049(false);
        this.field2427.method1078(10, var5);
        this.method1145((byte) -48);
        this.field2427.method1081((byte) 15);
        this.method1135(8618);
    }

    @OriginalMember(owner = "client!as", name = "d", descriptor = "()[Lol;", line = 1967)
    public final class285[] method285() {
        field2407++;
        return this.field2358;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IZ)V", line = 1977)
    private final void method1136(int arg0, boolean arg1) {
        field2381++;
        boolean var3 = this.field2398 != null && this.field2398.field3839 == null;
        boolean var4 = this.field2376 != null && this.field2376.field3839 == null;
        boolean var5 = this.field2403 != null && this.field2403.field3839 == null;
        boolean var6 = this.field2444 != null && this.field2444.field3839 == null;
        if (arg1) {
            var4 &= (this.field2415 & 0x4) != 0;
            var3 &= (this.field2415 & 0x2) != 0;
            var6 &= (this.field2415 & 0x8) != 0;
            var5 &= (this.field2415 & 0x1) != 0;
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
        if (this.field2427.field2313.field9068.length >= this.field2412 * var7) {
            this.field2427.field2313.field9084 = 0;
        } else {
            this.field2427.field2313 = new class699((this.field2412 + 100) * var7);
        }
        class699 var12 = this.field2427.field2313;
        if (var5) {
            if (this.field2427.field2211) {
                for (int var13 = 0; var13 < this.field2383; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field2359[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field2437[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field2430[var13]);
                    int var17 = this.field2413[var13];
                    int var18 = this.field2413[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field2410[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field9084 = var7 * var20;
                        var12.method3695(var14, 255);
                        var12.method3695(var15, 255);
                        var12.method3695(var16, 255);
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field2383; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field2359[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field2437[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field2430[var21]);
                    int var25 = this.field2413[var21];
                    int var26 = this.field2413[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field2410[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field9084 = var7 * var28;
                        var12.method3739(var22, (byte) 79);
                        var12.method3739(var23, (byte) 102);
                        var12.method3739(var24, (byte) 120);
                    }
                }
            }
        }
        if (var3) {
            if (this.field2376 == null) {
                short[] var31;
                short[] var32;
                short[] var33;
                byte[] var34;
                if (this.field2400 == null) {
                    var31 = this.field2364;
                    var32 = this.field2459;
                    var33 = this.field2452;
                    var34 = this.field2369;
                } else {
                    var33 = this.field2400.field4920;
                    var31 = this.field2400.field4916;
                    var32 = this.field2400.field4922;
                    var34 = this.field2400.field4924;
                }
                float var35 = this.field2427.field2269[0];
                float var36 = this.field2427.field2269[1];
                float var37 = this.field2427.field2269[2];
                float var38 = this.field2427.field2259;
                float var39 = this.field2427.field2297 * 768.0F / (float) this.field2384;
                float var40 = this.field2427.field2285 * 768.0F / (float) this.field2384;
                for (int var41 = 0; var41 < this.field2374; var41++) {
                    int var42 = this.method1133(this.field2473[var41], this.field2425[var41], 107, this.field2409[var41], this.field2361);
                    float var43 = (float) (var42 >>> 24) * this.field2427.field2277;
                    short var44 = this.field2405[var41];
                    float var45 = (float) (var42 >> 16 & 0xFF) * this.field2427.field2279;
                    float var46 = (float) ((var42 & 0xFFE3) >> 8) * this.field2427.field2253;
                    short var47 = (short) var34[var44];
                    float var48;
                    if (var47 == 0) {
                        var48 = ((float) var33[var44] * var37 + (float) var31[var44] * var35 + (float) var32[var44] * var36) * 0.0026041667F;
                    } else {
                        var48 = ((float) var33[var44] * var37 + (float) var31[var44] * var35 + (float) var32[var44] * var36) / (float) (var47 * 256);
                    }
                    float var49 = var38 + (var48 < 0.0F ? var40 : var39) * var48;
                    int var50 = (int) (var43 * var49);
                    int var51 = (int) (var45 * var49);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    int var52 = (int) (var46 * var49);
                    if (var51 < 0) {
                        var51 = 0;
                    } else if (var51 > 255) {
                        var51 = 255;
                    }
                    var12.field9084 = var7 * var44 + var9;
                    if (var52 < 0) {
                        var52 = 0;
                    } else if (var52 > 255) {
                        var52 = 255;
                    }
                    var12.method3730(107, var50);
                    var12.method3730(105, var51);
                    var12.method3730(101, var52);
                    var12.method3730(101, 255 - (this.field2473[var41] & 0xFF));
                    short var53 = this.field2440[var41];
                    short var54 = (short) var34[var53];
                    float var55;
                    if (var54 == 0) {
                        var55 = ((float) var33[var53] * var37 + (float) var31[var53] * var35 + (float) var32[var53] * var36) * 0.0026041667F;
                    } else {
                        var55 = ((float) var33[var53] * var37 + (float) var31[var53] * var35 + (float) var32[var53] * var36) / (float) (var54 * 256);
                    }
                    float var56 = var55 * (var55 < 0.0F ? var40 : var39) + var38;
                    int var57 = (int) (var43 * var56);
                    int var58 = (int) (var45 * var56);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    if (var58 < 0) {
                        var58 = 0;
                    } else if (var58 > 255) {
                        var58 = 255;
                    }
                    int var59 = (int) (var46 * var56);
                    var12.field9084 = var9 + (var7 * var53);
                    if (var59 < 0) {
                        var59 = 0;
                    } else if (var59 > 255) {
                        var59 = 255;
                    }
                    var12.method3730(111, var57);
                    var12.method3730(113, var58);
                    var12.method3730(116, var59);
                    var12.method3730(118, 255 - (this.field2473[var41] & 0xFF));
                    short var60 = this.field2431[var41];
                    short var61 = (short) var34[var60];
                    float var62;
                    if (var61 == 0) {
                        var62 = ((float) var33[var60] * var37 + (float) var31[var60] * var35 + (float) var32[var60] * var36) * 0.0026041667F;
                    } else {
                        var62 = ((float) var33[var60] * var37 + (float) var31[var60] * var35 + (float) var32[var60] * var36) / (float) (var61 * 256);
                    }
                    float var63 = ((var62 < 0.0F) ? var40 : var39) * var62 + var38;
                    int var64 = (int) (var43 * var63);
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    int var65 = (int) (var45 * var63);
                    if (var65 < 0) {
                        var65 = 0;
                    } else if (var65 > 255) {
                        var65 = 255;
                    }
                    int var66 = (int) (var46 * var63);
                    if (var66 < 0) {
                        var66 = 0;
                    } else if (var66 > 255) {
                        var66 = 255;
                    }
                    var12.field9084 = var7 * var60 + var9;
                    var12.method3730(123, var64);
                    var12.method3730(117, var65);
                    var12.method3730(109, var66);
                    var12.method3730(125, 255 - (this.field2473[var41] & 0xFF));
                }
            } else {
                for (int var29 = 0; var29 < this.field2374; var29++) {
                    int var30 = this.method1133(this.field2473[var29], this.field2425[var29], 124, this.field2409[var29], this.field2361);
                    var12.field9084 = var9 + (this.field2405[var29] * var7);
                    var12.method3695(var30, 255);
                    var12.field9084 = this.field2440[var29] * var7 + var9;
                    var12.method3695(var30, 255);
                    var12.field9084 = this.field2431[var29] * var7 + var9;
                    var12.method3695(var30, 255);
                }
            }
        }
        if (var4) {
            short[] var67;
            short[] var68;
            short[] var69;
            byte[] var70;
            if (this.field2400 == null) {
                var67 = this.field2364;
                var68 = this.field2459;
                var69 = this.field2452;
                var70 = this.field2369;
            } else {
                var68 = this.field2400.field4922;
                var70 = this.field2400.field4924;
                var69 = this.field2400.field4920;
                var67 = this.field2400.field4916;
            }
            float var71 = 3.0F / (float) this.field2384;
            float var72 = 3.0F / (float) (this.field2384 / 2 + this.field2384);
            var12.field9084 = var10;
            if (this.field2427.field2211) {
                for (int var73 = 0; var73 < this.field2412; var73++) {
                    int var74 = var70[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method3968(724, (float) var67[var73] * var72);
                        var12.method3968(724, (float) var68[var73] * var72);
                        var12.method3968(724, (float) var69[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method3968(724, (float) var67[var73] * var75);
                        var12.method3968(724, (float) var68[var73] * var75);
                        var12.method3968(724, (float) var69[var73] * var75);
                    }
                    var12.field9084 += var7 - 12;
                }
            } else {
                for (int var76 = 0; var76 < this.field2412; var76++) {
                    int var77 = var70[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method3967((byte) 38, (float) var67[var76] * var72);
                        var12.method3967((byte) 38, (float) var68[var76] * var72);
                        var12.method3967((byte) 38, (float) var69[var76] * var72);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method3967((byte) 38, (float) var67[var76] * var78);
                        var12.method3967((byte) 38, (float) var68[var76] * var78);
                        var12.method3967((byte) 38, (float) var69[var76] * var78);
                    }
                    var12.field9084 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field9084 = var11;
            if (this.field2427.field2211) {
                for (int var79 = 0; var79 < this.field2412; var79++) {
                    var12.method3968(724, this.field2429[var79]);
                    var12.method3968(724, this.field2390[var79]);
                    var12.field9084 += var7 - 8;
                }
            } else {
                for (int var80 = 0; var80 < this.field2412; var80++) {
                    var12.method3967((byte) 38, this.field2429[var80]);
                    var12.method3967((byte) 38, this.field2390[var80]);
                    var12.field9084 += var7 - 8;
                }
            }
        }
        var12.field9084 = this.field2412 * var7;
        class761 var81;
        if (arg1) {
            if (this.field2455 == null) {
                this.field2455 = this.field2427.method1046(true, 770, var12.field9068, var12.field9084, var7);
            } else {
                this.field2455.method947(var7, var12.field9084, var12.field9068, 5089);
            }
            var81 = this.field2455;
            this.field2415 = 0;
        } else {
            var81 = this.field2427.method1046(false, 770, var12.field9068, var12.field9084, var7);
            this.field2458 = true;
        }
        if (var5) {
            this.field2403.field3839 = var81;
            this.field2403.field3842 = var8;
        }
        if (var6) {
            this.field2444.field3842 = var11;
            this.field2444.field3839 = var81;
        }
        if (arg0 <= 61) {
            return;
        }
        if (var3) {
            this.field2398.field3839 = var81;
            this.field2398.field3842 = var9;
        }
        if (var4) {
            this.field2376.field3842 = var10;
            this.field2376.field3839 = var81;
        }
    }

    @OriginalMember(owner = "client!as", name = "LA", descriptor = "(I)V", line = 2490)
    public final void method287(int arg0) {
        this.field2384 = (short) arg0;
        if (this.field2398 != null) {
            this.field2398.field3839 = null;
        }
        field2454++;
        if (this.field2376 != null) {
            this.field2376.field3839 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(B)V", line = 2508)
    public static void method1137(byte arg0) {
        field2479 = null;
        int var1 = -107 % ((-arg0 - 27) / 56);
        field2478 = null;
        field2445 = null;
    }

    @OriginalMember(owner = "client!as", name = "F", descriptor = "()Z", line = 2520)
    public final boolean method275() {
        field2441++;
        return this.field2467;
    }

    @OriginalMember(owner = "client!as", name = "I", descriptor = "(I[IIIIZI[I)V", line = 2540)
    public final void method278(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field2477++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            int var13 = 0;
            class734.field10260 = 0;
            class184.field2809 = 0;
            class158.field2517 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field2420.length) {
                    int[] var16 = this.field2420[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field2401 == null || (this.field2401[var18] & arg6) != 0) {
                            class734.field10260 += this.field2359[var18];
                            class158.field2517 += this.field2437[var18];
                            var13++;
                            class184.field2809 += this.field2430[var18];
                        }
                    }
                }
            }
            if (var13 > 0) {
                class20.field223 = true;
                class184.field2809 = class184.field2809 / var13 + var12;
                class734.field10260 = class734.field10260 / var13 + var10;
                class158.field2517 = class158.field2517 / var13 + var11;
            } else {
                class184.field2809 = var12;
                class158.field2517 = var11;
                class734.field10260 = var10;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
                int var20 = arg7[4] * arg3 + arg7[3] * arg2 + arg7[5] * arg4 + 8192 >> 14;
                int var21 = arg7[8] * arg4 + arg7[7] * arg3 + arg7[6] * arg2 + 8192 >> 14;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg3 << 4;
            int var23 = arg4 << 4;
            int var24 = arg2 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field2420.length) {
                    int[] var27 = this.field2420[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field2401 == null || (arg6 & this.field2401[var29]) != 0) {
                            this.field2359[var29] += var24;
                            this.field2437[var29] += var22;
                            this.field2430[var29] += var23;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (var109 < this.field2420.length) {
                        int[] var110 = this.field2420[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field2401 == null || (this.field2401[var112] & arg6) != 0) {
                                this.field2359[var112] -= class734.field10260;
                                this.field2437[var112] -= class158.field2517;
                                this.field2430[var112] -= class184.field2809;
                                if (arg4 != 0) {
                                    int var113 = class373.field5548[arg4];
                                    int var114 = class373.field5549[arg4];
                                    int var115 = this.field2437[var112] * var113 + this.field2359[var112] * var114 + 16383 >> 14;
                                    this.field2437[var112] = this.field2437[var112] * var114 + 16383 - this.field2359[var112] * var113 >> 14;
                                    this.field2359[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class373.field5548[arg2];
                                    int var117 = class373.field5549[arg2];
                                    int var118 = this.field2437[var112] * var117 + 16383 - (this.field2430[var112] * var116) >> 14;
                                    this.field2430[var112] = this.field2437[var112] * var116 + this.field2430[var112] * var117 + 16383 >> 14;
                                    this.field2437[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class373.field5548[arg3];
                                    int var120 = class373.field5549[arg3];
                                    int var121 = this.field2430[var112] * var119 + (this.field2359[var112] * var120 + 16383) >> 14;
                                    this.field2430[var112] = this.field2430[var112] * var120 + 16383 - (this.field2359[var112] * var119) >> 14;
                                    this.field2359[var112] = var121;
                                }
                                this.field2359[var112] += class734.field10260;
                                this.field2437[var112] += class158.field2517;
                                this.field2430[var112] += class184.field2809;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (this.field2420.length > var92) {
                            int[] var93 = this.field2420[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field2401 == null || (arg6 & this.field2401[var95]) != 0) {
                                    int var96 = this.field2413[var95];
                                    int var97 = this.field2413[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field2410[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class373.field5548[arg4];
                                            int var101 = class373.field5549[arg4];
                                            int var102 = this.field2459[var99] * var100 + this.field2364[var99] * var101 + 16383 >> 14;
                                            this.field2459[var99] = (short) (this.field2459[var99] * var101 + 16383 - (this.field2364[var99] * var100) >> 14);
                                            this.field2364[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class373.field5548[arg2];
                                            int var104 = class373.field5549[arg2];
                                            int var105 = this.field2459[var99] * var104 + 16383 - (this.field2452[var99] * var103) >> 14;
                                            this.field2452[var99] = (short) (this.field2459[var99] * var103 + this.field2452[var99] * var104 + 16383 >> 14);
                                            this.field2459[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class373.field5548[arg3];
                                            int var107 = class373.field5549[arg3];
                                            int var108 = this.field2452[var99] * var106 + (this.field2364[var99] * var107) + 16383 >> 14;
                                            this.field2452[var99] = (short) (this.field2452[var99] * var107 + 16383 - (this.field2364[var99] * var106) >> 14);
                                            this.field2364[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field2376 == null && this.field2398 != null) {
                        this.field2398.field3839 = null;
                    }
                    if (this.field2376 != null) {
                        this.field2376.field3839 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class20.field223) {
                    int var36 = arg7[0] * class734.field10260 + 8192 - (-(arg7[3] * class158.field2517) - arg7[6] * class184.field2809) >> 14;
                    int var37 = arg7[7] * class184.field2809 + arg7[1] * class734.field10260 + (arg7[4] * class158.field2517) + 8192 >> 14;
                    int var38 = arg7[2] * class734.field10260 + 8192 - (-(arg7[5] * class158.field2517) - arg7[8] * class184.field2809) >> 14;
                    int var39 = var33 + var36;
                    int var40 = var34 + var37;
                    class158.field2517 = var40;
                    class734.field10260 = var39;
                    int var41 = var35 + var38;
                    class20.field223 = false;
                    class184.field2809 = var41;
                }
                int[] var42 = new int[9];
                int var43 = class373.field5549[arg2];
                int var44 = class373.field5548[arg2];
                int var45 = class373.field5549[arg3];
                int var46 = class373.field5548[arg3];
                int var47 = class373.field5549[arg4];
                int var48 = class373.field5548[arg4];
                int var49 = var44 * var47 + 8192 >> 14;
                int var50 = var44 * var48 + 8192 >> 14;
                var42[2] = var43 * var46 + 8192 >> 14;
                var42[5] = -var44;
                var42[6] = -var46 * var47 + (var45 * var50) + 8192 >> 14;
                var42[1] = -var45 * var48 + var46 * var49 + 8192 >> 14;
                var42[7] = var46 * var48 - (-(var45 * var49) - 8192) >> 14;
                var42[0] = var46 * var50 + (var45 * var47 + 8192) >> 14;
                var42[8] = var43 * var45 + 8192 >> 14;
                var42[3] = var43 * var48 + 8192 >> 14;
                var42[4] = var43 * var47 + 8192 >> 14;
                int var51 = var42[0] * -class734.field10260 + 8192 - (-(var42[1] * -class158.field2517) - (var42[2] * -class184.field2809)) >> 14;
                int var52 = var42[3] * -class734.field10260 + (var42[4] * -class158.field2517 - (-(var42[5] * -class184.field2809) - 8192)) >> 14;
                int var53 = var42[8] * -class184.field2809 + (var42[6] * -class734.field10260 + (var42[7] * -class158.field2517)) + 8192 >> 14;
                int var54 = class734.field10260 + var51;
                int var55 = class158.field2517 + var52;
                int var56 = class184.field2809 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var87 = 0; var87 < 3; var87++) {
                        int var88 = 0;
                        for (int var89 = 0; var89 < 3; var89++) {
                            var88 += var42[var58 * 3 + var89] * arg7[var87 * 3 + var89];
                        }
                        var57[var58 * 3 + var87] = var88 + 8192 >> 14;
                    }
                }
                int var59 = var42[0] * var33 + var42[1] * var34 + var42[2] * var35 + 8192 >> 14;
                int var60 = var42[4] * var34 + var42[5] * var35 + var42[3] * var33 + 8192 >> 14;
                int var61 = var42[7] * var34 + (var42[6] * var33 - (-(var42[8] * var35) - 8192)) >> 14;
                int var62 = var54 + var59;
                int var63 = var55 + var60;
                int var64 = var56 + var61;
                int[] var65 = new int[9];
                for (int var66 = 0; var66 < 3; var66++) {
                    for (int var84 = 0; var84 < 3; var84++) {
                        int var85 = 0;
                        for (int var86 = 0; var86 < 3; var86++) {
                            var85 += arg7[var66 * 3 + var86] * var57[var86 * 3 + var84];
                        }
                        var65[var66 * 3 + var84] = var85 + 8192 >> 14;
                    }
                }
                int var67 = arg7[1] * var63 + arg7[2] * var64 + arg7[0] * var62 + 8192 >> 14;
                int var68 = arg7[3] * var62 + arg7[5] * var64 + arg7[4] * var63 + 8192 >> 14;
                int var69 = var30 + var67;
                int var70 = var31 + var68;
                int var71 = arg7[7] * var63 + arg7[8] * var64 + arg7[6] * var62 + 8192 >> 14;
                int var72 = var32 + var71;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (this.field2420.length > var74) {
                        int[] var75 = this.field2420[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field2401 == null || (arg6 & this.field2401[var77]) != 0) {
                                int var78 = this.field2359[var77] * var65[0] + this.field2437[var77] * var65[1] + this.field2430[var77] * var65[2] + 8192 >> 14;
                                int var79 = this.field2430[var77] * var65[5] + this.field2437[var77] * var65[4] + (this.field2359[var77] * var65[3] - -8192) >> 14;
                                int var80 = var69 + var78;
                                int var81 = this.field2359[var77] * var65[6] + (this.field2437[var77] * var65[7] + (this.field2430[var77] * var65[8])) + 8192 >> 14;
                                int var82 = var70 + var79;
                                this.field2359[var77] = var80;
                                int var83 = var72 + var81;
                                this.field2437[var77] = var82;
                                this.field2430[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (this.field2420.length > var173) {
                        int[] var174 = this.field2420[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field2401 == null || (this.field2401[var176] & arg6) != 0) {
                                this.field2359[var176] -= class734.field10260;
                                this.field2437[var176] -= class158.field2517;
                                this.field2430[var176] -= class184.field2809;
                                this.field2359[var176] = this.field2359[var176] * arg2 >> 7;
                                this.field2437[var176] = this.field2437[var176] * arg3 >> 7;
                                this.field2430[var176] = this.field2430[var176] * arg4 >> 7;
                                this.field2359[var176] += class734.field10260;
                                this.field2437[var176] += class158.field2517;
                                this.field2430[var176] += class184.field2809;
                            }
                        }
                    }
                }
            } else {
                int var122 = arg7[9] << 4;
                int var123 = arg7[10] << 4;
                int var124 = arg7[11] << 4;
                int var125 = arg7[12] << 4;
                int var126 = arg7[13] << 4;
                int var127 = arg7[14] << 4;
                if (class20.field223) {
                    int var128 = arg7[6] * class184.field2809 + arg7[0] * class734.field10260 + arg7[3] * class158.field2517 + 8192 >> 14;
                    int var129 = arg7[1] * class734.field10260 + arg7[7] * class184.field2809 + (arg7[4] * class158.field2517) + 8192 >> 14;
                    int var130 = var125 + var128;
                    int var131 = var126 + var129;
                    int var132 = arg7[5] * class158.field2517 + arg7[2] * class734.field10260 + (arg7[8] * class184.field2809) + 8192 >> 14;
                    int var133 = var127 + var132;
                    class158.field2517 = var131;
                    class734.field10260 = var130;
                    class184.field2809 = var133;
                    class20.field223 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class734.field10260 * var134 + 8192 >> 14;
                int var138 = -class158.field2517 * var135 + 8192 >> 14;
                int var139 = -class184.field2809 * var136 + 8192 >> 14;
                int var140 = var137 + class734.field10260;
                int var141 = class158.field2517 + var138;
                int var142 = var139 + class184.field2809;
                int[] var143 = new int[] { arg7[0] * var134 + 8192 >> 14, arg7[3] * var134 + 8192 >> 14, arg7[6] * var134 + 8192 >> 14, arg7[1] * var135 + 8192 >> 14, arg7[4] * var135 + 8192 >> 14, arg7[7] * var135 + 8192 >> 14, arg7[2] * var136 + 8192 >> 14, arg7[5] * var136 + 8192 >> 14, arg7[8] * var136 + 8192 >> 14 };
                int var144 = var125 * var134 + 8192 >> 14;
                int var145 = var126 * var135 + 8192 >> 14;
                int var146 = var127 * var136 + 8192 >> 14;
                int var147 = var140 + var144;
                int var148 = var141 + var145;
                int var149 = var142 + var146;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var169 = 0; var169 < 3; var169++) {
                        int var170 = 0;
                        for (int var171 = 0; var171 < 3; var171++) {
                            var170 += arg7[var151 * 3 + var171] * var143[var171 * 3 + var169];
                        }
                        var150[var151 * 3 + var169] = var170 + 8192 >> 14;
                    }
                }
                int var152 = arg7[1] * var148 + (arg7[0] * var147 + (arg7[2] * var149)) + 8192 >> 14;
                int var153 = arg7[5] * var149 + arg7[4] * var148 + arg7[3] * var147 + 8192 >> 14;
                int var154 = arg7[8] * var149 + arg7[6] * var147 + arg7[7] * var148 + 8192 >> 14;
                int var155 = var123 + var153;
                int var156 = var122 + var152;
                int var157 = var124 + var154;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (this.field2420.length > var159) {
                        int[] var160 = this.field2420[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field2401 == null || (this.field2401[var162] & arg6) != 0) {
                                int var163 = this.field2430[var162] * var150[2] + this.field2359[var162] * var150[0] + (this.field2437[var162] * var150[1] - -8192) >> 14;
                                int var164 = this.field2359[var162] * var150[3] - (-(this.field2430[var162] * var150[5]) - (this.field2437[var162] * var150[4]) - 8192) >> 14;
                                int var165 = var156 + var163;
                                int var166 = this.field2430[var162] * var150[8] + this.field2437[var162] * var150[7] + this.field2359[var162] * var150[6] + 8192 >> 14;
                                int var167 = var155 + var164;
                                int var168 = var157 + var166;
                                this.field2359[var162] = var165;
                                this.field2437[var162] = var167;
                                this.field2430[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field2391 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field2391.length) {
                        int[] var182 = this.field2391[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field2466 == null || (this.field2466[var184] & arg6) != 0) {
                                int var185 = (this.field2473[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field2473[var184] = (byte) var185;
                                if (this.field2398 != null) {
                                    this.field2398.field3839 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field2382 != null) {
                    for (int var178 = 0; var178 < this.field2465; var178++) {
                        class479 var179 = this.field2382[var178];
                        class442 var180 = this.field2463[var178];
                        var180.field6583 = var180.field6583 & 0xFFFFFF | 255 - (this.field2473[var179.field6943] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field2391 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field2391.length > var190) {
                        int[] var191 = this.field2391[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field2466 == null || (arg6 & this.field2466[var193]) != 0) {
                                int var194 = this.field2409[var193] & 0xFFFF;
                                int var195 = var194 >> 10 & 0x3F;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = var194 & 0x7F;
                                int var198 = arg2 + var195 & 0x3F;
                                int var199 = arg3 / 4 + var196;
                                if (var199 < 0) {
                                    var199 = 0;
                                } else if (var199 > 7) {
                                    var199 = 7;
                                }
                                int var200 = arg4 + var197;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field2409[var193] = (short) class625.method3600(class625.method3600(var198 << 10, var199 << 7), var200);
                                if (this.field2398 != null) {
                                    this.field2398.field3839 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field2382 != null) {
                    for (int var187 = 0; var187 < this.field2465; var187++) {
                        class479 var188 = this.field2382[var187];
                        class442 var189 = this.field2463[var187];
                        var189.field6583 = class324.field4632[this.field2409[var188.field6943] & 0xFFFF] & 0xFFFFFF | var189.field6583 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field2471 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field2471.length) {
                        int[] var203 = this.field2471[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class442 var205 = this.field2463[var203[var204]];
                            var205.field6576 += arg3;
                            var205.field6586 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field2471 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field2471.length) {
                        int[] var208 = this.field2471[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class442 var210 = this.field2463[var208[var209]];
                            var210.field6584 = var210.field6584 * arg3 >> 7;
                            var210.field6579 = var210.field6579 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field2471 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field2471.length) {
                    int[] var213 = this.field2471[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class442 var215 = this.field2463[var213[var214]];
                        var215.field6578 = var215.field6578 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!as", name = "H", descriptor = "(III)V", line = 3525)
    public final void method238(int arg0, int arg1, int arg2) {
        field2461++;
        for (int var4 = 0; var4 < this.field2383; var4++) {
            if (arg0 != 0) {
                this.field2359[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field2437[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field2430[var4] += arg2;
            }
        }
        this.field2439 = false;
        if (this.field2403 != null) {
            this.field2403.field3839 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "C", descriptor = "(I)V", line = 3559)
    public final void method282(int arg0) {
        if (this.field2398 != null) {
            this.field2398.field3839 = null;
        }
        field2385++;
        this.field2361 = (short) arg0;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V", line = 3574)
    public final void method257(int arg0) {
        field2417++;
        int var2 = class373.field5548[arg0];
        int var3 = class373.field5549[arg0];
        for (int var4 = 0; var4 < this.field2383; var4++) {
            int var5 = this.field2430[var4] * var2 + (this.field2359[var4] * var3) >> 14;
            this.field2430[var4] = this.field2430[var4] * var3 - this.field2359[var4] * var2 >> 14;
            this.field2359[var4] = var5;
        }
        this.field2439 = false;
        if (this.field2403 != null) {
            this.field2403.field3839 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "()V", line = 3603)
    public final void method280() {
        field2373++;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(BIIIIIIII)Z", line = 3612)
    private final boolean method1138(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg0 != 66) {
            this.method238(50, -124, -46);
        }
        field2433++;
        if (arg8 > arg2 && arg1 > arg2 && arg2 < arg3) {
            return false;
        } else if (arg2 > arg8 && arg2 > arg1 && arg3 < arg2) {
            return false;
        } else if (arg7 > arg4 && arg5 > arg4 && arg4 < arg6) {
            return false;
        } else {
            return arg4 <= arg7 || arg5 >= arg4 || arg4 <= arg6;
        }
    }

    @OriginalMember(owner = "client!as", name = "WA", descriptor = "()I", line = 3641)
    public final int method263() {
        field2372++;
        return this.field2361;
    }

    @OriginalMember(owner = "client!as", name = "f", descriptor = "()V", line = 3650)
    public final void method260() {
        field2418++;
    }

    @OriginalMember(owner = "client!as", name = "s", descriptor = "(I)V", line = 3659)
    public final void method271(int arg0) {
        this.field2472 = arg0;
        field2447++;
        this.field2458 = true;
        if (this.field2400 != null && (this.field2472 & 0x10000) == 0) {
            this.field2452 = this.field2400.field4920;
            this.field2459 = this.field2400.field4922;
            this.field2364 = this.field2400.field4916;
            this.field2369 = this.field2400.field4924;
            this.field2400 = null;
        }
        this.method1144(10391);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IFIIIIFLdh;IJ)S", line = 3680)
    private final short method1139(int arg0, float arg1, int arg2, int arg3, int arg4, int arg5, float arg6, class322 arg7, int arg8, long arg9) {
        field2469++;
        int var12 = this.field2413[arg0];
        int var13 = this.field2413[arg0 + 1];
        int var14 = 0;
        int var15 = var12;
        if (arg8 != 697) {
            this.method262();
        }
        while (var13 > var15) {
            short var16 = this.field2410[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class704.field9899[var15] == arg9) {
                return (short) (var16 - 1);
            }
            var15++;
        }
        this.field2410[var14] = (short) (this.field2412 + 1);
        class704.field9899[var14] = arg9;
        this.field2364[this.field2412] = (short) arg3;
        this.field2459[this.field2412] = (short) arg4;
        this.field2452[this.field2412] = (short) arg5;
        this.field2369[this.field2412] = (byte) arg2;
        this.field2429[this.field2412] = arg1;
        this.field2390[this.field2412] = arg6;
        return (short) (this.field2412++);
    }

    @OriginalMember(owner = "client!as", name = "e", descriptor = "()Z", line = 3725)
    public final boolean method284() {
        field2362++;
        if (this.field2425 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field2425.length; var1++) {
            if (this.field2425[var1] != -1 && !this.field2427.field849.method1121(-30695, this.field2425[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!as", name = "VA", descriptor = "(I)V", line = 3751)
    public final void method279(int arg0) {
        field2396++;
        int var2 = class373.field5548[arg0];
        int var3 = class373.field5549[arg0];
        for (int var4 = 0; var4 < this.field2383; var4++) {
            int var5 = this.field2437[var4] * var2 + this.field2359[var4] * var3 >> 14;
            this.field2437[var4] = this.field2437[var4] * var3 - this.field2359[var4] * var2 >> 14;
            this.field2359[var4] = var5;
        }
        this.field2439 = false;
        if (this.field2403 != null) {
            this.field2403.field3839 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(BILvt;)V", line = 3780)
    public static final void method1140(byte arg0, int arg1, class304 arg2) {
        class229.field3367 = false;
        field2462++;
        field2421 = 0;
        class610.method3540(arg2, 0);
        class438.method2709(0, arg2);
        if (class229.field3367) {
            System.out.println("---endgpp---");
        }
        int var3 = 20 % ((54 - arg0) / 55);
        if (arg2.field9084 != arg1) {
            throw new RuntimeException("gpi1 pos:" + arg2.field9084 + " psize:" + arg1);
        }
    }

    @OriginalMember(owner = "client!as", name = "V", descriptor = "()I", line = 3802)
    public final int method258() {
        field2406++;
        if (!this.field2439) {
            this.method1141(32767);
        }
        return this.field2404;
    }

    @OriginalMember(owner = "client!as", name = "e", descriptor = "(I)V", line = 3820)
    private final void method1141(int arg0) {
        field2388++;
        int var2 = 32767;
        int var3 = arg0;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2383; var10++) {
            int var11 = this.field2359[var10];
            int var12 = this.field2437[var10];
            if (var2 > var11) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            int var13 = this.field2430[var10];
            if (var3 > var12) {
                var3 = var12;
            }
            if (var6 < var12) {
                var6 = var12;
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
        this.field2474 = (short) var6;
        this.field2404 = (short) var2;
        this.field2423 = (short) var5;
        this.field2481 = (short) var3;
        this.field2470 = (short) var7;
        this.field2365 = (short) var4;
        this.field2457 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        this.field2367 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        this.field2439 = true;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ZI)V", line = 3904)
    private final void method1142(boolean arg0, int arg1) {
        field2377++;
        if (this.field2399 * 6 > this.field2427.field2313.field9068.length) {
            this.field2427.field2313 = new class699((this.field2399 + 100) * 6);
        } else {
            this.field2427.field2313.field9084 = 0;
        }
        class699 var3 = this.field2427.field2313;
        if (this.field2427.field2211) {
            for (int var5 = 0; var5 < this.field2399; var5++) {
                var3.method3702(this.field2405[var5], (byte) -118);
                var3.method3702(this.field2440[var5], (byte) -121);
                var3.method3702(this.field2431[var5], (byte) -122);
            }
        } else {
            for (int var4 = 0; var4 < this.field2399; var4++) {
                var3.method3758(this.field2405[var4], arg1 + 1394245896);
                var3.method3758(this.field2440[var4], arg1 ^ 0x531A8108);
                var3.method3758(this.field2431[var4], arg1 ^ 0x531A8108);
            }
        }
        if (var3.field9084 == 0) {
            return;
        }
        if (arg0) {
            if (this.field2453 == null) {
                this.field2453 = this.field2427.method1079(true, var3.field9068, var3.field9084, 5123, arg1 ^ 0xFFFFF9C5);
            } else {
                this.field2453.method3212(var3.field9084, var3.field9068, arg1 - 1539, 5123);
            }
            this.field2366.field1359 = this.field2453;
        } else {
            this.field2366.field1359 = this.field2427.method1079(false, var3.field9068, var3.field9084, 5123, -37);
        }
        if (arg1 != 1600) {
            this.method250();
        }
        if (!arg0) {
            this.field2458 = true;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IILql;ZI)Z", line = 3986)
    public final boolean method277(int arg0, int arg1, class738 arg2, boolean arg3, int arg4) {
        field2393++;
        return this.method1134(arg4, arg3, arg1, arg2, arg0, -1, 1);
    }

    @OriginalMember(owner = "client!as", name = "p", descriptor = "(IILs;Ls;III)V", line = 3994)
    public final void method270(int arg0, int arg1, class280 arg2, class280 arg3, int arg4, int arg5, int arg6) {
        field2386++;
        if (!this.field2439) {
            this.method1141(32767);
        }
        int var8 = arg4 + this.field2404;
        int var9 = this.field2423 + arg4;
        int var10 = this.field2365 + arg6;
        int var11 = this.field2470 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field3963 <= var9 + arg2.field3965 >> arg2.field3955 || var10 < 0 || arg2.field3962 <= var11 + arg2.field3965 >> arg2.field3955) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field3965 + var9 >> arg3.field3955 >= arg3.field3963 || var10 < 0 || arg3.field3962 <= (arg3.field3965 + var11 >> arg3.field3955)) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field3955;
            int var13 = arg2.field3965 - (1 - var9) >> arg2.field3955;
            int var14 = var10 >> arg2.field3955;
            int var15 = -(-arg2.field3965 - var11) - 1 >> arg2.field3955;
            if (arg2.method1787(var12, 19646, var14) == arg5 && arg5 == arg2.method1787(var13, 19646, var14) && arg5 == arg2.method1787(var12, 19646, var15) && arg2.method1787(var13, 19646, var15) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field2383; var32++) {
                this.field2437[var32] = (this.field2437[var32] + arg2.method1786(this.field2430[var32] + arg6, (byte) 113, this.field2359[var32] + arg4)) - arg5;
            }
        } else if (arg0 == 2) {
            short var29 = this.field2481;
            if (var29 == 0) {
                return;
            }
            for (int var30 = 0; var30 < this.field2383; var30++) {
                int var31 = (this.field2437[var30] << 16) / var29;
                if (var31 < arg1) {
                    this.field2437[var30] += (arg1 - var31) * (arg2.method1786(this.field2430[var30] + arg6, (byte) 113, this.field2359[var30] + arg4) - arg5) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var16 = (arg1 & 0xFF) * 4;
            int var17 = ((arg1 & 0xFFDD) >> 8) * 4;
            int var18 = (arg1 & 0xFFF971) >> 16 << 6;
            int var19 = (arg1 >> 24 & 0xFF) << 6;
            if ((arg4 - (var16 >> 1)) < 0 || (arg2.field3963 << arg2.field3955) <= ((var16 >> 1) + arg4 + arg2.field3965) || (arg6 - (var17 >> 1)) < 0 || (var17 >> 1) + arg6 + arg2.field3965 >= arg2.field3962 << arg2.field3955) {
                return;
            }
            this.method2852(var16, var17, var19, var18, arg5, 63, arg2, arg4, arg6);
        } else if (arg0 == 4) {
            int var20 = this.field2474 - this.field2481;
            for (int var21 = 0; var21 < this.field2383; var21++) {
                this.field2437[var21] = this.field2437[var21] + var20 + arg3.method1786(this.field2430[var21] + arg6, (byte) 113, this.field2359[var21] + arg4) - arg5;
            }
        } else if (arg0 == 5) {
            int var22 = this.field2474 - this.field2481;
            for (int var23 = 0; var23 < this.field2383; var23++) {
                int var24 = this.field2359[var23] + arg4;
                int var25 = this.field2430[var23] + arg6;
                int var26 = arg2.method1786(var25, (byte) 113, var24);
                int var27 = arg3.method1786(var25, (byte) 113, var24);
                int var28 = var26 - var27 - arg1;
                this.field2437[var23] = ((this.field2437[var23] << 8) / var22 * var28 >> 8) + var26 - arg5;
            }
        }
        this.field2439 = false;
        if (this.field2403 != null) {
            this.field2403.field3839 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Las;ILas;IZZ)Lka;", line = 4147)
    private final class473 method1143(class153 arg0, int arg1, class153 arg2, int arg3, boolean arg4, boolean arg5) {
        arg0.field2472 = arg1;
        arg0.field2438 = this.field2438;
        field2379++;
        arg0.field2361 = this.field2361;
        arg0.field2374 = this.field2374;
        arg0.field2384 = this.field2384;
        arg0.field2412 = this.field2412;
        arg0.field2378 = this.field2378;
        arg0.field2415 = 0;
        arg0.field2383 = this.field2383;
        arg0.field2424 = this.field2424;
        arg0.field2465 = this.field2465;
        arg0.field2399 = this.field2399;
        if ((arg1 & 0x100) == 0) {
            arg0.field2467 = this.field2467;
        } else {
            arg0.field2467 = true;
        }
        boolean var7 = class514.method3037(-118, this.field2438, arg1);
        boolean var8 = class255.method1675(arg1, this.field2438, 0);
        boolean var9 = class280.method1790(this.field2438, arg1, true);
        boolean var10 = var8 | var7 | var9;
        if (var10) {
            if (!var7) {
                arg0.field2359 = this.field2359;
            } else if (arg2.field2359 == null || this.field2424 > arg2.field2359.length) {
                arg0.field2359 = arg2.field2359 = new int[this.field2424];
            } else {
                arg0.field2359 = arg2.field2359;
            }
            if (!var8) {
                arg0.field2437 = this.field2437;
            } else if (arg2.field2437 == null || arg2.field2437.length < this.field2424) {
                arg0.field2437 = arg2.field2437 = new int[this.field2424];
            } else {
                arg0.field2437 = arg2.field2437;
            }
            if (!var9) {
                arg0.field2430 = this.field2430;
            } else if (arg2.field2430 == null || this.field2424 > arg2.field2430.length) {
                arg0.field2430 = arg2.field2430 = new int[this.field2424];
            } else {
                arg0.field2430 = arg2.field2430;
            }
            for (int var11 = 0; var11 < this.field2424; var11++) {
                if (var7) {
                    arg0.field2359[var11] = this.field2359[var11];
                }
                if (var8) {
                    arg0.field2437[var11] = this.field2437[var11];
                }
                if (var9) {
                    arg0.field2430[var11] = this.field2430[var11];
                }
            }
        } else {
            arg0.field2359 = this.field2359;
            arg0.field2437 = this.field2437;
            arg0.field2430 = this.field2430;
        }
        if (class238.method1578(5121, this.field2438, arg1)) {
            arg0.field2403 = arg2.field2403;
            if (arg5) {
                arg0.field2415 = (byte) (arg0.field2415 | 0x1);
            }
            arg0.field2403.field3842 = this.field2403.field3842;
            arg0.field2403.field3839 = this.field2403.field3839;
        } else if (class243.method1620(true, arg1, this.field2438)) {
            arg0.field2403 = this.field2403;
        } else {
            arg0.field2403 = null;
        }
        if (class221.method1483(true, arg1, this.field2438)) {
            if (arg2.field2409 == null || arg2.field2409.length < this.field2374) {
                arg0.field2409 = arg2.field2409 = new short[this.field2374];
            } else {
                arg0.field2409 = arg2.field2409;
            }
            for (int var12 = 0; var12 < this.field2374; var12++) {
                arg0.field2409[var12] = this.field2409[var12];
            }
        } else {
            arg0.field2409 = this.field2409;
        }
        if (class59.method411(arg1, 127, this.field2438)) {
            if (arg2.field2473 == null || arg2.field2473.length < this.field2374) {
                arg0.field2473 = arg2.field2473 = new byte[this.field2374];
            } else {
                arg0.field2473 = arg2.field2473;
            }
            for (int var13 = 0; var13 < this.field2374; var13++) {
                arg0.field2473[var13] = this.field2473[var13];
            }
        } else {
            arg0.field2473 = this.field2473;
        }
        if (class530.method3099(arg1, arg3 ^ 0x3, this.field2438)) {
            arg0.field2398 = arg2.field2398;
            if (arg5) {
                arg0.field2415 = (byte) (arg0.field2415 | 0x2);
            }
            arg0.field2398.field3839 = this.field2398.field3839;
            arg0.field2398.field3842 = this.field2398.field3842;
        } else if (class510.method3023(this.field2438, arg1, 31169)) {
            arg0.field2398 = this.field2398;
        } else {
            arg0.field2398 = null;
        }
        if (class41.method293(this.field2438, arg1, -19909)) {
            if (arg2.field2364 == null || this.field2412 > arg2.field2364.length) {
                int var14 = this.field2412;
                arg0.field2452 = arg2.field2452 = new short[var14];
                arg0.field2459 = arg2.field2459 = new short[var14];
                arg0.field2364 = arg2.field2364 = new short[var14];
            } else {
                arg0.field2364 = arg2.field2364;
                arg0.field2452 = arg2.field2452;
                arg0.field2459 = arg2.field2459;
            }
            if (this.field2400 == null) {
                for (int var18 = 0; var18 < this.field2412; var18++) {
                    arg0.field2364[var18] = this.field2364[var18];
                    arg0.field2459[var18] = this.field2459[var18];
                    arg0.field2452[var18] = this.field2452[var18];
                }
            } else {
                if (arg2.field2400 == null) {
                    arg2.field2400 = new class338();
                }
                class338 var15 = arg0.field2400 = arg2.field2400;
                if (var15.field4916 == null || this.field2412 > var15.field4916.length) {
                    int var16 = this.field2412;
                    var15.field4922 = new short[var16];
                    var15.field4920 = new short[var16];
                    var15.field4924 = new byte[var16];
                    var15.field4916 = new short[var16];
                }
                for (int var17 = 0; var17 < this.field2412; var17++) {
                    arg0.field2364[var17] = this.field2364[var17];
                    arg0.field2459[var17] = this.field2459[var17];
                    arg0.field2452[var17] = this.field2452[var17];
                    var15.field4916[var17] = this.field2400.field4916[var17];
                    var15.field4922[var17] = this.field2400.field4922[var17];
                    var15.field4920[var17] = this.field2400.field4920[var17];
                    var15.field4924[var17] = this.field2400.field4924[var17];
                }
            }
            arg0.field2369 = this.field2369;
        } else {
            arg0.field2364 = this.field2364;
            arg0.field2369 = this.field2369;
            arg0.field2452 = this.field2452;
            arg0.field2400 = this.field2400;
            arg0.field2459 = this.field2459;
        }
        if (class582.method3379(this.field2438, arg1, arg3)) {
            arg0.field2376 = arg2.field2376;
            if (arg5) {
                arg0.field2415 = (byte) (arg0.field2415 | 0x4);
            }
            arg0.field2376.field3842 = this.field2376.field3842;
            arg0.field2376.field3839 = this.field2376.field3839;
        } else if (class289.method1849(this.field2438, arg1, (byte) -126)) {
            arg0.field2376 = this.field2376;
        } else {
            arg0.field2376 = null;
        }
        if (class346.method2188(arg1, this.field2438, false)) {
            if (arg2.field2429 == null || this.field2374 > arg2.field2429.length) {
                int var19 = this.field2412;
                arg0.field2390 = arg2.field2390 = new float[var19];
                arg0.field2429 = arg2.field2429 = new float[var19];
            } else {
                arg0.field2390 = arg2.field2390;
                arg0.field2429 = arg2.field2429;
            }
            for (int var20 = 0; var20 < this.field2412; var20++) {
                arg0.field2429[var20] = this.field2429[var20];
                arg0.field2390[var20] = this.field2390[var20];
            }
        } else {
            arg0.field2429 = this.field2429;
            arg0.field2390 = this.field2390;
        }
        if (class64.method568(arg1, false, this.field2438)) {
            arg0.field2444 = arg2.field2444;
            if (arg5) {
                arg0.field2415 = (byte) (arg0.field2415 | 0x8);
            }
            arg0.field2444.field3842 = this.field2444.field3842;
            arg0.field2444.field3839 = this.field2444.field3839;
        } else if (class111.method833(false, arg1, this.field2438)) {
            arg0.field2444 = this.field2444;
        } else {
            arg0.field2444 = null;
        }
        if (class99.method761(this.field2438, arg3 + 13, arg1)) {
            if (arg2.field2405 == null || arg2.field2405.length < this.field2374) {
                int var21 = this.field2374;
                arg0.field2440 = arg2.field2440 = new short[var21];
                arg0.field2431 = arg2.field2431 = new short[var21];
                arg0.field2405 = arg2.field2405 = new short[var21];
            } else {
                arg0.field2405 = arg2.field2405;
                arg0.field2440 = arg2.field2440;
                arg0.field2431 = arg2.field2431;
            }
            for (int var22 = 0; var22 < this.field2374; var22++) {
                arg0.field2405[var22] = this.field2405[var22];
                arg0.field2440[var22] = this.field2440[var22];
                arg0.field2431[var22] = this.field2431[var22];
            }
        } else {
            arg0.field2431 = this.field2431;
            arg0.field2405 = this.field2405;
            arg0.field2440 = this.field2440;
        }
        if (class516.method3047(this.field2438, ~arg3, arg1)) {
            if (arg5) {
                arg0.field2415 = (byte) (arg0.field2415 | 0x10);
            }
            arg0.field2366 = arg2.field2366;
            arg0.field2366.field1359 = this.field2366.field1359;
        } else if (class546.method3196(arg1, (byte) 86, this.field2438)) {
            arg0.field2366 = this.field2366;
        } else {
            arg0.field2366 = null;
        }
        if (class72.method618(arg1, this.field2438, 69)) {
            if (arg2.field2425 == null || this.field2374 > arg2.field2425.length) {
                int var23 = this.field2374;
                arg0.field2425 = arg2.field2425 = new short[var23];
            } else {
                arg0.field2425 = arg2.field2425;
            }
            for (int var24 = 0; var24 < this.field2374; var24++) {
                arg0.field2425[var24] = this.field2425[var24];
            }
        } else {
            arg0.field2425 = this.field2425;
        }
        if (!class393.method2513(true, this.field2438, arg1)) {
            arg0.field2463 = this.field2463;
        } else if (arg2.field2463 == null || this.field2465 > arg2.field2463.length) {
            int var26 = this.field2465;
            arg0.field2463 = arg2.field2463 = new class442[var26];
            for (int var27 = 0; var27 < this.field2465; var27++) {
                arg0.field2463[var27] = this.field2463[var27].method2746((byte) 3);
            }
        } else {
            arg0.field2463 = arg2.field2463;
            for (int var25 = 0; var25 < this.field2465; var25++) {
                arg0.field2463[var25].method2744(this.field2463[var25], 34037);
            }
        }
        arg0.field2391 = this.field2391;
        arg0.field2382 = this.field2382;
        arg0.field2401 = this.field2401;
        arg0.field2468 = this.field2468;
        arg0.field2466 = this.field2466;
        arg0.field2410 = this.field2410;
        arg0.field2413 = this.field2413;
        arg0.field2358 = this.field2358;
        arg0.field2389 = this.field2389;
        arg0.field2420 = this.field2420;
        arg0.field2471 = this.field2471;
        if (this.field2439) {
            arg0.field2474 = this.field2474;
            arg0.field2404 = this.field2404;
            arg0.field2439 = true;
            arg0.field2457 = this.field2457;
            arg0.field2367 = this.field2367;
            arg0.field2365 = this.field2365;
            arg0.field2423 = this.field2423;
            arg0.field2481 = this.field2481;
            arg0.field2470 = this.field2470;
        } else {
            arg0.field2439 = false;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!as", name = "FA", descriptor = "(I)V", line = 4616)
    public final void method243(int arg0) {
        field2397++;
        int var2 = class373.field5548[arg0];
        int var3 = class373.field5549[arg0];
        for (int var4 = 0; var4 < this.field2383; var4++) {
            int var5 = this.field2437[var4] * var3 - (this.field2430[var4] * var2) >> 14;
            this.field2430[var4] = this.field2437[var4] * var2 + this.field2430[var4] * var3 >> 14;
            this.field2437[var4] = var5;
        }
        this.field2439 = false;
        if (this.field2403 != null) {
            this.field2403.field3839 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lql;)V", line = 4646)
    public final void method244(class738 arg0) {
        field2416++;
        class607 var2 = (class607) arg0;
        if (this.field2468 != null) {
            for (int var3 = 0; var3 < this.field2468.length; var3++) {
                class459 var4 = this.field2468[var3];
                class459 var5 = var4;
                if (var4.field6762 != null) {
                    var5 = var4.field6762;
                }
                var5.field6776 = (int) ((float) this.field2430[var4.field6766] * var2.field8591 + (float) this.field2437[var4.field6766] * var2.field8572 + (float) this.field2359[var4.field6766] * var2.field8562 + var2.field8575);
                var5.field6764 = (int) ((float) this.field2430[var4.field6766] * var2.field8558 + (float) this.field2437[var4.field6766] * var2.field8564 + (float) this.field2359[var4.field6766] * var2.field8578 + var2.field8590);
                var5.field6774 = (int) ((float) this.field2430[var4.field6766] * var2.field8581 + (float) this.field2437[var4.field6766] * var2.field8567 + (float) this.field2359[var4.field6766] * var2.field8583 + var2.field8563);
                var5.field6760 = (int) ((float) this.field2430[var4.field6770] * var2.field8591 + (float) this.field2437[var4.field6770] * var2.field8572 + (float) this.field2359[var4.field6770] * var2.field8562 + var2.field8575);
                var5.field6765 = (int) ((float) this.field2430[var4.field6770] * var2.field8558 + (float) this.field2437[var4.field6770] * var2.field8564 + (float) this.field2359[var4.field6770] * var2.field8578 + var2.field8590);
                var5.field6768 = (int) ((float) this.field2430[var4.field6770] * var2.field8581 + (float) this.field2437[var4.field6770] * var2.field8567 + (float) this.field2359[var4.field6770] * var2.field8583 + var2.field8563);
                var5.field6772 = (int) ((float) this.field2430[var4.field6757] * var2.field8591 + (float) this.field2437[var4.field6757] * var2.field8572 + (float) this.field2359[var4.field6757] * var2.field8562 + var2.field8575);
                var5.field6758 = (int) ((float) this.field2430[var4.field6757] * var2.field8558 + (float) this.field2437[var4.field6757] * var2.field8564 + (float) this.field2359[var4.field6757] * var2.field8578 + var2.field8590);
                var5.field6761 = (int) ((float) this.field2430[var4.field6757] * var2.field8581 + (float) this.field2437[var4.field6757] * var2.field8567 + (float) this.field2359[var4.field6757] * var2.field8583 + var2.field8563);
            }
        }
        if (this.field2358 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field2358.length; var6++) {
            class285 var7 = this.field2358[var6];
            class285 var8 = var7;
            if (var7.field4054 != null) {
                var8 = var7.field4054;
            }
            if (var7.field4046 == null) {
                var7.field4046 = var2.method759();
            } else {
                var7.field4046.method772(var2);
            }
            var8.field4048 = (int) ((float) this.field2430[var7.field4055] * var2.field8591 + (float) this.field2437[var7.field4055] * var2.field8572 + (float) this.field2359[var7.field4055] * var2.field8562 + var2.field8575);
            var8.field4045 = (int) ((float) this.field2430[var7.field4055] * var2.field8558 + (float) this.field2437[var7.field4055] * var2.field8564 + (float) this.field2359[var7.field4055] * var2.field8578 + var2.field8590);
            var8.field4049 = (int) ((float) this.field2430[var7.field4055] * var2.field8581 + (float) this.field2437[var7.field4055] * var2.field8567 + (float) this.field2359[var7.field4055] * var2.field8583 + var2.field8563);
        }
    }

    @OriginalMember(owner = "client!as", name = "G", descriptor = "()I", line = 4711)
    public final int method250() {
        if (!this.field2439) {
            this.method1141(32767);
        }
        field2456++;
        return this.field2470;
    }

    @OriginalMember(owner = "client!as", name = "k", descriptor = "(I)V", line = 4723)
    public final void method247(int arg0) {
        field2368++;
        int var2 = class373.field5548[arg0];
        int var3 = class373.field5549[arg0];
        for (int var4 = 0; var4 < this.field2383; var4++) {
            int var7 = this.field2430[var4] * var2 + this.field2359[var4] * var3 >> 14;
            this.field2430[var4] = this.field2430[var4] * var3 - this.field2359[var4] * var2 >> 14;
            this.field2359[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field2412; var5++) {
            int var6 = this.field2452[var5] * var2 + (this.field2364[var5] * var3) >> 14;
            this.field2452[var5] = (short) (this.field2452[var5] * var3 - (this.field2364[var5] * var2) >> 14);
            this.field2364[var5] = (short) var6;
        }
        if (this.field2376 == null && this.field2398 != null) {
            this.field2398.field3839 = null;
        }
        if (this.field2376 != null) {
            this.field2376.field3839 = null;
        }
        this.field2439 = false;
        if (this.field2403 != null) {
            this.field2403.field3839 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "wa", descriptor = "()V", line = 4773)
    public final void method241() {
        for (int var1 = 0; var1 < this.field2424; var1++) {
            this.field2359[var1] = this.field2359[var1] + 7 >> 4;
            this.field2437[var1] = this.field2437[var1] + 7 >> 4;
            this.field2430[var1] = this.field2430[var1] + 7 >> 4;
        }
        field2460++;
        this.field2439 = false;
        if (this.field2403 != null) {
            this.field2403.field3839 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "EA", descriptor = "()I", line = 4802)
    public final int method236() {
        field2451++;
        if (!this.field2439) {
            this.method1141(32767);
        }
        return this.field2474;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I[IIIIIZ)V", line = 4814)
    public final void method248(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field2435++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg3 << 4;
            int var11 = arg4 << 4;
            class184.field2809 = 0;
            class158.field2517 = 0;
            int var12 = 0;
            class734.field10260 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field2420.length > var14) {
                    int[] var15 = this.field2420[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class734.field10260 += this.field2359[var17];
                        class158.field2517 += this.field2437[var17];
                        var12++;
                        class184.field2809 += this.field2430[var17];
                    }
                }
            }
            if (var12 > 0) {
                class184.field2809 = class184.field2809 / var12 + var11;
                class734.field10260 = class734.field10260 / var12 + var9;
                class158.field2517 = class158.field2517 / var12 + var10;
            } else {
                class158.field2517 = var10;
                class734.field10260 = var9;
                class184.field2809 = var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg3 << 4;
            int var19 = arg2 << 4;
            int var20 = arg4 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field2420.length) {
                    int[] var23 = this.field2420[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field2359[var25] += var19;
                        this.field2437[var25] += var18;
                        this.field2430[var25] += var20;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field2420.length) {
                    int[] var46 = this.field2420[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field2359[var48] -= class734.field10260;
                            this.field2437[var48] -= class158.field2517;
                            this.field2430[var48] -= class184.field2809;
                            if (arg4 != 0) {
                                int var49 = class373.field5548[arg4];
                                int var50 = class373.field5549[arg4];
                                int var51 = this.field2437[var48] * var49 + this.field2359[var48] * var50 + 16383 >> 14;
                                this.field2437[var48] = this.field2437[var48] * var50 + 16383 - (this.field2359[var48] * var49) >> 14;
                                this.field2359[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class373.field5548[arg2];
                                int var53 = class373.field5549[arg2];
                                int var54 = this.field2437[var48] * var53 + 16383 - (this.field2430[var48] * var52) >> 14;
                                this.field2430[var48] = this.field2437[var48] * var52 + (this.field2430[var48] * var53) + 16383 >> 14;
                                this.field2437[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class373.field5548[arg3];
                                int var56 = class373.field5549[arg3];
                                int var57 = this.field2359[var48] * var56 + (this.field2430[var48] * var55 + 16383) >> 14;
                                this.field2430[var48] = this.field2430[var48] * var56 + 16383 - (this.field2359[var48] * var55) >> 14;
                                this.field2359[var48] = var57;
                            }
                            this.field2359[var48] += class734.field10260;
                            this.field2437[var48] += class158.field2517;
                            this.field2430[var48] += class184.field2809;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field2359[var59] -= class734.field10260;
                            this.field2437[var59] -= class158.field2517;
                            this.field2430[var59] -= class184.field2809;
                            if (arg2 != 0) {
                                int var60 = class373.field5548[arg2];
                                int var61 = class373.field5549[arg2];
                                int var62 = this.field2437[var59] * var61 + 16383 - (this.field2430[var59] * var60) >> 14;
                                this.field2430[var59] = this.field2437[var59] * var60 + this.field2430[var59] * var61 + 16383 >> 14;
                                this.field2437[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class373.field5548[arg4];
                                int var64 = class373.field5549[arg4];
                                int var65 = this.field2437[var59] * var63 + this.field2359[var59] * var64 + 16383 >> 14;
                                this.field2437[var59] = this.field2437[var59] * var64 + 16383 - (this.field2359[var59] * var63) >> 14;
                                this.field2359[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class373.field5548[arg3];
                                int var67 = class373.field5549[arg3];
                                int var68 = this.field2430[var59] * var66 + this.field2359[var59] * var67 + 16383 >> 14;
                                this.field2430[var59] = this.field2430[var59] * var67 + 16383 - (this.field2359[var59] * var66) >> 14;
                                this.field2359[var59] = var68;
                            }
                            this.field2359[var59] += class734.field10260;
                            this.field2437[var59] += class158.field2517;
                            this.field2430[var59] += class184.field2809;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field2420.length) {
                        int[] var29 = this.field2420[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field2413[var31];
                            int var33 = this.field2413[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field2410[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class373.field5548[arg4];
                                    int var37 = class373.field5549[arg4];
                                    int var38 = this.field2459[var35] * var36 + this.field2364[var35] * var37 + 16383 >> 14;
                                    this.field2459[var35] = (short) (this.field2459[var35] * var37 + 16383 - (this.field2364[var35] * var36) >> 14);
                                    this.field2364[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class373.field5548[arg2];
                                    int var40 = class373.field5549[arg2];
                                    int var41 = this.field2459[var35] * var40 + 16383 - (this.field2452[var35] * var39) >> 14;
                                    this.field2452[var35] = (short) (this.field2459[var35] * var39 + this.field2452[var35] * var40 + 16383 >> 14);
                                    this.field2459[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class373.field5548[arg3];
                                    int var43 = class373.field5549[arg3];
                                    int var44 = this.field2452[var35] * var42 + this.field2364[var35] * var43 + 16383 >> 14;
                                    this.field2452[var35] = (short) (this.field2452[var35] * var43 + 16383 - (this.field2364[var35] * var42) >> 14);
                                    this.field2364[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field2376 == null && this.field2398 != null) {
                    this.field2398.field3839 = null;
                }
                if (this.field2376 != null) {
                    this.field2376.field3839 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field2420.length > var70) {
                    int[] var71 = this.field2420[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field2359[var73] -= class734.field10260;
                        this.field2437[var73] -= class158.field2517;
                        this.field2430[var73] -= class184.field2809;
                        this.field2359[var73] = this.field2359[var73] * arg2 >> 7;
                        this.field2437[var73] = this.field2437[var73] * arg3 >> 7;
                        this.field2430[var73] = this.field2430[var73] * arg4 >> 7;
                        this.field2359[var73] += class734.field10260;
                        this.field2437[var73] += class158.field2517;
                        this.field2430[var73] += class184.field2809;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field2391 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field2391.length > var78) {
                        int[] var79 = this.field2391[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field2473[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field2473[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field2398 != null) {
                            this.field2398.field3839 = null;
                        }
                    }
                }
                if (this.field2382 != null) {
                    for (int var75 = 0; var75 < this.field2465; var75++) {
                        class479 var76 = this.field2382[var75];
                        class442 var77 = this.field2463[var75];
                        var77.field6583 = var77.field6583 & 0xFFFFFF | 255 - (this.field2473[var76.field6943] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field2391 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (var87 < this.field2391.length) {
                        int[] var88 = this.field2391[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field2409[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFD61) >> 10;
                            int var93 = (var91 & 0x3B8) >> 7;
                            int var94 = arg3 / 4 + var93;
                            int var95 = var92 + arg2 & 0x3F;
                            int var96 = var91 & 0x7F;
                            if (var94 < 0) {
                                var94 = 0;
                            } else if (var94 > 7) {
                                var94 = 7;
                            }
                            int var97 = arg4 + var96;
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field2409[var90] = (short) class625.method3600(var97, class625.method3600(var94 << 7, var95 << 10));
                        }
                        if (var88.length > 0 && this.field2398 != null) {
                            this.field2398.field3839 = null;
                        }
                    }
                }
                if (this.field2382 != null) {
                    for (int var84 = 0; var84 < this.field2465; var84++) {
                        class479 var85 = this.field2382[var84];
                        class442 var86 = this.field2463[var84];
                        var86.field6583 = class324.field4632[this.field2409[var85.field6943] & 0xFFFF] & 0xFFFFFF | var86.field6583 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field2471 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (var99 < this.field2471.length) {
                        int[] var100 = this.field2471[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class442 var102 = this.field2463[var100[var101]];
                            var102.field6576 += arg3;
                            var102.field6586 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field2471 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field2471.length) {
                        int[] var105 = this.field2471[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class442 var107 = this.field2463[var105[var106]];
                            var107.field6584 = var107.field6584 * arg3 >> 7;
                            var107.field6579 = var107.field6579 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field2471 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field2471.length > var109) {
                    int[] var110 = this.field2471[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class442 var112 = this.field2463[var110[var111]];
                        var112.field6578 = var112.field6578 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!as", name = "f", descriptor = "(I)V", line = 5474)
    private final void method1144(int arg0) {
        field2464++;
        if (!this.field2458) {
            return;
        }
        this.field2458 = false;
        if (this.field2468 == null && this.field2358 == null && this.field2382 == null) {
            if (this.field2359 != null && !class429.method2670(this.field2438, (byte) -85, this.field2472)) {
                if (this.field2403 != null && this.field2403.field3839 == null) {
                    this.field2458 = true;
                } else {
                    if (!this.field2439) {
                        this.method1141(32767);
                    }
                    this.field2359 = null;
                }
            }
            if (this.field2437 != null && !class105.method792(false, this.field2472, this.field2438)) {
                if (this.field2403 != null && this.field2403.field3839 == null) {
                    this.field2458 = true;
                } else {
                    if (!this.field2439) {
                        this.method1141(32767);
                    }
                    this.field2437 = null;
                }
            }
            if (this.field2430 != null && !class71.method613(this.field2438, this.field2472, arg0 ^ 0x2897)) {
                if (this.field2403 != null && this.field2403.field3839 == null) {
                    this.field2458 = true;
                } else {
                    if (!this.field2439) {
                        this.method1141(32767);
                    }
                    this.field2430 = null;
                }
            }
        }
        if (this.field2410 != null && this.field2359 == null && this.field2437 == null && this.field2430 == null) {
            this.field2413 = null;
            this.field2410 = null;
        }
        if (arg0 != 10391) {
            this.method269();
        }
        if (this.field2369 != null && !class394.method2521(this.field2438, (byte) 115, this.field2472)) {
            if (this.field2376 == null) {
                if (this.field2398 != null && this.field2398.field3839 == null) {
                    this.field2458 = true;
                } else {
                    this.field2364 = this.field2459 = this.field2452 = null;
                    this.field2369 = null;
                }
            } else if (this.field2376.field3839 == null) {
                this.field2458 = true;
            } else {
                this.field2364 = this.field2459 = this.field2452 = null;
                this.field2369 = null;
            }
        }
        if (this.field2409 != null && !class296.method1875(this.field2438, this.field2472, 2)) {
            if (this.field2398 != null && this.field2398.field3839 == null) {
                this.field2458 = true;
            } else {
                this.field2409 = null;
            }
        }
        if (this.field2473 != null && !class223.method1500(0, this.field2438, this.field2472)) {
            if (this.field2398 != null && this.field2398.field3839 == null) {
                this.field2458 = true;
            } else {
                this.field2473 = null;
            }
        }
        if (this.field2429 != null && !class191.method1328(this.field2438, this.field2472, -126)) {
            if (this.field2444 != null && this.field2444.field3839 == null) {
                this.field2458 = true;
            } else {
                this.field2429 = this.field2390 = null;
            }
        }
        if (this.field2425 != null && !class105.method794(this.field2438, arg0 ^ 0x28B2, this.field2472)) {
            if (this.field2398 != null && this.field2398.field3839 == null) {
                this.field2458 = true;
            } else {
                this.field2425 = null;
            }
        }
        if (this.field2405 != null && !class280.method1784(this.field2438, arg0 - 715140457, this.field2472)) {
            if ((this.field2366 == null || this.field2366.field1359 != null) && (this.field2398 == null || this.field2398.field3839 != null)) {
                this.field2405 = this.field2440 = this.field2431 = null;
            } else {
                this.field2458 = true;
            }
        }
        if (this.field2391 != null && !class473.method2850(this.field2438, 0, this.field2472)) {
            this.field2466 = null;
            this.field2391 = null;
        }
        if (this.field2420 != null && !class335.method2111(false, this.field2438, this.field2472)) {
            this.field2401 = null;
            this.field2420 = null;
        }
        if (this.field2471 != null && !class699.method3966((byte) 35, this.field2438, this.field2472)) {
            this.field2471 = null;
        }
        if (this.field2389 != null && (this.field2472 & 0x800) == 0 && (this.field2472 & 0x40000) == 0) {
            this.field2389 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(B)V", line = 5653)
    private final void method1145(byte arg0) {
        if (arg0 >= -42) {
            return;
        }
        field2436++;
        if (this.field2399 == 0) {
            return;
        }
        if (this.field2415 != 0) {
            this.method1136(84, true);
        }
        this.method1136(97, false);
        if (this.field2366 != null) {
            if (this.field2366.field1359 == null) {
                this.method1142((this.field2415 & 0x10) != 0, 1600);
            }
            if (this.field2366.field1359 != null) {
                this.field2427.method1089(this.field2376 != null, 122);
                this.field2427.method1048(this.field2403, 16384, this.field2398, this.field2444, this.field2376);
                int var2 = this.field2389.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field2389[var3];
                    int var5 = this.field2389[var3 + 1];
                    int var6 = this.field2425[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field2427.method1090(this.field2376 != null, -25501, var6);
                    this.field2427.method1064(false, 4, this.field2366.field1359, var4 * 3, (var5 - var4) * 3);
                }
            }
        }
        this.method1144(10391);
    }

    @OriginalMember(owner = "client!as", name = "RA", descriptor = "()I", line = 5715)
    public final int method239() {
        if (!this.field2439) {
            this.method1141(32767);
        }
        field2394++;
        return this.field2423;
    }

    @OriginalMember(owner = "client!as", name = "HA", descriptor = "()I", line = 5732)
    public final int method246() {
        if (!this.field2439) {
            this.method1141(32767);
        }
        field2387++;
        return this.field2365;
    }

    @OriginalMember(owner = "client!as", name = "fa", descriptor = "()I", line = 5746)
    public final int method253() {
        field2428++;
        if (!this.field2439) {
            this.method1141(32767);
        }
        return this.field2481;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IILql;ZII)Z", line = 5758)
    public final boolean method283(int arg0, int arg1, class738 arg2, boolean arg3, int arg4, int arg5) {
        field2357++;
        return this.method1134(arg4, arg3, arg1, arg2, arg0, arg5, 1);
    }

    @OriginalMember(owner = "client!as", name = "ma", descriptor = "()I", line = 5766)
    public final int method269() {
        field2375++;
        if (!this.field2439) {
            this.method1141(32767);
        }
        return this.field2367;
    }
}
