package deob;

@ObfuscatedName("ct")
public class class101 extends class86 {

    @ObfuscatedName("ct.f")
    public int field1713 = 0;

    @ObfuscatedName("ct.u")
    public int[] field1698;

    @ObfuscatedName("ct.x")
    public int[] field1714;

    @ObfuscatedName("ct.b")
    public int[] field1692;

    @ObfuscatedName("ct.l")
    public int field1691 = 0;

    @ObfuscatedName("ct.d")
    public int[] field1694;

    @ObfuscatedName("ct.n")
    public int[] field1695;

    @ObfuscatedName("ct.m")
    public int[] field1696;

    @ObfuscatedName("ct.g")
    public byte[] field1697;

    @ObfuscatedName("ct.s")
    public byte[] field1722;

    @ObfuscatedName("ct.r")
    public byte[] field1699;

    @ObfuscatedName("ct.k")
    public byte[] field1700;

    @ObfuscatedName("ct.o")
    public short[] field1701;

    @ObfuscatedName("ct.q")
    public short[] field1702;

    @ObfuscatedName("ct.p")
    public byte field1724 = 0;

    @ObfuscatedName("ct.h")
    public int field1715;

    @ObfuscatedName("ct.e")
    public byte[] field1719;

    @ObfuscatedName("ct.t")
    public short[] field1706;

    @ObfuscatedName("ct.w")
    public short[] field1707;

    @ObfuscatedName("ct.v")
    public short[] field1708;

    @ObfuscatedName("ct.y")
    public short[] field1709;

    @ObfuscatedName("ct.c")
    public short[] field1693;

    @ObfuscatedName("ct.i")
    public short[] field1711;

    @ObfuscatedName("ct.a")
    public short[] field1712;

    @ObfuscatedName("ct.z")
    public short[] field1690;

    @ObfuscatedName("ct.j")
    public short[] field1704;

    @ObfuscatedName("ct.ag")
    public byte[] field1705;

    @ObfuscatedName("ct.ax")
    public int[] field1716;

    @ObfuscatedName("ct.ao")
    public int[] field1717;

    @ObfuscatedName("ct.ac")
    public int[][] field1718;

    @ObfuscatedName("ct.aj")
    public int[][] field1703;

    @ObfuscatedName("ct.an")
    public class85[] field1720;

    @ObfuscatedName("ct.al")
    public class97[] field1721;

    @ObfuscatedName("ct.as")
    public class97[] field1732;

    @ObfuscatedName("ct.av")
    public short field1710;

    @ObfuscatedName("ct.am")
    public short field1689;

    @ObfuscatedName("ct.az")
    public boolean field1725 = false;

    @ObfuscatedName("ct.ai")
    public int field1726;

    @ObfuscatedName("ct.aq")
    public int field1727;

    @ObfuscatedName("ct.ah")
    public int field1728;

    @ObfuscatedName("ct.ap")
    public int field1729;

    @ObfuscatedName("ct.af")
    public int field1730;

    @ObfuscatedName("ct.aa")
    public static int[] field1731 = new int[10000];

    @ObfuscatedName("ct.ay")
    public static int[] field1734 = new int[10000];

    @ObfuscatedName("ct.aw")
    public static int field1733 = 0;

    @ObfuscatedName("ct.ak")
    public static int[] field1723 = class92.field1598;

    @ObfuscatedName("ct.ae")
    public static int[] field1735 = class92.field1578;

    public class101() {
    }

    @ObfuscatedName("ct.f(Lfl;II)Lct;")
    public static class101 method2118(class168 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3061(arg1, arg2);
        return var3 == null ? null : new class101(var3);
    }

    public class101(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2109(arg0);
        } else {
            this.method2146(arg0);
        }
    }

    @ObfuscatedName("ct.u([B)V")
    public void method2109(byte[] arg0) {
        class120 var2 = new class120(arg0);
        class120 var3 = new class120(arg0);
        class120 var4 = new class120(arg0);
        class120 var5 = new class120(arg0);
        class120 var6 = new class120(arg0);
        class120 var7 = new class120(arg0);
        class120 var8 = new class120(arg0);
        var2.field1999 = arg0.length - 23;
        int var9 = var2.method2387();
        int var10 = var2.method2387();
        int var11 = var2.method2385();
        int var12 = var2.method2385();
        int var13 = var2.method2385();
        int var14 = var2.method2385();
        int var15 = var2.method2385();
        int var16 = var2.method2385();
        int var17 = var2.method2385();
        int var18 = var2.method2387();
        int var19 = var2.method2387();
        int var20 = var2.method2387();
        int var21 = var2.method2387();
        int var22 = var2.method2387();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1719 = new byte[var11];
            var2.field1999 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1719[var26] = var2.method2369();
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
        this.field1713 = var9;
        this.field1691 = var10;
        this.field1715 = var11;
        this.field1698 = new int[var9];
        this.field1714 = new int[var9];
        this.field1692 = new int[var9];
        this.field1694 = new int[var10];
        this.field1695 = new int[var10];
        this.field1696 = new int[var10];
        if (var17 == 1) {
            this.field1716 = new int[var9];
        }
        if (var12 == 1) {
            this.field1697 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1722 = new byte[var10];
        } else {
            this.field1724 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1699 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1717 = new int[var10];
        }
        if (var16 == 1) {
            this.field1702 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1700 = new byte[var10];
        }
        this.field1701 = new short[var10];
        if (var11 > 0) {
            this.field1706 = new short[var11];
            this.field1707 = new short[var11];
            this.field1708 = new short[var11];
            if (var24 > 0) {
                this.field1709 = new short[var24];
                this.field1693 = new short[var24];
                this.field1711 = new short[var24];
                this.field1712 = new short[var24];
                this.field1705 = new byte[var24];
                this.field1690 = new short[var24];
            }
            if (var25 > 0) {
                this.field1704 = new short[var25];
            }
        }
        var2.field1999 = var11;
        var3.field1999 = var44;
        var4.field1999 = var46;
        var5.field1999 = var48;
        var6.field1999 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2385();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2397();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2397();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2397();
            }
            this.field1698[var67] = var64 + var69;
            this.field1714[var67] = var65 + var70;
            this.field1692[var67] = var66 + var71;
            var64 = this.field1698[var67];
            var65 = this.field1714[var67];
            var66 = this.field1692[var67];
            if (var17 == 1) {
                this.field1716[var67] = var6.method2385();
            }
        }
        var2.field1999 = var42;
        var3.field1999 = var31;
        var4.field1999 = var34;
        var5.field1999 = var37;
        var6.field1999 = var35;
        var7.field1999 = var40;
        var8.field1999 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1701[var72] = (short) var2.method2387();
            if (var12 == 1) {
                this.field1697[var72] = var3.method2369();
            }
            if (var13 == 255) {
                this.field1722[var72] = var4.method2369();
            }
            if (var14 == 1) {
                this.field1699[var72] = var5.method2369();
            }
            if (var15 == 1) {
                this.field1717[var72] = var6.method2385();
            }
            if (var16 == 1) {
                this.field1702[var72] = (short) (var7.method2387() - 1);
            }
            if (this.field1700 != null && this.field1702[var72] != -1) {
                this.field1700[var72] = (byte) (var8.method2385() - 1);
            }
        }
        var2.field1999 = var33;
        var3.field1999 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2385();
            if (var78 == 1) {
                var73 = var2.method2397() + var76;
                var74 = var2.method2397() + var73;
                var75 = var2.method2397() + var74;
                var76 = var75;
                this.field1694[var77] = var73;
                this.field1695[var77] = var74;
                this.field1696[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2397() + var76;
                var76 = var75;
                this.field1694[var77] = var73;
                this.field1695[var77] = var74;
                this.field1696[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2397() + var76;
                var76 = var75;
                this.field1694[var77] = var73;
                this.field1695[var77] = var74;
                this.field1696[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2397() + var76;
                var76 = var75;
                this.field1694[var77] = var73;
                this.field1695[var77] = var81;
                this.field1696[var77] = var75;
            }
        }
        var2.field1999 = var50;
        var3.field1999 = var52;
        var4.field1999 = var54;
        var5.field1999 = var56;
        var6.field1999 = var58;
        var7.field1999 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1719[var82] & 0xFF;
            if (var83 == 0) {
                this.field1706[var82] = (short) var2.method2387();
                this.field1707[var82] = (short) var2.method2387();
                this.field1708[var82] = (short) var2.method2387();
            }
            if (var83 == 1) {
                this.field1706[var82] = (short) var3.method2387();
                this.field1707[var82] = (short) var3.method2387();
                this.field1708[var82] = (short) var3.method2387();
                this.field1709[var82] = (short) var4.method2387();
                this.field1693[var82] = (short) var4.method2387();
                this.field1711[var82] = (short) var4.method2387();
                this.field1712[var82] = (short) var5.method2387();
                this.field1705[var82] = var6.method2369();
                this.field1690[var82] = (short) var7.method2387();
            }
            if (var83 == 2) {
                this.field1706[var82] = (short) var3.method2387();
                this.field1707[var82] = (short) var3.method2387();
                this.field1708[var82] = (short) var3.method2387();
                this.field1709[var82] = (short) var4.method2387();
                this.field1693[var82] = (short) var4.method2387();
                this.field1711[var82] = (short) var4.method2387();
                this.field1712[var82] = (short) var5.method2387();
                this.field1705[var82] = var6.method2369();
                this.field1690[var82] = (short) var7.method2387();
                this.field1704[var82] = (short) var7.method2387();
            }
            if (var83 == 3) {
                this.field1706[var82] = (short) var3.method2387();
                this.field1707[var82] = (short) var3.method2387();
                this.field1708[var82] = (short) var3.method2387();
                this.field1709[var82] = (short) var4.method2387();
                this.field1693[var82] = (short) var4.method2387();
                this.field1711[var82] = (short) var4.method2387();
                this.field1712[var82] = (short) var5.method2387();
                this.field1705[var82] = var6.method2369();
                this.field1690[var82] = (short) var7.method2387();
            }
        }
        var2.field1999 = var62;
        int var84 = var2.method2385();
        if (var84 == 0) {
            return;
        }
        new class91();
        var2.method2387();
        var2.method2387();
        var2.method2387();
        var2.method2527();
    }

    @ObfuscatedName("ct.b([B)V")
    public void method2146(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class120 var4 = new class120(arg0);
        class120 var5 = new class120(arg0);
        class120 var6 = new class120(arg0);
        class120 var7 = new class120(arg0);
        class120 var8 = new class120(arg0);
        var4.field1999 = arg0.length - 18;
        int var9 = var4.method2387();
        int var10 = var4.method2387();
        int var11 = var4.method2385();
        int var12 = var4.method2385();
        int var13 = var4.method2385();
        int var14 = var4.method2385();
        int var15 = var4.method2385();
        int var16 = var4.method2385();
        int var17 = var4.method2387();
        int var18 = var4.method2387();
        int var19 = var4.method2387();
        int var20 = var4.method2387();
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
        this.field1713 = var9;
        this.field1691 = var10;
        this.field1715 = var11;
        this.field1698 = new int[var9];
        this.field1714 = new int[var9];
        this.field1692 = new int[var9];
        this.field1694 = new int[var10];
        this.field1695 = new int[var10];
        this.field1696 = new int[var10];
        if (var11 > 0) {
            this.field1719 = new byte[var11];
            this.field1706 = new short[var11];
            this.field1707 = new short[var11];
            this.field1708 = new short[var11];
        }
        if (var16 == 1) {
            this.field1716 = new int[var9];
        }
        if (var12 == 1) {
            this.field1697 = new byte[var10];
            this.field1700 = new byte[var10];
            this.field1702 = new short[var10];
        }
        if (var13 == 255) {
            this.field1722 = new byte[var10];
        } else {
            this.field1724 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1699 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1717 = new int[var10];
        }
        this.field1701 = new short[var10];
        var4.field1999 = var21;
        var5.field1999 = var36;
        var6.field1999 = var38;
        var7.field1999 = var40;
        var8.field1999 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2385();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2397();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2397();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2397();
            }
            this.field1698[var46] = var43 + var48;
            this.field1714[var46] = var44 + var49;
            this.field1692[var46] = var45 + var50;
            var43 = this.field1698[var46];
            var44 = this.field1714[var46];
            var45 = this.field1692[var46];
            if (var16 == 1) {
                this.field1716[var46] = var8.method2385();
            }
        }
        var4.field1999 = var32;
        var5.field1999 = var28;
        var6.field1999 = var26;
        var7.field1999 = var30;
        var8.field1999 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1701[var51] = (short) var4.method2387();
            if (var12 == 1) {
                int var52 = var5.method2385();
                if ((var52 & 0x1) == 1) {
                    this.field1697[var51] = 1;
                    var2 = true;
                } else {
                    this.field1697[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1700[var51] = (byte) (var52 >> 2);
                    this.field1702[var51] = this.field1701[var51];
                    this.field1701[var51] = 127;
                    if (this.field1702[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1700[var51] = -1;
                    this.field1702[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1722[var51] = var6.method2369();
            }
            if (var14 == 1) {
                this.field1699[var51] = var7.method2369();
            }
            if (var15 == 1) {
                this.field1717[var51] = var8.method2385();
            }
        }
        var4.field1999 = var25;
        var5.field1999 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2385();
            if (var58 == 1) {
                var53 = var4.method2397() + var56;
                var54 = var4.method2397() + var53;
                var55 = var4.method2397() + var54;
                var56 = var55;
                this.field1694[var57] = var53;
                this.field1695[var57] = var54;
                this.field1696[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2397() + var56;
                var56 = var55;
                this.field1694[var57] = var53;
                this.field1695[var57] = var54;
                this.field1696[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2397() + var56;
                var56 = var55;
                this.field1694[var57] = var53;
                this.field1695[var57] = var54;
                this.field1696[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2397() + var56;
                var56 = var55;
                this.field1694[var57] = var53;
                this.field1695[var57] = var61;
                this.field1696[var57] = var55;
            }
        }
        var4.field1999 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1719[var62] = 0;
            this.field1706[var62] = (short) var4.method2387();
            this.field1707[var62] = (short) var4.method2387();
            this.field1708[var62] = (short) var4.method2387();
        }
        if (this.field1700 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1700[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1706[var65] & 0xFFFF) == this.field1694[var64] && (this.field1707[var65] & 0xFFFF) == this.field1695[var64] && (this.field1708[var65] & 0xFFFF) == this.field1696[var64]) {
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
            this.field1702 = null;
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
        this.field1713 = 0;
        this.field1691 = 0;
        this.field1715 = 0;
        this.field1724 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class101 var10 = arg0[var9];
            if (var10 != null) {
                this.field1713 += var10.field1713;
                this.field1691 += var10.field1691;
                this.field1715 += var10.field1715;
                if (var10.field1722 == null) {
                    if (this.field1724 == -1) {
                        this.field1724 = var10.field1724;
                    }
                    if (this.field1724 != var10.field1724) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1697 != null;
                var5 |= var10.field1699 != null;
                var6 |= var10.field1717 != null;
                var7 |= var10.field1702 != null;
                var8 |= var10.field1700 != null;
            }
        }
        this.field1698 = new int[this.field1713];
        this.field1714 = new int[this.field1713];
        this.field1692 = new int[this.field1713];
        this.field1716 = new int[this.field1713];
        this.field1694 = new int[this.field1691];
        this.field1695 = new int[this.field1691];
        this.field1696 = new int[this.field1691];
        if (var3) {
            this.field1697 = new byte[this.field1691];
        }
        if (var4) {
            this.field1722 = new byte[this.field1691];
        }
        if (var5) {
            this.field1699 = new byte[this.field1691];
        }
        if (var6) {
            this.field1717 = new int[this.field1691];
        }
        if (var7) {
            this.field1702 = new short[this.field1691];
        }
        if (var8) {
            this.field1700 = new byte[this.field1691];
        }
        this.field1701 = new short[this.field1691];
        if (this.field1715 > 0) {
            this.field1719 = new byte[this.field1715];
            this.field1706 = new short[this.field1715];
            this.field1707 = new short[this.field1715];
            this.field1708 = new short[this.field1715];
            this.field1709 = new short[this.field1715];
            this.field1693 = new short[this.field1715];
            this.field1711 = new short[this.field1715];
            this.field1712 = new short[this.field1715];
            this.field1705 = new byte[this.field1715];
            this.field1690 = new short[this.field1715];
            this.field1704 = new short[this.field1715];
        }
        this.field1713 = 0;
        this.field1691 = 0;
        this.field1715 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class101 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1691; var13++) {
                    if (var3 && var12.field1697 != null) {
                        this.field1697[this.field1691] = var12.field1697[var13];
                    }
                    if (var4) {
                        if (var12.field1722 == null) {
                            this.field1722[this.field1691] = var12.field1724;
                        } else {
                            this.field1722[this.field1691] = var12.field1722[var13];
                        }
                    }
                    if (var5 && var12.field1699 != null) {
                        this.field1699[this.field1691] = var12.field1699[var13];
                    }
                    if (var6 && var12.field1717 != null) {
                        this.field1717[this.field1691] = var12.field1717[var13];
                    }
                    if (var7) {
                        if (var12.field1702 == null) {
                            this.field1702[this.field1691] = -1;
                        } else {
                            this.field1702[this.field1691] = var12.field1702[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1700 == null || var12.field1700[var13] == -1) {
                            this.field1700[this.field1691] = -1;
                        } else {
                            this.field1700[this.field1691] = (byte) (var12.field1700[var13] + this.field1715);
                        }
                    }
                    this.field1701[this.field1691] = var12.field1701[var13];
                    this.field1694[this.field1691] = this.method2112(var12, var12.field1694[var13]);
                    this.field1695[this.field1691] = this.method2112(var12, var12.field1695[var13]);
                    this.field1696[this.field1691] = this.method2112(var12, var12.field1696[var13]);
                    this.field1691++;
                }
                for (int var14 = 0; var14 < var12.field1715; var14++) {
                    byte var15 = this.field1719[this.field1715] = var12.field1719[var14];
                    if (var15 == 0) {
                        this.field1706[this.field1715] = (short) this.method2112(var12, var12.field1706[var14]);
                        this.field1707[this.field1715] = (short) this.method2112(var12, var12.field1707[var14]);
                        this.field1708[this.field1715] = (short) this.method2112(var12, var12.field1708[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1706[this.field1715] = var12.field1706[var14];
                        this.field1707[this.field1715] = var12.field1707[var14];
                        this.field1708[this.field1715] = var12.field1708[var14];
                        this.field1709[this.field1715] = var12.field1709[var14];
                        this.field1693[this.field1715] = var12.field1693[var14];
                        this.field1711[this.field1715] = var12.field1711[var14];
                        this.field1712[this.field1715] = var12.field1712[var14];
                        this.field1705[this.field1715] = var12.field1705[var14];
                        this.field1690[this.field1715] = var12.field1690[var14];
                    }
                    if (var15 == 2) {
                        this.field1704[this.field1715] = var12.field1704[var14];
                    }
                    this.field1715++;
                }
            }
        }
    }

    @ObfuscatedName("ct.l(Lct;I)I")
    public final int method2112(class101 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1698[arg1];
        int var5 = arg0.field1714[arg1];
        int var6 = arg0.field1692[arg1];
        for (int var7 = 0; var7 < this.field1713; var7++) {
            if (this.field1698[var7] == var4 && this.field1714[var7] == var5 && this.field1692[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1698[this.field1713] = var4;
            this.field1714[this.field1713] = var5;
            this.field1692[this.field1713] = var6;
            if (arg0.field1716 != null) {
                this.field1716[this.field1713] = arg0.field1716[arg1];
            }
            var3 = this.field1713++;
        }
        return var3;
    }

    public class101(class101 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1713 = arg0.field1713;
        this.field1691 = arg0.field1691;
        this.field1715 = arg0.field1715;
        if (arg1) {
            this.field1698 = arg0.field1698;
            this.field1714 = arg0.field1714;
            this.field1692 = arg0.field1692;
        } else {
            this.field1698 = new int[this.field1713];
            this.field1714 = new int[this.field1713];
            this.field1692 = new int[this.field1713];
            for (int var6 = 0; var6 < this.field1713; var6++) {
                this.field1698[var6] = arg0.field1698[var6];
                this.field1714[var6] = arg0.field1714[var6];
                this.field1692[var6] = arg0.field1692[var6];
            }
        }
        if (arg2) {
            this.field1701 = arg0.field1701;
        } else {
            this.field1701 = new short[this.field1691];
            for (int var7 = 0; var7 < this.field1691; var7++) {
                this.field1701[var7] = arg0.field1701[var7];
            }
        }
        if (arg3 || arg0.field1702 == null) {
            this.field1702 = arg0.field1702;
        } else {
            this.field1702 = new short[this.field1691];
            for (int var8 = 0; var8 < this.field1691; var8++) {
                this.field1702[var8] = arg0.field1702[var8];
            }
        }
        if (arg4) {
            this.field1699 = arg0.field1699;
        } else {
            this.field1699 = new byte[this.field1691];
            if (arg0.field1699 == null) {
                for (int var9 = 0; var9 < this.field1691; var9++) {
                    this.field1699[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1691; var10++) {
                    this.field1699[var10] = arg0.field1699[var10];
                }
            }
        }
        this.field1694 = arg0.field1694;
        this.field1695 = arg0.field1695;
        this.field1696 = arg0.field1696;
        this.field1697 = arg0.field1697;
        this.field1722 = arg0.field1722;
        this.field1700 = arg0.field1700;
        this.field1724 = arg0.field1724;
        this.field1719 = arg0.field1719;
        this.field1706 = arg0.field1706;
        this.field1707 = arg0.field1707;
        this.field1708 = arg0.field1708;
        this.field1709 = arg0.field1709;
        this.field1693 = arg0.field1693;
        this.field1711 = arg0.field1711;
        this.field1712 = arg0.field1712;
        this.field1705 = arg0.field1705;
        this.field1690 = arg0.field1690;
        this.field1704 = arg0.field1704;
        this.field1716 = arg0.field1716;
        this.field1717 = arg0.field1717;
        this.field1718 = arg0.field1718;
        this.field1703 = arg0.field1703;
        this.field1721 = arg0.field1721;
        this.field1720 = arg0.field1720;
        this.field1732 = arg0.field1732;
        this.field1710 = arg0.field1710;
        this.field1689 = arg0.field1689;
    }

    @ObfuscatedName("ct.d()Lct;")
    public class101 method2141() {
        class101 var1 = new class101();
        if (this.field1697 != null) {
            var1.field1697 = new byte[this.field1691];
            for (int var2 = 0; var2 < this.field1691; var2++) {
                var1.field1697[var2] = this.field1697[var2];
            }
        }
        var1.field1713 = this.field1713;
        var1.field1691 = this.field1691;
        var1.field1715 = this.field1715;
        var1.field1698 = this.field1698;
        var1.field1714 = this.field1714;
        var1.field1692 = this.field1692;
        var1.field1694 = this.field1694;
        var1.field1695 = this.field1695;
        var1.field1696 = this.field1696;
        var1.field1722 = this.field1722;
        var1.field1699 = this.field1699;
        var1.field1700 = this.field1700;
        var1.field1701 = this.field1701;
        var1.field1702 = this.field1702;
        var1.field1724 = this.field1724;
        var1.field1719 = this.field1719;
        var1.field1706 = this.field1706;
        var1.field1707 = this.field1707;
        var1.field1708 = this.field1708;
        var1.field1709 = this.field1709;
        var1.field1693 = this.field1693;
        var1.field1711 = this.field1711;
        var1.field1712 = this.field1712;
        var1.field1705 = this.field1705;
        var1.field1690 = this.field1690;
        var1.field1704 = this.field1704;
        var1.field1716 = this.field1716;
        var1.field1717 = this.field1717;
        var1.field1718 = this.field1718;
        var1.field1703 = this.field1703;
        var1.field1721 = this.field1721;
        var1.field1720 = this.field1720;
        var1.field1710 = this.field1710;
        var1.field1689 = this.field1689;
        return var1;
    }

    @ObfuscatedName("ct.n([[IIIIZI)Lct;")
    public class101 method2120(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2126();
        int var7 = this.field1727 + arg1;
        int var8 = this.field1728 + arg1;
        int var9 = this.field1730 + arg3;
        int var10 = this.field1729 + arg3;
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
            var15.field1713 = this.field1713;
            var15.field1691 = this.field1691;
            var15.field1715 = this.field1715;
            var15.field1698 = this.field1698;
            var15.field1692 = this.field1692;
            var15.field1694 = this.field1694;
            var15.field1695 = this.field1695;
            var15.field1696 = this.field1696;
            var15.field1697 = this.field1697;
            var15.field1722 = this.field1722;
            var15.field1699 = this.field1699;
            var15.field1700 = this.field1700;
            var15.field1701 = this.field1701;
            var15.field1702 = this.field1702;
            var15.field1724 = this.field1724;
            var15.field1719 = this.field1719;
            var15.field1706 = this.field1706;
            var15.field1707 = this.field1707;
            var15.field1708 = this.field1708;
            var15.field1709 = this.field1709;
            var15.field1693 = this.field1693;
            var15.field1711 = this.field1711;
            var15.field1712 = this.field1712;
            var15.field1705 = this.field1705;
            var15.field1690 = this.field1690;
            var15.field1704 = this.field1704;
            var15.field1716 = this.field1716;
            var15.field1717 = this.field1717;
            var15.field1718 = this.field1718;
            var15.field1703 = this.field1703;
            var15.field1710 = this.field1710;
            var15.field1689 = this.field1689;
            var15.field1714 = new int[var15.field1713];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1713; var16++) {
                int var17 = this.field1698[var16] + arg1;
                int var18 = this.field1692[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1714[var16] = this.field1714[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1713; var26++) {
                int var27 = (-this.field1714[var26] << 16) / this.field1469;
                if (var27 < arg5) {
                    int var28 = this.field1698[var26] + arg1;
                    int var29 = this.field1692[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1714[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1714[var26];
                }
            }
        }
        var15.method2125();
        return var15;
    }

    @ObfuscatedName("ct.m()V")
    public void method2115() {
        int var10002;
        if (this.field1716 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1713; var3++) {
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
            while (var6 < this.field1713) {
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
        for (int var10 = 0; var10 < this.field1691; var10++) {
            int var11 = this.field1717[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1703 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1703[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1691) {
            int var14 = this.field1717[var13];
            this.field1703[var14][var8[var14]++] = var13++;
        }
        this.field1717 = null;
    }

    @ObfuscatedName("ct.g()V")
    public void method2116() {
        for (int var1 = 0; var1 < this.field1713; var1++) {
            int var2 = this.field1698[var1];
            this.field1698[var1] = this.field1692[var1];
            this.field1692[var1] = -var2;
        }
        this.method2125();
    }

    @ObfuscatedName("ct.s()V")
    public void method2143() {
        for (int var1 = 0; var1 < this.field1713; var1++) {
            this.field1698[var1] = -this.field1698[var1];
            this.field1692[var1] = -this.field1692[var1];
        }
        this.method2125();
    }

    @ObfuscatedName("ct.r()V")
    public void method2117() {
        for (int var1 = 0; var1 < this.field1713; var1++) {
            int var2 = this.field1692[var1];
            this.field1692[var1] = this.field1698[var1];
            this.field1698[var1] = -var2;
        }
        this.method2125();
    }

    @ObfuscatedName("ct.p(I)V")
    public void method2149(int arg0) {
        int var2 = field1723[arg0];
        int var3 = field1735[arg0];
        for (int var4 = 0; var4 < this.field1713; var4++) {
            int var5 = this.field1698[var4] * var3 + this.field1692[var4] * var2 >> 16;
            this.field1692[var4] = this.field1692[var4] * var3 - this.field1698[var4] * var2 >> 16;
            this.field1698[var4] = var5;
        }
        this.method2125();
    }

    @ObfuscatedName("ct.h(III)V")
    public void method2174(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1713; var4++) {
            this.field1698[var4] += arg0;
            this.field1714[var4] += arg1;
            this.field1692[var4] += arg2;
        }
        this.method2125();
    }

    @ObfuscatedName("ct.e(SS)V")
    public void method2179(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1691; var3++) {
            if (this.field1701[var3] == arg0) {
                this.field1701[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ct.t(SS)V")
    public void method2138(short arg0, short arg1) {
        if (this.field1702 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1691; var3++) {
            if (this.field1702[var3] == arg0) {
                this.field1702[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ct.w()V")
    public void method2122() {
        for (int var1 = 0; var1 < this.field1713; var1++) {
            this.field1692[var1] = -this.field1692[var1];
        }
        for (int var2 = 0; var2 < this.field1691; var2++) {
            int var3 = this.field1694[var2];
            this.field1694[var2] = this.field1696[var2];
            this.field1696[var2] = var3;
        }
        this.method2125();
    }

    @ObfuscatedName("ct.v(III)V")
    public void method2123(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1713; var4++) {
            this.field1698[var4] = this.field1698[var4] * arg0 / 128;
            this.field1714[var4] = this.field1714[var4] * arg1 / 128;
            this.field1692[var4] = this.field1692[var4] * arg2 / 128;
        }
        this.method2125();
    }

    @ObfuscatedName("ct.y()V")
    public void method2124() {
        if (this.field1721 != null) {
            return;
        }
        this.field1721 = new class97[this.field1713];
        for (int var1 = 0; var1 < this.field1713; var1++) {
            this.field1721[var1] = new class97();
        }
        for (int var2 = 0; var2 < this.field1691; var2++) {
            int var3 = this.field1694[var2];
            int var4 = this.field1695[var2];
            int var5 = this.field1696[var2];
            int var6 = this.field1698[var4] - this.field1698[var3];
            int var7 = this.field1714[var4] - this.field1714[var3];
            int var8 = this.field1692[var4] - this.field1692[var3];
            int var9 = this.field1698[var5] - this.field1698[var3];
            int var10 = this.field1714[var5] - this.field1714[var3];
            int var11 = this.field1692[var5] - this.field1692[var3];
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
                class97 var20 = this.field1721[var3];
                var20.field1635 += var16;
                var20.field1633 += var17;
                var20.field1638 += var18;
                var20.field1636++;
                class97 var21 = this.field1721[var4];
                var21.field1635 += var16;
                var21.field1633 += var17;
                var21.field1638 += var18;
                var21.field1636++;
                class97 var22 = this.field1721[var5];
                var22.field1635 += var16;
                var22.field1633 += var17;
                var22.field1638 += var18;
                var22.field1636++;
            } else if (var19 == 1) {
                if (this.field1720 == null) {
                    this.field1720 = new class85[this.field1691];
                }
                class85 var23 = this.field1720[var2] = new class85();
                var23.field1461 = var16;
                var23.field1462 = var17;
                var23.field1463 = var18;
            }
        }
    }

    @ObfuscatedName("ct.c()V")
    public void method2125() {
        this.field1721 = null;
        this.field1732 = null;
        this.field1720 = null;
        this.field1725 = false;
    }

    @ObfuscatedName("ct.i()V")
    public void method2126() {
        if (this.field1725) {
            return;
        }
        this.field1469 = 0;
        this.field1726 = 0;
        this.field1727 = 999999;
        this.field1728 = -999999;
        this.field1729 = -99999;
        this.field1730 = 99999;
        for (int var1 = 0; var1 < this.field1713; var1++) {
            int var2 = this.field1698[var1];
            int var3 = this.field1714[var1];
            int var4 = this.field1692[var1];
            if (var2 < this.field1727) {
                this.field1727 = var2;
            }
            if (var2 > this.field1728) {
                this.field1728 = var2;
            }
            if (var4 < this.field1730) {
                this.field1730 = var4;
            }
            if (var4 > this.field1729) {
                this.field1729 = var4;
            }
            if (-var3 > this.field1469) {
                this.field1469 = -var3;
            }
            if (var3 > this.field1726) {
                this.field1726 = var3;
            }
        }
        this.field1725 = true;
    }

    @ObfuscatedName("ct.a(Lct;Lct;IIIZ)V")
    public static void method2119(class101 arg0, class101 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2126();
        arg0.method2124();
        arg1.method2126();
        arg1.method2124();
        field1733++;
        int var6 = 0;
        int[] var7 = arg1.field1698;
        int var8 = arg1.field1713;
        for (int var9 = 0; var9 < arg0.field1713; var9++) {
            class97 var10 = arg0.field1721[var9];
            if (var10.field1636 != 0) {
                int var11 = arg0.field1714[var9] - arg3;
                if (var11 <= arg1.field1726) {
                    int var12 = arg0.field1698[var9] - arg2;
                    if (var12 >= arg1.field1727 && var12 <= arg1.field1728) {
                        int var13 = arg0.field1692[var9] - arg4;
                        if (var13 >= arg1.field1730 && var13 <= arg1.field1729) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class97 var15 = arg1.field1721[var14];
                                if (var7[var14] == var12 && arg1.field1692[var14] == var13 && arg1.field1714[var14] == var11 && var15.field1636 != 0) {
                                    if (arg0.field1732 == null) {
                                        arg0.field1732 = new class97[arg0.field1713];
                                    }
                                    if (arg1.field1732 == null) {
                                        arg1.field1732 = new class97[var8];
                                    }
                                    class97 var16 = arg0.field1732[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1732[var9] = new class97(var10);
                                    }
                                    class97 var17 = arg1.field1732[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1732[var14] = new class97(var15);
                                    }
                                    var16.field1635 += var15.field1635;
                                    var16.field1633 += var15.field1633;
                                    var16.field1638 += var15.field1638;
                                    var16.field1636 += var15.field1636;
                                    var17.field1635 += var10.field1635;
                                    var17.field1633 += var10.field1633;
                                    var17.field1638 += var10.field1638;
                                    var17.field1636 += var10.field1636;
                                    var6++;
                                    field1731[var9] = field1733;
                                    field1734[var14] = field1733;
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
        for (int var18 = 0; var18 < arg0.field1691; var18++) {
            if (field1731[arg0.field1694[var18]] == field1733 && field1731[arg0.field1695[var18]] == field1733 && field1731[arg0.field1696[var18]] == field1733) {
                if (arg0.field1697 == null) {
                    arg0.field1697 = new byte[arg0.field1691];
                }
                arg0.field1697[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1691; var19++) {
            if (field1734[arg1.field1694[var19]] == field1733 && field1734[arg1.field1695[var19]] == field1733 && field1734[arg1.field1696[var19]] == field1733) {
                if (arg1.field1697 == null) {
                    arg1.field1697 = new byte[arg1.field1691];
                }
                arg1.field1697[var19] = 2;
            }
        }
    }

    @ObfuscatedName("ct.z(IIIII)Ldr;")
    public final class106 method2128(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2124();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class106 var8 = new class106();
        var8.field1820 = new int[this.field1691];
        var8.field1828 = new int[this.field1691];
        var8.field1818 = new int[this.field1691];
        if (this.field1715 > 0 && this.field1700 != null) {
            int[] var9 = new int[this.field1715];
            for (int var10 = 0; var10 < this.field1691; var10++) {
                if (this.field1700[var10] != -1) {
                    var9[this.field1700[var10] & 0xFF]++;
                }
            }
            var8.field1824 = 0;
            for (int var11 = 0; var11 < this.field1715; var11++) {
                if (var9[var11] > 0 && this.field1719[var11] == 0) {
                    var8.field1824++;
                }
            }
            var8.field1825 = new int[var8.field1824];
            var8.field1826 = new int[var8.field1824];
            var8.field1827 = new int[var8.field1824];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1715; var13++) {
                if (var9[var13] > 0 && this.field1719[var13] == 0) {
                    var8.field1825[var12] = this.field1706[var13] & 0xFFFF;
                    var8.field1826[var12] = this.field1707[var13] & 0xFFFF;
                    var8.field1827[var12] = this.field1708[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1821 = new byte[this.field1691];
            for (int var14 = 0; var14 < this.field1691; var14++) {
                if (this.field1700[var14] == -1) {
                    var8.field1821[var14] = -1;
                } else {
                    var8.field1821[var14] = (byte) var9[this.field1700[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1691; var15++) {
            byte var16;
            if (this.field1697 == null) {
                var16 = 0;
            } else {
                var16 = this.field1697[var15];
            }
            byte var17;
            if (this.field1699 == null) {
                var17 = 0;
            } else {
                var17 = this.field1699[var15];
            }
            short var18;
            if (this.field1702 == null) {
                var18 = -1;
            } else {
                var18 = this.field1702[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1701[var15] & 0xFFFF;
                    class97 var20;
                    if (this.field1732 == null || this.field1732[this.field1694[var15]] == null) {
                        var20 = this.field1721[this.field1694[var15]];
                    } else {
                        var20 = this.field1732[this.field1694[var15]];
                    }
                    int var21 = (var20.field1638 * arg4 + var20.field1635 * arg2 + var20.field1633 * arg3) / (var20.field1636 * var7) + arg0;
                    var8.field1820[var15] = method2129(var19, var21);
                    class97 var22;
                    if (this.field1732 == null || this.field1732[this.field1695[var15]] == null) {
                        var22 = this.field1721[this.field1695[var15]];
                    } else {
                        var22 = this.field1732[this.field1695[var15]];
                    }
                    int var23 = (var22.field1638 * arg4 + var22.field1635 * arg2 + var22.field1633 * arg3) / (var22.field1636 * var7) + arg0;
                    var8.field1828[var15] = method2129(var19, var23);
                    class97 var24;
                    if (this.field1732 == null || this.field1732[this.field1696[var15]] == null) {
                        var24 = this.field1721[this.field1696[var15]];
                    } else {
                        var24 = this.field1732[this.field1696[var15]];
                    }
                    int var25 = (var24.field1638 * arg4 + var24.field1635 * arg2 + var24.field1633 * arg3) / (var24.field1636 * var7) + arg0;
                    var8.field1818[var15] = method2129(var19, var25);
                } else if (var16 == 1) {
                    class85 var26 = this.field1720[var15];
                    int var27 = (var26.field1463 * arg4 + var26.field1462 * arg3 + var26.field1461 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field1820[var15] = method2129(this.field1701[var15] & 0xFFFF, var27);
                    var8.field1818[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1820[var15] = 128;
                    var8.field1818[var15] = -1;
                } else {
                    var8.field1818[var15] = -2;
                }
            } else if (var16 == 0) {
                class97 var28;
                if (this.field1732 == null || this.field1732[this.field1694[var15]] == null) {
                    var28 = this.field1721[this.field1694[var15]];
                } else {
                    var28 = this.field1732[this.field1694[var15]];
                }
                int var29 = (var28.field1638 * arg4 + var28.field1635 * arg2 + var28.field1633 * arg3) / (var28.field1636 * var7) + arg0;
                var8.field1820[var15] = method2130(var29);
                class97 var30;
                if (this.field1732 == null || this.field1732[this.field1695[var15]] == null) {
                    var30 = this.field1721[this.field1695[var15]];
                } else {
                    var30 = this.field1732[this.field1695[var15]];
                }
                int var31 = (var30.field1638 * arg4 + var30.field1635 * arg2 + var30.field1633 * arg3) / (var30.field1636 * var7) + arg0;
                var8.field1828[var15] = method2130(var31);
                class97 var32;
                if (this.field1732 == null || this.field1732[this.field1696[var15]] == null) {
                    var32 = this.field1721[this.field1696[var15]];
                } else {
                    var32 = this.field1732[this.field1696[var15]];
                }
                int var33 = (var32.field1638 * arg4 + var32.field1635 * arg2 + var32.field1633 * arg3) / (var32.field1636 * var7) + arg0;
                var8.field1818[var15] = method2130(var33);
            } else if (var16 == 1) {
                class85 var34 = this.field1720[var15];
                int var35 = (var34.field1463 * arg4 + var34.field1462 * arg3 + var34.field1461 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field1820[var15] = method2130(var35);
                var8.field1818[var15] = -1;
            } else {
                var8.field1818[var15] = -2;
            }
        }
        this.method2115();
        var8.field1836 = this.field1713;
        var8.field1866 = this.field1698;
        var8.field1810 = this.field1714;
        var8.field1816 = this.field1692;
        var8.field1812 = this.field1691;
        var8.field1847 = this.field1694;
        var8.field1814 = this.field1695;
        var8.field1815 = this.field1696;
        var8.field1819 = this.field1722;
        var8.field1822 = this.field1699;
        var8.field1823 = this.field1724;
        var8.field1850 = this.field1718;
        var8.field1829 = this.field1703;
        var8.field1864 = this.field1702;
        return var8;
    }

    @ObfuscatedName("ct.j(II)I")
    public static final int method2129(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("ct.ag(I)I")
    public static final int method2130(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
