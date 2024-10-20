package deob;

import java.util.Random;

@ObfuscatedName("dz")
public class class127 {

    @ObfuscatedName("dz.z")
    public class116 field1550;

    @ObfuscatedName("dz.k")
    public class116 field1539;

    @ObfuscatedName("dz.s")
    public class116 field1530;

    @ObfuscatedName("dz.t")
    public class116 field1531;

    @ObfuscatedName("dz.i")
    public class116 field1532;

    @ObfuscatedName("dz.o")
    public class116 field1543;

    @ObfuscatedName("dz.x")
    public class116 field1529;

    @ObfuscatedName("dz.w")
    public class116 field1533;

    @ObfuscatedName("dz.g")
    public int[] field1536 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dz.m")
    public int[] field1551 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dz.n")
    public int[] field1537 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dz.d")
    public int field1534 = 0;

    @ObfuscatedName("dz.h")
    public int field1540 = 100;

    @ObfuscatedName("dz.a")
    public class124 field1541;

    @ObfuscatedName("dz.q")
    public class116 field1542;

    @ObfuscatedName("dz.c")
    public int field1544 = 500;

    @ObfuscatedName("dz.f")
    public int field1538 = 0;

    @ObfuscatedName("dz.y")
    public static int[] field1545;

    @ObfuscatedName("dz.v")
    public static int[] field1546 = new int[32768];

    @ObfuscatedName("dz.j")
    public static int[] field1547;

    @ObfuscatedName("dz.u")
    public static int[] field1549;

    @ObfuscatedName("dz.p")
    public static int[] field1528;

    @ObfuscatedName("dz.b")
    public static int[] field1535;

    @ObfuscatedName("dz.l")
    public static int[] field1552;

    @ObfuscatedName("dz.e")
    public static int[] field1553;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1546[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1547 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1547[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1545 = new int[220500];
        field1549 = new int[5];
        field1528 = new int[5];
        field1535 = new int[5];
        field1552 = new int[5];
        field1553 = new int[5];
    }

    @ObfuscatedName("dz.z(II)[I")
    public final int[] method2602(int arg0, int arg1) {
        class311.method5439(field1545, 0, arg0);
        if (arg1 < 10) {
            return field1545;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1550.method2365();
        this.field1539.method2365();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1530 != null) {
            this.field1530.method2365();
            this.field1531.method2365();
            var5 = (int) ((double) (this.field1530.field1457 - this.field1530.field1456) * 32.768D / var3);
            var6 = (int) ((double) this.field1530.field1456 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1532 != null) {
            this.field1532.method2365();
            this.field1543.method2365();
            var8 = (int) ((double) (this.field1532.field1457 - this.field1532.field1456) * 32.768D / var3);
            var9 = (int) ((double) this.field1532.field1456 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1536[var11] != 0) {
                field1549[var11] = 0;
                field1528[var11] = (int) ((double) this.field1537[var11] * var3);
                field1535[var11] = (this.field1536[var11] << 14) / 100;
                field1552[var11] = (int) ((double) (this.field1550.field1457 - this.field1550.field1456) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1551[var11]) / var3);
                field1553[var11] = (int) ((double) this.field1550.field1456 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1550.method2368(arg0);
            int var14 = this.field1539.method2368(arg0);
            if (this.field1530 != null) {
                int var15 = this.field1530.method2368(arg0);
                int var16 = this.field1531.method2368(arg0);
                var13 += this.method2601(var7, var16, this.field1530.field1460) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1532 != null) {
                int var17 = this.field1532.method2368(arg0);
                int var18 = this.field1543.method2368(arg0);
                var14 = var14 * ((this.method2601(var10, var18, this.field1532.field1460) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1536[var19] != 0) {
                    int var20 = field1528[var19] + var12;
                    if (var20 < arg0) {
                        field1545[var20] += this.method2601(field1549[var19], field1535[var19] * var14 >> 15, this.field1550.field1460);
                        field1549[var19] += (field1552[var19] * var13 >> 16) + field1553[var19];
                    }
                }
            }
        }
        if (this.field1529 != null) {
            this.field1529.method2365();
            this.field1533.method2365();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1529.method2368(arg0);
                int var26 = this.field1533.method2368(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1529.field1457 - this.field1529.field1456) * var25 >> 8) + this.field1529.field1456;
                } else {
                    var27 = ((this.field1529.field1457 - this.field1529.field1456) * var26 >> 8) + this.field1529.field1456;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1545[var24] = 0;
                }
            }
        }
        if (this.field1534 > 0 && this.field1540 > 0) {
            int var28 = (int) ((double) this.field1534 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1545[var29] += field1545[var29 - var28] * this.field1540 / 100;
            }
        }
        if (this.field1541.field1517[0] > 0 || this.field1541.field1517[1] > 0) {
            this.field1542.method2365();
            int var30 = this.field1542.method2368(arg0 + 1);
            int var31 = this.field1541.method2596(0, (float) var30 / 65536.0F);
            int var32 = this.field1541.method2596(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1545[var31 + var33] * (long) Statics.field1516 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1545[var31 + var33 - 1 - var36] * (long) class124.field1519[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1545[var33 - 1 - var37] * (long) class124.field1519[1][var37] >> 16);
                    }
                    field1545[var33] = var35;
                    var30 = this.field1542.method2368(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1545[var31 + var33] * (long) Statics.field1516 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1545[var31 + var33 - 1 - var40] * (long) class124.field1519[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1545[var33 - 1 - var41] * (long) class124.field1519[1][var41] >> 16);
                        }
                        field1545[var33] = var39;
                        var30 = this.field1542.method2368(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1545[var31 + var33 - 1 - var43] * (long) class124.field1519[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1545[var33 - 1 - var44] * (long) class124.field1519[1][var44] >> 16);
                            }
                            field1545[var33] = var42;
                            this.field1542.method2368(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1541.method2596(0, (float) var30 / 65536.0F);
                    var32 = this.field1541.method2596(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1545[var46] < -32768) {
                field1545[var46] = -32768;
            }
            if (field1545[var46] > 32767) {
                field1545[var46] = 32767;
            }
        }
        return field1545;
    }

    @ObfuscatedName("dz.k(III)I")
    public final int method2601(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1547[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1546[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dz.s(Lkf;)V")
    public final void method2604(class310 arg0) {
        this.field1550 = new class116();
        this.field1550.method2364(arg0);
        this.field1539 = new class116();
        this.field1539.method2364(arg0);
        int var2 = arg0.method5193();
        if (var2 != 0) {
            arg0.field3734--;
            this.field1530 = new class116();
            this.field1530.method2364(arg0);
            this.field1531 = new class116();
            this.field1531.method2364(arg0);
        }
        int var3 = arg0.method5193();
        if (var3 != 0) {
            arg0.field3734--;
            this.field1532 = new class116();
            this.field1532.method2364(arg0);
            this.field1543 = new class116();
            this.field1543.method2364(arg0);
        }
        int var4 = arg0.method5193();
        if (var4 != 0) {
            arg0.field3734--;
            this.field1529 = new class116();
            this.field1529.method2364(arg0);
            this.field1533 = new class116();
            this.field1533.method2364(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method5207();
            if (var6 == 0) {
                break;
            }
            this.field1536[var5] = var6;
            this.field1551[var5] = arg0.method5291();
            this.field1537[var5] = arg0.method5207();
        }
        this.field1534 = arg0.method5207();
        this.field1540 = arg0.method5207();
        this.field1544 = arg0.method5195();
        this.field1538 = arg0.method5195();
        this.field1541 = new class124();
        this.field1542 = new class116();
        this.field1541.method2583(arg0, this.field1542);
    }
}
