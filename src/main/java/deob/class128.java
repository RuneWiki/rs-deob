package deob;

@ObfuscatedName("dj")
public class class128 extends class142 {

    @ObfuscatedName("dj.c")
    public int field1781 = 0;

    @ObfuscatedName("dj.o")
    public int[] field1753;

    @ObfuscatedName("dj.i")
    public int[] field1754;

    @ObfuscatedName("dj.u")
    public int[] field1755;

    @ObfuscatedName("dj.g")
    public int field1756 = 0;

    @ObfuscatedName("dj.m")
    public int[] field1759;

    @ObfuscatedName("dj.s")
    public int[] field1758;

    @ObfuscatedName("dj.x")
    public int[] field1790;

    @ObfuscatedName("dj.p")
    public byte[] field1760;

    @ObfuscatedName("dj.k")
    public byte[] field1791;

    @ObfuscatedName("dj.r")
    public byte[] field1762;

    @ObfuscatedName("dj.w")
    public byte[] field1763;

    @ObfuscatedName("dj.v")
    public short[] field1785;

    @ObfuscatedName("dj.h")
    public short[] field1792;

    @ObfuscatedName("dj.t")
    public byte field1766 = 0;

    @ObfuscatedName("dj.a")
    public int field1767;

    @ObfuscatedName("dj.e")
    public byte[] field1768;

    @ObfuscatedName("dj.y")
    public short[] field1786;

    @ObfuscatedName("dj.l")
    public short[] field1770;

    @ObfuscatedName("dj.q")
    public short[] field1771;

    @ObfuscatedName("dj.f")
    public short[] field1769;

    @ObfuscatedName("dj.j")
    public short[] field1773;

    @ObfuscatedName("dj.n")
    public short[] field1774;

    @ObfuscatedName("dj.z")
    public short[] field1761;

    @ObfuscatedName("dj.b")
    public short[] field1776;

    @ObfuscatedName("dj.d")
    public short[] field1777;

    @ObfuscatedName("dj.ap")
    public byte[] field1778;

    @ObfuscatedName("dj.aj")
    public int[] field1779;

    @ObfuscatedName("dj.am")
    public int[] field1788;

    @ObfuscatedName("dj.ag")
    public int[][] field1797;

    @ObfuscatedName("dj.av")
    public int[][] field1775;

    @ObfuscatedName("dj.al")
    public class144[] field1757;

    @ObfuscatedName("dj.ab")
    public class136[] field1784;

    @ObfuscatedName("dj.af")
    public class136[] field1787;

    @ObfuscatedName("dj.ak")
    public short field1764;

    @ObfuscatedName("dj.ar")
    public short field1772;

    @ObfuscatedName("dj.an")
    public boolean field1752 = false;

    @ObfuscatedName("dj.at")
    public int field1789;

    @ObfuscatedName("dj.aw")
    public int field1780;

    @ObfuscatedName("dj.ad")
    public int field1782;

    @ObfuscatedName("dj.ac")
    public int field1783;

    @ObfuscatedName("dj.ae")
    public int field1793;

    @ObfuscatedName("dj.ah")
    public static int[] field1794 = new int[10000];

    @ObfuscatedName("dj.ax")
    public static int[] field1795 = new int[10000];

    @ObfuscatedName("dj.ai")
    public static int field1796 = 0;

    @ObfuscatedName("dj.aa")
    public static int[] field1765 = class137.field1983;

    @ObfuscatedName("dj.aq")
    public static int[] field1798 = class137.field1973;

    public class128() {
    }

    @ObfuscatedName("dj.c(Lip;II)Ldj;")
    public static class128 method2138(class236 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3741(arg1, arg2);
        return var3 == null ? null : new class128(var3);
    }

    public class128(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2140(arg0);
        } else {
            this.method2141(arg0);
        }
    }

    @ObfuscatedName("dj.o([B)V")
    public void method2140(byte[] arg0) {
        class174 var2 = new class174(arg0);
        class174 var3 = new class174(arg0);
        class174 var4 = new class174(arg0);
        class174 var5 = new class174(arg0);
        class174 var6 = new class174(arg0);
        class174 var7 = new class174(arg0);
        class174 var8 = new class174(arg0);
        var2.field2357 = arg0.length - 23;
        int var9 = var2.method2861();
        int var10 = var2.method2861();
        int var11 = var2.method2843();
        int var12 = var2.method2843();
        int var13 = var2.method2843();
        int var14 = var2.method2843();
        int var15 = var2.method2843();
        int var16 = var2.method2843();
        int var17 = var2.method2843();
        int var18 = var2.method2861();
        int var19 = var2.method2861();
        int var20 = var2.method2861();
        int var21 = var2.method2861();
        int var22 = var2.method2861();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1768 = new byte[var11];
            var2.field2357 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1768[var26] = var2.method3014();
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
        this.field1781 = var9;
        this.field1756 = var10;
        this.field1767 = var11;
        this.field1753 = new int[var9];
        this.field1754 = new int[var9];
        this.field1755 = new int[var9];
        this.field1759 = new int[var10];
        this.field1758 = new int[var10];
        this.field1790 = new int[var10];
        if (var17 == 1) {
            this.field1779 = new int[var9];
        }
        if (var12 == 1) {
            this.field1760 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1791 = new byte[var10];
        } else {
            this.field1766 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1762 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1788 = new int[var10];
        }
        if (var16 == 1) {
            this.field1792 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1763 = new byte[var10];
        }
        this.field1785 = new short[var10];
        if (var11 > 0) {
            this.field1786 = new short[var11];
            this.field1770 = new short[var11];
            this.field1771 = new short[var11];
            if (var24 > 0) {
                this.field1769 = new short[var24];
                this.field1773 = new short[var24];
                this.field1774 = new short[var24];
                this.field1761 = new short[var24];
                this.field1778 = new byte[var24];
                this.field1776 = new short[var24];
            }
            if (var25 > 0) {
                this.field1777 = new short[var25];
            }
        }
        var2.field2357 = var11;
        var3.field2357 = var44;
        var4.field2357 = var46;
        var5.field2357 = var48;
        var6.field2357 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2843();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2871();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2871();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2871();
            }
            this.field1753[var67] = var64 + var69;
            this.field1754[var67] = var65 + var70;
            this.field1755[var67] = var66 + var71;
            var64 = this.field1753[var67];
            var65 = this.field1754[var67];
            var66 = this.field1755[var67];
            if (var17 == 1) {
                this.field1779[var67] = var6.method2843();
            }
        }
        var2.field2357 = var42;
        var3.field2357 = var31;
        var4.field2357 = var34;
        var5.field2357 = var37;
        var6.field2357 = var35;
        var7.field2357 = var40;
        var8.field2357 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1785[var72] = (short) var2.method2861();
            if (var12 == 1) {
                this.field1760[var72] = var3.method3014();
            }
            if (var13 == 255) {
                this.field1791[var72] = var4.method3014();
            }
            if (var14 == 1) {
                this.field1762[var72] = var5.method3014();
            }
            if (var15 == 1) {
                this.field1788[var72] = var6.method2843();
            }
            if (var16 == 1) {
                this.field1792[var72] = (short) (var7.method2861() - 1);
            }
            if (this.field1763 != null && this.field1792[var72] != -1) {
                this.field1763[var72] = (byte) (var8.method2843() - 1);
            }
        }
        var2.field2357 = var33;
        var3.field2357 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2843();
            if (var78 == 1) {
                var73 = var2.method2871() + var76;
                var74 = var2.method2871() + var73;
                var75 = var2.method2871() + var74;
                var76 = var75;
                this.field1759[var77] = var73;
                this.field1758[var77] = var74;
                this.field1790[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2871() + var76;
                var76 = var75;
                this.field1759[var77] = var73;
                this.field1758[var77] = var74;
                this.field1790[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2871() + var76;
                var76 = var75;
                this.field1759[var77] = var73;
                this.field1758[var77] = var74;
                this.field1790[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2871() + var76;
                var76 = var75;
                this.field1759[var77] = var73;
                this.field1758[var77] = var81;
                this.field1790[var77] = var75;
            }
        }
        var2.field2357 = var50;
        var3.field2357 = var52;
        var4.field2357 = var54;
        var5.field2357 = var56;
        var6.field2357 = var58;
        var7.field2357 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1768[var82] & 0xFF;
            if (var83 == 0) {
                this.field1786[var82] = (short) var2.method2861();
                this.field1770[var82] = (short) var2.method2861();
                this.field1771[var82] = (short) var2.method2861();
            }
            if (var83 == 1) {
                this.field1786[var82] = (short) var3.method2861();
                this.field1770[var82] = (short) var3.method2861();
                this.field1771[var82] = (short) var3.method2861();
                this.field1769[var82] = (short) var4.method2861();
                this.field1773[var82] = (short) var4.method2861();
                this.field1774[var82] = (short) var4.method2861();
                this.field1761[var82] = (short) var5.method2861();
                this.field1778[var82] = var6.method3014();
                this.field1776[var82] = (short) var7.method2861();
            }
            if (var83 == 2) {
                this.field1786[var82] = (short) var3.method2861();
                this.field1770[var82] = (short) var3.method2861();
                this.field1771[var82] = (short) var3.method2861();
                this.field1769[var82] = (short) var4.method2861();
                this.field1773[var82] = (short) var4.method2861();
                this.field1774[var82] = (short) var4.method2861();
                this.field1761[var82] = (short) var5.method2861();
                this.field1778[var82] = var6.method3014();
                this.field1776[var82] = (short) var7.method2861();
                this.field1777[var82] = (short) var7.method2861();
            }
            if (var83 == 3) {
                this.field1786[var82] = (short) var3.method2861();
                this.field1770[var82] = (short) var3.method2861();
                this.field1771[var82] = (short) var3.method2861();
                this.field1769[var82] = (short) var4.method2861();
                this.field1773[var82] = (short) var4.method2861();
                this.field1774[var82] = (short) var4.method2861();
                this.field1761[var82] = (short) var5.method2861();
                this.field1778[var82] = var6.method3014();
                this.field1776[var82] = (short) var7.method2861();
            }
        }
        var2.field2357 = var62;
        int var84 = var2.method2843();
        if (var84 == 0) {
            return;
        }
        new class141();
        var2.method2861();
        var2.method2861();
        var2.method2861();
        var2.method2987();
    }

    @ObfuscatedName("dj.u([B)V")
    public void method2141(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class174 var4 = new class174(arg0);
        class174 var5 = new class174(arg0);
        class174 var6 = new class174(arg0);
        class174 var7 = new class174(arg0);
        class174 var8 = new class174(arg0);
        var4.field2357 = arg0.length - 18;
        int var9 = var4.method2861();
        int var10 = var4.method2861();
        int var11 = var4.method2843();
        int var12 = var4.method2843();
        int var13 = var4.method2843();
        int var14 = var4.method2843();
        int var15 = var4.method2843();
        int var16 = var4.method2843();
        int var17 = var4.method2861();
        int var18 = var4.method2861();
        int var19 = var4.method2861();
        int var20 = var4.method2861();
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
        this.field1781 = var9;
        this.field1756 = var10;
        this.field1767 = var11;
        this.field1753 = new int[var9];
        this.field1754 = new int[var9];
        this.field1755 = new int[var9];
        this.field1759 = new int[var10];
        this.field1758 = new int[var10];
        this.field1790 = new int[var10];
        if (var11 > 0) {
            this.field1768 = new byte[var11];
            this.field1786 = new short[var11];
            this.field1770 = new short[var11];
            this.field1771 = new short[var11];
        }
        if (var16 == 1) {
            this.field1779 = new int[var9];
        }
        if (var12 == 1) {
            this.field1760 = new byte[var10];
            this.field1763 = new byte[var10];
            this.field1792 = new short[var10];
        }
        if (var13 == 255) {
            this.field1791 = new byte[var10];
        } else {
            this.field1766 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1762 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1788 = new int[var10];
        }
        this.field1785 = new short[var10];
        var4.field2357 = var21;
        var5.field2357 = var36;
        var6.field2357 = var38;
        var7.field2357 = var40;
        var8.field2357 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2843();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2871();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2871();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2871();
            }
            this.field1753[var46] = var43 + var48;
            this.field1754[var46] = var44 + var49;
            this.field1755[var46] = var45 + var50;
            var43 = this.field1753[var46];
            var44 = this.field1754[var46];
            var45 = this.field1755[var46];
            if (var16 == 1) {
                this.field1779[var46] = var8.method2843();
            }
        }
        var4.field2357 = var32;
        var5.field2357 = var28;
        var6.field2357 = var26;
        var7.field2357 = var30;
        var8.field2357 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1785[var51] = (short) var4.method2861();
            if (var12 == 1) {
                int var52 = var5.method2843();
                if ((var52 & 0x1) == 1) {
                    this.field1760[var51] = 1;
                    var2 = true;
                } else {
                    this.field1760[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1763[var51] = (byte) (var52 >> 2);
                    this.field1792[var51] = this.field1785[var51];
                    this.field1785[var51] = 127;
                    if (this.field1792[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1763[var51] = -1;
                    this.field1792[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1791[var51] = var6.method3014();
            }
            if (var14 == 1) {
                this.field1762[var51] = var7.method3014();
            }
            if (var15 == 1) {
                this.field1788[var51] = var8.method2843();
            }
        }
        var4.field2357 = var25;
        var5.field2357 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2843();
            if (var58 == 1) {
                var53 = var4.method2871() + var56;
                var54 = var4.method2871() + var53;
                var55 = var4.method2871() + var54;
                var56 = var55;
                this.field1759[var57] = var53;
                this.field1758[var57] = var54;
                this.field1790[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2871() + var56;
                var56 = var55;
                this.field1759[var57] = var53;
                this.field1758[var57] = var54;
                this.field1790[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2871() + var56;
                var56 = var55;
                this.field1759[var57] = var53;
                this.field1758[var57] = var54;
                this.field1790[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2871() + var56;
                var56 = var55;
                this.field1759[var57] = var53;
                this.field1758[var57] = var61;
                this.field1790[var57] = var55;
            }
        }
        var4.field2357 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1768[var62] = 0;
            this.field1786[var62] = (short) var4.method2861();
            this.field1770[var62] = (short) var4.method2861();
            this.field1771[var62] = (short) var4.method2861();
        }
        if (this.field1763 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1763[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1786[var65] & 0xFFFF) == this.field1759[var64] && (this.field1770[var65] & 0xFFFF) == this.field1758[var64] && (this.field1771[var65] & 0xFFFF) == this.field1790[var64]) {
                        this.field1763[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1763 = null;
            }
        }
        if (!var3) {
            this.field1792 = null;
        }
        if (!var2) {
            this.field1760 = null;
        }
    }

    public class128(class128[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1781 = 0;
        this.field1756 = 0;
        this.field1767 = 0;
        this.field1766 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class128 var10 = arg0[var9];
            if (var10 != null) {
                this.field1781 += var10.field1781;
                this.field1756 += var10.field1756;
                this.field1767 += var10.field1767;
                if (var10.field1791 == null) {
                    if (this.field1766 == -1) {
                        this.field1766 = var10.field1766;
                    }
                    if (this.field1766 != var10.field1766) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1760 != null;
                var5 |= var10.field1762 != null;
                var6 |= var10.field1788 != null;
                var7 |= var10.field1792 != null;
                var8 |= var10.field1763 != null;
            }
        }
        this.field1753 = new int[this.field1781];
        this.field1754 = new int[this.field1781];
        this.field1755 = new int[this.field1781];
        this.field1779 = new int[this.field1781];
        this.field1759 = new int[this.field1756];
        this.field1758 = new int[this.field1756];
        this.field1790 = new int[this.field1756];
        if (var3) {
            this.field1760 = new byte[this.field1756];
        }
        if (var4) {
            this.field1791 = new byte[this.field1756];
        }
        if (var5) {
            this.field1762 = new byte[this.field1756];
        }
        if (var6) {
            this.field1788 = new int[this.field1756];
        }
        if (var7) {
            this.field1792 = new short[this.field1756];
        }
        if (var8) {
            this.field1763 = new byte[this.field1756];
        }
        this.field1785 = new short[this.field1756];
        if (this.field1767 > 0) {
            this.field1768 = new byte[this.field1767];
            this.field1786 = new short[this.field1767];
            this.field1770 = new short[this.field1767];
            this.field1771 = new short[this.field1767];
            this.field1769 = new short[this.field1767];
            this.field1773 = new short[this.field1767];
            this.field1774 = new short[this.field1767];
            this.field1761 = new short[this.field1767];
            this.field1778 = new byte[this.field1767];
            this.field1776 = new short[this.field1767];
            this.field1777 = new short[this.field1767];
        }
        this.field1781 = 0;
        this.field1756 = 0;
        this.field1767 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class128 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1756; var13++) {
                    if (var3 && var12.field1760 != null) {
                        this.field1760[this.field1756] = var12.field1760[var13];
                    }
                    if (var4) {
                        if (var12.field1791 == null) {
                            this.field1791[this.field1756] = var12.field1766;
                        } else {
                            this.field1791[this.field1756] = var12.field1791[var13];
                        }
                    }
                    if (var5 && var12.field1762 != null) {
                        this.field1762[this.field1756] = var12.field1762[var13];
                    }
                    if (var6 && var12.field1788 != null) {
                        this.field1788[this.field1756] = var12.field1788[var13];
                    }
                    if (var7) {
                        if (var12.field1792 == null) {
                            this.field1792[this.field1756] = -1;
                        } else {
                            this.field1792[this.field1756] = var12.field1792[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1763 == null || var12.field1763[var13] == -1) {
                            this.field1763[this.field1756] = -1;
                        } else {
                            this.field1763[this.field1756] = (byte) (var12.field1763[var13] + this.field1767);
                        }
                    }
                    this.field1785[this.field1756] = var12.field1785[var13];
                    this.field1759[this.field1756] = this.method2143(var12, var12.field1759[var13]);
                    this.field1758[this.field1756] = this.method2143(var12, var12.field1758[var13]);
                    this.field1790[this.field1756] = this.method2143(var12, var12.field1790[var13]);
                    this.field1756++;
                }
                for (int var14 = 0; var14 < var12.field1767; var14++) {
                    byte var15 = this.field1768[this.field1767] = var12.field1768[var14];
                    if (var15 == 0) {
                        this.field1786[this.field1767] = (short) this.method2143(var12, var12.field1786[var14]);
                        this.field1770[this.field1767] = (short) this.method2143(var12, var12.field1770[var14]);
                        this.field1771[this.field1767] = (short) this.method2143(var12, var12.field1771[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1786[this.field1767] = var12.field1786[var14];
                        this.field1770[this.field1767] = var12.field1770[var14];
                        this.field1771[this.field1767] = var12.field1771[var14];
                        this.field1769[this.field1767] = var12.field1769[var14];
                        this.field1773[this.field1767] = var12.field1773[var14];
                        this.field1774[this.field1767] = var12.field1774[var14];
                        this.field1761[this.field1767] = var12.field1761[var14];
                        this.field1778[this.field1767] = var12.field1778[var14];
                        this.field1776[this.field1767] = var12.field1776[var14];
                    }
                    if (var15 == 2) {
                        this.field1777[this.field1767] = var12.field1777[var14];
                    }
                    this.field1767++;
                }
            }
        }
    }

    @ObfuscatedName("dj.g(Ldj;I)I")
    public final int method2143(class128 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1753[arg1];
        int var5 = arg0.field1754[arg1];
        int var6 = arg0.field1755[arg1];
        for (int var7 = 0; var7 < this.field1781; var7++) {
            if (this.field1753[var7] == var4 && this.field1754[var7] == var5 && this.field1755[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1753[this.field1781] = var4;
            this.field1754[this.field1781] = var5;
            this.field1755[this.field1781] = var6;
            if (arg0.field1779 != null) {
                this.field1779[this.field1781] = arg0.field1779[arg1];
            }
            var3 = this.field1781++;
        }
        return var3;
    }

    public class128(class128 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1781 = arg0.field1781;
        this.field1756 = arg0.field1756;
        this.field1767 = arg0.field1767;
        if (arg1) {
            this.field1753 = arg0.field1753;
            this.field1754 = arg0.field1754;
            this.field1755 = arg0.field1755;
        } else {
            this.field1753 = new int[this.field1781];
            this.field1754 = new int[this.field1781];
            this.field1755 = new int[this.field1781];
            for (int var6 = 0; var6 < this.field1781; var6++) {
                this.field1753[var6] = arg0.field1753[var6];
                this.field1754[var6] = arg0.field1754[var6];
                this.field1755[var6] = arg0.field1755[var6];
            }
        }
        if (arg2) {
            this.field1785 = arg0.field1785;
        } else {
            this.field1785 = new short[this.field1756];
            for (int var7 = 0; var7 < this.field1756; var7++) {
                this.field1785[var7] = arg0.field1785[var7];
            }
        }
        if (arg3 || arg0.field1792 == null) {
            this.field1792 = arg0.field1792;
        } else {
            this.field1792 = new short[this.field1756];
            for (int var8 = 0; var8 < this.field1756; var8++) {
                this.field1792[var8] = arg0.field1792[var8];
            }
        }
        if (arg4) {
            this.field1762 = arg0.field1762;
        } else {
            this.field1762 = new byte[this.field1756];
            if (arg0.field1762 == null) {
                for (int var9 = 0; var9 < this.field1756; var9++) {
                    this.field1762[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1756; var10++) {
                    this.field1762[var10] = arg0.field1762[var10];
                }
            }
        }
        this.field1759 = arg0.field1759;
        this.field1758 = arg0.field1758;
        this.field1790 = arg0.field1790;
        this.field1760 = arg0.field1760;
        this.field1791 = arg0.field1791;
        this.field1763 = arg0.field1763;
        this.field1766 = arg0.field1766;
        this.field1768 = arg0.field1768;
        this.field1786 = arg0.field1786;
        this.field1770 = arg0.field1770;
        this.field1771 = arg0.field1771;
        this.field1769 = arg0.field1769;
        this.field1773 = arg0.field1773;
        this.field1774 = arg0.field1774;
        this.field1761 = arg0.field1761;
        this.field1778 = arg0.field1778;
        this.field1776 = arg0.field1776;
        this.field1777 = arg0.field1777;
        this.field1779 = arg0.field1779;
        this.field1788 = arg0.field1788;
        this.field1797 = arg0.field1797;
        this.field1775 = arg0.field1775;
        this.field1784 = arg0.field1784;
        this.field1757 = arg0.field1757;
        this.field1787 = arg0.field1787;
        this.field1764 = arg0.field1764;
        this.field1772 = arg0.field1772;
    }

    @ObfuscatedName("dj.m()Ldj;")
    public class128 method2206() {
        class128 var1 = new class128();
        if (this.field1760 != null) {
            var1.field1760 = new byte[this.field1756];
            for (int var2 = 0; var2 < this.field1756; var2++) {
                var1.field1760[var2] = this.field1760[var2];
            }
        }
        var1.field1781 = this.field1781;
        var1.field1756 = this.field1756;
        var1.field1767 = this.field1767;
        var1.field1753 = this.field1753;
        var1.field1754 = this.field1754;
        var1.field1755 = this.field1755;
        var1.field1759 = this.field1759;
        var1.field1758 = this.field1758;
        var1.field1790 = this.field1790;
        var1.field1791 = this.field1791;
        var1.field1762 = this.field1762;
        var1.field1763 = this.field1763;
        var1.field1785 = this.field1785;
        var1.field1792 = this.field1792;
        var1.field1766 = this.field1766;
        var1.field1768 = this.field1768;
        var1.field1786 = this.field1786;
        var1.field1770 = this.field1770;
        var1.field1771 = this.field1771;
        var1.field1769 = this.field1769;
        var1.field1773 = this.field1773;
        var1.field1774 = this.field1774;
        var1.field1761 = this.field1761;
        var1.field1778 = this.field1778;
        var1.field1776 = this.field1776;
        var1.field1777 = this.field1777;
        var1.field1779 = this.field1779;
        var1.field1788 = this.field1788;
        var1.field1797 = this.field1797;
        var1.field1775 = this.field1775;
        var1.field1784 = this.field1784;
        var1.field1757 = this.field1757;
        var1.field1764 = this.field1764;
        var1.field1772 = this.field1772;
        return var1;
    }

    @ObfuscatedName("dj.s([[IIIIZI)Ldj;")
    public class128 method2146(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2159();
        int var7 = this.field1780 + arg1;
        int var8 = this.field1782 + arg1;
        int var9 = this.field1793 + arg3;
        int var10 = this.field1783 + arg3;
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
            var15.field1781 = this.field1781;
            var15.field1756 = this.field1756;
            var15.field1767 = this.field1767;
            var15.field1753 = this.field1753;
            var15.field1755 = this.field1755;
            var15.field1759 = this.field1759;
            var15.field1758 = this.field1758;
            var15.field1790 = this.field1790;
            var15.field1760 = this.field1760;
            var15.field1791 = this.field1791;
            var15.field1762 = this.field1762;
            var15.field1763 = this.field1763;
            var15.field1785 = this.field1785;
            var15.field1792 = this.field1792;
            var15.field1766 = this.field1766;
            var15.field1768 = this.field1768;
            var15.field1786 = this.field1786;
            var15.field1770 = this.field1770;
            var15.field1771 = this.field1771;
            var15.field1769 = this.field1769;
            var15.field1773 = this.field1773;
            var15.field1774 = this.field1774;
            var15.field1761 = this.field1761;
            var15.field1778 = this.field1778;
            var15.field1776 = this.field1776;
            var15.field1777 = this.field1777;
            var15.field1779 = this.field1779;
            var15.field1788 = this.field1788;
            var15.field1797 = this.field1797;
            var15.field1775 = this.field1775;
            var15.field1764 = this.field1764;
            var15.field1772 = this.field1772;
            var15.field1754 = new int[var15.field1781];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1781; var16++) {
                int var17 = this.field1753[var16] + arg1;
                int var18 = this.field1755[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1754[var16] = this.field1754[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1781; var26++) {
                int var27 = (-this.field1754[var26] << 16) / this.field2085;
                if (var27 < arg5) {
                    int var28 = this.field1753[var26] + arg1;
                    int var29 = this.field1755[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1754[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1754[var26];
                }
            }
        }
        var15.method2158();
        return var15;
    }

    @ObfuscatedName("dj.x()V")
    public void method2147() {
        int var10002;
        if (this.field1779 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1781; var3++) {
                int var4 = this.field1779[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1797 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1797[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1781) {
                int var7 = this.field1779[var6];
                this.field1797[var7][var1[var7]++] = var6++;
            }
            this.field1779 = null;
        }
        if (this.field1788 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1756; var10++) {
            int var11 = this.field1788[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1775 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1775[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1756) {
            int var14 = this.field1788[var13];
            this.field1775[var14][var8[var14]++] = var13++;
        }
        this.field1788 = null;
    }

    @ObfuscatedName("dj.p()V")
    public void method2148() {
        for (int var1 = 0; var1 < this.field1781; var1++) {
            int var2 = this.field1753[var1];
            this.field1753[var1] = this.field1755[var1];
            this.field1755[var1] = -var2;
        }
        this.method2158();
    }

    @ObfuscatedName("dj.k()V")
    public void method2149() {
        for (int var1 = 0; var1 < this.field1781; var1++) {
            this.field1753[var1] = -this.field1753[var1];
            this.field1755[var1] = -this.field1755[var1];
        }
        this.method2158();
    }

    @ObfuscatedName("dj.w()V")
    public void method2150() {
        for (int var1 = 0; var1 < this.field1781; var1++) {
            int var2 = this.field1755[var1];
            this.field1755[var1] = this.field1753[var1];
            this.field1753[var1] = -var2;
        }
        this.method2158();
    }

    @ObfuscatedName("dj.v(I)V")
    public void method2186(int arg0) {
        int var2 = field1765[arg0];
        int var3 = field1798[arg0];
        for (int var4 = 0; var4 < this.field1781; var4++) {
            int var5 = this.field1755[var4] * var2 + this.field1753[var4] * var3 >> 16;
            this.field1755[var4] = this.field1755[var4] * var3 - this.field1753[var4] * var2 >> 16;
            this.field1753[var4] = var5;
        }
        this.method2158();
    }

    @ObfuscatedName("dj.h(III)V")
    public void method2152(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1781; var4++) {
            this.field1753[var4] += arg0;
            this.field1754[var4] += arg1;
            this.field1755[var4] += arg2;
        }
        this.method2158();
    }

    @ObfuscatedName("dj.t(SS)V")
    public void method2153(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1756; var3++) {
            if (this.field1785[var3] == arg0) {
                this.field1785[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dj.l(SS)V")
    public void method2154(short arg0, short arg1) {
        if (this.field1792 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1756; var3++) {
            if (this.field1792[var3] == arg0) {
                this.field1792[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dj.q()V")
    public void method2155() {
        for (int var1 = 0; var1 < this.field1781; var1++) {
            this.field1755[var1] = -this.field1755[var1];
        }
        for (int var2 = 0; var2 < this.field1756; var2++) {
            int var3 = this.field1759[var2];
            this.field1759[var2] = this.field1790[var2];
            this.field1790[var2] = var3;
        }
        this.method2158();
    }

    @ObfuscatedName("dj.f(III)V")
    public void method2156(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1781; var4++) {
            this.field1753[var4] = this.field1753[var4] * arg0 / 128;
            this.field1754[var4] = this.field1754[var4] * arg1 / 128;
            this.field1755[var4] = this.field1755[var4] * arg2 / 128;
        }
        this.method2158();
    }

    @ObfuscatedName("dj.j()V")
    public void method2157() {
        if (this.field1784 != null) {
            return;
        }
        this.field1784 = new class136[this.field1781];
        for (int var1 = 0; var1 < this.field1781; var1++) {
            this.field1784[var1] = new class136();
        }
        for (int var2 = 0; var2 < this.field1756; var2++) {
            int var3 = this.field1759[var2];
            int var4 = this.field1758[var2];
            int var5 = this.field1790[var2];
            int var6 = this.field1753[var4] - this.field1753[var3];
            int var7 = this.field1754[var4] - this.field1754[var3];
            int var8 = this.field1755[var4] - this.field1755[var3];
            int var9 = this.field1753[var5] - this.field1753[var3];
            int var10 = this.field1754[var5] - this.field1754[var3];
            int var11 = this.field1755[var5] - this.field1755[var3];
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
            if (this.field1760 == null) {
                var19 = 0;
            } else {
                var19 = this.field1760[var2];
            }
            if (var19 == 0) {
                class136 var20 = this.field1784[var3];
                var20.field1964 += var16;
                var20.field1961 += var17;
                var20.field1962 += var18;
                var20.field1963++;
                class136 var21 = this.field1784[var4];
                var21.field1964 += var16;
                var21.field1961 += var17;
                var21.field1962 += var18;
                var21.field1963++;
                class136 var22 = this.field1784[var5];
                var22.field1964 += var16;
                var22.field1961 += var17;
                var22.field1962 += var18;
                var22.field1963++;
            } else if (var19 == 1) {
                if (this.field1757 == null) {
                    this.field1757 = new class144[this.field1756];
                }
                class144 var23 = this.field1757[var2] = new class144();
                var23.field2101 = var16;
                var23.field2097 = var17;
                var23.field2099 = var18;
            }
        }
    }

    @ObfuscatedName("dj.n()V")
    public void method2158() {
        this.field1784 = null;
        this.field1787 = null;
        this.field1757 = null;
        this.field1752 = false;
    }

    @ObfuscatedName("dj.z()V")
    public void method2159() {
        if (this.field1752) {
            return;
        }
        this.field2085 = 0;
        this.field1789 = 0;
        this.field1780 = 999999;
        this.field1782 = -999999;
        this.field1783 = -99999;
        this.field1793 = 99999;
        for (int var1 = 0; var1 < this.field1781; var1++) {
            int var2 = this.field1753[var1];
            int var3 = this.field1754[var1];
            int var4 = this.field1755[var1];
            if (var2 < this.field1780) {
                this.field1780 = var2;
            }
            if (var2 > this.field1782) {
                this.field1782 = var2;
            }
            if (var4 < this.field1793) {
                this.field1793 = var4;
            }
            if (var4 > this.field1783) {
                this.field1783 = var4;
            }
            if (-var3 > this.field2085) {
                this.field2085 = -var3;
            }
            if (var3 > this.field1789) {
                this.field1789 = var3;
            }
        }
        this.field1752 = true;
    }

    @ObfuscatedName("dj.ap(Ldj;Ldj;IIIZ)V")
    public static void method2160(class128 arg0, class128 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2159();
        arg0.method2157();
        arg1.method2159();
        arg1.method2157();
        field1796++;
        int var6 = 0;
        int[] var7 = arg1.field1753;
        int var8 = arg1.field1781;
        for (int var9 = 0; var9 < arg0.field1781; var9++) {
            class136 var10 = arg0.field1784[var9];
            if (var10.field1963 != 0) {
                int var11 = arg0.field1754[var9] - arg3;
                if (var11 <= arg1.field1789) {
                    int var12 = arg0.field1753[var9] - arg2;
                    if (var12 >= arg1.field1780 && var12 <= arg1.field1782) {
                        int var13 = arg0.field1755[var9] - arg4;
                        if (var13 >= arg1.field1793 && var13 <= arg1.field1783) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class136 var15 = arg1.field1784[var14];
                                if (var7[var14] == var12 && arg1.field1755[var14] == var13 && arg1.field1754[var14] == var11 && var15.field1963 != 0) {
                                    if (arg0.field1787 == null) {
                                        arg0.field1787 = new class136[arg0.field1781];
                                    }
                                    if (arg1.field1787 == null) {
                                        arg1.field1787 = new class136[var8];
                                    }
                                    class136 var16 = arg0.field1787[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1787[var9] = new class136(var10);
                                    }
                                    class136 var17 = arg1.field1787[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1787[var14] = new class136(var15);
                                    }
                                    var16.field1964 += var15.field1964;
                                    var16.field1961 += var15.field1961;
                                    var16.field1962 += var15.field1962;
                                    var16.field1963 += var15.field1963;
                                    var17.field1964 += var10.field1964;
                                    var17.field1961 += var10.field1961;
                                    var17.field1962 += var10.field1962;
                                    var17.field1963 += var10.field1963;
                                    var6++;
                                    field1794[var9] = field1796;
                                    field1795[var14] = field1796;
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
        for (int var18 = 0; var18 < arg0.field1756; var18++) {
            if (field1794[arg0.field1759[var18]] == field1796 && field1794[arg0.field1758[var18]] == field1796 && field1794[arg0.field1790[var18]] == field1796) {
                if (arg0.field1760 == null) {
                    arg0.field1760 = new byte[arg0.field1756];
                }
                arg0.field1760[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1756; var19++) {
            if (field1795[arg1.field1759[var19]] == field1796 && field1795[arg1.field1758[var19]] == field1796 && field1795[arg1.field1790[var19]] == field1796) {
                if (arg1.field1760 == null) {
                    arg1.field1760 = new byte[arg1.field1756];
                }
                arg1.field1760[var19] = 2;
            }
        }
    }

    @ObfuscatedName("dj.aj(IIIII)Leo;")
    public final class134 method2142(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2157();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class134 var8 = new class134();
        var8.field1891 = new int[this.field1756];
        var8.field1892 = new int[this.field1756];
        var8.field1893 = new int[this.field1756];
        if (this.field1767 > 0 && this.field1763 != null) {
            int[] var9 = new int[this.field1767];
            for (int var10 = 0; var10 < this.field1756; var10++) {
                if (this.field1763[var10] != -1) {
                    var9[this.field1763[var10] & 0xFF]++;
                }
            }
            var8.field1899 = 0;
            for (int var11 = 0; var11 < this.field1767; var11++) {
                if (var9[var11] > 0 && this.field1768[var11] == 0) {
                    var8.field1899++;
                }
            }
            var8.field1900 = new int[var8.field1899];
            var8.field1901 = new int[var8.field1899];
            var8.field1945 = new int[var8.field1899];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1767; var13++) {
                if (var9[var13] > 0 && this.field1768[var13] == 0) {
                    var8.field1900[var12] = this.field1786[var13] & 0xFFFF;
                    var8.field1901[var12] = this.field1770[var13] & 0xFFFF;
                    var8.field1945[var12] = this.field1771[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1896 = new byte[this.field1756];
            for (int var14 = 0; var14 < this.field1756; var14++) {
                if (this.field1763[var14] == -1) {
                    var8.field1896[var14] = -1;
                } else {
                    var8.field1896[var14] = (byte) var9[this.field1763[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1756; var15++) {
            byte var16;
            if (this.field1760 == null) {
                var16 = 0;
            } else {
                var16 = this.field1760[var15];
            }
            byte var17;
            if (this.field1762 == null) {
                var17 = 0;
            } else {
                var17 = this.field1762[var15];
            }
            short var18;
            if (this.field1792 == null) {
                var18 = -1;
            } else {
                var18 = this.field1792[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1785[var15] & 0xFFFF;
                    class136 var20;
                    if (this.field1787 == null || this.field1787[this.field1759[var15]] == null) {
                        var20 = this.field1784[this.field1759[var15]];
                    } else {
                        var20 = this.field1787[this.field1759[var15]];
                    }
                    int var21 = (var20.field1962 * arg4 + var20.field1964 * arg2 + var20.field1961 * arg3) / (var20.field1963 * var7) + arg0;
                    var8.field1891[var15] = method2162(var19, var21);
                    class136 var22;
                    if (this.field1787 == null || this.field1787[this.field1758[var15]] == null) {
                        var22 = this.field1784[this.field1758[var15]];
                    } else {
                        var22 = this.field1787[this.field1758[var15]];
                    }
                    int var23 = (var22.field1962 * arg4 + var22.field1964 * arg2 + var22.field1961 * arg3) / (var22.field1963 * var7) + arg0;
                    var8.field1892[var15] = method2162(var19, var23);
                    class136 var24;
                    if (this.field1787 == null || this.field1787[this.field1790[var15]] == null) {
                        var24 = this.field1784[this.field1790[var15]];
                    } else {
                        var24 = this.field1787[this.field1790[var15]];
                    }
                    int var25 = (var24.field1962 * arg4 + var24.field1964 * arg2 + var24.field1961 * arg3) / (var24.field1963 * var7) + arg0;
                    var8.field1893[var15] = method2162(var19, var25);
                } else if (var16 == 1) {
                    class144 var26 = this.field1757[var15];
                    int var27 = (var26.field2099 * arg4 + var26.field2101 * arg2 + var26.field2097 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1891[var15] = method2162(this.field1785[var15] & 0xFFFF, var27);
                    var8.field1893[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1891[var15] = 128;
                    var8.field1893[var15] = -1;
                } else {
                    var8.field1893[var15] = -2;
                }
            } else if (var16 == 0) {
                class136 var28;
                if (this.field1787 == null || this.field1787[this.field1759[var15]] == null) {
                    var28 = this.field1784[this.field1759[var15]];
                } else {
                    var28 = this.field1787[this.field1759[var15]];
                }
                int var29 = (var28.field1962 * arg4 + var28.field1964 * arg2 + var28.field1961 * arg3) / (var28.field1963 * var7) + arg0;
                var8.field1891[var15] = method2163(var29);
                class136 var30;
                if (this.field1787 == null || this.field1787[this.field1758[var15]] == null) {
                    var30 = this.field1784[this.field1758[var15]];
                } else {
                    var30 = this.field1787[this.field1758[var15]];
                }
                int var31 = (var30.field1962 * arg4 + var30.field1964 * arg2 + var30.field1961 * arg3) / (var30.field1963 * var7) + arg0;
                var8.field1892[var15] = method2163(var31);
                class136 var32;
                if (this.field1787 == null || this.field1787[this.field1790[var15]] == null) {
                    var32 = this.field1784[this.field1790[var15]];
                } else {
                    var32 = this.field1787[this.field1790[var15]];
                }
                int var33 = (var32.field1962 * arg4 + var32.field1964 * arg2 + var32.field1961 * arg3) / (var32.field1963 * var7) + arg0;
                var8.field1893[var15] = method2163(var33);
            } else if (var16 == 1) {
                class144 var34 = this.field1757[var15];
                int var35 = (var34.field2099 * arg4 + var34.field2101 * arg2 + var34.field2097 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1891[var15] = method2163(var35);
                var8.field1893[var15] = -1;
            } else {
                var8.field1893[var15] = -2;
            }
        }
        this.method2147();
        var8.field1883 = this.field1781;
        var8.field1884 = this.field1753;
        var8.field1885 = this.field1754;
        var8.field1886 = this.field1755;
        var8.field1887 = this.field1756;
        var8.field1888 = this.field1759;
        var8.field1938 = this.field1758;
        var8.field1890 = this.field1790;
        var8.field1894 = this.field1791;
        var8.field1895 = this.field1762;
        var8.field1898 = this.field1766;
        var8.field1903 = this.field1797;
        var8.field1904 = this.field1775;
        var8.field1922 = this.field1792;
        return var8;
    }

    @ObfuscatedName("dj.am(II)I")
    public static final int method2162(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("dj.ag(I)I")
    public static final int method2163(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
