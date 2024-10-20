package deob;

@ObfuscatedName("du")
public class class128 extends class142 {

    @ObfuscatedName("du.n")
    public int field1838 = 0;

    @ObfuscatedName("du.p")
    public int[] field1802;

    @ObfuscatedName("du.i")
    public int[] field1831;

    @ObfuscatedName("du.j")
    public int[] field1804;

    @ObfuscatedName("du.f")
    public int field1805 = 0;

    @ObfuscatedName("du.m")
    public int[] field1806;

    @ObfuscatedName("du.c")
    public int[] field1807;

    @ObfuscatedName("du.z")
    public int[] field1808;

    @ObfuscatedName("du.h")
    public byte[] field1809;

    @ObfuscatedName("du.g")
    public byte[] field1810;

    @ObfuscatedName("du.e")
    public byte[] field1811;

    @ObfuscatedName("du.o")
    public byte[] field1819;

    @ObfuscatedName("du.x")
    public short[] field1813;

    @ObfuscatedName("du.a")
    public short[] field1814;

    @ObfuscatedName("du.y")
    public byte field1832 = 0;

    @ObfuscatedName("du.r")
    public int field1816;

    @ObfuscatedName("du.b")
    public byte[] field1817;

    @ObfuscatedName("du.s")
    public short[] field1818;

    @ObfuscatedName("du.v")
    public short[] field1844;

    @ObfuscatedName("du.t")
    public short[] field1820;

    @ObfuscatedName("du.w")
    public short[] field1821;

    @ObfuscatedName("du.l")
    public short[] field1846;

    @ObfuscatedName("du.q")
    public short[] field1824;

    @ObfuscatedName("du.k")
    public short[] field1843;

    @ObfuscatedName("du.d")
    public short[] field1825;

    @ObfuscatedName("du.u")
    public short[] field1826;

    @ObfuscatedName("du.ae")
    public byte[] field1827;

    @ObfuscatedName("du.ao")
    public int[] field1828;

    @ObfuscatedName("du.ad")
    public int[] field1829;

    @ObfuscatedName("du.aa")
    public int[][] field1822;

    @ObfuscatedName("du.aw")
    public int[][] field1840;

    @ObfuscatedName("du.an")
    public class144[] field1812;

    @ObfuscatedName("du.al")
    public class136[] field1833;

    @ObfuscatedName("du.at")
    public class136[] field1834;

    @ObfuscatedName("du.au")
    public short field1803;

    @ObfuscatedName("du.ak")
    public short field1836;

    @ObfuscatedName("du.as")
    public boolean field1837 = false;

    @ObfuscatedName("du.ah")
    public int field1830;

    @ObfuscatedName("du.ab")
    public int field1839;

    @ObfuscatedName("du.am")
    public int field1801;

    @ObfuscatedName("du.ac")
    public int field1841;

    @ObfuscatedName("du.ax")
    public int field1842;

    @ObfuscatedName("du.av")
    public static int[] field1823 = new int[10000];

    @ObfuscatedName("du.aq")
    public static int[] field1815 = new int[10000];

    @ObfuscatedName("du.af")
    public static int field1845 = 0;

    @ObfuscatedName("du.ag")
    public static int[] field1835 = class137.field2020;

    @ObfuscatedName("du.ar")
    public static int[] field1847 = class137.field2044;

    public class128() {
    }

    @ObfuscatedName("du.n(Lis;II)Ldu;")
    public static class128 method2225(class236 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3880(arg1, arg2);
        return var3 == null ? null : new class128(var3);
    }

    public class128(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2227(arg0);
        } else {
            this.method2266(arg0);
        }
    }

    @ObfuscatedName("du.p([B)V")
    public void method2227(byte[] arg0) {
        class174 var2 = new class174(arg0);
        class174 var3 = new class174(arg0);
        class174 var4 = new class174(arg0);
        class174 var5 = new class174(arg0);
        class174 var6 = new class174(arg0);
        class174 var7 = new class174(arg0);
        class174 var8 = new class174(arg0);
        var2.field2400 = arg0.length - 23;
        int var9 = var2.method3065();
        int var10 = var2.method3065();
        int var11 = var2.method2925();
        int var12 = var2.method2925();
        int var13 = var2.method2925();
        int var14 = var2.method2925();
        int var15 = var2.method2925();
        int var16 = var2.method2925();
        int var17 = var2.method2925();
        int var18 = var2.method3065();
        int var19 = var2.method3065();
        int var20 = var2.method3065();
        int var21 = var2.method3065();
        int var22 = var2.method3065();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1817 = new byte[var11];
            var2.field2400 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1817[var26] = var2.method2922();
                if (var27 == 0) {
                    var23++;
                }
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
                if (var27 == 2) {
                    var25++;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 * 2 + var56;
        int var60 = var24 + var58;
        int var62 = var24 * 2 + var25 * 2 + var60;
        this.field1838 = var9;
        this.field1805 = var10;
        this.field1816 = var11;
        this.field1802 = new int[var9];
        this.field1831 = new int[var9];
        this.field1804 = new int[var9];
        this.field1806 = new int[var10];
        this.field1807 = new int[var10];
        this.field1808 = new int[var10];
        if (var17 == 1) {
            this.field1828 = new int[var9];
        }
        if (var12 == 1) {
            this.field1809 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1810 = new byte[var10];
        } else {
            this.field1832 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1811 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1829 = new int[var10];
        }
        if (var16 == 1) {
            this.field1814 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1819 = new byte[var10];
        }
        this.field1813 = new short[var10];
        if (var11 > 0) {
            this.field1818 = new short[var11];
            this.field1844 = new short[var11];
            this.field1820 = new short[var11];
            if (var24 > 0) {
                this.field1821 = new short[var24];
                this.field1846 = new short[var24];
                this.field1824 = new short[var24];
                this.field1843 = new short[var24];
                this.field1827 = new byte[var24];
                this.field1825 = new short[var24];
            }
            if (var25 > 0) {
                this.field1826 = new short[var25];
            }
        }
        var2.field2400 = var11;
        var3.field2400 = var44;
        var4.field2400 = var46;
        var5.field2400 = var48;
        var6.field2400 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2925();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2967();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2967();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2967();
            }
            this.field1802[var67] = var64 + var69;
            this.field1831[var67] = var65 + var70;
            this.field1804[var67] = var66 + var71;
            var64 = this.field1802[var67];
            var65 = this.field1831[var67];
            var66 = this.field1804[var67];
            if (var17 == 1) {
                this.field1828[var67] = var6.method2925();
            }
        }
        var2.field2400 = var42;
        var3.field2400 = var31;
        var4.field2400 = var34;
        var5.field2400 = var37;
        var6.field2400 = var35;
        var7.field2400 = var40;
        var8.field2400 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1813[var72] = (short) var2.method3065();
            if (var12 == 1) {
                this.field1809[var72] = var3.method2922();
            }
            if (var13 == 255) {
                this.field1810[var72] = var4.method2922();
            }
            if (var14 == 1) {
                this.field1811[var72] = var5.method2922();
            }
            if (var15 == 1) {
                this.field1829[var72] = var6.method2925();
            }
            if (var16 == 1) {
                this.field1814[var72] = (short) (var7.method3065() - 1);
            }
            if (this.field1819 != null && this.field1814[var72] != -1) {
                this.field1819[var72] = (byte) (var8.method2925() - 1);
            }
        }
        var2.field2400 = var33;
        var3.field2400 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2925();
            if (var78 == 1) {
                var73 = var2.method2967() + var76;
                var74 = var2.method2967() + var73;
                var75 = var2.method2967() + var74;
                var76 = var75;
                this.field1806[var77] = var73;
                this.field1807[var77] = var74;
                this.field1808[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2967() + var76;
                var76 = var75;
                this.field1806[var77] = var73;
                this.field1807[var77] = var74;
                this.field1808[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2967() + var76;
                var76 = var75;
                this.field1806[var77] = var73;
                this.field1807[var77] = var74;
                this.field1808[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2967() + var76;
                var76 = var75;
                this.field1806[var77] = var73;
                this.field1807[var77] = var81;
                this.field1808[var77] = var75;
            }
        }
        var2.field2400 = var50;
        var3.field2400 = var52;
        var4.field2400 = var54;
        var5.field2400 = var56;
        var6.field2400 = var58;
        var7.field2400 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1817[var82] & 0xFF;
            if (var83 == 0) {
                this.field1818[var82] = (short) var2.method3065();
                this.field1844[var82] = (short) var2.method3065();
                this.field1820[var82] = (short) var2.method3065();
            }
            if (var83 == 1) {
                this.field1818[var82] = (short) var3.method3065();
                this.field1844[var82] = (short) var3.method3065();
                this.field1820[var82] = (short) var3.method3065();
                this.field1821[var82] = (short) var4.method3065();
                this.field1846[var82] = (short) var4.method3065();
                this.field1824[var82] = (short) var4.method3065();
                this.field1843[var82] = (short) var5.method3065();
                this.field1827[var82] = var6.method2922();
                this.field1825[var82] = (short) var7.method3065();
            }
            if (var83 == 2) {
                this.field1818[var82] = (short) var3.method3065();
                this.field1844[var82] = (short) var3.method3065();
                this.field1820[var82] = (short) var3.method3065();
                this.field1821[var82] = (short) var4.method3065();
                this.field1846[var82] = (short) var4.method3065();
                this.field1824[var82] = (short) var4.method3065();
                this.field1843[var82] = (short) var5.method3065();
                this.field1827[var82] = var6.method2922();
                this.field1825[var82] = (short) var7.method3065();
                this.field1826[var82] = (short) var7.method3065();
            }
            if (var83 == 3) {
                this.field1818[var82] = (short) var3.method3065();
                this.field1844[var82] = (short) var3.method3065();
                this.field1820[var82] = (short) var3.method3065();
                this.field1821[var82] = (short) var4.method3065();
                this.field1846[var82] = (short) var4.method3065();
                this.field1824[var82] = (short) var4.method3065();
                this.field1843[var82] = (short) var5.method3065();
                this.field1827[var82] = var6.method2922();
                this.field1825[var82] = (short) var7.method3065();
            }
        }
        var2.field2400 = var62;
        int var84 = var2.method2925();
        if (var84 == 0) {
            return;
        }
        new class141();
        var2.method3065();
        var2.method3065();
        var2.method3065();
        var2.method3058();
    }

    @ObfuscatedName("du.j([B)V")
    public void method2266(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class174 var4 = new class174(arg0);
        class174 var5 = new class174(arg0);
        class174 var6 = new class174(arg0);
        class174 var7 = new class174(arg0);
        class174 var8 = new class174(arg0);
        var4.field2400 = arg0.length - 18;
        int var9 = var4.method3065();
        int var10 = var4.method3065();
        int var11 = var4.method2925();
        int var12 = var4.method2925();
        int var13 = var4.method2925();
        int var14 = var4.method2925();
        int var15 = var4.method2925();
        int var16 = var4.method2925();
        int var17 = var4.method3065();
        int var18 = var4.method3065();
        int var19 = var4.method3065();
        int var20 = var4.method3065();
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field1838 = var9;
        this.field1805 = var10;
        this.field1816 = var11;
        this.field1802 = new int[var9];
        this.field1831 = new int[var9];
        this.field1804 = new int[var9];
        this.field1806 = new int[var10];
        this.field1807 = new int[var10];
        this.field1808 = new int[var10];
        if (var11 > 0) {
            this.field1817 = new byte[var11];
            this.field1818 = new short[var11];
            this.field1844 = new short[var11];
            this.field1820 = new short[var11];
        }
        if (var16 == 1) {
            this.field1828 = new int[var9];
        }
        if (var12 == 1) {
            this.field1809 = new byte[var10];
            this.field1819 = new byte[var10];
            this.field1814 = new short[var10];
        }
        if (var13 == 255) {
            this.field1810 = new byte[var10];
        } else {
            this.field1832 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1811 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1829 = new int[var10];
        }
        this.field1813 = new short[var10];
        var4.field2400 = var21;
        var5.field2400 = var36;
        var6.field2400 = var38;
        var7.field2400 = var40;
        var8.field2400 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2925();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2967();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2967();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2967();
            }
            this.field1802[var46] = var43 + var48;
            this.field1831[var46] = var44 + var49;
            this.field1804[var46] = var45 + var50;
            var43 = this.field1802[var46];
            var44 = this.field1831[var46];
            var45 = this.field1804[var46];
            if (var16 == 1) {
                this.field1828[var46] = var8.method2925();
            }
        }
        var4.field2400 = var32;
        var5.field2400 = var28;
        var6.field2400 = var26;
        var7.field2400 = var30;
        var8.field2400 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1813[var51] = (short) var4.method3065();
            if (var12 == 1) {
                int var52 = var5.method2925();
                if ((var52 & 0x1) == 1) {
                    this.field1809[var51] = 1;
                    var2 = true;
                } else {
                    this.field1809[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1819[var51] = (byte) (var52 >> 2);
                    this.field1814[var51] = this.field1813[var51];
                    this.field1813[var51] = 127;
                    if (this.field1814[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1819[var51] = -1;
                    this.field1814[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1810[var51] = var6.method2922();
            }
            if (var14 == 1) {
                this.field1811[var51] = var7.method2922();
            }
            if (var15 == 1) {
                this.field1829[var51] = var8.method2925();
            }
        }
        var4.field2400 = var25;
        var5.field2400 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2925();
            if (var58 == 1) {
                var53 = var4.method2967() + var56;
                var54 = var4.method2967() + var53;
                var55 = var4.method2967() + var54;
                var56 = var55;
                this.field1806[var57] = var53;
                this.field1807[var57] = var54;
                this.field1808[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2967() + var56;
                var56 = var55;
                this.field1806[var57] = var53;
                this.field1807[var57] = var54;
                this.field1808[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2967() + var56;
                var56 = var55;
                this.field1806[var57] = var53;
                this.field1807[var57] = var54;
                this.field1808[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2967() + var56;
                var56 = var55;
                this.field1806[var57] = var53;
                this.field1807[var57] = var61;
                this.field1808[var57] = var55;
            }
        }
        var4.field2400 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1817[var62] = 0;
            this.field1818[var62] = (short) var4.method3065();
            this.field1844[var62] = (short) var4.method3065();
            this.field1820[var62] = (short) var4.method3065();
        }
        if (this.field1819 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1819[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1818[var65] & 0xFFFF) == this.field1806[var64] && (this.field1844[var65] & 0xFFFF) == this.field1807[var64] && (this.field1820[var65] & 0xFFFF) == this.field1808[var64]) {
                        this.field1819[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1819 = null;
            }
        }
        if (!var3) {
            this.field1814 = null;
        }
        if (!var2) {
            this.field1809 = null;
        }
    }

    public class128(class128[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1838 = 0;
        this.field1805 = 0;
        this.field1816 = 0;
        this.field1832 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class128 var10 = arg0[var9];
            if (var10 != null) {
                this.field1838 += var10.field1838;
                this.field1805 += var10.field1805;
                this.field1816 += var10.field1816;
                if (var10.field1810 == null) {
                    if (this.field1832 == -1) {
                        this.field1832 = var10.field1832;
                    }
                    if (this.field1832 != var10.field1832) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1809 != null;
                var5 |= var10.field1811 != null;
                var6 |= var10.field1829 != null;
                var7 |= var10.field1814 != null;
                var8 |= var10.field1819 != null;
            }
        }
        this.field1802 = new int[this.field1838];
        this.field1831 = new int[this.field1838];
        this.field1804 = new int[this.field1838];
        this.field1828 = new int[this.field1838];
        this.field1806 = new int[this.field1805];
        this.field1807 = new int[this.field1805];
        this.field1808 = new int[this.field1805];
        if (var3) {
            this.field1809 = new byte[this.field1805];
        }
        if (var4) {
            this.field1810 = new byte[this.field1805];
        }
        if (var5) {
            this.field1811 = new byte[this.field1805];
        }
        if (var6) {
            this.field1829 = new int[this.field1805];
        }
        if (var7) {
            this.field1814 = new short[this.field1805];
        }
        if (var8) {
            this.field1819 = new byte[this.field1805];
        }
        this.field1813 = new short[this.field1805];
        if (this.field1816 > 0) {
            this.field1817 = new byte[this.field1816];
            this.field1818 = new short[this.field1816];
            this.field1844 = new short[this.field1816];
            this.field1820 = new short[this.field1816];
            this.field1821 = new short[this.field1816];
            this.field1846 = new short[this.field1816];
            this.field1824 = new short[this.field1816];
            this.field1843 = new short[this.field1816];
            this.field1827 = new byte[this.field1816];
            this.field1825 = new short[this.field1816];
            this.field1826 = new short[this.field1816];
        }
        this.field1838 = 0;
        this.field1805 = 0;
        this.field1816 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class128 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1805; var13++) {
                    if (var3 && var12.field1809 != null) {
                        this.field1809[this.field1805] = var12.field1809[var13];
                    }
                    if (var4) {
                        if (var12.field1810 == null) {
                            this.field1810[this.field1805] = var12.field1832;
                        } else {
                            this.field1810[this.field1805] = var12.field1810[var13];
                        }
                    }
                    if (var5 && var12.field1811 != null) {
                        this.field1811[this.field1805] = var12.field1811[var13];
                    }
                    if (var6 && var12.field1829 != null) {
                        this.field1829[this.field1805] = var12.field1829[var13];
                    }
                    if (var7) {
                        if (var12.field1814 == null) {
                            this.field1814[this.field1805] = -1;
                        } else {
                            this.field1814[this.field1805] = var12.field1814[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1819 == null || var12.field1819[var13] == -1) {
                            this.field1819[this.field1805] = -1;
                        } else {
                            this.field1819[this.field1805] = (byte) (var12.field1819[var13] + this.field1816);
                        }
                    }
                    this.field1813[this.field1805] = var12.field1813[var13];
                    this.field1806[this.field1805] = this.method2258(var12, var12.field1806[var13]);
                    this.field1807[this.field1805] = this.method2258(var12, var12.field1807[var13]);
                    this.field1808[this.field1805] = this.method2258(var12, var12.field1808[var13]);
                    this.field1805++;
                }
                for (int var14 = 0; var14 < var12.field1816; var14++) {
                    byte var15 = this.field1817[this.field1816] = var12.field1817[var14];
                    if (var15 == 0) {
                        this.field1818[this.field1816] = (short) this.method2258(var12, var12.field1818[var14]);
                        this.field1844[this.field1816] = (short) this.method2258(var12, var12.field1844[var14]);
                        this.field1820[this.field1816] = (short) this.method2258(var12, var12.field1820[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1818[this.field1816] = var12.field1818[var14];
                        this.field1844[this.field1816] = var12.field1844[var14];
                        this.field1820[this.field1816] = var12.field1820[var14];
                        this.field1821[this.field1816] = var12.field1821[var14];
                        this.field1846[this.field1816] = var12.field1846[var14];
                        this.field1824[this.field1816] = var12.field1824[var14];
                        this.field1843[this.field1816] = var12.field1843[var14];
                        this.field1827[this.field1816] = var12.field1827[var14];
                        this.field1825[this.field1816] = var12.field1825[var14];
                    }
                    if (var15 == 2) {
                        this.field1826[this.field1816] = var12.field1826[var14];
                    }
                    this.field1816++;
                }
            }
        }
    }

    @ObfuscatedName("du.f(Ldu;I)I")
    public final int method2258(class128 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1802[arg1];
        int var5 = arg0.field1831[arg1];
        int var6 = arg0.field1804[arg1];
        for (int var7 = 0; var7 < this.field1838; var7++) {
            if (this.field1802[var7] == var4 && this.field1831[var7] == var5 && this.field1804[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1802[this.field1838] = var4;
            this.field1831[this.field1838] = var5;
            this.field1804[this.field1838] = var6;
            if (arg0.field1828 != null) {
                this.field1828[this.field1838] = arg0.field1828[arg1];
            }
            var3 = this.field1838++;
        }
        return var3;
    }

    public class128(class128 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1838 = arg0.field1838;
        this.field1805 = arg0.field1805;
        this.field1816 = arg0.field1816;
        if (arg1) {
            this.field1802 = arg0.field1802;
            this.field1831 = arg0.field1831;
            this.field1804 = arg0.field1804;
        } else {
            this.field1802 = new int[this.field1838];
            this.field1831 = new int[this.field1838];
            this.field1804 = new int[this.field1838];
            for (int var6 = 0; var6 < this.field1838; var6++) {
                this.field1802[var6] = arg0.field1802[var6];
                this.field1831[var6] = arg0.field1831[var6];
                this.field1804[var6] = arg0.field1804[var6];
            }
        }
        if (arg2) {
            this.field1813 = arg0.field1813;
        } else {
            this.field1813 = new short[this.field1805];
            for (int var7 = 0; var7 < this.field1805; var7++) {
                this.field1813[var7] = arg0.field1813[var7];
            }
        }
        if (arg3 || arg0.field1814 == null) {
            this.field1814 = arg0.field1814;
        } else {
            this.field1814 = new short[this.field1805];
            for (int var8 = 0; var8 < this.field1805; var8++) {
                this.field1814[var8] = arg0.field1814[var8];
            }
        }
        if (arg4) {
            this.field1811 = arg0.field1811;
        } else {
            this.field1811 = new byte[this.field1805];
            if (arg0.field1811 == null) {
                for (int var9 = 0; var9 < this.field1805; var9++) {
                    this.field1811[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1805; var10++) {
                    this.field1811[var10] = arg0.field1811[var10];
                }
            }
        }
        this.field1806 = arg0.field1806;
        this.field1807 = arg0.field1807;
        this.field1808 = arg0.field1808;
        this.field1809 = arg0.field1809;
        this.field1810 = arg0.field1810;
        this.field1819 = arg0.field1819;
        this.field1832 = arg0.field1832;
        this.field1817 = arg0.field1817;
        this.field1818 = arg0.field1818;
        this.field1844 = arg0.field1844;
        this.field1820 = arg0.field1820;
        this.field1821 = arg0.field1821;
        this.field1846 = arg0.field1846;
        this.field1824 = arg0.field1824;
        this.field1843 = arg0.field1843;
        this.field1827 = arg0.field1827;
        this.field1825 = arg0.field1825;
        this.field1826 = arg0.field1826;
        this.field1828 = arg0.field1828;
        this.field1829 = arg0.field1829;
        this.field1822 = arg0.field1822;
        this.field1840 = arg0.field1840;
        this.field1833 = arg0.field1833;
        this.field1812 = arg0.field1812;
        this.field1834 = arg0.field1834;
        this.field1803 = arg0.field1803;
        this.field1836 = arg0.field1836;
    }

    @ObfuscatedName("du.m()Ldu;")
    public class128 method2242() {
        class128 var1 = new class128();
        if (this.field1809 != null) {
            var1.field1809 = new byte[this.field1805];
            for (int var2 = 0; var2 < this.field1805; var2++) {
                var1.field1809[var2] = this.field1809[var2];
            }
        }
        var1.field1838 = this.field1838;
        var1.field1805 = this.field1805;
        var1.field1816 = this.field1816;
        var1.field1802 = this.field1802;
        var1.field1831 = this.field1831;
        var1.field1804 = this.field1804;
        var1.field1806 = this.field1806;
        var1.field1807 = this.field1807;
        var1.field1808 = this.field1808;
        var1.field1810 = this.field1810;
        var1.field1811 = this.field1811;
        var1.field1819 = this.field1819;
        var1.field1813 = this.field1813;
        var1.field1814 = this.field1814;
        var1.field1832 = this.field1832;
        var1.field1817 = this.field1817;
        var1.field1818 = this.field1818;
        var1.field1844 = this.field1844;
        var1.field1820 = this.field1820;
        var1.field1821 = this.field1821;
        var1.field1846 = this.field1846;
        var1.field1824 = this.field1824;
        var1.field1843 = this.field1843;
        var1.field1827 = this.field1827;
        var1.field1825 = this.field1825;
        var1.field1826 = this.field1826;
        var1.field1828 = this.field1828;
        var1.field1829 = this.field1829;
        var1.field1822 = this.field1822;
        var1.field1840 = this.field1840;
        var1.field1833 = this.field1833;
        var1.field1812 = this.field1812;
        var1.field1803 = this.field1803;
        var1.field1836 = this.field1836;
        return var1;
    }

    @ObfuscatedName("du.c([[IIIIZI)Ldu;")
    public class128 method2230(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2226();
        int var7 = this.field1839 + arg1;
        int var8 = this.field1801 + arg1;
        int var9 = this.field1842 + arg3;
        int var10 = this.field1841 + arg3;
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
        class128 var15;
        if (arg4) {
            var15 = new class128();
            var15.field1838 = this.field1838;
            var15.field1805 = this.field1805;
            var15.field1816 = this.field1816;
            var15.field1802 = this.field1802;
            var15.field1804 = this.field1804;
            var15.field1806 = this.field1806;
            var15.field1807 = this.field1807;
            var15.field1808 = this.field1808;
            var15.field1809 = this.field1809;
            var15.field1810 = this.field1810;
            var15.field1811 = this.field1811;
            var15.field1819 = this.field1819;
            var15.field1813 = this.field1813;
            var15.field1814 = this.field1814;
            var15.field1832 = this.field1832;
            var15.field1817 = this.field1817;
            var15.field1818 = this.field1818;
            var15.field1844 = this.field1844;
            var15.field1820 = this.field1820;
            var15.field1821 = this.field1821;
            var15.field1846 = this.field1846;
            var15.field1824 = this.field1824;
            var15.field1843 = this.field1843;
            var15.field1827 = this.field1827;
            var15.field1825 = this.field1825;
            var15.field1826 = this.field1826;
            var15.field1828 = this.field1828;
            var15.field1829 = this.field1829;
            var15.field1822 = this.field1822;
            var15.field1840 = this.field1840;
            var15.field1803 = this.field1803;
            var15.field1836 = this.field1836;
            var15.field1831 = new int[var15.field1838];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1838; var16++) {
                int var17 = this.field1802[var16] + arg1;
                int var18 = this.field1804[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1831[var16] = this.field1831[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1838; var26++) {
                int var27 = (-this.field1831[var26] << 16) / this.field2130;
                if (var27 < arg5) {
                    int var28 = this.field1802[var26] + arg1;
                    int var29 = this.field1804[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1831[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1831[var26];
                }
            }
        }
        var15.method2243();
        return var15;
    }

    @ObfuscatedName("du.z()V")
    public void method2249() {
        int var10002;
        if (this.field1828 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1838; var3++) {
                int var4 = this.field1828[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1822 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1822[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1838) {
                int var7 = this.field1828[var6];
                this.field1822[var7][var1[var7]++] = var6++;
            }
            this.field1828 = null;
        }
        if (this.field1829 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1805; var10++) {
            int var11 = this.field1829[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1840 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1840[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1805) {
            int var14 = this.field1829[var13];
            this.field1840[var14][var8[var14]++] = var13++;
        }
        this.field1829 = null;
    }

    @ObfuscatedName("du.h()V")
    public void method2234() {
        for (int var1 = 0; var1 < this.field1838; var1++) {
            int var2 = this.field1802[var1];
            this.field1802[var1] = this.field1804[var1];
            this.field1804[var1] = -var2;
        }
        this.method2243();
    }

    @ObfuscatedName("du.g()V")
    public void method2235() {
        for (int var1 = 0; var1 < this.field1838; var1++) {
            this.field1802[var1] = -this.field1802[var1];
            this.field1804[var1] = -this.field1804[var1];
        }
        this.method2243();
    }

    @ObfuscatedName("du.e()V")
    public void method2224() {
        for (int var1 = 0; var1 < this.field1838; var1++) {
            int var2 = this.field1804[var1];
            this.field1804[var1] = this.field1802[var1];
            this.field1802[var1] = -var2;
        }
        this.method2243();
    }

    @ObfuscatedName("du.o(I)V")
    public void method2231(int arg0) {
        int var2 = field1835[arg0];
        int var3 = field1847[arg0];
        for (int var4 = 0; var4 < this.field1838; var4++) {
            int var5 = this.field1804[var4] * var2 + this.field1802[var4] * var3 >> 16;
            this.field1804[var4] = this.field1804[var4] * var3 - this.field1802[var4] * var2 >> 16;
            this.field1802[var4] = var5;
        }
        this.method2243();
    }

    @ObfuscatedName("du.x(III)V")
    public void method2237(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1838; var4++) {
            this.field1802[var4] += arg0;
            this.field1831[var4] += arg1;
            this.field1804[var4] += arg2;
        }
        this.method2243();
    }

    @ObfuscatedName("du.y(SS)V")
    public void method2299(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1805; var3++) {
            if (this.field1813[var3] == arg0) {
                this.field1813[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("du.r(SS)V")
    public void method2239(short arg0, short arg1) {
        if (this.field1814 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1805; var3++) {
            if (this.field1814[var3] == arg0) {
                this.field1814[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("du.b()V")
    public void method2240() {
        for (int var1 = 0; var1 < this.field1838; var1++) {
            this.field1804[var1] = -this.field1804[var1];
        }
        for (int var2 = 0; var2 < this.field1805; var2++) {
            int var3 = this.field1806[var2];
            this.field1806[var2] = this.field1808[var2];
            this.field1808[var2] = var3;
        }
        this.method2243();
    }

    @ObfuscatedName("du.s(III)V")
    public void method2241(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1838; var4++) {
            this.field1802[var4] = this.field1802[var4] * arg0 / 128;
            this.field1831[var4] = this.field1831[var4] * arg1 / 128;
            this.field1804[var4] = this.field1804[var4] * arg2 / 128;
        }
        this.method2243();
    }

    @ObfuscatedName("du.v()V")
    public void method2261() {
        if (this.field1833 != null) {
            return;
        }
        this.field1833 = new class136[this.field1838];
        for (int var1 = 0; var1 < this.field1838; var1++) {
            this.field1833[var1] = new class136();
        }
        for (int var2 = 0; var2 < this.field1805; var2++) {
            int var3 = this.field1806[var2];
            int var4 = this.field1807[var2];
            int var5 = this.field1808[var2];
            int var6 = this.field1802[var4] - this.field1802[var3];
            int var7 = this.field1831[var4] - this.field1831[var3];
            int var8 = this.field1804[var4] - this.field1804[var3];
            int var9 = this.field1802[var5] - this.field1802[var3];
            int var10 = this.field1831[var5] - this.field1831[var3];
            int var11 = this.field1804[var5] - this.field1804[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field1809 == null) {
                var19 = 0;
            } else {
                var19 = this.field1809[var2];
            }
            if (var19 == 0) {
                class136 var20 = this.field1833[var3];
                var20.field2014 += var16;
                var20.field2015 += var17;
                var20.field2019 += var18;
                var20.field2013++;
                class136 var21 = this.field1833[var4];
                var21.field2014 += var16;
                var21.field2015 += var17;
                var21.field2019 += var18;
                var21.field2013++;
                class136 var22 = this.field1833[var5];
                var22.field2014 += var16;
                var22.field2015 += var17;
                var22.field2019 += var18;
                var22.field2013++;
            } else if (var19 == 1) {
                if (this.field1812 == null) {
                    this.field1812 = new class144[this.field1805];
                }
                class144 var23 = this.field1812[var2] = new class144();
                var23.field2143 = var16;
                var23.field2144 = var17;
                var23.field2145 = var18;
            }
        }
    }

    @ObfuscatedName("du.t()V")
    public void method2243() {
        this.field1833 = null;
        this.field1834 = null;
        this.field1812 = null;
        this.field1837 = false;
    }

    @ObfuscatedName("du.w()V")
    public void method2226() {
        if (this.field1837) {
            return;
        }
        this.field2130 = 0;
        this.field1830 = 0;
        this.field1839 = 999999;
        this.field1801 = -999999;
        this.field1841 = -99999;
        this.field1842 = 99999;
        for (int var1 = 0; var1 < this.field1838; var1++) {
            int var2 = this.field1802[var1];
            int var3 = this.field1831[var1];
            int var4 = this.field1804[var1];
            if (var2 < this.field1839) {
                this.field1839 = var2;
            }
            if (var2 > this.field1801) {
                this.field1801 = var2;
            }
            if (var4 < this.field1842) {
                this.field1842 = var4;
            }
            if (var4 > this.field1841) {
                this.field1841 = var4;
            }
            if (-var3 > this.field2130) {
                this.field2130 = -var3;
            }
            if (var3 > this.field1830) {
                this.field1830 = var3;
            }
        }
        this.field1837 = true;
    }

    @ObfuscatedName("du.u(Ldu;Ldu;IIIZ)V")
    public static void method2294(class128 arg0, class128 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2226();
        arg0.method2261();
        arg1.method2226();
        arg1.method2261();
        field1845++;
        int var6 = 0;
        int[] var7 = arg1.field1802;
        int var8 = arg1.field1838;
        for (int var9 = 0; var9 < arg0.field1838; var9++) {
            class136 var10 = arg0.field1833[var9];
            if (var10.field2013 != 0) {
                int var11 = arg0.field1831[var9] - arg3;
                if (var11 <= arg1.field1830) {
                    int var12 = arg0.field1802[var9] - arg2;
                    if (var12 >= arg1.field1839 && var12 <= arg1.field1801) {
                        int var13 = arg0.field1804[var9] - arg4;
                        if (var13 >= arg1.field1842 && var13 <= arg1.field1841) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class136 var15 = arg1.field1833[var14];
                                if (var7[var14] == var12 && arg1.field1804[var14] == var13 && arg1.field1831[var14] == var11 && var15.field2013 != 0) {
                                    if (arg0.field1834 == null) {
                                        arg0.field1834 = new class136[arg0.field1838];
                                    }
                                    if (arg1.field1834 == null) {
                                        arg1.field1834 = new class136[var8];
                                    }
                                    class136 var16 = arg0.field1834[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1834[var9] = new class136(var10);
                                    }
                                    class136 var17 = arg1.field1834[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1834[var14] = new class136(var15);
                                    }
                                    var16.field2014 += var15.field2014;
                                    var16.field2015 += var15.field2015;
                                    var16.field2019 += var15.field2019;
                                    var16.field2013 += var15.field2013;
                                    var17.field2014 += var10.field2014;
                                    var17.field2015 += var10.field2015;
                                    var17.field2019 += var10.field2019;
                                    var17.field2013 += var10.field2013;
                                    var6++;
                                    field1823[var9] = field1845;
                                    field1815[var14] = field1845;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 < 3 || !arg5) {
            return;
        }
        for (int var18 = 0; var18 < arg0.field1805; var18++) {
            if (field1823[arg0.field1806[var18]] == field1845 && field1823[arg0.field1807[var18]] == field1845 && field1823[arg0.field1808[var18]] == field1845) {
                if (arg0.field1809 == null) {
                    arg0.field1809 = new byte[arg0.field1805];
                }
                arg0.field1809[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1805; var19++) {
            if (field1815[arg1.field1806[var19]] == field1845 && field1815[arg1.field1807[var19]] == field1845 && field1815[arg1.field1808[var19]] == field1845) {
                if (arg1.field1809 == null) {
                    arg1.field1809 = new byte[arg1.field1805];
                }
                arg1.field1809[var19] = 2;
            }
        }
    }

    @ObfuscatedName("du.aa(IIIII)Lek;")
    public final class134 method2246(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2261();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class134 var8 = new class134();
        var8.field1944 = new int[this.field1805];
        var8.field1977 = new int[this.field1805];
        var8.field1948 = new int[this.field1805];
        if (this.field1816 > 0 && this.field1819 != null) {
            int[] var9 = new int[this.field1816];
            for (int var10 = 0; var10 < this.field1805; var10++) {
                if (this.field1819[var10] != -1) {
                    var9[this.field1819[var10] & 0xFF]++;
                }
            }
            var8.field1952 = 0;
            for (int var11 = 0; var11 < this.field1816; var11++) {
                if (var9[var11] > 0 && this.field1817[var11] == 0) {
                    var8.field1952++;
                }
            }
            var8.field1953 = new int[var8.field1952];
            var8.field1978 = new int[var8.field1952];
            var8.field1955 = new int[var8.field1952];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1816; var13++) {
                if (var9[var13] > 0 && this.field1817[var13] == 0) {
                    var8.field1953[var12] = this.field1818[var13] & 0xFFFF;
                    var8.field1978[var12] = this.field1844[var13] & 0xFFFF;
                    var8.field1955[var12] = this.field1820[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1949 = new byte[this.field1805];
            for (int var14 = 0; var14 < this.field1805; var14++) {
                if (this.field1819[var14] == -1) {
                    var8.field1949[var14] = -1;
                } else {
                    var8.field1949[var14] = (byte) var9[this.field1819[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1805; var15++) {
            byte var16;
            if (this.field1809 == null) {
                var16 = 0;
            } else {
                var16 = this.field1809[var15];
            }
            byte var17;
            if (this.field1811 == null) {
                var17 = 0;
            } else {
                var17 = this.field1811[var15];
            }
            short var18;
            if (this.field1814 == null) {
                var18 = -1;
            } else {
                var18 = this.field1814[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1813[var15] & 0xFFFF;
                    class136 var20;
                    if (this.field1834 == null || this.field1834[this.field1806[var15]] == null) {
                        var20 = this.field1833[this.field1806[var15]];
                    } else {
                        var20 = this.field1834[this.field1806[var15]];
                    }
                    int var21 = (var20.field2019 * arg4 + var20.field2015 * arg3 + var20.field2014 * arg2) / (var20.field2013 * var7) + arg0;
                    var8.field1944[var15] = method2247(var19, var21);
                    class136 var22;
                    if (this.field1834 == null || this.field1834[this.field1807[var15]] == null) {
                        var22 = this.field1833[this.field1807[var15]];
                    } else {
                        var22 = this.field1834[this.field1807[var15]];
                    }
                    int var23 = (var22.field2019 * arg4 + var22.field2015 * arg3 + var22.field2014 * arg2) / (var22.field2013 * var7) + arg0;
                    var8.field1977[var15] = method2247(var19, var23);
                    class136 var24;
                    if (this.field1834 == null || this.field1834[this.field1808[var15]] == null) {
                        var24 = this.field1833[this.field1808[var15]];
                    } else {
                        var24 = this.field1834[this.field1808[var15]];
                    }
                    int var25 = (var24.field2019 * arg4 + var24.field2015 * arg3 + var24.field2014 * arg2) / (var24.field2013 * var7) + arg0;
                    var8.field1948[var15] = method2247(var19, var25);
                } else if (var16 == 1) {
                    class144 var26 = this.field1812[var15];
                    int var27 = (var26.field2145 * arg4 + var26.field2144 * arg3 + var26.field2143 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field1944[var15] = method2247(this.field1813[var15] & 0xFFFF, var27);
                    var8.field1948[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1944[var15] = 128;
                    var8.field1948[var15] = -1;
                } else {
                    var8.field1948[var15] = -2;
                }
            } else if (var16 == 0) {
                class136 var28;
                if (this.field1834 == null || this.field1834[this.field1806[var15]] == null) {
                    var28 = this.field1833[this.field1806[var15]];
                } else {
                    var28 = this.field1834[this.field1806[var15]];
                }
                int var29 = (var28.field2019 * arg4 + var28.field2015 * arg3 + var28.field2014 * arg2) / (var28.field2013 * var7) + arg0;
                var8.field1944[var15] = method2248(var29);
                class136 var30;
                if (this.field1834 == null || this.field1834[this.field1807[var15]] == null) {
                    var30 = this.field1833[this.field1807[var15]];
                } else {
                    var30 = this.field1834[this.field1807[var15]];
                }
                int var31 = (var30.field2019 * arg4 + var30.field2015 * arg3 + var30.field2014 * arg2) / (var30.field2013 * var7) + arg0;
                var8.field1977[var15] = method2248(var31);
                class136 var32;
                if (this.field1834 == null || this.field1834[this.field1808[var15]] == null) {
                    var32 = this.field1833[this.field1808[var15]];
                } else {
                    var32 = this.field1834[this.field1808[var15]];
                }
                int var33 = (var32.field2019 * arg4 + var32.field2015 * arg3 + var32.field2014 * arg2) / (var32.field2013 * var7) + arg0;
                var8.field1948[var15] = method2248(var33);
            } else if (var16 == 1) {
                class144 var34 = this.field1812[var15];
                int var35 = (var34.field2145 * arg4 + var34.field2144 * arg3 + var34.field2143 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field1944[var15] = method2248(var35);
                var8.field1948[var15] = -1;
            } else {
                var8.field1948[var15] = -2;
            }
        }
        this.method2249();
        var8.field1956 = this.field1838;
        var8.field1937 = this.field1802;
        var8.field1938 = this.field1831;
        var8.field1995 = this.field1804;
        var8.field1940 = this.field1805;
        var8.field1999 = this.field1806;
        var8.field1942 = this.field1807;
        var8.field1943 = this.field1808;
        var8.field1947 = this.field1810;
        var8.field1986 = this.field1811;
        var8.field1951 = this.field1832;
        var8.field1941 = this.field1822;
        var8.field1957 = this.field1840;
        var8.field1950 = this.field1814;
        return var8;
    }

    @ObfuscatedName("du.aw(II)I")
    public static final int method2247(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("du.an(I)I")
    public static final int method2248(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
