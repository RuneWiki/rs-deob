import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class125 extends class52 {

    @OriginalMember(owner = "client!ng", name = "ub", descriptor = "I")
    private int field2330 = 0;

    @OriginalMember(owner = "client!ng", name = "wb", descriptor = "B")
    private byte field2332 = 0;

    @OriginalMember(owner = "client!ng", name = "xb", descriptor = "[I")
    private int[] field2333;

    @OriginalMember(owner = "client!ng", name = "sb", descriptor = "[I")
    private int[] field2328;

    @OriginalMember(owner = "client!ng", name = "nb", descriptor = "[I")
    private int[] field2323;

    @OriginalMember(owner = "client!ng", name = "rb", descriptor = "[B")
    private byte[] field2327;

    @OriginalMember(owner = "client!ng", name = "mb", descriptor = "[B")
    private byte[] field2322;

    @OriginalMember(owner = "client!ng", name = "yb", descriptor = "[I")
    private int[] field2334;

    @OriginalMember(owner = "client!ng", name = "kb", descriptor = "[I")
    private int[] field2320;

    @OriginalMember(owner = "client!ng", name = "qb", descriptor = "[I")
    private int[] field2326;

    @OriginalMember(owner = "client!ng", name = "ob", descriptor = "[S")
    private short[] field2324;

    @OriginalMember(owner = "client!ng", name = "vb", descriptor = "[I")
    private int[] field2331;

    @OriginalMember(owner = "client!ng", name = "pb", descriptor = "[I")
    private int[] field2325;

    @OriginalMember(owner = "client!ng", name = "tb", descriptor = "[I")
    private int[] field2329;

    @OriginalMember(owner = "client!ng", name = "lb", descriptor = "[B")
    private byte[] field2321;

    @OriginalMember(owner = "client!ng", name = "zb", descriptor = "Lng;")
    private static class125 field2335 = new class125();

    @OriginalMember(owner = "client!ng", name = "Bb", descriptor = "[B")
    private static byte[] field2337 = new byte[1];

    @OriginalMember(owner = "client!ng", name = "Ab", descriptor = "Lng;")
    private static class125 field2336 = new class125();

    @OriginalMember(owner = "client!ng", name = "Eb", descriptor = "[B")
    private static byte[] field2340 = new byte[1];

    @OriginalMember(owner = "client!ng", name = "Cb", descriptor = "[I")
    private static int[] field2338 = class150.field2899;

    @OriginalMember(owner = "client!ng", name = "Gb", descriptor = "[I")
    private static int[] field2342 = new int[10];

    @OriginalMember(owner = "client!ng", name = "Hb", descriptor = "[I")
    private static int[] field2343 = new int[10];

    @OriginalMember(owner = "client!ng", name = "Lb", descriptor = "[I")
    private static int[] field2347 = new int[12];

    @OriginalMember(owner = "client!ng", name = "Db", descriptor = "[I")
    private static int[] field2339 = new int[4096];

    @OriginalMember(owner = "client!ng", name = "Ob", descriptor = "[I")
    private static int[] field2350 = class150.field2904;

    @OriginalMember(owner = "client!ng", name = "Jb", descriptor = "[I")
    private static int[] field2345 = new int[10];

    @OriginalMember(owner = "client!ng", name = "Tb", descriptor = "[I")
    private static int[] field2355 = class150.field2896;

    @OriginalMember(owner = "client!ng", name = "Pb", descriptor = "[I")
    private static int[] field2351 = new int[4096];

    @OriginalMember(owner = "client!ng", name = "Kb", descriptor = "[Z")
    private static boolean[] field2346 = new boolean[4096];

    @OriginalMember(owner = "client!ng", name = "Sb", descriptor = "[I")
    private static int[] field2354 = new int[2000];

    @OriginalMember(owner = "client!ng", name = "Nb", descriptor = "[Z")
    private static boolean[] field2349 = new boolean[4096];

    @OriginalMember(owner = "client!ng", name = "Xb", descriptor = "[I")
    private static int[] field2359 = new int[4096];

    @OriginalMember(owner = "client!ng", name = "Zb", descriptor = "[I")
    private static int[] field2361 = class150.field2888;

    @OriginalMember(owner = "client!ng", name = "Yb", descriptor = "[I")
    private static int[] field2360 = new int[12];

    @OriginalMember(owner = "client!ng", name = "Wb", descriptor = "[I")
    private static int[] field2358 = new int[4096];

    @OriginalMember(owner = "client!ng", name = "Ib", descriptor = "[[I")
    private static int[][] field2344 = new int[12][2000];

    @OriginalMember(owner = "client!ng", name = "Qb", descriptor = "[I")
    private static int[] field2352 = new int[4096];

    @OriginalMember(owner = "client!ng", name = "Vb", descriptor = "[I")
    private static int[] field2357 = new int[2000];

    @OriginalMember(owner = "client!ng", name = "Rb", descriptor = "[I")
    private static int[] field2353 = new int[4096];

    @OriginalMember(owner = "client!ng", name = "bc", descriptor = "[I")
    private static int[] field2363 = new int[1600];

    @OriginalMember(owner = "client!ng", name = "ac", descriptor = "[[I")
    private static int[][] field2362 = new int[1600][512];

    @OriginalMember(owner = "client!ng", name = "Fb", descriptor = "I")
    private static int field2341;

    @OriginalMember(owner = "client!ng", name = "Mb", descriptor = "I")
    private static int field2348;

    @OriginalMember(owner = "client!ng", name = "Ub", descriptor = "I")
    private static int field2356;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)V")
    private final void method709(int arg0) {
        if (field2346[arg0]) {
            this.method710(arg0);
        } else {
            int var2 = this.field2333[arg0];
            int var3 = this.field2328[arg0];
            int var4 = this.field2323[arg0];
            class150.field2887 = field2349[arg0];
            if (this.field2322 == null) {
                class150.field2901 = 0;
            } else {
                class150.field2901 = this.field2322[arg0] & 255;
            }
            if (this.field2324 != null && this.field2324[arg0] != -1) {
                int var6;
                int var7;
                int var8;
                if (this.field2321 != null && this.field2321[arg0] != -1) {
                    int var5 = this.field2321[arg0] & 255;
                    var6 = this.field2331[var5];
                    var7 = this.field2325[var5];
                    var8 = this.field2329[var5];
                } else {
                    var6 = var2;
                    var7 = var3;
                    var8 = var4;
                }
                if (this.field2326[arg0] == -1) {
                    class150.method920(field2358[var2], field2358[var3], field2358[var4], field2351[var2], field2351[var3], field2351[var4], this.field2334[arg0], this.field2334[arg0], this.field2334[arg0], field2352[var6], field2352[var7], field2352[var8], field2353[var6], field2353[var7], field2353[var8], field2359[var6], field2359[var7], field2359[var8], this.field2324[arg0]);
                } else {
                    class150.method920(field2358[var2], field2358[var3], field2358[var4], field2351[var2], field2351[var3], field2351[var4], this.field2334[arg0], this.field2320[arg0], this.field2326[arg0], field2352[var6], field2352[var7], field2352[var8], field2353[var6], field2353[var7], field2353[var8], field2359[var6], field2359[var7], field2359[var8], this.field2324[arg0]);
                }
            } else if (this.field2326[arg0] == -1) {
                class150.method927(field2358[var2], field2358[var3], field2358[var4], field2351[var2], field2351[var3], field2351[var4], field2338[this.field2334[arg0]]);
            } else {
                class150.method934(field2358[var2], field2358[var3], field2358[var4], field2351[var2], field2351[var3], field2351[var4], this.field2334[arg0], this.field2320[arg0], this.field2326[arg0]);
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(Z)Lfd;")
    public final class52 method277(boolean arg0) {
        if (!arg0 && field2340.length < super.field872) {
            field2340 = new byte[super.field872 + 100];
        }
        return this.method716(arg0, field2336, field2340);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "([[IIIIZI)Lfd;")
    public final class52 method271(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method269();
        int var7 = super.field853 + arg1;
        int var8 = super.field854 + arg1;
        int var9 = super.field866 + arg3;
        int var10 = super.field856 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class125 var15;
                if (arg4) {
                    var15 = new class125();
                    var15.field869 = super.field869;
                    var15.field872 = super.field872;
                    var15.field2330 = this.field2330;
                    var15.field862 = super.field862;
                    var15.field863 = super.field863;
                    var15.field2333 = this.field2333;
                    var15.field2328 = this.field2328;
                    var15.field2323 = this.field2323;
                    var15.field2334 = this.field2334;
                    var15.field2320 = this.field2320;
                    var15.field2326 = this.field2326;
                    var15.field2327 = this.field2327;
                    var15.field2322 = this.field2322;
                    var15.field2321 = this.field2321;
                    var15.field2324 = this.field2324;
                    var15.field2332 = this.field2332;
                    var15.field2331 = this.field2331;
                    var15.field2325 = this.field2325;
                    var15.field2329 = this.field2329;
                    var15.field852 = super.field852;
                    var15.field865 = super.field865;
                    var15.field867 = super.field867;
                    var15.field861 = new int[var15.field869];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field869; ++var16) {
                        int var17 = super.field862[var16] + arg1;
                        int var18 = super.field863[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field861[var16] = super.field861[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field869; ++var26) {
                        int var27 = (super.field861[var26] << 16) / super.field73;
                        if (var27 < arg5) {
                            int var28 = super.field862[var26] + arg1;
                            int var29 = super.field863[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field861[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + super.field861[var26];
                        } else {
                            var15.field861[var26] = super.field861[var26];
                        }
                    }
                }
                super.field857 = false;
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIIII)V")
    public final void method278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            this.method269();
            int var9 = class150.field2905;
            int var10 = class150.field2902;
            int var11 = field2355[arg0];
            int var12 = field2361[arg0];
            int var13 = field2355[arg1];
            int var14 = field2361[arg1];
            int var15 = field2355[arg2];
            int var16 = field2361[arg2];
            int var17 = field2355[arg3];
            int var18 = field2361[arg3];
            int var19 = arg5 * var17 + arg6 * var18 >> 16;
            for (int var20 = 0; var20 < super.field869; ++var20) {
                int var21 = super.field862[var20];
                int var22 = super.field861[var20];
                int var23 = super.field863[var20];
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
                field2339[var20] = var31 - var19;
                field2351[var20] = (var27 << 9) / arg7 + var9;
                field2358[var20] = (var30 << 9) / arg7 + var10;
                if (this.field2330 > 0) {
                    field2352[var20] = var27;
                    field2353[var20] = var30;
                    field2359[var20] = var31;
                }
            }
            this.method711(false, false, 0, super.field858, super.field858 << 1);
        } catch (RuntimeException var33) {
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method23(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (!super.field857) {
            this.method269();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = (super.field855 * arg2 + super.field851 * arg1 >> 16) + var11;
        if (var12 > 50) {
            int var13 = (-super.field855 * arg2 + super.field73 * arg1 >> 16) + var11;
            if (var13 < 3500) {
                int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
                int var15 = super.field855 + var14 << 9;
                if (var15 / var12 > class150.field2890) {
                    int var16 = var14 - super.field855 << 9;
                    if (var16 / var12 < class150.field2903) {
                        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
                        int var18 = (super.field855 * arg1 + super.field851 * arg2 >> 16) + var17 << 9;
                        if (var18 / var12 > class150.field2897) {
                            int var19 = (-super.field855 * arg1 + super.field73 * arg2 >> 16) + var17 << 9;
                            if (var19 / var12 < class150.field2891) {
                                boolean var20 = false;
                                boolean var21 = var13 <= 50;
                                boolean var22 = var21 || this.field2330 > 0;
                                int var23 = class150.field2905;
                                int var24 = class150.field2902;
                                int var25 = 0;
                                int var26 = 0;
                                if (arg0 != 0) {
                                    var25 = field2355[arg0];
                                    var26 = field2361[arg0];
                                }
                                boolean var27 = false;
                                if (arg8 > 0 && class52.field868 && var13 > 0) {
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
                                    int var32 = class52.field859 - class150.field2905;
                                    int var33 = class52.field850 - class150.field2902;
                                    if (var32 >= var28 && var32 <= var29 && var33 >= var30 && var33 <= var31) {
                                        int var34 = 999999;
                                        int var35 = -999999;
                                        int var36 = 999999;
                                        int var37 = -999999;
                                        int[] var38 = new int[] { super.field853, super.field854, super.field853, super.field854, super.field853, super.field854, super.field853, super.field854 };
                                        int[] var39 = new int[] { super.field866, super.field866, super.field856, super.field856, super.field866, super.field866, super.field856, super.field856 };
                                        int[] var40 = new int[] { super.field73, super.field73, super.field73, super.field73, super.field851, super.field851, super.field851, super.field851 };
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
                                            if (super.field867) {
                                                class52.field860[class52.field870++] = arg8;
                                            } else {
                                                var27 = true;
                                            }
                                        }
                                    }
                                }
                                for (int var57 = 0; var57 < super.field869; ++var57) {
                                    int var58 = super.field862[var57];
                                    int var59 = super.field861[var57];
                                    int var60 = super.field863[var57];
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
                                    field2339[var57] = var69 - var11;
                                    if (var69 >= 50) {
                                        field2351[var57] = (var65 << 9) / var69 + var23;
                                        field2358[var57] = (var68 << 9) / var69 + var24;
                                    } else {
                                        field2351[var57] = -5000;
                                        var20 = true;
                                    }
                                    if (var22) {
                                        field2352[var57] = var65;
                                        field2353[var57] = var68;
                                        field2359[var57] = var69;
                                    }
                                }
                                try {
                                    this.method711(var20, var27, arg8, var11 - var13, var12 - var13 + 2);
                                } catch (Exception var71) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)V")
    private final void method710(int arg0) {
        int var2 = class150.field2905;
        int var3 = class150.field2902;
        int var4 = 0;
        int var5 = this.field2333[arg0];
        int var6 = this.field2328[arg0];
        int var7 = this.field2323[arg0];
        int var8 = field2359[var5];
        int var9 = field2359[var6];
        int var10 = field2359[var7];
        if (this.field2322 == null) {
            class150.field2901 = 0;
        } else {
            class150.field2901 = this.field2322[arg0] & 255;
        }
        if (var8 >= 50) {
            field2342[var4] = field2351[var5];
            field2345[var4] = field2358[var5];
            field2343[var4++] = this.field2334[arg0];
        } else {
            int var11 = field2352[var5];
            int var12 = field2353[var5];
            int var13 = this.field2334[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field2350[var10 - var8];
                field2342[var4] = (((field2352[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field2345[var4] = (((field2353[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field2343[var4++] = ((this.field2326[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field2350[var9 - var8];
                field2342[var4] = (((field2352[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field2345[var4] = (((field2353[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field2343[var4++] = ((this.field2320[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field2342[var4] = field2351[var6];
            field2345[var4] = field2358[var6];
            field2343[var4++] = this.field2320[arg0];
        } else {
            int var16 = field2352[var6];
            int var17 = field2353[var6];
            int var18 = this.field2320[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field2350[var8 - var9];
                field2342[var4] = (((field2352[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field2345[var4] = (((field2353[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field2343[var4++] = ((this.field2334[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field2350[var10 - var9];
                field2342[var4] = (((field2352[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field2345[var4] = (((field2353[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field2343[var4++] = ((this.field2326[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field2342[var4] = field2351[var7];
            field2345[var4] = field2358[var7];
            field2343[var4++] = this.field2326[arg0];
        } else {
            int var21 = field2352[var7];
            int var22 = field2353[var7];
            int var23 = this.field2326[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field2350[var9 - var10];
                field2342[var4] = (((field2352[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field2345[var4] = (((field2353[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field2343[var4++] = ((this.field2320[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field2350[var8 - var10];
                field2342[var4] = (((field2352[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field2345[var4] = (((field2353[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field2343[var4++] = ((this.field2334[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field2342[0];
        int var27 = field2342[1];
        int var28 = field2342[2];
        int var29 = field2345[0];
        int var30 = field2345[1];
        int var31 = field2345[2];
        class150.field2887 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > class150.field2898 || var27 > class150.field2898 || var28 > class150.field2898) {
                class150.field2887 = true;
            }
            if (this.field2324 != null && this.field2324[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field2321 != null && this.field2321[arg0] != -1) {
                    int var32 = this.field2321[arg0] & 255;
                    var33 = this.field2331[var32];
                    var34 = this.field2325[var32];
                    var35 = this.field2329[var32];
                } else {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                }
                if (this.field2326[arg0] == -1) {
                    class150.method920(var29, var30, var31, var26, var27, var28, this.field2334[arg0], this.field2334[arg0], this.field2334[arg0], field2352[var33], field2352[var34], field2352[var35], field2353[var33], field2353[var34], field2353[var35], field2359[var33], field2359[var34], field2359[var35], this.field2324[arg0]);
                } else {
                    class150.method920(var29, var30, var31, var26, var27, var28, field2343[0], field2343[1], field2343[2], field2352[var33], field2352[var34], field2352[var35], field2353[var33], field2353[var34], field2353[var35], field2359[var33], field2359[var34], field2359[var35], this.field2324[arg0]);
                }
            } else if (this.field2326[arg0] == -1) {
                class150.method927(var29, var30, var31, var26, var27, var28, field2338[this.field2334[arg0]]);
            } else {
                class150.method934(var29, var30, var31, var26, var27, var28, field2343[0], field2343[1], field2343[2]);
            }
        }
        if (var4 == 4) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > class150.field2898 || var27 > class150.field2898 || var28 > class150.field2898 || field2342[3] < 0 || field2342[3] > class150.field2898) {
                class150.field2887 = true;
            }
            if (this.field2324 == null || this.field2324[arg0] == -1) {
                if (this.field2326[arg0] == -1) {
                    int var41 = field2338[this.field2334[arg0]];
                    class150.method927(var29, var30, var31, var26, var27, var28, var41);
                    class150.method927(var29, var31, field2345[3], var26, var28, field2342[3], var41);
                    return;
                }
                class150.method934(var29, var30, var31, var26, var27, var28, field2343[0], field2343[1], field2343[2]);
                class150.method934(var29, var31, field2345[3], var26, var28, field2342[3], field2343[0], field2343[2], field2343[3]);
                return;
            }
            int var37;
            int var38;
            int var39;
            if (this.field2321 != null && this.field2321[arg0] != -1) {
                int var36 = this.field2321[arg0] & 255;
                var37 = this.field2331[var36];
                var38 = this.field2325[var36];
                var39 = this.field2329[var36];
            } else {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            }
            short var40 = this.field2324[arg0];
            if (this.field2326[arg0] == -1) {
                class150.method920(var29, var30, var31, var26, var27, var28, this.field2334[arg0], this.field2334[arg0], this.field2334[arg0], field2352[var37], field2352[var38], field2352[var39], field2353[var37], field2353[var38], field2353[var39], field2359[var37], field2359[var38], field2359[var39], var40);
                class150.method920(var29, var31, field2345[3], var26, var28, field2342[3], this.field2334[arg0], this.field2334[arg0], this.field2334[arg0], field2352[var37], field2352[var38], field2352[var39], field2353[var37], field2353[var38], field2353[var39], field2359[var37], field2359[var38], field2359[var39], var40);
                return;
            }
            class150.method920(var29, var30, var31, var26, var27, var28, field2343[0], field2343[1], field2343[2], field2352[var37], field2352[var38], field2352[var39], field2353[var37], field2353[var38], field2353[var39], field2359[var37], field2359[var38], field2359[var39], var40);
            class150.method920(var29, var31, field2345[3], var26, var28, field2342[3], field2343[0], field2343[2], field2343[3], field2352[var37], field2352[var38], field2352[var39], field2353[var37], field2353[var38], field2353[var39], field2359[var37], field2359[var38], field2359[var39], var40);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZZIII)V")
    private final void method711(boolean arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg4 < 1600) {
            for (int var6 = 0; var6 < arg4; ++var6) {
                field2363[var6] = 0;
            }
            for (int var7 = 0; var7 < super.field872; ++var7) {
                if (this.field2326[var7] != -2) {
                    int var32 = this.field2333[var7];
                    int var33 = this.field2328[var7];
                    int var34 = this.field2323[var7];
                    int var35 = field2351[var32];
                    int var36 = field2351[var33];
                    int var37 = field2351[var34];
                    if (!arg0 || var35 != -5000 && var36 != -5000 && var37 != -5000) {
                        if (arg1 && this.method715(class52.field859, class52.field850, field2358[var32], field2358[var33], field2358[var34], var35, var36, var37)) {
                            class52.field860[class52.field870++] = arg2;
                            arg1 = false;
                        }
                        if ((field2358[var34] - field2358[var33]) * (var35 - var36) - (field2358[var32] - field2358[var33]) * (var37 - var36) > 0) {
                            field2346[var7] = false;
                            if (var35 >= 0 && var36 >= 0 && var37 >= 0 && var35 <= class150.field2898 && var36 <= class150.field2898 && var37 <= class150.field2898) {
                                field2349[var7] = false;
                            } else {
                                field2349[var7] = true;
                            }
                            int var57 = (field2339[var32] + field2339[var33] + field2339[var34]) / 3 + arg3;
                            field2362[var57][field2363[var57]++] = var7;
                        }
                    } else {
                        int var38 = field2352[var32];
                        int var39 = field2352[var33];
                        int var40 = field2352[var34];
                        int var41 = field2353[var32];
                        int var42 = field2353[var33];
                        int var43 = field2353[var34];
                        int var44 = field2359[var32];
                        int var45 = field2359[var33];
                        int var46 = field2359[var34];
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
                            field2346[var7] = true;
                            int var56 = (field2339[var32] + field2339[var33] + field2339[var34]) / 3 + arg3;
                            field2362[var56][field2363[var56]++] = var7;
                        }
                    }
                }
            }
            if (this.field2327 == null) {
                for (int var8 = arg4 - 1; var8 >= 0; --var8) {
                    int var9 = field2363[var8];
                    if (var9 > 0) {
                        int[] var10 = field2362[var8];
                        for (int var11 = 0; var11 < var9; ++var11) {
                            this.method709(var10[var11]);
                        }
                    }
                }
            } else {
                for (int var12 = 0; var12 < 12; ++var12) {
                    field2360[var12] = 0;
                    field2347[var12] = 0;
                }
                for (int var13 = arg4 - 1; var13 >= 0; --var13) {
                    int var26 = field2363[var13];
                    if (var26 > 0) {
                        int[] var27 = field2362[var13];
                        for (int var28 = 0; var28 < var26; ++var28) {
                            int var29 = var27[var28];
                            byte var30 = this.field2327[var29];
                            int var31 = field2360[var30]++;
                            field2344[var30][var31] = var29;
                            if (var30 < 10) {
                                field2347[var30] += var13;
                            } else if (var30 == 10) {
                                field2354[var31] = var13;
                            } else {
                                field2357[var31] = var13;
                            }
                        }
                    }
                }
                int var14 = 0;
                if (field2360[1] > 0 || field2360[2] > 0) {
                    var14 = (field2347[1] + field2347[2]) / (field2360[1] + field2360[2]);
                }
                int var15 = 0;
                if (field2360[3] > 0 || field2360[4] > 0) {
                    var15 = (field2347[3] + field2347[4]) / (field2360[3] + field2360[4]);
                }
                int var16 = 0;
                if (field2360[6] > 0 || field2360[8] > 0) {
                    var16 = (field2347[6] + field2347[8]) / (field2360[6] + field2360[8]);
                }
                int var17 = 0;
                int var18 = field2360[10];
                int[] var19 = field2344[10];
                int[] var20 = field2354;
                if (var17 == var18) {
                    var17 = 0;
                    var18 = field2360[11];
                    var19 = field2344[11];
                    var20 = field2357;
                }
                int var21;
                if (var17 < var18) {
                    var21 = var20[var17];
                } else {
                    var21 = -1000;
                }
                for (int var22 = 0; var22 < 10; ++var22) {
                    while (var22 == 0 && var21 > var14) {
                        this.method709(var19[var17++]);
                        if (var17 == var18 && field2344[11] != var19) {
                            var17 = 0;
                            var18 = field2360[11];
                            var19 = field2344[11];
                            var20 = field2357;
                        }
                        if (var17 < var18) {
                            var21 = var20[var17];
                        } else {
                            var21 = -1000;
                        }
                    }
                    while (var22 == 3 && var21 > var15) {
                        this.method709(var19[var17++]);
                        if (var17 == var18 && field2344[11] != var19) {
                            var17 = 0;
                            var18 = field2360[11];
                            var19 = field2344[11];
                            var20 = field2357;
                        }
                        if (var17 < var18) {
                            var21 = var20[var17];
                        } else {
                            var21 = -1000;
                        }
                    }
                    while (var22 == 5 && var21 > var16) {
                        this.method709(var19[var17++]);
                        if (var17 == var18 && field2344[11] != var19) {
                            var17 = 0;
                            var18 = field2360[11];
                            var19 = field2344[11];
                            var20 = field2357;
                        }
                        if (var17 < var18) {
                            var21 = var20[var17];
                        } else {
                            var21 = -1000;
                        }
                    }
                    int var23 = field2360[var22];
                    int[] var24 = field2344[var22];
                    for (int var25 = 0; var25 < var23; ++var25) {
                        this.method709(var24[var25]);
                    }
                }
                while (var21 != -1000) {
                    this.method709(var19[var17++]);
                    if (var17 == var18 && field2344[11] != var19) {
                        var17 = 0;
                        var19 = field2344[11];
                        var18 = field2360[11];
                        var20 = field2357;
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

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lfd;)Lfd;")
    public final class52 method712(class52 arg0) {
        return new class125(new class125[] { this, (class125) arg0 }, 2);
    }

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "()V")
    public static void method713() {
        field2335 = null;
        field2337 = null;
        field2336 = null;
        field2340 = null;
        field2349 = null;
        field2346 = null;
        field2351 = null;
        field2358 = null;
        field2339 = null;
        field2352 = null;
        field2353 = null;
        field2359 = null;
        field2363 = null;
        field2362 = null;
        field2360 = null;
        field2344 = null;
        field2354 = null;
        field2357 = null;
        field2347 = null;
        field2342 = null;
        field2345 = null;
        field2343 = null;
        field2355 = null;
        field2361 = null;
        field2338 = null;
        field2350 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Leg;I)V")
    public final void method279(class46 arg0, int arg1) {
        if (super.field852 != null) {
            if (arg1 != -1) {
                class163 var3 = arg0.field729[arg1];
                class96 var4 = var3.field3234;
                field2341 = 0;
                field2348 = 0;
                field2356 = 0;
                for (int var5 = 0; var5 < var3.field3241; ++var5) {
                    int var6 = var3.field3243[var5];
                    this.method718(var4.field1785[var6], var4.field1780[var6], var3.field3237[var5], var3.field3242[var5], var3.field3240[var5]);
                }
                super.field857 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "(I)I")
    private static final int method714(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(IIIIIIII)Z")
    private final boolean method715(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZLng;[B)Lng;")
    private final class125 method716(boolean arg0, class125 arg1, byte[] arg2) {
        arg1.field869 = super.field869;
        arg1.field872 = super.field872;
        arg1.field2330 = this.field2330;
        if (arg1.field862 == null || arg1.field862.length < super.field869) {
            arg1.field862 = new int[super.field869 + 100];
            arg1.field861 = new int[super.field869 + 100];
            arg1.field863 = new int[super.field869 + 100];
        }
        for (int var4 = 0; var4 < super.field869; ++var4) {
            arg1.field862[var4] = super.field862[var4];
            arg1.field861[var4] = super.field861[var4];
            arg1.field863[var4] = super.field863[var4];
        }
        if (arg0) {
            arg1.field2322 = this.field2322;
        } else {
            arg1.field2322 = arg2;
            if (this.field2322 == null) {
                for (int var5 = 0; var5 < super.field872; ++var5) {
                    arg1.field2322[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < super.field872; ++var6) {
                    arg1.field2322[var6] = this.field2322[var6];
                }
            }
        }
        arg1.field2333 = this.field2333;
        arg1.field2328 = this.field2328;
        arg1.field2323 = this.field2323;
        arg1.field2334 = this.field2334;
        arg1.field2320 = this.field2320;
        arg1.field2326 = this.field2326;
        arg1.field2327 = this.field2327;
        arg1.field2321 = this.field2321;
        arg1.field2324 = this.field2324;
        arg1.field2332 = this.field2332;
        arg1.field2331 = this.field2331;
        arg1.field2325 = this.field2325;
        arg1.field2329 = this.field2329;
        arg1.field852 = super.field852;
        arg1.field865 = super.field865;
        arg1.field867 = super.field867;
        arg1.field857 = false;
        return arg1;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Leg;ILeg;I[I)V")
    public final void method282(class46 arg0, int arg1, class46 arg2, int arg3, int[] arg4) {
        if (arg1 != -1) {
            if (arg4 != null && arg3 != -1) {
                class163 var6 = arg0.field729[arg1];
                class163 var7 = arg2.field729[arg3];
                class96 var8 = var6.field3234;
                field2341 = 0;
                field2348 = 0;
                field2356 = 0;
                byte var9 = 0;
                int var17 = var9 + 1;
                int var10 = arg4[var9];
                for (int var11 = 0; var11 < var6.field3241; ++var11) {
                    int var16 = var6.field3243[var11];
                    while (var16 > var10) {
                        var10 = arg4[var17++];
                    }
                    if (var10 != var16 || var8.field1785[var16] == 0) {
                        this.method718(var8.field1785[var16], var8.field1780[var16], var6.field3237[var11], var6.field3242[var11], var6.field3240[var11]);
                    }
                }
                field2341 = 0;
                field2348 = 0;
                field2356 = 0;
                byte var12 = 0;
                int var18 = var12 + 1;
                int var13 = arg4[var12];
                for (int var14 = 0; var14 < var7.field3241; ++var14) {
                    int var15 = var7.field3243[var14];
                    while (var15 > var13) {
                        var13 = arg4[var18++];
                    }
                    if (var13 == var15 || var8.field1785[var15] == 0) {
                        this.method718(var8.field1785[var15], var8.field1780[var15], var7.field3237[var14], var7.field3242[var14], var7.field3240[var14]);
                    }
                }
                super.field857 = false;
            } else {
                this.method279(arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)I")
    private static final int method717(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIII)V")
    public final void method272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            this.method269();
            int var8 = class150.field2905;
            int var9 = class150.field2902;
            int var10 = field2355[arg0];
            int var11 = field2361[arg0];
            int var12 = field2355[arg1];
            int var13 = field2361[arg1];
            int var14 = field2355[arg2];
            int var15 = field2361[arg2];
            int var16 = field2355[arg3];
            int var17 = field2361[arg3];
            int var18 = arg5 * var16 + arg6 * var17 >> 16;
            for (int var19 = 0; var19 < super.field869; ++var19) {
                int var20 = super.field862[var19];
                int var21 = super.field861[var19];
                int var22 = super.field863[var19];
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
                field2339[var19] = var30 - var18;
                field2351[var19] = (var26 << 9) / var30 + var8;
                field2358[var19] = (var29 << 9) / var30 + var9;
                if (this.field2330 > 0) {
                    field2352[var19] = var26;
                    field2353[var19] = var29;
                    field2359[var19] = var30;
                }
            }
            this.method711(false, false, 0, super.field858, super.field858 << 1);
        } catch (RuntimeException var32) {
        }
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(Z)Lfd;")
    public final class52 method273(boolean arg0) {
        if (!arg0 && field2337.length < super.field872) {
            field2337 = new byte[super.field872 + 100];
        }
        return this.method716(arg0, field2335, field2337);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I[IIII)V")
    private final void method718(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            field2341 = 0;
            field2348 = 0;
            field2356 = 0;
            for (int var8 = 0; var8 < var6; ++var8) {
                int var9 = arg1[var8];
                if (var9 < super.field852.length) {
                    int[] var10 = super.field852[var9];
                    for (int var11 = 0; var11 < var10.length; ++var11) {
                        int var12 = var10[var11];
                        field2341 += super.field862[var12];
                        field2348 += super.field861[var12];
                        field2356 += super.field863[var12];
                        ++var7;
                    }
                }
            }
            if (var7 > 0) {
                field2341 = field2341 / var7 + arg2;
                field2348 = field2348 / var7 + arg3;
                field2356 = field2356 / var7 + arg4;
            } else {
                field2341 = arg2;
                field2348 = arg3;
                field2356 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; ++var13) {
                int var14 = arg1[var13];
                if (var14 < super.field852.length) {
                    int[] var15 = super.field852[var14];
                    for (int var16 = 0; var16 < var15.length; ++var16) {
                        int var17 = var15[var16];
                        super.field862[var17] += arg2;
                        super.field861[var17] += arg3;
                        super.field863[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; ++var18) {
                int var19 = arg1[var18];
                if (var19 < super.field852.length) {
                    int[] var20 = super.field852[var19];
                    for (int var21 = 0; var21 < var20.length; ++var21) {
                        int var22 = var20[var21];
                        super.field862[var22] -= field2341;
                        super.field861[var22] -= field2348;
                        super.field863[var22] -= field2356;
                        int var23 = (arg2 & 255) * 8;
                        int var24 = (arg3 & 255) * 8;
                        int var25 = (arg4 & 255) * 8;
                        if (var25 != 0) {
                            int var26 = field2355[var25];
                            int var27 = field2361[var25];
                            int var28 = super.field862[var22] * var27 + super.field861[var22] * var26 + 32767 >> 16;
                            super.field861[var22] = super.field861[var22] * var27 - super.field862[var22] * var26 + 32767 >> 16;
                            super.field862[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field2355[var23];
                            int var30 = field2361[var23];
                            int var31 = super.field861[var22] * var30 - super.field863[var22] * var29 + 32767 >> 16;
                            super.field863[var22] = super.field863[var22] * var30 + super.field861[var22] * var29 + 32767 >> 16;
                            super.field861[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field2355[var24];
                            int var33 = field2361[var24];
                            int var34 = super.field863[var22] * var32 + super.field862[var22] * var33 + 32767 >> 16;
                            super.field863[var22] = super.field863[var22] * var33 - super.field862[var22] * var32 + 32767 >> 16;
                            super.field862[var22] = var34;
                        }
                        super.field862[var22] += field2341;
                        super.field861[var22] += field2348;
                        super.field863[var22] += field2356;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; ++var35) {
                int var36 = arg1[var35];
                if (var36 < super.field852.length) {
                    int[] var37 = super.field852[var36];
                    for (int var38 = 0; var38 < var37.length; ++var38) {
                        int var39 = var37[var38];
                        super.field862[var39] -= field2341;
                        super.field861[var39] -= field2348;
                        super.field863[var39] -= field2356;
                        super.field862[var39] = super.field862[var39] * arg2 / 128;
                        super.field861[var39] = super.field861[var39] * arg3 / 128;
                        super.field863[var39] = super.field863[var39] * arg4 / 128;
                        super.field862[var39] += field2341;
                        super.field861[var39] += field2348;
                        super.field863[var39] += field2356;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (super.field865 != null && this.field2322 != null) {
                for (int var40 = 0; var40 < var6; ++var40) {
                    int var41 = arg1[var40];
                    if (var41 < super.field865.length) {
                        int[] var42 = super.field865[var41];
                        for (int var43 = 0; var43 < var42.length; ++var43) {
                            int var44 = var42[var43];
                            int var45 = (this.field2322[var44] & 255) + arg2 * 8;
                            if (var45 < 0) {
                                var45 = 0;
                            } else if (var45 > 255) {
                                var45 = 255;
                            }
                            this.field2322[var44] = (byte) var45;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
    public class125() {
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Loe;IIIII)V")
    public class125(class132 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.method787();
        arg0.method776();
        super.field869 = arg0.field2499;
        super.field862 = arg0.field2493;
        super.field861 = arg0.field2508;
        super.field863 = arg0.field2523;
        super.field872 = arg0.field2503;
        this.field2333 = arg0.field2495;
        this.field2328 = arg0.field2497;
        this.field2323 = arg0.field2500;
        this.field2327 = arg0.field2534;
        this.field2322 = arg0.field2498;
        this.field2332 = arg0.field2514;
        super.field852 = arg0.field2527;
        super.field865 = arg0.field2526;
        int var7 = (int) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        int var8 = arg2 * var7 >> 8;
        this.field2334 = new int[super.field872];
        this.field2320 = new int[super.field872];
        this.field2326 = new int[super.field872];
        if (arg0.field2521 != null) {
            this.field2324 = new short[super.field872];
            for (int var9 = 0; var9 < super.field872; ++var9) {
                short var10 = arg0.field2521[var9];
                if (var10 != -1 && class150.field2894.method1105(-25072, var10)) {
                    this.field2324[var9] = var10;
                } else {
                    this.field2324[var9] = -1;
                }
            }
        } else {
            this.field2324 = null;
        }
        if (arg0.field2516 > 0 && arg0.field2512 != null) {
            int[] var11 = new int[arg0.field2516];
            for (int var12 = 0; var12 < super.field872; ++var12) {
                if (arg0.field2512[var12] != -1) {
                    ++var11[arg0.field2512[var12] & 255];
                }
            }
            this.field2330 = 0;
            for (int var13 = 0; var13 < arg0.field2516; ++var13) {
                if (var11[var13] > 0 && arg0.field2517[var13] == 0) {
                    ++this.field2330;
                }
            }
            this.field2331 = new int[this.field2330];
            this.field2325 = new int[this.field2330];
            this.field2329 = new int[this.field2330];
            int var14 = 0;
            for (int var15 = 0; var15 < arg0.field2516; ++var15) {
                if (var11[var15] > 0 && arg0.field2517[var15] == 0) {
                    this.field2331[var14] = arg0.field2518[var15] & 65535;
                    this.field2325[var14] = arg0.field2505[var15] & 65535;
                    this.field2329[var14] = arg0.field2519[var15] & 65535;
                    var11[var15] = var14++;
                } else {
                    var11[var15] = -1;
                }
            }
            this.field2321 = new byte[super.field872];
            for (int var16 = 0; var16 < super.field872; ++var16) {
                if (arg0.field2512[var16] != -1) {
                    this.field2321[var16] = (byte) var11[arg0.field2512[var16] & 255];
                    if (this.field2321[var16] == -1 && this.field2324 != null) {
                        this.field2324[var16] = -1;
                    }
                } else {
                    this.field2321[var16] = -1;
                }
            }
        }
        for (int var17 = 0; var17 < super.field872; ++var17) {
            byte var18;
            if (arg0.field2525 == null) {
                var18 = 0;
            } else {
                var18 = arg0.field2525[var17];
            }
            byte var19;
            if (arg0.field2498 == null) {
                var19 = 0;
            } else {
                var19 = arg0.field2498[var17];
            }
            short var20;
            if (this.field2324 == null) {
                var20 = -1;
            } else {
                var20 = this.field2324[var17];
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
                        class79 var28 = arg0.field2506[var17];
                        int var29 = (var28.field1410 * arg5 + var28.field1411 * arg4 + var28.field1407 * arg3) / (var8 / 2 + var8) + arg1;
                        this.field2334[var17] = method717(arg0.field2511[var17] & 65535, var29);
                        this.field2326[var17] = -1;
                    } else if (var18 == 3) {
                        this.field2334[var17] = 128;
                        this.field2326[var17] = -1;
                    } else {
                        this.field2326[var17] = -2;
                    }
                } else {
                    int var21 = arg0.field2511[var17] & 65535;
                    class180 var22;
                    if (arg0.field2504 != null && arg0.field2504[this.field2333[var17]] != null) {
                        var22 = arg0.field2504[this.field2333[var17]];
                    } else {
                        var22 = arg0.field2510[this.field2333[var17]];
                    }
                    int var23 = (var22.field3577 * arg5 + var22.field3576 * arg3 + var22.field3574 * arg4) / (var22.field3570 * var8) + arg1;
                    this.field2334[var17] = method717(var21, var23);
                    class180 var24;
                    if (arg0.field2504 != null && arg0.field2504[this.field2328[var17]] != null) {
                        var24 = arg0.field2504[this.field2328[var17]];
                    } else {
                        var24 = arg0.field2510[this.field2328[var17]];
                    }
                    int var25 = (var24.field3577 * arg5 + var24.field3576 * arg3 + var24.field3574 * arg4) / (var24.field3570 * var8) + arg1;
                    this.field2320[var17] = method717(var21, var25);
                    class180 var26;
                    if (arg0.field2504 != null && arg0.field2504[this.field2323[var17]] != null) {
                        var26 = arg0.field2504[this.field2323[var17]];
                    } else {
                        var26 = arg0.field2510[this.field2323[var17]];
                    }
                    int var27 = (var26.field3577 * arg5 + var26.field3576 * arg3 + var26.field3574 * arg4) / (var26.field3570 * var8) + arg1;
                    this.field2326[var17] = method717(var21, var27);
                }
            } else if (var18 != 0) {
                if (var18 == 1) {
                    class79 var36 = arg0.field2506[var17];
                    int var37 = (var36.field1410 * arg5 + var36.field1411 * arg4 + var36.field1407 * arg3) / (var8 / 2 + var8) + arg1;
                    this.field2334[var17] = method714(var37);
                    this.field2326[var17] = -1;
                } else {
                    this.field2326[var17] = -2;
                }
            } else {
                class180 var30;
                if (arg0.field2504 != null && arg0.field2504[this.field2333[var17]] != null) {
                    var30 = arg0.field2504[this.field2333[var17]];
                } else {
                    var30 = arg0.field2510[this.field2333[var17]];
                }
                int var31 = (var30.field3577 * arg5 + var30.field3576 * arg3 + var30.field3574 * arg4) / (var30.field3570 * var8) + arg1;
                this.field2334[var17] = method714(var31);
                class180 var32;
                if (arg0.field2504 != null && arg0.field2504[this.field2328[var17]] != null) {
                    var32 = arg0.field2504[this.field2328[var17]];
                } else {
                    var32 = arg0.field2510[this.field2328[var17]];
                }
                int var33 = (var32.field3577 * arg5 + var32.field3576 * arg3 + var32.field3574 * arg4) / (var32.field3570 * var8) + arg1;
                this.field2320[var17] = method714(var33);
                class180 var34;
                if (arg0.field2504 != null && arg0.field2504[this.field2323[var17]] != null) {
                    var34 = arg0.field2504[this.field2323[var17]];
                } else {
                    var34 = arg0.field2510[this.field2323[var17]];
                }
                int var35 = (var34.field3577 * arg5 + var34.field3576 * arg3 + var34.field3574 * arg4) / (var34.field3570 * var8) + arg1;
                this.field2326[var17] = method714(var35);
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "([Lng;I)V")
    private class125(class125[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        super.field869 = 0;
        super.field872 = 0;
        this.field2330 = 0;
        this.field2332 = -1;
        for (int var7 = 0; var7 < arg1; ++var7) {
            class125 var13 = arg0[var7];
            if (var13 != null) {
                super.field869 += var13.field869;
                super.field872 += var13.field872;
                this.field2330 += var13.field2330;
                if (var13.field2327 != null) {
                    var3 = true;
                } else {
                    if (this.field2332 == -1) {
                        this.field2332 = var13.field2332;
                    }
                    if (this.field2332 != var13.field2332) {
                        var3 = true;
                    }
                }
                var4 |= var13.field2322 != null;
                var5 |= var13.field2324 != null;
                var6 |= var13.field2321 != null;
            }
        }
        super.field862 = new int[super.field869];
        super.field861 = new int[super.field869];
        super.field863 = new int[super.field869];
        this.field2333 = new int[super.field872];
        this.field2328 = new int[super.field872];
        this.field2323 = new int[super.field872];
        this.field2334 = new int[super.field872];
        this.field2320 = new int[super.field872];
        this.field2326 = new int[super.field872];
        if (var3) {
            this.field2327 = new byte[super.field872];
        }
        if (var4) {
            this.field2322 = new byte[super.field872];
        }
        if (var5) {
            this.field2324 = new short[super.field872];
        }
        if (var6) {
            this.field2321 = new byte[super.field872];
        }
        if (this.field2330 > 0) {
            this.field2331 = new int[this.field2330];
            this.field2325 = new int[this.field2330];
            this.field2329 = new int[this.field2330];
        }
        super.field869 = 0;
        super.field872 = 0;
        this.field2330 = 0;
        for (int var8 = 0; var8 < arg1; ++var8) {
            class125 var9 = arg0[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < var9.field872; ++var10) {
                    this.field2333[super.field872] = var9.field2333[var10] + super.field869;
                    this.field2328[super.field872] = var9.field2328[var10] + super.field869;
                    this.field2323[super.field872] = var9.field2323[var10] + super.field869;
                    this.field2334[super.field872] = var9.field2334[var10];
                    this.field2320[super.field872] = var9.field2320[var10];
                    this.field2326[super.field872] = var9.field2326[var10];
                    if (var3) {
                        if (var9.field2327 != null) {
                            this.field2327[super.field872] = var9.field2327[var10];
                        } else {
                            this.field2327[super.field872] = var9.field2332;
                        }
                    }
                    if (var4 && var9.field2322 != null) {
                        this.field2322[super.field872] = var9.field2322[var10];
                    }
                    if (var5) {
                        if (var9.field2324 != null) {
                            this.field2324[super.field872] = var9.field2324[var10];
                        } else {
                            this.field2324[super.field872] = -1;
                        }
                    }
                    if (var6) {
                        if (var9.field2321 != null && var9.field2321[var10] != -1) {
                            this.field2321[super.field872] = (byte) (var9.field2321[var10] + this.field2330);
                        } else {
                            this.field2321[super.field872] = -1;
                        }
                    }
                    ++super.field872;
                }
                for (int var11 = 0; var11 < var9.field2330; ++var11) {
                    this.field2331[this.field2330] = var9.field2331[var11] + super.field869;
                    this.field2325[this.field2330] = var9.field2325[var11] + super.field869;
                    this.field2329[this.field2330] = var9.field2329[var11] + super.field869;
                    ++this.field2330;
                }
                for (int var12 = 0; var12 < var9.field869; ++var12) {
                    super.field862[super.field869] = var9.field862[var12];
                    super.field861[super.field869] = var9.field861[var12];
                    super.field863[super.field869] = var9.field863[var12];
                    ++super.field869;
                }
            }
        }
    }
}
