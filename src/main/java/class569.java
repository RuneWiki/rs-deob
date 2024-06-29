import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class569 {

    @OriginalMember(owner = "client!jaa", name = "i", descriptor = "I")
    public int field8324 = -1;

    @OriginalMember(owner = "client!jaa", name = "j", descriptor = "Lwo;")
    public static class690 field8325 = new class690(74, -2);

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "I")
    public static int field8316;

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "I")
    public static int field8317;

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "I")
    public static int field8319;

    @OriginalMember(owner = "client!jaa", name = "f", descriptor = "I")
    public static int field8321;

    @OriginalMember(owner = "client!jaa", name = "g", descriptor = "I")
    public static int field8322;

    @OriginalMember(owner = "client!jaa", name = "h", descriptor = "I")
    public static int field8323;

    @OriginalMember(owner = "client!jaa", name = "k", descriptor = "I")
    public static int field8326;

    @OriginalMember(owner = "client!jaa", name = "l", descriptor = "I")
    public static int field8327;

    @OriginalMember(owner = "client!jaa", name = "n", descriptor = "I")
    public static int field8329;

    @OriginalMember(owner = "client!jaa", name = "q", descriptor = "I")
    public static int field8332;

    @OriginalMember(owner = "client!jaa", name = "r", descriptor = "I")
    private int field8333;

    @OriginalMember(owner = "client!jaa", name = "s", descriptor = "I")
    public static int field8334;

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "J")
    private long field8320;

    @OriginalMember(owner = "client!jaa", name = "p", descriptor = "J")
    private long field8331;

    @OriginalMember(owner = "client!jaa", name = "o", descriptor = "Z")
    public boolean field8330;

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "[I")
    private int[] field8318;

    @OriginalMember(owner = "client!jaa", name = "m", descriptor = "[I")
    public int[] field8328;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)V")
    private final void method3329(int arg0) {
        field8334++;
        long[] var2 = class529.field7725;
        this.field8320 = -1L;
        this.field8320 = var2[(int) (((long) (this.field8333 >> 8) ^ this.field8320) & 0xFFL)] ^ this.field8320 >>> 8;
        this.field8320 = var2[(int) ((this.field8320 ^ (long) this.field8333) & 0xFFL)] ^ this.field8320 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field8320 = this.field8320 >>> 8 ^ var2[(int) ((this.field8320 ^ (long) (this.field8318[var3] >> 24)) & 0xFFL)];
            this.field8320 = this.field8320 >>> 8 ^ var2[(int) (((long) (this.field8318[var3] >> 16) ^ this.field8320) & 0xFFL)];
            this.field8320 = this.field8320 >>> 8 ^ var2[(int) (((long) (this.field8318[var3] >> 8) ^ this.field8320) & 0xFFL)];
            this.field8320 = var2[(int) ((this.field8320 ^ (long) this.field8318[var3]) & 0xFFL)] ^ this.field8320 >>> 8;
        }
        if (arg0 != -25413) {
            this.method3330(null, null, null, null, (byte) 112, -20, -6, null, -52, null, -102, null);
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field8320 = var2[(int) ((this.field8320 ^ (long) this.field8328[var4]) & 0xFFL)] ^ this.field8320 >>> 8;
        }
        this.field8320 = this.field8320 >>> 8 ^ var2[(int) ((this.field8320 ^ (long) (this.field8330 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lbfa;Lr;Lri;Lwt;BIILrg;ILqk;ILcf;)Lda;")
    public final class55 method3330(class338 arg0, class165 arg1, class95 arg2, class282 arg3, byte arg4, int arg5, int arg6, class594 arg7, int arg8, class16 arg9, int arg10, class559 arg11) {
        field8323++;
        if (this.field8324 != -1) {
            return arg0.method1949(126, this.field8324).method1885(arg11, arg1, arg10, arg5, arg8, arg6, arg2, arg3, false);
        }
        int var13 = arg8;
        if (arg3 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            var13 = arg8 | 0x20;
            int var22 = arg3.field3827[arg10];
            int var23 = var22 >>> 16;
            class612 var24 = arg11.method3270(13161, var23);
            int var25 = var22 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method3510(1, var25);
                var14 |= var24.method3509((byte) -23, var25);
                var17 |= var24.method3506((byte) 103, var25);
                var16 |= arg3.field3830;
            }
            if ((arg3.field3816 || class331.field4406) && arg6 != -1 && arg6 < arg3.field3827.length) {
                int var26 = arg3.field3827[arg6];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class612 var29 = var23 == var27 ? var24 : arg11.method3270(13161, var27);
                if (var29 != null) {
                    var15 |= var29.method3510(1, var28);
                    var14 |= var29.method3509((byte) -62, var28);
                    var17 |= var29.method3506((byte) 97, var28);
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
        class472 var30 = class277.field3783;
        class55 var31;
        synchronized (class277.field3783) {
            var31 = (class55) class277.field3783.method2766(-124, this.field8320);
        }
        if (var31 == null || arg1.method306(var31.method118(), var13) != 0) {
            if (var31 != null) {
                var13 = arg1.method271(var13, var31.method118());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field8318[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var35) != 0 && !arg7.method3443(var35 & 0x3FFFFFFF, -124).method1615((byte) 119)) {
                        var33 = true;
                    }
                } else if (!arg9.method178(false, var35 & 0x3FFFFFFF).method1461(this.field8330, -79)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class173[] var36 = new class173[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field8318[var38];
                if ((var39 & 0x40000000) != 0) {
                    class173 var40 = arg9.method178(false, var39 & 0x3FFFFFFF).method1452(true, this.field8330);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                } else if ((var39 & Integer.MIN_VALUE) != 0) {
                    class173 var41 = arg7.method3443(var39 & 0x3FFFFFFF, -118).method1612(-52);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                }
            }
            class173 var42 = new class173(var36, var37);
            int var43 = var13 | 0x4000;
            var31 = arg1.method274(var42, var43, class100.field1341, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                for (int var45 = 0; var45 < class422.field6004.length; var45++) {
                    if (this.field8328[var44] < class422.field6004[var45][var44].length) {
                        var31.method87(class499.field6975[var45][var44], class422.field6004[var45][var44][this.field8328[var44]]);
                    }
                }
            }
            var31.method98(var13);
            class472 var46 = class277.field3783;
            synchronized (class277.field3783) {
                class277.field3783.method2772(var31, true, this.field8320);
            }
        }
        if (arg3 == null) {
            return var31;
        } else {
            var31.method97((byte) 4, var13, true);
            class55 var48 = arg3.method1692(arg8, var31, arg5, false, arg10, arg6);
            return arg4 >= -18 ? null : var48;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "([III[IIZ)V")
    public final void method3331(int[] arg0, int arg1, int arg2, int[] arg3, int arg4, boolean arg5) {
        field8321++;
        if (arg2 != -2506) {
            return;
        }
        this.field8330 = arg5;
        if (this.field8333 != arg4) {
            this.field8333 = arg4;
        }
        this.field8318 = arg3;
        this.field8324 = arg1;
        this.field8328 = arg0;
        this.method3329(-25413);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(BZ)V")
    public final void method3332(byte arg0, boolean arg1) {
        int var3 = -74 % ((-arg0 - 59) / 56);
        this.field8330 = arg1;
        field8322++;
        this.method3329(-25413);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IILwt;[IIIIZLjr;Lcf;ILwt;ILbfa;ILr;ILqk;Lri;Lrg;[Lgw;)Lda;")
    public final class55 method3333(int arg0, int arg1, class282 arg2, int[] arg3, int arg4, int arg5, int arg6, boolean arg7, class94 arg8, class559 arg9, int arg10, class282 arg11, int arg12, class338 arg13, int arg14, class165 arg15, int arg16, class16 arg17, class95 arg18, class594 arg19, class153[] arg20) {
        field8326++;
        if (this.field8324 != -1) {
            return arg13.method1949(-108, this.field8324).method1887(arg1, arg4, arg16, arg15, arg11, arg5, true, arg6, arg0, arg10, arg9, arg8, arg2, arg12, arg20, arg3, arg18);
        }
        int var22 = arg0;
        long var23 = this.field8320;
        int[] var25 = this.field8318;
        if (arg2 != null && (arg2.field3837 >= 0 || arg2.field3834 >= 0)) {
            var25 = new int[12];
            for (int var26 = 0; var26 < 12; var26++) {
                var25[var26] = this.field8318[var26];
            }
            if (arg2.field3837 >= 0) {
                if (arg2.field3837 == 65535) {
                    var23 ^= 0xFFFFFFFF00000000L;
                    var25[5] = 0;
                } else {
                    var25[5] = class242.method1474(arg2.field3837, 1073741824);
                    var23 ^= (long) var25[5] << 32;
                }
            }
            if (arg2.field3834 >= 0) {
                if (arg2.field3834 == 65535) {
                    var23 ^= 0xFFFFFFFFL;
                    var25[3] = 0;
                } else {
                    var25[3] = class242.method1474(1073741824, arg2.field3834);
                    var23 ^= var25[3];
                }
            }
        }
        boolean var27 = false;
        boolean var28 = false;
        boolean var29 = false;
        boolean var30 = arg2 != null || arg11 != null;
        int var31 = arg20 == null ? 0 : arg20.length;
        for (int var32 = 0; var32 < var31; var32++) {
            class58.field895[var32] = null;
            if (arg20[var32] != null) {
                class282 var33 = arg9.method3273(arg20[var32].field1891, 0);
                if (var33.field3827 != null) {
                    class15.field260[var32] = var33;
                    var30 = true;
                    int var34 = arg20[var32].field1886;
                    int var35 = arg20[var32].field1892;
                    int var36 = var33.field3827[var34];
                    class58.field895[var32] = arg9.method3270(13161, var36 >>> 16);
                    int var37 = var36 & 0xFFFF;
                    class627.field8996[var32] = var37;
                    if (class58.field895[var32] != null) {
                        var28 |= class58.field895[var32].method3510(1, var37);
                        var27 |= class58.field895[var32].method3509((byte) 87, var37);
                        var29 |= class58.field895[var32].method3506((byte) -8, var37);
                    }
                    if ((var33.field3816 || class331.field4406) && var35 != -1 && var33.field3827.length > var35) {
                        class467.field6521[var32] = var33.field3840[var34];
                        class309.field4091[var32] = arg20[var32].field1894;
                        int var38 = var33.field3827[var35];
                        class91.field1279[var32] = arg9.method3270(13161, var38 >>> 16);
                        int var39 = var38 & 0xFFFF;
                        class147.field1804[var32] = var39;
                        if (class91.field1279[var32] != null) {
                            var28 |= class91.field1279[var32].method3510(1, var39);
                            var27 |= class91.field1279[var32].method3509((byte) -64, var39);
                            var29 |= class91.field1279[var32].method3506((byte) -48, var39);
                        }
                    } else {
                        class467.field6521[var32] = 0;
                        class309.field4091[var32] = 0;
                        class91.field1279[var32] = null;
                        class147.field1804[var32] = -1;
                    }
                }
            }
        }
        int var40 = -1;
        int var41 = -1;
        int var42 = 0;
        class612 var43 = null;
        class612 var44 = null;
        int var45 = -1;
        int var46 = -126 % ((46 - arg14) / 34);
        int var47 = -1;
        int var48 = 0;
        class612 var49 = null;
        class612 var50 = null;
        if (var30) {
            if (arg2 != null) {
                int var51 = arg2.field3827[arg16];
                int var52 = var51 >>> 16;
                var40 = var51 & 0xFFFF;
                var43 = arg9.method3270(13161, var52);
                if (var43 != null) {
                    var28 |= var43.method3510(1, var40);
                    var27 |= var43.method3509((byte) -87, var40);
                    var29 |= var43.method3506((byte) 122, var40);
                }
                if ((arg2.field3816 || class331.field4406) && arg1 != -1 && arg2.field3827.length > arg1) {
                    var42 = arg2.field3840[arg16];
                    int var53 = arg2.field3827[arg1];
                    int var54 = var53 >>> 16;
                    var44 = var52 == var54 ? var43 : arg9.method3270(13161, var54);
                    var41 = var53 & 0xFFFF;
                    if (var44 != null) {
                        var28 |= var44.method3510(1, var41);
                        var27 |= var44.method3509((byte) -122, var41);
                        var29 |= var44.method3506((byte) -15, var41);
                    }
                }
            }
            var22 = arg0 | 0x20;
            if (arg11 != null) {
                int var55 = arg11.field3827[arg4];
                int var56 = var55 >>> 16;
                var49 = arg9.method3270(13161, var56);
                var45 = var55 & 0xFFFF;
                if (var49 != null) {
                    var28 |= var49.method3510(1, var45);
                    var27 |= var49.method3509((byte) -22, var45);
                    var29 |= var49.method3506((byte) -49, var45);
                }
                if ((arg11.field3816 || class331.field4406) && arg12 != -1 && arg11.field3827.length > arg12) {
                    int var57 = arg11.field3827[arg12];
                    var48 = arg11.field3840[arg4];
                    int var58 = var57 >>> 16;
                    var47 = var57 & 0xFFFF;
                    var50 = var56 == var58 ? var49 : arg9.method3270(13161, var58);
                    if (var50 != null) {
                        var28 |= var50.method3510(1, var47);
                        var27 |= var50.method3509((byte) 88, var47);
                        var29 |= var50.method3506((byte) 109, var47);
                    }
                }
            }
            if (var28) {
                var22 |= 0x80;
            }
            if (var27) {
                var22 |= 0x100;
            }
            if (var29) {
                var22 |= 0x400;
            }
        }
        class472 var59 = class230.field2993;
        class55 var60;
        synchronized (class230.field2993) {
            var60 = (class55) class230.field2993.method2766(-128, var23);
        }
        class573 var61 = null;
        if (this.field8333 != -1) {
            var61 = arg8.method727(this.field8333, 64);
        }
        if (var60 == null || arg15.method306(var60.method118(), var22) != 0) {
            if (var60 != null) {
                var22 = arg15.method271(var22, var60.method118());
            }
            boolean var63 = false;
            int var64 = 0;
            while (true) {
                if (var64 >= 12) {
                    if (var63) {
                        if (this.field8331 != -1L) {
                            class472 var83 = class230.field2993;
                            synchronized (class230.field2993) {
                                var60 = (class55) class230.field2993.method2766(-123, this.field8331);
                            }
                        }
                        if (var60 == null || arg15.method306(var60.method118(), var22) != 0) {
                            return null;
                        }
                    } else {
                        class173[] var66 = new class173[12];
                        for (int var67 = 0; var67 < 12; var67++) {
                            int var68 = var25[var67];
                            if ((var68 & 0x40000000) != 0) {
                                class173 var69 = arg17.method178(false, var68 & 0x3FFFFFFF).method1465(-6, this.field8330);
                                if (var69 != null) {
                                    var66[var67] = var69;
                                }
                            } else if ((var68 & Integer.MIN_VALUE) != 0) {
                                class173 var70 = arg19.method3443(var68 & 0x3FFFFFFF, 119).method1616((byte) -109);
                                if (var70 != null) {
                                    var66[var67] = var70;
                                }
                            }
                        }
                        if (var61 != null && var61.field8397 != null) {
                            for (int var71 = 0; var71 < var61.field8397.length; var71++) {
                                if (var66[var71] != null) {
                                    int var72 = 0;
                                    int var73 = 0;
                                    int var74 = 0;
                                    int var75 = 0;
                                    int var76 = 0;
                                    int var77 = 0;
                                    if (var61.field8397[var71] != null) {
                                        var75 = var61.field8397[var71][3] << 3;
                                        var77 = var61.field8397[var71][5] << 3;
                                        var73 = var61.field8397[var71][1];
                                        var72 = var61.field8397[var71][0];
                                        var76 = var61.field8397[var71][4] << 3;
                                        var74 = var61.field8397[var71][2];
                                    }
                                    if (var75 != 0 || var76 != 0 || var77 != 0) {
                                        var66[var71].method1089(var75, false, var77, var76);
                                    }
                                    if (var72 != 0 || var73 != 0 || var74 != 0) {
                                        var66[var71].method1093(-32, var74, var72, var73);
                                    }
                                }
                            }
                        }
                        int var78 = var22 | 0x4000;
                        class173 var79 = new class173(var66, var66.length);
                        var60 = arg15.method274(var79, var78, class100.field1341, 64, 850);
                        for (int var80 = 0; var80 < 5; var80++) {
                            for (int var81 = 0; var81 < class422.field6004.length; var81++) {
                                if (class422.field6004[var81][var80].length > this.field8328[var80]) {
                                    var60.method87(class499.field6975[var81][var80], class422.field6004[var81][var80][this.field8328[var80]]);
                                }
                            }
                        }
                        if (arg7) {
                            var60.method98(var22);
                            class472 var82 = class230.field2993;
                            synchronized (class230.field2993) {
                                class230.field2993.method2772(var60, true, var23);
                            }
                            this.field8331 = var23;
                        }
                    }
                    break;
                }
                int var65 = var25[var64];
                if ((var65 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var65) != 0 && !arg19.method3443(var65 & 0x3FFFFFFF, 107).method1613(false)) {
                        var63 = true;
                    }
                } else if (!arg17.method178(false, var65 & 0x3FFFFFFF).method1448((byte) -128, this.field8330)) {
                    var63 = true;
                }
                var64++;
            }
        }
        class55 var84 = var60.method97((byte) 4, var22, true);
        boolean var85 = false;
        if (arg3 != null) {
            for (int var86 = 0; var86 < 12; var86++) {
                if (arg3[var86] != -1) {
                    var85 = true;
                }
            }
        }
        if (!var30 && !var85) {
            return var84;
        }
        class394[] var87 = null;
        if (var61 != null) {
            var87 = var61.method3357(arg15, -25204);
        }
        if (var85 && var87 != null) {
            for (int var88 = 0; var88 < 12; var88++) {
                if (var87[var88] != null) {
                    var84.method86(var87[var88], 0x1 << var88, true);
                }
            }
        }
        int var89 = 0;
        int var90 = 1;
        while (var89 < var31) {
            if (class58.field895[var89] != null) {
                var84.method572(3239, class91.field1279[var89], class627.field8996[var89], 0, class309.field4091[var89] - 1, class147.field1804[var89], var90, false, class58.field895[var89], null, class467.field6521[var89]);
            }
            var89++;
            var90 <<= 0x1;
        }
        if (var85) {
            for (int var91 = 0; var91 < 12; var91++) {
                if (arg3[var91] != -1) {
                    int var92 = arg3[var91] - arg6;
                    int var93 = var92 & 0x3FFF;
                    class394 var94 = arg15.method305();
                    var94.method724(var93);
                    var84.method86(var94, 0x1 << var91, false);
                }
            }
        }
        if (var85 && var87 != null) {
            for (int var95 = 0; var95 < 12; var95++) {
                if (var87[var95] != null) {
                    var84.method86(var87[var95], 0x1 << var95, false);
                }
            }
        }
        if (var43 != null && var49 != null) {
            var84.method581(var44, var50, var49, arg2.field3838, var45, var42, var40, arg10 - 1, var43, var47, 128, arg5 - 1, false, var41, var48);
        } else if (var43 != null) {
            var84.method580(false, var41, 0, var40, var43, var42, arg5 - 1, -3651, var44);
        } else if (var49 != null) {
            var84.method580(false, var47, 0, var45, var49, var48, arg10 - 1, -3651, var50);
        }
        for (int var96 = 0; var96 < var31; var96++) {
            class58.field895[var96] = null;
            class91.field1279[var96] = null;
            class15.field260[var96] = null;
        }
        return var84;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(III)V")
    public final void method3334(int arg0, int arg1, int arg2) {
        int var4 = 47 % ((53 - arg1) / 56);
        field8327++;
        this.field8328[arg0] = arg2;
        this.method3329(-25413);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(B)V")
    public static void method3335(byte arg0) {
        if (arg0 != -37) {
            method3335((byte) 92);
        }
        field8325 = null;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lr;IILcf;ILwt;ILrg;IIII)Lda;")
    public final class55 method3336(class165 arg0, int arg1, int arg2, class559 arg3, int arg4, class282 arg5, int arg6, class594 arg7, int arg8, int arg9, int arg10, int arg11) {
        field8316++;
        if (arg1 <= 111) {
            this.field8320 = -100L;
        }
        int var13 = arg11;
        if (arg5 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg5.field3827[arg4];
            var13 = arg11 | 0x20;
            Object var22 = null;
            int var23 = var21 >>> 16;
            class612 var24 = arg3.method3270(13161, var23);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method3510(1, var25);
                var14 |= var24.method3509((byte) 85, var25);
                var17 |= var24.method3506((byte) -36, var25);
                var16 |= arg5.field3830;
            }
            if ((arg5.field3816 || class331.field4406) && arg6 != -1 && arg6 < arg5.field3827.length) {
                int var26 = arg5.field3827[arg6];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class612 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg3.method3270(13161, var28 >>> 16);
                }
                if (var29 != null) {
                    var15 |= var29.method3510(1, var28);
                    var14 |= var29.method3509((byte) 75, var28);
                    var17 |= var29.method3506((byte) 113, var28);
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
        long var30 = (long) arg8 | (long) (arg9 << 16) | (long) arg10 << 32;
        class472 var32 = class277.field3783;
        class55 var33;
        synchronized (class277.field3783) {
            var33 = (class55) class277.field3783.method2766(-123, var30);
        }
        if (var33 == null || arg0.method306(var33.method118(), var13) != 0) {
            if (var33 != null) {
                var13 = arg0.method271(var13, var33.method118());
            }
            class173[] var35 = new class173[3];
            int var36 = 0;
            if (!arg7.method3443(arg8, 110).method1615((byte) -102) || !arg7.method3443(arg9, 118).method1615((byte) 107) || !arg7.method3443(arg10, -61).method1615((byte) -126)) {
                return null;
            }
            class173 var37 = arg7.method3443(arg8, 123).method1612(-75);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class173 var38 = arg7.method3443(arg9, 123).method1612(-105);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class173 var39 = arg7.method3443(arg10, -105).method1612(-105);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class173 var41 = new class173(var35, var36);
            var33 = arg0.method274(var41, var40, class100.field1341, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                for (int var43 = 0; var43 < class422.field6004.length; var43++) {
                    if (this.field8328[var42] < class422.field6004[var43][var42].length) {
                        var33.method87(class499.field6975[var43][var42], class422.field6004[var43][var42][this.field8328[var42]]);
                    }
                }
            }
            var33.method98(var13);
            class472 var44 = class277.field3783;
            synchronized (class277.field3783) {
                class277.field3783.method2772(var33, true, var30);
            }
        }
        if (arg5 == null) {
            return var33;
        } else {
            class55 var45 = var33.method97((byte) 4, var13, true);
            return arg5.method1692(arg11, var45, arg2, false, arg4, arg6);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lqk;IZI)V")
    public final void method3337(class16 arg0, int arg1, boolean arg2, int arg3) {
        field8317++;
        if (!arg2) {
            this.method3329(-59);
        }
        if (arg1 == -1) {
            this.field8318[arg3] = 0;
        } else if (arg0.method178(!arg2, arg1) != null) {
            this.field8318[arg3] = class242.method1474(arg1, 1073741824);
            this.method3329(-25413);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IILrg;I)V")
    public final void method3338(int arg0, int arg1, class594 arg2, int arg3) {
        field8319++;
        if (arg1 != -6822) {
            return;
        }
        int var5 = class119.field1525[arg0];
        if (arg2.method3443(arg3, arg1 ^ 0x1ABC) != null) {
            this.field8318[var5] = class242.method1474(arg3, Integer.MIN_VALUE);
            this.method3329(-25413);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method3339(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field8325 = null;
        }
        field8332++;
        return false;
    }
}
