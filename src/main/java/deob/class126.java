package deob;

@ObfuscatedName("dg")
public class class126 extends class140 {

    @ObfuscatedName("dg.o")
    public int field1749 = 0;

    @ObfuscatedName("dg.k")
    public int[] field1742;

    @ObfuscatedName("dg.t")
    public int[] field1726;

    @ObfuscatedName("dg.d")
    public int[] field1770;

    @ObfuscatedName("dg.h")
    public int field1735 = 0;

    @ObfuscatedName("dg.m")
    public int[] field1729;

    @ObfuscatedName("dg.z")
    public int[] field1730;

    @ObfuscatedName("dg.i")
    public int[] field1731;

    @ObfuscatedName("dg.u")
    public byte[] field1728;

    @ObfuscatedName("dg.x")
    public byte[] field1733;

    @ObfuscatedName("dg.y")
    public byte[] field1734;

    @ObfuscatedName("dg.a")
    public byte[] field1745;

    @ObfuscatedName("dg.w")
    public short[] field1736;

    @ObfuscatedName("dg.n")
    public short[] field1737;

    @ObfuscatedName("dg.l")
    public byte field1738 = 0;

    @ObfuscatedName("dg.s")
    public int field1739;

    @ObfuscatedName("dg.v")
    public byte[] field1740;

    @ObfuscatedName("dg.q")
    public short[] field1755;

    @ObfuscatedName("dg.r")
    public short[] field1724;

    @ObfuscatedName("dg.j")
    public short[] field1768;

    @ObfuscatedName("dg.b")
    public short[] field1744;

    @ObfuscatedName("dg.g")
    public short[] field1746;

    @ObfuscatedName("dg.f")
    public short[] field1741;

    @ObfuscatedName("dg.p")
    public short[] field1747;

    @ObfuscatedName("dg.e")
    public short[] field1748;

    @ObfuscatedName("dg.c")
    public short[] field1767;

    @ObfuscatedName("dg.ab")
    public byte[] field1750;

    @ObfuscatedName("dg.ap")
    public int[] field1751;

    @ObfuscatedName("dg.ag")
    public int[] field1752;

    @ObfuscatedName("dg.at")
    public int[][] field1753;

    @ObfuscatedName("dg.ac")
    public int[][] field1759;

    @ObfuscatedName("dg.al")
    public class142[] field1727;

    @ObfuscatedName("dg.ah")
    public class134[] field1756;

    @ObfuscatedName("dg.af")
    public class134[] field1757;

    @ObfuscatedName("dg.aq")
    public short field1732;

    @ObfuscatedName("dg.ai")
    public short field1743;

    @ObfuscatedName("dg.az")
    public boolean field1760 = false;

    @ObfuscatedName("dg.aa")
    public int field1761;

    @ObfuscatedName("dg.av")
    public int field1762;

    @ObfuscatedName("dg.am")
    public int field1763;

    @ObfuscatedName("dg.ao")
    public int field1764;

    @ObfuscatedName("dg.ax")
    public int field1765;

    @ObfuscatedName("dg.ad")
    public static int[] field1766 = new int[10000];

    @ObfuscatedName("dg.au")
    public static int[] field1754 = new int[10000];

    @ObfuscatedName("dg.ar")
    public static int field1725 = 0;

    @ObfuscatedName("dg.an")
    public static int[] field1769 = class135.field1963;

    @ObfuscatedName("dg.ae")
    public static int[] field1758 = class135.field1964;

    public class126() {
    }

    @ObfuscatedName("dg.o(Ljf;II)Ldg;")
    public static class126 method2418(class262 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4241(arg1, arg2);
        return var3 == null ? null : new class126(var3);
    }

    public class126(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2401(arg0);
        } else {
            this.method2375(arg0);
        }
    }

    @ObfuscatedName("dg.k([B)V")
    public void method2401(byte[] arg0) {
        class195 var2 = new class195(arg0);
        class195 var3 = new class195(arg0);
        class195 var4 = new class195(arg0);
        class195 var5 = new class195(arg0);
        class195 var6 = new class195(arg0);
        class195 var7 = new class195(arg0);
        class195 var8 = new class195(arg0);
        var2.field2575 = arg0.length - 23;
        int var9 = var2.method3207();
        int var10 = var2.method3207();
        int var11 = var2.method3205();
        int var12 = var2.method3205();
        int var13 = var2.method3205();
        int var14 = var2.method3205();
        int var15 = var2.method3205();
        int var16 = var2.method3205();
        int var17 = var2.method3205();
        int var18 = var2.method3207();
        int var19 = var2.method3207();
        int var20 = var2.method3207();
        int var21 = var2.method3207();
        int var22 = var2.method3207();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1740 = new byte[var11];
            var2.field2575 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1740[var26] = var2.method3210();
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
        this.field1749 = var9;
        this.field1735 = var10;
        this.field1739 = var11;
        this.field1742 = new int[var9];
        this.field1726 = new int[var9];
        this.field1770 = new int[var9];
        this.field1729 = new int[var10];
        this.field1730 = new int[var10];
        this.field1731 = new int[var10];
        if (var17 == 1) {
            this.field1751 = new int[var9];
        }
        if (var12 == 1) {
            this.field1728 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1733 = new byte[var10];
        } else {
            this.field1738 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1734 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1752 = new int[var10];
        }
        if (var16 == 1) {
            this.field1737 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1745 = new byte[var10];
        }
        this.field1736 = new short[var10];
        if (var11 > 0) {
            this.field1755 = new short[var11];
            this.field1724 = new short[var11];
            this.field1768 = new short[var11];
            if (var24 > 0) {
                this.field1744 = new short[var24];
                this.field1746 = new short[var24];
                this.field1741 = new short[var24];
                this.field1747 = new short[var24];
                this.field1750 = new byte[var24];
                this.field1748 = new short[var24];
            }
            if (var25 > 0) {
                this.field1767 = new short[var25];
            }
        }
        var2.field2575 = var11;
        var3.field2575 = var44;
        var4.field2575 = var46;
        var5.field2575 = var48;
        var6.field2575 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method3205();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method3218();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method3218();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method3218();
            }
            this.field1742[var67] = var64 + var69;
            this.field1726[var67] = var65 + var70;
            this.field1770[var67] = var66 + var71;
            var64 = this.field1742[var67];
            var65 = this.field1726[var67];
            var66 = this.field1770[var67];
            if (var17 == 1) {
                this.field1751[var67] = var6.method3205();
            }
        }
        var2.field2575 = var42;
        var3.field2575 = var31;
        var4.field2575 = var34;
        var5.field2575 = var37;
        var6.field2575 = var35;
        var7.field2575 = var40;
        var8.field2575 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1736[var72] = (short) var2.method3207();
            if (var12 == 1) {
                this.field1728[var72] = var3.method3210();
            }
            if (var13 == 255) {
                this.field1733[var72] = var4.method3210();
            }
            if (var14 == 1) {
                this.field1734[var72] = var5.method3210();
            }
            if (var15 == 1) {
                this.field1752[var72] = var6.method3205();
            }
            if (var16 == 1) {
                this.field1737[var72] = (short) (var7.method3207() - 1);
            }
            if (this.field1745 != null && this.field1737[var72] != -1) {
                this.field1745[var72] = (byte) (var8.method3205() - 1);
            }
        }
        var2.field2575 = var33;
        var3.field2575 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method3205();
            if (var78 == 1) {
                var73 = var2.method3218() + var76;
                var74 = var2.method3218() + var73;
                var75 = var2.method3218() + var74;
                var76 = var75;
                this.field1729[var77] = var73;
                this.field1730[var77] = var74;
                this.field1731[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method3218() + var76;
                var76 = var75;
                this.field1729[var77] = var73;
                this.field1730[var77] = var74;
                this.field1731[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method3218() + var76;
                var76 = var75;
                this.field1729[var77] = var73;
                this.field1730[var77] = var74;
                this.field1731[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method3218() + var76;
                var76 = var75;
                this.field1729[var77] = var73;
                this.field1730[var77] = var81;
                this.field1731[var77] = var75;
            }
        }
        var2.field2575 = var50;
        var3.field2575 = var52;
        var4.field2575 = var54;
        var5.field2575 = var56;
        var6.field2575 = var58;
        var7.field2575 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1740[var82] & 0xFF;
            if (var83 == 0) {
                this.field1755[var82] = (short) var2.method3207();
                this.field1724[var82] = (short) var2.method3207();
                this.field1768[var82] = (short) var2.method3207();
            }
            if (var83 == 1) {
                this.field1755[var82] = (short) var3.method3207();
                this.field1724[var82] = (short) var3.method3207();
                this.field1768[var82] = (short) var3.method3207();
                this.field1744[var82] = (short) var4.method3207();
                this.field1746[var82] = (short) var4.method3207();
                this.field1741[var82] = (short) var4.method3207();
                this.field1747[var82] = (short) var5.method3207();
                this.field1750[var82] = var6.method3210();
                this.field1748[var82] = (short) var7.method3207();
            }
            if (var83 == 2) {
                this.field1755[var82] = (short) var3.method3207();
                this.field1724[var82] = (short) var3.method3207();
                this.field1768[var82] = (short) var3.method3207();
                this.field1744[var82] = (short) var4.method3207();
                this.field1746[var82] = (short) var4.method3207();
                this.field1741[var82] = (short) var4.method3207();
                this.field1747[var82] = (short) var5.method3207();
                this.field1750[var82] = var6.method3210();
                this.field1748[var82] = (short) var7.method3207();
                this.field1767[var82] = (short) var7.method3207();
            }
            if (var83 == 3) {
                this.field1755[var82] = (short) var3.method3207();
                this.field1724[var82] = (short) var3.method3207();
                this.field1768[var82] = (short) var3.method3207();
                this.field1744[var82] = (short) var4.method3207();
                this.field1746[var82] = (short) var4.method3207();
                this.field1741[var82] = (short) var4.method3207();
                this.field1747[var82] = (short) var5.method3207();
                this.field1750[var82] = var6.method3210();
                this.field1748[var82] = (short) var7.method3207();
            }
        }
        var2.field2575 = var62;
        int var84 = var2.method3205();
        if (var84 == 0) {
            return;
        }
        new class139();
        var2.method3207();
        var2.method3207();
        var2.method3207();
        var2.method3254();
    }

    @ObfuscatedName("dg.t([B)V")
    public void method2375(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class195 var4 = new class195(arg0);
        class195 var5 = new class195(arg0);
        class195 var6 = new class195(arg0);
        class195 var7 = new class195(arg0);
        class195 var8 = new class195(arg0);
        var4.field2575 = arg0.length - 18;
        int var9 = var4.method3207();
        int var10 = var4.method3207();
        int var11 = var4.method3205();
        int var12 = var4.method3205();
        int var13 = var4.method3205();
        int var14 = var4.method3205();
        int var15 = var4.method3205();
        int var16 = var4.method3205();
        int var17 = var4.method3207();
        int var18 = var4.method3207();
        int var19 = var4.method3207();
        int var20 = var4.method3207();
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
        this.field1749 = var9;
        this.field1735 = var10;
        this.field1739 = var11;
        this.field1742 = new int[var9];
        this.field1726 = new int[var9];
        this.field1770 = new int[var9];
        this.field1729 = new int[var10];
        this.field1730 = new int[var10];
        this.field1731 = new int[var10];
        if (var11 > 0) {
            this.field1740 = new byte[var11];
            this.field1755 = new short[var11];
            this.field1724 = new short[var11];
            this.field1768 = new short[var11];
        }
        if (var16 == 1) {
            this.field1751 = new int[var9];
        }
        if (var12 == 1) {
            this.field1728 = new byte[var10];
            this.field1745 = new byte[var10];
            this.field1737 = new short[var10];
        }
        if (var13 == 255) {
            this.field1733 = new byte[var10];
        } else {
            this.field1738 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1734 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1752 = new int[var10];
        }
        this.field1736 = new short[var10];
        var4.field2575 = var21;
        var5.field2575 = var36;
        var6.field2575 = var38;
        var7.field2575 = var40;
        var8.field2575 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method3205();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method3218();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method3218();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method3218();
            }
            this.field1742[var46] = var43 + var48;
            this.field1726[var46] = var44 + var49;
            this.field1770[var46] = var45 + var50;
            var43 = this.field1742[var46];
            var44 = this.field1726[var46];
            var45 = this.field1770[var46];
            if (var16 == 1) {
                this.field1751[var46] = var8.method3205();
            }
        }
        var4.field2575 = var32;
        var5.field2575 = var28;
        var6.field2575 = var26;
        var7.field2575 = var30;
        var8.field2575 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1736[var51] = (short) var4.method3207();
            if (var12 == 1) {
                int var52 = var5.method3205();
                if ((var52 & 0x1) == 1) {
                    this.field1728[var51] = 1;
                    var2 = true;
                } else {
                    this.field1728[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1745[var51] = (byte) (var52 >> 2);
                    this.field1737[var51] = this.field1736[var51];
                    this.field1736[var51] = 127;
                    if (this.field1737[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1745[var51] = -1;
                    this.field1737[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1733[var51] = var6.method3210();
            }
            if (var14 == 1) {
                this.field1734[var51] = var7.method3210();
            }
            if (var15 == 1) {
                this.field1752[var51] = var8.method3205();
            }
        }
        var4.field2575 = var25;
        var5.field2575 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method3205();
            if (var58 == 1) {
                var53 = var4.method3218() + var56;
                var54 = var4.method3218() + var53;
                var55 = var4.method3218() + var54;
                var56 = var55;
                this.field1729[var57] = var53;
                this.field1730[var57] = var54;
                this.field1731[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method3218() + var56;
                var56 = var55;
                this.field1729[var57] = var53;
                this.field1730[var57] = var54;
                this.field1731[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method3218() + var56;
                var56 = var55;
                this.field1729[var57] = var53;
                this.field1730[var57] = var54;
                this.field1731[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method3218() + var56;
                var56 = var55;
                this.field1729[var57] = var53;
                this.field1730[var57] = var61;
                this.field1731[var57] = var55;
            }
        }
        var4.field2575 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1740[var62] = 0;
            this.field1755[var62] = (short) var4.method3207();
            this.field1724[var62] = (short) var4.method3207();
            this.field1768[var62] = (short) var4.method3207();
        }
        if (this.field1745 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1745[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1755[var65] & 0xFFFF) == this.field1729[var64] && (this.field1724[var65] & 0xFFFF) == this.field1730[var64] && (this.field1768[var65] & 0xFFFF) == this.field1731[var64]) {
                        this.field1745[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1745 = null;
            }
        }
        if (!var3) {
            this.field1737 = null;
        }
        if (!var2) {
            this.field1728 = null;
        }
    }

    public class126(class126[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1749 = 0;
        this.field1735 = 0;
        this.field1739 = 0;
        this.field1738 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class126 var10 = arg0[var9];
            if (var10 != null) {
                this.field1749 += var10.field1749;
                this.field1735 += var10.field1735;
                this.field1739 += var10.field1739;
                if (var10.field1733 == null) {
                    if (this.field1738 == -1) {
                        this.field1738 = var10.field1738;
                    }
                    if (this.field1738 != var10.field1738) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1728 != null;
                var5 |= var10.field1734 != null;
                var6 |= var10.field1752 != null;
                var7 |= var10.field1737 != null;
                var8 |= var10.field1745 != null;
            }
        }
        this.field1742 = new int[this.field1749];
        this.field1726 = new int[this.field1749];
        this.field1770 = new int[this.field1749];
        this.field1751 = new int[this.field1749];
        this.field1729 = new int[this.field1735];
        this.field1730 = new int[this.field1735];
        this.field1731 = new int[this.field1735];
        if (var3) {
            this.field1728 = new byte[this.field1735];
        }
        if (var4) {
            this.field1733 = new byte[this.field1735];
        }
        if (var5) {
            this.field1734 = new byte[this.field1735];
        }
        if (var6) {
            this.field1752 = new int[this.field1735];
        }
        if (var7) {
            this.field1737 = new short[this.field1735];
        }
        if (var8) {
            this.field1745 = new byte[this.field1735];
        }
        this.field1736 = new short[this.field1735];
        if (this.field1739 > 0) {
            this.field1740 = new byte[this.field1739];
            this.field1755 = new short[this.field1739];
            this.field1724 = new short[this.field1739];
            this.field1768 = new short[this.field1739];
            this.field1744 = new short[this.field1739];
            this.field1746 = new short[this.field1739];
            this.field1741 = new short[this.field1739];
            this.field1747 = new short[this.field1739];
            this.field1750 = new byte[this.field1739];
            this.field1748 = new short[this.field1739];
            this.field1767 = new short[this.field1739];
        }
        this.field1749 = 0;
        this.field1735 = 0;
        this.field1739 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class126 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1735; var13++) {
                    if (var3 && var12.field1728 != null) {
                        this.field1728[this.field1735] = var12.field1728[var13];
                    }
                    if (var4) {
                        if (var12.field1733 == null) {
                            this.field1733[this.field1735] = var12.field1738;
                        } else {
                            this.field1733[this.field1735] = var12.field1733[var13];
                        }
                    }
                    if (var5 && var12.field1734 != null) {
                        this.field1734[this.field1735] = var12.field1734[var13];
                    }
                    if (var6 && var12.field1752 != null) {
                        this.field1752[this.field1735] = var12.field1752[var13];
                    }
                    if (var7) {
                        if (var12.field1737 == null) {
                            this.field1737[this.field1735] = -1;
                        } else {
                            this.field1737[this.field1735] = var12.field1737[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1745 == null || var12.field1745[var13] == -1) {
                            this.field1745[this.field1735] = -1;
                        } else {
                            this.field1745[this.field1735] = (byte) (var12.field1745[var13] + this.field1739);
                        }
                    }
                    this.field1736[this.field1735] = var12.field1736[var13];
                    this.field1729[this.field1735] = this.method2399(var12, var12.field1729[var13]);
                    this.field1730[this.field1735] = this.method2399(var12, var12.field1730[var13]);
                    this.field1731[this.field1735] = this.method2399(var12, var12.field1731[var13]);
                    this.field1735++;
                }
                for (int var14 = 0; var14 < var12.field1739; var14++) {
                    byte var15 = this.field1740[this.field1739] = var12.field1740[var14];
                    if (var15 == 0) {
                        this.field1755[this.field1739] = (short) this.method2399(var12, var12.field1755[var14]);
                        this.field1724[this.field1739] = (short) this.method2399(var12, var12.field1724[var14]);
                        this.field1768[this.field1739] = (short) this.method2399(var12, var12.field1768[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1755[this.field1739] = var12.field1755[var14];
                        this.field1724[this.field1739] = var12.field1724[var14];
                        this.field1768[this.field1739] = var12.field1768[var14];
                        this.field1744[this.field1739] = var12.field1744[var14];
                        this.field1746[this.field1739] = var12.field1746[var14];
                        this.field1741[this.field1739] = var12.field1741[var14];
                        this.field1747[this.field1739] = var12.field1747[var14];
                        this.field1750[this.field1739] = var12.field1750[var14];
                        this.field1748[this.field1739] = var12.field1748[var14];
                    }
                    if (var15 == 2) {
                        this.field1767[this.field1739] = var12.field1767[var14];
                    }
                    this.field1739++;
                }
            }
        }
    }

    @ObfuscatedName("dg.d(Ldg;I)I")
    public final int method2399(class126 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1742[arg1];
        int var5 = arg0.field1726[arg1];
        int var6 = arg0.field1770[arg1];
        for (int var7 = 0; var7 < this.field1749; var7++) {
            if (this.field1742[var7] == var4 && this.field1726[var7] == var5 && this.field1770[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1742[this.field1749] = var4;
            this.field1726[this.field1749] = var5;
            this.field1770[this.field1749] = var6;
            if (arg0.field1751 != null) {
                this.field1751[this.field1749] = arg0.field1751[arg1];
            }
            var3 = this.field1749++;
        }
        return var3;
    }

    public class126(class126 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1749 = arg0.field1749;
        this.field1735 = arg0.field1735;
        this.field1739 = arg0.field1739;
        if (arg1) {
            this.field1742 = arg0.field1742;
            this.field1726 = arg0.field1726;
            this.field1770 = arg0.field1770;
        } else {
            this.field1742 = new int[this.field1749];
            this.field1726 = new int[this.field1749];
            this.field1770 = new int[this.field1749];
            for (int var6 = 0; var6 < this.field1749; var6++) {
                this.field1742[var6] = arg0.field1742[var6];
                this.field1726[var6] = arg0.field1726[var6];
                this.field1770[var6] = arg0.field1770[var6];
            }
        }
        if (arg2) {
            this.field1736 = arg0.field1736;
        } else {
            this.field1736 = new short[this.field1735];
            for (int var7 = 0; var7 < this.field1735; var7++) {
                this.field1736[var7] = arg0.field1736[var7];
            }
        }
        if (arg3 || arg0.field1737 == null) {
            this.field1737 = arg0.field1737;
        } else {
            this.field1737 = new short[this.field1735];
            for (int var8 = 0; var8 < this.field1735; var8++) {
                this.field1737[var8] = arg0.field1737[var8];
            }
        }
        if (arg4) {
            this.field1734 = arg0.field1734;
        } else {
            this.field1734 = new byte[this.field1735];
            if (arg0.field1734 == null) {
                for (int var9 = 0; var9 < this.field1735; var9++) {
                    this.field1734[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1735; var10++) {
                    this.field1734[var10] = arg0.field1734[var10];
                }
            }
        }
        this.field1729 = arg0.field1729;
        this.field1730 = arg0.field1730;
        this.field1731 = arg0.field1731;
        this.field1728 = arg0.field1728;
        this.field1733 = arg0.field1733;
        this.field1745 = arg0.field1745;
        this.field1738 = arg0.field1738;
        this.field1740 = arg0.field1740;
        this.field1755 = arg0.field1755;
        this.field1724 = arg0.field1724;
        this.field1768 = arg0.field1768;
        this.field1744 = arg0.field1744;
        this.field1746 = arg0.field1746;
        this.field1741 = arg0.field1741;
        this.field1747 = arg0.field1747;
        this.field1750 = arg0.field1750;
        this.field1748 = arg0.field1748;
        this.field1767 = arg0.field1767;
        this.field1751 = arg0.field1751;
        this.field1752 = arg0.field1752;
        this.field1753 = arg0.field1753;
        this.field1759 = arg0.field1759;
        this.field1756 = arg0.field1756;
        this.field1727 = arg0.field1727;
        this.field1757 = arg0.field1757;
        this.field1732 = arg0.field1732;
        this.field1743 = arg0.field1743;
    }

    @ObfuscatedName("dg.h()Ldg;")
    public class126 method2377() {
        class126 var1 = new class126();
        if (this.field1728 != null) {
            var1.field1728 = new byte[this.field1735];
            for (int var2 = 0; var2 < this.field1735; var2++) {
                var1.field1728[var2] = this.field1728[var2];
            }
        }
        var1.field1749 = this.field1749;
        var1.field1735 = this.field1735;
        var1.field1739 = this.field1739;
        var1.field1742 = this.field1742;
        var1.field1726 = this.field1726;
        var1.field1770 = this.field1770;
        var1.field1729 = this.field1729;
        var1.field1730 = this.field1730;
        var1.field1731 = this.field1731;
        var1.field1733 = this.field1733;
        var1.field1734 = this.field1734;
        var1.field1745 = this.field1745;
        var1.field1736 = this.field1736;
        var1.field1737 = this.field1737;
        var1.field1738 = this.field1738;
        var1.field1740 = this.field1740;
        var1.field1755 = this.field1755;
        var1.field1724 = this.field1724;
        var1.field1768 = this.field1768;
        var1.field1744 = this.field1744;
        var1.field1746 = this.field1746;
        var1.field1741 = this.field1741;
        var1.field1747 = this.field1747;
        var1.field1750 = this.field1750;
        var1.field1748 = this.field1748;
        var1.field1767 = this.field1767;
        var1.field1751 = this.field1751;
        var1.field1752 = this.field1752;
        var1.field1753 = this.field1753;
        var1.field1759 = this.field1759;
        var1.field1756 = this.field1756;
        var1.field1727 = this.field1727;
        var1.field1732 = this.field1732;
        var1.field1743 = this.field1743;
        return var1;
    }

    @ObfuscatedName("dg.m([[IIIIZI)Ldg;")
    public class126 method2374(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2414();
        int var7 = this.field1762 + arg1;
        int var8 = this.field1763 + arg1;
        int var9 = this.field1765 + arg3;
        int var10 = this.field1764 + arg3;
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
        class126 var15;
        if (arg4) {
            var15 = new class126();
            var15.field1749 = this.field1749;
            var15.field1735 = this.field1735;
            var15.field1739 = this.field1739;
            var15.field1742 = this.field1742;
            var15.field1770 = this.field1770;
            var15.field1729 = this.field1729;
            var15.field1730 = this.field1730;
            var15.field1731 = this.field1731;
            var15.field1728 = this.field1728;
            var15.field1733 = this.field1733;
            var15.field1734 = this.field1734;
            var15.field1745 = this.field1745;
            var15.field1736 = this.field1736;
            var15.field1737 = this.field1737;
            var15.field1738 = this.field1738;
            var15.field1740 = this.field1740;
            var15.field1755 = this.field1755;
            var15.field1724 = this.field1724;
            var15.field1768 = this.field1768;
            var15.field1744 = this.field1744;
            var15.field1746 = this.field1746;
            var15.field1741 = this.field1741;
            var15.field1747 = this.field1747;
            var15.field1750 = this.field1750;
            var15.field1748 = this.field1748;
            var15.field1767 = this.field1767;
            var15.field1751 = this.field1751;
            var15.field1752 = this.field1752;
            var15.field1753 = this.field1753;
            var15.field1759 = this.field1759;
            var15.field1732 = this.field1732;
            var15.field1743 = this.field1743;
            var15.field1726 = new int[var15.field1749];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1749; var16++) {
                int var17 = this.field1742[var16] + arg1;
                int var18 = this.field1770[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1726[var16] = this.field1726[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1749; var26++) {
                int var27 = (-this.field1726[var26] << 16) / this.field2054;
                if (var27 < arg5) {
                    int var28 = this.field1742[var26] + arg1;
                    int var29 = this.field1770[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1726[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1726[var26];
                }
            }
        }
        var15.method2390();
        return var15;
    }

    @ObfuscatedName("dg.z()V")
    public void method2382() {
        int var10002;
        if (this.field1751 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1749; var3++) {
                int var4 = this.field1751[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1753 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1753[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1749) {
                int var7 = this.field1751[var6];
                this.field1753[var7][var1[var7]++] = var6++;
            }
            this.field1751 = null;
        }
        if (this.field1752 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1735; var10++) {
            int var11 = this.field1752[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1759 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1759[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1735) {
            int var14 = this.field1752[var13];
            this.field1759[var14][var8[var14]++] = var13++;
        }
        this.field1752 = null;
    }

    @ObfuscatedName("dg.i()V")
    public void method2380() {
        for (int var1 = 0; var1 < this.field1749; var1++) {
            int var2 = this.field1742[var1];
            this.field1742[var1] = this.field1770[var1];
            this.field1770[var1] = -var2;
        }
        this.method2390();
    }

    @ObfuscatedName("dg.x()V")
    public void method2398() {
        for (int var1 = 0; var1 < this.field1749; var1++) {
            this.field1742[var1] = -this.field1742[var1];
            this.field1770[var1] = -this.field1770[var1];
        }
        this.method2390();
    }

    @ObfuscatedName("dg.y()V")
    public void method2383() {
        for (int var1 = 0; var1 < this.field1749; var1++) {
            int var2 = this.field1770[var1];
            this.field1770[var1] = this.field1742[var1];
            this.field1742[var1] = -var2;
        }
        this.method2390();
    }

    @ObfuscatedName("dg.a(I)V")
    public void method2379(int arg0) {
        int var2 = field1769[arg0];
        int var3 = field1758[arg0];
        for (int var4 = 0; var4 < this.field1749; var4++) {
            int var5 = this.field1770[var4] * var2 + this.field1742[var4] * var3 >> 16;
            this.field1770[var4] = this.field1770[var4] * var3 - this.field1742[var4] * var2 >> 16;
            this.field1742[var4] = var5;
        }
        this.method2390();
    }

    @ObfuscatedName("dg.v(III)V")
    public void method2384(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1749; var4++) {
            this.field1742[var4] += arg0;
            this.field1726[var4] += arg1;
            this.field1770[var4] += arg2;
        }
        this.method2390();
    }

    @ObfuscatedName("dg.q(SS)V")
    public void method2385(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1735; var3++) {
            if (this.field1736[var3] == arg0) {
                this.field1736[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dg.r(SS)V")
    public void method2386(short arg0, short arg1) {
        if (this.field1737 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1735; var3++) {
            if (this.field1737[var3] == arg0) {
                this.field1737[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dg.j()V")
    public void method2387() {
        for (int var1 = 0; var1 < this.field1749; var1++) {
            this.field1770[var1] = -this.field1770[var1];
        }
        for (int var2 = 0; var2 < this.field1735; var2++) {
            int var3 = this.field1729[var2];
            this.field1729[var2] = this.field1731[var2];
            this.field1731[var2] = var3;
        }
        this.method2390();
    }

    @ObfuscatedName("dg.b(III)V")
    public void method2388(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1749; var4++) {
            this.field1742[var4] = this.field1742[var4] * arg0 / 128;
            this.field1726[var4] = this.field1726[var4] * arg1 / 128;
            this.field1770[var4] = this.field1770[var4] * arg2 / 128;
        }
        this.method2390();
    }

    @ObfuscatedName("dg.g()V")
    public void method2389() {
        if (this.field1756 != null) {
            return;
        }
        this.field1756 = new class134[this.field1749];
        for (int var1 = 0; var1 < this.field1749; var1++) {
            this.field1756[var1] = new class134();
        }
        for (int var2 = 0; var2 < this.field1735; var2++) {
            int var3 = this.field1729[var2];
            int var4 = this.field1730[var2];
            int var5 = this.field1731[var2];
            int var6 = this.field1742[var4] - this.field1742[var3];
            int var7 = this.field1726[var4] - this.field1726[var3];
            int var8 = this.field1770[var4] - this.field1770[var3];
            int var9 = this.field1742[var5] - this.field1742[var3];
            int var10 = this.field1726[var5] - this.field1726[var3];
            int var11 = this.field1770[var5] - this.field1770[var3];
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
            if (this.field1728 == null) {
                var19 = 0;
            } else {
                var19 = this.field1728[var2];
            }
            if (var19 == 0) {
                class134 var20 = this.field1756[var3];
                var20.field1936 += var16;
                var20.field1933 += var17;
                var20.field1934 += var18;
                var20.field1935++;
                class134 var21 = this.field1756[var4];
                var21.field1936 += var16;
                var21.field1933 += var17;
                var21.field1934 += var18;
                var21.field1935++;
                class134 var22 = this.field1756[var5];
                var22.field1936 += var16;
                var22.field1933 += var17;
                var22.field1934 += var18;
                var22.field1935++;
            } else if (var19 == 1) {
                if (this.field1727 == null) {
                    this.field1727 = new class142[this.field1735];
                }
                class142 var23 = this.field1727[var2] = new class142();
                var23.field2066 = var16;
                var23.field2065 = var17;
                var23.field2068 = var18;
            }
        }
    }

    @ObfuscatedName("dg.f()V")
    public void method2390() {
        this.field1756 = null;
        this.field1757 = null;
        this.field1727 = null;
        this.field1760 = false;
    }

    @ObfuscatedName("dg.p()V")
    public void method2414() {
        if (this.field1760) {
            return;
        }
        this.field2054 = 0;
        this.field1761 = 0;
        this.field1762 = 999999;
        this.field1763 = -999999;
        this.field1764 = -99999;
        this.field1765 = 99999;
        for (int var1 = 0; var1 < this.field1749; var1++) {
            int var2 = this.field1742[var1];
            int var3 = this.field1726[var1];
            int var4 = this.field1770[var1];
            if (var2 < this.field1762) {
                this.field1762 = var2;
            }
            if (var2 > this.field1763) {
                this.field1763 = var2;
            }
            if (var4 < this.field1765) {
                this.field1765 = var4;
            }
            if (var4 > this.field1764) {
                this.field1764 = var4;
            }
            if (-var3 > this.field2054) {
                this.field2054 = -var3;
            }
            if (var3 > this.field1761) {
                this.field1761 = var3;
            }
        }
        this.field1760 = true;
    }

    @ObfuscatedName("dg.e(Ldg;Ldg;IIIZ)V")
    public static void method2381(class126 arg0, class126 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2414();
        arg0.method2389();
        arg1.method2414();
        arg1.method2389();
        field1725++;
        int var6 = 0;
        int[] var7 = arg1.field1742;
        int var8 = arg1.field1749;
        for (int var9 = 0; var9 < arg0.field1749; var9++) {
            class134 var10 = arg0.field1756[var9];
            if (var10.field1935 != 0) {
                int var11 = arg0.field1726[var9] - arg3;
                if (var11 <= arg1.field1761) {
                    int var12 = arg0.field1742[var9] - arg2;
                    if (var12 >= arg1.field1762 && var12 <= arg1.field1763) {
                        int var13 = arg0.field1770[var9] - arg4;
                        if (var13 >= arg1.field1765 && var13 <= arg1.field1764) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class134 var15 = arg1.field1756[var14];
                                if (var7[var14] == var12 && arg1.field1770[var14] == var13 && arg1.field1726[var14] == var11 && var15.field1935 != 0) {
                                    if (arg0.field1757 == null) {
                                        arg0.field1757 = new class134[arg0.field1749];
                                    }
                                    if (arg1.field1757 == null) {
                                        arg1.field1757 = new class134[var8];
                                    }
                                    class134 var16 = arg0.field1757[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1757[var9] = new class134(var10);
                                    }
                                    class134 var17 = arg1.field1757[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1757[var14] = new class134(var15);
                                    }
                                    var16.field1936 += var15.field1936;
                                    var16.field1933 += var15.field1933;
                                    var16.field1934 += var15.field1934;
                                    var16.field1935 += var15.field1935;
                                    var17.field1936 += var10.field1936;
                                    var17.field1933 += var10.field1933;
                                    var17.field1934 += var10.field1934;
                                    var17.field1935 += var10.field1935;
                                    var6++;
                                    field1766[var9] = field1725;
                                    field1754[var14] = field1725;
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
        for (int var18 = 0; var18 < arg0.field1735; var18++) {
            if (field1766[arg0.field1729[var18]] == field1725 && field1766[arg0.field1730[var18]] == field1725 && field1766[arg0.field1731[var18]] == field1725) {
                if (arg0.field1728 == null) {
                    arg0.field1728 = new byte[arg0.field1735];
                }
                arg0.field1728[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1735; var19++) {
            if (field1754[arg1.field1729[var19]] == field1725 && field1754[arg1.field1730[var19]] == field1725 && field1754[arg1.field1731[var19]] == field1725) {
                if (arg1.field1728 == null) {
                    arg1.field1728 = new byte[arg1.field1735];
                }
                arg1.field1728[var19] = 2;
            }
        }
    }

    @ObfuscatedName("dg.c(IIIII)Lei;")
    public final class132 method2393(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2389();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class132 var8 = new class132();
        var8.field1853 = new int[this.field1735];
        var8.field1862 = new int[this.field1735];
        var8.field1863 = new int[this.field1735];
        if (this.field1739 > 0 && this.field1745 != null) {
            int[] var9 = new int[this.field1739];
            for (int var10 = 0; var10 < this.field1735; var10++) {
                if (this.field1745[var10] != -1) {
                    var9[this.field1745[var10] & 0xFF]++;
                }
            }
            var8.field1867 = 0;
            for (int var11 = 0; var11 < this.field1739; var11++) {
                if (var9[var11] > 0 && this.field1740[var11] == 0) {
                    var8.field1867++;
                }
            }
            var8.field1870 = new int[var8.field1867];
            var8.field1869 = new int[var8.field1867];
            var8.field1872 = new int[var8.field1867];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1739; var13++) {
                if (var9[var13] > 0 && this.field1740[var13] == 0) {
                    var8.field1870[var12] = this.field1755[var13] & 0xFFFF;
                    var8.field1869[var12] = this.field1724[var13] & 0xFFFF;
                    var8.field1872[var12] = this.field1768[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1866 = new byte[this.field1735];
            for (int var14 = 0; var14 < this.field1735; var14++) {
                if (this.field1745[var14] == -1) {
                    var8.field1866[var14] = -1;
                } else {
                    var8.field1866[var14] = (byte) var9[this.field1745[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1735; var15++) {
            byte var16;
            if (this.field1728 == null) {
                var16 = 0;
            } else {
                var16 = this.field1728[var15];
            }
            byte var17;
            if (this.field1734 == null) {
                var17 = 0;
            } else {
                var17 = this.field1734[var15];
            }
            short var18;
            if (this.field1737 == null) {
                var18 = -1;
            } else {
                var18 = this.field1737[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1736[var15] & 0xFFFF;
                    class134 var20;
                    if (this.field1757 == null || this.field1757[this.field1729[var15]] == null) {
                        var20 = this.field1756[this.field1729[var15]];
                    } else {
                        var20 = this.field1757[this.field1729[var15]];
                    }
                    int var21 = (var20.field1934 * arg4 + var20.field1936 * arg2 + var20.field1933 * arg3) / (var20.field1935 * var7) + arg0;
                    var8.field1853[var15] = method2403(var19, var21);
                    class134 var22;
                    if (this.field1757 == null || this.field1757[this.field1730[var15]] == null) {
                        var22 = this.field1756[this.field1730[var15]];
                    } else {
                        var22 = this.field1757[this.field1730[var15]];
                    }
                    int var23 = (var22.field1934 * arg4 + var22.field1936 * arg2 + var22.field1933 * arg3) / (var22.field1935 * var7) + arg0;
                    var8.field1862[var15] = method2403(var19, var23);
                    class134 var24;
                    if (this.field1757 == null || this.field1757[this.field1731[var15]] == null) {
                        var24 = this.field1756[this.field1731[var15]];
                    } else {
                        var24 = this.field1757[this.field1731[var15]];
                    }
                    int var25 = (var24.field1934 * arg4 + var24.field1936 * arg2 + var24.field1933 * arg3) / (var24.field1935 * var7) + arg0;
                    var8.field1863[var15] = method2403(var19, var25);
                } else if (var16 == 1) {
                    class142 var26 = this.field1727[var15];
                    int var27 = (var26.field2068 * arg4 + var26.field2066 * arg2 + var26.field2065 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1853[var15] = method2403(this.field1736[var15] & 0xFFFF, var27);
                    var8.field1863[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1853[var15] = 128;
                    var8.field1863[var15] = -1;
                } else {
                    var8.field1863[var15] = -2;
                }
            } else if (var16 == 0) {
                class134 var28;
                if (this.field1757 == null || this.field1757[this.field1729[var15]] == null) {
                    var28 = this.field1756[this.field1729[var15]];
                } else {
                    var28 = this.field1757[this.field1729[var15]];
                }
                int var29 = (var28.field1934 * arg4 + var28.field1936 * arg2 + var28.field1933 * arg3) / (var28.field1935 * var7) + arg0;
                var8.field1853[var15] = method2395(var29);
                class134 var30;
                if (this.field1757 == null || this.field1757[this.field1730[var15]] == null) {
                    var30 = this.field1756[this.field1730[var15]];
                } else {
                    var30 = this.field1757[this.field1730[var15]];
                }
                int var31 = (var30.field1934 * arg4 + var30.field1936 * arg2 + var30.field1933 * arg3) / (var30.field1935 * var7) + arg0;
                var8.field1862[var15] = method2395(var31);
                class134 var32;
                if (this.field1757 == null || this.field1757[this.field1731[var15]] == null) {
                    var32 = this.field1756[this.field1731[var15]];
                } else {
                    var32 = this.field1757[this.field1731[var15]];
                }
                int var33 = (var32.field1934 * arg4 + var32.field1936 * arg2 + var32.field1933 * arg3) / (var32.field1935 * var7) + arg0;
                var8.field1863[var15] = method2395(var33);
            } else if (var16 == 1) {
                class142 var34 = this.field1727[var15];
                int var35 = (var34.field2068 * arg4 + var34.field2066 * arg2 + var34.field2065 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1853[var15] = method2395(var35);
                var8.field1863[var15] = -1;
            } else {
                var8.field1863[var15] = -2;
            }
        }
        this.method2382();
        var8.field1883 = this.field1749;
        var8.field1854 = this.field1742;
        var8.field1855 = this.field1726;
        var8.field1856 = this.field1770;
        var8.field1898 = this.field1735;
        var8.field1858 = this.field1729;
        var8.field1889 = this.field1730;
        var8.field1860 = this.field1731;
        var8.field1864 = this.field1733;
        var8.field1865 = this.field1734;
        var8.field1868 = this.field1738;
        var8.field1873 = this.field1753;
        var8.field1891 = this.field1759;
        var8.field1852 = this.field1737;
        return var8;
    }

    @ObfuscatedName("dg.ag(II)I")
    public static final int method2403(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("dg.at(I)I")
    public static final int method2395(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
