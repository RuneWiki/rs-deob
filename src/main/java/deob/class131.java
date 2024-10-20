package deob;

@ObfuscatedName("fn")
public class class131 {

    @ObfuscatedName("fn.au")
    public static final float field1518 = Math.ulp(1.0F);

    @ObfuscatedName("fn.ax")
    public static final float field1517 = field1518 * 2.0F;

    @ObfuscatedName("fn.ao")
    public static float[] field1523 = new float[4];

    @ObfuscatedName("fn.am")
    public static float[] field1519 = new float[5];

    public class131() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aq.ab(Lfb;FB)F")
    public static float method93(class135 arg0, float arg1) {
        if (arg0 == null || arg0.method3056() == 0) {
            return 0.0F;
        } else if (arg1 < (float) arg0.field1562[0].field1508) {
            return class133.field1541 == arg0.field1560 ? arg0.field1562[0].field1502 : method2308(arg0, arg1, true);
        } else if (arg1 > (float) arg0.field1562[arg0.method3056() - 1].field1508) {
            return class133.field1541 == arg0.field1561 ? arg0.field1562[arg0.method3056() - 1].field1502 : method2308(arg0, arg1, false);
        } else if (arg0.field1574) {
            return arg0.field1562[0].field1502;
        } else {
            class130 var2 = arg0.method3063(arg1);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
                return 0.0F;
            }
            if ((double) var2.field1505 == 0.0D && (double) var2.field1506 == 0.0D) {
                var3 = true;
            } else if (var2.field1505 == Float.MAX_VALUE && var2.field1506 == Float.MAX_VALUE) {
                var4 = true;
            } else if (var2.field1501 == null) {
                var3 = true;
            } else if (arg0.field1570) {
                float var5 = (float) var2.field1508;
                float var6 = var2.field1502;
                float var7 = var2.field1505 * 0.33333334F + var5;
                float var8 = var2.field1506 * 0.33333334F + var6;
                float var9 = (float) var2.field1501.field1508;
                float var10 = var2.field1501.field1502;
                float var11 = var9 - var2.field1501.field1503 * 0.33333334F;
                float var12 = var10 - var2.field1501.field1504 * 0.33333334F;
                if (arg0.field1579) {
                    float var15 = var8;
                    float var16 = var12;
                    if (arg0 != null) {
                        float var17 = var9 - var5;
                        if ((double) var17 != 0.0D) {
                            float var18 = var7 - var5;
                            float var19 = var11 - var5;
                            float[] var20 = new float[] { var18 / var17, var19 / var17 };
                            arg0.field1563 = var20[0] == 0.33333334F && var20[1] == 0.6666667F;
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
                                    if (field1518 + var23 > 0.0F) {
                                        if (var20[0] + field1518 < 1.3333334F) {
                                            float var24 = var20[0] - 2.0F;
                                            float var25 = var20[0] - 1.0F;
                                            float var26 = (float) Math.sqrt((double) (var24 * var24 - var25 * 4.0F * var25));
                                            float var27 = (-var24 + var26) * 0.5F;
                                            if (var20[1] + field1518 > var27) {
                                                var20[1] = var27 - field1518;
                                            } else {
                                                float var28 = (-var24 - var26) * 0.5F;
                                                if (var20[1] < field1518 + var28) {
                                                    var20[1] = field1518 + var28;
                                                }
                                            }
                                        } else {
                                            var20[0] = 1.3333334F - field1518;
                                            var20[1] = 0.33333334F - field1518;
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
                            arg0.field1564 = var5;
                            arg0.field1559 = var9;
                            method263(0.0F, var20[0], var20[1], 1.0F, arg0);
                            method382(var6, var15, var16, var10, arg0);
                        }
                    }
                } else {
                    method5407(arg0, var5, var7, var11, var9, var6, var8, var12, var10);
                }
                arg0.field1570 = false;
            }
            if (var3) {
                return var2.field1502;
            } else if (var4) {
                return (float) var2.field1508 == arg1 || var2.field1501 == null ? var2.field1502 : var2.field1501.field1502;
            } else if (arg0.field1579) {
                float var31;
                if (arg0 == null) {
                    var31 = 0.0F;
                } else {
                    float var32;
                    if (arg0.field1564 == arg1) {
                        var32 = 0.0F;
                    } else if (arg0.field1559 == arg1) {
                        var32 = 1.0F;
                    } else {
                        var32 = (arg1 - arg0.field1564) / (arg0.field1559 - arg0.field1564);
                    }
                    float var33;
                    if (arg0.field1563) {
                        var33 = var32;
                    } else {
                        field1523[3] = arg0.field1569;
                        field1523[2] = arg0.field1568;
                        field1523[1] = arg0.field1558;
                        field1523[0] = arg0.field1572 - var32;
                        field1519[0] = 0.0F;
                        field1519[1] = 0.0F;
                        field1519[2] = 0.0F;
                        field1519[3] = 0.0F;
                        field1519[4] = 0.0F;
                        int var34 = class428.method6863(field1523, 3, 0.0F, true, 1.0F, true, field1519);
                        if (var34 == 1) {
                            var33 = field1519[0];
                        } else {
                            var33 = 0.0F;
                        }
                    }
                    var31 = ((arg0.field1573 * var33 + arg0.field1565) * var33 + arg0.field1571) * var33 + arg0.field1575;
                }
                return var31;
            } else {
                float var35;
                if (arg0 == null) {
                    var35 = 0.0F;
                } else {
                    float var36 = arg1 - arg0.field1564;
                    var35 = ((arg0.field1572 * var36 + arg0.field1558) * var36 + arg0.field1568) * var36 + arg0.field1569;
                }
                return var35;
            }
        }
    }

    @ObfuscatedName("dx.ay(Lfb;FZB)F")
    public static float method2308(class135 arg0, float arg1, boolean arg2) {
        float var3 = 0.0F;
        if (arg0 == null || arg0.method3056() == 0) {
            return var3;
        }
        float var4 = (float) arg0.field1562[0].field1508;
        float var5 = (float) arg0.field1562[arg0.method3056() - 1].field1508;
        float var6 = var5 - var4;
        if ((double) var6 == 0.0D) {
            return arg0.field1562[0].field1502;
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
            if (class133.field1545 == arg0.field1560) {
                if ((double) var19 == 0.0D) {
                    var12 = var5 - var12;
                } else {
                    var12 += var4;
                }
            } else if (class133.field1543 == arg0.field1560 || class133.field1544 == arg0.field1560) {
                var12 = var5 - var12;
            } else if (class133.field1546 == arg0.field1560) {
                float var20 = var4 - arg1;
                float var21 = arg0.field1562[0].field1503;
                float var22 = arg0.field1562[0].field1504;
                float var23 = arg0.field1562[0].field1502;
                if ((double) var21 != 0.0D) {
                    var23 -= var20 * var22 / var21;
                }
                return var23;
            }
        } else if (class133.field1545 == arg0.field1561) {
            if ((double) var19 == 0.0D) {
                var12 += var4;
            } else {
                var12 = var5 - var12;
            }
        } else if (class133.field1543 == arg0.field1561 || class133.field1544 == arg0.field1561) {
            var12 += var4;
        } else if (class133.field1546 == arg0.field1561) {
            float var24 = arg1 - var5;
            float var25 = arg0.field1562[arg0.method3056() - 1].field1505;
            float var26 = arg0.field1562[arg0.method3056() - 1].field1506;
            float var27 = arg0.field1562[arg0.method3056() - 1].field1502;
            if ((double) var25 != 0.0D) {
                var27 += var24 * var26 / var25;
            }
            return var27;
        }
        float var28 = method93(arg0, var12);
        if (arg2 && class133.field1544 == arg0.field1560) {
            float var29 = arg0.field1562[arg0.method3056() - 1].field1502 - arg0.field1562[0].field1502;
            var28 = (float) ((double) var28 - (double) var29 * var13);
        } else if (!arg2 && class133.field1544 == arg0.field1561) {
            float var30 = arg0.field1562[arg0.method3056() - 1].field1502 - arg0.field1562[0].field1502;
            var28 = (float) ((double) var30 * var13 + (double) var28);
        }
        return var28;
    }

    @ObfuscatedName("lu.an(Lfb;FFFFFFFFB)V")
    public static void method5407(class135 arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8) {
        if (arg0 == null) {
            return;
        }
        arg0.field1564 = arg1;
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
        arg0.field1572 = (var16 + var17 - var10 - var10) * var15 / var9;
        arg0.field1558 = (var10 + var10 + var10 - var16 - var16 - var17) * var15;
        arg0.field1568 = var12;
        arg0.field1569 = arg5;
    }

    @ObfuscatedName("av.au(FFFFLfb;I)V")
    public static void method263(float arg0, float arg1, float arg2, float arg3, class135 arg4) {
        float var5 = arg1 - arg0;
        float var6 = arg2 - arg1;
        float var7 = arg3 - arg2;
        float var8 = var6 - var5;
        arg4.field1569 = var7 - var6 - var8;
        arg4.field1568 = var8 + var8 + var8;
        arg4.field1558 = var5 + var5 + var5;
        arg4.field1572 = arg0;
    }

    @ObfuscatedName("bz.ax(FFFFLfb;B)V")
    public static void method382(float arg0, float arg1, float arg2, float arg3, class135 arg4) {
        float var5 = arg1 - arg0;
        float var6 = arg2 - arg1;
        float var7 = arg3 - arg2;
        float var8 = var6 - var5;
        arg4.field1573 = var7 - var6 - var8;
        arg4.field1565 = var8 + var8 + var8;
        arg4.field1571 = var5 + var5 + var5;
        arg4.field1575 = arg0;
    }
}
