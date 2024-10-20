package deob;

@ObfuscatedName("ev")
public class class126 {

    @ObfuscatedName("ev.as")
    public static final float field1464 = Math.ulp(1.0F);

    @ObfuscatedName("ev.ax")
    public static final float field1468 = field1464 * 2.0F;

    @ObfuscatedName("ev.ap")
    public static float[] field1466 = new float[4];

    @ObfuscatedName("ev.ab")
    public static float[] field1463 = new float[5];

    public class126() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fg.at(Leq;FB)F")
    public static float method2852(class130 arg0, float arg1) {
        if (arg0 == null || arg0.method2831() == 0) {
            return 0.0F;
        } else if (arg1 < (float) arg0.field1511[0].field1458) {
            return class128.field1495 == arg0.field1507 ? arg0.field1511[0].field1456 : method1961(arg0, arg1, true);
        } else if (arg1 > (float) arg0.field1511[arg0.method2831() - 1].field1458) {
            return class128.field1495 == arg0.field1508 ? arg0.field1511[arg0.method2831() - 1].field1456 : method1961(arg0, arg1, false);
        } else if (arg0.field1506) {
            return arg0.field1511[0].field1456;
        } else {
            class125 var2 = arg0.method2830(arg1);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
                return 0.0F;
            }
            if ((double) var2.field1459 == 0.0D && (double) var2.field1460 == 0.0D) {
                var3 = true;
            } else if (var2.field1459 == Float.MAX_VALUE && var2.field1460 == Float.MAX_VALUE) {
                var4 = true;
            } else if (var2.field1461 == null) {
                var3 = true;
            } else if (arg0.field1521) {
                float var5 = (float) var2.field1458;
                float var6 = var2.field1456;
                float var7 = var2.field1459 * 0.33333334F + var5;
                float var8 = var2.field1460 * 0.33333334F + var6;
                float var9 = (float) var2.field1461.field1458;
                float var10 = var2.field1461.field1456;
                float var11 = var9 - var2.field1461.field1457 * 0.33333334F;
                float var12 = var10 - var2.field1461.field1462 * 0.33333334F;
                if (arg0.field1517) {
                    float var15 = var8;
                    float var16 = var12;
                    if (arg0 != null) {
                        float var17 = var9 - var5;
                        if ((double) var17 != 0.0D) {
                            float var18 = var7 - var5;
                            float var19 = var11 - var5;
                            float[] var20 = new float[] { var18 / var17, var19 / var17 };
                            arg0.field1509 = var20[0] == 0.33333334F && var20[1] == 0.6666667F;
                            float var21 = var20[0];
                            float var22 = var20[1];
                            if ((double) var20[0] < 0.0D) {
                                var20[0] = 0.0F;
                            }
                            if ((double) var20[1] > 1.0D) {
                                var20[1] = 1.0F;
                            }
                            if ((double) var20[0] > 1.0D || var20[1] < -1.0F) {
                                method791(var20);
                            }
                            if (var20[0] != var21) {
                                float var23 = var20[0] * var17 + var5;
                                if ((double) var21 != 0.0D) {
                                    var15 = (var8 - var6) * var20[0] / var21 + var6;
                                }
                            }
                            if (var20[1] != var22) {
                                float var24 = var20[1] * var17 + var5;
                                if ((double) var22 != 1.0D) {
                                    var16 = (float) ((double) var10 - (1.0D - (double) var20[1]) * (double) (var10 - var12) / (1.0D - (double) var22));
                                }
                            }
                            arg0.field1520 = var5;
                            arg0.field1512 = var9;
                            float var25 = var20[0];
                            float var26 = var20[1];
                            float var27 = var25 - 0.0F;
                            float var28 = var26 - var25;
                            float var29 = 1.0F - var26;
                            float var30 = var28 - var27;
                            arg0.field1516 = var29 - var28 - var30;
                            arg0.field1515 = var30 + var30 + var30;
                            arg0.field1505 = var27 + var27 + var27;
                            arg0.field1523 = 0.0F;
                            float var31 = var15 - var6;
                            float var32 = var16 - var15;
                            float var33 = var10 - var16;
                            float var34 = var32 - var31;
                            arg0.field1528 = var33 - var32 - var34;
                            arg0.field1519 = var34 + var34 + var34;
                            arg0.field1513 = var31 + var31 + var31;
                            arg0.field1510 = var6;
                        }
                    }
                } else {
                    method6269(arg0, var5, var7, var11, var9, var6, var8, var12, var10);
                }
                arg0.field1521 = false;
            }
            if (var3) {
                return var2.field1456;
            } else if (var4) {
                return (float) var2.field1458 == arg1 || var2.field1461 == null ? var2.field1456 : var2.field1461.field1456;
            } else if (arg0.field1517) {
                float var35;
                if (arg0 == null) {
                    var35 = 0.0F;
                } else {
                    float var36;
                    if (arg0.field1520 == arg1) {
                        var36 = 0.0F;
                    } else if (arg0.field1512 == arg1) {
                        var36 = 1.0F;
                    } else {
                        var36 = (arg1 - arg0.field1520) / (arg0.field1512 - arg0.field1520);
                    }
                    float var37;
                    if (arg0.field1509) {
                        var37 = var36;
                    } else {
                        field1466[3] = arg0.field1516;
                        field1466[2] = arg0.field1515;
                        field1466[1] = arg0.field1505;
                        field1466[0] = arg0.field1523 - var36;
                        field1463[0] = 0.0F;
                        field1463[1] = 0.0F;
                        field1463[2] = 0.0F;
                        field1463[3] = 0.0F;
                        field1463[4] = 0.0F;
                        int var38 = class441.method1955(field1466, 3, 0.0F, true, 1.0F, true, field1463);
                        if (var38 == 1) {
                            var37 = field1463[0];
                        } else {
                            var37 = 0.0F;
                        }
                    }
                    var35 = ((arg0.field1528 * var37 + arg0.field1519) * var37 + arg0.field1513) * var37 + arg0.field1510;
                }
                return var35;
            } else {
                float var39;
                if (arg0 == null) {
                    var39 = 0.0F;
                } else {
                    float var40 = arg1 - arg0.field1520;
                    var39 = ((arg0.field1523 * var40 + arg0.field1505) * var40 + arg0.field1515) * var40 + arg0.field1516;
                }
                return var39;
            }
        }
    }

    @ObfuscatedName("cl.an(Leq;FZB)F")
    public static float method1961(class130 arg0, float arg1, boolean arg2) {
        float var3 = 0.0F;
        if (arg0 == null || arg0.method2831() == 0) {
            return var3;
        }
        float var4 = (float) arg0.field1511[0].field1458;
        float var5 = (float) arg0.field1511[arg0.method2831() - 1].field1458;
        float var6 = var5 - var4;
        if ((double) var6 == 0.0D) {
            return arg0.field1511[0].field1456;
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
            if (class128.field1492 == arg0.field1507) {
                if ((double) var19 == 0.0D) {
                    var12 = var5 - var12;
                } else {
                    var12 += var4;
                }
            } else if (class128.field1488 == arg0.field1507 || class128.field1489 == arg0.field1507) {
                var12 = var5 - var12;
            } else if (class128.field1487 == arg0.field1507) {
                float var20 = var4 - arg1;
                float var21 = arg0.field1511[0].field1457;
                float var22 = arg0.field1511[0].field1462;
                float var23 = arg0.field1511[0].field1456;
                if ((double) var21 != 0.0D) {
                    var23 -= var20 * var22 / var21;
                }
                return var23;
            }
        } else if (class128.field1492 == arg0.field1508) {
            if ((double) var19 == 0.0D) {
                var12 += var4;
            } else {
                var12 = var5 - var12;
            }
        } else if (class128.field1488 == arg0.field1508 || class128.field1489 == arg0.field1508) {
            var12 += var4;
        } else if (class128.field1487 == arg0.field1508) {
            float var24 = arg1 - var5;
            float var25 = arg0.field1511[arg0.method2831() - 1].field1459;
            float var26 = arg0.field1511[arg0.method2831() - 1].field1460;
            float var27 = arg0.field1511[arg0.method2831() - 1].field1456;
            if ((double) var25 != 0.0D) {
                var27 += var24 * var26 / var25;
            }
            return var27;
        }
        float var28 = method2852(arg0, var12);
        if (arg2 && class128.field1489 == arg0.field1507) {
            float var29 = arg0.field1511[arg0.method2831() - 1].field1456 - arg0.field1511[0].field1456;
            var28 = (float) ((double) var28 - (double) var29 * var13);
        } else if (!arg2 && class128.field1489 == arg0.field1508) {
            float var30 = arg0.field1511[arg0.method2831() - 1].field1456 - arg0.field1511[0].field1456;
            var28 = (float) ((double) var30 * var13 + (double) var28);
        }
        return var28;
    }

    @ObfuscatedName("ot.av(Leq;FFFFFFFFI)V")
    public static void method6269(class130 arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8) {
        if (arg0 == null) {
            return;
        }
        arg0.field1520 = arg1;
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
        arg0.field1523 = (var16 + var17 - var10 - var10) * var15 / var9;
        arg0.field1505 = (var10 + var10 + var10 - var16 - var16 - var17) * var15;
        arg0.field1515 = var12;
        arg0.field1516 = arg5;
    }

    @ObfuscatedName("cc.as([FI)V")
    public static void method1664(float[] arg0) {
        if (arg0[0] + field1464 >= 1.3333334F) {
            arg0[0] = 1.3333334F - field1464;
            arg0[1] = 0.33333334F - field1464;
            return;
        }
        float var1 = arg0[0] - 2.0F;
        float var2 = arg0[0] - 1.0F;
        float var3 = (float) Math.sqrt((double) (var1 * var1 - var2 * 4.0F * var2));
        float var4 = (-var1 + var3) * 0.5F;
        if (arg0[1] + field1464 > var4) {
            arg0[1] = var4 - field1464;
        } else {
            float var5 = (-var1 - var3) * 0.5F;
            if (arg0[1] < field1464 + var5) {
                arg0[1] = field1464 + var5;
            }
        }
    }

    @ObfuscatedName("bv.ax([FI)V")
    public static void method791(float[] arg0) {
        arg0[1] = 1.0F - arg0[1];
        if (arg0[0] < 0.0F) {
            arg0[0] = 0.0F;
        }
        if (arg0[1] < 0.0F) {
            arg0[1] = 0.0F;
        }
        if (arg0[0] > 1.0F || arg0[1] > 1.0F) {
            float var1 = (float) (((double) arg0[1] - 2.0D) * (double) arg0[1] + (double) ((arg0[0] - 2.0F + arg0[1]) * arg0[0]) + 1.0D);
            if (field1464 + var1 > 0.0F) {
                method1664(arg0);
            }
        }
        arg0[1] = 1.0F - arg0[1];
    }
}
