package deob;

@ObfuscatedName("dn")
public class class128 extends class142 {

    @ObfuscatedName("dn.s")
    public int field1802 = 0;

    @ObfuscatedName("dn.c")
    public int[] field1794;

    @ObfuscatedName("dn.f")
    public int[] field1827;

    @ObfuscatedName("dn.m")
    public int[] field1796;

    @ObfuscatedName("dn.h")
    public int field1797 = 0;

    @ObfuscatedName("dn.t")
    public int[] field1798;

    @ObfuscatedName("dn.p")
    public int[] field1795;

    @ObfuscatedName("dn.d")
    public int[] field1800;

    @ObfuscatedName("dn.n")
    public byte[] field1801;

    @ObfuscatedName("dn.z")
    public byte[] field1806;

    @ObfuscatedName("dn.o")
    public byte[] field1803;

    @ObfuscatedName("dn.q")
    public byte[] field1815;

    @ObfuscatedName("dn.u")
    public short[] field1805;

    @ObfuscatedName("dn.k")
    public short[] field1823;

    @ObfuscatedName("dn.e")
    public byte field1807 = 0;

    @ObfuscatedName("dn.r")
    public int field1808;

    @ObfuscatedName("dn.l")
    public byte[] field1809;

    @ObfuscatedName("dn.y")
    public short[] field1810;

    @ObfuscatedName("dn.w")
    public short[] field1811;

    @ObfuscatedName("dn.i")
    public short[] field1812;

    @ObfuscatedName("dn.g")
    public short[] field1820;

    @ObfuscatedName("dn.a")
    public short[] field1814;

    @ObfuscatedName("dn.x")
    public short[] field1826;

    @ObfuscatedName("dn.b")
    public short[] field1816;

    @ObfuscatedName("dn.j")
    public short[] field1817;

    @ObfuscatedName("dn.v")
    public short[] field1818;

    @ObfuscatedName("dn.ap")
    public byte[] field1832;

    @ObfuscatedName("dn.ar")
    public int[] field1804;

    @ObfuscatedName("dn.am")
    public int[] field1836;

    @ObfuscatedName("dn.ab")
    public int[][] field1799;

    @ObfuscatedName("dn.af")
    public int[][] field1833;

    @ObfuscatedName("dn.aa")
    public class144[] field1824;

    @ObfuscatedName("dn.aq")
    public class136[] field1825;

    @ObfuscatedName("dn.aj")
    public class136[] field1822;

    @ObfuscatedName("dn.as")
    public short field1793;

    @ObfuscatedName("dn.av")
    public short field1819;

    @ObfuscatedName("dn.ao")
    public boolean field1829 = false;

    @ObfuscatedName("dn.ag")
    public int field1830;

    @ObfuscatedName("dn.ay")
    public int field1831;

    @ObfuscatedName("dn.ax")
    public int field1828;

    @ObfuscatedName("dn.ad")
    public int field1813;

    @ObfuscatedName("dn.ae")
    public int field1834;

    @ObfuscatedName("dn.ac")
    public static int[] field1835 = new int[10000];

    @ObfuscatedName("dn.az")
    public static int[] field1821 = new int[10000];

    @ObfuscatedName("dn.ah")
    public static int field1837 = 0;

    @ObfuscatedName("dn.at")
    public static int[] field1838 = class137.field2034;

    @ObfuscatedName("dn.al")
    public static int[] field1839 = class137.field2019;

    public class128() {
    }

    @ObfuscatedName("dn.s(Liw;II)Ldn;")
    public static class128 method2239(class239 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3840(arg1, arg2);
        return var3 == null ? null : new class128(var3);
    }

    public class128(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2240(arg0);
        } else {
            this.method2241(arg0);
        }
    }

    @ObfuscatedName("dn.c([B)V")
    public void method2240(byte[] arg0) {
        class177 var2 = new class177(arg0);
        class177 var3 = new class177(arg0);
        class177 var4 = new class177(arg0);
        class177 var5 = new class177(arg0);
        class177 var6 = new class177(arg0);
        class177 var7 = new class177(arg0);
        class177 var8 = new class177(arg0);
        var2.field2402 = arg0.length - 23;
        int var9 = var2.method2967();
        int var10 = var2.method2967();
        int var11 = var2.method2965();
        int var12 = var2.method2965();
        int var13 = var2.method2965();
        int var14 = var2.method2965();
        int var15 = var2.method2965();
        int var16 = var2.method2965();
        int var17 = var2.method2965();
        int var18 = var2.method2967();
        int var19 = var2.method2967();
        int var20 = var2.method2967();
        int var21 = var2.method2967();
        int var22 = var2.method2967();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1809 = new byte[var11];
            var2.field2402 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1809[var26] = var2.method2966();
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
        this.field1802 = var9;
        this.field1797 = var10;
        this.field1808 = var11;
        this.field1794 = new int[var9];
        this.field1827 = new int[var9];
        this.field1796 = new int[var9];
        this.field1798 = new int[var10];
        this.field1795 = new int[var10];
        this.field1800 = new int[var10];
        if (var17 == 1) {
            this.field1804 = new int[var9];
        }
        if (var12 == 1) {
            this.field1801 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1806 = new byte[var10];
        } else {
            this.field1807 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1803 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1836 = new int[var10];
        }
        if (var16 == 1) {
            this.field1823 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1815 = new byte[var10];
        }
        this.field1805 = new short[var10];
        if (var11 > 0) {
            this.field1810 = new short[var11];
            this.field1811 = new short[var11];
            this.field1812 = new short[var11];
            if (var24 > 0) {
                this.field1820 = new short[var24];
                this.field1814 = new short[var24];
                this.field1826 = new short[var24];
                this.field1816 = new short[var24];
                this.field1832 = new byte[var24];
                this.field1817 = new short[var24];
            }
            if (var25 > 0) {
                this.field1818 = new short[var25];
            }
        }
        var2.field2402 = var11;
        var3.field2402 = var44;
        var4.field2402 = var46;
        var5.field2402 = var48;
        var6.field2402 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2965();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method3124();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method3124();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method3124();
            }
            this.field1794[var67] = var64 + var69;
            this.field1827[var67] = var65 + var70;
            this.field1796[var67] = var66 + var71;
            var64 = this.field1794[var67];
            var65 = this.field1827[var67];
            var66 = this.field1796[var67];
            if (var17 == 1) {
                this.field1804[var67] = var6.method2965();
            }
        }
        var2.field2402 = var42;
        var3.field2402 = var31;
        var4.field2402 = var34;
        var5.field2402 = var37;
        var6.field2402 = var35;
        var7.field2402 = var40;
        var8.field2402 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1805[var72] = (short) var2.method2967();
            if (var12 == 1) {
                this.field1801[var72] = var3.method2966();
            }
            if (var13 == 255) {
                this.field1806[var72] = var4.method2966();
            }
            if (var14 == 1) {
                this.field1803[var72] = var5.method2966();
            }
            if (var15 == 1) {
                this.field1836[var72] = var6.method2965();
            }
            if (var16 == 1) {
                this.field1823[var72] = (short) (var7.method2967() - 1);
            }
            if (this.field1815 != null && this.field1823[var72] != -1) {
                this.field1815[var72] = (byte) (var8.method2965() - 1);
            }
        }
        var2.field2402 = var33;
        var3.field2402 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2965();
            if (var78 == 1) {
                var73 = var2.method3124() + var76;
                var74 = var2.method3124() + var73;
                var75 = var2.method3124() + var74;
                var76 = var75;
                this.field1798[var77] = var73;
                this.field1795[var77] = var74;
                this.field1800[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method3124() + var76;
                var76 = var75;
                this.field1798[var77] = var73;
                this.field1795[var77] = var74;
                this.field1800[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method3124() + var76;
                var76 = var75;
                this.field1798[var77] = var73;
                this.field1795[var77] = var74;
                this.field1800[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method3124() + var76;
                var76 = var75;
                this.field1798[var77] = var73;
                this.field1795[var77] = var81;
                this.field1800[var77] = var75;
            }
        }
        var2.field2402 = var50;
        var3.field2402 = var52;
        var4.field2402 = var54;
        var5.field2402 = var56;
        var6.field2402 = var58;
        var7.field2402 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1809[var82] & 0xFF;
            if (var83 == 0) {
                this.field1810[var82] = (short) var2.method2967();
                this.field1811[var82] = (short) var2.method2967();
                this.field1812[var82] = (short) var2.method2967();
            }
            if (var83 == 1) {
                this.field1810[var82] = (short) var3.method2967();
                this.field1811[var82] = (short) var3.method2967();
                this.field1812[var82] = (short) var3.method2967();
                this.field1820[var82] = (short) var4.method2967();
                this.field1814[var82] = (short) var4.method2967();
                this.field1826[var82] = (short) var4.method2967();
                this.field1816[var82] = (short) var5.method2967();
                this.field1832[var82] = var6.method2966();
                this.field1817[var82] = (short) var7.method2967();
            }
            if (var83 == 2) {
                this.field1810[var82] = (short) var3.method2967();
                this.field1811[var82] = (short) var3.method2967();
                this.field1812[var82] = (short) var3.method2967();
                this.field1820[var82] = (short) var4.method2967();
                this.field1814[var82] = (short) var4.method2967();
                this.field1826[var82] = (short) var4.method2967();
                this.field1816[var82] = (short) var5.method2967();
                this.field1832[var82] = var6.method2966();
                this.field1817[var82] = (short) var7.method2967();
                this.field1818[var82] = (short) var7.method2967();
            }
            if (var83 == 3) {
                this.field1810[var82] = (short) var3.method2967();
                this.field1811[var82] = (short) var3.method2967();
                this.field1812[var82] = (short) var3.method2967();
                this.field1820[var82] = (short) var4.method2967();
                this.field1814[var82] = (short) var4.method2967();
                this.field1826[var82] = (short) var4.method2967();
                this.field1816[var82] = (short) var5.method2967();
                this.field1832[var82] = var6.method2966();
                this.field1817[var82] = (short) var7.method2967();
            }
        }
        var2.field2402 = var62;
        int var84 = var2.method2965();
        if (var84 == 0) {
            return;
        }
        new class141();
        var2.method2967();
        var2.method2967();
        var2.method2967();
        var2.method2970();
    }

    @ObfuscatedName("dn.m([B)V")
    public void method2241(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class177 var4 = new class177(arg0);
        class177 var5 = new class177(arg0);
        class177 var6 = new class177(arg0);
        class177 var7 = new class177(arg0);
        class177 var8 = new class177(arg0);
        var4.field2402 = arg0.length - 18;
        int var9 = var4.method2967();
        int var10 = var4.method2967();
        int var11 = var4.method2965();
        int var12 = var4.method2965();
        int var13 = var4.method2965();
        int var14 = var4.method2965();
        int var15 = var4.method2965();
        int var16 = var4.method2965();
        int var17 = var4.method2967();
        int var18 = var4.method2967();
        int var19 = var4.method2967();
        int var20 = var4.method2967();
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
        this.field1802 = var9;
        this.field1797 = var10;
        this.field1808 = var11;
        this.field1794 = new int[var9];
        this.field1827 = new int[var9];
        this.field1796 = new int[var9];
        this.field1798 = new int[var10];
        this.field1795 = new int[var10];
        this.field1800 = new int[var10];
        if (var11 > 0) {
            this.field1809 = new byte[var11];
            this.field1810 = new short[var11];
            this.field1811 = new short[var11];
            this.field1812 = new short[var11];
        }
        if (var16 == 1) {
            this.field1804 = new int[var9];
        }
        if (var12 == 1) {
            this.field1801 = new byte[var10];
            this.field1815 = new byte[var10];
            this.field1823 = new short[var10];
        }
        if (var13 == 255) {
            this.field1806 = new byte[var10];
        } else {
            this.field1807 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1803 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1836 = new int[var10];
        }
        this.field1805 = new short[var10];
        var4.field2402 = var21;
        var5.field2402 = var36;
        var6.field2402 = var38;
        var7.field2402 = var40;
        var8.field2402 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2965();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method3124();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method3124();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method3124();
            }
            this.field1794[var46] = var43 + var48;
            this.field1827[var46] = var44 + var49;
            this.field1796[var46] = var45 + var50;
            var43 = this.field1794[var46];
            var44 = this.field1827[var46];
            var45 = this.field1796[var46];
            if (var16 == 1) {
                this.field1804[var46] = var8.method2965();
            }
        }
        var4.field2402 = var32;
        var5.field2402 = var28;
        var6.field2402 = var26;
        var7.field2402 = var30;
        var8.field2402 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1805[var51] = (short) var4.method2967();
            if (var12 == 1) {
                int var52 = var5.method2965();
                if ((var52 & 0x1) == 1) {
                    this.field1801[var51] = 1;
                    var2 = true;
                } else {
                    this.field1801[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1815[var51] = (byte) (var52 >> 2);
                    this.field1823[var51] = this.field1805[var51];
                    this.field1805[var51] = 127;
                    if (this.field1823[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1815[var51] = -1;
                    this.field1823[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1806[var51] = var6.method2966();
            }
            if (var14 == 1) {
                this.field1803[var51] = var7.method2966();
            }
            if (var15 == 1) {
                this.field1836[var51] = var8.method2965();
            }
        }
        var4.field2402 = var25;
        var5.field2402 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2965();
            if (var58 == 1) {
                var53 = var4.method3124() + var56;
                var54 = var4.method3124() + var53;
                var55 = var4.method3124() + var54;
                var56 = var55;
                this.field1798[var57] = var53;
                this.field1795[var57] = var54;
                this.field1800[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method3124() + var56;
                var56 = var55;
                this.field1798[var57] = var53;
                this.field1795[var57] = var54;
                this.field1800[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method3124() + var56;
                var56 = var55;
                this.field1798[var57] = var53;
                this.field1795[var57] = var54;
                this.field1800[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method3124() + var56;
                var56 = var55;
                this.field1798[var57] = var53;
                this.field1795[var57] = var61;
                this.field1800[var57] = var55;
            }
        }
        var4.field2402 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1809[var62] = 0;
            this.field1810[var62] = (short) var4.method2967();
            this.field1811[var62] = (short) var4.method2967();
            this.field1812[var62] = (short) var4.method2967();
        }
        if (this.field1815 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1815[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1810[var65] & 0xFFFF) == this.field1798[var64] && (this.field1811[var65] & 0xFFFF) == this.field1795[var64] && (this.field1812[var65] & 0xFFFF) == this.field1800[var64]) {
                        this.field1815[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1815 = null;
            }
        }
        if (!var3) {
            this.field1823 = null;
        }
        if (!var2) {
            this.field1801 = null;
        }
    }

    public class128(class128[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1802 = 0;
        this.field1797 = 0;
        this.field1808 = 0;
        this.field1807 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class128 var10 = arg0[var9];
            if (var10 != null) {
                this.field1802 += var10.field1802;
                this.field1797 += var10.field1797;
                this.field1808 += var10.field1808;
                if (var10.field1806 == null) {
                    if (this.field1807 == -1) {
                        this.field1807 = var10.field1807;
                    }
                    if (this.field1807 != var10.field1807) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1801 != null;
                var5 |= var10.field1803 != null;
                var6 |= var10.field1836 != null;
                var7 |= var10.field1823 != null;
                var8 |= var10.field1815 != null;
            }
        }
        this.field1794 = new int[this.field1802];
        this.field1827 = new int[this.field1802];
        this.field1796 = new int[this.field1802];
        this.field1804 = new int[this.field1802];
        this.field1798 = new int[this.field1797];
        this.field1795 = new int[this.field1797];
        this.field1800 = new int[this.field1797];
        if (var3) {
            this.field1801 = new byte[this.field1797];
        }
        if (var4) {
            this.field1806 = new byte[this.field1797];
        }
        if (var5) {
            this.field1803 = new byte[this.field1797];
        }
        if (var6) {
            this.field1836 = new int[this.field1797];
        }
        if (var7) {
            this.field1823 = new short[this.field1797];
        }
        if (var8) {
            this.field1815 = new byte[this.field1797];
        }
        this.field1805 = new short[this.field1797];
        if (this.field1808 > 0) {
            this.field1809 = new byte[this.field1808];
            this.field1810 = new short[this.field1808];
            this.field1811 = new short[this.field1808];
            this.field1812 = new short[this.field1808];
            this.field1820 = new short[this.field1808];
            this.field1814 = new short[this.field1808];
            this.field1826 = new short[this.field1808];
            this.field1816 = new short[this.field1808];
            this.field1832 = new byte[this.field1808];
            this.field1817 = new short[this.field1808];
            this.field1818 = new short[this.field1808];
        }
        this.field1802 = 0;
        this.field1797 = 0;
        this.field1808 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class128 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1797; var13++) {
                    if (var3 && var12.field1801 != null) {
                        this.field1801[this.field1797] = var12.field1801[var13];
                    }
                    if (var4) {
                        if (var12.field1806 == null) {
                            this.field1806[this.field1797] = var12.field1807;
                        } else {
                            this.field1806[this.field1797] = var12.field1806[var13];
                        }
                    }
                    if (var5 && var12.field1803 != null) {
                        this.field1803[this.field1797] = var12.field1803[var13];
                    }
                    if (var6 && var12.field1836 != null) {
                        this.field1836[this.field1797] = var12.field1836[var13];
                    }
                    if (var7) {
                        if (var12.field1823 == null) {
                            this.field1823[this.field1797] = -1;
                        } else {
                            this.field1823[this.field1797] = var12.field1823[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1815 == null || var12.field1815[var13] == -1) {
                            this.field1815[this.field1797] = -1;
                        } else {
                            this.field1815[this.field1797] = (byte) (var12.field1815[var13] + this.field1808);
                        }
                    }
                    this.field1805[this.field1797] = var12.field1805[var13];
                    this.field1798[this.field1797] = this.method2281(var12, var12.field1798[var13]);
                    this.field1795[this.field1797] = this.method2281(var12, var12.field1795[var13]);
                    this.field1800[this.field1797] = this.method2281(var12, var12.field1800[var13]);
                    this.field1797++;
                }
                for (int var14 = 0; var14 < var12.field1808; var14++) {
                    byte var15 = this.field1809[this.field1808] = var12.field1809[var14];
                    if (var15 == 0) {
                        this.field1810[this.field1808] = (short) this.method2281(var12, var12.field1810[var14]);
                        this.field1811[this.field1808] = (short) this.method2281(var12, var12.field1811[var14]);
                        this.field1812[this.field1808] = (short) this.method2281(var12, var12.field1812[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1810[this.field1808] = var12.field1810[var14];
                        this.field1811[this.field1808] = var12.field1811[var14];
                        this.field1812[this.field1808] = var12.field1812[var14];
                        this.field1820[this.field1808] = var12.field1820[var14];
                        this.field1814[this.field1808] = var12.field1814[var14];
                        this.field1826[this.field1808] = var12.field1826[var14];
                        this.field1816[this.field1808] = var12.field1816[var14];
                        this.field1832[this.field1808] = var12.field1832[var14];
                        this.field1817[this.field1808] = var12.field1817[var14];
                    }
                    if (var15 == 2) {
                        this.field1818[this.field1808] = var12.field1818[var14];
                    }
                    this.field1808++;
                }
            }
        }
    }

    @ObfuscatedName("dn.h(Ldn;I)I")
    public final int method2281(class128 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1794[arg1];
        int var5 = arg0.field1827[arg1];
        int var6 = arg0.field1796[arg1];
        for (int var7 = 0; var7 < this.field1802; var7++) {
            if (this.field1794[var7] == var4 && this.field1827[var7] == var5 && this.field1796[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1794[this.field1802] = var4;
            this.field1827[this.field1802] = var5;
            this.field1796[this.field1802] = var6;
            if (arg0.field1804 != null) {
                this.field1804[this.field1802] = arg0.field1804[arg1];
            }
            var3 = this.field1802++;
        }
        return var3;
    }

    public class128(class128 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1802 = arg0.field1802;
        this.field1797 = arg0.field1797;
        this.field1808 = arg0.field1808;
        if (arg1) {
            this.field1794 = arg0.field1794;
            this.field1827 = arg0.field1827;
            this.field1796 = arg0.field1796;
        } else {
            this.field1794 = new int[this.field1802];
            this.field1827 = new int[this.field1802];
            this.field1796 = new int[this.field1802];
            for (int var6 = 0; var6 < this.field1802; var6++) {
                this.field1794[var6] = arg0.field1794[var6];
                this.field1827[var6] = arg0.field1827[var6];
                this.field1796[var6] = arg0.field1796[var6];
            }
        }
        if (arg2) {
            this.field1805 = arg0.field1805;
        } else {
            this.field1805 = new short[this.field1797];
            for (int var7 = 0; var7 < this.field1797; var7++) {
                this.field1805[var7] = arg0.field1805[var7];
            }
        }
        if (arg3 || arg0.field1823 == null) {
            this.field1823 = arg0.field1823;
        } else {
            this.field1823 = new short[this.field1797];
            for (int var8 = 0; var8 < this.field1797; var8++) {
                this.field1823[var8] = arg0.field1823[var8];
            }
        }
        if (arg4) {
            this.field1803 = arg0.field1803;
        } else {
            this.field1803 = new byte[this.field1797];
            if (arg0.field1803 == null) {
                for (int var9 = 0; var9 < this.field1797; var9++) {
                    this.field1803[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1797; var10++) {
                    this.field1803[var10] = arg0.field1803[var10];
                }
            }
        }
        this.field1798 = arg0.field1798;
        this.field1795 = arg0.field1795;
        this.field1800 = arg0.field1800;
        this.field1801 = arg0.field1801;
        this.field1806 = arg0.field1806;
        this.field1815 = arg0.field1815;
        this.field1807 = arg0.field1807;
        this.field1809 = arg0.field1809;
        this.field1810 = arg0.field1810;
        this.field1811 = arg0.field1811;
        this.field1812 = arg0.field1812;
        this.field1820 = arg0.field1820;
        this.field1814 = arg0.field1814;
        this.field1826 = arg0.field1826;
        this.field1816 = arg0.field1816;
        this.field1832 = arg0.field1832;
        this.field1817 = arg0.field1817;
        this.field1818 = arg0.field1818;
        this.field1804 = arg0.field1804;
        this.field1836 = arg0.field1836;
        this.field1799 = arg0.field1799;
        this.field1833 = arg0.field1833;
        this.field1825 = arg0.field1825;
        this.field1824 = arg0.field1824;
        this.field1822 = arg0.field1822;
        this.field1793 = arg0.field1793;
        this.field1819 = arg0.field1819;
    }

    @ObfuscatedName("dn.t()Ldn;")
    public class128 method2243() {
        class128 var1 = new class128();
        if (this.field1801 != null) {
            var1.field1801 = new byte[this.field1797];
            for (int var2 = 0; var2 < this.field1797; var2++) {
                var1.field1801[var2] = this.field1801[var2];
            }
        }
        var1.field1802 = this.field1802;
        var1.field1797 = this.field1797;
        var1.field1808 = this.field1808;
        var1.field1794 = this.field1794;
        var1.field1827 = this.field1827;
        var1.field1796 = this.field1796;
        var1.field1798 = this.field1798;
        var1.field1795 = this.field1795;
        var1.field1800 = this.field1800;
        var1.field1806 = this.field1806;
        var1.field1803 = this.field1803;
        var1.field1815 = this.field1815;
        var1.field1805 = this.field1805;
        var1.field1823 = this.field1823;
        var1.field1807 = this.field1807;
        var1.field1809 = this.field1809;
        var1.field1810 = this.field1810;
        var1.field1811 = this.field1811;
        var1.field1812 = this.field1812;
        var1.field1820 = this.field1820;
        var1.field1814 = this.field1814;
        var1.field1826 = this.field1826;
        var1.field1816 = this.field1816;
        var1.field1832 = this.field1832;
        var1.field1817 = this.field1817;
        var1.field1818 = this.field1818;
        var1.field1804 = this.field1804;
        var1.field1836 = this.field1836;
        var1.field1799 = this.field1799;
        var1.field1833 = this.field1833;
        var1.field1825 = this.field1825;
        var1.field1824 = this.field1824;
        var1.field1793 = this.field1793;
        var1.field1819 = this.field1819;
        return var1;
    }

    @ObfuscatedName("dn.p([[IIIIZI)Ldn;")
    public class128 method2244(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2322();
        int var7 = this.field1831 + arg1;
        int var8 = this.field1828 + arg1;
        int var9 = this.field1834 + arg3;
        int var10 = this.field1813 + arg3;
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
            var15.field1802 = this.field1802;
            var15.field1797 = this.field1797;
            var15.field1808 = this.field1808;
            var15.field1794 = this.field1794;
            var15.field1796 = this.field1796;
            var15.field1798 = this.field1798;
            var15.field1795 = this.field1795;
            var15.field1800 = this.field1800;
            var15.field1801 = this.field1801;
            var15.field1806 = this.field1806;
            var15.field1803 = this.field1803;
            var15.field1815 = this.field1815;
            var15.field1805 = this.field1805;
            var15.field1823 = this.field1823;
            var15.field1807 = this.field1807;
            var15.field1809 = this.field1809;
            var15.field1810 = this.field1810;
            var15.field1811 = this.field1811;
            var15.field1812 = this.field1812;
            var15.field1820 = this.field1820;
            var15.field1814 = this.field1814;
            var15.field1826 = this.field1826;
            var15.field1816 = this.field1816;
            var15.field1832 = this.field1832;
            var15.field1817 = this.field1817;
            var15.field1818 = this.field1818;
            var15.field1804 = this.field1804;
            var15.field1836 = this.field1836;
            var15.field1799 = this.field1799;
            var15.field1833 = this.field1833;
            var15.field1793 = this.field1793;
            var15.field1819 = this.field1819;
            var15.field1827 = new int[var15.field1802];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1802; var16++) {
                int var17 = this.field1794[var16] + arg1;
                int var18 = this.field1796[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1827[var16] = this.field1827[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1802; var26++) {
                int var27 = (-this.field1827[var26] << 16) / this.field2117;
                if (var27 < arg5) {
                    int var28 = this.field1794[var26] + arg1;
                    int var29 = this.field1796[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1827[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1827[var26];
                }
            }
        }
        var15.method2254();
        return var15;
    }

    @ObfuscatedName("dn.d()V")
    public void method2290() {
        int var10002;
        if (this.field1804 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1802; var3++) {
                int var4 = this.field1804[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1799 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1799[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1802) {
                int var7 = this.field1804[var6];
                this.field1799[var7][var1[var7]++] = var6++;
            }
            this.field1804 = null;
        }
        if (this.field1836 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1797; var10++) {
            int var11 = this.field1836[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1833 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1833[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1797) {
            int var14 = this.field1836[var13];
            this.field1833[var14][var8[var14]++] = var13++;
        }
        this.field1836 = null;
    }

    @ObfuscatedName("dn.n()V")
    public void method2273() {
        for (int var1 = 0; var1 < this.field1802; var1++) {
            int var2 = this.field1794[var1];
            this.field1794[var1] = this.field1796[var1];
            this.field1796[var1] = -var2;
        }
        this.method2254();
    }

    @ObfuscatedName("dn.z()V")
    public void method2246() {
        for (int var1 = 0; var1 < this.field1802; var1++) {
            this.field1794[var1] = -this.field1794[var1];
            this.field1796[var1] = -this.field1796[var1];
        }
        this.method2254();
    }

    @ObfuscatedName("dn.o()V")
    public void method2247() {
        for (int var1 = 0; var1 < this.field1802; var1++) {
            int var2 = this.field1796[var1];
            this.field1796[var1] = this.field1794[var1];
            this.field1794[var1] = -var2;
        }
        this.method2254();
    }

    @ObfuscatedName("dn.u(I)V")
    public void method2289(int arg0) {
        int var2 = field1838[arg0];
        int var3 = field1839[arg0];
        for (int var4 = 0; var4 < this.field1802; var4++) {
            int var5 = this.field1796[var4] * var2 + this.field1794[var4] * var3 >> 16;
            this.field1796[var4] = this.field1796[var4] * var3 - this.field1794[var4] * var2 >> 16;
            this.field1794[var4] = var5;
        }
        this.method2254();
    }

    @ObfuscatedName("dn.r(III)V")
    public void method2248(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1802; var4++) {
            this.field1794[var4] += arg0;
            this.field1827[var4] += arg1;
            this.field1796[var4] += arg2;
        }
        this.method2254();
    }

    @ObfuscatedName("dn.l(SS)V")
    public void method2249(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1797; var3++) {
            if (this.field1805[var3] == arg0) {
                this.field1805[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dn.y(SS)V")
    public void method2250(short arg0, short arg1) {
        if (this.field1823 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1797; var3++) {
            if (this.field1823[var3] == arg0) {
                this.field1823[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dn.w()V")
    public void method2251() {
        for (int var1 = 0; var1 < this.field1802; var1++) {
            this.field1796[var1] = -this.field1796[var1];
        }
        for (int var2 = 0; var2 < this.field1797; var2++) {
            int var3 = this.field1798[var2];
            this.field1798[var2] = this.field1800[var2];
            this.field1800[var2] = var3;
        }
        this.method2254();
    }

    @ObfuscatedName("dn.g(III)V")
    public void method2267(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1802; var4++) {
            this.field1794[var4] = this.field1794[var4] * arg0 / 128;
            this.field1827[var4] = this.field1827[var4] * arg1 / 128;
            this.field1796[var4] = this.field1796[var4] * arg2 / 128;
        }
        this.method2254();
    }

    @ObfuscatedName("dn.a()V")
    public void method2253() {
        if (this.field1825 != null) {
            return;
        }
        this.field1825 = new class136[this.field1802];
        for (int var1 = 0; var1 < this.field1802; var1++) {
            this.field1825[var1] = new class136();
        }
        for (int var2 = 0; var2 < this.field1797; var2++) {
            int var3 = this.field1798[var2];
            int var4 = this.field1795[var2];
            int var5 = this.field1800[var2];
            int var6 = this.field1794[var4] - this.field1794[var3];
            int var7 = this.field1827[var4] - this.field1827[var3];
            int var8 = this.field1796[var4] - this.field1796[var3];
            int var9 = this.field1794[var5] - this.field1794[var3];
            int var10 = this.field1827[var5] - this.field1827[var3];
            int var11 = this.field1796[var5] - this.field1796[var3];
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
            if (this.field1801 == null) {
                var19 = 0;
            } else {
                var19 = this.field1801[var2];
            }
            if (var19 == 0) {
                class136 var20 = this.field1825[var3];
                var20.field2008 += var16;
                var20.field2005 += var17;
                var20.field2006 += var18;
                var20.field2007++;
                class136 var21 = this.field1825[var4];
                var21.field2008 += var16;
                var21.field2005 += var17;
                var21.field2006 += var18;
                var21.field2007++;
                class136 var22 = this.field1825[var5];
                var22.field2008 += var16;
                var22.field2005 += var17;
                var22.field2006 += var18;
                var22.field2007++;
            } else if (var19 == 1) {
                if (this.field1824 == null) {
                    this.field1824 = new class144[this.field1797];
                }
                class144 var23 = this.field1824[var2] = new class144();
                var23.field2134 = var16;
                var23.field2133 = var17;
                var23.field2135 = var18;
            }
        }
    }

    @ObfuscatedName("dn.x()V")
    public void method2254() {
        this.field1825 = null;
        this.field1822 = null;
        this.field1824 = null;
        this.field1829 = false;
    }

    @ObfuscatedName("dn.j()V")
    public void method2322() {
        if (this.field1829) {
            return;
        }
        this.field2117 = 0;
        this.field1830 = 0;
        this.field1831 = 999999;
        this.field1828 = -999999;
        this.field1813 = -99999;
        this.field1834 = 99999;
        for (int var1 = 0; var1 < this.field1802; var1++) {
            int var2 = this.field1794[var1];
            int var3 = this.field1827[var1];
            int var4 = this.field1796[var1];
            if (var2 < this.field1831) {
                this.field1831 = var2;
            }
            if (var2 > this.field1828) {
                this.field1828 = var2;
            }
            if (var4 < this.field1834) {
                this.field1834 = var4;
            }
            if (var4 > this.field1813) {
                this.field1813 = var4;
            }
            if (-var3 > this.field2117) {
                this.field2117 = -var3;
            }
            if (var3 > this.field1830) {
                this.field1830 = var3;
            }
        }
        this.field1829 = true;
    }

    @ObfuscatedName("dn.v(Ldn;Ldn;IIIZ)V")
    public static void method2260(class128 arg0, class128 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2322();
        arg0.method2253();
        arg1.method2322();
        arg1.method2253();
        field1837++;
        int var6 = 0;
        int[] var7 = arg1.field1794;
        int var8 = arg1.field1802;
        for (int var9 = 0; var9 < arg0.field1802; var9++) {
            class136 var10 = arg0.field1825[var9];
            if (var10.field2007 != 0) {
                int var11 = arg0.field1827[var9] - arg3;
                if (var11 <= arg1.field1830) {
                    int var12 = arg0.field1794[var9] - arg2;
                    if (var12 >= arg1.field1831 && var12 <= arg1.field1828) {
                        int var13 = arg0.field1796[var9] - arg4;
                        if (var13 >= arg1.field1834 && var13 <= arg1.field1813) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class136 var15 = arg1.field1825[var14];
                                if (var7[var14] == var12 && arg1.field1796[var14] == var13 && arg1.field1827[var14] == var11 && var15.field2007 != 0) {
                                    if (arg0.field1822 == null) {
                                        arg0.field1822 = new class136[arg0.field1802];
                                    }
                                    if (arg1.field1822 == null) {
                                        arg1.field1822 = new class136[var8];
                                    }
                                    class136 var16 = arg0.field1822[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1822[var9] = new class136(var10);
                                    }
                                    class136 var17 = arg1.field1822[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1822[var14] = new class136(var15);
                                    }
                                    var16.field2008 += var15.field2008;
                                    var16.field2005 += var15.field2005;
                                    var16.field2006 += var15.field2006;
                                    var16.field2007 += var15.field2007;
                                    var17.field2008 += var10.field2008;
                                    var17.field2005 += var10.field2005;
                                    var17.field2006 += var10.field2006;
                                    var17.field2007 += var10.field2007;
                                    var6++;
                                    field1835[var9] = field1837;
                                    field1821[var14] = field1837;
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
        for (int var18 = 0; var18 < arg0.field1797; var18++) {
            if (field1835[arg0.field1798[var18]] == field1837 && field1835[arg0.field1795[var18]] == field1837 && field1835[arg0.field1800[var18]] == field1837) {
                if (arg0.field1801 == null) {
                    arg0.field1801 = new byte[arg0.field1797];
                }
                arg0.field1801[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1797; var19++) {
            if (field1821[arg1.field1798[var19]] == field1837 && field1821[arg1.field1795[var19]] == field1837 && field1821[arg1.field1800[var19]] == field1837) {
                if (arg1.field1801 == null) {
                    arg1.field1801 = new byte[arg1.field1797];
                }
                arg1.field1801[var19] = 2;
            }
        }
    }

    @ObfuscatedName("dn.ap(IIIII)Leb;")
    public final class134 method2257(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2253();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class134 var8 = new class134();
        var8.field1935 = new int[this.field1797];
        var8.field1936 = new int[this.field1797];
        var8.field1937 = new int[this.field1797];
        if (this.field1808 > 0 && this.field1815 != null) {
            int[] var9 = new int[this.field1808];
            for (int var10 = 0; var10 < this.field1797; var10++) {
                if (this.field1815[var10] != -1) {
                    var9[this.field1815[var10] & 0xFF]++;
                }
            }
            var8.field1943 = 0;
            for (int var11 = 0; var11 < this.field1808; var11++) {
                if (var9[var11] > 0 && this.field1809[var11] == 0) {
                    var8.field1943++;
                }
            }
            var8.field1944 = new int[var8.field1943];
            var8.field1945 = new int[var8.field1943];
            var8.field1946 = new int[var8.field1943];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1808; var13++) {
                if (var9[var13] > 0 && this.field1809[var13] == 0) {
                    var8.field1944[var12] = this.field1810[var13] & 0xFFFF;
                    var8.field1945[var12] = this.field1811[var13] & 0xFFFF;
                    var8.field1946[var12] = this.field1812[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1940 = new byte[this.field1797];
            for (int var14 = 0; var14 < this.field1797; var14++) {
                if (this.field1815[var14] == -1) {
                    var8.field1940[var14] = -1;
                } else {
                    var8.field1940[var14] = (byte) var9[this.field1815[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1797; var15++) {
            byte var16;
            if (this.field1801 == null) {
                var16 = 0;
            } else {
                var16 = this.field1801[var15];
            }
            byte var17;
            if (this.field1803 == null) {
                var17 = 0;
            } else {
                var17 = this.field1803[var15];
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
                    int var19 = this.field1805[var15] & 0xFFFF;
                    class136 var20;
                    if (this.field1822 == null || this.field1822[this.field1798[var15]] == null) {
                        var20 = this.field1825[this.field1798[var15]];
                    } else {
                        var20 = this.field1822[this.field1798[var15]];
                    }
                    int var21 = (var20.field2006 * arg4 + var20.field2008 * arg2 + var20.field2005 * arg3) / (var20.field2007 * var7) + arg0;
                    var8.field1935[var15] = method2258(var19, var21);
                    class136 var22;
                    if (this.field1822 == null || this.field1822[this.field1795[var15]] == null) {
                        var22 = this.field1825[this.field1795[var15]];
                    } else {
                        var22 = this.field1822[this.field1795[var15]];
                    }
                    int var23 = (var22.field2006 * arg4 + var22.field2008 * arg2 + var22.field2005 * arg3) / (var22.field2007 * var7) + arg0;
                    var8.field1936[var15] = method2258(var19, var23);
                    class136 var24;
                    if (this.field1822 == null || this.field1822[this.field1800[var15]] == null) {
                        var24 = this.field1825[this.field1800[var15]];
                    } else {
                        var24 = this.field1822[this.field1800[var15]];
                    }
                    int var25 = (var24.field2006 * arg4 + var24.field2008 * arg2 + var24.field2005 * arg3) / (var24.field2007 * var7) + arg0;
                    var8.field1937[var15] = method2258(var19, var25);
                } else if (var16 == 1) {
                    class144 var26 = this.field1824[var15];
                    int var27 = (var26.field2135 * arg4 + var26.field2134 * arg2 + var26.field2133 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1935[var15] = method2258(this.field1805[var15] & 0xFFFF, var27);
                    var8.field1937[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1935[var15] = 128;
                    var8.field1937[var15] = -1;
                } else {
                    var8.field1937[var15] = -2;
                }
            } else if (var16 == 0) {
                class136 var28;
                if (this.field1822 == null || this.field1822[this.field1798[var15]] == null) {
                    var28 = this.field1825[this.field1798[var15]];
                } else {
                    var28 = this.field1822[this.field1798[var15]];
                }
                int var29 = (var28.field2006 * arg4 + var28.field2008 * arg2 + var28.field2005 * arg3) / (var28.field2007 * var7) + arg0;
                var8.field1935[var15] = method2259(var29);
                class136 var30;
                if (this.field1822 == null || this.field1822[this.field1795[var15]] == null) {
                    var30 = this.field1825[this.field1795[var15]];
                } else {
                    var30 = this.field1822[this.field1795[var15]];
                }
                int var31 = (var30.field2006 * arg4 + var30.field2008 * arg2 + var30.field2005 * arg3) / (var30.field2007 * var7) + arg0;
                var8.field1936[var15] = method2259(var31);
                class136 var32;
                if (this.field1822 == null || this.field1822[this.field1800[var15]] == null) {
                    var32 = this.field1825[this.field1800[var15]];
                } else {
                    var32 = this.field1822[this.field1800[var15]];
                }
                int var33 = (var32.field2006 * arg4 + var32.field2008 * arg2 + var32.field2005 * arg3) / (var32.field2007 * var7) + arg0;
                var8.field1937[var15] = method2259(var33);
            } else if (var16 == 1) {
                class144 var34 = this.field1824[var15];
                int var35 = (var34.field2135 * arg4 + var34.field2134 * arg2 + var34.field2133 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1935[var15] = method2259(var35);
                var8.field1937[var15] = -1;
            } else {
                var8.field1937[var15] = -2;
            }
        }
        this.method2290();
        var8.field1927 = this.field1802;
        var8.field1928 = this.field1794;
        var8.field1929 = this.field1827;
        var8.field1932 = this.field1796;
        var8.field1931 = this.field1797;
        var8.field1987 = this.field1798;
        var8.field1933 = this.field1795;
        var8.field1934 = this.field1800;
        var8.field1949 = this.field1806;
        var8.field1939 = this.field1803;
        var8.field1938 = this.field1807;
        var8.field1957 = this.field1799;
        var8.field1948 = this.field1833;
        var8.field1923 = this.field1823;
        return var8;
    }

    @ObfuscatedName("dn.ar(II)I")
    public static final int method2258(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("dn.am(I)I")
    public static final int method2259(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
