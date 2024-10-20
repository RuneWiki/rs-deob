package deob;

@ObfuscatedName("cg")
public class class100 extends class85 {

    @ObfuscatedName("cg.k")
    public int field1657 = 0;

    @ObfuscatedName("cg.h")
    public int[] field1652;

    @ObfuscatedName("cg.o")
    public int[] field1653;

    @ObfuscatedName("cg.z")
    public int[] field1654;

    @ObfuscatedName("cg.c")
    public int field1651 = 0;

    @ObfuscatedName("cg.d")
    public int[] field1684;

    @ObfuscatedName("cg.l")
    public int[] field1668;

    @ObfuscatedName("cg.b")
    public int[] field1658;

    @ObfuscatedName("cg.j")
    public byte[] field1663;

    @ObfuscatedName("cg.f")
    public byte[] field1660;

    @ObfuscatedName("cg.i")
    public byte[] field1661;

    @ObfuscatedName("cg.g")
    public byte[] field1662;

    @ObfuscatedName("cg.t")
    public short[] field1667;

    @ObfuscatedName("cg.e")
    public short[] field1675;

    @ObfuscatedName("cg.q")
    public byte field1665 = 0;

    @ObfuscatedName("cg.u")
    public int field1666;

    @ObfuscatedName("cg.r")
    public byte[] field1672;

    @ObfuscatedName("cg.a")
    public short[] field1685;

    @ObfuscatedName("cg.m")
    public short[] field1669;

    @ObfuscatedName("cg.y")
    public short[] field1670;

    @ObfuscatedName("cg.x")
    public short[] field1664;

    @ObfuscatedName("cg.n")
    public short[] field1682;

    @ObfuscatedName("cg.v")
    public short[] field1673;

    @ObfuscatedName("cg.s")
    public short[] field1674;

    @ObfuscatedName("cg.w")
    public short[] field1696;

    @ObfuscatedName("cg.p")
    public short[] field1676;

    @ObfuscatedName("cg.ao")
    public byte[] field1677;

    @ObfuscatedName("cg.ae")
    public int[] field1678;

    @ObfuscatedName("cg.ay")
    public int[] field1679;

    @ObfuscatedName("cg.ad")
    public int[][] field1680;

    @ObfuscatedName("cg.as")
    public int[][] field1681;

    @ObfuscatedName("cg.ag")
    public class84[] field1659;

    @ObfuscatedName("cg.au")
    public class96[] field1683;

    @ObfuscatedName("cg.ar")
    public class96[] field1655;

    @ObfuscatedName("cg.az")
    public short field1694;

    @ObfuscatedName("cg.aw")
    public short field1686;

    @ObfuscatedName("cg.at")
    public boolean field1671 = false;

    @ObfuscatedName("cg.ap")
    public int field1688;

    @ObfuscatedName("cg.al")
    public int field1689;

    @ObfuscatedName("cg.aq")
    public int field1690;

    @ObfuscatedName("cg.aa")
    public int field1691;

    @ObfuscatedName("cg.ax")
    public int field1692;

    @ObfuscatedName("cg.ah")
    public static int[] field1693 = new int[10000];

    @ObfuscatedName("cg.av")
    public static int[] field1656 = new int[10000];

    @ObfuscatedName("cg.af")
    public static int field1695 = 0;

    @ObfuscatedName("cg.ai")
    public static int[] field1687 = class91.field1555;

    @ObfuscatedName("cg.ak")
    public static int[] field1697 = class91.field1556;

    public class100() {
    }

    @ObfuscatedName("cg.k(Lfo;II)Lcg;")
    public static class100 method2051(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3118(arg1, arg2);
        return var3 == null ? null : new class100(var3);
    }

    public class100(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2115(arg0);
        } else {
            this.method2054(arg0);
        }
    }

    @ObfuscatedName("cg.h([B)V")
    public void method2115(byte[] arg0) {
        class119 var2 = new class119(arg0);
        class119 var3 = new class119(arg0);
        class119 var4 = new class119(arg0);
        class119 var5 = new class119(arg0);
        class119 var6 = new class119(arg0);
        class119 var7 = new class119(arg0);
        class119 var8 = new class119(arg0);
        var2.field1949 = arg0.length - 23;
        int var9 = var2.method2332();
        int var10 = var2.method2332();
        int var11 = var2.method2330();
        int var12 = var2.method2330();
        int var13 = var2.method2330();
        int var14 = var2.method2330();
        int var15 = var2.method2330();
        int var16 = var2.method2330();
        int var17 = var2.method2330();
        int var18 = var2.method2332();
        int var19 = var2.method2332();
        int var20 = var2.method2332();
        int var21 = var2.method2332();
        int var22 = var2.method2332();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1672 = new byte[var11];
            var2.field1949 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1672[var26] = var2.method2413();
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
        this.field1651 = var10;
        this.field1666 = var11;
        this.field1652 = new int[var9];
        this.field1653 = new int[var9];
        this.field1654 = new int[var9];
        this.field1684 = new int[var10];
        this.field1668 = new int[var10];
        this.field1658 = new int[var10];
        if (var17 == 1) {
            this.field1678 = new int[var9];
        }
        if (var12 == 1) {
            this.field1663 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1660 = new byte[var10];
        } else {
            this.field1665 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1661 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1679 = new int[var10];
        }
        if (var16 == 1) {
            this.field1675 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1662 = new byte[var10];
        }
        this.field1667 = new short[var10];
        if (var11 > 0) {
            this.field1685 = new short[var11];
            this.field1669 = new short[var11];
            this.field1670 = new short[var11];
            if (var24 > 0) {
                this.field1664 = new short[var24];
                this.field1682 = new short[var24];
                this.field1673 = new short[var24];
                this.field1674 = new short[var24];
                this.field1677 = new byte[var24];
                this.field1696 = new short[var24];
            }
            if (var25 > 0) {
                this.field1676 = new short[var25];
            }
        }
        var2.field1949 = var11;
        var3.field1949 = var44;
        var4.field1949 = var46;
        var5.field1949 = var48;
        var6.field1949 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2330();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2341();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2341();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2341();
            }
            this.field1652[var67] = var64 + var69;
            this.field1653[var67] = var65 + var70;
            this.field1654[var67] = var66 + var71;
            var64 = this.field1652[var67];
            var65 = this.field1653[var67];
            var66 = this.field1654[var67];
            if (var17 == 1) {
                this.field1678[var67] = var6.method2330();
            }
        }
        var2.field1949 = var42;
        var3.field1949 = var31;
        var4.field1949 = var34;
        var5.field1949 = var37;
        var6.field1949 = var35;
        var7.field1949 = var40;
        var8.field1949 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1667[var72] = (short) var2.method2332();
            if (var12 == 1) {
                this.field1663[var72] = var3.method2413();
            }
            if (var13 == 255) {
                this.field1660[var72] = var4.method2413();
            }
            if (var14 == 1) {
                this.field1661[var72] = var5.method2413();
            }
            if (var15 == 1) {
                this.field1679[var72] = var6.method2330();
            }
            if (var16 == 1) {
                this.field1675[var72] = (short) (var7.method2332() - 1);
            }
            if (this.field1662 != null && this.field1675[var72] != -1) {
                this.field1662[var72] = (byte) (var8.method2330() - 1);
            }
        }
        var2.field1949 = var33;
        var3.field1949 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2330();
            if (var78 == 1) {
                var73 = var2.method2341() + var76;
                var74 = var2.method2341() + var73;
                var75 = var2.method2341() + var74;
                var76 = var75;
                this.field1684[var77] = var73;
                this.field1668[var77] = var74;
                this.field1658[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2341() + var76;
                var76 = var75;
                this.field1684[var77] = var73;
                this.field1668[var77] = var74;
                this.field1658[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2341() + var76;
                var76 = var75;
                this.field1684[var77] = var73;
                this.field1668[var77] = var74;
                this.field1658[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2341() + var76;
                var76 = var75;
                this.field1684[var77] = var73;
                this.field1668[var77] = var81;
                this.field1658[var77] = var75;
            }
        }
        var2.field1949 = var50;
        var3.field1949 = var52;
        var4.field1949 = var54;
        var5.field1949 = var56;
        var6.field1949 = var58;
        var7.field1949 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1672[var82] & 0xFF;
            if (var83 == 0) {
                this.field1685[var82] = (short) var2.method2332();
                this.field1669[var82] = (short) var2.method2332();
                this.field1670[var82] = (short) var2.method2332();
            }
            if (var83 == 1) {
                this.field1685[var82] = (short) var3.method2332();
                this.field1669[var82] = (short) var3.method2332();
                this.field1670[var82] = (short) var3.method2332();
                this.field1664[var82] = (short) var4.method2332();
                this.field1682[var82] = (short) var4.method2332();
                this.field1673[var82] = (short) var4.method2332();
                this.field1674[var82] = (short) var5.method2332();
                this.field1677[var82] = var6.method2413();
                this.field1696[var82] = (short) var7.method2332();
            }
            if (var83 == 2) {
                this.field1685[var82] = (short) var3.method2332();
                this.field1669[var82] = (short) var3.method2332();
                this.field1670[var82] = (short) var3.method2332();
                this.field1664[var82] = (short) var4.method2332();
                this.field1682[var82] = (short) var4.method2332();
                this.field1673[var82] = (short) var4.method2332();
                this.field1674[var82] = (short) var5.method2332();
                this.field1677[var82] = var6.method2413();
                this.field1696[var82] = (short) var7.method2332();
                this.field1676[var82] = (short) var7.method2332();
            }
            if (var83 == 3) {
                this.field1685[var82] = (short) var3.method2332();
                this.field1669[var82] = (short) var3.method2332();
                this.field1670[var82] = (short) var3.method2332();
                this.field1664[var82] = (short) var4.method2332();
                this.field1682[var82] = (short) var4.method2332();
                this.field1673[var82] = (short) var4.method2332();
                this.field1674[var82] = (short) var5.method2332();
                this.field1677[var82] = var6.method2413();
                this.field1696[var82] = (short) var7.method2332();
            }
        }
        var2.field1949 = var62;
        int var84 = var2.method2330();
        if (var84 == 0) {
            return;
        }
        new class90();
        var2.method2332();
        var2.method2332();
        var2.method2332();
        var2.method2415();
    }

    @ObfuscatedName("cg.z([B)V")
    public void method2054(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class119 var4 = new class119(arg0);
        class119 var5 = new class119(arg0);
        class119 var6 = new class119(arg0);
        class119 var7 = new class119(arg0);
        class119 var8 = new class119(arg0);
        var4.field1949 = arg0.length - 18;
        int var9 = var4.method2332();
        int var10 = var4.method2332();
        int var11 = var4.method2330();
        int var12 = var4.method2330();
        int var13 = var4.method2330();
        int var14 = var4.method2330();
        int var15 = var4.method2330();
        int var16 = var4.method2330();
        int var17 = var4.method2332();
        int var18 = var4.method2332();
        int var19 = var4.method2332();
        int var20 = var4.method2332();
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
        this.field1651 = var10;
        this.field1666 = var11;
        this.field1652 = new int[var9];
        this.field1653 = new int[var9];
        this.field1654 = new int[var9];
        this.field1684 = new int[var10];
        this.field1668 = new int[var10];
        this.field1658 = new int[var10];
        if (var11 > 0) {
            this.field1672 = new byte[var11];
            this.field1685 = new short[var11];
            this.field1669 = new short[var11];
            this.field1670 = new short[var11];
        }
        if (var16 == 1) {
            this.field1678 = new int[var9];
        }
        if (var12 == 1) {
            this.field1663 = new byte[var10];
            this.field1662 = new byte[var10];
            this.field1675 = new short[var10];
        }
        if (var13 == 255) {
            this.field1660 = new byte[var10];
        } else {
            this.field1665 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1661 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1679 = new int[var10];
        }
        this.field1667 = new short[var10];
        var4.field1949 = var21;
        var5.field1949 = var36;
        var6.field1949 = var38;
        var7.field1949 = var40;
        var8.field1949 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2330();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2341();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2341();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2341();
            }
            this.field1652[var46] = var43 + var48;
            this.field1653[var46] = var44 + var49;
            this.field1654[var46] = var45 + var50;
            var43 = this.field1652[var46];
            var44 = this.field1653[var46];
            var45 = this.field1654[var46];
            if (var16 == 1) {
                this.field1678[var46] = var8.method2330();
            }
        }
        var4.field1949 = var32;
        var5.field1949 = var28;
        var6.field1949 = var26;
        var7.field1949 = var30;
        var8.field1949 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1667[var51] = (short) var4.method2332();
            if (var12 == 1) {
                int var52 = var5.method2330();
                if ((var52 & 0x1) == 1) {
                    this.field1663[var51] = 1;
                    var2 = true;
                } else {
                    this.field1663[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1662[var51] = (byte) (var52 >> 2);
                    this.field1675[var51] = this.field1667[var51];
                    this.field1667[var51] = 127;
                    if (this.field1675[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1662[var51] = -1;
                    this.field1675[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1660[var51] = var6.method2413();
            }
            if (var14 == 1) {
                this.field1661[var51] = var7.method2413();
            }
            if (var15 == 1) {
                this.field1679[var51] = var8.method2330();
            }
        }
        var4.field1949 = var25;
        var5.field1949 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2330();
            if (var58 == 1) {
                var53 = var4.method2341() + var56;
                var54 = var4.method2341() + var53;
                var55 = var4.method2341() + var54;
                var56 = var55;
                this.field1684[var57] = var53;
                this.field1668[var57] = var54;
                this.field1658[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2341() + var56;
                var56 = var55;
                this.field1684[var57] = var53;
                this.field1668[var57] = var54;
                this.field1658[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2341() + var56;
                var56 = var55;
                this.field1684[var57] = var53;
                this.field1668[var57] = var54;
                this.field1658[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2341() + var56;
                var56 = var55;
                this.field1684[var57] = var53;
                this.field1668[var57] = var61;
                this.field1658[var57] = var55;
            }
        }
        var4.field1949 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1672[var62] = 0;
            this.field1685[var62] = (short) var4.method2332();
            this.field1669[var62] = (short) var4.method2332();
            this.field1670[var62] = (short) var4.method2332();
        }
        if (this.field1662 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1662[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1685[var65] & 0xFFFF) == this.field1684[var64] && (this.field1669[var65] & 0xFFFF) == this.field1668[var64] && (this.field1670[var65] & 0xFFFF) == this.field1658[var64]) {
                        this.field1662[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1662 = null;
            }
        }
        if (!var3) {
            this.field1675 = null;
        }
        if (!var2) {
            this.field1663 = null;
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
        this.field1651 = 0;
        this.field1666 = 0;
        this.field1665 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class100 var10 = arg0[var9];
            if (var10 != null) {
                this.field1657 += var10.field1657;
                this.field1651 += var10.field1651;
                this.field1666 += var10.field1666;
                if (var10.field1660 == null) {
                    if (this.field1665 == -1) {
                        this.field1665 = var10.field1665;
                    }
                    if (this.field1665 != var10.field1665) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1663 != null;
                var5 |= var10.field1661 != null;
                var6 |= var10.field1679 != null;
                var7 |= var10.field1675 != null;
                var8 |= var10.field1662 != null;
            }
        }
        this.field1652 = new int[this.field1657];
        this.field1653 = new int[this.field1657];
        this.field1654 = new int[this.field1657];
        this.field1678 = new int[this.field1657];
        this.field1684 = new int[this.field1651];
        this.field1668 = new int[this.field1651];
        this.field1658 = new int[this.field1651];
        if (var3) {
            this.field1663 = new byte[this.field1651];
        }
        if (var4) {
            this.field1660 = new byte[this.field1651];
        }
        if (var5) {
            this.field1661 = new byte[this.field1651];
        }
        if (var6) {
            this.field1679 = new int[this.field1651];
        }
        if (var7) {
            this.field1675 = new short[this.field1651];
        }
        if (var8) {
            this.field1662 = new byte[this.field1651];
        }
        this.field1667 = new short[this.field1651];
        if (this.field1666 > 0) {
            this.field1672 = new byte[this.field1666];
            this.field1685 = new short[this.field1666];
            this.field1669 = new short[this.field1666];
            this.field1670 = new short[this.field1666];
            this.field1664 = new short[this.field1666];
            this.field1682 = new short[this.field1666];
            this.field1673 = new short[this.field1666];
            this.field1674 = new short[this.field1666];
            this.field1677 = new byte[this.field1666];
            this.field1696 = new short[this.field1666];
            this.field1676 = new short[this.field1666];
        }
        this.field1657 = 0;
        this.field1651 = 0;
        this.field1666 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class100 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1651; var13++) {
                    if (var3 && var12.field1663 != null) {
                        this.field1663[this.field1651] = var12.field1663[var13];
                    }
                    if (var4) {
                        if (var12.field1660 == null) {
                            this.field1660[this.field1651] = var12.field1665;
                        } else {
                            this.field1660[this.field1651] = var12.field1660[var13];
                        }
                    }
                    if (var5 && var12.field1661 != null) {
                        this.field1661[this.field1651] = var12.field1661[var13];
                    }
                    if (var6 && var12.field1679 != null) {
                        this.field1679[this.field1651] = var12.field1679[var13];
                    }
                    if (var7) {
                        if (var12.field1675 == null) {
                            this.field1675[this.field1651] = -1;
                        } else {
                            this.field1675[this.field1651] = var12.field1675[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1662 == null || var12.field1662[var13] == -1) {
                            this.field1662[this.field1651] = -1;
                        } else {
                            this.field1662[this.field1651] = (byte) (var12.field1662[var13] + this.field1666);
                        }
                    }
                    this.field1667[this.field1651] = var12.field1667[var13];
                    this.field1684[this.field1651] = this.method2055(var12, var12.field1684[var13]);
                    this.field1668[this.field1651] = this.method2055(var12, var12.field1668[var13]);
                    this.field1658[this.field1651] = this.method2055(var12, var12.field1658[var13]);
                    this.field1651++;
                }
                for (int var14 = 0; var14 < var12.field1666; var14++) {
                    byte var15 = this.field1672[this.field1666] = var12.field1672[var14];
                    if (var15 == 0) {
                        this.field1685[this.field1666] = (short) this.method2055(var12, var12.field1685[var14]);
                        this.field1669[this.field1666] = (short) this.method2055(var12, var12.field1669[var14]);
                        this.field1670[this.field1666] = (short) this.method2055(var12, var12.field1670[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1685[this.field1666] = var12.field1685[var14];
                        this.field1669[this.field1666] = var12.field1669[var14];
                        this.field1670[this.field1666] = var12.field1670[var14];
                        this.field1664[this.field1666] = var12.field1664[var14];
                        this.field1682[this.field1666] = var12.field1682[var14];
                        this.field1673[this.field1666] = var12.field1673[var14];
                        this.field1674[this.field1666] = var12.field1674[var14];
                        this.field1677[this.field1666] = var12.field1677[var14];
                        this.field1696[this.field1666] = var12.field1696[var14];
                    }
                    if (var15 == 2) {
                        this.field1676[this.field1666] = var12.field1676[var14];
                    }
                    this.field1666++;
                }
            }
        }
    }

    @ObfuscatedName("cg.c(Lcg;I)I")
    public final int method2055(class100 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1652[arg1];
        int var5 = arg0.field1653[arg1];
        int var6 = arg0.field1654[arg1];
        for (int var7 = 0; var7 < this.field1657; var7++) {
            if (this.field1652[var7] == var4 && this.field1653[var7] == var5 && this.field1654[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1652[this.field1657] = var4;
            this.field1653[this.field1657] = var5;
            this.field1654[this.field1657] = var6;
            if (arg0.field1678 != null) {
                this.field1678[this.field1657] = arg0.field1678[arg1];
            }
            var3 = this.field1657++;
        }
        return var3;
    }

    public class100(class100 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1657 = arg0.field1657;
        this.field1651 = arg0.field1651;
        this.field1666 = arg0.field1666;
        if (arg1) {
            this.field1652 = arg0.field1652;
            this.field1653 = arg0.field1653;
            this.field1654 = arg0.field1654;
        } else {
            this.field1652 = new int[this.field1657];
            this.field1653 = new int[this.field1657];
            this.field1654 = new int[this.field1657];
            for (int var6 = 0; var6 < this.field1657; var6++) {
                this.field1652[var6] = arg0.field1652[var6];
                this.field1653[var6] = arg0.field1653[var6];
                this.field1654[var6] = arg0.field1654[var6];
            }
        }
        if (arg2) {
            this.field1667 = arg0.field1667;
        } else {
            this.field1667 = new short[this.field1651];
            for (int var7 = 0; var7 < this.field1651; var7++) {
                this.field1667[var7] = arg0.field1667[var7];
            }
        }
        if (arg3 || arg0.field1675 == null) {
            this.field1675 = arg0.field1675;
        } else {
            this.field1675 = new short[this.field1651];
            for (int var8 = 0; var8 < this.field1651; var8++) {
                this.field1675[var8] = arg0.field1675[var8];
            }
        }
        if (arg4) {
            this.field1661 = arg0.field1661;
        } else {
            this.field1661 = new byte[this.field1651];
            if (arg0.field1661 == null) {
                for (int var9 = 0; var9 < this.field1651; var9++) {
                    this.field1661[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1651; var10++) {
                    this.field1661[var10] = arg0.field1661[var10];
                }
            }
        }
        this.field1684 = arg0.field1684;
        this.field1668 = arg0.field1668;
        this.field1658 = arg0.field1658;
        this.field1663 = arg0.field1663;
        this.field1660 = arg0.field1660;
        this.field1662 = arg0.field1662;
        this.field1665 = arg0.field1665;
        this.field1672 = arg0.field1672;
        this.field1685 = arg0.field1685;
        this.field1669 = arg0.field1669;
        this.field1670 = arg0.field1670;
        this.field1664 = arg0.field1664;
        this.field1682 = arg0.field1682;
        this.field1673 = arg0.field1673;
        this.field1674 = arg0.field1674;
        this.field1677 = arg0.field1677;
        this.field1696 = arg0.field1696;
        this.field1676 = arg0.field1676;
        this.field1678 = arg0.field1678;
        this.field1679 = arg0.field1679;
        this.field1680 = arg0.field1680;
        this.field1681 = arg0.field1681;
        this.field1683 = arg0.field1683;
        this.field1659 = arg0.field1659;
        this.field1655 = arg0.field1655;
        this.field1694 = arg0.field1694;
        this.field1686 = arg0.field1686;
    }

    @ObfuscatedName("cg.d()Lcg;")
    public class100 method2056() {
        class100 var1 = new class100();
        if (this.field1663 != null) {
            var1.field1663 = new byte[this.field1651];
            for (int var2 = 0; var2 < this.field1651; var2++) {
                var1.field1663[var2] = this.field1663[var2];
            }
        }
        var1.field1657 = this.field1657;
        var1.field1651 = this.field1651;
        var1.field1666 = this.field1666;
        var1.field1652 = this.field1652;
        var1.field1653 = this.field1653;
        var1.field1654 = this.field1654;
        var1.field1684 = this.field1684;
        var1.field1668 = this.field1668;
        var1.field1658 = this.field1658;
        var1.field1660 = this.field1660;
        var1.field1661 = this.field1661;
        var1.field1662 = this.field1662;
        var1.field1667 = this.field1667;
        var1.field1675 = this.field1675;
        var1.field1665 = this.field1665;
        var1.field1672 = this.field1672;
        var1.field1685 = this.field1685;
        var1.field1669 = this.field1669;
        var1.field1670 = this.field1670;
        var1.field1664 = this.field1664;
        var1.field1682 = this.field1682;
        var1.field1673 = this.field1673;
        var1.field1674 = this.field1674;
        var1.field1677 = this.field1677;
        var1.field1696 = this.field1696;
        var1.field1676 = this.field1676;
        var1.field1678 = this.field1678;
        var1.field1679 = this.field1679;
        var1.field1680 = this.field1680;
        var1.field1681 = this.field1681;
        var1.field1683 = this.field1683;
        var1.field1659 = this.field1659;
        var1.field1694 = this.field1694;
        var1.field1686 = this.field1686;
        return var1;
    }

    @ObfuscatedName("cg.l([[IIIIZI)Lcg;")
    public class100 method2050(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2108();
        int var7 = this.field1689 + arg1;
        int var8 = this.field1690 + arg1;
        int var9 = this.field1692 + arg3;
        int var10 = this.field1691 + arg3;
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
            var15.field1651 = this.field1651;
            var15.field1666 = this.field1666;
            var15.field1652 = this.field1652;
            var15.field1654 = this.field1654;
            var15.field1684 = this.field1684;
            var15.field1668 = this.field1668;
            var15.field1658 = this.field1658;
            var15.field1663 = this.field1663;
            var15.field1660 = this.field1660;
            var15.field1661 = this.field1661;
            var15.field1662 = this.field1662;
            var15.field1667 = this.field1667;
            var15.field1675 = this.field1675;
            var15.field1665 = this.field1665;
            var15.field1672 = this.field1672;
            var15.field1685 = this.field1685;
            var15.field1669 = this.field1669;
            var15.field1670 = this.field1670;
            var15.field1664 = this.field1664;
            var15.field1682 = this.field1682;
            var15.field1673 = this.field1673;
            var15.field1674 = this.field1674;
            var15.field1677 = this.field1677;
            var15.field1696 = this.field1696;
            var15.field1676 = this.field1676;
            var15.field1678 = this.field1678;
            var15.field1679 = this.field1679;
            var15.field1680 = this.field1680;
            var15.field1681 = this.field1681;
            var15.field1694 = this.field1694;
            var15.field1686 = this.field1686;
            var15.field1653 = new int[var15.field1657];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1657; var16++) {
                int var17 = this.field1652[var16] + arg1;
                int var18 = this.field1654[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1653[var16] = this.field1653[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1657; var26++) {
                int var27 = (-this.field1653[var26] << 16) / this.field1420;
                if (var27 < arg5) {
                    int var28 = this.field1652[var26] + arg1;
                    int var29 = this.field1654[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1653[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1653[var26];
                }
            }
        }
        var15.method2069();
        return var15;
    }

    @ObfuscatedName("cg.b()V")
    public void method2058() {
        int var10002;
        if (this.field1678 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1657; var3++) {
                int var4 = this.field1678[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1680 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1680[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1657) {
                int var7 = this.field1678[var6];
                this.field1680[var7][var1[var7]++] = var6++;
            }
            this.field1678 = null;
        }
        if (this.field1679 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1651; var10++) {
            int var11 = this.field1679[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1681 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1681[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1651) {
            int var14 = this.field1679[var13];
            this.field1681[var14][var8[var14]++] = var13++;
        }
        this.field1679 = null;
    }

    @ObfuscatedName("cg.j()V")
    public void method2059() {
        for (int var1 = 0; var1 < this.field1657; var1++) {
            int var2 = this.field1652[var1];
            this.field1652[var1] = this.field1654[var1];
            this.field1654[var1] = -var2;
        }
        this.method2069();
    }

    @ObfuscatedName("cg.f()V")
    public void method2071() {
        for (int var1 = 0; var1 < this.field1657; var1++) {
            this.field1652[var1] = -this.field1652[var1];
            this.field1654[var1] = -this.field1654[var1];
        }
        this.method2069();
    }

    @ObfuscatedName("cg.t()V")
    public void method2061() {
        for (int var1 = 0; var1 < this.field1657; var1++) {
            int var2 = this.field1654[var1];
            this.field1654[var1] = this.field1652[var1];
            this.field1652[var1] = -var2;
        }
        this.method2069();
    }

    @ObfuscatedName("cg.e(I)V")
    public void method2062(int arg0) {
        int var2 = field1687[arg0];
        int var3 = field1697[arg0];
        for (int var4 = 0; var4 < this.field1657; var4++) {
            int var5 = this.field1654[var4] * var2 + this.field1652[var4] * var3 >> 16;
            this.field1654[var4] = this.field1654[var4] * var3 - this.field1652[var4] * var2 >> 16;
            this.field1652[var4] = var5;
        }
        this.method2069();
    }

    @ObfuscatedName("cg.q(III)V")
    public void method2120(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1657; var4++) {
            this.field1652[var4] += arg0;
            this.field1653[var4] += arg1;
            this.field1654[var4] += arg2;
        }
        this.method2069();
    }

    @ObfuscatedName("cg.u(SS)V")
    public void method2064(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1651; var3++) {
            if (this.field1667[var3] == arg0) {
                this.field1667[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cg.r(SS)V")
    public void method2070(short arg0, short arg1) {
        if (this.field1675 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1651; var3++) {
            if (this.field1675[var3] == arg0) {
                this.field1675[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cg.a()V")
    public void method2066() {
        for (int var1 = 0; var1 < this.field1657; var1++) {
            this.field1654[var1] = -this.field1654[var1];
        }
        for (int var2 = 0; var2 < this.field1651; var2++) {
            int var3 = this.field1684[var2];
            this.field1684[var2] = this.field1658[var2];
            this.field1658[var2] = var3;
        }
        this.method2069();
    }

    @ObfuscatedName("cg.m(III)V")
    public void method2067(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1657; var4++) {
            this.field1652[var4] = this.field1652[var4] * arg0 / 128;
            this.field1653[var4] = this.field1653[var4] * arg1 / 128;
            this.field1654[var4] = this.field1654[var4] * arg2 / 128;
        }
        this.method2069();
    }

    @ObfuscatedName("cg.y()V")
    public void method2068() {
        if (this.field1683 != null) {
            return;
        }
        this.field1683 = new class96[this.field1657];
        for (int var1 = 0; var1 < this.field1657; var1++) {
            this.field1683[var1] = new class96();
        }
        for (int var2 = 0; var2 < this.field1651; var2++) {
            int var3 = this.field1684[var2];
            int var4 = this.field1668[var2];
            int var5 = this.field1658[var2];
            int var6 = this.field1652[var4] - this.field1652[var3];
            int var7 = this.field1653[var4] - this.field1653[var3];
            int var8 = this.field1654[var4] - this.field1654[var3];
            int var9 = this.field1652[var5] - this.field1652[var3];
            int var10 = this.field1653[var5] - this.field1653[var3];
            int var11 = this.field1654[var5] - this.field1654[var3];
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
            if (this.field1663 == null) {
                var19 = 0;
            } else {
                var19 = this.field1663[var2];
            }
            if (var19 == 0) {
                class96 var20 = this.field1683[var3];
                var20.field1595 += var16;
                var20.field1598 += var17;
                var20.field1597 += var18;
                var20.field1596++;
                class96 var21 = this.field1683[var4];
                var21.field1595 += var16;
                var21.field1598 += var17;
                var21.field1597 += var18;
                var21.field1596++;
                class96 var22 = this.field1683[var5];
                var22.field1595 += var16;
                var22.field1598 += var17;
                var22.field1597 += var18;
                var22.field1596++;
            } else if (var19 == 1) {
                if (this.field1659 == null) {
                    this.field1659 = new class84[this.field1651];
                }
                class84 var23 = this.field1659[var2] = new class84();
                var23.field1414 = var16;
                var23.field1415 = var17;
                var23.field1417 = var18;
            }
        }
    }

    @ObfuscatedName("cg.x()V")
    public void method2069() {
        this.field1683 = null;
        this.field1655 = null;
        this.field1659 = null;
        this.field1671 = false;
    }

    @ObfuscatedName("cg.n()V")
    public void method2108() {
        if (this.field1671) {
            return;
        }
        this.field1420 = 0;
        this.field1688 = 0;
        this.field1689 = 999999;
        this.field1690 = -999999;
        this.field1691 = -99999;
        this.field1692 = 99999;
        for (int var1 = 0; var1 < this.field1657; var1++) {
            int var2 = this.field1652[var1];
            int var3 = this.field1653[var1];
            int var4 = this.field1654[var1];
            if (var2 < this.field1689) {
                this.field1689 = var2;
            }
            if (var2 > this.field1690) {
                this.field1690 = var2;
            }
            if (var4 < this.field1692) {
                this.field1692 = var4;
            }
            if (var4 > this.field1691) {
                this.field1691 = var4;
            }
            if (-var3 > this.field1420) {
                this.field1420 = -var3;
            }
            if (var3 > this.field1688) {
                this.field1688 = var3;
            }
        }
        this.field1671 = true;
    }

    @ObfuscatedName("cg.v(Lcg;Lcg;IIIZ)V")
    public static void method2060(class100 arg0, class100 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2108();
        arg0.method2068();
        arg1.method2108();
        arg1.method2068();
        field1695++;
        int var6 = 0;
        int[] var7 = arg1.field1652;
        int var8 = arg1.field1657;
        for (int var9 = 0; var9 < arg0.field1657; var9++) {
            class96 var10 = arg0.field1683[var9];
            if (var10.field1596 != 0) {
                int var11 = arg0.field1653[var9] - arg3;
                if (var11 <= arg1.field1688) {
                    int var12 = arg0.field1652[var9] - arg2;
                    if (var12 >= arg1.field1689 && var12 <= arg1.field1690) {
                        int var13 = arg0.field1654[var9] - arg4;
                        if (var13 >= arg1.field1692 && var13 <= arg1.field1691) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class96 var15 = arg1.field1683[var14];
                                if (var7[var14] == var12 && arg1.field1654[var14] == var13 && arg1.field1653[var14] == var11 && var15.field1596 != 0) {
                                    if (arg0.field1655 == null) {
                                        arg0.field1655 = new class96[arg0.field1657];
                                    }
                                    if (arg1.field1655 == null) {
                                        arg1.field1655 = new class96[var8];
                                    }
                                    class96 var16 = arg0.field1655[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1655[var9] = new class96(var10);
                                    }
                                    class96 var17 = arg1.field1655[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1655[var14] = new class96(var15);
                                    }
                                    var16.field1595 += var15.field1595;
                                    var16.field1598 += var15.field1598;
                                    var16.field1597 += var15.field1597;
                                    var16.field1596 += var15.field1596;
                                    var17.field1595 += var10.field1595;
                                    var17.field1598 += var10.field1598;
                                    var17.field1597 += var10.field1597;
                                    var17.field1596 += var10.field1596;
                                    var6++;
                                    field1693[var9] = field1695;
                                    field1656[var14] = field1695;
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
        for (int var18 = 0; var18 < arg0.field1651; var18++) {
            if (field1693[arg0.field1684[var18]] == field1695 && field1693[arg0.field1668[var18]] == field1695 && field1693[arg0.field1658[var18]] == field1695) {
                if (arg0.field1663 == null) {
                    arg0.field1663 = new byte[arg0.field1651];
                }
                arg0.field1663[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1651; var19++) {
            if (field1656[arg1.field1684[var19]] == field1695 && field1656[arg1.field1668[var19]] == field1695 && field1656[arg1.field1658[var19]] == field1695) {
                if (arg1.field1663 == null) {
                    arg1.field1663 = new byte[arg1.field1651];
                }
                arg1.field1663[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cg.s(IIIII)Ldl;")
    public final class105 method2089(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2068();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class105 var8 = new class105();
        var8.field1771 = new int[this.field1651];
        var8.field1772 = new int[this.field1651];
        var8.field1773 = new int[this.field1651];
        if (this.field1666 > 0 && this.field1662 != null) {
            int[] var9 = new int[this.field1666];
            for (int var10 = 0; var10 < this.field1651; var10++) {
                if (this.field1662[var10] != -1) {
                    var9[this.field1662[var10] & 0xFF]++;
                }
            }
            var8.field1779 = 0;
            for (int var11 = 0; var11 < this.field1666; var11++) {
                if (var9[var11] > 0 && this.field1672[var11] == 0) {
                    var8.field1779++;
                }
            }
            var8.field1759 = new int[var8.field1779];
            var8.field1781 = new int[var8.field1779];
            var8.field1788 = new int[var8.field1779];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1666; var13++) {
                if (var9[var13] > 0 && this.field1672[var13] == 0) {
                    var8.field1759[var12] = this.field1685[var13] & 0xFFFF;
                    var8.field1781[var12] = this.field1669[var13] & 0xFFFF;
                    var8.field1788[var12] = this.field1670[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1782 = new byte[this.field1651];
            for (int var14 = 0; var14 < this.field1651; var14++) {
                if (this.field1662[var14] == -1) {
                    var8.field1782[var14] = -1;
                } else {
                    var8.field1782[var14] = (byte) var9[this.field1662[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1651; var15++) {
            byte var16;
            if (this.field1663 == null) {
                var16 = 0;
            } else {
                var16 = this.field1663[var15];
            }
            byte var17;
            if (this.field1661 == null) {
                var17 = 0;
            } else {
                var17 = this.field1661[var15];
            }
            short var18;
            if (this.field1675 == null) {
                var18 = -1;
            } else {
                var18 = this.field1675[var15];
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
                    class96 var20;
                    if (this.field1655 == null || this.field1655[this.field1684[var15]] == null) {
                        var20 = this.field1683[this.field1684[var15]];
                    } else {
                        var20 = this.field1655[this.field1684[var15]];
                    }
                    int var21 = (var20.field1597 * arg4 + var20.field1598 * arg3 + var20.field1595 * arg2) / (var20.field1596 * var7) + arg0;
                    var8.field1771[var15] = method2072(var19, var21);
                    class96 var22;
                    if (this.field1655 == null || this.field1655[this.field1668[var15]] == null) {
                        var22 = this.field1683[this.field1668[var15]];
                    } else {
                        var22 = this.field1655[this.field1668[var15]];
                    }
                    int var23 = (var22.field1597 * arg4 + var22.field1598 * arg3 + var22.field1595 * arg2) / (var22.field1596 * var7) + arg0;
                    var8.field1772[var15] = method2072(var19, var23);
                    class96 var24;
                    if (this.field1655 == null || this.field1655[this.field1658[var15]] == null) {
                        var24 = this.field1683[this.field1658[var15]];
                    } else {
                        var24 = this.field1655[this.field1658[var15]];
                    }
                    int var25 = (var24.field1597 * arg4 + var24.field1598 * arg3 + var24.field1595 * arg2) / (var24.field1596 * var7) + arg0;
                    var8.field1773[var15] = method2072(var19, var25);
                } else if (var16 == 1) {
                    class84 var26 = this.field1659[var15];
                    int var27 = (var26.field1417 * arg4 + var26.field1415 * arg3 + var26.field1414 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field1771[var15] = method2072(this.field1667[var15] & 0xFFFF, var27);
                    var8.field1773[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1771[var15] = 128;
                    var8.field1773[var15] = -1;
                } else {
                    var8.field1773[var15] = -2;
                }
            } else if (var16 == 0) {
                class96 var28;
                if (this.field1655 == null || this.field1655[this.field1684[var15]] == null) {
                    var28 = this.field1683[this.field1684[var15]];
                } else {
                    var28 = this.field1655[this.field1684[var15]];
                }
                int var29 = (var28.field1597 * arg4 + var28.field1598 * arg3 + var28.field1595 * arg2) / (var28.field1596 * var7) + arg0;
                var8.field1771[var15] = method2073(var29);
                class96 var30;
                if (this.field1655 == null || this.field1655[this.field1668[var15]] == null) {
                    var30 = this.field1683[this.field1668[var15]];
                } else {
                    var30 = this.field1655[this.field1668[var15]];
                }
                int var31 = (var30.field1597 * arg4 + var30.field1598 * arg3 + var30.field1595 * arg2) / (var30.field1596 * var7) + arg0;
                var8.field1772[var15] = method2073(var31);
                class96 var32;
                if (this.field1655 == null || this.field1655[this.field1658[var15]] == null) {
                    var32 = this.field1683[this.field1658[var15]];
                } else {
                    var32 = this.field1655[this.field1658[var15]];
                }
                int var33 = (var32.field1597 * arg4 + var32.field1598 * arg3 + var32.field1595 * arg2) / (var32.field1596 * var7) + arg0;
                var8.field1773[var15] = method2073(var33);
            } else if (var16 == 1) {
                class84 var34 = this.field1659[var15];
                int var35 = (var34.field1417 * arg4 + var34.field1415 * arg3 + var34.field1414 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field1771[var15] = method2073(var35);
                var8.field1773[var15] = -1;
            } else {
                var8.field1773[var15] = -2;
            }
        }
        this.method2058();
        var8.field1763 = this.field1657;
        var8.field1775 = this.field1652;
        var8.field1765 = this.field1653;
        var8.field1810 = this.field1654;
        var8.field1792 = this.field1651;
        var8.field1796 = this.field1684;
        var8.field1769 = this.field1668;
        var8.field1770 = this.field1658;
        var8.field1774 = this.field1660;
        var8.field1767 = this.field1661;
        var8.field1778 = this.field1665;
        var8.field1783 = this.field1680;
        var8.field1784 = this.field1681;
        var8.field1817 = this.field1675;
        return var8;
    }

    @ObfuscatedName("cg.w(II)I")
    public static final int method2072(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cg.p(I)I")
    public static final int method2073(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
