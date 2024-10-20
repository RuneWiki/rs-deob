package deob;

import java.util.Random;

@ObfuscatedName("dn")
public class class118 {

    @ObfuscatedName("dn.s")
    public class107 field1499;

    @ObfuscatedName("dn.j")
    public class107 field1486;

    @ObfuscatedName("dn.i")
    public class107 field1488;

    @ObfuscatedName("dn.k")
    public class107 field1489;

    @ObfuscatedName("dn.u")
    public class107 field1490;

    @ObfuscatedName("dn.n")
    public class107 field1491;

    @ObfuscatedName("dn.t")
    public class107 field1492;

    @ObfuscatedName("dn.q")
    public class107 field1487;

    @ObfuscatedName("dn.x")
    public int[] field1494 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dn.d")
    public int[] field1500 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dn.f")
    public int[] field1504 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dn.c")
    public int field1497 = 0;

    @ObfuscatedName("dn.r")
    public int field1498 = 100;

    @ObfuscatedName("dn.y")
    public class115 field1501;

    @ObfuscatedName("dn.p")
    public class107 field1493;

    @ObfuscatedName("dn.b")
    public int field1510 = 500;

    @ObfuscatedName("dn.g")
    public int field1502 = 0;

    @ObfuscatedName("dn.e")
    public static int[] field1495;

    @ObfuscatedName("dn.z")
    public static int[] field1496 = new int[32768];

    @ObfuscatedName("dn.a")
    public static int[] field1505;

    @ObfuscatedName("dn.l")
    public static int[] field1507;

    @ObfuscatedName("dn.h")
    public static int[] field1508;

    @ObfuscatedName("dn.v")
    public static int[] field1509;

    @ObfuscatedName("dn.m")
    public static int[] field1503;

    @ObfuscatedName("dn.o")
    public static int[] field1511;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1496[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1505 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1505[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1495 = new int[220500];
        field1507 = new int[5];
        field1508 = new int[5];
        field1509 = new int[5];
        field1503 = new int[5];
        field1511 = new int[5];
    }

    @ObfuscatedName("dn.s(II)[I")
    public final int[] method2479(int arg0, int arg1) {
        class301.method5283(field1495, 0, arg0);
        if (arg1 < 10) {
            return field1495;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1499.method2252();
        this.field1486.method2252();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1488 != null) {
            this.field1488.method2252();
            this.field1489.method2252();
            var5 = (int) ((double) (this.field1488.field1407 - this.field1488.field1404) * 32.768D / var3);
            var6 = (int) ((double) this.field1488.field1404 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1490 != null) {
            this.field1490.method2252();
            this.field1491.method2252();
            var8 = (int) ((double) (this.field1490.field1407 - this.field1490.field1404) * 32.768D / var3);
            var9 = (int) ((double) this.field1490.field1404 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1494[var11] != 0) {
                field1507[var11] = 0;
                field1508[var11] = (int) ((double) this.field1504[var11] * var3);
                field1509[var11] = (this.field1494[var11] << 14) / 100;
                field1503[var11] = (int) ((double) (this.field1499.field1407 - this.field1499.field1404) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1500[var11]) / var3);
                field1511[var11] = (int) ((double) this.field1499.field1404 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1499.method2251(arg0);
            int var14 = this.field1486.method2251(arg0);
            if (this.field1488 != null) {
                int var15 = this.field1488.method2251(arg0);
                int var16 = this.field1489.method2251(arg0);
                var13 += this.method2480(var7, var16, this.field1488.field1406) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1490 != null) {
                int var17 = this.field1490.method2251(arg0);
                int var18 = this.field1491.method2251(arg0);
                var14 = var14 * ((this.method2480(var10, var18, this.field1490.field1406) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1494[var19] != 0) {
                    int var20 = field1508[var19] + var12;
                    if (var20 < arg0) {
                        field1495[var20] += this.method2480(field1507[var19], field1509[var19] * var14 >> 15, this.field1499.field1406);
                        field1507[var19] += (field1503[var19] * var13 >> 16) + field1511[var19];
                    }
                }
            }
        }
        if (this.field1492 != null) {
            this.field1492.method2252();
            this.field1487.method2252();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1492.method2251(arg0);
                int var26 = this.field1487.method2251(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1492.field1407 - this.field1492.field1404) * var25 >> 8) + this.field1492.field1404;
                } else {
                    var27 = ((this.field1492.field1407 - this.field1492.field1404) * var26 >> 8) + this.field1492.field1404;
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
        if (this.field1497 > 0 && this.field1498 > 0) {
            int var28 = (int) ((double) this.field1497 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1495[var29] += field1495[var29 - var28] * this.field1498 / 100;
            }
        }
        if (this.field1501.field1472[0] > 0 || this.field1501.field1472[1] > 0) {
            this.field1493.method2252();
            int var30 = this.field1493.method2251(arg0 + 1);
            int var31 = this.field1501.method2460(0, (float) var30 / 65536.0F);
            int var32 = this.field1501.method2460(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1495[var31 + var33] * (long) Statics.field1474 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1495[var31 + var33 - 1 - var36] * (long) class115.field1467[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1495[var33 - 1 - var37] * (long) class115.field1467[1][var37] >> 16);
                    }
                    field1495[var33] = var35;
                    var30 = this.field1493.method2251(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1495[var31 + var33] * (long) Statics.field1474 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1495[var31 + var33 - 1 - var40] * (long) class115.field1467[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1495[var33 - 1 - var41] * (long) class115.field1467[1][var41] >> 16);
                        }
                        field1495[var33] = var39;
                        var30 = this.field1493.method2251(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1495[var31 + var33 - 1 - var43] * (long) class115.field1467[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1495[var33 - 1 - var44] * (long) class115.field1467[1][var44] >> 16);
                            }
                            field1495[var33] = var42;
                            this.field1493.method2251(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1501.method2460(0, (float) var30 / 65536.0F);
                    var32 = this.field1501.method2460(1, (float) var30 / 65536.0F);
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

    @ObfuscatedName("dn.j(III)I")
    public final int method2480(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1505[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1496[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dn.i(Lky;)V")
    public final void method2478(class300 arg0) {
        this.field1499 = new class107();
        this.field1499.method2256(arg0);
        this.field1486 = new class107();
        this.field1486.method2256(arg0);
        int var2 = arg0.method5179();
        if (var2 != 0) {
            arg0.field3704--;
            this.field1488 = new class107();
            this.field1488.method2256(arg0);
            this.field1489 = new class107();
            this.field1489.method2256(arg0);
        }
        int var3 = arg0.method5179();
        if (var3 != 0) {
            arg0.field3704--;
            this.field1490 = new class107();
            this.field1490.method2256(arg0);
            this.field1491 = new class107();
            this.field1491.method2256(arg0);
        }
        int var4 = arg0.method5179();
        if (var4 != 0) {
            arg0.field3704--;
            this.field1492 = new class107();
            this.field1492.method2256(arg0);
            this.field1487 = new class107();
            this.field1487.method2256(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method5113();
            if (var6 == 0) {
                break;
            }
            this.field1494[var5] = var6;
            this.field1500[var5] = arg0.method5064();
            this.field1504[var5] = arg0.method5113();
        }
        this.field1497 = arg0.method5113();
        this.field1498 = arg0.method5113();
        this.field1510 = arg0.method5054();
        this.field1502 = arg0.method5054();
        this.field1501 = new class115();
        this.field1493 = new class107();
        this.field1501.method2472(arg0, this.field1493);
    }
}
