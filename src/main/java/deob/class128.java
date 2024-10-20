package deob;

@ObfuscatedName("dk")
public class class128 extends class142 {

    @ObfuscatedName("dk.d")
    public int field1784 = 0;

    @ObfuscatedName("dk.q")
    public int[] field1765;

    @ObfuscatedName("dk.x")
    public int[] field1803;

    @ObfuscatedName("dk.y")
    public int[] field1788;

    @ObfuscatedName("dk.e")
    public int field1768 = 0;

    @ObfuscatedName("dk.f")
    public int[] field1774;

    @ObfuscatedName("dk.v")
    public int[] field1770;

    @ObfuscatedName("dk.t")
    public int[] field1766;

    @ObfuscatedName("dk.i")
    public byte[] field1807;

    @ObfuscatedName("dk.r")
    public byte[] field1773;

    @ObfuscatedName("dk.g")
    public byte[] field1791;

    @ObfuscatedName("dk.s")
    public byte[] field1767;

    @ObfuscatedName("dk.o")
    public short[] field1776;

    @ObfuscatedName("dk.p")
    public short[] field1793;

    @ObfuscatedName("dk.u")
    public byte field1778 = 0;

    @ObfuscatedName("dk.b")
    public int field1779;

    @ObfuscatedName("dk.w")
    public byte[] field1780;

    @ObfuscatedName("dk.k")
    public short[] field1777;

    @ObfuscatedName("dk.n")
    public short[] field1808;

    @ObfuscatedName("dk.c")
    public short[] field1798;

    @ObfuscatedName("dk.l")
    public short[] field1775;

    @ObfuscatedName("dk.m")
    public short[] field1772;

    @ObfuscatedName("dk.a")
    public short[] field1786;

    @ObfuscatedName("dk.h")
    public short[] field1787;

    @ObfuscatedName("dk.z")
    public short[] field1783;

    @ObfuscatedName("dk.j")
    public short[] field1789;

    @ObfuscatedName("dk.am")
    public byte[] field1790;

    @ObfuscatedName("dk.ac")
    public int[] field1781;

    @ObfuscatedName("dk.ax")
    public int[] field1801;

    @ObfuscatedName("dk.at")
    public int[][] field1785;

    @ObfuscatedName("dk.ag")
    public int[][] field1794;

    @ObfuscatedName("dk.ar")
    public class144[] field1795;

    @ObfuscatedName("dk.ae")
    public class136[] field1796;

    @ObfuscatedName("dk.ai")
    public class136[] field1797;

    @ObfuscatedName("dk.au")
    public short field1769;

    @ObfuscatedName("dk.ad")
    public short field1799;

    @ObfuscatedName("dk.ah")
    public boolean field1800 = false;

    @ObfuscatedName("dk.ao")
    public int field1782;

    @ObfuscatedName("dk.av")
    public int field1802;

    @ObfuscatedName("dk.az")
    public int field1764;

    @ObfuscatedName("dk.aq")
    public int field1804;

    @ObfuscatedName("dk.ay")
    public int field1805;

    @ObfuscatedName("dk.an")
    public static int[] field1806 = new int[10000];

    @ObfuscatedName("dk.af")
    public static int[] field1792 = new int[10000];

    @ObfuscatedName("dk.aa")
    public static int field1771 = 0;

    @ObfuscatedName("dk.ak")
    public static int[] field1809 = class137.field1997;

    @ObfuscatedName("dk.as")
    public static int[] field1810 = class137.field1992;

    public class128() {
    }

    @ObfuscatedName("dk.d(Lim;II)Ldk;")
    public static class128 method2238(class236 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3750(arg1, arg2);
        return var3 == null ? null : new class128(var3);
    }

    public class128(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2178(arg0);
        } else {
            this.method2245(arg0);
        }
    }

    @ObfuscatedName("dk.q([B)V")
    public void method2178(byte[] arg0) {
        class174 var2 = new class174(arg0);
        class174 var3 = new class174(arg0);
        class174 var4 = new class174(arg0);
        class174 var5 = new class174(arg0);
        class174 var6 = new class174(arg0);
        class174 var7 = new class174(arg0);
        class174 var8 = new class174(arg0);
        var2.field2364 = arg0.length - 23;
        int var9 = var2.method2916();
        int var10 = var2.method2916();
        int var11 = var2.method2921();
        int var12 = var2.method2921();
        int var13 = var2.method2921();
        int var14 = var2.method2921();
        int var15 = var2.method2921();
        int var16 = var2.method2921();
        int var17 = var2.method2921();
        int var18 = var2.method2916();
        int var19 = var2.method2916();
        int var20 = var2.method2916();
        int var21 = var2.method2916();
        int var22 = var2.method2916();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1780 = new byte[var11];
            var2.field2364 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1780[var26] = var2.method3082();
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
        this.field1784 = var9;
        this.field1768 = var10;
        this.field1779 = var11;
        this.field1765 = new int[var9];
        this.field1803 = new int[var9];
        this.field1788 = new int[var9];
        this.field1774 = new int[var10];
        this.field1770 = new int[var10];
        this.field1766 = new int[var10];
        if (var17 == 1) {
            this.field1781 = new int[var9];
        }
        if (var12 == 1) {
            this.field1807 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1773 = new byte[var10];
        } else {
            this.field1778 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1791 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1801 = new int[var10];
        }
        if (var16 == 1) {
            this.field1793 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1767 = new byte[var10];
        }
        this.field1776 = new short[var10];
        if (var11 > 0) {
            this.field1777 = new short[var11];
            this.field1808 = new short[var11];
            this.field1798 = new short[var11];
            if (var24 > 0) {
                this.field1775 = new short[var24];
                this.field1772 = new short[var24];
                this.field1786 = new short[var24];
                this.field1787 = new short[var24];
                this.field1790 = new byte[var24];
                this.field1783 = new short[var24];
            }
            if (var25 > 0) {
                this.field1789 = new short[var25];
            }
        }
        var2.field2364 = var11;
        var3.field2364 = var44;
        var4.field2364 = var46;
        var5.field2364 = var48;
        var6.field2364 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method2921();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method2926();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method2926();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method2926();
            }
            this.field1765[var67] = var64 + var69;
            this.field1803[var67] = var65 + var70;
            this.field1788[var67] = var66 + var71;
            var64 = this.field1765[var67];
            var65 = this.field1803[var67];
            var66 = this.field1788[var67];
            if (var17 == 1) {
                this.field1781[var67] = var6.method2921();
            }
        }
        var2.field2364 = var42;
        var3.field2364 = var31;
        var4.field2364 = var34;
        var5.field2364 = var37;
        var6.field2364 = var35;
        var7.field2364 = var40;
        var8.field2364 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1776[var72] = (short) var2.method2916();
            if (var12 == 1) {
                this.field1807[var72] = var3.method3082();
            }
            if (var13 == 255) {
                this.field1773[var72] = var4.method3082();
            }
            if (var14 == 1) {
                this.field1791[var72] = var5.method3082();
            }
            if (var15 == 1) {
                this.field1801[var72] = var6.method2921();
            }
            if (var16 == 1) {
                this.field1793[var72] = (short) (var7.method2916() - 1);
            }
            if (this.field1767 != null && this.field1793[var72] != -1) {
                this.field1767[var72] = (byte) (var8.method2921() - 1);
            }
        }
        var2.field2364 = var33;
        var3.field2364 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method2921();
            if (var78 == 1) {
                var73 = var2.method2926() + var76;
                var74 = var2.method2926() + var73;
                var75 = var2.method2926() + var74;
                var76 = var75;
                this.field1774[var77] = var73;
                this.field1770[var77] = var74;
                this.field1766[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method2926() + var76;
                var76 = var75;
                this.field1774[var77] = var73;
                this.field1770[var77] = var74;
                this.field1766[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method2926() + var76;
                var76 = var75;
                this.field1774[var77] = var73;
                this.field1770[var77] = var74;
                this.field1766[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method2926() + var76;
                var76 = var75;
                this.field1774[var77] = var73;
                this.field1770[var77] = var81;
                this.field1766[var77] = var75;
            }
        }
        var2.field2364 = var50;
        var3.field2364 = var52;
        var4.field2364 = var54;
        var5.field2364 = var56;
        var6.field2364 = var58;
        var7.field2364 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1780[var82] & 0xFF;
            if (var83 == 0) {
                this.field1777[var82] = (short) var2.method2916();
                this.field1808[var82] = (short) var2.method2916();
                this.field1798[var82] = (short) var2.method2916();
            }
            if (var83 == 1) {
                this.field1777[var82] = (short) var3.method2916();
                this.field1808[var82] = (short) var3.method2916();
                this.field1798[var82] = (short) var3.method2916();
                this.field1775[var82] = (short) var4.method2916();
                this.field1772[var82] = (short) var4.method2916();
                this.field1786[var82] = (short) var4.method2916();
                this.field1787[var82] = (short) var5.method2916();
                this.field1790[var82] = var6.method3082();
                this.field1783[var82] = (short) var7.method2916();
            }
            if (var83 == 2) {
                this.field1777[var82] = (short) var3.method2916();
                this.field1808[var82] = (short) var3.method2916();
                this.field1798[var82] = (short) var3.method2916();
                this.field1775[var82] = (short) var4.method2916();
                this.field1772[var82] = (short) var4.method2916();
                this.field1786[var82] = (short) var4.method2916();
                this.field1787[var82] = (short) var5.method2916();
                this.field1790[var82] = var6.method3082();
                this.field1783[var82] = (short) var7.method2916();
                this.field1789[var82] = (short) var7.method2916();
            }
            if (var83 == 3) {
                this.field1777[var82] = (short) var3.method2916();
                this.field1808[var82] = (short) var3.method2916();
                this.field1798[var82] = (short) var3.method2916();
                this.field1775[var82] = (short) var4.method2916();
                this.field1772[var82] = (short) var4.method2916();
                this.field1786[var82] = (short) var4.method2916();
                this.field1787[var82] = (short) var5.method2916();
                this.field1790[var82] = var6.method3082();
                this.field1783[var82] = (short) var7.method2916();
            }
        }
        var2.field2364 = var62;
        int var84 = var2.method2921();
        if (var84 == 0) {
            return;
        }
        new class141();
        var2.method2916();
        var2.method2916();
        var2.method2916();
        var2.method2935();
    }

    @ObfuscatedName("dk.y([B)V")
    public void method2245(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class174 var4 = new class174(arg0);
        class174 var5 = new class174(arg0);
        class174 var6 = new class174(arg0);
        class174 var7 = new class174(arg0);
        class174 var8 = new class174(arg0);
        var4.field2364 = arg0.length - 18;
        int var9 = var4.method2916();
        int var10 = var4.method2916();
        int var11 = var4.method2921();
        int var12 = var4.method2921();
        int var13 = var4.method2921();
        int var14 = var4.method2921();
        int var15 = var4.method2921();
        int var16 = var4.method2921();
        int var17 = var4.method2916();
        int var18 = var4.method2916();
        int var19 = var4.method2916();
        int var20 = var4.method2916();
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
        this.field1784 = var9;
        this.field1768 = var10;
        this.field1779 = var11;
        this.field1765 = new int[var9];
        this.field1803 = new int[var9];
        this.field1788 = new int[var9];
        this.field1774 = new int[var10];
        this.field1770 = new int[var10];
        this.field1766 = new int[var10];
        if (var11 > 0) {
            this.field1780 = new byte[var11];
            this.field1777 = new short[var11];
            this.field1808 = new short[var11];
            this.field1798 = new short[var11];
        }
        if (var16 == 1) {
            this.field1781 = new int[var9];
        }
        if (var12 == 1) {
            this.field1807 = new byte[var10];
            this.field1767 = new byte[var10];
            this.field1793 = new short[var10];
        }
        if (var13 == 255) {
            this.field1773 = new byte[var10];
        } else {
            this.field1778 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1791 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1801 = new int[var10];
        }
        this.field1776 = new short[var10];
        var4.field2364 = var21;
        var5.field2364 = var36;
        var6.field2364 = var38;
        var7.field2364 = var40;
        var8.field2364 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2921();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2926();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2926();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2926();
            }
            this.field1765[var46] = var43 + var48;
            this.field1803[var46] = var44 + var49;
            this.field1788[var46] = var45 + var50;
            var43 = this.field1765[var46];
            var44 = this.field1803[var46];
            var45 = this.field1788[var46];
            if (var16 == 1) {
                this.field1781[var46] = var8.method2921();
            }
        }
        var4.field2364 = var32;
        var5.field2364 = var28;
        var6.field2364 = var26;
        var7.field2364 = var30;
        var8.field2364 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1776[var51] = (short) var4.method2916();
            if (var12 == 1) {
                int var52 = var5.method2921();
                if ((var52 & 0x1) == 1) {
                    this.field1807[var51] = 1;
                    var2 = true;
                } else {
                    this.field1807[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1767[var51] = (byte) (var52 >> 2);
                    this.field1793[var51] = this.field1776[var51];
                    this.field1776[var51] = 127;
                    if (this.field1793[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1767[var51] = -1;
                    this.field1793[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1773[var51] = var6.method3082();
            }
            if (var14 == 1) {
                this.field1791[var51] = var7.method3082();
            }
            if (var15 == 1) {
                this.field1801[var51] = var8.method2921();
            }
        }
        var4.field2364 = var25;
        var5.field2364 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2921();
            if (var58 == 1) {
                var53 = var4.method2926() + var56;
                var54 = var4.method2926() + var53;
                var55 = var4.method2926() + var54;
                var56 = var55;
                this.field1774[var57] = var53;
                this.field1770[var57] = var54;
                this.field1766[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2926() + var56;
                var56 = var55;
                this.field1774[var57] = var53;
                this.field1770[var57] = var54;
                this.field1766[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2926() + var56;
                var56 = var55;
                this.field1774[var57] = var53;
                this.field1770[var57] = var54;
                this.field1766[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2926() + var56;
                var56 = var55;
                this.field1774[var57] = var53;
                this.field1770[var57] = var61;
                this.field1766[var57] = var55;
            }
        }
        var4.field2364 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1780[var62] = 0;
            this.field1777[var62] = (short) var4.method2916();
            this.field1808[var62] = (short) var4.method2916();
            this.field1798[var62] = (short) var4.method2916();
        }
        if (this.field1767 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1767[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1777[var65] & 0xFFFF) == this.field1774[var64] && (this.field1808[var65] & 0xFFFF) == this.field1770[var64] && (this.field1798[var65] & 0xFFFF) == this.field1766[var64]) {
                        this.field1767[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1767 = null;
            }
        }
        if (!var3) {
            this.field1793 = null;
        }
        if (!var2) {
            this.field1807 = null;
        }
    }

    public class128(class128[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1784 = 0;
        this.field1768 = 0;
        this.field1779 = 0;
        this.field1778 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class128 var10 = arg0[var9];
            if (var10 != null) {
                this.field1784 += var10.field1784;
                this.field1768 += var10.field1768;
                this.field1779 += var10.field1779;
                if (var10.field1773 == null) {
                    if (this.field1778 == -1) {
                        this.field1778 = var10.field1778;
                    }
                    if (this.field1778 != var10.field1778) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1807 != null;
                var5 |= var10.field1791 != null;
                var6 |= var10.field1801 != null;
                var7 |= var10.field1793 != null;
                var8 |= var10.field1767 != null;
            }
        }
        this.field1765 = new int[this.field1784];
        this.field1803 = new int[this.field1784];
        this.field1788 = new int[this.field1784];
        this.field1781 = new int[this.field1784];
        this.field1774 = new int[this.field1768];
        this.field1770 = new int[this.field1768];
        this.field1766 = new int[this.field1768];
        if (var3) {
            this.field1807 = new byte[this.field1768];
        }
        if (var4) {
            this.field1773 = new byte[this.field1768];
        }
        if (var5) {
            this.field1791 = new byte[this.field1768];
        }
        if (var6) {
            this.field1801 = new int[this.field1768];
        }
        if (var7) {
            this.field1793 = new short[this.field1768];
        }
        if (var8) {
            this.field1767 = new byte[this.field1768];
        }
        this.field1776 = new short[this.field1768];
        if (this.field1779 > 0) {
            this.field1780 = new byte[this.field1779];
            this.field1777 = new short[this.field1779];
            this.field1808 = new short[this.field1779];
            this.field1798 = new short[this.field1779];
            this.field1775 = new short[this.field1779];
            this.field1772 = new short[this.field1779];
            this.field1786 = new short[this.field1779];
            this.field1787 = new short[this.field1779];
            this.field1790 = new byte[this.field1779];
            this.field1783 = new short[this.field1779];
            this.field1789 = new short[this.field1779];
        }
        this.field1784 = 0;
        this.field1768 = 0;
        this.field1779 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class128 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1768; var13++) {
                    if (var3 && var12.field1807 != null) {
                        this.field1807[this.field1768] = var12.field1807[var13];
                    }
                    if (var4) {
                        if (var12.field1773 == null) {
                            this.field1773[this.field1768] = var12.field1778;
                        } else {
                            this.field1773[this.field1768] = var12.field1773[var13];
                        }
                    }
                    if (var5 && var12.field1791 != null) {
                        this.field1791[this.field1768] = var12.field1791[var13];
                    }
                    if (var6 && var12.field1801 != null) {
                        this.field1801[this.field1768] = var12.field1801[var13];
                    }
                    if (var7) {
                        if (var12.field1793 == null) {
                            this.field1793[this.field1768] = -1;
                        } else {
                            this.field1793[this.field1768] = var12.field1793[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1767 == null || var12.field1767[var13] == -1) {
                            this.field1767[this.field1768] = -1;
                        } else {
                            this.field1767[this.field1768] = (byte) (var12.field1767[var13] + this.field1779);
                        }
                    }
                    this.field1776[this.field1768] = var12.field1776[var13];
                    this.field1774[this.field1768] = this.method2180(var12, var12.field1774[var13]);
                    this.field1770[this.field1768] = this.method2180(var12, var12.field1770[var13]);
                    this.field1766[this.field1768] = this.method2180(var12, var12.field1766[var13]);
                    this.field1768++;
                }
                for (int var14 = 0; var14 < var12.field1779; var14++) {
                    byte var15 = this.field1780[this.field1779] = var12.field1780[var14];
                    if (var15 == 0) {
                        this.field1777[this.field1779] = (short) this.method2180(var12, var12.field1777[var14]);
                        this.field1808[this.field1779] = (short) this.method2180(var12, var12.field1808[var14]);
                        this.field1798[this.field1779] = (short) this.method2180(var12, var12.field1798[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1777[this.field1779] = var12.field1777[var14];
                        this.field1808[this.field1779] = var12.field1808[var14];
                        this.field1798[this.field1779] = var12.field1798[var14];
                        this.field1775[this.field1779] = var12.field1775[var14];
                        this.field1772[this.field1779] = var12.field1772[var14];
                        this.field1786[this.field1779] = var12.field1786[var14];
                        this.field1787[this.field1779] = var12.field1787[var14];
                        this.field1790[this.field1779] = var12.field1790[var14];
                        this.field1783[this.field1779] = var12.field1783[var14];
                    }
                    if (var15 == 2) {
                        this.field1789[this.field1779] = var12.field1789[var14];
                    }
                    this.field1779++;
                }
            }
        }
    }

    @ObfuscatedName("dk.e(Ldk;I)I")
    public final int method2180(class128 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1765[arg1];
        int var5 = arg0.field1803[arg1];
        int var6 = arg0.field1788[arg1];
        for (int var7 = 0; var7 < this.field1784; var7++) {
            if (this.field1765[var7] == var4 && this.field1803[var7] == var5 && this.field1788[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1765[this.field1784] = var4;
            this.field1803[this.field1784] = var5;
            this.field1788[this.field1784] = var6;
            if (arg0.field1781 != null) {
                this.field1781[this.field1784] = arg0.field1781[arg1];
            }
            var3 = this.field1784++;
        }
        return var3;
    }

    public class128(class128 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1784 = arg0.field1784;
        this.field1768 = arg0.field1768;
        this.field1779 = arg0.field1779;
        if (arg1) {
            this.field1765 = arg0.field1765;
            this.field1803 = arg0.field1803;
            this.field1788 = arg0.field1788;
        } else {
            this.field1765 = new int[this.field1784];
            this.field1803 = new int[this.field1784];
            this.field1788 = new int[this.field1784];
            for (int var6 = 0; var6 < this.field1784; var6++) {
                this.field1765[var6] = arg0.field1765[var6];
                this.field1803[var6] = arg0.field1803[var6];
                this.field1788[var6] = arg0.field1788[var6];
            }
        }
        if (arg2) {
            this.field1776 = arg0.field1776;
        } else {
            this.field1776 = new short[this.field1768];
            for (int var7 = 0; var7 < this.field1768; var7++) {
                this.field1776[var7] = arg0.field1776[var7];
            }
        }
        if (arg3 || arg0.field1793 == null) {
            this.field1793 = arg0.field1793;
        } else {
            this.field1793 = new short[this.field1768];
            for (int var8 = 0; var8 < this.field1768; var8++) {
                this.field1793[var8] = arg0.field1793[var8];
            }
        }
        if (arg4) {
            this.field1791 = arg0.field1791;
        } else {
            this.field1791 = new byte[this.field1768];
            if (arg0.field1791 == null) {
                for (int var9 = 0; var9 < this.field1768; var9++) {
                    this.field1791[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1768; var10++) {
                    this.field1791[var10] = arg0.field1791[var10];
                }
            }
        }
        this.field1774 = arg0.field1774;
        this.field1770 = arg0.field1770;
        this.field1766 = arg0.field1766;
        this.field1807 = arg0.field1807;
        this.field1773 = arg0.field1773;
        this.field1767 = arg0.field1767;
        this.field1778 = arg0.field1778;
        this.field1780 = arg0.field1780;
        this.field1777 = arg0.field1777;
        this.field1808 = arg0.field1808;
        this.field1798 = arg0.field1798;
        this.field1775 = arg0.field1775;
        this.field1772 = arg0.field1772;
        this.field1786 = arg0.field1786;
        this.field1787 = arg0.field1787;
        this.field1790 = arg0.field1790;
        this.field1783 = arg0.field1783;
        this.field1789 = arg0.field1789;
        this.field1781 = arg0.field1781;
        this.field1801 = arg0.field1801;
        this.field1785 = arg0.field1785;
        this.field1794 = arg0.field1794;
        this.field1796 = arg0.field1796;
        this.field1795 = arg0.field1795;
        this.field1797 = arg0.field1797;
        this.field1769 = arg0.field1769;
        this.field1799 = arg0.field1799;
    }

    @ObfuscatedName("dk.f()Ldk;")
    public class128 method2181() {
        class128 var1 = new class128();
        if (this.field1807 != null) {
            var1.field1807 = new byte[this.field1768];
            for (int var2 = 0; var2 < this.field1768; var2++) {
                var1.field1807[var2] = this.field1807[var2];
            }
        }
        var1.field1784 = this.field1784;
        var1.field1768 = this.field1768;
        var1.field1779 = this.field1779;
        var1.field1765 = this.field1765;
        var1.field1803 = this.field1803;
        var1.field1788 = this.field1788;
        var1.field1774 = this.field1774;
        var1.field1770 = this.field1770;
        var1.field1766 = this.field1766;
        var1.field1773 = this.field1773;
        var1.field1791 = this.field1791;
        var1.field1767 = this.field1767;
        var1.field1776 = this.field1776;
        var1.field1793 = this.field1793;
        var1.field1778 = this.field1778;
        var1.field1780 = this.field1780;
        var1.field1777 = this.field1777;
        var1.field1808 = this.field1808;
        var1.field1798 = this.field1798;
        var1.field1775 = this.field1775;
        var1.field1772 = this.field1772;
        var1.field1786 = this.field1786;
        var1.field1787 = this.field1787;
        var1.field1790 = this.field1790;
        var1.field1783 = this.field1783;
        var1.field1789 = this.field1789;
        var1.field1781 = this.field1781;
        var1.field1801 = this.field1801;
        var1.field1785 = this.field1785;
        var1.field1794 = this.field1794;
        var1.field1796 = this.field1796;
        var1.field1795 = this.field1795;
        var1.field1769 = this.field1769;
        var1.field1799 = this.field1799;
        return var1;
    }

    @ObfuscatedName("dk.v([[IIIIZI)Ldk;")
    public class128 method2208(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2197();
        int var7 = this.field1802 + arg1;
        int var8 = this.field1764 + arg1;
        int var9 = this.field1805 + arg3;
        int var10 = this.field1804 + arg3;
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
        class128 var15;
        if (arg4) {
            var15 = new class128();
            var15.field1784 = this.field1784;
            var15.field1768 = this.field1768;
            var15.field1779 = this.field1779;
            var15.field1765 = this.field1765;
            var15.field1788 = this.field1788;
            var15.field1774 = this.field1774;
            var15.field1770 = this.field1770;
            var15.field1766 = this.field1766;
            var15.field1807 = this.field1807;
            var15.field1773 = this.field1773;
            var15.field1791 = this.field1791;
            var15.field1767 = this.field1767;
            var15.field1776 = this.field1776;
            var15.field1793 = this.field1793;
            var15.field1778 = this.field1778;
            var15.field1780 = this.field1780;
            var15.field1777 = this.field1777;
            var15.field1808 = this.field1808;
            var15.field1798 = this.field1798;
            var15.field1775 = this.field1775;
            var15.field1772 = this.field1772;
            var15.field1786 = this.field1786;
            var15.field1787 = this.field1787;
            var15.field1790 = this.field1790;
            var15.field1783 = this.field1783;
            var15.field1789 = this.field1789;
            var15.field1781 = this.field1781;
            var15.field1801 = this.field1801;
            var15.field1785 = this.field1785;
            var15.field1794 = this.field1794;
            var15.field1769 = this.field1769;
            var15.field1799 = this.field1799;
            var15.field1803 = new int[var15.field1784];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1784; var16++) {
                int var17 = this.field1765[var16] + arg1;
                int var18 = this.field1788[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1803[var16] = this.field1803[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1784; var26++) {
                int var27 = (-this.field1803[var26] << 16) / this.field2088;
                if (var27 < arg5) {
                    int var28 = this.field1765[var26] + arg1;
                    int var29 = this.field1788[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1803[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1803[var26];
                }
            }
        }
        var15.method2194();
        return var15;
    }

    @ObfuscatedName("dk.t()V")
    public void method2220() {
        int var10002;
        if (this.field1781 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1784; var3++) {
                int var4 = this.field1781[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1785 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1785[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1784) {
                int var7 = this.field1781[var6];
                this.field1785[var7][var1[var7]++] = var6++;
            }
            this.field1781 = null;
        }
        if (this.field1801 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1768; var10++) {
            int var11 = this.field1801[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1794 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1794[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1768) {
            int var14 = this.field1801[var13];
            this.field1794[var14][var8[var14]++] = var13++;
        }
        this.field1801 = null;
    }

    @ObfuscatedName("dk.i()V")
    public void method2177() {
        for (int var1 = 0; var1 < this.field1784; var1++) {
            int var2 = this.field1765[var1];
            this.field1765[var1] = this.field1788[var1];
            this.field1788[var1] = -var2;
        }
        this.method2194();
    }

    @ObfuscatedName("dk.r()V")
    public void method2183() {
        for (int var1 = 0; var1 < this.field1784; var1++) {
            this.field1765[var1] = -this.field1765[var1];
            this.field1788[var1] = -this.field1788[var1];
        }
        this.method2194();
    }

    @ObfuscatedName("dk.g()V")
    public void method2186() {
        for (int var1 = 0; var1 < this.field1784; var1++) {
            int var2 = this.field1788[var1];
            this.field1788[var1] = this.field1765[var1];
            this.field1765[var1] = -var2;
        }
        this.method2194();
    }

    @ObfuscatedName("dk.o(I)V")
    public void method2187(int arg0) {
        int var2 = field1809[arg0];
        int var3 = field1810[arg0];
        for (int var4 = 0; var4 < this.field1784; var4++) {
            int var5 = this.field1788[var4] * var2 + this.field1765[var4] * var3 >> 16;
            this.field1788[var4] = this.field1788[var4] * var3 - this.field1765[var4] * var2 >> 16;
            this.field1765[var4] = var5;
        }
        this.method2194();
    }

    @ObfuscatedName("dk.p(III)V")
    public void method2188(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1784; var4++) {
            this.field1765[var4] += arg0;
            this.field1803[var4] += arg1;
            this.field1788[var4] += arg2;
        }
        this.method2194();
    }

    @ObfuscatedName("dk.u(SS)V")
    public void method2226(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1768; var3++) {
            if (this.field1776[var3] == arg0) {
                this.field1776[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dk.b(SS)V")
    public void method2190(short arg0, short arg1) {
        if (this.field1793 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1768; var3++) {
            if (this.field1793[var3] == arg0) {
                this.field1793[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dk.w()V")
    public void method2191() {
        for (int var1 = 0; var1 < this.field1784; var1++) {
            this.field1788[var1] = -this.field1788[var1];
        }
        for (int var2 = 0; var2 < this.field1768; var2++) {
            int var3 = this.field1774[var2];
            this.field1774[var2] = this.field1766[var2];
            this.field1766[var2] = var3;
        }
        this.method2194();
    }

    @ObfuscatedName("dk.k(III)V")
    public void method2192(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1784; var4++) {
            this.field1765[var4] = this.field1765[var4] * arg0 / 128;
            this.field1803[var4] = this.field1803[var4] * arg1 / 128;
            this.field1788[var4] = this.field1788[var4] * arg2 / 128;
        }
        this.method2194();
    }

    @ObfuscatedName("dk.c()V")
    public void method2200() {
        if (this.field1796 != null) {
            return;
        }
        this.field1796 = new class136[this.field1784];
        for (int var1 = 0; var1 < this.field1784; var1++) {
            this.field1796[var1] = new class136();
        }
        for (int var2 = 0; var2 < this.field1768; var2++) {
            int var3 = this.field1774[var2];
            int var4 = this.field1770[var2];
            int var5 = this.field1766[var2];
            int var6 = this.field1765[var4] - this.field1765[var3];
            int var7 = this.field1803[var4] - this.field1803[var3];
            int var8 = this.field1788[var4] - this.field1788[var3];
            int var9 = this.field1765[var5] - this.field1765[var3];
            int var10 = this.field1803[var5] - this.field1803[var3];
            int var11 = this.field1788[var5] - this.field1788[var3];
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
            if (this.field1807 == null) {
                var19 = 0;
            } else {
                var19 = this.field1807[var2];
            }
            if (var19 == 0) {
                class136 var20 = this.field1796[var3];
                var20.field1976 += var16;
                var20.field1975 += var17;
                var20.field1977 += var18;
                var20.field1978++;
                class136 var21 = this.field1796[var4];
                var21.field1976 += var16;
                var21.field1975 += var17;
                var21.field1977 += var18;
                var21.field1978++;
                class136 var22 = this.field1796[var5];
                var22.field1976 += var16;
                var22.field1975 += var17;
                var22.field1977 += var18;
                var22.field1978++;
            } else if (var19 == 1) {
                if (this.field1795 == null) {
                    this.field1795 = new class144[this.field1768];
                }
                class144 var23 = this.field1795[var2] = new class144();
                var23.field2111 = var16;
                var23.field2106 = var17;
                var23.field2107 = var18;
            }
        }
    }

    @ObfuscatedName("dk.h()V")
    public void method2194() {
        this.field1796 = null;
        this.field1797 = null;
        this.field1795 = null;
        this.field1800 = false;
    }

    @ObfuscatedName("dk.z()V")
    public void method2197() {
        if (this.field1800) {
            return;
        }
        this.field2088 = 0;
        this.field1782 = 0;
        this.field1802 = 999999;
        this.field1764 = -999999;
        this.field1804 = -99999;
        this.field1805 = 99999;
        for (int var1 = 0; var1 < this.field1784; var1++) {
            int var2 = this.field1765[var1];
            int var3 = this.field1803[var1];
            int var4 = this.field1788[var1];
            if (var2 < this.field1802) {
                this.field1802 = var2;
            }
            if (var2 > this.field1764) {
                this.field1764 = var2;
            }
            if (var4 < this.field1805) {
                this.field1805 = var4;
            }
            if (var4 > this.field1804) {
                this.field1804 = var4;
            }
            if (-var3 > this.field2088) {
                this.field2088 = -var3;
            }
            if (var3 > this.field1782) {
                this.field1782 = var3;
            }
        }
        this.field1800 = true;
    }

    @ObfuscatedName("dk.j(Ldk;Ldk;IIIZ)V")
    public static void method2196(class128 arg0, class128 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2197();
        arg0.method2200();
        arg1.method2197();
        arg1.method2200();
        field1771++;
        int var6 = 0;
        int[] var7 = arg1.field1765;
        int var8 = arg1.field1784;
        for (int var9 = 0; var9 < arg0.field1784; var9++) {
            class136 var10 = arg0.field1796[var9];
            if (var10.field1978 != 0) {
                int var11 = arg0.field1803[var9] - arg3;
                if (var11 <= arg1.field1782) {
                    int var12 = arg0.field1765[var9] - arg2;
                    if (var12 >= arg1.field1802 && var12 <= arg1.field1764) {
                        int var13 = arg0.field1788[var9] - arg4;
                        if (var13 >= arg1.field1805 && var13 <= arg1.field1804) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class136 var15 = arg1.field1796[var14];
                                if (var7[var14] == var12 && arg1.field1788[var14] == var13 && arg1.field1803[var14] == var11 && var15.field1978 != 0) {
                                    if (arg0.field1797 == null) {
                                        arg0.field1797 = new class136[arg0.field1784];
                                    }
                                    if (arg1.field1797 == null) {
                                        arg1.field1797 = new class136[var8];
                                    }
                                    class136 var16 = arg0.field1797[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1797[var9] = new class136(var10);
                                    }
                                    class136 var17 = arg1.field1797[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1797[var14] = new class136(var15);
                                    }
                                    var16.field1976 += var15.field1976;
                                    var16.field1975 += var15.field1975;
                                    var16.field1977 += var15.field1977;
                                    var16.field1978 += var15.field1978;
                                    var17.field1976 += var10.field1976;
                                    var17.field1975 += var10.field1975;
                                    var17.field1977 += var10.field1977;
                                    var17.field1978 += var10.field1978;
                                    var6++;
                                    field1806[var9] = field1771;
                                    field1792[var14] = field1771;
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
        for (int var18 = 0; var18 < arg0.field1768; var18++) {
            if (field1806[arg0.field1774[var18]] == field1771 && field1806[arg0.field1770[var18]] == field1771 && field1806[arg0.field1766[var18]] == field1771) {
                if (arg0.field1807 == null) {
                    arg0.field1807 = new byte[arg0.field1768];
                }
                arg0.field1807[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1768; var19++) {
            if (field1792[arg1.field1774[var19]] == field1771 && field1792[arg1.field1770[var19]] == field1771 && field1792[arg1.field1766[var19]] == field1771) {
                if (arg1.field1807 == null) {
                    arg1.field1807 = new byte[arg1.field1768];
                }
                arg1.field1807[var19] = 2;
            }
        }
    }

    @ObfuscatedName("dk.am(IIIII)Lev;")
    public final class134 method2246(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2200();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class134 var8 = new class134();
        var8.field1935 = new int[this.field1768];
        var8.field1944 = new int[this.field1768];
        var8.field1923 = new int[this.field1768];
        if (this.field1779 > 0 && this.field1767 != null) {
            int[] var9 = new int[this.field1779];
            for (int var10 = 0; var10 < this.field1768; var10++) {
                if (this.field1767[var10] != -1) {
                    var9[this.field1767[var10] & 0xFF]++;
                }
            }
            var8.field1931 = 0;
            for (int var11 = 0; var11 < this.field1779; var11++) {
                if (var9[var11] > 0 && this.field1780[var11] == 0) {
                    var8.field1931++;
                }
            }
            var8.field1914 = new int[var8.field1931];
            var8.field1915 = new int[var8.field1931];
            var8.field1916 = new int[var8.field1931];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1779; var13++) {
                if (var9[var13] > 0 && this.field1780[var13] == 0) {
                    var8.field1914[var12] = this.field1777[var13] & 0xFFFF;
                    var8.field1915[var12] = this.field1808[var13] & 0xFFFF;
                    var8.field1916[var12] = this.field1798[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1925 = new byte[this.field1768];
            for (int var14 = 0; var14 < this.field1768; var14++) {
                if (this.field1767[var14] == -1) {
                    var8.field1925[var14] = -1;
                } else {
                    var8.field1925[var14] = (byte) var9[this.field1767[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1768; var15++) {
            byte var16;
            if (this.field1807 == null) {
                var16 = 0;
            } else {
                var16 = this.field1807[var15];
            }
            byte var17;
            if (this.field1791 == null) {
                var17 = 0;
            } else {
                var17 = this.field1791[var15];
            }
            short var18;
            if (this.field1793 == null) {
                var18 = -1;
            } else {
                var18 = this.field1793[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1776[var15] & 0xFFFF;
                    class136 var20;
                    if (this.field1797 == null || this.field1797[this.field1774[var15]] == null) {
                        var20 = this.field1796[this.field1774[var15]];
                    } else {
                        var20 = this.field1797[this.field1774[var15]];
                    }
                    int var21 = (var20.field1977 * arg4 + var20.field1976 * arg2 + var20.field1975 * arg3) / (var20.field1978 * var7) + arg0;
                    var8.field1935[var15] = method2198(var19, var21);
                    class136 var22;
                    if (this.field1797 == null || this.field1797[this.field1770[var15]] == null) {
                        var22 = this.field1796[this.field1770[var15]];
                    } else {
                        var22 = this.field1797[this.field1770[var15]];
                    }
                    int var23 = (var22.field1977 * arg4 + var22.field1976 * arg2 + var22.field1975 * arg3) / (var22.field1978 * var7) + arg0;
                    var8.field1944[var15] = method2198(var19, var23);
                    class136 var24;
                    if (this.field1797 == null || this.field1797[this.field1766[var15]] == null) {
                        var24 = this.field1796[this.field1766[var15]];
                    } else {
                        var24 = this.field1797[this.field1766[var15]];
                    }
                    int var25 = (var24.field1977 * arg4 + var24.field1976 * arg2 + var24.field1975 * arg3) / (var24.field1978 * var7) + arg0;
                    var8.field1923[var15] = method2198(var19, var25);
                } else if (var16 == 1) {
                    class144 var26 = this.field1795[var15];
                    int var27 = (var26.field2107 * arg4 + var26.field2111 * arg2 + var26.field2106 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1935[var15] = method2198(this.field1776[var15] & 0xFFFF, var27);
                    var8.field1923[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1935[var15] = 128;
                    var8.field1923[var15] = -1;
                } else {
                    var8.field1923[var15] = -2;
                }
            } else if (var16 == 0) {
                class136 var28;
                if (this.field1797 == null || this.field1797[this.field1774[var15]] == null) {
                    var28 = this.field1796[this.field1774[var15]];
                } else {
                    var28 = this.field1797[this.field1774[var15]];
                }
                int var29 = (var28.field1977 * arg4 + var28.field1976 * arg2 + var28.field1975 * arg3) / (var28.field1978 * var7) + arg0;
                var8.field1935[var15] = method2199(var29);
                class136 var30;
                if (this.field1797 == null || this.field1797[this.field1770[var15]] == null) {
                    var30 = this.field1796[this.field1770[var15]];
                } else {
                    var30 = this.field1797[this.field1770[var15]];
                }
                int var31 = (var30.field1977 * arg4 + var30.field1976 * arg2 + var30.field1975 * arg3) / (var30.field1978 * var7) + arg0;
                var8.field1944[var15] = method2199(var31);
                class136 var32;
                if (this.field1797 == null || this.field1797[this.field1766[var15]] == null) {
                    var32 = this.field1796[this.field1766[var15]];
                } else {
                    var32 = this.field1797[this.field1766[var15]];
                }
                int var33 = (var32.field1977 * arg4 + var32.field1976 * arg2 + var32.field1975 * arg3) / (var32.field1978 * var7) + arg0;
                var8.field1923[var15] = method2199(var33);
            } else if (var16 == 1) {
                class144 var34 = this.field1795[var15];
                int var35 = (var34.field2107 * arg4 + var34.field2111 * arg2 + var34.field2106 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1935[var15] = method2199(var35);
                var8.field1923[var15] = -1;
            } else {
                var8.field1923[var15] = -2;
            }
        }
        this.method2220();
        var8.field1897 = this.field1784;
        var8.field1898 = this.field1765;
        var8.field1899 = this.field1803;
        var8.field1900 = this.field1788;
        var8.field1901 = this.field1768;
        var8.field1953 = this.field1774;
        var8.field1913 = this.field1770;
        var8.field1904 = this.field1766;
        var8.field1908 = this.field1773;
        var8.field1909 = this.field1791;
        var8.field1912 = this.field1778;
        var8.field1917 = this.field1785;
        var8.field1910 = this.field1794;
        var8.field1911 = this.field1793;
        return var8;
    }

    @ObfuscatedName("dk.ac(II)I")
    public static final int method2198(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("dk.ax(I)I")
    public static final int method2199(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
