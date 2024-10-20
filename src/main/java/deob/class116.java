package deob;

@ObfuscatedName("dx")
public class class116 {

    @ObfuscatedName("dx.n")
    public static final float field1424 = Math.ulp(1.0F);

    @ObfuscatedName("dx.k")
    public static final float field1421 = field1424 * 2.0F;

    public class116() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aa.c(Ldi;FS)F")
    public static float method630(class119 arg0, float arg1) {
        if (arg0 == null || arg0.method2749() == 0) {
            return 0.0F;
        } else if (arg1 < (float) arg0.field1468[0].field1408) {
            return class118.field1452 == arg0.field1455 ? arg0.field1468[0].field1410 : method4090(arg0, arg1, true);
        } else if (arg1 > (float) arg0.field1468[arg0.method2749() - 1].field1408) {
            return class118.field1452 == arg0.field1456 ? arg0.field1468[arg0.method2749() - 1].field1410 : method4090(arg0, arg1, false);
        } else if (arg0.field1454) {
            return arg0.field1468[0].field1410;
        } else {
            class115 var2 = arg0.method2765(arg1);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
                return 0.0F;
            }
            if ((double) var2.field1411 == 0.0D && (double) var2.field1412 == 0.0D) {
                var3 = true;
            } else if (var2.field1411 == Float.MAX_VALUE && var2.field1412 == Float.MAX_VALUE) {
                var4 = true;
            } else if (var2.field1415 == null) {
                var3 = true;
            } else if (arg0.field1453) {
                float[] var5 = new float[4];
                float[] var6 = new float[4];
                var5[0] = (float) var2.field1408;
                var6[0] = var2.field1410;
                var5[1] = var2.field1411 * 0.33333334F + var5[0];
                var6[1] = var2.field1412 * 0.33333334F + var6[0];
                var5[3] = (float) var2.field1415.field1408;
                var6[3] = var2.field1415.field1410;
                var5[2] = var5[3] - var2.field1415.field1407 * 0.33333334F;
                var6[2] = var6[3] - var2.field1415.field1413 * 0.33333334F;
                if (arg0.field1457) {
                    method2558(arg0, var5, var6);
                } else {
                    method2142(arg0, var5, var6);
                }
                arg0.field1453 = false;
            }
            if (var3) {
                return var2.field1410;
            } else if (var4) {
                return (float) var2.field1408 == arg1 || var2.field1415 == null ? var2.field1410 : var2.field1415.field1410;
            } else if (arg0.field1457) {
                float var7;
                if (arg0 == null) {
                    var7 = 0.0F;
                } else {
                    float var8;
                    if (arg0.field1459 == arg1) {
                        var8 = 0.0F;
                    } else if (arg0.field1460 == arg1) {
                        var8 = 1.0F;
                    } else {
                        var8 = (arg1 - arg0.field1459) / (arg0.field1460 - arg0.field1459);
                    }
                    float var9;
                    if (arg0.field1458) {
                        var9 = var8;
                    } else {
                        float[] var10 = new float[] { arg0.field1461[0] - var8, arg0.field1461[1], arg0.field1461[2], arg0.field1461[3] };
                        float[] var11 = new float[5];
                        int var12 = class392.method3135(var10, 3, 0.0F, true, 1.0F, true, var11);
                        if (var12 == 1) {
                            var9 = var11[0];
                        } else {
                            var9 = 0.0F;
                        }
                    }
                    var7 = ((arg0.field1463[3] * var9 + arg0.field1463[2]) * var9 + arg0.field1463[1]) * var9 + arg0.field1463[0];
                }
                return var7;
            } else {
                return method404(arg0, arg1);
            }
        }
    }

    @ObfuscatedName("ao.p(Ldi;FI)F")
    public static float method404(class119 arg0, float arg1) {
        if (arg0 == null) {
            return 0.0F;
        } else {
            float var2 = arg1 - arg0.field1459;
            return ((arg0.field1461[0] * var2 + arg0.field1461[1]) * var2 + arg0.field1461[2]) * var2 + arg0.field1461[3];
        }
    }

    @ObfuscatedName("gg.f(Ldi;FZI)F")
    public static float method4090(class119 arg0, float arg1, boolean arg2) {
        float var3 = 0.0F;
        if (arg0 == null || arg0.method2749() == 0) {
            return var3;
        }
        float var4 = (float) arg0.field1468[0].field1408;
        float var5 = (float) arg0.field1468[arg0.method2749() - 1].field1408;
        float var6 = var5 - var4;
        if ((double) var6 == 0.0D) {
            return arg0.field1468[0].field1410;
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
            if (class118.field1447 == arg0.field1455) {
                if ((double) var19 == 0.0D) {
                    var12 = var5 - var12;
                } else {
                    var12 += var4;
                }
            } else if (class118.field1446 == arg0.field1455 || class118.field1444 == arg0.field1455) {
                var12 = var5 - var12;
            } else if (class118.field1445 == arg0.field1455) {
                float var20 = var4 - arg1;
                float var21 = arg0.field1468[0].field1407;
                float var22 = arg0.field1468[0].field1413;
                float var23 = arg0.field1468[0].field1410;
                if ((double) var21 != 0.0D) {
                    var23 -= var20 * var22 / var21;
                }
                return var23;
            }
        } else if (class118.field1447 == arg0.field1456) {
            if ((double) var19 == 0.0D) {
                var12 += var4;
            } else {
                var12 = var5 - var12;
            }
        } else if (class118.field1446 == arg0.field1456 || class118.field1444 == arg0.field1456) {
            var12 += var4;
        } else if (class118.field1445 == arg0.field1456) {
            float var24 = arg1 - var5;
            float var25 = arg0.field1468[arg0.method2749() - 1].field1411;
            float var26 = arg0.field1468[arg0.method2749() - 1].field1412;
            float var27 = arg0.field1468[arg0.method2749() - 1].field1410;
            if ((double) var25 != 0.0D) {
                var27 += var24 * var26 / var25;
            }
            return var27;
        }
        float var28 = method630(arg0, var12);
        if (arg2 && class118.field1444 == arg0.field1455) {
            float var29 = arg0.field1468[arg0.method2749() - 1].field1410 - arg0.field1468[0].field1410;
            var28 = (float) ((double) var28 - (double) var29 * var13);
        } else if (!arg2 && class118.field1444 == arg0.field1456) {
            float var30 = arg0.field1468[arg0.method2749() - 1].field1410 - arg0.field1468[0].field1410;
            var28 = (float) ((double) var30 * var13 + (double) var28);
        }
        return var28;
    }

    @ObfuscatedName("ch.n(Ldi;[F[FB)V")
    public static void method2558(class119 arg0, float[] arg1, float[] arg2) {
        if (arg0 == null) {
            return;
        }
        float var3 = arg1[3] - arg1[0];
        if ((double) var3 == 0.0D) {
            return;
        }
        float var4 = arg1[1] - arg1[0];
        float var5 = arg1[2] - arg1[0];
        Float var6 = var4 / var3;
        Float var7 = var5 / var3;
        arg0.field1458 = var6 == 0.33333334F && var7 == 0.6666667F;
        float var8 = var6;
        float var9 = var7;
        if ((double) var6 < 0.0D) {
            var6 = 0.0F;
        }
        if ((double) var7 > 1.0D) {
            var7 = 1.0F;
        }
        if ((double) var6 > 1.0D || var7 < -1.0F) {
            Float var10 = var6;
            Float var12 = 1.0F - var7;
            if (var6 < 0.0F) {
                var10 = 0.0F;
            }
            if (var12 < 0.0F) {
                var12 = 0.0F;
            }
            if (var10 > 1.0F || var12 > 1.0F) {
                float var13 = (float) ((double) (var10 * (var10 - 2.0F + var12)) + (double) var12 * ((double) var12 - 2.0D) + 1.0D);
                if (field1424 + var13 > 0.0F) {
                    if (var10 + field1424 < 1.3333334F) {
                        float var16 = var10 - 2.0F;
                        float var17 = var10 - 1.0F;
                        float var18 = (float) Math.sqrt((double) (var16 * var16 - var17 * 4.0F * var17));
                        float var19 = (-var16 + var18) * 0.5F;
                        if (var12 + field1424 > var19) {
                            Float var20 = var19 - field1424;
                        } else {
                            float var21 = (-var16 - var18) * 0.5F;
                            if (var12 < field1424 + var21) {
                                Float var22 = field1424 + var21;
                            }
                        }
                    } else {
                        Float var23 = 1.3333334F - field1424;
                        Float var24 = 0.33333334F - field1424;
                    }
                }
            }
            Float var25 = 1.0F - var12;
        }
        if (var6 != var8) {
            arg1[1] = arg1[0] + var6 * var3;
            if ((double) var8 != 0.0D) {
                arg2[1] = arg2[0] + (arg2[1] - arg2[0]) * var6 / var8;
            }
        }
        if (var7 != var9) {
            arg1[2] = arg1[0] + var7 * var3;
            if ((double) var9 != 1.0D) {
                arg2[2] = (float) ((double) arg2[3] - (double) (arg2[3] - arg2[2]) * (1.0D - (double) var7) / (1.0D - (double) var9));
            }
        }
        arg0.field1459 = arg1[0];
        arg0.field1460 = arg1[3];
        float var26 = var6;
        float var27 = var7;
        float[] var28 = arg0.field1461;
        float var29 = var26 - 0.0F;
        float var30 = var27 - var26;
        float var31 = 1.0F - var27;
        float var32 = var30 - var29;
        var28[3] = var31 - var30 - var32;
        var28[2] = var32 + var32 + var32;
        var28[1] = var29 + var29 + var29;
        var28[0] = 0.0F;
        float var33 = arg2[0];
        float var34 = arg2[1];
        float var35 = arg2[2];
        float var36 = arg2[3];
        float[] var37 = arg0.field1463;
        float var38 = var34 - var33;
        float var39 = var35 - var34;
        float var40 = var36 - var35;
        float var41 = var39 - var38;
        var37[3] = var40 - var39 - var41;
        var37[2] = var41 + var41 + var41;
        var37[1] = var38 + var38 + var38;
        var37[0] = var33;
    }

    @ObfuscatedName("cv.k(Ldi;[F[FB)V")
    public static void method2142(class119 arg0, float[] arg1, float[] arg2) {
        if (arg0 == null) {
            return;
        }
        arg0.field1459 = arg1[0];
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
        arg0.field1461[0] = (var10 + var11 - var4 - var4) * var9 / var3;
        arg0.field1461[1] = (var4 + var4 + var4 - var10 - var10 - var11) * var9;
        arg0.field1461[2] = var6;
        arg0.field1461[3] = arg2[0];
    }
}
