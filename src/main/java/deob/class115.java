package deob;

@ObfuscatedName("de")
public class class115 {

    @ObfuscatedName("de.k")
    public static final float field1436 = Math.ulp(1.0F);

    @ObfuscatedName("de.a")
    public static final float field1437 = field1436 * 2.0F;

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ji.o(Ldz;FB)F")
    public static float method4861(class118 arg0, float arg1) {
        if (arg0 == null || arg0.method2553() == 0) {
            return 0.0F;
        } else if (arg1 < (float) arg0.field1477[0].field1431) {
            return class117.field1471 == arg0.field1473 ? arg0.field1477[0].field1429 : method2900(arg0, arg1, true);
        } else if (arg1 > (float) arg0.field1477[arg0.method2553() - 1].field1431) {
            return class117.field1471 == arg0.field1476 ? arg0.field1477[arg0.method2553() - 1].field1429 : method2900(arg0, arg1, false);
        } else if (arg0.field1488) {
            return arg0.field1477[0].field1429;
        } else {
            class114 var2 = arg0.method2565(arg1);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
                return 0.0F;
            }
            if ((double) var2.field1426 == 0.0D && (double) var2.field1427 == 0.0D) {
                var3 = true;
            } else if (var2.field1426 == Float.MAX_VALUE && var2.field1427 == Float.MAX_VALUE) {
                var4 = true;
            } else if (var2.field1428 == null) {
                var3 = true;
            } else if (arg0.field1483) {
                float[] var5 = new float[4];
                float[] var6 = new float[4];
                var5[0] = (float) var2.field1431;
                var6[0] = var2.field1429;
                var5[1] = var2.field1426 * 0.33333334F + var5[0];
                var6[1] = var2.field1427 * 0.33333334F + var6[0];
                var5[3] = (float) var2.field1428.field1431;
                var6[3] = var2.field1428.field1429;
                var5[2] = var5[3] - var2.field1428.field1424 * 0.33333334F;
                var6[2] = var6[3] - var2.field1428.field1425 * 0.33333334F;
                if (!arg0.field1478) {
                    method2484(arg0, var5, var6);
                } else if (arg0 != null) {
                    float var7 = var5[3] - var5[0];
                    if ((double) var7 != 0.0D) {
                        float var8 = var5[1] - var5[0];
                        float var9 = var5[2] - var5[0];
                        Float var10 = var8 / var7;
                        Float var11 = var9 / var7;
                        arg0.field1481 = var10 == 0.33333334F && var11 == 0.6666667F;
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
                                if (field1436 + var17 > 0.0F) {
                                    if (var14 + field1436 < 1.3333334F) {
                                        float var20 = var14 - 2.0F;
                                        float var21 = var14 - 1.0F;
                                        float var22 = (float) Math.sqrt((double) (var20 * var20 - var21 * 4.0F * var21));
                                        float var23 = (-var20 + var22) * 0.5F;
                                        if (var16 + field1436 > var23) {
                                            Float var24 = var23 - field1436;
                                        } else {
                                            float var25 = (-var20 - var22) * 0.5F;
                                            if (var16 < field1436 + var25) {
                                                Float var26 = field1436 + var25;
                                            }
                                        }
                                    } else {
                                        Float var27 = 1.3333334F - field1436;
                                        Float var28 = 0.33333334F - field1436;
                                    }
                                }
                            }
                            Float var29 = 1.0F - var16;
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
                        arg0.field1479 = var5[0];
                        arg0.field1480 = var5[3];
                        Statics.method5599(0.0F, var10, var11, 1.0F, arg0.field1474);
                        Statics.method5599(var6[0], var6[1], var6[2], var6[3], arg0.field1482);
                    }
                }
                arg0.field1483 = false;
            }
            if (var3) {
                return var2.field1429;
            } else if (var4) {
                return (float) var2.field1431 == arg1 || var2.field1428 == null ? var2.field1429 : var2.field1428.field1429;
            } else if (arg0.field1478) {
                float var30;
                if (arg0 == null) {
                    var30 = 0.0F;
                } else {
                    float var31;
                    if (arg0.field1479 == arg1) {
                        var31 = 0.0F;
                    } else if (arg0.field1480 == arg1) {
                        var31 = 1.0F;
                    } else {
                        var31 = (arg1 - arg0.field1479) / (arg0.field1480 - arg0.field1479);
                    }
                    float var32;
                    if (arg0.field1481) {
                        var32 = var31;
                    } else {
                        float[] var33 = new float[] { arg0.field1474[0] - var31, arg0.field1474[1], arg0.field1474[2], arg0.field1474[3] };
                        float[] var34 = new float[5];
                        int var35 = class391.method5316(var33, 3, 0.0F, true, 1.0F, true, var34);
                        if (var35 == 1) {
                            var32 = var34[0];
                        } else {
                            var32 = 0.0F;
                        }
                    }
                    var30 = ((arg0.field1482[3] * var32 + arg0.field1482[2]) * var32 + arg0.field1482[1]) * var32 + arg0.field1482[0];
                }
                return var30;
            } else {
                float var36;
                if (arg0 == null) {
                    var36 = 0.0F;
                } else {
                    float var37 = arg1 - arg0.field1479;
                    var36 = ((arg0.field1474[0] * var37 + arg0.field1474[1]) * var37 + arg0.field1474[2]) * var37 + arg0.field1474[3];
                }
                return var36;
            }
        }
    }

    @ObfuscatedName("fp.q(Ldz;FZB)F")
    public static float method2900(class118 arg0, float arg1, boolean arg2) {
        float var3 = 0.0F;
        if (arg0 == null || arg0.method2553() == 0) {
            return var3;
        }
        float var4 = (float) arg0.field1477[0].field1431;
        float var5 = (float) arg0.field1477[arg0.method2553() - 1].field1431;
        float var6 = var5 - var4;
        if ((double) var6 == 0.0D) {
            return arg0.field1477[0].field1429;
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
            if (class117.field1469 == arg0.field1473) {
                if ((double) var19 == 0.0D) {
                    var12 = var5 - var12;
                } else {
                    var12 += var4;
                }
            } else if (class117.field1465 == arg0.field1473 || class117.field1467 == arg0.field1473) {
                var12 = var5 - var12;
            } else if (class117.field1466 == arg0.field1473) {
                float var20 = var4 - arg1;
                float var21 = arg0.field1477[0].field1424;
                float var22 = arg0.field1477[0].field1425;
                float var23 = arg0.field1477[0].field1429;
                if ((double) var21 != 0.0D) {
                    var23 -= var20 * var22 / var21;
                }
                return var23;
            }
        } else if (class117.field1469 == arg0.field1476) {
            if ((double) var19 == 0.0D) {
                var12 += var4;
            } else {
                var12 = var5 - var12;
            }
        } else if (class117.field1465 == arg0.field1476 || class117.field1467 == arg0.field1476) {
            var12 += var4;
        } else if (class117.field1466 == arg0.field1476) {
            float var24 = arg1 - var5;
            float var25 = arg0.field1477[arg0.method2553() - 1].field1426;
            float var26 = arg0.field1477[arg0.method2553() - 1].field1427;
            float var27 = arg0.field1477[arg0.method2553() - 1].field1429;
            if ((double) var25 != 0.0D) {
                var27 += var24 * var26 / var25;
            }
            return var27;
        }
        float var28 = method4861(arg0, var12);
        if (arg2 && class117.field1467 == arg0.field1473) {
            float var29 = arg0.field1477[arg0.method2553() - 1].field1429 - arg0.field1477[0].field1429;
            var28 = (float) ((double) var28 - (double) var29 * var13);
        } else if (!arg2 && class117.field1467 == arg0.field1476) {
            float var30 = arg0.field1477[arg0.method2553() - 1].field1429 - arg0.field1477[0].field1429;
            var28 = (float) ((double) var30 * var13 + (double) var28);
        }
        return var28;
    }

    @ObfuscatedName("di.l(Ldz;[F[FB)V")
    public static void method2484(class118 arg0, float[] arg1, float[] arg2) {
        if (arg0 == null) {
            return;
        }
        arg0.field1479 = arg1[0];
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
        arg0.field1474[0] = (var10 + var11 - var4 - var4) * var9 / var3;
        arg0.field1474[1] = (var4 + var4 + var4 - var10 - var10 - var11) * var9;
        arg0.field1474[2] = var6;
        arg0.field1474[3] = arg2[0];
    }
}
