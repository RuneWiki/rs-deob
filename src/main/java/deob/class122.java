package deob;

@ObfuscatedName("ds")
public class class122 {

    @ObfuscatedName("ds.s")
    public static final float field1480 = Math.ulp(1.0F);

    @ObfuscatedName("ds.z")
    public static final float field1481 = field1480 * 2.0F;

    @ObfuscatedName("ds.j")
    public static float[] field1478 = new float[4];

    @ObfuscatedName("ds.i")
    public static float[] field1486 = new float[5];

    public class122() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("di.f(Lda;FI)F")
    public static float method2737(class126 arg0, float arg1) {
        if (arg0 == null || arg0.method2918() == 0) {
            return 0.0F;
        } else if (arg1 < (float) arg0.field1525[0].field1475) {
            return class124.field1503 == arg0.field1523 ? arg0.field1525[0].field1468 : method2684(arg0, arg1, true);
        } else if (arg1 > (float) arg0.field1525[arg0.method2918() - 1].field1475) {
            return class124.field1503 == arg0.field1542 ? arg0.field1525[arg0.method2918() - 1].field1468 : method2684(arg0, arg1, false);
        } else if (arg0.field1522) {
            return arg0.field1525[0].field1468;
        } else {
            class121 var2 = arg0.method2907(arg1);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
                return 0.0F;
            }
            if ((double) var2.field1474 == 0.0D && (double) var2.field1473 == 0.0D) {
                var3 = true;
            } else if (var2.field1474 == Float.MAX_VALUE && var2.field1473 == Float.MAX_VALUE) {
                var4 = true;
            } else if (var2.field1469 == null) {
                var3 = true;
            } else if (arg0.field1531) {
                float var5 = (float) var2.field1475;
                float var6 = var2.field1468;
                float var7 = var2.field1474 * 0.33333334F + var5;
                float var8 = var2.field1473 * 0.33333334F + var6;
                float var9 = (float) var2.field1469.field1475;
                float var10 = var2.field1469.field1468;
                float var11 = var9 - var2.field1469.field1470 * 0.33333334F;
                float var12 = var10 - var2.field1469.field1471 * 0.33333334F;
                if (arg0.field1546) {
                    float var15 = var8;
                    float var16 = var12;
                    if (arg0 != null) {
                        float var17 = var9 - var5;
                        if ((double) var17 != 0.0D) {
                            float var18 = var7 - var5;
                            float var19 = var11 - var5;
                            float[] var20 = new float[] { var18 / var17, var19 / var17 };
                            arg0.field1526 = var20[0] == 0.33333334F && var20[1] == 0.6666667F;
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
                                    if (field1480 + var23 > 0.0F) {
                                        if (var20[0] + field1480 < 1.3333334F) {
                                            float var24 = var20[0] - 2.0F;
                                            float var25 = var20[0] - 1.0F;
                                            float var26 = (float) Math.sqrt((double) (var24 * var24 - var25 * 4.0F * var25));
                                            float var27 = (-var24 + var26) * 0.5F;
                                            if (var20[1] + field1480 > var27) {
                                                var20[1] = var27 - field1480;
                                            } else {
                                                float var28 = (-var24 - var26) * 0.5F;
                                                if (var20[1] < field1480 + var28) {
                                                    var20[1] = field1480 + var28;
                                                }
                                            }
                                        } else {
                                            var20[0] = 1.3333334F - field1480;
                                            var20[1] = 0.33333334F - field1480;
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
                            arg0.field1521 = var5;
                            arg0.field1528 = var9;
                            Statics.method1135(0.0F, var20[0], var20[1], 1.0F, arg0);
                            method1819(var6, var15, var16, var10, arg0);
                        }
                    }
                } else {
                    method1088(arg0, var5, var7, var11, var9, var6, var8, var12, var10);
                }
                arg0.field1531 = false;
            }
            if (var3) {
                return var2.field1468;
            } else if (var4) {
                return (float) var2.field1475 == arg1 || var2.field1469 == null ? var2.field1468 : var2.field1469.field1468;
            } else if (arg0.field1546) {
                return method2104(arg0, arg1);
            } else {
                return method6834(arg0, arg1);
            }
        }
    }

    @ObfuscatedName("bh.w(Lda;FI)F")
    public static float method2104(class126 arg0, float arg1) {
        if (arg0 == null) {
            return 0.0F;
        }
        float var2;
        if (arg0.field1521 == arg1) {
            var2 = 0.0F;
        } else if (arg0.field1528 == arg1) {
            var2 = 1.0F;
        } else {
            var2 = (arg1 - arg0.field1521) / (arg0.field1528 - arg0.field1521);
        }
        float var3;
        if (arg0.field1526) {
            var3 = var2;
        } else {
            field1478[3] = arg0.field1532;
            field1478[2] = arg0.field1544;
            field1478[1] = arg0.field1530;
            field1478[0] = arg0.field1529 - var2;
            field1486[0] = 0.0F;
            field1486[1] = 0.0F;
            field1486[2] = 0.0F;
            field1486[3] = 0.0F;
            field1486[4] = 0.0F;
            int var4 = class420.method5311(field1478, 3, 0.0F, true, 1.0F, true, field1486);
            if (var4 == 1) {
                var3 = field1486[0];
            } else {
                var3 = 0.0F;
            }
        }
        return ((arg0.field1536 * var3 + arg0.field1535) * var3 + arg0.field1538) * var3 + arg0.field1533;
    }

    @ObfuscatedName("nh.v(Lda;FB)F")
    public static float method6834(class126 arg0, float arg1) {
        if (arg0 == null) {
            return 0.0F;
        } else {
            float var2 = arg1 - arg0.field1521;
            return ((arg0.field1529 * var2 + arg0.field1530) * var2 + arg0.field1544) * var2 + arg0.field1532;
        }
    }

    @ObfuscatedName("dz.s(Lda;FZI)F")
    public static float method2684(class126 arg0, float arg1, boolean arg2) {
        float var3 = 0.0F;
        if (arg0 == null || arg0.method2918() == 0) {
            return var3;
        }
        float var4 = (float) arg0.field1525[0].field1475;
        float var5 = (float) arg0.field1525[arg0.method2918() - 1].field1475;
        float var6 = var5 - var4;
        if ((double) var6 == 0.0D) {
            return arg0.field1525[0].field1468;
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
            if (class124.field1506 == arg0.field1523) {
                if ((double) var19 == 0.0D) {
                    var12 = var5 - var12;
                } else {
                    var12 += var4;
                }
            } else if (class124.field1504 == arg0.field1523 || class124.field1507 == arg0.field1523) {
                var12 = var5 - var12;
            } else if (class124.field1505 == arg0.field1523) {
                float var20 = var4 - arg1;
                float var21 = arg0.field1525[0].field1470;
                float var22 = arg0.field1525[0].field1471;
                float var23 = arg0.field1525[0].field1468;
                if ((double) var21 != 0.0D) {
                    var23 -= var20 * var22 / var21;
                }
                return var23;
            }
        } else if (class124.field1506 == arg0.field1542) {
            if ((double) var19 == 0.0D) {
                var12 += var4;
            } else {
                var12 = var5 - var12;
            }
        } else if (class124.field1504 == arg0.field1542 || class124.field1507 == arg0.field1542) {
            var12 += var4;
        } else if (class124.field1505 == arg0.field1542) {
            float var24 = arg1 - var5;
            float var25 = arg0.field1525[arg0.method2918() - 1].field1474;
            float var26 = arg0.field1525[arg0.method2918() - 1].field1473;
            float var27 = arg0.field1525[arg0.method2918() - 1].field1468;
            if ((double) var25 != 0.0D) {
                var27 += var24 * var26 / var25;
            }
            return var27;
        }
        float var28 = method2737(arg0, var12);
        if (arg2 && class124.field1507 == arg0.field1523) {
            float var29 = arg0.field1525[arg0.method2918() - 1].field1468 - arg0.field1525[0].field1468;
            var28 = (float) ((double) var28 - (double) var29 * var13);
        } else if (!arg2 && class124.field1507 == arg0.field1542) {
            float var30 = arg0.field1525[arg0.method2918() - 1].field1468 - arg0.field1525[0].field1468;
            var28 = (float) ((double) var30 * var13 + (double) var28);
        }
        return var28;
    }

    @ObfuscatedName("bl.z(Lda;FFFFFFFFS)V")
    public static void method1088(class126 arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8) {
        if (arg0 == null) {
            return;
        }
        arg0.field1521 = arg1;
        float var9 = arg4 - arg1;
        float var10 = arg8 - arg5;
        float var11 = arg2 - arg1;
        float var12 = 0.0F;
        float var13 = 0.0F;
        if ((double) var11 != 0.0D) {
            var12 = (arg6 - arg5) / var11;
        }
        float var14 = arg4 - arg3;
        if ((double) var14 != 0.0D) {
            var13 = (arg8 - arg7) / var14;
        }
        float var15 = 1.0F / (var9 * var9);
        float var16 = var9 * var12;
        float var17 = var9 * var13;
        arg0.field1529 = (var16 + var17 - var10 - var10) * var15 / var9;
        arg0.field1530 = (var10 + var10 + var10 - var16 - var16 - var17) * var15;
        arg0.field1544 = var12;
        arg0.field1532 = arg5;
    }

    @ObfuscatedName("bt.i(FFFFLda;I)V")
    public static void method1819(float arg0, float arg1, float arg2, float arg3, class126 arg4) {
        float var5 = arg1 - arg0;
        float var6 = arg2 - arg1;
        float var7 = arg3 - arg2;
        float var8 = var6 - var5;
        arg4.field1536 = var7 - var6 - var8;
        arg4.field1535 = var8 + var8 + var8;
        arg4.field1538 = var5 + var5 + var5;
        arg4.field1533 = arg0;
    }
}
