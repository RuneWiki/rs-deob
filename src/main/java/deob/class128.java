package deob;

@ObfuscatedName("do")
public class class128 extends class142 {

    @ObfuscatedName("do.i")
    public int field1827 = 0;

    @ObfuscatedName("do.w")
    public int[] field1803;

    @ObfuscatedName("do.a")
    public int[] field1836;

    @ObfuscatedName("do.t")
    public int[] field1829;

    @ObfuscatedName("do.s")
    public int field1806 = 0;

    @ObfuscatedName("do.r")
    public int[] field1807;

    @ObfuscatedName("do.v")
    public int[] field1823;

    @ObfuscatedName("do.y")
    public int[] field1844;

    @ObfuscatedName("do.j")
    public byte[] field1840;

    @ObfuscatedName("do.k")
    public byte[] field1811;

    @ObfuscatedName("do.e")
    public byte[] field1812;

    @ObfuscatedName("do.o")
    public byte[] field1813;

    @ObfuscatedName("do.z")
    public short[] field1814;

    @ObfuscatedName("do.l")
    public short[] field1815;

    @ObfuscatedName("do.c")
    public byte field1816 = 0;

    @ObfuscatedName("do.m")
    public int field1828;

    @ObfuscatedName("do.b")
    public byte[] field1833;

    @ObfuscatedName("do.f")
    public short[] field1819;

    @ObfuscatedName("do.n")
    public short[] field1842;

    @ObfuscatedName("do.u")
    public short[] field1821;

    @ObfuscatedName("do.p")
    public short[] field1822;

    @ObfuscatedName("do.q")
    public short[] field1820;

    @ObfuscatedName("do.d")
    public short[] field1804;

    @ObfuscatedName("do.h")
    public short[] field1817;

    @ObfuscatedName("do.g")
    public short[] field1826;

    @ObfuscatedName("do.x")
    public short[] field1810;

    @ObfuscatedName("do.ah")
    public byte[] field1805;

    @ObfuscatedName("do.ab")
    public int[] field1808;

    @ObfuscatedName("do.aw")
    public int[] field1830;

    @ObfuscatedName("do.ai")
    public int[][] field1831;

    @ObfuscatedName("do.an")
    public int[][] field1832;

    @ObfuscatedName("do.au")
    public class144[] field1818;

    @ObfuscatedName("do.ar")
    public class136[] field1825;

    @ObfuscatedName("do.ay")
    public class136[] field1835;

    @ObfuscatedName("do.ao")
    public short field1802;

    @ObfuscatedName("do.as")
    public short field1837;

    @ObfuscatedName("do.ak")
    public boolean field1838 = false;

    @ObfuscatedName("do.aq")
    public int field1839;

    @ObfuscatedName("do.ax")
    public int field1809;

    @ObfuscatedName("do.ac")
    public int field1841;

    @ObfuscatedName("do.at")
    public int field1834;

    @ObfuscatedName("do.av")
    public int field1843;

    @ObfuscatedName("do.aa")
    public static int[] field1824 = new int[10000];

    @ObfuscatedName("do.am")
    public static int[] field1845 = new int[10000];

    @ObfuscatedName("do.az")
    public static int field1846 = 0;

    @ObfuscatedName("do.al")
    public static int[] field1847 = class137.field2046;

    @ObfuscatedName("do.ad")
    public static int[] field1848 = class137.field2023;

    public class128() {
    }

    @ObfuscatedName("do.i(Liq;II)Ldo;")
    public static class128 method2190(class236 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3768(arg1, arg2);
        return var3 == null ? null : new class128(var3);
    }

    public class128(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2187(arg0);
        } else {
            this.method2186(arg0);
        }
    }

    @ObfuscatedName("do.w([B)V")
    public void method2187(byte[] arg0) {
        class174 var2 = new class174(arg0);
        class174 var3 = new class174(arg0);
        class174 var4 = new class174(arg0);
        class174 var5 = new class174(arg0);
        class174 var6 = new class174(arg0);
        class174 var7 = new class174(arg0);
        class174 var8 = new class174(arg0);
        var2.field2399 = arg0.length - 23;
        int var9 = var2.method2882();
        int var10 = var2.method2882();
        int var11 = var2.method3061();
        int var12 = var2.method3061();
        int var13 = var2.method3061();
        int var14 = var2.method3061();
        int var15 = var2.method3061();
        int var16 = var2.method3061();
        int var17 = var2.method3061();
        int var18 = var2.method2882();
        int var19 = var2.method2882();
        int var20 = var2.method2882();
        int var21 = var2.method2882();
        int var22 = var2.method2882();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1833 = new byte[var11];
            var2.field2399 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1833[var26] = var2.method2930();
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
        this.field1827 = var9;
        this.field1806 = var10;
        this.field1828 = var11;
        this.field1803 = new int[var9];
        this.field1836 = new int[var9];
        this.field1829 = new int[var9];
        this.field1807 = new int[var10];
        this.field1823 = new int[var10];
        this.field1844 = new int[var10];
        if (var17 == 1) {
            this.field1808 = new int[var9];
        }
        if (var12 == 1) {
            this.field1840 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1811 = new byte[var10];
        } else {
            this.field1816 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1812 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1830 = new int[var10];
        }
        if (var16 == 1) {
            this.field1815 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1813 = new byte[var10];
        }
        this.field1814 = new short[var10];
        if (var11 > 0) {
            this.field1819 = new short[var11];
            this.field1842 = new short[var11];
            this.field1821 = new short[var11];
            if (var24 > 0) {
                this.field1822 = new short[var24];
                this.field1820 = new short[var24];
                this.field1804 = new short[var24];
                this.field1817 = new short[var24];
                this.field1805 = new byte[var24];
                this.field1826 = new short[var24];
            }
            if (var25 > 0) {
                this.field1810 = new short[var25];
            }
        }
        var2.field2399 = var11;
        var3.field2399 = var44;
        var4.field2399 = var46;
        var5.field2399 = var48;
        var6.field2399 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method3061();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2892();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2892();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2892();
            }
            this.field1803[var67] = var64 + var69;
            this.field1836[var67] = var65 + var70;
            this.field1829[var67] = var66 + var71;
            var64 = this.field1803[var67];
            var65 = this.field1836[var67];
            var66 = this.field1829[var67];
            if (var17 == 1) {
                this.field1808[var67] = var6.method3061();
            }
        }
        var2.field2399 = var42;
        var3.field2399 = var31;
        var4.field2399 = var34;
        var5.field2399 = var37;
        var6.field2399 = var35;
        var7.field2399 = var40;
        var8.field2399 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1814[var72] = (short) var2.method2882();
            if (var12 == 1) {
                this.field1840[var72] = var3.method2930();
            }
            if (var13 == 255) {
                this.field1811[var72] = var4.method2930();
            }
            if (var14 == 1) {
                this.field1812[var72] = var5.method2930();
            }
            if (var15 == 1) {
                this.field1830[var72] = var6.method3061();
            }
            if (var16 == 1) {
                this.field1815[var72] = (short) (var7.method2882() - 1);
            }
            if (this.field1813 != null && this.field1815[var72] != -1) {
                this.field1813[var72] = (byte) (var8.method3061() - 1);
            }
        }
        var2.field2399 = var33;
        var3.field2399 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method3061();
            if (var78 == 1) {
                var73 = var2.method2892() + var76;
                var74 = var2.method2892() + var73;
                var75 = var2.method2892() + var74;
                var76 = var75;
                this.field1807[var77] = var73;
                this.field1823[var77] = var74;
                this.field1844[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2892() + var76;
                var76 = var75;
                this.field1807[var77] = var73;
                this.field1823[var77] = var74;
                this.field1844[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2892() + var76;
                var76 = var75;
                this.field1807[var77] = var73;
                this.field1823[var77] = var74;
                this.field1844[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2892() + var76;
                var76 = var75;
                this.field1807[var77] = var73;
                this.field1823[var77] = var81;
                this.field1844[var77] = var75;
            }
        }
        var2.field2399 = var50;
        var3.field2399 = var52;
        var4.field2399 = var54;
        var5.field2399 = var56;
        var6.field2399 = var58;
        var7.field2399 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1833[var82] & 0xFF;
            if (var83 == 0) {
                this.field1819[var82] = (short) var2.method2882();
                this.field1842[var82] = (short) var2.method2882();
                this.field1821[var82] = (short) var2.method2882();
            }
            if (var83 == 1) {
                this.field1819[var82] = (short) var3.method2882();
                this.field1842[var82] = (short) var3.method2882();
                this.field1821[var82] = (short) var3.method2882();
                this.field1822[var82] = (short) var4.method2882();
                this.field1820[var82] = (short) var4.method2882();
                this.field1804[var82] = (short) var4.method2882();
                this.field1817[var82] = (short) var5.method2882();
                this.field1805[var82] = var6.method2930();
                this.field1826[var82] = (short) var7.method2882();
            }
            if (var83 == 2) {
                this.field1819[var82] = (short) var3.method2882();
                this.field1842[var82] = (short) var3.method2882();
                this.field1821[var82] = (short) var3.method2882();
                this.field1822[var82] = (short) var4.method2882();
                this.field1820[var82] = (short) var4.method2882();
                this.field1804[var82] = (short) var4.method2882();
                this.field1817[var82] = (short) var5.method2882();
                this.field1805[var82] = var6.method2930();
                this.field1826[var82] = (short) var7.method2882();
                this.field1810[var82] = (short) var7.method2882();
            }
            if (var83 == 3) {
                this.field1819[var82] = (short) var3.method2882();
                this.field1842[var82] = (short) var3.method2882();
                this.field1821[var82] = (short) var3.method2882();
                this.field1822[var82] = (short) var4.method2882();
                this.field1820[var82] = (short) var4.method2882();
                this.field1804[var82] = (short) var4.method2882();
                this.field1817[var82] = (short) var5.method2882();
                this.field1805[var82] = var6.method2930();
                this.field1826[var82] = (short) var7.method2882();
            }
        }
        var2.field2399 = var62;
        int var84 = var2.method3061();
        if (var84 == 0) {
            return;
        }
        new class141();
        var2.method2882();
        var2.method2882();
        var2.method2882();
        var2.method2885();
    }

    @ObfuscatedName("do.t([B)V")
    public void method2186(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class174 var4 = new class174(arg0);
        class174 var5 = new class174(arg0);
        class174 var6 = new class174(arg0);
        class174 var7 = new class174(arg0);
        class174 var8 = new class174(arg0);
        var4.field2399 = arg0.length - 18;
        int var9 = var4.method2882();
        int var10 = var4.method2882();
        int var11 = var4.method3061();
        int var12 = var4.method3061();
        int var13 = var4.method3061();
        int var14 = var4.method3061();
        int var15 = var4.method3061();
        int var16 = var4.method3061();
        int var17 = var4.method2882();
        int var18 = var4.method2882();
        int var19 = var4.method2882();
        int var20 = var4.method2882();
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
        this.field1827 = var9;
        this.field1806 = var10;
        this.field1828 = var11;
        this.field1803 = new int[var9];
        this.field1836 = new int[var9];
        this.field1829 = new int[var9];
        this.field1807 = new int[var10];
        this.field1823 = new int[var10];
        this.field1844 = new int[var10];
        if (var11 > 0) {
            this.field1833 = new byte[var11];
            this.field1819 = new short[var11];
            this.field1842 = new short[var11];
            this.field1821 = new short[var11];
        }
        if (var16 == 1) {
            this.field1808 = new int[var9];
        }
        if (var12 == 1) {
            this.field1840 = new byte[var10];
            this.field1813 = new byte[var10];
            this.field1815 = new short[var10];
        }
        if (var13 == 255) {
            this.field1811 = new byte[var10];
        } else {
            this.field1816 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1812 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1830 = new int[var10];
        }
        this.field1814 = new short[var10];
        var4.field2399 = var21;
        var5.field2399 = var36;
        var6.field2399 = var38;
        var7.field2399 = var40;
        var8.field2399 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method3061();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2892();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2892();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2892();
            }
            this.field1803[var46] = var43 + var48;
            this.field1836[var46] = var44 + var49;
            this.field1829[var46] = var45 + var50;
            var43 = this.field1803[var46];
            var44 = this.field1836[var46];
            var45 = this.field1829[var46];
            if (var16 == 1) {
                this.field1808[var46] = var8.method3061();
            }
        }
        var4.field2399 = var32;
        var5.field2399 = var28;
        var6.field2399 = var26;
        var7.field2399 = var30;
        var8.field2399 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1814[var51] = (short) var4.method2882();
            if (var12 == 1) {
                int var52 = var5.method3061();
                if ((var52 & 0x1) == 1) {
                    this.field1840[var51] = 1;
                    var2 = true;
                } else {
                    this.field1840[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1813[var51] = (byte) (var52 >> 2);
                    this.field1815[var51] = this.field1814[var51];
                    this.field1814[var51] = 127;
                    if (this.field1815[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1813[var51] = -1;
                    this.field1815[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1811[var51] = var6.method2930();
            }
            if (var14 == 1) {
                this.field1812[var51] = var7.method2930();
            }
            if (var15 == 1) {
                this.field1830[var51] = var8.method3061();
            }
        }
        var4.field2399 = var25;
        var5.field2399 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method3061();
            if (var58 == 1) {
                var53 = var4.method2892() + var56;
                var54 = var4.method2892() + var53;
                var55 = var4.method2892() + var54;
                var56 = var55;
                this.field1807[var57] = var53;
                this.field1823[var57] = var54;
                this.field1844[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2892() + var56;
                var56 = var55;
                this.field1807[var57] = var53;
                this.field1823[var57] = var54;
                this.field1844[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2892() + var56;
                var56 = var55;
                this.field1807[var57] = var53;
                this.field1823[var57] = var54;
                this.field1844[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2892() + var56;
                var56 = var55;
                this.field1807[var57] = var53;
                this.field1823[var57] = var61;
                this.field1844[var57] = var55;
            }
        }
        var4.field2399 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1833[var62] = 0;
            this.field1819[var62] = (short) var4.method2882();
            this.field1842[var62] = (short) var4.method2882();
            this.field1821[var62] = (short) var4.method2882();
        }
        if (this.field1813 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1813[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1819[var65] & 0xFFFF) == this.field1807[var64] && (this.field1842[var65] & 0xFFFF) == this.field1823[var64] && (this.field1821[var65] & 0xFFFF) == this.field1844[var64]) {
                        this.field1813[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1813 = null;
            }
        }
        if (!var3) {
            this.field1815 = null;
        }
        if (!var2) {
            this.field1840 = null;
        }
    }

    public class128(class128[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1827 = 0;
        this.field1806 = 0;
        this.field1828 = 0;
        this.field1816 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class128 var10 = arg0[var9];
            if (var10 != null) {
                this.field1827 += var10.field1827;
                this.field1806 += var10.field1806;
                this.field1828 += var10.field1828;
                if (var10.field1811 == null) {
                    if (this.field1816 == -1) {
                        this.field1816 = var10.field1816;
                    }
                    if (this.field1816 != var10.field1816) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1840 != null;
                var5 |= var10.field1812 != null;
                var6 |= var10.field1830 != null;
                var7 |= var10.field1815 != null;
                var8 |= var10.field1813 != null;
            }
        }
        this.field1803 = new int[this.field1827];
        this.field1836 = new int[this.field1827];
        this.field1829 = new int[this.field1827];
        this.field1808 = new int[this.field1827];
        this.field1807 = new int[this.field1806];
        this.field1823 = new int[this.field1806];
        this.field1844 = new int[this.field1806];
        if (var3) {
            this.field1840 = new byte[this.field1806];
        }
        if (var4) {
            this.field1811 = new byte[this.field1806];
        }
        if (var5) {
            this.field1812 = new byte[this.field1806];
        }
        if (var6) {
            this.field1830 = new int[this.field1806];
        }
        if (var7) {
            this.field1815 = new short[this.field1806];
        }
        if (var8) {
            this.field1813 = new byte[this.field1806];
        }
        this.field1814 = new short[this.field1806];
        if (this.field1828 > 0) {
            this.field1833 = new byte[this.field1828];
            this.field1819 = new short[this.field1828];
            this.field1842 = new short[this.field1828];
            this.field1821 = new short[this.field1828];
            this.field1822 = new short[this.field1828];
            this.field1820 = new short[this.field1828];
            this.field1804 = new short[this.field1828];
            this.field1817 = new short[this.field1828];
            this.field1805 = new byte[this.field1828];
            this.field1826 = new short[this.field1828];
            this.field1810 = new short[this.field1828];
        }
        this.field1827 = 0;
        this.field1806 = 0;
        this.field1828 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class128 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1806; var13++) {
                    if (var3 && var12.field1840 != null) {
                        this.field1840[this.field1806] = var12.field1840[var13];
                    }
                    if (var4) {
                        if (var12.field1811 == null) {
                            this.field1811[this.field1806] = var12.field1816;
                        } else {
                            this.field1811[this.field1806] = var12.field1811[var13];
                        }
                    }
                    if (var5 && var12.field1812 != null) {
                        this.field1812[this.field1806] = var12.field1812[var13];
                    }
                    if (var6 && var12.field1830 != null) {
                        this.field1830[this.field1806] = var12.field1830[var13];
                    }
                    if (var7) {
                        if (var12.field1815 == null) {
                            this.field1815[this.field1806] = -1;
                        } else {
                            this.field1815[this.field1806] = var12.field1815[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1813 == null || var12.field1813[var13] == -1) {
                            this.field1813[this.field1806] = -1;
                        } else {
                            this.field1813[this.field1806] = (byte) (var12.field1813[var13] + this.field1828);
                        }
                    }
                    this.field1814[this.field1806] = var12.field1814[var13];
                    this.field1807[this.field1806] = this.method2232(var12, var12.field1807[var13]);
                    this.field1823[this.field1806] = this.method2232(var12, var12.field1823[var13]);
                    this.field1844[this.field1806] = this.method2232(var12, var12.field1844[var13]);
                    this.field1806++;
                }
                for (int var14 = 0; var14 < var12.field1828; var14++) {
                    byte var15 = this.field1833[this.field1828] = var12.field1833[var14];
                    if (var15 == 0) {
                        this.field1819[this.field1828] = (short) this.method2232(var12, var12.field1819[var14]);
                        this.field1842[this.field1828] = (short) this.method2232(var12, var12.field1842[var14]);
                        this.field1821[this.field1828] = (short) this.method2232(var12, var12.field1821[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1819[this.field1828] = var12.field1819[var14];
                        this.field1842[this.field1828] = var12.field1842[var14];
                        this.field1821[this.field1828] = var12.field1821[var14];
                        this.field1822[this.field1828] = var12.field1822[var14];
                        this.field1820[this.field1828] = var12.field1820[var14];
                        this.field1804[this.field1828] = var12.field1804[var14];
                        this.field1817[this.field1828] = var12.field1817[var14];
                        this.field1805[this.field1828] = var12.field1805[var14];
                        this.field1826[this.field1828] = var12.field1826[var14];
                    }
                    if (var15 == 2) {
                        this.field1810[this.field1828] = var12.field1810[var14];
                    }
                    this.field1828++;
                }
            }
        }
    }

    @ObfuscatedName("do.s(Ldo;I)I")
    public final int method2232(class128 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1803[arg1];
        int var5 = arg0.field1836[arg1];
        int var6 = arg0.field1829[arg1];
        for (int var7 = 0; var7 < this.field1827; var7++) {
            if (this.field1803[var7] == var4 && this.field1836[var7] == var5 && this.field1829[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1803[this.field1827] = var4;
            this.field1836[this.field1827] = var5;
            this.field1829[this.field1827] = var6;
            if (arg0.field1808 != null) {
                this.field1808[this.field1827] = arg0.field1808[arg1];
            }
            var3 = this.field1827++;
        }
        return var3;
    }

    public class128(class128 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1827 = arg0.field1827;
        this.field1806 = arg0.field1806;
        this.field1828 = arg0.field1828;
        if (arg1) {
            this.field1803 = arg0.field1803;
            this.field1836 = arg0.field1836;
            this.field1829 = arg0.field1829;
        } else {
            this.field1803 = new int[this.field1827];
            this.field1836 = new int[this.field1827];
            this.field1829 = new int[this.field1827];
            for (int var6 = 0; var6 < this.field1827; var6++) {
                this.field1803[var6] = arg0.field1803[var6];
                this.field1836[var6] = arg0.field1836[var6];
                this.field1829[var6] = arg0.field1829[var6];
            }
        }
        if (arg2) {
            this.field1814 = arg0.field1814;
        } else {
            this.field1814 = new short[this.field1806];
            for (int var7 = 0; var7 < this.field1806; var7++) {
                this.field1814[var7] = arg0.field1814[var7];
            }
        }
        if (arg3 || arg0.field1815 == null) {
            this.field1815 = arg0.field1815;
        } else {
            this.field1815 = new short[this.field1806];
            for (int var8 = 0; var8 < this.field1806; var8++) {
                this.field1815[var8] = arg0.field1815[var8];
            }
        }
        if (arg4) {
            this.field1812 = arg0.field1812;
        } else {
            this.field1812 = new byte[this.field1806];
            if (arg0.field1812 == null) {
                for (int var9 = 0; var9 < this.field1806; var9++) {
                    this.field1812[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1806; var10++) {
                    this.field1812[var10] = arg0.field1812[var10];
                }
            }
        }
        this.field1807 = arg0.field1807;
        this.field1823 = arg0.field1823;
        this.field1844 = arg0.field1844;
        this.field1840 = arg0.field1840;
        this.field1811 = arg0.field1811;
        this.field1813 = arg0.field1813;
        this.field1816 = arg0.field1816;
        this.field1833 = arg0.field1833;
        this.field1819 = arg0.field1819;
        this.field1842 = arg0.field1842;
        this.field1821 = arg0.field1821;
        this.field1822 = arg0.field1822;
        this.field1820 = arg0.field1820;
        this.field1804 = arg0.field1804;
        this.field1817 = arg0.field1817;
        this.field1805 = arg0.field1805;
        this.field1826 = arg0.field1826;
        this.field1810 = arg0.field1810;
        this.field1808 = arg0.field1808;
        this.field1830 = arg0.field1830;
        this.field1831 = arg0.field1831;
        this.field1832 = arg0.field1832;
        this.field1825 = arg0.field1825;
        this.field1818 = arg0.field1818;
        this.field1835 = arg0.field1835;
        this.field1802 = arg0.field1802;
        this.field1837 = arg0.field1837;
    }

    @ObfuscatedName("do.r()Ldo;")
    public class128 method2191() {
        class128 var1 = new class128();
        if (this.field1840 != null) {
            var1.field1840 = new byte[this.field1806];
            for (int var2 = 0; var2 < this.field1806; var2++) {
                var1.field1840[var2] = this.field1840[var2];
            }
        }
        var1.field1827 = this.field1827;
        var1.field1806 = this.field1806;
        var1.field1828 = this.field1828;
        var1.field1803 = this.field1803;
        var1.field1836 = this.field1836;
        var1.field1829 = this.field1829;
        var1.field1807 = this.field1807;
        var1.field1823 = this.field1823;
        var1.field1844 = this.field1844;
        var1.field1811 = this.field1811;
        var1.field1812 = this.field1812;
        var1.field1813 = this.field1813;
        var1.field1814 = this.field1814;
        var1.field1815 = this.field1815;
        var1.field1816 = this.field1816;
        var1.field1833 = this.field1833;
        var1.field1819 = this.field1819;
        var1.field1842 = this.field1842;
        var1.field1821 = this.field1821;
        var1.field1822 = this.field1822;
        var1.field1820 = this.field1820;
        var1.field1804 = this.field1804;
        var1.field1817 = this.field1817;
        var1.field1805 = this.field1805;
        var1.field1826 = this.field1826;
        var1.field1810 = this.field1810;
        var1.field1808 = this.field1808;
        var1.field1830 = this.field1830;
        var1.field1831 = this.field1831;
        var1.field1832 = this.field1832;
        var1.field1825 = this.field1825;
        var1.field1818 = this.field1818;
        var1.field1802 = this.field1802;
        var1.field1837 = this.field1837;
        return var1;
    }

    @ObfuscatedName("do.v([[IIIIZI)Ldo;")
    public class128 method2243(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2204();
        int var7 = this.field1809 + arg1;
        int var8 = this.field1841 + arg1;
        int var9 = this.field1843 + arg3;
        int var10 = this.field1834 + arg3;
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
            var15.field1827 = this.field1827;
            var15.field1806 = this.field1806;
            var15.field1828 = this.field1828;
            var15.field1803 = this.field1803;
            var15.field1829 = this.field1829;
            var15.field1807 = this.field1807;
            var15.field1823 = this.field1823;
            var15.field1844 = this.field1844;
            var15.field1840 = this.field1840;
            var15.field1811 = this.field1811;
            var15.field1812 = this.field1812;
            var15.field1813 = this.field1813;
            var15.field1814 = this.field1814;
            var15.field1815 = this.field1815;
            var15.field1816 = this.field1816;
            var15.field1833 = this.field1833;
            var15.field1819 = this.field1819;
            var15.field1842 = this.field1842;
            var15.field1821 = this.field1821;
            var15.field1822 = this.field1822;
            var15.field1820 = this.field1820;
            var15.field1804 = this.field1804;
            var15.field1817 = this.field1817;
            var15.field1805 = this.field1805;
            var15.field1826 = this.field1826;
            var15.field1810 = this.field1810;
            var15.field1808 = this.field1808;
            var15.field1830 = this.field1830;
            var15.field1831 = this.field1831;
            var15.field1832 = this.field1832;
            var15.field1802 = this.field1802;
            var15.field1837 = this.field1837;
            var15.field1836 = new int[var15.field1827];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1827; var16++) {
                int var17 = this.field1803[var16] + arg1;
                int var18 = this.field1829[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1836[var16] = this.field1836[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1827; var26++) {
                int var27 = (-this.field1836[var26] << 16) / this.field2136;
                if (var27 < arg5) {
                    int var28 = this.field1803[var26] + arg1;
                    int var29 = this.field1829[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1836[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1836[var26];
                }
            }
        }
        var15.method2239();
        return var15;
    }

    @ObfuscatedName("do.y()V")
    public void method2184() {
        int var10002;
        if (this.field1808 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1827; var3++) {
                int var4 = this.field1808[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1831 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1831[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1827) {
                int var7 = this.field1808[var6];
                this.field1831[var7][var1[var7]++] = var6++;
            }
            this.field1808 = null;
        }
        if (this.field1830 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1806; var10++) {
            int var11 = this.field1830[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1832 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1832[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1806) {
            int var14 = this.field1830[var13];
            this.field1832[var14][var8[var14]++] = var13++;
        }
        this.field1830 = null;
    }

    @ObfuscatedName("do.j()V")
    public void method2194() {
        for (int var1 = 0; var1 < this.field1827; var1++) {
            int var2 = this.field1803[var1];
            this.field1803[var1] = this.field1829[var1];
            this.field1829[var1] = -var2;
        }
        this.method2239();
    }

    @ObfuscatedName("do.k()V")
    public void method2195() {
        for (int var1 = 0; var1 < this.field1827; var1++) {
            this.field1803[var1] = -this.field1803[var1];
            this.field1829[var1] = -this.field1829[var1];
        }
        this.method2239();
    }

    @ObfuscatedName("do.e()V")
    public void method2196() {
        for (int var1 = 0; var1 < this.field1827; var1++) {
            int var2 = this.field1829[var1];
            this.field1829[var1] = this.field1803[var1];
            this.field1803[var1] = -var2;
        }
        this.method2239();
    }

    @ObfuscatedName("do.o(I)V")
    public void method2197(int arg0) {
        int var2 = field1847[arg0];
        int var3 = field1848[arg0];
        for (int var4 = 0; var4 < this.field1827; var4++) {
            int var5 = this.field1829[var4] * var2 + this.field1803[var4] * var3 >> 16;
            this.field1829[var4] = this.field1829[var4] * var3 - this.field1803[var4] * var2 >> 16;
            this.field1803[var4] = var5;
        }
        this.method2239();
    }

    @ObfuscatedName("do.z(III)V")
    public void method2206(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1827; var4++) {
            this.field1803[var4] += arg0;
            this.field1836[var4] += arg1;
            this.field1829[var4] += arg2;
        }
        this.method2239();
    }

    @ObfuscatedName("do.l(SS)V")
    public void method2198(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1806; var3++) {
            if (this.field1814[var3] == arg0) {
                this.field1814[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("do.c(SS)V")
    public void method2226(short arg0, short arg1) {
        if (this.field1815 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1806; var3++) {
            if (this.field1815[var3] == arg0) {
                this.field1815[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("do.b()V")
    public void method2200() {
        for (int var1 = 0; var1 < this.field1827; var1++) {
            this.field1829[var1] = -this.field1829[var1];
        }
        for (int var2 = 0; var2 < this.field1806; var2++) {
            int var3 = this.field1807[var2];
            this.field1807[var2] = this.field1844[var2];
            this.field1844[var2] = var3;
        }
        this.method2239();
    }

    @ObfuscatedName("do.f(III)V")
    public void method2201(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1827; var4++) {
            this.field1803[var4] = this.field1803[var4] * arg0 / 128;
            this.field1836[var4] = this.field1836[var4] * arg1 / 128;
            this.field1829[var4] = this.field1829[var4] * arg2 / 128;
        }
        this.method2239();
    }

    @ObfuscatedName("do.n()V")
    public void method2202() {
        if (this.field1825 != null) {
            return;
        }
        this.field1825 = new class136[this.field1827];
        for (int var1 = 0; var1 < this.field1827; var1++) {
            this.field1825[var1] = new class136();
        }
        for (int var2 = 0; var2 < this.field1806; var2++) {
            int var3 = this.field1807[var2];
            int var4 = this.field1823[var2];
            int var5 = this.field1844[var2];
            int var6 = this.field1803[var4] - this.field1803[var3];
            int var7 = this.field1836[var4] - this.field1836[var3];
            int var8 = this.field1829[var4] - this.field1829[var3];
            int var9 = this.field1803[var5] - this.field1803[var3];
            int var10 = this.field1836[var5] - this.field1836[var3];
            int var11 = this.field1829[var5] - this.field1829[var3];
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
            if (this.field1840 == null) {
                var19 = 0;
            } else {
                var19 = this.field1840[var2];
            }
            if (var19 == 0) {
                class136 var20 = this.field1825[var3];
                var20.field2018 += var16;
                var20.field2017 += var17;
                var20.field2016 += var18;
                var20.field2019++;
                class136 var21 = this.field1825[var4];
                var21.field2018 += var16;
                var21.field2017 += var17;
                var21.field2016 += var18;
                var21.field2019++;
                class136 var22 = this.field1825[var5];
                var22.field2018 += var16;
                var22.field2017 += var17;
                var22.field2016 += var18;
                var22.field2019++;
            } else if (var19 == 1) {
                if (this.field1818 == null) {
                    this.field1818 = new class144[this.field1806];
                }
                class144 var23 = this.field1818[var2] = new class144();
                var23.field2155 = var16;
                var23.field2152 = var17;
                var23.field2153 = var18;
            }
        }
    }

    @ObfuscatedName("do.u()V")
    public void method2239() {
        this.field1825 = null;
        this.field1835 = null;
        this.field1818 = null;
        this.field1838 = false;
    }

    @ObfuscatedName("do.p()V")
    public void method2204() {
        if (this.field1838) {
            return;
        }
        this.field2136 = 0;
        this.field1839 = 0;
        this.field1809 = 999999;
        this.field1841 = -999999;
        this.field1834 = -99999;
        this.field1843 = 99999;
        for (int var1 = 0; var1 < this.field1827; var1++) {
            int var2 = this.field1803[var1];
            int var3 = this.field1836[var1];
            int var4 = this.field1829[var1];
            if (var2 < this.field1809) {
                this.field1809 = var2;
            }
            if (var2 > this.field1841) {
                this.field1841 = var2;
            }
            if (var4 < this.field1843) {
                this.field1843 = var4;
            }
            if (var4 > this.field1834) {
                this.field1834 = var4;
            }
            if (-var3 > this.field2136) {
                this.field2136 = -var3;
            }
            if (var3 > this.field1839) {
                this.field1839 = var3;
            }
        }
        this.field1838 = true;
    }

    @ObfuscatedName("do.q(Ldo;Ldo;IIIZ)V")
    public static void method2199(class128 arg0, class128 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2204();
        arg0.method2202();
        arg1.method2204();
        arg1.method2202();
        field1846++;
        int var6 = 0;
        int[] var7 = arg1.field1803;
        int var8 = arg1.field1827;
        for (int var9 = 0; var9 < arg0.field1827; var9++) {
            class136 var10 = arg0.field1825[var9];
            if (var10.field2019 != 0) {
                int var11 = arg0.field1836[var9] - arg3;
                if (var11 <= arg1.field1839) {
                    int var12 = arg0.field1803[var9] - arg2;
                    if (var12 >= arg1.field1809 && var12 <= arg1.field1841) {
                        int var13 = arg0.field1829[var9] - arg4;
                        if (var13 >= arg1.field1843 && var13 <= arg1.field1834) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class136 var15 = arg1.field1825[var14];
                                if (var7[var14] == var12 && arg1.field1829[var14] == var13 && arg1.field1836[var14] == var11 && var15.field2019 != 0) {
                                    if (arg0.field1835 == null) {
                                        arg0.field1835 = new class136[arg0.field1827];
                                    }
                                    if (arg1.field1835 == null) {
                                        arg1.field1835 = new class136[var8];
                                    }
                                    class136 var16 = arg0.field1835[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1835[var9] = new class136(var10);
                                    }
                                    class136 var17 = arg1.field1835[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1835[var14] = new class136(var15);
                                    }
                                    var16.field2018 += var15.field2018;
                                    var16.field2017 += var15.field2017;
                                    var16.field2016 += var15.field2016;
                                    var16.field2019 += var15.field2019;
                                    var17.field2018 += var10.field2018;
                                    var17.field2017 += var10.field2017;
                                    var17.field2016 += var10.field2016;
                                    var17.field2019 += var10.field2019;
                                    var6++;
                                    field1824[var9] = field1846;
                                    field1845[var14] = field1846;
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
        for (int var18 = 0; var18 < arg0.field1806; var18++) {
            if (field1824[arg0.field1807[var18]] == field1846 && field1824[arg0.field1823[var18]] == field1846 && field1824[arg0.field1844[var18]] == field1846) {
                if (arg0.field1840 == null) {
                    arg0.field1840 = new byte[arg0.field1806];
                }
                arg0.field1840[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1806; var19++) {
            if (field1845[arg1.field1807[var19]] == field1846 && field1845[arg1.field1823[var19]] == field1846 && field1845[arg1.field1844[var19]] == field1846) {
                if (arg1.field1840 == null) {
                    arg1.field1840 = new byte[arg1.field1806];
                }
                arg1.field1840[var19] = 2;
            }
        }
    }

    @ObfuscatedName("do.d(IIIII)Let;")
    public final class134 method2221(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2202();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class134 var8 = new class134();
        var8.field1944 = new int[this.field1806];
        var8.field1966 = new int[this.field1806];
        var8.field1946 = new int[this.field1806];
        if (this.field1828 > 0 && this.field1813 != null) {
            int[] var9 = new int[this.field1828];
            for (int var10 = 0; var10 < this.field1806; var10++) {
                if (this.field1813[var10] != -1) {
                    var9[this.field1813[var10] & 0xFF]++;
                }
            }
            var8.field1952 = 0;
            for (int var11 = 0; var11 < this.field1828; var11++) {
                if (var9[var11] > 0 && this.field1833[var11] == 0) {
                    var8.field1952++;
                }
            }
            var8.field1953 = new int[var8.field1952];
            var8.field1954 = new int[var8.field1952];
            var8.field1932 = new int[var8.field1952];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1828; var13++) {
                if (var9[var13] > 0 && this.field1833[var13] == 0) {
                    var8.field1953[var12] = this.field1819[var13] & 0xFFFF;
                    var8.field1954[var12] = this.field1842[var13] & 0xFFFF;
                    var8.field1932[var12] = this.field1821[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1945 = new byte[this.field1806];
            for (int var14 = 0; var14 < this.field1806; var14++) {
                if (this.field1813[var14] == -1) {
                    var8.field1945[var14] = -1;
                } else {
                    var8.field1945[var14] = (byte) var9[this.field1813[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1806; var15++) {
            byte var16;
            if (this.field1840 == null) {
                var16 = 0;
            } else {
                var16 = this.field1840[var15];
            }
            byte var17;
            if (this.field1812 == null) {
                var17 = 0;
            } else {
                var17 = this.field1812[var15];
            }
            short var18;
            if (this.field1815 == null) {
                var18 = -1;
            } else {
                var18 = this.field1815[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1814[var15] & 0xFFFF;
                    class136 var20;
                    if (this.field1835 == null || this.field1835[this.field1807[var15]] == null) {
                        var20 = this.field1825[this.field1807[var15]];
                    } else {
                        var20 = this.field1835[this.field1807[var15]];
                    }
                    int var21 = (var20.field2016 * arg4 + var20.field2018 * arg2 + var20.field2017 * arg3) / (var20.field2019 * var7) + arg0;
                    var8.field1944[var15] = method2207(var19, var21);
                    class136 var22;
                    if (this.field1835 == null || this.field1835[this.field1823[var15]] == null) {
                        var22 = this.field1825[this.field1823[var15]];
                    } else {
                        var22 = this.field1835[this.field1823[var15]];
                    }
                    int var23 = (var22.field2016 * arg4 + var22.field2018 * arg2 + var22.field2017 * arg3) / (var22.field2019 * var7) + arg0;
                    var8.field1966[var15] = method2207(var19, var23);
                    class136 var24;
                    if (this.field1835 == null || this.field1835[this.field1844[var15]] == null) {
                        var24 = this.field1825[this.field1844[var15]];
                    } else {
                        var24 = this.field1835[this.field1844[var15]];
                    }
                    int var25 = (var24.field2016 * arg4 + var24.field2018 * arg2 + var24.field2017 * arg3) / (var24.field2019 * var7) + arg0;
                    var8.field1946[var15] = method2207(var19, var25);
                } else if (var16 == 1) {
                    class144 var26 = this.field1818[var15];
                    int var27 = (var26.field2153 * arg4 + var26.field2155 * arg2 + var26.field2152 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1944[var15] = method2207(this.field1814[var15] & 0xFFFF, var27);
                    var8.field1946[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1944[var15] = 128;
                    var8.field1946[var15] = -1;
                } else {
                    var8.field1946[var15] = -2;
                }
            } else if (var16 == 0) {
                class136 var28;
                if (this.field1835 == null || this.field1835[this.field1807[var15]] == null) {
                    var28 = this.field1825[this.field1807[var15]];
                } else {
                    var28 = this.field1835[this.field1807[var15]];
                }
                int var29 = (var28.field2016 * arg4 + var28.field2018 * arg2 + var28.field2017 * arg3) / (var28.field2019 * var7) + arg0;
                var8.field1944[var15] = method2241(var29);
                class136 var30;
                if (this.field1835 == null || this.field1835[this.field1823[var15]] == null) {
                    var30 = this.field1825[this.field1823[var15]];
                } else {
                    var30 = this.field1835[this.field1823[var15]];
                }
                int var31 = (var30.field2016 * arg4 + var30.field2018 * arg2 + var30.field2017 * arg3) / (var30.field2019 * var7) + arg0;
                var8.field1966[var15] = method2241(var31);
                class136 var32;
                if (this.field1835 == null || this.field1835[this.field1844[var15]] == null) {
                    var32 = this.field1825[this.field1844[var15]];
                } else {
                    var32 = this.field1835[this.field1844[var15]];
                }
                int var33 = (var32.field2016 * arg4 + var32.field2018 * arg2 + var32.field2017 * arg3) / (var32.field2019 * var7) + arg0;
                var8.field1946[var15] = method2241(var33);
            } else if (var16 == 1) {
                class144 var34 = this.field1818[var15];
                int var35 = (var34.field2153 * arg4 + var34.field2155 * arg2 + var34.field2152 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1944[var15] = method2241(var35);
                var8.field1946[var15] = -1;
            } else {
                var8.field1946[var15] = -2;
            }
        }
        this.method2184();
        var8.field1962 = this.field1827;
        var8.field1937 = this.field1803;
        var8.field1938 = this.field1836;
        var8.field1977 = this.field1829;
        var8.field1940 = this.field1806;
        var8.field1941 = this.field1807;
        var8.field1942 = this.field1823;
        var8.field1943 = this.field1844;
        var8.field1947 = this.field1811;
        var8.field1948 = this.field1812;
        var8.field1995 = this.field1816;
        var8.field1996 = this.field1831;
        var8.field1957 = this.field1832;
        var8.field1950 = this.field1815;
        return var8;
    }

    @ObfuscatedName("do.x(II)I")
    public static final int method2207(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("do.ai(I)I")
    public static final int method2241(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
