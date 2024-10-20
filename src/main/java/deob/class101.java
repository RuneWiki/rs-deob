package deob;

@ObfuscatedName("cu")
public class class101 extends class94 {

    @ObfuscatedName("cu.b")
    public int field1712 = 0;

    @ObfuscatedName("cu.c")
    public int[] field1701;

    @ObfuscatedName("cu.j")
    public int[] field1726;

    @ObfuscatedName("cu.i")
    public int[] field1703;

    @ObfuscatedName("cu.k")
    public int field1704 = 0;

    @ObfuscatedName("cu.q")
    public int[] field1705;

    @ObfuscatedName("cu.t")
    public int[] field1746;

    @ObfuscatedName("cu.v")
    public int[] field1707;

    @ObfuscatedName("cu.y")
    public byte[] field1708;

    @ObfuscatedName("cu.w")
    public byte[] field1734;

    @ObfuscatedName("cu.g")
    public byte[] field1710;

    @ObfuscatedName("cu.s")
    public byte[] field1711;

    @ObfuscatedName("cu.n")
    public short[] field1700;

    @ObfuscatedName("cu.x")
    public short[] field1722;

    @ObfuscatedName("cu.o")
    public byte field1714 = 0;

    @ObfuscatedName("cu.l")
    public int field1715;

    @ObfuscatedName("cu.u")
    public byte[] field1742;

    @ObfuscatedName("cu.z")
    public short[] field1717;

    @ObfuscatedName("cu.d")
    public short[] field1718;

    @ObfuscatedName("cu.m")
    public short[] field1721;

    @ObfuscatedName("cu.f")
    public short[] field1720;

    @ObfuscatedName("cu.a")
    public short[] field1709;

    @ObfuscatedName("cu.h")
    public short[] field1725;

    @ObfuscatedName("cu.p")
    public short[] field1723;

    @ObfuscatedName("cu.e")
    public short[] field1724;

    @ObfuscatedName("cu.r")
    public short[] field1737;

    @ObfuscatedName("cu.av")
    public byte[] field1719;

    @ObfuscatedName("cu.an")
    public int[] field1727;

    @ObfuscatedName("cu.ae")
    public int[] field1728;

    @ObfuscatedName("cu.au")
    public int[][] field1729;

    @ObfuscatedName("cu.ag")
    public int[][] field1702;

    @ObfuscatedName("cu.at")
    public class92[] field1731;

    @ObfuscatedName("cu.ac")
    public class91[] field1732;

    @ObfuscatedName("cu.aw")
    public class91[] field1733;

    @ObfuscatedName("cu.ah")
    public short field1716;

    @ObfuscatedName("cu.ai")
    public short field1706;

    @ObfuscatedName("cu.ap")
    public boolean field1736 = false;

    @ObfuscatedName("cu.ad")
    public int field1739;

    @ObfuscatedName("cu.ay")
    public int field1738;

    @ObfuscatedName("cu.az")
    public int field1745;

    @ObfuscatedName("cu.ab")
    public int field1740;

    @ObfuscatedName("cu.am")
    public int field1741;

    @ObfuscatedName("cu.as")
    public static int[] field1730 = new int[10000];

    @ObfuscatedName("cu.aa")
    public static int[] field1743 = new int[10000];

    @ObfuscatedName("cu.af")
    public static int field1744 = 0;

    @ObfuscatedName("cu.ax")
    public static int[] field1713 = class104.field1800;

    @ObfuscatedName("cu.aq")
    public static int[] field1735 = class104.field1801;

    public class101() {
    }

    @ObfuscatedName("cu.b(Leo;II)Lcu;")
    public static class101 method2065(class153 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2964(arg1, arg2);
        return var3 == null ? null : new class101(var3);
    }

    public class101(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2073(arg0);
        } else {
            this.method2002(arg0);
        }
    }

    @ObfuscatedName("cu.j([B)V")
    public void method2073(byte[] arg0) {
        class127 var2 = new class127(arg0);
        class127 var3 = new class127(arg0);
        class127 var4 = new class127(arg0);
        class127 var5 = new class127(arg0);
        class127 var6 = new class127(arg0);
        class127 var7 = new class127(arg0);
        class127 var8 = new class127(arg0);
        var2.field2051 = arg0.length - 23;
        int var9 = var2.method2394();
        int var10 = var2.method2394();
        int var11 = var2.method2416();
        int var12 = var2.method2416();
        int var13 = var2.method2416();
        int var14 = var2.method2416();
        int var15 = var2.method2416();
        int var16 = var2.method2416();
        int var17 = var2.method2416();
        int var18 = var2.method2394();
        int var19 = var2.method2394();
        int var20 = var2.method2394();
        int var21 = var2.method2394();
        int var22 = var2.method2394();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1742 = new byte[var11];
            var2.field2051 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1742[var26] = var2.method2397();
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
        this.field1712 = var9;
        this.field1704 = var10;
        this.field1715 = var11;
        this.field1701 = new int[var9];
        this.field1726 = new int[var9];
        this.field1703 = new int[var9];
        this.field1705 = new int[var10];
        this.field1746 = new int[var10];
        this.field1707 = new int[var10];
        if (var17 == 1) {
            this.field1727 = new int[var9];
        }
        if (var12 == 1) {
            this.field1708 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1734 = new byte[var10];
        } else {
            this.field1714 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1710 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1728 = new int[var10];
        }
        if (var16 == 1) {
            this.field1722 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1711 = new byte[var10];
        }
        this.field1700 = new short[var10];
        if (var11 > 0) {
            this.field1717 = new short[var11];
            this.field1718 = new short[var11];
            this.field1721 = new short[var11];
            if (var24 > 0) {
                this.field1720 = new short[var24];
                this.field1709 = new short[var24];
                this.field1725 = new short[var24];
                this.field1723 = new short[var24];
                this.field1719 = new byte[var24];
                this.field1724 = new short[var24];
            }
            if (var25 > 0) {
                this.field1737 = new short[var25];
            }
        }
        var2.field2051 = var11;
        var3.field2051 = var44;
        var4.field2051 = var46;
        var5.field2051 = var48;
        var6.field2051 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2416();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2408();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2408();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2408();
            }
            this.field1701[var67] = var64 + var69;
            this.field1726[var67] = var65 + var70;
            this.field1703[var67] = var66 + var71;
            var64 = this.field1701[var67];
            var65 = this.field1726[var67];
            var66 = this.field1703[var67];
            if (var17 == 1) {
                this.field1727[var67] = var6.method2416();
            }
        }
        var2.field2051 = var42;
        var3.field2051 = var31;
        var4.field2051 = var34;
        var5.field2051 = var37;
        var6.field2051 = var35;
        var7.field2051 = var40;
        var8.field2051 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1700[var72] = (short) var2.method2394();
            if (var12 == 1) {
                this.field1708[var72] = var3.method2397();
            }
            if (var13 == 255) {
                this.field1734[var72] = var4.method2397();
            }
            if (var14 == 1) {
                this.field1710[var72] = var5.method2397();
            }
            if (var15 == 1) {
                this.field1728[var72] = var6.method2416();
            }
            if (var16 == 1) {
                this.field1722[var72] = (short) (var7.method2394() - 1);
            }
            if (this.field1711 != null && this.field1722[var72] != -1) {
                this.field1711[var72] = (byte) (var8.method2416() - 1);
            }
        }
        var2.field2051 = var33;
        var3.field2051 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2416();
            if (var78 == 1) {
                var73 = var2.method2408() + var76;
                var74 = var2.method2408() + var73;
                var75 = var2.method2408() + var74;
                var76 = var75;
                this.field1705[var77] = var73;
                this.field1746[var77] = var74;
                this.field1707[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2408() + var76;
                var76 = var75;
                this.field1705[var77] = var73;
                this.field1746[var77] = var74;
                this.field1707[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2408() + var76;
                var76 = var75;
                this.field1705[var77] = var73;
                this.field1746[var77] = var74;
                this.field1707[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2408() + var76;
                var76 = var75;
                this.field1705[var77] = var73;
                this.field1746[var77] = var81;
                this.field1707[var77] = var75;
            }
        }
        var2.field2051 = var50;
        var3.field2051 = var52;
        var4.field2051 = var54;
        var5.field2051 = var56;
        var6.field2051 = var58;
        var7.field2051 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1742[var82] & 0xFF;
            if (var83 == 0) {
                this.field1717[var82] = (short) var2.method2394();
                this.field1718[var82] = (short) var2.method2394();
                this.field1721[var82] = (short) var2.method2394();
            }
            if (var83 == 1) {
                this.field1717[var82] = (short) var3.method2394();
                this.field1718[var82] = (short) var3.method2394();
                this.field1721[var82] = (short) var3.method2394();
                this.field1720[var82] = (short) var4.method2394();
                this.field1709[var82] = (short) var4.method2394();
                this.field1725[var82] = (short) var4.method2394();
                this.field1723[var82] = (short) var5.method2394();
                this.field1719[var82] = var6.method2397();
                this.field1724[var82] = (short) var7.method2394();
            }
            if (var83 == 2) {
                this.field1717[var82] = (short) var3.method2394();
                this.field1718[var82] = (short) var3.method2394();
                this.field1721[var82] = (short) var3.method2394();
                this.field1720[var82] = (short) var4.method2394();
                this.field1709[var82] = (short) var4.method2394();
                this.field1725[var82] = (short) var4.method2394();
                this.field1723[var82] = (short) var5.method2394();
                this.field1719[var82] = var6.method2397();
                this.field1724[var82] = (short) var7.method2394();
                this.field1737[var82] = (short) var7.method2394();
            }
            if (var83 == 3) {
                this.field1717[var82] = (short) var3.method2394();
                this.field1718[var82] = (short) var3.method2394();
                this.field1721[var82] = (short) var3.method2394();
                this.field1720[var82] = (short) var4.method2394();
                this.field1709[var82] = (short) var4.method2394();
                this.field1725[var82] = (short) var4.method2394();
                this.field1723[var82] = (short) var5.method2394();
                this.field1719[var82] = var6.method2397();
                this.field1724[var82] = (short) var7.method2394();
            }
        }
        var2.field2051 = var62;
        int var84 = var2.method2416();
        if (var84 == 0) {
            return;
        }
        new class103();
        var2.method2394();
        var2.method2394();
        var2.method2394();
        var2.method2455();
    }

    @ObfuscatedName("cu.i([B)V")
    public void method2002(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class127 var4 = new class127(arg0);
        class127 var5 = new class127(arg0);
        class127 var6 = new class127(arg0);
        class127 var7 = new class127(arg0);
        class127 var8 = new class127(arg0);
        var4.field2051 = arg0.length - 18;
        int var9 = var4.method2394();
        int var10 = var4.method2394();
        int var11 = var4.method2416();
        int var12 = var4.method2416();
        int var13 = var4.method2416();
        int var14 = var4.method2416();
        int var15 = var4.method2416();
        int var16 = var4.method2416();
        int var17 = var4.method2394();
        int var18 = var4.method2394();
        int var19 = var4.method2394();
        int var20 = var4.method2394();
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
        this.field1712 = var9;
        this.field1704 = var10;
        this.field1715 = var11;
        this.field1701 = new int[var9];
        this.field1726 = new int[var9];
        this.field1703 = new int[var9];
        this.field1705 = new int[var10];
        this.field1746 = new int[var10];
        this.field1707 = new int[var10];
        if (var11 > 0) {
            this.field1742 = new byte[var11];
            this.field1717 = new short[var11];
            this.field1718 = new short[var11];
            this.field1721 = new short[var11];
        }
        if (var16 == 1) {
            this.field1727 = new int[var9];
        }
        if (var12 == 1) {
            this.field1708 = new byte[var10];
            this.field1711 = new byte[var10];
            this.field1722 = new short[var10];
        }
        if (var13 == 255) {
            this.field1734 = new byte[var10];
        } else {
            this.field1714 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1710 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1728 = new int[var10];
        }
        this.field1700 = new short[var10];
        var4.field2051 = var21;
        var5.field2051 = var36;
        var6.field2051 = var38;
        var7.field2051 = var40;
        var8.field2051 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2416();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2408();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2408();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2408();
            }
            this.field1701[var46] = var43 + var48;
            this.field1726[var46] = var44 + var49;
            this.field1703[var46] = var45 + var50;
            var43 = this.field1701[var46];
            var44 = this.field1726[var46];
            var45 = this.field1703[var46];
            if (var16 == 1) {
                this.field1727[var46] = var8.method2416();
            }
        }
        var4.field2051 = var32;
        var5.field2051 = var28;
        var6.field2051 = var26;
        var7.field2051 = var30;
        var8.field2051 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1700[var51] = (short) var4.method2394();
            if (var12 == 1) {
                int var52 = var5.method2416();
                if ((var52 & 0x1) == 1) {
                    this.field1708[var51] = 1;
                    var2 = true;
                } else {
                    this.field1708[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1711[var51] = (byte) (var52 >> 2);
                    this.field1722[var51] = this.field1700[var51];
                    this.field1700[var51] = 127;
                    if (this.field1722[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1711[var51] = -1;
                    this.field1722[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1734[var51] = var6.method2397();
            }
            if (var14 == 1) {
                this.field1710[var51] = var7.method2397();
            }
            if (var15 == 1) {
                this.field1728[var51] = var8.method2416();
            }
        }
        var4.field2051 = var25;
        var5.field2051 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2416();
            if (var58 == 1) {
                var53 = var4.method2408() + var56;
                var54 = var4.method2408() + var53;
                var55 = var4.method2408() + var54;
                var56 = var55;
                this.field1705[var57] = var53;
                this.field1746[var57] = var54;
                this.field1707[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2408() + var56;
                var56 = var55;
                this.field1705[var57] = var53;
                this.field1746[var57] = var54;
                this.field1707[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2408() + var56;
                var56 = var55;
                this.field1705[var57] = var53;
                this.field1746[var57] = var54;
                this.field1707[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2408() + var56;
                var56 = var55;
                this.field1705[var57] = var53;
                this.field1746[var57] = var61;
                this.field1707[var57] = var55;
            }
        }
        var4.field2051 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1742[var62] = 0;
            this.field1717[var62] = (short) var4.method2394();
            this.field1718[var62] = (short) var4.method2394();
            this.field1721[var62] = (short) var4.method2394();
        }
        if (this.field1711 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1711[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1717[var65] & 0xFFFF) == this.field1705[var64] && (this.field1718[var65] & 0xFFFF) == this.field1746[var64] && (this.field1721[var65] & 0xFFFF) == this.field1707[var64]) {
                        this.field1711[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1711 = null;
            }
        }
        if (!var3) {
            this.field1722 = null;
        }
        if (!var2) {
            this.field1708 = null;
        }
    }

    public class101(class101[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1712 = 0;
        this.field1704 = 0;
        this.field1715 = 0;
        this.field1714 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class101 var10 = arg0[var9];
            if (var10 != null) {
                this.field1712 += var10.field1712;
                this.field1704 += var10.field1704;
                this.field1715 += var10.field1715;
                if (var10.field1734 == null) {
                    if (this.field1714 == -1) {
                        this.field1714 = var10.field1714;
                    }
                    if (this.field1714 != var10.field1714) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1708 != null;
                var5 |= var10.field1710 != null;
                var6 |= var10.field1728 != null;
                var7 |= var10.field1722 != null;
                var8 |= var10.field1711 != null;
            }
        }
        this.field1701 = new int[this.field1712];
        this.field1726 = new int[this.field1712];
        this.field1703 = new int[this.field1712];
        this.field1727 = new int[this.field1712];
        this.field1705 = new int[this.field1704];
        this.field1746 = new int[this.field1704];
        this.field1707 = new int[this.field1704];
        if (var3) {
            this.field1708 = new byte[this.field1704];
        }
        if (var4) {
            this.field1734 = new byte[this.field1704];
        }
        if (var5) {
            this.field1710 = new byte[this.field1704];
        }
        if (var6) {
            this.field1728 = new int[this.field1704];
        }
        if (var7) {
            this.field1722 = new short[this.field1704];
        }
        if (var8) {
            this.field1711 = new byte[this.field1704];
        }
        this.field1700 = new short[this.field1704];
        if (this.field1715 > 0) {
            this.field1742 = new byte[this.field1715];
            this.field1717 = new short[this.field1715];
            this.field1718 = new short[this.field1715];
            this.field1721 = new short[this.field1715];
            this.field1720 = new short[this.field1715];
            this.field1709 = new short[this.field1715];
            this.field1725 = new short[this.field1715];
            this.field1723 = new short[this.field1715];
            this.field1719 = new byte[this.field1715];
            this.field1724 = new short[this.field1715];
            this.field1737 = new short[this.field1715];
        }
        this.field1712 = 0;
        this.field1704 = 0;
        this.field1715 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class101 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1704; var13++) {
                    if (var3 && var12.field1708 != null) {
                        this.field1708[this.field1704] = var12.field1708[var13];
                    }
                    if (var4) {
                        if (var12.field1734 == null) {
                            this.field1734[this.field1704] = var12.field1714;
                        } else {
                            this.field1734[this.field1704] = var12.field1734[var13];
                        }
                    }
                    if (var5 && var12.field1710 != null) {
                        this.field1710[this.field1704] = var12.field1710[var13];
                    }
                    if (var6 && var12.field1728 != null) {
                        this.field1728[this.field1704] = var12.field1728[var13];
                    }
                    if (var7) {
                        if (var12.field1722 == null) {
                            this.field1722[this.field1704] = -1;
                        } else {
                            this.field1722[this.field1704] = var12.field1722[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1711 == null || var12.field1711[var13] == -1) {
                            this.field1711[this.field1704] = -1;
                        } else {
                            this.field1711[this.field1704] = (byte) (var12.field1711[var13] + this.field1715);
                        }
                    }
                    this.field1700[this.field1704] = var12.field1700[var13];
                    this.field1705[this.field1704] = this.method2035(var12, var12.field1705[var13]);
                    this.field1746[this.field1704] = this.method2035(var12, var12.field1746[var13]);
                    this.field1707[this.field1704] = this.method2035(var12, var12.field1707[var13]);
                    this.field1704++;
                }
                for (int var14 = 0; var14 < var12.field1715; var14++) {
                    byte var15 = this.field1742[this.field1715] = var12.field1742[var14];
                    if (var15 == 0) {
                        this.field1717[this.field1715] = (short) this.method2035(var12, var12.field1717[var14]);
                        this.field1718[this.field1715] = (short) this.method2035(var12, var12.field1718[var14]);
                        this.field1721[this.field1715] = (short) this.method2035(var12, var12.field1721[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1717[this.field1715] = var12.field1717[var14];
                        this.field1718[this.field1715] = var12.field1718[var14];
                        this.field1721[this.field1715] = var12.field1721[var14];
                        this.field1720[this.field1715] = var12.field1720[var14];
                        this.field1709[this.field1715] = var12.field1709[var14];
                        this.field1725[this.field1715] = var12.field1725[var14];
                        this.field1723[this.field1715] = var12.field1723[var14];
                        this.field1719[this.field1715] = var12.field1719[var14];
                        this.field1724[this.field1715] = var12.field1724[var14];
                    }
                    if (var15 == 2) {
                        this.field1737[this.field1715] = var12.field1737[var14];
                    }
                    this.field1715++;
                }
            }
        }
    }

    @ObfuscatedName("cu.v(Lcu;I)I")
    public final int method2035(class101 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1701[arg1];
        int var5 = arg0.field1726[arg1];
        int var6 = arg0.field1703[arg1];
        for (int var7 = 0; var7 < this.field1712; var7++) {
            if (this.field1701[var7] == var4 && this.field1726[var7] == var5 && this.field1703[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1701[this.field1712] = var4;
            this.field1726[this.field1712] = var5;
            this.field1703[this.field1712] = var6;
            if (arg0.field1727 != null) {
                this.field1727[this.field1712] = arg0.field1727[arg1];
            }
            var3 = this.field1712++;
        }
        return var3;
    }

    public class101(class101 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1712 = arg0.field1712;
        this.field1704 = arg0.field1704;
        this.field1715 = arg0.field1715;
        if (arg1) {
            this.field1701 = arg0.field1701;
            this.field1726 = arg0.field1726;
            this.field1703 = arg0.field1703;
        } else {
            this.field1701 = new int[this.field1712];
            this.field1726 = new int[this.field1712];
            this.field1703 = new int[this.field1712];
            for (int var6 = 0; var6 < this.field1712; var6++) {
                this.field1701[var6] = arg0.field1701[var6];
                this.field1726[var6] = arg0.field1726[var6];
                this.field1703[var6] = arg0.field1703[var6];
            }
        }
        if (arg2) {
            this.field1700 = arg0.field1700;
        } else {
            this.field1700 = new short[this.field1704];
            for (int var7 = 0; var7 < this.field1704; var7++) {
                this.field1700[var7] = arg0.field1700[var7];
            }
        }
        if (arg3 || arg0.field1722 == null) {
            this.field1722 = arg0.field1722;
        } else {
            this.field1722 = new short[this.field1704];
            for (int var8 = 0; var8 < this.field1704; var8++) {
                this.field1722[var8] = arg0.field1722[var8];
            }
        }
        if (arg4) {
            this.field1710 = arg0.field1710;
        } else {
            this.field1710 = new byte[this.field1704];
            if (arg0.field1710 == null) {
                for (int var9 = 0; var9 < this.field1704; var9++) {
                    this.field1710[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1704; var10++) {
                    this.field1710[var10] = arg0.field1710[var10];
                }
            }
        }
        this.field1705 = arg0.field1705;
        this.field1746 = arg0.field1746;
        this.field1707 = arg0.field1707;
        this.field1708 = arg0.field1708;
        this.field1734 = arg0.field1734;
        this.field1711 = arg0.field1711;
        this.field1714 = arg0.field1714;
        this.field1742 = arg0.field1742;
        this.field1717 = arg0.field1717;
        this.field1718 = arg0.field1718;
        this.field1721 = arg0.field1721;
        this.field1720 = arg0.field1720;
        this.field1709 = arg0.field1709;
        this.field1725 = arg0.field1725;
        this.field1723 = arg0.field1723;
        this.field1719 = arg0.field1719;
        this.field1724 = arg0.field1724;
        this.field1737 = arg0.field1737;
        this.field1727 = arg0.field1727;
        this.field1728 = arg0.field1728;
        this.field1729 = arg0.field1729;
        this.field1702 = arg0.field1702;
        this.field1732 = arg0.field1732;
        this.field1731 = arg0.field1731;
        this.field1733 = arg0.field1733;
        this.field1716 = arg0.field1716;
        this.field1706 = arg0.field1706;
    }

    @ObfuscatedName("cu.y()Lcu;")
    public class101 method2063() {
        class101 var1 = new class101();
        if (this.field1708 != null) {
            var1.field1708 = new byte[this.field1704];
            for (int var2 = 0; var2 < this.field1704; var2++) {
                var1.field1708[var2] = this.field1708[var2];
            }
        }
        var1.field1712 = this.field1712;
        var1.field1704 = this.field1704;
        var1.field1715 = this.field1715;
        var1.field1701 = this.field1701;
        var1.field1726 = this.field1726;
        var1.field1703 = this.field1703;
        var1.field1705 = this.field1705;
        var1.field1746 = this.field1746;
        var1.field1707 = this.field1707;
        var1.field1734 = this.field1734;
        var1.field1710 = this.field1710;
        var1.field1711 = this.field1711;
        var1.field1700 = this.field1700;
        var1.field1722 = this.field1722;
        var1.field1714 = this.field1714;
        var1.field1742 = this.field1742;
        var1.field1717 = this.field1717;
        var1.field1718 = this.field1718;
        var1.field1721 = this.field1721;
        var1.field1720 = this.field1720;
        var1.field1709 = this.field1709;
        var1.field1725 = this.field1725;
        var1.field1723 = this.field1723;
        var1.field1719 = this.field1719;
        var1.field1724 = this.field1724;
        var1.field1737 = this.field1737;
        var1.field1727 = this.field1727;
        var1.field1728 = this.field1728;
        var1.field1729 = this.field1729;
        var1.field1702 = this.field1702;
        var1.field1732 = this.field1732;
        var1.field1731 = this.field1731;
        var1.field1716 = this.field1716;
        var1.field1706 = this.field1706;
        return var1;
    }

    @ObfuscatedName("cu.w([[IIIIZI)Lcu;")
    public class101 method2005(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2017();
        int var7 = this.field1738 + arg1;
        int var8 = this.field1745 + arg1;
        int var9 = this.field1741 + arg3;
        int var10 = this.field1740 + arg3;
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
            var15.field1712 = this.field1712;
            var15.field1704 = this.field1704;
            var15.field1715 = this.field1715;
            var15.field1701 = this.field1701;
            var15.field1703 = this.field1703;
            var15.field1705 = this.field1705;
            var15.field1746 = this.field1746;
            var15.field1707 = this.field1707;
            var15.field1708 = this.field1708;
            var15.field1734 = this.field1734;
            var15.field1710 = this.field1710;
            var15.field1711 = this.field1711;
            var15.field1700 = this.field1700;
            var15.field1722 = this.field1722;
            var15.field1714 = this.field1714;
            var15.field1742 = this.field1742;
            var15.field1717 = this.field1717;
            var15.field1718 = this.field1718;
            var15.field1721 = this.field1721;
            var15.field1720 = this.field1720;
            var15.field1709 = this.field1709;
            var15.field1725 = this.field1725;
            var15.field1723 = this.field1723;
            var15.field1719 = this.field1719;
            var15.field1724 = this.field1724;
            var15.field1737 = this.field1737;
            var15.field1727 = this.field1727;
            var15.field1728 = this.field1728;
            var15.field1729 = this.field1729;
            var15.field1702 = this.field1702;
            var15.field1716 = this.field1716;
            var15.field1706 = this.field1706;
            var15.field1726 = new int[var15.field1712];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1712; var16++) {
                int var17 = this.field1701[var16] + arg1;
                int var18 = this.field1703[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1726[var16] = this.field1726[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1712; var26++) {
                int var27 = (-this.field1726[var26] << 16) / this.field1572;
                if (var27 < arg5) {
                    int var28 = this.field1701[var26] + arg1;
                    int var29 = this.field1703[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1726[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1726[var26];
                }
            }
        }
        var15.method2016();
        return var15;
    }

    @ObfuscatedName("cu.g()V")
    public void method2006() {
        int var10002;
        if (this.field1727 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1712; var3++) {
                int var4 = this.field1727[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1729 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1729[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1712) {
                int var7 = this.field1727[var6];
                this.field1729[var7][var1[var7]++] = var6++;
            }
            this.field1727 = null;
        }
        if (this.field1728 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1704; var10++) {
            int var11 = this.field1728[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1702 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1702[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1704) {
            int var14 = this.field1728[var13];
            this.field1702[var14][var8[var14]++] = var13++;
        }
        this.field1728 = null;
    }

    @ObfuscatedName("cu.s()V")
    public void method2054() {
        for (int var1 = 0; var1 < this.field1712; var1++) {
            int var2 = this.field1701[var1];
            this.field1701[var1] = this.field1703[var1];
            this.field1703[var1] = -var2;
        }
        this.method2016();
    }

    @ObfuscatedName("cu.n()V")
    public void method2008() {
        for (int var1 = 0; var1 < this.field1712; var1++) {
            this.field1701[var1] = -this.field1701[var1];
            this.field1703[var1] = -this.field1703[var1];
        }
        this.method2016();
    }

    @ObfuscatedName("cu.x()V")
    public void method2009() {
        for (int var1 = 0; var1 < this.field1712; var1++) {
            int var2 = this.field1703[var1];
            this.field1703[var1] = this.field1701[var1];
            this.field1701[var1] = -var2;
        }
        this.method2016();
    }

    @ObfuscatedName("cu.o(I)V")
    public void method2010(int arg0) {
        int var2 = field1713[arg0];
        int var3 = field1735[arg0];
        for (int var4 = 0; var4 < this.field1712; var4++) {
            int var5 = this.field1703[var4] * var2 + this.field1701[var4] * var3 >> 16;
            this.field1703[var4] = this.field1703[var4] * var3 - this.field1701[var4] * var2 >> 16;
            this.field1701[var4] = var5;
        }
        this.method2016();
    }

    @ObfuscatedName("cu.l(III)V")
    public void method2067(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1712; var4++) {
            this.field1701[var4] += arg0;
            this.field1726[var4] += arg1;
            this.field1703[var4] += arg2;
        }
        this.method2016();
    }

    @ObfuscatedName("cu.u(SS)V")
    public void method2077(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1704; var3++) {
            if (this.field1700[var3] == arg0) {
                this.field1700[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cu.z(SS)V")
    public void method2013(short arg0, short arg1) {
        if (this.field1722 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1704; var3++) {
            if (this.field1722[var3] == arg0) {
                this.field1722[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cu.d()V")
    public void method2014() {
        for (int var1 = 0; var1 < this.field1712; var1++) {
            this.field1703[var1] = -this.field1703[var1];
        }
        for (int var2 = 0; var2 < this.field1704; var2++) {
            int var3 = this.field1705[var2];
            this.field1705[var2] = this.field1707[var2];
            this.field1707[var2] = var3;
        }
        this.method2016();
    }

    @ObfuscatedName("cu.m(III)V")
    public void method2022(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1712; var4++) {
            this.field1701[var4] = this.field1701[var4] * arg0 / 128;
            this.field1726[var4] = this.field1726[var4] * arg1 / 128;
            this.field1703[var4] = this.field1703[var4] * arg2 / 128;
        }
        this.method2016();
    }

    @ObfuscatedName("cu.f()V")
    public void method2015() {
        if (this.field1732 != null) {
            return;
        }
        this.field1732 = new class91[this.field1712];
        for (int var1 = 0; var1 < this.field1712; var1++) {
            this.field1732[var1] = new class91();
        }
        for (int var2 = 0; var2 < this.field1704; var2++) {
            int var3 = this.field1705[var2];
            int var4 = this.field1746[var2];
            int var5 = this.field1707[var2];
            int var6 = this.field1701[var4] - this.field1701[var3];
            int var7 = this.field1726[var4] - this.field1726[var3];
            int var8 = this.field1703[var4] - this.field1703[var3];
            int var9 = this.field1701[var5] - this.field1701[var3];
            int var10 = this.field1726[var5] - this.field1726[var3];
            int var11 = this.field1703[var5] - this.field1703[var3];
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
            if (this.field1708 == null) {
                var19 = 0;
            } else {
                var19 = this.field1708[var2];
            }
            if (var19 == 0) {
                class91 var20 = this.field1732[var3];
                var20.field1534 += var16;
                var20.field1535 += var17;
                var20.field1537 += var18;
                var20.field1538++;
                class91 var21 = this.field1732[var4];
                var21.field1534 += var16;
                var21.field1535 += var17;
                var21.field1537 += var18;
                var21.field1538++;
                class91 var22 = this.field1732[var5];
                var22.field1534 += var16;
                var22.field1535 += var17;
                var22.field1537 += var18;
                var22.field1538++;
            } else if (var19 == 1) {
                if (this.field1731 == null) {
                    this.field1731 = new class92[this.field1704];
                }
                class92 var23 = this.field1731[var2] = new class92();
                var23.field1546 = var16;
                var23.field1545 = var17;
                var23.field1544 = var18;
            }
        }
    }

    @ObfuscatedName("cu.r()V")
    public void method2016() {
        this.field1732 = null;
        this.field1733 = null;
        this.field1731 = null;
        this.field1736 = false;
    }

    @ObfuscatedName("cu.av()V")
    public void method2017() {
        if (this.field1736) {
            return;
        }
        this.field1572 = 0;
        this.field1739 = 0;
        this.field1738 = 999999;
        this.field1745 = -999999;
        this.field1740 = -99999;
        this.field1741 = 99999;
        for (int var1 = 0; var1 < this.field1712; var1++) {
            int var2 = this.field1701[var1];
            int var3 = this.field1726[var1];
            int var4 = this.field1703[var1];
            if (var2 < this.field1738) {
                this.field1738 = var2;
            }
            if (var2 > this.field1745) {
                this.field1745 = var2;
            }
            if (var4 < this.field1741) {
                this.field1741 = var4;
            }
            if (var4 > this.field1740) {
                this.field1740 = var4;
            }
            if (-var3 > this.field1572) {
                this.field1572 = -var3;
            }
            if (var3 > this.field1739) {
                this.field1739 = var3;
            }
        }
        this.field1736 = true;
    }

    @ObfuscatedName("cu.an(Lcu;Lcu;IIIZ)V")
    public static void method2018(class101 arg0, class101 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2017();
        arg0.method2015();
        arg1.method2017();
        arg1.method2015();
        field1744++;
        int var6 = 0;
        int[] var7 = arg1.field1701;
        int var8 = arg1.field1712;
        for (int var9 = 0; var9 < arg0.field1712; var9++) {
            class91 var10 = arg0.field1732[var9];
            if (var10.field1538 != 0) {
                int var11 = arg0.field1726[var9] - arg3;
                if (var11 <= arg1.field1739) {
                    int var12 = arg0.field1701[var9] - arg2;
                    if (var12 >= arg1.field1738 && var12 <= arg1.field1745) {
                        int var13 = arg0.field1703[var9] - arg4;
                        if (var13 >= arg1.field1741 && var13 <= arg1.field1740) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class91 var15 = arg1.field1732[var14];
                                if (var7[var14] == var12 && arg1.field1703[var14] == var13 && arg1.field1726[var14] == var11 && var15.field1538 != 0) {
                                    if (arg0.field1733 == null) {
                                        arg0.field1733 = new class91[arg0.field1712];
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
                                    var16.field1534 += var15.field1534;
                                    var16.field1535 += var15.field1535;
                                    var16.field1537 += var15.field1537;
                                    var16.field1538 += var15.field1538;
                                    var17.field1534 += var10.field1534;
                                    var17.field1535 += var10.field1535;
                                    var17.field1537 += var10.field1537;
                                    var17.field1538 += var10.field1538;
                                    var6++;
                                    field1730[var9] = field1744;
                                    field1743[var14] = field1744;
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
        for (int var18 = 0; var18 < arg0.field1704; var18++) {
            if (field1730[arg0.field1705[var18]] == field1744 && field1730[arg0.field1746[var18]] == field1744 && field1730[arg0.field1707[var18]] == field1744) {
                if (arg0.field1708 == null) {
                    arg0.field1708 = new byte[arg0.field1704];
                }
                arg0.field1708[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1704; var19++) {
            if (field1743[arg1.field1705[var19]] == field1744 && field1743[arg1.field1746[var19]] == field1744 && field1743[arg1.field1707[var19]] == field1744) {
                if (arg1.field1708 == null) {
                    arg1.field1708 = new byte[arg1.field1704];
                }
                arg1.field1708[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cu.ae(IIIII)Ldr;")
    public final class112 method2046(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2015();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class112 var8 = new class112();
        var8.field1881 = new int[this.field1704];
        var8.field1882 = new int[this.field1704];
        var8.field1883 = new int[this.field1704];
        if (this.field1715 > 0 && this.field1711 != null) {
            int[] var9 = new int[this.field1715];
            for (int var10 = 0; var10 < this.field1704; var10++) {
                if (this.field1711[var10] != -1) {
                    var9[this.field1711[var10] & 0xFF]++;
                }
            }
            var8.field1872 = 0;
            for (int var11 = 0; var11 < this.field1715; var11++) {
                if (var9[var11] > 0 && this.field1742[var11] == 0) {
                    var8.field1872++;
                }
            }
            var8.field1889 = new int[var8.field1872];
            var8.field1892 = new int[var8.field1872];
            var8.field1891 = new int[var8.field1872];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1715; var13++) {
                if (var9[var13] > 0 && this.field1742[var13] == 0) {
                    var8.field1889[var12] = this.field1717[var13] & 0xFFFF;
                    var8.field1892[var12] = this.field1718[var13] & 0xFFFF;
                    var8.field1891[var12] = this.field1721[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1901 = new byte[this.field1704];
            for (int var14 = 0; var14 < this.field1704; var14++) {
                if (this.field1711[var14] == -1) {
                    var8.field1901[var14] = -1;
                } else {
                    var8.field1901[var14] = (byte) var9[this.field1711[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1704; var15++) {
            byte var16;
            if (this.field1708 == null) {
                var16 = 0;
            } else {
                var16 = this.field1708[var15];
            }
            byte var17;
            if (this.field1710 == null) {
                var17 = 0;
            } else {
                var17 = this.field1710[var15];
            }
            short var18;
            if (this.field1722 == null) {
                var18 = -1;
            } else {
                var18 = this.field1722[var15];
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
                    if (this.field1733 == null || this.field1733[this.field1705[var15]] == null) {
                        var20 = this.field1732[this.field1705[var15]];
                    } else {
                        var20 = this.field1733[this.field1705[var15]];
                    }
                    int var21 = (var20.field1537 * arg4 + var20.field1535 * arg3 + var20.field1534 * arg2) / (var20.field1538 * var7) + arg0;
                    var8.field1881[var15] = method2020(var19, var21);
                    class91 var22;
                    if (this.field1733 == null || this.field1733[this.field1746[var15]] == null) {
                        var22 = this.field1732[this.field1746[var15]];
                    } else {
                        var22 = this.field1733[this.field1746[var15]];
                    }
                    int var23 = (var22.field1537 * arg4 + var22.field1535 * arg3 + var22.field1534 * arg2) / (var22.field1538 * var7) + arg0;
                    var8.field1882[var15] = method2020(var19, var23);
                    class91 var24;
                    if (this.field1733 == null || this.field1733[this.field1707[var15]] == null) {
                        var24 = this.field1732[this.field1707[var15]];
                    } else {
                        var24 = this.field1733[this.field1707[var15]];
                    }
                    int var25 = (var24.field1537 * arg4 + var24.field1535 * arg3 + var24.field1534 * arg2) / (var24.field1538 * var7) + arg0;
                    var8.field1883[var15] = method2020(var19, var25);
                } else if (var16 == 1) {
                    class92 var26 = this.field1731[var15];
                    int var27 = (var26.field1544 * arg4 + var26.field1546 * arg2 + var26.field1545 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1881[var15] = method2020(this.field1700[var15] & 0xFFFF, var27);
                    var8.field1883[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1881[var15] = 128;
                    var8.field1883[var15] = -1;
                } else {
                    var8.field1883[var15] = -2;
                }
            } else if (var16 == 0) {
                class91 var28;
                if (this.field1733 == null || this.field1733[this.field1705[var15]] == null) {
                    var28 = this.field1732[this.field1705[var15]];
                } else {
                    var28 = this.field1733[this.field1705[var15]];
                }
                int var29 = (var28.field1537 * arg4 + var28.field1535 * arg3 + var28.field1534 * arg2) / (var28.field1538 * var7) + arg0;
                var8.field1881[var15] = method2021(var29);
                class91 var30;
                if (this.field1733 == null || this.field1733[this.field1746[var15]] == null) {
                    var30 = this.field1732[this.field1746[var15]];
                } else {
                    var30 = this.field1733[this.field1746[var15]];
                }
                int var31 = (var30.field1537 * arg4 + var30.field1535 * arg3 + var30.field1534 * arg2) / (var30.field1538 * var7) + arg0;
                var8.field1882[var15] = method2021(var31);
                class91 var32;
                if (this.field1733 == null || this.field1733[this.field1707[var15]] == null) {
                    var32 = this.field1732[this.field1707[var15]];
                } else {
                    var32 = this.field1733[this.field1707[var15]];
                }
                int var33 = (var32.field1537 * arg4 + var32.field1535 * arg3 + var32.field1534 * arg2) / (var32.field1538 * var7) + arg0;
                var8.field1883[var15] = method2021(var33);
            } else if (var16 == 1) {
                class92 var34 = this.field1731[var15];
                int var35 = (var34.field1544 * arg4 + var34.field1546 * arg2 + var34.field1545 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1881[var15] = method2021(var35);
                var8.field1883[var15] = -1;
            } else {
                var8.field1883[var15] = -2;
            }
        }
        this.method2006();
        var8.field1908 = this.field1712;
        var8.field1874 = this.field1701;
        var8.field1875 = this.field1726;
        var8.field1919 = this.field1703;
        var8.field1877 = this.field1704;
        var8.field1878 = this.field1705;
        var8.field1879 = this.field1746;
        var8.field1880 = this.field1707;
        var8.field1890 = this.field1734;
        var8.field1885 = this.field1710;
        var8.field1888 = this.field1714;
        var8.field1893 = this.field1729;
        var8.field1884 = this.field1702;
        var8.field1887 = this.field1722;
        return var8;
    }

    @ObfuscatedName("cu.au(II)I")
    public static final int method2020(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cu.ag(I)I")
    public static final int method2021(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
