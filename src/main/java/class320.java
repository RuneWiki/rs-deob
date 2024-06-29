import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class320 {

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "I")
    public int field4808 = -1;

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "[C")
    public static char[] field4811 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!eu", name = "m", descriptor = "I")
    public static int field4818 = 100;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!eu", name = "i", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!eu", name = "l", descriptor = "I")
    private int field4817;

    @OriginalMember(owner = "client!eu", name = "p", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!eu", name = "r", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!eu", name = "s", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!eu", name = "t", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!eu", name = "u", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!eu", name = "v", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!eu", name = "j", descriptor = "J")
    private long field4815;

    @OriginalMember(owner = "client!eu", name = "o", descriptor = "J")
    private long field4820;

    @OriginalMember(owner = "client!eu", name = "h", descriptor = "Z")
    public boolean field4813;

    @OriginalMember(owner = "client!eu", name = "k", descriptor = "[I")
    private int[] field4816;

    @OriginalMember(owner = "client!eu", name = "q", descriptor = "[I")
    public int[] field4822;

    @OriginalMember(owner = "client!eu", name = "n", descriptor = "[[I")
    private int[][] field4819;

    static {
        new class423("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lqq;Lnc;ILrt;IIILfn;IIII)Lcd;", line = 4)
    public final class198 method2001(class318 arg0, class21 arg1, int arg2, class144 arg3, int arg4, int arg5, int arg6, class87 arg7, int arg8, int arg9, int arg10, int arg11) {
        field4814++;
        if (arg6 != 65535) {
            this.method2009(-61, 7, 97);
        }
        int var13 = arg5;
        if (arg7 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            int var22 = arg7.field1512[arg10];
            var13 = arg5 | 0x20;
            int var23 = var22 >>> 16;
            class312 var24 = arg1.method108(var23, arg6 ^ 0xFFFC);
            int var25 = var22 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method1863(false, var25);
                var14 |= var24.method1867(var25, arg6 ^ 0xFFFF0044);
                var17 |= var24.method1865(arg6 ^ 0xFFFF0048, var25);
                var16 |= arg7.field1501;
            }
            if ((arg7.field1523 || class4.field43) && arg9 != -1 && arg7.field1512.length > arg9) {
                int var26 = arg7.field1512[arg9];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class312 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg1.method108(var28 >>> 16, 3);
                }
                if (var29 != null) {
                    var15 |= var29.method1863(false, var28);
                    var14 |= var29.method1867(var28, 100);
                    var17 |= var29.method1865(-119, var28);
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
        long var30 = (long) arg8 | (long) (arg4 << 16) | (long) arg11 << 32;
        class288 var32 = class93.field1667;
        class198 var33;
        synchronized (class93.field1667) {
            var33 = (class198) class93.field1667.method1752(0, var30);
        }
        if (var33 == null || arg0.method1944(var33.method489(), var13) != 0) {
            if (var33 != null) {
                var13 = arg0.method1951(var13, var33.method489());
            }
            class303[] var35 = new class303[3];
            int var36 = 0;
            if (!arg3.method948(arg8, 3).method2060(-101) || !arg3.method948(arg4, 3).method2060(-100) || !arg3.method948(arg11, 3).method2060(-118)) {
                return null;
            }
            class303 var37 = arg3.method948(arg8, 3).method2055(0);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class303 var38 = arg3.method948(arg4, 3).method2055(0);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class303 var39 = arg3.method948(arg11, 3).method2055(arg6 ^ 0xFFFF);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            class303 var40 = new class303(var35, var36);
            int var41 = var13 | 0x4000;
            var33 = arg0.method1908(var40, var41, class57.field977, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                if (this.field4822[var42] < class67.field1088[var42].length) {
                    var33.method485(class405.field5892[var42], class67.field1088[var42][this.field4822[var42]]);
                }
                if (this.field4822[var42] < class457.field7009[var42].length) {
                    var33.method485(class497.field7546[var42], class457.field7009[var42][this.field4822[var42]]);
                }
            }
            var33.method504(var13);
            class288 var43 = class93.field1667;
            synchronized (class93.field1667) {
                class93.field1667.method1758(1, var33, var30);
            }
        }
        if (arg7 == null) {
            return var33;
        } else {
            class198 var44 = var33.method511((byte) 4, var13, true);
            return arg7.method611(122, arg5, var44, arg10, arg2, arg9);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lfn;IILdv;IIIZII[Lcc;Lmo;Lrr;Lqq;ILdr;Lfn;Lrt;Lnc;)Lcd;", line = 157)
    public final class198 method2002(class87 arg0, int arg1, int arg2, class451 arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, class493[] arg10, class507 arg11, class234 arg12, class318 arg13, int arg14, class485 arg15, class87 arg16, class144 arg17, class21 arg18) {
        field4824++;
        if (this.field4808 != -1) {
            return arg3.method2688(this.field4808, -8333).method1471(arg13, arg2, arg0, arg14, arg1, arg18, arg5, arg10, arg8, arg16, arg9, arg12, (byte) 73, arg15, arg6);
        }
        int var20 = arg2;
        long var21 = this.field4820;
        int[] var23 = this.field4816;
        if (arg16 != null && (arg16.field1510 >= 0 || arg16.field1507 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field4816[var24];
            }
            if (arg16.field1510 >= 0) {
                if (arg16.field1510 == 65535) {
                    var21 ^= 0xFFFFFFFF00000000L;
                    var23[5] = 0;
                } else {
                    var23[5] = class318.method1973(arg16.field1510, 1073741824);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg16.field1507 >= 0) {
                if (arg16.field1507 == 65535) {
                    var21 ^= 0xFFFFFFFFL;
                    var23[3] = 0;
                } else {
                    var23[3] = class318.method1973(1073741824, arg16.field1507);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg16 != null || arg0 != null;
        int var29 = arg10 == null ? 0 : arg10.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class37.field499[var30] = null;
            if (arg10[var30] != null) {
                class87 var31 = arg18.method106(-120, arg10[var30].field7507);
                if (var31.field1512 != null) {
                    var28 = true;
                    class296.field4494[var30] = var31;
                    int var32 = arg10[var30].field7512;
                    int var33 = arg10[var30].field7505;
                    int var34 = var31.field1512[var32];
                    class37.field499[var30] = arg18.method108(var34 >>> 16, 3);
                    int var35 = var34 & 0xFFFF;
                    class290.field4402[var30] = var35;
                    if (class37.field499[var30] != null) {
                        var26 |= class37.field499[var30].method1863(false, var35);
                        var25 |= class37.field499[var30].method1867(var35, -73);
                        var27 |= class37.field499[var30].method1865(arg4 ^ 0xFFFF8DEE, var35);
                    }
                    if ((var31.field1523 || class4.field43) && var33 != -1 && var33 < var31.field1512.length) {
                        class322.field4843[var30] = var31.field1526[var32];
                        class236.field3572[var30] = arg10[var30].field7509;
                        int var36 = var31.field1512[var33];
                        class117.field1963[var30] = arg18.method108(var36 >>> 16, arg4 - 29308);
                        int var37 = var36 & 0xFFFF;
                        class165.field2573[var30] = var37;
                        if (class117.field1963[var30] != null) {
                            var26 |= class117.field1963[var30].method1863(false, var37);
                            var25 |= class117.field1963[var30].method1867(var37, arg4 ^ 0xFFFF8D93);
                            var27 |= class117.field1963[var30].method1865(-76, var37);
                        }
                    } else {
                        class322.field4843[var30] = 0;
                        class236.field3572[var30] = 0;
                        class117.field1963[var30] = null;
                        class165.field2573[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class312 var41 = null;
        class312 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class312 var46 = null;
        class312 var47 = null;
        if (var28) {
            var20 = arg2 | 0x20;
            if (arg16 != null) {
                int var48 = arg16.field1512[arg8];
                int var49 = var48 >>> 16;
                var38 = var48 & 0xFFFF;
                var41 = arg18.method108(var49, arg4 - 29308);
                if (var41 != null) {
                    var26 |= var41.method1863(false, var38);
                    var25 |= var41.method1867(var38, 100);
                    var27 |= var41.method1865(-35, var38);
                }
                if ((arg16.field1523 || class4.field43) && arg14 != -1 && arg16.field1512.length > arg14) {
                    int var50 = arg16.field1512[arg14];
                    var40 = arg16.field1526[arg8];
                    int var51 = var50 >>> 16;
                    var39 = var50 & 0xFFFF;
                    var42 = var49 == var51 ? var41 : arg18.method108(var51, 3);
                    if (var42 != null) {
                        var26 |= var42.method1863(false, var39);
                        var25 |= var42.method1867(var39, 123);
                        var27 |= var42.method1865(-119, var39);
                    }
                }
            }
            if (arg0 != null) {
                int var52 = arg0.field1512[arg6];
                int var53 = var52 >>> 16;
                var46 = arg18.method108(var53, 3);
                var43 = var52 & 0xFFFF;
                if (var46 != null) {
                    var26 |= var46.method1863(false, var43);
                    var25 |= var46.method1867(var43, arg4 - 29213);
                    var27 |= var46.method1865(-51, var43);
                }
                if ((arg0.field1523 || class4.field43) && arg5 != -1 && arg0.field1512.length > arg5) {
                    var45 = arg0.field1526[arg6];
                    int var54 = arg0.field1512[arg5];
                    int var55 = var54 >>> 16;
                    var44 = var54 & 0xFFFF;
                    var47 = var53 == var55 ? var46 : arg18.method108(var55, arg4 ^ 0x727C);
                    if (var47 != null) {
                        var26 |= var47.method1863(false, var44);
                        var25 |= var47.method1867(var44, -86);
                        var27 |= var47.method1865(-73, var44);
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
        class288 var56 = class33.field452;
        class198 var57;
        synchronized (class33.field452) {
            var57 = (class198) class33.field452.method1752(0, var21);
        }
        class14 var58 = null;
        if (this.field4817 != -1) {
            var58 = arg12.method1405(this.field4817, -122);
        }
        if (var57 == null || arg13.method1944(var57.method489(), var20) != 0 || var58 != null && var58.field164 != null && this.field4819 == null) {
            if (var57 != null) {
                var20 = arg13.method1951(var20, var57.method489());
            }
            boolean var60 = false;
            for (int var61 = 0; var61 < 12; var61++) {
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var62) != 0 && !arg17.method948(var62 & 0x3FFFFFFF, 3).method2054(arg4 - 25215)) {
                        var60 = true;
                    }
                } else if (!arg11.method3030((byte) 91, var62 & 0x3FFFFFFF).method1145(this.field4813, arg4 - 29312)) {
                    var60 = true;
                }
            }
            if (var60) {
                if (this.field4815 != -1L) {
                    class288 var63 = class33.field452;
                    synchronized (class33.field452) {
                        var57 = (class198) class33.field452.method1752(arg4 ^ 0x727F, this.field4815);
                    }
                }
                if (var57 == null || arg13.method1944(var57.method489(), var20) != 0 || var58 != null && var58.field164 != null && this.field4819 == null) {
                    return null;
                }
            } else {
                class303[] var64 = new class303[12];
                for (int var65 = 0; var65 < 12; var65++) {
                    int var66 = var23[var65];
                    if ((var66 & 0x40000000) != 0) {
                        class303 var67 = arg11.method3030((byte) 64, var66 & 0x3FFFFFFF).method1143(-60, this.field4813);
                        if (var67 != null) {
                            var64[var65] = var67;
                        }
                    } else if ((var66 & Integer.MIN_VALUE) != 0) {
                        class303 var68 = arg17.method948(var66 & 0x3FFFFFFF, 3).method2057(0);
                        if (var68 != null) {
                            var64[var65] = var68;
                        }
                    }
                }
                if (var58 != null && var58.field164 != null) {
                    for (int var69 = 0; var69 < var58.field164.length; var69++) {
                        if (var58.field164[var69] != null && var64[var69] != null) {
                            int var70 = var58.field164[var69][0];
                            int var71 = var58.field164[var69][1];
                            int var72 = var58.field164[var69][2];
                            int var73 = var58.field164[var69][3] << 3;
                            int var74 = var58.field164[var69][4] << 3;
                            int var75 = var58.field164[var69][5] << 3;
                            if (this.field4819 == null) {
                                this.field4819 = new int[var58.field164.length][];
                            }
                            if (this.field4819[var69] == null) {
                                int[] var76 = this.field4819[var69] = new int[15];
                                if (var73 == 0 && var74 == 0 && var75 == 0) {
                                    var76[12] = -var70;
                                    var76[0] = var76[4] = var76[8] = 32768;
                                    var76[14] = -var72;
                                    var76[13] = -var71;
                                } else {
                                    int var77 = class195.field3077[var73];
                                    int var78 = class195.field3075[var73];
                                    int var79 = class195.field3077[var74];
                                    int var80 = class195.field3075[var74];
                                    int var81 = class195.field3077[var75];
                                    int var82 = class195.field3075[var75];
                                    int var83 = var78 * var81 + 16384 >> 15;
                                    int var84 = var78 * var82 + 16384 >> 15;
                                    var76[2] = var77 * var80 + 16384 >> 15;
                                    var76[5] = -var78;
                                    var76[3] = var77 * var82 + 16384 >> 15;
                                    var76[6] = -var80 * var81 + var79 * var84 + 16384 >> 15;
                                    var76[4] = var77 * var81 + 16384 >> 15;
                                    var76[1] = -var82 * var79 + var80 * var83 + 16384 >> 15;
                                    var76[8] = var77 * var79 + 16384 >> 15;
                                    var76[7] = -var80 * -var82 + var79 * var83 + 16384 >> 15;
                                    var76[0] = var79 * var81 + var80 * var84 + 16384 >> 15;
                                    var76[13] = var76[1] * -var70 + (var76[4] * -var71) + var76[7] * -var72 + 16384 >> 15;
                                    var76[12] = var76[6] * -var72 + var76[3] * -var71 + var76[0] * -var70 + 16384 >> 15;
                                    var76[14] = var76[2] * -var70 + var76[5] * -var71 + var76[8] * -var72 + 16384 >> 15;
                                }
                                var76[11] = var72;
                                var76[10] = var71;
                                var76[9] = var70;
                            }
                            if (var73 != 0 || var74 != 0 || var75 != 0) {
                                var64[var69].method1823(var75, var73, var74, 1);
                            }
                            if (var70 != 0 || var71 != 0 || var72 != 0) {
                                var64[var69].method1820(var72, 0, var70, var71);
                            }
                        }
                    }
                }
                int var85 = var20 | 0x4000;
                class303 var86 = new class303(var64, var64.length);
                var57 = arg13.method1908(var86, var85, class57.field977, 64, 850);
                for (int var87 = 0; var87 < 5; var87++) {
                    if (this.field4822[var87] < class67.field1088[var87].length) {
                        var57.method485(class405.field5892[var87], class67.field1088[var87][this.field4822[var87]]);
                    }
                    if (class457.field7009[var87].length > this.field4822[var87]) {
                        var57.method485(class497.field7546[var87], class457.field7009[var87][this.field4822[var87]]);
                    }
                }
                if (arg7) {
                    var57.method504(var20);
                    class288 var88 = class33.field452;
                    synchronized (class33.field452) {
                        class33.field452.method1758(1, var57, var21);
                    }
                    this.field4815 = var21;
                }
            }
        }
        class198 var89 = var57.method511((byte) 4, var20, true);
        if (!var28) {
            return var89;
        }
        int var90 = 0;
        int var91 = 1;
        while (var90 < var29) {
            if (class37.field499[var90] != null) {
                var89.method1235(123, var91, this.field4819 == null ? null : this.field4819[var90], false, 0, class165.field2573[var90], class322.field4843[var90], class117.field1963[var90], class290.field4402[var90], class236.field3572[var90] - 1, class37.field499[var90]);
            }
            var90++;
            var91 <<= 0x1;
        }
        if (var41 != null && var46 != null) {
            var89.method1233(var40, var45, arg1 - 1, var41, var38, var46, arg9 - 1, (byte) -14, var43, arg16.field1528, var44, var42, var47, var39, false);
        } else if (var41 != null) {
            var89.method1232(0, var40, (byte) -92, var42, var38, arg1 - 1, var39, false, var41);
        } else if (var46 != null) {
            var89.method1232(0, var45, (byte) -115, var47, var43, arg9 - 1, var44, false, var46);
        }
        for (int var92 = 0; var92 < var29; var92++) {
            class37.field499[var92] = null;
            class117.field1963[var92] = null;
            class296.field4494[var92] = null;
        }
        if (arg4 != 29311) {
            this.field4816 = null;
        }
        return var89;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IZ)V", line = 667)
    public final void method2003(int arg0, boolean arg1) {
        if (arg0 != Integer.MIN_VALUE) {
            this.method2005(null, false, -121, null, (byte) -126, 28);
        }
        field4807++;
        this.field4813 = arg1;
        this.method2007((byte) -63);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IILnc;Lrt;Lfn;Ldr;Lmo;Lqq;Ldv;III)Lcd;", line = 679)
    public final class198 method2004(int arg0, int arg1, class21 arg2, class144 arg3, class87 arg4, class485 arg5, class507 arg6, class318 arg7, class451 arg8, int arg9, int arg10, int arg11) {
        field4823++;
        if (this.field4808 != -1) {
            return arg8.method2688(this.field4808, -8333).method1475(arg4, arg9, arg7, arg1, arg10, arg2, arg5, (byte) 51, arg0);
        }
        int var13 = arg10;
        if (arg4 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg4.field1512[arg0];
            var13 = arg10 | 0x20;
            Object var22 = null;
            int var23 = var21 >>> 16;
            class312 var24 = arg2.method108(var23, 3);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method1863(false, var25);
                var14 |= var24.method1867(var25, arg11 + 18168);
                var17 |= var24.method1865(-61, var25);
                var16 |= arg4.field1501;
            }
            if ((arg4.field1523 || class4.field43) && arg1 != -1 && arg1 < arg4.field1512.length) {
                int var26 = arg4.field1512[arg1];
                int var27 = var26 >>> 16;
                class312 var28 = var23 == var27 ? var24 : arg2.method108(var27, 3);
                int var29 = var26 & 0xFFFF;
                if (var28 != null) {
                    var15 |= var28.method1863(false, var29);
                    var14 |= var28.method1867(var29, -116);
                    var17 |= var28.method1865(-116, var29);
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
        class288 var30 = class93.field1667;
        class198 var31;
        synchronized (class93.field1667) {
            var31 = (class198) class93.field1667.method1752(arg11 ^ arg11, this.field4820);
        }
        if (var31 == null || arg7.method1944(var31.method489(), var13) != 0) {
            if (var31 != null) {
                var13 = arg7.method1951(var13, var31.method489());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field4816[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var35) != 0 && !arg3.method948(var35 & 0x3FFFFFFF, 3).method2060(-96)) {
                        var33 = true;
                    }
                } else if (!arg6.method3030((byte) 53, var35 & 0x3FFFFFFF).method1133((byte) -1, this.field4813)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class303[] var36 = new class303[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field4816[var38];
                if ((var39 & 0x40000000) != 0) {
                    class303 var40 = arg6.method3030((byte) 49, var39 & 0x3FFFFFFF).method1140(this.field4813, 0);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                } else if ((var39 & Integer.MIN_VALUE) != 0) {
                    class303 var41 = arg3.method948(var39 & 0x3FFFFFFF, 3).method2055(arg11 + 18046);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                }
            }
            class303 var42 = new class303(var36, var37);
            int var43 = var13 | 0x4000;
            var31 = arg7.method1908(var42, var43, class57.field977, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                if (class67.field1088[var44].length > this.field4822[var44]) {
                    var31.method485(class405.field5892[var44], class67.field1088[var44][this.field4822[var44]]);
                }
                if (class457.field7009[var44].length > this.field4822[var44]) {
                    var31.method485(class497.field7546[var44], class457.field7009[var44][this.field4822[var44]]);
                }
            }
            var31.method504(var13);
            class288 var45 = class93.field1667;
            synchronized (class93.field1667) {
                class93.field1667.method1758(arg11 ^ 0xFFFFB983, var31, this.field4820);
            }
        }
        if (arg4 == null) {
            return var31;
        } else {
            var31.method511((byte) 4, var13, true);
            return arg4.method611(88, arg10, var31, arg0, arg9, arg1);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "([IZI[IBI)V", line = 871)
    public final void method2005(int[] arg0, boolean arg1, int arg2, int[] arg3, byte arg4, int arg5) {
        if (arg4 < 70) {
            this.method2004(-61, 127, null, null, null, null, null, null, null, -105, -78, -84);
        }
        this.field4816 = arg0;
        this.field4808 = arg2;
        field4825++;
        this.field4813 = arg1;
        if (this.field4817 != arg5) {
            this.field4819 = null;
            this.field4817 = arg5;
        }
        this.field4822 = arg3;
        this.method2007((byte) -113);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V", line = 894)
    public static void method2006(int arg0) {
        field4811 = null;
        int var1 = 21 % ((arg0 - 56) / 35);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)V", line = 910)
    private final void method2007(byte arg0) {
        field4821++;
        this.field4820 = -1L;
        long[] var2 = class483.field7371;
        this.field4820 = var2[(int) ((this.field4820 ^ (long) (this.field4817 >> 8)) & 0xFFL)] ^ this.field4820 >>> 8;
        this.field4820 = var2[(int) ((this.field4820 ^ (long) this.field4817) & 0xFFL)] ^ this.field4820 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field4820 = this.field4820 >>> 8 ^ var2[(int) (((long) (this.field4816[var3] >> 24) ^ this.field4820) & 0xFFL)];
            this.field4820 = var2[(int) (((long) (this.field4816[var3] >> 16) ^ this.field4820) & 0xFFL)] ^ this.field4820 >>> 8;
            this.field4820 = this.field4820 >>> 8 ^ var2[(int) ((this.field4820 ^ (long) (this.field4816[var3] >> 8)) & 0xFFL)];
            this.field4820 = this.field4820 >>> 8 ^ var2[(int) ((this.field4820 ^ (long) this.field4816[var3]) & 0xFFL)];
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field4820 = var2[(int) (((long) this.field4822[var4] ^ this.field4820) & 0xFFL)] ^ this.field4820 >>> 8;
        }
        if (arg0 < -61) {
            this.field4820 = var2[(int) ((this.field4820 ^ (long) (this.field4813 ? 1 : 0)) & 0xFFL)] ^ this.field4820 >>> 8;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IILrt;I)V", line = 947)
    public final void method2008(int arg0, int arg1, class144 arg2, int arg3) {
        field4806++;
        int var5 = class309.field4664[arg1];
        if (this.field4816[var5] != 0 && arg2.method948(arg0, arg3 - 2147483645) != null) {
            this.field4816[var5] = class318.method1973(arg3, arg0);
            this.method2007((byte) -96);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(III)V", line = 967)
    public final void method2009(int arg0, int arg1, int arg2) {
        if (arg1 == 16384) {
            field4812++;
            this.field4822[arg2] = arg0;
            this.method2007((byte) -78);
        }
    }
}
