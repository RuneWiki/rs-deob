package deob;

@ObfuscatedName("cf")
public class class100 extends class85 {

    @ObfuscatedName("cf.o")
    public int field1682 = 0;

    @ObfuscatedName("cf.e")
    public int[] field1674;

    @ObfuscatedName("cf.u")
    public int[] field1675;

    @ObfuscatedName("cf.b")
    public int[] field1676;

    @ObfuscatedName("cf.p")
    public int field1673 = 0;

    @ObfuscatedName("cf.s")
    public int[] field1693;

    @ObfuscatedName("cf.y")
    public int[] field1679;

    @ObfuscatedName("cf.t")
    public int[] field1680;

    @ObfuscatedName("cf.w")
    public byte[] field1678;

    @ObfuscatedName("cf.h")
    public byte[] field1718;

    @ObfuscatedName("cf.d")
    public byte[] field1683;

    @ObfuscatedName("cf.l")
    public byte[] field1689;

    @ObfuscatedName("cf.n")
    public short[] field1677;

    @ObfuscatedName("cf.q")
    public short[] field1686;

    @ObfuscatedName("cf.f")
    public byte field1687 = 0;

    @ObfuscatedName("cf.v")
    public int field1688;

    @ObfuscatedName("cf.a")
    public byte[] field1704;

    @ObfuscatedName("cf.k")
    public short[] field1690;

    @ObfuscatedName("cf.r")
    public short[] field1691;

    @ObfuscatedName("cf.i")
    public short[] field1692;

    @ObfuscatedName("cf.j")
    public short[] field1699;

    @ObfuscatedName("cf.z")
    public short[] field1684;

    @ObfuscatedName("cf.m")
    public short[] field1694;

    @ObfuscatedName("cf.g")
    public short[] field1696;

    @ObfuscatedName("cf.c")
    public short[] field1697;

    @ObfuscatedName("cf.x")
    public short[] field1698;

    @ObfuscatedName("cf.ah")
    public byte[] field1708;

    @ObfuscatedName("cf.ap")
    public int[] field1700;

    @ObfuscatedName("cf.aa")
    public int[] field1701;

    @ObfuscatedName("cf.ay")
    public int[][] field1702;

    @ObfuscatedName("cf.ak")
    public int[][] field1703;

    @ObfuscatedName("cf.an")
    public class84[] field1685;

    @ObfuscatedName("cf.af")
    public class96[] field1695;

    @ObfuscatedName("cf.ao")
    public class96[] field1706;

    @ObfuscatedName("cf.as")
    public short field1715;

    @ObfuscatedName("cf.am")
    public short field1714;

    @ObfuscatedName("cf.ae")
    public boolean field1709 = false;

    @ObfuscatedName("cf.ax")
    public int field1710;

    @ObfuscatedName("cf.aj")
    public int field1711;

    @ObfuscatedName("cf.ab")
    public int field1712;

    @ObfuscatedName("cf.av")
    public int field1713;

    @ObfuscatedName("cf.aq")
    public int field1707;

    @ObfuscatedName("cf.ac")
    public static int[] field1705 = new int[10000];

    @ObfuscatedName("cf.ar")
    public static int[] field1716 = new int[10000];

    @ObfuscatedName("cf.az")
    public static int field1717 = 0;

    @ObfuscatedName("cf.ad")
    public static int[] field1681 = class91.field1570;

    @ObfuscatedName("cf.au")
    public static int[] field1719 = class91.field1571;

    public class100() {
    }

    @ObfuscatedName("cf.o(Lfq;II)Lcf;")
    public static class100 method2040(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3057(arg1, arg2);
        return var3 == null ? null : new class100(var3);
    }

    public class100(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2039(arg0);
        } else {
            this.method2041(arg0);
        }
    }

    @ObfuscatedName("cf.e([B)V")
    public void method2039(byte[] arg0) {
        class119 var2 = new class119(arg0);
        class119 var3 = new class119(arg0);
        class119 var4 = new class119(arg0);
        class119 var5 = new class119(arg0);
        class119 var6 = new class119(arg0);
        class119 var7 = new class119(arg0);
        class119 var8 = new class119(arg0);
        var2.field1974 = arg0.length - 23;
        int var9 = var2.method2339();
        int var10 = var2.method2339();
        int var11 = var2.method2427();
        int var12 = var2.method2427();
        int var13 = var2.method2427();
        int var14 = var2.method2427();
        int var15 = var2.method2427();
        int var16 = var2.method2427();
        int var17 = var2.method2427();
        int var18 = var2.method2339();
        int var19 = var2.method2339();
        int var20 = var2.method2339();
        int var21 = var2.method2339();
        int var22 = var2.method2339();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1704 = new byte[var11];
            var2.field1974 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1704[var26] = var2.method2338();
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
        this.field1682 = var9;
        this.field1673 = var10;
        this.field1688 = var11;
        this.field1674 = new int[var9];
        this.field1675 = new int[var9];
        this.field1676 = new int[var9];
        this.field1693 = new int[var10];
        this.field1679 = new int[var10];
        this.field1680 = new int[var10];
        if (var17 == 1) {
            this.field1700 = new int[var9];
        }
        if (var12 == 1) {
            this.field1678 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1718 = new byte[var10];
        } else {
            this.field1687 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1683 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1701 = new int[var10];
        }
        if (var16 == 1) {
            this.field1686 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1689 = new byte[var10];
        }
        this.field1677 = new short[var10];
        if (var11 > 0) {
            this.field1690 = new short[var11];
            this.field1691 = new short[var11];
            this.field1692 = new short[var11];
            if (var24 > 0) {
                this.field1699 = new short[var24];
                this.field1684 = new short[var24];
                this.field1694 = new short[var24];
                this.field1696 = new short[var24];
                this.field1708 = new byte[var24];
                this.field1697 = new short[var24];
            }
            if (var25 > 0) {
                this.field1698 = new short[var25];
            }
        }
        var2.field1974 = var11;
        var3.field1974 = var44;
        var4.field1974 = var46;
        var5.field1974 = var48;
        var6.field1974 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2427();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2349();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2349();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2349();
            }
            this.field1674[var67] = var64 + var69;
            this.field1675[var67] = var65 + var70;
            this.field1676[var67] = var66 + var71;
            var64 = this.field1674[var67];
            var65 = this.field1675[var67];
            var66 = this.field1676[var67];
            if (var17 == 1) {
                this.field1700[var67] = var6.method2427();
            }
        }
        var2.field1974 = var42;
        var3.field1974 = var31;
        var4.field1974 = var34;
        var5.field1974 = var37;
        var6.field1974 = var35;
        var7.field1974 = var40;
        var8.field1974 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1677[var72] = (short) var2.method2339();
            if (var12 == 1) {
                this.field1678[var72] = var3.method2338();
            }
            if (var13 == 255) {
                this.field1718[var72] = var4.method2338();
            }
            if (var14 == 1) {
                this.field1683[var72] = var5.method2338();
            }
            if (var15 == 1) {
                this.field1701[var72] = var6.method2427();
            }
            if (var16 == 1) {
                this.field1686[var72] = (short) (var7.method2339() - 1);
            }
            if (this.field1689 != null && this.field1686[var72] != -1) {
                this.field1689[var72] = (byte) (var8.method2427() - 1);
            }
        }
        var2.field1974 = var33;
        var3.field1974 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2427();
            if (var78 == 1) {
                var73 = var2.method2349() + var76;
                var74 = var2.method2349() + var73;
                var75 = var2.method2349() + var74;
                var76 = var75;
                this.field1693[var77] = var73;
                this.field1679[var77] = var74;
                this.field1680[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2349() + var76;
                var76 = var75;
                this.field1693[var77] = var73;
                this.field1679[var77] = var74;
                this.field1680[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2349() + var76;
                var76 = var75;
                this.field1693[var77] = var73;
                this.field1679[var77] = var74;
                this.field1680[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2349() + var76;
                var76 = var75;
                this.field1693[var77] = var73;
                this.field1679[var77] = var81;
                this.field1680[var77] = var75;
            }
        }
        var2.field1974 = var50;
        var3.field1974 = var52;
        var4.field1974 = var54;
        var5.field1974 = var56;
        var6.field1974 = var58;
        var7.field1974 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1704[var82] & 0xFF;
            if (var83 == 0) {
                this.field1690[var82] = (short) var2.method2339();
                this.field1691[var82] = (short) var2.method2339();
                this.field1692[var82] = (short) var2.method2339();
            }
            if (var83 == 1) {
                this.field1690[var82] = (short) var3.method2339();
                this.field1691[var82] = (short) var3.method2339();
                this.field1692[var82] = (short) var3.method2339();
                this.field1699[var82] = (short) var4.method2339();
                this.field1684[var82] = (short) var4.method2339();
                this.field1694[var82] = (short) var4.method2339();
                this.field1696[var82] = (short) var5.method2339();
                this.field1708[var82] = var6.method2338();
                this.field1697[var82] = (short) var7.method2339();
            }
            if (var83 == 2) {
                this.field1690[var82] = (short) var3.method2339();
                this.field1691[var82] = (short) var3.method2339();
                this.field1692[var82] = (short) var3.method2339();
                this.field1699[var82] = (short) var4.method2339();
                this.field1684[var82] = (short) var4.method2339();
                this.field1694[var82] = (short) var4.method2339();
                this.field1696[var82] = (short) var5.method2339();
                this.field1708[var82] = var6.method2338();
                this.field1697[var82] = (short) var7.method2339();
                this.field1698[var82] = (short) var7.method2339();
            }
            if (var83 == 3) {
                this.field1690[var82] = (short) var3.method2339();
                this.field1691[var82] = (short) var3.method2339();
                this.field1692[var82] = (short) var3.method2339();
                this.field1699[var82] = (short) var4.method2339();
                this.field1684[var82] = (short) var4.method2339();
                this.field1694[var82] = (short) var4.method2339();
                this.field1696[var82] = (short) var5.method2339();
                this.field1708[var82] = var6.method2338();
                this.field1697[var82] = (short) var7.method2339();
            }
        }
        var2.field1974 = var62;
        int var84 = var2.method2427();
        if (var84 == 0) {
            return;
        }
        new class90();
        var2.method2339();
        var2.method2339();
        var2.method2339();
        var2.method2342();
    }

    @ObfuscatedName("cf.b([B)V")
    public void method2041(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class119 var4 = new class119(arg0);
        class119 var5 = new class119(arg0);
        class119 var6 = new class119(arg0);
        class119 var7 = new class119(arg0);
        class119 var8 = new class119(arg0);
        var4.field1974 = arg0.length - 18;
        int var9 = var4.method2339();
        int var10 = var4.method2339();
        int var11 = var4.method2427();
        int var12 = var4.method2427();
        int var13 = var4.method2427();
        int var14 = var4.method2427();
        int var15 = var4.method2427();
        int var16 = var4.method2427();
        int var17 = var4.method2339();
        int var18 = var4.method2339();
        int var19 = var4.method2339();
        int var20 = var4.method2339();
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
        this.field1682 = var9;
        this.field1673 = var10;
        this.field1688 = var11;
        this.field1674 = new int[var9];
        this.field1675 = new int[var9];
        this.field1676 = new int[var9];
        this.field1693 = new int[var10];
        this.field1679 = new int[var10];
        this.field1680 = new int[var10];
        if (var11 > 0) {
            this.field1704 = new byte[var11];
            this.field1690 = new short[var11];
            this.field1691 = new short[var11];
            this.field1692 = new short[var11];
        }
        if (var16 == 1) {
            this.field1700 = new int[var9];
        }
        if (var12 == 1) {
            this.field1678 = new byte[var10];
            this.field1689 = new byte[var10];
            this.field1686 = new short[var10];
        }
        if (var13 == 255) {
            this.field1718 = new byte[var10];
        } else {
            this.field1687 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1683 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1701 = new int[var10];
        }
        this.field1677 = new short[var10];
        var4.field1974 = var21;
        var5.field1974 = var36;
        var6.field1974 = var38;
        var7.field1974 = var40;
        var8.field1974 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2427();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2349();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2349();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2349();
            }
            this.field1674[var46] = var43 + var48;
            this.field1675[var46] = var44 + var49;
            this.field1676[var46] = var45 + var50;
            var43 = this.field1674[var46];
            var44 = this.field1675[var46];
            var45 = this.field1676[var46];
            if (var16 == 1) {
                this.field1700[var46] = var8.method2427();
            }
        }
        var4.field1974 = var32;
        var5.field1974 = var28;
        var6.field1974 = var26;
        var7.field1974 = var30;
        var8.field1974 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1677[var51] = (short) var4.method2339();
            if (var12 == 1) {
                int var52 = var5.method2427();
                if ((var52 & 0x1) == 1) {
                    this.field1678[var51] = 1;
                    var2 = true;
                } else {
                    this.field1678[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1689[var51] = (byte) (var52 >> 2);
                    this.field1686[var51] = this.field1677[var51];
                    this.field1677[var51] = 127;
                    if (this.field1686[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1689[var51] = -1;
                    this.field1686[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1718[var51] = var6.method2338();
            }
            if (var14 == 1) {
                this.field1683[var51] = var7.method2338();
            }
            if (var15 == 1) {
                this.field1701[var51] = var8.method2427();
            }
        }
        var4.field1974 = var25;
        var5.field1974 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2427();
            if (var58 == 1) {
                var53 = var4.method2349() + var56;
                var54 = var4.method2349() + var53;
                var55 = var4.method2349() + var54;
                var56 = var55;
                this.field1693[var57] = var53;
                this.field1679[var57] = var54;
                this.field1680[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2349() + var56;
                var56 = var55;
                this.field1693[var57] = var53;
                this.field1679[var57] = var54;
                this.field1680[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2349() + var56;
                var56 = var55;
                this.field1693[var57] = var53;
                this.field1679[var57] = var54;
                this.field1680[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2349() + var56;
                var56 = var55;
                this.field1693[var57] = var53;
                this.field1679[var57] = var61;
                this.field1680[var57] = var55;
            }
        }
        var4.field1974 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1704[var62] = 0;
            this.field1690[var62] = (short) var4.method2339();
            this.field1691[var62] = (short) var4.method2339();
            this.field1692[var62] = (short) var4.method2339();
        }
        if (this.field1689 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1689[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1690[var65] & 0xFFFF) == this.field1693[var64] && (this.field1691[var65] & 0xFFFF) == this.field1679[var64] && (this.field1692[var65] & 0xFFFF) == this.field1680[var64]) {
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
            this.field1686 = null;
        }
        if (!var2) {
            this.field1678 = null;
        }
    }

    public class100(class100[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1682 = 0;
        this.field1673 = 0;
        this.field1688 = 0;
        this.field1687 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class100 var10 = arg0[var9];
            if (var10 != null) {
                this.field1682 += var10.field1682;
                this.field1673 += var10.field1673;
                this.field1688 += var10.field1688;
                if (var10.field1718 == null) {
                    if (this.field1687 == -1) {
                        this.field1687 = var10.field1687;
                    }
                    if (this.field1687 != var10.field1687) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1678 != null;
                var5 |= var10.field1683 != null;
                var6 |= var10.field1701 != null;
                var7 |= var10.field1686 != null;
                var8 |= var10.field1689 != null;
            }
        }
        this.field1674 = new int[this.field1682];
        this.field1675 = new int[this.field1682];
        this.field1676 = new int[this.field1682];
        this.field1700 = new int[this.field1682];
        this.field1693 = new int[this.field1673];
        this.field1679 = new int[this.field1673];
        this.field1680 = new int[this.field1673];
        if (var3) {
            this.field1678 = new byte[this.field1673];
        }
        if (var4) {
            this.field1718 = new byte[this.field1673];
        }
        if (var5) {
            this.field1683 = new byte[this.field1673];
        }
        if (var6) {
            this.field1701 = new int[this.field1673];
        }
        if (var7) {
            this.field1686 = new short[this.field1673];
        }
        if (var8) {
            this.field1689 = new byte[this.field1673];
        }
        this.field1677 = new short[this.field1673];
        if (this.field1688 > 0) {
            this.field1704 = new byte[this.field1688];
            this.field1690 = new short[this.field1688];
            this.field1691 = new short[this.field1688];
            this.field1692 = new short[this.field1688];
            this.field1699 = new short[this.field1688];
            this.field1684 = new short[this.field1688];
            this.field1694 = new short[this.field1688];
            this.field1696 = new short[this.field1688];
            this.field1708 = new byte[this.field1688];
            this.field1697 = new short[this.field1688];
            this.field1698 = new short[this.field1688];
        }
        this.field1682 = 0;
        this.field1673 = 0;
        this.field1688 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class100 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1673; var13++) {
                    if (var3 && var12.field1678 != null) {
                        this.field1678[this.field1673] = var12.field1678[var13];
                    }
                    if (var4) {
                        if (var12.field1718 == null) {
                            this.field1718[this.field1673] = var12.field1687;
                        } else {
                            this.field1718[this.field1673] = var12.field1718[var13];
                        }
                    }
                    if (var5 && var12.field1683 != null) {
                        this.field1683[this.field1673] = var12.field1683[var13];
                    }
                    if (var6 && var12.field1701 != null) {
                        this.field1701[this.field1673] = var12.field1701[var13];
                    }
                    if (var7) {
                        if (var12.field1686 == null) {
                            this.field1686[this.field1673] = -1;
                        } else {
                            this.field1686[this.field1673] = var12.field1686[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1689 == null || var12.field1689[var13] == -1) {
                            this.field1689[this.field1673] = -1;
                        } else {
                            this.field1689[this.field1673] = (byte) (var12.field1689[var13] + this.field1688);
                        }
                    }
                    this.field1677[this.field1673] = var12.field1677[var13];
                    this.field1693[this.field1673] = this.method2043(var12, var12.field1693[var13]);
                    this.field1679[this.field1673] = this.method2043(var12, var12.field1679[var13]);
                    this.field1680[this.field1673] = this.method2043(var12, var12.field1680[var13]);
                    this.field1673++;
                }
                for (int var14 = 0; var14 < var12.field1688; var14++) {
                    byte var15 = this.field1704[this.field1688] = var12.field1704[var14];
                    if (var15 == 0) {
                        this.field1690[this.field1688] = (short) this.method2043(var12, var12.field1690[var14]);
                        this.field1691[this.field1688] = (short) this.method2043(var12, var12.field1691[var14]);
                        this.field1692[this.field1688] = (short) this.method2043(var12, var12.field1692[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1690[this.field1688] = var12.field1690[var14];
                        this.field1691[this.field1688] = var12.field1691[var14];
                        this.field1692[this.field1688] = var12.field1692[var14];
                        this.field1699[this.field1688] = var12.field1699[var14];
                        this.field1684[this.field1688] = var12.field1684[var14];
                        this.field1694[this.field1688] = var12.field1694[var14];
                        this.field1696[this.field1688] = var12.field1696[var14];
                        this.field1708[this.field1688] = var12.field1708[var14];
                        this.field1697[this.field1688] = var12.field1697[var14];
                    }
                    if (var15 == 2) {
                        this.field1698[this.field1688] = var12.field1698[var14];
                    }
                    this.field1688++;
                }
            }
        }
    }

    @ObfuscatedName("cf.p(Lcf;I)I")
    public final int method2043(class100 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1674[arg1];
        int var5 = arg0.field1675[arg1];
        int var6 = arg0.field1676[arg1];
        for (int var7 = 0; var7 < this.field1682; var7++) {
            if (this.field1674[var7] == var4 && this.field1675[var7] == var5 && this.field1676[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1674[this.field1682] = var4;
            this.field1675[this.field1682] = var5;
            this.field1676[this.field1682] = var6;
            if (arg0.field1700 != null) {
                this.field1700[this.field1682] = arg0.field1700[arg1];
            }
            var3 = this.field1682++;
        }
        return var3;
    }

    public class100(class100 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1682 = arg0.field1682;
        this.field1673 = arg0.field1673;
        this.field1688 = arg0.field1688;
        if (arg1) {
            this.field1674 = arg0.field1674;
            this.field1675 = arg0.field1675;
            this.field1676 = arg0.field1676;
        } else {
            this.field1674 = new int[this.field1682];
            this.field1675 = new int[this.field1682];
            this.field1676 = new int[this.field1682];
            for (int var6 = 0; var6 < this.field1682; var6++) {
                this.field1674[var6] = arg0.field1674[var6];
                this.field1675[var6] = arg0.field1675[var6];
                this.field1676[var6] = arg0.field1676[var6];
            }
        }
        if (arg2) {
            this.field1677 = arg0.field1677;
        } else {
            this.field1677 = new short[this.field1673];
            for (int var7 = 0; var7 < this.field1673; var7++) {
                this.field1677[var7] = arg0.field1677[var7];
            }
        }
        if (arg3 || arg0.field1686 == null) {
            this.field1686 = arg0.field1686;
        } else {
            this.field1686 = new short[this.field1673];
            for (int var8 = 0; var8 < this.field1673; var8++) {
                this.field1686[var8] = arg0.field1686[var8];
            }
        }
        if (arg4) {
            this.field1683 = arg0.field1683;
        } else {
            this.field1683 = new byte[this.field1673];
            if (arg0.field1683 == null) {
                for (int var9 = 0; var9 < this.field1673; var9++) {
                    this.field1683[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1673; var10++) {
                    this.field1683[var10] = arg0.field1683[var10];
                }
            }
        }
        this.field1693 = arg0.field1693;
        this.field1679 = arg0.field1679;
        this.field1680 = arg0.field1680;
        this.field1678 = arg0.field1678;
        this.field1718 = arg0.field1718;
        this.field1689 = arg0.field1689;
        this.field1687 = arg0.field1687;
        this.field1704 = arg0.field1704;
        this.field1690 = arg0.field1690;
        this.field1691 = arg0.field1691;
        this.field1692 = arg0.field1692;
        this.field1699 = arg0.field1699;
        this.field1684 = arg0.field1684;
        this.field1694 = arg0.field1694;
        this.field1696 = arg0.field1696;
        this.field1708 = arg0.field1708;
        this.field1697 = arg0.field1697;
        this.field1698 = arg0.field1698;
        this.field1700 = arg0.field1700;
        this.field1701 = arg0.field1701;
        this.field1702 = arg0.field1702;
        this.field1703 = arg0.field1703;
        this.field1695 = arg0.field1695;
        this.field1685 = arg0.field1685;
        this.field1706 = arg0.field1706;
        this.field1715 = arg0.field1715;
        this.field1714 = arg0.field1714;
    }

    @ObfuscatedName("cf.s()Lcf;")
    public class100 method2104() {
        class100 var1 = new class100();
        if (this.field1678 != null) {
            var1.field1678 = new byte[this.field1673];
            for (int var2 = 0; var2 < this.field1673; var2++) {
                var1.field1678[var2] = this.field1678[var2];
            }
        }
        var1.field1682 = this.field1682;
        var1.field1673 = this.field1673;
        var1.field1688 = this.field1688;
        var1.field1674 = this.field1674;
        var1.field1675 = this.field1675;
        var1.field1676 = this.field1676;
        var1.field1693 = this.field1693;
        var1.field1679 = this.field1679;
        var1.field1680 = this.field1680;
        var1.field1718 = this.field1718;
        var1.field1683 = this.field1683;
        var1.field1689 = this.field1689;
        var1.field1677 = this.field1677;
        var1.field1686 = this.field1686;
        var1.field1687 = this.field1687;
        var1.field1704 = this.field1704;
        var1.field1690 = this.field1690;
        var1.field1691 = this.field1691;
        var1.field1692 = this.field1692;
        var1.field1699 = this.field1699;
        var1.field1684 = this.field1684;
        var1.field1694 = this.field1694;
        var1.field1696 = this.field1696;
        var1.field1708 = this.field1708;
        var1.field1697 = this.field1697;
        var1.field1698 = this.field1698;
        var1.field1700 = this.field1700;
        var1.field1701 = this.field1701;
        var1.field1702 = this.field1702;
        var1.field1703 = this.field1703;
        var1.field1695 = this.field1695;
        var1.field1685 = this.field1685;
        var1.field1715 = this.field1715;
        var1.field1714 = this.field1714;
        return var1;
    }

    @ObfuscatedName("cf.y([[IIIIZI)Lcf;")
    public class100 method2078(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2063();
        int var7 = this.field1711 + arg1;
        int var8 = this.field1712 + arg1;
        int var9 = this.field1707 + arg3;
        int var10 = this.field1713 + arg3;
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
            var15.field1682 = this.field1682;
            var15.field1673 = this.field1673;
            var15.field1688 = this.field1688;
            var15.field1674 = this.field1674;
            var15.field1676 = this.field1676;
            var15.field1693 = this.field1693;
            var15.field1679 = this.field1679;
            var15.field1680 = this.field1680;
            var15.field1678 = this.field1678;
            var15.field1718 = this.field1718;
            var15.field1683 = this.field1683;
            var15.field1689 = this.field1689;
            var15.field1677 = this.field1677;
            var15.field1686 = this.field1686;
            var15.field1687 = this.field1687;
            var15.field1704 = this.field1704;
            var15.field1690 = this.field1690;
            var15.field1691 = this.field1691;
            var15.field1692 = this.field1692;
            var15.field1699 = this.field1699;
            var15.field1684 = this.field1684;
            var15.field1694 = this.field1694;
            var15.field1696 = this.field1696;
            var15.field1708 = this.field1708;
            var15.field1697 = this.field1697;
            var15.field1698 = this.field1698;
            var15.field1700 = this.field1700;
            var15.field1701 = this.field1701;
            var15.field1702 = this.field1702;
            var15.field1703 = this.field1703;
            var15.field1715 = this.field1715;
            var15.field1714 = this.field1714;
            var15.field1675 = new int[var15.field1682];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1682; var16++) {
                int var17 = this.field1674[var16] + arg1;
                int var18 = this.field1676[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1675[var16] = this.field1675[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1682; var26++) {
                int var27 = (-this.field1675[var26] << 16) / this.field1441;
                if (var27 < arg5) {
                    int var28 = this.field1674[var26] + arg1;
                    int var29 = this.field1676[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1675[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1675[var26];
                }
            }
        }
        var15.method2049();
        return var15;
    }

    @ObfuscatedName("cf.t()V")
    public void method2094() {
        int var10002;
        if (this.field1700 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1682; var3++) {
                int var4 = this.field1700[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1702 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1702[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1682) {
                int var7 = this.field1700[var6];
                this.field1702[var7][var1[var7]++] = var6++;
            }
            this.field1700 = null;
        }
        if (this.field1701 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1673; var10++) {
            int var11 = this.field1701[var10];
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
        while (var13 < this.field1673) {
            int var14 = this.field1701[var13];
            this.field1703[var14][var8[var14]++] = var13++;
        }
        this.field1701 = null;
    }

    @ObfuscatedName("cf.w()V")
    public void method2073() {
        for (int var1 = 0; var1 < this.field1682; var1++) {
            int var2 = this.field1674[var1];
            this.field1674[var1] = this.field1676[var1];
            this.field1676[var1] = -var2;
        }
        this.method2049();
    }

    @ObfuscatedName("cf.h()V")
    public void method2047() {
        for (int var1 = 0; var1 < this.field1682; var1++) {
            this.field1674[var1] = -this.field1674[var1];
            this.field1676[var1] = -this.field1676[var1];
        }
        this.method2049();
    }

    @ObfuscatedName("cf.d()V")
    public void method2048() {
        for (int var1 = 0; var1 < this.field1682; var1++) {
            int var2 = this.field1676[var1];
            this.field1676[var1] = this.field1674[var1];
            this.field1674[var1] = -var2;
        }
        this.method2049();
    }

    @ObfuscatedName("cf.l(I)V")
    public void method2099(int arg0) {
        int var2 = field1681[arg0];
        int var3 = field1719[arg0];
        for (int var4 = 0; var4 < this.field1682; var4++) {
            int var5 = this.field1676[var4] * var2 + this.field1674[var4] * var3 >> 16;
            this.field1676[var4] = this.field1676[var4] * var3 - this.field1674[var4] * var2 >> 16;
            this.field1674[var4] = var5;
        }
        this.method2049();
    }

    @ObfuscatedName("cf.n(III)V")
    public void method2061(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1682; var4++) {
            this.field1674[var4] += arg0;
            this.field1675[var4] += arg1;
            this.field1676[var4] += arg2;
        }
        this.method2049();
    }

    @ObfuscatedName("cf.q(SS)V")
    public void method2062(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1673; var3++) {
            if (this.field1677[var3] == arg0) {
                this.field1677[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cf.k(SS)V")
    public void method2052(short arg0, short arg1) {
        if (this.field1686 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1673; var3++) {
            if (this.field1686[var3] == arg0) {
                this.field1686[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cf.r()V")
    public void method2053() {
        for (int var1 = 0; var1 < this.field1682; var1++) {
            this.field1676[var1] = -this.field1676[var1];
        }
        for (int var2 = 0; var2 < this.field1673; var2++) {
            int var3 = this.field1693[var2];
            this.field1693[var2] = this.field1680[var2];
            this.field1680[var2] = var3;
        }
        this.method2049();
    }

    @ObfuscatedName("cf.i(III)V")
    public void method2042(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1682; var4++) {
            this.field1674[var4] = this.field1674[var4] * arg0 / 128;
            this.field1675[var4] = this.field1675[var4] * arg1 / 128;
            this.field1676[var4] = this.field1676[var4] * arg2 / 128;
        }
        this.method2049();
    }

    @ObfuscatedName("cf.j()V")
    public void method2055() {
        if (this.field1695 != null) {
            return;
        }
        this.field1695 = new class96[this.field1682];
        for (int var1 = 0; var1 < this.field1682; var1++) {
            this.field1695[var1] = new class96();
        }
        for (int var2 = 0; var2 < this.field1673; var2++) {
            int var3 = this.field1693[var2];
            int var4 = this.field1679[var2];
            int var5 = this.field1680[var2];
            int var6 = this.field1674[var4] - this.field1674[var3];
            int var7 = this.field1675[var4] - this.field1675[var3];
            int var8 = this.field1676[var4] - this.field1676[var3];
            int var9 = this.field1674[var5] - this.field1674[var3];
            int var10 = this.field1675[var5] - this.field1675[var3];
            int var11 = this.field1676[var5] - this.field1676[var3];
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
            if (this.field1678 == null) {
                var19 = 0;
            } else {
                var19 = this.field1678[var2];
            }
            if (var19 == 0) {
                class96 var20 = this.field1695[var3];
                var20.field1619 += var16;
                var20.field1611 += var17;
                var20.field1613 += var18;
                var20.field1614++;
                class96 var21 = this.field1695[var4];
                var21.field1619 += var16;
                var21.field1611 += var17;
                var21.field1613 += var18;
                var21.field1614++;
                class96 var22 = this.field1695[var5];
                var22.field1619 += var16;
                var22.field1611 += var17;
                var22.field1613 += var18;
                var22.field1614++;
            } else if (var19 == 1) {
                if (this.field1685 == null) {
                    this.field1685 = new class84[this.field1673];
                }
                class84 var23 = this.field1685[var2] = new class84();
                var23.field1436 = var16;
                var23.field1434 = var17;
                var23.field1435 = var18;
            }
        }
    }

    @ObfuscatedName("cf.z()V")
    public void method2049() {
        this.field1695 = null;
        this.field1706 = null;
        this.field1685 = null;
        this.field1709 = false;
    }

    @ObfuscatedName("cf.m()V")
    public void method2063() {
        if (this.field1709) {
            return;
        }
        this.field1441 = 0;
        this.field1710 = 0;
        this.field1711 = 999999;
        this.field1712 = -999999;
        this.field1713 = -99999;
        this.field1707 = 99999;
        for (int var1 = 0; var1 < this.field1682; var1++) {
            int var2 = this.field1674[var1];
            int var3 = this.field1675[var1];
            int var4 = this.field1676[var1];
            if (var2 < this.field1711) {
                this.field1711 = var2;
            }
            if (var2 > this.field1712) {
                this.field1712 = var2;
            }
            if (var4 < this.field1707) {
                this.field1707 = var4;
            }
            if (var4 > this.field1713) {
                this.field1713 = var4;
            }
            if (-var3 > this.field1441) {
                this.field1441 = -var3;
            }
            if (var3 > this.field1710) {
                this.field1710 = var3;
            }
        }
        this.field1709 = true;
    }

    @ObfuscatedName("cf.g(Lcf;Lcf;IIIZ)V")
    public static void method2109(class100 arg0, class100 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2063();
        arg0.method2055();
        arg1.method2063();
        arg1.method2055();
        field1717++;
        int var6 = 0;
        int[] var7 = arg1.field1674;
        int var8 = arg1.field1682;
        for (int var9 = 0; var9 < arg0.field1682; var9++) {
            class96 var10 = arg0.field1695[var9];
            if (var10.field1614 != 0) {
                int var11 = arg0.field1675[var9] - arg3;
                if (var11 <= arg1.field1710) {
                    int var12 = arg0.field1674[var9] - arg2;
                    if (var12 >= arg1.field1711 && var12 <= arg1.field1712) {
                        int var13 = arg0.field1676[var9] - arg4;
                        if (var13 >= arg1.field1707 && var13 <= arg1.field1713) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class96 var15 = arg1.field1695[var14];
                                if (var7[var14] == var12 && arg1.field1676[var14] == var13 && arg1.field1675[var14] == var11 && var15.field1614 != 0) {
                                    if (arg0.field1706 == null) {
                                        arg0.field1706 = new class96[arg0.field1682];
                                    }
                                    if (arg1.field1706 == null) {
                                        arg1.field1706 = new class96[var8];
                                    }
                                    class96 var16 = arg0.field1706[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1706[var9] = new class96(var10);
                                    }
                                    class96 var17 = arg1.field1706[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1706[var14] = new class96(var15);
                                    }
                                    var16.field1619 += var15.field1619;
                                    var16.field1611 += var15.field1611;
                                    var16.field1613 += var15.field1613;
                                    var16.field1614 += var15.field1614;
                                    var17.field1619 += var10.field1619;
                                    var17.field1611 += var10.field1611;
                                    var17.field1613 += var10.field1613;
                                    var17.field1614 += var10.field1614;
                                    var6++;
                                    field1705[var9] = field1717;
                                    field1716[var14] = field1717;
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
        for (int var18 = 0; var18 < arg0.field1673; var18++) {
            if (field1705[arg0.field1693[var18]] == field1717 && field1705[arg0.field1679[var18]] == field1717 && field1705[arg0.field1680[var18]] == field1717) {
                if (arg0.field1678 == null) {
                    arg0.field1678 = new byte[arg0.field1673];
                }
                arg0.field1678[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1673; var19++) {
            if (field1716[arg1.field1693[var19]] == field1717 && field1716[arg1.field1679[var19]] == field1717 && field1716[arg1.field1680[var19]] == field1717) {
                if (arg1.field1678 == null) {
                    arg1.field1678 = new byte[arg1.field1673];
                }
                arg1.field1678[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cf.c(IIIII)Ldk;")
    public final class105 method2059(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2055();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class105 var8 = new class105();
        var8.field1791 = new int[this.field1673];
        var8.field1792 = new int[this.field1673];
        var8.field1793 = new int[this.field1673];
        if (this.field1688 > 0 && this.field1689 != null) {
            int[] var9 = new int[this.field1688];
            for (int var10 = 0; var10 < this.field1673; var10++) {
                if (this.field1689[var10] != -1) {
                    var9[this.field1689[var10] & 0xFF]++;
                }
            }
            var8.field1799 = 0;
            for (int var11 = 0; var11 < this.field1688; var11++) {
                if (var9[var11] > 0 && this.field1704[var11] == 0) {
                    var8.field1799++;
                }
            }
            var8.field1800 = new int[var8.field1799];
            var8.field1801 = new int[var8.field1799];
            var8.field1802 = new int[var8.field1799];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1688; var13++) {
                if (var9[var13] > 0 && this.field1704[var13] == 0) {
                    var8.field1800[var12] = this.field1690[var13] & 0xFFFF;
                    var8.field1801[var12] = this.field1691[var13] & 0xFFFF;
                    var8.field1802[var12] = this.field1692[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1796 = new byte[this.field1673];
            for (int var14 = 0; var14 < this.field1673; var14++) {
                if (this.field1689[var14] == -1) {
                    var8.field1796[var14] = -1;
                } else {
                    var8.field1796[var14] = (byte) var9[this.field1689[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1673; var15++) {
            byte var16;
            if (this.field1678 == null) {
                var16 = 0;
            } else {
                var16 = this.field1678[var15];
            }
            byte var17;
            if (this.field1683 == null) {
                var17 = 0;
            } else {
                var17 = this.field1683[var15];
            }
            short var18;
            if (this.field1686 == null) {
                var18 = -1;
            } else {
                var18 = this.field1686[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1677[var15] & 0xFFFF;
                    class96 var20;
                    if (this.field1706 == null || this.field1706[this.field1693[var15]] == null) {
                        var20 = this.field1695[this.field1693[var15]];
                    } else {
                        var20 = this.field1706[this.field1693[var15]];
                    }
                    int var21 = (var20.field1613 * arg4 + var20.field1619 * arg2 + var20.field1611 * arg3) / (var20.field1614 * var7) + arg0;
                    var8.field1791[var15] = method2060(var19, var21);
                    class96 var22;
                    if (this.field1706 == null || this.field1706[this.field1679[var15]] == null) {
                        var22 = this.field1695[this.field1679[var15]];
                    } else {
                        var22 = this.field1706[this.field1679[var15]];
                    }
                    int var23 = (var22.field1613 * arg4 + var22.field1619 * arg2 + var22.field1611 * arg3) / (var22.field1614 * var7) + arg0;
                    var8.field1792[var15] = method2060(var19, var23);
                    class96 var24;
                    if (this.field1706 == null || this.field1706[this.field1680[var15]] == null) {
                        var24 = this.field1695[this.field1680[var15]];
                    } else {
                        var24 = this.field1706[this.field1680[var15]];
                    }
                    int var25 = (var24.field1613 * arg4 + var24.field1619 * arg2 + var24.field1611 * arg3) / (var24.field1614 * var7) + arg0;
                    var8.field1793[var15] = method2060(var19, var25);
                } else if (var16 == 1) {
                    class84 var26 = this.field1685[var15];
                    int var27 = (var26.field1435 * arg4 + var26.field1436 * arg2 + var26.field1434 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1791[var15] = method2060(this.field1677[var15] & 0xFFFF, var27);
                    var8.field1793[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1791[var15] = 128;
                    var8.field1793[var15] = -1;
                } else {
                    var8.field1793[var15] = -2;
                }
            } else if (var16 == 0) {
                class96 var28;
                if (this.field1706 == null || this.field1706[this.field1693[var15]] == null) {
                    var28 = this.field1695[this.field1693[var15]];
                } else {
                    var28 = this.field1706[this.field1693[var15]];
                }
                int var29 = (var28.field1613 * arg4 + var28.field1619 * arg2 + var28.field1611 * arg3) / (var28.field1614 * var7) + arg0;
                var8.field1791[var15] = method2054(var29);
                class96 var30;
                if (this.field1706 == null || this.field1706[this.field1679[var15]] == null) {
                    var30 = this.field1695[this.field1679[var15]];
                } else {
                    var30 = this.field1706[this.field1679[var15]];
                }
                int var31 = (var30.field1613 * arg4 + var30.field1619 * arg2 + var30.field1611 * arg3) / (var30.field1614 * var7) + arg0;
                var8.field1792[var15] = method2054(var31);
                class96 var32;
                if (this.field1706 == null || this.field1706[this.field1680[var15]] == null) {
                    var32 = this.field1695[this.field1680[var15]];
                } else {
                    var32 = this.field1706[this.field1680[var15]];
                }
                int var33 = (var32.field1613 * arg4 + var32.field1619 * arg2 + var32.field1611 * arg3) / (var32.field1614 * var7) + arg0;
                var8.field1793[var15] = method2054(var33);
            } else if (var16 == 1) {
                class84 var34 = this.field1685[var15];
                int var35 = (var34.field1435 * arg4 + var34.field1436 * arg2 + var34.field1434 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1791[var15] = method2054(var35);
                var8.field1793[var15] = -1;
            } else {
                var8.field1793[var15] = -2;
            }
        }
        this.method2094();
        var8.field1841 = this.field1682;
        var8.field1784 = this.field1674;
        var8.field1785 = this.field1675;
        var8.field1786 = this.field1676;
        var8.field1821 = this.field1673;
        var8.field1788 = this.field1693;
        var8.field1789 = this.field1679;
        var8.field1790 = this.field1680;
        var8.field1794 = this.field1718;
        var8.field1820 = this.field1683;
        var8.field1798 = this.field1687;
        var8.field1803 = this.field1702;
        var8.field1804 = this.field1703;
        var8.field1797 = this.field1686;
        return var8;
    }

    @ObfuscatedName("cf.x(II)I")
    public static final int method2060(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cf.ah(I)I")
    public static final int method2054(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
