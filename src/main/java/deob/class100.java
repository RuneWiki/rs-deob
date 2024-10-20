package deob;

@ObfuscatedName("cy")
public class class100 extends class85 {

    @ObfuscatedName("cy.m")
    public int field1657 = 0;

    @ObfuscatedName("cy.l")
    public int[] field1649;

    @ObfuscatedName("cy.y")
    public int[] field1644;

    @ObfuscatedName("cy.u")
    public int[] field1664;

    @ObfuscatedName("cy.k")
    public int field1646 = 0;

    @ObfuscatedName("cy.j")
    public int[] field1647;

    @ObfuscatedName("cy.i")
    public int[] field1648;

    @ObfuscatedName("cy.x")
    public int[] field1652;

    @ObfuscatedName("cy.g")
    public byte[] field1650;

    @ObfuscatedName("cy.e")
    public byte[] field1651;

    @ObfuscatedName("cy.p")
    public byte[] field1668;

    @ObfuscatedName("cy.a")
    public byte[] field1653;

    @ObfuscatedName("cy.v")
    public short[] field1654;

    @ObfuscatedName("cy.c")
    public short[] field1655;

    @ObfuscatedName("cy.s")
    public byte field1656 = 0;

    @ObfuscatedName("cy.r")
    public int field1684;

    @ObfuscatedName("cy.h")
    public byte[] field1658;

    @ObfuscatedName("cy.n")
    public short[] field1661;

    @ObfuscatedName("cy.b")
    public short[] field1660;

    @ObfuscatedName("cy.f")
    public short[] field1682;

    @ObfuscatedName("cy.d")
    public short[] field1675;

    @ObfuscatedName("cy.q")
    public short[] field1663;

    @ObfuscatedName("cy.o")
    public short[] field1685;

    @ObfuscatedName("cy.w")
    public short[] field1670;

    @ObfuscatedName("cy.z")
    public short[] field1666;

    @ObfuscatedName("cy.t")
    public short[] field1667;

    @ObfuscatedName("cy.aq")
    public byte[] field1681;

    @ObfuscatedName("cy.an")
    public int[] field1669;

    @ObfuscatedName("cy.av")
    public int[] field1645;

    @ObfuscatedName("cy.ac")
    public int[][] field1671;

    @ObfuscatedName("cy.ar")
    public int[][] field1672;

    @ObfuscatedName("cy.ah")
    public class84[] field1673;

    @ObfuscatedName("cy.ab")
    public class96[] field1680;

    @ObfuscatedName("cy.au")
    public class96[] field1643;

    @ObfuscatedName("cy.ao")
    public short field1676;

    @ObfuscatedName("cy.am")
    public short field1677;

    @ObfuscatedName("cy.aa")
    public boolean field1678 = false;

    @ObfuscatedName("cy.aj")
    public int field1679;

    @ObfuscatedName("cy.ap")
    public int field1662;

    @ObfuscatedName("cy.at")
    public int field1674;

    @ObfuscatedName("cy.az")
    public int field1665;

    @ObfuscatedName("cy.ai")
    public int field1683;

    @ObfuscatedName("cy.af")
    public static int[] field1659 = new int[10000];

    @ObfuscatedName("cy.aw")
    public static int[] field1642 = new int[10000];

    @ObfuscatedName("cy.al")
    public static int field1686 = 0;

    @ObfuscatedName("cy.ax")
    public static int[] field1687 = class91.field1530;

    @ObfuscatedName("cy.ag")
    public static int[] field1688 = class91.field1536;

    public class100() {
    }

    @ObfuscatedName("cy.m(Lfx;II)Lcy;")
    public static class100 method2097(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3080(arg1, arg2);
        return var3 == null ? null : new class100(var3);
    }

    public class100(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2096(arg0);
        } else {
            this.method2095(arg0);
        }
    }

    @ObfuscatedName("cy.l([B)V")
    public void method2096(byte[] arg0) {
        class119 var2 = new class119(arg0);
        class119 var3 = new class119(arg0);
        class119 var4 = new class119(arg0);
        class119 var5 = new class119(arg0);
        class119 var6 = new class119(arg0);
        class119 var7 = new class119(arg0);
        class119 var8 = new class119(arg0);
        var2.field1955 = arg0.length - 23;
        int var9 = var2.method2541();
        int var10 = var2.method2541();
        int var11 = var2.method2562();
        int var12 = var2.method2562();
        int var13 = var2.method2562();
        int var14 = var2.method2562();
        int var15 = var2.method2562();
        int var16 = var2.method2562();
        int var17 = var2.method2562();
        int var18 = var2.method2541();
        int var19 = var2.method2541();
        int var20 = var2.method2541();
        int var21 = var2.method2541();
        int var22 = var2.method2541();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1658 = new byte[var11];
            var2.field1955 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1658[var26] = var2.method2382();
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
        this.field1657 = var9;
        this.field1646 = var10;
        this.field1684 = var11;
        this.field1649 = new int[var9];
        this.field1644 = new int[var9];
        this.field1664 = new int[var9];
        this.field1647 = new int[var10];
        this.field1648 = new int[var10];
        this.field1652 = new int[var10];
        if (var17 == 1) {
            this.field1669 = new int[var9];
        }
        if (var12 == 1) {
            this.field1650 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1651 = new byte[var10];
        } else {
            this.field1656 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1668 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1645 = new int[var10];
        }
        if (var16 == 1) {
            this.field1655 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1653 = new byte[var10];
        }
        this.field1654 = new short[var10];
        if (var11 > 0) {
            this.field1661 = new short[var11];
            this.field1660 = new short[var11];
            this.field1682 = new short[var11];
            if (var24 > 0) {
                this.field1675 = new short[var24];
                this.field1663 = new short[var24];
                this.field1685 = new short[var24];
                this.field1670 = new short[var24];
                this.field1681 = new byte[var24];
                this.field1666 = new short[var24];
            }
            if (var25 > 0) {
                this.field1667 = new short[var25];
            }
        }
        var2.field1955 = var11;
        var3.field1955 = var44;
        var4.field1955 = var46;
        var5.field1955 = var48;
        var6.field1955 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2562();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2393();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2393();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2393();
            }
            this.field1649[var67] = var64 + var69;
            this.field1644[var67] = var65 + var70;
            this.field1664[var67] = var66 + var71;
            var64 = this.field1649[var67];
            var65 = this.field1644[var67];
            var66 = this.field1664[var67];
            if (var17 == 1) {
                this.field1669[var67] = var6.method2562();
            }
        }
        var2.field1955 = var42;
        var3.field1955 = var31;
        var4.field1955 = var34;
        var5.field1955 = var37;
        var6.field1955 = var35;
        var7.field1955 = var40;
        var8.field1955 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1654[var72] = (short) var2.method2541();
            if (var12 == 1) {
                this.field1650[var72] = var3.method2382();
            }
            if (var13 == 255) {
                this.field1651[var72] = var4.method2382();
            }
            if (var14 == 1) {
                this.field1668[var72] = var5.method2382();
            }
            if (var15 == 1) {
                this.field1645[var72] = var6.method2562();
            }
            if (var16 == 1) {
                this.field1655[var72] = (short) (var7.method2541() - 1);
            }
            if (this.field1653 != null && this.field1655[var72] != -1) {
                this.field1653[var72] = (byte) (var8.method2562() - 1);
            }
        }
        var2.field1955 = var33;
        var3.field1955 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2562();
            if (var78 == 1) {
                var73 = var2.method2393() + var76;
                var74 = var2.method2393() + var73;
                var75 = var2.method2393() + var74;
                var76 = var75;
                this.field1647[var77] = var73;
                this.field1648[var77] = var74;
                this.field1652[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2393() + var76;
                var76 = var75;
                this.field1647[var77] = var73;
                this.field1648[var77] = var74;
                this.field1652[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2393() + var76;
                var76 = var75;
                this.field1647[var77] = var73;
                this.field1648[var77] = var74;
                this.field1652[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2393() + var76;
                var76 = var75;
                this.field1647[var77] = var73;
                this.field1648[var77] = var81;
                this.field1652[var77] = var75;
            }
        }
        var2.field1955 = var50;
        var3.field1955 = var52;
        var4.field1955 = var54;
        var5.field1955 = var56;
        var6.field1955 = var58;
        var7.field1955 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1658[var82] & 0xFF;
            if (var83 == 0) {
                this.field1661[var82] = (short) var2.method2541();
                this.field1660[var82] = (short) var2.method2541();
                this.field1682[var82] = (short) var2.method2541();
            }
            if (var83 == 1) {
                this.field1661[var82] = (short) var3.method2541();
                this.field1660[var82] = (short) var3.method2541();
                this.field1682[var82] = (short) var3.method2541();
                this.field1675[var82] = (short) var4.method2541();
                this.field1663[var82] = (short) var4.method2541();
                this.field1685[var82] = (short) var4.method2541();
                this.field1670[var82] = (short) var5.method2541();
                this.field1681[var82] = var6.method2382();
                this.field1666[var82] = (short) var7.method2541();
            }
            if (var83 == 2) {
                this.field1661[var82] = (short) var3.method2541();
                this.field1660[var82] = (short) var3.method2541();
                this.field1682[var82] = (short) var3.method2541();
                this.field1675[var82] = (short) var4.method2541();
                this.field1663[var82] = (short) var4.method2541();
                this.field1685[var82] = (short) var4.method2541();
                this.field1670[var82] = (short) var5.method2541();
                this.field1681[var82] = var6.method2382();
                this.field1666[var82] = (short) var7.method2541();
                this.field1667[var82] = (short) var7.method2541();
            }
            if (var83 == 3) {
                this.field1661[var82] = (short) var3.method2541();
                this.field1660[var82] = (short) var3.method2541();
                this.field1682[var82] = (short) var3.method2541();
                this.field1675[var82] = (short) var4.method2541();
                this.field1663[var82] = (short) var4.method2541();
                this.field1685[var82] = (short) var4.method2541();
                this.field1670[var82] = (short) var5.method2541();
                this.field1681[var82] = var6.method2382();
                this.field1666[var82] = (short) var7.method2541();
            }
        }
        var2.field1955 = var62;
        int var84 = var2.method2562();
        if (var84 == 0) {
            return;
        }
        new class90();
        var2.method2541();
        var2.method2541();
        var2.method2541();
        var2.method2386();
    }

    @ObfuscatedName("cy.u([B)V")
    public void method2095(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class119 var4 = new class119(arg0);
        class119 var5 = new class119(arg0);
        class119 var6 = new class119(arg0);
        class119 var7 = new class119(arg0);
        class119 var8 = new class119(arg0);
        var4.field1955 = arg0.length - 18;
        int var9 = var4.method2541();
        int var10 = var4.method2541();
        int var11 = var4.method2562();
        int var12 = var4.method2562();
        int var13 = var4.method2562();
        int var14 = var4.method2562();
        int var15 = var4.method2562();
        int var16 = var4.method2562();
        int var17 = var4.method2541();
        int var18 = var4.method2541();
        int var19 = var4.method2541();
        int var20 = var4.method2541();
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
        this.field1657 = var9;
        this.field1646 = var10;
        this.field1684 = var11;
        this.field1649 = new int[var9];
        this.field1644 = new int[var9];
        this.field1664 = new int[var9];
        this.field1647 = new int[var10];
        this.field1648 = new int[var10];
        this.field1652 = new int[var10];
        if (var11 > 0) {
            this.field1658 = new byte[var11];
            this.field1661 = new short[var11];
            this.field1660 = new short[var11];
            this.field1682 = new short[var11];
        }
        if (var16 == 1) {
            this.field1669 = new int[var9];
        }
        if (var12 == 1) {
            this.field1650 = new byte[var10];
            this.field1653 = new byte[var10];
            this.field1655 = new short[var10];
        }
        if (var13 == 255) {
            this.field1651 = new byte[var10];
        } else {
            this.field1656 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1668 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1645 = new int[var10];
        }
        this.field1654 = new short[var10];
        var4.field1955 = var21;
        var5.field1955 = var36;
        var6.field1955 = var38;
        var7.field1955 = var40;
        var8.field1955 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2562();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2393();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2393();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2393();
            }
            this.field1649[var46] = var43 + var48;
            this.field1644[var46] = var44 + var49;
            this.field1664[var46] = var45 + var50;
            var43 = this.field1649[var46];
            var44 = this.field1644[var46];
            var45 = this.field1664[var46];
            if (var16 == 1) {
                this.field1669[var46] = var8.method2562();
            }
        }
        var4.field1955 = var32;
        var5.field1955 = var28;
        var6.field1955 = var26;
        var7.field1955 = var30;
        var8.field1955 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1654[var51] = (short) var4.method2541();
            if (var12 == 1) {
                int var52 = var5.method2562();
                if ((var52 & 0x1) == 1) {
                    this.field1650[var51] = 1;
                    var2 = true;
                } else {
                    this.field1650[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1653[var51] = (byte) (var52 >> 2);
                    this.field1655[var51] = this.field1654[var51];
                    this.field1654[var51] = 127;
                    if (this.field1655[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1653[var51] = -1;
                    this.field1655[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1651[var51] = var6.method2382();
            }
            if (var14 == 1) {
                this.field1668[var51] = var7.method2382();
            }
            if (var15 == 1) {
                this.field1645[var51] = var8.method2562();
            }
        }
        var4.field1955 = var25;
        var5.field1955 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2562();
            if (var58 == 1) {
                var53 = var4.method2393() + var56;
                var54 = var4.method2393() + var53;
                var55 = var4.method2393() + var54;
                var56 = var55;
                this.field1647[var57] = var53;
                this.field1648[var57] = var54;
                this.field1652[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2393() + var56;
                var56 = var55;
                this.field1647[var57] = var53;
                this.field1648[var57] = var54;
                this.field1652[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2393() + var56;
                var56 = var55;
                this.field1647[var57] = var53;
                this.field1648[var57] = var54;
                this.field1652[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2393() + var56;
                var56 = var55;
                this.field1647[var57] = var53;
                this.field1648[var57] = var61;
                this.field1652[var57] = var55;
            }
        }
        var4.field1955 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1658[var62] = 0;
            this.field1661[var62] = (short) var4.method2541();
            this.field1660[var62] = (short) var4.method2541();
            this.field1682[var62] = (short) var4.method2541();
        }
        if (this.field1653 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1653[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1661[var65] & 0xFFFF) == this.field1647[var64] && (this.field1660[var65] & 0xFFFF) == this.field1648[var64] && (this.field1682[var65] & 0xFFFF) == this.field1652[var64]) {
                        this.field1653[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1653 = null;
            }
        }
        if (!var3) {
            this.field1655 = null;
        }
        if (!var2) {
            this.field1650 = null;
        }
    }

    public class100(class100[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1657 = 0;
        this.field1646 = 0;
        this.field1684 = 0;
        this.field1656 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class100 var10 = arg0[var9];
            if (var10 != null) {
                this.field1657 += var10.field1657;
                this.field1646 += var10.field1646;
                this.field1684 += var10.field1684;
                if (var10.field1651 == null) {
                    if (this.field1656 == -1) {
                        this.field1656 = var10.field1656;
                    }
                    if (this.field1656 != var10.field1656) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1650 != null;
                var5 |= var10.field1668 != null;
                var6 |= var10.field1645 != null;
                var7 |= var10.field1655 != null;
                var8 |= var10.field1653 != null;
            }
        }
        this.field1649 = new int[this.field1657];
        this.field1644 = new int[this.field1657];
        this.field1664 = new int[this.field1657];
        this.field1669 = new int[this.field1657];
        this.field1647 = new int[this.field1646];
        this.field1648 = new int[this.field1646];
        this.field1652 = new int[this.field1646];
        if (var3) {
            this.field1650 = new byte[this.field1646];
        }
        if (var4) {
            this.field1651 = new byte[this.field1646];
        }
        if (var5) {
            this.field1668 = new byte[this.field1646];
        }
        if (var6) {
            this.field1645 = new int[this.field1646];
        }
        if (var7) {
            this.field1655 = new short[this.field1646];
        }
        if (var8) {
            this.field1653 = new byte[this.field1646];
        }
        this.field1654 = new short[this.field1646];
        if (this.field1684 > 0) {
            this.field1658 = new byte[this.field1684];
            this.field1661 = new short[this.field1684];
            this.field1660 = new short[this.field1684];
            this.field1682 = new short[this.field1684];
            this.field1675 = new short[this.field1684];
            this.field1663 = new short[this.field1684];
            this.field1685 = new short[this.field1684];
            this.field1670 = new short[this.field1684];
            this.field1681 = new byte[this.field1684];
            this.field1666 = new short[this.field1684];
            this.field1667 = new short[this.field1684];
        }
        this.field1657 = 0;
        this.field1646 = 0;
        this.field1684 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class100 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1646; var13++) {
                    if (var3 && var12.field1650 != null) {
                        this.field1650[this.field1646] = var12.field1650[var13];
                    }
                    if (var4) {
                        if (var12.field1651 == null) {
                            this.field1651[this.field1646] = var12.field1656;
                        } else {
                            this.field1651[this.field1646] = var12.field1651[var13];
                        }
                    }
                    if (var5 && var12.field1668 != null) {
                        this.field1668[this.field1646] = var12.field1668[var13];
                    }
                    if (var6 && var12.field1645 != null) {
                        this.field1645[this.field1646] = var12.field1645[var13];
                    }
                    if (var7) {
                        if (var12.field1655 == null) {
                            this.field1655[this.field1646] = -1;
                        } else {
                            this.field1655[this.field1646] = var12.field1655[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1653 == null || var12.field1653[var13] == -1) {
                            this.field1653[this.field1646] = -1;
                        } else {
                            this.field1653[this.field1646] = (byte) (var12.field1653[var13] + this.field1684);
                        }
                    }
                    this.field1654[this.field1646] = var12.field1654[var13];
                    this.field1647[this.field1646] = this.method2093(var12, var12.field1647[var13]);
                    this.field1648[this.field1646] = this.method2093(var12, var12.field1648[var13]);
                    this.field1652[this.field1646] = this.method2093(var12, var12.field1652[var13]);
                    this.field1646++;
                }
                for (int var14 = 0; var14 < var12.field1684; var14++) {
                    byte var15 = this.field1658[this.field1684] = var12.field1658[var14];
                    if (var15 == 0) {
                        this.field1661[this.field1684] = (short) this.method2093(var12, var12.field1661[var14]);
                        this.field1660[this.field1684] = (short) this.method2093(var12, var12.field1660[var14]);
                        this.field1682[this.field1684] = (short) this.method2093(var12, var12.field1682[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1661[this.field1684] = var12.field1661[var14];
                        this.field1660[this.field1684] = var12.field1660[var14];
                        this.field1682[this.field1684] = var12.field1682[var14];
                        this.field1675[this.field1684] = var12.field1675[var14];
                        this.field1663[this.field1684] = var12.field1663[var14];
                        this.field1685[this.field1684] = var12.field1685[var14];
                        this.field1670[this.field1684] = var12.field1670[var14];
                        this.field1681[this.field1684] = var12.field1681[var14];
                        this.field1666[this.field1684] = var12.field1666[var14];
                    }
                    if (var15 == 2) {
                        this.field1667[this.field1684] = var12.field1667[var14];
                    }
                    this.field1684++;
                }
            }
        }
    }

    @ObfuscatedName("cy.k(Lcy;I)I")
    public final int method2093(class100 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1649[arg1];
        int var5 = arg0.field1644[arg1];
        int var6 = arg0.field1664[arg1];
        for (int var7 = 0; var7 < this.field1657; var7++) {
            if (this.field1649[var7] == var4 && this.field1644[var7] == var5 && this.field1664[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1649[this.field1657] = var4;
            this.field1644[this.field1657] = var5;
            this.field1664[this.field1657] = var6;
            if (arg0.field1669 != null) {
                this.field1669[this.field1657] = arg0.field1669[arg1];
            }
            var3 = this.field1657++;
        }
        return var3;
    }

    public class100(class100 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1657 = arg0.field1657;
        this.field1646 = arg0.field1646;
        this.field1684 = arg0.field1684;
        if (arg1) {
            this.field1649 = arg0.field1649;
            this.field1644 = arg0.field1644;
            this.field1664 = arg0.field1664;
        } else {
            this.field1649 = new int[this.field1657];
            this.field1644 = new int[this.field1657];
            this.field1664 = new int[this.field1657];
            for (int var6 = 0; var6 < this.field1657; var6++) {
                this.field1649[var6] = arg0.field1649[var6];
                this.field1644[var6] = arg0.field1644[var6];
                this.field1664[var6] = arg0.field1664[var6];
            }
        }
        if (arg2) {
            this.field1654 = arg0.field1654;
        } else {
            this.field1654 = new short[this.field1646];
            for (int var7 = 0; var7 < this.field1646; var7++) {
                this.field1654[var7] = arg0.field1654[var7];
            }
        }
        if (arg3 || arg0.field1655 == null) {
            this.field1655 = arg0.field1655;
        } else {
            this.field1655 = new short[this.field1646];
            for (int var8 = 0; var8 < this.field1646; var8++) {
                this.field1655[var8] = arg0.field1655[var8];
            }
        }
        if (arg4) {
            this.field1668 = arg0.field1668;
        } else {
            this.field1668 = new byte[this.field1646];
            if (arg0.field1668 == null) {
                for (int var9 = 0; var9 < this.field1646; var9++) {
                    this.field1668[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1646; var10++) {
                    this.field1668[var10] = arg0.field1668[var10];
                }
            }
        }
        this.field1647 = arg0.field1647;
        this.field1648 = arg0.field1648;
        this.field1652 = arg0.field1652;
        this.field1650 = arg0.field1650;
        this.field1651 = arg0.field1651;
        this.field1653 = arg0.field1653;
        this.field1656 = arg0.field1656;
        this.field1658 = arg0.field1658;
        this.field1661 = arg0.field1661;
        this.field1660 = arg0.field1660;
        this.field1682 = arg0.field1682;
        this.field1675 = arg0.field1675;
        this.field1663 = arg0.field1663;
        this.field1685 = arg0.field1685;
        this.field1670 = arg0.field1670;
        this.field1681 = arg0.field1681;
        this.field1666 = arg0.field1666;
        this.field1667 = arg0.field1667;
        this.field1669 = arg0.field1669;
        this.field1645 = arg0.field1645;
        this.field1671 = arg0.field1671;
        this.field1672 = arg0.field1672;
        this.field1680 = arg0.field1680;
        this.field1673 = arg0.field1673;
        this.field1643 = arg0.field1643;
        this.field1676 = arg0.field1676;
        this.field1677 = arg0.field1677;
    }

    @ObfuscatedName("cy.j()Lcy;")
    public class100 method2098() {
        class100 var1 = new class100();
        if (this.field1650 != null) {
            var1.field1650 = new byte[this.field1646];
            for (int var2 = 0; var2 < this.field1646; var2++) {
                var1.field1650[var2] = this.field1650[var2];
            }
        }
        var1.field1657 = this.field1657;
        var1.field1646 = this.field1646;
        var1.field1684 = this.field1684;
        var1.field1649 = this.field1649;
        var1.field1644 = this.field1644;
        var1.field1664 = this.field1664;
        var1.field1647 = this.field1647;
        var1.field1648 = this.field1648;
        var1.field1652 = this.field1652;
        var1.field1651 = this.field1651;
        var1.field1668 = this.field1668;
        var1.field1653 = this.field1653;
        var1.field1654 = this.field1654;
        var1.field1655 = this.field1655;
        var1.field1656 = this.field1656;
        var1.field1658 = this.field1658;
        var1.field1661 = this.field1661;
        var1.field1660 = this.field1660;
        var1.field1682 = this.field1682;
        var1.field1675 = this.field1675;
        var1.field1663 = this.field1663;
        var1.field1685 = this.field1685;
        var1.field1670 = this.field1670;
        var1.field1681 = this.field1681;
        var1.field1666 = this.field1666;
        var1.field1667 = this.field1667;
        var1.field1669 = this.field1669;
        var1.field1645 = this.field1645;
        var1.field1671 = this.field1671;
        var1.field1672 = this.field1672;
        var1.field1680 = this.field1680;
        var1.field1673 = this.field1673;
        var1.field1676 = this.field1676;
        var1.field1677 = this.field1677;
        return var1;
    }

    @ObfuscatedName("cy.i([[IIIIZI)Lcy;")
    public class100 method2099(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2112();
        int var7 = this.field1662 + arg1;
        int var8 = this.field1674 + arg1;
        int var9 = this.field1683 + arg3;
        int var10 = this.field1665 + arg3;
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
            var15.field1657 = this.field1657;
            var15.field1646 = this.field1646;
            var15.field1684 = this.field1684;
            var15.field1649 = this.field1649;
            var15.field1664 = this.field1664;
            var15.field1647 = this.field1647;
            var15.field1648 = this.field1648;
            var15.field1652 = this.field1652;
            var15.field1650 = this.field1650;
            var15.field1651 = this.field1651;
            var15.field1668 = this.field1668;
            var15.field1653 = this.field1653;
            var15.field1654 = this.field1654;
            var15.field1655 = this.field1655;
            var15.field1656 = this.field1656;
            var15.field1658 = this.field1658;
            var15.field1661 = this.field1661;
            var15.field1660 = this.field1660;
            var15.field1682 = this.field1682;
            var15.field1675 = this.field1675;
            var15.field1663 = this.field1663;
            var15.field1685 = this.field1685;
            var15.field1670 = this.field1670;
            var15.field1681 = this.field1681;
            var15.field1666 = this.field1666;
            var15.field1667 = this.field1667;
            var15.field1669 = this.field1669;
            var15.field1645 = this.field1645;
            var15.field1671 = this.field1671;
            var15.field1672 = this.field1672;
            var15.field1676 = this.field1676;
            var15.field1677 = this.field1677;
            var15.field1644 = new int[var15.field1657];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1657; var16++) {
                int var17 = this.field1649[var16] + arg1;
                int var18 = this.field1664[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1644[var16] = this.field1644[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1657; var26++) {
                int var27 = (-this.field1644[var26] << 16) / this.field1408;
                if (var27 < arg5) {
                    int var28 = this.field1649[var26] + arg1;
                    int var29 = this.field1664[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1644[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1644[var26];
                }
            }
        }
        var15.method2142();
        return var15;
    }

    @ObfuscatedName("cy.x()V")
    public void method2160() {
        int var10002;
        if (this.field1669 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1657; var3++) {
                int var4 = this.field1669[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1671 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1671[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1657) {
                int var7 = this.field1669[var6];
                this.field1671[var7][var1[var7]++] = var6++;
            }
            this.field1669 = null;
        }
        if (this.field1645 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1646; var10++) {
            int var11 = this.field1645[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1672 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1672[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1646) {
            int var14 = this.field1645[var13];
            this.field1672[var14][var8[var14]++] = var13++;
        }
        this.field1645 = null;
    }

    @ObfuscatedName("cy.g()V")
    public void method2101() {
        for (int var1 = 0; var1 < this.field1657; var1++) {
            int var2 = this.field1649[var1];
            this.field1649[var1] = this.field1664[var1];
            this.field1664[var1] = -var2;
        }
        this.method2142();
    }

    @ObfuscatedName("cy.e()V")
    public void method2102() {
        for (int var1 = 0; var1 < this.field1657; var1++) {
            this.field1649[var1] = -this.field1649[var1];
            this.field1664[var1] = -this.field1664[var1];
        }
        this.method2142();
    }

    @ObfuscatedName("cy.p()V")
    public void method2103() {
        for (int var1 = 0; var1 < this.field1657; var1++) {
            int var2 = this.field1664[var1];
            this.field1664[var1] = this.field1649[var1];
            this.field1649[var1] = -var2;
        }
        this.method2142();
    }

    @ObfuscatedName("cy.a(I)V")
    public void method2104(int arg0) {
        int var2 = field1687[arg0];
        int var3 = field1688[arg0];
        for (int var4 = 0; var4 < this.field1657; var4++) {
            int var5 = this.field1664[var4] * var2 + this.field1649[var4] * var3 >> 16;
            this.field1664[var4] = this.field1664[var4] * var3 - this.field1649[var4] * var2 >> 16;
            this.field1649[var4] = var5;
        }
        this.method2142();
    }

    @ObfuscatedName("cy.v(III)V")
    public void method2105(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1657; var4++) {
            this.field1649[var4] += arg0;
            this.field1644[var4] += arg1;
            this.field1664[var4] += arg2;
        }
        this.method2142();
    }

    @ObfuscatedName("cy.c(SS)V")
    public void method2106(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1646; var3++) {
            if (this.field1654[var3] == arg0) {
                this.field1654[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cy.b(SS)V")
    public void method2107(short arg0, short arg1) {
        if (this.field1655 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1646; var3++) {
            if (this.field1655[var3] == arg0) {
                this.field1655[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cy.f()V")
    public void method2108() {
        for (int var1 = 0; var1 < this.field1657; var1++) {
            this.field1664[var1] = -this.field1664[var1];
        }
        for (int var2 = 0; var2 < this.field1646; var2++) {
            int var3 = this.field1647[var2];
            this.field1647[var2] = this.field1652[var2];
            this.field1652[var2] = var3;
        }
        this.method2142();
    }

    @ObfuscatedName("cy.d(III)V")
    public void method2109(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1657; var4++) {
            this.field1649[var4] = this.field1649[var4] * arg0 / 128;
            this.field1644[var4] = this.field1644[var4] * arg1 / 128;
            this.field1664[var4] = this.field1664[var4] * arg2 / 128;
        }
        this.method2142();
    }

    @ObfuscatedName("cy.q()V")
    public void method2111() {
        if (this.field1680 != null) {
            return;
        }
        this.field1680 = new class96[this.field1657];
        for (int var1 = 0; var1 < this.field1657; var1++) {
            this.field1680[var1] = new class96();
        }
        for (int var2 = 0; var2 < this.field1646; var2++) {
            int var3 = this.field1647[var2];
            int var4 = this.field1648[var2];
            int var5 = this.field1652[var2];
            int var6 = this.field1649[var4] - this.field1649[var3];
            int var7 = this.field1644[var4] - this.field1644[var3];
            int var8 = this.field1664[var4] - this.field1664[var3];
            int var9 = this.field1649[var5] - this.field1649[var3];
            int var10 = this.field1644[var5] - this.field1644[var3];
            int var11 = this.field1664[var5] - this.field1664[var3];
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
            if (this.field1650 == null) {
                var19 = 0;
            } else {
                var19 = this.field1650[var2];
            }
            if (var19 == 0) {
                class96 var20 = this.field1680[var3];
                var20.field1581 += var16;
                var20.field1574 += var17;
                var20.field1576 += var18;
                var20.field1577++;
                class96 var21 = this.field1680[var4];
                var21.field1581 += var16;
                var21.field1574 += var17;
                var21.field1576 += var18;
                var21.field1577++;
                class96 var22 = this.field1680[var5];
                var22.field1581 += var16;
                var22.field1574 += var17;
                var22.field1576 += var18;
                var22.field1577++;
            } else if (var19 == 1) {
                if (this.field1673 == null) {
                    this.field1673 = new class84[this.field1646];
                }
                class84 var23 = this.field1673[var2] = new class84();
                var23.field1406 = var16;
                var23.field1398 = var17;
                var23.field1399 = var18;
            }
        }
    }

    @ObfuscatedName("cy.o()V")
    public void method2142() {
        this.field1680 = null;
        this.field1643 = null;
        this.field1673 = null;
        this.field1678 = false;
    }

    @ObfuscatedName("cy.w()V")
    public void method2112() {
        if (this.field1678) {
            return;
        }
        this.field1408 = 0;
        this.field1679 = 0;
        this.field1662 = 999999;
        this.field1674 = -999999;
        this.field1665 = -99999;
        this.field1683 = 99999;
        for (int var1 = 0; var1 < this.field1657; var1++) {
            int var2 = this.field1649[var1];
            int var3 = this.field1644[var1];
            int var4 = this.field1664[var1];
            if (var2 < this.field1662) {
                this.field1662 = var2;
            }
            if (var2 > this.field1674) {
                this.field1674 = var2;
            }
            if (var4 < this.field1683) {
                this.field1683 = var4;
            }
            if (var4 > this.field1665) {
                this.field1665 = var4;
            }
            if (-var3 > this.field1408) {
                this.field1408 = -var3;
            }
            if (var3 > this.field1679) {
                this.field1679 = var3;
            }
        }
        this.field1678 = true;
    }

    @ObfuscatedName("cy.z(Lcy;Lcy;IIIZ)V")
    public static void method2118(class100 arg0, class100 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2112();
        arg0.method2111();
        arg1.method2112();
        arg1.method2111();
        field1686++;
        int var6 = 0;
        int[] var7 = arg1.field1649;
        int var8 = arg1.field1657;
        for (int var9 = 0; var9 < arg0.field1657; var9++) {
            class96 var10 = arg0.field1680[var9];
            if (var10.field1577 != 0) {
                int var11 = arg0.field1644[var9] - arg3;
                if (var11 <= arg1.field1679) {
                    int var12 = arg0.field1649[var9] - arg2;
                    if (var12 >= arg1.field1662 && var12 <= arg1.field1674) {
                        int var13 = arg0.field1664[var9] - arg4;
                        if (var13 >= arg1.field1683 && var13 <= arg1.field1665) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class96 var15 = arg1.field1680[var14];
                                if (var7[var14] == var12 && arg1.field1664[var14] == var13 && arg1.field1644[var14] == var11 && var15.field1577 != 0) {
                                    if (arg0.field1643 == null) {
                                        arg0.field1643 = new class96[arg0.field1657];
                                    }
                                    if (arg1.field1643 == null) {
                                        arg1.field1643 = new class96[var8];
                                    }
                                    class96 var16 = arg0.field1643[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1643[var9] = new class96(var10);
                                    }
                                    class96 var17 = arg1.field1643[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1643[var14] = new class96(var15);
                                    }
                                    var16.field1581 += var15.field1581;
                                    var16.field1574 += var15.field1574;
                                    var16.field1576 += var15.field1576;
                                    var16.field1577 += var15.field1577;
                                    var17.field1581 += var10.field1581;
                                    var17.field1574 += var10.field1574;
                                    var17.field1576 += var10.field1576;
                                    var17.field1577 += var10.field1577;
                                    var6++;
                                    field1659[var9] = field1686;
                                    field1642[var14] = field1686;
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
        for (int var18 = 0; var18 < arg0.field1646; var18++) {
            if (field1659[arg0.field1647[var18]] == field1686 && field1659[arg0.field1648[var18]] == field1686 && field1659[arg0.field1652[var18]] == field1686) {
                if (arg0.field1650 == null) {
                    arg0.field1650 = new byte[arg0.field1646];
                }
                arg0.field1650[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1646; var19++) {
            if (field1642[arg1.field1647[var19]] == field1686 && field1642[arg1.field1648[var19]] == field1686 && field1642[arg1.field1652[var19]] == field1686) {
                if (arg1.field1650 == null) {
                    arg1.field1650 = new byte[arg1.field1646];
                }
                arg1.field1650[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cy.t(IIIII)Ldb;")
    public final class105 method2114(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2111();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class105 var8 = new class105();
        var8.field1758 = new int[this.field1646];
        var8.field1747 = new int[this.field1646];
        var8.field1793 = new int[this.field1646];
        if (this.field1684 > 0 && this.field1653 != null) {
            int[] var9 = new int[this.field1684];
            for (int var10 = 0; var10 < this.field1646; var10++) {
                if (this.field1653[var10] != -1) {
                    var9[this.field1653[var10] & 0xFF]++;
                }
            }
            var8.field1810 = 0;
            for (int var11 = 0; var11 < this.field1684; var11++) {
                if (var9[var11] > 0 && this.field1658[var11] == 0) {
                    var8.field1810++;
                }
            }
            var8.field1806 = new int[var8.field1810];
            var8.field1768 = new int[var8.field1810];
            var8.field1769 = new int[var8.field1810];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1684; var13++) {
                if (var9[var13] > 0 && this.field1658[var13] == 0) {
                    var8.field1806[var12] = this.field1661[var13] & 0xFFFF;
                    var8.field1768[var12] = this.field1660[var13] & 0xFFFF;
                    var8.field1769[var12] = this.field1682[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1773 = new byte[this.field1646];
            for (int var14 = 0; var14 < this.field1646; var14++) {
                if (this.field1653[var14] == -1) {
                    var8.field1773[var14] = -1;
                } else {
                    var8.field1773[var14] = (byte) var9[this.field1653[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1646; var15++) {
            byte var16;
            if (this.field1650 == null) {
                var16 = 0;
            } else {
                var16 = this.field1650[var15];
            }
            byte var17;
            if (this.field1668 == null) {
                var17 = 0;
            } else {
                var17 = this.field1668[var15];
            }
            short var18;
            if (this.field1655 == null) {
                var18 = -1;
            } else {
                var18 = this.field1655[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1654[var15] & 0xFFFF;
                    class96 var20;
                    if (this.field1643 == null || this.field1643[this.field1647[var15]] == null) {
                        var20 = this.field1680[this.field1647[var15]];
                    } else {
                        var20 = this.field1643[this.field1647[var15]];
                    }
                    int var21 = (var20.field1576 * arg4 + var20.field1581 * arg2 + var20.field1574 * arg3) / (var20.field1577 * var7) + arg0;
                    var8.field1758[var15] = method2100(var19, var21);
                    class96 var22;
                    if (this.field1643 == null || this.field1643[this.field1648[var15]] == null) {
                        var22 = this.field1680[this.field1648[var15]];
                    } else {
                        var22 = this.field1643[this.field1648[var15]];
                    }
                    int var23 = (var22.field1576 * arg4 + var22.field1581 * arg2 + var22.field1574 * arg3) / (var22.field1577 * var7) + arg0;
                    var8.field1747[var15] = method2100(var19, var23);
                    class96 var24;
                    if (this.field1643 == null || this.field1643[this.field1652[var15]] == null) {
                        var24 = this.field1680[this.field1652[var15]];
                    } else {
                        var24 = this.field1643[this.field1652[var15]];
                    }
                    int var25 = (var24.field1576 * arg4 + var24.field1581 * arg2 + var24.field1574 * arg3) / (var24.field1577 * var7) + arg0;
                    var8.field1793[var15] = method2100(var19, var25);
                } else if (var16 == 1) {
                    class84 var26 = this.field1673[var15];
                    int var27 = (var26.field1399 * arg4 + var26.field1406 * arg2 + var26.field1398 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1758[var15] = method2100(this.field1654[var15] & 0xFFFF, var27);
                    var8.field1793[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1758[var15] = 128;
                    var8.field1793[var15] = -1;
                } else {
                    var8.field1793[var15] = -2;
                }
            } else if (var16 == 0) {
                class96 var28;
                if (this.field1643 == null || this.field1643[this.field1647[var15]] == null) {
                    var28 = this.field1680[this.field1647[var15]];
                } else {
                    var28 = this.field1643[this.field1647[var15]];
                }
                int var29 = (var28.field1576 * arg4 + var28.field1581 * arg2 + var28.field1574 * arg3) / (var28.field1577 * var7) + arg0;
                var8.field1758[var15] = method2116(var29);
                class96 var30;
                if (this.field1643 == null || this.field1643[this.field1648[var15]] == null) {
                    var30 = this.field1680[this.field1648[var15]];
                } else {
                    var30 = this.field1643[this.field1648[var15]];
                }
                int var31 = (var30.field1576 * arg4 + var30.field1581 * arg2 + var30.field1574 * arg3) / (var30.field1577 * var7) + arg0;
                var8.field1747[var15] = method2116(var31);
                class96 var32;
                if (this.field1643 == null || this.field1643[this.field1652[var15]] == null) {
                    var32 = this.field1680[this.field1652[var15]];
                } else {
                    var32 = this.field1643[this.field1652[var15]];
                }
                int var33 = (var32.field1576 * arg4 + var32.field1581 * arg2 + var32.field1574 * arg3) / (var32.field1577 * var7) + arg0;
                var8.field1793[var15] = method2116(var33);
            } else if (var16 == 1) {
                class84 var34 = this.field1673[var15];
                int var35 = (var34.field1399 * arg4 + var34.field1406 * arg2 + var34.field1398 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1758[var15] = method2116(var35);
                var8.field1793[var15] = -1;
            } else {
                var8.field1793[var15] = -2;
            }
        }
        this.method2160();
        var8.field1750 = this.field1657;
        var8.field1751 = this.field1649;
        var8.field1752 = this.field1644;
        var8.field1753 = this.field1664;
        var8.field1811 = this.field1646;
        var8.field1760 = this.field1647;
        var8.field1756 = this.field1648;
        var8.field1757 = this.field1652;
        var8.field1789 = this.field1651;
        var8.field1762 = this.field1668;
        var8.field1761 = this.field1656;
        var8.field1778 = this.field1671;
        var8.field1771 = this.field1672;
        var8.field1764 = this.field1655;
        return var8;
    }

    @ObfuscatedName("cy.aq(II)I")
    public static final int method2100(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cy.an(I)I")
    public static final int method2116(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
