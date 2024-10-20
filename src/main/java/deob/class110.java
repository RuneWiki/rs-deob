package deob;

import java.util.Random;

@ObfuscatedName("ds")
public class class110 {

    @ObfuscatedName("ds.v")
    public class99 field1443;

    @ObfuscatedName("ds.s")
    public class99 field1441;

    @ObfuscatedName("ds.o")
    public class99 field1442;

    @ObfuscatedName("ds.k")
    public class99 field1457;

    @ObfuscatedName("ds.u")
    public class99 field1440;

    @ObfuscatedName("ds.i")
    public class99 field1445;

    @ObfuscatedName("ds.t")
    public class99 field1446;

    @ObfuscatedName("ds.p")
    public class99 field1447;

    @ObfuscatedName("ds.l")
    public int[] field1461 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("ds.b")
    public int[] field1449 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("ds.c")
    public int[] field1450 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("ds.d")
    public int field1451 = 0;

    @ObfuscatedName("ds.w")
    public int field1452 = 100;

    @ObfuscatedName("ds.a")
    public class107 field1453;

    @ObfuscatedName("ds.z")
    public class99 field1444;

    @ObfuscatedName("ds.e")
    public int field1455 = 500;

    @ObfuscatedName("ds.q")
    public int field1456 = 0;

    @ObfuscatedName("ds.j")
    public static int[] field1448;

    @ObfuscatedName("ds.y")
    public static int[] field1464 = new int[32768];

    @ObfuscatedName("ds.m")
    public static int[] field1465;

    @ObfuscatedName("ds.x")
    public static int[] field1454;

    @ObfuscatedName("ds.f")
    public static int[] field1462;

    @ObfuscatedName("ds.r")
    public static int[] field1463;

    @ObfuscatedName("ds.n")
    public static int[] field1459;

    @ObfuscatedName("ds.g")
    public static int[] field1458;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1464[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1465 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1465[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1448 = new int[220500];
        field1454 = new int[5];
        field1462 = new int[5];
        field1463 = new int[5];
        field1459 = new int[5];
        field1458 = new int[5];
    }

    @ObfuscatedName("ds.v(II)[I")
    public final int[] method2289(int arg0, int arg1) {
        class196.method3611(field1448, 0, arg0);
        if (arg1 < 10) {
            return field1448;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1443.method2076();
        this.field1441.method2076();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1442 != null) {
            this.field1442.method2076();
            this.field1457.method2076();
            var5 = (int) ((double) (this.field1442.field1370 - this.field1442.field1368) * 32.768D / var3);
            var6 = (int) ((double) this.field1442.field1368 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1440 != null) {
            this.field1440.method2076();
            this.field1445.method2076();
            var8 = (int) ((double) (this.field1440.field1370 - this.field1440.field1368) * 32.768D / var3);
            var9 = (int) ((double) this.field1440.field1368 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1461[var11] != 0) {
                field1454[var11] = 0;
                field1462[var11] = (int) ((double) this.field1450[var11] * var3);
                field1463[var11] = (this.field1461[var11] << 14) / 100;
                field1459[var11] = (int) ((double) (this.field1443.field1370 - this.field1443.field1368) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1449[var11]) / var3);
                field1458[var11] = (int) ((double) this.field1443.field1368 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1443.method2081(arg0);
            int var14 = this.field1441.method2081(arg0);
            if (this.field1442 != null) {
                int var15 = this.field1442.method2081(arg0);
                int var16 = this.field1457.method2081(arg0);
                var13 += this.method2290(var7, var16, this.field1442.field1371) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1440 != null) {
                int var17 = this.field1440.method2081(arg0);
                int var18 = this.field1445.method2081(arg0);
                var14 = var14 * ((this.method2290(var10, var18, this.field1440.field1371) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1461[var19] != 0) {
                    int var20 = field1462[var19] + var12;
                    if (var20 < arg0) {
                        field1448[var20] += this.method2290(field1454[var19], field1463[var19] * var14 >> 15, this.field1443.field1371);
                        field1454[var19] += (field1459[var19] * var13 >> 16) + field1458[var19];
                    }
                }
            }
        }
        if (this.field1446 != null) {
            this.field1446.method2076();
            this.field1447.method2076();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1446.method2081(arg0);
                int var26 = this.field1447.method2081(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1446.field1370 - this.field1446.field1368) * var25 >> 8) + this.field1446.field1368;
                } else {
                    var27 = ((this.field1446.field1370 - this.field1446.field1368) * var26 >> 8) + this.field1446.field1368;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1448[var24] = 0;
                }
            }
        }
        if (this.field1451 > 0 && this.field1452 > 0) {
            int var28 = (int) ((double) this.field1451 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1448[var29] += field1448[var29 - var28] * this.field1452 / 100;
            }
        }
        if (this.field1453.field1424[0] > 0 || this.field1453.field1424[1] > 0) {
            this.field1444.method2076();
            int var30 = this.field1444.method2081(arg0 + 1);
            int var31 = this.field1453.method2276(0, (float) var30 / 65536.0F);
            int var32 = this.field1453.method2276(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1448[var31 + var33] * (long) Statics.field1428 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1448[var31 + var33 - 1 - var36] * (long) class107.field1426[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1448[var33 - 1 - var37] * (long) class107.field1426[1][var37] >> 16);
                    }
                    field1448[var33] = var35;
                    var30 = this.field1444.method2081(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1448[var31 + var33] * (long) Statics.field1428 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1448[var31 + var33 - 1 - var40] * (long) class107.field1426[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1448[var33 - 1 - var41] * (long) class107.field1426[1][var41] >> 16);
                        }
                        field1448[var33] = var39;
                        var30 = this.field1444.method2081(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1448[var31 + var33 - 1 - var43] * (long) class107.field1426[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1448[var33 - 1 - var44] * (long) class107.field1426[1][var44] >> 16);
                            }
                            field1448[var33] = var42;
                            this.field1444.method2081(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1453.method2276(0, (float) var30 / 65536.0F);
                    var32 = this.field1453.method2276(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1448[var46] < -32768) {
                field1448[var46] = -32768;
            }
            if (field1448[var46] > 32767) {
                field1448[var46] = 32767;
            }
        }
        return field1448;
    }

    @ObfuscatedName("ds.s(III)I")
    public final int method2290(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1465[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1464[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ds.o(Lgx;)V")
    public final void method2291(class185 arg0) {
        this.field1443 = new class99();
        this.field1443.method2074(arg0);
        this.field1441 = new class99();
        this.field1441.method2074(arg0);
        int var2 = arg0.method3274();
        if (var2 != 0) {
            arg0.field2386--;
            this.field1442 = new class99();
            this.field1442.method2074(arg0);
            this.field1457 = new class99();
            this.field1457.method2074(arg0);
        }
        int var3 = arg0.method3274();
        if (var3 != 0) {
            arg0.field2386--;
            this.field1440 = new class99();
            this.field1440.method2074(arg0);
            this.field1445 = new class99();
            this.field1445.method2074(arg0);
        }
        int var4 = arg0.method3274();
        if (var4 != 0) {
            arg0.field2386--;
            this.field1446 = new class99();
            this.field1446.method2074(arg0);
            this.field1447 = new class99();
            this.field1447.method2074(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3288();
            if (var6 == 0) {
                break;
            }
            this.field1461[var5] = var6;
            this.field1449[var5] = arg0.method3414();
            this.field1450[var5] = arg0.method3288();
        }
        this.field1451 = arg0.method3288();
        this.field1452 = arg0.method3288();
        this.field1455 = arg0.method3276();
        this.field1456 = arg0.method3276();
        this.field1453 = new class107();
        this.field1444 = new class99();
        this.field1453.method2277(arg0, this.field1444);
    }
}
