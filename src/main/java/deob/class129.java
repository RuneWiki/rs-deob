package deob;

@ObfuscatedName("di")
public class class129 extends class143 {

    @ObfuscatedName("di.j")
    public int field1835 = 0;

    @ObfuscatedName("di.h")
    public int[] field1800;

    @ObfuscatedName("di.f")
    public int[] field1801;

    @ObfuscatedName("di.p")
    public int[] field1840;

    @ObfuscatedName("di.x")
    public int field1836 = 0;

    @ObfuscatedName("di.g")
    public int[] field1804;

    @ObfuscatedName("di.c")
    public int[] field1805;

    @ObfuscatedName("di.l")
    public int[] field1806;

    @ObfuscatedName("di.w")
    public byte[] field1807;

    @ObfuscatedName("di.b")
    public byte[] field1815;

    @ObfuscatedName("di.o")
    public byte[] field1816;

    @ObfuscatedName("di.m")
    public byte[] field1810;

    @ObfuscatedName("di.i")
    public short[] field1811;

    @ObfuscatedName("di.s")
    public short[] field1834;

    @ObfuscatedName("di.r")
    public byte field1802 = 0;

    @ObfuscatedName("di.e")
    public int field1820;

    @ObfuscatedName("di.a")
    public byte[] field1830;

    @ObfuscatedName("di.v")
    public short[] field1826;

    @ObfuscatedName("di.t")
    public short[] field1812;

    @ObfuscatedName("di.y")
    public short[] field1818;

    @ObfuscatedName("di.z")
    public short[] field1814;

    @ObfuscatedName("di.u")
    public short[] field1809;

    @ObfuscatedName("di.k")
    public short[] field1821;

    @ObfuscatedName("di.q")
    public short[] field1822;

    @ObfuscatedName("di.n")
    public short[] field1823;

    @ObfuscatedName("di.d")
    public short[] field1824;

    @ObfuscatedName("di.ax")
    public byte[] field1825;

    @ObfuscatedName("di.ao")
    public int[] field1803;

    @ObfuscatedName("di.an")
    public int[] field1827;

    @ObfuscatedName("di.ar")
    public int[][] field1841;

    @ObfuscatedName("di.ag")
    public int[][] field1829;

    @ObfuscatedName("di.av")
    public class145[] field1828;

    @ObfuscatedName("di.ab")
    public class137[] field1831;

    @ObfuscatedName("di.aj")
    public class137[] field1832;

    @ObfuscatedName("di.ae")
    public short field1833;

    @ObfuscatedName("di.at")
    public short field1819;

    @ObfuscatedName("di.as")
    public boolean field1808 = false;

    @ObfuscatedName("di.af")
    public int field1813;

    @ObfuscatedName("di.au")
    public int field1837;

    @ObfuscatedName("di.az")
    public int field1838;

    @ObfuscatedName("di.al")
    public int field1839;

    @ObfuscatedName("di.am")
    public int field1799;

    @ObfuscatedName("di.ah")
    public static int[] field1817 = new int[10000];

    @ObfuscatedName("di.ap")
    public static int[] field1842 = new int[10000];

    @ObfuscatedName("di.ad")
    public static int field1843 = 0;

    @ObfuscatedName("di.aa")
    public static int[] field1844 = class138.field2041;

    @ObfuscatedName("di.aw")
    public static int[] field1845 = class138.field2030;

    public class129() {
    }

    @ObfuscatedName("di.j(Lia;II)Ldi;")
    public static class129 method2208(class237 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3773(arg1, arg2);
        return var3 == null ? null : new class129(var3);
    }

    public class129(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2210(arg0);
        } else {
            this.method2211(arg0);
        }
    }

    @ObfuscatedName("di.h([B)V")
    public void method2210(byte[] arg0) {
        class175 var2 = new class175(arg0);
        class175 var3 = new class175(arg0);
        class175 var4 = new class175(arg0);
        class175 var5 = new class175(arg0);
        class175 var6 = new class175(arg0);
        class175 var7 = new class175(arg0);
        class175 var8 = new class175(arg0);
        var2.field2394 = arg0.length - 23;
        int var9 = var2.method3023();
        int var10 = var2.method3023();
        int var11 = var2.method2903();
        int var12 = var2.method2903();
        int var13 = var2.method2903();
        int var14 = var2.method2903();
        int var15 = var2.method2903();
        int var16 = var2.method2903();
        int var17 = var2.method2903();
        int var18 = var2.method3023();
        int var19 = var2.method3023();
        int var20 = var2.method3023();
        int var21 = var2.method3023();
        int var22 = var2.method3023();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1830 = new byte[var11];
            var2.field2394 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1830[var26] = var2.method2980();
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
        this.field1835 = var9;
        this.field1836 = var10;
        this.field1820 = var11;
        this.field1800 = new int[var9];
        this.field1801 = new int[var9];
        this.field1840 = new int[var9];
        this.field1804 = new int[var10];
        this.field1805 = new int[var10];
        this.field1806 = new int[var10];
        if (var17 == 1) {
            this.field1803 = new int[var9];
        }
        if (var12 == 1) {
            this.field1807 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1815 = new byte[var10];
        } else {
            this.field1802 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1816 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1827 = new int[var10];
        }
        if (var16 == 1) {
            this.field1834 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1810 = new byte[var10];
        }
        this.field1811 = new short[var10];
        if (var11 > 0) {
            this.field1826 = new short[var11];
            this.field1812 = new short[var11];
            this.field1818 = new short[var11];
            if (var24 > 0) {
                this.field1814 = new short[var24];
                this.field1809 = new short[var24];
                this.field1821 = new short[var24];
                this.field1822 = new short[var24];
                this.field1825 = new byte[var24];
                this.field1823 = new short[var24];
            }
            if (var25 > 0) {
                this.field1824 = new short[var25];
            }
        }
        var2.field2394 = var11;
        var3.field2394 = var44;
        var4.field2394 = var46;
        var5.field2394 = var48;
        var6.field2394 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2903();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2949();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2949();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2949();
            }
            this.field1800[var67] = var64 + var69;
            this.field1801[var67] = var65 + var70;
            this.field1840[var67] = var66 + var71;
            var64 = this.field1800[var67];
            var65 = this.field1801[var67];
            var66 = this.field1840[var67];
            if (var17 == 1) {
                this.field1803[var67] = var6.method2903();
            }
        }
        var2.field2394 = var42;
        var3.field2394 = var31;
        var4.field2394 = var34;
        var5.field2394 = var37;
        var6.field2394 = var35;
        var7.field2394 = var40;
        var8.field2394 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1811[var72] = (short) var2.method3023();
            if (var12 == 1) {
                this.field1807[var72] = var3.method2980();
            }
            if (var13 == 255) {
                this.field1815[var72] = var4.method2980();
            }
            if (var14 == 1) {
                this.field1816[var72] = var5.method2980();
            }
            if (var15 == 1) {
                this.field1827[var72] = var6.method2903();
            }
            if (var16 == 1) {
                this.field1834[var72] = (short) (var7.method3023() - 1);
            }
            if (this.field1810 != null && this.field1834[var72] != -1) {
                this.field1810[var72] = (byte) (var8.method2903() - 1);
            }
        }
        var2.field2394 = var33;
        var3.field2394 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2903();
            if (var78 == 1) {
                var73 = var2.method2949() + var76;
                var74 = var2.method2949() + var73;
                var75 = var2.method2949() + var74;
                var76 = var75;
                this.field1804[var77] = var73;
                this.field1805[var77] = var74;
                this.field1806[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2949() + var76;
                var76 = var75;
                this.field1804[var77] = var73;
                this.field1805[var77] = var74;
                this.field1806[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2949() + var76;
                var76 = var75;
                this.field1804[var77] = var73;
                this.field1805[var77] = var74;
                this.field1806[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2949() + var76;
                var76 = var75;
                this.field1804[var77] = var73;
                this.field1805[var77] = var81;
                this.field1806[var77] = var75;
            }
        }
        var2.field2394 = var50;
        var3.field2394 = var52;
        var4.field2394 = var54;
        var5.field2394 = var56;
        var6.field2394 = var58;
        var7.field2394 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1830[var82] & 0xFF;
            if (var83 == 0) {
                this.field1826[var82] = (short) var2.method3023();
                this.field1812[var82] = (short) var2.method3023();
                this.field1818[var82] = (short) var2.method3023();
            }
            if (var83 == 1) {
                this.field1826[var82] = (short) var3.method3023();
                this.field1812[var82] = (short) var3.method3023();
                this.field1818[var82] = (short) var3.method3023();
                this.field1814[var82] = (short) var4.method3023();
                this.field1809[var82] = (short) var4.method3023();
                this.field1821[var82] = (short) var4.method3023();
                this.field1822[var82] = (short) var5.method3023();
                this.field1825[var82] = var6.method2980();
                this.field1823[var82] = (short) var7.method3023();
            }
            if (var83 == 2) {
                this.field1826[var82] = (short) var3.method3023();
                this.field1812[var82] = (short) var3.method3023();
                this.field1818[var82] = (short) var3.method3023();
                this.field1814[var82] = (short) var4.method3023();
                this.field1809[var82] = (short) var4.method3023();
                this.field1821[var82] = (short) var4.method3023();
                this.field1822[var82] = (short) var5.method3023();
                this.field1825[var82] = var6.method2980();
                this.field1823[var82] = (short) var7.method3023();
                this.field1824[var82] = (short) var7.method3023();
            }
            if (var83 == 3) {
                this.field1826[var82] = (short) var3.method3023();
                this.field1812[var82] = (short) var3.method3023();
                this.field1818[var82] = (short) var3.method3023();
                this.field1814[var82] = (short) var4.method3023();
                this.field1809[var82] = (short) var4.method3023();
                this.field1821[var82] = (short) var4.method3023();
                this.field1822[var82] = (short) var5.method3023();
                this.field1825[var82] = var6.method2980();
                this.field1823[var82] = (short) var7.method3023();
            }
        }
        var2.field2394 = var62;
        int var84 = var2.method2903();
        if (var84 == 0) {
            return;
        }
        new class142();
        var2.method3023();
        var2.method3023();
        var2.method3023();
        var2.method2908();
    }

    @ObfuscatedName("di.p([B)V")
    public void method2211(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class175 var4 = new class175(arg0);
        class175 var5 = new class175(arg0);
        class175 var6 = new class175(arg0);
        class175 var7 = new class175(arg0);
        class175 var8 = new class175(arg0);
        var4.field2394 = arg0.length - 18;
        int var9 = var4.method3023();
        int var10 = var4.method3023();
        int var11 = var4.method2903();
        int var12 = var4.method2903();
        int var13 = var4.method2903();
        int var14 = var4.method2903();
        int var15 = var4.method2903();
        int var16 = var4.method2903();
        int var17 = var4.method3023();
        int var18 = var4.method3023();
        int var19 = var4.method3023();
        int var20 = var4.method3023();
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
        this.field1835 = var9;
        this.field1836 = var10;
        this.field1820 = var11;
        this.field1800 = new int[var9];
        this.field1801 = new int[var9];
        this.field1840 = new int[var9];
        this.field1804 = new int[var10];
        this.field1805 = new int[var10];
        this.field1806 = new int[var10];
        if (var11 > 0) {
            this.field1830 = new byte[var11];
            this.field1826 = new short[var11];
            this.field1812 = new short[var11];
            this.field1818 = new short[var11];
        }
        if (var16 == 1) {
            this.field1803 = new int[var9];
        }
        if (var12 == 1) {
            this.field1807 = new byte[var10];
            this.field1810 = new byte[var10];
            this.field1834 = new short[var10];
        }
        if (var13 == 255) {
            this.field1815 = new byte[var10];
        } else {
            this.field1802 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1816 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1827 = new int[var10];
        }
        this.field1811 = new short[var10];
        var4.field2394 = var21;
        var5.field2394 = var36;
        var6.field2394 = var38;
        var7.field2394 = var40;
        var8.field2394 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2903();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2949();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2949();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2949();
            }
            this.field1800[var46] = var43 + var48;
            this.field1801[var46] = var44 + var49;
            this.field1840[var46] = var45 + var50;
            var43 = this.field1800[var46];
            var44 = this.field1801[var46];
            var45 = this.field1840[var46];
            if (var16 == 1) {
                this.field1803[var46] = var8.method2903();
            }
        }
        var4.field2394 = var32;
        var5.field2394 = var28;
        var6.field2394 = var26;
        var7.field2394 = var30;
        var8.field2394 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1811[var51] = (short) var4.method3023();
            if (var12 == 1) {
                int var52 = var5.method2903();
                if ((var52 & 0x1) == 1) {
                    this.field1807[var51] = 1;
                    var2 = true;
                } else {
                    this.field1807[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1810[var51] = (byte) (var52 >> 2);
                    this.field1834[var51] = this.field1811[var51];
                    this.field1811[var51] = 127;
                    if (this.field1834[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1810[var51] = -1;
                    this.field1834[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1815[var51] = var6.method2980();
            }
            if (var14 == 1) {
                this.field1816[var51] = var7.method2980();
            }
            if (var15 == 1) {
                this.field1827[var51] = var8.method2903();
            }
        }
        var4.field2394 = var25;
        var5.field2394 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2903();
            if (var58 == 1) {
                var53 = var4.method2949() + var56;
                var54 = var4.method2949() + var53;
                var55 = var4.method2949() + var54;
                var56 = var55;
                this.field1804[var57] = var53;
                this.field1805[var57] = var54;
                this.field1806[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2949() + var56;
                var56 = var55;
                this.field1804[var57] = var53;
                this.field1805[var57] = var54;
                this.field1806[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2949() + var56;
                var56 = var55;
                this.field1804[var57] = var53;
                this.field1805[var57] = var54;
                this.field1806[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2949() + var56;
                var56 = var55;
                this.field1804[var57] = var53;
                this.field1805[var57] = var61;
                this.field1806[var57] = var55;
            }
        }
        var4.field2394 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1830[var62] = 0;
            this.field1826[var62] = (short) var4.method3023();
            this.field1812[var62] = (short) var4.method3023();
            this.field1818[var62] = (short) var4.method3023();
        }
        if (this.field1810 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1810[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1826[var65] & 0xFFFF) == this.field1804[var64] && (this.field1812[var65] & 0xFFFF) == this.field1805[var64] && (this.field1818[var65] & 0xFFFF) == this.field1806[var64]) {
                        this.field1810[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1810 = null;
            }
        }
        if (!var3) {
            this.field1834 = null;
        }
        if (!var2) {
            this.field1807 = null;
        }
    }

    public class129(class129[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1835 = 0;
        this.field1836 = 0;
        this.field1820 = 0;
        this.field1802 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class129 var10 = arg0[var9];
            if (var10 != null) {
                this.field1835 += var10.field1835;
                this.field1836 += var10.field1836;
                this.field1820 += var10.field1820;
                if (var10.field1815 == null) {
                    if (this.field1802 == -1) {
                        this.field1802 = var10.field1802;
                    }
                    if (this.field1802 != var10.field1802) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1807 != null;
                var5 |= var10.field1816 != null;
                var6 |= var10.field1827 != null;
                var7 |= var10.field1834 != null;
                var8 |= var10.field1810 != null;
            }
        }
        this.field1800 = new int[this.field1835];
        this.field1801 = new int[this.field1835];
        this.field1840 = new int[this.field1835];
        this.field1803 = new int[this.field1835];
        this.field1804 = new int[this.field1836];
        this.field1805 = new int[this.field1836];
        this.field1806 = new int[this.field1836];
        if (var3) {
            this.field1807 = new byte[this.field1836];
        }
        if (var4) {
            this.field1815 = new byte[this.field1836];
        }
        if (var5) {
            this.field1816 = new byte[this.field1836];
        }
        if (var6) {
            this.field1827 = new int[this.field1836];
        }
        if (var7) {
            this.field1834 = new short[this.field1836];
        }
        if (var8) {
            this.field1810 = new byte[this.field1836];
        }
        this.field1811 = new short[this.field1836];
        if (this.field1820 > 0) {
            this.field1830 = new byte[this.field1820];
            this.field1826 = new short[this.field1820];
            this.field1812 = new short[this.field1820];
            this.field1818 = new short[this.field1820];
            this.field1814 = new short[this.field1820];
            this.field1809 = new short[this.field1820];
            this.field1821 = new short[this.field1820];
            this.field1822 = new short[this.field1820];
            this.field1825 = new byte[this.field1820];
            this.field1823 = new short[this.field1820];
            this.field1824 = new short[this.field1820];
        }
        this.field1835 = 0;
        this.field1836 = 0;
        this.field1820 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class129 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1836; var13++) {
                    if (var3 && var12.field1807 != null) {
                        this.field1807[this.field1836] = var12.field1807[var13];
                    }
                    if (var4) {
                        if (var12.field1815 == null) {
                            this.field1815[this.field1836] = var12.field1802;
                        } else {
                            this.field1815[this.field1836] = var12.field1815[var13];
                        }
                    }
                    if (var5 && var12.field1816 != null) {
                        this.field1816[this.field1836] = var12.field1816[var13];
                    }
                    if (var6 && var12.field1827 != null) {
                        this.field1827[this.field1836] = var12.field1827[var13];
                    }
                    if (var7) {
                        if (var12.field1834 == null) {
                            this.field1834[this.field1836] = -1;
                        } else {
                            this.field1834[this.field1836] = var12.field1834[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1810 == null || var12.field1810[var13] == -1) {
                            this.field1810[this.field1836] = -1;
                        } else {
                            this.field1810[this.field1836] = (byte) (var12.field1810[var13] + this.field1820);
                        }
                    }
                    this.field1811[this.field1836] = var12.field1811[var13];
                    this.field1804[this.field1836] = this.method2213(var12, var12.field1804[var13]);
                    this.field1805[this.field1836] = this.method2213(var12, var12.field1805[var13]);
                    this.field1806[this.field1836] = this.method2213(var12, var12.field1806[var13]);
                    this.field1836++;
                }
                for (int var14 = 0; var14 < var12.field1820; var14++) {
                    byte var15 = this.field1830[this.field1820] = var12.field1830[var14];
                    if (var15 == 0) {
                        this.field1826[this.field1820] = (short) this.method2213(var12, var12.field1826[var14]);
                        this.field1812[this.field1820] = (short) this.method2213(var12, var12.field1812[var14]);
                        this.field1818[this.field1820] = (short) this.method2213(var12, var12.field1818[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1826[this.field1820] = var12.field1826[var14];
                        this.field1812[this.field1820] = var12.field1812[var14];
                        this.field1818[this.field1820] = var12.field1818[var14];
                        this.field1814[this.field1820] = var12.field1814[var14];
                        this.field1809[this.field1820] = var12.field1809[var14];
                        this.field1821[this.field1820] = var12.field1821[var14];
                        this.field1822[this.field1820] = var12.field1822[var14];
                        this.field1825[this.field1820] = var12.field1825[var14];
                        this.field1823[this.field1820] = var12.field1823[var14];
                    }
                    if (var15 == 2) {
                        this.field1824[this.field1820] = var12.field1824[var14];
                    }
                    this.field1820++;
                }
            }
        }
    }

    @ObfuscatedName("di.x(Ldi;I)I")
    public final int method2213(class129 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1800[arg1];
        int var5 = arg0.field1801[arg1];
        int var6 = arg0.field1840[arg1];
        for (int var7 = 0; var7 < this.field1835; var7++) {
            if (this.field1800[var7] == var4 && this.field1801[var7] == var5 && this.field1840[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1800[this.field1835] = var4;
            this.field1801[this.field1835] = var5;
            this.field1840[this.field1835] = var6;
            if (arg0.field1803 != null) {
                this.field1803[this.field1835] = arg0.field1803[arg1];
            }
            var3 = this.field1835++;
        }
        return var3;
    }

    public class129(class129 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1835 = arg0.field1835;
        this.field1836 = arg0.field1836;
        this.field1820 = arg0.field1820;
        if (arg1) {
            this.field1800 = arg0.field1800;
            this.field1801 = arg0.field1801;
            this.field1840 = arg0.field1840;
        } else {
            this.field1800 = new int[this.field1835];
            this.field1801 = new int[this.field1835];
            this.field1840 = new int[this.field1835];
            for (int var6 = 0; var6 < this.field1835; var6++) {
                this.field1800[var6] = arg0.field1800[var6];
                this.field1801[var6] = arg0.field1801[var6];
                this.field1840[var6] = arg0.field1840[var6];
            }
        }
        if (arg2) {
            this.field1811 = arg0.field1811;
        } else {
            this.field1811 = new short[this.field1836];
            for (int var7 = 0; var7 < this.field1836; var7++) {
                this.field1811[var7] = arg0.field1811[var7];
            }
        }
        if (arg3 || arg0.field1834 == null) {
            this.field1834 = arg0.field1834;
        } else {
            this.field1834 = new short[this.field1836];
            for (int var8 = 0; var8 < this.field1836; var8++) {
                this.field1834[var8] = arg0.field1834[var8];
            }
        }
        if (arg4) {
            this.field1816 = arg0.field1816;
        } else {
            this.field1816 = new byte[this.field1836];
            if (arg0.field1816 == null) {
                for (int var9 = 0; var9 < this.field1836; var9++) {
                    this.field1816[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1836; var10++) {
                    this.field1816[var10] = arg0.field1816[var10];
                }
            }
        }
        this.field1804 = arg0.field1804;
        this.field1805 = arg0.field1805;
        this.field1806 = arg0.field1806;
        this.field1807 = arg0.field1807;
        this.field1815 = arg0.field1815;
        this.field1810 = arg0.field1810;
        this.field1802 = arg0.field1802;
        this.field1830 = arg0.field1830;
        this.field1826 = arg0.field1826;
        this.field1812 = arg0.field1812;
        this.field1818 = arg0.field1818;
        this.field1814 = arg0.field1814;
        this.field1809 = arg0.field1809;
        this.field1821 = arg0.field1821;
        this.field1822 = arg0.field1822;
        this.field1825 = arg0.field1825;
        this.field1823 = arg0.field1823;
        this.field1824 = arg0.field1824;
        this.field1803 = arg0.field1803;
        this.field1827 = arg0.field1827;
        this.field1841 = arg0.field1841;
        this.field1829 = arg0.field1829;
        this.field1831 = arg0.field1831;
        this.field1828 = arg0.field1828;
        this.field1832 = arg0.field1832;
        this.field1833 = arg0.field1833;
        this.field1819 = arg0.field1819;
    }

    @ObfuscatedName("di.g()Ldi;")
    public class129 method2214() {
        class129 var1 = new class129();
        if (this.field1807 != null) {
            var1.field1807 = new byte[this.field1836];
            for (int var2 = 0; var2 < this.field1836; var2++) {
                var1.field1807[var2] = this.field1807[var2];
            }
        }
        var1.field1835 = this.field1835;
        var1.field1836 = this.field1836;
        var1.field1820 = this.field1820;
        var1.field1800 = this.field1800;
        var1.field1801 = this.field1801;
        var1.field1840 = this.field1840;
        var1.field1804 = this.field1804;
        var1.field1805 = this.field1805;
        var1.field1806 = this.field1806;
        var1.field1815 = this.field1815;
        var1.field1816 = this.field1816;
        var1.field1810 = this.field1810;
        var1.field1811 = this.field1811;
        var1.field1834 = this.field1834;
        var1.field1802 = this.field1802;
        var1.field1830 = this.field1830;
        var1.field1826 = this.field1826;
        var1.field1812 = this.field1812;
        var1.field1818 = this.field1818;
        var1.field1814 = this.field1814;
        var1.field1809 = this.field1809;
        var1.field1821 = this.field1821;
        var1.field1822 = this.field1822;
        var1.field1825 = this.field1825;
        var1.field1823 = this.field1823;
        var1.field1824 = this.field1824;
        var1.field1803 = this.field1803;
        var1.field1827 = this.field1827;
        var1.field1841 = this.field1841;
        var1.field1829 = this.field1829;
        var1.field1831 = this.field1831;
        var1.field1828 = this.field1828;
        var1.field1833 = this.field1833;
        var1.field1819 = this.field1819;
        return var1;
    }

    @ObfuscatedName("di.c([[IIIIZI)Ldi;")
    public class129 method2215(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2227();
        int var7 = this.field1837 + arg1;
        int var8 = this.field1838 + arg1;
        int var9 = this.field1799 + arg3;
        int var10 = this.field1839 + arg3;
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
        class129 var15;
        if (arg4) {
            var15 = new class129();
            var15.field1835 = this.field1835;
            var15.field1836 = this.field1836;
            var15.field1820 = this.field1820;
            var15.field1800 = this.field1800;
            var15.field1840 = this.field1840;
            var15.field1804 = this.field1804;
            var15.field1805 = this.field1805;
            var15.field1806 = this.field1806;
            var15.field1807 = this.field1807;
            var15.field1815 = this.field1815;
            var15.field1816 = this.field1816;
            var15.field1810 = this.field1810;
            var15.field1811 = this.field1811;
            var15.field1834 = this.field1834;
            var15.field1802 = this.field1802;
            var15.field1830 = this.field1830;
            var15.field1826 = this.field1826;
            var15.field1812 = this.field1812;
            var15.field1818 = this.field1818;
            var15.field1814 = this.field1814;
            var15.field1809 = this.field1809;
            var15.field1821 = this.field1821;
            var15.field1822 = this.field1822;
            var15.field1825 = this.field1825;
            var15.field1823 = this.field1823;
            var15.field1824 = this.field1824;
            var15.field1803 = this.field1803;
            var15.field1827 = this.field1827;
            var15.field1841 = this.field1841;
            var15.field1829 = this.field1829;
            var15.field1833 = this.field1833;
            var15.field1819 = this.field1819;
            var15.field1801 = new int[var15.field1835];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1835; var16++) {
                int var17 = this.field1800[var16] + arg1;
                int var18 = this.field1840[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1801[var16] = this.field1801[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1835; var26++) {
                int var27 = (-this.field1801[var26] << 16) / this.field2130;
                if (var27 < arg5) {
                    int var28 = this.field1800[var26] + arg1;
                    int var29 = this.field1840[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1801[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1801[var26];
                }
            }
        }
        var15.method2222();
        return var15;
    }

    @ObfuscatedName("di.l()V")
    public void method2282() {
        int var10002;
        if (this.field1803 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1835; var3++) {
                int var4 = this.field1803[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1841 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1841[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1835) {
                int var7 = this.field1803[var6];
                this.field1841[var7][var1[var7]++] = var6++;
            }
            this.field1803 = null;
        }
        if (this.field1827 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1836; var10++) {
            int var11 = this.field1827[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1829 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1829[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1836) {
            int var14 = this.field1827[var13];
            this.field1829[var14][var8[var14]++] = var13++;
        }
        this.field1827 = null;
    }

    @ObfuscatedName("di.w()V")
    public void method2217() {
        for (int var1 = 0; var1 < this.field1835; var1++) {
            int var2 = this.field1800[var1];
            this.field1800[var1] = this.field1840[var1];
            this.field1840[var1] = -var2;
        }
        this.method2222();
    }

    @ObfuscatedName("di.b()V")
    public void method2218() {
        for (int var1 = 0; var1 < this.field1835; var1++) {
            this.field1800[var1] = -this.field1800[var1];
            this.field1840[var1] = -this.field1840[var1];
        }
        this.method2222();
    }

    @ObfuscatedName("di.o()V")
    public void method2219() {
        for (int var1 = 0; var1 < this.field1835; var1++) {
            int var2 = this.field1840[var1];
            this.field1840[var1] = this.field1800[var1];
            this.field1800[var1] = -var2;
        }
        this.method2222();
    }

    @ObfuscatedName("di.e(I)V")
    public void method2254(int arg0) {
        int var2 = field1844[arg0];
        int var3 = field1845[arg0];
        for (int var4 = 0; var4 < this.field1835; var4++) {
            int var5 = this.field1840[var4] * var2 + this.field1800[var4] * var3 >> 16;
            this.field1840[var4] = this.field1840[var4] * var3 - this.field1800[var4] * var2 >> 16;
            this.field1800[var4] = var5;
        }
        this.method2222();
    }

    @ObfuscatedName("di.a(III)V")
    public void method2221(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1835; var4++) {
            this.field1800[var4] += arg0;
            this.field1801[var4] += arg1;
            this.field1840[var4] += arg2;
        }
        this.method2222();
    }

    @ObfuscatedName("di.v(SS)V")
    public void method2241(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1836; var3++) {
            if (this.field1811[var3] == arg0) {
                this.field1811[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("di.t(SS)V")
    public void method2223(short arg0, short arg1) {
        if (this.field1834 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1836; var3++) {
            if (this.field1834[var3] == arg0) {
                this.field1834[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("di.y()V")
    public void method2253() {
        for (int var1 = 0; var1 < this.field1835; var1++) {
            this.field1840[var1] = -this.field1840[var1];
        }
        for (int var2 = 0; var2 < this.field1836; var2++) {
            int var3 = this.field1804[var2];
            this.field1804[var2] = this.field1806[var2];
            this.field1806[var2] = var3;
        }
        this.method2222();
    }

    @ObfuscatedName("di.u(III)V")
    public void method2225(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1835; var4++) {
            this.field1800[var4] = this.field1800[var4] * arg0 / 128;
            this.field1801[var4] = this.field1801[var4] * arg1 / 128;
            this.field1840[var4] = this.field1840[var4] * arg2 / 128;
        }
        this.method2222();
    }

    @ObfuscatedName("di.n()V")
    public void method2226() {
        if (this.field1831 != null) {
            return;
        }
        this.field1831 = new class137[this.field1835];
        for (int var1 = 0; var1 < this.field1835; var1++) {
            this.field1831[var1] = new class137();
        }
        for (int var2 = 0; var2 < this.field1836; var2++) {
            int var3 = this.field1804[var2];
            int var4 = this.field1805[var2];
            int var5 = this.field1806[var2];
            int var6 = this.field1800[var4] - this.field1800[var3];
            int var7 = this.field1801[var4] - this.field1801[var3];
            int var8 = this.field1840[var4] - this.field1840[var3];
            int var9 = this.field1800[var5] - this.field1800[var3];
            int var10 = this.field1801[var5] - this.field1801[var3];
            int var11 = this.field1840[var5] - this.field1840[var3];
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
            if (this.field1807 == null) {
                var19 = 0;
            } else {
                var19 = this.field1807[var2];
            }
            if (var19 == 0) {
                class137 var20 = this.field1831[var3];
                var20.field2011 += var16;
                var20.field2010 += var17;
                var20.field2008 += var18;
                var20.field2009++;
                class137 var21 = this.field1831[var4];
                var21.field2011 += var16;
                var21.field2010 += var17;
                var21.field2008 += var18;
                var21.field2009++;
                class137 var22 = this.field1831[var5];
                var22.field2011 += var16;
                var22.field2010 += var17;
                var22.field2008 += var18;
                var22.field2009++;
            } else if (var19 == 1) {
                if (this.field1828 == null) {
                    this.field1828 = new class145[this.field1836];
                }
                class145 var23 = this.field1828[var2] = new class145();
                var23.field2146 = var16;
                var23.field2141 = var17;
                var23.field2145 = var18;
            }
        }
    }

    @ObfuscatedName("di.d()V")
    public void method2222() {
        this.field1831 = null;
        this.field1832 = null;
        this.field1828 = null;
        this.field1808 = false;
    }

    @ObfuscatedName("di.ax()V")
    public void method2227() {
        if (this.field1808) {
            return;
        }
        this.field2130 = 0;
        this.field1813 = 0;
        this.field1837 = 999999;
        this.field1838 = -999999;
        this.field1839 = -99999;
        this.field1799 = 99999;
        for (int var1 = 0; var1 < this.field1835; var1++) {
            int var2 = this.field1800[var1];
            int var3 = this.field1801[var1];
            int var4 = this.field1840[var1];
            if (var2 < this.field1837) {
                this.field1837 = var2;
            }
            if (var2 > this.field1838) {
                this.field1838 = var2;
            }
            if (var4 < this.field1799) {
                this.field1799 = var4;
            }
            if (var4 > this.field1839) {
                this.field1839 = var4;
            }
            if (-var3 > this.field2130) {
                this.field2130 = -var3;
            }
            if (var3 > this.field1813) {
                this.field1813 = var3;
            }
        }
        this.field1808 = true;
    }

    @ObfuscatedName("di.ao(Ldi;Ldi;IIIZ)V")
    public static void method2228(class129 arg0, class129 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2227();
        arg0.method2226();
        arg1.method2227();
        arg1.method2226();
        field1843++;
        int var6 = 0;
        int[] var7 = arg1.field1800;
        int var8 = arg1.field1835;
        for (int var9 = 0; var9 < arg0.field1835; var9++) {
            class137 var10 = arg0.field1831[var9];
            if (var10.field2009 != 0) {
                int var11 = arg0.field1801[var9] - arg3;
                if (var11 <= arg1.field1813) {
                    int var12 = arg0.field1800[var9] - arg2;
                    if (var12 >= arg1.field1837 && var12 <= arg1.field1838) {
                        int var13 = arg0.field1840[var9] - arg4;
                        if (var13 >= arg1.field1799 && var13 <= arg1.field1839) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class137 var15 = arg1.field1831[var14];
                                if (var7[var14] == var12 && arg1.field1840[var14] == var13 && arg1.field1801[var14] == var11 && var15.field2009 != 0) {
                                    if (arg0.field1832 == null) {
                                        arg0.field1832 = new class137[arg0.field1835];
                                    }
                                    if (arg1.field1832 == null) {
                                        arg1.field1832 = new class137[var8];
                                    }
                                    class137 var16 = arg0.field1832[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1832[var9] = new class137(var10);
                                    }
                                    class137 var17 = arg1.field1832[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1832[var14] = new class137(var15);
                                    }
                                    var16.field2011 += var15.field2011;
                                    var16.field2010 += var15.field2010;
                                    var16.field2008 += var15.field2008;
                                    var16.field2009 += var15.field2009;
                                    var17.field2011 += var10.field2011;
                                    var17.field2010 += var10.field2010;
                                    var17.field2008 += var10.field2008;
                                    var17.field2009 += var10.field2009;
                                    var6++;
                                    field1817[var9] = field1843;
                                    field1842[var14] = field1843;
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
        for (int var18 = 0; var18 < arg0.field1836; var18++) {
            if (field1817[arg0.field1804[var18]] == field1843 && field1817[arg0.field1805[var18]] == field1843 && field1817[arg0.field1806[var18]] == field1843) {
                if (arg0.field1807 == null) {
                    arg0.field1807 = new byte[arg0.field1836];
                }
                arg0.field1807[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1836; var19++) {
            if (field1842[arg1.field1804[var19]] == field1843 && field1842[arg1.field1805[var19]] == field1843 && field1842[arg1.field1806[var19]] == field1843) {
                if (arg1.field1807 == null) {
                    arg1.field1807 = new byte[arg1.field1836];
                }
                arg1.field1807[var19] = 2;
            }
        }
    }

    @ObfuscatedName("di.an(IIIII)Leo;")
    public final class135 method2229(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2226();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class135 var8 = new class135();
        var8.field1947 = new int[this.field1836];
        var8.field1940 = new int[this.field1836];
        var8.field1941 = new int[this.field1836];
        if (this.field1820 > 0 && this.field1810 != null) {
            int[] var9 = new int[this.field1820];
            for (int var10 = 0; var10 < this.field1836; var10++) {
                if (this.field1810[var10] != -1) {
                    var9[this.field1810[var10] & 0xFF]++;
                }
            }
            var8.field1950 = 0;
            for (int var11 = 0; var11 < this.field1820; var11++) {
                if (var9[var11] > 0 && this.field1830[var11] == 0) {
                    var8.field1950++;
                }
            }
            var8.field1948 = new int[var8.field1950];
            var8.field1949 = new int[var8.field1950];
            var8.field1928 = new int[var8.field1950];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1820; var13++) {
                if (var9[var13] > 0 && this.field1830[var13] == 0) {
                    var8.field1948[var12] = this.field1826[var13] & 0xFFFF;
                    var8.field1949[var12] = this.field1812[var13] & 0xFFFF;
                    var8.field1928[var12] = this.field1818[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1944 = new byte[this.field1836];
            for (int var14 = 0; var14 < this.field1836; var14++) {
                if (this.field1810[var14] == -1) {
                    var8.field1944[var14] = -1;
                } else {
                    var8.field1944[var14] = (byte) var9[this.field1810[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1836; var15++) {
            byte var16;
            if (this.field1807 == null) {
                var16 = 0;
            } else {
                var16 = this.field1807[var15];
            }
            byte var17;
            if (this.field1816 == null) {
                var17 = 0;
            } else {
                var17 = this.field1816[var15];
            }
            short var18;
            if (this.field1834 == null) {
                var18 = -1;
            } else {
                var18 = this.field1834[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1811[var15] & 0xFFFF;
                    class137 var20;
                    if (this.field1832 == null || this.field1832[this.field1804[var15]] == null) {
                        var20 = this.field1831[this.field1804[var15]];
                    } else {
                        var20 = this.field1832[this.field1804[var15]];
                    }
                    int var21 = (var20.field2008 * arg4 + var20.field2011 * arg2 + var20.field2010 * arg3) / (var20.field2009 * var7) + arg0;
                    var8.field1947[var15] = method2235(var19, var21);
                    class137 var22;
                    if (this.field1832 == null || this.field1832[this.field1805[var15]] == null) {
                        var22 = this.field1831[this.field1805[var15]];
                    } else {
                        var22 = this.field1832[this.field1805[var15]];
                    }
                    int var23 = (var22.field2008 * arg4 + var22.field2011 * arg2 + var22.field2010 * arg3) / (var22.field2009 * var7) + arg0;
                    var8.field1940[var15] = method2235(var19, var23);
                    class137 var24;
                    if (this.field1832 == null || this.field1832[this.field1806[var15]] == null) {
                        var24 = this.field1831[this.field1806[var15]];
                    } else {
                        var24 = this.field1832[this.field1806[var15]];
                    }
                    int var25 = (var24.field2008 * arg4 + var24.field2011 * arg2 + var24.field2010 * arg3) / (var24.field2009 * var7) + arg0;
                    var8.field1941[var15] = method2235(var19, var25);
                } else if (var16 == 1) {
                    class145 var26 = this.field1828[var15];
                    int var27 = (var26.field2145 * arg4 + var26.field2146 * arg2 + var26.field2141 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1947[var15] = method2235(this.field1811[var15] & 0xFFFF, var27);
                    var8.field1941[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1947[var15] = 128;
                    var8.field1941[var15] = -1;
                } else {
                    var8.field1941[var15] = -2;
                }
            } else if (var16 == 0) {
                class137 var28;
                if (this.field1832 == null || this.field1832[this.field1804[var15]] == null) {
                    var28 = this.field1831[this.field1804[var15]];
                } else {
                    var28 = this.field1832[this.field1804[var15]];
                }
                int var29 = (var28.field2008 * arg4 + var28.field2011 * arg2 + var28.field2010 * arg3) / (var28.field2009 * var7) + arg0;
                var8.field1947[var15] = method2231(var29);
                class137 var30;
                if (this.field1832 == null || this.field1832[this.field1805[var15]] == null) {
                    var30 = this.field1831[this.field1805[var15]];
                } else {
                    var30 = this.field1832[this.field1805[var15]];
                }
                int var31 = (var30.field2008 * arg4 + var30.field2011 * arg2 + var30.field2010 * arg3) / (var30.field2009 * var7) + arg0;
                var8.field1940[var15] = method2231(var31);
                class137 var32;
                if (this.field1832 == null || this.field1832[this.field1806[var15]] == null) {
                    var32 = this.field1831[this.field1806[var15]];
                } else {
                    var32 = this.field1832[this.field1806[var15]];
                }
                int var33 = (var32.field2008 * arg4 + var32.field2011 * arg2 + var32.field2010 * arg3) / (var32.field2009 * var7) + arg0;
                var8.field1941[var15] = method2231(var33);
            } else if (var16 == 1) {
                class145 var34 = this.field1828[var15];
                int var35 = (var34.field2145 * arg4 + var34.field2146 * arg2 + var34.field2141 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1947[var15] = method2231(var35);
                var8.field1941[var15] = -1;
            } else {
                var8.field1941[var15] = -2;
            }
        }
        this.method2282();
        var8.field1931 = this.field1835;
        var8.field1932 = this.field1800;
        var8.field1933 = this.field1801;
        var8.field1934 = this.field1840;
        var8.field1935 = this.field1836;
        var8.field1936 = this.field1804;
        var8.field1937 = this.field1805;
        var8.field1938 = this.field1806;
        var8.field1942 = this.field1815;
        var8.field1973 = this.field1816;
        var8.field1978 = this.field1802;
        var8.field1964 = this.field1841;
        var8.field1961 = this.field1829;
        var8.field1945 = this.field1834;
        return var8;
    }

    @ObfuscatedName("di.ar(II)I")
    public static final int method2235(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("di.ag(I)I")
    public static final int method2231(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
