package deob;

import java.util.Random;

@ObfuscatedName("da")
public class class118 {

    @ObfuscatedName("da.a")
    public class107 field1481;

    @ObfuscatedName("da.t")
    public class107 field1477;

    @ObfuscatedName("da.n")
    public class107 field1476;

    @ObfuscatedName("da.q")
    public class107 field1479;

    @ObfuscatedName("da.v")
    public class107 field1482;

    @ObfuscatedName("da.l")
    public class107 field1492;

    @ObfuscatedName("da.c")
    public class107 field1491;

    @ObfuscatedName("da.o")
    public class107 field1485;

    @ObfuscatedName("da.i")
    public int[] field1488 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("da.d")
    public int[] field1487 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("da.m")
    public int[] field1486 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("da.p")
    public int field1483 = 0;

    @ObfuscatedName("da.h")
    public int field1478 = 100;

    @ObfuscatedName("da.k")
    public class115 field1489;

    @ObfuscatedName("da.x")
    public class107 field1490;

    @ObfuscatedName("da.j")
    public int field1500 = 500;

    @ObfuscatedName("da.r")
    public int field1484 = 0;

    @ObfuscatedName("da.e")
    public static int[] field1493;

    @ObfuscatedName("da.s")
    public static int[] field1494 = new int[32768];

    @ObfuscatedName("da.b")
    public static int[] field1495;

    @ObfuscatedName("da.f")
    public static int[] field1497;

    @ObfuscatedName("da.g")
    public static int[] field1498;

    @ObfuscatedName("da.w")
    public static int[] field1499;

    @ObfuscatedName("da.u")
    public static int[] field1480;

    @ObfuscatedName("da.y")
    public static int[] field1501;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1494[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1495 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1495[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1493 = new int[220500];
        field1497 = new int[5];
        field1498 = new int[5];
        field1499 = new int[5];
        field1480 = new int[5];
        field1501 = new int[5];
    }

    @ObfuscatedName("da.a(II)[I")
    public final int[] method2597(int arg0, int arg1) {
        class301.method5360(field1493, 0, arg0);
        if (arg1 < 10) {
            return field1493;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1481.method2387();
        this.field1477.method2387();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1476 != null) {
            this.field1476.method2387();
            this.field1479.method2387();
            var5 = (int) ((double) (this.field1476.field1406 - this.field1476.field1405) * 32.768D / var3);
            var6 = (int) ((double) this.field1476.field1405 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1482 != null) {
            this.field1482.method2387();
            this.field1492.method2387();
            var8 = (int) ((double) (this.field1482.field1406 - this.field1482.field1405) * 32.768D / var3);
            var9 = (int) ((double) this.field1482.field1405 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1488[var11] != 0) {
                field1497[var11] = 0;
                field1498[var11] = (int) ((double) this.field1486[var11] * var3);
                field1499[var11] = (this.field1488[var11] << 14) / 100;
                field1480[var11] = (int) ((double) (this.field1481.field1406 - this.field1481.field1405) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1487[var11]) / var3);
                field1501[var11] = (int) ((double) this.field1481.field1405 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1481.method2388(arg0);
            int var14 = this.field1477.method2388(arg0);
            if (this.field1476 != null) {
                int var15 = this.field1476.method2388(arg0);
                int var16 = this.field1479.method2388(arg0);
                var13 += this.method2598(var7, var16, this.field1476.field1403) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1482 != null) {
                int var17 = this.field1482.method2388(arg0);
                int var18 = this.field1492.method2388(arg0);
                var14 = var14 * ((this.method2598(var10, var18, this.field1482.field1403) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1488[var19] != 0) {
                    int var20 = field1498[var19] + var12;
                    if (var20 < arg0) {
                        field1493[var20] += this.method2598(field1497[var19], field1499[var19] * var14 >> 15, this.field1481.field1403);
                        field1497[var19] += (field1480[var19] * var13 >> 16) + field1501[var19];
                    }
                }
            }
        }
        if (this.field1491 != null) {
            this.field1491.method2387();
            this.field1485.method2387();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1491.method2388(arg0);
                int var26 = this.field1485.method2388(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1491.field1406 - this.field1491.field1405) * var25 >> 8) + this.field1491.field1405;
                } else {
                    var27 = ((this.field1491.field1406 - this.field1491.field1405) * var26 >> 8) + this.field1491.field1405;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1493[var24] = 0;
                }
            }
        }
        if (this.field1483 > 0 && this.field1478 > 0) {
            int var28 = (int) ((double) this.field1483 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1493[var29] += field1493[var29 - var28] * this.field1478 / 100;
            }
        }
        if (this.field1489.field1467[0] > 0 || this.field1489.field1467[1] > 0) {
            this.field1490.method2387();
            int var30 = this.field1490.method2388(arg0 + 1);
            int var31 = this.field1489.method2580(0, (float) var30 / 65536.0F);
            int var32 = this.field1489.method2580(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1493[var31 + var33] * (long) Statics.field1464 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1493[var31 + var33 - 1 - var36] * (long) class115.field1462[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1493[var33 - 1 - var37] * (long) class115.field1462[1][var37] >> 16);
                    }
                    field1493[var33] = var35;
                    var30 = this.field1490.method2388(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1493[var31 + var33] * (long) Statics.field1464 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1493[var31 + var33 - 1 - var40] * (long) class115.field1462[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1493[var33 - 1 - var41] * (long) class115.field1462[1][var41] >> 16);
                        }
                        field1493[var33] = var39;
                        var30 = this.field1490.method2388(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1493[var31 + var33 - 1 - var43] * (long) class115.field1462[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1493[var33 - 1 - var44] * (long) class115.field1462[1][var44] >> 16);
                            }
                            field1493[var33] = var42;
                            this.field1490.method2388(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1489.method2580(0, (float) var30 / 65536.0F);
                    var32 = this.field1489.method2580(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1493[var46] < -32768) {
                field1493[var46] = -32768;
            }
            if (field1493[var46] > 32767) {
                field1493[var46] = 32767;
            }
        }
        return field1493;
    }

    @ObfuscatedName("da.t(III)I")
    public final int method2598(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1495[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1494[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("da.n(Lkc;)V")
    public final void method2599(class300 arg0) {
        this.field1481 = new class107();
        this.field1481.method2385(arg0);
        this.field1477 = new class107();
        this.field1477.method2385(arg0);
        int var2 = arg0.method5123();
        if (var2 != 0) {
            arg0.field3694--;
            this.field1476 = new class107();
            this.field1476.method2385(arg0);
            this.field1479 = new class107();
            this.field1479.method2385(arg0);
        }
        int var3 = arg0.method5123();
        if (var3 != 0) {
            arg0.field3694--;
            this.field1482 = new class107();
            this.field1482.method2385(arg0);
            this.field1492 = new class107();
            this.field1492.method2385(arg0);
        }
        int var4 = arg0.method5123();
        if (var4 != 0) {
            arg0.field3694--;
            this.field1491 = new class107();
            this.field1491.method2385(arg0);
            this.field1485 = new class107();
            this.field1485.method2385(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method5309();
            if (var6 == 0) {
                break;
            }
            this.field1488[var5] = var6;
            this.field1487[var5] = arg0.method5135();
            this.field1486[var5] = arg0.method5309();
        }
        this.field1483 = arg0.method5309();
        this.field1478 = arg0.method5309();
        this.field1500 = arg0.method5166();
        this.field1484 = arg0.method5166();
        this.field1489 = new class115();
        this.field1490 = new class107();
        this.field1489.method2577(arg0, this.field1490);
    }
}
