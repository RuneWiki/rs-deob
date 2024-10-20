package deob;

@ObfuscatedName("ck")
public class class101 extends class94 {

    @ObfuscatedName("ck.a")
    public int field1648 = 0;

    @ObfuscatedName("ck.r")
    public int[] field1646;

    @ObfuscatedName("ck.u")
    public int[] field1680;

    @ObfuscatedName("ck.t")
    public int[] field1666;

    @ObfuscatedName("ck.k")
    public int field1649 = 0;

    @ObfuscatedName("ck.x")
    public int[] field1670;

    @ObfuscatedName("ck.v")
    public int[] field1673;

    @ObfuscatedName("ck.g")
    public int[] field1647;

    @ObfuscatedName("ck.n")
    public byte[] field1653;

    @ObfuscatedName("ck.q")
    public byte[] field1654;

    @ObfuscatedName("ck.i")
    public byte[] field1683;

    @ObfuscatedName("ck.p")
    public byte[] field1656;

    @ObfuscatedName("ck.e")
    public short[] field1657;

    @ObfuscatedName("ck.o")
    public short[] field1658;

    @ObfuscatedName("ck.j")
    public byte field1659 = 0;

    @ObfuscatedName("ck.s")
    public int field1678;

    @ObfuscatedName("ck.b")
    public byte[] field1660;

    @ObfuscatedName("ck.c")
    public short[] field1662;

    @ObfuscatedName("ck.m")
    public short[] field1663;

    @ObfuscatedName("ck.z")
    public short[] field1664;

    @ObfuscatedName("ck.h")
    public short[] field1665;

    @ObfuscatedName("ck.f")
    public short[] field1645;

    @ObfuscatedName("ck.w")
    public short[] field1667;

    @ObfuscatedName("ck.l")
    public short[] field1675;

    @ObfuscatedName("ck.d")
    public short[] field1669;

    @ObfuscatedName("ck.y")
    public short[] field1652;

    @ObfuscatedName("ck.ah")
    public byte[] field1671;

    @ObfuscatedName("ck.ad")
    public int[] field1672;

    @ObfuscatedName("ck.au")
    public int[] field1668;

    @ObfuscatedName("ck.as")
    public int[][] field1674;

    @ObfuscatedName("ck.ag")
    public int[][] field1686;

    @ObfuscatedName("ck.ab")
    public class92[] field1676;

    @ObfuscatedName("ck.aq")
    public class91[] field1651;

    @ObfuscatedName("ck.af")
    public class91[] field1677;

    @ObfuscatedName("ck.ay")
    public short field1679;

    @ObfuscatedName("ck.ax")
    public short field1688;

    @ObfuscatedName("ck.aa")
    public boolean field1681 = false;

    @ObfuscatedName("ck.ak")
    public int field1682;

    @ObfuscatedName("ck.ac")
    public int field1685;

    @ObfuscatedName("ck.aj")
    public int field1684;

    @ObfuscatedName("ck.av")
    public int field1661;

    @ObfuscatedName("ck.al")
    public int field1687;

    @ObfuscatedName("ck.an")
    public static int[] field1650 = new int[10000];

    @ObfuscatedName("ck.ap")
    public static int[] field1655 = new int[10000];

    @ObfuscatedName("ck.at")
    public static int field1689 = 0;

    @ObfuscatedName("ck.ae")
    public static int[] field1690 = class104.field1753;

    @ObfuscatedName("ck.aw")
    public static int[] field1691 = class104.field1754;

    public class101() {
    }

    @ObfuscatedName("ck.a(Lev;II)Lck;")
    public static class101 method1993(class152 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2943(arg1, arg2);
        return var3 == null ? null : new class101(var3);
    }

    public class101(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1995(arg0);
        } else {
            this.method2004(arg0);
        }
    }

    @ObfuscatedName("ck.u([B)V")
    public void method1995(byte[] arg0) {
        class126 var2 = new class126(arg0);
        class126 var3 = new class126(arg0);
        class126 var4 = new class126(arg0);
        class126 var5 = new class126(arg0);
        class126 var6 = new class126(arg0);
        class126 var7 = new class126(arg0);
        class126 var8 = new class126(arg0);
        var2.field2016 = arg0.length - 23;
        int var9 = var2.method2373();
        int var10 = var2.method2373();
        int var11 = var2.method2481();
        int var12 = var2.method2481();
        int var13 = var2.method2481();
        int var14 = var2.method2481();
        int var15 = var2.method2481();
        int var16 = var2.method2481();
        int var17 = var2.method2481();
        int var18 = var2.method2373();
        int var19 = var2.method2373();
        int var20 = var2.method2373();
        int var21 = var2.method2373();
        int var22 = var2.method2373();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1660 = new byte[var11];
            var2.field2016 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1660[var26] = var2.method2379();
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
        this.field1648 = var9;
        this.field1649 = var10;
        this.field1678 = var11;
        this.field1646 = new int[var9];
        this.field1680 = new int[var9];
        this.field1666 = new int[var9];
        this.field1670 = new int[var10];
        this.field1673 = new int[var10];
        this.field1647 = new int[var10];
        if (var17 == 1) {
            this.field1672 = new int[var9];
        }
        if (var12 == 1) {
            this.field1653 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1654 = new byte[var10];
        } else {
            this.field1659 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1683 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1668 = new int[var10];
        }
        if (var16 == 1) {
            this.field1658 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1656 = new byte[var10];
        }
        this.field1657 = new short[var10];
        if (var11 > 0) {
            this.field1662 = new short[var11];
            this.field1663 = new short[var11];
            this.field1664 = new short[var11];
            if (var24 > 0) {
                this.field1665 = new short[var24];
                this.field1645 = new short[var24];
                this.field1667 = new short[var24];
                this.field1675 = new short[var24];
                this.field1671 = new byte[var24];
                this.field1669 = new short[var24];
            }
            if (var25 > 0) {
                this.field1652 = new short[var25];
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
            int var68 = var2.method2481();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2390();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2390();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2390();
            }
            this.field1646[var67] = var64 + var69;
            this.field1680[var67] = var65 + var70;
            this.field1666[var67] = var66 + var71;
            var64 = this.field1646[var67];
            var65 = this.field1680[var67];
            var66 = this.field1666[var67];
            if (var17 == 1) {
                this.field1672[var67] = var6.method2481();
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
            this.field1657[var72] = (short) var2.method2373();
            if (var12 == 1) {
                this.field1653[var72] = var3.method2379();
            }
            if (var13 == 255) {
                this.field1654[var72] = var4.method2379();
            }
            if (var14 == 1) {
                this.field1683[var72] = var5.method2379();
            }
            if (var15 == 1) {
                this.field1668[var72] = var6.method2481();
            }
            if (var16 == 1) {
                this.field1658[var72] = (short) (var7.method2373() - 1);
            }
            if (this.field1656 != null && this.field1658[var72] != -1) {
                this.field1656[var72] = (byte) (var8.method2481() - 1);
            }
        }
        var2.field2016 = var33;
        var3.field2016 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2481();
            if (var78 == 1) {
                var73 = var2.method2390() + var76;
                var74 = var2.method2390() + var73;
                var75 = var2.method2390() + var74;
                var76 = var75;
                this.field1670[var77] = var73;
                this.field1673[var77] = var74;
                this.field1647[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2390() + var76;
                var76 = var75;
                this.field1670[var77] = var73;
                this.field1673[var77] = var74;
                this.field1647[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2390() + var76;
                var76 = var75;
                this.field1670[var77] = var73;
                this.field1673[var77] = var74;
                this.field1647[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2390() + var76;
                var76 = var75;
                this.field1670[var77] = var73;
                this.field1673[var77] = var81;
                this.field1647[var77] = var75;
            }
        }
        var2.field2016 = var50;
        var3.field2016 = var52;
        var4.field2016 = var54;
        var5.field2016 = var56;
        var6.field2016 = var58;
        var7.field2016 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1660[var82] & 0xFF;
            if (var83 == 0) {
                this.field1662[var82] = (short) var2.method2373();
                this.field1663[var82] = (short) var2.method2373();
                this.field1664[var82] = (short) var2.method2373();
            }
            if (var83 == 1) {
                this.field1662[var82] = (short) var3.method2373();
                this.field1663[var82] = (short) var3.method2373();
                this.field1664[var82] = (short) var3.method2373();
                this.field1665[var82] = (short) var4.method2373();
                this.field1645[var82] = (short) var4.method2373();
                this.field1667[var82] = (short) var4.method2373();
                this.field1675[var82] = (short) var5.method2373();
                this.field1671[var82] = var6.method2379();
                this.field1669[var82] = (short) var7.method2373();
            }
            if (var83 == 2) {
                this.field1662[var82] = (short) var3.method2373();
                this.field1663[var82] = (short) var3.method2373();
                this.field1664[var82] = (short) var3.method2373();
                this.field1665[var82] = (short) var4.method2373();
                this.field1645[var82] = (short) var4.method2373();
                this.field1667[var82] = (short) var4.method2373();
                this.field1675[var82] = (short) var5.method2373();
                this.field1671[var82] = var6.method2379();
                this.field1669[var82] = (short) var7.method2373();
                this.field1652[var82] = (short) var7.method2373();
            }
            if (var83 == 3) {
                this.field1662[var82] = (short) var3.method2373();
                this.field1663[var82] = (short) var3.method2373();
                this.field1664[var82] = (short) var3.method2373();
                this.field1665[var82] = (short) var4.method2373();
                this.field1645[var82] = (short) var4.method2373();
                this.field1667[var82] = (short) var4.method2373();
                this.field1675[var82] = (short) var5.method2373();
                this.field1671[var82] = var6.method2379();
                this.field1669[var82] = (short) var7.method2373();
            }
        }
        var2.field2016 = var62;
        int var84 = var2.method2481();
        if (var84 == 0) {
            return;
        }
        new class103();
        var2.method2373();
        var2.method2373();
        var2.method2373();
        var2.method2383();
    }

    @ObfuscatedName("ck.t([B)V")
    public void method2004(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class126 var4 = new class126(arg0);
        class126 var5 = new class126(arg0);
        class126 var6 = new class126(arg0);
        class126 var7 = new class126(arg0);
        class126 var8 = new class126(arg0);
        var4.field2016 = arg0.length - 18;
        int var9 = var4.method2373();
        int var10 = var4.method2373();
        int var11 = var4.method2481();
        int var12 = var4.method2481();
        int var13 = var4.method2481();
        int var14 = var4.method2481();
        int var15 = var4.method2481();
        int var16 = var4.method2481();
        int var17 = var4.method2373();
        int var18 = var4.method2373();
        int var19 = var4.method2373();
        int var20 = var4.method2373();
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
        this.field1648 = var9;
        this.field1649 = var10;
        this.field1678 = var11;
        this.field1646 = new int[var9];
        this.field1680 = new int[var9];
        this.field1666 = new int[var9];
        this.field1670 = new int[var10];
        this.field1673 = new int[var10];
        this.field1647 = new int[var10];
        if (var11 > 0) {
            this.field1660 = new byte[var11];
            this.field1662 = new short[var11];
            this.field1663 = new short[var11];
            this.field1664 = new short[var11];
        }
        if (var16 == 1) {
            this.field1672 = new int[var9];
        }
        if (var12 == 1) {
            this.field1653 = new byte[var10];
            this.field1656 = new byte[var10];
            this.field1658 = new short[var10];
        }
        if (var13 == 255) {
            this.field1654 = new byte[var10];
        } else {
            this.field1659 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1683 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1668 = new int[var10];
        }
        this.field1657 = new short[var10];
        var4.field2016 = var21;
        var5.field2016 = var36;
        var6.field2016 = var38;
        var7.field2016 = var40;
        var8.field2016 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2481();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2390();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2390();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2390();
            }
            this.field1646[var46] = var43 + var48;
            this.field1680[var46] = var44 + var49;
            this.field1666[var46] = var45 + var50;
            var43 = this.field1646[var46];
            var44 = this.field1680[var46];
            var45 = this.field1666[var46];
            if (var16 == 1) {
                this.field1672[var46] = var8.method2481();
            }
        }
        var4.field2016 = var32;
        var5.field2016 = var28;
        var6.field2016 = var26;
        var7.field2016 = var30;
        var8.field2016 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1657[var51] = (short) var4.method2373();
            if (var12 == 1) {
                int var52 = var5.method2481();
                if ((var52 & 0x1) == 1) {
                    this.field1653[var51] = 1;
                    var2 = true;
                } else {
                    this.field1653[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1656[var51] = (byte) (var52 >> 2);
                    this.field1658[var51] = this.field1657[var51];
                    this.field1657[var51] = 127;
                    if (this.field1658[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1656[var51] = -1;
                    this.field1658[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1654[var51] = var6.method2379();
            }
            if (var14 == 1) {
                this.field1683[var51] = var7.method2379();
            }
            if (var15 == 1) {
                this.field1668[var51] = var8.method2481();
            }
        }
        var4.field2016 = var25;
        var5.field2016 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2481();
            if (var58 == 1) {
                var53 = var4.method2390() + var56;
                var54 = var4.method2390() + var53;
                var55 = var4.method2390() + var54;
                var56 = var55;
                this.field1670[var57] = var53;
                this.field1673[var57] = var54;
                this.field1647[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2390() + var56;
                var56 = var55;
                this.field1670[var57] = var53;
                this.field1673[var57] = var54;
                this.field1647[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2390() + var56;
                var56 = var55;
                this.field1670[var57] = var53;
                this.field1673[var57] = var54;
                this.field1647[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2390() + var56;
                var56 = var55;
                this.field1670[var57] = var53;
                this.field1673[var57] = var61;
                this.field1647[var57] = var55;
            }
        }
        var4.field2016 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1660[var62] = 0;
            this.field1662[var62] = (short) var4.method2373();
            this.field1663[var62] = (short) var4.method2373();
            this.field1664[var62] = (short) var4.method2373();
        }
        if (this.field1656 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1656[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1662[var65] & 0xFFFF) == this.field1670[var64] && (this.field1663[var65] & 0xFFFF) == this.field1673[var64] && (this.field1664[var65] & 0xFFFF) == this.field1647[var64]) {
                        this.field1656[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1656 = null;
            }
        }
        if (!var3) {
            this.field1658 = null;
        }
        if (!var2) {
            this.field1653 = null;
        }
    }

    public class101(class101[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1648 = 0;
        this.field1649 = 0;
        this.field1678 = 0;
        this.field1659 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class101 var10 = arg0[var9];
            if (var10 != null) {
                this.field1648 += var10.field1648;
                this.field1649 += var10.field1649;
                this.field1678 += var10.field1678;
                if (var10.field1654 == null) {
                    if (this.field1659 == -1) {
                        this.field1659 = var10.field1659;
                    }
                    if (this.field1659 != var10.field1659) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1653 != null;
                var5 |= var10.field1683 != null;
                var6 |= var10.field1668 != null;
                var7 |= var10.field1658 != null;
                var8 |= var10.field1656 != null;
            }
        }
        this.field1646 = new int[this.field1648];
        this.field1680 = new int[this.field1648];
        this.field1666 = new int[this.field1648];
        this.field1672 = new int[this.field1648];
        this.field1670 = new int[this.field1649];
        this.field1673 = new int[this.field1649];
        this.field1647 = new int[this.field1649];
        if (var3) {
            this.field1653 = new byte[this.field1649];
        }
        if (var4) {
            this.field1654 = new byte[this.field1649];
        }
        if (var5) {
            this.field1683 = new byte[this.field1649];
        }
        if (var6) {
            this.field1668 = new int[this.field1649];
        }
        if (var7) {
            this.field1658 = new short[this.field1649];
        }
        if (var8) {
            this.field1656 = new byte[this.field1649];
        }
        this.field1657 = new short[this.field1649];
        if (this.field1678 > 0) {
            this.field1660 = new byte[this.field1678];
            this.field1662 = new short[this.field1678];
            this.field1663 = new short[this.field1678];
            this.field1664 = new short[this.field1678];
            this.field1665 = new short[this.field1678];
            this.field1645 = new short[this.field1678];
            this.field1667 = new short[this.field1678];
            this.field1675 = new short[this.field1678];
            this.field1671 = new byte[this.field1678];
            this.field1669 = new short[this.field1678];
            this.field1652 = new short[this.field1678];
        }
        this.field1648 = 0;
        this.field1649 = 0;
        this.field1678 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class101 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1649; var13++) {
                    if (var3 && var12.field1653 != null) {
                        this.field1653[this.field1649] = var12.field1653[var13];
                    }
                    if (var4) {
                        if (var12.field1654 == null) {
                            this.field1654[this.field1649] = var12.field1659;
                        } else {
                            this.field1654[this.field1649] = var12.field1654[var13];
                        }
                    }
                    if (var5 && var12.field1683 != null) {
                        this.field1683[this.field1649] = var12.field1683[var13];
                    }
                    if (var6 && var12.field1668 != null) {
                        this.field1668[this.field1649] = var12.field1668[var13];
                    }
                    if (var7) {
                        if (var12.field1658 == null) {
                            this.field1658[this.field1649] = -1;
                        } else {
                            this.field1658[this.field1649] = var12.field1658[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1656 == null || var12.field1656[var13] == -1) {
                            this.field1656[this.field1649] = -1;
                        } else {
                            this.field1656[this.field1649] = (byte) (var12.field1656[var13] + this.field1678);
                        }
                    }
                    this.field1657[this.field1649] = var12.field1657[var13];
                    this.field1670[this.field1649] = this.method1997(var12, var12.field1670[var13]);
                    this.field1673[this.field1649] = this.method1997(var12, var12.field1673[var13]);
                    this.field1647[this.field1649] = this.method1997(var12, var12.field1647[var13]);
                    this.field1649++;
                }
                for (int var14 = 0; var14 < var12.field1678; var14++) {
                    byte var15 = this.field1660[this.field1678] = var12.field1660[var14];
                    if (var15 == 0) {
                        this.field1662[this.field1678] = (short) this.method1997(var12, var12.field1662[var14]);
                        this.field1663[this.field1678] = (short) this.method1997(var12, var12.field1663[var14]);
                        this.field1664[this.field1678] = (short) this.method1997(var12, var12.field1664[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1662[this.field1678] = var12.field1662[var14];
                        this.field1663[this.field1678] = var12.field1663[var14];
                        this.field1664[this.field1678] = var12.field1664[var14];
                        this.field1665[this.field1678] = var12.field1665[var14];
                        this.field1645[this.field1678] = var12.field1645[var14];
                        this.field1667[this.field1678] = var12.field1667[var14];
                        this.field1675[this.field1678] = var12.field1675[var14];
                        this.field1671[this.field1678] = var12.field1671[var14];
                        this.field1669[this.field1678] = var12.field1669[var14];
                    }
                    if (var15 == 2) {
                        this.field1652[this.field1678] = var12.field1652[var14];
                    }
                    this.field1678++;
                }
            }
        }
    }

    @ObfuscatedName("ck.k(Lck;I)I")
    public final int method1997(class101 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1646[arg1];
        int var5 = arg0.field1680[arg1];
        int var6 = arg0.field1666[arg1];
        for (int var7 = 0; var7 < this.field1648; var7++) {
            if (this.field1646[var7] == var4 && this.field1680[var7] == var5 && this.field1666[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1646[this.field1648] = var4;
            this.field1680[this.field1648] = var5;
            this.field1666[this.field1648] = var6;
            if (arg0.field1672 != null) {
                this.field1672[this.field1648] = arg0.field1672[arg1];
            }
            var3 = this.field1648++;
        }
        return var3;
    }

    public class101(class101 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1648 = arg0.field1648;
        this.field1649 = arg0.field1649;
        this.field1678 = arg0.field1678;
        if (arg1) {
            this.field1646 = arg0.field1646;
            this.field1680 = arg0.field1680;
            this.field1666 = arg0.field1666;
        } else {
            this.field1646 = new int[this.field1648];
            this.field1680 = new int[this.field1648];
            this.field1666 = new int[this.field1648];
            for (int var6 = 0; var6 < this.field1648; var6++) {
                this.field1646[var6] = arg0.field1646[var6];
                this.field1680[var6] = arg0.field1680[var6];
                this.field1666[var6] = arg0.field1666[var6];
            }
        }
        if (arg2) {
            this.field1657 = arg0.field1657;
        } else {
            this.field1657 = new short[this.field1649];
            for (int var7 = 0; var7 < this.field1649; var7++) {
                this.field1657[var7] = arg0.field1657[var7];
            }
        }
        if (arg3 || arg0.field1658 == null) {
            this.field1658 = arg0.field1658;
        } else {
            this.field1658 = new short[this.field1649];
            for (int var8 = 0; var8 < this.field1649; var8++) {
                this.field1658[var8] = arg0.field1658[var8];
            }
        }
        if (arg4) {
            this.field1683 = arg0.field1683;
        } else {
            this.field1683 = new byte[this.field1649];
            if (arg0.field1683 == null) {
                for (int var9 = 0; var9 < this.field1649; var9++) {
                    this.field1683[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1649; var10++) {
                    this.field1683[var10] = arg0.field1683[var10];
                }
            }
        }
        this.field1670 = arg0.field1670;
        this.field1673 = arg0.field1673;
        this.field1647 = arg0.field1647;
        this.field1653 = arg0.field1653;
        this.field1654 = arg0.field1654;
        this.field1656 = arg0.field1656;
        this.field1659 = arg0.field1659;
        this.field1660 = arg0.field1660;
        this.field1662 = arg0.field1662;
        this.field1663 = arg0.field1663;
        this.field1664 = arg0.field1664;
        this.field1665 = arg0.field1665;
        this.field1645 = arg0.field1645;
        this.field1667 = arg0.field1667;
        this.field1675 = arg0.field1675;
        this.field1671 = arg0.field1671;
        this.field1669 = arg0.field1669;
        this.field1652 = arg0.field1652;
        this.field1672 = arg0.field1672;
        this.field1668 = arg0.field1668;
        this.field1674 = arg0.field1674;
        this.field1686 = arg0.field1686;
        this.field1651 = arg0.field1651;
        this.field1676 = arg0.field1676;
        this.field1677 = arg0.field1677;
        this.field1679 = arg0.field1679;
        this.field1688 = arg0.field1688;
    }

    @ObfuscatedName("ck.q()Lck;")
    public class101 method1998() {
        class101 var1 = new class101();
        if (this.field1653 != null) {
            var1.field1653 = new byte[this.field1649];
            for (int var2 = 0; var2 < this.field1649; var2++) {
                var1.field1653[var2] = this.field1653[var2];
            }
        }
        var1.field1648 = this.field1648;
        var1.field1649 = this.field1649;
        var1.field1678 = this.field1678;
        var1.field1646 = this.field1646;
        var1.field1680 = this.field1680;
        var1.field1666 = this.field1666;
        var1.field1670 = this.field1670;
        var1.field1673 = this.field1673;
        var1.field1647 = this.field1647;
        var1.field1654 = this.field1654;
        var1.field1683 = this.field1683;
        var1.field1656 = this.field1656;
        var1.field1657 = this.field1657;
        var1.field1658 = this.field1658;
        var1.field1659 = this.field1659;
        var1.field1660 = this.field1660;
        var1.field1662 = this.field1662;
        var1.field1663 = this.field1663;
        var1.field1664 = this.field1664;
        var1.field1665 = this.field1665;
        var1.field1645 = this.field1645;
        var1.field1667 = this.field1667;
        var1.field1675 = this.field1675;
        var1.field1671 = this.field1671;
        var1.field1669 = this.field1669;
        var1.field1652 = this.field1652;
        var1.field1672 = this.field1672;
        var1.field1668 = this.field1668;
        var1.field1674 = this.field1674;
        var1.field1686 = this.field1686;
        var1.field1651 = this.field1651;
        var1.field1676 = this.field1676;
        var1.field1679 = this.field1679;
        var1.field1688 = this.field1688;
        return var1;
    }

    @ObfuscatedName("ck.i([[IIIIZI)Lck;")
    public class101 method1992(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2012();
        int var7 = this.field1685 + arg1;
        int var8 = this.field1684 + arg1;
        int var9 = this.field1687 + arg3;
        int var10 = this.field1661 + arg3;
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
            var15.field1648 = this.field1648;
            var15.field1649 = this.field1649;
            var15.field1678 = this.field1678;
            var15.field1646 = this.field1646;
            var15.field1666 = this.field1666;
            var15.field1670 = this.field1670;
            var15.field1673 = this.field1673;
            var15.field1647 = this.field1647;
            var15.field1653 = this.field1653;
            var15.field1654 = this.field1654;
            var15.field1683 = this.field1683;
            var15.field1656 = this.field1656;
            var15.field1657 = this.field1657;
            var15.field1658 = this.field1658;
            var15.field1659 = this.field1659;
            var15.field1660 = this.field1660;
            var15.field1662 = this.field1662;
            var15.field1663 = this.field1663;
            var15.field1664 = this.field1664;
            var15.field1665 = this.field1665;
            var15.field1645 = this.field1645;
            var15.field1667 = this.field1667;
            var15.field1675 = this.field1675;
            var15.field1671 = this.field1671;
            var15.field1669 = this.field1669;
            var15.field1652 = this.field1652;
            var15.field1672 = this.field1672;
            var15.field1668 = this.field1668;
            var15.field1674 = this.field1674;
            var15.field1686 = this.field1686;
            var15.field1679 = this.field1679;
            var15.field1688 = this.field1688;
            var15.field1680 = new int[var15.field1648];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1648; var16++) {
                int var17 = this.field1646[var16] + arg1;
                int var18 = this.field1666[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1680[var16] = this.field1680[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1648; var26++) {
                int var27 = (-this.field1680[var26] << 16) / this.field1518;
                if (var27 < arg5) {
                    int var28 = this.field1646[var26] + arg1;
                    int var29 = this.field1666[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1680[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1680[var26];
                }
            }
        }
        var15.method2011();
        return var15;
    }

    @ObfuscatedName("ck.p()V")
    public void method2000() {
        int var10002;
        if (this.field1672 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1648; var3++) {
                int var4 = this.field1672[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1674 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1674[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1648) {
                int var7 = this.field1672[var6];
                this.field1674[var7][var1[var7]++] = var6++;
            }
            this.field1672 = null;
        }
        if (this.field1668 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1649; var10++) {
            int var11 = this.field1668[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1686 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1686[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1649) {
            int var14 = this.field1668[var13];
            this.field1686[var14][var8[var14]++] = var13++;
        }
        this.field1668 = null;
    }

    @ObfuscatedName("ck.e()V")
    public void method2001() {
        for (int var1 = 0; var1 < this.field1648; var1++) {
            int var2 = this.field1646[var1];
            this.field1646[var1] = this.field1666[var1];
            this.field1666[var1] = -var2;
        }
        this.method2011();
    }

    @ObfuscatedName("ck.o()V")
    public void method2002() {
        for (int var1 = 0; var1 < this.field1648; var1++) {
            this.field1646[var1] = -this.field1646[var1];
            this.field1666[var1] = -this.field1666[var1];
        }
        this.method2011();
    }

    @ObfuscatedName("ck.j()V")
    public void method2003() {
        for (int var1 = 0; var1 < this.field1648; var1++) {
            int var2 = this.field1666[var1];
            this.field1666[var1] = this.field1646[var1];
            this.field1646[var1] = -var2;
        }
        this.method2011();
    }

    @ObfuscatedName("ck.s(I)V")
    public void method2033(int arg0) {
        int var2 = field1690[arg0];
        int var3 = field1691[arg0];
        for (int var4 = 0; var4 < this.field1648; var4++) {
            int var5 = this.field1666[var4] * var2 + this.field1646[var4] * var3 >> 16;
            this.field1666[var4] = this.field1666[var4] * var3 - this.field1646[var4] * var2 >> 16;
            this.field1646[var4] = var5;
        }
        this.method2011();
    }

    @ObfuscatedName("ck.b(III)V")
    public void method2036(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1648; var4++) {
            this.field1646[var4] += arg0;
            this.field1680[var4] += arg1;
            this.field1666[var4] += arg2;
        }
        this.method2011();
    }

    @ObfuscatedName("ck.c(SS)V")
    public void method2006(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1649; var3++) {
            if (this.field1657[var3] == arg0) {
                this.field1657[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ck.m(SS)V")
    public void method2007(short arg0, short arg1) {
        if (this.field1658 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1649; var3++) {
            if (this.field1658[var3] == arg0) {
                this.field1658[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ck.z()V")
    public void method2008() {
        for (int var1 = 0; var1 < this.field1648; var1++) {
            this.field1666[var1] = -this.field1666[var1];
        }
        for (int var2 = 0; var2 < this.field1649; var2++) {
            int var3 = this.field1670[var2];
            this.field1670[var2] = this.field1647[var2];
            this.field1647[var2] = var3;
        }
        this.method2011();
    }

    @ObfuscatedName("ck.h(III)V")
    public void method2009(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1648; var4++) {
            this.field1646[var4] = this.field1646[var4] * arg0 / 128;
            this.field1680[var4] = this.field1680[var4] * arg1 / 128;
            this.field1666[var4] = this.field1666[var4] * arg2 / 128;
        }
        this.method2011();
    }

    @ObfuscatedName("ck.f()V")
    public void method2052() {
        if (this.field1651 != null) {
            return;
        }
        this.field1651 = new class91[this.field1648];
        for (int var1 = 0; var1 < this.field1648; var1++) {
            this.field1651[var1] = new class91();
        }
        for (int var2 = 0; var2 < this.field1649; var2++) {
            int var3 = this.field1670[var2];
            int var4 = this.field1673[var2];
            int var5 = this.field1647[var2];
            int var6 = this.field1646[var4] - this.field1646[var3];
            int var7 = this.field1680[var4] - this.field1680[var3];
            int var8 = this.field1666[var4] - this.field1666[var3];
            int var9 = this.field1646[var5] - this.field1646[var3];
            int var10 = this.field1680[var5] - this.field1680[var3];
            int var11 = this.field1666[var5] - this.field1666[var3];
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
            if (this.field1653 == null) {
                var19 = 0;
            } else {
                var19 = this.field1653[var2];
            }
            if (var19 == 0) {
                class91 var20 = this.field1651[var3];
                var20.field1484 += var16;
                var20.field1485 += var17;
                var20.field1486 += var18;
                var20.field1487++;
                class91 var21 = this.field1651[var4];
                var21.field1484 += var16;
                var21.field1485 += var17;
                var21.field1486 += var18;
                var21.field1487++;
                class91 var22 = this.field1651[var5];
                var22.field1484 += var16;
                var22.field1485 += var17;
                var22.field1486 += var18;
                var22.field1487++;
            } else if (var19 == 1) {
                if (this.field1676 == null) {
                    this.field1676 = new class92[this.field1649];
                }
                class92 var23 = this.field1676[var2] = new class92();
                var23.field1494 = var16;
                var23.field1490 = var17;
                var23.field1491 = var18;
            }
        }
    }

    @ObfuscatedName("ck.w()V")
    public void method2011() {
        this.field1651 = null;
        this.field1677 = null;
        this.field1676 = null;
        this.field1681 = false;
    }

    @ObfuscatedName("ck.l()V")
    public void method2012() {
        if (this.field1681) {
            return;
        }
        this.field1518 = 0;
        this.field1682 = 0;
        this.field1685 = 999999;
        this.field1684 = -999999;
        this.field1661 = -99999;
        this.field1687 = 99999;
        for (int var1 = 0; var1 < this.field1648; var1++) {
            int var2 = this.field1646[var1];
            int var3 = this.field1680[var1];
            int var4 = this.field1666[var1];
            if (var2 < this.field1685) {
                this.field1685 = var2;
            }
            if (var2 > this.field1684) {
                this.field1684 = var2;
            }
            if (var4 < this.field1687) {
                this.field1687 = var4;
            }
            if (var4 > this.field1661) {
                this.field1661 = var4;
            }
            if (-var3 > this.field1518) {
                this.field1518 = -var3;
            }
            if (var3 > this.field1682) {
                this.field1682 = var3;
            }
        }
        this.field1681 = true;
    }

    @ObfuscatedName("ck.d(Lck;Lck;IIIZ)V")
    public static void method2013(class101 arg0, class101 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2012();
        arg0.method2052();
        arg1.method2012();
        arg1.method2052();
        field1689++;
        int var6 = 0;
        int[] var7 = arg1.field1646;
        int var8 = arg1.field1648;
        for (int var9 = 0; var9 < arg0.field1648; var9++) {
            class91 var10 = arg0.field1651[var9];
            if (var10.field1487 != 0) {
                int var11 = arg0.field1680[var9] - arg3;
                if (var11 <= arg1.field1682) {
                    int var12 = arg0.field1646[var9] - arg2;
                    if (var12 >= arg1.field1685 && var12 <= arg1.field1684) {
                        int var13 = arg0.field1666[var9] - arg4;
                        if (var13 >= arg1.field1687 && var13 <= arg1.field1661) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class91 var15 = arg1.field1651[var14];
                                if (var7[var14] == var12 && arg1.field1666[var14] == var13 && arg1.field1680[var14] == var11 && var15.field1487 != 0) {
                                    if (arg0.field1677 == null) {
                                        arg0.field1677 = new class91[arg0.field1648];
                                    }
                                    if (arg1.field1677 == null) {
                                        arg1.field1677 = new class91[var8];
                                    }
                                    class91 var16 = arg0.field1677[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1677[var9] = new class91(var10);
                                    }
                                    class91 var17 = arg1.field1677[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1677[var14] = new class91(var15);
                                    }
                                    var16.field1484 += var15.field1484;
                                    var16.field1485 += var15.field1485;
                                    var16.field1486 += var15.field1486;
                                    var16.field1487 += var15.field1487;
                                    var17.field1484 += var10.field1484;
                                    var17.field1485 += var10.field1485;
                                    var17.field1486 += var10.field1486;
                                    var17.field1487 += var10.field1487;
                                    var6++;
                                    field1650[var9] = field1689;
                                    field1655[var14] = field1689;
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
        for (int var18 = 0; var18 < arg0.field1649; var18++) {
            if (field1650[arg0.field1670[var18]] == field1689 && field1650[arg0.field1673[var18]] == field1689 && field1650[arg0.field1647[var18]] == field1689) {
                if (arg0.field1653 == null) {
                    arg0.field1653 = new byte[arg0.field1649];
                }
                arg0.field1653[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1649; var19++) {
            if (field1655[arg1.field1670[var19]] == field1689 && field1655[arg1.field1673[var19]] == field1689 && field1655[arg1.field1647[var19]] == field1689) {
                if (arg1.field1653 == null) {
                    arg1.field1653 = new byte[arg1.field1649];
                }
                arg1.field1653[var19] = 2;
            }
        }
    }

    @ObfuscatedName("ck.y(IIIII)Ldw;")
    public final class112 method2014(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2052();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class112 var8 = new class112();
        var8.field1845 = new int[this.field1649];
        var8.field1846 = new int[this.field1649];
        var8.field1847 = new int[this.field1649];
        if (this.field1678 > 0 && this.field1656 != null) {
            int[] var9 = new int[this.field1678];
            for (int var10 = 0; var10 < this.field1649; var10++) {
                if (this.field1656[var10] != -1) {
                    var9[this.field1656[var10] & 0xFF]++;
                }
            }
            var8.field1864 = 0;
            for (int var11 = 0; var11 < this.field1678; var11++) {
                if (var9[var11] > 0 && this.field1660[var11] == 0) {
                    var8.field1864++;
                }
            }
            var8.field1854 = new int[var8.field1864];
            var8.field1833 = new int[var8.field1864];
            var8.field1856 = new int[var8.field1864];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1678; var13++) {
                if (var9[var13] > 0 && this.field1660[var13] == 0) {
                    var8.field1854[var12] = this.field1662[var13] & 0xFFFF;
                    var8.field1833[var12] = this.field1663[var13] & 0xFFFF;
                    var8.field1856[var12] = this.field1664[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1850 = new byte[this.field1649];
            for (int var14 = 0; var14 < this.field1649; var14++) {
                if (this.field1656[var14] == -1) {
                    var8.field1850[var14] = -1;
                } else {
                    var8.field1850[var14] = (byte) var9[this.field1656[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1649; var15++) {
            byte var16;
            if (this.field1653 == null) {
                var16 = 0;
            } else {
                var16 = this.field1653[var15];
            }
            byte var17;
            if (this.field1683 == null) {
                var17 = 0;
            } else {
                var17 = this.field1683[var15];
            }
            short var18;
            if (this.field1658 == null) {
                var18 = -1;
            } else {
                var18 = this.field1658[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1657[var15] & 0xFFFF;
                    class91 var20;
                    if (this.field1677 == null || this.field1677[this.field1670[var15]] == null) {
                        var20 = this.field1651[this.field1670[var15]];
                    } else {
                        var20 = this.field1677[this.field1670[var15]];
                    }
                    int var21 = (var20.field1486 * arg4 + var20.field1485 * arg3 + var20.field1484 * arg2) / (var20.field1487 * var7) + arg0;
                    var8.field1845[var15] = method2005(var19, var21);
                    class91 var22;
                    if (this.field1677 == null || this.field1677[this.field1673[var15]] == null) {
                        var22 = this.field1651[this.field1673[var15]];
                    } else {
                        var22 = this.field1677[this.field1673[var15]];
                    }
                    int var23 = (var22.field1486 * arg4 + var22.field1485 * arg3 + var22.field1484 * arg2) / (var22.field1487 * var7) + arg0;
                    var8.field1846[var15] = method2005(var19, var23);
                    class91 var24;
                    if (this.field1677 == null || this.field1677[this.field1647[var15]] == null) {
                        var24 = this.field1651[this.field1647[var15]];
                    } else {
                        var24 = this.field1677[this.field1647[var15]];
                    }
                    int var25 = (var24.field1486 * arg4 + var24.field1485 * arg3 + var24.field1484 * arg2) / (var24.field1487 * var7) + arg0;
                    var8.field1847[var15] = method2005(var19, var25);
                } else if (var16 == 1) {
                    class92 var26 = this.field1676[var15];
                    int var27 = (var26.field1491 * arg4 + var26.field1494 * arg2 + var26.field1490 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1845[var15] = method2005(this.field1657[var15] & 0xFFFF, var27);
                    var8.field1847[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1845[var15] = 128;
                    var8.field1847[var15] = -1;
                } else {
                    var8.field1847[var15] = -2;
                }
            } else if (var16 == 0) {
                class91 var28;
                if (this.field1677 == null || this.field1677[this.field1670[var15]] == null) {
                    var28 = this.field1651[this.field1670[var15]];
                } else {
                    var28 = this.field1677[this.field1670[var15]];
                }
                int var29 = (var28.field1486 * arg4 + var28.field1485 * arg3 + var28.field1484 * arg2) / (var28.field1487 * var7) + arg0;
                var8.field1845[var15] = method2016(var29);
                class91 var30;
                if (this.field1677 == null || this.field1677[this.field1673[var15]] == null) {
                    var30 = this.field1651[this.field1673[var15]];
                } else {
                    var30 = this.field1677[this.field1673[var15]];
                }
                int var31 = (var30.field1486 * arg4 + var30.field1485 * arg3 + var30.field1484 * arg2) / (var30.field1487 * var7) + arg0;
                var8.field1846[var15] = method2016(var31);
                class91 var32;
                if (this.field1677 == null || this.field1677[this.field1647[var15]] == null) {
                    var32 = this.field1651[this.field1647[var15]];
                } else {
                    var32 = this.field1677[this.field1647[var15]];
                }
                int var33 = (var32.field1486 * arg4 + var32.field1485 * arg3 + var32.field1484 * arg2) / (var32.field1487 * var7) + arg0;
                var8.field1847[var15] = method2016(var33);
            } else if (var16 == 1) {
                class92 var34 = this.field1676[var15];
                int var35 = (var34.field1491 * arg4 + var34.field1494 * arg2 + var34.field1490 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1845[var15] = method2016(var35);
                var8.field1847[var15] = -1;
            } else {
                var8.field1847[var15] = -2;
            }
        }
        this.method2000();
        var8.field1860 = this.field1648;
        var8.field1838 = this.field1646;
        var8.field1839 = this.field1680;
        var8.field1873 = this.field1666;
        var8.field1841 = this.field1649;
        var8.field1842 = this.field1670;
        var8.field1851 = this.field1673;
        var8.field1844 = this.field1647;
        var8.field1848 = this.field1654;
        var8.field1849 = this.field1683;
        var8.field1852 = this.field1659;
        var8.field1857 = this.field1674;
        var8.field1858 = this.field1686;
        var8.field1890 = this.field1658;
        return var8;
    }

    @ObfuscatedName("ck.ah(II)I")
    public static final int method2005(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("ck.ad(I)I")
    public static final int method2016(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
