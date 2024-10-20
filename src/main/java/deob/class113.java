package deob;

@ObfuscatedName("du")
public class class113 {

    @ObfuscatedName("du.e")
    public static final float field1387 = Math.ulp(1.0F);

    @ObfuscatedName("du.r")
    public static final float field1391 = field1387 * 2.0F;

    public class113() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("da.c(Ldt;FB)F")
    public static float method2600(class116 arg0, float arg1) {
        if (arg0 == null || arg0.method2490() == 0) {
            return 0.0F;
        } else if (arg1 < (float) arg0.field1431[0].field1378) {
            return class115.field1409 == arg0.field1423 ? arg0.field1431[0].field1385 : method6475(arg0, arg1, true);
        } else if (arg1 > (float) arg0.field1431[arg0.method2490() - 1].field1378) {
            return class115.field1409 == arg0.field1421 ? arg0.field1431[arg0.method2490() - 1].field1385 : method6475(arg0, arg1, false);
        } else if (arg0.field1419) {
            return arg0.field1431[0].field1385;
        } else {
            class112 var2 = arg0.method2489(arg1);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
                return 0.0F;
            }
            if ((double) var2.field1382 == 0.0D && (double) var2.field1379 == 0.0D) {
                var3 = true;
            } else if (var2.field1382 == Float.MAX_VALUE && var2.field1379 == Float.MAX_VALUE) {
                var4 = true;
            } else if (var2.field1384 == null) {
                var3 = true;
            } else if (arg0.field1420) {
                float[] var5 = new float[4];
                float[] var6 = new float[4];
                var5[0] = (float) var2.field1378;
                var6[0] = var2.field1385;
                var5[1] = var2.field1382 * 0.33333334F + var5[0];
                var6[1] = var2.field1379 * 0.33333334F + var6[0];
                var5[3] = (float) var2.field1384.field1378;
                var6[3] = var2.field1384.field1385;
                var5[2] = var5[3] - var2.field1384.field1380 * 0.33333334F;
                var6[2] = var6[3] - var2.field1384.field1381 * 0.33333334F;
                if (!arg0.field1435) {
                    method2732(arg0, var5, var6);
                } else if (arg0 != null) {
                    float var7 = var5[3] - var5[0];
                    if ((double) var7 != 0.0D) {
                        float var8 = var5[1] - var5[0];
                        float var9 = var5[2] - var5[0];
                        Float var10 = var8 / var7;
                        Float var11 = var9 / var7;
                        arg0.field1422 = var10 == 0.33333334F && var11 == 0.6666667F;
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
                                if (field1387 + var17 > 0.0F) {
                                    method151(var14, var16);
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
                        arg0.field1424 = var5[0];
                        arg0.field1425 = var5[3];
                        method5676(0.0F, var10, var11, 1.0F, arg0.field1426);
                        method5676(var6[0], var6[1], var6[2], var6[3], arg0.field1427);
                    }
                }
                arg0.field1420 = false;
            }
            if (var3) {
                return var2.field1385;
            } else if (var4) {
                return (float) var2.field1378 == arg1 || var2.field1384 == null ? var2.field1385 : var2.field1384.field1385;
            } else if (arg0.field1435) {
                return method4487(arg0, arg1);
            } else {
                return method1876(arg0, arg1);
            }
        }
    }

    @ObfuscatedName("iw.l(Ldt;FI)F")
    public static float method4487(class116 arg0, float arg1) {
        if (arg0 == null) {
            return 0.0F;
        }
        float var2;
        if (arg0.field1424 == arg1) {
            var2 = 0.0F;
        } else if (arg0.field1425 == arg1) {
            var2 = 1.0F;
        } else {
            var2 = (arg1 - arg0.field1424) / (arg0.field1425 - arg0.field1424);
        }
        float var3;
        if (arg0.field1422) {
            var3 = var2;
        } else {
            float[] var4 = new float[] { arg0.field1426[0] - var2, arg0.field1426[1], arg0.field1426[2], arg0.field1426[3] };
            float[] var5 = new float[5];
            int var6 = class374.method3981(var4, 3, 0.0F, true, 1.0F, true, var5);
            if (var6 == 1) {
                var3 = var5[0];
            } else {
                var3 = 0.0F;
            }
        }
        return ((arg0.field1427[3] * var3 + arg0.field1427[2]) * var3 + arg0.field1427[1]) * var3 + arg0.field1427[0];
    }

    @ObfuscatedName("bv.s(Ldt;FI)F")
    public static float method1876(class116 arg0, float arg1) {
        if (arg0 == null) {
            return 0.0F;
        } else {
            float var2 = arg1 - arg0.field1424;
            return ((arg0.field1426[0] * var2 + arg0.field1426[1]) * var2 + arg0.field1426[2]) * var2 + arg0.field1426[3];
        }
    }

    @ObfuscatedName("ok.e(Ldt;FZI)F")
    public static float method6475(class116 arg0, float arg1, boolean arg2) {
        float var3 = 0.0F;
        if (arg0 == null || arg0.method2490() == 0) {
            return var3;
        }
        float var4 = (float) arg0.field1431[0].field1378;
        float var5 = (float) arg0.field1431[arg0.method2490() - 1].field1378;
        float var6 = var5 - var4;
        if ((double) var6 == 0.0D) {
            return arg0.field1431[0].field1385;
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
            if (class115.field1413 == arg0.field1423) {
                if ((double) var19 == 0.0D) {
                    var12 = var5 - var12;
                } else {
                    var12 += var4;
                }
            } else if (class115.field1411 == arg0.field1423 || class115.field1414 == arg0.field1423) {
                var12 = var5 - var12;
            } else if (class115.field1410 == arg0.field1423) {
                float var20 = var4 - arg1;
                float var21 = arg0.field1431[0].field1380;
                float var22 = arg0.field1431[0].field1381;
                float var23 = arg0.field1431[0].field1385;
                if ((double) var21 != 0.0D) {
                    var23 -= var20 * var22 / var21;
                }
                return var23;
            }
        } else if (class115.field1413 == arg0.field1421) {
            if ((double) var19 == 0.0D) {
                var12 += var4;
            } else {
                var12 = var5 - var12;
            }
        } else if (class115.field1411 == arg0.field1421 || class115.field1414 == arg0.field1421) {
            var12 += var4;
        } else if (class115.field1410 == arg0.field1421) {
            float var24 = arg1 - var5;
            float var25 = arg0.field1431[arg0.method2490() - 1].field1382;
            float var26 = arg0.field1431[arg0.method2490() - 1].field1379;
            float var27 = arg0.field1431[arg0.method2490() - 1].field1385;
            if ((double) var25 != 0.0D) {
                var27 += var24 * var26 / var25;
            }
            return var27;
        }
        float var28 = method2600(arg0, var12);
        if (arg2 && class115.field1414 == arg0.field1423) {
            float var29 = arg0.field1431[arg0.method2490() - 1].field1385 - arg0.field1431[0].field1385;
            var28 = (float) ((double) var28 - (double) var29 * var13);
        } else if (!arg2 && class115.field1414 == arg0.field1421) {
            float var30 = arg0.field1431[arg0.method2490() - 1].field1385 - arg0.field1431[0].field1385;
            var28 = (float) ((double) var30 * var13 + (double) var28);
        }
        return var28;
    }

    @ObfuscatedName("ez.r(Ldt;[F[FI)V")
    public static void method2732(class116 arg0, float[] arg1, float[] arg2) {
        if (arg0 == null) {
            return;
        }
        arg0.field1424 = arg1[0];
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
        arg0.field1426[0] = (var10 + var11 - var4 - var4) * var9 / var3;
        arg0.field1426[1] = (var4 + var4 + var4 - var10 - var10 - var11) * var9;
        arg0.field1426[2] = var6;
        arg0.field1426[3] = arg2[0];
    }

    @ObfuscatedName("h.o(Ljava/lang/Float;Ljava/lang/Float;I)V")
    public static void method151(Float arg0, Float arg1) {
        if (arg0 + field1387 >= 1.3333334F) {
            Float var9 = 1.3333334F - field1387;
            Float var10 = 0.33333334F - field1387;
            return;
        }
        float var2 = arg0 - 2.0F;
        float var3 = arg0 - 1.0F;
        float var4 = (float) Math.sqrt((double) (var2 * var2 - var3 * 4.0F * var3));
        float var5 = (-var2 + var4) * 0.5F;
        if (arg1 + field1387 > var5) {
            Float var6 = var5 - field1387;
        } else {
            float var7 = (-var2 - var4) * 0.5F;
            if (arg1 < field1387 + var7) {
                Float var8 = field1387 + var7;
            }
        }
    }

    @ObfuscatedName("mx.i(FFFF[FB)V")
    public static void method5676(float arg0, float arg1, float arg2, float arg3, float[] arg4) {
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
