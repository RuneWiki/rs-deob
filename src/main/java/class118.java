import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class118 extends class126 {

    @OriginalMember(owner = "client!na", name = "zb", descriptor = "I")
    private int field2284 = 0;

    @OriginalMember(owner = "client!na", name = "Jb", descriptor = "B")
    private byte field2294 = 0;

    @OriginalMember(owner = "client!na", name = "Ab", descriptor = "[I")
    private int[] field2285;

    @OriginalMember(owner = "client!na", name = "yb", descriptor = "[I")
    private int[] field2283;

    @OriginalMember(owner = "client!na", name = "Cb", descriptor = "[I")
    private int[] field2287;

    @OriginalMember(owner = "client!na", name = "Eb", descriptor = "[B")
    private byte[] field2289;

    @OriginalMember(owner = "client!na", name = "Gb", descriptor = "[B")
    private byte[] field2291;

    @OriginalMember(owner = "client!na", name = "Hb", descriptor = "[I")
    private int[] field2292;

    @OriginalMember(owner = "client!na", name = "Bb", descriptor = "[I")
    private int[] field2286;

    @OriginalMember(owner = "client!na", name = "Kb", descriptor = "[I")
    private int[] field2295;

    @OriginalMember(owner = "client!na", name = "Lb", descriptor = "[S")
    private short[] field2296;

    @OriginalMember(owner = "client!na", name = "Fb", descriptor = "[I")
    private int[] field2290;

    @OriginalMember(owner = "client!na", name = "Db", descriptor = "[I")
    private int[] field2288;

    @OriginalMember(owner = "client!na", name = "Ib", descriptor = "[I")
    private int[] field2293;

    @OriginalMember(owner = "client!na", name = "xb", descriptor = "[B")
    private byte[] field2282;

    @OriginalMember(owner = "client!na", name = "Mb", descriptor = "Lna;")
    private static class118 field2297 = new class118();

    @OriginalMember(owner = "client!na", name = "Ob", descriptor = "[B")
    private static byte[] field2299 = new byte[1];

    @OriginalMember(owner = "client!na", name = "Nb", descriptor = "Lna;")
    private static class118 field2298 = new class118();

    @OriginalMember(owner = "client!na", name = "Rb", descriptor = "[I")
    private static int[] field2302 = new int[10];

    @OriginalMember(owner = "client!na", name = "Yb", descriptor = "[[I")
    private static int[][] field2309 = new int[1600][512];

    @OriginalMember(owner = "client!na", name = "Tb", descriptor = "[I")
    private static int[] field2304 = new int[4096];

    @OriginalMember(owner = "client!na", name = "bc", descriptor = "[I")
    private static int[] field2312 = new int[4096];

    @OriginalMember(owner = "client!na", name = "Qb", descriptor = "[I")
    private static int[] field2301 = new int[12];

    @OriginalMember(owner = "client!na", name = "ec", descriptor = "[I")
    private static int[] field2315 = class40.field719;

    @OriginalMember(owner = "client!na", name = "Ub", descriptor = "[B")
    private static byte[] field2305 = new byte[1];

    @OriginalMember(owner = "client!na", name = "fc", descriptor = "[I")
    private static int[] field2316 = new int[10];

    @OriginalMember(owner = "client!na", name = "ac", descriptor = "[Z")
    private static boolean[] field2311 = new boolean[4096];

    @OriginalMember(owner = "client!na", name = "Xb", descriptor = "[I")
    private static int[] field2308 = class40.field702;

    @OriginalMember(owner = "client!na", name = "dc", descriptor = "[I")
    private static int[] field2314 = new int[10];

    @OriginalMember(owner = "client!na", name = "Sb", descriptor = "[I")
    private static int[] field2303 = new int[4096];

    @OriginalMember(owner = "client!na", name = "cc", descriptor = "[I")
    private static int[] field2313 = new int[4096];

    @OriginalMember(owner = "client!na", name = "kc", descriptor = "[I")
    private static int[] field2321 = new int[1600];

    @OriginalMember(owner = "client!na", name = "gc", descriptor = "[I")
    private static int[] field2317 = class40.field713;

    @OriginalMember(owner = "client!na", name = "jc", descriptor = "[Z")
    private static boolean[] field2320 = new boolean[4096];

    @OriginalMember(owner = "client!na", name = "Vb", descriptor = "[I")
    private static int[] field2306 = new int[4096];

    @OriginalMember(owner = "client!na", name = "nc", descriptor = "[I")
    private static int[] field2324 = class40.field717;

    @OriginalMember(owner = "client!na", name = "lc", descriptor = "[I")
    private static int[] field2322 = new int[4096];

    @OriginalMember(owner = "client!na", name = "ic", descriptor = "[[I")
    private static int[][] field2319 = new int[12][2000];

    @OriginalMember(owner = "client!na", name = "Wb", descriptor = "[I")
    private static int[] field2307 = new int[2000];

    @OriginalMember(owner = "client!na", name = "oc", descriptor = "[I")
    private static int[] field2325 = new int[12];

    @OriginalMember(owner = "client!na", name = "hc", descriptor = "[I")
    private static int[] field2318 = new int[2000];

    @OriginalMember(owner = "client!na", name = "Pb", descriptor = "I")
    private static int field2300;

    @OriginalMember(owner = "client!na", name = "Zb", descriptor = "I")
    private static int field2310;

    @OriginalMember(owner = "client!na", name = "mc", descriptor = "I")
    private static int field2323;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lo;)Lo;")
    public final class126 method844(class126 arg0) {
        return new class118(new class118[] { this, (class118) arg0 }, 2);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)Lo;")
    public final class126 method845(boolean arg0) {
        if (!arg0 && field2305.length < super.field2475) {
            field2305 = new byte[super.field2475 + 100];
        }
        return this.method860(arg0, field2298, field2305);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (!super.field2485) {
            this.method896();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = (super.field2490 * arg1 + super.field2487 * arg2 >> 16) + var11;
        if (var12 > 50) {
            int var13 = (-super.field2487 * arg2 + super.field756 * arg1 >> 16) + var11;
            if (var13 < 3500) {
                int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
                int var15 = super.field2487 + var14 << 9;
                if (var15 / var12 > class40.field701) {
                    int var16 = var14 - super.field2487 << 9;
                    if (var16 / var12 < class40.field703) {
                        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
                        int var18 = (super.field2490 * arg2 + super.field2487 * arg1 >> 16) + var17 << 9;
                        if (var18 / var12 > class40.field718) {
                            int var19 = (-super.field2487 * arg1 + super.field756 * arg2 >> 16) + var17 << 9;
                            if (var19 / var12 < class40.field720) {
                                boolean var20 = false;
                                boolean var21 = var13 <= 50;
                                boolean var22 = var21 || this.field2284 > 0;
                                int var23 = class40.field716;
                                int var24 = class40.field715;
                                int var25 = 0;
                                int var26 = 0;
                                if (arg0 != 0) {
                                    var25 = field2324[arg0];
                                    var26 = field2315[arg0];
                                }
                                boolean var27 = false;
                                if (arg8 > 0 && class126.field2480 && var13 > 0) {
                                    int var28;
                                    int var29;
                                    if (var14 > 0) {
                                        var28 = var16 / var12;
                                        var29 = var15 / var13;
                                    } else {
                                        var28 = var16 / var13;
                                        var29 = var15 / var12;
                                    }
                                    int var30;
                                    int var31;
                                    if (var17 > 0) {
                                        var30 = var19 / var12;
                                        var31 = var18 / var13;
                                    } else {
                                        var30 = var19 / var13;
                                        var31 = var18 / var12;
                                    }
                                    int var32 = class126.field2473 - class40.field716;
                                    int var33 = class126.field2478 - class40.field715;
                                    if (var32 >= var28 && var32 <= var29 && var33 >= var30 && var33 <= var31) {
                                        int var34 = 999999;
                                        int var35 = -999999;
                                        int var36 = 999999;
                                        int var37 = -999999;
                                        int[] var38 = new int[] { super.field2489, super.field2488, super.field2489, super.field2488, super.field2489, super.field2488, super.field2489, super.field2488 };
                                        int[] var39 = new int[] { super.field2471, super.field2471, super.field2476, super.field2476, super.field2471, super.field2471, super.field2476, super.field2476 };
                                        int[] var40 = new int[] { super.field756, super.field756, super.field756, super.field756, super.field2490, super.field2490, super.field2490, super.field2490 };
                                        for (int var41 = 0; var41 < 8; ++var41) {
                                            int var42 = var38[var41];
                                            int var43 = var40[var41];
                                            int var44 = var39[var41];
                                            if (arg0 != 0) {
                                                int var45 = var25 * var44 + var26 * var42 >> 16;
                                                var44 = var26 * var44 - var25 * var42 >> 16;
                                                var42 = var45;
                                            }
                                            int var46 = arg5 + var42;
                                            int var47 = arg6 + var43;
                                            int var48 = arg7 + var44;
                                            int var49 = arg3 * var48 + arg4 * var46 >> 16;
                                            int var50 = arg4 * var48 - arg3 * var46 >> 16;
                                            int var52 = arg2 * var47 - arg1 * var50 >> 16;
                                            int var53 = arg1 * var47 + arg2 * var50 >> 16;
                                            if (var53 > 0) {
                                                int var55 = (var49 << 9) / var53;
                                                int var56 = (var52 << 9) / var53;
                                                if (var55 < var34) {
                                                    var34 = var55;
                                                }
                                                if (var55 > var35) {
                                                    var35 = var55;
                                                }
                                                if (var56 < var36) {
                                                    var36 = var56;
                                                }
                                                if (var56 > var37) {
                                                    var37 = var56;
                                                }
                                            }
                                        }
                                        if (var32 >= var34 && var32 <= var35 && var33 >= var36 && var33 <= var37) {
                                            if (super.field2484) {
                                                class126.field2492[class126.field2481++] = arg8;
                                            } else {
                                                var27 = true;
                                            }
                                        }
                                    }
                                }
                                for (int var57 = 0; var57 < super.field2472; ++var57) {
                                    int var58 = super.field2486[var57];
                                    int var59 = super.field2479[var57];
                                    int var60 = super.field2470[var57];
                                    if (arg0 != 0) {
                                        int var61 = var25 * var60 + var26 * var58 >> 16;
                                        var60 = var26 * var60 - var25 * var58 >> 16;
                                        var58 = var61;
                                    }
                                    int var62 = arg5 + var58;
                                    int var63 = arg6 + var59;
                                    int var64 = arg7 + var60;
                                    int var65 = arg3 * var64 + arg4 * var62 >> 16;
                                    int var66 = arg4 * var64 - arg3 * var62 >> 16;
                                    int var68 = arg2 * var63 - arg1 * var66 >> 16;
                                    int var69 = arg1 * var63 + arg2 * var66 >> 16;
                                    field2312[var57] = var69 - var11;
                                    if (var69 >= 50) {
                                        field2322[var57] = (var65 << 9) / var69 + var23;
                                        field2303[var57] = (var68 << 9) / var69 + var24;
                                    } else {
                                        field2322[var57] = -5000;
                                        var20 = true;
                                    }
                                    if (var22) {
                                        field2306[var57] = var65;
                                        field2313[var57] = var68;
                                        field2304[var57] = var69;
                                    }
                                }
                                try {
                                    this.method855(var20, var27, arg8, var11 - var13, var12 - var13 + 2);
                                } catch (Exception var71) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(II)I")
    private static final int method846(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lnc;I)V")
    public final void method847(class120 arg0, int arg1) {
        if (super.field2482 != null) {
            if (arg1 != -1) {
                class55 var3 = arg0.field2350[arg1];
                class172 var4 = var3.field1035;
                field2323 = 0;
                field2310 = 0;
                field2300 = 0;
                for (int var5 = 0; var5 < var3.field1031; ++var5) {
                    int var6 = var3.field1028[var5];
                    this.method854(var4.field3289[var6], var4.field3291[var6], var3.field1029[var5], var3.field1032[var5], var3.field1030[var5]);
                }
                super.field2485 = false;
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIII)V")
    public final void method848(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            this.method896();
            int var8 = class40.field716;
            int var9 = class40.field715;
            int var10 = field2324[arg0];
            int var11 = field2315[arg0];
            int var12 = field2324[arg1];
            int var13 = field2315[arg1];
            int var14 = field2324[arg2];
            int var15 = field2315[arg2];
            int var16 = field2324[arg3];
            int var17 = field2315[arg3];
            int var18 = arg5 * var16 + arg6 * var17 >> 16;
            for (int var19 = 0; var19 < super.field2472; ++var19) {
                int var20 = super.field2486[var19];
                int var21 = super.field2479[var19];
                int var22 = super.field2470[var19];
                if (arg2 != 0) {
                    int var23 = var14 * var21 + var15 * var20 >> 16;
                    var21 = var15 * var21 - var14 * var20 >> 16;
                    var20 = var23;
                }
                if (arg0 != 0) {
                    int var24 = var11 * var21 - var10 * var22 >> 16;
                    var22 = var10 * var21 + var11 * var22 >> 16;
                    var21 = var24;
                }
                if (arg1 != 0) {
                    int var25 = var12 * var22 + var13 * var20 >> 16;
                    var22 = var13 * var22 - var12 * var20 >> 16;
                    var20 = var25;
                }
                int var26 = arg4 + var20;
                int var27 = arg5 + var21;
                int var28 = arg6 + var22;
                int var29 = var17 * var27 - var16 * var28 >> 16;
                int var30 = var16 * var27 + var17 * var28 >> 16;
                field2312[var19] = var30 - var18;
                field2322[var19] = (var26 << 9) / var30 + var8;
                field2303[var19] = (var29 << 9) / var30 + var9;
                if (this.field2284 > 0) {
                    field2306[var19] = var26;
                    field2313[var19] = var29;
                    field2304[var19] = var30;
                }
            }
            this.method855(false, false, 0, super.field2483, super.field2483 << 1);
        } catch (RuntimeException var32) {
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lnc;ILnc;I[I)V")
    public final void method849(class120 arg0, int arg1, class120 arg2, int arg3, int[] arg4) {
        if (arg1 != -1) {
            if (arg4 != null && arg3 != -1) {
                class55 var6 = arg0.field2350[arg1];
                class55 var7 = arg2.field2350[arg3];
                class172 var8 = var6.field1035;
                field2323 = 0;
                field2310 = 0;
                field2300 = 0;
                byte var9 = 0;
                int var17 = var9 + 1;
                int var10 = arg4[var9];
                for (int var11 = 0; var11 < var6.field1031; ++var11) {
                    int var16 = var6.field1028[var11];
                    while (var16 > var10) {
                        var10 = arg4[var17++];
                    }
                    if (var10 != var16 || var8.field3289[var16] == 0) {
                        this.method854(var8.field3289[var16], var8.field3291[var16], var6.field1029[var11], var6.field1032[var11], var6.field1030[var11]);
                    }
                }
                field2323 = 0;
                field2310 = 0;
                field2300 = 0;
                byte var12 = 0;
                int var18 = var12 + 1;
                int var13 = arg4[var12];
                for (int var14 = 0; var14 < var7.field1031; ++var14) {
                    int var15 = var7.field1028[var14];
                    while (var15 > var13) {
                        var13 = arg4[var18++];
                    }
                    if (var13 == var15 || var8.field3289[var15] == 0) {
                        this.method854(var8.field3289[var15], var8.field3291[var15], var7.field1029[var14], var7.field1032[var14], var7.field1030[var14]);
                    }
                }
                super.field2485 = false;
            } else {
                this.method847(arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(IIIIIIII)Z")
    private final boolean method850(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!na", name = "l", descriptor = "(I)V")
    private final void method851(int arg0) {
        if (field2320[arg0]) {
            this.method856(arg0);
        } else {
            int var2 = this.field2285[arg0];
            int var3 = this.field2283[arg0];
            int var4 = this.field2287[arg0];
            class40.field708 = field2311[arg0];
            if (this.field2291 == null) {
                class40.field705 = 0;
            } else {
                class40.field705 = this.field2291[arg0] & 255;
            }
            if (this.field2296 != null && this.field2296[arg0] != -1) {
                int var6;
                int var7;
                int var8;
                if (this.field2282 != null && this.field2282[arg0] != -1) {
                    int var5 = this.field2282[arg0] & 255;
                    var6 = this.field2290[var5];
                    var7 = this.field2288[var5];
                    var8 = this.field2293[var5];
                } else {
                    var6 = var2;
                    var7 = var3;
                    var8 = var4;
                }
                if (this.field2295[arg0] == -1) {
                    class40.method283(field2303[var2], field2303[var3], field2303[var4], field2322[var2], field2322[var3], field2322[var4], this.field2292[arg0], this.field2292[arg0], this.field2292[arg0], field2306[var6], field2306[var7], field2306[var8], field2313[var6], field2313[var7], field2313[var8], field2304[var6], field2304[var7], field2304[var8], this.field2296[arg0]);
                } else {
                    class40.method283(field2303[var2], field2303[var3], field2303[var4], field2322[var2], field2322[var3], field2322[var4], this.field2292[arg0], this.field2286[arg0], this.field2295[arg0], field2306[var6], field2306[var7], field2306[var8], field2313[var6], field2313[var7], field2313[var8], field2304[var6], field2304[var7], field2304[var8], this.field2296[arg0]);
                }
            } else if (this.field2295[arg0] == -1) {
                class40.method282(field2303[var2], field2303[var3], field2303[var4], field2322[var2], field2322[var3], field2322[var4], field2317[this.field2292[arg0]]);
            } else {
                class40.method272(field2303[var2], field2303[var3], field2303[var4], field2322[var2], field2322[var3], field2322[var4], this.field2292[arg0], this.field2286[arg0], this.field2295[arg0]);
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)Lo;")
    public final class126 method852(boolean arg0) {
        if (!arg0 && field2299.length < super.field2475) {
            field2299 = new byte[super.field2475 + 100];
        }
        return this.method860(arg0, field2297, field2299);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([[IIIIZI)Lo;")
    public final class126 method853(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method896();
        int var7 = super.field2489 + arg1;
        int var8 = super.field2488 + arg1;
        int var9 = super.field2471 + arg3;
        int var10 = super.field2476 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class118 var15;
                if (arg4) {
                    var15 = new class118();
                    var15.field2472 = super.field2472;
                    var15.field2475 = super.field2475;
                    var15.field2284 = this.field2284;
                    var15.field2486 = super.field2486;
                    var15.field2470 = super.field2470;
                    var15.field2285 = this.field2285;
                    var15.field2283 = this.field2283;
                    var15.field2287 = this.field2287;
                    var15.field2292 = this.field2292;
                    var15.field2286 = this.field2286;
                    var15.field2295 = this.field2295;
                    var15.field2289 = this.field2289;
                    var15.field2291 = this.field2291;
                    var15.field2282 = this.field2282;
                    var15.field2296 = this.field2296;
                    var15.field2294 = this.field2294;
                    var15.field2290 = this.field2290;
                    var15.field2288 = this.field2288;
                    var15.field2293 = this.field2293;
                    var15.field2482 = super.field2482;
                    var15.field2477 = super.field2477;
                    var15.field2484 = super.field2484;
                    var15.field2479 = new int[var15.field2472];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field2472; ++var16) {
                        int var17 = super.field2486[var16] + arg1;
                        int var18 = super.field2470[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field2479[var16] = super.field2479[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field2472; ++var26) {
                        int var27 = (super.field2479[var26] << 16) / super.field756;
                        if (var27 < arg5) {
                            int var28 = super.field2486[var26] + arg1;
                            int var29 = super.field2470[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field2479[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + super.field2479[var26];
                        } else {
                            var15.field2479[var26] = super.field2479[var26];
                        }
                    }
                }
                super.field2485 = false;
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I[IIII)V")
    private final void method854(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            field2323 = 0;
            field2310 = 0;
            field2300 = 0;
            for (int var8 = 0; var8 < var6; ++var8) {
                int var9 = arg1[var8];
                if (var9 < super.field2482.length) {
                    int[] var10 = super.field2482[var9];
                    for (int var11 = 0; var11 < var10.length; ++var11) {
                        int var12 = var10[var11];
                        field2323 += super.field2486[var12];
                        field2310 += super.field2479[var12];
                        field2300 += super.field2470[var12];
                        ++var7;
                    }
                }
            }
            if (var7 > 0) {
                field2323 = field2323 / var7 + arg2;
                field2310 = field2310 / var7 + arg3;
                field2300 = field2300 / var7 + arg4;
            } else {
                field2323 = arg2;
                field2310 = arg3;
                field2300 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; ++var13) {
                int var14 = arg1[var13];
                if (var14 < super.field2482.length) {
                    int[] var15 = super.field2482[var14];
                    for (int var16 = 0; var16 < var15.length; ++var16) {
                        int var17 = var15[var16];
                        super.field2486[var17] += arg2;
                        super.field2479[var17] += arg3;
                        super.field2470[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; ++var18) {
                int var19 = arg1[var18];
                if (var19 < super.field2482.length) {
                    int[] var20 = super.field2482[var19];
                    for (int var21 = 0; var21 < var20.length; ++var21) {
                        int var22 = var20[var21];
                        super.field2486[var22] -= field2323;
                        super.field2479[var22] -= field2310;
                        super.field2470[var22] -= field2300;
                        int var23 = (arg2 & 255) * 8;
                        int var24 = (arg3 & 255) * 8;
                        int var25 = (arg4 & 255) * 8;
                        if (var25 != 0) {
                            int var26 = field2324[var25];
                            int var27 = field2315[var25];
                            int var28 = super.field2486[var22] * var27 + super.field2479[var22] * var26 + 32767 >> 16;
                            super.field2479[var22] = super.field2479[var22] * var27 - super.field2486[var22] * var26 + 32767 >> 16;
                            super.field2486[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field2324[var23];
                            int var30 = field2315[var23];
                            int var31 = super.field2479[var22] * var30 - super.field2470[var22] * var29 + 32767 >> 16;
                            super.field2470[var22] = super.field2479[var22] * var29 + super.field2470[var22] * var30 + 32767 >> 16;
                            super.field2479[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field2324[var24];
                            int var33 = field2315[var24];
                            int var34 = super.field2486[var22] * var33 + super.field2470[var22] * var32 + 32767 >> 16;
                            super.field2470[var22] = super.field2470[var22] * var33 - super.field2486[var22] * var32 + 32767 >> 16;
                            super.field2486[var22] = var34;
                        }
                        super.field2486[var22] += field2323;
                        super.field2479[var22] += field2310;
                        super.field2470[var22] += field2300;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; ++var35) {
                int var36 = arg1[var35];
                if (var36 < super.field2482.length) {
                    int[] var37 = super.field2482[var36];
                    for (int var38 = 0; var38 < var37.length; ++var38) {
                        int var39 = var37[var38];
                        super.field2486[var39] -= field2323;
                        super.field2479[var39] -= field2310;
                        super.field2470[var39] -= field2300;
                        super.field2486[var39] = super.field2486[var39] * arg2 / 128;
                        super.field2479[var39] = super.field2479[var39] * arg3 / 128;
                        super.field2470[var39] = super.field2470[var39] * arg4 / 128;
                        super.field2486[var39] += field2323;
                        super.field2479[var39] += field2310;
                        super.field2470[var39] += field2300;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (super.field2477 != null && this.field2291 != null) {
                for (int var40 = 0; var40 < var6; ++var40) {
                    int var41 = arg1[var40];
                    if (var41 < super.field2477.length) {
                        int[] var42 = super.field2477[var41];
                        for (int var43 = 0; var43 < var42.length; ++var43) {
                            int var44 = var42[var43];
                            int var45 = (this.field2291[var44] & 255) + arg2 * 8;
                            if (var45 < 0) {
                                var45 = 0;
                            } else if (var45 > 255) {
                                var45 = 255;
                            }
                            this.field2291[var44] = (byte) var45;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZZIII)V")
    private final void method855(boolean arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg4 < 1600) {
            for (int var6 = 0; var6 < arg4; ++var6) {
                field2321[var6] = 0;
            }
            for (int var7 = 0; var7 < super.field2475; ++var7) {
                if (this.field2295[var7] != -2) {
                    int var32 = this.field2285[var7];
                    int var33 = this.field2283[var7];
                    int var34 = this.field2287[var7];
                    int var35 = field2322[var32];
                    int var36 = field2322[var33];
                    int var37 = field2322[var34];
                    if (!arg0 || var35 != -5000 && var36 != -5000 && var37 != -5000) {
                        if (arg1 && this.method850(class126.field2473, class126.field2478, field2303[var32], field2303[var33], field2303[var34], var35, var36, var37)) {
                            class126.field2492[class126.field2481++] = arg2;
                            arg1 = false;
                        }
                        if ((field2303[var34] - field2303[var33]) * (var35 - var36) - (field2303[var32] - field2303[var33]) * (var37 - var36) > 0) {
                            field2320[var7] = false;
                            if (var35 >= 0 && var36 >= 0 && var37 >= 0 && var35 <= class40.field706 && var36 <= class40.field706 && var37 <= class40.field706) {
                                field2311[var7] = false;
                            } else {
                                field2311[var7] = true;
                            }
                            int var57 = (field2312[var32] + field2312[var33] + field2312[var34]) / 3 + arg3;
                            field2309[var57][field2321[var57]++] = var7;
                        }
                    } else {
                        int var38 = field2306[var32];
                        int var39 = field2306[var33];
                        int var40 = field2306[var34];
                        int var41 = field2313[var32];
                        int var42 = field2313[var33];
                        int var43 = field2313[var34];
                        int var44 = field2304[var32];
                        int var45 = field2304[var33];
                        int var46 = field2304[var34];
                        int var47 = var38 - var39;
                        int var48 = var40 - var39;
                        int var49 = var41 - var42;
                        int var50 = var43 - var42;
                        int var51 = var44 - var45;
                        int var52 = var46 - var45;
                        int var53 = var49 * var52 - var50 * var51;
                        int var54 = var48 * var51 - var47 * var52;
                        int var55 = var47 * var50 - var48 * var49;
                        if (var45 * var55 + var39 * var53 + var42 * var54 > 0) {
                            field2320[var7] = true;
                            int var56 = (field2312[var32] + field2312[var33] + field2312[var34]) / 3 + arg3;
                            field2309[var56][field2321[var56]++] = var7;
                        }
                    }
                }
            }
            if (this.field2289 == null) {
                for (int var8 = arg4 - 1; var8 >= 0; --var8) {
                    int var9 = field2321[var8];
                    if (var9 > 0) {
                        int[] var10 = field2309[var8];
                        for (int var11 = 0; var11 < var9; ++var11) {
                            this.method851(var10[var11]);
                        }
                    }
                }
            } else {
                for (int var12 = 0; var12 < 12; ++var12) {
                    field2301[var12] = 0;
                    field2325[var12] = 0;
                }
                for (int var13 = arg4 - 1; var13 >= 0; --var13) {
                    int var26 = field2321[var13];
                    if (var26 > 0) {
                        int[] var27 = field2309[var13];
                        for (int var28 = 0; var28 < var26; ++var28) {
                            int var29 = var27[var28];
                            byte var30 = this.field2289[var29];
                            int var31 = field2301[var30]++;
                            field2319[var30][var31] = var29;
                            if (var30 < 10) {
                                field2325[var30] += var13;
                            } else if (var30 == 10) {
                                field2307[var31] = var13;
                            } else {
                                field2318[var31] = var13;
                            }
                        }
                    }
                }
                int var14 = 0;
                if (field2301[1] > 0 || field2301[2] > 0) {
                    var14 = (field2325[1] + field2325[2]) / (field2301[1] + field2301[2]);
                }
                int var15 = 0;
                if (field2301[3] > 0 || field2301[4] > 0) {
                    var15 = (field2325[3] + field2325[4]) / (field2301[3] + field2301[4]);
                }
                int var16 = 0;
                if (field2301[6] > 0 || field2301[8] > 0) {
                    var16 = (field2325[6] + field2325[8]) / (field2301[6] + field2301[8]);
                }
                int var17 = 0;
                int var18 = field2301[10];
                int[] var19 = field2319[10];
                int[] var20 = field2307;
                if (var17 == var18) {
                    var17 = 0;
                    var18 = field2301[11];
                    var19 = field2319[11];
                    var20 = field2318;
                }
                int var21;
                if (var17 < var18) {
                    var21 = var20[var17];
                } else {
                    var21 = -1000;
                }
                for (int var22 = 0; var22 < 10; ++var22) {
                    while (var22 == 0 && var21 > var14) {
                        this.method851(var19[var17++]);
                        if (var17 == var18 && field2319[11] != var19) {
                            var17 = 0;
                            var18 = field2301[11];
                            var19 = field2319[11];
                            var20 = field2318;
                        }
                        if (var17 < var18) {
                            var21 = var20[var17];
                        } else {
                            var21 = -1000;
                        }
                    }
                    while (var22 == 3 && var21 > var15) {
                        this.method851(var19[var17++]);
                        if (var17 == var18 && field2319[11] != var19) {
                            var17 = 0;
                            var18 = field2301[11];
                            var19 = field2319[11];
                            var20 = field2318;
                        }
                        if (var17 < var18) {
                            var21 = var20[var17];
                        } else {
                            var21 = -1000;
                        }
                    }
                    while (var22 == 5 && var21 > var16) {
                        this.method851(var19[var17++]);
                        if (var17 == var18 && field2319[11] != var19) {
                            var17 = 0;
                            var18 = field2301[11];
                            var19 = field2319[11];
                            var20 = field2318;
                        }
                        if (var17 < var18) {
                            var21 = var20[var17];
                        } else {
                            var21 = -1000;
                        }
                    }
                    int var23 = field2301[var22];
                    int[] var24 = field2319[var22];
                    for (int var25 = 0; var25 < var23; ++var25) {
                        this.method851(var24[var25]);
                    }
                }
                while (var21 != -1000) {
                    this.method851(var19[var17++]);
                    if (var17 == var18 && field2319[11] != var19) {
                        var17 = 0;
                        var19 = field2319[11];
                        var18 = field2301[11];
                        var20 = field2318;
                    }
                    if (var17 < var18) {
                        var21 = var20[var17];
                    } else {
                        var21 = -1000;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "m", descriptor = "(I)V")
    private final void method856(int arg0) {
        int var2 = class40.field716;
        int var3 = class40.field715;
        int var4 = 0;
        int var5 = this.field2285[arg0];
        int var6 = this.field2283[arg0];
        int var7 = this.field2287[arg0];
        int var8 = field2304[var5];
        int var9 = field2304[var6];
        int var10 = field2304[var7];
        if (this.field2291 == null) {
            class40.field705 = 0;
        } else {
            class40.field705 = this.field2291[arg0] & 255;
        }
        if (var8 >= 50) {
            field2302[var4] = field2322[var5];
            field2316[var4] = field2303[var5];
            field2314[var4++] = this.field2292[arg0];
        } else {
            int var11 = field2306[var5];
            int var12 = field2313[var5];
            int var13 = this.field2292[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field2308[var10 - var8];
                field2302[var4] = (((field2306[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field2316[var4] = (((field2313[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field2314[var4++] = ((this.field2295[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field2308[var9 - var8];
                field2302[var4] = (((field2306[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field2316[var4] = (((field2313[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field2314[var4++] = ((this.field2286[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field2302[var4] = field2322[var6];
            field2316[var4] = field2303[var6];
            field2314[var4++] = this.field2286[arg0];
        } else {
            int var16 = field2306[var6];
            int var17 = field2313[var6];
            int var18 = this.field2286[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field2308[var8 - var9];
                field2302[var4] = (((field2306[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field2316[var4] = (((field2313[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field2314[var4++] = ((this.field2292[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field2308[var10 - var9];
                field2302[var4] = (((field2306[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field2316[var4] = (((field2313[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field2314[var4++] = ((this.field2295[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field2302[var4] = field2322[var7];
            field2316[var4] = field2303[var7];
            field2314[var4++] = this.field2295[arg0];
        } else {
            int var21 = field2306[var7];
            int var22 = field2313[var7];
            int var23 = this.field2295[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field2308[var9 - var10];
                field2302[var4] = (((field2306[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field2316[var4] = (((field2313[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field2314[var4++] = ((this.field2286[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field2308[var8 - var10];
                field2302[var4] = (((field2306[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field2316[var4] = (((field2313[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field2314[var4++] = ((this.field2292[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field2302[0];
        int var27 = field2302[1];
        int var28 = field2302[2];
        int var29 = field2316[0];
        int var30 = field2316[1];
        int var31 = field2316[2];
        class40.field708 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > class40.field706 || var27 > class40.field706 || var28 > class40.field706) {
                class40.field708 = true;
            }
            if (this.field2296 != null && this.field2296[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field2282 != null && this.field2282[arg0] != -1) {
                    int var32 = this.field2282[arg0] & 255;
                    var33 = this.field2290[var32];
                    var34 = this.field2288[var32];
                    var35 = this.field2293[var32];
                } else {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                }
                if (this.field2295[arg0] == -1) {
                    class40.method283(var29, var30, var31, var26, var27, var28, this.field2292[arg0], this.field2292[arg0], this.field2292[arg0], field2306[var33], field2306[var34], field2306[var35], field2313[var33], field2313[var34], field2313[var35], field2304[var33], field2304[var34], field2304[var35], this.field2296[arg0]);
                } else {
                    class40.method283(var29, var30, var31, var26, var27, var28, field2314[0], field2314[1], field2314[2], field2306[var33], field2306[var34], field2306[var35], field2313[var33], field2313[var34], field2313[var35], field2304[var33], field2304[var34], field2304[var35], this.field2296[arg0]);
                }
            } else if (this.field2295[arg0] == -1) {
                class40.method282(var29, var30, var31, var26, var27, var28, field2317[this.field2292[arg0]]);
            } else {
                class40.method272(var29, var30, var31, var26, var27, var28, field2314[0], field2314[1], field2314[2]);
            }
        }
        if (var4 == 4) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > class40.field706 || var27 > class40.field706 || var28 > class40.field706 || field2302[3] < 0 || field2302[3] > class40.field706) {
                class40.field708 = true;
            }
            if (this.field2296 == null || this.field2296[arg0] == -1) {
                if (this.field2295[arg0] == -1) {
                    int var41 = field2317[this.field2292[arg0]];
                    class40.method282(var29, var30, var31, var26, var27, var28, var41);
                    class40.method282(var29, var31, field2316[3], var26, var28, field2302[3], var41);
                    return;
                }
                class40.method272(var29, var30, var31, var26, var27, var28, field2314[0], field2314[1], field2314[2]);
                class40.method272(var29, var31, field2316[3], var26, var28, field2302[3], field2314[0], field2314[2], field2314[3]);
                return;
            }
            int var37;
            int var38;
            int var39;
            if (this.field2282 != null && this.field2282[arg0] != -1) {
                int var36 = this.field2282[arg0] & 255;
                var37 = this.field2290[var36];
                var38 = this.field2288[var36];
                var39 = this.field2293[var36];
            } else {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            }
            short var40 = this.field2296[arg0];
            if (this.field2295[arg0] == -1) {
                class40.method283(var29, var30, var31, var26, var27, var28, this.field2292[arg0], this.field2292[arg0], this.field2292[arg0], field2306[var37], field2306[var38], field2306[var39], field2313[var37], field2313[var38], field2313[var39], field2304[var37], field2304[var38], field2304[var39], var40);
                class40.method283(var29, var31, field2316[3], var26, var28, field2302[3], this.field2292[arg0], this.field2292[arg0], this.field2292[arg0], field2306[var37], field2306[var38], field2306[var39], field2313[var37], field2313[var38], field2313[var39], field2304[var37], field2304[var38], field2304[var39], var40);
                return;
            }
            class40.method283(var29, var30, var31, var26, var27, var28, field2314[0], field2314[1], field2314[2], field2306[var37], field2306[var38], field2306[var39], field2313[var37], field2313[var38], field2313[var39], field2304[var37], field2304[var38], field2304[var39], var40);
            class40.method283(var29, var31, field2316[3], var26, var28, field2302[3], field2314[0], field2314[2], field2314[3], field2306[var37], field2306[var38], field2306[var39], field2313[var37], field2313[var38], field2313[var39], field2304[var37], field2304[var38], field2304[var39], var40);
        }
    }

    @OriginalMember(owner = "client!na", name = "g", descriptor = "()V")
    public static void method857() {
        field2297 = null;
        field2299 = null;
        field2298 = null;
        field2305 = null;
        field2311 = null;
        field2320 = null;
        field2322 = null;
        field2303 = null;
        field2312 = null;
        field2306 = null;
        field2313 = null;
        field2304 = null;
        field2321 = null;
        field2309 = null;
        field2301 = null;
        field2319 = null;
        field2307 = null;
        field2318 = null;
        field2325 = null;
        field2302 = null;
        field2316 = null;
        field2314 = null;
        field2324 = null;
        field2315 = null;
        field2317 = null;
        field2308 = null;
    }

    @OriginalMember(owner = "client!na", name = "n", descriptor = "(I)I")
    private static final int method858(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIII)V")
    public final void method859(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            this.method896();
            int var9 = class40.field716;
            int var10 = class40.field715;
            int var11 = field2324[arg0];
            int var12 = field2315[arg0];
            int var13 = field2324[arg1];
            int var14 = field2315[arg1];
            int var15 = field2324[arg2];
            int var16 = field2315[arg2];
            int var17 = field2324[arg3];
            int var18 = field2315[arg3];
            int var19 = arg5 * var17 + arg6 * var18 >> 16;
            for (int var20 = 0; var20 < super.field2472; ++var20) {
                int var21 = super.field2486[var20];
                int var22 = super.field2479[var20];
                int var23 = super.field2470[var20];
                if (arg2 != 0) {
                    int var24 = var15 * var22 + var16 * var21 >> 16;
                    var22 = var16 * var22 - var15 * var21 >> 16;
                    var21 = var24;
                }
                if (arg0 != 0) {
                    int var25 = var12 * var22 - var11 * var23 >> 16;
                    var23 = var11 * var22 + var12 * var23 >> 16;
                    var22 = var25;
                }
                if (arg1 != 0) {
                    int var26 = var13 * var23 + var14 * var21 >> 16;
                    var23 = var14 * var23 - var13 * var21 >> 16;
                    var21 = var26;
                }
                int var27 = arg4 + var21;
                int var28 = arg5 + var22;
                int var29 = arg6 + var23;
                int var30 = var18 * var28 - var17 * var29 >> 16;
                int var31 = var17 * var28 + var18 * var29 >> 16;
                field2312[var20] = var31 - var19;
                field2322[var20] = (var27 << 9) / arg7 + var9;
                field2303[var20] = (var30 << 9) / arg7 + var10;
                if (this.field2284 > 0) {
                    field2306[var20] = var27;
                    field2313[var20] = var30;
                    field2304[var20] = var31;
                }
            }
            this.method855(false, false, 0, super.field2483, super.field2483 << 1);
        } catch (RuntimeException var33) {
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZLna;[B)Lna;")
    private final class118 method860(boolean arg0, class118 arg1, byte[] arg2) {
        arg1.field2472 = super.field2472;
        arg1.field2475 = super.field2475;
        arg1.field2284 = this.field2284;
        if (arg1.field2486 == null || arg1.field2486.length < super.field2472) {
            arg1.field2486 = new int[super.field2472 + 100];
            arg1.field2479 = new int[super.field2472 + 100];
            arg1.field2470 = new int[super.field2472 + 100];
        }
        for (int var4 = 0; var4 < super.field2472; ++var4) {
            arg1.field2486[var4] = super.field2486[var4];
            arg1.field2479[var4] = super.field2479[var4];
            arg1.field2470[var4] = super.field2470[var4];
        }
        if (arg0) {
            arg1.field2291 = this.field2291;
        } else {
            arg1.field2291 = arg2;
            if (this.field2291 == null) {
                for (int var5 = 0; var5 < super.field2475; ++var5) {
                    arg1.field2291[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < super.field2475; ++var6) {
                    arg1.field2291[var6] = this.field2291[var6];
                }
            }
        }
        arg1.field2285 = this.field2285;
        arg1.field2283 = this.field2283;
        arg1.field2287 = this.field2287;
        arg1.field2292 = this.field2292;
        arg1.field2286 = this.field2286;
        arg1.field2295 = this.field2295;
        arg1.field2289 = this.field2289;
        arg1.field2282 = this.field2282;
        arg1.field2296 = this.field2296;
        arg1.field2294 = this.field2294;
        arg1.field2290 = this.field2290;
        arg1.field2288 = this.field2288;
        arg1.field2293 = this.field2293;
        arg1.field2482 = super.field2482;
        arg1.field2477 = super.field2477;
        arg1.field2484 = super.field2484;
        arg1.field2485 = false;
        return arg1;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
    public class118() {
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Llb;IIIII)V")
    public class118(class101 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.method752();
        arg0.method767();
        super.field2472 = arg0.field1928;
        super.field2486 = arg0.field1924;
        super.field2479 = arg0.field1952;
        super.field2470 = arg0.field1918;
        super.field2475 = arg0.field1920;
        this.field2285 = arg0.field1929;
        this.field2283 = arg0.field1943;
        this.field2287 = arg0.field1946;
        this.field2289 = arg0.field1942;
        this.field2291 = arg0.field1927;
        this.field2294 = arg0.field1931;
        super.field2482 = arg0.field1936;
        super.field2477 = arg0.field1932;
        int var7 = (int) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        int var8 = arg2 * var7 >> 8;
        this.field2292 = new int[super.field2475];
        this.field2286 = new int[super.field2475];
        this.field2295 = new int[super.field2475];
        if (arg0.field1926 != null) {
            this.field2296 = new short[super.field2475];
            for (int var9 = 0; var9 < super.field2475; ++var9) {
                short var10 = arg0.field1926[var9];
                if (var10 != -1 && class40.field721.method813((byte) 115, var10)) {
                    this.field2296[var9] = var10;
                } else {
                    this.field2296[var9] = -1;
                }
            }
        } else {
            this.field2296 = null;
        }
        if (arg0.field1933 > 0 && arg0.field1950 != null) {
            int[] var11 = new int[arg0.field1933];
            for (int var12 = 0; var12 < super.field2475; ++var12) {
                if (arg0.field1950[var12] != -1) {
                    ++var11[arg0.field1950[var12] & 255];
                }
            }
            this.field2284 = 0;
            for (int var13 = 0; var13 < arg0.field1933; ++var13) {
                if (var11[var13] > 0 && arg0.field1948[var13] == 0) {
                    ++this.field2284;
                }
            }
            this.field2290 = new int[this.field2284];
            this.field2288 = new int[this.field2284];
            this.field2293 = new int[this.field2284];
            int var14 = 0;
            for (int var15 = 0; var15 < arg0.field1933; ++var15) {
                if (var11[var15] > 0 && arg0.field1948[var15] == 0) {
                    this.field2290[var14] = arg0.field1959[var15] & 65535;
                    this.field2288[var14] = arg0.field1947[var15] & 65535;
                    this.field2293[var14] = arg0.field1954[var15] & 65535;
                    var11[var15] = var14++;
                } else {
                    var11[var15] = -1;
                }
            }
            this.field2282 = new byte[super.field2475];
            for (int var16 = 0; var16 < super.field2475; ++var16) {
                if (arg0.field1950[var16] != -1) {
                    this.field2282[var16] = (byte) var11[arg0.field1950[var16] & 255];
                    if (this.field2282[var16] == -1 && this.field2296 != null) {
                        this.field2296[var16] = -1;
                    }
                } else {
                    this.field2282[var16] = -1;
                }
            }
        }
        for (int var17 = 0; var17 < super.field2475; ++var17) {
            byte var18;
            if (arg0.field1922 == null) {
                var18 = 0;
            } else {
                var18 = arg0.field1922[var17];
            }
            byte var19;
            if (arg0.field1927 == null) {
                var19 = 0;
            } else {
                var19 = arg0.field1927[var17];
            }
            short var20;
            if (this.field2296 == null) {
                var20 = -1;
            } else {
                var20 = this.field2296[var17];
            }
            if (var19 == -2) {
                var18 = 3;
            }
            if (var19 == -1) {
                var18 = 2;
            }
            if (var20 == -1) {
                if (var18 != 0) {
                    if (var18 == 1) {
                        class14 var28 = arg0.field1955[var17];
                        int var29 = (var28.field245 * arg5 + var28.field251 * arg4 + var28.field249 * arg3) / (var8 / 2 + var8) + arg1;
                        this.field2292[var17] = method846(arg0.field1956[var17] & 65535, var29);
                        this.field2295[var17] = -1;
                    } else if (var18 == 3) {
                        this.field2292[var17] = 128;
                        this.field2295[var17] = -1;
                    } else {
                        this.field2295[var17] = -2;
                    }
                } else {
                    int var21 = arg0.field1956[var17] & 65535;
                    class28 var22;
                    if (arg0.field1913 != null && arg0.field1913[this.field2285[var17]] != null) {
                        var22 = arg0.field1913[this.field2285[var17]];
                    } else {
                        var22 = arg0.field1937[this.field2285[var17]];
                    }
                    int var23 = (var22.field488 * arg5 + var22.field490 * arg3 + var22.field486 * arg4) / (var22.field483 * var8) + arg1;
                    this.field2292[var17] = method846(var21, var23);
                    class28 var24;
                    if (arg0.field1913 != null && arg0.field1913[this.field2283[var17]] != null) {
                        var24 = arg0.field1913[this.field2283[var17]];
                    } else {
                        var24 = arg0.field1937[this.field2283[var17]];
                    }
                    int var25 = (var24.field488 * arg5 + var24.field490 * arg3 + var24.field486 * arg4) / (var24.field483 * var8) + arg1;
                    this.field2286[var17] = method846(var21, var25);
                    class28 var26;
                    if (arg0.field1913 != null && arg0.field1913[this.field2287[var17]] != null) {
                        var26 = arg0.field1913[this.field2287[var17]];
                    } else {
                        var26 = arg0.field1937[this.field2287[var17]];
                    }
                    int var27 = (var26.field488 * arg5 + var26.field490 * arg3 + var26.field486 * arg4) / (var26.field483 * var8) + arg1;
                    this.field2295[var17] = method846(var21, var27);
                }
            } else if (var18 != 0) {
                if (var18 == 1) {
                    class14 var36 = arg0.field1955[var17];
                    int var37 = (var36.field245 * arg5 + var36.field251 * arg4 + var36.field249 * arg3) / (var8 / 2 + var8) + arg1;
                    this.field2292[var17] = method858(var37);
                    this.field2295[var17] = -1;
                } else {
                    this.field2295[var17] = -2;
                }
            } else {
                class28 var30;
                if (arg0.field1913 != null && arg0.field1913[this.field2285[var17]] != null) {
                    var30 = arg0.field1913[this.field2285[var17]];
                } else {
                    var30 = arg0.field1937[this.field2285[var17]];
                }
                int var31 = (var30.field488 * arg5 + var30.field490 * arg3 + var30.field486 * arg4) / (var30.field483 * var8) + arg1;
                this.field2292[var17] = method858(var31);
                class28 var32;
                if (arg0.field1913 != null && arg0.field1913[this.field2283[var17]] != null) {
                    var32 = arg0.field1913[this.field2283[var17]];
                } else {
                    var32 = arg0.field1937[this.field2283[var17]];
                }
                int var33 = (var32.field488 * arg5 + var32.field490 * arg3 + var32.field486 * arg4) / (var32.field483 * var8) + arg1;
                this.field2286[var17] = method858(var33);
                class28 var34;
                if (arg0.field1913 != null && arg0.field1913[this.field2287[var17]] != null) {
                    var34 = arg0.field1913[this.field2287[var17]];
                } else {
                    var34 = arg0.field1937[this.field2287[var17]];
                }
                int var35 = (var34.field488 * arg5 + var34.field490 * arg3 + var34.field486 * arg4) / (var34.field483 * var8) + arg1;
                this.field2295[var17] = method858(var35);
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "([Lna;I)V")
    private class118(class118[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        super.field2472 = 0;
        super.field2475 = 0;
        this.field2284 = 0;
        this.field2294 = -1;
        for (int var7 = 0; var7 < arg1; ++var7) {
            class118 var13 = arg0[var7];
            if (var13 != null) {
                super.field2472 += var13.field2472;
                super.field2475 += var13.field2475;
                this.field2284 += var13.field2284;
                if (var13.field2289 != null) {
                    var3 = true;
                } else {
                    if (this.field2294 == -1) {
                        this.field2294 = var13.field2294;
                    }
                    if (this.field2294 != var13.field2294) {
                        var3 = true;
                    }
                }
                var4 |= var13.field2291 != null;
                var5 |= var13.field2296 != null;
                var6 |= var13.field2282 != null;
            }
        }
        super.field2486 = new int[super.field2472];
        super.field2479 = new int[super.field2472];
        super.field2470 = new int[super.field2472];
        this.field2285 = new int[super.field2475];
        this.field2283 = new int[super.field2475];
        this.field2287 = new int[super.field2475];
        this.field2292 = new int[super.field2475];
        this.field2286 = new int[super.field2475];
        this.field2295 = new int[super.field2475];
        if (var3) {
            this.field2289 = new byte[super.field2475];
        }
        if (var4) {
            this.field2291 = new byte[super.field2475];
        }
        if (var5) {
            this.field2296 = new short[super.field2475];
        }
        if (var6) {
            this.field2282 = new byte[super.field2475];
        }
        if (this.field2284 > 0) {
            this.field2290 = new int[this.field2284];
            this.field2288 = new int[this.field2284];
            this.field2293 = new int[this.field2284];
        }
        super.field2472 = 0;
        super.field2475 = 0;
        this.field2284 = 0;
        for (int var8 = 0; var8 < arg1; ++var8) {
            class118 var9 = arg0[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < var9.field2475; ++var10) {
                    this.field2285[super.field2475] = var9.field2285[var10] + super.field2472;
                    this.field2283[super.field2475] = var9.field2283[var10] + super.field2472;
                    this.field2287[super.field2475] = var9.field2287[var10] + super.field2472;
                    this.field2292[super.field2475] = var9.field2292[var10];
                    this.field2286[super.field2475] = var9.field2286[var10];
                    this.field2295[super.field2475] = var9.field2295[var10];
                    if (var3) {
                        if (var9.field2289 != null) {
                            this.field2289[super.field2475] = var9.field2289[var10];
                        } else {
                            this.field2289[super.field2475] = var9.field2294;
                        }
                    }
                    if (var4 && var9.field2291 != null) {
                        this.field2291[super.field2475] = var9.field2291[var10];
                    }
                    if (var5) {
                        if (var9.field2296 != null) {
                            this.field2296[super.field2475] = var9.field2296[var10];
                        } else {
                            this.field2296[super.field2475] = -1;
                        }
                    }
                    if (var6) {
                        if (var9.field2282 != null && var9.field2282[var10] != -1) {
                            this.field2282[super.field2475] = (byte) (var9.field2282[var10] + this.field2284);
                        } else {
                            this.field2282[super.field2475] = -1;
                        }
                    }
                    ++super.field2475;
                }
                for (int var11 = 0; var11 < var9.field2284; ++var11) {
                    this.field2290[this.field2284] = var9.field2290[var11] + super.field2472;
                    this.field2288[this.field2284] = var9.field2288[var11] + super.field2472;
                    this.field2293[this.field2284] = var9.field2293[var11] + super.field2472;
                    ++this.field2284;
                }
                for (int var12 = 0; var12 < var9.field2472; ++var12) {
                    super.field2486[super.field2472] = var9.field2486[var12];
                    super.field2479[super.field2472] = var9.field2479[var12];
                    super.field2470[super.field2472] = var9.field2470[var12];
                    ++super.field2472;
                }
            }
        }
    }
}
