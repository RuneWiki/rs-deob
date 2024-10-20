package deob;

import java.util.Random;

@ObfuscatedName("dc")
public class class115 {

    @ObfuscatedName("dc.a")
    public class104 field1501;

    @ObfuscatedName("dc.s")
    public class104 field1479;

    @ObfuscatedName("dc.g")
    public class104 field1480;

    @ObfuscatedName("dc.x")
    public class104 field1481;

    @ObfuscatedName("dc.h")
    public class104 field1493;

    @ObfuscatedName("dc.f")
    public class104 field1486;

    @ObfuscatedName("dc.p")
    public class104 field1484;

    @ObfuscatedName("dc.m")
    public class104 field1502;

    @ObfuscatedName("dc.q")
    public int[] field1492 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dc.b")
    public int[] field1487 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dc.n")
    public int[] field1488 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dc.e")
    public int field1489 = 0;

    @ObfuscatedName("dc.r")
    public int field1490 = 100;

    @ObfuscatedName("dc.t")
    public class112 field1491;

    @ObfuscatedName("dc.l")
    public class104 field1482;

    @ObfuscatedName("dc.o")
    public int field1478 = 500;

    @ObfuscatedName("dc.u")
    public int field1503 = 0;

    @ObfuscatedName("dc.y")
    public static int[] field1495;

    @ObfuscatedName("dc.k")
    public static int[] field1496 = new int[32768];

    @ObfuscatedName("dc.v")
    public static int[] field1497;

    @ObfuscatedName("dc.w")
    public static int[] field1485;

    @ObfuscatedName("dc.i")
    public static int[] field1500;

    @ObfuscatedName("dc.c")
    public static int[] field1483;

    @ObfuscatedName("dc.j")
    public static int[] field1499;

    @ObfuscatedName("dc.z")
    public static int[] field1494;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1496[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1497 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1497[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1495 = new int[220500];
        field1485 = new int[5];
        field1500 = new int[5];
        field1483 = new int[5];
        field1499 = new int[5];
        field1494 = new int[5];
    }

    @ObfuscatedName("dc.a(II)[I")
    public final int[] method2495(int arg0, int arg1) {
        class201.method3811(field1495, 0, arg0);
        if (arg1 < 10) {
            return field1495;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1501.method2290();
        this.field1479.method2290();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1480 != null) {
            this.field1480.method2290();
            this.field1481.method2290();
            var5 = (int) ((double) (this.field1480.field1411 - this.field1480.field1410) * 32.768D / var3);
            var6 = (int) ((double) this.field1480.field1410 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1493 != null) {
            this.field1493.method2290();
            this.field1486.method2290();
            var8 = (int) ((double) (this.field1493.field1411 - this.field1493.field1410) * 32.768D / var3);
            var9 = (int) ((double) this.field1493.field1410 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1492[var11] != 0) {
                field1485[var11] = 0;
                field1500[var11] = (int) ((double) this.field1488[var11] * var3);
                field1483[var11] = (this.field1492[var11] << 14) / 100;
                field1499[var11] = (int) ((double) (this.field1501.field1411 - this.field1501.field1410) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1487[var11]) / var3);
                field1494[var11] = (int) ((double) this.field1501.field1410 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1501.method2291(arg0);
            int var14 = this.field1479.method2291(arg0);
            if (this.field1480 != null) {
                int var15 = this.field1480.method2291(arg0);
                int var16 = this.field1481.method2291(arg0);
                var13 += this.method2496(var7, var16, this.field1480.field1408) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1493 != null) {
                int var17 = this.field1493.method2291(arg0);
                int var18 = this.field1486.method2291(arg0);
                var14 = var14 * ((this.method2496(var10, var18, this.field1493.field1408) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1492[var19] != 0) {
                    int var20 = field1500[var19] + var12;
                    if (var20 < arg0) {
                        field1495[var20] += this.method2496(field1485[var19], field1483[var19] * var14 >> 15, this.field1501.field1408);
                        field1485[var19] += (field1499[var19] * var13 >> 16) + field1494[var19];
                    }
                }
            }
        }
        if (this.field1484 != null) {
            this.field1484.method2290();
            this.field1502.method2290();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1484.method2291(arg0);
                int var26 = this.field1502.method2291(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1484.field1411 - this.field1484.field1410) * var25 >> 8) + this.field1484.field1410;
                } else {
                    var27 = ((this.field1484.field1411 - this.field1484.field1410) * var26 >> 8) + this.field1484.field1410;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1495[var24] = 0;
                }
            }
        }
        if (this.field1489 > 0 && this.field1490 > 0) {
            int var28 = (int) ((double) this.field1489 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1495[var29] += field1495[var29 - var28] * this.field1490 / 100;
            }
        }
        if (this.field1491.field1458[0] > 0 || this.field1491.field1458[1] > 0) {
            this.field1482.method2290();
            int var30 = this.field1482.method2291(arg0 + 1);
            int var31 = this.field1491.method2478(0, (float) var30 / 65536.0F);
            int var32 = this.field1491.method2478(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1495[var31 + var33] * (long) Statics.field1462 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1495[var31 + var33 - 1 - var36] * (long) class112.field1466[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1495[var33 - 1 - var37] * (long) class112.field1466[1][var37] >> 16);
                    }
                    field1495[var33] = var35;
                    var30 = this.field1482.method2291(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1495[var31 + var33] * (long) Statics.field1462 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1495[var31 + var33 - 1 - var40] * (long) class112.field1466[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1495[var33 - 1 - var41] * (long) class112.field1466[1][var41] >> 16);
                        }
                        field1495[var33] = var39;
                        var30 = this.field1482.method2291(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1495[var31 + var33 - 1 - var43] * (long) class112.field1466[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1495[var33 - 1 - var44] * (long) class112.field1466[1][var44] >> 16);
                            }
                            field1495[var33] = var42;
                            this.field1482.method2291(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1491.method2478(0, (float) var30 / 65536.0F);
                    var32 = this.field1491.method2478(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1495[var46] < -32768) {
                field1495[var46] = -32768;
            }
            if (field1495[var46] > 32767) {
                field1495[var46] = 32767;
            }
        }
        return field1495;
    }

    @ObfuscatedName("dc.s(III)I")
    public final int method2496(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1497[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1496[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dc.g(Lgx;)V")
    public final void method2503(class190 arg0) {
        this.field1501 = new class104();
        this.field1501.method2294(arg0);
        this.field1479 = new class104();
        this.field1479.method2294(arg0);
        int var2 = arg0.method3443();
        if (var2 != 0) {
            arg0.field2419--;
            this.field1480 = new class104();
            this.field1480.method2294(arg0);
            this.field1481 = new class104();
            this.field1481.method2294(arg0);
        }
        int var3 = arg0.method3443();
        if (var3 != 0) {
            arg0.field2419--;
            this.field1493 = new class104();
            this.field1493.method2294(arg0);
            this.field1486 = new class104();
            this.field1486.method2294(arg0);
        }
        int var4 = arg0.method3443();
        if (var4 != 0) {
            arg0.field2419--;
            this.field1484 = new class104();
            this.field1484.method2294(arg0);
            this.field1502 = new class104();
            this.field1502.method2294(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3638();
            if (var6 == 0) {
                break;
            }
            this.field1492[var5] = var6;
            this.field1487[var5] = arg0.method3468();
            this.field1488[var5] = arg0.method3638();
        }
        this.field1489 = arg0.method3638();
        this.field1490 = arg0.method3638();
        this.field1478 = arg0.method3610();
        this.field1503 = arg0.method3610();
        this.field1491 = new class112();
        this.field1482 = new class104();
        this.field1491.method2479(arg0, this.field1482);
    }
}
