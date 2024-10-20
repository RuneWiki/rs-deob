package deob;

@ObfuscatedName("cd")
public class class101 extends class86 {

    @ObfuscatedName("cd.j")
    public int field1707 = 0;

    @ObfuscatedName("cd.h")
    public int[] field1705;

    @ObfuscatedName("cd.m")
    public int[] field1671;

    @ObfuscatedName("cd.z")
    public int[] field1672;

    @ObfuscatedName("cd.x")
    public int field1715 = 0;

    @ObfuscatedName("cd.e")
    public int[] field1674;

    @ObfuscatedName("cd.i")
    public int[] field1681;

    @ObfuscatedName("cd.c")
    public int[] field1670;

    @ObfuscatedName("cd.n")
    public byte[] field1673;

    @ObfuscatedName("cd.l")
    public byte[] field1678;

    @ObfuscatedName("cd.u")
    public byte[] field1679;

    @ObfuscatedName("cd.r")
    public byte[] field1680;

    @ObfuscatedName("cd.a")
    public short[] field1682;

    @ObfuscatedName("cd.d")
    public short[] field1676;

    @ObfuscatedName("cd.p")
    public byte field1683 = 0;

    @ObfuscatedName("cd.q")
    public int field1684;

    @ObfuscatedName("cd.b")
    public byte[] field1690;

    @ObfuscatedName("cd.t")
    public short[] field1686;

    @ObfuscatedName("cd.y")
    public short[] field1687;

    @ObfuscatedName("cd.w")
    public short[] field1685;

    @ObfuscatedName("cd.g")
    public short[] field1677;

    @ObfuscatedName("cd.s")
    public short[] field1698;

    @ObfuscatedName("cd.k")
    public short[] field1691;

    @ObfuscatedName("cd.o")
    public short[] field1692;

    @ObfuscatedName("cd.v")
    public short[] field1675;

    @ObfuscatedName("cd.f")
    public short[] field1694;

    @ObfuscatedName("cd.au")
    public byte[] field1695;

    @ObfuscatedName("cd.aq")
    public int[] field1688;

    @ObfuscatedName("cd.ab")
    public int[] field1693;

    @ObfuscatedName("cd.am")
    public int[][] field1689;

    @ObfuscatedName("cd.an")
    public int[][] field1699;

    @ObfuscatedName("cd.aj")
    public class85[] field1700;

    @ObfuscatedName("cd.ay")
    public class97[] field1701;

    @ObfuscatedName("cd.ao")
    public class97[] field1702;

    @ObfuscatedName("cd.ag")
    public short field1703;

    @ObfuscatedName("cd.as")
    public short field1704;

    @ObfuscatedName("cd.az")
    public boolean field1669 = false;

    @ObfuscatedName("cd.av")
    public int field1706;

    @ObfuscatedName("cd.ax")
    public int field1697;

    @ObfuscatedName("cd.aa")
    public int field1708;

    @ObfuscatedName("cd.ah")
    public int field1709;

    @ObfuscatedName("cd.ai")
    public int field1710;

    @ObfuscatedName("cd.ae")
    public static int[] field1711 = new int[10000];

    @ObfuscatedName("cd.at")
    public static int[] field1712 = new int[10000];

    @ObfuscatedName("cd.ar")
    public static int field1713 = 0;

    @ObfuscatedName("cd.aw")
    public static int[] field1714 = class92.field1572;

    @ObfuscatedName("cd.ac")
    public static int[] field1696 = class92.field1573;

    public class101() {
    }

    @ObfuscatedName("cd.j(Lfy;II)Lcd;")
    public static class101 method2069(class168 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3011(arg1, arg2);
        return var3 == null ? null : new class101(var3);
    }

    public class101(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2070(arg0);
        } else {
            this.method2082(arg0);
        }
    }

    @ObfuscatedName("cd.h([B)V")
    public void method2070(byte[] arg0) {
        class120 var2 = new class120(arg0);
        class120 var3 = new class120(arg0);
        class120 var4 = new class120(arg0);
        class120 var5 = new class120(arg0);
        class120 var6 = new class120(arg0);
        class120 var7 = new class120(arg0);
        class120 var8 = new class120(arg0);
        var2.field1972 = arg0.length - 23;
        int var9 = var2.method2363();
        int var10 = var2.method2363();
        int var11 = var2.method2361();
        int var12 = var2.method2361();
        int var13 = var2.method2361();
        int var14 = var2.method2361();
        int var15 = var2.method2361();
        int var16 = var2.method2361();
        int var17 = var2.method2361();
        int var18 = var2.method2363();
        int var19 = var2.method2363();
        int var20 = var2.method2363();
        int var21 = var2.method2363();
        int var22 = var2.method2363();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1690 = new byte[var11];
            var2.field1972 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1690[var26] = var2.method2531();
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
        this.field1715 = var10;
        this.field1684 = var11;
        this.field1705 = new int[var9];
        this.field1671 = new int[var9];
        this.field1672 = new int[var9];
        this.field1674 = new int[var10];
        this.field1681 = new int[var10];
        this.field1670 = new int[var10];
        if (var17 == 1) {
            this.field1688 = new int[var9];
        }
        if (var12 == 1) {
            this.field1673 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1678 = new byte[var10];
        } else {
            this.field1683 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1679 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1693 = new int[var10];
        }
        if (var16 == 1) {
            this.field1676 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1680 = new byte[var10];
        }
        this.field1682 = new short[var10];
        if (var11 > 0) {
            this.field1686 = new short[var11];
            this.field1687 = new short[var11];
            this.field1685 = new short[var11];
            if (var24 > 0) {
                this.field1677 = new short[var24];
                this.field1698 = new short[var24];
                this.field1691 = new short[var24];
                this.field1692 = new short[var24];
                this.field1695 = new byte[var24];
                this.field1675 = new short[var24];
            }
            if (var25 > 0) {
                this.field1694 = new short[var25];
            }
        }
        var2.field1972 = var11;
        var3.field1972 = var44;
        var4.field1972 = var46;
        var5.field1972 = var48;
        var6.field1972 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2361();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2471();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2471();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2471();
            }
            this.field1705[var67] = var64 + var69;
            this.field1671[var67] = var65 + var70;
            this.field1672[var67] = var66 + var71;
            var64 = this.field1705[var67];
            var65 = this.field1671[var67];
            var66 = this.field1672[var67];
            if (var17 == 1) {
                this.field1688[var67] = var6.method2361();
            }
        }
        var2.field1972 = var42;
        var3.field1972 = var31;
        var4.field1972 = var34;
        var5.field1972 = var37;
        var6.field1972 = var35;
        var7.field1972 = var40;
        var8.field1972 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1682[var72] = (short) var2.method2363();
            if (var12 == 1) {
                this.field1673[var72] = var3.method2531();
            }
            if (var13 == 255) {
                this.field1678[var72] = var4.method2531();
            }
            if (var14 == 1) {
                this.field1679[var72] = var5.method2531();
            }
            if (var15 == 1) {
                this.field1693[var72] = var6.method2361();
            }
            if (var16 == 1) {
                this.field1676[var72] = (short) (var7.method2363() - 1);
            }
            if (this.field1680 != null && this.field1676[var72] != -1) {
                this.field1680[var72] = (byte) (var8.method2361() - 1);
            }
        }
        var2.field1972 = var33;
        var3.field1972 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2361();
            if (var78 == 1) {
                var73 = var2.method2471() + var76;
                var74 = var2.method2471() + var73;
                var75 = var2.method2471() + var74;
                var76 = var75;
                this.field1674[var77] = var73;
                this.field1681[var77] = var74;
                this.field1670[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2471() + var76;
                var76 = var75;
                this.field1674[var77] = var73;
                this.field1681[var77] = var74;
                this.field1670[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2471() + var76;
                var76 = var75;
                this.field1674[var77] = var73;
                this.field1681[var77] = var74;
                this.field1670[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2471() + var76;
                var76 = var75;
                this.field1674[var77] = var73;
                this.field1681[var77] = var81;
                this.field1670[var77] = var75;
            }
        }
        var2.field1972 = var50;
        var3.field1972 = var52;
        var4.field1972 = var54;
        var5.field1972 = var56;
        var6.field1972 = var58;
        var7.field1972 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1690[var82] & 0xFF;
            if (var83 == 0) {
                this.field1686[var82] = (short) var2.method2363();
                this.field1687[var82] = (short) var2.method2363();
                this.field1685[var82] = (short) var2.method2363();
            }
            if (var83 == 1) {
                this.field1686[var82] = (short) var3.method2363();
                this.field1687[var82] = (short) var3.method2363();
                this.field1685[var82] = (short) var3.method2363();
                this.field1677[var82] = (short) var4.method2363();
                this.field1698[var82] = (short) var4.method2363();
                this.field1691[var82] = (short) var4.method2363();
                this.field1692[var82] = (short) var5.method2363();
                this.field1695[var82] = var6.method2531();
                this.field1675[var82] = (short) var7.method2363();
            }
            if (var83 == 2) {
                this.field1686[var82] = (short) var3.method2363();
                this.field1687[var82] = (short) var3.method2363();
                this.field1685[var82] = (short) var3.method2363();
                this.field1677[var82] = (short) var4.method2363();
                this.field1698[var82] = (short) var4.method2363();
                this.field1691[var82] = (short) var4.method2363();
                this.field1692[var82] = (short) var5.method2363();
                this.field1695[var82] = var6.method2531();
                this.field1675[var82] = (short) var7.method2363();
                this.field1694[var82] = (short) var7.method2363();
            }
            if (var83 == 3) {
                this.field1686[var82] = (short) var3.method2363();
                this.field1687[var82] = (short) var3.method2363();
                this.field1685[var82] = (short) var3.method2363();
                this.field1677[var82] = (short) var4.method2363();
                this.field1698[var82] = (short) var4.method2363();
                this.field1691[var82] = (short) var4.method2363();
                this.field1692[var82] = (short) var5.method2363();
                this.field1695[var82] = var6.method2531();
                this.field1675[var82] = (short) var7.method2363();
            }
        }
        var2.field1972 = var62;
        int var84 = var2.method2361();
        if (var84 == 0) {
            return;
        }
        new class91();
        var2.method2363();
        var2.method2363();
        var2.method2363();
        var2.method2366();
    }

    @ObfuscatedName("cd.z([B)V")
    public void method2082(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class120 var4 = new class120(arg0);
        class120 var5 = new class120(arg0);
        class120 var6 = new class120(arg0);
        class120 var7 = new class120(arg0);
        class120 var8 = new class120(arg0);
        var4.field1972 = arg0.length - 18;
        int var9 = var4.method2363();
        int var10 = var4.method2363();
        int var11 = var4.method2361();
        int var12 = var4.method2361();
        int var13 = var4.method2361();
        int var14 = var4.method2361();
        int var15 = var4.method2361();
        int var16 = var4.method2361();
        int var17 = var4.method2363();
        int var18 = var4.method2363();
        int var19 = var4.method2363();
        int var20 = var4.method2363();
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
        this.field1715 = var10;
        this.field1684 = var11;
        this.field1705 = new int[var9];
        this.field1671 = new int[var9];
        this.field1672 = new int[var9];
        this.field1674 = new int[var10];
        this.field1681 = new int[var10];
        this.field1670 = new int[var10];
        if (var11 > 0) {
            this.field1690 = new byte[var11];
            this.field1686 = new short[var11];
            this.field1687 = new short[var11];
            this.field1685 = new short[var11];
        }
        if (var16 == 1) {
            this.field1688 = new int[var9];
        }
        if (var12 == 1) {
            this.field1673 = new byte[var10];
            this.field1680 = new byte[var10];
            this.field1676 = new short[var10];
        }
        if (var13 == 255) {
            this.field1678 = new byte[var10];
        } else {
            this.field1683 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1679 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1693 = new int[var10];
        }
        this.field1682 = new short[var10];
        var4.field1972 = var21;
        var5.field1972 = var36;
        var6.field1972 = var38;
        var7.field1972 = var40;
        var8.field1972 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2361();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2471();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2471();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2471();
            }
            this.field1705[var46] = var43 + var48;
            this.field1671[var46] = var44 + var49;
            this.field1672[var46] = var45 + var50;
            var43 = this.field1705[var46];
            var44 = this.field1671[var46];
            var45 = this.field1672[var46];
            if (var16 == 1) {
                this.field1688[var46] = var8.method2361();
            }
        }
        var4.field1972 = var32;
        var5.field1972 = var28;
        var6.field1972 = var26;
        var7.field1972 = var30;
        var8.field1972 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1682[var51] = (short) var4.method2363();
            if (var12 == 1) {
                int var52 = var5.method2361();
                if ((var52 & 0x1) == 1) {
                    this.field1673[var51] = 1;
                    var2 = true;
                } else {
                    this.field1673[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1680[var51] = (byte) (var52 >> 2);
                    this.field1676[var51] = this.field1682[var51];
                    this.field1682[var51] = 127;
                    if (this.field1676[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1680[var51] = -1;
                    this.field1676[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1678[var51] = var6.method2531();
            }
            if (var14 == 1) {
                this.field1679[var51] = var7.method2531();
            }
            if (var15 == 1) {
                this.field1693[var51] = var8.method2361();
            }
        }
        var4.field1972 = var25;
        var5.field1972 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2361();
            if (var58 == 1) {
                var53 = var4.method2471() + var56;
                var54 = var4.method2471() + var53;
                var55 = var4.method2471() + var54;
                var56 = var55;
                this.field1674[var57] = var53;
                this.field1681[var57] = var54;
                this.field1670[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2471() + var56;
                var56 = var55;
                this.field1674[var57] = var53;
                this.field1681[var57] = var54;
                this.field1670[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2471() + var56;
                var56 = var55;
                this.field1674[var57] = var53;
                this.field1681[var57] = var54;
                this.field1670[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2471() + var56;
                var56 = var55;
                this.field1674[var57] = var53;
                this.field1681[var57] = var61;
                this.field1670[var57] = var55;
            }
        }
        var4.field1972 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1690[var62] = 0;
            this.field1686[var62] = (short) var4.method2363();
            this.field1687[var62] = (short) var4.method2363();
            this.field1685[var62] = (short) var4.method2363();
        }
        if (this.field1680 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1680[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1686[var65] & 0xFFFF) == this.field1674[var64] && (this.field1687[var65] & 0xFFFF) == this.field1681[var64] && (this.field1685[var65] & 0xFFFF) == this.field1670[var64]) {
                        this.field1680[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1680 = null;
            }
        }
        if (!var3) {
            this.field1676 = null;
        }
        if (!var2) {
            this.field1673 = null;
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
        this.field1715 = 0;
        this.field1684 = 0;
        this.field1683 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class101 var10 = arg0[var9];
            if (var10 != null) {
                this.field1707 += var10.field1707;
                this.field1715 += var10.field1715;
                this.field1684 += var10.field1684;
                if (var10.field1678 == null) {
                    if (this.field1683 == -1) {
                        this.field1683 = var10.field1683;
                    }
                    if (this.field1683 != var10.field1683) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1673 != null;
                var5 |= var10.field1679 != null;
                var6 |= var10.field1693 != null;
                var7 |= var10.field1676 != null;
                var8 |= var10.field1680 != null;
            }
        }
        this.field1705 = new int[this.field1707];
        this.field1671 = new int[this.field1707];
        this.field1672 = new int[this.field1707];
        this.field1688 = new int[this.field1707];
        this.field1674 = new int[this.field1715];
        this.field1681 = new int[this.field1715];
        this.field1670 = new int[this.field1715];
        if (var3) {
            this.field1673 = new byte[this.field1715];
        }
        if (var4) {
            this.field1678 = new byte[this.field1715];
        }
        if (var5) {
            this.field1679 = new byte[this.field1715];
        }
        if (var6) {
            this.field1693 = new int[this.field1715];
        }
        if (var7) {
            this.field1676 = new short[this.field1715];
        }
        if (var8) {
            this.field1680 = new byte[this.field1715];
        }
        this.field1682 = new short[this.field1715];
        if (this.field1684 > 0) {
            this.field1690 = new byte[this.field1684];
            this.field1686 = new short[this.field1684];
            this.field1687 = new short[this.field1684];
            this.field1685 = new short[this.field1684];
            this.field1677 = new short[this.field1684];
            this.field1698 = new short[this.field1684];
            this.field1691 = new short[this.field1684];
            this.field1692 = new short[this.field1684];
            this.field1695 = new byte[this.field1684];
            this.field1675 = new short[this.field1684];
            this.field1694 = new short[this.field1684];
        }
        this.field1707 = 0;
        this.field1715 = 0;
        this.field1684 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class101 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1715; var13++) {
                    if (var3 && var12.field1673 != null) {
                        this.field1673[this.field1715] = var12.field1673[var13];
                    }
                    if (var4) {
                        if (var12.field1678 == null) {
                            this.field1678[this.field1715] = var12.field1683;
                        } else {
                            this.field1678[this.field1715] = var12.field1678[var13];
                        }
                    }
                    if (var5 && var12.field1679 != null) {
                        this.field1679[this.field1715] = var12.field1679[var13];
                    }
                    if (var6 && var12.field1693 != null) {
                        this.field1693[this.field1715] = var12.field1693[var13];
                    }
                    if (var7) {
                        if (var12.field1676 == null) {
                            this.field1676[this.field1715] = -1;
                        } else {
                            this.field1676[this.field1715] = var12.field1676[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1680 == null || var12.field1680[var13] == -1) {
                            this.field1680[this.field1715] = -1;
                        } else {
                            this.field1680[this.field1715] = (byte) (var12.field1680[var13] + this.field1684);
                        }
                    }
                    this.field1682[this.field1715] = var12.field1682[var13];
                    this.field1674[this.field1715] = this.method2087(var12, var12.field1674[var13]);
                    this.field1681[this.field1715] = this.method2087(var12, var12.field1681[var13]);
                    this.field1670[this.field1715] = this.method2087(var12, var12.field1670[var13]);
                    this.field1715++;
                }
                for (int var14 = 0; var14 < var12.field1684; var14++) {
                    byte var15 = this.field1690[this.field1684] = var12.field1690[var14];
                    if (var15 == 0) {
                        this.field1686[this.field1684] = (short) this.method2087(var12, var12.field1686[var14]);
                        this.field1687[this.field1684] = (short) this.method2087(var12, var12.field1687[var14]);
                        this.field1685[this.field1684] = (short) this.method2087(var12, var12.field1685[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1686[this.field1684] = var12.field1686[var14];
                        this.field1687[this.field1684] = var12.field1687[var14];
                        this.field1685[this.field1684] = var12.field1685[var14];
                        this.field1677[this.field1684] = var12.field1677[var14];
                        this.field1698[this.field1684] = var12.field1698[var14];
                        this.field1691[this.field1684] = var12.field1691[var14];
                        this.field1692[this.field1684] = var12.field1692[var14];
                        this.field1695[this.field1684] = var12.field1695[var14];
                        this.field1675[this.field1684] = var12.field1675[var14];
                    }
                    if (var15 == 2) {
                        this.field1694[this.field1684] = var12.field1694[var14];
                    }
                    this.field1684++;
                }
            }
        }
    }

    @ObfuscatedName("cd.x(Lcd;I)I")
    public final int method2087(class101 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1705[arg1];
        int var5 = arg0.field1671[arg1];
        int var6 = arg0.field1672[arg1];
        for (int var7 = 0; var7 < this.field1707; var7++) {
            if (this.field1705[var7] == var4 && this.field1671[var7] == var5 && this.field1672[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1705[this.field1707] = var4;
            this.field1671[this.field1707] = var5;
            this.field1672[this.field1707] = var6;
            if (arg0.field1688 != null) {
                this.field1688[this.field1707] = arg0.field1688[arg1];
            }
            var3 = this.field1707++;
        }
        return var3;
    }

    public class101(class101 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1707 = arg0.field1707;
        this.field1715 = arg0.field1715;
        this.field1684 = arg0.field1684;
        if (arg1) {
            this.field1705 = arg0.field1705;
            this.field1671 = arg0.field1671;
            this.field1672 = arg0.field1672;
        } else {
            this.field1705 = new int[this.field1707];
            this.field1671 = new int[this.field1707];
            this.field1672 = new int[this.field1707];
            for (int var6 = 0; var6 < this.field1707; var6++) {
                this.field1705[var6] = arg0.field1705[var6];
                this.field1671[var6] = arg0.field1671[var6];
                this.field1672[var6] = arg0.field1672[var6];
            }
        }
        if (arg2) {
            this.field1682 = arg0.field1682;
        } else {
            this.field1682 = new short[this.field1715];
            for (int var7 = 0; var7 < this.field1715; var7++) {
                this.field1682[var7] = arg0.field1682[var7];
            }
        }
        if (arg3 || arg0.field1676 == null) {
            this.field1676 = arg0.field1676;
        } else {
            this.field1676 = new short[this.field1715];
            for (int var8 = 0; var8 < this.field1715; var8++) {
                this.field1676[var8] = arg0.field1676[var8];
            }
        }
        if (arg4) {
            this.field1679 = arg0.field1679;
        } else {
            this.field1679 = new byte[this.field1715];
            if (arg0.field1679 == null) {
                for (int var9 = 0; var9 < this.field1715; var9++) {
                    this.field1679[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1715; var10++) {
                    this.field1679[var10] = arg0.field1679[var10];
                }
            }
        }
        this.field1674 = arg0.field1674;
        this.field1681 = arg0.field1681;
        this.field1670 = arg0.field1670;
        this.field1673 = arg0.field1673;
        this.field1678 = arg0.field1678;
        this.field1680 = arg0.field1680;
        this.field1683 = arg0.field1683;
        this.field1690 = arg0.field1690;
        this.field1686 = arg0.field1686;
        this.field1687 = arg0.field1687;
        this.field1685 = arg0.field1685;
        this.field1677 = arg0.field1677;
        this.field1698 = arg0.field1698;
        this.field1691 = arg0.field1691;
        this.field1692 = arg0.field1692;
        this.field1695 = arg0.field1695;
        this.field1675 = arg0.field1675;
        this.field1694 = arg0.field1694;
        this.field1688 = arg0.field1688;
        this.field1693 = arg0.field1693;
        this.field1689 = arg0.field1689;
        this.field1699 = arg0.field1699;
        this.field1701 = arg0.field1701;
        this.field1700 = arg0.field1700;
        this.field1702 = arg0.field1702;
        this.field1703 = arg0.field1703;
        this.field1704 = arg0.field1704;
    }

    @ObfuscatedName("cd.e()Lcd;")
    public class101 method2074() {
        class101 var1 = new class101();
        if (this.field1673 != null) {
            var1.field1673 = new byte[this.field1715];
            for (int var2 = 0; var2 < this.field1715; var2++) {
                var1.field1673[var2] = this.field1673[var2];
            }
        }
        var1.field1707 = this.field1707;
        var1.field1715 = this.field1715;
        var1.field1684 = this.field1684;
        var1.field1705 = this.field1705;
        var1.field1671 = this.field1671;
        var1.field1672 = this.field1672;
        var1.field1674 = this.field1674;
        var1.field1681 = this.field1681;
        var1.field1670 = this.field1670;
        var1.field1678 = this.field1678;
        var1.field1679 = this.field1679;
        var1.field1680 = this.field1680;
        var1.field1682 = this.field1682;
        var1.field1676 = this.field1676;
        var1.field1683 = this.field1683;
        var1.field1690 = this.field1690;
        var1.field1686 = this.field1686;
        var1.field1687 = this.field1687;
        var1.field1685 = this.field1685;
        var1.field1677 = this.field1677;
        var1.field1698 = this.field1698;
        var1.field1691 = this.field1691;
        var1.field1692 = this.field1692;
        var1.field1695 = this.field1695;
        var1.field1675 = this.field1675;
        var1.field1694 = this.field1694;
        var1.field1688 = this.field1688;
        var1.field1693 = this.field1693;
        var1.field1689 = this.field1689;
        var1.field1699 = this.field1699;
        var1.field1701 = this.field1701;
        var1.field1700 = this.field1700;
        var1.field1703 = this.field1703;
        var1.field1704 = this.field1704;
        return var1;
    }

    @ObfuscatedName("cd.i([[IIIIZI)Lcd;")
    public class101 method2083(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2075();
        int var7 = this.field1697 + arg1;
        int var8 = this.field1708 + arg1;
        int var9 = this.field1710 + arg3;
        int var10 = this.field1709 + arg3;
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
            var15.field1715 = this.field1715;
            var15.field1684 = this.field1684;
            var15.field1705 = this.field1705;
            var15.field1672 = this.field1672;
            var15.field1674 = this.field1674;
            var15.field1681 = this.field1681;
            var15.field1670 = this.field1670;
            var15.field1673 = this.field1673;
            var15.field1678 = this.field1678;
            var15.field1679 = this.field1679;
            var15.field1680 = this.field1680;
            var15.field1682 = this.field1682;
            var15.field1676 = this.field1676;
            var15.field1683 = this.field1683;
            var15.field1690 = this.field1690;
            var15.field1686 = this.field1686;
            var15.field1687 = this.field1687;
            var15.field1685 = this.field1685;
            var15.field1677 = this.field1677;
            var15.field1698 = this.field1698;
            var15.field1691 = this.field1691;
            var15.field1692 = this.field1692;
            var15.field1695 = this.field1695;
            var15.field1675 = this.field1675;
            var15.field1694 = this.field1694;
            var15.field1688 = this.field1688;
            var15.field1693 = this.field1693;
            var15.field1689 = this.field1689;
            var15.field1699 = this.field1699;
            var15.field1703 = this.field1703;
            var15.field1704 = this.field1704;
            var15.field1671 = new int[var15.field1707];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1707; var16++) {
                int var17 = this.field1705[var16] + arg1;
                int var18 = this.field1672[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1671[var16] = this.field1671[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1707; var26++) {
                int var27 = (-this.field1671[var26] << 16) / this.field1444;
                if (var27 < arg5) {
                    int var28 = this.field1705[var26] + arg1;
                    int var29 = this.field1672[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1671[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1671[var26];
                }
            }
        }
        var15.method2099();
        return var15;
    }

    @ObfuscatedName("cd.c()V")
    public void method2076() {
        int var10002;
        if (this.field1688 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1707; var3++) {
                int var4 = this.field1688[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1689 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1689[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1707) {
                int var7 = this.field1688[var6];
                this.field1689[var7][var1[var7]++] = var6++;
            }
            this.field1688 = null;
        }
        if (this.field1693 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1715; var10++) {
            int var11 = this.field1693[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1699 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1699[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1715) {
            int var14 = this.field1693[var13];
            this.field1699[var14][var8[var14]++] = var13++;
        }
        this.field1693 = null;
    }

    @ObfuscatedName("cd.n()V")
    public void method2107() {
        for (int var1 = 0; var1 < this.field1707; var1++) {
            int var2 = this.field1705[var1];
            this.field1705[var1] = this.field1672[var1];
            this.field1672[var1] = -var2;
        }
        this.method2099();
    }

    @ObfuscatedName("cd.l()V")
    public void method2078() {
        for (int var1 = 0; var1 < this.field1707; var1++) {
            this.field1705[var1] = -this.field1705[var1];
            this.field1672[var1] = -this.field1672[var1];
        }
        this.method2099();
    }

    @ObfuscatedName("cd.u()V")
    public void method2079() {
        for (int var1 = 0; var1 < this.field1707; var1++) {
            int var2 = this.field1672[var1];
            this.field1672[var1] = this.field1705[var1];
            this.field1705[var1] = -var2;
        }
        this.method2099();
    }

    @ObfuscatedName("cd.a(I)V")
    public void method2080(int arg0) {
        int var2 = field1714[arg0];
        int var3 = field1696[arg0];
        for (int var4 = 0; var4 < this.field1707; var4++) {
            int var5 = this.field1705[var4] * var3 + this.field1672[var4] * var2 >> 16;
            this.field1672[var4] = this.field1672[var4] * var3 - this.field1705[var4] * var2 >> 16;
            this.field1705[var4] = var5;
        }
        this.method2099();
    }

    @ObfuscatedName("cd.d(III)V")
    public void method2081(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1707; var4++) {
            this.field1705[var4] += arg0;
            this.field1671[var4] += arg1;
            this.field1672[var4] += arg2;
        }
        this.method2099();
    }

    @ObfuscatedName("cd.p(SS)V")
    public void method2073(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1715; var3++) {
            if (this.field1682[var3] == arg0) {
                this.field1682[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cd.q(SS)V")
    public void method2085(short arg0, short arg1) {
        if (this.field1676 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1715; var3++) {
            if (this.field1676[var3] == arg0) {
                this.field1676[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cd.b()V")
    public void method2084() {
        for (int var1 = 0; var1 < this.field1707; var1++) {
            this.field1672[var1] = -this.field1672[var1];
        }
        for (int var2 = 0; var2 < this.field1715; var2++) {
            int var3 = this.field1674[var2];
            this.field1674[var2] = this.field1670[var2];
            this.field1670[var2] = var3;
        }
        this.method2099();
    }

    @ObfuscatedName("cd.t(III)V")
    public void method2071(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1707; var4++) {
            this.field1705[var4] = this.field1705[var4] * arg0 / 128;
            this.field1671[var4] = this.field1671[var4] * arg1 / 128;
            this.field1672[var4] = this.field1672[var4] * arg2 / 128;
        }
        this.method2099();
    }

    @ObfuscatedName("cd.y()V")
    public void method2086() {
        if (this.field1701 != null) {
            return;
        }
        this.field1701 = new class97[this.field1707];
        for (int var1 = 0; var1 < this.field1707; var1++) {
            this.field1701[var1] = new class97();
        }
        for (int var2 = 0; var2 < this.field1715; var2++) {
            int var3 = this.field1674[var2];
            int var4 = this.field1681[var2];
            int var5 = this.field1670[var2];
            int var6 = this.field1705[var4] - this.field1705[var3];
            int var7 = this.field1671[var4] - this.field1671[var3];
            int var8 = this.field1672[var4] - this.field1672[var3];
            int var9 = this.field1705[var5] - this.field1705[var3];
            int var10 = this.field1671[var5] - this.field1671[var3];
            int var11 = this.field1672[var5] - this.field1672[var3];
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
            if (this.field1673 == null) {
                var19 = 0;
            } else {
                var19 = this.field1673[var2];
            }
            if (var19 == 0) {
                class97 var20 = this.field1701[var3];
                var20.field1613 += var16;
                var20.field1609 += var17;
                var20.field1610 += var18;
                var20.field1611++;
                class97 var21 = this.field1701[var4];
                var21.field1613 += var16;
                var21.field1609 += var17;
                var21.field1610 += var18;
                var21.field1611++;
                class97 var22 = this.field1701[var5];
                var22.field1613 += var16;
                var22.field1609 += var17;
                var22.field1610 += var18;
                var22.field1611++;
            } else if (var19 == 1) {
                if (this.field1700 == null) {
                    this.field1700 = new class85[this.field1715];
                }
                class85 var23 = this.field1700[var2] = new class85();
                var23.field1443 = var16;
                var23.field1441 = var17;
                var23.field1440 = var18;
            }
        }
    }

    @ObfuscatedName("cd.w()V")
    public void method2099() {
        this.field1701 = null;
        this.field1702 = null;
        this.field1700 = null;
        this.field1669 = false;
    }

    @ObfuscatedName("cd.g()V")
    public void method2075() {
        if (this.field1669) {
            return;
        }
        this.field1444 = 0;
        this.field1706 = 0;
        this.field1697 = 999999;
        this.field1708 = -999999;
        this.field1709 = -99999;
        this.field1710 = 99999;
        for (int var1 = 0; var1 < this.field1707; var1++) {
            int var2 = this.field1705[var1];
            int var3 = this.field1671[var1];
            int var4 = this.field1672[var1];
            if (var2 < this.field1697) {
                this.field1697 = var2;
            }
            if (var2 > this.field1708) {
                this.field1708 = var2;
            }
            if (var4 < this.field1710) {
                this.field1710 = var4;
            }
            if (var4 > this.field1709) {
                this.field1709 = var4;
            }
            if (-var3 > this.field1444) {
                this.field1444 = -var3;
            }
            if (var3 > this.field1706) {
                this.field1706 = var3;
            }
        }
        this.field1669 = true;
    }

    @ObfuscatedName("cd.s(Lcd;Lcd;IIIZ)V")
    public static void method2134(class101 arg0, class101 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2075();
        arg0.method2086();
        arg1.method2075();
        arg1.method2086();
        field1713++;
        int var6 = 0;
        int[] var7 = arg1.field1705;
        int var8 = arg1.field1707;
        for (int var9 = 0; var9 < arg0.field1707; var9++) {
            class97 var10 = arg0.field1701[var9];
            if (var10.field1611 != 0) {
                int var11 = arg0.field1671[var9] - arg3;
                if (var11 <= arg1.field1706) {
                    int var12 = arg0.field1705[var9] - arg2;
                    if (var12 >= arg1.field1697 && var12 <= arg1.field1708) {
                        int var13 = arg0.field1672[var9] - arg4;
                        if (var13 >= arg1.field1710 && var13 <= arg1.field1709) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class97 var15 = arg1.field1701[var14];
                                if (var7[var14] == var12 && arg1.field1672[var14] == var13 && arg1.field1671[var14] == var11 && var15.field1611 != 0) {
                                    if (arg0.field1702 == null) {
                                        arg0.field1702 = new class97[arg0.field1707];
                                    }
                                    if (arg1.field1702 == null) {
                                        arg1.field1702 = new class97[var8];
                                    }
                                    class97 var16 = arg0.field1702[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1702[var9] = new class97(var10);
                                    }
                                    class97 var17 = arg1.field1702[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1702[var14] = new class97(var15);
                                    }
                                    var16.field1613 += var15.field1613;
                                    var16.field1609 += var15.field1609;
                                    var16.field1610 += var15.field1610;
                                    var16.field1611 += var15.field1611;
                                    var17.field1613 += var10.field1613;
                                    var17.field1609 += var10.field1609;
                                    var17.field1610 += var10.field1610;
                                    var17.field1611 += var10.field1611;
                                    var6++;
                                    field1711[var9] = field1713;
                                    field1712[var14] = field1713;
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
        for (int var18 = 0; var18 < arg0.field1715; var18++) {
            if (field1711[arg0.field1674[var18]] == field1713 && field1711[arg0.field1681[var18]] == field1713 && field1711[arg0.field1670[var18]] == field1713) {
                if (arg0.field1673 == null) {
                    arg0.field1673 = new byte[arg0.field1715];
                }
                arg0.field1673[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1715; var19++) {
            if (field1712[arg1.field1674[var19]] == field1713 && field1712[arg1.field1681[var19]] == field1713 && field1712[arg1.field1670[var19]] == field1713) {
                if (arg1.field1673 == null) {
                    arg1.field1673 = new byte[arg1.field1715];
                }
                arg1.field1673[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cd.k(IIIII)Ldf;")
    public final class106 method2089(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2086();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class106 var8 = new class106();
        var8.field1796 = new int[this.field1715];
        var8.field1784 = new int[this.field1715];
        var8.field1798 = new int[this.field1715];
        if (this.field1684 > 0 && this.field1680 != null) {
            int[] var9 = new int[this.field1684];
            for (int var10 = 0; var10 < this.field1715; var10++) {
                if (this.field1680[var10] != -1) {
                    var9[this.field1680[var10] & 0xFF]++;
                }
            }
            var8.field1804 = 0;
            for (int var11 = 0; var11 < this.field1684; var11++) {
                if (var9[var11] > 0 && this.field1690[var11] == 0) {
                    var8.field1804++;
                }
            }
            var8.field1787 = new int[var8.field1804];
            var8.field1806 = new int[var8.field1804];
            var8.field1807 = new int[var8.field1804];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1684; var13++) {
                if (var9[var13] > 0 && this.field1690[var13] == 0) {
                    var8.field1787[var12] = this.field1686[var13] & 0xFFFF;
                    var8.field1806[var12] = this.field1687[var13] & 0xFFFF;
                    var8.field1807[var12] = this.field1685[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1801 = new byte[this.field1715];
            for (int var14 = 0; var14 < this.field1715; var14++) {
                if (this.field1680[var14] == -1) {
                    var8.field1801[var14] = -1;
                } else {
                    var8.field1801[var14] = (byte) var9[this.field1680[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1715; var15++) {
            byte var16;
            if (this.field1673 == null) {
                var16 = 0;
            } else {
                var16 = this.field1673[var15];
            }
            byte var17;
            if (this.field1679 == null) {
                var17 = 0;
            } else {
                var17 = this.field1679[var15];
            }
            short var18;
            if (this.field1676 == null) {
                var18 = -1;
            } else {
                var18 = this.field1676[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1682[var15] & 0xFFFF;
                    class97 var20;
                    if (this.field1702 == null || this.field1702[this.field1674[var15]] == null) {
                        var20 = this.field1701[this.field1674[var15]];
                    } else {
                        var20 = this.field1702[this.field1674[var15]];
                    }
                    int var21 = (var20.field1610 * arg4 + var20.field1613 * arg2 + var20.field1609 * arg3) / (var20.field1611 * var7) + arg0;
                    var8.field1796[var15] = method2101(var19, var21);
                    class97 var22;
                    if (this.field1702 == null || this.field1702[this.field1681[var15]] == null) {
                        var22 = this.field1701[this.field1681[var15]];
                    } else {
                        var22 = this.field1702[this.field1681[var15]];
                    }
                    int var23 = (var22.field1610 * arg4 + var22.field1613 * arg2 + var22.field1609 * arg3) / (var22.field1611 * var7) + arg0;
                    var8.field1784[var15] = method2101(var19, var23);
                    class97 var24;
                    if (this.field1702 == null || this.field1702[this.field1670[var15]] == null) {
                        var24 = this.field1701[this.field1670[var15]];
                    } else {
                        var24 = this.field1702[this.field1670[var15]];
                    }
                    int var25 = (var24.field1610 * arg4 + var24.field1613 * arg2 + var24.field1609 * arg3) / (var24.field1611 * var7) + arg0;
                    var8.field1798[var15] = method2101(var19, var25);
                } else if (var16 == 1) {
                    class85 var26 = this.field1700[var15];
                    int var27 = (var26.field1440 * arg4 + var26.field1443 * arg2 + var26.field1441 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1796[var15] = method2101(this.field1682[var15] & 0xFFFF, var27);
                    var8.field1798[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1796[var15] = 128;
                    var8.field1798[var15] = -1;
                } else {
                    var8.field1798[var15] = -2;
                }
            } else if (var16 == 0) {
                class97 var28;
                if (this.field1702 == null || this.field1702[this.field1674[var15]] == null) {
                    var28 = this.field1701[this.field1674[var15]];
                } else {
                    var28 = this.field1702[this.field1674[var15]];
                }
                int var29 = (var28.field1610 * arg4 + var28.field1613 * arg2 + var28.field1609 * arg3) / (var28.field1611 * var7) + arg0;
                var8.field1796[var15] = method2098(var29);
                class97 var30;
                if (this.field1702 == null || this.field1702[this.field1681[var15]] == null) {
                    var30 = this.field1701[this.field1681[var15]];
                } else {
                    var30 = this.field1702[this.field1681[var15]];
                }
                int var31 = (var30.field1610 * arg4 + var30.field1613 * arg2 + var30.field1609 * arg3) / (var30.field1611 * var7) + arg0;
                var8.field1784[var15] = method2098(var31);
                class97 var32;
                if (this.field1702 == null || this.field1702[this.field1670[var15]] == null) {
                    var32 = this.field1701[this.field1670[var15]];
                } else {
                    var32 = this.field1702[this.field1670[var15]];
                }
                int var33 = (var32.field1610 * arg4 + var32.field1613 * arg2 + var32.field1609 * arg3) / (var32.field1611 * var7) + arg0;
                var8.field1798[var15] = method2098(var33);
            } else if (var16 == 1) {
                class85 var34 = this.field1700[var15];
                int var35 = (var34.field1440 * arg4 + var34.field1443 * arg2 + var34.field1441 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1796[var15] = method2098(var35);
                var8.field1798[var15] = -1;
            } else {
                var8.field1798[var15] = -2;
            }
        }
        this.method2076();
        var8.field1788 = this.field1707;
        var8.field1789 = this.field1705;
        var8.field1790 = this.field1671;
        var8.field1845 = this.field1672;
        var8.field1797 = this.field1715;
        var8.field1793 = this.field1674;
        var8.field1794 = this.field1681;
        var8.field1832 = this.field1670;
        var8.field1827 = this.field1678;
        var8.field1800 = this.field1679;
        var8.field1803 = this.field1683;
        var8.field1808 = this.field1689;
        var8.field1846 = this.field1699;
        var8.field1802 = this.field1676;
        return var8;
    }

    @ObfuscatedName("cd.o(II)I")
    public static final int method2101(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cd.v(I)I")
    public static final int method2098(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
