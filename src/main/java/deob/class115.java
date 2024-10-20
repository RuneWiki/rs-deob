package deob;

@ObfuscatedName("dl")
public class class115 {

    @ObfuscatedName("dl.f")
    public static final float field1430 = Math.ulp(1.0F);

    @ObfuscatedName("dl.j")
    public static final float field1433 = field1430 * 2.0F;

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hc.c(Ldo;FB)F")
    public static float method4532(class118 arg0, float arg1) {
        if (arg0 == null || arg0.method2581() == 0) {
            return 0.0F;
        } else if (arg1 < (float) arg0.field1463[0].field1421) {
            return class117.field1456 == arg0.field1469 ? arg0.field1463[0].field1424 : method3030(arg0, arg1, true);
        } else if (arg1 > (float) arg0.field1463[arg0.method2581() - 1].field1421) {
            return class117.field1456 == arg0.field1462 ? arg0.field1463[arg0.method2581() - 1].field1424 : method3030(arg0, arg1, false);
        } else if (arg0.field1460) {
            return arg0.field1463[0].field1424;
        } else {
            class114 var2 = arg0.method2589(arg1);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
                return 0.0F;
            }
            if ((double) var2.field1420 == 0.0D && (double) var2.field1426 == 0.0D) {
                var3 = true;
            } else if (var2.field1420 == Float.MAX_VALUE && var2.field1426 == Float.MAX_VALUE) {
                var4 = true;
            } else if (var2.field1427 == null) {
                var3 = true;
            } else if (arg0.field1473) {
                float[] var5 = new float[4];
                float[] var6 = new float[4];
                var5[0] = (float) var2.field1421;
                var6[0] = var2.field1424;
                var5[1] = var2.field1420 * 0.33333334F + var5[0];
                var6[1] = var2.field1426 * 0.33333334F + var6[0];
                var5[3] = (float) var2.field1427.field1421;
                var6[3] = var2.field1427.field1424;
                var5[2] = var5[3] - var2.field1427.field1422 * 0.33333334F;
                var6[2] = var6[3] - var2.field1427.field1423 * 0.33333334F;
                if (!arg0.field1464) {
                    method2247(arg0, var5, var6);
                } else if (arg0 != null) {
                    float var7 = var5[3] - var5[0];
                    if ((double) var7 != 0.0D) {
                        float var8 = var5[1] - var5[0];
                        float var9 = var5[2] - var5[0];
                        Float var10 = var8 / var7;
                        Float var11 = var9 / var7;
                        arg0.field1471 = var10 == 0.33333334F && var11 == 0.6666667F;
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
                                if (field1430 + var17 > 0.0F) {
                                    method3365(var14, var16);
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
                        arg0.field1465 = var5[0];
                        arg0.field1459 = var5[3];
                        method6412(0.0F, var10, var11, 1.0F, arg0.field1466);
                        method6412(var6[0], var6[1], var6[2], var6[3], arg0.field1468);
                    }
                }
                arg0.field1473 = false;
            }
            if (var3) {
                return var2.field1424;
            } else if (var4) {
                return (float) var2.field1421 == arg1 || var2.field1427 == null ? var2.field1424 : var2.field1427.field1424;
            } else if (arg0.field1464) {
                float var19;
                if (arg0 == null) {
                    var19 = 0.0F;
                } else {
                    float var20;
                    if (arg0.field1465 == arg1) {
                        var20 = 0.0F;
                    } else if (arg0.field1459 == arg1) {
                        var20 = 1.0F;
                    } else {
                        var20 = (arg1 - arg0.field1465) / (arg0.field1459 - arg0.field1465);
                    }
                    float var21;
                    if (arg0.field1471) {
                        var21 = var20;
                    } else {
                        float[] var22 = new float[] { arg0.field1466[0] - var20, arg0.field1466[1], arg0.field1466[2], arg0.field1466[3] };
                        float[] var23 = new float[5];
                        int var24 = class390.method3209(var22, 3, 0.0F, true, 1.0F, true, var23);
                        if (var24 == 1) {
                            var21 = var23[0];
                        } else {
                            var21 = 0.0F;
                        }
                    }
                    var19 = ((arg0.field1468[3] * var21 + arg0.field1468[2]) * var21 + arg0.field1468[1]) * var21 + arg0.field1468[0];
                }
                return var19;
            } else {
                float var25;
                if (arg0 == null) {
                    var25 = 0.0F;
                } else {
                    float var26 = arg1 - arg0.field1465;
                    var25 = ((arg0.field1466[0] * var26 + arg0.field1466[1]) * var26 + arg0.field1466[2]) * var26 + arg0.field1466[3];
                }
                return var25;
            }
        }
    }

    @ObfuscatedName("fc.v(Ldo;FZI)F")
    public static float method3030(class118 arg0, float arg1, boolean arg2) {
        float var3 = 0.0F;
        if (arg0 == null || arg0.method2581() == 0) {
            return var3;
        }
        float var4 = (float) arg0.field1463[0].field1421;
        float var5 = (float) arg0.field1463[arg0.method2581() - 1].field1421;
        float var6 = var5 - var4;
        if ((double) var6 == 0.0D) {
            return arg0.field1463[0].field1424;
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
            if (class117.field1455 == arg0.field1469) {
                if ((double) var19 == 0.0D) {
                    var12 = var5 - var12;
                } else {
                    var12 += var4;
                }
            } else if (class117.field1451 == arg0.field1469 || class117.field1454 == arg0.field1469) {
                var12 = var5 - var12;
            } else if (class117.field1452 == arg0.field1469) {
                float var20 = var4 - arg1;
                float var21 = arg0.field1463[0].field1422;
                float var22 = arg0.field1463[0].field1423;
                float var23 = arg0.field1463[0].field1424;
                if ((double) var21 != 0.0D) {
                    var23 -= var20 * var22 / var21;
                }
                return var23;
            }
        } else if (class117.field1455 == arg0.field1462) {
            if ((double) var19 == 0.0D) {
                var12 += var4;
            } else {
                var12 = var5 - var12;
            }
        } else if (class117.field1451 == arg0.field1462 || class117.field1454 == arg0.field1462) {
            var12 += var4;
        } else if (class117.field1452 == arg0.field1462) {
            float var24 = arg1 - var5;
            float var25 = arg0.field1463[arg0.method2581() - 1].field1420;
            float var26 = arg0.field1463[arg0.method2581() - 1].field1426;
            float var27 = arg0.field1463[arg0.method2581() - 1].field1424;
            if ((double) var25 != 0.0D) {
                var27 += var24 * var26 / var25;
            }
            return var27;
        }
        float var28 = method4532(arg0, var12);
        if (arg2 && class117.field1454 == arg0.field1469) {
            float var29 = arg0.field1463[arg0.method2581() - 1].field1424 - arg0.field1463[0].field1424;
            var28 = (float) ((double) var28 - (double) var29 * var13);
        } else if (!arg2 && class117.field1454 == arg0.field1462) {
            float var30 = arg0.field1463[arg0.method2581() - 1].field1424 - arg0.field1463[0].field1424;
            var28 = (float) ((double) var30 * var13 + (double) var28);
        }
        return var28;
    }

    @ObfuscatedName("cn.q(Ldo;[F[FI)V")
    public static void method2247(class118 arg0, float[] arg1, float[] arg2) {
        if (arg0 == null) {
            return;
        }
        arg0.field1465 = arg1[0];
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
        arg0.field1466[0] = (var10 + var11 - var4 - var4) * var9 / var3;
        arg0.field1466[1] = (var4 + var4 + var4 - var10 - var10 - var11) * var9;
        arg0.field1466[2] = var6;
        arg0.field1466[3] = arg2[0];
    }

    @ObfuscatedName("gk.f(Ljava/lang/Float;Ljava/lang/Float;I)V")
    public static void method3365(Float arg0, Float arg1) {
        if (arg0 + field1430 >= 1.3333334F) {
            Float var9 = 1.3333334F - field1430;
            Float var10 = 0.33333334F - field1430;
            return;
        }
        float var2 = arg0 - 2.0F;
        float var3 = arg0 - 1.0F;
        float var4 = (float) Math.sqrt((double) (var2 * var2 - var3 * 4.0F * var3));
        float var5 = (-var2 + var4) * 0.5F;
        if (arg1 + field1430 > var5) {
            Float var6 = var5 - field1430;
        } else {
            float var7 = (-var2 - var4) * 0.5F;
            if (arg1 < field1430 + var7) {
                Float var8 = field1430 + var7;
            }
        }
    }

    @ObfuscatedName("nu.j(FFFF[FI)V")
    public static void method6412(float arg0, float arg1, float arg2, float arg3, float[] arg4) {
        float var5 = arg1 - arg0;
        float var6 = arg2 - arg1;
        float var7 = arg3 - arg2;
        float var8 = var6 - var5;
        arg4[3] = var7 - var6 - var8;
        arg4[2] = var8 + var8 + var8;
        arg4[1] = var5 + var5 + var5;
        arg4[0] = arg0;
    }
}
