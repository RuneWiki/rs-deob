package deob;

import java.util.Random;

@ObfuscatedName("dh")
public class class110 {

    @ObfuscatedName("dh.g")
    public class99 field1465;

    @ObfuscatedName("dh.r")
    public class99 field1452;

    @ObfuscatedName("dh.e")
    public class99 field1453;

    @ObfuscatedName("dh.q")
    public class99 field1464;

    @ObfuscatedName("dh.c")
    public class99 field1455;

    @ObfuscatedName("dh.l")
    public class99 field1456;

    @ObfuscatedName("dh.b")
    public class99 field1457;

    @ObfuscatedName("dh.w")
    public class99 field1458;

    @ObfuscatedName("dh.n")
    public int[] field1459 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dh.i")
    public int[] field1460 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dh.p")
    public int[] field1454 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dh.m")
    public int field1462 = 0;

    @ObfuscatedName("dh.d")
    public int field1468 = 100;

    @ObfuscatedName("dh.j")
    public class107 field1475;

    @ObfuscatedName("dh.x")
    public class99 field1474;

    @ObfuscatedName("dh.v")
    public int field1466 = 500;

    @ObfuscatedName("dh.h")
    public int field1469 = 0;

    @ObfuscatedName("dh.f")
    public static int[] field1451;

    @ObfuscatedName("dh.a")
    public static int[] field1463 = new int[32768];

    @ObfuscatedName("dh.t")
    public static int[] field1470;

    @ObfuscatedName("dh.z")
    public static int[] field1472;

    @ObfuscatedName("dh.s")
    public static int[] field1473;

    @ObfuscatedName("dh.y")
    public static int[] field1461;

    @ObfuscatedName("dh.u")
    public static int[] field1467;

    @ObfuscatedName("dh.o")
    public static int[] field1476;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1463[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1470 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1470[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1451 = new int[220500];
        field1472 = new int[5];
        field1473 = new int[5];
        field1461 = new int[5];
        field1467 = new int[5];
        field1476 = new int[5];
    }

    @ObfuscatedName("dh.g(II)[I")
    public final int[] method2476(int arg0, int arg1) {
        class196.method3791(field1451, 0, arg0);
        if (arg1 < 10) {
            return field1451;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1465.method2250();
        this.field1452.method2250();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1453 != null) {
            this.field1453.method2250();
            this.field1464.method2250();
            var5 = (int) ((double) (this.field1453.field1381 - this.field1453.field1388) * 32.768D / var3);
            var6 = (int) ((double) this.field1453.field1388 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1455 != null) {
            this.field1455.method2250();
            this.field1456.method2250();
            var8 = (int) ((double) (this.field1455.field1381 - this.field1455.field1388) * 32.768D / var3);
            var9 = (int) ((double) this.field1455.field1388 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1459[var11] != 0) {
                field1472[var11] = 0;
                field1473[var11] = (int) ((double) this.field1454[var11] * var3);
                field1461[var11] = (this.field1459[var11] << 14) / 100;
                field1467[var11] = (int) ((double) (this.field1465.field1381 - this.field1465.field1388) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1460[var11]) / var3);
                field1476[var11] = (int) ((double) this.field1465.field1388 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1465.method2251(arg0);
            int var14 = this.field1452.method2251(arg0);
            if (this.field1453 != null) {
                int var15 = this.field1453.method2251(arg0);
                int var16 = this.field1464.method2251(arg0);
                var13 += this.method2472(var7, var16, this.field1453.field1386) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1455 != null) {
                int var17 = this.field1455.method2251(arg0);
                int var18 = this.field1456.method2251(arg0);
                var14 = var14 * ((this.method2472(var10, var18, this.field1455.field1386) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1459[var19] != 0) {
                    int var20 = field1473[var19] + var12;
                    if (var20 < arg0) {
                        field1451[var20] += this.method2472(field1472[var19], field1461[var19] * var14 >> 15, this.field1465.field1386);
                        field1472[var19] += (field1467[var19] * var13 >> 16) + field1476[var19];
                    }
                }
            }
        }
        if (this.field1457 != null) {
            this.field1457.method2250();
            this.field1458.method2250();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1457.method2251(arg0);
                int var26 = this.field1458.method2251(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1457.field1381 - this.field1457.field1388) * var25 >> 8) + this.field1457.field1388;
                } else {
                    var27 = ((this.field1457.field1381 - this.field1457.field1388) * var26 >> 8) + this.field1457.field1388;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1451[var24] = 0;
                }
            }
        }
        if (this.field1462 > 0 && this.field1468 > 0) {
            int var28 = (int) ((double) this.field1462 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1451[var29] += field1451[var29 - var28] * this.field1468 / 100;
            }
        }
        if (this.field1475.field1434[0] > 0 || this.field1475.field1434[1] > 0) {
            this.field1474.method2250();
            int var30 = this.field1474.method2251(arg0 + 1);
            int var31 = this.field1475.method2469(0, (float) var30 / 65536.0F);
            int var32 = this.field1475.method2469(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1451[var31 + var33] * (long) Statics.field1439 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1451[var31 + var33 - 1 - var36] * (long) class107.field1438[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1451[var33 - 1 - var37] * (long) class107.field1438[1][var37] >> 16);
                    }
                    field1451[var33] = var35;
                    var30 = this.field1474.method2251(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1451[var31 + var33] * (long) Statics.field1439 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1451[var31 + var33 - 1 - var40] * (long) class107.field1438[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1451[var33 - 1 - var41] * (long) class107.field1438[1][var41] >> 16);
                        }
                        field1451[var33] = var39;
                        var30 = this.field1474.method2251(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1451[var31 + var33 - 1 - var43] * (long) class107.field1438[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1451[var33 - 1 - var44] * (long) class107.field1438[1][var44] >> 16);
                            }
                            field1451[var33] = var42;
                            this.field1474.method2251(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1475.method2469(0, (float) var30 / 65536.0F);
                    var32 = this.field1475.method2469(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1451[var46] < -32768) {
                field1451[var46] = -32768;
            }
            if (field1451[var46] > 32767) {
                field1451[var46] = 32767;
            }
        }
        return field1451;
    }

    @ObfuscatedName("dh.r(III)I")
    public final int method2472(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1470[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1463[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dh.e(Lgl;)V")
    public final void method2474(class185 arg0) {
        this.field1465 = new class99();
        this.field1465.method2252(arg0);
        this.field1452 = new class99();
        this.field1452.method2252(arg0);
        int var2 = arg0.method3679();
        if (var2 != 0) {
            arg0.field2406--;
            this.field1453 = new class99();
            this.field1453.method2252(arg0);
            this.field1464 = new class99();
            this.field1464.method2252(arg0);
        }
        int var3 = arg0.method3679();
        if (var3 != 0) {
            arg0.field2406--;
            this.field1455 = new class99();
            this.field1455.method2252(arg0);
            this.field1456 = new class99();
            this.field1456.method2252(arg0);
        }
        int var4 = arg0.method3679();
        if (var4 != 0) {
            arg0.field2406--;
            this.field1457 = new class99();
            this.field1457.method2252(arg0);
            this.field1458 = new class99();
            this.field1458.method2252(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3479();
            if (var6 == 0) {
                break;
            }
            this.field1459[var5] = var6;
            this.field1460[var5] = arg0.method3478();
            this.field1454[var5] = arg0.method3479();
        }
        this.field1462 = arg0.method3479();
        this.field1468 = arg0.method3479();
        this.field1466 = arg0.method3467();
        this.field1469 = arg0.method3467();
        this.field1475 = new class107();
        this.field1474 = new class99();
        this.field1475.method2457(arg0, this.field1474);
    }
}
