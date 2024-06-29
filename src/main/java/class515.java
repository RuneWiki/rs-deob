import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class515 {

    @OriginalMember(owner = "client!mw", name = "f", descriptor = "I")
    public int field7351 = -1;

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "Lke;")
    public static class622 field7348 = new class622(23, 3);

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "I")
    public static int field7349;

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "I")
    public static int field7350;

    @OriginalMember(owner = "client!mw", name = "g", descriptor = "I")
    public static int field7352;

    @OriginalMember(owner = "client!mw", name = "h", descriptor = "I")
    public static int field7353;

    @OriginalMember(owner = "client!mw", name = "k", descriptor = "I")
    public static int field7356;

    @OriginalMember(owner = "client!mw", name = "l", descriptor = "I")
    public static int field7357;

    @OriginalMember(owner = "client!mw", name = "m", descriptor = "I")
    public static int field7358;

    @OriginalMember(owner = "client!mw", name = "n", descriptor = "I")
    public static int field7359;

    @OriginalMember(owner = "client!mw", name = "p", descriptor = "I")
    public static int field7361;

    @OriginalMember(owner = "client!mw", name = "r", descriptor = "I")
    private int field7363;

    @OriginalMember(owner = "client!mw", name = "t", descriptor = "I")
    public static int field7365;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "J")
    private long field7346;

    @OriginalMember(owner = "client!mw", name = "o", descriptor = "J")
    private long field7360;

    @OriginalMember(owner = "client!mw", name = "s", descriptor = "Lnm;")
    public static class496 field7364;

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "Z")
    public boolean field7347;

    @OriginalMember(owner = "client!mw", name = "i", descriptor = "[I")
    public int[] field7354;

    @OriginalMember(owner = "client!mw", name = "q", descriptor = "[I")
    private int[] field7362;

    @OriginalMember(owner = "client!mw", name = "j", descriptor = "[Laf;")
    private class457[] field7355;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IZI)I", line = 6)
    public static final int method2996(int arg0, boolean arg1, int arg2) {
        field7352++;
        if (arg1) {
            method3004((byte) 47);
        }
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg0 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "([IZIII[I[Laf;)V", line = 46)
    public final void method2997(int[] arg0, boolean arg1, int arg2, int arg3, int arg4, int[] arg5, class457[] arg6) {
        this.field7362 = arg5;
        field7353++;
        this.field7354 = arg0;
        this.field7355 = arg6;
        this.field7347 = arg1;
        if (arg4 != 1686504712) {
            field7364 = null;
        }
        if (this.field7363 != arg3) {
            this.field7363 = arg3;
        }
        this.field7351 = arg2;
        this.method3001((byte) -95);
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(I[ILco;IBZLds;Lgf;Lco;IILme;Lgl;ILit;Lqi;Lha;III[Lgda;)Lka;", line = 75)
    public final class495 method2998(int arg0, int[] arg1, class129 arg2, int arg3, byte arg4, boolean arg5, class16 arg6, class289 arg7, class129 arg8, int arg9, int arg10, class204 arg11, class624 arg12, int arg13, class671 arg14, class591 arg15, class66 arg16, int arg17, int arg18, int arg19, class61[] arg20) {
        field7361++;
        if (this.field7351 != -1) {
            return arg11.method1466((byte) -3, this.field7351).method1815(arg20, arg0, arg1, arg8, arg19, arg17, arg2, arg9, null, (byte) -80, arg15, arg13, arg18, arg7, arg10, arg3, arg14, arg16);
        }
        int var22 = arg10;
        long var23 = this.field7346;
        int[] var25 = this.field7362;
        boolean var26 = false;
        boolean var27 = false;
        if (arg8 != null && (arg8.field1676 >= 0 || arg8.field1694 >= 0)) {
            var25 = new int[this.field7362.length];
            for (int var28 = 0; var28 < var25.length; var28++) {
                var25[var28] = this.field7362[var28];
            }
            if (arg8.field1676 >= 0) {
                if (arg8.field1676 == 65535) {
                    var25[5] = 0;
                    var23 ^= 0xFFFFFFFF00000000L;
                    var26 = true;
                } else {
                    var25[5] = class281.method1904(1073741824, arg8.field1676);
                    var23 ^= (long) var25[5] << 32;
                }
            }
            if (arg8.field1694 >= 0) {
                var27 = true;
                if (arg8.field1694 == 65535) {
                    var25[3] = 0;
                    var23 ^= 0xFFFFFFFFL;
                } else {
                    var25[3] = class281.method1904(1073741824, arg8.field1694);
                    var23 ^= var25[3];
                }
            }
        }
        boolean var29 = false;
        boolean var30 = false;
        boolean var31 = false;
        boolean var32 = arg8 != null || arg2 != null;
        int var33 = arg20 == null ? 0 : arg20.length;
        for (int var34 = 0; var34 < var33; var34++) {
            class464.field6621[var34] = null;
            if (arg20[var34] != null) {
                class129 var35 = arg7.method1931((byte) -81, arg20[var34].field837);
                if (var35.field1684 != null) {
                    var32 = true;
                    class308.field4587[var34] = var35;
                    int var36 = arg20[var34].field835;
                    int var37 = arg20[var34].field836;
                    int var38 = var35.field1684[var36];
                    class464.field6621[var34] = arg7.method1935(984, var38 >>> 16);
                    int var39 = var38 & 0xFFFF;
                    class380.field5451[var34] = var39;
                    if (class464.field6621[var34] != null) {
                        var30 |= class464.field6621[var34].method3033(true, var39);
                        var29 |= class464.field6621[var34].method3029(false, var39);
                        var31 |= class464.field6621[var34].method3034(var39, 0);
                    }
                    if ((var35.field1686 || class180.field2725) && var37 != -1 && var37 < var35.field1684.length) {
                        class84.field1108[var34] = var35.field1668[var36];
                        class269.field3771[var34] = arg20[var34].field833;
                        int var40 = var35.field1684[var37];
                        class496.field7060[var34] = arg7.method1935(984, var40 >>> 16);
                        int var41 = var40 & 0xFFFF;
                        class413.field5835[var34] = var41;
                        if (class496.field7060[var34] != null) {
                            var30 |= class496.field7060[var34].method3033(true, var41);
                            var29 |= class496.field7060[var34].method3029(false, var41);
                            var31 |= class496.field7060[var34].method3034(var41, 0);
                        }
                    } else {
                        class84.field1108[var34] = 0;
                        class269.field3771[var34] = 0;
                        class496.field7060[var34] = null;
                        class413.field5835[var34] = -1;
                    }
                }
            }
        }
        int var42 = -1;
        int var43 = -1;
        int var44 = 0;
        class520 var45 = null;
        class520 var46 = null;
        int var47 = -1;
        int var48 = -1;
        int var49 = 0;
        class520 var50 = null;
        class520 var51 = null;
        if (var32) {
            if (arg8 != null) {
                int var52 = arg8.field1684[arg17];
                int var53 = var52 >>> 16;
                var45 = arg7.method1935(984, var53);
                var42 = var52 & 0xFFFF;
                if (var45 != null) {
                    var30 |= var45.method3033(true, var42);
                    var29 |= var45.method3029(false, var42);
                    var31 |= var45.method3034(var42, 0);
                }
                if ((arg8.field1686 || class180.field2725) && arg18 != -1 && arg18 < arg8.field1684.length) {
                    int var54 = arg8.field1684[arg18];
                    var44 = arg8.field1668[arg17];
                    int var55 = var54 >>> 16;
                    var46 = var53 == var55 ? var45 : arg7.method1935(984, var55);
                    var43 = var54 & 0xFFFF;
                    if (var46 != null) {
                        var30 |= var46.method3033(true, var43);
                        var29 |= var46.method3029(false, var43);
                        var31 |= var46.method3034(var43, 0);
                    }
                }
            }
            var22 = arg10 | 0x20;
            if (arg2 != null) {
                int var56 = arg2.field1684[arg3];
                int var57 = var56 >>> 16;
                var47 = var56 & 0xFFFF;
                var50 = arg7.method1935(984, var57);
                if (var50 != null) {
                    var30 |= var50.method3033(true, var47);
                    var29 |= var50.method3029(false, var47);
                    var31 |= var50.method3034(var47, 0);
                }
                if ((arg2.field1686 || class180.field2725) && arg0 != -1 && arg0 < arg2.field1684.length) {
                    var49 = arg2.field1668[arg3];
                    int var58 = arg2.field1684[arg0];
                    int var59 = var58 >>> 16;
                    var48 = var58 & 0xFFFF;
                    var51 = var57 == var59 ? var50 : arg7.method1935(984, var59);
                    if (var51 != null) {
                        var30 |= var51.method3033(true, var48);
                        var29 |= var51.method3029(false, var48);
                        var31 |= var51.method3034(var48, 0);
                    }
                }
            }
            if (var30) {
                var22 |= 0x80;
            }
            if (var29) {
                var22 |= 0x100;
            }
            if (var31) {
                var22 |= 0x400;
            }
        }
        class387 var60 = class211.field3052;
        class495 var61;
        synchronized (class211.field3052) {
            var61 = (class495) class211.field3052.method2373(var23, 103);
        }
        class607 var62 = null;
        if (this.field7363 != -1) {
            var62 = arg14.method3800(false, this.field7363);
        }
        if (var61 == null || arg16.method451(var61.method113(), var22) != 0) {
            if (var61 != null) {
                var22 = arg16.method421(var22, var61.method113());
            }
            boolean var64 = false;
            int var65 = 0;
            while (true) {
                if (var65 >= var25.length) {
                    if (var64) {
                        if (this.field7360 != -1L) {
                            class387 var88 = class211.field3052;
                            synchronized (class211.field3052) {
                                var61 = (class495) class211.field3052.method2373(this.field7360, 103);
                            }
                        }
                        if (var61 == null || arg16.method451(var61.method113(), var22) != 0) {
                            return null;
                        }
                    } else {
                        class229[] var69 = new class229[var25.length];
                        for (int var70 = 0; var70 < var25.length; var70++) {
                            int var71 = var25[var70];
                            class457 var72 = null;
                            boolean var73 = var70 == 5 && var26 || var70 == 3 && var27;
                            if ((var71 & 0x40000000) != 0) {
                                if (!var73 && this.field7355 != null && this.field7355[var70] != null) {
                                    var72 = this.field7355[var70];
                                }
                                class229 var74 = arg12.method3567(var71 & 0x3FFFFFFF, true).method2911(-31837, var72, this.field7347);
                                if (var74 != null) {
                                    var69[var70] = var74;
                                }
                            } else if ((var71 & Integer.MIN_VALUE) != 0) {
                                class229 var75 = arg6.method141((byte) 14, var71 & 0x3FFFFFFF).method1472((byte) -126);
                                if (var75 != null) {
                                    var69[var70] = var75;
                                }
                            }
                        }
                        if (var62 != null && var62.field8572 != null) {
                            for (int var76 = 0; var76 < var62.field8572.length; var76++) {
                                if (var69[var76] != null) {
                                    int var77 = 0;
                                    int var78 = 0;
                                    int var79 = 0;
                                    int var80 = 0;
                                    int var81 = 0;
                                    int var82 = 0;
                                    if (var62.field8572[var76] != null) {
                                        var81 = var62.field8572[var76][4] << 3;
                                        var78 = var62.field8572[var76][1];
                                        var79 = var62.field8572[var76][2];
                                        var80 = var62.field8572[var76][3] << 3;
                                        var77 = var62.field8572[var76][0];
                                        var82 = var62.field8572[var76][5] << 3;
                                    }
                                    if (var80 != 0 || var81 != 0 || var82 != 0) {
                                        var69[var76].method1586(var82, var80, 0, var81);
                                    }
                                    if (var77 != 0 || var78 != 0 || var79 != 0) {
                                        var69[var76].method1582(var79, var78, var77, -121);
                                    }
                                }
                            }
                        }
                        class229 var83 = new class229(var69, var69.length);
                        int var84 = var22 | 0x4000;
                        var61 = arg16.method420(var83, var84, class441.field6300, 64, 850);
                        for (int var85 = 0; var85 < 5; var85++) {
                            for (int var86 = 0; var86 < class126.field1651.length; var86++) {
                                if (class126.field1651[var86][var85].length > this.field7354[var85]) {
                                    var61.method111(class481.field6844[var86][var85], class126.field1651[var86][var85][this.field7354[var85]]);
                                }
                            }
                        }
                        if (arg5) {
                            var61.method85(var22);
                            class387 var87 = class211.field3052;
                            synchronized (class211.field3052) {
                                class211.field3052.method2362(var61, 0, var23);
                            }
                            this.field7360 = var23;
                        }
                    }
                    break;
                }
                int var66 = var25[var65];
                class457 var67 = null;
                boolean var68 = var65 == 5 && var26 || var65 == 3 && var27;
                if ((var66 & 0x40000000) != 0) {
                    if (!var68 && this.field7355 != null && this.field7355[var65] != null) {
                        var67 = this.field7355[var65];
                    }
                    if (!arg12.method3567(var66 & 0x3FFFFFFF, true).method2929(12407, this.field7347, var67)) {
                        var64 = true;
                    }
                } else if ((var66 & Integer.MIN_VALUE) != 0 && !arg6.method141((byte) 14, var66 & 0x3FFFFFFF).method1477(-112)) {
                    var64 = true;
                }
                var65++;
            }
        }
        if (arg4 > -8) {
            this.field7346 = 88L;
        }
        class495 var89 = var61.method81((byte) 4, var22, true);
        boolean var90 = false;
        if (arg1 != null) {
            for (int var91 = 0; var91 < arg1.length; var91++) {
                if (arg1[var91] != -1) {
                    var90 = true;
                }
            }
        }
        if (!var32 && !var90) {
            return var89;
        }
        class378[] var92 = null;
        if (var62 != null) {
            var92 = var62.method3499((byte) 4, arg16);
        }
        if (var90 && var92 != null) {
            for (int var93 = 0; var93 < arg1.length; var93++) {
                if (var92[var93] != null) {
                    var89.method110(var92[var93], 0x1 << var93, true);
                }
            }
        }
        int var94 = 0;
        int var95 = 1;
        while (var94 < var33) {
            if (class464.field6621[var94] != null) {
                var89.method2894(class380.field5451[var94], class269.field3771[var94] - 1, null, 0, class496.field7060[var94], class84.field1108[var94], class464.field6621[var94], false, -1, class413.field5835[var94], var95);
            }
            var94++;
            var95 <<= 0x1;
        }
        if (var90) {
            for (int var96 = 0; var96 < arg1.length; var96++) {
                if (arg1[var96] != -1) {
                    int var97 = arg1[var96] - arg13;
                    int var98 = var97 & 0x3FFF;
                    class378 var99 = arg16.method462();
                    var99.method1939(var98);
                    var89.method110(var99, 0x1 << var96, false);
                }
            }
        }
        if (var90 && var92 != null) {
            for (int var100 = 0; var100 < arg1.length; var100++) {
                if (var92[var100] != null) {
                    var89.method110(var92[var100], 0x1 << var100, false);
                }
            }
        }
        if (var45 != null && var50 != null) {
            var89.method2893(var42, var44, arg19 - 1, var49, var43, arg9 - 1, var46, var50, 0, var48, false, var51, arg8.field1687, var47, var45);
        } else if (var45 != null) {
            var89.method2890(var44, var43, -126, var45, var46, false, 0, var42, arg19 - 1);
        } else if (var50 != null) {
            var89.method2890(var49, var48, -124, var50, var51, false, 0, var47, arg9 - 1);
        }
        for (int var101 = 0; var101 < var33; var101++) {
            class464.field6621[var101] = null;
            class496.field7060[var101] = null;
            class308.field4587[var101] = null;
        }
        return var89;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lco;IILha;Lds;Lqi;Lgl;Lme;Lgf;III)Lka;", line = 644)
    public final class495 method2999(class129 arg0, int arg1, int arg2, class66 arg3, class16 arg4, class591 arg5, class624 arg6, class204 arg7, class289 arg8, int arg9, int arg10, int arg11) {
        field7358++;
        if (this.field7351 != -1) {
            return arg7.method1466((byte) -127, this.field7351).method1816(arg11, arg0, null, arg10, arg8, false, arg5, arg2, arg3, arg1);
        }
        if (arg9 != 0) {
            this.method3001((byte) 126);
        }
        int var13 = arg1;
        if (arg0 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg0.field1684[arg10];
            var13 = arg1 | 0x20;
            Object var22 = null;
            int var23 = var21 >>> 16;
            class520 var24 = arg8.method1935(arg9 + 984, var23);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method3033(true, var25);
                var14 |= var24.method3029(false, var25);
                var17 |= var24.method3034(var25, 0);
                var16 |= arg0.field1674;
            }
            if ((arg0.field1686 || class180.field2725) && arg2 != -1 && arg0.field1684.length > arg2) {
                int var26 = arg0.field1684[arg2];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class520 var29 = var23 == var27 ? var24 : arg8.method1935(984, var27);
                if (var29 != null) {
                    var15 |= var29.method3033(true, var28);
                    var14 |= var29.method3029(false, var28);
                    var17 |= var29.method3034(var28, 0);
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
        class387 var30 = class204.field2986;
        class495 var31;
        synchronized (class204.field2986) {
            var31 = (class495) class204.field2986.method2373(this.field7346, 103);
        }
        if (var31 == null || arg3.method451(var31.method113(), var13) != 0) {
            if (var31 != null) {
                var13 = arg3.method421(var13, var31.method113());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < this.field7362.length; var34++) {
                int var35 = this.field7362[var34];
                class457 var36 = null;
                if ((var35 & 0x40000000) != 0) {
                    if (this.field7355 != null && this.field7355[var34] != null) {
                        var36 = this.field7355[var34];
                    }
                    if (!arg6.method3567(var35 & 0x3FFFFFFF, true).method2913(this.field7347, var36, 0)) {
                        var33 = true;
                    }
                } else if ((Integer.MIN_VALUE & var35) != 0 && !arg4.method141((byte) 14, var35 & 0x3FFFFFFF).method1475((byte) 114)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class229[] var37 = new class229[this.field7362.length];
            int var38 = 0;
            for (int var39 = 0; var39 < this.field7362.length; var39++) {
                int var40 = this.field7362[var39];
                class457 var41 = null;
                if ((var40 & 0x40000000) != 0) {
                    if (this.field7355 != null && this.field7355[var39] != null) {
                        var41 = this.field7355[var39];
                    }
                    class229 var42 = arg6.method3567(var40 & 0x3FFFFFFF, true).method2928(true, var41, this.field7347);
                    if (var42 != null) {
                        var37[var38++] = var42;
                    }
                } else if ((var40 & Integer.MIN_VALUE) != 0) {
                    class229 var43 = arg4.method141((byte) 14, var40 & 0x3FFFFFFF).method1479((byte) 54);
                    if (var43 != null) {
                        var37[var38++] = var43;
                    }
                }
            }
            class229 var44 = new class229(var37, var38);
            int var45 = var13 | 0x4000;
            var31 = arg3.method420(var44, var45, class441.field6300, 64, 768);
            for (int var46 = 0; var46 < 5; var46++) {
                for (int var47 = 0; var47 < class126.field1651.length; var47++) {
                    if (this.field7354[var46] < class126.field1651[var47][var46].length) {
                        var31.method111(class481.field6844[var47][var46], class126.field1651[var47][var46][this.field7354[var46]]);
                    }
                }
            }
            var31.method85(var13);
            class387 var48 = class204.field2986;
            synchronized (class204.field2986) {
                class204.field2986.method2362(var31, 0, this.field7346);
            }
        }
        if (arg0 == null) {
            return var31;
        } else {
            var31.method81((byte) 4, var13, true);
            return arg0.method932(-30322, var31, arg1, arg2, arg11, arg10);
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lha;ILds;ILgf;Lco;IIIIIB)Lka;", line = 852)
    public final class495 method3000(class66 arg0, int arg1, class16 arg2, int arg3, class289 arg4, class129 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, byte arg11) {
        field7356++;
        int var13 = arg1;
        if (arg5 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            var13 = arg1 | 0x20;
            int var22 = arg5.field1684[arg7];
            int var23 = var22 >>> 16;
            class520 var24 = arg4.method1935(984, var23);
            int var25 = var22 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method3033(true, var25);
                var14 |= var24.method3029(false, var25);
                var17 |= var24.method3034(var25, 0);
                var16 |= arg5.field1674;
            }
            if ((arg5.field1686 || class180.field2725) && arg6 != -1 && arg6 < arg5.field1684.length) {
                int var26 = arg5.field1684[arg6];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class520 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg4.method1935(984, var28 >>> 16);
                }
                if (var29 != null) {
                    var15 |= var29.method3033(true, var28);
                    var14 |= var29.method3029(false, var28);
                    var17 |= var29.method3034(var28, 0);
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
        long var30 = (long) arg3 | (long) arg8 << 32 | (long) (arg10 << 16);
        int var32 = 21 % ((-arg11 - 55) / 53);
        class387 var33 = class204.field2986;
        class495 var34;
        synchronized (class204.field2986) {
            var34 = (class495) class204.field2986.method2373(var30, 103);
        }
        if (var34 == null || arg0.method451(var34.method113(), var13) != 0) {
            if (var34 != null) {
                var13 = arg0.method421(var13, var34.method113());
            }
            class229[] var36 = new class229[3];
            int var37 = 0;
            if (!arg2.method141((byte) 14, arg3).method1475((byte) 114) || !arg2.method141((byte) 14, arg10).method1475((byte) 114) || !arg2.method141((byte) 14, arg8).method1475((byte) 114)) {
                return null;
            }
            class229 var38 = arg2.method141((byte) 14, arg3).method1479((byte) 54);
            if (var38 != null) {
                var36[var37++] = var38;
            }
            class229 var39 = arg2.method141((byte) 14, arg10).method1479((byte) 54);
            if (var39 != null) {
                var36[var37++] = var39;
            }
            class229 var40 = arg2.method141((byte) 14, arg8).method1479((byte) 54);
            if (var40 != null) {
                var36[var37++] = var40;
            }
            int var41 = var13 | 0x4000;
            class229 var42 = new class229(var36, var37);
            var34 = arg0.method420(var42, var41, class441.field6300, 64, 768);
            for (int var43 = 0; var43 < 5; var43++) {
                for (int var44 = 0; var44 < class126.field1651.length; var44++) {
                    if (this.field7354[var43] < class126.field1651[var44][var43].length) {
                        var34.method111(class481.field6844[var44][var43], class126.field1651[var44][var43][this.field7354[var43]]);
                    }
                }
            }
            var34.method85(var13);
            class387 var45 = class204.field2986;
            synchronized (class204.field2986) {
                class204.field2986.method2362(var34, 0, var30);
            }
        }
        if (arg5 == null) {
            return var34;
        } else {
            class495 var46 = var34.method81((byte) 4, var13, true);
            return arg5.method932(-30322, var46, arg1, arg6, arg9, arg7);
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)V", line = 1009)
    private final void method3001(byte arg0) {
        field7365++;
        long[] var2 = class77.field1030;
        this.field7346 = -1L;
        this.field7346 = var2[(int) ((this.field7346 ^ (long) (this.field7363 >> 8)) & 0xFFL)] ^ this.field7346 >>> 8;
        this.field7346 = var2[(int) (((long) this.field7363 ^ this.field7346) & 0xFFL)] ^ this.field7346 >>> 8;
        for (int var3 = 0; var3 < this.field7362.length; var3++) {
            this.field7346 = var2[(int) ((this.field7346 ^ (long) (this.field7362[var3] >> 24)) & 0xFFL)] ^ this.field7346 >>> 8;
            this.field7346 = var2[(int) ((this.field7346 ^ (long) (this.field7362[var3] >> 16)) & 0xFFL)] ^ this.field7346 >>> 8;
            this.field7346 = this.field7346 >>> 8 ^ var2[(int) ((this.field7346 ^ (long) (this.field7362[var3] >> 8)) & 0xFFL)];
            this.field7346 = var2[(int) (((long) this.field7362[var3] ^ this.field7346) & 0xFFL)] ^ this.field7346 >>> 8;
        }
        if (this.field7355 != null) {
            for (int var4 = 0; var4 < this.field7355.length; var4++) {
                if (this.field7355[var4] != null) {
                    int[] var5;
                    int[] var6;
                    if (this.field7347) {
                        var5 = this.field7355[var4].field6546;
                        var6 = this.field7355[var4].field6553;
                    } else {
                        var5 = this.field7355[var4].field6555;
                        var6 = this.field7355[var4].field6556;
                    }
                    if (var6 != null) {
                        for (int var7 = 0; var7 < var6.length; var7++) {
                            this.field7346 = var2[(int) ((this.field7346 ^ (long) (var6[var7] >> 8)) & 0xFFL)] ^ this.field7346 >>> 8;
                            this.field7346 = this.field7346 >>> 8 ^ var2[(int) ((this.field7346 ^ (long) var6[var7]) & 0xFFL)];
                        }
                    }
                    if (var5 != null) {
                        for (int var8 = 0; var8 < var5.length; var8++) {
                            this.field7346 = this.field7346 >>> 8 ^ var2[(int) (((long) (var5[var8] >> 8) ^ this.field7346) & 0xFFL)];
                            this.field7346 = this.field7346 >>> 8 ^ var2[(int) (((long) var5[var8] ^ this.field7346) & 0xFFL)];
                        }
                    }
                    if (this.field7355[var4].field6554 != null) {
                        for (int var9 = 0; var9 < this.field7355[var4].field6554.length; var9++) {
                            this.field7346 = this.field7346 >>> 8 ^ var2[(int) ((this.field7346 ^ (long) (this.field7355[var4].field6554[var9] >> 8)) & 0xFFL)];
                            this.field7346 = var2[(int) (((long) this.field7355[var4].field6554[var9] ^ this.field7346) & 0xFFL)] ^ this.field7346 >>> 8;
                        }
                    }
                    if (this.field7355[var4].field6552 != null) {
                        for (int var10 = 0; var10 < this.field7355[var4].field6552.length; var10++) {
                            this.field7346 = var2[(int) (((long) (this.field7355[var4].field6552[var10] >> 8) ^ this.field7346) & 0xFFL)] ^ this.field7346 >>> 8;
                            this.field7346 = var2[(int) ((this.field7346 ^ (long) this.field7355[var4].field6552[var10]) & 0xFFL)] ^ this.field7346 >>> 8;
                        }
                    }
                }
            }
        }
        for (int var11 = 0; var11 < 5; var11++) {
            this.field7346 = this.field7346 >>> 8 ^ var2[(int) ((this.field7346 ^ (long) this.field7354[var11]) & 0xFFL)];
        }
        if (arg0 >= -27) {
            field7364 = null;
        }
        this.field7346 = var2[(int) ((this.field7346 ^ (long) (this.field7347 ? 1 : 0)) & 0xFFL)] ^ this.field7346 >>> 8;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lds;III)V", line = 1134)
    public final void method3002(class16 arg0, int arg1, int arg2, int arg3) {
        field7359++;
        if (arg3 > -16) {
            return;
        }
        int var5 = class512.field7311[arg2];
        if (arg0.method141((byte) 14, arg1) != null) {
            this.field7362[var5] = class281.method1904(Integer.MIN_VALUE, arg1);
            this.method3001((byte) -64);
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(ZZ)V", line = 1152)
    public final void method3003(boolean arg0, boolean arg1) {
        field7350++;
        this.field7347 = arg0;
        if (arg1) {
            field7348 = null;
        }
        this.method3001((byte) -114);
    }

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(B)V", line = 1168)
    public static void method3004(byte arg0) {
        if (arg0 >= 91) {
            field7348 = null;
            field7364 = null;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IBILgl;)V", line = 1182)
    public final void method3005(int arg0, byte arg1, int arg2, class624 arg3) {
        if (arg1 != -27) {
            return;
        }
        field7349++;
        if (arg0 == -1) {
            this.field7362[arg2] = 0;
        } else if (arg3.method3567(arg0, true) != null) {
            this.field7362[arg2] = class281.method1904(1073741824, arg0);
            this.method3001((byte) -89);
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(ZII)V", line = 1203)
    public final void method3006(boolean arg0, int arg1, int arg2) {
        field7357++;
        this.field7354[arg2] = arg1;
        if (arg0) {
            this.method3001((byte) -40);
        }
    }
}
