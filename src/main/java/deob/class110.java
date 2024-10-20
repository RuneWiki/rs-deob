package deob;

import java.util.Random;

@ObfuscatedName("dw")
public class class110 {

    @ObfuscatedName("dw.y")
    public class99 field1462;

    @ObfuscatedName("dw.c")
    public class99 field1441;

    @ObfuscatedName("dw.n")
    public class99 field1442;

    @ObfuscatedName("dw.u")
    public class99 field1443;

    @ObfuscatedName("dw.i")
    public class99 field1445;

    @ObfuscatedName("dw.r")
    public class99 field1452;

    @ObfuscatedName("dw.j")
    public class99 field1446;

    @ObfuscatedName("dw.p")
    public class99 field1447;

    @ObfuscatedName("dw.e")
    public int[] field1451 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dw.s")
    public int[] field1453 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dw.v")
    public int[] field1450 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dw.k")
    public int field1460 = 0;

    @ObfuscatedName("dw.o")
    public int field1449 = 100;

    @ObfuscatedName("dw.q")
    public class107 field1459;

    @ObfuscatedName("dw.l")
    public class99 field1454;

    @ObfuscatedName("dw.f")
    public int field1455 = 500;

    @ObfuscatedName("dw.z")
    public int field1456 = 0;

    @ObfuscatedName("dw.a")
    public static int[] field1457;

    @ObfuscatedName("dw.x")
    public static int[] field1458 = new int[32768];

    @ObfuscatedName("dw.b")
    public static int[] field1448;

    @ObfuscatedName("dw.g")
    public static int[] field1461;

    @ObfuscatedName("dw.d")
    public static int[] field1444;

    @ObfuscatedName("dw.m")
    public static int[] field1463;

    @ObfuscatedName("dw.t")
    public static int[] field1464;

    @ObfuscatedName("dw.h")
    public static int[] field1465;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1458[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1448 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1448[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1457 = new int[220500];
        field1461 = new int[5];
        field1444 = new int[5];
        field1463 = new int[5];
        field1464 = new int[5];
        field1465 = new int[5];
    }

    @ObfuscatedName("dw.y(II)[I")
    public final int[] method2274(int arg0, int arg1) {
        class196.method3612(field1457, 0, arg0);
        if (arg1 < 10) {
            return field1457;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1462.method2078();
        this.field1441.method2078();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1442 != null) {
            this.field1442.method2078();
            this.field1443.method2078();
            var5 = (int) ((double) (this.field1442.field1381 - this.field1442.field1377) * 32.768D / var3);
            var6 = (int) ((double) this.field1442.field1377 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1445 != null) {
            this.field1445.method2078();
            this.field1452.method2078();
            var8 = (int) ((double) (this.field1445.field1381 - this.field1445.field1377) * 32.768D / var3);
            var9 = (int) ((double) this.field1445.field1377 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1451[var11] != 0) {
                field1461[var11] = 0;
                field1444[var11] = (int) ((double) this.field1450[var11] * var3);
                field1463[var11] = (this.field1451[var11] << 14) / 100;
                field1464[var11] = (int) ((double) (this.field1462.field1381 - this.field1462.field1377) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1453[var11]) / var3);
                field1465[var11] = (int) ((double) this.field1462.field1377 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1462.method2070(arg0);
            int var14 = this.field1441.method2070(arg0);
            if (this.field1442 != null) {
                int var15 = this.field1442.method2070(arg0);
                int var16 = this.field1443.method2070(arg0);
                var13 += this.method2280(var7, var16, this.field1442.field1376) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1445 != null) {
                int var17 = this.field1445.method2070(arg0);
                int var18 = this.field1452.method2070(arg0);
                var14 = var14 * ((this.method2280(var10, var18, this.field1445.field1376) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1451[var19] != 0) {
                    int var20 = field1444[var19] + var12;
                    if (var20 < arg0) {
                        field1457[var20] += this.method2280(field1461[var19], field1463[var19] * var14 >> 15, this.field1462.field1376);
                        field1461[var19] += (field1464[var19] * var13 >> 16) + field1465[var19];
                    }
                }
            }
        }
        if (this.field1446 != null) {
            this.field1446.method2078();
            this.field1447.method2078();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1446.method2070(arg0);
                int var26 = this.field1447.method2070(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1446.field1381 - this.field1446.field1377) * var25 >> 8) + this.field1446.field1377;
                } else {
                    var27 = ((this.field1446.field1381 - this.field1446.field1377) * var26 >> 8) + this.field1446.field1377;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1457[var24] = 0;
                }
            }
        }
        if (this.field1460 > 0 && this.field1449 > 0) {
            int var28 = (int) ((double) this.field1460 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1457[var29] += field1457[var29 - var28] * this.field1449 / 100;
            }
        }
        if (this.field1459.field1429[0] > 0 || this.field1459.field1429[1] > 0) {
            this.field1454.method2078();
            int var30 = this.field1454.method2070(arg0 + 1);
            int var31 = this.field1459.method2260(0, (float) var30 / 65536.0F);
            int var32 = this.field1459.method2260(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1457[var31 + var33] * (long) Statics.field1426 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1457[var31 + var33 - 1 - var36] * (long) class107.field1420[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1457[var33 - 1 - var37] * (long) class107.field1420[1][var37] >> 16);
                    }
                    field1457[var33] = var35;
                    var30 = this.field1454.method2070(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1457[var31 + var33] * (long) Statics.field1426 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1457[var31 + var33 - 1 - var40] * (long) class107.field1420[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1457[var33 - 1 - var41] * (long) class107.field1420[1][var41] >> 16);
                        }
                        field1457[var33] = var39;
                        var30 = this.field1454.method2070(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1457[var31 + var33 - 1 - var43] * (long) class107.field1420[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1457[var33 - 1 - var44] * (long) class107.field1420[1][var44] >> 16);
                            }
                            field1457[var33] = var42;
                            this.field1454.method2070(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1459.method2260(0, (float) var30 / 65536.0F);
                    var32 = this.field1459.method2260(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1457[var46] < -32768) {
                field1457[var46] = -32768;
            }
            if (field1457[var46] > 32767) {
                field1457[var46] = 32767;
            }
        }
        return field1457;
    }

    @ObfuscatedName("dw.c(III)I")
    public final int method2280(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1448[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1458[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dw.n(Lge;)V")
    public final void method2276(class185 arg0) {
        this.field1462 = new class99();
        this.field1462.method2071(arg0);
        this.field1441 = new class99();
        this.field1441.method2071(arg0);
        int var2 = arg0.method3299();
        if (var2 != 0) {
            arg0.field2374--;
            this.field1442 = new class99();
            this.field1442.method2071(arg0);
            this.field1443 = new class99();
            this.field1443.method2071(arg0);
        }
        int var3 = arg0.method3299();
        if (var3 != 0) {
            arg0.field2374--;
            this.field1445 = new class99();
            this.field1445.method2071(arg0);
            this.field1452 = new class99();
            this.field1452.method2071(arg0);
        }
        int var4 = arg0.method3299();
        if (var4 != 0) {
            arg0.field2374--;
            this.field1446 = new class99();
            this.field1446.method2071(arg0);
            this.field1447 = new class99();
            this.field1447.method2071(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3356();
            if (var6 == 0) {
                break;
            }
            this.field1451[var5] = var6;
            this.field1453[var5] = arg0.method3436();
            this.field1450[var5] = arg0.method3356();
        }
        this.field1460 = arg0.method3356();
        this.field1449 = arg0.method3356();
        this.field1455 = arg0.method3280();
        this.field1456 = arg0.method3280();
        this.field1459 = new class107();
        this.field1454 = new class99();
        this.field1459.method2259(arg0, this.field1454);
    }
}
