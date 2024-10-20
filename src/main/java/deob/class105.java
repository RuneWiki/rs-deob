package deob;

@ObfuscatedName("dq")
public class class105 extends class85 {

    @ObfuscatedName("dq.v")
    public static class105 field1785 = new class105();

    @ObfuscatedName("dq.f")
    public static byte[] field1780 = new byte[1];

    @ObfuscatedName("dq.i")
    public static class105 field1781 = new class105();

    @ObfuscatedName("dq.d")
    public static byte[] field1815 = new byte[1];

    @ObfuscatedName("dq.o")
    public int field1811 = 0;

    @ObfuscatedName("dq.c")
    public int[] field1784;

    @ObfuscatedName("dq.p")
    public int[] field1813;

    @ObfuscatedName("dq.j")
    public int[] field1814;

    @ObfuscatedName("dq.a")
    public int field1787 = 0;

    @ObfuscatedName("dq.y")
    public int[] field1788;

    @ObfuscatedName("dq.h")
    public int[] field1789;

    @ObfuscatedName("dq.z")
    public int[] field1790;

    @ObfuscatedName("dq.w")
    public int[] field1791;

    @ObfuscatedName("dq.l")
    public int[] field1841;

    @ObfuscatedName("dq.q")
    public int[] field1804;

    @ObfuscatedName("dq.x")
    public byte[] field1794;

    @ObfuscatedName("dq.s")
    public byte[] field1795;

    @ObfuscatedName("dq.n")
    public byte[] field1842;

    @ObfuscatedName("dq.u")
    public short[] field1786;

    @ObfuscatedName("dq.m")
    public byte field1798 = 0;

    @ObfuscatedName("dq.e")
    public int field1799 = 0;

    @ObfuscatedName("dq.k")
    public int[] field1800;

    @ObfuscatedName("dq.r")
    public int[] field1801;

    @ObfuscatedName("dq.b")
    public int[] field1802;

    @ObfuscatedName("dq.t")
    public int[][] field1782;

    @ObfuscatedName("dq.g")
    public int[][] field1805;

    @ObfuscatedName("dq.af")
    public boolean field1796 = false;

    @ObfuscatedName("dq.ad")
    public int field1806;

    @ObfuscatedName("dq.ak")
    public int field1807;

    @ObfuscatedName("dq.ai")
    public int field1808;

    @ObfuscatedName("dq.au")
    public int field1809;

    @ObfuscatedName("dq.ar")
    public int field1810;

    @ObfuscatedName("dq.at")
    public static boolean[] field1812 = new boolean[4096];

    @ObfuscatedName("dq.al")
    public static boolean[] field1821 = new boolean[4096];

    @ObfuscatedName("dq.aj")
    public static int[] field1783 = new int[4096];

    @ObfuscatedName("dq.ag")
    public static int[] field1819 = new int[4096];

    @ObfuscatedName("dq.ay")
    public static int[] field1816 = new int[4096];

    @ObfuscatedName("dq.az")
    public static int[] field1817 = new int[4096];

    @ObfuscatedName("dq.ac")
    public static int[] field1818 = new int[4096];

    @ObfuscatedName("dq.aa")
    public static int[] field1797 = new int[4096];

    @ObfuscatedName("dq.av")
    public static int[] field1792 = new int[1600];

    @ObfuscatedName("dq.am")
    public static int[][] field1822 = new int[1600][512];

    @ObfuscatedName("dq.an")
    public static int[] field1803 = new int[12];

    @ObfuscatedName("dq.ae")
    public static int[][] field1824 = new int[12][2000];

    @ObfuscatedName("dq.ap")
    public static int[] field1833 = new int[2000];

    @ObfuscatedName("dq.ax")
    public static int[] field1826 = new int[2000];

    @ObfuscatedName("dq.ab")
    public static int[] field1827 = new int[12];

    @ObfuscatedName("dq.as")
    public static int[] field1828 = new int[10];

    @ObfuscatedName("dq.ah")
    public static int[] field1829 = new int[10];

    @ObfuscatedName("dq.aq")
    public static int[] field1830 = new int[10];

    @ObfuscatedName("dq.br")
    public static boolean field1793 = false;

    @ObfuscatedName("dq.bc")
    public static int field1825 = 0;

    @ObfuscatedName("dq.bp")
    public static int field1779 = 0;

    @ObfuscatedName("dq.bd")
    public static int field1837 = 0;

    @ObfuscatedName("dq.bm")
    public static int[] field1838 = new int[1000];

    @ObfuscatedName("dq.ba")
    public static int[] field1839 = class91.field1569;

    @ObfuscatedName("dq.bg")
    public static int[] field1840 = class91.field1566;

    @ObfuscatedName("dq.bu")
    public static int[] field1823 = class91.field1563;

    @ObfuscatedName("dq.bz")
    public static int[] field1835 = class91.field1568;

    public class105() {
    }

    public class105(class105[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1811 = 0;
        this.field1787 = 0;
        this.field1799 = 0;
        this.field1798 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class105 var8 = arg0[var7];
            if (var8 != null) {
                this.field1811 += var8.field1811;
                this.field1787 += var8.field1787;
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
                var4 |= var8.field1795 != null;
                var5 |= var8.field1786 != null;
                var6 |= var8.field1842 != null;
            }
        }
        this.field1784 = new int[this.field1811];
        this.field1813 = new int[this.field1811];
        this.field1814 = new int[this.field1811];
        this.field1788 = new int[this.field1787];
        this.field1789 = new int[this.field1787];
        this.field1790 = new int[this.field1787];
        this.field1791 = new int[this.field1787];
        this.field1841 = new int[this.field1787];
        this.field1804 = new int[this.field1787];
        if (var3) {
            this.field1794 = new byte[this.field1787];
        }
        if (var4) {
            this.field1795 = new byte[this.field1787];
        }
        if (var5) {
            this.field1786 = new short[this.field1787];
        }
        if (var6) {
            this.field1842 = new byte[this.field1787];
        }
        if (this.field1799 > 0) {
            this.field1800 = new int[this.field1799];
            this.field1801 = new int[this.field1799];
            this.field1802 = new int[this.field1799];
        }
        this.field1811 = 0;
        this.field1787 = 0;
        this.field1799 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class105 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1787; var11++) {
                    this.field1788[this.field1787] = var10.field1788[var11] + this.field1811;
                    this.field1789[this.field1787] = var10.field1789[var11] + this.field1811;
                    this.field1790[this.field1787] = var10.field1790[var11] + this.field1811;
                    this.field1791[this.field1787] = var10.field1791[var11];
                    this.field1841[this.field1787] = var10.field1841[var11];
                    this.field1804[this.field1787] = var10.field1804[var11];
                    if (var3) {
                        if (var10.field1794 == null) {
                            this.field1794[this.field1787] = var10.field1798;
                        } else {
                            this.field1794[this.field1787] = var10.field1794[var11];
                        }
                    }
                    if (var4 && var10.field1795 != null) {
                        this.field1795[this.field1787] = var10.field1795[var11];
                    }
                    if (var5) {
                        if (var10.field1786 == null) {
                            this.field1786[this.field1787] = -1;
                        } else {
                            this.field1786[this.field1787] = var10.field1786[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1842 == null || var10.field1842[var11] == -1) {
                            this.field1842[this.field1787] = -1;
                        } else {
                            this.field1842[this.field1787] = (byte) (var10.field1842[var11] + this.field1799);
                        }
                    }
                    this.field1787++;
                }
                for (int var12 = 0; var12 < var10.field1799; var12++) {
                    this.field1800[this.field1799] = var10.field1800[var12] + this.field1811;
                    this.field1801[this.field1799] = var10.field1801[var12] + this.field1811;
                    this.field1802[this.field1799] = var10.field1802[var12] + this.field1811;
                    this.field1799++;
                }
                for (int var13 = 0; var13 < var10.field1811; var13++) {
                    this.field1784[this.field1811] = var10.field1784[var13];
                    this.field1813[this.field1811] = var10.field1813[var13];
                    this.field1814[this.field1811] = var10.field1814[var13];
                    this.field1811++;
                }
            }
        }
    }

    @ObfuscatedName("dq.v([[IIIIZI)Ldq;")
    public class105 method2155(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2159();
        int var7 = arg1 - this.field1808;
        int var8 = this.field1808 + arg1;
        int var9 = arg3 - this.field1808;
        int var10 = this.field1808 + arg3;
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
            var15.field1811 = this.field1811;
            var15.field1787 = this.field1787;
            var15.field1799 = this.field1799;
            var15.field1784 = this.field1784;
            var15.field1814 = this.field1814;
            var15.field1788 = this.field1788;
            var15.field1789 = this.field1789;
            var15.field1790 = this.field1790;
            var15.field1791 = this.field1791;
            var15.field1841 = this.field1841;
            var15.field1804 = this.field1804;
            var15.field1794 = this.field1794;
            var15.field1795 = this.field1795;
            var15.field1842 = this.field1842;
            var15.field1786 = this.field1786;
            var15.field1798 = this.field1798;
            var15.field1800 = this.field1800;
            var15.field1801 = this.field1801;
            var15.field1802 = this.field1802;
            var15.field1782 = this.field1782;
            var15.field1805 = this.field1805;
            var15.field1796 = this.field1796;
            var15.field1813 = new int[var15.field1811];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1811; var16++) {
                int var17 = this.field1784[var16] + arg1;
                int var18 = this.field1814[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1813[var16] = this.field1813[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1811; var26++) {
                int var27 = (-this.field1813[var26] << 16) / this.field1443;
                if (var27 < arg5) {
                    int var28 = this.field1784[var26] + arg1;
                    int var29 = this.field1814[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1813[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1813[var26];
                }
            }
        }
        var15.field1806 = 0;
        return var15;
    }

    @ObfuscatedName("dq.f(Z)Ldq;")
    public class105 method2156(boolean arg0) {
        if (!arg0 && field1780.length < this.field1787) {
            field1780 = new byte[this.field1787 + 100];
        }
        return this.method2158(arg0, field1785, field1780);
    }

    @ObfuscatedName("dq.d(Z)Ldq;")
    public class105 method2157(boolean arg0) {
        if (!arg0 && field1815.length < this.field1787) {
            field1815 = new byte[this.field1787 + 100];
        }
        return this.method2158(arg0, field1781, field1815);
    }

    @ObfuscatedName("dq.o(ZLdq;[B)Ldq;")
    public class105 method2158(boolean arg0, class105 arg1, byte[] arg2) {
        arg1.field1811 = this.field1811;
        arg1.field1787 = this.field1787;
        arg1.field1799 = this.field1799;
        if (arg1.field1784 == null || arg1.field1784.length < this.field1811) {
            arg1.field1784 = new int[this.field1811 + 100];
            arg1.field1813 = new int[this.field1811 + 100];
            arg1.field1814 = new int[this.field1811 + 100];
        }
        for (int var4 = 0; var4 < this.field1811; var4++) {
            arg1.field1784[var4] = this.field1784[var4];
            arg1.field1813[var4] = this.field1813[var4];
            arg1.field1814[var4] = this.field1814[var4];
        }
        if (arg0) {
            arg1.field1795 = this.field1795;
        } else {
            arg1.field1795 = arg2;
            if (this.field1795 == null) {
                for (int var5 = 0; var5 < this.field1787; var5++) {
                    arg1.field1795[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1787; var6++) {
                    arg1.field1795[var6] = this.field1795[var6];
                }
            }
        }
        arg1.field1788 = this.field1788;
        arg1.field1789 = this.field1789;
        arg1.field1790 = this.field1790;
        arg1.field1791 = this.field1791;
        arg1.field1841 = this.field1841;
        arg1.field1804 = this.field1804;
        arg1.field1794 = this.field1794;
        arg1.field1842 = this.field1842;
        arg1.field1786 = this.field1786;
        arg1.field1798 = this.field1798;
        arg1.field1800 = this.field1800;
        arg1.field1801 = this.field1801;
        arg1.field1802 = this.field1802;
        arg1.field1782 = this.field1782;
        arg1.field1805 = this.field1805;
        arg1.field1796 = this.field1796;
        arg1.field1806 = 0;
        return arg1;
    }

    @ObfuscatedName("dq.c()V")
    public void method2159() {
        if (this.field1806 == 1) {
            return;
        }
        this.field1806 = 1;
        this.field1443 = 0;
        this.field1807 = 0;
        this.field1808 = 0;
        for (int var1 = 0; var1 < this.field1811; var1++) {
            int var2 = this.field1784[var1];
            int var3 = this.field1813[var1];
            int var4 = this.field1814[var1];
            if (-var3 > this.field1443) {
                this.field1443 = -var3;
            }
            if (var3 > this.field1807) {
                this.field1807 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1808) {
                this.field1808 = var5;
            }
        }
        this.field1808 = (int) (Math.sqrt((double) this.field1808) + 0.99D);
        this.field1810 = (int) (Math.sqrt((double) (this.field1443 * this.field1443 + this.field1808 * this.field1808)) + 0.99D);
        this.field1809 = this.field1810 + (int) (Math.sqrt((double) (this.field1808 * this.field1808 + this.field1807 * this.field1807)) + 0.99D);
    }

    @ObfuscatedName("dq.p()V")
    public void method2174() {
        if (this.field1806 == 2) {
            return;
        }
        this.field1806 = 2;
        this.field1808 = 0;
        for (int var1 = 0; var1 < this.field1811; var1++) {
            int var2 = this.field1784[var1];
            int var3 = this.field1813[var1];
            int var4 = this.field1814[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1808) {
                this.field1808 = var5;
            }
        }
        this.field1808 = (int) (Math.sqrt((double) this.field1808) + 0.99D);
        this.field1810 = this.field1808;
        this.field1809 = this.field1808 + this.field1808;
    }

    @ObfuscatedName("dq.j()I")
    public int method2202() {
        this.method2159();
        return this.field1808;
    }

    @ObfuscatedName("dq.a(Lcw;I)V")
    public void method2162(class103 arg0, int arg1) {
        if (this.field1782 == null || arg1 == -1) {
            return;
        }
        class88 var3 = arg0.field1754[arg1];
        class102 var4 = var3.field1525;
        Statics.field1831 = 0;
        Statics.field1832 = 0;
        Statics.field1834 = 0;
        for (int var5 = 0; var5 < var3.field1523; var5++) {
            int var6 = var3.field1524[var5];
            this.method2164(var4.field1747[var6], var4.field1741[var6], var3.field1522[var5], var3.field1526[var5], var3.field1527[var5]);
        }
        this.field1806 = 0;
    }

    @ObfuscatedName("dq.y(Lcw;ILcw;I[I)V")
    public void method2210(class103 arg0, int arg1, class103 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2162(arg0, arg1);
            return;
        }
        class88 var6 = arg0.field1754[arg1];
        class88 var7 = arg2.field1754[arg3];
        class102 var8 = var6.field1525;
        Statics.field1831 = 0;
        Statics.field1832 = 0;
        Statics.field1834 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1523; var11++) {
            int var12 = var6.field1524[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1747[var12] == 0) {
                this.method2164(var8.field1747[var12], var8.field1741[var12], var6.field1522[var11], var6.field1526[var11], var6.field1527[var11]);
            }
        }
        Statics.field1831 = 0;
        Statics.field1832 = 0;
        Statics.field1834 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1523; var15++) {
            int var16 = var7.field1524[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1747[var16] == 0) {
                this.method2164(var8.field1747[var16], var8.field1741[var16], var7.field1522[var15], var7.field1526[var15], var7.field1527[var15]);
            }
        }
        this.field1806 = 0;
    }

    @ObfuscatedName("dq.h(I[IIII)V")
    public void method2164(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1831 = 0;
            Statics.field1832 = 0;
            Statics.field1834 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1782.length) {
                    int[] var10 = this.field1782[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1831 += this.field1784[var12];
                        Statics.field1832 += this.field1813[var12];
                        Statics.field1834 += this.field1814[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1831 = Statics.field1831 / var7 + arg2;
                Statics.field1832 = Statics.field1832 / var7 + arg3;
                Statics.field1834 = Statics.field1834 / var7 + arg4;
            } else {
                Statics.field1831 = arg2;
                Statics.field1832 = arg3;
                Statics.field1834 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1782.length) {
                    int[] var15 = this.field1782[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1784[var17] += arg2;
                        this.field1813[var17] += arg3;
                        this.field1814[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1782.length) {
                    int[] var20 = this.field1782[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1784[var22] -= Statics.field1831;
                        this.field1813[var22] -= Statics.field1832;
                        this.field1814[var22] -= Statics.field1834;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1839[var25];
                            int var27 = field1840[var25];
                            int var28 = this.field1813[var22] * var26 + this.field1784[var22] * var27 >> 16;
                            this.field1813[var22] = this.field1813[var22] * var27 - this.field1784[var22] * var26 >> 16;
                            this.field1784[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1839[var23];
                            int var30 = field1840[var23];
                            int var31 = this.field1813[var22] * var30 - this.field1814[var22] * var29 >> 16;
                            this.field1814[var22] = this.field1814[var22] * var30 + this.field1813[var22] * var29 >> 16;
                            this.field1813[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1839[var24];
                            int var33 = field1840[var24];
                            int var34 = this.field1814[var22] * var32 + this.field1784[var22] * var33 >> 16;
                            this.field1814[var22] = this.field1814[var22] * var33 - this.field1784[var22] * var32 >> 16;
                            this.field1784[var22] = var34;
                        }
                        this.field1784[var22] += Statics.field1831;
                        this.field1813[var22] += Statics.field1832;
                        this.field1814[var22] += Statics.field1834;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1782.length) {
                    int[] var37 = this.field1782[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1784[var39] -= Statics.field1831;
                        this.field1813[var39] -= Statics.field1832;
                        this.field1814[var39] -= Statics.field1834;
                        this.field1784[var39] = this.field1784[var39] * arg2 / 128;
                        this.field1813[var39] = this.field1813[var39] * arg3 / 128;
                        this.field1814[var39] = this.field1814[var39] * arg4 / 128;
                        this.field1784[var39] += Statics.field1831;
                        this.field1813[var39] += Statics.field1832;
                        this.field1814[var39] += Statics.field1834;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1805 != null && this.field1795 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1805.length) {
                    int[] var42 = this.field1805[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1795[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1795[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dq.z()V")
    public void method2165() {
        for (int var1 = 0; var1 < this.field1811; var1++) {
            int var2 = this.field1784[var1];
            this.field1784[var1] = this.field1814[var1];
            this.field1814[var1] = -var2;
        }
        this.field1806 = 0;
    }

    @ObfuscatedName("dq.w()V")
    public void method2166() {
        for (int var1 = 0; var1 < this.field1811; var1++) {
            this.field1784[var1] = -this.field1784[var1];
            this.field1814[var1] = -this.field1814[var1];
        }
        this.field1806 = 0;
    }

    @ObfuscatedName("dq.q()V")
    public void method2219() {
        for (int var1 = 0; var1 < this.field1811; var1++) {
            int var2 = this.field1814[var1];
            this.field1814[var1] = this.field1784[var1];
            this.field1784[var1] = -var2;
        }
        this.field1806 = 0;
    }

    @ObfuscatedName("dq.x(I)V")
    public void method2168(int arg0) {
        int var2 = field1839[arg0];
        int var3 = field1840[arg0];
        for (int var4 = 0; var4 < this.field1811; var4++) {
            int var5 = this.field1813[var4] * var3 - this.field1814[var4] * var2 >> 16;
            this.field1814[var4] = this.field1814[var4] * var3 + this.field1813[var4] * var2 >> 16;
            this.field1813[var4] = var5;
        }
        this.field1806 = 0;
    }

    @ObfuscatedName("dq.s(III)V")
    public void method2169(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1811; var4++) {
            this.field1784[var4] += arg0;
            this.field1813[var4] += arg1;
            this.field1814[var4] += arg2;
        }
        this.field1806 = 0;
    }

    @ObfuscatedName("dq.n(III)V")
    public void method2170(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1811; var4++) {
            this.field1784[var4] = this.field1784[var4] * arg0 / 128;
            this.field1813[var4] = this.field1813[var4] * arg1 / 128;
            this.field1814[var4] = this.field1814[var4] * arg2 / 128;
        }
        this.field1806 = 0;
    }

    @ObfuscatedName("dq.u(IIIIIII)V")
    public final void method2192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1792[0] = -1;
        if (this.field1806 != 2 && this.field1806 != 1) {
            this.method2174();
        }
        int var8 = Statics.field1570;
        int var9 = Statics.field1564;
        int var10 = field1839[arg0];
        int var11 = field1840[arg0];
        int var12 = field1839[arg1];
        int var13 = field1840[arg1];
        int var14 = field1839[arg2];
        int var15 = field1840[arg2];
        int var16 = field1839[arg3];
        int var17 = field1840[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1811; var19++) {
            int var20 = this.field1784[var19];
            int var21 = this.field1813[var19];
            int var22 = this.field1814[var19];
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
            field1816[var19] = var30 - var18;
            field1783[var19] = class91.field1555 * var26 / var30 + var8;
            field1819[var19] = class91.field1555 * var29 / var30 + var9;
            if (this.field1799 > 0) {
                field1817[var19] = var26;
                field1818[var19] = var29;
                field1797[var19] = var30;
            }
        }
        try {
            this.method2173(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dq.m(IIIIIIII)V")
    public final void method2220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1792[0] = -1;
        if (this.field1806 != 2 && this.field1806 != 1) {
            this.method2174();
        }
        int var9 = Statics.field1570;
        int var10 = Statics.field1564;
        int var11 = field1839[arg0];
        int var12 = field1840[arg0];
        int var13 = field1839[arg1];
        int var14 = field1840[arg1];
        int var15 = field1839[arg2];
        int var16 = field1840[arg2];
        int var17 = field1839[arg3];
        int var18 = field1840[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1811; var20++) {
            int var21 = this.field1784[var20];
            int var22 = this.field1813[var20];
            int var23 = this.field1814[var20];
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
            field1816[var20] = var31 - var19;
            field1783[var20] = class91.field1555 * var27 / arg7 + var9;
            field1819[var20] = class91.field1555 * var30 / arg7 + var10;
            if (this.field1799 > 0) {
                field1817[var20] = var27;
                field1818[var20] = var30;
                field1797[var20] = var31;
            }
        }
        try {
            this.method2173(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dq.az(IIIIIIIII)V")
    public void method1783(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1792[0] = -1;
        if (this.field1806 != 1) {
            this.method2159();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1808 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1808) * class91.field1555;
        if (var15 / var13 >= Statics.field1561) {
            return;
        }
        int var16 = (this.field1808 + var14) * class91.field1555;
        if (var16 / var13 <= Statics.field1557) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1808 * arg1 >> 16;
        int var19 = (var17 + var18) * class91.field1555;
        if (var19 / var13 <= Statics.field1562) {
            return;
        }
        int var20 = (this.field1443 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class91.field1555;
        if (var21 / var13 >= Statics.field1548) {
            return;
        }
        int var22 = (this.field1443 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1799 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1793) {
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
            int var32 = field1825 - Statics.field1570;
            int var33 = field1779 - Statics.field1564;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1796) {
                    field1838[field1837++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1570;
        int var35 = Statics.field1564;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1839[arg0];
            var37 = field1840[arg0];
        }
        for (int var38 = 0; var38 < this.field1811; var38++) {
            int var39 = this.field1784[var38];
            int var40 = this.field1813[var38];
            int var41 = this.field1814[var38];
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
            field1816[var38] = var50 - var11;
            if (var50 >= 50) {
                field1783[var38] = class91.field1555 * var46 / var50 + var34;
                field1819[var38] = class91.field1555 * var49 / var50 + var35;
            } else {
                field1783[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1817[var38] = var46;
                field1818[var38] = var49;
                field1797[var38] = var50;
            }
        }
        try {
            this.method2173(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dq.e(ZZI)V")
    public final void method2173(boolean arg0, boolean arg1, int arg2) {
        if (this.field1809 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1809; var4++) {
            field1792[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1787; var5++) {
            if (this.field1804[var5] != -2) {
                int var6 = this.field1788[var5];
                int var7 = this.field1789[var5];
                int var8 = this.field1790[var5];
                int var9 = field1783[var6];
                int var10 = field1783[var7];
                int var11 = field1783[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1817[var6];
                    int var13 = field1817[var7];
                    int var14 = field1817[var8];
                    int var15 = field1818[var6];
                    int var16 = field1818[var7];
                    int var17 = field1818[var8];
                    int var18 = field1797[var6];
                    int var19 = field1797[var7];
                    int var20 = field1797[var8];
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
                        field1821[var5] = true;
                        int var30 = (field1816[var6] + field1816[var7] + field1816[var8]) / 3 + this.field1810;
                        field1822[var30][field1792[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2176(field1825, field1779, field1819[var6], field1819[var7], field1819[var8], var9, var10, var11)) {
                        field1838[field1837++] = arg2;
                        arg1 = false;
                    }
                    if ((field1819[var8] - field1819[var7]) * (var9 - var10) - (field1819[var6] - field1819[var7]) * (var11 - var10) > 0) {
                        field1821[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1558 && var10 <= Statics.field1558 && var11 <= Statics.field1558) {
                            field1812[var5] = false;
                        } else {
                            field1812[var5] = true;
                        }
                        int var31 = (field1816[var6] + field1816[var7] + field1816[var8]) / 3 + this.field1810;
                        field1822[var31][field1792[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1794 == null) {
            for (int var32 = this.field1809 - 1; var32 >= 0; var32--) {
                int var33 = field1792[var32];
                if (var33 > 0) {
                    int[] var34 = field1822[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2213(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1803[var36] = 0;
            field1827[var36] = 0;
        }
        for (int var37 = this.field1809 - 1; var37 >= 0; var37--) {
            int var38 = field1792[var37];
            if (var38 > 0) {
                int[] var39 = field1822[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1794[var41];
                    int var43 = field1803[var42]++;
                    field1824[var42][var43] = var41;
                    if (var42 < 10) {
                        field1827[var42] += var37;
                    } else if (var42 == 10) {
                        field1833[var43] = var37;
                    } else {
                        field1826[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1803[1] > 0 || field1803[2] > 0) {
            var44 = (field1827[1] + field1827[2]) / (field1803[1] + field1803[2]);
        }
        int var45 = 0;
        if (field1803[3] > 0 || field1803[4] > 0) {
            var45 = (field1827[3] + field1827[4]) / (field1803[3] + field1803[4]);
        }
        int var46 = 0;
        if (field1803[6] > 0 || field1803[8] > 0) {
            var46 = (field1827[6] + field1827[8]) / (field1803[6] + field1803[8]);
        }
        int var47 = 0;
        int var48 = field1803[10];
        int[] var49 = field1824[10];
        int[] var50 = field1833;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1803[11];
            var49 = field1824[11];
            var50 = field1826;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2213(var49[var47++]);
                if (var47 == var48 && field1824[11] != var49) {
                    var47 = 0;
                    var48 = field1803[11];
                    var49 = field1824[11];
                    var50 = field1826;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2213(var49[var47++]);
                if (var47 == var48 && field1824[11] != var49) {
                    var47 = 0;
                    var48 = field1803[11];
                    var49 = field1824[11];
                    var50 = field1826;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2213(var49[var47++]);
                if (var47 == var48 && field1824[11] != var49) {
                    var47 = 0;
                    var48 = field1803[11];
                    var49 = field1824[11];
                    var50 = field1826;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1803[var52];
            int[] var54 = field1824[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2213(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2213(var49[var47++]);
            if (var47 == var48 && field1824[11] != var49) {
                var47 = 0;
                var49 = field1824[11];
                var48 = field1803[11];
                var50 = field1826;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dq.k(I)V")
    public final void method2213(int arg0) {
        if (field1821[arg0]) {
            this.method2175(arg0);
            return;
        }
        int var2 = this.field1788[arg0];
        int var3 = this.field1789[arg0];
        int var4 = this.field1790[arg0];
        class91.field1549 = field1812[arg0];
        if (this.field1795 == null) {
            class91.field1550 = 0;
        } else {
            class91.field1550 = this.field1795[arg0] & 0xFF;
        }
        if (this.field1786 != null && this.field1786[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1842 == null || this.field1842[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1842[arg0] & 0xFF;
                var6 = this.field1800[var5];
                var7 = this.field1801[var5];
                var8 = this.field1802[var5];
            }
            if (this.field1804[arg0] == -1) {
                class91.method1971(field1819[var2], field1819[var3], field1819[var4], field1783[var2], field1783[var3], field1783[var4], this.field1791[arg0], this.field1791[arg0], this.field1791[arg0], field1817[var6], field1817[var7], field1817[var8], field1818[var6], field1818[var7], field1818[var8], field1797[var6], field1797[var7], field1797[var8], this.field1786[arg0]);
            } else {
                class91.method1971(field1819[var2], field1819[var3], field1819[var4], field1783[var2], field1783[var3], field1783[var4], this.field1791[arg0], this.field1841[arg0], this.field1804[arg0], field1817[var6], field1817[var7], field1817[var8], field1818[var6], field1818[var7], field1818[var8], field1797[var6], field1797[var7], field1797[var8], this.field1786[arg0]);
            }
        } else if (this.field1804[arg0] == -1) {
            class91.method1969(field1819[var2], field1819[var3], field1819[var4], field1783[var2], field1783[var3], field1783[var4], field1823[this.field1791[arg0]]);
        } else {
            class91.method1967(field1819[var2], field1819[var3], field1819[var4], field1783[var2], field1783[var3], field1783[var4], this.field1791[arg0], this.field1841[arg0], this.field1804[arg0]);
        }
    }

    @ObfuscatedName("dq.r(I)V")
    public final void method2175(int arg0) {
        int var2 = Statics.field1570;
        int var3 = Statics.field1564;
        int var4 = 0;
        int var5 = this.field1788[arg0];
        int var6 = this.field1789[arg0];
        int var7 = this.field1790[arg0];
        int var8 = field1797[var5];
        int var9 = field1797[var6];
        int var10 = field1797[var7];
        if (this.field1795 == null) {
            class91.field1550 = 0;
        } else {
            class91.field1550 = this.field1795[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1828[var4] = field1783[var5];
            field1829[var4] = field1819[var5];
            field1830[var4++] = this.field1791[arg0];
        } else {
            int var11 = field1817[var5];
            int var12 = field1818[var5];
            int var13 = this.field1791[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1835[var10 - var8];
                field1828[var4] = (((field1817[var7] - var11) * var14 >> 16) + var11) * class91.field1555 / 50 + var2;
                field1829[var4] = (((field1818[var7] - var12) * var14 >> 16) + var12) * class91.field1555 / 50 + var3;
                field1830[var4++] = ((this.field1804[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1835[var9 - var8];
                field1828[var4] = (((field1817[var6] - var11) * var15 >> 16) + var11) * class91.field1555 / 50 + var2;
                field1829[var4] = (((field1818[var6] - var12) * var15 >> 16) + var12) * class91.field1555 / 50 + var3;
                field1830[var4++] = ((this.field1841[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1828[var4] = field1783[var6];
            field1829[var4] = field1819[var6];
            field1830[var4++] = this.field1841[arg0];
        } else {
            int var16 = field1817[var6];
            int var17 = field1818[var6];
            int var18 = this.field1841[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1835[var8 - var9];
                field1828[var4] = (((field1817[var5] - var16) * var19 >> 16) + var16) * class91.field1555 / 50 + var2;
                field1829[var4] = (((field1818[var5] - var17) * var19 >> 16) + var17) * class91.field1555 / 50 + var3;
                field1830[var4++] = ((this.field1791[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1835[var10 - var9];
                field1828[var4] = (((field1817[var7] - var16) * var20 >> 16) + var16) * class91.field1555 / 50 + var2;
                field1829[var4] = (((field1818[var7] - var17) * var20 >> 16) + var17) * class91.field1555 / 50 + var3;
                field1830[var4++] = ((this.field1804[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1828[var4] = field1783[var7];
            field1829[var4] = field1819[var7];
            field1830[var4++] = this.field1804[arg0];
        } else {
            int var21 = field1817[var7];
            int var22 = field1818[var7];
            int var23 = this.field1804[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1835[var9 - var10];
                field1828[var4] = (((field1817[var6] - var21) * var24 >> 16) + var21) * class91.field1555 / 50 + var2;
                field1829[var4] = (((field1818[var6] - var22) * var24 >> 16) + var22) * class91.field1555 / 50 + var3;
                field1830[var4++] = ((this.field1841[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1835[var8 - var10];
                field1828[var4] = (((field1817[var5] - var21) * var25 >> 16) + var21) * class91.field1555 / 50 + var2;
                field1829[var4] = (((field1818[var5] - var22) * var25 >> 16) + var22) * class91.field1555 / 50 + var3;
                field1830[var4++] = ((this.field1791[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1828[0];
        int var27 = field1828[1];
        int var28 = field1828[2];
        int var29 = field1829[0];
        int var30 = field1829[1];
        int var31 = field1829[2];
        class91.field1549 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1558 || var27 > Statics.field1558 || var28 > Statics.field1558) {
                class91.field1549 = true;
            }
            if (this.field1786 != null && this.field1786[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1842 == null || this.field1842[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1842[arg0] & 0xFF;
                    var33 = this.field1800[var32];
                    var34 = this.field1801[var32];
                    var35 = this.field1802[var32];
                }
                if (this.field1804[arg0] == -1) {
                    class91.method1971(var29, var30, var31, var26, var27, var28, this.field1791[arg0], this.field1791[arg0], this.field1791[arg0], field1817[var33], field1817[var34], field1817[var35], field1818[var33], field1818[var34], field1818[var35], field1797[var33], field1797[var34], field1797[var35], this.field1786[arg0]);
                } else {
                    class91.method1971(var29, var30, var31, var26, var27, var28, field1830[0], field1830[1], field1830[2], field1817[var33], field1817[var34], field1817[var35], field1818[var33], field1818[var34], field1818[var35], field1797[var33], field1797[var34], field1797[var35], this.field1786[arg0]);
                }
            } else if (this.field1804[arg0] == -1) {
                class91.method1969(var29, var30, var31, var26, var27, var28, field1823[this.field1791[arg0]]);
            } else {
                class91.method1967(var29, var30, var31, var26, var27, var28, field1830[0], field1830[1], field1830[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1558 || var27 > Statics.field1558 || var28 > Statics.field1558 || field1828[3] < 0 || field1828[3] > Statics.field1558) {
            class91.field1549 = true;
        }
        if (this.field1786 != null && this.field1786[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1842 == null || this.field1842[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1842[arg0] & 0xFF;
                var37 = this.field1800[var36];
                var38 = this.field1801[var36];
                var39 = this.field1802[var36];
            }
            short var40 = this.field1786[arg0];
            if (this.field1804[arg0] == -1) {
                class91.method1971(var29, var30, var31, var26, var27, var28, this.field1791[arg0], this.field1791[arg0], this.field1791[arg0], field1817[var37], field1817[var38], field1817[var39], field1818[var37], field1818[var38], field1818[var39], field1797[var37], field1797[var38], field1797[var39], var40);
                class91.method1971(var29, var31, field1829[3], var26, var28, field1828[3], this.field1791[arg0], this.field1791[arg0], this.field1791[arg0], field1817[var37], field1817[var38], field1817[var39], field1818[var37], field1818[var38], field1818[var39], field1797[var37], field1797[var38], field1797[var39], var40);
            } else {
                class91.method1971(var29, var30, var31, var26, var27, var28, field1830[0], field1830[1], field1830[2], field1817[var37], field1817[var38], field1817[var39], field1818[var37], field1818[var38], field1818[var39], field1797[var37], field1797[var38], field1797[var39], var40);
                class91.method1971(var29, var31, field1829[3], var26, var28, field1828[3], field1830[0], field1830[2], field1830[3], field1817[var37], field1817[var38], field1817[var39], field1818[var37], field1818[var38], field1818[var39], field1797[var37], field1797[var38], field1797[var39], var40);
            }
        } else if (this.field1804[arg0] == -1) {
            int var41 = field1823[this.field1791[arg0]];
            class91.method1969(var29, var30, var31, var26, var27, var28, var41);
            class91.method1969(var29, var31, field1829[3], var26, var28, field1828[3], var41);
        } else {
            class91.method1967(var29, var30, var31, var26, var27, var28, field1830[0], field1830[1], field1830[2]);
            class91.method1967(var29, var31, field1829[3], var26, var28, field1828[3], field1830[0], field1830[2], field1830[3]);
        }
    }

    @ObfuscatedName("dq.b(IIIIIIII)Z")
    public final boolean method2176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
