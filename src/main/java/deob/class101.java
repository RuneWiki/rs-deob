package deob;

@ObfuscatedName("cm")
public class class101 extends class94 {

    @ObfuscatedName("cm.p")
    public int field1707 = 0;

    @ObfuscatedName("cm.l")
    public int[] field1676;

    @ObfuscatedName("cm.d")
    public int[] field1698;

    @ObfuscatedName("cm.x")
    public int[] field1694;

    @ObfuscatedName("cm.o")
    public int field1679 = 0;

    @ObfuscatedName("cm.a")
    public int[] field1700;

    @ObfuscatedName("cm.w")
    public int[] field1721;

    @ObfuscatedName("cm.i")
    public int[] field1682;

    @ObfuscatedName("cm.y")
    public byte[] field1683;

    @ObfuscatedName("cm.m")
    public byte[] field1684;

    @ObfuscatedName("cm.u")
    public byte[] field1685;

    @ObfuscatedName("cm.s")
    public byte[] field1686;

    @ObfuscatedName("cm.e")
    public short[] field1687;

    @ObfuscatedName("cm.r")
    public short[] field1688;

    @ObfuscatedName("cm.n")
    public byte field1689 = 0;

    @ObfuscatedName("cm.g")
    public int field1695;

    @ObfuscatedName("cm.c")
    public byte[] field1691;

    @ObfuscatedName("cm.v")
    public short[] field1692;

    @ObfuscatedName("cm.b")
    public short[] field1693;

    @ObfuscatedName("cm.k")
    public short[] field1675;

    @ObfuscatedName("cm.t")
    public short[] field1677;

    @ObfuscatedName("cm.f")
    public short[] field1717;

    @ObfuscatedName("cm.h")
    public short[] field1697;

    @ObfuscatedName("cm.j")
    public short[] field1681;

    @ObfuscatedName("cm.q")
    public short[] field1699;

    @ObfuscatedName("cm.z")
    public short[] field1696;

    @ObfuscatedName("cm.af")
    public byte[] field1701;

    @ObfuscatedName("cm.ap")
    public int[] field1718;

    @ObfuscatedName("cm.ah")
    public int[] field1719;

    @ObfuscatedName("cm.at")
    public int[][] field1704;

    @ObfuscatedName("cm.aa")
    public int[][] field1705;

    @ObfuscatedName("cm.ae")
    public class92[] field1706;

    @ObfuscatedName("cm.aw")
    public class91[] field1702;

    @ObfuscatedName("cm.ar")
    public class91[] field1708;

    @ObfuscatedName("cm.ai")
    public short field1709;

    @ObfuscatedName("cm.au")
    public short field1710;

    @ObfuscatedName("cm.ay")
    public boolean field1680 = false;

    @ObfuscatedName("cm.an")
    public int field1712;

    @ObfuscatedName("cm.al")
    public int field1713;

    @ObfuscatedName("cm.as")
    public int field1714;

    @ObfuscatedName("cm.az")
    public int field1715;

    @ObfuscatedName("cm.aq")
    public int field1716;

    @ObfuscatedName("cm.ag")
    public static int[] field1711 = new int[10000];

    @ObfuscatedName("cm.aj")
    public static int[] field1678 = new int[10000];

    @ObfuscatedName("cm.ak")
    public static int field1690 = 0;

    @ObfuscatedName("cm.ac")
    public static int[] field1720 = class104.field1779;

    @ObfuscatedName("cm.ab")
    public static int[] field1703 = class104.field1780;

    public class101() {
    }

    @ObfuscatedName("cm.p(Leh;II)Lcm;")
    public static class101 method2098(class153 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3078(arg1, arg2);
        return var3 == null ? null : new class101(var3);
    }

    public class101(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2133(arg0);
        } else {
            this.method2086(arg0);
        }
    }

    @ObfuscatedName("cm.d([B)V")
    public void method2133(byte[] arg0) {
        class127 var2 = new class127(arg0);
        class127 var3 = new class127(arg0);
        class127 var4 = new class127(arg0);
        class127 var5 = new class127(arg0);
        class127 var6 = new class127(arg0);
        class127 var7 = new class127(arg0);
        class127 var8 = new class127(arg0);
        var2.field2030 = arg0.length - 23;
        int var9 = var2.method2581();
        int var10 = var2.method2581();
        int var11 = var2.method2498();
        int var12 = var2.method2498();
        int var13 = var2.method2498();
        int var14 = var2.method2498();
        int var15 = var2.method2498();
        int var16 = var2.method2498();
        int var17 = var2.method2498();
        int var18 = var2.method2581();
        int var19 = var2.method2581();
        int var20 = var2.method2581();
        int var21 = var2.method2581();
        int var22 = var2.method2581();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1691 = new byte[var11];
            var2.field2030 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1691[var26] = var2.method2499();
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
        this.field1707 = var9;
        this.field1679 = var10;
        this.field1695 = var11;
        this.field1676 = new int[var9];
        this.field1698 = new int[var9];
        this.field1694 = new int[var9];
        this.field1700 = new int[var10];
        this.field1721 = new int[var10];
        this.field1682 = new int[var10];
        if (var17 == 1) {
            this.field1718 = new int[var9];
        }
        if (var12 == 1) {
            this.field1683 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1684 = new byte[var10];
        } else {
            this.field1689 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1685 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1719 = new int[var10];
        }
        if (var16 == 1) {
            this.field1688 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1686 = new byte[var10];
        }
        this.field1687 = new short[var10];
        if (var11 > 0) {
            this.field1692 = new short[var11];
            this.field1693 = new short[var11];
            this.field1675 = new short[var11];
            if (var24 > 0) {
                this.field1677 = new short[var24];
                this.field1717 = new short[var24];
                this.field1697 = new short[var24];
                this.field1681 = new short[var24];
                this.field1701 = new byte[var24];
                this.field1699 = new short[var24];
            }
            if (var25 > 0) {
                this.field1696 = new short[var25];
            }
        }
        var2.field2030 = var11;
        var3.field2030 = var44;
        var4.field2030 = var46;
        var5.field2030 = var48;
        var6.field2030 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2498();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2529();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2529();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2529();
            }
            this.field1676[var67] = var64 + var69;
            this.field1698[var67] = var65 + var70;
            this.field1694[var67] = var66 + var71;
            var64 = this.field1676[var67];
            var65 = this.field1698[var67];
            var66 = this.field1694[var67];
            if (var17 == 1) {
                this.field1718[var67] = var6.method2498();
            }
        }
        var2.field2030 = var42;
        var3.field2030 = var31;
        var4.field2030 = var34;
        var5.field2030 = var37;
        var6.field2030 = var35;
        var7.field2030 = var40;
        var8.field2030 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1687[var72] = (short) var2.method2581();
            if (var12 == 1) {
                this.field1683[var72] = var3.method2499();
            }
            if (var13 == 255) {
                this.field1684[var72] = var4.method2499();
            }
            if (var14 == 1) {
                this.field1685[var72] = var5.method2499();
            }
            if (var15 == 1) {
                this.field1719[var72] = var6.method2498();
            }
            if (var16 == 1) {
                this.field1688[var72] = (short) (var7.method2581() - 1);
            }
            if (this.field1686 != null && this.field1688[var72] != -1) {
                this.field1686[var72] = (byte) (var8.method2498() - 1);
            }
        }
        var2.field2030 = var33;
        var3.field2030 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2498();
            if (var78 == 1) {
                var73 = var2.method2529() + var76;
                var74 = var2.method2529() + var73;
                var75 = var2.method2529() + var74;
                var76 = var75;
                this.field1700[var77] = var73;
                this.field1721[var77] = var74;
                this.field1682[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2529() + var76;
                var76 = var75;
                this.field1700[var77] = var73;
                this.field1721[var77] = var74;
                this.field1682[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2529() + var76;
                var76 = var75;
                this.field1700[var77] = var73;
                this.field1721[var77] = var74;
                this.field1682[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2529() + var76;
                var76 = var75;
                this.field1700[var77] = var73;
                this.field1721[var77] = var81;
                this.field1682[var77] = var75;
            }
        }
        var2.field2030 = var50;
        var3.field2030 = var52;
        var4.field2030 = var54;
        var5.field2030 = var56;
        var6.field2030 = var58;
        var7.field2030 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1691[var82] & 0xFF;
            if (var83 == 0) {
                this.field1692[var82] = (short) var2.method2581();
                this.field1693[var82] = (short) var2.method2581();
                this.field1675[var82] = (short) var2.method2581();
            }
            if (var83 == 1) {
                this.field1692[var82] = (short) var3.method2581();
                this.field1693[var82] = (short) var3.method2581();
                this.field1675[var82] = (short) var3.method2581();
                this.field1677[var82] = (short) var4.method2581();
                this.field1717[var82] = (short) var4.method2581();
                this.field1697[var82] = (short) var4.method2581();
                this.field1681[var82] = (short) var5.method2581();
                this.field1701[var82] = var6.method2499();
                this.field1699[var82] = (short) var7.method2581();
            }
            if (var83 == 2) {
                this.field1692[var82] = (short) var3.method2581();
                this.field1693[var82] = (short) var3.method2581();
                this.field1675[var82] = (short) var3.method2581();
                this.field1677[var82] = (short) var4.method2581();
                this.field1717[var82] = (short) var4.method2581();
                this.field1697[var82] = (short) var4.method2581();
                this.field1681[var82] = (short) var5.method2581();
                this.field1701[var82] = var6.method2499();
                this.field1699[var82] = (short) var7.method2581();
                this.field1696[var82] = (short) var7.method2581();
            }
            if (var83 == 3) {
                this.field1692[var82] = (short) var3.method2581();
                this.field1693[var82] = (short) var3.method2581();
                this.field1675[var82] = (short) var3.method2581();
                this.field1677[var82] = (short) var4.method2581();
                this.field1717[var82] = (short) var4.method2581();
                this.field1697[var82] = (short) var4.method2581();
                this.field1681[var82] = (short) var5.method2581();
                this.field1701[var82] = var6.method2499();
                this.field1699[var82] = (short) var7.method2581();
            }
        }
        var2.field2030 = var62;
        int var84 = var2.method2498();
        if (var84 == 0) {
            return;
        }
        new class103();
        var2.method2581();
        var2.method2581();
        var2.method2581();
        var2.method2489();
    }

    @ObfuscatedName("cm.x([B)V")
    public void method2086(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class127 var4 = new class127(arg0);
        class127 var5 = new class127(arg0);
        class127 var6 = new class127(arg0);
        class127 var7 = new class127(arg0);
        class127 var8 = new class127(arg0);
        var4.field2030 = arg0.length - 18;
        int var9 = var4.method2581();
        int var10 = var4.method2581();
        int var11 = var4.method2498();
        int var12 = var4.method2498();
        int var13 = var4.method2498();
        int var14 = var4.method2498();
        int var15 = var4.method2498();
        int var16 = var4.method2498();
        int var17 = var4.method2581();
        int var18 = var4.method2581();
        int var19 = var4.method2581();
        int var20 = var4.method2581();
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
        this.field1707 = var9;
        this.field1679 = var10;
        this.field1695 = var11;
        this.field1676 = new int[var9];
        this.field1698 = new int[var9];
        this.field1694 = new int[var9];
        this.field1700 = new int[var10];
        this.field1721 = new int[var10];
        this.field1682 = new int[var10];
        if (var11 > 0) {
            this.field1691 = new byte[var11];
            this.field1692 = new short[var11];
            this.field1693 = new short[var11];
            this.field1675 = new short[var11];
        }
        if (var16 == 1) {
            this.field1718 = new int[var9];
        }
        if (var12 == 1) {
            this.field1683 = new byte[var10];
            this.field1686 = new byte[var10];
            this.field1688 = new short[var10];
        }
        if (var13 == 255) {
            this.field1684 = new byte[var10];
        } else {
            this.field1689 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1685 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1719 = new int[var10];
        }
        this.field1687 = new short[var10];
        var4.field2030 = var21;
        var5.field2030 = var36;
        var6.field2030 = var38;
        var7.field2030 = var40;
        var8.field2030 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2498();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2529();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2529();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2529();
            }
            this.field1676[var46] = var43 + var48;
            this.field1698[var46] = var44 + var49;
            this.field1694[var46] = var45 + var50;
            var43 = this.field1676[var46];
            var44 = this.field1698[var46];
            var45 = this.field1694[var46];
            if (var16 == 1) {
                this.field1718[var46] = var8.method2498();
            }
        }
        var4.field2030 = var32;
        var5.field2030 = var28;
        var6.field2030 = var26;
        var7.field2030 = var30;
        var8.field2030 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1687[var51] = (short) var4.method2581();
            if (var12 == 1) {
                int var52 = var5.method2498();
                if ((var52 & 0x1) == 1) {
                    this.field1683[var51] = 1;
                    var2 = true;
                } else {
                    this.field1683[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1686[var51] = (byte) (var52 >> 2);
                    this.field1688[var51] = this.field1687[var51];
                    this.field1687[var51] = 127;
                    if (this.field1688[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1686[var51] = -1;
                    this.field1688[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1684[var51] = var6.method2499();
            }
            if (var14 == 1) {
                this.field1685[var51] = var7.method2499();
            }
            if (var15 == 1) {
                this.field1719[var51] = var8.method2498();
            }
        }
        var4.field2030 = var25;
        var5.field2030 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2498();
            if (var58 == 1) {
                var53 = var4.method2529() + var56;
                var54 = var4.method2529() + var53;
                var55 = var4.method2529() + var54;
                var56 = var55;
                this.field1700[var57] = var53;
                this.field1721[var57] = var54;
                this.field1682[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2529() + var56;
                var56 = var55;
                this.field1700[var57] = var53;
                this.field1721[var57] = var54;
                this.field1682[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2529() + var56;
                var56 = var55;
                this.field1700[var57] = var53;
                this.field1721[var57] = var54;
                this.field1682[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2529() + var56;
                var56 = var55;
                this.field1700[var57] = var53;
                this.field1721[var57] = var61;
                this.field1682[var57] = var55;
            }
        }
        var4.field2030 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1691[var62] = 0;
            this.field1692[var62] = (short) var4.method2581();
            this.field1693[var62] = (short) var4.method2581();
            this.field1675[var62] = (short) var4.method2581();
        }
        if (this.field1686 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1686[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1692[var65] & 0xFFFF) == this.field1700[var64] && (this.field1693[var65] & 0xFFFF) == this.field1721[var64] && (this.field1675[var65] & 0xFFFF) == this.field1682[var64]) {
                        this.field1686[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1686 = null;
            }
        }
        if (!var3) {
            this.field1688 = null;
        }
        if (!var2) {
            this.field1683 = null;
        }
    }

    public class101(class101[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1707 = 0;
        this.field1679 = 0;
        this.field1695 = 0;
        this.field1689 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class101 var10 = arg0[var9];
            if (var10 != null) {
                this.field1707 += var10.field1707;
                this.field1679 += var10.field1679;
                this.field1695 += var10.field1695;
                if (var10.field1684 == null) {
                    if (this.field1689 == -1) {
                        this.field1689 = var10.field1689;
                    }
                    if (this.field1689 != var10.field1689) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1683 != null;
                var5 |= var10.field1685 != null;
                var6 |= var10.field1719 != null;
                var7 |= var10.field1688 != null;
                var8 |= var10.field1686 != null;
            }
        }
        this.field1676 = new int[this.field1707];
        this.field1698 = new int[this.field1707];
        this.field1694 = new int[this.field1707];
        this.field1718 = new int[this.field1707];
        this.field1700 = new int[this.field1679];
        this.field1721 = new int[this.field1679];
        this.field1682 = new int[this.field1679];
        if (var3) {
            this.field1683 = new byte[this.field1679];
        }
        if (var4) {
            this.field1684 = new byte[this.field1679];
        }
        if (var5) {
            this.field1685 = new byte[this.field1679];
        }
        if (var6) {
            this.field1719 = new int[this.field1679];
        }
        if (var7) {
            this.field1688 = new short[this.field1679];
        }
        if (var8) {
            this.field1686 = new byte[this.field1679];
        }
        this.field1687 = new short[this.field1679];
        if (this.field1695 > 0) {
            this.field1691 = new byte[this.field1695];
            this.field1692 = new short[this.field1695];
            this.field1693 = new short[this.field1695];
            this.field1675 = new short[this.field1695];
            this.field1677 = new short[this.field1695];
            this.field1717 = new short[this.field1695];
            this.field1697 = new short[this.field1695];
            this.field1681 = new short[this.field1695];
            this.field1701 = new byte[this.field1695];
            this.field1699 = new short[this.field1695];
            this.field1696 = new short[this.field1695];
        }
        this.field1707 = 0;
        this.field1679 = 0;
        this.field1695 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class101 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1679; var13++) {
                    if (var3 && var12.field1683 != null) {
                        this.field1683[this.field1679] = var12.field1683[var13];
                    }
                    if (var4) {
                        if (var12.field1684 == null) {
                            this.field1684[this.field1679] = var12.field1689;
                        } else {
                            this.field1684[this.field1679] = var12.field1684[var13];
                        }
                    }
                    if (var5 && var12.field1685 != null) {
                        this.field1685[this.field1679] = var12.field1685[var13];
                    }
                    if (var6 && var12.field1719 != null) {
                        this.field1719[this.field1679] = var12.field1719[var13];
                    }
                    if (var7) {
                        if (var12.field1688 == null) {
                            this.field1688[this.field1679] = -1;
                        } else {
                            this.field1688[this.field1679] = var12.field1688[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1686 == null || var12.field1686[var13] == -1) {
                            this.field1686[this.field1679] = -1;
                        } else {
                            this.field1686[this.field1679] = (byte) (var12.field1686[var13] + this.field1695);
                        }
                    }
                    this.field1687[this.field1679] = var12.field1687[var13];
                    this.field1700[this.field1679] = this.method2087(var12, var12.field1700[var13]);
                    this.field1721[this.field1679] = this.method2087(var12, var12.field1721[var13]);
                    this.field1682[this.field1679] = this.method2087(var12, var12.field1682[var13]);
                    this.field1679++;
                }
                for (int var14 = 0; var14 < var12.field1695; var14++) {
                    byte var15 = this.field1691[this.field1695] = var12.field1691[var14];
                    if (var15 == 0) {
                        this.field1692[this.field1695] = (short) this.method2087(var12, var12.field1692[var14]);
                        this.field1693[this.field1695] = (short) this.method2087(var12, var12.field1693[var14]);
                        this.field1675[this.field1695] = (short) this.method2087(var12, var12.field1675[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1692[this.field1695] = var12.field1692[var14];
                        this.field1693[this.field1695] = var12.field1693[var14];
                        this.field1675[this.field1695] = var12.field1675[var14];
                        this.field1677[this.field1695] = var12.field1677[var14];
                        this.field1717[this.field1695] = var12.field1717[var14];
                        this.field1697[this.field1695] = var12.field1697[var14];
                        this.field1681[this.field1695] = var12.field1681[var14];
                        this.field1701[this.field1695] = var12.field1701[var14];
                        this.field1699[this.field1695] = var12.field1699[var14];
                    }
                    if (var15 == 2) {
                        this.field1696[this.field1695] = var12.field1696[var14];
                    }
                    this.field1695++;
                }
            }
        }
    }

    @ObfuscatedName("cm.o(Lcm;I)I")
    public final int method2087(class101 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1676[arg1];
        int var5 = arg0.field1698[arg1];
        int var6 = arg0.field1694[arg1];
        for (int var7 = 0; var7 < this.field1707; var7++) {
            if (this.field1676[var7] == var4 && this.field1698[var7] == var5 && this.field1694[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1676[this.field1707] = var4;
            this.field1698[this.field1707] = var5;
            this.field1694[this.field1707] = var6;
            if (arg0.field1718 != null) {
                this.field1718[this.field1707] = arg0.field1718[arg1];
            }
            var3 = this.field1707++;
        }
        return var3;
    }

    public class101(class101 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1707 = arg0.field1707;
        this.field1679 = arg0.field1679;
        this.field1695 = arg0.field1695;
        if (arg1) {
            this.field1676 = arg0.field1676;
            this.field1698 = arg0.field1698;
            this.field1694 = arg0.field1694;
        } else {
            this.field1676 = new int[this.field1707];
            this.field1698 = new int[this.field1707];
            this.field1694 = new int[this.field1707];
            for (int var6 = 0; var6 < this.field1707; var6++) {
                this.field1676[var6] = arg0.field1676[var6];
                this.field1698[var6] = arg0.field1698[var6];
                this.field1694[var6] = arg0.field1694[var6];
            }
        }
        if (arg2) {
            this.field1687 = arg0.field1687;
        } else {
            this.field1687 = new short[this.field1679];
            for (int var7 = 0; var7 < this.field1679; var7++) {
                this.field1687[var7] = arg0.field1687[var7];
            }
        }
        if (arg3 || arg0.field1688 == null) {
            this.field1688 = arg0.field1688;
        } else {
            this.field1688 = new short[this.field1679];
            for (int var8 = 0; var8 < this.field1679; var8++) {
                this.field1688[var8] = arg0.field1688[var8];
            }
        }
        if (arg4) {
            this.field1685 = arg0.field1685;
        } else {
            this.field1685 = new byte[this.field1679];
            if (arg0.field1685 == null) {
                for (int var9 = 0; var9 < this.field1679; var9++) {
                    this.field1685[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1679; var10++) {
                    this.field1685[var10] = arg0.field1685[var10];
                }
            }
        }
        this.field1700 = arg0.field1700;
        this.field1721 = arg0.field1721;
        this.field1682 = arg0.field1682;
        this.field1683 = arg0.field1683;
        this.field1684 = arg0.field1684;
        this.field1686 = arg0.field1686;
        this.field1689 = arg0.field1689;
        this.field1691 = arg0.field1691;
        this.field1692 = arg0.field1692;
        this.field1693 = arg0.field1693;
        this.field1675 = arg0.field1675;
        this.field1677 = arg0.field1677;
        this.field1717 = arg0.field1717;
        this.field1697 = arg0.field1697;
        this.field1681 = arg0.field1681;
        this.field1701 = arg0.field1701;
        this.field1699 = arg0.field1699;
        this.field1696 = arg0.field1696;
        this.field1718 = arg0.field1718;
        this.field1719 = arg0.field1719;
        this.field1704 = arg0.field1704;
        this.field1705 = arg0.field1705;
        this.field1702 = arg0.field1702;
        this.field1706 = arg0.field1706;
        this.field1708 = arg0.field1708;
        this.field1709 = arg0.field1709;
        this.field1710 = arg0.field1710;
    }

    @ObfuscatedName("cm.a()Lcm;")
    public class101 method2089() {
        class101 var1 = new class101();
        if (this.field1683 != null) {
            var1.field1683 = new byte[this.field1679];
            for (int var2 = 0; var2 < this.field1679; var2++) {
                var1.field1683[var2] = this.field1683[var2];
            }
        }
        var1.field1707 = this.field1707;
        var1.field1679 = this.field1679;
        var1.field1695 = this.field1695;
        var1.field1676 = this.field1676;
        var1.field1698 = this.field1698;
        var1.field1694 = this.field1694;
        var1.field1700 = this.field1700;
        var1.field1721 = this.field1721;
        var1.field1682 = this.field1682;
        var1.field1684 = this.field1684;
        var1.field1685 = this.field1685;
        var1.field1686 = this.field1686;
        var1.field1687 = this.field1687;
        var1.field1688 = this.field1688;
        var1.field1689 = this.field1689;
        var1.field1691 = this.field1691;
        var1.field1692 = this.field1692;
        var1.field1693 = this.field1693;
        var1.field1675 = this.field1675;
        var1.field1677 = this.field1677;
        var1.field1717 = this.field1717;
        var1.field1697 = this.field1697;
        var1.field1681 = this.field1681;
        var1.field1701 = this.field1701;
        var1.field1699 = this.field1699;
        var1.field1696 = this.field1696;
        var1.field1718 = this.field1718;
        var1.field1719 = this.field1719;
        var1.field1704 = this.field1704;
        var1.field1705 = this.field1705;
        var1.field1702 = this.field1702;
        var1.field1706 = this.field1706;
        var1.field1709 = this.field1709;
        var1.field1710 = this.field1710;
        return var1;
    }

    @ObfuscatedName("cm.i([[IIIIZI)Lcm;")
    public class101 method2142(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2082();
        int var7 = this.field1713 + arg1;
        int var8 = this.field1714 + arg1;
        int var9 = this.field1716 + arg3;
        int var10 = this.field1715 + arg3;
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
            var15.field1707 = this.field1707;
            var15.field1679 = this.field1679;
            var15.field1695 = this.field1695;
            var15.field1676 = this.field1676;
            var15.field1694 = this.field1694;
            var15.field1700 = this.field1700;
            var15.field1721 = this.field1721;
            var15.field1682 = this.field1682;
            var15.field1683 = this.field1683;
            var15.field1684 = this.field1684;
            var15.field1685 = this.field1685;
            var15.field1686 = this.field1686;
            var15.field1687 = this.field1687;
            var15.field1688 = this.field1688;
            var15.field1689 = this.field1689;
            var15.field1691 = this.field1691;
            var15.field1692 = this.field1692;
            var15.field1693 = this.field1693;
            var15.field1675 = this.field1675;
            var15.field1677 = this.field1677;
            var15.field1717 = this.field1717;
            var15.field1697 = this.field1697;
            var15.field1681 = this.field1681;
            var15.field1701 = this.field1701;
            var15.field1699 = this.field1699;
            var15.field1696 = this.field1696;
            var15.field1718 = this.field1718;
            var15.field1719 = this.field1719;
            var15.field1704 = this.field1704;
            var15.field1705 = this.field1705;
            var15.field1709 = this.field1709;
            var15.field1710 = this.field1710;
            var15.field1698 = new int[var15.field1707];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1707; var16++) {
                int var17 = this.field1676[var16] + arg1;
                int var18 = this.field1694[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1698[var16] = this.field1698[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1707; var26++) {
                int var27 = (-this.field1698[var26] << 16) / this.field1546;
                if (var27 < arg5) {
                    int var28 = this.field1676[var26] + arg1;
                    int var29 = this.field1694[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1698[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1698[var26];
                }
            }
        }
        var15.method2102();
        return var15;
    }

    @ObfuscatedName("cm.y()V")
    public void method2091() {
        int var10002;
        if (this.field1718 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1707; var3++) {
                int var4 = this.field1718[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1704 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1704[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1707) {
                int var7 = this.field1718[var6];
                this.field1704[var7][var1[var7]++] = var6++;
            }
            this.field1718 = null;
        }
        if (this.field1719 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1679; var10++) {
            int var11 = this.field1719[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1705 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1705[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1679) {
            int var14 = this.field1719[var13];
            this.field1705[var14][var8[var14]++] = var13++;
        }
        this.field1719 = null;
    }

    @ObfuscatedName("cm.m()V")
    public void method2137() {
        for (int var1 = 0; var1 < this.field1707; var1++) {
            int var2 = this.field1676[var1];
            this.field1676[var1] = this.field1694[var1];
            this.field1694[var1] = -var2;
        }
        this.method2102();
    }

    @ObfuscatedName("cm.u()V")
    public void method2093() {
        for (int var1 = 0; var1 < this.field1707; var1++) {
            this.field1676[var1] = -this.field1676[var1];
            this.field1694[var1] = -this.field1694[var1];
        }
        this.method2102();
    }

    @ObfuscatedName("cm.s()V")
    public void method2094() {
        for (int var1 = 0; var1 < this.field1707; var1++) {
            int var2 = this.field1694[var1];
            this.field1694[var1] = this.field1676[var1];
            this.field1676[var1] = -var2;
        }
        this.method2102();
    }

    @ObfuscatedName("cm.e(I)V")
    public void method2088(int arg0) {
        int var2 = field1720[arg0];
        int var3 = field1703[arg0];
        for (int var4 = 0; var4 < this.field1707; var4++) {
            int var5 = this.field1694[var4] * var2 + this.field1676[var4] * var3 >> 16;
            this.field1694[var4] = this.field1694[var4] * var3 - this.field1676[var4] * var2 >> 16;
            this.field1676[var4] = var5;
        }
        this.method2102();
    }

    @ObfuscatedName("cm.r(III)V")
    public void method2162(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1707; var4++) {
            this.field1676[var4] += arg0;
            this.field1698[var4] += arg1;
            this.field1694[var4] += arg2;
        }
        this.method2102();
    }

    @ObfuscatedName("cm.n(SS)V")
    public void method2097(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1679; var3++) {
            if (this.field1687[var3] == arg0) {
                this.field1687[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cm.g(SS)V")
    public void method2138(short arg0, short arg1) {
        if (this.field1688 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1679; var3++) {
            if (this.field1688[var3] == arg0) {
                this.field1688[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cm.c()V")
    public void method2099() {
        for (int var1 = 0; var1 < this.field1707; var1++) {
            this.field1694[var1] = -this.field1694[var1];
        }
        for (int var2 = 0; var2 < this.field1679; var2++) {
            int var3 = this.field1700[var2];
            this.field1700[var2] = this.field1682[var2];
            this.field1682[var2] = var3;
        }
        this.method2102();
    }

    @ObfuscatedName("cm.v(III)V")
    public void method2100(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1707; var4++) {
            this.field1676[var4] = this.field1676[var4] * arg0 / 128;
            this.field1698[var4] = this.field1698[var4] * arg1 / 128;
            this.field1694[var4] = this.field1694[var4] * arg2 / 128;
        }
        this.method2102();
    }

    @ObfuscatedName("cm.b()V")
    public void method2101() {
        if (this.field1702 != null) {
            return;
        }
        this.field1702 = new class91[this.field1707];
        for (int var1 = 0; var1 < this.field1707; var1++) {
            this.field1702[var1] = new class91();
        }
        for (int var2 = 0; var2 < this.field1679; var2++) {
            int var3 = this.field1700[var2];
            int var4 = this.field1721[var2];
            int var5 = this.field1682[var2];
            int var6 = this.field1676[var4] - this.field1676[var3];
            int var7 = this.field1698[var4] - this.field1698[var3];
            int var8 = this.field1694[var4] - this.field1694[var3];
            int var9 = this.field1676[var5] - this.field1676[var3];
            int var10 = this.field1698[var5] - this.field1698[var3];
            int var11 = this.field1694[var5] - this.field1694[var3];
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
            if (this.field1683 == null) {
                var19 = 0;
            } else {
                var19 = this.field1683[var2];
            }
            if (var19 == 0) {
                class91 var20 = this.field1702[var3];
                var20.field1508 += var16;
                var20.field1505 += var17;
                var20.field1504 += var18;
                var20.field1502++;
                class91 var21 = this.field1702[var4];
                var21.field1508 += var16;
                var21.field1505 += var17;
                var21.field1504 += var18;
                var21.field1502++;
                class91 var22 = this.field1702[var5];
                var22.field1508 += var16;
                var22.field1505 += var17;
                var22.field1504 += var18;
                var22.field1502++;
            } else if (var19 == 1) {
                if (this.field1706 == null) {
                    this.field1706 = new class92[this.field1679];
                }
                class92 var23 = this.field1706[var2] = new class92();
                var23.field1510 = var16;
                var23.field1516 = var17;
                var23.field1511 = var18;
            }
        }
    }

    @ObfuscatedName("cm.k()V")
    public void method2102() {
        this.field1702 = null;
        this.field1708 = null;
        this.field1706 = null;
        this.field1680 = false;
    }

    @ObfuscatedName("cm.t()V")
    public void method2082() {
        if (this.field1680) {
            return;
        }
        this.field1546 = 0;
        this.field1712 = 0;
        this.field1713 = 999999;
        this.field1714 = -999999;
        this.field1715 = -99999;
        this.field1716 = 99999;
        for (int var1 = 0; var1 < this.field1707; var1++) {
            int var2 = this.field1676[var1];
            int var3 = this.field1698[var1];
            int var4 = this.field1694[var1];
            if (var2 < this.field1713) {
                this.field1713 = var2;
            }
            if (var2 > this.field1714) {
                this.field1714 = var2;
            }
            if (var4 < this.field1716) {
                this.field1716 = var4;
            }
            if (var4 > this.field1715) {
                this.field1715 = var4;
            }
            if (-var3 > this.field1546) {
                this.field1546 = -var3;
            }
            if (var3 > this.field1712) {
                this.field1712 = var3;
            }
        }
        this.field1680 = true;
    }

    @ObfuscatedName("cm.f(Lcm;Lcm;IIIZ)V")
    public static void method2158(class101 arg0, class101 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2082();
        arg0.method2101();
        arg1.method2082();
        arg1.method2101();
        field1690++;
        int var6 = 0;
        int[] var7 = arg1.field1676;
        int var8 = arg1.field1707;
        for (int var9 = 0; var9 < arg0.field1707; var9++) {
            class91 var10 = arg0.field1702[var9];
            if (var10.field1502 != 0) {
                int var11 = arg0.field1698[var9] - arg3;
                if (var11 <= arg1.field1712) {
                    int var12 = arg0.field1676[var9] - arg2;
                    if (var12 >= arg1.field1713 && var12 <= arg1.field1714) {
                        int var13 = arg0.field1694[var9] - arg4;
                        if (var13 >= arg1.field1716 && var13 <= arg1.field1715) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class91 var15 = arg1.field1702[var14];
                                if (var7[var14] == var12 && arg1.field1694[var14] == var13 && arg1.field1698[var14] == var11 && var15.field1502 != 0) {
                                    if (arg0.field1708 == null) {
                                        arg0.field1708 = new class91[arg0.field1707];
                                    }
                                    if (arg1.field1708 == null) {
                                        arg1.field1708 = new class91[var8];
                                    }
                                    class91 var16 = arg0.field1708[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1708[var9] = new class91(var10);
                                    }
                                    class91 var17 = arg1.field1708[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1708[var14] = new class91(var15);
                                    }
                                    var16.field1508 += var15.field1508;
                                    var16.field1505 += var15.field1505;
                                    var16.field1504 += var15.field1504;
                                    var16.field1502 += var15.field1502;
                                    var17.field1508 += var10.field1508;
                                    var17.field1505 += var10.field1505;
                                    var17.field1504 += var10.field1504;
                                    var17.field1502 += var10.field1502;
                                    var6++;
                                    field1711[var9] = field1690;
                                    field1678[var14] = field1690;
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
        for (int var18 = 0; var18 < arg0.field1679; var18++) {
            if (field1711[arg0.field1700[var18]] == field1690 && field1711[arg0.field1721[var18]] == field1690 && field1711[arg0.field1682[var18]] == field1690) {
                if (arg0.field1683 == null) {
                    arg0.field1683 = new byte[arg0.field1679];
                }
                arg0.field1683[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1679; var19++) {
            if (field1678[arg1.field1700[var19]] == field1690 && field1678[arg1.field1721[var19]] == field1690 && field1678[arg1.field1682[var19]] == field1690) {
                if (arg1.field1683 == null) {
                    arg1.field1683 = new byte[arg1.field1679];
                }
                arg1.field1683[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cm.h(IIIII)Ldl;")
    public final class112 method2084(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2101();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class112 var8 = new class112();
        var8.field1863 = new int[this.field1679];
        var8.field1864 = new int[this.field1679];
        var8.field1913 = new int[this.field1679];
        if (this.field1695 > 0 && this.field1686 != null) {
            int[] var9 = new int[this.field1695];
            for (int var10 = 0; var10 < this.field1679; var10++) {
                if (this.field1686[var10] != -1) {
                    var9[this.field1686[var10] & 0xFF]++;
                }
            }
            var8.field1871 = 0;
            for (int var11 = 0; var11 < this.field1695; var11++) {
                if (var9[var11] > 0 && this.field1691[var11] == 0) {
                    var8.field1871++;
                }
            }
            var8.field1872 = new int[var8.field1871];
            var8.field1866 = new int[var8.field1871];
            var8.field1909 = new int[var8.field1871];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1695; var13++) {
                if (var9[var13] > 0 && this.field1691[var13] == 0) {
                    var8.field1872[var12] = this.field1692[var13] & 0xFFFF;
                    var8.field1866[var12] = this.field1693[var13] & 0xFFFF;
                    var8.field1909[var12] = this.field1675[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1867 = new byte[this.field1679];
            for (int var14 = 0; var14 < this.field1679; var14++) {
                if (this.field1686[var14] == -1) {
                    var8.field1867[var14] = -1;
                } else {
                    var8.field1867[var14] = (byte) var9[this.field1686[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1679; var15++) {
            byte var16;
            if (this.field1683 == null) {
                var16 = 0;
            } else {
                var16 = this.field1683[var15];
            }
            byte var17;
            if (this.field1685 == null) {
                var17 = 0;
            } else {
                var17 = this.field1685[var15];
            }
            short var18;
            if (this.field1688 == null) {
                var18 = -1;
            } else {
                var18 = this.field1688[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1687[var15] & 0xFFFF;
                    class91 var20;
                    if (this.field1708 == null || this.field1708[this.field1700[var15]] == null) {
                        var20 = this.field1702[this.field1700[var15]];
                    } else {
                        var20 = this.field1708[this.field1700[var15]];
                    }
                    int var21 = (var20.field1504 * arg4 + var20.field1508 * arg2 + var20.field1505 * arg3) / (var20.field1502 * var7) + arg0;
                    var8.field1863[var15] = method2106(var19, var21);
                    class91 var22;
                    if (this.field1708 == null || this.field1708[this.field1721[var15]] == null) {
                        var22 = this.field1702[this.field1721[var15]];
                    } else {
                        var22 = this.field1708[this.field1721[var15]];
                    }
                    int var23 = (var22.field1504 * arg4 + var22.field1508 * arg2 + var22.field1505 * arg3) / (var22.field1502 * var7) + arg0;
                    var8.field1864[var15] = method2106(var19, var23);
                    class91 var24;
                    if (this.field1708 == null || this.field1708[this.field1682[var15]] == null) {
                        var24 = this.field1702[this.field1682[var15]];
                    } else {
                        var24 = this.field1708[this.field1682[var15]];
                    }
                    int var25 = (var24.field1504 * arg4 + var24.field1508 * arg2 + var24.field1505 * arg3) / (var24.field1502 * var7) + arg0;
                    var8.field1913[var15] = method2106(var19, var25);
                } else if (var16 == 1) {
                    class92 var26 = this.field1706[var15];
                    int var27 = (var26.field1511 * arg4 + var26.field1516 * arg3 + var26.field1510 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field1863[var15] = method2106(this.field1687[var15] & 0xFFFF, var27);
                    var8.field1913[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1863[var15] = 128;
                    var8.field1913[var15] = -1;
                } else {
                    var8.field1913[var15] = -2;
                }
            } else if (var16 == 0) {
                class91 var28;
                if (this.field1708 == null || this.field1708[this.field1700[var15]] == null) {
                    var28 = this.field1702[this.field1700[var15]];
                } else {
                    var28 = this.field1708[this.field1700[var15]];
                }
                int var29 = (var28.field1504 * arg4 + var28.field1508 * arg2 + var28.field1505 * arg3) / (var28.field1502 * var7) + arg0;
                var8.field1863[var15] = method2132(var29);
                class91 var30;
                if (this.field1708 == null || this.field1708[this.field1721[var15]] == null) {
                    var30 = this.field1702[this.field1721[var15]];
                } else {
                    var30 = this.field1708[this.field1721[var15]];
                }
                int var31 = (var30.field1504 * arg4 + var30.field1508 * arg2 + var30.field1505 * arg3) / (var30.field1502 * var7) + arg0;
                var8.field1864[var15] = method2132(var31);
                class91 var32;
                if (this.field1708 == null || this.field1708[this.field1682[var15]] == null) {
                    var32 = this.field1702[this.field1682[var15]];
                } else {
                    var32 = this.field1708[this.field1682[var15]];
                }
                int var33 = (var32.field1504 * arg4 + var32.field1508 * arg2 + var32.field1505 * arg3) / (var32.field1502 * var7) + arg0;
                var8.field1913[var15] = method2132(var33);
            } else if (var16 == 1) {
                class92 var34 = this.field1706[var15];
                int var35 = (var34.field1511 * arg4 + var34.field1516 * arg3 + var34.field1510 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field1863[var15] = method2132(var35);
                var8.field1913[var15] = -1;
            } else {
                var8.field1913[var15] = -2;
            }
        }
        this.method2091();
        var8.field1855 = this.field1707;
        var8.field1873 = this.field1676;
        var8.field1857 = this.field1698;
        var8.field1858 = this.field1694;
        var8.field1888 = this.field1679;
        var8.field1860 = this.field1700;
        var8.field1861 = this.field1721;
        var8.field1862 = this.field1682;
        var8.field1896 = this.field1684;
        var8.field1865 = this.field1685;
        var8.field1870 = this.field1689;
        var8.field1875 = this.field1704;
        var8.field1879 = this.field1705;
        var8.field1869 = this.field1688;
        return var8;
    }

    @ObfuscatedName("cm.j(II)I")
    public static final int method2106(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cm.q(I)I")
    public static final int method2132(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
