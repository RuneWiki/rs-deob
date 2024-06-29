import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class158 {

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public int field1774 = -1;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public static int field1780 = 1;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "Lal;")
    public static class307 field1768 = new class307();

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1782 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "Lcq;")
    public static class110 field1783 = new class110(71, 2);

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    private int field1767;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "J")
    private long field1760;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "J")
    private long field1773;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "Z")
    public boolean field1770;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "[I")
    private int[] field1772;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "[I")
    public int[] field1781;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "[[I")
    private int[][] field1766;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([Lis;Lfb;Lau;Llb;Lks;IILr;Loj;ILbg;ILnv;Llb;BIZII)Lda;")
    public final class473 method851(class2[] arg0, class53 arg1, class519 arg2, class257 arg3, class30 arg4, int arg5, int arg6, class564 arg7, class541 arg8, int arg9, class373 arg10, int arg11, class63 arg12, class257 arg13, byte arg14, int arg15, boolean arg16, int arg17, int arg18) {
        field1776++;
        if (this.field1774 != -1) {
            return arg12.method342(-14190, this.field1774).method1250(arg17, (byte) -128, arg3, arg9, arg4, arg10, arg7, arg15, arg5, arg11, arg0, arg6, arg8, arg18, arg13);
        }
        int var20 = arg9;
        long var21 = this.field1760;
        int[] var23 = this.field1772;
        if (arg13 != null && (arg13.field3233 >= 0 || arg13.field3224 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field1772[var24];
            }
            if (arg13.field3233 >= 0) {
                if (arg13.field3233 == 65535) {
                    var23[5] = 0;
                    var21 ^= 0xFFFFFFFF00000000L;
                } else {
                    var23[5] = class422.method2436(arg13.field3233, 1073741824);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg13.field3224 >= 0) {
                if (arg13.field3224 == 65535) {
                    var21 ^= 0xFFFFFFFFL;
                    var23[3] = 0;
                } else {
                    var23[3] = class422.method2436(1073741824, arg13.field3224);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg13 != null || arg3 != null;
        int var29 = arg0 == null ? 0 : arg0.length;
        if (arg14 < 93) {
            return null;
        }
        for (int var30 = 0; var30 < var29; var30++) {
            class672.field9360[var30] = null;
            if (arg0[var30] != null) {
                class257 var31 = arg8.method3043(arg0[var30].field12, -8191);
                if (var31.field3218 != null) {
                    var28 = true;
                    class388.field5240[var30] = var31;
                    int var32 = arg0[var30].field8;
                    int var33 = arg0[var30].field10;
                    int var34 = var31.field3218[var32];
                    class672.field9360[var30] = arg8.method3042(var34 >>> 16, (byte) -21);
                    int var35 = var34 & 0xFFFF;
                    class604.field8497[var30] = var35;
                    if (class672.field9360[var30] != null) {
                        var26 |= class672.field9360[var30].method2756(var35, (byte) -99);
                        var25 |= class672.field9360[var30].method2758(var35, 7527);
                        var27 |= class672.field9360[var30].method2755(-77, var35);
                    }
                    if ((var31.field3221 || class510.field7317) && var33 != -1 && var31.field3218.length > var33) {
                        class688.field9681[var30] = var31.field3235[var32];
                        class162.field1811[var30] = arg0[var30].field9;
                        int var36 = var31.field3218[var33];
                        class42.field417[var30] = arg8.method3042(var36 >>> 16, (byte) -21);
                        int var37 = var36 & 0xFFFF;
                        class181.field2035[var30] = var37;
                        if (class42.field417[var30] != null) {
                            var26 |= class42.field417[var30].method2756(var37, (byte) -61);
                            var25 |= class42.field417[var30].method2758(var37, 7527);
                            var27 |= class42.field417[var30].method2755(-90, var37);
                        }
                    } else {
                        class688.field9681[var30] = 0;
                        class162.field1811[var30] = 0;
                        class42.field417[var30] = null;
                        class181.field2035[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class479 var41 = null;
        class479 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class479 var46 = null;
        class479 var47 = null;
        if (var28) {
            var20 = arg9 | 0x20;
            if (arg13 != null) {
                int var48 = arg13.field3218[arg15];
                int var49 = var48 >>> 16;
                var38 = var48 & 0xFFFF;
                var41 = arg8.method3042(var49, (byte) -21);
                if (var41 != null) {
                    var26 |= var41.method2756(var38, (byte) -107);
                    var25 |= var41.method2758(var38, 7527);
                    var27 |= var41.method2755(-102, var38);
                }
                if ((arg13.field3221 || class510.field7317) && arg5 != -1 && arg13.field3218.length > arg5) {
                    int var50 = arg13.field3218[arg5];
                    var40 = arg13.field3235[arg15];
                    int var51 = var50 >>> 16;
                    var39 = var50 & 0xFFFF;
                    var42 = var49 == var51 ? var41 : arg8.method3042(var51, (byte) -21);
                    if (var42 != null) {
                        var26 |= var42.method2756(var39, (byte) -54);
                        var25 |= var42.method2758(var39, 7527);
                        var27 |= var42.method2755(-118, var39);
                    }
                }
            }
            if (arg3 != null) {
                int var52 = arg3.field3218[arg17];
                int var53 = var52 >>> 16;
                var43 = var52 & 0xFFFF;
                var46 = arg8.method3042(var53, (byte) -21);
                if (var46 != null) {
                    var26 |= var46.method2756(var43, (byte) -107);
                    var25 |= var46.method2758(var43, 7527);
                    var27 |= var46.method2755(-91, var43);
                }
                if ((arg3.field3221 || class510.field7317) && arg18 != -1 && arg3.field3218.length > arg18) {
                    var45 = arg3.field3235[arg17];
                    int var54 = arg3.field3218[arg18];
                    int var55 = var54 >>> 16;
                    var47 = var53 == var55 ? var46 : arg8.method3042(var55, (byte) -21);
                    var44 = var54 & 0xFFFF;
                    if (var47 != null) {
                        var26 |= var47.method2756(var44, (byte) -61);
                        var25 |= var47.method2758(var44, 7527);
                        var27 |= var47.method2755(-76, var44);
                    }
                }
            }
            if (var26) {
                var20 |= 0x80;
            }
            if (var25) {
                var20 |= 0x100;
            }
            if (var27) {
                var20 |= 0x400;
            }
        }
        class19 var56 = class139.field1538;
        class473 var57;
        synchronized (class139.field1538) {
            var57 = (class473) class139.field1538.method78(0, var21);
        }
        class543 var58 = null;
        if (this.field1767 != -1) {
            var58 = arg10.method2168(this.field1767, 24449);
        }
        if (var57 == null || arg7.method973(var57.method1861(), var20) != 0 || var58 != null && var58.field7667 != null && this.field1766 == null) {
            if (var57 != null) {
                var20 = arg7.method1004(var20, var57.method1861());
            }
            boolean var60 = false;
            for (int var61 = 0; var61 < 12; var61++) {
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var62) != 0 && !arg2.method2949((byte) -108, var62 & 0x3FFFFFFF).method1402(-35)) {
                        var60 = true;
                    }
                } else if (!arg1.method272(var62 & 0x3FFFFFFF, -11824).method2825(this.field1770, (byte) 17)) {
                    var60 = true;
                }
            }
            if (var60) {
                if (this.field1773 != -1L) {
                    class19 var63 = class139.field1538;
                    synchronized (class139.field1538) {
                        var57 = (class473) class139.field1538.method78(0, this.field1773);
                    }
                }
                if (var57 == null || arg7.method973(var57.method1861(), var20) != 0 || var58 != null && var58.field7667 != null && this.field1766 == null) {
                    return null;
                }
            } else {
                class581[] var64 = new class581[12];
                for (int var65 = 0; var65 < 12; var65++) {
                    int var66 = var23[var65];
                    if ((var66 & 0x40000000) != 0) {
                        class581 var68 = arg1.method272(var66 & 0x3FFFFFFF, -11824).method2814(this.field1770, (byte) -122);
                        if (var68 != null) {
                            var64[var65] = var68;
                        }
                    } else if ((var66 & Integer.MIN_VALUE) != 0) {
                        class581 var67 = arg2.method2949((byte) -74, var66 & 0x3FFFFFFF).method1400(-127);
                        if (var67 != null) {
                            var64[var65] = var67;
                        }
                    }
                }
                if (var58 != null && var58.field7667 != null) {
                    for (int var69 = 0; var69 < var58.field7667.length; var69++) {
                        if (var58.field7667[var69] != null && var64[var69] != null) {
                            int var70 = var58.field7667[var69][0];
                            int var71 = var58.field7667[var69][1];
                            int var72 = var58.field7667[var69][2];
                            int var73 = var58.field7667[var69][3] << 3;
                            int var74 = var58.field7667[var69][4] << 3;
                            int var75 = var58.field7667[var69][5] << 3;
                            if (this.field1766 == null) {
                                this.field1766 = new int[var58.field7667.length][];
                            }
                            if (this.field1766[var69] == null) {
                                int[] var76 = this.field1766[var69] = new int[15];
                                if (var73 == 0 && var74 == 0 && var75 == 0) {
                                    var76[13] = -var71;
                                    var76[0] = var76[4] = var76[8] = 32768;
                                    var76[14] = -var72;
                                    var76[12] = -var70;
                                } else {
                                    int var77 = class435.field6135[var73];
                                    int var78 = class435.field6134[var73];
                                    int var79 = class435.field6135[var74];
                                    int var80 = class435.field6134[var74];
                                    int var81 = class435.field6135[var75];
                                    int var82 = class435.field6134[var75];
                                    int var83 = var78 * var81 + 8192 >> 14;
                                    int var84 = var78 * var82 + 8192 >> 14;
                                    var76[5] = -var78;
                                    var76[4] = var77 * var81 + 8192 >> 14;
                                    var76[3] = var77 * var82 + 8192 >> 14;
                                    var76[6] = -var80 * var81 + var79 * var84 + 8192 >> 14;
                                    var76[1] = -var82 * var79 + (var80 * var83 + 8192) >> 14;
                                    var76[2] = var77 * var80 + 8192 >> 14;
                                    var76[7] = -var80 * -var82 + var79 * var83 + 8192 >> 14;
                                    var76[0] = var79 * var81 + var80 * var84 + 8192 >> 14;
                                    var76[8] = var77 * var79 + 8192 >> 14;
                                    var76[12] = var76[0] * -var70 + var76[6] * -var72 + var76[3] * -var71 + 8192 >> 14;
                                    var76[14] = var76[2] * -var70 + var76[5] * -var71 + (var76[8] * -var72) + 8192 >> 14;
                                    var76[13] = var76[7] * -var72 + var76[1] * -var70 + (var76[4] * -var71) + 8192 >> 14;
                                }
                                var76[9] = var70;
                                var76[10] = var71;
                                var76[11] = var72;
                            }
                            if (var73 != 0 || var74 != 0 || var75 != 0) {
                                var64[var69].method3290(var75, 2, var73, var74);
                            }
                            if (var70 != 0 || var71 != 0 || var72 != 0) {
                                var64[var69].method3287(var71, var70, 115, var72);
                            }
                        }
                    }
                }
                class581 var85 = new class581(var64, var64.length);
                int var86 = var20 | 0x4000;
                var57 = arg7.method1051(var85, var86, class553.field7892, 64, 850);
                for (int var87 = 0; var87 < 5; var87++) {
                    for (int var88 = 0; var88 < class557.field7952.length; var88++) {
                        if (this.field1781[var87] < class557.field7952[var88][var87].length) {
                            var57.method1882(class90.field899[var88][var87], class557.field7952[var88][var87][this.field1781[var87]]);
                        }
                    }
                }
                if (arg16) {
                    var57.method1907(var20);
                    class19 var89 = class139.field1538;
                    synchronized (class139.field1538) {
                        class139.field1538.method92(1, var21, var57);
                    }
                    this.field1773 = var21;
                }
            }
        }
        class473 var90 = var57.method1877((byte) 4, var20, true);
        if (!var28) {
            return var90;
        }
        int var91 = 0;
        int var92 = 1;
        while (var91 < var29) {
            if (class672.field9360[var91] != null) {
                var90.method2726(class181.field2035[var91], false, class42.field417[var91], class688.field9681[var91], 0, 0, class604.field8497[var91], this.field1766 == null ? null : this.field1766[var91], class162.field1811[var91] - 1, var92, class672.field9360[var91]);
            }
            var91++;
            var92 <<= 0x1;
        }
        if (var41 != null && var46 != null) {
            var90.method2729(var38, arg11 - 1, var46, var40, var43, arg13.field3210, var41, arg6 - 1, 1643, var44, false, var47, var39, var42, var45);
        } else if (var41 != null) {
            var90.method2725(var38, false, var42, -3646, var41, 0, var39, arg11 - 1, var40);
        } else if (var46 != null) {
            var90.method2725(var43, false, var47, -3646, var46, 0, var44, arg6 - 1, var45);
        }
        for (int var93 = 0; var93 < var29; var93++) {
            class672.field9360[var93] = null;
            class42.field417[var93] = null;
            class388.field5240[var93] = null;
        }
        return var90;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILau;ZI)V")
    public final void method852(int arg0, class519 arg1, boolean arg2, int arg3) {
        field1769++;
        int var5 = class105.field1133[arg3];
        if (arg1.method2949((byte) -38, arg0) != null && !arg2) {
            this.field1772[var5] = class422.method2436(Integer.MIN_VALUE, arg0);
            this.method861((byte) -24);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public static void method853(byte arg0) {
        field1782 = null;
        int var1 = -6 / ((61 - arg0) / 41);
        field1783 = null;
        field1768 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IILfb;I)V")
    public final void method854(int arg0, int arg1, class53 arg2, int arg3) {
        if (arg3 != 24842) {
            return;
        }
        field1775++;
        if (arg0 == -1) {
            this.field1772[arg1] = 0;
        } else if (arg2.method272(arg0, -11824) != null) {
            this.field1772[arg1] = class422.method2436(1073741824, arg0);
            this.method861((byte) -24);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILau;ZLr;Loj;ILlb;IIIII)Lda;")
    public final class473 method855(int arg0, class519 arg1, boolean arg2, class564 arg3, class541 arg4, int arg5, class257 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field1761++;
        int var13 = arg11;
        if (arg6 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            var13 = arg11 | 0x20;
            int var21 = arg6.field3218[arg10];
            Object var22 = null;
            int var23 = var21 >>> 16;
            int var24 = var21 & 0xFFFF;
            class479 var25 = arg4.method3042(var23, (byte) -21);
            if (var25 != null) {
                var15 |= var25.method2756(var24, (byte) -101);
                var14 |= var25.method2758(var24, 7527);
                var17 |= var25.method2755(-102, var24);
                var16 |= arg6.field3219;
            }
            if ((arg6.field3221 || class510.field7317) && arg7 != -1 && arg6.field3218.length > arg7) {
                int var26 = arg6.field3218[arg7];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class479 var29;
                if (var23 == var27) {
                    var29 = var25;
                } else {
                    var29 = arg4.method3042(var28 >>> 16, (byte) -21);
                }
                if (var29 != null) {
                    var15 |= var29.method2756(var28, (byte) -71);
                    var14 |= var29.method2758(var28, 7527);
                    var17 |= var29.method2755(-118, var28);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        long var30 = (long) arg8 | (long) (arg9 << 16) | (long) arg0 << 32;
        class19 var32 = class256.field3203;
        class473 var33;
        synchronized (class256.field3203) {
            var33 = (class473) class256.field3203.method78(0, var30);
        }
        if (var33 == null || arg3.method973(var33.method1861(), var13) != 0) {
            if (var33 != null) {
                var13 = arg3.method1004(var13, var33.method1861());
            }
            class581[] var35 = new class581[3];
            int var36 = 0;
            if (!arg1.method2949((byte) -108, arg8).method1398(-1116) || !arg1.method2949((byte) -25, arg9).method1398(-1116) || !arg1.method2949((byte) -55, arg0).method1398(-1116)) {
                return null;
            }
            class581 var37 = arg1.method2949((byte) -50, arg8).method1401(-77);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class581 var38 = arg1.method2949((byte) -70, arg9).method1401(-35);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class581 var39 = arg1.method2949((byte) -115, arg0).method1401(-128);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            class581 var40 = new class581(var35, var36);
            int var41 = var13 | 0x4000;
            var33 = arg3.method1051(var40, var41, class553.field7892, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                for (int var43 = 0; var43 < class557.field7952.length; var43++) {
                    if (this.field1781[var42] < class557.field7952[var43][var42].length) {
                        var33.method1882(class90.field899[var43][var42], class557.field7952[var43][var42][this.field1781[var42]]);
                    }
                }
            }
            var33.method1907(var13);
            class19 var44 = class256.field3203;
            synchronized (class256.field3203) {
                class256.field3203.method92(1, var30, var33);
            }
        }
        if (arg6 == null) {
            return var33;
        } else {
            class473 var45 = var33.method1877((byte) 4, var13, arg2);
            return arg6.method1525(arg5, arg10, var45, arg7, arg11, (byte) -55);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZI)I")
    public static final int method856(boolean arg0, int arg1) {
        if (arg0) {
            return 63;
        } else {
            field1779++;
            return arg1 >>> 7;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lks;IILoj;Lau;Lnv;Llb;Lfb;IIZLr;)Lda;")
    public final class473 method857(class30 arg0, int arg1, int arg2, class541 arg3, class519 arg4, class63 arg5, class257 arg6, class53 arg7, int arg8, int arg9, boolean arg10, class564 arg11) {
        field1762++;
        if (this.field1774 != -1) {
            return arg5.method342(-14190, this.field1774).method1245(arg1, arg11, arg3, arg0, arg6, arg8, arg9, arg2, -51);
        }
        int var13 = arg9;
        if (arg6 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            int var22 = arg6.field3218[arg2];
            var13 = arg9 | 0x20;
            int var23 = var22 >>> 16;
            int var24 = var22 & 0xFFFF;
            class479 var25 = arg3.method3042(var23, (byte) -21);
            if (var25 != null) {
                var15 |= var25.method2756(var24, (byte) -46);
                var14 |= var25.method2758(var24, 7527);
                var17 |= var25.method2755(-74, var24);
                var16 |= arg6.field3219;
            }
            if ((arg6.field3221 || class510.field7317) && arg1 != -1 && arg6.field3218.length > arg1) {
                int var26 = arg6.field3218[arg1];
                int var27 = var26 >>> 16;
                class479 var28 = var23 == var27 ? var25 : arg3.method3042(var27, (byte) -21);
                int var29 = var26 & 0xFFFF;
                if (var28 != null) {
                    var15 |= var28.method2756(var29, (byte) -101);
                    var14 |= var28.method2758(var29, 7527);
                    var17 |= var28.method2755(-102, var29);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        class19 var30 = class256.field3203;
        class473 var31;
        synchronized (class256.field3203) {
            var31 = (class473) class256.field3203.method78(0, this.field1760);
        }
        if (var31 == null || arg11.method973(var31.method1861(), var13) != 0) {
            if (var31 != null) {
                var13 = arg11.method1004(var13, var31.method1861());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field1772[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((var35 & Integer.MIN_VALUE) != 0 && !arg4.method2949((byte) -86, var35 & 0x3FFFFFFF).method1398(-1116)) {
                        var33 = true;
                    }
                } else if (!arg7.method272(var35 & 0x3FFFFFFF, -11824).method2823(this.field1770, (byte) 57)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class581[] var36 = new class581[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field1772[var38];
                if ((var39 & 0x40000000) != 0) {
                    class581 var41 = arg7.method272(var39 & 0x3FFFFFFF, -11824).method2816(this.field1770, (byte) 108);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                } else if ((Integer.MIN_VALUE & var39) != 0) {
                    class581 var40 = arg4.method2949((byte) -40, var39 & 0x3FFFFFFF).method1401(-82);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                }
            }
            int var42 = var13 | 0x4000;
            class581 var43 = new class581(var36, var37);
            var31 = arg11.method1051(var43, var42, class553.field7892, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                for (int var45 = 0; var45 < class557.field7952.length; var45++) {
                    if (class557.field7952[var45][var44].length > this.field1781[var44]) {
                        var31.method1882(class90.field899[var45][var44], class557.field7952[var45][var44][this.field1781[var44]]);
                    }
                }
            }
            var31.method1907(var13);
            class19 var46 = class256.field3203;
            synchronized (class256.field3203) {
                class256.field3203.method92(1, this.field1760, var31);
            }
        }
        if (arg6 == null) {
            return var31;
        } else {
            var31.method1877((byte) 4, var13, arg10);
            return arg6.method1525(arg8, arg2, var31, arg1, arg9, (byte) -55);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public static final void method858(int arg0) {
        if (class81.field838 < 0) {
            class81.field838 = 0;
            class453.field6485 = -1;
            class634.field8930 = -1;
        }
        field1765++;
        if (class482.field6946 < class81.field838) {
            class634.field8930 = -1;
            class453.field6485 = -1;
            class81.field838 = class482.field6946;
        }
        if (class36.field373 < 0) {
            class36.field373 = 0;
            class453.field6485 = -1;
            class634.field8930 = -1;
        }
        if (class482.field6964 < class36.field373) {
            class634.field8930 = -1;
            class453.field6485 = -1;
            class36.field373 = class482.field6964;
        }
        if (arg0 < 100) {
            field1768 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZII)V")
    public final void method859(boolean arg0, int arg1, int arg2) {
        this.field1781[arg2] = arg1;
        if (!arg0) {
            field1780 = -5;
        }
        field1778++;
        this.method861((byte) -24);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([IIBI[IZ)V")
    public final void method860(int[] arg0, int arg1, byte arg2, int arg3, int[] arg4, boolean arg5) {
        if (this.field1767 != arg1) {
            this.field1766 = null;
            this.field1767 = arg1;
        }
        this.field1774 = arg3;
        this.field1772 = arg4;
        this.field1770 = arg5;
        if (arg2 > 121) {
            field1764++;
            this.field1781 = arg0;
            this.method861((byte) -24);
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V")
    private final void method861(byte arg0) {
        field1771++;
        this.field1760 = -1L;
        long[] var2 = class85.field861;
        this.field1760 = this.field1760 >>> 8 ^ var2[(int) (((long) (this.field1767 >> 8) ^ this.field1760) & 0xFFL)];
        if (arg0 != -24) {
            this.method860(null, -76, (byte) -34, 82, null, false);
        }
        this.field1760 = this.field1760 >>> 8 ^ var2[(int) (((long) this.field1767 ^ this.field1760) & 0xFFL)];
        for (int var3 = 0; var3 < 12; var3++) {
            this.field1760 = this.field1760 >>> 8 ^ var2[(int) (((long) (this.field1772[var3] >> 24) ^ this.field1760) & 0xFFL)];
            this.field1760 = var2[(int) (((long) (this.field1772[var3] >> 16) ^ this.field1760) & 0xFFL)] ^ this.field1760 >>> 8;
            this.field1760 = var2[(int) ((this.field1760 ^ (long) (this.field1772[var3] >> 8)) & 0xFFL)] ^ this.field1760 >>> 8;
            this.field1760 = this.field1760 >>> 8 ^ var2[(int) ((this.field1760 ^ (long) this.field1772[var3]) & 0xFFL)];
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field1760 = this.field1760 >>> 8 ^ var2[(int) ((this.field1760 ^ (long) this.field1781[var4]) & 0xFFL)];
        }
        this.field1760 = this.field1760 >>> 8 ^ var2[(int) ((this.field1760 ^ (long) (this.field1770 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)Ljava/lang/String;")
    public static final String method862(int arg0) {
        field1777++;
        if (class188.field2148 || class348.field4664 == null) {
            return "";
        } else {
            if (arg0 != 0) {
                method858(29);
            }
            return class348.field4664.field4221;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZB)V")
    public final void method863(boolean arg0, byte arg1) {
        field1763++;
        if (arg1 == 113) {
            this.field1770 = arg0;
            this.method861((byte) -24);
        }
    }
}
