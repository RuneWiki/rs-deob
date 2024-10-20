package deob;

@ObfuscatedName("cr")
public class class104 extends class89 {

    @ObfuscatedName("cr.k")
    public int field1762 = 0;

    @ObfuscatedName("cr.q")
    public int[] field1748;

    @ObfuscatedName("cr.f")
    public int[] field1749;

    @ObfuscatedName("cr.c")
    public int[] field1750;

    @ObfuscatedName("cr.v")
    public int field1768 = 0;

    @ObfuscatedName("cr.j")
    public int[] field1752;

    @ObfuscatedName("cr.m")
    public int[] field1753;

    @ObfuscatedName("cr.y")
    public int[] field1754;

    @ObfuscatedName("cr.u")
    public byte[] field1781;

    @ObfuscatedName("cr.h")
    public byte[] field1756;

    @ObfuscatedName("cr.l")
    public byte[] field1757;

    @ObfuscatedName("cr.b")
    public byte[] field1783;

    @ObfuscatedName("cr.g")
    public short[] field1759;

    @ObfuscatedName("cr.e")
    public short[] field1751;

    @ObfuscatedName("cr.p")
    public byte field1776 = 0;

    @ObfuscatedName("cr.s")
    public int field1786;

    @ObfuscatedName("cr.w")
    public byte[] field1763;

    @ObfuscatedName("cr.i")
    public short[] field1764;

    @ObfuscatedName("cr.r")
    public short[] field1785;

    @ObfuscatedName("cr.a")
    public short[] field1766;

    @ObfuscatedName("cr.n")
    public short[] field1760;

    @ObfuscatedName("cr.z")
    public short[] field1767;

    @ObfuscatedName("cr.x")
    public short[] field1778;

    @ObfuscatedName("cr.d")
    public short[] field1770;

    @ObfuscatedName("cr.t")
    public short[] field1771;

    @ObfuscatedName("cr.o")
    public short[] field1772;

    @ObfuscatedName("cr.aq")
    public byte[] field1761;

    @ObfuscatedName("cr.al")
    public int[] field1774;

    @ObfuscatedName("cr.av")
    public int[] field1775;

    @ObfuscatedName("cr.ad")
    public int[][] field1773;

    @ObfuscatedName("cr.at")
    public int[][] field1777;

    @ObfuscatedName("cr.aj")
    public class88[] field1758;

    @ObfuscatedName("cr.am")
    public class100[] field1779;

    @ObfuscatedName("cr.ay")
    public class100[] field1782;

    @ObfuscatedName("cr.ag")
    public short field1780;

    @ObfuscatedName("cr.aa")
    public short field1792;

    @ObfuscatedName("cr.ak")
    public boolean field1769 = false;

    @ObfuscatedName("cr.ar")
    public int field1784;

    @ObfuscatedName("cr.ax")
    public int field1755;

    @ObfuscatedName("cr.ap")
    public int field1747;

    @ObfuscatedName("cr.ao")
    public int field1787;

    @ObfuscatedName("cr.aw")
    public int field1788;

    @ObfuscatedName("cr.ai")
    public static int[] field1789 = new int[10000];

    @ObfuscatedName("cr.af")
    public static int[] field1790 = new int[10000];

    @ObfuscatedName("cr.an")
    public static int field1791 = 0;

    @ObfuscatedName("cr.au")
    public static int[] field1765 = class95.field1651;

    @ObfuscatedName("cr.ac")
    public static int[] field1793 = class95.field1652;

    public class104() {
    }

    @ObfuscatedName("cr.k(Lfo;II)Lcr;")
    public static class104 method2141(class171 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3097(arg1, arg2);
        return var3 == null ? null : new class104(var3);
    }

    public class104(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2175(arg0);
        } else {
            this.method2217(arg0);
        }
    }

    @ObfuscatedName("cr.q([B)V")
    public void method2175(byte[] arg0) {
        class123 var2 = new class123(arg0);
        class123 var3 = new class123(arg0);
        class123 var4 = new class123(arg0);
        class123 var5 = new class123(arg0);
        class123 var6 = new class123(arg0);
        class123 var7 = new class123(arg0);
        class123 var8 = new class123(arg0);
        var2.field2060 = arg0.length - 23;
        int var9 = var2.method2547();
        int var10 = var2.method2547();
        int var11 = var2.method2427();
        int var12 = var2.method2427();
        int var13 = var2.method2427();
        int var14 = var2.method2427();
        int var15 = var2.method2427();
        int var16 = var2.method2427();
        int var17 = var2.method2427();
        int var18 = var2.method2547();
        int var19 = var2.method2547();
        int var20 = var2.method2547();
        int var21 = var2.method2547();
        int var22 = var2.method2547();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1763 = new byte[var11];
            var2.field2060 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1763[var26] = var2.method2428();
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
        this.field1762 = var9;
        this.field1768 = var10;
        this.field1786 = var11;
        this.field1748 = new int[var9];
        this.field1749 = new int[var9];
        this.field1750 = new int[var9];
        this.field1752 = new int[var10];
        this.field1753 = new int[var10];
        this.field1754 = new int[var10];
        if (var17 == 1) {
            this.field1774 = new int[var9];
        }
        if (var12 == 1) {
            this.field1781 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1756 = new byte[var10];
        } else {
            this.field1776 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1757 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1775 = new int[var10];
        }
        if (var16 == 1) {
            this.field1751 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1783 = new byte[var10];
        }
        this.field1759 = new short[var10];
        if (var11 > 0) {
            this.field1764 = new short[var11];
            this.field1785 = new short[var11];
            this.field1766 = new short[var11];
            if (var24 > 0) {
                this.field1760 = new short[var24];
                this.field1767 = new short[var24];
                this.field1778 = new short[var24];
                this.field1770 = new short[var24];
                this.field1761 = new byte[var24];
                this.field1771 = new short[var24];
            }
            if (var25 > 0) {
                this.field1772 = new short[var25];
            }
        }
        var2.field2060 = var11;
        var3.field2060 = var44;
        var4.field2060 = var46;
        var5.field2060 = var48;
        var6.field2060 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2427();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2439();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2439();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2439();
            }
            this.field1748[var67] = var64 + var69;
            this.field1749[var67] = var65 + var70;
            this.field1750[var67] = var66 + var71;
            var64 = this.field1748[var67];
            var65 = this.field1749[var67];
            var66 = this.field1750[var67];
            if (var17 == 1) {
                this.field1774[var67] = var6.method2427();
            }
        }
        var2.field2060 = var42;
        var3.field2060 = var31;
        var4.field2060 = var34;
        var5.field2060 = var37;
        var6.field2060 = var35;
        var7.field2060 = var40;
        var8.field2060 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1759[var72] = (short) var2.method2547();
            if (var12 == 1) {
                this.field1781[var72] = var3.method2428();
            }
            if (var13 == 255) {
                this.field1756[var72] = var4.method2428();
            }
            if (var14 == 1) {
                this.field1757[var72] = var5.method2428();
            }
            if (var15 == 1) {
                this.field1775[var72] = var6.method2427();
            }
            if (var16 == 1) {
                this.field1751[var72] = (short) (var7.method2547() - 1);
            }
            if (this.field1783 != null && this.field1751[var72] != -1) {
                this.field1783[var72] = (byte) (var8.method2427() - 1);
            }
        }
        var2.field2060 = var33;
        var3.field2060 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2427();
            if (var78 == 1) {
                var73 = var2.method2439() + var76;
                var74 = var2.method2439() + var73;
                var75 = var2.method2439() + var74;
                var76 = var75;
                this.field1752[var77] = var73;
                this.field1753[var77] = var74;
                this.field1754[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2439() + var76;
                var76 = var75;
                this.field1752[var77] = var73;
                this.field1753[var77] = var74;
                this.field1754[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2439() + var76;
                var76 = var75;
                this.field1752[var77] = var73;
                this.field1753[var77] = var74;
                this.field1754[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2439() + var76;
                var76 = var75;
                this.field1752[var77] = var73;
                this.field1753[var77] = var81;
                this.field1754[var77] = var75;
            }
        }
        var2.field2060 = var50;
        var3.field2060 = var52;
        var4.field2060 = var54;
        var5.field2060 = var56;
        var6.field2060 = var58;
        var7.field2060 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1763[var82] & 0xFF;
            if (var83 == 0) {
                this.field1764[var82] = (short) var2.method2547();
                this.field1785[var82] = (short) var2.method2547();
                this.field1766[var82] = (short) var2.method2547();
            }
            if (var83 == 1) {
                this.field1764[var82] = (short) var3.method2547();
                this.field1785[var82] = (short) var3.method2547();
                this.field1766[var82] = (short) var3.method2547();
                this.field1760[var82] = (short) var4.method2547();
                this.field1767[var82] = (short) var4.method2547();
                this.field1778[var82] = (short) var4.method2547();
                this.field1770[var82] = (short) var5.method2547();
                this.field1761[var82] = var6.method2428();
                this.field1771[var82] = (short) var7.method2547();
            }
            if (var83 == 2) {
                this.field1764[var82] = (short) var3.method2547();
                this.field1785[var82] = (short) var3.method2547();
                this.field1766[var82] = (short) var3.method2547();
                this.field1760[var82] = (short) var4.method2547();
                this.field1767[var82] = (short) var4.method2547();
                this.field1778[var82] = (short) var4.method2547();
                this.field1770[var82] = (short) var5.method2547();
                this.field1761[var82] = var6.method2428();
                this.field1771[var82] = (short) var7.method2547();
                this.field1772[var82] = (short) var7.method2547();
            }
            if (var83 == 3) {
                this.field1764[var82] = (short) var3.method2547();
                this.field1785[var82] = (short) var3.method2547();
                this.field1766[var82] = (short) var3.method2547();
                this.field1760[var82] = (short) var4.method2547();
                this.field1767[var82] = (short) var4.method2547();
                this.field1778[var82] = (short) var4.method2547();
                this.field1770[var82] = (short) var5.method2547();
                this.field1761[var82] = var6.method2428();
                this.field1771[var82] = (short) var7.method2547();
            }
        }
        var2.field2060 = var62;
        int var84 = var2.method2427();
        if (var84 == 0) {
            return;
        }
        new class94();
        var2.method2547();
        var2.method2547();
        var2.method2547();
        var2.method2432();
    }

    @ObfuscatedName("cr.c([B)V")
    public void method2217(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class123 var4 = new class123(arg0);
        class123 var5 = new class123(arg0);
        class123 var6 = new class123(arg0);
        class123 var7 = new class123(arg0);
        class123 var8 = new class123(arg0);
        var4.field2060 = arg0.length - 18;
        int var9 = var4.method2547();
        int var10 = var4.method2547();
        int var11 = var4.method2427();
        int var12 = var4.method2427();
        int var13 = var4.method2427();
        int var14 = var4.method2427();
        int var15 = var4.method2427();
        int var16 = var4.method2427();
        int var17 = var4.method2547();
        int var18 = var4.method2547();
        int var19 = var4.method2547();
        int var20 = var4.method2547();
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
        this.field1762 = var9;
        this.field1768 = var10;
        this.field1786 = var11;
        this.field1748 = new int[var9];
        this.field1749 = new int[var9];
        this.field1750 = new int[var9];
        this.field1752 = new int[var10];
        this.field1753 = new int[var10];
        this.field1754 = new int[var10];
        if (var11 > 0) {
            this.field1763 = new byte[var11];
            this.field1764 = new short[var11];
            this.field1785 = new short[var11];
            this.field1766 = new short[var11];
        }
        if (var16 == 1) {
            this.field1774 = new int[var9];
        }
        if (var12 == 1) {
            this.field1781 = new byte[var10];
            this.field1783 = new byte[var10];
            this.field1751 = new short[var10];
        }
        if (var13 == 255) {
            this.field1756 = new byte[var10];
        } else {
            this.field1776 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1757 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1775 = new int[var10];
        }
        this.field1759 = new short[var10];
        var4.field2060 = var21;
        var5.field2060 = var36;
        var6.field2060 = var38;
        var7.field2060 = var40;
        var8.field2060 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2427();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2439();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2439();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2439();
            }
            this.field1748[var46] = var43 + var48;
            this.field1749[var46] = var44 + var49;
            this.field1750[var46] = var45 + var50;
            var43 = this.field1748[var46];
            var44 = this.field1749[var46];
            var45 = this.field1750[var46];
            if (var16 == 1) {
                this.field1774[var46] = var8.method2427();
            }
        }
        var4.field2060 = var32;
        var5.field2060 = var28;
        var6.field2060 = var26;
        var7.field2060 = var30;
        var8.field2060 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1759[var51] = (short) var4.method2547();
            if (var12 == 1) {
                int var52 = var5.method2427();
                if ((var52 & 0x1) == 1) {
                    this.field1781[var51] = 1;
                    var2 = true;
                } else {
                    this.field1781[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1783[var51] = (byte) (var52 >> 2);
                    this.field1751[var51] = this.field1759[var51];
                    this.field1759[var51] = 127;
                    if (this.field1751[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1783[var51] = -1;
                    this.field1751[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1756[var51] = var6.method2428();
            }
            if (var14 == 1) {
                this.field1757[var51] = var7.method2428();
            }
            if (var15 == 1) {
                this.field1775[var51] = var8.method2427();
            }
        }
        var4.field2060 = var25;
        var5.field2060 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2427();
            if (var58 == 1) {
                var53 = var4.method2439() + var56;
                var54 = var4.method2439() + var53;
                var55 = var4.method2439() + var54;
                var56 = var55;
                this.field1752[var57] = var53;
                this.field1753[var57] = var54;
                this.field1754[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2439() + var56;
                var56 = var55;
                this.field1752[var57] = var53;
                this.field1753[var57] = var54;
                this.field1754[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2439() + var56;
                var56 = var55;
                this.field1752[var57] = var53;
                this.field1753[var57] = var54;
                this.field1754[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2439() + var56;
                var56 = var55;
                this.field1752[var57] = var53;
                this.field1753[var57] = var61;
                this.field1754[var57] = var55;
            }
        }
        var4.field2060 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1763[var62] = 0;
            this.field1764[var62] = (short) var4.method2547();
            this.field1785[var62] = (short) var4.method2547();
            this.field1766[var62] = (short) var4.method2547();
        }
        if (this.field1783 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1783[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1764[var65] & 0xFFFF) == this.field1752[var64] && (this.field1785[var65] & 0xFFFF) == this.field1753[var64] && (this.field1766[var65] & 0xFFFF) == this.field1754[var64]) {
                        this.field1783[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1783 = null;
            }
        }
        if (!var3) {
            this.field1751 = null;
        }
        if (!var2) {
            this.field1781 = null;
        }
    }

    public class104(class104[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1762 = 0;
        this.field1768 = 0;
        this.field1786 = 0;
        this.field1776 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class104 var10 = arg0[var9];
            if (var10 != null) {
                this.field1762 += var10.field1762;
                this.field1768 += var10.field1768;
                this.field1786 += var10.field1786;
                if (var10.field1756 == null) {
                    if (this.field1776 == -1) {
                        this.field1776 = var10.field1776;
                    }
                    if (this.field1776 != var10.field1776) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1781 != null;
                var5 |= var10.field1757 != null;
                var6 |= var10.field1775 != null;
                var7 |= var10.field1751 != null;
                var8 |= var10.field1783 != null;
            }
        }
        this.field1748 = new int[this.field1762];
        this.field1749 = new int[this.field1762];
        this.field1750 = new int[this.field1762];
        this.field1774 = new int[this.field1762];
        this.field1752 = new int[this.field1768];
        this.field1753 = new int[this.field1768];
        this.field1754 = new int[this.field1768];
        if (var3) {
            this.field1781 = new byte[this.field1768];
        }
        if (var4) {
            this.field1756 = new byte[this.field1768];
        }
        if (var5) {
            this.field1757 = new byte[this.field1768];
        }
        if (var6) {
            this.field1775 = new int[this.field1768];
        }
        if (var7) {
            this.field1751 = new short[this.field1768];
        }
        if (var8) {
            this.field1783 = new byte[this.field1768];
        }
        this.field1759 = new short[this.field1768];
        if (this.field1786 > 0) {
            this.field1763 = new byte[this.field1786];
            this.field1764 = new short[this.field1786];
            this.field1785 = new short[this.field1786];
            this.field1766 = new short[this.field1786];
            this.field1760 = new short[this.field1786];
            this.field1767 = new short[this.field1786];
            this.field1778 = new short[this.field1786];
            this.field1770 = new short[this.field1786];
            this.field1761 = new byte[this.field1786];
            this.field1771 = new short[this.field1786];
            this.field1772 = new short[this.field1786];
        }
        this.field1762 = 0;
        this.field1768 = 0;
        this.field1786 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class104 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1768; var13++) {
                    if (var3 && var12.field1781 != null) {
                        this.field1781[this.field1768] = var12.field1781[var13];
                    }
                    if (var4) {
                        if (var12.field1756 == null) {
                            this.field1756[this.field1768] = var12.field1776;
                        } else {
                            this.field1756[this.field1768] = var12.field1756[var13];
                        }
                    }
                    if (var5 && var12.field1757 != null) {
                        this.field1757[this.field1768] = var12.field1757[var13];
                    }
                    if (var6 && var12.field1775 != null) {
                        this.field1775[this.field1768] = var12.field1775[var13];
                    }
                    if (var7) {
                        if (var12.field1751 == null) {
                            this.field1751[this.field1768] = -1;
                        } else {
                            this.field1751[this.field1768] = var12.field1751[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1783 == null || var12.field1783[var13] == -1) {
                            this.field1783[this.field1768] = -1;
                        } else {
                            this.field1783[this.field1768] = (byte) (var12.field1783[var13] + this.field1786);
                        }
                    }
                    this.field1759[this.field1768] = var12.field1759[var13];
                    this.field1752[this.field1768] = this.method2193(var12, var12.field1752[var13]);
                    this.field1753[this.field1768] = this.method2193(var12, var12.field1753[var13]);
                    this.field1754[this.field1768] = this.method2193(var12, var12.field1754[var13]);
                    this.field1768++;
                }
                for (int var14 = 0; var14 < var12.field1786; var14++) {
                    byte var15 = this.field1763[this.field1786] = var12.field1763[var14];
                    if (var15 == 0) {
                        this.field1764[this.field1786] = (short) this.method2193(var12, var12.field1764[var14]);
                        this.field1785[this.field1786] = (short) this.method2193(var12, var12.field1785[var14]);
                        this.field1766[this.field1786] = (short) this.method2193(var12, var12.field1766[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1764[this.field1786] = var12.field1764[var14];
                        this.field1785[this.field1786] = var12.field1785[var14];
                        this.field1766[this.field1786] = var12.field1766[var14];
                        this.field1760[this.field1786] = var12.field1760[var14];
                        this.field1767[this.field1786] = var12.field1767[var14];
                        this.field1778[this.field1786] = var12.field1778[var14];
                        this.field1770[this.field1786] = var12.field1770[var14];
                        this.field1761[this.field1786] = var12.field1761[var14];
                        this.field1771[this.field1786] = var12.field1771[var14];
                    }
                    if (var15 == 2) {
                        this.field1772[this.field1786] = var12.field1772[var14];
                    }
                    this.field1786++;
                }
            }
        }
    }

    @ObfuscatedName("cr.v(Lcr;I)I")
    public final int method2193(class104 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1748[arg1];
        int var5 = arg0.field1749[arg1];
        int var6 = arg0.field1750[arg1];
        for (int var7 = 0; var7 < this.field1762; var7++) {
            if (this.field1748[var7] == var4 && this.field1749[var7] == var5 && this.field1750[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1748[this.field1762] = var4;
            this.field1749[this.field1762] = var5;
            this.field1750[this.field1762] = var6;
            if (arg0.field1774 != null) {
                this.field1774[this.field1762] = arg0.field1774[arg1];
            }
            var3 = this.field1762++;
        }
        return var3;
    }

    public class104(class104 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1762 = arg0.field1762;
        this.field1768 = arg0.field1768;
        this.field1786 = arg0.field1786;
        if (arg1) {
            this.field1748 = arg0.field1748;
            this.field1749 = arg0.field1749;
            this.field1750 = arg0.field1750;
        } else {
            this.field1748 = new int[this.field1762];
            this.field1749 = new int[this.field1762];
            this.field1750 = new int[this.field1762];
            for (int var6 = 0; var6 < this.field1762; var6++) {
                this.field1748[var6] = arg0.field1748[var6];
                this.field1749[var6] = arg0.field1749[var6];
                this.field1750[var6] = arg0.field1750[var6];
            }
        }
        if (arg2) {
            this.field1759 = arg0.field1759;
        } else {
            this.field1759 = new short[this.field1768];
            for (int var7 = 0; var7 < this.field1768; var7++) {
                this.field1759[var7] = arg0.field1759[var7];
            }
        }
        if (arg3 || arg0.field1751 == null) {
            this.field1751 = arg0.field1751;
        } else {
            this.field1751 = new short[this.field1768];
            for (int var8 = 0; var8 < this.field1768; var8++) {
                this.field1751[var8] = arg0.field1751[var8];
            }
        }
        if (arg4) {
            this.field1757 = arg0.field1757;
        } else {
            this.field1757 = new byte[this.field1768];
            if (arg0.field1757 == null) {
                for (int var9 = 0; var9 < this.field1768; var9++) {
                    this.field1757[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1768; var10++) {
                    this.field1757[var10] = arg0.field1757[var10];
                }
            }
        }
        this.field1752 = arg0.field1752;
        this.field1753 = arg0.field1753;
        this.field1754 = arg0.field1754;
        this.field1781 = arg0.field1781;
        this.field1756 = arg0.field1756;
        this.field1783 = arg0.field1783;
        this.field1776 = arg0.field1776;
        this.field1763 = arg0.field1763;
        this.field1764 = arg0.field1764;
        this.field1785 = arg0.field1785;
        this.field1766 = arg0.field1766;
        this.field1760 = arg0.field1760;
        this.field1767 = arg0.field1767;
        this.field1778 = arg0.field1778;
        this.field1770 = arg0.field1770;
        this.field1761 = arg0.field1761;
        this.field1771 = arg0.field1771;
        this.field1772 = arg0.field1772;
        this.field1774 = arg0.field1774;
        this.field1775 = arg0.field1775;
        this.field1773 = arg0.field1773;
        this.field1777 = arg0.field1777;
        this.field1779 = arg0.field1779;
        this.field1758 = arg0.field1758;
        this.field1782 = arg0.field1782;
        this.field1780 = arg0.field1780;
        this.field1792 = arg0.field1792;
    }

    @ObfuscatedName("cr.j()Lcr;")
    public class104 method2144() {
        class104 var1 = new class104();
        if (this.field1781 != null) {
            var1.field1781 = new byte[this.field1768];
            for (int var2 = 0; var2 < this.field1768; var2++) {
                var1.field1781[var2] = this.field1781[var2];
            }
        }
        var1.field1762 = this.field1762;
        var1.field1768 = this.field1768;
        var1.field1786 = this.field1786;
        var1.field1748 = this.field1748;
        var1.field1749 = this.field1749;
        var1.field1750 = this.field1750;
        var1.field1752 = this.field1752;
        var1.field1753 = this.field1753;
        var1.field1754 = this.field1754;
        var1.field1756 = this.field1756;
        var1.field1757 = this.field1757;
        var1.field1783 = this.field1783;
        var1.field1759 = this.field1759;
        var1.field1751 = this.field1751;
        var1.field1776 = this.field1776;
        var1.field1763 = this.field1763;
        var1.field1764 = this.field1764;
        var1.field1785 = this.field1785;
        var1.field1766 = this.field1766;
        var1.field1760 = this.field1760;
        var1.field1767 = this.field1767;
        var1.field1778 = this.field1778;
        var1.field1770 = this.field1770;
        var1.field1761 = this.field1761;
        var1.field1771 = this.field1771;
        var1.field1772 = this.field1772;
        var1.field1774 = this.field1774;
        var1.field1775 = this.field1775;
        var1.field1773 = this.field1773;
        var1.field1777 = this.field1777;
        var1.field1779 = this.field1779;
        var1.field1758 = this.field1758;
        var1.field1780 = this.field1780;
        var1.field1792 = this.field1792;
        return var1;
    }

    @ObfuscatedName("cr.m([[IIIIZI)Lcr;")
    public class104 method2145(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2210();
        int var7 = this.field1755 + arg1;
        int var8 = this.field1747 + arg1;
        int var9 = this.field1788 + arg3;
        int var10 = this.field1787 + arg3;
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
            var15.field1762 = this.field1762;
            var15.field1768 = this.field1768;
            var15.field1786 = this.field1786;
            var15.field1748 = this.field1748;
            var15.field1750 = this.field1750;
            var15.field1752 = this.field1752;
            var15.field1753 = this.field1753;
            var15.field1754 = this.field1754;
            var15.field1781 = this.field1781;
            var15.field1756 = this.field1756;
            var15.field1757 = this.field1757;
            var15.field1783 = this.field1783;
            var15.field1759 = this.field1759;
            var15.field1751 = this.field1751;
            var15.field1776 = this.field1776;
            var15.field1763 = this.field1763;
            var15.field1764 = this.field1764;
            var15.field1785 = this.field1785;
            var15.field1766 = this.field1766;
            var15.field1760 = this.field1760;
            var15.field1767 = this.field1767;
            var15.field1778 = this.field1778;
            var15.field1770 = this.field1770;
            var15.field1761 = this.field1761;
            var15.field1771 = this.field1771;
            var15.field1772 = this.field1772;
            var15.field1774 = this.field1774;
            var15.field1775 = this.field1775;
            var15.field1773 = this.field1773;
            var15.field1777 = this.field1777;
            var15.field1780 = this.field1780;
            var15.field1792 = this.field1792;
            var15.field1749 = new int[var15.field1762];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1762; var16++) {
                int var17 = this.field1748[var16] + arg1;
                int var18 = this.field1750[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1749[var16] = this.field1749[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1762; var26++) {
                int var27 = (-this.field1749[var26] << 16) / this.field1518;
                if (var27 < arg5) {
                    int var28 = this.field1748[var26] + arg1;
                    int var29 = this.field1750[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1749[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1749[var26];
                }
            }
        }
        var15.method2143();
        return var15;
    }

    @ObfuscatedName("cr.y()V")
    public void method2216() {
        int var10002;
        if (this.field1774 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1762; var3++) {
                int var4 = this.field1774[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1773 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1773[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1762) {
                int var7 = this.field1774[var6];
                this.field1773[var7][var1[var7]++] = var6++;
            }
            this.field1774 = null;
        }
        if (this.field1775 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1768; var10++) {
            int var11 = this.field1775[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1777 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1777[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1768) {
            int var14 = this.field1775[var13];
            this.field1777[var14][var8[var14]++] = var13++;
        }
        this.field1775 = null;
    }

    @ObfuscatedName("cr.u()V")
    public void method2147() {
        for (int var1 = 0; var1 < this.field1762; var1++) {
            int var2 = this.field1748[var1];
            this.field1748[var1] = this.field1750[var1];
            this.field1750[var1] = -var2;
        }
        this.method2143();
    }

    @ObfuscatedName("cr.h()V")
    public void method2148() {
        for (int var1 = 0; var1 < this.field1762; var1++) {
            this.field1748[var1] = -this.field1748[var1];
            this.field1750[var1] = -this.field1750[var1];
        }
        this.method2143();
    }

    @ObfuscatedName("cr.l()V")
    public void method2149() {
        for (int var1 = 0; var1 < this.field1762; var1++) {
            int var2 = this.field1750[var1];
            this.field1750[var1] = this.field1748[var1];
            this.field1748[var1] = -var2;
        }
        this.method2143();
    }

    @ObfuscatedName("cr.b(I)V")
    public void method2150(int arg0) {
        int var2 = field1765[arg0];
        int var3 = field1793[arg0];
        for (int var4 = 0; var4 < this.field1762; var4++) {
            int var5 = this.field1750[var4] * var2 + this.field1748[var4] * var3 >> 16;
            this.field1750[var4] = this.field1750[var4] * var3 - this.field1748[var4] * var2 >> 16;
            this.field1748[var4] = var5;
        }
        this.method2143();
    }

    @ObfuscatedName("cr.g(III)V")
    public void method2142(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1762; var4++) {
            this.field1748[var4] += arg0;
            this.field1749[var4] += arg1;
            this.field1750[var4] += arg2;
        }
        this.method2143();
    }

    @ObfuscatedName("cr.e(SS)V")
    public void method2152(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1768; var3++) {
            if (this.field1759[var3] == arg0) {
                this.field1759[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cr.p(SS)V")
    public void method2153(short arg0, short arg1) {
        if (this.field1751 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1768; var3++) {
            if (this.field1751[var3] == arg0) {
                this.field1751[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cr.a()V")
    public void method2154() {
        for (int var1 = 0; var1 < this.field1762; var1++) {
            this.field1750[var1] = -this.field1750[var1];
        }
        for (int var2 = 0; var2 < this.field1768; var2++) {
            int var3 = this.field1752[var2];
            this.field1752[var2] = this.field1754[var2];
            this.field1754[var2] = var3;
        }
        this.method2143();
    }

    @ObfuscatedName("cr.n(III)V")
    public void method2207(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1762; var4++) {
            this.field1748[var4] = this.field1748[var4] * arg0 / 128;
            this.field1749[var4] = this.field1749[var4] * arg1 / 128;
            this.field1750[var4] = this.field1750[var4] * arg2 / 128;
        }
        this.method2143();
    }

    @ObfuscatedName("cr.z()V")
    public void method2156() {
        if (this.field1779 != null) {
            return;
        }
        this.field1779 = new class100[this.field1762];
        for (int var1 = 0; var1 < this.field1762; var1++) {
            this.field1779[var1] = new class100();
        }
        for (int var2 = 0; var2 < this.field1768; var2++) {
            int var3 = this.field1752[var2];
            int var4 = this.field1753[var2];
            int var5 = this.field1754[var2];
            int var6 = this.field1748[var4] - this.field1748[var3];
            int var7 = this.field1749[var4] - this.field1749[var3];
            int var8 = this.field1750[var4] - this.field1750[var3];
            int var9 = this.field1748[var5] - this.field1748[var3];
            int var10 = this.field1749[var5] - this.field1749[var3];
            int var11 = this.field1750[var5] - this.field1750[var3];
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
            if (this.field1781 == null) {
                var19 = 0;
            } else {
                var19 = this.field1781[var2];
            }
            if (var19 == 0) {
                class100 var20 = this.field1779[var3];
                var20.field1699 += var16;
                var20.field1692 += var17;
                var20.field1698 += var18;
                var20.field1693++;
                class100 var21 = this.field1779[var4];
                var21.field1699 += var16;
                var21.field1692 += var17;
                var21.field1698 += var18;
                var21.field1693++;
                class100 var22 = this.field1779[var5];
                var22.field1699 += var16;
                var22.field1692 += var17;
                var22.field1698 += var18;
                var22.field1693++;
            } else if (var19 == 1) {
                if (this.field1758 == null) {
                    this.field1758 = new class88[this.field1768];
                }
                class88 var23 = this.field1758[var2] = new class88();
                var23.field1512 = var16;
                var23.field1513 = var17;
                var23.field1516 = var18;
            }
        }
    }

    @ObfuscatedName("cr.x()V")
    public void method2143() {
        this.field1779 = null;
        this.field1782 = null;
        this.field1758 = null;
        this.field1769 = false;
    }

    @ObfuscatedName("cr.d()V")
    public void method2210() {
        if (this.field1769) {
            return;
        }
        this.field1518 = 0;
        this.field1784 = 0;
        this.field1755 = 999999;
        this.field1747 = -999999;
        this.field1787 = -99999;
        this.field1788 = 99999;
        for (int var1 = 0; var1 < this.field1762; var1++) {
            int var2 = this.field1748[var1];
            int var3 = this.field1749[var1];
            int var4 = this.field1750[var1];
            if (var2 < this.field1755) {
                this.field1755 = var2;
            }
            if (var2 > this.field1747) {
                this.field1747 = var2;
            }
            if (var4 < this.field1788) {
                this.field1788 = var4;
            }
            if (var4 > this.field1787) {
                this.field1787 = var4;
            }
            if (-var3 > this.field1518) {
                this.field1518 = -var3;
            }
            if (var3 > this.field1784) {
                this.field1784 = var3;
            }
        }
        this.field1769 = true;
    }

    @ObfuscatedName("cr.t(Lcr;Lcr;IIIZ)V")
    public static void method2159(class104 arg0, class104 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2210();
        arg0.method2156();
        arg1.method2210();
        arg1.method2156();
        field1791++;
        int var6 = 0;
        int[] var7 = arg1.field1748;
        int var8 = arg1.field1762;
        for (int var9 = 0; var9 < arg0.field1762; var9++) {
            class100 var10 = arg0.field1779[var9];
            if (var10.field1693 != 0) {
                int var11 = arg0.field1749[var9] - arg3;
                if (var11 <= arg1.field1784) {
                    int var12 = arg0.field1748[var9] - arg2;
                    if (var12 >= arg1.field1755 && var12 <= arg1.field1747) {
                        int var13 = arg0.field1750[var9] - arg4;
                        if (var13 >= arg1.field1788 && var13 <= arg1.field1787) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class100 var15 = arg1.field1779[var14];
                                if (var7[var14] == var12 && arg1.field1750[var14] == var13 && arg1.field1749[var14] == var11 && var15.field1693 != 0) {
                                    if (arg0.field1782 == null) {
                                        arg0.field1782 = new class100[arg0.field1762];
                                    }
                                    if (arg1.field1782 == null) {
                                        arg1.field1782 = new class100[var8];
                                    }
                                    class100 var16 = arg0.field1782[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1782[var9] = new class100(var10);
                                    }
                                    class100 var17 = arg1.field1782[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1782[var14] = new class100(var15);
                                    }
                                    var16.field1699 += var15.field1699;
                                    var16.field1692 += var15.field1692;
                                    var16.field1698 += var15.field1698;
                                    var16.field1693 += var15.field1693;
                                    var17.field1699 += var10.field1699;
                                    var17.field1692 += var10.field1692;
                                    var17.field1698 += var10.field1698;
                                    var17.field1693 += var10.field1693;
                                    var6++;
                                    field1789[var9] = field1791;
                                    field1790[var14] = field1791;
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
        for (int var18 = 0; var18 < arg0.field1768; var18++) {
            if (field1789[arg0.field1752[var18]] == field1791 && field1789[arg0.field1753[var18]] == field1791 && field1789[arg0.field1754[var18]] == field1791) {
                if (arg0.field1781 == null) {
                    arg0.field1781 = new byte[arg0.field1768];
                }
                arg0.field1781[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1768; var19++) {
            if (field1790[arg1.field1752[var19]] == field1791 && field1790[arg1.field1753[var19]] == field1791 && field1790[arg1.field1754[var19]] == field1791) {
                if (arg1.field1781 == null) {
                    arg1.field1781 = new byte[arg1.field1768];
                }
                arg1.field1781[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cr.o(IIIII)Ldj;")
    public final class109 method2160(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2156();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class109 var8 = new class109();
        var8.field1872 = new int[this.field1768];
        var8.field1871 = new int[this.field1768];
        var8.field1891 = new int[this.field1768];
        if (this.field1786 > 0 && this.field1783 != null) {
            int[] var9 = new int[this.field1786];
            for (int var10 = 0; var10 < this.field1768; var10++) {
                if (this.field1783[var10] != -1) {
                    var9[this.field1783[var10] & 0xFF]++;
                }
            }
            var8.field1878 = 0;
            for (int var11 = 0; var11 < this.field1786; var11++) {
                if (var9[var11] > 0 && this.field1763[var11] == 0) {
                    var8.field1878++;
                }
            }
            var8.field1889 = new int[var8.field1878];
            var8.field1880 = new int[var8.field1878];
            var8.field1881 = new int[var8.field1878];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1786; var13++) {
                if (var9[var13] > 0 && this.field1763[var13] == 0) {
                    var8.field1889[var12] = this.field1764[var13] & 0xFFFF;
                    var8.field1880[var12] = this.field1785[var13] & 0xFFFF;
                    var8.field1881[var12] = this.field1766[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1914 = new byte[this.field1768];
            for (int var14 = 0; var14 < this.field1768; var14++) {
                if (this.field1783[var14] == -1) {
                    var8.field1914[var14] = -1;
                } else {
                    var8.field1914[var14] = (byte) var9[this.field1783[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1768; var15++) {
            byte var16;
            if (this.field1781 == null) {
                var16 = 0;
            } else {
                var16 = this.field1781[var15];
            }
            byte var17;
            if (this.field1757 == null) {
                var17 = 0;
            } else {
                var17 = this.field1757[var15];
            }
            short var18;
            if (this.field1751 == null) {
                var18 = -1;
            } else {
                var18 = this.field1751[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1759[var15] & 0xFFFF;
                    class100 var20;
                    if (this.field1782 == null || this.field1782[this.field1752[var15]] == null) {
                        var20 = this.field1779[this.field1752[var15]];
                    } else {
                        var20 = this.field1782[this.field1752[var15]];
                    }
                    int var21 = (var20.field1698 * arg4 + var20.field1699 * arg2 + var20.field1692 * arg3) / (var20.field1693 * var7) + arg0;
                    var8.field1872[var15] = method2161(var19, var21);
                    class100 var22;
                    if (this.field1782 == null || this.field1782[this.field1753[var15]] == null) {
                        var22 = this.field1779[this.field1753[var15]];
                    } else {
                        var22 = this.field1782[this.field1753[var15]];
                    }
                    int var23 = (var22.field1698 * arg4 + var22.field1699 * arg2 + var22.field1692 * arg3) / (var22.field1693 * var7) + arg0;
                    var8.field1871[var15] = method2161(var19, var23);
                    class100 var24;
                    if (this.field1782 == null || this.field1782[this.field1754[var15]] == null) {
                        var24 = this.field1779[this.field1754[var15]];
                    } else {
                        var24 = this.field1782[this.field1754[var15]];
                    }
                    int var25 = (var24.field1698 * arg4 + var24.field1699 * arg2 + var24.field1692 * arg3) / (var24.field1693 * var7) + arg0;
                    var8.field1891[var15] = method2161(var19, var25);
                } else if (var16 == 1) {
                    class88 var26 = this.field1758[var15];
                    int var27 = (var26.field1516 * arg4 + var26.field1513 * arg3 + var26.field1512 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field1872[var15] = method2161(this.field1759[var15] & 0xFFFF, var27);
                    var8.field1891[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1872[var15] = 128;
                    var8.field1891[var15] = -1;
                } else {
                    var8.field1891[var15] = -2;
                }
            } else if (var16 == 0) {
                class100 var28;
                if (this.field1782 == null || this.field1782[this.field1752[var15]] == null) {
                    var28 = this.field1779[this.field1752[var15]];
                } else {
                    var28 = this.field1782[this.field1752[var15]];
                }
                int var29 = (var28.field1698 * arg4 + var28.field1699 * arg2 + var28.field1692 * arg3) / (var28.field1693 * var7) + arg0;
                var8.field1872[var15] = method2162(var29);
                class100 var30;
                if (this.field1782 == null || this.field1782[this.field1753[var15]] == null) {
                    var30 = this.field1779[this.field1753[var15]];
                } else {
                    var30 = this.field1782[this.field1753[var15]];
                }
                int var31 = (var30.field1698 * arg4 + var30.field1699 * arg2 + var30.field1692 * arg3) / (var30.field1693 * var7) + arg0;
                var8.field1871[var15] = method2162(var31);
                class100 var32;
                if (this.field1782 == null || this.field1782[this.field1754[var15]] == null) {
                    var32 = this.field1779[this.field1754[var15]];
                } else {
                    var32 = this.field1782[this.field1754[var15]];
                }
                int var33 = (var32.field1698 * arg4 + var32.field1699 * arg2 + var32.field1692 * arg3) / (var32.field1693 * var7) + arg0;
                var8.field1891[var15] = method2162(var33);
            } else if (var16 == 1) {
                class88 var34 = this.field1758[var15];
                int var35 = (var34.field1516 * arg4 + var34.field1513 * arg3 + var34.field1512 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field1872[var15] = method2162(var35);
                var8.field1891[var15] = -1;
            } else {
                var8.field1891[var15] = -2;
            }
        }
        this.method2216();
        var8.field1862 = this.field1762;
        var8.field1863 = this.field1748;
        var8.field1898 = this.field1749;
        var8.field1865 = this.field1750;
        var8.field1866 = this.field1768;
        var8.field1867 = this.field1752;
        var8.field1879 = this.field1753;
        var8.field1869 = this.field1754;
        var8.field1873 = this.field1756;
        var8.field1874 = this.field1757;
        var8.field1877 = this.field1776;
        var8.field1882 = this.field1773;
        var8.field1870 = this.field1777;
        var8.field1876 = this.field1751;
        return var8;
    }

    @ObfuscatedName("cr.aq(II)I")
    public static final int method2161(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cr.al(I)I")
    public static final int method2162(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
