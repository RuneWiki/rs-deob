package deob;

@ObfuscatedName("dy")
public class class119 {

    @ObfuscatedName("dy.i")
    public static int[][] field1840 = new int[128][128];

    @ObfuscatedName("dy.t")
    public static int[][] field1838 = new int[128][128];

    @ObfuscatedName("dy.f")
    public static int[] field1844 = new int[4096];

    @ObfuscatedName("dy.a")
    public static int[] field1845 = new int[4096];

    public class119() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dd.b(IIILds;Ldr;Z[I[IB)I")
    public static int method2023(int arg0, int arg1, int arg2, class120 arg3, class118 arg4, boolean arg5, int[] arg6, int[] arg7) {
        for (int var8 = 0; var8 < 128; var8++) {
            for (int var9 = 0; var9 < 128; var9++) {
                field1840[var8][var9] = 0;
                field1838[var8][var9] = 99999999;
            }
        }
        boolean var10;
        if (arg2 == 1) {
            var10 = method794(arg0, arg1, arg3, arg4);
        } else if (arg2 == 2) {
            int var11 = arg0;
            int var12 = arg1;
            byte var13 = 64;
            byte var14 = 64;
            int var15 = arg0 - var13;
            int var16 = arg1 - var14;
            field1840[var13][var14] = 99;
            field1838[var13][var14] = 0;
            byte var17 = 0;
            int var18 = 0;
            field1844[var17] = arg0;
            int var71 = var17 + 1;
            field1845[var17] = arg1;
            int[][] var19 = arg4.field1826;
            boolean var24;
            while (true) {
                if (var71 == var18) {
                    Statics.field1842 = var11;
                    Statics.field1841 = var12;
                    var24 = false;
                    break;
                }
                var11 = field1844[var18];
                var12 = field1845[var18];
                var18 = var18 + 1 & 0xFFF;
                int var20 = var11 - var15;
                int var21 = var12 - var16;
                int var22 = var11 - arg4.field1825;
                int var23 = var12 - arg4.field1833;
                if (arg3.method219(2, var11, var12, arg4)) {
                    Statics.field1842 = var11;
                    Statics.field1841 = var12;
                    var24 = true;
                    break;
                }
                int var25 = field1838[var20][var21] + 1;
                if (var20 > 0 && field1840[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x124010E) == 0 && (var19[var22 - 1][var23 + 1] & 0x1240138) == 0) {
                    field1844[var71] = var11 - 1;
                    field1845[var71] = var12;
                    var71 = var71 + 1 & 0xFFF;
                    field1840[var20 - 1][var21] = 2;
                    field1838[var20 - 1][var21] = var25;
                }
                if (var20 < 126 && field1840[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x1240183) == 0 && (var19[var22 + 2][var23 + 1] & 0x12401E0) == 0) {
                    field1844[var71] = var11 + 1;
                    field1845[var71] = var12;
                    var71 = var71 + 1 & 0xFFF;
                    field1840[var20 + 1][var21] = 8;
                    field1838[var20 + 1][var21] = var25;
                }
                if (var21 > 0 && field1840[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x124010E) == 0 && (var19[var22 + 1][var23 - 1] & 0x1240183) == 0) {
                    field1844[var71] = var11;
                    field1845[var71] = var12 - 1;
                    var71 = var71 + 1 & 0xFFF;
                    field1840[var20][var21 - 1] = 1;
                    field1838[var20][var21 - 1] = var25;
                }
                if (var21 < 126 && field1840[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x1240138) == 0 && (var19[var22 + 1][var23 + 2] & 0x12401E0) == 0) {
                    field1844[var71] = var11;
                    field1845[var71] = var12 + 1;
                    var71 = var71 + 1 & 0xFFF;
                    field1840[var20][var21 + 1] = 4;
                    field1838[var20][var21 + 1] = var25;
                }
                if (var20 > 0 && var21 > 0 && field1840[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x124013E) == 0 && (var19[var22 - 1][var23 - 1] & 0x124010E) == 0 && (var19[var22][var23 - 1] & 0x124018F) == 0) {
                    field1844[var71] = var11 - 1;
                    field1845[var71] = var12 - 1;
                    var71 = var71 + 1 & 0xFFF;
                    field1840[var20 - 1][var21 - 1] = 3;
                    field1838[var20 - 1][var21 - 1] = var25;
                }
                if (var20 < 126 && var21 > 0 && field1840[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x124018F) == 0 && (var19[var22 + 2][var23 - 1] & 0x1240183) == 0 && (var19[var22 + 2][var23] & 0x12401E3) == 0) {
                    field1844[var71] = var11 + 1;
                    field1845[var71] = var12 - 1;
                    var71 = var71 + 1 & 0xFFF;
                    field1840[var20 + 1][var21 - 1] = 9;
                    field1838[var20 + 1][var21 - 1] = var25;
                }
                if (var20 > 0 && var21 < 126 && field1840[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x124013E) == 0 && (var19[var22 - 1][var23 + 2] & 0x1240138) == 0 && (var19[var22][var23 + 2] & 0x12401F8) == 0) {
                    field1844[var71] = var11 - 1;
                    field1845[var71] = var12 + 1;
                    var71 = var71 + 1 & 0xFFF;
                    field1840[var20 - 1][var21 + 1] = 6;
                    field1838[var20 - 1][var21 + 1] = var25;
                }
                if (var20 < 126 && var21 < 126 && field1840[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x12401F8) == 0 && (var19[var22 + 2][var23 + 2] & 0x12401E0) == 0 && (var19[var22 + 2][var23 + 1] & 0x12401E3) == 0) {
                    field1844[var71] = var11 + 1;
                    field1845[var71] = var12 + 1;
                    var71 = var71 + 1 & 0xFFF;
                    field1840[var20 + 1][var21 + 1] = 12;
                    field1838[var20 + 1][var21 + 1] = var25;
                }
            }
            var10 = var24;
        } else {
            int var26 = arg0;
            int var27 = arg1;
            byte var28 = 64;
            byte var29 = 64;
            int var30 = arg0 - var28;
            int var31 = arg1 - var29;
            field1840[var28][var29] = 99;
            field1838[var28][var29] = 0;
            byte var32 = 0;
            int var33 = 0;
            field1844[var32] = arg0;
            int var72 = var32 + 1;
            field1845[var32] = arg1;
            int[][] var34 = arg4.field1826;
            boolean var39;
            label524: while (true) {
                label522: while (true) {
                    int var35;
                    int var36;
                    int var37;
                    int var38;
                    int var40;
                    do {
                        do {
                            do {
                                label499: do {
                                    if (var72 == var33) {
                                        Statics.field1842 = var26;
                                        Statics.field1841 = var27;
                                        var39 = false;
                                        break label524;
                                    }
                                    var26 = field1844[var33];
                                    var27 = field1845[var33];
                                    var33 = var33 + 1 & 0xFFF;
                                    var35 = var26 - var30;
                                    var36 = var27 - var31;
                                    var37 = var26 - arg4.field1825;
                                    var38 = var27 - arg4.field1833;
                                    if (arg3.method219(arg2, var26, var27, arg4)) {
                                        Statics.field1842 = var26;
                                        Statics.field1841 = var27;
                                        var39 = true;
                                        break label524;
                                    }
                                    var40 = field1838[var35][var36] + 1;
                                    if (var35 > 0 && field1840[var35 - 1][var36] == 0 && (var34[var37 - 1][var38] & 0x124010E) == 0 && (var34[var37 - 1][arg2 + var38 - 1] & 0x1240138) == 0) {
                                        int var41 = 1;
                                        while (true) {
                                            if (var41 >= arg2 - 1) {
                                                field1844[var72] = var26 - 1;
                                                field1845[var72] = var27;
                                                var72 = var72 + 1 & 0xFFF;
                                                field1840[var35 - 1][var36] = 2;
                                                field1838[var35 - 1][var36] = var40;
                                                break;
                                            }
                                            if ((var34[var37 - 1][var38 + var41] & 0x124013E) != 0) {
                                                break;
                                            }
                                            var41++;
                                        }
                                    }
                                    if (var35 < 128 - arg2 && field1840[var35 + 1][var36] == 0 && (var34[arg2 + var37][var38] & 0x1240183) == 0 && (var34[arg2 + var37][arg2 + var38 - 1] & 0x12401E0) == 0) {
                                        int var42 = 1;
                                        while (true) {
                                            if (var42 >= arg2 - 1) {
                                                field1844[var72] = var26 + 1;
                                                field1845[var72] = var27;
                                                var72 = var72 + 1 & 0xFFF;
                                                field1840[var35 + 1][var36] = 8;
                                                field1838[var35 + 1][var36] = var40;
                                                break;
                                            }
                                            if ((var34[arg2 + var37][var38 + var42] & 0x12401E3) != 0) {
                                                break;
                                            }
                                            var42++;
                                        }
                                    }
                                    if (var36 > 0 && field1840[var35][var36 - 1] == 0 && (var34[var37][var38 - 1] & 0x124010E) == 0 && (var34[arg2 + var37 - 1][var38 - 1] & 0x1240183) == 0) {
                                        int var43 = 1;
                                        while (true) {
                                            if (var43 >= arg2 - 1) {
                                                field1844[var72] = var26;
                                                field1845[var72] = var27 - 1;
                                                var72 = var72 + 1 & 0xFFF;
                                                field1840[var35][var36 - 1] = 1;
                                                field1838[var35][var36 - 1] = var40;
                                                break;
                                            }
                                            if ((var34[var37 + var43][var38 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var43++;
                                        }
                                    }
                                    if (var36 < 128 - arg2 && field1840[var35][var36 + 1] == 0 && (var34[var37][arg2 + var38] & 0x1240138) == 0 && (var34[arg2 + var37 - 1][arg2 + var38] & 0x12401E0) == 0) {
                                        int var44 = 1;
                                        while (true) {
                                            if (var44 >= arg2 - 1) {
                                                field1844[var72] = var26;
                                                field1845[var72] = var27 + 1;
                                                var72 = var72 + 1 & 0xFFF;
                                                field1840[var35][var36 + 1] = 4;
                                                field1838[var35][var36 + 1] = var40;
                                                break;
                                            }
                                            if ((var34[var37 + var44][arg2 + var38] & 0x12401F8) != 0) {
                                                break;
                                            }
                                            var44++;
                                        }
                                    }
                                    if (var35 > 0 && var36 > 0 && field1840[var35 - 1][var36 - 1] == 0 && (var34[var37 - 1][var38 - 1] & 0x124010E) == 0) {
                                        int var45 = 1;
                                        while (true) {
                                            if (var45 >= arg2) {
                                                field1844[var72] = var26 - 1;
                                                field1845[var72] = var27 - 1;
                                                var72 = var72 + 1 & 0xFFF;
                                                field1840[var35 - 1][var36 - 1] = 3;
                                                field1838[var35 - 1][var36 - 1] = var40;
                                                break;
                                            }
                                            if ((var34[var37 - 1][var38 - 1 + var45] & 0x124013E) != 0 || (var34[var37 - 1 + var45][var38 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var45++;
                                        }
                                    }
                                    if (var35 < 128 - arg2 && var36 > 0 && field1840[var35 + 1][var36 - 1] == 0 && (var34[arg2 + var37][var38 - 1] & 0x1240183) == 0) {
                                        int var46 = 1;
                                        while (true) {
                                            if (var46 >= arg2) {
                                                field1844[var72] = var26 + 1;
                                                field1845[var72] = var27 - 1;
                                                var72 = var72 + 1 & 0xFFF;
                                                field1840[var35 + 1][var36 - 1] = 9;
                                                field1838[var35 + 1][var36 - 1] = var40;
                                                break;
                                            }
                                            if ((var34[arg2 + var37][var38 - 1 + var46] & 0x12401E3) != 0 || (var34[var37 + var46][var38 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var46++;
                                        }
                                    }
                                    if (var35 > 0 && var36 < 128 - arg2 && field1840[var35 - 1][var36 + 1] == 0 && (var34[var37 - 1][arg2 + var38] & 0x1240138) == 0) {
                                        for (int var47 = 1; var47 < arg2; var47++) {
                                            if ((var34[var37 - 1][var38 + var47] & 0x124013E) != 0 || (var34[var37 - 1 + var47][arg2 + var38] & 0x12401F8) != 0) {
                                                continue label499;
                                            }
                                        }
                                        field1844[var72] = var26 - 1;
                                        field1845[var72] = var27 + 1;
                                        var72 = var72 + 1 & 0xFFF;
                                        field1840[var35 - 1][var36 + 1] = 6;
                                        field1838[var35 - 1][var36 + 1] = var40;
                                    }
                                } while (var35 >= 128 - arg2);
                            } while (var36 >= 128 - arg2);
                        } while (field1840[var35 + 1][var36 + 1] != 0);
                    } while ((var34[arg2 + var37][arg2 + var38] & 0x12401E0) != 0);
                    for (int var48 = 1; var48 < arg2; var48++) {
                        if ((var34[var37 + var48][arg2 + var38] & 0x12401F8) != 0 || (var34[arg2 + var37][var38 + var48] & 0x12401E3) != 0) {
                            continue label522;
                        }
                    }
                    field1844[var72] = var26 + 1;
                    field1845[var72] = var27 + 1;
                    var72 = var72 + 1 & 0xFFF;
                    field1840[var35 + 1][var36 + 1] = 12;
                    field1838[var35 + 1][var36 + 1] = var40;
                }
            }
            var10 = var39;
        }
        int var49 = arg0 - 64;
        int var50 = arg1 - 64;
        int var51 = Statics.field1842;
        int var52 = Statics.field1841;
        if (!var10) {
            if (!arg5) {
                return -1;
            }
            int var53 = Integer.MAX_VALUE;
            int var54 = Integer.MAX_VALUE;
            byte var55 = 10;
            int var56 = arg3.field1855;
            int var57 = arg3.field1850;
            int var58 = arg3.field1851;
            int var59 = arg3.field1852;
            for (int var60 = var56 - var55; var60 <= var55 + var56; var60++) {
                for (int var61 = var57 - var55; var61 <= var55 + var57; var61++) {
                    int var62 = var60 - var49;
                    int var63 = var61 - var50;
                    if (var62 >= 0 && var63 >= 0 && var62 < 128 && var63 < 128 && field1838[var62][var63] < 100) {
                        int var64 = 0;
                        if (var60 < var56) {
                            var64 = var56 - var60;
                        } else if (var60 > var56 + var58 - 1) {
                            var64 = var60 - (var56 + var58 - 1);
                        }
                        int var65 = 0;
                        if (var61 < var57) {
                            var65 = var57 - var61;
                        } else if (var61 > var57 + var59 - 1) {
                            var65 = var61 - (var57 + var59 - 1);
                        }
                        int var66 = var64 * var64 + var65 * var65;
                        if (var66 < var53 || var53 == var66 && field1838[var62][var63] < var54) {
                            var53 = var66;
                            var54 = field1838[var62][var63];
                            var51 = var60;
                            var52 = var61;
                        }
                    }
                }
            }
            if (var53 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg0 == var51 && arg1 == var52) {
            return 0;
        }
        byte var67 = 0;
        field1844[var67] = var51;
        int var73 = var67 + 1;
        field1845[var67] = var52;
        int var68;
        int var69 = var68 = field1840[var51 - var49][var52 - var50];
        while (arg0 != var51 || arg1 != var52) {
            if (var68 != var69) {
                var68 = var69;
                field1844[var73] = var51;
                field1845[var73++] = var52;
            }
            if ((var69 & 0x2) != 0) {
                var51++;
            } else if ((var69 & 0x8) != 0) {
                var51--;
            }
            if ((var69 & 0x1) != 0) {
                var52++;
            } else if ((var69 & 0x4) != 0) {
                var52--;
            }
            var69 = field1840[var51 - var49][var52 - var50];
        }
        int var70 = 0;
        while (var73-- > 0) {
            arg6[var70] = field1844[var73];
            arg7[var70++] = field1845[var73];
            if (var70 >= arg6.length) {
                break;
            }
        }
        return var70;
    }

    @ObfuscatedName("ai.l(IILds;Ldr;I)Z")
    public static final boolean method794(int arg0, int arg1, class120 arg2, class118 arg3) {
        int var4 = arg0;
        int var5 = arg1;
        byte var6 = 64;
        byte var7 = 64;
        int var8 = arg0 - var6;
        int var9 = arg1 - var7;
        field1840[var6][var7] = 99;
        field1838[var6][var7] = 0;
        byte var10 = 0;
        int var11 = 0;
        field1844[var10] = arg0;
        byte var10001 = var10;
        int var18 = var10 + 1;
        field1845[var10001] = arg1;
        int[][] var12 = arg3.field1826;
        while (var18 != var11) {
            var4 = field1844[var11];
            var5 = field1845[var11];
            var11 = var11 + 1 & 0xFFF;
            int var13 = var4 - var8;
            int var14 = var5 - var9;
            int var15 = var4 - arg3.field1825;
            int var16 = var5 - arg3.field1833;
            if (arg2.method219(1, var4, var5, arg3)) {
                Statics.field1842 = var4;
                Statics.field1841 = var5;
                return true;
            }
            int var17 = field1838[var13][var14] + 1;
            if (var13 > 0 && field1840[var13 - 1][var14] == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0) {
                field1844[var18] = var4 - 1;
                field1845[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field1840[var13 - 1][var14] = 2;
                field1838[var13 - 1][var14] = var17;
            }
            if (var13 < 127 && field1840[var13 + 1][var14] == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0) {
                field1844[var18] = var4 + 1;
                field1845[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field1840[var13 + 1][var14] = 8;
                field1838[var13 + 1][var14] = var17;
            }
            if (var14 > 0 && field1840[var13][var14 - 1] == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                field1844[var18] = var4;
                field1845[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field1840[var13][var14 - 1] = 1;
                field1838[var13][var14 - 1] = var17;
            }
            if (var14 < 127 && field1840[var13][var14 + 1] == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                field1844[var18] = var4;
                field1845[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field1840[var13][var14 + 1] = 4;
                field1838[var13][var14 + 1] = var17;
            }
            if (var13 > 0 && var14 > 0 && field1840[var13 - 1][var14 - 1] == 0 && (var12[var15 - 1][var16 - 1] & 0x124010E) == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                field1844[var18] = var4 - 1;
                field1845[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field1840[var13 - 1][var14 - 1] = 3;
                field1838[var13 - 1][var14 - 1] = var17;
            }
            if (var13 < 127 && var14 > 0 && field1840[var13 + 1][var14 - 1] == 0 && (var12[var15 + 1][var16 - 1] & 0x1240183) == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                field1844[var18] = var4 + 1;
                field1845[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field1840[var13 + 1][var14 - 1] = 9;
                field1838[var13 + 1][var14 - 1] = var17;
            }
            if (var13 > 0 && var14 < 127 && field1840[var13 - 1][var14 + 1] == 0 && (var12[var15 - 1][var16 + 1] & 0x1240138) == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                field1844[var18] = var4 - 1;
                field1845[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field1840[var13 - 1][var14 + 1] = 6;
                field1838[var13 - 1][var14 + 1] = var17;
            }
            if (var13 < 127 && var14 < 127 && field1840[var13 + 1][var14 + 1] == 0 && (var12[var15 + 1][var16 + 1] & 0x12401E0) == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                field1844[var18] = var4 + 1;
                field1845[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field1840[var13 + 1][var14 + 1] = 12;
                field1838[var13 + 1][var14 + 1] = var17;
            }
        }
        Statics.field1842 = var4;
        Statics.field1841 = var5;
        return false;
    }
}
