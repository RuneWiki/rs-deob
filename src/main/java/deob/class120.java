package deob;

import java.util.Random;

@ObfuscatedName("dd")
public class class120 {

    @ObfuscatedName("dd.t")
    public class109 field1648;

    @ObfuscatedName("dd.q")
    public class109 field1635;

    @ObfuscatedName("dd.i")
    public class109 field1636;

    @ObfuscatedName("dd.a")
    public class109 field1659;

    @ObfuscatedName("dd.l")
    public class109 field1638;

    @ObfuscatedName("dd.b")
    public class109 field1647;

    @ObfuscatedName("dd.e")
    public class109 field1640;

    @ObfuscatedName("dd.x")
    public class109 field1641;

    @ObfuscatedName("dd.p")
    public int[] field1642 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dd.g")
    public int[] field1651 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dd.n")
    public int[] field1643 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dd.o")
    public int field1644 = 0;

    @ObfuscatedName("dd.c")
    public int field1646 = 100;

    @ObfuscatedName("dd.v")
    public class117 field1639;

    @ObfuscatedName("dd.u")
    public class109 field1634;

    @ObfuscatedName("dd.j")
    public int field1649 = 500;

    @ObfuscatedName("dd.k")
    public int field1637 = 0;

    @ObfuscatedName("dd.z")
    public static int[] field1650;

    @ObfuscatedName("dd.w")
    public static int[] field1652 = new int[32768];

    @ObfuscatedName("dd.s")
    public static int[] field1653;

    @ObfuscatedName("dd.f")
    public static int[] field1655;

    @ObfuscatedName("dd.r")
    public static int[] field1656;

    @ObfuscatedName("dd.y")
    public static int[] field1657;

    @ObfuscatedName("dd.h")
    public static int[] field1658;

    @ObfuscatedName("dd.m")
    public static int[] field1645;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1652[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1653 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1653[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1650 = new int[220500];
        field1655 = new int[5];
        field1656 = new int[5];
        field1657 = new int[5];
        field1658 = new int[5];
        field1645 = new int[5];
    }

    @ObfuscatedName("dd.t(II)[I")
    public final int[] method2282(int arg0, int arg1) {
        class206.method3559(field1650, 0, arg0);
        if (arg1 < 10) {
            return field1650;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1648.method2087();
        this.field1635.method2087();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1636 != null) {
            this.field1636.method2087();
            this.field1659.method2087();
            var5 = (int) ((double) (this.field1636.field1563 - this.field1636.field1569) * 32.768D / var3);
            var6 = (int) ((double) this.field1636.field1569 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1638 != null) {
            this.field1638.method2087();
            this.field1647.method2087();
            var8 = (int) ((double) (this.field1638.field1563 - this.field1638.field1569) * 32.768D / var3);
            var9 = (int) ((double) this.field1638.field1569 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1642[var11] != 0) {
                field1655[var11] = 0;
                field1656[var11] = (int) ((double) this.field1643[var11] * var3);
                field1657[var11] = (this.field1642[var11] << 14) / 100;
                field1658[var11] = (int) ((double) (this.field1648.field1563 - this.field1648.field1569) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1651[var11]) / var3);
                field1645[var11] = (int) ((double) this.field1648.field1569 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1648.method2091(arg0);
            int var14 = this.field1635.method2091(arg0);
            if (this.field1636 != null) {
                int var15 = this.field1636.method2091(arg0);
                int var16 = this.field1659.method2091(arg0);
                var13 += this.method2278(var7, var16, this.field1636.field1559) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1638 != null) {
                int var17 = this.field1638.method2091(arg0);
                int var18 = this.field1647.method2091(arg0);
                var14 = var14 * ((this.method2278(var10, var18, this.field1638.field1559) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1642[var19] != 0) {
                    int var20 = field1656[var19] + var12;
                    if (var20 < arg0) {
                        field1650[var20] += this.method2278(field1655[var19], field1657[var19] * var14 >> 15, this.field1648.field1559);
                        field1655[var19] += (field1658[var19] * var13 >> 16) + field1645[var19];
                    }
                }
            }
        }
        if (this.field1640 != null) {
            this.field1640.method2087();
            this.field1641.method2087();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1640.method2091(arg0);
                int var26 = this.field1641.method2091(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1640.field1563 - this.field1640.field1569) * var25 >> 8) + this.field1640.field1569;
                } else {
                    var27 = ((this.field1640.field1563 - this.field1640.field1569) * var26 >> 8) + this.field1640.field1569;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1650[var24] = 0;
                }
            }
        }
        if (this.field1644 > 0 && this.field1646 > 0) {
            int var28 = (int) ((double) this.field1644 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1650[var29] += field1650[var29 - var28] * this.field1646 / 100;
            }
        }
        if (this.field1639.field1621[0] > 0 || this.field1639.field1621[1] > 0) {
            this.field1634.method2087();
            int var30 = this.field1634.method2091(arg0 + 1);
            int var31 = this.field1639.method2264(0, (float) var30 / 65536.0F);
            int var32 = this.field1639.method2264(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1650[var31 + var33] * (long) Statics.field1615 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1650[var31 + var33 - 1 - var36] * (long) class117.field1620[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1650[var33 - 1 - var37] * (long) class117.field1620[1][var37] >> 16);
                    }
                    field1650[var33] = var35;
                    var30 = this.field1634.method2091(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1650[var31 + var33] * (long) Statics.field1615 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1650[var31 + var33 - 1 - var40] * (long) class117.field1620[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1650[var33 - 1 - var41] * (long) class117.field1620[1][var41] >> 16);
                        }
                        field1650[var33] = var39;
                        var30 = this.field1634.method2091(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1650[var31 + var33 - 1 - var43] * (long) class117.field1620[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1650[var33 - 1 - var44] * (long) class117.field1620[1][var44] >> 16);
                            }
                            field1650[var33] = var42;
                            this.field1634.method2091(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1639.method2264(0, (float) var30 / 65536.0F);
                    var32 = this.field1639.method2264(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1650[var46] < -32768) {
                field1650[var46] = -32768;
            }
            if (field1650[var46] > 32767) {
                field1650[var46] = 32767;
            }
        }
        return field1650;
    }

    @ObfuscatedName("dd.q(III)I")
    public final int method2278(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1653[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1652[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dd.i(Lgb;)V")
    public final void method2279(class195 arg0) {
        this.field1648 = new class109();
        this.field1648.method2085(arg0);
        this.field1635 = new class109();
        this.field1635.method2085(arg0);
        int var2 = arg0.method3236();
        if (var2 != 0) {
            arg0.field2545--;
            this.field1636 = new class109();
            this.field1636.method2085(arg0);
            this.field1659 = new class109();
            this.field1659.method2085(arg0);
        }
        int var3 = arg0.method3236();
        if (var3 != 0) {
            arg0.field2545--;
            this.field1638 = new class109();
            this.field1638.method2085(arg0);
            this.field1647 = new class109();
            this.field1647.method2085(arg0);
        }
        int var4 = arg0.method3236();
        if (var4 != 0) {
            arg0.field2545--;
            this.field1640 = new class109();
            this.field1640.method2085(arg0);
            this.field1641 = new class109();
            this.field1641.method2085(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3244();
            if (var6 == 0) {
                break;
            }
            this.field1642[var5] = var6;
            this.field1651[var5] = arg0.method3249();
            this.field1643[var5] = arg0.method3244();
        }
        this.field1644 = arg0.method3244();
        this.field1646 = arg0.method3244();
        this.field1649 = arg0.method3238();
        this.field1637 = arg0.method3238();
        this.field1639 = new class117();
        this.field1634 = new class109();
        this.field1639.method2266(arg0, this.field1634);
    }
}
