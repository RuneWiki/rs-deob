package deob;

@ObfuscatedName("dx")
public class class115 {

    @ObfuscatedName("dx.v")
    public static final float field1411 = Math.ulp(1.0F);

    @ObfuscatedName("dx.c")
    public static final float field1408 = field1411 * 2.0F;

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("d.s(Ldj;FB)F")
    public static float method81(class118 arg0, float arg1) {
        if (arg0 == null || arg0.method2574() == 0) {
            return 0.0F;
        } else if (arg1 < (float) arg0.field1442[0].field1401) {
            return class117.field1435 == arg0.field1440 ? arg0.field1442[0].field1400 : Statics.method5835(arg0, arg1, true);
        } else if (arg1 > (float) arg0.field1442[arg0.method2574() - 1].field1401) {
            return class117.field1435 == arg0.field1450 ? arg0.field1442[arg0.method2574() - 1].field1400 : Statics.method5835(arg0, arg1, false);
        } else if (arg0.field1439) {
            return arg0.field1442[0].field1400;
        } else {
            class114 var2 = arg0.method2553(arg1);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
                return 0.0F;
            }
            if ((double) var2.field1403 == 0.0D && (double) var2.field1399 == 0.0D) {
                var3 = true;
            } else if (var2.field1403 == Float.MAX_VALUE && var2.field1399 == Float.MAX_VALUE) {
                var4 = true;
            } else if (var2.field1405 == null) {
                var3 = true;
            } else if (arg0.field1449) {
                float[] var5 = new float[4];
                float[] var6 = new float[4];
                var5[0] = (float) var2.field1401;
                var6[0] = var2.field1400;
                var5[1] = var2.field1403 * 0.33333334F + var5[0];
                var6[1] = var2.field1399 * 0.33333334F + var6[0];
                var5[3] = (float) var2.field1405.field1401;
                var6[3] = var2.field1405.field1400;
                var5[2] = var5[3] - var2.field1405.field1404 * 0.33333334F;
                var6[2] = var6[3] - var2.field1405.field1402 * 0.33333334F;
                if (arg0.field1448) {
                    method3474(arg0, var5, var6);
                } else if (arg0 != null) {
                    arg0.field1438 = var5[0];
                    float var7 = var5[3] - var5[0];
                    float var8 = var6[3] - var6[0];
                    float var9 = var5[1] - var5[0];
                    float var10 = 0.0F;
                    float var11 = 0.0F;
                    if ((double) var9 != 0.0D) {
                        var10 = (var6[1] - var6[0]) / var9;
                    }
                    float var12 = var5[3] - var5[2];
                    if ((double) var12 != 0.0D) {
                        var11 = (var6[3] - var6[2]) / var12;
                    }
                    float var13 = 1.0F / (var7 * var7);
                    float var14 = var7 * var10;
                    float var15 = var7 * var11;
                    arg0.field1446[0] = (var14 + var15 - var8 - var8) * var13 / var7;
                    arg0.field1446[1] = (var8 + var8 + var8 - var14 - var14 - var15) * var13;
                    arg0.field1446[2] = var10;
                    arg0.field1446[3] = var6[0];
                }
                arg0.field1449 = false;
            }
            if (var3) {
                return var2.field1400;
            } else if (var4) {
                return (float) var2.field1401 == arg1 || var2.field1405 == null ? var2.field1400 : var2.field1405.field1400;
            } else if (arg0.field1448) {
                float var16;
                if (arg0 == null) {
                    var16 = 0.0F;
                } else {
                    float var17;
                    if (arg0.field1438 == arg1) {
                        var17 = 0.0F;
                    } else if (arg0.field1445 == arg1) {
                        var17 = 1.0F;
                    } else {
                        var17 = (arg1 - arg0.field1438) / (arg0.field1445 - arg0.field1438);
                    }
                    float var18;
                    if (arg0.field1443) {
                        var18 = var17;
                    } else {
                        float[] var19 = new float[] { arg0.field1446[0] - var17, arg0.field1446[1], arg0.field1446[2], arg0.field1446[3] };
                        float[] var20 = new float[5];
                        int var21 = class391.method2921(var19, 3, 0.0F, true, 1.0F, true, var20);
                        if (var21 == 1) {
                            var18 = var20[0];
                        } else {
                            var18 = 0.0F;
                        }
                    }
                    var16 = ((arg0.field1441[3] * var18 + arg0.field1441[2]) * var18 + arg0.field1441[1]) * var18 + arg0.field1441[0];
                }
                return var16;
            } else {
                return method6375(arg0, arg1);
            }
        }
    }

    @ObfuscatedName("ol.h(Ldj;FB)F")
    public static float method6375(class118 arg0, float arg1) {
        if (arg0 == null) {
            return 0.0F;
        } else {
            float var2 = arg1 - arg0.field1438;
            return ((arg0.field1446[0] * var2 + arg0.field1446[1]) * var2 + arg0.field1446[2]) * var2 + arg0.field1446[3];
        }
    }

    @ObfuscatedName("gr.v(Ldj;[F[FB)V")
    public static void method3474(class118 arg0, float[] arg1, float[] arg2) {
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
        arg0.field1443 = var6 == 0.33333334F && var7 == 0.6666667F;
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
                if (field1411 + var13 > 0.0F) {
                    Statics.method2747(var10, var12);
                }
            }
            Float var14 = 1.0F - var12;
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
        arg0.field1438 = arg1[0];
        arg0.field1445 = arg1[3];
        method3111(0.0F, var6, var7, 1.0F, arg0.field1446);
        method3111(arg2[0], arg2[1], arg2[2], arg2[3], arg0.field1441);
    }

    @ObfuscatedName("fh.q(FFFF[FI)V")
    public static void method3111(float arg0, float arg1, float arg2, float arg3, float[] arg4) {
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
