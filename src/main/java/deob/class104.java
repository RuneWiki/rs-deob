package deob;

@ObfuscatedName("cj")
public class class104 extends class89 {

    @ObfuscatedName("cj.m")
    public int field1764 = 0;

    @ObfuscatedName("cj.w")
    public int[] field1796;

    @ObfuscatedName("cj.e")
    public int[] field1766;

    @ObfuscatedName("cj.o")
    public int[] field1760;

    @ObfuscatedName("cj.g")
    public int field1790 = 0;

    @ObfuscatedName("cj.l")
    public int[] field1783;

    @ObfuscatedName("cj.j")
    public int[] field1794;

    @ObfuscatedName("cj.r")
    public int[] field1761;

    @ObfuscatedName("cj.x")
    public byte[] field1757;

    @ObfuscatedName("cj.k")
    public byte[] field1779;

    @ObfuscatedName("cj.v")
    public byte[] field1767;

    @ObfuscatedName("cj.h")
    public byte[] field1768;

    @ObfuscatedName("cj.u")
    public short[] field1769;

    @ObfuscatedName("cj.y")
    public short[] field1770;

    @ObfuscatedName("cj.p")
    public byte field1771 = 0;

    @ObfuscatedName("cj.s")
    public int field1772;

    @ObfuscatedName("cj.f")
    public byte[] field1773;

    @ObfuscatedName("cj.i")
    public short[] field1774;

    @ObfuscatedName("cj.d")
    public short[] field1775;

    @ObfuscatedName("cj.t")
    public short[] field1776;

    @ObfuscatedName("cj.c")
    public short[] field1778;

    @ObfuscatedName("cj.z")
    public short[] field1799;

    @ObfuscatedName("cj.n")
    public short[] field1763;

    @ObfuscatedName("cj.q")
    public short[] field1758;

    @ObfuscatedName("cj.a")
    public short[] field1781;

    @ObfuscatedName("cj.b")
    public short[] field1782;

    @ObfuscatedName("cj.aj")
    public byte[] field1777;

    @ObfuscatedName("cj.an")
    public int[] field1784;

    @ObfuscatedName("cj.ap")
    public int[] field1785;

    @ObfuscatedName("cj.ar")
    public int[][] field1786;

    @ObfuscatedName("cj.ab")
    public int[][] field1787;

    @ObfuscatedName("cj.ai")
    public class88[] field1765;

    @ObfuscatedName("cj.aa")
    public class100[] field1789;

    @ObfuscatedName("cj.ax")
    public class100[] field1802;

    @ObfuscatedName("cj.ad")
    public short field1791;

    @ObfuscatedName("cj.av")
    public short field1792;

    @ObfuscatedName("cj.aq")
    public boolean field1793 = false;

    @ObfuscatedName("cj.af")
    public int field1803;

    @ObfuscatedName("cj.at")
    public int field1795;

    @ObfuscatedName("cj.aw")
    public int field1759;

    @ObfuscatedName("cj.ay")
    public int field1797;

    @ObfuscatedName("cj.ah")
    public int field1788;

    @ObfuscatedName("cj.al")
    public static int[] field1762 = new int[10000];

    @ObfuscatedName("cj.as")
    public static int[] field1800 = new int[10000];

    @ObfuscatedName("cj.ac")
    public static int field1801 = 0;

    @ObfuscatedName("cj.ao")
    public static int[] field1780 = class95.field1661;

    @ObfuscatedName("cj.au")
    public static int[] field1798 = class95.field1662;

    public class104() {
    }

    @ObfuscatedName("cj.m(Lfa;II)Lcj;")
    public static class104 method2177(class171 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3086(arg1, arg2);
        return var3 == null ? null : new class104(var3);
    }

    public class104(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2145(arg0);
        } else {
            this.method2142(arg0);
        }
    }

    @ObfuscatedName("cj.w([B)V")
    public void method2145(byte[] arg0) {
        class123 var2 = new class123(arg0);
        class123 var3 = new class123(arg0);
        class123 var4 = new class123(arg0);
        class123 var5 = new class123(arg0);
        class123 var6 = new class123(arg0);
        class123 var7 = new class123(arg0);
        class123 var8 = new class123(arg0);
        var2.field2046 = arg0.length - 23;
        int var9 = var2.method2548();
        int var10 = var2.method2548();
        int var11 = var2.method2398();
        int var12 = var2.method2398();
        int var13 = var2.method2398();
        int var14 = var2.method2398();
        int var15 = var2.method2398();
        int var16 = var2.method2398();
        int var17 = var2.method2398();
        int var18 = var2.method2548();
        int var19 = var2.method2548();
        int var20 = var2.method2548();
        int var21 = var2.method2548();
        int var22 = var2.method2548();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1773 = new byte[var11];
            var2.field2046 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1773[var26] = var2.method2415();
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
        this.field1764 = var9;
        this.field1790 = var10;
        this.field1772 = var11;
        this.field1796 = new int[var9];
        this.field1766 = new int[var9];
        this.field1760 = new int[var9];
        this.field1783 = new int[var10];
        this.field1794 = new int[var10];
        this.field1761 = new int[var10];
        if (var17 == 1) {
            this.field1784 = new int[var9];
        }
        if (var12 == 1) {
            this.field1757 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1779 = new byte[var10];
        } else {
            this.field1771 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1767 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1785 = new int[var10];
        }
        if (var16 == 1) {
            this.field1770 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1768 = new byte[var10];
        }
        this.field1769 = new short[var10];
        if (var11 > 0) {
            this.field1774 = new short[var11];
            this.field1775 = new short[var11];
            this.field1776 = new short[var11];
            if (var24 > 0) {
                this.field1778 = new short[var24];
                this.field1799 = new short[var24];
                this.field1763 = new short[var24];
                this.field1758 = new short[var24];
                this.field1777 = new byte[var24];
                this.field1781 = new short[var24];
            }
            if (var25 > 0) {
                this.field1782 = new short[var25];
            }
        }
        var2.field2046 = var11;
        var3.field2046 = var44;
        var4.field2046 = var46;
        var5.field2046 = var48;
        var6.field2046 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2398();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2426();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2426();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2426();
            }
            this.field1796[var67] = var64 + var69;
            this.field1766[var67] = var65 + var70;
            this.field1760[var67] = var66 + var71;
            var64 = this.field1796[var67];
            var65 = this.field1766[var67];
            var66 = this.field1760[var67];
            if (var17 == 1) {
                this.field1784[var67] = var6.method2398();
            }
        }
        var2.field2046 = var42;
        var3.field2046 = var31;
        var4.field2046 = var34;
        var5.field2046 = var37;
        var6.field2046 = var35;
        var7.field2046 = var40;
        var8.field2046 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1769[var72] = (short) var2.method2548();
            if (var12 == 1) {
                this.field1757[var72] = var3.method2415();
            }
            if (var13 == 255) {
                this.field1779[var72] = var4.method2415();
            }
            if (var14 == 1) {
                this.field1767[var72] = var5.method2415();
            }
            if (var15 == 1) {
                this.field1785[var72] = var6.method2398();
            }
            if (var16 == 1) {
                this.field1770[var72] = (short) (var7.method2548() - 1);
            }
            if (this.field1768 != null && this.field1770[var72] != -1) {
                this.field1768[var72] = (byte) (var8.method2398() - 1);
            }
        }
        var2.field2046 = var33;
        var3.field2046 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2398();
            if (var78 == 1) {
                var73 = var2.method2426() + var76;
                var74 = var2.method2426() + var73;
                var75 = var2.method2426() + var74;
                var76 = var75;
                this.field1783[var77] = var73;
                this.field1794[var77] = var74;
                this.field1761[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2426() + var76;
                var76 = var75;
                this.field1783[var77] = var73;
                this.field1794[var77] = var74;
                this.field1761[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2426() + var76;
                var76 = var75;
                this.field1783[var77] = var73;
                this.field1794[var77] = var74;
                this.field1761[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2426() + var76;
                var76 = var75;
                this.field1783[var77] = var73;
                this.field1794[var77] = var81;
                this.field1761[var77] = var75;
            }
        }
        var2.field2046 = var50;
        var3.field2046 = var52;
        var4.field2046 = var54;
        var5.field2046 = var56;
        var6.field2046 = var58;
        var7.field2046 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1773[var82] & 0xFF;
            if (var83 == 0) {
                this.field1774[var82] = (short) var2.method2548();
                this.field1775[var82] = (short) var2.method2548();
                this.field1776[var82] = (short) var2.method2548();
            }
            if (var83 == 1) {
                this.field1774[var82] = (short) var3.method2548();
                this.field1775[var82] = (short) var3.method2548();
                this.field1776[var82] = (short) var3.method2548();
                this.field1778[var82] = (short) var4.method2548();
                this.field1799[var82] = (short) var4.method2548();
                this.field1763[var82] = (short) var4.method2548();
                this.field1758[var82] = (short) var5.method2548();
                this.field1777[var82] = var6.method2415();
                this.field1781[var82] = (short) var7.method2548();
            }
            if (var83 == 2) {
                this.field1774[var82] = (short) var3.method2548();
                this.field1775[var82] = (short) var3.method2548();
                this.field1776[var82] = (short) var3.method2548();
                this.field1778[var82] = (short) var4.method2548();
                this.field1799[var82] = (short) var4.method2548();
                this.field1763[var82] = (short) var4.method2548();
                this.field1758[var82] = (short) var5.method2548();
                this.field1777[var82] = var6.method2415();
                this.field1781[var82] = (short) var7.method2548();
                this.field1782[var82] = (short) var7.method2548();
            }
            if (var83 == 3) {
                this.field1774[var82] = (short) var3.method2548();
                this.field1775[var82] = (short) var3.method2548();
                this.field1776[var82] = (short) var3.method2548();
                this.field1778[var82] = (short) var4.method2548();
                this.field1799[var82] = (short) var4.method2548();
                this.field1763[var82] = (short) var4.method2548();
                this.field1758[var82] = (short) var5.method2548();
                this.field1777[var82] = var6.method2415();
                this.field1781[var82] = (short) var7.method2548();
            }
        }
        var2.field2046 = var62;
        int var84 = var2.method2398();
        if (var84 == 0) {
            return;
        }
        new class94();
        var2.method2548();
        var2.method2548();
        var2.method2548();
        var2.method2419();
    }

    @ObfuscatedName("cj.o([B)V")
    public void method2142(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class123 var4 = new class123(arg0);
        class123 var5 = new class123(arg0);
        class123 var6 = new class123(arg0);
        class123 var7 = new class123(arg0);
        class123 var8 = new class123(arg0);
        var4.field2046 = arg0.length - 18;
        int var9 = var4.method2548();
        int var10 = var4.method2548();
        int var11 = var4.method2398();
        int var12 = var4.method2398();
        int var13 = var4.method2398();
        int var14 = var4.method2398();
        int var15 = var4.method2398();
        int var16 = var4.method2398();
        int var17 = var4.method2548();
        int var18 = var4.method2548();
        int var19 = var4.method2548();
        int var20 = var4.method2548();
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
        this.field1764 = var9;
        this.field1790 = var10;
        this.field1772 = var11;
        this.field1796 = new int[var9];
        this.field1766 = new int[var9];
        this.field1760 = new int[var9];
        this.field1783 = new int[var10];
        this.field1794 = new int[var10];
        this.field1761 = new int[var10];
        if (var11 > 0) {
            this.field1773 = new byte[var11];
            this.field1774 = new short[var11];
            this.field1775 = new short[var11];
            this.field1776 = new short[var11];
        }
        if (var16 == 1) {
            this.field1784 = new int[var9];
        }
        if (var12 == 1) {
            this.field1757 = new byte[var10];
            this.field1768 = new byte[var10];
            this.field1770 = new short[var10];
        }
        if (var13 == 255) {
            this.field1779 = new byte[var10];
        } else {
            this.field1771 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1767 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1785 = new int[var10];
        }
        this.field1769 = new short[var10];
        var4.field2046 = var21;
        var5.field2046 = var36;
        var6.field2046 = var38;
        var7.field2046 = var40;
        var8.field2046 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2398();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2426();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2426();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2426();
            }
            this.field1796[var46] = var43 + var48;
            this.field1766[var46] = var44 + var49;
            this.field1760[var46] = var45 + var50;
            var43 = this.field1796[var46];
            var44 = this.field1766[var46];
            var45 = this.field1760[var46];
            if (var16 == 1) {
                this.field1784[var46] = var8.method2398();
            }
        }
        var4.field2046 = var32;
        var5.field2046 = var28;
        var6.field2046 = var26;
        var7.field2046 = var30;
        var8.field2046 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1769[var51] = (short) var4.method2548();
            if (var12 == 1) {
                int var52 = var5.method2398();
                if ((var52 & 0x1) == 1) {
                    this.field1757[var51] = 1;
                    var2 = true;
                } else {
                    this.field1757[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1768[var51] = (byte) (var52 >> 2);
                    this.field1770[var51] = this.field1769[var51];
                    this.field1769[var51] = 127;
                    if (this.field1770[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1768[var51] = -1;
                    this.field1770[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1779[var51] = var6.method2415();
            }
            if (var14 == 1) {
                this.field1767[var51] = var7.method2415();
            }
            if (var15 == 1) {
                this.field1785[var51] = var8.method2398();
            }
        }
        var4.field2046 = var25;
        var5.field2046 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2398();
            if (var58 == 1) {
                var53 = var4.method2426() + var56;
                var54 = var4.method2426() + var53;
                var55 = var4.method2426() + var54;
                var56 = var55;
                this.field1783[var57] = var53;
                this.field1794[var57] = var54;
                this.field1761[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2426() + var56;
                var56 = var55;
                this.field1783[var57] = var53;
                this.field1794[var57] = var54;
                this.field1761[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2426() + var56;
                var56 = var55;
                this.field1783[var57] = var53;
                this.field1794[var57] = var54;
                this.field1761[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2426() + var56;
                var56 = var55;
                this.field1783[var57] = var53;
                this.field1794[var57] = var61;
                this.field1761[var57] = var55;
            }
        }
        var4.field2046 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1773[var62] = 0;
            this.field1774[var62] = (short) var4.method2548();
            this.field1775[var62] = (short) var4.method2548();
            this.field1776[var62] = (short) var4.method2548();
        }
        if (this.field1768 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1768[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1774[var65] & 0xFFFF) == this.field1783[var64] && (this.field1775[var65] & 0xFFFF) == this.field1794[var64] && (this.field1776[var65] & 0xFFFF) == this.field1761[var64]) {
                        this.field1768[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1768 = null;
            }
        }
        if (!var3) {
            this.field1770 = null;
        }
        if (!var2) {
            this.field1757 = null;
        }
    }

    public class104(class104[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1764 = 0;
        this.field1790 = 0;
        this.field1772 = 0;
        this.field1771 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class104 var10 = arg0[var9];
            if (var10 != null) {
                this.field1764 += var10.field1764;
                this.field1790 += var10.field1790;
                this.field1772 += var10.field1772;
                if (var10.field1779 == null) {
                    if (this.field1771 == -1) {
                        this.field1771 = var10.field1771;
                    }
                    if (this.field1771 != var10.field1771) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1757 != null;
                var5 |= var10.field1767 != null;
                var6 |= var10.field1785 != null;
                var7 |= var10.field1770 != null;
                var8 |= var10.field1768 != null;
            }
        }
        this.field1796 = new int[this.field1764];
        this.field1766 = new int[this.field1764];
        this.field1760 = new int[this.field1764];
        this.field1784 = new int[this.field1764];
        this.field1783 = new int[this.field1790];
        this.field1794 = new int[this.field1790];
        this.field1761 = new int[this.field1790];
        if (var3) {
            this.field1757 = new byte[this.field1790];
        }
        if (var4) {
            this.field1779 = new byte[this.field1790];
        }
        if (var5) {
            this.field1767 = new byte[this.field1790];
        }
        if (var6) {
            this.field1785 = new int[this.field1790];
        }
        if (var7) {
            this.field1770 = new short[this.field1790];
        }
        if (var8) {
            this.field1768 = new byte[this.field1790];
        }
        this.field1769 = new short[this.field1790];
        if (this.field1772 > 0) {
            this.field1773 = new byte[this.field1772];
            this.field1774 = new short[this.field1772];
            this.field1775 = new short[this.field1772];
            this.field1776 = new short[this.field1772];
            this.field1778 = new short[this.field1772];
            this.field1799 = new short[this.field1772];
            this.field1763 = new short[this.field1772];
            this.field1758 = new short[this.field1772];
            this.field1777 = new byte[this.field1772];
            this.field1781 = new short[this.field1772];
            this.field1782 = new short[this.field1772];
        }
        this.field1764 = 0;
        this.field1790 = 0;
        this.field1772 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class104 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1790; var13++) {
                    if (var3 && var12.field1757 != null) {
                        this.field1757[this.field1790] = var12.field1757[var13];
                    }
                    if (var4) {
                        if (var12.field1779 == null) {
                            this.field1779[this.field1790] = var12.field1771;
                        } else {
                            this.field1779[this.field1790] = var12.field1779[var13];
                        }
                    }
                    if (var5 && var12.field1767 != null) {
                        this.field1767[this.field1790] = var12.field1767[var13];
                    }
                    if (var6 && var12.field1785 != null) {
                        this.field1785[this.field1790] = var12.field1785[var13];
                    }
                    if (var7) {
                        if (var12.field1770 == null) {
                            this.field1770[this.field1790] = -1;
                        } else {
                            this.field1770[this.field1790] = var12.field1770[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1768 == null || var12.field1768[var13] == -1) {
                            this.field1768[this.field1790] = -1;
                        } else {
                            this.field1768[this.field1790] = (byte) (var12.field1768[var13] + this.field1772);
                        }
                    }
                    this.field1769[this.field1790] = var12.field1769[var13];
                    this.field1783[this.field1790] = this.method2170(var12, var12.field1783[var13]);
                    this.field1794[this.field1790] = this.method2170(var12, var12.field1794[var13]);
                    this.field1761[this.field1790] = this.method2170(var12, var12.field1761[var13]);
                    this.field1790++;
                }
                for (int var14 = 0; var14 < var12.field1772; var14++) {
                    byte var15 = this.field1773[this.field1772] = var12.field1773[var14];
                    if (var15 == 0) {
                        this.field1774[this.field1772] = (short) this.method2170(var12, var12.field1774[var14]);
                        this.field1775[this.field1772] = (short) this.method2170(var12, var12.field1775[var14]);
                        this.field1776[this.field1772] = (short) this.method2170(var12, var12.field1776[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1774[this.field1772] = var12.field1774[var14];
                        this.field1775[this.field1772] = var12.field1775[var14];
                        this.field1776[this.field1772] = var12.field1776[var14];
                        this.field1778[this.field1772] = var12.field1778[var14];
                        this.field1799[this.field1772] = var12.field1799[var14];
                        this.field1763[this.field1772] = var12.field1763[var14];
                        this.field1758[this.field1772] = var12.field1758[var14];
                        this.field1777[this.field1772] = var12.field1777[var14];
                        this.field1781[this.field1772] = var12.field1781[var14];
                    }
                    if (var15 == 2) {
                        this.field1782[this.field1772] = var12.field1782[var14];
                    }
                    this.field1772++;
                }
            }
        }
    }

    @ObfuscatedName("cj.g(Lcj;I)I")
    public final int method2170(class104 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1796[arg1];
        int var5 = arg0.field1766[arg1];
        int var6 = arg0.field1760[arg1];
        for (int var7 = 0; var7 < this.field1764; var7++) {
            if (this.field1796[var7] == var4 && this.field1766[var7] == var5 && this.field1760[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1796[this.field1764] = var4;
            this.field1766[this.field1764] = var5;
            this.field1760[this.field1764] = var6;
            if (arg0.field1784 != null) {
                this.field1784[this.field1764] = arg0.field1784[arg1];
            }
            var3 = this.field1764++;
        }
        return var3;
    }

    public class104(class104 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1764 = arg0.field1764;
        this.field1790 = arg0.field1790;
        this.field1772 = arg0.field1772;
        if (arg1) {
            this.field1796 = arg0.field1796;
            this.field1766 = arg0.field1766;
            this.field1760 = arg0.field1760;
        } else {
            this.field1796 = new int[this.field1764];
            this.field1766 = new int[this.field1764];
            this.field1760 = new int[this.field1764];
            for (int var6 = 0; var6 < this.field1764; var6++) {
                this.field1796[var6] = arg0.field1796[var6];
                this.field1766[var6] = arg0.field1766[var6];
                this.field1760[var6] = arg0.field1760[var6];
            }
        }
        if (arg2) {
            this.field1769 = arg0.field1769;
        } else {
            this.field1769 = new short[this.field1790];
            for (int var7 = 0; var7 < this.field1790; var7++) {
                this.field1769[var7] = arg0.field1769[var7];
            }
        }
        if (arg3 || arg0.field1770 == null) {
            this.field1770 = arg0.field1770;
        } else {
            this.field1770 = new short[this.field1790];
            for (int var8 = 0; var8 < this.field1790; var8++) {
                this.field1770[var8] = arg0.field1770[var8];
            }
        }
        if (arg4) {
            this.field1767 = arg0.field1767;
        } else {
            this.field1767 = new byte[this.field1790];
            if (arg0.field1767 == null) {
                for (int var9 = 0; var9 < this.field1790; var9++) {
                    this.field1767[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1790; var10++) {
                    this.field1767[var10] = arg0.field1767[var10];
                }
            }
        }
        this.field1783 = arg0.field1783;
        this.field1794 = arg0.field1794;
        this.field1761 = arg0.field1761;
        this.field1757 = arg0.field1757;
        this.field1779 = arg0.field1779;
        this.field1768 = arg0.field1768;
        this.field1771 = arg0.field1771;
        this.field1773 = arg0.field1773;
        this.field1774 = arg0.field1774;
        this.field1775 = arg0.field1775;
        this.field1776 = arg0.field1776;
        this.field1778 = arg0.field1778;
        this.field1799 = arg0.field1799;
        this.field1763 = arg0.field1763;
        this.field1758 = arg0.field1758;
        this.field1777 = arg0.field1777;
        this.field1781 = arg0.field1781;
        this.field1782 = arg0.field1782;
        this.field1784 = arg0.field1784;
        this.field1785 = arg0.field1785;
        this.field1786 = arg0.field1786;
        this.field1787 = arg0.field1787;
        this.field1789 = arg0.field1789;
        this.field1765 = arg0.field1765;
        this.field1802 = arg0.field1802;
        this.field1791 = arg0.field1791;
        this.field1792 = arg0.field1792;
    }

    @ObfuscatedName("cj.l()Lcj;")
    public class104 method2144() {
        class104 var1 = new class104();
        if (this.field1757 != null) {
            var1.field1757 = new byte[this.field1790];
            for (int var2 = 0; var2 < this.field1790; var2++) {
                var1.field1757[var2] = this.field1757[var2];
            }
        }
        var1.field1764 = this.field1764;
        var1.field1790 = this.field1790;
        var1.field1772 = this.field1772;
        var1.field1796 = this.field1796;
        var1.field1766 = this.field1766;
        var1.field1760 = this.field1760;
        var1.field1783 = this.field1783;
        var1.field1794 = this.field1794;
        var1.field1761 = this.field1761;
        var1.field1779 = this.field1779;
        var1.field1767 = this.field1767;
        var1.field1768 = this.field1768;
        var1.field1769 = this.field1769;
        var1.field1770 = this.field1770;
        var1.field1771 = this.field1771;
        var1.field1773 = this.field1773;
        var1.field1774 = this.field1774;
        var1.field1775 = this.field1775;
        var1.field1776 = this.field1776;
        var1.field1778 = this.field1778;
        var1.field1799 = this.field1799;
        var1.field1763 = this.field1763;
        var1.field1758 = this.field1758;
        var1.field1777 = this.field1777;
        var1.field1781 = this.field1781;
        var1.field1782 = this.field1782;
        var1.field1784 = this.field1784;
        var1.field1785 = this.field1785;
        var1.field1786 = this.field1786;
        var1.field1787 = this.field1787;
        var1.field1789 = this.field1789;
        var1.field1765 = this.field1765;
        var1.field1791 = this.field1791;
        var1.field1792 = this.field1792;
        return var1;
    }

    @ObfuscatedName("cj.j([[IIIIZI)Lcj;")
    public class104 method2208(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2157();
        int var7 = this.field1795 + arg1;
        int var8 = this.field1759 + arg1;
        int var9 = this.field1788 + arg3;
        int var10 = this.field1797 + arg3;
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
            var15.field1764 = this.field1764;
            var15.field1790 = this.field1790;
            var15.field1772 = this.field1772;
            var15.field1796 = this.field1796;
            var15.field1760 = this.field1760;
            var15.field1783 = this.field1783;
            var15.field1794 = this.field1794;
            var15.field1761 = this.field1761;
            var15.field1757 = this.field1757;
            var15.field1779 = this.field1779;
            var15.field1767 = this.field1767;
            var15.field1768 = this.field1768;
            var15.field1769 = this.field1769;
            var15.field1770 = this.field1770;
            var15.field1771 = this.field1771;
            var15.field1773 = this.field1773;
            var15.field1774 = this.field1774;
            var15.field1775 = this.field1775;
            var15.field1776 = this.field1776;
            var15.field1778 = this.field1778;
            var15.field1799 = this.field1799;
            var15.field1763 = this.field1763;
            var15.field1758 = this.field1758;
            var15.field1777 = this.field1777;
            var15.field1781 = this.field1781;
            var15.field1782 = this.field1782;
            var15.field1784 = this.field1784;
            var15.field1785 = this.field1785;
            var15.field1786 = this.field1786;
            var15.field1787 = this.field1787;
            var15.field1791 = this.field1791;
            var15.field1792 = this.field1792;
            var15.field1766 = new int[var15.field1764];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1764; var16++) {
                int var17 = this.field1796[var16] + arg1;
                int var18 = this.field1760[var16] + arg3;
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
            for (int var26 = 0; var26 < var15.field1764; var26++) {
                int var27 = (-this.field1766[var26] << 16) / this.field1537;
                if (var27 < arg5) {
                    int var28 = this.field1796[var26] + arg1;
                    int var29 = this.field1760[var26] + arg3;
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
        var15.method2204();
        return var15;
    }

    @ObfuscatedName("cj.r()V")
    public void method2146() {
        int var10002;
        if (this.field1784 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1764; var3++) {
                int var4 = this.field1784[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1786 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1786[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1764) {
                int var7 = this.field1784[var6];
                this.field1786[var7][var1[var7]++] = var6++;
            }
            this.field1784 = null;
        }
        if (this.field1785 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1790; var10++) {
            int var11 = this.field1785[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1787 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1787[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1790) {
            int var14 = this.field1785[var13];
            this.field1787[var14][var8[var14]++] = var13++;
        }
        this.field1785 = null;
    }

    @ObfuscatedName("cj.x()V")
    public void method2140() {
        for (int var1 = 0; var1 < this.field1764; var1++) {
            int var2 = this.field1796[var1];
            this.field1796[var1] = this.field1760[var1];
            this.field1760[var1] = -var2;
        }
        this.method2204();
    }

    @ObfuscatedName("cj.y()V")
    public void method2148() {
        for (int var1 = 0; var1 < this.field1764; var1++) {
            this.field1796[var1] = -this.field1796[var1];
            this.field1760[var1] = -this.field1760[var1];
        }
        this.method2204();
    }

    @ObfuscatedName("cj.p()V")
    public void method2141() {
        for (int var1 = 0; var1 < this.field1764; var1++) {
            int var2 = this.field1760[var1];
            this.field1760[var1] = this.field1796[var1];
            this.field1796[var1] = -var2;
        }
        this.method2204();
    }

    @ObfuscatedName("cj.s(I)V")
    public void method2150(int arg0) {
        int var2 = field1780[arg0];
        int var3 = field1798[arg0];
        for (int var4 = 0; var4 < this.field1764; var4++) {
            int var5 = this.field1796[var4] * var3 + this.field1760[var4] * var2 >> 16;
            this.field1760[var4] = this.field1760[var4] * var3 - this.field1796[var4] * var2 >> 16;
            this.field1796[var4] = var5;
        }
        this.method2204();
    }

    @ObfuscatedName("cj.f(III)V")
    public void method2168(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1764; var4++) {
            this.field1796[var4] += arg0;
            this.field1766[var4] += arg1;
            this.field1760[var4] += arg2;
        }
        this.method2204();
    }

    @ObfuscatedName("cj.i(SS)V")
    public void method2171(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1790; var3++) {
            if (this.field1769[var3] == arg0) {
                this.field1769[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cj.d(SS)V")
    public void method2152(short arg0, short arg1) {
        if (this.field1770 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1790; var3++) {
            if (this.field1770[var3] == arg0) {
                this.field1770[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cj.t()V")
    public void method2153() {
        for (int var1 = 0; var1 < this.field1764; var1++) {
            this.field1760[var1] = -this.field1760[var1];
        }
        for (int var2 = 0; var2 < this.field1790; var2++) {
            int var3 = this.field1783[var2];
            this.field1783[var2] = this.field1761[var2];
            this.field1761[var2] = var3;
        }
        this.method2204();
    }

    @ObfuscatedName("cj.c(III)V")
    public void method2202(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1764; var4++) {
            this.field1796[var4] = this.field1796[var4] * arg0 / 128;
            this.field1766[var4] = this.field1766[var4] * arg1 / 128;
            this.field1760[var4] = this.field1760[var4] * arg2 / 128;
        }
        this.method2204();
    }

    @ObfuscatedName("cj.z()V")
    public void method2155() {
        if (this.field1789 != null) {
            return;
        }
        this.field1789 = new class100[this.field1764];
        for (int var1 = 0; var1 < this.field1764; var1++) {
            this.field1789[var1] = new class100();
        }
        for (int var2 = 0; var2 < this.field1790; var2++) {
            int var3 = this.field1783[var2];
            int var4 = this.field1794[var2];
            int var5 = this.field1761[var2];
            int var6 = this.field1796[var4] - this.field1796[var3];
            int var7 = this.field1766[var4] - this.field1766[var3];
            int var8 = this.field1760[var4] - this.field1760[var3];
            int var9 = this.field1796[var5] - this.field1796[var3];
            int var10 = this.field1766[var5] - this.field1766[var3];
            int var11 = this.field1760[var5] - this.field1760[var3];
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
            if (this.field1757 == null) {
                var19 = 0;
            } else {
                var19 = this.field1757[var2];
            }
            if (var19 == 0) {
                class100 var20 = this.field1789[var3];
                var20.field1705 += var16;
                var20.field1702 += var17;
                var20.field1701 += var18;
                var20.field1704++;
                class100 var21 = this.field1789[var4];
                var21.field1705 += var16;
                var21.field1702 += var17;
                var21.field1701 += var18;
                var21.field1704++;
                class100 var22 = this.field1789[var5];
                var22.field1705 += var16;
                var22.field1702 += var17;
                var22.field1701 += var18;
                var22.field1704++;
            } else if (var19 == 1) {
                if (this.field1765 == null) {
                    this.field1765 = new class88[this.field1790];
                }
                class88 var23 = this.field1765[var2] = new class88();
                var23.field1535 = var16;
                var23.field1529 = var17;
                var23.field1530 = var18;
            }
        }
    }

    @ObfuscatedName("cj.n()V")
    public void method2204() {
        this.field1789 = null;
        this.field1802 = null;
        this.field1765 = null;
        this.field1793 = false;
    }

    @ObfuscatedName("cj.q()V")
    public void method2157() {
        if (this.field1793) {
            return;
        }
        this.field1537 = 0;
        this.field1803 = 0;
        this.field1795 = 999999;
        this.field1759 = -999999;
        this.field1797 = -99999;
        this.field1788 = 99999;
        for (int var1 = 0; var1 < this.field1764; var1++) {
            int var2 = this.field1796[var1];
            int var3 = this.field1766[var1];
            int var4 = this.field1760[var1];
            if (var2 < this.field1795) {
                this.field1795 = var2;
            }
            if (var2 > this.field1759) {
                this.field1759 = var2;
            }
            if (var4 < this.field1788) {
                this.field1788 = var4;
            }
            if (var4 > this.field1797) {
                this.field1797 = var4;
            }
            if (-var3 > this.field1537) {
                this.field1537 = -var3;
            }
            if (var3 > this.field1803) {
                this.field1803 = var3;
            }
        }
        this.field1793 = true;
    }

    @ObfuscatedName("cj.a(Lcj;Lcj;IIIZ)V")
    public static void method2158(class104 arg0, class104 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2157();
        arg0.method2155();
        arg1.method2157();
        arg1.method2155();
        field1801++;
        int var6 = 0;
        int[] var7 = arg1.field1796;
        int var8 = arg1.field1764;
        for (int var9 = 0; var9 < arg0.field1764; var9++) {
            class100 var10 = arg0.field1789[var9];
            if (var10.field1704 != 0) {
                int var11 = arg0.field1766[var9] - arg3;
                if (var11 <= arg1.field1803) {
                    int var12 = arg0.field1796[var9] - arg2;
                    if (var12 >= arg1.field1795 && var12 <= arg1.field1759) {
                        int var13 = arg0.field1760[var9] - arg4;
                        if (var13 >= arg1.field1788 && var13 <= arg1.field1797) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class100 var15 = arg1.field1789[var14];
                                if (var7[var14] == var12 && arg1.field1760[var14] == var13 && arg1.field1766[var14] == var11 && var15.field1704 != 0) {
                                    if (arg0.field1802 == null) {
                                        arg0.field1802 = new class100[arg0.field1764];
                                    }
                                    if (arg1.field1802 == null) {
                                        arg1.field1802 = new class100[var8];
                                    }
                                    class100 var16 = arg0.field1802[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1802[var9] = new class100(var10);
                                    }
                                    class100 var17 = arg1.field1802[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1802[var14] = new class100(var15);
                                    }
                                    var16.field1705 += var15.field1705;
                                    var16.field1702 += var15.field1702;
                                    var16.field1701 += var15.field1701;
                                    var16.field1704 += var15.field1704;
                                    var17.field1705 += var10.field1705;
                                    var17.field1702 += var10.field1702;
                                    var17.field1701 += var10.field1701;
                                    var17.field1704 += var10.field1704;
                                    var6++;
                                    field1762[var9] = field1801;
                                    field1800[var14] = field1801;
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
        for (int var18 = 0; var18 < arg0.field1790; var18++) {
            if (field1762[arg0.field1783[var18]] == field1801 && field1762[arg0.field1794[var18]] == field1801 && field1762[arg0.field1761[var18]] == field1801) {
                if (arg0.field1757 == null) {
                    arg0.field1757 = new byte[arg0.field1790];
                }
                arg0.field1757[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1790; var19++) {
            if (field1800[arg1.field1783[var19]] == field1801 && field1800[arg1.field1794[var19]] == field1801 && field1800[arg1.field1761[var19]] == field1801) {
                if (arg1.field1757 == null) {
                    arg1.field1757 = new byte[arg1.field1790];
                }
                arg1.field1757[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cj.b(IIIII)Ldg;")
    public final class109 method2159(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2155();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class109 var8 = new class109();
        var8.field1898 = new int[this.field1790];
        var8.field1874 = new int[this.field1790];
        var8.field1876 = new int[this.field1790];
        if (this.field1772 > 0 && this.field1768 != null) {
            int[] var9 = new int[this.field1772];
            for (int var10 = 0; var10 < this.field1790; var10++) {
                if (this.field1768[var10] != -1) {
                    var9[this.field1768[var10] & 0xFF]++;
                }
            }
            var8.field1907 = 0;
            for (int var11 = 0; var11 < this.field1772; var11++) {
                if (var9[var11] > 0 && this.field1773[var11] == 0) {
                    var8.field1907++;
                }
            }
            var8.field1891 = new int[var8.field1907];
            var8.field1888 = new int[var8.field1907];
            var8.field1885 = new int[var8.field1907];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1772; var13++) {
                if (var9[var13] > 0 && this.field1773[var13] == 0) {
                    var8.field1891[var12] = this.field1774[var13] & 0xFFFF;
                    var8.field1888[var12] = this.field1775[var13] & 0xFFFF;
                    var8.field1885[var12] = this.field1776[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1879 = new byte[this.field1790];
            for (int var14 = 0; var14 < this.field1790; var14++) {
                if (this.field1768[var14] == -1) {
                    var8.field1879[var14] = -1;
                } else {
                    var8.field1879[var14] = (byte) var9[this.field1768[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1790; var15++) {
            byte var16;
            if (this.field1757 == null) {
                var16 = 0;
            } else {
                var16 = this.field1757[var15];
            }
            byte var17;
            if (this.field1767 == null) {
                var17 = 0;
            } else {
                var17 = this.field1767[var15];
            }
            short var18;
            if (this.field1770 == null) {
                var18 = -1;
            } else {
                var18 = this.field1770[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1769[var15] & 0xFFFF;
                    class100 var20;
                    if (this.field1802 == null || this.field1802[this.field1783[var15]] == null) {
                        var20 = this.field1789[this.field1783[var15]];
                    } else {
                        var20 = this.field1802[this.field1783[var15]];
                    }
                    int var21 = (var20.field1701 * arg4 + var20.field1705 * arg2 + var20.field1702 * arg3) / (var20.field1704 * var7) + arg0;
                    var8.field1898[var15] = method2160(var19, var21);
                    class100 var22;
                    if (this.field1802 == null || this.field1802[this.field1794[var15]] == null) {
                        var22 = this.field1789[this.field1794[var15]];
                    } else {
                        var22 = this.field1802[this.field1794[var15]];
                    }
                    int var23 = (var22.field1701 * arg4 + var22.field1705 * arg2 + var22.field1702 * arg3) / (var22.field1704 * var7) + arg0;
                    var8.field1874[var15] = method2160(var19, var23);
                    class100 var24;
                    if (this.field1802 == null || this.field1802[this.field1761[var15]] == null) {
                        var24 = this.field1789[this.field1761[var15]];
                    } else {
                        var24 = this.field1802[this.field1761[var15]];
                    }
                    int var25 = (var24.field1701 * arg4 + var24.field1705 * arg2 + var24.field1702 * arg3) / (var24.field1704 * var7) + arg0;
                    var8.field1876[var15] = method2160(var19, var25);
                } else if (var16 == 1) {
                    class88 var26 = this.field1765[var15];
                    int var27 = (var26.field1530 * arg4 + var26.field1535 * arg2 + var26.field1529 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1898[var15] = method2160(this.field1769[var15] & 0xFFFF, var27);
                    var8.field1876[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1898[var15] = 128;
                    var8.field1876[var15] = -1;
                } else {
                    var8.field1876[var15] = -2;
                }
            } else if (var16 == 0) {
                class100 var28;
                if (this.field1802 == null || this.field1802[this.field1783[var15]] == null) {
                    var28 = this.field1789[this.field1783[var15]];
                } else {
                    var28 = this.field1802[this.field1783[var15]];
                }
                int var29 = (var28.field1701 * arg4 + var28.field1705 * arg2 + var28.field1702 * arg3) / (var28.field1704 * var7) + arg0;
                var8.field1898[var15] = method2161(var29);
                class100 var30;
                if (this.field1802 == null || this.field1802[this.field1794[var15]] == null) {
                    var30 = this.field1789[this.field1794[var15]];
                } else {
                    var30 = this.field1802[this.field1794[var15]];
                }
                int var31 = (var30.field1701 * arg4 + var30.field1705 * arg2 + var30.field1702 * arg3) / (var30.field1704 * var7) + arg0;
                var8.field1874[var15] = method2161(var31);
                class100 var32;
                if (this.field1802 == null || this.field1802[this.field1761[var15]] == null) {
                    var32 = this.field1789[this.field1761[var15]];
                } else {
                    var32 = this.field1802[this.field1761[var15]];
                }
                int var33 = (var32.field1701 * arg4 + var32.field1705 * arg2 + var32.field1702 * arg3) / (var32.field1704 * var7) + arg0;
                var8.field1876[var15] = method2161(var33);
            } else if (var16 == 1) {
                class88 var34 = this.field1765[var15];
                int var35 = (var34.field1530 * arg4 + var34.field1535 * arg2 + var34.field1529 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1898[var15] = method2161(var35);
                var8.field1876[var15] = -1;
            } else {
                var8.field1876[var15] = -2;
            }
        }
        this.method2146();
        var8.field1880 = this.field1764;
        var8.field1922 = this.field1796;
        var8.field1868 = this.field1766;
        var8.field1869 = this.field1760;
        var8.field1870 = this.field1790;
        var8.field1871 = this.field1783;
        var8.field1872 = this.field1794;
        var8.field1873 = this.field1761;
        var8.field1877 = this.field1779;
        var8.field1878 = this.field1767;
        var8.field1881 = this.field1771;
        var8.field1886 = this.field1786;
        var8.field1892 = this.field1787;
        var8.field1887 = this.field1770;
        return var8;
    }

    @ObfuscatedName("cj.aj(II)I")
    public static final int method2160(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cj.an(I)I")
    public static final int method2161(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
