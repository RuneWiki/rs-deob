package deob;

@ObfuscatedName("df")
public class class128 extends class142 {

    @ObfuscatedName("df.i")
    public int field1819 = 0;

    @ObfuscatedName("df.h")
    public int[] field1778;

    @ObfuscatedName("df.u")
    public int[] field1779;

    @ObfuscatedName("df.q")
    public int[] field1780;

    @ObfuscatedName("df.g")
    public int field1810 = 0;

    @ObfuscatedName("df.v")
    public int[] field1782;

    @ObfuscatedName("df.t")
    public int[] field1798;

    @ObfuscatedName("df.p")
    public int[] field1784;

    @ObfuscatedName("df.l")
    public byte[] field1785;

    @ObfuscatedName("df.a")
    public byte[] field1786;

    @ObfuscatedName("df.k")
    public byte[] field1787;

    @ObfuscatedName("df.r")
    public byte[] field1793;

    @ObfuscatedName("df.b")
    public short[] field1789;

    @ObfuscatedName("df.x")
    public short[] field1812;

    @ObfuscatedName("df.o")
    public byte field1801 = 0;

    @ObfuscatedName("df.j")
    public int field1792;

    @ObfuscatedName("df.m")
    public byte[] field1803;

    @ObfuscatedName("df.d")
    public short[] field1788;

    @ObfuscatedName("df.e")
    public short[] field1807;

    @ObfuscatedName("df.s")
    public short[] field1796;

    @ObfuscatedName("df.n")
    public short[] field1797;

    @ObfuscatedName("df.y")
    public short[] field1808;

    @ObfuscatedName("df.w")
    public short[] field1805;

    @ObfuscatedName("df.f")
    public short[] field1800;

    @ObfuscatedName("df.c")
    public short[] field1821;

    @ObfuscatedName("df.z")
    public short[] field1802;

    @ObfuscatedName("df.ay")
    public byte[] field1790;

    @ObfuscatedName("df.ah")
    public int[] field1804;

    @ObfuscatedName("df.az")
    public int[] field1781;

    @ObfuscatedName("df.ac")
    public int[][] field1806;

    @ObfuscatedName("df.aq")
    public int[][] field1791;

    @ObfuscatedName("df.af")
    public class144[] field1777;

    @ObfuscatedName("df.aj")
    public class136[] field1809;

    @ObfuscatedName("df.ax")
    public class136[] field1795;

    @ObfuscatedName("df.ad")
    public short field1811;

    @ObfuscatedName("df.av")
    public short field1783;

    @ObfuscatedName("df.ae")
    public boolean field1813 = false;

    @ObfuscatedName("df.ar")
    public int field1814;

    @ObfuscatedName("df.ag")
    public int field1815;

    @ObfuscatedName("df.at")
    public int field1816;

    @ObfuscatedName("df.ai")
    public int field1817;

    @ObfuscatedName("df.ao")
    public int field1818;

    @ObfuscatedName("df.am")
    public static int[] field1794 = new int[10000];

    @ObfuscatedName("df.ap")
    public static int[] field1820 = new int[10000];

    @ObfuscatedName("df.as")
    public static int field1799 = 0;

    @ObfuscatedName("df.aw")
    public static int[] field1822 = class137.field2021;

    @ObfuscatedName("df.al")
    public static int[] field1823 = class137.field2022;

    public class128() {
    }

    @ObfuscatedName("df.i(Liy;II)Ldf;")
    public static class128 method2227(class236 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3836(arg1, arg2);
        return var3 == null ? null : new class128(var3);
    }

    public class128(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2228(arg0);
        } else {
            this.method2229(arg0);
        }
    }

    @ObfuscatedName("df.h([B)V")
    public void method2228(byte[] arg0) {
        class174 var2 = new class174(arg0);
        class174 var3 = new class174(arg0);
        class174 var4 = new class174(arg0);
        class174 var5 = new class174(arg0);
        class174 var6 = new class174(arg0);
        class174 var7 = new class174(arg0);
        class174 var8 = new class174(arg0);
        var2.field2384 = arg0.length - 23;
        int var9 = var2.method2932();
        int var10 = var2.method2932();
        int var11 = var2.method2930();
        int var12 = var2.method2930();
        int var13 = var2.method2930();
        int var14 = var2.method2930();
        int var15 = var2.method2930();
        int var16 = var2.method2930();
        int var17 = var2.method2930();
        int var18 = var2.method2932();
        int var19 = var2.method2932();
        int var20 = var2.method2932();
        int var21 = var2.method2932();
        int var22 = var2.method2932();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1803 = new byte[var11];
            var2.field2384 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1803[var26] = var2.method2931();
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
        this.field1819 = var9;
        this.field1810 = var10;
        this.field1792 = var11;
        this.field1778 = new int[var9];
        this.field1779 = new int[var9];
        this.field1780 = new int[var9];
        this.field1782 = new int[var10];
        this.field1798 = new int[var10];
        this.field1784 = new int[var10];
        if (var17 == 1) {
            this.field1804 = new int[var9];
        }
        if (var12 == 1) {
            this.field1785 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1786 = new byte[var10];
        } else {
            this.field1801 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1787 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1781 = new int[var10];
        }
        if (var16 == 1) {
            this.field1812 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1793 = new byte[var10];
        }
        this.field1789 = new short[var10];
        if (var11 > 0) {
            this.field1788 = new short[var11];
            this.field1807 = new short[var11];
            this.field1796 = new short[var11];
            if (var24 > 0) {
                this.field1797 = new short[var24];
                this.field1808 = new short[var24];
                this.field1805 = new short[var24];
                this.field1800 = new short[var24];
                this.field1790 = new byte[var24];
                this.field1821 = new short[var24];
            }
            if (var25 > 0) {
                this.field1802 = new short[var25];
            }
        }
        var2.field2384 = var11;
        var3.field2384 = var44;
        var4.field2384 = var46;
        var5.field2384 = var48;
        var6.field2384 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2930();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2942();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2942();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2942();
            }
            this.field1778[var67] = var64 + var69;
            this.field1779[var67] = var65 + var70;
            this.field1780[var67] = var66 + var71;
            var64 = this.field1778[var67];
            var65 = this.field1779[var67];
            var66 = this.field1780[var67];
            if (var17 == 1) {
                this.field1804[var67] = var6.method2930();
            }
        }
        var2.field2384 = var42;
        var3.field2384 = var31;
        var4.field2384 = var34;
        var5.field2384 = var37;
        var6.field2384 = var35;
        var7.field2384 = var40;
        var8.field2384 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1789[var72] = (short) var2.method2932();
            if (var12 == 1) {
                this.field1785[var72] = var3.method2931();
            }
            if (var13 == 255) {
                this.field1786[var72] = var4.method2931();
            }
            if (var14 == 1) {
                this.field1787[var72] = var5.method2931();
            }
            if (var15 == 1) {
                this.field1781[var72] = var6.method2930();
            }
            if (var16 == 1) {
                this.field1812[var72] = (short) (var7.method2932() - 1);
            }
            if (this.field1793 != null && this.field1812[var72] != -1) {
                this.field1793[var72] = (byte) (var8.method2930() - 1);
            }
        }
        var2.field2384 = var33;
        var3.field2384 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2930();
            if (var78 == 1) {
                var73 = var2.method2942() + var76;
                var74 = var2.method2942() + var73;
                var75 = var2.method2942() + var74;
                var76 = var75;
                this.field1782[var77] = var73;
                this.field1798[var77] = var74;
                this.field1784[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2942() + var76;
                var76 = var75;
                this.field1782[var77] = var73;
                this.field1798[var77] = var74;
                this.field1784[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2942() + var76;
                var76 = var75;
                this.field1782[var77] = var73;
                this.field1798[var77] = var74;
                this.field1784[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2942() + var76;
                var76 = var75;
                this.field1782[var77] = var73;
                this.field1798[var77] = var81;
                this.field1784[var77] = var75;
            }
        }
        var2.field2384 = var50;
        var3.field2384 = var52;
        var4.field2384 = var54;
        var5.field2384 = var56;
        var6.field2384 = var58;
        var7.field2384 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1803[var82] & 0xFF;
            if (var83 == 0) {
                this.field1788[var82] = (short) var2.method2932();
                this.field1807[var82] = (short) var2.method2932();
                this.field1796[var82] = (short) var2.method2932();
            }
            if (var83 == 1) {
                this.field1788[var82] = (short) var3.method2932();
                this.field1807[var82] = (short) var3.method2932();
                this.field1796[var82] = (short) var3.method2932();
                this.field1797[var82] = (short) var4.method2932();
                this.field1808[var82] = (short) var4.method2932();
                this.field1805[var82] = (short) var4.method2932();
                this.field1800[var82] = (short) var5.method2932();
                this.field1790[var82] = var6.method2931();
                this.field1821[var82] = (short) var7.method2932();
            }
            if (var83 == 2) {
                this.field1788[var82] = (short) var3.method2932();
                this.field1807[var82] = (short) var3.method2932();
                this.field1796[var82] = (short) var3.method2932();
                this.field1797[var82] = (short) var4.method2932();
                this.field1808[var82] = (short) var4.method2932();
                this.field1805[var82] = (short) var4.method2932();
                this.field1800[var82] = (short) var5.method2932();
                this.field1790[var82] = var6.method2931();
                this.field1821[var82] = (short) var7.method2932();
                this.field1802[var82] = (short) var7.method2932();
            }
            if (var83 == 3) {
                this.field1788[var82] = (short) var3.method2932();
                this.field1807[var82] = (short) var3.method2932();
                this.field1796[var82] = (short) var3.method2932();
                this.field1797[var82] = (short) var4.method2932();
                this.field1808[var82] = (short) var4.method2932();
                this.field1805[var82] = (short) var4.method2932();
                this.field1800[var82] = (short) var5.method2932();
                this.field1790[var82] = var6.method2931();
                this.field1821[var82] = (short) var7.method2932();
            }
        }
        var2.field2384 = var62;
        int var84 = var2.method2930();
        if (var84 == 0) {
            return;
        }
        new class141();
        var2.method2932();
        var2.method2932();
        var2.method2932();
        var2.method2927();
    }

    @ObfuscatedName("df.q([B)V")
    public void method2229(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class174 var4 = new class174(arg0);
        class174 var5 = new class174(arg0);
        class174 var6 = new class174(arg0);
        class174 var7 = new class174(arg0);
        class174 var8 = new class174(arg0);
        var4.field2384 = arg0.length - 18;
        int var9 = var4.method2932();
        int var10 = var4.method2932();
        int var11 = var4.method2930();
        int var12 = var4.method2930();
        int var13 = var4.method2930();
        int var14 = var4.method2930();
        int var15 = var4.method2930();
        int var16 = var4.method2930();
        int var17 = var4.method2932();
        int var18 = var4.method2932();
        int var19 = var4.method2932();
        int var20 = var4.method2932();
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
        this.field1819 = var9;
        this.field1810 = var10;
        this.field1792 = var11;
        this.field1778 = new int[var9];
        this.field1779 = new int[var9];
        this.field1780 = new int[var9];
        this.field1782 = new int[var10];
        this.field1798 = new int[var10];
        this.field1784 = new int[var10];
        if (var11 > 0) {
            this.field1803 = new byte[var11];
            this.field1788 = new short[var11];
            this.field1807 = new short[var11];
            this.field1796 = new short[var11];
        }
        if (var16 == 1) {
            this.field1804 = new int[var9];
        }
        if (var12 == 1) {
            this.field1785 = new byte[var10];
            this.field1793 = new byte[var10];
            this.field1812 = new short[var10];
        }
        if (var13 == 255) {
            this.field1786 = new byte[var10];
        } else {
            this.field1801 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1787 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1781 = new int[var10];
        }
        this.field1789 = new short[var10];
        var4.field2384 = var21;
        var5.field2384 = var36;
        var6.field2384 = var38;
        var7.field2384 = var40;
        var8.field2384 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2930();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2942();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2942();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2942();
            }
            this.field1778[var46] = var43 + var48;
            this.field1779[var46] = var44 + var49;
            this.field1780[var46] = var45 + var50;
            var43 = this.field1778[var46];
            var44 = this.field1779[var46];
            var45 = this.field1780[var46];
            if (var16 == 1) {
                this.field1804[var46] = var8.method2930();
            }
        }
        var4.field2384 = var32;
        var5.field2384 = var28;
        var6.field2384 = var26;
        var7.field2384 = var30;
        var8.field2384 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1789[var51] = (short) var4.method2932();
            if (var12 == 1) {
                int var52 = var5.method2930();
                if ((var52 & 0x1) == 1) {
                    this.field1785[var51] = 1;
                    var2 = true;
                } else {
                    this.field1785[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1793[var51] = (byte) (var52 >> 2);
                    this.field1812[var51] = this.field1789[var51];
                    this.field1789[var51] = 127;
                    if (this.field1812[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1793[var51] = -1;
                    this.field1812[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1786[var51] = var6.method2931();
            }
            if (var14 == 1) {
                this.field1787[var51] = var7.method2931();
            }
            if (var15 == 1) {
                this.field1781[var51] = var8.method2930();
            }
        }
        var4.field2384 = var25;
        var5.field2384 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2930();
            if (var58 == 1) {
                var53 = var4.method2942() + var56;
                var54 = var4.method2942() + var53;
                var55 = var4.method2942() + var54;
                var56 = var55;
                this.field1782[var57] = var53;
                this.field1798[var57] = var54;
                this.field1784[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2942() + var56;
                var56 = var55;
                this.field1782[var57] = var53;
                this.field1798[var57] = var54;
                this.field1784[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2942() + var56;
                var56 = var55;
                this.field1782[var57] = var53;
                this.field1798[var57] = var54;
                this.field1784[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2942() + var56;
                var56 = var55;
                this.field1782[var57] = var53;
                this.field1798[var57] = var61;
                this.field1784[var57] = var55;
            }
        }
        var4.field2384 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1803[var62] = 0;
            this.field1788[var62] = (short) var4.method2932();
            this.field1807[var62] = (short) var4.method2932();
            this.field1796[var62] = (short) var4.method2932();
        }
        if (this.field1793 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1793[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1788[var65] & 0xFFFF) == this.field1782[var64] && (this.field1807[var65] & 0xFFFF) == this.field1798[var64] && (this.field1796[var65] & 0xFFFF) == this.field1784[var64]) {
                        this.field1793[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1793 = null;
            }
        }
        if (!var3) {
            this.field1812 = null;
        }
        if (!var2) {
            this.field1785 = null;
        }
    }

    public class128(class128[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1819 = 0;
        this.field1810 = 0;
        this.field1792 = 0;
        this.field1801 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class128 var10 = arg0[var9];
            if (var10 != null) {
                this.field1819 += var10.field1819;
                this.field1810 += var10.field1810;
                this.field1792 += var10.field1792;
                if (var10.field1786 == null) {
                    if (this.field1801 == -1) {
                        this.field1801 = var10.field1801;
                    }
                    if (this.field1801 != var10.field1801) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1785 != null;
                var5 |= var10.field1787 != null;
                var6 |= var10.field1781 != null;
                var7 |= var10.field1812 != null;
                var8 |= var10.field1793 != null;
            }
        }
        this.field1778 = new int[this.field1819];
        this.field1779 = new int[this.field1819];
        this.field1780 = new int[this.field1819];
        this.field1804 = new int[this.field1819];
        this.field1782 = new int[this.field1810];
        this.field1798 = new int[this.field1810];
        this.field1784 = new int[this.field1810];
        if (var3) {
            this.field1785 = new byte[this.field1810];
        }
        if (var4) {
            this.field1786 = new byte[this.field1810];
        }
        if (var5) {
            this.field1787 = new byte[this.field1810];
        }
        if (var6) {
            this.field1781 = new int[this.field1810];
        }
        if (var7) {
            this.field1812 = new short[this.field1810];
        }
        if (var8) {
            this.field1793 = new byte[this.field1810];
        }
        this.field1789 = new short[this.field1810];
        if (this.field1792 > 0) {
            this.field1803 = new byte[this.field1792];
            this.field1788 = new short[this.field1792];
            this.field1807 = new short[this.field1792];
            this.field1796 = new short[this.field1792];
            this.field1797 = new short[this.field1792];
            this.field1808 = new short[this.field1792];
            this.field1805 = new short[this.field1792];
            this.field1800 = new short[this.field1792];
            this.field1790 = new byte[this.field1792];
            this.field1821 = new short[this.field1792];
            this.field1802 = new short[this.field1792];
        }
        this.field1819 = 0;
        this.field1810 = 0;
        this.field1792 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class128 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1810; var13++) {
                    if (var3 && var12.field1785 != null) {
                        this.field1785[this.field1810] = var12.field1785[var13];
                    }
                    if (var4) {
                        if (var12.field1786 == null) {
                            this.field1786[this.field1810] = var12.field1801;
                        } else {
                            this.field1786[this.field1810] = var12.field1786[var13];
                        }
                    }
                    if (var5 && var12.field1787 != null) {
                        this.field1787[this.field1810] = var12.field1787[var13];
                    }
                    if (var6 && var12.field1781 != null) {
                        this.field1781[this.field1810] = var12.field1781[var13];
                    }
                    if (var7) {
                        if (var12.field1812 == null) {
                            this.field1812[this.field1810] = -1;
                        } else {
                            this.field1812[this.field1810] = var12.field1812[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1793 == null || var12.field1793[var13] == -1) {
                            this.field1793[this.field1810] = -1;
                        } else {
                            this.field1793[this.field1810] = (byte) (var12.field1793[var13] + this.field1792);
                        }
                    }
                    this.field1789[this.field1810] = var12.field1789[var13];
                    this.field1782[this.field1810] = this.method2231(var12, var12.field1782[var13]);
                    this.field1798[this.field1810] = this.method2231(var12, var12.field1798[var13]);
                    this.field1784[this.field1810] = this.method2231(var12, var12.field1784[var13]);
                    this.field1810++;
                }
                for (int var14 = 0; var14 < var12.field1792; var14++) {
                    byte var15 = this.field1803[this.field1792] = var12.field1803[var14];
                    if (var15 == 0) {
                        this.field1788[this.field1792] = (short) this.method2231(var12, var12.field1788[var14]);
                        this.field1807[this.field1792] = (short) this.method2231(var12, var12.field1807[var14]);
                        this.field1796[this.field1792] = (short) this.method2231(var12, var12.field1796[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1788[this.field1792] = var12.field1788[var14];
                        this.field1807[this.field1792] = var12.field1807[var14];
                        this.field1796[this.field1792] = var12.field1796[var14];
                        this.field1797[this.field1792] = var12.field1797[var14];
                        this.field1808[this.field1792] = var12.field1808[var14];
                        this.field1805[this.field1792] = var12.field1805[var14];
                        this.field1800[this.field1792] = var12.field1800[var14];
                        this.field1790[this.field1792] = var12.field1790[var14];
                        this.field1821[this.field1792] = var12.field1821[var14];
                    }
                    if (var15 == 2) {
                        this.field1802[this.field1792] = var12.field1802[var14];
                    }
                    this.field1792++;
                }
            }
        }
    }

    @ObfuscatedName("df.g(Ldf;I)I")
    public final int method2231(class128 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1778[arg1];
        int var5 = arg0.field1779[arg1];
        int var6 = arg0.field1780[arg1];
        for (int var7 = 0; var7 < this.field1819; var7++) {
            if (this.field1778[var7] == var4 && this.field1779[var7] == var5 && this.field1780[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1778[this.field1819] = var4;
            this.field1779[this.field1819] = var5;
            this.field1780[this.field1819] = var6;
            if (arg0.field1804 != null) {
                this.field1804[this.field1819] = arg0.field1804[arg1];
            }
            var3 = this.field1819++;
        }
        return var3;
    }

    public class128(class128 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1819 = arg0.field1819;
        this.field1810 = arg0.field1810;
        this.field1792 = arg0.field1792;
        if (arg1) {
            this.field1778 = arg0.field1778;
            this.field1779 = arg0.field1779;
            this.field1780 = arg0.field1780;
        } else {
            this.field1778 = new int[this.field1819];
            this.field1779 = new int[this.field1819];
            this.field1780 = new int[this.field1819];
            for (int var6 = 0; var6 < this.field1819; var6++) {
                this.field1778[var6] = arg0.field1778[var6];
                this.field1779[var6] = arg0.field1779[var6];
                this.field1780[var6] = arg0.field1780[var6];
            }
        }
        if (arg2) {
            this.field1789 = arg0.field1789;
        } else {
            this.field1789 = new short[this.field1810];
            for (int var7 = 0; var7 < this.field1810; var7++) {
                this.field1789[var7] = arg0.field1789[var7];
            }
        }
        if (arg3 || arg0.field1812 == null) {
            this.field1812 = arg0.field1812;
        } else {
            this.field1812 = new short[this.field1810];
            for (int var8 = 0; var8 < this.field1810; var8++) {
                this.field1812[var8] = arg0.field1812[var8];
            }
        }
        if (arg4) {
            this.field1787 = arg0.field1787;
        } else {
            this.field1787 = new byte[this.field1810];
            if (arg0.field1787 == null) {
                for (int var9 = 0; var9 < this.field1810; var9++) {
                    this.field1787[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1810; var10++) {
                    this.field1787[var10] = arg0.field1787[var10];
                }
            }
        }
        this.field1782 = arg0.field1782;
        this.field1798 = arg0.field1798;
        this.field1784 = arg0.field1784;
        this.field1785 = arg0.field1785;
        this.field1786 = arg0.field1786;
        this.field1793 = arg0.field1793;
        this.field1801 = arg0.field1801;
        this.field1803 = arg0.field1803;
        this.field1788 = arg0.field1788;
        this.field1807 = arg0.field1807;
        this.field1796 = arg0.field1796;
        this.field1797 = arg0.field1797;
        this.field1808 = arg0.field1808;
        this.field1805 = arg0.field1805;
        this.field1800 = arg0.field1800;
        this.field1790 = arg0.field1790;
        this.field1821 = arg0.field1821;
        this.field1802 = arg0.field1802;
        this.field1804 = arg0.field1804;
        this.field1781 = arg0.field1781;
        this.field1806 = arg0.field1806;
        this.field1791 = arg0.field1791;
        this.field1809 = arg0.field1809;
        this.field1777 = arg0.field1777;
        this.field1795 = arg0.field1795;
        this.field1811 = arg0.field1811;
        this.field1783 = arg0.field1783;
    }

    @ObfuscatedName("df.v()Ldf;")
    public class128 method2233() {
        class128 var1 = new class128();
        if (this.field1785 != null) {
            var1.field1785 = new byte[this.field1810];
            for (int var2 = 0; var2 < this.field1810; var2++) {
                var1.field1785[var2] = this.field1785[var2];
            }
        }
        var1.field1819 = this.field1819;
        var1.field1810 = this.field1810;
        var1.field1792 = this.field1792;
        var1.field1778 = this.field1778;
        var1.field1779 = this.field1779;
        var1.field1780 = this.field1780;
        var1.field1782 = this.field1782;
        var1.field1798 = this.field1798;
        var1.field1784 = this.field1784;
        var1.field1786 = this.field1786;
        var1.field1787 = this.field1787;
        var1.field1793 = this.field1793;
        var1.field1789 = this.field1789;
        var1.field1812 = this.field1812;
        var1.field1801 = this.field1801;
        var1.field1803 = this.field1803;
        var1.field1788 = this.field1788;
        var1.field1807 = this.field1807;
        var1.field1796 = this.field1796;
        var1.field1797 = this.field1797;
        var1.field1808 = this.field1808;
        var1.field1805 = this.field1805;
        var1.field1800 = this.field1800;
        var1.field1790 = this.field1790;
        var1.field1821 = this.field1821;
        var1.field1802 = this.field1802;
        var1.field1804 = this.field1804;
        var1.field1781 = this.field1781;
        var1.field1806 = this.field1806;
        var1.field1791 = this.field1791;
        var1.field1809 = this.field1809;
        var1.field1777 = this.field1777;
        var1.field1811 = this.field1811;
        var1.field1783 = this.field1783;
        return var1;
    }

    @ObfuscatedName("df.t([[IIIIZI)Ldf;")
    public class128 method2234(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2247();
        int var7 = this.field1815 + arg1;
        int var8 = this.field1816 + arg1;
        int var9 = this.field1818 + arg3;
        int var10 = this.field1817 + arg3;
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
            var15.field1819 = this.field1819;
            var15.field1810 = this.field1810;
            var15.field1792 = this.field1792;
            var15.field1778 = this.field1778;
            var15.field1780 = this.field1780;
            var15.field1782 = this.field1782;
            var15.field1798 = this.field1798;
            var15.field1784 = this.field1784;
            var15.field1785 = this.field1785;
            var15.field1786 = this.field1786;
            var15.field1787 = this.field1787;
            var15.field1793 = this.field1793;
            var15.field1789 = this.field1789;
            var15.field1812 = this.field1812;
            var15.field1801 = this.field1801;
            var15.field1803 = this.field1803;
            var15.field1788 = this.field1788;
            var15.field1807 = this.field1807;
            var15.field1796 = this.field1796;
            var15.field1797 = this.field1797;
            var15.field1808 = this.field1808;
            var15.field1805 = this.field1805;
            var15.field1800 = this.field1800;
            var15.field1790 = this.field1790;
            var15.field1821 = this.field1821;
            var15.field1802 = this.field1802;
            var15.field1804 = this.field1804;
            var15.field1781 = this.field1781;
            var15.field1806 = this.field1806;
            var15.field1791 = this.field1791;
            var15.field1811 = this.field1811;
            var15.field1783 = this.field1783;
            var15.field1779 = new int[var15.field1819];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1819; var16++) {
                int var17 = this.field1778[var16] + arg1;
                int var18 = this.field1780[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1779[var16] = this.field1779[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1819; var26++) {
                int var27 = (-this.field1779[var26] << 16) / this.field2104;
                if (var27 < arg5) {
                    int var28 = this.field1778[var26] + arg1;
                    int var29 = this.field1780[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1779[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1779[var26];
                }
            }
        }
        var15.method2246();
        return var15;
    }

    @ObfuscatedName("df.p()V")
    public void method2235() {
        int var10002;
        if (this.field1804 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1819; var3++) {
                int var4 = this.field1804[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1806 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1806[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1819) {
                int var7 = this.field1804[var6];
                this.field1806[var7][var1[var7]++] = var6++;
            }
            this.field1804 = null;
        }
        if (this.field1781 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1810; var10++) {
            int var11 = this.field1781[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1791 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1791[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1810) {
            int var14 = this.field1781[var13];
            this.field1791[var14][var8[var14]++] = var13++;
        }
        this.field1781 = null;
    }

    @ObfuscatedName("df.l()V")
    public void method2236() {
        for (int var1 = 0; var1 < this.field1819; var1++) {
            int var2 = this.field1778[var1];
            this.field1778[var1] = this.field1780[var1];
            this.field1780[var1] = -var2;
        }
        this.method2246();
    }

    @ObfuscatedName("df.a()V")
    public void method2266() {
        for (int var1 = 0; var1 < this.field1819; var1++) {
            this.field1778[var1] = -this.field1778[var1];
            this.field1780[var1] = -this.field1780[var1];
        }
        this.method2246();
    }

    @ObfuscatedName("df.k()V")
    public void method2296() {
        for (int var1 = 0; var1 < this.field1819; var1++) {
            int var2 = this.field1780[var1];
            this.field1780[var1] = this.field1778[var1];
            this.field1778[var1] = -var2;
        }
        this.method2246();
    }

    @ObfuscatedName("df.b(I)V")
    public void method2239(int arg0) {
        int var2 = field1822[arg0];
        int var3 = field1823[arg0];
        for (int var4 = 0; var4 < this.field1819; var4++) {
            int var5 = this.field1780[var4] * var2 + this.field1778[var4] * var3 >> 16;
            this.field1780[var4] = this.field1780[var4] * var3 - this.field1778[var4] * var2 >> 16;
            this.field1778[var4] = var5;
        }
        this.method2246();
    }

    @ObfuscatedName("df.s(III)V")
    public void method2240(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1819; var4++) {
            this.field1778[var4] += arg0;
            this.field1779[var4] += arg1;
            this.field1780[var4] += arg2;
        }
        this.method2246();
    }

    @ObfuscatedName("df.n(SS)V")
    public void method2289(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1810; var3++) {
            if (this.field1789[var3] == arg0) {
                this.field1789[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("df.y(SS)V")
    public void method2295(short arg0, short arg1) {
        if (this.field1812 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1810; var3++) {
            if (this.field1812[var3] == arg0) {
                this.field1812[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("df.w()V")
    public void method2243() {
        for (int var1 = 0; var1 < this.field1819; var1++) {
            this.field1780[var1] = -this.field1780[var1];
        }
        for (int var2 = 0; var2 < this.field1810; var2++) {
            int var3 = this.field1782[var2];
            this.field1782[var2] = this.field1784[var2];
            this.field1784[var2] = var3;
        }
        this.method2246();
    }

    @ObfuscatedName("df.f(III)V")
    public void method2294(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1819; var4++) {
            this.field1778[var4] = this.field1778[var4] * arg0 / 128;
            this.field1779[var4] = this.field1779[var4] * arg1 / 128;
            this.field1780[var4] = this.field1780[var4] * arg2 / 128;
        }
        this.method2246();
    }

    @ObfuscatedName("df.c()V")
    public void method2245() {
        if (this.field1809 != null) {
            return;
        }
        this.field1809 = new class136[this.field1819];
        for (int var1 = 0; var1 < this.field1819; var1++) {
            this.field1809[var1] = new class136();
        }
        for (int var2 = 0; var2 < this.field1810; var2++) {
            int var3 = this.field1782[var2];
            int var4 = this.field1798[var2];
            int var5 = this.field1784[var2];
            int var6 = this.field1778[var4] - this.field1778[var3];
            int var7 = this.field1779[var4] - this.field1779[var3];
            int var8 = this.field1780[var4] - this.field1780[var3];
            int var9 = this.field1778[var5] - this.field1778[var3];
            int var10 = this.field1779[var5] - this.field1779[var3];
            int var11 = this.field1780[var5] - this.field1780[var3];
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
            if (this.field1785 == null) {
                var19 = 0;
            } else {
                var19 = this.field1785[var2];
            }
            if (var19 == 0) {
                class136 var20 = this.field1809[var3];
                var20.field1997 += var16;
                var20.field1992 += var17;
                var20.field1993 += var18;
                var20.field1994++;
                class136 var21 = this.field1809[var4];
                var21.field1997 += var16;
                var21.field1992 += var17;
                var21.field1993 += var18;
                var21.field1994++;
                class136 var22 = this.field1809[var5];
                var22.field1997 += var16;
                var22.field1992 += var17;
                var22.field1993 += var18;
                var22.field1994++;
            } else if (var19 == 1) {
                if (this.field1777 == null) {
                    this.field1777 = new class144[this.field1810];
                }
                class144 var23 = this.field1777[var2] = new class144();
                var23.field2123 = var16;
                var23.field2119 = var17;
                var23.field2122 = var18;
            }
        }
    }

    @ObfuscatedName("df.z()V")
    public void method2246() {
        this.field1809 = null;
        this.field1795 = null;
        this.field1777 = null;
        this.field1813 = false;
    }

    @ObfuscatedName("df.ay()V")
    public void method2247() {
        if (this.field1813) {
            return;
        }
        this.field2104 = 0;
        this.field1814 = 0;
        this.field1815 = 999999;
        this.field1816 = -999999;
        this.field1817 = -99999;
        this.field1818 = 99999;
        for (int var1 = 0; var1 < this.field1819; var1++) {
            int var2 = this.field1778[var1];
            int var3 = this.field1779[var1];
            int var4 = this.field1780[var1];
            if (var2 < this.field1815) {
                this.field1815 = var2;
            }
            if (var2 > this.field1816) {
                this.field1816 = var2;
            }
            if (var4 < this.field1818) {
                this.field1818 = var4;
            }
            if (var4 > this.field1817) {
                this.field1817 = var4;
            }
            if (-var3 > this.field2104) {
                this.field2104 = -var3;
            }
            if (var3 > this.field1814) {
                this.field1814 = var3;
            }
        }
        this.field1813 = true;
    }

    @ObfuscatedName("df.ah(Ldf;Ldf;IIIZ)V")
    public static void method2248(class128 arg0, class128 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2247();
        arg0.method2245();
        arg1.method2247();
        arg1.method2245();
        field1799++;
        int var6 = 0;
        int[] var7 = arg1.field1778;
        int var8 = arg1.field1819;
        for (int var9 = 0; var9 < arg0.field1819; var9++) {
            class136 var10 = arg0.field1809[var9];
            if (var10.field1994 != 0) {
                int var11 = arg0.field1779[var9] - arg3;
                if (var11 <= arg1.field1814) {
                    int var12 = arg0.field1778[var9] - arg2;
                    if (var12 >= arg1.field1815 && var12 <= arg1.field1816) {
                        int var13 = arg0.field1780[var9] - arg4;
                        if (var13 >= arg1.field1818 && var13 <= arg1.field1817) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class136 var15 = arg1.field1809[var14];
                                if (var7[var14] == var12 && arg1.field1780[var14] == var13 && arg1.field1779[var14] == var11 && var15.field1994 != 0) {
                                    if (arg0.field1795 == null) {
                                        arg0.field1795 = new class136[arg0.field1819];
                                    }
                                    if (arg1.field1795 == null) {
                                        arg1.field1795 = new class136[var8];
                                    }
                                    class136 var16 = arg0.field1795[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1795[var9] = new class136(var10);
                                    }
                                    class136 var17 = arg1.field1795[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1795[var14] = new class136(var15);
                                    }
                                    var16.field1997 += var15.field1997;
                                    var16.field1992 += var15.field1992;
                                    var16.field1993 += var15.field1993;
                                    var16.field1994 += var15.field1994;
                                    var17.field1997 += var10.field1997;
                                    var17.field1992 += var10.field1992;
                                    var17.field1993 += var10.field1993;
                                    var17.field1994 += var10.field1994;
                                    var6++;
                                    field1794[var9] = field1799;
                                    field1820[var14] = field1799;
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
        for (int var18 = 0; var18 < arg0.field1810; var18++) {
            if (field1794[arg0.field1782[var18]] == field1799 && field1794[arg0.field1798[var18]] == field1799 && field1794[arg0.field1784[var18]] == field1799) {
                if (arg0.field1785 == null) {
                    arg0.field1785 = new byte[arg0.field1810];
                }
                arg0.field1785[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1810; var19++) {
            if (field1820[arg1.field1782[var19]] == field1799 && field1820[arg1.field1798[var19]] == field1799 && field1820[arg1.field1784[var19]] == field1799) {
                if (arg1.field1785 == null) {
                    arg1.field1785 = new byte[arg1.field1810];
                }
                arg1.field1785[var19] = 2;
            }
        }
    }

    @ObfuscatedName("df.az(IIIII)Lew;")
    public final class134 method2271(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2245();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class134 var8 = new class134();
        var8.field1921 = new int[this.field1810];
        var8.field1922 = new int[this.field1810];
        var8.field1967 = new int[this.field1810];
        if (this.field1792 > 0 && this.field1793 != null) {
            int[] var9 = new int[this.field1792];
            for (int var10 = 0; var10 < this.field1810; var10++) {
                if (this.field1793[var10] != -1) {
                    var9[this.field1793[var10] & 0xFF]++;
                }
            }
            var8.field1929 = 0;
            for (int var11 = 0; var11 < this.field1792; var11++) {
                if (var9[var11] > 0 && this.field1803[var11] == 0) {
                    var8.field1929++;
                }
            }
            var8.field1941 = new int[var8.field1929];
            var8.field1931 = new int[var8.field1929];
            var8.field1930 = new int[var8.field1929];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1792; var13++) {
                if (var9[var13] > 0 && this.field1803[var13] == 0) {
                    var8.field1941[var12] = this.field1788[var13] & 0xFFFF;
                    var8.field1931[var12] = this.field1807[var13] & 0xFFFF;
                    var8.field1930[var12] = this.field1796[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1919 = new byte[this.field1810];
            for (int var14 = 0; var14 < this.field1810; var14++) {
                if (this.field1793[var14] == -1) {
                    var8.field1919[var14] = -1;
                } else {
                    var8.field1919[var14] = (byte) var9[this.field1793[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1810; var15++) {
            byte var16;
            if (this.field1785 == null) {
                var16 = 0;
            } else {
                var16 = this.field1785[var15];
            }
            byte var17;
            if (this.field1787 == null) {
                var17 = 0;
            } else {
                var17 = this.field1787[var15];
            }
            short var18;
            if (this.field1812 == null) {
                var18 = -1;
            } else {
                var18 = this.field1812[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1789[var15] & 0xFFFF;
                    class136 var20;
                    if (this.field1795 == null || this.field1795[this.field1782[var15]] == null) {
                        var20 = this.field1809[this.field1782[var15]];
                    } else {
                        var20 = this.field1795[this.field1782[var15]];
                    }
                    int var21 = (var20.field1993 * arg4 + var20.field1997 * arg2 + var20.field1992 * arg3) / (var20.field1994 * var7) + arg0;
                    var8.field1921[var15] = method2250(var19, var21);
                    class136 var22;
                    if (this.field1795 == null || this.field1795[this.field1798[var15]] == null) {
                        var22 = this.field1809[this.field1798[var15]];
                    } else {
                        var22 = this.field1795[this.field1798[var15]];
                    }
                    int var23 = (var22.field1993 * arg4 + var22.field1997 * arg2 + var22.field1992 * arg3) / (var22.field1994 * var7) + arg0;
                    var8.field1922[var15] = method2250(var19, var23);
                    class136 var24;
                    if (this.field1795 == null || this.field1795[this.field1784[var15]] == null) {
                        var24 = this.field1809[this.field1784[var15]];
                    } else {
                        var24 = this.field1795[this.field1784[var15]];
                    }
                    int var25 = (var24.field1993 * arg4 + var24.field1997 * arg2 + var24.field1992 * arg3) / (var24.field1994 * var7) + arg0;
                    var8.field1967[var15] = method2250(var19, var25);
                } else if (var16 == 1) {
                    class144 var26 = this.field1777[var15];
                    int var27 = (var26.field2122 * arg4 + var26.field2123 * arg2 + var26.field2119 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1921[var15] = method2250(this.field1789[var15] & 0xFFFF, var27);
                    var8.field1967[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1921[var15] = 128;
                    var8.field1967[var15] = -1;
                } else {
                    var8.field1967[var15] = -2;
                }
            } else if (var16 == 0) {
                class136 var28;
                if (this.field1795 == null || this.field1795[this.field1782[var15]] == null) {
                    var28 = this.field1809[this.field1782[var15]];
                } else {
                    var28 = this.field1795[this.field1782[var15]];
                }
                int var29 = (var28.field1993 * arg4 + var28.field1997 * arg2 + var28.field1992 * arg3) / (var28.field1994 * var7) + arg0;
                var8.field1921[var15] = method2287(var29);
                class136 var30;
                if (this.field1795 == null || this.field1795[this.field1798[var15]] == null) {
                    var30 = this.field1809[this.field1798[var15]];
                } else {
                    var30 = this.field1795[this.field1798[var15]];
                }
                int var31 = (var30.field1993 * arg4 + var30.field1997 * arg2 + var30.field1992 * arg3) / (var30.field1994 * var7) + arg0;
                var8.field1922[var15] = method2287(var31);
                class136 var32;
                if (this.field1795 == null || this.field1795[this.field1784[var15]] == null) {
                    var32 = this.field1809[this.field1784[var15]];
                } else {
                    var32 = this.field1795[this.field1784[var15]];
                }
                int var33 = (var32.field1993 * arg4 + var32.field1997 * arg2 + var32.field1992 * arg3) / (var32.field1994 * var7) + arg0;
                var8.field1967[var15] = method2287(var33);
            } else if (var16 == 1) {
                class144 var34 = this.field1777[var15];
                int var35 = (var34.field2122 * arg4 + var34.field2123 * arg2 + var34.field2119 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1921[var15] = method2287(var35);
                var8.field1967[var15] = -1;
            } else {
                var8.field1967[var15] = -2;
            }
        }
        this.method2235();
        var8.field1913 = this.field1819;
        var8.field1914 = this.field1778;
        var8.field1947 = this.field1779;
        var8.field1952 = this.field1780;
        var8.field1917 = this.field1810;
        var8.field1918 = this.field1782;
        var8.field1916 = this.field1798;
        var8.field1923 = this.field1784;
        var8.field1924 = this.field1786;
        var8.field1925 = this.field1787;
        var8.field1928 = this.field1801;
        var8.field1933 = this.field1806;
        var8.field1934 = this.field1791;
        var8.field1927 = this.field1812;
        return var8;
    }

    @ObfuscatedName("df.ac(II)I")
    public static final int method2250(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("df.aq(I)I")
    public static final int method2287(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
