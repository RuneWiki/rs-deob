package deob;

@ObfuscatedName("ee")
public class class128 {

    @ObfuscatedName("ee.ao")
    public static final float field1485 = Math.ulp(1.0F);

    @ObfuscatedName("ee.ab")
    public static final float field1486 = field1485 * 2.0F;

    @ObfuscatedName("ee.au")
    public static float[] field1488 = new float[4];

    @ObfuscatedName("ee.aa")
    public static float[] field1490 = new float[5];

    public class128() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ps.at(Lfm;FB)F")
    public static float method6828(class132 arg0, float arg1) {
        if (arg0 == null || arg0.method2951() == 0) {
            return 0.0F;
        } else if (arg1 < (float) arg0.field1531[0].field1478) {
            return class130.field1514 == arg0.field1536 ? arg0.field1531[0].field1479 : method1071(arg0, arg1, true);
        } else if (arg1 > (float) arg0.field1531[arg0.method2951() - 1].field1478) {
            return class130.field1514 == arg0.field1530 ? arg0.field1531[arg0.method2951() - 1].field1479 : method1071(arg0, arg1, false);
        } else if (arg0.field1528) {
            return arg0.field1531[0].field1479;
        } else {
            class127 var2 = arg0.method2950(arg1);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
                return 0.0F;
            }
            if ((double) var2.field1482 == 0.0D && (double) var2.field1483 == 0.0D) {
                var3 = true;
            } else if (var2.field1482 == Float.MAX_VALUE && var2.field1483 == Float.MAX_VALUE) {
                var4 = true;
            } else if (var2.field1480 == null) {
                var3 = true;
            } else if (arg0.field1543) {
                float var5 = (float) var2.field1478;
                float var6 = var2.field1479;
                float var7 = var2.field1482 * 0.33333334F + var5;
                float var8 = var2.field1483 * 0.33333334F + var6;
                float var9 = (float) var2.field1480.field1478;
                float var10 = var2.field1480.field1479;
                float var11 = var9 - var2.field1480.field1481 * 0.33333334F;
                float var12 = var10 - var2.field1480.field1484 * 0.33333334F;
                if (arg0.field1533) {
                    method6518(arg0, var5, var7, var11, var9, var6, var8, var12, var10);
                } else if (arg0 != null) {
                    arg0.field1539 = var5;
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
                    arg0.field1535 = (var20 + var21 - var14 - var14) * var19 / var13;
                    arg0.field1549 = (var14 + var14 + var14 - var20 - var20 - var21) * var19;
                    arg0.field1527 = var16;
                    arg0.field1538 = var6;
                }
                arg0.field1543 = false;
            }
            if (var3) {
                return var2.field1479;
            } else if (var4) {
                return (float) var2.field1478 == arg1 || var2.field1480 == null ? var2.field1479 : var2.field1480.field1479;
            } else if (arg0.field1533) {
                float var22;
                if (arg0 == null) {
                    var22 = 0.0F;
                } else {
                    float var23;
                    if (arg0.field1539 == arg1) {
                        var23 = 0.0F;
                    } else if (arg0.field1534 == arg1) {
                        var23 = 1.0F;
                    } else {
                        var23 = (arg1 - arg0.field1539) / (arg0.field1534 - arg0.field1539);
                    }
                    float var24;
                    if (arg0.field1532) {
                        var24 = var23;
                    } else {
                        field1488[3] = arg0.field1538;
                        field1488[2] = arg0.field1527;
                        field1488[1] = arg0.field1549;
                        field1488[0] = arg0.field1535 - var23;
                        field1490[0] = 0.0F;
                        field1490[1] = 0.0F;
                        field1490[2] = 0.0F;
                        field1490[3] = 0.0F;
                        field1490[4] = 0.0F;
                        int var25 = class465.method3476(field1488, 3, 0.0F, true, 1.0F, true, field1490);
                        if (var25 == 1) {
                            var24 = field1490[0];
                        } else {
                            var24 = 0.0F;
                        }
                    }
                    var22 = ((arg0.field1529 * var24 + arg0.field1541) * var24 + arg0.field1540) * var24 + arg0.field1547;
                }
                return var22;
            } else {
                float var26;
                if (arg0 == null) {
                    var26 = 0.0F;
                } else {
                    float var27 = arg1 - arg0.field1539;
                    var26 = ((arg0.field1535 * var27 + arg0.field1549) * var27 + arg0.field1527) * var27 + arg0.field1538;
                }
                return var26;
            }
        }
    }

    @ObfuscatedName("ce.ah(Lfm;FZI)F")
    public static float method1071(class132 arg0, float arg1, boolean arg2) {
        float var3 = 0.0F;
        if (arg0 == null || arg0.method2951() == 0) {
            return var3;
        }
        float var4 = (float) arg0.field1531[0].field1478;
        float var5 = (float) arg0.field1531[arg0.method2951() - 1].field1478;
        float var6 = var5 - var4;
        if ((double) var6 == 0.0D) {
            return arg0.field1531[0].field1479;
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
            if (class130.field1511 == arg0.field1536) {
                if ((double) var19 == 0.0D) {
                    var12 = var5 - var12;
                } else {
                    var12 += var4;
                }
            } else if (class130.field1513 == arg0.field1536 || class130.field1519 == arg0.field1536) {
                var12 = var5 - var12;
            } else if (class130.field1515 == arg0.field1536) {
                float var20 = var4 - arg1;
                float var21 = arg0.field1531[0].field1481;
                float var22 = arg0.field1531[0].field1484;
                float var23 = arg0.field1531[0].field1479;
                if ((double) var21 != 0.0D) {
                    var23 -= var20 * var22 / var21;
                }
                return var23;
            }
        } else if (class130.field1511 == arg0.field1530) {
            if ((double) var19 == 0.0D) {
                var12 += var4;
            } else {
                var12 = var5 - var12;
            }
        } else if (class130.field1513 == arg0.field1530 || class130.field1519 == arg0.field1530) {
            var12 += var4;
        } else if (class130.field1515 == arg0.field1530) {
            float var24 = arg1 - var5;
            float var25 = arg0.field1531[arg0.method2951() - 1].field1482;
            float var26 = arg0.field1531[arg0.method2951() - 1].field1483;
            float var27 = arg0.field1531[arg0.method2951() - 1].field1479;
            if ((double) var25 != 0.0D) {
                var27 += var24 * var26 / var25;
            }
            return var27;
        }
        float var28 = method6828(arg0, var12);
        if (arg2 && class130.field1519 == arg0.field1536) {
            float var29 = arg0.field1531[arg0.method2951() - 1].field1479 - arg0.field1531[0].field1479;
            var28 = (float) ((double) var28 - (double) var29 * var13);
        } else if (!arg2 && class130.field1519 == arg0.field1530) {
            float var30 = arg0.field1531[arg0.method2951() - 1].field1479 - arg0.field1531[0].field1479;
            var28 = (float) ((double) var30 * var13 + (double) var28);
        }
        return var28;
    }

    @ObfuscatedName("of.ar(Lfm;FFFFFFFFB)V")
    public static void method6518(class132 arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8) {
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
        arg0.field1532 = var12[0] == 0.33333334F && var12[1] == 0.6666667F;
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
                if (field1485 + var15 > 0.0F) {
                    if (var12[0] + field1485 < 1.3333334F) {
                        float var16 = var12[0] - 2.0F;
                        float var17 = var12[0] - 1.0F;
                        float var18 = (float) Math.sqrt((double) (var16 * var16 - var17 * 4.0F * var17));
                        float var19 = (-var16 + var18) * 0.5F;
                        if (var12[1] + field1485 > var19) {
                            var12[1] = var19 - field1485;
                        } else {
                            float var20 = (-var16 - var18) * 0.5F;
                            if (var12[1] < field1485 + var20) {
                                var12[1] = field1485 + var20;
                            }
                        }
                    } else {
                        var12[0] = 1.3333334F - field1485;
                        var12[1] = 0.33333334F - field1485;
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
        arg0.field1539 = arg1;
        arg0.field1534 = arg4;
        method3053(0.0F, var12[0], var12[1], 1.0F, arg0);
        method328(arg5, arg6, arg7, arg8, arg0);
    }

    @ObfuscatedName("fs.ao(FFFFLfm;B)V")
    public static void method3053(float arg0, float arg1, float arg2, float arg3, class132 arg4) {
        float var5 = arg1 - arg0;
        float var6 = arg2 - arg1;
        float var7 = arg3 - arg2;
        float var8 = var6 - var5;
        arg4.field1538 = var7 - var6 - var8;
        arg4.field1527 = var8 + var8 + var8;
        arg4.field1549 = var5 + var5 + var5;
        arg4.field1535 = arg0;
    }

    @ObfuscatedName("ag.ab(FFFFLfm;I)V")
    public static void method328(float arg0, float arg1, float arg2, float arg3, class132 arg4) {
        float var5 = arg1 - arg0;
        float var6 = arg2 - arg1;
        float var7 = arg3 - arg2;
        float var8 = var6 - var5;
        arg4.field1529 = var7 - var6 - var8;
        arg4.field1541 = var8 + var8 + var8;
        arg4.field1540 = var5 + var5 + var5;
        arg4.field1547 = arg0;
    }
}
