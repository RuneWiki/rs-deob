package deob;

@ObfuscatedName("ch")
public class class104 extends class89 {

    @ObfuscatedName("ch.s")
    public int field1775 = 0;

    @ObfuscatedName("ch.z")
    public int[] field1731;

    @ObfuscatedName("ch.t")
    public int[] field1754;

    @ObfuscatedName("ch.y")
    public int[] field1733;

    @ObfuscatedName("ch.p")
    public int field1773 = 0;

    @ObfuscatedName("ch.g")
    public int[] field1735;

    @ObfuscatedName("ch.m")
    public int[] field1736;

    @ObfuscatedName("ch.f")
    public int[] field1761;

    @ObfuscatedName("ch.k")
    public byte[] field1738;

    @ObfuscatedName("ch.h")
    public byte[] field1759;

    @ObfuscatedName("ch.r")
    public byte[] field1740;

    @ObfuscatedName("ch.w")
    public byte[] field1732;

    @ObfuscatedName("ch.u")
    public short[] field1766;

    @ObfuscatedName("ch.n")
    public short[] field1743;

    @ObfuscatedName("ch.d")
    public byte field1744 = 0;

    @ObfuscatedName("ch.a")
    public int field1745;

    @ObfuscatedName("ch.b")
    public byte[] field1746;

    @ObfuscatedName("ch.q")
    public short[] field1747;

    @ObfuscatedName("ch.o")
    public short[] field1757;

    @ObfuscatedName("ch.c")
    public short[] field1749;

    @ObfuscatedName("ch.i")
    public short[] field1737;

    @ObfuscatedName("ch.x")
    public short[] field1750;

    @ObfuscatedName("ch.v")
    public short[] field1752;

    @ObfuscatedName("ch.l")
    public short[] field1753;

    @ObfuscatedName("ch.e")
    public short[] field1739;

    @ObfuscatedName("ch.j")
    public short[] field1770;

    @ObfuscatedName("ch.ae")
    public byte[] field1756;

    @ObfuscatedName("ch.ah")
    public int[] field1748;

    @ObfuscatedName("ch.am")
    public int[] field1758;

    @ObfuscatedName("ch.aa")
    public int[][] field1741;

    @ObfuscatedName("ch.ax")
    public int[][] field1760;

    @ObfuscatedName("ch.ac")
    public class88[] field1730;

    @ObfuscatedName("ch.ar")
    public class100[] field1762;

    @ObfuscatedName("ch.an")
    public class100[] field1763;

    @ObfuscatedName("ch.ag")
    public short field1764;

    @ObfuscatedName("ch.ab")
    public short field1765;

    @ObfuscatedName("ch.ao")
    public boolean field1755 = false;

    @ObfuscatedName("ch.av")
    public int field1767;

    @ObfuscatedName("ch.ap")
    public int field1768;

    @ObfuscatedName("ch.au")
    public int field1769;

    @ObfuscatedName("ch.ad")
    public int field1751;

    @ObfuscatedName("ch.aj")
    public int field1771;

    @ObfuscatedName("ch.ai")
    public static int[] field1772 = new int[10000];

    @ObfuscatedName("ch.az")
    public static int[] field1742 = new int[10000];

    @ObfuscatedName("ch.ay")
    public static int field1774 = 0;

    @ObfuscatedName("ch.at")
    public static int[] field1734 = class95.field1632;

    @ObfuscatedName("ch.al")
    public static int[] field1776 = class95.field1622;

    public class104() {
    }

    @ObfuscatedName("ch.s(Lfu;II)Lch;")
    public static class104 method2078(class171 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3091(arg1, arg2);
        return var3 == null ? null : new class104(var3);
    }

    public class104(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2079(arg0);
        } else {
            this.method2121(arg0);
        }
    }

    @ObfuscatedName("ch.z([B)V")
    public void method2079(byte[] arg0) {
        class123 var2 = new class123(arg0);
        class123 var3 = new class123(arg0);
        class123 var4 = new class123(arg0);
        class123 var5 = new class123(arg0);
        class123 var6 = new class123(arg0);
        class123 var7 = new class123(arg0);
        class123 var8 = new class123(arg0);
        var2.field2028 = arg0.length - 23;
        int var9 = var2.method2550();
        int var10 = var2.method2550();
        int var11 = var2.method2363();
        int var12 = var2.method2363();
        int var13 = var2.method2363();
        int var14 = var2.method2363();
        int var15 = var2.method2363();
        int var16 = var2.method2363();
        int var17 = var2.method2363();
        int var18 = var2.method2550();
        int var19 = var2.method2550();
        int var20 = var2.method2550();
        int var21 = var2.method2550();
        int var22 = var2.method2550();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1746 = new byte[var11];
            var2.field2028 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1746[var26] = var2.method2483();
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
        this.field1775 = var9;
        this.field1773 = var10;
        this.field1745 = var11;
        this.field1731 = new int[var9];
        this.field1754 = new int[var9];
        this.field1733 = new int[var9];
        this.field1735 = new int[var10];
        this.field1736 = new int[var10];
        this.field1761 = new int[var10];
        if (var17 == 1) {
            this.field1748 = new int[var9];
        }
        if (var12 == 1) {
            this.field1738 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1759 = new byte[var10];
        } else {
            this.field1744 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1740 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1758 = new int[var10];
        }
        if (var16 == 1) {
            this.field1743 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1732 = new byte[var10];
        }
        this.field1766 = new short[var10];
        if (var11 > 0) {
            this.field1747 = new short[var11];
            this.field1757 = new short[var11];
            this.field1749 = new short[var11];
            if (var24 > 0) {
                this.field1737 = new short[var24];
                this.field1750 = new short[var24];
                this.field1752 = new short[var24];
                this.field1753 = new short[var24];
                this.field1756 = new byte[var24];
                this.field1739 = new short[var24];
            }
            if (var25 > 0) {
                this.field1770 = new short[var25];
            }
        }
        var2.field2028 = var11;
        var3.field2028 = var44;
        var4.field2028 = var46;
        var5.field2028 = var48;
        var6.field2028 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2363();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2552();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2552();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2552();
            }
            this.field1731[var67] = var64 + var69;
            this.field1754[var67] = var65 + var70;
            this.field1733[var67] = var66 + var71;
            var64 = this.field1731[var67];
            var65 = this.field1754[var67];
            var66 = this.field1733[var67];
            if (var17 == 1) {
                this.field1748[var67] = var6.method2363();
            }
        }
        var2.field2028 = var42;
        var3.field2028 = var31;
        var4.field2028 = var34;
        var5.field2028 = var37;
        var6.field2028 = var35;
        var7.field2028 = var40;
        var8.field2028 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1766[var72] = (short) var2.method2550();
            if (var12 == 1) {
                this.field1738[var72] = var3.method2483();
            }
            if (var13 == 255) {
                this.field1759[var72] = var4.method2483();
            }
            if (var14 == 1) {
                this.field1740[var72] = var5.method2483();
            }
            if (var15 == 1) {
                this.field1758[var72] = var6.method2363();
            }
            if (var16 == 1) {
                this.field1743[var72] = (short) (var7.method2550() - 1);
            }
            if (this.field1732 != null && this.field1743[var72] != -1) {
                this.field1732[var72] = (byte) (var8.method2363() - 1);
            }
        }
        var2.field2028 = var33;
        var3.field2028 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2363();
            if (var78 == 1) {
                var73 = var2.method2552() + var76;
                var74 = var2.method2552() + var73;
                var75 = var2.method2552() + var74;
                var76 = var75;
                this.field1735[var77] = var73;
                this.field1736[var77] = var74;
                this.field1761[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2552() + var76;
                var76 = var75;
                this.field1735[var77] = var73;
                this.field1736[var77] = var74;
                this.field1761[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2552() + var76;
                var76 = var75;
                this.field1735[var77] = var73;
                this.field1736[var77] = var74;
                this.field1761[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2552() + var76;
                var76 = var75;
                this.field1735[var77] = var73;
                this.field1736[var77] = var81;
                this.field1761[var77] = var75;
            }
        }
        var2.field2028 = var50;
        var3.field2028 = var52;
        var4.field2028 = var54;
        var5.field2028 = var56;
        var6.field2028 = var58;
        var7.field2028 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1746[var82] & 0xFF;
            if (var83 == 0) {
                this.field1747[var82] = (short) var2.method2550();
                this.field1757[var82] = (short) var2.method2550();
                this.field1749[var82] = (short) var2.method2550();
            }
            if (var83 == 1) {
                this.field1747[var82] = (short) var3.method2550();
                this.field1757[var82] = (short) var3.method2550();
                this.field1749[var82] = (short) var3.method2550();
                this.field1737[var82] = (short) var4.method2550();
                this.field1750[var82] = (short) var4.method2550();
                this.field1752[var82] = (short) var4.method2550();
                this.field1753[var82] = (short) var5.method2550();
                this.field1756[var82] = var6.method2483();
                this.field1739[var82] = (short) var7.method2550();
            }
            if (var83 == 2) {
                this.field1747[var82] = (short) var3.method2550();
                this.field1757[var82] = (short) var3.method2550();
                this.field1749[var82] = (short) var3.method2550();
                this.field1737[var82] = (short) var4.method2550();
                this.field1750[var82] = (short) var4.method2550();
                this.field1752[var82] = (short) var4.method2550();
                this.field1753[var82] = (short) var5.method2550();
                this.field1756[var82] = var6.method2483();
                this.field1739[var82] = (short) var7.method2550();
                this.field1770[var82] = (short) var7.method2550();
            }
            if (var83 == 3) {
                this.field1747[var82] = (short) var3.method2550();
                this.field1757[var82] = (short) var3.method2550();
                this.field1749[var82] = (short) var3.method2550();
                this.field1737[var82] = (short) var4.method2550();
                this.field1750[var82] = (short) var4.method2550();
                this.field1752[var82] = (short) var4.method2550();
                this.field1753[var82] = (short) var5.method2550();
                this.field1756[var82] = var6.method2483();
                this.field1739[var82] = (short) var7.method2550();
            }
        }
        var2.field2028 = var62;
        int var84 = var2.method2363();
        if (var84 == 0) {
            return;
        }
        new class94();
        var2.method2550();
        var2.method2550();
        var2.method2550();
        var2.method2408();
    }

    @ObfuscatedName("ch.y([B)V")
    public void method2121(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class123 var4 = new class123(arg0);
        class123 var5 = new class123(arg0);
        class123 var6 = new class123(arg0);
        class123 var7 = new class123(arg0);
        class123 var8 = new class123(arg0);
        var4.field2028 = arg0.length - 18;
        int var9 = var4.method2550();
        int var10 = var4.method2550();
        int var11 = var4.method2363();
        int var12 = var4.method2363();
        int var13 = var4.method2363();
        int var14 = var4.method2363();
        int var15 = var4.method2363();
        int var16 = var4.method2363();
        int var17 = var4.method2550();
        int var18 = var4.method2550();
        int var19 = var4.method2550();
        int var20 = var4.method2550();
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
        this.field1775 = var9;
        this.field1773 = var10;
        this.field1745 = var11;
        this.field1731 = new int[var9];
        this.field1754 = new int[var9];
        this.field1733 = new int[var9];
        this.field1735 = new int[var10];
        this.field1736 = new int[var10];
        this.field1761 = new int[var10];
        if (var11 > 0) {
            this.field1746 = new byte[var11];
            this.field1747 = new short[var11];
            this.field1757 = new short[var11];
            this.field1749 = new short[var11];
        }
        if (var16 == 1) {
            this.field1748 = new int[var9];
        }
        if (var12 == 1) {
            this.field1738 = new byte[var10];
            this.field1732 = new byte[var10];
            this.field1743 = new short[var10];
        }
        if (var13 == 255) {
            this.field1759 = new byte[var10];
        } else {
            this.field1744 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1740 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1758 = new int[var10];
        }
        this.field1766 = new short[var10];
        var4.field2028 = var21;
        var5.field2028 = var36;
        var6.field2028 = var38;
        var7.field2028 = var40;
        var8.field2028 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2363();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2552();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2552();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2552();
            }
            this.field1731[var46] = var43 + var48;
            this.field1754[var46] = var44 + var49;
            this.field1733[var46] = var45 + var50;
            var43 = this.field1731[var46];
            var44 = this.field1754[var46];
            var45 = this.field1733[var46];
            if (var16 == 1) {
                this.field1748[var46] = var8.method2363();
            }
        }
        var4.field2028 = var32;
        var5.field2028 = var28;
        var6.field2028 = var26;
        var7.field2028 = var30;
        var8.field2028 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1766[var51] = (short) var4.method2550();
            if (var12 == 1) {
                int var52 = var5.method2363();
                if ((var52 & 0x1) == 1) {
                    this.field1738[var51] = 1;
                    var2 = true;
                } else {
                    this.field1738[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1732[var51] = (byte) (var52 >> 2);
                    this.field1743[var51] = this.field1766[var51];
                    this.field1766[var51] = 127;
                    if (this.field1743[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1732[var51] = -1;
                    this.field1743[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1759[var51] = var6.method2483();
            }
            if (var14 == 1) {
                this.field1740[var51] = var7.method2483();
            }
            if (var15 == 1) {
                this.field1758[var51] = var8.method2363();
            }
        }
        var4.field2028 = var25;
        var5.field2028 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2363();
            if (var58 == 1) {
                var53 = var4.method2552() + var56;
                var54 = var4.method2552() + var53;
                var55 = var4.method2552() + var54;
                var56 = var55;
                this.field1735[var57] = var53;
                this.field1736[var57] = var54;
                this.field1761[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2552() + var56;
                var56 = var55;
                this.field1735[var57] = var53;
                this.field1736[var57] = var54;
                this.field1761[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2552() + var56;
                var56 = var55;
                this.field1735[var57] = var53;
                this.field1736[var57] = var54;
                this.field1761[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2552() + var56;
                var56 = var55;
                this.field1735[var57] = var53;
                this.field1736[var57] = var61;
                this.field1761[var57] = var55;
            }
        }
        var4.field2028 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1746[var62] = 0;
            this.field1747[var62] = (short) var4.method2550();
            this.field1757[var62] = (short) var4.method2550();
            this.field1749[var62] = (short) var4.method2550();
        }
        if (this.field1732 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1732[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1747[var65] & 0xFFFF) == this.field1735[var64] && (this.field1757[var65] & 0xFFFF) == this.field1736[var64] && (this.field1749[var65] & 0xFFFF) == this.field1761[var64]) {
                        this.field1732[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1732 = null;
            }
        }
        if (!var3) {
            this.field1743 = null;
        }
        if (!var2) {
            this.field1738 = null;
        }
    }

    public class104(class104[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1775 = 0;
        this.field1773 = 0;
        this.field1745 = 0;
        this.field1744 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class104 var10 = arg0[var9];
            if (var10 != null) {
                this.field1775 += var10.field1775;
                this.field1773 += var10.field1773;
                this.field1745 += var10.field1745;
                if (var10.field1759 == null) {
                    if (this.field1744 == -1) {
                        this.field1744 = var10.field1744;
                    }
                    if (this.field1744 != var10.field1744) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1738 != null;
                var5 |= var10.field1740 != null;
                var6 |= var10.field1758 != null;
                var7 |= var10.field1743 != null;
                var8 |= var10.field1732 != null;
            }
        }
        this.field1731 = new int[this.field1775];
        this.field1754 = new int[this.field1775];
        this.field1733 = new int[this.field1775];
        this.field1748 = new int[this.field1775];
        this.field1735 = new int[this.field1773];
        this.field1736 = new int[this.field1773];
        this.field1761 = new int[this.field1773];
        if (var3) {
            this.field1738 = new byte[this.field1773];
        }
        if (var4) {
            this.field1759 = new byte[this.field1773];
        }
        if (var5) {
            this.field1740 = new byte[this.field1773];
        }
        if (var6) {
            this.field1758 = new int[this.field1773];
        }
        if (var7) {
            this.field1743 = new short[this.field1773];
        }
        if (var8) {
            this.field1732 = new byte[this.field1773];
        }
        this.field1766 = new short[this.field1773];
        if (this.field1745 > 0) {
            this.field1746 = new byte[this.field1745];
            this.field1747 = new short[this.field1745];
            this.field1757 = new short[this.field1745];
            this.field1749 = new short[this.field1745];
            this.field1737 = new short[this.field1745];
            this.field1750 = new short[this.field1745];
            this.field1752 = new short[this.field1745];
            this.field1753 = new short[this.field1745];
            this.field1756 = new byte[this.field1745];
            this.field1739 = new short[this.field1745];
            this.field1770 = new short[this.field1745];
        }
        this.field1775 = 0;
        this.field1773 = 0;
        this.field1745 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class104 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1773; var13++) {
                    if (var3 && var12.field1738 != null) {
                        this.field1738[this.field1773] = var12.field1738[var13];
                    }
                    if (var4) {
                        if (var12.field1759 == null) {
                            this.field1759[this.field1773] = var12.field1744;
                        } else {
                            this.field1759[this.field1773] = var12.field1759[var13];
                        }
                    }
                    if (var5 && var12.field1740 != null) {
                        this.field1740[this.field1773] = var12.field1740[var13];
                    }
                    if (var6 && var12.field1758 != null) {
                        this.field1758[this.field1773] = var12.field1758[var13];
                    }
                    if (var7) {
                        if (var12.field1743 == null) {
                            this.field1743[this.field1773] = -1;
                        } else {
                            this.field1743[this.field1773] = var12.field1743[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1732 == null || var12.field1732[var13] == -1) {
                            this.field1732[this.field1773] = -1;
                        } else {
                            this.field1732[this.field1773] = (byte) (var12.field1732[var13] + this.field1745);
                        }
                    }
                    this.field1766[this.field1773] = var12.field1766[var13];
                    this.field1735[this.field1773] = this.method2088(var12, var12.field1735[var13]);
                    this.field1736[this.field1773] = this.method2088(var12, var12.field1736[var13]);
                    this.field1761[this.field1773] = this.method2088(var12, var12.field1761[var13]);
                    this.field1773++;
                }
                for (int var14 = 0; var14 < var12.field1745; var14++) {
                    byte var15 = this.field1746[this.field1745] = var12.field1746[var14];
                    if (var15 == 0) {
                        this.field1747[this.field1745] = (short) this.method2088(var12, var12.field1747[var14]);
                        this.field1757[this.field1745] = (short) this.method2088(var12, var12.field1757[var14]);
                        this.field1749[this.field1745] = (short) this.method2088(var12, var12.field1749[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1747[this.field1745] = var12.field1747[var14];
                        this.field1757[this.field1745] = var12.field1757[var14];
                        this.field1749[this.field1745] = var12.field1749[var14];
                        this.field1737[this.field1745] = var12.field1737[var14];
                        this.field1750[this.field1745] = var12.field1750[var14];
                        this.field1752[this.field1745] = var12.field1752[var14];
                        this.field1753[this.field1745] = var12.field1753[var14];
                        this.field1756[this.field1745] = var12.field1756[var14];
                        this.field1739[this.field1745] = var12.field1739[var14];
                    }
                    if (var15 == 2) {
                        this.field1770[this.field1745] = var12.field1770[var14];
                    }
                    this.field1745++;
                }
            }
        }
    }

    @ObfuscatedName("ch.p(Lch;I)I")
    public final int method2088(class104 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1731[arg1];
        int var5 = arg0.field1754[arg1];
        int var6 = arg0.field1733[arg1];
        for (int var7 = 0; var7 < this.field1775; var7++) {
            if (this.field1731[var7] == var4 && this.field1754[var7] == var5 && this.field1733[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1731[this.field1775] = var4;
            this.field1754[this.field1775] = var5;
            this.field1733[this.field1775] = var6;
            if (arg0.field1748 != null) {
                this.field1748[this.field1775] = arg0.field1748[arg1];
            }
            var3 = this.field1775++;
        }
        return var3;
    }

    public class104(class104 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1775 = arg0.field1775;
        this.field1773 = arg0.field1773;
        this.field1745 = arg0.field1745;
        if (arg1) {
            this.field1731 = arg0.field1731;
            this.field1754 = arg0.field1754;
            this.field1733 = arg0.field1733;
        } else {
            this.field1731 = new int[this.field1775];
            this.field1754 = new int[this.field1775];
            this.field1733 = new int[this.field1775];
            for (int var6 = 0; var6 < this.field1775; var6++) {
                this.field1731[var6] = arg0.field1731[var6];
                this.field1754[var6] = arg0.field1754[var6];
                this.field1733[var6] = arg0.field1733[var6];
            }
        }
        if (arg2) {
            this.field1766 = arg0.field1766;
        } else {
            this.field1766 = new short[this.field1773];
            for (int var7 = 0; var7 < this.field1773; var7++) {
                this.field1766[var7] = arg0.field1766[var7];
            }
        }
        if (arg3 || arg0.field1743 == null) {
            this.field1743 = arg0.field1743;
        } else {
            this.field1743 = new short[this.field1773];
            for (int var8 = 0; var8 < this.field1773; var8++) {
                this.field1743[var8] = arg0.field1743[var8];
            }
        }
        if (arg4) {
            this.field1740 = arg0.field1740;
        } else {
            this.field1740 = new byte[this.field1773];
            if (arg0.field1740 == null) {
                for (int var9 = 0; var9 < this.field1773; var9++) {
                    this.field1740[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1773; var10++) {
                    this.field1740[var10] = arg0.field1740[var10];
                }
            }
        }
        this.field1735 = arg0.field1735;
        this.field1736 = arg0.field1736;
        this.field1761 = arg0.field1761;
        this.field1738 = arg0.field1738;
        this.field1759 = arg0.field1759;
        this.field1732 = arg0.field1732;
        this.field1744 = arg0.field1744;
        this.field1746 = arg0.field1746;
        this.field1747 = arg0.field1747;
        this.field1757 = arg0.field1757;
        this.field1749 = arg0.field1749;
        this.field1737 = arg0.field1737;
        this.field1750 = arg0.field1750;
        this.field1752 = arg0.field1752;
        this.field1753 = arg0.field1753;
        this.field1756 = arg0.field1756;
        this.field1739 = arg0.field1739;
        this.field1770 = arg0.field1770;
        this.field1748 = arg0.field1748;
        this.field1758 = arg0.field1758;
        this.field1741 = arg0.field1741;
        this.field1760 = arg0.field1760;
        this.field1762 = arg0.field1762;
        this.field1730 = arg0.field1730;
        this.field1763 = arg0.field1763;
        this.field1764 = arg0.field1764;
        this.field1765 = arg0.field1765;
    }

    @ObfuscatedName("ch.g()Lch;")
    public class104 method2083() {
        class104 var1 = new class104();
        if (this.field1738 != null) {
            var1.field1738 = new byte[this.field1773];
            for (int var2 = 0; var2 < this.field1773; var2++) {
                var1.field1738[var2] = this.field1738[var2];
            }
        }
        var1.field1775 = this.field1775;
        var1.field1773 = this.field1773;
        var1.field1745 = this.field1745;
        var1.field1731 = this.field1731;
        var1.field1754 = this.field1754;
        var1.field1733 = this.field1733;
        var1.field1735 = this.field1735;
        var1.field1736 = this.field1736;
        var1.field1761 = this.field1761;
        var1.field1759 = this.field1759;
        var1.field1740 = this.field1740;
        var1.field1732 = this.field1732;
        var1.field1766 = this.field1766;
        var1.field1743 = this.field1743;
        var1.field1744 = this.field1744;
        var1.field1746 = this.field1746;
        var1.field1747 = this.field1747;
        var1.field1757 = this.field1757;
        var1.field1749 = this.field1749;
        var1.field1737 = this.field1737;
        var1.field1750 = this.field1750;
        var1.field1752 = this.field1752;
        var1.field1753 = this.field1753;
        var1.field1756 = this.field1756;
        var1.field1739 = this.field1739;
        var1.field1770 = this.field1770;
        var1.field1748 = this.field1748;
        var1.field1758 = this.field1758;
        var1.field1741 = this.field1741;
        var1.field1760 = this.field1760;
        var1.field1762 = this.field1762;
        var1.field1730 = this.field1730;
        var1.field1764 = this.field1764;
        var1.field1765 = this.field1765;
        return var1;
    }

    @ObfuscatedName("ch.m([[IIIIZI)Lch;")
    public class104 method2094(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2095();
        int var7 = this.field1768 + arg1;
        int var8 = this.field1769 + arg1;
        int var9 = this.field1771 + arg3;
        int var10 = this.field1751 + arg3;
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
        class104 var15;
        if (arg4) {
            var15 = new class104();
            var15.field1775 = this.field1775;
            var15.field1773 = this.field1773;
            var15.field1745 = this.field1745;
            var15.field1731 = this.field1731;
            var15.field1733 = this.field1733;
            var15.field1735 = this.field1735;
            var15.field1736 = this.field1736;
            var15.field1761 = this.field1761;
            var15.field1738 = this.field1738;
            var15.field1759 = this.field1759;
            var15.field1740 = this.field1740;
            var15.field1732 = this.field1732;
            var15.field1766 = this.field1766;
            var15.field1743 = this.field1743;
            var15.field1744 = this.field1744;
            var15.field1746 = this.field1746;
            var15.field1747 = this.field1747;
            var15.field1757 = this.field1757;
            var15.field1749 = this.field1749;
            var15.field1737 = this.field1737;
            var15.field1750 = this.field1750;
            var15.field1752 = this.field1752;
            var15.field1753 = this.field1753;
            var15.field1756 = this.field1756;
            var15.field1739 = this.field1739;
            var15.field1770 = this.field1770;
            var15.field1748 = this.field1748;
            var15.field1758 = this.field1758;
            var15.field1741 = this.field1741;
            var15.field1760 = this.field1760;
            var15.field1764 = this.field1764;
            var15.field1765 = this.field1765;
            var15.field1754 = new int[var15.field1775];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1775; var16++) {
                int var17 = this.field1731[var16] + arg1;
                int var18 = this.field1733[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1754[var16] = this.field1754[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1775; var26++) {
                int var27 = (-this.field1754[var26] << 16) / this.field1503;
                if (var27 < arg5) {
                    int var28 = this.field1731[var26] + arg1;
                    int var29 = this.field1733[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1754[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1754[var26];
                }
            }
        }
        var15.method2140();
        return var15;
    }

    @ObfuscatedName("ch.f()V")
    public void method2082() {
        int var10002;
        if (this.field1748 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1775; var3++) {
                int var4 = this.field1748[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1741 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1741[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1775) {
                int var7 = this.field1748[var6];
                this.field1741[var7][var1[var7]++] = var6++;
            }
            this.field1748 = null;
        }
        if (this.field1758 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1773; var10++) {
            int var11 = this.field1758[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1760 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1760[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1773) {
            int var14 = this.field1758[var13];
            this.field1760[var14][var8[var14]++] = var13++;
        }
        this.field1758 = null;
    }

    @ObfuscatedName("ch.k()V")
    public void method2077() {
        for (int var1 = 0; var1 < this.field1775; var1++) {
            int var2 = this.field1731[var1];
            this.field1731[var1] = this.field1733[var1];
            this.field1733[var1] = -var2;
        }
        this.method2140();
    }

    @ObfuscatedName("ch.h()V")
    public void method2081() {
        for (int var1 = 0; var1 < this.field1775; var1++) {
            this.field1731[var1] = -this.field1731[var1];
            this.field1733[var1] = -this.field1733[var1];
        }
        this.method2140();
    }

    @ObfuscatedName("ch.r()V")
    public void method2131() {
        for (int var1 = 0; var1 < this.field1775; var1++) {
            int var2 = this.field1733[var1];
            this.field1733[var1] = this.field1731[var1];
            this.field1731[var1] = -var2;
        }
        this.method2140();
    }

    @ObfuscatedName("ch.w(I)V")
    public void method2089(int arg0) {
        int var2 = field1734[arg0];
        int var3 = field1776[arg0];
        for (int var4 = 0; var4 < this.field1775; var4++) {
            int var5 = this.field1733[var4] * var2 + this.field1731[var4] * var3 >> 16;
            this.field1733[var4] = this.field1733[var4] * var3 - this.field1731[var4] * var2 >> 16;
            this.field1731[var4] = var5;
        }
        this.method2140();
    }

    @ObfuscatedName("ch.u(III)V")
    public void method2085(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1775; var4++) {
            this.field1731[var4] += arg0;
            this.field1754[var4] += arg1;
            this.field1733[var4] += arg2;
        }
        this.method2140();
    }

    @ObfuscatedName("ch.n(SS)V")
    public void method2091(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1773; var3++) {
            if (this.field1766[var3] == arg0) {
                this.field1766[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ch.a(SS)V")
    public void method2128(short arg0, short arg1) {
        if (this.field1743 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1773; var3++) {
            if (this.field1743[var3] == arg0) {
                this.field1743[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ch.b()V")
    public void method2118() {
        for (int var1 = 0; var1 < this.field1775; var1++) {
            this.field1733[var1] = -this.field1733[var1];
        }
        for (int var2 = 0; var2 < this.field1773; var2++) {
            int var3 = this.field1735[var2];
            this.field1735[var2] = this.field1761[var2];
            this.field1761[var2] = var3;
        }
        this.method2140();
    }

    @ObfuscatedName("ch.q(III)V")
    public void method2092(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1775; var4++) {
            this.field1731[var4] = this.field1731[var4] * arg0 / 128;
            this.field1754[var4] = this.field1754[var4] * arg1 / 128;
            this.field1733[var4] = this.field1733[var4] * arg2 / 128;
        }
        this.method2140();
    }

    @ObfuscatedName("ch.o()V")
    public void method2093() {
        if (this.field1762 != null) {
            return;
        }
        this.field1762 = new class100[this.field1775];
        for (int var1 = 0; var1 < this.field1775; var1++) {
            this.field1762[var1] = new class100();
        }
        for (int var2 = 0; var2 < this.field1773; var2++) {
            int var3 = this.field1735[var2];
            int var4 = this.field1736[var2];
            int var5 = this.field1761[var2];
            int var6 = this.field1731[var4] - this.field1731[var3];
            int var7 = this.field1754[var4] - this.field1754[var3];
            int var8 = this.field1733[var4] - this.field1733[var3];
            int var9 = this.field1731[var5] - this.field1731[var3];
            int var10 = this.field1754[var5] - this.field1754[var3];
            int var11 = this.field1733[var5] - this.field1733[var3];
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
            if (this.field1738 == null) {
                var19 = 0;
            } else {
                var19 = this.field1738[var2];
            }
            if (var19 == 0) {
                class100 var20 = this.field1762[var3];
                var20.field1676 += var16;
                var20.field1668 += var17;
                var20.field1669 += var18;
                var20.field1671++;
                class100 var21 = this.field1762[var4];
                var21.field1676 += var16;
                var21.field1668 += var17;
                var21.field1669 += var18;
                var21.field1671++;
                class100 var22 = this.field1762[var5];
                var22.field1676 += var16;
                var22.field1668 += var17;
                var22.field1669 += var18;
                var22.field1671++;
            } else if (var19 == 1) {
                if (this.field1730 == null) {
                    this.field1730 = new class88[this.field1773];
                }
                class88 var23 = this.field1730[var2] = new class88();
                var23.field1496 = var16;
                var23.field1497 = var17;
                var23.field1498 = var18;
            }
        }
    }

    @ObfuscatedName("ch.c()V")
    public void method2140() {
        this.field1762 = null;
        this.field1763 = null;
        this.field1730 = null;
        this.field1755 = false;
    }

    @ObfuscatedName("ch.i()V")
    public void method2095() {
        if (this.field1755) {
            return;
        }
        this.field1503 = 0;
        this.field1767 = 0;
        this.field1768 = 999999;
        this.field1769 = -999999;
        this.field1751 = -99999;
        this.field1771 = 99999;
        for (int var1 = 0; var1 < this.field1775; var1++) {
            int var2 = this.field1731[var1];
            int var3 = this.field1754[var1];
            int var4 = this.field1733[var1];
            if (var2 < this.field1768) {
                this.field1768 = var2;
            }
            if (var2 > this.field1769) {
                this.field1769 = var2;
            }
            if (var4 < this.field1771) {
                this.field1771 = var4;
            }
            if (var4 > this.field1751) {
                this.field1751 = var4;
            }
            if (-var3 > this.field1503) {
                this.field1503 = -var3;
            }
            if (var3 > this.field1767) {
                this.field1767 = var3;
            }
        }
        this.field1755 = true;
    }

    @ObfuscatedName("ch.x(Lch;Lch;IIIZ)V")
    public static void method2098(class104 arg0, class104 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2095();
        arg0.method2093();
        arg1.method2095();
        arg1.method2093();
        field1774++;
        int var6 = 0;
        int[] var7 = arg1.field1731;
        int var8 = arg1.field1775;
        for (int var9 = 0; var9 < arg0.field1775; var9++) {
            class100 var10 = arg0.field1762[var9];
            if (var10.field1671 != 0) {
                int var11 = arg0.field1754[var9] - arg3;
                if (var11 <= arg1.field1767) {
                    int var12 = arg0.field1731[var9] - arg2;
                    if (var12 >= arg1.field1768 && var12 <= arg1.field1769) {
                        int var13 = arg0.field1733[var9] - arg4;
                        if (var13 >= arg1.field1771 && var13 <= arg1.field1751) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class100 var15 = arg1.field1762[var14];
                                if (var7[var14] == var12 && arg1.field1733[var14] == var13 && arg1.field1754[var14] == var11 && var15.field1671 != 0) {
                                    if (arg0.field1763 == null) {
                                        arg0.field1763 = new class100[arg0.field1775];
                                    }
                                    if (arg1.field1763 == null) {
                                        arg1.field1763 = new class100[var8];
                                    }
                                    class100 var16 = arg0.field1763[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1763[var9] = new class100(var10);
                                    }
                                    class100 var17 = arg1.field1763[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1763[var14] = new class100(var15);
                                    }
                                    var16.field1676 += var15.field1676;
                                    var16.field1668 += var15.field1668;
                                    var16.field1669 += var15.field1669;
                                    var16.field1671 += var15.field1671;
                                    var17.field1676 += var10.field1676;
                                    var17.field1668 += var10.field1668;
                                    var17.field1669 += var10.field1669;
                                    var17.field1671 += var10.field1671;
                                    var6++;
                                    field1772[var9] = field1774;
                                    field1742[var14] = field1774;
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
        for (int var18 = 0; var18 < arg0.field1773; var18++) {
            if (field1772[arg0.field1735[var18]] == field1774 && field1772[arg0.field1736[var18]] == field1774 && field1772[arg0.field1761[var18]] == field1774) {
                if (arg0.field1738 == null) {
                    arg0.field1738 = new byte[arg0.field1773];
                }
                arg0.field1738[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1773; var19++) {
            if (field1742[arg1.field1735[var19]] == field1774 && field1742[arg1.field1736[var19]] == field1774 && field1742[arg1.field1761[var19]] == field1774) {
                if (arg1.field1738 == null) {
                    arg1.field1738 = new byte[arg1.field1773];
                }
                arg1.field1738[var19] = 2;
            }
        }
    }

    @ObfuscatedName("ch.v(IIIII)Lde;")
    public final class109 method2097(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2093();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class109 var8 = new class109();
        var8.field1859 = new int[this.field1773];
        var8.field1900 = new int[this.field1773];
        var8.field1844 = new int[this.field1773];
        if (this.field1745 > 0 && this.field1732 != null) {
            int[] var9 = new int[this.field1745];
            for (int var10 = 0; var10 < this.field1773; var10++) {
                if (this.field1732[var10] != -1) {
                    var9[this.field1732[var10] & 0xFF]++;
                }
            }
            var8.field1891 = 0;
            for (int var11 = 0; var11 < this.field1745; var11++) {
                if (var9[var11] > 0 && this.field1746[var11] == 0) {
                    var8.field1891++;
                }
            }
            var8.field1860 = new int[var8.field1891];
            var8.field1863 = new int[var8.field1891];
            var8.field1883 = new int[var8.field1891];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1745; var13++) {
                if (var9[var13] > 0 && this.field1746[var13] == 0) {
                    var8.field1860[var12] = this.field1747[var13] & 0xFFFF;
                    var8.field1863[var12] = this.field1757[var13] & 0xFFFF;
                    var8.field1883[var12] = this.field1749[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1858 = new byte[this.field1773];
            for (int var14 = 0; var14 < this.field1773; var14++) {
                if (this.field1732[var14] == -1) {
                    var8.field1858[var14] = -1;
                } else {
                    var8.field1858[var14] = (byte) var9[this.field1732[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1773; var15++) {
            byte var16;
            if (this.field1738 == null) {
                var16 = 0;
            } else {
                var16 = this.field1738[var15];
            }
            byte var17;
            if (this.field1740 == null) {
                var17 = 0;
            } else {
                var17 = this.field1740[var15];
            }
            short var18;
            if (this.field1743 == null) {
                var18 = -1;
            } else {
                var18 = this.field1743[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1766[var15] & 0xFFFF;
                    class100 var20;
                    if (this.field1763 == null || this.field1763[this.field1735[var15]] == null) {
                        var20 = this.field1762[this.field1735[var15]];
                    } else {
                        var20 = this.field1763[this.field1735[var15]];
                    }
                    int var21 = (var20.field1669 * arg4 + var20.field1676 * arg2 + var20.field1668 * arg3) / (var20.field1671 * var7) + arg0;
                    var8.field1859[var15] = method2096(var19, var21);
                    class100 var22;
                    if (this.field1763 == null || this.field1763[this.field1736[var15]] == null) {
                        var22 = this.field1762[this.field1736[var15]];
                    } else {
                        var22 = this.field1763[this.field1736[var15]];
                    }
                    int var23 = (var22.field1669 * arg4 + var22.field1676 * arg2 + var22.field1668 * arg3) / (var22.field1671 * var7) + arg0;
                    var8.field1900[var15] = method2096(var19, var23);
                    class100 var24;
                    if (this.field1763 == null || this.field1763[this.field1761[var15]] == null) {
                        var24 = this.field1762[this.field1761[var15]];
                    } else {
                        var24 = this.field1763[this.field1761[var15]];
                    }
                    int var25 = (var24.field1669 * arg4 + var24.field1676 * arg2 + var24.field1668 * arg3) / (var24.field1671 * var7) + arg0;
                    var8.field1844[var15] = method2096(var19, var25);
                } else if (var16 == 1) {
                    class88 var26 = this.field1730[var15];
                    int var27 = (var26.field1498 * arg4 + var26.field1497 * arg3 + var26.field1496 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field1859[var15] = method2096(this.field1766[var15] & 0xFFFF, var27);
                    var8.field1844[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1859[var15] = 128;
                    var8.field1844[var15] = -1;
                } else {
                    var8.field1844[var15] = -2;
                }
            } else if (var16 == 0) {
                class100 var28;
                if (this.field1763 == null || this.field1763[this.field1735[var15]] == null) {
                    var28 = this.field1762[this.field1735[var15]];
                } else {
                    var28 = this.field1763[this.field1735[var15]];
                }
                int var29 = (var28.field1669 * arg4 + var28.field1676 * arg2 + var28.field1668 * arg3) / (var28.field1671 * var7) + arg0;
                var8.field1859[var15] = method2099(var29);
                class100 var30;
                if (this.field1763 == null || this.field1763[this.field1736[var15]] == null) {
                    var30 = this.field1762[this.field1736[var15]];
                } else {
                    var30 = this.field1763[this.field1736[var15]];
                }
                int var31 = (var30.field1669 * arg4 + var30.field1676 * arg2 + var30.field1668 * arg3) / (var30.field1671 * var7) + arg0;
                var8.field1900[var15] = method2099(var31);
                class100 var32;
                if (this.field1763 == null || this.field1763[this.field1761[var15]] == null) {
                    var32 = this.field1762[this.field1761[var15]];
                } else {
                    var32 = this.field1763[this.field1761[var15]];
                }
                int var33 = (var32.field1669 * arg4 + var32.field1676 * arg2 + var32.field1668 * arg3) / (var32.field1671 * var7) + arg0;
                var8.field1844[var15] = method2099(var33);
            } else if (var16 == 1) {
                class88 var34 = this.field1730[var15];
                int var35 = (var34.field1498 * arg4 + var34.field1497 * arg3 + var34.field1496 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field1859[var15] = method2099(var35);
                var8.field1844[var15] = -1;
            } else {
                var8.field1844[var15] = -2;
            }
        }
        this.method2082();
        var8.field1843 = this.field1775;
        var8.field1850 = this.field1731;
        var8.field1889 = this.field1754;
        var8.field1879 = this.field1733;
        var8.field1841 = this.field1773;
        var8.field1847 = this.field1735;
        var8.field1849 = this.field1736;
        var8.field1851 = this.field1761;
        var8.field1854 = this.field1759;
        var8.field1855 = this.field1740;
        var8.field1846 = this.field1744;
        var8.field1853 = this.field1741;
        var8.field1864 = this.field1760;
        var8.field1857 = this.field1743;
        return var8;
    }

    @ObfuscatedName("ch.l(II)I")
    public static final int method2096(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("ch.e(I)I")
    public static final int method2099(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
