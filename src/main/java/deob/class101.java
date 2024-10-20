package deob;

@ObfuscatedName("cw")
public class class101 extends class94 {

    @ObfuscatedName("cw.i")
    public int field1707 = 0;

    @ObfuscatedName("cw.v")
    public int[] field1727;

    @ObfuscatedName("cw.m")
    public int[] field1700;

    @ObfuscatedName("cw.j")
    public int[] field1690;

    @ObfuscatedName("cw.o")
    public int field1721 = 0;

    @ObfuscatedName("cw.l")
    public int[] field1731;

    @ObfuscatedName("cw.g")
    public int[] field1693;

    @ObfuscatedName("cw.w")
    public int[] field1694;

    @ObfuscatedName("cw.c")
    public byte[] field1695;

    @ObfuscatedName("cw.z")
    public byte[] field1696;

    @ObfuscatedName("cw.f")
    public byte[] field1697;

    @ObfuscatedName("cw.a")
    public byte[] field1691;

    @ObfuscatedName("cw.d")
    public short[] field1730;

    @ObfuscatedName("cw.e")
    public short[] field1692;

    @ObfuscatedName("cw.y")
    public byte field1701 = 0;

    @ObfuscatedName("cw.k")
    public int field1711;

    @ObfuscatedName("cw.h")
    public byte[] field1703;

    @ObfuscatedName("cw.x")
    public short[] field1704;

    @ObfuscatedName("cw.b")
    public short[] field1705;

    @ObfuscatedName("cw.n")
    public short[] field1698;

    @ObfuscatedName("cw.q")
    public short[] field1689;

    @ObfuscatedName("cw.r")
    public short[] field1708;

    @ObfuscatedName("cw.u")
    public short[] field1709;

    @ObfuscatedName("cw.p")
    public short[] field1710;

    @ObfuscatedName("cw.t")
    public short[] field1699;

    @ObfuscatedName("cw.s")
    public short[] field1712;

    @ObfuscatedName("cw.ah")
    public byte[] field1713;

    @ObfuscatedName("cw.ar")
    public int[] field1714;

    @ObfuscatedName("cw.ac")
    public int[] field1715;

    @ObfuscatedName("cw.as")
    public int[][] field1716;

    @ObfuscatedName("cw.ag")
    public int[][] field1717;

    @ObfuscatedName("cw.ak")
    public class92[] field1718;

    @ObfuscatedName("cw.am")
    public class91[] field1719;

    @ObfuscatedName("cw.ap")
    public class91[] field1720;

    @ObfuscatedName("cw.au")
    public short field1723;

    @ObfuscatedName("cw.aq")
    public short field1722;

    @ObfuscatedName("cw.at")
    public boolean field1688 = false;

    @ObfuscatedName("cw.aw")
    public int field1724;

    @ObfuscatedName("cw.ai")
    public int field1725;

    @ObfuscatedName("cw.ae")
    public int field1726;

    @ObfuscatedName("cw.ab")
    public int field1728;

    @ObfuscatedName("cw.ay")
    public int field1733;

    @ObfuscatedName("cw.ax")
    public static int[] field1729 = new int[10000];

    @ObfuscatedName("cw.ao")
    public static int[] field1702 = new int[10000];

    @ObfuscatedName("cw.al")
    public static int field1687 = 0;

    @ObfuscatedName("cw.az")
    public static int[] field1732 = class104.field1769;

    @ObfuscatedName("cw.aj")
    public static int[] field1706 = class104.field1787;

    public class101() {
    }

    @ObfuscatedName("cw.i(Ler;II)Lcw;")
    public static class101 method2081(class152 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3032(arg1, arg2);
        return var3 == null ? null : new class101(var3);
    }

    public class101(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2083(arg0);
        } else {
            this.method2100(arg0);
        }
    }

    @ObfuscatedName("cw.m([B)V")
    public void method2083(byte[] arg0) {
        class127 var2 = new class127(arg0);
        class127 var3 = new class127(arg0);
        class127 var4 = new class127(arg0);
        class127 var5 = new class127(arg0);
        class127 var6 = new class127(arg0);
        class127 var7 = new class127(arg0);
        class127 var8 = new class127(arg0);
        var2.field2039 = arg0.length - 23;
        int var9 = var2.method2493();
        int var10 = var2.method2493();
        int var11 = var2.method2491();
        int var12 = var2.method2491();
        int var13 = var2.method2491();
        int var14 = var2.method2491();
        int var15 = var2.method2491();
        int var16 = var2.method2491();
        int var17 = var2.method2491();
        int var18 = var2.method2493();
        int var19 = var2.method2493();
        int var20 = var2.method2493();
        int var21 = var2.method2493();
        int var22 = var2.method2493();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1703 = new byte[var11];
            var2.field2039 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1703[var26] = var2.method2492();
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
        this.field1707 = var9;
        this.field1721 = var10;
        this.field1711 = var11;
        this.field1727 = new int[var9];
        this.field1700 = new int[var9];
        this.field1690 = new int[var9];
        this.field1731 = new int[var10];
        this.field1693 = new int[var10];
        this.field1694 = new int[var10];
        if (var17 == 1) {
            this.field1714 = new int[var9];
        }
        if (var12 == 1) {
            this.field1695 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1696 = new byte[var10];
        } else {
            this.field1701 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1697 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1715 = new int[var10];
        }
        if (var16 == 1) {
            this.field1692 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1691 = new byte[var10];
        }
        this.field1730 = new short[var10];
        if (var11 > 0) {
            this.field1704 = new short[var11];
            this.field1705 = new short[var11];
            this.field1698 = new short[var11];
            if (var24 > 0) {
                this.field1689 = new short[var24];
                this.field1708 = new short[var24];
                this.field1709 = new short[var24];
                this.field1710 = new short[var24];
                this.field1713 = new byte[var24];
                this.field1699 = new short[var24];
            }
            if (var25 > 0) {
                this.field1712 = new short[var25];
            }
        }
        var2.field2039 = var11;
        var3.field2039 = var44;
        var4.field2039 = var46;
        var5.field2039 = var48;
        var6.field2039 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2491();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2502();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2502();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2502();
            }
            this.field1727[var67] = var64 + var69;
            this.field1700[var67] = var65 + var70;
            this.field1690[var67] = var66 + var71;
            var64 = this.field1727[var67];
            var65 = this.field1700[var67];
            var66 = this.field1690[var67];
            if (var17 == 1) {
                this.field1714[var67] = var6.method2491();
            }
        }
        var2.field2039 = var42;
        var3.field2039 = var31;
        var4.field2039 = var34;
        var5.field2039 = var37;
        var6.field2039 = var35;
        var7.field2039 = var40;
        var8.field2039 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1730[var72] = (short) var2.method2493();
            if (var12 == 1) {
                this.field1695[var72] = var3.method2492();
            }
            if (var13 == 255) {
                this.field1696[var72] = var4.method2492();
            }
            if (var14 == 1) {
                this.field1697[var72] = var5.method2492();
            }
            if (var15 == 1) {
                this.field1715[var72] = var6.method2491();
            }
            if (var16 == 1) {
                this.field1692[var72] = (short) (var7.method2493() - 1);
            }
            if (this.field1691 != null && this.field1692[var72] != -1) {
                this.field1691[var72] = (byte) (var8.method2491() - 1);
            }
        }
        var2.field2039 = var33;
        var3.field2039 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2491();
            if (var78 == 1) {
                var73 = var2.method2502() + var76;
                var74 = var2.method2502() + var73;
                var75 = var2.method2502() + var74;
                var76 = var75;
                this.field1731[var77] = var73;
                this.field1693[var77] = var74;
                this.field1694[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2502() + var76;
                var76 = var75;
                this.field1731[var77] = var73;
                this.field1693[var77] = var74;
                this.field1694[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2502() + var76;
                var76 = var75;
                this.field1731[var77] = var73;
                this.field1693[var77] = var74;
                this.field1694[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2502() + var76;
                var76 = var75;
                this.field1731[var77] = var73;
                this.field1693[var77] = var81;
                this.field1694[var77] = var75;
            }
        }
        var2.field2039 = var50;
        var3.field2039 = var52;
        var4.field2039 = var54;
        var5.field2039 = var56;
        var6.field2039 = var58;
        var7.field2039 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1703[var82] & 0xFF;
            if (var83 == 0) {
                this.field1704[var82] = (short) var2.method2493();
                this.field1705[var82] = (short) var2.method2493();
                this.field1698[var82] = (short) var2.method2493();
            }
            if (var83 == 1) {
                this.field1704[var82] = (short) var3.method2493();
                this.field1705[var82] = (short) var3.method2493();
                this.field1698[var82] = (short) var3.method2493();
                this.field1689[var82] = (short) var4.method2493();
                this.field1708[var82] = (short) var4.method2493();
                this.field1709[var82] = (short) var4.method2493();
                this.field1710[var82] = (short) var5.method2493();
                this.field1713[var82] = var6.method2492();
                this.field1699[var82] = (short) var7.method2493();
            }
            if (var83 == 2) {
                this.field1704[var82] = (short) var3.method2493();
                this.field1705[var82] = (short) var3.method2493();
                this.field1698[var82] = (short) var3.method2493();
                this.field1689[var82] = (short) var4.method2493();
                this.field1708[var82] = (short) var4.method2493();
                this.field1709[var82] = (short) var4.method2493();
                this.field1710[var82] = (short) var5.method2493();
                this.field1713[var82] = var6.method2492();
                this.field1699[var82] = (short) var7.method2493();
                this.field1712[var82] = (short) var7.method2493();
            }
            if (var83 == 3) {
                this.field1704[var82] = (short) var3.method2493();
                this.field1705[var82] = (short) var3.method2493();
                this.field1698[var82] = (short) var3.method2493();
                this.field1689[var82] = (short) var4.method2493();
                this.field1708[var82] = (short) var4.method2493();
                this.field1709[var82] = (short) var4.method2493();
                this.field1710[var82] = (short) var5.method2493();
                this.field1713[var82] = var6.method2492();
                this.field1699[var82] = (short) var7.method2493();
            }
        }
        var2.field2039 = var62;
        int var84 = var2.method2491();
        if (var84 == 0) {
            return;
        }
        new class103();
        var2.method2493();
        var2.method2493();
        var2.method2493();
        var2.method2668();
    }

    @ObfuscatedName("cw.j([B)V")
    public void method2100(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class127 var4 = new class127(arg0);
        class127 var5 = new class127(arg0);
        class127 var6 = new class127(arg0);
        class127 var7 = new class127(arg0);
        class127 var8 = new class127(arg0);
        var4.field2039 = arg0.length - 18;
        int var9 = var4.method2493();
        int var10 = var4.method2493();
        int var11 = var4.method2491();
        int var12 = var4.method2491();
        int var13 = var4.method2491();
        int var14 = var4.method2491();
        int var15 = var4.method2491();
        int var16 = var4.method2491();
        int var17 = var4.method2493();
        int var18 = var4.method2493();
        int var19 = var4.method2493();
        int var20 = var4.method2493();
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
        this.field1707 = var9;
        this.field1721 = var10;
        this.field1711 = var11;
        this.field1727 = new int[var9];
        this.field1700 = new int[var9];
        this.field1690 = new int[var9];
        this.field1731 = new int[var10];
        this.field1693 = new int[var10];
        this.field1694 = new int[var10];
        if (var11 > 0) {
            this.field1703 = new byte[var11];
            this.field1704 = new short[var11];
            this.field1705 = new short[var11];
            this.field1698 = new short[var11];
        }
        if (var16 == 1) {
            this.field1714 = new int[var9];
        }
        if (var12 == 1) {
            this.field1695 = new byte[var10];
            this.field1691 = new byte[var10];
            this.field1692 = new short[var10];
        }
        if (var13 == 255) {
            this.field1696 = new byte[var10];
        } else {
            this.field1701 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1697 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1715 = new int[var10];
        }
        this.field1730 = new short[var10];
        var4.field2039 = var21;
        var5.field2039 = var36;
        var6.field2039 = var38;
        var7.field2039 = var40;
        var8.field2039 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2491();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2502();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2502();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2502();
            }
            this.field1727[var46] = var43 + var48;
            this.field1700[var46] = var44 + var49;
            this.field1690[var46] = var45 + var50;
            var43 = this.field1727[var46];
            var44 = this.field1700[var46];
            var45 = this.field1690[var46];
            if (var16 == 1) {
                this.field1714[var46] = var8.method2491();
            }
        }
        var4.field2039 = var32;
        var5.field2039 = var28;
        var6.field2039 = var26;
        var7.field2039 = var30;
        var8.field2039 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1730[var51] = (short) var4.method2493();
            if (var12 == 1) {
                int var52 = var5.method2491();
                if ((var52 & 0x1) == 1) {
                    this.field1695[var51] = 1;
                    var2 = true;
                } else {
                    this.field1695[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1691[var51] = (byte) (var52 >> 2);
                    this.field1692[var51] = this.field1730[var51];
                    this.field1730[var51] = 127;
                    if (this.field1692[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1691[var51] = -1;
                    this.field1692[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1696[var51] = var6.method2492();
            }
            if (var14 == 1) {
                this.field1697[var51] = var7.method2492();
            }
            if (var15 == 1) {
                this.field1715[var51] = var8.method2491();
            }
        }
        var4.field2039 = var25;
        var5.field2039 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2491();
            if (var58 == 1) {
                var53 = var4.method2502() + var56;
                var54 = var4.method2502() + var53;
                var55 = var4.method2502() + var54;
                var56 = var55;
                this.field1731[var57] = var53;
                this.field1693[var57] = var54;
                this.field1694[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2502() + var56;
                var56 = var55;
                this.field1731[var57] = var53;
                this.field1693[var57] = var54;
                this.field1694[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2502() + var56;
                var56 = var55;
                this.field1731[var57] = var53;
                this.field1693[var57] = var54;
                this.field1694[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2502() + var56;
                var56 = var55;
                this.field1731[var57] = var53;
                this.field1693[var57] = var61;
                this.field1694[var57] = var55;
            }
        }
        var4.field2039 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1703[var62] = 0;
            this.field1704[var62] = (short) var4.method2493();
            this.field1705[var62] = (short) var4.method2493();
            this.field1698[var62] = (short) var4.method2493();
        }
        if (this.field1691 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1691[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1704[var65] & 0xFFFF) == this.field1731[var64] && (this.field1705[var65] & 0xFFFF) == this.field1693[var64] && (this.field1698[var65] & 0xFFFF) == this.field1694[var64]) {
                        this.field1691[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1691 = null;
            }
        }
        if (!var3) {
            this.field1692 = null;
        }
        if (!var2) {
            this.field1695 = null;
        }
    }

    public class101(class101[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1707 = 0;
        this.field1721 = 0;
        this.field1711 = 0;
        this.field1701 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class101 var10 = arg0[var9];
            if (var10 != null) {
                this.field1707 += var10.field1707;
                this.field1721 += var10.field1721;
                this.field1711 += var10.field1711;
                if (var10.field1696 == null) {
                    if (this.field1701 == -1) {
                        this.field1701 = var10.field1701;
                    }
                    if (this.field1701 != var10.field1701) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1695 != null;
                var5 |= var10.field1697 != null;
                var6 |= var10.field1715 != null;
                var7 |= var10.field1692 != null;
                var8 |= var10.field1691 != null;
            }
        }
        this.field1727 = new int[this.field1707];
        this.field1700 = new int[this.field1707];
        this.field1690 = new int[this.field1707];
        this.field1714 = new int[this.field1707];
        this.field1731 = new int[this.field1721];
        this.field1693 = new int[this.field1721];
        this.field1694 = new int[this.field1721];
        if (var3) {
            this.field1695 = new byte[this.field1721];
        }
        if (var4) {
            this.field1696 = new byte[this.field1721];
        }
        if (var5) {
            this.field1697 = new byte[this.field1721];
        }
        if (var6) {
            this.field1715 = new int[this.field1721];
        }
        if (var7) {
            this.field1692 = new short[this.field1721];
        }
        if (var8) {
            this.field1691 = new byte[this.field1721];
        }
        this.field1730 = new short[this.field1721];
        if (this.field1711 > 0) {
            this.field1703 = new byte[this.field1711];
            this.field1704 = new short[this.field1711];
            this.field1705 = new short[this.field1711];
            this.field1698 = new short[this.field1711];
            this.field1689 = new short[this.field1711];
            this.field1708 = new short[this.field1711];
            this.field1709 = new short[this.field1711];
            this.field1710 = new short[this.field1711];
            this.field1713 = new byte[this.field1711];
            this.field1699 = new short[this.field1711];
            this.field1712 = new short[this.field1711];
        }
        this.field1707 = 0;
        this.field1721 = 0;
        this.field1711 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class101 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1721; var13++) {
                    if (var3 && var12.field1695 != null) {
                        this.field1695[this.field1721] = var12.field1695[var13];
                    }
                    if (var4) {
                        if (var12.field1696 == null) {
                            this.field1696[this.field1721] = var12.field1701;
                        } else {
                            this.field1696[this.field1721] = var12.field1696[var13];
                        }
                    }
                    if (var5 && var12.field1697 != null) {
                        this.field1697[this.field1721] = var12.field1697[var13];
                    }
                    if (var6 && var12.field1715 != null) {
                        this.field1715[this.field1721] = var12.field1715[var13];
                    }
                    if (var7) {
                        if (var12.field1692 == null) {
                            this.field1692[this.field1721] = -1;
                        } else {
                            this.field1692[this.field1721] = var12.field1692[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1691 == null || var12.field1691[var13] == -1) {
                            this.field1691[this.field1721] = -1;
                        } else {
                            this.field1691[this.field1721] = (byte) (var12.field1691[var13] + this.field1711);
                        }
                    }
                    this.field1730[this.field1721] = var12.field1730[var13];
                    this.field1731[this.field1721] = this.method2134(var12, var12.field1731[var13]);
                    this.field1693[this.field1721] = this.method2134(var12, var12.field1693[var13]);
                    this.field1694[this.field1721] = this.method2134(var12, var12.field1694[var13]);
                    this.field1721++;
                }
                for (int var14 = 0; var14 < var12.field1711; var14++) {
                    byte var15 = this.field1703[this.field1711] = var12.field1703[var14];
                    if (var15 == 0) {
                        this.field1704[this.field1711] = (short) this.method2134(var12, var12.field1704[var14]);
                        this.field1705[this.field1711] = (short) this.method2134(var12, var12.field1705[var14]);
                        this.field1698[this.field1711] = (short) this.method2134(var12, var12.field1698[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1704[this.field1711] = var12.field1704[var14];
                        this.field1705[this.field1711] = var12.field1705[var14];
                        this.field1698[this.field1711] = var12.field1698[var14];
                        this.field1689[this.field1711] = var12.field1689[var14];
                        this.field1708[this.field1711] = var12.field1708[var14];
                        this.field1709[this.field1711] = var12.field1709[var14];
                        this.field1710[this.field1711] = var12.field1710[var14];
                        this.field1713[this.field1711] = var12.field1713[var14];
                        this.field1699[this.field1711] = var12.field1699[var14];
                    }
                    if (var15 == 2) {
                        this.field1712[this.field1711] = var12.field1712[var14];
                    }
                    this.field1711++;
                }
            }
        }
    }

    @ObfuscatedName("cw.o(Lcw;I)I")
    public final int method2134(class101 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1727[arg1];
        int var5 = arg0.field1700[arg1];
        int var6 = arg0.field1690[arg1];
        for (int var7 = 0; var7 < this.field1707; var7++) {
            if (this.field1727[var7] == var4 && this.field1700[var7] == var5 && this.field1690[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1727[this.field1707] = var4;
            this.field1700[this.field1707] = var5;
            this.field1690[this.field1707] = var6;
            if (arg0.field1714 != null) {
                this.field1714[this.field1707] = arg0.field1714[arg1];
            }
            var3 = this.field1707++;
        }
        return var3;
    }

    public class101(class101 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1707 = arg0.field1707;
        this.field1721 = arg0.field1721;
        this.field1711 = arg0.field1711;
        if (arg1) {
            this.field1727 = arg0.field1727;
            this.field1700 = arg0.field1700;
            this.field1690 = arg0.field1690;
        } else {
            this.field1727 = new int[this.field1707];
            this.field1700 = new int[this.field1707];
            this.field1690 = new int[this.field1707];
            for (int var6 = 0; var6 < this.field1707; var6++) {
                this.field1727[var6] = arg0.field1727[var6];
                this.field1700[var6] = arg0.field1700[var6];
                this.field1690[var6] = arg0.field1690[var6];
            }
        }
        if (arg2) {
            this.field1730 = arg0.field1730;
        } else {
            this.field1730 = new short[this.field1721];
            for (int var7 = 0; var7 < this.field1721; var7++) {
                this.field1730[var7] = arg0.field1730[var7];
            }
        }
        if (arg3 || arg0.field1692 == null) {
            this.field1692 = arg0.field1692;
        } else {
            this.field1692 = new short[this.field1721];
            for (int var8 = 0; var8 < this.field1721; var8++) {
                this.field1692[var8] = arg0.field1692[var8];
            }
        }
        if (arg4) {
            this.field1697 = arg0.field1697;
        } else {
            this.field1697 = new byte[this.field1721];
            if (arg0.field1697 == null) {
                for (int var9 = 0; var9 < this.field1721; var9++) {
                    this.field1697[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1721; var10++) {
                    this.field1697[var10] = arg0.field1697[var10];
                }
            }
        }
        this.field1731 = arg0.field1731;
        this.field1693 = arg0.field1693;
        this.field1694 = arg0.field1694;
        this.field1695 = arg0.field1695;
        this.field1696 = arg0.field1696;
        this.field1691 = arg0.field1691;
        this.field1701 = arg0.field1701;
        this.field1703 = arg0.field1703;
        this.field1704 = arg0.field1704;
        this.field1705 = arg0.field1705;
        this.field1698 = arg0.field1698;
        this.field1689 = arg0.field1689;
        this.field1708 = arg0.field1708;
        this.field1709 = arg0.field1709;
        this.field1710 = arg0.field1710;
        this.field1713 = arg0.field1713;
        this.field1699 = arg0.field1699;
        this.field1712 = arg0.field1712;
        this.field1714 = arg0.field1714;
        this.field1715 = arg0.field1715;
        this.field1716 = arg0.field1716;
        this.field1717 = arg0.field1717;
        this.field1719 = arg0.field1719;
        this.field1718 = arg0.field1718;
        this.field1720 = arg0.field1720;
        this.field1723 = arg0.field1723;
        this.field1722 = arg0.field1722;
    }

    @ObfuscatedName("cw.g()Lcw;")
    public class101 method2087() {
        class101 var1 = new class101();
        if (this.field1695 != null) {
            var1.field1695 = new byte[this.field1721];
            for (int var2 = 0; var2 < this.field1721; var2++) {
                var1.field1695[var2] = this.field1695[var2];
            }
        }
        var1.field1707 = this.field1707;
        var1.field1721 = this.field1721;
        var1.field1711 = this.field1711;
        var1.field1727 = this.field1727;
        var1.field1700 = this.field1700;
        var1.field1690 = this.field1690;
        var1.field1731 = this.field1731;
        var1.field1693 = this.field1693;
        var1.field1694 = this.field1694;
        var1.field1696 = this.field1696;
        var1.field1697 = this.field1697;
        var1.field1691 = this.field1691;
        var1.field1730 = this.field1730;
        var1.field1692 = this.field1692;
        var1.field1701 = this.field1701;
        var1.field1703 = this.field1703;
        var1.field1704 = this.field1704;
        var1.field1705 = this.field1705;
        var1.field1698 = this.field1698;
        var1.field1689 = this.field1689;
        var1.field1708 = this.field1708;
        var1.field1709 = this.field1709;
        var1.field1710 = this.field1710;
        var1.field1713 = this.field1713;
        var1.field1699 = this.field1699;
        var1.field1712 = this.field1712;
        var1.field1714 = this.field1714;
        var1.field1715 = this.field1715;
        var1.field1716 = this.field1716;
        var1.field1717 = this.field1717;
        var1.field1719 = this.field1719;
        var1.field1718 = this.field1718;
        var1.field1723 = this.field1723;
        var1.field1722 = this.field1722;
        return var1;
    }

    @ObfuscatedName("cw.w([[IIIIZI)Lcw;")
    public class101 method2124(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2107();
        int var7 = this.field1725 + arg1;
        int var8 = this.field1726 + arg1;
        int var9 = this.field1733 + arg3;
        int var10 = this.field1728 + arg3;
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
            var15.field1707 = this.field1707;
            var15.field1721 = this.field1721;
            var15.field1711 = this.field1711;
            var15.field1727 = this.field1727;
            var15.field1690 = this.field1690;
            var15.field1731 = this.field1731;
            var15.field1693 = this.field1693;
            var15.field1694 = this.field1694;
            var15.field1695 = this.field1695;
            var15.field1696 = this.field1696;
            var15.field1697 = this.field1697;
            var15.field1691 = this.field1691;
            var15.field1730 = this.field1730;
            var15.field1692 = this.field1692;
            var15.field1701 = this.field1701;
            var15.field1703 = this.field1703;
            var15.field1704 = this.field1704;
            var15.field1705 = this.field1705;
            var15.field1698 = this.field1698;
            var15.field1689 = this.field1689;
            var15.field1708 = this.field1708;
            var15.field1709 = this.field1709;
            var15.field1710 = this.field1710;
            var15.field1713 = this.field1713;
            var15.field1699 = this.field1699;
            var15.field1712 = this.field1712;
            var15.field1714 = this.field1714;
            var15.field1715 = this.field1715;
            var15.field1716 = this.field1716;
            var15.field1717 = this.field1717;
            var15.field1723 = this.field1723;
            var15.field1722 = this.field1722;
            var15.field1700 = new int[var15.field1707];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1707; var16++) {
                int var17 = this.field1727[var16] + arg1;
                int var18 = this.field1690[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1700[var16] = this.field1700[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1707; var26++) {
                int var27 = (-this.field1700[var26] << 16) / this.field1556;
                if (var27 < arg5) {
                    int var28 = this.field1727[var26] + arg1;
                    int var29 = this.field1690[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1700[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1700[var26];
                }
            }
        }
        var15.method2080();
        return var15;
    }

    @ObfuscatedName("cw.c()V")
    public void method2089() {
        int var10002;
        if (this.field1714 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1707; var3++) {
                int var4 = this.field1714[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1716 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1716[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1707) {
                int var7 = this.field1714[var6];
                this.field1716[var7][var1[var7]++] = var6++;
            }
            this.field1714 = null;
        }
        if (this.field1715 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1721; var10++) {
            int var11 = this.field1715[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1717 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1717[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1721) {
            int var14 = this.field1715[var13];
            this.field1717[var14][var8[var14]++] = var13++;
        }
        this.field1715 = null;
    }

    @ObfuscatedName("cw.z()V")
    public void method2090() {
        for (int var1 = 0; var1 < this.field1707; var1++) {
            int var2 = this.field1727[var1];
            this.field1727[var1] = this.field1690[var1];
            this.field1690[var1] = -var2;
        }
        this.method2080();
    }

    @ObfuscatedName("cw.f()V")
    public void method2091() {
        for (int var1 = 0; var1 < this.field1707; var1++) {
            this.field1727[var1] = -this.field1727[var1];
            this.field1690[var1] = -this.field1690[var1];
        }
        this.method2080();
    }

    @ObfuscatedName("cw.a()V")
    public void method2092() {
        for (int var1 = 0; var1 < this.field1707; var1++) {
            int var2 = this.field1690[var1];
            this.field1690[var1] = this.field1727[var1];
            this.field1727[var1] = -var2;
        }
        this.method2080();
    }

    @ObfuscatedName("cw.d(I)V")
    public void method2093(int arg0) {
        int var2 = field1732[arg0];
        int var3 = field1706[arg0];
        for (int var4 = 0; var4 < this.field1707; var4++) {
            int var5 = this.field1727[var4] * var3 + this.field1690[var4] * var2 >> 16;
            this.field1690[var4] = this.field1690[var4] * var3 - this.field1727[var4] * var2 >> 16;
            this.field1727[var4] = var5;
        }
        this.method2080();
    }

    @ObfuscatedName("cw.e(III)V")
    public void method2161(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1707; var4++) {
            this.field1727[var4] += arg0;
            this.field1700[var4] += arg1;
            this.field1690[var4] += arg2;
        }
        this.method2080();
    }

    @ObfuscatedName("cw.y(SS)V")
    public void method2095(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1721; var3++) {
            if (this.field1730[var3] == arg0) {
                this.field1730[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cw.k(SS)V")
    public void method2152(short arg0, short arg1) {
        if (this.field1692 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1721; var3++) {
            if (this.field1692[var3] == arg0) {
                this.field1692[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cw.h()V")
    public void method2097() {
        for (int var1 = 0; var1 < this.field1707; var1++) {
            this.field1690[var1] = -this.field1690[var1];
        }
        for (int var2 = 0; var2 < this.field1721; var2++) {
            int var3 = this.field1731[var2];
            this.field1731[var2] = this.field1694[var2];
            this.field1694[var2] = var3;
        }
        this.method2080();
    }

    @ObfuscatedName("cw.x(III)V")
    public void method2098(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1707; var4++) {
            this.field1727[var4] = this.field1727[var4] * arg0 / 128;
            this.field1700[var4] = this.field1700[var4] * arg1 / 128;
            this.field1690[var4] = this.field1690[var4] * arg2 / 128;
        }
        this.method2080();
    }

    @ObfuscatedName("cw.b()V")
    public void method2099() {
        if (this.field1719 != null) {
            return;
        }
        this.field1719 = new class91[this.field1707];
        for (int var1 = 0; var1 < this.field1707; var1++) {
            this.field1719[var1] = new class91();
        }
        for (int var2 = 0; var2 < this.field1721; var2++) {
            int var3 = this.field1731[var2];
            int var4 = this.field1693[var2];
            int var5 = this.field1694[var2];
            int var6 = this.field1727[var4] - this.field1727[var3];
            int var7 = this.field1700[var4] - this.field1700[var3];
            int var8 = this.field1690[var4] - this.field1690[var3];
            int var9 = this.field1727[var5] - this.field1727[var3];
            int var10 = this.field1700[var5] - this.field1700[var3];
            int var11 = this.field1690[var5] - this.field1690[var3];
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
            if (this.field1695 == null) {
                var19 = 0;
            } else {
                var19 = this.field1695[var2];
            }
            if (var19 == 0) {
                class91 var20 = this.field1719[var3];
                var20.field1523 += var16;
                var20.field1516 += var17;
                var20.field1515 += var18;
                var20.field1518++;
                class91 var21 = this.field1719[var4];
                var21.field1523 += var16;
                var21.field1516 += var17;
                var21.field1515 += var18;
                var21.field1518++;
                class91 var22 = this.field1719[var5];
                var22.field1523 += var16;
                var22.field1516 += var17;
                var22.field1515 += var18;
                var22.field1518++;
            } else if (var19 == 1) {
                if (this.field1718 == null) {
                    this.field1718 = new class92[this.field1721];
                }
                class92 var23 = this.field1718[var2] = new class92();
                var23.field1527 = var16;
                var23.field1530 = var17;
                var23.field1528 = var18;
            }
        }
    }

    @ObfuscatedName("cw.n()V")
    public void method2080() {
        this.field1719 = null;
        this.field1720 = null;
        this.field1718 = null;
        this.field1688 = false;
    }

    @ObfuscatedName("cw.q()V")
    public void method2107() {
        if (this.field1688) {
            return;
        }
        this.field1556 = 0;
        this.field1724 = 0;
        this.field1725 = 999999;
        this.field1726 = -999999;
        this.field1728 = -99999;
        this.field1733 = 99999;
        for (int var1 = 0; var1 < this.field1707; var1++) {
            int var2 = this.field1727[var1];
            int var3 = this.field1700[var1];
            int var4 = this.field1690[var1];
            if (var2 < this.field1725) {
                this.field1725 = var2;
            }
            if (var2 > this.field1726) {
                this.field1726 = var2;
            }
            if (var4 < this.field1733) {
                this.field1733 = var4;
            }
            if (var4 > this.field1728) {
                this.field1728 = var4;
            }
            if (-var3 > this.field1556) {
                this.field1556 = -var3;
            }
            if (var3 > this.field1724) {
                this.field1724 = var3;
            }
        }
        this.field1688 = true;
    }

    @ObfuscatedName("cw.ah(Lcw;Lcw;IIIZ)V")
    public static void method2101(class101 arg0, class101 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2107();
        arg0.method2099();
        arg1.method2107();
        arg1.method2099();
        field1687++;
        int var6 = 0;
        int[] var7 = arg1.field1727;
        int var8 = arg1.field1707;
        for (int var9 = 0; var9 < arg0.field1707; var9++) {
            class91 var10 = arg0.field1719[var9];
            if (var10.field1518 != 0) {
                int var11 = arg0.field1700[var9] - arg3;
                if (var11 <= arg1.field1724) {
                    int var12 = arg0.field1727[var9] - arg2;
                    if (var12 >= arg1.field1725 && var12 <= arg1.field1726) {
                        int var13 = arg0.field1690[var9] - arg4;
                        if (var13 >= arg1.field1733 && var13 <= arg1.field1728) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class91 var15 = arg1.field1719[var14];
                                if (var7[var14] == var12 && arg1.field1690[var14] == var13 && arg1.field1700[var14] == var11 && var15.field1518 != 0) {
                                    if (arg0.field1720 == null) {
                                        arg0.field1720 = new class91[arg0.field1707];
                                    }
                                    if (arg1.field1720 == null) {
                                        arg1.field1720 = new class91[var8];
                                    }
                                    class91 var16 = arg0.field1720[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1720[var9] = new class91(var10);
                                    }
                                    class91 var17 = arg1.field1720[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1720[var14] = new class91(var15);
                                    }
                                    var16.field1523 += var15.field1523;
                                    var16.field1516 += var15.field1516;
                                    var16.field1515 += var15.field1515;
                                    var16.field1518 += var15.field1518;
                                    var17.field1523 += var10.field1523;
                                    var17.field1516 += var10.field1516;
                                    var17.field1515 += var10.field1515;
                                    var17.field1518 += var10.field1518;
                                    var6++;
                                    field1729[var9] = field1687;
                                    field1702[var14] = field1687;
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
        for (int var18 = 0; var18 < arg0.field1721; var18++) {
            if (field1729[arg0.field1731[var18]] == field1687 && field1729[arg0.field1693[var18]] == field1687 && field1729[arg0.field1694[var18]] == field1687) {
                if (arg0.field1695 == null) {
                    arg0.field1695 = new byte[arg0.field1721];
                }
                arg0.field1695[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1721; var19++) {
            if (field1702[arg1.field1731[var19]] == field1687 && field1702[arg1.field1693[var19]] == field1687 && field1702[arg1.field1694[var19]] == field1687) {
                if (arg1.field1695 == null) {
                    arg1.field1695 = new byte[arg1.field1721];
                }
                arg1.field1695[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cw.ar(IIIII)Ldl;")
    public final class112 method2102(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2099();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class112 var8 = new class112();
        var8.field1875 = new int[this.field1721];
        var8.field1891 = new int[this.field1721];
        var8.field1877 = new int[this.field1721];
        if (this.field1711 > 0 && this.field1691 != null) {
            int[] var9 = new int[this.field1711];
            for (int var10 = 0; var10 < this.field1721; var10++) {
                if (this.field1691[var10] != -1) {
                    var9[this.field1691[var10] & 0xFF]++;
                }
            }
            var8.field1883 = 0;
            for (int var11 = 0; var11 < this.field1711; var11++) {
                if (var9[var11] > 0 && this.field1703[var11] == 0) {
                    var8.field1883++;
                }
            }
            var8.field1910 = new int[var8.field1883];
            var8.field1907 = new int[var8.field1883];
            var8.field1886 = new int[var8.field1883];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1711; var13++) {
                if (var9[var13] > 0 && this.field1703[var13] == 0) {
                    var8.field1910[var12] = this.field1704[var13] & 0xFFFF;
                    var8.field1907[var12] = this.field1705[var13] & 0xFFFF;
                    var8.field1886[var12] = this.field1698[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1880 = new byte[this.field1721];
            for (int var14 = 0; var14 < this.field1721; var14++) {
                if (this.field1691[var14] == -1) {
                    var8.field1880[var14] = -1;
                } else {
                    var8.field1880[var14] = (byte) var9[this.field1691[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1721; var15++) {
            byte var16;
            if (this.field1695 == null) {
                var16 = 0;
            } else {
                var16 = this.field1695[var15];
            }
            byte var17;
            if (this.field1697 == null) {
                var17 = 0;
            } else {
                var17 = this.field1697[var15];
            }
            short var18;
            if (this.field1692 == null) {
                var18 = -1;
            } else {
                var18 = this.field1692[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1730[var15] & 0xFFFF;
                    class91 var20;
                    if (this.field1720 == null || this.field1720[this.field1731[var15]] == null) {
                        var20 = this.field1719[this.field1731[var15]];
                    } else {
                        var20 = this.field1720[this.field1731[var15]];
                    }
                    int var21 = (var20.field1515 * arg4 + var20.field1523 * arg2 + var20.field1516 * arg3) / (var20.field1518 * var7) + arg0;
                    var8.field1875[var15] = method2103(var19, var21);
                    class91 var22;
                    if (this.field1720 == null || this.field1720[this.field1693[var15]] == null) {
                        var22 = this.field1719[this.field1693[var15]];
                    } else {
                        var22 = this.field1720[this.field1693[var15]];
                    }
                    int var23 = (var22.field1515 * arg4 + var22.field1523 * arg2 + var22.field1516 * arg3) / (var22.field1518 * var7) + arg0;
                    var8.field1891[var15] = method2103(var19, var23);
                    class91 var24;
                    if (this.field1720 == null || this.field1720[this.field1694[var15]] == null) {
                        var24 = this.field1719[this.field1694[var15]];
                    } else {
                        var24 = this.field1720[this.field1694[var15]];
                    }
                    int var25 = (var24.field1515 * arg4 + var24.field1523 * arg2 + var24.field1516 * arg3) / (var24.field1518 * var7) + arg0;
                    var8.field1877[var15] = method2103(var19, var25);
                } else if (var16 == 1) {
                    class92 var26 = this.field1718[var15];
                    int var27 = (var26.field1528 * arg4 + var26.field1530 * arg3 + var26.field1527 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field1875[var15] = method2103(this.field1730[var15] & 0xFFFF, var27);
                    var8.field1877[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1875[var15] = 128;
                    var8.field1877[var15] = -1;
                } else {
                    var8.field1877[var15] = -2;
                }
            } else if (var16 == 0) {
                class91 var28;
                if (this.field1720 == null || this.field1720[this.field1731[var15]] == null) {
                    var28 = this.field1719[this.field1731[var15]];
                } else {
                    var28 = this.field1720[this.field1731[var15]];
                }
                int var29 = (var28.field1515 * arg4 + var28.field1523 * arg2 + var28.field1516 * arg3) / (var28.field1518 * var7) + arg0;
                var8.field1875[var15] = method2119(var29);
                class91 var30;
                if (this.field1720 == null || this.field1720[this.field1693[var15]] == null) {
                    var30 = this.field1719[this.field1693[var15]];
                } else {
                    var30 = this.field1720[this.field1693[var15]];
                }
                int var31 = (var30.field1515 * arg4 + var30.field1523 * arg2 + var30.field1516 * arg3) / (var30.field1518 * var7) + arg0;
                var8.field1891[var15] = method2119(var31);
                class91 var32;
                if (this.field1720 == null || this.field1720[this.field1694[var15]] == null) {
                    var32 = this.field1719[this.field1694[var15]];
                } else {
                    var32 = this.field1720[this.field1694[var15]];
                }
                int var33 = (var32.field1515 * arg4 + var32.field1523 * arg2 + var32.field1516 * arg3) / (var32.field1518 * var7) + arg0;
                var8.field1877[var15] = method2119(var33);
            } else if (var16 == 1) {
                class92 var34 = this.field1718[var15];
                int var35 = (var34.field1528 * arg4 + var34.field1530 * arg3 + var34.field1527 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field1875[var15] = method2119(var35);
                var8.field1877[var15] = -1;
            } else {
                var8.field1877[var15] = -2;
            }
        }
        this.method2089();
        var8.field1867 = this.field1707;
        var8.field1868 = this.field1727;
        var8.field1869 = this.field1700;
        var8.field1916 = this.field1690;
        var8.field1871 = this.field1721;
        var8.field1872 = this.field1731;
        var8.field1873 = this.field1693;
        var8.field1874 = this.field1694;
        var8.field1887 = this.field1696;
        var8.field1863 = this.field1697;
        var8.field1882 = this.field1701;
        var8.field1878 = this.field1716;
        var8.field1899 = this.field1717;
        var8.field1927 = this.field1692;
        return var8;
    }

    @ObfuscatedName("cw.ac(II)I")
    public static final int method2103(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cw.as(I)I")
    public static final int method2119(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
