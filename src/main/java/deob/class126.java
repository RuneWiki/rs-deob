package deob;

@ObfuscatedName("dl")
public class class126 extends class140 {

    @ObfuscatedName("dl.d")
    public int field1808 = 0;

    @ObfuscatedName("dl.k")
    public int[] field1785;

    @ObfuscatedName("dl.e")
    public int[] field1786;

    @ObfuscatedName("dl.p")
    public int[] field1815;

    @ObfuscatedName("dl.q")
    public int field1788 = 0;

    @ObfuscatedName("dl.s")
    public int[] field1789;

    @ObfuscatedName("dl.r")
    public int[] field1790;

    @ObfuscatedName("dl.g")
    public int[] field1791;

    @ObfuscatedName("dl.v")
    public byte[] field1825;

    @ObfuscatedName("dl.t")
    public byte[] field1793;

    @ObfuscatedName("dl.y")
    public byte[] field1827;

    @ObfuscatedName("dl.o")
    public byte[] field1795;

    @ObfuscatedName("dl.i")
    public short[] field1796;

    @ObfuscatedName("dl.u")
    public short[] field1797;

    @ObfuscatedName("dl.b")
    public byte field1818 = 0;

    @ObfuscatedName("dl.f")
    public int field1804;

    @ObfuscatedName("dl.j")
    public byte[] field1800;

    @ObfuscatedName("dl.x")
    public short[] field1801;

    @ObfuscatedName("dl.c")
    public short[] field1802;

    @ObfuscatedName("dl.h")
    public short[] field1803;

    @ObfuscatedName("dl.a")
    public short[] field1794;

    @ObfuscatedName("dl.z")
    public short[] field1807;

    @ObfuscatedName("dl.l")
    public short[] field1799;

    @ObfuscatedName("dl.w")
    public short[] field1823;

    @ObfuscatedName("dl.n")
    public short[] field1821;

    @ObfuscatedName("dl.m")
    public short[] field1809;

    @ObfuscatedName("dl.ae")
    public byte[] field1810;

    @ObfuscatedName("dl.ai")
    public int[] field1811;

    @ObfuscatedName("dl.ah")
    public int[] field1806;

    @ObfuscatedName("dl.ab")
    public int[][] field1813;

    @ObfuscatedName("dl.ad")
    public int[][] field1814;

    @ObfuscatedName("dl.ag")
    public class142[] field1792;

    @ObfuscatedName("dl.as")
    public class134[] field1787;

    @ObfuscatedName("dl.af")
    public class134[] field1817;

    @ObfuscatedName("dl.aq")
    public short field1824;

    @ObfuscatedName("dl.am")
    public short field1819;

    @ObfuscatedName("dl.az")
    public boolean field1820 = false;

    @ObfuscatedName("dl.av")
    public int field1798;

    @ObfuscatedName("dl.an")
    public int field1822;

    @ObfuscatedName("dl.ar")
    public int field1784;

    @ObfuscatedName("dl.aa")
    public int field1812;

    @ObfuscatedName("dl.aj")
    public int field1828;

    @ObfuscatedName("dl.ap")
    public static int[] field1826 = new int[10000];

    @ObfuscatedName("dl.ao")
    public static int[] field1805 = new int[10000];

    @ObfuscatedName("dl.at")
    public static int field1816 = 0;

    @ObfuscatedName("dl.aw")
    public static int[] field1829 = class135.field2016;

    @ObfuscatedName("dl.ax")
    public static int[] field1830 = class135.field2023;

    public class126() {
    }

    @ObfuscatedName("dl.d(Lit;II)Ldl;")
    public static class126 method2268(class236 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3875(arg1, arg2);
        return var3 == null ? null : new class126(var3);
    }

    public class126(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2270(arg0);
        } else {
            this.method2271(arg0);
        }
    }

    @ObfuscatedName("dl.k([B)V")
    public void method2270(byte[] arg0) {
        class174 var2 = new class174(arg0);
        class174 var3 = new class174(arg0);
        class174 var4 = new class174(arg0);
        class174 var5 = new class174(arg0);
        class174 var6 = new class174(arg0);
        class174 var7 = new class174(arg0);
        class174 var8 = new class174(arg0);
        var2.field2405 = arg0.length - 23;
        int var9 = var2.method3035();
        int var10 = var2.method3035();
        int var11 = var2.method2955();
        int var12 = var2.method2955();
        int var13 = var2.method2955();
        int var14 = var2.method2955();
        int var15 = var2.method2955();
        int var16 = var2.method2955();
        int var17 = var2.method2955();
        int var18 = var2.method3035();
        int var19 = var2.method3035();
        int var20 = var2.method3035();
        int var21 = var2.method3035();
        int var22 = var2.method3035();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1800 = new byte[var11];
            var2.field2405 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1800[var26] = var2.method2956();
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
        this.field1808 = var9;
        this.field1788 = var10;
        this.field1804 = var11;
        this.field1785 = new int[var9];
        this.field1786 = new int[var9];
        this.field1815 = new int[var9];
        this.field1789 = new int[var10];
        this.field1790 = new int[var10];
        this.field1791 = new int[var10];
        if (var17 == 1) {
            this.field1811 = new int[var9];
        }
        if (var12 == 1) {
            this.field1825 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1793 = new byte[var10];
        } else {
            this.field1818 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1827 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1806 = new int[var10];
        }
        if (var16 == 1) {
            this.field1797 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1795 = new byte[var10];
        }
        this.field1796 = new short[var10];
        if (var11 > 0) {
            this.field1801 = new short[var11];
            this.field1802 = new short[var11];
            this.field1803 = new short[var11];
            if (var24 > 0) {
                this.field1794 = new short[var24];
                this.field1807 = new short[var24];
                this.field1799 = new short[var24];
                this.field1823 = new short[var24];
                this.field1810 = new byte[var24];
                this.field1821 = new short[var24];
            }
            if (var25 > 0) {
                this.field1809 = new short[var25];
            }
        }
        var2.field2405 = var11;
        var3.field2405 = var44;
        var4.field2405 = var46;
        var5.field2405 = var48;
        var6.field2405 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2955();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method3085();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method3085();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method3085();
            }
            this.field1785[var67] = var64 + var69;
            this.field1786[var67] = var65 + var70;
            this.field1815[var67] = var66 + var71;
            var64 = this.field1785[var67];
            var65 = this.field1786[var67];
            var66 = this.field1815[var67];
            if (var17 == 1) {
                this.field1811[var67] = var6.method2955();
            }
        }
        var2.field2405 = var42;
        var3.field2405 = var31;
        var4.field2405 = var34;
        var5.field2405 = var37;
        var6.field2405 = var35;
        var7.field2405 = var40;
        var8.field2405 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1796[var72] = (short) var2.method3035();
            if (var12 == 1) {
                this.field1825[var72] = var3.method2956();
            }
            if (var13 == 255) {
                this.field1793[var72] = var4.method2956();
            }
            if (var14 == 1) {
                this.field1827[var72] = var5.method2956();
            }
            if (var15 == 1) {
                this.field1806[var72] = var6.method2955();
            }
            if (var16 == 1) {
                this.field1797[var72] = (short) (var7.method3035() - 1);
            }
            if (this.field1795 != null && this.field1797[var72] != -1) {
                this.field1795[var72] = (byte) (var8.method2955() - 1);
            }
        }
        var2.field2405 = var33;
        var3.field2405 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2955();
            if (var78 == 1) {
                var73 = var2.method3085() + var76;
                var74 = var2.method3085() + var73;
                var75 = var2.method3085() + var74;
                var76 = var75;
                this.field1789[var77] = var73;
                this.field1790[var77] = var74;
                this.field1791[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method3085() + var76;
                var76 = var75;
                this.field1789[var77] = var73;
                this.field1790[var77] = var74;
                this.field1791[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method3085() + var76;
                var76 = var75;
                this.field1789[var77] = var73;
                this.field1790[var77] = var74;
                this.field1791[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method3085() + var76;
                var76 = var75;
                this.field1789[var77] = var73;
                this.field1790[var77] = var81;
                this.field1791[var77] = var75;
            }
        }
        var2.field2405 = var50;
        var3.field2405 = var52;
        var4.field2405 = var54;
        var5.field2405 = var56;
        var6.field2405 = var58;
        var7.field2405 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1800[var82] & 0xFF;
            if (var83 == 0) {
                this.field1801[var82] = (short) var2.method3035();
                this.field1802[var82] = (short) var2.method3035();
                this.field1803[var82] = (short) var2.method3035();
            }
            if (var83 == 1) {
                this.field1801[var82] = (short) var3.method3035();
                this.field1802[var82] = (short) var3.method3035();
                this.field1803[var82] = (short) var3.method3035();
                this.field1794[var82] = (short) var4.method3035();
                this.field1807[var82] = (short) var4.method3035();
                this.field1799[var82] = (short) var4.method3035();
                this.field1823[var82] = (short) var5.method3035();
                this.field1810[var82] = var6.method2956();
                this.field1821[var82] = (short) var7.method3035();
            }
            if (var83 == 2) {
                this.field1801[var82] = (short) var3.method3035();
                this.field1802[var82] = (short) var3.method3035();
                this.field1803[var82] = (short) var3.method3035();
                this.field1794[var82] = (short) var4.method3035();
                this.field1807[var82] = (short) var4.method3035();
                this.field1799[var82] = (short) var4.method3035();
                this.field1823[var82] = (short) var5.method3035();
                this.field1810[var82] = var6.method2956();
                this.field1821[var82] = (short) var7.method3035();
                this.field1809[var82] = (short) var7.method3035();
            }
            if (var83 == 3) {
                this.field1801[var82] = (short) var3.method3035();
                this.field1802[var82] = (short) var3.method3035();
                this.field1803[var82] = (short) var3.method3035();
                this.field1794[var82] = (short) var4.method3035();
                this.field1807[var82] = (short) var4.method3035();
                this.field1799[var82] = (short) var4.method3035();
                this.field1823[var82] = (short) var5.method3035();
                this.field1810[var82] = var6.method2956();
                this.field1821[var82] = (short) var7.method3035();
            }
        }
        var2.field2405 = var62;
        int var84 = var2.method2955();
        if (var84 == 0) {
            return;
        }
        new class139();
        var2.method3035();
        var2.method3035();
        var2.method3035();
        var2.method2960();
    }

    @ObfuscatedName("dl.p([B)V")
    public void method2271(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class174 var4 = new class174(arg0);
        class174 var5 = new class174(arg0);
        class174 var6 = new class174(arg0);
        class174 var7 = new class174(arg0);
        class174 var8 = new class174(arg0);
        var4.field2405 = arg0.length - 18;
        int var9 = var4.method3035();
        int var10 = var4.method3035();
        int var11 = var4.method2955();
        int var12 = var4.method2955();
        int var13 = var4.method2955();
        int var14 = var4.method2955();
        int var15 = var4.method2955();
        int var16 = var4.method2955();
        int var17 = var4.method3035();
        int var18 = var4.method3035();
        int var19 = var4.method3035();
        int var20 = var4.method3035();
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
        this.field1808 = var9;
        this.field1788 = var10;
        this.field1804 = var11;
        this.field1785 = new int[var9];
        this.field1786 = new int[var9];
        this.field1815 = new int[var9];
        this.field1789 = new int[var10];
        this.field1790 = new int[var10];
        this.field1791 = new int[var10];
        if (var11 > 0) {
            this.field1800 = new byte[var11];
            this.field1801 = new short[var11];
            this.field1802 = new short[var11];
            this.field1803 = new short[var11];
        }
        if (var16 == 1) {
            this.field1811 = new int[var9];
        }
        if (var12 == 1) {
            this.field1825 = new byte[var10];
            this.field1795 = new byte[var10];
            this.field1797 = new short[var10];
        }
        if (var13 == 255) {
            this.field1793 = new byte[var10];
        } else {
            this.field1818 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1827 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1806 = new int[var10];
        }
        this.field1796 = new short[var10];
        var4.field2405 = var21;
        var5.field2405 = var36;
        var6.field2405 = var38;
        var7.field2405 = var40;
        var8.field2405 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2955();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method3085();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method3085();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method3085();
            }
            this.field1785[var46] = var43 + var48;
            this.field1786[var46] = var44 + var49;
            this.field1815[var46] = var45 + var50;
            var43 = this.field1785[var46];
            var44 = this.field1786[var46];
            var45 = this.field1815[var46];
            if (var16 == 1) {
                this.field1811[var46] = var8.method2955();
            }
        }
        var4.field2405 = var32;
        var5.field2405 = var28;
        var6.field2405 = var26;
        var7.field2405 = var30;
        var8.field2405 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1796[var51] = (short) var4.method3035();
            if (var12 == 1) {
                int var52 = var5.method2955();
                if ((var52 & 0x1) == 1) {
                    this.field1825[var51] = 1;
                    var2 = true;
                } else {
                    this.field1825[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1795[var51] = (byte) (var52 >> 2);
                    this.field1797[var51] = this.field1796[var51];
                    this.field1796[var51] = 127;
                    if (this.field1797[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1795[var51] = -1;
                    this.field1797[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1793[var51] = var6.method2956();
            }
            if (var14 == 1) {
                this.field1827[var51] = var7.method2956();
            }
            if (var15 == 1) {
                this.field1806[var51] = var8.method2955();
            }
        }
        var4.field2405 = var25;
        var5.field2405 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2955();
            if (var58 == 1) {
                var53 = var4.method3085() + var56;
                var54 = var4.method3085() + var53;
                var55 = var4.method3085() + var54;
                var56 = var55;
                this.field1789[var57] = var53;
                this.field1790[var57] = var54;
                this.field1791[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method3085() + var56;
                var56 = var55;
                this.field1789[var57] = var53;
                this.field1790[var57] = var54;
                this.field1791[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method3085() + var56;
                var56 = var55;
                this.field1789[var57] = var53;
                this.field1790[var57] = var54;
                this.field1791[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method3085() + var56;
                var56 = var55;
                this.field1789[var57] = var53;
                this.field1790[var57] = var61;
                this.field1791[var57] = var55;
            }
        }
        var4.field2405 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1800[var62] = 0;
            this.field1801[var62] = (short) var4.method3035();
            this.field1802[var62] = (short) var4.method3035();
            this.field1803[var62] = (short) var4.method3035();
        }
        if (this.field1795 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1795[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1801[var65] & 0xFFFF) == this.field1789[var64] && (this.field1802[var65] & 0xFFFF) == this.field1790[var64] && (this.field1803[var65] & 0xFFFF) == this.field1791[var64]) {
                        this.field1795[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1795 = null;
            }
        }
        if (!var3) {
            this.field1797 = null;
        }
        if (!var2) {
            this.field1825 = null;
        }
    }

    public class126(class126[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1808 = 0;
        this.field1788 = 0;
        this.field1804 = 0;
        this.field1818 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class126 var10 = arg0[var9];
            if (var10 != null) {
                this.field1808 += var10.field1808;
                this.field1788 += var10.field1788;
                this.field1804 += var10.field1804;
                if (var10.field1793 == null) {
                    if (this.field1818 == -1) {
                        this.field1818 = var10.field1818;
                    }
                    if (this.field1818 != var10.field1818) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1825 != null;
                var5 |= var10.field1827 != null;
                var6 |= var10.field1806 != null;
                var7 |= var10.field1797 != null;
                var8 |= var10.field1795 != null;
            }
        }
        this.field1785 = new int[this.field1808];
        this.field1786 = new int[this.field1808];
        this.field1815 = new int[this.field1808];
        this.field1811 = new int[this.field1808];
        this.field1789 = new int[this.field1788];
        this.field1790 = new int[this.field1788];
        this.field1791 = new int[this.field1788];
        if (var3) {
            this.field1825 = new byte[this.field1788];
        }
        if (var4) {
            this.field1793 = new byte[this.field1788];
        }
        if (var5) {
            this.field1827 = new byte[this.field1788];
        }
        if (var6) {
            this.field1806 = new int[this.field1788];
        }
        if (var7) {
            this.field1797 = new short[this.field1788];
        }
        if (var8) {
            this.field1795 = new byte[this.field1788];
        }
        this.field1796 = new short[this.field1788];
        if (this.field1804 > 0) {
            this.field1800 = new byte[this.field1804];
            this.field1801 = new short[this.field1804];
            this.field1802 = new short[this.field1804];
            this.field1803 = new short[this.field1804];
            this.field1794 = new short[this.field1804];
            this.field1807 = new short[this.field1804];
            this.field1799 = new short[this.field1804];
            this.field1823 = new short[this.field1804];
            this.field1810 = new byte[this.field1804];
            this.field1821 = new short[this.field1804];
            this.field1809 = new short[this.field1804];
        }
        this.field1808 = 0;
        this.field1788 = 0;
        this.field1804 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class126 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1788; var13++) {
                    if (var3 && var12.field1825 != null) {
                        this.field1825[this.field1788] = var12.field1825[var13];
                    }
                    if (var4) {
                        if (var12.field1793 == null) {
                            this.field1793[this.field1788] = var12.field1818;
                        } else {
                            this.field1793[this.field1788] = var12.field1793[var13];
                        }
                    }
                    if (var5 && var12.field1827 != null) {
                        this.field1827[this.field1788] = var12.field1827[var13];
                    }
                    if (var6 && var12.field1806 != null) {
                        this.field1806[this.field1788] = var12.field1806[var13];
                    }
                    if (var7) {
                        if (var12.field1797 == null) {
                            this.field1797[this.field1788] = -1;
                        } else {
                            this.field1797[this.field1788] = var12.field1797[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1795 == null || var12.field1795[var13] == -1) {
                            this.field1795[this.field1788] = -1;
                        } else {
                            this.field1795[this.field1788] = (byte) (var12.field1795[var13] + this.field1804);
                        }
                    }
                    this.field1796[this.field1788] = var12.field1796[var13];
                    this.field1789[this.field1788] = this.method2282(var12, var12.field1789[var13]);
                    this.field1790[this.field1788] = this.method2282(var12, var12.field1790[var13]);
                    this.field1791[this.field1788] = this.method2282(var12, var12.field1791[var13]);
                    this.field1788++;
                }
                for (int var14 = 0; var14 < var12.field1804; var14++) {
                    byte var15 = this.field1800[this.field1804] = var12.field1800[var14];
                    if (var15 == 0) {
                        this.field1801[this.field1804] = (short) this.method2282(var12, var12.field1801[var14]);
                        this.field1802[this.field1804] = (short) this.method2282(var12, var12.field1802[var14]);
                        this.field1803[this.field1804] = (short) this.method2282(var12, var12.field1803[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1801[this.field1804] = var12.field1801[var14];
                        this.field1802[this.field1804] = var12.field1802[var14];
                        this.field1803[this.field1804] = var12.field1803[var14];
                        this.field1794[this.field1804] = var12.field1794[var14];
                        this.field1807[this.field1804] = var12.field1807[var14];
                        this.field1799[this.field1804] = var12.field1799[var14];
                        this.field1823[this.field1804] = var12.field1823[var14];
                        this.field1810[this.field1804] = var12.field1810[var14];
                        this.field1821[this.field1804] = var12.field1821[var14];
                    }
                    if (var15 == 2) {
                        this.field1809[this.field1804] = var12.field1809[var14];
                    }
                    this.field1804++;
                }
            }
        }
    }

    @ObfuscatedName("dl.q(Ldl;I)I")
    public final int method2282(class126 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1785[arg1];
        int var5 = arg0.field1786[arg1];
        int var6 = arg0.field1815[arg1];
        for (int var7 = 0; var7 < this.field1808; var7++) {
            if (this.field1785[var7] == var4 && this.field1786[var7] == var5 && this.field1815[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1785[this.field1808] = var4;
            this.field1786[this.field1808] = var5;
            this.field1815[this.field1808] = var6;
            if (arg0.field1811 != null) {
                this.field1811[this.field1808] = arg0.field1811[arg1];
            }
            var3 = this.field1808++;
        }
        return var3;
    }

    public class126(class126 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1808 = arg0.field1808;
        this.field1788 = arg0.field1788;
        this.field1804 = arg0.field1804;
        if (arg1) {
            this.field1785 = arg0.field1785;
            this.field1786 = arg0.field1786;
            this.field1815 = arg0.field1815;
        } else {
            this.field1785 = new int[this.field1808];
            this.field1786 = new int[this.field1808];
            this.field1815 = new int[this.field1808];
            for (int var6 = 0; var6 < this.field1808; var6++) {
                this.field1785[var6] = arg0.field1785[var6];
                this.field1786[var6] = arg0.field1786[var6];
                this.field1815[var6] = arg0.field1815[var6];
            }
        }
        if (arg2) {
            this.field1796 = arg0.field1796;
        } else {
            this.field1796 = new short[this.field1788];
            for (int var7 = 0; var7 < this.field1788; var7++) {
                this.field1796[var7] = arg0.field1796[var7];
            }
        }
        if (arg3 || arg0.field1797 == null) {
            this.field1797 = arg0.field1797;
        } else {
            this.field1797 = new short[this.field1788];
            for (int var8 = 0; var8 < this.field1788; var8++) {
                this.field1797[var8] = arg0.field1797[var8];
            }
        }
        if (arg4) {
            this.field1827 = arg0.field1827;
        } else {
            this.field1827 = new byte[this.field1788];
            if (arg0.field1827 == null) {
                for (int var9 = 0; var9 < this.field1788; var9++) {
                    this.field1827[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1788; var10++) {
                    this.field1827[var10] = arg0.field1827[var10];
                }
            }
        }
        this.field1789 = arg0.field1789;
        this.field1790 = arg0.field1790;
        this.field1791 = arg0.field1791;
        this.field1825 = arg0.field1825;
        this.field1793 = arg0.field1793;
        this.field1795 = arg0.field1795;
        this.field1818 = arg0.field1818;
        this.field1800 = arg0.field1800;
        this.field1801 = arg0.field1801;
        this.field1802 = arg0.field1802;
        this.field1803 = arg0.field1803;
        this.field1794 = arg0.field1794;
        this.field1807 = arg0.field1807;
        this.field1799 = arg0.field1799;
        this.field1823 = arg0.field1823;
        this.field1810 = arg0.field1810;
        this.field1821 = arg0.field1821;
        this.field1809 = arg0.field1809;
        this.field1811 = arg0.field1811;
        this.field1806 = arg0.field1806;
        this.field1813 = arg0.field1813;
        this.field1814 = arg0.field1814;
        this.field1787 = arg0.field1787;
        this.field1792 = arg0.field1792;
        this.field1817 = arg0.field1817;
        this.field1824 = arg0.field1824;
        this.field1819 = arg0.field1819;
    }

    @ObfuscatedName("dl.s()Ldl;")
    public class126 method2275() {
        class126 var1 = new class126();
        if (this.field1825 != null) {
            var1.field1825 = new byte[this.field1788];
            for (int var2 = 0; var2 < this.field1788; var2++) {
                var1.field1825[var2] = this.field1825[var2];
            }
        }
        var1.field1808 = this.field1808;
        var1.field1788 = this.field1788;
        var1.field1804 = this.field1804;
        var1.field1785 = this.field1785;
        var1.field1786 = this.field1786;
        var1.field1815 = this.field1815;
        var1.field1789 = this.field1789;
        var1.field1790 = this.field1790;
        var1.field1791 = this.field1791;
        var1.field1793 = this.field1793;
        var1.field1827 = this.field1827;
        var1.field1795 = this.field1795;
        var1.field1796 = this.field1796;
        var1.field1797 = this.field1797;
        var1.field1818 = this.field1818;
        var1.field1800 = this.field1800;
        var1.field1801 = this.field1801;
        var1.field1802 = this.field1802;
        var1.field1803 = this.field1803;
        var1.field1794 = this.field1794;
        var1.field1807 = this.field1807;
        var1.field1799 = this.field1799;
        var1.field1823 = this.field1823;
        var1.field1810 = this.field1810;
        var1.field1821 = this.field1821;
        var1.field1809 = this.field1809;
        var1.field1811 = this.field1811;
        var1.field1806 = this.field1806;
        var1.field1813 = this.field1813;
        var1.field1814 = this.field1814;
        var1.field1787 = this.field1787;
        var1.field1792 = this.field1792;
        var1.field1824 = this.field1824;
        var1.field1819 = this.field1819;
        return var1;
    }

    @ObfuscatedName("dl.r([[IIIIZI)Ldl;")
    public class126 method2276(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2312();
        int var7 = this.field1822 + arg1;
        int var8 = this.field1784 + arg1;
        int var9 = this.field1828 + arg3;
        int var10 = this.field1812 + arg3;
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
        class126 var15;
        if (arg4) {
            var15 = new class126();
            var15.field1808 = this.field1808;
            var15.field1788 = this.field1788;
            var15.field1804 = this.field1804;
            var15.field1785 = this.field1785;
            var15.field1815 = this.field1815;
            var15.field1789 = this.field1789;
            var15.field1790 = this.field1790;
            var15.field1791 = this.field1791;
            var15.field1825 = this.field1825;
            var15.field1793 = this.field1793;
            var15.field1827 = this.field1827;
            var15.field1795 = this.field1795;
            var15.field1796 = this.field1796;
            var15.field1797 = this.field1797;
            var15.field1818 = this.field1818;
            var15.field1800 = this.field1800;
            var15.field1801 = this.field1801;
            var15.field1802 = this.field1802;
            var15.field1803 = this.field1803;
            var15.field1794 = this.field1794;
            var15.field1807 = this.field1807;
            var15.field1799 = this.field1799;
            var15.field1823 = this.field1823;
            var15.field1810 = this.field1810;
            var15.field1821 = this.field1821;
            var15.field1809 = this.field1809;
            var15.field1811 = this.field1811;
            var15.field1806 = this.field1806;
            var15.field1813 = this.field1813;
            var15.field1814 = this.field1814;
            var15.field1824 = this.field1824;
            var15.field1819 = this.field1819;
            var15.field1786 = new int[var15.field1808];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1808; var16++) {
                int var17 = this.field1785[var16] + arg1;
                int var18 = this.field1815[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1786[var16] = this.field1786[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1808; var26++) {
                int var27 = (-this.field1786[var26] << 16) / this.field2115;
                if (var27 < arg5) {
                    int var28 = this.field1785[var26] + arg1;
                    int var29 = this.field1815[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1786[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1786[var26];
                }
            }
        }
        var15.method2344();
        return var15;
    }

    @ObfuscatedName("dl.g()V")
    public void method2278() {
        int var10002;
        if (this.field1811 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1808; var3++) {
                int var4 = this.field1811[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1813 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1813[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1808) {
                int var7 = this.field1811[var6];
                this.field1813[var7][var1[var7]++] = var6++;
            }
            this.field1811 = null;
        }
        if (this.field1806 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1788; var10++) {
            int var11 = this.field1806[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1814 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1814[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1788) {
            int var14 = this.field1806[var13];
            this.field1814[var14][var8[var14]++] = var13++;
        }
        this.field1806 = null;
    }

    @ObfuscatedName("dl.v()V")
    public void method2277() {
        for (int var1 = 0; var1 < this.field1808; var1++) {
            int var2 = this.field1785[var1];
            this.field1785[var1] = this.field1815[var1];
            this.field1815[var1] = -var2;
        }
        this.method2344();
    }

    @ObfuscatedName("dl.t()V")
    public void method2309() {
        for (int var1 = 0; var1 < this.field1808; var1++) {
            this.field1785[var1] = -this.field1785[var1];
            this.field1815[var1] = -this.field1815[var1];
        }
        this.method2344();
    }

    @ObfuscatedName("dl.y()V")
    public void method2313() {
        for (int var1 = 0; var1 < this.field1808; var1++) {
            int var2 = this.field1815[var1];
            this.field1815[var1] = this.field1785[var1];
            this.field1785[var1] = -var2;
        }
        this.method2344();
    }

    @ObfuscatedName("dl.x(I)V")
    public void method2280(int arg0) {
        int var2 = field1829[arg0];
        int var3 = field1830[arg0];
        for (int var4 = 0; var4 < this.field1808; var4++) {
            int var5 = this.field1815[var4] * var2 + this.field1785[var4] * var3 >> 16;
            this.field1815[var4] = this.field1815[var4] * var3 - this.field1785[var4] * var2 >> 16;
            this.field1785[var4] = var5;
        }
        this.method2344();
    }

    @ObfuscatedName("dl.c(III)V")
    public void method2281(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1808; var4++) {
            this.field1785[var4] += arg0;
            this.field1786[var4] += arg1;
            this.field1815[var4] += arg2;
        }
        this.method2344();
    }

    @ObfuscatedName("dl.h(SS)V")
    public void method2284(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1788; var3++) {
            if (this.field1796[var3] == arg0) {
                this.field1796[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dl.a(SS)V")
    public void method2283(short arg0, short arg1) {
        if (this.field1797 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1788; var3++) {
            if (this.field1797[var3] == arg0) {
                this.field1797[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dl.w()V")
    public void method2317() {
        for (int var1 = 0; var1 < this.field1808; var1++) {
            this.field1815[var1] = -this.field1815[var1];
        }
        for (int var2 = 0; var2 < this.field1788; var2++) {
            int var3 = this.field1789[var2];
            this.field1789[var2] = this.field1791[var2];
            this.field1791[var2] = var3;
        }
        this.method2344();
    }

    @ObfuscatedName("dl.n(III)V")
    public void method2285(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1808; var4++) {
            this.field1785[var4] = this.field1785[var4] * arg0 / 128;
            this.field1786[var4] = this.field1786[var4] * arg1 / 128;
            this.field1815[var4] = this.field1815[var4] * arg2 / 128;
        }
        this.method2344();
    }

    @ObfuscatedName("dl.m()V")
    public void method2286() {
        if (this.field1787 != null) {
            return;
        }
        this.field1787 = new class134[this.field1808];
        for (int var1 = 0; var1 < this.field1808; var1++) {
            this.field1787[var1] = new class134();
        }
        for (int var2 = 0; var2 < this.field1788; var2++) {
            int var3 = this.field1789[var2];
            int var4 = this.field1790[var2];
            int var5 = this.field1791[var2];
            int var6 = this.field1785[var4] - this.field1785[var3];
            int var7 = this.field1786[var4] - this.field1786[var3];
            int var8 = this.field1815[var4] - this.field1815[var3];
            int var9 = this.field1785[var5] - this.field1785[var3];
            int var10 = this.field1786[var5] - this.field1786[var3];
            int var11 = this.field1815[var5] - this.field1815[var3];
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
            if (this.field1825 == null) {
                var19 = 0;
            } else {
                var19 = this.field1825[var2];
            }
            if (var19 == 0) {
                class134 var20 = this.field1787[var3];
                var20.field1994 += var16;
                var20.field1993 += var17;
                var20.field1996 += var18;
                var20.field1995++;
                class134 var21 = this.field1787[var4];
                var21.field1994 += var16;
                var21.field1993 += var17;
                var21.field1996 += var18;
                var21.field1995++;
                class134 var22 = this.field1787[var5];
                var22.field1994 += var16;
                var22.field1993 += var17;
                var22.field1996 += var18;
                var22.field1995++;
            } else if (var19 == 1) {
                if (this.field1792 == null) {
                    this.field1792 = new class142[this.field1788];
                }
                class142 var23 = this.field1792[var2] = new class142();
                var23.field2131 = var16;
                var23.field2129 = var17;
                var23.field2135 = var18;
            }
        }
    }

    @ObfuscatedName("dl.ae()V")
    public void method2344() {
        this.field1787 = null;
        this.field1817 = null;
        this.field1792 = null;
        this.field1820 = false;
    }

    @ObfuscatedName("dl.ai()V")
    public void method2312() {
        if (this.field1820) {
            return;
        }
        this.field2115 = 0;
        this.field1798 = 0;
        this.field1822 = 999999;
        this.field1784 = -999999;
        this.field1812 = -99999;
        this.field1828 = 99999;
        for (int var1 = 0; var1 < this.field1808; var1++) {
            int var2 = this.field1785[var1];
            int var3 = this.field1786[var1];
            int var4 = this.field1815[var1];
            if (var2 < this.field1822) {
                this.field1822 = var2;
            }
            if (var2 > this.field1784) {
                this.field1784 = var2;
            }
            if (var4 < this.field1828) {
                this.field1828 = var4;
            }
            if (var4 > this.field1812) {
                this.field1812 = var4;
            }
            if (-var3 > this.field2115) {
                this.field2115 = -var3;
            }
            if (var3 > this.field1798) {
                this.field1798 = var3;
            }
        }
        this.field1820 = true;
    }

    @ObfuscatedName("dl.ah(Ldl;Ldl;IIIZ)V")
    public static void method2289(class126 arg0, class126 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2312();
        arg0.method2286();
        arg1.method2312();
        arg1.method2286();
        field1816++;
        int var6 = 0;
        int[] var7 = arg1.field1785;
        int var8 = arg1.field1808;
        for (int var9 = 0; var9 < arg0.field1808; var9++) {
            class134 var10 = arg0.field1787[var9];
            if (var10.field1995 != 0) {
                int var11 = arg0.field1786[var9] - arg3;
                if (var11 <= arg1.field1798) {
                    int var12 = arg0.field1785[var9] - arg2;
                    if (var12 >= arg1.field1822 && var12 <= arg1.field1784) {
                        int var13 = arg0.field1815[var9] - arg4;
                        if (var13 >= arg1.field1828 && var13 <= arg1.field1812) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class134 var15 = arg1.field1787[var14];
                                if (var7[var14] == var12 && arg1.field1815[var14] == var13 && arg1.field1786[var14] == var11 && var15.field1995 != 0) {
                                    if (arg0.field1817 == null) {
                                        arg0.field1817 = new class134[arg0.field1808];
                                    }
                                    if (arg1.field1817 == null) {
                                        arg1.field1817 = new class134[var8];
                                    }
                                    class134 var16 = arg0.field1817[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1817[var9] = new class134(var10);
                                    }
                                    class134 var17 = arg1.field1817[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1817[var14] = new class134(var15);
                                    }
                                    var16.field1994 += var15.field1994;
                                    var16.field1993 += var15.field1993;
                                    var16.field1996 += var15.field1996;
                                    var16.field1995 += var15.field1995;
                                    var17.field1994 += var10.field1994;
                                    var17.field1993 += var10.field1993;
                                    var17.field1996 += var10.field1996;
                                    var17.field1995 += var10.field1995;
                                    var6++;
                                    field1826[var9] = field1816;
                                    field1805[var14] = field1816;
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
        for (int var18 = 0; var18 < arg0.field1788; var18++) {
            if (field1826[arg0.field1789[var18]] == field1816 && field1826[arg0.field1790[var18]] == field1816 && field1826[arg0.field1791[var18]] == field1816) {
                if (arg0.field1825 == null) {
                    arg0.field1825 = new byte[arg0.field1788];
                }
                arg0.field1825[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1788; var19++) {
            if (field1805[arg1.field1789[var19]] == field1816 && field1805[arg1.field1790[var19]] == field1816 && field1805[arg1.field1791[var19]] == field1816) {
                if (arg1.field1825 == null) {
                    arg1.field1825 = new byte[arg1.field1788];
                }
                arg1.field1825[var19] = 2;
            }
        }
    }

    @ObfuscatedName("dl.ab(IIIII)Leb;")
    public final class132 method2290(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2286();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class132 var8 = new class132();
        var8.field1979 = new int[this.field1788];
        var8.field1927 = new int[this.field1788];
        var8.field1936 = new int[this.field1788];
        if (this.field1804 > 0 && this.field1795 != null) {
            int[] var9 = new int[this.field1804];
            for (int var10 = 0; var10 < this.field1788; var10++) {
                if (this.field1795[var10] != -1) {
                    var9[this.field1795[var10] & 0xFF]++;
                }
            }
            var8.field1942 = 0;
            for (int var11 = 0; var11 < this.field1804; var11++) {
                if (var9[var11] > 0 && this.field1800[var11] == 0) {
                    var8.field1942++;
                }
            }
            var8.field1934 = new int[var8.field1942];
            var8.field1935 = new int[var8.field1942];
            var8.field1929 = new int[var8.field1942];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1804; var13++) {
                if (var9[var13] > 0 && this.field1800[var13] == 0) {
                    var8.field1934[var12] = this.field1801[var13] & 0xFFFF;
                    var8.field1935[var12] = this.field1802[var13] & 0xFFFF;
                    var8.field1929[var12] = this.field1803[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1930 = new byte[this.field1788];
            for (int var14 = 0; var14 < this.field1788; var14++) {
                if (this.field1795[var14] == -1) {
                    var8.field1930[var14] = -1;
                } else {
                    var8.field1930[var14] = (byte) var9[this.field1795[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1788; var15++) {
            byte var16;
            if (this.field1825 == null) {
                var16 = 0;
            } else {
                var16 = this.field1825[var15];
            }
            byte var17;
            if (this.field1827 == null) {
                var17 = 0;
            } else {
                var17 = this.field1827[var15];
            }
            short var18;
            if (this.field1797 == null) {
                var18 = -1;
            } else {
                var18 = this.field1797[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1796[var15] & 0xFFFF;
                    class134 var20;
                    if (this.field1817 == null || this.field1817[this.field1789[var15]] == null) {
                        var20 = this.field1787[this.field1789[var15]];
                    } else {
                        var20 = this.field1817[this.field1789[var15]];
                    }
                    int var21 = (var20.field1996 * arg4 + var20.field1994 * arg2 + var20.field1993 * arg3) / (var20.field1995 * var7) + arg0;
                    var8.field1979[var15] = method2291(var19, var21);
                    class134 var22;
                    if (this.field1817 == null || this.field1817[this.field1790[var15]] == null) {
                        var22 = this.field1787[this.field1790[var15]];
                    } else {
                        var22 = this.field1817[this.field1790[var15]];
                    }
                    int var23 = (var22.field1996 * arg4 + var22.field1994 * arg2 + var22.field1993 * arg3) / (var22.field1995 * var7) + arg0;
                    var8.field1927[var15] = method2291(var19, var23);
                    class134 var24;
                    if (this.field1817 == null || this.field1817[this.field1791[var15]] == null) {
                        var24 = this.field1787[this.field1791[var15]];
                    } else {
                        var24 = this.field1817[this.field1791[var15]];
                    }
                    int var25 = (var24.field1996 * arg4 + var24.field1994 * arg2 + var24.field1993 * arg3) / (var24.field1995 * var7) + arg0;
                    var8.field1936[var15] = method2291(var19, var25);
                } else if (var16 == 1) {
                    class142 var26 = this.field1792[var15];
                    int var27 = (var26.field2135 * arg4 + var26.field2131 * arg2 + var26.field2129 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1979[var15] = method2291(this.field1796[var15] & 0xFFFF, var27);
                    var8.field1936[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1979[var15] = 128;
                    var8.field1936[var15] = -1;
                } else {
                    var8.field1936[var15] = -2;
                }
            } else if (var16 == 0) {
                class134 var28;
                if (this.field1817 == null || this.field1817[this.field1789[var15]] == null) {
                    var28 = this.field1787[this.field1789[var15]];
                } else {
                    var28 = this.field1817[this.field1789[var15]];
                }
                int var29 = (var28.field1996 * arg4 + var28.field1994 * arg2 + var28.field1993 * arg3) / (var28.field1995 * var7) + arg0;
                var8.field1979[var15] = method2340(var29);
                class134 var30;
                if (this.field1817 == null || this.field1817[this.field1790[var15]] == null) {
                    var30 = this.field1787[this.field1790[var15]];
                } else {
                    var30 = this.field1817[this.field1790[var15]];
                }
                int var31 = (var30.field1996 * arg4 + var30.field1994 * arg2 + var30.field1993 * arg3) / (var30.field1995 * var7) + arg0;
                var8.field1927[var15] = method2340(var31);
                class134 var32;
                if (this.field1817 == null || this.field1817[this.field1791[var15]] == null) {
                    var32 = this.field1787[this.field1791[var15]];
                } else {
                    var32 = this.field1817[this.field1791[var15]];
                }
                int var33 = (var32.field1996 * arg4 + var32.field1994 * arg2 + var32.field1993 * arg3) / (var32.field1995 * var7) + arg0;
                var8.field1936[var15] = method2340(var33);
            } else if (var16 == 1) {
                class142 var34 = this.field1792[var15];
                int var35 = (var34.field2135 * arg4 + var34.field2131 * arg2 + var34.field2129 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1979[var15] = method2340(var35);
                var8.field1936[var15] = -1;
            } else {
                var8.field1936[var15] = -2;
            }
        }
        this.method2278();
        var8.field1950 = this.field1808;
        var8.field1918 = this.field1785;
        var8.field1926 = this.field1786;
        var8.field1920 = this.field1815;
        var8.field1962 = this.field1788;
        var8.field1922 = this.field1789;
        var8.field1923 = this.field1790;
        var8.field1924 = this.field1791;
        var8.field1951 = this.field1793;
        var8.field1965 = this.field1827;
        var8.field1932 = this.field1818;
        var8.field1937 = this.field1813;
        var8.field1938 = this.field1814;
        var8.field1976 = this.field1797;
        return var8;
    }

    @ObfuscatedName("dl.ad(II)I")
    public static final int method2291(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("dl.ag(I)I")
    public static final int method2340(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
