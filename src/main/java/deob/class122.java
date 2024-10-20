package deob;

@ObfuscatedName("dw")
public class class122 {

    @ObfuscatedName("dw.x")
    public static final float field1455 = Math.ulp(1.0F);

    @ObfuscatedName("dw.h")
    public static final float field1453 = field1455 * 2.0F;

    public class122() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("en.a(Ldb;FB)F")
    public static float method2837(class125 arg0, float arg1) {
        if (arg0 == null || arg0.method2759() == 0) {
            return 0.0F;
        } else if (arg1 < (float) arg0.field1494[0].field1442) {
            return class124.field1471 == arg0.field1491 ? arg0.field1494[0].field1439 : method6960(arg0, arg1, true);
        } else if (arg1 > (float) arg0.field1494[arg0.method2759() - 1].field1442) {
            return class124.field1471 == arg0.field1490 ? arg0.field1494[arg0.method2759() - 1].field1439 : method6960(arg0, arg1, false);
        } else if (arg0.field1481) {
            return arg0.field1494[0].field1439;
        } else {
            class121 var2 = arg0.method2758(arg1);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
                return 0.0F;
            }
            if ((double) var2.field1443 == 0.0D && (double) var2.field1444 == 0.0D) {
                var3 = true;
            } else if (var2.field1443 == Float.MAX_VALUE && var2.field1444 == Float.MAX_VALUE) {
                var4 = true;
            } else if (var2.field1445 == null) {
                var3 = true;
            } else if (arg0.field1484) {
                float[] var5 = new float[4];
                float[] var6 = new float[4];
                var5[0] = (float) var2.field1442;
                var6[0] = var2.field1439;
                var5[1] = var2.field1443 * 0.33333334F + var5[0];
                var6[1] = var2.field1444 * 0.33333334F + var6[0];
                var5[3] = (float) var2.field1445.field1442;
                var6[3] = var2.field1445.field1439;
                var5[2] = var5[3] - var2.field1445.field1441 * 0.33333334F;
                var6[2] = var6[3] - var2.field1445.field1440 * 0.33333334F;
                if (!arg0.field1482) {
                    method2941(arg0, var5, var6);
                } else if (arg0 != null) {
                    float var7 = var5[3] - var5[0];
                    if ((double) var7 != 0.0D) {
                        float var8 = var5[1] - var5[0];
                        float var9 = var5[2] - var5[0];
                        Float var10 = var8 / var7;
                        Float var11 = var9 / var7;
                        arg0.field1485 = var10 == 0.33333334F && var11 == 0.6666667F;
                        float var12 = var10;
                        float var13 = var11;
                        if ((double) var10 < 0.0D) {
                            var10 = 0.0F;
                        }
                        if ((double) var11 > 1.0D) {
                            var11 = 1.0F;
                        }
                        if ((double) var10 > 1.0D || var11 < -1.0F) {
                            Float var14 = var10;
                            Float var16 = 1.0F - var11;
                            if (var10 < 0.0F) {
                                var14 = 0.0F;
                            }
                            if (var16 < 0.0F) {
                                var16 = 0.0F;
                            }
                            if (var14 > 1.0F || var16 > 1.0F) {
                                float var17 = (float) ((double) (var14 * (var14 - 2.0F + var16)) + (double) var16 * ((double) var16 - 2.0D) + 1.0D);
                                if (field1455 + var17 > 0.0F) {
                                    Statics.method4801(var14, var16);
                                }
                            }
                            Float var18 = 1.0F - var16;
                        }
                        if (var10 != var12) {
                            var5[1] = var5[0] + var10 * var7;
                            if ((double) var12 != 0.0D) {
                                var6[1] = var6[0] + (var6[1] - var6[0]) * var10 / var12;
                            }
                        }
                        if (var11 != var13) {
                            var5[2] = var5[0] + var11 * var7;
                            if ((double) var13 != 1.0D) {
                                var6[2] = (float) ((double) var6[3] - (double) (var6[3] - var6[2]) * (1.0D - (double) var11) / (1.0D - (double) var13));
                            }
                        }
                        arg0.field1486 = var5[0];
                        arg0.field1487 = var5[3];
                        float var19 = var10;
                        float var20 = var11;
                        float[] var21 = arg0.field1488;
                        float var22 = var19 - 0.0F;
                        float var23 = var20 - var19;
                        float var24 = 1.0F - var20;
                        float var25 = var23 - var22;
                        var21[3] = var24 - var23 - var25;
                        var21[2] = var25 + var25 + var25;
                        var21[1] = var22 + var22 + var22;
                        var21[0] = 0.0F;
                        float var26 = var6[0];
                        float var27 = var6[1];
                        float var28 = var6[2];
                        float var29 = var6[3];
                        float[] var30 = arg0.field1489;
                        float var31 = var27 - var26;
                        float var32 = var28 - var27;
                        float var33 = var29 - var28;
                        float var34 = var32 - var31;
                        var30[3] = var33 - var32 - var34;
                        var30[2] = var34 + var34 + var34;
                        var30[1] = var31 + var31 + var31;
                        var30[0] = var26;
                    }
                }
                arg0.field1484 = false;
            }
            if (var3) {
                return var2.field1439;
            } else if (var4) {
                return (float) var2.field1442 == arg1 || var2.field1445 == null ? var2.field1439 : var2.field1445.field1439;
            } else if (arg0.field1482) {
                return method1808(arg0, arg1);
            } else {
                return method4707(arg0, arg1);
            }
        }
    }

    @ObfuscatedName("be.f(Ldb;FI)F")
    public static float method1808(class125 arg0, float arg1) {
        if (arg0 == null) {
            return 0.0F;
        }
        float var2;
        if (arg0.field1486 == arg1) {
            var2 = 0.0F;
        } else if (arg0.field1487 == arg1) {
            var2 = 1.0F;
        } else {
            var2 = (arg1 - arg0.field1486) / (arg0.field1487 - arg0.field1486);
        }
        float var3;
        if (arg0.field1485) {
            var3 = var2;
        } else {
            float[] var4 = new float[] { arg0.field1488[0] - var2, arg0.field1488[1], arg0.field1488[2], arg0.field1488[3] };
            float[] var5 = new float[5];
            int var6 = class410.method6610(var4, 3, 0.0F, true, 1.0F, true, var5);
            if (var6 == 1) {
                var3 = var5[0];
            } else {
                var3 = 0.0F;
            }
        }
        return ((arg0.field1489[3] * var3 + arg0.field1489[2]) * var3 + arg0.field1489[1]) * var3 + arg0.field1489[0];
    }

    @ObfuscatedName("is.c(Ldb;FI)F")
    public static float method4707(class125 arg0, float arg1) {
        if (arg0 == null) {
            return 0.0F;
        } else {
            float var2 = arg1 - arg0.field1486;
            return ((arg0.field1488[0] * var2 + arg0.field1488[1]) * var2 + arg0.field1488[2]) * var2 + arg0.field1488[3];
        }
    }

    @ObfuscatedName("od.x(Ldb;FZI)F")
    public static float method6960(class125 arg0, float arg1, boolean arg2) {
        float var3 = 0.0F;
        if (arg0 == null || arg0.method2759() == 0) {
            return var3;
        }
        float var4 = (float) arg0.field1494[0].field1442;
        float var5 = (float) arg0.field1494[arg0.method2759() - 1].field1442;
        float var6 = var5 - var4;
        if ((double) var6 == 0.0D) {
            return arg0.field1494[0].field1439;
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
            if (class124.field1473 == arg0.field1491) {
                if ((double) var19 == 0.0D) {
                    var12 = var5 - var12;
                } else {
                    var12 += var4;
                }
            } else if (class124.field1475 == arg0.field1491 || class124.field1474 == arg0.field1491) {
                var12 = var5 - var12;
            } else if (class124.field1472 == arg0.field1491) {
                float var20 = var4 - arg1;
                float var21 = arg0.field1494[0].field1441;
                float var22 = arg0.field1494[0].field1440;
                float var23 = arg0.field1494[0].field1439;
                if ((double) var21 != 0.0D) {
                    var23 -= var20 * var22 / var21;
                }
                return var23;
            }
        } else if (class124.field1473 == arg0.field1490) {
            if ((double) var19 == 0.0D) {
                var12 += var4;
            } else {
                var12 = var5 - var12;
            }
        } else if (class124.field1475 == arg0.field1490 || class124.field1474 == arg0.field1490) {
            var12 += var4;
        } else if (class124.field1472 == arg0.field1490) {
            float var24 = arg1 - var5;
            float var25 = arg0.field1494[arg0.method2759() - 1].field1443;
            float var26 = arg0.field1494[arg0.method2759() - 1].field1444;
            float var27 = arg0.field1494[arg0.method2759() - 1].field1439;
            if ((double) var25 != 0.0D) {
                var27 += var24 * var26 / var25;
            }
            return var27;
        }
        float var28 = method2837(arg0, var12);
        if (arg2 && class124.field1474 == arg0.field1491) {
            float var29 = arg0.field1494[arg0.method2759() - 1].field1439 - arg0.field1494[0].field1439;
            var28 = (float) ((double) var28 - (double) var29 * var13);
        } else if (!arg2 && class124.field1474 == arg0.field1490) {
            float var30 = arg0.field1494[arg0.method2759() - 1].field1439 - arg0.field1494[0].field1439;
            var28 = (float) ((double) var30 * var13 + (double) var28);
        }
        return var28;
    }

    @ObfuscatedName("ei.h(Ldb;[F[FB)V")
    public static void method2941(class125 arg0, float[] arg1, float[] arg2) {
        if (arg0 == null) {
            return;
        }
        arg0.field1486 = arg1[0];
        float var3 = arg1[3] - arg1[0];
        float var4 = arg2[3] - arg2[0];
        float var5 = arg1[1] - arg1[0];
        float var6 = 0.0F;
        float var7 = 0.0F;
        if ((double) var5 != 0.0D) {
            var6 = (arg2[1] - arg2[0]) / var5;
        }
        float var8 = arg1[3] - arg1[2];
        if ((double) var8 != 0.0D) {
            var7 = (arg2[3] - arg2[2]) / var8;
        }
        float var9 = 1.0F / (var3 * var3);
        float var10 = var3 * var6;
        float var11 = var3 * var7;
        arg0.field1488[0] = (var10 + var11 - var4 - var4) * var9 / var3;
        arg0.field1488[1] = (var4 + var4 + var4 - var10 - var10 - var11) * var9;
        arg0.field1488[2] = var6;
        arg0.field1488[3] = arg2[0];
    }
}
