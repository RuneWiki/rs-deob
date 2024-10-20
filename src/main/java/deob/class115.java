package deob;

import java.util.Random;

@ObfuscatedName("dw")
public class class115 {

    @ObfuscatedName("dw.n")
    public class104 field1476;

    @ObfuscatedName("dw.h")
    public class104 field1459;

    @ObfuscatedName("dw.l")
    public class104 field1457;

    @ObfuscatedName("dw.g")
    public class104 field1469;

    @ObfuscatedName("dw.b")
    public class104 field1480;

    @ObfuscatedName("dw.a")
    public class104 field1460;

    @ObfuscatedName("dw.c")
    public class104 field1456;

    @ObfuscatedName("dw.z")
    public class104 field1462;

    @ObfuscatedName("dw.j")
    public int[] field1463 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dw.d")
    public int[] field1464 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dw.t")
    public int[] field1461 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dw.f")
    public int field1466 = 0;

    @ObfuscatedName("dw.i")
    public int field1458 = 100;

    @ObfuscatedName("dw.m")
    public class112 field1468;

    @ObfuscatedName("dw.v")
    public class104 field1467;

    @ObfuscatedName("dw.r")
    public int field1470 = 500;

    @ObfuscatedName("dw.x")
    public int field1455 = 0;

    @ObfuscatedName("dw.y")
    public static int[] field1472;

    @ObfuscatedName("dw.p")
    public static int[] field1473 = new int[32768];

    @ObfuscatedName("dw.k")
    public static int[] field1474;

    @ObfuscatedName("dw.s")
    public static int[] field1471;

    @ObfuscatedName("dw.u")
    public static int[] field1477;

    @ObfuscatedName("dw.e")
    public static int[] field1478;

    @ObfuscatedName("dw.w")
    public static int[] field1479;

    @ObfuscatedName("dw.q")
    public static int[] field1465;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1473[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1474 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1474[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1472 = new int[220500];
        field1471 = new int[5];
        field1477 = new int[5];
        field1478 = new int[5];
        field1479 = new int[5];
        field1465 = new int[5];
    }

    @ObfuscatedName("dw.n(II)[I")
    public final int[] method2485(int arg0, int arg1) {
        class201.method3828(field1472, 0, arg0);
        if (arg1 < 10) {
            return field1472;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1476.method2273();
        this.field1459.method2273();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1457 != null) {
            this.field1457.method2273();
            this.field1469.method2273();
            var5 = (int) ((double) (this.field1457.field1381 - this.field1457.field1380) * 32.768D / var3);
            var6 = (int) ((double) this.field1457.field1380 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1480 != null) {
            this.field1480.method2273();
            this.field1460.method2273();
            var8 = (int) ((double) (this.field1480.field1381 - this.field1480.field1380) * 32.768D / var3);
            var9 = (int) ((double) this.field1480.field1380 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1463[var11] != 0) {
                field1471[var11] = 0;
                field1477[var11] = (int) ((double) this.field1461[var11] * var3);
                field1478[var11] = (this.field1463[var11] << 14) / 100;
                field1479[var11] = (int) ((double) (this.field1476.field1381 - this.field1476.field1380) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1464[var11]) / var3);
                field1465[var11] = (int) ((double) this.field1476.field1380 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1476.method2274(arg0);
            int var14 = this.field1459.method2274(arg0);
            if (this.field1457 != null) {
                int var15 = this.field1457.method2274(arg0);
                int var16 = this.field1469.method2274(arg0);
                var13 += this.method2479(var7, var16, this.field1457.field1378) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1480 != null) {
                int var17 = this.field1480.method2274(arg0);
                int var18 = this.field1460.method2274(arg0);
                var14 = var14 * ((this.method2479(var10, var18, this.field1480.field1378) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1463[var19] != 0) {
                    int var20 = field1477[var19] + var12;
                    if (var20 < arg0) {
                        field1472[var20] += this.method2479(field1471[var19], field1478[var19] * var14 >> 15, this.field1476.field1378);
                        field1471[var19] += (field1479[var19] * var13 >> 16) + field1465[var19];
                    }
                }
            }
        }
        if (this.field1456 != null) {
            this.field1456.method2273();
            this.field1462.method2273();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1456.method2274(arg0);
                int var26 = this.field1462.method2274(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1456.field1381 - this.field1456.field1380) * var25 >> 8) + this.field1456.field1380;
                } else {
                    var27 = ((this.field1456.field1381 - this.field1456.field1380) * var26 >> 8) + this.field1456.field1380;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1472[var24] = 0;
                }
            }
        }
        if (this.field1466 > 0 && this.field1458 > 0) {
            int var28 = (int) ((double) this.field1466 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1472[var29] += field1472[var29 - var28] * this.field1458 / 100;
            }
        }
        if (this.field1468.field1438[0] > 0 || this.field1468.field1438[1] > 0) {
            this.field1467.method2273();
            int var30 = this.field1467.method2274(arg0 + 1);
            int var31 = this.field1468.method2461(0, (float) var30 / 65536.0F);
            int var32 = this.field1468.method2461(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1472[var31 + var33] * (long) Statics.field1443 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1472[var31 + var33 - 1 - var36] * (long) class112.field1436[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1472[var33 - 1 - var37] * (long) class112.field1436[1][var37] >> 16);
                    }
                    field1472[var33] = var35;
                    var30 = this.field1467.method2274(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1472[var31 + var33] * (long) Statics.field1443 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1472[var31 + var33 - 1 - var40] * (long) class112.field1436[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1472[var33 - 1 - var41] * (long) class112.field1436[1][var41] >> 16);
                        }
                        field1472[var33] = var39;
                        var30 = this.field1467.method2274(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1472[var31 + var33 - 1 - var43] * (long) class112.field1436[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1472[var33 - 1 - var44] * (long) class112.field1436[1][var44] >> 16);
                            }
                            field1472[var33] = var42;
                            this.field1467.method2274(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1468.method2461(0, (float) var30 / 65536.0F);
                    var32 = this.field1468.method2461(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1472[var46] < -32768) {
                field1472[var46] = -32768;
            }
            if (field1472[var46] > 32767) {
                field1472[var46] = 32767;
            }
        }
        return field1472;
    }

    @ObfuscatedName("dw.h(III)I")
    public final int method2479(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1474[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1473[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dw.l(Lgc;)V")
    public final void method2480(class190 arg0) {
        this.field1476 = new class104();
        this.field1476.method2271(arg0);
        this.field1459 = new class104();
        this.field1459.method2271(arg0);
        int var2 = arg0.method3511();
        if (var2 != 0) {
            arg0.field2423--;
            this.field1457 = new class104();
            this.field1457.method2271(arg0);
            this.field1469 = new class104();
            this.field1469.method2271(arg0);
        }
        int var3 = arg0.method3511();
        if (var3 != 0) {
            arg0.field2423--;
            this.field1480 = new class104();
            this.field1480.method2271(arg0);
            this.field1460 = new class104();
            this.field1460.method2271(arg0);
        }
        int var4 = arg0.method3511();
        if (var4 != 0) {
            arg0.field2423--;
            this.field1456 = new class104();
            this.field1456.method2271(arg0);
            this.field1462 = new class104();
            this.field1462.method2271(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3566();
            if (var6 == 0) {
                break;
            }
            this.field1463[var5] = var6;
            this.field1464[var5] = arg0.method3524();
            this.field1461[var5] = arg0.method3566();
        }
        this.field1466 = arg0.method3566();
        this.field1458 = arg0.method3566();
        this.field1470 = arg0.method3513();
        this.field1455 = arg0.method3513();
        this.field1468 = new class112();
        this.field1467 = new class104();
        this.field1468.method2457(arg0, this.field1467);
    }
}
