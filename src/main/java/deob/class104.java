package deob;

@ObfuscatedName("ca")
public class class104 extends class89 {

    @ObfuscatedName("ca.f")
    public int field1756 = 0;

    @ObfuscatedName("ca.e")
    public int[] field1750;

    @ObfuscatedName("ca.n")
    public int[] field1751;

    @ObfuscatedName("ca.t")
    public int[] field1780;

    @ObfuscatedName("ca.v")
    public int field1753 = 0;

    @ObfuscatedName("ca.b")
    public int[] field1754;

    @ObfuscatedName("ca.m")
    public int[] field1757;

    @ObfuscatedName("ca.k")
    public int[] field1794;

    @ObfuscatedName("ca.c")
    public byte[] field1779;

    @ObfuscatedName("ca.w")
    public byte[] field1771;

    @ObfuscatedName("ca.l")
    public byte[] field1792;

    @ObfuscatedName("ca.h")
    public byte[] field1760;

    @ObfuscatedName("ca.i")
    public short[] field1776;

    @ObfuscatedName("ca.u")
    public short[] field1762;

    @ObfuscatedName("ca.x")
    public byte field1763 = 0;

    @ObfuscatedName("ca.d")
    public int field1764;

    @ObfuscatedName("ca.o")
    public byte[] field1787;

    @ObfuscatedName("ca.j")
    public short[] field1766;

    @ObfuscatedName("ca.q")
    public short[] field1767;

    @ObfuscatedName("ca.r")
    public short[] field1768;

    @ObfuscatedName("ca.a")
    public short[] field1791;

    @ObfuscatedName("ca.z")
    public short[] field1770;

    @ObfuscatedName("ca.p")
    public short[] field1755;

    @ObfuscatedName("ca.y")
    public short[] field1772;

    @ObfuscatedName("ca.s")
    public short[] field1773;

    @ObfuscatedName("ca.g")
    public short[] field1774;

    @ObfuscatedName("ca.aj")
    public byte[] field1775;

    @ObfuscatedName("ca.ay")
    public int[] field1786;

    @ObfuscatedName("ca.ah")
    public int[] field1749;

    @ObfuscatedName("ca.ax")
    public int[][] field1778;

    @ObfuscatedName("ca.ar")
    public int[][] field1777;

    @ObfuscatedName("ca.ae")
    public class88[] field1758;

    @ObfuscatedName("ca.ac")
    public class100[] field1785;

    @ObfuscatedName("ca.aw")
    public class100[] field1782;

    @ObfuscatedName("ca.am")
    public short field1783;

    @ObfuscatedName("ca.aq")
    public short field1784;

    @ObfuscatedName("ca.at")
    public boolean field1759 = false;

    @ObfuscatedName("ca.aa")
    public int field1769;

    @ObfuscatedName("ca.as")
    public int field1765;

    @ObfuscatedName("ca.ao")
    public int field1788;

    @ObfuscatedName("ca.ai")
    public int field1789;

    @ObfuscatedName("ca.ap")
    public int field1790;

    @ObfuscatedName("ca.ak")
    public static int[] field1761 = new int[10000];

    @ObfuscatedName("ca.ag")
    public static int[] field1781 = new int[10000];

    @ObfuscatedName("ca.az")
    public static int field1793 = 0;

    @ObfuscatedName("ca.au")
    public static int[] field1752 = class95.field1636;

    @ObfuscatedName("ca.af")
    public static int[] field1795 = class95.field1647;

    public class104() {
    }

    @ObfuscatedName("ca.f(Lfj;II)Lca;")
    public static class104 method2114(class171 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3107(arg1, arg2);
        return var3 == null ? null : new class104(var3);
    }

    public class104(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2115(arg0);
        } else {
            this.method2183(arg0);
        }
    }

    @ObfuscatedName("ca.e([B)V")
    public void method2115(byte[] arg0) {
        class123 var2 = new class123(arg0);
        class123 var3 = new class123(arg0);
        class123 var4 = new class123(arg0);
        class123 var5 = new class123(arg0);
        class123 var6 = new class123(arg0);
        class123 var7 = new class123(arg0);
        class123 var8 = new class123(arg0);
        var2.field2052 = arg0.length - 23;
        int var9 = var2.method2401();
        int var10 = var2.method2401();
        int var11 = var2.method2522();
        int var12 = var2.method2522();
        int var13 = var2.method2522();
        int var14 = var2.method2522();
        int var15 = var2.method2522();
        int var16 = var2.method2522();
        int var17 = var2.method2522();
        int var18 = var2.method2401();
        int var19 = var2.method2401();
        int var20 = var2.method2401();
        int var21 = var2.method2401();
        int var22 = var2.method2401();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1787 = new byte[var11];
            var2.field2052 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1787[var26] = var2.method2400();
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
        this.field1756 = var9;
        this.field1753 = var10;
        this.field1764 = var11;
        this.field1750 = new int[var9];
        this.field1751 = new int[var9];
        this.field1780 = new int[var9];
        this.field1754 = new int[var10];
        this.field1757 = new int[var10];
        this.field1794 = new int[var10];
        if (var17 == 1) {
            this.field1786 = new int[var9];
        }
        if (var12 == 1) {
            this.field1779 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1771 = new byte[var10];
        } else {
            this.field1763 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1792 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1749 = new int[var10];
        }
        if (var16 == 1) {
            this.field1762 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1760 = new byte[var10];
        }
        this.field1776 = new short[var10];
        if (var11 > 0) {
            this.field1766 = new short[var11];
            this.field1767 = new short[var11];
            this.field1768 = new short[var11];
            if (var24 > 0) {
                this.field1791 = new short[var24];
                this.field1770 = new short[var24];
                this.field1755 = new short[var24];
                this.field1772 = new short[var24];
                this.field1775 = new byte[var24];
                this.field1773 = new short[var24];
            }
            if (var25 > 0) {
                this.field1774 = new short[var25];
            }
        }
        var2.field2052 = var11;
        var3.field2052 = var44;
        var4.field2052 = var46;
        var5.field2052 = var48;
        var6.field2052 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2522();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2415();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2415();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2415();
            }
            this.field1750[var67] = var64 + var69;
            this.field1751[var67] = var65 + var70;
            this.field1780[var67] = var66 + var71;
            var64 = this.field1750[var67];
            var65 = this.field1751[var67];
            var66 = this.field1780[var67];
            if (var17 == 1) {
                this.field1786[var67] = var6.method2522();
            }
        }
        var2.field2052 = var42;
        var3.field2052 = var31;
        var4.field2052 = var34;
        var5.field2052 = var37;
        var6.field2052 = var35;
        var7.field2052 = var40;
        var8.field2052 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1776[var72] = (short) var2.method2401();
            if (var12 == 1) {
                this.field1779[var72] = var3.method2400();
            }
            if (var13 == 255) {
                this.field1771[var72] = var4.method2400();
            }
            if (var14 == 1) {
                this.field1792[var72] = var5.method2400();
            }
            if (var15 == 1) {
                this.field1749[var72] = var6.method2522();
            }
            if (var16 == 1) {
                this.field1762[var72] = (short) (var7.method2401() - 1);
            }
            if (this.field1760 != null && this.field1762[var72] != -1) {
                this.field1760[var72] = (byte) (var8.method2522() - 1);
            }
        }
        var2.field2052 = var33;
        var3.field2052 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2522();
            if (var78 == 1) {
                var73 = var2.method2415() + var76;
                var74 = var2.method2415() + var73;
                var75 = var2.method2415() + var74;
                var76 = var75;
                this.field1754[var77] = var73;
                this.field1757[var77] = var74;
                this.field1794[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2415() + var76;
                var76 = var75;
                this.field1754[var77] = var73;
                this.field1757[var77] = var74;
                this.field1794[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2415() + var76;
                var76 = var75;
                this.field1754[var77] = var73;
                this.field1757[var77] = var74;
                this.field1794[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2415() + var76;
                var76 = var75;
                this.field1754[var77] = var73;
                this.field1757[var77] = var81;
                this.field1794[var77] = var75;
            }
        }
        var2.field2052 = var50;
        var3.field2052 = var52;
        var4.field2052 = var54;
        var5.field2052 = var56;
        var6.field2052 = var58;
        var7.field2052 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1787[var82] & 0xFF;
            if (var83 == 0) {
                this.field1766[var82] = (short) var2.method2401();
                this.field1767[var82] = (short) var2.method2401();
                this.field1768[var82] = (short) var2.method2401();
            }
            if (var83 == 1) {
                this.field1766[var82] = (short) var3.method2401();
                this.field1767[var82] = (short) var3.method2401();
                this.field1768[var82] = (short) var3.method2401();
                this.field1791[var82] = (short) var4.method2401();
                this.field1770[var82] = (short) var4.method2401();
                this.field1755[var82] = (short) var4.method2401();
                this.field1772[var82] = (short) var5.method2401();
                this.field1775[var82] = var6.method2400();
                this.field1773[var82] = (short) var7.method2401();
            }
            if (var83 == 2) {
                this.field1766[var82] = (short) var3.method2401();
                this.field1767[var82] = (short) var3.method2401();
                this.field1768[var82] = (short) var3.method2401();
                this.field1791[var82] = (short) var4.method2401();
                this.field1770[var82] = (short) var4.method2401();
                this.field1755[var82] = (short) var4.method2401();
                this.field1772[var82] = (short) var5.method2401();
                this.field1775[var82] = var6.method2400();
                this.field1773[var82] = (short) var7.method2401();
                this.field1774[var82] = (short) var7.method2401();
            }
            if (var83 == 3) {
                this.field1766[var82] = (short) var3.method2401();
                this.field1767[var82] = (short) var3.method2401();
                this.field1768[var82] = (short) var3.method2401();
                this.field1791[var82] = (short) var4.method2401();
                this.field1770[var82] = (short) var4.method2401();
                this.field1755[var82] = (short) var4.method2401();
                this.field1772[var82] = (short) var5.method2401();
                this.field1775[var82] = var6.method2400();
                this.field1773[var82] = (short) var7.method2401();
            }
        }
        var2.field2052 = var62;
        int var84 = var2.method2522();
        if (var84 == 0) {
            return;
        }
        new class94();
        var2.method2401();
        var2.method2401();
        var2.method2401();
        var2.method2404();
    }

    @ObfuscatedName("ca.t([B)V")
    public void method2183(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class123 var4 = new class123(arg0);
        class123 var5 = new class123(arg0);
        class123 var6 = new class123(arg0);
        class123 var7 = new class123(arg0);
        class123 var8 = new class123(arg0);
        var4.field2052 = arg0.length - 18;
        int var9 = var4.method2401();
        int var10 = var4.method2401();
        int var11 = var4.method2522();
        int var12 = var4.method2522();
        int var13 = var4.method2522();
        int var14 = var4.method2522();
        int var15 = var4.method2522();
        int var16 = var4.method2522();
        int var17 = var4.method2401();
        int var18 = var4.method2401();
        int var19 = var4.method2401();
        int var20 = var4.method2401();
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
        this.field1756 = var9;
        this.field1753 = var10;
        this.field1764 = var11;
        this.field1750 = new int[var9];
        this.field1751 = new int[var9];
        this.field1780 = new int[var9];
        this.field1754 = new int[var10];
        this.field1757 = new int[var10];
        this.field1794 = new int[var10];
        if (var11 > 0) {
            this.field1787 = new byte[var11];
            this.field1766 = new short[var11];
            this.field1767 = new short[var11];
            this.field1768 = new short[var11];
        }
        if (var16 == 1) {
            this.field1786 = new int[var9];
        }
        if (var12 == 1) {
            this.field1779 = new byte[var10];
            this.field1760 = new byte[var10];
            this.field1762 = new short[var10];
        }
        if (var13 == 255) {
            this.field1771 = new byte[var10];
        } else {
            this.field1763 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1792 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1749 = new int[var10];
        }
        this.field1776 = new short[var10];
        var4.field2052 = var21;
        var5.field2052 = var36;
        var6.field2052 = var38;
        var7.field2052 = var40;
        var8.field2052 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2522();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2415();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2415();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2415();
            }
            this.field1750[var46] = var43 + var48;
            this.field1751[var46] = var44 + var49;
            this.field1780[var46] = var45 + var50;
            var43 = this.field1750[var46];
            var44 = this.field1751[var46];
            var45 = this.field1780[var46];
            if (var16 == 1) {
                this.field1786[var46] = var8.method2522();
            }
        }
        var4.field2052 = var32;
        var5.field2052 = var28;
        var6.field2052 = var26;
        var7.field2052 = var30;
        var8.field2052 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1776[var51] = (short) var4.method2401();
            if (var12 == 1) {
                int var52 = var5.method2522();
                if ((var52 & 0x1) == 1) {
                    this.field1779[var51] = 1;
                    var2 = true;
                } else {
                    this.field1779[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1760[var51] = (byte) (var52 >> 2);
                    this.field1762[var51] = this.field1776[var51];
                    this.field1776[var51] = 127;
                    if (this.field1762[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1760[var51] = -1;
                    this.field1762[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1771[var51] = var6.method2400();
            }
            if (var14 == 1) {
                this.field1792[var51] = var7.method2400();
            }
            if (var15 == 1) {
                this.field1749[var51] = var8.method2522();
            }
        }
        var4.field2052 = var25;
        var5.field2052 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2522();
            if (var58 == 1) {
                var53 = var4.method2415() + var56;
                var54 = var4.method2415() + var53;
                var55 = var4.method2415() + var54;
                var56 = var55;
                this.field1754[var57] = var53;
                this.field1757[var57] = var54;
                this.field1794[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2415() + var56;
                var56 = var55;
                this.field1754[var57] = var53;
                this.field1757[var57] = var54;
                this.field1794[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2415() + var56;
                var56 = var55;
                this.field1754[var57] = var53;
                this.field1757[var57] = var54;
                this.field1794[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2415() + var56;
                var56 = var55;
                this.field1754[var57] = var53;
                this.field1757[var57] = var61;
                this.field1794[var57] = var55;
            }
        }
        var4.field2052 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1787[var62] = 0;
            this.field1766[var62] = (short) var4.method2401();
            this.field1767[var62] = (short) var4.method2401();
            this.field1768[var62] = (short) var4.method2401();
        }
        if (this.field1760 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1760[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1766[var65] & 0xFFFF) == this.field1754[var64] && (this.field1767[var65] & 0xFFFF) == this.field1757[var64] && (this.field1768[var65] & 0xFFFF) == this.field1794[var64]) {
                        this.field1760[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1760 = null;
            }
        }
        if (!var3) {
            this.field1762 = null;
        }
        if (!var2) {
            this.field1779 = null;
        }
    }

    public class104(class104[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1756 = 0;
        this.field1753 = 0;
        this.field1764 = 0;
        this.field1763 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class104 var10 = arg0[var9];
            if (var10 != null) {
                this.field1756 += var10.field1756;
                this.field1753 += var10.field1753;
                this.field1764 += var10.field1764;
                if (var10.field1771 == null) {
                    if (this.field1763 == -1) {
                        this.field1763 = var10.field1763;
                    }
                    if (this.field1763 != var10.field1763) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1779 != null;
                var5 |= var10.field1792 != null;
                var6 |= var10.field1749 != null;
                var7 |= var10.field1762 != null;
                var8 |= var10.field1760 != null;
            }
        }
        this.field1750 = new int[this.field1756];
        this.field1751 = new int[this.field1756];
        this.field1780 = new int[this.field1756];
        this.field1786 = new int[this.field1756];
        this.field1754 = new int[this.field1753];
        this.field1757 = new int[this.field1753];
        this.field1794 = new int[this.field1753];
        if (var3) {
            this.field1779 = new byte[this.field1753];
        }
        if (var4) {
            this.field1771 = new byte[this.field1753];
        }
        if (var5) {
            this.field1792 = new byte[this.field1753];
        }
        if (var6) {
            this.field1749 = new int[this.field1753];
        }
        if (var7) {
            this.field1762 = new short[this.field1753];
        }
        if (var8) {
            this.field1760 = new byte[this.field1753];
        }
        this.field1776 = new short[this.field1753];
        if (this.field1764 > 0) {
            this.field1787 = new byte[this.field1764];
            this.field1766 = new short[this.field1764];
            this.field1767 = new short[this.field1764];
            this.field1768 = new short[this.field1764];
            this.field1791 = new short[this.field1764];
            this.field1770 = new short[this.field1764];
            this.field1755 = new short[this.field1764];
            this.field1772 = new short[this.field1764];
            this.field1775 = new byte[this.field1764];
            this.field1773 = new short[this.field1764];
            this.field1774 = new short[this.field1764];
        }
        this.field1756 = 0;
        this.field1753 = 0;
        this.field1764 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class104 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1753; var13++) {
                    if (var3 && var12.field1779 != null) {
                        this.field1779[this.field1753] = var12.field1779[var13];
                    }
                    if (var4) {
                        if (var12.field1771 == null) {
                            this.field1771[this.field1753] = var12.field1763;
                        } else {
                            this.field1771[this.field1753] = var12.field1771[var13];
                        }
                    }
                    if (var5 && var12.field1792 != null) {
                        this.field1792[this.field1753] = var12.field1792[var13];
                    }
                    if (var6 && var12.field1749 != null) {
                        this.field1749[this.field1753] = var12.field1749[var13];
                    }
                    if (var7) {
                        if (var12.field1762 == null) {
                            this.field1762[this.field1753] = -1;
                        } else {
                            this.field1762[this.field1753] = var12.field1762[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1760 == null || var12.field1760[var13] == -1) {
                            this.field1760[this.field1753] = -1;
                        } else {
                            this.field1760[this.field1753] = (byte) (var12.field1760[var13] + this.field1764);
                        }
                    }
                    this.field1776[this.field1753] = var12.field1776[var13];
                    this.field1754[this.field1753] = this.method2116(var12, var12.field1754[var13]);
                    this.field1757[this.field1753] = this.method2116(var12, var12.field1757[var13]);
                    this.field1794[this.field1753] = this.method2116(var12, var12.field1794[var13]);
                    this.field1753++;
                }
                for (int var14 = 0; var14 < var12.field1764; var14++) {
                    byte var15 = this.field1787[this.field1764] = var12.field1787[var14];
                    if (var15 == 0) {
                        this.field1766[this.field1764] = (short) this.method2116(var12, var12.field1766[var14]);
                        this.field1767[this.field1764] = (short) this.method2116(var12, var12.field1767[var14]);
                        this.field1768[this.field1764] = (short) this.method2116(var12, var12.field1768[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1766[this.field1764] = var12.field1766[var14];
                        this.field1767[this.field1764] = var12.field1767[var14];
                        this.field1768[this.field1764] = var12.field1768[var14];
                        this.field1791[this.field1764] = var12.field1791[var14];
                        this.field1770[this.field1764] = var12.field1770[var14];
                        this.field1755[this.field1764] = var12.field1755[var14];
                        this.field1772[this.field1764] = var12.field1772[var14];
                        this.field1775[this.field1764] = var12.field1775[var14];
                        this.field1773[this.field1764] = var12.field1773[var14];
                    }
                    if (var15 == 2) {
                        this.field1774[this.field1764] = var12.field1774[var14];
                    }
                    this.field1764++;
                }
            }
        }
    }

    @ObfuscatedName("ca.v(Lca;I)I")
    public final int method2116(class104 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1750[arg1];
        int var5 = arg0.field1751[arg1];
        int var6 = arg0.field1780[arg1];
        for (int var7 = 0; var7 < this.field1756; var7++) {
            if (this.field1750[var7] == var4 && this.field1751[var7] == var5 && this.field1780[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1750[this.field1756] = var4;
            this.field1751[this.field1756] = var5;
            this.field1780[this.field1756] = var6;
            if (arg0.field1786 != null) {
                this.field1786[this.field1756] = arg0.field1786[arg1];
            }
            var3 = this.field1756++;
        }
        return var3;
    }

    public class104(class104 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1756 = arg0.field1756;
        this.field1753 = arg0.field1753;
        this.field1764 = arg0.field1764;
        if (arg1) {
            this.field1750 = arg0.field1750;
            this.field1751 = arg0.field1751;
            this.field1780 = arg0.field1780;
        } else {
            this.field1750 = new int[this.field1756];
            this.field1751 = new int[this.field1756];
            this.field1780 = new int[this.field1756];
            for (int var6 = 0; var6 < this.field1756; var6++) {
                this.field1750[var6] = arg0.field1750[var6];
                this.field1751[var6] = arg0.field1751[var6];
                this.field1780[var6] = arg0.field1780[var6];
            }
        }
        if (arg2) {
            this.field1776 = arg0.field1776;
        } else {
            this.field1776 = new short[this.field1753];
            for (int var7 = 0; var7 < this.field1753; var7++) {
                this.field1776[var7] = arg0.field1776[var7];
            }
        }
        if (arg3 || arg0.field1762 == null) {
            this.field1762 = arg0.field1762;
        } else {
            this.field1762 = new short[this.field1753];
            for (int var8 = 0; var8 < this.field1753; var8++) {
                this.field1762[var8] = arg0.field1762[var8];
            }
        }
        if (arg4) {
            this.field1792 = arg0.field1792;
        } else {
            this.field1792 = new byte[this.field1753];
            if (arg0.field1792 == null) {
                for (int var9 = 0; var9 < this.field1753; var9++) {
                    this.field1792[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1753; var10++) {
                    this.field1792[var10] = arg0.field1792[var10];
                }
            }
        }
        this.field1754 = arg0.field1754;
        this.field1757 = arg0.field1757;
        this.field1794 = arg0.field1794;
        this.field1779 = arg0.field1779;
        this.field1771 = arg0.field1771;
        this.field1760 = arg0.field1760;
        this.field1763 = arg0.field1763;
        this.field1787 = arg0.field1787;
        this.field1766 = arg0.field1766;
        this.field1767 = arg0.field1767;
        this.field1768 = arg0.field1768;
        this.field1791 = arg0.field1791;
        this.field1770 = arg0.field1770;
        this.field1755 = arg0.field1755;
        this.field1772 = arg0.field1772;
        this.field1775 = arg0.field1775;
        this.field1773 = arg0.field1773;
        this.field1774 = arg0.field1774;
        this.field1786 = arg0.field1786;
        this.field1749 = arg0.field1749;
        this.field1778 = arg0.field1778;
        this.field1777 = arg0.field1777;
        this.field1785 = arg0.field1785;
        this.field1758 = arg0.field1758;
        this.field1782 = arg0.field1782;
        this.field1783 = arg0.field1783;
        this.field1784 = arg0.field1784;
    }

    @ObfuscatedName("ca.b()Lca;")
    public class104 method2118() {
        class104 var1 = new class104();
        if (this.field1779 != null) {
            var1.field1779 = new byte[this.field1753];
            for (int var2 = 0; var2 < this.field1753; var2++) {
                var1.field1779[var2] = this.field1779[var2];
            }
        }
        var1.field1756 = this.field1756;
        var1.field1753 = this.field1753;
        var1.field1764 = this.field1764;
        var1.field1750 = this.field1750;
        var1.field1751 = this.field1751;
        var1.field1780 = this.field1780;
        var1.field1754 = this.field1754;
        var1.field1757 = this.field1757;
        var1.field1794 = this.field1794;
        var1.field1771 = this.field1771;
        var1.field1792 = this.field1792;
        var1.field1760 = this.field1760;
        var1.field1776 = this.field1776;
        var1.field1762 = this.field1762;
        var1.field1763 = this.field1763;
        var1.field1787 = this.field1787;
        var1.field1766 = this.field1766;
        var1.field1767 = this.field1767;
        var1.field1768 = this.field1768;
        var1.field1791 = this.field1791;
        var1.field1770 = this.field1770;
        var1.field1755 = this.field1755;
        var1.field1772 = this.field1772;
        var1.field1775 = this.field1775;
        var1.field1773 = this.field1773;
        var1.field1774 = this.field1774;
        var1.field1786 = this.field1786;
        var1.field1749 = this.field1749;
        var1.field1778 = this.field1778;
        var1.field1777 = this.field1777;
        var1.field1785 = this.field1785;
        var1.field1758 = this.field1758;
        var1.field1783 = this.field1783;
        var1.field1784 = this.field1784;
        return var1;
    }

    @ObfuscatedName("ca.m([[IIIIZI)Lca;")
    public class104 method2119(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2172();
        int var7 = this.field1765 + arg1;
        int var8 = this.field1788 + arg1;
        int var9 = this.field1790 + arg3;
        int var10 = this.field1789 + arg3;
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
            var15.field1756 = this.field1756;
            var15.field1753 = this.field1753;
            var15.field1764 = this.field1764;
            var15.field1750 = this.field1750;
            var15.field1780 = this.field1780;
            var15.field1754 = this.field1754;
            var15.field1757 = this.field1757;
            var15.field1794 = this.field1794;
            var15.field1779 = this.field1779;
            var15.field1771 = this.field1771;
            var15.field1792 = this.field1792;
            var15.field1760 = this.field1760;
            var15.field1776 = this.field1776;
            var15.field1762 = this.field1762;
            var15.field1763 = this.field1763;
            var15.field1787 = this.field1787;
            var15.field1766 = this.field1766;
            var15.field1767 = this.field1767;
            var15.field1768 = this.field1768;
            var15.field1791 = this.field1791;
            var15.field1770 = this.field1770;
            var15.field1755 = this.field1755;
            var15.field1772 = this.field1772;
            var15.field1775 = this.field1775;
            var15.field1773 = this.field1773;
            var15.field1774 = this.field1774;
            var15.field1786 = this.field1786;
            var15.field1749 = this.field1749;
            var15.field1778 = this.field1778;
            var15.field1777 = this.field1777;
            var15.field1783 = this.field1783;
            var15.field1784 = this.field1784;
            var15.field1751 = new int[var15.field1756];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1756; var16++) {
                int var17 = this.field1750[var16] + arg1;
                int var18 = this.field1780[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1751[var16] = this.field1751[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1756; var26++) {
                int var27 = (-this.field1751[var26] << 16) / this.field1518;
                if (var27 < arg5) {
                    int var28 = this.field1750[var26] + arg1;
                    int var29 = this.field1780[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1751[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1751[var26];
                }
            }
        }
        var15.method2131();
        return var15;
    }

    @ObfuscatedName("ca.k()V")
    public void method2120() {
        int var10002;
        if (this.field1786 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1756; var3++) {
                int var4 = this.field1786[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1778 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1778[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1756) {
                int var7 = this.field1786[var6];
                this.field1778[var7][var1[var7]++] = var6++;
            }
            this.field1786 = null;
        }
        if (this.field1749 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1753; var10++) {
            int var11 = this.field1749[var10];
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
        while (var13 < this.field1753) {
            int var14 = this.field1749[var13];
            this.field1777[var14][var8[var14]++] = var13++;
        }
        this.field1749 = null;
    }

    @ObfuscatedName("ca.c()V")
    public void method2121() {
        for (int var1 = 0; var1 < this.field1756; var1++) {
            int var2 = this.field1750[var1];
            this.field1750[var1] = this.field1780[var1];
            this.field1780[var1] = -var2;
        }
        this.method2131();
    }

    @ObfuscatedName("ca.w()V")
    public void method2179() {
        for (int var1 = 0; var1 < this.field1756; var1++) {
            this.field1750[var1] = -this.field1750[var1];
            this.field1780[var1] = -this.field1780[var1];
        }
        this.method2131();
    }

    @ObfuscatedName("ca.i()V")
    public void method2123() {
        for (int var1 = 0; var1 < this.field1756; var1++) {
            int var2 = this.field1780[var1];
            this.field1780[var1] = this.field1750[var1];
            this.field1750[var1] = -var2;
        }
        this.method2131();
    }

    @ObfuscatedName("ca.u(I)V")
    public void method2137(int arg0) {
        int var2 = field1752[arg0];
        int var3 = field1795[arg0];
        for (int var4 = 0; var4 < this.field1756; var4++) {
            int var5 = this.field1780[var4] * var2 + this.field1750[var4] * var3 >> 16;
            this.field1780[var4] = this.field1780[var4] * var3 - this.field1750[var4] * var2 >> 16;
            this.field1750[var4] = var5;
        }
        this.method2131();
    }

    @ObfuscatedName("ca.x(III)V")
    public void method2125(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1756; var4++) {
            this.field1750[var4] += arg0;
            this.field1751[var4] += arg1;
            this.field1780[var4] += arg2;
        }
        this.method2131();
    }

    @ObfuscatedName("ca.d(SS)V")
    public void method2126(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1753; var3++) {
            if (this.field1776[var3] == arg0) {
                this.field1776[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ca.o(SS)V")
    public void method2127(short arg0, short arg1) {
        if (this.field1762 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1753; var3++) {
            if (this.field1762[var3] == arg0) {
                this.field1762[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ca.j()V")
    public void method2162() {
        for (int var1 = 0; var1 < this.field1756; var1++) {
            this.field1780[var1] = -this.field1780[var1];
        }
        for (int var2 = 0; var2 < this.field1753; var2++) {
            int var3 = this.field1754[var2];
            this.field1754[var2] = this.field1794[var2];
            this.field1794[var2] = var3;
        }
        this.method2131();
    }

    @ObfuscatedName("ca.q(III)V")
    public void method2129(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1756; var4++) {
            this.field1750[var4] = this.field1750[var4] * arg0 / 128;
            this.field1751[var4] = this.field1751[var4] * arg1 / 128;
            this.field1780[var4] = this.field1780[var4] * arg2 / 128;
        }
        this.method2131();
    }

    @ObfuscatedName("ca.r()V")
    public void method2185() {
        if (this.field1785 != null) {
            return;
        }
        this.field1785 = new class100[this.field1756];
        for (int var1 = 0; var1 < this.field1756; var1++) {
            this.field1785[var1] = new class100();
        }
        for (int var2 = 0; var2 < this.field1753; var2++) {
            int var3 = this.field1754[var2];
            int var4 = this.field1757[var2];
            int var5 = this.field1794[var2];
            int var6 = this.field1750[var4] - this.field1750[var3];
            int var7 = this.field1751[var4] - this.field1751[var3];
            int var8 = this.field1780[var4] - this.field1780[var3];
            int var9 = this.field1750[var5] - this.field1750[var3];
            int var10 = this.field1751[var5] - this.field1751[var3];
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
            if (this.field1779 == null) {
                var19 = 0;
            } else {
                var19 = this.field1779[var2];
            }
            if (var19 == 0) {
                class100 var20 = this.field1785[var3];
                var20.field1691 += var16;
                var20.field1688 += var17;
                var20.field1689 += var18;
                var20.field1690++;
                class100 var21 = this.field1785[var4];
                var21.field1691 += var16;
                var21.field1688 += var17;
                var21.field1689 += var18;
                var21.field1690++;
                class100 var22 = this.field1785[var5];
                var22.field1691 += var16;
                var22.field1688 += var17;
                var22.field1689 += var18;
                var22.field1690++;
            } else if (var19 == 1) {
                if (this.field1758 == null) {
                    this.field1758 = new class88[this.field1753];
                }
                class88 var23 = this.field1758[var2] = new class88();
                var23.field1509 = var16;
                var23.field1507 = var17;
                var23.field1508 = var18;
            }
        }
    }

    @ObfuscatedName("ca.a()V")
    public void method2131() {
        this.field1785 = null;
        this.field1782 = null;
        this.field1758 = null;
        this.field1759 = false;
    }

    @ObfuscatedName("ca.z()V")
    public void method2172() {
        if (this.field1759) {
            return;
        }
        this.field1518 = 0;
        this.field1769 = 0;
        this.field1765 = 999999;
        this.field1788 = -999999;
        this.field1789 = -99999;
        this.field1790 = 99999;
        for (int var1 = 0; var1 < this.field1756; var1++) {
            int var2 = this.field1750[var1];
            int var3 = this.field1751[var1];
            int var4 = this.field1780[var1];
            if (var2 < this.field1765) {
                this.field1765 = var2;
            }
            if (var2 > this.field1788) {
                this.field1788 = var2;
            }
            if (var4 < this.field1790) {
                this.field1790 = var4;
            }
            if (var4 > this.field1789) {
                this.field1789 = var4;
            }
            if (-var3 > this.field1518) {
                this.field1518 = -var3;
            }
            if (var3 > this.field1769) {
                this.field1769 = var3;
            }
        }
        this.field1759 = true;
    }

    @ObfuscatedName("ca.p(Lca;Lca;IIIZ)V")
    public static void method2184(class104 arg0, class104 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2172();
        arg0.method2185();
        arg1.method2172();
        arg1.method2185();
        field1793++;
        int var6 = 0;
        int[] var7 = arg1.field1750;
        int var8 = arg1.field1756;
        for (int var9 = 0; var9 < arg0.field1756; var9++) {
            class100 var10 = arg0.field1785[var9];
            if (var10.field1690 != 0) {
                int var11 = arg0.field1751[var9] - arg3;
                if (var11 <= arg1.field1769) {
                    int var12 = arg0.field1750[var9] - arg2;
                    if (var12 >= arg1.field1765 && var12 <= arg1.field1788) {
                        int var13 = arg0.field1780[var9] - arg4;
                        if (var13 >= arg1.field1790 && var13 <= arg1.field1789) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class100 var15 = arg1.field1785[var14];
                                if (var7[var14] == var12 && arg1.field1780[var14] == var13 && arg1.field1751[var14] == var11 && var15.field1690 != 0) {
                                    if (arg0.field1782 == null) {
                                        arg0.field1782 = new class100[arg0.field1756];
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
                                    var16.field1691 += var15.field1691;
                                    var16.field1688 += var15.field1688;
                                    var16.field1689 += var15.field1689;
                                    var16.field1690 += var15.field1690;
                                    var17.field1691 += var10.field1691;
                                    var17.field1688 += var10.field1688;
                                    var17.field1689 += var10.field1689;
                                    var17.field1690 += var10.field1690;
                                    var6++;
                                    field1761[var9] = field1793;
                                    field1781[var14] = field1793;
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
        for (int var18 = 0; var18 < arg0.field1753; var18++) {
            if (field1761[arg0.field1754[var18]] == field1793 && field1761[arg0.field1757[var18]] == field1793 && field1761[arg0.field1794[var18]] == field1793) {
                if (arg0.field1779 == null) {
                    arg0.field1779 = new byte[arg0.field1753];
                }
                arg0.field1779[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1753; var19++) {
            if (field1781[arg1.field1754[var19]] == field1793 && field1781[arg1.field1757[var19]] == field1793 && field1781[arg1.field1794[var19]] == field1793) {
                if (arg1.field1779 == null) {
                    arg1.field1779 = new byte[arg1.field1753];
                }
                arg1.field1779[var19] = 2;
            }
        }
    }

    @ObfuscatedName("ca.y(IIIII)Ldg;")
    public final class109 method2134(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2185();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class109 var8 = new class109();
        var8.field1872 = new int[this.field1753];
        var8.field1873 = new int[this.field1753];
        var8.field1874 = new int[this.field1753];
        if (this.field1764 > 0 && this.field1760 != null) {
            int[] var9 = new int[this.field1764];
            for (int var10 = 0; var10 < this.field1753; var10++) {
                if (this.field1760[var10] != -1) {
                    var9[this.field1760[var10] & 0xFF]++;
                }
            }
            var8.field1880 = 0;
            for (int var11 = 0; var11 < this.field1764; var11++) {
                if (var9[var11] > 0 && this.field1787[var11] == 0) {
                    var8.field1880++;
                }
            }
            var8.field1881 = new int[var8.field1880];
            var8.field1882 = new int[var8.field1880];
            var8.field1883 = new int[var8.field1880];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1764; var13++) {
                if (var9[var13] > 0 && this.field1787[var13] == 0) {
                    var8.field1881[var12] = this.field1766[var13] & 0xFFFF;
                    var8.field1882[var12] = this.field1767[var13] & 0xFFFF;
                    var8.field1883[var12] = this.field1768[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1877 = new byte[this.field1753];
            for (int var14 = 0; var14 < this.field1753; var14++) {
                if (this.field1760[var14] == -1) {
                    var8.field1877[var14] = -1;
                } else {
                    var8.field1877[var14] = (byte) var9[this.field1760[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1753; var15++) {
            byte var16;
            if (this.field1779 == null) {
                var16 = 0;
            } else {
                var16 = this.field1779[var15];
            }
            byte var17;
            if (this.field1792 == null) {
                var17 = 0;
            } else {
                var17 = this.field1792[var15];
            }
            short var18;
            if (this.field1762 == null) {
                var18 = -1;
            } else {
                var18 = this.field1762[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1776[var15] & 0xFFFF;
                    class100 var20;
                    if (this.field1782 == null || this.field1782[this.field1754[var15]] == null) {
                        var20 = this.field1785[this.field1754[var15]];
                    } else {
                        var20 = this.field1782[this.field1754[var15]];
                    }
                    int var21 = (var20.field1689 * arg4 + var20.field1691 * arg2 + var20.field1688 * arg3) / (var20.field1690 * var7) + arg0;
                    var8.field1872[var15] = method2135(var19, var21);
                    class100 var22;
                    if (this.field1782 == null || this.field1782[this.field1757[var15]] == null) {
                        var22 = this.field1785[this.field1757[var15]];
                    } else {
                        var22 = this.field1782[this.field1757[var15]];
                    }
                    int var23 = (var22.field1689 * arg4 + var22.field1691 * arg2 + var22.field1688 * arg3) / (var22.field1690 * var7) + arg0;
                    var8.field1873[var15] = method2135(var19, var23);
                    class100 var24;
                    if (this.field1782 == null || this.field1782[this.field1794[var15]] == null) {
                        var24 = this.field1785[this.field1794[var15]];
                    } else {
                        var24 = this.field1782[this.field1794[var15]];
                    }
                    int var25 = (var24.field1689 * arg4 + var24.field1691 * arg2 + var24.field1688 * arg3) / (var24.field1690 * var7) + arg0;
                    var8.field1874[var15] = method2135(var19, var25);
                } else if (var16 == 1) {
                    class88 var26 = this.field1758[var15];
                    int var27 = (var26.field1508 * arg4 + var26.field1509 * arg2 + var26.field1507 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1872[var15] = method2135(this.field1776[var15] & 0xFFFF, var27);
                    var8.field1874[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1872[var15] = 128;
                    var8.field1874[var15] = -1;
                } else {
                    var8.field1874[var15] = -2;
                }
            } else if (var16 == 0) {
                class100 var28;
                if (this.field1782 == null || this.field1782[this.field1754[var15]] == null) {
                    var28 = this.field1785[this.field1754[var15]];
                } else {
                    var28 = this.field1782[this.field1754[var15]];
                }
                int var29 = (var28.field1689 * arg4 + var28.field1691 * arg2 + var28.field1688 * arg3) / (var28.field1690 * var7) + arg0;
                var8.field1872[var15] = method2136(var29);
                class100 var30;
                if (this.field1782 == null || this.field1782[this.field1757[var15]] == null) {
                    var30 = this.field1785[this.field1757[var15]];
                } else {
                    var30 = this.field1782[this.field1757[var15]];
                }
                int var31 = (var30.field1689 * arg4 + var30.field1691 * arg2 + var30.field1688 * arg3) / (var30.field1690 * var7) + arg0;
                var8.field1873[var15] = method2136(var31);
                class100 var32;
                if (this.field1782 == null || this.field1782[this.field1794[var15]] == null) {
                    var32 = this.field1785[this.field1794[var15]];
                } else {
                    var32 = this.field1782[this.field1794[var15]];
                }
                int var33 = (var32.field1689 * arg4 + var32.field1691 * arg2 + var32.field1688 * arg3) / (var32.field1690 * var7) + arg0;
                var8.field1874[var15] = method2136(var33);
            } else if (var16 == 1) {
                class88 var34 = this.field1758[var15];
                int var35 = (var34.field1508 * arg4 + var34.field1509 * arg2 + var34.field1507 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1872[var15] = method2136(var35);
                var8.field1874[var15] = -1;
            } else {
                var8.field1874[var15] = -2;
            }
        }
        this.method2120();
        var8.field1864 = this.field1756;
        var8.field1896 = this.field1750;
        var8.field1866 = this.field1751;
        var8.field1867 = this.field1780;
        var8.field1868 = this.field1753;
        var8.field1869 = this.field1754;
        var8.field1924 = this.field1757;
        var8.field1871 = this.field1794;
        var8.field1892 = this.field1771;
        var8.field1876 = this.field1792;
        var8.field1879 = this.field1763;
        var8.field1884 = this.field1778;
        var8.field1885 = this.field1777;
        var8.field1895 = this.field1762;
        return var8;
    }

    @ObfuscatedName("ca.s(II)I")
    public static final int method2135(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("ca.g(I)I")
    public static final int method2136(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
