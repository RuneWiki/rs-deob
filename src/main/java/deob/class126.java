package deob;

@ObfuscatedName("df")
public class class126 extends class140 {

    @ObfuscatedName("df.d")
    public int field1751 = 0;

    @ObfuscatedName("df.z")
    public int[] field1708;

    @ObfuscatedName("df.n")
    public int[] field1709;

    @ObfuscatedName("df.r")
    public int[] field1749;

    @ObfuscatedName("df.e")
    public int field1711 = 0;

    @ObfuscatedName("df.y")
    public int[] field1712;

    @ObfuscatedName("df.k")
    public int[] field1718;

    @ObfuscatedName("df.s")
    public int[] field1714;

    @ObfuscatedName("df.p")
    public byte[] field1730;

    @ObfuscatedName("df.x")
    public byte[] field1741;

    @ObfuscatedName("df.m")
    public byte[] field1717;

    @ObfuscatedName("df.h")
    public byte[] field1750;

    @ObfuscatedName("df.t")
    public short[] field1719;

    @ObfuscatedName("df.i")
    public short[] field1720;

    @ObfuscatedName("df.u")
    public byte field1721 = 0;

    @ObfuscatedName("df.q")
    public int field1722;

    @ObfuscatedName("df.v")
    public byte[] field1739;

    @ObfuscatedName("df.f")
    public short[] field1716;

    @ObfuscatedName("df.b")
    public short[] field1725;

    @ObfuscatedName("df.c")
    public short[] field1726;

    @ObfuscatedName("df.j")
    public short[] field1727;

    @ObfuscatedName("df.l")
    public short[] field1724;

    @ObfuscatedName("df.g")
    public short[] field1729;

    @ObfuscatedName("df.w")
    public short[] field1710;

    @ObfuscatedName("df.o")
    public short[] field1731;

    @ObfuscatedName("df.a")
    public short[] field1732;

    @ObfuscatedName("df.ak")
    public byte[] field1733;

    @ObfuscatedName("df.ap")
    public int[] field1734;

    @ObfuscatedName("df.ac")
    public int[] field1735;

    @ObfuscatedName("df.aw")
    public int[][] field1736;

    @ObfuscatedName("df.as")
    public int[][] field1737;

    @ObfuscatedName("df.au")
    public class142[] field1738;

    @ObfuscatedName("df.al")
    public class134[] field1713;

    @ObfuscatedName("df.af")
    public class134[] field1740;

    @ObfuscatedName("df.ai")
    public short field1715;

    @ObfuscatedName("df.az")
    public short field1742;

    @ObfuscatedName("df.aq")
    public boolean field1728 = false;

    @ObfuscatedName("df.ae")
    public int field1744;

    @ObfuscatedName("df.ad")
    public int field1745;

    @ObfuscatedName("df.ar")
    public int field1746;

    @ObfuscatedName("df.ao")
    public int field1747;

    @ObfuscatedName("df.at")
    public int field1748;

    @ObfuscatedName("df.ag")
    public static int[] field1743 = new int[10000];

    @ObfuscatedName("df.an")
    public static int[] field1723 = new int[10000];

    @ObfuscatedName("df.ax")
    public static int field1707 = 0;

    @ObfuscatedName("df.ah")
    public static int[] field1752 = class135.field1940;

    @ObfuscatedName("df.ab")
    public static int[] field1753 = class135.field1945;

    public class126() {
    }

    @ObfuscatedName("df.d(Ljk;II)Ldf;")
    public static class126 method2428(class262 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4273(arg1, arg2);
        return var3 == null ? null : new class126(var3);
    }

    public class126(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2429(arg0);
        } else {
            this.method2430(arg0);
        }
    }

    @ObfuscatedName("df.z([B)V")
    public void method2429(byte[] arg0) {
        class195 var2 = new class195(arg0);
        class195 var3 = new class195(arg0);
        class195 var4 = new class195(arg0);
        class195 var5 = new class195(arg0);
        class195 var6 = new class195(arg0);
        class195 var7 = new class195(arg0);
        class195 var8 = new class195(arg0);
        var2.field2568 = arg0.length - 23;
        int var9 = var2.method3269();
        int var10 = var2.method3269();
        int var11 = var2.method3330();
        int var12 = var2.method3330();
        int var13 = var2.method3330();
        int var14 = var2.method3330();
        int var15 = var2.method3330();
        int var16 = var2.method3330();
        int var17 = var2.method3330();
        int var18 = var2.method3269();
        int var19 = var2.method3269();
        int var20 = var2.method3269();
        int var21 = var2.method3269();
        int var22 = var2.method3269();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1739 = new byte[var11];
            var2.field2568 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1739[var26] = var2.method3421();
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
        this.field1751 = var9;
        this.field1711 = var10;
        this.field1722 = var11;
        this.field1708 = new int[var9];
        this.field1709 = new int[var9];
        this.field1749 = new int[var9];
        this.field1712 = new int[var10];
        this.field1718 = new int[var10];
        this.field1714 = new int[var10];
        if (var17 == 1) {
            this.field1734 = new int[var9];
        }
        if (var12 == 1) {
            this.field1730 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1741 = new byte[var10];
        } else {
            this.field1721 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1717 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1735 = new int[var10];
        }
        if (var16 == 1) {
            this.field1720 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1750 = new byte[var10];
        }
        this.field1719 = new short[var10];
        if (var11 > 0) {
            this.field1716 = new short[var11];
            this.field1725 = new short[var11];
            this.field1726 = new short[var11];
            if (var24 > 0) {
                this.field1727 = new short[var24];
                this.field1724 = new short[var24];
                this.field1729 = new short[var24];
                this.field1710 = new short[var24];
                this.field1733 = new byte[var24];
                this.field1731 = new short[var24];
            }
            if (var25 > 0) {
                this.field1732 = new short[var25];
            }
        }
        var2.field2568 = var11;
        var3.field2568 = var44;
        var4.field2568 = var46;
        var5.field2568 = var48;
        var6.field2568 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method3330();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method3272();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method3272();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method3272();
            }
            this.field1708[var67] = var64 + var69;
            this.field1709[var67] = var65 + var70;
            this.field1749[var67] = var66 + var71;
            var64 = this.field1708[var67];
            var65 = this.field1709[var67];
            var66 = this.field1749[var67];
            if (var17 == 1) {
                this.field1734[var67] = var6.method3330();
            }
        }
        var2.field2568 = var42;
        var3.field2568 = var31;
        var4.field2568 = var34;
        var5.field2568 = var37;
        var6.field2568 = var35;
        var7.field2568 = var40;
        var8.field2568 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1719[var72] = (short) var2.method3269();
            if (var12 == 1) {
                this.field1730[var72] = var3.method3421();
            }
            if (var13 == 255) {
                this.field1741[var72] = var4.method3421();
            }
            if (var14 == 1) {
                this.field1717[var72] = var5.method3421();
            }
            if (var15 == 1) {
                this.field1735[var72] = var6.method3330();
            }
            if (var16 == 1) {
                this.field1720[var72] = (short) (var7.method3269() - 1);
            }
            if (this.field1750 != null && this.field1720[var72] != -1) {
                this.field1750[var72] = (byte) (var8.method3330() - 1);
            }
        }
        var2.field2568 = var33;
        var3.field2568 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method3330();
            if (var78 == 1) {
                var73 = var2.method3272() + var76;
                var74 = var2.method3272() + var73;
                var75 = var2.method3272() + var74;
                var76 = var75;
                this.field1712[var77] = var73;
                this.field1718[var77] = var74;
                this.field1714[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method3272() + var76;
                var76 = var75;
                this.field1712[var77] = var73;
                this.field1718[var77] = var74;
                this.field1714[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method3272() + var76;
                var76 = var75;
                this.field1712[var77] = var73;
                this.field1718[var77] = var74;
                this.field1714[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method3272() + var76;
                var76 = var75;
                this.field1712[var77] = var73;
                this.field1718[var77] = var81;
                this.field1714[var77] = var75;
            }
        }
        var2.field2568 = var50;
        var3.field2568 = var52;
        var4.field2568 = var54;
        var5.field2568 = var56;
        var6.field2568 = var58;
        var7.field2568 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1739[var82] & 0xFF;
            if (var83 == 0) {
                this.field1716[var82] = (short) var2.method3269();
                this.field1725[var82] = (short) var2.method3269();
                this.field1726[var82] = (short) var2.method3269();
            }
            if (var83 == 1) {
                this.field1716[var82] = (short) var3.method3269();
                this.field1725[var82] = (short) var3.method3269();
                this.field1726[var82] = (short) var3.method3269();
                this.field1727[var82] = (short) var4.method3269();
                this.field1724[var82] = (short) var4.method3269();
                this.field1729[var82] = (short) var4.method3269();
                this.field1710[var82] = (short) var5.method3269();
                this.field1733[var82] = var6.method3421();
                this.field1731[var82] = (short) var7.method3269();
            }
            if (var83 == 2) {
                this.field1716[var82] = (short) var3.method3269();
                this.field1725[var82] = (short) var3.method3269();
                this.field1726[var82] = (short) var3.method3269();
                this.field1727[var82] = (short) var4.method3269();
                this.field1724[var82] = (short) var4.method3269();
                this.field1729[var82] = (short) var4.method3269();
                this.field1710[var82] = (short) var5.method3269();
                this.field1733[var82] = var6.method3421();
                this.field1731[var82] = (short) var7.method3269();
                this.field1732[var82] = (short) var7.method3269();
            }
            if (var83 == 3) {
                this.field1716[var82] = (short) var3.method3269();
                this.field1725[var82] = (short) var3.method3269();
                this.field1726[var82] = (short) var3.method3269();
                this.field1727[var82] = (short) var4.method3269();
                this.field1724[var82] = (short) var4.method3269();
                this.field1729[var82] = (short) var4.method3269();
                this.field1710[var82] = (short) var5.method3269();
                this.field1733[var82] = var6.method3421();
                this.field1731[var82] = (short) var7.method3269();
            }
        }
        var2.field2568 = var62;
        int var84 = var2.method3330();
        if (var84 == 0) {
            return;
        }
        new class139();
        var2.method3269();
        var2.method3269();
        var2.method3269();
        var2.method3264();
    }

    @ObfuscatedName("df.n([B)V")
    public void method2430(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class195 var4 = new class195(arg0);
        class195 var5 = new class195(arg0);
        class195 var6 = new class195(arg0);
        class195 var7 = new class195(arg0);
        class195 var8 = new class195(arg0);
        var4.field2568 = arg0.length - 18;
        int var9 = var4.method3269();
        int var10 = var4.method3269();
        int var11 = var4.method3330();
        int var12 = var4.method3330();
        int var13 = var4.method3330();
        int var14 = var4.method3330();
        int var15 = var4.method3330();
        int var16 = var4.method3330();
        int var17 = var4.method3269();
        int var18 = var4.method3269();
        int var19 = var4.method3269();
        int var20 = var4.method3269();
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
        this.field1751 = var9;
        this.field1711 = var10;
        this.field1722 = var11;
        this.field1708 = new int[var9];
        this.field1709 = new int[var9];
        this.field1749 = new int[var9];
        this.field1712 = new int[var10];
        this.field1718 = new int[var10];
        this.field1714 = new int[var10];
        if (var11 > 0) {
            this.field1739 = new byte[var11];
            this.field1716 = new short[var11];
            this.field1725 = new short[var11];
            this.field1726 = new short[var11];
        }
        if (var16 == 1) {
            this.field1734 = new int[var9];
        }
        if (var12 == 1) {
            this.field1730 = new byte[var10];
            this.field1750 = new byte[var10];
            this.field1720 = new short[var10];
        }
        if (var13 == 255) {
            this.field1741 = new byte[var10];
        } else {
            this.field1721 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1717 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1735 = new int[var10];
        }
        this.field1719 = new short[var10];
        var4.field2568 = var21;
        var5.field2568 = var36;
        var6.field2568 = var38;
        var7.field2568 = var40;
        var8.field2568 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method3330();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method3272();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method3272();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method3272();
            }
            this.field1708[var46] = var43 + var48;
            this.field1709[var46] = var44 + var49;
            this.field1749[var46] = var45 + var50;
            var43 = this.field1708[var46];
            var44 = this.field1709[var46];
            var45 = this.field1749[var46];
            if (var16 == 1) {
                this.field1734[var46] = var8.method3330();
            }
        }
        var4.field2568 = var32;
        var5.field2568 = var28;
        var6.field2568 = var26;
        var7.field2568 = var30;
        var8.field2568 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1719[var51] = (short) var4.method3269();
            if (var12 == 1) {
                int var52 = var5.method3330();
                if ((var52 & 0x1) == 1) {
                    this.field1730[var51] = 1;
                    var2 = true;
                } else {
                    this.field1730[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1750[var51] = (byte) (var52 >> 2);
                    this.field1720[var51] = this.field1719[var51];
                    this.field1719[var51] = 127;
                    if (this.field1720[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1750[var51] = -1;
                    this.field1720[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1741[var51] = var6.method3421();
            }
            if (var14 == 1) {
                this.field1717[var51] = var7.method3421();
            }
            if (var15 == 1) {
                this.field1735[var51] = var8.method3330();
            }
        }
        var4.field2568 = var25;
        var5.field2568 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method3330();
            if (var58 == 1) {
                var53 = var4.method3272() + var56;
                var54 = var4.method3272() + var53;
                var55 = var4.method3272() + var54;
                var56 = var55;
                this.field1712[var57] = var53;
                this.field1718[var57] = var54;
                this.field1714[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method3272() + var56;
                var56 = var55;
                this.field1712[var57] = var53;
                this.field1718[var57] = var54;
                this.field1714[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method3272() + var56;
                var56 = var55;
                this.field1712[var57] = var53;
                this.field1718[var57] = var54;
                this.field1714[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method3272() + var56;
                var56 = var55;
                this.field1712[var57] = var53;
                this.field1718[var57] = var61;
                this.field1714[var57] = var55;
            }
        }
        var4.field2568 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1739[var62] = 0;
            this.field1716[var62] = (short) var4.method3269();
            this.field1725[var62] = (short) var4.method3269();
            this.field1726[var62] = (short) var4.method3269();
        }
        if (this.field1750 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1750[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1716[var65] & 0xFFFF) == this.field1712[var64] && (this.field1725[var65] & 0xFFFF) == this.field1718[var64] && (this.field1726[var65] & 0xFFFF) == this.field1714[var64]) {
                        this.field1750[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1750 = null;
            }
        }
        if (!var3) {
            this.field1720 = null;
        }
        if (!var2) {
            this.field1730 = null;
        }
    }

    public class126(class126[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1751 = 0;
        this.field1711 = 0;
        this.field1722 = 0;
        this.field1721 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class126 var10 = arg0[var9];
            if (var10 != null) {
                this.field1751 += var10.field1751;
                this.field1711 += var10.field1711;
                this.field1722 += var10.field1722;
                if (var10.field1741 == null) {
                    if (this.field1721 == -1) {
                        this.field1721 = var10.field1721;
                    }
                    if (this.field1721 != var10.field1721) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1730 != null;
                var5 |= var10.field1717 != null;
                var6 |= var10.field1735 != null;
                var7 |= var10.field1720 != null;
                var8 |= var10.field1750 != null;
            }
        }
        this.field1708 = new int[this.field1751];
        this.field1709 = new int[this.field1751];
        this.field1749 = new int[this.field1751];
        this.field1734 = new int[this.field1751];
        this.field1712 = new int[this.field1711];
        this.field1718 = new int[this.field1711];
        this.field1714 = new int[this.field1711];
        if (var3) {
            this.field1730 = new byte[this.field1711];
        }
        if (var4) {
            this.field1741 = new byte[this.field1711];
        }
        if (var5) {
            this.field1717 = new byte[this.field1711];
        }
        if (var6) {
            this.field1735 = new int[this.field1711];
        }
        if (var7) {
            this.field1720 = new short[this.field1711];
        }
        if (var8) {
            this.field1750 = new byte[this.field1711];
        }
        this.field1719 = new short[this.field1711];
        if (this.field1722 > 0) {
            this.field1739 = new byte[this.field1722];
            this.field1716 = new short[this.field1722];
            this.field1725 = new short[this.field1722];
            this.field1726 = new short[this.field1722];
            this.field1727 = new short[this.field1722];
            this.field1724 = new short[this.field1722];
            this.field1729 = new short[this.field1722];
            this.field1710 = new short[this.field1722];
            this.field1733 = new byte[this.field1722];
            this.field1731 = new short[this.field1722];
            this.field1732 = new short[this.field1722];
        }
        this.field1751 = 0;
        this.field1711 = 0;
        this.field1722 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class126 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1711; var13++) {
                    if (var3 && var12.field1730 != null) {
                        this.field1730[this.field1711] = var12.field1730[var13];
                    }
                    if (var4) {
                        if (var12.field1741 == null) {
                            this.field1741[this.field1711] = var12.field1721;
                        } else {
                            this.field1741[this.field1711] = var12.field1741[var13];
                        }
                    }
                    if (var5 && var12.field1717 != null) {
                        this.field1717[this.field1711] = var12.field1717[var13];
                    }
                    if (var6 && var12.field1735 != null) {
                        this.field1735[this.field1711] = var12.field1735[var13];
                    }
                    if (var7) {
                        if (var12.field1720 == null) {
                            this.field1720[this.field1711] = -1;
                        } else {
                            this.field1720[this.field1711] = var12.field1720[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1750 == null || var12.field1750[var13] == -1) {
                            this.field1750[this.field1711] = -1;
                        } else {
                            this.field1750[this.field1711] = (byte) (var12.field1750[var13] + this.field1722);
                        }
                    }
                    this.field1719[this.field1711] = var12.field1719[var13];
                    this.field1712[this.field1711] = this.method2493(var12, var12.field1712[var13]);
                    this.field1718[this.field1711] = this.method2493(var12, var12.field1718[var13]);
                    this.field1714[this.field1711] = this.method2493(var12, var12.field1714[var13]);
                    this.field1711++;
                }
                for (int var14 = 0; var14 < var12.field1722; var14++) {
                    byte var15 = this.field1739[this.field1722] = var12.field1739[var14];
                    if (var15 == 0) {
                        this.field1716[this.field1722] = (short) this.method2493(var12, var12.field1716[var14]);
                        this.field1725[this.field1722] = (short) this.method2493(var12, var12.field1725[var14]);
                        this.field1726[this.field1722] = (short) this.method2493(var12, var12.field1726[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1716[this.field1722] = var12.field1716[var14];
                        this.field1725[this.field1722] = var12.field1725[var14];
                        this.field1726[this.field1722] = var12.field1726[var14];
                        this.field1727[this.field1722] = var12.field1727[var14];
                        this.field1724[this.field1722] = var12.field1724[var14];
                        this.field1729[this.field1722] = var12.field1729[var14];
                        this.field1710[this.field1722] = var12.field1710[var14];
                        this.field1733[this.field1722] = var12.field1733[var14];
                        this.field1731[this.field1722] = var12.field1731[var14];
                    }
                    if (var15 == 2) {
                        this.field1732[this.field1722] = var12.field1732[var14];
                    }
                    this.field1722++;
                }
            }
        }
    }

    @ObfuscatedName("df.r(Ldf;I)I")
    public final int method2493(class126 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1708[arg1];
        int var5 = arg0.field1709[arg1];
        int var6 = arg0.field1749[arg1];
        for (int var7 = 0; var7 < this.field1751; var7++) {
            if (this.field1708[var7] == var4 && this.field1709[var7] == var5 && this.field1749[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1708[this.field1751] = var4;
            this.field1709[this.field1751] = var5;
            this.field1749[this.field1751] = var6;
            if (arg0.field1734 != null) {
                this.field1734[this.field1751] = arg0.field1734[arg1];
            }
            var3 = this.field1751++;
        }
        return var3;
    }

    public class126(class126 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1751 = arg0.field1751;
        this.field1711 = arg0.field1711;
        this.field1722 = arg0.field1722;
        if (arg1) {
            this.field1708 = arg0.field1708;
            this.field1709 = arg0.field1709;
            this.field1749 = arg0.field1749;
        } else {
            this.field1708 = new int[this.field1751];
            this.field1709 = new int[this.field1751];
            this.field1749 = new int[this.field1751];
            for (int var6 = 0; var6 < this.field1751; var6++) {
                this.field1708[var6] = arg0.field1708[var6];
                this.field1709[var6] = arg0.field1709[var6];
                this.field1749[var6] = arg0.field1749[var6];
            }
        }
        if (arg2) {
            this.field1719 = arg0.field1719;
        } else {
            this.field1719 = new short[this.field1711];
            for (int var7 = 0; var7 < this.field1711; var7++) {
                this.field1719[var7] = arg0.field1719[var7];
            }
        }
        if (arg3 || arg0.field1720 == null) {
            this.field1720 = arg0.field1720;
        } else {
            this.field1720 = new short[this.field1711];
            for (int var8 = 0; var8 < this.field1711; var8++) {
                this.field1720[var8] = arg0.field1720[var8];
            }
        }
        if (arg4) {
            this.field1717 = arg0.field1717;
        } else {
            this.field1717 = new byte[this.field1711];
            if (arg0.field1717 == null) {
                for (int var9 = 0; var9 < this.field1711; var9++) {
                    this.field1717[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1711; var10++) {
                    this.field1717[var10] = arg0.field1717[var10];
                }
            }
        }
        this.field1712 = arg0.field1712;
        this.field1718 = arg0.field1718;
        this.field1714 = arg0.field1714;
        this.field1730 = arg0.field1730;
        this.field1741 = arg0.field1741;
        this.field1750 = arg0.field1750;
        this.field1721 = arg0.field1721;
        this.field1739 = arg0.field1739;
        this.field1716 = arg0.field1716;
        this.field1725 = arg0.field1725;
        this.field1726 = arg0.field1726;
        this.field1727 = arg0.field1727;
        this.field1724 = arg0.field1724;
        this.field1729 = arg0.field1729;
        this.field1710 = arg0.field1710;
        this.field1733 = arg0.field1733;
        this.field1731 = arg0.field1731;
        this.field1732 = arg0.field1732;
        this.field1734 = arg0.field1734;
        this.field1735 = arg0.field1735;
        this.field1736 = arg0.field1736;
        this.field1737 = arg0.field1737;
        this.field1713 = arg0.field1713;
        this.field1738 = arg0.field1738;
        this.field1740 = arg0.field1740;
        this.field1715 = arg0.field1715;
        this.field1742 = arg0.field1742;
    }

    @ObfuscatedName("df.e()Ldf;")
    public class126 method2434() {
        class126 var1 = new class126();
        if (this.field1730 != null) {
            var1.field1730 = new byte[this.field1711];
            for (int var2 = 0; var2 < this.field1711; var2++) {
                var1.field1730[var2] = this.field1730[var2];
            }
        }
        var1.field1751 = this.field1751;
        var1.field1711 = this.field1711;
        var1.field1722 = this.field1722;
        var1.field1708 = this.field1708;
        var1.field1709 = this.field1709;
        var1.field1749 = this.field1749;
        var1.field1712 = this.field1712;
        var1.field1718 = this.field1718;
        var1.field1714 = this.field1714;
        var1.field1741 = this.field1741;
        var1.field1717 = this.field1717;
        var1.field1750 = this.field1750;
        var1.field1719 = this.field1719;
        var1.field1720 = this.field1720;
        var1.field1721 = this.field1721;
        var1.field1739 = this.field1739;
        var1.field1716 = this.field1716;
        var1.field1725 = this.field1725;
        var1.field1726 = this.field1726;
        var1.field1727 = this.field1727;
        var1.field1724 = this.field1724;
        var1.field1729 = this.field1729;
        var1.field1710 = this.field1710;
        var1.field1733 = this.field1733;
        var1.field1731 = this.field1731;
        var1.field1732 = this.field1732;
        var1.field1734 = this.field1734;
        var1.field1735 = this.field1735;
        var1.field1736 = this.field1736;
        var1.field1737 = this.field1737;
        var1.field1713 = this.field1713;
        var1.field1738 = this.field1738;
        var1.field1715 = this.field1715;
        var1.field1742 = this.field1742;
        return var1;
    }

    @ObfuscatedName("df.y([[IIIIZI)Ldf;")
    public class126 method2435(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2447();
        int var7 = this.field1745 + arg1;
        int var8 = this.field1746 + arg1;
        int var9 = this.field1748 + arg3;
        int var10 = this.field1747 + arg3;
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
        class126 var15;
        if (arg4) {
            var15 = new class126();
            var15.field1751 = this.field1751;
            var15.field1711 = this.field1711;
            var15.field1722 = this.field1722;
            var15.field1708 = this.field1708;
            var15.field1749 = this.field1749;
            var15.field1712 = this.field1712;
            var15.field1718 = this.field1718;
            var15.field1714 = this.field1714;
            var15.field1730 = this.field1730;
            var15.field1741 = this.field1741;
            var15.field1717 = this.field1717;
            var15.field1750 = this.field1750;
            var15.field1719 = this.field1719;
            var15.field1720 = this.field1720;
            var15.field1721 = this.field1721;
            var15.field1739 = this.field1739;
            var15.field1716 = this.field1716;
            var15.field1725 = this.field1725;
            var15.field1726 = this.field1726;
            var15.field1727 = this.field1727;
            var15.field1724 = this.field1724;
            var15.field1729 = this.field1729;
            var15.field1710 = this.field1710;
            var15.field1733 = this.field1733;
            var15.field1731 = this.field1731;
            var15.field1732 = this.field1732;
            var15.field1734 = this.field1734;
            var15.field1735 = this.field1735;
            var15.field1736 = this.field1736;
            var15.field1737 = this.field1737;
            var15.field1715 = this.field1715;
            var15.field1742 = this.field1742;
            var15.field1709 = new int[var15.field1751];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1751; var16++) {
                int var17 = this.field1708[var16] + arg1;
                int var18 = this.field1749[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1709[var16] = this.field1709[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1751; var26++) {
                int var27 = (-this.field1709[var26] << 16) / this.field2027;
                if (var27 < arg5) {
                    int var28 = this.field1708[var26] + arg1;
                    int var29 = this.field1749[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1709[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1709[var26];
                }
            }
        }
        var15.method2427();
        return var15;
    }

    @ObfuscatedName("df.k()V")
    public void method2450() {
        int var10002;
        if (this.field1734 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1751; var3++) {
                int var4 = this.field1734[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1736 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1736[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1751) {
                int var7 = this.field1734[var6];
                this.field1736[var7][var1[var7]++] = var6++;
            }
            this.field1734 = null;
        }
        if (this.field1735 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1711; var10++) {
            int var11 = this.field1735[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1737 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1737[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1711) {
            int var14 = this.field1735[var13];
            this.field1737[var14][var8[var14]++] = var13++;
        }
        this.field1735 = null;
    }

    @ObfuscatedName("df.s()V")
    public void method2480() {
        for (int var1 = 0; var1 < this.field1751; var1++) {
            int var2 = this.field1708[var1];
            this.field1708[var1] = this.field1749[var1];
            this.field1749[var1] = -var2;
        }
        this.method2427();
    }

    @ObfuscatedName("df.h()V")
    public void method2438() {
        for (int var1 = 0; var1 < this.field1751; var1++) {
            this.field1708[var1] = -this.field1708[var1];
            this.field1749[var1] = -this.field1749[var1];
        }
        this.method2427();
    }

    @ObfuscatedName("df.t()V")
    public void method2437() {
        for (int var1 = 0; var1 < this.field1751; var1++) {
            int var2 = this.field1749[var1];
            this.field1749[var1] = this.field1708[var1];
            this.field1708[var1] = -var2;
        }
        this.method2427();
    }

    @ObfuscatedName("df.i(I)V")
    public void method2453(int arg0) {
        int var2 = field1752[arg0];
        int var3 = field1753[arg0];
        for (int var4 = 0; var4 < this.field1751; var4++) {
            int var5 = this.field1749[var4] * var2 + this.field1708[var4] * var3 >> 16;
            this.field1749[var4] = this.field1749[var4] * var3 - this.field1708[var4] * var2 >> 16;
            this.field1708[var4] = var5;
        }
        this.method2427();
    }

    @ObfuscatedName("df.u(III)V")
    public void method2440(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1751; var4++) {
            this.field1708[var4] += arg0;
            this.field1709[var4] += arg1;
            this.field1749[var4] += arg2;
        }
        this.method2427();
    }

    @ObfuscatedName("df.q(SS)V")
    public void method2441(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1711; var3++) {
            if (this.field1719[var3] == arg0) {
                this.field1719[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("df.v(SS)V")
    public void method2442(short arg0, short arg1) {
        if (this.field1720 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1711; var3++) {
            if (this.field1720[var3] == arg0) {
                this.field1720[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("df.f()V")
    public void method2457() {
        for (int var1 = 0; var1 < this.field1751; var1++) {
            this.field1749[var1] = -this.field1749[var1];
        }
        for (int var2 = 0; var2 < this.field1711; var2++) {
            int var3 = this.field1712[var2];
            this.field1712[var2] = this.field1714[var2];
            this.field1714[var2] = var3;
        }
        this.method2427();
    }

    @ObfuscatedName("df.b(III)V")
    public void method2444(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1751; var4++) {
            this.field1708[var4] = this.field1708[var4] * arg0 / 128;
            this.field1709[var4] = this.field1709[var4] * arg1 / 128;
            this.field1749[var4] = this.field1749[var4] * arg2 / 128;
        }
        this.method2427();
    }

    @ObfuscatedName("df.c()V")
    public void method2445() {
        if (this.field1713 != null) {
            return;
        }
        this.field1713 = new class134[this.field1751];
        for (int var1 = 0; var1 < this.field1751; var1++) {
            this.field1713[var1] = new class134();
        }
        for (int var2 = 0; var2 < this.field1711; var2++) {
            int var3 = this.field1712[var2];
            int var4 = this.field1718[var2];
            int var5 = this.field1714[var2];
            int var6 = this.field1708[var4] - this.field1708[var3];
            int var7 = this.field1709[var4] - this.field1709[var3];
            int var8 = this.field1749[var4] - this.field1749[var3];
            int var9 = this.field1708[var5] - this.field1708[var3];
            int var10 = this.field1709[var5] - this.field1709[var3];
            int var11 = this.field1749[var5] - this.field1749[var3];
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
            if (this.field1730 == null) {
                var19 = 0;
            } else {
                var19 = this.field1730[var2];
            }
            if (var19 == 0) {
                class134 var20 = this.field1713[var3];
                var20.field1918 += var16;
                var20.field1912 += var17;
                var20.field1914 += var18;
                var20.field1915++;
                class134 var21 = this.field1713[var4];
                var21.field1918 += var16;
                var21.field1912 += var17;
                var21.field1914 += var18;
                var21.field1915++;
                class134 var22 = this.field1713[var5];
                var22.field1918 += var16;
                var22.field1912 += var17;
                var22.field1914 += var18;
                var22.field1915++;
            } else if (var19 == 1) {
                if (this.field1738 == null) {
                    this.field1738 = new class142[this.field1711];
                }
                class142 var23 = this.field1738[var2] = new class142();
                var23.field2042 = var16;
                var23.field2045 = var17;
                var23.field2041 = var18;
            }
        }
    }

    @ObfuscatedName("df.w()V")
    public void method2427() {
        this.field1713 = null;
        this.field1740 = null;
        this.field1738 = null;
        this.field1728 = false;
    }

    @ObfuscatedName("df.o()V")
    public void method2447() {
        if (this.field1728) {
            return;
        }
        this.field2027 = 0;
        this.field1744 = 0;
        this.field1745 = 999999;
        this.field1746 = -999999;
        this.field1747 = -99999;
        this.field1748 = 99999;
        for (int var1 = 0; var1 < this.field1751; var1++) {
            int var2 = this.field1708[var1];
            int var3 = this.field1709[var1];
            int var4 = this.field1749[var1];
            if (var2 < this.field1745) {
                this.field1745 = var2;
            }
            if (var2 > this.field1746) {
                this.field1746 = var2;
            }
            if (var4 < this.field1748) {
                this.field1748 = var4;
            }
            if (var4 > this.field1747) {
                this.field1747 = var4;
            }
            if (-var3 > this.field2027) {
                this.field2027 = -var3;
            }
            if (var3 > this.field1744) {
                this.field1744 = var3;
            }
        }
        this.field1728 = true;
    }

    @ObfuscatedName("df.a(Ldf;Ldf;IIIZ)V")
    public static void method2448(class126 arg0, class126 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2447();
        arg0.method2445();
        arg1.method2447();
        arg1.method2445();
        field1707++;
        int var6 = 0;
        int[] var7 = arg1.field1708;
        int var8 = arg1.field1751;
        for (int var9 = 0; var9 < arg0.field1751; var9++) {
            class134 var10 = arg0.field1713[var9];
            if (var10.field1915 != 0) {
                int var11 = arg0.field1709[var9] - arg3;
                if (var11 <= arg1.field1744) {
                    int var12 = arg0.field1708[var9] - arg2;
                    if (var12 >= arg1.field1745 && var12 <= arg1.field1746) {
                        int var13 = arg0.field1749[var9] - arg4;
                        if (var13 >= arg1.field1748 && var13 <= arg1.field1747) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class134 var15 = arg1.field1713[var14];
                                if (var7[var14] == var12 && arg1.field1749[var14] == var13 && arg1.field1709[var14] == var11 && var15.field1915 != 0) {
                                    if (arg0.field1740 == null) {
                                        arg0.field1740 = new class134[arg0.field1751];
                                    }
                                    if (arg1.field1740 == null) {
                                        arg1.field1740 = new class134[var8];
                                    }
                                    class134 var16 = arg0.field1740[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1740[var9] = new class134(var10);
                                    }
                                    class134 var17 = arg1.field1740[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1740[var14] = new class134(var15);
                                    }
                                    var16.field1918 += var15.field1918;
                                    var16.field1912 += var15.field1912;
                                    var16.field1914 += var15.field1914;
                                    var16.field1915 += var15.field1915;
                                    var17.field1918 += var10.field1918;
                                    var17.field1912 += var10.field1912;
                                    var17.field1914 += var10.field1914;
                                    var17.field1915 += var10.field1915;
                                    var6++;
                                    field1743[var9] = field1707;
                                    field1723[var14] = field1707;
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
        for (int var18 = 0; var18 < arg0.field1711; var18++) {
            if (field1743[arg0.field1712[var18]] == field1707 && field1743[arg0.field1718[var18]] == field1707 && field1743[arg0.field1714[var18]] == field1707) {
                if (arg0.field1730 == null) {
                    arg0.field1730 = new byte[arg0.field1711];
                }
                arg0.field1730[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1711; var19++) {
            if (field1723[arg1.field1712[var19]] == field1707 && field1723[arg1.field1718[var19]] == field1707 && field1723[arg1.field1714[var19]] == field1707) {
                if (arg1.field1730 == null) {
                    arg1.field1730 = new byte[arg1.field1711];
                }
                arg1.field1730[var19] = 2;
            }
        }
    }

    @ObfuscatedName("df.ak(IIIII)Lel;")
    public final class132 method2449(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2445();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class132 var8 = new class132();
        var8.field1846 = new int[this.field1711];
        var8.field1851 = new int[this.field1711];
        var8.field1848 = new int[this.field1711];
        if (this.field1722 > 0 && this.field1750 != null) {
            int[] var9 = new int[this.field1722];
            for (int var10 = 0; var10 < this.field1711; var10++) {
                if (this.field1750[var10] != -1) {
                    var9[this.field1750[var10] & 0xFF]++;
                }
            }
            var8.field1841 = 0;
            for (int var11 = 0; var11 < this.field1722; var11++) {
                if (var9[var11] > 0 && this.field1739[var11] == 0) {
                    var8.field1841++;
                }
            }
            var8.field1855 = new int[var8.field1841];
            var8.field1856 = new int[var8.field1841];
            var8.field1857 = new int[var8.field1841];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1722; var13++) {
                if (var9[var13] > 0 && this.field1739[var13] == 0) {
                    var8.field1855[var12] = this.field1716[var13] & 0xFFFF;
                    var8.field1856[var12] = this.field1725[var13] & 0xFFFF;
                    var8.field1857[var12] = this.field1726[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1872 = new byte[this.field1711];
            for (int var14 = 0; var14 < this.field1711; var14++) {
                if (this.field1750[var14] == -1) {
                    var8.field1872[var14] = -1;
                } else {
                    var8.field1872[var14] = (byte) var9[this.field1750[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1711; var15++) {
            byte var16;
            if (this.field1730 == null) {
                var16 = 0;
            } else {
                var16 = this.field1730[var15];
            }
            byte var17;
            if (this.field1717 == null) {
                var17 = 0;
            } else {
                var17 = this.field1717[var15];
            }
            short var18;
            if (this.field1720 == null) {
                var18 = -1;
            } else {
                var18 = this.field1720[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1719[var15] & 0xFFFF;
                    class134 var20;
                    if (this.field1740 == null || this.field1740[this.field1712[var15]] == null) {
                        var20 = this.field1713[this.field1712[var15]];
                    } else {
                        var20 = this.field1740[this.field1712[var15]];
                    }
                    int var21 = (var20.field1914 * arg4 + var20.field1918 * arg2 + var20.field1912 * arg3) / (var20.field1915 * var7) + arg0;
                    var8.field1846[var15] = method2476(var19, var21);
                    class134 var22;
                    if (this.field1740 == null || this.field1740[this.field1718[var15]] == null) {
                        var22 = this.field1713[this.field1718[var15]];
                    } else {
                        var22 = this.field1740[this.field1718[var15]];
                    }
                    int var23 = (var22.field1914 * arg4 + var22.field1918 * arg2 + var22.field1912 * arg3) / (var22.field1915 * var7) + arg0;
                    var8.field1851[var15] = method2476(var19, var23);
                    class134 var24;
                    if (this.field1740 == null || this.field1740[this.field1714[var15]] == null) {
                        var24 = this.field1713[this.field1714[var15]];
                    } else {
                        var24 = this.field1740[this.field1714[var15]];
                    }
                    int var25 = (var24.field1914 * arg4 + var24.field1918 * arg2 + var24.field1912 * arg3) / (var24.field1915 * var7) + arg0;
                    var8.field1848[var15] = method2476(var19, var25);
                } else if (var16 == 1) {
                    class142 var26 = this.field1738[var15];
                    int var27 = (var26.field2041 * arg4 + var26.field2045 * arg3 + var26.field2042 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field1846[var15] = method2476(this.field1719[var15] & 0xFFFF, var27);
                    var8.field1848[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1846[var15] = 128;
                    var8.field1848[var15] = -1;
                } else {
                    var8.field1848[var15] = -2;
                }
            } else if (var16 == 0) {
                class134 var28;
                if (this.field1740 == null || this.field1740[this.field1712[var15]] == null) {
                    var28 = this.field1713[this.field1712[var15]];
                } else {
                    var28 = this.field1740[this.field1712[var15]];
                }
                int var29 = (var28.field1914 * arg4 + var28.field1918 * arg2 + var28.field1912 * arg3) / (var28.field1915 * var7) + arg0;
                var8.field1846[var15] = method2451(var29);
                class134 var30;
                if (this.field1740 == null || this.field1740[this.field1718[var15]] == null) {
                    var30 = this.field1713[this.field1718[var15]];
                } else {
                    var30 = this.field1740[this.field1718[var15]];
                }
                int var31 = (var30.field1914 * arg4 + var30.field1918 * arg2 + var30.field1912 * arg3) / (var30.field1915 * var7) + arg0;
                var8.field1851[var15] = method2451(var31);
                class134 var32;
                if (this.field1740 == null || this.field1740[this.field1714[var15]] == null) {
                    var32 = this.field1713[this.field1714[var15]];
                } else {
                    var32 = this.field1740[this.field1714[var15]];
                }
                int var33 = (var32.field1914 * arg4 + var32.field1918 * arg2 + var32.field1912 * arg3) / (var32.field1915 * var7) + arg0;
                var8.field1848[var15] = method2451(var33);
            } else if (var16 == 1) {
                class142 var34 = this.field1738[var15];
                int var35 = (var34.field2041 * arg4 + var34.field2045 * arg3 + var34.field2042 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field1846[var15] = method2451(var35);
                var8.field1848[var15] = -1;
            } else {
                var8.field1848[var15] = -2;
            }
        }
        this.method2450();
        var8.field1838 = this.field1751;
        var8.field1839 = this.field1708;
        var8.field1840 = this.field1709;
        var8.field1845 = this.field1749;
        var8.field1843 = this.field1711;
        var8.field1875 = this.field1712;
        var8.field1844 = this.field1718;
        var8.field1871 = this.field1714;
        var8.field1849 = this.field1741;
        var8.field1877 = this.field1717;
        var8.field1842 = this.field1721;
        var8.field1858 = this.field1736;
        var8.field1890 = this.field1737;
        var8.field1852 = this.field1720;
        return var8;
    }

    @ObfuscatedName("df.ap(II)I")
    public static final int method2476(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("df.ac(I)I")
    public static final int method2451(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
