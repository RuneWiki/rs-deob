import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class271 {

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field4528 = -1;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "[I")
    public static int[] field4530 = new int[128];

    @OriginalMember(owner = "client!s", name = "g", descriptor = "Lna;")
    public static class26 field4532 = class69.method505("document)3cookie=(R", (byte) -120);

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field4529 = 0;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "Lna;")
    public static class26 field4535 = class69.method505("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", (byte) -125);

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "[I")
    public static int[] field4526;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "[I")
    public static int[] field4534;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)I", line = 9)
    public static final int method1923(int arg0, int arg1) {
        if (arg1 != -1732504441) {
            method1923(97, -97);
        }
        field4533++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 27)
    public static void method1924(int arg0) {
        field4534 = null;
        if (arg0 != 24241) {
            method1924(84);
        }
        field4526 = null;
        field4530 = null;
        field4532 = null;
        field4535 = null;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(III)V", line = 48)
    public static final void method1925(int arg0, int arg1, int arg2) {
        if (class22.field310 > 0) {
            class80.method571(class22.field310, 0);
            class22.field310 = 0;
        }
        short var3 = 256;
        field4531++;
        int var4 = 0;
        int var5 = class34.field563 * arg2;
        int var6 = 0;
        for (int var7 = 1; var7 < var3 - 1; var7++) {
            int var8 = (var3 - var7) * class132.field2015[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class34.field571[var5++ + arg0];
                int var11 = class68.field1063[var4++];
                if (var11 == 0) {
                    class314.field5383.field4199[var6++] = var10;
                } else {
                    int var12 = var11 + 18;
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = 256 - var11 - 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = class209.field3251[var11];
                    class314.field5383.field4199[var6++] = class4.method23(var13 * class4.method23(var10, 16711935) + class4.method23(16711935, var14) * var12, -16711936) + class4.method23(class4.method23(var14, 65280) * var12 + (class4.method23(65280, var10) * var13), 16711680) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class314.field5383.field4199[var6++] = class34.field571[arg0 + var5++];
            }
            var5 += class34.field563 - 128;
        }
        if (arg1 <= 70) {
            return;
        }
        if (class255.field4184) {
            class326.method2270(class314.field5383.field4199, arg0, arg2, class314.field5383.field2320, class314.field5383.field2308);
        } else {
            class314.field5383.method879(arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([[F[[B[[B[Lgi;II[[F[[B[[B[[II[[F)V", line = 140)
    public static final void method1926(float[][] arg0, byte[][] arg1, byte[][] arg2, class215[] arg3, int arg4, int arg5, float[][] arg6, byte[][] arg7, byte[][] arg8, int[][] arg9, int arg10, float[][] arg11) {
        field4527++;
        for (int var12 = 0; var12 < arg5; var12++) {
            class215 var13 = arg3[var12];
            if (var13.field3363 == arg4) {
                int var14 = 0;
                class238 var15 = new class238();
                int var16 = (var13.field3362 >> 7) - var13.field3355;
                int var17 = (var13.field3369 >> 7) - var13.field3355;
                if (var17 < 0) {
                    var14 -= var17;
                    var17 = 0;
                }
                int var18 = (var13.field3369 >> 7) + var13.field3355;
                if (var18 > 103) {
                    var18 = 103;
                }
                for (int var19 = var17; var19 <= var18; var19++) {
                    short var20 = var13.field3366[var14];
                    int var21 = (var20 >> 8) + var16;
                    int var22 = var21 + (var20 & 0xFF) - 1;
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg1[var23][var19] & 0xFF;
                        int var25 = arg8[var23][var19] & 0xFF;
                        boolean var26 = false;
                        if (var24 == 0) {
                            if (var25 == 0) {
                                continue;
                            }
                            class89 var27 = class144.method960((byte) -103, var25 - 1);
                            if (var27.field1483 == -1) {
                                continue;
                            }
                            if (arg7[var23][var19] != 0) {
                                int[] var28 = class287.field4804[arg7[var23][var19]];
                                var15.field3805 += ((var28.length >> 1) - 2) * 3;
                                var15.field3811 += var28.length >> 1;
                                continue;
                            }
                        } else if (var25 != 0) {
                            class89 var29 = class144.method960((byte) 123, var25 - 1);
                            if (var29.field1483 == -1) {
                                byte var30 = arg7[var23][var19];
                                if (var30 != 0) {
                                    int[] var31 = class39.field657[var30];
                                    var15.field3805 += ((var31.length >> 1) - 2) * 3;
                                    var15.field3811 += var31.length >> 1;
                                }
                                continue;
                            }
                            byte var32 = arg7[var23][var19];
                            if (var32 != 0) {
                                var26 = true;
                            }
                        }
                        class39 var33 = class222.method1483(arg4, var23, var19);
                        if (var33 != null) {
                            int var34 = (int) (var33.field656 >> 14) & 0x3F;
                            if (var34 == 9) {
                                int[] var35 = null;
                                int var36 = (int) (var33.field656 >> 20) & 0x3;
                                if ((var36 & 0x1) == 0) {
                                    boolean var45 = var22 >= var23 + 1;
                                    boolean var46 = var23 - 1 >= var21;
                                    if (!var46 && (var19 + 1) <= var18) {
                                        short var47 = var13.field3366[var14 + 1];
                                        int var48 = (var47 >> 8) + var16;
                                        int var49 = (var47 & 0xFF) + var48;
                                        var46 = var48 < var23 && var23 < var49;
                                    }
                                    if (!var45 && var19 - 1 >= var17) {
                                        short var50 = var13.field3366[var14 - 1];
                                        int var51 = (var50 >> 8) + var16;
                                        int var52 = var51 + (var50 & 0xFF);
                                        var45 = var23 > var51 && var23 < var52;
                                    }
                                    if (var46 && var45) {
                                        var35 = class287.field4804[0];
                                    } else if (var46) {
                                        var35 = class287.field4804[1];
                                    } else if (var45) {
                                        var35 = class287.field4804[1];
                                    }
                                } else {
                                    boolean var37 = var21 <= var23 - 1;
                                    boolean var38 = (var23 + 1) <= var22;
                                    if (!var37 && var19 - 1 >= var17) {
                                        short var39 = var13.field3366[var14 - 1];
                                        int var40 = (var39 >> 8) + var16;
                                        int var41 = (var39 & 0xFF) + var40;
                                        var37 = var40 < var23 && var23 < var41;
                                    }
                                    if (!var38 && (var19 + 1) <= var18) {
                                        short var42 = var13.field3366[var14 + 1];
                                        int var43 = (var42 >> 8) + var16;
                                        int var44 = var43 + (var42 & 0xFF);
                                        var38 = var43 < var23 && var44 > var23;
                                    }
                                    if (var37 && var38) {
                                        var35 = class287.field4804[0];
                                    } else if (var37) {
                                        var35 = class287.field4804[1];
                                    } else if (var38) {
                                        var35 = class287.field4804[1];
                                    }
                                }
                                if (var35 != null) {
                                    var15.field3805 += (var35.length >> 1) * 3 - 6;
                                    var15.field3811 += var35.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var26) {
                            int[] var53 = class39.field657[arg7[var23][var19]];
                            int[] var54 = class287.field4804[arg7[var23][var19]];
                            var15.field3805 += ((var54.length >> 1) - 2) * 3;
                            var15.field3805 += ((var53.length >> 1) - 2) * 3;
                            var15.field3811 += var54.length >> 1;
                            var15.field3811 += var53.length >> 1;
                        } else {
                            int[] var55 = class287.field4804[0];
                            var15.field3805 += ((var55.length >> 1) - 2) * 3;
                            var15.field3811 += var55.length >> 1;
                        }
                    }
                    var14++;
                }
                int var56 = 0;
                var15.method1590();
                if (((var13.field3369 >> 7) - var13.field3355) < 0) {
                    var56 -= (var13.field3369 >> 7) - var13.field3355;
                }
                for (int var57 = var17; var57 <= var18; var57++) {
                    short var58 = var13.field3366[var56];
                    int var59 = (var58 >> 8) + var16;
                    int var60 = (var58 & 0xFF) + var59 - 1;
                    if (var60 > 103) {
                        var60 = 103;
                    }
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    for (int var61 = var59; var61 <= var60; var61++) {
                        int var62 = arg8[var61][var57] & 0xFF;
                        int var63 = arg1[var61][var57] & 0xFF;
                        byte var64 = arg2[var61][var57];
                        boolean var65 = false;
                        if (var63 == 0) {
                            if (var62 == 0) {
                                continue;
                            }
                            class89 var68 = class144.method960((byte) -49, var62 - 1);
                            if (var68.field1483 == -1) {
                                continue;
                            }
                            if (arg7[var61][var57] != 0) {
                                class76.method545(arg0, arg9, var61, arg6, var57, class287.field4804[arg7[var61][var57]], var15, (byte) -88, var13, arg11, arg2[var61][var57]);
                                continue;
                            }
                        } else if (var62 != 0) {
                            class89 var66 = class144.method960((byte) 113, var62 - 1);
                            if (var66.field1483 == -1) {
                                class76.method545(arg0, arg9, var61, arg6, var57, class39.field657[arg7[var61][var57]], var15, (byte) 116, var13, arg11, arg2[var61][var57]);
                                continue;
                            }
                            byte var67 = arg7[var61][var57];
                            if (var67 != 0) {
                                var65 = true;
                            }
                        }
                        class39 var69 = class222.method1483(arg4, var61, var57);
                        if (var69 != null) {
                            int var70 = (int) (var69.field656 >> 14) & 0x3F;
                            if (var70 == 9) {
                                int[] var71 = null;
                                int var72 = (int) (var69.field656 >> 20) & 0x3;
                                if ((var72 & 0x1) == 0) {
                                    boolean var81 = (var61 - 1) >= var59;
                                    boolean var82 = var60 >= (var61 + 1);
                                    if (!var81 && var18 >= var57 + 1) {
                                        short var83 = var13.field3366[var56 + 1];
                                        int var84 = (var83 >> 8) + var16;
                                        int var85 = (var83 & 0xFF) + var84;
                                        var81 = var61 > var84 && var85 > var61;
                                    }
                                    if (!var82 && var57 - 1 >= var17) {
                                        short var86 = var13.field3366[var56 - 1];
                                        int var87 = (var86 >> 8) + var16;
                                        int var88 = (var86 & 0xFF) + var87;
                                        var82 = var87 < var61 && var88 > var61;
                                    }
                                    if (var81 && var82) {
                                        var71 = class287.field4804[0];
                                    } else if (var81) {
                                        var71 = class287.field4804[1];
                                        var64 = 1;
                                    } else if (var82) {
                                        var71 = class287.field4804[1];
                                        var64 = 3;
                                    }
                                } else {
                                    boolean var73 = var61 - 1 >= var59;
                                    boolean var74 = var60 >= var61 + 1;
                                    if (!var73 && var17 <= var57 - 1) {
                                        short var75 = var13.field3366[var56 - 1];
                                        int var76 = (var75 >> 8) + var16;
                                        int var77 = (var75 & 0xFF) + var76;
                                        var73 = var61 > var76 && var77 > var61;
                                    }
                                    if (!var74 && var18 >= (var57 + 1)) {
                                        short var78 = var13.field3366[var56 + 1];
                                        int var79 = (var78 >> 8) + var16;
                                        int var80 = (var78 & 0xFF) + var79;
                                        var74 = var61 > var79 && var80 > var61;
                                    }
                                    if (var73 && var74) {
                                        var71 = class287.field4804[0];
                                    } else if (var73) {
                                        var64 = 0;
                                        var71 = class287.field4804[1];
                                    } else if (var74) {
                                        var71 = class287.field4804[1];
                                        var64 = 2;
                                    }
                                }
                                if (var71 != null) {
                                    class76.method545(arg0, arg9, var61, arg6, var57, var71, var15, (byte) 98, var13, arg11, var64);
                                }
                                continue;
                            }
                        }
                        if (var65) {
                            class76.method545(arg0, arg9, var61, arg6, var57, class39.field657[arg7[var61][var57]], var15, (byte) 96, var13, arg11, arg2[var61][var57]);
                            class76.method545(arg0, arg9, var61, arg6, var57, class287.field4804[arg7[var61][var57]], var15, (byte) -117, var13, arg11, arg2[var61][var57]);
                        } else {
                            class76.method545(arg0, arg9, var61, arg6, var57, class287.field4804[0], var15, (byte) 61, var13, arg11, var64);
                        }
                    }
                    var56++;
                }
                if (var15.field3807 > 0 && var15.field3809 > 0) {
                    var15.method1589();
                    var13.field3373 = var15;
                }
            }
        }
        if (arg10 != -8771) {
            method1923(-30, -124);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)I")
    public abstract int method369(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
    public abstract void method368(int arg0);
}
