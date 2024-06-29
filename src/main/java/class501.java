import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public class class501 {

    @OriginalMember(owner = "client!ria", name = "o", descriptor = "[I")
    private int[] field7267 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!ria", name = "q", descriptor = "[I")
    private int[] field7269 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!ria", name = "n", descriptor = "Z")
    public boolean field7266;

    @OriginalMember(owner = "client!ria", name = "s", descriptor = "I")
    public int field7271;

    @OriginalMember(owner = "client!ria", name = "j", descriptor = "I")
    public int field7262;

    @OriginalMember(owner = "client!ria", name = "u", descriptor = "Lsv;")
    private class59 field7273;

    @OriginalMember(owner = "client!ria", name = "x", descriptor = "Lnt;")
    private class140 field7276;

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "I")
    public int field7253;

    @OriginalMember(owner = "client!ria", name = "v", descriptor = "[[[B")
    private byte[][][] field7274;

    @OriginalMember(owner = "client!ria", name = "g", descriptor = "[[[B")
    private byte[][][] field7259;

    @OriginalMember(owner = "client!ria", name = "m", descriptor = "[[[I")
    public int[][][] field7265;

    @OriginalMember(owner = "client!ria", name = "t", descriptor = "[[[B")
    private byte[][][] field7272;

    @OriginalMember(owner = "client!ria", name = "k", descriptor = "[[[B")
    private byte[][][] field7263;

    @OriginalMember(owner = "client!ria", name = "f", descriptor = "[[[B")
    public byte[][][] field7258;

    @OriginalMember(owner = "client!ria", name = "B", descriptor = "Lfba;")
    public static class348 field7280 = new class348(20);

    @OriginalMember(owner = "client!ria", name = "C", descriptor = "Lfba;")
    public static class348 field7281 = new class348(4);

    @OriginalMember(owner = "client!ria", name = "b", descriptor = "I")
    public static int field7254;

    @OriginalMember(owner = "client!ria", name = "c", descriptor = "I")
    public static int field7255;

    @OriginalMember(owner = "client!ria", name = "e", descriptor = "I")
    public static int field7257;

    @OriginalMember(owner = "client!ria", name = "h", descriptor = "I")
    public static int field7260;

    @OriginalMember(owner = "client!ria", name = "i", descriptor = "I")
    public static int field7261;

    @OriginalMember(owner = "client!ria", name = "l", descriptor = "I")
    public static int field7264;

    @OriginalMember(owner = "client!ria", name = "p", descriptor = "I")
    public static int field7268;

    @OriginalMember(owner = "client!ria", name = "r", descriptor = "I")
    public static int field7270;

    @OriginalMember(owner = "client!ria", name = "w", descriptor = "I")
    public static int field7275;

    @OriginalMember(owner = "client!ria", name = "y", descriptor = "I")
    public static int field7277;

    @OriginalMember(owner = "client!ria", name = "z", descriptor = "I")
    public static int field7278;

    @OriginalMember(owner = "client!ria", name = "A", descriptor = "I")
    public static int field7279;

    @OriginalMember(owner = "client!ria", name = "D", descriptor = "I")
    public static int field7282;

    @OriginalMember(owner = "client!ria", name = "E", descriptor = "I")
    public static int field7283;

    @OriginalMember(owner = "client!ria", name = "d", descriptor = "[[[B")
    public byte[][][] field7256;

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(Ls;Lha;ILs;)V")
    public final void method3042(class339 arg0, class543 arg1, int arg2, class339 arg3) {
        field7257++;
        if (class640.field9113 == null || class640.field9113.length != this.field7253) {
            class95.field1384 = new int[this.field7253];
            class640.field9113 = new int[this.field7253];
            client.field6416 = new int[this.field7253];
            class426.field6155 = new int[this.field7253];
            class633.field8937 = new int[this.field7253];
        }
        int[][] var5 = new int[this.field7262][this.field7253];
        for (int var6 = 0; var6 < this.field7271; var6++) {
            for (int var8 = 0; var8 < this.field7253; var8++) {
                class640.field9113[var8] = 0;
                class95.field1384[var8] = 0;
                class633.field8937[var8] = 0;
                client.field6416[var8] = 0;
                class426.field6155[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field7262; var9++) {
                for (int var10 = 0; var10 < this.field7253; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (var19 < this.field7262) {
                        int var20 = this.field7263[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class507 var21 = this.field7276.method988(120, var20 - 1);
                            class640.field9113[var10] += var21.field7368;
                            class95.field1384[var10] += var21.field7366;
                            class633.field8937[var10] += var21.field7364;
                            client.field6416[var10] += var21.field7359;
                            var10002 = class426.field6155[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field7263[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class507 var24 = this.field7276.method988(58, var23 - 1);
                            class640.field9113[var10] -= var24.field7368;
                            class95.field1384[var10] -= var24.field7366;
                            class633.field8937[var10] -= var24.field7364;
                            client.field6416[var10] -= var24.field7359;
                            var10002 = class426.field6155[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field7253; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field7253) {
                            var11 += class640.field9113[var17];
                            var15 += class426.field6155[var17];
                            var12 += class95.field1384[var17];
                            var14 += client.field6416[var17];
                            var13 += class633.field8937[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var15 -= class426.field6155[var18];
                            var11 -= class640.field9113[var18];
                            var12 -= class95.field1384[var18];
                            var14 -= client.field6416[var18];
                            var13 -= class633.field8937[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class749.method4177(1970794817, var11 * 256 / var14, var13 / var15, var12 / var15);
                        }
                    }
                }
            }
            if (class48.field798) {
                this.method3054(arg1, var5, var6, 120, var6 == 0 ? arg3 : null, class95.field1372[var6], var6 == 0 ? arg0 : null);
            } else {
                this.method3043(class95.field1372[var6], var6 == 0 ? arg3 : null, -27821, var5, arg1, var6, var6 == 0 ? arg0 : null);
            }
            this.field7263[var6] = null;
            this.field7274[var6] = null;
            this.field7259[var6] = null;
            this.field7272[var6] = null;
        }
        if (!this.field7266) {
            if (class80.field1150 != 0) {
                class375.method2325();
            }
            if (class609.field8694) {
                class482.method2949();
            }
        }
        for (int var7 = 0; var7 < this.field7271; var7++) {
            class95.field1372[var7].method35();
        }
        if (arg2 != -1) {
            this.field7259 = null;
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(Ls;Ls;I[[ILha;ILs;)V")
    private final void method3043(class339 arg0, class339 arg1, int arg2, int[][] arg3, class543 arg4, int arg5, class339 arg6) {
        field7278++;
        if (arg2 != -27821) {
            return;
        }
        for (int var8 = 0; var8 < this.field7262; var8++) {
            for (int var9 = 0; var9 < this.field7253; var9++) {
                if (class721.field10154 == -1 || class583.method3433((byte) 16, class721.field10154, arg5, var9, var8)) {
                    byte var10 = this.field7259[arg5][var8][var9];
                    byte var11 = this.field7272[arg5][var8][var9];
                    int var12 = this.field7274[arg5][var8][var9] & 0xFF;
                    int var13 = this.field7263[arg5][var8][var9] & 0xFF;
                    class584 var14 = var12 == 0 ? null : this.field7273.method555((byte) -90, var12 - 1);
                    class507 var15 = var13 == 0 ? null : this.field7276.method988(90, var13 - 1);
                    if (var10 == 0 && var14 == null) {
                        var10 = 12;
                    }
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var16 = var15 == null ? 0 : class477.field6777[var10];
                        var17 = var14 == null ? 0 : class185.field2557[var10];
                    } else if (var14 != null) {
                        var17 = class185.field2557[var10];
                    } else if (var15 != null) {
                        var16 = class185.field2557[var10];
                    }
                    int var18 = var17 + var16;
                    int var19 = 0;
                    if (var18 != 0) {
                        int var20 = var14 == null ? -1 : var14.field8323;
                        int var21 = var15 == null ? -1 : var15.field7369;
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        int[] var24 = new int[var18];
                        int[] var25 = new int[var18];
                        boolean var26 = false;
                        boolean var27 = false;
                        if (var14 != null && (var14.field8337 != -1 || var14.field8324 != -1 || var20 != -1)) {
                            for (int var28 = 0; var28 < var17; var28++) {
                                var24[var19] = var20;
                                var25[var19] = var14.field8326;
                                if (var14.field8337 == -1) {
                                    var22[var19] = -1;
                                } else {
                                    var22[var19] = var14.field8337;
                                }
                                if (var14.field8324 == -1) {
                                    var23[var19] = -1;
                                } else {
                                    var23[var19] = var14.field8324;
                                    var26 = true;
                                }
                                var19++;
                            }
                            if (!this.field7266 && arg5 == 0) {
                                class607.method3536(var8, var9, var14.field8325, var14.field8336 * 8, var14.field8331);
                            }
                        } else {
                            for (int var29 = 0; var29 < var17; var29++) {
                                var22[var19] = -1;
                                var19++;
                            }
                            var27 = true;
                        }
                        if (!var26) {
                            var23 = null;
                        }
                        if (var15 == null) {
                            if (var27) {
                                continue;
                            }
                            for (int var31 = 0; var31 < var16; var31++) {
                                var22[var19] = -1;
                                var19++;
                            }
                        } else {
                            for (int var30 = 0; var30 < var16; var30++) {
                                var24[var19] = var21;
                                var25[var19] = var15.field7362;
                                var22[var19] = arg3[var8][var9];
                                if (var23 != null) {
                                    var23[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var32 = this.field7267.length;
                        int[] var33 = new int[var32];
                        int[] var34 = new int[var32];
                        int[] var35 = arg1 == null ? null : new int[var32];
                        int[] var36 = arg1 == null && arg6 == null ? null : new int[var32];
                        for (int var37 = 0; var37 < var32; var37++) {
                            int var47 = this.field7267[var37];
                            int var48 = this.field7269[var37];
                            if (var11 == 0) {
                                var33[var37] = var47;
                                var34[var37] = var48;
                            } else if (var11 == 1) {
                                var33[var37] = var48;
                                var34[var37] = 512 - var47;
                            } else if (var11 == 2) {
                                var33[var37] = 512 - var47;
                                var34[var37] = 512 - var48;
                            } else if (var11 == 3) {
                                var33[var37] = 512 - var48;
                                var34[var37] = var47;
                            }
                            if (var35 != null && class495.field7121[var10][var37]) {
                                int var51 = (var8 << 9) + var33[var37];
                                int var52 = (var9 << 9) + var34[var37];
                                var35[var37] = arg1.method2089(26448, var51, var52) - arg0.method2089(26448, var51, var52);
                            }
                            if (var36 != null) {
                                if (arg1 != null && !class495.field7121[var10][var37]) {
                                    int var53 = (var8 << 9) + var33[var37];
                                    int var54 = (var9 << 9) + var34[var37];
                                    var36[var37] = arg0.method2089(26448, var53, var54) - arg1.method2089(arg2 + 54269, var53, var54);
                                } else if (arg6 != null && !class253.field3652[var10][var37]) {
                                    int var55 = (var8 << 9) + var33[var37];
                                    int var56 = (var9 << 9) + var34[var37];
                                    var36[var37] = arg6.method2089(26448, var55, var56) - arg0.method2089(26448, var55, var56);
                                }
                            }
                        }
                        int var38 = arg0.method2087(79, var8, var9);
                        int var39 = arg0.method2087(125, var8 + 1, var9);
                        int var40 = arg0.method2087(107, var8 + 1, var9 + 1);
                        int var41 = arg0.method2087(84, var8, var9 + 1);
                        boolean var42 = class547.method3292((byte) -109, var9, var8);
                        if (var42 && arg5 > 1 || !var42 && arg5 > 0) {
                            boolean var43 = true;
                            if (var15 != null && !var15.field7361) {
                                var43 = false;
                            } else if (var13 == 0 && var10 != 0) {
                                var43 = false;
                            } else if (var12 > 0 && var14 != null && !var14.field8335) {
                                var43 = false;
                            }
                            if (var43 && var38 == var39 && var38 == var40 && var38 == var41) {
                                this.field7258[arg5][var8][var9] = (byte) class430.method2658(this.field7258[arg5][var8][var9], 4);
                            }
                        }
                        int var44 = 0;
                        int var45 = 0;
                        int var46 = 0;
                        if (this.field7266) {
                            var44 = class135.method965(var8, var9);
                            var45 = class94.method732(var8, var9);
                            var46 = class451.method2759(var8, var9);
                        }
                        arg0.method42(var8, var9, var33, var35, var34, var36, class644.field9262[var10], class437.field6235[var10], class181.field2503[var10], var22, var23, var24, var25, var44, var45, var46, false);
                        class25.method107(arg5, var8, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(IILsl;III[Lfe;)V")
    public final void method3044(int arg0, int arg1, class479 arg2, int arg3, int arg4, int arg5, class635[] arg6) {
        field7270++;
        if (!this.field7266) {
            for (int var8 = 0; var8 < 4; var8++) {
                class635 var9 = arg6[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg5 + var10;
                        int var13 = arg3 + var11;
                        if (var12 >= 0 && var12 < this.field7262 && var13 >= 0 && var13 < this.field7253) {
                            var9.method3642(var13, -2097153, var12);
                        }
                    }
                }
            }
        }
        int var14 = arg4 + arg5;
        if (arg0 != 64) {
            this.field7276 = null;
        }
        int var15 = arg1 + arg3;
        for (int var16 = 0; var16 < this.field7271; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method3047(0, var18 + arg3, arg2, 0, 0, arg5 + var17, var15 + var18, false, (byte) 113, var14 + var17, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "([[III)V")
    public final void method3045(int[][] arg0, int arg1, int arg2) {
        if (arg1 != 1532) {
            this.field7262 = 72;
        }
        field7277++;
        int[][] var4 = this.field7265[arg2];
        for (int var5 = 0; var5 < this.field7262 + 1; var5++) {
            for (int var6 = 0; var6 < (this.field7253 + 1); var6++) {
                var4[var5][var6] += arg0[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(I)I")
    public static final int method3046(int arg0) {
        field7254++;
        if (class243.field3580.field7965.method159(false) == 0) {
            for (int var1 = 0; var1 < class518.field7470; var1++) {
                if (class282.field3945[var1].method2802(arg0 - 38449) == 's' || class282.field3945[var1].method2802(-17007) == 'S') {
                    class243.field3580.method3301(1, 24, class243.field3580.field7965);
                    break;
                }
            }
        }
        if (arg0 != 21442) {
            field7281 = null;
        }
        if (class474.field6720 == class145.field1962) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class465.method2818(255);
            if (class139.field1904 == 0L) {
                class139.field1904 = var4;
            }
            if (var3 > 16384 && (var4 - class139.field1904) < 5000L) {
                if (var4 - class431.field6194 > 1000L) {
                    System.gc();
                    class431.field6194 = var4;
                }
                return 0;
            }
        }
        if (class474.field6723 == class145.field1962) {
            if (class264.field3788 == null) {
                class264.field3788 = new class342(class488.field7032, class713.field10059, class186.field2606, class608.field8684);
            }
            if (!class264.field3788.method2097(64)) {
                return 0;
            }
            class358.method2271(true, 0, arg0 ^ 0x53C2, null);
            class463.field6617 = !class123.method868(arg0 - 21442);
            class393.field5648 = class360.method2275(false, (byte) -118, 1, class463.field6617 ? 34 : 32);
            class679.field9650 = class360.method2275(false, (byte) 32, 1, 33);
            class726.field10209 = class360.method2275(false, (byte) 50, 1, 13);
        }
        if (class474.field6725 == class145.field1962) {
            boolean var6 = class679.field9650.method2620(true);
            int var7 = class59.field983[33].method1601((byte) -125);
            int var8 = var7 + class59.field983[class463.field6617 ? 34 : 32].method1601((byte) 57);
            int var9 = var8 + class59.field983[13].method1601((byte) -102);
            int var10 = var9 + (var6 ? 100 : class679.field9650.method2610(0));
            if (var10 != 400) {
                return var10 / 4;
            }
            class505.field7339 = class393.field5648.method2615(false);
            class185.field2554 = class679.field9650.method2615(false);
            class283.method1814(class393.field5648, -14805);
            int var11 = class243.field3580.field7999.method1758(false);
            class563.field8157 = new class11(class528.field7683, class45.field748, class679.field9650);
            int[] var12 = class563.field8157.method57(119, var11);
            if (var12.length == 0) {
                var12 = class563.field8157.method57(arg0 - 21321, 0);
            }
            class609 var13 = new class609(class393.field5648, class726.field10209);
            if (var12.length > 0) {
                class429.field6178 = new class255[var12.length];
                for (int var14 = 0; var14 < class429.field6178.length; var14++) {
                    class429.field6178[var14] = new class593(class563.field8157.method55(var12[var14], arg0 - 28866), var13);
                }
            }
        }
        if (class474.field6726 == class145.field1962) {
            class611.method3560(-13338, class393.field5648, class415.method2503(82), class726.field10209);
        }
        if (class474.field6727 == class145.field1962) {
            int var15 = class233.method1624(4);
            int var16 = class678.method3854(-73);
            if (var15 < var16) {
                return var15 * 100 / var16;
            }
        }
        if (class474.field6728 == class145.field1962) {
            if (class429.field6178 != null && class429.field6178.length > 0) {
                if (class429.field6178[0].method1341((byte) 125) < 100) {
                    return 0;
                }
                if (class429.field6178.length > 1 && class563.field8157.method54((byte) -88) && class429.field6178[1].method1341((byte) 126) < 100) {
                    return 0;
                }
            }
            class191.method1349(class211.field3164, true);
            class386.method2375((byte) 49, class211.field3164);
            class79.method649(arg0 ^ 0xFFFFE0CA, 1);
        }
        if (class474.field6729 == class145.field1962) {
            for (int var17 = 0; var17 < 4; var17++) {
                class6.field57[var17] = class449.method2746(class184.field2546, class240.field3555, arg0 - 21436);
            }
        }
        if (class474.field6730 == class145.field1962) {
            class603.field8548 = class360.method2275(false, (byte) 61, 1, 8);
            class241.field3573 = class360.method2275(false, (byte) -92, 1, 0);
            class102.field1458 = class360.method2275(false, (byte) 67, 1, 1);
            class284.field3966 = class360.method2275(false, (byte) -54, 1, 2);
            class225.field3351 = class360.method2275(false, (byte) 31, 1, 3);
            class551.field8040 = class360.method2275(false, (byte) 60, 1, 4);
            class275.field3876 = class360.method2275(true, (byte) -95, 1, 5);
            class505.field7338 = class360.method2275(true, (byte) 95, 1, 6);
            class386.field5586 = class360.method2275(false, (byte) -77, 1, 7);
            class223.field3286 = class360.method2275(false, (byte) -105, 1, 9);
            class497.field7147 = class360.method2275(false, (byte) 121, 1, 10);
            class429.field6177 = class360.method2275(false, (byte) -124, 1, 11);
            class151.field2210 = class360.method2275(false, (byte) -116, 1, 12);
            class633.field8934 = class360.method2275(false, (byte) -81, 1, 14);
            class372.field5406 = class360.method2275(false, (byte) 40, 1, 15);
            class564.field8184 = class360.method2275(false, (byte) 67, 1, 16);
            class751.field10463 = class360.method2275(false, (byte) -61, 1, 17);
            class499.field7173 = class360.method2275(false, (byte) 66, 1, 18);
            class634.field8938 = class360.method2275(false, (byte) 93, 1, 19);
            class377.field5456 = class360.method2275(false, (byte) -125, 1, 20);
            class717.field10116 = class360.method2275(false, (byte) -45, 1, 21);
            class150.field2195 = class360.method2275(false, (byte) -79, 1, 22);
            class585.field8351 = class360.method2275(true, (byte) 86, 1, 23);
            class133.field1843 = class360.method2275(false, (byte) -113, 1, 24);
            class487.field7026 = class360.method2275(false, (byte) -75, 1, 25);
            class617.field8790 = class360.method2275(true, (byte) -113, 1, 26);
            class460.field6535 = class360.method2275(false, (byte) 125, 1, 27);
            class310.field4183 = class360.method2275(true, (byte) 45, 1, 28);
            class284.field3965 = class360.method2275(false, (byte) -126, 1, 29);
            class364.field5328 = class360.method2275(true, (byte) -93, 1, 30);
            class481.field6877 = class360.method2275(true, (byte) -85, 1, 31);
            class640.field9116 = class360.method2275(true, (byte) 54, 2, 36);
        }
        if (class474.field6731 == class145.field1962) {
            int var18 = 0;
            for (int var19 = 0; var19 < 37; var19++) {
                if (class59.field983[var19] != null) {
                    var18 += class59.field983[var19].method1601((byte) 105) * class198.field2965[var19] / 100;
                }
            }
            if (var18 != 100) {
                if (class109.field1565 < 0) {
                    class109.field1565 = var18;
                }
                return (var18 - class109.field1565) * 100 / (100 - class109.field1565);
            }
            class559.method3356(-7167, class603.field8548);
            class611.method3560(-13338, class603.field8548, class415.method2503(114), class726.field10209);
        }
        if (class474.field6732 == class145.field1962) {
            if (class304.field4155 == -1) {
                class304.field4155 = class505.field7338.method2602((byte) -126, "scape main");
            }
            class99.method751(2048);
            class79.method649(-19704, 2);
        }
        if (class474.field6733 == class145.field1962) {
            class79.method651(class364.field5328, arg0 ^ 0x53C0, class345.field4749);
        }
        if (class474.field6734 == class145.field1962) {
            int var20 = class452.method2766(89);
            if (var20 < 100) {
                return var20;
            }
            class405.method2462(95, class310.field4183.method2611((byte) 21, 1));
            class556.method3340(2, class310.field4183.method2611((byte) -89, 3));
        }
        if (class474.field6735 == class145.field1962) {
            if (class177.field2470 != -1 && !class386.field5586.method2613(0, class177.field2470, -25)) {
                return 99;
            }
            class621.field8832 = new class135(class617.field8790, class223.field3286, class603.field8548);
            class332.field4513 = new class306(class528.field7683, class45.field748, class284.field3966);
            class306.field4169 = new class250(class528.field7683, class45.field748, class284.field3966);
            class113.field1587 = new class577(class528.field7683, class45.field748, class284.field3966, class603.field8548);
            class241.field3567 = new class169(class528.field7683, class45.field748, class751.field10463);
            class166.field2358 = new class59(class528.field7683, class45.field748, class284.field3966);
            class159.field2290 = new class140(class528.field7683, class45.field748, class284.field3966);
            class434.field6215 = new class353(class528.field7683, class45.field748, class284.field3966, class386.field5586);
            class601.field8535 = new class398(class528.field7683, class45.field748, class284.field3966);
            class139.field1897 = new class3(class528.field7683, class45.field748, class284.field3966);
            class375.field5421 = new class438(class528.field7683, class45.field748, true, class564.field8184, class386.field5586);
            class386.field5581 = new class439(class528.field7683, class45.field748, class284.field3966, class603.field8548);
            class258.field3697 = new class734(class528.field7683, class45.field748, class284.field3966, class603.field8548);
            class288.field4000 = new class468(class528.field7683, class45.field748, true, class499.field7173, class386.field5586);
            class425.field6147 = new class744(class528.field7683, class45.field748, true, class332.field4513, class634.field8938, class386.field5586);
            class451.field6457 = new class258(class528.field7683, class45.field748, class284.field3966);
            class610.field8698 = new class493(class528.field7683, class45.field748, class377.field5456, class241.field3573, class102.field1458);
            class455.field6490 = new class551(class528.field7683, class45.field748, class284.field3966);
            class154.field2237 = new class281(class528.field7683, class45.field748, class284.field3966);
            class596.field8476 = new class355(class528.field7683, class45.field748, class717.field10116, class386.field5586);
            class379.field5506 = new class561(class528.field7683, class45.field748, class284.field3966);
            class634.field8944 = new class588(class528.field7683, class45.field748, class284.field3966);
            class75.field1103 = new class669(class528.field7683, class45.field748, class284.field3966);
            class215.field3233 = new class162(class528.field7683, class45.field748, class150.field2195);
            class600.field8526 = new class128(class528.field7683, class45.field748, class284.field3966);
            class592.method3475(class726.field10209, class386.field5586, class225.field3351, class603.field8548, -3017);
            class404.method2455(class284.field3965, (byte) -38);
            class490.field7060 = new class488(class45.field748, class133.field1843, class487.field7026);
            class492.field7082 = new class456(class45.field748, class133.field1843, class487.field7026, new class600());
            class176.method1264(arg0 ^ 0x53C2);
            class375.field5421.method2677(class243.field3580.field8002.method2026(false) == 0, (byte) -45);
            class226.field3372 = new class1();
            class181.method1284(arg0 - 21536);
            class70.method621(class460.field6535, (byte) -25);
            class360.method2274(class386.field5586, class621.field8832, (byte) -127);
            class451 var21 = new class451(class497.field7147.method2591("huffman", (byte) 71, ""));
            class453.method2772(arg0 ^ 0xFFFFAC11, var21);
            try {
                jagmisc.init();
            } catch (Throwable var29) {
            }
            class169.field2396 = class321.method1995(-2048);
            class257.field3685 = new class207(true, class345.field4749);
        }
        if (class474.field6737 == class145.field1962) {
            int var22 = class514.method3125(0, class603.field8548) + class401.method2438(93, true);
            int var23 = class721.method4040(16) + class678.method3854(39);
            if (var22 < var23) {
                return var22 * 100 / var23;
            }
        }
        if (class474.field6738 == class145.field1962) {
            class664.method3785(class585.field8351, class166.field2358, class159.field2290, class375.field5421, class386.field5581, class258.field3697, class226.field3372);
        }
        if (class474.field6739 == class145.field1962) {
            class541.field7855 = new int[class75.field1103.field9538];
            class556.field8082 = new String[class634.field8944.field8369];
            class525.field7633 = new boolean[class75.field1103.field9538];
            for (int var24 = 0; var24 < class75.field1103.field9538; var24++) {
                if (class75.field1103.method3816((byte) -70, var24).field2413 == 0) {
                    class525.field7633[var24] = true;
                    class663.field9470++;
                }
                class541.field7855[var24] = -1;
            }
            class413.method2496((byte) -116);
            class119.field1638 = class225.field3351.method2602((byte) -124, "loginscreen");
            class476.field6769 = class225.field3351.method2602((byte) -127, "lobbyscreen");
            class275.field3876.method2606(true, false, 47);
            class505.field7338.method2606(true, true, arg0 ^ 0x539A);
            class603.field8548.method2606(true, true, 104);
            class726.field10209.method2606(true, true, 121);
            class497.field7147.method2606(true, true, 40);
            class225.field3351.method2606(true, true, 46);
            class284.field3966.field6037 = 2;
            class672.field9576 = true;
            class751.field10463.field6037 = 2;
            class564.field8184.field6037 = 2;
            class499.field7173.field6037 = 2;
            class634.field8938.field6037 = 2;
            class377.field5456.field6037 = 2;
            class717.field10116.field6037 = 2;
        }
        if (class474.field6740 == class145.field1962) {
            if (!class416.method2507(class119.field1638, -2113733296)) {
                return 0;
            }
            boolean var25 = true;
            for (int var26 = 0; var26 < class600.field8524[class119.field1638].length; var26++) {
                class146 var27 = class600.field8524[class119.field1638][var26];
                if (var27.field2112 == 5 && var27.field2117 != -1 && !class603.field8548.method2613(0, var27.field2117, -38)) {
                    var25 = false;
                }
            }
            if (!var25) {
                return 0;
            }
        }
        if (class474.field6741 == class145.field1962) {
            class638.method3678(true, -1);
        }
        if (class474.field6742 == class145.field1962) {
            class703.field9912.method1426(true);
            try {
                class623.field8862.join();
            } catch (InterruptedException var28) {
                return 0;
            }
            class703.field9912 = null;
            class623.field8862 = null;
            class429.field6178 = null;
            class393.field5648 = null;
            class563.field8157 = null;
            class679.field9650 = null;
            class730.method4069(true);
            class212.field3169 = class243.field3580.field7965.method159(false) == 1;
            class243.field3580.method3301(1, 24, class243.field3580.field7965);
            class23.method102((byte) -74);
            if (class212.field3169) {
                class403.method2449(false, 0, arg0 - 21521);
            } else {
                class403.method2449(false, class243.field3580.field8019.method3775(false), -18);
            }
            class301.method1886(-1, false, (byte) 112, -1, class243.field3580.field7993.method2653(false));
            class191.method1349(class211.field3164, true);
            class386.method2375((byte) 49, class211.field3164);
            class330.method2033(true, class211.field3164, class603.field8548);
            class77.method641((byte) 32, class139.field1899);
        }
        return class447.method2720(false);
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(IILsl;IIIIZBII)V")
    private final void method3047(int arg0, int arg1, class479 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, byte arg8, int arg9, int arg10) {
        if (arg0 == 1) {
            arg4 = 1;
        } else if (arg0 == 2) {
            arg4 = 1;
            arg3 = 1;
        } else if (arg0 == 3) {
            arg3 = 1;
        }
        if (arg8 <= 95) {
            this.field7263 = null;
        }
        field7261++;
        if (arg5 < 0 || this.field7262 <= arg5 || arg1 < 0 || this.field7253 <= arg1) {
            while (true) {
                int var14 = arg2.method2886(true);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg2.method2886(true);
                    return;
                }
                if (var14 <= 49) {
                    arg2.method2886(true);
                }
            }
        }
        if (!this.field7266 && !arg7) {
            class160.field2297[arg10][arg5][arg1] = 0;
        }
        while (true) {
            int var12 = arg2.method2886(true);
            if (var12 == 0) {
                if (this.field7266) {
                    this.field7265[0][arg3 + arg5][arg1 + arg4] = 0;
                    return;
                } else if (arg10 == 0) {
                    this.field7265[0][arg3 + arg5][arg1 + arg4] = -class518.method3151(arg6 + 556238, arg9 + 932731, -25019) * 8 << 2;
                    return;
                } else {
                    this.field7265[arg10][arg5 + arg3][arg1 + arg4] = this.field7265[arg10 - 1][arg3 + arg5][arg1 + arg4] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg2.method2886(true);
                if (!this.field7266) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg10 == 0) {
                        this.field7265[0][arg5 + arg3][arg1 + arg4] = -var13 * 8 << 2;
                        return;
                    }
                    this.field7265[arg10][arg3 + arg5][arg1 + arg4] = this.field7265[arg10 - 1][arg5 + arg3][arg1 + arg4] - (var13 * 8 << 2);
                    return;
                }
                this.field7265[0][arg5 + arg3][arg1 + arg4] = var13 * 8 << 2;
                return;
            }
            if (var12 <= 49) {
                if (arg7) {
                    arg2.method2886(true);
                } else {
                    this.field7274[arg10][arg5][arg1] = arg2.method2915(-127);
                    this.field7259[arg10][arg5][arg1] = (byte) ((var12 - 2) / 4);
                    this.field7272[arg10][arg5][arg1] = (byte) class368.method2314(3, arg0 + var12 - 2);
                }
            } else if (var12 <= 81) {
                if (!this.field7266 && !arg7) {
                    class160.field2297[arg10][arg5][arg1] = (byte) (var12 - 49);
                }
            } else if (!arg7) {
                this.field7263[arg10][arg5][arg1] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(IIIII)V")
    public final void method3048(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = arg1; var6 < this.field7271; var6++) {
            this.method3055(arg3, 13019, var6, arg0, arg2, arg4);
        }
        field7264++;
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(IIIIIIILsl;I[Lfe;)V")
    public final void method3049(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class479 arg7, int arg8, class635[] arg9) {
        field7279++;
        int var11 = (arg1 & 0x7) * 8;
        if (arg3 != 256) {
            this.method3054(null, null, -63, -48, null, null, null);
        }
        int var12 = (arg5 & 0x7) * 8;
        if (!this.field7266) {
            class635 var13 = arg9[arg6];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = class368.method2312((byte) 69, var14 & 0x7, var15 & 0x7, arg2) + arg4;
                    int var17 = arg0 + class65.method584(var15 & 0x7, var14 & 0x7, arg2, 19171);
                    if (var16 > 0 && this.field7262 - 1 > var16 && var17 > 0 && var17 < (this.field7253 - 1)) {
                        var13.method3642(var17, arg3 - 2097409, var16);
                    }
                }
            }
        }
        int var18 = arg1 & 0x1FFFFFF8 << 3;
        int var19 = (arg5 & 0xFFFFFFF8) << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg2 == 1) {
            var21 = 1;
        } else if (arg2 == 2) {
            var21 = 1;
            var20 = 1;
        } else if (arg2 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field7271; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg8 == var22 && var23 >= var11 && var23 <= (var11 + 8) && var12 <= var24 && var24 <= (var12 + 8)) {
                        int var25;
                        int var26;
                        if ((var11 + 8) == var23 || (var12 + 8) == var24) {
                            if (arg2 == 0) {
                                var26 = arg0 + var24 - var12;
                                var25 = arg4 + var23 - var11;
                            } else if (arg2 == 1) {
                                var26 = var11 + arg0 + 8 - var23;
                                var25 = arg4 + var24 - var12;
                            } else if (arg2 == 2) {
                                var26 = var12 + arg0 + 8 - var24;
                                var25 = arg4 + var11 + 8 - var23;
                            } else {
                                var25 = arg4 + var12 + 8 - var24;
                                var26 = var23 - (var11 - arg0);
                            }
                            this.method3047(0, var26, arg7, 0, 0, var25, var19 + var24, true, (byte) 120, var18 + var23, arg6);
                        } else {
                            var25 = arg4 + class368.method2312((byte) 93, var23 & 0x7, var24 & 0x7, arg2);
                            var26 = arg0 + class65.method584(var24 & 0x7, var23 & 0x7, arg2, 19171);
                            this.method3047(arg2, var26, arg7, var20, var21, var25, var19 + var24, false, (byte) 126, var18 + var23, arg6);
                        }
                        if (var23 == 63 || var24 == 63) {
                            byte var27 = 1;
                            if (var23 == 63 && var24 == 63) {
                                var27 = 3;
                            }
                            for (int var28 = 0; var28 < var27; var28++) {
                                int var29 = var23;
                                int var30 = var24;
                                if (var28 == 0) {
                                    var29 = var23 == 63 ? 64 : var23;
                                    var30 = var24 == 63 ? 64 : var24;
                                } else if (var28 == 1) {
                                    var29 = 64;
                                } else if (var28 == 2) {
                                    var30 = 64;
                                }
                                int var31;
                                int var32;
                                if (arg2 == 0) {
                                    var32 = arg0 + var30 - var12;
                                    var31 = -var11 - (-var29 - arg4);
                                } else if (arg2 == 1) {
                                    var32 = arg0 + var11 + 8 - var29;
                                    var31 = var30 + arg4 - var12;
                                } else if (arg2 == 2) {
                                    var31 = var11 + arg4 + 8 - var29;
                                    var32 = var12 + arg0 + 8 - var30;
                                } else {
                                    var31 = var12 + arg4 + 8 - var30;
                                    var32 = arg0 + var29 - var11;
                                }
                                if (var31 >= 0 && this.field7262 > var31 && var32 >= 0 && var32 < this.field7253) {
                                    this.field7265[arg6][var31][var32] = this.field7265[arg6][var20 + var25][var26 + var21];
                                }
                            }
                        }
                    } else {
                        this.method3047(0, -1, arg7, 0, 0, -1, 0, false, (byte) 96, 0, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(Z)[Lcga;")
    public static final class141[] method3050(boolean arg0) {
        if (!arg0) {
            field7281 = null;
        }
        field7268++;
        return new class141[] { class22.field208, class118.field1624, class209.field3154 };
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "([Z[[BLhb;II[[BBIILha;Liu;II[[B)V")
    private final void method3051(boolean[] arg0, byte[][] arg1, class584 arg2, int arg3, int arg4, byte[][] arg5, byte arg6, int arg7, int arg8, class543 arg9, class507 arg10, int arg11, int arg12, byte[][] arg13) {
        field7275++;
        if (arg6 >= -8) {
            return;
        }
        boolean[] var15 = arg2 != null && arg2.field8322 ? class622.field8859[arg4] : class137.field1885[arg4];
        if (arg11 > 0) {
            if (arg3 > 0) {
                int var16 = arg13[arg3 - 1][arg11 - 1] & 0xFF;
                if (var16 > 0) {
                    class584 var17 = this.field7273.method555((byte) -90, var16 - 1);
                    if (var17.field8337 != -1 && var17.field8322) {
                        byte var18 = arg5[arg3 - 1][arg11 - 1];
                        int var19 = arg1[arg3 - 1][arg11 - 1] * 2 + 4 & 0x7;
                        int var20 = class576.method3413(arg9, var17, 123);
                        if (class495.field7121[var18][var19]) {
                            class36.field320[0] = var17.field8337;
                            class91.field1293[0] = var20;
                            class109.field1566[0] = var17.field8323;
                            class705.field9934[0] = var17.field8326;
                            class308.field4172[0] = var17.field8340;
                            class618.field8800[0] = 256;
                        }
                    }
                }
            }
            if (arg3 < (arg7 - 1)) {
                int var21 = arg13[arg3 + 1][arg11 - 1] & 0xFF;
                if (var21 > 0) {
                    class584 var22 = this.field7273.method555((byte) -90, var21 - 1);
                    if (var22.field8337 != -1 && var22.field8322) {
                        byte var23 = arg5[arg3 + 1][arg11 - 1];
                        int var24 = (arg1[arg3 + 1][arg11 - 1] * 2) + 6 & 0x7;
                        int var25 = class576.method3413(arg9, var22, 126);
                        if (class495.field7121[var23][var24]) {
                            class36.field320[2] = var22.field8337;
                            class91.field1293[2] = var25;
                            class109.field1566[2] = var22.field8323;
                            class705.field9934[2] = var22.field8326;
                            class308.field4172[2] = var22.field8340;
                            class618.field8800[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg11 < (arg12 - 1)) {
            if (arg3 > 0) {
                int var26 = arg13[arg3 - 1][arg11 + 1] & 0xFF;
                if (var26 > 0) {
                    class584 var27 = this.field7273.method555((byte) -90, var26 - 1);
                    if (var27.field8337 != -1 && var27.field8322) {
                        byte var28 = arg5[arg3 - 1][arg11 + 1];
                        int var29 = arg1[arg3 - 1][arg11 + 1] * 2 + 2 & 0x7;
                        int var30 = class576.method3413(arg9, var27, 118);
                        if (class495.field7121[var28][var29]) {
                            class36.field320[6] = var27.field8337;
                            class91.field1293[6] = var30;
                            class109.field1566[6] = var27.field8323;
                            class705.field9934[6] = var27.field8326;
                            class308.field4172[6] = var27.field8340;
                            class618.field8800[6] = 64;
                        }
                    }
                }
            }
            if ((arg7 - 1) > arg3) {
                int var31 = arg13[arg3 + 1][arg11 + 1] & 0xFF;
                if (var31 > 0) {
                    class584 var32 = this.field7273.method555((byte) -90, var31 - 1);
                    if (var32.field8337 != -1 && var32.field8322) {
                        byte var33 = arg5[arg3 + 1][arg11 + 1];
                        int var34 = arg1[arg3 + 1][arg11 + 1] * 2 & 0x7;
                        int var35 = class576.method3413(arg9, var32, -43);
                        if (class495.field7121[var33][var34]) {
                            class36.field320[4] = var32.field8337;
                            class91.field1293[4] = var35;
                            class109.field1566[4] = var32.field8323;
                            class705.field9934[4] = var32.field8326;
                            class308.field4172[4] = var32.field8340;
                            class618.field8800[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg11 > 0) {
            int var36 = arg13[arg3][arg11 - 1] & 0xFF;
            if (var36 > 0) {
                class584 var37 = this.field7273.method555((byte) -90, var36 - 1);
                if (var37.field8337 != -1) {
                    byte var38 = arg5[arg3][arg11 - 1];
                    byte var39 = arg1[arg3][arg11 - 1];
                    if (var37.field8322) {
                        int var40 = 2;
                        int var41 = (var39 * 2) + 4;
                        int var42 = class576.method3413(arg9, var37, -1);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var40 &= 0x7;
                            var41 &= 0x7;
                            if (class495.field7121[var38][var41] && var37.field8340 >= class308.field4172[var40]) {
                                class36.field320[var40] = var37.field8337;
                                class91.field1293[var40] = var42;
                                class109.field1566[var40] = var37.field8323;
                                class705.field9934[var40] = var37.field8326;
                                if (class308.field4172[var40] == var37.field8340) {
                                    class618.field8800[var40] = class430.method2658(class618.field8800[var40], 32);
                                } else {
                                    class618.field8800[var40] = 32;
                                }
                                class308.field4172[var40] = var37.field8340;
                            }
                            var40--;
                            var41++;
                        }
                        if (!var15[arg8 & 0x3]) {
                            arg0[0] = class622.field8859[var38][class368.method2314(var39 + 2, 3)];
                        }
                    } else if (!var15[arg8 & 0x3]) {
                        arg0[0] = class137.field1885[var38][class368.method2314(3, var39 + 2)];
                    }
                }
            }
        }
        if (arg12 - 1 > arg11) {
            int var44 = arg13[arg3][arg11 + 1] & 0xFF;
            if (var44 > 0) {
                class584 var45 = this.field7273.method555((byte) -90, var44 - 1);
                if (var45.field8337 != -1) {
                    byte var46 = arg5[arg3][arg11 + 1];
                    byte var47 = arg1[arg3][arg11 + 1];
                    if (var45.field8322) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class576.method3413(arg9, var45, 127);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var48 &= 0x7;
                            var49 &= 0x7;
                            if (class495.field7121[var46][var49] && var45.field8340 >= class308.field4172[var48]) {
                                class36.field320[var48] = var45.field8337;
                                class91.field1293[var48] = var50;
                                class109.field1566[var48] = var45.field8323;
                                class705.field9934[var48] = var45.field8326;
                                if (class308.field4172[var48] == var45.field8340) {
                                    class618.field8800[var48] = class430.method2658(class618.field8800[var48], 16);
                                } else {
                                    class618.field8800[var48] = 16;
                                }
                                class308.field4172[var48] = var45.field8340;
                            }
                            var48++;
                            var49--;
                        }
                        if (!var15[arg8 + 2 & 0x3]) {
                            arg0[2] = class622.field8859[var46][class368.method2314(3, var47)];
                        }
                    } else if (!var15[arg8 + 2 & 0x3]) {
                        arg0[2] = class137.field1885[var46][class368.method2314(-(-var47), 3)];
                    }
                }
            }
        }
        if (arg3 > 0) {
            int var52 = arg13[arg3 - 1][arg11] & 0xFF;
            if (var52 > 0) {
                class584 var53 = this.field7273.method555((byte) -90, var52 - 1);
                if (var53.field8337 != -1) {
                    byte var54 = arg5[arg3 - 1][arg11];
                    byte var55 = arg1[arg3 - 1][arg11];
                    if (var53.field8322) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class576.method3413(arg9, var53, 123);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var57 &= 0x7;
                            var56 &= 0x7;
                            if (class495.field7121[var54][var57] && class308.field4172[var56] <= var53.field8340) {
                                class36.field320[var56] = var53.field8337;
                                class91.field1293[var56] = var58;
                                class109.field1566[var56] = var53.field8323;
                                class705.field9934[var56] = var53.field8326;
                                if (class308.field4172[var56] == var53.field8340) {
                                    class618.field8800[var56] = class430.method2658(class618.field8800[var56], 8);
                                } else {
                                    class618.field8800[var56] = 8;
                                }
                                class308.field4172[var56] = var53.field8340;
                            }
                            var57--;
                            var56++;
                        }
                        if (!var15[arg8 + 3 & 0x3]) {
                            arg0[3] = class622.field8859[var54][class368.method2314(var55 + 1, 3)];
                        }
                    } else if (!var15[arg8 + 3 & 0x3]) {
                        arg0[3] = class137.field1885[var54][class368.method2314(var55 + 1, 3)];
                    }
                }
            }
        }
        if (arg7 - 1 > arg3) {
            int var60 = arg13[arg3 + 1][arg11] & 0xFF;
            if (var60 > 0) {
                class584 var61 = this.field7273.method555((byte) -90, var60 - 1);
                if (var61.field8337 != -1) {
                    byte var62 = arg5[arg3 + 1][arg11];
                    byte var63 = arg1[arg3 + 1][arg11];
                    if (var61.field8322) {
                        int var64 = 4;
                        int var65 = (var63 * 2) + 6;
                        int var66 = class576.method3413(arg9, var61, 125);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var64 &= 0x7;
                            var65 &= 0x7;
                            if (class495.field7121[var62][var65] && class308.field4172[var64] <= var61.field8340) {
                                class36.field320[var64] = var61.field8337;
                                class91.field1293[var64] = var66;
                                class109.field1566[var64] = var61.field8323;
                                class705.field9934[var64] = var61.field8326;
                                if (class308.field4172[var64] == var61.field8340) {
                                    class618.field8800[var64] = class430.method2658(class618.field8800[var64], 4);
                                } else {
                                    class618.field8800[var64] = 4;
                                }
                                class308.field4172[var64] = var61.field8340;
                            }
                            var64--;
                            var65++;
                        }
                        if (!var15[arg8 + 1 & 0x3]) {
                            arg0[1] = class622.field8859[var62][class368.method2314(var63 + 3, 3)];
                        }
                    } else if (!var15[arg8 + 1 & 0x3]) {
                        arg0[1] = class137.field1885[var62][class368.method2314(var63 + 3, 3)];
                    }
                }
            }
        }
        if (arg2 == null) {
            return;
        }
        int var68 = class576.method3413(arg9, arg2, 127);
        if (!arg2.field8322) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg8 * 2) & 0x7;
            if (class495.field7121[arg4][var69] && arg2.field8340 >= class308.field4172[var70]) {
                class36.field320[var70] = arg2.field8337;
                class91.field1293[var70] = var68;
                class109.field1566[var70] = arg2.field8323;
                class705.field9934[var70] = arg2.field8326;
                if (class308.field4172[var70] == arg2.field8340) {
                    class618.field8800[var70] = class430.method2658(class618.field8800[var70], 2);
                } else {
                    class618.field8800[var70] = 2;
                }
                class308.field4172[var70] = arg2.field8340;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(B)V")
    public static void method3052(byte arg0) {
        if (arg0 > 97) {
            field7280 = null;
            field7281 = null;
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(ILha;[Lfe;[[[I)V")
    public final void method3053(int arg0, class543 arg1, class635[] arg2, int[][][] arg3) {
        field7282++;
        if (!this.field7266) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field7262; var6++) {
                    for (int var7 = 0; var7 < this.field7253; var7++) {
                        if ((class160.field2297[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class160.field2297[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg2[var8].method3651(var6, (byte) 35, var7);
                            }
                        }
                    }
                }
            }
        }
        for (int var9 = arg0; var9 < this.field7271; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field7266) {
                if (class609.field8694) {
                    var10 |= 0x2;
                }
                if (class584.field8329) {
                    var11 |= 0x8;
                }
                if (class80.field1150 != 0) {
                    var10 |= 0x1;
                    if (class487.field7024 | var9 == 0) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class609.field8694) {
                var11 |= 0x7;
            }
            if (!class718.field10124) {
                var11 |= 0x20;
            }
            int[][] var12 = arg3 == null || var9 >= arg3.length ? this.field7265[var9] : arg3[var9];
            class132.method928(var9, arg1.method311(this.field7262, this.field7253, this.field7265[var9], var12, 512, var10, var11));
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(Lha;[[IIILs;Ls;Ls;)V")
    private final void method3054(class543 arg0, int[][] arg1, int arg2, int arg3, class339 arg4, class339 arg5, class339 arg6) {
        field7260++;
        if (arg3 < 108) {
            this.method3054(null, null, -19, -121, null, null, null);
        }
        byte[][] var8 = this.field7259[arg2];
        byte[][] var9 = this.field7272[arg2];
        byte[][] var10 = this.field7263[arg2];
        byte[][] var11 = this.field7274[arg2];
        for (int var12 = 0; var12 < this.field7262; var12++) {
            int var13 = this.field7262 - 1 > var12 ? var12 + 1 : var12;
            for (int var14 = 0; var14 < this.field7253; var14++) {
                int var15 = var14 >= this.field7253 - 1 ? var14 : var14 + 1;
                if (class721.field10154 == -1 || class583.method3433((byte) 16, class721.field10154, arg2, var14, var12)) {
                    boolean var16 = false;
                    boolean var17 = false;
                    boolean[] var18 = new boolean[4];
                    int var19 = var8[var12][var14];
                    int var20 = var9[var12][var14];
                    int var21 = var11[var12][var14] & 0xFF;
                    int var22 = var10[var12][var14] & 0xFF;
                    int var23 = var10[var12][var15] & 0xFF;
                    int var24 = var10[var13][var15] & 0xFF;
                    int var25 = var10[var13][var14] & 0xFF;
                    if (var21 != 0 || var22 != 0) {
                        class584 var26 = var21 == 0 ? null : this.field7273.method555((byte) -90, var21 - 1);
                        class507 var27 = var22 == 0 ? null : this.field7276.method988(111, var22 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class584 var28 = var26;
                        if (var26 != null) {
                            if (var26.field8337 == -1 && var26.field8324 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field8322;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field7262 > var12 && this.field7253 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var34 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var35 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var33++;
                                var34++;
                            } else {
                                var34--;
                                var33--;
                            }
                            int var36 = var32 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var13][var14] == var22) {
                                var35++;
                                var34++;
                            } else {
                                var34--;
                                var35--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var35++;
                            } else {
                                var35--;
                                var36--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var33++;
                                var36++;
                            } else {
                                var33--;
                                var36--;
                            }
                            int var37 = var33 - var35;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var34 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg5.method2087(79, var12, var14) - arg5.method2087(85, var13, var15);
                                var38 = arg5.method2087(80, var13, var14) - arg5.method2087(85, var12, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var38 <= var37 ? 0 : 1;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class308.field4172[var39] = -1;
                            class618.field8800[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field8322 ? class622.field8859[var19] : class137.field1885[var19];
                        this.method3051(var18, var9, var26, var12, var19, var8, (byte) -114, this.field7262, var20, arg0, var27, var14, this.field7253, var11);
                        boolean var41 = var26 != null && var26.field8337 != var26.field8324;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class308.field4172[var42] >= 0 && class91.field1293[var42] != class36.field320[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class94.method727(var18[1], class368.method2314(class618.field8800[2], class618.field8800[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class94.method727(var18[3], class368.method2314(class618.field8800[0], class618.field8800[6]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class94.method727(var18[0], class368.method2314(class618.field8800[0], class618.field8800[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class94.method727(var18[2], class368.method2314(class618.field8800[6], class618.field8800[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var18[0] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 0;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var18[0] = var18[1] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 3;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var20 = 2;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[1] = var18[2] = false;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[2] = var18[3] = false;
                                var20 = 1;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int[] var45;
                        int[] var46;
                        int[] var47;
                        int var48;
                        int var49;
                        if (var43) {
                            var45 = class181.field2503[var19];
                            var46 = class437.field6235[var19];
                            var47 = class644.field9262[var19];
                            var48 = var27 == null ? 0 : class477.field6777[var19];
                            var49 = var26 == null ? 0 : class185.field2557[var19];
                        } else if (var17) {
                            var47 = class143.field1942[var19];
                            var48 = var27 == null ? 0 : class750.field10459[var19];
                            var44 = class742.field10353[var19];
                            var46 = class32.field303[var19];
                            var49 = var26 == null ? 0 : class589.field8389[var19];
                            var45 = class194.field2849[var19];
                        } else {
                            var47 = class608.field8685[var19];
                            var48 = var27 == null ? 0 : class595.field8452[var19];
                            var49 = var26 == null ? 0 : class304.field4148[var19];
                            var45 = class661.field9446[var19];
                            var46 = class189.field2642[var19];
                            var44 = class637.field8979[var19];
                        }
                        int var50 = var48 + var49;
                        if (var50 <= 0) {
                            class25.method107(arg2, var12, var14);
                        } else {
                            if (var18[0]) {
                                var50++;
                            }
                            if (var18[2]) {
                                var50++;
                            }
                            if (var18[1]) {
                                var50++;
                            }
                            if (var18[3]) {
                                var50++;
                            }
                            int var51 = 0;
                            int var52 = 0;
                            int var53 = var50 * 3;
                            int[] var54 = var41 ? new int[var53] : null;
                            int[] var55 = new int[var53];
                            int[] var56 = new int[var53];
                            int[] var57 = new int[var53];
                            int[] var58 = new int[var53];
                            int[] var59 = new int[var53];
                            int[] var60 = arg4 == null ? null : new int[var53];
                            int[] var61 = arg4 == null && arg6 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var63 = var26.field8323;
                                var64 = var26.field8326;
                                var62 = var26.field8337;
                                int var65 = class576.method3413(arg0, var26, -20);
                                for (int var66 = 0; var66 < var49; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class303.field4138[0] = var47[var51];
                                        class303.field4138[1] = 1;
                                        class303.field4138[2] = var45[var51];
                                        class303.field4138[3] = 1;
                                        class303.field4138[4] = var46[var51];
                                        var68 = 6;
                                        class303.field4138[5] = var45[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class303.field4138[0] = var47[var51];
                                        class303.field4138[1] = 5;
                                        class303.field4138[2] = var45[var51];
                                        class303.field4138[3] = 5;
                                        class303.field4138[4] = var46[var51];
                                        class303.field4138[5] = var45[var51];
                                        var68 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class303.field4138[0] = var47[var51];
                                        class303.field4138[1] = 3;
                                        class303.field4138[2] = var45[var51];
                                        class303.field4138[3] = 3;
                                        class303.field4138[4] = var46[var51];
                                        class303.field4138[5] = var45[var51];
                                        var68 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class303.field4138[0] = var47[var51];
                                        class303.field4138[1] = 7;
                                        class303.field4138[2] = var45[var51];
                                        class303.field4138[3] = 7;
                                        class303.field4138[4] = var46[var51];
                                        class303.field4138[5] = var45[var51];
                                        var68 = 6;
                                    } else {
                                        class303.field4138[0] = var47[var51];
                                        class303.field4138[1] = var46[var51];
                                        var68 = 3;
                                        class303.field4138[2] = var45[var51];
                                    }
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class303.field4138[var69];
                                        int var71 = var70 - (var20 * 2) & 0x7;
                                        int var72 = this.field7267[var70];
                                        int var73 = this.field7269[var70];
                                        int var74;
                                        int var75;
                                        if (var20 == 1) {
                                            var74 = 512 - var72;
                                            var75 = var73;
                                        } else if (var20 == 2) {
                                            var74 = 512 - var73;
                                            var75 = 512 - var72;
                                        } else if (var20 == 3) {
                                            var74 = var72;
                                            var75 = 512 - var73;
                                        } else {
                                            var74 = var73;
                                            var75 = var72;
                                        }
                                        var55[var52] = var75;
                                        var56[var52] = var74;
                                        if (var60 != null && class495.field7121[var19][var70]) {
                                            int var76 = (var12 << 9) + var75;
                                            int var77 = (var14 << 9) + var74;
                                            var60[var52] = arg4.method2089(26448, var76, var77) - arg5.method2089(26448, var76, var77);
                                        }
                                        if (var61 != null) {
                                            if (arg4 != null && !class495.field7121[var19][var70]) {
                                                int var78 = (var12 << 9) + var75;
                                                int var79 = (var14 << 9) + var74;
                                                var61[var52] = arg5.method2089(26448, var78, var79) - arg4.method2089(26448, var78, var79);
                                            } else if (arg6 != null && !class253.field3652[var19][var70]) {
                                                int var80 = (var12 << 9) + var75;
                                                int var81 = (var14 << 9) + var74;
                                                var61[var52] = arg6.method2089(26448, var80, var81) - arg5.method2089(26448, var80, var81);
                                            }
                                        }
                                        if (var70 < 8 && class308.field4172[var71] > var26.field8340) {
                                            if (var54 != null) {
                                                var54[var52] = class91.field1293[var71];
                                            }
                                            var59[var52] = class705.field9934[var71];
                                            var58[var52] = class109.field1566[var71];
                                            var57[var52] = class36.field320[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = var26.field8323;
                                            var59[var52] = var26.field8326;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (!this.field7266 && arg2 == 0) {
                                    class607.method3536(var12, var14, var26.field8325, var26.field8336 * 8, var26.field8331);
                                }
                                if (var19 != 12 && var26.field8337 != -1 && var26.field8339) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class185.field2557[var19];
                            } else if (var17) {
                                var51 += class589.field8389[var19];
                            } else {
                                var51 += class304.field4148[var19];
                            }
                            if (var27 != null) {
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                class507 var82 = this.field7276.method988(61, var22 - 1);
                                class507 var83 = this.field7276.method988(61, var23 - 1);
                                class507 var84 = this.field7276.method988(109, var24 - 1);
                                class507 var85 = this.field7276.method988(90, var25 - 1);
                                for (int var86 = 0; var86 < var48; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class303.field4138[0] = var47[var51];
                                        class303.field4138[1] = 1;
                                        class303.field4138[2] = var45[var51];
                                        class303.field4138[3] = 1;
                                        class303.field4138[4] = var46[var51];
                                        class303.field4138[5] = var45[var51];
                                        var88 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class303.field4138[0] = var47[var51];
                                        class303.field4138[1] = 5;
                                        class303.field4138[2] = var45[var51];
                                        class303.field4138[3] = 5;
                                        class303.field4138[4] = var46[var51];
                                        class303.field4138[5] = var45[var51];
                                        var88 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class303.field4138[0] = var47[var51];
                                        class303.field4138[1] = 3;
                                        class303.field4138[2] = var45[var51];
                                        class303.field4138[3] = 3;
                                        class303.field4138[4] = var46[var51];
                                        class303.field4138[5] = var45[var51];
                                        var88 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class303.field4138[0] = var47[var51];
                                        class303.field4138[1] = 7;
                                        class303.field4138[2] = var45[var51];
                                        class303.field4138[3] = 7;
                                        class303.field4138[4] = var46[var51];
                                        var88 = 6;
                                        class303.field4138[5] = var45[var51];
                                    } else {
                                        class303.field4138[0] = var47[var51];
                                        class303.field4138[1] = var46[var51];
                                        var88 = 3;
                                        class303.field4138[2] = var45[var51];
                                    }
                                    var51++;
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = class303.field4138[var89];
                                        int var91 = var90 - var20 * 2 & 0x7;
                                        int var92 = this.field7267[var90];
                                        int var93 = this.field7269[var90];
                                        int var94;
                                        int var95;
                                        if (var20 == 1) {
                                            var94 = var93;
                                            var95 = 512 - var92;
                                        } else if (var20 == 2) {
                                            var94 = 512 - var92;
                                            var95 = 512 - var93;
                                        } else if (var20 == 3) {
                                            var94 = 512 - var93;
                                            var95 = var92;
                                        } else {
                                            var94 = var92;
                                            var95 = var93;
                                        }
                                        var55[var52] = var94;
                                        var56[var52] = var95;
                                        if (var60 != null && class495.field7121[var19][var90]) {
                                            int var96 = (var12 << 9) + var94;
                                            int var97 = (var14 << 9) + var95;
                                            var60[var52] = arg4.method2089(26448, var96, var97) - arg5.method2089(26448, var96, var97);
                                        }
                                        if (var61 != null) {
                                            if (arg4 != null && !class495.field7121[var19][var90]) {
                                                int var98 = (var12 << 9) + var94;
                                                int var99 = (var14 << 9) + var95;
                                                var61[var52] = arg5.method2089(26448, var98, var99) - arg4.method2089(26448, var98, var99);
                                            } else if (arg6 != null && !class253.field3652[var19][var90]) {
                                                int var100 = (var12 << 9) + var94;
                                                int var101 = (var14 << 9) + var95;
                                                var61[var52] = arg6.method2089(26448, var100, var101) - arg5.method2089(26448, var100, var101);
                                            }
                                        }
                                        if (var90 < 8 && class308.field4172[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class91.field1293[var91];
                                            }
                                            var59[var52] = class705.field9934[var91];
                                            var58[var52] = class109.field1566[var91];
                                            var57[var52] = class36.field320[var91];
                                        } else {
                                            if (var17 && class495.field7121[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var94 == 0 && var95 == 0) {
                                                var57[var52] = arg1[var12][var14];
                                                var58[var52] = var82.field7369;
                                                var59[var52] = var82.field7362;
                                            } else if (var94 == 0 && var95 == 512) {
                                                var57[var52] = arg1[var12][var15];
                                                var58[var52] = var83.field7369;
                                                var59[var52] = var83.field7362;
                                            } else if (var94 == 512 && var95 == 512) {
                                                var57[var52] = arg1[var13][var15];
                                                var58[var52] = var84.field7369;
                                                var59[var52] = var84.field7362;
                                            } else if (var94 == 512 && var95 == 0) {
                                                var57[var52] = arg1[var13][var14];
                                                var58[var52] = var85.field7369;
                                                var59[var52] = var85.field7362;
                                            } else {
                                                if (var94 >= 256) {
                                                    if (var95 >= 256) {
                                                        var58[var52] = var84.field7369;
                                                        var59[var52] = var84.field7362;
                                                    } else {
                                                        var58[var52] = var85.field7369;
                                                        var59[var52] = var85.field7362;
                                                    }
                                                } else if (var95 >= 256) {
                                                    var58[var52] = var83.field7369;
                                                    var59[var52] = var83.field7362;
                                                } else {
                                                    var58[var52] = var82.field7369;
                                                    var59[var52] = var82.field7362;
                                                }
                                                int var102 = class732.method4078(arg1[var13][var14], var94 << 7 >> 9, -1748, arg1[var12][var14]);
                                                int var103 = class732.method4078(arg1[var13][var15], var94 << 7 >> 9, -1748, arg1[var12][var15]);
                                                var57[var52] = class732.method4078(var103, var95 << 7 >> 9, -1748, var102);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field7367) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg5.method2087(93, var12, var14);
                            int var105 = arg5.method2087(127, var13, var14);
                            int var106 = arg5.method2087(121, var13, var15);
                            int var107 = arg5.method2087(82, var12, var15);
                            boolean var108 = class547.method3292((byte) -106, var14, var12);
                            if (var108 && arg2 > 1 || !var108 && arg2 > 0) {
                                boolean var109 = true;
                                if (var27 != null && !var27.field7361) {
                                    var109 = false;
                                } else if (var22 == 0 && var19 != 0) {
                                    var109 = false;
                                } else if (var21 > 0 && var28 != null && !var28.field8335) {
                                    var109 = false;
                                }
                                if (var109 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field7258[arg2][var12][var14] = (byte) class430.method2658(this.field7258[arg2][var12][var14], 4);
                                }
                            }
                            int var110 = 0;
                            int var111 = 0;
                            int var112 = 0;
                            if (this.field7266) {
                                var110 = class135.method965(var12, var14);
                                var111 = class94.method732(var12, var14);
                                var112 = class451.method2759(var12, var14);
                            }
                            arg5.method39(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var110, var111, var112, var16);
                            class25.method107(arg2, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(IIIIII)V")
    public final void method3055(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var7 = arg0; var7 < (arg0 + arg5); var7++) {
            for (int var10 = arg4; var10 < (arg4 + arg3); var10++) {
                if (var10 >= 0 && this.field7262 > var10 && var7 >= 0 && var7 < this.field7253) {
                    this.field7265[arg2][var10][var7] = arg2 > 0 ? this.field7265[arg2 - 1][var10][var7] - 960 : 0;
                }
            }
        }
        field7255++;
        if (arg4 > 0 && this.field7262 > arg4) {
            for (int var8 = arg0 + 1; var8 < (arg0 + arg5); var8++) {
                if (var8 >= 0 && var8 < this.field7253) {
                    this.field7265[arg2][arg4][var8] = this.field7265[arg2][arg4 - 1][var8];
                }
            }
        }
        if (arg0 > 0 && this.field7253 > arg0) {
            for (int var9 = arg4 + 1; var9 < arg3 + arg4; var9++) {
                if (var9 >= 0 && var9 < this.field7262) {
                    this.field7265[arg2][var9][arg0] = this.field7265[arg2][var9][arg0 - 1];
                }
            }
        }
        if (arg1 != 13019) {
            method3052((byte) 17);
        }
        if (arg4 < 0 || arg0 < 0 || this.field7262 <= arg4 || arg0 >= this.field7253) {
            return;
        }
        if (arg2 == 0) {
            if (arg4 <= 0 || this.field7265[arg2][arg4 - 1][arg0] == 0) {
                if (arg0 > 0 && this.field7265[arg2][arg4][arg0 - 1] != 0) {
                    this.field7265[arg2][arg4][arg0] = this.field7265[arg2][arg4][arg0 - 1];
                    return;
                }
                if (arg4 > 0 && arg0 > 0 && this.field7265[arg2][arg4 - 1][arg0 - 1] != 0) {
                    this.field7265[arg2][arg4][arg0] = this.field7265[arg2][arg4 - 1][arg0 - 1];
                    return;
                }
                return;
            }
            this.field7265[arg2][arg4][arg0] = this.field7265[arg2][arg4 - 1][arg0];
        } else if (arg4 <= 0 || this.field7265[arg2][arg4 - 1][arg0] == this.field7265[arg2 - 1][arg4 - 1][arg0]) {
            if (arg0 > 0 && this.field7265[arg2 - 1][arg4][arg0 - 1] != this.field7265[arg2][arg4][arg0 - 1]) {
                this.field7265[arg2][arg4][arg0] = this.field7265[arg2][arg4][arg0 - 1];
                return;
            }
            if (arg4 > 0 && arg0 > 0 && this.field7265[arg2 - 1][arg4 - 1][arg0 - 1] != this.field7265[arg2][arg4 - 1][arg0 - 1]) {
                this.field7265[arg2][arg4][arg0] = this.field7265[arg2][arg4 - 1][arg0 - 1];
                return;
            }
        } else {
            this.field7265[arg2][arg4][arg0] = this.field7265[arg2][arg4 - 1][arg0];
            return;
        }
    }

    @OriginalMember(owner = "client!ria", name = "<init>", descriptor = "(IIIZLsv;Lnt;)V")
    public class501(int arg0, int arg1, int arg2, boolean arg3, class59 arg4, class140 arg5) {
        this.field7266 = arg3;
        this.field7271 = arg0;
        this.field7262 = arg1;
        this.field7273 = arg4;
        this.field7276 = arg5;
        this.field7253 = arg2;
        this.field7274 = new byte[this.field7271][this.field7262][this.field7253];
        this.field7259 = new byte[this.field7271][this.field7262][this.field7253];
        this.field7265 = new int[this.field7271][this.field7262 + 1][this.field7253 + 1];
        this.field7272 = new byte[this.field7271][this.field7262][this.field7253];
        this.field7263 = new byte[this.field7271][this.field7262][this.field7253];
        this.field7258 = new byte[this.field7271][this.field7262 + 1][this.field7253 + 1];
    }
}
