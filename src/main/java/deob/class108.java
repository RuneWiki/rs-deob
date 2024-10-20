package deob;

import java.util.Random;

@ObfuscatedName("dg")
public class class108 {

    @ObfuscatedName("dg.w")
    public class97 field1426;

    @ObfuscatedName("dg.m")
    public class97 field1416;

    @ObfuscatedName("dg.q")
    public class97 field1417;

    @ObfuscatedName("dg.b")
    public class97 field1433;

    @ObfuscatedName("dg.f")
    public class97 field1419;

    @ObfuscatedName("dg.n")
    public class97 field1420;

    @ObfuscatedName("dg.h")
    public class97 field1421;

    @ObfuscatedName("dg.x")
    public class97 field1422;

    @ObfuscatedName("dg.j")
    public int[] field1423 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dg.a")
    public int[] field1424 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dg.l")
    public int[] field1415 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dg.d")
    public int field1430 = 0;

    @ObfuscatedName("dg.s")
    public int field1427 = 100;

    @ObfuscatedName("dg.p")
    public class105 field1428;

    @ObfuscatedName("dg.g")
    public class97 field1418;

    @ObfuscatedName("dg.y")
    public int field1425 = 500;

    @ObfuscatedName("dg.c")
    public int field1431 = 0;

    @ObfuscatedName("dg.e")
    public static int[] field1432;

    @ObfuscatedName("dg.t")
    public static int[] field1436 = new int[32768];

    @ObfuscatedName("dg.u")
    public static int[] field1434;

    @ObfuscatedName("dg.z")
    public static int[] field1429;

    @ObfuscatedName("dg.k")
    public static int[] field1437;

    @ObfuscatedName("dg.r")
    public static int[] field1438;

    @ObfuscatedName("dg.v")
    public static int[] field1439;

    @ObfuscatedName("dg.o")
    public static int[] field1440;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1436[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1434 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1434[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1432 = new int[220500];
        field1429 = new int[5];
        field1437 = new int[5];
        field1438 = new int[5];
        field1439 = new int[5];
        field1440 = new int[5];
    }

    @ObfuscatedName("dg.w(II)[I")
    public final int[] method2297(int arg0, int arg1) {
        class194.method3619(field1432, 0, arg0);
        if (arg1 < 10) {
            return field1432;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1426.method2085();
        this.field1416.method2085();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1417 != null) {
            this.field1417.method2085();
            this.field1433.method2085();
            var5 = (int) ((double) (this.field1417.field1349 - this.field1417.field1347) * 32.768D / var3);
            var6 = (int) ((double) this.field1417.field1347 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1419 != null) {
            this.field1419.method2085();
            this.field1420.method2085();
            var8 = (int) ((double) (this.field1419.field1349 - this.field1419.field1347) * 32.768D / var3);
            var9 = (int) ((double) this.field1419.field1347 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1423[var11] != 0) {
                field1429[var11] = 0;
                field1437[var11] = (int) ((double) this.field1415[var11] * var3);
                field1438[var11] = (this.field1423[var11] << 14) / 100;
                field1439[var11] = (int) ((double) (this.field1426.field1349 - this.field1426.field1347) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1424[var11]) / var3);
                field1440[var11] = (int) ((double) this.field1426.field1347 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1426.method2088(arg0);
            int var14 = this.field1416.method2088(arg0);
            if (this.field1417 != null) {
                int var15 = this.field1417.method2088(arg0);
                int var16 = this.field1433.method2088(arg0);
                var13 += this.method2299(var7, var16, this.field1417.field1354) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1419 != null) {
                int var17 = this.field1419.method2088(arg0);
                int var18 = this.field1420.method2088(arg0);
                var14 = var14 * ((this.method2299(var10, var18, this.field1419.field1354) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1423[var19] != 0) {
                    int var20 = field1437[var19] + var12;
                    if (var20 < arg0) {
                        field1432[var20] += this.method2299(field1429[var19], field1438[var19] * var14 >> 15, this.field1426.field1354);
                        field1429[var19] += (field1439[var19] * var13 >> 16) + field1440[var19];
                    }
                }
            }
        }
        if (this.field1421 != null) {
            this.field1421.method2085();
            this.field1422.method2085();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1421.method2088(arg0);
                int var26 = this.field1422.method2088(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1421.field1349 - this.field1421.field1347) * var25 >> 8) + this.field1421.field1347;
                } else {
                    var27 = ((this.field1421.field1349 - this.field1421.field1347) * var26 >> 8) + this.field1421.field1347;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1432[var24] = 0;
                }
            }
        }
        if (this.field1430 > 0 && this.field1427 > 0) {
            int var28 = (int) ((double) this.field1430 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1432[var29] += field1432[var29 - var28] * this.field1427 / 100;
            }
        }
        if (this.field1428.field1398[0] > 0 || this.field1428.field1398[1] > 0) {
            this.field1418.method2085();
            int var30 = this.field1418.method2088(arg0 + 1);
            int var31 = this.field1428.method2279(0, (float) var30 / 65536.0F);
            int var32 = this.field1428.method2279(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1432[var31 + var33] * (long) Statics.field1403 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1432[var31 + var33 - 1 - var36] * (long) class105.field1405[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1432[var33 - 1 - var37] * (long) class105.field1405[1][var37] >> 16);
                    }
                    field1432[var33] = var35;
                    var30 = this.field1418.method2088(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1432[var31 + var33] * (long) Statics.field1403 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1432[var31 + var33 - 1 - var40] * (long) class105.field1405[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1432[var33 - 1 - var41] * (long) class105.field1405[1][var41] >> 16);
                        }
                        field1432[var33] = var39;
                        var30 = this.field1418.method2088(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1432[var31 + var33 - 1 - var43] * (long) class105.field1405[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1432[var33 - 1 - var44] * (long) class105.field1405[1][var44] >> 16);
                            }
                            field1432[var33] = var42;
                            this.field1418.method2088(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1428.method2279(0, (float) var30 / 65536.0F);
                    var32 = this.field1428.method2279(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1432[var46] < -32768) {
                field1432[var46] = -32768;
            }
            if (field1432[var46] > 32767) {
                field1432[var46] = 32767;
            }
        }
        return field1432;
    }

    @ObfuscatedName("dg.m(III)I")
    public final int method2299(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1434[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1436[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dg.q(Lgy;)V")
    public final void method2300(class183 arg0) {
        this.field1426 = new class97();
        this.field1426.method2092(arg0);
        this.field1416 = new class97();
        this.field1416.method2092(arg0);
        int var2 = arg0.method3436();
        if (var2 != 0) {
            arg0.field2360--;
            this.field1417 = new class97();
            this.field1417.method2092(arg0);
            this.field1433 = new class97();
            this.field1433.method2092(arg0);
        }
        int var3 = arg0.method3436();
        if (var3 != 0) {
            arg0.field2360--;
            this.field1419 = new class97();
            this.field1419.method2092(arg0);
            this.field1420 = new class97();
            this.field1420.method2092(arg0);
        }
        int var4 = arg0.method3436();
        if (var4 != 0) {
            arg0.field2360--;
            this.field1421 = new class97();
            this.field1421.method2092(arg0);
            this.field1422 = new class97();
            this.field1422.method2092(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3293();
            if (var6 == 0) {
                break;
            }
            this.field1423[var5] = var6;
            this.field1424[var5] = arg0.method3275();
            this.field1415[var5] = arg0.method3293();
        }
        this.field1430 = arg0.method3293();
        this.field1427 = arg0.method3293();
        this.field1425 = arg0.method3268();
        this.field1431 = arg0.method3268();
        this.field1428 = new class105();
        this.field1418 = new class97();
        this.field1428.method2281(arg0, this.field1418);
    }
}
