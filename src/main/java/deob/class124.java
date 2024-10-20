package deob;

@ObfuscatedName("eh")
public class class124 {

    @ObfuscatedName("eh.ab")
    public static final float field1460 = Math.ulp(1.0F);

    @ObfuscatedName("eh.an")
    public static final float field1458 = field1460 * 2.0F;

    @ObfuscatedName("eh.ao")
    public static float[] field1461 = new float[4];

    @ObfuscatedName("eh.av")
    public static float[] field1462 = new float[5];

    public class124() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dy.aj(Lew;FI)F")
    public static float method2522(class128 arg0, float arg1) {
        if (arg0 == null || arg0.method2843() == 0) {
            return 0.0F;
        } else if (arg1 < (float) arg0.field1502[0].field1456) {
            return class126.field1491 == arg0.field1500 ? arg0.field1502[0].field1447 : method3227(arg0, arg1, true);
        } else if (arg1 > (float) arg0.field1502[arg0.method2843() - 1].field1456) {
            return class126.field1491 == arg0.field1513 ? arg0.field1502[arg0.method2843() - 1].field1447 : method3227(arg0, arg1, false);
        } else if (arg0.field1499) {
            return arg0.field1502[0].field1447;
        } else {
            class123 var2 = arg0.method2841(arg1);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
                return 0.0F;
            }
            if ((double) var2.field1450 == 0.0D && (double) var2.field1451 == 0.0D) {
                var3 = true;
            } else if (var2.field1450 == Float.MAX_VALUE && var2.field1451 == Float.MAX_VALUE) {
                var4 = true;
            } else if (var2.field1452 == null) {
                var3 = true;
            } else if (arg0.field1514) {
                float var5 = (float) var2.field1456;
                float var6 = var2.field1447;
                float var7 = var2.field1450 * 0.33333334F + var5;
                float var8 = var2.field1451 * 0.33333334F + var6;
                float var9 = (float) var2.field1452.field1456;
                float var10 = var2.field1452.field1447;
                float var11 = var9 - var2.field1452.field1448 * 0.33333334F;
                float var12 = var10 - var2.field1452.field1449 * 0.33333334F;
                if (arg0.field1509) {
                    method2958(arg0, var5, var7, var11, var9, var6, var8, var12, var10);
                } else {
                    method2929(arg0, var5, var7, var11, var9, var6, var8, var12, var10);
                }
                arg0.field1514 = false;
            }
            if (var3) {
                return var2.field1447;
            } else if (var4) {
                return (float) var2.field1456 == arg1 || var2.field1452 == null ? var2.field1447 : var2.field1452.field1447;
            } else if (arg0.field1509) {
                return method2119(arg0, arg1);
            } else {
                return method7754(arg0, arg1);
            }
        }
    }

    @ObfuscatedName("dg.al(Lew;FI)F")
    public static float method2119(class128 arg0, float arg1) {
        if (arg0 == null) {
            return 0.0F;
        }
        float var2;
        if (arg0.field1506 == arg1) {
            var2 = 0.0F;
        } else if (arg0.field1505 == arg1) {
            var2 = 1.0F;
        } else {
            var2 = (arg1 - arg0.field1506) / (arg0.field1505 - arg0.field1506);
        }
        float var3;
        if (arg0.field1520) {
            var3 = var2;
        } else {
            field1461[3] = arg0.field1501;
            field1461[2] = arg0.field1508;
            field1461[1] = arg0.field1507;
            field1461[0] = arg0.field1522 - var2;
            field1462[0] = 0.0F;
            field1462[1] = 0.0F;
            field1462[2] = 0.0F;
            field1462[3] = 0.0F;
            field1462[4] = 0.0F;
            int var4 = class424.method6343(field1461, 3, 0.0F, true, 1.0F, true, field1462);
            if (var4 == 1) {
                var3 = field1462[0];
            } else {
                var3 = 0.0F;
            }
        }
        return ((arg0.field1521 * var3 + arg0.field1512) * var3 + arg0.field1511) * var3 + arg0.field1510;
    }

    @ObfuscatedName("rf.ac(Lew;FB)F")
    public static float method7754(class128 arg0, float arg1) {
        if (arg0 == null) {
            return 0.0F;
        } else {
            float var2 = arg1 - arg0.field1506;
            return ((arg0.field1522 * var2 + arg0.field1507) * var2 + arg0.field1508) * var2 + arg0.field1501;
        }
    }

    @ObfuscatedName("gt.ab(Lew;FZI)F")
    public static float method3227(class128 arg0, float arg1, boolean arg2) {
        float var3 = 0.0F;
        if (arg0 == null || arg0.method2843() == 0) {
            return var3;
        }
        float var4 = (float) arg0.field1502[0].field1456;
        float var5 = (float) arg0.field1502[arg0.method2843() - 1].field1456;
        float var6 = var5 - var4;
        if ((double) var6 == 0.0D) {
            return arg0.field1502[0].field1447;
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
            if (class126.field1487 == arg0.field1500) {
                if ((double) var19 == 0.0D) {
                    var12 = var5 - var12;
                } else {
                    var12 += var4;
                }
            } else if (class126.field1485 == arg0.field1500 || class126.field1484 == arg0.field1500) {
                var12 = var5 - var12;
            } else if (class126.field1490 == arg0.field1500) {
                float var20 = var4 - arg1;
                float var21 = arg0.field1502[0].field1448;
                float var22 = arg0.field1502[0].field1449;
                float var23 = arg0.field1502[0].field1447;
                if ((double) var21 != 0.0D) {
                    var23 -= var20 * var22 / var21;
                }
                return var23;
            }
        } else if (class126.field1487 == arg0.field1513) {
            if ((double) var19 == 0.0D) {
                var12 += var4;
            } else {
                var12 = var5 - var12;
            }
        } else if (class126.field1485 == arg0.field1513 || class126.field1484 == arg0.field1513) {
            var12 += var4;
        } else if (class126.field1490 == arg0.field1513) {
            float var24 = arg1 - var5;
            float var25 = arg0.field1502[arg0.method2843() - 1].field1450;
            float var26 = arg0.field1502[arg0.method2843() - 1].field1451;
            float var27 = arg0.field1502[arg0.method2843() - 1].field1447;
            if ((double) var25 != 0.0D) {
                var27 += var24 * var26 / var25;
            }
            return var27;
        }
        float var28 = method2522(arg0, var12);
        if (arg2 && class126.field1484 == arg0.field1500) {
            float var29 = arg0.field1502[arg0.method2843() - 1].field1447 - arg0.field1502[0].field1447;
            var28 = (float) ((double) var28 - (double) var29 * var13);
        } else if (!arg2 && class126.field1484 == arg0.field1513) {
            float var30 = arg0.field1502[arg0.method2843() - 1].field1447 - arg0.field1502[0].field1447;
            var28 = (float) ((double) var30 * var13 + (double) var28);
        }
        return var28;
    }

    @ObfuscatedName("fw.an(Lew;FFFFFFFFI)V")
    public static void method2958(class128 arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8) {
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
        arg0.field1520 = var12[0] == 0.33333334F && var12[1] == 0.6666667F;
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
                if (field1460 + var15 > 0.0F) {
                    method1684(var12);
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
        arg0.field1506 = arg1;
        arg0.field1505 = arg4;
        float var18 = var12[0];
        float var19 = var12[1];
        float var20 = var18 - 0.0F;
        float var21 = var19 - var18;
        float var22 = 1.0F - var19;
        float var23 = var21 - var20;
        arg0.field1501 = var22 - var21 - var23;
        arg0.field1508 = var23 + var23 + var23;
        arg0.field1507 = var20 + var20 + var20;
        arg0.field1522 = 0.0F;
        method7357(arg5, arg6, arg7, arg8, arg0);
    }

    @ObfuscatedName("ft.ao(Lew;FFFFFFFFB)V")
    public static void method2929(class128 arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8) {
        if (arg0 == null) {
            return;
        }
        arg0.field1506 = arg1;
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
        arg0.field1522 = (var16 + var17 - var10 - var10) * var15 / var9;
        arg0.field1507 = (var10 + var10 + var10 - var16 - var16 - var17) * var15;
        arg0.field1508 = var12;
        arg0.field1501 = arg5;
    }

    @ObfuscatedName("client.av([FI)V")
    public static void method1684(float[] arg0) {
        if (arg0[0] + field1460 >= 1.3333334F) {
            arg0[0] = 1.3333334F - field1460;
            arg0[1] = 0.33333334F - field1460;
            return;
        }
        float var1 = arg0[0] - 2.0F;
        float var2 = arg0[0] - 1.0F;
        float var3 = (float) Math.sqrt((double) (var1 * var1 - var2 * 4.0F * var2));
        float var4 = (-var1 + var3) * 0.5F;
        if (arg0[1] + field1460 > var4) {
            arg0[1] = var4 - field1460;
        } else {
            float var5 = (-var1 - var3) * 0.5F;
            if (arg0[1] < field1460 + var5) {
                arg0[1] = field1460 + var5;
            }
        }
    }

    @ObfuscatedName("ra.aq(FFFFLew;I)V")
    public static void method7357(float arg0, float arg1, float arg2, float arg3, class128 arg4) {
        float var5 = arg1 - arg0;
        float var6 = arg2 - arg1;
        float var7 = arg3 - arg2;
        float var8 = var6 - var5;
        arg4.field1521 = var7 - var6 - var8;
        arg4.field1512 = var8 + var8 + var8;
        arg4.field1511 = var5 + var5 + var5;
        arg4.field1510 = arg0;
    }
}
