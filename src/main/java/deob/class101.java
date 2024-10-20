package deob;

@ObfuscatedName("cz")
public class class101 extends class94 {

    @ObfuscatedName("cz.g")
    public int field1681 = 0;

    @ObfuscatedName("cz.h")
    public int[] field1663;

    @ObfuscatedName("cz.s")
    public int[] field1664;

    @ObfuscatedName("cz.o")
    public int[] field1665;

    @ObfuscatedName("cz.p")
    public int field1699 = 0;

    @ObfuscatedName("cz.x")
    public int[] field1667;

    @ObfuscatedName("cz.k")
    public int[] field1668;

    @ObfuscatedName("cz.r")
    public int[] field1669;

    @ObfuscatedName("cz.z")
    public byte[] field1670;

    @ObfuscatedName("cz.n")
    public byte[] field1671;

    @ObfuscatedName("cz.j")
    public byte[] field1702;

    @ObfuscatedName("cz.b")
    public byte[] field1673;

    @ObfuscatedName("cz.t")
    public short[] field1707;

    @ObfuscatedName("cz.q")
    public short[] field1675;

    @ObfuscatedName("cz.e")
    public byte field1703 = 0;

    @ObfuscatedName("cz.l")
    public int field1689;

    @ObfuscatedName("cz.u")
    public byte[] field1678;

    @ObfuscatedName("cz.m")
    public short[] field1679;

    @ObfuscatedName("cz.a")
    public short[] field1672;

    @ObfuscatedName("cz.f")
    public short[] field1674;

    @ObfuscatedName("cz.y")
    public short[] field1682;

    @ObfuscatedName("cz.v")
    public short[] field1676;

    @ObfuscatedName("cz.w")
    public short[] field1684;

    @ObfuscatedName("cz.d")
    public short[] field1685;

    @ObfuscatedName("cz.i")
    public short[] field1686;

    @ObfuscatedName("cz.c")
    public short[] field1680;

    @ObfuscatedName("cz.af")
    public byte[] field1688;

    @ObfuscatedName("cz.aq")
    public int[] field1683;

    @ObfuscatedName("cz.at")
    public int[] field1690;

    @ObfuscatedName("cz.aw")
    public int[][] field1691;

    @ObfuscatedName("cz.ax")
    public int[][] field1692;

    @ObfuscatedName("cz.ak")
    public class92[] field1693;

    @ObfuscatedName("cz.ar")
    public class91[] field1694;

    @ObfuscatedName("cz.az")
    public class91[] field1695;

    @ObfuscatedName("cz.ai")
    public short field1696;

    @ObfuscatedName("cz.aj")
    public short field1704;

    @ObfuscatedName("cz.ap")
    public boolean field1698 = false;

    @ObfuscatedName("cz.av")
    public int field1677;

    @ObfuscatedName("cz.ad")
    public int field1700;

    @ObfuscatedName("cz.ae")
    public int field1701;

    @ObfuscatedName("cz.ah")
    public int field1666;

    @ObfuscatedName("cz.am")
    public int field1687;

    @ObfuscatedName("cz.ay")
    public static int[] field1705 = new int[10000];

    @ObfuscatedName("cz.ag")
    public static int[] field1697 = new int[10000];

    @ObfuscatedName("cz.al")
    public static int field1706 = 0;

    @ObfuscatedName("cz.an")
    public static int[] field1708 = class104.field1755;

    @ObfuscatedName("cz.aa")
    public static int[] field1662 = class104.field1743;

    public class101() {
    }

    @ObfuscatedName("cz.g(Leu;II)Lcz;")
    public static class101 method2085(class153 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3080(arg1, arg2);
        return var3 == null ? null : new class101(var3);
    }

    public class101(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2087(arg0);
        } else {
            this.method2084(arg0);
        }
    }

    @ObfuscatedName("cz.s([B)V")
    public void method2087(byte[] arg0) {
        class127 var2 = new class127(arg0);
        class127 var3 = new class127(arg0);
        class127 var4 = new class127(arg0);
        class127 var5 = new class127(arg0);
        class127 var6 = new class127(arg0);
        class127 var7 = new class127(arg0);
        class127 var8 = new class127(arg0);
        var2.field2027 = arg0.length - 23;
        int var9 = var2.method2501();
        int var10 = var2.method2501();
        int var11 = var2.method2499();
        int var12 = var2.method2499();
        int var13 = var2.method2499();
        int var14 = var2.method2499();
        int var15 = var2.method2499();
        int var16 = var2.method2499();
        int var17 = var2.method2499();
        int var18 = var2.method2501();
        int var19 = var2.method2501();
        int var20 = var2.method2501();
        int var21 = var2.method2501();
        int var22 = var2.method2501();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1678 = new byte[var11];
            var2.field2027 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1678[var26] = var2.method2500();
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
        this.field1681 = var9;
        this.field1699 = var10;
        this.field1689 = var11;
        this.field1663 = new int[var9];
        this.field1664 = new int[var9];
        this.field1665 = new int[var9];
        this.field1667 = new int[var10];
        this.field1668 = new int[var10];
        this.field1669 = new int[var10];
        if (var17 == 1) {
            this.field1683 = new int[var9];
        }
        if (var12 == 1) {
            this.field1670 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1671 = new byte[var10];
        } else {
            this.field1703 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1702 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1690 = new int[var10];
        }
        if (var16 == 1) {
            this.field1675 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1673 = new byte[var10];
        }
        this.field1707 = new short[var10];
        if (var11 > 0) {
            this.field1679 = new short[var11];
            this.field1672 = new short[var11];
            this.field1674 = new short[var11];
            if (var24 > 0) {
                this.field1682 = new short[var24];
                this.field1676 = new short[var24];
                this.field1684 = new short[var24];
                this.field1685 = new short[var24];
                this.field1688 = new byte[var24];
                this.field1686 = new short[var24];
            }
            if (var25 > 0) {
                this.field1680 = new short[var25];
            }
        }
        var2.field2027 = var11;
        var3.field2027 = var44;
        var4.field2027 = var46;
        var5.field2027 = var48;
        var6.field2027 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2499();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2609();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2609();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2609();
            }
            this.field1663[var67] = var64 + var69;
            this.field1664[var67] = var65 + var70;
            this.field1665[var67] = var66 + var71;
            var64 = this.field1663[var67];
            var65 = this.field1664[var67];
            var66 = this.field1665[var67];
            if (var17 == 1) {
                this.field1683[var67] = var6.method2499();
            }
        }
        var2.field2027 = var42;
        var3.field2027 = var31;
        var4.field2027 = var34;
        var5.field2027 = var37;
        var6.field2027 = var35;
        var7.field2027 = var40;
        var8.field2027 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1707[var72] = (short) var2.method2501();
            if (var12 == 1) {
                this.field1670[var72] = var3.method2500();
            }
            if (var13 == 255) {
                this.field1671[var72] = var4.method2500();
            }
            if (var14 == 1) {
                this.field1702[var72] = var5.method2500();
            }
            if (var15 == 1) {
                this.field1690[var72] = var6.method2499();
            }
            if (var16 == 1) {
                this.field1675[var72] = (short) (var7.method2501() - 1);
            }
            if (this.field1673 != null && this.field1675[var72] != -1) {
                this.field1673[var72] = (byte) (var8.method2499() - 1);
            }
        }
        var2.field2027 = var33;
        var3.field2027 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2499();
            if (var78 == 1) {
                var73 = var2.method2609() + var76;
                var74 = var2.method2609() + var73;
                var75 = var2.method2609() + var74;
                var76 = var75;
                this.field1667[var77] = var73;
                this.field1668[var77] = var74;
                this.field1669[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2609() + var76;
                var76 = var75;
                this.field1667[var77] = var73;
                this.field1668[var77] = var74;
                this.field1669[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2609() + var76;
                var76 = var75;
                this.field1667[var77] = var73;
                this.field1668[var77] = var74;
                this.field1669[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2609() + var76;
                var76 = var75;
                this.field1667[var77] = var73;
                this.field1668[var77] = var81;
                this.field1669[var77] = var75;
            }
        }
        var2.field2027 = var50;
        var3.field2027 = var52;
        var4.field2027 = var54;
        var5.field2027 = var56;
        var6.field2027 = var58;
        var7.field2027 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1678[var82] & 0xFF;
            if (var83 == 0) {
                this.field1679[var82] = (short) var2.method2501();
                this.field1672[var82] = (short) var2.method2501();
                this.field1674[var82] = (short) var2.method2501();
            }
            if (var83 == 1) {
                this.field1679[var82] = (short) var3.method2501();
                this.field1672[var82] = (short) var3.method2501();
                this.field1674[var82] = (short) var3.method2501();
                this.field1682[var82] = (short) var4.method2501();
                this.field1676[var82] = (short) var4.method2501();
                this.field1684[var82] = (short) var4.method2501();
                this.field1685[var82] = (short) var5.method2501();
                this.field1688[var82] = var6.method2500();
                this.field1686[var82] = (short) var7.method2501();
            }
            if (var83 == 2) {
                this.field1679[var82] = (short) var3.method2501();
                this.field1672[var82] = (short) var3.method2501();
                this.field1674[var82] = (short) var3.method2501();
                this.field1682[var82] = (short) var4.method2501();
                this.field1676[var82] = (short) var4.method2501();
                this.field1684[var82] = (short) var4.method2501();
                this.field1685[var82] = (short) var5.method2501();
                this.field1688[var82] = var6.method2500();
                this.field1686[var82] = (short) var7.method2501();
                this.field1680[var82] = (short) var7.method2501();
            }
            if (var83 == 3) {
                this.field1679[var82] = (short) var3.method2501();
                this.field1672[var82] = (short) var3.method2501();
                this.field1674[var82] = (short) var3.method2501();
                this.field1682[var82] = (short) var4.method2501();
                this.field1676[var82] = (short) var4.method2501();
                this.field1684[var82] = (short) var4.method2501();
                this.field1685[var82] = (short) var5.method2501();
                this.field1688[var82] = var6.method2500();
                this.field1686[var82] = (short) var7.method2501();
            }
        }
        var2.field2027 = var62;
        int var84 = var2.method2499();
        if (var84 == 0) {
            return;
        }
        new class103();
        var2.method2501();
        var2.method2501();
        var2.method2501();
        var2.method2548();
    }

    @ObfuscatedName("cz.o([B)V")
    public void method2084(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class127 var4 = new class127(arg0);
        class127 var5 = new class127(arg0);
        class127 var6 = new class127(arg0);
        class127 var7 = new class127(arg0);
        class127 var8 = new class127(arg0);
        var4.field2027 = arg0.length - 18;
        int var9 = var4.method2501();
        int var10 = var4.method2501();
        int var11 = var4.method2499();
        int var12 = var4.method2499();
        int var13 = var4.method2499();
        int var14 = var4.method2499();
        int var15 = var4.method2499();
        int var16 = var4.method2499();
        int var17 = var4.method2501();
        int var18 = var4.method2501();
        int var19 = var4.method2501();
        int var20 = var4.method2501();
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
        this.field1681 = var9;
        this.field1699 = var10;
        this.field1689 = var11;
        this.field1663 = new int[var9];
        this.field1664 = new int[var9];
        this.field1665 = new int[var9];
        this.field1667 = new int[var10];
        this.field1668 = new int[var10];
        this.field1669 = new int[var10];
        if (var11 > 0) {
            this.field1678 = new byte[var11];
            this.field1679 = new short[var11];
            this.field1672 = new short[var11];
            this.field1674 = new short[var11];
        }
        if (var16 == 1) {
            this.field1683 = new int[var9];
        }
        if (var12 == 1) {
            this.field1670 = new byte[var10];
            this.field1673 = new byte[var10];
            this.field1675 = new short[var10];
        }
        if (var13 == 255) {
            this.field1671 = new byte[var10];
        } else {
            this.field1703 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1702 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1690 = new int[var10];
        }
        this.field1707 = new short[var10];
        var4.field2027 = var21;
        var5.field2027 = var36;
        var6.field2027 = var38;
        var7.field2027 = var40;
        var8.field2027 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2499();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2609();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2609();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2609();
            }
            this.field1663[var46] = var43 + var48;
            this.field1664[var46] = var44 + var49;
            this.field1665[var46] = var45 + var50;
            var43 = this.field1663[var46];
            var44 = this.field1664[var46];
            var45 = this.field1665[var46];
            if (var16 == 1) {
                this.field1683[var46] = var8.method2499();
            }
        }
        var4.field2027 = var32;
        var5.field2027 = var28;
        var6.field2027 = var26;
        var7.field2027 = var30;
        var8.field2027 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1707[var51] = (short) var4.method2501();
            if (var12 == 1) {
                int var52 = var5.method2499();
                if ((var52 & 0x1) == 1) {
                    this.field1670[var51] = 1;
                    var2 = true;
                } else {
                    this.field1670[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1673[var51] = (byte) (var52 >> 2);
                    this.field1675[var51] = this.field1707[var51];
                    this.field1707[var51] = 127;
                    if (this.field1675[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1673[var51] = -1;
                    this.field1675[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1671[var51] = var6.method2500();
            }
            if (var14 == 1) {
                this.field1702[var51] = var7.method2500();
            }
            if (var15 == 1) {
                this.field1690[var51] = var8.method2499();
            }
        }
        var4.field2027 = var25;
        var5.field2027 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2499();
            if (var58 == 1) {
                var53 = var4.method2609() + var56;
                var54 = var4.method2609() + var53;
                var55 = var4.method2609() + var54;
                var56 = var55;
                this.field1667[var57] = var53;
                this.field1668[var57] = var54;
                this.field1669[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2609() + var56;
                var56 = var55;
                this.field1667[var57] = var53;
                this.field1668[var57] = var54;
                this.field1669[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2609() + var56;
                var56 = var55;
                this.field1667[var57] = var53;
                this.field1668[var57] = var54;
                this.field1669[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2609() + var56;
                var56 = var55;
                this.field1667[var57] = var53;
                this.field1668[var57] = var61;
                this.field1669[var57] = var55;
            }
        }
        var4.field2027 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1678[var62] = 0;
            this.field1679[var62] = (short) var4.method2501();
            this.field1672[var62] = (short) var4.method2501();
            this.field1674[var62] = (short) var4.method2501();
        }
        if (this.field1673 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1673[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1679[var65] & 0xFFFF) == this.field1667[var64] && (this.field1672[var65] & 0xFFFF) == this.field1668[var64] && (this.field1674[var65] & 0xFFFF) == this.field1669[var64]) {
                        this.field1673[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1673 = null;
            }
        }
        if (!var3) {
            this.field1675 = null;
        }
        if (!var2) {
            this.field1670 = null;
        }
    }

    public class101(class101[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1681 = 0;
        this.field1699 = 0;
        this.field1689 = 0;
        this.field1703 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class101 var10 = arg0[var9];
            if (var10 != null) {
                this.field1681 += var10.field1681;
                this.field1699 += var10.field1699;
                this.field1689 += var10.field1689;
                if (var10.field1671 == null) {
                    if (this.field1703 == -1) {
                        this.field1703 = var10.field1703;
                    }
                    if (this.field1703 != var10.field1703) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1670 != null;
                var5 |= var10.field1702 != null;
                var6 |= var10.field1690 != null;
                var7 |= var10.field1675 != null;
                var8 |= var10.field1673 != null;
            }
        }
        this.field1663 = new int[this.field1681];
        this.field1664 = new int[this.field1681];
        this.field1665 = new int[this.field1681];
        this.field1683 = new int[this.field1681];
        this.field1667 = new int[this.field1699];
        this.field1668 = new int[this.field1699];
        this.field1669 = new int[this.field1699];
        if (var3) {
            this.field1670 = new byte[this.field1699];
        }
        if (var4) {
            this.field1671 = new byte[this.field1699];
        }
        if (var5) {
            this.field1702 = new byte[this.field1699];
        }
        if (var6) {
            this.field1690 = new int[this.field1699];
        }
        if (var7) {
            this.field1675 = new short[this.field1699];
        }
        if (var8) {
            this.field1673 = new byte[this.field1699];
        }
        this.field1707 = new short[this.field1699];
        if (this.field1689 > 0) {
            this.field1678 = new byte[this.field1689];
            this.field1679 = new short[this.field1689];
            this.field1672 = new short[this.field1689];
            this.field1674 = new short[this.field1689];
            this.field1682 = new short[this.field1689];
            this.field1676 = new short[this.field1689];
            this.field1684 = new short[this.field1689];
            this.field1685 = new short[this.field1689];
            this.field1688 = new byte[this.field1689];
            this.field1686 = new short[this.field1689];
            this.field1680 = new short[this.field1689];
        }
        this.field1681 = 0;
        this.field1699 = 0;
        this.field1689 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class101 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1699; var13++) {
                    if (var3 && var12.field1670 != null) {
                        this.field1670[this.field1699] = var12.field1670[var13];
                    }
                    if (var4) {
                        if (var12.field1671 == null) {
                            this.field1671[this.field1699] = var12.field1703;
                        } else {
                            this.field1671[this.field1699] = var12.field1671[var13];
                        }
                    }
                    if (var5 && var12.field1702 != null) {
                        this.field1702[this.field1699] = var12.field1702[var13];
                    }
                    if (var6 && var12.field1690 != null) {
                        this.field1690[this.field1699] = var12.field1690[var13];
                    }
                    if (var7) {
                        if (var12.field1675 == null) {
                            this.field1675[this.field1699] = -1;
                        } else {
                            this.field1675[this.field1699] = var12.field1675[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1673 == null || var12.field1673[var13] == -1) {
                            this.field1673[this.field1699] = -1;
                        } else {
                            this.field1673[this.field1699] = (byte) (var12.field1673[var13] + this.field1689);
                        }
                    }
                    this.field1707[this.field1699] = var12.field1707[var13];
                    this.field1667[this.field1699] = this.method2159(var12, var12.field1667[var13]);
                    this.field1668[this.field1699] = this.method2159(var12, var12.field1668[var13]);
                    this.field1669[this.field1699] = this.method2159(var12, var12.field1669[var13]);
                    this.field1699++;
                }
                for (int var14 = 0; var14 < var12.field1689; var14++) {
                    byte var15 = this.field1678[this.field1689] = var12.field1678[var14];
                    if (var15 == 0) {
                        this.field1679[this.field1689] = (short) this.method2159(var12, var12.field1679[var14]);
                        this.field1672[this.field1689] = (short) this.method2159(var12, var12.field1672[var14]);
                        this.field1674[this.field1689] = (short) this.method2159(var12, var12.field1674[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1679[this.field1689] = var12.field1679[var14];
                        this.field1672[this.field1689] = var12.field1672[var14];
                        this.field1674[this.field1689] = var12.field1674[var14];
                        this.field1682[this.field1689] = var12.field1682[var14];
                        this.field1676[this.field1689] = var12.field1676[var14];
                        this.field1684[this.field1689] = var12.field1684[var14];
                        this.field1685[this.field1689] = var12.field1685[var14];
                        this.field1688[this.field1689] = var12.field1688[var14];
                        this.field1686[this.field1689] = var12.field1686[var14];
                    }
                    if (var15 == 2) {
                        this.field1680[this.field1689] = var12.field1680[var14];
                    }
                    this.field1689++;
                }
            }
        }
    }

    @ObfuscatedName("cz.p(Lcz;I)I")
    public final int method2159(class101 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1663[arg1];
        int var5 = arg0.field1664[arg1];
        int var6 = arg0.field1665[arg1];
        for (int var7 = 0; var7 < this.field1681; var7++) {
            if (this.field1663[var7] == var4 && this.field1664[var7] == var5 && this.field1665[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1663[this.field1681] = var4;
            this.field1664[this.field1681] = var5;
            this.field1665[this.field1681] = var6;
            if (arg0.field1683 != null) {
                this.field1683[this.field1681] = arg0.field1683[arg1];
            }
            var3 = this.field1681++;
        }
        return var3;
    }

    public class101(class101 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1681 = arg0.field1681;
        this.field1699 = arg0.field1699;
        this.field1689 = arg0.field1689;
        if (arg1) {
            this.field1663 = arg0.field1663;
            this.field1664 = arg0.field1664;
            this.field1665 = arg0.field1665;
        } else {
            this.field1663 = new int[this.field1681];
            this.field1664 = new int[this.field1681];
            this.field1665 = new int[this.field1681];
            for (int var6 = 0; var6 < this.field1681; var6++) {
                this.field1663[var6] = arg0.field1663[var6];
                this.field1664[var6] = arg0.field1664[var6];
                this.field1665[var6] = arg0.field1665[var6];
            }
        }
        if (arg2) {
            this.field1707 = arg0.field1707;
        } else {
            this.field1707 = new short[this.field1699];
            for (int var7 = 0; var7 < this.field1699; var7++) {
                this.field1707[var7] = arg0.field1707[var7];
            }
        }
        if (arg3 || arg0.field1675 == null) {
            this.field1675 = arg0.field1675;
        } else {
            this.field1675 = new short[this.field1699];
            for (int var8 = 0; var8 < this.field1699; var8++) {
                this.field1675[var8] = arg0.field1675[var8];
            }
        }
        if (arg4) {
            this.field1702 = arg0.field1702;
        } else {
            this.field1702 = new byte[this.field1699];
            if (arg0.field1702 == null) {
                for (int var9 = 0; var9 < this.field1699; var9++) {
                    this.field1702[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1699; var10++) {
                    this.field1702[var10] = arg0.field1702[var10];
                }
            }
        }
        this.field1667 = arg0.field1667;
        this.field1668 = arg0.field1668;
        this.field1669 = arg0.field1669;
        this.field1670 = arg0.field1670;
        this.field1671 = arg0.field1671;
        this.field1673 = arg0.field1673;
        this.field1703 = arg0.field1703;
        this.field1678 = arg0.field1678;
        this.field1679 = arg0.field1679;
        this.field1672 = arg0.field1672;
        this.field1674 = arg0.field1674;
        this.field1682 = arg0.field1682;
        this.field1676 = arg0.field1676;
        this.field1684 = arg0.field1684;
        this.field1685 = arg0.field1685;
        this.field1688 = arg0.field1688;
        this.field1686 = arg0.field1686;
        this.field1680 = arg0.field1680;
        this.field1683 = arg0.field1683;
        this.field1690 = arg0.field1690;
        this.field1691 = arg0.field1691;
        this.field1692 = arg0.field1692;
        this.field1694 = arg0.field1694;
        this.field1693 = arg0.field1693;
        this.field1695 = arg0.field1695;
        this.field1696 = arg0.field1696;
        this.field1704 = arg0.field1704;
    }

    @ObfuscatedName("cz.x()Lcz;")
    public class101 method2089() {
        class101 var1 = new class101();
        if (this.field1670 != null) {
            var1.field1670 = new byte[this.field1699];
            for (int var2 = 0; var2 < this.field1699; var2++) {
                var1.field1670[var2] = this.field1670[var2];
            }
        }
        var1.field1681 = this.field1681;
        var1.field1699 = this.field1699;
        var1.field1689 = this.field1689;
        var1.field1663 = this.field1663;
        var1.field1664 = this.field1664;
        var1.field1665 = this.field1665;
        var1.field1667 = this.field1667;
        var1.field1668 = this.field1668;
        var1.field1669 = this.field1669;
        var1.field1671 = this.field1671;
        var1.field1702 = this.field1702;
        var1.field1673 = this.field1673;
        var1.field1707 = this.field1707;
        var1.field1675 = this.field1675;
        var1.field1703 = this.field1703;
        var1.field1678 = this.field1678;
        var1.field1679 = this.field1679;
        var1.field1672 = this.field1672;
        var1.field1674 = this.field1674;
        var1.field1682 = this.field1682;
        var1.field1676 = this.field1676;
        var1.field1684 = this.field1684;
        var1.field1685 = this.field1685;
        var1.field1688 = this.field1688;
        var1.field1686 = this.field1686;
        var1.field1680 = this.field1680;
        var1.field1683 = this.field1683;
        var1.field1690 = this.field1690;
        var1.field1691 = this.field1691;
        var1.field1692 = this.field1692;
        var1.field1694 = this.field1694;
        var1.field1693 = this.field1693;
        var1.field1696 = this.field1696;
        var1.field1704 = this.field1704;
        return var1;
    }

    @ObfuscatedName("cz.r([[IIIIZI)Lcz;")
    public class101 method2090(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2095();
        int var7 = this.field1700 + arg1;
        int var8 = this.field1701 + arg1;
        int var9 = this.field1687 + arg3;
        int var10 = this.field1666 + arg3;
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
            var15.field1681 = this.field1681;
            var15.field1699 = this.field1699;
            var15.field1689 = this.field1689;
            var15.field1663 = this.field1663;
            var15.field1665 = this.field1665;
            var15.field1667 = this.field1667;
            var15.field1668 = this.field1668;
            var15.field1669 = this.field1669;
            var15.field1670 = this.field1670;
            var15.field1671 = this.field1671;
            var15.field1702 = this.field1702;
            var15.field1673 = this.field1673;
            var15.field1707 = this.field1707;
            var15.field1675 = this.field1675;
            var15.field1703 = this.field1703;
            var15.field1678 = this.field1678;
            var15.field1679 = this.field1679;
            var15.field1672 = this.field1672;
            var15.field1674 = this.field1674;
            var15.field1682 = this.field1682;
            var15.field1676 = this.field1676;
            var15.field1684 = this.field1684;
            var15.field1685 = this.field1685;
            var15.field1688 = this.field1688;
            var15.field1686 = this.field1686;
            var15.field1680 = this.field1680;
            var15.field1683 = this.field1683;
            var15.field1690 = this.field1690;
            var15.field1691 = this.field1691;
            var15.field1692 = this.field1692;
            var15.field1696 = this.field1696;
            var15.field1704 = this.field1704;
            var15.field1664 = new int[var15.field1681];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1681; var16++) {
                int var17 = this.field1663[var16] + arg1;
                int var18 = this.field1665[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1664[var16] = this.field1664[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1681; var26++) {
                int var27 = (-this.field1664[var26] << 16) / this.field1535;
                if (var27 < arg5) {
                    int var28 = this.field1663[var26] + arg1;
                    int var29 = this.field1665[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1664[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1664[var26];
                }
            }
        }
        var15.method2102();
        return var15;
    }

    @ObfuscatedName("cz.z()V")
    public void method2091() {
        int var10002;
        if (this.field1683 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1681; var3++) {
                int var4 = this.field1683[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1691 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1691[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1681) {
                int var7 = this.field1683[var6];
                this.field1691[var7][var1[var7]++] = var6++;
            }
            this.field1683 = null;
        }
        if (this.field1690 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1699; var10++) {
            int var11 = this.field1690[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1692 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1692[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1699) {
            int var14 = this.field1690[var13];
            this.field1692[var14][var8[var14]++] = var13++;
        }
        this.field1690 = null;
    }

    @ObfuscatedName("cz.n()V")
    public void method2092() {
        for (int var1 = 0; var1 < this.field1681; var1++) {
            int var2 = this.field1663[var1];
            this.field1663[var1] = this.field1665[var1];
            this.field1665[var1] = -var2;
        }
        this.method2102();
    }

    @ObfuscatedName("cz.j()V")
    public void method2107() {
        for (int var1 = 0; var1 < this.field1681; var1++) {
            this.field1663[var1] = -this.field1663[var1];
            this.field1665[var1] = -this.field1665[var1];
        }
        this.method2102();
    }

    @ObfuscatedName("cz.b()V")
    public void method2162() {
        for (int var1 = 0; var1 < this.field1681; var1++) {
            int var2 = this.field1665[var1];
            this.field1665[var1] = this.field1663[var1];
            this.field1663[var1] = -var2;
        }
        this.method2102();
    }

    @ObfuscatedName("cz.t(I)V")
    public void method2088(int arg0) {
        int var2 = field1708[arg0];
        int var3 = field1662[arg0];
        for (int var4 = 0; var4 < this.field1681; var4++) {
            int var5 = this.field1665[var4] * var2 + this.field1663[var4] * var3 >> 16;
            this.field1665[var4] = this.field1665[var4] * var3 - this.field1663[var4] * var2 >> 16;
            this.field1663[var4] = var5;
        }
        this.method2102();
    }

    @ObfuscatedName("cz.q(III)V")
    public void method2096(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1681; var4++) {
            this.field1663[var4] += arg0;
            this.field1664[var4] += arg1;
            this.field1665[var4] += arg2;
        }
        this.method2102();
    }

    @ObfuscatedName("cz.e(SS)V")
    public void method2097(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1699; var3++) {
            if (this.field1707[var3] == arg0) {
                this.field1707[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cz.l(SS)V")
    public void method2167(short arg0, short arg1) {
        if (this.field1675 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1699; var3++) {
            if (this.field1675[var3] == arg0) {
                this.field1675[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cz.u()V")
    public void method2099() {
        for (int var1 = 0; var1 < this.field1681; var1++) {
            this.field1665[var1] = -this.field1665[var1];
        }
        for (int var2 = 0; var2 < this.field1699; var2++) {
            int var3 = this.field1667[var2];
            this.field1667[var2] = this.field1669[var2];
            this.field1669[var2] = var3;
        }
        this.method2102();
    }

    @ObfuscatedName("cz.m(III)V")
    public void method2093(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1681; var4++) {
            this.field1663[var4] = this.field1663[var4] * arg0 / 128;
            this.field1664[var4] = this.field1664[var4] * arg1 / 128;
            this.field1665[var4] = this.field1665[var4] * arg2 / 128;
        }
        this.method2102();
    }

    @ObfuscatedName("cz.a()V")
    public void method2113() {
        if (this.field1694 != null) {
            return;
        }
        this.field1694 = new class91[this.field1681];
        for (int var1 = 0; var1 < this.field1681; var1++) {
            this.field1694[var1] = new class91();
        }
        for (int var2 = 0; var2 < this.field1699; var2++) {
            int var3 = this.field1667[var2];
            int var4 = this.field1668[var2];
            int var5 = this.field1669[var2];
            int var6 = this.field1663[var4] - this.field1663[var3];
            int var7 = this.field1664[var4] - this.field1664[var3];
            int var8 = this.field1665[var4] - this.field1665[var3];
            int var9 = this.field1663[var5] - this.field1663[var3];
            int var10 = this.field1664[var5] - this.field1664[var3];
            int var11 = this.field1665[var5] - this.field1665[var3];
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
            if (this.field1670 == null) {
                var19 = 0;
            } else {
                var19 = this.field1670[var2];
            }
            if (var19 == 0) {
                class91 var20 = this.field1694[var3];
                var20.field1504 += var16;
                var20.field1499 += var17;
                var20.field1498 += var18;
                var20.field1505++;
                class91 var21 = this.field1694[var4];
                var21.field1504 += var16;
                var21.field1499 += var17;
                var21.field1498 += var18;
                var21.field1505++;
                class91 var22 = this.field1694[var5];
                var22.field1504 += var16;
                var22.field1499 += var17;
                var22.field1498 += var18;
                var22.field1505++;
            } else if (var19 == 1) {
                if (this.field1693 == null) {
                    this.field1693 = new class92[this.field1699];
                }
                class92 var23 = this.field1693[var2] = new class92();
                var23.field1508 = var16;
                var23.field1506 = var17;
                var23.field1511 = var18;
            }
        }
    }

    @ObfuscatedName("cz.f()V")
    public void method2102() {
        this.field1694 = null;
        this.field1695 = null;
        this.field1693 = null;
        this.field1698 = false;
    }

    @ObfuscatedName("cz.y()V")
    public void method2095() {
        if (this.field1698) {
            return;
        }
        this.field1535 = 0;
        this.field1677 = 0;
        this.field1700 = 999999;
        this.field1701 = -999999;
        this.field1666 = -99999;
        this.field1687 = 99999;
        for (int var1 = 0; var1 < this.field1681; var1++) {
            int var2 = this.field1663[var1];
            int var3 = this.field1664[var1];
            int var4 = this.field1665[var1];
            if (var2 < this.field1700) {
                this.field1700 = var2;
            }
            if (var2 > this.field1701) {
                this.field1701 = var2;
            }
            if (var4 < this.field1687) {
                this.field1687 = var4;
            }
            if (var4 > this.field1666) {
                this.field1666 = var4;
            }
            if (-var3 > this.field1535) {
                this.field1535 = -var3;
            }
            if (var3 > this.field1677) {
                this.field1677 = var3;
            }
        }
        this.field1698 = true;
    }

    @ObfuscatedName("cz.c(Lcz;Lcz;IIIZ)V")
    public static void method2133(class101 arg0, class101 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2095();
        arg0.method2113();
        arg1.method2095();
        arg1.method2113();
        field1706++;
        int var6 = 0;
        int[] var7 = arg1.field1663;
        int var8 = arg1.field1681;
        for (int var9 = 0; var9 < arg0.field1681; var9++) {
            class91 var10 = arg0.field1694[var9];
            if (var10.field1505 != 0) {
                int var11 = arg0.field1664[var9] - arg3;
                if (var11 <= arg1.field1677) {
                    int var12 = arg0.field1663[var9] - arg2;
                    if (var12 >= arg1.field1700 && var12 <= arg1.field1701) {
                        int var13 = arg0.field1665[var9] - arg4;
                        if (var13 >= arg1.field1687 && var13 <= arg1.field1666) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class91 var15 = arg1.field1694[var14];
                                if (var7[var14] == var12 && arg1.field1665[var14] == var13 && arg1.field1664[var14] == var11 && var15.field1505 != 0) {
                                    if (arg0.field1695 == null) {
                                        arg0.field1695 = new class91[arg0.field1681];
                                    }
                                    if (arg1.field1695 == null) {
                                        arg1.field1695 = new class91[var8];
                                    }
                                    class91 var16 = arg0.field1695[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1695[var9] = new class91(var10);
                                    }
                                    class91 var17 = arg1.field1695[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1695[var14] = new class91(var15);
                                    }
                                    var16.field1504 += var15.field1504;
                                    var16.field1499 += var15.field1499;
                                    var16.field1498 += var15.field1498;
                                    var16.field1505 += var15.field1505;
                                    var17.field1504 += var10.field1504;
                                    var17.field1499 += var10.field1499;
                                    var17.field1498 += var10.field1498;
                                    var17.field1505 += var10.field1505;
                                    var6++;
                                    field1705[var9] = field1706;
                                    field1697[var14] = field1706;
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
        for (int var18 = 0; var18 < arg0.field1699; var18++) {
            if (field1705[arg0.field1667[var18]] == field1706 && field1705[arg0.field1668[var18]] == field1706 && field1705[arg0.field1669[var18]] == field1706) {
                if (arg0.field1670 == null) {
                    arg0.field1670 = new byte[arg0.field1699];
                }
                arg0.field1670[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1699; var19++) {
            if (field1697[arg1.field1667[var19]] == field1706 && field1697[arg1.field1668[var19]] == field1706 && field1697[arg1.field1669[var19]] == field1706) {
                if (arg1.field1670 == null) {
                    arg1.field1670 = new byte[arg1.field1699];
                }
                arg1.field1670[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cz.af(IIIII)Ldn;")
    public final class112 method2104(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2113();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class112 var8 = new class112();
        var8.field1854 = new int[this.field1699];
        var8.field1871 = new int[this.field1699];
        var8.field1842 = new int[this.field1699];
        if (this.field1689 > 0 && this.field1673 != null) {
            int[] var9 = new int[this.field1689];
            for (int var10 = 0; var10 < this.field1699; var10++) {
                if (this.field1673[var10] != -1) {
                    var9[this.field1673[var10] & 0xFF]++;
                }
            }
            var8.field1862 = 0;
            for (int var11 = 0; var11 < this.field1689; var11++) {
                if (var9[var11] > 0 && this.field1678[var11] == 0) {
                    var8.field1862++;
                }
            }
            var8.field1876 = new int[var8.field1862];
            var8.field1845 = new int[var8.field1862];
            var8.field1863 = new int[var8.field1862];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1689; var13++) {
                if (var9[var13] > 0 && this.field1678[var13] == 0) {
                    var8.field1876[var12] = this.field1679[var13] & 0xFFFF;
                    var8.field1845[var12] = this.field1672[var13] & 0xFFFF;
                    var8.field1863[var12] = this.field1674[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1896 = new byte[this.field1699];
            for (int var14 = 0; var14 < this.field1699; var14++) {
                if (this.field1673[var14] == -1) {
                    var8.field1896[var14] = -1;
                } else {
                    var8.field1896[var14] = (byte) var9[this.field1673[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1699; var15++) {
            byte var16;
            if (this.field1670 == null) {
                var16 = 0;
            } else {
                var16 = this.field1670[var15];
            }
            byte var17;
            if (this.field1702 == null) {
                var17 = 0;
            } else {
                var17 = this.field1702[var15];
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
                    int var19 = this.field1707[var15] & 0xFFFF;
                    class91 var20;
                    if (this.field1695 == null || this.field1695[this.field1667[var15]] == null) {
                        var20 = this.field1694[this.field1667[var15]];
                    } else {
                        var20 = this.field1695[this.field1667[var15]];
                    }
                    int var21 = (var20.field1498 * arg4 + var20.field1504 * arg2 + var20.field1499 * arg3) / (var20.field1505 * var7) + arg0;
                    var8.field1854[var15] = method2105(var19, var21);
                    class91 var22;
                    if (this.field1695 == null || this.field1695[this.field1668[var15]] == null) {
                        var22 = this.field1694[this.field1668[var15]];
                    } else {
                        var22 = this.field1695[this.field1668[var15]];
                    }
                    int var23 = (var22.field1498 * arg4 + var22.field1504 * arg2 + var22.field1499 * arg3) / (var22.field1505 * var7) + arg0;
                    var8.field1871[var15] = method2105(var19, var23);
                    class91 var24;
                    if (this.field1695 == null || this.field1695[this.field1669[var15]] == null) {
                        var24 = this.field1694[this.field1669[var15]];
                    } else {
                        var24 = this.field1695[this.field1669[var15]];
                    }
                    int var25 = (var24.field1498 * arg4 + var24.field1504 * arg2 + var24.field1499 * arg3) / (var24.field1505 * var7) + arg0;
                    var8.field1842[var15] = method2105(var19, var25);
                } else if (var16 == 1) {
                    class92 var26 = this.field1693[var15];
                    int var27 = (var26.field1511 * arg4 + var26.field1508 * arg2 + var26.field1506 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1854[var15] = method2105(this.field1707[var15] & 0xFFFF, var27);
                    var8.field1842[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1854[var15] = 128;
                    var8.field1842[var15] = -1;
                } else {
                    var8.field1842[var15] = -2;
                }
            } else if (var16 == 0) {
                class91 var28;
                if (this.field1695 == null || this.field1695[this.field1667[var15]] == null) {
                    var28 = this.field1694[this.field1667[var15]];
                } else {
                    var28 = this.field1695[this.field1667[var15]];
                }
                int var29 = (var28.field1498 * arg4 + var28.field1504 * arg2 + var28.field1499 * arg3) / (var28.field1505 * var7) + arg0;
                var8.field1854[var15] = method2106(var29);
                class91 var30;
                if (this.field1695 == null || this.field1695[this.field1668[var15]] == null) {
                    var30 = this.field1694[this.field1668[var15]];
                } else {
                    var30 = this.field1695[this.field1668[var15]];
                }
                int var31 = (var30.field1498 * arg4 + var30.field1504 * arg2 + var30.field1499 * arg3) / (var30.field1505 * var7) + arg0;
                var8.field1871[var15] = method2106(var31);
                class91 var32;
                if (this.field1695 == null || this.field1695[this.field1669[var15]] == null) {
                    var32 = this.field1694[this.field1669[var15]];
                } else {
                    var32 = this.field1695[this.field1669[var15]];
                }
                int var33 = (var32.field1498 * arg4 + var32.field1504 * arg2 + var32.field1499 * arg3) / (var32.field1505 * var7) + arg0;
                var8.field1842[var15] = method2106(var33);
            } else if (var16 == 1) {
                class92 var34 = this.field1693[var15];
                int var35 = (var34.field1511 * arg4 + var34.field1508 * arg2 + var34.field1506 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1854[var15] = method2106(var35);
                var8.field1842[var15] = -1;
            } else {
                var8.field1842[var15] = -2;
            }
        }
        this.method2091();
        var8.field1907 = this.field1681;
        var8.field1867 = this.field1663;
        var8.field1846 = this.field1664;
        var8.field1849 = this.field1665;
        var8.field1850 = this.field1699;
        var8.field1851 = this.field1667;
        var8.field1852 = this.field1668;
        var8.field1847 = this.field1669;
        var8.field1857 = this.field1671;
        var8.field1882 = this.field1702;
        var8.field1861 = this.field1703;
        var8.field1866 = this.field1691;
        var8.field1856 = this.field1692;
        var8.field1898 = this.field1675;
        return var8;
    }

    @ObfuscatedName("cz.aq(II)I")
    public static final int method2105(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cz.at(I)I")
    public static final int method2106(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
