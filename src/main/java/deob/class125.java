package deob;

@ObfuscatedName("dy")
public class class125 extends class139 {

    @ObfuscatedName("dy.b")
    public int field1678 = 0;

    @ObfuscatedName("dy.q")
    public int[] field1701;

    @ObfuscatedName("dy.o")
    public int[] field1679;

    @ObfuscatedName("dy.p")
    public int[] field1680;

    @ObfuscatedName("dy.a")
    public int field1681 = 0;

    @ObfuscatedName("dy.h")
    public int[] field1684;

    @ObfuscatedName("dy.l")
    public int[] field1683;

    @ObfuscatedName("dy.y")
    public int[] field1708;

    @ObfuscatedName("dy.g")
    public byte[] field1685;

    @ObfuscatedName("dy.c")
    public byte[] field1686;

    @ObfuscatedName("dy.u")
    public byte[] field1687;

    @ObfuscatedName("dy.r")
    public byte[] field1688;

    @ObfuscatedName("dy.d")
    public short[] field1689;

    @ObfuscatedName("dy.v")
    public short[] field1690;

    @ObfuscatedName("dy.s")
    public byte field1682 = 0;

    @ObfuscatedName("dy.t")
    public int field1692;

    @ObfuscatedName("dy.f")
    public byte[] field1693;

    @ObfuscatedName("dy.m")
    public short[] field1707;

    @ObfuscatedName("dy.x")
    public short[] field1695;

    @ObfuscatedName("dy.w")
    public short[] field1696;

    @ObfuscatedName("dy.j")
    public short[] field1697;

    @ObfuscatedName("dy.z")
    public short[] field1698;

    @ObfuscatedName("dy.e")
    public short[] field1699;

    @ObfuscatedName("dy.k")
    public short[] field1700;

    @ObfuscatedName("dy.n")
    public short[] field1677;

    @ObfuscatedName("dy.i")
    public short[] field1702;

    @ObfuscatedName("dy.av")
    public byte[] field1703;

    @ObfuscatedName("dy.ao")
    public int[] field1704;

    @ObfuscatedName("dy.am")
    public int[] field1722;

    @ObfuscatedName("dy.aj")
    public int[][] field1713;

    @ObfuscatedName("dy.ah")
    public int[][] field1717;

    @ObfuscatedName("dy.af")
    public class141[] field1720;

    @ObfuscatedName("dy.ai")
    public class133[] field1709;

    @ObfuscatedName("dy.aq")
    public class133[] field1694;

    @ObfuscatedName("dy.ak")
    public short field1711;

    @ObfuscatedName("dy.al")
    public short field1712;

    @ObfuscatedName("dy.as")
    public boolean field1710 = false;

    @ObfuscatedName("dy.az")
    public int field1705;

    @ObfuscatedName("dy.ax")
    public int field1715;

    @ObfuscatedName("dy.ad")
    public int field1716;

    @ObfuscatedName("dy.ar")
    public int field1714;

    @ObfuscatedName("dy.ag")
    public int field1718;

    @ObfuscatedName("dy.au")
    public static int[] field1719 = new int[10000];

    @ObfuscatedName("dy.ac")
    public static int[] field1721 = new int[10000];

    @ObfuscatedName("dy.ay")
    public static int field1691 = 0;

    @ObfuscatedName("dy.at")
    public static int[] field1706 = class134.field1902;

    @ObfuscatedName("dy.aa")
    public static int[] field1723 = class134.field1917;

    public class125() {
    }

    @ObfuscatedName("dy.b(Lie;II)Ldy;")
    public static class125 method2389(class256 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4158(arg1, arg2);
        return var3 == null ? null : new class125(var3);
    }

    public class125(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2390(arg0);
        } else {
            this.method2391(arg0);
        }
    }

    @ObfuscatedName("dy.q([B)V")
    public void method2390(byte[] arg0) {
        class194 var2 = new class194(arg0);
        class194 var3 = new class194(arg0);
        class194 var4 = new class194(arg0);
        class194 var5 = new class194(arg0);
        class194 var6 = new class194(arg0);
        class194 var7 = new class194(arg0);
        class194 var8 = new class194(arg0);
        var2.field2538 = arg0.length - 23;
        int var9 = var2.method3249();
        int var10 = var2.method3249();
        int var11 = var2.method3247();
        int var12 = var2.method3247();
        int var13 = var2.method3247();
        int var14 = var2.method3247();
        int var15 = var2.method3247();
        int var16 = var2.method3247();
        int var17 = var2.method3247();
        int var18 = var2.method3249();
        int var19 = var2.method3249();
        int var20 = var2.method3249();
        int var21 = var2.method3249();
        int var22 = var2.method3249();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1693 = new byte[var11];
            var2.field2538 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1693[var26] = var2.method3248();
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
        this.field1681 = var10;
        this.field1692 = var11;
        this.field1701 = new int[var9];
        this.field1679 = new int[var9];
        this.field1680 = new int[var9];
        this.field1684 = new int[var10];
        this.field1683 = new int[var10];
        this.field1708 = new int[var10];
        if (var17 == 1) {
            this.field1704 = new int[var9];
        }
        if (var12 == 1) {
            this.field1685 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1686 = new byte[var10];
        } else {
            this.field1682 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1687 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1722 = new int[var10];
        }
        if (var16 == 1) {
            this.field1690 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1688 = new byte[var10];
        }
        this.field1689 = new short[var10];
        if (var11 > 0) {
            this.field1707 = new short[var11];
            this.field1695 = new short[var11];
            this.field1696 = new short[var11];
            if (var24 > 0) {
                this.field1697 = new short[var24];
                this.field1698 = new short[var24];
                this.field1699 = new short[var24];
                this.field1700 = new short[var24];
                this.field1703 = new byte[var24];
                this.field1677 = new short[var24];
            }
            if (var25 > 0) {
                this.field1702 = new short[var25];
            }
        }
        var2.field2538 = var11;
        var3.field2538 = var44;
        var4.field2538 = var46;
        var5.field2538 = var48;
        var6.field2538 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method3247();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method3260();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method3260();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method3260();
            }
            this.field1701[var67] = var64 + var69;
            this.field1679[var67] = var65 + var70;
            this.field1680[var67] = var66 + var71;
            var64 = this.field1701[var67];
            var65 = this.field1679[var67];
            var66 = this.field1680[var67];
            if (var17 == 1) {
                this.field1704[var67] = var6.method3247();
            }
        }
        var2.field2538 = var42;
        var3.field2538 = var31;
        var4.field2538 = var34;
        var5.field2538 = var37;
        var6.field2538 = var35;
        var7.field2538 = var40;
        var8.field2538 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1689[var72] = (short) var2.method3249();
            if (var12 == 1) {
                this.field1685[var72] = var3.method3248();
            }
            if (var13 == 255) {
                this.field1686[var72] = var4.method3248();
            }
            if (var14 == 1) {
                this.field1687[var72] = var5.method3248();
            }
            if (var15 == 1) {
                this.field1722[var72] = var6.method3247();
            }
            if (var16 == 1) {
                this.field1690[var72] = (short) (var7.method3249() - 1);
            }
            if (this.field1688 != null && this.field1690[var72] != -1) {
                this.field1688[var72] = (byte) (var8.method3247() - 1);
            }
        }
        var2.field2538 = var33;
        var3.field2538 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method3247();
            if (var78 == 1) {
                var73 = var2.method3260() + var76;
                var74 = var2.method3260() + var73;
                var75 = var2.method3260() + var74;
                var76 = var75;
                this.field1684[var77] = var73;
                this.field1683[var77] = var74;
                this.field1708[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method3260() + var76;
                var76 = var75;
                this.field1684[var77] = var73;
                this.field1683[var77] = var74;
                this.field1708[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method3260() + var76;
                var76 = var75;
                this.field1684[var77] = var73;
                this.field1683[var77] = var74;
                this.field1708[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method3260() + var76;
                var76 = var75;
                this.field1684[var77] = var73;
                this.field1683[var77] = var81;
                this.field1708[var77] = var75;
            }
        }
        var2.field2538 = var50;
        var3.field2538 = var52;
        var4.field2538 = var54;
        var5.field2538 = var56;
        var6.field2538 = var58;
        var7.field2538 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1693[var82] & 0xFF;
            if (var83 == 0) {
                this.field1707[var82] = (short) var2.method3249();
                this.field1695[var82] = (short) var2.method3249();
                this.field1696[var82] = (short) var2.method3249();
            }
            if (var83 == 1) {
                this.field1707[var82] = (short) var3.method3249();
                this.field1695[var82] = (short) var3.method3249();
                this.field1696[var82] = (short) var3.method3249();
                this.field1697[var82] = (short) var4.method3249();
                this.field1698[var82] = (short) var4.method3249();
                this.field1699[var82] = (short) var4.method3249();
                this.field1700[var82] = (short) var5.method3249();
                this.field1703[var82] = var6.method3248();
                this.field1677[var82] = (short) var7.method3249();
            }
            if (var83 == 2) {
                this.field1707[var82] = (short) var3.method3249();
                this.field1695[var82] = (short) var3.method3249();
                this.field1696[var82] = (short) var3.method3249();
                this.field1697[var82] = (short) var4.method3249();
                this.field1698[var82] = (short) var4.method3249();
                this.field1699[var82] = (short) var4.method3249();
                this.field1700[var82] = (short) var5.method3249();
                this.field1703[var82] = var6.method3248();
                this.field1677[var82] = (short) var7.method3249();
                this.field1702[var82] = (short) var7.method3249();
            }
            if (var83 == 3) {
                this.field1707[var82] = (short) var3.method3249();
                this.field1695[var82] = (short) var3.method3249();
                this.field1696[var82] = (short) var3.method3249();
                this.field1697[var82] = (short) var4.method3249();
                this.field1698[var82] = (short) var4.method3249();
                this.field1699[var82] = (short) var4.method3249();
                this.field1700[var82] = (short) var5.method3249();
                this.field1703[var82] = var6.method3248();
                this.field1677[var82] = (short) var7.method3249();
            }
        }
        var2.field2538 = var62;
        int var84 = var2.method3247();
        if (var84 == 0) {
            return;
        }
        new class138();
        var2.method3249();
        var2.method3249();
        var2.method3249();
        var2.method3261();
    }

    @ObfuscatedName("dy.o([B)V")
    public void method2391(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class194 var4 = new class194(arg0);
        class194 var5 = new class194(arg0);
        class194 var6 = new class194(arg0);
        class194 var7 = new class194(arg0);
        class194 var8 = new class194(arg0);
        var4.field2538 = arg0.length - 18;
        int var9 = var4.method3249();
        int var10 = var4.method3249();
        int var11 = var4.method3247();
        int var12 = var4.method3247();
        int var13 = var4.method3247();
        int var14 = var4.method3247();
        int var15 = var4.method3247();
        int var16 = var4.method3247();
        int var17 = var4.method3249();
        int var18 = var4.method3249();
        int var19 = var4.method3249();
        int var20 = var4.method3249();
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
        this.field1681 = var10;
        this.field1692 = var11;
        this.field1701 = new int[var9];
        this.field1679 = new int[var9];
        this.field1680 = new int[var9];
        this.field1684 = new int[var10];
        this.field1683 = new int[var10];
        this.field1708 = new int[var10];
        if (var11 > 0) {
            this.field1693 = new byte[var11];
            this.field1707 = new short[var11];
            this.field1695 = new short[var11];
            this.field1696 = new short[var11];
        }
        if (var16 == 1) {
            this.field1704 = new int[var9];
        }
        if (var12 == 1) {
            this.field1685 = new byte[var10];
            this.field1688 = new byte[var10];
            this.field1690 = new short[var10];
        }
        if (var13 == 255) {
            this.field1686 = new byte[var10];
        } else {
            this.field1682 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1687 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1722 = new int[var10];
        }
        this.field1689 = new short[var10];
        var4.field2538 = var21;
        var5.field2538 = var36;
        var6.field2538 = var38;
        var7.field2538 = var40;
        var8.field2538 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method3247();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method3260();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method3260();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method3260();
            }
            this.field1701[var46] = var43 + var48;
            this.field1679[var46] = var44 + var49;
            this.field1680[var46] = var45 + var50;
            var43 = this.field1701[var46];
            var44 = this.field1679[var46];
            var45 = this.field1680[var46];
            if (var16 == 1) {
                this.field1704[var46] = var8.method3247();
            }
        }
        var4.field2538 = var32;
        var5.field2538 = var28;
        var6.field2538 = var26;
        var7.field2538 = var30;
        var8.field2538 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1689[var51] = (short) var4.method3249();
            if (var12 == 1) {
                int var52 = var5.method3247();
                if ((var52 & 0x1) == 1) {
                    this.field1685[var51] = 1;
                    var2 = true;
                } else {
                    this.field1685[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1688[var51] = (byte) (var52 >> 2);
                    this.field1690[var51] = this.field1689[var51];
                    this.field1689[var51] = 127;
                    if (this.field1690[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1688[var51] = -1;
                    this.field1690[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1686[var51] = var6.method3248();
            }
            if (var14 == 1) {
                this.field1687[var51] = var7.method3248();
            }
            if (var15 == 1) {
                this.field1722[var51] = var8.method3247();
            }
        }
        var4.field2538 = var25;
        var5.field2538 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method3247();
            if (var58 == 1) {
                var53 = var4.method3260() + var56;
                var54 = var4.method3260() + var53;
                var55 = var4.method3260() + var54;
                var56 = var55;
                this.field1684[var57] = var53;
                this.field1683[var57] = var54;
                this.field1708[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method3260() + var56;
                var56 = var55;
                this.field1684[var57] = var53;
                this.field1683[var57] = var54;
                this.field1708[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method3260() + var56;
                var56 = var55;
                this.field1684[var57] = var53;
                this.field1683[var57] = var54;
                this.field1708[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method3260() + var56;
                var56 = var55;
                this.field1684[var57] = var53;
                this.field1683[var57] = var61;
                this.field1708[var57] = var55;
            }
        }
        var4.field2538 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1693[var62] = 0;
            this.field1707[var62] = (short) var4.method3249();
            this.field1695[var62] = (short) var4.method3249();
            this.field1696[var62] = (short) var4.method3249();
        }
        if (this.field1688 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1688[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1707[var65] & 0xFFFF) == this.field1684[var64] && (this.field1695[var65] & 0xFFFF) == this.field1683[var64] && (this.field1696[var65] & 0xFFFF) == this.field1708[var64]) {
                        this.field1688[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1688 = null;
            }
        }
        if (!var3) {
            this.field1690 = null;
        }
        if (!var2) {
            this.field1685 = null;
        }
    }

    public class125(class125[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1678 = 0;
        this.field1681 = 0;
        this.field1692 = 0;
        this.field1682 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class125 var10 = arg0[var9];
            if (var10 != null) {
                this.field1678 += var10.field1678;
                this.field1681 += var10.field1681;
                this.field1692 += var10.field1692;
                if (var10.field1686 == null) {
                    if (this.field1682 == -1) {
                        this.field1682 = var10.field1682;
                    }
                    if (this.field1682 != var10.field1682) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1685 != null;
                var5 |= var10.field1687 != null;
                var6 |= var10.field1722 != null;
                var7 |= var10.field1690 != null;
                var8 |= var10.field1688 != null;
            }
        }
        this.field1701 = new int[this.field1678];
        this.field1679 = new int[this.field1678];
        this.field1680 = new int[this.field1678];
        this.field1704 = new int[this.field1678];
        this.field1684 = new int[this.field1681];
        this.field1683 = new int[this.field1681];
        this.field1708 = new int[this.field1681];
        if (var3) {
            this.field1685 = new byte[this.field1681];
        }
        if (var4) {
            this.field1686 = new byte[this.field1681];
        }
        if (var5) {
            this.field1687 = new byte[this.field1681];
        }
        if (var6) {
            this.field1722 = new int[this.field1681];
        }
        if (var7) {
            this.field1690 = new short[this.field1681];
        }
        if (var8) {
            this.field1688 = new byte[this.field1681];
        }
        this.field1689 = new short[this.field1681];
        if (this.field1692 > 0) {
            this.field1693 = new byte[this.field1692];
            this.field1707 = new short[this.field1692];
            this.field1695 = new short[this.field1692];
            this.field1696 = new short[this.field1692];
            this.field1697 = new short[this.field1692];
            this.field1698 = new short[this.field1692];
            this.field1699 = new short[this.field1692];
            this.field1700 = new short[this.field1692];
            this.field1703 = new byte[this.field1692];
            this.field1677 = new short[this.field1692];
            this.field1702 = new short[this.field1692];
        }
        this.field1678 = 0;
        this.field1681 = 0;
        this.field1692 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class125 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1681; var13++) {
                    if (var3 && var12.field1685 != null) {
                        this.field1685[this.field1681] = var12.field1685[var13];
                    }
                    if (var4) {
                        if (var12.field1686 == null) {
                            this.field1686[this.field1681] = var12.field1682;
                        } else {
                            this.field1686[this.field1681] = var12.field1686[var13];
                        }
                    }
                    if (var5 && var12.field1687 != null) {
                        this.field1687[this.field1681] = var12.field1687[var13];
                    }
                    if (var6 && var12.field1722 != null) {
                        this.field1722[this.field1681] = var12.field1722[var13];
                    }
                    if (var7) {
                        if (var12.field1690 == null) {
                            this.field1690[this.field1681] = -1;
                        } else {
                            this.field1690[this.field1681] = var12.field1690[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1688 == null || var12.field1688[var13] == -1) {
                            this.field1688[this.field1681] = -1;
                        } else {
                            this.field1688[this.field1681] = (byte) (var12.field1688[var13] + this.field1692);
                        }
                    }
                    this.field1689[this.field1681] = var12.field1689[var13];
                    this.field1684[this.field1681] = this.method2421(var12, var12.field1684[var13]);
                    this.field1683[this.field1681] = this.method2421(var12, var12.field1683[var13]);
                    this.field1708[this.field1681] = this.method2421(var12, var12.field1708[var13]);
                    this.field1681++;
                }
                for (int var14 = 0; var14 < var12.field1692; var14++) {
                    byte var15 = this.field1693[this.field1692] = var12.field1693[var14];
                    if (var15 == 0) {
                        this.field1707[this.field1692] = (short) this.method2421(var12, var12.field1707[var14]);
                        this.field1695[this.field1692] = (short) this.method2421(var12, var12.field1695[var14]);
                        this.field1696[this.field1692] = (short) this.method2421(var12, var12.field1696[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1707[this.field1692] = var12.field1707[var14];
                        this.field1695[this.field1692] = var12.field1695[var14];
                        this.field1696[this.field1692] = var12.field1696[var14];
                        this.field1697[this.field1692] = var12.field1697[var14];
                        this.field1698[this.field1692] = var12.field1698[var14];
                        this.field1699[this.field1692] = var12.field1699[var14];
                        this.field1700[this.field1692] = var12.field1700[var14];
                        this.field1703[this.field1692] = var12.field1703[var14];
                        this.field1677[this.field1692] = var12.field1677[var14];
                    }
                    if (var15 == 2) {
                        this.field1702[this.field1692] = var12.field1702[var14];
                    }
                    this.field1692++;
                }
            }
        }
    }

    @ObfuscatedName("dy.p(Ldy;I)I")
    public final int method2421(class125 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1701[arg1];
        int var5 = arg0.field1679[arg1];
        int var6 = arg0.field1680[arg1];
        for (int var7 = 0; var7 < this.field1678; var7++) {
            if (this.field1701[var7] == var4 && this.field1679[var7] == var5 && this.field1680[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1701[this.field1678] = var4;
            this.field1679[this.field1678] = var5;
            this.field1680[this.field1678] = var6;
            if (arg0.field1704 != null) {
                this.field1704[this.field1678] = arg0.field1704[arg1];
            }
            var3 = this.field1678++;
        }
        return var3;
    }

    public class125(class125 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1678 = arg0.field1678;
        this.field1681 = arg0.field1681;
        this.field1692 = arg0.field1692;
        if (arg1) {
            this.field1701 = arg0.field1701;
            this.field1679 = arg0.field1679;
            this.field1680 = arg0.field1680;
        } else {
            this.field1701 = new int[this.field1678];
            this.field1679 = new int[this.field1678];
            this.field1680 = new int[this.field1678];
            for (int var6 = 0; var6 < this.field1678; var6++) {
                this.field1701[var6] = arg0.field1701[var6];
                this.field1679[var6] = arg0.field1679[var6];
                this.field1680[var6] = arg0.field1680[var6];
            }
        }
        if (arg2) {
            this.field1689 = arg0.field1689;
        } else {
            this.field1689 = new short[this.field1681];
            for (int var7 = 0; var7 < this.field1681; var7++) {
                this.field1689[var7] = arg0.field1689[var7];
            }
        }
        if (arg3 || arg0.field1690 == null) {
            this.field1690 = arg0.field1690;
        } else {
            this.field1690 = new short[this.field1681];
            for (int var8 = 0; var8 < this.field1681; var8++) {
                this.field1690[var8] = arg0.field1690[var8];
            }
        }
        if (arg4) {
            this.field1687 = arg0.field1687;
        } else {
            this.field1687 = new byte[this.field1681];
            if (arg0.field1687 == null) {
                for (int var9 = 0; var9 < this.field1681; var9++) {
                    this.field1687[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1681; var10++) {
                    this.field1687[var10] = arg0.field1687[var10];
                }
            }
        }
        this.field1684 = arg0.field1684;
        this.field1683 = arg0.field1683;
        this.field1708 = arg0.field1708;
        this.field1685 = arg0.field1685;
        this.field1686 = arg0.field1686;
        this.field1688 = arg0.field1688;
        this.field1682 = arg0.field1682;
        this.field1693 = arg0.field1693;
        this.field1707 = arg0.field1707;
        this.field1695 = arg0.field1695;
        this.field1696 = arg0.field1696;
        this.field1697 = arg0.field1697;
        this.field1698 = arg0.field1698;
        this.field1699 = arg0.field1699;
        this.field1700 = arg0.field1700;
        this.field1703 = arg0.field1703;
        this.field1677 = arg0.field1677;
        this.field1702 = arg0.field1702;
        this.field1704 = arg0.field1704;
        this.field1722 = arg0.field1722;
        this.field1713 = arg0.field1713;
        this.field1717 = arg0.field1717;
        this.field1709 = arg0.field1709;
        this.field1720 = arg0.field1720;
        this.field1694 = arg0.field1694;
        this.field1711 = arg0.field1711;
        this.field1712 = arg0.field1712;
    }

    @ObfuscatedName("dy.a()Ldy;")
    public class125 method2399() {
        class125 var1 = new class125();
        if (this.field1685 != null) {
            var1.field1685 = new byte[this.field1681];
            for (int var2 = 0; var2 < this.field1681; var2++) {
                var1.field1685[var2] = this.field1685[var2];
            }
        }
        var1.field1678 = this.field1678;
        var1.field1681 = this.field1681;
        var1.field1692 = this.field1692;
        var1.field1701 = this.field1701;
        var1.field1679 = this.field1679;
        var1.field1680 = this.field1680;
        var1.field1684 = this.field1684;
        var1.field1683 = this.field1683;
        var1.field1708 = this.field1708;
        var1.field1686 = this.field1686;
        var1.field1687 = this.field1687;
        var1.field1688 = this.field1688;
        var1.field1689 = this.field1689;
        var1.field1690 = this.field1690;
        var1.field1682 = this.field1682;
        var1.field1693 = this.field1693;
        var1.field1707 = this.field1707;
        var1.field1695 = this.field1695;
        var1.field1696 = this.field1696;
        var1.field1697 = this.field1697;
        var1.field1698 = this.field1698;
        var1.field1699 = this.field1699;
        var1.field1700 = this.field1700;
        var1.field1703 = this.field1703;
        var1.field1677 = this.field1677;
        var1.field1702 = this.field1702;
        var1.field1704 = this.field1704;
        var1.field1722 = this.field1722;
        var1.field1713 = this.field1713;
        var1.field1717 = this.field1717;
        var1.field1709 = this.field1709;
        var1.field1720 = this.field1720;
        var1.field1711 = this.field1711;
        var1.field1712 = this.field1712;
        return var1;
    }

    @ObfuscatedName("dy.h([[IIIIZI)Ldy;")
    public class125 method2469(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2407();
        int var7 = this.field1715 + arg1;
        int var8 = this.field1716 + arg1;
        int var9 = this.field1718 + arg3;
        int var10 = this.field1714 + arg3;
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
            var15.field1678 = this.field1678;
            var15.field1681 = this.field1681;
            var15.field1692 = this.field1692;
            var15.field1701 = this.field1701;
            var15.field1680 = this.field1680;
            var15.field1684 = this.field1684;
            var15.field1683 = this.field1683;
            var15.field1708 = this.field1708;
            var15.field1685 = this.field1685;
            var15.field1686 = this.field1686;
            var15.field1687 = this.field1687;
            var15.field1688 = this.field1688;
            var15.field1689 = this.field1689;
            var15.field1690 = this.field1690;
            var15.field1682 = this.field1682;
            var15.field1693 = this.field1693;
            var15.field1707 = this.field1707;
            var15.field1695 = this.field1695;
            var15.field1696 = this.field1696;
            var15.field1697 = this.field1697;
            var15.field1698 = this.field1698;
            var15.field1699 = this.field1699;
            var15.field1700 = this.field1700;
            var15.field1703 = this.field1703;
            var15.field1677 = this.field1677;
            var15.field1702 = this.field1702;
            var15.field1704 = this.field1704;
            var15.field1722 = this.field1722;
            var15.field1713 = this.field1713;
            var15.field1717 = this.field1717;
            var15.field1711 = this.field1711;
            var15.field1712 = this.field1712;
            var15.field1679 = new int[var15.field1678];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1678; var16++) {
                int var17 = this.field1701[var16] + arg1;
                int var18 = this.field1680[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1679[var16] = this.field1679[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1678; var26++) {
                int var27 = (-this.field1679[var26] << 16) / this.field1996;
                if (var27 < arg5) {
                    int var28 = this.field1701[var26] + arg1;
                    int var29 = this.field1680[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1679[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1679[var26];
                }
            }
        }
        var15.method2415();
        return var15;
    }

    @ObfuscatedName("dy.l()V")
    public void method2395() {
        int var10002;
        if (this.field1704 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1678; var3++) {
                int var4 = this.field1704[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1713 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1713[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1678) {
                int var7 = this.field1704[var6];
                this.field1713[var7][var1[var7]++] = var6++;
            }
            this.field1704 = null;
        }
        if (this.field1722 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1681; var10++) {
            int var11 = this.field1722[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1717 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1717[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1681) {
            int var14 = this.field1722[var13];
            this.field1717[var14][var8[var14]++] = var13++;
        }
        this.field1722 = null;
    }

    @ObfuscatedName("dy.y()V")
    public void method2396() {
        for (int var1 = 0; var1 < this.field1678; var1++) {
            int var2 = this.field1701[var1];
            this.field1701[var1] = this.field1680[var1];
            this.field1680[var1] = -var2;
        }
        this.method2415();
    }

    @ObfuscatedName("dy.c()V")
    public void method2427() {
        for (int var1 = 0; var1 < this.field1678; var1++) {
            this.field1701[var1] = -this.field1701[var1];
            this.field1680[var1] = -this.field1680[var1];
        }
        this.method2415();
    }

    @ObfuscatedName("dy.u()V")
    public void method2398() {
        for (int var1 = 0; var1 < this.field1678; var1++) {
            int var2 = this.field1680[var1];
            this.field1680[var1] = this.field1701[var1];
            this.field1701[var1] = -var2;
        }
        this.method2415();
    }

    @ObfuscatedName("dy.t(I)V")
    public void method2456(int arg0) {
        int var2 = field1706[arg0];
        int var3 = field1723[arg0];
        for (int var4 = 0; var4 < this.field1678; var4++) {
            int var5 = this.field1701[var4] * var3 + this.field1680[var4] * var2 >> 16;
            this.field1680[var4] = this.field1680[var4] * var3 - this.field1701[var4] * var2 >> 16;
            this.field1701[var4] = var5;
        }
        this.method2415();
    }

    @ObfuscatedName("dy.f(III)V")
    public void method2400(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1678; var4++) {
            this.field1701[var4] += arg0;
            this.field1679[var4] += arg1;
            this.field1680[var4] += arg2;
        }
        this.method2415();
    }

    @ObfuscatedName("dy.m(SS)V")
    public void method2401(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1681; var3++) {
            if (this.field1689[var3] == arg0) {
                this.field1689[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dy.x(SS)V")
    public void method2402(short arg0, short arg1) {
        if (this.field1690 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1681; var3++) {
            if (this.field1690[var3] == arg0) {
                this.field1690[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dy.w()V")
    public void method2448() {
        for (int var1 = 0; var1 < this.field1678; var1++) {
            this.field1680[var1] = -this.field1680[var1];
        }
        for (int var2 = 0; var2 < this.field1681; var2++) {
            int var3 = this.field1684[var2];
            this.field1684[var2] = this.field1708[var2];
            this.field1708[var2] = var3;
        }
        this.method2415();
    }

    @ObfuscatedName("dy.j(III)V")
    public void method2404(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1678; var4++) {
            this.field1701[var4] = this.field1701[var4] * arg0 / 128;
            this.field1679[var4] = this.field1679[var4] * arg1 / 128;
            this.field1680[var4] = this.field1680[var4] * arg2 / 128;
        }
        this.method2415();
    }

    @ObfuscatedName("dy.z()V")
    public void method2468() {
        if (this.field1709 != null) {
            return;
        }
        this.field1709 = new class133[this.field1678];
        for (int var1 = 0; var1 < this.field1678; var1++) {
            this.field1709[var1] = new class133();
        }
        for (int var2 = 0; var2 < this.field1681; var2++) {
            int var3 = this.field1684[var2];
            int var4 = this.field1683[var2];
            int var5 = this.field1708[var2];
            int var6 = this.field1701[var4] - this.field1701[var3];
            int var7 = this.field1679[var4] - this.field1679[var3];
            int var8 = this.field1680[var4] - this.field1680[var3];
            int var9 = this.field1701[var5] - this.field1701[var3];
            int var10 = this.field1679[var5] - this.field1679[var3];
            int var11 = this.field1680[var5] - this.field1680[var3];
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
            if (this.field1685 == null) {
                var19 = 0;
            } else {
                var19 = this.field1685[var2];
            }
            if (var19 == 0) {
                class133 var20 = this.field1709[var3];
                var20.field1887 += var16;
                var20.field1883 += var17;
                var20.field1885 += var18;
                var20.field1884++;
                class133 var21 = this.field1709[var4];
                var21.field1887 += var16;
                var21.field1883 += var17;
                var21.field1885 += var18;
                var21.field1884++;
                class133 var22 = this.field1709[var5];
                var22.field1887 += var16;
                var22.field1883 += var17;
                var22.field1885 += var18;
                var22.field1884++;
            } else if (var19 == 1) {
                if (this.field1720 == null) {
                    this.field1720 = new class141[this.field1681];
                }
                class141 var23 = this.field1720[var2] = new class141();
                var23.field2011 = var16;
                var23.field2007 = var17;
                var23.field2008 = var18;
            }
        }
    }

    @ObfuscatedName("dy.e()V")
    public void method2415() {
        this.field1709 = null;
        this.field1694 = null;
        this.field1720 = null;
        this.field1710 = false;
    }

    @ObfuscatedName("dy.k()V")
    public void method2407() {
        if (this.field1710) {
            return;
        }
        this.field1996 = 0;
        this.field1705 = 0;
        this.field1715 = 999999;
        this.field1716 = -999999;
        this.field1714 = -99999;
        this.field1718 = 99999;
        for (int var1 = 0; var1 < this.field1678; var1++) {
            int var2 = this.field1701[var1];
            int var3 = this.field1679[var1];
            int var4 = this.field1680[var1];
            if (var2 < this.field1715) {
                this.field1715 = var2;
            }
            if (var2 > this.field1716) {
                this.field1716 = var2;
            }
            if (var4 < this.field1718) {
                this.field1718 = var4;
            }
            if (var4 > this.field1714) {
                this.field1714 = var4;
            }
            if (-var3 > this.field1996) {
                this.field1996 = -var3;
            }
            if (var3 > this.field1705) {
                this.field1705 = var3;
            }
        }
        this.field1710 = true;
    }

    @ObfuscatedName("dy.ao(Ldy;Ldy;IIIZ)V")
    public static void method2419(class125 arg0, class125 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2407();
        arg0.method2468();
        arg1.method2407();
        arg1.method2468();
        field1691++;
        int var6 = 0;
        int[] var7 = arg1.field1701;
        int var8 = arg1.field1678;
        for (int var9 = 0; var9 < arg0.field1678; var9++) {
            class133 var10 = arg0.field1709[var9];
            if (var10.field1884 != 0) {
                int var11 = arg0.field1679[var9] - arg3;
                if (var11 <= arg1.field1705) {
                    int var12 = arg0.field1701[var9] - arg2;
                    if (var12 >= arg1.field1715 && var12 <= arg1.field1716) {
                        int var13 = arg0.field1680[var9] - arg4;
                        if (var13 >= arg1.field1718 && var13 <= arg1.field1714) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class133 var15 = arg1.field1709[var14];
                                if (var7[var14] == var12 && arg1.field1680[var14] == var13 && arg1.field1679[var14] == var11 && var15.field1884 != 0) {
                                    if (arg0.field1694 == null) {
                                        arg0.field1694 = new class133[arg0.field1678];
                                    }
                                    if (arg1.field1694 == null) {
                                        arg1.field1694 = new class133[var8];
                                    }
                                    class133 var16 = arg0.field1694[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1694[var9] = new class133(var10);
                                    }
                                    class133 var17 = arg1.field1694[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1694[var14] = new class133(var15);
                                    }
                                    var16.field1887 += var15.field1887;
                                    var16.field1883 += var15.field1883;
                                    var16.field1885 += var15.field1885;
                                    var16.field1884 += var15.field1884;
                                    var17.field1887 += var10.field1887;
                                    var17.field1883 += var10.field1883;
                                    var17.field1885 += var10.field1885;
                                    var17.field1884 += var10.field1884;
                                    var6++;
                                    field1719[var9] = field1691;
                                    field1721[var14] = field1691;
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
        for (int var18 = 0; var18 < arg0.field1681; var18++) {
            if (field1719[arg0.field1684[var18]] == field1691 && field1719[arg0.field1683[var18]] == field1691 && field1719[arg0.field1708[var18]] == field1691) {
                if (arg0.field1685 == null) {
                    arg0.field1685 = new byte[arg0.field1681];
                }
                arg0.field1685[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1681; var19++) {
            if (field1721[arg1.field1684[var19]] == field1691 && field1721[arg1.field1683[var19]] == field1691 && field1721[arg1.field1708[var19]] == field1691) {
                if (arg1.field1685 == null) {
                    arg1.field1685 = new byte[arg1.field1681];
                }
                arg1.field1685[var19] = 2;
            }
        }
    }

    @ObfuscatedName("dy.am(IIIII)Lee;")
    public final class131 method2409(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2468();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class131 var8 = new class131();
        var8.field1842 = new int[this.field1681];
        var8.field1832 = new int[this.field1681];
        var8.field1870 = new int[this.field1681];
        if (this.field1692 > 0 && this.field1688 != null) {
            int[] var9 = new int[this.field1692];
            for (int var10 = 0; var10 < this.field1681; var10++) {
                if (this.field1688[var10] != -1) {
                    var9[this.field1688[var10] & 0xFF]++;
                }
            }
            var8.field1822 = 0;
            for (int var11 = 0; var11 < this.field1692; var11++) {
                if (var9[var11] > 0 && this.field1693[var11] == 0) {
                    var8.field1822++;
                }
            }
            var8.field1814 = new int[var8.field1822];
            var8.field1824 = new int[var8.field1822];
            var8.field1812 = new int[var8.field1822];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1692; var13++) {
                if (var9[var13] > 0 && this.field1693[var13] == 0) {
                    var8.field1814[var12] = this.field1707[var13] & 0xFFFF;
                    var8.field1824[var12] = this.field1695[var13] & 0xFFFF;
                    var8.field1812[var12] = this.field1696[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1819 = new byte[this.field1681];
            for (int var14 = 0; var14 < this.field1681; var14++) {
                if (this.field1688[var14] == -1) {
                    var8.field1819[var14] = -1;
                } else {
                    var8.field1819[var14] = (byte) var9[this.field1688[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1681; var15++) {
            byte var16;
            if (this.field1685 == null) {
                var16 = 0;
            } else {
                var16 = this.field1685[var15];
            }
            byte var17;
            if (this.field1687 == null) {
                var17 = 0;
            } else {
                var17 = this.field1687[var15];
            }
            short var18;
            if (this.field1690 == null) {
                var18 = -1;
            } else {
                var18 = this.field1690[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1689[var15] & 0xFFFF;
                    class133 var20;
                    if (this.field1694 == null || this.field1694[this.field1684[var15]] == null) {
                        var20 = this.field1709[this.field1684[var15]];
                    } else {
                        var20 = this.field1694[this.field1684[var15]];
                    }
                    int var21 = (var20.field1885 * arg4 + var20.field1887 * arg2 + var20.field1883 * arg3) / (var20.field1884 * var7) + arg0;
                    var8.field1842[var15] = method2410(var19, var21);
                    class133 var22;
                    if (this.field1694 == null || this.field1694[this.field1683[var15]] == null) {
                        var22 = this.field1709[this.field1683[var15]];
                    } else {
                        var22 = this.field1694[this.field1683[var15]];
                    }
                    int var23 = (var22.field1885 * arg4 + var22.field1887 * arg2 + var22.field1883 * arg3) / (var22.field1884 * var7) + arg0;
                    var8.field1832[var15] = method2410(var19, var23);
                    class133 var24;
                    if (this.field1694 == null || this.field1694[this.field1708[var15]] == null) {
                        var24 = this.field1709[this.field1708[var15]];
                    } else {
                        var24 = this.field1694[this.field1708[var15]];
                    }
                    int var25 = (var24.field1885 * arg4 + var24.field1887 * arg2 + var24.field1883 * arg3) / (var24.field1884 * var7) + arg0;
                    var8.field1870[var15] = method2410(var19, var25);
                } else if (var16 == 1) {
                    class141 var26 = this.field1720[var15];
                    int var27 = (var26.field2008 * arg4 + var26.field2011 * arg2 + var26.field2007 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1842[var15] = method2410(this.field1689[var15] & 0xFFFF, var27);
                    var8.field1870[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1842[var15] = 128;
                    var8.field1870[var15] = -1;
                } else {
                    var8.field1870[var15] = -2;
                }
            } else if (var16 == 0) {
                class133 var28;
                if (this.field1694 == null || this.field1694[this.field1684[var15]] == null) {
                    var28 = this.field1709[this.field1684[var15]];
                } else {
                    var28 = this.field1694[this.field1684[var15]];
                }
                int var29 = (var28.field1885 * arg4 + var28.field1887 * arg2 + var28.field1883 * arg3) / (var28.field1884 * var7) + arg0;
                var8.field1842[var15] = method2411(var29);
                class133 var30;
                if (this.field1694 == null || this.field1694[this.field1683[var15]] == null) {
                    var30 = this.field1709[this.field1683[var15]];
                } else {
                    var30 = this.field1694[this.field1683[var15]];
                }
                int var31 = (var30.field1885 * arg4 + var30.field1887 * arg2 + var30.field1883 * arg3) / (var30.field1884 * var7) + arg0;
                var8.field1832[var15] = method2411(var31);
                class133 var32;
                if (this.field1694 == null || this.field1694[this.field1708[var15]] == null) {
                    var32 = this.field1709[this.field1708[var15]];
                } else {
                    var32 = this.field1694[this.field1708[var15]];
                }
                int var33 = (var32.field1885 * arg4 + var32.field1887 * arg2 + var32.field1883 * arg3) / (var32.field1884 * var7) + arg0;
                var8.field1870[var15] = method2411(var33);
            } else if (var16 == 1) {
                class141 var34 = this.field1720[var15];
                int var35 = (var34.field2008 * arg4 + var34.field2011 * arg2 + var34.field2007 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1842[var15] = method2411(var35);
                var8.field1870[var15] = -1;
            } else {
                var8.field1870[var15] = -2;
            }
        }
        this.method2395();
        var8.field1806 = this.field1678;
        var8.field1834 = this.field1701;
        var8.field1808 = this.field1679;
        var8.field1809 = this.field1680;
        var8.field1810 = this.field1681;
        var8.field1811 = this.field1684;
        var8.field1839 = this.field1683;
        var8.field1813 = this.field1708;
        var8.field1817 = this.field1686;
        var8.field1818 = this.field1687;
        var8.field1816 = this.field1682;
        var8.field1858 = this.field1713;
        var8.field1831 = this.field1717;
        var8.field1833 = this.field1690;
        return var8;
    }

    @ObfuscatedName("dy.aj(II)I")
    public static final int method2410(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("dy.ah(I)I")
    public static final int method2411(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
