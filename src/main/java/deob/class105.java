package deob;

@ObfuscatedName("db")
public class class105 extends class85 {

    @ObfuscatedName("db.m")
    public static class105 field1799 = new class105();

    @ObfuscatedName("db.l")
    public static byte[] field1766 = new byte[1];

    @ObfuscatedName("db.y")
    public static class105 field1748 = new class105();

    @ObfuscatedName("db.u")
    public static byte[] field1749 = new byte[1];

    @ObfuscatedName("db.k")
    public int field1750 = 0;

    @ObfuscatedName("db.j")
    public int[] field1751;

    @ObfuscatedName("db.i")
    public int[] field1752;

    @ObfuscatedName("db.x")
    public int[] field1753;

    @ObfuscatedName("db.g")
    public int field1811 = 0;

    @ObfuscatedName("db.e")
    public int[] field1760;

    @ObfuscatedName("db.p")
    public int[] field1756;

    @ObfuscatedName("db.a")
    public int[] field1757;

    @ObfuscatedName("db.v")
    public int[] field1758;

    @ObfuscatedName("db.c")
    public int[] field1747;

    @ObfuscatedName("db.s")
    public int[] field1793;

    @ObfuscatedName("db.r")
    public byte[] field1789;

    @ObfuscatedName("db.h")
    public byte[] field1762;

    @ObfuscatedName("db.n")
    public byte[] field1773;

    @ObfuscatedName("db.b")
    public short[] field1764;

    @ObfuscatedName("db.f")
    public byte field1761 = 0;

    @ObfuscatedName("db.d")
    public int field1810 = 0;

    @ObfuscatedName("db.q")
    public int[] field1806;

    @ObfuscatedName("db.o")
    public int[] field1768;

    @ObfuscatedName("db.w")
    public int[] field1769;

    @ObfuscatedName("db.z")
    public int[][] field1778;

    @ObfuscatedName("db.t")
    public int[][] field1771;

    @ObfuscatedName("db.aq")
    public boolean field1772 = false;

    @ObfuscatedName("db.an")
    public int field1759;

    @ObfuscatedName("db.av")
    public int field1770;

    @ObfuscatedName("db.ac")
    public int field1775;

    @ObfuscatedName("db.ar")
    public int field1776;

    @ObfuscatedName("db.ah")
    public int field1777;

    @ObfuscatedName("db.au")
    public static boolean[] field1779 = new boolean[4096];

    @ObfuscatedName("db.ao")
    public static boolean[] field1797 = new boolean[4096];

    @ObfuscatedName("db.am")
    public static int[] field1781 = new int[4096];

    @ObfuscatedName("db.aa")
    public static int[] field1782 = new int[4096];

    @ObfuscatedName("db.aj")
    public static int[] field1783 = new int[4096];

    @ObfuscatedName("db.ap")
    public static int[] field1807 = new int[4096];

    @ObfuscatedName("db.at")
    public static int[] field1785 = new int[4096];

    @ObfuscatedName("db.az")
    public static int[] field1786 = new int[4096];

    @ObfuscatedName("db.af")
    public static int[] field1805 = new int[1600];

    @ObfuscatedName("db.aw")
    public static int[][] field1755 = new int[1600][512];

    @ObfuscatedName("db.al")
    public static int[] field1790 = new int[12];

    @ObfuscatedName("db.ax")
    public static int[][] field1791 = new int[12][2000];

    @ObfuscatedName("db.ag")
    public static int[] field1792 = new int[2000];

    @ObfuscatedName("db.ak")
    public static int[] field1774 = new int[2000];

    @ObfuscatedName("db.ad")
    public static int[] field1794 = new int[12];

    @ObfuscatedName("db.ae")
    public static int[] field1795 = new int[10];

    @ObfuscatedName("db.as")
    public static int[] field1796 = new int[10];

    @ObfuscatedName("db.ay")
    public static int[] field1767 = new int[10];

    @ObfuscatedName("db.bg")
    public static boolean field1801 = false;

    @ObfuscatedName("db.bi")
    public static int field1802 = 0;

    @ObfuscatedName("db.bd")
    public static int field1803 = 0;

    @ObfuscatedName("db.bw")
    public static int field1804 = 0;

    @ObfuscatedName("db.br")
    public static int[] field1754 = new int[1000];

    @ObfuscatedName("db.bb")
    public static int[] field1746 = class91.field1530;

    @ObfuscatedName("db.ba")
    public static int[] field1765 = class91.field1536;

    @ObfuscatedName("db.bt")
    public static int[] field1808 = class91.field1531;

    @ObfuscatedName("db.bk")
    public static int[] field1809 = class91.field1534;

    public class105() {
    }

    public class105(class105[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1750 = 0;
        this.field1811 = 0;
        this.field1810 = 0;
        this.field1761 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class105 var8 = arg0[var7];
            if (var8 != null) {
                this.field1750 += var8.field1750;
                this.field1811 += var8.field1811;
                this.field1810 += var8.field1810;
                if (var8.field1789 == null) {
                    if (this.field1761 == -1) {
                        this.field1761 = var8.field1761;
                    }
                    if (this.field1761 != var8.field1761) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1762 != null;
                var5 |= var8.field1764 != null;
                var6 |= var8.field1773 != null;
            }
        }
        this.field1751 = new int[this.field1750];
        this.field1752 = new int[this.field1750];
        this.field1753 = new int[this.field1750];
        this.field1760 = new int[this.field1811];
        this.field1756 = new int[this.field1811];
        this.field1757 = new int[this.field1811];
        this.field1758 = new int[this.field1811];
        this.field1747 = new int[this.field1811];
        this.field1793 = new int[this.field1811];
        if (var3) {
            this.field1789 = new byte[this.field1811];
        }
        if (var4) {
            this.field1762 = new byte[this.field1811];
        }
        if (var5) {
            this.field1764 = new short[this.field1811];
        }
        if (var6) {
            this.field1773 = new byte[this.field1811];
        }
        if (this.field1810 > 0) {
            this.field1806 = new int[this.field1810];
            this.field1768 = new int[this.field1810];
            this.field1769 = new int[this.field1810];
        }
        this.field1750 = 0;
        this.field1811 = 0;
        this.field1810 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class105 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1811; var11++) {
                    this.field1760[this.field1811] = var10.field1760[var11] + this.field1750;
                    this.field1756[this.field1811] = var10.field1756[var11] + this.field1750;
                    this.field1757[this.field1811] = var10.field1757[var11] + this.field1750;
                    this.field1758[this.field1811] = var10.field1758[var11];
                    this.field1747[this.field1811] = var10.field1747[var11];
                    this.field1793[this.field1811] = var10.field1793[var11];
                    if (var3) {
                        if (var10.field1789 == null) {
                            this.field1789[this.field1811] = var10.field1761;
                        } else {
                            this.field1789[this.field1811] = var10.field1789[var11];
                        }
                    }
                    if (var4 && var10.field1762 != null) {
                        this.field1762[this.field1811] = var10.field1762[var11];
                    }
                    if (var5) {
                        if (var10.field1764 == null) {
                            this.field1764[this.field1811] = -1;
                        } else {
                            this.field1764[this.field1811] = var10.field1764[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1773 == null || var10.field1773[var11] == -1) {
                            this.field1773[this.field1811] = -1;
                        } else {
                            this.field1773[this.field1811] = (byte) (var10.field1773[var11] + this.field1810);
                        }
                    }
                    this.field1811++;
                }
                for (int var12 = 0; var12 < var10.field1810; var12++) {
                    this.field1806[this.field1810] = var10.field1806[var12] + this.field1750;
                    this.field1768[this.field1810] = var10.field1768[var12] + this.field1750;
                    this.field1769[this.field1810] = var10.field1769[var12] + this.field1750;
                    this.field1810++;
                }
                for (int var13 = 0; var13 < var10.field1750; var13++) {
                    this.field1751[this.field1750] = var10.field1751[var13];
                    this.field1752[this.field1750] = var10.field1752[var13];
                    this.field1753[this.field1750] = var10.field1753[var13];
                    this.field1750++;
                }
            }
        }
    }

    @ObfuscatedName("db.m([[IIIIZI)Ldb;")
    public class105 method2185(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2188();
        int var7 = arg1 - this.field1775;
        int var8 = this.field1775 + arg1;
        int var9 = arg3 - this.field1775;
        int var10 = this.field1775 + arg3;
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
        class105 var15;
        if (arg4) {
            var15 = new class105();
            var15.field1750 = this.field1750;
            var15.field1811 = this.field1811;
            var15.field1810 = this.field1810;
            var15.field1751 = this.field1751;
            var15.field1753 = this.field1753;
            var15.field1760 = this.field1760;
            var15.field1756 = this.field1756;
            var15.field1757 = this.field1757;
            var15.field1758 = this.field1758;
            var15.field1747 = this.field1747;
            var15.field1793 = this.field1793;
            var15.field1789 = this.field1789;
            var15.field1762 = this.field1762;
            var15.field1773 = this.field1773;
            var15.field1764 = this.field1764;
            var15.field1761 = this.field1761;
            var15.field1806 = this.field1806;
            var15.field1768 = this.field1768;
            var15.field1769 = this.field1769;
            var15.field1778 = this.field1778;
            var15.field1771 = this.field1771;
            var15.field1772 = this.field1772;
            var15.field1752 = new int[var15.field1750];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1750; var16++) {
                int var17 = this.field1751[var16] + arg1;
                int var18 = this.field1753[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1752[var16] = this.field1752[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1750; var26++) {
                int var27 = (-this.field1752[var26] << 16) / this.field1408;
                if (var27 < arg5) {
                    int var28 = this.field1751[var26] + arg1;
                    int var29 = this.field1753[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1752[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1752[var26];
                }
            }
        }
        var15.field1759 = 0;
        return var15;
    }

    @ObfuscatedName("db.l(Z)Ldb;")
    public class105 method2203(boolean arg0) {
        if (!arg0 && field1766.length < this.field1811) {
            field1766 = new byte[this.field1811 + 100];
        }
        return this.method2192(arg0, field1799, field1766);
    }

    @ObfuscatedName("db.u(Z)Ldb;")
    public class105 method2187(boolean arg0) {
        if (!arg0 && field1749.length < this.field1811) {
            field1749 = new byte[this.field1811 + 100];
        }
        return this.method2192(arg0, field1748, field1749);
    }

    @ObfuscatedName("db.k(ZLdb;[B)Ldb;")
    public class105 method2192(boolean arg0, class105 arg1, byte[] arg2) {
        arg1.field1750 = this.field1750;
        arg1.field1811 = this.field1811;
        arg1.field1810 = this.field1810;
        if (arg1.field1751 == null || arg1.field1751.length < this.field1750) {
            arg1.field1751 = new int[this.field1750 + 100];
            arg1.field1752 = new int[this.field1750 + 100];
            arg1.field1753 = new int[this.field1750 + 100];
        }
        for (int var4 = 0; var4 < this.field1750; var4++) {
            arg1.field1751[var4] = this.field1751[var4];
            arg1.field1752[var4] = this.field1752[var4];
            arg1.field1753[var4] = this.field1753[var4];
        }
        if (arg0) {
            arg1.field1762 = this.field1762;
        } else {
            arg1.field1762 = arg2;
            if (this.field1762 == null) {
                for (int var5 = 0; var5 < this.field1811; var5++) {
                    arg1.field1762[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1811; var6++) {
                    arg1.field1762[var6] = this.field1762[var6];
                }
            }
        }
        arg1.field1760 = this.field1760;
        arg1.field1756 = this.field1756;
        arg1.field1757 = this.field1757;
        arg1.field1758 = this.field1758;
        arg1.field1747 = this.field1747;
        arg1.field1793 = this.field1793;
        arg1.field1789 = this.field1789;
        arg1.field1773 = this.field1773;
        arg1.field1764 = this.field1764;
        arg1.field1761 = this.field1761;
        arg1.field1806 = this.field1806;
        arg1.field1768 = this.field1768;
        arg1.field1769 = this.field1769;
        arg1.field1778 = this.field1778;
        arg1.field1771 = this.field1771;
        arg1.field1772 = this.field1772;
        arg1.field1759 = 0;
        return arg1;
    }

    @ObfuscatedName("db.j()V")
    public void method2188() {
        if (this.field1759 == 1) {
            return;
        }
        this.field1759 = 1;
        this.field1408 = 0;
        this.field1770 = 0;
        this.field1775 = 0;
        for (int var1 = 0; var1 < this.field1750; var1++) {
            int var2 = this.field1751[var1];
            int var3 = this.field1752[var1];
            int var4 = this.field1753[var1];
            if (-var3 > this.field1408) {
                this.field1408 = -var3;
            }
            if (var3 > this.field1770) {
                this.field1770 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1775) {
                this.field1775 = var5;
            }
        }
        this.field1775 = (int) (Math.sqrt((double) this.field1775) + 0.99D);
        this.field1777 = (int) (Math.sqrt((double) (this.field1408 * this.field1408 + this.field1775 * this.field1775)) + 0.99D);
        this.field1776 = this.field1777 + (int) (Math.sqrt((double) (this.field1775 * this.field1775 + this.field1770 * this.field1770)) + 0.99D);
    }

    @ObfuscatedName("db.i()V")
    public void method2189() {
        if (this.field1759 == 2) {
            return;
        }
        this.field1759 = 2;
        this.field1775 = 0;
        for (int var1 = 0; var1 < this.field1750; var1++) {
            int var2 = this.field1751[var1];
            int var3 = this.field1752[var1];
            int var4 = this.field1753[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1775) {
                this.field1775 = var5;
            }
        }
        this.field1775 = (int) (Math.sqrt((double) this.field1775) + 0.99D);
        this.field1777 = this.field1775;
        this.field1776 = this.field1775 + this.field1775;
    }

    @ObfuscatedName("db.x()I")
    public int method2190() {
        this.method2188();
        return this.field1775;
    }

    @ObfuscatedName("db.g(Lct;I)V")
    public void method2186(class103 arg0, int arg1) {
        if (this.field1778 == null || arg1 == -1) {
            return;
        }
        class88 var3 = arg0.field1718[arg1];
        class102 var4 = var3.field1487;
        Statics.field1798 = 0;
        Statics.field1784 = 0;
        Statics.field1800 = 0;
        for (int var5 = 0; var5 < var3.field1489; var5++) {
            int var6 = var3.field1492[var5];
            this.method2193(var4.field1714[var6], var4.field1717[var6], var3.field1491[var5], var3.field1494[var5], var3.field1493[var5]);
        }
        this.field1759 = 0;
    }

    @ObfuscatedName("db.e(Lct;ILct;I[I)V")
    public void method2212(class103 arg0, int arg1, class103 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2186(arg0, arg1);
            return;
        }
        class88 var6 = arg0.field1718[arg1];
        class88 var7 = arg2.field1718[arg3];
        class102 var8 = var6.field1487;
        Statics.field1798 = 0;
        Statics.field1784 = 0;
        Statics.field1800 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1489; var11++) {
            int var12 = var6.field1492[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1714[var12] == 0) {
                this.method2193(var8.field1714[var12], var8.field1717[var12], var6.field1491[var11], var6.field1494[var11], var6.field1493[var11]);
            }
        }
        Statics.field1798 = 0;
        Statics.field1784 = 0;
        Statics.field1800 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1489; var15++) {
            int var16 = var7.field1492[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1714[var16] == 0) {
                this.method2193(var8.field1714[var16], var8.field1717[var16], var7.field1491[var15], var7.field1494[var15], var7.field1493[var15]);
            }
        }
        this.field1759 = 0;
    }

    @ObfuscatedName("db.p(I[IIII)V")
    public void method2193(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1798 = 0;
            Statics.field1784 = 0;
            Statics.field1800 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1778.length) {
                    int[] var10 = this.field1778[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1798 += this.field1751[var12];
                        Statics.field1784 += this.field1752[var12];
                        Statics.field1800 += this.field1753[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1798 = Statics.field1798 / var7 + arg2;
                Statics.field1784 = Statics.field1784 / var7 + arg3;
                Statics.field1800 = Statics.field1800 / var7 + arg4;
            } else {
                Statics.field1798 = arg2;
                Statics.field1784 = arg3;
                Statics.field1800 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1778.length) {
                    int[] var15 = this.field1778[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1751[var17] += arg2;
                        this.field1752[var17] += arg3;
                        this.field1753[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1778.length) {
                    int[] var20 = this.field1778[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1751[var22] -= Statics.field1798;
                        this.field1752[var22] -= Statics.field1784;
                        this.field1753[var22] -= Statics.field1800;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1746[var25];
                            int var27 = field1765[var25];
                            int var28 = this.field1752[var22] * var26 + this.field1751[var22] * var27 >> 16;
                            this.field1752[var22] = this.field1752[var22] * var27 - this.field1751[var22] * var26 >> 16;
                            this.field1751[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1746[var23];
                            int var30 = field1765[var23];
                            int var31 = this.field1752[var22] * var30 - this.field1753[var22] * var29 >> 16;
                            this.field1753[var22] = this.field1753[var22] * var30 + this.field1752[var22] * var29 >> 16;
                            this.field1752[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1746[var24];
                            int var33 = field1765[var24];
                            int var34 = this.field1753[var22] * var32 + this.field1751[var22] * var33 >> 16;
                            this.field1753[var22] = this.field1753[var22] * var33 - this.field1751[var22] * var32 >> 16;
                            this.field1751[var22] = var34;
                        }
                        this.field1751[var22] += Statics.field1798;
                        this.field1752[var22] += Statics.field1784;
                        this.field1753[var22] += Statics.field1800;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1778.length) {
                    int[] var37 = this.field1778[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1751[var39] -= Statics.field1798;
                        this.field1752[var39] -= Statics.field1784;
                        this.field1753[var39] -= Statics.field1800;
                        this.field1751[var39] = this.field1751[var39] * arg2 / 128;
                        this.field1752[var39] = this.field1752[var39] * arg3 / 128;
                        this.field1753[var39] = this.field1753[var39] * arg4 / 128;
                        this.field1751[var39] += Statics.field1798;
                        this.field1752[var39] += Statics.field1784;
                        this.field1753[var39] += Statics.field1800;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1771 != null && this.field1762 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1771.length) {
                    int[] var42 = this.field1771[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1762[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1762[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("db.a()V")
    public void method2184() {
        for (int var1 = 0; var1 < this.field1750; var1++) {
            int var2 = this.field1751[var1];
            this.field1751[var1] = this.field1753[var1];
            this.field1753[var1] = -var2;
        }
        this.field1759 = 0;
    }

    @ObfuscatedName("db.v()V")
    public void method2236() {
        for (int var1 = 0; var1 < this.field1750; var1++) {
            this.field1751[var1] = -this.field1751[var1];
            this.field1753[var1] = -this.field1753[var1];
        }
        this.field1759 = 0;
    }

    @ObfuscatedName("db.c()V")
    public void method2196() {
        for (int var1 = 0; var1 < this.field1750; var1++) {
            int var2 = this.field1753[var1];
            this.field1753[var1] = this.field1751[var1];
            this.field1751[var1] = -var2;
        }
        this.field1759 = 0;
    }

    @ObfuscatedName("db.b(I)V")
    public void method2208(int arg0) {
        int var2 = field1746[arg0];
        int var3 = field1765[arg0];
        for (int var4 = 0; var4 < this.field1750; var4++) {
            int var5 = this.field1752[var4] * var3 - this.field1753[var4] * var2 >> 16;
            this.field1753[var4] = this.field1753[var4] * var3 + this.field1752[var4] * var2 >> 16;
            this.field1752[var4] = var5;
        }
        this.field1759 = 0;
    }

    @ObfuscatedName("db.f(III)V")
    public void method2198(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1750; var4++) {
            this.field1751[var4] += arg0;
            this.field1752[var4] += arg1;
            this.field1753[var4] += arg2;
        }
        this.field1759 = 0;
    }

    @ObfuscatedName("db.d(III)V")
    public void method2224(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1750; var4++) {
            this.field1751[var4] = this.field1751[var4] * arg0 / 128;
            this.field1752[var4] = this.field1752[var4] * arg1 / 128;
            this.field1753[var4] = this.field1753[var4] * arg2 / 128;
        }
        this.field1759 = 0;
    }

    @ObfuscatedName("db.q(IIIIIII)V")
    public final void method2200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1805[0] = -1;
        if (this.field1759 != 2 && this.field1759 != 1) {
            this.method2189();
        }
        int var8 = Statics.field1522;
        int var9 = Statics.field1523;
        int var10 = field1746[arg0];
        int var11 = field1765[arg0];
        int var12 = field1746[arg1];
        int var13 = field1765[arg1];
        int var14 = field1746[arg2];
        int var15 = field1765[arg2];
        int var16 = field1746[arg3];
        int var17 = field1765[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1750; var19++) {
            int var20 = this.field1751[var19];
            int var21 = this.field1752[var19];
            int var22 = this.field1753[var19];
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
            field1783[var19] = var30 - var18;
            field1781[var19] = class91.field1525 * var26 / var30 + var8;
            field1782[var19] = class91.field1525 * var29 / var30 + var9;
            if (this.field1810 > 0) {
                field1807[var19] = var26;
                field1785[var19] = var29;
                field1786[var19] = var30;
            }
        }
        try {
            this.method2214(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("db.o(IIIIIIII)V")
    public final void method2201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1805[0] = -1;
        if (this.field1759 != 2 && this.field1759 != 1) {
            this.method2189();
        }
        int var9 = Statics.field1522;
        int var10 = Statics.field1523;
        int var11 = field1746[arg0];
        int var12 = field1765[arg0];
        int var13 = field1746[arg1];
        int var14 = field1765[arg1];
        int var15 = field1746[arg2];
        int var16 = field1765[arg2];
        int var17 = field1746[arg3];
        int var18 = field1765[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1750; var20++) {
            int var21 = this.field1751[var20];
            int var22 = this.field1752[var20];
            int var23 = this.field1753[var20];
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
            field1783[var20] = var31 - var19;
            field1781[var20] = class91.field1525 * var27 / arg7 + var9;
            field1782[var20] = class91.field1525 * var30 / arg7 + var10;
            if (this.field1810 > 0) {
                field1807[var20] = var27;
                field1785[var20] = var30;
                field1786[var20] = var31;
            }
        }
        try {
            this.method2214(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("db.au(IIIIIIIII)V")
    public void method1814(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1805[0] = -1;
        if (this.field1759 != 1) {
            this.method2188();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1775 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1775) * class91.field1525;
        if (var15 / var13 >= Statics.field1516) {
            return;
        }
        int var16 = (this.field1775 + var14) * class91.field1525;
        if (var16 / var13 <= Statics.field1526) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1775 * arg1 >> 16;
        int var19 = (var17 + var18) * class91.field1525;
        if (var19 / var13 <= Statics.field1528) {
            return;
        }
        int var20 = (this.field1408 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class91.field1525;
        if (var21 / var13 >= Statics.field1521) {
            return;
        }
        int var22 = (this.field1408 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1810 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1801) {
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
            int var32 = field1802 - Statics.field1522;
            int var33 = field1803 - Statics.field1523;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1772) {
                    field1754[field1804++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1522;
        int var35 = Statics.field1523;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1746[arg0];
            var37 = field1765[arg0];
        }
        for (int var38 = 0; var38 < this.field1750; var38++) {
            int var39 = this.field1751[var38];
            int var40 = this.field1752[var38];
            int var41 = this.field1753[var38];
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
            field1783[var38] = var50 - var11;
            if (var50 >= 50) {
                field1781[var38] = class91.field1525 * var46 / var50 + var34;
                field1782[var38] = class91.field1525 * var49 / var50 + var35;
            } else {
                field1781[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1807[var38] = var46;
                field1785[var38] = var49;
                field1786[var38] = var50;
            }
        }
        try {
            this.method2214(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("db.w(ZZI)V")
    public final void method2214(boolean arg0, boolean arg1, int arg2) {
        if (this.field1776 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1776; var4++) {
            field1805[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1811; var5++) {
            if (this.field1793[var5] != -2) {
                int var6 = this.field1760[var5];
                int var7 = this.field1756[var5];
                int var8 = this.field1757[var5];
                int var9 = field1781[var6];
                int var10 = field1781[var7];
                int var11 = field1781[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1807[var6];
                    int var13 = field1807[var7];
                    int var14 = field1807[var8];
                    int var15 = field1785[var6];
                    int var16 = field1785[var7];
                    int var17 = field1785[var8];
                    int var18 = field1786[var6];
                    int var19 = field1786[var7];
                    int var20 = field1786[var8];
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
                        field1797[var5] = true;
                        int var30 = (field1783[var6] + field1783[var7] + field1783[var8]) / 3 + this.field1777;
                        field1755[var30][field1805[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2205(field1802, field1803, field1782[var6], field1782[var7], field1782[var8], var9, var10, var11)) {
                        field1754[field1804++] = arg2;
                        arg1 = false;
                    }
                    if ((field1782[var8] - field1782[var7]) * (var9 - var10) - (field1782[var6] - field1782[var7]) * (var11 - var10) > 0) {
                        field1797[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1519 && var10 <= Statics.field1519 && var11 <= Statics.field1519) {
                            field1779[var5] = false;
                        } else {
                            field1779[var5] = true;
                        }
                        int var31 = (field1783[var6] + field1783[var7] + field1783[var8]) / 3 + this.field1777;
                        field1755[var31][field1805[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1789 == null) {
            for (int var32 = this.field1776 - 1; var32 >= 0; var32--) {
                int var33 = field1805[var32];
                if (var33 > 0) {
                    int[] var34 = field1755[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2234(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1790[var36] = 0;
            field1794[var36] = 0;
        }
        for (int var37 = this.field1776 - 1; var37 >= 0; var37--) {
            int var38 = field1805[var37];
            if (var38 > 0) {
                int[] var39 = field1755[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1789[var41];
                    int var43 = field1790[var42]++;
                    field1791[var42][var43] = var41;
                    if (var42 < 10) {
                        field1794[var42] += var37;
                    } else if (var42 == 10) {
                        field1792[var43] = var37;
                    } else {
                        field1774[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1790[1] > 0 || field1790[2] > 0) {
            var44 = (field1794[1] + field1794[2]) / (field1790[1] + field1790[2]);
        }
        int var45 = 0;
        if (field1790[3] > 0 || field1790[4] > 0) {
            var45 = (field1794[3] + field1794[4]) / (field1790[3] + field1790[4]);
        }
        int var46 = 0;
        if (field1790[6] > 0 || field1790[8] > 0) {
            var46 = (field1794[6] + field1794[8]) / (field1790[6] + field1790[8]);
        }
        int var47 = 0;
        int var48 = field1790[10];
        int[] var49 = field1791[10];
        int[] var50 = field1792;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1790[11];
            var49 = field1791[11];
            var50 = field1774;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2234(var49[var47++]);
                if (var47 == var48 && field1791[11] != var49) {
                    var47 = 0;
                    var48 = field1790[11];
                    var49 = field1791[11];
                    var50 = field1774;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2234(var49[var47++]);
                if (var47 == var48 && field1791[11] != var49) {
                    var47 = 0;
                    var48 = field1790[11];
                    var49 = field1791[11];
                    var50 = field1774;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2234(var49[var47++]);
                if (var47 == var48 && field1791[11] != var49) {
                    var47 = 0;
                    var48 = field1790[11];
                    var49 = field1791[11];
                    var50 = field1774;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1790[var52];
            int[] var54 = field1791[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2234(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2234(var49[var47++]);
            if (var47 == var48 && field1791[11] != var49) {
                var47 = 0;
                var49 = field1791[11];
                var48 = field1790[11];
                var50 = field1774;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("db.z(I)V")
    public final void method2234(int arg0) {
        if (field1797[arg0]) {
            this.method2204(arg0);
            return;
        }
        int var2 = this.field1760[arg0];
        int var3 = this.field1756[arg0];
        int var4 = this.field1757[arg0];
        class91.field1512 = field1779[arg0];
        if (this.field1762 == null) {
            class91.field1529 = 0;
        } else {
            class91.field1529 = this.field1762[arg0] & 0xFF;
        }
        if (this.field1764 != null && this.field1764[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1773 == null || this.field1773[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1773[arg0] & 0xFF;
                var6 = this.field1806[var5];
                var7 = this.field1768[var5];
                var8 = this.field1769[var5];
            }
            if (this.field1793[arg0] == -1) {
                class91.method2014(field1782[var2], field1782[var3], field1782[var4], field1781[var2], field1781[var3], field1781[var4], this.field1758[arg0], this.field1758[arg0], this.field1758[arg0], field1807[var6], field1807[var7], field1807[var8], field1785[var6], field1785[var7], field1785[var8], field1786[var6], field1786[var7], field1786[var8], this.field1764[arg0]);
            } else {
                class91.method2014(field1782[var2], field1782[var3], field1782[var4], field1781[var2], field1781[var3], field1781[var4], this.field1758[arg0], this.field1747[arg0], this.field1793[arg0], field1807[var6], field1807[var7], field1807[var8], field1785[var6], field1785[var7], field1785[var8], field1786[var6], field1786[var7], field1786[var8], this.field1764[arg0]);
            }
        } else if (this.field1793[arg0] == -1) {
            class91.method2012(field1782[var2], field1782[var3], field1782[var4], field1781[var2], field1781[var3], field1781[var4], field1808[this.field1758[arg0]]);
        } else {
            class91.method2010(field1782[var2], field1782[var3], field1782[var4], field1781[var2], field1781[var3], field1781[var4], this.field1758[arg0], this.field1747[arg0], this.field1793[arg0]);
        }
    }

    @ObfuscatedName("db.t(I)V")
    public final void method2204(int arg0) {
        int var2 = Statics.field1522;
        int var3 = Statics.field1523;
        int var4 = 0;
        int var5 = this.field1760[arg0];
        int var6 = this.field1756[arg0];
        int var7 = this.field1757[arg0];
        int var8 = field1786[var5];
        int var9 = field1786[var6];
        int var10 = field1786[var7];
        if (this.field1762 == null) {
            class91.field1529 = 0;
        } else {
            class91.field1529 = this.field1762[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1795[var4] = field1781[var5];
            field1796[var4] = field1782[var5];
            field1767[var4++] = this.field1758[arg0];
        } else {
            int var11 = field1807[var5];
            int var12 = field1785[var5];
            int var13 = this.field1758[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1809[var10 - var8];
                field1795[var4] = (((field1807[var7] - var11) * var14 >> 16) + var11) * class91.field1525 / 50 + var2;
                field1796[var4] = (((field1785[var7] - var12) * var14 >> 16) + var12) * class91.field1525 / 50 + var3;
                field1767[var4++] = ((this.field1793[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1809[var9 - var8];
                field1795[var4] = (((field1807[var6] - var11) * var15 >> 16) + var11) * class91.field1525 / 50 + var2;
                field1796[var4] = (((field1785[var6] - var12) * var15 >> 16) + var12) * class91.field1525 / 50 + var3;
                field1767[var4++] = ((this.field1747[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1795[var4] = field1781[var6];
            field1796[var4] = field1782[var6];
            field1767[var4++] = this.field1747[arg0];
        } else {
            int var16 = field1807[var6];
            int var17 = field1785[var6];
            int var18 = this.field1747[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1809[var8 - var9];
                field1795[var4] = (((field1807[var5] - var16) * var19 >> 16) + var16) * class91.field1525 / 50 + var2;
                field1796[var4] = (((field1785[var5] - var17) * var19 >> 16) + var17) * class91.field1525 / 50 + var3;
                field1767[var4++] = ((this.field1758[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1809[var10 - var9];
                field1795[var4] = (((field1807[var7] - var16) * var20 >> 16) + var16) * class91.field1525 / 50 + var2;
                field1796[var4] = (((field1785[var7] - var17) * var20 >> 16) + var17) * class91.field1525 / 50 + var3;
                field1767[var4++] = ((this.field1793[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1795[var4] = field1781[var7];
            field1796[var4] = field1782[var7];
            field1767[var4++] = this.field1793[arg0];
        } else {
            int var21 = field1807[var7];
            int var22 = field1785[var7];
            int var23 = this.field1793[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1809[var9 - var10];
                field1795[var4] = (((field1807[var6] - var21) * var24 >> 16) + var21) * class91.field1525 / 50 + var2;
                field1796[var4] = (((field1785[var6] - var22) * var24 >> 16) + var22) * class91.field1525 / 50 + var3;
                field1767[var4++] = ((this.field1747[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1809[var8 - var10];
                field1795[var4] = (((field1807[var5] - var21) * var25 >> 16) + var21) * class91.field1525 / 50 + var2;
                field1796[var4] = (((field1785[var5] - var22) * var25 >> 16) + var22) * class91.field1525 / 50 + var3;
                field1767[var4++] = ((this.field1758[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1795[0];
        int var27 = field1795[1];
        int var28 = field1795[2];
        int var29 = field1796[0];
        int var30 = field1796[1];
        int var31 = field1796[2];
        class91.field1512 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1519 || var27 > Statics.field1519 || var28 > Statics.field1519) {
                class91.field1512 = true;
            }
            if (this.field1764 != null && this.field1764[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1773 == null || this.field1773[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1773[arg0] & 0xFF;
                    var33 = this.field1806[var32];
                    var34 = this.field1768[var32];
                    var35 = this.field1769[var32];
                }
                if (this.field1793[arg0] == -1) {
                    class91.method2014(var29, var30, var31, var26, var27, var28, this.field1758[arg0], this.field1758[arg0], this.field1758[arg0], field1807[var33], field1807[var34], field1807[var35], field1785[var33], field1785[var34], field1785[var35], field1786[var33], field1786[var34], field1786[var35], this.field1764[arg0]);
                } else {
                    class91.method2014(var29, var30, var31, var26, var27, var28, field1767[0], field1767[1], field1767[2], field1807[var33], field1807[var34], field1807[var35], field1785[var33], field1785[var34], field1785[var35], field1786[var33], field1786[var34], field1786[var35], this.field1764[arg0]);
                }
            } else if (this.field1793[arg0] == -1) {
                class91.method2012(var29, var30, var31, var26, var27, var28, field1808[this.field1758[arg0]]);
            } else {
                class91.method2010(var29, var30, var31, var26, var27, var28, field1767[0], field1767[1], field1767[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1519 || var27 > Statics.field1519 || var28 > Statics.field1519 || field1795[3] < 0 || field1795[3] > Statics.field1519) {
            class91.field1512 = true;
        }
        if (this.field1764 != null && this.field1764[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1773 == null || this.field1773[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1773[arg0] & 0xFF;
                var37 = this.field1806[var36];
                var38 = this.field1768[var36];
                var39 = this.field1769[var36];
            }
            short var40 = this.field1764[arg0];
            if (this.field1793[arg0] == -1) {
                class91.method2014(var29, var30, var31, var26, var27, var28, this.field1758[arg0], this.field1758[arg0], this.field1758[arg0], field1807[var37], field1807[var38], field1807[var39], field1785[var37], field1785[var38], field1785[var39], field1786[var37], field1786[var38], field1786[var39], var40);
                class91.method2014(var29, var31, field1796[3], var26, var28, field1795[3], this.field1758[arg0], this.field1758[arg0], this.field1758[arg0], field1807[var37], field1807[var38], field1807[var39], field1785[var37], field1785[var38], field1785[var39], field1786[var37], field1786[var38], field1786[var39], var40);
            } else {
                class91.method2014(var29, var30, var31, var26, var27, var28, field1767[0], field1767[1], field1767[2], field1807[var37], field1807[var38], field1807[var39], field1785[var37], field1785[var38], field1785[var39], field1786[var37], field1786[var38], field1786[var39], var40);
                class91.method2014(var29, var31, field1796[3], var26, var28, field1795[3], field1767[0], field1767[2], field1767[3], field1807[var37], field1807[var38], field1807[var39], field1785[var37], field1785[var38], field1785[var39], field1786[var37], field1786[var38], field1786[var39], var40);
            }
        } else if (this.field1793[arg0] == -1) {
            int var41 = field1808[this.field1758[arg0]];
            class91.method2012(var29, var30, var31, var26, var27, var28, var41);
            class91.method2012(var29, var31, field1796[3], var26, var28, field1795[3], var41);
        } else {
            class91.method2010(var29, var30, var31, var26, var27, var28, field1767[0], field1767[1], field1767[2]);
            class91.method2010(var29, var31, field1796[3], var26, var28, field1795[3], field1767[0], field1767[2], field1767[3]);
        }
    }

    @ObfuscatedName("db.aq(IIIIIIII)Z")
    public final boolean method2205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
