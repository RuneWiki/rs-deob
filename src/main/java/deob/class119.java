package deob;

import java.util.Random;

@ObfuscatedName("dq")
public class class119 {

    @ObfuscatedName("dq.p")
    public class108 field1608;

    @ObfuscatedName("dq.i")
    public class108 field1629;

    @ObfuscatedName("dq.w")
    public class108 field1624;

    @ObfuscatedName("dq.s")
    public class108 field1610;

    @ObfuscatedName("dq.j")
    public class108 field1611;

    @ObfuscatedName("dq.a")
    public class108 field1612;

    @ObfuscatedName("dq.t")
    public class108 field1613;

    @ObfuscatedName("dq.r")
    public class108 field1614;

    @ObfuscatedName("dq.m")
    public int[] field1615 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dq.h")
    public int[] field1607 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dq.o")
    public int[] field1625 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dq.x")
    public int field1621 = 0;

    @ObfuscatedName("dq.q")
    public int field1619 = 100;

    @ObfuscatedName("dq.v")
    public class116 field1620;

    @ObfuscatedName("dq.n")
    public class108 field1618;

    @ObfuscatedName("dq.y")
    public int field1622 = 500;

    @ObfuscatedName("dq.d")
    public int field1616 = 0;

    @ObfuscatedName("dq.l")
    public static int[] field1623;

    @ObfuscatedName("dq.f")
    public static int[] field1626 = new int[32768];

    @ObfuscatedName("dq.k")
    public static int[] field1609;

    @ObfuscatedName("dq.u")
    public static int[] field1628;

    @ObfuscatedName("dq.g")
    public static int[] field1617;

    @ObfuscatedName("dq.z")
    public static int[] field1630;

    @ObfuscatedName("dq.b")
    public static int[] field1631;

    @ObfuscatedName("dq.c")
    public static int[] field1632;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1626[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1609 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1609[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1623 = new int[220500];
        field1628 = new int[5];
        field1617 = new int[5];
        field1630 = new int[5];
        field1631 = new int[5];
        field1632 = new int[5];
    }

    @ObfuscatedName("dq.p(II)[I")
    public final int[] method2272(int arg0, int arg1) {
        class195.method3424(field1623, 0, arg0);
        if (arg1 < 10) {
            return field1623;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1608.method2073();
        this.field1629.method2073();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1624 != null) {
            this.field1624.method2073();
            this.field1610.method2073();
            var5 = (int) ((double) (this.field1624.field1540 - this.field1624.field1539) * 32.768D / var3);
            var6 = (int) ((double) this.field1624.field1539 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1611 != null) {
            this.field1611.method2073();
            this.field1612.method2073();
            var8 = (int) ((double) (this.field1611.field1540 - this.field1611.field1539) * 32.768D / var3);
            var9 = (int) ((double) this.field1611.field1539 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1615[var11] != 0) {
                field1628[var11] = 0;
                field1617[var11] = (int) ((double) this.field1625[var11] * var3);
                field1630[var11] = (this.field1615[var11] << 14) / 100;
                field1631[var11] = (int) ((double) (this.field1608.field1540 - this.field1608.field1539) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1607[var11]) / var3);
                field1632[var11] = (int) ((double) this.field1608.field1539 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1608.method2074(arg0);
            int var14 = this.field1629.method2074(arg0);
            if (this.field1624 != null) {
                int var15 = this.field1624.method2074(arg0);
                int var16 = this.field1610.method2074(arg0);
                var13 += this.method2271(var7, var16, this.field1624.field1543) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1611 != null) {
                int var17 = this.field1611.method2074(arg0);
                int var18 = this.field1612.method2074(arg0);
                var14 = var14 * ((this.method2271(var10, var18, this.field1611.field1543) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1615[var19] != 0) {
                    int var20 = field1617[var19] + var12;
                    if (var20 < arg0) {
                        field1623[var20] += this.method2271(field1628[var19], field1630[var19] * var14 >> 15, this.field1608.field1543);
                        field1628[var19] += (field1631[var19] * var13 >> 16) + field1632[var19];
                    }
                }
            }
        }
        if (this.field1613 != null) {
            this.field1613.method2073();
            this.field1614.method2073();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1613.method2074(arg0);
                int var26 = this.field1614.method2074(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1613.field1540 - this.field1613.field1539) * var25 >> 8) + this.field1613.field1539;
                } else {
                    var27 = ((this.field1613.field1540 - this.field1613.field1539) * var26 >> 8) + this.field1613.field1539;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1623[var24] = 0;
                }
            }
        }
        if (this.field1621 > 0 && this.field1619 > 0) {
            int var28 = (int) ((double) this.field1621 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1623[var29] += field1623[var29 - var28] * this.field1619 / 100;
            }
        }
        if (this.field1620.field1597[0] > 0 || this.field1620.field1597[1] > 0) {
            this.field1618.method2073();
            int var30 = this.field1618.method2074(arg0 + 1);
            int var31 = this.field1620.method2251(0, (float) var30 / 65536.0F);
            int var32 = this.field1620.method2251(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1623[var31 + var33] * (long) Statics.field1595 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1623[var31 + var33 - 1 - var36] * (long) class116.field1593[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1623[var33 - 1 - var37] * (long) class116.field1593[1][var37] >> 16);
                    }
                    field1623[var33] = var35;
                    var30 = this.field1618.method2074(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1623[var31 + var33] * (long) Statics.field1595 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1623[var31 + var33 - 1 - var40] * (long) class116.field1593[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1623[var33 - 1 - var41] * (long) class116.field1593[1][var41] >> 16);
                        }
                        field1623[var33] = var39;
                        var30 = this.field1618.method2074(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1623[var31 + var33 - 1 - var43] * (long) class116.field1593[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1623[var33 - 1 - var44] * (long) class116.field1593[1][var44] >> 16);
                            }
                            field1623[var33] = var42;
                            this.field1618.method2074(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1620.method2251(0, (float) var30 / 65536.0F);
                    var32 = this.field1620.method2251(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1623[var46] < -32768) {
                field1623[var46] = -32768;
            }
            if (field1623[var46] > 32767) {
                field1623[var46] = 32767;
            }
        }
        return field1623;
    }

    @ObfuscatedName("dq.i(III)I")
    public final int method2271(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1609[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1626[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dq.w(Lgj;)V")
    public final void method2270(class185 arg0) {
        this.field1608 = new class108();
        this.field1608.method2075(arg0);
        this.field1629 = new class108();
        this.field1629.method2075(arg0);
        int var2 = arg0.method3197();
        if (var2 != 0) {
            arg0.field2488--;
            this.field1624 = new class108();
            this.field1624.method2075(arg0);
            this.field1610 = new class108();
            this.field1610.method2075(arg0);
        }
        int var3 = arg0.method3197();
        if (var3 != 0) {
            arg0.field2488--;
            this.field1611 = new class108();
            this.field1611.method2075(arg0);
            this.field1612 = new class108();
            this.field1612.method2075(arg0);
        }
        int var4 = arg0.method3197();
        if (var4 != 0) {
            arg0.field2488--;
            this.field1613 = new class108();
            this.field1613.method2075(arg0);
            this.field1614 = new class108();
            this.field1614.method2075(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3136();
            if (var6 == 0) {
                break;
            }
            this.field1615[var5] = var6;
            this.field1607[var5] = arg0.method3224();
            this.field1625[var5] = arg0.method3136();
        }
        this.field1621 = arg0.method3136();
        this.field1619 = arg0.method3136();
        this.field1622 = arg0.method3124();
        this.field1616 = arg0.method3124();
        this.field1620 = new class116();
        this.field1618 = new class108();
        this.field1620.method2248(arg0, this.field1618);
    }
}
