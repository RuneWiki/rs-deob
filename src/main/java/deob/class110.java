package deob;

import java.util.Random;

@ObfuscatedName("dl")
public class class110 {

    @ObfuscatedName("dl.c")
    public class99 field1466;

    @ObfuscatedName("dl.q")
    public class99 field1460;

    @ObfuscatedName("dl.m")
    public class99 field1467;

    @ObfuscatedName("dl.j")
    public class99 field1458;

    @ObfuscatedName("dl.g")
    public class99 field1459;

    @ObfuscatedName("dl.i")
    public class99 field1456;

    @ObfuscatedName("dl.h")
    public class99 field1461;

    @ObfuscatedName("dl.l")
    public class99 field1462;

    @ObfuscatedName("dl.d")
    public int[] field1464 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dl.o")
    public int[] field1479 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dl.s")
    public int[] field1465 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dl.k")
    public int field1477 = 0;

    @ObfuscatedName("dl.v")
    public int field1457 = 100;

    @ObfuscatedName("dl.p")
    public class107 field1468;

    @ObfuscatedName("dl.n")
    public class99 field1469;

    @ObfuscatedName("dl.t")
    public int field1470 = 500;

    @ObfuscatedName("dl.r")
    public int field1455 = 0;

    @ObfuscatedName("dl.x")
    public static int[] field1472;

    @ObfuscatedName("dl.b")
    public static int[] field1473 = new int[32768];

    @ObfuscatedName("dl.w")
    public static int[] field1474;

    @ObfuscatedName("dl.a")
    public static int[] field1476;

    @ObfuscatedName("dl.z")
    public static int[] field1463;

    @ObfuscatedName("dl.y")
    public static int[] field1478;

    @ObfuscatedName("dl.u")
    public static int[] field1471;

    @ObfuscatedName("dl.f")
    public static int[] field1480;

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
        field1476 = new int[5];
        field1463 = new int[5];
        field1478 = new int[5];
        field1471 = new int[5];
        field1480 = new int[5];
    }

    @ObfuscatedName("dl.c(II)[I")
    public final int[] method2231(int arg0, int arg1) {
        class196.method3575(field1472, 0, arg0);
        if (arg1 < 10) {
            return field1472;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1466.method2029();
        this.field1460.method2029();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1467 != null) {
            this.field1467.method2029();
            this.field1458.method2029();
            var5 = (int) ((double) (this.field1467.field1383 - this.field1467.field1382) * 32.768D / var3);
            var6 = (int) ((double) this.field1467.field1382 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1459 != null) {
            this.field1459.method2029();
            this.field1456.method2029();
            var8 = (int) ((double) (this.field1459.field1383 - this.field1459.field1382) * 32.768D / var3);
            var9 = (int) ((double) this.field1459.field1382 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1464[var11] != 0) {
                field1476[var11] = 0;
                field1463[var11] = (int) ((double) this.field1465[var11] * var3);
                field1478[var11] = (this.field1464[var11] << 14) / 100;
                field1471[var11] = (int) ((double) (this.field1466.field1383 - this.field1466.field1382) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1479[var11]) / var3);
                field1480[var11] = (int) ((double) this.field1466.field1382 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1466.method2031(arg0);
            int var14 = this.field1460.method2031(arg0);
            if (this.field1467 != null) {
                int var15 = this.field1467.method2031(arg0);
                int var16 = this.field1458.method2031(arg0);
                var13 += this.method2232(var7, var16, this.field1467.field1384) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1459 != null) {
                int var17 = this.field1459.method2031(arg0);
                int var18 = this.field1456.method2031(arg0);
                var14 = var14 * ((this.method2232(var10, var18, this.field1459.field1384) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1464[var19] != 0) {
                    int var20 = field1463[var19] + var12;
                    if (var20 < arg0) {
                        field1472[var20] += this.method2232(field1476[var19], field1478[var19] * var14 >> 15, this.field1466.field1384);
                        field1476[var19] += (field1471[var19] * var13 >> 16) + field1480[var19];
                    }
                }
            }
        }
        if (this.field1461 != null) {
            this.field1461.method2029();
            this.field1462.method2029();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1461.method2031(arg0);
                int var26 = this.field1462.method2031(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1461.field1383 - this.field1461.field1382) * var25 >> 8) + this.field1461.field1382;
                } else {
                    var27 = ((this.field1461.field1383 - this.field1461.field1382) * var26 >> 8) + this.field1461.field1382;
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
        if (this.field1477 > 0 && this.field1457 > 0) {
            int var28 = (int) ((double) this.field1477 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1472[var29] += field1472[var29 - var28] * this.field1457 / 100;
            }
        }
        if (this.field1468.field1439[0] > 0 || this.field1468.field1439[1] > 0) {
            this.field1469.method2029();
            int var30 = this.field1469.method2031(arg0 + 1);
            int var31 = this.field1468.method2216(0, (float) var30 / 65536.0F);
            int var32 = this.field1468.method2216(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1472[var31 + var33] * (long) Statics.field1442 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1472[var31 + var33 - 1 - var36] * (long) class107.field1436[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1472[var33 - 1 - var37] * (long) class107.field1436[1][var37] >> 16);
                    }
                    field1472[var33] = var35;
                    var30 = this.field1469.method2031(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1472[var31 + var33] * (long) Statics.field1442 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1472[var31 + var33 - 1 - var40] * (long) class107.field1436[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1472[var33 - 1 - var41] * (long) class107.field1436[1][var41] >> 16);
                        }
                        field1472[var33] = var39;
                        var30 = this.field1469.method2031(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1472[var31 + var33 - 1 - var43] * (long) class107.field1436[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1472[var33 - 1 - var44] * (long) class107.field1436[1][var44] >> 16);
                            }
                            field1472[var33] = var42;
                            this.field1469.method2031(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1468.method2216(0, (float) var30 / 65536.0F);
                    var32 = this.field1468.method2216(1, (float) var30 / 65536.0F);
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

    @ObfuscatedName("dl.q(III)I")
    public final int method2232(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("dl.m(Lgg;)V")
    public final void method2233(class185 arg0) {
        this.field1466 = new class99();
        this.field1466.method2028(arg0);
        this.field1460 = new class99();
        this.field1460.method2028(arg0);
        int var2 = arg0.method3243();
        if (var2 != 0) {
            arg0.field2386--;
            this.field1467 = new class99();
            this.field1467.method2028(arg0);
            this.field1458 = new class99();
            this.field1458.method2028(arg0);
        }
        int var3 = arg0.method3243();
        if (var3 != 0) {
            arg0.field2386--;
            this.field1459 = new class99();
            this.field1459.method2028(arg0);
            this.field1456 = new class99();
            this.field1456.method2028(arg0);
        }
        int var4 = arg0.method3243();
        if (var4 != 0) {
            arg0.field2386--;
            this.field1461 = new class99();
            this.field1461.method2028(arg0);
            this.field1462 = new class99();
            this.field1462.method2028(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3256();
            if (var6 == 0) {
                break;
            }
            this.field1464[var5] = var6;
            this.field1479[var5] = arg0.method3272();
            this.field1465[var5] = arg0.method3256();
        }
        this.field1477 = arg0.method3256();
        this.field1457 = arg0.method3256();
        this.field1470 = arg0.method3245();
        this.field1455 = arg0.method3245();
        this.field1468 = new class107();
        this.field1469 = new class99();
        this.field1468.method2217(arg0, this.field1469);
    }
}
