package deob;

@ObfuscatedName("de")
public class class127 extends class141 {

    @ObfuscatedName("de.i")
    public int field1807 = 0;

    @ObfuscatedName("de.j")
    public int[] field1824;

    @ObfuscatedName("de.a")
    public int[] field1838;

    @ObfuscatedName("de.r")
    public int[] field1847;

    @ObfuscatedName("de.o")
    public int field1829 = 0;

    @ObfuscatedName("de.n")
    public int[] field1844;

    @ObfuscatedName("de.q")
    public int[] field1812;

    @ObfuscatedName("de.b")
    public int[] field1813;

    @ObfuscatedName("de.k")
    public byte[] field1817;

    @ObfuscatedName("de.s")
    public byte[] field1815;

    @ObfuscatedName("de.d")
    public byte[] field1816;

    @ObfuscatedName("de.l")
    public byte[] field1822;

    @ObfuscatedName("de.t")
    public short[] field1818;

    @ObfuscatedName("de.y")
    public short[] field1819;

    @ObfuscatedName("de.v")
    public byte field1814 = 0;

    @ObfuscatedName("de.c")
    public int field1821;

    @ObfuscatedName("de.z")
    public byte[] field1835;

    @ObfuscatedName("de.u")
    public short[] field1827;

    @ObfuscatedName("de.e")
    public short[] field1832;

    @ObfuscatedName("de.p")
    public short[] field1825;

    @ObfuscatedName("de.m")
    public short[] field1826;

    @ObfuscatedName("de.x")
    public short[] field1820;

    @ObfuscatedName("de.h")
    public short[] field1828;

    @ObfuscatedName("de.f")
    public short[] field1837;

    @ObfuscatedName("de.g")
    public short[] field1830;

    @ObfuscatedName("de.w")
    public short[] field1831;

    @ObfuscatedName("de.ar")
    public byte[] field1810;

    @ObfuscatedName("de.ax")
    public int[] field1833;

    @ObfuscatedName("de.al")
    public int[] field1834;

    @ObfuscatedName("de.ag")
    public int[][] field1836;

    @ObfuscatedName("de.ad")
    public int[][] field1806;

    @ObfuscatedName("de.ab")
    public class143[] field1846;

    @ObfuscatedName("de.am")
    public class135[] field1809;

    @ObfuscatedName("de.aq")
    public class135[] field1839;

    @ObfuscatedName("de.at")
    public short field1840;

    @ObfuscatedName("de.az")
    public short field1841;

    @ObfuscatedName("de.ac")
    public boolean field1842 = false;

    @ObfuscatedName("de.aa")
    public int field1843;

    @ObfuscatedName("de.aj")
    public int field1823;

    @ObfuscatedName("de.ay")
    public int field1845;

    @ObfuscatedName("de.av")
    public int field1808;

    @ObfuscatedName("de.ao")
    public int field1811;

    @ObfuscatedName("de.aw")
    public static int[] field1848 = new int[10000];

    @ObfuscatedName("de.ah")
    public static int[] field1849 = new int[10000];

    @ObfuscatedName("de.an")
    public static int field1850 = 0;

    @ObfuscatedName("de.af")
    public static int[] field1851 = class136.field2045;

    @ObfuscatedName("de.ak")
    public static int[] field1852 = class136.field2029;

    public class127() {
    }

    @ObfuscatedName("de.i(Lii;II)Lde;")
    public static class127 method2209(class237 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3824(arg1, arg2);
        return var3 == null ? null : new class127(var3);
    }

    public class127(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2210(arg0);
        } else {
            this.method2211(arg0);
        }
    }

    @ObfuscatedName("de.j([B)V")
    public void method2210(byte[] arg0) {
        class175 var2 = new class175(arg0);
        class175 var3 = new class175(arg0);
        class175 var4 = new class175(arg0);
        class175 var5 = new class175(arg0);
        class175 var6 = new class175(arg0);
        class175 var7 = new class175(arg0);
        class175 var8 = new class175(arg0);
        var2.field2395 = arg0.length - 23;
        int var9 = var2.method2995();
        int var10 = var2.method2995();
        int var11 = var2.method2999();
        int var12 = var2.method2999();
        int var13 = var2.method2999();
        int var14 = var2.method2999();
        int var15 = var2.method2999();
        int var16 = var2.method2999();
        int var17 = var2.method2999();
        int var18 = var2.method2995();
        int var19 = var2.method2995();
        int var20 = var2.method2995();
        int var21 = var2.method2995();
        int var22 = var2.method2995();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1835 = new byte[var11];
            var2.field2395 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1835[var26] = var2.method3172();
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
        this.field1807 = var9;
        this.field1829 = var10;
        this.field1821 = var11;
        this.field1824 = new int[var9];
        this.field1838 = new int[var9];
        this.field1847 = new int[var9];
        this.field1844 = new int[var10];
        this.field1812 = new int[var10];
        this.field1813 = new int[var10];
        if (var17 == 1) {
            this.field1833 = new int[var9];
        }
        if (var12 == 1) {
            this.field1817 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1815 = new byte[var10];
        } else {
            this.field1814 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1816 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1834 = new int[var10];
        }
        if (var16 == 1) {
            this.field1819 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1822 = new byte[var10];
        }
        this.field1818 = new short[var10];
        if (var11 > 0) {
            this.field1827 = new short[var11];
            this.field1832 = new short[var11];
            this.field1825 = new short[var11];
            if (var24 > 0) {
                this.field1826 = new short[var24];
                this.field1820 = new short[var24];
                this.field1828 = new short[var24];
                this.field1837 = new short[var24];
                this.field1810 = new byte[var24];
                this.field1830 = new short[var24];
            }
            if (var25 > 0) {
                this.field1831 = new short[var25];
            }
        }
        var2.field2395 = var11;
        var3.field2395 = var44;
        var4.field2395 = var46;
        var5.field2395 = var48;
        var6.field2395 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2999();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method3006();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method3006();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method3006();
            }
            this.field1824[var67] = var64 + var69;
            this.field1838[var67] = var65 + var70;
            this.field1847[var67] = var66 + var71;
            var64 = this.field1824[var67];
            var65 = this.field1838[var67];
            var66 = this.field1847[var67];
            if (var17 == 1) {
                this.field1833[var67] = var6.method2999();
            }
        }
        var2.field2395 = var42;
        var3.field2395 = var31;
        var4.field2395 = var34;
        var5.field2395 = var37;
        var6.field2395 = var35;
        var7.field2395 = var40;
        var8.field2395 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1818[var72] = (short) var2.method2995();
            if (var12 == 1) {
                this.field1817[var72] = var3.method3172();
            }
            if (var13 == 255) {
                this.field1815[var72] = var4.method3172();
            }
            if (var14 == 1) {
                this.field1816[var72] = var5.method3172();
            }
            if (var15 == 1) {
                this.field1834[var72] = var6.method2999();
            }
            if (var16 == 1) {
                this.field1819[var72] = (short) (var7.method2995() - 1);
            }
            if (this.field1822 != null && this.field1819[var72] != -1) {
                this.field1822[var72] = (byte) (var8.method2999() - 1);
            }
        }
        var2.field2395 = var33;
        var3.field2395 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2999();
            if (var78 == 1) {
                var73 = var2.method3006() + var76;
                var74 = var2.method3006() + var73;
                var75 = var2.method3006() + var74;
                var76 = var75;
                this.field1844[var77] = var73;
                this.field1812[var77] = var74;
                this.field1813[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method3006() + var76;
                var76 = var75;
                this.field1844[var77] = var73;
                this.field1812[var77] = var74;
                this.field1813[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method3006() + var76;
                var76 = var75;
                this.field1844[var77] = var73;
                this.field1812[var77] = var74;
                this.field1813[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method3006() + var76;
                var76 = var75;
                this.field1844[var77] = var73;
                this.field1812[var77] = var81;
                this.field1813[var77] = var75;
            }
        }
        var2.field2395 = var50;
        var3.field2395 = var52;
        var4.field2395 = var54;
        var5.field2395 = var56;
        var6.field2395 = var58;
        var7.field2395 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1835[var82] & 0xFF;
            if (var83 == 0) {
                this.field1827[var82] = (short) var2.method2995();
                this.field1832[var82] = (short) var2.method2995();
                this.field1825[var82] = (short) var2.method2995();
            }
            if (var83 == 1) {
                this.field1827[var82] = (short) var3.method2995();
                this.field1832[var82] = (short) var3.method2995();
                this.field1825[var82] = (short) var3.method2995();
                this.field1826[var82] = (short) var4.method2995();
                this.field1820[var82] = (short) var4.method2995();
                this.field1828[var82] = (short) var4.method2995();
                this.field1837[var82] = (short) var5.method2995();
                this.field1810[var82] = var6.method3172();
                this.field1830[var82] = (short) var7.method2995();
            }
            if (var83 == 2) {
                this.field1827[var82] = (short) var3.method2995();
                this.field1832[var82] = (short) var3.method2995();
                this.field1825[var82] = (short) var3.method2995();
                this.field1826[var82] = (short) var4.method2995();
                this.field1820[var82] = (short) var4.method2995();
                this.field1828[var82] = (short) var4.method2995();
                this.field1837[var82] = (short) var5.method2995();
                this.field1810[var82] = var6.method3172();
                this.field1830[var82] = (short) var7.method2995();
                this.field1831[var82] = (short) var7.method2995();
            }
            if (var83 == 3) {
                this.field1827[var82] = (short) var3.method2995();
                this.field1832[var82] = (short) var3.method2995();
                this.field1825[var82] = (short) var3.method2995();
                this.field1826[var82] = (short) var4.method2995();
                this.field1820[var82] = (short) var4.method2995();
                this.field1828[var82] = (short) var4.method2995();
                this.field1837[var82] = (short) var5.method2995();
                this.field1810[var82] = var6.method3172();
                this.field1830[var82] = (short) var7.method2995();
            }
        }
        var2.field2395 = var62;
        int var84 = var2.method2999();
        if (var84 == 0) {
            return;
        }
        new class140();
        var2.method2995();
        var2.method2995();
        var2.method2995();
        var2.method2998();
    }

    @ObfuscatedName("de.r([B)V")
    public void method2211(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class175 var4 = new class175(arg0);
        class175 var5 = new class175(arg0);
        class175 var6 = new class175(arg0);
        class175 var7 = new class175(arg0);
        class175 var8 = new class175(arg0);
        var4.field2395 = arg0.length - 18;
        int var9 = var4.method2995();
        int var10 = var4.method2995();
        int var11 = var4.method2999();
        int var12 = var4.method2999();
        int var13 = var4.method2999();
        int var14 = var4.method2999();
        int var15 = var4.method2999();
        int var16 = var4.method2999();
        int var17 = var4.method2995();
        int var18 = var4.method2995();
        int var19 = var4.method2995();
        int var20 = var4.method2995();
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
        this.field1807 = var9;
        this.field1829 = var10;
        this.field1821 = var11;
        this.field1824 = new int[var9];
        this.field1838 = new int[var9];
        this.field1847 = new int[var9];
        this.field1844 = new int[var10];
        this.field1812 = new int[var10];
        this.field1813 = new int[var10];
        if (var11 > 0) {
            this.field1835 = new byte[var11];
            this.field1827 = new short[var11];
            this.field1832 = new short[var11];
            this.field1825 = new short[var11];
        }
        if (var16 == 1) {
            this.field1833 = new int[var9];
        }
        if (var12 == 1) {
            this.field1817 = new byte[var10];
            this.field1822 = new byte[var10];
            this.field1819 = new short[var10];
        }
        if (var13 == 255) {
            this.field1815 = new byte[var10];
        } else {
            this.field1814 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1816 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1834 = new int[var10];
        }
        this.field1818 = new short[var10];
        var4.field2395 = var21;
        var5.field2395 = var36;
        var6.field2395 = var38;
        var7.field2395 = var40;
        var8.field2395 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2999();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method3006();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method3006();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method3006();
            }
            this.field1824[var46] = var43 + var48;
            this.field1838[var46] = var44 + var49;
            this.field1847[var46] = var45 + var50;
            var43 = this.field1824[var46];
            var44 = this.field1838[var46];
            var45 = this.field1847[var46];
            if (var16 == 1) {
                this.field1833[var46] = var8.method2999();
            }
        }
        var4.field2395 = var32;
        var5.field2395 = var28;
        var6.field2395 = var26;
        var7.field2395 = var30;
        var8.field2395 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1818[var51] = (short) var4.method2995();
            if (var12 == 1) {
                int var52 = var5.method2999();
                if ((var52 & 0x1) == 1) {
                    this.field1817[var51] = 1;
                    var2 = true;
                } else {
                    this.field1817[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1822[var51] = (byte) (var52 >> 2);
                    this.field1819[var51] = this.field1818[var51];
                    this.field1818[var51] = 127;
                    if (this.field1819[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1822[var51] = -1;
                    this.field1819[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1815[var51] = var6.method3172();
            }
            if (var14 == 1) {
                this.field1816[var51] = var7.method3172();
            }
            if (var15 == 1) {
                this.field1834[var51] = var8.method2999();
            }
        }
        var4.field2395 = var25;
        var5.field2395 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2999();
            if (var58 == 1) {
                var53 = var4.method3006() + var56;
                var54 = var4.method3006() + var53;
                var55 = var4.method3006() + var54;
                var56 = var55;
                this.field1844[var57] = var53;
                this.field1812[var57] = var54;
                this.field1813[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method3006() + var56;
                var56 = var55;
                this.field1844[var57] = var53;
                this.field1812[var57] = var54;
                this.field1813[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method3006() + var56;
                var56 = var55;
                this.field1844[var57] = var53;
                this.field1812[var57] = var54;
                this.field1813[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method3006() + var56;
                var56 = var55;
                this.field1844[var57] = var53;
                this.field1812[var57] = var61;
                this.field1813[var57] = var55;
            }
        }
        var4.field2395 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1835[var62] = 0;
            this.field1827[var62] = (short) var4.method2995();
            this.field1832[var62] = (short) var4.method2995();
            this.field1825[var62] = (short) var4.method2995();
        }
        if (this.field1822 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1822[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1827[var65] & 0xFFFF) == this.field1844[var64] && (this.field1832[var65] & 0xFFFF) == this.field1812[var64] && (this.field1825[var65] & 0xFFFF) == this.field1813[var64]) {
                        this.field1822[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1822 = null;
            }
        }
        if (!var3) {
            this.field1819 = null;
        }
        if (!var2) {
            this.field1817 = null;
        }
    }

    public class127(class127[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1807 = 0;
        this.field1829 = 0;
        this.field1821 = 0;
        this.field1814 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class127 var10 = arg0[var9];
            if (var10 != null) {
                this.field1807 += var10.field1807;
                this.field1829 += var10.field1829;
                this.field1821 += var10.field1821;
                if (var10.field1815 == null) {
                    if (this.field1814 == -1) {
                        this.field1814 = var10.field1814;
                    }
                    if (this.field1814 != var10.field1814) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1817 != null;
                var5 |= var10.field1816 != null;
                var6 |= var10.field1834 != null;
                var7 |= var10.field1819 != null;
                var8 |= var10.field1822 != null;
            }
        }
        this.field1824 = new int[this.field1807];
        this.field1838 = new int[this.field1807];
        this.field1847 = new int[this.field1807];
        this.field1833 = new int[this.field1807];
        this.field1844 = new int[this.field1829];
        this.field1812 = new int[this.field1829];
        this.field1813 = new int[this.field1829];
        if (var3) {
            this.field1817 = new byte[this.field1829];
        }
        if (var4) {
            this.field1815 = new byte[this.field1829];
        }
        if (var5) {
            this.field1816 = new byte[this.field1829];
        }
        if (var6) {
            this.field1834 = new int[this.field1829];
        }
        if (var7) {
            this.field1819 = new short[this.field1829];
        }
        if (var8) {
            this.field1822 = new byte[this.field1829];
        }
        this.field1818 = new short[this.field1829];
        if (this.field1821 > 0) {
            this.field1835 = new byte[this.field1821];
            this.field1827 = new short[this.field1821];
            this.field1832 = new short[this.field1821];
            this.field1825 = new short[this.field1821];
            this.field1826 = new short[this.field1821];
            this.field1820 = new short[this.field1821];
            this.field1828 = new short[this.field1821];
            this.field1837 = new short[this.field1821];
            this.field1810 = new byte[this.field1821];
            this.field1830 = new short[this.field1821];
            this.field1831 = new short[this.field1821];
        }
        this.field1807 = 0;
        this.field1829 = 0;
        this.field1821 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class127 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1829; var13++) {
                    if (var3 && var12.field1817 != null) {
                        this.field1817[this.field1829] = var12.field1817[var13];
                    }
                    if (var4) {
                        if (var12.field1815 == null) {
                            this.field1815[this.field1829] = var12.field1814;
                        } else {
                            this.field1815[this.field1829] = var12.field1815[var13];
                        }
                    }
                    if (var5 && var12.field1816 != null) {
                        this.field1816[this.field1829] = var12.field1816[var13];
                    }
                    if (var6 && var12.field1834 != null) {
                        this.field1834[this.field1829] = var12.field1834[var13];
                    }
                    if (var7) {
                        if (var12.field1819 == null) {
                            this.field1819[this.field1829] = -1;
                        } else {
                            this.field1819[this.field1829] = var12.field1819[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1822 == null || var12.field1822[var13] == -1) {
                            this.field1822[this.field1829] = -1;
                        } else {
                            this.field1822[this.field1829] = (byte) (var12.field1822[var13] + this.field1821);
                        }
                    }
                    this.field1818[this.field1829] = var12.field1818[var13];
                    this.field1844[this.field1829] = this.method2212(var12, var12.field1844[var13]);
                    this.field1812[this.field1829] = this.method2212(var12, var12.field1812[var13]);
                    this.field1813[this.field1829] = this.method2212(var12, var12.field1813[var13]);
                    this.field1829++;
                }
                for (int var14 = 0; var14 < var12.field1821; var14++) {
                    byte var15 = this.field1835[this.field1821] = var12.field1835[var14];
                    if (var15 == 0) {
                        this.field1827[this.field1821] = (short) this.method2212(var12, var12.field1827[var14]);
                        this.field1832[this.field1821] = (short) this.method2212(var12, var12.field1832[var14]);
                        this.field1825[this.field1821] = (short) this.method2212(var12, var12.field1825[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1827[this.field1821] = var12.field1827[var14];
                        this.field1832[this.field1821] = var12.field1832[var14];
                        this.field1825[this.field1821] = var12.field1825[var14];
                        this.field1826[this.field1821] = var12.field1826[var14];
                        this.field1820[this.field1821] = var12.field1820[var14];
                        this.field1828[this.field1821] = var12.field1828[var14];
                        this.field1837[this.field1821] = var12.field1837[var14];
                        this.field1810[this.field1821] = var12.field1810[var14];
                        this.field1830[this.field1821] = var12.field1830[var14];
                    }
                    if (var15 == 2) {
                        this.field1831[this.field1821] = var12.field1831[var14];
                    }
                    this.field1821++;
                }
            }
        }
    }

    @ObfuscatedName("de.o(Lde;I)I")
    public final int method2212(class127 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1824[arg1];
        int var5 = arg0.field1838[arg1];
        int var6 = arg0.field1847[arg1];
        for (int var7 = 0; var7 < this.field1807; var7++) {
            if (this.field1824[var7] == var4 && this.field1838[var7] == var5 && this.field1847[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1824[this.field1807] = var4;
            this.field1838[this.field1807] = var5;
            this.field1847[this.field1807] = var6;
            if (arg0.field1833 != null) {
                this.field1833[this.field1807] = arg0.field1833[arg1];
            }
            var3 = this.field1807++;
        }
        return var3;
    }

    public class127(class127 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1807 = arg0.field1807;
        this.field1829 = arg0.field1829;
        this.field1821 = arg0.field1821;
        if (arg1) {
            this.field1824 = arg0.field1824;
            this.field1838 = arg0.field1838;
            this.field1847 = arg0.field1847;
        } else {
            this.field1824 = new int[this.field1807];
            this.field1838 = new int[this.field1807];
            this.field1847 = new int[this.field1807];
            for (int var6 = 0; var6 < this.field1807; var6++) {
                this.field1824[var6] = arg0.field1824[var6];
                this.field1838[var6] = arg0.field1838[var6];
                this.field1847[var6] = arg0.field1847[var6];
            }
        }
        if (arg2) {
            this.field1818 = arg0.field1818;
        } else {
            this.field1818 = new short[this.field1829];
            for (int var7 = 0; var7 < this.field1829; var7++) {
                this.field1818[var7] = arg0.field1818[var7];
            }
        }
        if (arg3 || arg0.field1819 == null) {
            this.field1819 = arg0.field1819;
        } else {
            this.field1819 = new short[this.field1829];
            for (int var8 = 0; var8 < this.field1829; var8++) {
                this.field1819[var8] = arg0.field1819[var8];
            }
        }
        if (arg4) {
            this.field1816 = arg0.field1816;
        } else {
            this.field1816 = new byte[this.field1829];
            if (arg0.field1816 == null) {
                for (int var9 = 0; var9 < this.field1829; var9++) {
                    this.field1816[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1829; var10++) {
                    this.field1816[var10] = arg0.field1816[var10];
                }
            }
        }
        this.field1844 = arg0.field1844;
        this.field1812 = arg0.field1812;
        this.field1813 = arg0.field1813;
        this.field1817 = arg0.field1817;
        this.field1815 = arg0.field1815;
        this.field1822 = arg0.field1822;
        this.field1814 = arg0.field1814;
        this.field1835 = arg0.field1835;
        this.field1827 = arg0.field1827;
        this.field1832 = arg0.field1832;
        this.field1825 = arg0.field1825;
        this.field1826 = arg0.field1826;
        this.field1820 = arg0.field1820;
        this.field1828 = arg0.field1828;
        this.field1837 = arg0.field1837;
        this.field1810 = arg0.field1810;
        this.field1830 = arg0.field1830;
        this.field1831 = arg0.field1831;
        this.field1833 = arg0.field1833;
        this.field1834 = arg0.field1834;
        this.field1836 = arg0.field1836;
        this.field1806 = arg0.field1806;
        this.field1809 = arg0.field1809;
        this.field1846 = arg0.field1846;
        this.field1839 = arg0.field1839;
        this.field1840 = arg0.field1840;
        this.field1841 = arg0.field1841;
    }

    @ObfuscatedName("de.n()Lde;")
    public class127 method2213() {
        class127 var1 = new class127();
        if (this.field1817 != null) {
            var1.field1817 = new byte[this.field1829];
            for (int var2 = 0; var2 < this.field1829; var2++) {
                var1.field1817[var2] = this.field1817[var2];
            }
        }
        var1.field1807 = this.field1807;
        var1.field1829 = this.field1829;
        var1.field1821 = this.field1821;
        var1.field1824 = this.field1824;
        var1.field1838 = this.field1838;
        var1.field1847 = this.field1847;
        var1.field1844 = this.field1844;
        var1.field1812 = this.field1812;
        var1.field1813 = this.field1813;
        var1.field1815 = this.field1815;
        var1.field1816 = this.field1816;
        var1.field1822 = this.field1822;
        var1.field1818 = this.field1818;
        var1.field1819 = this.field1819;
        var1.field1814 = this.field1814;
        var1.field1835 = this.field1835;
        var1.field1827 = this.field1827;
        var1.field1832 = this.field1832;
        var1.field1825 = this.field1825;
        var1.field1826 = this.field1826;
        var1.field1820 = this.field1820;
        var1.field1828 = this.field1828;
        var1.field1837 = this.field1837;
        var1.field1810 = this.field1810;
        var1.field1830 = this.field1830;
        var1.field1831 = this.field1831;
        var1.field1833 = this.field1833;
        var1.field1834 = this.field1834;
        var1.field1836 = this.field1836;
        var1.field1806 = this.field1806;
        var1.field1809 = this.field1809;
        var1.field1846 = this.field1846;
        var1.field1840 = this.field1840;
        var1.field1841 = this.field1841;
        return var1;
    }

    @ObfuscatedName("de.q([[IIIIZI)Lde;")
    public class127 method2218(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2227();
        int var7 = this.field1823 + arg1;
        int var8 = this.field1845 + arg1;
        int var9 = this.field1811 + arg3;
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
        class127 var15;
        if (arg4) {
            var15 = new class127();
            var15.field1807 = this.field1807;
            var15.field1829 = this.field1829;
            var15.field1821 = this.field1821;
            var15.field1824 = this.field1824;
            var15.field1847 = this.field1847;
            var15.field1844 = this.field1844;
            var15.field1812 = this.field1812;
            var15.field1813 = this.field1813;
            var15.field1817 = this.field1817;
            var15.field1815 = this.field1815;
            var15.field1816 = this.field1816;
            var15.field1822 = this.field1822;
            var15.field1818 = this.field1818;
            var15.field1819 = this.field1819;
            var15.field1814 = this.field1814;
            var15.field1835 = this.field1835;
            var15.field1827 = this.field1827;
            var15.field1832 = this.field1832;
            var15.field1825 = this.field1825;
            var15.field1826 = this.field1826;
            var15.field1820 = this.field1820;
            var15.field1828 = this.field1828;
            var15.field1837 = this.field1837;
            var15.field1810 = this.field1810;
            var15.field1830 = this.field1830;
            var15.field1831 = this.field1831;
            var15.field1833 = this.field1833;
            var15.field1834 = this.field1834;
            var15.field1836 = this.field1836;
            var15.field1806 = this.field1806;
            var15.field1840 = this.field1840;
            var15.field1841 = this.field1841;
            var15.field1838 = new int[var15.field1807];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1807; var16++) {
                int var17 = this.field1824[var16] + arg1;
                int var18 = this.field1847[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1838[var16] = this.field1838[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1807; var26++) {
                int var27 = (-this.field1838[var26] << 16) / this.field2129;
                if (var27 < arg5) {
                    int var28 = this.field1824[var26] + arg1;
                    int var29 = this.field1847[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1838[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1838[var26];
                }
            }
        }
        var15.method2226();
        return var15;
    }

    @ObfuscatedName("de.b()V")
    public void method2274() {
        int var10002;
        if (this.field1833 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1807; var3++) {
                int var4 = this.field1833[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1836 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1836[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1807) {
                int var7 = this.field1833[var6];
                this.field1836[var7][var1[var7]++] = var6++;
            }
            this.field1833 = null;
        }
        if (this.field1834 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1829; var10++) {
            int var11 = this.field1834[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1806 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1806[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1829) {
            int var14 = this.field1834[var13];
            this.field1806[var14][var8[var14]++] = var13++;
        }
        this.field1834 = null;
    }

    @ObfuscatedName("de.k()V")
    public void method2216() {
        for (int var1 = 0; var1 < this.field1807; var1++) {
            int var2 = this.field1824[var1];
            this.field1824[var1] = this.field1847[var1];
            this.field1847[var1] = -var2;
        }
        this.method2226();
    }

    @ObfuscatedName("de.d()V")
    public void method2214() {
        for (int var1 = 0; var1 < this.field1807; var1++) {
            this.field1824[var1] = -this.field1824[var1];
            this.field1847[var1] = -this.field1847[var1];
        }
        this.method2226();
    }

    @ObfuscatedName("de.l()V")
    public void method2217() {
        for (int var1 = 0; var1 < this.field1807; var1++) {
            int var2 = this.field1847[var1];
            this.field1847[var1] = this.field1824[var1];
            this.field1824[var1] = -var2;
        }
        this.method2226();
    }

    @ObfuscatedName("de.c(I)V")
    public void method2267(int arg0) {
        int var2 = field1851[arg0];
        int var3 = field1852[arg0];
        for (int var4 = 0; var4 < this.field1807; var4++) {
            int var5 = this.field1847[var4] * var2 + this.field1824[var4] * var3 >> 16;
            this.field1847[var4] = this.field1847[var4] * var3 - this.field1824[var4] * var2 >> 16;
            this.field1824[var4] = var5;
        }
        this.method2226();
    }

    @ObfuscatedName("de.u(III)V")
    public void method2248(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1807; var4++) {
            this.field1824[var4] += arg0;
            this.field1838[var4] += arg1;
            this.field1847[var4] += arg2;
        }
        this.method2226();
    }

    @ObfuscatedName("de.e(SS)V")
    public void method2258(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1829; var3++) {
            if (this.field1818[var3] == arg0) {
                this.field1818[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("de.p(SS)V")
    public void method2260(short arg0, short arg1) {
        if (this.field1819 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1829; var3++) {
            if (this.field1819[var3] == arg0) {
                this.field1819[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("de.m()V")
    public void method2223() {
        for (int var1 = 0; var1 < this.field1807; var1++) {
            this.field1847[var1] = -this.field1847[var1];
        }
        for (int var2 = 0; var2 < this.field1829; var2++) {
            int var3 = this.field1844[var2];
            this.field1844[var2] = this.field1813[var2];
            this.field1813[var2] = var3;
        }
        this.method2226();
    }

    @ObfuscatedName("de.x(III)V")
    public void method2261(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1807; var4++) {
            this.field1824[var4] = this.field1824[var4] * arg0 / 128;
            this.field1838[var4] = this.field1838[var4] * arg1 / 128;
            this.field1847[var4] = this.field1847[var4] * arg2 / 128;
        }
        this.method2226();
    }

    @ObfuscatedName("de.g()V")
    public void method2275() {
        if (this.field1809 != null) {
            return;
        }
        this.field1809 = new class135[this.field1807];
        for (int var1 = 0; var1 < this.field1807; var1++) {
            this.field1809[var1] = new class135();
        }
        for (int var2 = 0; var2 < this.field1829; var2++) {
            int var3 = this.field1844[var2];
            int var4 = this.field1812[var2];
            int var5 = this.field1813[var2];
            int var6 = this.field1824[var4] - this.field1824[var3];
            int var7 = this.field1838[var4] - this.field1838[var3];
            int var8 = this.field1847[var4] - this.field1847[var3];
            int var9 = this.field1824[var5] - this.field1824[var3];
            int var10 = this.field1838[var5] - this.field1838[var3];
            int var11 = this.field1847[var5] - this.field1847[var3];
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
            if (this.field1817 == null) {
                var19 = 0;
            } else {
                var19 = this.field1817[var2];
            }
            if (var19 == 0) {
                class135 var20 = this.field1809[var3];
                var20.field2018 += var16;
                var20.field2015 += var17;
                var20.field2013 += var18;
                var20.field2016++;
                class135 var21 = this.field1809[var4];
                var21.field2018 += var16;
                var21.field2015 += var17;
                var21.field2013 += var18;
                var21.field2016++;
                class135 var22 = this.field1809[var5];
                var22.field2018 += var16;
                var22.field2015 += var17;
                var22.field2013 += var18;
                var22.field2016++;
            } else if (var19 == 1) {
                if (this.field1846 == null) {
                    this.field1846 = new class143[this.field1829];
                }
                class143 var23 = this.field1846[var2] = new class143();
                var23.field2143 = var16;
                var23.field2142 = var17;
                var23.field2141 = var18;
            }
        }
    }

    @ObfuscatedName("de.w()V")
    public void method2226() {
        this.field1809 = null;
        this.field1839 = null;
        this.field1846 = null;
        this.field1842 = false;
    }

    @ObfuscatedName("de.ar()V")
    public void method2227() {
        if (this.field1842) {
            return;
        }
        this.field2129 = 0;
        this.field1843 = 0;
        this.field1823 = 999999;
        this.field1845 = -999999;
        this.field1808 = -99999;
        this.field1811 = 99999;
        for (int var1 = 0; var1 < this.field1807; var1++) {
            int var2 = this.field1824[var1];
            int var3 = this.field1838[var1];
            int var4 = this.field1847[var1];
            if (var2 < this.field1823) {
                this.field1823 = var2;
            }
            if (var2 > this.field1845) {
                this.field1845 = var2;
            }
            if (var4 < this.field1811) {
                this.field1811 = var4;
            }
            if (var4 > this.field1808) {
                this.field1808 = var4;
            }
            if (-var3 > this.field2129) {
                this.field2129 = -var3;
            }
            if (var3 > this.field1843) {
                this.field1843 = var3;
            }
        }
        this.field1842 = true;
    }

    @ObfuscatedName("de.ax(Lde;Lde;IIIZ)V")
    public static void method2228(class127 arg0, class127 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2227();
        arg0.method2275();
        arg1.method2227();
        arg1.method2275();
        field1850++;
        int var6 = 0;
        int[] var7 = arg1.field1824;
        int var8 = arg1.field1807;
        for (int var9 = 0; var9 < arg0.field1807; var9++) {
            class135 var10 = arg0.field1809[var9];
            if (var10.field2016 != 0) {
                int var11 = arg0.field1838[var9] - arg3;
                if (var11 <= arg1.field1843) {
                    int var12 = arg0.field1824[var9] - arg2;
                    if (var12 >= arg1.field1823 && var12 <= arg1.field1845) {
                        int var13 = arg0.field1847[var9] - arg4;
                        if (var13 >= arg1.field1811 && var13 <= arg1.field1808) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class135 var15 = arg1.field1809[var14];
                                if (var7[var14] == var12 && arg1.field1847[var14] == var13 && arg1.field1838[var14] == var11 && var15.field2016 != 0) {
                                    if (arg0.field1839 == null) {
                                        arg0.field1839 = new class135[arg0.field1807];
                                    }
                                    if (arg1.field1839 == null) {
                                        arg1.field1839 = new class135[var8];
                                    }
                                    class135 var16 = arg0.field1839[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1839[var9] = new class135(var10);
                                    }
                                    class135 var17 = arg1.field1839[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1839[var14] = new class135(var15);
                                    }
                                    var16.field2018 += var15.field2018;
                                    var16.field2015 += var15.field2015;
                                    var16.field2013 += var15.field2013;
                                    var16.field2016 += var15.field2016;
                                    var17.field2018 += var10.field2018;
                                    var17.field2015 += var10.field2015;
                                    var17.field2013 += var10.field2013;
                                    var17.field2016 += var10.field2016;
                                    var6++;
                                    field1848[var9] = field1850;
                                    field1849[var14] = field1850;
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
        for (int var18 = 0; var18 < arg0.field1829; var18++) {
            if (field1848[arg0.field1844[var18]] == field1850 && field1848[arg0.field1812[var18]] == field1850 && field1848[arg0.field1813[var18]] == field1850) {
                if (arg0.field1817 == null) {
                    arg0.field1817 = new byte[arg0.field1829];
                }
                arg0.field1817[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1829; var19++) {
            if (field1849[arg1.field1844[var19]] == field1850 && field1849[arg1.field1812[var19]] == field1850 && field1849[arg1.field1813[var19]] == field1850) {
                if (arg1.field1817 == null) {
                    arg1.field1817 = new byte[arg1.field1829];
                }
                arg1.field1817[var19] = 2;
            }
        }
    }

    @ObfuscatedName("de.al(IIIII)Lem;")
    public final class133 method2264(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2275();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class133 var8 = new class133();
        var8.field1944 = new int[this.field1829];
        var8.field1945 = new int[this.field1829];
        var8.field2001 = new int[this.field1829];
        if (this.field1821 > 0 && this.field1822 != null) {
            int[] var9 = new int[this.field1821];
            for (int var10 = 0; var10 < this.field1829; var10++) {
                if (this.field1822[var10] != -1) {
                    var9[this.field1822[var10] & 0xFF]++;
                }
            }
            var8.field1952 = 0;
            for (int var11 = 0; var11 < this.field1821; var11++) {
                if (var9[var11] > 0 && this.field1835[var11] == 0) {
                    var8.field1952++;
                }
            }
            var8.field1932 = new int[var8.field1952];
            var8.field1954 = new int[var8.field1952];
            var8.field1955 = new int[var8.field1952];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1821; var13++) {
                if (var9[var13] > 0 && this.field1835[var13] == 0) {
                    var8.field1932[var12] = this.field1827[var13] & 0xFFFF;
                    var8.field1954[var12] = this.field1832[var13] & 0xFFFF;
                    var8.field1955[var12] = this.field1825[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1949 = new byte[this.field1829];
            for (int var14 = 0; var14 < this.field1829; var14++) {
                if (this.field1822[var14] == -1) {
                    var8.field1949[var14] = -1;
                } else {
                    var8.field1949[var14] = (byte) var9[this.field1822[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1829; var15++) {
            byte var16;
            if (this.field1817 == null) {
                var16 = 0;
            } else {
                var16 = this.field1817[var15];
            }
            byte var17;
            if (this.field1816 == null) {
                var17 = 0;
            } else {
                var17 = this.field1816[var15];
            }
            short var18;
            if (this.field1819 == null) {
                var18 = -1;
            } else {
                var18 = this.field1819[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1818[var15] & 0xFFFF;
                    class135 var20;
                    if (this.field1839 == null || this.field1839[this.field1844[var15]] == null) {
                        var20 = this.field1809[this.field1844[var15]];
                    } else {
                        var20 = this.field1839[this.field1844[var15]];
                    }
                    int var21 = (var20.field2013 * arg4 + var20.field2018 * arg2 + var20.field2015 * arg3) / (var20.field2016 * var7) + arg0;
                    var8.field1944[var15] = method2230(var19, var21);
                    class135 var22;
                    if (this.field1839 == null || this.field1839[this.field1812[var15]] == null) {
                        var22 = this.field1809[this.field1812[var15]];
                    } else {
                        var22 = this.field1839[this.field1812[var15]];
                    }
                    int var23 = (var22.field2013 * arg4 + var22.field2018 * arg2 + var22.field2015 * arg3) / (var22.field2016 * var7) + arg0;
                    var8.field1945[var15] = method2230(var19, var23);
                    class135 var24;
                    if (this.field1839 == null || this.field1839[this.field1813[var15]] == null) {
                        var24 = this.field1809[this.field1813[var15]];
                    } else {
                        var24 = this.field1839[this.field1813[var15]];
                    }
                    int var25 = (var24.field2013 * arg4 + var24.field2018 * arg2 + var24.field2015 * arg3) / (var24.field2016 * var7) + arg0;
                    var8.field2001[var15] = method2230(var19, var25);
                } else if (var16 == 1) {
                    class143 var26 = this.field1846[var15];
                    int var27 = (var26.field2141 * arg4 + var26.field2143 * arg2 + var26.field2142 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1944[var15] = method2230(this.field1818[var15] & 0xFFFF, var27);
                    var8.field2001[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1944[var15] = 128;
                    var8.field2001[var15] = -1;
                } else {
                    var8.field2001[var15] = -2;
                }
            } else if (var16 == 0) {
                class135 var28;
                if (this.field1839 == null || this.field1839[this.field1844[var15]] == null) {
                    var28 = this.field1809[this.field1844[var15]];
                } else {
                    var28 = this.field1839[this.field1844[var15]];
                }
                int var29 = (var28.field2013 * arg4 + var28.field2018 * arg2 + var28.field2015 * arg3) / (var28.field2016 * var7) + arg0;
                var8.field1944[var15] = method2231(var29);
                class135 var30;
                if (this.field1839 == null || this.field1839[this.field1812[var15]] == null) {
                    var30 = this.field1809[this.field1812[var15]];
                } else {
                    var30 = this.field1839[this.field1812[var15]];
                }
                int var31 = (var30.field2013 * arg4 + var30.field2018 * arg2 + var30.field2015 * arg3) / (var30.field2016 * var7) + arg0;
                var8.field1945[var15] = method2231(var31);
                class135 var32;
                if (this.field1839 == null || this.field1839[this.field1813[var15]] == null) {
                    var32 = this.field1809[this.field1813[var15]];
                } else {
                    var32 = this.field1839[this.field1813[var15]];
                }
                int var33 = (var32.field2013 * arg4 + var32.field2018 * arg2 + var32.field2015 * arg3) / (var32.field2016 * var7) + arg0;
                var8.field2001[var15] = method2231(var33);
            } else if (var16 == 1) {
                class143 var34 = this.field1846[var15];
                int var35 = (var34.field2141 * arg4 + var34.field2143 * arg2 + var34.field2142 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1944[var15] = method2231(var35);
                var8.field2001[var15] = -1;
            } else {
                var8.field2001[var15] = -2;
            }
        }
        this.method2274();
        var8.field1936 = this.field1807;
        var8.field1937 = this.field1824;
        var8.field1953 = this.field1838;
        var8.field1939 = this.field1847;
        var8.field1940 = this.field1829;
        var8.field1941 = this.field1844;
        var8.field1942 = this.field1812;
        var8.field1986 = this.field1813;
        var8.field1947 = this.field1815;
        var8.field1985 = this.field1816;
        var8.field1999 = this.field1814;
        var8.field1956 = this.field1836;
        var8.field1961 = this.field1806;
        var8.field1950 = this.field1819;
        return var8;
    }

    @ObfuscatedName("de.ag(II)I")
    public static final int method2230(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("de.ad(I)I")
    public static final int method2231(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
