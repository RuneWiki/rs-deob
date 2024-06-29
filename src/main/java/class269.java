import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class269 {

    @OriginalMember(owner = "client!am", name = "e", descriptor = "Z")
    public static boolean field4250 = true;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public static int field4252 = 0;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4249 = "Started 3d Library";

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "Ldn;")
    public static class243 field4246;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "[[B")
    public static byte[][] field4251;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V", line = 9)
    public static void method1921(int arg0) {
        field4251 = (byte[][]) null;
        field4246 = null;
        field4249 = null;
        int var1 = -101 % ((-arg0 - 37) / 63);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ZI)V", line = 25)
    public static final void method1922(boolean arg0, int arg1) {
        if (!arg0) {
            field4246 = (class243) null;
        }
        field4247++;
        class22.field329.method1625(arg1, (byte) 97);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "([[II[[BI[[B[Lmm;B[[B[[B[[F[[F[[F)V", line = 41)
    public static final void method1923(int[][] arg0, int arg1, byte[][] arg2, int arg3, byte[][] arg4, class272[] arg5, byte arg6, byte[][] arg7, byte[][] arg8, float[][] arg9, float[][] arg10, float[][] arg11) {
        for (int var12 = 0; var12 < arg1; var12++) {
            class272 var13 = arg5[var12];
            if (var13.field4311 == arg3) {
                class11 var14 = new class11();
                int var15 = 0;
                int var16 = (var13.field4325 >> 7) - var13.field4324;
                int var17 = (var13.field4317 >> 7) - var13.field4324;
                int var18 = (var13.field4317 >> 7) + var13.field4324;
                if (var18 > 103) {
                    var18 = 103;
                }
                if (var17 < 0) {
                    var15 -= var17;
                    var17 = 0;
                }
                for (int var19 = var17; var19 <= var18; var19++) {
                    short var20 = var13.field4331[var15];
                    int var21 = var16 + (var20 >> 8);
                    int var22 = var21 - (1 - (var20 & 0xFF));
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg2[var23][var19] & 0xFF;
                        int var25 = arg8[var23][var19] & 0xFF;
                        boolean var26 = false;
                        if (var25 == 0) {
                            if (var24 == 0) {
                                continue;
                            }
                            class291 var27 = class226.method1651(var24 - 1, (byte) 111);
                            if (var27.field4588 == -1) {
                                continue;
                            }
                            if (arg7[var23][var19] != 0) {
                                int[] var28 = class295.field4633[arg7[var23][var19]];
                                var14.field119 += ((var28.length >> 1) - 2) * 3;
                                var14.field118 += var28.length >> 1;
                                continue;
                            }
                        } else if (var24 != 0) {
                            class291 var29 = class226.method1651(var24 - 1, (byte) 83);
                            if (var29.field4588 == -1) {
                                byte var31 = arg7[var23][var19];
                                if (var31 != 0) {
                                    int[] var32 = class284.field4486[var31];
                                    var14.field119 += (var32.length >> 1) * 3 - 6;
                                    var14.field118 += var32.length >> 1;
                                }
                                continue;
                            }
                            byte var30 = arg7[var23][var19];
                            if (var30 != 0) {
                                var26 = true;
                            }
                        }
                        class271 var33 = class202.method1476(arg3, var23, var19);
                        if (var33 != null) {
                            int var34 = (int) (var33.field4294 >> 14) & 0x3F;
                            if (var34 == 9) {
                                int[] var35 = null;
                                int var36 = (int) (var33.field4294 >> 20) & 0x3;
                                if ((var36 & 0x1) == 0) {
                                    boolean var45 = (var23 + 1) <= var22;
                                    boolean var46 = var23 - 1 >= var21;
                                    if (!var46 && (var19 + 1) <= var18) {
                                        short var47 = var13.field4331[var15 + 1];
                                        int var48 = (var47 >> 8) + var16;
                                        int var49 = (var47 & 0xFF) + var48;
                                        var46 = var23 > var48 && var23 < var49;
                                    }
                                    if (!var45 && var19 - 1 >= var17) {
                                        short var50 = var13.field4331[var15 - 1];
                                        int var51 = var16 + (var50 >> 8);
                                        int var52 = (var50 & 0xFF) + var51;
                                        var45 = var51 < var23 && var23 < var52;
                                    }
                                    if (var46 && var45) {
                                        var35 = class295.field4633[0];
                                    } else if (var46) {
                                        var35 = class295.field4633[1];
                                    } else if (var45) {
                                        var35 = class295.field4633[1];
                                    }
                                } else {
                                    boolean var37 = var23 - 1 >= var21;
                                    boolean var38 = var22 >= (var23 + 1);
                                    if (!var37 && var19 - 1 >= var17) {
                                        short var39 = var13.field4331[var15 - 1];
                                        int var40 = (var39 >> 8) + var16;
                                        int var41 = var40 + (var39 & 0xFF);
                                        var37 = var40 < var23 && var41 > var23;
                                    }
                                    if (!var38 && var18 >= var19 + 1) {
                                        short var42 = var13.field4331[var15 + 1];
                                        int var43 = (var42 >> 8) + var16;
                                        int var44 = (var42 & 0xFF) + var43;
                                        var38 = var43 < var23 && var44 > var23;
                                    }
                                    if (var37 && var38) {
                                        var35 = class295.field4633[0];
                                    } else if (var37) {
                                        var35 = class295.field4633[1];
                                    } else if (var38) {
                                        var35 = class295.field4633[1];
                                    }
                                }
                                if (var35 != null) {
                                    var14.field119 += (var35.length >> 1) * 3 - 6;
                                    var14.field118 += var35.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var26) {
                            int[] var54 = class295.field4633[arg7[var23][var19]];
                            int[] var55 = class284.field4486[arg7[var23][var19]];
                            var14.field119 += ((var54.length >> 1) - 2) * 3;
                            var14.field119 += (var55.length >> 1) * 3 - 6;
                            var14.field118 += var54.length >> 1;
                            var14.field118 += var55.length >> 1;
                        } else {
                            int[] var53 = class295.field4633[0];
                            var14.field119 += ((var53.length >> 1) - 2) * 3;
                            var14.field118 += var53.length >> 1;
                        }
                    }
                    var15++;
                }
                int var56 = 0;
                var14.method66();
                if ((var13.field4317 >> 7) - var13.field4324 < 0) {
                    var56 -= (var13.field4317 >> 7) - var13.field4324;
                }
                for (int var57 = var17; var57 <= var18; var57++) {
                    short var58 = var13.field4331[var56];
                    int var59 = var16 + (var58 >> 8);
                    int var60 = (var58 & 0xFF) + var59 - 1;
                    if (var60 > 103) {
                        var60 = 103;
                    }
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    for (int var61 = var59; var61 <= var60; var61++) {
                        int var62 = arg8[var61][var57] & 0xFF;
                        byte var63 = arg4[var61][var57];
                        int var64 = arg2[var61][var57] & 0xFF;
                        boolean var65 = false;
                        if (var62 == 0) {
                            if (var64 == 0) {
                                continue;
                            }
                            class291 var68 = class226.method1651(var64 - 1, (byte) 116);
                            if (var68.field4588 == -1) {
                                continue;
                            }
                            if (arg7[var61][var57] != 0) {
                                class80.method588(var61, var57, arg0, var14, arg9, arg4[var61][var57], true, arg11, class295.field4633[arg7[var61][var57]], arg10, var13);
                                continue;
                            }
                        } else if (var64 != 0) {
                            class291 var66 = class226.method1651(var64 - 1, (byte) 118);
                            if (var66.field4588 == -1) {
                                class80.method588(var61, var57, arg0, var14, arg9, arg4[var61][var57], true, arg11, class284.field4486[arg7[var61][var57]], arg10, var13);
                                continue;
                            }
                            byte var67 = arg7[var61][var57];
                            if (var67 != 0) {
                                var65 = true;
                            }
                        }
                        class271 var69 = class202.method1476(arg3, var61, var57);
                        if (var69 != null) {
                            int var70 = (int) (var69.field4294 >> 14) & 0x3F;
                            if (var70 == 9) {
                                int[] var71 = null;
                                int var72 = (int) (var69.field4294 >> 20) & 0x3;
                                if ((var72 & 0x1) == 0) {
                                    boolean var81 = var60 >= var61 + 1;
                                    boolean var82 = (var61 - 1) >= var59;
                                    if (!var82 && (var57 + 1) <= var18) {
                                        short var83 = var13.field4331[var56 + 1];
                                        int var84 = (var83 >> 8) + var16;
                                        int var85 = var84 + (var83 & 0xFF);
                                        var82 = var61 > var84 && var61 < var85;
                                    }
                                    if (!var81 && var57 - 1 >= var17) {
                                        short var86 = var13.field4331[var56 - 1];
                                        int var87 = var16 + (var86 >> 8);
                                        int var88 = (var86 & 0xFF) + var87;
                                        var81 = var61 > var87 && var88 > var61;
                                    }
                                    if (var82 && var81) {
                                        var71 = class295.field4633[0];
                                    } else if (var82) {
                                        var71 = class295.field4633[1];
                                        var63 = 1;
                                    } else if (var81) {
                                        var71 = class295.field4633[1];
                                        var63 = 3;
                                    }
                                } else {
                                    boolean var73 = (var61 - 1) >= var59;
                                    boolean var74 = var60 >= var61 + 1;
                                    if (!var73 && var17 <= var57 - 1) {
                                        short var75 = var13.field4331[var56 - 1];
                                        int var76 = var16 + (var75 >> 8);
                                        int var77 = (var75 & 0xFF) + var76;
                                        var73 = var76 < var61 && var77 > var61;
                                    }
                                    if (!var74 && var57 + 1 <= var18) {
                                        short var78 = var13.field4331[var56 + 1];
                                        int var79 = (var78 >> 8) + var16;
                                        int var80 = (var78 & 0xFF) + var79;
                                        var74 = var79 < var61 && var61 < var80;
                                    }
                                    if (var73 && var74) {
                                        var71 = class295.field4633[0];
                                    } else if (var73) {
                                        var71 = class295.field4633[1];
                                        var63 = 0;
                                    } else if (var74) {
                                        var71 = class295.field4633[1];
                                        var63 = 2;
                                    }
                                }
                                if (var71 != null) {
                                    class80.method588(var61, var57, arg0, var14, arg9, var63, true, arg11, var71, arg10, var13);
                                }
                                continue;
                            }
                        }
                        if (var65) {
                            class80.method588(var61, var57, arg0, var14, arg9, arg4[var61][var57], true, arg11, class284.field4486[arg7[var61][var57]], arg10, var13);
                            class80.method588(var61, var57, arg0, var14, arg9, arg4[var61][var57], true, arg11, class295.field4633[arg7[var61][var57]], arg10, var13);
                        } else {
                            class80.method588(var61, var57, arg0, var14, arg9, var63, true, arg11, class295.field4633[0], arg10, var13);
                        }
                    }
                    var56++;
                }
                if (var14.field126 > 0 && var14.field125 > 0) {
                    var14.method67();
                    var13.field4332 = var14;
                }
            }
        }
        if (arg6 < 39) {
            method1921(-2);
        }
        field4248++;
    }
}
