package deob;

import java.util.Random;

@ObfuscatedName("de")
public class class118 {

    @ObfuscatedName("de.q")
    public class107 field1526;

    @ObfuscatedName("de.w")
    public class107 field1505;

    @ObfuscatedName("de.e")
    public class107 field1506;

    @ObfuscatedName("de.p")
    public class107 field1507;

    @ObfuscatedName("de.k")
    public class107 field1514;

    @ObfuscatedName("de.l")
    public class107 field1509;

    @ObfuscatedName("de.b")
    public class107 field1510;

    @ObfuscatedName("de.i")
    public class107 field1520;

    @ObfuscatedName("de.c")
    public int[] field1524 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("de.f")
    public int[] field1513 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("de.m")
    public int[] field1522 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("de.u")
    public int field1525 = 0;

    @ObfuscatedName("de.x")
    public int field1516 = 100;

    @ObfuscatedName("de.r")
    public class115 field1517;

    @ObfuscatedName("de.v")
    public class107 field1518;

    @ObfuscatedName("de.y")
    public int field1519 = 500;

    @ObfuscatedName("de.g")
    public int field1515 = 0;

    @ObfuscatedName("de.a")
    public static int[] field1504;

    @ObfuscatedName("de.j")
    public static int[] field1521 = new int[32768];

    @ObfuscatedName("de.t")
    public static int[] field1523;

    @ObfuscatedName("de.o")
    public static int[] field1512;

    @ObfuscatedName("de.n")
    public static int[] field1508;

    @ObfuscatedName("de.d")
    public static int[] field1527;

    @ObfuscatedName("de.s")
    public static int[] field1528;

    @ObfuscatedName("de.z")
    public static int[] field1529;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1521[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1523 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1523[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1504 = new int[220500];
        field1512 = new int[5];
        field1508 = new int[5];
        field1527 = new int[5];
        field1528 = new int[5];
        field1529 = new int[5];
    }

    @ObfuscatedName("de.q(II)[I")
    public final int[] method2459(int arg0, int arg1) {
        class302.method5306(field1504, 0, arg0);
        if (arg1 < 10) {
            return field1504;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1526.method2247();
        this.field1505.method2247();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1506 != null) {
            this.field1506.method2247();
            this.field1507.method2247();
            var5 = (int) ((double) (this.field1506.field1432 - this.field1506.field1437) * 32.768D / var3);
            var6 = (int) ((double) this.field1506.field1437 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1514 != null) {
            this.field1514.method2247();
            this.field1509.method2247();
            var8 = (int) ((double) (this.field1514.field1432 - this.field1514.field1437) * 32.768D / var3);
            var9 = (int) ((double) this.field1514.field1437 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1524[var11] != 0) {
                field1512[var11] = 0;
                field1508[var11] = (int) ((double) this.field1522[var11] * var3);
                field1527[var11] = (this.field1524[var11] << 14) / 100;
                field1528[var11] = (int) ((double) (this.field1526.field1432 - this.field1526.field1437) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1513[var11]) / var3);
                field1529[var11] = (int) ((double) this.field1526.field1437 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1526.method2248(arg0);
            int var14 = this.field1505.method2248(arg0);
            if (this.field1506 != null) {
                int var15 = this.field1506.method2248(arg0);
                int var16 = this.field1507.method2248(arg0);
                var13 += this.method2458(var7, var16, this.field1506.field1431) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1514 != null) {
                int var17 = this.field1514.method2248(arg0);
                int var18 = this.field1509.method2248(arg0);
                var14 = var14 * ((this.method2458(var10, var18, this.field1514.field1431) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1524[var19] != 0) {
                    int var20 = field1508[var19] + var12;
                    if (var20 < arg0) {
                        field1504[var20] += this.method2458(field1512[var19], field1527[var19] * var14 >> 15, this.field1526.field1431);
                        field1512[var19] += (field1528[var19] * var13 >> 16) + field1529[var19];
                    }
                }
            }
        }
        if (this.field1510 != null) {
            this.field1510.method2247();
            this.field1520.method2247();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1510.method2248(arg0);
                int var26 = this.field1520.method2248(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1510.field1432 - this.field1510.field1437) * var25 >> 8) + this.field1510.field1437;
                } else {
                    var27 = ((this.field1510.field1432 - this.field1510.field1437) * var26 >> 8) + this.field1510.field1437;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1504[var24] = 0;
                }
            }
        }
        if (this.field1525 > 0 && this.field1516 > 0) {
            int var28 = (int) ((double) this.field1525 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1504[var29] += field1504[var29 - var28] * this.field1516 / 100;
            }
        }
        if (this.field1517.field1491[0] > 0 || this.field1517.field1491[1] > 0) {
            this.field1518.method2247();
            int var30 = this.field1518.method2248(arg0 + 1);
            int var31 = this.field1517.method2436(0, (float) var30 / 65536.0F);
            int var32 = this.field1517.method2436(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1504[var31 + var33] * (long) Statics.field1493 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1504[var31 + var33 - 1 - var36] * (long) class115.field1486[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1504[var33 - 1 - var37] * (long) class115.field1486[1][var37] >> 16);
                    }
                    field1504[var33] = var35;
                    var30 = this.field1518.method2248(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1504[var31 + var33] * (long) Statics.field1493 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1504[var31 + var33 - 1 - var40] * (long) class115.field1486[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1504[var33 - 1 - var41] * (long) class115.field1486[1][var41] >> 16);
                        }
                        field1504[var33] = var39;
                        var30 = this.field1518.method2248(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1504[var31 + var33 - 1 - var43] * (long) class115.field1486[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1504[var33 - 1 - var44] * (long) class115.field1486[1][var44] >> 16);
                            }
                            field1504[var33] = var42;
                            this.field1518.method2248(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1517.method2436(0, (float) var30 / 65536.0F);
                    var32 = this.field1517.method2436(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1504[var46] < -32768) {
                field1504[var46] = -32768;
            }
            if (field1504[var46] > 32767) {
                field1504[var46] = 32767;
            }
        }
        return field1504;
    }

    @ObfuscatedName("de.w(III)I")
    public final int method2458(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1523[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1521[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("de.e(Lkf;)V")
    public final void method2461(class301 arg0) {
        this.field1526 = new class107();
        this.field1526.method2245(arg0);
        this.field1505 = new class107();
        this.field1505.method2245(arg0);
        int var2 = arg0.method5077();
        if (var2 != 0) {
            arg0.field3733--;
            this.field1506 = new class107();
            this.field1506.method2245(arg0);
            this.field1507 = new class107();
            this.field1507.method2245(arg0);
        }
        int var3 = arg0.method5077();
        if (var3 != 0) {
            arg0.field3733--;
            this.field1514 = new class107();
            this.field1514.method2245(arg0);
            this.field1509 = new class107();
            this.field1509.method2245(arg0);
        }
        int var4 = arg0.method5077();
        if (var4 != 0) {
            arg0.field3733--;
            this.field1510 = new class107();
            this.field1510.method2245(arg0);
            this.field1520 = new class107();
            this.field1520.method2245(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method5081();
            if (var6 == 0) {
                break;
            }
            this.field1524[var5] = var6;
            this.field1513[var5] = arg0.method5080();
            this.field1522[var5] = arg0.method5081();
        }
        this.field1525 = arg0.method5081();
        this.field1516 = arg0.method5081();
        this.field1519 = arg0.method5069();
        this.field1515 = arg0.method5069();
        this.field1517 = new class115();
        this.field1518 = new class107();
        this.field1517.method2445(arg0, this.field1518);
    }
}
