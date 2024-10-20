package deob;

@ObfuscatedName("cx")
public class class100 extends class80 {

    @ObfuscatedName("cx.b")
    public static class100 field1740 = new class100();

    @ObfuscatedName("cx.e")
    public static byte[] field1736 = new byte[1];

    @ObfuscatedName("cx.a")
    public static class100 field1737 = new class100();

    @ObfuscatedName("cx.k")
    public static byte[] field1777 = new byte[1];

    @ObfuscatedName("cx.p")
    public int field1789 = 0;

    @ObfuscatedName("cx.l")
    public int[] field1796;

    @ObfuscatedName("cx.u")
    public int[] field1741;

    @ObfuscatedName("cx.o")
    public int[] field1742;

    @ObfuscatedName("cx.m")
    public int field1743 = 0;

    @ObfuscatedName("cx.q")
    public int[] field1795;

    @ObfuscatedName("cx.v")
    public int[] field1779;

    @ObfuscatedName("cx.n")
    public int[] field1754;

    @ObfuscatedName("cx.z")
    public int[] field1747;

    @ObfuscatedName("cx.r")
    public int[] field1748;

    @ObfuscatedName("cx.i")
    public int[] field1749;

    @ObfuscatedName("cx.s")
    public byte[] field1750;

    @ObfuscatedName("cx.c")
    public byte[] field1759;

    @ObfuscatedName("cx.t")
    public byte[] field1752;

    @ObfuscatedName("cx.h")
    public short[] field1753;

    @ObfuscatedName("cx.w")
    public byte field1771 = 0;

    @ObfuscatedName("cx.g")
    public int field1755 = 0;

    @ObfuscatedName("cx.f")
    public int[] field1776;

    @ObfuscatedName("cx.y")
    public int[] field1757;

    @ObfuscatedName("cx.j")
    public int[] field1758;

    @ObfuscatedName("cx.x")
    public int[][] field1788;

    @ObfuscatedName("cx.d")
    public int[][] field1760;

    @ObfuscatedName("cx.ax")
    public boolean field1770 = false;

    @ObfuscatedName("cx.ag")
    public int field1793;

    @ObfuscatedName("cx.ai")
    public int field1763;

    @ObfuscatedName("cx.ar")
    public int field1764;

    @ObfuscatedName("cx.aw")
    public int field1765;

    @ObfuscatedName("cx.ac")
    public int field1766;

    @ObfuscatedName("cx.al")
    public static boolean[] field1768 = new boolean[4096];

    @ObfuscatedName("cx.ak")
    public static boolean[] field1769 = new boolean[4096];

    @ObfuscatedName("cx.at")
    public static int[] field1778 = new int[4096];

    @ObfuscatedName("cx.au")
    public static int[] field1744 = new int[4096];

    @ObfuscatedName("cx.am")
    public static int[] field1772 = new int[4096];

    @ObfuscatedName("cx.aa")
    public static int[] field1761 = new int[4096];

    @ObfuscatedName("cx.az")
    public static int[] field1774 = new int[4096];

    @ObfuscatedName("cx.ae")
    public static int[] field1775 = new int[4096];

    @ObfuscatedName("cx.an")
    public static int[] field1756 = new int[1600];

    @ObfuscatedName("cx.aq")
    public static int[][] field1738 = new int[1600][512];

    @ObfuscatedName("cx.as")
    public static int[] field1762 = new int[12];

    @ObfuscatedName("cx.ay")
    public static int[][] field1780 = new int[12][2000];

    @ObfuscatedName("cx.ad")
    public static int[] field1781 = new int[2000];

    @ObfuscatedName("cx.af")
    public static int[] field1782 = new int[2000];

    @ObfuscatedName("cx.ab")
    public static int[] field1746 = new int[12];

    @ObfuscatedName("cx.av")
    public static int[] field1784 = new int[10];

    @ObfuscatedName("cx.ao")
    public static int[] field1785 = new int[10];

    @ObfuscatedName("cx.aj")
    public static int[] field1786 = new int[10];

    @ObfuscatedName("cx.bi")
    public static boolean field1798 = false;

    @ObfuscatedName("cx.bh")
    public static int field1790 = 0;

    @ObfuscatedName("cx.be")
    public static int field1792 = 0;

    @ObfuscatedName("cx.br")
    public static int field1751 = 0;

    @ObfuscatedName("cx.bb")
    public static int[] field1794 = new int[1000];

    @ObfuscatedName("cx.bq")
    public static int[] field1745 = class86.field1515;

    @ObfuscatedName("cx.bk")
    public static int[] field1783 = class86.field1516;

    @ObfuscatedName("cx.bs")
    public static int[] field1797 = class86.field1511;

    @ObfuscatedName("cx.bo")
    public static int[] field1739 = class86.field1514;

    public class100() {
    }

    public class100(class100[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1789 = 0;
        this.field1743 = 0;
        this.field1755 = 0;
        this.field1771 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class100 var8 = arg0[var7];
            if (var8 != null) {
                this.field1789 += var8.field1789;
                this.field1743 += var8.field1743;
                this.field1755 += var8.field1755;
                if (var8.field1750 == null) {
                    if (this.field1771 == -1) {
                        this.field1771 = var8.field1771;
                    }
                    if (this.field1771 != var8.field1771) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1759 != null;
                var5 |= var8.field1753 != null;
                var6 |= var8.field1752 != null;
            }
        }
        this.field1796 = new int[this.field1789];
        this.field1741 = new int[this.field1789];
        this.field1742 = new int[this.field1789];
        this.field1795 = new int[this.field1743];
        this.field1779 = new int[this.field1743];
        this.field1754 = new int[this.field1743];
        this.field1747 = new int[this.field1743];
        this.field1748 = new int[this.field1743];
        this.field1749 = new int[this.field1743];
        if (var3) {
            this.field1750 = new byte[this.field1743];
        }
        if (var4) {
            this.field1759 = new byte[this.field1743];
        }
        if (var5) {
            this.field1753 = new short[this.field1743];
        }
        if (var6) {
            this.field1752 = new byte[this.field1743];
        }
        if (this.field1755 > 0) {
            this.field1776 = new int[this.field1755];
            this.field1757 = new int[this.field1755];
            this.field1758 = new int[this.field1755];
        }
        this.field1789 = 0;
        this.field1743 = 0;
        this.field1755 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class100 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1743; var11++) {
                    this.field1795[this.field1743] = var10.field1795[var11] + this.field1789;
                    this.field1779[this.field1743] = var10.field1779[var11] + this.field1789;
                    this.field1754[this.field1743] = var10.field1754[var11] + this.field1789;
                    this.field1747[this.field1743] = var10.field1747[var11];
                    this.field1748[this.field1743] = var10.field1748[var11];
                    this.field1749[this.field1743] = var10.field1749[var11];
                    if (var3) {
                        if (var10.field1750 == null) {
                            this.field1750[this.field1743] = var10.field1771;
                        } else {
                            this.field1750[this.field1743] = var10.field1750[var11];
                        }
                    }
                    if (var4 && var10.field1759 != null) {
                        this.field1759[this.field1743] = var10.field1759[var11];
                    }
                    if (var5) {
                        if (var10.field1753 == null) {
                            this.field1753[this.field1743] = -1;
                        } else {
                            this.field1753[this.field1743] = var10.field1753[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1752 == null || var10.field1752[var11] == -1) {
                            this.field1752[this.field1743] = -1;
                        } else {
                            this.field1752[this.field1743] = (byte) (var10.field1752[var11] + this.field1755);
                        }
                    }
                    this.field1743++;
                }
                for (int var12 = 0; var12 < var10.field1755; var12++) {
                    this.field1776[this.field1755] = var10.field1776[var12] + this.field1789;
                    this.field1757[this.field1755] = var10.field1757[var12] + this.field1789;
                    this.field1758[this.field1755] = var10.field1758[var12] + this.field1789;
                    this.field1755++;
                }
                for (int var13 = 0; var13 < var10.field1789; var13++) {
                    this.field1796[this.field1789] = var10.field1796[var13];
                    this.field1741[this.field1789] = var10.field1741[var13];
                    this.field1742[this.field1789] = var10.field1742[var13];
                    this.field1789++;
                }
            }
        }
    }

    @ObfuscatedName("cx.b([[IIIIZI)Lcx;")
    public class100 method1971(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1974();
        int var7 = arg1 - this.field1764;
        int var8 = this.field1764 + arg1;
        int var9 = arg3 - this.field1764;
        int var10 = this.field1764 + arg3;
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
            var15.field1789 = this.field1789;
            var15.field1743 = this.field1743;
            var15.field1755 = this.field1755;
            var15.field1796 = this.field1796;
            var15.field1742 = this.field1742;
            var15.field1795 = this.field1795;
            var15.field1779 = this.field1779;
            var15.field1754 = this.field1754;
            var15.field1747 = this.field1747;
            var15.field1748 = this.field1748;
            var15.field1749 = this.field1749;
            var15.field1750 = this.field1750;
            var15.field1759 = this.field1759;
            var15.field1752 = this.field1752;
            var15.field1753 = this.field1753;
            var15.field1771 = this.field1771;
            var15.field1776 = this.field1776;
            var15.field1757 = this.field1757;
            var15.field1758 = this.field1758;
            var15.field1788 = this.field1788;
            var15.field1760 = this.field1760;
            var15.field1770 = this.field1770;
            var15.field1741 = new int[var15.field1789];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1789; var16++) {
                int var17 = this.field1796[var16] + arg1;
                int var18 = this.field1742[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1741[var16] = this.field1741[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1789; var26++) {
                int var27 = (-this.field1741[var26] << 16) / this.field1384;
                if (var27 < arg5) {
                    int var28 = this.field1796[var26] + arg1;
                    int var29 = this.field1742[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1741[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1741[var26];
                }
            }
        }
        var15.field1793 = 0;
        return var15;
    }

    @ObfuscatedName("cx.a(Z)Lcx;")
    public class100 method1988(boolean arg0) {
        if (!arg0 && field1736.length < this.field1743) {
            field1736 = new byte[this.field1743 + 100];
        }
        return this.method2023(arg0, field1740, field1736);
    }

    @ObfuscatedName("cx.k(Z)Lcx;")
    public class100 method1972(boolean arg0) {
        if (!arg0 && field1777.length < this.field1743) {
            field1777 = new byte[this.field1743 + 100];
        }
        return this.method2023(arg0, field1737, field1777);
    }

    @ObfuscatedName("cx.p(ZLcx;[B)Lcx;")
    public class100 method2023(boolean arg0, class100 arg1, byte[] arg2) {
        arg1.field1789 = this.field1789;
        arg1.field1743 = this.field1743;
        arg1.field1755 = this.field1755;
        if (arg1.field1796 == null || arg1.field1796.length < this.field1789) {
            arg1.field1796 = new int[this.field1789 + 100];
            arg1.field1741 = new int[this.field1789 + 100];
            arg1.field1742 = new int[this.field1789 + 100];
        }
        for (int var4 = 0; var4 < this.field1789; var4++) {
            arg1.field1796[var4] = this.field1796[var4];
            arg1.field1741[var4] = this.field1741[var4];
            arg1.field1742[var4] = this.field1742[var4];
        }
        if (arg0) {
            arg1.field1759 = this.field1759;
        } else {
            arg1.field1759 = arg2;
            if (this.field1759 == null) {
                for (int var5 = 0; var5 < this.field1743; var5++) {
                    arg1.field1759[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1743; var6++) {
                    arg1.field1759[var6] = this.field1759[var6];
                }
            }
        }
        arg1.field1795 = this.field1795;
        arg1.field1779 = this.field1779;
        arg1.field1754 = this.field1754;
        arg1.field1747 = this.field1747;
        arg1.field1748 = this.field1748;
        arg1.field1749 = this.field1749;
        arg1.field1750 = this.field1750;
        arg1.field1752 = this.field1752;
        arg1.field1753 = this.field1753;
        arg1.field1771 = this.field1771;
        arg1.field1776 = this.field1776;
        arg1.field1757 = this.field1757;
        arg1.field1758 = this.field1758;
        arg1.field1788 = this.field1788;
        arg1.field1760 = this.field1760;
        arg1.field1770 = this.field1770;
        arg1.field1793 = 0;
        return arg1;
    }

    @ObfuscatedName("cx.m()V")
    public void method1974() {
        if (this.field1793 == 1) {
            return;
        }
        this.field1793 = 1;
        this.field1384 = 0;
        this.field1763 = 0;
        this.field1764 = 0;
        for (int var1 = 0; var1 < this.field1789; var1++) {
            int var2 = this.field1796[var1];
            int var3 = this.field1741[var1];
            int var4 = this.field1742[var1];
            if (-var3 > this.field1384) {
                this.field1384 = -var3;
            }
            if (var3 > this.field1763) {
                this.field1763 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1764) {
                this.field1764 = var5;
            }
        }
        this.field1764 = (int) (Math.sqrt((double) this.field1764) + 0.99D);
        this.field1766 = (int) (Math.sqrt((double) (this.field1384 * this.field1384 + this.field1764 * this.field1764)) + 0.99D);
        this.field1765 = this.field1766 + (int) (Math.sqrt((double) (this.field1764 * this.field1764 + this.field1763 * this.field1763)) + 0.99D);
    }

    @ObfuscatedName("cx.q()V")
    public void method1975() {
        if (this.field1793 == 2) {
            return;
        }
        this.field1793 = 2;
        this.field1764 = 0;
        for (int var1 = 0; var1 < this.field1789; var1++) {
            int var2 = this.field1796[var1];
            int var3 = this.field1741[var1];
            int var4 = this.field1742[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1764) {
                this.field1764 = var5;
            }
        }
        this.field1764 = (int) (Math.sqrt((double) this.field1764) + 0.99D);
        this.field1766 = this.field1764;
        this.field1765 = this.field1764 + this.field1764;
    }

    @ObfuscatedName("cx.v()I")
    public int method1976() {
        this.method1974();
        return this.field1764;
    }

    @ObfuscatedName("cx.n(Lcv;I)V")
    public void method1977(class98 arg0, int arg1) {
        if (this.field1788 == null || arg1 == -1) {
            return;
        }
        class83 var3 = arg0.field1707[arg1];
        class97 var4 = var3.field1461;
        Statics.field1787 = 0;
        Statics.field1773 = 0;
        Statics.field1735 = 0;
        for (int var5 = 0; var5 < var3.field1466; var5++) {
            int var6 = var3.field1467[var5];
            this.method1979(var4.field1700[var6], var4.field1703[var6], var3.field1468[var5], var3.field1462[var5], var3.field1465[var5]);
        }
        this.field1793 = 0;
    }

    @ObfuscatedName("cx.z(Lcv;ILcv;I[I)V")
    public void method2005(class98 arg0, int arg1, class98 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method1977(arg0, arg1);
            return;
        }
        class83 var6 = arg0.field1707[arg1];
        class83 var7 = arg2.field1707[arg3];
        class97 var8 = var6.field1461;
        Statics.field1787 = 0;
        Statics.field1773 = 0;
        Statics.field1735 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1466; var11++) {
            int var12 = var6.field1467[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1700[var12] == 0) {
                this.method1979(var8.field1700[var12], var8.field1703[var12], var6.field1468[var11], var6.field1462[var11], var6.field1465[var11]);
            }
        }
        Statics.field1787 = 0;
        Statics.field1773 = 0;
        Statics.field1735 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1466; var15++) {
            int var16 = var7.field1467[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1700[var16] == 0) {
                this.method1979(var8.field1700[var16], var8.field1703[var16], var7.field1468[var15], var7.field1462[var15], var7.field1465[var15]);
            }
        }
        this.field1793 = 0;
    }

    @ObfuscatedName("cx.r(I[IIII)V")
    public void method1979(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1787 = 0;
            Statics.field1773 = 0;
            Statics.field1735 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1788.length) {
                    int[] var10 = this.field1788[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1787 += this.field1796[var12];
                        Statics.field1773 += this.field1741[var12];
                        Statics.field1735 += this.field1742[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1787 = Statics.field1787 / var7 + arg2;
                Statics.field1773 = Statics.field1773 / var7 + arg3;
                Statics.field1735 = Statics.field1735 / var7 + arg4;
            } else {
                Statics.field1787 = arg2;
                Statics.field1773 = arg3;
                Statics.field1735 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1788.length) {
                    int[] var15 = this.field1788[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1796[var17] += arg2;
                        this.field1741[var17] += arg3;
                        this.field1742[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1788.length) {
                    int[] var20 = this.field1788[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1796[var22] -= Statics.field1787;
                        this.field1741[var22] -= Statics.field1773;
                        this.field1742[var22] -= Statics.field1735;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1745[var25];
                            int var27 = field1783[var25];
                            int var28 = this.field1796[var22] * var27 + this.field1741[var22] * var26 >> 16;
                            this.field1741[var22] = this.field1741[var22] * var27 - this.field1796[var22] * var26 >> 16;
                            this.field1796[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1745[var23];
                            int var30 = field1783[var23];
                            int var31 = this.field1741[var22] * var30 - this.field1742[var22] * var29 >> 16;
                            this.field1742[var22] = this.field1742[var22] * var30 + this.field1741[var22] * var29 >> 16;
                            this.field1741[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1745[var24];
                            int var33 = field1783[var24];
                            int var34 = this.field1796[var22] * var33 + this.field1742[var22] * var32 >> 16;
                            this.field1742[var22] = this.field1742[var22] * var33 - this.field1796[var22] * var32 >> 16;
                            this.field1796[var22] = var34;
                        }
                        this.field1796[var22] += Statics.field1787;
                        this.field1741[var22] += Statics.field1773;
                        this.field1742[var22] += Statics.field1735;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1788.length) {
                    int[] var37 = this.field1788[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1796[var39] -= Statics.field1787;
                        this.field1741[var39] -= Statics.field1773;
                        this.field1742[var39] -= Statics.field1735;
                        this.field1796[var39] = this.field1796[var39] * arg2 / 128;
                        this.field1741[var39] = this.field1741[var39] * arg3 / 128;
                        this.field1742[var39] = this.field1742[var39] * arg4 / 128;
                        this.field1796[var39] += Statics.field1787;
                        this.field1741[var39] += Statics.field1773;
                        this.field1742[var39] += Statics.field1735;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1760 != null && this.field1759 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1760.length) {
                    int[] var42 = this.field1760[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1759[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1759[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cx.i()V")
    public void method2029() {
        for (int var1 = 0; var1 < this.field1789; var1++) {
            int var2 = this.field1796[var1];
            this.field1796[var1] = this.field1742[var1];
            this.field1742[var1] = -var2;
        }
        this.field1793 = 0;
    }

    @ObfuscatedName("cx.s()V")
    public void method2015() {
        for (int var1 = 0; var1 < this.field1789; var1++) {
            this.field1796[var1] = -this.field1796[var1];
            this.field1742[var1] = -this.field1742[var1];
        }
        this.field1793 = 0;
    }

    @ObfuscatedName("cx.c()V")
    public void method2037() {
        for (int var1 = 0; var1 < this.field1789; var1++) {
            int var2 = this.field1742[var1];
            this.field1742[var1] = this.field1796[var1];
            this.field1796[var1] = -var2;
        }
        this.field1793 = 0;
    }

    @ObfuscatedName("cx.t(I)V")
    public void method1983(int arg0) {
        int var2 = field1745[arg0];
        int var3 = field1783[arg0];
        for (int var4 = 0; var4 < this.field1789; var4++) {
            int var5 = this.field1741[var4] * var3 - this.field1742[var4] * var2 >> 16;
            this.field1742[var4] = this.field1742[var4] * var3 + this.field1741[var4] * var2 >> 16;
            this.field1741[var4] = var5;
        }
        this.field1793 = 0;
    }

    @ObfuscatedName("cx.h(III)V")
    public void method1984(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1789; var4++) {
            this.field1796[var4] += arg0;
            this.field1741[var4] += arg1;
            this.field1742[var4] += arg2;
        }
        this.field1793 = 0;
    }

    @ObfuscatedName("cx.w(III)V")
    public void method1985(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1789; var4++) {
            this.field1796[var4] = this.field1796[var4] * arg0 / 128;
            this.field1741[var4] = this.field1741[var4] * arg1 / 128;
            this.field1742[var4] = this.field1742[var4] * arg2 / 128;
        }
        this.field1793 = 0;
    }

    @ObfuscatedName("cx.g(IIIIIII)V")
    public final void method1982(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1756[0] = -1;
        if (this.field1793 != 2 && this.field1793 != 1) {
            this.method1975();
        }
        int var8 = Statics.field1507;
        int var9 = Statics.field1503;
        int var10 = field1745[arg0];
        int var11 = field1783[arg0];
        int var12 = field1745[arg1];
        int var13 = field1783[arg1];
        int var14 = field1745[arg2];
        int var15 = field1783[arg2];
        int var16 = field1745[arg3];
        int var17 = field1783[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1789; var19++) {
            int var20 = this.field1796[var19];
            int var21 = this.field1741[var19];
            int var22 = this.field1742[var19];
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
            field1772[var19] = var30 - var18;
            field1778[var19] = class86.field1501 * var26 / var30 + var8;
            field1744[var19] = class86.field1501 * var29 / var30 + var9;
            if (this.field1755 > 0) {
                field1761[var19] = var26;
                field1774[var19] = var29;
                field1775[var19] = var30;
            }
        }
        try {
            this.method1989(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("cx.f(IIIIIIII)V")
    public final void method1987(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1756[0] = -1;
        if (this.field1793 != 2 && this.field1793 != 1) {
            this.method1975();
        }
        int var9 = Statics.field1507;
        int var10 = Statics.field1503;
        int var11 = field1745[arg0];
        int var12 = field1783[arg0];
        int var13 = field1745[arg1];
        int var14 = field1783[arg1];
        int var15 = field1745[arg2];
        int var16 = field1783[arg2];
        int var17 = field1745[arg3];
        int var18 = field1783[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1789; var20++) {
            int var21 = this.field1796[var20];
            int var22 = this.field1741[var20];
            int var23 = this.field1742[var20];
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
            field1772[var20] = var31 - var19;
            field1778[var20] = class86.field1501 * var27 / arg7 + var9;
            field1744[var20] = class86.field1501 * var30 / arg7 + var10;
            if (this.field1755 > 0) {
                field1761[var20] = var27;
                field1774[var20] = var30;
                field1775[var20] = var31;
            }
        }
        try {
            this.method1989(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("cx.ax(IIIIIIIII)V")
    public void method1582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1756[0] = -1;
        if (this.field1793 != 1) {
            this.method1974();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1764 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1764) * class86.field1501;
        if (var15 / var13 >= Statics.field1499) {
            return;
        }
        int var16 = (this.field1764 + var14) * class86.field1501;
        if (var16 / var13 <= Statics.field1506) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1764 * arg1 >> 16;
        int var19 = (var17 + var18) * class86.field1501;
        if (var19 / var13 <= Statics.field1508) {
            return;
        }
        int var20 = (this.field1384 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class86.field1501;
        if (var21 / var13 >= Statics.field1502) {
            return;
        }
        int var22 = (this.field1384 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1755 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1798) {
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
            int var32 = field1790 - Statics.field1507;
            int var33 = field1792 - Statics.field1503;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1770) {
                    field1794[field1751++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1507;
        int var35 = Statics.field1503;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1745[arg0];
            var37 = field1783[arg0];
        }
        for (int var38 = 0; var38 < this.field1789; var38++) {
            int var39 = this.field1796[var38];
            int var40 = this.field1741[var38];
            int var41 = this.field1742[var38];
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
            field1772[var38] = var50 - var11;
            if (var50 >= 50) {
                field1778[var38] = class86.field1501 * var46 / var50 + var34;
                field1744[var38] = class86.field1501 * var49 / var50 + var35;
            } else {
                field1778[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1761[var38] = var46;
                field1774[var38] = var49;
                field1775[var38] = var50;
            }
        }
        try {
            this.method1989(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("cx.y(ZZI)V")
    public final void method1989(boolean arg0, boolean arg1, int arg2) {
        if (this.field1765 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1765; var4++) {
            field1756[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1743; var5++) {
            if (this.field1749[var5] != -2) {
                int var6 = this.field1795[var5];
                int var7 = this.field1779[var5];
                int var8 = this.field1754[var5];
                int var9 = field1778[var6];
                int var10 = field1778[var7];
                int var11 = field1778[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1761[var6];
                    int var13 = field1761[var7];
                    int var14 = field1761[var8];
                    int var15 = field1774[var6];
                    int var16 = field1774[var7];
                    int var17 = field1774[var8];
                    int var18 = field1775[var6];
                    int var19 = field1775[var7];
                    int var20 = field1775[var8];
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
                        field1769[var5] = true;
                        int var30 = (field1772[var6] + field1772[var7] + field1772[var8]) / 3 + this.field1766;
                        field1738[var30][field1756[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method1992(field1790, field1792, field1744[var6], field1744[var7], field1744[var8], var9, var10, var11)) {
                        field1794[field1751++] = arg2;
                        arg1 = false;
                    }
                    if ((field1744[var8] - field1744[var7]) * (var9 - var10) - (field1744[var6] - field1744[var7]) * (var11 - var10) > 0) {
                        field1769[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1504 && var10 <= Statics.field1504 && var11 <= Statics.field1504) {
                            field1768[var5] = false;
                        } else {
                            field1768[var5] = true;
                        }
                        int var31 = (field1772[var6] + field1772[var7] + field1772[var8]) / 3 + this.field1766;
                        field1738[var31][field1756[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1750 == null) {
            for (int var32 = this.field1765 - 1; var32 >= 0; var32--) {
                int var33 = field1756[var32];
                if (var33 > 0) {
                    int[] var34 = field1738[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method1981(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1762[var36] = 0;
            field1746[var36] = 0;
        }
        for (int var37 = this.field1765 - 1; var37 >= 0; var37--) {
            int var38 = field1756[var37];
            if (var38 > 0) {
                int[] var39 = field1738[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1750[var41];
                    int var43 = field1762[var42]++;
                    field1780[var42][var43] = var41;
                    if (var42 < 10) {
                        field1746[var42] += var37;
                    } else if (var42 == 10) {
                        field1781[var43] = var37;
                    } else {
                        field1782[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1762[1] > 0 || field1762[2] > 0) {
            var44 = (field1746[1] + field1746[2]) / (field1762[1] + field1762[2]);
        }
        int var45 = 0;
        if (field1762[3] > 0 || field1762[4] > 0) {
            var45 = (field1746[3] + field1746[4]) / (field1762[3] + field1762[4]);
        }
        int var46 = 0;
        if (field1762[6] > 0 || field1762[8] > 0) {
            var46 = (field1746[6] + field1746[8]) / (field1762[6] + field1762[8]);
        }
        int var47 = 0;
        int var48 = field1762[10];
        int[] var49 = field1780[10];
        int[] var50 = field1781;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1762[11];
            var49 = field1780[11];
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
                this.method1981(var49[var47++]);
                if (var47 == var48 && field1780[11] != var49) {
                    var47 = 0;
                    var48 = field1762[11];
                    var49 = field1780[11];
                    var50 = field1782;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method1981(var49[var47++]);
                if (var47 == var48 && field1780[11] != var49) {
                    var47 = 0;
                    var48 = field1762[11];
                    var49 = field1780[11];
                    var50 = field1782;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method1981(var49[var47++]);
                if (var47 == var48 && field1780[11] != var49) {
                    var47 = 0;
                    var48 = field1762[11];
                    var49 = field1780[11];
                    var50 = field1782;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1762[var52];
            int[] var54 = field1780[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method1981(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method1981(var49[var47++]);
            if (var47 == var48 && field1780[11] != var49) {
                var47 = 0;
                var49 = field1780[11];
                var48 = field1762[11];
                var50 = field1782;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("cx.j(I)V")
    public final void method1981(int arg0) {
        if (field1769[arg0]) {
            this.method1991(arg0);
            return;
        }
        int var2 = this.field1795[arg0];
        int var3 = this.field1779[arg0];
        int var4 = this.field1754[arg0];
        class86.field1493 = field1768[arg0];
        if (this.field1759 == null) {
            class86.field1496 = 0;
        } else {
            class86.field1496 = this.field1759[arg0] & 0xFF;
        }
        if (this.field1753 != null && this.field1753[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1752 == null || this.field1752[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1752[arg0] & 0xFF;
                var6 = this.field1776[var5];
                var7 = this.field1757[var5];
                var8 = this.field1758[var5];
            }
            if (this.field1749[arg0] == -1) {
                class86.method1790(field1744[var2], field1744[var3], field1744[var4], field1778[var2], field1778[var3], field1778[var4], this.field1747[arg0], this.field1747[arg0], this.field1747[arg0], field1761[var6], field1761[var7], field1761[var8], field1774[var6], field1774[var7], field1774[var8], field1775[var6], field1775[var7], field1775[var8], this.field1753[arg0]);
            } else {
                class86.method1790(field1744[var2], field1744[var3], field1744[var4], field1778[var2], field1778[var3], field1778[var4], this.field1747[arg0], this.field1748[arg0], this.field1749[arg0], field1761[var6], field1761[var7], field1761[var8], field1774[var6], field1774[var7], field1774[var8], field1775[var6], field1775[var7], field1775[var8], this.field1753[arg0]);
            }
        } else if (this.field1749[arg0] == -1) {
            class86.method1788(field1744[var2], field1744[var3], field1744[var4], field1778[var2], field1778[var3], field1778[var4], field1797[this.field1747[arg0]]);
        } else {
            class86.method1783(field1744[var2], field1744[var3], field1744[var4], field1778[var2], field1778[var3], field1778[var4], this.field1747[arg0], this.field1748[arg0], this.field1749[arg0]);
        }
    }

    @ObfuscatedName("cx.x(I)V")
    public final void method1991(int arg0) {
        int var2 = Statics.field1507;
        int var3 = Statics.field1503;
        int var4 = 0;
        int var5 = this.field1795[arg0];
        int var6 = this.field1779[arg0];
        int var7 = this.field1754[arg0];
        int var8 = field1775[var5];
        int var9 = field1775[var6];
        int var10 = field1775[var7];
        if (this.field1759 == null) {
            class86.field1496 = 0;
        } else {
            class86.field1496 = this.field1759[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1784[var4] = field1778[var5];
            field1785[var4] = field1744[var5];
            field1786[var4++] = this.field1747[arg0];
        } else {
            int var11 = field1761[var5];
            int var12 = field1774[var5];
            int var13 = this.field1747[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1739[var10 - var8];
                field1784[var4] = (((field1761[var7] - var11) * var14 >> 16) + var11) * class86.field1501 / 50 + var2;
                field1785[var4] = (((field1774[var7] - var12) * var14 >> 16) + var12) * class86.field1501 / 50 + var3;
                field1786[var4++] = ((this.field1749[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1739[var9 - var8];
                field1784[var4] = (((field1761[var6] - var11) * var15 >> 16) + var11) * class86.field1501 / 50 + var2;
                field1785[var4] = (((field1774[var6] - var12) * var15 >> 16) + var12) * class86.field1501 / 50 + var3;
                field1786[var4++] = ((this.field1748[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1784[var4] = field1778[var6];
            field1785[var4] = field1744[var6];
            field1786[var4++] = this.field1748[arg0];
        } else {
            int var16 = field1761[var6];
            int var17 = field1774[var6];
            int var18 = this.field1748[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1739[var8 - var9];
                field1784[var4] = (((field1761[var5] - var16) * var19 >> 16) + var16) * class86.field1501 / 50 + var2;
                field1785[var4] = (((field1774[var5] - var17) * var19 >> 16) + var17) * class86.field1501 / 50 + var3;
                field1786[var4++] = ((this.field1747[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1739[var10 - var9];
                field1784[var4] = (((field1761[var7] - var16) * var20 >> 16) + var16) * class86.field1501 / 50 + var2;
                field1785[var4] = (((field1774[var7] - var17) * var20 >> 16) + var17) * class86.field1501 / 50 + var3;
                field1786[var4++] = ((this.field1749[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1784[var4] = field1778[var7];
            field1785[var4] = field1744[var7];
            field1786[var4++] = this.field1749[arg0];
        } else {
            int var21 = field1761[var7];
            int var22 = field1774[var7];
            int var23 = this.field1749[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1739[var9 - var10];
                field1784[var4] = (((field1761[var6] - var21) * var24 >> 16) + var21) * class86.field1501 / 50 + var2;
                field1785[var4] = (((field1774[var6] - var22) * var24 >> 16) + var22) * class86.field1501 / 50 + var3;
                field1786[var4++] = ((this.field1748[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1739[var8 - var10];
                field1784[var4] = (((field1761[var5] - var21) * var25 >> 16) + var21) * class86.field1501 / 50 + var2;
                field1785[var4] = (((field1774[var5] - var22) * var25 >> 16) + var22) * class86.field1501 / 50 + var3;
                field1786[var4++] = ((this.field1747[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1784[0];
        int var27 = field1784[1];
        int var28 = field1784[2];
        int var29 = field1785[0];
        int var30 = field1785[1];
        int var31 = field1785[2];
        class86.field1493 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1504 || var27 > Statics.field1504 || var28 > Statics.field1504) {
                class86.field1493 = true;
            }
            if (this.field1753 != null && this.field1753[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1752 == null || this.field1752[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1752[arg0] & 0xFF;
                    var33 = this.field1776[var32];
                    var34 = this.field1757[var32];
                    var35 = this.field1758[var32];
                }
                if (this.field1749[arg0] == -1) {
                    class86.method1790(var29, var30, var31, var26, var27, var28, this.field1747[arg0], this.field1747[arg0], this.field1747[arg0], field1761[var33], field1761[var34], field1761[var35], field1774[var33], field1774[var34], field1774[var35], field1775[var33], field1775[var34], field1775[var35], this.field1753[arg0]);
                } else {
                    class86.method1790(var29, var30, var31, var26, var27, var28, field1786[0], field1786[1], field1786[2], field1761[var33], field1761[var34], field1761[var35], field1774[var33], field1774[var34], field1774[var35], field1775[var33], field1775[var34], field1775[var35], this.field1753[arg0]);
                }
            } else if (this.field1749[arg0] == -1) {
                class86.method1788(var29, var30, var31, var26, var27, var28, field1797[this.field1747[arg0]]);
            } else {
                class86.method1783(var29, var30, var31, var26, var27, var28, field1786[0], field1786[1], field1786[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1504 || var27 > Statics.field1504 || var28 > Statics.field1504 || field1784[3] < 0 || field1784[3] > Statics.field1504) {
            class86.field1493 = true;
        }
        if (this.field1753 != null && this.field1753[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1752 == null || this.field1752[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1752[arg0] & 0xFF;
                var37 = this.field1776[var36];
                var38 = this.field1757[var36];
                var39 = this.field1758[var36];
            }
            short var40 = this.field1753[arg0];
            if (this.field1749[arg0] == -1) {
                class86.method1790(var29, var30, var31, var26, var27, var28, this.field1747[arg0], this.field1747[arg0], this.field1747[arg0], field1761[var37], field1761[var38], field1761[var39], field1774[var37], field1774[var38], field1774[var39], field1775[var37], field1775[var38], field1775[var39], var40);
                class86.method1790(var29, var31, field1785[3], var26, var28, field1784[3], this.field1747[arg0], this.field1747[arg0], this.field1747[arg0], field1761[var37], field1761[var38], field1761[var39], field1774[var37], field1774[var38], field1774[var39], field1775[var37], field1775[var38], field1775[var39], var40);
            } else {
                class86.method1790(var29, var30, var31, var26, var27, var28, field1786[0], field1786[1], field1786[2], field1761[var37], field1761[var38], field1761[var39], field1774[var37], field1774[var38], field1774[var39], field1775[var37], field1775[var38], field1775[var39], var40);
                class86.method1790(var29, var31, field1785[3], var26, var28, field1784[3], field1786[0], field1786[2], field1786[3], field1761[var37], field1761[var38], field1761[var39], field1774[var37], field1774[var38], field1774[var39], field1775[var37], field1775[var38], field1775[var39], var40);
            }
        } else if (this.field1749[arg0] == -1) {
            int var41 = field1797[this.field1747[arg0]];
            class86.method1788(var29, var30, var31, var26, var27, var28, var41);
            class86.method1788(var29, var31, field1785[3], var26, var28, field1784[3], var41);
        } else {
            class86.method1783(var29, var30, var31, var26, var27, var28, field1786[0], field1786[1], field1786[2]);
            class86.method1783(var29, var31, field1785[3], var26, var28, field1784[3], field1786[0], field1786[2], field1786[3]);
        }
    }

    @ObfuscatedName("cx.d(IIIIIIII)Z")
    public final boolean method1992(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
