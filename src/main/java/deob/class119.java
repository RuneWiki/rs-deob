package deob;

import java.util.Random;

@ObfuscatedName("dm")
public class class119 {

    @ObfuscatedName("dm.b")
    public class108 field1631;

    @ObfuscatedName("dm.q")
    public class108 field1610;

    @ObfuscatedName("dm.o")
    public class108 field1618;

    @ObfuscatedName("dm.p")
    public class108 field1612;

    @ObfuscatedName("dm.a")
    public class108 field1632;

    @ObfuscatedName("dm.h")
    public class108 field1614;

    @ObfuscatedName("dm.l")
    public class108 field1615;

    @ObfuscatedName("dm.y")
    public class108 field1616;

    @ObfuscatedName("dm.g")
    public int[] field1624 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dm.c")
    public int[] field1633 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dm.u")
    public int[] field1622 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dm.r")
    public int field1617 = 0;

    @ObfuscatedName("dm.d")
    public int field1621 = 100;

    @ObfuscatedName("dm.v")
    public class116 field1619;

    @ObfuscatedName("dm.s")
    public class108 field1623;

    @ObfuscatedName("dm.t")
    public int field1609 = 500;

    @ObfuscatedName("dm.f")
    public int field1625 = 0;

    @ObfuscatedName("dm.m")
    public static int[] field1626;

    @ObfuscatedName("dm.x")
    public static int[] field1627 = new int[32768];

    @ObfuscatedName("dm.w")
    public static int[] field1611;

    @ObfuscatedName("dm.z")
    public static int[] field1630;

    @ObfuscatedName("dm.e")
    public static int[] field1613;

    @ObfuscatedName("dm.k")
    public static int[] field1620;

    @ObfuscatedName("dm.n")
    public static int[] field1628;

    @ObfuscatedName("dm.i")
    public static int[] field1634;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1627[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1611 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1611[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1626 = new int[220500];
        field1630 = new int[5];
        field1613 = new int[5];
        field1620 = new int[5];
        field1628 = new int[5];
        field1634 = new int[5];
    }

    @ObfuscatedName("dm.b(II)[I")
    public final int[] method2295(int arg0, int arg1) {
        class204.method3594(field1626, 0, arg0);
        if (arg1 < 10) {
            return field1626;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1631.method2084();
        this.field1610.method2084();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1618 != null) {
            this.field1618.method2084();
            this.field1612.method2084();
            var5 = (int) ((double) (this.field1618.field1535 - this.field1618.field1537) * 32.768D / var3);
            var6 = (int) ((double) this.field1618.field1537 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1632 != null) {
            this.field1632.method2084();
            this.field1614.method2084();
            var8 = (int) ((double) (this.field1632.field1535 - this.field1632.field1537) * 32.768D / var3);
            var9 = (int) ((double) this.field1632.field1537 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1624[var11] != 0) {
                field1630[var11] = 0;
                field1613[var11] = (int) ((double) this.field1622[var11] * var3);
                field1620[var11] = (this.field1624[var11] << 14) / 100;
                field1628[var11] = (int) ((double) (this.field1631.field1535 - this.field1631.field1537) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1633[var11]) / var3);
                field1634[var11] = (int) ((double) this.field1631.field1537 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1631.method2085(arg0);
            int var14 = this.field1610.method2085(arg0);
            if (this.field1618 != null) {
                int var15 = this.field1618.method2085(arg0);
                int var16 = this.field1612.method2085(arg0);
                var13 += this.method2297(var7, var16, this.field1618.field1536) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1632 != null) {
                int var17 = this.field1632.method2085(arg0);
                int var18 = this.field1614.method2085(arg0);
                var14 = var14 * ((this.method2297(var10, var18, this.field1632.field1536) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1624[var19] != 0) {
                    int var20 = field1613[var19] + var12;
                    if (var20 < arg0) {
                        field1626[var20] += this.method2297(field1630[var19], field1620[var19] * var14 >> 15, this.field1631.field1536);
                        field1630[var19] += (field1628[var19] * var13 >> 16) + field1634[var19];
                    }
                }
            }
        }
        if (this.field1615 != null) {
            this.field1615.method2084();
            this.field1616.method2084();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1615.method2085(arg0);
                int var26 = this.field1616.method2085(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1615.field1535 - this.field1615.field1537) * var25 >> 8) + this.field1615.field1537;
                } else {
                    var27 = ((this.field1615.field1535 - this.field1615.field1537) * var26 >> 8) + this.field1615.field1537;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1626[var24] = 0;
                }
            }
        }
        if (this.field1617 > 0 && this.field1621 > 0) {
            int var28 = (int) ((double) this.field1617 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1626[var29] += field1626[var29 - var28] * this.field1621 / 100;
            }
        }
        if (this.field1619.field1592[0] > 0 || this.field1619.field1592[1] > 0) {
            this.field1623.method2084();
            int var30 = this.field1623.method2085(arg0 + 1);
            int var31 = this.field1619.method2280(0, (float) var30 / 65536.0F);
            int var32 = this.field1619.method2280(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1626[var31 + var33] * (long) Statics.field1597 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1626[var31 + var33 - 1 - var36] * (long) class116.field1598[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1626[var33 - 1 - var37] * (long) class116.field1598[1][var37] >> 16);
                    }
                    field1626[var33] = var35;
                    var30 = this.field1623.method2085(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1626[var31 + var33] * (long) Statics.field1597 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1626[var31 + var33 - 1 - var40] * (long) class116.field1598[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1626[var33 - 1 - var41] * (long) class116.field1598[1][var41] >> 16);
                        }
                        field1626[var33] = var39;
                        var30 = this.field1623.method2085(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1626[var31 + var33 - 1 - var43] * (long) class116.field1598[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1626[var33 - 1 - var44] * (long) class116.field1598[1][var44] >> 16);
                            }
                            field1626[var33] = var42;
                            this.field1623.method2085(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1619.method2280(0, (float) var30 / 65536.0F);
                    var32 = this.field1619.method2280(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1626[var46] < -32768) {
                field1626[var46] = -32768;
            }
            if (field1626[var46] > 32767) {
                field1626[var46] = 32767;
            }
        }
        return field1626;
    }

    @ObfuscatedName("dm.q(III)I")
    public final int method2297(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1611[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1627[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dm.o(Lgn;)V")
    public final void method2296(class194 arg0) {
        this.field1631 = new class108();
        this.field1631.method2082(arg0);
        this.field1610 = new class108();
        this.field1610.method2082(arg0);
        int var2 = arg0.method3247();
        if (var2 != 0) {
            arg0.field2538--;
            this.field1618 = new class108();
            this.field1618.method2082(arg0);
            this.field1612 = new class108();
            this.field1612.method2082(arg0);
        }
        int var3 = arg0.method3247();
        if (var3 != 0) {
            arg0.field2538--;
            this.field1632 = new class108();
            this.field1632.method2082(arg0);
            this.field1614 = new class108();
            this.field1614.method2082(arg0);
        }
        int var4 = arg0.method3247();
        if (var4 != 0) {
            arg0.field2538--;
            this.field1615 = new class108();
            this.field1615.method2082(arg0);
            this.field1616 = new class108();
            this.field1616.method2082(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3368();
            if (var6 == 0) {
                break;
            }
            this.field1624[var5] = var6;
            this.field1633[var5] = arg0.method3260();
            this.field1622[var5] = arg0.method3368();
        }
        this.field1617 = arg0.method3368();
        this.field1621 = arg0.method3368();
        this.field1609 = arg0.method3249();
        this.field1625 = arg0.method3249();
        this.field1619 = new class116();
        this.field1623 = new class108();
        this.field1619.method2285(arg0, this.field1623);
    }
}
