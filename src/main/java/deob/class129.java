package deob;

@ObfuscatedName("dn")
public class class129 extends class143 {

    @ObfuscatedName("dn.e")
    public int field1783 = 0;

    @ObfuscatedName("dn.n")
    public int[] field1782;

    @ObfuscatedName("dn.g")
    public int[] field1809;

    @ObfuscatedName("dn.y")
    public int[] field1784;

    @ObfuscatedName("dn.w")
    public int field1785 = 0;

    @ObfuscatedName("dn.k")
    public int[] field1790;

    @ObfuscatedName("dn.v")
    public int[] field1787;

    @ObfuscatedName("dn.z")
    public int[] field1788;

    @ObfuscatedName("dn.r")
    public byte[] field1802;

    @ObfuscatedName("dn.u")
    public byte[] field1789;

    @ObfuscatedName("dn.d")
    public byte[] field1791;

    @ObfuscatedName("dn.o")
    public byte[] field1792;

    @ObfuscatedName("dn.l")
    public short[] field1793;

    @ObfuscatedName("dn.h")
    public short[] field1794;

    @ObfuscatedName("dn.s")
    public byte field1795 = 0;

    @ObfuscatedName("dn.c")
    public int field1796;

    @ObfuscatedName("dn.m")
    public byte[] field1797;

    @ObfuscatedName("dn.a")
    public short[] field1798;

    @ObfuscatedName("dn.t")
    public short[] field1799;

    @ObfuscatedName("dn.p")
    public short[] field1800;

    @ObfuscatedName("dn.f")
    public short[] field1812;

    @ObfuscatedName("dn.b")
    public short[] field1817;

    @ObfuscatedName("dn.x")
    public short[] field1803;

    @ObfuscatedName("dn.i")
    public short[] field1804;

    @ObfuscatedName("dn.j")
    public short[] field1805;

    @ObfuscatedName("dn.q")
    public short[] field1806;

    @ObfuscatedName("dn.ag")
    public byte[] field1827;

    @ObfuscatedName("dn.ay")
    public int[] field1808;

    @ObfuscatedName("dn.au")
    public int[] field1821;

    @ObfuscatedName("dn.ah")
    public int[][] field1810;

    @ObfuscatedName("dn.ao")
    public int[][] field1811;

    @ObfuscatedName("dn.al")
    public class145[] field1801;

    @ObfuscatedName("dn.ae")
    public class137[] field1813;

    @ObfuscatedName("dn.ax")
    public class137[] field1814;

    @ObfuscatedName("dn.az")
    public short field1815;

    @ObfuscatedName("dn.aw")
    public short field1781;

    @ObfuscatedName("dn.av")
    public boolean field1816 = false;

    @ObfuscatedName("dn.ac")
    public int field1818;

    @ObfuscatedName("dn.ak")
    public int field1819;

    @ObfuscatedName("dn.ad")
    public int field1820;

    @ObfuscatedName("dn.at")
    public int field1807;

    @ObfuscatedName("dn.af")
    public int field1822;

    @ObfuscatedName("dn.am")
    public static int[] field1823 = new int[10000];

    @ObfuscatedName("dn.aq")
    public static int[] field1824 = new int[10000];

    @ObfuscatedName("dn.as")
    public static int field1825 = 0;

    @ObfuscatedName("dn.ab")
    public static int[] field1826 = class138.field2004;

    @ObfuscatedName("dn.ap")
    public static int[] field1786 = class138.field2027;

    public class129() {
    }

    @ObfuscatedName("dn.e(Lit;II)Ldn;")
    public static class129 method2235(class237 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3817(arg1, arg2);
        return var3 == null ? null : new class129(var3);
    }

    public class129(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2257(arg0);
        } else {
            this.method2224(arg0);
        }
    }

    @ObfuscatedName("dn.n([B)V")
    public void method2257(byte[] arg0) {
        class175 var2 = new class175(arg0);
        class175 var3 = new class175(arg0);
        class175 var4 = new class175(arg0);
        class175 var5 = new class175(arg0);
        class175 var6 = new class175(arg0);
        class175 var7 = new class175(arg0);
        class175 var8 = new class175(arg0);
        var2.field2381 = arg0.length - 23;
        int var9 = var2.method3091();
        int var10 = var2.method3091();
        int var11 = var2.method2928();
        int var12 = var2.method2928();
        int var13 = var2.method2928();
        int var14 = var2.method2928();
        int var15 = var2.method2928();
        int var16 = var2.method2928();
        int var17 = var2.method2928();
        int var18 = var2.method3091();
        int var19 = var2.method3091();
        int var20 = var2.method3091();
        int var21 = var2.method3091();
        int var22 = var2.method3091();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1797 = new byte[var11];
            var2.field2381 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1797[var26] = var2.method2998();
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
        this.field1783 = var9;
        this.field1785 = var10;
        this.field1796 = var11;
        this.field1782 = new int[var9];
        this.field1809 = new int[var9];
        this.field1784 = new int[var9];
        this.field1790 = new int[var10];
        this.field1787 = new int[var10];
        this.field1788 = new int[var10];
        if (var17 == 1) {
            this.field1808 = new int[var9];
        }
        if (var12 == 1) {
            this.field1802 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1789 = new byte[var10];
        } else {
            this.field1795 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1791 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1821 = new int[var10];
        }
        if (var16 == 1) {
            this.field1794 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1792 = new byte[var10];
        }
        this.field1793 = new short[var10];
        if (var11 > 0) {
            this.field1798 = new short[var11];
            this.field1799 = new short[var11];
            this.field1800 = new short[var11];
            if (var24 > 0) {
                this.field1812 = new short[var24];
                this.field1817 = new short[var24];
                this.field1803 = new short[var24];
                this.field1804 = new short[var24];
                this.field1827 = new byte[var24];
                this.field1805 = new short[var24];
            }
            if (var25 > 0) {
                this.field1806 = new short[var25];
            }
        }
        var2.field2381 = var11;
        var3.field2381 = var44;
        var4.field2381 = var46;
        var5.field2381 = var48;
        var6.field2381 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2928();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2940();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2940();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2940();
            }
            this.field1782[var67] = var64 + var69;
            this.field1809[var67] = var65 + var70;
            this.field1784[var67] = var66 + var71;
            var64 = this.field1782[var67];
            var65 = this.field1809[var67];
            var66 = this.field1784[var67];
            if (var17 == 1) {
                this.field1808[var67] = var6.method2928();
            }
        }
        var2.field2381 = var42;
        var3.field2381 = var31;
        var4.field2381 = var34;
        var5.field2381 = var37;
        var6.field2381 = var35;
        var7.field2381 = var40;
        var8.field2381 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1793[var72] = (short) var2.method3091();
            if (var12 == 1) {
                this.field1802[var72] = var3.method2998();
            }
            if (var13 == 255) {
                this.field1789[var72] = var4.method2998();
            }
            if (var14 == 1) {
                this.field1791[var72] = var5.method2998();
            }
            if (var15 == 1) {
                this.field1821[var72] = var6.method2928();
            }
            if (var16 == 1) {
                this.field1794[var72] = (short) (var7.method3091() - 1);
            }
            if (this.field1792 != null && this.field1794[var72] != -1) {
                this.field1792[var72] = (byte) (var8.method2928() - 1);
            }
        }
        var2.field2381 = var33;
        var3.field2381 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2928();
            if (var78 == 1) {
                var73 = var2.method2940() + var76;
                var74 = var2.method2940() + var73;
                var75 = var2.method2940() + var74;
                var76 = var75;
                this.field1790[var77] = var73;
                this.field1787[var77] = var74;
                this.field1788[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2940() + var76;
                var76 = var75;
                this.field1790[var77] = var73;
                this.field1787[var77] = var74;
                this.field1788[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2940() + var76;
                var76 = var75;
                this.field1790[var77] = var73;
                this.field1787[var77] = var74;
                this.field1788[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2940() + var76;
                var76 = var75;
                this.field1790[var77] = var73;
                this.field1787[var77] = var81;
                this.field1788[var77] = var75;
            }
        }
        var2.field2381 = var50;
        var3.field2381 = var52;
        var4.field2381 = var54;
        var5.field2381 = var56;
        var6.field2381 = var58;
        var7.field2381 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1797[var82] & 0xFF;
            if (var83 == 0) {
                this.field1798[var82] = (short) var2.method3091();
                this.field1799[var82] = (short) var2.method3091();
                this.field1800[var82] = (short) var2.method3091();
            }
            if (var83 == 1) {
                this.field1798[var82] = (short) var3.method3091();
                this.field1799[var82] = (short) var3.method3091();
                this.field1800[var82] = (short) var3.method3091();
                this.field1812[var82] = (short) var4.method3091();
                this.field1817[var82] = (short) var4.method3091();
                this.field1803[var82] = (short) var4.method3091();
                this.field1804[var82] = (short) var5.method3091();
                this.field1827[var82] = var6.method2998();
                this.field1805[var82] = (short) var7.method3091();
            }
            if (var83 == 2) {
                this.field1798[var82] = (short) var3.method3091();
                this.field1799[var82] = (short) var3.method3091();
                this.field1800[var82] = (short) var3.method3091();
                this.field1812[var82] = (short) var4.method3091();
                this.field1817[var82] = (short) var4.method3091();
                this.field1803[var82] = (short) var4.method3091();
                this.field1804[var82] = (short) var5.method3091();
                this.field1827[var82] = var6.method2998();
                this.field1805[var82] = (short) var7.method3091();
                this.field1806[var82] = (short) var7.method3091();
            }
            if (var83 == 3) {
                this.field1798[var82] = (short) var3.method3091();
                this.field1799[var82] = (short) var3.method3091();
                this.field1800[var82] = (short) var3.method3091();
                this.field1812[var82] = (short) var4.method3091();
                this.field1817[var82] = (short) var4.method3091();
                this.field1803[var82] = (short) var4.method3091();
                this.field1804[var82] = (short) var5.method3091();
                this.field1827[var82] = var6.method2998();
                this.field1805[var82] = (short) var7.method3091();
            }
        }
        var2.field2381 = var62;
        int var84 = var2.method2928();
        if (var84 == 0) {
            return;
        }
        new class142();
        var2.method3091();
        var2.method3091();
        var2.method3091();
        var2.method2933();
    }

    @ObfuscatedName("dn.y([B)V")
    public void method2224(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class175 var4 = new class175(arg0);
        class175 var5 = new class175(arg0);
        class175 var6 = new class175(arg0);
        class175 var7 = new class175(arg0);
        class175 var8 = new class175(arg0);
        var4.field2381 = arg0.length - 18;
        int var9 = var4.method3091();
        int var10 = var4.method3091();
        int var11 = var4.method2928();
        int var12 = var4.method2928();
        int var13 = var4.method2928();
        int var14 = var4.method2928();
        int var15 = var4.method2928();
        int var16 = var4.method2928();
        int var17 = var4.method3091();
        int var18 = var4.method3091();
        int var19 = var4.method3091();
        int var20 = var4.method3091();
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
        this.field1783 = var9;
        this.field1785 = var10;
        this.field1796 = var11;
        this.field1782 = new int[var9];
        this.field1809 = new int[var9];
        this.field1784 = new int[var9];
        this.field1790 = new int[var10];
        this.field1787 = new int[var10];
        this.field1788 = new int[var10];
        if (var11 > 0) {
            this.field1797 = new byte[var11];
            this.field1798 = new short[var11];
            this.field1799 = new short[var11];
            this.field1800 = new short[var11];
        }
        if (var16 == 1) {
            this.field1808 = new int[var9];
        }
        if (var12 == 1) {
            this.field1802 = new byte[var10];
            this.field1792 = new byte[var10];
            this.field1794 = new short[var10];
        }
        if (var13 == 255) {
            this.field1789 = new byte[var10];
        } else {
            this.field1795 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1791 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1821 = new int[var10];
        }
        this.field1793 = new short[var10];
        var4.field2381 = var21;
        var5.field2381 = var36;
        var6.field2381 = var38;
        var7.field2381 = var40;
        var8.field2381 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2928();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2940();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2940();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2940();
            }
            this.field1782[var46] = var43 + var48;
            this.field1809[var46] = var44 + var49;
            this.field1784[var46] = var45 + var50;
            var43 = this.field1782[var46];
            var44 = this.field1809[var46];
            var45 = this.field1784[var46];
            if (var16 == 1) {
                this.field1808[var46] = var8.method2928();
            }
        }
        var4.field2381 = var32;
        var5.field2381 = var28;
        var6.field2381 = var26;
        var7.field2381 = var30;
        var8.field2381 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1793[var51] = (short) var4.method3091();
            if (var12 == 1) {
                int var52 = var5.method2928();
                if ((var52 & 0x1) == 1) {
                    this.field1802[var51] = 1;
                    var2 = true;
                } else {
                    this.field1802[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1792[var51] = (byte) (var52 >> 2);
                    this.field1794[var51] = this.field1793[var51];
                    this.field1793[var51] = 127;
                    if (this.field1794[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1792[var51] = -1;
                    this.field1794[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1789[var51] = var6.method2998();
            }
            if (var14 == 1) {
                this.field1791[var51] = var7.method2998();
            }
            if (var15 == 1) {
                this.field1821[var51] = var8.method2928();
            }
        }
        var4.field2381 = var25;
        var5.field2381 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2928();
            if (var58 == 1) {
                var53 = var4.method2940() + var56;
                var54 = var4.method2940() + var53;
                var55 = var4.method2940() + var54;
                var56 = var55;
                this.field1790[var57] = var53;
                this.field1787[var57] = var54;
                this.field1788[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2940() + var56;
                var56 = var55;
                this.field1790[var57] = var53;
                this.field1787[var57] = var54;
                this.field1788[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2940() + var56;
                var56 = var55;
                this.field1790[var57] = var53;
                this.field1787[var57] = var54;
                this.field1788[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2940() + var56;
                var56 = var55;
                this.field1790[var57] = var53;
                this.field1787[var57] = var61;
                this.field1788[var57] = var55;
            }
        }
        var4.field2381 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1797[var62] = 0;
            this.field1798[var62] = (short) var4.method3091();
            this.field1799[var62] = (short) var4.method3091();
            this.field1800[var62] = (short) var4.method3091();
        }
        if (this.field1792 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1792[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1798[var65] & 0xFFFF) == this.field1790[var64] && (this.field1799[var65] & 0xFFFF) == this.field1787[var64] && (this.field1800[var65] & 0xFFFF) == this.field1788[var64]) {
                        this.field1792[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1792 = null;
            }
        }
        if (!var3) {
            this.field1794 = null;
        }
        if (!var2) {
            this.field1802 = null;
        }
    }

    public class129(class129[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1783 = 0;
        this.field1785 = 0;
        this.field1796 = 0;
        this.field1795 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class129 var10 = arg0[var9];
            if (var10 != null) {
                this.field1783 += var10.field1783;
                this.field1785 += var10.field1785;
                this.field1796 += var10.field1796;
                if (var10.field1789 == null) {
                    if (this.field1795 == -1) {
                        this.field1795 = var10.field1795;
                    }
                    if (this.field1795 != var10.field1795) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1802 != null;
                var5 |= var10.field1791 != null;
                var6 |= var10.field1821 != null;
                var7 |= var10.field1794 != null;
                var8 |= var10.field1792 != null;
            }
        }
        this.field1782 = new int[this.field1783];
        this.field1809 = new int[this.field1783];
        this.field1784 = new int[this.field1783];
        this.field1808 = new int[this.field1783];
        this.field1790 = new int[this.field1785];
        this.field1787 = new int[this.field1785];
        this.field1788 = new int[this.field1785];
        if (var3) {
            this.field1802 = new byte[this.field1785];
        }
        if (var4) {
            this.field1789 = new byte[this.field1785];
        }
        if (var5) {
            this.field1791 = new byte[this.field1785];
        }
        if (var6) {
            this.field1821 = new int[this.field1785];
        }
        if (var7) {
            this.field1794 = new short[this.field1785];
        }
        if (var8) {
            this.field1792 = new byte[this.field1785];
        }
        this.field1793 = new short[this.field1785];
        if (this.field1796 > 0) {
            this.field1797 = new byte[this.field1796];
            this.field1798 = new short[this.field1796];
            this.field1799 = new short[this.field1796];
            this.field1800 = new short[this.field1796];
            this.field1812 = new short[this.field1796];
            this.field1817 = new short[this.field1796];
            this.field1803 = new short[this.field1796];
            this.field1804 = new short[this.field1796];
            this.field1827 = new byte[this.field1796];
            this.field1805 = new short[this.field1796];
            this.field1806 = new short[this.field1796];
        }
        this.field1783 = 0;
        this.field1785 = 0;
        this.field1796 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class129 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1785; var13++) {
                    if (var3 && var12.field1802 != null) {
                        this.field1802[this.field1785] = var12.field1802[var13];
                    }
                    if (var4) {
                        if (var12.field1789 == null) {
                            this.field1789[this.field1785] = var12.field1795;
                        } else {
                            this.field1789[this.field1785] = var12.field1789[var13];
                        }
                    }
                    if (var5 && var12.field1791 != null) {
                        this.field1791[this.field1785] = var12.field1791[var13];
                    }
                    if (var6 && var12.field1821 != null) {
                        this.field1821[this.field1785] = var12.field1821[var13];
                    }
                    if (var7) {
                        if (var12.field1794 == null) {
                            this.field1794[this.field1785] = -1;
                        } else {
                            this.field1794[this.field1785] = var12.field1794[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1792 == null || var12.field1792[var13] == -1) {
                            this.field1792[this.field1785] = -1;
                        } else {
                            this.field1792[this.field1785] = (byte) (var12.field1792[var13] + this.field1796);
                        }
                    }
                    this.field1793[this.field1785] = var12.field1793[var13];
                    this.field1790[this.field1785] = this.method2225(var12, var12.field1790[var13]);
                    this.field1787[this.field1785] = this.method2225(var12, var12.field1787[var13]);
                    this.field1788[this.field1785] = this.method2225(var12, var12.field1788[var13]);
                    this.field1785++;
                }
                for (int var14 = 0; var14 < var12.field1796; var14++) {
                    byte var15 = this.field1797[this.field1796] = var12.field1797[var14];
                    if (var15 == 0) {
                        this.field1798[this.field1796] = (short) this.method2225(var12, var12.field1798[var14]);
                        this.field1799[this.field1796] = (short) this.method2225(var12, var12.field1799[var14]);
                        this.field1800[this.field1796] = (short) this.method2225(var12, var12.field1800[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1798[this.field1796] = var12.field1798[var14];
                        this.field1799[this.field1796] = var12.field1799[var14];
                        this.field1800[this.field1796] = var12.field1800[var14];
                        this.field1812[this.field1796] = var12.field1812[var14];
                        this.field1817[this.field1796] = var12.field1817[var14];
                        this.field1803[this.field1796] = var12.field1803[var14];
                        this.field1804[this.field1796] = var12.field1804[var14];
                        this.field1827[this.field1796] = var12.field1827[var14];
                        this.field1805[this.field1796] = var12.field1805[var14];
                    }
                    if (var15 == 2) {
                        this.field1806[this.field1796] = var12.field1806[var14];
                    }
                    this.field1796++;
                }
            }
        }
    }

    @ObfuscatedName("dn.w(Ldn;I)I")
    public final int method2225(class129 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1782[arg1];
        int var5 = arg0.field1809[arg1];
        int var6 = arg0.field1784[arg1];
        for (int var7 = 0; var7 < this.field1783; var7++) {
            if (this.field1782[var7] == var4 && this.field1809[var7] == var5 && this.field1784[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1782[this.field1783] = var4;
            this.field1809[this.field1783] = var5;
            this.field1784[this.field1783] = var6;
            if (arg0.field1808 != null) {
                this.field1808[this.field1783] = arg0.field1808[arg1];
            }
            var3 = this.field1783++;
        }
        return var3;
    }

    public class129(class129 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1783 = arg0.field1783;
        this.field1785 = arg0.field1785;
        this.field1796 = arg0.field1796;
        if (arg1) {
            this.field1782 = arg0.field1782;
            this.field1809 = arg0.field1809;
            this.field1784 = arg0.field1784;
        } else {
            this.field1782 = new int[this.field1783];
            this.field1809 = new int[this.field1783];
            this.field1784 = new int[this.field1783];
            for (int var6 = 0; var6 < this.field1783; var6++) {
                this.field1782[var6] = arg0.field1782[var6];
                this.field1809[var6] = arg0.field1809[var6];
                this.field1784[var6] = arg0.field1784[var6];
            }
        }
        if (arg2) {
            this.field1793 = arg0.field1793;
        } else {
            this.field1793 = new short[this.field1785];
            for (int var7 = 0; var7 < this.field1785; var7++) {
                this.field1793[var7] = arg0.field1793[var7];
            }
        }
        if (arg3 || arg0.field1794 == null) {
            this.field1794 = arg0.field1794;
        } else {
            this.field1794 = new short[this.field1785];
            for (int var8 = 0; var8 < this.field1785; var8++) {
                this.field1794[var8] = arg0.field1794[var8];
            }
        }
        if (arg4) {
            this.field1791 = arg0.field1791;
        } else {
            this.field1791 = new byte[this.field1785];
            if (arg0.field1791 == null) {
                for (int var9 = 0; var9 < this.field1785; var9++) {
                    this.field1791[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1785; var10++) {
                    this.field1791[var10] = arg0.field1791[var10];
                }
            }
        }
        this.field1790 = arg0.field1790;
        this.field1787 = arg0.field1787;
        this.field1788 = arg0.field1788;
        this.field1802 = arg0.field1802;
        this.field1789 = arg0.field1789;
        this.field1792 = arg0.field1792;
        this.field1795 = arg0.field1795;
        this.field1797 = arg0.field1797;
        this.field1798 = arg0.field1798;
        this.field1799 = arg0.field1799;
        this.field1800 = arg0.field1800;
        this.field1812 = arg0.field1812;
        this.field1817 = arg0.field1817;
        this.field1803 = arg0.field1803;
        this.field1804 = arg0.field1804;
        this.field1827 = arg0.field1827;
        this.field1805 = arg0.field1805;
        this.field1806 = arg0.field1806;
        this.field1808 = arg0.field1808;
        this.field1821 = arg0.field1821;
        this.field1810 = arg0.field1810;
        this.field1811 = arg0.field1811;
        this.field1813 = arg0.field1813;
        this.field1801 = arg0.field1801;
        this.field1814 = arg0.field1814;
        this.field1815 = arg0.field1815;
        this.field1781 = arg0.field1781;
    }

    @ObfuscatedName("dn.k()Ldn;")
    public class129 method2226() {
        class129 var1 = new class129();
        if (this.field1802 != null) {
            var1.field1802 = new byte[this.field1785];
            for (int var2 = 0; var2 < this.field1785; var2++) {
                var1.field1802[var2] = this.field1802[var2];
            }
        }
        var1.field1783 = this.field1783;
        var1.field1785 = this.field1785;
        var1.field1796 = this.field1796;
        var1.field1782 = this.field1782;
        var1.field1809 = this.field1809;
        var1.field1784 = this.field1784;
        var1.field1790 = this.field1790;
        var1.field1787 = this.field1787;
        var1.field1788 = this.field1788;
        var1.field1789 = this.field1789;
        var1.field1791 = this.field1791;
        var1.field1792 = this.field1792;
        var1.field1793 = this.field1793;
        var1.field1794 = this.field1794;
        var1.field1795 = this.field1795;
        var1.field1797 = this.field1797;
        var1.field1798 = this.field1798;
        var1.field1799 = this.field1799;
        var1.field1800 = this.field1800;
        var1.field1812 = this.field1812;
        var1.field1817 = this.field1817;
        var1.field1803 = this.field1803;
        var1.field1804 = this.field1804;
        var1.field1827 = this.field1827;
        var1.field1805 = this.field1805;
        var1.field1806 = this.field1806;
        var1.field1808 = this.field1808;
        var1.field1821 = this.field1821;
        var1.field1810 = this.field1810;
        var1.field1811 = this.field1811;
        var1.field1813 = this.field1813;
        var1.field1801 = this.field1801;
        var1.field1815 = this.field1815;
        var1.field1781 = this.field1781;
        return var1;
    }

    @ObfuscatedName("dn.v([[IIIIZI)Ldn;")
    public class129 method2227(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2240();
        int var7 = this.field1819 + arg1;
        int var8 = this.field1820 + arg1;
        int var9 = this.field1822 + arg3;
        int var10 = this.field1807 + arg3;
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
            var15.field1783 = this.field1783;
            var15.field1785 = this.field1785;
            var15.field1796 = this.field1796;
            var15.field1782 = this.field1782;
            var15.field1784 = this.field1784;
            var15.field1790 = this.field1790;
            var15.field1787 = this.field1787;
            var15.field1788 = this.field1788;
            var15.field1802 = this.field1802;
            var15.field1789 = this.field1789;
            var15.field1791 = this.field1791;
            var15.field1792 = this.field1792;
            var15.field1793 = this.field1793;
            var15.field1794 = this.field1794;
            var15.field1795 = this.field1795;
            var15.field1797 = this.field1797;
            var15.field1798 = this.field1798;
            var15.field1799 = this.field1799;
            var15.field1800 = this.field1800;
            var15.field1812 = this.field1812;
            var15.field1817 = this.field1817;
            var15.field1803 = this.field1803;
            var15.field1804 = this.field1804;
            var15.field1827 = this.field1827;
            var15.field1805 = this.field1805;
            var15.field1806 = this.field1806;
            var15.field1808 = this.field1808;
            var15.field1821 = this.field1821;
            var15.field1810 = this.field1810;
            var15.field1811 = this.field1811;
            var15.field1815 = this.field1815;
            var15.field1781 = this.field1781;
            var15.field1809 = new int[var15.field1783];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1783; var16++) {
                int var17 = this.field1782[var16] + arg1;
                int var18 = this.field1784[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1809[var16] = this.field1809[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1783; var26++) {
                int var27 = (-this.field1809[var26] << 16) / this.field2113;
                if (var27 < arg5) {
                    int var28 = this.field1782[var26] + arg1;
                    int var29 = this.field1784[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1809[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1809[var26];
                }
            }
        }
        var15.method2239();
        return var15;
    }

    @ObfuscatedName("dn.z()V")
    public void method2228() {
        int var10002;
        if (this.field1808 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1783; var3++) {
                int var4 = this.field1808[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1810 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1810[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1783) {
                int var7 = this.field1808[var6];
                this.field1810[var7][var1[var7]++] = var6++;
            }
            this.field1808 = null;
        }
        if (this.field1821 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1785; var10++) {
            int var11 = this.field1821[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1811 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1811[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1785) {
            int var14 = this.field1821[var13];
            this.field1811[var14][var8[var14]++] = var13++;
        }
        this.field1821 = null;
    }

    @ObfuscatedName("dn.r()V")
    public void method2229() {
        for (int var1 = 0; var1 < this.field1783; var1++) {
            int var2 = this.field1782[var1];
            this.field1782[var1] = this.field1784[var1];
            this.field1784[var1] = -var2;
        }
        this.method2239();
    }

    @ObfuscatedName("dn.u()V")
    public void method2259() {
        for (int var1 = 0; var1 < this.field1783; var1++) {
            this.field1782[var1] = -this.field1782[var1];
            this.field1784[var1] = -this.field1784[var1];
        }
        this.method2239();
    }

    @ObfuscatedName("dn.d()V")
    public void method2231() {
        for (int var1 = 0; var1 < this.field1783; var1++) {
            int var2 = this.field1784[var1];
            this.field1784[var1] = this.field1782[var1];
            this.field1782[var1] = -var2;
        }
        this.method2239();
    }

    @ObfuscatedName("dn.o(I)V")
    public void method2232(int arg0) {
        int var2 = field1826[arg0];
        int var3 = field1786[arg0];
        for (int var4 = 0; var4 < this.field1783; var4++) {
            int var5 = this.field1784[var4] * var2 + this.field1782[var4] * var3 >> 16;
            this.field1784[var4] = this.field1784[var4] * var3 - this.field1782[var4] * var2 >> 16;
            this.field1782[var4] = var5;
        }
        this.method2239();
    }

    @ObfuscatedName("dn.m(III)V")
    public void method2222(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1783; var4++) {
            this.field1782[var4] += arg0;
            this.field1809[var4] += arg1;
            this.field1784[var4] += arg2;
        }
        this.method2239();
    }

    @ObfuscatedName("dn.a(SS)V")
    public void method2234(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1785; var3++) {
            if (this.field1793[var3] == arg0) {
                this.field1793[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dn.t(SS)V")
    public void method2248(short arg0, short arg1) {
        if (this.field1794 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1785; var3++) {
            if (this.field1794[var3] == arg0) {
                this.field1794[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dn.p()V")
    public void method2264() {
        for (int var1 = 0; var1 < this.field1783; var1++) {
            this.field1784[var1] = -this.field1784[var1];
        }
        for (int var2 = 0; var2 < this.field1785; var2++) {
            int var3 = this.field1790[var2];
            this.field1790[var2] = this.field1788[var2];
            this.field1788[var2] = var3;
        }
        this.method2239();
    }

    @ObfuscatedName("dn.f(III)V")
    public void method2237(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1783; var4++) {
            this.field1782[var4] = this.field1782[var4] * arg0 / 128;
            this.field1809[var4] = this.field1809[var4] * arg1 / 128;
            this.field1784[var4] = this.field1784[var4] * arg2 / 128;
        }
        this.method2239();
    }

    @ObfuscatedName("dn.x()V")
    public void method2285() {
        if (this.field1813 != null) {
            return;
        }
        this.field1813 = new class137[this.field1783];
        for (int var1 = 0; var1 < this.field1783; var1++) {
            this.field1813[var1] = new class137();
        }
        for (int var2 = 0; var2 < this.field1785; var2++) {
            int var3 = this.field1790[var2];
            int var4 = this.field1787[var2];
            int var5 = this.field1788[var2];
            int var6 = this.field1782[var4] - this.field1782[var3];
            int var7 = this.field1809[var4] - this.field1809[var3];
            int var8 = this.field1784[var4] - this.field1784[var3];
            int var9 = this.field1782[var5] - this.field1782[var3];
            int var10 = this.field1809[var5] - this.field1809[var3];
            int var11 = this.field1784[var5] - this.field1784[var3];
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
            if (this.field1802 == null) {
                var19 = 0;
            } else {
                var19 = this.field1802[var2];
            }
            if (var19 == 0) {
                class137 var20 = this.field1813[var3];
                var20.field2000 += var16;
                var20.field1996 += var17;
                var20.field1998 += var18;
                var20.field1999++;
                class137 var21 = this.field1813[var4];
                var21.field2000 += var16;
                var21.field1996 += var17;
                var21.field1998 += var18;
                var21.field1999++;
                class137 var22 = this.field1813[var5];
                var22.field2000 += var16;
                var22.field1996 += var17;
                var22.field1998 += var18;
                var22.field1999++;
            } else if (var19 == 1) {
                if (this.field1801 == null) {
                    this.field1801 = new class145[this.field1785];
                }
                class145 var23 = this.field1801[var2] = new class145();
                var23.field2127 = var16;
                var23.field2126 = var17;
                var23.field2125 = var18;
            }
        }
    }

    @ObfuscatedName("dn.q()V")
    public void method2239() {
        this.field1813 = null;
        this.field1814 = null;
        this.field1801 = null;
        this.field1816 = false;
    }

    @ObfuscatedName("dn.ag()V")
    public void method2240() {
        if (this.field1816) {
            return;
        }
        this.field2113 = 0;
        this.field1818 = 0;
        this.field1819 = 999999;
        this.field1820 = -999999;
        this.field1807 = -99999;
        this.field1822 = 99999;
        for (int var1 = 0; var1 < this.field1783; var1++) {
            int var2 = this.field1782[var1];
            int var3 = this.field1809[var1];
            int var4 = this.field1784[var1];
            if (var2 < this.field1819) {
                this.field1819 = var2;
            }
            if (var2 > this.field1820) {
                this.field1820 = var2;
            }
            if (var4 < this.field1822) {
                this.field1822 = var4;
            }
            if (var4 > this.field1807) {
                this.field1807 = var4;
            }
            if (-var3 > this.field2113) {
                this.field2113 = -var3;
            }
            if (var3 > this.field1818) {
                this.field1818 = var3;
            }
        }
        this.field1816 = true;
    }

    @ObfuscatedName("dn.ay(Ldn;Ldn;IIIZ)V")
    public static void method2241(class129 arg0, class129 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2240();
        arg0.method2285();
        arg1.method2240();
        arg1.method2285();
        field1825++;
        int var6 = 0;
        int[] var7 = arg1.field1782;
        int var8 = arg1.field1783;
        for (int var9 = 0; var9 < arg0.field1783; var9++) {
            class137 var10 = arg0.field1813[var9];
            if (var10.field1999 != 0) {
                int var11 = arg0.field1809[var9] - arg3;
                if (var11 <= arg1.field1818) {
                    int var12 = arg0.field1782[var9] - arg2;
                    if (var12 >= arg1.field1819 && var12 <= arg1.field1820) {
                        int var13 = arg0.field1784[var9] - arg4;
                        if (var13 >= arg1.field1822 && var13 <= arg1.field1807) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class137 var15 = arg1.field1813[var14];
                                if (var7[var14] == var12 && arg1.field1784[var14] == var13 && arg1.field1809[var14] == var11 && var15.field1999 != 0) {
                                    if (arg0.field1814 == null) {
                                        arg0.field1814 = new class137[arg0.field1783];
                                    }
                                    if (arg1.field1814 == null) {
                                        arg1.field1814 = new class137[var8];
                                    }
                                    class137 var16 = arg0.field1814[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1814[var9] = new class137(var10);
                                    }
                                    class137 var17 = arg1.field1814[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1814[var14] = new class137(var15);
                                    }
                                    var16.field2000 += var15.field2000;
                                    var16.field1996 += var15.field1996;
                                    var16.field1998 += var15.field1998;
                                    var16.field1999 += var15.field1999;
                                    var17.field2000 += var10.field2000;
                                    var17.field1996 += var10.field1996;
                                    var17.field1998 += var10.field1998;
                                    var17.field1999 += var10.field1999;
                                    var6++;
                                    field1823[var9] = field1825;
                                    field1824[var14] = field1825;
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
        for (int var18 = 0; var18 < arg0.field1785; var18++) {
            if (field1823[arg0.field1790[var18]] == field1825 && field1823[arg0.field1787[var18]] == field1825 && field1823[arg0.field1788[var18]] == field1825) {
                if (arg0.field1802 == null) {
                    arg0.field1802 = new byte[arg0.field1785];
                }
                arg0.field1802[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1785; var19++) {
            if (field1824[arg1.field1790[var19]] == field1825 && field1824[arg1.field1787[var19]] == field1825 && field1824[arg1.field1788[var19]] == field1825) {
                if (arg1.field1802 == null) {
                    arg1.field1802 = new byte[arg1.field1785];
                }
                arg1.field1802[var19] = 2;
            }
        }
    }

    @ObfuscatedName("dn.au(IIIII)Lew;")
    public final class135 method2242(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2285();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class135 var8 = new class135();
        var8.field1925 = new int[this.field1785];
        var8.field1974 = new int[this.field1785];
        var8.field1927 = new int[this.field1785];
        if (this.field1796 > 0 && this.field1792 != null) {
            int[] var9 = new int[this.field1796];
            for (int var10 = 0; var10 < this.field1785; var10++) {
                if (this.field1792[var10] != -1) {
                    var9[this.field1792[var10] & 0xFF]++;
                }
            }
            var8.field1961 = 0;
            for (int var11 = 0; var11 < this.field1796; var11++) {
                if (var9[var11] > 0 && this.field1797[var11] == 0) {
                    var8.field1961++;
                }
            }
            var8.field1926 = new int[var8.field1961];
            var8.field1981 = new int[var8.field1961];
            var8.field1936 = new int[var8.field1961];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1796; var13++) {
                if (var9[var13] > 0 && this.field1797[var13] == 0) {
                    var8.field1926[var12] = this.field1798[var13] & 0xFFFF;
                    var8.field1981[var12] = this.field1799[var13] & 0xFFFF;
                    var8.field1936[var12] = this.field1800[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1930 = new byte[this.field1785];
            for (int var14 = 0; var14 < this.field1785; var14++) {
                if (this.field1792[var14] == -1) {
                    var8.field1930[var14] = -1;
                } else {
                    var8.field1930[var14] = (byte) var9[this.field1792[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1785; var15++) {
            byte var16;
            if (this.field1802 == null) {
                var16 = 0;
            } else {
                var16 = this.field1802[var15];
            }
            byte var17;
            if (this.field1791 == null) {
                var17 = 0;
            } else {
                var17 = this.field1791[var15];
            }
            short var18;
            if (this.field1794 == null) {
                var18 = -1;
            } else {
                var18 = this.field1794[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1793[var15] & 0xFFFF;
                    class137 var20;
                    if (this.field1814 == null || this.field1814[this.field1790[var15]] == null) {
                        var20 = this.field1813[this.field1790[var15]];
                    } else {
                        var20 = this.field1814[this.field1790[var15]];
                    }
                    int var21 = (var20.field1998 * arg4 + var20.field2000 * arg2 + var20.field1996 * arg3) / (var20.field1999 * var7) + arg0;
                    var8.field1925[var15] = method2243(var19, var21);
                    class137 var22;
                    if (this.field1814 == null || this.field1814[this.field1787[var15]] == null) {
                        var22 = this.field1813[this.field1787[var15]];
                    } else {
                        var22 = this.field1814[this.field1787[var15]];
                    }
                    int var23 = (var22.field1998 * arg4 + var22.field2000 * arg2 + var22.field1996 * arg3) / (var22.field1999 * var7) + arg0;
                    var8.field1974[var15] = method2243(var19, var23);
                    class137 var24;
                    if (this.field1814 == null || this.field1814[this.field1788[var15]] == null) {
                        var24 = this.field1813[this.field1788[var15]];
                    } else {
                        var24 = this.field1814[this.field1788[var15]];
                    }
                    int var25 = (var24.field1998 * arg4 + var24.field2000 * arg2 + var24.field1996 * arg3) / (var24.field1999 * var7) + arg0;
                    var8.field1927[var15] = method2243(var19, var25);
                } else if (var16 == 1) {
                    class145 var26 = this.field1801[var15];
                    int var27 = (var26.field2125 * arg4 + var26.field2127 * arg2 + var26.field2126 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1925[var15] = method2243(this.field1793[var15] & 0xFFFF, var27);
                    var8.field1927[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1925[var15] = 128;
                    var8.field1927[var15] = -1;
                } else {
                    var8.field1927[var15] = -2;
                }
            } else if (var16 == 0) {
                class137 var28;
                if (this.field1814 == null || this.field1814[this.field1790[var15]] == null) {
                    var28 = this.field1813[this.field1790[var15]];
                } else {
                    var28 = this.field1814[this.field1790[var15]];
                }
                int var29 = (var28.field1998 * arg4 + var28.field2000 * arg2 + var28.field1996 * arg3) / (var28.field1999 * var7) + arg0;
                var8.field1925[var15] = method2286(var29);
                class137 var30;
                if (this.field1814 == null || this.field1814[this.field1787[var15]] == null) {
                    var30 = this.field1813[this.field1787[var15]];
                } else {
                    var30 = this.field1814[this.field1787[var15]];
                }
                int var31 = (var30.field1998 * arg4 + var30.field2000 * arg2 + var30.field1996 * arg3) / (var30.field1999 * var7) + arg0;
                var8.field1974[var15] = method2286(var31);
                class137 var32;
                if (this.field1814 == null || this.field1814[this.field1788[var15]] == null) {
                    var32 = this.field1813[this.field1788[var15]];
                } else {
                    var32 = this.field1814[this.field1788[var15]];
                }
                int var33 = (var32.field1998 * arg4 + var32.field2000 * arg2 + var32.field1996 * arg3) / (var32.field1999 * var7) + arg0;
                var8.field1927[var15] = method2286(var33);
            } else if (var16 == 1) {
                class145 var34 = this.field1801[var15];
                int var35 = (var34.field2125 * arg4 + var34.field2127 * arg2 + var34.field2126 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1925[var15] = method2286(var35);
                var8.field1927[var15] = -1;
            } else {
                var8.field1927[var15] = -2;
            }
        }
        this.method2228();
        var8.field1917 = this.field1783;
        var8.field1918 = this.field1782;
        var8.field1919 = this.field1809;
        var8.field1941 = this.field1784;
        var8.field1921 = this.field1785;
        var8.field1922 = this.field1790;
        var8.field1958 = this.field1787;
        var8.field1924 = this.field1788;
        var8.field1928 = this.field1789;
        var8.field1929 = this.field1791;
        var8.field1933 = this.field1795;
        var8.field1937 = this.field1810;
        var8.field1938 = this.field1811;
        var8.field1951 = this.field1794;
        return var8;
    }

    @ObfuscatedName("dn.ah(II)I")
    public static final int method2243(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("dn.ao(I)I")
    public static final int method2286(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
