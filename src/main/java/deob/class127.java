package deob;

import java.util.Random;

@ObfuscatedName("dc")
public class class127 {

    @ObfuscatedName("dc.h")
    public class116 field1535;

    @ObfuscatedName("dc.v")
    public class116 field1516;

    @ObfuscatedName("dc.x")
    public class116 field1517;

    @ObfuscatedName("dc.w")
    public class116 field1518;

    @ObfuscatedName("dc.t")
    public class116 field1525;

    @ObfuscatedName("dc.j")
    public class116 field1520;

    @ObfuscatedName("dc.n")
    public class116 field1521;

    @ObfuscatedName("dc.p")
    public class116 field1522;

    @ObfuscatedName("dc.l")
    public int[] field1523 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dc.z")
    public int[] field1524 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dc.u")
    public int[] field1533 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dc.e")
    public int field1537 = 0;

    @ObfuscatedName("dc.m")
    public int field1515 = 100;

    @ObfuscatedName("dc.c")
    public class124 field1528;

    @ObfuscatedName("dc.i")
    public class116 field1529;

    @ObfuscatedName("dc.f")
    public int field1530 = 500;

    @ObfuscatedName("dc.a")
    public int field1526 = 0;

    @ObfuscatedName("dc.b")
    public static int[] field1527;

    @ObfuscatedName("dc.y")
    public static int[] field1532 = new int[32768];

    @ObfuscatedName("dc.r")
    public static int[] field1534;

    @ObfuscatedName("dc.g")
    public static int[] field1536;

    @ObfuscatedName("dc.s")
    public static int[] field1540;

    @ObfuscatedName("dc.o")
    public static int[] field1538;

    @ObfuscatedName("dc.k")
    public static int[] field1539;

    @ObfuscatedName("dc.d")
    public static int[] field1531;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1532[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1534 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1534[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1527 = new int[220500];
        field1536 = new int[5];
        field1540 = new int[5];
        field1538 = new int[5];
        field1539 = new int[5];
        field1531 = new int[5];
    }

    @ObfuscatedName("dc.h(II)[I")
    public final int[] method2583(int arg0, int arg1) {
        class312.method5367(field1527, 0, arg0);
        if (arg1 < 10) {
            return field1527;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1535.method2357();
        this.field1516.method2357();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1517 != null) {
            this.field1517.method2357();
            this.field1518.method2357();
            var5 = (int) ((double) (this.field1517.field1449 - this.field1517.field1448) * 32.768D / var3);
            var6 = (int) ((double) this.field1517.field1448 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1525 != null) {
            this.field1525.method2357();
            this.field1520.method2357();
            var8 = (int) ((double) (this.field1525.field1449 - this.field1525.field1448) * 32.768D / var3);
            var9 = (int) ((double) this.field1525.field1448 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1523[var11] != 0) {
                field1536[var11] = 0;
                field1540[var11] = (int) ((double) this.field1533[var11] * var3);
                field1538[var11] = (this.field1523[var11] << 14) / 100;
                field1539[var11] = (int) ((double) (this.field1535.field1449 - this.field1535.field1448) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1524[var11]) / var3);
                field1531[var11] = (int) ((double) this.field1535.field1448 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1535.method2358(arg0);
            int var14 = this.field1516.method2358(arg0);
            if (this.field1517 != null) {
                int var15 = this.field1517.method2358(arg0);
                int var16 = this.field1518.method2358(arg0);
                var13 += this.method2579(var7, var16, this.field1517.field1445) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1525 != null) {
                int var17 = this.field1525.method2358(arg0);
                int var18 = this.field1520.method2358(arg0);
                var14 = var14 * ((this.method2579(var10, var18, this.field1525.field1445) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1523[var19] != 0) {
                    int var20 = field1540[var19] + var12;
                    if (var20 < arg0) {
                        field1527[var20] += this.method2579(field1536[var19], field1538[var19] * var14 >> 15, this.field1535.field1445);
                        field1536[var19] += (field1539[var19] * var13 >> 16) + field1531[var19];
                    }
                }
            }
        }
        if (this.field1521 != null) {
            this.field1521.method2357();
            this.field1522.method2357();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1521.method2358(arg0);
                int var26 = this.field1522.method2358(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1521.field1449 - this.field1521.field1448) * var25 >> 8) + this.field1521.field1448;
                } else {
                    var27 = ((this.field1521.field1449 - this.field1521.field1448) * var26 >> 8) + this.field1521.field1448;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1527[var24] = 0;
                }
            }
        }
        if (this.field1537 > 0 && this.field1515 > 0) {
            int var28 = (int) ((double) this.field1537 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1527[var29] += field1527[var29 - var28] * this.field1515 / 100;
            }
        }
        if (this.field1528.field1501[0] > 0 || this.field1528.field1501[1] > 0) {
            this.field1529.method2357();
            int var30 = this.field1529.method2358(arg0 + 1);
            int var31 = this.field1528.method2561(0, (float) var30 / 65536.0F);
            int var32 = this.field1528.method2561(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1527[var31 + var33] * (long) Statics.field1503 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1527[var31 + var33 - 1 - var36] * (long) class124.field1505[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1527[var33 - 1 - var37] * (long) class124.field1505[1][var37] >> 16);
                    }
                    field1527[var33] = var35;
                    var30 = this.field1529.method2358(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1527[var31 + var33] * (long) Statics.field1503 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1527[var31 + var33 - 1 - var40] * (long) class124.field1505[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1527[var33 - 1 - var41] * (long) class124.field1505[1][var41] >> 16);
                        }
                        field1527[var33] = var39;
                        var30 = this.field1529.method2358(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1527[var31 + var33 - 1 - var43] * (long) class124.field1505[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1527[var33 - 1 - var44] * (long) class124.field1505[1][var44] >> 16);
                            }
                            field1527[var33] = var42;
                            this.field1529.method2358(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1528.method2561(0, (float) var30 / 65536.0F);
                    var32 = this.field1528.method2561(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1527[var46] < -32768) {
                field1527[var46] = -32768;
            }
            if (field1527[var46] > 32767) {
                field1527[var46] = 32767;
            }
        }
        return field1527;
    }

    @ObfuscatedName("dc.v(III)I")
    public final int method2579(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1534[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1532[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dc.x(Lkj;)V")
    public final void method2580(class311 arg0) {
        this.field1535 = new class116();
        this.field1535.method2367(arg0);
        this.field1516 = new class116();
        this.field1516.method2367(arg0);
        int var2 = arg0.method5274();
        if (var2 != 0) {
            arg0.field3752--;
            this.field1517 = new class116();
            this.field1517.method2367(arg0);
            this.field1518 = new class116();
            this.field1518.method2367(arg0);
        }
        int var3 = arg0.method5274();
        if (var3 != 0) {
            arg0.field3752--;
            this.field1525 = new class116();
            this.field1525.method2367(arg0);
            this.field1520 = new class116();
            this.field1520.method2367(arg0);
        }
        int var4 = arg0.method5274();
        if (var4 != 0) {
            arg0.field3752--;
            this.field1521 = new class116();
            this.field1521.method2367(arg0);
            this.field1522 = new class116();
            this.field1522.method2367(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method5096();
            if (var6 == 0) {
                break;
            }
            this.field1523[var5] = var6;
            this.field1524[var5] = arg0.method5128();
            this.field1533[var5] = arg0.method5096();
        }
        this.field1537 = arg0.method5096();
        this.field1515 = arg0.method5096();
        this.field1530 = arg0.method5342();
        this.field1526 = arg0.method5342();
        this.field1528 = new class124();
        this.field1529 = new class116();
        this.field1528.method2562(arg0, this.field1529);
    }
}
