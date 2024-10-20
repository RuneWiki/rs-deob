package deob;

@ObfuscatedName("cq")
public class class102 extends class95 {

    @ObfuscatedName("cq.e")
    public int field1716 = 0;

    @ObfuscatedName("cq.i")
    public int[] field1679;

    @ObfuscatedName("cq.k")
    public int[] field1680;

    @ObfuscatedName("cq.q")
    public int[] field1717;

    @ObfuscatedName("cq.j")
    public int field1682 = 0;

    @ObfuscatedName("cq.z")
    public int[] field1683;

    @ObfuscatedName("cq.m")
    public int[] field1718;

    @ObfuscatedName("cq.w")
    public int[] field1685;

    @ObfuscatedName("cq.a")
    public byte[] field1686;

    @ObfuscatedName("cq.d")
    public byte[] field1687;

    @ObfuscatedName("cq.u")
    public byte[] field1688;

    @ObfuscatedName("cq.p")
    public byte[] field1689;

    @ObfuscatedName("cq.t")
    public short[] field1678;

    @ObfuscatedName("cq.g")
    public short[] field1691;

    @ObfuscatedName("cq.o")
    public byte field1692 = 0;

    @ObfuscatedName("cq.x")
    public int field1713;

    @ObfuscatedName("cq.c")
    public byte[] field1711;

    @ObfuscatedName("cq.b")
    public short[] field1695;

    @ObfuscatedName("cq.f")
    public short[] field1712;

    @ObfuscatedName("cq.s")
    public short[] field1697;

    @ObfuscatedName("cq.y")
    public short[] field1698;

    @ObfuscatedName("cq.r")
    public short[] field1699;

    @ObfuscatedName("cq.l")
    public short[] field1700;

    @ObfuscatedName("cq.n")
    public short[] field1701;

    @ObfuscatedName("cq.h")
    public short[] field1702;

    @ObfuscatedName("cq.v")
    public short[] field1721;

    @ObfuscatedName("cq.ax")
    public byte[] field1704;

    @ObfuscatedName("cq.ao")
    public int[] field1690;

    @ObfuscatedName("cq.al")
    public int[] field1706;

    @ObfuscatedName("cq.ap")
    public int[][] field1707;

    @ObfuscatedName("cq.ak")
    public int[][] field1708;

    @ObfuscatedName("cq.aw")
    public class93[] field1709;

    @ObfuscatedName("cq.av")
    public class92[] field1710;

    @ObfuscatedName("cq.ah")
    public class92[] field1714;

    @ObfuscatedName("cq.ae")
    public short field1684;

    @ObfuscatedName("cq.am")
    public short field1681;

    @ObfuscatedName("cq.aq")
    public boolean field1703 = false;

    @ObfuscatedName("cq.ai")
    public int field1715;

    @ObfuscatedName("cq.an")
    public int field1694;

    @ObfuscatedName("cq.aa")
    public int field1719;

    @ObfuscatedName("cq.ad")
    public int field1696;

    @ObfuscatedName("cq.az")
    public int field1724;

    @ObfuscatedName("cq.ar")
    public static int[] field1720 = new int[10000];

    @ObfuscatedName("cq.at")
    public static int[] field1693 = new int[10000];

    @ObfuscatedName("cq.af")
    public static int field1722 = 0;

    @ObfuscatedName("cq.ay")
    public static int[] field1723 = class105.field1755;

    @ObfuscatedName("cq.as")
    public static int[] field1705 = class105.field1765;

    public class102() {
    }

    @ObfuscatedName("cq.e(Lea;II)Lcq;")
    public static class102 method2051(class155 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3069(arg1, arg2);
        return var3 == null ? null : new class102(var3);
    }

    public class102(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2052(arg0);
        } else {
            this.method2085(arg0);
        }
    }

    @ObfuscatedName("cq.k([B)V")
    public void method2052(byte[] arg0) {
        class128 var2 = new class128(arg0);
        class128 var3 = new class128(arg0);
        class128 var4 = new class128(arg0);
        class128 var5 = new class128(arg0);
        class128 var6 = new class128(arg0);
        class128 var7 = new class128(arg0);
        class128 var8 = new class128(arg0);
        var2.field2045 = arg0.length - 23;
        int var9 = var2.method2456();
        int var10 = var2.method2456();
        int var11 = var2.method2548();
        int var12 = var2.method2548();
        int var13 = var2.method2548();
        int var14 = var2.method2548();
        int var15 = var2.method2548();
        int var16 = var2.method2548();
        int var17 = var2.method2548();
        int var18 = var2.method2456();
        int var19 = var2.method2456();
        int var20 = var2.method2456();
        int var21 = var2.method2456();
        int var22 = var2.method2456();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1711 = new byte[var11];
            var2.field2045 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1711[var26] = var2.method2455();
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
        this.field1716 = var9;
        this.field1682 = var10;
        this.field1713 = var11;
        this.field1679 = new int[var9];
        this.field1680 = new int[var9];
        this.field1717 = new int[var9];
        this.field1683 = new int[var10];
        this.field1718 = new int[var10];
        this.field1685 = new int[var10];
        if (var17 == 1) {
            this.field1690 = new int[var9];
        }
        if (var12 == 1) {
            this.field1686 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1687 = new byte[var10];
        } else {
            this.field1692 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1688 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1706 = new int[var10];
        }
        if (var16 == 1) {
            this.field1691 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1689 = new byte[var10];
        }
        this.field1678 = new short[var10];
        if (var11 > 0) {
            this.field1695 = new short[var11];
            this.field1712 = new short[var11];
            this.field1697 = new short[var11];
            if (var24 > 0) {
                this.field1698 = new short[var24];
                this.field1699 = new short[var24];
                this.field1700 = new short[var24];
                this.field1701 = new short[var24];
                this.field1704 = new byte[var24];
                this.field1702 = new short[var24];
            }
            if (var25 > 0) {
                this.field1721 = new short[var25];
            }
        }
        var2.field2045 = var11;
        var3.field2045 = var44;
        var4.field2045 = var46;
        var5.field2045 = var48;
        var6.field2045 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2548();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2478();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2478();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2478();
            }
            this.field1679[var67] = var64 + var69;
            this.field1680[var67] = var65 + var70;
            this.field1717[var67] = var66 + var71;
            var64 = this.field1679[var67];
            var65 = this.field1680[var67];
            var66 = this.field1717[var67];
            if (var17 == 1) {
                this.field1690[var67] = var6.method2548();
            }
        }
        var2.field2045 = var42;
        var3.field2045 = var31;
        var4.field2045 = var34;
        var5.field2045 = var37;
        var6.field2045 = var35;
        var7.field2045 = var40;
        var8.field2045 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1678[var72] = (short) var2.method2456();
            if (var12 == 1) {
                this.field1686[var72] = var3.method2455();
            }
            if (var13 == 255) {
                this.field1687[var72] = var4.method2455();
            }
            if (var14 == 1) {
                this.field1688[var72] = var5.method2455();
            }
            if (var15 == 1) {
                this.field1706[var72] = var6.method2548();
            }
            if (var16 == 1) {
                this.field1691[var72] = (short) (var7.method2456() - 1);
            }
            if (this.field1689 != null && this.field1691[var72] != -1) {
                this.field1689[var72] = (byte) (var8.method2548() - 1);
            }
        }
        var2.field2045 = var33;
        var3.field2045 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2548();
            if (var78 == 1) {
                var73 = var2.method2478() + var76;
                var74 = var2.method2478() + var73;
                var75 = var2.method2478() + var74;
                var76 = var75;
                this.field1683[var77] = var73;
                this.field1718[var77] = var74;
                this.field1685[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2478() + var76;
                var76 = var75;
                this.field1683[var77] = var73;
                this.field1718[var77] = var74;
                this.field1685[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2478() + var76;
                var76 = var75;
                this.field1683[var77] = var73;
                this.field1718[var77] = var74;
                this.field1685[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2478() + var76;
                var76 = var75;
                this.field1683[var77] = var73;
                this.field1718[var77] = var81;
                this.field1685[var77] = var75;
            }
        }
        var2.field2045 = var50;
        var3.field2045 = var52;
        var4.field2045 = var54;
        var5.field2045 = var56;
        var6.field2045 = var58;
        var7.field2045 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1711[var82] & 0xFF;
            if (var83 == 0) {
                this.field1695[var82] = (short) var2.method2456();
                this.field1712[var82] = (short) var2.method2456();
                this.field1697[var82] = (short) var2.method2456();
            }
            if (var83 == 1) {
                this.field1695[var82] = (short) var3.method2456();
                this.field1712[var82] = (short) var3.method2456();
                this.field1697[var82] = (short) var3.method2456();
                this.field1698[var82] = (short) var4.method2456();
                this.field1699[var82] = (short) var4.method2456();
                this.field1700[var82] = (short) var4.method2456();
                this.field1701[var82] = (short) var5.method2456();
                this.field1704[var82] = var6.method2455();
                this.field1702[var82] = (short) var7.method2456();
            }
            if (var83 == 2) {
                this.field1695[var82] = (short) var3.method2456();
                this.field1712[var82] = (short) var3.method2456();
                this.field1697[var82] = (short) var3.method2456();
                this.field1698[var82] = (short) var4.method2456();
                this.field1699[var82] = (short) var4.method2456();
                this.field1700[var82] = (short) var4.method2456();
                this.field1701[var82] = (short) var5.method2456();
                this.field1704[var82] = var6.method2455();
                this.field1702[var82] = (short) var7.method2456();
                this.field1721[var82] = (short) var7.method2456();
            }
            if (var83 == 3) {
                this.field1695[var82] = (short) var3.method2456();
                this.field1712[var82] = (short) var3.method2456();
                this.field1697[var82] = (short) var3.method2456();
                this.field1698[var82] = (short) var4.method2456();
                this.field1699[var82] = (short) var4.method2456();
                this.field1700[var82] = (short) var4.method2456();
                this.field1701[var82] = (short) var5.method2456();
                this.field1704[var82] = var6.method2455();
                this.field1702[var82] = (short) var7.method2456();
            }
        }
        var2.field2045 = var62;
        int var84 = var2.method2548();
        if (var84 == 0) {
            return;
        }
        new class104();
        var2.method2456();
        var2.method2456();
        var2.method2456();
        var2.method2592();
    }

    @ObfuscatedName("cq.q([B)V")
    public void method2085(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class128 var4 = new class128(arg0);
        class128 var5 = new class128(arg0);
        class128 var6 = new class128(arg0);
        class128 var7 = new class128(arg0);
        class128 var8 = new class128(arg0);
        var4.field2045 = arg0.length - 18;
        int var9 = var4.method2456();
        int var10 = var4.method2456();
        int var11 = var4.method2548();
        int var12 = var4.method2548();
        int var13 = var4.method2548();
        int var14 = var4.method2548();
        int var15 = var4.method2548();
        int var16 = var4.method2548();
        int var17 = var4.method2456();
        int var18 = var4.method2456();
        int var19 = var4.method2456();
        int var20 = var4.method2456();
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
        this.field1716 = var9;
        this.field1682 = var10;
        this.field1713 = var11;
        this.field1679 = new int[var9];
        this.field1680 = new int[var9];
        this.field1717 = new int[var9];
        this.field1683 = new int[var10];
        this.field1718 = new int[var10];
        this.field1685 = new int[var10];
        if (var11 > 0) {
            this.field1711 = new byte[var11];
            this.field1695 = new short[var11];
            this.field1712 = new short[var11];
            this.field1697 = new short[var11];
        }
        if (var16 == 1) {
            this.field1690 = new int[var9];
        }
        if (var12 == 1) {
            this.field1686 = new byte[var10];
            this.field1689 = new byte[var10];
            this.field1691 = new short[var10];
        }
        if (var13 == 255) {
            this.field1687 = new byte[var10];
        } else {
            this.field1692 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1688 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1706 = new int[var10];
        }
        this.field1678 = new short[var10];
        var4.field2045 = var21;
        var5.field2045 = var36;
        var6.field2045 = var38;
        var7.field2045 = var40;
        var8.field2045 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2548();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2478();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2478();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2478();
            }
            this.field1679[var46] = var43 + var48;
            this.field1680[var46] = var44 + var49;
            this.field1717[var46] = var45 + var50;
            var43 = this.field1679[var46];
            var44 = this.field1680[var46];
            var45 = this.field1717[var46];
            if (var16 == 1) {
                this.field1690[var46] = var8.method2548();
            }
        }
        var4.field2045 = var32;
        var5.field2045 = var28;
        var6.field2045 = var26;
        var7.field2045 = var30;
        var8.field2045 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1678[var51] = (short) var4.method2456();
            if (var12 == 1) {
                int var52 = var5.method2548();
                if ((var52 & 0x1) == 1) {
                    this.field1686[var51] = 1;
                    var2 = true;
                } else {
                    this.field1686[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1689[var51] = (byte) (var52 >> 2);
                    this.field1691[var51] = this.field1678[var51];
                    this.field1678[var51] = 127;
                    if (this.field1691[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1689[var51] = -1;
                    this.field1691[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1687[var51] = var6.method2455();
            }
            if (var14 == 1) {
                this.field1688[var51] = var7.method2455();
            }
            if (var15 == 1) {
                this.field1706[var51] = var8.method2548();
            }
        }
        var4.field2045 = var25;
        var5.field2045 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2548();
            if (var58 == 1) {
                var53 = var4.method2478() + var56;
                var54 = var4.method2478() + var53;
                var55 = var4.method2478() + var54;
                var56 = var55;
                this.field1683[var57] = var53;
                this.field1718[var57] = var54;
                this.field1685[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2478() + var56;
                var56 = var55;
                this.field1683[var57] = var53;
                this.field1718[var57] = var54;
                this.field1685[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2478() + var56;
                var56 = var55;
                this.field1683[var57] = var53;
                this.field1718[var57] = var54;
                this.field1685[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2478() + var56;
                var56 = var55;
                this.field1683[var57] = var53;
                this.field1718[var57] = var61;
                this.field1685[var57] = var55;
            }
        }
        var4.field2045 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1711[var62] = 0;
            this.field1695[var62] = (short) var4.method2456();
            this.field1712[var62] = (short) var4.method2456();
            this.field1697[var62] = (short) var4.method2456();
        }
        if (this.field1689 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1689[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1695[var65] & 0xFFFF) == this.field1683[var64] && (this.field1712[var65] & 0xFFFF) == this.field1718[var64] && (this.field1697[var65] & 0xFFFF) == this.field1685[var64]) {
                        this.field1689[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1689 = null;
            }
        }
        if (!var3) {
            this.field1691 = null;
        }
        if (!var2) {
            this.field1686 = null;
        }
    }

    public class102(class102[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1716 = 0;
        this.field1682 = 0;
        this.field1713 = 0;
        this.field1692 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class102 var10 = arg0[var9];
            if (var10 != null) {
                this.field1716 += var10.field1716;
                this.field1682 += var10.field1682;
                this.field1713 += var10.field1713;
                if (var10.field1687 == null) {
                    if (this.field1692 == -1) {
                        this.field1692 = var10.field1692;
                    }
                    if (this.field1692 != var10.field1692) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1686 != null;
                var5 |= var10.field1688 != null;
                var6 |= var10.field1706 != null;
                var7 |= var10.field1691 != null;
                var8 |= var10.field1689 != null;
            }
        }
        this.field1679 = new int[this.field1716];
        this.field1680 = new int[this.field1716];
        this.field1717 = new int[this.field1716];
        this.field1690 = new int[this.field1716];
        this.field1683 = new int[this.field1682];
        this.field1718 = new int[this.field1682];
        this.field1685 = new int[this.field1682];
        if (var3) {
            this.field1686 = new byte[this.field1682];
        }
        if (var4) {
            this.field1687 = new byte[this.field1682];
        }
        if (var5) {
            this.field1688 = new byte[this.field1682];
        }
        if (var6) {
            this.field1706 = new int[this.field1682];
        }
        if (var7) {
            this.field1691 = new short[this.field1682];
        }
        if (var8) {
            this.field1689 = new byte[this.field1682];
        }
        this.field1678 = new short[this.field1682];
        if (this.field1713 > 0) {
            this.field1711 = new byte[this.field1713];
            this.field1695 = new short[this.field1713];
            this.field1712 = new short[this.field1713];
            this.field1697 = new short[this.field1713];
            this.field1698 = new short[this.field1713];
            this.field1699 = new short[this.field1713];
            this.field1700 = new short[this.field1713];
            this.field1701 = new short[this.field1713];
            this.field1704 = new byte[this.field1713];
            this.field1702 = new short[this.field1713];
            this.field1721 = new short[this.field1713];
        }
        this.field1716 = 0;
        this.field1682 = 0;
        this.field1713 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class102 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1682; var13++) {
                    if (var3 && var12.field1686 != null) {
                        this.field1686[this.field1682] = var12.field1686[var13];
                    }
                    if (var4) {
                        if (var12.field1687 == null) {
                            this.field1687[this.field1682] = var12.field1692;
                        } else {
                            this.field1687[this.field1682] = var12.field1687[var13];
                        }
                    }
                    if (var5 && var12.field1688 != null) {
                        this.field1688[this.field1682] = var12.field1688[var13];
                    }
                    if (var6 && var12.field1706 != null) {
                        this.field1706[this.field1682] = var12.field1706[var13];
                    }
                    if (var7) {
                        if (var12.field1691 == null) {
                            this.field1691[this.field1682] = -1;
                        } else {
                            this.field1691[this.field1682] = var12.field1691[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1689 == null || var12.field1689[var13] == -1) {
                            this.field1689[this.field1682] = -1;
                        } else {
                            this.field1689[this.field1682] = (byte) (var12.field1689[var13] + this.field1713);
                        }
                    }
                    this.field1678[this.field1682] = var12.field1678[var13];
                    this.field1683[this.field1682] = this.method2053(var12, var12.field1683[var13]);
                    this.field1718[this.field1682] = this.method2053(var12, var12.field1718[var13]);
                    this.field1685[this.field1682] = this.method2053(var12, var12.field1685[var13]);
                    this.field1682++;
                }
                for (int var14 = 0; var14 < var12.field1713; var14++) {
                    byte var15 = this.field1711[this.field1713] = var12.field1711[var14];
                    if (var15 == 0) {
                        this.field1695[this.field1713] = (short) this.method2053(var12, var12.field1695[var14]);
                        this.field1712[this.field1713] = (short) this.method2053(var12, var12.field1712[var14]);
                        this.field1697[this.field1713] = (short) this.method2053(var12, var12.field1697[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1695[this.field1713] = var12.field1695[var14];
                        this.field1712[this.field1713] = var12.field1712[var14];
                        this.field1697[this.field1713] = var12.field1697[var14];
                        this.field1698[this.field1713] = var12.field1698[var14];
                        this.field1699[this.field1713] = var12.field1699[var14];
                        this.field1700[this.field1713] = var12.field1700[var14];
                        this.field1701[this.field1713] = var12.field1701[var14];
                        this.field1704[this.field1713] = var12.field1704[var14];
                        this.field1702[this.field1713] = var12.field1702[var14];
                    }
                    if (var15 == 2) {
                        this.field1721[this.field1713] = var12.field1721[var14];
                    }
                    this.field1713++;
                }
            }
        }
    }

    @ObfuscatedName("cq.j(Lcq;I)I")
    public final int method2053(class102 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1679[arg1];
        int var5 = arg0.field1680[arg1];
        int var6 = arg0.field1717[arg1];
        for (int var7 = 0; var7 < this.field1716; var7++) {
            if (this.field1679[var7] == var4 && this.field1680[var7] == var5 && this.field1717[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1679[this.field1716] = var4;
            this.field1680[this.field1716] = var5;
            this.field1717[this.field1716] = var6;
            if (arg0.field1690 != null) {
                this.field1690[this.field1716] = arg0.field1690[arg1];
            }
            var3 = this.field1716++;
        }
        return var3;
    }

    public class102(class102 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1716 = arg0.field1716;
        this.field1682 = arg0.field1682;
        this.field1713 = arg0.field1713;
        if (arg1) {
            this.field1679 = arg0.field1679;
            this.field1680 = arg0.field1680;
            this.field1717 = arg0.field1717;
        } else {
            this.field1679 = new int[this.field1716];
            this.field1680 = new int[this.field1716];
            this.field1717 = new int[this.field1716];
            for (int var6 = 0; var6 < this.field1716; var6++) {
                this.field1679[var6] = arg0.field1679[var6];
                this.field1680[var6] = arg0.field1680[var6];
                this.field1717[var6] = arg0.field1717[var6];
            }
        }
        if (arg2) {
            this.field1678 = arg0.field1678;
        } else {
            this.field1678 = new short[this.field1682];
            for (int var7 = 0; var7 < this.field1682; var7++) {
                this.field1678[var7] = arg0.field1678[var7];
            }
        }
        if (arg3 || arg0.field1691 == null) {
            this.field1691 = arg0.field1691;
        } else {
            this.field1691 = new short[this.field1682];
            for (int var8 = 0; var8 < this.field1682; var8++) {
                this.field1691[var8] = arg0.field1691[var8];
            }
        }
        if (arg4) {
            this.field1688 = arg0.field1688;
        } else {
            this.field1688 = new byte[this.field1682];
            if (arg0.field1688 == null) {
                for (int var9 = 0; var9 < this.field1682; var9++) {
                    this.field1688[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1682; var10++) {
                    this.field1688[var10] = arg0.field1688[var10];
                }
            }
        }
        this.field1683 = arg0.field1683;
        this.field1718 = arg0.field1718;
        this.field1685 = arg0.field1685;
        this.field1686 = arg0.field1686;
        this.field1687 = arg0.field1687;
        this.field1689 = arg0.field1689;
        this.field1692 = arg0.field1692;
        this.field1711 = arg0.field1711;
        this.field1695 = arg0.field1695;
        this.field1712 = arg0.field1712;
        this.field1697 = arg0.field1697;
        this.field1698 = arg0.field1698;
        this.field1699 = arg0.field1699;
        this.field1700 = arg0.field1700;
        this.field1701 = arg0.field1701;
        this.field1704 = arg0.field1704;
        this.field1702 = arg0.field1702;
        this.field1721 = arg0.field1721;
        this.field1690 = arg0.field1690;
        this.field1706 = arg0.field1706;
        this.field1707 = arg0.field1707;
        this.field1708 = arg0.field1708;
        this.field1710 = arg0.field1710;
        this.field1709 = arg0.field1709;
        this.field1714 = arg0.field1714;
        this.field1684 = arg0.field1684;
        this.field1681 = arg0.field1681;
    }

    @ObfuscatedName("cq.z()Lcq;")
    public class102 method2074() {
        class102 var1 = new class102();
        if (this.field1686 != null) {
            var1.field1686 = new byte[this.field1682];
            for (int var2 = 0; var2 < this.field1682; var2++) {
                var1.field1686[var2] = this.field1686[var2];
            }
        }
        var1.field1716 = this.field1716;
        var1.field1682 = this.field1682;
        var1.field1713 = this.field1713;
        var1.field1679 = this.field1679;
        var1.field1680 = this.field1680;
        var1.field1717 = this.field1717;
        var1.field1683 = this.field1683;
        var1.field1718 = this.field1718;
        var1.field1685 = this.field1685;
        var1.field1687 = this.field1687;
        var1.field1688 = this.field1688;
        var1.field1689 = this.field1689;
        var1.field1678 = this.field1678;
        var1.field1691 = this.field1691;
        var1.field1692 = this.field1692;
        var1.field1711 = this.field1711;
        var1.field1695 = this.field1695;
        var1.field1712 = this.field1712;
        var1.field1697 = this.field1697;
        var1.field1698 = this.field1698;
        var1.field1699 = this.field1699;
        var1.field1700 = this.field1700;
        var1.field1701 = this.field1701;
        var1.field1704 = this.field1704;
        var1.field1702 = this.field1702;
        var1.field1721 = this.field1721;
        var1.field1690 = this.field1690;
        var1.field1706 = this.field1706;
        var1.field1707 = this.field1707;
        var1.field1708 = this.field1708;
        var1.field1710 = this.field1710;
        var1.field1709 = this.field1709;
        var1.field1684 = this.field1684;
        var1.field1681 = this.field1681;
        return var1;
    }

    @ObfuscatedName("cq.w([[IIIIZI)Lcq;")
    public class102 method2093(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2056();
        int var7 = this.field1694 + arg1;
        int var8 = this.field1719 + arg1;
        int var9 = this.field1724 + arg3;
        int var10 = this.field1696 + arg3;
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
            var15.field1716 = this.field1716;
            var15.field1682 = this.field1682;
            var15.field1713 = this.field1713;
            var15.field1679 = this.field1679;
            var15.field1717 = this.field1717;
            var15.field1683 = this.field1683;
            var15.field1718 = this.field1718;
            var15.field1685 = this.field1685;
            var15.field1686 = this.field1686;
            var15.field1687 = this.field1687;
            var15.field1688 = this.field1688;
            var15.field1689 = this.field1689;
            var15.field1678 = this.field1678;
            var15.field1691 = this.field1691;
            var15.field1692 = this.field1692;
            var15.field1711 = this.field1711;
            var15.field1695 = this.field1695;
            var15.field1712 = this.field1712;
            var15.field1697 = this.field1697;
            var15.field1698 = this.field1698;
            var15.field1699 = this.field1699;
            var15.field1700 = this.field1700;
            var15.field1701 = this.field1701;
            var15.field1704 = this.field1704;
            var15.field1702 = this.field1702;
            var15.field1721 = this.field1721;
            var15.field1690 = this.field1690;
            var15.field1706 = this.field1706;
            var15.field1707 = this.field1707;
            var15.field1708 = this.field1708;
            var15.field1684 = this.field1684;
            var15.field1681 = this.field1681;
            var15.field1680 = new int[var15.field1716];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1716; var16++) {
                int var17 = this.field1679[var16] + arg1;
                int var18 = this.field1717[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1680[var16] = this.field1680[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1716; var26++) {
                int var27 = (-this.field1680[var26] << 16) / this.field1545;
                if (var27 < arg5) {
                    int var28 = this.field1679[var26] + arg1;
                    int var29 = this.field1717[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1680[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1680[var26];
                }
            }
        }
        var15.method2067();
        return var15;
    }

    @ObfuscatedName("cq.a()V")
    public void method2058() {
        int var10002;
        if (this.field1690 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1716; var3++) {
                int var4 = this.field1690[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1707 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1707[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1716) {
                int var7 = this.field1690[var6];
                this.field1707[var7][var1[var7]++] = var6++;
            }
            this.field1690 = null;
        }
        if (this.field1706 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1682; var10++) {
            int var11 = this.field1706[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1708 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1708[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1682) {
            int var14 = this.field1706[var13];
            this.field1708[var14][var8[var14]++] = var13++;
        }
        this.field1706 = null;
    }

    @ObfuscatedName("cq.d()V")
    public void method2119() {
        for (int var1 = 0; var1 < this.field1716; var1++) {
            int var2 = this.field1679[var1];
            this.field1679[var1] = this.field1717[var1];
            this.field1717[var1] = -var2;
        }
        this.method2067();
    }

    @ObfuscatedName("cq.u()V")
    public void method2059() {
        for (int var1 = 0; var1 < this.field1716; var1++) {
            this.field1679[var1] = -this.field1679[var1];
            this.field1717[var1] = -this.field1717[var1];
        }
        this.method2067();
    }

    @ObfuscatedName("cq.p()V")
    public void method2060() {
        for (int var1 = 0; var1 < this.field1716; var1++) {
            int var2 = this.field1717[var1];
            this.field1717[var1] = this.field1679[var1];
            this.field1679[var1] = -var2;
        }
        this.method2067();
    }

    @ObfuscatedName("cq.t(I)V")
    public void method2064(int arg0) {
        int var2 = field1723[arg0];
        int var3 = field1705[arg0];
        for (int var4 = 0; var4 < this.field1716; var4++) {
            int var5 = this.field1717[var4] * var2 + this.field1679[var4] * var3 >> 16;
            this.field1717[var4] = this.field1717[var4] * var3 - this.field1679[var4] * var2 >> 16;
            this.field1679[var4] = var5;
        }
        this.method2067();
    }

    @ObfuscatedName("cq.g(III)V")
    public void method2077(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1716; var4++) {
            this.field1679[var4] += arg0;
            this.field1680[var4] += arg1;
            this.field1717[var4] += arg2;
        }
        this.method2067();
    }

    @ObfuscatedName("cq.o(SS)V")
    public void method2063(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1682; var3++) {
            if (this.field1678[var3] == arg0) {
                this.field1678[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cq.x(SS)V")
    public void method2104(short arg0, short arg1) {
        if (this.field1691 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1682; var3++) {
            if (this.field1691[var3] == arg0) {
                this.field1691[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cq.c()V")
    public void method2061() {
        for (int var1 = 0; var1 < this.field1716; var1++) {
            this.field1717[var1] = -this.field1717[var1];
        }
        for (int var2 = 0; var2 < this.field1682; var2++) {
            int var3 = this.field1683[var2];
            this.field1683[var2] = this.field1685[var2];
            this.field1685[var2] = var3;
        }
        this.method2067();
    }

    @ObfuscatedName("cq.b(III)V")
    public void method2065(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1716; var4++) {
            this.field1679[var4] = this.field1679[var4] * arg0 / 128;
            this.field1680[var4] = this.field1680[var4] * arg1 / 128;
            this.field1717[var4] = this.field1717[var4] * arg2 / 128;
        }
        this.method2067();
    }

    @ObfuscatedName("cq.f()V")
    public void method2066() {
        if (this.field1710 != null) {
            return;
        }
        this.field1710 = new class92[this.field1716];
        for (int var1 = 0; var1 < this.field1716; var1++) {
            this.field1710[var1] = new class92();
        }
        for (int var2 = 0; var2 < this.field1682; var2++) {
            int var3 = this.field1683[var2];
            int var4 = this.field1718[var2];
            int var5 = this.field1685[var2];
            int var6 = this.field1679[var4] - this.field1679[var3];
            int var7 = this.field1680[var4] - this.field1680[var3];
            int var8 = this.field1717[var4] - this.field1717[var3];
            int var9 = this.field1679[var5] - this.field1679[var3];
            int var10 = this.field1680[var5] - this.field1680[var3];
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
            if (this.field1686 == null) {
                var19 = 0;
            } else {
                var19 = this.field1686[var2];
            }
            if (var19 == 0) {
                class92 var20 = this.field1710[var3];
                var20.field1507 += var16;
                var20.field1503 += var17;
                var20.field1504 += var18;
                var20.field1509++;
                class92 var21 = this.field1710[var4];
                var21.field1507 += var16;
                var21.field1503 += var17;
                var21.field1504 += var18;
                var21.field1509++;
                class92 var22 = this.field1710[var5];
                var22.field1507 += var16;
                var22.field1503 += var17;
                var22.field1504 += var18;
                var22.field1509++;
            } else if (var19 == 1) {
                if (this.field1709 == null) {
                    this.field1709 = new class93[this.field1682];
                }
                class93 var23 = this.field1709[var2] = new class93();
                var23.field1521 = var16;
                var23.field1512 = var17;
                var23.field1518 = var18;
            }
        }
    }

    @ObfuscatedName("cq.s()V")
    public void method2067() {
        this.field1710 = null;
        this.field1714 = null;
        this.field1709 = null;
        this.field1703 = false;
    }

    @ObfuscatedName("cq.y()V")
    public void method2056() {
        if (this.field1703) {
            return;
        }
        this.field1545 = 0;
        this.field1715 = 0;
        this.field1694 = 999999;
        this.field1719 = -999999;
        this.field1696 = -99999;
        this.field1724 = 99999;
        for (int var1 = 0; var1 < this.field1716; var1++) {
            int var2 = this.field1679[var1];
            int var3 = this.field1680[var1];
            int var4 = this.field1717[var1];
            if (var2 < this.field1694) {
                this.field1694 = var2;
            }
            if (var2 > this.field1719) {
                this.field1719 = var2;
            }
            if (var4 < this.field1724) {
                this.field1724 = var4;
            }
            if (var4 > this.field1696) {
                this.field1696 = var4;
            }
            if (-var3 > this.field1545) {
                this.field1545 = -var3;
            }
            if (var3 > this.field1715) {
                this.field1715 = var3;
            }
        }
        this.field1703 = true;
    }

    @ObfuscatedName("cq.r(Lcq;Lcq;IIIZ)V")
    public static void method2076(class102 arg0, class102 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2056();
        arg0.method2066();
        arg1.method2056();
        arg1.method2066();
        field1722++;
        int var6 = 0;
        int[] var7 = arg1.field1679;
        int var8 = arg1.field1716;
        for (int var9 = 0; var9 < arg0.field1716; var9++) {
            class92 var10 = arg0.field1710[var9];
            if (var10.field1509 != 0) {
                int var11 = arg0.field1680[var9] - arg3;
                if (var11 <= arg1.field1715) {
                    int var12 = arg0.field1679[var9] - arg2;
                    if (var12 >= arg1.field1694 && var12 <= arg1.field1719) {
                        int var13 = arg0.field1717[var9] - arg4;
                        if (var13 >= arg1.field1724 && var13 <= arg1.field1696) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class92 var15 = arg1.field1710[var14];
                                if (var7[var14] == var12 && arg1.field1717[var14] == var13 && arg1.field1680[var14] == var11 && var15.field1509 != 0) {
                                    if (arg0.field1714 == null) {
                                        arg0.field1714 = new class92[arg0.field1716];
                                    }
                                    if (arg1.field1714 == null) {
                                        arg1.field1714 = new class92[var8];
                                    }
                                    class92 var16 = arg0.field1714[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1714[var9] = new class92(var10);
                                    }
                                    class92 var17 = arg1.field1714[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1714[var14] = new class92(var15);
                                    }
                                    var16.field1507 += var15.field1507;
                                    var16.field1503 += var15.field1503;
                                    var16.field1504 += var15.field1504;
                                    var16.field1509 += var15.field1509;
                                    var17.field1507 += var10.field1507;
                                    var17.field1503 += var10.field1503;
                                    var17.field1504 += var10.field1504;
                                    var17.field1509 += var10.field1509;
                                    var6++;
                                    field1720[var9] = field1722;
                                    field1693[var14] = field1722;
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
        for (int var18 = 0; var18 < arg0.field1682; var18++) {
            if (field1720[arg0.field1683[var18]] == field1722 && field1720[arg0.field1718[var18]] == field1722 && field1720[arg0.field1685[var18]] == field1722) {
                if (arg0.field1686 == null) {
                    arg0.field1686 = new byte[arg0.field1682];
                }
                arg0.field1686[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1682; var19++) {
            if (field1693[arg1.field1683[var19]] == field1722 && field1693[arg1.field1718[var19]] == field1722 && field1693[arg1.field1685[var19]] == field1722) {
                if (arg1.field1686 == null) {
                    arg1.field1686 = new byte[arg1.field1682];
                }
                arg1.field1686[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cq.l(IIIII)Ldo;")
    public final class113 method2054(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2066();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class113 var8 = new class113();
        var8.field1867 = new int[this.field1682];
        var8.field1868 = new int[this.field1682];
        var8.field1899 = new int[this.field1682];
        if (this.field1713 > 0 && this.field1689 != null) {
            int[] var9 = new int[this.field1713];
            for (int var10 = 0; var10 < this.field1682; var10++) {
                if (this.field1689[var10] != -1) {
                    var9[this.field1689[var10] & 0xFF]++;
                }
            }
            var8.field1875 = 0;
            for (int var11 = 0; var11 < this.field1713; var11++) {
                if (var9[var11] > 0 && this.field1711[var11] == 0) {
                    var8.field1875++;
                }
            }
            var8.field1876 = new int[var8.field1875];
            var8.field1877 = new int[var8.field1875];
            var8.field1878 = new int[var8.field1875];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1713; var13++) {
                if (var9[var13] > 0 && this.field1711[var13] == 0) {
                    var8.field1876[var12] = this.field1695[var13] & 0xFFFF;
                    var8.field1877[var12] = this.field1712[var13] & 0xFFFF;
                    var8.field1878[var12] = this.field1697[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1872 = new byte[this.field1682];
            for (int var14 = 0; var14 < this.field1682; var14++) {
                if (this.field1689[var14] == -1) {
                    var8.field1872[var14] = -1;
                } else {
                    var8.field1872[var14] = (byte) var9[this.field1689[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1682; var15++) {
            byte var16;
            if (this.field1686 == null) {
                var16 = 0;
            } else {
                var16 = this.field1686[var15];
            }
            byte var17;
            if (this.field1688 == null) {
                var17 = 0;
            } else {
                var17 = this.field1688[var15];
            }
            short var18;
            if (this.field1691 == null) {
                var18 = -1;
            } else {
                var18 = this.field1691[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1678[var15] & 0xFFFF;
                    class92 var20;
                    if (this.field1714 == null || this.field1714[this.field1683[var15]] == null) {
                        var20 = this.field1710[this.field1683[var15]];
                    } else {
                        var20 = this.field1714[this.field1683[var15]];
                    }
                    int var21 = (var20.field1504 * arg4 + var20.field1507 * arg2 + var20.field1503 * arg3) / (var20.field1509 * var7) + arg0;
                    var8.field1867[var15] = method2073(var19, var21);
                    class92 var22;
                    if (this.field1714 == null || this.field1714[this.field1718[var15]] == null) {
                        var22 = this.field1710[this.field1718[var15]];
                    } else {
                        var22 = this.field1714[this.field1718[var15]];
                    }
                    int var23 = (var22.field1504 * arg4 + var22.field1507 * arg2 + var22.field1503 * arg3) / (var22.field1509 * var7) + arg0;
                    var8.field1868[var15] = method2073(var19, var23);
                    class92 var24;
                    if (this.field1714 == null || this.field1714[this.field1685[var15]] == null) {
                        var24 = this.field1710[this.field1685[var15]];
                    } else {
                        var24 = this.field1714[this.field1685[var15]];
                    }
                    int var25 = (var24.field1504 * arg4 + var24.field1507 * arg2 + var24.field1503 * arg3) / (var24.field1509 * var7) + arg0;
                    var8.field1899[var15] = method2073(var19, var25);
                } else if (var16 == 1) {
                    class93 var26 = this.field1709[var15];
                    int var27 = (var26.field1518 * arg4 + var26.field1521 * arg2 + var26.field1512 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1867[var15] = method2073(this.field1678[var15] & 0xFFFF, var27);
                    var8.field1899[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1867[var15] = 128;
                    var8.field1899[var15] = -1;
                } else {
                    var8.field1899[var15] = -2;
                }
            } else if (var16 == 0) {
                class92 var28;
                if (this.field1714 == null || this.field1714[this.field1683[var15]] == null) {
                    var28 = this.field1710[this.field1683[var15]];
                } else {
                    var28 = this.field1714[this.field1683[var15]];
                }
                int var29 = (var28.field1504 * arg4 + var28.field1507 * arg2 + var28.field1503 * arg3) / (var28.field1509 * var7) + arg0;
                var8.field1867[var15] = method2072(var29);
                class92 var30;
                if (this.field1714 == null || this.field1714[this.field1718[var15]] == null) {
                    var30 = this.field1710[this.field1718[var15]];
                } else {
                    var30 = this.field1714[this.field1718[var15]];
                }
                int var31 = (var30.field1504 * arg4 + var30.field1507 * arg2 + var30.field1503 * arg3) / (var30.field1509 * var7) + arg0;
                var8.field1868[var15] = method2072(var31);
                class92 var32;
                if (this.field1714 == null || this.field1714[this.field1685[var15]] == null) {
                    var32 = this.field1710[this.field1685[var15]];
                } else {
                    var32 = this.field1714[this.field1685[var15]];
                }
                int var33 = (var32.field1504 * arg4 + var32.field1507 * arg2 + var32.field1503 * arg3) / (var32.field1509 * var7) + arg0;
                var8.field1899[var15] = method2072(var33);
            } else if (var16 == 1) {
                class93 var34 = this.field1709[var15];
                int var35 = (var34.field1518 * arg4 + var34.field1521 * arg2 + var34.field1512 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1867[var15] = method2072(var35);
                var8.field1899[var15] = -1;
            } else {
                var8.field1899[var15] = -2;
            }
        }
        this.method2058();
        var8.field1859 = this.field1716;
        var8.field1860 = this.field1679;
        var8.field1861 = this.field1680;
        var8.field1908 = this.field1717;
        var8.field1862 = this.field1682;
        var8.field1863 = this.field1683;
        var8.field1865 = this.field1718;
        var8.field1866 = this.field1685;
        var8.field1870 = this.field1687;
        var8.field1871 = this.field1688;
        var8.field1898 = this.field1692;
        var8.field1880 = this.field1707;
        var8.field1873 = this.field1708;
        var8.field1869 = this.field1691;
        return var8;
    }

    @ObfuscatedName("cq.n(II)I")
    public static final int method2073(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cq.h(I)I")
    public static final int method2072(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
