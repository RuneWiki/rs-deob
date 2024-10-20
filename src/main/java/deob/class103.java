package deob;

@ObfuscatedName("cw")
public class class103 extends class83 {

    @ObfuscatedName("cw.j")
    public static class103 field1780 = new class103();

    @ObfuscatedName("cw.y")
    public static byte[] field1740 = new byte[1];

    @ObfuscatedName("cw.z")
    public static class103 field1757 = new class103();

    @ObfuscatedName("cw.l")
    public static byte[] field1795 = new byte[1];

    @ObfuscatedName("cw.w")
    public int field1743 = 0;

    @ObfuscatedName("cw.d")
    public int[] field1744;

    @ObfuscatedName("cw.f")
    public int[] field1739;

    @ObfuscatedName("cw.i")
    public int[] field1746;

    @ObfuscatedName("cw.a")
    public int field1745 = 0;

    @ObfuscatedName("cw.o")
    public int[] field1748;

    @ObfuscatedName("cw.u")
    public int[] field1749;

    @ObfuscatedName("cw.m")
    public int[] field1750;

    @ObfuscatedName("cw.e")
    public int[] field1774;

    @ObfuscatedName("cw.v")
    public int[] field1783;

    @ObfuscatedName("cw.r")
    public int[] field1753;

    @ObfuscatedName("cw.t")
    public byte[] field1754;

    @ObfuscatedName("cw.g")
    public byte[] field1755;

    @ObfuscatedName("cw.s")
    public byte[] field1756;

    @ObfuscatedName("cw.n")
    public short[] field1765;

    @ObfuscatedName("cw.h")
    public byte field1758 = 0;

    @ObfuscatedName("cw.p")
    public int field1766 = 0;

    @ObfuscatedName("cw.c")
    public int[] field1760;

    @ObfuscatedName("cw.x")
    public int[] field1761;

    @ObfuscatedName("cw.q")
    public int[] field1762;

    @ObfuscatedName("cw.b")
    public int[][] field1752;

    @ObfuscatedName("cw.k")
    public int[][] field1764;

    @ObfuscatedName("cw.at")
    public boolean field1751 = false;

    @ObfuscatedName("cw.au")
    public int field1776;

    @ObfuscatedName("cw.aa")
    public int field1767;

    @ObfuscatedName("cw.ak")
    public int field1768;

    @ObfuscatedName("cw.an")
    public int field1769;

    @ObfuscatedName("cw.ad")
    public int field1786;

    @ObfuscatedName("cw.ag")
    public static boolean[] field1772 = new boolean[4096];

    @ObfuscatedName("cw.aj")
    public static boolean[] field1773 = new boolean[4096];

    @ObfuscatedName("cw.av")
    public static int[] field1747 = new int[4096];

    @ObfuscatedName("cw.ar")
    public static int[] field1741 = new int[4096];

    @ObfuscatedName("cw.ab")
    public static int[] field1794 = new int[4096];

    @ObfuscatedName("cw.ai")
    public static int[] field1777 = new int[4096];

    @ObfuscatedName("cw.ae")
    public static int[] field1778 = new int[4096];

    @ObfuscatedName("cw.ax")
    public static int[] field1742 = new int[4096];

    @ObfuscatedName("cw.ac")
    public static int[] field1781 = new int[1600];

    @ObfuscatedName("cw.al")
    public static int[][] field1787 = new int[1600][512];

    @ObfuscatedName("cw.az")
    public static int[] field1775 = new int[12];

    @ObfuscatedName("cw.as")
    public static int[][] field1784 = new int[12][2000];

    @ObfuscatedName("cw.am")
    public static int[] field1790 = new int[2000];

    @ObfuscatedName("cw.ay")
    public static int[] field1782 = new int[2000];

    @ObfuscatedName("cw.ao")
    public static int[] field1785 = new int[12];

    @ObfuscatedName("cw.aq")
    public static int[] field1788 = new int[10];

    @ObfuscatedName("cw.af")
    public static int[] field1789 = new int[10];

    @ObfuscatedName("cw.ah")
    public static int[] field1779 = new int[10];

    @ObfuscatedName("cw.bs")
    public static boolean field1763 = false;

    @ObfuscatedName("cw.bj")
    public static int field1759 = 0;

    @ObfuscatedName("cw.bf")
    public static int field1796 = 0;

    @ObfuscatedName("cw.bo")
    public static int field1797 = 0;

    @ObfuscatedName("cw.bi")
    public static int[] field1798 = new int[1000];

    @ObfuscatedName("cw.bv")
    public static int[] field1799 = class89.field1542;

    @ObfuscatedName("cw.bp")
    public static int[] field1800 = class89.field1543;

    @ObfuscatedName("cw.bm")
    public static int[] field1801 = class89.field1540;

    @ObfuscatedName("cw.br")
    public static int[] field1802 = class89.field1541;

    public class103() {
    }

    public class103(class103[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1743 = 0;
        this.field1745 = 0;
        this.field1766 = 0;
        this.field1758 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class103 var8 = arg0[var7];
            if (var8 != null) {
                this.field1743 += var8.field1743;
                this.field1745 += var8.field1745;
                this.field1766 += var8.field1766;
                if (var8.field1754 == null) {
                    if (this.field1758 == -1) {
                        this.field1758 = var8.field1758;
                    }
                    if (this.field1758 != var8.field1758) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1755 != null;
                var5 |= var8.field1765 != null;
                var6 |= var8.field1756 != null;
            }
        }
        this.field1744 = new int[this.field1743];
        this.field1739 = new int[this.field1743];
        this.field1746 = new int[this.field1743];
        this.field1748 = new int[this.field1745];
        this.field1749 = new int[this.field1745];
        this.field1750 = new int[this.field1745];
        this.field1774 = new int[this.field1745];
        this.field1783 = new int[this.field1745];
        this.field1753 = new int[this.field1745];
        if (var3) {
            this.field1754 = new byte[this.field1745];
        }
        if (var4) {
            this.field1755 = new byte[this.field1745];
        }
        if (var5) {
            this.field1765 = new short[this.field1745];
        }
        if (var6) {
            this.field1756 = new byte[this.field1745];
        }
        if (this.field1766 > 0) {
            this.field1760 = new int[this.field1766];
            this.field1761 = new int[this.field1766];
            this.field1762 = new int[this.field1766];
        }
        this.field1743 = 0;
        this.field1745 = 0;
        this.field1766 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class103 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1745; var11++) {
                    this.field1748[this.field1745] = var10.field1748[var11] + this.field1743;
                    this.field1749[this.field1745] = var10.field1749[var11] + this.field1743;
                    this.field1750[this.field1745] = var10.field1750[var11] + this.field1743;
                    this.field1774[this.field1745] = var10.field1774[var11];
                    this.field1783[this.field1745] = var10.field1783[var11];
                    this.field1753[this.field1745] = var10.field1753[var11];
                    if (var3) {
                        if (var10.field1754 == null) {
                            this.field1754[this.field1745] = var10.field1758;
                        } else {
                            this.field1754[this.field1745] = var10.field1754[var11];
                        }
                    }
                    if (var4 && var10.field1755 != null) {
                        this.field1755[this.field1745] = var10.field1755[var11];
                    }
                    if (var5) {
                        if (var10.field1765 == null) {
                            this.field1765[this.field1745] = -1;
                        } else {
                            this.field1765[this.field1745] = var10.field1765[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1756 == null || var10.field1756[var11] == -1) {
                            this.field1756[this.field1745] = -1;
                        } else {
                            this.field1756[this.field1745] = (byte) (var10.field1756[var11] + this.field1766);
                        }
                    }
                    this.field1745++;
                }
                for (int var12 = 0; var12 < var10.field1766; var12++) {
                    this.field1760[this.field1766] = var10.field1760[var12] + this.field1743;
                    this.field1761[this.field1766] = var10.field1761[var12] + this.field1743;
                    this.field1762[this.field1766] = var10.field1762[var12] + this.field1743;
                    this.field1766++;
                }
                for (int var13 = 0; var13 < var10.field1743; var13++) {
                    this.field1744[this.field1743] = var10.field1744[var13];
                    this.field1739[this.field1743] = var10.field1739[var13];
                    this.field1746[this.field1743] = var10.field1746[var13];
                    this.field1743++;
                }
            }
        }
    }

    @ObfuscatedName("cw.j([[IIIIZI)Lcw;")
    public class103 method2244(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2170();
        int var7 = arg1 - this.field1768;
        int var8 = this.field1768 + arg1;
        int var9 = arg3 - this.field1768;
        int var10 = this.field1768 + arg3;
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
        class103 var15;
        if (arg4) {
            var15 = new class103();
            var15.field1743 = this.field1743;
            var15.field1745 = this.field1745;
            var15.field1766 = this.field1766;
            var15.field1744 = this.field1744;
            var15.field1746 = this.field1746;
            var15.field1748 = this.field1748;
            var15.field1749 = this.field1749;
            var15.field1750 = this.field1750;
            var15.field1774 = this.field1774;
            var15.field1783 = this.field1783;
            var15.field1753 = this.field1753;
            var15.field1754 = this.field1754;
            var15.field1755 = this.field1755;
            var15.field1756 = this.field1756;
            var15.field1765 = this.field1765;
            var15.field1758 = this.field1758;
            var15.field1760 = this.field1760;
            var15.field1761 = this.field1761;
            var15.field1762 = this.field1762;
            var15.field1752 = this.field1752;
            var15.field1764 = this.field1764;
            var15.field1751 = this.field1751;
            var15.field1739 = new int[var15.field1743];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1743; var16++) {
                int var17 = this.field1744[var16] + arg1;
                int var18 = this.field1746[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1739[var16] = this.field1739[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1743; var26++) {
                int var27 = (-this.field1739[var26] << 16) / this.field1419;
                if (var27 < arg5) {
                    int var28 = this.field1744[var26] + arg1;
                    int var29 = this.field1746[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1739[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1739[var26];
                }
            }
        }
        var15.field1776 = 0;
        return var15;
    }

    @ObfuscatedName("cw.z(Z)Lcw;")
    public class103 method2167(boolean arg0) {
        if (!arg0 && field1740.length < this.field1745) {
            field1740 = new byte[this.field1745 + 100];
        }
        return this.method2169(arg0, field1780, field1740);
    }

    @ObfuscatedName("cw.l(Z)Lcw;")
    public class103 method2210(boolean arg0) {
        if (!arg0 && field1795.length < this.field1745) {
            field1795 = new byte[this.field1745 + 100];
        }
        return this.method2169(arg0, field1757, field1795);
    }

    @ObfuscatedName("cw.w(ZLcw;[B)Lcw;")
    public class103 method2169(boolean arg0, class103 arg1, byte[] arg2) {
        arg1.field1743 = this.field1743;
        arg1.field1745 = this.field1745;
        arg1.field1766 = this.field1766;
        if (arg1.field1744 == null || arg1.field1744.length < this.field1743) {
            arg1.field1744 = new int[this.field1743 + 100];
            arg1.field1739 = new int[this.field1743 + 100];
            arg1.field1746 = new int[this.field1743 + 100];
        }
        for (int var4 = 0; var4 < this.field1743; var4++) {
            arg1.field1744[var4] = this.field1744[var4];
            arg1.field1739[var4] = this.field1739[var4];
            arg1.field1746[var4] = this.field1746[var4];
        }
        if (arg0) {
            arg1.field1755 = this.field1755;
        } else {
            arg1.field1755 = arg2;
            if (this.field1755 == null) {
                for (int var5 = 0; var5 < this.field1745; var5++) {
                    arg1.field1755[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1745; var6++) {
                    arg1.field1755[var6] = this.field1755[var6];
                }
            }
        }
        arg1.field1748 = this.field1748;
        arg1.field1749 = this.field1749;
        arg1.field1750 = this.field1750;
        arg1.field1774 = this.field1774;
        arg1.field1783 = this.field1783;
        arg1.field1753 = this.field1753;
        arg1.field1754 = this.field1754;
        arg1.field1756 = this.field1756;
        arg1.field1765 = this.field1765;
        arg1.field1758 = this.field1758;
        arg1.field1760 = this.field1760;
        arg1.field1761 = this.field1761;
        arg1.field1762 = this.field1762;
        arg1.field1752 = this.field1752;
        arg1.field1764 = this.field1764;
        arg1.field1751 = this.field1751;
        arg1.field1776 = 0;
        return arg1;
    }

    @ObfuscatedName("cw.d()V")
    public void method2170() {
        if (this.field1776 == 1) {
            return;
        }
        this.field1776 = 1;
        this.field1419 = 0;
        this.field1767 = 0;
        this.field1768 = 0;
        for (int var1 = 0; var1 < this.field1743; var1++) {
            int var2 = this.field1744[var1];
            int var3 = this.field1739[var1];
            int var4 = this.field1746[var1];
            if (-var3 > this.field1419) {
                this.field1419 = -var3;
            }
            if (var3 > this.field1767) {
                this.field1767 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1768) {
                this.field1768 = var5;
            }
        }
        this.field1768 = (int) (Math.sqrt((double) this.field1768) + 0.99D);
        this.field1786 = (int) (Math.sqrt((double) (this.field1419 * this.field1419 + this.field1768 * this.field1768)) + 0.99D);
        this.field1769 = this.field1786 + (int) (Math.sqrt((double) (this.field1768 * this.field1768 + this.field1767 * this.field1767)) + 0.99D);
    }

    @ObfuscatedName("cw.a()V")
    public void method2171() {
        if (this.field1776 == 2) {
            return;
        }
        this.field1776 = 2;
        this.field1768 = 0;
        for (int var1 = 0; var1 < this.field1743; var1++) {
            int var2 = this.field1744[var1];
            int var3 = this.field1739[var1];
            int var4 = this.field1746[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1768) {
                this.field1768 = var5;
            }
        }
        this.field1768 = (int) (Math.sqrt((double) this.field1768) + 0.99D);
        this.field1786 = this.field1768;
        this.field1769 = this.field1768 + this.field1768;
    }

    @ObfuscatedName("cw.o()I")
    public int method2172() {
        this.method2170();
        return this.field1768;
    }

    @ObfuscatedName("cw.u(Lcm;I)V")
    public void method2173(class101 arg0, int arg1) {
        if (this.field1752 == null || arg1 == -1) {
            return;
        }
        class86 var3 = arg0.field1718[arg1];
        class100 var4 = var3.field1497;
        Statics.field1791 = 0;
        Statics.field1792 = 0;
        Statics.field1793 = 0;
        for (int var5 = 0; var5 < var3.field1501; var5++) {
            int var6 = var3.field1499[var5];
            this.method2175(var4.field1709[var6], var4.field1710[var6], var3.field1495[var5], var3.field1498[var5], var3.field1502[var5]);
        }
        this.field1776 = 0;
    }

    @ObfuscatedName("cw.m(Lcm;ILcm;I[I)V")
    public void method2225(class101 arg0, int arg1, class101 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2173(arg0, arg1);
            return;
        }
        class86 var6 = arg0.field1718[arg1];
        class86 var7 = arg2.field1718[arg3];
        class100 var8 = var6.field1497;
        Statics.field1791 = 0;
        Statics.field1792 = 0;
        Statics.field1793 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1501; var11++) {
            int var12 = var6.field1499[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1709[var12] == 0) {
                this.method2175(var8.field1709[var12], var8.field1710[var12], var6.field1495[var11], var6.field1498[var11], var6.field1502[var11]);
            }
        }
        Statics.field1791 = 0;
        Statics.field1792 = 0;
        Statics.field1793 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1501; var15++) {
            int var16 = var7.field1499[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1709[var16] == 0) {
                this.method2175(var8.field1709[var16], var8.field1710[var16], var7.field1495[var15], var7.field1498[var15], var7.field1502[var15]);
            }
        }
        this.field1776 = 0;
    }

    @ObfuscatedName("cw.e(I[IIII)V")
    public void method2175(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1791 = 0;
            Statics.field1792 = 0;
            Statics.field1793 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1752.length) {
                    int[] var10 = this.field1752[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1791 += this.field1744[var12];
                        Statics.field1792 += this.field1739[var12];
                        Statics.field1793 += this.field1746[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1791 = Statics.field1791 / var7 + arg2;
                Statics.field1792 = Statics.field1792 / var7 + arg3;
                Statics.field1793 = Statics.field1793 / var7 + arg4;
            } else {
                Statics.field1791 = arg2;
                Statics.field1792 = arg3;
                Statics.field1793 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1752.length) {
                    int[] var15 = this.field1752[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1744[var17] += arg2;
                        this.field1739[var17] += arg3;
                        this.field1746[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1752.length) {
                    int[] var20 = this.field1752[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1744[var22] -= Statics.field1791;
                        this.field1739[var22] -= Statics.field1792;
                        this.field1746[var22] -= Statics.field1793;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1799[var25];
                            int var27 = field1800[var25];
                            int var28 = this.field1744[var22] * var27 + this.field1739[var22] * var26 >> 16;
                            this.field1739[var22] = this.field1739[var22] * var27 - this.field1744[var22] * var26 >> 16;
                            this.field1744[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1799[var23];
                            int var30 = field1800[var23];
                            int var31 = this.field1739[var22] * var30 - this.field1746[var22] * var29 >> 16;
                            this.field1746[var22] = this.field1746[var22] * var30 + this.field1739[var22] * var29 >> 16;
                            this.field1739[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1799[var24];
                            int var33 = field1800[var24];
                            int var34 = this.field1746[var22] * var32 + this.field1744[var22] * var33 >> 16;
                            this.field1746[var22] = this.field1746[var22] * var33 - this.field1744[var22] * var32 >> 16;
                            this.field1744[var22] = var34;
                        }
                        this.field1744[var22] += Statics.field1791;
                        this.field1739[var22] += Statics.field1792;
                        this.field1746[var22] += Statics.field1793;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1752.length) {
                    int[] var37 = this.field1752[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1744[var39] -= Statics.field1791;
                        this.field1739[var39] -= Statics.field1792;
                        this.field1746[var39] -= Statics.field1793;
                        this.field1744[var39] = this.field1744[var39] * arg2 / 128;
                        this.field1739[var39] = this.field1739[var39] * arg3 / 128;
                        this.field1746[var39] = this.field1746[var39] * arg4 / 128;
                        this.field1744[var39] += Statics.field1791;
                        this.field1739[var39] += Statics.field1792;
                        this.field1746[var39] += Statics.field1793;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1764 != null && this.field1755 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1764.length) {
                    int[] var42 = this.field1764[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1755[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1755[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cw.v()V")
    public void method2176() {
        for (int var1 = 0; var1 < this.field1743; var1++) {
            int var2 = this.field1744[var1];
            this.field1744[var1] = this.field1746[var1];
            this.field1746[var1] = -var2;
        }
        this.field1776 = 0;
    }

    @ObfuscatedName("cw.r()V")
    public void method2206() {
        for (int var1 = 0; var1 < this.field1743; var1++) {
            this.field1744[var1] = -this.field1744[var1];
            this.field1746[var1] = -this.field1746[var1];
        }
        this.field1776 = 0;
    }

    @ObfuscatedName("cw.t()V")
    public void method2178() {
        for (int var1 = 0; var1 < this.field1743; var1++) {
            int var2 = this.field1746[var1];
            this.field1746[var1] = this.field1744[var1];
            this.field1744[var1] = -var2;
        }
        this.field1776 = 0;
    }

    @ObfuscatedName("cw.g(I)V")
    public void method2179(int arg0) {
        int var2 = field1799[arg0];
        int var3 = field1800[arg0];
        for (int var4 = 0; var4 < this.field1743; var4++) {
            int var5 = this.field1739[var4] * var3 - this.field1746[var4] * var2 >> 16;
            this.field1746[var4] = this.field1746[var4] * var3 + this.field1739[var4] * var2 >> 16;
            this.field1739[var4] = var5;
        }
        this.field1776 = 0;
    }

    @ObfuscatedName("cw.s(III)V")
    public void method2180(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1743; var4++) {
            this.field1744[var4] += arg0;
            this.field1739[var4] += arg1;
            this.field1746[var4] += arg2;
        }
        this.field1776 = 0;
    }

    @ObfuscatedName("cw.n(III)V")
    public void method2201(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1743; var4++) {
            this.field1744[var4] = this.field1744[var4] * arg0 / 128;
            this.field1739[var4] = this.field1739[var4] * arg1 / 128;
            this.field1746[var4] = this.field1746[var4] * arg2 / 128;
        }
        this.field1776 = 0;
    }

    @ObfuscatedName("cw.h(IIIIIII)V")
    public final void method2227(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1781[0] = -1;
        if (this.field1776 != 2 && this.field1776 != 1) {
            this.method2171();
        }
        int var8 = Statics.field1529;
        int var9 = Statics.field1530;
        int var10 = field1799[arg0];
        int var11 = field1800[arg0];
        int var12 = field1799[arg1];
        int var13 = field1800[arg1];
        int var14 = field1799[arg2];
        int var15 = field1800[arg2];
        int var16 = field1799[arg3];
        int var17 = field1800[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1743; var19++) {
            int var20 = this.field1744[var19];
            int var21 = this.field1739[var19];
            int var22 = this.field1746[var19];
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
            field1794[var19] = var30 - var18;
            field1747[var19] = class89.field1528 * var26 / var30 + var8;
            field1741[var19] = class89.field1528 * var29 / var30 + var9;
            if (this.field1766 > 0) {
                field1777[var19] = var26;
                field1778[var19] = var29;
                field1742[var19] = var30;
            }
        }
        try {
            this.method2184(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("cw.p(IIIIIIII)V")
    public final void method2183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1781[0] = -1;
        if (this.field1776 != 2 && this.field1776 != 1) {
            this.method2171();
        }
        int var9 = Statics.field1529;
        int var10 = Statics.field1530;
        int var11 = field1799[arg0];
        int var12 = field1800[arg0];
        int var13 = field1799[arg1];
        int var14 = field1800[arg1];
        int var15 = field1799[arg2];
        int var16 = field1800[arg2];
        int var17 = field1799[arg3];
        int var18 = field1800[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1743; var20++) {
            int var21 = this.field1744[var20];
            int var22 = this.field1739[var20];
            int var23 = this.field1746[var20];
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
            field1794[var20] = var31 - var19;
            field1747[var20] = class89.field1528 * var27 / arg7 + var9;
            field1741[var20] = class89.field1528 * var30 / arg7 + var10;
            if (this.field1766 > 0) {
                field1777[var20] = var27;
                field1778[var20] = var30;
                field1742[var20] = var31;
            }
        }
        try {
            this.method2184(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("cw.b(IIIIIIIII)V")
    public void method1794(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1781[0] = -1;
        if (this.field1776 != 1) {
            this.method2170();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1768 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1768) * class89.field1528;
        if (var15 / var13 >= Statics.field1524) {
            return;
        }
        int var16 = (this.field1768 + var14) * class89.field1528;
        if (var16 / var13 <= Statics.field1533) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1768 * arg1 >> 16;
        int var19 = (var17 + var18) * class89.field1528;
        if (var19 / var13 <= Statics.field1535) {
            return;
        }
        int var20 = (this.field1419 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class89.field1528;
        if (var21 / var13 >= Statics.field1538) {
            return;
        }
        int var22 = (this.field1419 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1766 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1763) {
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
            int var32 = field1759 - Statics.field1529;
            int var33 = field1796 - Statics.field1530;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1751) {
                    field1798[field1797++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1529;
        int var35 = Statics.field1530;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1799[arg0];
            var37 = field1800[arg0];
        }
        for (int var38 = 0; var38 < this.field1743; var38++) {
            int var39 = this.field1744[var38];
            int var40 = this.field1739[var38];
            int var41 = this.field1746[var38];
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
            field1794[var38] = var50 - var11;
            if (var50 >= 50) {
                field1747[var38] = class89.field1528 * var46 / var50 + var34;
                field1741[var38] = class89.field1528 * var49 / var50 + var35;
            } else {
                field1747[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1777[var38] = var46;
                field1778[var38] = var49;
                field1742[var38] = var50;
            }
        }
        try {
            this.method2184(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("cw.c(ZZI)V")
    public final void method2184(boolean arg0, boolean arg1, int arg2) {
        if (this.field1769 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1769; var4++) {
            field1781[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1745; var5++) {
            if (this.field1753[var5] != -2) {
                int var6 = this.field1748[var5];
                int var7 = this.field1749[var5];
                int var8 = this.field1750[var5];
                int var9 = field1747[var6];
                int var10 = field1747[var7];
                int var11 = field1747[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1777[var6];
                    int var13 = field1777[var7];
                    int var14 = field1777[var8];
                    int var15 = field1778[var6];
                    int var16 = field1778[var7];
                    int var17 = field1778[var8];
                    int var18 = field1742[var6];
                    int var19 = field1742[var7];
                    int var20 = field1742[var8];
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
                        field1773[var5] = true;
                        int var30 = (field1794[var6] + field1794[var7] + field1794[var8]) / 3 + this.field1786;
                        field1787[var30][field1781[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2240(field1759, field1796, field1741[var6], field1741[var7], field1741[var8], var9, var10, var11)) {
                        field1798[field1797++] = arg2;
                        arg1 = false;
                    }
                    if ((field1741[var8] - field1741[var7]) * (var9 - var10) - (field1741[var6] - field1741[var7]) * (var11 - var10) > 0) {
                        field1773[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1531 && var10 <= Statics.field1531 && var11 <= Statics.field1531) {
                            field1772[var5] = false;
                        } else {
                            field1772[var5] = true;
                        }
                        int var31 = (field1794[var6] + field1794[var7] + field1794[var8]) / 3 + this.field1786;
                        field1787[var31][field1781[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1754 == null) {
            for (int var32 = this.field1769 - 1; var32 >= 0; var32--) {
                int var33 = field1781[var32];
                if (var33 > 0) {
                    int[] var34 = field1787[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2185(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1775[var36] = 0;
            field1785[var36] = 0;
        }
        for (int var37 = this.field1769 - 1; var37 >= 0; var37--) {
            int var38 = field1781[var37];
            if (var38 > 0) {
                int[] var39 = field1787[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1754[var41];
                    int var43 = field1775[var42]++;
                    field1784[var42][var43] = var41;
                    if (var42 < 10) {
                        field1785[var42] += var37;
                    } else if (var42 == 10) {
                        field1790[var43] = var37;
                    } else {
                        field1782[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1775[1] > 0 || field1775[2] > 0) {
            var44 = (field1785[1] + field1785[2]) / (field1775[1] + field1775[2]);
        }
        int var45 = 0;
        if (field1775[3] > 0 || field1775[4] > 0) {
            var45 = (field1785[3] + field1785[4]) / (field1775[3] + field1775[4]);
        }
        int var46 = 0;
        if (field1775[6] > 0 || field1775[8] > 0) {
            var46 = (field1785[6] + field1785[8]) / (field1775[6] + field1775[8]);
        }
        int var47 = 0;
        int var48 = field1775[10];
        int[] var49 = field1784[10];
        int[] var50 = field1790;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1775[11];
            var49 = field1784[11];
            var50 = field1782;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2185(var49[var47++]);
                if (var47 == var48 && field1784[11] != var49) {
                    var47 = 0;
                    var48 = field1775[11];
                    var49 = field1784[11];
                    var50 = field1782;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2185(var49[var47++]);
                if (var47 == var48 && field1784[11] != var49) {
                    var47 = 0;
                    var48 = field1775[11];
                    var49 = field1784[11];
                    var50 = field1782;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2185(var49[var47++]);
                if (var47 == var48 && field1784[11] != var49) {
                    var47 = 0;
                    var48 = field1775[11];
                    var49 = field1784[11];
                    var50 = field1782;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1775[var52];
            int[] var54 = field1784[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2185(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2185(var49[var47++]);
            if (var47 == var48 && field1784[11] != var49) {
                var47 = 0;
                var49 = field1784[11];
                var48 = field1775[11];
                var50 = field1782;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("cw.x(I)V")
    public final void method2185(int arg0) {
        if (field1773[arg0]) {
            this.method2186(arg0);
            return;
        }
        int var2 = this.field1748[arg0];
        int var3 = this.field1749[arg0];
        int var4 = this.field1750[arg0];
        class89.field1536 = field1772[arg0];
        if (this.field1755 == null) {
            class89.field1523 = 0;
        } else {
            class89.field1523 = this.field1755[arg0] & 0xFF;
        }
        if (this.field1765 != null && this.field1765[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1756 == null || this.field1756[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1756[arg0] & 0xFF;
                var6 = this.field1760[var5];
                var7 = this.field1761[var5];
                var8 = this.field1762[var5];
            }
            if (this.field1753[arg0] == -1) {
                class89.method2034(field1741[var2], field1741[var3], field1741[var4], field1747[var2], field1747[var3], field1747[var4], this.field1774[arg0], this.field1774[arg0], this.field1774[arg0], field1777[var6], field1777[var7], field1777[var8], field1778[var6], field1778[var7], field1778[var8], field1742[var6], field1742[var7], field1742[var8], this.field1765[arg0]);
            } else {
                class89.method2034(field1741[var2], field1741[var3], field1741[var4], field1747[var2], field1747[var3], field1747[var4], this.field1774[arg0], this.field1783[arg0], this.field1753[arg0], field1777[var6], field1777[var7], field1777[var8], field1778[var6], field1778[var7], field1778[var8], field1742[var6], field1742[var7], field1742[var8], this.field1765[arg0]);
            }
        } else if (this.field1753[arg0] == -1) {
            class89.method1990(field1741[var2], field1741[var3], field1741[var4], field1747[var2], field1747[var3], field1747[var4], field1801[this.field1774[arg0]]);
        } else {
            class89.method2025(field1741[var2], field1741[var3], field1741[var4], field1747[var2], field1747[var3], field1747[var4], this.field1774[arg0], this.field1783[arg0], this.field1753[arg0]);
        }
    }

    @ObfuscatedName("cw.q(I)V")
    public final void method2186(int arg0) {
        int var2 = Statics.field1529;
        int var3 = Statics.field1530;
        int var4 = 0;
        int var5 = this.field1748[arg0];
        int var6 = this.field1749[arg0];
        int var7 = this.field1750[arg0];
        int var8 = field1742[var5];
        int var9 = field1742[var6];
        int var10 = field1742[var7];
        if (this.field1755 == null) {
            class89.field1523 = 0;
        } else {
            class89.field1523 = this.field1755[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1788[var4] = field1747[var5];
            field1789[var4] = field1741[var5];
            field1779[var4++] = this.field1774[arg0];
        } else {
            int var11 = field1777[var5];
            int var12 = field1778[var5];
            int var13 = this.field1774[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1802[var10 - var8];
                field1788[var4] = (((field1777[var7] - var11) * var14 >> 16) + var11) * class89.field1528 / 50 + var2;
                field1789[var4] = (((field1778[var7] - var12) * var14 >> 16) + var12) * class89.field1528 / 50 + var3;
                field1779[var4++] = ((this.field1753[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1802[var9 - var8];
                field1788[var4] = (((field1777[var6] - var11) * var15 >> 16) + var11) * class89.field1528 / 50 + var2;
                field1789[var4] = (((field1778[var6] - var12) * var15 >> 16) + var12) * class89.field1528 / 50 + var3;
                field1779[var4++] = ((this.field1783[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1788[var4] = field1747[var6];
            field1789[var4] = field1741[var6];
            field1779[var4++] = this.field1783[arg0];
        } else {
            int var16 = field1777[var6];
            int var17 = field1778[var6];
            int var18 = this.field1783[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1802[var8 - var9];
                field1788[var4] = (((field1777[var5] - var16) * var19 >> 16) + var16) * class89.field1528 / 50 + var2;
                field1789[var4] = (((field1778[var5] - var17) * var19 >> 16) + var17) * class89.field1528 / 50 + var3;
                field1779[var4++] = ((this.field1774[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1802[var10 - var9];
                field1788[var4] = (((field1777[var7] - var16) * var20 >> 16) + var16) * class89.field1528 / 50 + var2;
                field1789[var4] = (((field1778[var7] - var17) * var20 >> 16) + var17) * class89.field1528 / 50 + var3;
                field1779[var4++] = ((this.field1753[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1788[var4] = field1747[var7];
            field1789[var4] = field1741[var7];
            field1779[var4++] = this.field1753[arg0];
        } else {
            int var21 = field1777[var7];
            int var22 = field1778[var7];
            int var23 = this.field1753[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1802[var9 - var10];
                field1788[var4] = (((field1777[var6] - var21) * var24 >> 16) + var21) * class89.field1528 / 50 + var2;
                field1789[var4] = (((field1778[var6] - var22) * var24 >> 16) + var22) * class89.field1528 / 50 + var3;
                field1779[var4++] = ((this.field1783[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1802[var8 - var10];
                field1788[var4] = (((field1777[var5] - var21) * var25 >> 16) + var21) * class89.field1528 / 50 + var2;
                field1789[var4] = (((field1778[var5] - var22) * var25 >> 16) + var22) * class89.field1528 / 50 + var3;
                field1779[var4++] = ((this.field1774[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1788[0];
        int var27 = field1788[1];
        int var28 = field1788[2];
        int var29 = field1789[0];
        int var30 = field1789[1];
        int var31 = field1789[2];
        class89.field1536 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1531 || var27 > Statics.field1531 || var28 > Statics.field1531) {
                class89.field1536 = true;
            }
            if (this.field1765 != null && this.field1765[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1756 == null || this.field1756[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1756[arg0] & 0xFF;
                    var33 = this.field1760[var32];
                    var34 = this.field1761[var32];
                    var35 = this.field1762[var32];
                }
                if (this.field1753[arg0] == -1) {
                    class89.method2034(var29, var30, var31, var26, var27, var28, this.field1774[arg0], this.field1774[arg0], this.field1774[arg0], field1777[var33], field1777[var34], field1777[var35], field1778[var33], field1778[var34], field1778[var35], field1742[var33], field1742[var34], field1742[var35], this.field1765[arg0]);
                } else {
                    class89.method2034(var29, var30, var31, var26, var27, var28, field1779[0], field1779[1], field1779[2], field1777[var33], field1777[var34], field1777[var35], field1778[var33], field1778[var34], field1778[var35], field1742[var33], field1742[var34], field1742[var35], this.field1765[arg0]);
                }
            } else if (this.field1753[arg0] == -1) {
                class89.method1990(var29, var30, var31, var26, var27, var28, field1801[this.field1774[arg0]]);
            } else {
                class89.method2025(var29, var30, var31, var26, var27, var28, field1779[0], field1779[1], field1779[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1531 || var27 > Statics.field1531 || var28 > Statics.field1531 || field1788[3] < 0 || field1788[3] > Statics.field1531) {
            class89.field1536 = true;
        }
        if (this.field1765 != null && this.field1765[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1756 == null || this.field1756[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1756[arg0] & 0xFF;
                var37 = this.field1760[var36];
                var38 = this.field1761[var36];
                var39 = this.field1762[var36];
            }
            short var40 = this.field1765[arg0];
            if (this.field1753[arg0] == -1) {
                class89.method2034(var29, var30, var31, var26, var27, var28, this.field1774[arg0], this.field1774[arg0], this.field1774[arg0], field1777[var37], field1777[var38], field1777[var39], field1778[var37], field1778[var38], field1778[var39], field1742[var37], field1742[var38], field1742[var39], var40);
                class89.method2034(var29, var31, field1789[3], var26, var28, field1788[3], this.field1774[arg0], this.field1774[arg0], this.field1774[arg0], field1777[var37], field1777[var38], field1777[var39], field1778[var37], field1778[var38], field1778[var39], field1742[var37], field1742[var38], field1742[var39], var40);
            } else {
                class89.method2034(var29, var30, var31, var26, var27, var28, field1779[0], field1779[1], field1779[2], field1777[var37], field1777[var38], field1777[var39], field1778[var37], field1778[var38], field1778[var39], field1742[var37], field1742[var38], field1742[var39], var40);
                class89.method2034(var29, var31, field1789[3], var26, var28, field1788[3], field1779[0], field1779[2], field1779[3], field1777[var37], field1777[var38], field1777[var39], field1778[var37], field1778[var38], field1778[var39], field1742[var37], field1742[var38], field1742[var39], var40);
            }
        } else if (this.field1753[arg0] == -1) {
            int var41 = field1801[this.field1774[arg0]];
            class89.method1990(var29, var30, var31, var26, var27, var28, var41);
            class89.method1990(var29, var31, field1789[3], var26, var28, field1788[3], var41);
        } else {
            class89.method2025(var29, var30, var31, var26, var27, var28, field1779[0], field1779[1], field1779[2]);
            class89.method2025(var29, var31, field1789[3], var26, var28, field1788[3], field1779[0], field1779[2], field1779[3]);
        }
    }

    @ObfuscatedName("cw.aa(IIIIIIII)Z")
    public final boolean method2240(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
