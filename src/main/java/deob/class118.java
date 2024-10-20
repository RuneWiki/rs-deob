package deob;

import java.util.Random;

@ObfuscatedName("dr")
public class class118 {

    @ObfuscatedName("dr.u")
    public class107 field1504;

    @ObfuscatedName("dr.f")
    public class107 field1493;

    @ObfuscatedName("dr.b")
    public class107 field1506;

    @ObfuscatedName("dr.g")
    public class107 field1495;

    @ObfuscatedName("dr.z")
    public class107 field1496;

    @ObfuscatedName("dr.p")
    public class107 field1497;

    @ObfuscatedName("dr.h")
    public class107 field1498;

    @ObfuscatedName("dr.y")
    public class107 field1501;

    @ObfuscatedName("dr.w")
    public int[] field1492 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dr.i")
    public int[] field1511 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dr.k")
    public int[] field1499 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dr.x")
    public int field1503 = 0;

    @ObfuscatedName("dr.o")
    public int field1502 = 100;

    @ObfuscatedName("dr.e")
    public class115 field1505;

    @ObfuscatedName("dr.n")
    public class107 field1516;

    @ObfuscatedName("dr.r")
    public int field1507 = 500;

    @ObfuscatedName("dr.c")
    public int field1508 = 0;

    @ObfuscatedName("dr.a")
    public static int[] field1512;

    @ObfuscatedName("dr.d")
    public static int[] field1510 = new int[32768];

    @ObfuscatedName("dr.s")
    public static int[] field1500;

    @ObfuscatedName("dr.m")
    public static int[] field1513;

    @ObfuscatedName("dr.v")
    public static int[] field1514;

    @ObfuscatedName("dr.q")
    public static int[] field1509;

    @ObfuscatedName("dr.l")
    public static int[] field1494;

    @ObfuscatedName("dr.j")
    public static int[] field1517;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1510[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1500 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1500[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1512 = new int[220500];
        field1513 = new int[5];
        field1514 = new int[5];
        field1509 = new int[5];
        field1494 = new int[5];
        field1517 = new int[5];
    }

    @ObfuscatedName("dr.u(II)[I")
    public final int[] method2503(int arg0, int arg1) {
        class301.method5367(field1512, 0, arg0);
        if (arg1 < 10) {
            return field1512;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1504.method2284();
        this.field1493.method2284();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1506 != null) {
            this.field1506.method2284();
            this.field1495.method2284();
            var5 = (int) ((double) (this.field1506.field1425 - this.field1506.field1415) * 32.768D / var3);
            var6 = (int) ((double) this.field1506.field1415 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1496 != null) {
            this.field1496.method2284();
            this.field1497.method2284();
            var8 = (int) ((double) (this.field1496.field1425 - this.field1496.field1415) * 32.768D / var3);
            var9 = (int) ((double) this.field1496.field1415 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1492[var11] != 0) {
                field1513[var11] = 0;
                field1514[var11] = (int) ((double) this.field1499[var11] * var3);
                field1509[var11] = (this.field1492[var11] << 14) / 100;
                field1494[var11] = (int) ((double) (this.field1504.field1425 - this.field1504.field1415) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1511[var11]) / var3);
                field1517[var11] = (int) ((double) this.field1504.field1415 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1504.method2285(arg0);
            int var14 = this.field1493.method2285(arg0);
            if (this.field1506 != null) {
                int var15 = this.field1506.method2285(arg0);
                int var16 = this.field1495.method2285(arg0);
                var13 += this.method2502(var7, var16, this.field1506.field1420) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1496 != null) {
                int var17 = this.field1496.method2285(arg0);
                int var18 = this.field1497.method2285(arg0);
                var14 = var14 * ((this.method2502(var10, var18, this.field1496.field1420) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1492[var19] != 0) {
                    int var20 = field1514[var19] + var12;
                    if (var20 < arg0) {
                        field1512[var20] += this.method2502(field1513[var19], field1509[var19] * var14 >> 15, this.field1504.field1420);
                        field1513[var19] += (field1494[var19] * var13 >> 16) + field1517[var19];
                    }
                }
            }
        }
        if (this.field1498 != null) {
            this.field1498.method2284();
            this.field1501.method2284();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1498.method2285(arg0);
                int var26 = this.field1501.method2285(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1498.field1425 - this.field1498.field1415) * var25 >> 8) + this.field1498.field1415;
                } else {
                    var27 = ((this.field1498.field1425 - this.field1498.field1415) * var26 >> 8) + this.field1498.field1415;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1512[var24] = 0;
                }
            }
        }
        if (this.field1503 > 0 && this.field1502 > 0) {
            int var28 = (int) ((double) this.field1503 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1512[var29] += field1512[var29 - var28] * this.field1502 / 100;
            }
        }
        if (this.field1505.field1478[0] > 0 || this.field1505.field1478[1] > 0) {
            this.field1516.method2284();
            int var30 = this.field1516.method2285(arg0 + 1);
            int var31 = this.field1505.method2485(0, (float) var30 / 65536.0F);
            int var32 = this.field1505.method2485(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1512[var31 + var33] * (long) Statics.field1480 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1512[var31 + var33 - 1 - var36] * (long) class115.field1473[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1512[var33 - 1 - var37] * (long) class115.field1473[1][var37] >> 16);
                    }
                    field1512[var33] = var35;
                    var30 = this.field1516.method2285(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1512[var31 + var33] * (long) Statics.field1480 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1512[var31 + var33 - 1 - var40] * (long) class115.field1473[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1512[var33 - 1 - var41] * (long) class115.field1473[1][var41] >> 16);
                        }
                        field1512[var33] = var39;
                        var30 = this.field1516.method2285(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1512[var31 + var33 - 1 - var43] * (long) class115.field1473[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1512[var33 - 1 - var44] * (long) class115.field1473[1][var44] >> 16);
                            }
                            field1512[var33] = var42;
                            this.field1516.method2285(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1505.method2485(0, (float) var30 / 65536.0F);
                    var32 = this.field1505.method2485(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1512[var46] < -32768) {
                field1512[var46] = -32768;
            }
            if (field1512[var46] > 32767) {
                field1512[var46] = 32767;
            }
        }
        return field1512;
    }

    @ObfuscatedName("dr.f(III)I")
    public final int method2502(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1500[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1510[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dr.b(Lkg;)V")
    public final void method2501(class300 arg0) {
        this.field1504 = new class107();
        this.field1504.method2282(arg0);
        this.field1493 = new class107();
        this.field1493.method2282(arg0);
        int var2 = arg0.method5138();
        if (var2 != 0) {
            arg0.field3707--;
            this.field1506 = new class107();
            this.field1506.method2282(arg0);
            this.field1495 = new class107();
            this.field1495.method2282(arg0);
        }
        int var3 = arg0.method5138();
        if (var3 != 0) {
            arg0.field3707--;
            this.field1496 = new class107();
            this.field1496.method2282(arg0);
            this.field1497 = new class107();
            this.field1497.method2282(arg0);
        }
        int var4 = arg0.method5138();
        if (var4 != 0) {
            arg0.field3707--;
            this.field1498 = new class107();
            this.field1498.method2282(arg0);
            this.field1501 = new class107();
            this.field1501.method2282(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method5246();
            if (var6 == 0) {
                break;
            }
            this.field1492[var5] = var6;
            this.field1511[var5] = arg0.method5151();
            this.field1499[var5] = arg0.method5246();
        }
        this.field1503 = arg0.method5246();
        this.field1502 = arg0.method5246();
        this.field1507 = arg0.method5337();
        this.field1508 = arg0.method5337();
        this.field1505 = new class115();
        this.field1516 = new class107();
        this.field1505.method2484(arg0, this.field1516);
    }
}
