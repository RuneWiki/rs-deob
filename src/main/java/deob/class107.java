package deob;

@ObfuscatedName("dg")
public class class107 {

    @ObfuscatedName("dg.d")
    public static int[][] field1861 = new int[128][128];

    @ObfuscatedName("dg.c")
    public static int[][] field1863 = new int[128][128];

    @ObfuscatedName("dg.p")
    public static int[] field1867 = new int[4096];

    @ObfuscatedName("dg.q")
    public static int[] field1864 = new int[4096];

    public class107() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("o.a(IIILdc;Lde;Z[I[II)I")
    public static int method671(int arg0, int arg1, int arg2, class108 arg3, class109 arg4, boolean arg5, int[] arg6, int[] arg7) {
        for (int var8 = 0; var8 < 128; var8++) {
            for (int var9 = 0; var9 < 128; var9++) {
                field1861[var8][var9] = 0;
                field1863[var8][var9] = 99999999;
            }
        }
        boolean var10;
        if (arg2 == 1) {
            var10 = Statics.method2036(arg0, arg1, arg3, arg4);
        } else if (arg2 == 2) {
            int var11 = arg0;
            int var12 = arg1;
            byte var13 = 64;
            byte var14 = 64;
            int var15 = arg0 - var13;
            int var16 = arg1 - var14;
            field1861[var13][var14] = 99;
            field1863[var13][var14] = 0;
            byte var17 = 0;
            int var18 = 0;
            field1867[var17] = arg0;
            int var48 = var17 + 1;
            field1864[var17] = arg1;
            int[][] var19 = arg4.field1897;
            boolean var24;
            while (true) {
                if (var48 == var18) {
                    Statics.field636 = var11;
                    Statics.field1108 = var12;
                    var24 = false;
                    break;
                }
                var11 = field1867[var18];
                var12 = field1864[var18];
                var18 = var18 + 1 & 0xFFF;
                int var20 = var11 - var15;
                int var21 = var12 - var16;
                int var22 = var11 - arg4.field1893;
                int var23 = var12 - arg4.field1894;
                if (arg3.method164(2, var11, var12, arg4)) {
                    Statics.field636 = var11;
                    Statics.field1108 = var12;
                    var24 = true;
                    break;
                }
                int var25 = field1863[var20][var21] + 1;
                if (var20 > 0 && field1861[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x124010E) == 0 && (var19[var22 - 1][var23 + 1] & 0x1240138) == 0) {
                    field1867[var48] = var11 - 1;
                    field1864[var48] = var12;
                    var48 = var48 + 1 & 0xFFF;
                    field1861[var20 - 1][var21] = 2;
                    field1863[var20 - 1][var21] = var25;
                }
                if (var20 < 126 && field1861[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x1240183) == 0 && (var19[var22 + 2][var23 + 1] & 0x12401E0) == 0) {
                    field1867[var48] = var11 + 1;
                    field1864[var48] = var12;
                    var48 = var48 + 1 & 0xFFF;
                    field1861[var20 + 1][var21] = 8;
                    field1863[var20 + 1][var21] = var25;
                }
                if (var21 > 0 && field1861[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x124010E) == 0 && (var19[var22 + 1][var23 - 1] & 0x1240183) == 0) {
                    field1867[var48] = var11;
                    field1864[var48] = var12 - 1;
                    var48 = var48 + 1 & 0xFFF;
                    field1861[var20][var21 - 1] = 1;
                    field1863[var20][var21 - 1] = var25;
                }
                if (var21 < 126 && field1861[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x1240138) == 0 && (var19[var22 + 1][var23 + 2] & 0x12401E0) == 0) {
                    field1867[var48] = var11;
                    field1864[var48] = var12 + 1;
                    var48 = var48 + 1 & 0xFFF;
                    field1861[var20][var21 + 1] = 4;
                    field1863[var20][var21 + 1] = var25;
                }
                if (var20 > 0 && var21 > 0 && field1861[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x124013E) == 0 && (var19[var22 - 1][var23 - 1] & 0x124010E) == 0 && (var19[var22][var23 - 1] & 0x124018F) == 0) {
                    field1867[var48] = var11 - 1;
                    field1864[var48] = var12 - 1;
                    var48 = var48 + 1 & 0xFFF;
                    field1861[var20 - 1][var21 - 1] = 3;
                    field1863[var20 - 1][var21 - 1] = var25;
                }
                if (var20 < 126 && var21 > 0 && field1861[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x124018F) == 0 && (var19[var22 + 2][var23 - 1] & 0x1240183) == 0 && (var19[var22 + 2][var23] & 0x12401E3) == 0) {
                    field1867[var48] = var11 + 1;
                    field1864[var48] = var12 - 1;
                    var48 = var48 + 1 & 0xFFF;
                    field1861[var20 + 1][var21 - 1] = 9;
                    field1863[var20 + 1][var21 - 1] = var25;
                }
                if (var20 > 0 && var21 < 126 && field1861[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x124013E) == 0 && (var19[var22 - 1][var23 + 2] & 0x1240138) == 0 && (var19[var22][var23 + 2] & 0x12401F8) == 0) {
                    field1867[var48] = var11 - 1;
                    field1864[var48] = var12 + 1;
                    var48 = var48 + 1 & 0xFFF;
                    field1861[var20 - 1][var21 + 1] = 6;
                    field1863[var20 - 1][var21 + 1] = var25;
                }
                if (var20 < 126 && var21 < 126 && field1861[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x12401F8) == 0 && (var19[var22 + 2][var23 + 2] & 0x12401E0) == 0 && (var19[var22 + 2][var23 + 1] & 0x12401E3) == 0) {
                    field1867[var48] = var11 + 1;
                    field1864[var48] = var12 + 1;
                    var48 = var48 + 1 & 0xFFF;
                    field1861[var20 + 1][var21 + 1] = 12;
                    field1863[var20 + 1][var21 + 1] = var25;
                }
            }
            var10 = var24;
        } else {
            var10 = method71(arg0, arg1, arg2, arg3, arg4);
        }
        int var26 = arg0 - 64;
        int var27 = arg1 - 64;
        int var28 = Statics.field636;
        int var29 = Statics.field1108;
        if (!var10) {
            if (!arg5) {
                return -1;
            }
            int var30 = Integer.MAX_VALUE;
            int var31 = Integer.MAX_VALUE;
            byte var32 = 10;
            int var33 = arg3.field1874;
            int var34 = arg3.field1869;
            int var35 = arg3.field1870;
            int var36 = arg3.field1879;
            for (int var37 = var33 - var32; var37 <= var32 + var33; var37++) {
                for (int var38 = var34 - var32; var38 <= var32 + var34; var38++) {
                    int var39 = var37 - var26;
                    int var40 = var38 - var27;
                    if (var39 >= 0 && var40 >= 0 && var39 < 128 && var40 < 128 && field1863[var39][var40] < 100) {
                        int var41 = 0;
                        if (var37 < var33) {
                            var41 = var33 - var37;
                        } else if (var37 > var33 + var35 - 1) {
                            var41 = var37 - (var33 + var35 - 1);
                        }
                        int var42 = 0;
                        if (var38 < var34) {
                            var42 = var34 - var38;
                        } else if (var38 > var34 + var36 - 1) {
                            var42 = var38 - (var34 + var36 - 1);
                        }
                        int var43 = var41 * var41 + var42 * var42;
                        if (var43 < var30 || var30 == var43 && field1863[var39][var40] < var31) {
                            var30 = var43;
                            var31 = field1863[var39][var40];
                            var28 = var37;
                            var29 = var38;
                        }
                    }
                }
            }
            if (var30 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg0 == var28 && arg1 == var29) {
            return 0;
        }
        byte var44 = 0;
        field1867[var44] = var28;
        int var49 = var44 + 1;
        field1864[var44] = var29;
        int var45;
        int var46 = var45 = field1861[var28 - var26][var29 - var27];
        while (arg0 != var28 || arg1 != var29) {
            if (var45 != var46) {
                var45 = var46;
                field1867[var49] = var28;
                field1864[var49++] = var29;
            }
            if ((var46 & 0x2) != 0) {
                var28++;
            } else if ((var46 & 0x8) != 0) {
                var28--;
            }
            if ((var46 & 0x1) != 0) {
                var29++;
            } else if ((var46 & 0x4) != 0) {
                var29--;
            }
            var46 = field1861[var28 - var26][var29 - var27];
        }
        int var47 = 0;
        while (var49-- > 0) {
            arg6[var47] = field1867[var49];
            arg7[var47++] = field1864[var49];
            if (var47 >= arg6.length) {
                break;
            }
        }
        return var47;
    }

    @ObfuscatedName("k.d(IIILdc;Lde;I)Z")
    public static final boolean method71(int arg0, int arg1, int arg2, class108 arg3, class109 arg4) {
        int var5 = arg0;
        int var6 = arg1;
        byte var7 = 64;
        byte var8 = 64;
        int var9 = arg0 - var7;
        int var10 = arg1 - var8;
        field1861[var7][var8] = 99;
        field1863[var7][var8] = 0;
        byte var11 = 0;
        int var12 = 0;
        field1867[var11] = arg0;
        int var27 = var11 + 1;
        field1864[var11] = arg1;
        int[][] var13 = arg4.field1897;
        while (true) {
            label265: while (true) {
                int var14;
                int var15;
                int var16;
                int var17;
                int var18;
                do {
                    do {
                        do {
                            label242: do {
                                if (var27 == var12) {
                                    Statics.field636 = var5;
                                    Statics.field1108 = var6;
                                    return false;
                                }
                                var5 = field1867[var12];
                                var6 = field1864[var12];
                                var12 = var12 + 1 & 0xFFF;
                                var14 = var5 - var9;
                                var15 = var6 - var10;
                                var16 = var5 - arg4.field1893;
                                var17 = var6 - arg4.field1894;
                                if (arg3.method164(arg2, var5, var6, arg4)) {
                                    Statics.field636 = var5;
                                    Statics.field1108 = var6;
                                    return true;
                                }
                                var18 = field1863[var14][var15] + 1;
                                if (var14 > 0 && field1861[var14 - 1][var15] == 0 && (var13[var16 - 1][var17] & 0x124010E) == 0 && (var13[var16 - 1][arg2 + var17 - 1] & 0x1240138) == 0) {
                                    int var19 = 1;
                                    while (true) {
                                        if (var19 >= arg2 - 1) {
                                            field1867[var27] = var5 - 1;
                                            field1864[var27] = var6;
                                            var27 = var27 + 1 & 0xFFF;
                                            field1861[var14 - 1][var15] = 2;
                                            field1863[var14 - 1][var15] = var18;
                                            break;
                                        }
                                        if ((var13[var16 - 1][var17 + var19] & 0x124013E) != 0) {
                                            break;
                                        }
                                        var19++;
                                    }
                                }
                                if (var14 < 128 - arg2 && field1861[var14 + 1][var15] == 0 && (var13[arg2 + var16][var17] & 0x1240183) == 0 && (var13[arg2 + var16][arg2 + var17 - 1] & 0x12401E0) == 0) {
                                    int var20 = 1;
                                    while (true) {
                                        if (var20 >= arg2 - 1) {
                                            field1867[var27] = var5 + 1;
                                            field1864[var27] = var6;
                                            var27 = var27 + 1 & 0xFFF;
                                            field1861[var14 + 1][var15] = 8;
                                            field1863[var14 + 1][var15] = var18;
                                            break;
                                        }
                                        if ((var13[arg2 + var16][var17 + var20] & 0x12401E3) != 0) {
                                            break;
                                        }
                                        var20++;
                                    }
                                }
                                if (var15 > 0 && field1861[var14][var15 - 1] == 0 && (var13[var16][var17 - 1] & 0x124010E) == 0 && (var13[arg2 + var16 - 1][var17 - 1] & 0x1240183) == 0) {
                                    int var21 = 1;
                                    while (true) {
                                        if (var21 >= arg2 - 1) {
                                            field1867[var27] = var5;
                                            field1864[var27] = var6 - 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field1861[var14][var15 - 1] = 1;
                                            field1863[var14][var15 - 1] = var18;
                                            break;
                                        }
                                        if ((var13[var16 + var21][var17 - 1] & 0x124018F) != 0) {
                                            break;
                                        }
                                        var21++;
                                    }
                                }
                                if (var15 < 128 - arg2 && field1861[var14][var15 + 1] == 0 && (var13[var16][arg2 + var17] & 0x1240138) == 0 && (var13[arg2 + var16 - 1][arg2 + var17] & 0x12401E0) == 0) {
                                    int var22 = 1;
                                    while (true) {
                                        if (var22 >= arg2 - 1) {
                                            field1867[var27] = var5;
                                            field1864[var27] = var6 + 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field1861[var14][var15 + 1] = 4;
                                            field1863[var14][var15 + 1] = var18;
                                            break;
                                        }
                                        if ((var13[var16 + var22][arg2 + var17] & 0x12401F8) != 0) {
                                            break;
                                        }
                                        var22++;
                                    }
                                }
                                if (var14 > 0 && var15 > 0 && field1861[var14 - 1][var15 - 1] == 0 && (var13[var16 - 1][var17 - 1] & 0x124010E) == 0) {
                                    int var23 = 1;
                                    while (true) {
                                        if (var23 >= arg2) {
                                            field1867[var27] = var5 - 1;
                                            field1864[var27] = var6 - 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field1861[var14 - 1][var15 - 1] = 3;
                                            field1863[var14 - 1][var15 - 1] = var18;
                                            break;
                                        }
                                        if ((var13[var16 - 1][var17 - 1 + var23] & 0x124013E) != 0 || (var13[var16 - 1 + var23][var17 - 1] & 0x124018F) != 0) {
                                            break;
                                        }
                                        var23++;
                                    }
                                }
                                if (var14 < 128 - arg2 && var15 > 0 && field1861[var14 + 1][var15 - 1] == 0 && (var13[arg2 + var16][var17 - 1] & 0x1240183) == 0) {
                                    int var24 = 1;
                                    while (true) {
                                        if (var24 >= arg2) {
                                            field1867[var27] = var5 + 1;
                                            field1864[var27] = var6 - 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field1861[var14 + 1][var15 - 1] = 9;
                                            field1863[var14 + 1][var15 - 1] = var18;
                                            break;
                                        }
                                        if ((var13[arg2 + var16][var17 - 1 + var24] & 0x12401E3) != 0 || (var13[var16 + var24][var17 - 1] & 0x124018F) != 0) {
                                            break;
                                        }
                                        var24++;
                                    }
                                }
                                if (var14 > 0 && var15 < 128 - arg2 && field1861[var14 - 1][var15 + 1] == 0 && (var13[var16 - 1][arg2 + var17] & 0x1240138) == 0) {
                                    for (int var25 = 1; var25 < arg2; var25++) {
                                        if ((var13[var16 - 1][var17 + var25] & 0x124013E) != 0 || (var13[var16 - 1 + var25][arg2 + var17] & 0x12401F8) != 0) {
                                            continue label242;
                                        }
                                    }
                                    field1867[var27] = var5 - 1;
                                    field1864[var27] = var6 + 1;
                                    var27 = var27 + 1 & 0xFFF;
                                    field1861[var14 - 1][var15 + 1] = 6;
                                    field1863[var14 - 1][var15 + 1] = var18;
                                }
                            } while (var14 >= 128 - arg2);
                        } while (var15 >= 128 - arg2);
                    } while (field1861[var14 + 1][var15 + 1] != 0);
                } while ((var13[arg2 + var16][arg2 + var17] & 0x12401E0) != 0);
                for (int var26 = 1; var26 < arg2; var26++) {
                    if ((var13[var16 + var26][arg2 + var17] & 0x12401F8) != 0 || (var13[arg2 + var16][var17 + var26] & 0x12401E3) != 0) {
                        continue label265;
                    }
                }
                field1867[var27] = var5 + 1;
                field1864[var27] = var6 + 1;
                var27 = var27 + 1 & 0xFFF;
                field1861[var14 + 1][var15 + 1] = 12;
                field1863[var14 + 1][var15 + 1] = var18;
            }
        }
    }
}
