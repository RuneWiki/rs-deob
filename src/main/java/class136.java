import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class136 extends class441 {

    @OriginalMember(owner = "client!gb", name = "Q", descriptor = "Lum;")
    private class347 field1766 = new class347();

    @OriginalMember(owner = "client!gb", name = "S", descriptor = "Lrl;")
    public class487 field1768;

    @OriginalMember(owner = "client!gb", name = "V", descriptor = "[[I")
    private int[][] field1771;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
    private int field1745;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "[[[I")
    private int[][][] field1744;

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "[[[Lio;")
    private class288[][][] field1765;

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "[[[I")
    private int[][][] field1763;

    @OriginalMember(owner = "client!gb", name = "cb", descriptor = "[[F")
    private float[][] field1778;

    @OriginalMember(owner = "client!gb", name = "db", descriptor = "[[F")
    private float[][] field1779;

    @OriginalMember(owner = "client!gb", name = "gb", descriptor = "[[B")
    private byte[][] field1782;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "[[[I")
    public int[][][] field1738;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "[[[I")
    public int[][][] field1739;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "I")
    public int field1755;

    @OriginalMember(owner = "client!gb", name = "L", descriptor = "[[B")
    private byte[][] field1761;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "[[S")
    public short[][] field1743;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    private int field1737;

    @OriginalMember(owner = "client!gb", name = "hb", descriptor = "[[F")
    private float[][] field1783;

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "[[[I")
    private int[][][] field1756;

    @OriginalMember(owner = "client!gb", name = "ib", descriptor = "Lfe;")
    private class384 field1784;

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "Lm;")
    private class120 field1762;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "Z")
    public static boolean field1747 = false;

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "I")
    public static int field1754 = 0;

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "Z")
    public static boolean field1752 = false;

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "Ldc;")
    public static class5 field1750 = new class5(200);

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    private int field1732;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!gb", name = "K", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!gb", name = "R", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!gb", name = "T", descriptor = "I")
    private int field1769;

    @OriginalMember(owner = "client!gb", name = "U", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!gb", name = "W", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!gb", name = "X", descriptor = "I")
    private int field1773;

    @OriginalMember(owner = "client!gb", name = "ab", descriptor = "I")
    private int field1776;

    @OriginalMember(owner = "client!gb", name = "Y", descriptor = "Lbh;")
    public class27 field1774;

    @OriginalMember(owner = "client!gb", name = "Z", descriptor = "Lbh;")
    public class27 field1775;

    @OriginalMember(owner = "client!gb", name = "bb", descriptor = "Lbh;")
    private class27 field1777;

    @OriginalMember(owner = "client!gb", name = "fb", descriptor = "Lbh;")
    public class27 field1781;

    @OriginalMember(owner = "client!gb", name = "jb", descriptor = "Lms;")
    private class511 field1785;

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "Lps;")
    public static class59 field1758;

    @OriginalMember(owner = "client!gb", name = "eb", descriptor = "[Lio;")
    private class288[] field1780;

    @OriginalMember(owner = "client!gb", name = "J", descriptor = "[[[I")
    private int[][][] field1759;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "()V", line = 8)
    public final void method847() {
        ++field1734;
        if (~this.field1773 < -1) {
            byte[][] var1 = new byte[super.field6434 + 1][super.field6436 + 1];
            for (int var2 = 1; ~super.field6434 < ~var2; ++var2) {
                for (int var102 = 1; ~super.field6436 < ~var102; ++var102) {
                    var1[var2][var102] = (byte) ((this.field1782[var2 + -1][var102] >> 2) + (this.field1782[var2 + 1][var102] >> 3) + (this.field1782[var2][var102] >> 1) + (this.field1782[var2][var102 + -1] >> 2) + (this.field1782[var2][var102 + 1] >> 3));
                }
            }
            this.field1780 = new class288[this.field1784.method2314(false)];
            this.field1784.method2318(this.field1780, (byte) 83);
            for (int var3 = 0; ~var3 > ~this.field1780.length; ++var3) {
                this.field1780[var3].method1738(127, this.field1773);
            }
            int var4 = 24;
            if (this.field1759 != null) {
                var4 += 4;
            }
            if ((this.field1755 & 7) != 0) {
                var4 += 12;
            }
            NativeBuffer var5 = this.field1768.field7318.method2519(this.field1773 * var4);
            NativeStream var6 = new NativeStream(var5);
            class288[] var7 = new class288[this.field1773];
            class384 var8 = new class384(class70.method477(this.field1773, false));
            class288[] var9 = new class288[this.field1776];
            for (int var10 = 0; ~var10 > ~super.field6434; ++var10) {
                for (int var29 = 0; super.field6436 > var29; ++var29) {
                    if (this.field1763[var10][var29] != null) {
                        class288[] var30 = this.field1765[var10][var29];
                        int[] var31 = this.field1738[var10][var29];
                        int[] var32 = this.field1739[var10][var29];
                        int[] var33 = this.field1744[var10][var29];
                        int[] var34 = this.field1763[var10][var29];
                        int[] var35 = this.field1756 != null ? this.field1756[var10][var29] : null;
                        int[] var36 = this.field1759 == null ? null : this.field1759[var10][var29];
                        if (var33 == null) {
                            var33 = var34;
                        }
                        float var37 = this.field1783[var10][var29];
                        float var38 = this.field1779[var10][var29];
                        float var39 = this.field1778[var10][var29];
                        float var40 = this.field1783[var10][var29 + 1];
                        float var41 = this.field1779[var10][var29 - -1];
                        float var42 = this.field1778[var10][var29 + 1];
                        float var43 = this.field1783[var10 + 1][var29 + 1];
                        float var44 = this.field1779[var10 + 1][var29 + 1];
                        float var45 = this.field1778[var10 + 1][var29 - -1];
                        float var46 = this.field1783[var10 + 1][var29];
                        float var47 = this.field1779[var10 + 1][var29];
                        float var48 = this.field1778[var10 + 1][var29];
                        int var49 = 255 & var1[var10][var29];
                        int var50 = var1[var10][var29 - -1] & 255;
                        int var51 = var1[var10 + 1][var29 - -1] & 255;
                        int var52 = 255 & var1[var10 + 1][var29];
                        int var53 = 0;
                        label335: for (int var54 = 0; var34.length > var54; ++var54) {
                            class288 var100 = var30[var54];
                            for (int var101 = 0; var101 < var53; ++var101) {
                                if (var9[var101] == var100) {
                                    continue label335;
                                }
                            }
                            var9[var53++] = var100;
                        }
                        short[] var55 = this.field1743[super.field6434 * var29 + var10] = new short[var34.length];
                        for (int var56 = 0; ~var56 > ~var34.length; ++var56) {
                            int var57 = (var10 << super.field6441) - -var31[var56];
                            int var58 = (var29 << super.field6441) - -var32[var56];
                            int var59 = var57 >> this.field1745;
                            int var60 = var58 >> this.field1745;
                            int var61 = var34[var56];
                            int var62 = var33[var56];
                            int var63 = var35 != null ? var35[var56] : 0;
                            long var64 = (long) var60 | (long) var61 << 32 | (long) var62 << 48 | (long) (var59 << 16);
                            int var66 = var31[var56];
                            int var67 = var32[var56];
                            byte var68 = 74;
                            int var69 = 0;
                            float var70 = 1.0F;
                            float var71;
                            int var72;
                            float var73;
                            float var74;
                            if (var66 == 0 && var67 == 0) {
                                var71 = var38;
                                var72 = var68 - var49;
                                var73 = var37;
                                var74 = var39;
                            } else if (var66 == 0 && super.field6438 == var67) {
                                var71 = var41;
                                var72 = var68 - var50;
                                var73 = var40;
                                var74 = var42;
                            } else if (super.field6438 == var66 && super.field6438 == var67) {
                                var73 = var43;
                                var71 = var44;
                                var72 = var68 - var51;
                                var74 = var45;
                            } else if (super.field6438 == var66 && var67 == 0) {
                                var73 = var46;
                                var74 = var48;
                                var71 = var47;
                                var72 = var68 - var52;
                            } else {
                                float var75 = (float) var66 / (float) super.field6438;
                                float var76 = (float) var67 / (float) super.field6438;
                                float var77 = (-var37 + var46) * var75 + var37;
                                float var78 = (-var38 + var47) * var75 + var38;
                                float var79 = (-var39 + var48) * var75 + var39;
                                float var80 = (var43 - var40) * var75 + var40;
                                float var81 = (-var41 + var44) * var75 + var41;
                                var73 = (-var77 + var80) * var76 + var77;
                                var71 = (var81 - var78) * var76 + var78;
                                float var82 = (var45 - var42) * var75 + var42;
                                var74 = (-var79 + var82) * var76 + var79;
                                int var83 = ((-var49 + var52) * var66 >> super.field6441) + var49;
                                int var84 = ((-var50 + var51) * var66 >> super.field6441) + var50;
                                var72 = var68 - (((-var83 + var84) * var67 >> super.field6441) + var83);
                            }
                            if (var61 != -1) {
                                int var85 = (127 & var61) * var72 >> 7;
                                if (var85 >= 2) {
                                    if (~var85 < -127) {
                                        var85 = 126;
                                    }
                                } else {
                                    var85 = 2;
                                }
                                var69 = class31.field518[var85 | var61 & 65408];
                                if ((7 & this.field1755) == 0) {
                                    float var86 = this.field1768.field7394[2] * var74 + this.field1768.field7394[1] * var71 + this.field1768.field7394[0] * var73;
                                    var70 = this.field1768.field7414 + (var86 > 0.0F ? this.field1768.field7424 : this.field1768.field7398) * var86;
                                }
                            }
                            class86 var87 = null;
                            if (~(this.field1737 + -1 & var57) == -1 && (var58 & this.field1737 + -1) == 0) {
                                var87 = var8.method2310((byte) -112, var64);
                            }
                            int var88;
                            if (var87 != null) {
                                var55[var56] = ((class46) var87).field698;
                                var88 = var55[var56] & 65535;
                                if (~var61 != 0 && ~var7[var88].field1177 < ~var30[var56].field1177) {
                                    var7[var88] = var30[var56];
                                }
                            } else {
                                int var90;
                                if (~var61 != ~var62) {
                                    int var89 = (var62 & 127) * var72 >> 7;
                                    if (~var89 <= -3) {
                                        if (var89 > 126) {
                                            var89 = 126;
                                        }
                                    } else {
                                        var89 = 2;
                                    }
                                    var90 = class31.field518[var89 | var62 & 65408];
                                    if ((7 & this.field1755) == 0) {
                                        float var91 = this.field1768.field7394[2] * var74 + this.field1768.field7394[0] * var73 + this.field1768.field7394[1] * var71;
                                        float var92 = this.field1768.field7414 + (var70 > 0.0F ? this.field1768.field7424 : this.field1768.field7398) * var70;
                                        int var93 = (var90 & 16720311) >> 16;
                                        int var94 = (65428 & var90) >> 8;
                                        int var95 = var90 & 255;
                                        int var96 = (int) ((float) var93 * var92);
                                        if (var96 < 0) {
                                            var96 = 0;
                                        } else if (var96 > 255) {
                                            var96 = 255;
                                        }
                                        int var97 = (int) ((float) var94 * var92);
                                        if (~var97 <= -1) {
                                            if (~var97 < -256) {
                                                var97 = 255;
                                            }
                                        } else {
                                            var97 = 0;
                                        }
                                        int var98 = (int) ((float) var95 * var92);
                                        if (var98 < 0) {
                                            var98 = 0;
                                        } else if (~var98 < -256) {
                                            var98 = 255;
                                        }
                                        var90 = var96 << 16 | var97 << 8 | var98;
                                    }
                                } else {
                                    var90 = var69;
                                }
                                if (this.field1768.field7350) {
                                    var6.method2512((float) var57);
                                    var6.method2512((float) (this.method855(var57, var58) + var63));
                                    var6.method2512((float) var58);
                                    var6.method2513((byte) (var90 >> 16));
                                    var6.method2513((byte) (var90 >> 8));
                                    var6.method2513((byte) var90);
                                    var6.method2513(-1);
                                    var6.method2512((float) var57);
                                    var6.method2512((float) var58);
                                    if (this.field1759 != null) {
                                        var6.method2512((float) (var36 == null ? 0 : var36[var56] + -1));
                                    }
                                    if ((this.field1755 & 7) != 0) {
                                        var6.method2512(var73);
                                        var6.method2512(var71);
                                        var6.method2512(var74);
                                    }
                                } else {
                                    var6.method2515((float) var57);
                                    var6.method2515((float) (this.method855(var57, var58) + var63));
                                    var6.method2515((float) var58);
                                    var6.method2513((byte) (var90 >> 16));
                                    var6.method2513((byte) (var90 >> 8));
                                    var6.method2513((byte) var90);
                                    var6.method2513(-1);
                                    var6.method2515((float) var57);
                                    var6.method2515((float) var58);
                                    if (this.field1759 != null) {
                                        var6.method2515((float) (var36 == null ? 0 : var36[var56] + -1));
                                    }
                                    if ((7 & this.field1755) != 0) {
                                        var6.method2515(var73);
                                        var6.method2515(var71);
                                        var6.method2515(var74);
                                    }
                                }
                                var88 = this.field1732++;
                                var55[var56] = (short) var88;
                                if (var61 != -1) {
                                    var7[var88] = var30[var56];
                                }
                                var8.method2317(-1, var64, new class46(var55[var56]));
                            }
                            for (int var99 = 0; ~var53 < ~var99; ++var99) {
                                var9[var99].method1741(var88, -128, var69, var72, var70);
                            }
                            ++this.field1769;
                        }
                    }
                }
            }
            for (int var11 = 0; ~this.field1732 < ~var11; ++var11) {
                class288 var28 = var7[var11];
                if (var28 != null) {
                    var28.method1745(var11, -118);
                }
            }
            for (int var12 = 0; super.field6434 > var12; ++var12) {
                for (int var17 = 0; ~var17 > ~super.field6436; ++var17) {
                    short[] var18 = this.field1743[super.field6434 * var17 + var12];
                    if (var18 != null) {
                        int var19 = 0;
                        int var20 = 0;
                        while (var20 < var18.length) {
                            int var21 = var18[var20++] & 65535;
                            int var22 = var18[var20++] & 65535;
                            int var23 = 65535 & var18[var20++];
                            class288 var24 = var7[var21];
                            class288 var25 = var7[var22];
                            class288 var26 = var7[var23];
                            class288 var27 = null;
                            if (var24 != null) {
                                var24.method1739((byte) 126, var17, var19, var12);
                                var27 = var24;
                            }
                            if (var25 != null) {
                                var25.method1739((byte) 114, var17, var19, var12);
                                if (var27 == null || var25.field1177 < var27.field1177) {
                                    var27 = var25;
                                }
                            }
                            if (var26 != null) {
                                var26.method1739((byte) 102, var17, var19, var12);
                                if (var27 == null || var26.field1177 < var27.field1177) {
                                    var27 = var26;
                                }
                            }
                            if (var27 != null) {
                                if (var24 != null) {
                                    var27.method1745(var21, -121);
                                }
                                if (var25 != null) {
                                    var27.method1745(var22, -119);
                                }
                                if (var26 != null) {
                                    var27.method1745(var23, -124);
                                }
                                var27.method1739((byte) 120, var17, var19, var12);
                            }
                            ++var19;
                        }
                    }
                }
            }
            var6.method2516();
            this.field1785 = this.field1768.method2862(var6.method2514(), false, 3, var5, var4);
            this.field1775 = new class27(this.field1768, this.field1785, 5126, 3, 0);
            this.field1777 = new class27(this.field1768, this.field1785, 5121, 4, 12);
            byte var13;
            if (this.field1759 == null) {
                var13 = 24;
                this.field1781 = new class27(this.field1768, this.field1785, 5126, 2, 16);
            } else {
                this.field1781 = new class27(this.field1768, this.field1785, 5126, 3, 16);
                var13 = 28;
            }
            if ((7 & this.field1755) != 0) {
                this.field1774 = new class27(this.field1768, this.field1785, 5126, 3, var13);
            }
            long[] var14 = new long[this.field1780.length];
            for (int var15 = 0; var15 < this.field1780.length; ++var15) {
                class288 var16 = this.field1780[var15];
                var14[var15] = var16.field1177;
                var16.method1747(-36, this.field1732);
            }
            class472.method2763(this.field1780, (byte) -127, var14);
            if (this.field1762 != null) {
                this.field1762.method682(0);
            }
        } else {
            this.field1762 = null;
        }
        this.field1756 = null;
        this.field1784 = null;
        this.field1744 = null;
        this.field1782 = null;
        this.field1738 = this.field1739 = null;
        this.field1763 = null;
        this.field1783 = this.field1779 = this.field1778 = null;
        this.field1759 = null;
        this.field1765 = null;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(II)I", line = 586)
    public final int method848(int arg0, int arg1) {
        ++field1770;
        return this.field1771[arg0][arg1];
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(Lss;IIIIZ)V", line = 594)
    public final void method849(class283 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field1741;
        if (this.field1762 != null && arg0 != null) {
            int var7 = arg1 - (this.field1768.field7444 * arg2 >> 8) >> this.field1768.field7319;
            int var8 = -(this.field1768.field7359 * arg2 >> 8) + arg3 >> this.field1768.field7319;
            this.field1762.method686(true, arg0, var8, var7);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BIILln;)V", line = 615)
    private final void method850(byte arg0, int arg1, int arg2, class245 arg3) {
        ++field1740;
        int[] var5 = this.field1738[arg2][arg1];
        int[] var6 = this.field1739[arg2][arg1];
        if (arg0 <= 99) {
            this.method859(19, -81, 59, (boolean[][]) null, false);
        }
        int var7 = var5.length;
        if (~class289.field4140.length > ~var7) {
            class289.field4140 = new int[var7];
            class349.field5050 = new int[var7];
        }
        for (int var8 = 0; var7 > var8; ++var8) {
            class289.field4140[var8] = class500.method3013(var5[var8], 255) >> this.field1768.field7319;
            class349.field5050[var8] = class500.method3013(255, var6[var8]) >> this.field1768.field7319;
        }
        int var9 = 0;
        while (var9 < var7) {
            int var10 = class289.field4140[var9];
            int var11 = class349.field5050[var9++];
            int var12 = class289.field4140[var9];
            int var13 = class349.field5050[var9++];
            int var14 = class289.field4140[var9];
            int var15 = class349.field5050[var9++];
            if ((var13 - var15) * (-var12 + var10) - (-var11 + var13) * (-var12 + var14) > 0) {
                arg3.method1529(var14, var10, var13, true, var12, var15, var11);
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V", line = 674)
    public final void method851(int arg0, int arg1) {
        ++field1748;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIII[[Z)V", line = 686)
    public final void method852(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field1767;
        if (~this.field1773 < -1) {
            this.field1768.method2901(-127);
            this.field1768.method2880(false, -75);
            this.field1768.method2884(false, (byte) -123);
            this.field1768.method2868(false, 107);
            this.field1768.method2908(false, (byte) 51);
            this.field1768.method2852(0, 0);
            this.field1768.method2867(0, -2);
            this.field1768.method2883((class221) null, 123);
            class493.field7528[7] = 0.0F;
            class493.field7528[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field1768.field7191;
            class493.field7528[2] = 0.0F;
            class493.field7528[0] = (float) arg2 / ((float) super.field6438 * 128.0F * (float) this.field1768.field7204);
            class493.field7528[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field1768.field7204) + -1.0F;
            class493.field7528[5] = (float) arg2 / ((float) super.field6438 * 128.0F * (float) this.field1768.field7191);
            class493.field7528[14] = 0.0F;
            class493.field7528[9] = 0.0F;
            class493.field7528[11] = 0.0F;
            class493.field7528[15] = 1.0F;
            class493.field7528[1] = 0.0F;
            class493.field7528[10] = 0.0F;
            class493.field7528[4] = 0.0F;
            class493.field7528[6] = 0.0F;
            class493.field7528[8] = 0.0F;
            class493.field7528[3] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class493.field7528, 0);
            class493.field7528[3] = 0.0F;
            class493.field7528[14] = 0.0F;
            class493.field7528[10] = 0.0F;
            class493.field7528[11] = 0.0F;
            class493.field7528[2] = 0.0F;
            class493.field7528[8] = 0.0F;
            class493.field7528[7] = 0.0F;
            class493.field7528[5] = 0.0F;
            class493.field7528[13] = 0.0F;
            class493.field7528[6] = 1.0F;
            class493.field7528[1] = 0.0F;
            class493.field7528[15] = 1.0F;
            class493.field7528[0] = 1.0F;
            class493.field7528[12] = 0.0F;
            class493.field7528[9] = 1.0F;
            class493.field7528[4] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class493.field7528, 0);
            if (~(7 & this.field1755) == -1) {
                this.field1768.method2884(false, (byte) 80);
            } else {
                this.field1768.method2884(true, (byte) 93);
                this.field1768.method2871((byte) 108);
            }
            this.field1768.method2861(this.field1777, 9149, this.field1775, this.field1774, this.field1781);
            if (~class227.field3201.field2041.length <= ~(this.field1769 * 2)) {
                class227.field3201.field2018 = 0;
            } else {
                class227.field3201 = new class156(this.field1769 * 2);
            }
            int var9 = 0;
            if (this.field1768.field7350) {
                for (int var10 = arg4; ~arg6 < ~var10; ++var10) {
                    int var11 = super.field6434 * var10 + arg3;
                    for (int var12 = arg3; arg5 > var12; ++var12) {
                        if (arg7[var12 - arg3][var10 - arg4]) {
                            short[] var13 = this.field1743[var11];
                            if (var13 != null) {
                                for (int var14 = 0; var13.length > var14; ++var14) {
                                    class227.field3201.method961(var13[var14] & 65535, 1608339368);
                                    ++var9;
                                }
                            }
                        }
                        ++var11;
                    }
                }
            } else {
                for (int var15 = arg4; var15 < arg6; ++var15) {
                    int var17 = super.field6434 * var15 + arg3;
                    for (int var18 = arg3; var18 < arg5; ++var18) {
                        if (arg7[-arg3 + var18][-arg4 + var15]) {
                            short[] var19 = this.field1743[var17];
                            if (var19 != null) {
                                for (int var20 = 0; var20 < var19.length; ++var20) {
                                    class227.field3201.method988(65535 & var19[var20], -461070776);
                                    ++var9;
                                }
                            }
                        }
                        ++var17;
                    }
                }
            }
            if (var9 > 0) {
                class142 var16 = new class142(this.field1768, 5123, class227.field3201.field2041, class227.field3201.field2018);
                this.field1768.method2929(0, var9, 0, var16, 4);
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lrl;IIII[[I[[II)V", line = 856)
    public class136(class487 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field1768 = arg0;
        this.field1771 = arg5;
        this.field1745 = super.field6441 + -2;
        this.field1744 = new int[arg3][arg4][];
        this.field1765 = new class288[arg3][arg4][];
        this.field1763 = new int[arg3][arg4][];
        this.field1778 = new float[super.field6434 + 1][super.field6436 + 1];
        this.field1779 = new float[super.field6434 + 1][super.field6436 + 1];
        this.field1782 = new byte[arg3 + 1][arg4 + 1];
        this.field1738 = new int[arg3][arg4][];
        this.field1739 = new int[arg3][arg4][];
        this.field1755 = arg2;
        this.field1761 = new byte[arg3][arg4];
        this.field1743 = new short[arg3 * arg4][];
        this.field1737 = 1 << this.field1745;
        this.field1783 = new float[super.field6434 + 1][super.field6436 + 1];
        this.field1756 = new int[arg3][arg4][];
        for (int var9 = 1; var9 < super.field6436; ++var9) {
            for (int var10 = 1; ~var10 > ~super.field6434; ++var10) {
                int var11 = arg6[var10 - -1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + var11 * var11 - -(var12 * var12))));
                this.field1783[var10][var9] = (float) var11 * var13;
                this.field1779[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field1778[var10][var9] = (float) var12 * var13;
            }
        }
        this.field1784 = new class384(128);
        if ((this.field1755 & 16) != 0) {
            this.field1762 = new class120(this.field1768, this);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 914)
    public static void method853(int arg0) {
        field1750 = null;
        if (arg0 != -24075) {
            method853(52);
        }
        field1758 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ldq;[I)V", line = 933)
    public final void method854(class472 arg0, int[] arg1) {
        ++field1772;
        this.field1766.method2086((byte) -120, new class219(this.field1768, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)I", line = 943)
    public final int method855(int arg0, int arg1) {
        ++field1760;
        int var3 = arg0 >> super.field6441;
        int var4 = arg1 >> super.field6441;
        if (var3 >= 0 && var4 >= 0 && super.field6434 + -1 >= var3 && ~var4 >= ~(super.field6436 + -1)) {
            int var5 = arg0 & super.field6438 - 1;
            int var6 = arg1 & super.field6438 + -1;
            int var7 = (-var5 + super.field6438) * this.field1771[var3][var4] + this.field1771[var3 + 1][var4] * var5 >> super.field6441;
            int var8 = (-var5 + super.field6438) * this.field1771[var3][var4 + 1] + this.field1771[var3 + 1][var4 + 1] * var5 >> super.field6441;
            return (super.field6438 - var6) * var7 + var6 * var8 >> super.field6441;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(III[[ZIBZ)V", line = 966)
    private final void method856(int arg0, int arg1, int arg2, boolean[][] arg3, int arg4, byte arg5, boolean arg6) {
        if (arg5 >= -78) {
            this.field1782 = null;
        }
        if (this.field1780 != null) {
            float var8 = this.field1768.field7434;
            float var9 = this.field1768.field7373;
            int var10 = arg4 + 1 + arg4;
            int var11 = var10 * var10;
            if (class406.field5966.length < var11) {
                class406.field5966 = new int[var11];
            }
            if (~class227.field3201.field2041.length > ~(this.field1769 * 2)) {
                class227.field3201 = new class156(this.field1769 * 2);
            }
            int var12 = -arg4 + arg1;
            int var13 = var12;
            if (var12 < 0) {
                var12 = 0;
            }
            int var14 = arg2 - arg4;
            int var15 = var14;
            if (~var14 > -1) {
                var14 = 0;
            }
            int var16 = arg1 + arg4;
            if (~(super.field6434 + -1) > ~var16) {
                var16 = super.field6434 - 1;
            }
            int var17 = arg2 + arg4;
            class451.field6574 = 0;
            if (var17 > super.field6436 + -1) {
                var17 = super.field6436 + -1;
            }
            for (int var18 = var12; var16 >= var18; ++var18) {
                boolean[] var24 = arg3[-var13 + var18];
                for (int var25 = var14; var25 <= var17; ++var25) {
                    if (var24[-var15 + var25]) {
                        class406.field5966[class451.field6574++] = super.field6434 * var25 + var18;
                    }
                }
            }
            if (~arg0 == 0) {
                this.field1768.method2891(8);
            } else {
                this.field1768.method2850((float) arg0, -4);
                this.field1768.method2912((byte) -108);
            }
            this.field1768.method2884(~(this.field1755 & 7) != -1, (byte) 50);
            for (int var19 = 0; var19 < this.field1780.length; ++var19) {
                this.field1780[var19].method1740(class451.field6574, class406.field5966, 65535);
            }
            if (!this.field1766.method2090(0)) {
                int var20 = this.field1768.field7390;
                int var21 = this.field1768.field7441;
                this.field1768.method775(0, var21, this.field1768.field7345);
                this.field1768.method821(var9, var8 - 4.0F);
                this.field1768.method2884(false, (byte) 57);
                this.field1768.method2908(false, (byte) 106);
                this.field1768.method2852(0, 128);
                this.field1768.method2867(0, -2);
                this.field1768.method2883(this.field1768.field7347, 54);
                this.field1768.method2919(7681, 8448, false);
                this.field1768.method2855(0, (byte) 50, 34166, 770);
                this.field1768.method2876(-397556104, 0, 770, 34167);
                for (class86 var22 = this.field1766.method2096(-21400); var22 != null; var22 = this.field1766.method2084((byte) 19)) {
                    class219 var23 = (class219) var22;
                    var23.method1349(arg4, 0, arg2, arg1, arg3);
                }
                this.field1768.method2855(0, (byte) 50, 5890, 768);
                this.field1768.method2876(-397556104, 0, 770, 5890);
                this.field1768.method2883((class221) null, -115);
                this.field1768.method775(var20, var21, this.field1768.field7345);
            }
            if (this.field1762 != null) {
                this.field1768.method821(var9, var8 - 8.0F);
                this.field1768.method2891(8);
                this.field1768.method2861((class27) null, 9149, this.field1775, (class27) null, this.field1781);
                this.field1762.method680(arg6, arg3, arg4, 53, arg2, arg1);
            }
            this.field1768.method821(var9, var8);
        }
        ++field1749;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lss;IIIIZ)V", line = 1115)
    public final void method857(class283 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field1742;
        if (this.field1762 != null && arg0 != null) {
            int var7 = -(this.field1768.field7444 * arg2 >> 8) + arg1 >> this.field1768.field7319;
            int var8 = -(this.field1768.field7359 * arg2 >> 8) + arg3 >> this.field1768.field7319;
            this.field1762.method681(false, var8, var7, arg0);
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lss;IIIIZ)Z", line = 1132)
    public final boolean method858(class283 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field1751;
        if (this.field1762 != null && arg0 != null) {
            int var7 = -(this.field1768.field7444 * arg2 >> 8) + arg1 >> this.field1768.field7319;
            int var8 = arg3 - (this.field1768.field7359 * arg2 >> 8) >> this.field1768.field7319;
            return this.field1762.method685(arg0, 17192, var7, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(III[[ZZ)V", line = 1151)
    public final void method859(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method856(-1, arg0, arg1, arg3, arg2, (byte) -88, arg4);
        ++field1736;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILss;)Lss;", line = 1162)
    public final class283 method860(int arg0, int arg1, class283 arg2) {
        ++field1757;
        if ((this.field1761[arg0][arg1] & 1) == 0) {
            return null;
        } else {
            int var4 = super.field6438 >> this.field1768.field7319;
            class245 var5 = (class245) arg2;
            class245 var6;
            if (var5 != null && var5.method1532(var4, 585123152, var4)) {
                var6 = var5;
                var5.method1530(12304);
            } else {
                var6 = new class245(this.field1768, var4, var4);
            }
            var6.method1533(var4, 0, -31, 0, var4);
            this.method850((byte) 107, arg1, arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V", line = 1196)
    public static final void method861(byte arg0) {
        ++field1746;
        if (class308.field4472) {
            class490.field7494 = null;
            if (arg0 == -105) {
                class138.field1806 = null;
                class308.field4472 = false;
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1212)
    public final void method862(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg3 != null && this.field1756 == null) {
            this.field1756 = new int[super.field6434][super.field6436][];
        }
        ++field1735;
        if (arg5 != null && this.field1759 == null) {
            this.field1759 = new int[super.field6434][super.field6436][];
        }
        this.field1738[arg0][arg1] = arg2;
        this.field1739[arg0][arg1] = arg4;
        this.field1763[arg0][arg1] = arg6;
        this.field1744[arg0][arg1] = arg7;
        if (this.field1759 != null) {
            this.field1759[arg0][arg1] = arg5;
        }
        if (this.field1756 != null) {
            this.field1756[arg0][arg1] = arg3;
        }
        class288[] var15 = this.field1765[arg0][arg1] = new class288[arg6.length];
        for (int var16 = 0; ~arg6.length < ~var16; ++var16) {
            long var17 = (long) arg8[var16] | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (arg9[var16] << 14);
            class86 var19;
            for (var19 = this.field1784.method2310((byte) 106, var17); var19 != null; var19 = this.field1784.method2309(-79)) {
                class288 var20 = (class288) var19;
                if (arg8[var16] == var20.field4111 && (float) arg9[var16] == var20.field4122 && var20.field4112 == arg10 && ~var20.field4117 == ~arg11 && var20.field4124 == arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class288) var19;
            } else {
                var15[var16] = new class288(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field1784.method2317(-1, var17, var15[var16]);
            }
        }
        if (arg13) {
            this.field1761[arg0][arg1] = (byte) class51.method379(this.field1761[arg0][arg1], 1);
        }
        if (~this.field1776 > ~arg6.length) {
            this.field1776 = arg6.length;
        }
        this.field1773 += arg6.length;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)V", line = 1281)
    public final void method863(int arg0, int arg1, int arg2) {
        if (arg2 > (this.field1782[arg0][arg1] & 255)) {
            this.field1782[arg0][arg1] = (byte) arg2;
        }
        ++field1733;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILbn;Lbn;IBIIII)V", line = 1297)
    public static final void method864(int arg0, int arg1, class294 arg2, class294 arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field1764;
        int var10 = arg2.method880(false);
        if (var10 != -1) {
            Object var11 = null;
            class307 var12 = (class307) class141.field1846.method40(0, (long) var10);
            if (var12 == null) {
                class328[] var13 = class328.method1976(class445.field6482, var10, 0);
                if (var13 == null) {
                    return;
                }
                var12 = class481.field6937.method804(var13[0], true);
                class141.field1846.method36(-20960, var12, (long) var10);
            }
            class335.method2024(arg0 >> 1, arg3.field2956, arg3.field2966, arg4, arg3.field2959, 64 * arg3.method1773(-118), 1, arg6, arg8 >> 1, 0);
            int var14 = -116 % ((arg5 - -41) / 40);
            int var15 = class447.field6506[0] + arg7 + -18;
            int var16 = arg1 / 4 * 18 + var15;
            int var17 = class447.field6506[1] + arg9 + -70;
            int var18 = arg1 % 4 * 18 + var17;
            var12.method1845(var16, var18);
            if (arg2 == arg3) {
                class481.field6937.method806(-256, 18, var18 + -1, var16 + -1, (byte) 116, 18);
            }
            class214 var19 = class110.method654((byte) 100);
            var19.field3019 = arg2;
            var19.field3026 = var18;
            var19.field3025 = var16;
            var19.field3020 = var18 + 16;
            var19.field3024 = var16 + 16;
            class317.field4637.method250((byte) -72, var19);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 1350)
    public final void method865(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field1753;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 != null ? new int[var18 * 3] : null;
        int[] var26 = arg5 == null ? null : new int[var18 * 3];
        int var27 = 0;
        for (int var28 = 0; var28 < var18; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var29];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var29];
            }
            ++var27;
            var19[var27] = arg2[var30];
            var20[var27] = arg4[var30];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var30];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var30];
            }
            ++var27;
            var19[var27] = arg2[var31];
            var20[var27] = arg4[var31];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method862(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }
}
