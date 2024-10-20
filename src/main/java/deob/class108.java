package deob;

import java.util.Random;

@ObfuscatedName("dn")
public class class108 {

    @ObfuscatedName("dn.z")
    public class97 field1401;

    @ObfuscatedName("dn.w")
    public class97 field1402;

    @ObfuscatedName("dn.s")
    public class97 field1393;

    @ObfuscatedName("dn.l")
    public class97 field1394;

    @ObfuscatedName("dn.u")
    public class97 field1395;

    @ObfuscatedName("dn.q")
    public class97 field1396;

    @ObfuscatedName("dn.k")
    public class97 field1397;

    @ObfuscatedName("dn.i")
    public class97 field1398;

    @ObfuscatedName("dn.x")
    public int[] field1407 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dn.e")
    public int[] field1416 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dn.p")
    public int[] field1413 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dn.b")
    public int field1399 = 0;

    @ObfuscatedName("dn.n")
    public int field1403 = 100;

    @ObfuscatedName("dn.f")
    public class105 field1404;

    @ObfuscatedName("dn.g")
    public class97 field1411;

    @ObfuscatedName("dn.m")
    public int field1405 = 500;

    @ObfuscatedName("dn.r")
    public int field1406 = 0;

    @ObfuscatedName("dn.t")
    public static int[] field1408;

    @ObfuscatedName("dn.o")
    public static int[] field1409 = new int[32768];

    @ObfuscatedName("dn.y")
    public static int[] field1410;

    @ObfuscatedName("dn.j")
    public static int[] field1391;

    @ObfuscatedName("dn.d")
    public static int[] field1400;

    @ObfuscatedName("dn.h")
    public static int[] field1414;

    @ObfuscatedName("dn.c")
    public static int[] field1415;

    @ObfuscatedName("dn.v")
    public static int[] field1412;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1409[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1410 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1410[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1408 = new int[220500];
        field1391 = new int[5];
        field1400 = new int[5];
        field1414 = new int[5];
        field1415 = new int[5];
        field1412 = new int[5];
    }

    @ObfuscatedName("dn.z(II)[I")
    public final int[] method2260(int arg0, int arg1) {
        class194.method3587(field1408, 0, arg0);
        if (arg1 < 10) {
            return field1408;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1401.method2042();
        this.field1402.method2042();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1393 != null) {
            this.field1393.method2042();
            this.field1394.method2042();
            var5 = (int) ((double) (this.field1393.field1319 - this.field1393.field1315) * 32.768D / var3);
            var6 = (int) ((double) this.field1393.field1315 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1395 != null) {
            this.field1395.method2042();
            this.field1396.method2042();
            var8 = (int) ((double) (this.field1395.field1319 - this.field1395.field1315) * 32.768D / var3);
            var9 = (int) ((double) this.field1395.field1315 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1407[var11] != 0) {
                field1391[var11] = 0;
                field1400[var11] = (int) ((double) this.field1413[var11] * var3);
                field1414[var11] = (this.field1407[var11] << 14) / 100;
                field1415[var11] = (int) ((double) (this.field1401.field1319 - this.field1401.field1315) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1416[var11]) / var3);
                field1412[var11] = (int) ((double) this.field1401.field1315 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1401.method2050(arg0);
            int var14 = this.field1402.method2050(arg0);
            if (this.field1393 != null) {
                int var15 = this.field1393.method2050(arg0);
                int var16 = this.field1394.method2050(arg0);
                var13 += this.method2263(var7, var16, this.field1393.field1318) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1395 != null) {
                int var17 = this.field1395.method2050(arg0);
                int var18 = this.field1396.method2050(arg0);
                var14 = var14 * ((this.method2263(var10, var18, this.field1395.field1318) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1407[var19] != 0) {
                    int var20 = field1400[var19] + var12;
                    if (var20 < arg0) {
                        field1408[var20] += this.method2263(field1391[var19], field1414[var19] * var14 >> 15, this.field1401.field1318);
                        field1391[var19] += (field1415[var19] * var13 >> 16) + field1412[var19];
                    }
                }
            }
        }
        if (this.field1397 != null) {
            this.field1397.method2042();
            this.field1398.method2042();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1397.method2050(arg0);
                int var26 = this.field1398.method2050(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1397.field1319 - this.field1397.field1315) * var25 >> 8) + this.field1397.field1315;
                } else {
                    var27 = ((this.field1397.field1319 - this.field1397.field1315) * var26 >> 8) + this.field1397.field1315;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1408[var24] = 0;
                }
            }
        }
        if (this.field1399 > 0 && this.field1403 > 0) {
            int var28 = (int) ((double) this.field1399 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1408[var29] += field1408[var29 - var28] * this.field1403 / 100;
            }
        }
        if (this.field1404.field1374[0] > 0 || this.field1404.field1374[1] > 0) {
            this.field1411.method2042();
            int var30 = this.field1411.method2050(arg0 + 1);
            int var31 = this.field1404.method2251(0, (float) var30 / 65536.0F);
            int var32 = this.field1404.method2251(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1408[var31 + var33] * (long) Statics.field1379 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1408[var31 + var33 - 1 - var36] * (long) class105.field1377[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1408[var33 - 1 - var37] * (long) class105.field1377[1][var37] >> 16);
                    }
                    field1408[var33] = var35;
                    var30 = this.field1411.method2050(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1408[var31 + var33] * (long) Statics.field1379 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1408[var31 + var33 - 1 - var40] * (long) class105.field1377[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1408[var33 - 1 - var41] * (long) class105.field1377[1][var41] >> 16);
                        }
                        field1408[var33] = var39;
                        var30 = this.field1411.method2050(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1408[var31 + var33 - 1 - var43] * (long) class105.field1377[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1408[var33 - 1 - var44] * (long) class105.field1377[1][var44] >> 16);
                            }
                            field1408[var33] = var42;
                            this.field1411.method2050(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1404.method2251(0, (float) var30 / 65536.0F);
                    var32 = this.field1404.method2251(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1408[var46] < -32768) {
                field1408[var46] = -32768;
            }
            if (field1408[var46] > 32767) {
                field1408[var46] = 32767;
            }
        }
        return field1408;
    }

    @ObfuscatedName("dn.w(III)I")
    public final int method2263(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1410[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1409[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dn.s(Lgk;)V")
    public final void method2262(class183 arg0) {
        this.field1401 = new class97();
        this.field1401.method2043(arg0);
        this.field1402 = new class97();
        this.field1402.method2043(arg0);
        int var2 = arg0.method3247();
        if (var2 != 0) {
            arg0.field2340--;
            this.field1393 = new class97();
            this.field1393.method2043(arg0);
            this.field1394 = new class97();
            this.field1394.method2043(arg0);
        }
        int var3 = arg0.method3247();
        if (var3 != 0) {
            arg0.field2340--;
            this.field1395 = new class97();
            this.field1395.method2043(arg0);
            this.field1396 = new class97();
            this.field1396.method2043(arg0);
        }
        int var4 = arg0.method3247();
        if (var4 != 0) {
            arg0.field2340--;
            this.field1397 = new class97();
            this.field1397.method2043(arg0);
            this.field1398 = new class97();
            this.field1398.method2043(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3265();
            if (var6 == 0) {
                break;
            }
            this.field1407[var5] = var6;
            this.field1416[var5] = arg0.method3264();
            this.field1413[var5] = arg0.method3265();
        }
        this.field1399 = arg0.method3265();
        this.field1403 = arg0.method3265();
        this.field1405 = arg0.method3253();
        this.field1406 = arg0.method3253();
        this.field1404 = new class105();
        this.field1411 = new class97();
        this.field1404.method2248(arg0, this.field1411);
    }
}
