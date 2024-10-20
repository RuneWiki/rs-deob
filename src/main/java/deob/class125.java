package deob;

@ObfuscatedName("dw")
public class class125 extends class139 {

    @ObfuscatedName("dw.s")
    public int field1716 = 0;

    @ObfuscatedName("dw.g")
    public int[] field1680;

    @ObfuscatedName("dw.m")
    public int[] field1681;

    @ObfuscatedName("dw.h")
    public int[] field1682;

    @ObfuscatedName("dw.i")
    public int field1697 = 0;

    @ObfuscatedName("dw.w")
    public int[] field1684;

    @ObfuscatedName("dw.t")
    public int[] field1685;

    @ObfuscatedName("dw.d")
    public int[] field1686;

    @ObfuscatedName("dw.z")
    public byte[] field1722;

    @ObfuscatedName("dw.k")
    public byte[] field1688;

    @ObfuscatedName("dw.c")
    public byte[] field1689;

    @ObfuscatedName("dw.o")
    public byte[] field1721;

    @ObfuscatedName("dw.l")
    public short[] field1691;

    @ObfuscatedName("dw.f")
    public short[] field1692;

    @ObfuscatedName("dw.q")
    public byte field1693 = 0;

    @ObfuscatedName("dw.r")
    public int field1706;

    @ObfuscatedName("dw.x")
    public byte[] field1701;

    @ObfuscatedName("dw.u")
    public short[] field1723;

    @ObfuscatedName("dw.b")
    public short[] field1696;

    @ObfuscatedName("dw.p")
    public short[] field1698;

    @ObfuscatedName("dw.y")
    public short[] field1699;

    @ObfuscatedName("dw.n")
    public short[] field1700;

    @ObfuscatedName("dw.j")
    public short[] field1704;

    @ObfuscatedName("dw.e")
    public short[] field1702;

    @ObfuscatedName("dw.v")
    public short[] field1703;

    @ObfuscatedName("dw.a")
    public short[] field1687;

    @ObfuscatedName("dw.ad")
    public byte[] field1683;

    @ObfuscatedName("dw.al")
    public int[] field1694;

    @ObfuscatedName("dw.aq")
    public int[] field1707;

    @ObfuscatedName("dw.ar")
    public int[][] field1679;

    @ObfuscatedName("dw.an")
    public int[][] field1709;

    @ObfuscatedName("dw.af")
    public class141[] field1710;

    @ObfuscatedName("dw.as")
    public class133[] field1719;

    @ObfuscatedName("dw.ax")
    public class133[] field1712;

    @ObfuscatedName("dw.ak")
    public short field1713;

    @ObfuscatedName("dw.aw")
    public short field1714;

    @ObfuscatedName("dw.ai")
    public boolean field1715 = false;

    @ObfuscatedName("dw.ab")
    public int field1705;

    @ObfuscatedName("dw.am")
    public int field1717;

    @ObfuscatedName("dw.ah")
    public int field1718;

    @ObfuscatedName("dw.ag")
    public int field1695;

    @ObfuscatedName("dw.az")
    public int field1720;

    @ObfuscatedName("dw.ae")
    public static int[] field1711 = new int[10000];

    @ObfuscatedName("dw.ao")
    public static int[] field1708 = new int[10000];

    @ObfuscatedName("dw.av")
    public static int field1690 = 0;

    @ObfuscatedName("dw.aj")
    public static int[] field1724 = class134.field1918;

    @ObfuscatedName("dw.ap")
    public static int[] field1725 = class134.field1903;

    public class125() {
    }

    @ObfuscatedName("dw.s(Lir;II)Ldw;")
    public static class125 method2428(class247 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4231(arg1, arg2);
        return var3 == null ? null : new class125(var3);
    }

    public class125(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2502(arg0);
        } else {
            this.method2431(arg0);
        }
    }

    @ObfuscatedName("dw.g([B)V")
    public void method2502(byte[] arg0) {
        class185 var2 = new class185(arg0);
        class185 var3 = new class185(arg0);
        class185 var4 = new class185(arg0);
        class185 var5 = new class185(arg0);
        class185 var6 = new class185(arg0);
        class185 var7 = new class185(arg0);
        class185 var8 = new class185(arg0);
        var2.field2514 = arg0.length - 23;
        int var9 = var2.method3241();
        int var10 = var2.method3241();
        int var11 = var2.method3239();
        int var12 = var2.method3239();
        int var13 = var2.method3239();
        int var14 = var2.method3239();
        int var15 = var2.method3239();
        int var16 = var2.method3239();
        int var17 = var2.method3239();
        int var18 = var2.method3241();
        int var19 = var2.method3241();
        int var20 = var2.method3241();
        int var21 = var2.method3241();
        int var22 = var2.method3241();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1701 = new byte[var11];
            var2.field2514 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1701[var26] = var2.method3240();
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
        this.field1697 = var10;
        this.field1706 = var11;
        this.field1680 = new int[var9];
        this.field1681 = new int[var9];
        this.field1682 = new int[var9];
        this.field1684 = new int[var10];
        this.field1685 = new int[var10];
        this.field1686 = new int[var10];
        if (var17 == 1) {
            this.field1694 = new int[var9];
        }
        if (var12 == 1) {
            this.field1722 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1688 = new byte[var10];
        } else {
            this.field1693 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1689 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1707 = new int[var10];
        }
        if (var16 == 1) {
            this.field1692 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1721 = new byte[var10];
        }
        this.field1691 = new short[var10];
        if (var11 > 0) {
            this.field1723 = new short[var11];
            this.field1696 = new short[var11];
            this.field1698 = new short[var11];
            if (var24 > 0) {
                this.field1699 = new short[var24];
                this.field1700 = new short[var24];
                this.field1704 = new short[var24];
                this.field1702 = new short[var24];
                this.field1683 = new byte[var24];
                this.field1703 = new short[var24];
            }
            if (var25 > 0) {
                this.field1687 = new short[var25];
            }
        }
        var2.field2514 = var11;
        var3.field2514 = var44;
        var4.field2514 = var46;
        var5.field2514 = var48;
        var6.field2514 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method3239();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method3461();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method3461();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method3461();
            }
            this.field1680[var67] = var64 + var69;
            this.field1681[var67] = var65 + var70;
            this.field1682[var67] = var66 + var71;
            var64 = this.field1680[var67];
            var65 = this.field1681[var67];
            var66 = this.field1682[var67];
            if (var17 == 1) {
                this.field1694[var67] = var6.method3239();
            }
        }
        var2.field2514 = var42;
        var3.field2514 = var31;
        var4.field2514 = var34;
        var5.field2514 = var37;
        var6.field2514 = var35;
        var7.field2514 = var40;
        var8.field2514 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1691[var72] = (short) var2.method3241();
            if (var12 == 1) {
                this.field1722[var72] = var3.method3240();
            }
            if (var13 == 255) {
                this.field1688[var72] = var4.method3240();
            }
            if (var14 == 1) {
                this.field1689[var72] = var5.method3240();
            }
            if (var15 == 1) {
                this.field1707[var72] = var6.method3239();
            }
            if (var16 == 1) {
                this.field1692[var72] = (short) (var7.method3241() - 1);
            }
            if (this.field1721 != null && this.field1692[var72] != -1) {
                this.field1721[var72] = (byte) (var8.method3239() - 1);
            }
        }
        var2.field2514 = var33;
        var3.field2514 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method3239();
            if (var78 == 1) {
                var73 = var2.method3461() + var76;
                var74 = var2.method3461() + var73;
                var75 = var2.method3461() + var74;
                var76 = var75;
                this.field1684[var77] = var73;
                this.field1685[var77] = var74;
                this.field1686[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method3461() + var76;
                var76 = var75;
                this.field1684[var77] = var73;
                this.field1685[var77] = var74;
                this.field1686[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method3461() + var76;
                var76 = var75;
                this.field1684[var77] = var73;
                this.field1685[var77] = var74;
                this.field1686[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method3461() + var76;
                var76 = var75;
                this.field1684[var77] = var73;
                this.field1685[var77] = var81;
                this.field1686[var77] = var75;
            }
        }
        var2.field2514 = var50;
        var3.field2514 = var52;
        var4.field2514 = var54;
        var5.field2514 = var56;
        var6.field2514 = var58;
        var7.field2514 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1701[var82] & 0xFF;
            if (var83 == 0) {
                this.field1723[var82] = (short) var2.method3241();
                this.field1696[var82] = (short) var2.method3241();
                this.field1698[var82] = (short) var2.method3241();
            }
            if (var83 == 1) {
                this.field1723[var82] = (short) var3.method3241();
                this.field1696[var82] = (short) var3.method3241();
                this.field1698[var82] = (short) var3.method3241();
                this.field1699[var82] = (short) var4.method3241();
                this.field1700[var82] = (short) var4.method3241();
                this.field1704[var82] = (short) var4.method3241();
                this.field1702[var82] = (short) var5.method3241();
                this.field1683[var82] = var6.method3240();
                this.field1703[var82] = (short) var7.method3241();
            }
            if (var83 == 2) {
                this.field1723[var82] = (short) var3.method3241();
                this.field1696[var82] = (short) var3.method3241();
                this.field1698[var82] = (short) var3.method3241();
                this.field1699[var82] = (short) var4.method3241();
                this.field1700[var82] = (short) var4.method3241();
                this.field1704[var82] = (short) var4.method3241();
                this.field1702[var82] = (short) var5.method3241();
                this.field1683[var82] = var6.method3240();
                this.field1703[var82] = (short) var7.method3241();
                this.field1687[var82] = (short) var7.method3241();
            }
            if (var83 == 3) {
                this.field1723[var82] = (short) var3.method3241();
                this.field1696[var82] = (short) var3.method3241();
                this.field1698[var82] = (short) var3.method3241();
                this.field1699[var82] = (short) var4.method3241();
                this.field1700[var82] = (short) var4.method3241();
                this.field1704[var82] = (short) var4.method3241();
                this.field1702[var82] = (short) var5.method3241();
                this.field1683[var82] = var6.method3240();
                this.field1703[var82] = (short) var7.method3241();
            }
        }
        var2.field2514 = var62;
        int var84 = var2.method3239();
        if (var84 == 0) {
            return;
        }
        new class138();
        var2.method3241();
        var2.method3241();
        var2.method3241();
        var2.method3292();
    }

    @ObfuscatedName("dw.m([B)V")
    public void method2431(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class185 var4 = new class185(arg0);
        class185 var5 = new class185(arg0);
        class185 var6 = new class185(arg0);
        class185 var7 = new class185(arg0);
        class185 var8 = new class185(arg0);
        var4.field2514 = arg0.length - 18;
        int var9 = var4.method3241();
        int var10 = var4.method3241();
        int var11 = var4.method3239();
        int var12 = var4.method3239();
        int var13 = var4.method3239();
        int var14 = var4.method3239();
        int var15 = var4.method3239();
        int var16 = var4.method3239();
        int var17 = var4.method3241();
        int var18 = var4.method3241();
        int var19 = var4.method3241();
        int var20 = var4.method3241();
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
        this.field1697 = var10;
        this.field1706 = var11;
        this.field1680 = new int[var9];
        this.field1681 = new int[var9];
        this.field1682 = new int[var9];
        this.field1684 = new int[var10];
        this.field1685 = new int[var10];
        this.field1686 = new int[var10];
        if (var11 > 0) {
            this.field1701 = new byte[var11];
            this.field1723 = new short[var11];
            this.field1696 = new short[var11];
            this.field1698 = new short[var11];
        }
        if (var16 == 1) {
            this.field1694 = new int[var9];
        }
        if (var12 == 1) {
            this.field1722 = new byte[var10];
            this.field1721 = new byte[var10];
            this.field1692 = new short[var10];
        }
        if (var13 == 255) {
            this.field1688 = new byte[var10];
        } else {
            this.field1693 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1689 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1707 = new int[var10];
        }
        this.field1691 = new short[var10];
        var4.field2514 = var21;
        var5.field2514 = var36;
        var6.field2514 = var38;
        var7.field2514 = var40;
        var8.field2514 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method3239();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method3461();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method3461();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method3461();
            }
            this.field1680[var46] = var43 + var48;
            this.field1681[var46] = var44 + var49;
            this.field1682[var46] = var45 + var50;
            var43 = this.field1680[var46];
            var44 = this.field1681[var46];
            var45 = this.field1682[var46];
            if (var16 == 1) {
                this.field1694[var46] = var8.method3239();
            }
        }
        var4.field2514 = var32;
        var5.field2514 = var28;
        var6.field2514 = var26;
        var7.field2514 = var30;
        var8.field2514 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1691[var51] = (short) var4.method3241();
            if (var12 == 1) {
                int var52 = var5.method3239();
                if ((var52 & 0x1) == 1) {
                    this.field1722[var51] = 1;
                    var2 = true;
                } else {
                    this.field1722[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1721[var51] = (byte) (var52 >> 2);
                    this.field1692[var51] = this.field1691[var51];
                    this.field1691[var51] = 127;
                    if (this.field1692[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1721[var51] = -1;
                    this.field1692[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1688[var51] = var6.method3240();
            }
            if (var14 == 1) {
                this.field1689[var51] = var7.method3240();
            }
            if (var15 == 1) {
                this.field1707[var51] = var8.method3239();
            }
        }
        var4.field2514 = var25;
        var5.field2514 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method3239();
            if (var58 == 1) {
                var53 = var4.method3461() + var56;
                var54 = var4.method3461() + var53;
                var55 = var4.method3461() + var54;
                var56 = var55;
                this.field1684[var57] = var53;
                this.field1685[var57] = var54;
                this.field1686[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method3461() + var56;
                var56 = var55;
                this.field1684[var57] = var53;
                this.field1685[var57] = var54;
                this.field1686[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method3461() + var56;
                var56 = var55;
                this.field1684[var57] = var53;
                this.field1685[var57] = var54;
                this.field1686[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method3461() + var56;
                var56 = var55;
                this.field1684[var57] = var53;
                this.field1685[var57] = var61;
                this.field1686[var57] = var55;
            }
        }
        var4.field2514 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1701[var62] = 0;
            this.field1723[var62] = (short) var4.method3241();
            this.field1696[var62] = (short) var4.method3241();
            this.field1698[var62] = (short) var4.method3241();
        }
        if (this.field1721 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1721[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1723[var65] & 0xFFFF) == this.field1684[var64] && (this.field1696[var65] & 0xFFFF) == this.field1685[var64] && (this.field1698[var65] & 0xFFFF) == this.field1686[var64]) {
                        this.field1721[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1721 = null;
            }
        }
        if (!var3) {
            this.field1692 = null;
        }
        if (!var2) {
            this.field1722 = null;
        }
    }

    public class125(class125[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1716 = 0;
        this.field1697 = 0;
        this.field1706 = 0;
        this.field1693 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class125 var10 = arg0[var9];
            if (var10 != null) {
                this.field1716 += var10.field1716;
                this.field1697 += var10.field1697;
                this.field1706 += var10.field1706;
                if (var10.field1688 == null) {
                    if (this.field1693 == -1) {
                        this.field1693 = var10.field1693;
                    }
                    if (this.field1693 != var10.field1693) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1722 != null;
                var5 |= var10.field1689 != null;
                var6 |= var10.field1707 != null;
                var7 |= var10.field1692 != null;
                var8 |= var10.field1721 != null;
            }
        }
        this.field1680 = new int[this.field1716];
        this.field1681 = new int[this.field1716];
        this.field1682 = new int[this.field1716];
        this.field1694 = new int[this.field1716];
        this.field1684 = new int[this.field1697];
        this.field1685 = new int[this.field1697];
        this.field1686 = new int[this.field1697];
        if (var3) {
            this.field1722 = new byte[this.field1697];
        }
        if (var4) {
            this.field1688 = new byte[this.field1697];
        }
        if (var5) {
            this.field1689 = new byte[this.field1697];
        }
        if (var6) {
            this.field1707 = new int[this.field1697];
        }
        if (var7) {
            this.field1692 = new short[this.field1697];
        }
        if (var8) {
            this.field1721 = new byte[this.field1697];
        }
        this.field1691 = new short[this.field1697];
        if (this.field1706 > 0) {
            this.field1701 = new byte[this.field1706];
            this.field1723 = new short[this.field1706];
            this.field1696 = new short[this.field1706];
            this.field1698 = new short[this.field1706];
            this.field1699 = new short[this.field1706];
            this.field1700 = new short[this.field1706];
            this.field1704 = new short[this.field1706];
            this.field1702 = new short[this.field1706];
            this.field1683 = new byte[this.field1706];
            this.field1703 = new short[this.field1706];
            this.field1687 = new short[this.field1706];
        }
        this.field1716 = 0;
        this.field1697 = 0;
        this.field1706 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class125 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1697; var13++) {
                    if (var3 && var12.field1722 != null) {
                        this.field1722[this.field1697] = var12.field1722[var13];
                    }
                    if (var4) {
                        if (var12.field1688 == null) {
                            this.field1688[this.field1697] = var12.field1693;
                        } else {
                            this.field1688[this.field1697] = var12.field1688[var13];
                        }
                    }
                    if (var5 && var12.field1689 != null) {
                        this.field1689[this.field1697] = var12.field1689[var13];
                    }
                    if (var6 && var12.field1707 != null) {
                        this.field1707[this.field1697] = var12.field1707[var13];
                    }
                    if (var7) {
                        if (var12.field1692 == null) {
                            this.field1692[this.field1697] = -1;
                        } else {
                            this.field1692[this.field1697] = var12.field1692[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1721 == null || var12.field1721[var13] == -1) {
                            this.field1721[this.field1697] = -1;
                        } else {
                            this.field1721[this.field1697] = (byte) (var12.field1721[var13] + this.field1706);
                        }
                    }
                    this.field1691[this.field1697] = var12.field1691[var13];
                    this.field1684[this.field1697] = this.method2480(var12, var12.field1684[var13]);
                    this.field1685[this.field1697] = this.method2480(var12, var12.field1685[var13]);
                    this.field1686[this.field1697] = this.method2480(var12, var12.field1686[var13]);
                    this.field1697++;
                }
                for (int var14 = 0; var14 < var12.field1706; var14++) {
                    byte var15 = this.field1701[this.field1706] = var12.field1701[var14];
                    if (var15 == 0) {
                        this.field1723[this.field1706] = (short) this.method2480(var12, var12.field1723[var14]);
                        this.field1696[this.field1706] = (short) this.method2480(var12, var12.field1696[var14]);
                        this.field1698[this.field1706] = (short) this.method2480(var12, var12.field1698[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1723[this.field1706] = var12.field1723[var14];
                        this.field1696[this.field1706] = var12.field1696[var14];
                        this.field1698[this.field1706] = var12.field1698[var14];
                        this.field1699[this.field1706] = var12.field1699[var14];
                        this.field1700[this.field1706] = var12.field1700[var14];
                        this.field1704[this.field1706] = var12.field1704[var14];
                        this.field1702[this.field1706] = var12.field1702[var14];
                        this.field1683[this.field1706] = var12.field1683[var14];
                        this.field1703[this.field1706] = var12.field1703[var14];
                    }
                    if (var15 == 2) {
                        this.field1687[this.field1706] = var12.field1687[var14];
                    }
                    this.field1706++;
                }
            }
        }
    }

    @ObfuscatedName("dw.h(Ldw;I)I")
    public final int method2480(class125 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1680[arg1];
        int var5 = arg0.field1681[arg1];
        int var6 = arg0.field1682[arg1];
        for (int var7 = 0; var7 < this.field1716; var7++) {
            if (this.field1680[var7] == var4 && this.field1681[var7] == var5 && this.field1682[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1680[this.field1716] = var4;
            this.field1681[this.field1716] = var5;
            this.field1682[this.field1716] = var6;
            if (arg0.field1694 != null) {
                this.field1694[this.field1716] = arg0.field1694[arg1];
            }
            var3 = this.field1716++;
        }
        return var3;
    }

    public class125(class125 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1716 = arg0.field1716;
        this.field1697 = arg0.field1697;
        this.field1706 = arg0.field1706;
        if (arg1) {
            this.field1680 = arg0.field1680;
            this.field1681 = arg0.field1681;
            this.field1682 = arg0.field1682;
        } else {
            this.field1680 = new int[this.field1716];
            this.field1681 = new int[this.field1716];
            this.field1682 = new int[this.field1716];
            for (int var6 = 0; var6 < this.field1716; var6++) {
                this.field1680[var6] = arg0.field1680[var6];
                this.field1681[var6] = arg0.field1681[var6];
                this.field1682[var6] = arg0.field1682[var6];
            }
        }
        if (arg2) {
            this.field1691 = arg0.field1691;
        } else {
            this.field1691 = new short[this.field1697];
            for (int var7 = 0; var7 < this.field1697; var7++) {
                this.field1691[var7] = arg0.field1691[var7];
            }
        }
        if (arg3 || arg0.field1692 == null) {
            this.field1692 = arg0.field1692;
        } else {
            this.field1692 = new short[this.field1697];
            for (int var8 = 0; var8 < this.field1697; var8++) {
                this.field1692[var8] = arg0.field1692[var8];
            }
        }
        if (arg4) {
            this.field1689 = arg0.field1689;
        } else {
            this.field1689 = new byte[this.field1697];
            if (arg0.field1689 == null) {
                for (int var9 = 0; var9 < this.field1697; var9++) {
                    this.field1689[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1697; var10++) {
                    this.field1689[var10] = arg0.field1689[var10];
                }
            }
        }
        this.field1684 = arg0.field1684;
        this.field1685 = arg0.field1685;
        this.field1686 = arg0.field1686;
        this.field1722 = arg0.field1722;
        this.field1688 = arg0.field1688;
        this.field1721 = arg0.field1721;
        this.field1693 = arg0.field1693;
        this.field1701 = arg0.field1701;
        this.field1723 = arg0.field1723;
        this.field1696 = arg0.field1696;
        this.field1698 = arg0.field1698;
        this.field1699 = arg0.field1699;
        this.field1700 = arg0.field1700;
        this.field1704 = arg0.field1704;
        this.field1702 = arg0.field1702;
        this.field1683 = arg0.field1683;
        this.field1703 = arg0.field1703;
        this.field1687 = arg0.field1687;
        this.field1694 = arg0.field1694;
        this.field1707 = arg0.field1707;
        this.field1679 = arg0.field1679;
        this.field1709 = arg0.field1709;
        this.field1719 = arg0.field1719;
        this.field1710 = arg0.field1710;
        this.field1712 = arg0.field1712;
        this.field1713 = arg0.field1713;
        this.field1714 = arg0.field1714;
    }

    @ObfuscatedName("dw.i()Ldw;")
    public class125 method2438() {
        class125 var1 = new class125();
        if (this.field1722 != null) {
            var1.field1722 = new byte[this.field1697];
            for (int var2 = 0; var2 < this.field1697; var2++) {
                var1.field1722[var2] = this.field1722[var2];
            }
        }
        var1.field1716 = this.field1716;
        var1.field1697 = this.field1697;
        var1.field1706 = this.field1706;
        var1.field1680 = this.field1680;
        var1.field1681 = this.field1681;
        var1.field1682 = this.field1682;
        var1.field1684 = this.field1684;
        var1.field1685 = this.field1685;
        var1.field1686 = this.field1686;
        var1.field1688 = this.field1688;
        var1.field1689 = this.field1689;
        var1.field1721 = this.field1721;
        var1.field1691 = this.field1691;
        var1.field1692 = this.field1692;
        var1.field1693 = this.field1693;
        var1.field1701 = this.field1701;
        var1.field1723 = this.field1723;
        var1.field1696 = this.field1696;
        var1.field1698 = this.field1698;
        var1.field1699 = this.field1699;
        var1.field1700 = this.field1700;
        var1.field1704 = this.field1704;
        var1.field1702 = this.field1702;
        var1.field1683 = this.field1683;
        var1.field1703 = this.field1703;
        var1.field1687 = this.field1687;
        var1.field1694 = this.field1694;
        var1.field1707 = this.field1707;
        var1.field1679 = this.field1679;
        var1.field1709 = this.field1709;
        var1.field1719 = this.field1719;
        var1.field1710 = this.field1710;
        var1.field1713 = this.field1713;
        var1.field1714 = this.field1714;
        return var1;
    }

    @ObfuscatedName("dw.w([[IIIIZI)Ldw;")
    public class125 method2435(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2448();
        int var7 = this.field1717 + arg1;
        int var8 = this.field1718 + arg1;
        int var9 = this.field1720 + arg3;
        int var10 = this.field1695 + arg3;
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
        class125 var15;
        if (arg4) {
            var15 = new class125();
            var15.field1716 = this.field1716;
            var15.field1697 = this.field1697;
            var15.field1706 = this.field1706;
            var15.field1680 = this.field1680;
            var15.field1682 = this.field1682;
            var15.field1684 = this.field1684;
            var15.field1685 = this.field1685;
            var15.field1686 = this.field1686;
            var15.field1722 = this.field1722;
            var15.field1688 = this.field1688;
            var15.field1689 = this.field1689;
            var15.field1721 = this.field1721;
            var15.field1691 = this.field1691;
            var15.field1692 = this.field1692;
            var15.field1693 = this.field1693;
            var15.field1701 = this.field1701;
            var15.field1723 = this.field1723;
            var15.field1696 = this.field1696;
            var15.field1698 = this.field1698;
            var15.field1699 = this.field1699;
            var15.field1700 = this.field1700;
            var15.field1704 = this.field1704;
            var15.field1702 = this.field1702;
            var15.field1683 = this.field1683;
            var15.field1703 = this.field1703;
            var15.field1687 = this.field1687;
            var15.field1694 = this.field1694;
            var15.field1707 = this.field1707;
            var15.field1679 = this.field1679;
            var15.field1709 = this.field1709;
            var15.field1713 = this.field1713;
            var15.field1714 = this.field1714;
            var15.field1681 = new int[var15.field1716];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1716; var16++) {
                int var17 = this.field1680[var16] + arg1;
                int var18 = this.field1682[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1681[var16] = this.field1681[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1716; var26++) {
                int var27 = (-this.field1681[var26] << 16) / this.field2001;
                if (var27 < arg5) {
                    int var28 = this.field1680[var26] + arg1;
                    int var29 = this.field1682[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1681[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1681[var26];
                }
            }
        }
        var15.method2447();
        return var15;
    }

    @ObfuscatedName("dw.t()V")
    public void method2490() {
        int var10002;
        if (this.field1694 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1716; var3++) {
                int var4 = this.field1694[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1679 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1679[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1716) {
                int var7 = this.field1694[var6];
                this.field1679[var7][var1[var7]++] = var6++;
            }
            this.field1694 = null;
        }
        if (this.field1707 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1697; var10++) {
            int var11 = this.field1707[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1709 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1709[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1697) {
            int var14 = this.field1707[var13];
            this.field1709[var14][var8[var14]++] = var13++;
        }
        this.field1707 = null;
    }

    @ObfuscatedName("dw.d()V")
    public void method2487() {
        for (int var1 = 0; var1 < this.field1716; var1++) {
            int var2 = this.field1680[var1];
            this.field1680[var1] = this.field1682[var1];
            this.field1682[var1] = -var2;
        }
        this.method2447();
    }

    @ObfuscatedName("dw.k()V")
    public void method2437() {
        for (int var1 = 0; var1 < this.field1716; var1++) {
            this.field1680[var1] = -this.field1680[var1];
            this.field1682[var1] = -this.field1682[var1];
        }
        this.method2447();
    }

    @ObfuscatedName("dw.c()V")
    public void method2439() {
        for (int var1 = 0; var1 < this.field1716; var1++) {
            int var2 = this.field1682[var1];
            this.field1682[var1] = this.field1680[var1];
            this.field1680[var1] = -var2;
        }
        this.method2447();
    }

    @ObfuscatedName("dw.o(I)V")
    public void method2440(int arg0) {
        int var2 = field1724[arg0];
        int var3 = field1725[arg0];
        for (int var4 = 0; var4 < this.field1716; var4++) {
            int var5 = this.field1682[var4] * var2 + this.field1680[var4] * var3 >> 16;
            this.field1682[var4] = this.field1682[var4] * var3 - this.field1680[var4] * var2 >> 16;
            this.field1680[var4] = var5;
        }
        this.method2447();
    }

    @ObfuscatedName("dw.l(III)V")
    public void method2441(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1716; var4++) {
            this.field1680[var4] += arg0;
            this.field1681[var4] += arg1;
            this.field1682[var4] += arg2;
        }
        this.method2447();
    }

    @ObfuscatedName("dw.f(SS)V")
    public void method2442(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1697; var3++) {
            if (this.field1691[var3] == arg0) {
                this.field1691[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dw.q(SS)V")
    public void method2443(short arg0, short arg1) {
        if (this.field1692 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1697; var3++) {
            if (this.field1692[var3] == arg0) {
                this.field1692[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dw.r()V")
    public void method2506() {
        for (int var1 = 0; var1 < this.field1716; var1++) {
            this.field1682[var1] = -this.field1682[var1];
        }
        for (int var2 = 0; var2 < this.field1697; var2++) {
            int var3 = this.field1684[var2];
            this.field1684[var2] = this.field1686[var2];
            this.field1686[var2] = var3;
        }
        this.method2447();
    }

    @ObfuscatedName("dw.x(III)V")
    public void method2430(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1716; var4++) {
            this.field1680[var4] = this.field1680[var4] * arg0 / 128;
            this.field1681[var4] = this.field1681[var4] * arg1 / 128;
            this.field1682[var4] = this.field1682[var4] * arg2 / 128;
        }
        this.method2447();
    }

    @ObfuscatedName("dw.u()V")
    public void method2446() {
        if (this.field1719 != null) {
            return;
        }
        this.field1719 = new class133[this.field1716];
        for (int var1 = 0; var1 < this.field1716; var1++) {
            this.field1719[var1] = new class133();
        }
        for (int var2 = 0; var2 < this.field1697; var2++) {
            int var3 = this.field1684[var2];
            int var4 = this.field1685[var2];
            int var5 = this.field1686[var2];
            int var6 = this.field1680[var4] - this.field1680[var3];
            int var7 = this.field1681[var4] - this.field1681[var3];
            int var8 = this.field1682[var4] - this.field1682[var3];
            int var9 = this.field1680[var5] - this.field1680[var3];
            int var10 = this.field1681[var5] - this.field1681[var3];
            int var11 = this.field1682[var5] - this.field1682[var3];
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
            if (this.field1722 == null) {
                var19 = 0;
            } else {
                var19 = this.field1722[var2];
            }
            if (var19 == 0) {
                class133 var20 = this.field1719[var3];
                var20.field1888 += var16;
                var20.field1887 += var17;
                var20.field1891 += var18;
                var20.field1889++;
                class133 var21 = this.field1719[var4];
                var21.field1888 += var16;
                var21.field1887 += var17;
                var21.field1891 += var18;
                var21.field1889++;
                class133 var22 = this.field1719[var5];
                var22.field1888 += var16;
                var22.field1887 += var17;
                var22.field1891 += var18;
                var22.field1889++;
            } else if (var19 == 1) {
                if (this.field1710 == null) {
                    this.field1710 = new class141[this.field1697];
                }
                class141 var23 = this.field1710[var2] = new class141();
                var23.field2015 = var16;
                var23.field2014 = var17;
                var23.field2016 = var18;
            }
        }
    }

    @ObfuscatedName("dw.a()V")
    public void method2447() {
        this.field1719 = null;
        this.field1712 = null;
        this.field1710 = null;
        this.field1715 = false;
    }

    @ObfuscatedName("dw.ad()V")
    public void method2448() {
        if (this.field1715) {
            return;
        }
        this.field2001 = 0;
        this.field1705 = 0;
        this.field1717 = 999999;
        this.field1718 = -999999;
        this.field1695 = -99999;
        this.field1720 = 99999;
        for (int var1 = 0; var1 < this.field1716; var1++) {
            int var2 = this.field1680[var1];
            int var3 = this.field1681[var1];
            int var4 = this.field1682[var1];
            if (var2 < this.field1717) {
                this.field1717 = var2;
            }
            if (var2 > this.field1718) {
                this.field1718 = var2;
            }
            if (var4 < this.field1720) {
                this.field1720 = var4;
            }
            if (var4 > this.field1695) {
                this.field1695 = var4;
            }
            if (-var3 > this.field2001) {
                this.field2001 = -var3;
            }
            if (var3 > this.field1705) {
                this.field1705 = var3;
            }
        }
        this.field1715 = true;
    }

    @ObfuscatedName("dw.al(Ldw;Ldw;IIIZ)V")
    public static void method2449(class125 arg0, class125 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2448();
        arg0.method2446();
        arg1.method2448();
        arg1.method2446();
        field1690++;
        int var6 = 0;
        int[] var7 = arg1.field1680;
        int var8 = arg1.field1716;
        for (int var9 = 0; var9 < arg0.field1716; var9++) {
            class133 var10 = arg0.field1719[var9];
            if (var10.field1889 != 0) {
                int var11 = arg0.field1681[var9] - arg3;
                if (var11 <= arg1.field1705) {
                    int var12 = arg0.field1680[var9] - arg2;
                    if (var12 >= arg1.field1717 && var12 <= arg1.field1718) {
                        int var13 = arg0.field1682[var9] - arg4;
                        if (var13 >= arg1.field1720 && var13 <= arg1.field1695) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class133 var15 = arg1.field1719[var14];
                                if (var7[var14] == var12 && arg1.field1682[var14] == var13 && arg1.field1681[var14] == var11 && var15.field1889 != 0) {
                                    if (arg0.field1712 == null) {
                                        arg0.field1712 = new class133[arg0.field1716];
                                    }
                                    if (arg1.field1712 == null) {
                                        arg1.field1712 = new class133[var8];
                                    }
                                    class133 var16 = arg0.field1712[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1712[var9] = new class133(var10);
                                    }
                                    class133 var17 = arg1.field1712[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1712[var14] = new class133(var15);
                                    }
                                    var16.field1888 += var15.field1888;
                                    var16.field1887 += var15.field1887;
                                    var16.field1891 += var15.field1891;
                                    var16.field1889 += var15.field1889;
                                    var17.field1888 += var10.field1888;
                                    var17.field1887 += var10.field1887;
                                    var17.field1891 += var10.field1891;
                                    var17.field1889 += var10.field1889;
                                    var6++;
                                    field1711[var9] = field1690;
                                    field1708[var14] = field1690;
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
        for (int var18 = 0; var18 < arg0.field1697; var18++) {
            if (field1711[arg0.field1684[var18]] == field1690 && field1711[arg0.field1685[var18]] == field1690 && field1711[arg0.field1686[var18]] == field1690) {
                if (arg0.field1722 == null) {
                    arg0.field1722 = new byte[arg0.field1697];
                }
                arg0.field1722[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1697; var19++) {
            if (field1708[arg1.field1684[var19]] == field1690 && field1708[arg1.field1685[var19]] == field1690 && field1708[arg1.field1686[var19]] == field1690) {
                if (arg1.field1722 == null) {
                    arg1.field1722 = new byte[arg1.field1697];
                }
                arg1.field1722[var19] = 2;
            }
        }
    }

    @ObfuscatedName("dw.aq(IIIII)Les;")
    public final class131 method2450(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2446();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class131 var8 = new class131();
        var8.field1820 = new int[this.field1697];
        var8.field1821 = new int[this.field1697];
        var8.field1822 = new int[this.field1697];
        if (this.field1706 > 0 && this.field1721 != null) {
            int[] var9 = new int[this.field1706];
            for (int var10 = 0; var10 < this.field1697; var10++) {
                if (this.field1721[var10] != -1) {
                    var9[this.field1721[var10] & 0xFF]++;
                }
            }
            var8.field1828 = 0;
            for (int var11 = 0; var11 < this.field1706; var11++) {
                if (var9[var11] > 0 && this.field1701[var11] == 0) {
                    var8.field1828++;
                }
            }
            var8.field1829 = new int[var8.field1828];
            var8.field1808 = new int[var8.field1828];
            var8.field1831 = new int[var8.field1828];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1706; var13++) {
                if (var9[var13] > 0 && this.field1701[var13] == 0) {
                    var8.field1829[var12] = this.field1723[var13] & 0xFFFF;
                    var8.field1808[var12] = this.field1696[var13] & 0xFFFF;
                    var8.field1831[var12] = this.field1698[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1825 = new byte[this.field1697];
            for (int var14 = 0; var14 < this.field1697; var14++) {
                if (this.field1721[var14] == -1) {
                    var8.field1825[var14] = -1;
                } else {
                    var8.field1825[var14] = (byte) var9[this.field1721[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1697; var15++) {
            byte var16;
            if (this.field1722 == null) {
                var16 = 0;
            } else {
                var16 = this.field1722[var15];
            }
            byte var17;
            if (this.field1689 == null) {
                var17 = 0;
            } else {
                var17 = this.field1689[var15];
            }
            short var18;
            if (this.field1692 == null) {
                var18 = -1;
            } else {
                var18 = this.field1692[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1691[var15] & 0xFFFF;
                    class133 var20;
                    if (this.field1712 == null || this.field1712[this.field1684[var15]] == null) {
                        var20 = this.field1719[this.field1684[var15]];
                    } else {
                        var20 = this.field1712[this.field1684[var15]];
                    }
                    int var21 = (var20.field1891 * arg4 + var20.field1888 * arg2 + var20.field1887 * arg3) / (var20.field1889 * var7) + arg0;
                    var8.field1820[var15] = method2451(var19, var21);
                    class133 var22;
                    if (this.field1712 == null || this.field1712[this.field1685[var15]] == null) {
                        var22 = this.field1719[this.field1685[var15]];
                    } else {
                        var22 = this.field1712[this.field1685[var15]];
                    }
                    int var23 = (var22.field1891 * arg4 + var22.field1888 * arg2 + var22.field1887 * arg3) / (var22.field1889 * var7) + arg0;
                    var8.field1821[var15] = method2451(var19, var23);
                    class133 var24;
                    if (this.field1712 == null || this.field1712[this.field1686[var15]] == null) {
                        var24 = this.field1719[this.field1686[var15]];
                    } else {
                        var24 = this.field1712[this.field1686[var15]];
                    }
                    int var25 = (var24.field1891 * arg4 + var24.field1888 * arg2 + var24.field1887 * arg3) / (var24.field1889 * var7) + arg0;
                    var8.field1822[var15] = method2451(var19, var25);
                } else if (var16 == 1) {
                    class141 var26 = this.field1710[var15];
                    int var27 = (var26.field2016 * arg4 + var26.field2015 * arg2 + var26.field2014 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1820[var15] = method2451(this.field1691[var15] & 0xFFFF, var27);
                    var8.field1822[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1820[var15] = 128;
                    var8.field1822[var15] = -1;
                } else {
                    var8.field1822[var15] = -2;
                }
            } else if (var16 == 0) {
                class133 var28;
                if (this.field1712 == null || this.field1712[this.field1684[var15]] == null) {
                    var28 = this.field1719[this.field1684[var15]];
                } else {
                    var28 = this.field1712[this.field1684[var15]];
                }
                int var29 = (var28.field1891 * arg4 + var28.field1888 * arg2 + var28.field1887 * arg3) / (var28.field1889 * var7) + arg0;
                var8.field1820[var15] = method2432(var29);
                class133 var30;
                if (this.field1712 == null || this.field1712[this.field1685[var15]] == null) {
                    var30 = this.field1719[this.field1685[var15]];
                } else {
                    var30 = this.field1712[this.field1685[var15]];
                }
                int var31 = (var30.field1891 * arg4 + var30.field1888 * arg2 + var30.field1887 * arg3) / (var30.field1889 * var7) + arg0;
                var8.field1821[var15] = method2432(var31);
                class133 var32;
                if (this.field1712 == null || this.field1712[this.field1686[var15]] == null) {
                    var32 = this.field1719[this.field1686[var15]];
                } else {
                    var32 = this.field1712[this.field1686[var15]];
                }
                int var33 = (var32.field1891 * arg4 + var32.field1888 * arg2 + var32.field1887 * arg3) / (var32.field1889 * var7) + arg0;
                var8.field1822[var15] = method2432(var33);
            } else if (var16 == 1) {
                class141 var34 = this.field1710[var15];
                int var35 = (var34.field2016 * arg4 + var34.field2015 * arg2 + var34.field2014 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1820[var15] = method2432(var35);
                var8.field1822[var15] = -1;
            } else {
                var8.field1822[var15] = -2;
            }
        }
        this.method2490();
        var8.field1845 = this.field1716;
        var8.field1841 = this.field1680;
        var8.field1874 = this.field1681;
        var8.field1815 = this.field1682;
        var8.field1850 = this.field1697;
        var8.field1817 = this.field1684;
        var8.field1837 = this.field1685;
        var8.field1844 = this.field1686;
        var8.field1823 = this.field1688;
        var8.field1824 = this.field1689;
        var8.field1827 = this.field1693;
        var8.field1851 = this.field1679;
        var8.field1833 = this.field1709;
        var8.field1819 = this.field1692;
        return var8;
    }

    @ObfuscatedName("dw.ar(II)I")
    public static final int method2451(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("dw.an(I)I")
    public static final int method2432(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
