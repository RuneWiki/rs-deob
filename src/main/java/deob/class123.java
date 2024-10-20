package deob;

@ObfuscatedName("db")
public class class123 {

    @ObfuscatedName("db.x")
    public static final float field1507 = Math.ulp(1.0F);

    @ObfuscatedName("db.m")
    public static final float field1508 = field1507 * 2.0F;

    @ObfuscatedName("db.q")
    public static float[] field1506 = new float[4];

    @ObfuscatedName("db.f")
    public static float[] field1510 = new float[5];

    public class123() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gk.h(Ldu;FI)F")
    public static float method3646(class126 arg0, float arg1) {
        if (arg0 == null || arg0.method2800() == 0) {
            return 0.0F;
        } else if (arg1 < (float) arg0.field1542[0].field1503) {
            return class125.field1536 == arg0.field1540 ? arg0.field1542[0].field1498 : method1720(arg0, arg1, true);
        } else if (arg1 > (float) arg0.field1542[arg0.method2800() - 1].field1503) {
            return class125.field1536 == arg0.field1541 ? arg0.field1542[arg0.method2800() - 1].field1498 : method1720(arg0, arg1, false);
        } else if (arg0.field1539) {
            return arg0.field1542[0].field1498;
        } else {
            class122 var2 = arg0.method2803(arg1);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
                return 0.0F;
            }
            if ((double) var2.field1501 == 0.0D && (double) var2.field1499 == 0.0D) {
                var3 = true;
            } else if (var2.field1501 == Float.MAX_VALUE && var2.field1499 == Float.MAX_VALUE) {
                var4 = true;
            } else if (var2.field1502 == null) {
                var3 = true;
            } else if (arg0.field1554) {
                float var5 = (float) var2.field1503;
                float var6 = var2.field1498;
                float var7 = var2.field1501 * 0.33333334F + var5;
                float var8 = var2.field1499 * 0.33333334F + var6;
                float var9 = (float) var2.field1502.field1503;
                float var10 = var2.field1502.field1498;
                float var11 = var9 - var2.field1502.field1497 * 0.33333334F;
                float var12 = var10 - var2.field1502.field1500 * 0.33333334F;
                if (arg0.field1548) {
                    float var15 = var8;
                    float var16 = var12;
                    if (arg0 != null) {
                        float var17 = var9 - var5;
                        if ((double) var17 != 0.0D) {
                            float var18 = var7 - var5;
                            float var19 = var11 - var5;
                            float[] var20 = new float[] { var18 / var17, var19 / var17 };
                            arg0.field1558 = var20[0] == 0.33333334F && var20[1] == 0.6666667F;
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
                                    if (field1507 + var23 > 0.0F) {
                                        if (var20[0] + field1507 < 1.3333334F) {
                                            float var24 = var20[0] - 2.0F;
                                            float var25 = var20[0] - 1.0F;
                                            float var26 = (float) Math.sqrt((double) (var24 * var24 - var25 * 4.0F * var25));
                                            float var27 = (-var24 + var26) * 0.5F;
                                            if (var20[1] + field1507 > var27) {
                                                var20[1] = var27 - field1507;
                                            } else {
                                                float var28 = (-var24 - var26) * 0.5F;
                                                if (var20[1] < field1507 + var28) {
                                                    var20[1] = field1507 + var28;
                                                }
                                            }
                                        } else {
                                            var20[0] = 1.3333334F - field1507;
                                            var20[1] = 0.33333334F - field1507;
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
                            arg0.field1544 = var5;
                            arg0.field1545 = var9;
                            float var31 = var20[0];
                            float var32 = var20[1];
                            float var33 = var31 - 0.0F;
                            float var34 = var32 - var31;
                            float var35 = 1.0F - var32;
                            float var36 = var34 - var33;
                            arg0.field1549 = var35 - var34 - var36;
                            arg0.field1538 = var36 + var36 + var36;
                            arg0.field1560 = var33 + var33 + var33;
                            arg0.field1546 = 0.0F;
                            float var37 = var15 - var6;
                            float var38 = var16 - var15;
                            float var39 = var10 - var16;
                            float var40 = var38 - var37;
                            arg0.field1553 = var39 - var38 - var40;
                            arg0.field1552 = var40 + var40 + var40;
                            arg0.field1551 = var37 + var37 + var37;
                            arg0.field1550 = var6;
                        }
                    }
                } else {
                    method5782(arg0, var5, var7, var11, var9, var6, var8, var12, var10);
                }
                arg0.field1554 = false;
            }
            if (var3) {
                return var2.field1498;
            } else if (var4) {
                return (float) var2.field1503 == arg1 || var2.field1502 == null ? var2.field1498 : var2.field1502.field1498;
            } else if (arg0.field1548) {
                return method416(arg0, arg1);
            } else {
                return method2484(arg0, arg1);
            }
        }
    }

    @ObfuscatedName("ao.e(Ldu;FI)F")
    public static float method416(class126 arg0, float arg1) {
        if (arg0 == null) {
            return 0.0F;
        }
        float var2;
        if (arg0.field1544 == arg1) {
            var2 = 0.0F;
        } else if (arg0.field1545 == arg1) {
            var2 = 1.0F;
        } else {
            var2 = (arg1 - arg0.field1544) / (arg0.field1545 - arg0.field1544);
        }
        float var3;
        if (arg0.field1558) {
            var3 = var2;
        } else {
            field1506[3] = arg0.field1549;
            field1506[2] = arg0.field1538;
            field1506[1] = arg0.field1560;
            field1506[0] = arg0.field1546 - var2;
            field1510[0] = 0.0F;
            field1510[1] = 0.0F;
            field1510[2] = 0.0F;
            field1510[3] = 0.0F;
            field1510[4] = 0.0F;
            int var4 = class413.method7268(field1506, 3, 0.0F, true, 1.0F, true, field1510);
            if (var4 == 1) {
                var3 = field1510[0];
            } else {
                var3 = 0.0F;
            }
        }
        return ((arg0.field1553 * var3 + arg0.field1552) * var3 + arg0.field1551) * var3 + arg0.field1550;
    }

    @ObfuscatedName("ck.v(Ldu;FB)F")
    public static float method2484(class126 arg0, float arg1) {
        if (arg0 == null) {
            return 0.0F;
        } else {
            float var2 = arg1 - arg0.field1544;
            return ((arg0.field1546 * var2 + arg0.field1560) * var2 + arg0.field1538) * var2 + arg0.field1549;
        }
    }

    @ObfuscatedName("bi.x(Ldu;FZI)F")
    public static float method1720(class126 arg0, float arg1, boolean arg2) {
        float var3 = 0.0F;
        if (arg0 == null || arg0.method2800() == 0) {
            return var3;
        }
        float var4 = (float) arg0.field1542[0].field1503;
        float var5 = (float) arg0.field1542[arg0.method2800() - 1].field1503;
        float var6 = var5 - var4;
        if ((double) var6 == 0.0D) {
            return arg0.field1542[0].field1498;
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
            if (class125.field1532 == arg0.field1540) {
                if ((double) var19 == 0.0D) {
                    var12 = var5 - var12;
                } else {
                    var12 += var4;
                }
            } else if (class125.field1530 == arg0.field1540 || class125.field1537 == arg0.field1540) {
                var12 = var5 - var12;
            } else if (class125.field1529 == arg0.field1540) {
                float var20 = var4 - arg1;
                float var21 = arg0.field1542[0].field1497;
                float var22 = arg0.field1542[0].field1500;
                float var23 = arg0.field1542[0].field1498;
                if ((double) var21 != 0.0D) {
                    var23 -= var20 * var22 / var21;
                }
                return var23;
            }
        } else if (class125.field1532 == arg0.field1541) {
            if ((double) var19 == 0.0D) {
                var12 += var4;
            } else {
                var12 = var5 - var12;
            }
        } else if (class125.field1530 == arg0.field1541 || class125.field1537 == arg0.field1541) {
            var12 += var4;
        } else if (class125.field1529 == arg0.field1541) {
            float var24 = arg1 - var5;
            float var25 = arg0.field1542[arg0.method2800() - 1].field1501;
            float var26 = arg0.field1542[arg0.method2800() - 1].field1499;
            float var27 = arg0.field1542[arg0.method2800() - 1].field1498;
            if ((double) var25 != 0.0D) {
                var27 += var24 * var26 / var25;
            }
            return var27;
        }
        float var28 = method3646(arg0, var12);
        if (arg2 && class125.field1537 == arg0.field1540) {
            float var29 = arg0.field1542[arg0.method2800() - 1].field1498 - arg0.field1542[0].field1498;
            var28 = (float) ((double) var28 - (double) var29 * var13);
        } else if (!arg2 && class125.field1537 == arg0.field1541) {
            float var30 = arg0.field1542[arg0.method2800() - 1].field1498 - arg0.field1542[0].field1498;
            var28 = (float) ((double) var30 * var13 + (double) var28);
        }
        return var28;
    }

    @ObfuscatedName("lm.m(Ldu;FFFFFFFFI)V")
    public static void method5782(class126 arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8) {
        if (arg0 == null) {
            return;
        }
        arg0.field1544 = arg1;
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
        arg0.field1546 = (var16 + var17 - var10 - var10) * var15 / var9;
        arg0.field1560 = (var10 + var10 + var10 - var16 - var16 - var17) * var15;
        arg0.field1538 = var12;
        arg0.field1549 = arg5;
    }
}
