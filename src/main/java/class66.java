import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gf")
public class class66 extends class189 {

    @OriginalMember(owner = "gf", name = "Kb", descriptor = "B")
    private byte field1265 = 0;

    @OriginalMember(owner = "gf", name = "Mb", descriptor = "I")
    private int field1267 = 0;

    @OriginalMember(owner = "gf", name = "Db", descriptor = "[I")
    private int[] field1258;

    @OriginalMember(owner = "gf", name = "Ib", descriptor = "[I")
    private int[] field1263;

    @OriginalMember(owner = "gf", name = "Gb", descriptor = "[I")
    private int[] field1261;

    @OriginalMember(owner = "gf", name = "Hb", descriptor = "[B")
    private byte[] field1262;

    @OriginalMember(owner = "gf", name = "Bb", descriptor = "[B")
    private byte[] field1256;

    @OriginalMember(owner = "gf", name = "Eb", descriptor = "[I")
    private int[] field1259;

    @OriginalMember(owner = "gf", name = "Jb", descriptor = "[I")
    private int[] field1264;

    @OriginalMember(owner = "gf", name = "yb", descriptor = "[I")
    private int[] field1253;

    @OriginalMember(owner = "gf", name = "zb", descriptor = "[S")
    private short[] field1254;

    @OriginalMember(owner = "gf", name = "xb", descriptor = "[I")
    private int[] field1252;

    @OriginalMember(owner = "gf", name = "Cb", descriptor = "[I")
    private int[] field1257;

    @OriginalMember(owner = "gf", name = "Fb", descriptor = "[I")
    private int[] field1260;

    @OriginalMember(owner = "gf", name = "Lb", descriptor = "[B")
    private byte[] field1266;

    @OriginalMember(owner = "gf", name = "Ab", descriptor = "Lgf;")
    private static class66 field1255 = new class66();

    @OriginalMember(owner = "gf", name = "Nb", descriptor = "[B")
    private static byte[] field1268 = new byte[1];

    @OriginalMember(owner = "gf", name = "Ob", descriptor = "Lgf;")
    private static class66 field1269 = new class66();

    @OriginalMember(owner = "gf", name = "Rb", descriptor = "[I")
    private static int[] field1272 = new int[12];

    @OriginalMember(owner = "gf", name = "Sb", descriptor = "[I")
    private static int[] field1273 = new int[10];

    @OriginalMember(owner = "gf", name = "Pb", descriptor = "[I")
    private static int[] field1270 = new int[2000];

    @OriginalMember(owner = "gf", name = "Qb", descriptor = "[I")
    private static int[] field1271 = new int[4096];

    @OriginalMember(owner = "gf", name = "Xb", descriptor = "[I")
    private static int[] field1278 = new int[4096];

    @OriginalMember(owner = "gf", name = "Wb", descriptor = "[I")
    private static int[] field1277 = class124.field2388;

    @OriginalMember(owner = "gf", name = "Tb", descriptor = "[I")
    private static int[] field1274 = class124.field2381;

    @OriginalMember(owner = "gf", name = "Vb", descriptor = "[Z")
    private static boolean[] field1276 = new boolean[4096];

    @OriginalMember(owner = "gf", name = "ac", descriptor = "[I")
    private static int[] field1281 = new int[12];

    @OriginalMember(owner = "gf", name = "Yb", descriptor = "[I")
    private static int[] field1279 = new int[1600];

    @OriginalMember(owner = "gf", name = "hc", descriptor = "[[I")
    private static int[][] field1288 = new int[1600][512];

    @OriginalMember(owner = "gf", name = "bc", descriptor = "[I")
    private static int[] field1282 = class124.field2387;

    @OriginalMember(owner = "gf", name = "cc", descriptor = "[I")
    private static int[] field1283 = new int[4096];

    @OriginalMember(owner = "gf", name = "dc", descriptor = "[I")
    private static int[] field1284 = new int[10];

    @OriginalMember(owner = "gf", name = "gc", descriptor = "[B")
    private static byte[] field1287 = new byte[1];

    @OriginalMember(owner = "gf", name = "fc", descriptor = "[[I")
    private static int[][] field1286 = new int[12][2000];

    @OriginalMember(owner = "gf", name = "kc", descriptor = "[I")
    private static int[] field1291 = new int[2000];

    @OriginalMember(owner = "gf", name = "jc", descriptor = "[I")
    private static int[] field1290 = class124.field2383;

    @OriginalMember(owner = "gf", name = "nc", descriptor = "[I")
    private static int[] field1294 = new int[4096];

    @OriginalMember(owner = "gf", name = "ec", descriptor = "[I")
    private static int[] field1285 = new int[10];

    @OriginalMember(owner = "gf", name = "lc", descriptor = "[I")
    private static int[] field1292 = new int[4096];

    @OriginalMember(owner = "gf", name = "mc", descriptor = "[Z")
    private static boolean[] field1293 = new boolean[4096];

    @OriginalMember(owner = "gf", name = "oc", descriptor = "[I")
    private static int[] field1295 = new int[4096];

    @OriginalMember(owner = "gf", name = "Ub", descriptor = "I")
    private static int field1275;

    @OriginalMember(owner = "gf", name = "Zb", descriptor = "I")
    private static int field1280;

    @OriginalMember(owner = "gf", name = "ic", descriptor = "I")
    private static int field1289;

    @OriginalMember(owner = "gf", name = "a", descriptor = "(II)I")
    private static final int method419(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "gf", name = "g", descriptor = "()V")
    public static void method420() {
        field1255 = null;
        field1268 = null;
        field1269 = null;
        field1287 = null;
        field1293 = null;
        field1276 = null;
        field1295 = null;
        field1278 = null;
        field1292 = null;
        field1294 = null;
        field1283 = null;
        field1271 = null;
        field1279 = null;
        field1288 = null;
        field1281 = null;
        field1286 = null;
        field1270 = null;
        field1291 = null;
        field1272 = null;
        field1285 = null;
        field1284 = null;
        field1273 = null;
        field1290 = null;
        field1282 = null;
        field1274 = null;
        field1277 = null;
    }

    @OriginalMember(owner = "gf", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method421(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        if (!super.field3634) {
            this.method1274();
        }
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = (super.field3636 * arg1 + super.field3635 * arg2 >> 16) + var12;
        if (var13 > 50) {
            int var14 = (-super.field3635 * arg2 + super.field1945 * arg1 >> 16) + var12;
            if (var14 < 3500) {
                int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
                int var16 = super.field3635 + var15 << 9;
                if (var16 / var13 > class124.field2393) {
                    int var17 = var15 - super.field3635 << 9;
                    if (var17 / var13 < class124.field2386) {
                        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
                        int var19 = (super.field3636 * arg2 + super.field3635 * arg1 >> 16) + var18 << 9;
                        if (var19 / var13 > class124.field2390) {
                            int var20 = (-super.field3635 * arg1 + super.field1945 * arg2 >> 16) + var18 << 9;
                            if (var20 / var13 < class124.field2380) {
                                boolean var21 = false;
                                boolean var22 = var14 <= 50;
                                boolean var23 = var22 || this.field1267 > 0;
                                int var24 = class124.field2375;
                                int var25 = class124.field2382;
                                int var26 = 0;
                                int var27 = 0;
                                if (arg0 != 0) {
                                    var26 = field1290[arg0];
                                    var27 = field1282[arg0];
                                }
                                boolean var28 = false;
                                if (arg8 > 0L && class189.field3631 && var14 > 0) {
                                    int var29;
                                    int var30;
                                    if (var15 > 0) {
                                        var29 = var17 / var13;
                                        var30 = var16 / var14;
                                    } else {
                                        var29 = var17 / var14;
                                        var30 = var16 / var13;
                                    }
                                    int var31;
                                    int var32;
                                    if (var18 > 0) {
                                        var31 = var20 / var13;
                                        var32 = var19 / var14;
                                    } else {
                                        var31 = var20 / var14;
                                        var32 = var19 / var13;
                                    }
                                    int var33 = class189.field3640 - class124.field2375;
                                    int var34 = class189.field3638 - class124.field2382;
                                    if (var33 >= var29 && var33 <= var30 && var34 >= var31 && var34 <= var32) {
                                        int var35 = 999999;
                                        int var36 = -999999;
                                        int var37 = 999999;
                                        int var38 = -999999;
                                        int[] var39 = new int[] { super.field3637, super.field3620, super.field3637, super.field3620, super.field3637, super.field3620, super.field3637, super.field3620 };
                                        int[] var40 = new int[] { super.field3627, super.field3627, super.field3626, super.field3626, super.field3627, super.field3627, super.field3626, super.field3626 };
                                        int[] var41 = new int[] { super.field1945, super.field1945, super.field1945, super.field1945, super.field3636, super.field3636, super.field3636, super.field3636 };
                                        for (int var42 = 0; var42 < 8; ++var42) {
                                            int var43 = var39[var42];
                                            int var44 = var41[var42];
                                            int var45 = var40[var42];
                                            if (arg0 != 0) {
                                                int var46 = var26 * var45 + var27 * var43 >> 16;
                                                var45 = var27 * var45 - var26 * var43 >> 16;
                                                var43 = var46;
                                            }
                                            int var47 = arg5 + var43;
                                            int var48 = arg6 + var44;
                                            int var49 = arg7 + var45;
                                            int var50 = arg3 * var49 + arg4 * var47 >> 16;
                                            int var51 = arg4 * var49 - arg3 * var47 >> 16;
                                            int var53 = arg2 * var48 - arg1 * var51 >> 16;
                                            int var54 = arg1 * var48 + arg2 * var51 >> 16;
                                            if (var54 > 0) {
                                                int var56 = (var50 << 9) / var54;
                                                int var57 = (var53 << 9) / var54;
                                                if (var56 < var35) {
                                                    var35 = var56;
                                                }
                                                if (var56 > var36) {
                                                    var36 = var56;
                                                }
                                                if (var57 < var37) {
                                                    var37 = var57;
                                                }
                                                if (var57 > var38) {
                                                    var38 = var57;
                                                }
                                            }
                                        }
                                        if (var33 >= var35 && var33 <= var36 && var34 >= var37 && var34 <= var38) {
                                            if (super.field3625) {
                                                class189.field3639[class189.field3623++] = arg8;
                                            } else {
                                                var28 = true;
                                            }
                                        }
                                    }
                                }
                                for (int var58 = 0; var58 < super.field3630; ++var58) {
                                    int var59 = super.field3624[var58];
                                    int var60 = super.field3619[var58];
                                    int var61 = super.field3621[var58];
                                    if (arg0 != 0) {
                                        int var62 = var26 * var61 + var27 * var59 >> 16;
                                        var61 = var27 * var61 - var26 * var59 >> 16;
                                        var59 = var62;
                                    }
                                    int var63 = arg5 + var59;
                                    int var64 = arg6 + var60;
                                    int var65 = arg7 + var61;
                                    int var66 = arg3 * var65 + arg4 * var63 >> 16;
                                    int var67 = arg4 * var65 - arg3 * var63 >> 16;
                                    int var69 = arg2 * var64 - arg1 * var67 >> 16;
                                    int var70 = arg1 * var64 + arg2 * var67 >> 16;
                                    field1292[var58] = var70 - var12;
                                    if (var70 >= 50) {
                                        field1295[var58] = (var66 << 9) / var70 + var24;
                                        field1278[var58] = (var69 << 9) / var70 + var25;
                                    } else {
                                        field1295[var58] = -5000;
                                        var21 = true;
                                    }
                                    if (var23) {
                                        field1294[var58] = var66;
                                        field1283[var58] = var69;
                                        field1271[var58] = var70;
                                    }
                                }
                                try {
                                    this.method427(var21, var28, arg8, var12 - var14, var13 - var14 + 2);
                                } catch (Exception var72) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "gf", name = "a", descriptor = "(Ltd;ILtd;I[I)V")
    public final void method422(class179 arg0, int arg1, class179 arg2, int arg3, int[] arg4) {
        if (arg1 != -1) {
            if (arg4 != null && arg3 != -1) {
                class195 var6 = arg0.field3382[arg1];
                class195 var7 = arg2.field3382[arg3];
                class70 var8 = var6.field3725;
                field1289 = 0;
                field1280 = 0;
                field1275 = 0;
                byte var9 = 0;
                int var17 = var9 + 1;
                int var10 = arg4[var9];
                for (int var11 = 0; var11 < var6.field3736; ++var11) {
                    short var16 = var6.field3727[var11];
                    while (var16 > var10) {
                        var10 = arg4[var17++];
                    }
                    if (var10 != var16 || var8.field1362[var16] == 0) {
                        if (var6.field3732[var11] != -1) {
                            this.method426(0, var8.field1359[var6.field3732[var11]], 0, 0, 0);
                        }
                        this.method426(var8.field1362[var16], var8.field1359[var16], var6.field3731[var11], var6.field3733[var11], var6.field3730[var11]);
                    }
                }
                field1289 = 0;
                field1280 = 0;
                field1275 = 0;
                byte var12 = 0;
                int var18 = var12 + 1;
                int var13 = arg4[var12];
                for (int var14 = 0; var14 < var7.field3736; ++var14) {
                    short var15 = var7.field3727[var14];
                    while (var15 > var13) {
                        var13 = arg4[var18++];
                    }
                    if (var13 == var15 || var8.field1362[var15] == 0) {
                        if (var7.field3732[var14] != -1) {
                            this.method426(0, var8.field1359[var7.field3732[var14]], 0, 0, 0);
                        }
                        this.method426(var8.field1362[var15], var8.field1359[var15], var7.field3731[var14], var7.field3733[var14], var7.field3730[var14]);
                    }
                }
                super.field3634 = false;
            } else {
                this.method425(arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "gf", name = "a", descriptor = "(IIIIIII)V")
    public final void method423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            this.method1274();
            int var8 = class124.field2375;
            int var9 = class124.field2382;
            int var10 = field1290[arg0];
            int var11 = field1282[arg0];
            int var12 = field1290[arg1];
            int var13 = field1282[arg1];
            int var14 = field1290[arg2];
            int var15 = field1282[arg2];
            int var16 = field1290[arg3];
            int var17 = field1282[arg3];
            int var18 = arg5 * var16 + arg6 * var17 >> 16;
            for (int var19 = 0; var19 < super.field3630; ++var19) {
                int var20 = super.field3624[var19];
                int var21 = super.field3619[var19];
                int var22 = super.field3621[var19];
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
                field1292[var19] = var30 - var18;
                field1295[var19] = (var26 << 9) / var30 + var8;
                field1278[var19] = (var29 << 9) / var30 + var9;
                if (this.field1267 > 0) {
                    field1294[var19] = var26;
                    field1283[var19] = var29;
                    field1271[var19] = var30;
                }
            }
            this.method427(false, false, 0L, super.field3633, super.field3633 << 1);
        } catch (RuntimeException var32) {
        }
    }

    @OriginalMember(owner = "gf", name = "c", descriptor = "(IIIIIIII)Z")
    private final boolean method424(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "gf", name = "a", descriptor = "(Ltd;I)V")
    public final void method425(class179 arg0, int arg1) {
        if (super.field3622 != null) {
            if (arg1 != -1) {
                class195 var3 = arg0.field3382[arg1];
                class70 var4 = var3.field3725;
                field1289 = 0;
                field1280 = 0;
                field1275 = 0;
                for (int var5 = 0; var5 < var3.field3736; ++var5) {
                    short var6 = var3.field3727[var5];
                    if (var3.field3732[var5] != -1) {
                        this.method426(0, var4.field1359[var3.field3732[var5]], 0, 0, 0);
                    }
                    this.method426(var4.field1362[var6], var4.field1359[var6], var3.field3731[var5], var3.field3733[var5], var3.field3730[var5]);
                }
                super.field3634 = false;
            }
        }
    }

    @OriginalMember(owner = "gf", name = "a", descriptor = "(I[IIII)V")
    private final void method426(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            field1289 = 0;
            field1280 = 0;
            field1275 = 0;
            for (int var8 = 0; var8 < var6; ++var8) {
                int var9 = arg1[var8];
                if (var9 < super.field3622.length) {
                    int[] var10 = super.field3622[var9];
                    for (int var11 = 0; var11 < var10.length; ++var11) {
                        int var12 = var10[var11];
                        field1289 += super.field3624[var12];
                        field1280 += super.field3619[var12];
                        field1275 += super.field3621[var12];
                        ++var7;
                    }
                }
            }
            if (var7 > 0) {
                field1289 = field1289 / var7 + arg2;
                field1280 = field1280 / var7 + arg3;
                field1275 = field1275 / var7 + arg4;
            } else {
                field1289 = arg2;
                field1280 = arg3;
                field1275 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; ++var13) {
                int var14 = arg1[var13];
                if (var14 < super.field3622.length) {
                    int[] var15 = super.field3622[var14];
                    for (int var16 = 0; var16 < var15.length; ++var16) {
                        int var17 = var15[var16];
                        super.field3624[var17] += arg2;
                        super.field3619[var17] += arg3;
                        super.field3621[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; ++var18) {
                int var19 = arg1[var18];
                if (var19 < super.field3622.length) {
                    int[] var20 = super.field3622[var19];
                    for (int var21 = 0; var21 < var20.length; ++var21) {
                        int var22 = var20[var21];
                        super.field3624[var22] -= field1289;
                        super.field3619[var22] -= field1280;
                        super.field3621[var22] -= field1275;
                        int var23 = (arg2 & 255) * 8;
                        int var24 = (arg3 & 255) * 8;
                        int var25 = (arg4 & 255) * 8;
                        if (var25 != 0) {
                            int var26 = field1290[var25];
                            int var27 = field1282[var25];
                            int var28 = super.field3624[var22] * var27 + super.field3619[var22] * var26 + 32767 >> 16;
                            super.field3619[var22] = super.field3619[var22] * var27 - super.field3624[var22] * var26 + 32767 >> 16;
                            super.field3624[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1290[var23];
                            int var30 = field1282[var23];
                            int var31 = super.field3619[var22] * var30 - super.field3621[var22] * var29 + 32767 >> 16;
                            super.field3621[var22] = super.field3621[var22] * var30 + super.field3619[var22] * var29 + 32767 >> 16;
                            super.field3619[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1290[var24];
                            int var33 = field1282[var24];
                            int var34 = super.field3624[var22] * var33 + super.field3621[var22] * var32 + 32767 >> 16;
                            super.field3621[var22] = super.field3621[var22] * var33 - super.field3624[var22] * var32 + 32767 >> 16;
                            super.field3624[var22] = var34;
                        }
                        super.field3624[var22] += field1289;
                        super.field3619[var22] += field1280;
                        super.field3621[var22] += field1275;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; ++var35) {
                int var36 = arg1[var35];
                if (var36 < super.field3622.length) {
                    int[] var37 = super.field3622[var36];
                    for (int var38 = 0; var38 < var37.length; ++var38) {
                        int var39 = var37[var38];
                        super.field3624[var39] -= field1289;
                        super.field3619[var39] -= field1280;
                        super.field3621[var39] -= field1275;
                        super.field3624[var39] = super.field3624[var39] * arg2 / 128;
                        super.field3619[var39] = super.field3619[var39] * arg3 / 128;
                        super.field3621[var39] = super.field3621[var39] * arg4 / 128;
                        super.field3624[var39] += field1289;
                        super.field3619[var39] += field1280;
                        super.field3621[var39] += field1275;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (super.field3629 != null && this.field1256 != null) {
                for (int var40 = 0; var40 < var6; ++var40) {
                    int var41 = arg1[var40];
                    if (var41 < super.field3629.length) {
                        int[] var42 = super.field3629[var41];
                        for (int var43 = 0; var43 < var42.length; ++var43) {
                            int var44 = var42[var43];
                            int var45 = (this.field1256[var44] & 255) + arg2 * 8;
                            if (var45 < 0) {
                                var45 = 0;
                            } else if (var45 > 255) {
                                var45 = 255;
                            }
                            this.field1256[var44] = (byte) var45;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "gf", name = "a", descriptor = "(ZZJII)V")
    private final void method427(boolean arg0, boolean arg1, long arg2, int arg3, int arg4) {
        if (arg4 < 1600) {
            for (int var7 = 0; var7 < arg4; ++var7) {
                field1279[var7] = 0;
            }
            for (int var8 = 0; var8 < super.field3628; ++var8) {
                if (this.field1253[var8] != -2) {
                    int var33 = this.field1258[var8];
                    int var34 = this.field1263[var8];
                    int var35 = this.field1261[var8];
                    int var36 = field1295[var33];
                    int var37 = field1295[var34];
                    int var38 = field1295[var35];
                    if (!arg0 || var36 != -5000 && var37 != -5000 && var38 != -5000) {
                        if (arg1 && this.method424(class189.field3640, class189.field3638, field1278[var33], field1278[var34], field1278[var35], var36, var37, var38)) {
                            class189.field3639[class189.field3623++] = arg2;
                            arg1 = false;
                        }
                        if ((field1278[var35] - field1278[var34]) * (var36 - var37) - (field1278[var33] - field1278[var34]) * (var38 - var37) > 0) {
                            field1276[var8] = false;
                            if (var36 >= 0 && var37 >= 0 && var38 >= 0 && var36 <= class124.field2392 && var37 <= class124.field2392 && var38 <= class124.field2392) {
                                field1293[var8] = false;
                            } else {
                                field1293[var8] = true;
                            }
                            int var58 = (field1292[var33] + field1292[var34] + field1292[var35]) / 3 + arg3;
                            field1288[var58][field1279[var58]++] = var8;
                        }
                    } else {
                        int var39 = field1294[var33];
                        int var40 = field1294[var34];
                        int var41 = field1294[var35];
                        int var42 = field1283[var33];
                        int var43 = field1283[var34];
                        int var44 = field1283[var35];
                        int var45 = field1271[var33];
                        int var46 = field1271[var34];
                        int var47 = field1271[var35];
                        int var48 = var39 - var40;
                        int var49 = var41 - var40;
                        int var50 = var42 - var43;
                        int var51 = var44 - var43;
                        int var52 = var45 - var46;
                        int var53 = var47 - var46;
                        int var54 = var50 * var53 - var51 * var52;
                        int var55 = var49 * var52 - var48 * var53;
                        int var56 = var48 * var51 - var49 * var50;
                        if (var46 * var56 + var40 * var54 + var43 * var55 > 0) {
                            field1276[var8] = true;
                            int var57 = (field1292[var33] + field1292[var34] + field1292[var35]) / 3 + arg3;
                            field1288[var57][field1279[var57]++] = var8;
                        }
                    }
                }
            }
            if (this.field1262 == null) {
                for (int var9 = arg4 - 1; var9 >= 0; --var9) {
                    int var10 = field1279[var9];
                    if (var10 > 0) {
                        int[] var11 = field1288[var9];
                        for (int var12 = 0; var12 < var10; ++var12) {
                            this.method428(var11[var12]);
                        }
                    }
                }
            } else {
                for (int var13 = 0; var13 < 12; ++var13) {
                    field1281[var13] = 0;
                    field1272[var13] = 0;
                }
                for (int var14 = arg4 - 1; var14 >= 0; --var14) {
                    int var27 = field1279[var14];
                    if (var27 > 0) {
                        int[] var28 = field1288[var14];
                        for (int var29 = 0; var29 < var27; ++var29) {
                            int var30 = var28[var29];
                            byte var31 = this.field1262[var30];
                            int var32 = field1281[var31]++;
                            field1286[var31][var32] = var30;
                            if (var31 < 10) {
                                field1272[var31] += var14;
                            } else if (var31 == 10) {
                                field1270[var32] = var14;
                            } else {
                                field1291[var32] = var14;
                            }
                        }
                    }
                }
                int var15 = 0;
                if (field1281[1] > 0 || field1281[2] > 0) {
                    var15 = (field1272[1] + field1272[2]) / (field1281[1] + field1281[2]);
                }
                int var16 = 0;
                if (field1281[3] > 0 || field1281[4] > 0) {
                    var16 = (field1272[3] + field1272[4]) / (field1281[3] + field1281[4]);
                }
                int var17 = 0;
                if (field1281[6] > 0 || field1281[8] > 0) {
                    var17 = (field1272[6] + field1272[8]) / (field1281[6] + field1281[8]);
                }
                int var18 = 0;
                int var19 = field1281[10];
                int[] var20 = field1286[10];
                int[] var21 = field1270;
                if (var18 == var19) {
                    var18 = 0;
                    var19 = field1281[11];
                    var20 = field1286[11];
                    var21 = field1291;
                }
                int var22;
                if (var18 < var19) {
                    var22 = var21[var18];
                } else {
                    var22 = -1000;
                }
                for (int var23 = 0; var23 < 10; ++var23) {
                    while (var23 == 0 && var22 > var15) {
                        this.method428(var20[var18++]);
                        if (var18 == var19 && field1286[11] != var20) {
                            var18 = 0;
                            var19 = field1281[11];
                            var20 = field1286[11];
                            var21 = field1291;
                        }
                        if (var18 < var19) {
                            var22 = var21[var18];
                        } else {
                            var22 = -1000;
                        }
                    }
                    while (var23 == 3 && var22 > var16) {
                        this.method428(var20[var18++]);
                        if (var18 == var19 && field1286[11] != var20) {
                            var18 = 0;
                            var19 = field1281[11];
                            var20 = field1286[11];
                            var21 = field1291;
                        }
                        if (var18 < var19) {
                            var22 = var21[var18];
                        } else {
                            var22 = -1000;
                        }
                    }
                    while (var23 == 5 && var22 > var17) {
                        this.method428(var20[var18++]);
                        if (var18 == var19 && field1286[11] != var20) {
                            var18 = 0;
                            var19 = field1281[11];
                            var20 = field1286[11];
                            var21 = field1291;
                        }
                        if (var18 < var19) {
                            var22 = var21[var18];
                        } else {
                            var22 = -1000;
                        }
                    }
                    int var24 = field1281[var23];
                    int[] var25 = field1286[var23];
                    for (int var26 = 0; var26 < var24; ++var26) {
                        this.method428(var25[var26]);
                    }
                }
                while (var22 != -1000) {
                    this.method428(var20[var18++]);
                    if (var18 == var19 && field1286[11] != var20) {
                        var18 = 0;
                        var20 = field1286[11];
                        var19 = field1281[11];
                        var21 = field1291;
                    }
                    if (var18 < var19) {
                        var22 = var21[var18];
                    } else {
                        var22 = -1000;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "gf", name = "e", descriptor = "(I)V")
    private final void method428(int arg0) {
        if (field1276[arg0]) {
            this.method431(arg0);
        } else {
            int var2 = this.field1258[arg0];
            int var3 = this.field1263[arg0];
            int var4 = this.field1261[arg0];
            class124.field2384 = field1293[arg0];
            if (this.field1256 == null) {
                class124.field2374 = 0;
            } else {
                class124.field2374 = this.field1256[arg0] & 255;
            }
            if (this.field1254 != null && this.field1254[arg0] != -1) {
                int var6;
                int var7;
                int var8;
                if (this.field1266 != null && this.field1266[arg0] != -1) {
                    int var5 = this.field1266[arg0] & 255;
                    var6 = this.field1252[var5];
                    var7 = this.field1257[var5];
                    var8 = this.field1260[var5];
                } else {
                    var6 = var2;
                    var7 = var3;
                    var8 = var4;
                }
                if (this.field1253[arg0] == -1) {
                    class124.method889(field1278[var2], field1278[var3], field1278[var4], field1295[var2], field1295[var3], field1295[var4], this.field1259[arg0], this.field1259[arg0], this.field1259[arg0], field1294[var6], field1294[var7], field1294[var8], field1283[var6], field1283[var7], field1283[var8], field1271[var6], field1271[var7], field1271[var8], this.field1254[arg0]);
                } else {
                    class124.method889(field1278[var2], field1278[var3], field1278[var4], field1295[var2], field1295[var3], field1295[var4], this.field1259[arg0], this.field1264[arg0], this.field1253[arg0], field1294[var6], field1294[var7], field1294[var8], field1283[var6], field1283[var7], field1283[var8], field1271[var6], field1271[var7], field1271[var8], this.field1254[arg0]);
                }
            } else if (this.field1253[arg0] == -1) {
                class124.method894(field1278[var2], field1278[var3], field1278[var4], field1295[var2], field1295[var3], field1295[var4], field1274[this.field1259[arg0]]);
            } else {
                class124.method890(field1278[var2], field1278[var3], field1278[var4], field1295[var2], field1295[var3], field1295[var4], this.field1259[arg0], this.field1264[arg0], this.field1253[arg0]);
            }
        }
    }

    @OriginalMember(owner = "gf", name = "a", descriptor = "(Lue;)Lue;")
    public final class189 method429(class189 arg0) {
        return new class66(new class66[] { this, (class66) arg0 }, 2);
    }

    @OriginalMember(owner = "gf", name = "b", descriptor = "(IIIIIIII)V")
    public final void method430(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            this.method1274();
            int var9 = class124.field2375;
            int var10 = class124.field2382;
            int var11 = field1290[arg0];
            int var12 = field1282[arg0];
            int var13 = field1290[arg1];
            int var14 = field1282[arg1];
            int var15 = field1290[arg2];
            int var16 = field1282[arg2];
            int var17 = field1290[arg3];
            int var18 = field1282[arg3];
            int var19 = arg5 * var17 + arg6 * var18 >> 16;
            for (int var20 = 0; var20 < super.field3630; ++var20) {
                int var21 = super.field3624[var20];
                int var22 = super.field3619[var20];
                int var23 = super.field3621[var20];
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
                field1292[var20] = var31 - var19;
                field1295[var20] = (var27 << 9) / arg7 + var9;
                field1278[var20] = (var30 << 9) / arg7 + var10;
                if (this.field1267 > 0) {
                    field1294[var20] = var27;
                    field1283[var20] = var30;
                    field1271[var20] = var31;
                }
            }
            this.method427(false, false, 0L, super.field3633, super.field3633 << 1);
        } catch (RuntimeException var33) {
        }
    }

    @OriginalMember(owner = "gf", name = "f", descriptor = "(I)V")
    private final void method431(int arg0) {
        int var2 = class124.field2375;
        int var3 = class124.field2382;
        int var4 = 0;
        int var5 = this.field1258[arg0];
        int var6 = this.field1263[arg0];
        int var7 = this.field1261[arg0];
        int var8 = field1271[var5];
        int var9 = field1271[var6];
        int var10 = field1271[var7];
        if (this.field1256 == null) {
            class124.field2374 = 0;
        } else {
            class124.field2374 = this.field1256[arg0] & 255;
        }
        if (var8 >= 50) {
            field1285[var4] = field1295[var5];
            field1284[var4] = field1278[var5];
            field1273[var4++] = this.field1259[arg0];
        } else {
            int var11 = field1294[var5];
            int var12 = field1283[var5];
            int var13 = this.field1259[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1277[var10 - var8];
                field1285[var4] = (((field1294[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1284[var4] = (((field1283[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1273[var4++] = ((this.field1253[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1277[var9 - var8];
                field1285[var4] = (((field1294[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1284[var4] = (((field1283[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1273[var4++] = ((this.field1264[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1285[var4] = field1295[var6];
            field1284[var4] = field1278[var6];
            field1273[var4++] = this.field1264[arg0];
        } else {
            int var16 = field1294[var6];
            int var17 = field1283[var6];
            int var18 = this.field1264[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1277[var8 - var9];
                field1285[var4] = (((field1294[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1284[var4] = (((field1283[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1273[var4++] = ((this.field1259[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1277[var10 - var9];
                field1285[var4] = (((field1294[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1284[var4] = (((field1283[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1273[var4++] = ((this.field1253[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1285[var4] = field1295[var7];
            field1284[var4] = field1278[var7];
            field1273[var4++] = this.field1253[arg0];
        } else {
            int var21 = field1294[var7];
            int var22 = field1283[var7];
            int var23 = this.field1253[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1277[var9 - var10];
                field1285[var4] = (((field1294[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1284[var4] = (((field1283[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1273[var4++] = ((this.field1264[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1277[var8 - var10];
                field1285[var4] = (((field1294[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1284[var4] = (((field1283[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1273[var4++] = ((this.field1259[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1285[0];
        int var27 = field1285[1];
        int var28 = field1285[2];
        int var29 = field1284[0];
        int var30 = field1284[1];
        int var31 = field1284[2];
        class124.field2384 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > class124.field2392 || var27 > class124.field2392 || var28 > class124.field2392) {
                class124.field2384 = true;
            }
            if (this.field1254 != null && this.field1254[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1266 != null && this.field1266[arg0] != -1) {
                    int var32 = this.field1266[arg0] & 255;
                    var33 = this.field1252[var32];
                    var34 = this.field1257[var32];
                    var35 = this.field1260[var32];
                } else {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                }
                if (this.field1253[arg0] == -1) {
                    class124.method889(var29, var30, var31, var26, var27, var28, this.field1259[arg0], this.field1259[arg0], this.field1259[arg0], field1294[var33], field1294[var34], field1294[var35], field1283[var33], field1283[var34], field1283[var35], field1271[var33], field1271[var34], field1271[var35], this.field1254[arg0]);
                } else {
                    class124.method889(var29, var30, var31, var26, var27, var28, field1273[0], field1273[1], field1273[2], field1294[var33], field1294[var34], field1294[var35], field1283[var33], field1283[var34], field1283[var35], field1271[var33], field1271[var34], field1271[var35], this.field1254[arg0]);
                }
            } else if (this.field1253[arg0] == -1) {
                class124.method894(var29, var30, var31, var26, var27, var28, field1274[this.field1259[arg0]]);
            } else {
                class124.method890(var29, var30, var31, var26, var27, var28, field1273[0], field1273[1], field1273[2]);
            }
        }
        if (var4 == 4) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > class124.field2392 || var27 > class124.field2392 || var28 > class124.field2392 || field1285[3] < 0 || field1285[3] > class124.field2392) {
                class124.field2384 = true;
            }
            if (this.field1254 == null || this.field1254[arg0] == -1) {
                if (this.field1253[arg0] == -1) {
                    int var41 = field1274[this.field1259[arg0]];
                    class124.method894(var29, var30, var31, var26, var27, var28, var41);
                    class124.method894(var29, var31, field1284[3], var26, var28, field1285[3], var41);
                    return;
                }
                class124.method890(var29, var30, var31, var26, var27, var28, field1273[0], field1273[1], field1273[2]);
                class124.method890(var29, var31, field1284[3], var26, var28, field1285[3], field1273[0], field1273[2], field1273[3]);
                return;
            }
            int var37;
            int var38;
            int var39;
            if (this.field1266 != null && this.field1266[arg0] != -1) {
                int var36 = this.field1266[arg0] & 255;
                var37 = this.field1252[var36];
                var38 = this.field1257[var36];
                var39 = this.field1260[var36];
            } else {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            }
            short var40 = this.field1254[arg0];
            if (this.field1253[arg0] == -1) {
                class124.method889(var29, var30, var31, var26, var27, var28, this.field1259[arg0], this.field1259[arg0], this.field1259[arg0], field1294[var37], field1294[var38], field1294[var39], field1283[var37], field1283[var38], field1283[var39], field1271[var37], field1271[var38], field1271[var39], var40);
                class124.method889(var29, var31, field1284[3], var26, var28, field1285[3], this.field1259[arg0], this.field1259[arg0], this.field1259[arg0], field1294[var37], field1294[var38], field1294[var39], field1283[var37], field1283[var38], field1283[var39], field1271[var37], field1271[var38], field1271[var39], var40);
                return;
            }
            class124.method889(var29, var30, var31, var26, var27, var28, field1273[0], field1273[1], field1273[2], field1294[var37], field1294[var38], field1294[var39], field1283[var37], field1283[var38], field1283[var39], field1271[var37], field1271[var38], field1271[var39], var40);
            class124.method889(var29, var31, field1284[3], var26, var28, field1285[3], field1273[0], field1273[2], field1273[3], field1294[var37], field1294[var38], field1294[var39], field1283[var37], field1283[var38], field1283[var39], field1271[var37], field1271[var38], field1271[var39], var40);
        }
    }

    @OriginalMember(owner = "gf", name = "a", descriptor = "([[IIIIZI)Lue;")
    public final class189 method432(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1274();
        int var7 = super.field3637 + arg1;
        int var8 = super.field3620 + arg1;
        int var9 = super.field3627 + arg3;
        int var10 = super.field3626 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class66 var15;
                if (arg4) {
                    var15 = new class66();
                    var15.field3630 = super.field3630;
                    var15.field3628 = super.field3628;
                    var15.field1267 = this.field1267;
                    var15.field3624 = super.field3624;
                    var15.field3621 = super.field3621;
                    var15.field1258 = this.field1258;
                    var15.field1263 = this.field1263;
                    var15.field1261 = this.field1261;
                    var15.field1259 = this.field1259;
                    var15.field1264 = this.field1264;
                    var15.field1253 = this.field1253;
                    var15.field1262 = this.field1262;
                    var15.field1256 = this.field1256;
                    var15.field1266 = this.field1266;
                    var15.field1254 = this.field1254;
                    var15.field1265 = this.field1265;
                    var15.field1252 = this.field1252;
                    var15.field1257 = this.field1257;
                    var15.field1260 = this.field1260;
                    var15.field3622 = super.field3622;
                    var15.field3629 = super.field3629;
                    var15.field3625 = super.field3625;
                    var15.field3619 = new int[var15.field3630];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field3630; ++var16) {
                        int var17 = super.field3624[var16] + arg1;
                        int var18 = super.field3621[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field3619[var16] = super.field3619[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field3630; ++var26) {
                        int var27 = (super.field3619[var26] << 16) / super.field1945;
                        if (var27 < arg5) {
                            int var28 = super.field3624[var26] + arg1;
                            int var29 = super.field3621[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field3619[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + super.field3619[var26];
                        } else {
                            var15.field3619[var26] = super.field3619[var26];
                        }
                    }
                }
                super.field3634 = false;
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "gf", name = "a", descriptor = "(ZLgf;[B)Lgf;")
    private final class66 method433(boolean arg0, class66 arg1, byte[] arg2) {
        arg1.field3630 = super.field3630;
        arg1.field3628 = super.field3628;
        arg1.field1267 = this.field1267;
        if (arg1.field3624 == null || arg1.field3624.length < super.field3630) {
            arg1.field3624 = new int[super.field3630 + 100];
            arg1.field3619 = new int[super.field3630 + 100];
            arg1.field3621 = new int[super.field3630 + 100];
        }
        for (int var4 = 0; var4 < super.field3630; ++var4) {
            arg1.field3624[var4] = super.field3624[var4];
            arg1.field3619[var4] = super.field3619[var4];
            arg1.field3621[var4] = super.field3621[var4];
        }
        if (arg0) {
            arg1.field1256 = this.field1256;
        } else {
            arg1.field1256 = arg2;
            if (this.field1256 == null) {
                for (int var5 = 0; var5 < super.field3628; ++var5) {
                    arg1.field1256[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < super.field3628; ++var6) {
                    arg1.field1256[var6] = this.field1256[var6];
                }
            }
        }
        arg1.field1258 = this.field1258;
        arg1.field1263 = this.field1263;
        arg1.field1261 = this.field1261;
        arg1.field1259 = this.field1259;
        arg1.field1264 = this.field1264;
        arg1.field1253 = this.field1253;
        arg1.field1262 = this.field1262;
        arg1.field1266 = this.field1266;
        arg1.field1254 = this.field1254;
        arg1.field1265 = this.field1265;
        arg1.field1252 = this.field1252;
        arg1.field1257 = this.field1257;
        arg1.field1260 = this.field1260;
        arg1.field3622 = super.field3622;
        arg1.field3629 = super.field3629;
        arg1.field3625 = super.field3625;
        arg1.field3634 = false;
        return arg1;
    }

    @OriginalMember(owner = "gf", name = "g", descriptor = "(I)I")
    private static final int method434(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }

    @OriginalMember(owner = "gf", name = "c", descriptor = "(Z)Lue;")
    public final class189 method435(boolean arg0) {
        if (!arg0 && field1268.length < super.field3628) {
            field1268 = new byte[super.field3628 + 100];
        }
        return this.method433(arg0, field1255, field1268);
    }

    @OriginalMember(owner = "gf", name = "d", descriptor = "(Z)Lue;")
    public final class189 method436(boolean arg0) {
        if (!arg0 && field1287.length < super.field3628) {
            field1287 = new byte[super.field3628 + 100];
        }
        return this.method433(arg0, field1269, field1287);
    }

    @OriginalMember(owner = "gf", name = "<init>", descriptor = "()V")
    public class66() {
    }

    @OriginalMember(owner = "gf", name = "<init>", descriptor = "(Loe;IIIII)V")
    public class66(class135 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.method975();
        arg0.method970();
        super.field3630 = arg0.field2608;
        super.field3624 = arg0.field2604;
        super.field3619 = arg0.field2576;
        super.field3621 = arg0.field2581;
        super.field3628 = arg0.field2594;
        this.field1258 = arg0.field2578;
        this.field1263 = arg0.field2595;
        this.field1261 = arg0.field2583;
        this.field1262 = arg0.field2589;
        this.field1256 = arg0.field2618;
        this.field1265 = arg0.field2577;
        super.field3622 = arg0.field2592;
        super.field3629 = arg0.field2623;
        int var7 = (int) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        int var8 = arg2 * var7 >> 8;
        this.field1259 = new int[super.field3628];
        this.field1264 = new int[super.field3628];
        this.field1253 = new int[super.field3628];
        if (arg0.field2590 != null) {
            this.field1254 = new short[super.field3628];
            for (int var9 = 0; var9 < super.field3628; ++var9) {
                short var10 = arg0.field2590[var9];
                if (var10 != -1 && class124.field2385.method9(87, var10)) {
                    this.field1254[var9] = var10;
                } else {
                    this.field1254[var9] = -1;
                }
            }
        } else {
            this.field1254 = null;
        }
        if (arg0.field2587 > 0 && arg0.field2584 != null) {
            int[] var11 = new int[arg0.field2587];
            for (int var12 = 0; var12 < super.field3628; ++var12) {
                if (arg0.field2584[var12] != -1) {
                    ++var11[arg0.field2584[var12] & 255];
                }
            }
            this.field1267 = 0;
            for (int var13 = 0; var13 < arg0.field2587; ++var13) {
                if (var11[var13] > 0 && arg0.field2621[var13] == 0) {
                    ++this.field1267;
                }
            }
            this.field1252 = new int[this.field1267];
            this.field1257 = new int[this.field1267];
            this.field1260 = new int[this.field1267];
            int var14 = 0;
            for (int var15 = 0; var15 < arg0.field2587; ++var15) {
                if (var11[var15] > 0 && arg0.field2621[var15] == 0) {
                    this.field1252[var14] = arg0.field2614[var15] & 65535;
                    this.field1257[var14] = arg0.field2619[var15] & 65535;
                    this.field1260[var14] = arg0.field2582[var15] & 65535;
                    var11[var15] = var14++;
                } else {
                    var11[var15] = -1;
                }
            }
            this.field1266 = new byte[super.field3628];
            for (int var16 = 0; var16 < super.field3628; ++var16) {
                if (arg0.field2584[var16] != -1) {
                    this.field1266[var16] = (byte) var11[arg0.field2584[var16] & 255];
                    if (this.field1266[var16] == -1 && this.field1254 != null) {
                        this.field1254[var16] = -1;
                    }
                } else {
                    this.field1266[var16] = -1;
                }
            }
        }
        for (int var17 = 0; var17 < super.field3628; ++var17) {
            byte var18;
            if (arg0.field2600 == null) {
                var18 = 0;
            } else {
                var18 = arg0.field2600[var17];
            }
            byte var19;
            if (arg0.field2618 == null) {
                var19 = 0;
            } else {
                var19 = arg0.field2618[var17];
            }
            short var20;
            if (this.field1254 == null) {
                var20 = -1;
            } else {
                var20 = this.field1254[var17];
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
                        class22 var28 = arg0.field2597[var17];
                        int var29 = (var28.field497 * arg5 + var28.field503 * arg3 + var28.field498 * arg4) / (var8 / 2 + var8) + arg1;
                        this.field1259[var17] = method419(arg0.field2620[var17] & 65535, var29);
                        this.field1253[var17] = -1;
                    } else if (var18 == 3) {
                        this.field1259[var17] = 128;
                        this.field1253[var17] = -1;
                    } else {
                        this.field1253[var17] = -2;
                    }
                } else {
                    int var21 = arg0.field2620[var17] & 65535;
                    class76 var22;
                    if (arg0.field2588 != null && arg0.field2588[this.field1258[var17]] != null) {
                        var22 = arg0.field2588[this.field1258[var17]];
                    } else {
                        var22 = arg0.field2601[this.field1258[var17]];
                    }
                    int var23 = (var22.field1463 * arg5 + var22.field1460 * arg3 + var22.field1458 * arg4) / (var22.field1456 * var8) + arg1;
                    this.field1259[var17] = method419(var21, var23);
                    class76 var24;
                    if (arg0.field2588 != null && arg0.field2588[this.field1263[var17]] != null) {
                        var24 = arg0.field2588[this.field1263[var17]];
                    } else {
                        var24 = arg0.field2601[this.field1263[var17]];
                    }
                    int var25 = (var24.field1463 * arg5 + var24.field1460 * arg3 + var24.field1458 * arg4) / (var24.field1456 * var8) + arg1;
                    this.field1264[var17] = method419(var21, var25);
                    class76 var26;
                    if (arg0.field2588 != null && arg0.field2588[this.field1261[var17]] != null) {
                        var26 = arg0.field2588[this.field1261[var17]];
                    } else {
                        var26 = arg0.field2601[this.field1261[var17]];
                    }
                    int var27 = (var26.field1463 * arg5 + var26.field1460 * arg3 + var26.field1458 * arg4) / (var26.field1456 * var8) + arg1;
                    this.field1253[var17] = method419(var21, var27);
                }
            } else if (var18 != 0) {
                if (var18 == 1) {
                    class22 var36 = arg0.field2597[var17];
                    int var37 = (var36.field497 * arg5 + var36.field503 * arg3 + var36.field498 * arg4) / (var8 / 2 + var8) + arg1;
                    this.field1259[var17] = method434(var37);
                    this.field1253[var17] = -1;
                } else {
                    this.field1253[var17] = -2;
                }
            } else {
                class76 var30;
                if (arg0.field2588 != null && arg0.field2588[this.field1258[var17]] != null) {
                    var30 = arg0.field2588[this.field1258[var17]];
                } else {
                    var30 = arg0.field2601[this.field1258[var17]];
                }
                int var31 = (var30.field1463 * arg5 + var30.field1460 * arg3 + var30.field1458 * arg4) / (var30.field1456 * var8) + arg1;
                this.field1259[var17] = method434(var31);
                class76 var32;
                if (arg0.field2588 != null && arg0.field2588[this.field1263[var17]] != null) {
                    var32 = arg0.field2588[this.field1263[var17]];
                } else {
                    var32 = arg0.field2601[this.field1263[var17]];
                }
                int var33 = (var32.field1463 * arg5 + var32.field1460 * arg3 + var32.field1458 * arg4) / (var32.field1456 * var8) + arg1;
                this.field1264[var17] = method434(var33);
                class76 var34;
                if (arg0.field2588 != null && arg0.field2588[this.field1261[var17]] != null) {
                    var34 = arg0.field2588[this.field1261[var17]];
                } else {
                    var34 = arg0.field2601[this.field1261[var17]];
                }
                int var35 = (var34.field1463 * arg5 + var34.field1460 * arg3 + var34.field1458 * arg4) / (var34.field1456 * var8) + arg1;
                this.field1253[var17] = method434(var35);
            }
        }
    }

    @OriginalMember(owner = "gf", name = "<init>", descriptor = "([Lgf;I)V")
    private class66(class66[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        super.field3630 = 0;
        super.field3628 = 0;
        this.field1267 = 0;
        this.field1265 = -1;
        for (int var7 = 0; var7 < arg1; ++var7) {
            class66 var13 = arg0[var7];
            if (var13 != null) {
                super.field3630 += var13.field3630;
                super.field3628 += var13.field3628;
                this.field1267 += var13.field1267;
                if (var13.field1262 != null) {
                    var3 = true;
                } else {
                    if (this.field1265 == -1) {
                        this.field1265 = var13.field1265;
                    }
                    if (this.field1265 != var13.field1265) {
                        var3 = true;
                    }
                }
                var4 |= var13.field1256 != null;
                var5 |= var13.field1254 != null;
                var6 |= var13.field1266 != null;
            }
        }
        super.field3624 = new int[super.field3630];
        super.field3619 = new int[super.field3630];
        super.field3621 = new int[super.field3630];
        this.field1258 = new int[super.field3628];
        this.field1263 = new int[super.field3628];
        this.field1261 = new int[super.field3628];
        this.field1259 = new int[super.field3628];
        this.field1264 = new int[super.field3628];
        this.field1253 = new int[super.field3628];
        if (var3) {
            this.field1262 = new byte[super.field3628];
        }
        if (var4) {
            this.field1256 = new byte[super.field3628];
        }
        if (var5) {
            this.field1254 = new short[super.field3628];
        }
        if (var6) {
            this.field1266 = new byte[super.field3628];
        }
        if (this.field1267 > 0) {
            this.field1252 = new int[this.field1267];
            this.field1257 = new int[this.field1267];
            this.field1260 = new int[this.field1267];
        }
        super.field3630 = 0;
        super.field3628 = 0;
        this.field1267 = 0;
        for (int var8 = 0; var8 < arg1; ++var8) {
            class66 var9 = arg0[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < var9.field3628; ++var10) {
                    this.field1258[super.field3628] = var9.field1258[var10] + super.field3630;
                    this.field1263[super.field3628] = var9.field1263[var10] + super.field3630;
                    this.field1261[super.field3628] = var9.field1261[var10] + super.field3630;
                    this.field1259[super.field3628] = var9.field1259[var10];
                    this.field1264[super.field3628] = var9.field1264[var10];
                    this.field1253[super.field3628] = var9.field1253[var10];
                    if (var3) {
                        if (var9.field1262 != null) {
                            this.field1262[super.field3628] = var9.field1262[var10];
                        } else {
                            this.field1262[super.field3628] = var9.field1265;
                        }
                    }
                    if (var4 && var9.field1256 != null) {
                        this.field1256[super.field3628] = var9.field1256[var10];
                    }
                    if (var5) {
                        if (var9.field1254 != null) {
                            this.field1254[super.field3628] = var9.field1254[var10];
                        } else {
                            this.field1254[super.field3628] = -1;
                        }
                    }
                    if (var6) {
                        if (var9.field1266 != null && var9.field1266[var10] != -1) {
                            this.field1266[super.field3628] = (byte) (var9.field1266[var10] + this.field1267);
                        } else {
                            this.field1266[super.field3628] = -1;
                        }
                    }
                    ++super.field3628;
                }
                for (int var11 = 0; var11 < var9.field1267; ++var11) {
                    this.field1252[this.field1267] = var9.field1252[var11] + super.field3630;
                    this.field1257[this.field1267] = var9.field1257[var11] + super.field3630;
                    this.field1260[this.field1267] = var9.field1260[var11] + super.field3630;
                    ++this.field1267;
                }
                for (int var12 = 0; var12 < var9.field3630; ++var12) {
                    super.field3624[super.field3630] = var9.field3624[var12];
                    super.field3619[super.field3630] = var9.field3619[var12];
                    super.field3621[super.field3630] = var9.field3621[var12];
                    ++super.field3630;
                }
            }
        }
    }
}
