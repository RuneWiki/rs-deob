import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class247 {

    @OriginalMember(owner = "client!pfa", name = "q", descriptor = "I")
    public int field3684 = -1;

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "Lqk;")
    public static class1 field3669 = new class1(41, 4);

    @OriginalMember(owner = "client!pfa", name = "h", descriptor = "Liga;")
    public static class91 field3675 = new class91(3, 7);

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!pfa", name = "d", descriptor = "I")
    private int field3671;

    @OriginalMember(owner = "client!pfa", name = "e", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!pfa", name = "f", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!pfa", name = "i", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!pfa", name = "k", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!pfa", name = "m", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!pfa", name = "n", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!pfa", name = "r", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!pfa", name = "s", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!pfa", name = "c", descriptor = "J")
    private long field3670;

    @OriginalMember(owner = "client!pfa", name = "g", descriptor = "J")
    private long field3674;

    @OriginalMember(owner = "client!pfa", name = "p", descriptor = "Z")
    public boolean field3683;

    @OriginalMember(owner = "client!pfa", name = "l", descriptor = "[I")
    public int[] field3679;

    @OriginalMember(owner = "client!pfa", name = "o", descriptor = "[I")
    private int[] field3682;

    @OriginalMember(owner = "client!pfa", name = "j", descriptor = "[Lsd;")
    private class294[] field3677;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIIILoia;Lgf;Lgf;Z[Lnw;Lpd;Lgia;ILha;Lkd;ILvfa;ILfg;[III)Lka;", line = 10)
    public final class231 method1660(int arg0, int arg1, int arg2, int arg3, class643 arg4, class73 arg5, class73 arg6, boolean arg7, class695[] arg8, class645 arg9, class512 arg10, int arg11, class473 arg12, class787 arg13, int arg14, class484 arg15, int arg16, class436 arg17, int[] arg18, int arg19, int arg20) {
        field3686++;
        if (this.field3684 != -1) {
            return arg13.method4318(this.field3684, -197).method3654(65535, arg19, null, arg6, arg16, arg12, arg20, arg9, arg4, arg5, arg2, arg14, arg8, arg3, arg0, arg15, arg11, arg18);
        }
        int var22 = arg0;
        long var23 = this.field3674;
        int[] var25 = this.field3682;
        boolean var26 = false;
        boolean var27 = false;
        if (arg5 != null && (arg5.field797 >= 0 || arg5.field799 >= 0)) {
            var25 = new int[this.field3682.length];
            for (int var28 = 0; var28 < var25.length; var28++) {
                var25[var28] = this.field3682[var28];
            }
            if (arg5.field797 >= 0) {
                if (arg5.field797 == 65535) {
                    var25[5] = 0;
                    var26 = true;
                    var23 ^= 0xFFFFFFFF00000000L;
                } else {
                    var25[5] = class613.method3544(arg5.field797, 1073741824);
                    var23 ^= (long) var25[5] << 32;
                }
            }
            if (arg5.field799 >= 0) {
                if (arg5.field799 == 65535) {
                    var23 ^= 0xFFFFFFFFL;
                    var25[3] = 0;
                } else {
                    var25[3] = class613.method3544(arg5.field799, 1073741824);
                    var23 ^= var25[3];
                }
                var27 = true;
            }
        }
        boolean var29 = false;
        boolean var30 = false;
        boolean var31 = false;
        boolean var32 = arg5 != null || arg6 != null;
        int var33 = arg8 == null ? 0 : arg8.length;
        for (int var34 = 0; var34 < var33; var34++) {
            class302.field4405[var34] = null;
            if (arg8[var34] != null) {
                class73 var35 = arg9.method3695(arg8[var34].field9692, (byte) -109);
                if (var35.field816 != null) {
                    var32 = true;
                    class25.field231[var34] = var35;
                    int var36 = arg8[var34].field9689;
                    int var37 = arg8[var34].field9697;
                    int var38 = var35.field816[var36];
                    class302.field4405[var34] = arg9.method3694(var38 >>> 16, 3702);
                    int var39 = var38 & 0xFFFF;
                    class726.field10049[var34] = var39;
                    if (class302.field4405[var34] != null) {
                        var30 |= class302.field4405[var34].method971(var39, arg1 + 15591);
                        var29 |= class302.field4405[var34].method974(15333, var39);
                        var31 |= class302.field4405[var34].method972(var39, 0);
                    }
                    if ((var35.field804 || class738.field10171) && var37 != -1 && var37 < var35.field816.length) {
                        class548.field7651[var34] = var35.field817[var36];
                        class499.field6840[var34] = arg8[var34].field9690;
                        int var40 = var35.field816[var37];
                        class447.field6264[var34] = arg9.method3694(var40 >>> 16, 3702);
                        int var41 = var40 & 0xFFFF;
                        class394.field5600[var34] = var41;
                        if (class447.field6264[var34] != null) {
                            var30 |= class447.field6264[var34].method971(var41, 0);
                            var29 |= class447.field6264[var34].method974(15333, var41);
                            var31 |= class447.field6264[var34].method972(var41, 0);
                        }
                    } else {
                        class548.field7651[var34] = 0;
                        class499.field6840[var34] = 0;
                        class447.field6264[var34] = null;
                        class394.field5600[var34] = -1;
                    }
                }
            }
        }
        int var42 = -1;
        int var43 = -1;
        int var44 = 0;
        class146 var45 = null;
        class146 var46 = null;
        int var47 = -1;
        int var48 = -1;
        int var49 = 0;
        class146 var50 = null;
        class146 var51 = null;
        if (var32) {
            if (arg5 != null) {
                int var52 = arg5.field816[arg3];
                int var53 = var52 >>> 16;
                var45 = arg9.method3694(var53, arg1 + 19293);
                var42 = var52 & 0xFFFF;
                if (var45 != null) {
                    var30 |= var45.method971(var42, 0);
                    var29 |= var45.method974(15333, var42);
                    var31 |= var45.method972(var42, 0);
                }
                if ((arg5.field804 || class738.field10171) && arg14 != -1 && arg14 < arg5.field816.length) {
                    int var54 = arg5.field816[arg14];
                    var44 = arg5.field817[arg3];
                    int var55 = var54 >>> 16;
                    var46 = var53 == var55 ? var45 : arg9.method3694(var55, arg1 + 19293);
                    var43 = var54 & 0xFFFF;
                    if (var46 != null) {
                        var30 |= var46.method971(var43, 0);
                        var29 |= var46.method974(arg1 ^ 0xFFFFF8FC, var43);
                        var31 |= var46.method972(var43, arg1 ^ 0xFFFFC319);
                    }
                }
            }
            var22 = arg0 | 0x20;
            if (arg6 != null) {
                int var56 = arg6.field816[arg19];
                int var57 = var56 >>> 16;
                var50 = arg9.method3694(var57, 3702);
                var47 = var56 & 0xFFFF;
                if (var50 != null) {
                    var30 |= var50.method971(var47, 0);
                    var29 |= var50.method974(15333, var47);
                    var31 |= var50.method972(var47, 0);
                }
                if ((arg6.field804 || class738.field10171) && arg11 != -1 && arg11 < arg6.field816.length) {
                    var49 = arg6.field817[arg19];
                    int var58 = arg6.field816[arg11];
                    int var59 = var58 >>> 16;
                    var48 = var58 & 0xFFFF;
                    var51 = var57 == var59 ? var50 : arg9.method3694(var59, arg1 ^ 0xFFFFCD6F);
                    if (var51 != null) {
                        var30 |= var51.method971(var48, 0);
                        var29 |= var51.method974(15333, var48);
                        var31 |= var51.method972(var48, 0);
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
        class39 var60 = class129.field1672;
        class231 var61;
        synchronized (class129.field1672) {
            var61 = (class231) class129.field1672.method312(0, var23);
        }
        class148 var62 = null;
        if (this.field3671 != -1) {
            var62 = arg15.method2879((byte) 92, this.field3671);
        }
        if (arg1 != -15591) {
            this.method1663(null, null, null, 39, null, -92, null, null, 44, 34, -28, null);
        }
        if (var61 == null || arg12.method188(var61.method1587(), var22) != 0) {
            if (var61 != null) {
                var22 = arg12.method198(var22, var61.method1587());
            }
            boolean var64 = false;
            int var65 = 0;
            while (true) {
                if (var65 >= var25.length) {
                    if (var64) {
                        if (this.field3670 != -1L) {
                            class39 var88 = class129.field1672;
                            synchronized (class129.field1672) {
                                var61 = (class231) class129.field1672.method312(0, this.field3670);
                            }
                        }
                        if (var61 == null || arg12.method188(var61.method1587(), var22) != 0) {
                            return null;
                        }
                    } else {
                        class534[] var69 = new class534[var25.length];
                        for (int var70 = 0; var70 < var25.length; var70++) {
                            int var71 = var25[var70];
                            class294 var72 = null;
                            boolean var73 = var70 == 5 && var26 || var70 == 3 && var27;
                            if ((var71 & 0x40000000) != 0) {
                                if (!var73 && this.field3677 != null && this.field3677[var70] != null) {
                                    var72 = this.field3677[var70];
                                }
                                class534 var75 = arg10.method3051((byte) -20, var71 & 0x3FFFFFFF).method3403(var72, this.field3683, 49);
                                if (var75 != null) {
                                    var69[var70] = var75;
                                }
                            } else if ((var71 & Integer.MIN_VALUE) != 0) {
                                class534 var74 = arg17.method2620(var71 & 0x3FFFFFFF, 3).method2157(arg1 ^ 0xFFFFC319);
                                if (var74 != null) {
                                    var69[var70] = var74;
                                }
                            }
                        }
                        if (var62 != null && var62.field1899 != null) {
                            for (int var76 = 0; var76 < var62.field1899.length; var76++) {
                                if (var69[var76] != null) {
                                    int var77 = 0;
                                    int var78 = 0;
                                    int var79 = 0;
                                    int var80 = 0;
                                    int var81 = 0;
                                    int var82 = 0;
                                    if (var62.field1899[var76] != null) {
                                        var81 = var62.field1899[var76][4] << 3;
                                        var77 = var62.field1899[var76][0];
                                        var79 = var62.field1899[var76][2];
                                        var80 = var62.field1899[var76][3] << 3;
                                        var78 = var62.field1899[var76][1];
                                        var82 = var62.field1899[var76][5] << 3;
                                    }
                                    if (var80 != 0 || var81 != 0 || var82 != 0) {
                                        var69[var76].method3165((byte) 29, var82, var80, var81);
                                    }
                                    if (var77 != 0 || var78 != 0 || var79 != 0) {
                                        var69[var76].method3171(true, var79, var78, var77);
                                    }
                                }
                            }
                        }
                        class534 var83 = new class534(var69, var69.length);
                        int var84 = var22 | 0x4000;
                        var61 = arg12.method231(var83, var84, class607.field8550, 64, 850);
                        for (int var85 = 0; var85 < 5; var85++) {
                            for (int var86 = 0; var86 < class140.field1791.length; var86++) {
                                if (class140.field1791[var86][var85].length > this.field3679[var85]) {
                                    var61.method1552(class472.field6536[var86][var85], class140.field1791[var86][var85][this.field3679[var85]]);
                                }
                            }
                        }
                        if (arg7) {
                            var61.method1548(var22);
                            class39 var87 = class129.field1672;
                            synchronized (class129.field1672) {
                                class129.field1672.method305(var61, var23, 18320);
                            }
                            this.field3670 = var23;
                        }
                    }
                    break;
                }
                int var66 = var25[var65];
                class294 var67 = null;
                boolean var68 = var65 == 5 && var26 || var65 == 3 && var27;
                if ((var66 & 0x40000000) != 0) {
                    if (!var68 && this.field3677 != null && this.field3677[var65] != null) {
                        var67 = this.field3677[var65];
                    }
                    if (!arg10.method3051((byte) -20, var66 & 0x3FFFFFFF).method3405(var67, this.field3683, 0)) {
                        var64 = true;
                    }
                } else if ((var66 & Integer.MIN_VALUE) != 0 && !arg17.method2620(var66 & 0x3FFFFFFF, arg1 ^ 0xFFFFC31A).method2155((byte) -30)) {
                    var64 = true;
                }
                var65++;
            }
        }
        class231 var89 = var61.method1584((byte) 4, var22, true);
        boolean var90 = false;
        if (arg18 != null) {
            for (int var91 = 0; var91 < arg18.length; var91++) {
                if (arg18[var91] != -1) {
                    var90 = true;
                }
            }
        }
        if (!var32 && !var90) {
            return var89;
        }
        class12[] var92 = null;
        if (var62 != null) {
            var92 = var62.method987(0, arg12);
        }
        if (var90 && var92 != null) {
            for (int var93 = 0; var93 < arg18.length; var93++) {
                if (var92[var93] != null) {
                    var89.method1541(var92[var93], 0x1 << var93, true);
                }
            }
        }
        int var94 = 0;
        int var95 = 1;
        while (var33 > var94) {
            if (class302.field4405[var94] != null) {
                var89.method1546(class726.field10049[var94], 0, null, false, class394.field5600[var94], class447.field6264[var94], var95, 13674, class499.field6840[var94] - 1, class548.field7651[var94], class302.field4405[var94]);
            }
            var94++;
            var95 <<= 0x1;
        }
        if (var90) {
            for (int var96 = 0; var96 < arg18.length; var96++) {
                if (arg18[var96] != -1) {
                    int var97 = arg18[var96] - arg2;
                    int var98 = var97 & 0x3FFF;
                    class12 var99 = arg12.method159();
                    var99.method38(var98);
                    var89.method1541(var99, 0x1 << var96, false);
                }
            }
        }
        if (var90 && var92 != null) {
            for (int var100 = 0; var100 < arg18.length; var100++) {
                if (var92[var100] != null) {
                    var89.method1541(var92[var100], 0x1 << var100, false);
                }
            }
        }
        if (var45 != null && var50 != null) {
            var89.method1558(var46, var47, var42, false, arg20 - 1, var51, -22742, var50, var44, arg5.field807, var43, var49, arg16 - 1, var45, var48);
        } else if (var45 != null) {
            var89.method1538(0, var42, var44, var43, arg1 ^ 0x3C8F, var45, arg20 - 1, var46, false);
        } else if (var50 != null) {
            var89.method1538(0, var47, var49, var48, -103, var50, arg16 - 1, var51, false);
        }
        for (int var101 = 0; var101 < var33; var101++) {
            class302.field4405[var101] = null;
            class447.field6264[var101] = null;
            class25.field231[var101] = null;
        }
        return var89;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Z)V", line = 574)
    private final void method1661(boolean arg0) {
        field3680++;
        long[] var2 = class701.field9771;
        if (arg0) {
            this.field3677 = null;
        }
        this.field3674 = -1L;
        this.field3674 = this.field3674 >>> 8 ^ var2[(int) ((this.field3674 ^ (long) (this.field3671 >> 8)) & 0xFFL)];
        this.field3674 = var2[(int) ((this.field3674 ^ (long) this.field3671) & 0xFFL)] ^ this.field3674 >>> 8;
        for (int var3 = 0; var3 < this.field3682.length; var3++) {
            this.field3674 = this.field3674 >>> 8 ^ var2[(int) ((this.field3674 ^ (long) (this.field3682[var3] >> 24)) & 0xFFL)];
            this.field3674 = this.field3674 >>> 8 ^ var2[(int) ((this.field3674 ^ (long) (this.field3682[var3] >> 16)) & 0xFFL)];
            this.field3674 = this.field3674 >>> 8 ^ var2[(int) ((this.field3674 ^ (long) (this.field3682[var3] >> 8)) & 0xFFL)];
            this.field3674 = this.field3674 >>> 8 ^ var2[(int) ((this.field3674 ^ (long) this.field3682[var3]) & 0xFFL)];
        }
        if (this.field3677 != null) {
            for (int var4 = 0; var4 < this.field3677.length; var4++) {
                if (this.field3677[var4] != null) {
                    int[] var5;
                    int[] var6;
                    if (this.field3683) {
                        var5 = this.field3677[var4].field4318;
                        var6 = this.field3677[var4].field4317;
                    } else {
                        var5 = this.field3677[var4].field4319;
                        var6 = this.field3677[var4].field4312;
                    }
                    if (var6 != null) {
                        for (int var7 = 0; var7 < var6.length; var7++) {
                            this.field3674 = var2[(int) ((this.field3674 ^ (long) (var6[var7] >> 8)) & 0xFFL)] ^ this.field3674 >>> 8;
                            this.field3674 = var2[(int) (((long) var6[var7] ^ this.field3674) & 0xFFL)] ^ this.field3674 >>> 8;
                        }
                    }
                    if (var5 != null) {
                        for (int var8 = 0; var8 < var5.length; var8++) {
                            this.field3674 = this.field3674 >>> 8 ^ var2[(int) (((long) (var5[var8] >> 8) ^ this.field3674) & 0xFFL)];
                            this.field3674 = var2[(int) (((long) var5[var8] ^ this.field3674) & 0xFFL)] ^ this.field3674 >>> 8;
                        }
                    }
                    if (this.field3677[var4].field4311 != null) {
                        for (int var9 = 0; var9 < this.field3677[var4].field4311.length; var9++) {
                            this.field3674 = var2[(int) (((long) (this.field3677[var4].field4311[var9] >> 8) ^ this.field3674) & 0xFFL)] ^ this.field3674 >>> 8;
                            this.field3674 = this.field3674 >>> 8 ^ var2[(int) (((long) this.field3677[var4].field4311[var9] ^ this.field3674) & 0xFFL)];
                        }
                    }
                    if (this.field3677[var4].field4314 != null) {
                        for (int var10 = 0; var10 < this.field3677[var4].field4314.length; var10++) {
                            this.field3674 = this.field3674 >>> 8 ^ var2[(int) ((this.field3674 ^ (long) (this.field3677[var4].field4314[var10] >> 8)) & 0xFFL)];
                            this.field3674 = var2[(int) (((long) this.field3677[var4].field4314[var10] ^ this.field3674) & 0xFFL)] ^ this.field3674 >>> 8;
                        }
                    }
                }
            }
        }
        for (int var11 = 0; var11 < 5; var11++) {
            this.field3674 = this.field3674 >>> 8 ^ var2[(int) ((this.field3674 ^ (long) this.field3679[var11]) & 0xFFL)];
        }
        this.field3674 = var2[(int) ((this.field3674 ^ (long) (this.field3683 ? 1 : 0)) & 0xFFL)] ^ this.field3674 >>> 8;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(BILgia;I)V", line = 706)
    public final void method1662(byte arg0, int arg1, class512 arg2, int arg3) {
        field3685++;
        if (arg0 <= 81) {
            this.method1665(40, null, 18, false, null, (byte) -40, null);
        }
        if (arg1 == -1) {
            this.field3682[arg3] = 0;
        } else if (arg2.method3051((byte) -20, arg1) != null) {
            this.field3682[arg3] = class613.method3544(1073741824, arg1);
            this.method1661(false);
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Lgia;Lgf;Lkd;ILoia;ILfg;Lpd;IIILha;)Lka;", line = 727)
    public final class231 method1663(class512 arg0, class73 arg1, class787 arg2, int arg3, class643 arg4, int arg5, class436 arg6, class645 arg7, int arg8, int arg9, int arg10, class473 arg11) {
        field3668++;
        if (this.field3684 != -1) {
            return arg2.method4318(this.field3684, -197).method3658(arg9, arg5, arg10, arg11, arg3, null, 28099, arg7, arg1, arg4);
        }
        if (arg8 != 1073741824) {
            field3669 = null;
        }
        int var13 = arg5;
        if (arg1 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            var13 = arg5 | 0x20;
            int var22 = arg1.field816[arg3];
            int var23 = var22 >>> 16;
            int var24 = var22 & 0xFFFF;
            class146 var25 = arg7.method3694(var23, 3702);
            if (var25 != null) {
                var15 |= var25.method971(var24, 0);
                var14 |= var25.method974(15333, var24);
                var17 |= var25.method972(var24, 0);
                var16 |= arg1.field819;
            }
            if ((arg1.field804 || class738.field10171) && arg9 != -1 && arg1.field816.length > arg9) {
                int var26 = arg1.field816[arg9];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class146 var29 = var23 == var27 ? var25 : arg7.method3694(var27, 3702);
                if (var29 != null) {
                    var15 |= var29.method971(var28, 0);
                    var14 |= var29.method974(arg8 - 1073726491, var28);
                    var17 |= var29.method972(var28, 0);
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
        class39 var30 = class356.field5132;
        class231 var31;
        synchronized (class356.field5132) {
            var31 = (class231) class356.field5132.method312(arg8 - 1073741824, this.field3674);
        }
        if (var31 == null || arg11.method188(var31.method1587(), var13) != 0) {
            if (var31 != null) {
                var13 = arg11.method198(var13, var31.method1587());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < this.field3682.length; var34++) {
                int var35 = this.field3682[var34];
                class294 var36 = null;
                if ((var35 & 0x40000000) != 0) {
                    if (this.field3677 != null && this.field3677[var34] != null) {
                        var36 = this.field3677[var34];
                    }
                    if (!arg0.method3051((byte) -20, var35 & 0x3FFFFFFF).method3416(false, var36, this.field3683)) {
                        var33 = true;
                    }
                } else if ((var35 & Integer.MIN_VALUE) != 0 && !arg6.method2620(var35 & 0x3FFFFFFF, 3).method2151(17704)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class534[] var37 = new class534[this.field3682.length];
            int var38 = 0;
            for (int var39 = 0; var39 < this.field3682.length; var39++) {
                int var40 = this.field3682[var39];
                class294 var41 = null;
                if ((var40 & 0x40000000) != 0) {
                    if (this.field3677 != null && this.field3677[var39] != null) {
                        var41 = this.field3677[var39];
                    }
                    class534 var42 = arg0.method3051((byte) -20, var40 & 0x3FFFFFFF).method3417(var41, false, this.field3683);
                    if (var42 != null) {
                        var37[var38++] = var42;
                    }
                } else if ((var40 & Integer.MIN_VALUE) != 0) {
                    class534 var43 = arg6.method2620(var40 & 0x3FFFFFFF, arg8 - 1073741821).method2154(arg8 - 1073741824);
                    if (var43 != null) {
                        var37[var38++] = var43;
                    }
                }
            }
            int var44 = var13 | 0x4000;
            class534 var45 = new class534(var37, var38);
            var31 = arg11.method231(var45, var44, class607.field8550, 64, 768);
            for (int var46 = 0; var46 < 5; var46++) {
                for (int var47 = 0; var47 < class140.field1791.length; var47++) {
                    if (class140.field1791[var47][var46].length > this.field3679[var46]) {
                        var31.method1552(class472.field6536[var47][var46], class140.field1791[var47][var46][this.field3679[var46]]);
                    }
                }
            }
            var31.method1548(var13);
            class39 var48 = class356.field5132;
            synchronized (class356.field5132) {
                class356.field5132.method305(var31, this.field3674, 18320);
            }
        }
        if (arg1 == null) {
            return var31;
        } else {
            var31.method1584((byte) 4, var13, true);
            return arg1.method542(arg9, arg10, arg3, arg5, var31, -54);
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(BZ)V", line = 936)
    public final void method1664(byte arg0, boolean arg1) {
        field3676++;
        if (arg0 != 99) {
            this.field3682 = null;
        }
        this.field3683 = arg1;
        this.method1661(false);
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I[IIZ[IB[Lsd;)V", line = 951)
    public final void method1665(int arg0, int[] arg1, int arg2, boolean arg3, int[] arg4, byte arg5, class294[] arg6) {
        this.field3677 = arg6;
        this.field3682 = arg1;
        this.field3679 = arg4;
        int var8 = 79 % ((33 - arg5) / 47);
        field3673++;
        this.field3684 = arg2;
        if (this.field3671 != arg0) {
            this.field3671 = arg0;
        }
        this.field3683 = arg3;
        this.method1661(false);
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ILpd;Lha;IIILfg;ILgf;IIB)Lka;", line = 972)
    public final class231 method1666(int arg0, class645 arg1, class473 arg2, int arg3, int arg4, int arg5, class436 arg6, int arg7, class73 arg8, int arg9, int arg10, byte arg11) {
        field3672++;
        int var13 = arg3;
        if (arg8 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            var13 = arg3 | 0x20;
            int var22 = arg8.field816[arg10];
            int var23 = var22 >>> 16;
            class146 var24 = arg1.method3694(var23, arg11 ^ 0xFFFFF1FC);
            int var25 = var22 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method971(var25, 0);
                var14 |= var24.method974(15333, var25);
                var17 |= var24.method972(var25, arg11 ^ 0xFFFFFF8A);
                var16 |= arg8.field819;
            }
            if ((arg8.field804 || class738.field10171) && arg4 != -1 && arg8.field816.length > arg4) {
                int var26 = arg8.field816[arg4];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class146 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg1.method3694(var28 >>> 16, 3702);
                }
                if (var29 != null) {
                    var15 |= var29.method971(var28, arg11 ^ 0xFFFFFF8A);
                    var14 |= var29.method974(15333, var28);
                    var17 |= var29.method972(var28, 0);
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
        if (arg11 != -118) {
            field3669 = null;
        }
        long var30 = (long) arg5 | (long) arg7 << 32 | (long) (arg9 << 16);
        class39 var32 = class356.field5132;
        class231 var33;
        synchronized (class356.field5132) {
            var33 = (class231) class356.field5132.method312(0, var30);
        }
        if (var33 == null || arg2.method188(var33.method1587(), var13) != 0) {
            if (var33 != null) {
                var13 = arg2.method198(var13, var33.method1587());
            }
            class534[] var35 = new class534[3];
            int var36 = 0;
            if (!arg6.method2620(arg5, 3).method2151(arg11 ^ 0xFFFFBAA2) || !arg6.method2620(arg9, arg11 + 121).method2151(17704) || !arg6.method2620(arg7, arg11 ^ 0xFFFFFF89).method2151(17704)) {
                return null;
            }
            class534 var37 = arg6.method2620(arg5, arg11 ^ 0xFFFFFF89).method2154(arg11 + 118);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class534 var38 = arg6.method2620(arg9, 3).method2154(arg11 + 118);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class534 var39 = arg6.method2620(arg7, 3).method2154(0);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            class534 var40 = new class534(var35, var36);
            int var41 = var13 | 0x4000;
            var33 = arg2.method231(var40, var41, class607.field8550, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                for (int var43 = 0; var43 < class140.field1791.length; var43++) {
                    if (this.field3679[var42] < class140.field1791[var43][var42].length) {
                        var33.method1552(class472.field6536[var43][var42], class140.field1791[var43][var42][this.field3679[var42]]);
                    }
                }
            }
            var33.method1548(var13);
            class39 var44 = class356.field5132;
            synchronized (class356.field5132) {
                class356.field5132.method305(var33, var30, 18320);
            }
        }
        if (arg8 == null) {
            return var33;
        } else {
            class231 var45 = var33.method1584((byte) 4, var13, true);
            return arg8.method542(arg4, arg0, arg10, arg3, var45, 119);
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I)V", line = 1127)
    public static void method1667(int arg0) {
        field3669 = null;
        if (arg0 != 0) {
            field3675 = null;
        }
        field3675 = null;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(III)V", line = 1149)
    public final void method1668(int arg0, int arg1, int arg2) {
        this.field3679[arg0] = arg1;
        field3681++;
        this.method1661(false);
        int var4 = -52 / ((-arg2 - 80) / 41);
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IZILfg;)V", line = 1163)
    public final void method1669(int arg0, boolean arg1, int arg2, class436 arg3) {
        field3678++;
        int var5 = class353.field5113[arg2];
        if (arg3.method2620(arg0, 3) != null) {
            this.field3682[var5] = class613.method3544(Integer.MIN_VALUE, arg0);
            this.method1661(arg1);
        }
    }
}
