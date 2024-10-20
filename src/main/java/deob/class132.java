package deob;

@ObfuscatedName("fw")
public class class132 {

    @ObfuscatedName("fw.ak")
    public static final float field1545 = Math.ulp(1.0F);

    @ObfuscatedName("fw.ap")
    public static final float field1540 = field1545 * 2.0F;

    @ObfuscatedName("fw.an")
    public static float[] field1541 = new float[4];

    @ObfuscatedName("fw.aj")
    public static float[] field1543 = new float[5];

    public class132() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ef.aq(Lfd;FB)F")
    public static float method2895(class136 arg0, float arg1) {
        if (arg0 == null || arg0.method2993() == 0) {
            return 0.0F;
        } else if (arg1 < (float) arg0.field1580[0].field1527) {
            return class134.field1566 == arg0.field1581 ? arg0.field1580[0].field1528 : method3397(arg0, arg1, true);
        } else if (arg1 > (float) arg0.field1580[arg0.method2993() - 1].field1527) {
            return class134.field1566 == arg0.field1584 ? arg0.field1580[arg0.method2993() - 1].field1528 : method3397(arg0, arg1, false);
        } else if (arg0.field1577) {
            return arg0.field1580[0].field1528;
        } else {
            class131 var2 = arg0.method3002(arg1);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
                return 0.0F;
            }
            if ((double) var2.field1536 == 0.0D && (double) var2.field1532 == 0.0D) {
                var3 = true;
            } else if (var2.field1536 == Float.MAX_VALUE && var2.field1532 == Float.MAX_VALUE) {
                var4 = true;
            } else if (var2.field1533 == null) {
                var3 = true;
            } else if (arg0.field1579) {
                float var5 = (float) var2.field1527;
                float var6 = var2.field1528;
                float var7 = var2.field1536 * 0.33333334F + var5;
                float var8 = var2.field1532 * 0.33333334F + var6;
                float var9 = (float) var2.field1533.field1527;
                float var10 = var2.field1533.field1528;
                float var11 = var9 - var2.field1533.field1529 * 0.33333334F;
                float var12 = var10 - var2.field1533.field1530 * 0.33333334F;
                if (arg0.field1576) {
                    method476(arg0, var5, var7, var11, var9, var6, var8, var12, var10);
                } else if (arg0 != null) {
                    arg0.field1593 = var5;
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
                    arg0.field1582 = (var20 + var21 - var14 - var14) * var19 / var13;
                    arg0.field1591 = (var14 + var14 + var14 - var20 - var20 - var21) * var19;
                    arg0.field1586 = var16;
                    arg0.field1587 = var6;
                }
                arg0.field1579 = false;
            }
            if (var3) {
                return var2.field1528;
            } else if (var4) {
                return (float) var2.field1527 == arg1 || var2.field1533 == null ? var2.field1528 : var2.field1533.field1528;
            } else if (arg0.field1576) {
                float var22;
                if (arg0 == null) {
                    var22 = 0.0F;
                } else {
                    float var23;
                    if (arg0.field1593 == arg1) {
                        var23 = 0.0F;
                    } else if (arg0.field1592 == arg1) {
                        var23 = 1.0F;
                    } else {
                        var23 = (arg1 - arg0.field1593) / (arg0.field1592 - arg0.field1593);
                    }
                    float var24;
                    if (arg0.field1595) {
                        var24 = var23;
                    } else {
                        field1541[3] = arg0.field1587;
                        field1541[2] = arg0.field1586;
                        field1541[1] = arg0.field1591;
                        field1541[0] = arg0.field1582 - var23;
                        field1543[0] = 0.0F;
                        field1543[1] = 0.0F;
                        field1543[2] = 0.0F;
                        field1543[3] = 0.0F;
                        field1543[4] = 0.0F;
                        int var25 = class427.method6406(field1541, 3, 0.0F, true, 1.0F, true, field1543);
                        if (var25 == 1) {
                            var24 = field1543[0];
                        } else {
                            var24 = 0.0F;
                        }
                    }
                    var22 = ((arg0.field1583 * var24 + arg0.field1590) * var24 + arg0.field1589) * var24 + arg0.field1588;
                }
                return var22;
            } else {
                float var26;
                if (arg0 == null) {
                    var26 = 0.0F;
                } else {
                    float var27 = arg1 - arg0.field1593;
                    var26 = ((arg0.field1582 * var27 + arg0.field1591) * var27 + arg0.field1586) * var27 + arg0.field1587;
                }
                return var26;
            }
        }
    }

    @ObfuscatedName("hs.ad(Lfd;FZI)F")
    public static float method3397(class136 arg0, float arg1, boolean arg2) {
        float var3 = 0.0F;
        if (arg0 == null || arg0.method2993() == 0) {
            return var3;
        }
        float var4 = (float) arg0.field1580[0].field1527;
        float var5 = (float) arg0.field1580[arg0.method2993() - 1].field1527;
        float var6 = var5 - var4;
        if ((double) var6 == 0.0D) {
            return arg0.field1580[0].field1528;
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
            if (class134.field1565 == arg0.field1581) {
                if ((double) var19 == 0.0D) {
                    var12 = var5 - var12;
                } else {
                    var12 += var4;
                }
            } else if (class134.field1563 == arg0.field1581 || class134.field1564 == arg0.field1581) {
                var12 = var5 - var12;
            } else if (class134.field1562 == arg0.field1581) {
                float var20 = var4 - arg1;
                float var21 = arg0.field1580[0].field1529;
                float var22 = arg0.field1580[0].field1530;
                float var23 = arg0.field1580[0].field1528;
                if ((double) var21 != 0.0D) {
                    var23 -= var20 * var22 / var21;
                }
                return var23;
            }
        } else if (class134.field1565 == arg0.field1584) {
            if ((double) var19 == 0.0D) {
                var12 += var4;
            } else {
                var12 = var5 - var12;
            }
        } else if (class134.field1563 == arg0.field1584 || class134.field1564 == arg0.field1584) {
            var12 += var4;
        } else if (class134.field1562 == arg0.field1584) {
            float var24 = arg1 - var5;
            float var25 = arg0.field1580[arg0.method2993() - 1].field1536;
            float var26 = arg0.field1580[arg0.method2993() - 1].field1532;
            float var27 = arg0.field1580[arg0.method2993() - 1].field1528;
            if ((double) var25 != 0.0D) {
                var27 += var24 * var26 / var25;
            }
            return var27;
        }
        float var28 = method2895(arg0, var12);
        if (arg2 && class134.field1564 == arg0.field1581) {
            float var29 = arg0.field1580[arg0.method2993() - 1].field1528 - arg0.field1580[0].field1528;
            var28 = (float) ((double) var28 - (double) var29 * var13);
        } else if (!arg2 && class134.field1564 == arg0.field1584) {
            float var30 = arg0.field1580[arg0.method2993() - 1].field1528 - arg0.field1580[0].field1528;
            var28 = (float) ((double) var30 * var13 + (double) var28);
        }
        return var28;
    }

    @ObfuscatedName("bg.ag(Lfd;FFFFFFFFB)V")
    public static void method476(class136 arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8) {
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
        arg0.field1595 = var12[0] == 0.33333334F && var12[1] == 0.6666667F;
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
                if (field1545 + var15 > 0.0F) {
                    method2876(var12);
                }
            }
            var12[1] = 1.0F - var12[1];
        }
        if (var12[0] != var13) {
            float var16 = var12[0] * var9 + arg1;
            if ((double) var13 != 0.0D) {
                arg6 = (arg6 - arg5) * var12[0] / var13 + arg5;
            }
        }
        if (var12[1] != var14) {
            float var17 = var12[1] * var9 + arg1;
            if ((double) var14 != 1.0D) {
                arg7 = (float) ((double) arg8 - (1.0D - (double) var12[1]) * (double) (arg8 - arg7) / (1.0D - (double) var14));
            }
        }
        arg0.field1593 = arg1;
        arg0.field1592 = arg4;
        method2654(0.0F, var12[0], var12[1], 1.0F, arg0);
        float var18 = arg6 - arg5;
        float var19 = arg7 - arg6;
        float var20 = arg8 - arg7;
        float var21 = var19 - var18;
        arg0.field1583 = var20 - var19 - var21;
        arg0.field1590 = var21 + var21 + var21;
        arg0.field1589 = var18 + var18 + var18;
        arg0.field1588 = arg5;
    }

    @ObfuscatedName("ee.ak([FI)V")
    public static void method2876(float[] arg0) {
        if (arg0[0] + field1545 >= 1.3333334F) {
            arg0[0] = 1.3333334F - field1545;
            arg0[1] = 0.33333334F - field1545;
            return;
        }
        float var1 = arg0[0] - 2.0F;
        float var2 = arg0[0] - 1.0F;
        float var3 = (float) Math.sqrt((double) (var1 * var1 - var2 * 4.0F * var2));
        float var4 = (-var1 + var3) * 0.5F;
        if (arg0[1] + field1545 > var4) {
            arg0[1] = var4 - field1545;
        } else {
            float var5 = (-var1 - var3) * 0.5F;
            if (arg0[1] < field1545 + var5) {
                arg0[1] = field1545 + var5;
            }
        }
    }

    @ObfuscatedName("eo.ap(FFFFLfd;B)V")
    public static void method2654(float arg0, float arg1, float arg2, float arg3, class136 arg4) {
        float var5 = arg1 - arg0;
        float var6 = arg2 - arg1;
        float var7 = arg3 - arg2;
        float var8 = var6 - var5;
        arg4.field1587 = var7 - var6 - var8;
        arg4.field1586 = var8 + var8 + var8;
        arg4.field1591 = var5 + var5 + var5;
        arg4.field1582 = arg0;
    }
}
