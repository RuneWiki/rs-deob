package deob;

@ObfuscatedName("ef")
public class class128 {

    @ObfuscatedName("ef.aj")
    public static final float field1488 = Math.ulp(1.0F);

    @ObfuscatedName("ef.aq")
    public static final float field1491 = field1488 * 2.0F;

    @ObfuscatedName("ef.ar")
    public static float[] field1492 = new float[4];

    @ObfuscatedName("ef.ag")
    public static float[] field1493 = new float[5];

    public class128() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fp.am(Lfx;FB)F")
    public static float method3188(class132 arg0, float arg1) {
        if (arg0 == null || arg0.method2961() == 0) {
            return 0.0F;
        } else if (arg1 < (float) arg0.field1546[0].field1484) {
            return class130.field1514 == arg0.field1540 ? arg0.field1546[0].field1481 : method2823(arg0, arg1, true);
        } else if (arg1 > (float) arg0.field1546[arg0.method2961() - 1].field1484) {
            return class130.field1514 == arg0.field1531 ? arg0.field1546[arg0.method2961() - 1].field1481 : method2823(arg0, arg1, false);
        } else if (arg0.field1528) {
            return arg0.field1546[0].field1481;
        } else {
            class127 var2 = arg0.method2964(arg1);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
                return 0.0F;
            }
            if ((double) var2.field1482 == 0.0D && (double) var2.field1485 == 0.0D) {
                var3 = true;
            } else if (var2.field1482 == Float.MAX_VALUE && var2.field1485 == Float.MAX_VALUE) {
                var4 = true;
            } else if (var2.field1486 == null) {
                var3 = true;
            } else if (arg0.field1544) {
                float var5 = (float) var2.field1484;
                float var6 = var2.field1481;
                float var7 = var2.field1482 * 0.33333334F + var5;
                float var8 = var2.field1485 * 0.33333334F + var6;
                float var9 = (float) var2.field1486.field1484;
                float var10 = var2.field1486.field1481;
                float var11 = var9 - var2.field1486.field1483 * 0.33333334F;
                float var12 = var10 - var2.field1486.field1480 * 0.33333334F;
                if (arg0.field1542) {
                    float var15 = var8;
                    float var16 = var12;
                    if (arg0 != null) {
                        float var17 = var9 - var5;
                        if ((double) var17 != 0.0D) {
                            float var18 = var7 - var5;
                            float var19 = var11 - var5;
                            float[] var20 = new float[] { var18 / var17, var19 / var17 };
                            arg0.field1533 = var20[0] == 0.33333334F && var20[1] == 0.6666667F;
                            float var21 = var20[0];
                            float var22 = var20[1];
                            if ((double) var20[0] < 0.0D) {
                                var20[0] = 0.0F;
                            }
                            if ((double) var20[1] > 1.0D) {
                                var20[1] = 1.0F;
                            }
                            if ((double) var20[0] > 1.0D || var20[1] < -1.0F) {
                                method2631(var20);
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
                            arg0.field1534 = var5;
                            arg0.field1535 = var9;
                            float var25 = var20[0];
                            float var26 = var20[1];
                            float var27 = var25 - 0.0F;
                            float var28 = var26 - var25;
                            float var29 = 1.0F - var26;
                            float var30 = var28 - var27;
                            arg0.field1539 = var29 - var28 - var30;
                            arg0.field1547 = var30 + var30 + var30;
                            arg0.field1541 = var27 + var27 + var27;
                            arg0.field1536 = 0.0F;
                            method1783(var6, var15, var16, var10, arg0);
                        }
                    }
                } else if (arg0 != null) {
                    arg0.field1534 = var5;
                    float var31 = var9 - var5;
                    float var32 = var10 - var6;
                    float var33 = var7 - var5;
                    float var34 = 0.0F;
                    float var35 = 0.0F;
                    if ((double) var33 != 0.0D) {
                        var34 = (var8 - var6) / var33;
                    }
                    float var36 = var9 - var11;
                    if ((double) var36 != 0.0D) {
                        var35 = (var10 - var12) / var36;
                    }
                    float var37 = 1.0F / (var31 * var31);
                    float var38 = var31 * var34;
                    float var39 = var31 * var35;
                    arg0.field1536 = (var38 + var39 - var32 - var32) * var37 / var31;
                    arg0.field1541 = (var32 + var32 + var32 - var38 - var38 - var39) * var37;
                    arg0.field1547 = var34;
                    arg0.field1539 = var6;
                }
                arg0.field1544 = false;
            }
            if (var3) {
                return var2.field1481;
            } else if (var4) {
                return (float) var2.field1484 == arg1 || var2.field1486 == null ? var2.field1481 : var2.field1486.field1481;
            } else if (arg0.field1542) {
                float var40;
                if (arg0 == null) {
                    var40 = 0.0F;
                } else {
                    float var41;
                    if (arg0.field1534 == arg1) {
                        var41 = 0.0F;
                    } else if (arg0.field1535 == arg1) {
                        var41 = 1.0F;
                    } else {
                        var41 = (arg1 - arg0.field1534) / (arg0.field1535 - arg0.field1534);
                    }
                    float var42;
                    if (arg0.field1533) {
                        var42 = var41;
                    } else {
                        field1492[3] = arg0.field1539;
                        field1492[2] = arg0.field1547;
                        field1492[1] = arg0.field1541;
                        field1492[0] = arg0.field1536 - var41;
                        field1493[0] = 0.0F;
                        field1493[1] = 0.0F;
                        field1493[2] = 0.0F;
                        field1493[3] = 0.0F;
                        field1493[4] = 0.0F;
                        int var43 = class469.method7372(field1492, 3, 0.0F, true, 1.0F, true, field1493);
                        if (var43 == 1) {
                            var42 = field1493[0];
                        } else {
                            var42 = 0.0F;
                        }
                    }
                    var40 = ((arg0.field1543 * var42 + arg0.field1530) * var42 + arg0.field1532) * var42 + arg0.field1538;
                }
                return var40;
            } else {
                float var44;
                if (arg0 == null) {
                    var44 = 0.0F;
                } else {
                    float var45 = arg1 - arg0.field1534;
                    var44 = ((arg0.field1536 * var45 + arg0.field1541) * var45 + arg0.field1547) * var45 + arg0.field1539;
                }
                return var44;
            }
        }
    }

    @ObfuscatedName("ej.ap(Lfx;FZB)F")
    public static float method2823(class132 arg0, float arg1, boolean arg2) {
        float var3 = 0.0F;
        if (arg0 == null || arg0.method2961() == 0) {
            return var3;
        }
        float var4 = (float) arg0.field1546[0].field1484;
        float var5 = (float) arg0.field1546[arg0.method2961() - 1].field1484;
        float var6 = var5 - var4;
        if ((double) var6 == 0.0D) {
            return arg0.field1546[0].field1481;
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
            if (class130.field1515 == arg0.field1540) {
                if ((double) var19 == 0.0D) {
                    var12 = var5 - var12;
                } else {
                    var12 += var4;
                }
            } else if (class130.field1513 == arg0.field1540 || class130.field1516 == arg0.field1540) {
                var12 = var5 - var12;
            } else if (class130.field1511 == arg0.field1540) {
                float var20 = var4 - arg1;
                float var21 = arg0.field1546[0].field1483;
                float var22 = arg0.field1546[0].field1480;
                float var23 = arg0.field1546[0].field1481;
                if ((double) var21 != 0.0D) {
                    var23 -= var20 * var22 / var21;
                }
                return var23;
            }
        } else if (class130.field1515 == arg0.field1531) {
            if ((double) var19 == 0.0D) {
                var12 += var4;
            } else {
                var12 = var5 - var12;
            }
        } else if (class130.field1513 == arg0.field1531 || class130.field1516 == arg0.field1531) {
            var12 += var4;
        } else if (class130.field1511 == arg0.field1531) {
            float var24 = arg1 - var5;
            float var25 = arg0.field1546[arg0.method2961() - 1].field1482;
            float var26 = arg0.field1546[arg0.method2961() - 1].field1485;
            float var27 = arg0.field1546[arg0.method2961() - 1].field1481;
            if ((double) var25 != 0.0D) {
                var27 += var24 * var26 / var25;
            }
            return var27;
        }
        float var28 = method3188(arg0, var12);
        if (arg2 && class130.field1516 == arg0.field1540) {
            float var29 = arg0.field1546[arg0.method2961() - 1].field1481 - arg0.field1546[0].field1481;
            var28 = (float) ((double) var28 - (double) var29 * var13);
        } else if (!arg2 && class130.field1516 == arg0.field1531) {
            float var30 = arg0.field1546[arg0.method2961() - 1].field1481 - arg0.field1546[0].field1481;
            var28 = (float) ((double) var30 * var13 + (double) var28);
        }
        return var28;
    }

    @ObfuscatedName("fr.af([FS)V")
    public static void method3013(float[] arg0) {
        if (arg0[0] + field1488 >= 1.3333334F) {
            arg0[0] = 1.3333334F - field1488;
            arg0[1] = 0.33333334F - field1488;
            return;
        }
        float var1 = arg0[0] - 2.0F;
        float var2 = arg0[0] - 1.0F;
        float var3 = (float) Math.sqrt((double) (var1 * var1 - var2 * 4.0F * var2));
        float var4 = (-var1 + var3) * 0.5F;
        if (arg0[1] + field1488 > var4) {
            arg0[1] = var4 - field1488;
        } else {
            float var5 = (-var1 - var3) * 0.5F;
            if (arg0[1] < field1488 + var5) {
                arg0[1] = field1488 + var5;
            }
        }
    }

    @ObfuscatedName("dl.aj([FB)V")
    public static void method2631(float[] arg0) {
        arg0[1] = 1.0F - arg0[1];
        if (arg0[0] < 0.0F) {
            arg0[0] = 0.0F;
        }
        if (arg0[1] < 0.0F) {
            arg0[1] = 0.0F;
        }
        if (arg0[0] > 1.0F || arg0[1] > 1.0F) {
            float var1 = (float) (((double) arg0[1] - 2.0D) * (double) arg0[1] + (double) ((arg0[0] - 2.0F + arg0[1]) * arg0[0]) + 1.0D);
            if (field1488 + var1 > 0.0F) {
                method3013(arg0);
            }
        }
        arg0[1] = 1.0F - arg0[1];
    }

    @ObfuscatedName("ch.aq(FFFFLfx;I)V")
    public static void method1783(float arg0, float arg1, float arg2, float arg3, class132 arg4) {
        float var5 = arg1 - arg0;
        float var6 = arg2 - arg1;
        float var7 = arg3 - arg2;
        float var8 = var6 - var5;
        arg4.field1543 = var7 - var6 - var8;
        arg4.field1530 = var8 + var8 + var8;
        arg4.field1532 = var5 + var5 + var5;
        arg4.field1538 = arg0;
    }
}
