package deob;

@ObfuscatedName("dh")
public class class127 extends class141 {

    @ObfuscatedName("dh.n")
    public int field1743 = 0;

    @ObfuscatedName("dh.v")
    public int[] field1702;

    @ObfuscatedName("dh.y")
    public int[] field1710;

    @ObfuscatedName("dh.r")
    public int[] field1727;

    @ObfuscatedName("dh.h")
    public int field1726 = 0;

    @ObfuscatedName("dh.d")
    public int[] field1706;

    @ObfuscatedName("dh.s")
    public int[] field1707;

    @ObfuscatedName("dh.b")
    public int[] field1721;

    @ObfuscatedName("dh.e")
    public byte[] field1709;

    @ObfuscatedName("dh.f")
    public byte[] field1713;

    @ObfuscatedName("dh.z")
    public byte[] field1711;

    @ObfuscatedName("dh.u")
    public byte[] field1703;

    @ObfuscatedName("dh.p")
    public short[] field1722;

    @ObfuscatedName("dh.w")
    public short[] field1714;

    @ObfuscatedName("dh.t")
    public byte field1725 = 0;

    @ObfuscatedName("dh.o")
    public int field1733;

    @ObfuscatedName("dh.a")
    public byte[] field1717;

    @ObfuscatedName("dh.i")
    public short[] field1718;

    @ObfuscatedName("dh.m")
    public short[] field1719;

    @ObfuscatedName("dh.x")
    public short[] field1720;

    @ObfuscatedName("dh.l")
    public short[] field1744;

    @ObfuscatedName("dh.j")
    public short[] field1705;

    @ObfuscatedName("dh.g")
    public short[] field1723;

    @ObfuscatedName("dh.c")
    public short[] field1701;

    @ObfuscatedName("dh.k")
    public short[] field1716;

    @ObfuscatedName("dh.q")
    public short[] field1704;

    @ObfuscatedName("dh.ac")
    public byte[] field1712;

    @ObfuscatedName("dh.aw")
    public int[] field1728;

    @ObfuscatedName("dh.at")
    public int[] field1729;

    @ObfuscatedName("dh.ag")
    public int[][] field1730;

    @ObfuscatedName("dh.ad")
    public int[][] field1731;

    @ObfuscatedName("dh.af")
    public class143[] field1732;

    @ObfuscatedName("dh.az")
    public class135[] field1747;

    @ObfuscatedName("dh.ae")
    public class135[] field1734;

    @ObfuscatedName("dh.av")
    public short field1735;

    @ObfuscatedName("dh.am")
    public short field1736;

    @ObfuscatedName("dh.ax")
    public boolean field1737 = false;

    @ObfuscatedName("dh.ah")
    public int field1738;

    @ObfuscatedName("dh.ab")
    public int field1739;

    @ObfuscatedName("dh.aj")
    public int field1740;

    @ObfuscatedName("dh.aa")
    public int field1741;

    @ObfuscatedName("dh.ao")
    public int field1742;

    @ObfuscatedName("dh.al")
    public static int[] field1724 = new int[10000];

    @ObfuscatedName("dh.ay")
    public static int[] field1715 = new int[10000];

    @ObfuscatedName("dh.aq")
    public static int field1745 = 0;

    @ObfuscatedName("dh.ak")
    public static int[] field1746 = class136.field1942;

    @ObfuscatedName("dh.as")
    public static int[] field1708 = class136.field1922;

    public class127() {
    }

    @ObfuscatedName("dh.n(Lil;II)Ldh;")
    public static class127 method2257(class247 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3931(arg1, arg2);
        return var3 == null ? null : new class127(var3);
    }

    public class127(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2247(arg0);
        } else {
            this.method2250(arg0);
        }
    }

    @ObfuscatedName("dh.v([B)V")
    public void method2247(byte[] arg0) {
        class185 var2 = new class185(arg0);
        class185 var3 = new class185(arg0);
        class185 var4 = new class185(arg0);
        class185 var5 = new class185(arg0);
        class185 var6 = new class185(arg0);
        class185 var7 = new class185(arg0);
        class185 var8 = new class185(arg0);
        var2.field2529 = arg0.length - 23;
        int var9 = var2.method3015();
        int var10 = var2.method3015();
        int var11 = var2.method3021();
        int var12 = var2.method3021();
        int var13 = var2.method3021();
        int var14 = var2.method3021();
        int var15 = var2.method3021();
        int var16 = var2.method3021();
        int var17 = var2.method3021();
        int var18 = var2.method3015();
        int var19 = var2.method3015();
        int var20 = var2.method3015();
        int var21 = var2.method3015();
        int var22 = var2.method3015();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1717 = new byte[var11];
            var2.field2529 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1717[var26] = var2.method3022();
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
        this.field1743 = var9;
        this.field1726 = var10;
        this.field1733 = var11;
        this.field1702 = new int[var9];
        this.field1710 = new int[var9];
        this.field1727 = new int[var9];
        this.field1706 = new int[var10];
        this.field1707 = new int[var10];
        this.field1721 = new int[var10];
        if (var17 == 1) {
            this.field1728 = new int[var9];
        }
        if (var12 == 1) {
            this.field1709 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1713 = new byte[var10];
        } else {
            this.field1725 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1711 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1729 = new int[var10];
        }
        if (var16 == 1) {
            this.field1714 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1703 = new byte[var10];
        }
        this.field1722 = new short[var10];
        if (var11 > 0) {
            this.field1718 = new short[var11];
            this.field1719 = new short[var11];
            this.field1720 = new short[var11];
            if (var24 > 0) {
                this.field1744 = new short[var24];
                this.field1705 = new short[var24];
                this.field1723 = new short[var24];
                this.field1701 = new short[var24];
                this.field1712 = new byte[var24];
                this.field1716 = new short[var24];
            }
            if (var25 > 0) {
                this.field1704 = new short[var25];
            }
        }
        var2.field2529 = var11;
        var3.field2529 = var44;
        var4.field2529 = var46;
        var5.field2529 = var48;
        var6.field2529 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method3021();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method3042();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method3042();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method3042();
            }
            this.field1702[var67] = var64 + var69;
            this.field1710[var67] = var65 + var70;
            this.field1727[var67] = var66 + var71;
            var64 = this.field1702[var67];
            var65 = this.field1710[var67];
            var66 = this.field1727[var67];
            if (var17 == 1) {
                this.field1728[var67] = var6.method3021();
            }
        }
        var2.field2529 = var42;
        var3.field2529 = var31;
        var4.field2529 = var34;
        var5.field2529 = var37;
        var6.field2529 = var35;
        var7.field2529 = var40;
        var8.field2529 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1722[var72] = (short) var2.method3015();
            if (var12 == 1) {
                this.field1709[var72] = var3.method3022();
            }
            if (var13 == 255) {
                this.field1713[var72] = var4.method3022();
            }
            if (var14 == 1) {
                this.field1711[var72] = var5.method3022();
            }
            if (var15 == 1) {
                this.field1729[var72] = var6.method3021();
            }
            if (var16 == 1) {
                this.field1714[var72] = (short) (var7.method3015() - 1);
            }
            if (this.field1703 != null && this.field1714[var72] != -1) {
                this.field1703[var72] = (byte) (var8.method3021() - 1);
            }
        }
        var2.field2529 = var33;
        var3.field2529 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method3021();
            if (var78 == 1) {
                var73 = var2.method3042() + var76;
                var74 = var2.method3042() + var73;
                var75 = var2.method3042() + var74;
                var76 = var75;
                this.field1706[var77] = var73;
                this.field1707[var77] = var74;
                this.field1721[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method3042() + var76;
                var76 = var75;
                this.field1706[var77] = var73;
                this.field1707[var77] = var74;
                this.field1721[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method3042() + var76;
                var76 = var75;
                this.field1706[var77] = var73;
                this.field1707[var77] = var74;
                this.field1721[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method3042() + var76;
                var76 = var75;
                this.field1706[var77] = var73;
                this.field1707[var77] = var81;
                this.field1721[var77] = var75;
            }
        }
        var2.field2529 = var50;
        var3.field2529 = var52;
        var4.field2529 = var54;
        var5.field2529 = var56;
        var6.field2529 = var58;
        var7.field2529 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1717[var82] & 0xFF;
            if (var83 == 0) {
                this.field1718[var82] = (short) var2.method3015();
                this.field1719[var82] = (short) var2.method3015();
                this.field1720[var82] = (short) var2.method3015();
            }
            if (var83 == 1) {
                this.field1718[var82] = (short) var3.method3015();
                this.field1719[var82] = (short) var3.method3015();
                this.field1720[var82] = (short) var3.method3015();
                this.field1744[var82] = (short) var4.method3015();
                this.field1705[var82] = (short) var4.method3015();
                this.field1723[var82] = (short) var4.method3015();
                this.field1701[var82] = (short) var5.method3015();
                this.field1712[var82] = var6.method3022();
                this.field1716[var82] = (short) var7.method3015();
            }
            if (var83 == 2) {
                this.field1718[var82] = (short) var3.method3015();
                this.field1719[var82] = (short) var3.method3015();
                this.field1720[var82] = (short) var3.method3015();
                this.field1744[var82] = (short) var4.method3015();
                this.field1705[var82] = (short) var4.method3015();
                this.field1723[var82] = (short) var4.method3015();
                this.field1701[var82] = (short) var5.method3015();
                this.field1712[var82] = var6.method3022();
                this.field1716[var82] = (short) var7.method3015();
                this.field1704[var82] = (short) var7.method3015();
            }
            if (var83 == 3) {
                this.field1718[var82] = (short) var3.method3015();
                this.field1719[var82] = (short) var3.method3015();
                this.field1720[var82] = (short) var3.method3015();
                this.field1744[var82] = (short) var4.method3015();
                this.field1705[var82] = (short) var4.method3015();
                this.field1723[var82] = (short) var4.method3015();
                this.field1701[var82] = (short) var5.method3015();
                this.field1712[var82] = var6.method3022();
                this.field1716[var82] = (short) var7.method3015();
            }
        }
        var2.field2529 = var62;
        int var84 = var2.method3021();
        if (var84 == 0) {
            return;
        }
        new class140();
        var2.method3015();
        var2.method3015();
        var2.method3015();
        var2.method3026();
    }

    @ObfuscatedName("dh.r([B)V")
    public void method2250(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class185 var4 = new class185(arg0);
        class185 var5 = new class185(arg0);
        class185 var6 = new class185(arg0);
        class185 var7 = new class185(arg0);
        class185 var8 = new class185(arg0);
        var4.field2529 = arg0.length - 18;
        int var9 = var4.method3015();
        int var10 = var4.method3015();
        int var11 = var4.method3021();
        int var12 = var4.method3021();
        int var13 = var4.method3021();
        int var14 = var4.method3021();
        int var15 = var4.method3021();
        int var16 = var4.method3021();
        int var17 = var4.method3015();
        int var18 = var4.method3015();
        int var19 = var4.method3015();
        int var20 = var4.method3015();
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
        this.field1743 = var9;
        this.field1726 = var10;
        this.field1733 = var11;
        this.field1702 = new int[var9];
        this.field1710 = new int[var9];
        this.field1727 = new int[var9];
        this.field1706 = new int[var10];
        this.field1707 = new int[var10];
        this.field1721 = new int[var10];
        if (var11 > 0) {
            this.field1717 = new byte[var11];
            this.field1718 = new short[var11];
            this.field1719 = new short[var11];
            this.field1720 = new short[var11];
        }
        if (var16 == 1) {
            this.field1728 = new int[var9];
        }
        if (var12 == 1) {
            this.field1709 = new byte[var10];
            this.field1703 = new byte[var10];
            this.field1714 = new short[var10];
        }
        if (var13 == 255) {
            this.field1713 = new byte[var10];
        } else {
            this.field1725 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1711 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1729 = new int[var10];
        }
        this.field1722 = new short[var10];
        var4.field2529 = var21;
        var5.field2529 = var36;
        var6.field2529 = var38;
        var7.field2529 = var40;
        var8.field2529 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method3021();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method3042();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method3042();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method3042();
            }
            this.field1702[var46] = var43 + var48;
            this.field1710[var46] = var44 + var49;
            this.field1727[var46] = var45 + var50;
            var43 = this.field1702[var46];
            var44 = this.field1710[var46];
            var45 = this.field1727[var46];
            if (var16 == 1) {
                this.field1728[var46] = var8.method3021();
            }
        }
        var4.field2529 = var32;
        var5.field2529 = var28;
        var6.field2529 = var26;
        var7.field2529 = var30;
        var8.field2529 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1722[var51] = (short) var4.method3015();
            if (var12 == 1) {
                int var52 = var5.method3021();
                if ((var52 & 0x1) == 1) {
                    this.field1709[var51] = 1;
                    var2 = true;
                } else {
                    this.field1709[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1703[var51] = (byte) (var52 >> 2);
                    this.field1714[var51] = this.field1722[var51];
                    this.field1722[var51] = 127;
                    if (this.field1714[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1703[var51] = -1;
                    this.field1714[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1713[var51] = var6.method3022();
            }
            if (var14 == 1) {
                this.field1711[var51] = var7.method3022();
            }
            if (var15 == 1) {
                this.field1729[var51] = var8.method3021();
            }
        }
        var4.field2529 = var25;
        var5.field2529 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method3021();
            if (var58 == 1) {
                var53 = var4.method3042() + var56;
                var54 = var4.method3042() + var53;
                var55 = var4.method3042() + var54;
                var56 = var55;
                this.field1706[var57] = var53;
                this.field1707[var57] = var54;
                this.field1721[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method3042() + var56;
                var56 = var55;
                this.field1706[var57] = var53;
                this.field1707[var57] = var54;
                this.field1721[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method3042() + var56;
                var56 = var55;
                this.field1706[var57] = var53;
                this.field1707[var57] = var54;
                this.field1721[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method3042() + var56;
                var56 = var55;
                this.field1706[var57] = var53;
                this.field1707[var57] = var61;
                this.field1721[var57] = var55;
            }
        }
        var4.field2529 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1717[var62] = 0;
            this.field1718[var62] = (short) var4.method3015();
            this.field1719[var62] = (short) var4.method3015();
            this.field1720[var62] = (short) var4.method3015();
        }
        if (this.field1703 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1703[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1718[var65] & 0xFFFF) == this.field1706[var64] && (this.field1719[var65] & 0xFFFF) == this.field1707[var64] && (this.field1720[var65] & 0xFFFF) == this.field1721[var64]) {
                        this.field1703[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1703 = null;
            }
        }
        if (!var3) {
            this.field1714 = null;
        }
        if (!var2) {
            this.field1709 = null;
        }
    }

    public class127(class127[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1743 = 0;
        this.field1726 = 0;
        this.field1733 = 0;
        this.field1725 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class127 var10 = arg0[var9];
            if (var10 != null) {
                this.field1743 += var10.field1743;
                this.field1726 += var10.field1726;
                this.field1733 += var10.field1733;
                if (var10.field1713 == null) {
                    if (this.field1725 == -1) {
                        this.field1725 = var10.field1725;
                    }
                    if (this.field1725 != var10.field1725) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1709 != null;
                var5 |= var10.field1711 != null;
                var6 |= var10.field1729 != null;
                var7 |= var10.field1714 != null;
                var8 |= var10.field1703 != null;
            }
        }
        this.field1702 = new int[this.field1743];
        this.field1710 = new int[this.field1743];
        this.field1727 = new int[this.field1743];
        this.field1728 = new int[this.field1743];
        this.field1706 = new int[this.field1726];
        this.field1707 = new int[this.field1726];
        this.field1721 = new int[this.field1726];
        if (var3) {
            this.field1709 = new byte[this.field1726];
        }
        if (var4) {
            this.field1713 = new byte[this.field1726];
        }
        if (var5) {
            this.field1711 = new byte[this.field1726];
        }
        if (var6) {
            this.field1729 = new int[this.field1726];
        }
        if (var7) {
            this.field1714 = new short[this.field1726];
        }
        if (var8) {
            this.field1703 = new byte[this.field1726];
        }
        this.field1722 = new short[this.field1726];
        if (this.field1733 > 0) {
            this.field1717 = new byte[this.field1733];
            this.field1718 = new short[this.field1733];
            this.field1719 = new short[this.field1733];
            this.field1720 = new short[this.field1733];
            this.field1744 = new short[this.field1733];
            this.field1705 = new short[this.field1733];
            this.field1723 = new short[this.field1733];
            this.field1701 = new short[this.field1733];
            this.field1712 = new byte[this.field1733];
            this.field1716 = new short[this.field1733];
            this.field1704 = new short[this.field1733];
        }
        this.field1743 = 0;
        this.field1726 = 0;
        this.field1733 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class127 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1726; var13++) {
                    if (var3 && var12.field1709 != null) {
                        this.field1709[this.field1726] = var12.field1709[var13];
                    }
                    if (var4) {
                        if (var12.field1713 == null) {
                            this.field1713[this.field1726] = var12.field1725;
                        } else {
                            this.field1713[this.field1726] = var12.field1713[var13];
                        }
                    }
                    if (var5 && var12.field1711 != null) {
                        this.field1711[this.field1726] = var12.field1711[var13];
                    }
                    if (var6 && var12.field1729 != null) {
                        this.field1729[this.field1726] = var12.field1729[var13];
                    }
                    if (var7) {
                        if (var12.field1714 == null) {
                            this.field1714[this.field1726] = -1;
                        } else {
                            this.field1714[this.field1726] = var12.field1714[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1703 == null || var12.field1703[var13] == -1) {
                            this.field1703[this.field1726] = -1;
                        } else {
                            this.field1703[this.field1726] = (byte) (var12.field1703[var13] + this.field1733);
                        }
                    }
                    this.field1722[this.field1726] = var12.field1722[var13];
                    this.field1706[this.field1726] = this.method2314(var12, var12.field1706[var13]);
                    this.field1707[this.field1726] = this.method2314(var12, var12.field1707[var13]);
                    this.field1721[this.field1726] = this.method2314(var12, var12.field1721[var13]);
                    this.field1726++;
                }
                for (int var14 = 0; var14 < var12.field1733; var14++) {
                    byte var15 = this.field1717[this.field1733] = var12.field1717[var14];
                    if (var15 == 0) {
                        this.field1718[this.field1733] = (short) this.method2314(var12, var12.field1718[var14]);
                        this.field1719[this.field1733] = (short) this.method2314(var12, var12.field1719[var14]);
                        this.field1720[this.field1733] = (short) this.method2314(var12, var12.field1720[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1718[this.field1733] = var12.field1718[var14];
                        this.field1719[this.field1733] = var12.field1719[var14];
                        this.field1720[this.field1733] = var12.field1720[var14];
                        this.field1744[this.field1733] = var12.field1744[var14];
                        this.field1705[this.field1733] = var12.field1705[var14];
                        this.field1723[this.field1733] = var12.field1723[var14];
                        this.field1701[this.field1733] = var12.field1701[var14];
                        this.field1712[this.field1733] = var12.field1712[var14];
                        this.field1716[this.field1733] = var12.field1716[var14];
                    }
                    if (var15 == 2) {
                        this.field1704[this.field1733] = var12.field1704[var14];
                    }
                    this.field1733++;
                }
            }
        }
    }

    @ObfuscatedName("dh.h(Ldh;I)I")
    public final int method2314(class127 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1702[arg1];
        int var5 = arg0.field1710[arg1];
        int var6 = arg0.field1727[arg1];
        for (int var7 = 0; var7 < this.field1743; var7++) {
            if (this.field1702[var7] == var4 && this.field1710[var7] == var5 && this.field1727[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1702[this.field1743] = var4;
            this.field1710[this.field1743] = var5;
            this.field1727[this.field1743] = var6;
            if (arg0.field1728 != null) {
                this.field1728[this.field1743] = arg0.field1728[arg1];
            }
            var3 = this.field1743++;
        }
        return var3;
    }

    public class127(class127 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1743 = arg0.field1743;
        this.field1726 = arg0.field1726;
        this.field1733 = arg0.field1733;
        if (arg1) {
            this.field1702 = arg0.field1702;
            this.field1710 = arg0.field1710;
            this.field1727 = arg0.field1727;
        } else {
            this.field1702 = new int[this.field1743];
            this.field1710 = new int[this.field1743];
            this.field1727 = new int[this.field1743];
            for (int var6 = 0; var6 < this.field1743; var6++) {
                this.field1702[var6] = arg0.field1702[var6];
                this.field1710[var6] = arg0.field1710[var6];
                this.field1727[var6] = arg0.field1727[var6];
            }
        }
        if (arg2) {
            this.field1722 = arg0.field1722;
        } else {
            this.field1722 = new short[this.field1726];
            for (int var7 = 0; var7 < this.field1726; var7++) {
                this.field1722[var7] = arg0.field1722[var7];
            }
        }
        if (arg3 || arg0.field1714 == null) {
            this.field1714 = arg0.field1714;
        } else {
            this.field1714 = new short[this.field1726];
            for (int var8 = 0; var8 < this.field1726; var8++) {
                this.field1714[var8] = arg0.field1714[var8];
            }
        }
        if (arg4) {
            this.field1711 = arg0.field1711;
        } else {
            this.field1711 = new byte[this.field1726];
            if (arg0.field1711 == null) {
                for (int var9 = 0; var9 < this.field1726; var9++) {
                    this.field1711[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1726; var10++) {
                    this.field1711[var10] = arg0.field1711[var10];
                }
            }
        }
        this.field1706 = arg0.field1706;
        this.field1707 = arg0.field1707;
        this.field1721 = arg0.field1721;
        this.field1709 = arg0.field1709;
        this.field1713 = arg0.field1713;
        this.field1703 = arg0.field1703;
        this.field1725 = arg0.field1725;
        this.field1717 = arg0.field1717;
        this.field1718 = arg0.field1718;
        this.field1719 = arg0.field1719;
        this.field1720 = arg0.field1720;
        this.field1744 = arg0.field1744;
        this.field1705 = arg0.field1705;
        this.field1723 = arg0.field1723;
        this.field1701 = arg0.field1701;
        this.field1712 = arg0.field1712;
        this.field1716 = arg0.field1716;
        this.field1704 = arg0.field1704;
        this.field1728 = arg0.field1728;
        this.field1729 = arg0.field1729;
        this.field1730 = arg0.field1730;
        this.field1731 = arg0.field1731;
        this.field1747 = arg0.field1747;
        this.field1732 = arg0.field1732;
        this.field1734 = arg0.field1734;
        this.field1735 = arg0.field1735;
        this.field1736 = arg0.field1736;
    }

    @ObfuscatedName("dh.d()Ldh;")
    public class127 method2251() {
        class127 var1 = new class127();
        if (this.field1709 != null) {
            var1.field1709 = new byte[this.field1726];
            for (int var2 = 0; var2 < this.field1726; var2++) {
                var1.field1709[var2] = this.field1709[var2];
            }
        }
        var1.field1743 = this.field1743;
        var1.field1726 = this.field1726;
        var1.field1733 = this.field1733;
        var1.field1702 = this.field1702;
        var1.field1710 = this.field1710;
        var1.field1727 = this.field1727;
        var1.field1706 = this.field1706;
        var1.field1707 = this.field1707;
        var1.field1721 = this.field1721;
        var1.field1713 = this.field1713;
        var1.field1711 = this.field1711;
        var1.field1703 = this.field1703;
        var1.field1722 = this.field1722;
        var1.field1714 = this.field1714;
        var1.field1725 = this.field1725;
        var1.field1717 = this.field1717;
        var1.field1718 = this.field1718;
        var1.field1719 = this.field1719;
        var1.field1720 = this.field1720;
        var1.field1744 = this.field1744;
        var1.field1705 = this.field1705;
        var1.field1723 = this.field1723;
        var1.field1701 = this.field1701;
        var1.field1712 = this.field1712;
        var1.field1716 = this.field1716;
        var1.field1704 = this.field1704;
        var1.field1728 = this.field1728;
        var1.field1729 = this.field1729;
        var1.field1730 = this.field1730;
        var1.field1731 = this.field1731;
        var1.field1747 = this.field1747;
        var1.field1732 = this.field1732;
        var1.field1735 = this.field1735;
        var1.field1736 = this.field1736;
        return var1;
    }

    @ObfuscatedName("dh.s([[IIIIZI)Ldh;")
    public class127 method2252(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2265();
        int var7 = this.field1739 + arg1;
        int var8 = this.field1740 + arg1;
        int var9 = this.field1742 + arg3;
        int var10 = this.field1741 + arg3;
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
        class127 var15;
        if (arg4) {
            var15 = new class127();
            var15.field1743 = this.field1743;
            var15.field1726 = this.field1726;
            var15.field1733 = this.field1733;
            var15.field1702 = this.field1702;
            var15.field1727 = this.field1727;
            var15.field1706 = this.field1706;
            var15.field1707 = this.field1707;
            var15.field1721 = this.field1721;
            var15.field1709 = this.field1709;
            var15.field1713 = this.field1713;
            var15.field1711 = this.field1711;
            var15.field1703 = this.field1703;
            var15.field1722 = this.field1722;
            var15.field1714 = this.field1714;
            var15.field1725 = this.field1725;
            var15.field1717 = this.field1717;
            var15.field1718 = this.field1718;
            var15.field1719 = this.field1719;
            var15.field1720 = this.field1720;
            var15.field1744 = this.field1744;
            var15.field1705 = this.field1705;
            var15.field1723 = this.field1723;
            var15.field1701 = this.field1701;
            var15.field1712 = this.field1712;
            var15.field1716 = this.field1716;
            var15.field1704 = this.field1704;
            var15.field1728 = this.field1728;
            var15.field1729 = this.field1729;
            var15.field1730 = this.field1730;
            var15.field1731 = this.field1731;
            var15.field1735 = this.field1735;
            var15.field1736 = this.field1736;
            var15.field1710 = new int[var15.field1743];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1743; var16++) {
                int var17 = this.field1702[var16] + arg1;
                int var18 = this.field1727[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1710[var16] = this.field1710[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1743; var26++) {
                int var27 = (-this.field1710[var26] << 16) / this.field2026;
                if (var27 < arg5) {
                    int var28 = this.field1702[var26] + arg1;
                    int var29 = this.field1727[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1710[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1710[var26];
                }
            }
        }
        var15.method2288();
        return var15;
    }

    @ObfuscatedName("dh.b()V")
    public void method2279() {
        int var10002;
        if (this.field1728 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1743; var3++) {
                int var4 = this.field1728[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1730 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1730[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1743) {
                int var7 = this.field1728[var6];
                this.field1730[var7][var1[var7]++] = var6++;
            }
            this.field1728 = null;
        }
        if (this.field1729 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1726; var10++) {
            int var11 = this.field1729[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1731 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1731[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1726) {
            int var14 = this.field1729[var13];
            this.field1731[var14][var8[var14]++] = var13++;
        }
        this.field1729 = null;
    }

    @ObfuscatedName("dh.e()V")
    public void method2254() {
        for (int var1 = 0; var1 < this.field1743; var1++) {
            int var2 = this.field1702[var1];
            this.field1702[var1] = this.field1727[var1];
            this.field1727[var1] = -var2;
        }
        this.method2288();
    }

    @ObfuscatedName("dh.f()V")
    public void method2255() {
        for (int var1 = 0; var1 < this.field1743; var1++) {
            this.field1702[var1] = -this.field1702[var1];
            this.field1727[var1] = -this.field1727[var1];
        }
        this.method2288();
    }

    @ObfuscatedName("dh.u()V")
    public void method2256() {
        for (int var1 = 0; var1 < this.field1743; var1++) {
            int var2 = this.field1727[var1];
            this.field1727[var1] = this.field1702[var1];
            this.field1702[var1] = -var2;
        }
        this.method2288();
    }

    @ObfuscatedName("dh.t(I)V")
    public void method2285(int arg0) {
        int var2 = field1746[arg0];
        int var3 = field1708[arg0];
        for (int var4 = 0; var4 < this.field1743; var4++) {
            int var5 = this.field1727[var4] * var2 + this.field1702[var4] * var3 >> 16;
            this.field1727[var4] = this.field1727[var4] * var3 - this.field1702[var4] * var2 >> 16;
            this.field1702[var4] = var5;
        }
        this.method2288();
    }

    @ObfuscatedName("dh.o(III)V")
    public void method2278(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1743; var4++) {
            this.field1702[var4] += arg0;
            this.field1710[var4] += arg1;
            this.field1727[var4] += arg2;
        }
        this.method2288();
    }

    @ObfuscatedName("dh.m(SS)V")
    public void method2258(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1726; var3++) {
            if (this.field1722[var3] == arg0) {
                this.field1722[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dh.x(SS)V")
    public void method2260(short arg0, short arg1) {
        if (this.field1714 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1726; var3++) {
            if (this.field1714[var3] == arg0) {
                this.field1714[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dh.j()V")
    public void method2261() {
        for (int var1 = 0; var1 < this.field1743; var1++) {
            this.field1727[var1] = -this.field1727[var1];
        }
        for (int var2 = 0; var2 < this.field1726; var2++) {
            int var3 = this.field1706[var2];
            this.field1706[var2] = this.field1721[var2];
            this.field1721[var2] = var3;
        }
        this.method2288();
    }

    @ObfuscatedName("dh.g(III)V")
    public void method2262(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1743; var4++) {
            this.field1702[var4] = this.field1702[var4] * arg0 / 128;
            this.field1710[var4] = this.field1710[var4] * arg1 / 128;
            this.field1727[var4] = this.field1727[var4] * arg2 / 128;
        }
        this.method2288();
    }

    @ObfuscatedName("dh.c()V")
    public void method2263() {
        if (this.field1747 != null) {
            return;
        }
        this.field1747 = new class135[this.field1743];
        for (int var1 = 0; var1 < this.field1743; var1++) {
            this.field1747[var1] = new class135();
        }
        for (int var2 = 0; var2 < this.field1726; var2++) {
            int var3 = this.field1706[var2];
            int var4 = this.field1707[var2];
            int var5 = this.field1721[var2];
            int var6 = this.field1702[var4] - this.field1702[var3];
            int var7 = this.field1710[var4] - this.field1710[var3];
            int var8 = this.field1727[var4] - this.field1727[var3];
            int var9 = this.field1702[var5] - this.field1702[var3];
            int var10 = this.field1710[var5] - this.field1710[var3];
            int var11 = this.field1727[var5] - this.field1727[var3];
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
            if (this.field1709 == null) {
                var19 = 0;
            } else {
                var19 = this.field1709[var2];
            }
            if (var19 == 0) {
                class135 var20 = this.field1747[var3];
                var20.field1914 += var16;
                var20.field1911 += var17;
                var20.field1912 += var18;
                var20.field1910++;
                class135 var21 = this.field1747[var4];
                var21.field1914 += var16;
                var21.field1911 += var17;
                var21.field1912 += var18;
                var21.field1910++;
                class135 var22 = this.field1747[var5];
                var22.field1914 += var16;
                var22.field1911 += var17;
                var22.field1912 += var18;
                var22.field1910++;
            } else if (var19 == 1) {
                if (this.field1732 == null) {
                    this.field1732 = new class143[this.field1726];
                }
                class143 var23 = this.field1732[var2] = new class143();
                var23.field2039 = var16;
                var23.field2038 = var17;
                var23.field2040 = var18;
            }
        }
    }

    @ObfuscatedName("dh.k()V")
    public void method2288() {
        this.field1747 = null;
        this.field1734 = null;
        this.field1732 = null;
        this.field1737 = false;
    }

    @ObfuscatedName("dh.q()V")
    public void method2265() {
        if (this.field1737) {
            return;
        }
        this.field2026 = 0;
        this.field1738 = 0;
        this.field1739 = 999999;
        this.field1740 = -999999;
        this.field1741 = -99999;
        this.field1742 = 99999;
        for (int var1 = 0; var1 < this.field1743; var1++) {
            int var2 = this.field1702[var1];
            int var3 = this.field1710[var1];
            int var4 = this.field1727[var1];
            if (var2 < this.field1739) {
                this.field1739 = var2;
            }
            if (var2 > this.field1740) {
                this.field1740 = var2;
            }
            if (var4 < this.field1742) {
                this.field1742 = var4;
            }
            if (var4 > this.field1741) {
                this.field1741 = var4;
            }
            if (-var3 > this.field2026) {
                this.field2026 = -var3;
            }
            if (var3 > this.field1738) {
                this.field1738 = var3;
            }
        }
        this.field1737 = true;
    }

    @ObfuscatedName("dh.ac(Ldh;Ldh;IIIZ)V")
    public static void method2266(class127 arg0, class127 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2265();
        arg0.method2263();
        arg1.method2265();
        arg1.method2263();
        field1745++;
        int var6 = 0;
        int[] var7 = arg1.field1702;
        int var8 = arg1.field1743;
        for (int var9 = 0; var9 < arg0.field1743; var9++) {
            class135 var10 = arg0.field1747[var9];
            if (var10.field1910 != 0) {
                int var11 = arg0.field1710[var9] - arg3;
                if (var11 <= arg1.field1738) {
                    int var12 = arg0.field1702[var9] - arg2;
                    if (var12 >= arg1.field1739 && var12 <= arg1.field1740) {
                        int var13 = arg0.field1727[var9] - arg4;
                        if (var13 >= arg1.field1742 && var13 <= arg1.field1741) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class135 var15 = arg1.field1747[var14];
                                if (var7[var14] == var12 && arg1.field1727[var14] == var13 && arg1.field1710[var14] == var11 && var15.field1910 != 0) {
                                    if (arg0.field1734 == null) {
                                        arg0.field1734 = new class135[arg0.field1743];
                                    }
                                    if (arg1.field1734 == null) {
                                        arg1.field1734 = new class135[var8];
                                    }
                                    class135 var16 = arg0.field1734[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1734[var9] = new class135(var10);
                                    }
                                    class135 var17 = arg1.field1734[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1734[var14] = new class135(var15);
                                    }
                                    var16.field1914 += var15.field1914;
                                    var16.field1911 += var15.field1911;
                                    var16.field1912 += var15.field1912;
                                    var16.field1910 += var15.field1910;
                                    var17.field1914 += var10.field1914;
                                    var17.field1911 += var10.field1911;
                                    var17.field1912 += var10.field1912;
                                    var17.field1910 += var10.field1910;
                                    var6++;
                                    field1724[var9] = field1745;
                                    field1715[var14] = field1745;
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
        for (int var18 = 0; var18 < arg0.field1726; var18++) {
            if (field1724[arg0.field1706[var18]] == field1745 && field1724[arg0.field1707[var18]] == field1745 && field1724[arg0.field1721[var18]] == field1745) {
                if (arg0.field1709 == null) {
                    arg0.field1709 = new byte[arg0.field1726];
                }
                arg0.field1709[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1726; var19++) {
            if (field1715[arg1.field1706[var19]] == field1745 && field1715[arg1.field1707[var19]] == field1745 && field1715[arg1.field1721[var19]] == field1745) {
                if (arg1.field1709 == null) {
                    arg1.field1709 = new byte[arg1.field1726];
                }
                arg1.field1709[var19] = 2;
            }
        }
    }

    @ObfuscatedName("dh.aw(IIIII)Les;")
    public final class133 method2331(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2263();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class133 var8 = new class133();
        var8.field1859 = new int[this.field1726];
        var8.field1844 = new int[this.field1726];
        var8.field1843 = new int[this.field1726];
        if (this.field1733 > 0 && this.field1703 != null) {
            int[] var9 = new int[this.field1733];
            for (int var10 = 0; var10 < this.field1726; var10++) {
                if (this.field1703[var10] != -1) {
                    var9[this.field1703[var10] & 0xFF]++;
                }
            }
            var8.field1887 = 0;
            for (int var11 = 0; var11 < this.field1733; var11++) {
                if (var9[var11] > 0 && this.field1717[var11] == 0) {
                    var8.field1887++;
                }
            }
            var8.field1840 = new int[var8.field1887];
            var8.field1851 = new int[var8.field1887];
            var8.field1852 = new int[var8.field1887];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1733; var13++) {
                if (var9[var13] > 0 && this.field1717[var13] == 0) {
                    var8.field1840[var12] = this.field1718[var13] & 0xFFFF;
                    var8.field1851[var12] = this.field1719[var13] & 0xFFFF;
                    var8.field1852[var12] = this.field1720[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1858 = new byte[this.field1726];
            for (int var14 = 0; var14 < this.field1726; var14++) {
                if (this.field1703[var14] == -1) {
                    var8.field1858[var14] = -1;
                } else {
                    var8.field1858[var14] = (byte) var9[this.field1703[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1726; var15++) {
            byte var16;
            if (this.field1709 == null) {
                var16 = 0;
            } else {
                var16 = this.field1709[var15];
            }
            byte var17;
            if (this.field1711 == null) {
                var17 = 0;
            } else {
                var17 = this.field1711[var15];
            }
            short var18;
            if (this.field1714 == null) {
                var18 = -1;
            } else {
                var18 = this.field1714[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1722[var15] & 0xFFFF;
                    class135 var20;
                    if (this.field1734 == null || this.field1734[this.field1706[var15]] == null) {
                        var20 = this.field1747[this.field1706[var15]];
                    } else {
                        var20 = this.field1734[this.field1706[var15]];
                    }
                    int var21 = (var20.field1912 * arg4 + var20.field1914 * arg2 + var20.field1911 * arg3) / (var20.field1910 * var7) + arg0;
                    var8.field1859[var15] = method2268(var19, var21);
                    class135 var22;
                    if (this.field1734 == null || this.field1734[this.field1707[var15]] == null) {
                        var22 = this.field1747[this.field1707[var15]];
                    } else {
                        var22 = this.field1734[this.field1707[var15]];
                    }
                    int var23 = (var22.field1912 * arg4 + var22.field1914 * arg2 + var22.field1911 * arg3) / (var22.field1910 * var7) + arg0;
                    var8.field1844[var15] = method2268(var19, var23);
                    class135 var24;
                    if (this.field1734 == null || this.field1734[this.field1721[var15]] == null) {
                        var24 = this.field1747[this.field1721[var15]];
                    } else {
                        var24 = this.field1734[this.field1721[var15]];
                    }
                    int var25 = (var24.field1912 * arg4 + var24.field1914 * arg2 + var24.field1911 * arg3) / (var24.field1910 * var7) + arg0;
                    var8.field1843[var15] = method2268(var19, var25);
                } else if (var16 == 1) {
                    class143 var26 = this.field1732[var15];
                    int var27 = (var26.field2040 * arg4 + var26.field2039 * arg2 + var26.field2038 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1859[var15] = method2268(this.field1722[var15] & 0xFFFF, var27);
                    var8.field1843[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1859[var15] = 128;
                    var8.field1843[var15] = -1;
                } else {
                    var8.field1843[var15] = -2;
                }
            } else if (var16 == 0) {
                class135 var28;
                if (this.field1734 == null || this.field1734[this.field1706[var15]] == null) {
                    var28 = this.field1747[this.field1706[var15]];
                } else {
                    var28 = this.field1734[this.field1706[var15]];
                }
                int var29 = (var28.field1912 * arg4 + var28.field1914 * arg2 + var28.field1911 * arg3) / (var28.field1910 * var7) + arg0;
                var8.field1859[var15] = method2322(var29);
                class135 var30;
                if (this.field1734 == null || this.field1734[this.field1707[var15]] == null) {
                    var30 = this.field1747[this.field1707[var15]];
                } else {
                    var30 = this.field1734[this.field1707[var15]];
                }
                int var31 = (var30.field1912 * arg4 + var30.field1914 * arg2 + var30.field1911 * arg3) / (var30.field1910 * var7) + arg0;
                var8.field1844[var15] = method2322(var31);
                class135 var32;
                if (this.field1734 == null || this.field1734[this.field1721[var15]] == null) {
                    var32 = this.field1747[this.field1721[var15]];
                } else {
                    var32 = this.field1734[this.field1721[var15]];
                }
                int var33 = (var32.field1912 * arg4 + var32.field1914 * arg2 + var32.field1911 * arg3) / (var32.field1910 * var7) + arg0;
                var8.field1843[var15] = method2322(var33);
            } else if (var16 == 1) {
                class143 var34 = this.field1732[var15];
                int var35 = (var34.field2040 * arg4 + var34.field2039 * arg2 + var34.field2038 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1859[var15] = method2322(var35);
                var8.field1843[var15] = -1;
            } else {
                var8.field1843[var15] = -2;
            }
        }
        this.method2279();
        var8.field1833 = this.field1743;
        var8.field1834 = this.field1702;
        var8.field1835 = this.field1710;
        var8.field1836 = this.field1727;
        var8.field1873 = this.field1726;
        var8.field1838 = this.field1706;
        var8.field1892 = this.field1707;
        var8.field1841 = this.field1721;
        var8.field1850 = this.field1713;
        var8.field1842 = this.field1711;
        var8.field1848 = this.field1725;
        var8.field1853 = this.field1730;
        var8.field1854 = this.field1731;
        var8.field1847 = this.field1714;
        return var8;
    }

    @ObfuscatedName("dh.at(II)I")
    public static final int method2268(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("dh.ag(I)I")
    public static final int method2322(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
