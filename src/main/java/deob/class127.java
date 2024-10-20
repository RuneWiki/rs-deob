package deob;

@ObfuscatedName("ex")
public class class127 {

    @ObfuscatedName("ex.at")
    public static final float field1506 = Math.ulp(1.0F);

    @ObfuscatedName("ex.ac")
    public static final float field1507 = field1506 * 2.0F;

    @ObfuscatedName("ex.ai")
    public static float[] field1508 = new float[4];

    @ObfuscatedName("ex.az")
    public static float[] field1510 = new float[5];

    public class127() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("iu.au(Lfh;FB)F")
    public static float method4192(class131 arg0, float arg1) {
        if (arg0 == null || arg0.method2872() == 0) {
            return 0.0F;
        } else if (arg1 < (float) arg0.field1552[0].field1493) {
            return class129.field1531 == arg0.field1550 ? arg0.field1552[0].field1496 : method2739(arg0, arg1, true);
        } else if (arg1 > (float) arg0.field1552[arg0.method2872() - 1].field1493) {
            return class129.field1531 == arg0.field1572 ? arg0.field1552[arg0.method2872() - 1].field1496 : method2739(arg0, arg1, false);
        } else if (arg0.field1549) {
            return arg0.field1552[0].field1496;
        } else {
            class126 var2 = arg0.method2871(arg1);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
                return 0.0F;
            }
            if ((double) var2.field1497 == 0.0D && (double) var2.field1498 == 0.0D) {
                var3 = true;
            } else if (var2.field1497 == Float.MAX_VALUE && var2.field1498 == Float.MAX_VALUE) {
                var4 = true;
            } else if (var2.field1499 == null) {
                var3 = true;
            } else if (arg0.field1565) {
                float var5 = (float) var2.field1493;
                float var6 = var2.field1496;
                float var7 = var2.field1497 * 0.33333334F + var5;
                float var8 = var2.field1498 * 0.33333334F + var6;
                float var9 = (float) var2.field1499.field1493;
                float var10 = var2.field1499.field1496;
                float var11 = var9 - var2.field1499.field1504 * 0.33333334F;
                float var12 = var10 - var2.field1499.field1494 * 0.33333334F;
                if (arg0.field1564) {
                    float var15 = var8;
                    float var16 = var12;
                    if (arg0 != null) {
                        float var17 = var9 - var5;
                        if ((double) var17 != 0.0D) {
                            float var18 = var7 - var5;
                            float var19 = var11 - var5;
                            float[] var20 = new float[] { var18 / var17, var19 / var17 };
                            arg0.field1551 = var20[0] == 0.33333334F && var20[1] == 0.6666667F;
                            float var21 = var20[0];
                            float var22 = var20[1];
                            if ((double) var20[0] < 0.0D) {
                                var20[0] = 0.0F;
                            }
                            if ((double) var20[1] > 1.0D) {
                                var20[1] = 1.0F;
                            }
                            if ((double) var20[0] > 1.0D || var20[1] < -1.0F) {
                                method3067(var20);
                            }
                            if (var20[0] != var21) {
                                float var23 = var20[0] * var17 + var5;
                                if ((double) var21 != 0.0D) {
                                    var15 = (var8 - var6) * var20[0] / var21 + var6;
                                }
                            }
                            if (var20[1] != var22) {
                                float var24 = var20[1] * var17 + var5;
                                if ((double) var22 != 1.0D) {
                                    var16 = (float) ((double) var10 - (1.0D - (double) var20[1]) * (double) (var10 - var12) / (1.0D - (double) var22));
                                }
                            }
                            arg0.field1554 = var5;
                            arg0.field1555 = var9;
                            float var25 = var20[0];
                            float var26 = var20[1];
                            float var27 = var25 - 0.0F;
                            float var28 = var26 - var25;
                            float var29 = 1.0F - var26;
                            float var30 = var28 - var27;
                            arg0.field1553 = var29 - var28 - var30;
                            arg0.field1558 = var30 + var30 + var30;
                            arg0.field1557 = var27 + var27 + var27;
                            arg0.field1556 = 0.0F;
                            float var31 = var15 - var6;
                            float var32 = var16 - var15;
                            float var33 = var10 - var16;
                            float var34 = var32 - var31;
                            arg0.field1548 = var33 - var32 - var34;
                            arg0.field1562 = var34 + var34 + var34;
                            arg0.field1561 = var31 + var31 + var31;
                            arg0.field1573 = var6;
                        }
                    }
                } else if (arg0 != null) {
                    arg0.field1554 = var5;
                    float var35 = var9 - var5;
                    float var36 = var10 - var6;
                    float var37 = var7 - var5;
                    float var38 = 0.0F;
                    float var39 = 0.0F;
                    if ((double) var37 != 0.0D) {
                        var38 = (var8 - var6) / var37;
                    }
                    float var40 = var9 - var11;
                    if ((double) var40 != 0.0D) {
                        var39 = (var10 - var12) / var40;
                    }
                    float var41 = 1.0F / (var35 * var35);
                    float var42 = var35 * var38;
                    float var43 = var35 * var39;
                    arg0.field1556 = (var42 + var43 - var36 - var36) * var41 / var35;
                    arg0.field1557 = (var36 + var36 + var36 - var42 - var42 - var43) * var41;
                    arg0.field1558 = var38;
                    arg0.field1553 = var6;
                }
                arg0.field1565 = false;
            }
            if (var3) {
                return var2.field1496;
            } else if (var4) {
                return (float) var2.field1493 == arg1 || var2.field1499 == null ? var2.field1496 : var2.field1499.field1496;
            } else if (arg0.field1564) {
                return method7615(arg0, arg1);
            } else {
                float var44;
                if (arg0 == null) {
                    var44 = 0.0F;
                } else {
                    float var45 = arg1 - arg0.field1554;
                    var44 = ((arg0.field1556 * var45 + arg0.field1557) * var45 + arg0.field1558) * var45 + arg0.field1553;
                }
                return var44;
            }
        }
    }

    @ObfuscatedName("rs.ae(Lfh;FS)F")
    public static float method7615(class131 arg0, float arg1) {
        if (arg0 == null) {
            return 0.0F;
        }
        float var2;
        if (arg0.field1554 == arg1) {
            var2 = 0.0F;
        } else if (arg0.field1555 == arg1) {
            var2 = 1.0F;
        } else {
            var2 = (arg1 - arg0.field1554) / (arg0.field1555 - arg0.field1554);
        }
        float var3;
        if (arg0.field1551) {
            var3 = var2;
        } else {
            field1508[3] = arg0.field1553;
            field1508[2] = arg0.field1558;
            field1508[1] = arg0.field1557;
            field1508[0] = arg0.field1556 - var2;
            field1510[0] = 0.0F;
            field1510[1] = 0.0F;
            field1510[2] = 0.0F;
            field1510[3] = 0.0F;
            field1510[4] = 0.0F;
            int var4 = class453.method4661(field1508, 3, 0.0F, true, 1.0F, true, field1510);
            if (var4 == 1) {
                var3 = field1510[0];
            } else {
                var3 = 0.0F;
            }
        }
        return ((arg0.field1548 * var3 + arg0.field1562) * var3 + arg0.field1561) * var3 + arg0.field1573;
    }

    @ObfuscatedName("en.ao(Lfh;FZI)F")
    public static float method2739(class131 arg0, float arg1, boolean arg2) {
        float var3 = 0.0F;
        if (arg0 == null || arg0.method2872() == 0) {
            return var3;
        }
        float var4 = (float) arg0.field1552[0].field1493;
        float var5 = (float) arg0.field1552[arg0.method2872() - 1].field1493;
        float var6 = var5 - var4;
        if ((double) var6 == 0.0D) {
            return arg0.field1552[0].field1496;
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
            if (class129.field1539 == arg0.field1550) {
                if ((double) var19 == 0.0D) {
                    var12 = var5 - var12;
                } else {
                    var12 += var4;
                }
            } else if (class129.field1532 == arg0.field1550 || class129.field1533 == arg0.field1550) {
                var12 = var5 - var12;
            } else if (class129.field1535 == arg0.field1550) {
                float var20 = var4 - arg1;
                float var21 = arg0.field1552[0].field1504;
                float var22 = arg0.field1552[0].field1494;
                float var23 = arg0.field1552[0].field1496;
                if ((double) var21 != 0.0D) {
                    var23 -= var20 * var22 / var21;
                }
                return var23;
            }
        } else if (class129.field1539 == arg0.field1572) {
            if ((double) var19 == 0.0D) {
                var12 += var4;
            } else {
                var12 = var5 - var12;
            }
        } else if (class129.field1532 == arg0.field1572 || class129.field1533 == arg0.field1572) {
            var12 += var4;
        } else if (class129.field1535 == arg0.field1572) {
            float var24 = arg1 - var5;
            float var25 = arg0.field1552[arg0.method2872() - 1].field1497;
            float var26 = arg0.field1552[arg0.method2872() - 1].field1498;
            float var27 = arg0.field1552[arg0.method2872() - 1].field1496;
            if ((double) var25 != 0.0D) {
                var27 += var24 * var26 / var25;
            }
            return var27;
        }
        float var28 = method4192(arg0, var12);
        if (arg2 && class129.field1533 == arg0.field1550) {
            float var29 = arg0.field1552[arg0.method2872() - 1].field1496 - arg0.field1552[0].field1496;
            var28 = (float) ((double) var28 - (double) var29 * var13);
        } else if (!arg2 && class129.field1533 == arg0.field1572) {
            float var30 = arg0.field1552[arg0.method2872() - 1].field1496 - arg0.field1552[0].field1496;
            var28 = (float) ((double) var30 * var13 + (double) var28);
        }
        return var28;
    }

    @ObfuscatedName("gg.at([FI)V")
    public static void method3067(float[] arg0) {
        arg0[1] = 1.0F - arg0[1];
        if (arg0[0] < 0.0F) {
            arg0[0] = 0.0F;
        }
        if (arg0[1] < 0.0F) {
            arg0[1] = 0.0F;
        }
        if (arg0[0] > 1.0F || arg0[1] > 1.0F) {
            float var1 = (float) (((double) arg0[1] - 2.0D) * (double) arg0[1] + (double) ((arg0[0] - 2.0F + arg0[1]) * arg0[0]) + 1.0D);
            if (field1506 + var1 > 0.0F) {
                if (arg0[0] + field1506 < 1.3333334F) {
                    float var2 = arg0[0] - 2.0F;
                    float var3 = arg0[0] - 1.0F;
                    float var4 = (float) Math.sqrt((double) (var2 * var2 - var3 * 4.0F * var3));
                    float var5 = (-var2 + var4) * 0.5F;
                    if (arg0[1] + field1506 > var5) {
                        arg0[1] = var5 - field1506;
                    } else {
                        float var6 = (-var2 - var4) * 0.5F;
                        if (arg0[1] < field1506 + var6) {
                            arg0[1] = field1506 + var6;
                        }
                    }
                } else {
                    arg0[0] = 1.3333334F - field1506;
                    arg0[1] = 0.33333334F - field1506;
                }
            }
        }
        arg0[1] = 1.0F - arg0[1];
    }
}
