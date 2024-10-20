package deob;

@ObfuscatedName("eq")
public class class129 {

    @ObfuscatedName("eq.ai")
    public static final float field1513 = Math.ulp(1.0F);

    @ObfuscatedName("eq.ar")
    public static final float field1520 = field1513 * 2.0F;

    @ObfuscatedName("eq.as")
    public static float[] field1512 = new float[4];

    @ObfuscatedName("eq.aa")
    public static float[] field1511 = new float[5];

    public class129() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kw.aq(Lfr;FB)F")
    public static float method4745(class133 arg0, float arg1) {
        if (arg0 == null || arg0.method2943() == 0) {
            return 0.0F;
        } else if (arg1 < (float) arg0.field1560[0].field1502) {
            return class131.field1549 == arg0.field1558 ? arg0.field1560[0].field1501 : method5377(arg0, arg1, true);
        } else if (arg1 > (float) arg0.field1560[arg0.method2943() - 1].field1502) {
            return class131.field1549 == arg0.field1575 ? arg0.field1560[arg0.method2943() - 1].field1501 : method5377(arg0, arg1, false);
        } else if (arg0.field1556) {
            return arg0.field1560[0].field1501;
        } else {
            class128 var2 = arg0.method2942(arg1);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
                return 0.0F;
            }
            if ((double) var2.field1500 == 0.0D && (double) var2.field1507 == 0.0D) {
                var3 = true;
            } else if (var2.field1500 == Float.MAX_VALUE && var2.field1507 == Float.MAX_VALUE) {
                var4 = true;
            } else if (var2.field1506 == null) {
                var3 = true;
            } else if (arg0.field1572) {
                float var5 = (float) var2.field1502;
                float var6 = var2.field1501;
                float var7 = var2.field1500 * 0.33333334F + var5;
                float var8 = var2.field1507 * 0.33333334F + var6;
                float var9 = (float) var2.field1506.field1502;
                float var10 = var2.field1506.field1501;
                float var11 = var9 - var2.field1506.field1504 * 0.33333334F;
                float var12 = var10 - var2.field1506.field1503 * 0.33333334F;
                if (arg0.field1566) {
                    float var15 = var8;
                    float var16 = var12;
                    if (arg0 != null) {
                        float var17 = var9 - var5;
                        if ((double) var17 != 0.0D) {
                            float var18 = var7 - var5;
                            float var19 = var11 - var5;
                            float[] var20 = new float[] { var18 / var17, var19 / var17 };
                            arg0.field1561 = var20[0] == 0.33333334F && var20[1] == 0.6666667F;
                            float var21 = var20[0];
                            float var22 = var20[1];
                            if ((double) var20[0] < 0.0D) {
                                var20[0] = 0.0F;
                            }
                            if ((double) var20[1] > 1.0D) {
                                var20[1] = 1.0F;
                            }
                            if ((double) var20[0] > 1.0D || var20[1] < -1.0F) {
                                var20[1] = 1.0F - var20[1];
                                if (var20[0] < 0.0F) {
                                    var20[0] = 0.0F;
                                }
                                if (var20[1] < 0.0F) {
                                    var20[1] = 0.0F;
                                }
                                if (var20[0] > 1.0F || var20[1] > 1.0F) {
                                    float var23 = (float) (((double) var20[1] - 2.0D) * (double) var20[1] + (double) ((var20[0] - 2.0F + var20[1]) * var20[0]) + 1.0D);
                                    if (field1513 + var23 > 0.0F) {
                                        if (var20[0] + field1513 < 1.3333334F) {
                                            float var24 = var20[0] - 2.0F;
                                            float var25 = var20[0] - 1.0F;
                                            float var26 = (float) Math.sqrt((double) (var24 * var24 - var25 * 4.0F * var25));
                                            float var27 = (-var24 + var26) * 0.5F;
                                            if (var20[1] + field1513 > var27) {
                                                var20[1] = var27 - field1513;
                                            } else {
                                                float var28 = (-var24 - var26) * 0.5F;
                                                if (var20[1] < field1513 + var28) {
                                                    var20[1] = field1513 + var28;
                                                }
                                            }
                                        } else {
                                            var20[0] = 1.3333334F - field1513;
                                            var20[1] = 0.33333334F - field1513;
                                        }
                                    }
                                }
                                var20[1] = 1.0F - var20[1];
                            }
                            if (var20[0] != var21) {
                                float var29 = var20[0] * var17 + var5;
                                if ((double) var21 != 0.0D) {
                                    var15 = (var8 - var6) * var20[0] / var21 + var6;
                                }
                            }
                            if (var20[1] != var22) {
                                float var30 = var20[1] * var17 + var5;
                                if ((double) var22 != 1.0D) {
                                    var16 = (float) ((double) var10 - (1.0D - (double) var20[1]) * (double) (var10 - var12) / (1.0D - (double) var22));
                                }
                            }
                            arg0.field1562 = var5;
                            arg0.field1557 = var9;
                            method64(0.0F, var20[0], var20[1], 1.0F, arg0);
                            method2329(var6, var15, var16, var10, arg0);
                        }
                    }
                } else {
                    method3039(arg0, var5, var7, var11, var9, var6, var8, var12, var10);
                }
                arg0.field1572 = false;
            }
            if (var3) {
                return var2.field1501;
            } else if (var4) {
                return (float) var2.field1502 == arg1 || var2.field1506 == null ? var2.field1501 : var2.field1506.field1501;
            } else if (arg0.field1566) {
                float var31;
                if (arg0 == null) {
                    var31 = 0.0F;
                } else {
                    float var32;
                    if (arg0.field1562 == arg1) {
                        var32 = 0.0F;
                    } else if (arg0.field1557 == arg1) {
                        var32 = 1.0F;
                    } else {
                        var32 = (arg1 - arg0.field1562) / (arg0.field1557 - arg0.field1562);
                    }
                    float var33;
                    if (arg0.field1561) {
                        var33 = var32;
                    } else {
                        field1512[3] = arg0.field1567;
                        field1512[2] = arg0.field1563;
                        field1512[1] = arg0.field1565;
                        field1512[0] = arg0.field1564 - var32;
                        field1511[0] = 0.0F;
                        field1511[1] = 0.0F;
                        field1511[2] = 0.0F;
                        field1511[3] = 0.0F;
                        field1511[4] = 0.0F;
                        int var34 = class472.method3048(field1512, 3, 0.0F, true, 1.0F, true, field1511);
                        if (var34 == 1) {
                            var33 = field1511[0];
                        } else {
                            var33 = 0.0F;
                        }
                    }
                    var31 = ((arg0.field1571 * var33 + arg0.field1574) * var33 + arg0.field1570) * var33 + arg0.field1568;
                }
                return var31;
            } else {
                return method2223(arg0, arg1);
            }
        }
    }

    @ObfuscatedName("dw.aw(Lfr;FI)F")
    public static float method2223(class133 arg0, float arg1) {
        if (arg0 == null) {
            return 0.0F;
        } else {
            float var2 = arg1 - arg0.field1562;
            return ((arg0.field1564 * var2 + arg0.field1565) * var2 + arg0.field1563) * var2 + arg0.field1567;
        }
    }

    @ObfuscatedName("lg.al(Lfr;FZI)F")
    public static float method5377(class133 arg0, float arg1, boolean arg2) {
        float var3 = 0.0F;
        if (arg0 == null || arg0.method2943() == 0) {
            return var3;
        }
        float var4 = (float) arg0.field1560[0].field1502;
        float var5 = (float) arg0.field1560[arg0.method2943() - 1].field1502;
        float var6 = var5 - var4;
        if ((double) var6 == 0.0D) {
            return arg0.field1560[0].field1501;
        }
        float var7 = 0.0F;
        float var8;
        if (arg1 > var5) {
            var8 = (arg1 - var5) / var6;
        } else {
            var8 = (arg1 - var4) / var6;
        }
        double var9 = (double) ((int) var8);
        float var11 = Math.abs((float) ((double) var8 - var9));
        float var12 = var6 * var11;
        double var13 = Math.abs(var9 + 1.0D);
        double var15 = var13 / 2.0D;
        double var17 = (double) ((int) var15);
        float var19 = (float) (var15 - var17);
        if (arg2) {
            if (class131.field1545 == arg0.field1558) {
                if ((double) var19 == 0.0D) {
                    var12 = var5 - var12;
                } else {
                    var12 += var4;
                }
            } else if (class131.field1541 == arg0.field1558 || class131.field1542 == arg0.field1558) {
                var12 = var5 - var12;
            } else if (class131.field1540 == arg0.field1558) {
                float var20 = var4 - arg1;
                float var21 = arg0.field1560[0].field1504;
                float var22 = arg0.field1560[0].field1503;
                float var23 = arg0.field1560[0].field1501;
                if ((double) var21 != 0.0D) {
                    var23 -= var20 * var22 / var21;
                }
                return var23;
            }
        } else if (class131.field1545 == arg0.field1575) {
            if ((double) var19 == 0.0D) {
                var12 += var4;
            } else {
                var12 = var5 - var12;
            }
        } else if (class131.field1541 == arg0.field1575 || class131.field1542 == arg0.field1575) {
            var12 += var4;
        } else if (class131.field1540 == arg0.field1575) {
            float var24 = arg1 - var5;
            float var25 = arg0.field1560[arg0.method2943() - 1].field1500;
            float var26 = arg0.field1560[arg0.method2943() - 1].field1507;
            float var27 = arg0.field1560[arg0.method2943() - 1].field1501;
            if ((double) var25 != 0.0D) {
                var27 += var24 * var26 / var25;
            }
            return var27;
        }
        float var28 = method4745(arg0, var12);
        if (arg2 && class131.field1542 == arg0.field1558) {
            float var29 = arg0.field1560[arg0.method2943() - 1].field1501 - arg0.field1560[0].field1501;
            var28 = (float) ((double) var28 - (double) var29 * var13);
        } else if (!arg2 && class131.field1542 == arg0.field1575) {
            float var30 = arg0.field1560[arg0.method2943() - 1].field1501 - arg0.field1560[0].field1501;
            var28 = (float) ((double) var30 * var13 + (double) var28);
        }
        return var28;
    }

    @ObfuscatedName("fx.ai(Lfr;FFFFFFFFI)V")
    public static void method3039(class133 arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8) {
        if (arg0 == null) {
            return;
        }
        arg0.field1562 = arg1;
        float var9 = arg4 - arg1;
        float var10 = arg8 - arg5;
        float var11 = arg2 - arg1;
        float var12 = 0.0F;
        float var13 = 0.0F;
        if ((double) var11 != 0.0D) {
            var12 = (arg6 - arg5) / var11;
        }
        float var14 = arg4 - arg3;
        if ((double) var14 != 0.0D) {
            var13 = (arg8 - arg7) / var14;
        }
        float var15 = 1.0F / (var9 * var9);
        float var16 = var9 * var12;
        float var17 = var9 * var13;
        arg0.field1564 = (var16 + var17 - var10 - var10) * var15 / var9;
        arg0.field1565 = (var10 + var10 + var10 - var16 - var16 - var17) * var15;
        arg0.field1563 = var12;
        arg0.field1567 = arg5;
    }

    @ObfuscatedName("au.ar(FFFFLfr;B)V")
    public static void method64(float arg0, float arg1, float arg2, float arg3, class133 arg4) {
        float var5 = arg1 - arg0;
        float var6 = arg2 - arg1;
        float var7 = arg3 - arg2;
        float var8 = var6 - var5;
        arg4.field1567 = var7 - var6 - var8;
        arg4.field1563 = var8 + var8 + var8;
        arg4.field1565 = var5 + var5 + var5;
        arg4.field1564 = arg0;
    }

    @ObfuscatedName("di.as(FFFFLfr;B)V")
    public static void method2329(float arg0, float arg1, float arg2, float arg3, class133 arg4) {
        float var5 = arg1 - arg0;
        float var6 = arg2 - arg1;
        float var7 = arg3 - arg2;
        float var8 = var6 - var5;
        arg4.field1571 = var7 - var6 - var8;
        arg4.field1574 = var8 + var8 + var8;
        arg4.field1570 = var5 + var5 + var5;
        arg4.field1568 = arg0;
    }
}
