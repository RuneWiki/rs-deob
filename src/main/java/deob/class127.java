package deob;

import java.util.Random;

@ObfuscatedName("dq")
public class class127 {

    @ObfuscatedName("dq.m")
    public class116 field1529;

    @ObfuscatedName("dq.o")
    public class116 field1526;

    @ObfuscatedName("dq.q")
    public class116 field1528;

    @ObfuscatedName("dq.j")
    public class116 field1527;

    @ObfuscatedName("dq.p")
    public class116 field1530;

    @ObfuscatedName("dq.g")
    public class116 field1531;

    @ObfuscatedName("dq.n")
    public class116 field1532;

    @ObfuscatedName("dq.u")
    public class116 field1533;

    @ObfuscatedName("dq.a")
    public int[] field1534 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dq.z")
    public int[] field1535 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dq.w")
    public int[] field1536 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dq.y")
    public int field1537 = 0;

    @ObfuscatedName("dq.c")
    public int field1548 = 100;

    @ObfuscatedName("dq.h")
    public class124 field1539;

    @ObfuscatedName("dq.k")
    public class116 field1540;

    @ObfuscatedName("dq.r")
    public int field1541 = 500;

    @ObfuscatedName("dq.s")
    public int field1550 = 0;

    @ObfuscatedName("dq.v")
    public static int[] field1543;

    @ObfuscatedName("dq.d")
    public static int[] field1547 = new int[32768];

    @ObfuscatedName("dq.e")
    public static int[] field1544;

    @ObfuscatedName("dq.t")
    public static int[] field1542;

    @ObfuscatedName("dq.x")
    public static int[] field1538;

    @ObfuscatedName("dq.b")
    public static int[] field1549;

    @ObfuscatedName("dq.i")
    public static int[] field1545;

    @ObfuscatedName("dq.f")
    public static int[] field1551;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1547[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1544 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1544[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1543 = new int[220500];
        field1542 = new int[5];
        field1538 = new int[5];
        field1549 = new int[5];
        field1545 = new int[5];
        field1551 = new int[5];
    }

    @ObfuscatedName("dq.m(II)[I")
    public final int[] method2577(int arg0, int arg1) {
        class311.method5471(field1543, 0, arg0);
        if (arg1 < 10) {
            return field1543;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1529.method2364();
        this.field1526.method2364();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1528 != null) {
            this.field1528.method2364();
            this.field1527.method2364();
            var5 = (int) ((double) (this.field1528.field1459 - this.field1528.field1465) * 32.768D / var3);
            var6 = (int) ((double) this.field1528.field1465 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1530 != null) {
            this.field1530.method2364();
            this.field1531.method2364();
            var8 = (int) ((double) (this.field1530.field1459 - this.field1530.field1465) * 32.768D / var3);
            var9 = (int) ((double) this.field1530.field1465 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1534[var11] != 0) {
                field1542[var11] = 0;
                field1538[var11] = (int) ((double) this.field1536[var11] * var3);
                field1549[var11] = (this.field1534[var11] << 14) / 100;
                field1545[var11] = (int) ((double) (this.field1529.field1459 - this.field1529.field1465) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1535[var11]) / var3);
                field1551[var11] = (int) ((double) this.field1529.field1465 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1529.method2367(arg0);
            int var14 = this.field1526.method2367(arg0);
            if (this.field1528 != null) {
                int var15 = this.field1528.method2367(arg0);
                int var16 = this.field1527.method2367(arg0);
                var13 += this.method2575(var7, var16, this.field1528.field1460) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1530 != null) {
                int var17 = this.field1530.method2367(arg0);
                int var18 = this.field1531.method2367(arg0);
                var14 = var14 * ((this.method2575(var10, var18, this.field1530.field1460) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1534[var19] != 0) {
                    int var20 = field1538[var19] + var12;
                    if (var20 < arg0) {
                        field1543[var20] += this.method2575(field1542[var19], field1549[var19] * var14 >> 15, this.field1529.field1460);
                        field1542[var19] += (field1545[var19] * var13 >> 16) + field1551[var19];
                    }
                }
            }
        }
        if (this.field1532 != null) {
            this.field1532.method2364();
            this.field1533.method2364();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1532.method2367(arg0);
                int var26 = this.field1533.method2367(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1532.field1459 - this.field1532.field1465) * var25 >> 8) + this.field1532.field1465;
                } else {
                    var27 = ((this.field1532.field1459 - this.field1532.field1465) * var26 >> 8) + this.field1532.field1465;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1543[var24] = 0;
                }
            }
        }
        if (this.field1537 > 0 && this.field1548 > 0) {
            int var28 = (int) ((double) this.field1537 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1543[var29] += field1543[var29 - var28] * this.field1548 / 100;
            }
        }
        if (this.field1539.field1514[0] > 0 || this.field1539.field1514[1] > 0) {
            this.field1540.method2364();
            int var30 = this.field1540.method2367(arg0 + 1);
            int var31 = this.field1539.method2565(0, (float) var30 / 65536.0F);
            int var32 = this.field1539.method2565(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1543[var31 + var33] * (long) Statics.field1515 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1543[var31 + var33 - 1 - var36] * (long) class124.field1512[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1543[var33 - 1 - var37] * (long) class124.field1512[1][var37] >> 16);
                    }
                    field1543[var33] = var35;
                    var30 = this.field1540.method2367(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1543[var31 + var33] * (long) Statics.field1515 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1543[var31 + var33 - 1 - var40] * (long) class124.field1512[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1543[var33 - 1 - var41] * (long) class124.field1512[1][var41] >> 16);
                        }
                        field1543[var33] = var39;
                        var30 = this.field1540.method2367(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1543[var31 + var33 - 1 - var43] * (long) class124.field1512[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1543[var33 - 1 - var44] * (long) class124.field1512[1][var44] >> 16);
                            }
                            field1543[var33] = var42;
                            this.field1540.method2367(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1539.method2565(0, (float) var30 / 65536.0F);
                    var32 = this.field1539.method2565(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1543[var46] < -32768) {
                field1543[var46] = -32768;
            }
            if (field1543[var46] > 32767) {
                field1543[var46] = 32767;
            }
        }
        return field1543;
    }

    @ObfuscatedName("dq.o(III)I")
    public final int method2575(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1544[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1547[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dq.q(Lkn;)V")
    public final void method2580(class310 arg0) {
        this.field1529 = new class116();
        this.field1529.method2362(arg0);
        this.field1526 = new class116();
        this.field1526.method2362(arg0);
        int var2 = arg0.method5227();
        if (var2 != 0) {
            arg0.field3734--;
            this.field1528 = new class116();
            this.field1528.method2362(arg0);
            this.field1527 = new class116();
            this.field1527.method2362(arg0);
        }
        int var3 = arg0.method5227();
        if (var3 != 0) {
            arg0.field3734--;
            this.field1530 = new class116();
            this.field1530.method2362(arg0);
            this.field1531 = new class116();
            this.field1531.method2362(arg0);
        }
        int var4 = arg0.method5227();
        if (var4 != 0) {
            arg0.field3734--;
            this.field1532 = new class116();
            this.field1532.method2362(arg0);
            this.field1533 = new class116();
            this.field1533.method2362(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method5395();
            if (var6 == 0) {
                break;
            }
            this.field1534[var5] = var6;
            this.field1535[var5] = arg0.method5302();
            this.field1536[var5] = arg0.method5395();
        }
        this.field1537 = arg0.method5395();
        this.field1548 = arg0.method5395();
        this.field1541 = arg0.method5283();
        this.field1550 = arg0.method5283();
        this.field1539 = new class124();
        this.field1540 = new class116();
        this.field1539.method2561(arg0, this.field1540);
    }
}
