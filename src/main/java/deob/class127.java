package deob;

@ObfuscatedName("ez")
public class class127 {

    @ObfuscatedName("ez.am")
    public static final float field1495 = Math.ulp(1.0F);

    @ObfuscatedName("ez.as")
    public static final float field1497 = field1495 * 2.0F;

    @ObfuscatedName("ez.aj")
    public static float[] field1493 = new float[4];

    @ObfuscatedName("ez.ag")
    public static float[] field1498 = new float[5];

    public class127() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("co.aw(Lfm;FI)F")
    public static float method1175(class131 arg0, float arg1) {
        if (arg0 == null || arg0.method2864() == 0) {
            return 0.0F;
        } else if (arg1 < (float) arg0.field1537[0].field1484) {
            return class129.field1525 == arg0.field1535 ? arg0.field1537[0].field1489 : method6351(arg0, arg1, true);
        } else if (arg1 > (float) arg0.field1537[arg0.method2864() - 1].field1484) {
            return class129.field1525 == arg0.field1548 ? arg0.field1537[arg0.method2864() - 1].field1489 : method6351(arg0, arg1, false);
        } else if (arg0.field1534) {
            return arg0.field1537[0].field1489;
        } else {
            class126 var2 = arg0.method2863(arg1);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
                return 0.0F;
            }
            if ((double) var2.field1487 == 0.0D && (double) var2.field1488 == 0.0D) {
                var3 = true;
            } else if (var2.field1487 == Float.MAX_VALUE && var2.field1488 == Float.MAX_VALUE) {
                var4 = true;
            } else if (var2.field1486 == null) {
                var3 = true;
            } else if (arg0.field1549) {
                float var5 = (float) var2.field1484;
                float var6 = var2.field1489;
                float var7 = var2.field1487 * 0.33333334F + var5;
                float var8 = var2.field1488 * 0.33333334F + var6;
                float var9 = (float) var2.field1486.field1484;
                float var10 = var2.field1486.field1489;
                float var11 = var9 - var2.field1486.field1485 * 0.33333334F;
                float var12 = var10 - var2.field1486.field1483 * 0.33333334F;
                if (arg0.field1533) {
                    float var15 = var8;
                    float var16 = var12;
                    if (arg0 != null) {
                        float var17 = var9 - var5;
                        if ((double) var17 != 0.0D) {
                            float var18 = var7 - var5;
                            float var19 = var11 - var5;
                            float[] var20 = new float[] { var18 / var17, var19 / var17 };
                            arg0.field1544 = var20[0] == 0.33333334F && var20[1] == 0.6666667F;
                            float var21 = var20[0];
                            float var22 = var20[1];
                            if ((double) var20[0] < 0.0D) {
                                var20[0] = 0.0F;
                            }
                            if ((double) var20[1] > 1.0D) {
                                var20[1] = 1.0F;
                            }
                            if ((double) var20[0] > 1.0D || var20[1] < -1.0F) {
                                method2756(var20);
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
                            arg0.field1539 = var5;
                            arg0.field1536 = var9;
                            method3512(0.0F, var20[0], var20[1], 1.0F, arg0);
                            float var25 = var15 - var6;
                            float var26 = var16 - var15;
                            float var27 = var10 - var16;
                            float var28 = var26 - var25;
                            arg0.field1538 = var27 - var26 - var28;
                            arg0.field1547 = var28 + var28 + var28;
                            arg0.field1554 = var25 + var25 + var25;
                            arg0.field1545 = var6;
                        }
                    }
                } else if (arg0 != null) {
                    arg0.field1539 = var5;
                    float var29 = var9 - var5;
                    float var30 = var10 - var6;
                    float var31 = var7 - var5;
                    float var32 = 0.0F;
                    float var33 = 0.0F;
                    if ((double) var31 != 0.0D) {
                        var32 = (var8 - var6) / var31;
                    }
                    float var34 = var9 - var11;
                    if ((double) var34 != 0.0D) {
                        var33 = (var10 - var12) / var34;
                    }
                    float var35 = 1.0F / (var29 * var29);
                    float var36 = var29 * var32;
                    float var37 = var29 * var33;
                    arg0.field1541 = (var36 + var37 - var30 - var30) * var35 / var29;
                    arg0.field1542 = (var30 + var30 + var30 - var36 - var36 - var37) * var35;
                    arg0.field1543 = var32;
                    arg0.field1551 = var6;
                }
                arg0.field1549 = false;
            }
            if (var3) {
                return var2.field1489;
            } else if (var4) {
                return (float) var2.field1484 == arg1 || var2.field1486 == null ? var2.field1489 : var2.field1486.field1489;
            } else if (arg0.field1533) {
                return method3373(arg0, arg1);
            } else {
                return Statics.method3117(arg0, arg1);
            }
        }
    }

    @ObfuscatedName("hs.ay(Lfm;FI)F")
    public static float method3373(class131 arg0, float arg1) {
        if (arg0 == null) {
            return 0.0F;
        }
        float var2;
        if (arg0.field1539 == arg1) {
            var2 = 0.0F;
        } else if (arg0.field1536 == arg1) {
            var2 = 1.0F;
        } else {
            var2 = (arg1 - arg0.field1539) / (arg0.field1536 - arg0.field1539);
        }
        float var3;
        if (arg0.field1544) {
            var3 = var2;
        } else {
            field1493[3] = arg0.field1551;
            field1493[2] = arg0.field1543;
            field1493[1] = arg0.field1542;
            field1493[0] = arg0.field1541 - var2;
            field1498[0] = 0.0F;
            field1498[1] = 0.0F;
            field1498[2] = 0.0F;
            field1498[3] = 0.0F;
            field1498[4] = 0.0F;
            int var4 = class454.method8167(field1493, 3, 0.0F, true, 1.0F, true, field1498);
            if (var4 == 1) {
                var3 = field1498[0];
            } else {
                var3 = 0.0F;
            }
        }
        return ((arg0.field1538 * var3 + arg0.field1547) * var3 + arg0.field1554) * var3 + arg0.field1545;
    }

    @ObfuscatedName("ot.am(Lfm;FZB)F")
    public static float method6351(class131 arg0, float arg1, boolean arg2) {
        float var3 = 0.0F;
        if (arg0 == null || arg0.method2864() == 0) {
            return var3;
        }
        float var4 = (float) arg0.field1537[0].field1484;
        float var5 = (float) arg0.field1537[arg0.method2864() - 1].field1484;
        float var6 = var5 - var4;
        if ((double) var6 == 0.0D) {
            return arg0.field1537[0].field1489;
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
            if (class129.field1522 == arg0.field1535) {
                if ((double) var19 == 0.0D) {
                    var12 = var5 - var12;
                } else {
                    var12 += var4;
                }
            } else if (class129.field1518 == arg0.field1535 || class129.field1519 == arg0.field1535) {
                var12 = var5 - var12;
            } else if (class129.field1517 == arg0.field1535) {
                float var20 = var4 - arg1;
                float var21 = arg0.field1537[0].field1485;
                float var22 = arg0.field1537[0].field1483;
                float var23 = arg0.field1537[0].field1489;
                if ((double) var21 != 0.0D) {
                    var23 -= var20 * var22 / var21;
                }
                return var23;
            }
        } else if (class129.field1522 == arg0.field1548) {
            if ((double) var19 == 0.0D) {
                var12 += var4;
            } else {
                var12 = var5 - var12;
            }
        } else if (class129.field1518 == arg0.field1548 || class129.field1519 == arg0.field1548) {
            var12 += var4;
        } else if (class129.field1517 == arg0.field1548) {
            float var24 = arg1 - var5;
            float var25 = arg0.field1537[arg0.method2864() - 1].field1487;
            float var26 = arg0.field1537[arg0.method2864() - 1].field1488;
            float var27 = arg0.field1537[arg0.method2864() - 1].field1489;
            if ((double) var25 != 0.0D) {
                var27 += var24 * var26 / var25;
            }
            return var27;
        }
        float var28 = method1175(arg0, var12);
        if (arg2 && class129.field1519 == arg0.field1535) {
            float var29 = arg0.field1537[arg0.method2864() - 1].field1489 - arg0.field1537[0].field1489;
            var28 = (float) ((double) var28 - (double) var29 * var13);
        } else if (!arg2 && class129.field1519 == arg0.field1548) {
            float var30 = arg0.field1537[arg0.method2864() - 1].field1489 - arg0.field1537[0].field1489;
            var28 = (float) ((double) var30 * var13 + (double) var28);
        }
        return var28;
    }

    @ObfuscatedName("dy.as([FI)V")
    public static void method2153(float[] arg0) {
        if (arg0[0] + field1495 >= 1.3333334F) {
            arg0[0] = 1.3333334F - field1495;
            arg0[1] = 0.33333334F - field1495;
            return;
        }
        float var1 = arg0[0] - 2.0F;
        float var2 = arg0[0] - 1.0F;
        float var3 = (float) Math.sqrt((double) (var1 * var1 - var2 * 4.0F * var2));
        float var4 = (-var1 + var3) * 0.5F;
        if (arg0[1] + field1495 > var4) {
            arg0[1] = var4 - field1495;
        } else {
            float var5 = (-var1 - var3) * 0.5F;
            if (arg0[1] < field1495 + var5) {
                arg0[1] = field1495 + var5;
            }
        }
    }

    @ObfuscatedName("eg.aj([FI)V")
    public static void method2756(float[] arg0) {
        arg0[1] = 1.0F - arg0[1];
        if (arg0[0] < 0.0F) {
            arg0[0] = 0.0F;
        }
        if (arg0[1] < 0.0F) {
            arg0[1] = 0.0F;
        }
        if (arg0[0] > 1.0F || arg0[1] > 1.0F) {
            float var1 = (float) (((double) arg0[1] - 2.0D) * (double) arg0[1] + (double) ((arg0[0] - 2.0F + arg0[1]) * arg0[0]) + 1.0D);
            if (field1495 + var1 > 0.0F) {
                method2153(arg0);
            }
        }
        arg0[1] = 1.0F - arg0[1];
    }

    @ObfuscatedName("hq.ag(FFFFLfm;I)V")
    public static void method3512(float arg0, float arg1, float arg2, float arg3, class131 arg4) {
        float var5 = arg1 - arg0;
        float var6 = arg2 - arg1;
        float var7 = arg3 - arg2;
        float var8 = var6 - var5;
        arg4.field1551 = var7 - var6 - var8;
        arg4.field1543 = var8 + var8 + var8;
        arg4.field1542 = var5 + var5 + var5;
        arg4.field1541 = arg0;
    }
}
