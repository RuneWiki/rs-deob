package deob;

@ObfuscatedName("ev")
public class class128 {

    @ObfuscatedName("ev.at")
    public static final float field1519 = Math.ulp(1.0F);

    @ObfuscatedName("ev.an")
    public static final float field1523 = field1519 * 2.0F;

    @ObfuscatedName("ev.ao")
    public static float[] field1524 = new float[4];

    @ObfuscatedName("ev.ab")
    public static float[] field1525 = new float[5];

    public class128() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("pw.az(Lfm;FI)F")
    public static float method6807(class132 arg0, float arg1) {
        if (arg0 == null || arg0.method2883() == 0) {
            return 0.0F;
        } else if (arg1 < (float) arg0.field1563[0].field1513) {
            return class130.field1549 == arg0.field1574 ? arg0.field1563[0].field1517 : method3363(arg0, arg1, true);
        } else if (arg1 > (float) arg0.field1563[arg0.method2883() - 1].field1513) {
            return class130.field1549 == arg0.field1562 ? arg0.field1563[arg0.method2883() - 1].field1517 : method3363(arg0, arg1, false);
        } else if (arg0.field1560) {
            return arg0.field1563[0].field1517;
        } else {
            class127 var2 = arg0.method2898(arg1);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
                return 0.0F;
            }
            if ((double) var2.field1510 == 0.0D && (double) var2.field1515 == 0.0D) {
                var3 = true;
            } else if (var2.field1510 == Float.MAX_VALUE && var2.field1515 == Float.MAX_VALUE) {
                var4 = true;
            } else if (var2.field1516 == null) {
                var3 = true;
            } else if (arg0.field1575) {
                float var5 = (float) var2.field1513;
                float var6 = var2.field1517;
                float var7 = var2.field1510 * 0.33333334F + var5;
                float var8 = var2.field1515 * 0.33333334F + var6;
                float var9 = (float) var2.field1516.field1513;
                float var10 = var2.field1516.field1517;
                float var11 = var9 - var2.field1516.field1512 * 0.33333334F;
                float var12 = var10 - var2.field1516.field1511 * 0.33333334F;
                if (arg0.field1559) {
                    float var15 = var8;
                    float var16 = var12;
                    if (arg0 != null) {
                        float var17 = var9 - var5;
                        if ((double) var17 != 0.0D) {
                            float var18 = var7 - var5;
                            float var19 = var11 - var5;
                            float[] var20 = new float[] { var18 / var17, var19 / var17 };
                            arg0.field1564 = var20[0] == 0.33333334F && var20[1] == 0.6666667F;
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
                                    if (field1519 + var23 > 0.0F) {
                                        if (var20[0] + field1519 < 1.3333334F) {
                                            float var24 = var20[0] - 2.0F;
                                            float var25 = var20[0] - 1.0F;
                                            float var26 = (float) Math.sqrt((double) (var24 * var24 - var25 * 4.0F * var25));
                                            float var27 = (-var24 + var26) * 0.5F;
                                            if (var20[1] + field1519 > var27) {
                                                var20[1] = var27 - field1519;
                                            } else {
                                                float var28 = (-var24 - var26) * 0.5F;
                                                if (var20[1] < field1519 + var28) {
                                                    var20[1] = field1519 + var28;
                                                }
                                            }
                                        } else {
                                            var20[0] = 1.3333334F - field1519;
                                            var20[1] = 0.33333334F - field1519;
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
                            arg0.field1561 = var5;
                            arg0.field1566 = var9;
                            method1995(0.0F, var20[0], var20[1], 1.0F, arg0);
                            float var31 = var15 - var6;
                            float var32 = var16 - var15;
                            float var33 = var10 - var16;
                            float var34 = var32 - var31;
                            arg0.field1571 = var33 - var32 - var34;
                            arg0.field1573 = var34 + var34 + var34;
                            arg0.field1572 = var31 + var31 + var31;
                            arg0.field1578 = var6;
                        }
                    }
                } else if (arg0 != null) {
                    arg0.field1561 = var5;
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
                    arg0.field1582 = (var42 + var43 - var36 - var36) * var41 / var35;
                    arg0.field1581 = (var36 + var36 + var36 - var42 - var42 - var43) * var41;
                    arg0.field1565 = var38;
                    arg0.field1570 = var6;
                }
                arg0.field1575 = false;
            }
            if (var3) {
                return var2.field1517;
            } else if (var4) {
                return (float) var2.field1513 == arg1 || var2.field1516 == null ? var2.field1517 : var2.field1516.field1517;
            } else if (arg0.field1559) {
                return Statics.method3244(arg0, arg1);
            } else {
                return method4532(arg0, arg1);
            }
        }
    }

    @ObfuscatedName("jo.af(Lfm;FI)F")
    public static float method4532(class132 arg0, float arg1) {
        if (arg0 == null) {
            return 0.0F;
        } else {
            float var2 = arg1 - arg0.field1561;
            return ((arg0.field1582 * var2 + arg0.field1581) * var2 + arg0.field1565) * var2 + arg0.field1570;
        }
    }

    @ObfuscatedName("ht.at(Lfm;FZB)F")
    public static float method3363(class132 arg0, float arg1, boolean arg2) {
        float var3 = 0.0F;
        if (arg0 == null || arg0.method2883() == 0) {
            return var3;
        }
        float var4 = (float) arg0.field1563[0].field1513;
        float var5 = (float) arg0.field1563[arg0.method2883() - 1].field1513;
        float var6 = var5 - var4;
        if ((double) var6 == 0.0D) {
            return arg0.field1563[0].field1517;
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
            if (class130.field1545 == arg0.field1574) {
                if ((double) var19 == 0.0D) {
                    var12 = var5 - var12;
                } else {
                    var12 += var4;
                }
            } else if (class130.field1546 == arg0.field1574 || class130.field1548 == arg0.field1574) {
                var12 = var5 - var12;
            } else if (class130.field1547 == arg0.field1574) {
                float var20 = var4 - arg1;
                float var21 = arg0.field1563[0].field1512;
                float var22 = arg0.field1563[0].field1511;
                float var23 = arg0.field1563[0].field1517;
                if ((double) var21 != 0.0D) {
                    var23 -= var20 * var22 / var21;
                }
                return var23;
            }
        } else if (class130.field1545 == arg0.field1562) {
            if ((double) var19 == 0.0D) {
                var12 += var4;
            } else {
                var12 = var5 - var12;
            }
        } else if (class130.field1546 == arg0.field1562 || class130.field1548 == arg0.field1562) {
            var12 += var4;
        } else if (class130.field1547 == arg0.field1562) {
            float var24 = arg1 - var5;
            float var25 = arg0.field1563[arg0.method2883() - 1].field1510;
            float var26 = arg0.field1563[arg0.method2883() - 1].field1515;
            float var27 = arg0.field1563[arg0.method2883() - 1].field1517;
            if ((double) var25 != 0.0D) {
                var27 += var24 * var26 / var25;
            }
            return var27;
        }
        float var28 = method6807(arg0, var12);
        if (arg2 && class130.field1548 == arg0.field1574) {
            float var29 = arg0.field1563[arg0.method2883() - 1].field1517 - arg0.field1563[0].field1517;
            var28 = (float) ((double) var28 - (double) var29 * var13);
        } else if (!arg2 && class130.field1548 == arg0.field1562) {
            float var30 = arg0.field1563[arg0.method2883() - 1].field1517 - arg0.field1563[0].field1517;
            var28 = (float) ((double) var30 * var13 + (double) var28);
        }
        return var28;
    }

    @ObfuscatedName("cf.an(FFFFLfm;B)V")
    public static void method1995(float arg0, float arg1, float arg2, float arg3, class132 arg4) {
        float var5 = arg1 - arg0;
        float var6 = arg2 - arg1;
        float var7 = arg3 - arg2;
        float var8 = var6 - var5;
        arg4.field1570 = var7 - var6 - var8;
        arg4.field1565 = var8 + var8 + var8;
        arg4.field1581 = var5 + var5 + var5;
        arg4.field1582 = arg0;
    }
}
