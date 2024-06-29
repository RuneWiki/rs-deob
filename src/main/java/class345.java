import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class345 {

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
    public int field4402 = -1;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "Z")
    public static boolean field4391 = false;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    private int field4389;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "J")
    private long field4392;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "J")
    private long field4395;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "Z")
    public boolean field4386;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "[I")
    private int[] field4385;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "[I")
    public static int[] field4394;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "[I")
    public int[] field4400;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "[[I")
    private int[][] field4384;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BZ)V", line = 7)
    public final void method2021(byte arg0, boolean arg1) {
        this.field4386 = arg1;
        field4398++;
        this.method2031(-39);
        if (arg0 != 112) {
            this.field4384 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILhi;Lvm;Lul;ILbw;ZIIZLhi;ILmi;Lqa;I[Lcg;ILii;Lmm;)Lc;", line = 21)
    public final class507 method2022(int arg0, class44 arg1, class314 arg2, class316 arg3, int arg4, class329 arg5, boolean arg6, int arg7, int arg8, boolean arg9, class44 arg10, int arg11, class153 arg12, class129 arg13, int arg14, class447[] arg15, int arg16, class389 arg17, class18 arg18) {
        field4397++;
        if (this.field4402 != -1) {
            return arg2.method1869(this.field4402, false).method74(arg8, arg7, arg14, arg1, arg16, arg12, arg5, arg15, arg0, arg13, -1, arg10, arg11, arg3, arg4);
        }
        int var20 = arg0;
        long var21 = this.field4395;
        int[] var23 = this.field4385;
        if (arg1 != null && (arg1.field638 >= 0 || arg1.field651 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field4385[var24];
            }
            if (arg1.field638 >= 0) {
                if (arg1.field638 == 65535) {
                    var21 ^= 0xFFFFFFFF00000000L;
                    var23[5] = 0;
                } else {
                    var23[5] = class31.method213(arg1.field638, 1073741824);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg1.field651 >= 0) {
                if (arg1.field651 == 65535) {
                    var21 ^= 0xFFFFFFFFL;
                    var23[3] = 0;
                } else {
                    var23[3] = class31.method213(arg1.field651, 1073741824);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg1 != null || arg10 != null;
        int var29 = arg15 == null ? 0 : arg15.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class71.field874[var30] = null;
            if (arg15[var30] != null) {
                class44 var31 = arg5.method1962(arg15[var30].field6218, false);
                if (var31.field640 != null) {
                    var28 = true;
                    class415.field5532[var30] = var31;
                    int var32 = arg15[var30].field6210;
                    int var33 = arg15[var30].field6219;
                    int var34 = var31.field640[var32];
                    class71.field874[var30] = arg5.method1954(var34 >>> 16, -122);
                    int var35 = var34 & 0xFFFF;
                    class324.field4149[var30] = var35;
                    if (class71.field874[var30] != null) {
                        var26 |= class71.field874[var30].method2513(var35, 3553);
                        var25 |= class71.field874[var30].method2510(-1488416952, var35);
                        var27 |= class71.field874[var30].method2511(255, var35);
                    }
                    if ((var31.field660 || class310.field4004) && var33 != -1 && var33 < var31.field640.length) {
                        class222.field2866[var30] = var31.field647[var32];
                        class312.field4029[var30] = arg15[var30].field6214;
                        int var36 = var31.field640[var33];
                        class52.field706[var30] = arg5.method1954(var36 >>> 16, -124);
                        int var37 = var36 & 0xFFFF;
                        class327.field4206[var30] = var37;
                        if (class52.field706[var30] != null) {
                            var26 |= class52.field706[var30].method2513(var37, 3553);
                            var25 |= class52.field706[var30].method2510(-1488416952, var37);
                            var27 |= class52.field706[var30].method2511(255, var37);
                        }
                    } else {
                        class222.field2866[var30] = 0;
                        class312.field4029[var30] = 0;
                        class52.field706[var30] = null;
                        class327.field4206[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class424 var41 = null;
        class424 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class424 var46 = null;
        class424 var47 = null;
        if (var28) {
            if (arg1 != null) {
                int var48 = arg1.field640[arg8];
                int var49 = var48 >>> 16;
                var38 = var48 & 0xFFFF;
                var41 = arg5.method1954(var49, -114);
                if (var41 != null) {
                    var26 |= var41.method2513(var38, 3553);
                    var25 |= var41.method2510(-1488416952, var38);
                    var27 |= var41.method2511(255, var38);
                }
                if ((arg1.field660 || class310.field4004) && arg11 != -1 && arg11 < arg1.field640.length) {
                    int var50 = arg1.field640[arg11];
                    var40 = arg1.field647[arg8];
                    int var51 = var50 >>> 16;
                    var42 = var49 == var51 ? var41 : arg5.method1954(var51, -121);
                    var39 = var50 & 0xFFFF;
                    if (var42 != null) {
                        var26 |= var42.method2513(var39, 3553);
                        var25 |= var42.method2510(-1488416952, var39);
                        var27 |= var42.method2511(255, var39);
                    }
                }
            }
            var20 = arg0 | 0x20;
            if (arg10 != null) {
                int var52 = arg10.field640[arg14];
                int var53 = var52 >>> 16;
                var43 = var52 & 0xFFFF;
                var46 = arg5.method1954(var53, -99);
                if (var46 != null) {
                    var26 |= var46.method2513(var43, 3553);
                    var25 |= var46.method2510(-1488416952, var43);
                    var27 |= var46.method2511(255, var43);
                }
                if ((arg10.field660 || class310.field4004) && arg7 != -1 && arg10.field640.length > arg7) {
                    var45 = arg10.field647[arg14];
                    int var54 = arg10.field640[arg7];
                    int var55 = var54 >>> 16;
                    var47 = var53 == var55 ? var46 : arg5.method1954(var55, -111);
                    var44 = var54 & 0xFFFF;
                    if (var47 != null) {
                        var26 |= var47.method2513(var44, 3553);
                        var25 |= var47.method2510(-1488416952, var44);
                        var27 |= var47.method2511(255, var44);
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
        class11 var56 = class286.field3657;
        class507 var57;
        synchronized (class286.field3657) {
            var57 = (class507) class286.field3657.method78(var21, (byte) -100);
        }
        class371 var58 = null;
        if (this.field4389 != -1) {
            var58 = arg3.method1881(this.field4389, (byte) 54);
        }
        if (var57 == null || arg13.method880(var57.method475(), var20) != 0 || var58 != null && var58.field4804 != null && this.field4384 == null) {
            if (var57 != null) {
                var20 = arg13.method885(var20, var57.method475());
            }
            boolean var60 = false;
            int var61 = 0;
            while (true) {
                if (var61 >= 12) {
                    if (var60) {
                        if (this.field4392 != -1L) {
                            class11 var63 = class286.field3657;
                            synchronized (class286.field3657) {
                                var57 = (class507) class286.field3657.method78(this.field4392, (byte) -121);
                            }
                        }
                        if (var57 == null || arg13.method880(var57.method475(), var20) != 0 || var58 != null && var58.field4804 != null && this.field4384 == null) {
                            return null;
                        }
                    } else {
                        class420[] var64 = new class420[12];
                        for (int var65 = 0; var65 < 12; var65++) {
                            int var66 = var23[var65];
                            if ((var66 & 0x40000000) != 0) {
                                class420 var68 = arg18.method111(var66 & 0x3FFFFFFF, -84).method2976(0, this.field4386);
                                if (var68 != null) {
                                    var64[var65] = var68;
                                }
                            } else if ((var66 & Integer.MIN_VALUE) != 0) {
                                class420 var67 = arg17.method2319((byte) -95, var66 & 0x3FFFFFFF).method2414((byte) -1);
                                if (var67 != null) {
                                    var64[var65] = var67;
                                }
                            }
                        }
                        if (var58 != null && var58.field4804 != null) {
                            for (int var69 = 0; var69 < var58.field4804.length; var69++) {
                                if (var58.field4804[var69] != null && var64[var69] != null) {
                                    int var70 = var58.field4804[var69][0];
                                    int var71 = var58.field4804[var69][1];
                                    int var72 = var58.field4804[var69][2];
                                    int var73 = var58.field4804[var69][3] << 3;
                                    int var74 = var58.field4804[var69][4] << 3;
                                    int var75 = var58.field4804[var69][5] << 3;
                                    if (this.field4384 == null) {
                                        this.field4384 = new int[var58.field4804.length][];
                                    }
                                    if (this.field4384[var69] == null) {
                                        int[] var76 = this.field4384[var69] = new int[15];
                                        if (var73 == 0 && var74 == 0 && var75 == 0) {
                                            var76[0] = var76[4] = var76[8] = 32768;
                                            var76[12] = -var70;
                                            var76[14] = -var72;
                                            var76[13] = -var71;
                                        } else {
                                            int var77 = class21.field397[var73];
                                            int var78 = class21.field385[var73];
                                            int var79 = class21.field397[var74];
                                            int var80 = class21.field385[var74];
                                            int var81 = class21.field397[var75];
                                            int var82 = class21.field385[var75];
                                            int var83 = var78 * var81 + 16384 >> 15;
                                            int var84 = var78 * var82 + 16384 >> 15;
                                            var76[3] = var77 * var82 + 16384 >> 15;
                                            var76[5] = -var78;
                                            var76[2] = var77 * var80 + 16384 >> 15;
                                            var76[4] = var77 * var81 + 16384 >> 15;
                                            var76[8] = var77 * var79 + 16384 >> 15;
                                            var76[1] = -var82 * var79 + (var80 * var83) + 16384 >> 15;
                                            var76[6] = -var80 * var81 + var79 * var84 + 16384 >> 15;
                                            var76[0] = var80 * var84 + var79 * var81 + 16384 >> 15;
                                            var76[7] = -var80 * -var82 + (var79 * var83) + 16384 >> 15;
                                            var76[14] = var76[8] * -var72 + var76[5] * -var71 + var76[2] * -var70 + 16384 >> 15;
                                            var76[13] = var76[7] * -var72 + (var76[1] * -var70 + var76[4] * -var71 + 16384) >> 15;
                                            var76[12] = var76[6] * -var72 + (var76[0] * -var70 - (-(var76[3] * -var71) - 16384)) >> 15;
                                        }
                                        var76[10] = var71;
                                        var76[11] = var72;
                                        var76[9] = var70;
                                    }
                                    if (var73 != 0 || var74 != 0 || var75 != 0) {
                                        var64[var69].method2471(var73, (byte) -72, var74, var75);
                                    }
                                    if (var70 != 0 || var71 != 0 || var72 != 0) {
                                        var64[var69].method2474(var71, var70, arg9, var72);
                                    }
                                }
                            }
                        }
                        int var85 = var20 | 0x4000;
                        class420 var86 = new class420(var64, var64.length);
                        var57 = arg13.method888(var86, var85, class375.field4873, 64, 850);
                        for (int var87 = 0; var87 < 5; var87++) {
                            if (this.field4400[var87] < class331.field4252[var87].length) {
                                var57.method478(class352.field4501[var87], class331.field4252[var87][this.field4400[var87]]);
                            }
                            if (this.field4400[var87] < class133.field1814[var87].length) {
                                var57.method478(class233.field3027[var87], class133.field1814[var87][this.field4400[var87]]);
                            }
                        }
                        if (arg6) {
                            var57.method517(var20);
                            class11 var88 = class286.field3657;
                            synchronized (class286.field3657) {
                                class286.field3657.method88(var21, 102, var57);
                            }
                            this.field4392 = var21;
                        }
                    }
                    break;
                }
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((var62 & Integer.MIN_VALUE) != 0 && !arg17.method2319((byte) -92, var62 & 0x3FFFFFFF).method2413(-116)) {
                        var60 = true;
                    }
                } else if (!arg18.method111(var62 & 0x3FFFFFFF, 74).method2968(this.field4386, -1)) {
                    var60 = true;
                }
                var61++;
            }
        }
        class507 var89 = var57.method510((byte) 4, var20, arg9);
        if (!var28) {
            return var89;
        }
        int var90 = 0;
        int var91 = 1;
        while (var29 > var90) {
            if (class71.field874[var90] != null) {
                var89.method3016(class71.field874[var90], var91, this.field4384 == null ? null : this.field4384[var90], false, 0, class222.field2866[var90], class324.field4149[var90], true, class327.field4206[var90], class312.field4029[var90] - 1, class52.field706[var90]);
            }
            var91 <<= 0x1;
            var90++;
        }
        if (var41 != null && var46 != null) {
            var89.method3014(arg16 - 1, arg4 - 1, arg1.field667, var38, var40, var44, var46, false, 62, var42, var47, var43, var39, var45, var41);
        } else if (var41 != null) {
            var89.method3018(var38, var41, var40, arg4 - 1, 0, var39, var42, false, (byte) 59);
        } else if (var46 != null) {
            var89.method3018(var43, var46, var45, arg16 - 1, 0, var44, var47, false, (byte) 59);
        }
        for (int var92 = 0; var92 < var29; var92++) {
            class71.field874[var92] = null;
            class52.field706[var92] = null;
            class415.field5532[var92] = null;
        }
        return var89;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([J[IIII)V", line = 525)
    public static final void method2023(long[] arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var5 = -15 / ((35 - arg4) / 47);
        if (arg2 < arg3) {
            int var6 = (arg2 + arg3) / 2;
            int var7 = arg2;
            long var8 = arg0[var6];
            arg0[var6] = arg0[arg3];
            arg0[arg3] = var8;
            int var10 = arg1[var6];
            arg1[var6] = arg1[arg3];
            arg1[arg3] = var10;
            int var11 = ~var8 == Long.MIN_VALUE ? 0 : 1;
            for (int var12 = arg2; var12 < arg3; var12++) {
                if (arg0[var12] < (long) (var11 & var12) + var8) {
                    long var13 = arg0[var12];
                    arg0[var12] = arg0[var7];
                    arg0[var7] = var13;
                    int var15 = arg1[var12];
                    arg1[var12] = arg1[var7];
                    arg1[var7++] = var15;
                }
            }
            arg0[arg3] = arg0[var7];
            arg0[var7] = var8;
            arg1[arg3] = arg1[var7];
            arg1[var7] = var10;
            method2023(arg0, arg1, arg2, var7 - 1, 111);
            method2023(arg0, arg1, var7 + 1, arg3, 101);
        }
        field4399++;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZIILii;Lqa;ILhi;ILbw;II)Lc;", line = 579)
    public final class507 method2024(int arg0, boolean arg1, int arg2, int arg3, class389 arg4, class129 arg5, int arg6, class44 arg7, int arg8, class329 arg9, int arg10, int arg11) {
        field4393++;
        if (arg1) {
            return null;
        }
        int var13 = arg11;
        if (arg7 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            var13 = arg11 | 0x20;
            int var22 = arg7.field640[arg3];
            int var23 = var22 >>> 16;
            class424 var24 = arg9.method1954(var23, -109);
            int var25 = var22 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method2513(var25, 3553);
                var14 |= var24.method2510(-1488416952, var25);
                var17 |= var24.method2511(255, var25);
                var16 |= arg7.field646;
            }
            if ((arg7.field660 || class310.field4004) && arg2 != -1 && arg7.field640.length > arg2) {
                int var26 = arg7.field640[arg2];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class424 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg9.method1954(var28 >>> 16, -99);
                }
                if (var29 != null) {
                    var15 |= var29.method2513(var28, 3553);
                    var14 |= var29.method2510(-1488416952, var28);
                    var17 |= var29.method2511(255, var28);
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
        long var30 = (long) (arg6 << 16) | (long) arg8 << 32 | (long) arg10;
        class11 var32 = class324.field4156;
        class507 var33;
        synchronized (class324.field4156) {
            var33 = (class507) class324.field4156.method78(var30, (byte) -96);
        }
        if (var33 == null || arg5.method880(var33.method475(), var13) != 0) {
            if (var33 != null) {
                var13 = arg5.method885(var13, var33.method475());
            }
            class420[] var35 = new class420[3];
            int var36 = 0;
            if (!arg4.method2319((byte) -105, arg10).method2416(0) || !arg4.method2319((byte) -89, arg6).method2416(0) || !arg4.method2319((byte) -126, arg8).method2416(0)) {
                return null;
            }
            class420 var37 = arg4.method2319((byte) -113, arg10).method2412(-25);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class420 var38 = arg4.method2319((byte) -89, arg6).method2412(103);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class420 var39 = arg4.method2319((byte) -120, arg8).method2412(-123);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class420 var41 = new class420(var35, var36);
            var33 = arg5.method888(var41, var40, class375.field4873, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                if (this.field4400[var42] < class331.field4252[var42].length) {
                    var33.method478(class352.field4501[var42], class331.field4252[var42][this.field4400[var42]]);
                }
                if (this.field4400[var42] < class133.field1814[var42].length) {
                    var33.method478(class233.field3027[var42], class133.field1814[var42][this.field4400[var42]]);
                }
            }
            var33.method517(var13);
            class11 var43 = class324.field4156;
            synchronized (class324.field4156) {
                class324.field4156.method88(var30, 47, var33);
            }
        }
        if (arg7 == null) {
            return var33;
        } else {
            class507 var44 = var33.method510((byte) 4, var13, true);
            return arg7.method285(arg3, -24, arg11, arg0, var44, arg2);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V", line = 731)
    public static void method2025(byte arg0) {
        field4394 = null;
        int var1 = -78 % ((arg0 - 31) / 37);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([IIBZ[II)V", line = 743)
    public final void method2026(int[] arg0, int arg1, byte arg2, boolean arg3, int[] arg4, int arg5) {
        this.field4402 = arg1;
        this.field4385 = arg4;
        if (this.field4389 != arg5) {
            this.field4384 = null;
            this.field4389 = arg5;
        }
        if (arg2 > -43) {
            this.field4386 = true;
        }
        this.field4400 = arg0;
        this.field4386 = arg3;
        field4382++;
        this.method2031(-53);
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V", line = 765)
    public static final void method2027(byte arg0) {
        class91.field1263.method901(((float) class421.field5647.field7698 * 0.1F + 0.7F) * 1.1523438F);
        field4401++;
        class91.field1263.method840(class343.field4370, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
        class91.field1263.method842(class344.field4380, -1, 256);
        if (arg0 >= -95) {
            method2029((byte) -116, 85, -58, 104, 123);
        }
        class91.field1263.method862(class200.field2584);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILvm;Lbw;ILmm;ILqa;Lmi;ILhi;ILii;)Lc;", line = 779)
    public final class507 method2028(int arg0, class314 arg1, class329 arg2, int arg3, class18 arg4, int arg5, class129 arg6, class153 arg7, int arg8, class44 arg9, int arg10, class389 arg11) {
        field4403++;
        if (~this.field4402 != arg8) {
            return arg1.method1869(this.field4402, false).method65(arg7, arg2, arg6, arg5, arg3, (byte) -122, arg0, arg9, arg10);
        }
        int var13 = arg3;
        if (arg9 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            var13 = arg3 | 0x20;
            int var22 = arg9.field640[arg10];
            int var23 = var22 >>> 16;
            int var24 = var22 & 0xFFFF;
            class424 var25 = arg2.method1954(var23, -123);
            if (var25 != null) {
                var15 |= var25.method2513(var24, 3553);
                var14 |= var25.method2510(-1488416952, var24);
                var17 |= var25.method2511(255, var24);
                var16 |= arg9.field646;
            }
            if ((arg9.field660 || class310.field4004) && arg5 != -1 && arg5 < arg9.field640.length) {
                int var26 = arg9.field640[arg5];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class424 var29 = var23 == var27 ? var25 : arg2.method1954(var27, -104);
                if (var29 != null) {
                    var15 |= var29.method2513(var28, 3553);
                    var14 |= var29.method2510(arg8 - 1488416952, var28);
                    var17 |= var29.method2511(255, var28);
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
        class11 var30 = class324.field4156;
        class507 var31;
        synchronized (class324.field4156) {
            var31 = (class507) class324.field4156.method78(this.field4395, (byte) -93);
        }
        if (var31 == null || arg6.method880(var31.method475(), var13) != 0) {
            if (var31 != null) {
                var13 = arg6.method885(var13, var31.method475());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field4385[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((var35 & Integer.MIN_VALUE) != 0 && !arg11.method2319((byte) -121, var35 & 0x3FFFFFFF).method2416(arg8)) {
                        var33 = true;
                    }
                } else if (!arg4.method111(var35 & 0x3FFFFFFF, 43).method2972((byte) 97, this.field4386)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class420[] var36 = new class420[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field4385[var38];
                if ((var39 & 0x40000000) != 0) {
                    class420 var41 = arg4.method111(var39 & 0x3FFFFFFF, 80).method2979((byte) 118, this.field4386);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                } else if ((var39 & Integer.MIN_VALUE) != 0) {
                    class420 var40 = arg11.method2319((byte) -109, var39 & 0x3FFFFFFF).method2412(-67);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                }
            }
            class420 var42 = new class420(var36, var37);
            int var43 = var13 | 0x4000;
            var31 = arg6.method888(var42, var43, class375.field4873, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                if (this.field4400[var44] < class331.field4252[var44].length) {
                    var31.method478(class352.field4501[var44], class331.field4252[var44][this.field4400[var44]]);
                }
                if (this.field4400[var44] < class133.field1814[var44].length) {
                    var31.method478(class233.field3027[var44], class133.field1814[var44][this.field4400[var44]]);
                }
            }
            var31.method517(var13);
            class11 var45 = class324.field4156;
            synchronized (class324.field4156) {
                class324.field4156.method88(this.field4395, 117, var31);
            }
        }
        if (arg9 == null) {
            return var31;
        } else {
            var31.method510((byte) 4, var13, true);
            return arg9.method285(arg10, -80, arg3, arg0, var31, arg5);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BIIII)V", line = 971)
    public static final void method2029(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class65.field827 = arg2;
        if (arg0 != 4) {
            method2025((byte) -38);
        }
        class418.field5559 = arg4;
        field4390++;
        class456.field6365 = arg1;
        class281.field3589 = arg3;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)V", line = 985)
    public final void method2030(int arg0, int arg1, int arg2) {
        field4388++;
        this.field4400[arg0] = arg2;
        this.method2031(-113);
        if (arg1 >= -18) {
            this.method2031(43);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V", line = 997)
    private final void method2031(int arg0) {
        field4383++;
        this.field4395 = -1L;
        long[] var2 = class180.field2345;
        this.field4395 = var2[(int) (((long) (this.field4389 >> 8) ^ this.field4395) & 0xFFL)] ^ this.field4395 >>> 8;
        this.field4395 = var2[(int) (((long) this.field4389 ^ this.field4395) & 0xFFL)] ^ this.field4395 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field4395 = this.field4395 >>> 8 ^ var2[(int) (((long) (this.field4385[var3] >> 24) ^ this.field4395) & 0xFFL)];
            this.field4395 = this.field4395 >>> 8 ^ var2[(int) ((this.field4395 ^ (long) (this.field4385[var3] >> 16)) & 0xFFL)];
            this.field4395 = var2[(int) (((long) (this.field4385[var3] >> 8) ^ this.field4395) & 0xFFL)] ^ this.field4395 >>> 8;
            this.field4395 = this.field4395 >>> 8 ^ var2[(int) (((long) this.field4385[var3] ^ this.field4395) & 0xFFL)];
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field4395 = var2[(int) (((long) this.field4400[var4] ^ this.field4395) & 0xFFL)] ^ this.field4395 >>> 8;
        }
        if (arg0 >= -30) {
            this.field4384 = null;
        }
        this.field4395 = var2[(int) (((long) (this.field4386 ? 1 : 0) ^ this.field4395) & 0xFFL)] ^ this.field4395 >>> 8;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILii;II)V", line = 1042)
    public final void method2032(int arg0, class389 arg1, int arg2, int arg3) {
        field4387++;
        int var5 = class238.field3094[arg3];
        if (this.field4385[var5] != 0 && arg1.method2319((byte) -117, arg0) != null) {
            int var6 = 80 / ((-arg2 - 43) / 41);
            this.field4385[var5] = class31.method213(arg0, Integer.MIN_VALUE);
            this.method2031(-105);
        }
    }
}
