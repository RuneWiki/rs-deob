package deob;

import java.util.Random;

@ObfuscatedName("dw")
public class class118 {

    @ObfuscatedName("dw.c")
    public class107 field1490;

    @ObfuscatedName("dw.x")
    public class107 field1468;

    @ObfuscatedName("dw.t")
    public class107 field1470;

    @ObfuscatedName("dw.g")
    public class107 field1471;

    @ObfuscatedName("dw.l")
    public class107 field1472;

    @ObfuscatedName("dw.u")
    public class107 field1481;

    @ObfuscatedName("dw.j")
    public class107 field1483;

    @ObfuscatedName("dw.v")
    public class107 field1469;

    @ObfuscatedName("dw.d")
    public int[] field1476 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dw.z")
    public int[] field1477 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dw.n")
    public int[] field1478 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dw.h")
    public int field1473 = 0;

    @ObfuscatedName("dw.f")
    public int field1489 = 100;

    @ObfuscatedName("dw.s")
    public class115 field1480;

    @ObfuscatedName("dw.p")
    public class107 field1475;

    @ObfuscatedName("dw.e")
    public int field1479 = 500;

    @ObfuscatedName("dw.i")
    public int field1484 = 0;

    @ObfuscatedName("dw.q")
    public static int[] field1485;

    @ObfuscatedName("dw.y")
    public static int[] field1486 = new int[32768];

    @ObfuscatedName("dw.r")
    public static int[] field1487;

    @ObfuscatedName("dw.w")
    public static int[] field1482;

    @ObfuscatedName("dw.m")
    public static int[] field1474;

    @ObfuscatedName("dw.o")
    public static int[] field1491;

    @ObfuscatedName("dw.a")
    public static int[] field1492;

    @ObfuscatedName("dw.b")
    public static int[] field1493;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1486[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1487 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1487[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1485 = new int[220500];
        field1482 = new int[5];
        field1474 = new int[5];
        field1491 = new int[5];
        field1492 = new int[5];
        field1493 = new int[5];
    }

    @ObfuscatedName("dw.c(II)[I")
    public final int[] method2489(int arg0, int arg1) {
        class301.method5352(field1485, 0, arg0);
        if (arg1 < 10) {
            return field1485;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1490.method2273();
        this.field1468.method2273();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1470 != null) {
            this.field1470.method2273();
            this.field1471.method2273();
            var5 = (int) ((double) (this.field1470.field1396 - this.field1470.field1402) * 32.768D / var3);
            var6 = (int) ((double) this.field1470.field1402 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1472 != null) {
            this.field1472.method2273();
            this.field1481.method2273();
            var8 = (int) ((double) (this.field1472.field1396 - this.field1472.field1402) * 32.768D / var3);
            var9 = (int) ((double) this.field1472.field1402 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1476[var11] != 0) {
                field1482[var11] = 0;
                field1474[var11] = (int) ((double) this.field1478[var11] * var3);
                field1491[var11] = (this.field1476[var11] << 14) / 100;
                field1492[var11] = (int) ((double) (this.field1490.field1396 - this.field1490.field1402) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1477[var11]) / var3);
                field1493[var11] = (int) ((double) this.field1490.field1402 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1490.method2272(arg0);
            int var14 = this.field1468.method2272(arg0);
            if (this.field1470 != null) {
                int var15 = this.field1470.method2272(arg0);
                int var16 = this.field1471.method2272(arg0);
                var13 += this.method2488(var7, var16, this.field1470.field1395) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1472 != null) {
                int var17 = this.field1472.method2272(arg0);
                int var18 = this.field1481.method2272(arg0);
                var14 = var14 * ((this.method2488(var10, var18, this.field1472.field1395) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1476[var19] != 0) {
                    int var20 = field1474[var19] + var12;
                    if (var20 < arg0) {
                        field1485[var20] += this.method2488(field1482[var19], field1491[var19] * var14 >> 15, this.field1490.field1395);
                        field1482[var19] += (field1492[var19] * var13 >> 16) + field1493[var19];
                    }
                }
            }
        }
        if (this.field1483 != null) {
            this.field1483.method2273();
            this.field1469.method2273();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1483.method2272(arg0);
                int var26 = this.field1469.method2272(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1483.field1396 - this.field1483.field1402) * var25 >> 8) + this.field1483.field1402;
                } else {
                    var27 = ((this.field1483.field1396 - this.field1483.field1402) * var26 >> 8) + this.field1483.field1402;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1485[var24] = 0;
                }
            }
        }
        if (this.field1473 > 0 && this.field1489 > 0) {
            int var28 = (int) ((double) this.field1473 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1485[var29] += field1485[var29 - var28] * this.field1489 / 100;
            }
        }
        if (this.field1480.field1449[0] > 0 || this.field1480.field1449[1] > 0) {
            this.field1475.method2273();
            int var30 = this.field1475.method2272(arg0 + 1);
            int var31 = this.field1480.method2470(0, (float) var30 / 65536.0F);
            int var32 = this.field1480.method2470(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1485[var31 + var33] * (long) Statics.field1450 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1485[var31 + var33 - 1 - var36] * (long) class115.field1454[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1485[var33 - 1 - var37] * (long) class115.field1454[1][var37] >> 16);
                    }
                    field1485[var33] = var35;
                    var30 = this.field1475.method2272(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1485[var31 + var33] * (long) Statics.field1450 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1485[var31 + var33 - 1 - var40] * (long) class115.field1454[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1485[var33 - 1 - var41] * (long) class115.field1454[1][var41] >> 16);
                        }
                        field1485[var33] = var39;
                        var30 = this.field1475.method2272(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1485[var31 + var33 - 1 - var43] * (long) class115.field1454[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1485[var33 - 1 - var44] * (long) class115.field1454[1][var44] >> 16);
                            }
                            field1485[var33] = var42;
                            this.field1475.method2272(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1480.method2470(0, (float) var30 / 65536.0F);
                    var32 = this.field1480.method2470(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1485[var46] < -32768) {
                field1485[var46] = -32768;
            }
            if (field1485[var46] > 32767) {
                field1485[var46] = 32767;
            }
        }
        return field1485;
    }

    @ObfuscatedName("dw.x(III)I")
    public final int method2488(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1487[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1486[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dw.t(Lkz;)V")
    public final void method2487(class300 arg0) {
        this.field1490 = new class107();
        this.field1490.method2283(arg0);
        this.field1468 = new class107();
        this.field1468.method2283(arg0);
        int var2 = arg0.method5103();
        if (var2 != 0) {
            arg0.field3696--;
            this.field1470 = new class107();
            this.field1470.method2283(arg0);
            this.field1471 = new class107();
            this.field1471.method2283(arg0);
        }
        int var3 = arg0.method5103();
        if (var3 != 0) {
            arg0.field3696--;
            this.field1472 = new class107();
            this.field1472.method2283(arg0);
            this.field1481 = new class107();
            this.field1481.method2283(arg0);
        }
        int var4 = arg0.method5103();
        if (var4 != 0) {
            arg0.field3696--;
            this.field1483 = new class107();
            this.field1483.method2283(arg0);
            this.field1469 = new class107();
            this.field1469.method2283(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method5117();
            if (var6 == 0) {
                break;
            }
            this.field1476[var5] = var6;
            this.field1477[var5] = arg0.method5116();
            this.field1478[var5] = arg0.method5117();
        }
        this.field1473 = arg0.method5117();
        this.field1489 = arg0.method5117();
        this.field1479 = arg0.method5304();
        this.field1484 = arg0.method5304();
        this.field1480 = new class115();
        this.field1475 = new class107();
        this.field1480.method2476(arg0, this.field1475);
    }
}
