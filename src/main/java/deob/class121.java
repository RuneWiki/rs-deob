package deob;

import java.util.Random;

@ObfuscatedName("db")
public class class121 {

    @ObfuscatedName("db.d")
    public class110 field1653;

    @ObfuscatedName("db.x")
    public class110 field1642;

    @ObfuscatedName("db.k")
    public class110 field1643;

    @ObfuscatedName("db.z")
    public class110 field1644;

    @ObfuscatedName("db.v")
    public class110 field1649;

    @ObfuscatedName("db.m")
    public class110 field1646;

    @ObfuscatedName("db.b")
    public class110 field1650;

    @ObfuscatedName("db.t")
    public class110 field1648;

    @ObfuscatedName("db.p")
    public int[] field1663 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("db.r")
    public int[] field1664 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("db.l")
    public int[] field1647 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("db.u")
    public int field1652 = 0;

    @ObfuscatedName("db.n")
    public int field1651 = 100;

    @ObfuscatedName("db.c")
    public class118 field1654;

    @ObfuscatedName("db.y")
    public class110 field1655;

    @ObfuscatedName("db.j")
    public int field1656 = 500;

    @ObfuscatedName("db.f")
    public int field1657 = 0;

    @ObfuscatedName("db.s")
    public static int[] field1658;

    @ObfuscatedName("db.e")
    public static int[] field1659 = new int[32768];

    @ObfuscatedName("db.q")
    public static int[] field1660;

    @ObfuscatedName("db.i")
    public static int[] field1662;

    @ObfuscatedName("db.o")
    public static int[] field1666;

    @ObfuscatedName("db.w")
    public static int[] field1641;

    @ObfuscatedName("db.g")
    public static int[] field1665;

    @ObfuscatedName("db.a")
    public static int[] field1645;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1659[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1660 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1660[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1658 = new int[220500];
        field1662 = new int[5];
        field1666 = new int[5];
        field1641 = new int[5];
        field1665 = new int[5];
        field1645 = new int[5];
    }

    @ObfuscatedName("db.d(II)[I")
    public final int[] method2203(int arg0, int arg1) {
        class191.method3348(field1658, 0, arg0);
        if (arg1 < 10) {
            return field1658;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1653.method1986();
        this.field1642.method1986();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1643 != null) {
            this.field1643.method1986();
            this.field1644.method1986();
            var5 = (int) ((double) (this.field1643.field1572 - this.field1643.field1578) * 32.768D / var3);
            var6 = (int) ((double) this.field1643.field1578 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1649 != null) {
            this.field1649.method1986();
            this.field1646.method1986();
            var8 = (int) ((double) (this.field1649.field1572 - this.field1649.field1578) * 32.768D / var3);
            var9 = (int) ((double) this.field1649.field1578 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1663[var11] != 0) {
                field1662[var11] = 0;
                field1666[var11] = (int) ((double) this.field1647[var11] * var3);
                field1641[var11] = (this.field1663[var11] << 14) / 100;
                field1665[var11] = (int) ((double) (this.field1653.field1572 - this.field1653.field1578) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1664[var11]) / var3);
                field1645[var11] = (int) ((double) this.field1653.field1578 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1653.method1990(arg0);
            int var14 = this.field1642.method1990(arg0);
            if (this.field1643 != null) {
                int var15 = this.field1643.method1990(arg0);
                int var16 = this.field1644.method1990(arg0);
                var13 += this.method2202(var7, var16, this.field1643.field1573) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1649 != null) {
                int var17 = this.field1649.method1990(arg0);
                int var18 = this.field1646.method1990(arg0);
                var14 = var14 * ((this.method2202(var10, var18, this.field1649.field1573) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1663[var19] != 0) {
                    int var20 = field1666[var19] + var12;
                    if (var20 < arg0) {
                        field1658[var20] += this.method2202(field1662[var19], field1641[var19] * var14 >> 15, this.field1653.field1573);
                        field1662[var19] += (field1665[var19] * var13 >> 16) + field1645[var19];
                    }
                }
            }
        }
        if (this.field1650 != null) {
            this.field1650.method1986();
            this.field1648.method1986();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1650.method1990(arg0);
                int var26 = this.field1648.method1990(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1650.field1572 - this.field1650.field1578) * var25 >> 8) + this.field1650.field1578;
                } else {
                    var27 = ((this.field1650.field1572 - this.field1650.field1578) * var26 >> 8) + this.field1650.field1578;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1658[var24] = 0;
                }
            }
        }
        if (this.field1652 > 0 && this.field1651 > 0) {
            int var28 = (int) ((double) this.field1652 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1658[var29] += field1658[var29 - var28] * this.field1651 / 100;
            }
        }
        if (this.field1654.field1622[0] > 0 || this.field1654.field1622[1] > 0) {
            this.field1655.method1986();
            int var30 = this.field1655.method1990(arg0 + 1);
            int var31 = this.field1654.method2182(0, (float) var30 / 65536.0F);
            int var32 = this.field1654.method2182(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1658[var31 + var33] * (long) Statics.field1621 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1658[var31 + var33 - 1 - var36] * (long) class118.field1630[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1658[var33 - 1 - var37] * (long) class118.field1630[1][var37] >> 16);
                    }
                    field1658[var33] = var35;
                    var30 = this.field1655.method1990(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1658[var31 + var33] * (long) Statics.field1621 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1658[var31 + var33 - 1 - var40] * (long) class118.field1630[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1658[var33 - 1 - var41] * (long) class118.field1630[1][var41] >> 16);
                        }
                        field1658[var33] = var39;
                        var30 = this.field1655.method1990(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1658[var31 + var33 - 1 - var43] * (long) class118.field1630[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1658[var33 - 1 - var44] * (long) class118.field1630[1][var44] >> 16);
                            }
                            field1658[var33] = var42;
                            this.field1655.method1990(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1654.method2182(0, (float) var30 / 65536.0F);
                    var32 = this.field1654.method2182(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1658[var46] < -32768) {
                field1658[var46] = -32768;
            }
            if (field1658[var46] > 32767) {
                field1658[var46] = 32767;
            }
        }
        return field1658;
    }

    @ObfuscatedName("db.x(III)I")
    public final int method2202(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1660[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1659[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("db.k(Lfr;)V")
    public final void method2205(class181 arg0) {
        this.field1653 = new class110();
        this.field1653.method1993(arg0);
        this.field1642 = new class110();
        this.field1642.method1993(arg0);
        int var2 = arg0.method3204();
        if (var2 != 0) {
            arg0.field2498--;
            this.field1643 = new class110();
            this.field1643.method1993(arg0);
            this.field1644 = new class110();
            this.field1644.method1993(arg0);
        }
        int var3 = arg0.method3204();
        if (var3 != 0) {
            arg0.field2498--;
            this.field1649 = new class110();
            this.field1649.method1993(arg0);
            this.field1646 = new class110();
            this.field1646.method1993(arg0);
        }
        int var4 = arg0.method3204();
        if (var4 != 0) {
            arg0.field2498--;
            this.field1650 = new class110();
            this.field1650.method1993(arg0);
            this.field1648 = new class110();
            this.field1648.method1993(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3044();
            if (var6 == 0) {
                break;
            }
            this.field1663[var5] = var6;
            this.field1664[var5] = arg0.method3222();
            this.field1647[var5] = arg0.method3044();
        }
        this.field1652 = arg0.method3044();
        this.field1651 = arg0.method3044();
        this.field1656 = arg0.method3179();
        this.field1657 = arg0.method3179();
        this.field1654 = new class118();
        this.field1655 = new class110();
        this.field1654.method2183(arg0, this.field1655);
    }
}
