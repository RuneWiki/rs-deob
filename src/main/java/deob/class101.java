package deob;

@ObfuscatedName("cz")
public class class101 extends class94 {

    @ObfuscatedName("cz.c")
    public int field1699 = 0;

    @ObfuscatedName("cz.q")
    public int[] field1690;

    @ObfuscatedName("cz.y")
    public int[] field1691;

    @ObfuscatedName("cz.v")
    public int[] field1729;

    @ObfuscatedName("cz.g")
    public int field1693 = 0;

    @ObfuscatedName("cz.x")
    public int[] field1694;

    @ObfuscatedName("cz.u")
    public int[] field1726;

    @ObfuscatedName("cz.l")
    public int[] field1696;

    @ObfuscatedName("cz.a")
    public byte[] field1697;

    @ObfuscatedName("cz.h")
    public byte[] field1698;

    @ObfuscatedName("cz.t")
    public byte[] field1735;

    @ObfuscatedName("cz.m")
    public byte[] field1700;

    @ObfuscatedName("cz.s")
    public short[] field1689;

    @ObfuscatedName("cz.j")
    public short[] field1695;

    @ObfuscatedName("cz.b")
    public byte field1703 = 0;

    @ObfuscatedName("cz.n")
    public int field1701;

    @ObfuscatedName("cz.z")
    public byte[] field1730;

    @ObfuscatedName("cz.d")
    public short[] field1706;

    @ObfuscatedName("cz.f")
    public short[] field1707;

    @ObfuscatedName("cz.o")
    public short[] field1722;

    @ObfuscatedName("cz.r")
    public short[] field1709;

    @ObfuscatedName("cz.k")
    public short[] field1710;

    @ObfuscatedName("cz.w")
    public short[] field1727;

    @ObfuscatedName("cz.e")
    public short[] field1712;

    @ObfuscatedName("cz.p")
    public short[] field1692;

    @ObfuscatedName("cz.i")
    public short[] field1711;

    @ObfuscatedName("cz.ap")
    public byte[] field1715;

    @ObfuscatedName("cz.as")
    public int[] field1716;

    @ObfuscatedName("cz.ak")
    public int[] field1717;

    @ObfuscatedName("cz.af")
    public int[][] field1718;

    @ObfuscatedName("cz.ag")
    public int[][] field1719;

    @ObfuscatedName("cz.aj")
    public class92[] field1720;

    @ObfuscatedName("cz.ac")
    public class91[] field1721;

    @ObfuscatedName("cz.an")
    public class91[] field1704;

    @ObfuscatedName("cz.ad")
    public short field1723;

    @ObfuscatedName("cz.ai")
    public short field1724;

    @ObfuscatedName("cz.ae")
    public boolean field1708 = false;

    @ObfuscatedName("cz.au")
    public int field1702;

    @ObfuscatedName("cz.at")
    public int field1725;

    @ObfuscatedName("cz.ax")
    public int field1728;

    @ObfuscatedName("cz.aq")
    public int field1705;

    @ObfuscatedName("cz.aw")
    public int field1714;

    @ObfuscatedName("cz.ao")
    public static int[] field1731 = new int[10000];

    @ObfuscatedName("cz.aa")
    public static int[] field1732 = new int[10000];

    @ObfuscatedName("cz.ah")
    public static int field1733 = 0;

    @ObfuscatedName("cz.av")
    public static int[] field1734 = class104.field1776;

    @ObfuscatedName("cz.am")
    public static int[] field1713 = class104.field1789;

    public class101() {
    }

    @ObfuscatedName("cz.c(Ley;II)Lcz;")
    public static class101 method1979(class153 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2886(arg1, arg2);
        return var3 == null ? null : new class101(var3);
    }

    public class101(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1968(arg0);
        } else {
            this.method1969(arg0);
        }
    }

    @ObfuscatedName("cz.y([B)V")
    public void method1968(byte[] arg0) {
        class127 var2 = new class127(arg0);
        class127 var3 = new class127(arg0);
        class127 var4 = new class127(arg0);
        class127 var5 = new class127(arg0);
        class127 var6 = new class127(arg0);
        class127 var7 = new class127(arg0);
        class127 var8 = new class127(arg0);
        var2.field2052 = arg0.length - 23;
        int var9 = var2.method2327();
        int var10 = var2.method2327();
        int var11 = var2.method2383();
        int var12 = var2.method2383();
        int var13 = var2.method2383();
        int var14 = var2.method2383();
        int var15 = var2.method2383();
        int var16 = var2.method2383();
        int var17 = var2.method2383();
        int var18 = var2.method2327();
        int var19 = var2.method2327();
        int var20 = var2.method2327();
        int var21 = var2.method2327();
        int var22 = var2.method2327();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1730 = new byte[var11];
            var2.field2052 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1730[var26] = var2.method2319();
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
        this.field1699 = var9;
        this.field1693 = var10;
        this.field1701 = var11;
        this.field1690 = new int[var9];
        this.field1691 = new int[var9];
        this.field1729 = new int[var9];
        this.field1694 = new int[var10];
        this.field1726 = new int[var10];
        this.field1696 = new int[var10];
        if (var17 == 1) {
            this.field1716 = new int[var9];
        }
        if (var12 == 1) {
            this.field1697 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1698 = new byte[var10];
        } else {
            this.field1703 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1735 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1717 = new int[var10];
        }
        if (var16 == 1) {
            this.field1695 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1700 = new byte[var10];
        }
        this.field1689 = new short[var10];
        if (var11 > 0) {
            this.field1706 = new short[var11];
            this.field1707 = new short[var11];
            this.field1722 = new short[var11];
            if (var24 > 0) {
                this.field1709 = new short[var24];
                this.field1710 = new short[var24];
                this.field1727 = new short[var24];
                this.field1712 = new short[var24];
                this.field1715 = new byte[var24];
                this.field1692 = new short[var24];
            }
            if (var25 > 0) {
                this.field1711 = new short[var25];
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
            int var68 = var2.method2383();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2412();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2412();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2412();
            }
            this.field1690[var67] = var64 + var69;
            this.field1691[var67] = var65 + var70;
            this.field1729[var67] = var66 + var71;
            var64 = this.field1690[var67];
            var65 = this.field1691[var67];
            var66 = this.field1729[var67];
            if (var17 == 1) {
                this.field1716[var67] = var6.method2383();
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
            this.field1689[var72] = (short) var2.method2327();
            if (var12 == 1) {
                this.field1697[var72] = var3.method2319();
            }
            if (var13 == 255) {
                this.field1698[var72] = var4.method2319();
            }
            if (var14 == 1) {
                this.field1735[var72] = var5.method2319();
            }
            if (var15 == 1) {
                this.field1717[var72] = var6.method2383();
            }
            if (var16 == 1) {
                this.field1695[var72] = (short) (var7.method2327() - 1);
            }
            if (this.field1700 != null && this.field1695[var72] != -1) {
                this.field1700[var72] = (byte) (var8.method2383() - 1);
            }
        }
        var2.field2052 = var33;
        var3.field2052 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2383();
            if (var78 == 1) {
                var73 = var2.method2412() + var76;
                var74 = var2.method2412() + var73;
                var75 = var2.method2412() + var74;
                var76 = var75;
                this.field1694[var77] = var73;
                this.field1726[var77] = var74;
                this.field1696[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2412() + var76;
                var76 = var75;
                this.field1694[var77] = var73;
                this.field1726[var77] = var74;
                this.field1696[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2412() + var76;
                var76 = var75;
                this.field1694[var77] = var73;
                this.field1726[var77] = var74;
                this.field1696[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2412() + var76;
                var76 = var75;
                this.field1694[var77] = var73;
                this.field1726[var77] = var81;
                this.field1696[var77] = var75;
            }
        }
        var2.field2052 = var50;
        var3.field2052 = var52;
        var4.field2052 = var54;
        var5.field2052 = var56;
        var6.field2052 = var58;
        var7.field2052 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1730[var82] & 0xFF;
            if (var83 == 0) {
                this.field1706[var82] = (short) var2.method2327();
                this.field1707[var82] = (short) var2.method2327();
                this.field1722[var82] = (short) var2.method2327();
            }
            if (var83 == 1) {
                this.field1706[var82] = (short) var3.method2327();
                this.field1707[var82] = (short) var3.method2327();
                this.field1722[var82] = (short) var3.method2327();
                this.field1709[var82] = (short) var4.method2327();
                this.field1710[var82] = (short) var4.method2327();
                this.field1727[var82] = (short) var4.method2327();
                this.field1712[var82] = (short) var5.method2327();
                this.field1715[var82] = var6.method2319();
                this.field1692[var82] = (short) var7.method2327();
            }
            if (var83 == 2) {
                this.field1706[var82] = (short) var3.method2327();
                this.field1707[var82] = (short) var3.method2327();
                this.field1722[var82] = (short) var3.method2327();
                this.field1709[var82] = (short) var4.method2327();
                this.field1710[var82] = (short) var4.method2327();
                this.field1727[var82] = (short) var4.method2327();
                this.field1712[var82] = (short) var5.method2327();
                this.field1715[var82] = var6.method2319();
                this.field1692[var82] = (short) var7.method2327();
                this.field1711[var82] = (short) var7.method2327();
            }
            if (var83 == 3) {
                this.field1706[var82] = (short) var3.method2327();
                this.field1707[var82] = (short) var3.method2327();
                this.field1722[var82] = (short) var3.method2327();
                this.field1709[var82] = (short) var4.method2327();
                this.field1710[var82] = (short) var4.method2327();
                this.field1727[var82] = (short) var4.method2327();
                this.field1712[var82] = (short) var5.method2327();
                this.field1715[var82] = var6.method2319();
                this.field1692[var82] = (short) var7.method2327();
            }
        }
        var2.field2052 = var62;
        int var84 = var2.method2383();
        if (var84 == 0) {
            return;
        }
        new class103();
        var2.method2327();
        var2.method2327();
        var2.method2327();
        var2.method2323();
    }

    @ObfuscatedName("cz.v([B)V")
    public void method1969(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class127 var4 = new class127(arg0);
        class127 var5 = new class127(arg0);
        class127 var6 = new class127(arg0);
        class127 var7 = new class127(arg0);
        class127 var8 = new class127(arg0);
        var4.field2052 = arg0.length - 18;
        int var9 = var4.method2327();
        int var10 = var4.method2327();
        int var11 = var4.method2383();
        int var12 = var4.method2383();
        int var13 = var4.method2383();
        int var14 = var4.method2383();
        int var15 = var4.method2383();
        int var16 = var4.method2383();
        int var17 = var4.method2327();
        int var18 = var4.method2327();
        int var19 = var4.method2327();
        int var20 = var4.method2327();
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
        this.field1699 = var9;
        this.field1693 = var10;
        this.field1701 = var11;
        this.field1690 = new int[var9];
        this.field1691 = new int[var9];
        this.field1729 = new int[var9];
        this.field1694 = new int[var10];
        this.field1726 = new int[var10];
        this.field1696 = new int[var10];
        if (var11 > 0) {
            this.field1730 = new byte[var11];
            this.field1706 = new short[var11];
            this.field1707 = new short[var11];
            this.field1722 = new short[var11];
        }
        if (var16 == 1) {
            this.field1716 = new int[var9];
        }
        if (var12 == 1) {
            this.field1697 = new byte[var10];
            this.field1700 = new byte[var10];
            this.field1695 = new short[var10];
        }
        if (var13 == 255) {
            this.field1698 = new byte[var10];
        } else {
            this.field1703 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1735 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1717 = new int[var10];
        }
        this.field1689 = new short[var10];
        var4.field2052 = var21;
        var5.field2052 = var36;
        var6.field2052 = var38;
        var7.field2052 = var40;
        var8.field2052 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2383();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2412();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2412();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2412();
            }
            this.field1690[var46] = var43 + var48;
            this.field1691[var46] = var44 + var49;
            this.field1729[var46] = var45 + var50;
            var43 = this.field1690[var46];
            var44 = this.field1691[var46];
            var45 = this.field1729[var46];
            if (var16 == 1) {
                this.field1716[var46] = var8.method2383();
            }
        }
        var4.field2052 = var32;
        var5.field2052 = var28;
        var6.field2052 = var26;
        var7.field2052 = var30;
        var8.field2052 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1689[var51] = (short) var4.method2327();
            if (var12 == 1) {
                int var52 = var5.method2383();
                if ((var52 & 0x1) == 1) {
                    this.field1697[var51] = 1;
                    var2 = true;
                } else {
                    this.field1697[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1700[var51] = (byte) (var52 >> 2);
                    this.field1695[var51] = this.field1689[var51];
                    this.field1689[var51] = 127;
                    if (this.field1695[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1700[var51] = -1;
                    this.field1695[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1698[var51] = var6.method2319();
            }
            if (var14 == 1) {
                this.field1735[var51] = var7.method2319();
            }
            if (var15 == 1) {
                this.field1717[var51] = var8.method2383();
            }
        }
        var4.field2052 = var25;
        var5.field2052 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2383();
            if (var58 == 1) {
                var53 = var4.method2412() + var56;
                var54 = var4.method2412() + var53;
                var55 = var4.method2412() + var54;
                var56 = var55;
                this.field1694[var57] = var53;
                this.field1726[var57] = var54;
                this.field1696[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2412() + var56;
                var56 = var55;
                this.field1694[var57] = var53;
                this.field1726[var57] = var54;
                this.field1696[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2412() + var56;
                var56 = var55;
                this.field1694[var57] = var53;
                this.field1726[var57] = var54;
                this.field1696[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2412() + var56;
                var56 = var55;
                this.field1694[var57] = var53;
                this.field1726[var57] = var61;
                this.field1696[var57] = var55;
            }
        }
        var4.field2052 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1730[var62] = 0;
            this.field1706[var62] = (short) var4.method2327();
            this.field1707[var62] = (short) var4.method2327();
            this.field1722[var62] = (short) var4.method2327();
        }
        if (this.field1700 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1700[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1706[var65] & 0xFFFF) == this.field1694[var64] && (this.field1707[var65] & 0xFFFF) == this.field1726[var64] && (this.field1722[var65] & 0xFFFF) == this.field1696[var64]) {
                        this.field1700[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1700 = null;
            }
        }
        if (!var3) {
            this.field1695 = null;
        }
        if (!var2) {
            this.field1697 = null;
        }
    }

    public class101(class101[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1699 = 0;
        this.field1693 = 0;
        this.field1701 = 0;
        this.field1703 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class101 var10 = arg0[var9];
            if (var10 != null) {
                this.field1699 += var10.field1699;
                this.field1693 += var10.field1693;
                this.field1701 += var10.field1701;
                if (var10.field1698 == null) {
                    if (this.field1703 == -1) {
                        this.field1703 = var10.field1703;
                    }
                    if (this.field1703 != var10.field1703) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1697 != null;
                var5 |= var10.field1735 != null;
                var6 |= var10.field1717 != null;
                var7 |= var10.field1695 != null;
                var8 |= var10.field1700 != null;
            }
        }
        this.field1690 = new int[this.field1699];
        this.field1691 = new int[this.field1699];
        this.field1729 = new int[this.field1699];
        this.field1716 = new int[this.field1699];
        this.field1694 = new int[this.field1693];
        this.field1726 = new int[this.field1693];
        this.field1696 = new int[this.field1693];
        if (var3) {
            this.field1697 = new byte[this.field1693];
        }
        if (var4) {
            this.field1698 = new byte[this.field1693];
        }
        if (var5) {
            this.field1735 = new byte[this.field1693];
        }
        if (var6) {
            this.field1717 = new int[this.field1693];
        }
        if (var7) {
            this.field1695 = new short[this.field1693];
        }
        if (var8) {
            this.field1700 = new byte[this.field1693];
        }
        this.field1689 = new short[this.field1693];
        if (this.field1701 > 0) {
            this.field1730 = new byte[this.field1701];
            this.field1706 = new short[this.field1701];
            this.field1707 = new short[this.field1701];
            this.field1722 = new short[this.field1701];
            this.field1709 = new short[this.field1701];
            this.field1710 = new short[this.field1701];
            this.field1727 = new short[this.field1701];
            this.field1712 = new short[this.field1701];
            this.field1715 = new byte[this.field1701];
            this.field1692 = new short[this.field1701];
            this.field1711 = new short[this.field1701];
        }
        this.field1699 = 0;
        this.field1693 = 0;
        this.field1701 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class101 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1693; var13++) {
                    if (var3 && var12.field1697 != null) {
                        this.field1697[this.field1693] = var12.field1697[var13];
                    }
                    if (var4) {
                        if (var12.field1698 == null) {
                            this.field1698[this.field1693] = var12.field1703;
                        } else {
                            this.field1698[this.field1693] = var12.field1698[var13];
                        }
                    }
                    if (var5 && var12.field1735 != null) {
                        this.field1735[this.field1693] = var12.field1735[var13];
                    }
                    if (var6 && var12.field1717 != null) {
                        this.field1717[this.field1693] = var12.field1717[var13];
                    }
                    if (var7) {
                        if (var12.field1695 == null) {
                            this.field1695[this.field1693] = -1;
                        } else {
                            this.field1695[this.field1693] = var12.field1695[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1700 == null || var12.field1700[var13] == -1) {
                            this.field1700[this.field1693] = -1;
                        } else {
                            this.field1700[this.field1693] = (byte) (var12.field1700[var13] + this.field1701);
                        }
                    }
                    this.field1689[this.field1693] = var12.field1689[var13];
                    this.field1694[this.field1693] = this.method1970(var12, var12.field1694[var13]);
                    this.field1726[this.field1693] = this.method1970(var12, var12.field1726[var13]);
                    this.field1696[this.field1693] = this.method1970(var12, var12.field1696[var13]);
                    this.field1693++;
                }
                for (int var14 = 0; var14 < var12.field1701; var14++) {
                    byte var15 = this.field1730[this.field1701] = var12.field1730[var14];
                    if (var15 == 0) {
                        this.field1706[this.field1701] = (short) this.method1970(var12, var12.field1706[var14]);
                        this.field1707[this.field1701] = (short) this.method1970(var12, var12.field1707[var14]);
                        this.field1722[this.field1701] = (short) this.method1970(var12, var12.field1722[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1706[this.field1701] = var12.field1706[var14];
                        this.field1707[this.field1701] = var12.field1707[var14];
                        this.field1722[this.field1701] = var12.field1722[var14];
                        this.field1709[this.field1701] = var12.field1709[var14];
                        this.field1710[this.field1701] = var12.field1710[var14];
                        this.field1727[this.field1701] = var12.field1727[var14];
                        this.field1712[this.field1701] = var12.field1712[var14];
                        this.field1715[this.field1701] = var12.field1715[var14];
                        this.field1692[this.field1701] = var12.field1692[var14];
                    }
                    if (var15 == 2) {
                        this.field1711[this.field1701] = var12.field1711[var14];
                    }
                    this.field1701++;
                }
            }
        }
    }

    @ObfuscatedName("cz.g(Lcz;I)I")
    public final int method1970(class101 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1690[arg1];
        int var5 = arg0.field1691[arg1];
        int var6 = arg0.field1729[arg1];
        for (int var7 = 0; var7 < this.field1699; var7++) {
            if (this.field1690[var7] == var4 && this.field1691[var7] == var5 && this.field1729[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1690[this.field1699] = var4;
            this.field1691[this.field1699] = var5;
            this.field1729[this.field1699] = var6;
            if (arg0.field1716 != null) {
                this.field1716[this.field1699] = arg0.field1716[arg1];
            }
            var3 = this.field1699++;
        }
        return var3;
    }

    public class101(class101 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1699 = arg0.field1699;
        this.field1693 = arg0.field1693;
        this.field1701 = arg0.field1701;
        if (arg1) {
            this.field1690 = arg0.field1690;
            this.field1691 = arg0.field1691;
            this.field1729 = arg0.field1729;
        } else {
            this.field1690 = new int[this.field1699];
            this.field1691 = new int[this.field1699];
            this.field1729 = new int[this.field1699];
            for (int var6 = 0; var6 < this.field1699; var6++) {
                this.field1690[var6] = arg0.field1690[var6];
                this.field1691[var6] = arg0.field1691[var6];
                this.field1729[var6] = arg0.field1729[var6];
            }
        }
        if (arg2) {
            this.field1689 = arg0.field1689;
        } else {
            this.field1689 = new short[this.field1693];
            for (int var7 = 0; var7 < this.field1693; var7++) {
                this.field1689[var7] = arg0.field1689[var7];
            }
        }
        if (arg3 || arg0.field1695 == null) {
            this.field1695 = arg0.field1695;
        } else {
            this.field1695 = new short[this.field1693];
            for (int var8 = 0; var8 < this.field1693; var8++) {
                this.field1695[var8] = arg0.field1695[var8];
            }
        }
        if (arg4) {
            this.field1735 = arg0.field1735;
        } else {
            this.field1735 = new byte[this.field1693];
            if (arg0.field1735 == null) {
                for (int var9 = 0; var9 < this.field1693; var9++) {
                    this.field1735[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1693; var10++) {
                    this.field1735[var10] = arg0.field1735[var10];
                }
            }
        }
        this.field1694 = arg0.field1694;
        this.field1726 = arg0.field1726;
        this.field1696 = arg0.field1696;
        this.field1697 = arg0.field1697;
        this.field1698 = arg0.field1698;
        this.field1700 = arg0.field1700;
        this.field1703 = arg0.field1703;
        this.field1730 = arg0.field1730;
        this.field1706 = arg0.field1706;
        this.field1707 = arg0.field1707;
        this.field1722 = arg0.field1722;
        this.field1709 = arg0.field1709;
        this.field1710 = arg0.field1710;
        this.field1727 = arg0.field1727;
        this.field1712 = arg0.field1712;
        this.field1715 = arg0.field1715;
        this.field1692 = arg0.field1692;
        this.field1711 = arg0.field1711;
        this.field1716 = arg0.field1716;
        this.field1717 = arg0.field1717;
        this.field1718 = arg0.field1718;
        this.field1719 = arg0.field1719;
        this.field1721 = arg0.field1721;
        this.field1720 = arg0.field1720;
        this.field1704 = arg0.field1704;
        this.field1723 = arg0.field1723;
        this.field1724 = arg0.field1724;
    }

    @ObfuscatedName("cz.x()Lcz;")
    public class101 method2008() {
        class101 var1 = new class101();
        if (this.field1697 != null) {
            var1.field1697 = new byte[this.field1693];
            for (int var2 = 0; var2 < this.field1693; var2++) {
                var1.field1697[var2] = this.field1697[var2];
            }
        }
        var1.field1699 = this.field1699;
        var1.field1693 = this.field1693;
        var1.field1701 = this.field1701;
        var1.field1690 = this.field1690;
        var1.field1691 = this.field1691;
        var1.field1729 = this.field1729;
        var1.field1694 = this.field1694;
        var1.field1726 = this.field1726;
        var1.field1696 = this.field1696;
        var1.field1698 = this.field1698;
        var1.field1735 = this.field1735;
        var1.field1700 = this.field1700;
        var1.field1689 = this.field1689;
        var1.field1695 = this.field1695;
        var1.field1703 = this.field1703;
        var1.field1730 = this.field1730;
        var1.field1706 = this.field1706;
        var1.field1707 = this.field1707;
        var1.field1722 = this.field1722;
        var1.field1709 = this.field1709;
        var1.field1710 = this.field1710;
        var1.field1727 = this.field1727;
        var1.field1712 = this.field1712;
        var1.field1715 = this.field1715;
        var1.field1692 = this.field1692;
        var1.field1711 = this.field1711;
        var1.field1716 = this.field1716;
        var1.field1717 = this.field1717;
        var1.field1718 = this.field1718;
        var1.field1719 = this.field1719;
        var1.field1721 = this.field1721;
        var1.field1720 = this.field1720;
        var1.field1723 = this.field1723;
        var1.field1724 = this.field1724;
        return var1;
    }

    @ObfuscatedName("cz.l([[IIIIZI)Lcz;")
    public class101 method1972(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2029();
        int var7 = this.field1725 + arg1;
        int var8 = this.field1728 + arg1;
        int var9 = this.field1714 + arg3;
        int var10 = this.field1705 + arg3;
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
            var15.field1699 = this.field1699;
            var15.field1693 = this.field1693;
            var15.field1701 = this.field1701;
            var15.field1690 = this.field1690;
            var15.field1729 = this.field1729;
            var15.field1694 = this.field1694;
            var15.field1726 = this.field1726;
            var15.field1696 = this.field1696;
            var15.field1697 = this.field1697;
            var15.field1698 = this.field1698;
            var15.field1735 = this.field1735;
            var15.field1700 = this.field1700;
            var15.field1689 = this.field1689;
            var15.field1695 = this.field1695;
            var15.field1703 = this.field1703;
            var15.field1730 = this.field1730;
            var15.field1706 = this.field1706;
            var15.field1707 = this.field1707;
            var15.field1722 = this.field1722;
            var15.field1709 = this.field1709;
            var15.field1710 = this.field1710;
            var15.field1727 = this.field1727;
            var15.field1712 = this.field1712;
            var15.field1715 = this.field1715;
            var15.field1692 = this.field1692;
            var15.field1711 = this.field1711;
            var15.field1716 = this.field1716;
            var15.field1717 = this.field1717;
            var15.field1718 = this.field1718;
            var15.field1719 = this.field1719;
            var15.field1723 = this.field1723;
            var15.field1724 = this.field1724;
            var15.field1691 = new int[var15.field1699];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1699; var16++) {
                int var17 = this.field1690[var16] + arg1;
                int var18 = this.field1729[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1691[var16] = this.field1691[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1699; var26++) {
                int var27 = (-this.field1691[var26] << 16) / this.field1569;
                if (var27 < arg5) {
                    int var28 = this.field1690[var26] + arg1;
                    int var29 = this.field1729[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1691[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1691[var26];
                }
            }
        }
        var15.method1984();
        return var15;
    }

    @ObfuscatedName("cz.a()V")
    public void method1973() {
        int var10002;
        if (this.field1716 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1699; var3++) {
                int var4 = this.field1716[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1718 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1718[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1699) {
                int var7 = this.field1716[var6];
                this.field1718[var7][var1[var7]++] = var6++;
            }
            this.field1716 = null;
        }
        if (this.field1717 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1693; var10++) {
            int var11 = this.field1717[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1719 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1719[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1693) {
            int var14 = this.field1717[var13];
            this.field1719[var14][var8[var14]++] = var13++;
        }
        this.field1717 = null;
    }

    @ObfuscatedName("cz.h()V")
    public void method1974() {
        for (int var1 = 0; var1 < this.field1699; var1++) {
            int var2 = this.field1690[var1];
            this.field1690[var1] = this.field1729[var1];
            this.field1729[var1] = -var2;
        }
        this.method1984();
    }

    @ObfuscatedName("cz.t()V")
    public void method1975() {
        for (int var1 = 0; var1 < this.field1699; var1++) {
            this.field1690[var1] = -this.field1690[var1];
            this.field1729[var1] = -this.field1729[var1];
        }
        this.method1984();
    }

    @ObfuscatedName("cz.m()V")
    public void method1996() {
        for (int var1 = 0; var1 < this.field1699; var1++) {
            int var2 = this.field1729[var1];
            this.field1729[var1] = this.field1690[var1];
            this.field1690[var1] = -var2;
        }
        this.method1984();
    }

    @ObfuscatedName("cz.s(I)V")
    public void method1977(int arg0) {
        int var2 = field1734[arg0];
        int var3 = field1713[arg0];
        for (int var4 = 0; var4 < this.field1699; var4++) {
            int var5 = this.field1729[var4] * var2 + this.field1690[var4] * var3 >> 16;
            this.field1729[var4] = this.field1729[var4] * var3 - this.field1690[var4] * var2 >> 16;
            this.field1690[var4] = var5;
        }
        this.method1984();
    }

    @ObfuscatedName("cz.j(III)V")
    public void method1995(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1699; var4++) {
            this.field1690[var4] += arg0;
            this.field1691[var4] += arg1;
            this.field1729[var4] += arg2;
        }
        this.method1984();
    }

    @ObfuscatedName("cz.b(SS)V")
    public void method1976(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1693; var3++) {
            if (this.field1689[var3] == arg0) {
                this.field1689[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cz.n(SS)V")
    public void method1980(short arg0, short arg1) {
        if (this.field1695 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1693; var3++) {
            if (this.field1695[var3] == arg0) {
                this.field1695[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cz.z()V")
    public void method1981() {
        for (int var1 = 0; var1 < this.field1699; var1++) {
            this.field1729[var1] = -this.field1729[var1];
        }
        for (int var2 = 0; var2 < this.field1693; var2++) {
            int var3 = this.field1694[var2];
            this.field1694[var2] = this.field1696[var2];
            this.field1696[var2] = var3;
        }
        this.method1984();
    }

    @ObfuscatedName("cz.d(III)V")
    public void method1982(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1699; var4++) {
            this.field1690[var4] = this.field1690[var4] * arg0 / 128;
            this.field1691[var4] = this.field1691[var4] * arg1 / 128;
            this.field1729[var4] = this.field1729[var4] * arg2 / 128;
        }
        this.method1984();
    }

    @ObfuscatedName("cz.f()V")
    public void method1983() {
        if (this.field1721 != null) {
            return;
        }
        this.field1721 = new class91[this.field1699];
        for (int var1 = 0; var1 < this.field1699; var1++) {
            this.field1721[var1] = new class91();
        }
        for (int var2 = 0; var2 < this.field1693; var2++) {
            int var3 = this.field1694[var2];
            int var4 = this.field1726[var2];
            int var5 = this.field1696[var2];
            int var6 = this.field1690[var4] - this.field1690[var3];
            int var7 = this.field1691[var4] - this.field1691[var3];
            int var8 = this.field1729[var4] - this.field1729[var3];
            int var9 = this.field1690[var5] - this.field1690[var3];
            int var10 = this.field1691[var5] - this.field1691[var3];
            int var11 = this.field1729[var5] - this.field1729[var3];
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
            if (this.field1697 == null) {
                var19 = 0;
            } else {
                var19 = this.field1697[var2];
            }
            if (var19 == 0) {
                class91 var20 = this.field1721[var3];
                var20.field1536 += var16;
                var20.field1538 += var17;
                var20.field1533 += var18;
                var20.field1535++;
                class91 var21 = this.field1721[var4];
                var21.field1536 += var16;
                var21.field1538 += var17;
                var21.field1533 += var18;
                var21.field1535++;
                class91 var22 = this.field1721[var5];
                var22.field1536 += var16;
                var22.field1538 += var17;
                var22.field1533 += var18;
                var22.field1535++;
            } else if (var19 == 1) {
                if (this.field1720 == null) {
                    this.field1720 = new class92[this.field1693];
                }
                class92 var23 = this.field1720[var2] = new class92();
                var23.field1544 = var16;
                var23.field1540 = var17;
                var23.field1541 = var18;
            }
        }
    }

    @ObfuscatedName("cz.o()V")
    public void method1984() {
        this.field1721 = null;
        this.field1704 = null;
        this.field1720 = null;
        this.field1708 = false;
    }

    @ObfuscatedName("cz.r()V")
    public void method2029() {
        if (this.field1708) {
            return;
        }
        this.field1569 = 0;
        this.field1702 = 0;
        this.field1725 = 999999;
        this.field1728 = -999999;
        this.field1705 = -99999;
        this.field1714 = 99999;
        for (int var1 = 0; var1 < this.field1699; var1++) {
            int var2 = this.field1690[var1];
            int var3 = this.field1691[var1];
            int var4 = this.field1729[var1];
            if (var2 < this.field1725) {
                this.field1725 = var2;
            }
            if (var2 > this.field1728) {
                this.field1728 = var2;
            }
            if (var4 < this.field1714) {
                this.field1714 = var4;
            }
            if (var4 > this.field1705) {
                this.field1705 = var4;
            }
            if (-var3 > this.field1569) {
                this.field1569 = -var3;
            }
            if (var3 > this.field1702) {
                this.field1702 = var3;
            }
        }
        this.field1708 = true;
    }

    @ObfuscatedName("cz.i(Lcz;Lcz;IIIZ)V")
    public static void method1966(class101 arg0, class101 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2029();
        arg0.method1983();
        arg1.method2029();
        arg1.method1983();
        field1733++;
        int var6 = 0;
        int[] var7 = arg1.field1690;
        int var8 = arg1.field1699;
        for (int var9 = 0; var9 < arg0.field1699; var9++) {
            class91 var10 = arg0.field1721[var9];
            if (var10.field1535 != 0) {
                int var11 = arg0.field1691[var9] - arg3;
                if (var11 <= arg1.field1702) {
                    int var12 = arg0.field1690[var9] - arg2;
                    if (var12 >= arg1.field1725 && var12 <= arg1.field1728) {
                        int var13 = arg0.field1729[var9] - arg4;
                        if (var13 >= arg1.field1714 && var13 <= arg1.field1705) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class91 var15 = arg1.field1721[var14];
                                if (var7[var14] == var12 && arg1.field1729[var14] == var13 && arg1.field1691[var14] == var11 && var15.field1535 != 0) {
                                    if (arg0.field1704 == null) {
                                        arg0.field1704 = new class91[arg0.field1699];
                                    }
                                    if (arg1.field1704 == null) {
                                        arg1.field1704 = new class91[var8];
                                    }
                                    class91 var16 = arg0.field1704[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1704[var9] = new class91(var10);
                                    }
                                    class91 var17 = arg1.field1704[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1704[var14] = new class91(var15);
                                    }
                                    var16.field1536 += var15.field1536;
                                    var16.field1538 += var15.field1538;
                                    var16.field1533 += var15.field1533;
                                    var16.field1535 += var15.field1535;
                                    var17.field1536 += var10.field1536;
                                    var17.field1538 += var10.field1538;
                                    var17.field1533 += var10.field1533;
                                    var17.field1535 += var10.field1535;
                                    var6++;
                                    field1731[var9] = field1733;
                                    field1732[var14] = field1733;
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
        for (int var18 = 0; var18 < arg0.field1693; var18++) {
            if (field1731[arg0.field1694[var18]] == field1733 && field1731[arg0.field1726[var18]] == field1733 && field1731[arg0.field1696[var18]] == field1733) {
                if (arg0.field1697 == null) {
                    arg0.field1697 = new byte[arg0.field1693];
                }
                arg0.field1697[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1693; var19++) {
            if (field1732[arg1.field1694[var19]] == field1733 && field1732[arg1.field1726[var19]] == field1733 && field1732[arg1.field1696[var19]] == field1733) {
                if (arg1.field1697 == null) {
                    arg1.field1697 = new byte[arg1.field1693];
                }
                arg1.field1697[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cz.ap(IIIII)Ldl;")
    public final class112 method1971(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1983();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class112 var8 = new class112();
        var8.field1881 = new int[this.field1693];
        var8.field1927 = new int[this.field1693];
        var8.field1882 = new int[this.field1693];
        if (this.field1701 > 0 && this.field1700 != null) {
            int[] var9 = new int[this.field1701];
            for (int var10 = 0; var10 < this.field1693; var10++) {
                if (this.field1700[var10] != -1) {
                    var9[this.field1700[var10] & 0xFF]++;
                }
            }
            var8.field1891 = 0;
            for (int var11 = 0; var11 < this.field1701; var11++) {
                if (var9[var11] > 0 && this.field1730[var11] == 0) {
                    var8.field1891++;
                }
            }
            var8.field1889 = new int[var8.field1891];
            var8.field1890 = new int[var8.field1891];
            var8.field1925 = new int[var8.field1891];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1701; var13++) {
                if (var9[var13] > 0 && this.field1730[var13] == 0) {
                    var8.field1889[var12] = this.field1706[var13] & 0xFFFF;
                    var8.field1890[var12] = this.field1707[var13] & 0xFFFF;
                    var8.field1925[var12] = this.field1722[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1885 = new byte[this.field1693];
            for (int var14 = 0; var14 < this.field1693; var14++) {
                if (this.field1700[var14] == -1) {
                    var8.field1885[var14] = -1;
                } else {
                    var8.field1885[var14] = (byte) var9[this.field1700[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1693; var15++) {
            byte var16;
            if (this.field1697 == null) {
                var16 = 0;
            } else {
                var16 = this.field1697[var15];
            }
            byte var17;
            if (this.field1735 == null) {
                var17 = 0;
            } else {
                var17 = this.field1735[var15];
            }
            short var18;
            if (this.field1695 == null) {
                var18 = -1;
            } else {
                var18 = this.field1695[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1689[var15] & 0xFFFF;
                    class91 var20;
                    if (this.field1704 == null || this.field1704[this.field1694[var15]] == null) {
                        var20 = this.field1721[this.field1694[var15]];
                    } else {
                        var20 = this.field1704[this.field1694[var15]];
                    }
                    int var21 = (var20.field1533 * arg4 + var20.field1538 * arg3 + var20.field1536 * arg2) / (var20.field1535 * var7) + arg0;
                    var8.field1881[var15] = method1987(var19, var21);
                    class91 var22;
                    if (this.field1704 == null || this.field1704[this.field1726[var15]] == null) {
                        var22 = this.field1721[this.field1726[var15]];
                    } else {
                        var22 = this.field1704[this.field1726[var15]];
                    }
                    int var23 = (var22.field1533 * arg4 + var22.field1538 * arg3 + var22.field1536 * arg2) / (var22.field1535 * var7) + arg0;
                    var8.field1927[var15] = method1987(var19, var23);
                    class91 var24;
                    if (this.field1704 == null || this.field1704[this.field1696[var15]] == null) {
                        var24 = this.field1721[this.field1696[var15]];
                    } else {
                        var24 = this.field1704[this.field1696[var15]];
                    }
                    int var25 = (var24.field1533 * arg4 + var24.field1538 * arg3 + var24.field1536 * arg2) / (var24.field1535 * var7) + arg0;
                    var8.field1882[var15] = method1987(var19, var25);
                } else if (var16 == 1) {
                    class92 var26 = this.field1720[var15];
                    int var27 = (var26.field1541 * arg4 + var26.field1544 * arg2 + var26.field1540 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1881[var15] = method1987(this.field1689[var15] & 0xFFFF, var27);
                    var8.field1882[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1881[var15] = 128;
                    var8.field1882[var15] = -1;
                } else {
                    var8.field1882[var15] = -2;
                }
            } else if (var16 == 0) {
                class91 var28;
                if (this.field1704 == null || this.field1704[this.field1694[var15]] == null) {
                    var28 = this.field1721[this.field1694[var15]];
                } else {
                    var28 = this.field1704[this.field1694[var15]];
                }
                int var29 = (var28.field1533 * arg4 + var28.field1538 * arg3 + var28.field1536 * arg2) / (var28.field1535 * var7) + arg0;
                var8.field1881[var15] = method1988(var29);
                class91 var30;
                if (this.field1704 == null || this.field1704[this.field1726[var15]] == null) {
                    var30 = this.field1721[this.field1726[var15]];
                } else {
                    var30 = this.field1704[this.field1726[var15]];
                }
                int var31 = (var30.field1533 * arg4 + var30.field1538 * arg3 + var30.field1536 * arg2) / (var30.field1535 * var7) + arg0;
                var8.field1927[var15] = method1988(var31);
                class91 var32;
                if (this.field1704 == null || this.field1704[this.field1696[var15]] == null) {
                    var32 = this.field1721[this.field1696[var15]];
                } else {
                    var32 = this.field1704[this.field1696[var15]];
                }
                int var33 = (var32.field1533 * arg4 + var32.field1538 * arg3 + var32.field1536 * arg2) / (var32.field1535 * var7) + arg0;
                var8.field1882[var15] = method1988(var33);
            } else if (var16 == 1) {
                class92 var34 = this.field1720[var15];
                int var35 = (var34.field1541 * arg4 + var34.field1544 * arg2 + var34.field1540 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1881[var15] = method1988(var35);
                var8.field1882[var15] = -1;
            } else {
                var8.field1882[var15] = -2;
            }
        }
        this.method1973();
        var8.field1872 = this.field1699;
        var8.field1873 = this.field1690;
        var8.field1893 = this.field1691;
        var8.field1875 = this.field1729;
        var8.field1876 = this.field1693;
        var8.field1906 = this.field1694;
        var8.field1878 = this.field1726;
        var8.field1879 = this.field1696;
        var8.field1883 = this.field1698;
        var8.field1884 = this.field1735;
        var8.field1887 = this.field1703;
        var8.field1892 = this.field1718;
        var8.field1895 = this.field1719;
        var8.field1874 = this.field1695;
        return var8;
    }

    @ObfuscatedName("cz.as(II)I")
    public static final int method1987(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cz.ak(I)I")
    public static final int method1988(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
