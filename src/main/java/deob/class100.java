package deob;

@ObfuscatedName("cu")
public class class100 extends class93 {

    @ObfuscatedName("cu.p")
    public int field1734 = 0;

    @ObfuscatedName("cu.j")
    public int[] field1722;

    @ObfuscatedName("cu.w")
    public int[] field1693;

    @ObfuscatedName("cu.h")
    public int[] field1694;

    @ObfuscatedName("cu.v")
    public int field1695 = 0;

    @ObfuscatedName("cu.k")
    public int[] field1733;

    @ObfuscatedName("cu.g")
    public int[] field1697;

    @ObfuscatedName("cu.n")
    public int[] field1727;

    @ObfuscatedName("cu.c")
    public byte[] field1699;

    @ObfuscatedName("cu.o")
    public byte[] field1709;

    @ObfuscatedName("cu.u")
    public byte[] field1701;

    @ObfuscatedName("cu.z")
    public byte[] field1719;

    @ObfuscatedName("cu.e")
    public short[] field1703;

    @ObfuscatedName("cu.l")
    public short[] field1704;

    @ObfuscatedName("cu.m")
    public byte field1717 = 0;

    @ObfuscatedName("cu.s")
    public int field1706;

    @ObfuscatedName("cu.i")
    public byte[] field1707;

    @ObfuscatedName("cu.y")
    public short[] field1708;

    @ObfuscatedName("cu.d")
    public short[] field1728;

    @ObfuscatedName("cu.f")
    public short[] field1710;

    @ObfuscatedName("cu.a")
    public short[] field1711;

    @ObfuscatedName("cu.x")
    public short[] field1712;

    @ObfuscatedName("cu.r")
    public short[] field1713;

    @ObfuscatedName("cu.t")
    public short[] field1705;

    @ObfuscatedName("cu.b")
    public short[] field1715;

    @ObfuscatedName("cu.q")
    public short[] field1691;

    @ObfuscatedName("cu.ae")
    public byte[] field1698;

    @ObfuscatedName("cu.at")
    public int[] field1714;

    @ObfuscatedName("cu.aj")
    public int[] field1718;

    @ObfuscatedName("cu.aq")
    public int[][] field1735;

    @ObfuscatedName("cu.ac")
    public int[][] field1721;

    @ObfuscatedName("cu.az")
    public class91[] field1736;

    @ObfuscatedName("cu.ao")
    public class90[] field1723;

    @ObfuscatedName("cu.am")
    public class90[] field1724;

    @ObfuscatedName("cu.ad")
    public short field1725;

    @ObfuscatedName("cu.an")
    public short field1726;

    @ObfuscatedName("cu.al")
    public boolean field1696 = false;

    @ObfuscatedName("cu.ab")
    public int field1692;

    @ObfuscatedName("cu.af")
    public int field1702;

    @ObfuscatedName("cu.ap")
    public int field1730;

    @ObfuscatedName("cu.as")
    public int field1731;

    @ObfuscatedName("cu.av")
    public int field1732;

    @ObfuscatedName("cu.ay")
    public static int[] field1720 = new int[10000];

    @ObfuscatedName("cu.ah")
    public static int[] field1729 = new int[10000];

    @ObfuscatedName("cu.aa")
    public static int field1700 = 0;

    @ObfuscatedName("cu.ag")
    public static int[] field1716 = class103.field1790;

    @ObfuscatedName("cu.au")
    public static int[] field1737 = class103.field1787;

    public class100() {
    }

    @ObfuscatedName("cu.p(Ler;II)Lcu;")
    public static class100 method1997(class151 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2973(arg1, arg2);
        return var3 == null ? null : new class100(var3);
    }

    public class100(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2076(arg0);
        } else {
            this.method2000(arg0);
        }
    }

    @ObfuscatedName("cu.w([B)V")
    public void method2076(byte[] arg0) {
        class126 var2 = new class126(arg0);
        class126 var3 = new class126(arg0);
        class126 var4 = new class126(arg0);
        class126 var5 = new class126(arg0);
        class126 var6 = new class126(arg0);
        class126 var7 = new class126(arg0);
        class126 var8 = new class126(arg0);
        var2.field2043 = arg0.length - 23;
        int var9 = var2.method2489();
        int var10 = var2.method2489();
        int var11 = var2.method2544();
        int var12 = var2.method2544();
        int var13 = var2.method2544();
        int var14 = var2.method2544();
        int var15 = var2.method2544();
        int var16 = var2.method2544();
        int var17 = var2.method2544();
        int var18 = var2.method2489();
        int var19 = var2.method2489();
        int var20 = var2.method2489();
        int var21 = var2.method2489();
        int var22 = var2.method2489();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1707 = new byte[var11];
            var2.field2043 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1707[var26] = var2.method2376();
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
        this.field1734 = var9;
        this.field1695 = var10;
        this.field1706 = var11;
        this.field1722 = new int[var9];
        this.field1693 = new int[var9];
        this.field1694 = new int[var9];
        this.field1733 = new int[var10];
        this.field1697 = new int[var10];
        this.field1727 = new int[var10];
        if (var17 == 1) {
            this.field1714 = new int[var9];
        }
        if (var12 == 1) {
            this.field1699 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1709 = new byte[var10];
        } else {
            this.field1717 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1701 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1718 = new int[var10];
        }
        if (var16 == 1) {
            this.field1704 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1719 = new byte[var10];
        }
        this.field1703 = new short[var10];
        if (var11 > 0) {
            this.field1708 = new short[var11];
            this.field1728 = new short[var11];
            this.field1710 = new short[var11];
            if (var24 > 0) {
                this.field1711 = new short[var24];
                this.field1712 = new short[var24];
                this.field1713 = new short[var24];
                this.field1705 = new short[var24];
                this.field1698 = new byte[var24];
                this.field1715 = new short[var24];
            }
            if (var25 > 0) {
                this.field1691 = new short[var25];
            }
        }
        var2.field2043 = var11;
        var3.field2043 = var44;
        var4.field2043 = var46;
        var5.field2043 = var48;
        var6.field2043 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2544();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2361();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2361();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2361();
            }
            this.field1722[var67] = var64 + var69;
            this.field1693[var67] = var65 + var70;
            this.field1694[var67] = var66 + var71;
            var64 = this.field1722[var67];
            var65 = this.field1693[var67];
            var66 = this.field1694[var67];
            if (var17 == 1) {
                this.field1714[var67] = var6.method2544();
            }
        }
        var2.field2043 = var42;
        var3.field2043 = var31;
        var4.field2043 = var34;
        var5.field2043 = var37;
        var6.field2043 = var35;
        var7.field2043 = var40;
        var8.field2043 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1703[var72] = (short) var2.method2489();
            if (var12 == 1) {
                this.field1699[var72] = var3.method2376();
            }
            if (var13 == 255) {
                this.field1709[var72] = var4.method2376();
            }
            if (var14 == 1) {
                this.field1701[var72] = var5.method2376();
            }
            if (var15 == 1) {
                this.field1718[var72] = var6.method2544();
            }
            if (var16 == 1) {
                this.field1704[var72] = (short) (var7.method2489() - 1);
            }
            if (this.field1719 != null && this.field1704[var72] != -1) {
                this.field1719[var72] = (byte) (var8.method2544() - 1);
            }
        }
        var2.field2043 = var33;
        var3.field2043 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2544();
            if (var78 == 1) {
                var73 = var2.method2361() + var76;
                var74 = var2.method2361() + var73;
                var75 = var2.method2361() + var74;
                var76 = var75;
                this.field1733[var77] = var73;
                this.field1697[var77] = var74;
                this.field1727[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2361() + var76;
                var76 = var75;
                this.field1733[var77] = var73;
                this.field1697[var77] = var74;
                this.field1727[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2361() + var76;
                var76 = var75;
                this.field1733[var77] = var73;
                this.field1697[var77] = var74;
                this.field1727[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2361() + var76;
                var76 = var75;
                this.field1733[var77] = var73;
                this.field1697[var77] = var81;
                this.field1727[var77] = var75;
            }
        }
        var2.field2043 = var50;
        var3.field2043 = var52;
        var4.field2043 = var54;
        var5.field2043 = var56;
        var6.field2043 = var58;
        var7.field2043 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1707[var82] & 0xFF;
            if (var83 == 0) {
                this.field1708[var82] = (short) var2.method2489();
                this.field1728[var82] = (short) var2.method2489();
                this.field1710[var82] = (short) var2.method2489();
            }
            if (var83 == 1) {
                this.field1708[var82] = (short) var3.method2489();
                this.field1728[var82] = (short) var3.method2489();
                this.field1710[var82] = (short) var3.method2489();
                this.field1711[var82] = (short) var4.method2489();
                this.field1712[var82] = (short) var4.method2489();
                this.field1713[var82] = (short) var4.method2489();
                this.field1705[var82] = (short) var5.method2489();
                this.field1698[var82] = var6.method2376();
                this.field1715[var82] = (short) var7.method2489();
            }
            if (var83 == 2) {
                this.field1708[var82] = (short) var3.method2489();
                this.field1728[var82] = (short) var3.method2489();
                this.field1710[var82] = (short) var3.method2489();
                this.field1711[var82] = (short) var4.method2489();
                this.field1712[var82] = (short) var4.method2489();
                this.field1713[var82] = (short) var4.method2489();
                this.field1705[var82] = (short) var5.method2489();
                this.field1698[var82] = var6.method2376();
                this.field1715[var82] = (short) var7.method2489();
                this.field1691[var82] = (short) var7.method2489();
            }
            if (var83 == 3) {
                this.field1708[var82] = (short) var3.method2489();
                this.field1728[var82] = (short) var3.method2489();
                this.field1710[var82] = (short) var3.method2489();
                this.field1711[var82] = (short) var4.method2489();
                this.field1712[var82] = (short) var4.method2489();
                this.field1713[var82] = (short) var4.method2489();
                this.field1705[var82] = (short) var5.method2489();
                this.field1698[var82] = var6.method2376();
                this.field1715[var82] = (short) var7.method2489();
            }
        }
        var2.field2043 = var62;
        int var84 = var2.method2544();
        if (var84 == 0) {
            return;
        }
        new class102();
        var2.method2489();
        var2.method2489();
        var2.method2489();
        var2.method2380();
    }

    @ObfuscatedName("cu.h([B)V")
    public void method2000(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class126 var4 = new class126(arg0);
        class126 var5 = new class126(arg0);
        class126 var6 = new class126(arg0);
        class126 var7 = new class126(arg0);
        class126 var8 = new class126(arg0);
        var4.field2043 = arg0.length - 18;
        int var9 = var4.method2489();
        int var10 = var4.method2489();
        int var11 = var4.method2544();
        int var12 = var4.method2544();
        int var13 = var4.method2544();
        int var14 = var4.method2544();
        int var15 = var4.method2544();
        int var16 = var4.method2544();
        int var17 = var4.method2489();
        int var18 = var4.method2489();
        int var19 = var4.method2489();
        int var20 = var4.method2489();
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
        this.field1734 = var9;
        this.field1695 = var10;
        this.field1706 = var11;
        this.field1722 = new int[var9];
        this.field1693 = new int[var9];
        this.field1694 = new int[var9];
        this.field1733 = new int[var10];
        this.field1697 = new int[var10];
        this.field1727 = new int[var10];
        if (var11 > 0) {
            this.field1707 = new byte[var11];
            this.field1708 = new short[var11];
            this.field1728 = new short[var11];
            this.field1710 = new short[var11];
        }
        if (var16 == 1) {
            this.field1714 = new int[var9];
        }
        if (var12 == 1) {
            this.field1699 = new byte[var10];
            this.field1719 = new byte[var10];
            this.field1704 = new short[var10];
        }
        if (var13 == 255) {
            this.field1709 = new byte[var10];
        } else {
            this.field1717 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1701 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1718 = new int[var10];
        }
        this.field1703 = new short[var10];
        var4.field2043 = var21;
        var5.field2043 = var36;
        var6.field2043 = var38;
        var7.field2043 = var40;
        var8.field2043 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2544();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2361();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2361();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2361();
            }
            this.field1722[var46] = var43 + var48;
            this.field1693[var46] = var44 + var49;
            this.field1694[var46] = var45 + var50;
            var43 = this.field1722[var46];
            var44 = this.field1693[var46];
            var45 = this.field1694[var46];
            if (var16 == 1) {
                this.field1714[var46] = var8.method2544();
            }
        }
        var4.field2043 = var32;
        var5.field2043 = var28;
        var6.field2043 = var26;
        var7.field2043 = var30;
        var8.field2043 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1703[var51] = (short) var4.method2489();
            if (var12 == 1) {
                int var52 = var5.method2544();
                if ((var52 & 0x1) == 1) {
                    this.field1699[var51] = 1;
                    var2 = true;
                } else {
                    this.field1699[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1719[var51] = (byte) (var52 >> 2);
                    this.field1704[var51] = this.field1703[var51];
                    this.field1703[var51] = 127;
                    if (this.field1704[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1719[var51] = -1;
                    this.field1704[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1709[var51] = var6.method2376();
            }
            if (var14 == 1) {
                this.field1701[var51] = var7.method2376();
            }
            if (var15 == 1) {
                this.field1718[var51] = var8.method2544();
            }
        }
        var4.field2043 = var25;
        var5.field2043 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2544();
            if (var58 == 1) {
                var53 = var4.method2361() + var56;
                var54 = var4.method2361() + var53;
                var55 = var4.method2361() + var54;
                var56 = var55;
                this.field1733[var57] = var53;
                this.field1697[var57] = var54;
                this.field1727[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2361() + var56;
                var56 = var55;
                this.field1733[var57] = var53;
                this.field1697[var57] = var54;
                this.field1727[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2361() + var56;
                var56 = var55;
                this.field1733[var57] = var53;
                this.field1697[var57] = var54;
                this.field1727[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2361() + var56;
                var56 = var55;
                this.field1733[var57] = var53;
                this.field1697[var57] = var61;
                this.field1727[var57] = var55;
            }
        }
        var4.field2043 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1707[var62] = 0;
            this.field1708[var62] = (short) var4.method2489();
            this.field1728[var62] = (short) var4.method2489();
            this.field1710[var62] = (short) var4.method2489();
        }
        if (this.field1719 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1719[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1708[var65] & 0xFFFF) == this.field1733[var64] && (this.field1728[var65] & 0xFFFF) == this.field1697[var64] && (this.field1710[var65] & 0xFFFF) == this.field1727[var64]) {
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
            this.field1704 = null;
        }
        if (!var2) {
            this.field1699 = null;
        }
    }

    public class100(class100[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1734 = 0;
        this.field1695 = 0;
        this.field1706 = 0;
        this.field1717 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class100 var10 = arg0[var9];
            if (var10 != null) {
                this.field1734 += var10.field1734;
                this.field1695 += var10.field1695;
                this.field1706 += var10.field1706;
                if (var10.field1709 == null) {
                    if (this.field1717 == -1) {
                        this.field1717 = var10.field1717;
                    }
                    if (this.field1717 != var10.field1717) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1699 != null;
                var5 |= var10.field1701 != null;
                var6 |= var10.field1718 != null;
                var7 |= var10.field1704 != null;
                var8 |= var10.field1719 != null;
            }
        }
        this.field1722 = new int[this.field1734];
        this.field1693 = new int[this.field1734];
        this.field1694 = new int[this.field1734];
        this.field1714 = new int[this.field1734];
        this.field1733 = new int[this.field1695];
        this.field1697 = new int[this.field1695];
        this.field1727 = new int[this.field1695];
        if (var3) {
            this.field1699 = new byte[this.field1695];
        }
        if (var4) {
            this.field1709 = new byte[this.field1695];
        }
        if (var5) {
            this.field1701 = new byte[this.field1695];
        }
        if (var6) {
            this.field1718 = new int[this.field1695];
        }
        if (var7) {
            this.field1704 = new short[this.field1695];
        }
        if (var8) {
            this.field1719 = new byte[this.field1695];
        }
        this.field1703 = new short[this.field1695];
        if (this.field1706 > 0) {
            this.field1707 = new byte[this.field1706];
            this.field1708 = new short[this.field1706];
            this.field1728 = new short[this.field1706];
            this.field1710 = new short[this.field1706];
            this.field1711 = new short[this.field1706];
            this.field1712 = new short[this.field1706];
            this.field1713 = new short[this.field1706];
            this.field1705 = new short[this.field1706];
            this.field1698 = new byte[this.field1706];
            this.field1715 = new short[this.field1706];
            this.field1691 = new short[this.field1706];
        }
        this.field1734 = 0;
        this.field1695 = 0;
        this.field1706 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class100 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1695; var13++) {
                    if (var3 && var12.field1699 != null) {
                        this.field1699[this.field1695] = var12.field1699[var13];
                    }
                    if (var4) {
                        if (var12.field1709 == null) {
                            this.field1709[this.field1695] = var12.field1717;
                        } else {
                            this.field1709[this.field1695] = var12.field1709[var13];
                        }
                    }
                    if (var5 && var12.field1701 != null) {
                        this.field1701[this.field1695] = var12.field1701[var13];
                    }
                    if (var6 && var12.field1718 != null) {
                        this.field1718[this.field1695] = var12.field1718[var13];
                    }
                    if (var7) {
                        if (var12.field1704 == null) {
                            this.field1704[this.field1695] = -1;
                        } else {
                            this.field1704[this.field1695] = var12.field1704[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1719 == null || var12.field1719[var13] == -1) {
                            this.field1719[this.field1695] = -1;
                        } else {
                            this.field1719[this.field1695] = (byte) (var12.field1719[var13] + this.field1706);
                        }
                    }
                    this.field1703[this.field1695] = var12.field1703[var13];
                    this.field1733[this.field1695] = this.method2044(var12, var12.field1733[var13]);
                    this.field1697[this.field1695] = this.method2044(var12, var12.field1697[var13]);
                    this.field1727[this.field1695] = this.method2044(var12, var12.field1727[var13]);
                    this.field1695++;
                }
                for (int var14 = 0; var14 < var12.field1706; var14++) {
                    byte var15 = this.field1707[this.field1706] = var12.field1707[var14];
                    if (var15 == 0) {
                        this.field1708[this.field1706] = (short) this.method2044(var12, var12.field1708[var14]);
                        this.field1728[this.field1706] = (short) this.method2044(var12, var12.field1728[var14]);
                        this.field1710[this.field1706] = (short) this.method2044(var12, var12.field1710[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1708[this.field1706] = var12.field1708[var14];
                        this.field1728[this.field1706] = var12.field1728[var14];
                        this.field1710[this.field1706] = var12.field1710[var14];
                        this.field1711[this.field1706] = var12.field1711[var14];
                        this.field1712[this.field1706] = var12.field1712[var14];
                        this.field1713[this.field1706] = var12.field1713[var14];
                        this.field1705[this.field1706] = var12.field1705[var14];
                        this.field1698[this.field1706] = var12.field1698[var14];
                        this.field1715[this.field1706] = var12.field1715[var14];
                    }
                    if (var15 == 2) {
                        this.field1691[this.field1706] = var12.field1691[var14];
                    }
                    this.field1706++;
                }
            }
        }
    }

    @ObfuscatedName("cu.o(Lcu;I)I")
    public final int method2044(class100 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1722[arg1];
        int var5 = arg0.field1693[arg1];
        int var6 = arg0.field1694[arg1];
        for (int var7 = 0; var7 < this.field1734; var7++) {
            if (this.field1722[var7] == var4 && this.field1693[var7] == var5 && this.field1694[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1722[this.field1734] = var4;
            this.field1693[this.field1734] = var5;
            this.field1694[this.field1734] = var6;
            if (arg0.field1714 != null) {
                this.field1714[this.field1734] = arg0.field1714[arg1];
            }
            var3 = this.field1734++;
        }
        return var3;
    }

    public class100(class100 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1734 = arg0.field1734;
        this.field1695 = arg0.field1695;
        this.field1706 = arg0.field1706;
        if (arg1) {
            this.field1722 = arg0.field1722;
            this.field1693 = arg0.field1693;
            this.field1694 = arg0.field1694;
        } else {
            this.field1722 = new int[this.field1734];
            this.field1693 = new int[this.field1734];
            this.field1694 = new int[this.field1734];
            for (int var6 = 0; var6 < this.field1734; var6++) {
                this.field1722[var6] = arg0.field1722[var6];
                this.field1693[var6] = arg0.field1693[var6];
                this.field1694[var6] = arg0.field1694[var6];
            }
        }
        if (arg2) {
            this.field1703 = arg0.field1703;
        } else {
            this.field1703 = new short[this.field1695];
            for (int var7 = 0; var7 < this.field1695; var7++) {
                this.field1703[var7] = arg0.field1703[var7];
            }
        }
        if (arg3 || arg0.field1704 == null) {
            this.field1704 = arg0.field1704;
        } else {
            this.field1704 = new short[this.field1695];
            for (int var8 = 0; var8 < this.field1695; var8++) {
                this.field1704[var8] = arg0.field1704[var8];
            }
        }
        if (arg4) {
            this.field1701 = arg0.field1701;
        } else {
            this.field1701 = new byte[this.field1695];
            if (arg0.field1701 == null) {
                for (int var9 = 0; var9 < this.field1695; var9++) {
                    this.field1701[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1695; var10++) {
                    this.field1701[var10] = arg0.field1701[var10];
                }
            }
        }
        this.field1733 = arg0.field1733;
        this.field1697 = arg0.field1697;
        this.field1727 = arg0.field1727;
        this.field1699 = arg0.field1699;
        this.field1709 = arg0.field1709;
        this.field1719 = arg0.field1719;
        this.field1717 = arg0.field1717;
        this.field1707 = arg0.field1707;
        this.field1708 = arg0.field1708;
        this.field1728 = arg0.field1728;
        this.field1710 = arg0.field1710;
        this.field1711 = arg0.field1711;
        this.field1712 = arg0.field1712;
        this.field1713 = arg0.field1713;
        this.field1705 = arg0.field1705;
        this.field1698 = arg0.field1698;
        this.field1715 = arg0.field1715;
        this.field1691 = arg0.field1691;
        this.field1714 = arg0.field1714;
        this.field1718 = arg0.field1718;
        this.field1735 = arg0.field1735;
        this.field1721 = arg0.field1721;
        this.field1723 = arg0.field1723;
        this.field1736 = arg0.field1736;
        this.field1724 = arg0.field1724;
        this.field1725 = arg0.field1725;
        this.field1726 = arg0.field1726;
    }

    @ObfuscatedName("cu.u()Lcu;")
    public class100 method2002() {
        class100 var1 = new class100();
        if (this.field1699 != null) {
            var1.field1699 = new byte[this.field1695];
            for (int var2 = 0; var2 < this.field1695; var2++) {
                var1.field1699[var2] = this.field1699[var2];
            }
        }
        var1.field1734 = this.field1734;
        var1.field1695 = this.field1695;
        var1.field1706 = this.field1706;
        var1.field1722 = this.field1722;
        var1.field1693 = this.field1693;
        var1.field1694 = this.field1694;
        var1.field1733 = this.field1733;
        var1.field1697 = this.field1697;
        var1.field1727 = this.field1727;
        var1.field1709 = this.field1709;
        var1.field1701 = this.field1701;
        var1.field1719 = this.field1719;
        var1.field1703 = this.field1703;
        var1.field1704 = this.field1704;
        var1.field1717 = this.field1717;
        var1.field1707 = this.field1707;
        var1.field1708 = this.field1708;
        var1.field1728 = this.field1728;
        var1.field1710 = this.field1710;
        var1.field1711 = this.field1711;
        var1.field1712 = this.field1712;
        var1.field1713 = this.field1713;
        var1.field1705 = this.field1705;
        var1.field1698 = this.field1698;
        var1.field1715 = this.field1715;
        var1.field1691 = this.field1691;
        var1.field1714 = this.field1714;
        var1.field1718 = this.field1718;
        var1.field1735 = this.field1735;
        var1.field1721 = this.field1721;
        var1.field1723 = this.field1723;
        var1.field1736 = this.field1736;
        var1.field1725 = this.field1725;
        var1.field1726 = this.field1726;
        return var1;
    }

    @ObfuscatedName("cu.z([[IIIIZI)Lcu;")
    public class100 method2003(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2016();
        int var7 = this.field1702 + arg1;
        int var8 = this.field1730 + arg1;
        int var9 = this.field1732 + arg3;
        int var10 = this.field1731 + arg3;
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
        class100 var15;
        if (arg4) {
            var15 = new class100();
            var15.field1734 = this.field1734;
            var15.field1695 = this.field1695;
            var15.field1706 = this.field1706;
            var15.field1722 = this.field1722;
            var15.field1694 = this.field1694;
            var15.field1733 = this.field1733;
            var15.field1697 = this.field1697;
            var15.field1727 = this.field1727;
            var15.field1699 = this.field1699;
            var15.field1709 = this.field1709;
            var15.field1701 = this.field1701;
            var15.field1719 = this.field1719;
            var15.field1703 = this.field1703;
            var15.field1704 = this.field1704;
            var15.field1717 = this.field1717;
            var15.field1707 = this.field1707;
            var15.field1708 = this.field1708;
            var15.field1728 = this.field1728;
            var15.field1710 = this.field1710;
            var15.field1711 = this.field1711;
            var15.field1712 = this.field1712;
            var15.field1713 = this.field1713;
            var15.field1705 = this.field1705;
            var15.field1698 = this.field1698;
            var15.field1715 = this.field1715;
            var15.field1691 = this.field1691;
            var15.field1714 = this.field1714;
            var15.field1718 = this.field1718;
            var15.field1735 = this.field1735;
            var15.field1721 = this.field1721;
            var15.field1725 = this.field1725;
            var15.field1726 = this.field1726;
            var15.field1693 = new int[var15.field1734];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1734; var16++) {
                int var17 = this.field1722[var16] + arg1;
                int var18 = this.field1694[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1693[var16] = this.field1693[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1734; var26++) {
                int var27 = (-this.field1693[var26] << 16) / this.field1558;
                if (var27 < arg5) {
                    int var28 = this.field1722[var26] + arg1;
                    int var29 = this.field1694[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1693[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1693[var26];
                }
            }
        }
        var15.method2015();
        return var15;
    }

    @ObfuscatedName("cu.e()V")
    public void method2004() {
        int var10002;
        if (this.field1714 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1734; var3++) {
                int var4 = this.field1714[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1735 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1735[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1734) {
                int var7 = this.field1714[var6];
                this.field1735[var7][var1[var7]++] = var6++;
            }
            this.field1714 = null;
        }
        if (this.field1718 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1695; var10++) {
            int var11 = this.field1718[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1721 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1721[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1695) {
            int var14 = this.field1718[var13];
            this.field1721[var14][var8[var14]++] = var13++;
        }
        this.field1718 = null;
    }

    @ObfuscatedName("cu.l()V")
    public void method2005() {
        for (int var1 = 0; var1 < this.field1734; var1++) {
            int var2 = this.field1722[var1];
            this.field1722[var1] = this.field1694[var1];
            this.field1694[var1] = -var2;
        }
        this.method2015();
    }

    @ObfuscatedName("cu.m()V")
    public void method2006() {
        for (int var1 = 0; var1 < this.field1734; var1++) {
            this.field1722[var1] = -this.field1722[var1];
            this.field1694[var1] = -this.field1694[var1];
        }
        this.method2015();
    }

    @ObfuscatedName("cu.s()V")
    public void method2001() {
        for (int var1 = 0; var1 < this.field1734; var1++) {
            int var2 = this.field1694[var1];
            this.field1694[var1] = this.field1722[var1];
            this.field1722[var1] = -var2;
        }
        this.method2015();
    }

    @ObfuscatedName("cu.i(I)V")
    public void method2008(int arg0) {
        int var2 = field1716[arg0];
        int var3 = field1737[arg0];
        for (int var4 = 0; var4 < this.field1734; var4++) {
            int var5 = this.field1722[var4] * var3 + this.field1694[var4] * var2 >> 16;
            this.field1694[var4] = this.field1694[var4] * var3 - this.field1722[var4] * var2 >> 16;
            this.field1722[var4] = var5;
        }
        this.method2015();
    }

    @ObfuscatedName("cu.y(III)V")
    public void method2009(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1734; var4++) {
            this.field1722[var4] += arg0;
            this.field1693[var4] += arg1;
            this.field1694[var4] += arg2;
        }
        this.method2015();
    }

    @ObfuscatedName("cu.d(SS)V")
    public void method2010(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1695; var3++) {
            if (this.field1703[var3] == arg0) {
                this.field1703[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cu.f(SS)V")
    public void method2011(short arg0, short arg1) {
        if (this.field1704 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1695; var3++) {
            if (this.field1704[var3] == arg0) {
                this.field1704[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cu.a()V")
    public void method2069() {
        for (int var1 = 0; var1 < this.field1734; var1++) {
            this.field1694[var1] = -this.field1694[var1];
        }
        for (int var2 = 0; var2 < this.field1695; var2++) {
            int var3 = this.field1733[var2];
            this.field1733[var2] = this.field1727[var2];
            this.field1727[var2] = var3;
        }
        this.method2015();
    }

    @ObfuscatedName("cu.x(III)V")
    public void method2013(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1734; var4++) {
            this.field1722[var4] = this.field1722[var4] * arg0 / 128;
            this.field1693[var4] = this.field1693[var4] * arg1 / 128;
            this.field1694[var4] = this.field1694[var4] * arg2 / 128;
        }
        this.method2015();
    }

    @ObfuscatedName("cu.r()V")
    public void method2078() {
        if (this.field1723 != null) {
            return;
        }
        this.field1723 = new class90[this.field1734];
        for (int var1 = 0; var1 < this.field1734; var1++) {
            this.field1723[var1] = new class90();
        }
        for (int var2 = 0; var2 < this.field1695; var2++) {
            int var3 = this.field1733[var2];
            int var4 = this.field1697[var2];
            int var5 = this.field1727[var2];
            int var6 = this.field1722[var4] - this.field1722[var3];
            int var7 = this.field1693[var4] - this.field1693[var3];
            int var8 = this.field1694[var4] - this.field1694[var3];
            int var9 = this.field1722[var5] - this.field1722[var3];
            int var10 = this.field1693[var5] - this.field1693[var3];
            int var11 = this.field1694[var5] - this.field1694[var3];
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
            if (this.field1699 == null) {
                var19 = 0;
            } else {
                var19 = this.field1699[var2];
            }
            if (var19 == 0) {
                class90 var20 = this.field1723[var3];
                var20.field1517 += var16;
                var20.field1515 += var17;
                var20.field1516 += var18;
                var20.field1514++;
                class90 var21 = this.field1723[var4];
                var21.field1517 += var16;
                var21.field1515 += var17;
                var21.field1516 += var18;
                var21.field1514++;
                class90 var22 = this.field1723[var5];
                var22.field1517 += var16;
                var22.field1515 += var17;
                var22.field1516 += var18;
                var22.field1514++;
            } else if (var19 == 1) {
                if (this.field1736 == null) {
                    this.field1736 = new class91[this.field1695];
                }
                class91 var23 = this.field1736[var2] = new class91();
                var23.field1532 = var16;
                var23.field1524 = var17;
                var23.field1523 = var18;
            }
        }
    }

    @ObfuscatedName("cu.t()V")
    public void method2015() {
        this.field1723 = null;
        this.field1724 = null;
        this.field1736 = null;
        this.field1696 = false;
    }

    @ObfuscatedName("cu.ae()V")
    public void method2016() {
        if (this.field1696) {
            return;
        }
        this.field1558 = 0;
        this.field1692 = 0;
        this.field1702 = 999999;
        this.field1730 = -999999;
        this.field1731 = -99999;
        this.field1732 = 99999;
        for (int var1 = 0; var1 < this.field1734; var1++) {
            int var2 = this.field1722[var1];
            int var3 = this.field1693[var1];
            int var4 = this.field1694[var1];
            if (var2 < this.field1702) {
                this.field1702 = var2;
            }
            if (var2 > this.field1730) {
                this.field1730 = var2;
            }
            if (var4 < this.field1732) {
                this.field1732 = var4;
            }
            if (var4 > this.field1731) {
                this.field1731 = var4;
            }
            if (-var3 > this.field1558) {
                this.field1558 = -var3;
            }
            if (var3 > this.field1692) {
                this.field1692 = var3;
            }
        }
        this.field1696 = true;
    }

    @ObfuscatedName("cu.at(Lcu;Lcu;IIIZ)V")
    public static void method2017(class100 arg0, class100 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2016();
        arg0.method2078();
        arg1.method2016();
        arg1.method2078();
        field1700++;
        int var6 = 0;
        int[] var7 = arg1.field1722;
        int var8 = arg1.field1734;
        for (int var9 = 0; var9 < arg0.field1734; var9++) {
            class90 var10 = arg0.field1723[var9];
            if (var10.field1514 != 0) {
                int var11 = arg0.field1693[var9] - arg3;
                if (var11 <= arg1.field1692) {
                    int var12 = arg0.field1722[var9] - arg2;
                    if (var12 >= arg1.field1702 && var12 <= arg1.field1730) {
                        int var13 = arg0.field1694[var9] - arg4;
                        if (var13 >= arg1.field1732 && var13 <= arg1.field1731) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class90 var15 = arg1.field1723[var14];
                                if (var7[var14] == var12 && arg1.field1694[var14] == var13 && arg1.field1693[var14] == var11 && var15.field1514 != 0) {
                                    if (arg0.field1724 == null) {
                                        arg0.field1724 = new class90[arg0.field1734];
                                    }
                                    if (arg1.field1724 == null) {
                                        arg1.field1724 = new class90[var8];
                                    }
                                    class90 var16 = arg0.field1724[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1724[var9] = new class90(var10);
                                    }
                                    class90 var17 = arg1.field1724[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1724[var14] = new class90(var15);
                                    }
                                    var16.field1517 += var15.field1517;
                                    var16.field1515 += var15.field1515;
                                    var16.field1516 += var15.field1516;
                                    var16.field1514 += var15.field1514;
                                    var17.field1517 += var10.field1517;
                                    var17.field1515 += var10.field1515;
                                    var17.field1516 += var10.field1516;
                                    var17.field1514 += var10.field1514;
                                    var6++;
                                    field1720[var9] = field1700;
                                    field1729[var14] = field1700;
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
        for (int var18 = 0; var18 < arg0.field1695; var18++) {
            if (field1720[arg0.field1733[var18]] == field1700 && field1720[arg0.field1697[var18]] == field1700 && field1720[arg0.field1727[var18]] == field1700) {
                if (arg0.field1699 == null) {
                    arg0.field1699 = new byte[arg0.field1695];
                }
                arg0.field1699[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1695; var19++) {
            if (field1729[arg1.field1733[var19]] == field1700 && field1729[arg1.field1697[var19]] == field1700 && field1729[arg1.field1727[var19]] == field1700) {
                if (arg1.field1699 == null) {
                    arg1.field1699 = new byte[arg1.field1695];
                }
                arg1.field1699[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cu.aj(IIIII)Ldm;")
    public final class111 method2042(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2078();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class111 var8 = new class111();
        var8.field1877 = new int[this.field1695];
        var8.field1878 = new int[this.field1695];
        var8.field1900 = new int[this.field1695];
        if (this.field1706 > 0 && this.field1719 != null) {
            int[] var9 = new int[this.field1706];
            for (int var10 = 0; var10 < this.field1695; var10++) {
                if (this.field1719[var10] != -1) {
                    var9[this.field1719[var10] & 0xFF]++;
                }
            }
            var8.field1885 = 0;
            for (int var11 = 0; var11 < this.field1706; var11++) {
                if (var9[var11] > 0 && this.field1707[var11] == 0) {
                    var8.field1885++;
                }
            }
            var8.field1886 = new int[var8.field1885];
            var8.field1920 = new int[var8.field1885];
            var8.field1870 = new int[var8.field1885];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1706; var13++) {
                if (var9[var13] > 0 && this.field1707[var13] == 0) {
                    var8.field1886[var12] = this.field1708[var13] & 0xFFFF;
                    var8.field1920[var12] = this.field1728[var13] & 0xFFFF;
                    var8.field1870[var12] = this.field1710[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1882 = new byte[this.field1695];
            for (int var14 = 0; var14 < this.field1695; var14++) {
                if (this.field1719[var14] == -1) {
                    var8.field1882[var14] = -1;
                } else {
                    var8.field1882[var14] = (byte) var9[this.field1719[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1695; var15++) {
            byte var16;
            if (this.field1699 == null) {
                var16 = 0;
            } else {
                var16 = this.field1699[var15];
            }
            byte var17;
            if (this.field1701 == null) {
                var17 = 0;
            } else {
                var17 = this.field1701[var15];
            }
            short var18;
            if (this.field1704 == null) {
                var18 = -1;
            } else {
                var18 = this.field1704[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1703[var15] & 0xFFFF;
                    class90 var20;
                    if (this.field1724 == null || this.field1724[this.field1733[var15]] == null) {
                        var20 = this.field1723[this.field1733[var15]];
                    } else {
                        var20 = this.field1724[this.field1733[var15]];
                    }
                    int var21 = (var20.field1516 * arg4 + var20.field1517 * arg2 + var20.field1515 * arg3) / (var20.field1514 * var7) + arg0;
                    var8.field1877[var15] = method1998(var19, var21);
                    class90 var22;
                    if (this.field1724 == null || this.field1724[this.field1697[var15]] == null) {
                        var22 = this.field1723[this.field1697[var15]];
                    } else {
                        var22 = this.field1724[this.field1697[var15]];
                    }
                    int var23 = (var22.field1516 * arg4 + var22.field1517 * arg2 + var22.field1515 * arg3) / (var22.field1514 * var7) + arg0;
                    var8.field1878[var15] = method1998(var19, var23);
                    class90 var24;
                    if (this.field1724 == null || this.field1724[this.field1727[var15]] == null) {
                        var24 = this.field1723[this.field1727[var15]];
                    } else {
                        var24 = this.field1724[this.field1727[var15]];
                    }
                    int var25 = (var24.field1516 * arg4 + var24.field1517 * arg2 + var24.field1515 * arg3) / (var24.field1514 * var7) + arg0;
                    var8.field1900[var15] = method1998(var19, var25);
                } else if (var16 == 1) {
                    class91 var26 = this.field1736[var15];
                    int var27 = (var26.field1523 * arg4 + var26.field1532 * arg2 + var26.field1524 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1877[var15] = method1998(this.field1703[var15] & 0xFFFF, var27);
                    var8.field1900[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1877[var15] = 128;
                    var8.field1900[var15] = -1;
                } else {
                    var8.field1900[var15] = -2;
                }
            } else if (var16 == 0) {
                class90 var28;
                if (this.field1724 == null || this.field1724[this.field1733[var15]] == null) {
                    var28 = this.field1723[this.field1733[var15]];
                } else {
                    var28 = this.field1724[this.field1733[var15]];
                }
                int var29 = (var28.field1516 * arg4 + var28.field1517 * arg2 + var28.field1515 * arg3) / (var28.field1514 * var7) + arg0;
                var8.field1877[var15] = method2020(var29);
                class90 var30;
                if (this.field1724 == null || this.field1724[this.field1697[var15]] == null) {
                    var30 = this.field1723[this.field1697[var15]];
                } else {
                    var30 = this.field1724[this.field1697[var15]];
                }
                int var31 = (var30.field1516 * arg4 + var30.field1517 * arg2 + var30.field1515 * arg3) / (var30.field1514 * var7) + arg0;
                var8.field1878[var15] = method2020(var31);
                class90 var32;
                if (this.field1724 == null || this.field1724[this.field1727[var15]] == null) {
                    var32 = this.field1723[this.field1727[var15]];
                } else {
                    var32 = this.field1724[this.field1727[var15]];
                }
                int var33 = (var32.field1516 * arg4 + var32.field1517 * arg2 + var32.field1515 * arg3) / (var32.field1514 * var7) + arg0;
                var8.field1900[var15] = method2020(var33);
            } else if (var16 == 1) {
                class91 var34 = this.field1736[var15];
                int var35 = (var34.field1523 * arg4 + var34.field1532 * arg2 + var34.field1524 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1877[var15] = method2020(var35);
                var8.field1900[var15] = -1;
            } else {
                var8.field1900[var15] = -2;
            }
        }
        this.method2004();
        var8.field1904 = this.field1734;
        var8.field1909 = this.field1722;
        var8.field1871 = this.field1693;
        var8.field1872 = this.field1694;
        var8.field1892 = this.field1695;
        var8.field1874 = this.field1733;
        var8.field1875 = this.field1697;
        var8.field1916 = this.field1727;
        var8.field1880 = this.field1709;
        var8.field1881 = this.field1701;
        var8.field1884 = this.field1717;
        var8.field1889 = this.field1735;
        var8.field1930 = this.field1721;
        var8.field1883 = this.field1704;
        return var8;
    }

    @ObfuscatedName("cu.aq(II)I")
    public static final int method1998(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cu.ac(I)I")
    public static final int method2020(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
