package deob;

@ObfuscatedName("dk")
public class class105 extends class85 {

    @ObfuscatedName("dk.o")
    public static class105 field1780 = new class105();

    @ObfuscatedName("dk.e")
    public static byte[] field1816 = new byte[1];

    @ObfuscatedName("dk.u")
    public static class105 field1813 = new class105();

    @ObfuscatedName("dk.b")
    public static byte[] field1808 = new byte[1];

    @ObfuscatedName("dk.p")
    public int field1841 = 0;

    @ObfuscatedName("dk.s")
    public int[] field1784;

    @ObfuscatedName("dk.y")
    public int[] field1785;

    @ObfuscatedName("dk.t")
    public int[] field1786;

    @ObfuscatedName("dk.w")
    public int field1821 = 0;

    @ObfuscatedName("dk.h")
    public int[] field1788;

    @ObfuscatedName("dk.d")
    public int[] field1789;

    @ObfuscatedName("dk.l")
    public int[] field1790;

    @ObfuscatedName("dk.n")
    public int[] field1791;

    @ObfuscatedName("dk.q")
    public int[] field1792;

    @ObfuscatedName("dk.f")
    public int[] field1793;

    @ObfuscatedName("dk.v")
    public byte[] field1794;

    @ObfuscatedName("dk.a")
    public byte[] field1820;

    @ObfuscatedName("dk.k")
    public byte[] field1796;

    @ObfuscatedName("dk.r")
    public short[] field1797;

    @ObfuscatedName("dk.i")
    public byte field1798 = 0;

    @ObfuscatedName("dk.j")
    public int field1799 = 0;

    @ObfuscatedName("dk.z")
    public int[] field1800;

    @ObfuscatedName("dk.m")
    public int[] field1801;

    @ObfuscatedName("dk.g")
    public int[] field1802;

    @ObfuscatedName("dk.c")
    public int[][] field1803;

    @ObfuscatedName("dk.x")
    public int[][] field1804;

    @ObfuscatedName("dk.ah")
    public boolean field1805 = false;

    @ObfuscatedName("dk.ap")
    public int field1806;

    @ObfuscatedName("dk.aa")
    public int field1807;

    @ObfuscatedName("dk.ay")
    public int field1817;

    @ObfuscatedName("dk.ak")
    public int field1835;

    @ObfuscatedName("dk.an")
    public int field1782;

    @ObfuscatedName("dk.ao")
    public static boolean[] field1812 = new boolean[4096];

    @ObfuscatedName("dk.as")
    public static boolean[] field1818 = new boolean[4096];

    @ObfuscatedName("dk.am")
    public static int[] field1834 = new int[4096];

    @ObfuscatedName("dk.ae")
    public static int[] field1833 = new int[4096];

    @ObfuscatedName("dk.ax")
    public static int[] field1779 = new int[4096];

    @ObfuscatedName("dk.aj")
    public static int[] field1795 = new int[4096];

    @ObfuscatedName("dk.ab")
    public static int[] field1831 = new int[4096];

    @ObfuscatedName("dk.av")
    public static int[] field1819 = new int[4096];

    @ObfuscatedName("dk.ac")
    public static int[] field1814 = new int[1600];

    @ObfuscatedName("dk.ar")
    public static int[][] field1822 = new int[1600][512];

    @ObfuscatedName("dk.az")
    public static int[] field1823 = new int[12];

    @ObfuscatedName("dk.ad")
    public static int[][] field1824 = new int[12][2000];

    @ObfuscatedName("dk.au")
    public static int[] field1825 = new int[2000];

    @ObfuscatedName("dk.aw")
    public static int[] field1783 = new int[2000];

    @ObfuscatedName("dk.ag")
    public static int[] field1826 = new int[12];

    @ObfuscatedName("dk.al")
    public static int[] field1828 = new int[10];

    @ObfuscatedName("dk.ai")
    public static int[] field1829 = new int[10];

    @ObfuscatedName("dk.at")
    public static int[] field1830 = new int[10];

    @ObfuscatedName("dk.bl")
    public static boolean field1781 = false;

    @ObfuscatedName("dk.bf")
    public static int field1815 = 0;

    @ObfuscatedName("dk.be")
    public static int field1836 = 0;

    @ObfuscatedName("dk.bn")
    public static int field1837 = 0;

    @ObfuscatedName("dk.bc")
    public static int[] field1809 = new int[1000];

    @ObfuscatedName("dk.bd")
    public static int[] field1839 = class91.field1570;

    @ObfuscatedName("dk.bx")
    public static int[] field1840 = class91.field1571;

    @ObfuscatedName("dk.bq")
    public static int[] field1787 = class91.field1566;

    @ObfuscatedName("dk.bm")
    public static int[] field1842 = class91.field1547;

    public class105() {
    }

    public class105(class105[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1841 = 0;
        this.field1821 = 0;
        this.field1799 = 0;
        this.field1798 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class105 var8 = arg0[var7];
            if (var8 != null) {
                this.field1841 += var8.field1841;
                this.field1821 += var8.field1821;
                this.field1799 += var8.field1799;
                if (var8.field1794 == null) {
                    if (this.field1798 == -1) {
                        this.field1798 = var8.field1798;
                    }
                    if (this.field1798 != var8.field1798) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1820 != null;
                var5 |= var8.field1797 != null;
                var6 |= var8.field1796 != null;
            }
        }
        this.field1784 = new int[this.field1841];
        this.field1785 = new int[this.field1841];
        this.field1786 = new int[this.field1841];
        this.field1788 = new int[this.field1821];
        this.field1789 = new int[this.field1821];
        this.field1790 = new int[this.field1821];
        this.field1791 = new int[this.field1821];
        this.field1792 = new int[this.field1821];
        this.field1793 = new int[this.field1821];
        if (var3) {
            this.field1794 = new byte[this.field1821];
        }
        if (var4) {
            this.field1820 = new byte[this.field1821];
        }
        if (var5) {
            this.field1797 = new short[this.field1821];
        }
        if (var6) {
            this.field1796 = new byte[this.field1821];
        }
        if (this.field1799 > 0) {
            this.field1800 = new int[this.field1799];
            this.field1801 = new int[this.field1799];
            this.field1802 = new int[this.field1799];
        }
        this.field1841 = 0;
        this.field1821 = 0;
        this.field1799 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class105 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1821; var11++) {
                    this.field1788[this.field1821] = var10.field1788[var11] + this.field1841;
                    this.field1789[this.field1821] = var10.field1789[var11] + this.field1841;
                    this.field1790[this.field1821] = var10.field1790[var11] + this.field1841;
                    this.field1791[this.field1821] = var10.field1791[var11];
                    this.field1792[this.field1821] = var10.field1792[var11];
                    this.field1793[this.field1821] = var10.field1793[var11];
                    if (var3) {
                        if (var10.field1794 == null) {
                            this.field1794[this.field1821] = var10.field1798;
                        } else {
                            this.field1794[this.field1821] = var10.field1794[var11];
                        }
                    }
                    if (var4 && var10.field1820 != null) {
                        this.field1820[this.field1821] = var10.field1820[var11];
                    }
                    if (var5) {
                        if (var10.field1797 == null) {
                            this.field1797[this.field1821] = -1;
                        } else {
                            this.field1797[this.field1821] = var10.field1797[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1796 == null || var10.field1796[var11] == -1) {
                            this.field1796[this.field1821] = -1;
                        } else {
                            this.field1796[this.field1821] = (byte) (var10.field1796[var11] + this.field1799);
                        }
                    }
                    this.field1821++;
                }
                for (int var12 = 0; var12 < var10.field1799; var12++) {
                    this.field1800[this.field1799] = var10.field1800[var12] + this.field1841;
                    this.field1801[this.field1799] = var10.field1801[var12] + this.field1841;
                    this.field1802[this.field1799] = var10.field1802[var12] + this.field1841;
                    this.field1799++;
                }
                for (int var13 = 0; var13 < var10.field1841; var13++) {
                    this.field1784[this.field1841] = var10.field1784[var13];
                    this.field1785[this.field1841] = var10.field1785[var13];
                    this.field1786[this.field1841] = var10.field1786[var13];
                    this.field1841++;
                }
            }
        }
    }

    @ObfuscatedName("dk.o([[IIIIZI)Ldk;")
    public class105 method2121(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2125();
        int var7 = arg1 - this.field1817;
        int var8 = this.field1817 + arg1;
        int var9 = arg3 - this.field1817;
        int var10 = this.field1817 + arg3;
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
            var15.field1841 = this.field1841;
            var15.field1821 = this.field1821;
            var15.field1799 = this.field1799;
            var15.field1784 = this.field1784;
            var15.field1786 = this.field1786;
            var15.field1788 = this.field1788;
            var15.field1789 = this.field1789;
            var15.field1790 = this.field1790;
            var15.field1791 = this.field1791;
            var15.field1792 = this.field1792;
            var15.field1793 = this.field1793;
            var15.field1794 = this.field1794;
            var15.field1820 = this.field1820;
            var15.field1796 = this.field1796;
            var15.field1797 = this.field1797;
            var15.field1798 = this.field1798;
            var15.field1800 = this.field1800;
            var15.field1801 = this.field1801;
            var15.field1802 = this.field1802;
            var15.field1803 = this.field1803;
            var15.field1804 = this.field1804;
            var15.field1805 = this.field1805;
            var15.field1785 = new int[var15.field1841];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1841; var16++) {
                int var17 = this.field1784[var16] + arg1;
                int var18 = this.field1786[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1785[var16] = this.field1785[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1841; var26++) {
                int var27 = (-this.field1785[var26] << 16) / this.field1441;
                if (var27 < arg5) {
                    int var28 = this.field1784[var26] + arg1;
                    int var29 = this.field1786[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1785[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1785[var26];
                }
            }
        }
        var15.field1806 = 0;
        return var15;
    }

    @ObfuscatedName("dk.e(Z)Ldk;")
    public class105 method2189(boolean arg0) {
        if (!arg0 && field1816.length < this.field1821) {
            field1816 = new byte[this.field1821 + 100];
        }
        return this.method2185(arg0, field1780, field1816);
    }

    @ObfuscatedName("dk.b(Z)Ldk;")
    public class105 method2123(boolean arg0) {
        if (!arg0 && field1808.length < this.field1821) {
            field1808 = new byte[this.field1821 + 100];
        }
        return this.method2185(arg0, field1813, field1808);
    }

    @ObfuscatedName("dk.p(ZLdk;[B)Ldk;")
    public class105 method2185(boolean arg0, class105 arg1, byte[] arg2) {
        arg1.field1841 = this.field1841;
        arg1.field1821 = this.field1821;
        arg1.field1799 = this.field1799;
        if (arg1.field1784 == null || arg1.field1784.length < this.field1841) {
            arg1.field1784 = new int[this.field1841 + 100];
            arg1.field1785 = new int[this.field1841 + 100];
            arg1.field1786 = new int[this.field1841 + 100];
        }
        for (int var4 = 0; var4 < this.field1841; var4++) {
            arg1.field1784[var4] = this.field1784[var4];
            arg1.field1785[var4] = this.field1785[var4];
            arg1.field1786[var4] = this.field1786[var4];
        }
        if (arg0) {
            arg1.field1820 = this.field1820;
        } else {
            arg1.field1820 = arg2;
            if (this.field1820 == null) {
                for (int var5 = 0; var5 < this.field1821; var5++) {
                    arg1.field1820[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1821; var6++) {
                    arg1.field1820[var6] = this.field1820[var6];
                }
            }
        }
        arg1.field1788 = this.field1788;
        arg1.field1789 = this.field1789;
        arg1.field1790 = this.field1790;
        arg1.field1791 = this.field1791;
        arg1.field1792 = this.field1792;
        arg1.field1793 = this.field1793;
        arg1.field1794 = this.field1794;
        arg1.field1796 = this.field1796;
        arg1.field1797 = this.field1797;
        arg1.field1798 = this.field1798;
        arg1.field1800 = this.field1800;
        arg1.field1801 = this.field1801;
        arg1.field1802 = this.field1802;
        arg1.field1803 = this.field1803;
        arg1.field1804 = this.field1804;
        arg1.field1805 = this.field1805;
        arg1.field1806 = 0;
        return arg1;
    }

    @ObfuscatedName("dk.s()V")
    public void method2125() {
        if (this.field1806 == 1) {
            return;
        }
        this.field1806 = 1;
        this.field1441 = 0;
        this.field1807 = 0;
        this.field1817 = 0;
        for (int var1 = 0; var1 < this.field1841; var1++) {
            int var2 = this.field1784[var1];
            int var3 = this.field1785[var1];
            int var4 = this.field1786[var1];
            if (-var3 > this.field1441) {
                this.field1441 = -var3;
            }
            if (var3 > this.field1807) {
                this.field1807 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1817) {
                this.field1817 = var5;
            }
        }
        this.field1817 = (int) (Math.sqrt((double) this.field1817) + 0.99D);
        this.field1782 = (int) (Math.sqrt((double) (this.field1441 * this.field1441 + this.field1817 * this.field1817)) + 0.99D);
        this.field1835 = this.field1782 + (int) (Math.sqrt((double) (this.field1817 * this.field1817 + this.field1807 * this.field1807)) + 0.99D);
    }

    @ObfuscatedName("dk.y()V")
    public void method2195() {
        if (this.field1806 == 2) {
            return;
        }
        this.field1806 = 2;
        this.field1817 = 0;
        for (int var1 = 0; var1 < this.field1841; var1++) {
            int var2 = this.field1784[var1];
            int var3 = this.field1785[var1];
            int var4 = this.field1786[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1817) {
                this.field1817 = var5;
            }
        }
        this.field1817 = (int) (Math.sqrt((double) this.field1817) + 0.99D);
        this.field1782 = this.field1817;
        this.field1835 = this.field1817 + this.field1817;
    }

    @ObfuscatedName("dk.t()I")
    public int method2122() {
        this.method2125();
        return this.field1817;
    }

    @ObfuscatedName("dk.w(Lcg;I)V")
    public void method2129(class103 arg0, int arg1) {
        if (this.field1803 == null || arg1 == -1) {
            return;
        }
        class88 var3 = arg0.field1753[arg1];
        class102 var4 = var3.field1515;
        Statics.field1810 = 0;
        Statics.field1832 = 0;
        Statics.field1827 = 0;
        for (int var5 = 0; var5 < var3.field1520; var5++) {
            int var6 = var3.field1525[var5];
            this.method2130(var4.field1752[var6], var4.field1750[var6], var3.field1522[var5], var3.field1521[var5], var3.field1524[var5]);
        }
        this.field1806 = 0;
    }

    @ObfuscatedName("dk.h(Lcg;ILcg;I[I)V")
    public void method2131(class103 arg0, int arg1, class103 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2129(arg0, arg1);
            return;
        }
        class88 var6 = arg0.field1753[arg1];
        class88 var7 = arg2.field1753[arg3];
        class102 var8 = var6.field1515;
        Statics.field1810 = 0;
        Statics.field1832 = 0;
        Statics.field1827 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1520; var11++) {
            int var12 = var6.field1525[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1752[var12] == 0) {
                this.method2130(var8.field1752[var12], var8.field1750[var12], var6.field1522[var11], var6.field1521[var11], var6.field1524[var11]);
            }
        }
        Statics.field1810 = 0;
        Statics.field1832 = 0;
        Statics.field1827 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1520; var15++) {
            int var16 = var7.field1525[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1752[var16] == 0) {
                this.method2130(var8.field1752[var16], var8.field1750[var16], var7.field1522[var15], var7.field1521[var15], var7.field1524[var15]);
            }
        }
        this.field1806 = 0;
    }

    @ObfuscatedName("dk.d(I[IIII)V")
    public void method2130(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1810 = 0;
            Statics.field1832 = 0;
            Statics.field1827 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1803.length) {
                    int[] var10 = this.field1803[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1810 += this.field1784[var12];
                        Statics.field1832 += this.field1785[var12];
                        Statics.field1827 += this.field1786[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1810 = Statics.field1810 / var7 + arg2;
                Statics.field1832 = Statics.field1832 / var7 + arg3;
                Statics.field1827 = Statics.field1827 / var7 + arg4;
            } else {
                Statics.field1810 = arg2;
                Statics.field1832 = arg3;
                Statics.field1827 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1803.length) {
                    int[] var15 = this.field1803[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1784[var17] += arg2;
                        this.field1785[var17] += arg3;
                        this.field1786[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1803.length) {
                    int[] var20 = this.field1803[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1784[var22] -= Statics.field1810;
                        this.field1785[var22] -= Statics.field1832;
                        this.field1786[var22] -= Statics.field1827;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1839[var25];
                            int var27 = field1840[var25];
                            int var28 = this.field1785[var22] * var26 + this.field1784[var22] * var27 >> 16;
                            this.field1785[var22] = this.field1785[var22] * var27 - this.field1784[var22] * var26 >> 16;
                            this.field1784[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1839[var23];
                            int var30 = field1840[var23];
                            int var31 = this.field1785[var22] * var30 - this.field1786[var22] * var29 >> 16;
                            this.field1786[var22] = this.field1786[var22] * var30 + this.field1785[var22] * var29 >> 16;
                            this.field1785[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1839[var24];
                            int var33 = field1840[var24];
                            int var34 = this.field1786[var22] * var32 + this.field1784[var22] * var33 >> 16;
                            this.field1786[var22] = this.field1786[var22] * var33 - this.field1784[var22] * var32 >> 16;
                            this.field1784[var22] = var34;
                        }
                        this.field1784[var22] += Statics.field1810;
                        this.field1785[var22] += Statics.field1832;
                        this.field1786[var22] += Statics.field1827;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1803.length) {
                    int[] var37 = this.field1803[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1784[var39] -= Statics.field1810;
                        this.field1785[var39] -= Statics.field1832;
                        this.field1786[var39] -= Statics.field1827;
                        this.field1784[var39] = this.field1784[var39] * arg2 / 128;
                        this.field1785[var39] = this.field1785[var39] * arg3 / 128;
                        this.field1786[var39] = this.field1786[var39] * arg4 / 128;
                        this.field1784[var39] += Statics.field1810;
                        this.field1785[var39] += Statics.field1832;
                        this.field1786[var39] += Statics.field1827;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1804 != null && this.field1820 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1804.length) {
                    int[] var42 = this.field1804[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1820[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1820[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dk.l()V")
    public void method2175() {
        for (int var1 = 0; var1 < this.field1841; var1++) {
            int var2 = this.field1784[var1];
            this.field1784[var1] = this.field1786[var1];
            this.field1786[var1] = -var2;
        }
        this.field1806 = 0;
    }

    @ObfuscatedName("dk.n()V")
    public void method2132() {
        for (int var1 = 0; var1 < this.field1841; var1++) {
            this.field1784[var1] = -this.field1784[var1];
            this.field1786[var1] = -this.field1786[var1];
        }
        this.field1806 = 0;
    }

    @ObfuscatedName("dk.q()V")
    public void method2133() {
        for (int var1 = 0; var1 < this.field1841; var1++) {
            int var2 = this.field1786[var1];
            this.field1786[var1] = this.field1784[var1];
            this.field1784[var1] = -var2;
        }
        this.field1806 = 0;
    }

    @ObfuscatedName("dk.k(I)V")
    public void method2126(int arg0) {
        int var2 = field1839[arg0];
        int var3 = field1840[arg0];
        for (int var4 = 0; var4 < this.field1841; var4++) {
            int var5 = this.field1785[var4] * var3 - this.field1786[var4] * var2 >> 16;
            this.field1786[var4] = this.field1786[var4] * var3 + this.field1785[var4] * var2 >> 16;
            this.field1785[var4] = var5;
        }
        this.field1806 = 0;
    }

    @ObfuscatedName("dk.r(III)V")
    public void method2169(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1841; var4++) {
            this.field1784[var4] += arg0;
            this.field1785[var4] += arg1;
            this.field1786[var4] += arg2;
        }
        this.field1806 = 0;
    }

    @ObfuscatedName("dk.i(III)V")
    public void method2136(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1841; var4++) {
            this.field1784[var4] = this.field1784[var4] * arg0 / 128;
            this.field1785[var4] = this.field1785[var4] * arg1 / 128;
            this.field1786[var4] = this.field1786[var4] * arg2 / 128;
        }
        this.field1806 = 0;
    }

    @ObfuscatedName("dk.j(IIIIIII)V")
    public final void method2201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1814[0] = -1;
        if (this.field1806 != 2 && this.field1806 != 1) {
            this.method2195();
        }
        int var8 = Statics.field1557;
        int var9 = Statics.field1558;
        int var10 = field1839[arg0];
        int var11 = field1840[arg0];
        int var12 = field1839[arg1];
        int var13 = field1840[arg1];
        int var14 = field1839[arg2];
        int var15 = field1840[arg2];
        int var16 = field1839[arg3];
        int var17 = field1840[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1841; var19++) {
            int var20 = this.field1784[var19];
            int var21 = this.field1785[var19];
            int var22 = this.field1786[var19];
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
            field1779[var19] = var30 - var18;
            field1834[var19] = class91.field1556 * var26 / var30 + var8;
            field1833[var19] = class91.field1556 * var29 / var30 + var9;
            if (this.field1799 > 0) {
                field1795[var19] = var26;
                field1831[var19] = var29;
                field1819[var19] = var30;
            }
        }
        try {
            this.method2139(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dk.z(IIIIIIII)V")
    public final void method2138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1814[0] = -1;
        if (this.field1806 != 2 && this.field1806 != 1) {
            this.method2195();
        }
        int var9 = Statics.field1557;
        int var10 = Statics.field1558;
        int var11 = field1839[arg0];
        int var12 = field1840[arg0];
        int var13 = field1839[arg1];
        int var14 = field1840[arg1];
        int var15 = field1839[arg2];
        int var16 = field1840[arg2];
        int var17 = field1839[arg3];
        int var18 = field1840[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1841; var20++) {
            int var21 = this.field1784[var20];
            int var22 = this.field1785[var20];
            int var23 = this.field1786[var20];
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
            field1779[var20] = var31 - var19;
            field1834[var20] = class91.field1556 * var27 / arg7 + var9;
            field1833[var20] = class91.field1556 * var30 / arg7 + var10;
            if (this.field1799 > 0) {
                field1795[var20] = var27;
                field1831[var20] = var30;
                field1819[var20] = var31;
            }
        }
        try {
            this.method2139(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dk.ao(IIIIIIIII)V")
    public void method1745(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1814[0] = -1;
        if (this.field1806 != 1) {
            this.method2125();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1817 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1817) * class91.field1556;
        if (var15 / var13 >= Statics.field1562) {
            return;
        }
        int var16 = (this.field1817 + var14) * class91.field1556;
        if (var16 / var13 <= Statics.field1554) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1817 * arg1 >> 16;
        int var19 = (var17 + var18) * class91.field1556;
        if (var19 / var13 <= Statics.field1563) {
            return;
        }
        int var20 = (this.field1441 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class91.field1556;
        if (var21 / var13 >= Statics.field1564) {
            return;
        }
        int var22 = (this.field1441 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1799 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1781) {
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
            int var32 = field1815 - Statics.field1557;
            int var33 = field1836 - Statics.field1558;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1805) {
                    field1809[field1837++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1557;
        int var35 = Statics.field1558;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1839[arg0];
            var37 = field1840[arg0];
        }
        for (int var38 = 0; var38 < this.field1841; var38++) {
            int var39 = this.field1784[var38];
            int var40 = this.field1785[var38];
            int var41 = this.field1786[var38];
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
            field1779[var38] = var50 - var11;
            if (var50 >= 50) {
                field1834[var38] = class91.field1556 * var46 / var50 + var34;
                field1833[var38] = class91.field1556 * var49 / var50 + var35;
            } else {
                field1834[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1795[var38] = var46;
                field1831[var38] = var49;
                field1819[var38] = var50;
            }
        }
        try {
            this.method2139(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dk.m(ZZI)V")
    public final void method2139(boolean arg0, boolean arg1, int arg2) {
        if (this.field1835 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1835; var4++) {
            field1814[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1821; var5++) {
            if (this.field1793[var5] != -2) {
                int var6 = this.field1788[var5];
                int var7 = this.field1789[var5];
                int var8 = this.field1790[var5];
                int var9 = field1834[var6];
                int var10 = field1834[var7];
                int var11 = field1834[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1795[var6];
                    int var13 = field1795[var7];
                    int var14 = field1795[var8];
                    int var15 = field1831[var6];
                    int var16 = field1831[var7];
                    int var17 = field1831[var8];
                    int var18 = field1819[var6];
                    int var19 = field1819[var7];
                    int var20 = field1819[var8];
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
                        field1818[var5] = true;
                        int var30 = (field1779[var6] + field1779[var7] + field1779[var8]) / 3 + this.field1782;
                        field1822[var30][field1814[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2142(field1815, field1836, field1833[var6], field1833[var7], field1833[var8], var9, var10, var11)) {
                        field1809[field1837++] = arg2;
                        arg1 = false;
                    }
                    if ((field1833[var8] - field1833[var7]) * (var9 - var10) - (field1833[var6] - field1833[var7]) * (var11 - var10) > 0) {
                        field1818[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1559 && var10 <= Statics.field1559 && var11 <= Statics.field1559) {
                            field1812[var5] = false;
                        } else {
                            field1812[var5] = true;
                        }
                        int var31 = (field1779[var6] + field1779[var7] + field1779[var8]) / 3 + this.field1782;
                        field1822[var31][field1814[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1794 == null) {
            for (int var32 = this.field1835 - 1; var32 >= 0; var32--) {
                int var33 = field1814[var32];
                if (var33 > 0) {
                    int[] var34 = field1822[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2140(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1823[var36] = 0;
            field1826[var36] = 0;
        }
        for (int var37 = this.field1835 - 1; var37 >= 0; var37--) {
            int var38 = field1814[var37];
            if (var38 > 0) {
                int[] var39 = field1822[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1794[var41];
                    int var43 = field1823[var42]++;
                    field1824[var42][var43] = var41;
                    if (var42 < 10) {
                        field1826[var42] += var37;
                    } else if (var42 == 10) {
                        field1825[var43] = var37;
                    } else {
                        field1783[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1823[1] > 0 || field1823[2] > 0) {
            var44 = (field1826[1] + field1826[2]) / (field1823[1] + field1823[2]);
        }
        int var45 = 0;
        if (field1823[3] > 0 || field1823[4] > 0) {
            var45 = (field1826[3] + field1826[4]) / (field1823[3] + field1823[4]);
        }
        int var46 = 0;
        if (field1823[6] > 0 || field1823[8] > 0) {
            var46 = (field1826[6] + field1826[8]) / (field1823[6] + field1823[8]);
        }
        int var47 = 0;
        int var48 = field1823[10];
        int[] var49 = field1824[10];
        int[] var50 = field1825;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1823[11];
            var49 = field1824[11];
            var50 = field1783;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2140(var49[var47++]);
                if (var47 == var48 && field1824[11] != var49) {
                    var47 = 0;
                    var48 = field1823[11];
                    var49 = field1824[11];
                    var50 = field1783;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2140(var49[var47++]);
                if (var47 == var48 && field1824[11] != var49) {
                    var47 = 0;
                    var48 = field1823[11];
                    var49 = field1824[11];
                    var50 = field1783;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2140(var49[var47++]);
                if (var47 == var48 && field1824[11] != var49) {
                    var47 = 0;
                    var48 = field1823[11];
                    var49 = field1824[11];
                    var50 = field1783;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1823[var52];
            int[] var54 = field1824[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2140(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2140(var49[var47++]);
            if (var47 == var48 && field1824[11] != var49) {
                var47 = 0;
                var49 = field1824[11];
                var48 = field1823[11];
                var50 = field1783;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dk.g(I)V")
    public final void method2140(int arg0) {
        if (field1818[arg0]) {
            this.method2141(arg0);
            return;
        }
        int var2 = this.field1788[arg0];
        int var3 = this.field1789[arg0];
        int var4 = this.field1790[arg0];
        class91.field1560 = field1812[arg0];
        if (this.field1820 == null) {
            class91.field1551 = 0;
        } else {
            class91.field1551 = this.field1820[arg0] & 0xFF;
        }
        if (this.field1797 != null && this.field1797[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1796 == null || this.field1796[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1796[arg0] & 0xFF;
                var6 = this.field1800[var5];
                var7 = this.field1801[var5];
                var8 = this.field1802[var5];
            }
            if (this.field1793[arg0] == -1) {
                class91.method1953(field1833[var2], field1833[var3], field1833[var4], field1834[var2], field1834[var3], field1834[var4], this.field1791[arg0], this.field1791[arg0], this.field1791[arg0], field1795[var6], field1795[var7], field1795[var8], field1831[var6], field1831[var7], field1831[var8], field1819[var6], field1819[var7], field1819[var8], this.field1797[arg0]);
            } else {
                class91.method1953(field1833[var2], field1833[var3], field1833[var4], field1834[var2], field1834[var3], field1834[var4], this.field1791[arg0], this.field1792[arg0], this.field1793[arg0], field1795[var6], field1795[var7], field1795[var8], field1831[var6], field1831[var7], field1831[var8], field1819[var6], field1819[var7], field1819[var8], this.field1797[arg0]);
            }
        } else if (this.field1793[arg0] == -1) {
            class91.method1951(field1833[var2], field1833[var3], field1833[var4], field1834[var2], field1834[var3], field1834[var4], field1787[this.field1791[arg0]]);
        } else {
            class91.method1992(field1833[var2], field1833[var3], field1833[var4], field1834[var2], field1834[var3], field1834[var4], this.field1791[arg0], this.field1792[arg0], this.field1793[arg0]);
        }
    }

    @ObfuscatedName("dk.c(I)V")
    public final void method2141(int arg0) {
        int var2 = Statics.field1557;
        int var3 = Statics.field1558;
        int var4 = 0;
        int var5 = this.field1788[arg0];
        int var6 = this.field1789[arg0];
        int var7 = this.field1790[arg0];
        int var8 = field1819[var5];
        int var9 = field1819[var6];
        int var10 = field1819[var7];
        if (this.field1820 == null) {
            class91.field1551 = 0;
        } else {
            class91.field1551 = this.field1820[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1828[var4] = field1834[var5];
            field1829[var4] = field1833[var5];
            field1830[var4++] = this.field1791[arg0];
        } else {
            int var11 = field1795[var5];
            int var12 = field1831[var5];
            int var13 = this.field1791[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1842[var10 - var8];
                field1828[var4] = (((field1795[var7] - var11) * var14 >> 16) + var11) * class91.field1556 / 50 + var2;
                field1829[var4] = (((field1831[var7] - var12) * var14 >> 16) + var12) * class91.field1556 / 50 + var3;
                field1830[var4++] = ((this.field1793[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1842[var9 - var8];
                field1828[var4] = (((field1795[var6] - var11) * var15 >> 16) + var11) * class91.field1556 / 50 + var2;
                field1829[var4] = (((field1831[var6] - var12) * var15 >> 16) + var12) * class91.field1556 / 50 + var3;
                field1830[var4++] = ((this.field1792[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1828[var4] = field1834[var6];
            field1829[var4] = field1833[var6];
            field1830[var4++] = this.field1792[arg0];
        } else {
            int var16 = field1795[var6];
            int var17 = field1831[var6];
            int var18 = this.field1792[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1842[var8 - var9];
                field1828[var4] = (((field1795[var5] - var16) * var19 >> 16) + var16) * class91.field1556 / 50 + var2;
                field1829[var4] = (((field1831[var5] - var17) * var19 >> 16) + var17) * class91.field1556 / 50 + var3;
                field1830[var4++] = ((this.field1791[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1842[var10 - var9];
                field1828[var4] = (((field1795[var7] - var16) * var20 >> 16) + var16) * class91.field1556 / 50 + var2;
                field1829[var4] = (((field1831[var7] - var17) * var20 >> 16) + var17) * class91.field1556 / 50 + var3;
                field1830[var4++] = ((this.field1793[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1828[var4] = field1834[var7];
            field1829[var4] = field1833[var7];
            field1830[var4++] = this.field1793[arg0];
        } else {
            int var21 = field1795[var7];
            int var22 = field1831[var7];
            int var23 = this.field1793[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1842[var9 - var10];
                field1828[var4] = (((field1795[var6] - var21) * var24 >> 16) + var21) * class91.field1556 / 50 + var2;
                field1829[var4] = (((field1831[var6] - var22) * var24 >> 16) + var22) * class91.field1556 / 50 + var3;
                field1830[var4++] = ((this.field1792[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1842[var8 - var10];
                field1828[var4] = (((field1795[var5] - var21) * var25 >> 16) + var21) * class91.field1556 / 50 + var2;
                field1829[var4] = (((field1831[var5] - var22) * var25 >> 16) + var22) * class91.field1556 / 50 + var3;
                field1830[var4++] = ((this.field1791[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1828[0];
        int var27 = field1828[1];
        int var28 = field1828[2];
        int var29 = field1829[0];
        int var30 = field1829[1];
        int var31 = field1829[2];
        class91.field1560 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1559 || var27 > Statics.field1559 || var28 > Statics.field1559) {
                class91.field1560 = true;
            }
            if (this.field1797 != null && this.field1797[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1796 == null || this.field1796[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1796[arg0] & 0xFF;
                    var33 = this.field1800[var32];
                    var34 = this.field1801[var32];
                    var35 = this.field1802[var32];
                }
                if (this.field1793[arg0] == -1) {
                    class91.method1953(var29, var30, var31, var26, var27, var28, this.field1791[arg0], this.field1791[arg0], this.field1791[arg0], field1795[var33], field1795[var34], field1795[var35], field1831[var33], field1831[var34], field1831[var35], field1819[var33], field1819[var34], field1819[var35], this.field1797[arg0]);
                } else {
                    class91.method1953(var29, var30, var31, var26, var27, var28, field1830[0], field1830[1], field1830[2], field1795[var33], field1795[var34], field1795[var35], field1831[var33], field1831[var34], field1831[var35], field1819[var33], field1819[var34], field1819[var35], this.field1797[arg0]);
                }
            } else if (this.field1793[arg0] == -1) {
                class91.method1951(var29, var30, var31, var26, var27, var28, field1787[this.field1791[arg0]]);
            } else {
                class91.method1992(var29, var30, var31, var26, var27, var28, field1830[0], field1830[1], field1830[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1559 || var27 > Statics.field1559 || var28 > Statics.field1559 || field1828[3] < 0 || field1828[3] > Statics.field1559) {
            class91.field1560 = true;
        }
        if (this.field1797 != null && this.field1797[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1796 == null || this.field1796[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1796[arg0] & 0xFF;
                var37 = this.field1800[var36];
                var38 = this.field1801[var36];
                var39 = this.field1802[var36];
            }
            short var40 = this.field1797[arg0];
            if (this.field1793[arg0] == -1) {
                class91.method1953(var29, var30, var31, var26, var27, var28, this.field1791[arg0], this.field1791[arg0], this.field1791[arg0], field1795[var37], field1795[var38], field1795[var39], field1831[var37], field1831[var38], field1831[var39], field1819[var37], field1819[var38], field1819[var39], var40);
                class91.method1953(var29, var31, field1829[3], var26, var28, field1828[3], this.field1791[arg0], this.field1791[arg0], this.field1791[arg0], field1795[var37], field1795[var38], field1795[var39], field1831[var37], field1831[var38], field1831[var39], field1819[var37], field1819[var38], field1819[var39], var40);
            } else {
                class91.method1953(var29, var30, var31, var26, var27, var28, field1830[0], field1830[1], field1830[2], field1795[var37], field1795[var38], field1795[var39], field1831[var37], field1831[var38], field1831[var39], field1819[var37], field1819[var38], field1819[var39], var40);
                class91.method1953(var29, var31, field1829[3], var26, var28, field1828[3], field1830[0], field1830[2], field1830[3], field1795[var37], field1795[var38], field1795[var39], field1831[var37], field1831[var38], field1831[var39], field1819[var37], field1819[var38], field1819[var39], var40);
            }
        } else if (this.field1793[arg0] == -1) {
            int var41 = field1787[this.field1791[arg0]];
            class91.method1951(var29, var30, var31, var26, var27, var28, var41);
            class91.method1951(var29, var31, field1829[3], var26, var28, field1828[3], var41);
        } else {
            class91.method1992(var29, var30, var31, var26, var27, var28, field1830[0], field1830[1], field1830[2]);
            class91.method1992(var29, var31, field1829[3], var26, var28, field1828[3], field1830[0], field1830[2], field1830[3]);
        }
    }

    @ObfuscatedName("dk.x(IIIIIIII)Z")
    public final boolean method2142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
