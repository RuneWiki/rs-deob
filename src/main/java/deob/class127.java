package deob;

import java.util.Random;

@ObfuscatedName("dp")
public class class127 {

    @ObfuscatedName("dp.x")
    public class116 field1520;

    @ObfuscatedName("dp.m")
    public class116 field1539;

    @ObfuscatedName("dp.k")
    public class116 field1518;

    @ObfuscatedName("dp.d")
    public class116 field1521;

    @ObfuscatedName("dp.w")
    public class116 field1530;

    @ObfuscatedName("dp.v")
    public class116 field1540;

    @ObfuscatedName("dp.q")
    public class116 field1522;

    @ObfuscatedName("dp.z")
    public class116 field1527;

    @ObfuscatedName("dp.t")
    public int[] field1524 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dp.e")
    public int[] field1525 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dp.s")
    public int[] field1526 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dp.p")
    public int field1534 = 0;

    @ObfuscatedName("dp.n")
    public int field1528 = 100;

    @ObfuscatedName("dp.u")
    public class124 field1529;

    @ObfuscatedName("dp.h")
    public class116 field1523;

    @ObfuscatedName("dp.g")
    public int field1531 = 500;

    @ObfuscatedName("dp.i")
    public int field1532 = 0;

    @ObfuscatedName("dp.a")
    public static int[] field1541;

    @ObfuscatedName("dp.b")
    public static int[] field1533 = new int[32768];

    @ObfuscatedName("dp.l")
    public static int[] field1535;

    @ObfuscatedName("dp.o")
    public static int[] field1537;

    @ObfuscatedName("dp.c")
    public static int[] field1538;

    @ObfuscatedName("dp.j")
    public static int[] field1516;

    @ObfuscatedName("dp.y")
    public static int[] field1517;

    @ObfuscatedName("dp.f")
    public static int[] field1519;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1533[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1535 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1535[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1541 = new int[220500];
        field1537 = new int[5];
        field1538 = new int[5];
        field1516 = new int[5];
        field1517 = new int[5];
        field1519 = new int[5];
    }

    @ObfuscatedName("dp.x(II)[I")
    public final int[] method2580(int arg0, int arg1) {
        class311.method5365(field1541, 0, arg0);
        if (arg1 < 10) {
            return field1541;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1520.method2368();
        this.field1539.method2368();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1518 != null) {
            this.field1518.method2368();
            this.field1521.method2368();
            var5 = (int) ((double) (this.field1518.field1448 - this.field1518.field1451) * 32.768D / var3);
            var6 = (int) ((double) this.field1518.field1451 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1530 != null) {
            this.field1530.method2368();
            this.field1540.method2368();
            var8 = (int) ((double) (this.field1530.field1448 - this.field1530.field1451) * 32.768D / var3);
            var9 = (int) ((double) this.field1530.field1451 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1524[var11] != 0) {
                field1537[var11] = 0;
                field1538[var11] = (int) ((double) this.field1526[var11] * var3);
                field1516[var11] = (this.field1524[var11] << 14) / 100;
                field1517[var11] = (int) ((double) (this.field1520.field1448 - this.field1520.field1451) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1525[var11]) / var3);
                field1519[var11] = (int) ((double) this.field1520.field1451 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1520.method2369(arg0);
            int var14 = this.field1539.method2369(arg0);
            if (this.field1518 != null) {
                int var15 = this.field1518.method2369(arg0);
                int var16 = this.field1521.method2369(arg0);
                var13 += this.method2584(var7, var16, this.field1518.field1450) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1530 != null) {
                int var17 = this.field1530.method2369(arg0);
                int var18 = this.field1540.method2369(arg0);
                var14 = var14 * ((this.method2584(var10, var18, this.field1530.field1450) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1524[var19] != 0) {
                    int var20 = field1538[var19] + var12;
                    if (var20 < arg0) {
                        field1541[var20] += this.method2584(field1537[var19], field1516[var19] * var14 >> 15, this.field1520.field1450);
                        field1537[var19] += (field1517[var19] * var13 >> 16) + field1519[var19];
                    }
                }
            }
        }
        if (this.field1522 != null) {
            this.field1522.method2368();
            this.field1527.method2368();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1522.method2369(arg0);
                int var26 = this.field1527.method2369(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1522.field1448 - this.field1522.field1451) * var25 >> 8) + this.field1522.field1451;
                } else {
                    var27 = ((this.field1522.field1448 - this.field1522.field1451) * var26 >> 8) + this.field1522.field1451;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1541[var24] = 0;
                }
            }
        }
        if (this.field1534 > 0 && this.field1528 > 0) {
            int var28 = (int) ((double) this.field1534 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1541[var29] += field1541[var29 - var28] * this.field1528 / 100;
            }
        }
        if (this.field1529.field1499[0] > 0 || this.field1529.field1499[1] > 0) {
            this.field1523.method2368();
            int var30 = this.field1523.method2369(arg0 + 1);
            int var31 = this.field1529.method2559(0, (float) var30 / 65536.0F);
            int var32 = this.field1529.method2559(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1541[var31 + var33] * (long) Statics.field1504 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1541[var31 + var33 - 1 - var36] * (long) class124.field1500[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1541[var33 - 1 - var37] * (long) class124.field1500[1][var37] >> 16);
                    }
                    field1541[var33] = var35;
                    var30 = this.field1523.method2369(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1541[var31 + var33] * (long) Statics.field1504 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1541[var31 + var33 - 1 - var40] * (long) class124.field1500[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1541[var33 - 1 - var41] * (long) class124.field1500[1][var41] >> 16);
                        }
                        field1541[var33] = var39;
                        var30 = this.field1523.method2369(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1541[var31 + var33 - 1 - var43] * (long) class124.field1500[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1541[var33 - 1 - var44] * (long) class124.field1500[1][var44] >> 16);
                            }
                            field1541[var33] = var42;
                            this.field1523.method2369(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1529.method2559(0, (float) var30 / 65536.0F);
                    var32 = this.field1529.method2559(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1541[var46] < -32768) {
                field1541[var46] = -32768;
            }
            if (field1541[var46] > 32767) {
                field1541[var46] = 32767;
            }
        }
        return field1541;
    }

    @ObfuscatedName("dp.m(III)I")
    public final int method2584(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1535[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1533[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dp.k(Lkb;)V")
    public final void method2581(class310 arg0) {
        this.field1520 = new class116();
        this.field1520.method2365(arg0);
        this.field1539 = new class116();
        this.field1539.method2365(arg0);
        int var2 = arg0.method5137();
        if (var2 != 0) {
            arg0.field3711--;
            this.field1518 = new class116();
            this.field1518.method2365(arg0);
            this.field1521 = new class116();
            this.field1521.method2365(arg0);
        }
        int var3 = arg0.method5137();
        if (var3 != 0) {
            arg0.field3711--;
            this.field1530 = new class116();
            this.field1530.method2365(arg0);
            this.field1540 = new class116();
            this.field1540.method2365(arg0);
        }
        int var4 = arg0.method5137();
        if (var4 != 0) {
            arg0.field3711--;
            this.field1522 = new class116();
            this.field1522.method2365(arg0);
            this.field1527 = new class116();
            this.field1527.method2365(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method5151();
            if (var6 == 0) {
                break;
            }
            this.field1524[var5] = var6;
            this.field1525[var5] = arg0.method5218();
            this.field1526[var5] = arg0.method5151();
        }
        this.field1534 = arg0.method5151();
        this.field1528 = arg0.method5151();
        this.field1531 = arg0.method5139();
        this.field1532 = arg0.method5139();
        this.field1529 = new class124();
        this.field1523 = new class116();
        this.field1529.method2568(arg0, this.field1523);
    }
}
