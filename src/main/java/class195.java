import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public abstract class class195 {

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "Ldb;")
    public static class102 field3188 = new class102(30);

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3189 = "scroll:";

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "[[[B")
    public static byte[][][] field3191;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIZIII)V", line = 5)
    public static final void method1435(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class157 var7 = class275.method1996(113, arg5, arg1);
        field3184++;
        if (var7 != null && var7.field2518 != null) {
            class39 var8 = new class39();
            var8.field500 = var7;
            var8.field501 = var7.field2518;
            class144.method1065(var8, (byte) 67);
        }
        class301.field4728 = arg0;
        class331.field5165 = arg6;
        class158.field2615 = arg4;
        class182.field3013 = arg5;
        if (!arg3) {
            class311.field4851 = arg1;
            class222.field3560 = arg2;
            class142.field2216 = true;
            class320.method2252(var7, 0);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 34)
    public static final void method1436(int arg0) {
        class186.field3079 = 0;
        field3185++;
        int var1 = (class191.field3129.field4255 >> 7) + class70.field989;
        if (arg0 < 53) {
            return;
        }
        int var2 = (class191.field3129.field4264 >> 7) + class205.field3367;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class186.field3079 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class186.field3079 = 1;
        }
        if (class186.field3079 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class186.field3079 = 0;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILak;ILak;Z)Lbk;", line = 64)
    public static final class126 method1437(int arg0, class172 arg1, int arg2, class172 arg3, boolean arg4) {
        field3183++;
        int[] var5 = arg3.method1300(arg0, true);
        boolean var6 = true;
        int var7 = 0;
        if (arg2 >= -51) {
            field3188 = (class102) null;
        }
        while (var7 < var5.length) {
            byte[] var8 = arg3.method1272(arg0, var5[var7], 103);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = var8[0] & 0xFF << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg4) {
                    var10 = arg1.method1272(0, var9, 93);
                } else {
                    var10 = arg1.method1272(var9, 0, 111);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
            var7++;
        }
        if (!var6) {
            return null;
        }
        try {
            return new class126(arg3, arg1, arg0, arg4);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I[[FI[[I[[B[[F[[B[[B[[BI[Lhm;[[F)V", line = 123)
    public static final void method1439(int arg0, float[][] arg1, int arg2, int[][] arg3, byte[][] arg4, float[][] arg5, byte[][] arg6, byte[][] arg7, byte[][] arg8, int arg9, class48[] arg10, float[][] arg11) {
        field3187++;
        if (arg9 != -1) {
            field3191 = (byte[][][]) ((byte[][][]) null);
        }
        for (int var12 = 0; var12 < arg2; var12++) {
            class48 var13 = arg10[var12];
            if (var13.field666 == arg0) {
                class19 var14 = new class19();
                int var15 = 0;
                int var16 = (var13.field678 >> 7) - var13.field665;
                int var17 = (var13.field657 >> 7) - var13.field665;
                int var18 = (var13.field657 >> 7) + var13.field665;
                if (var18 > 103) {
                    var18 = 103;
                }
                if (var17 < 0) {
                    var15 -= var17;
                    var17 = 0;
                }
                for (int var19 = var17; var19 <= var18; var19++) {
                    short var20 = var13.field674[var15];
                    int var21 = var16 + (var20 >> 8);
                    int var22 = (var20 & 0xFF) + var21 - 1;
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg4[var23][var19] & 0xFF;
                        int var25 = arg6[var23][var19] & 0xFF;
                        boolean var26 = false;
                        if (var24 == 0) {
                            if (var25 == 0) {
                                continue;
                            }
                            class278 var27 = class271.method1925((byte) 15, var25 - 1);
                            if (var27.field4471 == -1) {
                                continue;
                            }
                            if (arg7[var23][var19] != 0) {
                                int[] var28 = class17.field233[arg7[var23][var19]];
                                var14.field267 += ((var28.length >> 1) - 2) * 3;
                                var14.field263 += var28.length >> 1;
                                continue;
                            }
                        } else if (var25 != 0) {
                            class278 var29 = class271.method1925((byte) 15, var25 - 1);
                            if (var29.field4471 == -1) {
                                byte var31 = arg7[var23][var19];
                                if (var31 != 0) {
                                    int[] var32 = class94.field1283[var31];
                                    var14.field267 += ((var32.length >> 1) - 2) * 3;
                                    var14.field263 += var32.length >> 1;
                                }
                                continue;
                            }
                            byte var30 = arg7[var23][var19];
                            if (var30 != 0) {
                                var26 = true;
                            }
                        }
                        class153 var33 = class61.method411(arg0, var23, var19);
                        if (var33 != null) {
                            int var34 = (int) (var33.field2358 >> 14) & 0x3F;
                            if (var34 == 9) {
                                int[] var35 = null;
                                int var36 = (int) (var33.field2358 >> 20) & 0x3;
                                if ((var36 & 0x1) == 0) {
                                    boolean var37 = var21 <= var23 - 1;
                                    boolean var38 = (var23 + 1) <= var22;
                                    if (!var37 && var19 + 1 <= var18) {
                                        short var39 = var13.field674[var15 + 1];
                                        int var40 = (var39 >> 8) + var16;
                                        int var41 = var40 + (var39 & 0xFF);
                                        var37 = var23 > var40 && var41 > var23;
                                    }
                                    if (!var38 && var17 <= (var19 - 1)) {
                                        short var42 = var13.field674[var15 - 1];
                                        int var43 = var16 + (var42 >> 8);
                                        int var44 = (var42 & 0xFF) + var43;
                                        var38 = var43 < var23 && var23 < var44;
                                    }
                                    if (var37 && var38) {
                                        var35 = class17.field233[0];
                                    } else if (var37) {
                                        var35 = class17.field233[1];
                                    } else if (var38) {
                                        var35 = class17.field233[1];
                                    }
                                } else {
                                    boolean var45 = var23 - 1 >= var21;
                                    boolean var46 = var22 >= (var23 + 1);
                                    if (!var45 && var19 - 1 >= var17) {
                                        short var47 = var13.field674[var15 - 1];
                                        int var48 = (var47 >> 8) + var16;
                                        int var49 = var48 + (var47 & 0xFF);
                                        var45 = var48 < var23 && var23 < var49;
                                    }
                                    if (!var46 && var19 + 1 <= var18) {
                                        short var50 = var13.field674[var15 + 1];
                                        int var51 = var16 + (var50 >> 8);
                                        int var52 = (var50 & 0xFF) + var51;
                                        var46 = var23 > var51 && var23 < var52;
                                    }
                                    if (var45 && var46) {
                                        var35 = class17.field233[0];
                                    } else if (var45) {
                                        var35 = class17.field233[1];
                                    } else if (var46) {
                                        var35 = class17.field233[1];
                                    }
                                }
                                if (var35 != null) {
                                    var14.field267 += ((var35.length >> 1) - 2) * 3;
                                    var14.field263 += var35.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var26) {
                            int[] var53 = class94.field1283[arg7[var23][var19]];
                            int[] var54 = class17.field233[arg7[var23][var19]];
                            var14.field267 += ((var54.length >> 1) - 2) * 3;
                            var14.field267 += ((var53.length >> 1) - 2) * 3;
                            var14.field263 += var54.length >> 1;
                            var14.field263 += var53.length >> 1;
                        } else {
                            int[] var55 = class17.field233[0];
                            var14.field267 += (var55.length >> 1) * 3 - 6;
                            var14.field263 += var55.length >> 1;
                        }
                    }
                    var15++;
                }
                int var56 = 0;
                var14.method101();
                if ((var13.field657 >> 7) - var13.field665 < 0) {
                    var56 -= (var13.field657 >> 7) - var13.field665;
                }
                for (int var57 = var17; var57 <= var18; var57++) {
                    short var58 = var13.field674[var56];
                    int var59 = (var58 >> 8) + var16;
                    int var60 = (var58 & 0xFF) + var59 - 1;
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    if (var60 > 103) {
                        var60 = 103;
                    }
                    for (int var61 = var59; var61 <= var60; var61++) {
                        byte var62 = arg8[var61][var57];
                        int var63 = arg4[var61][var57] & 0xFF;
                        int var64 = arg6[var61][var57] & 0xFF;
                        boolean var65 = false;
                        if (var63 == 0) {
                            if (var64 == 0) {
                                continue;
                            }
                            class278 var66 = class271.method1925((byte) 15, var64 - 1);
                            if (var66.field4471 == -1) {
                                continue;
                            }
                            if (arg7[var61][var57] != 0) {
                                class109.method753(class17.field233[arg7[var61][var57]], var57, var61, arg3, var14, 121, arg11, arg1, var13, arg8[var61][var57], arg5);
                                continue;
                            }
                        } else if (var64 != 0) {
                            class278 var67 = class271.method1925((byte) 15, var64 - 1);
                            if (var67.field4471 == -1) {
                                class109.method753(class94.field1283[arg7[var61][var57]], var57, var61, arg3, var14, 119, arg11, arg1, var13, arg8[var61][var57], arg5);
                                continue;
                            }
                            byte var68 = arg7[var61][var57];
                            if (var68 != 0) {
                                var65 = true;
                            }
                        }
                        class153 var69 = class61.method411(arg0, var61, var57);
                        if (var69 != null) {
                            int var70 = (int) (var69.field2358 >> 14) & 0x3F;
                            if (var70 == 9) {
                                int var71 = (int) (var69.field2358 >> 20) & 0x3;
                                int[] var72 = null;
                                if ((var71 & 0x1) == 0) {
                                    boolean var73 = var59 <= var61 - 1;
                                    boolean var74 = var61 + 1 <= var60;
                                    if (!var73 && var57 + 1 <= var18) {
                                        short var75 = var13.field674[var56 + 1];
                                        int var76 = (var75 >> 8) + var16;
                                        int var77 = var76 + (var75 & 0xFF);
                                        var73 = var61 > var76 && var77 > var61;
                                    }
                                    if (!var74 && (var57 - 1) >= var17) {
                                        short var78 = var13.field674[var56 - 1];
                                        int var79 = (var78 >> 8) + var16;
                                        int var80 = (var78 & 0xFF) + var79;
                                        var74 = var61 > var79 && var80 > var61;
                                    }
                                    if (var73 && var74) {
                                        var72 = class17.field233[0];
                                    } else if (var73) {
                                        var62 = 1;
                                        var72 = class17.field233[1];
                                    } else if (var74) {
                                        var72 = class17.field233[1];
                                        var62 = 3;
                                    }
                                } else {
                                    boolean var81 = var59 <= (var61 - 1);
                                    boolean var82 = var61 + 1 <= var60;
                                    if (!var81 && var17 <= (var57 - 1)) {
                                        short var83 = var13.field674[var56 - 1];
                                        int var84 = (var83 >> 8) + var16;
                                        int var85 = (var83 & 0xFF) + var84;
                                        var81 = var61 > var84 && var61 < var85;
                                    }
                                    if (!var82 && var57 + 1 <= var18) {
                                        short var86 = var13.field674[var56 + 1];
                                        int var87 = var16 + (var86 >> 8);
                                        int var88 = (var86 & 0xFF) + var87;
                                        var82 = var61 > var87 && var88 > var61;
                                    }
                                    if (var81 && var82) {
                                        var72 = class17.field233[0];
                                    } else if (var81) {
                                        var62 = 0;
                                        var72 = class17.field233[1];
                                    } else if (var82) {
                                        var72 = class17.field233[1];
                                        var62 = 2;
                                    }
                                }
                                if (var72 != null) {
                                    class109.method753(var72, var57, var61, arg3, var14, 93, arg11, arg1, var13, var62, arg5);
                                }
                                continue;
                            }
                        }
                        if (var65) {
                            class109.method753(class94.field1283[arg7[var61][var57]], var57, var61, arg3, var14, 115, arg11, arg1, var13, arg8[var61][var57], arg5);
                            class109.method753(class17.field233[arg7[var61][var57]], var57, var61, arg3, var14, arg9 + 113, arg11, arg1, var13, arg8[var61][var57], arg5);
                        } else {
                            class109.method753(class17.field233[0], var57, var61, arg3, var14, -94, arg11, arg1, var13, var62, arg5);
                        }
                    }
                    var56++;
                }
                if (var14.field257 > 0 && var14.field262 > 0) {
                    var14.method105();
                    var13.field650 = var14;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V", line = 646)
    public static void method1440(int arg0) {
        field3189 = null;
        field3188 = null;
        field3191 = (byte[][][]) null;
        if (arg0 != 1) {
            method1440(114);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILbg;)Lbg;")
    public abstract class86 method1438(int arg0, class86 arg1);
}
