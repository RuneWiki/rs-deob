package deob;

@ObfuscatedName("es")
public class class131 extends class139 {

    @ObfuscatedName("es.s")
    public static class131 field1863 = new class131();

    @ObfuscatedName("es.g")
    public static byte[] field1830 = new byte[1];

    @ObfuscatedName("es.m")
    public static class131 field1810 = new class131();

    @ObfuscatedName("es.h")
    public static byte[] field1811 = new byte[1];

    @ObfuscatedName("es.i")
    public int field1845 = 0;

    @ObfuscatedName("es.w")
    public int[] field1841;

    @ObfuscatedName("es.t")
    public int[] field1874;

    @ObfuscatedName("es.d")
    public int[] field1815;

    @ObfuscatedName("es.z")
    public int field1850 = 0;

    @ObfuscatedName("es.k")
    public int[] field1817;

    @ObfuscatedName("es.c")
    public int[] field1837;

    @ObfuscatedName("es.o")
    public int[] field1844;

    @ObfuscatedName("es.l")
    public int[] field1820;

    @ObfuscatedName("es.f")
    public int[] field1821;

    @ObfuscatedName("es.q")
    public int[] field1822;

    @ObfuscatedName("es.r")
    public byte[] field1823;

    @ObfuscatedName("es.x")
    public byte[] field1824;

    @ObfuscatedName("es.u")
    public byte[] field1825;

    @ObfuscatedName("es.b")
    public short[] field1819;

    @ObfuscatedName("es.p")
    public byte field1827 = 0;

    @ObfuscatedName("es.y")
    public int field1828 = 0;

    @ObfuscatedName("es.n")
    public int[] field1829;

    @ObfuscatedName("es.j")
    public int[] field1808;

    @ObfuscatedName("es.e")
    public int[] field1831;

    @ObfuscatedName("es.v")
    public int[][] field1851;

    @ObfuscatedName("es.a")
    public int[][] field1833;

    @ObfuscatedName("es.ad")
    public boolean field1870 = false;

    @ObfuscatedName("es.al")
    public int field1835;

    @ObfuscatedName("es.aq")
    public int field1836;

    @ObfuscatedName("es.ar")
    public int field1876;

    @ObfuscatedName("es.an")
    public int field1838;

    @ObfuscatedName("es.af")
    public int field1839;

    @ObfuscatedName("es.as")
    public int field1812;

    @ObfuscatedName("es.ax")
    public int field1816;

    @ObfuscatedName("es.ak")
    public int field1842;

    @ObfuscatedName("es.aw")
    public int field1843 = -1;

    @ObfuscatedName("es.ai")
    public int field1875 = -1;

    @ObfuscatedName("es.ab")
    public int field1809 = -1;

    @ObfuscatedName("es.ah")
    public static boolean[] field1847 = new boolean[4700];

    @ObfuscatedName("es.ag")
    public static boolean[] field1826 = new boolean[4700];

    @ObfuscatedName("es.az")
    public static int[] field1871 = new int[4700];

    @ObfuscatedName("es.ae")
    public static int[] field1814 = new int[4700];

    @ObfuscatedName("es.ao")
    public static int[] field1818 = new int[4700];

    @ObfuscatedName("es.av")
    public static int[] field1849 = new int[4700];

    @ObfuscatedName("es.aj")
    public static int[] field1853 = new int[4700];

    @ObfuscatedName("es.ap")
    public static int[] field1854 = new int[4700];

    @ObfuscatedName("es.ay")
    public static int[] field1856 = new int[1600];

    @ObfuscatedName("es.aa")
    public static int[][] field1857 = new int[1600][512];

    @ObfuscatedName("es.at")
    public static int[] field1858 = new int[12];

    @ObfuscatedName("es.ac")
    public static int[][] field1859 = new int[12][2000];

    @ObfuscatedName("es.bj")
    public static int[] field1840 = new int[2000];

    @ObfuscatedName("es.bo")
    public static int[] field1861 = new int[2000];

    @ObfuscatedName("es.br")
    public static int[] field1862 = new int[12];

    @ObfuscatedName("es.bm")
    public static int[] field1848 = new int[10];

    @ObfuscatedName("es.bf")
    public static int[] field1864 = new int[10];

    @ObfuscatedName("es.bh")
    public static int[] field1865 = new int[10];

    @ObfuscatedName("es.bn")
    public static boolean field1869 = true;

    @ObfuscatedName("es.ba")
    public static int[] field1872 = class134.field1918;

    @ObfuscatedName("es.bk")
    public static int[] field1873 = class134.field1903;

    @ObfuscatedName("es.bl")
    public static int[] field1813 = class134.field1914;

    @ObfuscatedName("es.bc")
    public static int[] field1832 = class134.field1917;

    public class131() {
    }

    public class131(class131[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1845 = 0;
        this.field1850 = 0;
        this.field1828 = 0;
        this.field1827 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class131 var8 = arg0[var7];
            if (var8 != null) {
                this.field1845 += var8.field1845;
                this.field1850 += var8.field1850;
                this.field1828 += var8.field1828;
                if (var8.field1823 == null) {
                    if (this.field1827 == -1) {
                        this.field1827 = var8.field1827;
                    }
                    if (this.field1827 != var8.field1827) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1824 != null;
                var5 |= var8.field1819 != null;
                var6 |= var8.field1825 != null;
            }
        }
        this.field1841 = new int[this.field1845];
        this.field1874 = new int[this.field1845];
        this.field1815 = new int[this.field1845];
        this.field1817 = new int[this.field1850];
        this.field1837 = new int[this.field1850];
        this.field1844 = new int[this.field1850];
        this.field1820 = new int[this.field1850];
        this.field1821 = new int[this.field1850];
        this.field1822 = new int[this.field1850];
        if (var3) {
            this.field1823 = new byte[this.field1850];
        }
        if (var4) {
            this.field1824 = new byte[this.field1850];
        }
        if (var5) {
            this.field1819 = new short[this.field1850];
        }
        if (var6) {
            this.field1825 = new byte[this.field1850];
        }
        if (this.field1828 > 0) {
            this.field1829 = new int[this.field1828];
            this.field1808 = new int[this.field1828];
            this.field1831 = new int[this.field1828];
        }
        this.field1845 = 0;
        this.field1850 = 0;
        this.field1828 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class131 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1850; var11++) {
                    this.field1817[this.field1850] = var10.field1817[var11] + this.field1845;
                    this.field1837[this.field1850] = var10.field1837[var11] + this.field1845;
                    this.field1844[this.field1850] = var10.field1844[var11] + this.field1845;
                    this.field1820[this.field1850] = var10.field1820[var11];
                    this.field1821[this.field1850] = var10.field1821[var11];
                    this.field1822[this.field1850] = var10.field1822[var11];
                    if (var3) {
                        if (var10.field1823 == null) {
                            this.field1823[this.field1850] = var10.field1827;
                        } else {
                            this.field1823[this.field1850] = var10.field1823[var11];
                        }
                    }
                    if (var4 && var10.field1824 != null) {
                        this.field1824[this.field1850] = var10.field1824[var11];
                    }
                    if (var5) {
                        if (var10.field1819 == null) {
                            this.field1819[this.field1850] = -1;
                        } else {
                            this.field1819[this.field1850] = var10.field1819[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1825 == null || var10.field1825[var11] == -1) {
                            this.field1825[this.field1850] = -1;
                        } else {
                            this.field1825[this.field1850] = (byte) (var10.field1825[var11] + this.field1828);
                        }
                    }
                    this.field1850++;
                }
                for (int var12 = 0; var12 < var10.field1828; var12++) {
                    this.field1829[this.field1828] = var10.field1829[var12] + this.field1845;
                    this.field1808[this.field1828] = var10.field1808[var12] + this.field1845;
                    this.field1831[this.field1828] = var10.field1831[var12] + this.field1845;
                    this.field1828++;
                }
                for (int var13 = 0; var13 < var10.field1845; var13++) {
                    this.field1841[this.field1845] = var10.field1841[var13];
                    this.field1874[this.field1845] = var10.field1874[var13];
                    this.field1815[this.field1845] = var10.field1815[var13];
                    this.field1845++;
                }
            }
        }
    }

    @ObfuscatedName("es.s([[IIIIZI)Les;")
    public class131 method2522(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2578();
        int var7 = arg1 - this.field1876;
        int var8 = this.field1876 + arg1;
        int var9 = arg3 - this.field1876;
        int var10 = this.field1876 + arg3;
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
        class131 var15;
        if (arg4) {
            var15 = new class131();
            var15.field1845 = this.field1845;
            var15.field1850 = this.field1850;
            var15.field1828 = this.field1828;
            var15.field1841 = this.field1841;
            var15.field1815 = this.field1815;
            var15.field1817 = this.field1817;
            var15.field1837 = this.field1837;
            var15.field1844 = this.field1844;
            var15.field1820 = this.field1820;
            var15.field1821 = this.field1821;
            var15.field1822 = this.field1822;
            var15.field1823 = this.field1823;
            var15.field1824 = this.field1824;
            var15.field1825 = this.field1825;
            var15.field1819 = this.field1819;
            var15.field1827 = this.field1827;
            var15.field1829 = this.field1829;
            var15.field1808 = this.field1808;
            var15.field1831 = this.field1831;
            var15.field1851 = this.field1851;
            var15.field1833 = this.field1833;
            var15.field1870 = this.field1870;
            var15.field1874 = new int[var15.field1845];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1845; var16++) {
                int var17 = this.field1841[var16] + arg1;
                int var18 = this.field1815[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1874[var16] = this.field1874[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1845; var26++) {
                int var27 = (-this.field1874[var26] << 16) / this.field2001;
                if (var27 < arg5) {
                    int var28 = this.field1841[var26] + arg1;
                    int var29 = this.field1815[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1874[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1874[var26];
                }
            }
        }
        var15.method2530();
        return var15;
    }

    @ObfuscatedName("es.g(Z)Les;")
    public class131 method2545(boolean arg0) {
        if (!arg0 && field1830.length < this.field1850) {
            field1830 = new byte[this.field1850 + 100];
        }
        return this.method2546(arg0, field1863, field1830);
    }

    @ObfuscatedName("es.m(Z)Les;")
    public class131 method2544(boolean arg0) {
        if (!arg0 && field1811.length < this.field1850) {
            field1811 = new byte[this.field1850 + 100];
        }
        return this.method2546(arg0, field1810, field1811);
    }

    @ObfuscatedName("es.h(ZLes;[B)Les;")
    public class131 method2546(boolean arg0, class131 arg1, byte[] arg2) {
        arg1.field1845 = this.field1845;
        arg1.field1850 = this.field1850;
        arg1.field1828 = this.field1828;
        if (arg1.field1841 == null || arg1.field1841.length < this.field1845) {
            arg1.field1841 = new int[this.field1845 + 100];
            arg1.field1874 = new int[this.field1845 + 100];
            arg1.field1815 = new int[this.field1845 + 100];
        }
        for (int var4 = 0; var4 < this.field1845; var4++) {
            arg1.field1841[var4] = this.field1841[var4];
            arg1.field1874[var4] = this.field1874[var4];
            arg1.field1815[var4] = this.field1815[var4];
        }
        if (arg0) {
            arg1.field1824 = this.field1824;
        } else {
            arg1.field1824 = arg2;
            if (this.field1824 == null) {
                for (int var5 = 0; var5 < this.field1850; var5++) {
                    arg1.field1824[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1850; var6++) {
                    arg1.field1824[var6] = this.field1824[var6];
                }
            }
        }
        arg1.field1817 = this.field1817;
        arg1.field1837 = this.field1837;
        arg1.field1844 = this.field1844;
        arg1.field1820 = this.field1820;
        arg1.field1821 = this.field1821;
        arg1.field1822 = this.field1822;
        arg1.field1823 = this.field1823;
        arg1.field1825 = this.field1825;
        arg1.field1819 = this.field1819;
        arg1.field1827 = this.field1827;
        arg1.field1829 = this.field1829;
        arg1.field1808 = this.field1808;
        arg1.field1831 = this.field1831;
        arg1.field1851 = this.field1851;
        arg1.field1833 = this.field1833;
        arg1.field1870 = this.field1870;
        arg1.method2530();
        return arg1;
    }

    @ObfuscatedName("es.i(I)V")
    public void method2585(int arg0) {
        if (this.field1843 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1873[arg0];
        int var9 = field1872[arg0];
        for (int var10 = 0; var10 < this.field1845; var10++) {
            int var11 = class134.method2643(this.field1841[var10], this.field1815[var10], var8, var9);
            int var12 = this.field1874[var10];
            int var13 = class134.method2644(this.field1841[var10], this.field1815[var10], var8, var9);
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            if (var13 > var7) {
                var7 = var13;
            }
        }
        this.field1812 = (var2 + var5) / 2;
        this.field1816 = (var3 + var6) / 2;
        this.field1842 = (var4 + var7) / 2;
        this.field1843 = (var5 - var2 + 1) / 2;
        this.field1875 = (var6 - var3 + 1) / 2;
        this.field1809 = (var7 - var4 + 1) / 2;
        if (this.field1843 < 32) {
            this.field1843 = 32;
        }
        if (this.field1809 < 32) {
            this.field1809 = 32;
        }
        if (this.field1870) {
            this.field1843 += 8;
            this.field1809 += 8;
        }
    }

    @ObfuscatedName("es.w()V")
    public void method2578() {
        if (this.field1835 == 1) {
            return;
        }
        this.field1835 = 1;
        this.field2001 = 0;
        this.field1836 = 0;
        this.field1876 = 0;
        for (int var1 = 0; var1 < this.field1845; var1++) {
            int var2 = this.field1841[var1];
            int var3 = this.field1874[var1];
            int var4 = this.field1815[var1];
            if (-var3 > this.field2001) {
                this.field2001 = -var3;
            }
            if (var3 > this.field1836) {
                this.field1836 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1876) {
                this.field1876 = var5;
            }
        }
        this.field1876 = (int) (Math.sqrt((double) this.field1876) + 0.99D);
        this.field1839 = (int) (Math.sqrt((double) (this.field2001 * this.field2001 + this.field1876 * this.field1876)) + 0.99D);
        this.field1838 = this.field1839 + (int) (Math.sqrt((double) (this.field1876 * this.field1876 + this.field1836 * this.field1836)) + 0.99D);
    }

    @ObfuscatedName("es.t()V")
    public void method2528() {
        if (this.field1835 == 2) {
            return;
        }
        this.field1835 = 2;
        this.field1876 = 0;
        for (int var1 = 0; var1 < this.field1845; var1++) {
            int var2 = this.field1841[var1];
            int var3 = this.field1874[var1];
            int var4 = this.field1815[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1876) {
                this.field1876 = var5;
            }
        }
        this.field1876 = (int) (Math.sqrt((double) this.field1876) + 0.99D);
        this.field1839 = this.field1876;
        this.field1838 = this.field1876 + this.field1876;
    }

    @ObfuscatedName("es.d()I")
    public int method2529() {
        this.method2578();
        return this.field1876;
    }

    @ObfuscatedName("es.k()V")
    public void method2530() {
        this.field1835 = 0;
        this.field1843 = -1;
    }

    @ObfuscatedName("es.c(Lex;I)V")
    public void method2531(class142 arg0, int arg1) {
        if (this.field1851 == null || arg1 == -1) {
            return;
        }
        class129 var3 = arg0.field2023[arg1];
        class136 var4 = var3.field1775;
        Statics.field1866 = 0;
        Statics.field1867 = 0;
        Statics.field1868 = 0;
        for (int var5 = 0; var5 < var3.field1771; var5++) {
            int var6 = var3.field1777[var5];
            this.method2524(var4.field1930[var6], var4.field1932[var6], var3.field1774[var5], var3.field1779[var5], var3.field1780[var5]);
        }
        this.method2530();
    }

    @ObfuscatedName("es.o(Lex;ILex;I[I)V")
    public void method2539(class142 arg0, int arg1, class142 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2531(arg0, arg1);
            return;
        }
        class129 var6 = arg0.field2023[arg1];
        class129 var7 = arg2.field2023[arg3];
        class136 var8 = var6.field1775;
        Statics.field1866 = 0;
        Statics.field1867 = 0;
        Statics.field1868 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1771; var11++) {
            int var12 = var6.field1777[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1930[var12] == 0) {
                this.method2524(var8.field1930[var12], var8.field1932[var12], var6.field1774[var11], var6.field1779[var11], var6.field1780[var11]);
            }
        }
        Statics.field1866 = 0;
        Statics.field1867 = 0;
        Statics.field1868 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1771; var15++) {
            int var16 = var7.field1777[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1930[var16] == 0) {
                this.method2524(var8.field1930[var16], var8.field1932[var16], var7.field1774[var15], var7.field1779[var15], var7.field1780[var15]);
            }
        }
        this.method2530();
    }

    @ObfuscatedName("es.l(I[IIII)V")
    public void method2524(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1866 = 0;
            Statics.field1867 = 0;
            Statics.field1868 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1851.length) {
                    int[] var10 = this.field1851[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1866 += this.field1841[var12];
                        Statics.field1867 += this.field1874[var12];
                        Statics.field1868 += this.field1815[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1866 = Statics.field1866 / var7 + arg2;
                Statics.field1867 = Statics.field1867 / var7 + arg3;
                Statics.field1868 = Statics.field1868 / var7 + arg4;
            } else {
                Statics.field1866 = arg2;
                Statics.field1867 = arg3;
                Statics.field1868 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1851.length) {
                    int[] var15 = this.field1851[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1841[var17] += arg2;
                        this.field1874[var17] += arg3;
                        this.field1815[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1851.length) {
                    int[] var20 = this.field1851[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1841[var22] -= Statics.field1866;
                        this.field1874[var22] -= Statics.field1867;
                        this.field1815[var22] -= Statics.field1868;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1872[var25];
                            int var27 = field1873[var25];
                            int var28 = this.field1874[var22] * var26 + this.field1841[var22] * var27 >> 16;
                            this.field1874[var22] = this.field1874[var22] * var27 - this.field1841[var22] * var26 >> 16;
                            this.field1841[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1872[var23];
                            int var30 = field1873[var23];
                            int var31 = this.field1874[var22] * var30 - this.field1815[var22] * var29 >> 16;
                            this.field1815[var22] = this.field1874[var22] * var29 + this.field1815[var22] * var30 >> 16;
                            this.field1874[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1872[var24];
                            int var33 = field1873[var24];
                            int var34 = this.field1841[var22] * var33 + this.field1815[var22] * var32 >> 16;
                            this.field1815[var22] = this.field1815[var22] * var33 - this.field1841[var22] * var32 >> 16;
                            this.field1841[var22] = var34;
                        }
                        this.field1841[var22] += Statics.field1866;
                        this.field1874[var22] += Statics.field1867;
                        this.field1815[var22] += Statics.field1868;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1851.length) {
                    int[] var37 = this.field1851[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1841[var39] -= Statics.field1866;
                        this.field1874[var39] -= Statics.field1867;
                        this.field1815[var39] -= Statics.field1868;
                        this.field1841[var39] = this.field1841[var39] * arg2 / 128;
                        this.field1874[var39] = this.field1874[var39] * arg3 / 128;
                        this.field1815[var39] = this.field1815[var39] * arg4 / 128;
                        this.field1841[var39] += Statics.field1866;
                        this.field1874[var39] += Statics.field1867;
                        this.field1815[var39] += Statics.field1868;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1833 != null && this.field1824 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1833.length) {
                    int[] var42 = this.field1833[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1824[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1824[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("es.f()V")
    public void method2534() {
        for (int var1 = 0; var1 < this.field1845; var1++) {
            int var2 = this.field1841[var1];
            this.field1841[var1] = this.field1815[var1];
            this.field1815[var1] = -var2;
        }
        this.method2530();
    }

    @ObfuscatedName("es.q()V")
    public void method2535() {
        for (int var1 = 0; var1 < this.field1845; var1++) {
            this.field1841[var1] = -this.field1841[var1];
            this.field1815[var1] = -this.field1815[var1];
        }
        this.method2530();
    }

    @ObfuscatedName("es.r()V")
    public void method2536() {
        for (int var1 = 0; var1 < this.field1845; var1++) {
            int var2 = this.field1815[var1];
            this.field1815[var1] = this.field1841[var1];
            this.field1841[var1] = -var2;
        }
        this.method2530();
    }

    @ObfuscatedName("es.x(I)V")
    public void method2537(int arg0) {
        int var2 = field1872[arg0];
        int var3 = field1873[arg0];
        for (int var4 = 0; var4 < this.field1845; var4++) {
            int var5 = this.field1874[var4] * var3 - this.field1815[var4] * var2 >> 16;
            this.field1815[var4] = this.field1874[var4] * var2 + this.field1815[var4] * var3 >> 16;
            this.field1874[var4] = var5;
        }
        this.method2530();
    }

    @ObfuscatedName("es.u(III)V")
    public void method2586(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1845; var4++) {
            this.field1841[var4] += arg0;
            this.field1874[var4] += arg1;
            this.field1815[var4] += arg2;
        }
        this.method2530();
    }

    @ObfuscatedName("es.a(III)V")
    public void method2584(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1845; var4++) {
            this.field1841[var4] = this.field1841[var4] * arg0 / 128;
            this.field1874[var4] = this.field1874[var4] * arg1 / 128;
            this.field1815[var4] = this.field1815[var4] * arg2 / 128;
        }
        this.method2530();
    }

    @ObfuscatedName("es.ad(IIIIIII)V")
    public final void method2540(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1856[0] = -1;
        if (this.field1835 != 2 && this.field1835 != 1) {
            this.method2528();
        }
        int var8 = Statics.field1901;
        int var9 = Statics.field1906;
        int var10 = field1872[arg0];
        int var11 = field1873[arg0];
        int var12 = field1872[arg1];
        int var13 = field1873[arg1];
        int var14 = field1872[arg2];
        int var15 = field1873[arg2];
        int var16 = field1872[arg3];
        int var17 = field1873[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1845; var19++) {
            int var20 = this.field1841[var19];
            int var21 = this.field1874[var19];
            int var22 = this.field1815[var19];
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
            field1818[var19] = var30 - var18;
            field1871[var19] = class134.field1913 * var26 / var30 + var8;
            field1814[var19] = class134.field1913 * var29 / var30 + var9;
            if (this.field1828 > 0) {
                field1849[var19] = var26;
                field1853[var19] = var29;
                field1854[var19] = var30;
            }
        }
        try {
            this.method2543(false, false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("es.al(IIIIIIII)V")
    public final void method2541(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1856[0] = -1;
        if (this.field1835 != 2 && this.field1835 != 1) {
            this.method2528();
        }
        int var9 = Statics.field1901;
        int var10 = Statics.field1906;
        int var11 = field1872[arg0];
        int var12 = field1873[arg0];
        int var13 = field1872[arg1];
        int var14 = field1873[arg1];
        int var15 = field1872[arg2];
        int var16 = field1873[arg2];
        int var17 = field1872[arg3];
        int var18 = field1873[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1845; var20++) {
            int var21 = this.field1841[var20];
            int var22 = this.field1874[var20];
            int var23 = this.field1815[var20];
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
            field1818[var20] = var31 - var19;
            field1871[var20] = class134.field1913 * var27 / arg7 + var9;
            field1814[var20] = class134.field1913 * var30 / arg7 + var10;
            if (this.field1828 > 0) {
                field1849[var20] = var27;
                field1853[var20] = var30;
                field1854[var20] = var31;
            }
        }
        try {
            this.method2543(false, false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("es.cx(IIIIIIIII)V")
    public void method2542(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1856[0] = -1;
        if (this.field1835 != 1) {
            this.method2578();
        }
        this.method2585(arg0);
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1876 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1876) * class134.field1913;
        if (var15 / var13 >= Statics.field1904) {
            return;
        }
        int var16 = (this.field1876 + var14) * class134.field1913;
        if (var16 / var13 <= Statics.field1909) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1876 * arg1 >> 16;
        int var19 = (var17 + var18) * class134.field1913;
        if (var19 / var13 <= Statics.field1911) {
            return;
        }
        int var20 = (this.field2001 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class134.field1913;
        if (var21 / var13 >= Statics.field1912) {
            return;
        }
        int var22 = (this.field2001 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1828 > 0;
        int var26 = class132.field1883;
        int var28 = class132.field1879;
        boolean var30 = class132.field1880;
        if (class8.field225 && arg8 > 0) {
            if (class132.method3045(this, arg5, arg6, arg7)) {
                class8.method11(this, arg5, arg6, arg7, -65281);
            } else if (class8.field221 == class12.field253) {
                class8.method11(this, arg5, arg6, arg7, -16776961);
            }
        }
        if (class8.field222 && arg8 > 0) {
            int var33 = var11 - var12;
            if (var33 <= 50) {
                var33 = 50;
            }
            int var38;
            int var39;
            if (var14 > 0) {
                var38 = var15 / var13;
                var39 = var16 / var33;
            } else {
                var39 = var16 / var13;
                var38 = var15 / var33;
            }
            int var40;
            int var41;
            if (var17 > 0) {
                var40 = var21 / var13;
                var41 = var19 / var33;
            } else {
                var41 = var19 / var13;
                var40 = var21 / var33;
            }
            int var42 = -8355840;
            int var43 = var26 - Statics.field1901;
            int var44 = var28 - Statics.field1906;
            if (var43 > var38 && var43 < var39 && var44 > var40 && var44 < var41) {
                var42 = -256;
            }
            class8.method2912(Statics.field1901 + var38, Statics.field1906 + var40, Statics.field1901 + var39, Statics.field1906 + var41, var42);
        }
        boolean var45 = false;
        if (arg8 > 0 && var30) {
            boolean var46 = false;
            if (field1869) {
                var46 = class132.method3045(this, arg5, arg6, arg7);
            } else {
                int var47 = var11 - var12;
                if (var47 <= 50) {
                    var47 = 50;
                }
                int var48;
                int var49;
                if (var14 > 0) {
                    var48 = var15 / var13;
                    var49 = var16 / var47;
                } else {
                    var49 = var16 / var13;
                    var48 = var15 / var47;
                }
                int var50;
                int var51;
                if (var17 > 0) {
                    var50 = var21 / var13;
                    var51 = var19 / var47;
                } else {
                    var51 = var19 / var13;
                    var50 = var21 / var47;
                }
                int var52 = var26 - Statics.field1901;
                int var53 = var28 - Statics.field1906;
                if (var52 > var48 && var52 < var49 && var53 > var50 && var53 < var51) {
                    var46 = true;
                }
            }
            if (var46) {
                if (this.field1870) {
                    class132.method2953(arg8);
                } else {
                    var45 = true;
                }
            }
        }
        int var54 = Statics.field1901;
        int var55 = Statics.field1906;
        int var56 = 0;
        int var57 = 0;
        if (arg0 != 0) {
            var56 = field1872[arg0];
            var57 = field1873[arg0];
        }
        for (int var58 = 0; var58 < this.field1845; var58++) {
            int var59 = this.field1841[var58];
            int var60 = this.field1874[var58];
            int var61 = this.field1815[var58];
            if (arg0 != 0) {
                int var62 = var56 * var61 + var57 * var59 >> 16;
                var61 = var57 * var61 - var56 * var59 >> 16;
                var59 = var62;
            }
            int var63 = arg5 + var59;
            int var64 = arg6 + var60;
            int var65 = arg7 + var61;
            int var66 = arg3 * var65 + arg4 * var63 >> 16;
            int var67 = arg4 * var65 - arg3 * var63 >> 16;
            int var69 = arg2 * var64 - arg1 * var67 >> 16;
            int var70 = arg1 * var64 + arg2 * var67 >> 16;
            field1818[var58] = var70 - var11;
            if (var70 >= 50) {
                field1871[var58] = class134.field1913 * var66 / var70 + var54;
                field1814[var58] = class134.field1913 * var69 / var70 + var55;
            } else {
                field1871[var58] = -5000;
                var23 = true;
            }
            if (var25) {
                field1849[var58] = var66;
                field1853[var58] = var69;
                field1854[var58] = var70;
            }
        }
        try {
            this.method2543(var23, var45, this.field1870, arg8);
        } catch (Exception var73) {
        }
    }

    @ObfuscatedName("es.aq(ZZZI)V")
    public final void method2543(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field1838 >= 1600) {
            return;
        }
        for (int var5 = 0; var5 < this.field1838; var5++) {
            field1856[var5] = 0;
        }
        int var6 = arg2 ? 20 : 5;
        if (class8.field223 && arg1) {
            class8.method4635(this, var6);
        }
        for (int var7 = 0; var7 < this.field1850; var7++) {
            if (this.field1822[var7] != -2) {
                int var8 = this.field1817[var7];
                int var9 = this.field1837[var7];
                int var10 = this.field1844[var7];
                int var11 = field1871[var8];
                int var12 = field1871[var9];
                int var13 = field1871[var10];
                if (arg0 && var11 == -5000 || var12 == -5000 || var13 == -5000) {
                    int var14 = field1849[var8];
                    int var15 = field1849[var9];
                    int var16 = field1849[var10];
                    int var17 = field1853[var8];
                    int var18 = field1853[var9];
                    int var19 = field1853[var10];
                    int var20 = field1854[var8];
                    int var21 = field1854[var9];
                    int var22 = field1854[var10];
                    int var23 = var14 - var15;
                    int var24 = var16 - var15;
                    int var25 = var17 - var18;
                    int var26 = var19 - var18;
                    int var27 = var20 - var21;
                    int var28 = var22 - var21;
                    int var29 = var25 * var28 - var26 * var27;
                    int var30 = var24 * var27 - var23 * var28;
                    int var31 = var23 * var26 - var24 * var25;
                    if (var21 * var31 + var15 * var29 + var18 * var30 > 0) {
                        field1826[var7] = true;
                        int var32 = (field1818[var8] + field1818[var9] + field1818[var10]) / 3 + this.field1839;
                        field1857[var32][field1856[var32]++] = var7;
                    }
                } else {
                    if (arg1 && class132.method157(field1814[var8], field1814[var9], field1814[var10], var11, var12, var13, var6)) {
                        class132.method2953(arg3);
                        arg1 = false;
                    }
                    if ((field1814[var10] - field1814[var9]) * (var11 - var12) - (field1814[var8] - field1814[var9]) * (var13 - var12) > 0) {
                        field1826[var7] = false;
                        if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= Statics.field1907 && var12 <= Statics.field1907 && var13 <= Statics.field1907) {
                            field1847[var7] = false;
                        } else {
                            field1847[var7] = true;
                        }
                        int var33 = (field1818[var8] + field1818[var9] + field1818[var10]) / 3 + this.field1839;
                        field1857[var33][field1856[var33]++] = var7;
                    }
                }
            }
        }
        if (this.field1823 == null) {
            for (int var34 = this.field1838 - 1; var34 >= 0; var34--) {
                int var35 = field1856[var34];
                if (var35 > 0) {
                    int[] var36 = field1857[var34];
                    for (int var37 = 0; var37 < var35; var37++) {
                        this.method2526(var36[var37]);
                    }
                }
            }
            return;
        }
        for (int var38 = 0; var38 < 12; var38++) {
            field1858[var38] = 0;
            field1862[var38] = 0;
        }
        for (int var39 = this.field1838 - 1; var39 >= 0; var39--) {
            int var40 = field1856[var39];
            if (var40 > 0) {
                int[] var41 = field1857[var39];
                for (int var42 = 0; var42 < var40; var42++) {
                    int var43 = var41[var42];
                    byte var44 = this.field1823[var43];
                    int var45 = field1858[var44]++;
                    field1859[var44][var45] = var43;
                    if (var44 < 10) {
                        field1862[var44] += var39;
                    } else if (var44 == 10) {
                        field1840[var45] = var39;
                    } else {
                        field1861[var45] = var39;
                    }
                }
            }
        }
        int var46 = 0;
        if (field1858[1] > 0 || field1858[2] > 0) {
            var46 = (field1862[1] + field1862[2]) / (field1858[1] + field1858[2]);
        }
        int var47 = 0;
        if (field1858[3] > 0 || field1858[4] > 0) {
            var47 = (field1862[3] + field1862[4]) / (field1858[3] + field1858[4]);
        }
        int var48 = 0;
        if (field1858[6] > 0 || field1858[8] > 0) {
            var48 = (field1862[6] + field1862[8]) / (field1858[6] + field1858[8]);
        }
        int var49 = 0;
        int var50 = field1858[10];
        int[] var51 = field1859[10];
        int[] var52 = field1840;
        if (var49 == var50) {
            var49 = 0;
            var50 = field1858[11];
            var51 = field1859[11];
            var52 = field1861;
        }
        int var53;
        if (var49 < var50) {
            var53 = var52[var49];
        } else {
            var53 = -1000;
        }
        for (int var54 = 0; var54 < 10; var54++) {
            while (var54 == 0 && var53 > var46) {
                this.method2526(var51[var49++]);
                if (var49 == var50 && field1859[11] != var51) {
                    var49 = 0;
                    var50 = field1858[11];
                    var51 = field1859[11];
                    var52 = field1861;
                }
                if (var49 < var50) {
                    var53 = var52[var49];
                } else {
                    var53 = -1000;
                }
            }
            while (var54 == 3 && var53 > var47) {
                this.method2526(var51[var49++]);
                if (var49 == var50 && field1859[11] != var51) {
                    var49 = 0;
                    var50 = field1858[11];
                    var51 = field1859[11];
                    var52 = field1861;
                }
                if (var49 < var50) {
                    var53 = var52[var49];
                } else {
                    var53 = -1000;
                }
            }
            while (var54 == 5 && var53 > var48) {
                this.method2526(var51[var49++]);
                if (var49 == var50 && field1859[11] != var51) {
                    var49 = 0;
                    var50 = field1858[11];
                    var51 = field1859[11];
                    var52 = field1861;
                }
                if (var49 < var50) {
                    var53 = var52[var49];
                } else {
                    var53 = -1000;
                }
            }
            int var55 = field1858[var54];
            int[] var56 = field1859[var54];
            for (int var57 = 0; var57 < var55; var57++) {
                this.method2526(var56[var57]);
            }
        }
        while (var53 != -1000) {
            this.method2526(var51[var49++]);
            if (var49 == var50 && field1859[11] != var51) {
                var49 = 0;
                var51 = field1859[11];
                var50 = field1858[11];
                var52 = field1861;
            }
            if (var49 < var50) {
                var53 = var52[var49];
            } else {
                var53 = -1000;
            }
        }
    }

    @ObfuscatedName("es.ar(I)V")
    public final void method2526(int arg0) {
        if (field1826[arg0]) {
            this.method2594(arg0);
            return;
        }
        int var2 = this.field1817[arg0];
        int var3 = this.field1837[arg0];
        int var4 = this.field1844[arg0];
        class134.field1899 = field1847[arg0];
        if (this.field1824 == null) {
            class134.field1897 = 0;
        } else {
            class134.field1897 = this.field1824[arg0] & 0xFF;
        }
        if (this.field1819 != null && this.field1819[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1825 == null || this.field1825[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1825[arg0] & 0xFF;
                var6 = this.field1829[var5];
                var7 = this.field1808[var5];
                var8 = this.field1831[var5];
            }
            if (this.field1822[arg0] == -1) {
                class134.method2638(field1814[var2], field1814[var3], field1814[var4], field1871[var2], field1871[var3], field1871[var4], this.field1820[arg0], this.field1820[arg0], this.field1820[arg0], field1849[var6], field1849[var7], field1849[var8], field1853[var6], field1853[var7], field1853[var8], field1854[var6], field1854[var7], field1854[var8], this.field1819[arg0]);
            } else {
                class134.method2638(field1814[var2], field1814[var3], field1814[var4], field1871[var2], field1871[var3], field1871[var4], this.field1820[arg0], this.field1821[arg0], this.field1822[arg0], field1849[var6], field1849[var7], field1849[var8], field1853[var6], field1853[var7], field1853[var8], field1854[var6], field1854[var7], field1854[var8], this.field1819[arg0]);
            }
        } else if (this.field1822[arg0] == -1) {
            class134.method2636(field1814[var2], field1814[var3], field1814[var4], field1871[var2], field1871[var3], field1871[var4], field1813[this.field1820[arg0]]);
        } else {
            class134.method2634(field1814[var2], field1814[var3], field1814[var4], field1871[var2], field1871[var3], field1871[var4], this.field1820[arg0], this.field1821[arg0], this.field1822[arg0]);
        }
    }

    @ObfuscatedName("es.an(I)V")
    public final void method2594(int arg0) {
        int var2 = Statics.field1901;
        int var3 = Statics.field1906;
        int var4 = 0;
        int var5 = this.field1817[arg0];
        int var6 = this.field1837[arg0];
        int var7 = this.field1844[arg0];
        int var8 = field1854[var5];
        int var9 = field1854[var6];
        int var10 = field1854[var7];
        if (this.field1824 == null) {
            class134.field1897 = 0;
        } else {
            class134.field1897 = this.field1824[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1848[var4] = field1871[var5];
            field1864[var4] = field1814[var5];
            field1865[var4++] = this.field1820[arg0];
        } else {
            int var11 = field1849[var5];
            int var12 = field1853[var5];
            int var13 = this.field1820[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1832[var10 - var8];
                field1848[var4] = (((field1849[var7] - var11) * var14 >> 16) + var11) * class134.field1913 / 50 + var2;
                field1864[var4] = (((field1853[var7] - var12) * var14 >> 16) + var12) * class134.field1913 / 50 + var3;
                field1865[var4++] = ((this.field1822[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1832[var9 - var8];
                field1848[var4] = (((field1849[var6] - var11) * var15 >> 16) + var11) * class134.field1913 / 50 + var2;
                field1864[var4] = (((field1853[var6] - var12) * var15 >> 16) + var12) * class134.field1913 / 50 + var3;
                field1865[var4++] = ((this.field1821[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1848[var4] = field1871[var6];
            field1864[var4] = field1814[var6];
            field1865[var4++] = this.field1821[arg0];
        } else {
            int var16 = field1849[var6];
            int var17 = field1853[var6];
            int var18 = this.field1821[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1832[var8 - var9];
                field1848[var4] = (((field1849[var5] - var16) * var19 >> 16) + var16) * class134.field1913 / 50 + var2;
                field1864[var4] = (((field1853[var5] - var17) * var19 >> 16) + var17) * class134.field1913 / 50 + var3;
                field1865[var4++] = ((this.field1820[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1832[var10 - var9];
                field1848[var4] = (((field1849[var7] - var16) * var20 >> 16) + var16) * class134.field1913 / 50 + var2;
                field1864[var4] = (((field1853[var7] - var17) * var20 >> 16) + var17) * class134.field1913 / 50 + var3;
                field1865[var4++] = ((this.field1822[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1848[var4] = field1871[var7];
            field1864[var4] = field1814[var7];
            field1865[var4++] = this.field1822[arg0];
        } else {
            int var21 = field1849[var7];
            int var22 = field1853[var7];
            int var23 = this.field1822[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1832[var9 - var10];
                field1848[var4] = (((field1849[var6] - var21) * var24 >> 16) + var21) * class134.field1913 / 50 + var2;
                field1864[var4] = (((field1853[var6] - var22) * var24 >> 16) + var22) * class134.field1913 / 50 + var3;
                field1865[var4++] = ((this.field1821[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1832[var8 - var10];
                field1848[var4] = (((field1849[var5] - var21) * var25 >> 16) + var21) * class134.field1913 / 50 + var2;
                field1864[var4] = (((field1853[var5] - var22) * var25 >> 16) + var22) * class134.field1913 / 50 + var3;
                field1865[var4++] = ((this.field1820[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1848[0];
        int var27 = field1848[1];
        int var28 = field1848[2];
        int var29 = field1864[0];
        int var30 = field1864[1];
        int var31 = field1864[2];
        class134.field1899 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1907 || var27 > Statics.field1907 || var28 > Statics.field1907) {
                class134.field1899 = true;
            }
            if (this.field1819 != null && this.field1819[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1825 == null || this.field1825[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1825[arg0] & 0xFF;
                    var33 = this.field1829[var32];
                    var34 = this.field1808[var32];
                    var35 = this.field1831[var32];
                }
                if (this.field1822[arg0] == -1) {
                    class134.method2638(var29, var30, var31, var26, var27, var28, this.field1820[arg0], this.field1820[arg0], this.field1820[arg0], field1849[var33], field1849[var34], field1849[var35], field1853[var33], field1853[var34], field1853[var35], field1854[var33], field1854[var34], field1854[var35], this.field1819[arg0]);
                } else {
                    class134.method2638(var29, var30, var31, var26, var27, var28, field1865[0], field1865[1], field1865[2], field1849[var33], field1849[var34], field1849[var35], field1853[var33], field1853[var34], field1853[var35], field1854[var33], field1854[var34], field1854[var35], this.field1819[arg0]);
                }
            } else if (this.field1822[arg0] == -1) {
                class134.method2636(var29, var30, var31, var26, var27, var28, field1813[this.field1820[arg0]]);
            } else {
                class134.method2634(var29, var30, var31, var26, var27, var28, field1865[0], field1865[1], field1865[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1907 || var27 > Statics.field1907 || var28 > Statics.field1907 || field1848[3] < 0 || field1848[3] > Statics.field1907) {
            class134.field1899 = true;
        }
        if (this.field1819 != null && this.field1819[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1825 == null || this.field1825[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1825[arg0] & 0xFF;
                var37 = this.field1829[var36];
                var38 = this.field1808[var36];
                var39 = this.field1831[var36];
            }
            short var40 = this.field1819[arg0];
            if (this.field1822[arg0] == -1) {
                class134.method2638(var29, var30, var31, var26, var27, var28, this.field1820[arg0], this.field1820[arg0], this.field1820[arg0], field1849[var37], field1849[var38], field1849[var39], field1853[var37], field1853[var38], field1853[var39], field1854[var37], field1854[var38], field1854[var39], var40);
                class134.method2638(var29, var31, field1864[3], var26, var28, field1848[3], this.field1820[arg0], this.field1820[arg0], this.field1820[arg0], field1849[var37], field1849[var38], field1849[var39], field1853[var37], field1853[var38], field1853[var39], field1854[var37], field1854[var38], field1854[var39], var40);
            } else {
                class134.method2638(var29, var30, var31, var26, var27, var28, field1865[0], field1865[1], field1865[2], field1849[var37], field1849[var38], field1849[var39], field1853[var37], field1853[var38], field1853[var39], field1854[var37], field1854[var38], field1854[var39], var40);
                class134.method2638(var29, var31, field1864[3], var26, var28, field1848[3], field1865[0], field1865[2], field1865[3], field1849[var37], field1849[var38], field1849[var39], field1853[var37], field1853[var38], field1853[var39], field1854[var37], field1854[var38], field1854[var39], var40);
            }
        } else if (this.field1822[arg0] == -1) {
            int var41 = field1813[this.field1820[arg0]];
            class134.method2636(var29, var30, var31, var26, var27, var28, var41);
            class134.method2636(var29, var31, field1864[3], var26, var28, field1848[3], var41);
        } else {
            class134.method2634(var29, var30, var31, var26, var27, var28, field1865[0], field1865[1], field1865[2]);
            class134.method2634(var29, var31, field1864[3], var26, var28, field1848[3], field1865[0], field1865[2], field1865[3]);
        }
    }
}
