package deob;

@ObfuscatedName("ch")
public class class101 extends class94 {

    @ObfuscatedName("ch.j")
    public int field1727 = 0;

    @ObfuscatedName("ch.f")
    public int[] field1689;

    @ObfuscatedName("ch.o")
    public int[] field1704;

    @ObfuscatedName("ch.h")
    public int[] field1731;

    @ObfuscatedName("ch.u")
    public int field1692 = 0;

    @ObfuscatedName("ch.a")
    public int[] field1693;

    @ObfuscatedName("ch.q")
    public int[] field1694;

    @ObfuscatedName("ch.t")
    public int[] field1695;

    @ObfuscatedName("ch.n")
    public byte[] field1696;

    @ObfuscatedName("ch.i")
    public byte[] field1697;

    @ObfuscatedName("ch.c")
    public byte[] field1698;

    @ObfuscatedName("ch.b")
    public byte[] field1699;

    @ObfuscatedName("ch.m")
    public short[] field1700;

    @ObfuscatedName("ch.g")
    public short[] field1701;

    @ObfuscatedName("ch.x")
    public byte field1713 = 0;

    @ObfuscatedName("ch.r")
    public int field1721;

    @ObfuscatedName("ch.s")
    public byte[] field1724;

    @ObfuscatedName("ch.l")
    public short[] field1705;

    @ObfuscatedName("ch.k")
    public short[] field1706;

    @ObfuscatedName("ch.w")
    public short[] field1728;

    @ObfuscatedName("ch.z")
    public short[] field1708;

    @ObfuscatedName("ch.p")
    public short[] field1709;

    @ObfuscatedName("ch.v")
    public short[] field1691;

    @ObfuscatedName("ch.d")
    public short[] field1711;

    @ObfuscatedName("ch.e")
    public short[] field1712;

    @ObfuscatedName("ch.y")
    public short[] field1730;

    @ObfuscatedName("ch.aw")
    public byte[] field1702;

    @ObfuscatedName("ch.ai")
    public int[] field1734;

    @ObfuscatedName("ch.ah")
    public int[] field1716;

    @ObfuscatedName("ch.ad")
    public int[][] field1717;

    @ObfuscatedName("ch.ak")
    public int[][] field1718;

    @ObfuscatedName("ch.ap")
    public class92[] field1719;

    @ObfuscatedName("ch.al")
    public class91[] field1720;

    @ObfuscatedName("ch.am")
    public class91[] field1733;

    @ObfuscatedName("ch.ab")
    public short field1722;

    @ObfuscatedName("ch.ax")
    public short field1723;

    @ObfuscatedName("ch.az")
    public boolean field1707 = false;

    @ObfuscatedName("ch.at")
    public int field1725;

    @ObfuscatedName("ch.as")
    public int field1726;

    @ObfuscatedName("ch.aj")
    public int field1703;

    @ObfuscatedName("ch.aa")
    public int field1714;

    @ObfuscatedName("ch.au")
    public int field1729;

    @ObfuscatedName("ch.ae")
    public static int[] field1710 = new int[10000];

    @ObfuscatedName("ch.ao")
    public static int[] field1715 = new int[10000];

    @ObfuscatedName("ch.af")
    public static int field1732 = 0;

    @ObfuscatedName("ch.ar")
    public static int[] field1690 = class104.field1776;

    @ObfuscatedName("ch.ay")
    public static int[] field1688 = class104.field1791;

    public class101() {
    }

    @ObfuscatedName("ch.j(Lew;II)Lch;")
    public static class101 method2064(class153 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3027(arg1, arg2);
        return var3 == null ? null : new class101(var3);
    }

    public class101(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2089(arg0);
        } else {
            this.method2116(arg0);
        }
    }

    @ObfuscatedName("ch.o([B)V")
    public void method2089(byte[] arg0) {
        class127 var2 = new class127(arg0);
        class127 var3 = new class127(arg0);
        class127 var4 = new class127(arg0);
        class127 var5 = new class127(arg0);
        class127 var6 = new class127(arg0);
        class127 var7 = new class127(arg0);
        class127 var8 = new class127(arg0);
        var2.field2035 = arg0.length - 23;
        int var9 = var2.method2582();
        int var10 = var2.method2582();
        int var11 = var2.method2464();
        int var12 = var2.method2464();
        int var13 = var2.method2464();
        int var14 = var2.method2464();
        int var15 = var2.method2464();
        int var16 = var2.method2464();
        int var17 = var2.method2464();
        int var18 = var2.method2582();
        int var19 = var2.method2582();
        int var20 = var2.method2582();
        int var21 = var2.method2582();
        int var22 = var2.method2582();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1724 = new byte[var11];
            var2.field2035 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1724[var26] = var2.method2449();
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
        this.field1727 = var9;
        this.field1692 = var10;
        this.field1721 = var11;
        this.field1689 = new int[var9];
        this.field1704 = new int[var9];
        this.field1731 = new int[var9];
        this.field1693 = new int[var10];
        this.field1694 = new int[var10];
        this.field1695 = new int[var10];
        if (var17 == 1) {
            this.field1734 = new int[var9];
        }
        if (var12 == 1) {
            this.field1696 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1697 = new byte[var10];
        } else {
            this.field1713 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1698 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1716 = new int[var10];
        }
        if (var16 == 1) {
            this.field1701 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1699 = new byte[var10];
        }
        this.field1700 = new short[var10];
        if (var11 > 0) {
            this.field1705 = new short[var11];
            this.field1706 = new short[var11];
            this.field1728 = new short[var11];
            if (var24 > 0) {
                this.field1708 = new short[var24];
                this.field1709 = new short[var24];
                this.field1691 = new short[var24];
                this.field1711 = new short[var24];
                this.field1702 = new byte[var24];
                this.field1712 = new short[var24];
            }
            if (var25 > 0) {
                this.field1730 = new short[var25];
            }
        }
        var2.field2035 = var11;
        var3.field2035 = var44;
        var4.field2035 = var46;
        var5.field2035 = var48;
        var6.field2035 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2464();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2476();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2476();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2476();
            }
            this.field1689[var67] = var64 + var69;
            this.field1704[var67] = var65 + var70;
            this.field1731[var67] = var66 + var71;
            var64 = this.field1689[var67];
            var65 = this.field1704[var67];
            var66 = this.field1731[var67];
            if (var17 == 1) {
                this.field1734[var67] = var6.method2464();
            }
        }
        var2.field2035 = var42;
        var3.field2035 = var31;
        var4.field2035 = var34;
        var5.field2035 = var37;
        var6.field2035 = var35;
        var7.field2035 = var40;
        var8.field2035 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1700[var72] = (short) var2.method2582();
            if (var12 == 1) {
                this.field1696[var72] = var3.method2449();
            }
            if (var13 == 255) {
                this.field1697[var72] = var4.method2449();
            }
            if (var14 == 1) {
                this.field1698[var72] = var5.method2449();
            }
            if (var15 == 1) {
                this.field1716[var72] = var6.method2464();
            }
            if (var16 == 1) {
                this.field1701[var72] = (short) (var7.method2582() - 1);
            }
            if (this.field1699 != null && this.field1701[var72] != -1) {
                this.field1699[var72] = (byte) (var8.method2464() - 1);
            }
        }
        var2.field2035 = var33;
        var3.field2035 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2464();
            if (var78 == 1) {
                var73 = var2.method2476() + var76;
                var74 = var2.method2476() + var73;
                var75 = var2.method2476() + var74;
                var76 = var75;
                this.field1693[var77] = var73;
                this.field1694[var77] = var74;
                this.field1695[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2476() + var76;
                var76 = var75;
                this.field1693[var77] = var73;
                this.field1694[var77] = var74;
                this.field1695[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2476() + var76;
                var76 = var75;
                this.field1693[var77] = var73;
                this.field1694[var77] = var74;
                this.field1695[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2476() + var76;
                var76 = var75;
                this.field1693[var77] = var73;
                this.field1694[var77] = var81;
                this.field1695[var77] = var75;
            }
        }
        var2.field2035 = var50;
        var3.field2035 = var52;
        var4.field2035 = var54;
        var5.field2035 = var56;
        var6.field2035 = var58;
        var7.field2035 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1724[var82] & 0xFF;
            if (var83 == 0) {
                this.field1705[var82] = (short) var2.method2582();
                this.field1706[var82] = (short) var2.method2582();
                this.field1728[var82] = (short) var2.method2582();
            }
            if (var83 == 1) {
                this.field1705[var82] = (short) var3.method2582();
                this.field1706[var82] = (short) var3.method2582();
                this.field1728[var82] = (short) var3.method2582();
                this.field1708[var82] = (short) var4.method2582();
                this.field1709[var82] = (short) var4.method2582();
                this.field1691[var82] = (short) var4.method2582();
                this.field1711[var82] = (short) var5.method2582();
                this.field1702[var82] = var6.method2449();
                this.field1712[var82] = (short) var7.method2582();
            }
            if (var83 == 2) {
                this.field1705[var82] = (short) var3.method2582();
                this.field1706[var82] = (short) var3.method2582();
                this.field1728[var82] = (short) var3.method2582();
                this.field1708[var82] = (short) var4.method2582();
                this.field1709[var82] = (short) var4.method2582();
                this.field1691[var82] = (short) var4.method2582();
                this.field1711[var82] = (short) var5.method2582();
                this.field1702[var82] = var6.method2449();
                this.field1712[var82] = (short) var7.method2582();
                this.field1730[var82] = (short) var7.method2582();
            }
            if (var83 == 3) {
                this.field1705[var82] = (short) var3.method2582();
                this.field1706[var82] = (short) var3.method2582();
                this.field1728[var82] = (short) var3.method2582();
                this.field1708[var82] = (short) var4.method2582();
                this.field1709[var82] = (short) var4.method2582();
                this.field1691[var82] = (short) var4.method2582();
                this.field1711[var82] = (short) var5.method2582();
                this.field1702[var82] = var6.method2449();
                this.field1712[var82] = (short) var7.method2582();
            }
        }
        var2.field2035 = var62;
        int var84 = var2.method2464();
        if (var84 == 0) {
            return;
        }
        new class103();
        var2.method2582();
        var2.method2582();
        var2.method2582();
        var2.method2508();
    }

    @ObfuscatedName("ch.t([B)V")
    public void method2116(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class127 var4 = new class127(arg0);
        class127 var5 = new class127(arg0);
        class127 var6 = new class127(arg0);
        class127 var7 = new class127(arg0);
        class127 var8 = new class127(arg0);
        var4.field2035 = arg0.length - 18;
        int var9 = var4.method2582();
        int var10 = var4.method2582();
        int var11 = var4.method2464();
        int var12 = var4.method2464();
        int var13 = var4.method2464();
        int var14 = var4.method2464();
        int var15 = var4.method2464();
        int var16 = var4.method2464();
        int var17 = var4.method2582();
        int var18 = var4.method2582();
        int var19 = var4.method2582();
        int var20 = var4.method2582();
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
        this.field1727 = var9;
        this.field1692 = var10;
        this.field1721 = var11;
        this.field1689 = new int[var9];
        this.field1704 = new int[var9];
        this.field1731 = new int[var9];
        this.field1693 = new int[var10];
        this.field1694 = new int[var10];
        this.field1695 = new int[var10];
        if (var11 > 0) {
            this.field1724 = new byte[var11];
            this.field1705 = new short[var11];
            this.field1706 = new short[var11];
            this.field1728 = new short[var11];
        }
        if (var16 == 1) {
            this.field1734 = new int[var9];
        }
        if (var12 == 1) {
            this.field1696 = new byte[var10];
            this.field1699 = new byte[var10];
            this.field1701 = new short[var10];
        }
        if (var13 == 255) {
            this.field1697 = new byte[var10];
        } else {
            this.field1713 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1698 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1716 = new int[var10];
        }
        this.field1700 = new short[var10];
        var4.field2035 = var21;
        var5.field2035 = var36;
        var6.field2035 = var38;
        var7.field2035 = var40;
        var8.field2035 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2464();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2476();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2476();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2476();
            }
            this.field1689[var46] = var43 + var48;
            this.field1704[var46] = var44 + var49;
            this.field1731[var46] = var45 + var50;
            var43 = this.field1689[var46];
            var44 = this.field1704[var46];
            var45 = this.field1731[var46];
            if (var16 == 1) {
                this.field1734[var46] = var8.method2464();
            }
        }
        var4.field2035 = var32;
        var5.field2035 = var28;
        var6.field2035 = var26;
        var7.field2035 = var30;
        var8.field2035 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1700[var51] = (short) var4.method2582();
            if (var12 == 1) {
                int var52 = var5.method2464();
                if ((var52 & 0x1) == 1) {
                    this.field1696[var51] = 1;
                    var2 = true;
                } else {
                    this.field1696[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1699[var51] = (byte) (var52 >> 2);
                    this.field1701[var51] = this.field1700[var51];
                    this.field1700[var51] = 127;
                    if (this.field1701[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1699[var51] = -1;
                    this.field1701[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1697[var51] = var6.method2449();
            }
            if (var14 == 1) {
                this.field1698[var51] = var7.method2449();
            }
            if (var15 == 1) {
                this.field1716[var51] = var8.method2464();
            }
        }
        var4.field2035 = var25;
        var5.field2035 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2464();
            if (var58 == 1) {
                var53 = var4.method2476() + var56;
                var54 = var4.method2476() + var53;
                var55 = var4.method2476() + var54;
                var56 = var55;
                this.field1693[var57] = var53;
                this.field1694[var57] = var54;
                this.field1695[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2476() + var56;
                var56 = var55;
                this.field1693[var57] = var53;
                this.field1694[var57] = var54;
                this.field1695[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2476() + var56;
                var56 = var55;
                this.field1693[var57] = var53;
                this.field1694[var57] = var54;
                this.field1695[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2476() + var56;
                var56 = var55;
                this.field1693[var57] = var53;
                this.field1694[var57] = var61;
                this.field1695[var57] = var55;
            }
        }
        var4.field2035 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1724[var62] = 0;
            this.field1705[var62] = (short) var4.method2582();
            this.field1706[var62] = (short) var4.method2582();
            this.field1728[var62] = (short) var4.method2582();
        }
        if (this.field1699 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1699[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1705[var65] & 0xFFFF) == this.field1693[var64] && (this.field1706[var65] & 0xFFFF) == this.field1694[var64] && (this.field1728[var65] & 0xFFFF) == this.field1695[var64]) {
                        this.field1699[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1699 = null;
            }
        }
        if (!var3) {
            this.field1701 = null;
        }
        if (!var2) {
            this.field1696 = null;
        }
    }

    public class101(class101[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1727 = 0;
        this.field1692 = 0;
        this.field1721 = 0;
        this.field1713 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class101 var10 = arg0[var9];
            if (var10 != null) {
                this.field1727 += var10.field1727;
                this.field1692 += var10.field1692;
                this.field1721 += var10.field1721;
                if (var10.field1697 == null) {
                    if (this.field1713 == -1) {
                        this.field1713 = var10.field1713;
                    }
                    if (this.field1713 != var10.field1713) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1696 != null;
                var5 |= var10.field1698 != null;
                var6 |= var10.field1716 != null;
                var7 |= var10.field1701 != null;
                var8 |= var10.field1699 != null;
            }
        }
        this.field1689 = new int[this.field1727];
        this.field1704 = new int[this.field1727];
        this.field1731 = new int[this.field1727];
        this.field1734 = new int[this.field1727];
        this.field1693 = new int[this.field1692];
        this.field1694 = new int[this.field1692];
        this.field1695 = new int[this.field1692];
        if (var3) {
            this.field1696 = new byte[this.field1692];
        }
        if (var4) {
            this.field1697 = new byte[this.field1692];
        }
        if (var5) {
            this.field1698 = new byte[this.field1692];
        }
        if (var6) {
            this.field1716 = new int[this.field1692];
        }
        if (var7) {
            this.field1701 = new short[this.field1692];
        }
        if (var8) {
            this.field1699 = new byte[this.field1692];
        }
        this.field1700 = new short[this.field1692];
        if (this.field1721 > 0) {
            this.field1724 = new byte[this.field1721];
            this.field1705 = new short[this.field1721];
            this.field1706 = new short[this.field1721];
            this.field1728 = new short[this.field1721];
            this.field1708 = new short[this.field1721];
            this.field1709 = new short[this.field1721];
            this.field1691 = new short[this.field1721];
            this.field1711 = new short[this.field1721];
            this.field1702 = new byte[this.field1721];
            this.field1712 = new short[this.field1721];
            this.field1730 = new short[this.field1721];
        }
        this.field1727 = 0;
        this.field1692 = 0;
        this.field1721 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class101 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1692; var13++) {
                    if (var3 && var12.field1696 != null) {
                        this.field1696[this.field1692] = var12.field1696[var13];
                    }
                    if (var4) {
                        if (var12.field1697 == null) {
                            this.field1697[this.field1692] = var12.field1713;
                        } else {
                            this.field1697[this.field1692] = var12.field1697[var13];
                        }
                    }
                    if (var5 && var12.field1698 != null) {
                        this.field1698[this.field1692] = var12.field1698[var13];
                    }
                    if (var6 && var12.field1716 != null) {
                        this.field1716[this.field1692] = var12.field1716[var13];
                    }
                    if (var7) {
                        if (var12.field1701 == null) {
                            this.field1701[this.field1692] = -1;
                        } else {
                            this.field1701[this.field1692] = var12.field1701[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1699 == null || var12.field1699[var13] == -1) {
                            this.field1699[this.field1692] = -1;
                        } else {
                            this.field1699[this.field1692] = (byte) (var12.field1699[var13] + this.field1721);
                        }
                    }
                    this.field1700[this.field1692] = var12.field1700[var13];
                    this.field1693[this.field1692] = this.method2130(var12, var12.field1693[var13]);
                    this.field1694[this.field1692] = this.method2130(var12, var12.field1694[var13]);
                    this.field1695[this.field1692] = this.method2130(var12, var12.field1695[var13]);
                    this.field1692++;
                }
                for (int var14 = 0; var14 < var12.field1721; var14++) {
                    byte var15 = this.field1724[this.field1721] = var12.field1724[var14];
                    if (var15 == 0) {
                        this.field1705[this.field1721] = (short) this.method2130(var12, var12.field1705[var14]);
                        this.field1706[this.field1721] = (short) this.method2130(var12, var12.field1706[var14]);
                        this.field1728[this.field1721] = (short) this.method2130(var12, var12.field1728[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1705[this.field1721] = var12.field1705[var14];
                        this.field1706[this.field1721] = var12.field1706[var14];
                        this.field1728[this.field1721] = var12.field1728[var14];
                        this.field1708[this.field1721] = var12.field1708[var14];
                        this.field1709[this.field1721] = var12.field1709[var14];
                        this.field1691[this.field1721] = var12.field1691[var14];
                        this.field1711[this.field1721] = var12.field1711[var14];
                        this.field1702[this.field1721] = var12.field1702[var14];
                        this.field1712[this.field1721] = var12.field1712[var14];
                    }
                    if (var15 == 2) {
                        this.field1730[this.field1721] = var12.field1730[var14];
                    }
                    this.field1721++;
                }
            }
        }
    }

    @ObfuscatedName("ch.n(Lch;I)I")
    public final int method2130(class101 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1689[arg1];
        int var5 = arg0.field1704[arg1];
        int var6 = arg0.field1731[arg1];
        for (int var7 = 0; var7 < this.field1727; var7++) {
            if (this.field1689[var7] == var4 && this.field1704[var7] == var5 && this.field1731[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1689[this.field1727] = var4;
            this.field1704[this.field1727] = var5;
            this.field1731[this.field1727] = var6;
            if (arg0.field1734 != null) {
                this.field1734[this.field1727] = arg0.field1734[arg1];
            }
            var3 = this.field1727++;
        }
        return var3;
    }

    public class101(class101 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1727 = arg0.field1727;
        this.field1692 = arg0.field1692;
        this.field1721 = arg0.field1721;
        if (arg1) {
            this.field1689 = arg0.field1689;
            this.field1704 = arg0.field1704;
            this.field1731 = arg0.field1731;
        } else {
            this.field1689 = new int[this.field1727];
            this.field1704 = new int[this.field1727];
            this.field1731 = new int[this.field1727];
            for (int var6 = 0; var6 < this.field1727; var6++) {
                this.field1689[var6] = arg0.field1689[var6];
                this.field1704[var6] = arg0.field1704[var6];
                this.field1731[var6] = arg0.field1731[var6];
            }
        }
        if (arg2) {
            this.field1700 = arg0.field1700;
        } else {
            this.field1700 = new short[this.field1692];
            for (int var7 = 0; var7 < this.field1692; var7++) {
                this.field1700[var7] = arg0.field1700[var7];
            }
        }
        if (arg3 || arg0.field1701 == null) {
            this.field1701 = arg0.field1701;
        } else {
            this.field1701 = new short[this.field1692];
            for (int var8 = 0; var8 < this.field1692; var8++) {
                this.field1701[var8] = arg0.field1701[var8];
            }
        }
        if (arg4) {
            this.field1698 = arg0.field1698;
        } else {
            this.field1698 = new byte[this.field1692];
            if (arg0.field1698 == null) {
                for (int var9 = 0; var9 < this.field1692; var9++) {
                    this.field1698[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1692; var10++) {
                    this.field1698[var10] = arg0.field1698[var10];
                }
            }
        }
        this.field1693 = arg0.field1693;
        this.field1694 = arg0.field1694;
        this.field1695 = arg0.field1695;
        this.field1696 = arg0.field1696;
        this.field1697 = arg0.field1697;
        this.field1699 = arg0.field1699;
        this.field1713 = arg0.field1713;
        this.field1724 = arg0.field1724;
        this.field1705 = arg0.field1705;
        this.field1706 = arg0.field1706;
        this.field1728 = arg0.field1728;
        this.field1708 = arg0.field1708;
        this.field1709 = arg0.field1709;
        this.field1691 = arg0.field1691;
        this.field1711 = arg0.field1711;
        this.field1702 = arg0.field1702;
        this.field1712 = arg0.field1712;
        this.field1730 = arg0.field1730;
        this.field1734 = arg0.field1734;
        this.field1716 = arg0.field1716;
        this.field1717 = arg0.field1717;
        this.field1718 = arg0.field1718;
        this.field1720 = arg0.field1720;
        this.field1719 = arg0.field1719;
        this.field1733 = arg0.field1733;
        this.field1722 = arg0.field1722;
        this.field1723 = arg0.field1723;
    }

    @ObfuscatedName("ch.i()Lch;")
    public class101 method2120() {
        class101 var1 = new class101();
        if (this.field1696 != null) {
            var1.field1696 = new byte[this.field1692];
            for (int var2 = 0; var2 < this.field1692; var2++) {
                var1.field1696[var2] = this.field1696[var2];
            }
        }
        var1.field1727 = this.field1727;
        var1.field1692 = this.field1692;
        var1.field1721 = this.field1721;
        var1.field1689 = this.field1689;
        var1.field1704 = this.field1704;
        var1.field1731 = this.field1731;
        var1.field1693 = this.field1693;
        var1.field1694 = this.field1694;
        var1.field1695 = this.field1695;
        var1.field1697 = this.field1697;
        var1.field1698 = this.field1698;
        var1.field1699 = this.field1699;
        var1.field1700 = this.field1700;
        var1.field1701 = this.field1701;
        var1.field1713 = this.field1713;
        var1.field1724 = this.field1724;
        var1.field1705 = this.field1705;
        var1.field1706 = this.field1706;
        var1.field1728 = this.field1728;
        var1.field1708 = this.field1708;
        var1.field1709 = this.field1709;
        var1.field1691 = this.field1691;
        var1.field1711 = this.field1711;
        var1.field1702 = this.field1702;
        var1.field1712 = this.field1712;
        var1.field1730 = this.field1730;
        var1.field1734 = this.field1734;
        var1.field1716 = this.field1716;
        var1.field1717 = this.field1717;
        var1.field1718 = this.field1718;
        var1.field1720 = this.field1720;
        var1.field1719 = this.field1719;
        var1.field1722 = this.field1722;
        var1.field1723 = this.field1723;
        return var1;
    }

    @ObfuscatedName("ch.c([[IIIIZI)Lch;")
    public class101 method2077(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2081();
        int var7 = this.field1726 + arg1;
        int var8 = this.field1703 + arg1;
        int var9 = this.field1729 + arg3;
        int var10 = this.field1714 + arg3;
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
            var15.field1727 = this.field1727;
            var15.field1692 = this.field1692;
            var15.field1721 = this.field1721;
            var15.field1689 = this.field1689;
            var15.field1731 = this.field1731;
            var15.field1693 = this.field1693;
            var15.field1694 = this.field1694;
            var15.field1695 = this.field1695;
            var15.field1696 = this.field1696;
            var15.field1697 = this.field1697;
            var15.field1698 = this.field1698;
            var15.field1699 = this.field1699;
            var15.field1700 = this.field1700;
            var15.field1701 = this.field1701;
            var15.field1713 = this.field1713;
            var15.field1724 = this.field1724;
            var15.field1705 = this.field1705;
            var15.field1706 = this.field1706;
            var15.field1728 = this.field1728;
            var15.field1708 = this.field1708;
            var15.field1709 = this.field1709;
            var15.field1691 = this.field1691;
            var15.field1711 = this.field1711;
            var15.field1702 = this.field1702;
            var15.field1712 = this.field1712;
            var15.field1730 = this.field1730;
            var15.field1734 = this.field1734;
            var15.field1716 = this.field1716;
            var15.field1717 = this.field1717;
            var15.field1718 = this.field1718;
            var15.field1722 = this.field1722;
            var15.field1723 = this.field1723;
            var15.field1704 = new int[var15.field1727];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1727; var16++) {
                int var17 = this.field1689[var16] + arg1;
                int var18 = this.field1731[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1704[var16] = this.field1704[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1727; var26++) {
                int var27 = (-this.field1704[var26] << 16) / this.field1560;
                if (var27 < arg5) {
                    int var28 = this.field1689[var26] + arg1;
                    int var29 = this.field1731[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1704[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1704[var26];
                }
            }
        }
        var15.method2080();
        return var15;
    }

    @ObfuscatedName("ch.b()V")
    public void method2070() {
        int var10002;
        if (this.field1734 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1727; var3++) {
                int var4 = this.field1734[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1717 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1717[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1727) {
                int var7 = this.field1734[var6];
                this.field1717[var7][var1[var7]++] = var6++;
            }
            this.field1734 = null;
        }
        if (this.field1716 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1692; var10++) {
            int var11 = this.field1716[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1718 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1718[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1692) {
            int var14 = this.field1716[var13];
            this.field1718[var14][var8[var14]++] = var13++;
        }
        this.field1716 = null;
    }

    @ObfuscatedName("ch.m()V")
    public void method2071() {
        for (int var1 = 0; var1 < this.field1727; var1++) {
            int var2 = this.field1689[var1];
            this.field1689[var1] = this.field1731[var1];
            this.field1731[var1] = -var2;
        }
        this.method2080();
    }

    @ObfuscatedName("ch.g()V")
    public void method2066() {
        for (int var1 = 0; var1 < this.field1727; var1++) {
            this.field1689[var1] = -this.field1689[var1];
            this.field1731[var1] = -this.field1731[var1];
        }
        this.method2080();
    }

    @ObfuscatedName("ch.x()V")
    public void method2088() {
        for (int var1 = 0; var1 < this.field1727; var1++) {
            int var2 = this.field1731[var1];
            this.field1731[var1] = this.field1689[var1];
            this.field1689[var1] = -var2;
        }
        this.method2080();
    }

    @ObfuscatedName("ch.r(I)V")
    public void method2073(int arg0) {
        int var2 = field1690[arg0];
        int var3 = field1688[arg0];
        for (int var4 = 0; var4 < this.field1727; var4++) {
            int var5 = this.field1731[var4] * var2 + this.field1689[var4] * var3 >> 16;
            this.field1731[var4] = this.field1731[var4] * var3 - this.field1689[var4] * var2 >> 16;
            this.field1689[var4] = var5;
        }
        this.method2080();
    }

    @ObfuscatedName("ch.s(III)V")
    public void method2074(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1727; var4++) {
            this.field1689[var4] += arg0;
            this.field1704[var4] += arg1;
            this.field1731[var4] += arg2;
        }
        this.method2080();
    }

    @ObfuscatedName("ch.l(SS)V")
    public void method2112(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1692; var3++) {
            if (this.field1700[var3] == arg0) {
                this.field1700[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ch.k(SS)V")
    public void method2082(short arg0, short arg1) {
        if (this.field1701 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1692; var3++) {
            if (this.field1701[var3] == arg0) {
                this.field1701[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ch.w()V")
    public void method2063() {
        for (int var1 = 0; var1 < this.field1727; var1++) {
            this.field1731[var1] = -this.field1731[var1];
        }
        for (int var2 = 0; var2 < this.field1692; var2++) {
            int var3 = this.field1693[var2];
            this.field1693[var2] = this.field1695[var2];
            this.field1695[var2] = var3;
        }
        this.method2080();
    }

    @ObfuscatedName("ch.z(III)V")
    public void method2078(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1727; var4++) {
            this.field1689[var4] = this.field1689[var4] * arg0 / 128;
            this.field1704[var4] = this.field1704[var4] * arg1 / 128;
            this.field1731[var4] = this.field1731[var4] * arg2 / 128;
        }
        this.method2080();
    }

    @ObfuscatedName("ch.p()V")
    public void method2079() {
        if (this.field1720 != null) {
            return;
        }
        this.field1720 = new class91[this.field1727];
        for (int var1 = 0; var1 < this.field1727; var1++) {
            this.field1720[var1] = new class91();
        }
        for (int var2 = 0; var2 < this.field1692; var2++) {
            int var3 = this.field1693[var2];
            int var4 = this.field1694[var2];
            int var5 = this.field1695[var2];
            int var6 = this.field1689[var4] - this.field1689[var3];
            int var7 = this.field1704[var4] - this.field1704[var3];
            int var8 = this.field1731[var4] - this.field1731[var3];
            int var9 = this.field1689[var5] - this.field1689[var3];
            int var10 = this.field1704[var5] - this.field1704[var3];
            int var11 = this.field1731[var5] - this.field1731[var3];
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
            if (this.field1696 == null) {
                var19 = 0;
            } else {
                var19 = this.field1696[var2];
            }
            if (var19 == 0) {
                class91 var20 = this.field1720[var3];
                var20.field1519 += var16;
                var20.field1524 += var17;
                var20.field1523 += var18;
                var20.field1521++;
                class91 var21 = this.field1720[var4];
                var21.field1519 += var16;
                var21.field1524 += var17;
                var21.field1523 += var18;
                var21.field1521++;
                class91 var22 = this.field1720[var5];
                var22.field1519 += var16;
                var22.field1524 += var17;
                var22.field1523 += var18;
                var22.field1521++;
            } else if (var19 == 1) {
                if (this.field1719 == null) {
                    this.field1719 = new class92[this.field1692];
                }
                class92 var23 = this.field1719[var2] = new class92();
                var23.field1530 = var16;
                var23.field1531 = var17;
                var23.field1532 = var18;
            }
        }
    }

    @ObfuscatedName("ch.v()V")
    public void method2080() {
        this.field1720 = null;
        this.field1733 = null;
        this.field1719 = null;
        this.field1707 = false;
    }

    @ObfuscatedName("ch.d()V")
    public void method2081() {
        if (this.field1707) {
            return;
        }
        this.field1560 = 0;
        this.field1725 = 0;
        this.field1726 = 999999;
        this.field1703 = -999999;
        this.field1714 = -99999;
        this.field1729 = 99999;
        for (int var1 = 0; var1 < this.field1727; var1++) {
            int var2 = this.field1689[var1];
            int var3 = this.field1704[var1];
            int var4 = this.field1731[var1];
            if (var2 < this.field1726) {
                this.field1726 = var2;
            }
            if (var2 > this.field1703) {
                this.field1703 = var2;
            }
            if (var4 < this.field1729) {
                this.field1729 = var4;
            }
            if (var4 > this.field1714) {
                this.field1714 = var4;
            }
            if (-var3 > this.field1560) {
                this.field1560 = -var3;
            }
            if (var3 > this.field1725) {
                this.field1725 = var3;
            }
        }
        this.field1707 = true;
    }

    @ObfuscatedName("ch.e(Lch;Lch;IIIZ)V")
    public static void method2124(class101 arg0, class101 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2081();
        arg0.method2079();
        arg1.method2081();
        arg1.method2079();
        field1732++;
        int var6 = 0;
        int[] var7 = arg1.field1689;
        int var8 = arg1.field1727;
        for (int var9 = 0; var9 < arg0.field1727; var9++) {
            class91 var10 = arg0.field1720[var9];
            if (var10.field1521 != 0) {
                int var11 = arg0.field1704[var9] - arg3;
                if (var11 <= arg1.field1725) {
                    int var12 = arg0.field1689[var9] - arg2;
                    if (var12 >= arg1.field1726 && var12 <= arg1.field1703) {
                        int var13 = arg0.field1731[var9] - arg4;
                        if (var13 >= arg1.field1729 && var13 <= arg1.field1714) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class91 var15 = arg1.field1720[var14];
                                if (var7[var14] == var12 && arg1.field1731[var14] == var13 && arg1.field1704[var14] == var11 && var15.field1521 != 0) {
                                    if (arg0.field1733 == null) {
                                        arg0.field1733 = new class91[arg0.field1727];
                                    }
                                    if (arg1.field1733 == null) {
                                        arg1.field1733 = new class91[var8];
                                    }
                                    class91 var16 = arg0.field1733[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1733[var9] = new class91(var10);
                                    }
                                    class91 var17 = arg1.field1733[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1733[var14] = new class91(var15);
                                    }
                                    var16.field1519 += var15.field1519;
                                    var16.field1524 += var15.field1524;
                                    var16.field1523 += var15.field1523;
                                    var16.field1521 += var15.field1521;
                                    var17.field1519 += var10.field1519;
                                    var17.field1524 += var10.field1524;
                                    var17.field1523 += var10.field1523;
                                    var17.field1521 += var10.field1521;
                                    var6++;
                                    field1710[var9] = field1732;
                                    field1715[var14] = field1732;
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
        for (int var18 = 0; var18 < arg0.field1692; var18++) {
            if (field1710[arg0.field1693[var18]] == field1732 && field1710[arg0.field1694[var18]] == field1732 && field1710[arg0.field1695[var18]] == field1732) {
                if (arg0.field1696 == null) {
                    arg0.field1696 = new byte[arg0.field1692];
                }
                arg0.field1696[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1692; var19++) {
            if (field1715[arg1.field1693[var19]] == field1732 && field1715[arg1.field1694[var19]] == field1732 && field1715[arg1.field1695[var19]] == field1732) {
                if (arg1.field1696 == null) {
                    arg1.field1696 = new byte[arg1.field1692];
                }
                arg1.field1696[var19] = 2;
            }
        }
    }

    @ObfuscatedName("ch.y(IIIII)Ldo;")
    public final class112 method2083(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2079();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class112 var8 = new class112();
        var8.field1882 = new int[this.field1692];
        var8.field1892 = new int[this.field1692];
        var8.field1866 = new int[this.field1692];
        if (this.field1721 > 0 && this.field1699 != null) {
            int[] var9 = new int[this.field1721];
            for (int var10 = 0; var10 < this.field1692; var10++) {
                if (this.field1699[var10] != -1) {
                    var9[this.field1699[var10] & 0xFF]++;
                }
            }
            var8.field1872 = 0;
            for (int var11 = 0; var11 < this.field1721; var11++) {
                if (var9[var11] > 0 && this.field1724[var11] == 0) {
                    var8.field1872++;
                }
            }
            var8.field1869 = new int[var8.field1872];
            var8.field1862 = new int[var8.field1872];
            var8.field1875 = new int[var8.field1872];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1721; var13++) {
                if (var9[var13] > 0 && this.field1724[var13] == 0) {
                    var8.field1869[var12] = this.field1705[var13] & 0xFFFF;
                    var8.field1862[var12] = this.field1706[var13] & 0xFFFF;
                    var8.field1875[var12] = this.field1728[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1894 = new byte[this.field1692];
            for (int var14 = 0; var14 < this.field1692; var14++) {
                if (this.field1699[var14] == -1) {
                    var8.field1894[var14] = -1;
                } else {
                    var8.field1894[var14] = (byte) var9[this.field1699[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1692; var15++) {
            byte var16;
            if (this.field1696 == null) {
                var16 = 0;
            } else {
                var16 = this.field1696[var15];
            }
            byte var17;
            if (this.field1698 == null) {
                var17 = 0;
            } else {
                var17 = this.field1698[var15];
            }
            short var18;
            if (this.field1701 == null) {
                var18 = -1;
            } else {
                var18 = this.field1701[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1700[var15] & 0xFFFF;
                    class91 var20;
                    if (this.field1733 == null || this.field1733[this.field1693[var15]] == null) {
                        var20 = this.field1720[this.field1693[var15]];
                    } else {
                        var20 = this.field1733[this.field1693[var15]];
                    }
                    int var21 = (var20.field1523 * arg4 + var20.field1524 * arg3 + var20.field1519 * arg2) / (var20.field1521 * var7) + arg0;
                    var8.field1882[var15] = method2084(var19, var21);
                    class91 var22;
                    if (this.field1733 == null || this.field1733[this.field1694[var15]] == null) {
                        var22 = this.field1720[this.field1694[var15]];
                    } else {
                        var22 = this.field1733[this.field1694[var15]];
                    }
                    int var23 = (var22.field1523 * arg4 + var22.field1524 * arg3 + var22.field1519 * arg2) / (var22.field1521 * var7) + arg0;
                    var8.field1892[var15] = method2084(var19, var23);
                    class91 var24;
                    if (this.field1733 == null || this.field1733[this.field1695[var15]] == null) {
                        var24 = this.field1720[this.field1695[var15]];
                    } else {
                        var24 = this.field1733[this.field1695[var15]];
                    }
                    int var25 = (var24.field1523 * arg4 + var24.field1524 * arg3 + var24.field1519 * arg2) / (var24.field1521 * var7) + arg0;
                    var8.field1866[var15] = method2084(var19, var25);
                } else if (var16 == 1) {
                    class92 var26 = this.field1719[var15];
                    int var27 = (var26.field1532 * arg4 + var26.field1531 * arg3 + var26.field1530 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field1882[var15] = method2084(this.field1700[var15] & 0xFFFF, var27);
                    var8.field1866[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1882[var15] = 128;
                    var8.field1866[var15] = -1;
                } else {
                    var8.field1866[var15] = -2;
                }
            } else if (var16 == 0) {
                class91 var28;
                if (this.field1733 == null || this.field1733[this.field1693[var15]] == null) {
                    var28 = this.field1720[this.field1693[var15]];
                } else {
                    var28 = this.field1733[this.field1693[var15]];
                }
                int var29 = (var28.field1523 * arg4 + var28.field1524 * arg3 + var28.field1519 * arg2) / (var28.field1521 * var7) + arg0;
                var8.field1882[var15] = method2085(var29);
                class91 var30;
                if (this.field1733 == null || this.field1733[this.field1694[var15]] == null) {
                    var30 = this.field1720[this.field1694[var15]];
                } else {
                    var30 = this.field1733[this.field1694[var15]];
                }
                int var31 = (var30.field1523 * arg4 + var30.field1524 * arg3 + var30.field1519 * arg2) / (var30.field1521 * var7) + arg0;
                var8.field1892[var15] = method2085(var31);
                class91 var32;
                if (this.field1733 == null || this.field1733[this.field1695[var15]] == null) {
                    var32 = this.field1720[this.field1695[var15]];
                } else {
                    var32 = this.field1733[this.field1695[var15]];
                }
                int var33 = (var32.field1523 * arg4 + var32.field1524 * arg3 + var32.field1519 * arg2) / (var32.field1521 * var7) + arg0;
                var8.field1866[var15] = method2085(var33);
            } else if (var16 == 1) {
                class92 var34 = this.field1719[var15];
                int var35 = (var34.field1532 * arg4 + var34.field1531 * arg3 + var34.field1530 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field1882[var15] = method2085(var35);
                var8.field1866[var15] = -1;
            } else {
                var8.field1866[var15] = -2;
            }
        }
        this.method2070();
        var8.field1900 = this.field1727;
        var8.field1857 = this.field1689;
        var8.field1888 = this.field1704;
        var8.field1885 = this.field1731;
        var8.field1859 = this.field1692;
        var8.field1861 = this.field1693;
        var8.field1878 = this.field1694;
        var8.field1863 = this.field1695;
        var8.field1867 = this.field1697;
        var8.field1868 = this.field1698;
        var8.field1871 = this.field1713;
        var8.field1873 = this.field1717;
        var8.field1865 = this.field1718;
        var8.field1870 = this.field1701;
        return var8;
    }

    @ObfuscatedName("ch.aw(II)I")
    public static final int method2084(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("ch.ai(I)I")
    public static final int method2085(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
