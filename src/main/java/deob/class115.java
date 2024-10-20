package deob;

@ObfuscatedName("dv")
public class class115 {

    @ObfuscatedName("dv.f")
    public static final float field1383 = Math.ulp(1.0F);

    @ObfuscatedName("dv.b")
    public static final float field1381 = field1383 * 2.0F;

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("r.v(Ldt;FI)F")
    public static float method87(class118 arg0, float arg1) {
        if (arg0 == null || arg0.method2590() == 0) {
            return 0.0F;
        } else if (arg1 < (float) arg0.field1412[0].field1374) {
            return class117.field1404 == arg0.field1410 ? arg0.field1412[0].field1377 : method2494(arg0, arg1, true);
        } else if (arg1 > (float) arg0.field1412[arg0.method2590() - 1].field1374) {
            return class117.field1404 == arg0.field1411 ? arg0.field1412[arg0.method2590() - 1].field1377 : method2494(arg0, arg1, false);
        } else if (arg0.field1409) {
            return arg0.field1412[0].field1377;
        } else {
            class114 var2 = arg0.method2611(arg1);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
                return 0.0F;
            }
            if ((double) var2.field1370 == 0.0D && (double) var2.field1375 == 0.0D) {
                var3 = true;
            } else if (var2.field1370 == Float.MAX_VALUE && var2.field1375 == Float.MAX_VALUE) {
                var4 = true;
            } else if (var2.field1376 == null) {
                var3 = true;
            } else if (arg0.field1408) {
                float[] var5 = new float[4];
                float[] var6 = new float[4];
                var5[0] = (float) var2.field1374;
                var6[0] = var2.field1377;
                var5[1] = var2.field1370 * 0.33333334F + var5[0];
                var6[1] = var2.field1375 * 0.33333334F + var6[0];
                var5[3] = (float) var2.field1376.field1374;
                var6[3] = var2.field1376.field1377;
                var5[2] = var5[3] - var2.field1376.field1372 * 0.33333334F;
                var6[2] = var6[3] - var2.field1376.field1378 * 0.33333334F;
                if (!arg0.field1414) {
                    method2452(arg0, var5, var6);
                } else if (arg0 != null) {
                    float var7 = var5[3] - var5[0];
                    if ((double) var7 != 0.0D) {
                        float var8 = var5[1] - var5[0];
                        float var9 = var5[2] - var5[0];
                        Float var10 = var8 / var7;
                        Float var11 = var9 / var7;
                        arg0.field1413 = var10 == 0.33333334F && var11 == 0.6666667F;
                        float var12 = var10;
                        float var13 = var11;
                        if ((double) var10 < 0.0D) {
                            var10 = 0.0F;
                        }
                        if ((double) var11 > 1.0D) {
                            var11 = 1.0F;
                        }
                        if ((double) var10 > 1.0D || var11 < -1.0F) {
                            method5008(var10, var11);
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
                        arg0.field1423 = var5[0];
                        arg0.field1415 = var5[3];
                        float var14 = var10;
                        float var15 = var11;
                        float[] var16 = arg0.field1416;
                        float var17 = var14 - 0.0F;
                        float var18 = var15 - var14;
                        float var19 = 1.0F - var15;
                        float var20 = var18 - var17;
                        var16[3] = var19 - var18 - var20;
                        var16[2] = var20 + var20 + var20;
                        var16[1] = var17 + var17 + var17;
                        var16[0] = 0.0F;
                        float var21 = var6[0];
                        float var22 = var6[1];
                        float var23 = var6[2];
                        float var24 = var6[3];
                        float[] var25 = arg0.field1417;
                        float var26 = var22 - var21;
                        float var27 = var23 - var22;
                        float var28 = var24 - var23;
                        float var29 = var27 - var26;
                        var25[3] = var28 - var27 - var29;
                        var25[2] = var29 + var29 + var29;
                        var25[1] = var26 + var26 + var26;
                        var25[0] = var21;
                    }
                }
                arg0.field1408 = false;
            }
            if (var3) {
                return var2.field1377;
            } else if (var4) {
                return (float) var2.field1374 == arg1 || var2.field1376 == null ? var2.field1377 : var2.field1376.field1377;
            } else if (arg0.field1414) {
                float var30;
                if (arg0 == null) {
                    var30 = 0.0F;
                } else {
                    float var31;
                    if (arg0.field1423 == arg1) {
                        var31 = 0.0F;
                    } else if (arg0.field1415 == arg1) {
                        var31 = 1.0F;
                    } else {
                        var31 = (arg1 - arg0.field1423) / (arg0.field1415 - arg0.field1423);
                    }
                    float var32;
                    if (arg0.field1413) {
                        var32 = var31;
                    } else {
                        float[] var33 = new float[] { arg0.field1416[0] - var31, arg0.field1416[1], arg0.field1416[2], arg0.field1416[3] };
                        float[] var34 = new float[5];
                        int var35 = class390.method2706(var33, 3, 0.0F, true, 1.0F, true, var34);
                        if (var35 == 1) {
                            var32 = var34[0];
                        } else {
                            var32 = 0.0F;
                        }
                    }
                    var30 = ((arg0.field1417[3] * var32 + arg0.field1417[2]) * var32 + arg0.field1417[1]) * var32 + arg0.field1417[0];
                }
                return var30;
            } else {
                return method2829(arg0, arg1);
            }
        }
    }

    @ObfuscatedName("ee.c(Ldt;FI)F")
    public static float method2829(class118 arg0, float arg1) {
        if (arg0 == null) {
            return 0.0F;
        } else {
            float var2 = arg1 - arg0.field1423;
            return ((arg0.field1416[0] * var2 + arg0.field1416[1]) * var2 + arg0.field1416[2]) * var2 + arg0.field1416[3];
        }
    }

    @ObfuscatedName("de.i(Ldt;FZI)F")
    public static float method2494(class118 arg0, float arg1, boolean arg2) {
        float var3 = 0.0F;
        if (arg0 == null || arg0.method2590() == 0) {
            return var3;
        }
        float var4 = (float) arg0.field1412[0].field1374;
        float var5 = (float) arg0.field1412[arg0.method2590() - 1].field1374;
        float var6 = var5 - var4;
        if ((double) var6 == 0.0D) {
            return arg0.field1412[0].field1377;
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
            if (class117.field1402 == arg0.field1410) {
                if ((double) var19 == 0.0D) {
                    var12 = var5 - var12;
                } else {
                    var12 += var4;
                }
            } else if (class117.field1401 == arg0.field1410 || class117.field1407 == arg0.field1410) {
                var12 = var5 - var12;
            } else if (class117.field1400 == arg0.field1410) {
                float var20 = var4 - arg1;
                float var21 = arg0.field1412[0].field1372;
                float var22 = arg0.field1412[0].field1378;
                float var23 = arg0.field1412[0].field1377;
                if ((double) var21 != 0.0D) {
                    var23 -= var20 * var22 / var21;
                }
                return var23;
            }
        } else if (class117.field1402 == arg0.field1411) {
            if ((double) var19 == 0.0D) {
                var12 += var4;
            } else {
                var12 = var5 - var12;
            }
        } else if (class117.field1401 == arg0.field1411 || class117.field1407 == arg0.field1411) {
            var12 += var4;
        } else if (class117.field1400 == arg0.field1411) {
            float var24 = arg1 - var5;
            float var25 = arg0.field1412[arg0.method2590() - 1].field1370;
            float var26 = arg0.field1412[arg0.method2590() - 1].field1375;
            float var27 = arg0.field1412[arg0.method2590() - 1].field1377;
            if ((double) var25 != 0.0D) {
                var27 += var24 * var26 / var25;
            }
            return var27;
        }
        float var28 = method87(arg0, var12);
        if (arg2 && class117.field1407 == arg0.field1410) {
            float var29 = arg0.field1412[arg0.method2590() - 1].field1377 - arg0.field1412[0].field1377;
            var28 = (float) ((double) var28 - (double) var29 * var13);
        } else if (!arg2 && class117.field1407 == arg0.field1411) {
            float var30 = arg0.field1412[arg0.method2590() - 1].field1377 - arg0.field1412[0].field1377;
            var28 = (float) ((double) var30 * var13 + (double) var28);
        }
        return var28;
    }

    @ObfuscatedName("dr.f(Ldt;[F[FB)V")
    public static void method2452(class118 arg0, float[] arg1, float[] arg2) {
        if (arg0 == null) {
            return;
        }
        arg0.field1423 = arg1[0];
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
        arg0.field1416[0] = (var10 + var11 - var4 - var4) * var9 / var3;
        arg0.field1416[1] = (var4 + var4 + var4 - var10 - var10 - var11) * var9;
        arg0.field1416[2] = var6;
        arg0.field1416[3] = arg2[0];
    }

    @ObfuscatedName("kj.b(Ljava/lang/Float;Ljava/lang/Float;B)V")
    public static void method5008(Float arg0, Float arg1) {
        Float var2 = 1.0F - arg1;
        if (arg0 < 0.0F) {
            arg0 = 0.0F;
        }
        if (var2 < 0.0F) {
            var2 = 0.0F;
        }
        if (arg0 > 1.0F || var2 > 1.0F) {
            float var3 = (float) ((double) (arg0 * (arg0 - 2.0F + var2)) + (double) var2 * ((double) var2 - 2.0D) + 1.0D);
            if (field1383 + var3 > 0.0F) {
                if (arg0 + field1383 < 1.3333334F) {
                    float var6 = arg0 - 2.0F;
                    float var7 = arg0 - 1.0F;
                    float var8 = (float) Math.sqrt((double) (var6 * var6 - var7 * 4.0F * var7));
                    float var9 = (-var6 + var8) * 0.5F;
                    if (var2 + field1383 > var9) {
                        Float var10 = var9 - field1383;
                    } else {
                        float var11 = (-var6 - var8) * 0.5F;
                        if (var2 < field1383 + var11) {
                            Float var12 = field1383 + var11;
                        }
                    }
                } else {
                    Float var13 = 1.3333334F - field1383;
                    Float var14 = 0.33333334F - field1383;
                }
            }
        }
        Float var15 = 1.0F - var2;
    }
}
