package deob;

@ObfuscatedName("ez")
public class class130 {

    @ObfuscatedName("ez.az")
    public static final float field1542 = Math.ulp(1.0F);

    @ObfuscatedName("ez.af")
    public static final float field1543 = field1542 * 2.0F;

    @ObfuscatedName("ez.aa")
    public static float[] field1545 = new float[4];

    @ObfuscatedName("ez.at")
    public static float[] field1540 = new float[5];

    public class130() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ka.ak(Lfm;FI)F")
    public static float method5032(class134 arg0, float arg1) {
        if (arg0 == null || arg0.method2944() == 0) {
            return 0.0F;
        } else if (arg1 < (float) arg0.field1583[0].field1535) {
            return class132.field1571 == arg0.field1601 ? arg0.field1583[0].field1532 : method5442(arg0, arg1, true);
        } else if (arg1 > (float) arg0.field1583[arg0.method2944() - 1].field1535) {
            return class132.field1571 == arg0.field1582 ? arg0.field1583[arg0.method2944() - 1].field1532 : method5442(arg0, arg1, false);
        } else if (arg0.field1580) {
            return arg0.field1583[0].field1532;
        } else {
            class129 var2 = arg0.method2955(arg1);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
                return 0.0F;
            }
            if ((double) var2.field1536 == 0.0D && (double) var2.field1537 == 0.0D) {
                var3 = true;
            } else if (var2.field1536 == Float.MAX_VALUE && var2.field1537 == Float.MAX_VALUE) {
                var4 = true;
            } else if (var2.field1538 == null) {
                var3 = true;
            } else if (arg0.field1595) {
                float var5 = (float) var2.field1535;
                float var6 = var2.field1532;
                float var7 = var2.field1536 * 0.33333334F + var5;
                float var8 = var2.field1537 * 0.33333334F + var6;
                float var9 = (float) var2.field1538.field1535;
                float var10 = var2.field1538.field1532;
                float var11 = var9 - var2.field1538.field1534 * 0.33333334F;
                float var12 = var10 - var2.field1538.field1533 * 0.33333334F;
                if (arg0.field1587) {
                    method6815(arg0, var5, var7, var11, var9, var6, var8, var12, var10);
                } else if (arg0 != null) {
                    arg0.field1585 = var5;
                    float var13 = var9 - var5;
                    float var14 = var10 - var6;
                    float var15 = var7 - var5;
                    float var16 = 0.0F;
                    float var17 = 0.0F;
                    if ((double) var15 != 0.0D) {
                        var16 = (var8 - var6) / var15;
                    }
                    float var18 = var9 - var11;
                    if ((double) var18 != 0.0D) {
                        var17 = (var10 - var12) / var18;
                    }
                    float var19 = 1.0F / (var13 * var13);
                    float var20 = var13 * var16;
                    float var21 = var13 * var17;
                    arg0.field1597 = (var20 + var21 - var14 - var14) * var19 / var13;
                    arg0.field1588 = (var14 + var14 + var14 - var20 - var20 - var21) * var19;
                    arg0.field1602 = var16;
                    arg0.field1590 = var6;
                }
                arg0.field1595 = false;
            }
            if (var3) {
                return var2.field1532;
            } else if (var4) {
                return (float) var2.field1535 == arg1 || var2.field1538 == null ? var2.field1532 : var2.field1538.field1532;
            } else if (arg0.field1587) {
                float var22;
                if (arg0 == null) {
                    var22 = 0.0F;
                } else {
                    float var23;
                    if (arg0.field1585 == arg1) {
                        var23 = 0.0F;
                    } else if (arg0.field1586 == arg1) {
                        var23 = 1.0F;
                    } else {
                        var23 = (arg1 - arg0.field1585) / (arg0.field1586 - arg0.field1585);
                    }
                    float var24;
                    if (arg0.field1584) {
                        var24 = var23;
                    } else {
                        field1545[3] = arg0.field1590;
                        field1545[2] = arg0.field1602;
                        field1545[1] = arg0.field1588;
                        field1545[0] = arg0.field1597 - var23;
                        field1540[0] = 0.0F;
                        field1540[1] = 0.0F;
                        field1540[2] = 0.0F;
                        field1540[3] = 0.0F;
                        field1540[4] = 0.0F;
                        int var25 = class426.method3500(field1545, 3, 0.0F, true, 1.0F, true, field1540);
                        if (var25 == 1) {
                            var24 = field1540[0];
                        } else {
                            var24 = 0.0F;
                        }
                    }
                    var22 = ((arg0.field1579 * var24 + arg0.field1593) * var24 + arg0.field1592) * var24 + arg0.field1591;
                }
                return var22;
            } else {
                float var26;
                if (arg0 == null) {
                    var26 = 0.0F;
                } else {
                    float var27 = arg1 - arg0.field1585;
                    var26 = ((arg0.field1597 * var27 + arg0.field1588) * var27 + arg0.field1602) * var27 + arg0.field1590;
                }
                return var26;
            }
        }
    }

    @ObfuscatedName("lo.al(Lfm;FZI)F")
    public static float method5442(class134 arg0, float arg1, boolean arg2) {
        float var3 = 0.0F;
        if (arg0 == null || arg0.method2944() == 0) {
            return var3;
        }
        float var4 = (float) arg0.field1583[0].field1535;
        float var5 = (float) arg0.field1583[arg0.method2944() - 1].field1535;
        float var6 = var5 - var4;
        if ((double) var6 == 0.0D) {
            return arg0.field1583[0].field1532;
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
            if (class132.field1570 == arg0.field1601) {
                if ((double) var19 == 0.0D) {
                    var12 = var5 - var12;
                } else {
                    var12 += var4;
                }
            } else if (class132.field1574 == arg0.field1601 || class132.field1569 == arg0.field1601) {
                var12 = var5 - var12;
            } else if (class132.field1567 == arg0.field1601) {
                float var20 = var4 - arg1;
                float var21 = arg0.field1583[0].field1534;
                float var22 = arg0.field1583[0].field1533;
                float var23 = arg0.field1583[0].field1532;
                if ((double) var21 != 0.0D) {
                    var23 -= var20 * var22 / var21;
                }
                return var23;
            }
        } else if (class132.field1570 == arg0.field1582) {
            if ((double) var19 == 0.0D) {
                var12 += var4;
            } else {
                var12 = var5 - var12;
            }
        } else if (class132.field1574 == arg0.field1582 || class132.field1569 == arg0.field1582) {
            var12 += var4;
        } else if (class132.field1567 == arg0.field1582) {
            float var24 = arg1 - var5;
            float var25 = arg0.field1583[arg0.method2944() - 1].field1536;
            float var26 = arg0.field1583[arg0.method2944() - 1].field1537;
            float var27 = arg0.field1583[arg0.method2944() - 1].field1532;
            if ((double) var25 != 0.0D) {
                var27 += var24 * var26 / var25;
            }
            return var27;
        }
        float var28 = method5032(arg0, var12);
        if (arg2 && class132.field1569 == arg0.field1601) {
            float var29 = arg0.field1583[arg0.method2944() - 1].field1532 - arg0.field1583[0].field1532;
            var28 = (float) ((double) var28 - (double) var29 * var13);
        } else if (!arg2 && class132.field1569 == arg0.field1582) {
            float var30 = arg0.field1583[arg0.method2944() - 1].field1532 - arg0.field1583[0].field1532;
            var28 = (float) ((double) var30 * var13 + (double) var28);
        }
        return var28;
    }

    @ObfuscatedName("pe.aj(Lfm;FFFFFFFFI)V")
    public static void method6815(class134 arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8) {
        if (arg0 == null) {
            return;
        }
        float var9 = arg4 - arg1;
        if ((double) var9 == 0.0D) {
            return;
        }
        float var10 = arg2 - arg1;
        float var11 = arg3 - arg1;
        float[] var12 = new float[] { var10 / var9, var11 / var9 };
        arg0.field1584 = var12[0] == 0.33333334F && var12[1] == 0.6666667F;
        float var13 = var12[0];
        float var14 = var12[1];
        if ((double) var12[0] < 0.0D) {
            var12[0] = 0.0F;
        }
        if ((double) var12[1] > 1.0D) {
            var12[1] = 1.0F;
        }
        if ((double) var12[0] > 1.0D || var12[1] < -1.0F) {
            var12[1] = 1.0F - var12[1];
            if (var12[0] < 0.0F) {
                var12[0] = 0.0F;
            }
            if (var12[1] < 0.0F) {
                var12[1] = 0.0F;
            }
            if (var12[0] > 1.0F || var12[1] > 1.0F) {
                float var15 = (float) (((double) var12[1] - 2.0D) * (double) var12[1] + (double) ((var12[0] - 2.0F + var12[1]) * var12[0]) + 1.0D);
                if (field1542 + var15 > 0.0F) {
                    if (var12[0] + field1542 < 1.3333334F) {
                        float var16 = var12[0] - 2.0F;
                        float var17 = var12[0] - 1.0F;
                        float var18 = (float) Math.sqrt((double) (var16 * var16 - var17 * 4.0F * var17));
                        float var19 = (-var16 + var18) * 0.5F;
                        if (var12[1] + field1542 > var19) {
                            var12[1] = var19 - field1542;
                        } else {
                            float var20 = (-var16 - var18) * 0.5F;
                            if (var12[1] < field1542 + var20) {
                                var12[1] = field1542 + var20;
                            }
                        }
                    } else {
                        var12[0] = 1.3333334F - field1542;
                        var12[1] = 0.33333334F - field1542;
                    }
                }
            }
            var12[1] = 1.0F - var12[1];
        }
        if (var12[0] != var13) {
            float var21 = var12[0] * var9 + arg1;
            if ((double) var13 != 0.0D) {
                arg6 = (arg6 - arg5) * var12[0] / var13 + arg5;
            }
        }
        if (var12[1] != var14) {
            float var22 = var12[1] * var9 + arg1;
            if ((double) var14 != 1.0D) {
                arg7 = (float) ((double) arg8 - (1.0D - (double) var12[1]) * (double) (arg8 - arg7) / (1.0D - (double) var14));
            }
        }
        arg0.field1585 = arg1;
        arg0.field1586 = arg4;
        float var23 = var12[0];
        float var24 = var12[1];
        float var25 = var23 - 0.0F;
        float var26 = var24 - var23;
        float var27 = 1.0F - var24;
        float var28 = var26 - var25;
        arg0.field1590 = var27 - var26 - var28;
        arg0.field1602 = var28 + var28 + var28;
        arg0.field1588 = var25 + var25 + var25;
        arg0.field1597 = 0.0F;
        float var29 = arg6 - arg5;
        float var30 = arg7 - arg6;
        float var31 = arg8 - arg7;
        float var32 = var30 - var29;
        arg0.field1579 = var31 - var30 - var32;
        arg0.field1593 = var32 + var32 + var32;
        arg0.field1592 = var29 + var29 + var29;
        arg0.field1591 = arg5;
    }
}
