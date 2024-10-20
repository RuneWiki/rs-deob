package deob;

@ObfuscatedName("ew")
public class class129 {

    @ObfuscatedName("ew.ax")
    public static final float field1502 = Math.ulp(1.0F);

    @ObfuscatedName("ew.ao")
    public static final float field1505 = field1502 * 2.0F;

    @ObfuscatedName("ew.ah")
    public static float[] field1503 = new float[4];

    @ObfuscatedName("ew.ar")
    public static float[] field1504 = new float[5];

    public class129() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hf.ac(Lfz;FB)F")
    public static float method3286(class133 arg0, float arg1) {
        if (arg0 == null || arg0.method2876() == 0) {
            return 0.0F;
        } else if (arg1 < (float) arg0.field1542[0].field1493) {
            return class131.field1525 == arg0.field1548 ? arg0.field1542[0].field1491 : method2591(arg0, arg1, true);
        } else if (arg1 > (float) arg0.field1542[arg0.method2876() - 1].field1493) {
            return class131.field1525 == arg0.field1554 ? arg0.field1542[arg0.method2876() - 1].field1491 : method2591(arg0, arg1, false);
        } else if (arg0.field1549) {
            return arg0.field1542[0].field1491;
        } else {
            class128 var2 = arg0.method2889(arg1);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
                return 0.0F;
            }
            if ((double) var2.field1490 == 0.0D && (double) var2.field1495 == 0.0D) {
                var3 = true;
            } else if (var2.field1490 == Float.MAX_VALUE && var2.field1495 == Float.MAX_VALUE) {
                var4 = true;
            } else if (var2.field1494 == null) {
                var3 = true;
            } else if (arg0.field1553) {
                float var5 = (float) var2.field1493;
                float var6 = var2.field1491;
                float var7 = var2.field1490 * 0.33333334F + var5;
                float var8 = var2.field1495 * 0.33333334F + var6;
                float var9 = (float) var2.field1494.field1493;
                float var10 = var2.field1494.field1491;
                float var11 = var9 - var2.field1494.field1492 * 0.33333334F;
                float var12 = var10 - var2.field1494.field1496 * 0.33333334F;
                if (arg0.field1559) {
                    float var15 = var8;
                    float var16 = var12;
                    if (arg0 != null) {
                        float var17 = var9 - var5;
                        if ((double) var17 != 0.0D) {
                            float var18 = var7 - var5;
                            float var19 = var11 - var5;
                            float[] var20 = new float[] { var18 / var17, var19 / var17 };
                            arg0.field1557 = var20[0] == 0.33333334F && var20[1] == 0.6666667F;
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
                                    if (field1502 + var23 > 0.0F) {
                                        method95(var20);
                                    }
                                }
                                var20[1] = 1.0F - var20[1];
                            }
                            if (var20[0] != var21) {
                                float var24 = var20[0] * var17 + var5;
                                if ((double) var21 != 0.0D) {
                                    var15 = (var8 - var6) * var20[0] / var21 + var6;
                                }
                            }
                            if (var20[1] != var22) {
                                float var25 = var20[1] * var17 + var5;
                                if ((double) var22 != 1.0D) {
                                    var16 = (float) ((double) var10 - (1.0D - (double) var20[1]) * (double) (var10 - var12) / (1.0D - (double) var22));
                                }
                            }
                            arg0.field1544 = var5;
                            arg0.field1545 = var9;
                            method5346(0.0F, var20[0], var20[1], 1.0F, arg0);
                            float var26 = var15 - var6;
                            float var27 = var16 - var15;
                            float var28 = var10 - var16;
                            float var29 = var27 - var26;
                            arg0.field1555 = var28 - var27 - var29;
                            arg0.field1552 = var29 + var29 + var29;
                            arg0.field1551 = var26 + var26 + var26;
                            arg0.field1550 = var6;
                        }
                    }
                } else {
                    method2599(arg0, var5, var7, var11, var9, var6, var8, var12, var10);
                }
                arg0.field1553 = false;
            }
            if (var3) {
                return var2.field1491;
            } else if (var4) {
                return (float) var2.field1493 == arg1 || var2.field1494 == null ? var2.field1491 : var2.field1494.field1491;
            } else if (arg0.field1559) {
                float var30;
                if (arg0 == null) {
                    var30 = 0.0F;
                } else {
                    float var31;
                    if (arg0.field1544 == arg1) {
                        var31 = 0.0F;
                    } else if (arg0.field1545 == arg1) {
                        var31 = 1.0F;
                    } else {
                        var31 = (arg1 - arg0.field1544) / (arg0.field1545 - arg0.field1544);
                    }
                    float var32;
                    if (arg0.field1557) {
                        var32 = var31;
                    } else {
                        field1503[3] = arg0.field1543;
                        field1503[2] = arg0.field1539;
                        field1503[1] = arg0.field1547;
                        field1503[0] = arg0.field1546 - var31;
                        field1504[0] = 0.0F;
                        field1504[1] = 0.0F;
                        field1504[2] = 0.0F;
                        field1504[3] = 0.0F;
                        field1504[4] = 0.0F;
                        int var33 = class468.method5314(field1503, 3, 0.0F, true, 1.0F, true, field1504);
                        if (var33 == 1) {
                            var32 = field1504[0];
                        } else {
                            var32 = 0.0F;
                        }
                    }
                    var30 = ((arg0.field1555 * var32 + arg0.field1552) * var32 + arg0.field1551) * var32 + arg0.field1550;
                }
                return var30;
            } else {
                return method302(arg0, arg1);
            }
        }
    }

    @ObfuscatedName("az.al(Lfz;FB)F")
    public static float method302(class133 arg0, float arg1) {
        if (arg0 == null) {
            return 0.0F;
        } else {
            float var2 = arg1 - arg0.field1544;
            return ((arg0.field1546 * var2 + arg0.field1547) * var2 + arg0.field1539) * var2 + arg0.field1543;
        }
    }

    @ObfuscatedName("eo.ak(Lfz;FZI)F")
    public static float method2591(class133 arg0, float arg1, boolean arg2) {
        float var3 = 0.0F;
        if (arg0 == null || arg0.method2876() == 0) {
            return var3;
        }
        float var4 = (float) arg0.field1542[0].field1493;
        float var5 = (float) arg0.field1542[arg0.method2876() - 1].field1493;
        float var6 = var5 - var4;
        if ((double) var6 == 0.0D) {
            return arg0.field1542[0].field1491;
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
            if (class131.field1523 == arg0.field1548) {
                if ((double) var19 == 0.0D) {
                    var12 = var5 - var12;
                } else {
                    var12 += var4;
                }
            } else if (class131.field1526 == arg0.field1548 || class131.field1527 == arg0.field1548) {
                var12 = var5 - var12;
            } else if (class131.field1524 == arg0.field1548) {
                float var20 = var4 - arg1;
                float var21 = arg0.field1542[0].field1492;
                float var22 = arg0.field1542[0].field1496;
                float var23 = arg0.field1542[0].field1491;
                if ((double) var21 != 0.0D) {
                    var23 -= var20 * var22 / var21;
                }
                return var23;
            }
        } else if (class131.field1523 == arg0.field1554) {
            if ((double) var19 == 0.0D) {
                var12 += var4;
            } else {
                var12 = var5 - var12;
            }
        } else if (class131.field1526 == arg0.field1554 || class131.field1527 == arg0.field1554) {
            var12 += var4;
        } else if (class131.field1524 == arg0.field1554) {
            float var24 = arg1 - var5;
            float var25 = arg0.field1542[arg0.method2876() - 1].field1490;
            float var26 = arg0.field1542[arg0.method2876() - 1].field1495;
            float var27 = arg0.field1542[arg0.method2876() - 1].field1491;
            if ((double) var25 != 0.0D) {
                var27 += var24 * var26 / var25;
            }
            return var27;
        }
        float var28 = method3286(arg0, var12);
        if (arg2 && class131.field1527 == arg0.field1548) {
            float var29 = arg0.field1542[arg0.method2876() - 1].field1491 - arg0.field1542[0].field1491;
            var28 = (float) ((double) var28 - (double) var29 * var13);
        } else if (!arg2 && class131.field1527 == arg0.field1554) {
            float var30 = arg0.field1542[arg0.method2876() - 1].field1491 - arg0.field1542[0].field1491;
            var28 = (float) ((double) var30 * var13 + (double) var28);
        }
        return var28;
    }

    @ObfuscatedName("el.ax(Lfz;FFFFFFFFI)V")
    public static void method2599(class133 arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8) {
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
        arg0.field1547 = (var10 + var10 + var10 - var16 - var16 - var17) * var15;
        arg0.field1539 = var12;
        arg0.field1543 = arg5;
    }

    @ObfuscatedName("ag.ao([FI)V")
    public static void method95(float[] arg0) {
        if (arg0[0] + field1502 >= 1.3333334F) {
            arg0[0] = 1.3333334F - field1502;
            arg0[1] = 0.33333334F - field1502;
            return;
        }
        float var1 = arg0[0] - 2.0F;
        float var2 = arg0[0] - 1.0F;
        float var3 = (float) Math.sqrt((double) (var1 * var1 - var2 * 4.0F * var2));
        float var4 = (-var1 + var3) * 0.5F;
        if (arg0[1] + field1502 > var4) {
            arg0[1] = var4 - field1502;
        } else {
            float var5 = (-var1 - var3) * 0.5F;
            if (arg0[1] < field1502 + var5) {
                arg0[1] = field1502 + var5;
            }
        }
    }

    @ObfuscatedName("mm.ah(FFFFLfz;B)V")
    public static void method5346(float arg0, float arg1, float arg2, float arg3, class133 arg4) {
        float var5 = arg1 - arg0;
        float var6 = arg2 - arg1;
        float var7 = arg3 - arg2;
        float var8 = var6 - var5;
        arg4.field1543 = var7 - var6 - var8;
        arg4.field1539 = var8 + var8 + var8;
        arg4.field1547 = var5 + var5 + var5;
        arg4.field1546 = arg0;
    }
}
