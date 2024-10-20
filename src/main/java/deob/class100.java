package deob;

@ObfuscatedName("cg")
public class class100 extends class80 {

    @ObfuscatedName("cg.n")
    public static class100 field1798 = new class100();

    @ObfuscatedName("cg.d")
    public static byte[] field1736 = new byte[1];

    @ObfuscatedName("cg.z")
    public static class100 field1741 = new class100();

    @ObfuscatedName("cg.y")
    public static byte[] field1738 = new byte[1];

    @ObfuscatedName("cg.e")
    public int field1739 = 0;

    @ObfuscatedName("cg.g")
    public int[] field1740;

    @ObfuscatedName("cg.f")
    public int[] field1776;

    @ObfuscatedName("cg.m")
    public int[] field1737;

    @ObfuscatedName("cg.a")
    public int field1743 = 0;

    @ObfuscatedName("cg.h")
    public int[] field1744;

    @ObfuscatedName("cg.l")
    public int[] field1745;

    @ObfuscatedName("cg.u")
    public int[] field1746;

    @ObfuscatedName("cg.q")
    public int[] field1748;

    @ObfuscatedName("cg.k")
    public int[] field1763;

    @ObfuscatedName("cg.x")
    public int[] field1749;

    @ObfuscatedName("cg.r")
    public byte[] field1750;

    @ObfuscatedName("cg.j")
    public byte[] field1780;

    @ObfuscatedName("cg.s")
    public byte[] field1785;

    @ObfuscatedName("cg.v")
    public short[] field1761;

    @ObfuscatedName("cg.c")
    public byte field1754 = 0;

    @ObfuscatedName("cg.p")
    public int field1770 = 0;

    @ObfuscatedName("cg.o")
    public int[] field1769;

    @ObfuscatedName("cg.b")
    public int[] field1757;

    @ObfuscatedName("cg.t")
    public int[] field1735;

    @ObfuscatedName("cg.w")
    public int[][] field1759;

    @ObfuscatedName("cg.i")
    public int[][] field1760;

    @ObfuscatedName("cg.ad")
    public boolean field1764 = false;

    @ObfuscatedName("cg.ak")
    public int field1762;

    @ObfuscatedName("cg.ae")
    public int field1775;

    @ObfuscatedName("cg.ax")
    public int field1742;

    @ObfuscatedName("cg.al")
    public int field1765;

    @ObfuscatedName("cg.ar")
    public int field1766;

    @ObfuscatedName("cg.ab")
    public static boolean[] field1768 = new boolean[4096];

    @ObfuscatedName("cg.ao")
    public static boolean[] field1751 = new boolean[4096];

    @ObfuscatedName("cg.ac")
    public static int[] field1794 = new int[4096];

    @ObfuscatedName("cg.az")
    public static int[] field1771 = new int[4096];

    @ObfuscatedName("cg.at")
    public static int[] field1791 = new int[4096];

    @ObfuscatedName("cg.aa")
    public static int[] field1773 = new int[4096];

    @ObfuscatedName("cg.an")
    public static int[] field1747 = new int[4096];

    @ObfuscatedName("cg.aw")
    public static int[] field1758 = new int[4096];

    @ObfuscatedName("cg.ah")
    public static int[] field1777 = new int[1600];

    @ObfuscatedName("cg.aq")
    public static int[][] field1778 = new int[1600][512];

    @ObfuscatedName("cg.ay")
    public static int[] field1779 = new int[12];

    @ObfuscatedName("cg.am")
    public static int[][] field1781 = new int[12][2000];

    @ObfuscatedName("cg.aj")
    public static int[] field1772 = new int[2000];

    @ObfuscatedName("cg.ag")
    public static int[] field1782 = new int[2000];

    @ObfuscatedName("cg.ap")
    public static int[] field1756 = new int[12];

    @ObfuscatedName("cg.af")
    public static int[] field1784 = new int[10];

    @ObfuscatedName("cg.au")
    public static int[] field1790 = new int[10];

    @ObfuscatedName("cg.av")
    public static int[] field1786 = new int[10];

    @ObfuscatedName("cg.bm")
    public static boolean field1755 = false;

    @ObfuscatedName("cg.bj")
    public static int field1774 = 0;

    @ObfuscatedName("cg.ba")
    public static int field1792 = 0;

    @ObfuscatedName("cg.br")
    public static int field1793 = 0;

    @ObfuscatedName("cg.bd")
    public static int[] field1783 = new int[1000];

    @ObfuscatedName("cg.bn")
    public static int[] field1795 = class86.field1515;

    @ObfuscatedName("cg.bu")
    public static int[] field1796 = class86.field1516;

    @ObfuscatedName("cg.bq")
    public static int[] field1797 = class86.field1511;

    @ObfuscatedName("cg.bp")
    public static int[] field1753 = class86.field1510;

    public class100() {
    }

    public class100(class100[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1739 = 0;
        this.field1743 = 0;
        this.field1770 = 0;
        this.field1754 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class100 var8 = arg0[var7];
            if (var8 != null) {
                this.field1739 += var8.field1739;
                this.field1743 += var8.field1743;
                this.field1770 += var8.field1770;
                if (var8.field1750 == null) {
                    if (this.field1754 == -1) {
                        this.field1754 = var8.field1754;
                    }
                    if (this.field1754 != var8.field1754) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1780 != null;
                var5 |= var8.field1761 != null;
                var6 |= var8.field1785 != null;
            }
        }
        this.field1740 = new int[this.field1739];
        this.field1776 = new int[this.field1739];
        this.field1737 = new int[this.field1739];
        this.field1744 = new int[this.field1743];
        this.field1745 = new int[this.field1743];
        this.field1746 = new int[this.field1743];
        this.field1748 = new int[this.field1743];
        this.field1763 = new int[this.field1743];
        this.field1749 = new int[this.field1743];
        if (var3) {
            this.field1750 = new byte[this.field1743];
        }
        if (var4) {
            this.field1780 = new byte[this.field1743];
        }
        if (var5) {
            this.field1761 = new short[this.field1743];
        }
        if (var6) {
            this.field1785 = new byte[this.field1743];
        }
        if (this.field1770 > 0) {
            this.field1769 = new int[this.field1770];
            this.field1757 = new int[this.field1770];
            this.field1735 = new int[this.field1770];
        }
        this.field1739 = 0;
        this.field1743 = 0;
        this.field1770 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class100 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1743; var11++) {
                    this.field1744[this.field1743] = var10.field1744[var11] + this.field1739;
                    this.field1745[this.field1743] = var10.field1745[var11] + this.field1739;
                    this.field1746[this.field1743] = var10.field1746[var11] + this.field1739;
                    this.field1748[this.field1743] = var10.field1748[var11];
                    this.field1763[this.field1743] = var10.field1763[var11];
                    this.field1749[this.field1743] = var10.field1749[var11];
                    if (var3) {
                        if (var10.field1750 == null) {
                            this.field1750[this.field1743] = var10.field1754;
                        } else {
                            this.field1750[this.field1743] = var10.field1750[var11];
                        }
                    }
                    if (var4 && var10.field1780 != null) {
                        this.field1780[this.field1743] = var10.field1780[var11];
                    }
                    if (var5) {
                        if (var10.field1761 == null) {
                            this.field1761[this.field1743] = -1;
                        } else {
                            this.field1761[this.field1743] = var10.field1761[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1785 == null || var10.field1785[var11] == -1) {
                            this.field1785[this.field1743] = -1;
                        } else {
                            this.field1785[this.field1743] = (byte) (var10.field1785[var11] + this.field1770);
                        }
                    }
                    this.field1743++;
                }
                for (int var12 = 0; var12 < var10.field1770; var12++) {
                    this.field1769[this.field1770] = var10.field1769[var12] + this.field1739;
                    this.field1757[this.field1770] = var10.field1757[var12] + this.field1739;
                    this.field1735[this.field1770] = var10.field1735[var12] + this.field1739;
                    this.field1770++;
                }
                for (int var13 = 0; var13 < var10.field1739; var13++) {
                    this.field1740[this.field1739] = var10.field1740[var13];
                    this.field1776[this.field1739] = var10.field1776[var13];
                    this.field1737[this.field1739] = var10.field1737[var13];
                    this.field1739++;
                }
            }
        }
    }

    @ObfuscatedName("cg.n([[IIIIZI)Lcg;")
    public class100 method2068(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2072();
        int var7 = arg1 - this.field1742;
        int var8 = this.field1742 + arg1;
        int var9 = arg3 - this.field1742;
        int var10 = this.field1742 + arg3;
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
            var15.field1739 = this.field1739;
            var15.field1743 = this.field1743;
            var15.field1770 = this.field1770;
            var15.field1740 = this.field1740;
            var15.field1737 = this.field1737;
            var15.field1744 = this.field1744;
            var15.field1745 = this.field1745;
            var15.field1746 = this.field1746;
            var15.field1748 = this.field1748;
            var15.field1763 = this.field1763;
            var15.field1749 = this.field1749;
            var15.field1750 = this.field1750;
            var15.field1780 = this.field1780;
            var15.field1785 = this.field1785;
            var15.field1761 = this.field1761;
            var15.field1754 = this.field1754;
            var15.field1769 = this.field1769;
            var15.field1757 = this.field1757;
            var15.field1735 = this.field1735;
            var15.field1759 = this.field1759;
            var15.field1760 = this.field1760;
            var15.field1764 = this.field1764;
            var15.field1776 = new int[var15.field1739];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1739; var16++) {
                int var17 = this.field1740[var16] + arg1;
                int var18 = this.field1737[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1776[var16] = this.field1776[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1739; var26++) {
                int var27 = (-this.field1776[var26] << 16) / this.field1388;
                if (var27 < arg5) {
                    int var28 = this.field1740[var26] + arg1;
                    int var29 = this.field1737[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1776[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1776[var26];
                }
            }
        }
        var15.field1762 = 0;
        return var15;
    }

    @ObfuscatedName("cg.z(Z)Lcg;")
    public class100 method2090(boolean arg0) {
        if (!arg0 && field1736.length < this.field1743) {
            field1736 = new byte[this.field1743 + 100];
        }
        return this.method2071(arg0, field1798, field1736);
    }

    @ObfuscatedName("cg.y(Z)Lcg;")
    public class100 method2124(boolean arg0) {
        if (!arg0 && field1738.length < this.field1743) {
            field1738 = new byte[this.field1743 + 100];
        }
        return this.method2071(arg0, field1741, field1738);
    }

    @ObfuscatedName("cg.e(ZLcg;[B)Lcg;")
    public class100 method2071(boolean arg0, class100 arg1, byte[] arg2) {
        arg1.field1739 = this.field1739;
        arg1.field1743 = this.field1743;
        arg1.field1770 = this.field1770;
        if (arg1.field1740 == null || arg1.field1740.length < this.field1739) {
            arg1.field1740 = new int[this.field1739 + 100];
            arg1.field1776 = new int[this.field1739 + 100];
            arg1.field1737 = new int[this.field1739 + 100];
        }
        for (int var4 = 0; var4 < this.field1739; var4++) {
            arg1.field1740[var4] = this.field1740[var4];
            arg1.field1776[var4] = this.field1776[var4];
            arg1.field1737[var4] = this.field1737[var4];
        }
        if (arg0) {
            arg1.field1780 = this.field1780;
        } else {
            arg1.field1780 = arg2;
            if (this.field1780 == null) {
                for (int var5 = 0; var5 < this.field1743; var5++) {
                    arg1.field1780[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1743; var6++) {
                    arg1.field1780[var6] = this.field1780[var6];
                }
            }
        }
        arg1.field1744 = this.field1744;
        arg1.field1745 = this.field1745;
        arg1.field1746 = this.field1746;
        arg1.field1748 = this.field1748;
        arg1.field1763 = this.field1763;
        arg1.field1749 = this.field1749;
        arg1.field1750 = this.field1750;
        arg1.field1785 = this.field1785;
        arg1.field1761 = this.field1761;
        arg1.field1754 = this.field1754;
        arg1.field1769 = this.field1769;
        arg1.field1757 = this.field1757;
        arg1.field1735 = this.field1735;
        arg1.field1759 = this.field1759;
        arg1.field1760 = this.field1760;
        arg1.field1764 = this.field1764;
        arg1.field1762 = 0;
        return arg1;
    }

    @ObfuscatedName("cg.m()V")
    public void method2072() {
        if (this.field1762 == 1) {
            return;
        }
        this.field1762 = 1;
        this.field1388 = 0;
        this.field1775 = 0;
        this.field1742 = 0;
        for (int var1 = 0; var1 < this.field1739; var1++) {
            int var2 = this.field1740[var1];
            int var3 = this.field1776[var1];
            int var4 = this.field1737[var1];
            if (-var3 > this.field1388) {
                this.field1388 = -var3;
            }
            if (var3 > this.field1775) {
                this.field1775 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1742) {
                this.field1742 = var5;
            }
        }
        this.field1742 = (int) (Math.sqrt((double) this.field1742) + 0.99D);
        this.field1766 = (int) (Math.sqrt((double) (this.field1388 * this.field1388 + this.field1742 * this.field1742)) + 0.99D);
        this.field1765 = this.field1766 + (int) (Math.sqrt((double) (this.field1775 * this.field1775 + this.field1742 * this.field1742)) + 0.99D);
    }

    @ObfuscatedName("cg.a()V")
    public void method2073() {
        if (this.field1762 == 2) {
            return;
        }
        this.field1762 = 2;
        this.field1742 = 0;
        for (int var1 = 0; var1 < this.field1739; var1++) {
            int var2 = this.field1740[var1];
            int var3 = this.field1776[var1];
            int var4 = this.field1737[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1742) {
                this.field1742 = var5;
            }
        }
        this.field1742 = (int) (Math.sqrt((double) this.field1742) + 0.99D);
        this.field1766 = this.field1742;
        this.field1765 = this.field1742 + this.field1742;
    }

    @ObfuscatedName("cg.h()I")
    public int method2074() {
        this.method2072();
        return this.field1742;
    }

    @ObfuscatedName("cg.l(Lci;I)V")
    public void method2106(class98 arg0, int arg1) {
        if (this.field1759 == null || arg1 == -1) {
            return;
        }
        class83 var3 = arg0.field1703[arg1];
        class97 var4 = var3.field1466;
        Statics.field1787 = 0;
        Statics.field1788 = 0;
        Statics.field1789 = 0;
        for (int var5 = 0; var5 < var3.field1468; var5++) {
            int var6 = var3.field1463[var5];
            this.method2077(var4.field1699[var6], var4.field1697[var6], var3.field1470[var5], var3.field1467[var5], var3.field1471[var5]);
        }
        this.field1762 = 0;
    }

    @ObfuscatedName("cg.u(Lci;ILci;I[I)V")
    public void method2076(class98 arg0, int arg1, class98 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2106(arg0, arg1);
            return;
        }
        class83 var6 = arg0.field1703[arg1];
        class83 var7 = arg2.field1703[arg3];
        class97 var8 = var6.field1466;
        Statics.field1787 = 0;
        Statics.field1788 = 0;
        Statics.field1789 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1468; var11++) {
            int var12 = var6.field1463[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1699[var12] == 0) {
                this.method2077(var8.field1699[var12], var8.field1697[var12], var6.field1470[var11], var6.field1467[var11], var6.field1471[var11]);
            }
        }
        Statics.field1787 = 0;
        Statics.field1788 = 0;
        Statics.field1789 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1468; var15++) {
            int var16 = var7.field1463[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1699[var16] == 0) {
                this.method2077(var8.field1699[var16], var8.field1697[var16], var7.field1470[var15], var7.field1467[var15], var7.field1471[var15]);
            }
        }
        this.field1762 = 0;
    }

    @ObfuscatedName("cg.q(I[IIII)V")
    public void method2077(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1787 = 0;
            Statics.field1788 = 0;
            Statics.field1789 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1759.length) {
                    int[] var10 = this.field1759[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1787 += this.field1740[var12];
                        Statics.field1788 += this.field1776[var12];
                        Statics.field1789 += this.field1737[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1787 = Statics.field1787 / var7 + arg2;
                Statics.field1788 = Statics.field1788 / var7 + arg3;
                Statics.field1789 = Statics.field1789 / var7 + arg4;
            } else {
                Statics.field1787 = arg2;
                Statics.field1788 = arg3;
                Statics.field1789 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1759.length) {
                    int[] var15 = this.field1759[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1740[var17] += arg2;
                        this.field1776[var17] += arg3;
                        this.field1737[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1759.length) {
                    int[] var20 = this.field1759[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1740[var22] -= Statics.field1787;
                        this.field1776[var22] -= Statics.field1788;
                        this.field1737[var22] -= Statics.field1789;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1795[var25];
                            int var27 = field1796[var25];
                            int var28 = this.field1776[var22] * var26 + this.field1740[var22] * var27 >> 16;
                            this.field1776[var22] = this.field1776[var22] * var27 - this.field1740[var22] * var26 >> 16;
                            this.field1740[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1795[var23];
                            int var30 = field1796[var23];
                            int var31 = this.field1776[var22] * var30 - this.field1737[var22] * var29 >> 16;
                            this.field1737[var22] = this.field1776[var22] * var29 + this.field1737[var22] * var30 >> 16;
                            this.field1776[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1795[var24];
                            int var33 = field1796[var24];
                            int var34 = this.field1740[var22] * var33 + this.field1737[var22] * var32 >> 16;
                            this.field1737[var22] = this.field1737[var22] * var33 - this.field1740[var22] * var32 >> 16;
                            this.field1740[var22] = var34;
                        }
                        this.field1740[var22] += Statics.field1787;
                        this.field1776[var22] += Statics.field1788;
                        this.field1737[var22] += Statics.field1789;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1759.length) {
                    int[] var37 = this.field1759[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1740[var39] -= Statics.field1787;
                        this.field1776[var39] -= Statics.field1788;
                        this.field1737[var39] -= Statics.field1789;
                        this.field1740[var39] = this.field1740[var39] * arg2 / 128;
                        this.field1776[var39] = this.field1776[var39] * arg3 / 128;
                        this.field1737[var39] = this.field1737[var39] * arg4 / 128;
                        this.field1740[var39] += Statics.field1787;
                        this.field1776[var39] += Statics.field1788;
                        this.field1737[var39] += Statics.field1789;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1760 != null && this.field1780 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1760.length) {
                    int[] var42 = this.field1760[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1780[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1780[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cg.k()V")
    public void method2078() {
        for (int var1 = 0; var1 < this.field1739; var1++) {
            int var2 = this.field1740[var1];
            this.field1740[var1] = this.field1737[var1];
            this.field1737[var1] = -var2;
        }
        this.field1762 = 0;
    }

    @ObfuscatedName("cg.x()V")
    public void method2079() {
        for (int var1 = 0; var1 < this.field1739; var1++) {
            this.field1740[var1] = -this.field1740[var1];
            this.field1737[var1] = -this.field1737[var1];
        }
        this.field1762 = 0;
    }

    @ObfuscatedName("cg.r()V")
    public void method2082() {
        for (int var1 = 0; var1 < this.field1739; var1++) {
            int var2 = this.field1737[var1];
            this.field1737[var1] = this.field1740[var1];
            this.field1740[var1] = -var2;
        }
        this.field1762 = 0;
    }

    @ObfuscatedName("cg.j(I)V")
    public void method2081(int arg0) {
        int var2 = field1795[arg0];
        int var3 = field1796[arg0];
        for (int var4 = 0; var4 < this.field1739; var4++) {
            int var5 = this.field1776[var4] * var3 - this.field1737[var4] * var2 >> 16;
            this.field1737[var4] = this.field1776[var4] * var2 + this.field1737[var4] * var3 >> 16;
            this.field1776[var4] = var5;
        }
        this.field1762 = 0;
    }

    @ObfuscatedName("cg.s(III)V")
    public void method2069(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1739; var4++) {
            this.field1740[var4] += arg0;
            this.field1776[var4] += arg1;
            this.field1737[var4] += arg2;
        }
        this.field1762 = 0;
    }

    @ObfuscatedName("cg.v(III)V")
    public void method2083(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1739; var4++) {
            this.field1740[var4] = this.field1740[var4] * arg0 / 128;
            this.field1776[var4] = this.field1776[var4] * arg1 / 128;
            this.field1737[var4] = this.field1737[var4] * arg2 / 128;
        }
        this.field1762 = 0;
    }

    @ObfuscatedName("cg.c(IIIIIII)V")
    public final void method2084(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1777[0] = -1;
        if (this.field1762 != 2 && this.field1762 != 1) {
            this.method2073();
        }
        int var8 = Statics.field1502;
        int var9 = Statics.field1503;
        int var10 = field1795[arg0];
        int var11 = field1796[arg0];
        int var12 = field1795[arg1];
        int var13 = field1796[arg1];
        int var14 = field1795[arg2];
        int var15 = field1796[arg2];
        int var16 = field1795[arg3];
        int var17 = field1796[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1739; var19++) {
            int var20 = this.field1740[var19];
            int var21 = this.field1776[var19];
            int var22 = this.field1737[var19];
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
            field1791[var19] = var30 - var18;
            field1794[var19] = class86.field1501 * var26 / var30 + var8;
            field1771[var19] = class86.field1501 * var29 / var30 + var9;
            if (this.field1770 > 0) {
                field1773[var19] = var26;
                field1747[var19] = var29;
                field1758[var19] = var30;
            }
        }
        try {
            this.method2086(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("cg.p(IIIIIIII)V")
    public final void method2085(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1777[0] = -1;
        if (this.field1762 != 2 && this.field1762 != 1) {
            this.method2073();
        }
        int var9 = Statics.field1502;
        int var10 = Statics.field1503;
        int var11 = field1795[arg0];
        int var12 = field1796[arg0];
        int var13 = field1795[arg1];
        int var14 = field1796[arg1];
        int var15 = field1795[arg2];
        int var16 = field1796[arg2];
        int var17 = field1795[arg3];
        int var18 = field1796[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1739; var20++) {
            int var21 = this.field1740[var20];
            int var22 = this.field1776[var20];
            int var23 = this.field1737[var20];
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
            field1791[var20] = var31 - var19;
            field1794[var20] = class86.field1501 * var27 / arg7 + var9;
            field1771[var20] = class86.field1501 * var30 / arg7 + var10;
            if (this.field1770 > 0) {
                field1773[var20] = var27;
                field1747[var20] = var30;
                field1758[var20] = var31;
            }
        }
        try {
            this.method2086(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("cg.o(IIIIIIIII)V")
    public void method1669(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1777[0] = -1;
        if (this.field1762 != 1) {
            this.method2072();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1742 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1742) * class86.field1501;
        if (var15 / var13 >= Statics.field1492) {
            return;
        }
        int var16 = (this.field1742 + var14) * class86.field1501;
        if (var16 / var13 <= Statics.field1514) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1742 * arg1 >> 16;
        int var19 = (var17 + var18) * class86.field1501;
        if (var19 / var13 <= Statics.field1508) {
            return;
        }
        int var20 = (this.field1388 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class86.field1501;
        if (var21 / var13 >= Statics.field1509) {
            return;
        }
        int var22 = (this.field1388 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1770 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1755) {
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
            int var32 = field1774 - Statics.field1502;
            int var33 = field1792 - Statics.field1503;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1764) {
                    field1783[field1793++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1502;
        int var35 = Statics.field1503;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1795[arg0];
            var37 = field1796[arg0];
        }
        for (int var38 = 0; var38 < this.field1739; var38++) {
            int var39 = this.field1740[var38];
            int var40 = this.field1776[var38];
            int var41 = this.field1737[var38];
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
            field1791[var38] = var50 - var11;
            if (var50 >= 50) {
                field1794[var38] = class86.field1501 * var46 / var50 + var34;
                field1771[var38] = class86.field1501 * var49 / var50 + var35;
            } else {
                field1794[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1773[var38] = var46;
                field1747[var38] = var49;
                field1758[var38] = var50;
            }
        }
        try {
            this.method2086(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("cg.w(ZZI)V")
    public final void method2086(boolean arg0, boolean arg1, int arg2) {
        if (this.field1765 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1765; var4++) {
            field1777[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1743; var5++) {
            if (this.field1749[var5] != -2) {
                int var6 = this.field1744[var5];
                int var7 = this.field1745[var5];
                int var8 = this.field1746[var5];
                int var9 = field1794[var6];
                int var10 = field1794[var7];
                int var11 = field1794[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1773[var6];
                    int var13 = field1773[var7];
                    int var14 = field1773[var8];
                    int var15 = field1747[var6];
                    int var16 = field1747[var7];
                    int var17 = field1747[var8];
                    int var18 = field1758[var6];
                    int var19 = field1758[var7];
                    int var20 = field1758[var8];
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
                        field1751[var5] = true;
                        int var30 = (field1791[var6] + field1791[var7] + field1791[var8]) / 3 + this.field1766;
                        field1778[var30][field1777[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2089(field1774, field1792, field1771[var6], field1771[var7], field1771[var8], var9, var10, var11)) {
                        field1783[field1793++] = arg2;
                        arg1 = false;
                    }
                    if ((field1771[var8] - field1771[var7]) * (var9 - var10) - (field1771[var6] - field1771[var7]) * (var11 - var10) > 0) {
                        field1751[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1506 && var10 <= Statics.field1506 && var11 <= Statics.field1506) {
                            field1768[var5] = false;
                        } else {
                            field1768[var5] = true;
                        }
                        int var31 = (field1791[var6] + field1791[var7] + field1791[var8]) / 3 + this.field1766;
                        field1778[var31][field1777[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1750 == null) {
            for (int var32 = this.field1765 - 1; var32 >= 0; var32--) {
                int var33 = field1777[var32];
                if (var33 > 0) {
                    int[] var34 = field1778[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2087(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1779[var36] = 0;
            field1756[var36] = 0;
        }
        for (int var37 = this.field1765 - 1; var37 >= 0; var37--) {
            int var38 = field1777[var37];
            if (var38 > 0) {
                int[] var39 = field1778[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1750[var41];
                    int var43 = field1779[var42]++;
                    field1781[var42][var43] = var41;
                    if (var42 < 10) {
                        field1756[var42] += var37;
                    } else if (var42 == 10) {
                        field1772[var43] = var37;
                    } else {
                        field1782[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1779[1] > 0 || field1779[2] > 0) {
            var44 = (field1756[1] + field1756[2]) / (field1779[1] + field1779[2]);
        }
        int var45 = 0;
        if (field1779[3] > 0 || field1779[4] > 0) {
            var45 = (field1756[3] + field1756[4]) / (field1779[3] + field1779[4]);
        }
        int var46 = 0;
        if (field1779[6] > 0 || field1779[8] > 0) {
            var46 = (field1756[6] + field1756[8]) / (field1779[6] + field1779[8]);
        }
        int var47 = 0;
        int var48 = field1779[10];
        int[] var49 = field1781[10];
        int[] var50 = field1772;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1779[11];
            var49 = field1781[11];
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
                this.method2087(var49[var47++]);
                if (var47 == var48 && field1781[11] != var49) {
                    var47 = 0;
                    var48 = field1779[11];
                    var49 = field1781[11];
                    var50 = field1782;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2087(var49[var47++]);
                if (var47 == var48 && field1781[11] != var49) {
                    var47 = 0;
                    var48 = field1779[11];
                    var49 = field1781[11];
                    var50 = field1782;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2087(var49[var47++]);
                if (var47 == var48 && field1781[11] != var49) {
                    var47 = 0;
                    var48 = field1779[11];
                    var49 = field1781[11];
                    var50 = field1782;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1779[var52];
            int[] var54 = field1781[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2087(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2087(var49[var47++]);
            if (var47 == var48 && field1781[11] != var49) {
                var47 = 0;
                var49 = field1781[11];
                var48 = field1779[11];
                var50 = field1782;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("cg.i(I)V")
    public final void method2087(int arg0) {
        if (field1751[arg0]) {
            this.method2135(arg0);
            return;
        }
        int var2 = this.field1744[arg0];
        int var3 = this.field1745[arg0];
        int var4 = this.field1746[arg0];
        class86.field1498 = field1768[arg0];
        if (this.field1780 == null) {
            class86.field1496 = 0;
        } else {
            class86.field1496 = this.field1780[arg0] & 0xFF;
        }
        if (this.field1761 != null && this.field1761[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1785 == null || this.field1785[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1785[arg0] & 0xFF;
                var6 = this.field1769[var5];
                var7 = this.field1757[var5];
                var8 = this.field1735[var5];
            }
            if (this.field1749[arg0] == -1) {
                class86.method1914(field1771[var2], field1771[var3], field1771[var4], field1794[var2], field1794[var3], field1794[var4], this.field1748[arg0], this.field1748[arg0], this.field1748[arg0], field1773[var6], field1773[var7], field1773[var8], field1747[var6], field1747[var7], field1747[var8], field1758[var6], field1758[var7], field1758[var8], this.field1761[arg0]);
            } else {
                class86.method1914(field1771[var2], field1771[var3], field1771[var4], field1794[var2], field1794[var3], field1794[var4], this.field1748[arg0], this.field1763[arg0], this.field1749[arg0], field1773[var6], field1773[var7], field1773[var8], field1747[var6], field1747[var7], field1747[var8], field1758[var6], field1758[var7], field1758[var8], this.field1761[arg0]);
            }
        } else if (this.field1749[arg0] == -1) {
            class86.method1884(field1771[var2], field1771[var3], field1771[var4], field1794[var2], field1794[var3], field1794[var4], field1797[this.field1748[arg0]]);
        } else {
            class86.method1903(field1771[var2], field1771[var3], field1771[var4], field1794[var2], field1794[var3], field1794[var4], this.field1748[arg0], this.field1763[arg0], this.field1749[arg0]);
        }
    }

    @ObfuscatedName("cg.ad(I)V")
    public final void method2135(int arg0) {
        int var2 = Statics.field1502;
        int var3 = Statics.field1503;
        int var4 = 0;
        int var5 = this.field1744[arg0];
        int var6 = this.field1745[arg0];
        int var7 = this.field1746[arg0];
        int var8 = field1758[var5];
        int var9 = field1758[var6];
        int var10 = field1758[var7];
        if (this.field1780 == null) {
            class86.field1496 = 0;
        } else {
            class86.field1496 = this.field1780[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1784[var4] = field1794[var5];
            field1790[var4] = field1771[var5];
            field1786[var4++] = this.field1748[arg0];
        } else {
            int var11 = field1773[var5];
            int var12 = field1747[var5];
            int var13 = this.field1748[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1753[var10 - var8];
                field1784[var4] = (((field1773[var7] - var11) * var14 >> 16) + var11) * class86.field1501 / 50 + var2;
                field1790[var4] = (((field1747[var7] - var12) * var14 >> 16) + var12) * class86.field1501 / 50 + var3;
                field1786[var4++] = ((this.field1749[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1753[var9 - var8];
                field1784[var4] = (((field1773[var6] - var11) * var15 >> 16) + var11) * class86.field1501 / 50 + var2;
                field1790[var4] = (((field1747[var6] - var12) * var15 >> 16) + var12) * class86.field1501 / 50 + var3;
                field1786[var4++] = ((this.field1763[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1784[var4] = field1794[var6];
            field1790[var4] = field1771[var6];
            field1786[var4++] = this.field1763[arg0];
        } else {
            int var16 = field1773[var6];
            int var17 = field1747[var6];
            int var18 = this.field1763[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1753[var8 - var9];
                field1784[var4] = (((field1773[var5] - var16) * var19 >> 16) + var16) * class86.field1501 / 50 + var2;
                field1790[var4] = (((field1747[var5] - var17) * var19 >> 16) + var17) * class86.field1501 / 50 + var3;
                field1786[var4++] = ((this.field1748[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1753[var10 - var9];
                field1784[var4] = (((field1773[var7] - var16) * var20 >> 16) + var16) * class86.field1501 / 50 + var2;
                field1790[var4] = (((field1747[var7] - var17) * var20 >> 16) + var17) * class86.field1501 / 50 + var3;
                field1786[var4++] = ((this.field1749[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1784[var4] = field1794[var7];
            field1790[var4] = field1771[var7];
            field1786[var4++] = this.field1749[arg0];
        } else {
            int var21 = field1773[var7];
            int var22 = field1747[var7];
            int var23 = this.field1749[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1753[var9 - var10];
                field1784[var4] = (((field1773[var6] - var21) * var24 >> 16) + var21) * class86.field1501 / 50 + var2;
                field1790[var4] = (((field1747[var6] - var22) * var24 >> 16) + var22) * class86.field1501 / 50 + var3;
                field1786[var4++] = ((this.field1763[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1753[var8 - var10];
                field1784[var4] = (((field1773[var5] - var21) * var25 >> 16) + var21) * class86.field1501 / 50 + var2;
                field1790[var4] = (((field1747[var5] - var22) * var25 >> 16) + var22) * class86.field1501 / 50 + var3;
                field1786[var4++] = ((this.field1748[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1784[0];
        int var27 = field1784[1];
        int var28 = field1784[2];
        int var29 = field1790[0];
        int var30 = field1790[1];
        int var31 = field1790[2];
        class86.field1498 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1506 || var27 > Statics.field1506 || var28 > Statics.field1506) {
                class86.field1498 = true;
            }
            if (this.field1761 != null && this.field1761[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1785 == null || this.field1785[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1785[arg0] & 0xFF;
                    var33 = this.field1769[var32];
                    var34 = this.field1757[var32];
                    var35 = this.field1735[var32];
                }
                if (this.field1749[arg0] == -1) {
                    class86.method1914(var29, var30, var31, var26, var27, var28, this.field1748[arg0], this.field1748[arg0], this.field1748[arg0], field1773[var33], field1773[var34], field1773[var35], field1747[var33], field1747[var34], field1747[var35], field1758[var33], field1758[var34], field1758[var35], this.field1761[arg0]);
                } else {
                    class86.method1914(var29, var30, var31, var26, var27, var28, field1786[0], field1786[1], field1786[2], field1773[var33], field1773[var34], field1773[var35], field1747[var33], field1747[var34], field1747[var35], field1758[var33], field1758[var34], field1758[var35], this.field1761[arg0]);
                }
            } else if (this.field1749[arg0] == -1) {
                class86.method1884(var29, var30, var31, var26, var27, var28, field1797[this.field1748[arg0]]);
            } else {
                class86.method1903(var29, var30, var31, var26, var27, var28, field1786[0], field1786[1], field1786[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1506 || var27 > Statics.field1506 || var28 > Statics.field1506 || field1784[3] < 0 || field1784[3] > Statics.field1506) {
            class86.field1498 = true;
        }
        if (this.field1761 != null && this.field1761[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1785 == null || this.field1785[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1785[arg0] & 0xFF;
                var37 = this.field1769[var36];
                var38 = this.field1757[var36];
                var39 = this.field1735[var36];
            }
            short var40 = this.field1761[arg0];
            if (this.field1749[arg0] == -1) {
                class86.method1914(var29, var30, var31, var26, var27, var28, this.field1748[arg0], this.field1748[arg0], this.field1748[arg0], field1773[var37], field1773[var38], field1773[var39], field1747[var37], field1747[var38], field1747[var39], field1758[var37], field1758[var38], field1758[var39], var40);
                class86.method1914(var29, var31, field1790[3], var26, var28, field1784[3], this.field1748[arg0], this.field1748[arg0], this.field1748[arg0], field1773[var37], field1773[var38], field1773[var39], field1747[var37], field1747[var38], field1747[var39], field1758[var37], field1758[var38], field1758[var39], var40);
            } else {
                class86.method1914(var29, var30, var31, var26, var27, var28, field1786[0], field1786[1], field1786[2], field1773[var37], field1773[var38], field1773[var39], field1747[var37], field1747[var38], field1747[var39], field1758[var37], field1758[var38], field1758[var39], var40);
                class86.method1914(var29, var31, field1790[3], var26, var28, field1784[3], field1786[0], field1786[2], field1786[3], field1773[var37], field1773[var38], field1773[var39], field1747[var37], field1747[var38], field1747[var39], field1758[var37], field1758[var38], field1758[var39], var40);
            }
        } else if (this.field1749[arg0] == -1) {
            int var41 = field1797[this.field1748[arg0]];
            class86.method1884(var29, var30, var31, var26, var27, var28, var41);
            class86.method1884(var29, var31, field1790[3], var26, var28, field1784[3], var41);
        } else {
            class86.method1903(var29, var30, var31, var26, var27, var28, field1786[0], field1786[1], field1786[2]);
            class86.method1903(var29, var31, field1790[3], var26, var28, field1784[3], field1786[0], field1786[2], field1786[3]);
        }
    }

    @ObfuscatedName("cg.ak(IIIIIIII)Z")
    public final boolean method2089(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
