package deob;

@ObfuscatedName("de")
public class class113 {

    @ObfuscatedName("de.m")
    public static final float field1362 = Math.ulp(1.0F);

    @ObfuscatedName("de.t")
    public static final float field1363 = field1362 * 2.0F;

    public class113() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("g.c(Ldn;FB)F")
    public static float method202(class116 arg0, float arg1) {
        if (arg0 == null || arg0.method2509() == 0) {
            return 0.0F;
        } else if (arg1 < (float) arg0.field1394[0].field1360) {
            return class115.field1391 == arg0.field1411 ? arg0.field1394[0].field1350 : method4012(arg0, arg1, true);
        } else if (arg1 > (float) arg0.field1394[arg0.method2509() - 1].field1360) {
            return class115.field1391 == arg0.field1397 ? arg0.field1394[arg0.method2509() - 1].field1350 : method4012(arg0, arg1, false);
        } else if (arg0.field1409) {
            return arg0.field1394[0].field1350;
        } else {
            class112 var2 = arg0.method2503(arg1);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
                return 0.0F;
            }
            if ((double) var2.field1353 == 0.0D && (double) var2.field1358 == 0.0D) {
                var3 = true;
            } else if (var2.field1353 == Float.MAX_VALUE && var2.field1358 == Float.MAX_VALUE) {
                var4 = true;
            } else if (var2.field1355 == null) {
                var3 = true;
            } else if (arg0.field1404) {
                float[] var5 = new float[4];
                float[] var6 = new float[4];
                var5[0] = (float) var2.field1360;
                var6[0] = var2.field1350;
                var5[1] = var2.field1353 * 0.33333334F + var5[0];
                var6[1] = var2.field1358 * 0.33333334F + var6[0];
                var5[3] = (float) var2.field1355.field1360;
                var6[3] = var2.field1355.field1350;
                var5[2] = var5[3] - var2.field1355.field1351 * 0.33333334F;
                var6[2] = var6[3] - var2.field1355.field1352 * 0.33333334F;
                if (arg0.field1398) {
                    method194(arg0, var5, var6);
                } else {
                    method2381(arg0, var5, var6);
                }
                arg0.field1404 = false;
            }
            if (var3) {
                return var2.field1350;
            } else if (var4) {
                return (float) var2.field1360 == arg1 || var2.field1355 == null ? var2.field1350 : var2.field1355.field1350;
            } else if (arg0.field1398) {
                float var7;
                if (arg0 == null) {
                    var7 = 0.0F;
                } else {
                    float var8;
                    if (arg0.field1407 == arg1) {
                        var8 = 0.0F;
                    } else if (arg0.field1395 == arg1) {
                        var8 = 1.0F;
                    } else {
                        var8 = (arg1 - arg0.field1407) / (arg0.field1395 - arg0.field1407);
                    }
                    float var9;
                    if (arg0.field1399) {
                        var9 = var8;
                    } else {
                        float[] var10 = new float[] { arg0.field1402[0] - var8, arg0.field1402[1], arg0.field1402[2], arg0.field1402[3] };
                        float[] var11 = new float[5];
                        int var12 = class369.method2727(var10, 3, 0.0F, true, 1.0F, true, var11);
                        if (var12 == 1) {
                            var9 = var11[0];
                        } else {
                            var9 = 0.0F;
                        }
                    }
                    var7 = ((arg0.field1403[3] * var9 + arg0.field1403[2]) * var9 + arg0.field1403[1]) * var9 + arg0.field1403[0];
                }
                return var7;
            } else {
                float var13;
                if (arg0 == null) {
                    var13 = 0.0F;
                } else {
                    float var14 = arg1 - arg0.field1407;
                    var13 = ((arg0.field1402[0] * var14 + arg0.field1402[1]) * var14 + arg0.field1402[2]) * var14 + arg0.field1402[3];
                }
                return var13;
            }
        }
    }

    @ObfuscatedName("hd.b(Ldn;FZI)F")
    public static float method4012(class116 arg0, float arg1, boolean arg2) {
        float var3 = 0.0F;
        if (arg0 == null || arg0.method2509() == 0) {
            return var3;
        }
        float var4 = (float) arg0.field1394[0].field1360;
        float var5 = (float) arg0.field1394[arg0.method2509() - 1].field1360;
        float var6 = var5 - var4;
        if ((double) var6 == 0.0D) {
            return arg0.field1394[0].field1350;
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
            if (class115.field1387 == arg0.field1411) {
                if ((double) var19 == 0.0D) {
                    var12 = var5 - var12;
                } else {
                    var12 += var4;
                }
            } else if (class115.field1385 == arg0.field1411 || class115.field1392 == arg0.field1411) {
                var12 = var5 - var12;
            } else if (class115.field1384 == arg0.field1411) {
                float var20 = var4 - arg1;
                float var21 = arg0.field1394[0].field1351;
                float var22 = arg0.field1394[0].field1352;
                float var23 = arg0.field1394[0].field1350;
                if ((double) var21 != 0.0D) {
                    var23 -= var20 * var22 / var21;
                }
                return var23;
            }
        } else if (class115.field1387 == arg0.field1397) {
            if ((double) var19 == 0.0D) {
                var12 += var4;
            } else {
                var12 = var5 - var12;
            }
        } else if (class115.field1385 == arg0.field1397 || class115.field1392 == arg0.field1397) {
            var12 += var4;
        } else if (class115.field1384 == arg0.field1397) {
            float var24 = arg1 - var5;
            float var25 = arg0.field1394[arg0.method2509() - 1].field1353;
            float var26 = arg0.field1394[arg0.method2509() - 1].field1358;
            float var27 = arg0.field1394[arg0.method2509() - 1].field1350;
            if ((double) var25 != 0.0D) {
                var27 += var24 * var26 / var25;
            }
            return var27;
        }
        float var28 = method202(arg0, var12);
        if (arg2 && class115.field1392 == arg0.field1411) {
            float var29 = arg0.field1394[arg0.method2509() - 1].field1350 - arg0.field1394[0].field1350;
            var28 = (float) ((double) var28 - (double) var29 * var13);
        } else if (!arg2 && class115.field1392 == arg0.field1397) {
            float var30 = arg0.field1394[arg0.method2509() - 1].field1350 - arg0.field1394[0].field1350;
            var28 = (float) ((double) var30 * var13 + (double) var28);
        }
        return var28;
    }

    @ObfuscatedName("h.p(Ldn;[F[FI)V")
    public static void method194(class116 arg0, float[] arg1, float[] arg2) {
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
        arg0.field1399 = var6 == 0.33333334F && var7 == 0.6666667F;
        float var8 = var6;
        float var9 = var7;
        if ((double) var6 < 0.0D) {
            var6 = 0.0F;
        }
        if ((double) var7 > 1.0D) {
            var7 = 1.0F;
        }
        if ((double) var6 > 1.0D || var7 < -1.0F) {
            method3528(var6, var7);
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
        arg0.field1407 = arg1[0];
        arg0.field1395 = arg1[3];
        float var10 = var6;
        float var11 = var7;
        float[] var12 = arg0.field1402;
        float var13 = var10 - 0.0F;
        float var14 = var11 - var10;
        float var15 = 1.0F - var11;
        float var16 = var14 - var13;
        var12[3] = var15 - var14 - var16;
        var12[2] = var16 + var16 + var16;
        var12[1] = var13 + var13 + var13;
        var12[0] = 0.0F;
        float var17 = arg2[0];
        float var18 = arg2[1];
        float var19 = arg2[2];
        float var20 = arg2[3];
        float[] var21 = arg0.field1403;
        float var22 = var18 - var17;
        float var23 = var19 - var18;
        float var24 = var20 - var19;
        float var25 = var23 - var22;
        var21[3] = var24 - var23 - var25;
        var21[2] = var25 + var25 + var25;
        var21[1] = var22 + var22 + var22;
        var21[0] = var17;
    }

    @ObfuscatedName("cu.m(Ldn;[F[FS)V")
    public static void method2381(class116 arg0, float[] arg1, float[] arg2) {
        if (arg0 == null) {
            return;
        }
        arg0.field1407 = arg1[0];
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
        arg0.field1402[0] = (var10 + var11 - var4 - var4) * var9 / var3;
        arg0.field1402[1] = (var4 + var4 + var4 - var10 - var10 - var11) * var9;
        arg0.field1402[2] = var6;
        arg0.field1402[3] = arg2[0];
    }

    @ObfuscatedName("fc.t(Ljava/lang/Float;Ljava/lang/Float;I)V")
    public static void method2990(Float arg0, Float arg1) {
        if (arg0 + field1362 >= 1.3333334F) {
            Float var9 = 1.3333334F - field1362;
            Float var10 = 0.33333334F - field1362;
            return;
        }
        float var2 = arg0 - 2.0F;
        float var3 = arg0 - 1.0F;
        float var4 = (float) Math.sqrt((double) (var2 * var2 - var3 * 4.0F * var3));
        float var5 = (-var2 + var4) * 0.5F;
        if (arg1 + field1362 > var5) {
            Float var6 = var5 - field1362;
        } else {
            float var7 = (-var2 - var4) * 0.5F;
            if (arg1 < field1362 + var7) {
                Float var8 = field1362 + var7;
            }
        }
    }

    @ObfuscatedName("gb.s(Ljava/lang/Float;Ljava/lang/Float;B)V")
    public static void method3528(Float arg0, Float arg1) {
        Float var2 = 1.0F - arg1;
        if (arg0 < 0.0F) {
            arg0 = 0.0F;
        }
        if (var2 < 0.0F) {
            var2 = 0.0F;
        }
        if (arg0 > 1.0F || var2 > 1.0F) {
            float var3 = (float) ((double) (arg0 * (arg0 - 2.0F + var2)) + (double) var2 * ((double) var2 - 2.0D) + 1.0D);
            if (field1362 + var3 > 0.0F) {
                method2990(arg0, var2);
            }
        }
        Float var4 = 1.0F - var2;
    }
}
