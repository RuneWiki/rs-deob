package deob;

@ObfuscatedName("dy")
public class class125 extends class139 {

    @ObfuscatedName("dy.p")
    public int field1715 = 0;

    @ObfuscatedName("dy.i")
    public int[] field1702;

    @ObfuscatedName("dy.w")
    public int[] field1684;

    @ObfuscatedName("dy.s")
    public int[] field1674;

    @ObfuscatedName("dy.j")
    public int field1675 = 0;

    @ObfuscatedName("dy.a")
    public int[] field1676;

    @ObfuscatedName("dy.t")
    public int[] field1677;

    @ObfuscatedName("dy.r")
    public int[] field1678;

    @ObfuscatedName("dy.m")
    public byte[] field1679;

    @ObfuscatedName("dy.h")
    public byte[] field1680;

    @ObfuscatedName("dy.o")
    public byte[] field1681;

    @ObfuscatedName("dy.x")
    public byte[] field1682;

    @ObfuscatedName("dy.q")
    public short[] field1683;

    @ObfuscatedName("dy.v")
    public short[] field1685;

    @ObfuscatedName("dy.n")
    public byte field1693 = 0;

    @ObfuscatedName("dy.y")
    public int field1689;

    @ObfuscatedName("dy.d")
    public byte[] field1672;

    @ObfuscatedName("dy.l")
    public short[] field1688;

    @ObfuscatedName("dy.f")
    public short[] field1686;

    @ObfuscatedName("dy.k")
    public short[] field1690;

    @ObfuscatedName("dy.e")
    public short[] field1708;

    @ObfuscatedName("dy.u")
    public short[] field1687;

    @ObfuscatedName("dy.g")
    public short[] field1717;

    @ObfuscatedName("dy.z")
    public short[] field1673;

    @ObfuscatedName("dy.b")
    public short[] field1695;

    @ObfuscatedName("dy.c")
    public short[] field1696;

    @ObfuscatedName("dy.aa")
    public byte[] field1671;

    @ObfuscatedName("dy.ap")
    public int[] field1698;

    @ObfuscatedName("dy.ao")
    public int[] field1699;

    @ObfuscatedName("dy.ar")
    public int[][] field1700;

    @ObfuscatedName("dy.ay")
    public int[][] field1701;

    @ObfuscatedName("dy.ax")
    public class141[] field1703;

    @ObfuscatedName("dy.ae")
    public class133[] field1691;

    @ObfuscatedName("dy.ah")
    public class133[] field1704;

    @ObfuscatedName("dy.ai")
    public short field1705;

    @ObfuscatedName("dy.au")
    public short field1706;

    @ObfuscatedName("dy.am")
    public boolean field1707 = false;

    @ObfuscatedName("dy.af")
    public int field1692;

    @ObfuscatedName("dy.an")
    public int field1709;

    @ObfuscatedName("dy.ag")
    public int field1710;

    @ObfuscatedName("dy.av")
    public int field1711;

    @ObfuscatedName("dy.aw")
    public int field1697;

    @ObfuscatedName("dy.ad")
    public static int[] field1713 = new int[10000];

    @ObfuscatedName("dy.ab")
    public static int[] field1714 = new int[10000];

    @ObfuscatedName("dy.aq")
    public static int field1712 = 0;

    @ObfuscatedName("dy.ac")
    public static int[] field1716 = class134.field1889;

    @ObfuscatedName("dy.ak")
    public static int[] field1694 = class134.field1911;

    public class125() {
    }

    @ObfuscatedName("dy.p(Lik;II)Ldy;")
    public static class125 method2372(class247 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4032(arg1, arg2);
        return var3 == null ? null : new class125(var3);
    }

    public class125(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2373(arg0);
        } else {
            this.method2431(arg0);
        }
    }

    @ObfuscatedName("dy.i([B)V")
    public void method2373(byte[] arg0) {
        class185 var2 = new class185(arg0);
        class185 var3 = new class185(arg0);
        class185 var4 = new class185(arg0);
        class185 var5 = new class185(arg0);
        class185 var6 = new class185(arg0);
        class185 var7 = new class185(arg0);
        class185 var8 = new class185(arg0);
        var2.field2488 = arg0.length - 23;
        int var9 = var2.method3124();
        int var10 = var2.method3124();
        int var11 = var2.method3197();
        int var12 = var2.method3197();
        int var13 = var2.method3197();
        int var14 = var2.method3197();
        int var15 = var2.method3197();
        int var16 = var2.method3197();
        int var17 = var2.method3197();
        int var18 = var2.method3124();
        int var19 = var2.method3124();
        int var20 = var2.method3124();
        int var21 = var2.method3124();
        int var22 = var2.method3124();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1672 = new byte[var11];
            var2.field2488 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1672[var26] = var2.method3123();
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
        this.field1715 = var9;
        this.field1675 = var10;
        this.field1689 = var11;
        this.field1702 = new int[var9];
        this.field1684 = new int[var9];
        this.field1674 = new int[var9];
        this.field1676 = new int[var10];
        this.field1677 = new int[var10];
        this.field1678 = new int[var10];
        if (var17 == 1) {
            this.field1698 = new int[var9];
        }
        if (var12 == 1) {
            this.field1679 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1680 = new byte[var10];
        } else {
            this.field1693 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1681 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1699 = new int[var10];
        }
        if (var16 == 1) {
            this.field1685 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1682 = new byte[var10];
        }
        this.field1683 = new short[var10];
        if (var11 > 0) {
            this.field1688 = new short[var11];
            this.field1686 = new short[var11];
            this.field1690 = new short[var11];
            if (var24 > 0) {
                this.field1708 = new short[var24];
                this.field1687 = new short[var24];
                this.field1717 = new short[var24];
                this.field1673 = new short[var24];
                this.field1671 = new byte[var24];
                this.field1695 = new short[var24];
            }
            if (var25 > 0) {
                this.field1696 = new short[var25];
            }
        }
        var2.field2488 = var11;
        var3.field2488 = var44;
        var4.field2488 = var46;
        var5.field2488 = var48;
        var6.field2488 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method3197();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method3224();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method3224();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method3224();
            }
            this.field1702[var67] = var64 + var69;
            this.field1684[var67] = var65 + var70;
            this.field1674[var67] = var66 + var71;
            var64 = this.field1702[var67];
            var65 = this.field1684[var67];
            var66 = this.field1674[var67];
            if (var17 == 1) {
                this.field1698[var67] = var6.method3197();
            }
        }
        var2.field2488 = var42;
        var3.field2488 = var31;
        var4.field2488 = var34;
        var5.field2488 = var37;
        var6.field2488 = var35;
        var7.field2488 = var40;
        var8.field2488 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1683[var72] = (short) var2.method3124();
            if (var12 == 1) {
                this.field1679[var72] = var3.method3123();
            }
            if (var13 == 255) {
                this.field1680[var72] = var4.method3123();
            }
            if (var14 == 1) {
                this.field1681[var72] = var5.method3123();
            }
            if (var15 == 1) {
                this.field1699[var72] = var6.method3197();
            }
            if (var16 == 1) {
                this.field1685[var72] = (short) (var7.method3124() - 1);
            }
            if (this.field1682 != null && this.field1685[var72] != -1) {
                this.field1682[var72] = (byte) (var8.method3197() - 1);
            }
        }
        var2.field2488 = var33;
        var3.field2488 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method3197();
            if (var78 == 1) {
                var73 = var2.method3224() + var76;
                var74 = var2.method3224() + var73;
                var75 = var2.method3224() + var74;
                var76 = var75;
                this.field1676[var77] = var73;
                this.field1677[var77] = var74;
                this.field1678[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method3224() + var76;
                var76 = var75;
                this.field1676[var77] = var73;
                this.field1677[var77] = var74;
                this.field1678[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method3224() + var76;
                var76 = var75;
                this.field1676[var77] = var73;
                this.field1677[var77] = var74;
                this.field1678[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method3224() + var76;
                var76 = var75;
                this.field1676[var77] = var73;
                this.field1677[var77] = var81;
                this.field1678[var77] = var75;
            }
        }
        var2.field2488 = var50;
        var3.field2488 = var52;
        var4.field2488 = var54;
        var5.field2488 = var56;
        var6.field2488 = var58;
        var7.field2488 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1672[var82] & 0xFF;
            if (var83 == 0) {
                this.field1688[var82] = (short) var2.method3124();
                this.field1686[var82] = (short) var2.method3124();
                this.field1690[var82] = (short) var2.method3124();
            }
            if (var83 == 1) {
                this.field1688[var82] = (short) var3.method3124();
                this.field1686[var82] = (short) var3.method3124();
                this.field1690[var82] = (short) var3.method3124();
                this.field1708[var82] = (short) var4.method3124();
                this.field1687[var82] = (short) var4.method3124();
                this.field1717[var82] = (short) var4.method3124();
                this.field1673[var82] = (short) var5.method3124();
                this.field1671[var82] = var6.method3123();
                this.field1695[var82] = (short) var7.method3124();
            }
            if (var83 == 2) {
                this.field1688[var82] = (short) var3.method3124();
                this.field1686[var82] = (short) var3.method3124();
                this.field1690[var82] = (short) var3.method3124();
                this.field1708[var82] = (short) var4.method3124();
                this.field1687[var82] = (short) var4.method3124();
                this.field1717[var82] = (short) var4.method3124();
                this.field1673[var82] = (short) var5.method3124();
                this.field1671[var82] = var6.method3123();
                this.field1695[var82] = (short) var7.method3124();
                this.field1696[var82] = (short) var7.method3124();
            }
            if (var83 == 3) {
                this.field1688[var82] = (short) var3.method3124();
                this.field1686[var82] = (short) var3.method3124();
                this.field1690[var82] = (short) var3.method3124();
                this.field1708[var82] = (short) var4.method3124();
                this.field1687[var82] = (short) var4.method3124();
                this.field1717[var82] = (short) var4.method3124();
                this.field1673[var82] = (short) var5.method3124();
                this.field1671[var82] = var6.method3123();
                this.field1695[var82] = (short) var7.method3124();
            }
        }
        var2.field2488 = var62;
        int var84 = var2.method3197();
        if (var84 == 0) {
            return;
        }
        new class138();
        var2.method3124();
        var2.method3124();
        var2.method3124();
        var2.method3127();
    }

    @ObfuscatedName("dy.w([B)V")
    public void method2431(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class185 var4 = new class185(arg0);
        class185 var5 = new class185(arg0);
        class185 var6 = new class185(arg0);
        class185 var7 = new class185(arg0);
        class185 var8 = new class185(arg0);
        var4.field2488 = arg0.length - 18;
        int var9 = var4.method3124();
        int var10 = var4.method3124();
        int var11 = var4.method3197();
        int var12 = var4.method3197();
        int var13 = var4.method3197();
        int var14 = var4.method3197();
        int var15 = var4.method3197();
        int var16 = var4.method3197();
        int var17 = var4.method3124();
        int var18 = var4.method3124();
        int var19 = var4.method3124();
        int var20 = var4.method3124();
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
        this.field1715 = var9;
        this.field1675 = var10;
        this.field1689 = var11;
        this.field1702 = new int[var9];
        this.field1684 = new int[var9];
        this.field1674 = new int[var9];
        this.field1676 = new int[var10];
        this.field1677 = new int[var10];
        this.field1678 = new int[var10];
        if (var11 > 0) {
            this.field1672 = new byte[var11];
            this.field1688 = new short[var11];
            this.field1686 = new short[var11];
            this.field1690 = new short[var11];
        }
        if (var16 == 1) {
            this.field1698 = new int[var9];
        }
        if (var12 == 1) {
            this.field1679 = new byte[var10];
            this.field1682 = new byte[var10];
            this.field1685 = new short[var10];
        }
        if (var13 == 255) {
            this.field1680 = new byte[var10];
        } else {
            this.field1693 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1681 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1699 = new int[var10];
        }
        this.field1683 = new short[var10];
        var4.field2488 = var21;
        var5.field2488 = var36;
        var6.field2488 = var38;
        var7.field2488 = var40;
        var8.field2488 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method3197();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method3224();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method3224();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method3224();
            }
            this.field1702[var46] = var43 + var48;
            this.field1684[var46] = var44 + var49;
            this.field1674[var46] = var45 + var50;
            var43 = this.field1702[var46];
            var44 = this.field1684[var46];
            var45 = this.field1674[var46];
            if (var16 == 1) {
                this.field1698[var46] = var8.method3197();
            }
        }
        var4.field2488 = var32;
        var5.field2488 = var28;
        var6.field2488 = var26;
        var7.field2488 = var30;
        var8.field2488 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1683[var51] = (short) var4.method3124();
            if (var12 == 1) {
                int var52 = var5.method3197();
                if ((var52 & 0x1) == 1) {
                    this.field1679[var51] = 1;
                    var2 = true;
                } else {
                    this.field1679[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1682[var51] = (byte) (var52 >> 2);
                    this.field1685[var51] = this.field1683[var51];
                    this.field1683[var51] = 127;
                    if (this.field1685[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1682[var51] = -1;
                    this.field1685[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1680[var51] = var6.method3123();
            }
            if (var14 == 1) {
                this.field1681[var51] = var7.method3123();
            }
            if (var15 == 1) {
                this.field1699[var51] = var8.method3197();
            }
        }
        var4.field2488 = var25;
        var5.field2488 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method3197();
            if (var58 == 1) {
                var53 = var4.method3224() + var56;
                var54 = var4.method3224() + var53;
                var55 = var4.method3224() + var54;
                var56 = var55;
                this.field1676[var57] = var53;
                this.field1677[var57] = var54;
                this.field1678[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method3224() + var56;
                var56 = var55;
                this.field1676[var57] = var53;
                this.field1677[var57] = var54;
                this.field1678[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method3224() + var56;
                var56 = var55;
                this.field1676[var57] = var53;
                this.field1677[var57] = var54;
                this.field1678[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method3224() + var56;
                var56 = var55;
                this.field1676[var57] = var53;
                this.field1677[var57] = var61;
                this.field1678[var57] = var55;
            }
        }
        var4.field2488 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1672[var62] = 0;
            this.field1688[var62] = (short) var4.method3124();
            this.field1686[var62] = (short) var4.method3124();
            this.field1690[var62] = (short) var4.method3124();
        }
        if (this.field1682 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1682[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1688[var65] & 0xFFFF) == this.field1676[var64] && (this.field1686[var65] & 0xFFFF) == this.field1677[var64] && (this.field1690[var65] & 0xFFFF) == this.field1678[var64]) {
                        this.field1682[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1682 = null;
            }
        }
        if (!var3) {
            this.field1685 = null;
        }
        if (!var2) {
            this.field1679 = null;
        }
    }

    public class125(class125[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1715 = 0;
        this.field1675 = 0;
        this.field1689 = 0;
        this.field1693 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class125 var10 = arg0[var9];
            if (var10 != null) {
                this.field1715 += var10.field1715;
                this.field1675 += var10.field1675;
                this.field1689 += var10.field1689;
                if (var10.field1680 == null) {
                    if (this.field1693 == -1) {
                        this.field1693 = var10.field1693;
                    }
                    if (this.field1693 != var10.field1693) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1679 != null;
                var5 |= var10.field1681 != null;
                var6 |= var10.field1699 != null;
                var7 |= var10.field1685 != null;
                var8 |= var10.field1682 != null;
            }
        }
        this.field1702 = new int[this.field1715];
        this.field1684 = new int[this.field1715];
        this.field1674 = new int[this.field1715];
        this.field1698 = new int[this.field1715];
        this.field1676 = new int[this.field1675];
        this.field1677 = new int[this.field1675];
        this.field1678 = new int[this.field1675];
        if (var3) {
            this.field1679 = new byte[this.field1675];
        }
        if (var4) {
            this.field1680 = new byte[this.field1675];
        }
        if (var5) {
            this.field1681 = new byte[this.field1675];
        }
        if (var6) {
            this.field1699 = new int[this.field1675];
        }
        if (var7) {
            this.field1685 = new short[this.field1675];
        }
        if (var8) {
            this.field1682 = new byte[this.field1675];
        }
        this.field1683 = new short[this.field1675];
        if (this.field1689 > 0) {
            this.field1672 = new byte[this.field1689];
            this.field1688 = new short[this.field1689];
            this.field1686 = new short[this.field1689];
            this.field1690 = new short[this.field1689];
            this.field1708 = new short[this.field1689];
            this.field1687 = new short[this.field1689];
            this.field1717 = new short[this.field1689];
            this.field1673 = new short[this.field1689];
            this.field1671 = new byte[this.field1689];
            this.field1695 = new short[this.field1689];
            this.field1696 = new short[this.field1689];
        }
        this.field1715 = 0;
        this.field1675 = 0;
        this.field1689 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class125 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1675; var13++) {
                    if (var3 && var12.field1679 != null) {
                        this.field1679[this.field1675] = var12.field1679[var13];
                    }
                    if (var4) {
                        if (var12.field1680 == null) {
                            this.field1680[this.field1675] = var12.field1693;
                        } else {
                            this.field1680[this.field1675] = var12.field1680[var13];
                        }
                    }
                    if (var5 && var12.field1681 != null) {
                        this.field1681[this.field1675] = var12.field1681[var13];
                    }
                    if (var6 && var12.field1699 != null) {
                        this.field1699[this.field1675] = var12.field1699[var13];
                    }
                    if (var7) {
                        if (var12.field1685 == null) {
                            this.field1685[this.field1675] = -1;
                        } else {
                            this.field1685[this.field1675] = var12.field1685[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1682 == null || var12.field1682[var13] == -1) {
                            this.field1682[this.field1675] = -1;
                        } else {
                            this.field1682[this.field1675] = (byte) (var12.field1682[var13] + this.field1689);
                        }
                    }
                    this.field1683[this.field1675] = var12.field1683[var13];
                    this.field1676[this.field1675] = this.method2375(var12, var12.field1676[var13]);
                    this.field1677[this.field1675] = this.method2375(var12, var12.field1677[var13]);
                    this.field1678[this.field1675] = this.method2375(var12, var12.field1678[var13]);
                    this.field1675++;
                }
                for (int var14 = 0; var14 < var12.field1689; var14++) {
                    byte var15 = this.field1672[this.field1689] = var12.field1672[var14];
                    if (var15 == 0) {
                        this.field1688[this.field1689] = (short) this.method2375(var12, var12.field1688[var14]);
                        this.field1686[this.field1689] = (short) this.method2375(var12, var12.field1686[var14]);
                        this.field1690[this.field1689] = (short) this.method2375(var12, var12.field1690[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1688[this.field1689] = var12.field1688[var14];
                        this.field1686[this.field1689] = var12.field1686[var14];
                        this.field1690[this.field1689] = var12.field1690[var14];
                        this.field1708[this.field1689] = var12.field1708[var14];
                        this.field1687[this.field1689] = var12.field1687[var14];
                        this.field1717[this.field1689] = var12.field1717[var14];
                        this.field1673[this.field1689] = var12.field1673[var14];
                        this.field1671[this.field1689] = var12.field1671[var14];
                        this.field1695[this.field1689] = var12.field1695[var14];
                    }
                    if (var15 == 2) {
                        this.field1696[this.field1689] = var12.field1696[var14];
                    }
                    this.field1689++;
                }
            }
        }
    }

    @ObfuscatedName("dy.s(Ldy;I)I")
    public final int method2375(class125 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1702[arg1];
        int var5 = arg0.field1684[arg1];
        int var6 = arg0.field1674[arg1];
        for (int var7 = 0; var7 < this.field1715; var7++) {
            if (this.field1702[var7] == var4 && this.field1684[var7] == var5 && this.field1674[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1702[this.field1715] = var4;
            this.field1684[this.field1715] = var5;
            this.field1674[this.field1715] = var6;
            if (arg0.field1698 != null) {
                this.field1698[this.field1715] = arg0.field1698[arg1];
            }
            var3 = this.field1715++;
        }
        return var3;
    }

    public class125(class125 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1715 = arg0.field1715;
        this.field1675 = arg0.field1675;
        this.field1689 = arg0.field1689;
        if (arg1) {
            this.field1702 = arg0.field1702;
            this.field1684 = arg0.field1684;
            this.field1674 = arg0.field1674;
        } else {
            this.field1702 = new int[this.field1715];
            this.field1684 = new int[this.field1715];
            this.field1674 = new int[this.field1715];
            for (int var6 = 0; var6 < this.field1715; var6++) {
                this.field1702[var6] = arg0.field1702[var6];
                this.field1684[var6] = arg0.field1684[var6];
                this.field1674[var6] = arg0.field1674[var6];
            }
        }
        if (arg2) {
            this.field1683 = arg0.field1683;
        } else {
            this.field1683 = new short[this.field1675];
            for (int var7 = 0; var7 < this.field1675; var7++) {
                this.field1683[var7] = arg0.field1683[var7];
            }
        }
        if (arg3 || arg0.field1685 == null) {
            this.field1685 = arg0.field1685;
        } else {
            this.field1685 = new short[this.field1675];
            for (int var8 = 0; var8 < this.field1675; var8++) {
                this.field1685[var8] = arg0.field1685[var8];
            }
        }
        if (arg4) {
            this.field1681 = arg0.field1681;
        } else {
            this.field1681 = new byte[this.field1675];
            if (arg0.field1681 == null) {
                for (int var9 = 0; var9 < this.field1675; var9++) {
                    this.field1681[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1675; var10++) {
                    this.field1681[var10] = arg0.field1681[var10];
                }
            }
        }
        this.field1676 = arg0.field1676;
        this.field1677 = arg0.field1677;
        this.field1678 = arg0.field1678;
        this.field1679 = arg0.field1679;
        this.field1680 = arg0.field1680;
        this.field1682 = arg0.field1682;
        this.field1693 = arg0.field1693;
        this.field1672 = arg0.field1672;
        this.field1688 = arg0.field1688;
        this.field1686 = arg0.field1686;
        this.field1690 = arg0.field1690;
        this.field1708 = arg0.field1708;
        this.field1687 = arg0.field1687;
        this.field1717 = arg0.field1717;
        this.field1673 = arg0.field1673;
        this.field1671 = arg0.field1671;
        this.field1695 = arg0.field1695;
        this.field1696 = arg0.field1696;
        this.field1698 = arg0.field1698;
        this.field1699 = arg0.field1699;
        this.field1700 = arg0.field1700;
        this.field1701 = arg0.field1701;
        this.field1691 = arg0.field1691;
        this.field1703 = arg0.field1703;
        this.field1704 = arg0.field1704;
        this.field1705 = arg0.field1705;
        this.field1706 = arg0.field1706;
    }

    @ObfuscatedName("dy.j()Ldy;")
    public class125 method2376() {
        class125 var1 = new class125();
        if (this.field1679 != null) {
            var1.field1679 = new byte[this.field1675];
            for (int var2 = 0; var2 < this.field1675; var2++) {
                var1.field1679[var2] = this.field1679[var2];
            }
        }
        var1.field1715 = this.field1715;
        var1.field1675 = this.field1675;
        var1.field1689 = this.field1689;
        var1.field1702 = this.field1702;
        var1.field1684 = this.field1684;
        var1.field1674 = this.field1674;
        var1.field1676 = this.field1676;
        var1.field1677 = this.field1677;
        var1.field1678 = this.field1678;
        var1.field1680 = this.field1680;
        var1.field1681 = this.field1681;
        var1.field1682 = this.field1682;
        var1.field1683 = this.field1683;
        var1.field1685 = this.field1685;
        var1.field1693 = this.field1693;
        var1.field1672 = this.field1672;
        var1.field1688 = this.field1688;
        var1.field1686 = this.field1686;
        var1.field1690 = this.field1690;
        var1.field1708 = this.field1708;
        var1.field1687 = this.field1687;
        var1.field1717 = this.field1717;
        var1.field1673 = this.field1673;
        var1.field1671 = this.field1671;
        var1.field1695 = this.field1695;
        var1.field1696 = this.field1696;
        var1.field1698 = this.field1698;
        var1.field1699 = this.field1699;
        var1.field1700 = this.field1700;
        var1.field1701 = this.field1701;
        var1.field1691 = this.field1691;
        var1.field1703 = this.field1703;
        var1.field1705 = this.field1705;
        var1.field1706 = this.field1706;
        return var1;
    }

    @ObfuscatedName("dy.a([[IIIIZI)Ldy;")
    public class125 method2399(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2389();
        int var7 = this.field1709 + arg1;
        int var8 = this.field1710 + arg1;
        int var9 = this.field1697 + arg3;
        int var10 = this.field1711 + arg3;
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
            var15.field1715 = this.field1715;
            var15.field1675 = this.field1675;
            var15.field1689 = this.field1689;
            var15.field1702 = this.field1702;
            var15.field1674 = this.field1674;
            var15.field1676 = this.field1676;
            var15.field1677 = this.field1677;
            var15.field1678 = this.field1678;
            var15.field1679 = this.field1679;
            var15.field1680 = this.field1680;
            var15.field1681 = this.field1681;
            var15.field1682 = this.field1682;
            var15.field1683 = this.field1683;
            var15.field1685 = this.field1685;
            var15.field1693 = this.field1693;
            var15.field1672 = this.field1672;
            var15.field1688 = this.field1688;
            var15.field1686 = this.field1686;
            var15.field1690 = this.field1690;
            var15.field1708 = this.field1708;
            var15.field1687 = this.field1687;
            var15.field1717 = this.field1717;
            var15.field1673 = this.field1673;
            var15.field1671 = this.field1671;
            var15.field1695 = this.field1695;
            var15.field1696 = this.field1696;
            var15.field1698 = this.field1698;
            var15.field1699 = this.field1699;
            var15.field1700 = this.field1700;
            var15.field1701 = this.field1701;
            var15.field1705 = this.field1705;
            var15.field1706 = this.field1706;
            var15.field1684 = new int[var15.field1715];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1715; var16++) {
                int var17 = this.field1702[var16] + arg1;
                int var18 = this.field1674[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1684[var16] = this.field1684[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1715; var26++) {
                int var27 = (-this.field1684[var26] << 16) / this.field1998;
                if (var27 < arg5) {
                    int var28 = this.field1702[var26] + arg1;
                    int var29 = this.field1674[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1684[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1684[var26];
                }
            }
        }
        var15.method2388();
        return var15;
    }

    @ObfuscatedName("dy.t()V")
    public void method2371() {
        int var10002;
        if (this.field1698 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1715; var3++) {
                int var4 = this.field1698[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1700 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1700[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1715) {
                int var7 = this.field1698[var6];
                this.field1700[var7][var1[var7]++] = var6++;
            }
            this.field1698 = null;
        }
        if (this.field1699 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1675; var10++) {
            int var11 = this.field1699[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1701 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1701[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1675) {
            int var14 = this.field1699[var13];
            this.field1701[var14][var8[var14]++] = var13++;
        }
        this.field1699 = null;
    }

    @ObfuscatedName("dy.r()V")
    public void method2413() {
        for (int var1 = 0; var1 < this.field1715; var1++) {
            int var2 = this.field1702[var1];
            this.field1702[var1] = this.field1674[var1];
            this.field1674[var1] = -var2;
        }
        this.method2388();
    }

    @ObfuscatedName("dy.h()V")
    public void method2379() {
        for (int var1 = 0; var1 < this.field1715; var1++) {
            this.field1702[var1] = -this.field1702[var1];
            this.field1674[var1] = -this.field1674[var1];
        }
        this.method2388();
    }

    @ObfuscatedName("dy.o()V")
    public void method2380() {
        for (int var1 = 0; var1 < this.field1715; var1++) {
            int var2 = this.field1674[var1];
            this.field1674[var1] = this.field1702[var1];
            this.field1702[var1] = -var2;
        }
        this.method2388();
    }

    @ObfuscatedName("dy.x(I)V")
    public void method2381(int arg0) {
        int var2 = field1716[arg0];
        int var3 = field1694[arg0];
        for (int var4 = 0; var4 < this.field1715; var4++) {
            int var5 = this.field1702[var4] * var3 + this.field1674[var4] * var2 >> 16;
            this.field1674[var4] = this.field1674[var4] * var3 - this.field1702[var4] * var2 >> 16;
            this.field1702[var4] = var5;
        }
        this.method2388();
    }

    @ObfuscatedName("dy.q(III)V")
    public void method2377(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1715; var4++) {
            this.field1702[var4] += arg0;
            this.field1684[var4] += arg1;
            this.field1674[var4] += arg2;
        }
        this.method2388();
    }

    @ObfuscatedName("dy.d(SS)V")
    public void method2383(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1675; var3++) {
            if (this.field1683[var3] == arg0) {
                this.field1683[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dy.l(SS)V")
    public void method2384(short arg0, short arg1) {
        if (this.field1685 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1675; var3++) {
            if (this.field1685[var3] == arg0) {
                this.field1685[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dy.f()V")
    public void method2402() {
        for (int var1 = 0; var1 < this.field1715; var1++) {
            this.field1674[var1] = -this.field1674[var1];
        }
        for (int var2 = 0; var2 < this.field1675; var2++) {
            int var3 = this.field1676[var2];
            this.field1676[var2] = this.field1678[var2];
            this.field1678[var2] = var3;
        }
        this.method2388();
    }

    @ObfuscatedName("dy.k(III)V")
    public void method2382(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1715; var4++) {
            this.field1702[var4] = this.field1702[var4] * arg0 / 128;
            this.field1684[var4] = this.field1684[var4] * arg1 / 128;
            this.field1674[var4] = this.field1674[var4] * arg2 / 128;
        }
        this.method2388();
    }

    @ObfuscatedName("dy.e()V")
    public void method2387() {
        if (this.field1691 != null) {
            return;
        }
        this.field1691 = new class133[this.field1715];
        for (int var1 = 0; var1 < this.field1715; var1++) {
            this.field1691[var1] = new class133();
        }
        for (int var2 = 0; var2 < this.field1675; var2++) {
            int var3 = this.field1676[var2];
            int var4 = this.field1677[var2];
            int var5 = this.field1678[var2];
            int var6 = this.field1702[var4] - this.field1702[var3];
            int var7 = this.field1684[var4] - this.field1684[var3];
            int var8 = this.field1674[var4] - this.field1674[var3];
            int var9 = this.field1702[var5] - this.field1702[var3];
            int var10 = this.field1684[var5] - this.field1684[var3];
            int var11 = this.field1674[var5] - this.field1674[var3];
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
            if (this.field1679 == null) {
                var19 = 0;
            } else {
                var19 = this.field1679[var2];
            }
            if (var19 == 0) {
                class133 var20 = this.field1691[var3];
                var20.field1879 += var16;
                var20.field1880 += var17;
                var20.field1881 += var18;
                var20.field1882++;
                class133 var21 = this.field1691[var4];
                var21.field1879 += var16;
                var21.field1880 += var17;
                var21.field1881 += var18;
                var21.field1882++;
                class133 var22 = this.field1691[var5];
                var22.field1879 += var16;
                var22.field1880 += var17;
                var22.field1881 += var18;
                var22.field1882++;
            } else if (var19 == 1) {
                if (this.field1703 == null) {
                    this.field1703 = new class141[this.field1675];
                }
                class141 var23 = this.field1703[var2] = new class141();
                var23.field2010 = var16;
                var23.field2011 = var17;
                var23.field2009 = var18;
            }
        }
    }

    @ObfuscatedName("dy.u()V")
    public void method2388() {
        this.field1691 = null;
        this.field1704 = null;
        this.field1703 = null;
        this.field1707 = false;
    }

    @ObfuscatedName("dy.z()V")
    public void method2389() {
        if (this.field1707) {
            return;
        }
        this.field1998 = 0;
        this.field1692 = 0;
        this.field1709 = 999999;
        this.field1710 = -999999;
        this.field1711 = -99999;
        this.field1697 = 99999;
        for (int var1 = 0; var1 < this.field1715; var1++) {
            int var2 = this.field1702[var1];
            int var3 = this.field1684[var1];
            int var4 = this.field1674[var1];
            if (var2 < this.field1709) {
                this.field1709 = var2;
            }
            if (var2 > this.field1710) {
                this.field1710 = var2;
            }
            if (var4 < this.field1697) {
                this.field1697 = var4;
            }
            if (var4 > this.field1711) {
                this.field1711 = var4;
            }
            if (-var3 > this.field1998) {
                this.field1998 = -var3;
            }
            if (var3 > this.field1692) {
                this.field1692 = var3;
            }
        }
        this.field1707 = true;
    }

    @ObfuscatedName("dy.b(Ldy;Ldy;IIIZ)V")
    public static void method2420(class125 arg0, class125 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2389();
        arg0.method2387();
        arg1.method2389();
        arg1.method2387();
        field1712++;
        int var6 = 0;
        int[] var7 = arg1.field1702;
        int var8 = arg1.field1715;
        for (int var9 = 0; var9 < arg0.field1715; var9++) {
            class133 var10 = arg0.field1691[var9];
            if (var10.field1882 != 0) {
                int var11 = arg0.field1684[var9] - arg3;
                if (var11 <= arg1.field1692) {
                    int var12 = arg0.field1702[var9] - arg2;
                    if (var12 >= arg1.field1709 && var12 <= arg1.field1710) {
                        int var13 = arg0.field1674[var9] - arg4;
                        if (var13 >= arg1.field1697 && var13 <= arg1.field1711) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class133 var15 = arg1.field1691[var14];
                                if (var7[var14] == var12 && arg1.field1674[var14] == var13 && arg1.field1684[var14] == var11 && var15.field1882 != 0) {
                                    if (arg0.field1704 == null) {
                                        arg0.field1704 = new class133[arg0.field1715];
                                    }
                                    if (arg1.field1704 == null) {
                                        arg1.field1704 = new class133[var8];
                                    }
                                    class133 var16 = arg0.field1704[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1704[var9] = new class133(var10);
                                    }
                                    class133 var17 = arg1.field1704[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1704[var14] = new class133(var15);
                                    }
                                    var16.field1879 += var15.field1879;
                                    var16.field1880 += var15.field1880;
                                    var16.field1881 += var15.field1881;
                                    var16.field1882 += var15.field1882;
                                    var17.field1879 += var10.field1879;
                                    var17.field1880 += var10.field1880;
                                    var17.field1881 += var10.field1881;
                                    var17.field1882 += var10.field1882;
                                    var6++;
                                    field1713[var9] = field1712;
                                    field1714[var14] = field1712;
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
        for (int var18 = 0; var18 < arg0.field1675; var18++) {
            if (field1713[arg0.field1676[var18]] == field1712 && field1713[arg0.field1677[var18]] == field1712 && field1713[arg0.field1678[var18]] == field1712) {
                if (arg0.field1679 == null) {
                    arg0.field1679 = new byte[arg0.field1675];
                }
                arg0.field1679[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1675; var19++) {
            if (field1714[arg1.field1676[var19]] == field1712 && field1714[arg1.field1677[var19]] == field1712 && field1714[arg1.field1678[var19]] == field1712) {
                if (arg1.field1679 == null) {
                    arg1.field1679 = new byte[arg1.field1675];
                }
                arg1.field1679[var19] = 2;
            }
        }
    }

    @ObfuscatedName("dy.c(IIIII)Len;")
    public final class131 method2391(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2387();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class131 var8 = new class131();
        var8.field1848 = new int[this.field1675];
        var8.field1845 = new int[this.field1675];
        var8.field1814 = new int[this.field1675];
        if (this.field1689 > 0 && this.field1682 != null) {
            int[] var9 = new int[this.field1689];
            for (int var10 = 0; var10 < this.field1675; var10++) {
                if (this.field1682[var10] != -1) {
                    var9[this.field1682[var10] & 0xFF]++;
                }
            }
            var8.field1820 = 0;
            for (int var11 = 0; var11 < this.field1689; var11++) {
                if (var9[var11] > 0 && this.field1672[var11] == 0) {
                    var8.field1820++;
                }
            }
            var8.field1821 = new int[var8.field1820];
            var8.field1822 = new int[var8.field1820];
            var8.field1823 = new int[var8.field1820];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1689; var13++) {
                if (var9[var13] > 0 && this.field1672[var13] == 0) {
                    var8.field1821[var12] = this.field1688[var13] & 0xFFFF;
                    var8.field1822[var12] = this.field1686[var13] & 0xFFFF;
                    var8.field1823[var12] = this.field1690[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1817 = new byte[this.field1675];
            for (int var14 = 0; var14 < this.field1675; var14++) {
                if (this.field1682[var14] == -1) {
                    var8.field1817[var14] = -1;
                } else {
                    var8.field1817[var14] = (byte) var9[this.field1682[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1675; var15++) {
            byte var16;
            if (this.field1679 == null) {
                var16 = 0;
            } else {
                var16 = this.field1679[var15];
            }
            byte var17;
            if (this.field1681 == null) {
                var17 = 0;
            } else {
                var17 = this.field1681[var15];
            }
            short var18;
            if (this.field1685 == null) {
                var18 = -1;
            } else {
                var18 = this.field1685[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1683[var15] & 0xFFFF;
                    class133 var20;
                    if (this.field1704 == null || this.field1704[this.field1676[var15]] == null) {
                        var20 = this.field1691[this.field1676[var15]];
                    } else {
                        var20 = this.field1704[this.field1676[var15]];
                    }
                    int var21 = (var20.field1881 * arg4 + var20.field1880 * arg3 + var20.field1879 * arg2) / (var20.field1882 * var7) + arg0;
                    var8.field1848[var15] = method2392(var19, var21);
                    class133 var22;
                    if (this.field1704 == null || this.field1704[this.field1677[var15]] == null) {
                        var22 = this.field1691[this.field1677[var15]];
                    } else {
                        var22 = this.field1704[this.field1677[var15]];
                    }
                    int var23 = (var22.field1881 * arg4 + var22.field1880 * arg3 + var22.field1879 * arg2) / (var22.field1882 * var7) + arg0;
                    var8.field1845[var15] = method2392(var19, var23);
                    class133 var24;
                    if (this.field1704 == null || this.field1704[this.field1678[var15]] == null) {
                        var24 = this.field1691[this.field1678[var15]];
                    } else {
                        var24 = this.field1704[this.field1678[var15]];
                    }
                    int var25 = (var24.field1881 * arg4 + var24.field1880 * arg3 + var24.field1879 * arg2) / (var24.field1882 * var7) + arg0;
                    var8.field1814[var15] = method2392(var19, var25);
                } else if (var16 == 1) {
                    class141 var26 = this.field1703[var15];
                    int var27 = (var26.field2009 * arg4 + var26.field2011 * arg3 + var26.field2010 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field1848[var15] = method2392(this.field1683[var15] & 0xFFFF, var27);
                    var8.field1814[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1848[var15] = 128;
                    var8.field1814[var15] = -1;
                } else {
                    var8.field1814[var15] = -2;
                }
            } else if (var16 == 0) {
                class133 var28;
                if (this.field1704 == null || this.field1704[this.field1676[var15]] == null) {
                    var28 = this.field1691[this.field1676[var15]];
                } else {
                    var28 = this.field1704[this.field1676[var15]];
                }
                int var29 = (var28.field1881 * arg4 + var28.field1880 * arg3 + var28.field1879 * arg2) / (var28.field1882 * var7) + arg0;
                var8.field1848[var15] = method2393(var29);
                class133 var30;
                if (this.field1704 == null || this.field1704[this.field1677[var15]] == null) {
                    var30 = this.field1691[this.field1677[var15]];
                } else {
                    var30 = this.field1704[this.field1677[var15]];
                }
                int var31 = (var30.field1881 * arg4 + var30.field1880 * arg3 + var30.field1879 * arg2) / (var30.field1882 * var7) + arg0;
                var8.field1845[var15] = method2393(var31);
                class133 var32;
                if (this.field1704 == null || this.field1704[this.field1678[var15]] == null) {
                    var32 = this.field1691[this.field1678[var15]];
                } else {
                    var32 = this.field1704[this.field1678[var15]];
                }
                int var33 = (var32.field1881 * arg4 + var32.field1880 * arg3 + var32.field1879 * arg2) / (var32.field1882 * var7) + arg0;
                var8.field1814[var15] = method2393(var33);
            } else if (var16 == 1) {
                class141 var34 = this.field1703[var15];
                int var35 = (var34.field2009 * arg4 + var34.field2011 * arg3 + var34.field2010 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field1848[var15] = method2393(var35);
                var8.field1814[var15] = -1;
            } else {
                var8.field1814[var15] = -2;
            }
        }
        this.method2371();
        var8.field1868 = this.field1715;
        var8.field1805 = this.field1702;
        var8.field1801 = this.field1684;
        var8.field1807 = this.field1674;
        var8.field1808 = this.field1675;
        var8.field1809 = this.field1676;
        var8.field1860 = this.field1677;
        var8.field1811 = this.field1678;
        var8.field1800 = this.field1680;
        var8.field1816 = this.field1681;
        var8.field1812 = this.field1693;
        var8.field1824 = this.field1700;
        var8.field1825 = this.field1701;
        var8.field1818 = this.field1685;
        return var8;
    }

    @ObfuscatedName("dy.aa(II)I")
    public static final int method2392(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("dy.ap(I)I")
    public static final int method2393(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
