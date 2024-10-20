package deob;

@ObfuscatedName("cv")
public class class104 extends class89 {

    @ObfuscatedName("cv.e")
    public int field1807 = 0;

    @ObfuscatedName("cv.l")
    public int[] field1765;

    @ObfuscatedName("cv.c")
    public int[] field1766;

    @ObfuscatedName("cv.h")
    public int[] field1767;

    @ObfuscatedName("cv.r")
    public int field1771 = 0;

    @ObfuscatedName("cv.a")
    public int[] field1769;

    @ObfuscatedName("cv.b")
    public int[] field1796;

    @ObfuscatedName("cv.u")
    public int[] field1799;

    @ObfuscatedName("cv.o")
    public byte[] field1772;

    @ObfuscatedName("cv.p")
    public byte[] field1773;

    @ObfuscatedName("cv.i")
    public byte[] field1804;

    @ObfuscatedName("cv.q")
    public byte[] field1779;

    @ObfuscatedName("cv.g")
    public short[] field1800;

    @ObfuscatedName("cv.j")
    public short[] field1777;

    @ObfuscatedName("cv.w")
    public byte field1778 = 0;

    @ObfuscatedName("cv.x")
    public int field1764;

    @ObfuscatedName("cv.f")
    public byte[] field1782;

    @ObfuscatedName("cv.t")
    public short[] field1809;

    @ObfuscatedName("cv.z")
    public short[] field1788;

    @ObfuscatedName("cv.y")
    public short[] field1783;

    @ObfuscatedName("cv.m")
    public short[] field1784;

    @ObfuscatedName("cv.v")
    public short[] field1785;

    @ObfuscatedName("cv.k")
    public short[] field1786;

    @ObfuscatedName("cv.n")
    public short[] field1787;

    @ObfuscatedName("cv.d")
    public short[] field1770;

    @ObfuscatedName("cv.s")
    public short[] field1789;

    @ObfuscatedName("cv.ah")
    public byte[] field1790;

    @ObfuscatedName("cv.ak")
    public int[] field1791;

    @ObfuscatedName("cv.as")
    public int[] field1795;

    @ObfuscatedName("cv.ae")
    public int[][] field1793;

    @ObfuscatedName("cv.ao")
    public int[][] field1794;

    @ObfuscatedName("cv.av")
    public class88[] field1798;

    @ObfuscatedName("cv.al")
    public class100[] field1808;

    @ObfuscatedName("cv.ap")
    public class100[] field1797;

    @ObfuscatedName("cv.an")
    public short field1781;

    @ObfuscatedName("cv.aw")
    public short field1775;

    @ObfuscatedName("cv.ad")
    public boolean field1774 = false;

    @ObfuscatedName("cv.aa")
    public int field1801;

    @ObfuscatedName("cv.at")
    public int field1802;

    @ObfuscatedName("cv.ag")
    public int field1803;

    @ObfuscatedName("cv.aq")
    public int field1792;

    @ObfuscatedName("cv.af")
    public int field1805;

    @ObfuscatedName("cv.ax")
    public static int[] field1806 = new int[10000];

    @ObfuscatedName("cv.ai")
    public static int[] field1768 = new int[10000];

    @ObfuscatedName("cv.ar")
    public static int field1776 = 0;

    @ObfuscatedName("cv.ab")
    public static int[] field1780 = class95.field1656;

    @ObfuscatedName("cv.aj")
    public static int[] field1810 = class95.field1654;

    public class104() {
    }

    @ObfuscatedName("cv.e(Lfe;II)Lcv;")
    public static class104 method2178(class171 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3130(arg1, arg2);
        return var3 == null ? null : new class104(var3);
    }

    public class104(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2155(arg0);
        } else {
            this.method2193(arg0);
        }
    }

    @ObfuscatedName("cv.l([B)V")
    public void method2155(byte[] arg0) {
        class123 var2 = new class123(arg0);
        class123 var3 = new class123(arg0);
        class123 var4 = new class123(arg0);
        class123 var5 = new class123(arg0);
        class123 var6 = new class123(arg0);
        class123 var7 = new class123(arg0);
        class123 var8 = new class123(arg0);
        var2.field2062 = arg0.length - 23;
        int var9 = var2.method2466();
        int var10 = var2.method2466();
        int var11 = var2.method2464();
        int var12 = var2.method2464();
        int var13 = var2.method2464();
        int var14 = var2.method2464();
        int var15 = var2.method2464();
        int var16 = var2.method2464();
        int var17 = var2.method2464();
        int var18 = var2.method2466();
        int var19 = var2.method2466();
        int var20 = var2.method2466();
        int var21 = var2.method2466();
        int var22 = var2.method2466();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1782 = new byte[var11];
            var2.field2062 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1782[var26] = var2.method2465();
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
        this.field1771 = var10;
        this.field1764 = var11;
        this.field1765 = new int[var9];
        this.field1766 = new int[var9];
        this.field1767 = new int[var9];
        this.field1769 = new int[var10];
        this.field1796 = new int[var10];
        this.field1799 = new int[var10];
        if (var17 == 1) {
            this.field1791 = new int[var9];
        }
        if (var12 == 1) {
            this.field1772 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1773 = new byte[var10];
        } else {
            this.field1778 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1804 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1795 = new int[var10];
        }
        if (var16 == 1) {
            this.field1777 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1779 = new byte[var10];
        }
        this.field1800 = new short[var10];
        if (var11 > 0) {
            this.field1809 = new short[var11];
            this.field1788 = new short[var11];
            this.field1783 = new short[var11];
            if (var24 > 0) {
                this.field1784 = new short[var24];
                this.field1785 = new short[var24];
                this.field1786 = new short[var24];
                this.field1787 = new short[var24];
                this.field1790 = new byte[var24];
                this.field1770 = new short[var24];
            }
            if (var25 > 0) {
                this.field1789 = new short[var25];
            }
        }
        var2.field2062 = var11;
        var3.field2062 = var44;
        var4.field2062 = var46;
        var5.field2062 = var48;
        var6.field2062 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2464();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2556();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2556();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2556();
            }
            this.field1765[var67] = var64 + var69;
            this.field1766[var67] = var65 + var70;
            this.field1767[var67] = var66 + var71;
            var64 = this.field1765[var67];
            var65 = this.field1766[var67];
            var66 = this.field1767[var67];
            if (var17 == 1) {
                this.field1791[var67] = var6.method2464();
            }
        }
        var2.field2062 = var42;
        var3.field2062 = var31;
        var4.field2062 = var34;
        var5.field2062 = var37;
        var6.field2062 = var35;
        var7.field2062 = var40;
        var8.field2062 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1800[var72] = (short) var2.method2466();
            if (var12 == 1) {
                this.field1772[var72] = var3.method2465();
            }
            if (var13 == 255) {
                this.field1773[var72] = var4.method2465();
            }
            if (var14 == 1) {
                this.field1804[var72] = var5.method2465();
            }
            if (var15 == 1) {
                this.field1795[var72] = var6.method2464();
            }
            if (var16 == 1) {
                this.field1777[var72] = (short) (var7.method2466() - 1);
            }
            if (this.field1779 != null && this.field1777[var72] != -1) {
                this.field1779[var72] = (byte) (var8.method2464() - 1);
            }
        }
        var2.field2062 = var33;
        var3.field2062 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2464();
            if (var78 == 1) {
                var73 = var2.method2556() + var76;
                var74 = var2.method2556() + var73;
                var75 = var2.method2556() + var74;
                var76 = var75;
                this.field1769[var77] = var73;
                this.field1796[var77] = var74;
                this.field1799[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2556() + var76;
                var76 = var75;
                this.field1769[var77] = var73;
                this.field1796[var77] = var74;
                this.field1799[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2556() + var76;
                var76 = var75;
                this.field1769[var77] = var73;
                this.field1796[var77] = var74;
                this.field1799[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2556() + var76;
                var76 = var75;
                this.field1769[var77] = var73;
                this.field1796[var77] = var81;
                this.field1799[var77] = var75;
            }
        }
        var2.field2062 = var50;
        var3.field2062 = var52;
        var4.field2062 = var54;
        var5.field2062 = var56;
        var6.field2062 = var58;
        var7.field2062 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1782[var82] & 0xFF;
            if (var83 == 0) {
                this.field1809[var82] = (short) var2.method2466();
                this.field1788[var82] = (short) var2.method2466();
                this.field1783[var82] = (short) var2.method2466();
            }
            if (var83 == 1) {
                this.field1809[var82] = (short) var3.method2466();
                this.field1788[var82] = (short) var3.method2466();
                this.field1783[var82] = (short) var3.method2466();
                this.field1784[var82] = (short) var4.method2466();
                this.field1785[var82] = (short) var4.method2466();
                this.field1786[var82] = (short) var4.method2466();
                this.field1787[var82] = (short) var5.method2466();
                this.field1790[var82] = var6.method2465();
                this.field1770[var82] = (short) var7.method2466();
            }
            if (var83 == 2) {
                this.field1809[var82] = (short) var3.method2466();
                this.field1788[var82] = (short) var3.method2466();
                this.field1783[var82] = (short) var3.method2466();
                this.field1784[var82] = (short) var4.method2466();
                this.field1785[var82] = (short) var4.method2466();
                this.field1786[var82] = (short) var4.method2466();
                this.field1787[var82] = (short) var5.method2466();
                this.field1790[var82] = var6.method2465();
                this.field1770[var82] = (short) var7.method2466();
                this.field1789[var82] = (short) var7.method2466();
            }
            if (var83 == 3) {
                this.field1809[var82] = (short) var3.method2466();
                this.field1788[var82] = (short) var3.method2466();
                this.field1783[var82] = (short) var3.method2466();
                this.field1784[var82] = (short) var4.method2466();
                this.field1785[var82] = (short) var4.method2466();
                this.field1786[var82] = (short) var4.method2466();
                this.field1787[var82] = (short) var5.method2466();
                this.field1790[var82] = var6.method2465();
                this.field1770[var82] = (short) var7.method2466();
            }
        }
        var2.field2062 = var62;
        int var84 = var2.method2464();
        if (var84 == 0) {
            return;
        }
        new class94();
        var2.method2466();
        var2.method2466();
        var2.method2466();
        var2.method2468();
    }

    @ObfuscatedName("cv.h([B)V")
    public void method2193(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class123 var4 = new class123(arg0);
        class123 var5 = new class123(arg0);
        class123 var6 = new class123(arg0);
        class123 var7 = new class123(arg0);
        class123 var8 = new class123(arg0);
        var4.field2062 = arg0.length - 18;
        int var9 = var4.method2466();
        int var10 = var4.method2466();
        int var11 = var4.method2464();
        int var12 = var4.method2464();
        int var13 = var4.method2464();
        int var14 = var4.method2464();
        int var15 = var4.method2464();
        int var16 = var4.method2464();
        int var17 = var4.method2466();
        int var18 = var4.method2466();
        int var19 = var4.method2466();
        int var20 = var4.method2466();
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
        this.field1771 = var10;
        this.field1764 = var11;
        this.field1765 = new int[var9];
        this.field1766 = new int[var9];
        this.field1767 = new int[var9];
        this.field1769 = new int[var10];
        this.field1796 = new int[var10];
        this.field1799 = new int[var10];
        if (var11 > 0) {
            this.field1782 = new byte[var11];
            this.field1809 = new short[var11];
            this.field1788 = new short[var11];
            this.field1783 = new short[var11];
        }
        if (var16 == 1) {
            this.field1791 = new int[var9];
        }
        if (var12 == 1) {
            this.field1772 = new byte[var10];
            this.field1779 = new byte[var10];
            this.field1777 = new short[var10];
        }
        if (var13 == 255) {
            this.field1773 = new byte[var10];
        } else {
            this.field1778 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1804 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1795 = new int[var10];
        }
        this.field1800 = new short[var10];
        var4.field2062 = var21;
        var5.field2062 = var36;
        var6.field2062 = var38;
        var7.field2062 = var40;
        var8.field2062 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2464();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2556();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2556();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2556();
            }
            this.field1765[var46] = var43 + var48;
            this.field1766[var46] = var44 + var49;
            this.field1767[var46] = var45 + var50;
            var43 = this.field1765[var46];
            var44 = this.field1766[var46];
            var45 = this.field1767[var46];
            if (var16 == 1) {
                this.field1791[var46] = var8.method2464();
            }
        }
        var4.field2062 = var32;
        var5.field2062 = var28;
        var6.field2062 = var26;
        var7.field2062 = var30;
        var8.field2062 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1800[var51] = (short) var4.method2466();
            if (var12 == 1) {
                int var52 = var5.method2464();
                if ((var52 & 0x1) == 1) {
                    this.field1772[var51] = 1;
                    var2 = true;
                } else {
                    this.field1772[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1779[var51] = (byte) (var52 >> 2);
                    this.field1777[var51] = this.field1800[var51];
                    this.field1800[var51] = 127;
                    if (this.field1777[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1779[var51] = -1;
                    this.field1777[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1773[var51] = var6.method2465();
            }
            if (var14 == 1) {
                this.field1804[var51] = var7.method2465();
            }
            if (var15 == 1) {
                this.field1795[var51] = var8.method2464();
            }
        }
        var4.field2062 = var25;
        var5.field2062 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2464();
            if (var58 == 1) {
                var53 = var4.method2556() + var56;
                var54 = var4.method2556() + var53;
                var55 = var4.method2556() + var54;
                var56 = var55;
                this.field1769[var57] = var53;
                this.field1796[var57] = var54;
                this.field1799[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2556() + var56;
                var56 = var55;
                this.field1769[var57] = var53;
                this.field1796[var57] = var54;
                this.field1799[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2556() + var56;
                var56 = var55;
                this.field1769[var57] = var53;
                this.field1796[var57] = var54;
                this.field1799[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2556() + var56;
                var56 = var55;
                this.field1769[var57] = var53;
                this.field1796[var57] = var61;
                this.field1799[var57] = var55;
            }
        }
        var4.field2062 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1782[var62] = 0;
            this.field1809[var62] = (short) var4.method2466();
            this.field1788[var62] = (short) var4.method2466();
            this.field1783[var62] = (short) var4.method2466();
        }
        if (this.field1779 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1779[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1809[var65] & 0xFFFF) == this.field1769[var64] && (this.field1788[var65] & 0xFFFF) == this.field1796[var64] && (this.field1783[var65] & 0xFFFF) == this.field1799[var64]) {
                        this.field1779[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1779 = null;
            }
        }
        if (!var3) {
            this.field1777 = null;
        }
        if (!var2) {
            this.field1772 = null;
        }
    }

    public class104(class104[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1807 = 0;
        this.field1771 = 0;
        this.field1764 = 0;
        this.field1778 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class104 var10 = arg0[var9];
            if (var10 != null) {
                this.field1807 += var10.field1807;
                this.field1771 += var10.field1771;
                this.field1764 += var10.field1764;
                if (var10.field1773 == null) {
                    if (this.field1778 == -1) {
                        this.field1778 = var10.field1778;
                    }
                    if (this.field1778 != var10.field1778) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1772 != null;
                var5 |= var10.field1804 != null;
                var6 |= var10.field1795 != null;
                var7 |= var10.field1777 != null;
                var8 |= var10.field1779 != null;
            }
        }
        this.field1765 = new int[this.field1807];
        this.field1766 = new int[this.field1807];
        this.field1767 = new int[this.field1807];
        this.field1791 = new int[this.field1807];
        this.field1769 = new int[this.field1771];
        this.field1796 = new int[this.field1771];
        this.field1799 = new int[this.field1771];
        if (var3) {
            this.field1772 = new byte[this.field1771];
        }
        if (var4) {
            this.field1773 = new byte[this.field1771];
        }
        if (var5) {
            this.field1804 = new byte[this.field1771];
        }
        if (var6) {
            this.field1795 = new int[this.field1771];
        }
        if (var7) {
            this.field1777 = new short[this.field1771];
        }
        if (var8) {
            this.field1779 = new byte[this.field1771];
        }
        this.field1800 = new short[this.field1771];
        if (this.field1764 > 0) {
            this.field1782 = new byte[this.field1764];
            this.field1809 = new short[this.field1764];
            this.field1788 = new short[this.field1764];
            this.field1783 = new short[this.field1764];
            this.field1784 = new short[this.field1764];
            this.field1785 = new short[this.field1764];
            this.field1786 = new short[this.field1764];
            this.field1787 = new short[this.field1764];
            this.field1790 = new byte[this.field1764];
            this.field1770 = new short[this.field1764];
            this.field1789 = new short[this.field1764];
        }
        this.field1807 = 0;
        this.field1771 = 0;
        this.field1764 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class104 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1771; var13++) {
                    if (var3 && var12.field1772 != null) {
                        this.field1772[this.field1771] = var12.field1772[var13];
                    }
                    if (var4) {
                        if (var12.field1773 == null) {
                            this.field1773[this.field1771] = var12.field1778;
                        } else {
                            this.field1773[this.field1771] = var12.field1773[var13];
                        }
                    }
                    if (var5 && var12.field1804 != null) {
                        this.field1804[this.field1771] = var12.field1804[var13];
                    }
                    if (var6 && var12.field1795 != null) {
                        this.field1795[this.field1771] = var12.field1795[var13];
                    }
                    if (var7) {
                        if (var12.field1777 == null) {
                            this.field1777[this.field1771] = -1;
                        } else {
                            this.field1777[this.field1771] = var12.field1777[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1779 == null || var12.field1779[var13] == -1) {
                            this.field1779[this.field1771] = -1;
                        } else {
                            this.field1779[this.field1771] = (byte) (var12.field1779[var13] + this.field1764);
                        }
                    }
                    this.field1800[this.field1771] = var12.field1800[var13];
                    this.field1769[this.field1771] = this.method2158(var12, var12.field1769[var13]);
                    this.field1796[this.field1771] = this.method2158(var12, var12.field1796[var13]);
                    this.field1799[this.field1771] = this.method2158(var12, var12.field1799[var13]);
                    this.field1771++;
                }
                for (int var14 = 0; var14 < var12.field1764; var14++) {
                    byte var15 = this.field1782[this.field1764] = var12.field1782[var14];
                    if (var15 == 0) {
                        this.field1809[this.field1764] = (short) this.method2158(var12, var12.field1809[var14]);
                        this.field1788[this.field1764] = (short) this.method2158(var12, var12.field1788[var14]);
                        this.field1783[this.field1764] = (short) this.method2158(var12, var12.field1783[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1809[this.field1764] = var12.field1809[var14];
                        this.field1788[this.field1764] = var12.field1788[var14];
                        this.field1783[this.field1764] = var12.field1783[var14];
                        this.field1784[this.field1764] = var12.field1784[var14];
                        this.field1785[this.field1764] = var12.field1785[var14];
                        this.field1786[this.field1764] = var12.field1786[var14];
                        this.field1787[this.field1764] = var12.field1787[var14];
                        this.field1790[this.field1764] = var12.field1790[var14];
                        this.field1770[this.field1764] = var12.field1770[var14];
                    }
                    if (var15 == 2) {
                        this.field1789[this.field1764] = var12.field1789[var14];
                    }
                    this.field1764++;
                }
            }
        }
    }

    @ObfuscatedName("cv.r(Lcv;I)I")
    public final int method2158(class104 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1765[arg1];
        int var5 = arg0.field1766[arg1];
        int var6 = arg0.field1767[arg1];
        for (int var7 = 0; var7 < this.field1807; var7++) {
            if (this.field1765[var7] == var4 && this.field1766[var7] == var5 && this.field1767[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1765[this.field1807] = var4;
            this.field1766[this.field1807] = var5;
            this.field1767[this.field1807] = var6;
            if (arg0.field1791 != null) {
                this.field1791[this.field1807] = arg0.field1791[arg1];
            }
            var3 = this.field1807++;
        }
        return var3;
    }

    public class104(class104 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1807 = arg0.field1807;
        this.field1771 = arg0.field1771;
        this.field1764 = arg0.field1764;
        if (arg1) {
            this.field1765 = arg0.field1765;
            this.field1766 = arg0.field1766;
            this.field1767 = arg0.field1767;
        } else {
            this.field1765 = new int[this.field1807];
            this.field1766 = new int[this.field1807];
            this.field1767 = new int[this.field1807];
            for (int var6 = 0; var6 < this.field1807; var6++) {
                this.field1765[var6] = arg0.field1765[var6];
                this.field1766[var6] = arg0.field1766[var6];
                this.field1767[var6] = arg0.field1767[var6];
            }
        }
        if (arg2) {
            this.field1800 = arg0.field1800;
        } else {
            this.field1800 = new short[this.field1771];
            for (int var7 = 0; var7 < this.field1771; var7++) {
                this.field1800[var7] = arg0.field1800[var7];
            }
        }
        if (arg3 || arg0.field1777 == null) {
            this.field1777 = arg0.field1777;
        } else {
            this.field1777 = new short[this.field1771];
            for (int var8 = 0; var8 < this.field1771; var8++) {
                this.field1777[var8] = arg0.field1777[var8];
            }
        }
        if (arg4) {
            this.field1804 = arg0.field1804;
        } else {
            this.field1804 = new byte[this.field1771];
            if (arg0.field1804 == null) {
                for (int var9 = 0; var9 < this.field1771; var9++) {
                    this.field1804[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1771; var10++) {
                    this.field1804[var10] = arg0.field1804[var10];
                }
            }
        }
        this.field1769 = arg0.field1769;
        this.field1796 = arg0.field1796;
        this.field1799 = arg0.field1799;
        this.field1772 = arg0.field1772;
        this.field1773 = arg0.field1773;
        this.field1779 = arg0.field1779;
        this.field1778 = arg0.field1778;
        this.field1782 = arg0.field1782;
        this.field1809 = arg0.field1809;
        this.field1788 = arg0.field1788;
        this.field1783 = arg0.field1783;
        this.field1784 = arg0.field1784;
        this.field1785 = arg0.field1785;
        this.field1786 = arg0.field1786;
        this.field1787 = arg0.field1787;
        this.field1790 = arg0.field1790;
        this.field1770 = arg0.field1770;
        this.field1789 = arg0.field1789;
        this.field1791 = arg0.field1791;
        this.field1795 = arg0.field1795;
        this.field1793 = arg0.field1793;
        this.field1794 = arg0.field1794;
        this.field1808 = arg0.field1808;
        this.field1798 = arg0.field1798;
        this.field1797 = arg0.field1797;
        this.field1781 = arg0.field1781;
        this.field1775 = arg0.field1775;
    }

    @ObfuscatedName("cv.a()Lcv;")
    public class104 method2159() {
        class104 var1 = new class104();
        if (this.field1772 != null) {
            var1.field1772 = new byte[this.field1771];
            for (int var2 = 0; var2 < this.field1771; var2++) {
                var1.field1772[var2] = this.field1772[var2];
            }
        }
        var1.field1807 = this.field1807;
        var1.field1771 = this.field1771;
        var1.field1764 = this.field1764;
        var1.field1765 = this.field1765;
        var1.field1766 = this.field1766;
        var1.field1767 = this.field1767;
        var1.field1769 = this.field1769;
        var1.field1796 = this.field1796;
        var1.field1799 = this.field1799;
        var1.field1773 = this.field1773;
        var1.field1804 = this.field1804;
        var1.field1779 = this.field1779;
        var1.field1800 = this.field1800;
        var1.field1777 = this.field1777;
        var1.field1778 = this.field1778;
        var1.field1782 = this.field1782;
        var1.field1809 = this.field1809;
        var1.field1788 = this.field1788;
        var1.field1783 = this.field1783;
        var1.field1784 = this.field1784;
        var1.field1785 = this.field1785;
        var1.field1786 = this.field1786;
        var1.field1787 = this.field1787;
        var1.field1790 = this.field1790;
        var1.field1770 = this.field1770;
        var1.field1789 = this.field1789;
        var1.field1791 = this.field1791;
        var1.field1795 = this.field1795;
        var1.field1793 = this.field1793;
        var1.field1794 = this.field1794;
        var1.field1808 = this.field1808;
        var1.field1798 = this.field1798;
        var1.field1781 = this.field1781;
        var1.field1775 = this.field1775;
        return var1;
    }

    @ObfuscatedName("cv.b([[IIIIZI)Lcv;")
    public class104 method2160(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2162();
        int var7 = this.field1802 + arg1;
        int var8 = this.field1803 + arg1;
        int var9 = this.field1805 + arg3;
        int var10 = this.field1792 + arg3;
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
        class104 var15;
        if (arg4) {
            var15 = new class104();
            var15.field1807 = this.field1807;
            var15.field1771 = this.field1771;
            var15.field1764 = this.field1764;
            var15.field1765 = this.field1765;
            var15.field1767 = this.field1767;
            var15.field1769 = this.field1769;
            var15.field1796 = this.field1796;
            var15.field1799 = this.field1799;
            var15.field1772 = this.field1772;
            var15.field1773 = this.field1773;
            var15.field1804 = this.field1804;
            var15.field1779 = this.field1779;
            var15.field1800 = this.field1800;
            var15.field1777 = this.field1777;
            var15.field1778 = this.field1778;
            var15.field1782 = this.field1782;
            var15.field1809 = this.field1809;
            var15.field1788 = this.field1788;
            var15.field1783 = this.field1783;
            var15.field1784 = this.field1784;
            var15.field1785 = this.field1785;
            var15.field1786 = this.field1786;
            var15.field1787 = this.field1787;
            var15.field1790 = this.field1790;
            var15.field1770 = this.field1770;
            var15.field1789 = this.field1789;
            var15.field1791 = this.field1791;
            var15.field1795 = this.field1795;
            var15.field1793 = this.field1793;
            var15.field1794 = this.field1794;
            var15.field1781 = this.field1781;
            var15.field1775 = this.field1775;
            var15.field1766 = new int[var15.field1807];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1807; var16++) {
                int var17 = this.field1765[var16] + arg1;
                int var18 = this.field1767[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1766[var16] = this.field1766[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1807; var26++) {
                int var27 = (-this.field1766[var26] << 16) / this.field1530;
                if (var27 < arg5) {
                    int var28 = this.field1765[var26] + arg1;
                    int var29 = this.field1767[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1766[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1766[var26];
                }
            }
        }
        var15.method2172();
        return var15;
    }

    @ObfuscatedName("cv.u()V")
    public void method2161() {
        int var10002;
        if (this.field1791 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1807; var3++) {
                int var4 = this.field1791[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1793 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1793[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1807) {
                int var7 = this.field1791[var6];
                this.field1793[var7][var1[var7]++] = var6++;
            }
            this.field1791 = null;
        }
        if (this.field1795 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1771; var10++) {
            int var11 = this.field1795[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1794 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1794[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1771) {
            int var14 = this.field1795[var13];
            this.field1794[var14][var8[var14]++] = var13++;
        }
        this.field1795 = null;
    }

    @ObfuscatedName("cv.o()V")
    public void method2181() {
        for (int var1 = 0; var1 < this.field1807; var1++) {
            int var2 = this.field1765[var1];
            this.field1765[var1] = this.field1767[var1];
            this.field1767[var1] = -var2;
        }
        this.method2172();
    }

    @ObfuscatedName("cv.p()V")
    public void method2154() {
        for (int var1 = 0; var1 < this.field1807; var1++) {
            this.field1765[var1] = -this.field1765[var1];
            this.field1767[var1] = -this.field1767[var1];
        }
        this.method2172();
    }

    @ObfuscatedName("cv.w()V")
    public void method2164() {
        for (int var1 = 0; var1 < this.field1807; var1++) {
            int var2 = this.field1767[var1];
            this.field1767[var1] = this.field1765[var1];
            this.field1765[var1] = -var2;
        }
        this.method2172();
    }

    @ObfuscatedName("cv.x(I)V")
    public void method2165(int arg0) {
        int var2 = field1780[arg0];
        int var3 = field1810[arg0];
        for (int var4 = 0; var4 < this.field1807; var4++) {
            int var5 = this.field1767[var4] * var2 + this.field1765[var4] * var3 >> 16;
            this.field1767[var4] = this.field1767[var4] * var3 - this.field1765[var4] * var2 >> 16;
            this.field1765[var4] = var5;
        }
        this.method2172();
    }

    @ObfuscatedName("cv.f(III)V")
    public void method2169(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1807; var4++) {
            this.field1765[var4] += arg0;
            this.field1766[var4] += arg1;
            this.field1767[var4] += arg2;
        }
        this.method2172();
    }

    @ObfuscatedName("cv.t(SS)V")
    public void method2217(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1771; var3++) {
            if (this.field1800[var3] == arg0) {
                this.field1800[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cv.z(SS)V")
    public void method2168(short arg0, short arg1) {
        if (this.field1777 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1771; var3++) {
            if (this.field1777[var3] == arg0) {
                this.field1777[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cv.y()V")
    public void method2207() {
        for (int var1 = 0; var1 < this.field1807; var1++) {
            this.field1767[var1] = -this.field1767[var1];
        }
        for (int var2 = 0; var2 < this.field1771; var2++) {
            int var3 = this.field1769[var2];
            this.field1769[var2] = this.field1799[var2];
            this.field1799[var2] = var3;
        }
        this.method2172();
    }

    @ObfuscatedName("cv.m(III)V")
    public void method2170(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1807; var4++) {
            this.field1765[var4] = this.field1765[var4] * arg0 / 128;
            this.field1766[var4] = this.field1766[var4] * arg1 / 128;
            this.field1767[var4] = this.field1767[var4] * arg2 / 128;
        }
        this.method2172();
    }

    @ObfuscatedName("cv.v()V")
    public void method2171() {
        if (this.field1808 != null) {
            return;
        }
        this.field1808 = new class100[this.field1807];
        for (int var1 = 0; var1 < this.field1807; var1++) {
            this.field1808[var1] = new class100();
        }
        for (int var2 = 0; var2 < this.field1771; var2++) {
            int var3 = this.field1769[var2];
            int var4 = this.field1796[var2];
            int var5 = this.field1799[var2];
            int var6 = this.field1765[var4] - this.field1765[var3];
            int var7 = this.field1766[var4] - this.field1766[var3];
            int var8 = this.field1767[var4] - this.field1767[var3];
            int var9 = this.field1765[var5] - this.field1765[var3];
            int var10 = this.field1766[var5] - this.field1766[var3];
            int var11 = this.field1767[var5] - this.field1767[var3];
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
            if (this.field1772 == null) {
                var19 = 0;
            } else {
                var19 = this.field1772[var2];
            }
            if (var19 == 0) {
                class100 var20 = this.field1808[var3];
                var20.field1699 += var16;
                var20.field1698 += var17;
                var20.field1703 += var18;
                var20.field1697++;
                class100 var21 = this.field1808[var4];
                var21.field1699 += var16;
                var21.field1698 += var17;
                var21.field1703 += var18;
                var21.field1697++;
                class100 var22 = this.field1808[var5];
                var22.field1699 += var16;
                var22.field1698 += var17;
                var22.field1703 += var18;
                var22.field1697++;
            } else if (var19 == 1) {
                if (this.field1798 == null) {
                    this.field1798 = new class88[this.field1771];
                }
                class88 var23 = this.field1798[var2] = new class88();
                var23.field1521 = var16;
                var23.field1522 = var17;
                var23.field1523 = var18;
            }
        }
    }

    @ObfuscatedName("cv.k()V")
    public void method2172() {
        this.field1808 = null;
        this.field1797 = null;
        this.field1798 = null;
        this.field1774 = false;
    }

    @ObfuscatedName("cv.n()V")
    public void method2162() {
        if (this.field1774) {
            return;
        }
        this.field1530 = 0;
        this.field1801 = 0;
        this.field1802 = 999999;
        this.field1803 = -999999;
        this.field1792 = -99999;
        this.field1805 = 99999;
        for (int var1 = 0; var1 < this.field1807; var1++) {
            int var2 = this.field1765[var1];
            int var3 = this.field1766[var1];
            int var4 = this.field1767[var1];
            if (var2 < this.field1802) {
                this.field1802 = var2;
            }
            if (var2 > this.field1803) {
                this.field1803 = var2;
            }
            if (var4 < this.field1805) {
                this.field1805 = var4;
            }
            if (var4 > this.field1792) {
                this.field1792 = var4;
            }
            if (-var3 > this.field1530) {
                this.field1530 = -var3;
            }
            if (var3 > this.field1801) {
                this.field1801 = var3;
            }
        }
        this.field1774 = true;
    }

    @ObfuscatedName("cv.d(Lcv;Lcv;IIIZ)V")
    public static void method2174(class104 arg0, class104 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2162();
        arg0.method2171();
        arg1.method2162();
        arg1.method2171();
        field1776++;
        int var6 = 0;
        int[] var7 = arg1.field1765;
        int var8 = arg1.field1807;
        for (int var9 = 0; var9 < arg0.field1807; var9++) {
            class100 var10 = arg0.field1808[var9];
            if (var10.field1697 != 0) {
                int var11 = arg0.field1766[var9] - arg3;
                if (var11 <= arg1.field1801) {
                    int var12 = arg0.field1765[var9] - arg2;
                    if (var12 >= arg1.field1802 && var12 <= arg1.field1803) {
                        int var13 = arg0.field1767[var9] - arg4;
                        if (var13 >= arg1.field1805 && var13 <= arg1.field1792) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class100 var15 = arg1.field1808[var14];
                                if (var7[var14] == var12 && arg1.field1767[var14] == var13 && arg1.field1766[var14] == var11 && var15.field1697 != 0) {
                                    if (arg0.field1797 == null) {
                                        arg0.field1797 = new class100[arg0.field1807];
                                    }
                                    if (arg1.field1797 == null) {
                                        arg1.field1797 = new class100[var8];
                                    }
                                    class100 var16 = arg0.field1797[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1797[var9] = new class100(var10);
                                    }
                                    class100 var17 = arg1.field1797[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1797[var14] = new class100(var15);
                                    }
                                    var16.field1699 += var15.field1699;
                                    var16.field1698 += var15.field1698;
                                    var16.field1703 += var15.field1703;
                                    var16.field1697 += var15.field1697;
                                    var17.field1699 += var10.field1699;
                                    var17.field1698 += var10.field1698;
                                    var17.field1703 += var10.field1703;
                                    var17.field1697 += var10.field1697;
                                    var6++;
                                    field1806[var9] = field1776;
                                    field1768[var14] = field1776;
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
        for (int var18 = 0; var18 < arg0.field1771; var18++) {
            if (field1806[arg0.field1769[var18]] == field1776 && field1806[arg0.field1796[var18]] == field1776 && field1806[arg0.field1799[var18]] == field1776) {
                if (arg0.field1772 == null) {
                    arg0.field1772 = new byte[arg0.field1771];
                }
                arg0.field1772[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1771; var19++) {
            if (field1768[arg1.field1769[var19]] == field1776 && field1768[arg1.field1796[var19]] == field1776 && field1768[arg1.field1799[var19]] == field1776) {
                if (arg1.field1772 == null) {
                    arg1.field1772 = new byte[arg1.field1771];
                }
                arg1.field1772[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cv.s(IIIII)Lds;")
    public final class109 method2175(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2171();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class109 var8 = new class109();
        var8.field1887 = new int[this.field1771];
        var8.field1877 = new int[this.field1771];
        var8.field1889 = new int[this.field1771];
        if (this.field1764 > 0 && this.field1779 != null) {
            int[] var9 = new int[this.field1764];
            for (int var10 = 0; var10 < this.field1771; var10++) {
                if (this.field1779[var10] != -1) {
                    var9[this.field1779[var10] & 0xFF]++;
                }
            }
            var8.field1895 = 0;
            for (int var11 = 0; var11 < this.field1764; var11++) {
                if (var9[var11] > 0 && this.field1782[var11] == 0) {
                    var8.field1895++;
                }
            }
            var8.field1896 = new int[var8.field1895];
            var8.field1926 = new int[var8.field1895];
            var8.field1928 = new int[var8.field1895];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1764; var13++) {
                if (var9[var13] > 0 && this.field1782[var13] == 0) {
                    var8.field1896[var12] = this.field1809[var13] & 0xFFFF;
                    var8.field1926[var12] = this.field1788[var13] & 0xFFFF;
                    var8.field1928[var12] = this.field1783[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1880 = new byte[this.field1771];
            for (int var14 = 0; var14 < this.field1771; var14++) {
                if (this.field1779[var14] == -1) {
                    var8.field1880[var14] = -1;
                } else {
                    var8.field1880[var14] = (byte) var9[this.field1779[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1771; var15++) {
            byte var16;
            if (this.field1772 == null) {
                var16 = 0;
            } else {
                var16 = this.field1772[var15];
            }
            byte var17;
            if (this.field1804 == null) {
                var17 = 0;
            } else {
                var17 = this.field1804[var15];
            }
            short var18;
            if (this.field1777 == null) {
                var18 = -1;
            } else {
                var18 = this.field1777[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1800[var15] & 0xFFFF;
                    class100 var20;
                    if (this.field1797 == null || this.field1797[this.field1769[var15]] == null) {
                        var20 = this.field1808[this.field1769[var15]];
                    } else {
                        var20 = this.field1797[this.field1769[var15]];
                    }
                    int var21 = (var20.field1703 * arg4 + var20.field1699 * arg2 + var20.field1698 * arg3) / (var20.field1697 * var7) + arg0;
                    var8.field1887[var15] = method2176(var19, var21);
                    class100 var22;
                    if (this.field1797 == null || this.field1797[this.field1796[var15]] == null) {
                        var22 = this.field1808[this.field1796[var15]];
                    } else {
                        var22 = this.field1797[this.field1796[var15]];
                    }
                    int var23 = (var22.field1703 * arg4 + var22.field1699 * arg2 + var22.field1698 * arg3) / (var22.field1697 * var7) + arg0;
                    var8.field1877[var15] = method2176(var19, var23);
                    class100 var24;
                    if (this.field1797 == null || this.field1797[this.field1799[var15]] == null) {
                        var24 = this.field1808[this.field1799[var15]];
                    } else {
                        var24 = this.field1797[this.field1799[var15]];
                    }
                    int var25 = (var24.field1703 * arg4 + var24.field1699 * arg2 + var24.field1698 * arg3) / (var24.field1697 * var7) + arg0;
                    var8.field1889[var15] = method2176(var19, var25);
                } else if (var16 == 1) {
                    class88 var26 = this.field1798[var15];
                    int var27 = (var26.field1523 * arg4 + var26.field1522 * arg3 + var26.field1521 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field1887[var15] = method2176(this.field1800[var15] & 0xFFFF, var27);
                    var8.field1889[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1887[var15] = 128;
                    var8.field1889[var15] = -1;
                } else {
                    var8.field1889[var15] = -2;
                }
            } else if (var16 == 0) {
                class100 var28;
                if (this.field1797 == null || this.field1797[this.field1769[var15]] == null) {
                    var28 = this.field1808[this.field1769[var15]];
                } else {
                    var28 = this.field1797[this.field1769[var15]];
                }
                int var29 = (var28.field1703 * arg4 + var28.field1699 * arg2 + var28.field1698 * arg3) / (var28.field1697 * var7) + arg0;
                var8.field1887[var15] = method2177(var29);
                class100 var30;
                if (this.field1797 == null || this.field1797[this.field1796[var15]] == null) {
                    var30 = this.field1808[this.field1796[var15]];
                } else {
                    var30 = this.field1797[this.field1796[var15]];
                }
                int var31 = (var30.field1703 * arg4 + var30.field1699 * arg2 + var30.field1698 * arg3) / (var30.field1697 * var7) + arg0;
                var8.field1877[var15] = method2177(var31);
                class100 var32;
                if (this.field1797 == null || this.field1797[this.field1799[var15]] == null) {
                    var32 = this.field1808[this.field1799[var15]];
                } else {
                    var32 = this.field1797[this.field1799[var15]];
                }
                int var33 = (var32.field1703 * arg4 + var32.field1699 * arg2 + var32.field1698 * arg3) / (var32.field1697 * var7) + arg0;
                var8.field1889[var15] = method2177(var33);
            } else if (var16 == 1) {
                class88 var34 = this.field1798[var15];
                int var35 = (var34.field1523 * arg4 + var34.field1522 * arg3 + var34.field1521 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field1887[var15] = method2177(var35);
                var8.field1889[var15] = -1;
            } else {
                var8.field1889[var15] = -2;
            }
        }
        this.method2161();
        var8.field1879 = this.field1807;
        var8.field1938 = this.field1765;
        var8.field1883 = this.field1766;
        var8.field1881 = this.field1767;
        var8.field1916 = this.field1771;
        var8.field1875 = this.field1769;
        var8.field1885 = this.field1796;
        var8.field1886 = this.field1799;
        var8.field1890 = this.field1773;
        var8.field1917 = this.field1804;
        var8.field1920 = this.field1778;
        var8.field1899 = this.field1793;
        var8.field1900 = this.field1794;
        var8.field1893 = this.field1777;
        return var8;
    }

    @ObfuscatedName("cv.ah(II)I")
    public static final int method2176(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cv.ak(I)I")
    public static final int method2177(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
