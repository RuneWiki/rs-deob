package deob;

import java.util.Random;

@ObfuscatedName("dq")
public class class120 {

    @ObfuscatedName("dq.w")
    public class109 field1737;

    @ObfuscatedName("dq.s")
    public class109 field1713;

    @ObfuscatedName("dq.q")
    public class109 field1730;

    @ObfuscatedName("dq.o")
    public class109 field1715;

    @ObfuscatedName("dq.g")
    public class109 field1716;

    @ObfuscatedName("dq.v")
    public class109 field1734;

    @ObfuscatedName("dq.p")
    public class109 field1718;

    @ObfuscatedName("dq.e")
    public class109 field1712;

    @ObfuscatedName("dq.d")
    public int[] field1720 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dq.x")
    public int[] field1721 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dq.z")
    public int[] field1722 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dq.n")
    public int field1719 = 0;

    @ObfuscatedName("dq.u")
    public int field1724 = 100;

    @ObfuscatedName("dq.t")
    public class117 field1717;

    @ObfuscatedName("dq.a")
    public class109 field1726;

    @ObfuscatedName("dq.i")
    public int field1727 = 500;

    @ObfuscatedName("dq.h")
    public int field1728 = 0;

    @ObfuscatedName("dq.b")
    public static int[] field1729;

    @ObfuscatedName("dq.j")
    public static int[] field1736 = new int[32768];

    @ObfuscatedName("dq.y")
    public static int[] field1731;

    @ObfuscatedName("dq.c")
    public static int[] field1714;

    @ObfuscatedName("dq.r")
    public static int[] field1733;

    @ObfuscatedName("dq.m")
    public static int[] field1735;

    @ObfuscatedName("dq.l")
    public static int[] field1725;

    @ObfuscatedName("dq.f")
    public static int[] field1732;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1736[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1731 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1731[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1729 = new int[220500];
        field1714 = new int[5];
        field1733 = new int[5];
        field1735 = new int[5];
        field1725 = new int[5];
        field1732 = new int[5];
    }

    @ObfuscatedName("dq.w(II)[I")
    public final int[] method2166(int arg0, int arg1) {
        class184.method3284(field1729, 0, arg0);
        if (arg1 < 10) {
            return field1729;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1737.method1962();
        this.field1713.method1962();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1730 != null) {
            this.field1730.method1962();
            this.field1715.method1962();
            var5 = (int) ((double) (this.field1730.field1642 - this.field1730.field1647) * 32.768D / var3);
            var6 = (int) ((double) this.field1730.field1647 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1716 != null) {
            this.field1716.method1962();
            this.field1734.method1962();
            var8 = (int) ((double) (this.field1716.field1642 - this.field1716.field1647) * 32.768D / var3);
            var9 = (int) ((double) this.field1716.field1647 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1720[var11] != 0) {
                field1714[var11] = 0;
                field1733[var11] = (int) ((double) this.field1722[var11] * var3);
                field1735[var11] = (this.field1720[var11] << 14) / 100;
                field1725[var11] = (int) ((double) (this.field1737.field1642 - this.field1737.field1647) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1721[var11]) / var3);
                field1732[var11] = (int) ((double) this.field1737.field1647 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1737.method1957(arg0);
            int var14 = this.field1713.method1957(arg0);
            if (this.field1730 != null) {
                int var15 = this.field1730.method1957(arg0);
                int var16 = this.field1715.method1957(arg0);
                var13 += this.method2167(var7, var16, this.field1730.field1643) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1716 != null) {
                int var17 = this.field1716.method1957(arg0);
                int var18 = this.field1734.method1957(arg0);
                var14 = var14 * ((this.method2167(var10, var18, this.field1716.field1643) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1720[var19] != 0) {
                    int var20 = field1733[var19] + var12;
                    if (var20 < arg0) {
                        field1729[var20] += this.method2167(field1714[var19], field1735[var19] * var14 >> 15, this.field1737.field1643);
                        field1714[var19] += (field1725[var19] * var13 >> 16) + field1732[var19];
                    }
                }
            }
        }
        if (this.field1718 != null) {
            this.field1718.method1962();
            this.field1712.method1962();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1718.method1957(arg0);
                int var26 = this.field1712.method1957(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1718.field1642 - this.field1718.field1647) * var25 >> 8) + this.field1718.field1647;
                } else {
                    var27 = ((this.field1718.field1642 - this.field1718.field1647) * var26 >> 8) + this.field1718.field1647;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1729[var24] = 0;
                }
            }
        }
        if (this.field1719 > 0 && this.field1724 > 0) {
            int var28 = (int) ((double) this.field1719 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1729[var29] += field1729[var29 - var28] * this.field1724 / 100;
            }
        }
        if (this.field1717.field1693[0] > 0 || this.field1717.field1693[1] > 0) {
            this.field1726.method1962();
            int var30 = this.field1726.method1957(arg0 + 1);
            int var31 = this.field1717.method2160(0, (float) var30 / 65536.0F);
            int var32 = this.field1717.method2160(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1729[var31 + var33] * (long) Statics.field1700 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1729[var31 + var33 - 1 - var36] * (long) class117.field1698[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1729[var33 - 1 - var37] * (long) class117.field1698[1][var37] >> 16);
                    }
                    field1729[var33] = var35;
                    var30 = this.field1726.method1957(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1729[var31 + var33] * (long) Statics.field1700 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1729[var31 + var33 - 1 - var40] * (long) class117.field1698[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1729[var33 - 1 - var41] * (long) class117.field1698[1][var41] >> 16);
                        }
                        field1729[var33] = var39;
                        var30 = this.field1726.method1957(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1729[var31 + var33 - 1 - var43] * (long) class117.field1698[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1729[var33 - 1 - var44] * (long) class117.field1698[1][var44] >> 16);
                            }
                            field1729[var33] = var42;
                            this.field1726.method1957(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1717.method2160(0, (float) var30 / 65536.0F);
                    var32 = this.field1717.method2160(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1729[var46] < -32768) {
                field1729[var46] = -32768;
            }
            if (field1729[var46] > 32767) {
                field1729[var46] = 32767;
            }
        }
        return field1729;
    }

    @ObfuscatedName("dq.s(III)I")
    public final int method2167(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1731[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1736[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dq.q(Lfz;)V")
    public final void method2168(class174 arg0) {
        this.field1737 = new class109();
        this.field1737.method1959(arg0);
        this.field1713 = new class109();
        this.field1713.method1959(arg0);
        int var2 = arg0.method2971();
        if (var2 != 0) {
            arg0.field2390--;
            this.field1730 = new class109();
            this.field1730.method1959(arg0);
            this.field1715 = new class109();
            this.field1715.method1959(arg0);
        }
        int var3 = arg0.method2971();
        if (var3 != 0) {
            arg0.field2390--;
            this.field1716 = new class109();
            this.field1716.method1959(arg0);
            this.field1734 = new class109();
            this.field1734.method1959(arg0);
        }
        int var4 = arg0.method2971();
        if (var4 != 0) {
            arg0.field2390--;
            this.field1718 = new class109();
            this.field1718.method1959(arg0);
            this.field1712 = new class109();
            this.field1712.method1959(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2985();
            if (var6 == 0) {
                break;
            }
            this.field1720[var5] = var6;
            this.field1721[var5] = arg0.method3145();
            this.field1722[var5] = arg0.method2985();
        }
        this.field1719 = arg0.method2985();
        this.field1724 = arg0.method2985();
        this.field1727 = arg0.method3178();
        this.field1728 = arg0.method3178();
        this.field1717 = new class117();
        this.field1726 = new class109();
        this.field1717.method2150(arg0, this.field1726);
    }
}
