package deob;

import java.util.Random;

@ObfuscatedName("dj")
public class class120 {

    @ObfuscatedName("dj.g")
    public class109 field1638;

    @ObfuscatedName("dj.e")
    public class109 field1648;

    @ObfuscatedName("dj.b")
    public class109 field1655;

    @ObfuscatedName("dj.z")
    public class109 field1633;

    @ObfuscatedName("dj.n")
    public class109 field1634;

    @ObfuscatedName("dj.l")
    public class109 field1635;

    @ObfuscatedName("dj.s")
    public class109 field1636;

    @ObfuscatedName("dj.y")
    public class109 field1654;

    @ObfuscatedName("dj.c")
    public int[] field1641 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dj.h")
    public int[] field1630 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dj.i")
    public int[] field1632 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dj.o")
    public int field1631 = 0;

    @ObfuscatedName("dj.d")
    public int field1640 = 100;

    @ObfuscatedName("dj.r")
    public class117 field1643;

    @ObfuscatedName("dj.p")
    public class109 field1644;

    @ObfuscatedName("dj.q")
    public int field1645 = 500;

    @ObfuscatedName("dj.f")
    public int field1646 = 0;

    @ObfuscatedName("dj.j")
    public static int[] field1647;

    @ObfuscatedName("dj.v")
    public static int[] field1642 = new int[32768];

    @ObfuscatedName("dj.u")
    public static int[] field1649;

    @ObfuscatedName("dj.w")
    public static int[] field1651;

    @ObfuscatedName("dj.m")
    public static int[] field1652;

    @ObfuscatedName("dj.a")
    public static int[] field1653;

    @ObfuscatedName("dj.x")
    public static int[] field1637;

    @ObfuscatedName("dj.t")
    public static int[] field1639;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1642[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1649 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1649[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1647 = new int[220500];
        field1651 = new int[5];
        field1652 = new int[5];
        field1653 = new int[5];
        field1637 = new int[5];
        field1639 = new int[5];
    }

    @ObfuscatedName("dj.g(II)[I")
    public final int[] method2390(int arg0, int arg1) {
        class206.method3641(field1647, 0, arg0);
        if (arg1 < 10) {
            return field1647;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1638.method2196();
        this.field1648.method2196();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1655 != null) {
            this.field1655.method2196();
            this.field1633.method2196();
            var5 = (int) ((double) (this.field1655.field1561 - this.field1655.field1559) * 32.768D / var3);
            var6 = (int) ((double) this.field1655.field1559 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1634 != null) {
            this.field1634.method2196();
            this.field1635.method2196();
            var8 = (int) ((double) (this.field1634.field1561 - this.field1634.field1559) * 32.768D / var3);
            var9 = (int) ((double) this.field1634.field1559 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1641[var11] != 0) {
                field1651[var11] = 0;
                field1652[var11] = (int) ((double) this.field1632[var11] * var3);
                field1653[var11] = (this.field1641[var11] << 14) / 100;
                field1637[var11] = (int) ((double) (this.field1638.field1561 - this.field1638.field1559) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1630[var11]) / var3);
                field1639[var11] = (int) ((double) this.field1638.field1559 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1638.method2195(arg0);
            int var14 = this.field1648.method2195(arg0);
            if (this.field1655 != null) {
                int var15 = this.field1655.method2195(arg0);
                int var16 = this.field1633.method2195(arg0);
                var13 += this.method2398(var7, var16, this.field1655.field1562) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1634 != null) {
                int var17 = this.field1634.method2195(arg0);
                int var18 = this.field1635.method2195(arg0);
                var14 = var14 * ((this.method2398(var10, var18, this.field1634.field1562) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1641[var19] != 0) {
                    int var20 = field1652[var19] + var12;
                    if (var20 < arg0) {
                        field1647[var20] += this.method2398(field1651[var19], field1653[var19] * var14 >> 15, this.field1638.field1562);
                        field1651[var19] += (field1637[var19] * var13 >> 16) + field1639[var19];
                    }
                }
            }
        }
        if (this.field1636 != null) {
            this.field1636.method2196();
            this.field1654.method2196();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1636.method2195(arg0);
                int var26 = this.field1654.method2195(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1636.field1561 - this.field1636.field1559) * var25 >> 8) + this.field1636.field1559;
                } else {
                    var27 = ((this.field1636.field1561 - this.field1636.field1559) * var26 >> 8) + this.field1636.field1559;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1647[var24] = 0;
                }
            }
        }
        if (this.field1631 > 0 && this.field1640 > 0) {
            int var28 = (int) ((double) this.field1631 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1647[var29] += field1647[var29 - var28] * this.field1640 / 100;
            }
        }
        if (this.field1643.field1610[0] > 0 || this.field1643.field1610[1] > 0) {
            this.field1644.method2196();
            int var30 = this.field1644.method2195(arg0 + 1);
            int var31 = this.field1643.method2379(0, (float) var30 / 65536.0F);
            int var32 = this.field1643.method2379(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1647[var31 + var33] * (long) Statics.field1621 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1647[var31 + var33 - 1 - var36] * (long) class117.field1616[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1647[var33 - 1 - var37] * (long) class117.field1616[1][var37] >> 16);
                    }
                    field1647[var33] = var35;
                    var30 = this.field1644.method2195(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1647[var31 + var33] * (long) Statics.field1621 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1647[var31 + var33 - 1 - var40] * (long) class117.field1616[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1647[var33 - 1 - var41] * (long) class117.field1616[1][var41] >> 16);
                        }
                        field1647[var33] = var39;
                        var30 = this.field1644.method2195(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1647[var31 + var33 - 1 - var43] * (long) class117.field1616[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1647[var33 - 1 - var44] * (long) class117.field1616[1][var44] >> 16);
                            }
                            field1647[var33] = var42;
                            this.field1644.method2195(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1643.method2379(0, (float) var30 / 65536.0F);
                    var32 = this.field1643.method2379(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1647[var46] < -32768) {
                field1647[var46] = -32768;
            }
            if (field1647[var46] > 32767) {
                field1647[var46] = 32767;
            }
        }
        return field1647;
    }

    @ObfuscatedName("dj.e(III)I")
    public final int method2398(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1649[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1642[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dj.b(Lgg;)V")
    public final void method2391(class195 arg0) {
        this.field1638 = new class109();
        this.field1638.method2193(arg0);
        this.field1648 = new class109();
        this.field1648.method2193(arg0);
        int var2 = arg0.method3332();
        if (var2 != 0) {
            arg0.field2562--;
            this.field1655 = new class109();
            this.field1655.method2193(arg0);
            this.field1633 = new class109();
            this.field1633.method2193(arg0);
        }
        int var3 = arg0.method3332();
        if (var3 != 0) {
            arg0.field2562--;
            this.field1634 = new class109();
            this.field1634.method2193(arg0);
            this.field1635 = new class109();
            this.field1635.method2193(arg0);
        }
        int var4 = arg0.method3332();
        if (var4 != 0) {
            arg0.field2562--;
            this.field1636 = new class109();
            this.field1636.method2193(arg0);
            this.field1654 = new class109();
            this.field1654.method2193(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3339();
            if (var6 == 0) {
                break;
            }
            this.field1641[var5] = var6;
            this.field1630[var5] = arg0.method3474();
            this.field1632[var5] = arg0.method3339();
        }
        this.field1631 = arg0.method3339();
        this.field1640 = arg0.method3339();
        this.field1645 = arg0.method3310();
        this.field1646 = arg0.method3310();
        this.field1643 = new class117();
        this.field1644 = new class109();
        this.field1643.method2380(arg0, this.field1644);
    }
}
