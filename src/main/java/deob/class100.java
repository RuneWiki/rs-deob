package deob;

@ObfuscatedName("cn")
public class class100 extends class85 {

    @ObfuscatedName("cn.z")
    public int field1718 = 0;

    @ObfuscatedName("cn.q")
    public int[] field1681;

    @ObfuscatedName("cn.k")
    public int[] field1682;

    @ObfuscatedName("cn.f")
    public int[] field1701;

    @ObfuscatedName("cn.d")
    public int field1710 = 0;

    @ObfuscatedName("cn.l")
    public int[] field1688;

    @ObfuscatedName("cn.r")
    public int[] field1686;

    @ObfuscatedName("cn.g")
    public int[] field1687;

    @ObfuscatedName("cn.h")
    public byte[] field1726;

    @ObfuscatedName("cn.n")
    public byte[] field1689;

    @ObfuscatedName("cn.j")
    public byte[] field1699;

    @ObfuscatedName("cn.a")
    public byte[] field1691;

    @ObfuscatedName("cn.b")
    public short[] field1692;

    @ObfuscatedName("cn.c")
    public short[] field1693;

    @ObfuscatedName("cn.v")
    public byte field1694 = 0;

    @ObfuscatedName("cn.p")
    public int field1695;

    @ObfuscatedName("cn.i")
    public byte[] field1696;

    @ObfuscatedName("cn.t")
    public short[] field1697;

    @ObfuscatedName("cn.u")
    public short[] field1698;

    @ObfuscatedName("cn.e")
    public short[] field1720;

    @ObfuscatedName("cn.m")
    public short[] field1724;

    @ObfuscatedName("cn.s")
    public short[] field1705;

    @ObfuscatedName("cn.x")
    public short[] field1702;

    @ObfuscatedName("cn.y")
    public short[] field1703;

    @ObfuscatedName("cn.w")
    public short[] field1704;

    @ObfuscatedName("cn.o")
    public short[] field1685;

    @ObfuscatedName("cn.aw")
    public byte[] field1706;

    @ObfuscatedName("cn.an")
    public int[] field1714;

    @ObfuscatedName("cn.ab")
    public int[] field1708;

    @ObfuscatedName("cn.al")
    public int[][] field1709;

    @ObfuscatedName("cn.ay")
    public int[][] field1725;

    @ObfuscatedName("cn.aq")
    public class84[] field1719;

    @ObfuscatedName("cn.ac")
    public class96[] field1711;

    @ObfuscatedName("cn.ak")
    public class96[] field1713;

    @ObfuscatedName("cn.am")
    public short field1680;

    @ObfuscatedName("cn.aj")
    public short field1715;

    @ObfuscatedName("cn.au")
    public boolean field1716 = false;

    @ObfuscatedName("cn.av")
    public int field1717;

    @ObfuscatedName("cn.ad")
    public int field1723;

    @ObfuscatedName("cn.ae")
    public int field1700;

    @ObfuscatedName("cn.ai")
    public int field1683;

    @ObfuscatedName("cn.at")
    public int field1721;

    @ObfuscatedName("cn.ah")
    public static int[] field1722 = new int[10000];

    @ObfuscatedName("cn.ao")
    public static int[] field1712 = new int[10000];

    @ObfuscatedName("cn.aa")
    public static int field1707 = 0;

    @ObfuscatedName("cn.ax")
    public static int[] field1690 = class91.field1580;

    @ObfuscatedName("cn.as")
    public static int[] field1684 = class91.field1566;

    public class100() {
    }

    @ObfuscatedName("cn.z(Lfl;II)Lcn;")
    public static class100 method2071(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2986(arg1, arg2);
        return var3 == null ? null : new class100(var3);
    }

    public class100(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1999(arg0);
        } else {
            this.method2036(arg0);
        }
    }

    @ObfuscatedName("cn.q([B)V")
    public void method1999(byte[] arg0) {
        class119 var2 = new class119(arg0);
        class119 var3 = new class119(arg0);
        class119 var4 = new class119(arg0);
        class119 var5 = new class119(arg0);
        class119 var6 = new class119(arg0);
        class119 var7 = new class119(arg0);
        class119 var8 = new class119(arg0);
        var2.field1986 = arg0.length - 23;
        int var9 = var2.method2415();
        int var10 = var2.method2415();
        int var11 = var2.method2457();
        int var12 = var2.method2457();
        int var13 = var2.method2457();
        int var14 = var2.method2457();
        int var15 = var2.method2457();
        int var16 = var2.method2457();
        int var17 = var2.method2457();
        int var18 = var2.method2415();
        int var19 = var2.method2415();
        int var20 = var2.method2415();
        int var21 = var2.method2415();
        int var22 = var2.method2415();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1696 = new byte[var11];
            var2.field1986 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1696[var26] = var2.method2423();
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
        this.field1718 = var9;
        this.field1710 = var10;
        this.field1695 = var11;
        this.field1681 = new int[var9];
        this.field1682 = new int[var9];
        this.field1701 = new int[var9];
        this.field1688 = new int[var10];
        this.field1686 = new int[var10];
        this.field1687 = new int[var10];
        if (var17 == 1) {
            this.field1714 = new int[var9];
        }
        if (var12 == 1) {
            this.field1726 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1689 = new byte[var10];
        } else {
            this.field1694 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1699 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1708 = new int[var10];
        }
        if (var16 == 1) {
            this.field1693 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1691 = new byte[var10];
        }
        this.field1692 = new short[var10];
        if (var11 > 0) {
            this.field1697 = new short[var11];
            this.field1698 = new short[var11];
            this.field1720 = new short[var11];
            if (var24 > 0) {
                this.field1724 = new short[var24];
                this.field1705 = new short[var24];
                this.field1702 = new short[var24];
                this.field1703 = new short[var24];
                this.field1706 = new byte[var24];
                this.field1704 = new short[var24];
            }
            if (var25 > 0) {
                this.field1685 = new short[var25];
            }
        }
        var2.field1986 = var11;
        var3.field1986 = var44;
        var4.field1986 = var46;
        var5.field1986 = var48;
        var6.field1986 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2457();
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
            this.field1681[var67] = var64 + var69;
            this.field1682[var67] = var65 + var70;
            this.field1701[var67] = var66 + var71;
            var64 = this.field1681[var67];
            var65 = this.field1682[var67];
            var66 = this.field1701[var67];
            if (var17 == 1) {
                this.field1714[var67] = var6.method2457();
            }
        }
        var2.field1986 = var42;
        var3.field1986 = var31;
        var4.field1986 = var34;
        var5.field1986 = var37;
        var6.field1986 = var35;
        var7.field1986 = var40;
        var8.field1986 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1692[var72] = (short) var2.method2415();
            if (var12 == 1) {
                this.field1726[var72] = var3.method2423();
            }
            if (var13 == 255) {
                this.field1689[var72] = var4.method2423();
            }
            if (var14 == 1) {
                this.field1699[var72] = var5.method2423();
            }
            if (var15 == 1) {
                this.field1708[var72] = var6.method2457();
            }
            if (var16 == 1) {
                this.field1693[var72] = (short) (var7.method2415() - 1);
            }
            if (this.field1691 != null && this.field1693[var72] != -1) {
                this.field1691[var72] = (byte) (var8.method2457() - 1);
            }
        }
        var2.field1986 = var33;
        var3.field1986 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2457();
            if (var78 == 1) {
                var73 = var2.method2390() + var76;
                var74 = var2.method2390() + var73;
                var75 = var2.method2390() + var74;
                var76 = var75;
                this.field1688[var77] = var73;
                this.field1686[var77] = var74;
                this.field1687[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2390() + var76;
                var76 = var75;
                this.field1688[var77] = var73;
                this.field1686[var77] = var74;
                this.field1687[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2390() + var76;
                var76 = var75;
                this.field1688[var77] = var73;
                this.field1686[var77] = var74;
                this.field1687[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2390() + var76;
                var76 = var75;
                this.field1688[var77] = var73;
                this.field1686[var77] = var81;
                this.field1687[var77] = var75;
            }
        }
        var2.field1986 = var50;
        var3.field1986 = var52;
        var4.field1986 = var54;
        var5.field1986 = var56;
        var6.field1986 = var58;
        var7.field1986 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1696[var82] & 0xFF;
            if (var83 == 0) {
                this.field1697[var82] = (short) var2.method2415();
                this.field1698[var82] = (short) var2.method2415();
                this.field1720[var82] = (short) var2.method2415();
            }
            if (var83 == 1) {
                this.field1697[var82] = (short) var3.method2415();
                this.field1698[var82] = (short) var3.method2415();
                this.field1720[var82] = (short) var3.method2415();
                this.field1724[var82] = (short) var4.method2415();
                this.field1705[var82] = (short) var4.method2415();
                this.field1702[var82] = (short) var4.method2415();
                this.field1703[var82] = (short) var5.method2415();
                this.field1706[var82] = var6.method2423();
                this.field1704[var82] = (short) var7.method2415();
            }
            if (var83 == 2) {
                this.field1697[var82] = (short) var3.method2415();
                this.field1698[var82] = (short) var3.method2415();
                this.field1720[var82] = (short) var3.method2415();
                this.field1724[var82] = (short) var4.method2415();
                this.field1705[var82] = (short) var4.method2415();
                this.field1702[var82] = (short) var4.method2415();
                this.field1703[var82] = (short) var5.method2415();
                this.field1706[var82] = var6.method2423();
                this.field1704[var82] = (short) var7.method2415();
                this.field1685[var82] = (short) var7.method2415();
            }
            if (var83 == 3) {
                this.field1697[var82] = (short) var3.method2415();
                this.field1698[var82] = (short) var3.method2415();
                this.field1720[var82] = (short) var3.method2415();
                this.field1724[var82] = (short) var4.method2415();
                this.field1705[var82] = (short) var4.method2415();
                this.field1702[var82] = (short) var4.method2415();
                this.field1703[var82] = (short) var5.method2415();
                this.field1706[var82] = var6.method2423();
                this.field1704[var82] = (short) var7.method2415();
            }
        }
        var2.field1986 = var62;
        int var84 = var2.method2457();
        if (var84 == 0) {
            return;
        }
        new class90();
        var2.method2415();
        var2.method2415();
        var2.method2415();
        var2.method2306();
    }

    @ObfuscatedName("cn.f([B)V")
    public void method2036(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class119 var4 = new class119(arg0);
        class119 var5 = new class119(arg0);
        class119 var6 = new class119(arg0);
        class119 var7 = new class119(arg0);
        class119 var8 = new class119(arg0);
        var4.field1986 = arg0.length - 18;
        int var9 = var4.method2415();
        int var10 = var4.method2415();
        int var11 = var4.method2457();
        int var12 = var4.method2457();
        int var13 = var4.method2457();
        int var14 = var4.method2457();
        int var15 = var4.method2457();
        int var16 = var4.method2457();
        int var17 = var4.method2415();
        int var18 = var4.method2415();
        int var19 = var4.method2415();
        int var20 = var4.method2415();
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
        this.field1718 = var9;
        this.field1710 = var10;
        this.field1695 = var11;
        this.field1681 = new int[var9];
        this.field1682 = new int[var9];
        this.field1701 = new int[var9];
        this.field1688 = new int[var10];
        this.field1686 = new int[var10];
        this.field1687 = new int[var10];
        if (var11 > 0) {
            this.field1696 = new byte[var11];
            this.field1697 = new short[var11];
            this.field1698 = new short[var11];
            this.field1720 = new short[var11];
        }
        if (var16 == 1) {
            this.field1714 = new int[var9];
        }
        if (var12 == 1) {
            this.field1726 = new byte[var10];
            this.field1691 = new byte[var10];
            this.field1693 = new short[var10];
        }
        if (var13 == 255) {
            this.field1689 = new byte[var10];
        } else {
            this.field1694 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1699 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1708 = new int[var10];
        }
        this.field1692 = new short[var10];
        var4.field1986 = var21;
        var5.field1986 = var36;
        var6.field1986 = var38;
        var7.field1986 = var40;
        var8.field1986 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2457();
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
            this.field1681[var46] = var43 + var48;
            this.field1682[var46] = var44 + var49;
            this.field1701[var46] = var45 + var50;
            var43 = this.field1681[var46];
            var44 = this.field1682[var46];
            var45 = this.field1701[var46];
            if (var16 == 1) {
                this.field1714[var46] = var8.method2457();
            }
        }
        var4.field1986 = var32;
        var5.field1986 = var28;
        var6.field1986 = var26;
        var7.field1986 = var30;
        var8.field1986 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1692[var51] = (short) var4.method2415();
            if (var12 == 1) {
                int var52 = var5.method2457();
                if ((var52 & 0x1) == 1) {
                    this.field1726[var51] = 1;
                    var2 = true;
                } else {
                    this.field1726[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1691[var51] = (byte) (var52 >> 2);
                    this.field1693[var51] = this.field1692[var51];
                    this.field1692[var51] = 127;
                    if (this.field1693[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1691[var51] = -1;
                    this.field1693[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1689[var51] = var6.method2423();
            }
            if (var14 == 1) {
                this.field1699[var51] = var7.method2423();
            }
            if (var15 == 1) {
                this.field1708[var51] = var8.method2457();
            }
        }
        var4.field1986 = var25;
        var5.field1986 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2457();
            if (var58 == 1) {
                var53 = var4.method2390() + var56;
                var54 = var4.method2390() + var53;
                var55 = var4.method2390() + var54;
                var56 = var55;
                this.field1688[var57] = var53;
                this.field1686[var57] = var54;
                this.field1687[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2390() + var56;
                var56 = var55;
                this.field1688[var57] = var53;
                this.field1686[var57] = var54;
                this.field1687[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2390() + var56;
                var56 = var55;
                this.field1688[var57] = var53;
                this.field1686[var57] = var54;
                this.field1687[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2390() + var56;
                var56 = var55;
                this.field1688[var57] = var53;
                this.field1686[var57] = var61;
                this.field1687[var57] = var55;
            }
        }
        var4.field1986 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1696[var62] = 0;
            this.field1697[var62] = (short) var4.method2415();
            this.field1698[var62] = (short) var4.method2415();
            this.field1720[var62] = (short) var4.method2415();
        }
        if (this.field1691 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1691[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1697[var65] & 0xFFFF) == this.field1688[var64] && (this.field1698[var65] & 0xFFFF) == this.field1686[var64] && (this.field1720[var65] & 0xFFFF) == this.field1687[var64]) {
                        this.field1691[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1691 = null;
            }
        }
        if (!var3) {
            this.field1693 = null;
        }
        if (!var2) {
            this.field1726 = null;
        }
    }

    public class100(class100[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1718 = 0;
        this.field1710 = 0;
        this.field1695 = 0;
        this.field1694 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class100 var10 = arg0[var9];
            if (var10 != null) {
                this.field1718 += var10.field1718;
                this.field1710 += var10.field1710;
                this.field1695 += var10.field1695;
                if (var10.field1689 == null) {
                    if (this.field1694 == -1) {
                        this.field1694 = var10.field1694;
                    }
                    if (this.field1694 != var10.field1694) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1726 != null;
                var5 |= var10.field1699 != null;
                var6 |= var10.field1708 != null;
                var7 |= var10.field1693 != null;
                var8 |= var10.field1691 != null;
            }
        }
        this.field1681 = new int[this.field1718];
        this.field1682 = new int[this.field1718];
        this.field1701 = new int[this.field1718];
        this.field1714 = new int[this.field1718];
        this.field1688 = new int[this.field1710];
        this.field1686 = new int[this.field1710];
        this.field1687 = new int[this.field1710];
        if (var3) {
            this.field1726 = new byte[this.field1710];
        }
        if (var4) {
            this.field1689 = new byte[this.field1710];
        }
        if (var5) {
            this.field1699 = new byte[this.field1710];
        }
        if (var6) {
            this.field1708 = new int[this.field1710];
        }
        if (var7) {
            this.field1693 = new short[this.field1710];
        }
        if (var8) {
            this.field1691 = new byte[this.field1710];
        }
        this.field1692 = new short[this.field1710];
        if (this.field1695 > 0) {
            this.field1696 = new byte[this.field1695];
            this.field1697 = new short[this.field1695];
            this.field1698 = new short[this.field1695];
            this.field1720 = new short[this.field1695];
            this.field1724 = new short[this.field1695];
            this.field1705 = new short[this.field1695];
            this.field1702 = new short[this.field1695];
            this.field1703 = new short[this.field1695];
            this.field1706 = new byte[this.field1695];
            this.field1704 = new short[this.field1695];
            this.field1685 = new short[this.field1695];
        }
        this.field1718 = 0;
        this.field1710 = 0;
        this.field1695 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class100 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1710; var13++) {
                    if (var3 && var12.field1726 != null) {
                        this.field1726[this.field1710] = var12.field1726[var13];
                    }
                    if (var4) {
                        if (var12.field1689 == null) {
                            this.field1689[this.field1710] = var12.field1694;
                        } else {
                            this.field1689[this.field1710] = var12.field1689[var13];
                        }
                    }
                    if (var5 && var12.field1699 != null) {
                        this.field1699[this.field1710] = var12.field1699[var13];
                    }
                    if (var6 && var12.field1708 != null) {
                        this.field1708[this.field1710] = var12.field1708[var13];
                    }
                    if (var7) {
                        if (var12.field1693 == null) {
                            this.field1693[this.field1710] = -1;
                        } else {
                            this.field1693[this.field1710] = var12.field1693[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1691 == null || var12.field1691[var13] == -1) {
                            this.field1691[this.field1710] = -1;
                        } else {
                            this.field1691[this.field1710] = (byte) (var12.field1691[var13] + this.field1695);
                        }
                    }
                    this.field1692[this.field1710] = var12.field1692[var13];
                    this.field1688[this.field1710] = this.method2070(var12, var12.field1688[var13]);
                    this.field1686[this.field1710] = this.method2070(var12, var12.field1686[var13]);
                    this.field1687[this.field1710] = this.method2070(var12, var12.field1687[var13]);
                    this.field1710++;
                }
                for (int var14 = 0; var14 < var12.field1695; var14++) {
                    byte var15 = this.field1696[this.field1695] = var12.field1696[var14];
                    if (var15 == 0) {
                        this.field1697[this.field1695] = (short) this.method2070(var12, var12.field1697[var14]);
                        this.field1698[this.field1695] = (short) this.method2070(var12, var12.field1698[var14]);
                        this.field1720[this.field1695] = (short) this.method2070(var12, var12.field1720[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1697[this.field1695] = var12.field1697[var14];
                        this.field1698[this.field1695] = var12.field1698[var14];
                        this.field1720[this.field1695] = var12.field1720[var14];
                        this.field1724[this.field1695] = var12.field1724[var14];
                        this.field1705[this.field1695] = var12.field1705[var14];
                        this.field1702[this.field1695] = var12.field1702[var14];
                        this.field1703[this.field1695] = var12.field1703[var14];
                        this.field1706[this.field1695] = var12.field1706[var14];
                        this.field1704[this.field1695] = var12.field1704[var14];
                    }
                    if (var15 == 2) {
                        this.field1685[this.field1695] = var12.field1685[var14];
                    }
                    this.field1695++;
                }
            }
        }
    }

    @ObfuscatedName("cn.d(Lcn;I)I")
    public final int method2070(class100 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1681[arg1];
        int var5 = arg0.field1682[arg1];
        int var6 = arg0.field1701[arg1];
        for (int var7 = 0; var7 < this.field1718; var7++) {
            if (this.field1681[var7] == var4 && this.field1682[var7] == var5 && this.field1701[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1681[this.field1718] = var4;
            this.field1682[this.field1718] = var5;
            this.field1701[this.field1718] = var6;
            if (arg0.field1714 != null) {
                this.field1714[this.field1718] = arg0.field1714[arg1];
            }
            var3 = this.field1718++;
        }
        return var3;
    }

    public class100(class100 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1718 = arg0.field1718;
        this.field1710 = arg0.field1710;
        this.field1695 = arg0.field1695;
        if (arg1) {
            this.field1681 = arg0.field1681;
            this.field1682 = arg0.field1682;
            this.field1701 = arg0.field1701;
        } else {
            this.field1681 = new int[this.field1718];
            this.field1682 = new int[this.field1718];
            this.field1701 = new int[this.field1718];
            for (int var6 = 0; var6 < this.field1718; var6++) {
                this.field1681[var6] = arg0.field1681[var6];
                this.field1682[var6] = arg0.field1682[var6];
                this.field1701[var6] = arg0.field1701[var6];
            }
        }
        if (arg2) {
            this.field1692 = arg0.field1692;
        } else {
            this.field1692 = new short[this.field1710];
            for (int var7 = 0; var7 < this.field1710; var7++) {
                this.field1692[var7] = arg0.field1692[var7];
            }
        }
        if (arg3 || arg0.field1693 == null) {
            this.field1693 = arg0.field1693;
        } else {
            this.field1693 = new short[this.field1710];
            for (int var8 = 0; var8 < this.field1710; var8++) {
                this.field1693[var8] = arg0.field1693[var8];
            }
        }
        if (arg4) {
            this.field1699 = arg0.field1699;
        } else {
            this.field1699 = new byte[this.field1710];
            if (arg0.field1699 == null) {
                for (int var9 = 0; var9 < this.field1710; var9++) {
                    this.field1699[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1710; var10++) {
                    this.field1699[var10] = arg0.field1699[var10];
                }
            }
        }
        this.field1688 = arg0.field1688;
        this.field1686 = arg0.field1686;
        this.field1687 = arg0.field1687;
        this.field1726 = arg0.field1726;
        this.field1689 = arg0.field1689;
        this.field1691 = arg0.field1691;
        this.field1694 = arg0.field1694;
        this.field1696 = arg0.field1696;
        this.field1697 = arg0.field1697;
        this.field1698 = arg0.field1698;
        this.field1720 = arg0.field1720;
        this.field1724 = arg0.field1724;
        this.field1705 = arg0.field1705;
        this.field1702 = arg0.field1702;
        this.field1703 = arg0.field1703;
        this.field1706 = arg0.field1706;
        this.field1704 = arg0.field1704;
        this.field1685 = arg0.field1685;
        this.field1714 = arg0.field1714;
        this.field1708 = arg0.field1708;
        this.field1709 = arg0.field1709;
        this.field1725 = arg0.field1725;
        this.field1711 = arg0.field1711;
        this.field1719 = arg0.field1719;
        this.field1713 = arg0.field1713;
        this.field1680 = arg0.field1680;
        this.field1715 = arg0.field1715;
    }

    @ObfuscatedName("cn.l()Lcn;")
    public class100 method2018() {
        class100 var1 = new class100();
        if (this.field1726 != null) {
            var1.field1726 = new byte[this.field1710];
            for (int var2 = 0; var2 < this.field1710; var2++) {
                var1.field1726[var2] = this.field1726[var2];
            }
        }
        var1.field1718 = this.field1718;
        var1.field1710 = this.field1710;
        var1.field1695 = this.field1695;
        var1.field1681 = this.field1681;
        var1.field1682 = this.field1682;
        var1.field1701 = this.field1701;
        var1.field1688 = this.field1688;
        var1.field1686 = this.field1686;
        var1.field1687 = this.field1687;
        var1.field1689 = this.field1689;
        var1.field1699 = this.field1699;
        var1.field1691 = this.field1691;
        var1.field1692 = this.field1692;
        var1.field1693 = this.field1693;
        var1.field1694 = this.field1694;
        var1.field1696 = this.field1696;
        var1.field1697 = this.field1697;
        var1.field1698 = this.field1698;
        var1.field1720 = this.field1720;
        var1.field1724 = this.field1724;
        var1.field1705 = this.field1705;
        var1.field1702 = this.field1702;
        var1.field1703 = this.field1703;
        var1.field1706 = this.field1706;
        var1.field1704 = this.field1704;
        var1.field1685 = this.field1685;
        var1.field1714 = this.field1714;
        var1.field1708 = this.field1708;
        var1.field1709 = this.field1709;
        var1.field1725 = this.field1725;
        var1.field1711 = this.field1711;
        var1.field1719 = this.field1719;
        var1.field1680 = this.field1680;
        var1.field1715 = this.field1715;
        return var1;
    }

    @ObfuscatedName("cn.r([[IIIIZI)Lcn;")
    public class100 method2051(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2016();
        int var7 = this.field1723 + arg1;
        int var8 = this.field1700 + arg1;
        int var9 = this.field1721 + arg3;
        int var10 = this.field1683 + arg3;
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
            var15.field1718 = this.field1718;
            var15.field1710 = this.field1710;
            var15.field1695 = this.field1695;
            var15.field1681 = this.field1681;
            var15.field1701 = this.field1701;
            var15.field1688 = this.field1688;
            var15.field1686 = this.field1686;
            var15.field1687 = this.field1687;
            var15.field1726 = this.field1726;
            var15.field1689 = this.field1689;
            var15.field1699 = this.field1699;
            var15.field1691 = this.field1691;
            var15.field1692 = this.field1692;
            var15.field1693 = this.field1693;
            var15.field1694 = this.field1694;
            var15.field1696 = this.field1696;
            var15.field1697 = this.field1697;
            var15.field1698 = this.field1698;
            var15.field1720 = this.field1720;
            var15.field1724 = this.field1724;
            var15.field1705 = this.field1705;
            var15.field1702 = this.field1702;
            var15.field1703 = this.field1703;
            var15.field1706 = this.field1706;
            var15.field1704 = this.field1704;
            var15.field1685 = this.field1685;
            var15.field1714 = this.field1714;
            var15.field1708 = this.field1708;
            var15.field1709 = this.field1709;
            var15.field1725 = this.field1725;
            var15.field1680 = this.field1680;
            var15.field1715 = this.field1715;
            var15.field1682 = new int[var15.field1718];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1718; var16++) {
                int var17 = this.field1681[var16] + arg1;
                int var18 = this.field1701[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1682[var16] = this.field1682[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1718; var26++) {
                int var27 = (-this.field1682[var26] << 16) / this.field1453;
                if (var27 < arg5) {
                    int var28 = this.field1681[var26] + arg1;
                    int var29 = this.field1701[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1682[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1682[var26];
                }
            }
        }
        var15.method2077();
        return var15;
    }

    @ObfuscatedName("cn.g()V")
    public void method2073() {
        int var10002;
        if (this.field1714 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1718; var3++) {
                int var4 = this.field1714[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1709 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1709[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1718) {
                int var7 = this.field1714[var6];
                this.field1709[var7][var1[var7]++] = var6++;
            }
            this.field1714 = null;
        }
        if (this.field1708 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1710; var10++) {
            int var11 = this.field1708[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1725 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1725[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1710) {
            int var14 = this.field1708[var13];
            this.field1725[var14][var8[var14]++] = var13++;
        }
        this.field1708 = null;
    }

    @ObfuscatedName("cn.h()V")
    public void method2005() {
        for (int var1 = 0; var1 < this.field1718; var1++) {
            int var2 = this.field1681[var1];
            this.field1681[var1] = this.field1701[var1];
            this.field1701[var1] = -var2;
        }
        this.method2077();
    }

    @ObfuscatedName("cn.n()V")
    public void method2006() {
        for (int var1 = 0; var1 < this.field1718; var1++) {
            this.field1681[var1] = -this.field1681[var1];
            this.field1701[var1] = -this.field1701[var1];
        }
        this.method2077();
    }

    @ObfuscatedName("cn.v()V")
    public void method2007() {
        for (int var1 = 0; var1 < this.field1718; var1++) {
            int var2 = this.field1701[var1];
            this.field1701[var1] = this.field1681[var1];
            this.field1681[var1] = -var2;
        }
        this.method2077();
    }

    @ObfuscatedName("cn.p(I)V")
    public void method2008(int arg0) {
        int var2 = field1690[arg0];
        int var3 = field1684[arg0];
        for (int var4 = 0; var4 < this.field1718; var4++) {
            int var5 = this.field1701[var4] * var2 + this.field1681[var4] * var3 >> 16;
            this.field1701[var4] = this.field1701[var4] * var3 - this.field1681[var4] * var2 >> 16;
            this.field1681[var4] = var5;
        }
        this.method2077();
    }

    @ObfuscatedName("cn.i(III)V")
    public void method2009(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1718; var4++) {
            this.field1681[var4] += arg0;
            this.field1682[var4] += arg1;
            this.field1701[var4] += arg2;
        }
        this.method2077();
    }

    @ObfuscatedName("cn.t(SS)V")
    public void method2010(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1710; var3++) {
            if (this.field1692[var3] == arg0) {
                this.field1692[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cn.u(SS)V")
    public void method2011(short arg0, short arg1) {
        if (this.field1693 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1710; var3++) {
            if (this.field1693[var3] == arg0) {
                this.field1693[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cn.e()V")
    public void method2012() {
        for (int var1 = 0; var1 < this.field1718; var1++) {
            this.field1701[var1] = -this.field1701[var1];
        }
        for (int var2 = 0; var2 < this.field1710; var2++) {
            int var3 = this.field1688[var2];
            this.field1688[var2] = this.field1687[var2];
            this.field1687[var2] = var3;
        }
        this.method2077();
    }

    @ObfuscatedName("cn.m(III)V")
    public void method2000(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1718; var4++) {
            this.field1681[var4] = this.field1681[var4] * arg0 / 128;
            this.field1682[var4] = this.field1682[var4] * arg1 / 128;
            this.field1701[var4] = this.field1701[var4] * arg2 / 128;
        }
        this.method2077();
    }

    @ObfuscatedName("cn.s()V")
    public void method2014() {
        if (this.field1711 != null) {
            return;
        }
        this.field1711 = new class96[this.field1718];
        for (int var1 = 0; var1 < this.field1718; var1++) {
            this.field1711[var1] = new class96();
        }
        for (int var2 = 0; var2 < this.field1710; var2++) {
            int var3 = this.field1688[var2];
            int var4 = this.field1686[var2];
            int var5 = this.field1687[var2];
            int var6 = this.field1681[var4] - this.field1681[var3];
            int var7 = this.field1682[var4] - this.field1682[var3];
            int var8 = this.field1701[var4] - this.field1701[var3];
            int var9 = this.field1681[var5] - this.field1681[var3];
            int var10 = this.field1682[var5] - this.field1682[var3];
            int var11 = this.field1701[var5] - this.field1701[var3];
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
            if (this.field1726 == null) {
                var19 = 0;
            } else {
                var19 = this.field1726[var2];
            }
            if (var19 == 0) {
                class96 var20 = this.field1711[var3];
                var20.field1629 += var16;
                var20.field1622 += var17;
                var20.field1624 += var18;
                var20.field1625++;
                class96 var21 = this.field1711[var4];
                var21.field1629 += var16;
                var21.field1622 += var17;
                var21.field1624 += var18;
                var21.field1625++;
                class96 var22 = this.field1711[var5];
                var22.field1629 += var16;
                var22.field1622 += var17;
                var22.field1624 += var18;
                var22.field1625++;
            } else if (var19 == 1) {
                if (this.field1719 == null) {
                    this.field1719 = new class84[this.field1710];
                }
                class84 var23 = this.field1719[var2] = new class84();
                var23.field1449 = var16;
                var23.field1446 = var17;
                var23.field1443 = var18;
            }
        }
    }

    @ObfuscatedName("cn.x()V")
    public void method2077() {
        this.field1711 = null;
        this.field1713 = null;
        this.field1719 = null;
        this.field1716 = false;
    }

    @ObfuscatedName("cn.y()V")
    public void method2016() {
        if (this.field1716) {
            return;
        }
        this.field1453 = 0;
        this.field1717 = 0;
        this.field1723 = 999999;
        this.field1700 = -999999;
        this.field1683 = -99999;
        this.field1721 = 99999;
        for (int var1 = 0; var1 < this.field1718; var1++) {
            int var2 = this.field1681[var1];
            int var3 = this.field1682[var1];
            int var4 = this.field1701[var1];
            if (var2 < this.field1723) {
                this.field1723 = var2;
            }
            if (var2 > this.field1700) {
                this.field1700 = var2;
            }
            if (var4 < this.field1721) {
                this.field1721 = var4;
            }
            if (var4 > this.field1683) {
                this.field1683 = var4;
            }
            if (-var3 > this.field1453) {
                this.field1453 = -var3;
            }
            if (var3 > this.field1717) {
                this.field1717 = var3;
            }
        }
        this.field1716 = true;
    }

    @ObfuscatedName("cn.w(Lcn;Lcn;IIIZ)V")
    public static void method2017(class100 arg0, class100 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2016();
        arg0.method2014();
        arg1.method2016();
        arg1.method2014();
        field1707++;
        int var6 = 0;
        int[] var7 = arg1.field1681;
        int var8 = arg1.field1718;
        for (int var9 = 0; var9 < arg0.field1718; var9++) {
            class96 var10 = arg0.field1711[var9];
            if (var10.field1625 != 0) {
                int var11 = arg0.field1682[var9] - arg3;
                if (var11 <= arg1.field1717) {
                    int var12 = arg0.field1681[var9] - arg2;
                    if (var12 >= arg1.field1723 && var12 <= arg1.field1700) {
                        int var13 = arg0.field1701[var9] - arg4;
                        if (var13 >= arg1.field1721 && var13 <= arg1.field1683) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class96 var15 = arg1.field1711[var14];
                                if (var7[var14] == var12 && arg1.field1701[var14] == var13 && arg1.field1682[var14] == var11 && var15.field1625 != 0) {
                                    if (arg0.field1713 == null) {
                                        arg0.field1713 = new class96[arg0.field1718];
                                    }
                                    if (arg1.field1713 == null) {
                                        arg1.field1713 = new class96[var8];
                                    }
                                    class96 var16 = arg0.field1713[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1713[var9] = new class96(var10);
                                    }
                                    class96 var17 = arg1.field1713[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1713[var14] = new class96(var15);
                                    }
                                    var16.field1629 += var15.field1629;
                                    var16.field1622 += var15.field1622;
                                    var16.field1624 += var15.field1624;
                                    var16.field1625 += var15.field1625;
                                    var17.field1629 += var10.field1629;
                                    var17.field1622 += var10.field1622;
                                    var17.field1624 += var10.field1624;
                                    var17.field1625 += var10.field1625;
                                    var6++;
                                    field1722[var9] = field1707;
                                    field1712[var14] = field1707;
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
        for (int var18 = 0; var18 < arg0.field1710; var18++) {
            if (field1722[arg0.field1688[var18]] == field1707 && field1722[arg0.field1686[var18]] == field1707 && field1722[arg0.field1687[var18]] == field1707) {
                if (arg0.field1726 == null) {
                    arg0.field1726 = new byte[arg0.field1710];
                }
                arg0.field1726[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1710; var19++) {
            if (field1712[arg1.field1688[var19]] == field1707 && field1712[arg1.field1686[var19]] == field1707 && field1712[arg1.field1687[var19]] == field1707) {
                if (arg1.field1726 == null) {
                    arg1.field1726 = new byte[arg1.field1710];
                }
                arg1.field1726[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cn.o(IIIII)Ldb;")
    public final class105 method2019(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2014();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class105 var8 = new class105();
        var8.field1857 = new int[this.field1710];
        var8.field1806 = new int[this.field1710];
        var8.field1850 = new int[this.field1710];
        if (this.field1695 > 0 && this.field1691 != null) {
            int[] var9 = new int[this.field1695];
            for (int var10 = 0; var10 < this.field1710; var10++) {
                if (this.field1691[var10] != -1) {
                    var9[this.field1691[var10] & 0xFF]++;
                }
            }
            var8.field1825 = 0;
            for (int var11 = 0; var11 < this.field1695; var11++) {
                if (var9[var11] > 0 && this.field1696[var11] == 0) {
                    var8.field1825++;
                }
            }
            var8.field1814 = new int[var8.field1825];
            var8.field1815 = new int[var8.field1825];
            var8.field1816 = new int[var8.field1825];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1695; var13++) {
                if (var9[var13] > 0 && this.field1696[var13] == 0) {
                    var8.field1814[var12] = this.field1697[var13] & 0xFFFF;
                    var8.field1815[var12] = this.field1698[var13] & 0xFFFF;
                    var8.field1816[var12] = this.field1720[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1841 = new byte[this.field1710];
            for (int var14 = 0; var14 < this.field1710; var14++) {
                if (this.field1691[var14] == -1) {
                    var8.field1841[var14] = -1;
                } else {
                    var8.field1841[var14] = (byte) var9[this.field1691[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1710; var15++) {
            byte var16;
            if (this.field1726 == null) {
                var16 = 0;
            } else {
                var16 = this.field1726[var15];
            }
            byte var17;
            if (this.field1699 == null) {
                var17 = 0;
            } else {
                var17 = this.field1699[var15];
            }
            short var18;
            if (this.field1693 == null) {
                var18 = -1;
            } else {
                var18 = this.field1693[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1692[var15] & 0xFFFF;
                    class96 var20;
                    if (this.field1713 == null || this.field1713[this.field1688[var15]] == null) {
                        var20 = this.field1711[this.field1688[var15]];
                    } else {
                        var20 = this.field1713[this.field1688[var15]];
                    }
                    int var21 = (var20.field1624 * arg4 + var20.field1629 * arg2 + var20.field1622 * arg3) / (var20.field1625 * var7) + arg0;
                    var8.field1857[var15] = method2046(var19, var21);
                    class96 var22;
                    if (this.field1713 == null || this.field1713[this.field1686[var15]] == null) {
                        var22 = this.field1711[this.field1686[var15]];
                    } else {
                        var22 = this.field1713[this.field1686[var15]];
                    }
                    int var23 = (var22.field1624 * arg4 + var22.field1629 * arg2 + var22.field1622 * arg3) / (var22.field1625 * var7) + arg0;
                    var8.field1806[var15] = method2046(var19, var23);
                    class96 var24;
                    if (this.field1713 == null || this.field1713[this.field1687[var15]] == null) {
                        var24 = this.field1711[this.field1687[var15]];
                    } else {
                        var24 = this.field1713[this.field1687[var15]];
                    }
                    int var25 = (var24.field1624 * arg4 + var24.field1629 * arg2 + var24.field1622 * arg3) / (var24.field1625 * var7) + arg0;
                    var8.field1850[var15] = method2046(var19, var25);
                } else if (var16 == 1) {
                    class84 var26 = this.field1719[var15];
                    int var27 = (var26.field1443 * arg4 + var26.field1449 * arg2 + var26.field1446 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1857[var15] = method2046(this.field1692[var15] & 0xFFFF, var27);
                    var8.field1850[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1857[var15] = 128;
                    var8.field1850[var15] = -1;
                } else {
                    var8.field1850[var15] = -2;
                }
            } else if (var16 == 0) {
                class96 var28;
                if (this.field1713 == null || this.field1713[this.field1688[var15]] == null) {
                    var28 = this.field1711[this.field1688[var15]];
                } else {
                    var28 = this.field1713[this.field1688[var15]];
                }
                int var29 = (var28.field1624 * arg4 + var28.field1629 * arg2 + var28.field1622 * arg3) / (var28.field1625 * var7) + arg0;
                var8.field1857[var15] = method2020(var29);
                class96 var30;
                if (this.field1713 == null || this.field1713[this.field1686[var15]] == null) {
                    var30 = this.field1711[this.field1686[var15]];
                } else {
                    var30 = this.field1713[this.field1686[var15]];
                }
                int var31 = (var30.field1624 * arg4 + var30.field1629 * arg2 + var30.field1622 * arg3) / (var30.field1625 * var7) + arg0;
                var8.field1806[var15] = method2020(var31);
                class96 var32;
                if (this.field1713 == null || this.field1713[this.field1687[var15]] == null) {
                    var32 = this.field1711[this.field1687[var15]];
                } else {
                    var32 = this.field1713[this.field1687[var15]];
                }
                int var33 = (var32.field1624 * arg4 + var32.field1629 * arg2 + var32.field1622 * arg3) / (var32.field1625 * var7) + arg0;
                var8.field1850[var15] = method2020(var33);
            } else if (var16 == 1) {
                class84 var34 = this.field1719[var15];
                int var35 = (var34.field1443 * arg4 + var34.field1449 * arg2 + var34.field1446 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1857[var15] = method2020(var35);
                var8.field1850[var15] = -1;
            } else {
                var8.field1850[var15] = -2;
            }
        }
        this.method2073();
        var8.field1812 = this.field1718;
        var8.field1798 = this.field1681;
        var8.field1799 = this.field1682;
        var8.field1820 = this.field1701;
        var8.field1801 = this.field1710;
        var8.field1836 = this.field1688;
        var8.field1803 = this.field1686;
        var8.field1804 = this.field1687;
        var8.field1856 = this.field1689;
        var8.field1842 = this.field1699;
        var8.field1793 = this.field1694;
        var8.field1853 = this.field1709;
        var8.field1818 = this.field1725;
        var8.field1811 = this.field1693;
        return var8;
    }

    @ObfuscatedName("cn.aw(II)I")
    public static final int method2046(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cn.an(I)I")
    public static final int method2020(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
