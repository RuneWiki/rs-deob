package deob;

import java.util.Random;

@ObfuscatedName("dp")
public class class116 {

    @ObfuscatedName("dp.f")
    public class105 field1468;

    @ObfuscatedName("dp.i")
    public class105 field1462;

    @ObfuscatedName("dp.y")
    public class105 field1463;

    @ObfuscatedName("dp.w")
    public class105 field1464;

    @ObfuscatedName("dp.p")
    public class105 field1465;

    @ObfuscatedName("dp.b")
    public class105 field1474;

    @ObfuscatedName("dp.e")
    public class105 field1482;

    @ObfuscatedName("dp.x")
    public class105 field1472;

    @ObfuscatedName("dp.a")
    public int[] field1480 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dp.d")
    public int[] field1470 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dp.c")
    public int[] field1484 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dp.o")
    public int field1469 = 0;

    @ObfuscatedName("dp.v")
    public int field1461 = 100;

    @ObfuscatedName("dp.k")
    public class113 field1475;

    @ObfuscatedName("dp.s")
    public class105 field1471;

    @ObfuscatedName("dp.l")
    public int field1476 = 500;

    @ObfuscatedName("dp.t")
    public int field1477 = 0;

    @ObfuscatedName("dp.j")
    public static int[] field1478;

    @ObfuscatedName("dp.n")
    public static int[] field1479 = new int[32768];

    @ObfuscatedName("dp.u")
    public static int[] field1467;

    @ObfuscatedName("dp.h")
    public static int[] field1473;

    @ObfuscatedName("dp.m")
    public static int[] field1483;

    @ObfuscatedName("dp.g")
    public static int[] field1466;

    @ObfuscatedName("dp.r")
    public static int[] field1485;

    @ObfuscatedName("dp.q")
    public static int[] field1486;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1479[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1467 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1467[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1478 = new int[220500];
        field1473 = new int[5];
        field1483 = new int[5];
        field1466 = new int[5];
        field1485 = new int[5];
        field1486 = new int[5];
    }

    @ObfuscatedName("dp.f(II)[I")
    public final int[] method2483(int arg0, int arg1) {
        class301.method5339(field1478, 0, arg0);
        if (arg1 < 10) {
            return field1478;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1468.method2275();
        this.field1462.method2275();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1463 != null) {
            this.field1463.method2275();
            this.field1464.method2275();
            var5 = (int) ((double) (this.field1463.field1389 - this.field1463.field1390) * 32.768D / var3);
            var6 = (int) ((double) this.field1463.field1390 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1465 != null) {
            this.field1465.method2275();
            this.field1474.method2275();
            var8 = (int) ((double) (this.field1465.field1389 - this.field1465.field1390) * 32.768D / var3);
            var9 = (int) ((double) this.field1465.field1390 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1480[var11] != 0) {
                field1473[var11] = 0;
                field1483[var11] = (int) ((double) this.field1484[var11] * var3);
                field1466[var11] = (this.field1480[var11] << 14) / 100;
                field1485[var11] = (int) ((double) (this.field1468.field1389 - this.field1468.field1390) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1470[var11]) / var3);
                field1486[var11] = (int) ((double) this.field1468.field1390 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1468.method2276(arg0);
            int var14 = this.field1462.method2276(arg0);
            if (this.field1463 != null) {
                int var15 = this.field1463.method2276(arg0);
                int var16 = this.field1464.method2276(arg0);
                var13 += this.method2486(var7, var16, this.field1463.field1392) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1465 != null) {
                int var17 = this.field1465.method2276(arg0);
                int var18 = this.field1474.method2276(arg0);
                var14 = var14 * ((this.method2486(var10, var18, this.field1465.field1392) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1480[var19] != 0) {
                    int var20 = field1483[var19] + var12;
                    if (var20 < arg0) {
                        field1478[var20] += this.method2486(field1473[var19], field1466[var19] * var14 >> 15, this.field1468.field1392);
                        field1473[var19] += (field1485[var19] * var13 >> 16) + field1486[var19];
                    }
                }
            }
        }
        if (this.field1482 != null) {
            this.field1482.method2275();
            this.field1472.method2275();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1482.method2276(arg0);
                int var26 = this.field1472.method2276(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1482.field1389 - this.field1482.field1390) * var25 >> 8) + this.field1482.field1390;
                } else {
                    var27 = ((this.field1482.field1389 - this.field1482.field1390) * var26 >> 8) + this.field1482.field1390;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1478[var24] = 0;
                }
            }
        }
        if (this.field1469 > 0 && this.field1461 > 0) {
            int var28 = (int) ((double) this.field1469 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1478[var29] += field1478[var29 - var28] * this.field1461 / 100;
            }
        }
        if (this.field1475.field1447[0] > 0 || this.field1475.field1447[1] > 0) {
            this.field1471.method2275();
            int var30 = this.field1471.method2276(arg0 + 1);
            int var31 = this.field1475.method2466(0, (float) var30 / 65536.0F);
            int var32 = this.field1475.method2466(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1478[var31 + var33] * (long) Statics.field1449 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1478[var31 + var33 - 1 - var36] * (long) class113.field1450[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1478[var33 - 1 - var37] * (long) class113.field1450[1][var37] >> 16);
                    }
                    field1478[var33] = var35;
                    var30 = this.field1471.method2276(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1478[var31 + var33] * (long) Statics.field1449 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1478[var31 + var33 - 1 - var40] * (long) class113.field1450[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1478[var33 - 1 - var41] * (long) class113.field1450[1][var41] >> 16);
                        }
                        field1478[var33] = var39;
                        var30 = this.field1471.method2276(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1478[var31 + var33 - 1 - var43] * (long) class113.field1450[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1478[var33 - 1 - var44] * (long) class113.field1450[1][var44] >> 16);
                            }
                            field1478[var33] = var42;
                            this.field1471.method2276(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1475.method2466(0, (float) var30 / 65536.0F);
                    var32 = this.field1475.method2466(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1478[var46] < -32768) {
                field1478[var46] = -32768;
            }
            if (field1478[var46] > 32767) {
                field1478[var46] = 32767;
            }
        }
        return field1478;
    }

    @ObfuscatedName("dp.i(III)I")
    public final int method2486(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1467[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1479[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dp.y(Lkq;)V")
    public final void method2490(class300 arg0) {
        this.field1468 = new class105();
        this.field1468.method2273(arg0);
        this.field1462 = new class105();
        this.field1462.method2273(arg0);
        int var2 = arg0.method5110();
        if (var2 != 0) {
            arg0.field3703--;
            this.field1463 = new class105();
            this.field1463.method2273(arg0);
            this.field1464 = new class105();
            this.field1464.method2273(arg0);
        }
        int var3 = arg0.method5110();
        if (var3 != 0) {
            arg0.field3703--;
            this.field1465 = new class105();
            this.field1465.method2273(arg0);
            this.field1474 = new class105();
            this.field1474.method2273(arg0);
        }
        int var4 = arg0.method5110();
        if (var4 != 0) {
            arg0.field3703--;
            this.field1482 = new class105();
            this.field1482.method2273(arg0);
            this.field1472 = new class105();
            this.field1472.method2273(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method5124();
            if (var6 == 0) {
                break;
            }
            this.field1480[var5] = var6;
            this.field1470[var5] = arg0.method5123();
            this.field1484[var5] = arg0.method5124();
        }
        this.field1469 = arg0.method5124();
        this.field1461 = arg0.method5124();
        this.field1476 = arg0.method5112();
        this.field1477 = arg0.method5112();
        this.field1475 = new class113();
        this.field1471 = new class105();
        this.field1475.method2478(arg0, this.field1471);
    }
}
