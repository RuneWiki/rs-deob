package deob;

@ObfuscatedName("cj")
public class class100 extends class93 {

    @ObfuscatedName("cj.u")
    public int field1684 = 0;

    @ObfuscatedName("cj.k")
    public int[] field1683;

    @ObfuscatedName("cj.x")
    public int[] field1659;

    @ObfuscatedName("cj.m")
    public int[] field1660;

    @ObfuscatedName("cj.n")
    public int field1661 = 0;

    @ObfuscatedName("cj.q")
    public int[] field1670;

    @ObfuscatedName("cj.a")
    public int[] field1663;

    @ObfuscatedName("cj.g")
    public int[] field1664;

    @ObfuscatedName("cj.j")
    public byte[] field1665;

    @ObfuscatedName("cj.l")
    public byte[] field1662;

    @ObfuscatedName("cj.w")
    public byte[] field1667;

    @ObfuscatedName("cj.z")
    public byte[] field1668;

    @ObfuscatedName("cj.e")
    public short[] field1669;

    @ObfuscatedName("cj.b")
    public short[] field1698;

    @ObfuscatedName("cj.c")
    public byte field1671 = 0;

    @ObfuscatedName("cj.d")
    public int field1672;

    @ObfuscatedName("cj.h")
    public byte[] field1701;

    @ObfuscatedName("cj.i")
    public short[] field1694;

    @ObfuscatedName("cj.v")
    public short[] field1675;

    @ObfuscatedName("cj.s")
    public short[] field1676;

    @ObfuscatedName("cj.f")
    public short[] field1677;

    @ObfuscatedName("cj.y")
    public short[] field1678;

    @ObfuscatedName("cj.t")
    public short[] field1679;

    @ObfuscatedName("cj.r")
    public short[] field1666;

    @ObfuscatedName("cj.p")
    public short[] field1697;

    @ObfuscatedName("cj.o")
    public short[] field1682;

    @ObfuscatedName("cj.ax")
    public byte[] field1680;

    @ObfuscatedName("cj.aa")
    public int[] field1681;

    @ObfuscatedName("cj.af")
    public int[] field1685;

    @ObfuscatedName("cj.al")
    public int[][] field1686;

    @ObfuscatedName("cj.av")
    public int[][] field1687;

    @ObfuscatedName("cj.ab")
    public class91[] field1688;

    @ObfuscatedName("cj.ad")
    public class90[] field1658;

    @ObfuscatedName("cj.ai")
    public class90[] field1690;

    @ObfuscatedName("cj.ak")
    public short field1691;

    @ObfuscatedName("cj.ao")
    public short field1692;

    @ObfuscatedName("cj.aq")
    public boolean field1693 = false;

    @ObfuscatedName("cj.aj")
    public int field1673;

    @ObfuscatedName("cj.ag")
    public int field1695;

    @ObfuscatedName("cj.ap")
    public int field1674;

    @ObfuscatedName("cj.an")
    public int field1696;

    @ObfuscatedName("cj.as")
    public int field1689;

    @ObfuscatedName("cj.au")
    public static int[] field1699 = new int[10000];

    @ObfuscatedName("cj.ay")
    public static int[] field1700 = new int[10000];

    @ObfuscatedName("cj.ah")
    public static int field1657 = 0;

    @ObfuscatedName("cj.aw")
    public static int[] field1702 = class103.field1761;

    @ObfuscatedName("cj.ac")
    public static int[] field1703 = class103.field1747;

    public class100() {
    }

    @ObfuscatedName("cj.u(Leb;II)Lcj;")
    public static class100 method2044(class151 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2965(arg1, arg2);
        return var3 == null ? null : new class100(var3);
    }

    public class100(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2070(arg0);
        } else {
            this.method2046(arg0);
        }
    }

    @ObfuscatedName("cj.x([B)V")
    public void method2070(byte[] arg0) {
        class126 var2 = new class126(arg0);
        class126 var3 = new class126(arg0);
        class126 var4 = new class126(arg0);
        class126 var5 = new class126(arg0);
        class126 var6 = new class126(arg0);
        class126 var7 = new class126(arg0);
        class126 var8 = new class126(arg0);
        var2.field2024 = arg0.length - 23;
        int var9 = var2.method2450();
        int var10 = var2.method2450();
        int var11 = var2.method2559();
        int var12 = var2.method2559();
        int var13 = var2.method2559();
        int var14 = var2.method2559();
        int var15 = var2.method2559();
        int var16 = var2.method2559();
        int var17 = var2.method2559();
        int var18 = var2.method2450();
        int var19 = var2.method2450();
        int var20 = var2.method2450();
        int var21 = var2.method2450();
        int var22 = var2.method2450();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1701 = new byte[var11];
            var2.field2024 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1701[var26] = var2.method2449();
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
        this.field1684 = var9;
        this.field1661 = var10;
        this.field1672 = var11;
        this.field1683 = new int[var9];
        this.field1659 = new int[var9];
        this.field1660 = new int[var9];
        this.field1670 = new int[var10];
        this.field1663 = new int[var10];
        this.field1664 = new int[var10];
        if (var17 == 1) {
            this.field1681 = new int[var9];
        }
        if (var12 == 1) {
            this.field1665 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1662 = new byte[var10];
        } else {
            this.field1671 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1667 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1685 = new int[var10];
        }
        if (var16 == 1) {
            this.field1698 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1668 = new byte[var10];
        }
        this.field1669 = new short[var10];
        if (var11 > 0) {
            this.field1694 = new short[var11];
            this.field1675 = new short[var11];
            this.field1676 = new short[var11];
            if (var24 > 0) {
                this.field1677 = new short[var24];
                this.field1678 = new short[var24];
                this.field1679 = new short[var24];
                this.field1666 = new short[var24];
                this.field1680 = new byte[var24];
                this.field1697 = new short[var24];
            }
            if (var25 > 0) {
                this.field1682 = new short[var25];
            }
        }
        var2.field2024 = var11;
        var3.field2024 = var44;
        var4.field2024 = var46;
        var5.field2024 = var48;
        var6.field2024 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2559();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2506();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2506();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2506();
            }
            this.field1683[var67] = var64 + var69;
            this.field1659[var67] = var65 + var70;
            this.field1660[var67] = var66 + var71;
            var64 = this.field1683[var67];
            var65 = this.field1659[var67];
            var66 = this.field1660[var67];
            if (var17 == 1) {
                this.field1681[var67] = var6.method2559();
            }
        }
        var2.field2024 = var42;
        var3.field2024 = var31;
        var4.field2024 = var34;
        var5.field2024 = var37;
        var6.field2024 = var35;
        var7.field2024 = var40;
        var8.field2024 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1669[var72] = (short) var2.method2450();
            if (var12 == 1) {
                this.field1665[var72] = var3.method2449();
            }
            if (var13 == 255) {
                this.field1662[var72] = var4.method2449();
            }
            if (var14 == 1) {
                this.field1667[var72] = var5.method2449();
            }
            if (var15 == 1) {
                this.field1685[var72] = var6.method2559();
            }
            if (var16 == 1) {
                this.field1698[var72] = (short) (var7.method2450() - 1);
            }
            if (this.field1668 != null && this.field1698[var72] != -1) {
                this.field1668[var72] = (byte) (var8.method2559() - 1);
            }
        }
        var2.field2024 = var33;
        var3.field2024 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2559();
            if (var78 == 1) {
                var73 = var2.method2506() + var76;
                var74 = var2.method2506() + var73;
                var75 = var2.method2506() + var74;
                var76 = var75;
                this.field1670[var77] = var73;
                this.field1663[var77] = var74;
                this.field1664[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2506() + var76;
                var76 = var75;
                this.field1670[var77] = var73;
                this.field1663[var77] = var74;
                this.field1664[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2506() + var76;
                var76 = var75;
                this.field1670[var77] = var73;
                this.field1663[var77] = var74;
                this.field1664[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2506() + var76;
                var76 = var75;
                this.field1670[var77] = var73;
                this.field1663[var77] = var81;
                this.field1664[var77] = var75;
            }
        }
        var2.field2024 = var50;
        var3.field2024 = var52;
        var4.field2024 = var54;
        var5.field2024 = var56;
        var6.field2024 = var58;
        var7.field2024 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1701[var82] & 0xFF;
            if (var83 == 0) {
                this.field1694[var82] = (short) var2.method2450();
                this.field1675[var82] = (short) var2.method2450();
                this.field1676[var82] = (short) var2.method2450();
            }
            if (var83 == 1) {
                this.field1694[var82] = (short) var3.method2450();
                this.field1675[var82] = (short) var3.method2450();
                this.field1676[var82] = (short) var3.method2450();
                this.field1677[var82] = (short) var4.method2450();
                this.field1678[var82] = (short) var4.method2450();
                this.field1679[var82] = (short) var4.method2450();
                this.field1666[var82] = (short) var5.method2450();
                this.field1680[var82] = var6.method2449();
                this.field1697[var82] = (short) var7.method2450();
            }
            if (var83 == 2) {
                this.field1694[var82] = (short) var3.method2450();
                this.field1675[var82] = (short) var3.method2450();
                this.field1676[var82] = (short) var3.method2450();
                this.field1677[var82] = (short) var4.method2450();
                this.field1678[var82] = (short) var4.method2450();
                this.field1679[var82] = (short) var4.method2450();
                this.field1666[var82] = (short) var5.method2450();
                this.field1680[var82] = var6.method2449();
                this.field1697[var82] = (short) var7.method2450();
                this.field1682[var82] = (short) var7.method2450();
            }
            if (var83 == 3) {
                this.field1694[var82] = (short) var3.method2450();
                this.field1675[var82] = (short) var3.method2450();
                this.field1676[var82] = (short) var3.method2450();
                this.field1677[var82] = (short) var4.method2450();
                this.field1678[var82] = (short) var4.method2450();
                this.field1679[var82] = (short) var4.method2450();
                this.field1666[var82] = (short) var5.method2450();
                this.field1680[var82] = var6.method2449();
                this.field1697[var82] = (short) var7.method2450();
            }
        }
        var2.field2024 = var62;
        int var84 = var2.method2559();
        if (var84 == 0) {
            return;
        }
        new class102();
        var2.method2450();
        var2.method2450();
        var2.method2450();
        var2.method2526();
    }

    @ObfuscatedName("cj.m([B)V")
    public void method2046(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class126 var4 = new class126(arg0);
        class126 var5 = new class126(arg0);
        class126 var6 = new class126(arg0);
        class126 var7 = new class126(arg0);
        class126 var8 = new class126(arg0);
        var4.field2024 = arg0.length - 18;
        int var9 = var4.method2450();
        int var10 = var4.method2450();
        int var11 = var4.method2559();
        int var12 = var4.method2559();
        int var13 = var4.method2559();
        int var14 = var4.method2559();
        int var15 = var4.method2559();
        int var16 = var4.method2559();
        int var17 = var4.method2450();
        int var18 = var4.method2450();
        int var19 = var4.method2450();
        int var20 = var4.method2450();
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
        this.field1684 = var9;
        this.field1661 = var10;
        this.field1672 = var11;
        this.field1683 = new int[var9];
        this.field1659 = new int[var9];
        this.field1660 = new int[var9];
        this.field1670 = new int[var10];
        this.field1663 = new int[var10];
        this.field1664 = new int[var10];
        if (var11 > 0) {
            this.field1701 = new byte[var11];
            this.field1694 = new short[var11];
            this.field1675 = new short[var11];
            this.field1676 = new short[var11];
        }
        if (var16 == 1) {
            this.field1681 = new int[var9];
        }
        if (var12 == 1) {
            this.field1665 = new byte[var10];
            this.field1668 = new byte[var10];
            this.field1698 = new short[var10];
        }
        if (var13 == 255) {
            this.field1662 = new byte[var10];
        } else {
            this.field1671 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1667 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1685 = new int[var10];
        }
        this.field1669 = new short[var10];
        var4.field2024 = var21;
        var5.field2024 = var36;
        var6.field2024 = var38;
        var7.field2024 = var40;
        var8.field2024 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2559();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2506();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2506();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2506();
            }
            this.field1683[var46] = var43 + var48;
            this.field1659[var46] = var44 + var49;
            this.field1660[var46] = var45 + var50;
            var43 = this.field1683[var46];
            var44 = this.field1659[var46];
            var45 = this.field1660[var46];
            if (var16 == 1) {
                this.field1681[var46] = var8.method2559();
            }
        }
        var4.field2024 = var32;
        var5.field2024 = var28;
        var6.field2024 = var26;
        var7.field2024 = var30;
        var8.field2024 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1669[var51] = (short) var4.method2450();
            if (var12 == 1) {
                int var52 = var5.method2559();
                if ((var52 & 0x1) == 1) {
                    this.field1665[var51] = 1;
                    var2 = true;
                } else {
                    this.field1665[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1668[var51] = (byte) (var52 >> 2);
                    this.field1698[var51] = this.field1669[var51];
                    this.field1669[var51] = 127;
                    if (this.field1698[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1668[var51] = -1;
                    this.field1698[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1662[var51] = var6.method2449();
            }
            if (var14 == 1) {
                this.field1667[var51] = var7.method2449();
            }
            if (var15 == 1) {
                this.field1685[var51] = var8.method2559();
            }
        }
        var4.field2024 = var25;
        var5.field2024 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2559();
            if (var58 == 1) {
                var53 = var4.method2506() + var56;
                var54 = var4.method2506() + var53;
                var55 = var4.method2506() + var54;
                var56 = var55;
                this.field1670[var57] = var53;
                this.field1663[var57] = var54;
                this.field1664[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2506() + var56;
                var56 = var55;
                this.field1670[var57] = var53;
                this.field1663[var57] = var54;
                this.field1664[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2506() + var56;
                var56 = var55;
                this.field1670[var57] = var53;
                this.field1663[var57] = var54;
                this.field1664[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2506() + var56;
                var56 = var55;
                this.field1670[var57] = var53;
                this.field1663[var57] = var61;
                this.field1664[var57] = var55;
            }
        }
        var4.field2024 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1701[var62] = 0;
            this.field1694[var62] = (short) var4.method2450();
            this.field1675[var62] = (short) var4.method2450();
            this.field1676[var62] = (short) var4.method2450();
        }
        if (this.field1668 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1668[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1694[var65] & 0xFFFF) == this.field1670[var64] && (this.field1675[var65] & 0xFFFF) == this.field1663[var64] && (this.field1676[var65] & 0xFFFF) == this.field1664[var64]) {
                        this.field1668[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1668 = null;
            }
        }
        if (!var3) {
            this.field1698 = null;
        }
        if (!var2) {
            this.field1665 = null;
        }
    }

    public class100(class100[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1684 = 0;
        this.field1661 = 0;
        this.field1672 = 0;
        this.field1671 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class100 var10 = arg0[var9];
            if (var10 != null) {
                this.field1684 += var10.field1684;
                this.field1661 += var10.field1661;
                this.field1672 += var10.field1672;
                if (var10.field1662 == null) {
                    if (this.field1671 == -1) {
                        this.field1671 = var10.field1671;
                    }
                    if (this.field1671 != var10.field1671) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1665 != null;
                var5 |= var10.field1667 != null;
                var6 |= var10.field1685 != null;
                var7 |= var10.field1698 != null;
                var8 |= var10.field1668 != null;
            }
        }
        this.field1683 = new int[this.field1684];
        this.field1659 = new int[this.field1684];
        this.field1660 = new int[this.field1684];
        this.field1681 = new int[this.field1684];
        this.field1670 = new int[this.field1661];
        this.field1663 = new int[this.field1661];
        this.field1664 = new int[this.field1661];
        if (var3) {
            this.field1665 = new byte[this.field1661];
        }
        if (var4) {
            this.field1662 = new byte[this.field1661];
        }
        if (var5) {
            this.field1667 = new byte[this.field1661];
        }
        if (var6) {
            this.field1685 = new int[this.field1661];
        }
        if (var7) {
            this.field1698 = new short[this.field1661];
        }
        if (var8) {
            this.field1668 = new byte[this.field1661];
        }
        this.field1669 = new short[this.field1661];
        if (this.field1672 > 0) {
            this.field1701 = new byte[this.field1672];
            this.field1694 = new short[this.field1672];
            this.field1675 = new short[this.field1672];
            this.field1676 = new short[this.field1672];
            this.field1677 = new short[this.field1672];
            this.field1678 = new short[this.field1672];
            this.field1679 = new short[this.field1672];
            this.field1666 = new short[this.field1672];
            this.field1680 = new byte[this.field1672];
            this.field1697 = new short[this.field1672];
            this.field1682 = new short[this.field1672];
        }
        this.field1684 = 0;
        this.field1661 = 0;
        this.field1672 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class100 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1661; var13++) {
                    if (var3 && var12.field1665 != null) {
                        this.field1665[this.field1661] = var12.field1665[var13];
                    }
                    if (var4) {
                        if (var12.field1662 == null) {
                            this.field1662[this.field1661] = var12.field1671;
                        } else {
                            this.field1662[this.field1661] = var12.field1662[var13];
                        }
                    }
                    if (var5 && var12.field1667 != null) {
                        this.field1667[this.field1661] = var12.field1667[var13];
                    }
                    if (var6 && var12.field1685 != null) {
                        this.field1685[this.field1661] = var12.field1685[var13];
                    }
                    if (var7) {
                        if (var12.field1698 == null) {
                            this.field1698[this.field1661] = -1;
                        } else {
                            this.field1698[this.field1661] = var12.field1698[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1668 == null || var12.field1668[var13] == -1) {
                            this.field1668[this.field1661] = -1;
                        } else {
                            this.field1668[this.field1661] = (byte) (var12.field1668[var13] + this.field1672);
                        }
                    }
                    this.field1669[this.field1661] = var12.field1669[var13];
                    this.field1670[this.field1661] = this.method2047(var12, var12.field1670[var13]);
                    this.field1663[this.field1661] = this.method2047(var12, var12.field1663[var13]);
                    this.field1664[this.field1661] = this.method2047(var12, var12.field1664[var13]);
                    this.field1661++;
                }
                for (int var14 = 0; var14 < var12.field1672; var14++) {
                    byte var15 = this.field1701[this.field1672] = var12.field1701[var14];
                    if (var15 == 0) {
                        this.field1694[this.field1672] = (short) this.method2047(var12, var12.field1694[var14]);
                        this.field1675[this.field1672] = (short) this.method2047(var12, var12.field1675[var14]);
                        this.field1676[this.field1672] = (short) this.method2047(var12, var12.field1676[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1694[this.field1672] = var12.field1694[var14];
                        this.field1675[this.field1672] = var12.field1675[var14];
                        this.field1676[this.field1672] = var12.field1676[var14];
                        this.field1677[this.field1672] = var12.field1677[var14];
                        this.field1678[this.field1672] = var12.field1678[var14];
                        this.field1679[this.field1672] = var12.field1679[var14];
                        this.field1666[this.field1672] = var12.field1666[var14];
                        this.field1680[this.field1672] = var12.field1680[var14];
                        this.field1697[this.field1672] = var12.field1697[var14];
                    }
                    if (var15 == 2) {
                        this.field1682[this.field1672] = var12.field1682[var14];
                    }
                    this.field1672++;
                }
            }
        }
    }

    @ObfuscatedName("cj.n(Lcj;I)I")
    public final int method2047(class100 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1683[arg1];
        int var5 = arg0.field1659[arg1];
        int var6 = arg0.field1660[arg1];
        for (int var7 = 0; var7 < this.field1684; var7++) {
            if (this.field1683[var7] == var4 && this.field1659[var7] == var5 && this.field1660[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1683[this.field1684] = var4;
            this.field1659[this.field1684] = var5;
            this.field1660[this.field1684] = var6;
            if (arg0.field1681 != null) {
                this.field1681[this.field1684] = arg0.field1681[arg1];
            }
            var3 = this.field1684++;
        }
        return var3;
    }

    public class100(class100 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1684 = arg0.field1684;
        this.field1661 = arg0.field1661;
        this.field1672 = arg0.field1672;
        if (arg1) {
            this.field1683 = arg0.field1683;
            this.field1659 = arg0.field1659;
            this.field1660 = arg0.field1660;
        } else {
            this.field1683 = new int[this.field1684];
            this.field1659 = new int[this.field1684];
            this.field1660 = new int[this.field1684];
            for (int var6 = 0; var6 < this.field1684; var6++) {
                this.field1683[var6] = arg0.field1683[var6];
                this.field1659[var6] = arg0.field1659[var6];
                this.field1660[var6] = arg0.field1660[var6];
            }
        }
        if (arg2) {
            this.field1669 = arg0.field1669;
        } else {
            this.field1669 = new short[this.field1661];
            for (int var7 = 0; var7 < this.field1661; var7++) {
                this.field1669[var7] = arg0.field1669[var7];
            }
        }
        if (arg3 || arg0.field1698 == null) {
            this.field1698 = arg0.field1698;
        } else {
            this.field1698 = new short[this.field1661];
            for (int var8 = 0; var8 < this.field1661; var8++) {
                this.field1698[var8] = arg0.field1698[var8];
            }
        }
        if (arg4) {
            this.field1667 = arg0.field1667;
        } else {
            this.field1667 = new byte[this.field1661];
            if (arg0.field1667 == null) {
                for (int var9 = 0; var9 < this.field1661; var9++) {
                    this.field1667[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1661; var10++) {
                    this.field1667[var10] = arg0.field1667[var10];
                }
            }
        }
        this.field1670 = arg0.field1670;
        this.field1663 = arg0.field1663;
        this.field1664 = arg0.field1664;
        this.field1665 = arg0.field1665;
        this.field1662 = arg0.field1662;
        this.field1668 = arg0.field1668;
        this.field1671 = arg0.field1671;
        this.field1701 = arg0.field1701;
        this.field1694 = arg0.field1694;
        this.field1675 = arg0.field1675;
        this.field1676 = arg0.field1676;
        this.field1677 = arg0.field1677;
        this.field1678 = arg0.field1678;
        this.field1679 = arg0.field1679;
        this.field1666 = arg0.field1666;
        this.field1680 = arg0.field1680;
        this.field1697 = arg0.field1697;
        this.field1682 = arg0.field1682;
        this.field1681 = arg0.field1681;
        this.field1685 = arg0.field1685;
        this.field1686 = arg0.field1686;
        this.field1687 = arg0.field1687;
        this.field1658 = arg0.field1658;
        this.field1688 = arg0.field1688;
        this.field1690 = arg0.field1690;
        this.field1691 = arg0.field1691;
        this.field1692 = arg0.field1692;
    }

    @ObfuscatedName("cj.q()Lcj;")
    public class100 method2048() {
        class100 var1 = new class100();
        if (this.field1665 != null) {
            var1.field1665 = new byte[this.field1661];
            for (int var2 = 0; var2 < this.field1661; var2++) {
                var1.field1665[var2] = this.field1665[var2];
            }
        }
        var1.field1684 = this.field1684;
        var1.field1661 = this.field1661;
        var1.field1672 = this.field1672;
        var1.field1683 = this.field1683;
        var1.field1659 = this.field1659;
        var1.field1660 = this.field1660;
        var1.field1670 = this.field1670;
        var1.field1663 = this.field1663;
        var1.field1664 = this.field1664;
        var1.field1662 = this.field1662;
        var1.field1667 = this.field1667;
        var1.field1668 = this.field1668;
        var1.field1669 = this.field1669;
        var1.field1698 = this.field1698;
        var1.field1671 = this.field1671;
        var1.field1701 = this.field1701;
        var1.field1694 = this.field1694;
        var1.field1675 = this.field1675;
        var1.field1676 = this.field1676;
        var1.field1677 = this.field1677;
        var1.field1678 = this.field1678;
        var1.field1679 = this.field1679;
        var1.field1666 = this.field1666;
        var1.field1680 = this.field1680;
        var1.field1697 = this.field1697;
        var1.field1682 = this.field1682;
        var1.field1681 = this.field1681;
        var1.field1685 = this.field1685;
        var1.field1686 = this.field1686;
        var1.field1687 = this.field1687;
        var1.field1658 = this.field1658;
        var1.field1688 = this.field1688;
        var1.field1691 = this.field1691;
        var1.field1692 = this.field1692;
        return var1;
    }

    @ObfuscatedName("cj.a([[IIIIZI)Lcj;")
    public class100 method2049(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2056();
        int var7 = this.field1695 + arg1;
        int var8 = this.field1674 + arg1;
        int var9 = this.field1689 + arg3;
        int var10 = this.field1696 + arg3;
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
            var15.field1684 = this.field1684;
            var15.field1661 = this.field1661;
            var15.field1672 = this.field1672;
            var15.field1683 = this.field1683;
            var15.field1660 = this.field1660;
            var15.field1670 = this.field1670;
            var15.field1663 = this.field1663;
            var15.field1664 = this.field1664;
            var15.field1665 = this.field1665;
            var15.field1662 = this.field1662;
            var15.field1667 = this.field1667;
            var15.field1668 = this.field1668;
            var15.field1669 = this.field1669;
            var15.field1698 = this.field1698;
            var15.field1671 = this.field1671;
            var15.field1701 = this.field1701;
            var15.field1694 = this.field1694;
            var15.field1675 = this.field1675;
            var15.field1676 = this.field1676;
            var15.field1677 = this.field1677;
            var15.field1678 = this.field1678;
            var15.field1679 = this.field1679;
            var15.field1666 = this.field1666;
            var15.field1680 = this.field1680;
            var15.field1697 = this.field1697;
            var15.field1682 = this.field1682;
            var15.field1681 = this.field1681;
            var15.field1685 = this.field1685;
            var15.field1686 = this.field1686;
            var15.field1687 = this.field1687;
            var15.field1691 = this.field1691;
            var15.field1692 = this.field1692;
            var15.field1659 = new int[var15.field1684];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1684; var16++) {
                int var17 = this.field1683[var16] + arg1;
                int var18 = this.field1660[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1659[var16] = this.field1659[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1684; var26++) {
                int var27 = (-this.field1659[var26] << 16) / this.field1525;
                if (var27 < arg5) {
                    int var28 = this.field1683[var26] + arg1;
                    int var29 = this.field1660[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1659[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1659[var26];
                }
            }
        }
        var15.method2061();
        return var15;
    }

    @ObfuscatedName("cj.g()V")
    public void method2050() {
        int var10002;
        if (this.field1681 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1684; var3++) {
                int var4 = this.field1681[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1686 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1686[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1684) {
                int var7 = this.field1681[var6];
                this.field1686[var7][var1[var7]++] = var6++;
            }
            this.field1681 = null;
        }
        if (this.field1685 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1661; var10++) {
            int var11 = this.field1685[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1687 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1687[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1661) {
            int var14 = this.field1685[var13];
            this.field1687[var14][var8[var14]++] = var13++;
        }
        this.field1685 = null;
    }

    @ObfuscatedName("cj.w()V")
    public void method2051() {
        for (int var1 = 0; var1 < this.field1684; var1++) {
            int var2 = this.field1683[var1];
            this.field1683[var1] = this.field1660[var1];
            this.field1660[var1] = -var2;
        }
        this.method2061();
    }

    @ObfuscatedName("cj.z()V")
    public void method2052() {
        for (int var1 = 0; var1 < this.field1684; var1++) {
            this.field1683[var1] = -this.field1683[var1];
            this.field1660[var1] = -this.field1660[var1];
        }
        this.method2061();
    }

    @ObfuscatedName("cj.e()V")
    public void method2053() {
        for (int var1 = 0; var1 < this.field1684; var1++) {
            int var2 = this.field1660[var1];
            this.field1660[var1] = this.field1683[var1];
            this.field1683[var1] = -var2;
        }
        this.method2061();
    }

    @ObfuscatedName("cj.b(I)V")
    public void method2054(int arg0) {
        int var2 = field1702[arg0];
        int var3 = field1703[arg0];
        for (int var4 = 0; var4 < this.field1684; var4++) {
            int var5 = this.field1683[var4] * var3 + this.field1660[var4] * var2 >> 16;
            this.field1660[var4] = this.field1660[var4] * var3 - this.field1683[var4] * var2 >> 16;
            this.field1683[var4] = var5;
        }
        this.method2061();
    }

    @ObfuscatedName("cj.c(III)V")
    public void method2106(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1684; var4++) {
            this.field1683[var4] += arg0;
            this.field1659[var4] += arg1;
            this.field1660[var4] += arg2;
        }
        this.method2061();
    }

    @ObfuscatedName("cj.d(SS)V")
    public void method2107(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1661; var3++) {
            if (this.field1669[var3] == arg0) {
                this.field1669[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cj.h(SS)V")
    public void method2110(short arg0, short arg1) {
        if (this.field1698 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1661; var3++) {
            if (this.field1698[var3] == arg0) {
                this.field1698[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cj.i()V")
    public void method2058() {
        for (int var1 = 0; var1 < this.field1684; var1++) {
            this.field1660[var1] = -this.field1660[var1];
        }
        for (int var2 = 0; var2 < this.field1661; var2++) {
            int var3 = this.field1670[var2];
            this.field1670[var2] = this.field1664[var2];
            this.field1664[var2] = var3;
        }
        this.method2061();
    }

    @ObfuscatedName("cj.v(III)V")
    public void method2059(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1684; var4++) {
            this.field1683[var4] = this.field1683[var4] * arg0 / 128;
            this.field1659[var4] = this.field1659[var4] * arg1 / 128;
            this.field1660[var4] = this.field1660[var4] * arg2 / 128;
        }
        this.method2061();
    }

    @ObfuscatedName("cj.s()V")
    public void method2105() {
        if (this.field1658 != null) {
            return;
        }
        this.field1658 = new class90[this.field1684];
        for (int var1 = 0; var1 < this.field1684; var1++) {
            this.field1658[var1] = new class90();
        }
        for (int var2 = 0; var2 < this.field1661; var2++) {
            int var3 = this.field1670[var2];
            int var4 = this.field1663[var2];
            int var5 = this.field1664[var2];
            int var6 = this.field1683[var4] - this.field1683[var3];
            int var7 = this.field1659[var4] - this.field1659[var3];
            int var8 = this.field1660[var4] - this.field1660[var3];
            int var9 = this.field1683[var5] - this.field1683[var3];
            int var10 = this.field1659[var5] - this.field1659[var3];
            int var11 = this.field1660[var5] - this.field1660[var3];
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
            if (this.field1665 == null) {
                var19 = 0;
            } else {
                var19 = this.field1665[var2];
            }
            if (var19 == 0) {
                class90 var20 = this.field1658[var3];
                var20.field1492 += var16;
                var20.field1486 += var17;
                var20.field1491 += var18;
                var20.field1488++;
                class90 var21 = this.field1658[var4];
                var21.field1492 += var16;
                var21.field1486 += var17;
                var21.field1491 += var18;
                var21.field1488++;
                class90 var22 = this.field1658[var5];
                var22.field1492 += var16;
                var22.field1486 += var17;
                var22.field1491 += var18;
                var22.field1488++;
            } else if (var19 == 1) {
                if (this.field1688 == null) {
                    this.field1688 = new class91[this.field1661];
                }
                class91 var23 = this.field1688[var2] = new class91();
                var23.field1493 = var16;
                var23.field1494 = var17;
                var23.field1496 = var18;
            }
        }
    }

    @ObfuscatedName("cj.f()V")
    public void method2061() {
        this.field1658 = null;
        this.field1690 = null;
        this.field1688 = null;
        this.field1693 = false;
    }

    @ObfuscatedName("cj.y()V")
    public void method2056() {
        if (this.field1693) {
            return;
        }
        this.field1525 = 0;
        this.field1673 = 0;
        this.field1695 = 999999;
        this.field1674 = -999999;
        this.field1696 = -99999;
        this.field1689 = 99999;
        for (int var1 = 0; var1 < this.field1684; var1++) {
            int var2 = this.field1683[var1];
            int var3 = this.field1659[var1];
            int var4 = this.field1660[var1];
            if (var2 < this.field1695) {
                this.field1695 = var2;
            }
            if (var2 > this.field1674) {
                this.field1674 = var2;
            }
            if (var4 < this.field1689) {
                this.field1689 = var4;
            }
            if (var4 > this.field1696) {
                this.field1696 = var4;
            }
            if (-var3 > this.field1525) {
                this.field1525 = -var3;
            }
            if (var3 > this.field1673) {
                this.field1673 = var3;
            }
        }
        this.field1693 = true;
    }

    @ObfuscatedName("cj.t(Lcj;Lcj;IIIZ)V")
    public static void method2063(class100 arg0, class100 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2056();
        arg0.method2105();
        arg1.method2056();
        arg1.method2105();
        field1657++;
        int var6 = 0;
        int[] var7 = arg1.field1683;
        int var8 = arg1.field1684;
        for (int var9 = 0; var9 < arg0.field1684; var9++) {
            class90 var10 = arg0.field1658[var9];
            if (var10.field1488 != 0) {
                int var11 = arg0.field1659[var9] - arg3;
                if (var11 <= arg1.field1673) {
                    int var12 = arg0.field1683[var9] - arg2;
                    if (var12 >= arg1.field1695 && var12 <= arg1.field1674) {
                        int var13 = arg0.field1660[var9] - arg4;
                        if (var13 >= arg1.field1689 && var13 <= arg1.field1696) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class90 var15 = arg1.field1658[var14];
                                if (var7[var14] == var12 && arg1.field1660[var14] == var13 && arg1.field1659[var14] == var11 && var15.field1488 != 0) {
                                    if (arg0.field1690 == null) {
                                        arg0.field1690 = new class90[arg0.field1684];
                                    }
                                    if (arg1.field1690 == null) {
                                        arg1.field1690 = new class90[var8];
                                    }
                                    class90 var16 = arg0.field1690[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1690[var9] = new class90(var10);
                                    }
                                    class90 var17 = arg1.field1690[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1690[var14] = new class90(var15);
                                    }
                                    var16.field1492 += var15.field1492;
                                    var16.field1486 += var15.field1486;
                                    var16.field1491 += var15.field1491;
                                    var16.field1488 += var15.field1488;
                                    var17.field1492 += var10.field1492;
                                    var17.field1486 += var10.field1486;
                                    var17.field1491 += var10.field1491;
                                    var17.field1488 += var10.field1488;
                                    var6++;
                                    field1699[var9] = field1657;
                                    field1700[var14] = field1657;
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
        for (int var18 = 0; var18 < arg0.field1661; var18++) {
            if (field1699[arg0.field1670[var18]] == field1657 && field1699[arg0.field1663[var18]] == field1657 && field1699[arg0.field1664[var18]] == field1657) {
                if (arg0.field1665 == null) {
                    arg0.field1665 = new byte[arg0.field1661];
                }
                arg0.field1665[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1661; var19++) {
            if (field1700[arg1.field1670[var19]] == field1657 && field1700[arg1.field1663[var19]] == field1657 && field1700[arg1.field1664[var19]] == field1657) {
                if (arg1.field1665 == null) {
                    arg1.field1665 = new byte[arg1.field1661];
                }
                arg1.field1665[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cj.r(IIIII)Ldd;")
    public final class111 method2064(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2105();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class111 var8 = new class111();
        var8.field1885 = new int[this.field1661];
        var8.field1889 = new int[this.field1661];
        var8.field1851 = new int[this.field1661];
        if (this.field1672 > 0 && this.field1668 != null) {
            int[] var9 = new int[this.field1672];
            for (int var10 = 0; var10 < this.field1661; var10++) {
                if (this.field1668[var10] != -1) {
                    var9[this.field1668[var10] & 0xFF]++;
                }
            }
            var8.field1857 = 0;
            for (int var11 = 0; var11 < this.field1672; var11++) {
                if (var9[var11] > 0 && this.field1701[var11] == 0) {
                    var8.field1857++;
                }
            }
            var8.field1858 = new int[var8.field1857];
            var8.field1877 = new int[var8.field1857];
            var8.field1860 = new int[var8.field1857];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1672; var13++) {
                if (var9[var13] > 0 && this.field1701[var13] == 0) {
                    var8.field1858[var12] = this.field1694[var13] & 0xFFFF;
                    var8.field1877[var12] = this.field1675[var13] & 0xFFFF;
                    var8.field1860[var12] = this.field1676[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1854 = new byte[this.field1661];
            for (int var14 = 0; var14 < this.field1661; var14++) {
                if (this.field1668[var14] == -1) {
                    var8.field1854[var14] = -1;
                } else {
                    var8.field1854[var14] = (byte) var9[this.field1668[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1661; var15++) {
            byte var16;
            if (this.field1665 == null) {
                var16 = 0;
            } else {
                var16 = this.field1665[var15];
            }
            byte var17;
            if (this.field1667 == null) {
                var17 = 0;
            } else {
                var17 = this.field1667[var15];
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
                    int var19 = this.field1669[var15] & 0xFFFF;
                    class90 var20;
                    if (this.field1690 == null || this.field1690[this.field1670[var15]] == null) {
                        var20 = this.field1658[this.field1670[var15]];
                    } else {
                        var20 = this.field1690[this.field1670[var15]];
                    }
                    int var21 = (var20.field1491 * arg4 + var20.field1492 * arg2 + var20.field1486 * arg3) / (var20.field1488 * var7) + arg0;
                    var8.field1885[var15] = method2065(var19, var21);
                    class90 var22;
                    if (this.field1690 == null || this.field1690[this.field1663[var15]] == null) {
                        var22 = this.field1658[this.field1663[var15]];
                    } else {
                        var22 = this.field1690[this.field1663[var15]];
                    }
                    int var23 = (var22.field1491 * arg4 + var22.field1492 * arg2 + var22.field1486 * arg3) / (var22.field1488 * var7) + arg0;
                    var8.field1889[var15] = method2065(var19, var23);
                    class90 var24;
                    if (this.field1690 == null || this.field1690[this.field1664[var15]] == null) {
                        var24 = this.field1658[this.field1664[var15]];
                    } else {
                        var24 = this.field1690[this.field1664[var15]];
                    }
                    int var25 = (var24.field1491 * arg4 + var24.field1492 * arg2 + var24.field1486 * arg3) / (var24.field1488 * var7) + arg0;
                    var8.field1851[var15] = method2065(var19, var25);
                } else if (var16 == 1) {
                    class91 var26 = this.field1688[var15];
                    int var27 = (var26.field1496 * arg4 + var26.field1494 * arg3 + var26.field1493 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field1885[var15] = method2065(this.field1669[var15] & 0xFFFF, var27);
                    var8.field1851[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1885[var15] = 128;
                    var8.field1851[var15] = -1;
                } else {
                    var8.field1851[var15] = -2;
                }
            } else if (var16 == 0) {
                class90 var28;
                if (this.field1690 == null || this.field1690[this.field1670[var15]] == null) {
                    var28 = this.field1658[this.field1670[var15]];
                } else {
                    var28 = this.field1690[this.field1670[var15]];
                }
                int var29 = (var28.field1491 * arg4 + var28.field1492 * arg2 + var28.field1486 * arg3) / (var28.field1488 * var7) + arg0;
                var8.field1885[var15] = method2066(var29);
                class90 var30;
                if (this.field1690 == null || this.field1690[this.field1663[var15]] == null) {
                    var30 = this.field1658[this.field1663[var15]];
                } else {
                    var30 = this.field1690[this.field1663[var15]];
                }
                int var31 = (var30.field1491 * arg4 + var30.field1492 * arg2 + var30.field1486 * arg3) / (var30.field1488 * var7) + arg0;
                var8.field1889[var15] = method2066(var31);
                class90 var32;
                if (this.field1690 == null || this.field1690[this.field1664[var15]] == null) {
                    var32 = this.field1658[this.field1664[var15]];
                } else {
                    var32 = this.field1690[this.field1664[var15]];
                }
                int var33 = (var32.field1491 * arg4 + var32.field1492 * arg2 + var32.field1486 * arg3) / (var32.field1488 * var7) + arg0;
                var8.field1851[var15] = method2066(var33);
            } else if (var16 == 1) {
                class91 var34 = this.field1688[var15];
                int var35 = (var34.field1496 * arg4 + var34.field1494 * arg3 + var34.field1493 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field1885[var15] = method2066(var35);
                var8.field1851[var15] = -1;
            } else {
                var8.field1851[var15] = -2;
            }
        }
        this.method2050();
        var8.field1841 = this.field1684;
        var8.field1842 = this.field1683;
        var8.field1843 = this.field1659;
        var8.field1844 = this.field1660;
        var8.field1859 = this.field1661;
        var8.field1846 = this.field1670;
        var8.field1847 = this.field1663;
        var8.field1895 = this.field1664;
        var8.field1852 = this.field1662;
        var8.field1900 = this.field1667;
        var8.field1856 = this.field1671;
        var8.field1861 = this.field1686;
        var8.field1862 = this.field1687;
        var8.field1855 = this.field1698;
        return var8;
    }

    @ObfuscatedName("cj.p(II)I")
    public static final int method2065(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cj.o(I)I")
    public static final int method2066(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
