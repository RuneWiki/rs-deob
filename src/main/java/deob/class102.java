package deob;

@ObfuscatedName("co")
public class class102 extends class95 {

    @ObfuscatedName("co.i")
    public int field1719 = 0;

    @ObfuscatedName("co.b")
    public int[] field1740;

    @ObfuscatedName("co.r")
    public int[] field1696;

    @ObfuscatedName("co.l")
    public int[] field1707;

    @ObfuscatedName("co.s")
    public int field1725 = 0;

    @ObfuscatedName("co.d")
    public int[] field1699;

    @ObfuscatedName("co.e")
    public int[] field1700;

    @ObfuscatedName("co.u")
    public int[] field1701;

    @ObfuscatedName("co.q")
    public byte[] field1702;

    @ObfuscatedName("co.o")
    public byte[] field1703;

    @ObfuscatedName("co.v")
    public byte[] field1704;

    @ObfuscatedName("co.m")
    public byte[] field1705;

    @ObfuscatedName("co.x")
    public short[] field1706;

    @ObfuscatedName("co.w")
    public short[] field1724;

    @ObfuscatedName("co.p")
    public byte field1708 = 0;

    @ObfuscatedName("co.z")
    public int field1709;

    @ObfuscatedName("co.h")
    public byte[] field1710;

    @ObfuscatedName("co.a")
    public short[] field1711;

    @ObfuscatedName("co.c")
    public short[] field1712;

    @ObfuscatedName("co.k")
    public short[] field1713;

    @ObfuscatedName("co.n")
    public short[] field1697;

    @ObfuscatedName("co.t")
    public short[] field1715;

    @ObfuscatedName("co.y")
    public short[] field1695;

    @ObfuscatedName("co.g")
    public short[] field1717;

    @ObfuscatedName("co.f")
    public short[] field1718;

    @ObfuscatedName("co.j")
    public short[] field1716;

    @ObfuscatedName("co.af")
    public byte[] field1727;

    @ObfuscatedName("co.ar")
    public int[] field1721;

    @ObfuscatedName("co.ax")
    public int[] field1722;

    @ObfuscatedName("co.at")
    public int[][] field1728;

    @ObfuscatedName("co.ah")
    public int[][] field1730;

    @ObfuscatedName("co.ap")
    public class93[] field1720;

    @ObfuscatedName("co.ay")
    public class92[] field1726;

    @ObfuscatedName("co.ag")
    public class92[] field1738;

    @ObfuscatedName("co.ai")
    public short field1723;

    @ObfuscatedName("co.aw")
    public short field1729;

    @ObfuscatedName("co.am")
    public boolean field1735 = false;

    @ObfuscatedName("co.an")
    public int field1731;

    @ObfuscatedName("co.as")
    public int field1732;

    @ObfuscatedName("co.au")
    public int field1733;

    @ObfuscatedName("co.aq")
    public int field1734;

    @ObfuscatedName("co.ac")
    public int field1736;

    @ObfuscatedName("co.ae")
    public static int[] field1714 = new int[10000];

    @ObfuscatedName("co.ad")
    public static int[] field1737 = new int[10000];

    @ObfuscatedName("co.ao")
    public static int field1694 = 0;

    @ObfuscatedName("co.aj")
    public static int[] field1739 = class105.field1794;

    @ObfuscatedName("co.aa")
    public static int[] field1698 = class105.field1795;

    public class102() {
    }

    @ObfuscatedName("co.i(Leg;II)Lco;")
    public static class102 method2056(class155 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3043(arg1, arg2);
        return var3 == null ? null : new class102(var3);
    }

    public class102(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2057(arg0);
        } else {
            this.method2071(arg0);
        }
    }

    @ObfuscatedName("co.r([B)V")
    public void method2057(byte[] arg0) {
        class128 var2 = new class128(arg0);
        class128 var3 = new class128(arg0);
        class128 var4 = new class128(arg0);
        class128 var5 = new class128(arg0);
        class128 var6 = new class128(arg0);
        class128 var7 = new class128(arg0);
        class128 var8 = new class128(arg0);
        var2.field2048 = arg0.length - 23;
        int var9 = var2.method2473();
        int var10 = var2.method2473();
        int var11 = var2.method2531();
        int var12 = var2.method2531();
        int var13 = var2.method2531();
        int var14 = var2.method2531();
        int var15 = var2.method2531();
        int var16 = var2.method2531();
        int var17 = var2.method2531();
        int var18 = var2.method2473();
        int var19 = var2.method2473();
        int var20 = var2.method2473();
        int var21 = var2.method2473();
        int var22 = var2.method2473();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1710 = new byte[var11];
            var2.field2048 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1710[var26] = var2.method2464();
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
        this.field1719 = var9;
        this.field1725 = var10;
        this.field1709 = var11;
        this.field1740 = new int[var9];
        this.field1696 = new int[var9];
        this.field1707 = new int[var9];
        this.field1699 = new int[var10];
        this.field1700 = new int[var10];
        this.field1701 = new int[var10];
        if (var17 == 1) {
            this.field1721 = new int[var9];
        }
        if (var12 == 1) {
            this.field1702 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1703 = new byte[var10];
        } else {
            this.field1708 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1704 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1722 = new int[var10];
        }
        if (var16 == 1) {
            this.field1724 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1705 = new byte[var10];
        }
        this.field1706 = new short[var10];
        if (var11 > 0) {
            this.field1711 = new short[var11];
            this.field1712 = new short[var11];
            this.field1713 = new short[var11];
            if (var24 > 0) {
                this.field1697 = new short[var24];
                this.field1715 = new short[var24];
                this.field1695 = new short[var24];
                this.field1717 = new short[var24];
                this.field1727 = new byte[var24];
                this.field1718 = new short[var24];
            }
            if (var25 > 0) {
                this.field1716 = new short[var25];
            }
        }
        var2.field2048 = var11;
        var3.field2048 = var44;
        var4.field2048 = var46;
        var5.field2048 = var48;
        var6.field2048 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2531();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2475();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2475();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2475();
            }
            this.field1740[var67] = var64 + var69;
            this.field1696[var67] = var65 + var70;
            this.field1707[var67] = var66 + var71;
            var64 = this.field1740[var67];
            var65 = this.field1696[var67];
            var66 = this.field1707[var67];
            if (var17 == 1) {
                this.field1721[var67] = var6.method2531();
            }
        }
        var2.field2048 = var42;
        var3.field2048 = var31;
        var4.field2048 = var34;
        var5.field2048 = var37;
        var6.field2048 = var35;
        var7.field2048 = var40;
        var8.field2048 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1706[var72] = (short) var2.method2473();
            if (var12 == 1) {
                this.field1702[var72] = var3.method2464();
            }
            if (var13 == 255) {
                this.field1703[var72] = var4.method2464();
            }
            if (var14 == 1) {
                this.field1704[var72] = var5.method2464();
            }
            if (var15 == 1) {
                this.field1722[var72] = var6.method2531();
            }
            if (var16 == 1) {
                this.field1724[var72] = (short) (var7.method2473() - 1);
            }
            if (this.field1705 != null && this.field1724[var72] != -1) {
                this.field1705[var72] = (byte) (var8.method2531() - 1);
            }
        }
        var2.field2048 = var33;
        var3.field2048 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2531();
            if (var78 == 1) {
                var73 = var2.method2475() + var76;
                var74 = var2.method2475() + var73;
                var75 = var2.method2475() + var74;
                var76 = var75;
                this.field1699[var77] = var73;
                this.field1700[var77] = var74;
                this.field1701[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2475() + var76;
                var76 = var75;
                this.field1699[var77] = var73;
                this.field1700[var77] = var74;
                this.field1701[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2475() + var76;
                var76 = var75;
                this.field1699[var77] = var73;
                this.field1700[var77] = var74;
                this.field1701[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2475() + var76;
                var76 = var75;
                this.field1699[var77] = var73;
                this.field1700[var77] = var81;
                this.field1701[var77] = var75;
            }
        }
        var2.field2048 = var50;
        var3.field2048 = var52;
        var4.field2048 = var54;
        var5.field2048 = var56;
        var6.field2048 = var58;
        var7.field2048 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1710[var82] & 0xFF;
            if (var83 == 0) {
                this.field1711[var82] = (short) var2.method2473();
                this.field1712[var82] = (short) var2.method2473();
                this.field1713[var82] = (short) var2.method2473();
            }
            if (var83 == 1) {
                this.field1711[var82] = (short) var3.method2473();
                this.field1712[var82] = (short) var3.method2473();
                this.field1713[var82] = (short) var3.method2473();
                this.field1697[var82] = (short) var4.method2473();
                this.field1715[var82] = (short) var4.method2473();
                this.field1695[var82] = (short) var4.method2473();
                this.field1717[var82] = (short) var5.method2473();
                this.field1727[var82] = var6.method2464();
                this.field1718[var82] = (short) var7.method2473();
            }
            if (var83 == 2) {
                this.field1711[var82] = (short) var3.method2473();
                this.field1712[var82] = (short) var3.method2473();
                this.field1713[var82] = (short) var3.method2473();
                this.field1697[var82] = (short) var4.method2473();
                this.field1715[var82] = (short) var4.method2473();
                this.field1695[var82] = (short) var4.method2473();
                this.field1717[var82] = (short) var5.method2473();
                this.field1727[var82] = var6.method2464();
                this.field1718[var82] = (short) var7.method2473();
                this.field1716[var82] = (short) var7.method2473();
            }
            if (var83 == 3) {
                this.field1711[var82] = (short) var3.method2473();
                this.field1712[var82] = (short) var3.method2473();
                this.field1713[var82] = (short) var3.method2473();
                this.field1697[var82] = (short) var4.method2473();
                this.field1715[var82] = (short) var4.method2473();
                this.field1695[var82] = (short) var4.method2473();
                this.field1717[var82] = (short) var5.method2473();
                this.field1727[var82] = var6.method2464();
                this.field1718[var82] = (short) var7.method2473();
            }
        }
        var2.field2048 = var62;
        int var84 = var2.method2531();
        if (var84 == 0) {
            return;
        }
        new class104();
        var2.method2473();
        var2.method2473();
        var2.method2473();
        var2.method2468();
    }

    @ObfuscatedName("co.l([B)V")
    public void method2071(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class128 var4 = new class128(arg0);
        class128 var5 = new class128(arg0);
        class128 var6 = new class128(arg0);
        class128 var7 = new class128(arg0);
        class128 var8 = new class128(arg0);
        var4.field2048 = arg0.length - 18;
        int var9 = var4.method2473();
        int var10 = var4.method2473();
        int var11 = var4.method2531();
        int var12 = var4.method2531();
        int var13 = var4.method2531();
        int var14 = var4.method2531();
        int var15 = var4.method2531();
        int var16 = var4.method2531();
        int var17 = var4.method2473();
        int var18 = var4.method2473();
        int var19 = var4.method2473();
        int var20 = var4.method2473();
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
        this.field1719 = var9;
        this.field1725 = var10;
        this.field1709 = var11;
        this.field1740 = new int[var9];
        this.field1696 = new int[var9];
        this.field1707 = new int[var9];
        this.field1699 = new int[var10];
        this.field1700 = new int[var10];
        this.field1701 = new int[var10];
        if (var11 > 0) {
            this.field1710 = new byte[var11];
            this.field1711 = new short[var11];
            this.field1712 = new short[var11];
            this.field1713 = new short[var11];
        }
        if (var16 == 1) {
            this.field1721 = new int[var9];
        }
        if (var12 == 1) {
            this.field1702 = new byte[var10];
            this.field1705 = new byte[var10];
            this.field1724 = new short[var10];
        }
        if (var13 == 255) {
            this.field1703 = new byte[var10];
        } else {
            this.field1708 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1704 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1722 = new int[var10];
        }
        this.field1706 = new short[var10];
        var4.field2048 = var21;
        var5.field2048 = var36;
        var6.field2048 = var38;
        var7.field2048 = var40;
        var8.field2048 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2531();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2475();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2475();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2475();
            }
            this.field1740[var46] = var43 + var48;
            this.field1696[var46] = var44 + var49;
            this.field1707[var46] = var45 + var50;
            var43 = this.field1740[var46];
            var44 = this.field1696[var46];
            var45 = this.field1707[var46];
            if (var16 == 1) {
                this.field1721[var46] = var8.method2531();
            }
        }
        var4.field2048 = var32;
        var5.field2048 = var28;
        var6.field2048 = var26;
        var7.field2048 = var30;
        var8.field2048 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1706[var51] = (short) var4.method2473();
            if (var12 == 1) {
                int var52 = var5.method2531();
                if ((var52 & 0x1) == 1) {
                    this.field1702[var51] = 1;
                    var2 = true;
                } else {
                    this.field1702[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1705[var51] = (byte) (var52 >> 2);
                    this.field1724[var51] = this.field1706[var51];
                    this.field1706[var51] = 127;
                    if (this.field1724[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1705[var51] = -1;
                    this.field1724[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1703[var51] = var6.method2464();
            }
            if (var14 == 1) {
                this.field1704[var51] = var7.method2464();
            }
            if (var15 == 1) {
                this.field1722[var51] = var8.method2531();
            }
        }
        var4.field2048 = var25;
        var5.field2048 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2531();
            if (var58 == 1) {
                var53 = var4.method2475() + var56;
                var54 = var4.method2475() + var53;
                var55 = var4.method2475() + var54;
                var56 = var55;
                this.field1699[var57] = var53;
                this.field1700[var57] = var54;
                this.field1701[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2475() + var56;
                var56 = var55;
                this.field1699[var57] = var53;
                this.field1700[var57] = var54;
                this.field1701[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2475() + var56;
                var56 = var55;
                this.field1699[var57] = var53;
                this.field1700[var57] = var54;
                this.field1701[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2475() + var56;
                var56 = var55;
                this.field1699[var57] = var53;
                this.field1700[var57] = var61;
                this.field1701[var57] = var55;
            }
        }
        var4.field2048 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1710[var62] = 0;
            this.field1711[var62] = (short) var4.method2473();
            this.field1712[var62] = (short) var4.method2473();
            this.field1713[var62] = (short) var4.method2473();
        }
        if (this.field1705 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1705[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1711[var65] & 0xFFFF) == this.field1699[var64] && (this.field1712[var65] & 0xFFFF) == this.field1700[var64] && (this.field1713[var65] & 0xFFFF) == this.field1701[var64]) {
                        this.field1705[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1705 = null;
            }
        }
        if (!var3) {
            this.field1724 = null;
        }
        if (!var2) {
            this.field1702 = null;
        }
    }

    public class102(class102[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1719 = 0;
        this.field1725 = 0;
        this.field1709 = 0;
        this.field1708 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class102 var10 = arg0[var9];
            if (var10 != null) {
                this.field1719 += var10.field1719;
                this.field1725 += var10.field1725;
                this.field1709 += var10.field1709;
                if (var10.field1703 == null) {
                    if (this.field1708 == -1) {
                        this.field1708 = var10.field1708;
                    }
                    if (this.field1708 != var10.field1708) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1702 != null;
                var5 |= var10.field1704 != null;
                var6 |= var10.field1722 != null;
                var7 |= var10.field1724 != null;
                var8 |= var10.field1705 != null;
            }
        }
        this.field1740 = new int[this.field1719];
        this.field1696 = new int[this.field1719];
        this.field1707 = new int[this.field1719];
        this.field1721 = new int[this.field1719];
        this.field1699 = new int[this.field1725];
        this.field1700 = new int[this.field1725];
        this.field1701 = new int[this.field1725];
        if (var3) {
            this.field1702 = new byte[this.field1725];
        }
        if (var4) {
            this.field1703 = new byte[this.field1725];
        }
        if (var5) {
            this.field1704 = new byte[this.field1725];
        }
        if (var6) {
            this.field1722 = new int[this.field1725];
        }
        if (var7) {
            this.field1724 = new short[this.field1725];
        }
        if (var8) {
            this.field1705 = new byte[this.field1725];
        }
        this.field1706 = new short[this.field1725];
        if (this.field1709 > 0) {
            this.field1710 = new byte[this.field1709];
            this.field1711 = new short[this.field1709];
            this.field1712 = new short[this.field1709];
            this.field1713 = new short[this.field1709];
            this.field1697 = new short[this.field1709];
            this.field1715 = new short[this.field1709];
            this.field1695 = new short[this.field1709];
            this.field1717 = new short[this.field1709];
            this.field1727 = new byte[this.field1709];
            this.field1718 = new short[this.field1709];
            this.field1716 = new short[this.field1709];
        }
        this.field1719 = 0;
        this.field1725 = 0;
        this.field1709 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class102 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1725; var13++) {
                    if (var3 && var12.field1702 != null) {
                        this.field1702[this.field1725] = var12.field1702[var13];
                    }
                    if (var4) {
                        if (var12.field1703 == null) {
                            this.field1703[this.field1725] = var12.field1708;
                        } else {
                            this.field1703[this.field1725] = var12.field1703[var13];
                        }
                    }
                    if (var5 && var12.field1704 != null) {
                        this.field1704[this.field1725] = var12.field1704[var13];
                    }
                    if (var6 && var12.field1722 != null) {
                        this.field1722[this.field1725] = var12.field1722[var13];
                    }
                    if (var7) {
                        if (var12.field1724 == null) {
                            this.field1724[this.field1725] = -1;
                        } else {
                            this.field1724[this.field1725] = var12.field1724[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1705 == null || var12.field1705[var13] == -1) {
                            this.field1705[this.field1725] = -1;
                        } else {
                            this.field1705[this.field1725] = (byte) (var12.field1705[var13] + this.field1709);
                        }
                    }
                    this.field1706[this.field1725] = var12.field1706[var13];
                    this.field1699[this.field1725] = this.method2060(var12, var12.field1699[var13]);
                    this.field1700[this.field1725] = this.method2060(var12, var12.field1700[var13]);
                    this.field1701[this.field1725] = this.method2060(var12, var12.field1701[var13]);
                    this.field1725++;
                }
                for (int var14 = 0; var14 < var12.field1709; var14++) {
                    byte var15 = this.field1710[this.field1709] = var12.field1710[var14];
                    if (var15 == 0) {
                        this.field1711[this.field1709] = (short) this.method2060(var12, var12.field1711[var14]);
                        this.field1712[this.field1709] = (short) this.method2060(var12, var12.field1712[var14]);
                        this.field1713[this.field1709] = (short) this.method2060(var12, var12.field1713[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1711[this.field1709] = var12.field1711[var14];
                        this.field1712[this.field1709] = var12.field1712[var14];
                        this.field1713[this.field1709] = var12.field1713[var14];
                        this.field1697[this.field1709] = var12.field1697[var14];
                        this.field1715[this.field1709] = var12.field1715[var14];
                        this.field1695[this.field1709] = var12.field1695[var14];
                        this.field1717[this.field1709] = var12.field1717[var14];
                        this.field1727[this.field1709] = var12.field1727[var14];
                        this.field1718[this.field1709] = var12.field1718[var14];
                    }
                    if (var15 == 2) {
                        this.field1716[this.field1709] = var12.field1716[var14];
                    }
                    this.field1709++;
                }
            }
        }
    }

    @ObfuscatedName("co.s(Lco;I)I")
    public final int method2060(class102 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1740[arg1];
        int var5 = arg0.field1696[arg1];
        int var6 = arg0.field1707[arg1];
        for (int var7 = 0; var7 < this.field1719; var7++) {
            if (this.field1740[var7] == var4 && this.field1696[var7] == var5 && this.field1707[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1740[this.field1719] = var4;
            this.field1696[this.field1719] = var5;
            this.field1707[this.field1719] = var6;
            if (arg0.field1721 != null) {
                this.field1721[this.field1719] = arg0.field1721[arg1];
            }
            var3 = this.field1719++;
        }
        return var3;
    }

    public class102(class102 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1719 = arg0.field1719;
        this.field1725 = arg0.field1725;
        this.field1709 = arg0.field1709;
        if (arg1) {
            this.field1740 = arg0.field1740;
            this.field1696 = arg0.field1696;
            this.field1707 = arg0.field1707;
        } else {
            this.field1740 = new int[this.field1719];
            this.field1696 = new int[this.field1719];
            this.field1707 = new int[this.field1719];
            for (int var6 = 0; var6 < this.field1719; var6++) {
                this.field1740[var6] = arg0.field1740[var6];
                this.field1696[var6] = arg0.field1696[var6];
                this.field1707[var6] = arg0.field1707[var6];
            }
        }
        if (arg2) {
            this.field1706 = arg0.field1706;
        } else {
            this.field1706 = new short[this.field1725];
            for (int var7 = 0; var7 < this.field1725; var7++) {
                this.field1706[var7] = arg0.field1706[var7];
            }
        }
        if (arg3 || arg0.field1724 == null) {
            this.field1724 = arg0.field1724;
        } else {
            this.field1724 = new short[this.field1725];
            for (int var8 = 0; var8 < this.field1725; var8++) {
                this.field1724[var8] = arg0.field1724[var8];
            }
        }
        if (arg4) {
            this.field1704 = arg0.field1704;
        } else {
            this.field1704 = new byte[this.field1725];
            if (arg0.field1704 == null) {
                for (int var9 = 0; var9 < this.field1725; var9++) {
                    this.field1704[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1725; var10++) {
                    this.field1704[var10] = arg0.field1704[var10];
                }
            }
        }
        this.field1699 = arg0.field1699;
        this.field1700 = arg0.field1700;
        this.field1701 = arg0.field1701;
        this.field1702 = arg0.field1702;
        this.field1703 = arg0.field1703;
        this.field1705 = arg0.field1705;
        this.field1708 = arg0.field1708;
        this.field1710 = arg0.field1710;
        this.field1711 = arg0.field1711;
        this.field1712 = arg0.field1712;
        this.field1713 = arg0.field1713;
        this.field1697 = arg0.field1697;
        this.field1715 = arg0.field1715;
        this.field1695 = arg0.field1695;
        this.field1717 = arg0.field1717;
        this.field1727 = arg0.field1727;
        this.field1718 = arg0.field1718;
        this.field1716 = arg0.field1716;
        this.field1721 = arg0.field1721;
        this.field1722 = arg0.field1722;
        this.field1728 = arg0.field1728;
        this.field1730 = arg0.field1730;
        this.field1726 = arg0.field1726;
        this.field1720 = arg0.field1720;
        this.field1738 = arg0.field1738;
        this.field1723 = arg0.field1723;
        this.field1729 = arg0.field1729;
    }

    @ObfuscatedName("co.d()Lco;")
    public class102 method2062() {
        class102 var1 = new class102();
        if (this.field1702 != null) {
            var1.field1702 = new byte[this.field1725];
            for (int var2 = 0; var2 < this.field1725; var2++) {
                var1.field1702[var2] = this.field1702[var2];
            }
        }
        var1.field1719 = this.field1719;
        var1.field1725 = this.field1725;
        var1.field1709 = this.field1709;
        var1.field1740 = this.field1740;
        var1.field1696 = this.field1696;
        var1.field1707 = this.field1707;
        var1.field1699 = this.field1699;
        var1.field1700 = this.field1700;
        var1.field1701 = this.field1701;
        var1.field1703 = this.field1703;
        var1.field1704 = this.field1704;
        var1.field1705 = this.field1705;
        var1.field1706 = this.field1706;
        var1.field1724 = this.field1724;
        var1.field1708 = this.field1708;
        var1.field1710 = this.field1710;
        var1.field1711 = this.field1711;
        var1.field1712 = this.field1712;
        var1.field1713 = this.field1713;
        var1.field1697 = this.field1697;
        var1.field1715 = this.field1715;
        var1.field1695 = this.field1695;
        var1.field1717 = this.field1717;
        var1.field1727 = this.field1727;
        var1.field1718 = this.field1718;
        var1.field1716 = this.field1716;
        var1.field1721 = this.field1721;
        var1.field1722 = this.field1722;
        var1.field1728 = this.field1728;
        var1.field1730 = this.field1730;
        var1.field1726 = this.field1726;
        var1.field1720 = this.field1720;
        var1.field1723 = this.field1723;
        var1.field1729 = this.field1729;
        return var1;
    }

    @ObfuscatedName("co.e([[IIIIZI)Lco;")
    public class102 method2101(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2059();
        int var7 = this.field1732 + arg1;
        int var8 = this.field1733 + arg1;
        int var9 = this.field1736 + arg3;
        int var10 = this.field1734 + arg3;
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
        class102 var15;
        if (arg4) {
            var15 = new class102();
            var15.field1719 = this.field1719;
            var15.field1725 = this.field1725;
            var15.field1709 = this.field1709;
            var15.field1740 = this.field1740;
            var15.field1707 = this.field1707;
            var15.field1699 = this.field1699;
            var15.field1700 = this.field1700;
            var15.field1701 = this.field1701;
            var15.field1702 = this.field1702;
            var15.field1703 = this.field1703;
            var15.field1704 = this.field1704;
            var15.field1705 = this.field1705;
            var15.field1706 = this.field1706;
            var15.field1724 = this.field1724;
            var15.field1708 = this.field1708;
            var15.field1710 = this.field1710;
            var15.field1711 = this.field1711;
            var15.field1712 = this.field1712;
            var15.field1713 = this.field1713;
            var15.field1697 = this.field1697;
            var15.field1715 = this.field1715;
            var15.field1695 = this.field1695;
            var15.field1717 = this.field1717;
            var15.field1727 = this.field1727;
            var15.field1718 = this.field1718;
            var15.field1716 = this.field1716;
            var15.field1721 = this.field1721;
            var15.field1722 = this.field1722;
            var15.field1728 = this.field1728;
            var15.field1730 = this.field1730;
            var15.field1723 = this.field1723;
            var15.field1729 = this.field1729;
            var15.field1696 = new int[var15.field1719];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1719; var16++) {
                int var17 = this.field1740[var16] + arg1;
                int var18 = this.field1707[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1696[var16] = this.field1696[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1719; var26++) {
                int var27 = (-this.field1696[var26] << 16) / this.field1564;
                if (var27 < arg5) {
                    int var28 = this.field1740[var26] + arg1;
                    int var29 = this.field1707[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1696[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1696[var26];
                }
            }
        }
        var15.method2074();
        return var15;
    }

    @ObfuscatedName("co.m()V")
    public void method2064() {
        int var10002;
        if (this.field1721 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1719; var3++) {
                int var4 = this.field1721[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1728 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1728[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1719) {
                int var7 = this.field1721[var6];
                this.field1728[var7][var1[var7]++] = var6++;
            }
            this.field1721 = null;
        }
        if (this.field1722 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1725; var10++) {
            int var11 = this.field1722[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1730 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1730[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1725) {
            int var14 = this.field1722[var13];
            this.field1730[var14][var8[var14]++] = var13++;
        }
        this.field1722 = null;
    }

    @ObfuscatedName("co.x()V")
    public void method2065() {
        for (int var1 = 0; var1 < this.field1719; var1++) {
            int var2 = this.field1740[var1];
            this.field1740[var1] = this.field1707[var1];
            this.field1707[var1] = -var2;
        }
        this.method2074();
    }

    @ObfuscatedName("co.w()V")
    public void method2115() {
        for (int var1 = 0; var1 < this.field1719; var1++) {
            this.field1740[var1] = -this.field1740[var1];
            this.field1707[var1] = -this.field1707[var1];
        }
        this.method2074();
    }

    @ObfuscatedName("co.p()V")
    public void method2073() {
        for (int var1 = 0; var1 < this.field1719; var1++) {
            int var2 = this.field1707[var1];
            this.field1707[var1] = this.field1740[var1];
            this.field1740[var1] = -var2;
        }
        this.method2074();
    }

    @ObfuscatedName("co.z(I)V")
    public void method2068(int arg0) {
        int var2 = field1739[arg0];
        int var3 = field1698[arg0];
        for (int var4 = 0; var4 < this.field1719; var4++) {
            int var5 = this.field1740[var4] * var3 + this.field1707[var4] * var2 >> 16;
            this.field1707[var4] = this.field1707[var4] * var3 - this.field1740[var4] * var2 >> 16;
            this.field1740[var4] = var5;
        }
        this.method2074();
    }

    @ObfuscatedName("co.h(III)V")
    public void method2069(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1719; var4++) {
            this.field1740[var4] += arg0;
            this.field1696[var4] += arg1;
            this.field1707[var4] += arg2;
        }
        this.method2074();
    }

    @ObfuscatedName("co.a(SS)V")
    public void method2099(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1725; var3++) {
            if (this.field1706[var3] == arg0) {
                this.field1706[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("co.c(SS)V")
    public void method2075(short arg0, short arg1) {
        if (this.field1724 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1725; var3++) {
            if (this.field1724[var3] == arg0) {
                this.field1724[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("co.k()V")
    public void method2121() {
        for (int var1 = 0; var1 < this.field1719; var1++) {
            this.field1707[var1] = -this.field1707[var1];
        }
        for (int var2 = 0; var2 < this.field1725; var2++) {
            int var3 = this.field1699[var2];
            this.field1699[var2] = this.field1701[var2];
            this.field1701[var2] = var3;
        }
        this.method2074();
    }

    @ObfuscatedName("co.f(III)V")
    public void method2072(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1719; var4++) {
            this.field1740[var4] = this.field1740[var4] * arg0 / 128;
            this.field1696[var4] = this.field1696[var4] * arg1 / 128;
            this.field1707[var4] = this.field1707[var4] * arg2 / 128;
        }
        this.method2074();
    }

    @ObfuscatedName("co.j()V")
    public void method2094() {
        if (this.field1726 != null) {
            return;
        }
        this.field1726 = new class92[this.field1719];
        for (int var1 = 0; var1 < this.field1719; var1++) {
            this.field1726[var1] = new class92();
        }
        for (int var2 = 0; var2 < this.field1725; var2++) {
            int var3 = this.field1699[var2];
            int var4 = this.field1700[var2];
            int var5 = this.field1701[var2];
            int var6 = this.field1740[var4] - this.field1740[var3];
            int var7 = this.field1696[var4] - this.field1696[var3];
            int var8 = this.field1707[var4] - this.field1707[var3];
            int var9 = this.field1740[var5] - this.field1740[var3];
            int var10 = this.field1696[var5] - this.field1696[var3];
            int var11 = this.field1707[var5] - this.field1707[var3];
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
            if (this.field1702 == null) {
                var19 = 0;
            } else {
                var19 = this.field1702[var2];
            }
            if (var19 == 0) {
                class92 var20 = this.field1726[var3];
                var20.field1533 += var16;
                var20.field1528 += var17;
                var20.field1529 += var18;
                var20.field1530++;
                class92 var21 = this.field1726[var4];
                var21.field1533 += var16;
                var21.field1528 += var17;
                var21.field1529 += var18;
                var21.field1530++;
                class92 var22 = this.field1726[var5];
                var22.field1533 += var16;
                var22.field1528 += var17;
                var22.field1529 += var18;
                var22.field1530++;
            } else if (var19 == 1) {
                if (this.field1720 == null) {
                    this.field1720 = new class93[this.field1725];
                }
                class93 var23 = this.field1720[var2] = new class93();
                var23.field1540 = var16;
                var23.field1536 = var17;
                var23.field1538 = var18;
            }
        }
    }

    @ObfuscatedName("co.af()V")
    public void method2074() {
        this.field1726 = null;
        this.field1738 = null;
        this.field1720 = null;
        this.field1735 = false;
    }

    @ObfuscatedName("co.ar()V")
    public void method2059() {
        if (this.field1735) {
            return;
        }
        this.field1564 = 0;
        this.field1731 = 0;
        this.field1732 = 999999;
        this.field1733 = -999999;
        this.field1734 = -99999;
        this.field1736 = 99999;
        for (int var1 = 0; var1 < this.field1719; var1++) {
            int var2 = this.field1740[var1];
            int var3 = this.field1696[var1];
            int var4 = this.field1707[var1];
            if (var2 < this.field1732) {
                this.field1732 = var2;
            }
            if (var2 > this.field1733) {
                this.field1733 = var2;
            }
            if (var4 < this.field1736) {
                this.field1736 = var4;
            }
            if (var4 > this.field1734) {
                this.field1734 = var4;
            }
            if (-var3 > this.field1564) {
                this.field1564 = -var3;
            }
            if (var3 > this.field1731) {
                this.field1731 = var3;
            }
        }
        this.field1735 = true;
    }

    @ObfuscatedName("co.ax(Lco;Lco;IIIZ)V")
    public static void method2055(class102 arg0, class102 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2059();
        arg0.method2094();
        arg1.method2059();
        arg1.method2094();
        field1694++;
        int var6 = 0;
        int[] var7 = arg1.field1740;
        int var8 = arg1.field1719;
        for (int var9 = 0; var9 < arg0.field1719; var9++) {
            class92 var10 = arg0.field1726[var9];
            if (var10.field1530 != 0) {
                int var11 = arg0.field1696[var9] - arg3;
                if (var11 <= arg1.field1731) {
                    int var12 = arg0.field1740[var9] - arg2;
                    if (var12 >= arg1.field1732 && var12 <= arg1.field1733) {
                        int var13 = arg0.field1707[var9] - arg4;
                        if (var13 >= arg1.field1736 && var13 <= arg1.field1734) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class92 var15 = arg1.field1726[var14];
                                if (var7[var14] == var12 && arg1.field1707[var14] == var13 && arg1.field1696[var14] == var11 && var15.field1530 != 0) {
                                    if (arg0.field1738 == null) {
                                        arg0.field1738 = new class92[arg0.field1719];
                                    }
                                    if (arg1.field1738 == null) {
                                        arg1.field1738 = new class92[var8];
                                    }
                                    class92 var16 = arg0.field1738[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1738[var9] = new class92(var10);
                                    }
                                    class92 var17 = arg1.field1738[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1738[var14] = new class92(var15);
                                    }
                                    var16.field1533 += var15.field1533;
                                    var16.field1528 += var15.field1528;
                                    var16.field1529 += var15.field1529;
                                    var16.field1530 += var15.field1530;
                                    var17.field1533 += var10.field1533;
                                    var17.field1528 += var10.field1528;
                                    var17.field1529 += var10.field1529;
                                    var17.field1530 += var10.field1530;
                                    var6++;
                                    field1714[var9] = field1694;
                                    field1737[var14] = field1694;
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
        for (int var18 = 0; var18 < arg0.field1725; var18++) {
            if (field1714[arg0.field1699[var18]] == field1694 && field1714[arg0.field1700[var18]] == field1694 && field1714[arg0.field1701[var18]] == field1694) {
                if (arg0.field1702 == null) {
                    arg0.field1702 = new byte[arg0.field1725];
                }
                arg0.field1702[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1725; var19++) {
            if (field1737[arg1.field1699[var19]] == field1694 && field1737[arg1.field1700[var19]] == field1694 && field1737[arg1.field1701[var19]] == field1694) {
                if (arg1.field1702 == null) {
                    arg1.field1702 = new byte[arg1.field1725];
                }
                arg1.field1702[var19] = 2;
            }
        }
    }

    @ObfuscatedName("co.at(IIIII)Ldt;")
    public final class113 method2076(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2094();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class113 var8 = new class113();
        var8.field1874 = new int[this.field1725];
        var8.field1875 = new int[this.field1725];
        var8.field1876 = new int[this.field1725];
        if (this.field1709 > 0 && this.field1705 != null) {
            int[] var9 = new int[this.field1709];
            for (int var10 = 0; var10 < this.field1725; var10++) {
                if (this.field1705[var10] != -1) {
                    var9[this.field1705[var10] & 0xFF]++;
                }
            }
            var8.field1895 = 0;
            for (int var11 = 0; var11 < this.field1709; var11++) {
                if (var9[var11] > 0 && this.field1710[var11] == 0) {
                    var8.field1895++;
                }
            }
            var8.field1883 = new int[var8.field1895];
            var8.field1921 = new int[var8.field1895];
            var8.field1925 = new int[var8.field1895];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1709; var13++) {
                if (var9[var13] > 0 && this.field1710[var13] == 0) {
                    var8.field1883[var12] = this.field1711[var13] & 0xFFFF;
                    var8.field1921[var12] = this.field1712[var13] & 0xFFFF;
                    var8.field1925[var12] = this.field1713[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1879 = new byte[this.field1725];
            for (int var14 = 0; var14 < this.field1725; var14++) {
                if (this.field1705[var14] == -1) {
                    var8.field1879[var14] = -1;
                } else {
                    var8.field1879[var14] = (byte) var9[this.field1705[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1725; var15++) {
            byte var16;
            if (this.field1702 == null) {
                var16 = 0;
            } else {
                var16 = this.field1702[var15];
            }
            byte var17;
            if (this.field1704 == null) {
                var17 = 0;
            } else {
                var17 = this.field1704[var15];
            }
            short var18;
            if (this.field1724 == null) {
                var18 = -1;
            } else {
                var18 = this.field1724[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1706[var15] & 0xFFFF;
                    class92 var20;
                    if (this.field1738 == null || this.field1738[this.field1699[var15]] == null) {
                        var20 = this.field1726[this.field1699[var15]];
                    } else {
                        var20 = this.field1738[this.field1699[var15]];
                    }
                    int var21 = (var20.field1529 * arg4 + var20.field1533 * arg2 + var20.field1528 * arg3) / (var20.field1530 * var7) + arg0;
                    var8.field1874[var15] = method2078(var19, var21);
                    class92 var22;
                    if (this.field1738 == null || this.field1738[this.field1700[var15]] == null) {
                        var22 = this.field1726[this.field1700[var15]];
                    } else {
                        var22 = this.field1738[this.field1700[var15]];
                    }
                    int var23 = (var22.field1529 * arg4 + var22.field1533 * arg2 + var22.field1528 * arg3) / (var22.field1530 * var7) + arg0;
                    var8.field1875[var15] = method2078(var19, var23);
                    class92 var24;
                    if (this.field1738 == null || this.field1738[this.field1701[var15]] == null) {
                        var24 = this.field1726[this.field1701[var15]];
                    } else {
                        var24 = this.field1738[this.field1701[var15]];
                    }
                    int var25 = (var24.field1529 * arg4 + var24.field1533 * arg2 + var24.field1528 * arg3) / (var24.field1530 * var7) + arg0;
                    var8.field1876[var15] = method2078(var19, var25);
                } else if (var16 == 1) {
                    class93 var26 = this.field1720[var15];
                    int var27 = (var26.field1538 * arg4 + var26.field1540 * arg2 + var26.field1536 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1874[var15] = method2078(this.field1706[var15] & 0xFFFF, var27);
                    var8.field1876[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1874[var15] = 128;
                    var8.field1876[var15] = -1;
                } else {
                    var8.field1876[var15] = -2;
                }
            } else if (var16 == 0) {
                class92 var28;
                if (this.field1738 == null || this.field1738[this.field1699[var15]] == null) {
                    var28 = this.field1726[this.field1699[var15]];
                } else {
                    var28 = this.field1738[this.field1699[var15]];
                }
                int var29 = (var28.field1529 * arg4 + var28.field1533 * arg2 + var28.field1528 * arg3) / (var28.field1530 * var7) + arg0;
                var8.field1874[var15] = method2079(var29);
                class92 var30;
                if (this.field1738 == null || this.field1738[this.field1700[var15]] == null) {
                    var30 = this.field1726[this.field1700[var15]];
                } else {
                    var30 = this.field1738[this.field1700[var15]];
                }
                int var31 = (var30.field1529 * arg4 + var30.field1533 * arg2 + var30.field1528 * arg3) / (var30.field1530 * var7) + arg0;
                var8.field1875[var15] = method2079(var31);
                class92 var32;
                if (this.field1738 == null || this.field1738[this.field1701[var15]] == null) {
                    var32 = this.field1726[this.field1701[var15]];
                } else {
                    var32 = this.field1738[this.field1701[var15]];
                }
                int var33 = (var32.field1529 * arg4 + var32.field1533 * arg2 + var32.field1528 * arg3) / (var32.field1530 * var7) + arg0;
                var8.field1876[var15] = method2079(var33);
            } else if (var16 == 1) {
                class93 var34 = this.field1720[var15];
                int var35 = (var34.field1538 * arg4 + var34.field1540 * arg2 + var34.field1536 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1874[var15] = method2079(var35);
                var8.field1876[var15] = -1;
            } else {
                var8.field1876[var15] = -2;
            }
        }
        this.method2064();
        var8.field1866 = this.field1719;
        var8.field1867 = this.field1740;
        var8.field1868 = this.field1696;
        var8.field1869 = this.field1707;
        var8.field1870 = this.field1725;
        var8.field1871 = this.field1699;
        var8.field1894 = this.field1700;
        var8.field1906 = this.field1701;
        var8.field1864 = this.field1703;
        var8.field1917 = this.field1704;
        var8.field1924 = this.field1708;
        var8.field1886 = this.field1728;
        var8.field1887 = this.field1730;
        var8.field1880 = this.field1724;
        return var8;
    }

    @ObfuscatedName("co.ah(II)I")
    public static final int method2078(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("co.ap(I)I")
    public static final int method2079(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
