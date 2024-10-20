package deob;

@ObfuscatedName("em")
public class class122 {

    @ObfuscatedName("em.ac")
    public static final float field1463 = Math.ulp(1.0F);

    @ObfuscatedName("em.au")
    public static final float field1464 = field1463 * 2.0F;

    @ObfuscatedName("em.ab")
    public static float[] field1469 = new float[4];

    @ObfuscatedName("em.aq")
    public static float[] field1466 = new float[5];

    public class122() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ag.an(Lek;FB)F")
    public static float method184(class126 arg0, float arg1) {
        if (arg0 == null) {
            return 0.0F;
        } else {
            float var2 = arg1 - arg0.field1514;
            return ((arg0.field1516 * var2 + arg0.field1517) * var2 + arg0.field1530) * var2 + arg0.field1519;
        }
    }

    @ObfuscatedName("cq.aw(Lek;FZI)F")
    public static float method1133(class126 arg0, float arg1, boolean arg2) {
        float var3 = 0.0F;
        if (arg0 == null || arg0.method2916() == 0) {
            return var3;
        }
        float var4 = (float) arg0.field1512[0].field1453;
        float var5 = (float) arg0.field1512[arg0.method2916() - 1].field1453;
        float var6 = var5 - var4;
        if ((double) var6 == 0.0D) {
            return arg0.field1512[0].field1456;
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
            if (class124.field1492 == arg0.field1513) {
                if ((double) var19 == 0.0D) {
                    var12 = var5 - var12;
                } else {
                    var12 += var4;
                }
            } else if (class124.field1490 == arg0.field1513 || class124.field1491 == arg0.field1513) {
                var12 = var5 - var12;
            } else if (class124.field1488 == arg0.field1513) {
                float var20 = var4 - arg1;
                float var21 = arg0.field1512[0].field1452;
                float var22 = arg0.field1512[0].field1450;
                float var23 = arg0.field1512[0].field1456;
                if ((double) var21 != 0.0D) {
                    var23 -= var20 * var22 / var21;
                }
                return var23;
            }
        } else if (class124.field1492 == arg0.field1529) {
            if ((double) var19 == 0.0D) {
                var12 += var4;
            } else {
                var12 = var5 - var12;
            }
        } else if (class124.field1490 == arg0.field1529 || class124.field1491 == arg0.field1529) {
            var12 += var4;
        } else if (class124.field1488 == arg0.field1529) {
            float var24 = arg1 - var5;
            float var25 = arg0.field1512[arg0.method2916() - 1].field1454;
            float var26 = arg0.field1512[arg0.method2916() - 1].field1451;
            float var27 = arg0.field1512[arg0.method2916() - 1].field1456;
            if ((double) var25 != 0.0D) {
                var27 += var24 * var26 / var25;
            }
            return var27;
        }
        float var28 = Statics.method6228(arg0, var12);
        if (arg2 && class124.field1491 == arg0.field1513) {
            float var29 = arg0.field1512[arg0.method2916() - 1].field1456 - arg0.field1512[0].field1456;
            var28 = (float) ((double) var28 - (double) var29 * var13);
        } else if (!arg2 && class124.field1491 == arg0.field1529) {
            float var30 = arg0.field1512[arg0.method2916() - 1].field1456 - arg0.field1512[0].field1456;
            var28 = (float) ((double) var30 * var13 + (double) var28);
        }
        return var28;
    }

    @ObfuscatedName("ho.ac(Lek;FFFFFFFFI)V")
    public static void method3598(class126 arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8) {
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
        arg0.field1510 = var12[0] == 0.33333334F && var12[1] == 0.6666667F;
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
                if (field1463 + var15 > 0.0F) {
                    method2695(var12);
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
        arg0.field1514 = arg1;
        arg0.field1522 = arg4;
        method3138(0.0F, var12[0], var12[1], 1.0F, arg0);
        float var18 = arg6 - arg5;
        float var19 = arg7 - arg6;
        float var20 = arg8 - arg7;
        float var21 = var19 - var18;
        arg0.field1523 = var20 - var19 - var21;
        arg0.field1518 = var21 + var21 + var21;
        arg0.field1521 = var18 + var18 + var18;
        arg0.field1520 = arg5;
    }

    @ObfuscatedName("et.au([FI)V")
    public static void method2695(float[] arg0) {
        if (arg0[0] + field1463 >= 1.3333334F) {
            arg0[0] = 1.3333334F - field1463;
            arg0[1] = 0.33333334F - field1463;
            return;
        }
        float var1 = arg0[0] - 2.0F;
        float var2 = arg0[0] - 1.0F;
        float var3 = (float) Math.sqrt((double) (var1 * var1 - var2 * 4.0F * var2));
        float var4 = (-var1 + var3) * 0.5F;
        if (arg0[1] + field1463 > var4) {
            arg0[1] = var4 - field1463;
        } else {
            float var5 = (-var1 - var3) * 0.5F;
            if (arg0[1] < field1463 + var5) {
                arg0[1] = field1463 + var5;
            }
        }
    }

    @ObfuscatedName("fg.ab(FFFFLek;B)V")
    public static void method3138(float arg0, float arg1, float arg2, float arg3, class126 arg4) {
        float var5 = arg1 - arg0;
        float var6 = arg2 - arg1;
        float var7 = arg3 - arg2;
        float var8 = var6 - var5;
        arg4.field1519 = var7 - var6 - var8;
        arg4.field1530 = var8 + var8 + var8;
        arg4.field1517 = var5 + var5 + var5;
        arg4.field1516 = arg0;
    }
}
