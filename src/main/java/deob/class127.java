package deob;

@ObfuscatedName("dm")
public class class127 extends class141 {

    @ObfuscatedName("dm.a")
    public int field1721 = 0;

    @ObfuscatedName("dm.w")
    public int[] field1686;

    @ObfuscatedName("dm.e")
    public int[] field1687;

    @ObfuscatedName("dm.k")
    public int[] field1691;

    @ObfuscatedName("dm.u")
    public int field1689 = 0;

    @ObfuscatedName("dm.z")
    public int[] field1690;

    @ObfuscatedName("dm.t")
    public int[] field1692;

    @ObfuscatedName("dm.f")
    public int[] field1720;

    @ObfuscatedName("dm.g")
    public byte[] field1693;

    @ObfuscatedName("dm.j")
    public byte[] field1694;

    @ObfuscatedName("dm.x")
    public byte[] field1695;

    @ObfuscatedName("dm.c")
    public byte[] field1696;

    @ObfuscatedName("dm.s")
    public short[] field1697;

    @ObfuscatedName("dm.n")
    public short[] field1698;

    @ObfuscatedName("dm.y")
    public byte field1699 = 0;

    @ObfuscatedName("dm.o")
    public int field1706;

    @ObfuscatedName("dm.r")
    public byte[] field1685;

    @ObfuscatedName("dm.i")
    public short[] field1700;

    @ObfuscatedName("dm.l")
    public short[] field1703;

    @ObfuscatedName("dm.m")
    public short[] field1704;

    @ObfuscatedName("dm.q")
    public short[] field1729;

    @ObfuscatedName("dm.b")
    public short[] field1711;

    @ObfuscatedName("dm.h")
    public short[] field1707;

    @ObfuscatedName("dm.d")
    public short[] field1713;

    @ObfuscatedName("dm.v")
    public short[] field1709;

    @ObfuscatedName("dm.p")
    public short[] field1731;

    @ObfuscatedName("dm.ab")
    public byte[] field1723;

    @ObfuscatedName("dm.ad")
    public int[] field1722;

    @ObfuscatedName("dm.ag")
    public int[] field1712;

    @ObfuscatedName("dm.ak")
    public int[][] field1714;

    @ObfuscatedName("dm.as")
    public int[][] field1715;

    @ObfuscatedName("dm.aq")
    public class143[] field1716;

    @ObfuscatedName("dm.ax")
    public class135[] field1717;

    @ObfuscatedName("dm.at")
    public class135[] field1718;

    @ObfuscatedName("dm.ap")
    public short field1719;

    @ObfuscatedName("dm.an")
    public short field1701;

    @ObfuscatedName("dm.ac")
    public boolean field1710 = false;

    @ObfuscatedName("dm.aw")
    public int field1702;

    @ObfuscatedName("dm.al")
    public int field1688;

    @ObfuscatedName("dm.ay")
    public int field1724;

    @ObfuscatedName("dm.ai")
    public int field1725;

    @ObfuscatedName("dm.af")
    public int field1726;

    @ObfuscatedName("dm.ah")
    public static int[] field1727 = new int[10000];

    @ObfuscatedName("dm.az")
    public static int[] field1728 = new int[10000];

    @ObfuscatedName("dm.av")
    public static int field1705 = 0;

    @ObfuscatedName("dm.ae")
    public static int[] field1730 = class136.field1927;

    @ObfuscatedName("dm.am")
    public static int[] field1708 = class136.field1926;

    public class127() {
    }

    @ObfuscatedName("dm.a(Lib;II)Ldm;")
    public static class127 method2217(class247 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3897(arg1, arg2);
        return var3 == null ? null : new class127(var3);
    }

    public class127(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2205(arg0);
        } else {
            this.method2219(arg0);
        }
    }

    @ObfuscatedName("dm.w([B)V")
    public void method2205(byte[] arg0) {
        class185 var2 = new class185(arg0);
        class185 var3 = new class185(arg0);
        class185 var4 = new class185(arg0);
        class185 var5 = new class185(arg0);
        class185 var6 = new class185(arg0);
        class185 var7 = new class185(arg0);
        class185 var8 = new class185(arg0);
        var2.field2509 = arg0.length - 23;
        int var9 = var2.method3194();
        int var10 = var2.method3194();
        int var11 = var2.method2962();
        int var12 = var2.method2962();
        int var13 = var2.method2962();
        int var14 = var2.method2962();
        int var15 = var2.method2962();
        int var16 = var2.method2962();
        int var17 = var2.method2962();
        int var18 = var2.method3194();
        int var19 = var2.method3194();
        int var20 = var2.method3194();
        int var21 = var2.method3194();
        int var22 = var2.method3194();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1685 = new byte[var11];
            var2.field2509 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1685[var26] = var2.method3015();
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
        this.field1721 = var9;
        this.field1689 = var10;
        this.field1706 = var11;
        this.field1686 = new int[var9];
        this.field1687 = new int[var9];
        this.field1691 = new int[var9];
        this.field1690 = new int[var10];
        this.field1692 = new int[var10];
        this.field1720 = new int[var10];
        if (var17 == 1) {
            this.field1722 = new int[var9];
        }
        if (var12 == 1) {
            this.field1693 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1694 = new byte[var10];
        } else {
            this.field1699 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1695 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1712 = new int[var10];
        }
        if (var16 == 1) {
            this.field1698 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1696 = new byte[var10];
        }
        this.field1697 = new short[var10];
        if (var11 > 0) {
            this.field1700 = new short[var11];
            this.field1703 = new short[var11];
            this.field1704 = new short[var11];
            if (var24 > 0) {
                this.field1729 = new short[var24];
                this.field1711 = new short[var24];
                this.field1707 = new short[var24];
                this.field1713 = new short[var24];
                this.field1723 = new byte[var24];
                this.field1709 = new short[var24];
            }
            if (var25 > 0) {
                this.field1731 = new short[var25];
            }
        }
        var2.field2509 = var11;
        var3.field2509 = var44;
        var4.field2509 = var46;
        var5.field2509 = var48;
        var6.field2509 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2962();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2984();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2984();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2984();
            }
            this.field1686[var67] = var64 + var69;
            this.field1687[var67] = var65 + var70;
            this.field1691[var67] = var66 + var71;
            var64 = this.field1686[var67];
            var65 = this.field1687[var67];
            var66 = this.field1691[var67];
            if (var17 == 1) {
                this.field1722[var67] = var6.method2962();
            }
        }
        var2.field2509 = var42;
        var3.field2509 = var31;
        var4.field2509 = var34;
        var5.field2509 = var37;
        var6.field2509 = var35;
        var7.field2509 = var40;
        var8.field2509 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1697[var72] = (short) var2.method3194();
            if (var12 == 1) {
                this.field1693[var72] = var3.method3015();
            }
            if (var13 == 255) {
                this.field1694[var72] = var4.method3015();
            }
            if (var14 == 1) {
                this.field1695[var72] = var5.method3015();
            }
            if (var15 == 1) {
                this.field1712[var72] = var6.method2962();
            }
            if (var16 == 1) {
                this.field1698[var72] = (short) (var7.method3194() - 1);
            }
            if (this.field1696 != null && this.field1698[var72] != -1) {
                this.field1696[var72] = (byte) (var8.method2962() - 1);
            }
        }
        var2.field2509 = var33;
        var3.field2509 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2962();
            if (var78 == 1) {
                var73 = var2.method2984() + var76;
                var74 = var2.method2984() + var73;
                var75 = var2.method2984() + var74;
                var76 = var75;
                this.field1690[var77] = var73;
                this.field1692[var77] = var74;
                this.field1720[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2984() + var76;
                var76 = var75;
                this.field1690[var77] = var73;
                this.field1692[var77] = var74;
                this.field1720[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2984() + var76;
                var76 = var75;
                this.field1690[var77] = var73;
                this.field1692[var77] = var74;
                this.field1720[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2984() + var76;
                var76 = var75;
                this.field1690[var77] = var73;
                this.field1692[var77] = var81;
                this.field1720[var77] = var75;
            }
        }
        var2.field2509 = var50;
        var3.field2509 = var52;
        var4.field2509 = var54;
        var5.field2509 = var56;
        var6.field2509 = var58;
        var7.field2509 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1685[var82] & 0xFF;
            if (var83 == 0) {
                this.field1700[var82] = (short) var2.method3194();
                this.field1703[var82] = (short) var2.method3194();
                this.field1704[var82] = (short) var2.method3194();
            }
            if (var83 == 1) {
                this.field1700[var82] = (short) var3.method3194();
                this.field1703[var82] = (short) var3.method3194();
                this.field1704[var82] = (short) var3.method3194();
                this.field1729[var82] = (short) var4.method3194();
                this.field1711[var82] = (short) var4.method3194();
                this.field1707[var82] = (short) var4.method3194();
                this.field1713[var82] = (short) var5.method3194();
                this.field1723[var82] = var6.method3015();
                this.field1709[var82] = (short) var7.method3194();
            }
            if (var83 == 2) {
                this.field1700[var82] = (short) var3.method3194();
                this.field1703[var82] = (short) var3.method3194();
                this.field1704[var82] = (short) var3.method3194();
                this.field1729[var82] = (short) var4.method3194();
                this.field1711[var82] = (short) var4.method3194();
                this.field1707[var82] = (short) var4.method3194();
                this.field1713[var82] = (short) var5.method3194();
                this.field1723[var82] = var6.method3015();
                this.field1709[var82] = (short) var7.method3194();
                this.field1731[var82] = (short) var7.method3194();
            }
            if (var83 == 3) {
                this.field1700[var82] = (short) var3.method3194();
                this.field1703[var82] = (short) var3.method3194();
                this.field1704[var82] = (short) var3.method3194();
                this.field1729[var82] = (short) var4.method3194();
                this.field1711[var82] = (short) var4.method3194();
                this.field1707[var82] = (short) var4.method3194();
                this.field1713[var82] = (short) var5.method3194();
                this.field1723[var82] = var6.method3015();
                this.field1709[var82] = (short) var7.method3194();
            }
        }
        var2.field2509 = var62;
        int var84 = var2.method2962();
        if (var84 == 0) {
            return;
        }
        new class140();
        var2.method3194();
        var2.method3194();
        var2.method3194();
        var2.method2967();
    }

    @ObfuscatedName("dm.k([B)V")
    public void method2219(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class185 var4 = new class185(arg0);
        class185 var5 = new class185(arg0);
        class185 var6 = new class185(arg0);
        class185 var7 = new class185(arg0);
        class185 var8 = new class185(arg0);
        var4.field2509 = arg0.length - 18;
        int var9 = var4.method3194();
        int var10 = var4.method3194();
        int var11 = var4.method2962();
        int var12 = var4.method2962();
        int var13 = var4.method2962();
        int var14 = var4.method2962();
        int var15 = var4.method2962();
        int var16 = var4.method2962();
        int var17 = var4.method3194();
        int var18 = var4.method3194();
        int var19 = var4.method3194();
        int var20 = var4.method3194();
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
        this.field1721 = var9;
        this.field1689 = var10;
        this.field1706 = var11;
        this.field1686 = new int[var9];
        this.field1687 = new int[var9];
        this.field1691 = new int[var9];
        this.field1690 = new int[var10];
        this.field1692 = new int[var10];
        this.field1720 = new int[var10];
        if (var11 > 0) {
            this.field1685 = new byte[var11];
            this.field1700 = new short[var11];
            this.field1703 = new short[var11];
            this.field1704 = new short[var11];
        }
        if (var16 == 1) {
            this.field1722 = new int[var9];
        }
        if (var12 == 1) {
            this.field1693 = new byte[var10];
            this.field1696 = new byte[var10];
            this.field1698 = new short[var10];
        }
        if (var13 == 255) {
            this.field1694 = new byte[var10];
        } else {
            this.field1699 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1695 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1712 = new int[var10];
        }
        this.field1697 = new short[var10];
        var4.field2509 = var21;
        var5.field2509 = var36;
        var6.field2509 = var38;
        var7.field2509 = var40;
        var8.field2509 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2962();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2984();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2984();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2984();
            }
            this.field1686[var46] = var43 + var48;
            this.field1687[var46] = var44 + var49;
            this.field1691[var46] = var45 + var50;
            var43 = this.field1686[var46];
            var44 = this.field1687[var46];
            var45 = this.field1691[var46];
            if (var16 == 1) {
                this.field1722[var46] = var8.method2962();
            }
        }
        var4.field2509 = var32;
        var5.field2509 = var28;
        var6.field2509 = var26;
        var7.field2509 = var30;
        var8.field2509 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1697[var51] = (short) var4.method3194();
            if (var12 == 1) {
                int var52 = var5.method2962();
                if ((var52 & 0x1) == 1) {
                    this.field1693[var51] = 1;
                    var2 = true;
                } else {
                    this.field1693[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1696[var51] = (byte) (var52 >> 2);
                    this.field1698[var51] = this.field1697[var51];
                    this.field1697[var51] = 127;
                    if (this.field1698[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1696[var51] = -1;
                    this.field1698[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1694[var51] = var6.method3015();
            }
            if (var14 == 1) {
                this.field1695[var51] = var7.method3015();
            }
            if (var15 == 1) {
                this.field1712[var51] = var8.method2962();
            }
        }
        var4.field2509 = var25;
        var5.field2509 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2962();
            if (var58 == 1) {
                var53 = var4.method2984() + var56;
                var54 = var4.method2984() + var53;
                var55 = var4.method2984() + var54;
                var56 = var55;
                this.field1690[var57] = var53;
                this.field1692[var57] = var54;
                this.field1720[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2984() + var56;
                var56 = var55;
                this.field1690[var57] = var53;
                this.field1692[var57] = var54;
                this.field1720[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2984() + var56;
                var56 = var55;
                this.field1690[var57] = var53;
                this.field1692[var57] = var54;
                this.field1720[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2984() + var56;
                var56 = var55;
                this.field1690[var57] = var53;
                this.field1692[var57] = var61;
                this.field1720[var57] = var55;
            }
        }
        var4.field2509 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1685[var62] = 0;
            this.field1700[var62] = (short) var4.method3194();
            this.field1703[var62] = (short) var4.method3194();
            this.field1704[var62] = (short) var4.method3194();
        }
        if (this.field1696 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1696[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1700[var65] & 0xFFFF) == this.field1690[var64] && (this.field1703[var65] & 0xFFFF) == this.field1692[var64] && (this.field1704[var65] & 0xFFFF) == this.field1720[var64]) {
                        this.field1696[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1696 = null;
            }
        }
        if (!var3) {
            this.field1698 = null;
        }
        if (!var2) {
            this.field1693 = null;
        }
    }

    public class127(class127[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1721 = 0;
        this.field1689 = 0;
        this.field1706 = 0;
        this.field1699 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class127 var10 = arg0[var9];
            if (var10 != null) {
                this.field1721 += var10.field1721;
                this.field1689 += var10.field1689;
                this.field1706 += var10.field1706;
                if (var10.field1694 == null) {
                    if (this.field1699 == -1) {
                        this.field1699 = var10.field1699;
                    }
                    if (this.field1699 != var10.field1699) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1693 != null;
                var5 |= var10.field1695 != null;
                var6 |= var10.field1712 != null;
                var7 |= var10.field1698 != null;
                var8 |= var10.field1696 != null;
            }
        }
        this.field1686 = new int[this.field1721];
        this.field1687 = new int[this.field1721];
        this.field1691 = new int[this.field1721];
        this.field1722 = new int[this.field1721];
        this.field1690 = new int[this.field1689];
        this.field1692 = new int[this.field1689];
        this.field1720 = new int[this.field1689];
        if (var3) {
            this.field1693 = new byte[this.field1689];
        }
        if (var4) {
            this.field1694 = new byte[this.field1689];
        }
        if (var5) {
            this.field1695 = new byte[this.field1689];
        }
        if (var6) {
            this.field1712 = new int[this.field1689];
        }
        if (var7) {
            this.field1698 = new short[this.field1689];
        }
        if (var8) {
            this.field1696 = new byte[this.field1689];
        }
        this.field1697 = new short[this.field1689];
        if (this.field1706 > 0) {
            this.field1685 = new byte[this.field1706];
            this.field1700 = new short[this.field1706];
            this.field1703 = new short[this.field1706];
            this.field1704 = new short[this.field1706];
            this.field1729 = new short[this.field1706];
            this.field1711 = new short[this.field1706];
            this.field1707 = new short[this.field1706];
            this.field1713 = new short[this.field1706];
            this.field1723 = new byte[this.field1706];
            this.field1709 = new short[this.field1706];
            this.field1731 = new short[this.field1706];
        }
        this.field1721 = 0;
        this.field1689 = 0;
        this.field1706 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class127 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1689; var13++) {
                    if (var3 && var12.field1693 != null) {
                        this.field1693[this.field1689] = var12.field1693[var13];
                    }
                    if (var4) {
                        if (var12.field1694 == null) {
                            this.field1694[this.field1689] = var12.field1699;
                        } else {
                            this.field1694[this.field1689] = var12.field1694[var13];
                        }
                    }
                    if (var5 && var12.field1695 != null) {
                        this.field1695[this.field1689] = var12.field1695[var13];
                    }
                    if (var6 && var12.field1712 != null) {
                        this.field1712[this.field1689] = var12.field1712[var13];
                    }
                    if (var7) {
                        if (var12.field1698 == null) {
                            this.field1698[this.field1689] = -1;
                        } else {
                            this.field1698[this.field1689] = var12.field1698[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1696 == null || var12.field1696[var13] == -1) {
                            this.field1696[this.field1689] = -1;
                        } else {
                            this.field1696[this.field1689] = (byte) (var12.field1696[var13] + this.field1706);
                        }
                    }
                    this.field1697[this.field1689] = var12.field1697[var13];
                    this.field1690[this.field1689] = this.method2260(var12, var12.field1690[var13]);
                    this.field1692[this.field1689] = this.method2260(var12, var12.field1692[var13]);
                    this.field1720[this.field1689] = this.method2260(var12, var12.field1720[var13]);
                    this.field1689++;
                }
                for (int var14 = 0; var14 < var12.field1706; var14++) {
                    byte var15 = this.field1685[this.field1706] = var12.field1685[var14];
                    if (var15 == 0) {
                        this.field1700[this.field1706] = (short) this.method2260(var12, var12.field1700[var14]);
                        this.field1703[this.field1706] = (short) this.method2260(var12, var12.field1703[var14]);
                        this.field1704[this.field1706] = (short) this.method2260(var12, var12.field1704[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1700[this.field1706] = var12.field1700[var14];
                        this.field1703[this.field1706] = var12.field1703[var14];
                        this.field1704[this.field1706] = var12.field1704[var14];
                        this.field1729[this.field1706] = var12.field1729[var14];
                        this.field1711[this.field1706] = var12.field1711[var14];
                        this.field1707[this.field1706] = var12.field1707[var14];
                        this.field1713[this.field1706] = var12.field1713[var14];
                        this.field1723[this.field1706] = var12.field1723[var14];
                        this.field1709[this.field1706] = var12.field1709[var14];
                    }
                    if (var15 == 2) {
                        this.field1731[this.field1706] = var12.field1731[var14];
                    }
                    this.field1706++;
                }
            }
        }
    }

    @ObfuscatedName("dm.u(Ldm;I)I")
    public final int method2260(class127 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1686[arg1];
        int var5 = arg0.field1687[arg1];
        int var6 = arg0.field1691[arg1];
        for (int var7 = 0; var7 < this.field1721; var7++) {
            if (this.field1686[var7] == var4 && this.field1687[var7] == var5 && this.field1691[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1686[this.field1721] = var4;
            this.field1687[this.field1721] = var5;
            this.field1691[this.field1721] = var6;
            if (arg0.field1722 != null) {
                this.field1722[this.field1721] = arg0.field1722[arg1];
            }
            var3 = this.field1721++;
        }
        return var3;
    }

    public class127(class127 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1721 = arg0.field1721;
        this.field1689 = arg0.field1689;
        this.field1706 = arg0.field1706;
        if (arg1) {
            this.field1686 = arg0.field1686;
            this.field1687 = arg0.field1687;
            this.field1691 = arg0.field1691;
        } else {
            this.field1686 = new int[this.field1721];
            this.field1687 = new int[this.field1721];
            this.field1691 = new int[this.field1721];
            for (int var6 = 0; var6 < this.field1721; var6++) {
                this.field1686[var6] = arg0.field1686[var6];
                this.field1687[var6] = arg0.field1687[var6];
                this.field1691[var6] = arg0.field1691[var6];
            }
        }
        if (arg2) {
            this.field1697 = arg0.field1697;
        } else {
            this.field1697 = new short[this.field1689];
            for (int var7 = 0; var7 < this.field1689; var7++) {
                this.field1697[var7] = arg0.field1697[var7];
            }
        }
        if (arg3 || arg0.field1698 == null) {
            this.field1698 = arg0.field1698;
        } else {
            this.field1698 = new short[this.field1689];
            for (int var8 = 0; var8 < this.field1689; var8++) {
                this.field1698[var8] = arg0.field1698[var8];
            }
        }
        if (arg4) {
            this.field1695 = arg0.field1695;
        } else {
            this.field1695 = new byte[this.field1689];
            if (arg0.field1695 == null) {
                for (int var9 = 0; var9 < this.field1689; var9++) {
                    this.field1695[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1689; var10++) {
                    this.field1695[var10] = arg0.field1695[var10];
                }
            }
        }
        this.field1690 = arg0.field1690;
        this.field1692 = arg0.field1692;
        this.field1720 = arg0.field1720;
        this.field1693 = arg0.field1693;
        this.field1694 = arg0.field1694;
        this.field1696 = arg0.field1696;
        this.field1699 = arg0.field1699;
        this.field1685 = arg0.field1685;
        this.field1700 = arg0.field1700;
        this.field1703 = arg0.field1703;
        this.field1704 = arg0.field1704;
        this.field1729 = arg0.field1729;
        this.field1711 = arg0.field1711;
        this.field1707 = arg0.field1707;
        this.field1713 = arg0.field1713;
        this.field1723 = arg0.field1723;
        this.field1709 = arg0.field1709;
        this.field1731 = arg0.field1731;
        this.field1722 = arg0.field1722;
        this.field1712 = arg0.field1712;
        this.field1714 = arg0.field1714;
        this.field1715 = arg0.field1715;
        this.field1717 = arg0.field1717;
        this.field1716 = arg0.field1716;
        this.field1718 = arg0.field1718;
        this.field1719 = arg0.field1719;
        this.field1701 = arg0.field1701;
    }

    @ObfuscatedName("dm.z()Ldm;")
    public class127 method2257() {
        class127 var1 = new class127();
        if (this.field1693 != null) {
            var1.field1693 = new byte[this.field1689];
            for (int var2 = 0; var2 < this.field1689; var2++) {
                var1.field1693[var2] = this.field1693[var2];
            }
        }
        var1.field1721 = this.field1721;
        var1.field1689 = this.field1689;
        var1.field1706 = this.field1706;
        var1.field1686 = this.field1686;
        var1.field1687 = this.field1687;
        var1.field1691 = this.field1691;
        var1.field1690 = this.field1690;
        var1.field1692 = this.field1692;
        var1.field1720 = this.field1720;
        var1.field1694 = this.field1694;
        var1.field1695 = this.field1695;
        var1.field1696 = this.field1696;
        var1.field1697 = this.field1697;
        var1.field1698 = this.field1698;
        var1.field1699 = this.field1699;
        var1.field1685 = this.field1685;
        var1.field1700 = this.field1700;
        var1.field1703 = this.field1703;
        var1.field1704 = this.field1704;
        var1.field1729 = this.field1729;
        var1.field1711 = this.field1711;
        var1.field1707 = this.field1707;
        var1.field1713 = this.field1713;
        var1.field1723 = this.field1723;
        var1.field1709 = this.field1709;
        var1.field1731 = this.field1731;
        var1.field1722 = this.field1722;
        var1.field1712 = this.field1712;
        var1.field1714 = this.field1714;
        var1.field1715 = this.field1715;
        var1.field1717 = this.field1717;
        var1.field1716 = this.field1716;
        var1.field1719 = this.field1719;
        var1.field1701 = this.field1701;
        return var1;
    }

    @ObfuscatedName("dm.t([[IIIIZI)Ldm;")
    public class127 method2229(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2222();
        int var7 = this.field1688 + arg1;
        int var8 = this.field1724 + arg1;
        int var9 = this.field1726 + arg3;
        int var10 = this.field1725 + arg3;
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
            var15.field1721 = this.field1721;
            var15.field1689 = this.field1689;
            var15.field1706 = this.field1706;
            var15.field1686 = this.field1686;
            var15.field1691 = this.field1691;
            var15.field1690 = this.field1690;
            var15.field1692 = this.field1692;
            var15.field1720 = this.field1720;
            var15.field1693 = this.field1693;
            var15.field1694 = this.field1694;
            var15.field1695 = this.field1695;
            var15.field1696 = this.field1696;
            var15.field1697 = this.field1697;
            var15.field1698 = this.field1698;
            var15.field1699 = this.field1699;
            var15.field1685 = this.field1685;
            var15.field1700 = this.field1700;
            var15.field1703 = this.field1703;
            var15.field1704 = this.field1704;
            var15.field1729 = this.field1729;
            var15.field1711 = this.field1711;
            var15.field1707 = this.field1707;
            var15.field1713 = this.field1713;
            var15.field1723 = this.field1723;
            var15.field1709 = this.field1709;
            var15.field1731 = this.field1731;
            var15.field1722 = this.field1722;
            var15.field1712 = this.field1712;
            var15.field1714 = this.field1714;
            var15.field1715 = this.field1715;
            var15.field1719 = this.field1719;
            var15.field1701 = this.field1701;
            var15.field1687 = new int[var15.field1721];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1721; var16++) {
                int var17 = this.field1686[var16] + arg1;
                int var18 = this.field1691[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1687[var16] = this.field1687[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1721; var26++) {
                int var27 = (-this.field1687[var26] << 16) / this.field2010;
                if (var27 < arg5) {
                    int var28 = this.field1686[var26] + arg1;
                    int var29 = this.field1691[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1687[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1687[var26];
                }
            }
        }
        var15.method2211();
        return var15;
    }

    @ObfuscatedName("dm.f()V")
    public void method2208() {
        int var10002;
        if (this.field1722 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1721; var3++) {
                int var4 = this.field1722[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1714 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1714[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1721) {
                int var7 = this.field1722[var6];
                this.field1714[var7][var1[var7]++] = var6++;
            }
            this.field1722 = null;
        }
        if (this.field1712 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1689; var10++) {
            int var11 = this.field1712[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1715 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1715[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1689) {
            int var14 = this.field1712[var13];
            this.field1715[var14][var8[var14]++] = var13++;
        }
        this.field1712 = null;
    }

    @ObfuscatedName("dm.g()V")
    public void method2249() {
        for (int var1 = 0; var1 < this.field1721; var1++) {
            int var2 = this.field1686[var1];
            this.field1686[var1] = this.field1691[var1];
            this.field1691[var1] = -var2;
        }
        this.method2211();
    }

    @ObfuscatedName("dm.x()V")
    public void method2241() {
        for (int var1 = 0; var1 < this.field1721; var1++) {
            this.field1686[var1] = -this.field1686[var1];
            this.field1691[var1] = -this.field1691[var1];
        }
        this.method2211();
    }

    @ObfuscatedName("dm.c()V")
    public void method2263() {
        for (int var1 = 0; var1 < this.field1721; var1++) {
            int var2 = this.field1691[var1];
            this.field1691[var1] = this.field1686[var1];
            this.field1686[var1] = -var2;
        }
        this.method2211();
    }

    @ObfuscatedName("dm.r(I)V")
    public void method2214(int arg0) {
        int var2 = field1730[arg0];
        int var3 = field1708[arg0];
        for (int var4 = 0; var4 < this.field1721; var4++) {
            int var5 = this.field1691[var4] * var2 + this.field1686[var4] * var3 >> 16;
            this.field1691[var4] = this.field1691[var4] * var3 - this.field1686[var4] * var2 >> 16;
            this.field1686[var4] = var5;
        }
        this.method2211();
    }

    @ObfuscatedName("dm.i(III)V")
    public void method2215(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1721; var4++) {
            this.field1686[var4] += arg0;
            this.field1687[var4] += arg1;
            this.field1691[var4] += arg2;
        }
        this.method2211();
    }

    @ObfuscatedName("dm.q(SS)V")
    public void method2216(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1689; var3++) {
            if (this.field1697[var3] == arg0) {
                this.field1697[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dm.b(SS)V")
    public void method2226(short arg0, short arg1) {
        if (this.field1698 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1689; var3++) {
            if (this.field1698[var3] == arg0) {
                this.field1698[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dm.h()V")
    public void method2218() {
        for (int var1 = 0; var1 < this.field1721; var1++) {
            this.field1691[var1] = -this.field1691[var1];
        }
        for (int var2 = 0; var2 < this.field1689; var2++) {
            int var3 = this.field1690[var2];
            this.field1690[var2] = this.field1720[var2];
            this.field1720[var2] = var3;
        }
        this.method2211();
    }

    @ObfuscatedName("dm.d(III)V")
    public void method2276(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1721; var4++) {
            this.field1686[var4] = this.field1686[var4] * arg0 / 128;
            this.field1687[var4] = this.field1687[var4] * arg1 / 128;
            this.field1691[var4] = this.field1691[var4] * arg2 / 128;
        }
        this.method2211();
    }

    @ObfuscatedName("dm.v()V")
    public void method2220() {
        if (this.field1717 != null) {
            return;
        }
        this.field1717 = new class135[this.field1721];
        for (int var1 = 0; var1 < this.field1721; var1++) {
            this.field1717[var1] = new class135();
        }
        for (int var2 = 0; var2 < this.field1689; var2++) {
            int var3 = this.field1690[var2];
            int var4 = this.field1692[var2];
            int var5 = this.field1720[var2];
            int var6 = this.field1686[var4] - this.field1686[var3];
            int var7 = this.field1687[var4] - this.field1687[var3];
            int var8 = this.field1691[var4] - this.field1691[var3];
            int var9 = this.field1686[var5] - this.field1686[var3];
            int var10 = this.field1687[var5] - this.field1687[var3];
            int var11 = this.field1691[var5] - this.field1691[var3];
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
            if (this.field1693 == null) {
                var19 = 0;
            } else {
                var19 = this.field1693[var2];
            }
            if (var19 == 0) {
                class135 var20 = this.field1717[var3];
                var20.field1895 += var16;
                var20.field1893 += var17;
                var20.field1894 += var18;
                var20.field1892++;
                class135 var21 = this.field1717[var4];
                var21.field1895 += var16;
                var21.field1893 += var17;
                var21.field1894 += var18;
                var21.field1892++;
                class135 var22 = this.field1717[var5];
                var22.field1895 += var16;
                var22.field1893 += var17;
                var22.field1894 += var18;
                var22.field1892++;
            } else if (var19 == 1) {
                if (this.field1716 == null) {
                    this.field1716 = new class143[this.field1689];
                }
                class143 var23 = this.field1716[var2] = new class143();
                var23.field2024 = var16;
                var23.field2023 = var17;
                var23.field2025 = var18;
            }
        }
    }

    @ObfuscatedName("dm.p()V")
    public void method2211() {
        this.field1717 = null;
        this.field1718 = null;
        this.field1716 = null;
        this.field1710 = false;
    }

    @ObfuscatedName("dm.ab()V")
    public void method2222() {
        if (this.field1710) {
            return;
        }
        this.field2010 = 0;
        this.field1702 = 0;
        this.field1688 = 999999;
        this.field1724 = -999999;
        this.field1725 = -99999;
        this.field1726 = 99999;
        for (int var1 = 0; var1 < this.field1721; var1++) {
            int var2 = this.field1686[var1];
            int var3 = this.field1687[var1];
            int var4 = this.field1691[var1];
            if (var2 < this.field1688) {
                this.field1688 = var2;
            }
            if (var2 > this.field1724) {
                this.field1724 = var2;
            }
            if (var4 < this.field1726) {
                this.field1726 = var4;
            }
            if (var4 > this.field1725) {
                this.field1725 = var4;
            }
            if (-var3 > this.field2010) {
                this.field2010 = -var3;
            }
            if (var3 > this.field1702) {
                this.field1702 = var3;
            }
        }
        this.field1710 = true;
    }

    @ObfuscatedName("dm.ad(Ldm;Ldm;IIIZ)V")
    public static void method2223(class127 arg0, class127 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2222();
        arg0.method2220();
        arg1.method2222();
        arg1.method2220();
        field1705++;
        int var6 = 0;
        int[] var7 = arg1.field1686;
        int var8 = arg1.field1721;
        for (int var9 = 0; var9 < arg0.field1721; var9++) {
            class135 var10 = arg0.field1717[var9];
            if (var10.field1892 != 0) {
                int var11 = arg0.field1687[var9] - arg3;
                if (var11 <= arg1.field1702) {
                    int var12 = arg0.field1686[var9] - arg2;
                    if (var12 >= arg1.field1688 && var12 <= arg1.field1724) {
                        int var13 = arg0.field1691[var9] - arg4;
                        if (var13 >= arg1.field1726 && var13 <= arg1.field1725) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class135 var15 = arg1.field1717[var14];
                                if (var7[var14] == var12 && arg1.field1691[var14] == var13 && arg1.field1687[var14] == var11 && var15.field1892 != 0) {
                                    if (arg0.field1718 == null) {
                                        arg0.field1718 = new class135[arg0.field1721];
                                    }
                                    if (arg1.field1718 == null) {
                                        arg1.field1718 = new class135[var8];
                                    }
                                    class135 var16 = arg0.field1718[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1718[var9] = new class135(var10);
                                    }
                                    class135 var17 = arg1.field1718[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1718[var14] = new class135(var15);
                                    }
                                    var16.field1895 += var15.field1895;
                                    var16.field1893 += var15.field1893;
                                    var16.field1894 += var15.field1894;
                                    var16.field1892 += var15.field1892;
                                    var17.field1895 += var10.field1895;
                                    var17.field1893 += var10.field1893;
                                    var17.field1894 += var10.field1894;
                                    var17.field1892 += var10.field1892;
                                    var6++;
                                    field1727[var9] = field1705;
                                    field1728[var14] = field1705;
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
        for (int var18 = 0; var18 < arg0.field1689; var18++) {
            if (field1727[arg0.field1690[var18]] == field1705 && field1727[arg0.field1692[var18]] == field1705 && field1727[arg0.field1720[var18]] == field1705) {
                if (arg0.field1693 == null) {
                    arg0.field1693 = new byte[arg0.field1689];
                }
                arg0.field1693[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1689; var19++) {
            if (field1728[arg1.field1690[var19]] == field1705 && field1728[arg1.field1692[var19]] == field1705 && field1728[arg1.field1720[var19]] == field1705) {
                if (arg1.field1693 == null) {
                    arg1.field1693 = new byte[arg1.field1689];
                }
                arg1.field1693[var19] = 2;
            }
        }
    }

    @ObfuscatedName("dm.ag(IIIII)Lef;")
    public final class133 method2224(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2220();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class133 var8 = new class133();
        var8.field1819 = new int[this.field1689];
        var8.field1824 = new int[this.field1689];
        var8.field1811 = new int[this.field1689];
        if (this.field1706 > 0 && this.field1696 != null) {
            int[] var9 = new int[this.field1706];
            for (int var10 = 0; var10 < this.field1689; var10++) {
                if (this.field1696[var10] != -1) {
                    var9[this.field1696[var10] & 0xFF]++;
                }
            }
            var8.field1831 = 0;
            for (int var11 = 0; var11 < this.field1706; var11++) {
                if (var9[var11] > 0 && this.field1685[var11] == 0) {
                    var8.field1831++;
                }
            }
            var8.field1832 = new int[var8.field1831];
            var8.field1857 = new int[var8.field1831];
            var8.field1834 = new int[var8.field1831];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1706; var13++) {
                if (var9[var13] > 0 && this.field1685[var13] == 0) {
                    var8.field1832[var12] = this.field1700[var13] & 0xFFFF;
                    var8.field1857[var12] = this.field1703[var13] & 0xFFFF;
                    var8.field1834[var12] = this.field1704[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1869 = new byte[this.field1689];
            for (int var14 = 0; var14 < this.field1689; var14++) {
                if (this.field1696[var14] == -1) {
                    var8.field1869[var14] = -1;
                } else {
                    var8.field1869[var14] = (byte) var9[this.field1696[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1689; var15++) {
            byte var16;
            if (this.field1693 == null) {
                var16 = 0;
            } else {
                var16 = this.field1693[var15];
            }
            byte var17;
            if (this.field1695 == null) {
                var17 = 0;
            } else {
                var17 = this.field1695[var15];
            }
            short var18;
            if (this.field1698 == null) {
                var18 = -1;
            } else {
                var18 = this.field1698[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1697[var15] & 0xFFFF;
                    class135 var20;
                    if (this.field1718 == null || this.field1718[this.field1690[var15]] == null) {
                        var20 = this.field1717[this.field1690[var15]];
                    } else {
                        var20 = this.field1718[this.field1690[var15]];
                    }
                    int var21 = (var20.field1894 * arg4 + var20.field1895 * arg2 + var20.field1893 * arg3) / (var20.field1892 * var7) + arg0;
                    var8.field1819[var15] = method2225(var19, var21);
                    class135 var22;
                    if (this.field1718 == null || this.field1718[this.field1692[var15]] == null) {
                        var22 = this.field1717[this.field1692[var15]];
                    } else {
                        var22 = this.field1718[this.field1692[var15]];
                    }
                    int var23 = (var22.field1894 * arg4 + var22.field1895 * arg2 + var22.field1893 * arg3) / (var22.field1892 * var7) + arg0;
                    var8.field1824[var15] = method2225(var19, var23);
                    class135 var24;
                    if (this.field1718 == null || this.field1718[this.field1720[var15]] == null) {
                        var24 = this.field1717[this.field1720[var15]];
                    } else {
                        var24 = this.field1718[this.field1720[var15]];
                    }
                    int var25 = (var24.field1894 * arg4 + var24.field1895 * arg2 + var24.field1893 * arg3) / (var24.field1892 * var7) + arg0;
                    var8.field1811[var15] = method2225(var19, var25);
                } else if (var16 == 1) {
                    class143 var26 = this.field1716[var15];
                    int var27 = (var26.field2025 * arg4 + var26.field2024 * arg2 + var26.field2023 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1819[var15] = method2225(this.field1697[var15] & 0xFFFF, var27);
                    var8.field1811[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1819[var15] = 128;
                    var8.field1811[var15] = -1;
                } else {
                    var8.field1811[var15] = -2;
                }
            } else if (var16 == 0) {
                class135 var28;
                if (this.field1718 == null || this.field1718[this.field1690[var15]] == null) {
                    var28 = this.field1717[this.field1690[var15]];
                } else {
                    var28 = this.field1718[this.field1690[var15]];
                }
                int var29 = (var28.field1894 * arg4 + var28.field1895 * arg2 + var28.field1893 * arg3) / (var28.field1892 * var7) + arg0;
                var8.field1819[var15] = method2250(var29);
                class135 var30;
                if (this.field1718 == null || this.field1718[this.field1692[var15]] == null) {
                    var30 = this.field1717[this.field1692[var15]];
                } else {
                    var30 = this.field1718[this.field1692[var15]];
                }
                int var31 = (var30.field1894 * arg4 + var30.field1895 * arg2 + var30.field1893 * arg3) / (var30.field1892 * var7) + arg0;
                var8.field1824[var15] = method2250(var31);
                class135 var32;
                if (this.field1718 == null || this.field1718[this.field1720[var15]] == null) {
                    var32 = this.field1717[this.field1720[var15]];
                } else {
                    var32 = this.field1718[this.field1720[var15]];
                }
                int var33 = (var32.field1894 * arg4 + var32.field1895 * arg2 + var32.field1893 * arg3) / (var32.field1892 * var7) + arg0;
                var8.field1811[var15] = method2250(var33);
            } else if (var16 == 1) {
                class143 var34 = this.field1716[var15];
                int var35 = (var34.field2025 * arg4 + var34.field2024 * arg2 + var34.field2023 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1819[var15] = method2250(var35);
                var8.field1811[var15] = -1;
            } else {
                var8.field1811[var15] = -2;
            }
        }
        this.method2208();
        var8.field1812 = this.field1721;
        var8.field1816 = this.field1686;
        var8.field1817 = this.field1687;
        var8.field1818 = this.field1691;
        var8.field1873 = this.field1689;
        var8.field1820 = this.field1690;
        var8.field1821 = this.field1692;
        var8.field1822 = this.field1720;
        var8.field1858 = this.field1694;
        var8.field1815 = this.field1695;
        var8.field1830 = this.field1699;
        var8.field1851 = this.field1714;
        var8.field1836 = this.field1715;
        var8.field1829 = this.field1698;
        return var8;
    }

    @ObfuscatedName("dm.ak(II)I")
    public static final int method2225(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("dm.as(I)I")
    public static final int method2250(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
