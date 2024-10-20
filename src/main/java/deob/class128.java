package deob;

@ObfuscatedName("dw")
public class class128 extends class142 {

    @ObfuscatedName("dw.i")
    public int field1831 = 0;

    @ObfuscatedName("dw.c")
    public int[] field1818;

    @ObfuscatedName("dw.e")
    public int[] field1812;

    @ObfuscatedName("dw.v")
    public int[] field1813;

    @ObfuscatedName("dw.b")
    public int field1814 = 0;

    @ObfuscatedName("dw.y")
    public int[] field1853;

    @ObfuscatedName("dw.h")
    public int[] field1816;

    @ObfuscatedName("dw.x")
    public int[] field1843;

    @ObfuscatedName("dw.f")
    public byte[] field1810;

    @ObfuscatedName("dw.n")
    public byte[] field1819;

    @ObfuscatedName("dw.a")
    public byte[] field1855;

    @ObfuscatedName("dw.o")
    public byte[] field1817;

    @ObfuscatedName("dw.z")
    public short[] field1822;

    @ObfuscatedName("dw.q")
    public short[] field1823;

    @ObfuscatedName("dw.j")
    public byte field1824 = 0;

    @ObfuscatedName("dw.k")
    public int field1825;

    @ObfuscatedName("dw.r")
    public byte[] field1826;

    @ObfuscatedName("dw.m")
    public short[] field1827;

    @ObfuscatedName("dw.d")
    public short[] field1844;

    @ObfuscatedName("dw.s")
    public short[] field1829;

    @ObfuscatedName("dw.g")
    public short[] field1830;

    @ObfuscatedName("dw.w")
    public short[] field1856;

    @ObfuscatedName("dw.p")
    public short[] field1832;

    @ObfuscatedName("dw.l")
    public short[] field1833;

    @ObfuscatedName("dw.u")
    public short[] field1834;

    @ObfuscatedName("dw.t")
    public short[] field1835;

    @ObfuscatedName("dw.ad")
    public byte[] field1836;

    @ObfuscatedName("dw.ar")
    public int[] field1820;

    @ObfuscatedName("dw.an")
    public int[] field1838;

    @ObfuscatedName("dw.af")
    public int[][] field1839;

    @ObfuscatedName("dw.at")
    public int[][] field1840;

    @ObfuscatedName("dw.ah")
    public class144[] field1841;

    @ObfuscatedName("dw.ai")
    public class136[] field1815;

    @ObfuscatedName("dw.aw")
    public class136[] field1852;

    @ObfuscatedName("dw.al")
    public short field1842;

    @ObfuscatedName("dw.ab")
    public short field1845;

    @ObfuscatedName("dw.aa")
    public boolean field1846 = false;

    @ObfuscatedName("dw.ap")
    public int field1847;

    @ObfuscatedName("dw.ae")
    public int field1811;

    @ObfuscatedName("dw.as")
    public int field1849;

    @ObfuscatedName("dw.av")
    public int field1850;

    @ObfuscatedName("dw.ag")
    public int field1851;

    @ObfuscatedName("dw.az")
    public static int[] field1828 = new int[10000];

    @ObfuscatedName("dw.ac")
    public static int[] field1848 = new int[10000];

    @ObfuscatedName("dw.ax")
    public static int field1854 = 0;

    @ObfuscatedName("dw.au")
    public static int[] field1821 = class137.field2053;

    @ObfuscatedName("dw.aj")
    public static int[] field1837 = class137.field2041;

    public class128() {
    }

    @ObfuscatedName("dw.i(Liw;II)Ldw;")
    public static class128 method2208(class236 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3769(arg1, arg2);
        return var3 == null ? null : new class128(var3);
    }

    public class128(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2179(arg0);
        } else {
            this.method2180(arg0);
        }
    }

    @ObfuscatedName("dw.c([B)V")
    public void method2179(byte[] arg0) {
        class174 var2 = new class174(arg0);
        class174 var3 = new class174(arg0);
        class174 var4 = new class174(arg0);
        class174 var5 = new class174(arg0);
        class174 var6 = new class174(arg0);
        class174 var7 = new class174(arg0);
        class174 var8 = new class174(arg0);
        var2.field2407 = arg0.length - 23;
        int var9 = var2.method2872();
        int var10 = var2.method2872();
        int var11 = var2.method2870();
        int var12 = var2.method2870();
        int var13 = var2.method2870();
        int var14 = var2.method2870();
        int var15 = var2.method2870();
        int var16 = var2.method2870();
        int var17 = var2.method2870();
        int var18 = var2.method2872();
        int var19 = var2.method2872();
        int var20 = var2.method2872();
        int var21 = var2.method2872();
        int var22 = var2.method2872();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1826 = new byte[var11];
            var2.field2407 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1826[var26] = var2.method2938();
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
        this.field1831 = var9;
        this.field1814 = var10;
        this.field1825 = var11;
        this.field1818 = new int[var9];
        this.field1812 = new int[var9];
        this.field1813 = new int[var9];
        this.field1853 = new int[var10];
        this.field1816 = new int[var10];
        this.field1843 = new int[var10];
        if (var17 == 1) {
            this.field1820 = new int[var9];
        }
        if (var12 == 1) {
            this.field1810 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1819 = new byte[var10];
        } else {
            this.field1824 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1855 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1838 = new int[var10];
        }
        if (var16 == 1) {
            this.field1823 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1817 = new byte[var10];
        }
        this.field1822 = new short[var10];
        if (var11 > 0) {
            this.field1827 = new short[var11];
            this.field1844 = new short[var11];
            this.field1829 = new short[var11];
            if (var24 > 0) {
                this.field1830 = new short[var24];
                this.field1856 = new short[var24];
                this.field1832 = new short[var24];
                this.field1833 = new short[var24];
                this.field1836 = new byte[var24];
                this.field1834 = new short[var24];
            }
            if (var25 > 0) {
                this.field1835 = new short[var25];
            }
        }
        var2.field2407 = var11;
        var3.field2407 = var44;
        var4.field2407 = var46;
        var5.field2407 = var48;
        var6.field2407 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2870();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method3011();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method3011();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method3011();
            }
            this.field1818[var67] = var64 + var69;
            this.field1812[var67] = var65 + var70;
            this.field1813[var67] = var66 + var71;
            var64 = this.field1818[var67];
            var65 = this.field1812[var67];
            var66 = this.field1813[var67];
            if (var17 == 1) {
                this.field1820[var67] = var6.method2870();
            }
        }
        var2.field2407 = var42;
        var3.field2407 = var31;
        var4.field2407 = var34;
        var5.field2407 = var37;
        var6.field2407 = var35;
        var7.field2407 = var40;
        var8.field2407 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1822[var72] = (short) var2.method2872();
            if (var12 == 1) {
                this.field1810[var72] = var3.method2938();
            }
            if (var13 == 255) {
                this.field1819[var72] = var4.method2938();
            }
            if (var14 == 1) {
                this.field1855[var72] = var5.method2938();
            }
            if (var15 == 1) {
                this.field1838[var72] = var6.method2870();
            }
            if (var16 == 1) {
                this.field1823[var72] = (short) (var7.method2872() - 1);
            }
            if (this.field1817 != null && this.field1823[var72] != -1) {
                this.field1817[var72] = (byte) (var8.method2870() - 1);
            }
        }
        var2.field2407 = var33;
        var3.field2407 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2870();
            if (var78 == 1) {
                var73 = var2.method3011() + var76;
                var74 = var2.method3011() + var73;
                var75 = var2.method3011() + var74;
                var76 = var75;
                this.field1853[var77] = var73;
                this.field1816[var77] = var74;
                this.field1843[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method3011() + var76;
                var76 = var75;
                this.field1853[var77] = var73;
                this.field1816[var77] = var74;
                this.field1843[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method3011() + var76;
                var76 = var75;
                this.field1853[var77] = var73;
                this.field1816[var77] = var74;
                this.field1843[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method3011() + var76;
                var76 = var75;
                this.field1853[var77] = var73;
                this.field1816[var77] = var81;
                this.field1843[var77] = var75;
            }
        }
        var2.field2407 = var50;
        var3.field2407 = var52;
        var4.field2407 = var54;
        var5.field2407 = var56;
        var6.field2407 = var58;
        var7.field2407 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1826[var82] & 0xFF;
            if (var83 == 0) {
                this.field1827[var82] = (short) var2.method2872();
                this.field1844[var82] = (short) var2.method2872();
                this.field1829[var82] = (short) var2.method2872();
            }
            if (var83 == 1) {
                this.field1827[var82] = (short) var3.method2872();
                this.field1844[var82] = (short) var3.method2872();
                this.field1829[var82] = (short) var3.method2872();
                this.field1830[var82] = (short) var4.method2872();
                this.field1856[var82] = (short) var4.method2872();
                this.field1832[var82] = (short) var4.method2872();
                this.field1833[var82] = (short) var5.method2872();
                this.field1836[var82] = var6.method2938();
                this.field1834[var82] = (short) var7.method2872();
            }
            if (var83 == 2) {
                this.field1827[var82] = (short) var3.method2872();
                this.field1844[var82] = (short) var3.method2872();
                this.field1829[var82] = (short) var3.method2872();
                this.field1830[var82] = (short) var4.method2872();
                this.field1856[var82] = (short) var4.method2872();
                this.field1832[var82] = (short) var4.method2872();
                this.field1833[var82] = (short) var5.method2872();
                this.field1836[var82] = var6.method2938();
                this.field1834[var82] = (short) var7.method2872();
                this.field1835[var82] = (short) var7.method2872();
            }
            if (var83 == 3) {
                this.field1827[var82] = (short) var3.method2872();
                this.field1844[var82] = (short) var3.method2872();
                this.field1829[var82] = (short) var3.method2872();
                this.field1830[var82] = (short) var4.method2872();
                this.field1856[var82] = (short) var4.method2872();
                this.field1832[var82] = (short) var4.method2872();
                this.field1833[var82] = (short) var5.method2872();
                this.field1836[var82] = var6.method2938();
                this.field1834[var82] = (short) var7.method2872();
            }
        }
        var2.field2407 = var62;
        int var84 = var2.method2870();
        if (var84 == 0) {
            return;
        }
        new class141();
        var2.method2872();
        var2.method2872();
        var2.method2872();
        var2.method2875();
    }

    @ObfuscatedName("dw.v([B)V")
    public void method2180(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class174 var4 = new class174(arg0);
        class174 var5 = new class174(arg0);
        class174 var6 = new class174(arg0);
        class174 var7 = new class174(arg0);
        class174 var8 = new class174(arg0);
        var4.field2407 = arg0.length - 18;
        int var9 = var4.method2872();
        int var10 = var4.method2872();
        int var11 = var4.method2870();
        int var12 = var4.method2870();
        int var13 = var4.method2870();
        int var14 = var4.method2870();
        int var15 = var4.method2870();
        int var16 = var4.method2870();
        int var17 = var4.method2872();
        int var18 = var4.method2872();
        int var19 = var4.method2872();
        int var20 = var4.method2872();
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
        this.field1831 = var9;
        this.field1814 = var10;
        this.field1825 = var11;
        this.field1818 = new int[var9];
        this.field1812 = new int[var9];
        this.field1813 = new int[var9];
        this.field1853 = new int[var10];
        this.field1816 = new int[var10];
        this.field1843 = new int[var10];
        if (var11 > 0) {
            this.field1826 = new byte[var11];
            this.field1827 = new short[var11];
            this.field1844 = new short[var11];
            this.field1829 = new short[var11];
        }
        if (var16 == 1) {
            this.field1820 = new int[var9];
        }
        if (var12 == 1) {
            this.field1810 = new byte[var10];
            this.field1817 = new byte[var10];
            this.field1823 = new short[var10];
        }
        if (var13 == 255) {
            this.field1819 = new byte[var10];
        } else {
            this.field1824 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1855 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1838 = new int[var10];
        }
        this.field1822 = new short[var10];
        var4.field2407 = var21;
        var5.field2407 = var36;
        var6.field2407 = var38;
        var7.field2407 = var40;
        var8.field2407 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2870();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method3011();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method3011();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method3011();
            }
            this.field1818[var46] = var43 + var48;
            this.field1812[var46] = var44 + var49;
            this.field1813[var46] = var45 + var50;
            var43 = this.field1818[var46];
            var44 = this.field1812[var46];
            var45 = this.field1813[var46];
            if (var16 == 1) {
                this.field1820[var46] = var8.method2870();
            }
        }
        var4.field2407 = var32;
        var5.field2407 = var28;
        var6.field2407 = var26;
        var7.field2407 = var30;
        var8.field2407 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1822[var51] = (short) var4.method2872();
            if (var12 == 1) {
                int var52 = var5.method2870();
                if ((var52 & 0x1) == 1) {
                    this.field1810[var51] = 1;
                    var2 = true;
                } else {
                    this.field1810[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1817[var51] = (byte) (var52 >> 2);
                    this.field1823[var51] = this.field1822[var51];
                    this.field1822[var51] = 127;
                    if (this.field1823[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1817[var51] = -1;
                    this.field1823[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1819[var51] = var6.method2938();
            }
            if (var14 == 1) {
                this.field1855[var51] = var7.method2938();
            }
            if (var15 == 1) {
                this.field1838[var51] = var8.method2870();
            }
        }
        var4.field2407 = var25;
        var5.field2407 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2870();
            if (var58 == 1) {
                var53 = var4.method3011() + var56;
                var54 = var4.method3011() + var53;
                var55 = var4.method3011() + var54;
                var56 = var55;
                this.field1853[var57] = var53;
                this.field1816[var57] = var54;
                this.field1843[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method3011() + var56;
                var56 = var55;
                this.field1853[var57] = var53;
                this.field1816[var57] = var54;
                this.field1843[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method3011() + var56;
                var56 = var55;
                this.field1853[var57] = var53;
                this.field1816[var57] = var54;
                this.field1843[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method3011() + var56;
                var56 = var55;
                this.field1853[var57] = var53;
                this.field1816[var57] = var61;
                this.field1843[var57] = var55;
            }
        }
        var4.field2407 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1826[var62] = 0;
            this.field1827[var62] = (short) var4.method2872();
            this.field1844[var62] = (short) var4.method2872();
            this.field1829[var62] = (short) var4.method2872();
        }
        if (this.field1817 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1817[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1827[var65] & 0xFFFF) == this.field1853[var64] && (this.field1844[var65] & 0xFFFF) == this.field1816[var64] && (this.field1829[var65] & 0xFFFF) == this.field1843[var64]) {
                        this.field1817[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1817 = null;
            }
        }
        if (!var3) {
            this.field1823 = null;
        }
        if (!var2) {
            this.field1810 = null;
        }
    }

    public class128(class128[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1831 = 0;
        this.field1814 = 0;
        this.field1825 = 0;
        this.field1824 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class128 var10 = arg0[var9];
            if (var10 != null) {
                this.field1831 += var10.field1831;
                this.field1814 += var10.field1814;
                this.field1825 += var10.field1825;
                if (var10.field1819 == null) {
                    if (this.field1824 == -1) {
                        this.field1824 = var10.field1824;
                    }
                    if (this.field1824 != var10.field1824) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1810 != null;
                var5 |= var10.field1855 != null;
                var6 |= var10.field1838 != null;
                var7 |= var10.field1823 != null;
                var8 |= var10.field1817 != null;
            }
        }
        this.field1818 = new int[this.field1831];
        this.field1812 = new int[this.field1831];
        this.field1813 = new int[this.field1831];
        this.field1820 = new int[this.field1831];
        this.field1853 = new int[this.field1814];
        this.field1816 = new int[this.field1814];
        this.field1843 = new int[this.field1814];
        if (var3) {
            this.field1810 = new byte[this.field1814];
        }
        if (var4) {
            this.field1819 = new byte[this.field1814];
        }
        if (var5) {
            this.field1855 = new byte[this.field1814];
        }
        if (var6) {
            this.field1838 = new int[this.field1814];
        }
        if (var7) {
            this.field1823 = new short[this.field1814];
        }
        if (var8) {
            this.field1817 = new byte[this.field1814];
        }
        this.field1822 = new short[this.field1814];
        if (this.field1825 > 0) {
            this.field1826 = new byte[this.field1825];
            this.field1827 = new short[this.field1825];
            this.field1844 = new short[this.field1825];
            this.field1829 = new short[this.field1825];
            this.field1830 = new short[this.field1825];
            this.field1856 = new short[this.field1825];
            this.field1832 = new short[this.field1825];
            this.field1833 = new short[this.field1825];
            this.field1836 = new byte[this.field1825];
            this.field1834 = new short[this.field1825];
            this.field1835 = new short[this.field1825];
        }
        this.field1831 = 0;
        this.field1814 = 0;
        this.field1825 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class128 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1814; var13++) {
                    if (var3 && var12.field1810 != null) {
                        this.field1810[this.field1814] = var12.field1810[var13];
                    }
                    if (var4) {
                        if (var12.field1819 == null) {
                            this.field1819[this.field1814] = var12.field1824;
                        } else {
                            this.field1819[this.field1814] = var12.field1819[var13];
                        }
                    }
                    if (var5 && var12.field1855 != null) {
                        this.field1855[this.field1814] = var12.field1855[var13];
                    }
                    if (var6 && var12.field1838 != null) {
                        this.field1838[this.field1814] = var12.field1838[var13];
                    }
                    if (var7) {
                        if (var12.field1823 == null) {
                            this.field1823[this.field1814] = -1;
                        } else {
                            this.field1823[this.field1814] = var12.field1823[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1817 == null || var12.field1817[var13] == -1) {
                            this.field1817[this.field1814] = -1;
                        } else {
                            this.field1817[this.field1814] = (byte) (var12.field1817[var13] + this.field1825);
                        }
                    }
                    this.field1822[this.field1814] = var12.field1822[var13];
                    this.field1853[this.field1814] = this.method2181(var12, var12.field1853[var13]);
                    this.field1816[this.field1814] = this.method2181(var12, var12.field1816[var13]);
                    this.field1843[this.field1814] = this.method2181(var12, var12.field1843[var13]);
                    this.field1814++;
                }
                for (int var14 = 0; var14 < var12.field1825; var14++) {
                    byte var15 = this.field1826[this.field1825] = var12.field1826[var14];
                    if (var15 == 0) {
                        this.field1827[this.field1825] = (short) this.method2181(var12, var12.field1827[var14]);
                        this.field1844[this.field1825] = (short) this.method2181(var12, var12.field1844[var14]);
                        this.field1829[this.field1825] = (short) this.method2181(var12, var12.field1829[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1827[this.field1825] = var12.field1827[var14];
                        this.field1844[this.field1825] = var12.field1844[var14];
                        this.field1829[this.field1825] = var12.field1829[var14];
                        this.field1830[this.field1825] = var12.field1830[var14];
                        this.field1856[this.field1825] = var12.field1856[var14];
                        this.field1832[this.field1825] = var12.field1832[var14];
                        this.field1833[this.field1825] = var12.field1833[var14];
                        this.field1836[this.field1825] = var12.field1836[var14];
                        this.field1834[this.field1825] = var12.field1834[var14];
                    }
                    if (var15 == 2) {
                        this.field1835[this.field1825] = var12.field1835[var14];
                    }
                    this.field1825++;
                }
            }
        }
    }

    @ObfuscatedName("dw.b(Ldw;I)I")
    public final int method2181(class128 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1818[arg1];
        int var5 = arg0.field1812[arg1];
        int var6 = arg0.field1813[arg1];
        for (int var7 = 0; var7 < this.field1831; var7++) {
            if (this.field1818[var7] == var4 && this.field1812[var7] == var5 && this.field1813[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1818[this.field1831] = var4;
            this.field1812[this.field1831] = var5;
            this.field1813[this.field1831] = var6;
            if (arg0.field1820 != null) {
                this.field1820[this.field1831] = arg0.field1820[arg1];
            }
            var3 = this.field1831++;
        }
        return var3;
    }

    public class128(class128 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1831 = arg0.field1831;
        this.field1814 = arg0.field1814;
        this.field1825 = arg0.field1825;
        if (arg1) {
            this.field1818 = arg0.field1818;
            this.field1812 = arg0.field1812;
            this.field1813 = arg0.field1813;
        } else {
            this.field1818 = new int[this.field1831];
            this.field1812 = new int[this.field1831];
            this.field1813 = new int[this.field1831];
            for (int var6 = 0; var6 < this.field1831; var6++) {
                this.field1818[var6] = arg0.field1818[var6];
                this.field1812[var6] = arg0.field1812[var6];
                this.field1813[var6] = arg0.field1813[var6];
            }
        }
        if (arg2) {
            this.field1822 = arg0.field1822;
        } else {
            this.field1822 = new short[this.field1814];
            for (int var7 = 0; var7 < this.field1814; var7++) {
                this.field1822[var7] = arg0.field1822[var7];
            }
        }
        if (arg3 || arg0.field1823 == null) {
            this.field1823 = arg0.field1823;
        } else {
            this.field1823 = new short[this.field1814];
            for (int var8 = 0; var8 < this.field1814; var8++) {
                this.field1823[var8] = arg0.field1823[var8];
            }
        }
        if (arg4) {
            this.field1855 = arg0.field1855;
        } else {
            this.field1855 = new byte[this.field1814];
            if (arg0.field1855 == null) {
                for (int var9 = 0; var9 < this.field1814; var9++) {
                    this.field1855[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1814; var10++) {
                    this.field1855[var10] = arg0.field1855[var10];
                }
            }
        }
        this.field1853 = arg0.field1853;
        this.field1816 = arg0.field1816;
        this.field1843 = arg0.field1843;
        this.field1810 = arg0.field1810;
        this.field1819 = arg0.field1819;
        this.field1817 = arg0.field1817;
        this.field1824 = arg0.field1824;
        this.field1826 = arg0.field1826;
        this.field1827 = arg0.field1827;
        this.field1844 = arg0.field1844;
        this.field1829 = arg0.field1829;
        this.field1830 = arg0.field1830;
        this.field1856 = arg0.field1856;
        this.field1832 = arg0.field1832;
        this.field1833 = arg0.field1833;
        this.field1836 = arg0.field1836;
        this.field1834 = arg0.field1834;
        this.field1835 = arg0.field1835;
        this.field1820 = arg0.field1820;
        this.field1838 = arg0.field1838;
        this.field1839 = arg0.field1839;
        this.field1840 = arg0.field1840;
        this.field1815 = arg0.field1815;
        this.field1841 = arg0.field1841;
        this.field1852 = arg0.field1852;
        this.field1842 = arg0.field1842;
        this.field1845 = arg0.field1845;
    }

    @ObfuscatedName("dw.y()Ldw;")
    public class128 method2182() {
        class128 var1 = new class128();
        if (this.field1810 != null) {
            var1.field1810 = new byte[this.field1814];
            for (int var2 = 0; var2 < this.field1814; var2++) {
                var1.field1810[var2] = this.field1810[var2];
            }
        }
        var1.field1831 = this.field1831;
        var1.field1814 = this.field1814;
        var1.field1825 = this.field1825;
        var1.field1818 = this.field1818;
        var1.field1812 = this.field1812;
        var1.field1813 = this.field1813;
        var1.field1853 = this.field1853;
        var1.field1816 = this.field1816;
        var1.field1843 = this.field1843;
        var1.field1819 = this.field1819;
        var1.field1855 = this.field1855;
        var1.field1817 = this.field1817;
        var1.field1822 = this.field1822;
        var1.field1823 = this.field1823;
        var1.field1824 = this.field1824;
        var1.field1826 = this.field1826;
        var1.field1827 = this.field1827;
        var1.field1844 = this.field1844;
        var1.field1829 = this.field1829;
        var1.field1830 = this.field1830;
        var1.field1856 = this.field1856;
        var1.field1832 = this.field1832;
        var1.field1833 = this.field1833;
        var1.field1836 = this.field1836;
        var1.field1834 = this.field1834;
        var1.field1835 = this.field1835;
        var1.field1820 = this.field1820;
        var1.field1838 = this.field1838;
        var1.field1839 = this.field1839;
        var1.field1840 = this.field1840;
        var1.field1815 = this.field1815;
        var1.field1841 = this.field1841;
        var1.field1842 = this.field1842;
        var1.field1845 = this.field1845;
        return var1;
    }

    @ObfuscatedName("dw.h([[IIIIZI)Ldw;")
    public class128 method2183(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2196();
        int var7 = this.field1811 + arg1;
        int var8 = this.field1849 + arg1;
        int var9 = this.field1851 + arg3;
        int var10 = this.field1850 + arg3;
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
            var15.field1831 = this.field1831;
            var15.field1814 = this.field1814;
            var15.field1825 = this.field1825;
            var15.field1818 = this.field1818;
            var15.field1813 = this.field1813;
            var15.field1853 = this.field1853;
            var15.field1816 = this.field1816;
            var15.field1843 = this.field1843;
            var15.field1810 = this.field1810;
            var15.field1819 = this.field1819;
            var15.field1855 = this.field1855;
            var15.field1817 = this.field1817;
            var15.field1822 = this.field1822;
            var15.field1823 = this.field1823;
            var15.field1824 = this.field1824;
            var15.field1826 = this.field1826;
            var15.field1827 = this.field1827;
            var15.field1844 = this.field1844;
            var15.field1829 = this.field1829;
            var15.field1830 = this.field1830;
            var15.field1856 = this.field1856;
            var15.field1832 = this.field1832;
            var15.field1833 = this.field1833;
            var15.field1836 = this.field1836;
            var15.field1834 = this.field1834;
            var15.field1835 = this.field1835;
            var15.field1820 = this.field1820;
            var15.field1838 = this.field1838;
            var15.field1839 = this.field1839;
            var15.field1840 = this.field1840;
            var15.field1842 = this.field1842;
            var15.field1845 = this.field1845;
            var15.field1812 = new int[var15.field1831];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1831; var16++) {
                int var17 = this.field1818[var16] + arg1;
                int var18 = this.field1813[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1812[var16] = this.field1812[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1831; var26++) {
                int var27 = (-this.field1812[var26] << 16) / this.field2141;
                if (var27 < arg5) {
                    int var28 = this.field1818[var26] + arg1;
                    int var29 = this.field1813[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1812[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1812[var26];
                }
            }
        }
        var15.method2234();
        return var15;
    }

    @ObfuscatedName("dw.x()V")
    public void method2184() {
        int var10002;
        if (this.field1820 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1831; var3++) {
                int var4 = this.field1820[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1839 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1839[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1831) {
                int var7 = this.field1820[var6];
                this.field1839[var7][var1[var7]++] = var6++;
            }
            this.field1820 = null;
        }
        if (this.field1838 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1814; var10++) {
            int var11 = this.field1838[var10];
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
        while (var13 < this.field1814) {
            int var14 = this.field1838[var13];
            this.field1840[var14][var8[var14]++] = var13++;
        }
        this.field1838 = null;
    }

    @ObfuscatedName("dw.f()V")
    public void method2185() {
        for (int var1 = 0; var1 < this.field1831; var1++) {
            int var2 = this.field1818[var1];
            this.field1818[var1] = this.field1813[var1];
            this.field1813[var1] = -var2;
        }
        this.method2234();
    }

    @ObfuscatedName("dw.n()V")
    public void method2206() {
        for (int var1 = 0; var1 < this.field1831; var1++) {
            this.field1818[var1] = -this.field1818[var1];
            this.field1813[var1] = -this.field1813[var1];
        }
        this.method2234();
    }

    @ObfuscatedName("dw.a()V")
    public void method2188() {
        for (int var1 = 0; var1 < this.field1831; var1++) {
            int var2 = this.field1813[var1];
            this.field1813[var1] = this.field1818[var1];
            this.field1818[var1] = -var2;
        }
        this.method2234();
    }

    @ObfuscatedName("dw.o(I)V")
    public void method2236(int arg0) {
        int var2 = field1821[arg0];
        int var3 = field1837[arg0];
        for (int var4 = 0; var4 < this.field1831; var4++) {
            int var5 = this.field1818[var4] * var3 + this.field1813[var4] * var2 >> 16;
            this.field1813[var4] = this.field1813[var4] * var3 - this.field1818[var4] * var2 >> 16;
            this.field1818[var4] = var5;
        }
        this.method2234();
    }

    @ObfuscatedName("dw.z(III)V")
    public void method2189(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1831; var4++) {
            this.field1818[var4] += arg0;
            this.field1812[var4] += arg1;
            this.field1813[var4] += arg2;
        }
        this.method2234();
    }

    @ObfuscatedName("dw.j(SS)V")
    public void method2190(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1814; var3++) {
            if (this.field1822[var3] == arg0) {
                this.field1822[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dw.l(SS)V")
    public void method2231(short arg0, short arg1) {
        if (this.field1823 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1814; var3++) {
            if (this.field1823[var3] == arg0) {
                this.field1823[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dw.u()V")
    public void method2192() {
        for (int var1 = 0; var1 < this.field1831; var1++) {
            this.field1813[var1] = -this.field1813[var1];
        }
        for (int var2 = 0; var2 < this.field1814; var2++) {
            int var3 = this.field1853[var2];
            this.field1853[var2] = this.field1843[var2];
            this.field1843[var2] = var3;
        }
        this.method2234();
    }

    @ObfuscatedName("dw.t(III)V")
    public void method2193(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1831; var4++) {
            this.field1818[var4] = this.field1818[var4] * arg0 / 128;
            this.field1812[var4] = this.field1812[var4] * arg1 / 128;
            this.field1813[var4] = this.field1813[var4] * arg2 / 128;
        }
        this.method2234();
    }

    @ObfuscatedName("dw.ad()V")
    public void method2194() {
        if (this.field1815 != null) {
            return;
        }
        this.field1815 = new class136[this.field1831];
        for (int var1 = 0; var1 < this.field1831; var1++) {
            this.field1815[var1] = new class136();
        }
        for (int var2 = 0; var2 < this.field1814; var2++) {
            int var3 = this.field1853[var2];
            int var4 = this.field1816[var2];
            int var5 = this.field1843[var2];
            int var6 = this.field1818[var4] - this.field1818[var3];
            int var7 = this.field1812[var4] - this.field1812[var3];
            int var8 = this.field1813[var4] - this.field1813[var3];
            int var9 = this.field1818[var5] - this.field1818[var3];
            int var10 = this.field1812[var5] - this.field1812[var3];
            int var11 = this.field1813[var5] - this.field1813[var3];
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
            if (this.field1810 == null) {
                var19 = 0;
            } else {
                var19 = this.field1810[var2];
            }
            if (var19 == 0) {
                class136 var20 = this.field1815[var3];
                var20.field2020 += var16;
                var20.field2026 += var17;
                var20.field2022 += var18;
                var20.field2023++;
                class136 var21 = this.field1815[var4];
                var21.field2020 += var16;
                var21.field2026 += var17;
                var21.field2022 += var18;
                var21.field2023++;
                class136 var22 = this.field1815[var5];
                var22.field2020 += var16;
                var22.field2026 += var17;
                var22.field2022 += var18;
                var22.field2023++;
            } else if (var19 == 1) {
                if (this.field1841 == null) {
                    this.field1841 = new class144[this.field1814];
                }
                class144 var23 = this.field1841[var2] = new class144();
                var23.field2157 = var16;
                var23.field2154 = var17;
                var23.field2153 = var18;
            }
        }
    }

    @ObfuscatedName("dw.ar()V")
    public void method2234() {
        this.field1815 = null;
        this.field1852 = null;
        this.field1841 = null;
        this.field1846 = false;
    }

    @ObfuscatedName("dw.an()V")
    public void method2196() {
        if (this.field1846) {
            return;
        }
        this.field2141 = 0;
        this.field1847 = 0;
        this.field1811 = 999999;
        this.field1849 = -999999;
        this.field1850 = -99999;
        this.field1851 = 99999;
        for (int var1 = 0; var1 < this.field1831; var1++) {
            int var2 = this.field1818[var1];
            int var3 = this.field1812[var1];
            int var4 = this.field1813[var1];
            if (var2 < this.field1811) {
                this.field1811 = var2;
            }
            if (var2 > this.field1849) {
                this.field1849 = var2;
            }
            if (var4 < this.field1851) {
                this.field1851 = var4;
            }
            if (var4 > this.field1850) {
                this.field1850 = var4;
            }
            if (-var3 > this.field2141) {
                this.field2141 = -var3;
            }
            if (var3 > this.field1847) {
                this.field1847 = var3;
            }
        }
        this.field1846 = true;
    }

    @ObfuscatedName("dw.af(Ldw;Ldw;IIIZ)V")
    public static void method2197(class128 arg0, class128 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2196();
        arg0.method2194();
        arg1.method2196();
        arg1.method2194();
        field1854++;
        int var6 = 0;
        int[] var7 = arg1.field1818;
        int var8 = arg1.field1831;
        for (int var9 = 0; var9 < arg0.field1831; var9++) {
            class136 var10 = arg0.field1815[var9];
            if (var10.field2023 != 0) {
                int var11 = arg0.field1812[var9] - arg3;
                if (var11 <= arg1.field1847) {
                    int var12 = arg0.field1818[var9] - arg2;
                    if (var12 >= arg1.field1811 && var12 <= arg1.field1849) {
                        int var13 = arg0.field1813[var9] - arg4;
                        if (var13 >= arg1.field1851 && var13 <= arg1.field1850) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class136 var15 = arg1.field1815[var14];
                                if (var7[var14] == var12 && arg1.field1813[var14] == var13 && arg1.field1812[var14] == var11 && var15.field2023 != 0) {
                                    if (arg0.field1852 == null) {
                                        arg0.field1852 = new class136[arg0.field1831];
                                    }
                                    if (arg1.field1852 == null) {
                                        arg1.field1852 = new class136[var8];
                                    }
                                    class136 var16 = arg0.field1852[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1852[var9] = new class136(var10);
                                    }
                                    class136 var17 = arg1.field1852[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1852[var14] = new class136(var15);
                                    }
                                    var16.field2020 += var15.field2020;
                                    var16.field2026 += var15.field2026;
                                    var16.field2022 += var15.field2022;
                                    var16.field2023 += var15.field2023;
                                    var17.field2020 += var10.field2020;
                                    var17.field2026 += var10.field2026;
                                    var17.field2022 += var10.field2022;
                                    var17.field2023 += var10.field2023;
                                    var6++;
                                    field1828[var9] = field1854;
                                    field1848[var14] = field1854;
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
        for (int var18 = 0; var18 < arg0.field1814; var18++) {
            if (field1828[arg0.field1853[var18]] == field1854 && field1828[arg0.field1816[var18]] == field1854 && field1828[arg0.field1843[var18]] == field1854) {
                if (arg0.field1810 == null) {
                    arg0.field1810 = new byte[arg0.field1814];
                }
                arg0.field1810[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1814; var19++) {
            if (field1848[arg1.field1853[var19]] == field1854 && field1848[arg1.field1816[var19]] == field1854 && field1848[arg1.field1843[var19]] == field1854) {
                if (arg1.field1810 == null) {
                    arg1.field1810 = new byte[arg1.field1814];
                }
                arg1.field1810[var19] = 2;
            }
        }
    }

    @ObfuscatedName("dw.at(IIIII)Led;")
    public final class134 method2198(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2194();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class134 var8 = new class134();
        var8.field1950 = new int[this.field1814];
        var8.field1975 = new int[this.field1814];
        var8.field1952 = new int[this.field1814];
        if (this.field1825 > 0 && this.field1817 != null) {
            int[] var9 = new int[this.field1825];
            for (int var10 = 0; var10 < this.field1814; var10++) {
                if (this.field1817[var10] != -1) {
                    var9[this.field1817[var10] & 0xFF]++;
                }
            }
            var8.field1958 = 0;
            for (int var11 = 0; var11 < this.field1825; var11++) {
                if (var9[var11] > 0 && this.field1826[var11] == 0) {
                    var8.field1958++;
                }
            }
            var8.field1959 = new int[var8.field1958];
            var8.field1960 = new int[var8.field1958];
            var8.field1964 = new int[var8.field1958];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1825; var13++) {
                if (var9[var13] > 0 && this.field1826[var13] == 0) {
                    var8.field1959[var12] = this.field1827[var13] & 0xFFFF;
                    var8.field1960[var12] = this.field1844[var13] & 0xFFFF;
                    var8.field1964[var12] = this.field1829[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1955 = new byte[this.field1814];
            for (int var14 = 0; var14 < this.field1814; var14++) {
                if (this.field1817[var14] == -1) {
                    var8.field1955[var14] = -1;
                } else {
                    var8.field1955[var14] = (byte) var9[this.field1817[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1814; var15++) {
            byte var16;
            if (this.field1810 == null) {
                var16 = 0;
            } else {
                var16 = this.field1810[var15];
            }
            byte var17;
            if (this.field1855 == null) {
                var17 = 0;
            } else {
                var17 = this.field1855[var15];
            }
            short var18;
            if (this.field1823 == null) {
                var18 = -1;
            } else {
                var18 = this.field1823[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1822[var15] & 0xFFFF;
                    class136 var20;
                    if (this.field1852 == null || this.field1852[this.field1853[var15]] == null) {
                        var20 = this.field1815[this.field1853[var15]];
                    } else {
                        var20 = this.field1852[this.field1853[var15]];
                    }
                    int var21 = (var20.field2022 * arg4 + var20.field2026 * arg3 + var20.field2020 * arg2) / (var20.field2023 * var7) + arg0;
                    var8.field1950[var15] = method2199(var19, var21);
                    class136 var22;
                    if (this.field1852 == null || this.field1852[this.field1816[var15]] == null) {
                        var22 = this.field1815[this.field1816[var15]];
                    } else {
                        var22 = this.field1852[this.field1816[var15]];
                    }
                    int var23 = (var22.field2022 * arg4 + var22.field2026 * arg3 + var22.field2020 * arg2) / (var22.field2023 * var7) + arg0;
                    var8.field1975[var15] = method2199(var19, var23);
                    class136 var24;
                    if (this.field1852 == null || this.field1852[this.field1843[var15]] == null) {
                        var24 = this.field1815[this.field1843[var15]];
                    } else {
                        var24 = this.field1852[this.field1843[var15]];
                    }
                    int var25 = (var24.field2022 * arg4 + var24.field2026 * arg3 + var24.field2020 * arg2) / (var24.field2023 * var7) + arg0;
                    var8.field1952[var15] = method2199(var19, var25);
                } else if (var16 == 1) {
                    class144 var26 = this.field1841[var15];
                    int var27 = (var26.field2153 * arg4 + var26.field2157 * arg2 + var26.field2154 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1950[var15] = method2199(this.field1822[var15] & 0xFFFF, var27);
                    var8.field1952[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1950[var15] = 128;
                    var8.field1952[var15] = -1;
                } else {
                    var8.field1952[var15] = -2;
                }
            } else if (var16 == 0) {
                class136 var28;
                if (this.field1852 == null || this.field1852[this.field1853[var15]] == null) {
                    var28 = this.field1815[this.field1853[var15]];
                } else {
                    var28 = this.field1852[this.field1853[var15]];
                }
                int var29 = (var28.field2022 * arg4 + var28.field2026 * arg3 + var28.field2020 * arg2) / (var28.field2023 * var7) + arg0;
                var8.field1950[var15] = method2200(var29);
                class136 var30;
                if (this.field1852 == null || this.field1852[this.field1816[var15]] == null) {
                    var30 = this.field1815[this.field1816[var15]];
                } else {
                    var30 = this.field1852[this.field1816[var15]];
                }
                int var31 = (var30.field2022 * arg4 + var30.field2026 * arg3 + var30.field2020 * arg2) / (var30.field2023 * var7) + arg0;
                var8.field1975[var15] = method2200(var31);
                class136 var32;
                if (this.field1852 == null || this.field1852[this.field1843[var15]] == null) {
                    var32 = this.field1815[this.field1843[var15]];
                } else {
                    var32 = this.field1852[this.field1843[var15]];
                }
                int var33 = (var32.field2022 * arg4 + var32.field2026 * arg3 + var32.field2020 * arg2) / (var32.field2023 * var7) + arg0;
                var8.field1952[var15] = method2200(var33);
            } else if (var16 == 1) {
                class144 var34 = this.field1841[var15];
                int var35 = (var34.field2153 * arg4 + var34.field2157 * arg2 + var34.field2154 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1950[var15] = method2200(var35);
                var8.field1952[var15] = -1;
            } else {
                var8.field1952[var15] = -2;
            }
        }
        this.method2184();
        var8.field1942 = this.field1831;
        var8.field1943 = this.field1818;
        var8.field1978 = this.field1812;
        var8.field1998 = this.field1813;
        var8.field1946 = this.field1814;
        var8.field1947 = this.field1853;
        var8.field1948 = this.field1816;
        var8.field1949 = this.field1843;
        var8.field1953 = this.field1819;
        var8.field2003 = this.field1855;
        var8.field1957 = this.field1824;
        var8.field1945 = this.field1839;
        var8.field1963 = this.field1840;
        var8.field1956 = this.field1823;
        return var8;
    }

    @ObfuscatedName("dw.ah(II)I")
    public static final int method2199(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("dw.ai(I)I")
    public static final int method2200(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
