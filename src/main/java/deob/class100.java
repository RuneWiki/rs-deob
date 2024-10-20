package deob;

@ObfuscatedName("cm")
public class class100 extends class93 {

    @ObfuscatedName("cm.g")
    public int field1663 = 0;

    @ObfuscatedName("cm.e")
    public int[] field1657;

    @ObfuscatedName("cm.n")
    public int[] field1678;

    @ObfuscatedName("cm.j")
    public int[] field1658;

    @ObfuscatedName("cm.i")
    public int field1659 = 0;

    @ObfuscatedName("cm.o")
    public int[] field1660;

    @ObfuscatedName("cm.l")
    public int[] field1661;

    @ObfuscatedName("cm.p")
    public int[] field1671;

    @ObfuscatedName("cm.t")
    public byte[] field1669;

    @ObfuscatedName("cm.w")
    public byte[] field1664;

    @ObfuscatedName("cm.r")
    public byte[] field1665;

    @ObfuscatedName("cm.a")
    public byte[] field1666;

    @ObfuscatedName("cm.q")
    public short[] field1667;

    @ObfuscatedName("cm.z")
    public short[] field1668;

    @ObfuscatedName("cm.d")
    public byte field1681 = 0;

    @ObfuscatedName("cm.x")
    public int field1673;

    @ObfuscatedName("cm.s")
    public byte[] field1655;

    @ObfuscatedName("cm.m")
    public short[] field1672;

    @ObfuscatedName("cm.y")
    public short[] field1676;

    @ObfuscatedName("cm.b")
    public short[] field1674;

    @ObfuscatedName("cm.h")
    public short[] field1675;

    @ObfuscatedName("cm.f")
    public short[] field1679;

    @ObfuscatedName("cm.v")
    public short[] field1677;

    @ObfuscatedName("cm.u")
    public short[] field1695;

    @ObfuscatedName("cm.k")
    public short[] field1684;

    @ObfuscatedName("cm.c")
    public short[] field1680;

    @ObfuscatedName("cm.al")
    public byte[] field1699;

    @ObfuscatedName("cm.ai")
    public int[] field1682;

    @ObfuscatedName("cm.ad")
    public int[] field1683;

    @ObfuscatedName("cm.aw")
    public int[][] field1670;

    @ObfuscatedName("cm.af")
    public int[][] field1685;

    @ObfuscatedName("cm.an")
    public class91[] field1686;

    @ObfuscatedName("cm.ao")
    public class90[] field1687;

    @ObfuscatedName("cm.ak")
    public class90[] field1688;

    @ObfuscatedName("cm.ah")
    public short field1689;

    @ObfuscatedName("cm.aq")
    public short field1690;

    @ObfuscatedName("cm.ax")
    public boolean field1691 = false;

    @ObfuscatedName("cm.ag")
    public int field1692;

    @ObfuscatedName("cm.am")
    public int field1693;

    @ObfuscatedName("cm.at")
    public int field1656;

    @ObfuscatedName("cm.ae")
    public int field1662;

    @ObfuscatedName("cm.ay")
    public int field1696;

    @ObfuscatedName("cm.as")
    public static int[] field1697 = new int[10000];

    @ObfuscatedName("cm.ar")
    public static int[] field1698 = new int[10000];

    @ObfuscatedName("cm.aj")
    public static int field1694 = 0;

    @ObfuscatedName("cm.av")
    public static int[] field1700 = class103.field1756;

    @ObfuscatedName("cm.az")
    public static int[] field1701 = class103.field1757;

    public class100() {
    }

    @ObfuscatedName("cm.g(Lez;II)Lcm;")
    public static class100 method2068(class150 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3012(arg1, arg2);
        return var3 == null ? null : new class100(var3);
    }

    public class100(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2070(arg0);
        } else {
            this.method2071(arg0);
        }
    }

    @ObfuscatedName("cm.n([B)V")
    public void method2070(byte[] arg0) {
        class126 var2 = new class126(arg0);
        class126 var3 = new class126(arg0);
        class126 var4 = new class126(arg0);
        class126 var5 = new class126(arg0);
        class126 var6 = new class126(arg0);
        class126 var7 = new class126(arg0);
        class126 var8 = new class126(arg0);
        var2.field2016 = arg0.length - 23;
        int var9 = var2.method2487();
        int var10 = var2.method2487();
        int var11 = var2.method2485();
        int var12 = var2.method2485();
        int var13 = var2.method2485();
        int var14 = var2.method2485();
        int var15 = var2.method2485();
        int var16 = var2.method2485();
        int var17 = var2.method2485();
        int var18 = var2.method2487();
        int var19 = var2.method2487();
        int var20 = var2.method2487();
        int var21 = var2.method2487();
        int var22 = var2.method2487();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1655 = new byte[var11];
            var2.field2016 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1655[var26] = var2.method2479();
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
        this.field1663 = var9;
        this.field1659 = var10;
        this.field1673 = var11;
        this.field1657 = new int[var9];
        this.field1678 = new int[var9];
        this.field1658 = new int[var9];
        this.field1660 = new int[var10];
        this.field1661 = new int[var10];
        this.field1671 = new int[var10];
        if (var17 == 1) {
            this.field1682 = new int[var9];
        }
        if (var12 == 1) {
            this.field1669 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1664 = new byte[var10];
        } else {
            this.field1681 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1665 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1683 = new int[var10];
        }
        if (var16 == 1) {
            this.field1668 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1666 = new byte[var10];
        }
        this.field1667 = new short[var10];
        if (var11 > 0) {
            this.field1672 = new short[var11];
            this.field1676 = new short[var11];
            this.field1674 = new short[var11];
            if (var24 > 0) {
                this.field1675 = new short[var24];
                this.field1679 = new short[var24];
                this.field1677 = new short[var24];
                this.field1695 = new short[var24];
                this.field1699 = new byte[var24];
                this.field1684 = new short[var24];
            }
            if (var25 > 0) {
                this.field1680 = new short[var25];
            }
        }
        var2.field2016 = var11;
        var3.field2016 = var44;
        var4.field2016 = var46;
        var5.field2016 = var48;
        var6.field2016 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2485();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2497();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2497();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2497();
            }
            this.field1657[var67] = var64 + var69;
            this.field1678[var67] = var65 + var70;
            this.field1658[var67] = var66 + var71;
            var64 = this.field1657[var67];
            var65 = this.field1678[var67];
            var66 = this.field1658[var67];
            if (var17 == 1) {
                this.field1682[var67] = var6.method2485();
            }
        }
        var2.field2016 = var42;
        var3.field2016 = var31;
        var4.field2016 = var34;
        var5.field2016 = var37;
        var6.field2016 = var35;
        var7.field2016 = var40;
        var8.field2016 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1667[var72] = (short) var2.method2487();
            if (var12 == 1) {
                this.field1669[var72] = var3.method2479();
            }
            if (var13 == 255) {
                this.field1664[var72] = var4.method2479();
            }
            if (var14 == 1) {
                this.field1665[var72] = var5.method2479();
            }
            if (var15 == 1) {
                this.field1683[var72] = var6.method2485();
            }
            if (var16 == 1) {
                this.field1668[var72] = (short) (var7.method2487() - 1);
            }
            if (this.field1666 != null && this.field1668[var72] != -1) {
                this.field1666[var72] = (byte) (var8.method2485() - 1);
            }
        }
        var2.field2016 = var33;
        var3.field2016 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2485();
            if (var78 == 1) {
                var73 = var2.method2497() + var76;
                var74 = var2.method2497() + var73;
                var75 = var2.method2497() + var74;
                var76 = var75;
                this.field1660[var77] = var73;
                this.field1661[var77] = var74;
                this.field1671[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2497() + var76;
                var76 = var75;
                this.field1660[var77] = var73;
                this.field1661[var77] = var74;
                this.field1671[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2497() + var76;
                var76 = var75;
                this.field1660[var77] = var73;
                this.field1661[var77] = var74;
                this.field1671[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2497() + var76;
                var76 = var75;
                this.field1660[var77] = var73;
                this.field1661[var77] = var81;
                this.field1671[var77] = var75;
            }
        }
        var2.field2016 = var50;
        var3.field2016 = var52;
        var4.field2016 = var54;
        var5.field2016 = var56;
        var6.field2016 = var58;
        var7.field2016 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1655[var82] & 0xFF;
            if (var83 == 0) {
                this.field1672[var82] = (short) var2.method2487();
                this.field1676[var82] = (short) var2.method2487();
                this.field1674[var82] = (short) var2.method2487();
            }
            if (var83 == 1) {
                this.field1672[var82] = (short) var3.method2487();
                this.field1676[var82] = (short) var3.method2487();
                this.field1674[var82] = (short) var3.method2487();
                this.field1675[var82] = (short) var4.method2487();
                this.field1679[var82] = (short) var4.method2487();
                this.field1677[var82] = (short) var4.method2487();
                this.field1695[var82] = (short) var5.method2487();
                this.field1699[var82] = var6.method2479();
                this.field1684[var82] = (short) var7.method2487();
            }
            if (var83 == 2) {
                this.field1672[var82] = (short) var3.method2487();
                this.field1676[var82] = (short) var3.method2487();
                this.field1674[var82] = (short) var3.method2487();
                this.field1675[var82] = (short) var4.method2487();
                this.field1679[var82] = (short) var4.method2487();
                this.field1677[var82] = (short) var4.method2487();
                this.field1695[var82] = (short) var5.method2487();
                this.field1699[var82] = var6.method2479();
                this.field1684[var82] = (short) var7.method2487();
                this.field1680[var82] = (short) var7.method2487();
            }
            if (var83 == 3) {
                this.field1672[var82] = (short) var3.method2487();
                this.field1676[var82] = (short) var3.method2487();
                this.field1674[var82] = (short) var3.method2487();
                this.field1675[var82] = (short) var4.method2487();
                this.field1679[var82] = (short) var4.method2487();
                this.field1677[var82] = (short) var4.method2487();
                this.field1695[var82] = (short) var5.method2487();
                this.field1699[var82] = var6.method2479();
                this.field1684[var82] = (short) var7.method2487();
            }
        }
        var2.field2016 = var62;
        int var84 = var2.method2485();
        if (var84 == 0) {
            return;
        }
        new class102();
        var2.method2487();
        var2.method2487();
        var2.method2487();
        var2.method2593();
    }

    @ObfuscatedName("cm.j([B)V")
    public void method2071(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class126 var4 = new class126(arg0);
        class126 var5 = new class126(arg0);
        class126 var6 = new class126(arg0);
        class126 var7 = new class126(arg0);
        class126 var8 = new class126(arg0);
        var4.field2016 = arg0.length - 18;
        int var9 = var4.method2487();
        int var10 = var4.method2487();
        int var11 = var4.method2485();
        int var12 = var4.method2485();
        int var13 = var4.method2485();
        int var14 = var4.method2485();
        int var15 = var4.method2485();
        int var16 = var4.method2485();
        int var17 = var4.method2487();
        int var18 = var4.method2487();
        int var19 = var4.method2487();
        int var20 = var4.method2487();
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
        this.field1663 = var9;
        this.field1659 = var10;
        this.field1673 = var11;
        this.field1657 = new int[var9];
        this.field1678 = new int[var9];
        this.field1658 = new int[var9];
        this.field1660 = new int[var10];
        this.field1661 = new int[var10];
        this.field1671 = new int[var10];
        if (var11 > 0) {
            this.field1655 = new byte[var11];
            this.field1672 = new short[var11];
            this.field1676 = new short[var11];
            this.field1674 = new short[var11];
        }
        if (var16 == 1) {
            this.field1682 = new int[var9];
        }
        if (var12 == 1) {
            this.field1669 = new byte[var10];
            this.field1666 = new byte[var10];
            this.field1668 = new short[var10];
        }
        if (var13 == 255) {
            this.field1664 = new byte[var10];
        } else {
            this.field1681 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1665 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1683 = new int[var10];
        }
        this.field1667 = new short[var10];
        var4.field2016 = var21;
        var5.field2016 = var36;
        var6.field2016 = var38;
        var7.field2016 = var40;
        var8.field2016 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2485();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2497();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2497();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2497();
            }
            this.field1657[var46] = var43 + var48;
            this.field1678[var46] = var44 + var49;
            this.field1658[var46] = var45 + var50;
            var43 = this.field1657[var46];
            var44 = this.field1678[var46];
            var45 = this.field1658[var46];
            if (var16 == 1) {
                this.field1682[var46] = var8.method2485();
            }
        }
        var4.field2016 = var32;
        var5.field2016 = var28;
        var6.field2016 = var26;
        var7.field2016 = var30;
        var8.field2016 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1667[var51] = (short) var4.method2487();
            if (var12 == 1) {
                int var52 = var5.method2485();
                if ((var52 & 0x1) == 1) {
                    this.field1669[var51] = 1;
                    var2 = true;
                } else {
                    this.field1669[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1666[var51] = (byte) (var52 >> 2);
                    this.field1668[var51] = this.field1667[var51];
                    this.field1667[var51] = 127;
                    if (this.field1668[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1666[var51] = -1;
                    this.field1668[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1664[var51] = var6.method2479();
            }
            if (var14 == 1) {
                this.field1665[var51] = var7.method2479();
            }
            if (var15 == 1) {
                this.field1683[var51] = var8.method2485();
            }
        }
        var4.field2016 = var25;
        var5.field2016 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2485();
            if (var58 == 1) {
                var53 = var4.method2497() + var56;
                var54 = var4.method2497() + var53;
                var55 = var4.method2497() + var54;
                var56 = var55;
                this.field1660[var57] = var53;
                this.field1661[var57] = var54;
                this.field1671[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2497() + var56;
                var56 = var55;
                this.field1660[var57] = var53;
                this.field1661[var57] = var54;
                this.field1671[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2497() + var56;
                var56 = var55;
                this.field1660[var57] = var53;
                this.field1661[var57] = var54;
                this.field1671[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2497() + var56;
                var56 = var55;
                this.field1660[var57] = var53;
                this.field1661[var57] = var61;
                this.field1671[var57] = var55;
            }
        }
        var4.field2016 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1655[var62] = 0;
            this.field1672[var62] = (short) var4.method2487();
            this.field1676[var62] = (short) var4.method2487();
            this.field1674[var62] = (short) var4.method2487();
        }
        if (this.field1666 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1666[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1672[var65] & 0xFFFF) == this.field1660[var64] && (this.field1676[var65] & 0xFFFF) == this.field1661[var64] && (this.field1674[var65] & 0xFFFF) == this.field1671[var64]) {
                        this.field1666[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1666 = null;
            }
        }
        if (!var3) {
            this.field1668 = null;
        }
        if (!var2) {
            this.field1669 = null;
        }
    }

    public class100(class100[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1663 = 0;
        this.field1659 = 0;
        this.field1673 = 0;
        this.field1681 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class100 var10 = arg0[var9];
            if (var10 != null) {
                this.field1663 += var10.field1663;
                this.field1659 += var10.field1659;
                this.field1673 += var10.field1673;
                if (var10.field1664 == null) {
                    if (this.field1681 == -1) {
                        this.field1681 = var10.field1681;
                    }
                    if (this.field1681 != var10.field1681) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1669 != null;
                var5 |= var10.field1665 != null;
                var6 |= var10.field1683 != null;
                var7 |= var10.field1668 != null;
                var8 |= var10.field1666 != null;
            }
        }
        this.field1657 = new int[this.field1663];
        this.field1678 = new int[this.field1663];
        this.field1658 = new int[this.field1663];
        this.field1682 = new int[this.field1663];
        this.field1660 = new int[this.field1659];
        this.field1661 = new int[this.field1659];
        this.field1671 = new int[this.field1659];
        if (var3) {
            this.field1669 = new byte[this.field1659];
        }
        if (var4) {
            this.field1664 = new byte[this.field1659];
        }
        if (var5) {
            this.field1665 = new byte[this.field1659];
        }
        if (var6) {
            this.field1683 = new int[this.field1659];
        }
        if (var7) {
            this.field1668 = new short[this.field1659];
        }
        if (var8) {
            this.field1666 = new byte[this.field1659];
        }
        this.field1667 = new short[this.field1659];
        if (this.field1673 > 0) {
            this.field1655 = new byte[this.field1673];
            this.field1672 = new short[this.field1673];
            this.field1676 = new short[this.field1673];
            this.field1674 = new short[this.field1673];
            this.field1675 = new short[this.field1673];
            this.field1679 = new short[this.field1673];
            this.field1677 = new short[this.field1673];
            this.field1695 = new short[this.field1673];
            this.field1699 = new byte[this.field1673];
            this.field1684 = new short[this.field1673];
            this.field1680 = new short[this.field1673];
        }
        this.field1663 = 0;
        this.field1659 = 0;
        this.field1673 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class100 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1659; var13++) {
                    if (var3 && var12.field1669 != null) {
                        this.field1669[this.field1659] = var12.field1669[var13];
                    }
                    if (var4) {
                        if (var12.field1664 == null) {
                            this.field1664[this.field1659] = var12.field1681;
                        } else {
                            this.field1664[this.field1659] = var12.field1664[var13];
                        }
                    }
                    if (var5 && var12.field1665 != null) {
                        this.field1665[this.field1659] = var12.field1665[var13];
                    }
                    if (var6 && var12.field1683 != null) {
                        this.field1683[this.field1659] = var12.field1683[var13];
                    }
                    if (var7) {
                        if (var12.field1668 == null) {
                            this.field1668[this.field1659] = -1;
                        } else {
                            this.field1668[this.field1659] = var12.field1668[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1666 == null || var12.field1666[var13] == -1) {
                            this.field1666[this.field1659] = -1;
                        } else {
                            this.field1666[this.field1659] = (byte) (var12.field1666[var13] + this.field1673);
                        }
                    }
                    this.field1667[this.field1659] = var12.field1667[var13];
                    this.field1660[this.field1659] = this.method2156(var12, var12.field1660[var13]);
                    this.field1661[this.field1659] = this.method2156(var12, var12.field1661[var13]);
                    this.field1671[this.field1659] = this.method2156(var12, var12.field1671[var13]);
                    this.field1659++;
                }
                for (int var14 = 0; var14 < var12.field1673; var14++) {
                    byte var15 = this.field1655[this.field1673] = var12.field1655[var14];
                    if (var15 == 0) {
                        this.field1672[this.field1673] = (short) this.method2156(var12, var12.field1672[var14]);
                        this.field1676[this.field1673] = (short) this.method2156(var12, var12.field1676[var14]);
                        this.field1674[this.field1673] = (short) this.method2156(var12, var12.field1674[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1672[this.field1673] = var12.field1672[var14];
                        this.field1676[this.field1673] = var12.field1676[var14];
                        this.field1674[this.field1673] = var12.field1674[var14];
                        this.field1675[this.field1673] = var12.field1675[var14];
                        this.field1679[this.field1673] = var12.field1679[var14];
                        this.field1677[this.field1673] = var12.field1677[var14];
                        this.field1695[this.field1673] = var12.field1695[var14];
                        this.field1699[this.field1673] = var12.field1699[var14];
                        this.field1684[this.field1673] = var12.field1684[var14];
                    }
                    if (var15 == 2) {
                        this.field1680[this.field1673] = var12.field1680[var14];
                    }
                    this.field1673++;
                }
            }
        }
    }

    @ObfuscatedName("cm.i(Lcm;I)I")
    public final int method2156(class100 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1657[arg1];
        int var5 = arg0.field1678[arg1];
        int var6 = arg0.field1658[arg1];
        for (int var7 = 0; var7 < this.field1663; var7++) {
            if (this.field1657[var7] == var4 && this.field1678[var7] == var5 && this.field1658[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1657[this.field1663] = var4;
            this.field1678[this.field1663] = var5;
            this.field1658[this.field1663] = var6;
            if (arg0.field1682 != null) {
                this.field1682[this.field1663] = arg0.field1682[arg1];
            }
            var3 = this.field1663++;
        }
        return var3;
    }

    public class100(class100 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1663 = arg0.field1663;
        this.field1659 = arg0.field1659;
        this.field1673 = arg0.field1673;
        if (arg1) {
            this.field1657 = arg0.field1657;
            this.field1678 = arg0.field1678;
            this.field1658 = arg0.field1658;
        } else {
            this.field1657 = new int[this.field1663];
            this.field1678 = new int[this.field1663];
            this.field1658 = new int[this.field1663];
            for (int var6 = 0; var6 < this.field1663; var6++) {
                this.field1657[var6] = arg0.field1657[var6];
                this.field1678[var6] = arg0.field1678[var6];
                this.field1658[var6] = arg0.field1658[var6];
            }
        }
        if (arg2) {
            this.field1667 = arg0.field1667;
        } else {
            this.field1667 = new short[this.field1659];
            for (int var7 = 0; var7 < this.field1659; var7++) {
                this.field1667[var7] = arg0.field1667[var7];
            }
        }
        if (arg3 || arg0.field1668 == null) {
            this.field1668 = arg0.field1668;
        } else {
            this.field1668 = new short[this.field1659];
            for (int var8 = 0; var8 < this.field1659; var8++) {
                this.field1668[var8] = arg0.field1668[var8];
            }
        }
        if (arg4) {
            this.field1665 = arg0.field1665;
        } else {
            this.field1665 = new byte[this.field1659];
            if (arg0.field1665 == null) {
                for (int var9 = 0; var9 < this.field1659; var9++) {
                    this.field1665[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1659; var10++) {
                    this.field1665[var10] = arg0.field1665[var10];
                }
            }
        }
        this.field1660 = arg0.field1660;
        this.field1661 = arg0.field1661;
        this.field1671 = arg0.field1671;
        this.field1669 = arg0.field1669;
        this.field1664 = arg0.field1664;
        this.field1666 = arg0.field1666;
        this.field1681 = arg0.field1681;
        this.field1655 = arg0.field1655;
        this.field1672 = arg0.field1672;
        this.field1676 = arg0.field1676;
        this.field1674 = arg0.field1674;
        this.field1675 = arg0.field1675;
        this.field1679 = arg0.field1679;
        this.field1677 = arg0.field1677;
        this.field1695 = arg0.field1695;
        this.field1699 = arg0.field1699;
        this.field1684 = arg0.field1684;
        this.field1680 = arg0.field1680;
        this.field1682 = arg0.field1682;
        this.field1683 = arg0.field1683;
        this.field1670 = arg0.field1670;
        this.field1685 = arg0.field1685;
        this.field1687 = arg0.field1687;
        this.field1686 = arg0.field1686;
        this.field1688 = arg0.field1688;
        this.field1689 = arg0.field1689;
        this.field1690 = arg0.field1690;
    }

    @ObfuscatedName("cm.l()Lcm;")
    public class100 method2074() {
        class100 var1 = new class100();
        if (this.field1669 != null) {
            var1.field1669 = new byte[this.field1659];
            for (int var2 = 0; var2 < this.field1659; var2++) {
                var1.field1669[var2] = this.field1669[var2];
            }
        }
        var1.field1663 = this.field1663;
        var1.field1659 = this.field1659;
        var1.field1673 = this.field1673;
        var1.field1657 = this.field1657;
        var1.field1678 = this.field1678;
        var1.field1658 = this.field1658;
        var1.field1660 = this.field1660;
        var1.field1661 = this.field1661;
        var1.field1671 = this.field1671;
        var1.field1664 = this.field1664;
        var1.field1665 = this.field1665;
        var1.field1666 = this.field1666;
        var1.field1667 = this.field1667;
        var1.field1668 = this.field1668;
        var1.field1681 = this.field1681;
        var1.field1655 = this.field1655;
        var1.field1672 = this.field1672;
        var1.field1676 = this.field1676;
        var1.field1674 = this.field1674;
        var1.field1675 = this.field1675;
        var1.field1679 = this.field1679;
        var1.field1677 = this.field1677;
        var1.field1695 = this.field1695;
        var1.field1699 = this.field1699;
        var1.field1684 = this.field1684;
        var1.field1680 = this.field1680;
        var1.field1682 = this.field1682;
        var1.field1683 = this.field1683;
        var1.field1670 = this.field1670;
        var1.field1685 = this.field1685;
        var1.field1687 = this.field1687;
        var1.field1686 = this.field1686;
        var1.field1689 = this.field1689;
        var1.field1690 = this.field1690;
        return var1;
    }

    @ObfuscatedName("cm.p([[IIIIZI)Lcm;")
    public class100 method2075(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2069();
        int var7 = this.field1693 + arg1;
        int var8 = this.field1656 + arg1;
        int var9 = this.field1696 + arg3;
        int var10 = this.field1662 + arg3;
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
            var15.field1663 = this.field1663;
            var15.field1659 = this.field1659;
            var15.field1673 = this.field1673;
            var15.field1657 = this.field1657;
            var15.field1658 = this.field1658;
            var15.field1660 = this.field1660;
            var15.field1661 = this.field1661;
            var15.field1671 = this.field1671;
            var15.field1669 = this.field1669;
            var15.field1664 = this.field1664;
            var15.field1665 = this.field1665;
            var15.field1666 = this.field1666;
            var15.field1667 = this.field1667;
            var15.field1668 = this.field1668;
            var15.field1681 = this.field1681;
            var15.field1655 = this.field1655;
            var15.field1672 = this.field1672;
            var15.field1676 = this.field1676;
            var15.field1674 = this.field1674;
            var15.field1675 = this.field1675;
            var15.field1679 = this.field1679;
            var15.field1677 = this.field1677;
            var15.field1695 = this.field1695;
            var15.field1699 = this.field1699;
            var15.field1684 = this.field1684;
            var15.field1680 = this.field1680;
            var15.field1682 = this.field1682;
            var15.field1683 = this.field1683;
            var15.field1670 = this.field1670;
            var15.field1685 = this.field1685;
            var15.field1689 = this.field1689;
            var15.field1690 = this.field1690;
            var15.field1678 = new int[var15.field1663];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1663; var16++) {
                int var17 = this.field1657[var16] + arg1;
                int var18 = this.field1658[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1678[var16] = this.field1678[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1663; var26++) {
                int var27 = (-this.field1678[var26] << 16) / this.field1534;
                if (var27 < arg5) {
                    int var28 = this.field1657[var26] + arg1;
                    int var29 = this.field1658[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1678[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1678[var26];
                }
            }
        }
        var15.method2087();
        return var15;
    }

    @ObfuscatedName("cm.t()V")
    public void method2124() {
        int var10002;
        if (this.field1682 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1663; var3++) {
                int var4 = this.field1682[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1670 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1670[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1663) {
                int var7 = this.field1682[var6];
                this.field1670[var7][var1[var7]++] = var6++;
            }
            this.field1682 = null;
        }
        if (this.field1683 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1659; var10++) {
            int var11 = this.field1683[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1685 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1685[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1659) {
            int var14 = this.field1683[var13];
            this.field1685[var14][var8[var14]++] = var13++;
        }
        this.field1683 = null;
    }

    @ObfuscatedName("cm.w()V")
    public void method2077() {
        for (int var1 = 0; var1 < this.field1663; var1++) {
            int var2 = this.field1657[var1];
            this.field1657[var1] = this.field1658[var1];
            this.field1658[var1] = -var2;
        }
        this.method2087();
    }

    @ObfuscatedName("cm.r()V")
    public void method2088() {
        for (int var1 = 0; var1 < this.field1663; var1++) {
            this.field1657[var1] = -this.field1657[var1];
            this.field1658[var1] = -this.field1658[var1];
        }
        this.method2087();
    }

    @ObfuscatedName("cm.a()V")
    public void method2121() {
        for (int var1 = 0; var1 < this.field1663; var1++) {
            int var2 = this.field1658[var1];
            this.field1658[var1] = this.field1657[var1];
            this.field1657[var1] = -var2;
        }
        this.method2087();
    }

    @ObfuscatedName("cm.q(I)V")
    public void method2080(int arg0) {
        int var2 = field1700[arg0];
        int var3 = field1701[arg0];
        for (int var4 = 0; var4 < this.field1663; var4++) {
            int var5 = this.field1658[var4] * var2 + this.field1657[var4] * var3 >> 16;
            this.field1658[var4] = this.field1658[var4] * var3 - this.field1657[var4] * var2 >> 16;
            this.field1657[var4] = var5;
        }
        this.method2087();
    }

    @ObfuscatedName("cm.z(III)V")
    public void method2081(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1663; var4++) {
            this.field1657[var4] += arg0;
            this.field1678[var4] += arg1;
            this.field1658[var4] += arg2;
        }
        this.method2087();
    }

    @ObfuscatedName("cm.d(SS)V")
    public void method2100(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1659; var3++) {
            if (this.field1667[var3] == arg0) {
                this.field1667[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cm.x(SS)V")
    public void method2083(short arg0, short arg1) {
        if (this.field1668 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1659; var3++) {
            if (this.field1668[var3] == arg0) {
                this.field1668[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cm.s()V")
    public void method2084() {
        for (int var1 = 0; var1 < this.field1663; var1++) {
            this.field1658[var1] = -this.field1658[var1];
        }
        for (int var2 = 0; var2 < this.field1659; var2++) {
            int var3 = this.field1660[var2];
            this.field1660[var2] = this.field1671[var2];
            this.field1671[var2] = var3;
        }
        this.method2087();
    }

    @ObfuscatedName("cm.m(III)V")
    public void method2085(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1663; var4++) {
            this.field1657[var4] = this.field1657[var4] * arg0 / 128;
            this.field1678[var4] = this.field1678[var4] * arg1 / 128;
            this.field1658[var4] = this.field1658[var4] * arg2 / 128;
        }
        this.method2087();
    }

    @ObfuscatedName("cm.y()V")
    public void method2086() {
        if (this.field1687 != null) {
            return;
        }
        this.field1687 = new class90[this.field1663];
        for (int var1 = 0; var1 < this.field1663; var1++) {
            this.field1687[var1] = new class90();
        }
        for (int var2 = 0; var2 < this.field1659; var2++) {
            int var3 = this.field1660[var2];
            int var4 = this.field1661[var2];
            int var5 = this.field1671[var2];
            int var6 = this.field1657[var4] - this.field1657[var3];
            int var7 = this.field1678[var4] - this.field1678[var3];
            int var8 = this.field1658[var4] - this.field1658[var3];
            int var9 = this.field1657[var5] - this.field1657[var3];
            int var10 = this.field1678[var5] - this.field1678[var3];
            int var11 = this.field1658[var5] - this.field1658[var3];
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
            if (this.field1669 == null) {
                var19 = 0;
            } else {
                var19 = this.field1669[var2];
            }
            if (var19 == 0) {
                class90 var20 = this.field1687[var3];
                var20.field1503 += var16;
                var20.field1501 += var17;
                var20.field1499 += var18;
                var20.field1497++;
                class90 var21 = this.field1687[var4];
                var21.field1503 += var16;
                var21.field1501 += var17;
                var21.field1499 += var18;
                var21.field1497++;
                class90 var22 = this.field1687[var5];
                var22.field1503 += var16;
                var22.field1501 += var17;
                var22.field1499 += var18;
                var22.field1497++;
            } else if (var19 == 1) {
                if (this.field1686 == null) {
                    this.field1686 = new class91[this.field1659];
                }
                class91 var23 = this.field1686[var2] = new class91();
                var23.field1505 = var16;
                var23.field1510 = var17;
                var23.field1506 = var18;
            }
        }
    }

    @ObfuscatedName("cm.b()V")
    public void method2087() {
        this.field1687 = null;
        this.field1688 = null;
        this.field1686 = null;
        this.field1691 = false;
    }

    @ObfuscatedName("cm.h()V")
    public void method2069() {
        if (this.field1691) {
            return;
        }
        this.field1534 = 0;
        this.field1692 = 0;
        this.field1693 = 999999;
        this.field1656 = -999999;
        this.field1662 = -99999;
        this.field1696 = 99999;
        for (int var1 = 0; var1 < this.field1663; var1++) {
            int var2 = this.field1657[var1];
            int var3 = this.field1678[var1];
            int var4 = this.field1658[var1];
            if (var2 < this.field1693) {
                this.field1693 = var2;
            }
            if (var2 > this.field1656) {
                this.field1656 = var2;
            }
            if (var4 < this.field1696) {
                this.field1696 = var4;
            }
            if (var4 > this.field1662) {
                this.field1662 = var4;
            }
            if (-var3 > this.field1534) {
                this.field1534 = -var3;
            }
            if (var3 > this.field1692) {
                this.field1692 = var3;
            }
        }
        this.field1691 = true;
    }

    @ObfuscatedName("cm.f(Lcm;Lcm;IIIZ)V")
    public static void method2089(class100 arg0, class100 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2069();
        arg0.method2086();
        arg1.method2069();
        arg1.method2086();
        field1694++;
        int var6 = 0;
        int[] var7 = arg1.field1657;
        int var8 = arg1.field1663;
        for (int var9 = 0; var9 < arg0.field1663; var9++) {
            class90 var10 = arg0.field1687[var9];
            if (var10.field1497 != 0) {
                int var11 = arg0.field1678[var9] - arg3;
                if (var11 <= arg1.field1692) {
                    int var12 = arg0.field1657[var9] - arg2;
                    if (var12 >= arg1.field1693 && var12 <= arg1.field1656) {
                        int var13 = arg0.field1658[var9] - arg4;
                        if (var13 >= arg1.field1696 && var13 <= arg1.field1662) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class90 var15 = arg1.field1687[var14];
                                if (var7[var14] == var12 && arg1.field1658[var14] == var13 && arg1.field1678[var14] == var11 && var15.field1497 != 0) {
                                    if (arg0.field1688 == null) {
                                        arg0.field1688 = new class90[arg0.field1663];
                                    }
                                    if (arg1.field1688 == null) {
                                        arg1.field1688 = new class90[var8];
                                    }
                                    class90 var16 = arg0.field1688[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1688[var9] = new class90(var10);
                                    }
                                    class90 var17 = arg1.field1688[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1688[var14] = new class90(var15);
                                    }
                                    var16.field1503 += var15.field1503;
                                    var16.field1501 += var15.field1501;
                                    var16.field1499 += var15.field1499;
                                    var16.field1497 += var15.field1497;
                                    var17.field1503 += var10.field1503;
                                    var17.field1501 += var10.field1501;
                                    var17.field1499 += var10.field1499;
                                    var17.field1497 += var10.field1497;
                                    var6++;
                                    field1697[var9] = field1694;
                                    field1698[var14] = field1694;
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
        for (int var18 = 0; var18 < arg0.field1659; var18++) {
            if (field1697[arg0.field1660[var18]] == field1694 && field1697[arg0.field1661[var18]] == field1694 && field1697[arg0.field1671[var18]] == field1694) {
                if (arg0.field1669 == null) {
                    arg0.field1669 = new byte[arg0.field1659];
                }
                arg0.field1669[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1659; var19++) {
            if (field1698[arg1.field1660[var19]] == field1694 && field1698[arg1.field1661[var19]] == field1694 && field1698[arg1.field1671[var19]] == field1694) {
                if (arg1.field1669 == null) {
                    arg1.field1669 = new byte[arg1.field1659];
                }
                arg1.field1669[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cm.v(IIIII)Ldk;")
    public final class111 method2067(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2086();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class111 var8 = new class111();
        var8.field1862 = new int[this.field1659];
        var8.field1886 = new int[this.field1659];
        var8.field1840 = new int[this.field1659];
        if (this.field1673 > 0 && this.field1666 != null) {
            int[] var9 = new int[this.field1673];
            for (int var10 = 0; var10 < this.field1659; var10++) {
                if (this.field1666[var10] != -1) {
                    var9[this.field1666[var10] & 0xFF]++;
                }
            }
            var8.field1861 = 0;
            for (int var11 = 0; var11 < this.field1673; var11++) {
                if (var9[var11] > 0 && this.field1655[var11] == 0) {
                    var8.field1861++;
                }
            }
            var8.field1847 = new int[var8.field1861];
            var8.field1848 = new int[var8.field1861];
            var8.field1845 = new int[var8.field1861];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1673; var13++) {
                if (var9[var13] > 0 && this.field1655[var13] == 0) {
                    var8.field1847[var12] = this.field1672[var13] & 0xFFFF;
                    var8.field1848[var12] = this.field1676[var13] & 0xFFFF;
                    var8.field1845[var12] = this.field1674[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1843 = new byte[this.field1659];
            for (int var14 = 0; var14 < this.field1659; var14++) {
                if (this.field1666[var14] == -1) {
                    var8.field1843[var14] = -1;
                } else {
                    var8.field1843[var14] = (byte) var9[this.field1666[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1659; var15++) {
            byte var16;
            if (this.field1669 == null) {
                var16 = 0;
            } else {
                var16 = this.field1669[var15];
            }
            byte var17;
            if (this.field1665 == null) {
                var17 = 0;
            } else {
                var17 = this.field1665[var15];
            }
            short var18;
            if (this.field1668 == null) {
                var18 = -1;
            } else {
                var18 = this.field1668[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1667[var15] & 0xFFFF;
                    class90 var20;
                    if (this.field1688 == null || this.field1688[this.field1660[var15]] == null) {
                        var20 = this.field1687[this.field1660[var15]];
                    } else {
                        var20 = this.field1688[this.field1660[var15]];
                    }
                    int var21 = (var20.field1499 * arg4 + var20.field1503 * arg2 + var20.field1501 * arg3) / (var20.field1497 * var7) + arg0;
                    var8.field1862[var15] = method2091(var19, var21);
                    class90 var22;
                    if (this.field1688 == null || this.field1688[this.field1661[var15]] == null) {
                        var22 = this.field1687[this.field1661[var15]];
                    } else {
                        var22 = this.field1688[this.field1661[var15]];
                    }
                    int var23 = (var22.field1499 * arg4 + var22.field1503 * arg2 + var22.field1501 * arg3) / (var22.field1497 * var7) + arg0;
                    var8.field1886[var15] = method2091(var19, var23);
                    class90 var24;
                    if (this.field1688 == null || this.field1688[this.field1671[var15]] == null) {
                        var24 = this.field1687[this.field1671[var15]];
                    } else {
                        var24 = this.field1688[this.field1671[var15]];
                    }
                    int var25 = (var24.field1499 * arg4 + var24.field1503 * arg2 + var24.field1501 * arg3) / (var24.field1497 * var7) + arg0;
                    var8.field1840[var15] = method2091(var19, var25);
                } else if (var16 == 1) {
                    class91 var26 = this.field1686[var15];
                    int var27 = (var26.field1506 * arg4 + var26.field1510 * arg3 + var26.field1505 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field1862[var15] = method2091(this.field1667[var15] & 0xFFFF, var27);
                    var8.field1840[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1862[var15] = 128;
                    var8.field1840[var15] = -1;
                } else {
                    var8.field1840[var15] = -2;
                }
            } else if (var16 == 0) {
                class90 var28;
                if (this.field1688 == null || this.field1688[this.field1660[var15]] == null) {
                    var28 = this.field1687[this.field1660[var15]];
                } else {
                    var28 = this.field1688[this.field1660[var15]];
                }
                int var29 = (var28.field1499 * arg4 + var28.field1503 * arg2 + var28.field1501 * arg3) / (var28.field1497 * var7) + arg0;
                var8.field1862[var15] = method2092(var29);
                class90 var30;
                if (this.field1688 == null || this.field1688[this.field1661[var15]] == null) {
                    var30 = this.field1687[this.field1661[var15]];
                } else {
                    var30 = this.field1688[this.field1661[var15]];
                }
                int var31 = (var30.field1499 * arg4 + var30.field1503 * arg2 + var30.field1501 * arg3) / (var30.field1497 * var7) + arg0;
                var8.field1886[var15] = method2092(var31);
                class90 var32;
                if (this.field1688 == null || this.field1688[this.field1671[var15]] == null) {
                    var32 = this.field1687[this.field1671[var15]];
                } else {
                    var32 = this.field1688[this.field1671[var15]];
                }
                int var33 = (var32.field1499 * arg4 + var32.field1503 * arg2 + var32.field1501 * arg3) / (var32.field1497 * var7) + arg0;
                var8.field1840[var15] = method2092(var33);
            } else if (var16 == 1) {
                class91 var34 = this.field1686[var15];
                int var35 = (var34.field1506 * arg4 + var34.field1510 * arg3 + var34.field1505 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field1862[var15] = method2092(var35);
                var8.field1840[var15] = -1;
            } else {
                var8.field1840[var15] = -2;
            }
        }
        this.method2124();
        var8.field1830 = this.field1663;
        var8.field1883 = this.field1657;
        var8.field1832 = this.field1678;
        var8.field1833 = this.field1658;
        var8.field1834 = this.field1659;
        var8.field1835 = this.field1660;
        var8.field1836 = this.field1661;
        var8.field1849 = this.field1671;
        var8.field1881 = this.field1664;
        var8.field1842 = this.field1665;
        var8.field1876 = this.field1681;
        var8.field1850 = this.field1670;
        var8.field1868 = this.field1685;
        var8.field1844 = this.field1668;
        return var8;
    }

    @ObfuscatedName("cm.u(II)I")
    public static final int method2091(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cm.k(I)I")
    public static final int method2092(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
