package deob;

@ObfuscatedName("cc")
public class class101 extends class94 {

    @ObfuscatedName("cc.t")
    public int field1757 = 0;

    @ObfuscatedName("cc.l")
    public int[] field1715;

    @ObfuscatedName("cc.c")
    public int[] field1716;

    @ObfuscatedName("cc.d")
    public int[] field1717;

    @ObfuscatedName("cc.b")
    public int field1718 = 0;

    @ObfuscatedName("cc.i")
    public int[] field1739;

    @ObfuscatedName("cc.p")
    public int[] field1720;

    @ObfuscatedName("cc.y")
    public int[] field1721;

    @ObfuscatedName("cc.u")
    public byte[] field1755;

    @ObfuscatedName("cc.z")
    public byte[] field1759;

    @ObfuscatedName("cc.j")
    public byte[] field1724;

    @ObfuscatedName("cc.h")
    public byte[] field1719;

    @ObfuscatedName("cc.x")
    public short[] field1726;

    @ObfuscatedName("cc.q")
    public short[] field1740;

    @ObfuscatedName("cc.w")
    public byte field1760 = 0;

    @ObfuscatedName("cc.k")
    public int field1729;

    @ObfuscatedName("cc.o")
    public byte[] field1730;

    @ObfuscatedName("cc.f")
    public short[] field1731;

    @ObfuscatedName("cc.r")
    public short[] field1732;

    @ObfuscatedName("cc.s")
    public short[] field1733;

    @ObfuscatedName("cc.g")
    public short[] field1734;

    @ObfuscatedName("cc.m")
    public short[] field1714;

    @ObfuscatedName("cc.a")
    public short[] field1725;

    @ObfuscatedName("cc.n")
    public short[] field1737;

    @ObfuscatedName("cc.v")
    public short[] field1738;

    @ObfuscatedName("cc.e")
    public short[] field1735;

    @ObfuscatedName("cc.ar")
    public byte[] field1723;

    @ObfuscatedName("cc.ak")
    public int[] field1741;

    @ObfuscatedName("cc.ap")
    public int[] field1742;

    @ObfuscatedName("cc.aa")
    public int[][] field1743;

    @ObfuscatedName("cc.av")
    public int[][] field1756;

    @ObfuscatedName("cc.aq")
    public class92[] field1728;

    @ObfuscatedName("cc.an")
    public class91[] field1744;

    @ObfuscatedName("cc.al")
    public class91[] field1747;

    @ObfuscatedName("cc.ax")
    public short field1748;

    @ObfuscatedName("cc.as")
    public short field1749;

    @ObfuscatedName("cc.ah")
    public boolean field1722 = false;

    @ObfuscatedName("cc.ae")
    public int field1751;

    @ObfuscatedName("cc.ac")
    public int field1752;

    @ObfuscatedName("cc.af")
    public int field1753;

    @ObfuscatedName("cc.aj")
    public int field1754;

    @ObfuscatedName("cc.ao")
    public int field1746;

    @ObfuscatedName("cc.au")
    public static int[] field1750 = new int[10000];

    @ObfuscatedName("cc.at")
    public static int[] field1736 = new int[10000];

    @ObfuscatedName("cc.az")
    public static int field1758 = 0;

    @ObfuscatedName("cc.ag")
    public static int[] field1727 = class104.field1814;

    @ObfuscatedName("cc.am")
    public static int[] field1745 = class104.field1815;

    public class101() {
    }

    @ObfuscatedName("cc.t(Lev;II)Lcc;")
    public static class101 method2086(class152 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2987(arg1, arg2);
        return var3 == null ? null : new class101(var3);
    }

    public class101(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2052(arg0);
        } else {
            this.method2053(arg0);
        }
    }

    @ObfuscatedName("cc.c([B)V")
    public void method2052(byte[] arg0) {
        class127 var2 = new class127(arg0);
        class127 var3 = new class127(arg0);
        class127 var4 = new class127(arg0);
        class127 var5 = new class127(arg0);
        class127 var6 = new class127(arg0);
        class127 var7 = new class127(arg0);
        class127 var8 = new class127(arg0);
        var2.field2059 = arg0.length - 23;
        int var9 = var2.method2440();
        int var10 = var2.method2440();
        int var11 = var2.method2438();
        int var12 = var2.method2438();
        int var13 = var2.method2438();
        int var14 = var2.method2438();
        int var15 = var2.method2438();
        int var16 = var2.method2438();
        int var17 = var2.method2438();
        int var18 = var2.method2440();
        int var19 = var2.method2440();
        int var20 = var2.method2440();
        int var21 = var2.method2440();
        int var22 = var2.method2440();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1730 = new byte[var11];
            var2.field2059 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1730[var26] = var2.method2629();
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
        this.field1757 = var9;
        this.field1718 = var10;
        this.field1729 = var11;
        this.field1715 = new int[var9];
        this.field1716 = new int[var9];
        this.field1717 = new int[var9];
        this.field1739 = new int[var10];
        this.field1720 = new int[var10];
        this.field1721 = new int[var10];
        if (var17 == 1) {
            this.field1741 = new int[var9];
        }
        if (var12 == 1) {
            this.field1755 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1759 = new byte[var10];
        } else {
            this.field1760 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1724 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1742 = new int[var10];
        }
        if (var16 == 1) {
            this.field1740 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1719 = new byte[var10];
        }
        this.field1726 = new short[var10];
        if (var11 > 0) {
            this.field1731 = new short[var11];
            this.field1732 = new short[var11];
            this.field1733 = new short[var11];
            if (var24 > 0) {
                this.field1734 = new short[var24];
                this.field1714 = new short[var24];
                this.field1725 = new short[var24];
                this.field1737 = new short[var24];
                this.field1723 = new byte[var24];
                this.field1738 = new short[var24];
            }
            if (var25 > 0) {
                this.field1735 = new short[var25];
            }
        }
        var2.field2059 = var11;
        var3.field2059 = var44;
        var4.field2059 = var46;
        var5.field2059 = var48;
        var6.field2059 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2438();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2628();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2628();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2628();
            }
            this.field1715[var67] = var64 + var69;
            this.field1716[var67] = var65 + var70;
            this.field1717[var67] = var66 + var71;
            var64 = this.field1715[var67];
            var65 = this.field1716[var67];
            var66 = this.field1717[var67];
            if (var17 == 1) {
                this.field1741[var67] = var6.method2438();
            }
        }
        var2.field2059 = var42;
        var3.field2059 = var31;
        var4.field2059 = var34;
        var5.field2059 = var37;
        var6.field2059 = var35;
        var7.field2059 = var40;
        var8.field2059 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1726[var72] = (short) var2.method2440();
            if (var12 == 1) {
                this.field1755[var72] = var3.method2629();
            }
            if (var13 == 255) {
                this.field1759[var72] = var4.method2629();
            }
            if (var14 == 1) {
                this.field1724[var72] = var5.method2629();
            }
            if (var15 == 1) {
                this.field1742[var72] = var6.method2438();
            }
            if (var16 == 1) {
                this.field1740[var72] = (short) (var7.method2440() - 1);
            }
            if (this.field1719 != null && this.field1740[var72] != -1) {
                this.field1719[var72] = (byte) (var8.method2438() - 1);
            }
        }
        var2.field2059 = var33;
        var3.field2059 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2438();
            if (var78 == 1) {
                var73 = var2.method2628() + var76;
                var74 = var2.method2628() + var73;
                var75 = var2.method2628() + var74;
                var76 = var75;
                this.field1739[var77] = var73;
                this.field1720[var77] = var74;
                this.field1721[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2628() + var76;
                var76 = var75;
                this.field1739[var77] = var73;
                this.field1720[var77] = var74;
                this.field1721[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2628() + var76;
                var76 = var75;
                this.field1739[var77] = var73;
                this.field1720[var77] = var74;
                this.field1721[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2628() + var76;
                var76 = var75;
                this.field1739[var77] = var73;
                this.field1720[var77] = var81;
                this.field1721[var77] = var75;
            }
        }
        var2.field2059 = var50;
        var3.field2059 = var52;
        var4.field2059 = var54;
        var5.field2059 = var56;
        var6.field2059 = var58;
        var7.field2059 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1730[var82] & 0xFF;
            if (var83 == 0) {
                this.field1731[var82] = (short) var2.method2440();
                this.field1732[var82] = (short) var2.method2440();
                this.field1733[var82] = (short) var2.method2440();
            }
            if (var83 == 1) {
                this.field1731[var82] = (short) var3.method2440();
                this.field1732[var82] = (short) var3.method2440();
                this.field1733[var82] = (short) var3.method2440();
                this.field1734[var82] = (short) var4.method2440();
                this.field1714[var82] = (short) var4.method2440();
                this.field1725[var82] = (short) var4.method2440();
                this.field1737[var82] = (short) var5.method2440();
                this.field1723[var82] = var6.method2629();
                this.field1738[var82] = (short) var7.method2440();
            }
            if (var83 == 2) {
                this.field1731[var82] = (short) var3.method2440();
                this.field1732[var82] = (short) var3.method2440();
                this.field1733[var82] = (short) var3.method2440();
                this.field1734[var82] = (short) var4.method2440();
                this.field1714[var82] = (short) var4.method2440();
                this.field1725[var82] = (short) var4.method2440();
                this.field1737[var82] = (short) var5.method2440();
                this.field1723[var82] = var6.method2629();
                this.field1738[var82] = (short) var7.method2440();
                this.field1735[var82] = (short) var7.method2440();
            }
            if (var83 == 3) {
                this.field1731[var82] = (short) var3.method2440();
                this.field1732[var82] = (short) var3.method2440();
                this.field1733[var82] = (short) var3.method2440();
                this.field1734[var82] = (short) var4.method2440();
                this.field1714[var82] = (short) var4.method2440();
                this.field1725[var82] = (short) var4.method2440();
                this.field1737[var82] = (short) var5.method2440();
                this.field1723[var82] = var6.method2629();
                this.field1738[var82] = (short) var7.method2440();
            }
        }
        var2.field2059 = var62;
        int var84 = var2.method2438();
        if (var84 == 0) {
            return;
        }
        new class103();
        var2.method2440();
        var2.method2440();
        var2.method2440();
        var2.method2448();
    }

    @ObfuscatedName("cc.d([B)V")
    public void method2053(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class127 var4 = new class127(arg0);
        class127 var5 = new class127(arg0);
        class127 var6 = new class127(arg0);
        class127 var7 = new class127(arg0);
        class127 var8 = new class127(arg0);
        var4.field2059 = arg0.length - 18;
        int var9 = var4.method2440();
        int var10 = var4.method2440();
        int var11 = var4.method2438();
        int var12 = var4.method2438();
        int var13 = var4.method2438();
        int var14 = var4.method2438();
        int var15 = var4.method2438();
        int var16 = var4.method2438();
        int var17 = var4.method2440();
        int var18 = var4.method2440();
        int var19 = var4.method2440();
        int var20 = var4.method2440();
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
        this.field1757 = var9;
        this.field1718 = var10;
        this.field1729 = var11;
        this.field1715 = new int[var9];
        this.field1716 = new int[var9];
        this.field1717 = new int[var9];
        this.field1739 = new int[var10];
        this.field1720 = new int[var10];
        this.field1721 = new int[var10];
        if (var11 > 0) {
            this.field1730 = new byte[var11];
            this.field1731 = new short[var11];
            this.field1732 = new short[var11];
            this.field1733 = new short[var11];
        }
        if (var16 == 1) {
            this.field1741 = new int[var9];
        }
        if (var12 == 1) {
            this.field1755 = new byte[var10];
            this.field1719 = new byte[var10];
            this.field1740 = new short[var10];
        }
        if (var13 == 255) {
            this.field1759 = new byte[var10];
        } else {
            this.field1760 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1724 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1742 = new int[var10];
        }
        this.field1726 = new short[var10];
        var4.field2059 = var21;
        var5.field2059 = var36;
        var6.field2059 = var38;
        var7.field2059 = var40;
        var8.field2059 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2438();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2628();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2628();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2628();
            }
            this.field1715[var46] = var43 + var48;
            this.field1716[var46] = var44 + var49;
            this.field1717[var46] = var45 + var50;
            var43 = this.field1715[var46];
            var44 = this.field1716[var46];
            var45 = this.field1717[var46];
            if (var16 == 1) {
                this.field1741[var46] = var8.method2438();
            }
        }
        var4.field2059 = var32;
        var5.field2059 = var28;
        var6.field2059 = var26;
        var7.field2059 = var30;
        var8.field2059 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1726[var51] = (short) var4.method2440();
            if (var12 == 1) {
                int var52 = var5.method2438();
                if ((var52 & 0x1) == 1) {
                    this.field1755[var51] = 1;
                    var2 = true;
                } else {
                    this.field1755[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1719[var51] = (byte) (var52 >> 2);
                    this.field1740[var51] = this.field1726[var51];
                    this.field1726[var51] = 127;
                    if (this.field1740[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1719[var51] = -1;
                    this.field1740[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1759[var51] = var6.method2629();
            }
            if (var14 == 1) {
                this.field1724[var51] = var7.method2629();
            }
            if (var15 == 1) {
                this.field1742[var51] = var8.method2438();
            }
        }
        var4.field2059 = var25;
        var5.field2059 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2438();
            if (var58 == 1) {
                var53 = var4.method2628() + var56;
                var54 = var4.method2628() + var53;
                var55 = var4.method2628() + var54;
                var56 = var55;
                this.field1739[var57] = var53;
                this.field1720[var57] = var54;
                this.field1721[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2628() + var56;
                var56 = var55;
                this.field1739[var57] = var53;
                this.field1720[var57] = var54;
                this.field1721[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2628() + var56;
                var56 = var55;
                this.field1739[var57] = var53;
                this.field1720[var57] = var54;
                this.field1721[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2628() + var56;
                var56 = var55;
                this.field1739[var57] = var53;
                this.field1720[var57] = var61;
                this.field1721[var57] = var55;
            }
        }
        var4.field2059 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1730[var62] = 0;
            this.field1731[var62] = (short) var4.method2440();
            this.field1732[var62] = (short) var4.method2440();
            this.field1733[var62] = (short) var4.method2440();
        }
        if (this.field1719 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1719[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1731[var65] & 0xFFFF) == this.field1739[var64] && (this.field1732[var65] & 0xFFFF) == this.field1720[var64] && (this.field1733[var65] & 0xFFFF) == this.field1721[var64]) {
                        this.field1719[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1719 = null;
            }
        }
        if (!var3) {
            this.field1740 = null;
        }
        if (!var2) {
            this.field1755 = null;
        }
    }

    public class101(class101[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1757 = 0;
        this.field1718 = 0;
        this.field1729 = 0;
        this.field1760 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class101 var10 = arg0[var9];
            if (var10 != null) {
                this.field1757 += var10.field1757;
                this.field1718 += var10.field1718;
                this.field1729 += var10.field1729;
                if (var10.field1759 == null) {
                    if (this.field1760 == -1) {
                        this.field1760 = var10.field1760;
                    }
                    if (this.field1760 != var10.field1760) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1755 != null;
                var5 |= var10.field1724 != null;
                var6 |= var10.field1742 != null;
                var7 |= var10.field1740 != null;
                var8 |= var10.field1719 != null;
            }
        }
        this.field1715 = new int[this.field1757];
        this.field1716 = new int[this.field1757];
        this.field1717 = new int[this.field1757];
        this.field1741 = new int[this.field1757];
        this.field1739 = new int[this.field1718];
        this.field1720 = new int[this.field1718];
        this.field1721 = new int[this.field1718];
        if (var3) {
            this.field1755 = new byte[this.field1718];
        }
        if (var4) {
            this.field1759 = new byte[this.field1718];
        }
        if (var5) {
            this.field1724 = new byte[this.field1718];
        }
        if (var6) {
            this.field1742 = new int[this.field1718];
        }
        if (var7) {
            this.field1740 = new short[this.field1718];
        }
        if (var8) {
            this.field1719 = new byte[this.field1718];
        }
        this.field1726 = new short[this.field1718];
        if (this.field1729 > 0) {
            this.field1730 = new byte[this.field1729];
            this.field1731 = new short[this.field1729];
            this.field1732 = new short[this.field1729];
            this.field1733 = new short[this.field1729];
            this.field1734 = new short[this.field1729];
            this.field1714 = new short[this.field1729];
            this.field1725 = new short[this.field1729];
            this.field1737 = new short[this.field1729];
            this.field1723 = new byte[this.field1729];
            this.field1738 = new short[this.field1729];
            this.field1735 = new short[this.field1729];
        }
        this.field1757 = 0;
        this.field1718 = 0;
        this.field1729 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class101 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1718; var13++) {
                    if (var3 && var12.field1755 != null) {
                        this.field1755[this.field1718] = var12.field1755[var13];
                    }
                    if (var4) {
                        if (var12.field1759 == null) {
                            this.field1759[this.field1718] = var12.field1760;
                        } else {
                            this.field1759[this.field1718] = var12.field1759[var13];
                        }
                    }
                    if (var5 && var12.field1724 != null) {
                        this.field1724[this.field1718] = var12.field1724[var13];
                    }
                    if (var6 && var12.field1742 != null) {
                        this.field1742[this.field1718] = var12.field1742[var13];
                    }
                    if (var7) {
                        if (var12.field1740 == null) {
                            this.field1740[this.field1718] = -1;
                        } else {
                            this.field1740[this.field1718] = var12.field1740[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1719 == null || var12.field1719[var13] == -1) {
                            this.field1719[this.field1718] = -1;
                        } else {
                            this.field1719[this.field1718] = (byte) (var12.field1719[var13] + this.field1729);
                        }
                    }
                    this.field1726[this.field1718] = var12.field1726[var13];
                    this.field1739[this.field1718] = this.method2055(var12, var12.field1739[var13]);
                    this.field1720[this.field1718] = this.method2055(var12, var12.field1720[var13]);
                    this.field1721[this.field1718] = this.method2055(var12, var12.field1721[var13]);
                    this.field1718++;
                }
                for (int var14 = 0; var14 < var12.field1729; var14++) {
                    byte var15 = this.field1730[this.field1729] = var12.field1730[var14];
                    if (var15 == 0) {
                        this.field1731[this.field1729] = (short) this.method2055(var12, var12.field1731[var14]);
                        this.field1732[this.field1729] = (short) this.method2055(var12, var12.field1732[var14]);
                        this.field1733[this.field1729] = (short) this.method2055(var12, var12.field1733[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1731[this.field1729] = var12.field1731[var14];
                        this.field1732[this.field1729] = var12.field1732[var14];
                        this.field1733[this.field1729] = var12.field1733[var14];
                        this.field1734[this.field1729] = var12.field1734[var14];
                        this.field1714[this.field1729] = var12.field1714[var14];
                        this.field1725[this.field1729] = var12.field1725[var14];
                        this.field1737[this.field1729] = var12.field1737[var14];
                        this.field1723[this.field1729] = var12.field1723[var14];
                        this.field1738[this.field1729] = var12.field1738[var14];
                    }
                    if (var15 == 2) {
                        this.field1735[this.field1729] = var12.field1735[var14];
                    }
                    this.field1729++;
                }
            }
        }
    }

    @ObfuscatedName("cc.b(Lcc;I)I")
    public final int method2055(class101 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1715[arg1];
        int var5 = arg0.field1716[arg1];
        int var6 = arg0.field1717[arg1];
        for (int var7 = 0; var7 < this.field1757; var7++) {
            if (this.field1715[var7] == var4 && this.field1716[var7] == var5 && this.field1717[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1715[this.field1757] = var4;
            this.field1716[this.field1757] = var5;
            this.field1717[this.field1757] = var6;
            if (arg0.field1741 != null) {
                this.field1741[this.field1757] = arg0.field1741[arg1];
            }
            var3 = this.field1757++;
        }
        return var3;
    }

    public class101(class101 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1757 = arg0.field1757;
        this.field1718 = arg0.field1718;
        this.field1729 = arg0.field1729;
        if (arg1) {
            this.field1715 = arg0.field1715;
            this.field1716 = arg0.field1716;
            this.field1717 = arg0.field1717;
        } else {
            this.field1715 = new int[this.field1757];
            this.field1716 = new int[this.field1757];
            this.field1717 = new int[this.field1757];
            for (int var6 = 0; var6 < this.field1757; var6++) {
                this.field1715[var6] = arg0.field1715[var6];
                this.field1716[var6] = arg0.field1716[var6];
                this.field1717[var6] = arg0.field1717[var6];
            }
        }
        if (arg2) {
            this.field1726 = arg0.field1726;
        } else {
            this.field1726 = new short[this.field1718];
            for (int var7 = 0; var7 < this.field1718; var7++) {
                this.field1726[var7] = arg0.field1726[var7];
            }
        }
        if (arg3 || arg0.field1740 == null) {
            this.field1740 = arg0.field1740;
        } else {
            this.field1740 = new short[this.field1718];
            for (int var8 = 0; var8 < this.field1718; var8++) {
                this.field1740[var8] = arg0.field1740[var8];
            }
        }
        if (arg4) {
            this.field1724 = arg0.field1724;
        } else {
            this.field1724 = new byte[this.field1718];
            if (arg0.field1724 == null) {
                for (int var9 = 0; var9 < this.field1718; var9++) {
                    this.field1724[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1718; var10++) {
                    this.field1724[var10] = arg0.field1724[var10];
                }
            }
        }
        this.field1739 = arg0.field1739;
        this.field1720 = arg0.field1720;
        this.field1721 = arg0.field1721;
        this.field1755 = arg0.field1755;
        this.field1759 = arg0.field1759;
        this.field1719 = arg0.field1719;
        this.field1760 = arg0.field1760;
        this.field1730 = arg0.field1730;
        this.field1731 = arg0.field1731;
        this.field1732 = arg0.field1732;
        this.field1733 = arg0.field1733;
        this.field1734 = arg0.field1734;
        this.field1714 = arg0.field1714;
        this.field1725 = arg0.field1725;
        this.field1737 = arg0.field1737;
        this.field1723 = arg0.field1723;
        this.field1738 = arg0.field1738;
        this.field1735 = arg0.field1735;
        this.field1741 = arg0.field1741;
        this.field1742 = arg0.field1742;
        this.field1743 = arg0.field1743;
        this.field1756 = arg0.field1756;
        this.field1744 = arg0.field1744;
        this.field1728 = arg0.field1728;
        this.field1747 = arg0.field1747;
        this.field1748 = arg0.field1748;
        this.field1749 = arg0.field1749;
    }

    @ObfuscatedName("cc.i()Lcc;")
    public class101 method2071() {
        class101 var1 = new class101();
        if (this.field1755 != null) {
            var1.field1755 = new byte[this.field1718];
            for (int var2 = 0; var2 < this.field1718; var2++) {
                var1.field1755[var2] = this.field1755[var2];
            }
        }
        var1.field1757 = this.field1757;
        var1.field1718 = this.field1718;
        var1.field1729 = this.field1729;
        var1.field1715 = this.field1715;
        var1.field1716 = this.field1716;
        var1.field1717 = this.field1717;
        var1.field1739 = this.field1739;
        var1.field1720 = this.field1720;
        var1.field1721 = this.field1721;
        var1.field1759 = this.field1759;
        var1.field1724 = this.field1724;
        var1.field1719 = this.field1719;
        var1.field1726 = this.field1726;
        var1.field1740 = this.field1740;
        var1.field1760 = this.field1760;
        var1.field1730 = this.field1730;
        var1.field1731 = this.field1731;
        var1.field1732 = this.field1732;
        var1.field1733 = this.field1733;
        var1.field1734 = this.field1734;
        var1.field1714 = this.field1714;
        var1.field1725 = this.field1725;
        var1.field1737 = this.field1737;
        var1.field1723 = this.field1723;
        var1.field1738 = this.field1738;
        var1.field1735 = this.field1735;
        var1.field1741 = this.field1741;
        var1.field1742 = this.field1742;
        var1.field1743 = this.field1743;
        var1.field1756 = this.field1756;
        var1.field1744 = this.field1744;
        var1.field1728 = this.field1728;
        var1.field1748 = this.field1748;
        var1.field1749 = this.field1749;
        return var1;
    }

    @ObfuscatedName("cc.p([[IIIIZI)Lcc;")
    public class101 method2056(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2054();
        int var7 = this.field1752 + arg1;
        int var8 = this.field1753 + arg1;
        int var9 = this.field1746 + arg3;
        int var10 = this.field1754 + arg3;
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
        class101 var15;
        if (arg4) {
            var15 = new class101();
            var15.field1757 = this.field1757;
            var15.field1718 = this.field1718;
            var15.field1729 = this.field1729;
            var15.field1715 = this.field1715;
            var15.field1717 = this.field1717;
            var15.field1739 = this.field1739;
            var15.field1720 = this.field1720;
            var15.field1721 = this.field1721;
            var15.field1755 = this.field1755;
            var15.field1759 = this.field1759;
            var15.field1724 = this.field1724;
            var15.field1719 = this.field1719;
            var15.field1726 = this.field1726;
            var15.field1740 = this.field1740;
            var15.field1760 = this.field1760;
            var15.field1730 = this.field1730;
            var15.field1731 = this.field1731;
            var15.field1732 = this.field1732;
            var15.field1733 = this.field1733;
            var15.field1734 = this.field1734;
            var15.field1714 = this.field1714;
            var15.field1725 = this.field1725;
            var15.field1737 = this.field1737;
            var15.field1723 = this.field1723;
            var15.field1738 = this.field1738;
            var15.field1735 = this.field1735;
            var15.field1741 = this.field1741;
            var15.field1742 = this.field1742;
            var15.field1743 = this.field1743;
            var15.field1756 = this.field1756;
            var15.field1748 = this.field1748;
            var15.field1749 = this.field1749;
            var15.field1716 = new int[var15.field1757];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1757; var16++) {
                int var17 = this.field1715[var16] + arg1;
                int var18 = this.field1717[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1716[var16] = this.field1716[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1757; var26++) {
                int var27 = (-this.field1716[var26] << 16) / this.field1588;
                if (var27 < arg5) {
                    int var28 = this.field1715[var26] + arg1;
                    int var29 = this.field1717[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1716[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1716[var26];
                }
            }
        }
        var15.method2068();
        return var15;
    }

    @ObfuscatedName("cc.y()V")
    public void method2057() {
        int var10002;
        if (this.field1741 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1757; var3++) {
                int var4 = this.field1741[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1743 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1743[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1757) {
                int var7 = this.field1741[var6];
                this.field1743[var7][var1[var7]++] = var6++;
            }
            this.field1741 = null;
        }
        if (this.field1742 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1718; var10++) {
            int var11 = this.field1742[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1756 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1756[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1718) {
            int var14 = this.field1742[var13];
            this.field1756[var14][var8[var14]++] = var13++;
        }
        this.field1742 = null;
    }

    @ObfuscatedName("cc.j()V")
    public void method2103() {
        for (int var1 = 0; var1 < this.field1757; var1++) {
            int var2 = this.field1715[var1];
            this.field1715[var1] = this.field1717[var1];
            this.field1717[var1] = -var2;
        }
        this.method2068();
    }

    @ObfuscatedName("cc.h()V")
    public void method2059() {
        for (int var1 = 0; var1 < this.field1757; var1++) {
            this.field1715[var1] = -this.field1715[var1];
            this.field1717[var1] = -this.field1717[var1];
        }
        this.method2068();
    }

    @ObfuscatedName("cc.x()V")
    public void method2060() {
        for (int var1 = 0; var1 < this.field1757; var1++) {
            int var2 = this.field1717[var1];
            this.field1717[var1] = this.field1715[var1];
            this.field1715[var1] = -var2;
        }
        this.method2068();
    }

    @ObfuscatedName("cc.q(I)V")
    public void method2133(int arg0) {
        int var2 = field1727[arg0];
        int var3 = field1745[arg0];
        for (int var4 = 0; var4 < this.field1757; var4++) {
            int var5 = this.field1717[var4] * var2 + this.field1715[var4] * var3 >> 16;
            this.field1717[var4] = this.field1717[var4] * var3 - this.field1715[var4] * var2 >> 16;
            this.field1715[var4] = var5;
        }
        this.method2068();
    }

    @ObfuscatedName("cc.w(III)V")
    public void method2123(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1757; var4++) {
            this.field1715[var4] += arg0;
            this.field1716[var4] += arg1;
            this.field1717[var4] += arg2;
        }
        this.method2068();
    }

    @ObfuscatedName("cc.k(SS)V")
    public void method2063(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1718; var3++) {
            if (this.field1726[var3] == arg0) {
                this.field1726[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cc.o(SS)V")
    public void method2064(short arg0, short arg1) {
        if (this.field1740 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1718; var3++) {
            if (this.field1740[var3] == arg0) {
                this.field1740[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cc.f()V")
    public void method2065() {
        for (int var1 = 0; var1 < this.field1757; var1++) {
            this.field1717[var1] = -this.field1717[var1];
        }
        for (int var2 = 0; var2 < this.field1718; var2++) {
            int var3 = this.field1739[var2];
            this.field1739[var2] = this.field1721[var2];
            this.field1721[var2] = var3;
        }
        this.method2068();
    }

    @ObfuscatedName("cc.r(III)V")
    public void method2066(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1757; var4++) {
            this.field1715[var4] = this.field1715[var4] * arg0 / 128;
            this.field1716[var4] = this.field1716[var4] * arg1 / 128;
            this.field1717[var4] = this.field1717[var4] * arg2 / 128;
        }
        this.method2068();
    }

    @ObfuscatedName("cc.s()V")
    public void method2067() {
        if (this.field1744 != null) {
            return;
        }
        this.field1744 = new class91[this.field1757];
        for (int var1 = 0; var1 < this.field1757; var1++) {
            this.field1744[var1] = new class91();
        }
        for (int var2 = 0; var2 < this.field1718; var2++) {
            int var3 = this.field1739[var2];
            int var4 = this.field1720[var2];
            int var5 = this.field1721[var2];
            int var6 = this.field1715[var4] - this.field1715[var3];
            int var7 = this.field1716[var4] - this.field1716[var3];
            int var8 = this.field1717[var4] - this.field1717[var3];
            int var9 = this.field1715[var5] - this.field1715[var3];
            int var10 = this.field1716[var5] - this.field1716[var3];
            int var11 = this.field1717[var5] - this.field1717[var3];
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
            if (this.field1755 == null) {
                var19 = 0;
            } else {
                var19 = this.field1755[var2];
            }
            if (var19 == 0) {
                class91 var20 = this.field1744[var3];
                var20.field1555 += var16;
                var20.field1549 += var17;
                var20.field1548 += var18;
                var20.field1546++;
                class91 var21 = this.field1744[var4];
                var21.field1555 += var16;
                var21.field1549 += var17;
                var21.field1548 += var18;
                var21.field1546++;
                class91 var22 = this.field1744[var5];
                var22.field1555 += var16;
                var22.field1549 += var17;
                var22.field1548 += var18;
                var22.field1546++;
            } else if (var19 == 1) {
                if (this.field1728 == null) {
                    this.field1728 = new class92[this.field1718];
                }
                class92 var23 = this.field1728[var2] = new class92();
                var23.field1563 = var16;
                var23.field1557 = var17;
                var23.field1561 = var18;
            }
        }
    }

    @ObfuscatedName("cc.g()V")
    public void method2068() {
        this.field1744 = null;
        this.field1747 = null;
        this.field1728 = null;
        this.field1722 = false;
    }

    @ObfuscatedName("cc.m()V")
    public void method2054() {
        if (this.field1722) {
            return;
        }
        this.field1588 = 0;
        this.field1751 = 0;
        this.field1752 = 999999;
        this.field1753 = -999999;
        this.field1754 = -99999;
        this.field1746 = 99999;
        for (int var1 = 0; var1 < this.field1757; var1++) {
            int var2 = this.field1715[var1];
            int var3 = this.field1716[var1];
            int var4 = this.field1717[var1];
            if (var2 < this.field1752) {
                this.field1752 = var2;
            }
            if (var2 > this.field1753) {
                this.field1753 = var2;
            }
            if (var4 < this.field1746) {
                this.field1746 = var4;
            }
            if (var4 > this.field1754) {
                this.field1754 = var4;
            }
            if (-var3 > this.field1588) {
                this.field1588 = -var3;
            }
            if (var3 > this.field1751) {
                this.field1751 = var3;
            }
        }
        this.field1722 = true;
    }

    @ObfuscatedName("cc.a(Lcc;Lcc;IIIZ)V")
    public static void method2070(class101 arg0, class101 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2054();
        arg0.method2067();
        arg1.method2054();
        arg1.method2067();
        field1758++;
        int var6 = 0;
        int[] var7 = arg1.field1715;
        int var8 = arg1.field1757;
        for (int var9 = 0; var9 < arg0.field1757; var9++) {
            class91 var10 = arg0.field1744[var9];
            if (var10.field1546 != 0) {
                int var11 = arg0.field1716[var9] - arg3;
                if (var11 <= arg1.field1751) {
                    int var12 = arg0.field1715[var9] - arg2;
                    if (var12 >= arg1.field1752 && var12 <= arg1.field1753) {
                        int var13 = arg0.field1717[var9] - arg4;
                        if (var13 >= arg1.field1746 && var13 <= arg1.field1754) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class91 var15 = arg1.field1744[var14];
                                if (var7[var14] == var12 && arg1.field1717[var14] == var13 && arg1.field1716[var14] == var11 && var15.field1546 != 0) {
                                    if (arg0.field1747 == null) {
                                        arg0.field1747 = new class91[arg0.field1757];
                                    }
                                    if (arg1.field1747 == null) {
                                        arg1.field1747 = new class91[var8];
                                    }
                                    class91 var16 = arg0.field1747[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1747[var9] = new class91(var10);
                                    }
                                    class91 var17 = arg1.field1747[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1747[var14] = new class91(var15);
                                    }
                                    var16.field1555 += var15.field1555;
                                    var16.field1549 += var15.field1549;
                                    var16.field1548 += var15.field1548;
                                    var16.field1546 += var15.field1546;
                                    var17.field1555 += var10.field1555;
                                    var17.field1549 += var10.field1549;
                                    var17.field1548 += var10.field1548;
                                    var17.field1546 += var10.field1546;
                                    var6++;
                                    field1750[var9] = field1758;
                                    field1736[var14] = field1758;
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
        for (int var18 = 0; var18 < arg0.field1718; var18++) {
            if (field1750[arg0.field1739[var18]] == field1758 && field1750[arg0.field1720[var18]] == field1758 && field1750[arg0.field1721[var18]] == field1758) {
                if (arg0.field1755 == null) {
                    arg0.field1755 = new byte[arg0.field1718];
                }
                arg0.field1755[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1718; var19++) {
            if (field1736[arg1.field1739[var19]] == field1758 && field1736[arg1.field1720[var19]] == field1758 && field1736[arg1.field1721[var19]] == field1758) {
                if (arg1.field1755 == null) {
                    arg1.field1755 = new byte[arg1.field1718];
                }
                arg1.field1755[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cc.n(IIIII)Ldk;")
    public final class112 method2125(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2067();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class112 var8 = new class112();
        var8.field1890 = new int[this.field1718];
        var8.field1929 = new int[this.field1718];
        var8.field1892 = new int[this.field1718];
        if (this.field1729 > 0 && this.field1719 != null) {
            int[] var9 = new int[this.field1729];
            for (int var10 = 0; var10 < this.field1718; var10++) {
                if (this.field1719[var10] != -1) {
                    var9[this.field1719[var10] & 0xFF]++;
                }
            }
            var8.field1898 = 0;
            for (int var11 = 0; var11 < this.field1729; var11++) {
                if (var9[var11] > 0 && this.field1730[var11] == 0) {
                    var8.field1898++;
                }
            }
            var8.field1899 = new int[var8.field1898];
            var8.field1900 = new int[var8.field1898];
            var8.field1901 = new int[var8.field1898];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1729; var13++) {
                if (var9[var13] > 0 && this.field1730[var13] == 0) {
                    var8.field1899[var12] = this.field1731[var13] & 0xFFFF;
                    var8.field1900[var12] = this.field1732[var13] & 0xFFFF;
                    var8.field1901[var12] = this.field1733[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1938 = new byte[this.field1718];
            for (int var14 = 0; var14 < this.field1718; var14++) {
                if (this.field1719[var14] == -1) {
                    var8.field1938[var14] = -1;
                } else {
                    var8.field1938[var14] = (byte) var9[this.field1719[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1718; var15++) {
            byte var16;
            if (this.field1755 == null) {
                var16 = 0;
            } else {
                var16 = this.field1755[var15];
            }
            byte var17;
            if (this.field1724 == null) {
                var17 = 0;
            } else {
                var17 = this.field1724[var15];
            }
            short var18;
            if (this.field1740 == null) {
                var18 = -1;
            } else {
                var18 = this.field1740[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1726[var15] & 0xFFFF;
                    class91 var20;
                    if (this.field1747 == null || this.field1747[this.field1739[var15]] == null) {
                        var20 = this.field1744[this.field1739[var15]];
                    } else {
                        var20 = this.field1747[this.field1739[var15]];
                    }
                    int var21 = (var20.field1548 * arg4 + var20.field1555 * arg2 + var20.field1549 * arg3) / (var20.field1546 * var7) + arg0;
                    var8.field1890[var15] = method2113(var19, var21);
                    class91 var22;
                    if (this.field1747 == null || this.field1747[this.field1720[var15]] == null) {
                        var22 = this.field1744[this.field1720[var15]];
                    } else {
                        var22 = this.field1747[this.field1720[var15]];
                    }
                    int var23 = (var22.field1548 * arg4 + var22.field1555 * arg2 + var22.field1549 * arg3) / (var22.field1546 * var7) + arg0;
                    var8.field1929[var15] = method2113(var19, var23);
                    class91 var24;
                    if (this.field1747 == null || this.field1747[this.field1721[var15]] == null) {
                        var24 = this.field1744[this.field1721[var15]];
                    } else {
                        var24 = this.field1747[this.field1721[var15]];
                    }
                    int var25 = (var24.field1548 * arg4 + var24.field1555 * arg2 + var24.field1549 * arg3) / (var24.field1546 * var7) + arg0;
                    var8.field1892[var15] = method2113(var19, var25);
                } else if (var16 == 1) {
                    class92 var26 = this.field1728[var15];
                    int var27 = (var26.field1561 * arg4 + var26.field1563 * arg2 + var26.field1557 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1890[var15] = method2113(this.field1726[var15] & 0xFFFF, var27);
                    var8.field1892[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1890[var15] = 128;
                    var8.field1892[var15] = -1;
                } else {
                    var8.field1892[var15] = -2;
                }
            } else if (var16 == 0) {
                class91 var28;
                if (this.field1747 == null || this.field1747[this.field1739[var15]] == null) {
                    var28 = this.field1744[this.field1739[var15]];
                } else {
                    var28 = this.field1747[this.field1739[var15]];
                }
                int var29 = (var28.field1548 * arg4 + var28.field1555 * arg2 + var28.field1549 * arg3) / (var28.field1546 * var7) + arg0;
                var8.field1890[var15] = method2073(var29);
                class91 var30;
                if (this.field1747 == null || this.field1747[this.field1720[var15]] == null) {
                    var30 = this.field1744[this.field1720[var15]];
                } else {
                    var30 = this.field1747[this.field1720[var15]];
                }
                int var31 = (var30.field1548 * arg4 + var30.field1555 * arg2 + var30.field1549 * arg3) / (var30.field1546 * var7) + arg0;
                var8.field1929[var15] = method2073(var31);
                class91 var32;
                if (this.field1747 == null || this.field1747[this.field1721[var15]] == null) {
                    var32 = this.field1744[this.field1721[var15]];
                } else {
                    var32 = this.field1747[this.field1721[var15]];
                }
                int var33 = (var32.field1548 * arg4 + var32.field1555 * arg2 + var32.field1549 * arg3) / (var32.field1546 * var7) + arg0;
                var8.field1892[var15] = method2073(var33);
            } else if (var16 == 1) {
                class92 var34 = this.field1728[var15];
                int var35 = (var34.field1561 * arg4 + var34.field1563 * arg2 + var34.field1557 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1890[var15] = method2073(var35);
                var8.field1892[var15] = -1;
            } else {
                var8.field1892[var15] = -2;
            }
        }
        this.method2057();
        var8.field1924 = this.field1757;
        var8.field1942 = this.field1715;
        var8.field1884 = this.field1716;
        var8.field1895 = this.field1717;
        var8.field1886 = this.field1718;
        var8.field1907 = this.field1739;
        var8.field1888 = this.field1720;
        var8.field1889 = this.field1721;
        var8.field1893 = this.field1759;
        var8.field1894 = this.field1724;
        var8.field1922 = this.field1760;
        var8.field1913 = this.field1743;
        var8.field1902 = this.field1756;
        var8.field1896 = this.field1740;
        return var8;
    }

    @ObfuscatedName("cc.v(II)I")
    public static final int method2113(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cc.e(I)I")
    public static final int method2073(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
