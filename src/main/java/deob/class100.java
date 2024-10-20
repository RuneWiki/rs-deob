package deob;

@ObfuscatedName("cm")
public class class100 extends class80 {

    @ObfuscatedName("cm.p")
    public static class100 field1780 = new class100();

    @ObfuscatedName("cm.k")
    public static byte[] field1788 = new byte[1];

    @ObfuscatedName("cm.e")
    public static class100 field1753 = new class100();

    @ObfuscatedName("cm.f")
    public static byte[] field1732 = new byte[1];

    @ObfuscatedName("cm.w")
    public int field1733 = 0;

    @ObfuscatedName("cm.t")
    public int[] field1734;

    @ObfuscatedName("cm.s")
    public int[] field1735;

    @ObfuscatedName("cm.c")
    public int[] field1736;

    @ObfuscatedName("cm.d")
    public int field1748 = 0;

    @ObfuscatedName("cm.v")
    public int[] field1738;

    @ObfuscatedName("cm.m")
    public int[] field1760;

    @ObfuscatedName("cm.h")
    public int[] field1740;

    @ObfuscatedName("cm.n")
    public int[] field1741;

    @ObfuscatedName("cm.x")
    public int[] field1742;

    @ObfuscatedName("cm.o")
    public int[] field1750;

    @ObfuscatedName("cm.r")
    public byte[] field1737;

    @ObfuscatedName("cm.y")
    public byte[] field1730;

    @ObfuscatedName("cm.i")
    public byte[] field1746;

    @ObfuscatedName("cm.q")
    public short[] field1747;

    @ObfuscatedName("cm.g")
    public byte field1745 = 0;

    @ObfuscatedName("cm.l")
    public int field1749 = 0;

    @ObfuscatedName("cm.u")
    public int[] field1762;

    @ObfuscatedName("cm.j")
    public int[] field1751;

    @ObfuscatedName("cm.z")
    public int[] field1743;

    @ObfuscatedName("cm.b")
    public int[][] field1756;

    @ObfuscatedName("cm.a")
    public int[][] field1729;

    @ObfuscatedName("cm.ag")
    public boolean field1755 = false;

    @ObfuscatedName("cm.am")
    public int field1744;

    @ObfuscatedName("cm.aa")
    public int field1757;

    @ObfuscatedName("cm.az")
    public int field1731;

    @ObfuscatedName("cm.aq")
    public int field1759;

    @ObfuscatedName("cm.ak")
    public int field1739;

    @ObfuscatedName("cm.al")
    public static boolean[] field1758 = new boolean[4096];

    @ObfuscatedName("cm.au")
    public static boolean[] field1763 = new boolean[4096];

    @ObfuscatedName("cm.ao")
    public static int[] field1777 = new int[4096];

    @ObfuscatedName("cm.af")
    public static int[] field1765 = new int[4096];

    @ObfuscatedName("cm.ai")
    public static int[] field1766 = new int[4096];

    @ObfuscatedName("cm.aj")
    public static int[] field1767 = new int[4096];

    @ObfuscatedName("cm.aw")
    public static int[] field1768 = new int[4096];

    @ObfuscatedName("cm.ab")
    public static int[] field1769 = new int[4096];

    @ObfuscatedName("cm.ae")
    public static int[] field1771 = new int[1600];

    @ObfuscatedName("cm.ay")
    public static int[][] field1793 = new int[1600][512];

    @ObfuscatedName("cm.ap")
    public static int[] field1773 = new int[12];

    @ObfuscatedName("cm.av")
    public static int[][] field1774 = new int[12][2000];

    @ObfuscatedName("cm.ah")
    public static int[] field1775 = new int[2000];

    @ObfuscatedName("cm.at")
    public static int[] field1776 = new int[2000];

    @ObfuscatedName("cm.an")
    public static int[] field1786 = new int[12];

    @ObfuscatedName("cm.ac")
    public static int[] field1778 = new int[10];

    @ObfuscatedName("cm.as")
    public static int[] field1779 = new int[10];

    @ObfuscatedName("cm.ax")
    public static int[] field1772 = new int[10];

    @ObfuscatedName("cm.by")
    public static boolean field1784 = false;

    @ObfuscatedName("cm.bb")
    public static int field1785 = 0;

    @ObfuscatedName("cm.bp")
    public static int field1752 = 0;

    @ObfuscatedName("cm.bc")
    public static int field1787 = 0;

    @ObfuscatedName("cm.bx")
    public static int[] field1754 = new int[1000];

    @ObfuscatedName("cm.bt")
    public static int[] field1789 = class86.field1519;

    @ObfuscatedName("cm.bv")
    public static int[] field1790 = class86.field1516;

    @ObfuscatedName("cm.bh")
    public static int[] field1791 = class86.field1515;

    @ObfuscatedName("cm.bj")
    public static int[] field1764 = class86.field1496;

    public class100() {
    }

    public class100(class100[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1733 = 0;
        this.field1748 = 0;
        this.field1749 = 0;
        this.field1745 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class100 var8 = arg0[var7];
            if (var8 != null) {
                this.field1733 += var8.field1733;
                this.field1748 += var8.field1748;
                this.field1749 += var8.field1749;
                if (var8.field1737 == null) {
                    if (this.field1745 == -1) {
                        this.field1745 = var8.field1745;
                    }
                    if (this.field1745 != var8.field1745) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1730 != null;
                var5 |= var8.field1747 != null;
                var6 |= var8.field1746 != null;
            }
        }
        this.field1734 = new int[this.field1733];
        this.field1735 = new int[this.field1733];
        this.field1736 = new int[this.field1733];
        this.field1738 = new int[this.field1748];
        this.field1760 = new int[this.field1748];
        this.field1740 = new int[this.field1748];
        this.field1741 = new int[this.field1748];
        this.field1742 = new int[this.field1748];
        this.field1750 = new int[this.field1748];
        if (var3) {
            this.field1737 = new byte[this.field1748];
        }
        if (var4) {
            this.field1730 = new byte[this.field1748];
        }
        if (var5) {
            this.field1747 = new short[this.field1748];
        }
        if (var6) {
            this.field1746 = new byte[this.field1748];
        }
        if (this.field1749 > 0) {
            this.field1762 = new int[this.field1749];
            this.field1751 = new int[this.field1749];
            this.field1743 = new int[this.field1749];
        }
        this.field1733 = 0;
        this.field1748 = 0;
        this.field1749 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class100 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1748; var11++) {
                    this.field1738[this.field1748] = var10.field1738[var11] + this.field1733;
                    this.field1760[this.field1748] = var10.field1760[var11] + this.field1733;
                    this.field1740[this.field1748] = var10.field1740[var11] + this.field1733;
                    this.field1741[this.field1748] = var10.field1741[var11];
                    this.field1742[this.field1748] = var10.field1742[var11];
                    this.field1750[this.field1748] = var10.field1750[var11];
                    if (var3) {
                        if (var10.field1737 == null) {
                            this.field1737[this.field1748] = var10.field1745;
                        } else {
                            this.field1737[this.field1748] = var10.field1737[var11];
                        }
                    }
                    if (var4 && var10.field1730 != null) {
                        this.field1730[this.field1748] = var10.field1730[var11];
                    }
                    if (var5) {
                        if (var10.field1747 == null) {
                            this.field1747[this.field1748] = -1;
                        } else {
                            this.field1747[this.field1748] = var10.field1747[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1746 == null || var10.field1746[var11] == -1) {
                            this.field1746[this.field1748] = -1;
                        } else {
                            this.field1746[this.field1748] = (byte) (var10.field1746[var11] + this.field1749);
                        }
                    }
                    this.field1748++;
                }
                for (int var12 = 0; var12 < var10.field1749; var12++) {
                    this.field1762[this.field1749] = var10.field1762[var12] + this.field1733;
                    this.field1751[this.field1749] = var10.field1751[var12] + this.field1733;
                    this.field1743[this.field1749] = var10.field1743[var12] + this.field1733;
                    this.field1749++;
                }
                for (int var13 = 0; var13 < var10.field1733; var13++) {
                    this.field1734[this.field1733] = var10.field1734[var13];
                    this.field1735[this.field1733] = var10.field1735[var13];
                    this.field1736[this.field1733] = var10.field1736[var13];
                    this.field1733++;
                }
            }
        }
    }

    @ObfuscatedName("cm.p([[IIIIZI)Lcm;")
    public class100 method2023(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2053();
        int var7 = arg1 - this.field1731;
        int var8 = this.field1731 + arg1;
        int var9 = arg3 - this.field1731;
        int var10 = this.field1731 + arg3;
        if (var7 < 0 || var8 + 128 >> 7 >= arg0.length || var9 < 0 || var10 + 128 >> 7 >= arg0[0].length) {
            return this;
        }
        int var11 = var7 >> 7;
        int var12 = var8 + 127 >> 7;
        int var13 = var9 >> 7;
        int var14 = var10 + 127 >> 7;
        if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
            return this;
        }
        class100 var15;
        if (arg4) {
            var15 = new class100();
            var15.field1733 = this.field1733;
            var15.field1748 = this.field1748;
            var15.field1749 = this.field1749;
            var15.field1734 = this.field1734;
            var15.field1736 = this.field1736;
            var15.field1738 = this.field1738;
            var15.field1760 = this.field1760;
            var15.field1740 = this.field1740;
            var15.field1741 = this.field1741;
            var15.field1742 = this.field1742;
            var15.field1750 = this.field1750;
            var15.field1737 = this.field1737;
            var15.field1730 = this.field1730;
            var15.field1746 = this.field1746;
            var15.field1747 = this.field1747;
            var15.field1745 = this.field1745;
            var15.field1762 = this.field1762;
            var15.field1751 = this.field1751;
            var15.field1743 = this.field1743;
            var15.field1756 = this.field1756;
            var15.field1729 = this.field1729;
            var15.field1755 = this.field1755;
            var15.field1735 = new int[var15.field1733];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1733; var16++) {
                int var17 = this.field1734[var16] + arg1;
                int var18 = this.field1736[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1735[var16] = this.field1735[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1733; var26++) {
                int var27 = (-this.field1735[var26] << 16) / this.field1390;
                if (var27 < arg5) {
                    int var28 = this.field1734[var26] + arg1;
                    int var29 = this.field1736[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1735[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1735[var26];
                }
            }
        }
        var15.field1744 = 0;
        return var15;
    }

    @ObfuscatedName("cm.e(Z)Lcm;")
    public class100 method2024(boolean arg0) {
        if (!arg0 && field1788.length < this.field1748) {
            field1788 = new byte[this.field1748 + 100];
        }
        return this.method2026(arg0, field1780, field1788);
    }

    @ObfuscatedName("cm.f(Z)Lcm;")
    public class100 method2025(boolean arg0) {
        if (!arg0 && field1732.length < this.field1748) {
            field1732 = new byte[this.field1748 + 100];
        }
        return this.method2026(arg0, field1753, field1732);
    }

    @ObfuscatedName("cm.w(ZLcm;[B)Lcm;")
    public class100 method2026(boolean arg0, class100 arg1, byte[] arg2) {
        arg1.field1733 = this.field1733;
        arg1.field1748 = this.field1748;
        arg1.field1749 = this.field1749;
        if (arg1.field1734 == null || arg1.field1734.length < this.field1733) {
            arg1.field1734 = new int[this.field1733 + 100];
            arg1.field1735 = new int[this.field1733 + 100];
            arg1.field1736 = new int[this.field1733 + 100];
        }
        for (int var4 = 0; var4 < this.field1733; var4++) {
            arg1.field1734[var4] = this.field1734[var4];
            arg1.field1735[var4] = this.field1735[var4];
            arg1.field1736[var4] = this.field1736[var4];
        }
        if (arg0) {
            arg1.field1730 = this.field1730;
        } else {
            arg1.field1730 = arg2;
            if (this.field1730 == null) {
                for (int var5 = 0; var5 < this.field1748; var5++) {
                    arg1.field1730[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1748; var6++) {
                    arg1.field1730[var6] = this.field1730[var6];
                }
            }
        }
        arg1.field1738 = this.field1738;
        arg1.field1760 = this.field1760;
        arg1.field1740 = this.field1740;
        arg1.field1741 = this.field1741;
        arg1.field1742 = this.field1742;
        arg1.field1750 = this.field1750;
        arg1.field1737 = this.field1737;
        arg1.field1746 = this.field1746;
        arg1.field1747 = this.field1747;
        arg1.field1745 = this.field1745;
        arg1.field1762 = this.field1762;
        arg1.field1751 = this.field1751;
        arg1.field1743 = this.field1743;
        arg1.field1756 = this.field1756;
        arg1.field1729 = this.field1729;
        arg1.field1755 = this.field1755;
        arg1.field1744 = 0;
        return arg1;
    }

    @ObfuscatedName("cm.t()V")
    public void method2053() {
        if (this.field1744 == 1) {
            return;
        }
        this.field1744 = 1;
        this.field1390 = 0;
        this.field1757 = 0;
        this.field1731 = 0;
        for (int var1 = 0; var1 < this.field1733; var1++) {
            int var2 = this.field1734[var1];
            int var3 = this.field1735[var1];
            int var4 = this.field1736[var1];
            if (-var3 > this.field1390) {
                this.field1390 = -var3;
            }
            if (var3 > this.field1757) {
                this.field1757 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1731) {
                this.field1731 = var5;
            }
        }
        this.field1731 = (int) (Math.sqrt((double) this.field1731) + 0.99D);
        this.field1739 = (int) (Math.sqrt((double) (this.field1390 * this.field1390 + this.field1731 * this.field1731)) + 0.99D);
        this.field1759 = this.field1739 + (int) (Math.sqrt((double) (this.field1757 * this.field1757 + this.field1731 * this.field1731)) + 0.99D);
    }

    @ObfuscatedName("cm.d()V")
    public void method2028() {
        if (this.field1744 == 2) {
            return;
        }
        this.field1744 = 2;
        this.field1731 = 0;
        for (int var1 = 0; var1 < this.field1733; var1++) {
            int var2 = this.field1734[var1];
            int var3 = this.field1735[var1];
            int var4 = this.field1736[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1731) {
                this.field1731 = var5;
            }
        }
        this.field1731 = (int) (Math.sqrt((double) this.field1731) + 0.99D);
        this.field1739 = this.field1731;
        this.field1759 = this.field1731 + this.field1731;
    }

    @ObfuscatedName("cm.v()I")
    public int method2029() {
        this.method2053();
        return this.field1731;
    }

    @ObfuscatedName("cm.m(Lck;I)V")
    public void method2083(class98 arg0, int arg1) {
        if (this.field1756 == null || arg1 == -1) {
            return;
        }
        class83 var3 = arg0.field1707[arg1];
        class97 var4 = var3.field1473;
        Statics.field1781 = 0;
        Statics.field1782 = 0;
        Statics.field1783 = 0;
        for (int var5 = 0; var5 < var3.field1474; var5++) {
            int var6 = var3.field1475[var5];
            this.method2068(var4.field1698[var6], var4.field1701[var6], var3.field1476[var5], var3.field1478[var5], var3.field1472[var5]);
        }
        this.field1744 = 0;
    }

    @ObfuscatedName("cm.h(Lck;ILck;I[I)V")
    public void method2059(class98 arg0, int arg1, class98 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2083(arg0, arg1);
            return;
        }
        class83 var6 = arg0.field1707[arg1];
        class83 var7 = arg2.field1707[arg3];
        class97 var8 = var6.field1473;
        Statics.field1781 = 0;
        Statics.field1782 = 0;
        Statics.field1783 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1474; var11++) {
            int var12 = var6.field1475[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1698[var12] == 0) {
                this.method2068(var8.field1698[var12], var8.field1701[var12], var6.field1476[var11], var6.field1478[var11], var6.field1472[var11]);
            }
        }
        Statics.field1781 = 0;
        Statics.field1782 = 0;
        Statics.field1783 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1474; var15++) {
            int var16 = var7.field1475[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1698[var16] == 0) {
                this.method2068(var8.field1698[var16], var8.field1701[var16], var7.field1476[var15], var7.field1478[var15], var7.field1472[var15]);
            }
        }
        this.field1744 = 0;
    }

    @ObfuscatedName("cm.n(I[IIII)V")
    public void method2068(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1781 = 0;
            Statics.field1782 = 0;
            Statics.field1783 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1756.length) {
                    int[] var10 = this.field1756[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1781 += this.field1734[var12];
                        Statics.field1782 += this.field1735[var12];
                        Statics.field1783 += this.field1736[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1781 = Statics.field1781 / var7 + arg2;
                Statics.field1782 = Statics.field1782 / var7 + arg3;
                Statics.field1783 = Statics.field1783 / var7 + arg4;
            } else {
                Statics.field1781 = arg2;
                Statics.field1782 = arg3;
                Statics.field1783 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1756.length) {
                    int[] var15 = this.field1756[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1734[var17] += arg2;
                        this.field1735[var17] += arg3;
                        this.field1736[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1756.length) {
                    int[] var20 = this.field1756[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1734[var22] -= Statics.field1781;
                        this.field1735[var22] -= Statics.field1782;
                        this.field1736[var22] -= Statics.field1783;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1789[var25];
                            int var27 = field1790[var25];
                            int var28 = this.field1735[var22] * var26 + this.field1734[var22] * var27 >> 16;
                            this.field1735[var22] = this.field1735[var22] * var27 - this.field1734[var22] * var26 >> 16;
                            this.field1734[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1789[var23];
                            int var30 = field1790[var23];
                            int var31 = this.field1735[var22] * var30 - this.field1736[var22] * var29 >> 16;
                            this.field1736[var22] = this.field1736[var22] * var30 + this.field1735[var22] * var29 >> 16;
                            this.field1735[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1789[var24];
                            int var33 = field1790[var24];
                            int var34 = this.field1736[var22] * var32 + this.field1734[var22] * var33 >> 16;
                            this.field1736[var22] = this.field1736[var22] * var33 - this.field1734[var22] * var32 >> 16;
                            this.field1734[var22] = var34;
                        }
                        this.field1734[var22] += Statics.field1781;
                        this.field1735[var22] += Statics.field1782;
                        this.field1736[var22] += Statics.field1783;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1756.length) {
                    int[] var37 = this.field1756[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1734[var39] -= Statics.field1781;
                        this.field1735[var39] -= Statics.field1782;
                        this.field1736[var39] -= Statics.field1783;
                        this.field1734[var39] = this.field1734[var39] * arg2 / 128;
                        this.field1735[var39] = this.field1735[var39] * arg3 / 128;
                        this.field1736[var39] = this.field1736[var39] * arg4 / 128;
                        this.field1734[var39] += Statics.field1781;
                        this.field1735[var39] += Statics.field1782;
                        this.field1736[var39] += Statics.field1783;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1729 != null && this.field1730 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1729.length) {
                    int[] var42 = this.field1729[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1730[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1730[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cm.x()V")
    public void method2033() {
        for (int var1 = 0; var1 < this.field1733; var1++) {
            int var2 = this.field1734[var1];
            this.field1734[var1] = this.field1736[var1];
            this.field1736[var1] = -var2;
        }
        this.field1744 = 0;
    }

    @ObfuscatedName("cm.o()V")
    public void method2034() {
        for (int var1 = 0; var1 < this.field1733; var1++) {
            this.field1734[var1] = -this.field1734[var1];
            this.field1736[var1] = -this.field1736[var1];
        }
        this.field1744 = 0;
    }

    @ObfuscatedName("cm.r()V")
    public void method2022() {
        for (int var1 = 0; var1 < this.field1733; var1++) {
            int var2 = this.field1736[var1];
            this.field1736[var1] = this.field1734[var1];
            this.field1734[var1] = -var2;
        }
        this.field1744 = 0;
    }

    @ObfuscatedName("cm.y(I)V")
    public void method2036(int arg0) {
        int var2 = field1789[arg0];
        int var3 = field1790[arg0];
        for (int var4 = 0; var4 < this.field1733; var4++) {
            int var5 = this.field1735[var4] * var3 - this.field1736[var4] * var2 >> 16;
            this.field1736[var4] = this.field1736[var4] * var3 + this.field1735[var4] * var2 >> 16;
            this.field1735[var4] = var5;
        }
        this.field1744 = 0;
    }

    @ObfuscatedName("cm.i(III)V")
    public void method2037(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1733; var4++) {
            this.field1734[var4] += arg0;
            this.field1735[var4] += arg1;
            this.field1736[var4] += arg2;
        }
        this.field1744 = 0;
    }

    @ObfuscatedName("cm.q(III)V")
    public void method2051(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1733; var4++) {
            this.field1734[var4] = this.field1734[var4] * arg0 / 128;
            this.field1735[var4] = this.field1735[var4] * arg1 / 128;
            this.field1736[var4] = this.field1736[var4] * arg2 / 128;
        }
        this.field1744 = 0;
    }

    @ObfuscatedName("cm.g(IIIIIII)V")
    public final void method2039(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1771[0] = -1;
        if (this.field1744 != 2 && this.field1744 != 1) {
            this.method2028();
        }
        int var8 = Statics.field1506;
        int var9 = Statics.field1508;
        int var10 = field1789[arg0];
        int var11 = field1790[arg0];
        int var12 = field1789[arg1];
        int var13 = field1790[arg1];
        int var14 = field1789[arg2];
        int var15 = field1790[arg2];
        int var16 = field1789[arg3];
        int var17 = field1790[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1733; var19++) {
            int var20 = this.field1734[var19];
            int var21 = this.field1735[var19];
            int var22 = this.field1736[var19];
            if (arg2 != 0) {
                int var23 = var14 * var21 + var15 * var20 >> 16;
                var21 = var15 * var21 - var14 * var20 >> 16;
                var20 = var23;
            }
            if (arg0 != 0) {
                int var24 = var11 * var21 - var10 * var22 >> 16;
                var22 = var10 * var21 + var11 * var22 >> 16;
                var21 = var24;
            }
            if (arg1 != 0) {
                int var25 = var12 * var22 + var13 * var20 >> 16;
                var22 = var13 * var22 - var12 * var20 >> 16;
                var20 = var25;
            }
            int var26 = arg4 + var20;
            int var27 = arg5 + var21;
            int var28 = arg6 + var22;
            int var29 = var17 * var27 - var16 * var28 >> 16;
            int var30 = var16 * var27 + var17 * var28 >> 16;
            field1766[var19] = var30 - var18;
            field1777[var19] = class86.field1503 * var26 / var30 + var8;
            field1765[var19] = class86.field1503 * var29 / var30 + var9;
            if (this.field1749 > 0) {
                field1767[var19] = var26;
                field1768[var19] = var29;
                field1769[var19] = var30;
            }
        }
        try {
            this.method2042(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("cm.l(IIIIIIII)V")
    public final void method2040(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1771[0] = -1;
        if (this.field1744 != 2 && this.field1744 != 1) {
            this.method2028();
        }
        int var9 = Statics.field1506;
        int var10 = Statics.field1508;
        int var11 = field1789[arg0];
        int var12 = field1790[arg0];
        int var13 = field1789[arg1];
        int var14 = field1790[arg1];
        int var15 = field1789[arg2];
        int var16 = field1790[arg2];
        int var17 = field1789[arg3];
        int var18 = field1790[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1733; var20++) {
            int var21 = this.field1734[var20];
            int var22 = this.field1735[var20];
            int var23 = this.field1736[var20];
            if (arg2 != 0) {
                int var24 = var15 * var22 + var16 * var21 >> 16;
                var22 = var16 * var22 - var15 * var21 >> 16;
                var21 = var24;
            }
            if (arg0 != 0) {
                int var25 = var12 * var22 - var11 * var23 >> 16;
                var23 = var11 * var22 + var12 * var23 >> 16;
                var22 = var25;
            }
            if (arg1 != 0) {
                int var26 = var13 * var23 + var14 * var21 >> 16;
                var23 = var14 * var23 - var13 * var21 >> 16;
                var21 = var26;
            }
            int var27 = arg4 + var21;
            int var28 = arg5 + var22;
            int var29 = arg6 + var23;
            int var30 = var18 * var28 - var17 * var29 >> 16;
            int var31 = var17 * var28 + var18 * var29 >> 16;
            field1766[var20] = var31 - var19;
            field1777[var20] = class86.field1503 * var27 / arg7 + var9;
            field1765[var20] = class86.field1503 * var30 / arg7 + var10;
            if (this.field1749 > 0) {
                field1767[var20] = var27;
                field1768[var20] = var30;
                field1769[var20] = var31;
            }
        }
        try {
            this.method2042(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("cm.b(IIIIIIIII)V")
    public void method1622(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1771[0] = -1;
        if (this.field1744 != 1) {
            this.method2053();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1731 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1731) * class86.field1503;
        if (var15 / var13 >= Statics.field1511) {
            return;
        }
        int var16 = (this.field1731 + var14) * class86.field1503;
        if (var16 / var13 <= Statics.field1513) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1731 * arg1 >> 16;
        int var19 = (var17 + var18) * class86.field1503;
        if (var19 / var13 <= Statics.field1512) {
            return;
        }
        int var20 = (this.field1390 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class86.field1503;
        if (var21 / var13 >= Statics.field1520) {
            return;
        }
        int var22 = (this.field1390 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1749 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1784) {
            int var27 = var11 - var12;
            if (var27 <= 50) {
                var27 = 50;
            }
            int var28;
            int var29;
            if (var14 > 0) {
                var28 = var15 / var13;
                var29 = var16 / var27;
            } else {
                var29 = var16 / var13;
                var28 = var15 / var27;
            }
            int var30;
            int var31;
            if (var17 > 0) {
                var30 = var21 / var13;
                var31 = var19 / var27;
            } else {
                var31 = var19 / var13;
                var30 = var21 / var27;
            }
            int var32 = field1785 - Statics.field1506;
            int var33 = field1752 - Statics.field1508;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1755) {
                    field1754[field1787++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1506;
        int var35 = Statics.field1508;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1789[arg0];
            var37 = field1790[arg0];
        }
        for (int var38 = 0; var38 < this.field1733; var38++) {
            int var39 = this.field1734[var38];
            int var40 = this.field1735[var38];
            int var41 = this.field1736[var38];
            if (arg0 != 0) {
                int var42 = var36 * var41 + var37 * var39 >> 16;
                var41 = var37 * var41 - var36 * var39 >> 16;
                var39 = var42;
            }
            int var43 = arg5 + var39;
            int var44 = arg6 + var40;
            int var45 = arg7 + var41;
            int var46 = arg3 * var45 + arg4 * var43 >> 16;
            int var47 = arg4 * var45 - arg3 * var43 >> 16;
            int var49 = arg2 * var44 - arg1 * var47 >> 16;
            int var50 = arg1 * var44 + arg2 * var47 >> 16;
            field1766[var38] = var50 - var11;
            if (var50 >= 50) {
                field1777[var38] = class86.field1503 * var46 / var50 + var34;
                field1765[var38] = class86.field1503 * var49 / var50 + var35;
            } else {
                field1777[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1767[var38] = var46;
                field1768[var38] = var49;
                field1769[var38] = var50;
            }
        }
        try {
            this.method2042(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("cm.u(ZZI)V")
    public final void method2042(boolean arg0, boolean arg1, int arg2) {
        if (this.field1759 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1759; var4++) {
            field1771[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1748; var5++) {
            if (this.field1750[var5] != -2) {
                int var6 = this.field1738[var5];
                int var7 = this.field1760[var5];
                int var8 = this.field1740[var5];
                int var9 = field1777[var6];
                int var10 = field1777[var7];
                int var11 = field1777[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1767[var6];
                    int var13 = field1767[var7];
                    int var14 = field1767[var8];
                    int var15 = field1768[var6];
                    int var16 = field1768[var7];
                    int var17 = field1768[var8];
                    int var18 = field1769[var6];
                    int var19 = field1769[var7];
                    int var20 = field1769[var8];
                    int var21 = var12 - var13;
                    int var22 = var14 - var13;
                    int var23 = var15 - var16;
                    int var24 = var17 - var16;
                    int var25 = var18 - var19;
                    int var26 = var20 - var19;
                    int var27 = var23 * var26 - var24 * var25;
                    int var28 = var22 * var25 - var21 * var26;
                    int var29 = var21 * var24 - var22 * var23;
                    if (var19 * var29 + var13 * var27 + var16 * var28 > 0) {
                        field1763[var5] = true;
                        int var30 = (field1766[var6] + field1766[var7] + field1766[var8]) / 3 + this.field1739;
                        field1793[var30][field1771[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2045(field1785, field1752, field1765[var6], field1765[var7], field1765[var8], var9, var10, var11)) {
                        field1754[field1787++] = arg2;
                        arg1 = false;
                    }
                    if ((field1765[var8] - field1765[var7]) * (var9 - var10) - (field1765[var6] - field1765[var7]) * (var11 - var10) > 0) {
                        field1763[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1505 && var10 <= Statics.field1505 && var11 <= Statics.field1505) {
                            field1758[var5] = false;
                        } else {
                            field1758[var5] = true;
                        }
                        int var31 = (field1766[var6] + field1766[var7] + field1766[var8]) / 3 + this.field1739;
                        field1793[var31][field1771[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1737 == null) {
            for (int var32 = this.field1759 - 1; var32 >= 0; var32--) {
                int var33 = field1771[var32];
                if (var33 > 0) {
                    int[] var34 = field1793[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2060(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1773[var36] = 0;
            field1786[var36] = 0;
        }
        for (int var37 = this.field1759 - 1; var37 >= 0; var37--) {
            int var38 = field1771[var37];
            if (var38 > 0) {
                int[] var39 = field1793[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1737[var41];
                    int var43 = field1773[var42]++;
                    field1774[var42][var43] = var41;
                    if (var42 < 10) {
                        field1786[var42] += var37;
                    } else if (var42 == 10) {
                        field1775[var43] = var37;
                    } else {
                        field1776[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1773[1] > 0 || field1773[2] > 0) {
            var44 = (field1786[1] + field1786[2]) / (field1773[1] + field1773[2]);
        }
        int var45 = 0;
        if (field1773[3] > 0 || field1773[4] > 0) {
            var45 = (field1786[3] + field1786[4]) / (field1773[3] + field1773[4]);
        }
        int var46 = 0;
        if (field1773[6] > 0 || field1773[8] > 0) {
            var46 = (field1786[6] + field1786[8]) / (field1773[6] + field1773[8]);
        }
        int var47 = 0;
        int var48 = field1773[10];
        int[] var49 = field1774[10];
        int[] var50 = field1775;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1773[11];
            var49 = field1774[11];
            var50 = field1776;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2060(var49[var47++]);
                if (var47 == var48 && field1774[11] != var49) {
                    var47 = 0;
                    var48 = field1773[11];
                    var49 = field1774[11];
                    var50 = field1776;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2060(var49[var47++]);
                if (var47 == var48 && field1774[11] != var49) {
                    var47 = 0;
                    var48 = field1773[11];
                    var49 = field1774[11];
                    var50 = field1776;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2060(var49[var47++]);
                if (var47 == var48 && field1774[11] != var49) {
                    var47 = 0;
                    var48 = field1773[11];
                    var49 = field1774[11];
                    var50 = field1776;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1773[var52];
            int[] var54 = field1774[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2060(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2060(var49[var47++]);
            if (var47 == var48 && field1774[11] != var49) {
                var47 = 0;
                var49 = field1774[11];
                var48 = field1773[11];
                var50 = field1776;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("cm.j(I)V")
    public final void method2060(int arg0) {
        if (field1763[arg0]) {
            this.method2044(arg0);
            return;
        }
        int var2 = this.field1738[arg0];
        int var3 = this.field1760[arg0];
        int var4 = this.field1740[arg0];
        class86.field1497 = field1758[arg0];
        if (this.field1730 == null) {
            class86.field1500 = 0;
        } else {
            class86.field1500 = this.field1730[arg0] & 0xFF;
        }
        if (this.field1747 != null && this.field1747[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1746 == null || this.field1746[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1746[arg0] & 0xFF;
                var6 = this.field1762[var5];
                var7 = this.field1751[var5];
                var8 = this.field1743[var5];
            }
            if (this.field1750[arg0] == -1) {
                class86.method1817(field1765[var2], field1765[var3], field1765[var4], field1777[var2], field1777[var3], field1777[var4], this.field1741[arg0], this.field1741[arg0], this.field1741[arg0], field1767[var6], field1767[var7], field1767[var8], field1768[var6], field1768[var7], field1768[var8], field1769[var6], field1769[var7], field1769[var8], this.field1747[arg0]);
            } else {
                class86.method1817(field1765[var2], field1765[var3], field1765[var4], field1777[var2], field1777[var3], field1777[var4], this.field1741[arg0], this.field1742[arg0], this.field1750[arg0], field1767[var6], field1767[var7], field1767[var8], field1768[var6], field1768[var7], field1768[var8], field1769[var6], field1769[var7], field1769[var8], this.field1747[arg0]);
            }
        } else if (this.field1750[arg0] == -1) {
            class86.method1815(field1765[var2], field1765[var3], field1765[var4], field1777[var2], field1777[var3], field1777[var4], field1791[this.field1741[arg0]]);
        } else {
            class86.method1813(field1765[var2], field1765[var3], field1765[var4], field1777[var2], field1777[var3], field1777[var4], this.field1741[arg0], this.field1742[arg0], this.field1750[arg0]);
        }
    }

    @ObfuscatedName("cm.z(I)V")
    public final void method2044(int arg0) {
        int var2 = Statics.field1506;
        int var3 = Statics.field1508;
        int var4 = 0;
        int var5 = this.field1738[arg0];
        int var6 = this.field1760[arg0];
        int var7 = this.field1740[arg0];
        int var8 = field1769[var5];
        int var9 = field1769[var6];
        int var10 = field1769[var7];
        if (this.field1730 == null) {
            class86.field1500 = 0;
        } else {
            class86.field1500 = this.field1730[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1778[var4] = field1777[var5];
            field1779[var4] = field1765[var5];
            field1772[var4++] = this.field1741[arg0];
        } else {
            int var11 = field1767[var5];
            int var12 = field1768[var5];
            int var13 = this.field1741[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1764[var10 - var8];
                field1778[var4] = (((field1767[var7] - var11) * var14 >> 16) + var11) * class86.field1503 / 50 + var2;
                field1779[var4] = (((field1768[var7] - var12) * var14 >> 16) + var12) * class86.field1503 / 50 + var3;
                field1772[var4++] = ((this.field1750[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1764[var9 - var8];
                field1778[var4] = (((field1767[var6] - var11) * var15 >> 16) + var11) * class86.field1503 / 50 + var2;
                field1779[var4] = (((field1768[var6] - var12) * var15 >> 16) + var12) * class86.field1503 / 50 + var3;
                field1772[var4++] = ((this.field1742[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1778[var4] = field1777[var6];
            field1779[var4] = field1765[var6];
            field1772[var4++] = this.field1742[arg0];
        } else {
            int var16 = field1767[var6];
            int var17 = field1768[var6];
            int var18 = this.field1742[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1764[var8 - var9];
                field1778[var4] = (((field1767[var5] - var16) * var19 >> 16) + var16) * class86.field1503 / 50 + var2;
                field1779[var4] = (((field1768[var5] - var17) * var19 >> 16) + var17) * class86.field1503 / 50 + var3;
                field1772[var4++] = ((this.field1741[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1764[var10 - var9];
                field1778[var4] = (((field1767[var7] - var16) * var20 >> 16) + var16) * class86.field1503 / 50 + var2;
                field1779[var4] = (((field1768[var7] - var17) * var20 >> 16) + var17) * class86.field1503 / 50 + var3;
                field1772[var4++] = ((this.field1750[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1778[var4] = field1777[var7];
            field1779[var4] = field1765[var7];
            field1772[var4++] = this.field1750[arg0];
        } else {
            int var21 = field1767[var7];
            int var22 = field1768[var7];
            int var23 = this.field1750[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1764[var9 - var10];
                field1778[var4] = (((field1767[var6] - var21) * var24 >> 16) + var21) * class86.field1503 / 50 + var2;
                field1779[var4] = (((field1768[var6] - var22) * var24 >> 16) + var22) * class86.field1503 / 50 + var3;
                field1772[var4++] = ((this.field1742[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1764[var8 - var10];
                field1778[var4] = (((field1767[var5] - var21) * var25 >> 16) + var21) * class86.field1503 / 50 + var2;
                field1779[var4] = (((field1768[var5] - var22) * var25 >> 16) + var22) * class86.field1503 / 50 + var3;
                field1772[var4++] = ((this.field1741[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1778[0];
        int var27 = field1778[1];
        int var28 = field1778[2];
        int var29 = field1779[0];
        int var30 = field1779[1];
        int var31 = field1779[2];
        class86.field1497 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1505 || var27 > Statics.field1505 || var28 > Statics.field1505) {
                class86.field1497 = true;
            }
            if (this.field1747 != null && this.field1747[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1746 == null || this.field1746[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1746[arg0] & 0xFF;
                    var33 = this.field1762[var32];
                    var34 = this.field1751[var32];
                    var35 = this.field1743[var32];
                }
                if (this.field1750[arg0] == -1) {
                    class86.method1817(var29, var30, var31, var26, var27, var28, this.field1741[arg0], this.field1741[arg0], this.field1741[arg0], field1767[var33], field1767[var34], field1767[var35], field1768[var33], field1768[var34], field1768[var35], field1769[var33], field1769[var34], field1769[var35], this.field1747[arg0]);
                } else {
                    class86.method1817(var29, var30, var31, var26, var27, var28, field1772[0], field1772[1], field1772[2], field1767[var33], field1767[var34], field1767[var35], field1768[var33], field1768[var34], field1768[var35], field1769[var33], field1769[var34], field1769[var35], this.field1747[arg0]);
                }
            } else if (this.field1750[arg0] == -1) {
                class86.method1815(var29, var30, var31, var26, var27, var28, field1791[this.field1741[arg0]]);
            } else {
                class86.method1813(var29, var30, var31, var26, var27, var28, field1772[0], field1772[1], field1772[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1505 || var27 > Statics.field1505 || var28 > Statics.field1505 || field1778[3] < 0 || field1778[3] > Statics.field1505) {
            class86.field1497 = true;
        }
        if (this.field1747 != null && this.field1747[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1746 == null || this.field1746[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1746[arg0] & 0xFF;
                var37 = this.field1762[var36];
                var38 = this.field1751[var36];
                var39 = this.field1743[var36];
            }
            short var40 = this.field1747[arg0];
            if (this.field1750[arg0] == -1) {
                class86.method1817(var29, var30, var31, var26, var27, var28, this.field1741[arg0], this.field1741[arg0], this.field1741[arg0], field1767[var37], field1767[var38], field1767[var39], field1768[var37], field1768[var38], field1768[var39], field1769[var37], field1769[var38], field1769[var39], var40);
                class86.method1817(var29, var31, field1779[3], var26, var28, field1778[3], this.field1741[arg0], this.field1741[arg0], this.field1741[arg0], field1767[var37], field1767[var38], field1767[var39], field1768[var37], field1768[var38], field1768[var39], field1769[var37], field1769[var38], field1769[var39], var40);
            } else {
                class86.method1817(var29, var30, var31, var26, var27, var28, field1772[0], field1772[1], field1772[2], field1767[var37], field1767[var38], field1767[var39], field1768[var37], field1768[var38], field1768[var39], field1769[var37], field1769[var38], field1769[var39], var40);
                class86.method1817(var29, var31, field1779[3], var26, var28, field1778[3], field1772[0], field1772[2], field1772[3], field1767[var37], field1767[var38], field1767[var39], field1768[var37], field1768[var38], field1768[var39], field1769[var37], field1769[var38], field1769[var39], var40);
            }
        } else if (this.field1750[arg0] == -1) {
            int var41 = field1791[this.field1741[arg0]];
            class86.method1815(var29, var30, var31, var26, var27, var28, var41);
            class86.method1815(var29, var31, field1779[3], var26, var28, field1778[3], var41);
        } else {
            class86.method1813(var29, var30, var31, var26, var27, var28, field1772[0], field1772[1], field1772[2]);
            class86.method1813(var29, var31, field1779[3], var26, var28, field1778[3], field1772[0], field1772[2], field1772[3]);
        }
    }

    @ObfuscatedName("cm.am(IIIIIIII)Z")
    public final boolean method2045(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }
}
