package deob;

@ObfuscatedName("ca")
public class class100 extends class85 {

    @ObfuscatedName("ca.v")
    public int field1678 = 0;

    @ObfuscatedName("ca.f")
    public int[] field1665;

    @ObfuscatedName("ca.i")
    public int[] field1680;

    @ObfuscatedName("ca.d")
    public int[] field1667;

    @ObfuscatedName("ca.o")
    public int field1684 = 0;

    @ObfuscatedName("ca.c")
    public int[] field1669;

    @ObfuscatedName("ca.p")
    public int[] field1670;

    @ObfuscatedName("ca.j")
    public int[] field1671;

    @ObfuscatedName("ca.a")
    public byte[] field1664;

    @ObfuscatedName("ca.y")
    public byte[] field1673;

    @ObfuscatedName("ca.h")
    public byte[] field1681;

    @ObfuscatedName("ca.z")
    public byte[] field1675;

    @ObfuscatedName("ca.w")
    public short[] field1676;

    @ObfuscatedName("ca.l")
    public short[] field1677;

    @ObfuscatedName("ca.q")
    public byte field1707 = 0;

    @ObfuscatedName("ca.x")
    public int field1679;

    @ObfuscatedName("ca.s")
    public byte[] field1666;

    @ObfuscatedName("ca.n")
    public short[] field1700;

    @ObfuscatedName("ca.u")
    public short[] field1690;

    @ObfuscatedName("ca.m")
    public short[] field1674;

    @ObfuscatedName("ca.e")
    public short[] field1698;

    @ObfuscatedName("ca.k")
    public short[] field1685;

    @ObfuscatedName("ca.r")
    public short[] field1686;

    @ObfuscatedName("ca.b")
    public short[] field1687;

    @ObfuscatedName("ca.t")
    public short[] field1672;

    @ObfuscatedName("ca.g")
    public short[] field1689;

    @ObfuscatedName("ca.af")
    public byte[] field1688;

    @ObfuscatedName("ca.ad")
    public int[] field1691;

    @ObfuscatedName("ca.ak")
    public int[] field1692;

    @ObfuscatedName("ca.ai")
    public int[][] field1693;

    @ObfuscatedName("ca.au")
    public int[][] field1682;

    @ObfuscatedName("ca.ar")
    public class84[] field1695;

    @ObfuscatedName("ca.aw")
    public class96[] field1696;

    @ObfuscatedName("ca.at")
    public class96[] field1694;

    @ObfuscatedName("ca.al")
    public short field1668;

    @ObfuscatedName("ca.aj")
    public short field1699;

    @ObfuscatedName("ca.ag")
    public boolean field1683 = false;

    @ObfuscatedName("ca.ay")
    public int field1701;

    @ObfuscatedName("ca.az")
    public int field1702;

    @ObfuscatedName("ca.ac")
    public int field1703;

    @ObfuscatedName("ca.aa")
    public int field1704;

    @ObfuscatedName("ca.ao")
    public int field1705;

    @ObfuscatedName("ca.av")
    public static int[] field1706 = new int[10000];

    @ObfuscatedName("ca.am")
    public static int[] field1708 = new int[10000];

    @ObfuscatedName("ca.an")
    public static int field1697 = 0;

    @ObfuscatedName("ca.ae")
    public static int[] field1709 = class91.field1569;

    @ObfuscatedName("ca.ap")
    public static int[] field1710 = class91.field1566;

    public class100() {
    }

    @ObfuscatedName("ca.v(Lfh;II)Lca;")
    public static class100 method2053(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3082(arg1, arg2);
        return var3 == null ? null : new class100(var3);
    }

    public class100(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2054(arg0);
        } else {
            this.method2082(arg0);
        }
    }

    @ObfuscatedName("ca.f([B)V")
    public void method2054(byte[] arg0) {
        class119 var2 = new class119(arg0);
        class119 var3 = new class119(arg0);
        class119 var4 = new class119(arg0);
        class119 var5 = new class119(arg0);
        class119 var6 = new class119(arg0);
        class119 var7 = new class119(arg0);
        class119 var8 = new class119(arg0);
        var2.field1984 = arg0.length - 23;
        int var9 = var2.method2334();
        int var10 = var2.method2334();
        int var11 = var2.method2400();
        int var12 = var2.method2400();
        int var13 = var2.method2400();
        int var14 = var2.method2400();
        int var15 = var2.method2400();
        int var16 = var2.method2400();
        int var17 = var2.method2400();
        int var18 = var2.method2334();
        int var19 = var2.method2334();
        int var20 = var2.method2334();
        int var21 = var2.method2334();
        int var22 = var2.method2334();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1666 = new byte[var11];
            var2.field1984 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1666[var26] = var2.method2350();
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
        this.field1678 = var9;
        this.field1684 = var10;
        this.field1679 = var11;
        this.field1665 = new int[var9];
        this.field1680 = new int[var9];
        this.field1667 = new int[var9];
        this.field1669 = new int[var10];
        this.field1670 = new int[var10];
        this.field1671 = new int[var10];
        if (var17 == 1) {
            this.field1691 = new int[var9];
        }
        if (var12 == 1) {
            this.field1664 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1673 = new byte[var10];
        } else {
            this.field1707 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1681 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1692 = new int[var10];
        }
        if (var16 == 1) {
            this.field1677 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1675 = new byte[var10];
        }
        this.field1676 = new short[var10];
        if (var11 > 0) {
            this.field1700 = new short[var11];
            this.field1690 = new short[var11];
            this.field1674 = new short[var11];
            if (var24 > 0) {
                this.field1698 = new short[var24];
                this.field1685 = new short[var24];
                this.field1686 = new short[var24];
                this.field1687 = new short[var24];
                this.field1688 = new byte[var24];
                this.field1672 = new short[var24];
            }
            if (var25 > 0) {
                this.field1689 = new short[var25];
            }
        }
        var2.field1984 = var11;
        var3.field1984 = var44;
        var4.field1984 = var46;
        var5.field1984 = var48;
        var6.field1984 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2400();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2361();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2361();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2361();
            }
            this.field1665[var67] = var64 + var69;
            this.field1680[var67] = var65 + var70;
            this.field1667[var67] = var66 + var71;
            var64 = this.field1665[var67];
            var65 = this.field1680[var67];
            var66 = this.field1667[var67];
            if (var17 == 1) {
                this.field1691[var67] = var6.method2400();
            }
        }
        var2.field1984 = var42;
        var3.field1984 = var31;
        var4.field1984 = var34;
        var5.field1984 = var37;
        var6.field1984 = var35;
        var7.field1984 = var40;
        var8.field1984 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1676[var72] = (short) var2.method2334();
            if (var12 == 1) {
                this.field1664[var72] = var3.method2350();
            }
            if (var13 == 255) {
                this.field1673[var72] = var4.method2350();
            }
            if (var14 == 1) {
                this.field1681[var72] = var5.method2350();
            }
            if (var15 == 1) {
                this.field1692[var72] = var6.method2400();
            }
            if (var16 == 1) {
                this.field1677[var72] = (short) (var7.method2334() - 1);
            }
            if (this.field1675 != null && this.field1677[var72] != -1) {
                this.field1675[var72] = (byte) (var8.method2400() - 1);
            }
        }
        var2.field1984 = var33;
        var3.field1984 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2400();
            if (var78 == 1) {
                var73 = var2.method2361() + var76;
                var74 = var2.method2361() + var73;
                var75 = var2.method2361() + var74;
                var76 = var75;
                this.field1669[var77] = var73;
                this.field1670[var77] = var74;
                this.field1671[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2361() + var76;
                var76 = var75;
                this.field1669[var77] = var73;
                this.field1670[var77] = var74;
                this.field1671[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2361() + var76;
                var76 = var75;
                this.field1669[var77] = var73;
                this.field1670[var77] = var74;
                this.field1671[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2361() + var76;
                var76 = var75;
                this.field1669[var77] = var73;
                this.field1670[var77] = var81;
                this.field1671[var77] = var75;
            }
        }
        var2.field1984 = var50;
        var3.field1984 = var52;
        var4.field1984 = var54;
        var5.field1984 = var56;
        var6.field1984 = var58;
        var7.field1984 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1666[var82] & 0xFF;
            if (var83 == 0) {
                this.field1700[var82] = (short) var2.method2334();
                this.field1690[var82] = (short) var2.method2334();
                this.field1674[var82] = (short) var2.method2334();
            }
            if (var83 == 1) {
                this.field1700[var82] = (short) var3.method2334();
                this.field1690[var82] = (short) var3.method2334();
                this.field1674[var82] = (short) var3.method2334();
                this.field1698[var82] = (short) var4.method2334();
                this.field1685[var82] = (short) var4.method2334();
                this.field1686[var82] = (short) var4.method2334();
                this.field1687[var82] = (short) var5.method2334();
                this.field1688[var82] = var6.method2350();
                this.field1672[var82] = (short) var7.method2334();
            }
            if (var83 == 2) {
                this.field1700[var82] = (short) var3.method2334();
                this.field1690[var82] = (short) var3.method2334();
                this.field1674[var82] = (short) var3.method2334();
                this.field1698[var82] = (short) var4.method2334();
                this.field1685[var82] = (short) var4.method2334();
                this.field1686[var82] = (short) var4.method2334();
                this.field1687[var82] = (short) var5.method2334();
                this.field1688[var82] = var6.method2350();
                this.field1672[var82] = (short) var7.method2334();
                this.field1689[var82] = (short) var7.method2334();
            }
            if (var83 == 3) {
                this.field1700[var82] = (short) var3.method2334();
                this.field1690[var82] = (short) var3.method2334();
                this.field1674[var82] = (short) var3.method2334();
                this.field1698[var82] = (short) var4.method2334();
                this.field1685[var82] = (short) var4.method2334();
                this.field1686[var82] = (short) var4.method2334();
                this.field1687[var82] = (short) var5.method2334();
                this.field1688[var82] = var6.method2350();
                this.field1672[var82] = (short) var7.method2334();
            }
        }
        var2.field1984 = var62;
        int var84 = var2.method2400();
        if (var84 == 0) {
            return;
        }
        new class90();
        var2.method2334();
        var2.method2334();
        var2.method2334();
        var2.method2354();
    }

    @ObfuscatedName("ca.d([B)V")
    public void method2082(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class119 var4 = new class119(arg0);
        class119 var5 = new class119(arg0);
        class119 var6 = new class119(arg0);
        class119 var7 = new class119(arg0);
        class119 var8 = new class119(arg0);
        var4.field1984 = arg0.length - 18;
        int var9 = var4.method2334();
        int var10 = var4.method2334();
        int var11 = var4.method2400();
        int var12 = var4.method2400();
        int var13 = var4.method2400();
        int var14 = var4.method2400();
        int var15 = var4.method2400();
        int var16 = var4.method2400();
        int var17 = var4.method2334();
        int var18 = var4.method2334();
        int var19 = var4.method2334();
        int var20 = var4.method2334();
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
        this.field1678 = var9;
        this.field1684 = var10;
        this.field1679 = var11;
        this.field1665 = new int[var9];
        this.field1680 = new int[var9];
        this.field1667 = new int[var9];
        this.field1669 = new int[var10];
        this.field1670 = new int[var10];
        this.field1671 = new int[var10];
        if (var11 > 0) {
            this.field1666 = new byte[var11];
            this.field1700 = new short[var11];
            this.field1690 = new short[var11];
            this.field1674 = new short[var11];
        }
        if (var16 == 1) {
            this.field1691 = new int[var9];
        }
        if (var12 == 1) {
            this.field1664 = new byte[var10];
            this.field1675 = new byte[var10];
            this.field1677 = new short[var10];
        }
        if (var13 == 255) {
            this.field1673 = new byte[var10];
        } else {
            this.field1707 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1681 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1692 = new int[var10];
        }
        this.field1676 = new short[var10];
        var4.field1984 = var21;
        var5.field1984 = var36;
        var6.field1984 = var38;
        var7.field1984 = var40;
        var8.field1984 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2400();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2361();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2361();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2361();
            }
            this.field1665[var46] = var43 + var48;
            this.field1680[var46] = var44 + var49;
            this.field1667[var46] = var45 + var50;
            var43 = this.field1665[var46];
            var44 = this.field1680[var46];
            var45 = this.field1667[var46];
            if (var16 == 1) {
                this.field1691[var46] = var8.method2400();
            }
        }
        var4.field1984 = var32;
        var5.field1984 = var28;
        var6.field1984 = var26;
        var7.field1984 = var30;
        var8.field1984 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1676[var51] = (short) var4.method2334();
            if (var12 == 1) {
                int var52 = var5.method2400();
                if ((var52 & 0x1) == 1) {
                    this.field1664[var51] = 1;
                    var2 = true;
                } else {
                    this.field1664[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1675[var51] = (byte) (var52 >> 2);
                    this.field1677[var51] = this.field1676[var51];
                    this.field1676[var51] = 127;
                    if (this.field1677[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1675[var51] = -1;
                    this.field1677[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1673[var51] = var6.method2350();
            }
            if (var14 == 1) {
                this.field1681[var51] = var7.method2350();
            }
            if (var15 == 1) {
                this.field1692[var51] = var8.method2400();
            }
        }
        var4.field1984 = var25;
        var5.field1984 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2400();
            if (var58 == 1) {
                var53 = var4.method2361() + var56;
                var54 = var4.method2361() + var53;
                var55 = var4.method2361() + var54;
                var56 = var55;
                this.field1669[var57] = var53;
                this.field1670[var57] = var54;
                this.field1671[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2361() + var56;
                var56 = var55;
                this.field1669[var57] = var53;
                this.field1670[var57] = var54;
                this.field1671[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2361() + var56;
                var56 = var55;
                this.field1669[var57] = var53;
                this.field1670[var57] = var54;
                this.field1671[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2361() + var56;
                var56 = var55;
                this.field1669[var57] = var53;
                this.field1670[var57] = var61;
                this.field1671[var57] = var55;
            }
        }
        var4.field1984 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1666[var62] = 0;
            this.field1700[var62] = (short) var4.method2334();
            this.field1690[var62] = (short) var4.method2334();
            this.field1674[var62] = (short) var4.method2334();
        }
        if (this.field1675 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1675[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1700[var65] & 0xFFFF) == this.field1669[var64] && (this.field1690[var65] & 0xFFFF) == this.field1670[var64] && (this.field1674[var65] & 0xFFFF) == this.field1671[var64]) {
                        this.field1675[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1675 = null;
            }
        }
        if (!var3) {
            this.field1677 = null;
        }
        if (!var2) {
            this.field1664 = null;
        }
    }

    public class100(class100[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1678 = 0;
        this.field1684 = 0;
        this.field1679 = 0;
        this.field1707 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class100 var10 = arg0[var9];
            if (var10 != null) {
                this.field1678 += var10.field1678;
                this.field1684 += var10.field1684;
                this.field1679 += var10.field1679;
                if (var10.field1673 == null) {
                    if (this.field1707 == -1) {
                        this.field1707 = var10.field1707;
                    }
                    if (this.field1707 != var10.field1707) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1664 != null;
                var5 |= var10.field1681 != null;
                var6 |= var10.field1692 != null;
                var7 |= var10.field1677 != null;
                var8 |= var10.field1675 != null;
            }
        }
        this.field1665 = new int[this.field1678];
        this.field1680 = new int[this.field1678];
        this.field1667 = new int[this.field1678];
        this.field1691 = new int[this.field1678];
        this.field1669 = new int[this.field1684];
        this.field1670 = new int[this.field1684];
        this.field1671 = new int[this.field1684];
        if (var3) {
            this.field1664 = new byte[this.field1684];
        }
        if (var4) {
            this.field1673 = new byte[this.field1684];
        }
        if (var5) {
            this.field1681 = new byte[this.field1684];
        }
        if (var6) {
            this.field1692 = new int[this.field1684];
        }
        if (var7) {
            this.field1677 = new short[this.field1684];
        }
        if (var8) {
            this.field1675 = new byte[this.field1684];
        }
        this.field1676 = new short[this.field1684];
        if (this.field1679 > 0) {
            this.field1666 = new byte[this.field1679];
            this.field1700 = new short[this.field1679];
            this.field1690 = new short[this.field1679];
            this.field1674 = new short[this.field1679];
            this.field1698 = new short[this.field1679];
            this.field1685 = new short[this.field1679];
            this.field1686 = new short[this.field1679];
            this.field1687 = new short[this.field1679];
            this.field1688 = new byte[this.field1679];
            this.field1672 = new short[this.field1679];
            this.field1689 = new short[this.field1679];
        }
        this.field1678 = 0;
        this.field1684 = 0;
        this.field1679 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class100 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1684; var13++) {
                    if (var3 && var12.field1664 != null) {
                        this.field1664[this.field1684] = var12.field1664[var13];
                    }
                    if (var4) {
                        if (var12.field1673 == null) {
                            this.field1673[this.field1684] = var12.field1707;
                        } else {
                            this.field1673[this.field1684] = var12.field1673[var13];
                        }
                    }
                    if (var5 && var12.field1681 != null) {
                        this.field1681[this.field1684] = var12.field1681[var13];
                    }
                    if (var6 && var12.field1692 != null) {
                        this.field1692[this.field1684] = var12.field1692[var13];
                    }
                    if (var7) {
                        if (var12.field1677 == null) {
                            this.field1677[this.field1684] = -1;
                        } else {
                            this.field1677[this.field1684] = var12.field1677[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1675 == null || var12.field1675[var13] == -1) {
                            this.field1675[this.field1684] = -1;
                        } else {
                            this.field1675[this.field1684] = (byte) (var12.field1675[var13] + this.field1679);
                        }
                    }
                    this.field1676[this.field1684] = var12.field1676[var13];
                    this.field1669[this.field1684] = this.method2057(var12, var12.field1669[var13]);
                    this.field1670[this.field1684] = this.method2057(var12, var12.field1670[var13]);
                    this.field1671[this.field1684] = this.method2057(var12, var12.field1671[var13]);
                    this.field1684++;
                }
                for (int var14 = 0; var14 < var12.field1679; var14++) {
                    byte var15 = this.field1666[this.field1679] = var12.field1666[var14];
                    if (var15 == 0) {
                        this.field1700[this.field1679] = (short) this.method2057(var12, var12.field1700[var14]);
                        this.field1690[this.field1679] = (short) this.method2057(var12, var12.field1690[var14]);
                        this.field1674[this.field1679] = (short) this.method2057(var12, var12.field1674[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1700[this.field1679] = var12.field1700[var14];
                        this.field1690[this.field1679] = var12.field1690[var14];
                        this.field1674[this.field1679] = var12.field1674[var14];
                        this.field1698[this.field1679] = var12.field1698[var14];
                        this.field1685[this.field1679] = var12.field1685[var14];
                        this.field1686[this.field1679] = var12.field1686[var14];
                        this.field1687[this.field1679] = var12.field1687[var14];
                        this.field1688[this.field1679] = var12.field1688[var14];
                        this.field1672[this.field1679] = var12.field1672[var14];
                    }
                    if (var15 == 2) {
                        this.field1689[this.field1679] = var12.field1689[var14];
                    }
                    this.field1679++;
                }
            }
        }
    }

    @ObfuscatedName("ca.o(Lca;I)I")
    public final int method2057(class100 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1665[arg1];
        int var5 = arg0.field1680[arg1];
        int var6 = arg0.field1667[arg1];
        for (int var7 = 0; var7 < this.field1678; var7++) {
            if (this.field1665[var7] == var4 && this.field1680[var7] == var5 && this.field1667[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1665[this.field1678] = var4;
            this.field1680[this.field1678] = var5;
            this.field1667[this.field1678] = var6;
            if (arg0.field1691 != null) {
                this.field1691[this.field1678] = arg0.field1691[arg1];
            }
            var3 = this.field1678++;
        }
        return var3;
    }

    public class100(class100 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1678 = arg0.field1678;
        this.field1684 = arg0.field1684;
        this.field1679 = arg0.field1679;
        if (arg1) {
            this.field1665 = arg0.field1665;
            this.field1680 = arg0.field1680;
            this.field1667 = arg0.field1667;
        } else {
            this.field1665 = new int[this.field1678];
            this.field1680 = new int[this.field1678];
            this.field1667 = new int[this.field1678];
            for (int var6 = 0; var6 < this.field1678; var6++) {
                this.field1665[var6] = arg0.field1665[var6];
                this.field1680[var6] = arg0.field1680[var6];
                this.field1667[var6] = arg0.field1667[var6];
            }
        }
        if (arg2) {
            this.field1676 = arg0.field1676;
        } else {
            this.field1676 = new short[this.field1684];
            for (int var7 = 0; var7 < this.field1684; var7++) {
                this.field1676[var7] = arg0.field1676[var7];
            }
        }
        if (arg3 || arg0.field1677 == null) {
            this.field1677 = arg0.field1677;
        } else {
            this.field1677 = new short[this.field1684];
            for (int var8 = 0; var8 < this.field1684; var8++) {
                this.field1677[var8] = arg0.field1677[var8];
            }
        }
        if (arg4) {
            this.field1681 = arg0.field1681;
        } else {
            this.field1681 = new byte[this.field1684];
            if (arg0.field1681 == null) {
                for (int var9 = 0; var9 < this.field1684; var9++) {
                    this.field1681[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1684; var10++) {
                    this.field1681[var10] = arg0.field1681[var10];
                }
            }
        }
        this.field1669 = arg0.field1669;
        this.field1670 = arg0.field1670;
        this.field1671 = arg0.field1671;
        this.field1664 = arg0.field1664;
        this.field1673 = arg0.field1673;
        this.field1675 = arg0.field1675;
        this.field1707 = arg0.field1707;
        this.field1666 = arg0.field1666;
        this.field1700 = arg0.field1700;
        this.field1690 = arg0.field1690;
        this.field1674 = arg0.field1674;
        this.field1698 = arg0.field1698;
        this.field1685 = arg0.field1685;
        this.field1686 = arg0.field1686;
        this.field1687 = arg0.field1687;
        this.field1688 = arg0.field1688;
        this.field1672 = arg0.field1672;
        this.field1689 = arg0.field1689;
        this.field1691 = arg0.field1691;
        this.field1692 = arg0.field1692;
        this.field1693 = arg0.field1693;
        this.field1682 = arg0.field1682;
        this.field1696 = arg0.field1696;
        this.field1695 = arg0.field1695;
        this.field1694 = arg0.field1694;
        this.field1668 = arg0.field1668;
        this.field1699 = arg0.field1699;
    }

    @ObfuscatedName("ca.c()Lca;")
    public class100 method2058() {
        class100 var1 = new class100();
        if (this.field1664 != null) {
            var1.field1664 = new byte[this.field1684];
            for (int var2 = 0; var2 < this.field1684; var2++) {
                var1.field1664[var2] = this.field1664[var2];
            }
        }
        var1.field1678 = this.field1678;
        var1.field1684 = this.field1684;
        var1.field1679 = this.field1679;
        var1.field1665 = this.field1665;
        var1.field1680 = this.field1680;
        var1.field1667 = this.field1667;
        var1.field1669 = this.field1669;
        var1.field1670 = this.field1670;
        var1.field1671 = this.field1671;
        var1.field1673 = this.field1673;
        var1.field1681 = this.field1681;
        var1.field1675 = this.field1675;
        var1.field1676 = this.field1676;
        var1.field1677 = this.field1677;
        var1.field1707 = this.field1707;
        var1.field1666 = this.field1666;
        var1.field1700 = this.field1700;
        var1.field1690 = this.field1690;
        var1.field1674 = this.field1674;
        var1.field1698 = this.field1698;
        var1.field1685 = this.field1685;
        var1.field1686 = this.field1686;
        var1.field1687 = this.field1687;
        var1.field1688 = this.field1688;
        var1.field1672 = this.field1672;
        var1.field1689 = this.field1689;
        var1.field1691 = this.field1691;
        var1.field1692 = this.field1692;
        var1.field1693 = this.field1693;
        var1.field1682 = this.field1682;
        var1.field1696 = this.field1696;
        var1.field1695 = this.field1695;
        var1.field1668 = this.field1668;
        var1.field1699 = this.field1699;
        return var1;
    }

    @ObfuscatedName("ca.p([[IIIIZI)Lca;")
    public class100 method2059(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2066();
        int var7 = this.field1702 + arg1;
        int var8 = this.field1703 + arg1;
        int var9 = this.field1705 + arg3;
        int var10 = this.field1704 + arg3;
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
            var15.field1678 = this.field1678;
            var15.field1684 = this.field1684;
            var15.field1679 = this.field1679;
            var15.field1665 = this.field1665;
            var15.field1667 = this.field1667;
            var15.field1669 = this.field1669;
            var15.field1670 = this.field1670;
            var15.field1671 = this.field1671;
            var15.field1664 = this.field1664;
            var15.field1673 = this.field1673;
            var15.field1681 = this.field1681;
            var15.field1675 = this.field1675;
            var15.field1676 = this.field1676;
            var15.field1677 = this.field1677;
            var15.field1707 = this.field1707;
            var15.field1666 = this.field1666;
            var15.field1700 = this.field1700;
            var15.field1690 = this.field1690;
            var15.field1674 = this.field1674;
            var15.field1698 = this.field1698;
            var15.field1685 = this.field1685;
            var15.field1686 = this.field1686;
            var15.field1687 = this.field1687;
            var15.field1688 = this.field1688;
            var15.field1672 = this.field1672;
            var15.field1689 = this.field1689;
            var15.field1691 = this.field1691;
            var15.field1692 = this.field1692;
            var15.field1693 = this.field1693;
            var15.field1682 = this.field1682;
            var15.field1668 = this.field1668;
            var15.field1699 = this.field1699;
            var15.field1680 = new int[var15.field1678];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1678; var16++) {
                int var17 = this.field1665[var16] + arg1;
                int var18 = this.field1667[var16] + arg3;
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
            for (int var26 = 0; var26 < var15.field1678; var26++) {
                int var27 = (-this.field1680[var26] << 16) / this.field1443;
                if (var27 < arg5) {
                    int var28 = this.field1665[var26] + arg1;
                    int var29 = this.field1667[var26] + arg3;
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
        var15.method2098();
        return var15;
    }

    @ObfuscatedName("ca.j()V")
    public void method2060() {
        int var10002;
        if (this.field1691 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1678; var3++) {
                int var4 = this.field1691[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1693 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1693[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1678) {
                int var7 = this.field1691[var6];
                this.field1693[var7][var1[var7]++] = var6++;
            }
            this.field1691 = null;
        }
        if (this.field1692 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1684; var10++) {
            int var11 = this.field1692[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1682 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1682[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1684) {
            int var14 = this.field1692[var13];
            this.field1682[var14][var8[var14]++] = var13++;
        }
        this.field1692 = null;
    }

    @ObfuscatedName("ca.a()V")
    public void method2086() {
        for (int var1 = 0; var1 < this.field1678; var1++) {
            int var2 = this.field1665[var1];
            this.field1665[var1] = this.field1667[var1];
            this.field1667[var1] = -var2;
        }
        this.method2098();
    }

    @ObfuscatedName("ca.y()V")
    public void method2062() {
        for (int var1 = 0; var1 < this.field1678; var1++) {
            this.field1665[var1] = -this.field1665[var1];
            this.field1667[var1] = -this.field1667[var1];
        }
        this.method2098();
    }

    @ObfuscatedName("ca.h()V")
    public void method2063() {
        for (int var1 = 0; var1 < this.field1678; var1++) {
            int var2 = this.field1667[var1];
            this.field1667[var1] = this.field1665[var1];
            this.field1665[var1] = -var2;
        }
        this.method2098();
    }

    @ObfuscatedName("ca.z(I)V")
    public void method2126(int arg0) {
        int var2 = field1709[arg0];
        int var3 = field1710[arg0];
        for (int var4 = 0; var4 < this.field1678; var4++) {
            int var5 = this.field1667[var4] * var2 + this.field1665[var4] * var3 >> 16;
            this.field1667[var4] = this.field1667[var4] * var3 - this.field1665[var4] * var2 >> 16;
            this.field1665[var4] = var5;
        }
        this.method2098();
    }

    @ObfuscatedName("ca.w(III)V")
    public void method2065(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1678; var4++) {
            this.field1665[var4] += arg0;
            this.field1680[var4] += arg1;
            this.field1667[var4] += arg2;
        }
        this.method2098();
    }

    @ObfuscatedName("ca.q(SS)V")
    public void method2123(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1684; var3++) {
            if (this.field1676[var3] == arg0) {
                this.field1676[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ca.x(SS)V")
    public void method2067(short arg0, short arg1) {
        if (this.field1677 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1684; var3++) {
            if (this.field1677[var3] == arg0) {
                this.field1677[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ca.s()V")
    public void method2068() {
        for (int var1 = 0; var1 < this.field1678; var1++) {
            this.field1667[var1] = -this.field1667[var1];
        }
        for (int var2 = 0; var2 < this.field1684; var2++) {
            int var3 = this.field1669[var2];
            this.field1669[var2] = this.field1671[var2];
            this.field1671[var2] = var3;
        }
        this.method2098();
    }

    @ObfuscatedName("ca.n(III)V")
    public void method2095(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1678; var4++) {
            this.field1665[var4] = this.field1665[var4] * arg0 / 128;
            this.field1680[var4] = this.field1680[var4] * arg1 / 128;
            this.field1667[var4] = this.field1667[var4] * arg2 / 128;
        }
        this.method2098();
    }

    @ObfuscatedName("ca.u()V")
    public void method2070() {
        if (this.field1696 != null) {
            return;
        }
        this.field1696 = new class96[this.field1678];
        for (int var1 = 0; var1 < this.field1678; var1++) {
            this.field1696[var1] = new class96();
        }
        for (int var2 = 0; var2 < this.field1684; var2++) {
            int var3 = this.field1669[var2];
            int var4 = this.field1670[var2];
            int var5 = this.field1671[var2];
            int var6 = this.field1665[var4] - this.field1665[var3];
            int var7 = this.field1680[var4] - this.field1680[var3];
            int var8 = this.field1667[var4] - this.field1667[var3];
            int var9 = this.field1665[var5] - this.field1665[var3];
            int var10 = this.field1680[var5] - this.field1680[var3];
            int var11 = this.field1667[var5] - this.field1667[var3];
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
            if (this.field1664 == null) {
                var19 = 0;
            } else {
                var19 = this.field1664[var2];
            }
            if (var19 == 0) {
                class96 var20 = this.field1696[var3];
                var20.field1604 += var16;
                var20.field1605 += var17;
                var20.field1608 += var18;
                var20.field1607++;
                class96 var21 = this.field1696[var4];
                var21.field1604 += var16;
                var21.field1605 += var17;
                var21.field1608 += var18;
                var21.field1607++;
                class96 var22 = this.field1696[var5];
                var22.field1604 += var16;
                var22.field1605 += var17;
                var22.field1608 += var18;
                var22.field1607++;
            } else if (var19 == 1) {
                if (this.field1695 == null) {
                    this.field1695 = new class84[this.field1684];
                }
                class84 var23 = this.field1695[var2] = new class84();
                var23.field1440 = var16;
                var23.field1437 = var17;
                var23.field1436 = var18;
            }
        }
    }

    @ObfuscatedName("ca.m()V")
    public void method2098() {
        this.field1696 = null;
        this.field1694 = null;
        this.field1695 = null;
        this.field1683 = false;
    }

    @ObfuscatedName("ca.e()V")
    public void method2066() {
        if (this.field1683) {
            return;
        }
        this.field1443 = 0;
        this.field1701 = 0;
        this.field1702 = 999999;
        this.field1703 = -999999;
        this.field1704 = -99999;
        this.field1705 = 99999;
        for (int var1 = 0; var1 < this.field1678; var1++) {
            int var2 = this.field1665[var1];
            int var3 = this.field1680[var1];
            int var4 = this.field1667[var1];
            if (var2 < this.field1702) {
                this.field1702 = var2;
            }
            if (var2 > this.field1703) {
                this.field1703 = var2;
            }
            if (var4 < this.field1705) {
                this.field1705 = var4;
            }
            if (var4 > this.field1704) {
                this.field1704 = var4;
            }
            if (-var3 > this.field1443) {
                this.field1443 = -var3;
            }
            if (var3 > this.field1701) {
                this.field1701 = var3;
            }
        }
        this.field1683 = true;
    }

    @ObfuscatedName("ca.k(Lca;Lca;IIIZ)V")
    public static void method2073(class100 arg0, class100 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2066();
        arg0.method2070();
        arg1.method2066();
        arg1.method2070();
        field1697++;
        int var6 = 0;
        int[] var7 = arg1.field1665;
        int var8 = arg1.field1678;
        for (int var9 = 0; var9 < arg0.field1678; var9++) {
            class96 var10 = arg0.field1696[var9];
            if (var10.field1607 != 0) {
                int var11 = arg0.field1680[var9] - arg3;
                if (var11 <= arg1.field1701) {
                    int var12 = arg0.field1665[var9] - arg2;
                    if (var12 >= arg1.field1702 && var12 <= arg1.field1703) {
                        int var13 = arg0.field1667[var9] - arg4;
                        if (var13 >= arg1.field1705 && var13 <= arg1.field1704) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class96 var15 = arg1.field1696[var14];
                                if (var7[var14] == var12 && arg1.field1667[var14] == var13 && arg1.field1680[var14] == var11 && var15.field1607 != 0) {
                                    if (arg0.field1694 == null) {
                                        arg0.field1694 = new class96[arg0.field1678];
                                    }
                                    if (arg1.field1694 == null) {
                                        arg1.field1694 = new class96[var8];
                                    }
                                    class96 var16 = arg0.field1694[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1694[var9] = new class96(var10);
                                    }
                                    class96 var17 = arg1.field1694[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1694[var14] = new class96(var15);
                                    }
                                    var16.field1604 += var15.field1604;
                                    var16.field1605 += var15.field1605;
                                    var16.field1608 += var15.field1608;
                                    var16.field1607 += var15.field1607;
                                    var17.field1604 += var10.field1604;
                                    var17.field1605 += var10.field1605;
                                    var17.field1608 += var10.field1608;
                                    var17.field1607 += var10.field1607;
                                    var6++;
                                    field1706[var9] = field1697;
                                    field1708[var14] = field1697;
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
        for (int var18 = 0; var18 < arg0.field1684; var18++) {
            if (field1706[arg0.field1669[var18]] == field1697 && field1706[arg0.field1670[var18]] == field1697 && field1706[arg0.field1671[var18]] == field1697) {
                if (arg0.field1664 == null) {
                    arg0.field1664 = new byte[arg0.field1684];
                }
                arg0.field1664[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1684; var19++) {
            if (field1708[arg1.field1669[var19]] == field1697 && field1708[arg1.field1670[var19]] == field1697 && field1708[arg1.field1671[var19]] == field1697) {
                if (arg1.field1664 == null) {
                    arg1.field1664 = new byte[arg1.field1684];
                }
                arg1.field1664[var19] = 2;
            }
        }
    }

    @ObfuscatedName("ca.r(IIIII)Ldq;")
    public final class105 method2074(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2070();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class105 var8 = new class105();
        var8.field1791 = new int[this.field1684];
        var8.field1841 = new int[this.field1684];
        var8.field1804 = new int[this.field1684];
        if (this.field1679 > 0 && this.field1675 != null) {
            int[] var9 = new int[this.field1679];
            for (int var10 = 0; var10 < this.field1684; var10++) {
                if (this.field1675[var10] != -1) {
                    var9[this.field1675[var10] & 0xFF]++;
                }
            }
            var8.field1799 = 0;
            for (int var11 = 0; var11 < this.field1679; var11++) {
                if (var9[var11] > 0 && this.field1666[var11] == 0) {
                    var8.field1799++;
                }
            }
            var8.field1800 = new int[var8.field1799];
            var8.field1801 = new int[var8.field1799];
            var8.field1802 = new int[var8.field1799];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1679; var13++) {
                if (var9[var13] > 0 && this.field1666[var13] == 0) {
                    var8.field1800[var12] = this.field1700[var13] & 0xFFFF;
                    var8.field1801[var12] = this.field1690[var13] & 0xFFFF;
                    var8.field1802[var12] = this.field1674[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1842 = new byte[this.field1684];
            for (int var14 = 0; var14 < this.field1684; var14++) {
                if (this.field1675[var14] == -1) {
                    var8.field1842[var14] = -1;
                } else {
                    var8.field1842[var14] = (byte) var9[this.field1675[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1684; var15++) {
            byte var16;
            if (this.field1664 == null) {
                var16 = 0;
            } else {
                var16 = this.field1664[var15];
            }
            byte var17;
            if (this.field1681 == null) {
                var17 = 0;
            } else {
                var17 = this.field1681[var15];
            }
            short var18;
            if (this.field1677 == null) {
                var18 = -1;
            } else {
                var18 = this.field1677[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1676[var15] & 0xFFFF;
                    class96 var20;
                    if (this.field1694 == null || this.field1694[this.field1669[var15]] == null) {
                        var20 = this.field1696[this.field1669[var15]];
                    } else {
                        var20 = this.field1694[this.field1669[var15]];
                    }
                    int var21 = (var20.field1608 * arg4 + var20.field1605 * arg3 + var20.field1604 * arg2) / (var20.field1607 * var7) + arg0;
                    var8.field1791[var15] = method2075(var19, var21);
                    class96 var22;
                    if (this.field1694 == null || this.field1694[this.field1670[var15]] == null) {
                        var22 = this.field1696[this.field1670[var15]];
                    } else {
                        var22 = this.field1694[this.field1670[var15]];
                    }
                    int var23 = (var22.field1608 * arg4 + var22.field1605 * arg3 + var22.field1604 * arg2) / (var22.field1607 * var7) + arg0;
                    var8.field1841[var15] = method2075(var19, var23);
                    class96 var24;
                    if (this.field1694 == null || this.field1694[this.field1671[var15]] == null) {
                        var24 = this.field1696[this.field1671[var15]];
                    } else {
                        var24 = this.field1694[this.field1671[var15]];
                    }
                    int var25 = (var24.field1608 * arg4 + var24.field1605 * arg3 + var24.field1604 * arg2) / (var24.field1607 * var7) + arg0;
                    var8.field1804[var15] = method2075(var19, var25);
                } else if (var16 == 1) {
                    class84 var26 = this.field1695[var15];
                    int var27 = (var26.field1436 * arg4 + var26.field1440 * arg2 + var26.field1437 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1791[var15] = method2075(this.field1676[var15] & 0xFFFF, var27);
                    var8.field1804[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1791[var15] = 128;
                    var8.field1804[var15] = -1;
                } else {
                    var8.field1804[var15] = -2;
                }
            } else if (var16 == 0) {
                class96 var28;
                if (this.field1694 == null || this.field1694[this.field1669[var15]] == null) {
                    var28 = this.field1696[this.field1669[var15]];
                } else {
                    var28 = this.field1694[this.field1669[var15]];
                }
                int var29 = (var28.field1608 * arg4 + var28.field1605 * arg3 + var28.field1604 * arg2) / (var28.field1607 * var7) + arg0;
                var8.field1791[var15] = method2072(var29);
                class96 var30;
                if (this.field1694 == null || this.field1694[this.field1670[var15]] == null) {
                    var30 = this.field1696[this.field1670[var15]];
                } else {
                    var30 = this.field1694[this.field1670[var15]];
                }
                int var31 = (var30.field1608 * arg4 + var30.field1605 * arg3 + var30.field1604 * arg2) / (var30.field1607 * var7) + arg0;
                var8.field1841[var15] = method2072(var31);
                class96 var32;
                if (this.field1694 == null || this.field1694[this.field1671[var15]] == null) {
                    var32 = this.field1696[this.field1671[var15]];
                } else {
                    var32 = this.field1694[this.field1671[var15]];
                }
                int var33 = (var32.field1608 * arg4 + var32.field1605 * arg3 + var32.field1604 * arg2) / (var32.field1607 * var7) + arg0;
                var8.field1804[var15] = method2072(var33);
            } else if (var16 == 1) {
                class84 var34 = this.field1695[var15];
                int var35 = (var34.field1436 * arg4 + var34.field1440 * arg2 + var34.field1437 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1791[var15] = method2072(var35);
                var8.field1804[var15] = -1;
            } else {
                var8.field1804[var15] = -2;
            }
        }
        this.method2060();
        var8.field1811 = this.field1678;
        var8.field1784 = this.field1665;
        var8.field1813 = this.field1680;
        var8.field1814 = this.field1667;
        var8.field1787 = this.field1684;
        var8.field1788 = this.field1669;
        var8.field1789 = this.field1670;
        var8.field1790 = this.field1671;
        var8.field1794 = this.field1673;
        var8.field1795 = this.field1681;
        var8.field1798 = this.field1707;
        var8.field1782 = this.field1693;
        var8.field1805 = this.field1682;
        var8.field1786 = this.field1677;
        return var8;
    }

    @ObfuscatedName("ca.b(II)I")
    public static final int method2075(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("ca.t(I)I")
    public static final int method2072(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
