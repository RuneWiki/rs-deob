package deob;

@ObfuscatedName("ds")
public class class106 {

    @ObfuscatedName("ds.i")
    public static int[][] field1857 = new int[128][128];

    @ObfuscatedName("ds.h")
    public static int[][] field1858 = new int[128][128];

    @ObfuscatedName("ds.y")
    public static int[] field1865 = new int[4096];

    @ObfuscatedName("ds.p")
    public static int[] field1861 = new int[4096];

    public class106() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bs.o(IIILdz;Ldf;Z[I[II)I")
    public static int method1424(int arg0, int arg1, int arg2, class107 arg3, class108 arg4, boolean arg5, int[] arg6, int[] arg7) {
        for (int var8 = 0; var8 < 128; var8++) {
            for (int var9 = 0; var9 < 128; var9++) {
                field1857[var8][var9] = 0;
                field1858[var8][var9] = 99999999;
            }
        }
        boolean var10;
        if (arg2 == 1) {
            var10 = method1974(arg0, arg1, arg3, arg4);
        } else if (arg2 == 2) {
            var10 = method80(arg0, arg1, arg3, arg4);
        } else {
            int var11 = arg0;
            int var12 = arg1;
            byte var13 = 64;
            byte var14 = 64;
            int var15 = arg0 - var13;
            int var16 = arg1 - var14;
            field1857[var13][var14] = 99;
            field1858[var13][var14] = 0;
            byte var17 = 0;
            int var18 = 0;
            field1865[var17] = arg0;
            int var56 = var17 + 1;
            field1861[var17] = arg1;
            int[][] var19 = arg4.field1896;
            boolean var24;
            label395: while (true) {
                label393: while (true) {
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    int var25;
                    do {
                        do {
                            do {
                                label370: do {
                                    if (var56 == var18) {
                                        Statics.field1346 = var11;
                                        Statics.field81 = var12;
                                        var24 = false;
                                        break label395;
                                    }
                                    var11 = field1865[var18];
                                    var12 = field1861[var18];
                                    var18 = var18 + 1 & 0xFFF;
                                    var20 = var11 - var15;
                                    var21 = var12 - var16;
                                    var22 = var11 - arg4.field1893;
                                    var23 = var12 - arg4.field1894;
                                    if (arg3.method108(arg2, var11, var12, arg4)) {
                                        Statics.field1346 = var11;
                                        Statics.field81 = var12;
                                        var24 = true;
                                        break label395;
                                    }
                                    var25 = field1858[var20][var21] + 1;
                                    if (var20 > 0 && field1857[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x124010E) == 0 && (var19[var22 - 1][arg2 + var23 - 1] & 0x1240138) == 0) {
                                        int var26 = 1;
                                        while (true) {
                                            if (var26 >= arg2 - 1) {
                                                field1865[var56] = var11 - 1;
                                                field1861[var56] = var12;
                                                var56 = var56 + 1 & 0xFFF;
                                                field1857[var20 - 1][var21] = 2;
                                                field1858[var20 - 1][var21] = var25;
                                                break;
                                            }
                                            if ((var19[var22 - 1][var23 + var26] & 0x124013E) != 0) {
                                                break;
                                            }
                                            var26++;
                                        }
                                    }
                                    if (var20 < 128 - arg2 && field1857[var20 + 1][var21] == 0 && (var19[arg2 + var22][var23] & 0x1240183) == 0 && (var19[arg2 + var22][arg2 + var23 - 1] & 0x12401E0) == 0) {
                                        int var27 = 1;
                                        while (true) {
                                            if (var27 >= arg2 - 1) {
                                                field1865[var56] = var11 + 1;
                                                field1861[var56] = var12;
                                                var56 = var56 + 1 & 0xFFF;
                                                field1857[var20 + 1][var21] = 8;
                                                field1858[var20 + 1][var21] = var25;
                                                break;
                                            }
                                            if ((var19[arg2 + var22][var23 + var27] & 0x12401E3) != 0) {
                                                break;
                                            }
                                            var27++;
                                        }
                                    }
                                    if (var21 > 0 && field1857[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x124010E) == 0 && (var19[arg2 + var22 - 1][var23 - 1] & 0x1240183) == 0) {
                                        int var28 = 1;
                                        while (true) {
                                            if (var28 >= arg2 - 1) {
                                                field1865[var56] = var11;
                                                field1861[var56] = var12 - 1;
                                                var56 = var56 + 1 & 0xFFF;
                                                field1857[var20][var21 - 1] = 1;
                                                field1858[var20][var21 - 1] = var25;
                                                break;
                                            }
                                            if ((var19[var22 + var28][var23 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var28++;
                                        }
                                    }
                                    if (var21 < 128 - arg2 && field1857[var20][var21 + 1] == 0 && (var19[var22][arg2 + var23] & 0x1240138) == 0 && (var19[arg2 + var22 - 1][arg2 + var23] & 0x12401E0) == 0) {
                                        int var29 = 1;
                                        while (true) {
                                            if (var29 >= arg2 - 1) {
                                                field1865[var56] = var11;
                                                field1861[var56] = var12 + 1;
                                                var56 = var56 + 1 & 0xFFF;
                                                field1857[var20][var21 + 1] = 4;
                                                field1858[var20][var21 + 1] = var25;
                                                break;
                                            }
                                            if ((var19[var22 + var29][arg2 + var23] & 0x12401F8) != 0) {
                                                break;
                                            }
                                            var29++;
                                        }
                                    }
                                    if (var20 > 0 && var21 > 0 && field1857[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23 - 1] & 0x124010E) == 0) {
                                        int var30 = 1;
                                        while (true) {
                                            if (var30 >= arg2) {
                                                field1865[var56] = var11 - 1;
                                                field1861[var56] = var12 - 1;
                                                var56 = var56 + 1 & 0xFFF;
                                                field1857[var20 - 1][var21 - 1] = 3;
                                                field1858[var20 - 1][var21 - 1] = var25;
                                                break;
                                            }
                                            if ((var19[var22 - 1][var23 - 1 + var30] & 0x124013E) != 0 || (var19[var22 - 1 + var30][var23 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var30++;
                                        }
                                    }
                                    if (var20 < 128 - arg2 && var21 > 0 && field1857[var20 + 1][var21 - 1] == 0 && (var19[arg2 + var22][var23 - 1] & 0x1240183) == 0) {
                                        int var31 = 1;
                                        while (true) {
                                            if (var31 >= arg2) {
                                                field1865[var56] = var11 + 1;
                                                field1861[var56] = var12 - 1;
                                                var56 = var56 + 1 & 0xFFF;
                                                field1857[var20 + 1][var21 - 1] = 9;
                                                field1858[var20 + 1][var21 - 1] = var25;
                                                break;
                                            }
                                            if ((var19[arg2 + var22][var23 - 1 + var31] & 0x12401E3) != 0 || (var19[var22 + var31][var23 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var31++;
                                        }
                                    }
                                    if (var20 > 0 && var21 < 128 - arg2 && field1857[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][arg2 + var23] & 0x1240138) == 0) {
                                        for (int var32 = 1; var32 < arg2; var32++) {
                                            if ((var19[var22 - 1][var23 + var32] & 0x124013E) != 0 || (var19[var22 - 1 + var32][arg2 + var23] & 0x12401F8) != 0) {
                                                continue label370;
                                            }
                                        }
                                        field1865[var56] = var11 - 1;
                                        field1861[var56] = var12 + 1;
                                        var56 = var56 + 1 & 0xFFF;
                                        field1857[var20 - 1][var21 + 1] = 6;
                                        field1858[var20 - 1][var21 + 1] = var25;
                                    }
                                } while (var20 >= 128 - arg2);
                            } while (var21 >= 128 - arg2);
                        } while (field1857[var20 + 1][var21 + 1] != 0);
                    } while ((var19[arg2 + var22][arg2 + var23] & 0x12401E0) != 0);
                    for (int var33 = 1; var33 < arg2; var33++) {
                        if ((var19[var22 + var33][arg2 + var23] & 0x12401F8) != 0 || (var19[arg2 + var22][var23 + var33] & 0x12401E3) != 0) {
                            continue label393;
                        }
                    }
                    field1865[var56] = var11 + 1;
                    field1861[var56] = var12 + 1;
                    var56 = var56 + 1 & 0xFFF;
                    field1857[var20 + 1][var21 + 1] = 12;
                    field1858[var20 + 1][var21 + 1] = var25;
                }
            }
            var10 = var24;
        }
        int var34 = arg0 - 64;
        int var35 = arg1 - 64;
        int var36 = Statics.field1346;
        int var37 = Statics.field81;
        if (!var10) {
            if (!arg5) {
                return -1;
            }
            int var38 = Integer.MAX_VALUE;
            int var39 = Integer.MAX_VALUE;
            byte var40 = 10;
            int var41 = arg3.field1879;
            int var42 = arg3.field1869;
            int var43 = arg3.field1870;
            int var44 = arg3.field1871;
            for (int var45 = var41 - var40; var45 <= var40 + var41; var45++) {
                for (int var46 = var42 - var40; var46 <= var40 + var42; var46++) {
                    int var47 = var45 - var34;
                    int var48 = var46 - var35;
                    if (var47 >= 0 && var48 >= 0 && var47 < 128 && var48 < 128 && field1858[var47][var48] < 100) {
                        int var49 = 0;
                        if (var45 < var41) {
                            var49 = var41 - var45;
                        } else if (var45 > var41 + var43 - 1) {
                            var49 = var45 - (var41 + var43 - 1);
                        }
                        int var50 = 0;
                        if (var46 < var42) {
                            var50 = var42 - var46;
                        } else if (var46 > var42 + var44 - 1) {
                            var50 = var46 - (var42 + var44 - 1);
                        }
                        int var51 = var49 * var49 + var50 * var50;
                        if (var51 < var38 || var38 == var51 && field1858[var47][var48] < var39) {
                            var38 = var51;
                            var39 = field1858[var47][var48];
                            var36 = var45;
                            var37 = var46;
                        }
                    }
                }
            }
            if (var38 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg0 == var36 && arg1 == var37) {
            return 0;
        }
        byte var52 = 0;
        field1865[var52] = var36;
        int var57 = var52 + 1;
        field1861[var52] = var37;
        int var53;
        int var54 = var53 = field1857[var36 - var34][var37 - var35];
        while (arg0 != var36 || arg1 != var37) {
            if (var53 != var54) {
                var53 = var54;
                field1865[var57] = var36;
                field1861[var57++] = var37;
            }
            if ((var54 & 0x2) != 0) {
                var36++;
            } else if ((var54 & 0x8) != 0) {
                var36--;
            }
            if ((var54 & 0x1) != 0) {
                var37++;
            } else if ((var54 & 0x4) != 0) {
                var37--;
            }
            var54 = field1857[var36 - var34][var37 - var35];
        }
        int var55 = 0;
        while (var57-- > 0) {
            arg6[var55] = field1865[var57];
            arg7[var55++] = field1861[var57];
            if (var55 >= arg6.length) {
                break;
            }
        }
        return var55;
    }

    @ObfuscatedName("cu.f(IILdz;Ldf;I)Z")
    public static final boolean method1974(int arg0, int arg1, class107 arg2, class108 arg3) {
        int var4 = arg0;
        int var5 = arg1;
        byte var6 = 64;
        byte var7 = 64;
        int var8 = arg0 - var6;
        int var9 = arg1 - var7;
        field1857[var6][var7] = 99;
        field1858[var6][var7] = 0;
        byte var10 = 0;
        int var11 = 0;
        field1865[var10] = arg0;
        byte var10001 = var10;
        int var18 = var10 + 1;
        field1861[var10001] = arg1;
        int[][] var12 = arg3.field1896;
        while (var18 != var11) {
            var4 = field1865[var11];
            var5 = field1861[var11];
            var11 = var11 + 1 & 0xFFF;
            int var13 = var4 - var8;
            int var14 = var5 - var9;
            int var15 = var4 - arg3.field1893;
            int var16 = var5 - arg3.field1894;
            if (arg2.method108(1, var4, var5, arg3)) {
                Statics.field1346 = var4;
                Statics.field81 = var5;
                return true;
            }
            int var17 = field1858[var13][var14] + 1;
            if (var13 > 0 && field1857[var13 - 1][var14] == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0) {
                field1865[var18] = var4 - 1;
                field1861[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field1857[var13 - 1][var14] = 2;
                field1858[var13 - 1][var14] = var17;
            }
            if (var13 < 127 && field1857[var13 + 1][var14] == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0) {
                field1865[var18] = var4 + 1;
                field1861[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field1857[var13 + 1][var14] = 8;
                field1858[var13 + 1][var14] = var17;
            }
            if (var14 > 0 && field1857[var13][var14 - 1] == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                field1865[var18] = var4;
                field1861[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field1857[var13][var14 - 1] = 1;
                field1858[var13][var14 - 1] = var17;
            }
            if (var14 < 127 && field1857[var13][var14 + 1] == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                field1865[var18] = var4;
                field1861[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field1857[var13][var14 + 1] = 4;
                field1858[var13][var14 + 1] = var17;
            }
            if (var13 > 0 && var14 > 0 && field1857[var13 - 1][var14 - 1] == 0 && (var12[var15 - 1][var16 - 1] & 0x124010E) == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                field1865[var18] = var4 - 1;
                field1861[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field1857[var13 - 1][var14 - 1] = 3;
                field1858[var13 - 1][var14 - 1] = var17;
            }
            if (var13 < 127 && var14 > 0 && field1857[var13 + 1][var14 - 1] == 0 && (var12[var15 + 1][var16 - 1] & 0x1240183) == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                field1865[var18] = var4 + 1;
                field1861[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field1857[var13 + 1][var14 - 1] = 9;
                field1858[var13 + 1][var14 - 1] = var17;
            }
            if (var13 > 0 && var14 < 127 && field1857[var13 - 1][var14 + 1] == 0 && (var12[var15 - 1][var16 + 1] & 0x1240138) == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                field1865[var18] = var4 - 1;
                field1861[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field1857[var13 - 1][var14 + 1] = 6;
                field1858[var13 - 1][var14 + 1] = var17;
            }
            if (var13 < 127 && var14 < 127 && field1857[var13 + 1][var14 + 1] == 0 && (var12[var15 + 1][var16 + 1] & 0x12401E0) == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                field1865[var18] = var4 + 1;
                field1861[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field1857[var13 + 1][var14 + 1] = 12;
                field1858[var13 + 1][var14 + 1] = var17;
            }
        }
        Statics.field1346 = var4;
        Statics.field81 = var5;
        return false;
    }

    @ObfuscatedName("m.i(IILdz;Ldf;I)Z")
    public static final boolean method80(int arg0, int arg1, class107 arg2, class108 arg3) {
        int var4 = arg0;
        int var5 = arg1;
        byte var6 = 64;
        byte var7 = 64;
        int var8 = arg0 - var6;
        int var9 = arg1 - var7;
        field1857[var6][var7] = 99;
        field1858[var6][var7] = 0;
        byte var10 = 0;
        int var11 = 0;
        field1865[var10] = arg0;
        byte var10001 = var10;
        int var18 = var10 + 1;
        field1861[var10001] = arg1;
        int[][] var12 = arg3.field1896;
        while (var18 != var11) {
            var4 = field1865[var11];
            var5 = field1861[var11];
            var11 = var11 + 1 & 0xFFF;
            int var13 = var4 - var8;
            int var14 = var5 - var9;
            int var15 = var4 - arg3.field1893;
            int var16 = var5 - arg3.field1894;
            if (arg2.method108(2, var4, var5, arg3)) {
                Statics.field1346 = var4;
                Statics.field81 = var5;
                return true;
            }
            int var17 = field1858[var13][var14] + 1;
            if (var13 > 0 && field1857[var13 - 1][var14] == 0 && (var12[var15 - 1][var16] & 0x124010E) == 0 && (var12[var15 - 1][var16 + 1] & 0x1240138) == 0) {
                field1865[var18] = var4 - 1;
                field1861[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field1857[var13 - 1][var14] = 2;
                field1858[var13 - 1][var14] = var17;
            }
            if (var13 < 126 && field1857[var13 + 1][var14] == 0 && (var12[var15 + 2][var16] & 0x1240183) == 0 && (var12[var15 + 2][var16 + 1] & 0x12401E0) == 0) {
                field1865[var18] = var4 + 1;
                field1861[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field1857[var13 + 1][var14] = 8;
                field1858[var13 + 1][var14] = var17;
            }
            if (var14 > 0 && field1857[var13][var14 - 1] == 0 && (var12[var15][var16 - 1] & 0x124010E) == 0 && (var12[var15 + 1][var16 - 1] & 0x1240183) == 0) {
                field1865[var18] = var4;
                field1861[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field1857[var13][var14 - 1] = 1;
                field1858[var13][var14 - 1] = var17;
            }
            if (var14 < 126 && field1857[var13][var14 + 1] == 0 && (var12[var15][var16 + 2] & 0x1240138) == 0 && (var12[var15 + 1][var16 + 2] & 0x12401E0) == 0) {
                field1865[var18] = var4;
                field1861[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field1857[var13][var14 + 1] = 4;
                field1858[var13][var14 + 1] = var17;
            }
            if (var13 > 0 && var14 > 0 && field1857[var13 - 1][var14 - 1] == 0 && (var12[var15 - 1][var16] & 0x124013E) == 0 && (var12[var15 - 1][var16 - 1] & 0x124010E) == 0 && (var12[var15][var16 - 1] & 0x124018F) == 0) {
                field1865[var18] = var4 - 1;
                field1861[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field1857[var13 - 1][var14 - 1] = 3;
                field1858[var13 - 1][var14 - 1] = var17;
            }
            if (var13 < 126 && var14 > 0 && field1857[var13 + 1][var14 - 1] == 0 && (var12[var15 + 1][var16 - 1] & 0x124018F) == 0 && (var12[var15 + 2][var16 - 1] & 0x1240183) == 0 && (var12[var15 + 2][var16] & 0x12401E3) == 0) {
                field1865[var18] = var4 + 1;
                field1861[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field1857[var13 + 1][var14 - 1] = 9;
                field1858[var13 + 1][var14 - 1] = var17;
            }
            if (var13 > 0 && var14 < 126 && field1857[var13 - 1][var14 + 1] == 0 && (var12[var15 - 1][var16 + 1] & 0x124013E) == 0 && (var12[var15 - 1][var16 + 2] & 0x1240138) == 0 && (var12[var15][var16 + 2] & 0x12401F8) == 0) {
                field1865[var18] = var4 - 1;
                field1861[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field1857[var13 - 1][var14 + 1] = 6;
                field1858[var13 - 1][var14 + 1] = var17;
            }
            if (var13 < 126 && var14 < 126 && field1857[var13 + 1][var14 + 1] == 0 && (var12[var15 + 1][var16 + 2] & 0x12401F8) == 0 && (var12[var15 + 2][var16 + 2] & 0x12401E0) == 0 && (var12[var15 + 2][var16 + 1] & 0x12401E3) == 0) {
                field1865[var18] = var4 + 1;
                field1861[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field1857[var13 + 1][var14 + 1] = 12;
                field1858[var13 + 1][var14 + 1] = var17;
            }
        }
        Statics.field1346 = var4;
        Statics.field81 = var5;
        return false;
    }
}
