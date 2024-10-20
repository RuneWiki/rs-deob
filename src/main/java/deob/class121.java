package deob;

import java.util.Random;

@ObfuscatedName("db")
public class class121 {

    @ObfuscatedName("db.a")
    public class110 field1633;

    @ObfuscatedName("db.w")
    public class110 field1644;

    @ObfuscatedName("db.e")
    public class110 field1635;

    @ObfuscatedName("db.k")
    public class110 field1623;

    @ObfuscatedName("db.u")
    public class110 field1627;

    @ObfuscatedName("db.z")
    public class110 field1625;

    @ObfuscatedName("db.t")
    public class110 field1626;

    @ObfuscatedName("db.f")
    public class110 field1640;

    @ObfuscatedName("db.g")
    public int[] field1628 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("db.j")
    public int[] field1629 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("db.x")
    public int[] field1630 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("db.c")
    public int field1622 = 0;

    @ObfuscatedName("db.s")
    public int field1632 = 100;

    @ObfuscatedName("db.n")
    public class118 field1631;

    @ObfuscatedName("db.y")
    public class110 field1634;

    @ObfuscatedName("db.o")
    public int field1642 = 500;

    @ObfuscatedName("db.r")
    public int field1636 = 0;

    @ObfuscatedName("db.i")
    public static int[] field1643;

    @ObfuscatedName("db.l")
    public static int[] field1638 = new int[32768];

    @ObfuscatedName("db.m")
    public static int[] field1639;

    @ObfuscatedName("db.b")
    public static int[] field1641;

    @ObfuscatedName("db.h")
    public static int[] field1621;

    @ObfuscatedName("db.d")
    public static int[] field1620;

    @ObfuscatedName("db.v")
    public static int[] field1624;

    @ObfuscatedName("db.p")
    public static int[] field1645;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1638[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1639 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1639[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1643 = new int[220500];
        field1641 = new int[5];
        field1621 = new int[5];
        field1620 = new int[5];
        field1624 = new int[5];
        field1645 = new int[5];
    }

    @ObfuscatedName("db.a(II)[I")
    public final int[] method2101(int arg0, int arg1) {
        class195.method3302(field1643, 0, arg0);
        if (arg1 < 10) {
            return field1643;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1633.method1884();
        this.field1644.method1884();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1635 != null) {
            this.field1635.method1884();
            this.field1623.method1884();
            var5 = (int) ((double) (this.field1635.field1548 - this.field1635.field1554) * 32.768D / var3);
            var6 = (int) ((double) this.field1635.field1554 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1627 != null) {
            this.field1627.method1884();
            this.field1625.method1884();
            var8 = (int) ((double) (this.field1627.field1548 - this.field1627.field1554) * 32.768D / var3);
            var9 = (int) ((double) this.field1627.field1554 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1628[var11] != 0) {
                field1641[var11] = 0;
                field1621[var11] = (int) ((double) this.field1630[var11] * var3);
                field1620[var11] = (this.field1628[var11] << 14) / 100;
                field1624[var11] = (int) ((double) (this.field1633.field1548 - this.field1633.field1554) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1629[var11]) / var3);
                field1645[var11] = (int) ((double) this.field1633.field1554 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1633.method1885(arg0);
            int var14 = this.field1644.method1885(arg0);
            if (this.field1635 != null) {
                int var15 = this.field1635.method1885(arg0);
                int var16 = this.field1623.method1885(arg0);
                var13 += this.method2103(var7, var16, this.field1635.field1550) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1627 != null) {
                int var17 = this.field1627.method1885(arg0);
                int var18 = this.field1625.method1885(arg0);
                var14 = var14 * ((this.method2103(var10, var18, this.field1627.field1550) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1628[var19] != 0) {
                    int var20 = field1621[var19] + var12;
                    if (var20 < arg0) {
                        field1643[var20] += this.method2103(field1641[var19], field1620[var19] * var14 >> 15, this.field1633.field1550);
                        field1641[var19] += (field1624[var19] * var13 >> 16) + field1645[var19];
                    }
                }
            }
        }
        if (this.field1626 != null) {
            this.field1626.method1884();
            this.field1640.method1884();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1626.method1885(arg0);
                int var26 = this.field1640.method1885(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1626.field1548 - this.field1626.field1554) * var25 >> 8) + this.field1626.field1554;
                } else {
                    var27 = ((this.field1626.field1548 - this.field1626.field1554) * var26 >> 8) + this.field1626.field1554;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1643[var24] = 0;
                }
            }
        }
        if (this.field1622 > 0 && this.field1632 > 0) {
            int var28 = (int) ((double) this.field1622 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1643[var29] += field1643[var29 - var28] * this.field1632 / 100;
            }
        }
        if (this.field1631.field1607[0] > 0 || this.field1631.field1607[1] > 0) {
            this.field1634.method1884();
            int var30 = this.field1634.method1885(arg0 + 1);
            int var31 = this.field1631.method2077(0, (float) var30 / 65536.0F);
            int var32 = this.field1631.method2077(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1643[var31 + var33] * (long) Statics.field1603 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1643[var31 + var33 - 1 - var36] * (long) class118.field1606[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1643[var33 - 1 - var37] * (long) class118.field1606[1][var37] >> 16);
                    }
                    field1643[var33] = var35;
                    var30 = this.field1634.method1885(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1643[var31 + var33] * (long) Statics.field1603 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1643[var31 + var33 - 1 - var40] * (long) class118.field1606[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1643[var33 - 1 - var41] * (long) class118.field1606[1][var41] >> 16);
                        }
                        field1643[var33] = var39;
                        var30 = this.field1634.method1885(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1643[var31 + var33 - 1 - var43] * (long) class118.field1606[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1643[var33 - 1 - var44] * (long) class118.field1606[1][var44] >> 16);
                            }
                            field1643[var33] = var42;
                            this.field1634.method1885(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1631.method2077(0, (float) var30 / 65536.0F);
                    var32 = this.field1631.method2077(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1643[var46] < -32768) {
                field1643[var46] = -32768;
            }
            if (field1643[var46] > 32767) {
                field1643[var46] = 32767;
            }
        }
        return field1643;
    }

    @ObfuscatedName("db.w(III)I")
    public final int method2103(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1639[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1638[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("db.e(Lgh;)V")
    public final void method2110(class185 arg0) {
        this.field1633 = new class110();
        this.field1633.method1882(arg0);
        this.field1644 = new class110();
        this.field1644.method1882(arg0);
        int var2 = arg0.method2962();
        if (var2 != 0) {
            arg0.field2509--;
            this.field1635 = new class110();
            this.field1635.method1882(arg0);
            this.field1623 = new class110();
            this.field1623.method1882(arg0);
        }
        int var3 = arg0.method2962();
        if (var3 != 0) {
            arg0.field2509--;
            this.field1627 = new class110();
            this.field1627.method1882(arg0);
            this.field1625 = new class110();
            this.field1625.method1882(arg0);
        }
        int var4 = arg0.method2962();
        if (var4 != 0) {
            arg0.field2509--;
            this.field1626 = new class110();
            this.field1626.method1882(arg0);
            this.field1640 = new class110();
            this.field1640.method1882(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3137();
            if (var6 == 0) {
                break;
            }
            this.field1628[var5] = var6;
            this.field1629[var5] = arg0.method2984();
            this.field1630[var5] = arg0.method3137();
        }
        this.field1622 = arg0.method3137();
        this.field1632 = arg0.method3137();
        this.field1642 = arg0.method3194();
        this.field1636 = arg0.method3194();
        this.field1631 = new class118();
        this.field1634 = new class110();
        this.field1631.method2086(arg0, this.field1634);
    }
}
